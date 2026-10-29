# Sandbox transcript (2026-10-29T16:01:58Z, 0c22f4c)

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
  "correlation_id": "54809f0c-d5c4-475e-bc64-77d8253e80bc"
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
  "session_id": "ad15c69f-6e59-4421-a971-de6066515987",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2MjYsImlhdCI6MTc5MzI4OTcyNiwianRpIjoiNDBmYWFjYzctZGI5Ni00NzljLThjODYtNmQ2YzhiMTljZTI3Iiwic2lkIjoiYWQxNWM2OWYtNmU1OS00NDIxLWE5NzEtZGU2MDY2NTE1OTg3In0.0ER3QErxuS__9WBvLjlDkFB5QO2pkrXUyHHCtHy6PsE",
  "access_expires_at": "2026-10-29T16:17:06.080121431Z",
  "refresh_token": "W0keduzZT-0xVNlIcc3s1yRS2S0laNpDqjSqtrN6rAs",
  "refresh_expires_at": "2026-10-30T04:02:06.077447981Z",
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
  "session_id": "0c7e9533-3e25-4cc7-8a1a-2ede1448f3f4",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2MjgsImlhdCI6MTc5MzI4OTcyOCwianRpIjoiYjM3ODNmNDktNTQzNC00MDRkLTk2YzgtZjRiMGFkZGQ0OGJkIiwic2lkIjoiMGM3ZTk1MzMtM2UyNS00Y2M3LThhMWEtMmVkZTE0NDhmM2Y0In0.VNCPO9M9tVWgLeK41z_pUXelBL2ouZYPPqXK2unGbGs",
  "access_expires_at": "2026-10-29T16:17:08.023241212Z",
  "refresh_token": "p1qZBdm_J9Zlih81UqPLd8j5X6u1F5CFthxO2QsZPTw",
  "refresh_expires_at": "2026-10-30T04:02:08.021955169Z",
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
  "device_ref": "sandbox-429"
}
```

```json
{
  "challenge_id": "5f2d0844-df2a-44a1-ba31-0f04455c70e6",
  "expires_at": "2026-10-29T16:07:08.625184765Z",
  "resend_available_at": "2026-10-29T16:02:09.625184765Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "996797",
  "sent_at": "2026-10-29T16:02:08.639748473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f2d0844-df2a-44a1-ba31-0f04455c70e6",
  "code": "996797",
  "device_ref": "sandbox-429"
}
```

```json
{
  "session_id": "e77a0689-bc73-4028-8468-8fbbefb102e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDYyOCwiaWF0IjoxNzkzMjg5NzI4LCJqdGkiOiIwNmIzY2ZkNi0yOTZlLTRkNDEtYWEwZS1iMzZjZDhlNjZkMDEiLCJzaWQiOiJlNzdhMDY4OS1iYzczLTQwMjgtODQ2OC04ZmJiZWZiMTAyZTEifQ.Nqn3SFotYG_79p1lFrZEAA0blvinXe30o9iXHRaPmfw",
  "access_expires_at": "2026-10-29T16:17:08.980086182Z",
  "refresh_token": "cNK4807pUrWTHzGi-h-NehPBjp7wVtIKZPVBoV1rxT8",
  "refresh_expires_at": "2026-11-28T16:02:08.978771667Z",
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
  "command_id": "530cff94-f683-4f3e-aaa7-d0f48aee950e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:09Z",
    "sequence": 1793289729531
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "09d2377c-c80a-4f9f-a8b7-2bc6efa19cfb",
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
  "last_heartbeat_at": "2026-10-29T16:02:09.678111Z",
  "last_location_at": "2026-10-29T16:02:09.678111Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635120546",
  "device_ref": "sandbox-13526"
}
```

```json
{
  "challenge_id": "776e1bdd-4f43-4b96-bf89-7c6729e3d1a4",
  "expires_at": "2026-10-29T16:07:09.964374998Z",
  "resend_available_at": "2026-10-29T16:02:10.964374998Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635120546` → **200**

```json
{
  "phone": "+380635120546",
  "audience": "CLIENT",
  "code": "469658",
  "sent_at": "2026-10-29T16:02:09.97007872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "776e1bdd-4f43-4b96-bf89-7c6729e3d1a4",
  "code": "469658",
  "device_ref": "sandbox-13526"
}
```

```json
{
  "session_id": "defeea89-94ac-4ba4-bfb4-1d48173ba934",
  "subject": {
    "type": "CLIENT",
    "id": "1bb296c7-f3c0-4ef0-bb56-8245f260c9d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmIyOTZjNy1mM2MwLTRlZjAtYmI1Ni04MjQ1ZjI2MGM5ZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNjMwLCJpYXQiOjE3OTMyODk3MzAsImp0aSI6ImJjOTkzMmFhLWY5YjAtNDliNS05Y2EyLWM0YzYyYzA1ZWFhNyIsInNpZCI6ImRlZmVlYTg5LTk0YWMtNGJhNC1iZmI0LTFkNDgxNzNiYTkzNCJ9.AkqKS_nre2LQZZT--1QhE3L5XzAtLcXFS1agQs3yc6E",
  "access_expires_at": "2026-10-29T16:17:10.276106051Z",
  "refresh_token": "adbLcCAAEC6-fHBaXlFyHNTkApbFswPfVMH1UQGJ5fE",
  "refresh_expires_at": "2026-11-28T16:02:10.275004496Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cb2d717a-cae1-4e8e-a156-6b44c73f335b",
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
  "id": "3c1ae478-ea70-433a-997d-8329b7b34327",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:07:10.592288Z",
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
  "command_id": "f9938382-5e84-40b3-b65d-c3d1c7112a0f",
  "quote_id": "3c1ae478-ea70-433a-997d-8329b7b34327",
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
  "id": "8bfa15c7-4609-41af-8f7d-008d1022365a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1bb296c7-f3c0-4ef0-bb56-8245f260c9d5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:02:10.962701Z",
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
    "id": "81ca6676-1f4c-4da0-ae51-b7605d380cb8",
    "order_id": "8bfa15c7-4609-41af-8f7d-008d1022365a",
    "expires_at": "2026-10-29T16:02:25.975674Z",
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

`POST /api/driver/v1/offers/81ca6676-1f4c-4da0-ae51-b7605d380cb8/accept` → **200**

```json
{
  "command_id": "1576cf3a-787a-4bec-95ce-c6373714e520"
}
```

```json
{
  "id": "643a03b7-9702-4c49-bb1d-c0b09bac349b",
  "order_id": "8bfa15c7-4609-41af-8f7d-008d1022365a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f187c85c-67ed-48b1-8b59-4f1361202017",
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
  "command_id": "3a08cb0a-3b67-461d-ba50-be920a85bdfa",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T16:02:12.207896642Z"
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
  "id": "f187c85c-67ed-48b1-8b59-4f1361202017",
  "order_id": "8bfa15c7-4609-41af-8f7d-008d1022365a",
  "assignment_id": "643a03b7-9702-4c49-bb1d-c0b09bac349b",
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

`POST /api/driver/v1/work-sessions/09d2377c-c80a-4f9f-a8b7-2bc6efa19cfb/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:13Z",
    "sequence": 1793289733862
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "09d2377c-c80a-4f9f-a8b7-2bc6efa19cfb",
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
  "last_heartbeat_at": "2026-10-29T16:02:13.111425Z",
  "last_location_at": "2026-10-29T16:02:13.111425Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f187c85c-67ed-48b1-8b59-4f1361202017/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "38de562c-3ad5-43a0-9020-5b525953a875",
  "expected_version": 0
}
```

```json
{
  "id": "f187c85c-67ed-48b1-8b59-4f1361202017",
  "order_id": "8bfa15c7-4609-41af-8f7d-008d1022365a",
  "assignment_id": "643a03b7-9702-4c49-bb1d-c0b09bac349b",
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
  "arrived_at": "2026-10-29T16:02:13.401883Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f187c85c-67ed-48b1-8b59-4f1361202017/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "15ce3143-ed85-4084-aa2c-a189b2fdf8d1",
  "expected_version": 1
}
```

```json
{
  "id": "f187c85c-67ed-48b1-8b59-4f1361202017",
  "order_id": "8bfa15c7-4609-41af-8f7d-008d1022365a",
  "assignment_id": "643a03b7-9702-4c49-bb1d-c0b09bac349b",
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
  "arrived_at": "2026-10-29T16:02:13.401883Z",
  "started_at": "2026-10-29T16:02:13.696968Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f187c85c-67ed-48b1-8b59-4f1361202017/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "25de0aa3-e860-4b78-b14c-5161d60b6bc2",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:02:13Z",
  "cash_received": true
}
```

```json
{
  "id": "f187c85c-67ed-48b1-8b59-4f1361202017",
  "order_id": "8bfa15c7-4609-41af-8f7d-008d1022365a",
  "assignment_id": "643a03b7-9702-4c49-bb1d-c0b09bac349b",
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
  "arrived_at": "2026-10-29T16:02:13.401883Z",
  "started_at": "2026-10-29T16:02:13.696968Z",
  "completed_at": "2026-10-29T16:02:14.014783Z",
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
  "session_id": "09d2377c-c80a-4f9f-a8b7-2bc6efa19cfb",
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
  "last_heartbeat_at": "2026-10-29T16:02:13.111425Z",
  "last_location_at": "2026-10-29T16:02:13.111425Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/09d2377c-c80a-4f9f-a8b7-2bc6efa19cfb/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "62d9ba00-cdd7-4eab-9f4e-cf7a00ed6720",
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
  "command_id": "452371f9-e055-45c0-9b95-91e1bab9f48c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:14Z",
    "sequence": 1793289734886
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
  "correlation_id": "40045f18-000c-40c8-9373-20b93c936cc2",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "b415deb3-96ad-443a-83dc-928e37e3cb5c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:15Z",
    "sequence": 1793289735177
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "94f6f164-1fb4-437e-ae32-0f92ed572e97",
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
  "last_heartbeat_at": "2026-10-29T16:02:15.199744Z",
  "last_location_at": "2026-10-29T16:02:15.199744Z",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T16:02:12.207897Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "5e38d163-88a5-476c-ad2a-7cc9bd6e3faa",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T16:02:15.795159763Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "94f6f164-1fb4-437e-ae32-0f92ed572e97",
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
  "last_heartbeat_at": "2026-10-29T16:02:15.199744Z",
  "last_location_at": "2026-10-29T16:02:15.199744Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/94f6f164-1fb4-437e-ae32-0f92ed572e97/close` → **200**

```json
{
  "command_id": "06e730c2-dc25-4d67-9049-ab18d71e0e86",
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
  "session_id": "a912426f-29b5-4f4d-ac44-43bb583c441e",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2MzcsImlhdCI6MTc5MzI4OTczNywianRpIjoiZDU0MjJkNjgtMGRhMi00NGU2LTgyMGYtMzZkOTA1ZWIwNGQ4Iiwic2lkIjoiYTkxMjQyNmYtMjliNS00ZjRkLWFjNDQtNDNiYjU4M2M0NDFlIn0.oRoHN3GfX_7Pq0KQJEYP_dhMM4VKYjk8l4JlmLgM-10",
  "access_expires_at": "2026-10-29T16:17:17.000584523Z",
  "refresh_token": "z1L_imiHe2_u0Aj8GAesJ0iDLWe67bBSzaxUxfbFqMw",
  "refresh_expires_at": "2026-10-30T04:02:16.999689799Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "07b57089-44e2-4348-b7c1-b185aa3ace22",
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
  "id": "de8786f7-3a7b-4270-8bd6-9ab4758d21db",
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
  "created_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "created_at": "2026-10-29T16:02:17.281661Z",
  "updated_at": "2026-10-29T16:02:17.281661Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632645172",
  "device_ref": "sandbox-8479"
}
```

```json
{
  "challenge_id": "8cc2fbf6-3071-4d44-a8f1-4355471728d4",
  "expires_at": "2026-10-29T16:07:17.573467856Z",
  "resend_available_at": "2026-10-29T16:02:18.573467856Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632645172` → **200**

```json
{
  "phone": "+380632645172",
  "audience": "CLIENT",
  "code": "693253",
  "sent_at": "2026-10-29T16:02:17.581984203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cc2fbf6-3071-4d44-a8f1-4355471728d4",
  "code": "693253",
  "device_ref": "sandbox-8479"
}
```

```json
{
  "session_id": "3b3d6be4-c7ac-45e3-9786-3be2e2e3dbb3",
  "subject": {
    "type": "CLIENT",
    "id": "98c5026f-0cfa-448f-909d-10b49e95db08"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OGM1MDI2Zi0wY2ZhLTQ0OGYtOTA5ZC0xMGI0OWU5NWRiMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNjM4LCJpYXQiOjE3OTMyODk3MzgsImp0aSI6ImYxYzMwZmZhLWE4NmItNGY2YS1hNWYwLWZiOGNiMDM0OWQ0MCIsInNpZCI6IjNiM2Q2YmU0LWM3YWMtNDVlMy05Nzg2LTNiZTJlMmUzZGJiMyJ9.9DvfDPj_vgBdLOpCVfwvZuo9qDBlmGAShM51LeYLZqg",
  "access_expires_at": "2026-10-29T16:17:18.015057513Z",
  "refresh_token": "cInqLF67WWT120fQPnjz_1EXSXTHlyaC8alym8uq3pg",
  "refresh_expires_at": "2026-11-28T16:02:18.014166187Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632645172` → **200**

```json
{
  "client_id": "98c5026f-0cfa-448f-909d-10b49e95db08"
}
```

`POST /api/admin/v1/rider-wallets/98c5026f-0cfa-448f-909d-10b49e95db08/top-ups` → **201**

```json
{
  "command_id": "e9f2180d-d965-4b23-9a2c-b73c6e8e1b96",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "98c5026f-0cfa-448f-909d-10b49e95db08",
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
      "id": "78a54621-13ae-4066-87e0-1bddcbd1500a",
      "at": "2026-10-29T16:02:18.707264Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cfc4fba1-b92f-44e2-a917-5d99c581930d",
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
  "id": "6b663804-2da1-47ad-b6ac-6f936da6932c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:07:19.011742Z",
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
      "id": "de8786f7-3a7b-4270-8bd6-9ab4758d21db",
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
  "device_ref": "sandbox-2841"
}
```

```json
{
  "challenge_id": "90986824-396d-42c4-9332-8ca2711f1464",
  "expires_at": "2026-10-29T16:07:19.29790427Z",
  "resend_available_at": "2026-10-29T16:02:20.29790427Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "260376",
  "sent_at": "2026-10-29T16:02:19.302408671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90986824-396d-42c4-9332-8ca2711f1464",
  "code": "260376",
  "device_ref": "sandbox-2841"
}
```

```json
{
  "session_id": "057e9b56-cdcc-4908-9a6e-c7a16ecc8999",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDYzOSwiaWF0IjoxNzkzMjg5NzM5LCJqdGkiOiIxYTRhNWJhMS05OWMwLTRlZmQtODE4MC1kNjQzM2M1ZmRhZGIiLCJzaWQiOiIwNTdlOWI1Ni1jZGNjLTQ5MDgtOWE2ZS1jN2ExNmVjYzg5OTkifQ.X4LzuSGaUabga0PzikB9FJzbYX2m1VStQ3Hdd40q9qg",
  "access_expires_at": "2026-10-29T16:17:19.598226554Z",
  "refresh_token": "xKrvanA-wo9Hp0LfMtWeDj2eQ6zJxFkVhTbxleXYoZA",
  "refresh_expires_at": "2026-11-28T16:02:19.597461112Z",
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
  "command_id": "8ee913aa-9e85-4a89-8eae-31f06455a3a9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:20Z",
    "sequence": 1793289740131
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2684becc-a8c8-41ff-8850-55ea3940d407",
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
  "last_heartbeat_at": "2026-10-29T16:02:20.153537Z",
  "last_location_at": "2026-10-29T16:02:20.153537Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "725f0b5c-5e83-494d-a4c7-551fc149f741",
  "quote_id": "6b663804-2da1-47ad-b6ac-6f936da6932c",
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
  "id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "98c5026f-0cfa-448f-909d-10b49e95db08",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:02:20.450507Z",
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
  "client_id": "98c5026f-0cfa-448f-909d-10b49e95db08",
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
      "id": "78a54621-13ae-4066-87e0-1bddcbd1500a",
      "at": "2026-10-29T16:02:18.707264Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
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
    "id": "d39f8565-d901-469d-ba5c-e97acbe3b4fd",
    "order_id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8",
    "expires_at": "2026-10-29T16:02:35.45915Z",
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

`POST /api/driver/v1/offers/d39f8565-d901-469d-ba5c-e97acbe3b4fd/accept` → **200**

```json
{
  "command_id": "683c16ec-ad2b-49b8-be13-7752124fd707"
}
```

```json
{
  "id": "22962ffa-0686-4452-81ca-264f937c6b00",
  "order_id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7655822e-db2b-4a5f-9d32-422231d9f3c4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7655822e-db2b-4a5f-9d32-422231d9f3c4",
  "order_id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8",
  "assignment_id": "22962ffa-0686-4452-81ca-264f937c6b00",
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

`POST /api/driver/v1/work-sessions/2684becc-a8c8-41ff-8850-55ea3940d407/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:21Z",
    "sequence": 1793289741836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2684becc-a8c8-41ff-8850-55ea3940d407",
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
  "last_heartbeat_at": "2026-10-29T16:02:21.857785Z",
  "last_location_at": "2026-10-29T16:02:21.857785Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7655822e-db2b-4a5f-9d32-422231d9f3c4/arrive` → **200**

```json
{
  "command_id": "cc7be2fe-780e-4da3-b1b6-b72e26ffe391",
  "expected_version": 0
}
```

```json
{
  "id": "7655822e-db2b-4a5f-9d32-422231d9f3c4",
  "order_id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8",
  "assignment_id": "22962ffa-0686-4452-81ca-264f937c6b00",
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
  "arrived_at": "2026-10-29T16:02:22.135483Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7655822e-db2b-4a5f-9d32-422231d9f3c4/start` → **200**

```json
{
  "command_id": "52645ebf-96b8-409f-8df5-a53dd5529ae4",
  "expected_version": 1
}
```

```json
{
  "id": "7655822e-db2b-4a5f-9d32-422231d9f3c4",
  "order_id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8",
  "assignment_id": "22962ffa-0686-4452-81ca-264f937c6b00",
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
  "arrived_at": "2026-10-29T16:02:22.135483Z",
  "started_at": "2026-10-29T16:02:22.426583Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/7655822e-db2b-4a5f-9d32-422231d9f3c4/complete` → **200**

```json
{
  "command_id": "8fe14c7b-9eec-4d01-a19b-d01c4ae28bf6",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:02:22Z",
  "cash_received": true
}
```

```json
{
  "id": "7655822e-db2b-4a5f-9d32-422231d9f3c4",
  "order_id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8",
  "assignment_id": "22962ffa-0686-4452-81ca-264f937c6b00",
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
  "arrived_at": "2026-10-29T16:02:22.135483Z",
  "started_at": "2026-10-29T16:02:22.426583Z",
  "completed_at": "2026-10-29T16:02:22.755193Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "98c5026f-0cfa-448f-909d-10b49e95db08",
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
      "id": "cdd8e9e6-dcc4-449a-a572-7080a884cca6",
      "at": "2026-10-29T16:02:22.920982Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8"
    },
    {
      "id": "78a54621-13ae-4066-87e0-1bddcbd1500a",
      "at": "2026-10-29T16:02:18.707264Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/de8786f7-3a7b-4270-8bd6-9ab4758d21db/archive` → **200**

```json
{
  "command_id": "90df2e1e-2fd0-4c66-b72c-d13a32b792b0",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "de8786f7-3a7b-4270-8bd6-9ab4758d21db",
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
  "created_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "created_at": "2026-10-29T16:02:17.281661Z",
  "updated_at": "2026-10-29T16:02:26.361051Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2684becc-a8c8-41ff-8850-55ea3940d407",
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
  "last_heartbeat_at": "2026-10-29T16:02:21.857785Z",
  "last_location_at": "2026-10-29T16:02:21.857785Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2684becc-a8c8-41ff-8850-55ea3940d407/close` → **200**

```json
{
  "command_id": "c31d6ea9-2667-4fd6-bc40-21678596d82b",
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

Done: order 078b4f8f-1ee9-4770-b4f1-02c32dedfcf8.

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
  "session_id": "ef1f75a6-a0d7-4ab0-9465-1d1803a917a0",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2NDcsImlhdCI6MTc5MzI4OTc0NywianRpIjoiNzliY2Q1ODktOGIyNi00NzBlLWJmMTUtZDM5ZDJiZTgwOTg5Iiwic2lkIjoiZWYxZjc1YTYtYTBkNy00YWIwLTk0NjUtMWQxODAzYTkxN2EwIn0.7UqjmWu7OkQJ72DtH1sNTBbulrYt5fOg5vblZfM0pjA",
  "access_expires_at": "2026-10-29T16:17:27.532110673Z",
  "refresh_token": "gdF_8HdxnMTorku9B-DI2JB03DuU-DLe5l1nP8RGRVI",
  "refresh_expires_at": "2026-10-30T04:02:27.531402566Z",
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
  "command_id": "b090670e-0bd1-41eb-abee-d81e4d6214c9",
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
  "session_id": "51b3d2ba-6229-4274-b6e7-fe3db1399e05",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2NDgsImlhdCI6MTc5MzI4OTc0OCwianRpIjoiOGQ0MDc5OGMtNjc4ZC00ZmU5LTllZmYtOTUzODU2OTQ5NGRmIiwic2lkIjoiNTFiM2QyYmEtNjIyOS00Mjc0LWI2ZTctZmUzZGIxMzk5ZTA1In0.49GKD9WkF2m513mCyYDPcljr2nawjNjcnScq82Z6krU",
  "access_expires_at": "2026-10-29T16:17:28.679459857Z",
  "refresh_token": "fveDD-kwbNelz0lCVdwn2oNeYf7hEqlXj_k3_w59eqY",
  "refresh_expires_at": "2026-10-30T04:02:28.678613458Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.290065352",
    "linkedid": "1730052700.290065352",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672432904"
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
    "id": "1730052700.290065352",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "788ad8e8-e1a3-4d88-950c-0d732889323a",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T16:02:28.950793Z",
      "answered_at": null,
      "ended_at": "2026-10-29T16:02:28.975423Z",
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
    "id": "1730052600.196327937",
    "linkedid": "1730052600.196327937",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672432904"
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
      "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T16:02:29.294312Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/aec0fd26-765c-4b52-be54-cdc3e8fb80d0/answer` → **200**

```json
{
  "command_id": "2dddf99b-333f-40a2-92fc-bd24261cdce3"
}
```

```json
{
  "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672432904",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "order_ids": [],
  "started_at": "2026-10-29T16:02:29.294312Z",
  "answered_at": "2026-10-29T16:02:29.600951Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.196327937",
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
    "id": "1730052600.196327937",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [],
      "started_at": "2026-10-29T16:02:29.294312Z",
      "answered_at": "2026-10-29T16:02:29.600951Z",
      "ended_at": "2026-10-29T16:02:29.902859Z",
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
      "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [],
      "started_at": "2026-10-29T16:02:29.294312Z",
      "answered_at": "2026-10-29T16:02:29.600951Z",
      "ended_at": "2026-10-29T16:02:29.902859Z",
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
      "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [],
      "started_at": "2026-10-29T16:02:29.294312Z",
      "answered_at": "2026-10-29T16:02:29.600951Z",
      "ended_at": "2026-10-29T16:02:29.902859Z",
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
      "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [],
      "started_at": "2026-10-29T16:02:29.294312Z",
      "answered_at": "2026-10-29T16:02:29.600951Z",
      "ended_at": "2026-10-29T16:02:29.902859Z",
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
      "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [],
      "started_at": "2026-10-29T16:02:29.294312Z",
      "answered_at": "2026-10-29T16:02:29.600951Z",
      "ended_at": "2026-10-29T16:02:29.902859Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T16:02:37.461427Z"
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
      "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [],
      "started_at": "2026-10-29T16:02:29.294312Z",
      "answered_at": "2026-10-29T16:02:29.600951Z",
      "ended_at": "2026-10-29T16:02:29.902859Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T16:02:37.461427Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/aec0fd26-765c-4b52-be54-cdc3e8fb80d0/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/aec0fd26-765c-4b52-be54-cdc3e8fb80d0/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=aec0fd26-765c-4b52-be54-cdc3e8fb80d0` → **200**

```json
{
  "changes": [
    {
      "id": "768c074f-b1ec-47a5-ae0c-cc8a1fd848eb",
      "occurred_at": "2026-10-29T16:02:39.680681Z",
      "actor_type": "STAFF",
      "actor_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1c93c317-2937-4998-9156-edb946ae2f1a\", \"order_ids\": []}",
      "correlation_id": "cd7c19ba-7428-41ac-8c35-58b4e4c553c3"
    },
    {
      "id": "c7cd2aff-2394-4353-abcb-16aee1a80de9",
      "occurred_at": "2026-10-29T16:02:39.649989Z",
      "actor_type": "STAFF",
      "actor_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1c93c317-2937-4998-9156-edb946ae2f1a\", \"order_ids\": []}",
      "correlation_id": "04fc1e1d-f087-47c3-90b4-4bba59d503e4"
    }
  ]
}
```

Done: call aec0fd26-765c-4b52-be54-cdc3e8fb80d0 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21007"
}
```

```json
{
  "challenge_id": "4ba8de4b-8c4f-408f-87ed-1dc2e65f97f3",
  "expires_at": "2026-10-29T16:07:39.996237883Z",
  "resend_available_at": "2026-10-29T16:02:40.996237883Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "014491",
  "sent_at": "2026-10-29T16:02:40.00063885Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ba8de4b-8c4f-408f-87ed-1dc2e65f97f3",
  "code": "014491",
  "device_ref": "sandbox-21007"
}
```

```json
{
  "session_id": "84b4df14-33a4-42e3-80d8-32dc762cd355",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDY2MCwiaWF0IjoxNzkzMjg5NzYwLCJqdGkiOiI1YmIyNWRiOC0yZTg5LTQzMmUtODUwMC01MDRhMDJlMjg2MDgiLCJzaWQiOiI4NGI0ZGYxNC0zM2E0LTQyZTMtODBkOC0zMmRjNzYyY2QzNTUifQ.bOoND953_CAtWtOMYkSh0iPT8fCwsAIH36WsCjpQNbU",
  "access_expires_at": "2026-10-29T16:17:40.299820027Z",
  "refresh_token": "p5XF7USM5Kl1rxwQifV_xUUukO_wYhKH2UKmI6bA0hw",
  "refresh_expires_at": "2026-11-28T16:02:40.298919961Z",
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
  "command_id": "1ae66c61-bfea-4d7f-9c68-f75094fe5bd0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:40Z",
    "sequence": 1793289760852
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "716f9b2b-ca4a-411a-8aad-c14300b361ce",
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
  "last_heartbeat_at": "2026-10-29T16:02:40.872208Z",
  "last_location_at": "2026-10-29T16:02:40.872208Z",
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
  "session_id": "83adaa64-2331-42c5-ba2b-1816c8ed5099",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2NjEsImlhdCI6MTc5MzI4OTc2MSwianRpIjoiZTE1N2U1NDgtY2E2My00NmMyLWE5YmUtM2VmMmM4NTY5NjNjIiwic2lkIjoiODNhZGFhNjQtMjMzMS00MmM1LWJhMmItMTgxNmM4ZWQ1MDk5In0.qy7JmpTk4Y7dRsoIjqcn47qtLPJGdPPq7_gSR8QASVE",
  "access_expires_at": "2026-10-29T16:17:41.464848952Z",
  "refresh_token": "xrHlId1NS2nO25jkAbK6qQpsue3qlIhJBpfPL1e5VUE",
  "refresh_expires_at": "2026-10-30T04:02:41.464201218Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d9bb01da-b7e0-44dd-be47-3e8f17fa6227",
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
  "id": "bfeee6de-0a38-427a-8150-813ff6bc0eea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:07:41.747406Z",
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
  "command_id": "f098dfe4-bfbf-4c06-9617-9d9ac4402c62",
  "quote_id": "bfeee6de-0a38-427a-8150-813ff6bc0eea",
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
    "phone": "+380677403093"
  }
}
```

```json
{
  "id": "93074465-d1c6-4433-b81e-ba02a950793b",
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
  "created_at": "2026-10-29T16:02:42.050666Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677403093"
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
    "id": "6c25354a-ec53-434c-be75-631593aedacd",
    "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
    "expires_at": "2026-10-29T16:02:57.056613Z",
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

`POST /api/driver/v1/offers/6c25354a-ec53-434c-be75-631593aedacd/accept` → **200**

```json
{
  "command_id": "854962ea-9a9e-438e-947b-11777a384cad"
}
```

```json
{
  "id": "00fc531a-7571-4a62-93c7-a2aa2d534897",
  "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3601218-6884-452c-b2d5-a84b86298091",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677403093` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677403093` → **200**

```json
[
  {
    "phone": "+380677403093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:43.729239613Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677403093` → **200**

```json
[
  {
    "phone": "+380677403093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:43.729239613Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677403093` → **200**

```json
[
  {
    "phone": "+380677403093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:43.729239613Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b3601218-6884-452c-b2d5-a84b86298091",
  "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
  "assignment_id": "00fc531a-7571-4a62-93c7-a2aa2d534897",
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
    "phone": "+380677403093"
  }
}
```

`POST /api/driver/v1/work-sessions/716f9b2b-ca4a-411a-8aad-c14300b361ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:44Z",
    "sequence": 1793289764377
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "716f9b2b-ca4a-411a-8aad-c14300b361ce",
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
  "last_heartbeat_at": "2026-10-29T16:02:44.396735Z",
  "last_location_at": "2026-10-29T16:02:44.396735Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b3601218-6884-452c-b2d5-a84b86298091/arrive` → **200**

```json
{
  "command_id": "3efd0dad-11b6-43f7-8256-aef699c396f2",
  "expected_version": 0
}
```

```json
{
  "id": "b3601218-6884-452c-b2d5-a84b86298091",
  "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
  "assignment_id": "00fc531a-7571-4a62-93c7-a2aa2d534897",
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
  "arrived_at": "2026-10-29T16:02:44.672404Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677403093"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677403093` → **200**

```json
[
  {
    "phone": "+380677403093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:43.729239613Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677403093` → **200**

```json
[
  {
    "phone": "+380677403093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:43.729239613Z"
  },
  {
    "phone": "+380677403093",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:45.739792134Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677403093` → **200**

```json
[
  {
    "phone": "+380677403093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:43.729239613Z"
  },
  {
    "phone": "+380677403093",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:45.739792134Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677403093` → **200**

```json
[
  {
    "phone": "+380677403093",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:43.729239613Z"
  },
  {
    "phone": "+380677403093",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T16:02:45.739792134Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/b3601218-6884-452c-b2d5-a84b86298091/start` → **200**

```json
{
  "command_id": "def71ea2-d330-4d29-ba39-edd736defdd3",
  "expected_version": 1
}
```

```json
{
  "id": "b3601218-6884-452c-b2d5-a84b86298091",
  "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
  "assignment_id": "00fc531a-7571-4a62-93c7-a2aa2d534897",
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
  "arrived_at": "2026-10-29T16:02:44.672404Z",
  "started_at": "2026-10-29T16:02:46.075541Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677403093"
  }
}
```

`POST /api/driver/v1/trips/b3601218-6884-452c-b2d5-a84b86298091/complete` → **200**

```json
{
  "command_id": "8c89cb11-2526-4011-9b14-b5f08527e0a4",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:02:46Z",
  "cash_received": true
}
```

```json
{
  "id": "b3601218-6884-452c-b2d5-a84b86298091",
  "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
  "assignment_id": "00fc531a-7571-4a62-93c7-a2aa2d534897",
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
  "arrived_at": "2026-10-29T16:02:44.672404Z",
  "started_at": "2026-10-29T16:02:46.075541Z",
  "completed_at": "2026-10-29T16:02:46.361183Z",
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
  "session_id": "716f9b2b-ca4a-411a-8aad-c14300b361ce",
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
  "last_heartbeat_at": "2026-10-29T16:02:44.396735Z",
  "last_location_at": "2026-10-29T16:02:44.396735Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/716f9b2b-ca4a-411a-8aad-c14300b361ce/close` → **200**

```json
{
  "command_id": "d97b760c-f26c-4756-b2b8-162a1f0a377e",
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
  "phone": "+380637243050",
  "device_ref": "sandbox-30483"
}
```

```json
{
  "challenge_id": "2a950b45-b18e-4f89-9af5-2ea2e52b97bd",
  "expires_at": "2026-10-29T16:07:47.216154355Z",
  "resend_available_at": "2026-10-29T16:02:48.216154355Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637243050` → **200**

```json
{
  "phone": "+380637243050",
  "audience": "CLIENT",
  "code": "519039",
  "sent_at": "2026-10-29T16:02:47.219549292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a950b45-b18e-4f89-9af5-2ea2e52b97bd",
  "code": "519039",
  "device_ref": "sandbox-30483"
}
```

```json
{
  "session_id": "f9983a40-5358-4f1d-a4d2-3757cab3bcc1",
  "subject": {
    "type": "CLIENT",
    "id": "ce3b0712-98aa-4f62-830b-9199eb641893"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTNiMDcxMi05OGFhLTRmNjItODMwYi05MTk5ZWI2NDE4OTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNjY3LCJpYXQiOjE3OTMyODk3NjcsImp0aSI6IjUwNTM4YjA4LTExZWQtNGRmMS1hZmZkLTUzNGVkM2U3MWI0OSIsInNpZCI6ImY5OTgzYTQwLTUzNTgtNGYxZC1hNGQyLTM3NTdjYWIzYmNjMSJ9.-6TL6fUZw1bdl02FvDOENR0vLpUrhzkw17BIqWB5ty0",
  "access_expires_at": "2026-10-29T16:17:47.528705754Z",
  "refresh_token": "7Q5rEsCm-_BFDHbLSKdAAKNMDPtHQF8r2HM7howB16g",
  "refresh_expires_at": "2026-11-28T16:02:47.528093645Z",
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
  "device_ref": "sandbox-4487"
}
```

```json
{
  "challenge_id": "5f023b44-1aa4-46d2-88b5-469a5798cc43",
  "expires_at": "2026-10-29T16:07:48.074816551Z",
  "resend_available_at": "2026-10-29T16:02:49.074816551Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "397174",
  "sent_at": "2026-10-29T16:02:48.078549072Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5f023b44-1aa4-46d2-88b5-469a5798cc43",
  "code": "397174",
  "device_ref": "sandbox-4487"
}
```

```json
{
  "session_id": "7899411d-5e77-4c62-a190-88cbf6acc133",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDY2OCwiaWF0IjoxNzkzMjg5NzY4LCJqdGkiOiI5MWM5NDZjOC01NzJhLTQ5N2UtYjJhZC0zMjFmYTI2MzEwNjAiLCJzaWQiOiI3ODk5NDExZC01ZTc3LTRjNjItYTE5MC04OGNiZjZhY2MxMzMifQ.c8i_Z-4hGNR0IeMmVHdw6M-AX2GQ4dRUJ0rkiEiAa_0",
  "access_expires_at": "2026-10-29T16:17:48.376531147Z",
  "refresh_token": "7eCj8WOnzjXvECo_aOar2lZOokEuuTt3kpX4RcUxvXI",
  "refresh_expires_at": "2026-11-28T16:02:48.37588522Z",
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
  "session_id": "120e13ac-0eac-445a-84c2-ea9a67212c2d",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2NjksImlhdCI6MTc5MzI4OTc2OSwianRpIjoiY2NjOTEyOTgtNjIwYS00MzExLThhN2UtZmMzYTFkZjU4MzI5Iiwic2lkIjoiMTIwZTEzYWMtMGVhYy00NDVhLTg0YzItZWE5YTY3MjEyYzJkIn0.YAaSrK7t7UDlWnoTbVS5EIG6y2lm0NmaiO2Fxq4pfjY",
  "access_expires_at": "2026-10-29T16:17:49.232890993Z",
  "refresh_token": "uTBbfOBXe-kVruK8UziLF5JJvmoJSoRwi-i9P3rkExM",
  "refresh_expires_at": "2026-10-30T04:02:49.23239447Z",
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
  "session_id": "161fc621-7d7d-486e-a602-a298710e5e04",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2NjksImlhdCI6MTc5MzI4OTc2OSwianRpIjoiN2M4ZDI0MjctZDA3NS00OWExLWJhYTUtYWIxNzA1M2JlMGJiIiwic2lkIjoiMTYxZmM2MjEtN2Q3ZC00ODZlLWE2MDItYTI5ODcxMGU1ZTA0In0.cCOUao7Gq3KAtA6SJoDCbK65pIb3zKWJPWLHWrWBtv8",
  "access_expires_at": "2026-10-29T16:17:49.82106293Z",
  "refresh_token": "1Cq7qnZzinmai1qnjQIuyQRhqasC2ZRgHHHV2Sxa0Ek",
  "refresh_expires_at": "2026-10-30T04:02:49.820456593Z",
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
  "command_id": "b13d3780-4bce-4186-9a6e-c25e2d26d056",
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
  "id": "b280ea27-0914-42b7-aa78-6c8205bc1565",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:07:50.368901Z",
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
  "command_id": "b56872e1-ad6c-41f2-90c4-683113f60762",
  "quote_id": "b280ea27-0914-42b7-aa78-6c8205bc1565",
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
  "id": "ccd56475-e306-4ca1-aea3-e81129398a3c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce3b0712-98aa-4f62-830b-9199eb641893",
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
  "created_at": "2026-10-29T16:02:50.657452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ccd56475-e306-4ca1-aea3-e81129398a3c` → **200**

```json
{
  "id": "ccd56475-e306-4ca1-aea3-e81129398a3c",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce3b0712-98aa-4f62-830b-9199eb641893",
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
  "created_at": "2026-10-29T16:02:50.657452Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ccd56475-e306-4ca1-aea3-e81129398a3c/cancel` → **200**

```json
{
  "command_id": "936a2604-7849-4d49-b6db-6bd71be5d886",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ccd56475-e306-4ca1-aea3-e81129398a3c",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ce3b0712-98aa-4f62-830b-9199eb641893",
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
  "created_at": "2026-10-29T16:02:50.657452Z",
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
  "command_id": "9c9c82e9-8bdc-4cea-bddf-b26c1fdd1c08",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:51Z",
    "sequence": 1793289771829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b86b0613-b86a-4e2b-b094-b543f4ed13a3",
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
  "last_heartbeat_at": "2026-10-29T16:02:51.848532Z",
  "last_location_at": "2026-10-29T16:02:51.848532Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11228"
}
```

```json
{
  "challenge_id": "2f74b3fa-54cf-4f94-9f84-a980920fdd82",
  "expires_at": "2026-10-29T16:07:52.121611322Z",
  "resend_available_at": "2026-10-29T16:02:53.121611322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "159455",
  "sent_at": "2026-10-29T16:02:52.125526026Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f74b3fa-54cf-4f94-9f84-a980920fdd82",
  "code": "159455",
  "device_ref": "sandbox-11228"
}
```

```json
{
  "session_id": "26374dee-de55-4d7f-8755-f47739e8d676",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDY3MiwiaWF0IjoxNzkzMjg5NzcyLCJqdGkiOiJmODRmNGExMS1iMjU2LTQzMzktYTU3OC1lYjdiNDc2MWNmNmQiLCJzaWQiOiIyNjM3NGRlZS1kZTU1LTRkN2YtODc1NS1mNDc3MzllOGQ2NzYifQ.w_Cxbklf0wBQ82ucaj1rtolo_x8a5BQ_Xgb2VqyWUg8",
  "access_expires_at": "2026-10-29T16:17:52.421444168Z",
  "refresh_token": "PjfjlQI1Z7naIrvzM0rRn288ZskVlryICTkvLnRRWmM",
  "refresh_expires_at": "2026-11-28T16:02:52.420799875Z",
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
  "command_id": "26586848-fccd-4610-920d-23952f721679",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:52Z",
    "sequence": 1793289772949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c1fc309-2cb3-45a9-adb8-d4394fac9394",
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
  "last_heartbeat_at": "2026-10-29T16:02:52.969287Z",
  "last_location_at": "2026-10-29T16:02:52.969287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "58fd2b3d-bedc-4ca4-9284-e4e55d7f5bb2",
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
  "id": "cbb61718-cf40-43a7-8fe5-606fe2d21aa9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:07:53.256942Z",
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
  "command_id": "48e47e42-9683-4515-ae75-066cdfb13c67",
  "quote_id": "cbb61718-cf40-43a7-8fe5-606fe2d21aa9",
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
  "id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ce3b0712-98aa-4f62-830b-9199eb641893",
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
  "created_at": "2026-10-29T16:02:53.555055Z",
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
    "id": "6d265c8e-2a44-4691-a44e-367eb5c771ab",
    "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
    "expires_at": "2026-10-29T16:03:08.559213Z",
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

`POST /api/driver/v1/offers/6d265c8e-2a44-4691-a44e-367eb5c771ab/accept` → **200**

```json
{
  "command_id": "9d1c4ab4-b596-45eb-80a6-350facda2cf9"
}
```

```json
{
  "id": "e4c41bcf-bddd-44b6-aadd-31c4fe3d21a8",
  "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8ac5a9c-325c-4c7f-8d88-f263a666bb4f",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8ac5a9c-325c-4c7f-8d88-f263a666bb4f",
  "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
  "assignment_id": "e4c41bcf-bddd-44b6-aadd-31c4fe3d21a8",
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

`POST /api/driver/v1/trips/a8ac5a9c-325c-4c7f-8d88-f263a666bb4f/cancel` → **200**

```json
{
  "command_id": "78be2126-9052-4fb5-8846-240cdff363ff",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "a8ac5a9c-325c-4c7f-8d88-f263a666bb4f",
  "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
  "assignment_id": "e4c41bcf-bddd-44b6-aadd-31c4fe3d21a8",
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

`GET /api/rider/v1/orders/44e84ce4-08ff-4ef3-a0a3-ddd9f893274c` → **200**

```json
{
  "id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ce3b0712-98aa-4f62-830b-9199eb641893",
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
    "id": "e4c41bcf-bddd-44b6-aadd-31c4fe3d21a8",
    "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a8ac5a9c-325c-4c7f-8d88-f263a666bb4f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T16:02:53.555055Z",
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
    "id": "284ab083-34e2-4830-86a3-c6a9eaa1a53c",
    "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
    "expires_at": "2026-10-29T16:03:09.690654Z",
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

`POST /api/driver/v1/offers/284ab083-34e2-4830-86a3-c6a9eaa1a53c/accept` → **200**

```json
{
  "command_id": "64604069-a4c8-48cb-a73a-a71e1c91bc78"
}
```

```json
{
  "id": "92a3540b-b2f2-4af2-8be9-74ec5a903959",
  "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a7302feb-20ee-47aa-8633-c1543d07f835",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a7302feb-20ee-47aa-8633-c1543d07f835",
  "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
  "assignment_id": "92a3540b-b2f2-4af2-8be9-74ec5a903959",
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

`POST /api/driver/v1/trips/a7302feb-20ee-47aa-8633-c1543d07f835/cancel` → **200**

```json
{
  "command_id": "c0a82512-1f48-4f75-b51f-6c4d086c9971",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "a7302feb-20ee-47aa-8633-c1543d07f835",
  "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
  "assignment_id": "92a3540b-b2f2-4af2-8be9-74ec5a903959",
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
    "id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T16:02:53.555055Z",
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
    "id": "ccd56475-e306-4ca1-aea3-e81129398a3c",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T16:02:50.657452Z",
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

`GET /api/operator/v1/orders/44e84ce4-08ff-4ef3-a0a3-ddd9f893274c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T16:02:53.555822Z",
      "actor": {
        "type": "CLIENT",
        "id": "ce3b0712-98aa-4f62-830b-9199eb641893",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
        "quote_id": "cbb61718-cf40-43a7-8fe5-606fe2d21aa9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "0160ee80-7555-4771-9b41-a64d5559af8b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T16:02:53.558003Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
        "attempt_id": "e070b938-0357-485a-9600-9360b004d78a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0160ee80-7555-4771-9b41-a64d5559af8b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T16:02:53.566026Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6d265c8e-2a44-4691-a44e-367eb5c771ab",
        "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "0160ee80-7555-4771-9b41-a64d5559af8b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T16:02:54.126196Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6d265c8e-2a44-4691-a44e-367eb5c771ab",
        "order_id": "44e84ce4-08ff-4ef3-a0a3-ddd9f893274c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "e4c41bcf-bddd-44b6-aadd-31c4fe3d21a8"
      },
      "correlation_id": "cca6de03-ec34-4c06-95b7-b8af992f1a07"
```

Done: orders ccd56475-e306-4ca1-aea3-e81129398a3c, 44e84ce4-08ff-4ef3-a0a3-ddd9f893274c.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737058096",
  "device_ref": "sandbox-31282"
}
```

```json
{
  "challenge_id": "a9679e7c-22a6-4571-9132-8eea0dbc8276",
  "expires_at": "2026-10-29T16:07:56.984498709Z",
  "resend_available_at": "2026-10-29T16:02:57.984498709Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737058096` → **200**

```json
{
  "phone": "+380737058096",
  "audience": "CLIENT",
  "code": "416527",
  "sent_at": "2026-10-29T16:02:56.987824301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9679e7c-22a6-4571-9132-8eea0dbc8276",
  "code": "416527",
  "device_ref": "sandbox-31282"
}
```

```json
{
  "session_id": "8c2721e5-087d-43fa-8e3c-d731ba473d13",
  "subject": {
    "type": "CLIENT",
    "id": "93026447-7a60-4c3c-a33a-e592b425d0db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzAyNjQ0Ny03YTYwLTRjM2MtYTMzYS1lNTkyYjQyNWQwZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNjc3LCJpYXQiOjE3OTMyODk3NzcsImp0aSI6IjFiMTY0MWRkLWQ1ZmMtNDRlYS1iOGI4LWRiYjg4ZDMwZjI0NCIsInNpZCI6IjhjMjcyMWU1LTA4N2QtNDNmYS04ZTNjLWQ3MzFiYTQ3M2QxMyJ9.zHvHJ6vuC2saWt4FWQA5pl7_D6alF_fNMpElfJ7TX10",
  "access_expires_at": "2026-10-29T16:17:57.30606748Z",
  "refresh_token": "GI1QhtYtchtj4t53QIFvQm__e7ixfEm0ep8b5ypICvo",
  "refresh_expires_at": "2026-11-28T16:02:57.305342678Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5f55076a-743f-4cb2-a711-87c90120c1d4",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e715d30c-d80c-4771-8dfc-b0d2a30fcdf1",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e715d30c-d80c-4771-8dfc-b0d2a30fcdf1",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "fe910c475481a1769e454d15cde53997",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e715d30c-d80c-4771-8dfc-b0d2a30fcdf1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737058096"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e715d30c-d80c-4771-8dfc-b0d2a30fcdf1",
  "expires_at": "2026-10-29T16:32:57.600673Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e715d30c-d80c-4771-8dfc-b0d2a30fcdf1` → **200**

```json
{
  "id": "e715d30c-d80c-4771-8dfc-b0d2a30fcdf1",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:32:57.600673Z",
  "card": {
    "id": "3c3c6552-f4cf-4387-bbb4-cdbc64b332e8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5602",
    "card_type": "Visa",
    "created_at": "2026-10-29T16:02:57.890714Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "3c3c6552-f4cf-4387-bbb4-cdbc64b332e8",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5602",
      "card_type": "Visa",
      "created_at": "2026-10-29T16:02:57.890714Z"
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
  "device_ref": "sandbox-21129"
}
```

```json
{
  "challenge_id": "a2596f31-231e-483a-912e-9e4e232df7e2",
  "expires_at": "2026-10-29T16:07:58.446261557Z",
  "resend_available_at": "2026-10-29T16:02:59.446261557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "701756",
  "sent_at": "2026-10-29T16:02:58.449728538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2596f31-231e-483a-912e-9e4e232df7e2",
  "code": "701756",
  "device_ref": "sandbox-21129"
}
```

```json
{
  "session_id": "5ba2691a-f044-47f2-ac54-5b9ffdad6e43",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDY3OCwiaWF0IjoxNzkzMjg5Nzc4LCJqdGkiOiIwMzI4NzQxYi1hNmI3LTQwYTMtYjQyNy03ZTk5OGYxN2FkZmQiLCJzaWQiOiI1YmEyNjkxYS1mMDQ0LTQ3ZjItYWM1NC01YjlmZmRhZDZlNDMifQ.jp447CYhX9wlhwCC8zO-QwSWSeJubvqI0gIqvA_4eH8",
  "access_expires_at": "2026-10-29T16:17:58.746730663Z",
  "refresh_token": "V3qTKo9NC368AR_lsr2pL2aU_jJcI8IdVEGBr3_qPhY",
  "refresh_expires_at": "2026-11-28T16:02:58.746116689Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c1fc309-2cb3-45a9-adb8-d4394fac9394",
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
  "last_heartbeat_at": "2026-10-29T16:02:52.969287Z",
  "last_location_at": "2026-10-29T16:02:52.969287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c1fc309-2cb3-45a9-adb8-d4394fac9394/handover` → **200**

```json
{
  "command_id": "e13c440b-b498-46e0-b70b-5e12c2ba263f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c1fc309-2cb3-45a9-adb8-d4394fac9394",
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
  "last_heartbeat_at": "2026-10-29T16:02:52.969287Z",
  "last_location_at": "2026-10-29T16:02:52.969287Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c1fc309-2cb3-45a9-adb8-d4394fac9394/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:02:59Z",
    "sequence": 1793289779567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c1fc309-2cb3-45a9-adb8-d4394fac9394",
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
  "last_heartbeat_at": "2026-10-29T16:02:59.585051Z",
  "last_location_at": "2026-10-29T16:02:59.585051Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d0d32676-4658-473a-aa7b-c3aa2f972032",
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
  "id": "737d0639-e59c-4f8a-b58b-4a34bbd1ebf3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:07:59.875243Z",
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
  "command_id": "0fc4340a-5db1-4870-bf4f-48ed78c2edd2",
  "quote_id": "737d0639-e59c-4f8a-b58b-4a34bbd1ebf3",
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
  "id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
  "created_at": "2026-10-29T16:03:00.164209Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa86cf49-3668-45c8-a316-637adbaac3e1` → **200**

```json
{
  "id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
  "created_at": "2026-10-29T16:03:00.164209Z",
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
    "id": "442eb37b-63f1-43d8-ab11-8d6d984d83a7",
    "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
    "expires_at": "2026-10-29T16:03:15.29326Z",
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

`POST /api/driver/v1/offers/442eb37b-63f1-43d8-ab11-8d6d984d83a7/accept` → **200**

```json
{
  "command_id": "21c7ec35-6c08-4037-94cf-2afdaaca7a72"
}
```

```json
{
  "id": "5bd00ae5-1acb-426c-9ac9-949f9d8d21f7",
  "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4807009b-3af1-40e4-bc78-4e8332bb8e2d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4807009b-3af1-40e4-bc78-4e8332bb8e2d",
  "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "assignment_id": "5bd00ae5-1acb-426c-9ac9-949f9d8d21f7",
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

`POST /api/driver/v1/work-sessions/6c1fc309-2cb3-45a9-adb8-d4394fac9394/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:03:01Z",
    "sequence": 1793289781562
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c1fc309-2cb3-45a9-adb8-d4394fac9394",
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
  "last_heartbeat_at": "2026-10-29T16:03:01.582227Z",
  "last_location_at": "2026-10-29T16:03:01.582227Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4807009b-3af1-40e4-bc78-4e8332bb8e2d/arrive` → **200**

```json
{
  "command_id": "0eceb878-bc9a-479f-a84e-2f0fdbfee7d8",
  "expected_version": 0
}
```

```json
{
  "id": "4807009b-3af1-40e4-bc78-4e8332bb8e2d",
  "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "assignment_id": "5bd00ae5-1acb-426c-9ac9-949f9d8d21f7",
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
  "arrived_at": "2026-10-29T16:03:01.868842Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4807009b-3af1-40e4-bc78-4e8332bb8e2d/start` → **200**

```json
{
  "command_id": "3b00e198-ca9a-4b63-88e4-052c67627cb9",
  "expected_version": 1
}
```

```json
{
  "id": "4807009b-3af1-40e4-bc78-4e8332bb8e2d",
  "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "assignment_id": "5bd00ae5-1acb-426c-9ac9-949f9d8d21f7",
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
  "arrived_at": "2026-10-29T16:03:01.868842Z",
  "started_at": "2026-10-29T16:03:02.153122Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4807009b-3af1-40e4-bc78-4e8332bb8e2d/complete` → **200**

```json
{
  "command_id": "05a89cc7-4876-4dd3-a10a-bc9125d393d4",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:03:02Z",
  "cash_received": true
}
```

```json
{
  "id": "4807009b-3af1-40e4-bc78-4e8332bb8e2d",
  "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "assignment_id": "5bd00ae5-1acb-426c-9ac9-949f9d8d21f7",
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
  "arrived_at": "2026-10-29T16:03:01.868842Z",
  "started_at": "2026-10-29T16:03:02.153122Z",
  "completed_at": "2026-10-29T16:03:02.439521Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/fa86cf49-3668-45c8-a316-637adbaac3e1` → **200**

```json
{
  "id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
    "id": "5bd00ae5-1acb-426c-9ac9-949f9d8d21f7",
    "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4807009b-3af1-40e4-bc78-4e8332bb8e2d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T16:03:00.164209Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa86cf49-3668-45c8-a316-637adbaac3e1` → **200**

```json
{
  "id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
    "id": "5bd00ae5-1acb-426c-9ac9-949f9d8d21f7",
    "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4807009b-3af1-40e4-bc78-4e8332bb8e2d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T16:03:00.164209Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa86cf49-3668-45c8-a316-637adbaac3e1` → **200**

```json
{
  "id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
    "id": "5bd00ae5-1acb-426c-9ac9-949f9d8d21f7",
    "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4807009b-3af1-40e4-bc78-4e8332bb8e2d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T16:03:00.164209Z",
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

`GET /api/rider/v1/orders/fa86cf49-3668-45c8-a316-637adbaac3e1/tip` → **200**

```json
{
  "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
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
  "available_until": "2026-10-30T16:03:02.439521Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fa86cf49-3668-45c8-a316-637adbaac3e1/tip` → **201**

```json
{
  "command_id": "444c1170-7457-4043-96fc-c910db334a95",
  "amount_minor": 2500
}
```

```json
{
  "id": "d2c8b3bd-1d7a-4217-95e2-47449520aa55",
  "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T16:03:06.199006Z"
}
```

`GET /api/rider/v1/orders/fa86cf49-3668-45c8-a316-637adbaac3e1/tip` → **200**

```json
{
  "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
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
  "available_until": "2026-10-30T16:03:02.439521Z",
  "open": false,
  "tip": {
    "id": "d2c8b3bd-1d7a-4217-95e2-47449520aa55",
    "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T16:03:06.199006Z"
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
      "id": "0df39bc9-eba9-4624-a443-555fa72f4c9c",
      "at": "2026-10-29T16:03:03.379886Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
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
      "id": "38fdc1f0-2848-445f-9a49-5054718638f1",
      "at": "2026-10-29T16:03:07.447433Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
      "counterpart_id": null
    },
    {
      "id": "0df39bc9-eba9-4624-a443-555fa72f4c9c",
      "at": "2026-10-29T16:03:03.379886Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2a293db8-cd5c-4dba-90a5-89a8afc3a64d",
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
  "id": "0c415eb5-7ad0-4f37-9f24-96c882cfd4c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:08:08.321250Z",
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
  "session_id": "8923fa28-cbb8-4a61-9d12-fa7a099cc313",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA2ODgsImlhdCI6MTc5MzI4OTc4OCwianRpIjoiOTFkNTEwNjYtNGU3OC00MDU2LWIxZjgtMWNiMzBkYjgxZjlmIiwic2lkIjoiODkyM2ZhMjgtY2JiOC00YTYxLTlkMTItZmE3YTA5OWNjMzEzIn0.jnaBk7Co9XH8hzZGl9S95jPHa13HSYJJql7jko3za5A",
  "access_expires_at": "2026-10-29T16:18:08.923330815Z",
  "refresh_token": "Guvc7Dg15CMlb9y97IAxgqz2D3OddogkyVmnhmbc6aQ",
  "refresh_expires_at": "2026-10-30T04:03:08.922805914Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737058096` → **200**

```json
{
  "client_id": "93026447-7a60-4c3c-a33a-e592b425d0db"
}
```

`POST /api/admin/v1/rider-wallets/93026447-7a60-4c3c-a33a-e592b425d0db/top-ups` → **201**

```json
{
  "command_id": "d4164e6f-78d2-42c1-afe1-6ec62ebe278c",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
      "id": "f82c04c5-8adc-4990-bc8f-a6da06a8aa0f",
      "at": "2026-10-29T16:03:09.459834Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4e6960ab-287c-4722-b752-129984e67bf6",
  "quote_id": "0c415eb5-7ad0-4f37-9f24-96c882cfd4c3",
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
  "id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
  "created_at": "2026-10-29T16:03:09.750965Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1b4cb852-5cd6-42b6-a211-0da366288d65` → **200**

```json
{
  "id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
  "created_at": "2026-10-29T16:03:09.750965Z",
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
    "id": "32852c20-0de2-4f1a-8afd-83207ffed3d0",
    "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
    "expires_at": "2026-10-29T16:03:24.756133Z",
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

`POST /api/driver/v1/offers/32852c20-0de2-4f1a-8afd-83207ffed3d0/accept` → **200**

```json
{
  "command_id": "3b833200-86a4-41a1-a6f1-c801fd49e7e2"
}
```

```json
{
  "id": "6128c89c-350f-4f76-8b9a-28f5ef512c29",
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a79ef12-82fc-43c7-a6b2-0ad4a279bed4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4a79ef12-82fc-43c7-a6b2-0ad4a279bed4",
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
  "assignment_id": "6128c89c-350f-4f76-8b9a-28f5ef512c29",
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

`POST /api/driver/v1/work-sessions/6c1fc309-2cb3-45a9-adb8-d4394fac9394/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:03:11Z",
    "sequence": 1793289791152
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c1fc309-2cb3-45a9-adb8-d4394fac9394",
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
  "last_heartbeat_at": "2026-10-29T16:03:11.173784Z",
  "last_location_at": "2026-10-29T16:03:11.173784Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4a79ef12-82fc-43c7-a6b2-0ad4a279bed4/arrive` → **200**

```json
{
  "command_id": "9c00ff6c-b7c0-4324-a5e0-0668e8c7b880",
  "expected_version": 0
}
```

```json
{
  "id": "4a79ef12-82fc-43c7-a6b2-0ad4a279bed4",
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
  "assignment_id": "6128c89c-350f-4f76-8b9a-28f5ef512c29",
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
  "arrived_at": "2026-10-29T16:03:11.454024Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4a79ef12-82fc-43c7-a6b2-0ad4a279bed4/start` → **200**

```json
{
  "command_id": "e30cf0c1-0c99-4c7f-a08c-1af277d8eae3",
  "expected_version": 1
}
```

```json
{
  "id": "4a79ef12-82fc-43c7-a6b2-0ad4a279bed4",
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
  "assignment_id": "6128c89c-350f-4f76-8b9a-28f5ef512c29",
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
  "arrived_at": "2026-10-29T16:03:11.454024Z",
  "started_at": "2026-10-29T16:03:11.741744Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4a79ef12-82fc-43c7-a6b2-0ad4a279bed4/complete` → **200**

```json
{
  "command_id": "3df6e448-15a5-42c6-b6de-d7d1efac6eb4",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:03:12Z",
  "cash_received": true
}
```

```json
{
  "id": "4a79ef12-82fc-43c7-a6b2-0ad4a279bed4",
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
  "assignment_id": "6128c89c-350f-4f76-8b9a-28f5ef512c29",
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
  "arrived_at": "2026-10-29T16:03:11.454024Z",
  "started_at": "2026-10-29T16:03:11.741744Z",
  "completed_at": "2026-10-29T16:03:12.038823Z",
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
  "client_id": "93026447-7a60-4c3c-a33a-e592b425d0db",
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
      "id": "f82c04c5-8adc-4990-bc8f-a6da06a8aa0f",
      "at": "2026-10-29T16:03:09.459834Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
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

`GET /api/rider/v1/orders/1b4cb852-5cd6-42b6-a211-0da366288d65/tip` → **200**

```json
{
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
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
  "available_until": "2026-10-30T16:03:12.038823Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1b4cb852-5cd6-42b6-a211-0da366288d65/tip` → **201**

```json
{
  "command_id": "c575d01f-2364-4945-ab97-d616af824200",
  "amount_minor": 2500
}
```

```json
{
  "id": "37b6e2c5-758c-4e9d-9ea5-738a5d9943aa",
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T16:03:13.161339Z"
}
```

`GET /api/rider/v1/orders/1b4cb852-5cd6-42b6-a211-0da366288d65/tip` → **200**

```json
{
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
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
  "available_until": "2026-10-30T16:03:12.038823Z",
  "open": false,
  "tip": {
    "id": "37b6e2c5-758c-4e9d-9ea5-738a5d9943aa",
    "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T16:03:13.161339Z"
  }
}
```

`GET /api/rider/v1/orders/1b4cb852-5cd6-42b6-a211-0da366288d65/tip` → **200**

```json
{
  "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
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
  "available_until": "2026-10-30T16:03:12.038823Z",
  "open": false,
  "tip": {
    "id": "37b6e2c5-758c-4e9d-9ea5-738a5d9943aa",
    "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T16:03:13.161339Z"
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
      "id": "31c1d25e-d984-4810-882e-8358f2245cf4",
      "at": "2026-10-29T16:03:14.52974Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
      "counterpart_id": null
    },
    {
      "id": "4554c298-01f1-4237-b53c-608a290d5bf7",
      "at": "2026-10-29T16:03:12.502313Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1b4cb852-5cd6-42b6-a211-0da366288d65",
      "counterpart_id": null
    },
    {
      "id": "38fdc1f0-2848-445f-9a49-5054718638f1",
      "at": "2026-10-29T16:03:07.447433Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
      "counterpart_id": null
    },
    {
      "id": "0df39bc9-eba9-4624-a443-555fa72f4c9c",
      "at": "2026-10-29T16:03:03.379886Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fa86cf49-3668-45c8-a316-637adbaac3e1",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c1fc309-2cb3-45a9-adb8-d4394fac9394",
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
  "last_heartbeat_at": "2026-10-29T16:03:11.173784Z",
  "last_location_at": "2026-10-29T16:03:11.173784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c1fc309-2cb3-45a9-adb8-d4394fac9394/close` → **200**

```json
{
  "command_id": "e55d4179-ffaa-4bdf-ba98-60949d5db13f",
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

Done: card order 1b4cb852-5cd6-42b6-a211-0da366288d65.

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
  "phone": "+380733048949",
  "device_ref": "sandbox-503"
}
```

```json
{
  "challenge_id": "a0fdfe58-10e3-4642-a122-f04bb0e6d10b",
  "expires_at": "2026-10-29T16:08:16.164206572Z",
  "resend_available_at": "2026-10-29T16:03:17.164206572Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733048949` → **200**

```json
{
  "phone": "+380733048949",
  "audience": "CLIENT",
  "code": "574772",
  "sent_at": "2026-10-29T16:03:16.166936779Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0fdfe58-10e3-4642-a122-f04bb0e6d10b",
  "code": "574772",
  "device_ref": "sandbox-503"
}
```

```json
{
  "session_id": "f4b54328-c214-4d53-a969-6ba9fd02a9c0",
  "subject": {
    "type": "CLIENT",
    "id": "3a1b31c0-8349-448f-b7ca-5ab54cef60d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTFiMzFjMC04MzQ5LTQ0OGYtYjdjYS01YWI1NGNlZjYwZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNjk2LCJpYXQiOjE3OTMyODk3OTYsImp0aSI6IjhjY2U2OTU5LTc2Y2EtNDUzNS1hMjQyLWEzMzEwM2M4ZTgwZCIsInNpZCI6ImY0YjU0MzI4LWMyMTQtNGQ1My1hOTY5LTZiYTlmZDAyYTljMCJ9.7ma30zLmh0-Cyk7BkbJJOiVUMsgJ3_7VmgeXQof9XW0",
  "access_expires_at": "2026-10-29T16:18:16.462812368Z",
  "refresh_token": "PbL2Zf7Rqwx0kql0WH_ZrRCjwREGj4axHlG8QFMaE4I",
  "refresh_expires_at": "2026-11-28T16:03:16.46209912Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "fc4bf1d7-be9f-4dff-9b64-b157f09008ad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "615e5954-640e-4efe-b5f4-09494ef02068",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-615e5954-640e-4efe-b5f4-09494ef02068",
    "orderDate": "1793289796",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "a521538eeb0ae13d266c84069502bfb0",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=615e5954-640e-4efe-b5f4-09494ef02068",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733048949"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=615e5954-640e-4efe-b5f4-09494ef02068",
  "created_at": "2026-10-29T16:03:16.743305Z",
  "expires_at": "2026-10-29T16:33:16.743305Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/615e5954-640e-4efe-b5f4-09494ef02068` → **200**

```json
{
  "id": "615e5954-640e-4efe-b5f4-09494ef02068",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T16:03:16.743305Z",
  "expires_at": "2026-10-29T16:33:16.743305Z",
  "completed_at": "2026-10-29T16:03:17.035818Z",
  "masked_pan": "41****3328",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3a1b31c0-8349-448f-b7ca-5ab54cef60d4",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3a1b31c0-8349-448f-b7ca-5ab54cef60d4",
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
      "id": "dce0f30b-8566-42a2-9b88-5943c3ef9d8f",
      "at": "2026-10-29T16:03:17.547786Z",
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
  "client_id": "3a1b31c0-8349-448f-b7ca-5ab54cef60d4",
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
      "id": "dce0f30b-8566-42a2-9b88-5943c3ef9d8f",
      "at": "2026-10-29T16:03:17.547786Z",
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
  "device_ref": "sandbox-17521"
}
```

```json
{
  "challenge_id": "f43bd70c-4189-4688-b4f6-872dbd2037e1",
  "expires_at": "2026-10-29T16:08:19.376644145Z",
  "resend_available_at": "2026-10-29T16:03:20.376644145Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "879208",
  "sent_at": "2026-10-29T16:03:19.379055319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f43bd70c-4189-4688-b4f6-872dbd2037e1",
  "code": "879208",
  "device_ref": "sandbox-17521"
}
```

```json
{
  "session_id": "f0b31eff-5829-45db-925a-c8e5184d7be3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDY5OSwiaWF0IjoxNzkzMjg5Nzk5LCJqdGkiOiI4NTRhMjMzMy1mZDIxLTQyZmUtOGFmOC0zZjliMDgxZTMwODAiLCJzaWQiOiJmMGIzMWVmZi01ODI5LTQ1ZGItOTI1YS1jOGU1MTg0ZDdiZTMifQ.iQgztrQknlyodkfOEPlFM-e3pDWrRE9QghJBUU2tgu4",
  "access_expires_at": "2026-10-29T16:18:19.676149017Z",
  "refresh_token": "7WcXuO9_IlRUpCxOsX7oKvMNgHdD22KZDlApb21tpb0",
  "refresh_expires_at": "2026-11-28T16:03:19.675478362Z",
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
  "command_id": "efbe4b6d-54dd-4d10-8542-de9c2e7f9daa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ed8db644-406d-47d9-a7cd-581ae6b5d934",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ed8db644-406d-47d9-a7cd-581ae6b5d934",
    "orderDate": "1793289800",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "3cd993f86082f3fd2406b8f6036afba6",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ed8db644-406d-47d9-a7cd-581ae6b5d934",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ed8db644-406d-47d9-a7cd-581ae6b5d934",
  "created_at": "2026-10-29T16:03:20.22124Z",
  "expires_at": "2026-10-29T16:33:20.22124Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ed8db644-406d-47d9-a7cd-581ae6b5d934` → **200**

```json
{
  "id": "ed8db644-406d-47d9-a7cd-581ae6b5d934",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T16:03:20.22124Z",
  "expires_at": "2026-10-29T16:33:20.22124Z",
  "completed_at": "2026-10-29T16:03:20.490938Z",
  "masked_pan": "41****9136",
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
      "id": "5a2f867d-a50b-4287-afb8-01a24d5ebeb7",
      "at": "2026-10-29T16:03:20.558575Z",
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
  "command_id": "c48c3072-2d81-427e-a776-270efdfb30ad",
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
  "correlation_id": "263a7bf4-437e-4efb-9818-6b7773b0eae3"
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
  "device_ref": "sandbox-9265"
}
```

```json
{
  "challenge_id": "43ccf71f-d7ff-4096-baa2-071d874befea",
  "expires_at": "2026-10-29T16:08:21.337214673Z",
  "resend_available_at": "2026-10-29T16:03:22.337214673Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "803036",
  "sent_at": "2026-10-29T16:03:21.340374804Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43ccf71f-d7ff-4096-baa2-071d874befea",
  "code": "803036",
  "device_ref": "sandbox-9265"
}
```

```json
{
  "session_id": "0a59962d-1528-4b8f-8ce9-1a34780f5829",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDcwMSwiaWF0IjoxNzkzMjg5ODAxLCJqdGkiOiJkZmRiMTZmNC0xZTMyLTQyYTQtYWU5YS0zNDc0YTFkNWIxOTkiLCJzaWQiOiIwYTU5OTYyZC0xNTI4LTRiOGYtOGNlOS0xYTM0NzgwZjU4MjkifQ.j6R9ugEzeKtGG9KySgOCYMkd7hqXCEfCdSTHoP97uRY",
  "access_expires_at": "2026-10-29T16:18:21.633183725Z",
  "refresh_token": "1Rn1JRxsnvmVV6SRD4ekpQXDkWkCt2aZVeiOAfLwjRA",
  "refresh_expires_at": "2026-11-28T16:03:21.632588625Z",
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
  "command_id": "331fc5ef-b915-48de-84e1-c12e2407a212",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:03:22Z",
    "sequence": 1793289802164
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4030fec5-9e9e-4756-a131-a3c5eb5eb0ba",
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
  "last_heartbeat_at": "2026-10-29T16:03:22.184099Z",
  "last_location_at": "2026-10-29T16:03:22.184099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636274742",
  "device_ref": "sandbox-9973"
}
```

```json
{
  "challenge_id": "8ec1773a-3bf5-4db3-be76-4652053c47a4",
  "expires_at": "2026-10-29T16:08:22.463791402Z",
  "resend_available_at": "2026-10-29T16:03:23.463791402Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636274742` → **200**

```json
{
  "phone": "+380636274742",
  "audience": "CLIENT",
  "code": "861938",
  "sent_at": "2026-10-29T16:03:22.466616253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ec1773a-3bf5-4db3-be76-4652053c47a4",
  "code": "861938",
  "device_ref": "sandbox-9973"
}
```

```json
{
  "session_id": "7b2e3e4a-4817-4325-8cf7-83aef475effa",
  "subject": {
    "type": "CLIENT",
    "id": "e144b636-8be1-4c15-8733-91f8a2051615"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTQ0YjYzNi04YmUxLTRjMTUtODczMy05MWY4YTIwNTE2MTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzAyLCJpYXQiOjE3OTMyODk4MDIsImp0aSI6ImJmMDkwMTcwLTgyOTktNGNiYi05MTRkLTljYWY4ZjE1YmYyZiIsInNpZCI6IjdiMmUzZTRhLTQ4MTctNDMyNS04Y2Y3LTgzYWVmNDc1ZWZmYSJ9.vCmVRy0kk5YGjjJ4ePIUF26HYYkHpbvM_QXeNcoba2c",
  "access_expires_at": "2026-10-29T16:18:22.765764103Z",
  "refresh_token": "6zBcktEu5LQnl2qRH5zPE7WGxuaL3j-10-A689ML63M",
  "refresh_expires_at": "2026-11-28T16:03:22.76531649Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "127a8f59-2a81-4fb9-98c0-69311e7125f1",
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
  "id": "c7128b1a-cf19-4fb8-8d1b-95f36a6b1109",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:08:23.039830Z",
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
  "command_id": "6bb5d3fa-9c09-45c2-9d11-139af68b920c",
  "quote_id": "c7128b1a-cf19-4fb8-8d1b-95f36a6b1109",
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
  "id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e144b636-8be1-4c15-8733-91f8a2051615",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:03:23.323897Z",
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
    "id": "dd7db35f-5897-49b9-a229-342047436222",
    "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
    "expires_at": "2026-10-29T16:03:38.32709Z",
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

`POST /api/driver/v1/offers/dd7db35f-5897-49b9-a229-342047436222/accept` → **200**

```json
{
  "command_id": "db6db655-ac59-40b8-9b8d-3137e54fb85a"
}
```

```json
{
  "id": "62bb10d3-dd05-46fc-942a-55a51119fc6f",
  "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "64128211-f546-4917-aeb4-17d9098a7a90",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "64128211-f546-4917-aeb4-17d9098a7a90",
  "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
  "assignment_id": "62bb10d3-dd05-46fc-942a-55a51119fc6f",
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

`POST /api/driver/v1/work-sessions/4030fec5-9e9e-4756-a131-a3c5eb5eb0ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:03:24Z",
    "sequence": 1793289804416
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4030fec5-9e9e-4756-a131-a3c5eb5eb0ba",
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
  "last_heartbeat_at": "2026-10-29T16:03:24.434771Z",
  "last_location_at": "2026-10-29T16:03:24.434771Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/64128211-f546-4917-aeb4-17d9098a7a90/arrive` → **200**

```json
{
  "command_id": "bc2b5735-cb99-45ce-a784-db132567b703",
  "expected_version": 0
}
```

```json
{
  "id": "64128211-f546-4917-aeb4-17d9098a7a90",
  "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
  "assignment_id": "62bb10d3-dd05-46fc-942a-55a51119fc6f",
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
  "arrived_at": "2026-10-29T16:03:24.717399Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/64128211-f546-4917-aeb4-17d9098a7a90/start` → **200**

```json
{
  "command_id": "1a3051ad-286f-4f29-9a4e-7b6f75aea8e1",
  "expected_version": 1
}
```

```json
{
  "id": "64128211-f546-4917-aeb4-17d9098a7a90",
  "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
  "assignment_id": "62bb10d3-dd05-46fc-942a-55a51119fc6f",
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
  "arrived_at": "2026-10-29T16:03:24.717399Z",
  "started_at": "2026-10-29T16:03:25.010603Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/64128211-f546-4917-aeb4-17d9098a7a90/complete` → **200**

```json
{
  "command_id": "c93e1562-eeb1-4b53-8cff-06f1b27ff762",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:03:25Z",
  "cash_received": false
}
```

```json
{
  "id": "64128211-f546-4917-aeb4-17d9098a7a90",
  "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
  "assignment_id": "62bb10d3-dd05-46fc-942a-55a51119fc6f",
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
  "arrived_at": "2026-10-29T16:03:24.717399Z",
  "started_at": "2026-10-29T16:03:25.010603Z",
  "completed_at": "2026-10-29T16:03:25.308244Z",
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
  "session_id": "73c159c8-63f8-4512-9225-e1359296bd8f",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3MDUsImlhdCI6MTc5MzI4OTgwNSwianRpIjoiZTY1YmY1MjQtNjlkNy00ZDEwLThjZWItZDI4ZDliNGExNmVjIiwic2lkIjoiNzNjMTU5YzgtNjNmOC00NTEyLTkyMjUtZTEzNTkyOTZiZDhmIn0.aS4xikt8y9squufSaIZ2bwjgr3Qj7Y7kATHEeuapVvA",
  "access_expires_at": "2026-10-29T16:18:25.905898736Z",
  "refresh_token": "RUhMLx6geg0bCEJ_tOZ1sMydNY2_rRgFNlSS8_PlVd8",
  "refresh_expires_at": "2026-10-30T04:03:25.90522944Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/edd40525-0fdd-40ea-a780-bf3ba813d643/cash-dispute` → **200**

```json
{
  "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e144b636-8be1-4c15-8733-91f8a2051615",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T16:03:25.630387Z",
  "decide_by": "2026-11-12T16:03:25.630387Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T16:03:25.630387Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "e144b636-8be1-4c15-8733-91f8a2051615",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T16:03:25.630387Z",
      "decide_by": "2026-11-12T16:03:25.630387Z",
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

`POST /api/admin/v1/orders/edd40525-0fdd-40ea-a780-bf3ba813d643/cash-dispute/decide` → **400**

```json
{
  "command_id": "cf784487-b184-4a45-857f-194517491849",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/edd40525-0fdd-40ea-a780-bf3ba813d643/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7b46cdf9-ffc6-4a76-8b82-e63621512d30",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/edd40525-0fdd-40ea-a780-bf3ba813d643/cash-dispute/decide` → **200**

```json
{
  "command_id": "6ab7acbe-07c5-4ee4-9896-e5c2213c031e",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e144b636-8be1-4c15-8733-91f8a2051615",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T16:03:25.630387Z",
  "decide_by": "2026-11-12T16:03:25.630387Z",
  "decision": "PAY_DRIVER",
  "decided_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T16:03:27.064264Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/edd40525-0fdd-40ea-a780-bf3ba813d643/cash-dispute/decide` → **409**

```json
{
  "command_id": "20669c62-8055-4430-adc0-06f0ac44bdf5",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/edd40525-0fdd-40ea-a780-bf3ba813d643/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b0c97f30-d714-491d-ac9e-e978e27181a2"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4030fec5-9e9e-4756-a131-a3c5eb5eb0ba",
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
  "last_heartbeat_at": "2026-10-29T16:03:24.434771Z",
  "last_location_at": "2026-10-29T16:03:24.434771Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4030fec5-9e9e-4756-a131-a3c5eb5eb0ba/close` → **200**

```json
{
  "command_id": "fce92734-5295-4568-ac07-8e01c1cbed89",
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
  "phone": "+380734101520",
  "device_ref": "sandbox-13115"
}
```

```json
{
  "challenge_id": "f9a2f0de-1bd8-42fe-8a01-91b7d18ccc4c",
  "expires_at": "2026-10-29T16:08:28.216600927Z",
  "resend_available_at": "2026-10-29T16:03:29.216600927Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734101520` → **200**

```json
{
  "phone": "+380734101520",
  "audience": "CLIENT",
  "code": "772810",
  "sent_at": "2026-10-29T16:03:28.21927834Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9a2f0de-1bd8-42fe-8a01-91b7d18ccc4c",
  "code": "772810",
  "device_ref": "sandbox-13115"
}
```

```json
{
  "session_id": "2bb8a8ed-fca8-4fa5-90da-9dfec1be9723",
  "subject": {
    "type": "CLIENT",
    "id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYWVjNWMyYS0zM2NhLTQwMjQtYTBmYy03YTk5YjRiZGZkM2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzA4LCJpYXQiOjE3OTMyODk4MDgsImp0aSI6ImZjMjQ5MmEyLTM3OGQtNGU5My1hZDAyLTVlOGIyMzAxMzczNiIsInNpZCI6IjJiYjhhOGVkLWZjYTgtNGZhNS05MGRhLTlkZmVjMWJlOTcyMyJ9.lgVpT2p_gOEp9y9iJt6YCzkE3ZN8DGNqJFBaYxz6cuM",
  "access_expires_at": "2026-10-29T16:18:28.517161894Z",
  "refresh_token": "LYLYkk0aAJwyqWU-wUlz27yf1tWegcjYtemeGl5uwoE",
  "refresh_expires_at": "2026-11-28T16:03:28.516645408Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5a7d5cc9-72ab-4a52-a640-83ad6e79c11d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b8fe8061-dbf4-491b-9229-c3acadc9d954",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b8fe8061-dbf4-491b-9229-c3acadc9d954",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "2dbd8f4b33fe76afc4ff737e09162539",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b8fe8061-dbf4-491b-9229-c3acadc9d954",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734101520"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b8fe8061-dbf4-491b-9229-c3acadc9d954",
  "expires_at": "2026-10-29T16:33:28.792714Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b8fe8061-dbf4-491b-9229-c3acadc9d954` → **200**

```json
{
  "id": "b8fe8061-dbf4-491b-9229-c3acadc9d954",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:33:28.792714Z",
  "card": {
    "id": "5660ab90-f48d-4040-b6c5-c3e81f912842",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0014",
    "card_type": "Visa",
    "created_at": "2026-10-29T16:03:29.38196Z"
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
  "device_ref": "sandbox-8011"
}
```

```json
{
  "challenge_id": "dae974b4-925f-4ef3-84de-ea7fd97d4380",
  "expires_at": "2026-10-29T16:08:29.675591674Z",
  "resend_available_at": "2026-10-29T16:03:30.675591674Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "176791",
  "sent_at": "2026-10-29T16:03:29.6788005Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dae974b4-925f-4ef3-84de-ea7fd97d4380",
  "code": "176791",
  "device_ref": "sandbox-8011"
}
```

```json
{
  "session_id": "ae94a421-c6be-4419-aa93-d196cdab05b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDcwOSwiaWF0IjoxNzkzMjg5ODA5LCJqdGkiOiIxYTA4OGZhMS0wZjBlLTRjNmEtODZmYi03ZTJlNzQyYzdmN2EiLCJzaWQiOiJhZTk0YTQyMS1jNmJlLTQ0MTktYWE5My1kMTk2Y2RhYjA1YjkifQ.Estw8mC605prQlasX9LQBox08tS_dIeXV1K29rcV-n0",
  "access_expires_at": "2026-10-29T16:18:29.978974683Z",
  "refresh_token": "kT6wQO4-VSrjCTALBnaHeKiiS7ywnwXMxeeUXaimeNY",
  "refresh_expires_at": "2026-11-28T16:03:29.978317258Z",
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
  "command_id": "7f6f4eaa-b10e-475e-b0fd-3332997c82c8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:03:30Z",
    "sequence": 1793289810516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eb89c557-5997-49f7-bcb2-81013e0693f4",
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
  "last_heartbeat_at": "2026-10-29T16:03:30.535291Z",
  "last_location_at": "2026-10-29T16:03:30.535291Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c8ce7ddd-062b-46aa-9ba0-a19a4a2fa388",
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
  "id": "e5eef23c-ad79-4ffc-9301-b11aa82a2dae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:08:30.822786Z",
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
  "command_id": "f313509e-ea17-4922-b228-d5d41fb66a28",
  "quote_id": "e5eef23c-ad79-4ffc-9301-b11aa82a2dae",
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
  "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
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
  "created_at": "2026-10-29T16:03:31.113883Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f` → **200**

```json
{
  "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
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
  "created_at": "2026-10-29T16:03:31.113883Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f` → **200**

```json
{
  "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
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
  "created_at": "2026-10-29T16:03:31.113883Z",
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
    "id": "a097481b-bdd5-44b8-acad-9101db290120",
    "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
    "expires_at": "2026-10-29T16:03:46.688005Z",
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

`POST /api/driver/v1/offers/a097481b-bdd5-44b8-acad-9101db290120/accept` → **200**

```json
{
  "command_id": "d6e305ac-f97f-4f00-b838-10cb16fb03df"
}
```

```json
{
  "id": "8d22dd5d-4cd2-4630-a5d5-1a04d6d2721d",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d65d05a-0c28-4005-8c41-fb426bff561e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d65d05a-0c28-4005-8c41-fb426bff561e",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "assignment_id": "8d22dd5d-4cd2-4630-a5d5-1a04d6d2721d",
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

`POST /api/rider/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/messages` → **201**

```json
{
  "command_id": "ce24f501-dbf5-4c2c-95c0-b72efc45fbef",
  "body": "Я біля входу, мій номер +380734101520, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "2bc9ff99-2d80-4576-9f8e-5f269ca5e04d",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380734101520, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T16:03:33.827683252Z"
}
```

`POST /api/driver/v1/trips/4d65d05a-0c28-4005-8c41-fb426bff561e/messages` → **201**

```json
{
  "command_id": "ccc82cbd-337b-493f-b9dd-1e777aa0cb74",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "4cd1744c-84f4-4fb7-8478-73309969030d",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T16:03:34.113476543Z"
}
```

`POST /api/driver/v1/work-sessions/eb89c557-5997-49f7-bcb2-81013e0693f4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:03:34Z",
    "sequence": 1793289814382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eb89c557-5997-49f7-bcb2-81013e0693f4",
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
  "last_heartbeat_at": "2026-10-29T16:03:34.40156Z",
  "last_location_at": "2026-10-29T16:03:34.40156Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4d65d05a-0c28-4005-8c41-fb426bff561e/arrive` → **200**

```json
{
  "command_id": "c209a344-ab11-459b-ba2f-cc3582b8bf59",
  "expected_version": 0
}
```

```json
{
  "id": "4d65d05a-0c28-4005-8c41-fb426bff561e",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "assignment_id": "8d22dd5d-4cd2-4630-a5d5-1a04d6d2721d",
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
  "arrived_at": "2026-10-29T16:03:34.686048Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d65d05a-0c28-4005-8c41-fb426bff561e/start` → **200**

```json
{
  "command_id": "47683ac9-d9f6-4c6a-a818-f8bc9d98b051",
  "expected_version": 1
}
```

```json
{
  "id": "4d65d05a-0c28-4005-8c41-fb426bff561e",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "assignment_id": "8d22dd5d-4cd2-4630-a5d5-1a04d6d2721d",
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
  "arrived_at": "2026-10-29T16:03:34.686048Z",
  "started_at": "2026-10-29T16:03:34.982221Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/eb89c557-5997-49f7-bcb2-81013e0693f4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:03:35Z",
    "sequence": 1793289815255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eb89c557-5997-49f7-bcb2-81013e0693f4",
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
  "last_heartbeat_at": "2026-10-29T16:03:35.274156Z",
  "last_location_at": "2026-10-29T16:03:35.274156Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/4d65d05a-0c28-4005-8c41-fb426bff561e/complete` → **200**

```json
{
  "command_id": "a37357e5-3eb8-46a2-9595-1b42fe364c63",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:03:35Z",
  "cash_received": false
}
```

```json
{
  "id": "4d65d05a-0c28-4005-8c41-fb426bff561e",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "assignment_id": "8d22dd5d-4cd2-4630-a5d5-1a04d6d2721d",
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
  "arrived_at": "2026-10-29T16:03:34.686048Z",
  "started_at": "2026-10-29T16:03:34.982221Z",
  "completed_at": "2026-10-29T16:03:35.566307Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f` → **200**

```json
{
  "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
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
    "id": "8d22dd5d-4cd2-4630-a5d5-1a04d6d2721d",
    "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d65d05a-0c28-4005-8c41-fb426bff561e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T16:03:31.113883Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f` → **200**

```json
{
  "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
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
    "id": "8d22dd5d-4cd2-4630-a5d5-1a04d6d2721d",
    "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d65d05a-0c28-4005-8c41-fb426bff561e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T16:03:31.113883Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f` → **200**

```json
{
  "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
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
    "id": "8d22dd5d-4cd2-4630-a5d5-1a04d6d2721d",
    "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4d65d05a-0c28-4005-8c41-fb426bff561e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T16:03:31.113883Z",
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
  "session_id": "eb89c557-5997-49f7-bcb2-81013e0693f4",
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
  "last_heartbeat_at": "2026-10-29T16:03:35.274156Z",
  "last_location_at": "2026-10-29T16:03:35.274156Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eb89c557-5997-49f7-bcb2-81013e0693f4/close` → **200**

```json
{
  "command_id": "f0565171-8d45-4912-bdc3-cb2d7908a87b",
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
  "session_id": "9dee3a67-5f3b-4554-9bb1-54e7369cafa0",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3MTksImlhdCI6MTc5MzI4OTgxOSwianRpIjoiZWI5NzBiYWMtNmQxNS00N2NjLTkwODUtMmM1ZGMzMzg4YWQwIiwic2lkIjoiOWRlZTNhNjctNWYzYi00NTU0LTliYjEtNTRlNzM2OWNhZmEwIn0.cp1Kn0RI6gwOaJsnwDWHGpDq1_Ixu5_azgUtktx4Bgk",
  "access_expires_at": "2026-10-29T16:18:39.986889911Z",
  "refresh_token": "dCmR7DOpkS9kDzwsh0-N0bXyM-Y87AQF1dzrnQ_Qkmg",
  "refresh_expires_at": "2026-10-30T04:03:39.986382373Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "140e4f21-7b6a-414f-b5fe-e93ad42f3076"
}
```

`GET /api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T16:03:40.532970138Z",
  "order": {
    "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
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
    "created_at": "2026-10-29T16:03:31.113883Z",
    "assigned_at": "2026-10-29T16:03:33.272712Z",
    "arrived_at": "2026-10-29T16:03:34.686048Z",
    "started_at": "2026-10-29T16:03:34.982221Z",
    "completed_at": "2026-10-29T16:03:35.566307Z"
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
    "id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
    "registered_at": "2026-10-29T16:03:28.514687Z",
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
      "created_at": "2026-10-29T16:03:31.116663Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T16:03:35.790511Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/chargebacks` → **422**

```json
{
  "command_id": "3e2e142e-191e-4200-ab40-d9c3196bb43e",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "491f1ea2-2f4c-4c63-b982-d68d478875de"
}
```

`POST /api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/chargebacks` → **201**

```json
{
  "command_id": "38a77d89-40c5-4dc5-b03d-7304d0086436",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "b1174bea-1c2d-4b55-b644-8ffe3166b061",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T16:03:41.168336Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/chargebacks` → **201**

```json
{
  "command_id": "38a77d89-40c5-4dc5-b03d-7304d0086436",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "b1174bea-1c2d-4b55-b644-8ffe3166b061",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T16:03:41.168336Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a` → **200**

```json
{
  "client": {
    "id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
    "phone": "+380734101520",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T16:03:28.514687Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T16:03:31.113883Z",
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

`GET /api/admin/v1/clients/daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a` → **200**

```json
{
  "client": {
    "id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
    "phone": "+380734101520",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T16:03:28.514687Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T16:03:31.113883Z",
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

`POST /api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/chargebacks/b1174bea-1c2d-4b55-b644-8ffe3166b061/resolve` → **200**

```json
{
  "command_id": "4aa53f67-02f3-4cdb-b30a-32fc6611c4bc",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "b1174bea-1c2d-4b55-b644-8ffe3166b061",
  "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T16:03:41.168336Z",
  "resolved_at": "2026-10-29T16:03:43.363242Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a` → **200**

```json
{
  "client": {
    "id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
    "phone": "+380734101520",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T16:03:28.514687Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T16:03:31.113883Z",
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

`GET /api/admin/v1/clients/daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a` → **200**

```json
{
  "client": {
    "id": "daec5c2a-33ca-4024-a0fc-7a99b4bdfd3a",
    "phone": "+380734101520",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T16:03:28.514687Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T16:03:31.113883Z",
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

`POST /api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/chargebacks/b1174bea-1c2d-4b55-b644-8ffe3166b061/resolve` → **409**

```json
{
  "command_id": "3862c8d0-aa49-4f35-a8b2-3c558aed838d",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/chargebacks/b1174bea-1c2d-4b55-b644-8ffe3166b061/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "82874394-ff5d-40b8-a43e-4b30c1a13848"
}
```

`GET /api/admin/v1/orders/b5bff24b-0f46-4d53-9ae0-ffaadff6289f/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "b1174bea-1c2d-4b55-b644-8ffe3166b061",
      "order_id": "b5bff24b-0f46-4d53-9ae0-ffaadff6289f",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T16:03:41.168336Z",
      "resolved_at": "2026-10-29T16:03:43.363242Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order b5bff24b-0f46-4d53-9ae0-ffaadff6289f without phone or card digits; chargeback b1174bea-1c2d-4b55-b644-8ffe3166b061 recorded and won.

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
  "session_id": "0cdd5350-fe10-442b-8b38-771a55115394",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3MjYsImlhdCI6MTc5MzI4OTgyNiwianRpIjoiZmVmNDZmZWUtOTBlYi00YTI4LTljZTctZTg5ZWNhMjA2MzQ0Iiwic2lkIjoiMGNkZDUzNTAtZmUxMC00NDJiLThiMzgtNzcxYTU1MTE1Mzk0In0.PKwSufSjC7w0uh8RoEVjDDvntmQ5pw82ef7B9rEHmDs",
  "access_expires_at": "2026-10-29T16:18:46.422958059Z",
  "refresh_token": "UnPWs1xvq056iFb_til5mMMqFCfceb4X8ipGg8ICAv0",
  "refresh_expires_at": "2026-10-30T04:03:46.422432765Z",
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
  "phone": "+48600030568",
  "device_ref": "sandbox-32152"
}
```

```json
{
  "challenge_id": "056fa4bf-7b07-42d6-a611-a48b3535e6b2",
  "expires_at": "2026-10-29T16:08:47.255933907Z",
  "resend_available_at": "2026-10-29T16:03:48.255933907Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600030568` → **200**

```json
{
  "phone": "+48600030568",
  "audience": "CLIENT",
  "code": "307565",
  "sent_at": "2026-10-29T16:03:47.258696302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "056fa4bf-7b07-42d6-a611-a48b3535e6b2",
  "code": "307565",
  "device_ref": "sandbox-32152"
}
```

```json
{
  "session_id": "e3e7c339-b5a2-41d2-bb6e-4a36a2e7a136",
  "subject": {
    "type": "CLIENT",
    "id": "160d6592-6034-481c-990d-434b1d25c476"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjBkNjU5Mi02MDM0LTQ4MWMtOTkwZC00MzRiMWQyNWM0NzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzI3LCJpYXQiOjE3OTMyODk4MjcsImp0aSI6ImY3MmRmMWQyLWJmY2ItNDNkYi1hZTRjLTVlMmViMzg1OWRmZSIsInNpZCI6ImUzZTdjMzM5LWI1YTItNDFkMi1iYjZlLTRhMzZhMmU3YTEzNiJ9.vBmAPHfWUpiVHaBiZxRry2tXJLAHeianzZ4_uitj3L8",
  "access_expires_at": "2026-10-29T16:18:47.565050528Z",
  "refresh_token": "OVpBDIMYOaLdg-0pLwFDmyGulQ2ktoY42xhTFWSw2pw",
  "refresh_expires_at": "2026-11-28T16:03:47.564378423Z",
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
  "command_id": "389e1765-2b26-421c-8fbb-cb49b1ccffee",
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
  "correlation_id": "983f522e-401a-4417-9842-021369efd918",
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
  "command_id": "9d17346d-b311-4ed5-abe3-d229386d687d",
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
  "paused_at": "2026-10-29T16:03:48.667289204Z",
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
  "command_id": "552689e5-719c-4b7c-88bd-471b5345edfa",
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
  "id": "fba63d73-3d5b-46cd-b3bc-96e145dfff7c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:08:49.404303Z",
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
  "command_id": "cf7e7157-9d81-419e-9329-21c04179c97a",
  "quote_id": "fba63d73-3d5b-46cd-b3bc-96e145dfff7c",
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
  "correlation_id": "f224cfc0-5ba1-4b0e-9274-693fdd2a4769"
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
  "paused_at": "2026-10-29T16:03:48.667289Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "4608f1bb-e6f1-4025-a896-238eeac0f8f5",
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
  "command_id": "d4d9a8fc-b9c6-4f03-adb1-d97528eabd6b",
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
  "command_id": "baf1090c-ad49-41d3-9c76-1d73e787c39d",
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
  "id": "88023238-0294-45b6-a501-04fe587fdce3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:08:51.081Z",
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
  "command_id": "9d9be265-179f-4fa7-9a90-ac99ca25f241",
  "quote_id": "88023238-0294-45b6-a501-04fe587fdce3",
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
  "correlation_id": "f77b7985-8885-478d-9754-2e95e01c40be"
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
  "command_id": "d00ffc27-b7c4-414e-83cd-4d34312a1b7d",
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
      "from": "19:00",
      "to": "20:00"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "f9f3d2ab-c4dd-4c8b-bbd8-1aae27ebe573",
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
  "id": "75bf1c43-aa7f-4d7a-a145-56e950ba8880",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:08:52.204492Z",
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
  "command_id": "7040c7cb-3ec6-47b3-9f47-65716c5e7c1c",
  "quote_id": "75bf1c43-aa7f-4d7a-a145-56e950ba8880",
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
  "correlation_id": "5a210222-53da-477e-a4f0-9aca1dc5760f"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5705478b-dea8-4738-a73b-527c351299fd",
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
  "correlation_id": "0656a025-a7cd-480b-8085-167a5f32806d"
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
      "from": "19:00",
      "to": "20:00"
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
  "command_id": "b2eb9c15-f2be-495a-8c40-a7aa4554d6e6",
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
  "phone": "+380673005788",
  "device_ref": "sandbox-15473"
}
```

```json
{
  "challenge_id": "93464af6-8e38-4abb-885b-80c7431bdc8b",
  "expires_at": "2026-10-29T16:08:53.644344318Z",
  "resend_available_at": "2026-10-29T16:03:54.644344318Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673005788` → **200**

```json
{
  "phone": "+380673005788",
  "audience": "CLIENT",
  "code": "292601",
  "sent_at": "2026-10-29T16:03:53.647117143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93464af6-8e38-4abb-885b-80c7431bdc8b",
  "code": "292601",
  "device_ref": "sandbox-15473"
}
```

```json
{
  "session_id": "7e1f64fd-a3e9-4f4b-ab21-4dcd6cc68446",
  "subject": {
    "type": "CLIENT",
    "id": "d9b7c482-b32d-41de-afdf-aea13999fe64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOWI3YzQ4Mi1iMzJkLTQxZGUtYWZkZi1hZWExMzk5OWZlNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzM0LCJpYXQiOjE3OTMyODk4MzQsImp0aSI6Ijc0NDQwZDBiLWQzMWUtNGJhMC1iNTM2LTQyODU4NzdiYTFlYiIsInNpZCI6IjdlMWY2NGZkLWEzZTktNGY0Yi1hYjIxLTRkY2Q2Y2M2ODQ0NiJ9.t6hCuiVwvqXLwV67PqZKx-ABaiYzYIaiMpxvhBPjGn8",
  "access_expires_at": "2026-10-29T16:18:54.15195383Z",
  "refresh_token": "kGZluWLRKh5RgWS0E_K4BCnh1iT7Z5ZmSCdm840BkUI",
  "refresh_expires_at": "2026-11-28T16:03:54.151407714Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d9b7c482-b32d-41de-afdf-aea13999fe64",
  "session_id": "7e1f64fd-a3e9-4f4b-ab21-4dcd6cc68446",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "00cb042e-4433-4aff-9efc-462c36ac5628",
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
  "id": "84ec2f7f-f80d-46ec-8a15-24c6e439f444",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:08:54.696517Z",
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
  "challenge_id": "3efe0b6b-1007-4576-b7cb-b09fa0e65a3f",
  "expires_at": "2026-10-29T16:08:56.983892644Z",
  "resend_available_at": "2026-10-29T16:03:57.983892644Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673005788` → **200**

```json
{
  "phone": "+380673005788",
  "audience": "CLIENT",
  "code": "619738",
  "sent_at": "2026-10-29T16:03:56.986234045Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "16ad9158-4255-42bb-beb6-23ce7fa2bd9e",
  "challenge_id": "3efe0b6b-1007-4576-b7cb-b09fa0e65a3f",
  "otp_code": "619738"
}
```

```json
{
  "client_id": "d9b7c482-b32d-41de-afdf-aea13999fe64",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T16:03:57.313715364Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "b04ca2b0-b963-44cf-954b-0e04b3c6bbe6",
  "quote_id": "84ec2f7f-f80d-46ec-8a15-24c6e439f444",
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
  "correlation_id": "cc7641f1-fb7d-47dd-8e4c-adcd4e727c69"
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
  "session_id": "1c93ce81-32f6-4b9e-bb40-713a5903f9a9",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3MzgsImlhdCI6MTc5MzI4OTgzOCwianRpIjoiMWQ3Y2I1ODktNjFlMy00MzIyLWFkOTUtYWVmYzhjYWUxZGQ0Iiwic2lkIjoiMWM5M2NlODEtMzJmNi00YjllLWJiNDAtNzEzYTU5MDNmOWE5In0.FhWUG5oF2l4YT3BDT95AkN_oIvYi23yXwWlEMTR4mMc",
  "access_expires_at": "2026-10-29T16:18:58.213293968Z",
  "refresh_token": "MNynnSX6XjQ9d5CWvPmDb31PFFaus_I9RUmNQDdKSZI",
  "refresh_expires_at": "2026-10-30T04:03:58.212703078Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d9b7c482-b32d-41de-afdf-aea13999fe64",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T16:03:57.313715Z",
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

`POST /api/admin/v1/client-deletions/d9b7c482-b32d-41de-afdf-aea13999fe64/complete` → **200**

```json
{
  "command_id": "0444e68c-9e82-4e2a-a2c5-d04539346c54",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d9b7c482-b32d-41de-afdf-aea13999fe64",
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
  "correlation_id": "c3e24f18-0a35-4214-adbf-3df51db2bd79"
}
```

Done: client d9b7c482-b32d-41de-afdf-aea13999fe64 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668366355",
  "device_ref": "sandbox-6522"
}
```

```json
{
  "challenge_id": "38032a6c-5921-42df-a93c-3f941d8358e2",
  "expires_at": "2026-10-29T16:08:59.341300111Z",
  "resend_available_at": "2026-10-29T16:04:00.341300111Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668366355` → **200**

```json
{
  "phone": "+380668366355",
  "audience": "CLIENT",
  "code": "322570",
  "sent_at": "2026-10-29T16:03:59.344000005Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "38032a6c-5921-42df-a93c-3f941d8358e2",
  "code": "322570",
  "device_ref": "sandbox-6522"
}
```

```json
{
  "session_id": "94c140b5-d468-4857-b937-8be2a9336d80",
  "subject": {
    "type": "CLIENT",
    "id": "4459cc74-4763-45b4-967b-4733c8e8be13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDU5Y2M3NC00NzYzLTQ1YjQtOTY3Yi00NzMzYzhlOGJlMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzM5LCJpYXQiOjE3OTMyODk4MzksImp0aSI6ImQxMjE1MDkwLTg1MGMtNGUyMC04MjNmLTdkNjcwMDc5YTk2NiIsInNpZCI6Ijk0YzE0MGI1LWQ0NjgtNDg1Ny1iOTM3LThiZTJhOTMzNmQ4MCJ9.ddwJoaXFh4GIGZLVxwoZhaiy652gfdUUXmXM4newxWs",
  "access_expires_at": "2026-10-29T16:18:59.641554962Z",
  "refresh_token": "6lqPxmIsDvFSlR77IkBWkbL_YKBfREsq1CXSVvBQUfg",
  "refresh_expires_at": "2026-11-28T16:03:59.641021931Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4459cc74-4763-45b4-967b-4733c8e8be13",
  "session_id": "94c140b5-d468-4857-b937-8be2a9336d80",
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
  "session_id": "7ee1aa05-625b-48f4-a942-aa0fc5f16cdf",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3NDAsImlhdCI6MTc5MzI4OTg0MCwianRpIjoiODU4ZWUyNTctZjE5NC00MTA2LTljMTAtNzFmNDFhZmZhNmM2Iiwic2lkIjoiN2VlMWFhMDUtNjI1Yi00OGY0LWE5NDItYWEwZmM1ZjE2Y2RmIn0.33x8S58GNI38wptYt23RROMVfABkMvjpIfIQ3FWkD3c",
  "access_expires_at": "2026-10-29T16:19:00.497262714Z",
  "refresh_token": "Fv189ctxFmJVSyC4BZ1wf-MQ-j1A0WUaTuPmtTDGr7E",
  "refresh_expires_at": "2026-10-30T04:04:00.496760015Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8366355&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "4459cc74-4763-45b4-967b-4733c8e8be13",
      "phone": "+380668366355",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T16:03:59.638894Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/4459cc74-4763-45b4-967b-4733c8e8be13` → **200**

```json
{
  "client": {
    "id": "4459cc74-4763-45b4-967b-4733c8e8be13",
    "phone": "+380668366355",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T16:03:59.638894Z",
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

`POST /api/admin/v1/clients/4459cc74-4763-45b4-967b-4733c8e8be13/block` → **400**

```json
{
  "command_id": "bd505909-19b9-4905-b006-b8d3c6a6d18a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/4459cc74-4763-45b4-967b-4733c8e8be13/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7154c2b6-e12b-4714-9677-8eefc03846e0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/4459cc74-4763-45b4-967b-4733c8e8be13/block` → **200**

```json
{
  "command_id": "9416a504-063d-4516-adfc-546645b7cb4f",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "4459cc74-4763-45b4-967b-4733c8e8be13",
  "phone": "+380668366355",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T16:03:59.638894Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T16:04:01.663963Z",
    "by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
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
  "correlation_id": "57c19a47-ef1e-4d21-9c79-7f476c7ca1be"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668366355",
  "device_ref": "sandbox-9212"
}
```

```json
{
  "challenge_id": "ea5a7475-feed-4f2b-92c2-6558e51c079a",
  "expires_at": "2026-10-29T16:09:04.23779248Z",
  "resend_available_at": "2026-10-29T16:04:05.23779248Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668366355` → **200**

```json
{
  "phone": "+380668366355",
  "audience": "CLIENT",
  "code": "052257",
  "sent_at": "2026-10-29T16:04:04.240372621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "ea5a7475-feed-4f2b-92c2-6558e51c079a",
  "code": "052257",
  "device_ref": "sandbox-9212"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "639fecc2-1c5b-483c-891b-6f4125f4817a"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/4459cc74-4763-45b4-967b-4733c8e8be13` → **200**

```json
{
  "client": {
    "id": "4459cc74-4763-45b4-967b-4733c8e8be13",
    "phone": "+380668366355",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T16:03:59.638894Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T16:04:01.663963Z",
      "by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
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

`POST /api/admin/v1/clients/4459cc74-4763-45b4-967b-4733c8e8be13/unblock` → **200**

```json
{
  "command_id": "bf440c98-3bfc-4d3e-b4a2-4313f0cd1760",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "4459cc74-4763-45b4-967b-4733c8e8be13",
  "phone": "+380668366355",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T16:03:59.638894Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668366355",
  "device_ref": "sandbox-3700"
}
```

```json
{
  "challenge_id": "462eb9dd-6021-49d6-afd5-966f44ec1e91",
  "expires_at": "2026-10-29T16:09:07.402683596Z",
  "resend_available_at": "2026-10-29T16:04:08.402683596Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668366355` → **200**

```json
{
  "phone": "+380668366355",
  "audience": "CLIENT",
  "code": "481518",
  "sent_at": "2026-10-29T16:04:07.405141002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "462eb9dd-6021-49d6-afd5-966f44ec1e91",
  "code": "481518",
  "device_ref": "sandbox-3700"
}
```

```json
{
  "session_id": "910fc5ee-5362-4f4d-b819-10ec4e402a25",
  "subject": {
    "type": "CLIENT",
    "id": "4459cc74-4763-45b4-967b-4733c8e8be13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDU5Y2M3NC00NzYzLTQ1YjQtOTY3Yi00NzMzYzhlOGJlMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzQ3LCJpYXQiOjE3OTMyODk4NDcsImp0aSI6IjQ2MmVjNTFlLWE4YTQtNDVlNS1hMjQ1LWM4ZjRiYjJhOTQwMSIsInNpZCI6IjkxMGZjNWVlLTUzNjItNGY0ZC1iODE5LTEwZWM0ZTQwMmEyNSJ9.-zpZNqc8c5t3mGY3ZO7dmt7d19toJYE4M44UEfefXDM",
  "access_expires_at": "2026-10-29T16:19:07.708585728Z",
  "refresh_token": "bWmpBpd-qW7QNhb5hdNS9QIzwwSqJFz8PzpNzYvPjvY",
  "refresh_expires_at": "2026-11-28T16:04:07.708009999Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4459cc74-4763-45b4-967b-4733c8e8be13",
  "session_id": "910fc5ee-5362-4f4d-b819-10ec4e402a25",
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
  "phone": "+380669397792",
  "device_ref": "sandbox-19704"
}
```

```json
{
  "challenge_id": "2a2f5c41-4491-49db-8aed-99820ae889e8",
  "expires_at": "2026-10-29T16:09:08.251002424Z",
  "resend_available_at": "2026-10-29T16:04:09.251002424Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669397792` → **200**

```json
{
  "phone": "+380669397792",
  "audience": "CLIENT",
  "code": "022419",
  "sent_at": "2026-10-29T16:04:08.253670774Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a2f5c41-4491-49db-8aed-99820ae889e8",
  "code": "022419",
  "device_ref": "sandbox-19704"
}
```

```json
{
  "session_id": "f3b01f4d-0d47-4704-a68f-0c52bf38af19",
  "subject": {
    "type": "CLIENT",
    "id": "a611953e-a733-43d0-879d-1c712a5d6418"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjExOTUzZS1hNzMzLTQzZDAtODc5ZC0xYzcxMmE1ZDY0MTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzQ4LCJpYXQiOjE3OTMyODk4NDgsImp0aSI6IjE0MzY1OWY3LTRkYTUtNDBkNS1hM2NkLTkxNGZjNTg1ZWQ2OCIsInNpZCI6ImYzYjAxZjRkLTBkNDctNDcwNC1hNjhmLTBjNTJiZjM4YWYxOSJ9.a9_1DIsGmqOzLgOfeBLtEDs-8TqPfx10hsr8aQVzeeU",
  "access_expires_at": "2026-10-29T16:19:08.543058334Z",
  "refresh_token": "MRHuW_bQMB28gPS04YQzl7BaHiiFxiFgxsBh0qscWy8",
  "refresh_expires_at": "2026-11-28T16:04:08.542628767Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b500dd09-b201-48cd-9da1-28639f9492d6",
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
  "id": "54bc74b5-fb0f-43b3-a3ca-7c9966f349c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:09:08.824892Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: ee18e53f-73a9-4da9-9085-85aa65fe1001) → **201**

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
  "session_id": "7eef6780-6224-4333-8fc0-bd050e281d86",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3NDksImlhdCI6MTc5MzI4OTg0OSwianRpIjoiZDkwY2IxZTMtMWMwZS00Y2Q4LTg2ZWQtYzA3OTEzYTBkMGNlIiwic2lkIjoiN2VlZjY3ODAtNjIyNC00MzMzLThmYzAtYmQwNTBlMjgxZDg2In0.zX4VqKHs9Ur0nd1YV9E6gQk-7vU2v-jdE6hloaY8xQA",
  "access_expires_at": "2026-10-29T16:19:09.462938539Z",
  "refresh_token": "fuD92tW9RstLem7Y5VloSZkPARfA-mvMd-1rD0yz82o",
  "refresh_expires_at": "2026-10-30T04:04:09.462336736Z",
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
  "session_id": "63e61fa6-3761-4ec1-9dd5-4793a25bc272",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3NTAsImlhdCI6MTc5MzI4OTg1MCwianRpIjoiOGQzNGE5OTEtMGFlYy00MWNjLWFkZmEtYTAyYjhmNTU1NGIwIiwic2lkIjoiNjNlNjFmYTYtMzc2MS00ZWMxLTlkZDUtNDc5M2EyNWJjMjcyIn0.DvNdUoimJNOphT5BGUAeqR0i21TiMuoCGf0YD6uT-zs",
  "access_expires_at": "2026-10-29T16:19:10.050597Z",
  "refresh_token": "BFkx7-PTrzbhwe-kS572IP8PhGc_9Jv7wLfnodO0J1k",
  "refresh_expires_at": "2026-10-30T04:04:10.050084032Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5f43adce-bcf4-4252-b643-6605ff7688bf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T16:04:09.110324Z",
      "actor": {
        "type": "CLIENT",
        "id": "a611953e-a733-43d0-879d-1c712a5d6418",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5f43adce-bcf4-4252-b643-6605ff7688bf",
        "quote_id": "54bc74b5-fb0f-43b3-a3ca-7c9966f349c3",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ee18e53f-73a9-4da9-9085-85aa65fe1001"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T16:04:09.112927Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5f43adce-bcf4-4252-b643-6605ff7688bf",
        "attempt_id": "8b610cdc-af4f-42e7-bf70-2cd7deadc185",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ee18e53f-73a9-4da9-9085-85aa65fe1001"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T16:04:09.120086Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5f43adce-bcf4-4252-b643-6605ff7688bf",
        "attempt_id": "8b610cdc-af4f-42e7-bf70-2cd7deadc185"
      },
      "correlation_id": "ee18e53f-73a9-4da9-9085-85aa65fe1001"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "8b610cdc-af4f-42e7-bf70-2cd7deadc185",
        "generation": 1,
        "started_at": "2026-10-29T16:04:09.111898Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T16:04:09.120086Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T16:04:09.113759Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/ee18e53f-73a9-4da9-9085-85aa65fe1001` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "5f43adce-bcf4-4252-b643-6605ff7688bf:0",
      "order_id": "5f43adce-bcf4-4252-b643-6605ff7688bf",
      "at": "2026-10-29T16:04:09.110324Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5f43adce-bcf4-4252-b643-6605ff7688bf:1",
      "order_id": "5f43adce-bcf4-4252-b643-6605ff7688bf",
      "at": "2026-10-29T16:04:09.112927Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5f43adce-bcf4-4252-b643-6605ff7688bf:2",
      "order_id": "5f43adce-bcf4-4252-b643-6605ff7688bf",
      "at": "2026-10-29T16:04:09.120086Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/3a60436e-decb-4209-831c-7e27b271714a` → **200**

```json
{
  "found": []
}
```

Done: request ee18e53f-73a9-4da9-9085-85aa65fe1001 — order 5f43adce-bcf4-4252-b643-6605ff7688bf found by its id.

`GET /api/rider/v1/orders/5f43adce-bcf4-4252-b643-6605ff7688bf` → **200**

```json
{
  "id": "5f43adce-bcf4-4252-b643-6605ff7688bf",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a611953e-a733-43d0-879d-1c712a5d6418",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:04:09.109682Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5f43adce-bcf4-4252-b643-6605ff7688bf/cancel` → **200**

```json
{
  "command_id": "7a7053e3-5f55-4f0b-8ab3-fe09b0ad5b1b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5f43adce-bcf4-4252-b643-6605ff7688bf",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a611953e-a733-43d0-879d-1c712a5d6418",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:04:09.109682Z",
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
  "phone": "+380637238785",
  "device_ref": "sandbox-12075"
}
```

```json
{
  "challenge_id": "b47c414a-dc52-4bdd-a478-581ecdf612ba",
  "expires_at": "2026-10-29T16:09:11.750452107Z",
  "resend_available_at": "2026-10-29T16:04:12.750452107Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637238785` → **200**

```json
{
  "phone": "+380637238785",
  "audience": "CLIENT",
  "code": "740326",
  "sent_at": "2026-10-29T16:04:11.753124329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b47c414a-dc52-4bdd-a478-581ecdf612ba",
  "code": "740326",
  "device_ref": "sandbox-12075"
}
```

```json
{
  "session_id": "d79b10f2-7dbf-41ed-88b3-e4bc91b135db",
  "subject": {
    "type": "CLIENT",
    "id": "c4f26a0c-b911-41a8-a754-55e1a5f45554"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGYyNmEwYy1iOTExLTQxYTgtYTc1NC01NWUxYTVmNDU1NTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzUyLCJpYXQiOjE3OTMyODk4NTIsImp0aSI6IjMwNTc0NDBiLWU2OWItNGEzNi05ZGJkLTkzOGZhY2ExYzQ4NiIsInNpZCI6ImQ3OWIxMGYyLTdkYmYtNDFlZC04OGIzLWU0YmM5MWIxMzVkYiJ9.susxYB2Ro5zps0hfcfZyw_gLYHCvo8IZ-r7iKK69IqY",
  "access_expires_at": "2026-10-29T16:19:12.056128568Z",
  "refresh_token": "ok9qwDb_gJ5ZYHK71apN7DwoMhlTkdIH2Pl3dLyOAVo",
  "refresh_expires_at": "2026-11-28T16:04:12.055678579Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b350af1b-7d75-4bc9-87a9-3387634da943",
  "expires_at": "2026-10-29T16:09:14.333684171Z",
  "resend_available_at": "2026-10-29T16:04:15.333684171Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637238785` → **200**

```json
{
  "phone": "+380637238785",
  "audience": "CLIENT",
  "code": "882229",
  "sent_at": "2026-10-29T16:04:14.336036369Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "031a8295-b5ac-4eca-96cd-cadc1adbdb9f",
  "challenge_id": "b350af1b-7d75-4bc9-87a9-3387634da943",
  "otp_code": "882229"
}
```

```json
{
  "id": "cd6593f8-9b5f-469f-b908-1d6b72bb5371",
  "state": "PENDING",
  "created_at": "2026-10-29T16:04:14.637397Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/cd6593f8-9b5f-469f-b908-1d6b72bb5371` → **200**

```json
{
  "id": "cd6593f8-9b5f-469f-b908-1d6b72bb5371",
  "state": "PENDING",
  "created_at": "2026-10-29T16:04:14.637397Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/cd6593f8-9b5f-469f-b908-1d6b72bb5371` → **200**

```json
{
  "id": "cd6593f8-9b5f-469f-b908-1d6b72bb5371",
  "state": "PENDING",
  "created_at": "2026-10-29T16:04:14.637397Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/cd6593f8-9b5f-469f-b908-1d6b72bb5371` → **200**

```json
{
  "id": "cd6593f8-9b5f-469f-b908-1d6b72bb5371",
  "state": "PENDING",
  "created_at": "2026-10-29T16:04:14.637397Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/cd6593f8-9b5f-469f-b908-1d6b72bb5371` → **200**

```json
{
  "id": "cd6593f8-9b5f-469f-b908-1d6b72bb5371",
  "state": "READY",
  "created_at": "2026-10-29T16:04:14.637397Z",
  "ready_at": "2026-10-29T16:04:17.51327Z",
  "expires_at": "2026-11-05T16:04:17.51327Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/cd6593f8-9b5f-469f-b908-1d6b72bb5371/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631821669",
  "device_ref": "sandbox-1945"
}
```

```json
{
  "challenge_id": "03e986c6-300e-4e95-bd4f-6833333bd21b",
  "expires_at": "2026-10-29T16:09:19.008317308Z",
  "resend_available_at": "2026-10-29T16:04:20.008317308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631821669` → **200**

```json
{
  "phone": "+380631821669",
  "audience": "CLIENT",
  "code": "216857",
  "sent_at": "2026-10-29T16:04:19.010854554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03e986c6-300e-4e95-bd4f-6833333bd21b",
  "code": "216857",
  "device_ref": "sandbox-1945"
}
```

```json
{
  "session_id": "8bb7125e-6a2e-4092-966b-9a39618d48c5",
  "subject": {
    "type": "CLIENT",
    "id": "fe44264d-2d0b-4f9f-9c30-e58db3bd0f37"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTQ0MjY0ZC0yZDBiLTRmOWYtOWMzMC1lNThkYjNiZDBmMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzU5LCJpYXQiOjE3OTMyODk4NTksImp0aSI6Ijc5MWZkNzVjLWE5M2QtNGQyOS1hNDEyLTgxZTExZmY5NGM0YyIsInNpZCI6IjhiYjcxMjVlLTZhMmUtNDA5Mi05NjZiLTlhMzk2MThkNDhjNSJ9.ql2ZaZvy2lFxeFRop03Vt01w_INxUNrZUhi_CNn5W5U",
  "access_expires_at": "2026-10-29T16:19:19.306913698Z",
  "refresh_token": "hL8QG64TdcG9snH42jaEZc6U2eqjy6_GcMbP7AZWZtQ",
  "refresh_expires_at": "2026-11-28T16:04:19.306442312Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/cd6593f8-9b5f-469f-b908-1d6b72bb5371/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/cd6593f8-9b5f-469f-b908-1d6b72bb5371/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "dd1ad309-e70d-441f-b60f-6cecaf70aba4"
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
  "session_id": "7c6b3f4b-bc1a-4854-9a88-cd8b2ae2b0e9",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3NjAsImlhdCI6MTc5MzI4OTg2MCwianRpIjoiZGY4NTc0OWQtZWQyMS00ZjAwLWIyZTItZDkxZDM2NWNiZDJjIiwic2lkIjoiN2M2YjNmNGItYmMxYS00ODU0LTlhODgtY2Q4YjJhZTJiMGU5In0.I3MR9afZ7Aq-ejN_tQmr0QPwu1NM28FAXZEphw0NucU",
  "access_expires_at": "2026-10-29T16:19:20.171616977Z",
  "refresh_token": "tnoRcp7vuj9AYHBmTm5CnRo15vkT_xKETeUIIA4lI9M",
  "refresh_expires_at": "2026-10-30T04:04:20.171160634Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c4f26a0c-b911-41a8-a754-55e1a5f45554",
  "session_id": "d79b10f2-7dbf-41ed-88b3-e4bc91b135db",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/c4f26a0c-b911-41a8-a754-55e1a5f45554/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "cd6593f8-9b5f-469f-b908-1d6b72bb5371",
      "state": "READY",
      "created_at": "2026-10-29T16:04:14.637397Z",
      "ready_at": "2026-10-29T16:04:17.51327Z",
      "expires_at": "2026-11-05T16:04:17.51327Z",
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
  "device_ref": "sandbox-4756"
}
```

```json
{
  "challenge_id": "03c8d249-3498-4c0d-a0cf-d81a9143f782",
  "expires_at": "2026-10-29T16:09:20.969193468Z",
  "resend_available_at": "2026-10-29T16:04:21.969193468Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "511151",
  "sent_at": "2026-10-29T16:04:20.971914941Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03c8d249-3498-4c0d-a0cf-d81a9143f782",
  "code": "511151",
  "device_ref": "sandbox-4756"
}
```

```json
{
  "session_id": "f12fcb85-7124-4ff5-9a8e-c9df95305240",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDc2MSwiaWF0IjoxNzkzMjg5ODYxLCJqdGkiOiI2ODM1OWUwZS01OWVmLTQwY2ItYTZmYy02NjlkMGUxMjBkMjAiLCJzaWQiOiJmMTJmY2I4NS03MTI0LTRmZjUtOWE4ZS1jOWRmOTUzMDUyNDAifQ.rflga_Xz2O6t17sEVMY253NQzb1qVorTm66_kt1E-AE",
  "access_expires_at": "2026-10-29T16:19:21.27525218Z",
  "refresh_token": "-6c90n8I7-UtEthEBvtKjo3MI3iX8UAcqhyn9jcBZhQ",
  "refresh_expires_at": "2026-11-28T16:04:21.274745686Z",
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
  "device_ref": "sandbox-13395"
}
```

```json
{
  "challenge_id": "2b8c29b1-2602-4b92-978f-6d9c78e49aa0",
  "expires_at": "2026-10-29T16:09:21.802391881Z",
  "resend_available_at": "2026-10-29T16:04:22.802391881Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "622314",
  "sent_at": "2026-10-29T16:04:21.804741567Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b8c29b1-2602-4b92-978f-6d9c78e49aa0",
  "code": "622314",
  "device_ref": "sandbox-13395"
}
```

```json
{
  "session_id": "f94070dd-b9e2-406f-9d9b-df8d5a3092cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDc2MiwiaWF0IjoxNzkzMjg5ODYyLCJqdGkiOiJmOGE2YjA4Yi05MWI4LTRjMDItYTBjZS0yNjIwOGFjNzc2OWIiLCJzaWQiOiJmOTQwNzBkZC1iOWUyLTQwNmYtOWQ5Yi1kZjhkNWEzMDkyY2QifQ.6bEcfz3U5HZ4RaybfCYaP-8Kqzs7HNNC62UUrKzLioo",
  "access_expires_at": "2026-10-29T16:19:22.101046541Z",
  "refresh_token": "i-g56AKdL1BEK_X2CvUmsY0LvEpCSlnbZobKYdp7tJU",
  "refresh_expires_at": "2026-11-28T16:04:22.100418472Z",
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
  "command_id": "bf47b08e-8430-4fbb-9b3f-f12714a3ac10",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:22Z",
    "sequence": 1793289862633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5f68fdeb-849c-4aed-b001-4f6aeb9a4850",
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
  "last_heartbeat_at": "2026-10-29T16:04:22.651166Z",
  "last_location_at": "2026-10-29T16:04:22.651166Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26151"
}
```

```json
{
  "challenge_id": "b4feff6a-dd36-4fcb-9013-4367112f02a8",
  "expires_at": "2026-10-29T16:09:22.936429069Z",
  "resend_available_at": "2026-10-29T16:04:23.936429069Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "405511",
  "sent_at": "2026-10-29T16:04:22.939052655Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4feff6a-dd36-4fcb-9013-4367112f02a8",
  "code": "405511",
  "device_ref": "sandbox-26151"
}
```

```json
{
  "session_id": "cf8128d8-4900-48ca-b21b-360894c4afcc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDc2MywiaWF0IjoxNzkzMjg5ODYzLCJqdGkiOiI0NTAyMzVkMS0zYWFlLTRhYjQtODZmMS1kMGI3YTQyODg0NzMiLCJzaWQiOiJjZjgxMjhkOC00OTAwLTQ4Y2EtYjIxYi0zNjA4OTRjNGFmY2MifQ.NY6Vodfwru9bsNa_NAMdoBnD3eDdwcjhTQOntVeKqKg",
  "access_expires_at": "2026-10-29T16:19:23.237634776Z",
  "refresh_token": "VHhXfLpQbbEaFy9M41isg_o1k5N0xBr7sTvpKlY3fgA",
  "refresh_expires_at": "2026-11-28T16:04:23.237068629Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b86b0613-b86a-4e2b-b094-b543f4ed13a3",
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
  "last_heartbeat_at": "2026-10-29T16:02:51.848532Z",
  "last_location_at": "2026-10-29T16:02:51.848532Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b86b0613-b86a-4e2b-b094-b543f4ed13a3/handover` → **200**

```json
{
  "command_id": "6d103823-b34e-41cc-9a48-22d95e1ee101",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b86b0613-b86a-4e2b-b094-b543f4ed13a3",
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
  "last_heartbeat_at": "2026-10-29T16:02:51.848532Z",
  "last_location_at": "2026-10-29T16:02:51.848532Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b86b0613-b86a-4e2b-b094-b543f4ed13a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:24Z",
    "sequence": 1793289864539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b86b0613-b86a-4e2b-b094-b543f4ed13a3",
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
  "last_heartbeat_at": "2026-10-29T16:04:24.072061Z",
  "last_location_at": "2026-10-29T16:04:24.072061Z",
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
  "session_id": "a8551275-653b-44a7-a7bd-b19357a05799",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3NjQsImlhdCI6MTc5MzI4OTg2NCwianRpIjoiNmMwYTJlNDgtMDgyNi00OTEyLTkxMDktOWRhOGVjYWRiZmMxIiwic2lkIjoiYTg1NTEyNzUtNjUzYi00NGE3LWE3YmQtYjE5MzU3YTA1Nzk5In0.wy791zzOV1OCd-kipwSEj2Avk52L3EEwwlL0fBZNtM8",
  "access_expires_at": "2026-10-29T16:19:24.657422789Z",
  "refresh_token": "aUrUOPGhFZfPwf6vbiiRFy70x8Uht1eXq4fvIRIjDZs",
  "refresh_expires_at": "2026-10-30T04:04:24.65695142Z",
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
  "session_id": "ff85f3e1-411c-452c-9292-cf3b03dec5cb",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3NjUsImlhdCI6MTc5MzI4OTg2NSwianRpIjoiZWUyOWE0OTAtZDY0NC00NDhiLTg2ODEtZDFmNjc0NjAyMjY4Iiwic2lkIjoiZmY4NWYzZTEtNDExYy00NTJjLTkyOTItY2YzYjAzZGVjNWNiIn0.cXGM-qTVbeoUKD_1mEsgbWJ37B0l5BZbVO0pTeQ7yFQ",
  "access_expires_at": "2026-10-29T16:19:25.250079726Z",
  "refresh_token": "4Gg4JPh2C8kWUTlkE7JRjFbd-Mf0WLfUWGXwATbauHs",
  "refresh_expires_at": "2026-10-30T04:04:25.249619312Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686288659",
  "device_ref": "sandbox-5136"
}
```

```json
{
  "challenge_id": "2a15756f-3222-4e51-9e07-09c832f9fe62",
  "expires_at": "2026-10-29T16:09:25.521721279Z",
  "resend_available_at": "2026-10-29T16:04:26.521721279Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686288659` → **200**

```json
{
  "phone": "+380686288659",
  "audience": "CLIENT",
  "code": "875574",
  "sent_at": "2026-10-29T16:04:25.52424971Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a15756f-3222-4e51-9e07-09c832f9fe62",
  "code": "875574",
  "device_ref": "sandbox-5136"
}
```

```json
{
  "session_id": "6876317c-71a3-44e9-af8b-655adde2c8d7",
  "subject": {
    "type": "CLIENT",
    "id": "40a919f9-5462-4b83-aef1-f494ab235b89"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGE5MTlmOS01NDYyLTRiODMtYWVmMS1mNDk0YWIyMzViODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzY1LCJpYXQiOjE3OTMyODk4NjUsImp0aSI6IjlhNzY4NTZkLTEyNzAtNDY4Ny1iM2QyLWE4ZGU2ODA0MTE4OCIsInNpZCI6IjY4NzYzMTdjLTcxYTMtNDRlOS1hZjhiLTY1NWFkZGUyYzhkNyJ9.SkGFw9zOZFaDcsRfhE6sQtpYLJdcFPPS-DeFDmoLNfM",
  "access_expires_at": "2026-10-29T16:19:25.821956216Z",
  "refresh_token": "c5uSGq2XpsWFlmTSrsNYf6MuRcm_A7eVIYckRffsNV0",
  "refresh_expires_at": "2026-11-28T16:04:25.821503947Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "240798cf-05c0-4ff5-9036-f273647b56be",
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
  "id": "624a5f6f-78a5-49c8-823c-f53b3cba271f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:09:26.098079Z",
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
  "command_id": "c735a701-1309-4ce4-9a67-60bf0668f29f",
  "quote_id": "624a5f6f-78a5-49c8-823c-f53b3cba271f",
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
  "id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "40a919f9-5462-4b83-aef1-f494ab235b89",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:04:26.386611Z",
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
    "id": "5538c118-d57a-43b9-85f4-b254f1f5794d",
    "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
    "expires_at": "2026-10-29T16:04:41.390921Z",
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

`POST /api/driver/v1/offers/5538c118-d57a-43b9-85f4-b254f1f5794d/reject` → **204**

```json
{
  "command_id": "2490d0ce-7e0a-42c4-b275-83b0c3f9e687"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2b529f2d-4ab8-439b-9d67-f37364c096a1",
    "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
    "expires_at": "2026-10-29T16:04:41.970405Z",
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

`POST /api/driver/v1/offers/2b529f2d-4ab8-439b-9d67-f37364c096a1/accept` → **200**

```json
{
  "command_id": "ec0f5808-495f-412c-ba92-2c52f7efa911"
}
```

```json
{
  "id": "77b7f109-df84-4528-bf0e-4bcb01025acb",
  "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7df6f8ed-f715-4592-bdbd-41d51bc3aa55",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/13051c7a-e17b-41c7-9d17-45ac37ca153c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T16:04:26.387319Z",
      "actor": {
        "type": "CLIENT",
        "id": "40a919f9-5462-4b83-aef1-f494ab235b89",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
        "quote_id": "624a5f6f-78a5-49c8-823c-f53b3cba271f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "71ae9ecc-cfad-4ae2-8a0b-9968c135c765"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T16:04:26.389884Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
        "attempt_id": "e70b1a70-1e6d-4bbc-8f5c-ed7466c5b80a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "71ae9ecc-cfad-4ae2-8a0b-9968c135c765"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T16:04:26.394794Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5538c118-d57a-43b9-85f4-b254f1f5794d",
        "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "71ae9ecc-cfad-4ae2-8a0b-9968c135c765"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T16:04:26.969322Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5538c118-d57a-43b9-85f4-b254f1f5794d",
        "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c"
      },
      "correlation_id": "faeff956-25c6-4159-b77b-c25ba1377782"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 13051c7a-e17b-41c7-9d17-45ac37ca153c — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/13051c7a-e17b-41c7-9d17-45ac37ca153c` → **200**

```json
{
  "id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "40a919f9-5462-4b83-aef1-f494ab235b89",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "77b7f109-df84-4528-bf0e-4bcb01025acb",
    "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7df6f8ed-f715-4592-bdbd-41d51bc3aa55",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T16:04:26.386611Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/13051c7a-e17b-41c7-9d17-45ac37ca153c/cancel` → **200**

```json
{
  "command_id": "f0d4e291-014b-4d97-81bb-87728ad41300",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "40a919f9-5462-4b83-aef1-f494ab235b89",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "77b7f109-df84-4528-bf0e-4bcb01025acb",
    "order_id": "13051c7a-e17b-41c7-9d17-45ac37ca153c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7df6f8ed-f715-4592-bdbd-41d51bc3aa55",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T16:04:26.386611Z",
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
  "session_id": "5f68fdeb-849c-4aed-b001-4f6aeb9a4850",
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
  "last_heartbeat_at": "2026-10-29T16:04:22.651166Z",
  "last_location_at": "2026-10-29T16:04:22.651166Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5f68fdeb-849c-4aed-b001-4f6aeb9a4850/close` → **200**

```json
{
  "command_id": "96b10d96-b37a-4b0d-81a2-d4b36e522fab",
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
  "session_id": "b86b0613-b86a-4e2b-b094-b543f4ed13a3",
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
  "last_heartbeat_at": "2026-10-29T16:04:24.072061Z",
  "last_location_at": "2026-10-29T16:04:24.072061Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b86b0613-b86a-4e2b-b094-b543f4ed13a3/close` → **200**

```json
{
  "command_id": "50ddb147-ceea-4053-a49b-bdb41cb8adb3",
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
  "session_id": "0c798cfd-afe4-47b3-bdbb-9c85333c45ce",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3NjksImlhdCI6MTc5MzI4OTg2OSwianRpIjoiZjYwZGEyMWMtMjBhYS00ZGUxLWIyYWQtNWIyOGFmNTE5ODE0Iiwic2lkIjoiMGM3OThjZmQtYWZlNC00N2IzLWJkYmItOWM4NTMzM2M0NWNlIn0.srYvfnFpqY5lhFikCl2Yg1g_6F926Vqrw-5UnBSSJlY",
  "access_expires_at": "2026-10-29T16:19:29.902656249Z",
  "refresh_token": "a5AFqNnLhUw2NFDEeemwWoNIZ-bDwhgluwQ9f9MO8R0",
  "refresh_expires_at": "2026-10-30T04:04:29.901958478Z",
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
  "command_id": "34c420a9-6267-414a-9c05-1af22448b0f1",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T16:04:30.465044Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "0ec69a4c-299d-4064-bcd5-2210363b7519",
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
  "correlation_id": "73b523d5-a79c-47b2-90b1-a9783fba708b"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "c742715b-5830-4d08-89da-bc85b897e3ba",
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
  "correlation_id": "80fd4675-645e-402a-9ff5-e6b9764c0c2a"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635048849",
  "device_ref": "sandbox-2065"
}
```

```json
{
  "challenge_id": "d17b903e-56a5-4e09-a960-568f7216a349",
  "expires_at": "2026-10-29T16:09:31.3065872Z",
  "resend_available_at": "2026-10-29T16:04:32.3065872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635048849` → **200**

```json
{
  "phone": "+380635048849",
  "audience": "CLIENT",
  "code": "645313",
  "sent_at": "2026-10-29T16:04:31.30972532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d17b903e-56a5-4e09-a960-568f7216a349",
  "code": "645313",
  "device_ref": "sandbox-2065"
}
```

```json
{
  "session_id": "a991cec9-c213-4bf4-b52c-dab378cd19e6",
  "subject": {
    "type": "CLIENT",
    "id": "595cdece-b693-46cd-9a9c-cd65db824cce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OTVjZGVjZS1iNjkzLTQ2Y2QtOWE5Yy1jZDY1ZGI4MjRjY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzcxLCJpYXQiOjE3OTMyODk4NzEsImp0aSI6ImQ2NzA1YmNjLTEyMWItNGIxNC1iYmUyLWE2NGI2NmQwOTU4OSIsInNpZCI6ImE5OTFjZWM5LWMyMTMtNGJmNC1iNTJjLWRhYjM3OGNkMTllNiJ9.yzTvfP5V5lHS8FX7G60MxPCm4ot2u4TD4q9KQPOZ4_w",
  "access_expires_at": "2026-10-29T16:19:31.599381967Z",
  "refresh_token": "94sCEtth6qm6rVjrw7PB21ZyxKD6ByAJcuiGtbrLBLc",
  "refresh_expires_at": "2026-11-28T16:04:31.598866821Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9436038e-cab1-410a-8fa5-871ed45dfcdc",
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
  "id": "5b6296bd-bd02-4d30-953d-7f054f344811",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:09:31.875883Z",
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
  "command_id": "877569ba-e776-4ecd-b0e5-08f27cdd5aae",
  "quote_id": "5b6296bd-bd02-4d30-953d-7f054f344811",
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
  "correlation_id": "fae4be19-4ae6-41f5-b52e-fad2b33e6a2e"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "13652c8d-a018-4add-b54c-9ba25db05847",
  "quote_id": "5b6296bd-bd02-4d30-953d-7f054f344811",
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
  "id": "a3bd9891-4785-43c4-9edb-8ea2ef0c2b94",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "595cdece-b693-46cd-9a9c-cd65db824cce",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:04:32.445293Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a3bd9891-4785-43c4-9edb-8ea2ef0c2b94/cancel` → **200**

```json
{
  "command_id": "1a2aeab0-c1ae-4dbd-b0af-d348e1ca242e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a3bd9891-4785-43c4-9edb-8ea2ef0c2b94",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "595cdece-b693-46cd-9a9c-cd65db824cce",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:04:32.445293Z",
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
  "command_id": "5caaedd3-a0e8-4e18-b146-db6a38f1cad1",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T16:04:33.05093Z"
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
      "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T16:04:33.05093Z"
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
  "device_ref": "sandbox-23960"
}
```

```json
{
  "challenge_id": "a874523d-8373-4a3c-b55a-c588d3706edd",
  "expires_at": "2026-10-29T16:09:33.894952764Z",
  "resend_available_at": "2026-10-29T16:04:34.894952764Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "164806",
  "sent_at": "2026-10-29T16:04:33.897612554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a874523d-8373-4a3c-b55a-c588d3706edd",
  "code": "164806",
  "device_ref": "sandbox-23960"
}
```

```json
{
  "session_id": "4d8475f5-fa45-4bdc-a9ea-de0bbebf4ac2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDc3NCwiaWF0IjoxNzkzMjg5ODc0LCJqdGkiOiJkYzBlMDU4ZC0wNDgyLTQzMWMtODU2MS1jNzllNWEzODMzZTkiLCJzaWQiOiI0ZDg0NzVmNS1mYTQ1LTRiZGMtYTllYS1kZTBiYmViZjRhYzIifQ.DokCD0AJMSzLVr4eNW5bWYI0ogIGXDww_r1-z5Rrb8o",
  "access_expires_at": "2026-10-29T16:19:34.188740435Z",
  "refresh_token": "N5Uv6oDVwIors9Rvlw2qeewCg3FY1P9rVyWF_E9crNo",
  "refresh_expires_at": "2026-11-28T16:04:34.188174208Z",
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
  "command_id": "c74cafa4-376e-480f-9d46-21afd0341d53",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:34Z",
    "sequence": 1793289874725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:34.743892Z",
  "last_location_at": "2026-10-29T16:04:34.743892Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675769364",
  "device_ref": "sandbox-1078"
}
```

```json
{
  "challenge_id": "cb9a13aa-1b55-4245-9dd1-bf0530dd1e45",
  "expires_at": "2026-10-29T16:09:35.019233722Z",
  "resend_available_at": "2026-10-29T16:04:36.019233722Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675769364` → **200**

```json
{
  "phone": "+380675769364",
  "audience": "CLIENT",
  "code": "485408",
  "sent_at": "2026-10-29T16:04:35.02176547Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb9a13aa-1b55-4245-9dd1-bf0530dd1e45",
  "code": "485408",
  "device_ref": "sandbox-1078"
}
```

```json
{
  "session_id": "e89bc3ef-494a-4005-b937-a07ba40f3dc0",
  "subject": {
    "type": "CLIENT",
    "id": "76781ae6-97fc-4b38-a345-7d21747eab21"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3Njc4MWFlNi05N2ZjLTRiMzgtYTM0NS03ZDIxNzQ3ZWFiMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzc1LCJpYXQiOjE3OTMyODk4NzUsImp0aSI6IjM3OWY3OWI4LWExYWMtNGFmMy05MDMwLTE1MWVlYTI0YmI4YyIsInNpZCI6ImU4OWJjM2VmLTQ5NGEtNDAwNS1iOTM3LWEwN2JhNDBmM2RjMCJ9.jOJoc-enz4iMRQDIdZh7AGvqNRKpdHGlQg-1lXavKEg",
  "access_expires_at": "2026-10-29T16:19:35.314203984Z",
  "refresh_token": "KDkMmGHUj3AL5ROnNGZJjPC3Q5W89Cb_L-hjMovJH9M",
  "refresh_expires_at": "2026-11-28T16:04:35.313626558Z",
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
  "command_id": "f2393184-b561-445a-9463-e160e56bdd5b",
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
  "id": "3458e05b-70a0-4b27-b239-fbcc6c034b1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:09:35.852350Z",
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
  "command_id": "26a67c15-a464-4047-bde2-75660913e835",
  "platform": "ANDROID",
  "token": "sandbox-driver-e96b9ba7-684c-41df-aa23-326d381ed5b9"
}
```

```json
{
  "id": "bcd8dca9-cc74-4892-8970-889710be4cfe",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T16:04:36.13584Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "8b7e8cde-2ad6-4573-97c6-c9be71097cb8",
  "platform": "ANDROID",
  "token": "sandbox-rider-febfe8a1-39b1-4fca-abb4-7f89e8aecfab"
}
```

```json
{
  "id": "f0aee171-bf8d-4f3d-8696-0fb293a775d3",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T16:04:36.4222Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c97dafb7-5cd4-4039-a491-a9db127d010a",
  "quote_id": "3458e05b-70a0-4b27-b239-fbcc6c034b1c",
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
  "id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "76781ae6-97fc-4b38-a345-7d21747eab21",
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
  "created_at": "2026-10-29T16:04:36.70752Z",
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
    "id": "dc4c224f-7272-4634-8b5d-be324de93250",
    "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
    "expires_at": "2026-10-29T16:04:51.710898Z",
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

`POST /api/driver/v1/offers/dc4c224f-7272-4634-8b5d-be324de93250/accept` → **200**

```json
{
  "command_id": "c6bd8951-ac93-456f-9539-3c82a72e65df"
}
```

```json
{
  "id": "9ada845f-8e22-4159-b79a-e81bc6ea7b15",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b8853d23-4fb5-44fa-a468-f0d0a6d6528b",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T16:04:36.683Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T16:04:36.683Z` → **200**

```json
[
  {
    "at": "2026-10-29T16:04:38.097695234Z",
    "token_suffix": "1ed5b9",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "72d973f5-afa6-48b3-8e89-dcbe3be59f5c",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675769364&after=2026-10-29T16:04:36.683Z` → **200**

```json
[
  {
    "at": "2026-10-29T16:04:38.100782226Z",
    "token_suffix": "aecfab",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "9e8b6905-26cc-48fc-8b40-8a19e99b393b",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/c1c64712-6f2a-453f-9ab5-1b174c483258/messages` → **201**

```json
{
  "command_id": "2813f359-4ba7-422d-b7a0-5050c1810155",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "76e5ded4-eada-4ad9-b441-bed7e0723c36",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T16:04:38.647548731Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b8853d23-4fb5-44fa-a468-f0d0a6d6528b",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "assignment_id": "9ada845f-8e22-4159-b79a-e81bc6ea7b15",
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

`POST /api/driver/v1/trips/b8853d23-4fb5-44fa-a468-f0d0a6d6528b/messages` → **201**

```json
{
  "command_id": "c7336d0d-d5e2-4a65-941b-4f854db050f3",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "9c543a16-a6f8-4a91-9ce0-93edc3091c64",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T16:04:39.197736255Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/c1c64712-6f2a-453f-9ab5-1b174c483258/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b8853d23-4fb5-44fa-a468-f0d0a6d6528b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675769364"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/2c729788-dbef-49ce-80dd-4d9dcfed7b44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:39Z",
    "sequence": 1793289879997
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:40.014976Z",
  "last_location_at": "2026-10-29T16:04:40.014976Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b8853d23-4fb5-44fa-a468-f0d0a6d6528b",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "assignment_id": "9ada845f-8e22-4159-b79a-e81bc6ea7b15",
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

`POST /api/driver/v1/trips/b8853d23-4fb5-44fa-a468-f0d0a6d6528b/arrive` → **200**

```json
{
  "command_id": "95a9c13b-d243-40ad-8c4d-4d0169946182",
  "expected_version": 0
}
```

```json
{
  "id": "b8853d23-4fb5-44fa-a468-f0d0a6d6528b",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "assignment_id": "9ada845f-8e22-4159-b79a-e81bc6ea7b15",
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
  "arrived_at": "2026-10-29T16:04:40.557321Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b8853d23-4fb5-44fa-a468-f0d0a6d6528b/start` → **200**

```json
{
  "command_id": "b6981726-12db-4274-a42f-74173ae45947",
  "expected_version": 1
}
```

```json
{
  "id": "b8853d23-4fb5-44fa-a468-f0d0a6d6528b",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "assignment_id": "9ada845f-8e22-4159-b79a-e81bc6ea7b15",
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
  "arrived_at": "2026-10-29T16:04:40.557321Z",
  "started_at": "2026-10-29T16:04:40.840266Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2c729788-dbef-49ce-80dd-4d9dcfed7b44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:41Z",
    "sequence": 1793289881117
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:41.136854Z",
  "last_location_at": "2026-10-29T16:04:41.136854Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b8853d23-4fb5-44fa-a468-f0d0a6d6528b/complete` → **200**

```json
{
  "command_id": "259951d9-fad1-455f-ba27-28f50783a143",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:04:41Z",
  "cash_received": true
}
```

```json
{
  "id": "b8853d23-4fb5-44fa-a468-f0d0a6d6528b",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "assignment_id": "9ada845f-8e22-4159-b79a-e81bc6ea7b15",
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
  "arrived_at": "2026-10-29T16:04:40.557321Z",
  "started_at": "2026-10-29T16:04:40.840266Z",
  "completed_at": "2026-10-29T16:04:41.416444Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/c1c64712-6f2a-453f-9ab5-1b174c483258` → **200**

```json
{
  "id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "76781ae6-97fc-4b38-a345-7d21747eab21",
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
    "id": "9ada845f-8e22-4159-b79a-e81bc6ea7b15",
    "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b8853d23-4fb5-44fa-a468-f0d0a6d6528b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T16:04:36.70752Z",
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
    "id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T16:04:36.70752Z",
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
    "id": "b8853d23-4fb5-44fa-a468-f0d0a6d6528b",
    "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
    "order_short_number": 13,
    "created_at": "2026-10-29T16:04:37.26886Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "64128211-f546-4917-aeb4-17d9098a7a90",
    "order_id": "edd40525-0fdd-40ea-a780-bf3ba813d643",
    "order_short_number": 8,
    "created_at": "2026-10-29T16:03:23.8876Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "b3601218-6884-452c-b2d5-a84b86298091",
    "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
    "order_short_number": 3,
    "created_at": "2026-10-29T16:02:42.632137Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7655822e-db2b-4a5f-9d32-422231d9f3c4",
    "order_id": "078b4f8f-1ee9-4770-b4f1-02c32dedfcf8",
    "order_short_number": 2,
    "created_at": "2026-10-29T16:02:21.306003Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f187c85c-67ed-48b1-8b59-4f1361202017",
    "order_id": "8bfa15c7-4609-41af-8f7d-008d1022365a",
    "order_short_number": 1,
    "created_at": "2026-10-29T16:02:11.622491Z",
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

`GET /api/rider/v1/orders/c1c64712-6f2a-453f-9ab5-1b174c483258/tip` → **200**

```json
{
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
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
  "available_until": "2026-10-30T16:04:41.416444Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c1c64712-6f2a-453f-9ab5-1b174c483258/tip` → **201**

```json
{
  "command_id": "755c76b0-c21f-4d84-b21e-978b6aa769e8",
  "amount_minor": 1100
}
```

```json
{
  "id": "10342154-55e0-43c6-857f-852324345ee8",
  "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T16:04:46.392024Z"
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
  "session_id": "15c2c2f9-3918-4e08-8e41-504320aef80c",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3ODYsImlhdCI6MTc5MzI4OTg4NiwianRpIjoiZWUyZTVlYmItNzQ2Zi00YTEyLWJkY2ItOWYzOTk4NjQ5ZDAwIiwic2lkIjoiMTVjMmMyZjktMzkxOC00ZTA4LThlNDEtNTA0MzIwYWVmODBjIn0.d1vuRV-eweun50i5c-Xd_rl_OtXSmsea0u1qt4KgZrI",
  "access_expires_at": "2026-10-29T16:19:46.990875485Z",
  "refresh_token": "pn5fnowMeESCw9dzGkkBWZtXevPSUAh_oGaBJfFcN74",
  "refresh_expires_at": "2026-10-30T04:04:46.990431071Z",
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
  "generated_at": "2026-10-29T16:04:47.26109821Z"
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
  "generated_at": "2026-10-29T16:04:47.541460489Z"
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
  "session_id": "4a28cd7a-18da-4d54-adaa-98c8a3b9d554",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3ODgsImlhdCI6MTc5MzI4OTg4OCwianRpIjoiMTA5NTgxNjktYjJhNy00ZDVlLWFiYWYtMmFkNGQyZjk4YzM5Iiwic2lkIjoiNGEyOGNkN2EtMThkYS00ZDU0LWFkYWEtOThjOGEzYjlkNTU0In0.9XkNY7WQkfv23Zc6vWwprbzDqa2fsGs4WoKi7L7P_5A",
  "access_expires_at": "2026-10-29T16:19:48.131409191Z",
  "refresh_token": "gvDsdjQ67OHRVXsin_-_WtJTlr19KWBVQ64HlRrxAr4",
  "refresh_expires_at": "2026-10-30T04:04:48.130665643Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c1c64712-6f2a-453f-9ab5-1b174c483258/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T16:04:36.708054Z",
      "actor": {
        "type": "CLIENT",
        "id": "76781ae6-97fc-4b38-a345-7d21747eab21",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
        "quote_id": "3458e05b-70a0-4b27-b239-fbcc6c034b1c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "36c6213b-c9a5-4974-89d0-dc863b1d7f0a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T16:04:36.709989Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
        "attempt_id": "df9ef83a-a963-4ba3-a692-5d117fdca586",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "36c6213b-c9a5-4974-89d0-dc863b1d7f0a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T16:04:36.713117Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "dc4c224f-7272-4634-8b5d-be324de93250",
        "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "36c6213b-c9a5-4974-89d0-dc863b1d7f0a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T16:04:37.270245Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "dc4c224f-7272-4634-8b5d-be324de93250",
        "order_id": "c1c64712-6f2a-453f-9ab5-1b174c483258",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9ada845f-8e22-4159-b79a-e81bc6ea7b15"
      },
      "correlation_id": "f1d67741-976d-40d5-9e31-98b28e6d1ead"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T16:04:48.684289318Z",
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
      "last_location_at": "2026-10-29T16:04:41.136854Z",
      "order_id": null
    }
  ]
}
```

Done: order c1c64712-6f2a-453f-9ab5-1b174c483258.

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
  "session_id": "977cfd5b-469c-4556-9a00-bf4e0e580a1f",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3ODksImlhdCI6MTc5MzI4OTg4OSwianRpIjoiODNlYTEzNzEtMjFmOS00NTc0LTg2ZDMtNjMyNWNiY2ZhMzJiIiwic2lkIjoiOTc3Y2ZkNWItNDY5Yy00NTU2LTlhMDAtYmY0ZTBlNTgwYTFmIn0.PFkmm6o1ebkohNOk4euTXBgKtmUGNMukvkGL9GOKTlU",
  "access_expires_at": "2026-10-29T16:19:49.293774388Z",
  "refresh_token": "G24KMMgYIk05Ltt3a5ojgzDWLB97_MVK7eO8rATXlG0",
  "refresh_expires_at": "2026-10-30T04:04:49.2932928Z",
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
  "command_id": "e574e2f5-6ab5-4431-abb2-0ebeeaec775f",
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
  "timestamp": "2026-10-29T16:04:50.000+0000",
  "channel": {
    "id": "1730052000.264366562",
    "linkedid": "1730052000.264366562",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674388012"
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
  "timestamp": "2026-10-29T16:04:50.000+0000",
  "channel": {
    "id": "1730052000.264366562",
    "linkedid": "1730052000.264366562",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674388012"
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
  "session_id": "2c89e1a9-4963-4391-83a3-ae8e7d50de26",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3OTAsImlhdCI6MTc5MzI4OTg5MCwianRpIjoiYWEyY2M1NDktZDI4NS00OGQ3LThhZmQtZjJlY2Y2NjdmZjc1Iiwic2lkIjoiMmM4OWUxYTktNDk2My00MzkxLTgzYTMtYWU4ZTdkNTBkZTI2In0.E8BQsXY0DPDn0BjxwD6x-6peS2iLy_a5MQNE5vww7IA",
  "access_expires_at": "2026-10-29T16:19:50.472598509Z",
  "refresh_token": "_g9BXSSsryy1Yap964pFnjqcXMXfwcikNpCc_9jpXHs",
  "refresh_expires_at": "2026-10-30T04:04:50.472059905Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "ac4af063-e003-446d-be88-9f9ad4044847",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674388012",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T16:04:50Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/ac4af063-e003-446d-be88-9f9ad4044847/answer` → **200**

```json
{
  "command_id": "378f542e-9b29-43ca-8efc-2cade966b559"
}
```

```json
{
  "id": "ac4af063-e003-446d-be88-9f9ad4044847",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674388012",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "order_ids": [],
  "started_at": "2026-10-29T16:04:50Z",
  "answered_at": "2026-10-29T16:04:51.020661Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.264366562",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b79a57a0-8c77-4997-bddd-07d1c8d1e772",
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
  "id": "26760d89-06c5-44f4-910b-5da64d43a698",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:09:51.331885Z",
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
  "command_id": "3f9b7513-01bb-4fb7-b9a1-133ae6133ebe",
  "quote_id": "26760d89-06c5-44f4-910b-5da64d43a698",
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
    "phone": "+380674388012"
  },
  "call_id": "ac4af063-e003-446d-be88-9f9ad4044847"
}
```

```json
{
  "id": "82a792a3-863a-4acd-b63d-22b77b042ce2",
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
  "created_at": "2026-10-29T16:04:51.619757Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674388012"
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
    "id": "1730052000.264366562",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ac4af063-e003-446d-be88-9f9ad4044847",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674388012",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [
        "82a792a3-863a-4acd-b63d-22b77b042ce2"
      ],
      "started_at": "2026-10-29T16:04:50Z",
      "answered_at": "2026-10-29T16:04:51.020661Z",
      "ended_at": "2026-10-29T16:04:51.926036Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "aec0fd26-765c-4b52-be54-cdc3e8fb80d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672432904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [],
      "started_at": "2026-10-29T16:02:29.294312Z",
      "answered_at": "2026-10-29T16:02:29.600951Z",
      "ended_at": "2026-10-29T16:02:29.902859Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T16:02:37.461427Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/82a792a3-863a-4acd-b63d-22b77b042ce2` → **200**

```json
{
  "id": "82a792a3-863a-4acd-b63d-22b77b042ce2",
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
  "created_at": "2026-10-29T16:04:51.619757Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674388012"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/82a792a3-863a-4acd-b63d-22b77b042ce2` → **200**

```json
{
  "id": "82a792a3-863a-4acd-b63d-22b77b042ce2",
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
  "created_at": "2026-10-29T16:04:51.619757Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674388012"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/82a792a3-863a-4acd-b63d-22b77b042ce2/cancel` → **200**

```json
{
  "command_id": "c984507f-56fd-4639-baa4-085e5975d2da",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "82a792a3-863a-4acd-b63d-22b77b042ce2",
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
  "created_at": "2026-10-29T16:04:51.619757Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674388012"
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

Done: call ac4af063-e003-446d-be88-9f9ad4044847 with order 82a792a3-863a-4acd-b63d-22b77b042ce2.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-279"
}
```

```json
{
  "challenge_id": "caf8739d-ab25-4a84-81df-17b2f2496d54",
  "expires_at": "2026-10-29T16:09:53.120983983Z",
  "resend_available_at": "2026-10-29T16:04:54.120983983Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "185568",
  "sent_at": "2026-10-29T16:04:53.123561205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "caf8739d-ab25-4a84-81df-17b2f2496d54",
  "code": "185568",
  "device_ref": "sandbox-279"
}
```

```json
{
  "session_id": "b621f7b3-2b14-4d5f-9a64-20832069e57f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDc5MywiaWF0IjoxNzkzMjg5ODkzLCJqdGkiOiJhYzBjNjA3ZS1hZTZmLTQxZTQtYmYzZS0zMTRmOWM5ZWVkNmUiLCJzaWQiOiJiNjIxZjdiMy0yYjE0LTRkNWYtOWE2NC0yMDgzMjA2OWU1N2YifQ.gFgvzPEg92e8yWrWp3n4hMe928DHMUJYDu4vx0c3ca0",
  "access_expires_at": "2026-10-29T16:19:53.42984801Z",
  "refresh_token": "tJnNHlpSnVYbVMxz435qQfbaA1oahXv7d6RxaxarM0A",
  "refresh_expires_at": "2026-11-28T16:04:53.429267471Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:41.136854Z",
  "last_location_at": "2026-10-29T16:04:41.136854Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c729788-dbef-49ce-80dd-4d9dcfed7b44/handover` → **200**

```json
{
  "command_id": "08009289-7924-45e6-8826-f6e11e5807e5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:41.136854Z",
  "last_location_at": "2026-10-29T16:04:41.136854Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c729788-dbef-49ce-80dd-4d9dcfed7b44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:54Z",
    "sequence": 1793289894252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:54.271139Z",
  "last_location_at": "2026-10-29T16:04:54.271139Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666150730",
  "device_ref": "sandbox-6272"
}
```

```json
{
  "challenge_id": "60cc003f-7ce8-455f-82a3-4b684b023508",
  "expires_at": "2026-10-29T16:09:54.540764552Z",
  "resend_available_at": "2026-10-29T16:04:55.540764552Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666150730` → **200**

```json
{
  "phone": "+380666150730",
  "audience": "CLIENT",
  "code": "619006",
  "sent_at": "2026-10-29T16:04:54.543385334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60cc003f-7ce8-455f-82a3-4b684b023508",
  "code": "619006",
  "device_ref": "sandbox-6272"
}
```

```json
{
  "session_id": "de50a4f8-bd98-40cd-80e6-1021bf12f927",
  "subject": {
    "type": "CLIENT",
    "id": "01e17edf-5597-49cb-b927-aab041782722"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMWUxN2VkZi01NTk3LTQ5Y2ItYjkyNy1hYWIwNDE3ODI3MjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwNzk0LCJpYXQiOjE3OTMyODk4OTQsImp0aSI6ImQzZTMyMmVkLTExZDYtNGJiNi1iYjg1LTlhZmU3ZTZiMmQ2NSIsInNpZCI6ImRlNTBhNGY4LWJkOTgtNDBjZC04MGU2LTEwMjFiZjEyZjkyNyJ9.-PSAe2y2yCFxnuqNB99SoRPcxLfxuwoivhkcbL6Dn4o",
  "access_expires_at": "2026-10-29T16:19:54.840465814Z",
  "refresh_token": "HSfcgOeBp-vlek72kBGE0nadl03IodWsV6HGlKfKN40",
  "refresh_expires_at": "2026-11-28T16:04:54.839523637Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ac2e442-ac0d-4e91-9b9e-588071e7e22e",
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
  "id": "3e4a58d5-10da-43a8-a2aa-a7a365c754aa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:09:55.117415Z",
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
  "command_id": "7d3d6645-564e-4e0c-8884-c8e623752d11",
  "quote_id": "3e4a58d5-10da-43a8-a2aa-a7a365c754aa",
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
  "id": "571af098-7c16-48af-949b-0663e802242f",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "01e17edf-5597-49cb-b927-aab041782722",
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
  "created_at": "2026-10-29T16:04:55.402299Z",
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
    "id": "f2681175-cfec-475a-8cc6-e86a5890d279",
    "order_id": "571af098-7c16-48af-949b-0663e802242f",
    "expires_at": "2026-10-29T16:05:10.405041Z",
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

`POST /api/driver/v1/offers/f2681175-cfec-475a-8cc6-e86a5890d279/accept` → **200**

```json
{
  "command_id": "e93ee6c6-7bf1-49b3-8fcb-13bd2ac205f7"
}
```

```json
{
  "id": "c046d409-8224-41a1-b2ac-35d29af5a393",
  "order_id": "571af098-7c16-48af-949b-0663e802242f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "742a9725-9cc3-4706-a96c-14b3148651aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "742a9725-9cc3-4706-a96c-14b3148651aa",
  "order_id": "571af098-7c16-48af-949b-0663e802242f",
  "assignment_id": "c046d409-8224-41a1-b2ac-35d29af5a393",
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

`POST /api/driver/v1/work-sessions/2c729788-dbef-49ce-80dd-4d9dcfed7b44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:56Z",
    "sequence": 1793289896500
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:56.518112Z",
  "last_location_at": "2026-10-29T16:04:56.518112Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/742a9725-9cc3-4706-a96c-14b3148651aa/arrive` → **200**

```json
{
  "command_id": "b7a87eef-29ac-439e-b558-8f9f2c44e603",
  "expected_version": 0
}
```

```json
{
  "id": "742a9725-9cc3-4706-a96c-14b3148651aa",
  "order_id": "571af098-7c16-48af-949b-0663e802242f",
  "assignment_id": "c046d409-8224-41a1-b2ac-35d29af5a393",
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
  "arrived_at": "2026-10-29T16:04:56.799247Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/742a9725-9cc3-4706-a96c-14b3148651aa/start` → **200**

```json
{
  "command_id": "2bb33c15-90d5-47ac-b694-80d73f43dd67",
  "expected_version": 1
}
```

```json
{
  "id": "742a9725-9cc3-4706-a96c-14b3148651aa",
  "order_id": "571af098-7c16-48af-949b-0663e802242f",
  "assignment_id": "c046d409-8224-41a1-b2ac-35d29af5a393",
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
  "arrived_at": "2026-10-29T16:04:56.799247Z",
  "started_at": "2026-10-29T16:04:57.091276Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/2c729788-dbef-49ce-80dd-4d9dcfed7b44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:57Z",
    "sequence": 1793289897369
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:57.386822Z",
  "last_location_at": "2026-10-29T16:04:57.386822Z",
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
  "device_ref": "sandbox-12318"
}
```

```json
{
  "challenge_id": "b9701371-1579-4c91-8ef7-1933311fc014",
  "expires_at": "2026-10-29T16:09:57.693344427Z",
  "resend_available_at": "2026-10-29T16:04:58.693344427Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "374289",
  "sent_at": "2026-10-29T16:04:57.69589754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9701371-1579-4c91-8ef7-1933311fc014",
  "code": "374289",
  "device_ref": "sandbox-12318"
}
```

```json
{
  "session_id": "075e1552-5bc4-426e-8b46-b3d5a36c79f7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDc5NywiaWF0IjoxNzkzMjg5ODk3LCJqdGkiOiI4OTM5N2U2MS1lMWU1LTQwYjgtOWU0Ni1iN2E1MGNiYjViNzkiLCJzaWQiOiIwNzVlMTU1Mi01YmM0LTQyNmUtOGI0Ni1iM2Q1YTM2Yzc5ZjcifQ.DkNphq6ekicg-fJPGU3g0YFi3HO5U7fabb0DeiaVy4o",
  "access_expires_at": "2026-10-29T16:19:57.991783114Z",
  "refresh_token": "3DUaWyQZvjKbp_Y1rGHf6Tl2AEK9WtoMj12FBHx6-OM",
  "refresh_expires_at": "2026-11-28T16:04:57.991063229Z",
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
  "command_id": "fd50d528-480c-404d-9eac-2ff54b5324db",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:04:58Z",
    "sequence": 1793289898537
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f11aad24-672c-4493-93d6-f0741bfd510c",
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
  "last_heartbeat_at": "2026-10-29T16:04:58.554558Z",
  "last_location_at": "2026-10-29T16:04:58.554558Z",
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
  "session_id": "2c91dd37-6e7d-4366-aee1-b0b54d3c6d34",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3OTksImlhdCI6MTc5MzI4OTg5OSwianRpIjoiMjU1MGY2N2EtYmZkMy00ZWZiLWEwZmEtNGYwOGEwNWI2ZTRkIiwic2lkIjoiMmM5MWRkMzctNmU3ZC00MzY2LWFlZTEtYjBiNTRkM2M2ZDM0In0.d_Otc2jIdM8xbyh2C5DJKoEVSKsI1fHDHq9PUvxxPog",
  "access_expires_at": "2026-10-29T16:19:59.143539244Z",
  "refresh_token": "pSwxda3t-XvDVR9WK6hLdc8LfC4ridexnZ631A5y3QM",
  "refresh_expires_at": "2026-10-30T04:04:59.142472363Z",
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
  "session_id": "64faa2d2-4776-4ad8-822c-3f534591375c",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA3OTksImlhdCI6MTc5MzI4OTg5OSwianRpIjoiZTI4ODY4MzMtODhhOS00YjJiLWIzYzMtZTY3NTNkYTdkYWM4Iiwic2lkIjoiNjRmYWEyZDItNDc3Ni00YWQ4LTgyMmMtM2Y1MzQ1OTEzNzVjIn0.aurq0rci-azBx5BaK1cKqiAKDvFyobQtksHpaEPFZpA",
  "access_expires_at": "2026-10-29T16:19:59.842860309Z",
  "refresh_token": "Hd650M7QpNm63jfz1s7LjfgOk_VjOWTZNE7KfZflgIU",
  "refresh_expires_at": "2026-10-30T04:04:59.842303287Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/571af098-7c16-48af-949b-0663e802242f` → **200**

```json
{
  "id": "571af098-7c16-48af-949b-0663e802242f",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "01e17edf-5597-49cb-b927-aab041782722",
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
    "id": "c046d409-8224-41a1-b2ac-35d29af5a393",
    "order_id": "571af098-7c16-48af-949b-0663e802242f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "742a9725-9cc3-4706-a96c-14b3148651aa",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T16:04:55.402299Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/571af098-7c16-48af-949b-0663e802242f/interrupt` → **200**

```json
{
  "command_id": "3f4e36e7-552b-45d7-8a0a-d12f425268a2",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "571af098-7c16-48af-949b-0663e802242f",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "01e17edf-5597-49cb-b927-aab041782722",
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
      "id": "c046d409-8224-41a1-b2ac-35d29af5a393",
      "order_id": "571af098-7c16-48af-949b-0663e802242f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "742a9725-9cc3-4706-a96c-14b3148651aa",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T16:04:55.402299Z",
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
    "id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "01e17edf-5597-49cb-b927-aab041782722",
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
    "id": "f05b9300-1cd2-446f-92c0-2f5410071b41",
    "order_id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
    "expires_at": "2026-10-29T16:05:15.424627Z",
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

`POST /api/driver/v1/offers/f05b9300-1cd2-446f-92c0-2f5410071b41/accept` → **200**

```json
{
  "command_id": "54fdeec6-d7a5-48b8-9805-9c2cfc9d53c6"
}
```

```json
{
  "id": "ccd0a05e-808f-4376-8182-ea2bd91961c3",
  "order_id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d2e61ebc-06ab-434c-832e-fb727d111282",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d2e61ebc-06ab-434c-832e-fb727d111282",
  "order_id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
  "assignment_id": "ccd0a05e-808f-4376-8182-ea2bd91961c3",
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
  "session_id": "f11aad24-672c-4493-93d6-f0741bfd510c",
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
  "last_heartbeat_at": "2026-10-29T16:04:58.554558Z",
  "last_location_at": "2026-10-29T16:04:58.554558Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f11aad24-672c-4493-93d6-f0741bfd510c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:05:01Z",
    "sequence": 1793289901826
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f11aad24-672c-4493-93d6-f0741bfd510c",
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
  "last_heartbeat_at": "2026-10-29T16:05:01.844254Z",
  "last_location_at": "2026-10-29T16:05:01.844254Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d2e61ebc-06ab-434c-832e-fb727d111282/arrive` → **200**

```json
{
  "command_id": "f45eed19-79a8-4583-af9c-ebb9d2059fa2",
  "expected_version": 0
}
```

```json
{
  "id": "d2e61ebc-06ab-434c-832e-fb727d111282",
  "order_id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
  "assignment_id": "ccd0a05e-808f-4376-8182-ea2bd91961c3",
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
  "arrived_at": "2026-10-29T16:05:02.134939Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d2e61ebc-06ab-434c-832e-fb727d111282/start` → **200**

```json
{
  "command_id": "e843fcbd-4063-489d-b992-427e6044a07f",
  "expected_version": 1
}
```

```json
{
  "id": "d2e61ebc-06ab-434c-832e-fb727d111282",
  "order_id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
  "assignment_id": "ccd0a05e-808f-4376-8182-ea2bd91961c3",
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
  "arrived_at": "2026-10-29T16:05:02.134939Z",
  "started_at": "2026-10-29T16:05:02.414757Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d2e61ebc-06ab-434c-832e-fb727d111282/complete` → **200**

```json
{
  "command_id": "357f4153-44dd-49e5-b9a9-7d21baa00502",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:05:02Z"
}
```

```json
{
  "id": "d2e61ebc-06ab-434c-832e-fb727d111282",
  "order_id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
  "assignment_id": "ccd0a05e-808f-4376-8182-ea2bd91961c3",
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
  "arrived_at": "2026-10-29T16:05:02.134939Z",
  "started_at": "2026-10-29T16:05:02.414757Z",
  "completed_at": "2026-10-29T16:05:02.709131Z",
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
    "id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T16:05:00.414605Z",
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
    "id": "571af098-7c16-48af-949b-0663e802242f",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T16:04:55.402299Z",
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

`GET /api/operator/v1/orders/571af098-7c16-48af-949b-0663e802242f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T16:04:55.40285Z",
      "actor": {
        "type": "CLIENT",
        "id": "01e17edf-5597-49cb-b927-aab041782722",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "571af098-7c16-48af-949b-0663e802242f",
        "quote_id": "3e4a58d5-10da-43a8-a2aa-a7a365c754aa",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "b054c2c3-d8e4-4a82-8931-823c0de9b409"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T16:04:55.404436Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "571af098-7c16-48af-949b-0663e802242f",
        "attempt_id": "a4a6e46d-d5d8-406f-b2d0-4dec40562aea",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b054c2c3-d8e4-4a82-8931-823c0de9b409"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T16:04:55.406762Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f2681175-cfec-475a-8cc6-e86a5890d279",
        "order_id": "571af098-7c16-48af-949b-0663e802242f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "b054c2c3-d8e4-4a82-8931-823c0de9b409"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T16:04:55.960425Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f2681175-cfec-475a-8cc6-e86a5890d279",
        "order_id": "571af098-7c16-48af-949b-0663e802242f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c046d409-8224-41a1-b2ac-35d29af5a393"
      },
      "correlation_id": "08ee5272-12e9-4e55-a786-bc52e3bd589e"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/ab9d15ec-42dd-46b9-aa9f-d3359f1645c7/tip` → **200**

```json
{
  "order_id": "ab9d15ec-42dd-46b9-aa9f-d3359f1645c7",
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
  "available_until": "2026-10-30T16:05:02.709131Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/ab9d15ec-42dd-46b9-aa9f-d3359f1645c7/tip` → **409**

```json
{
  "command_id": "c52aa676-0144-4029-a23b-1d8467e405b2",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/ab9d15ec-42dd-46b9-aa9f-d3359f1645c7/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "984b9c57-2770-4445-a74d-a140b766e707"
}
```

Done: interrupted 571af098-7c16-48af-949b-0663e802242f, follow-up ab9d15ec-42dd-46b9-aa9f-d3359f1645c7.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2c729788-dbef-49ce-80dd-4d9dcfed7b44",
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
  "last_heartbeat_at": "2026-10-29T16:04:57.386822Z",
  "last_location_at": "2026-10-29T16:04:57.386822Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c729788-dbef-49ce-80dd-4d9dcfed7b44/close` → **200**

```json
{
  "command_id": "17ea107b-d21b-4739-8db8-d8537d299447",
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
  "session_id": "f11aad24-672c-4493-93d6-f0741bfd510c",
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
  "last_heartbeat_at": "2026-10-29T16:05:01.844254Z",
  "last_location_at": "2026-10-29T16:05:01.844254Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f11aad24-672c-4493-93d6-f0741bfd510c/close` → **200**

```json
{
  "command_id": "99349d18-c719-45d9-b5d2-a99534a40e5d",
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
  "session_id": "54ae7fed-a8a9-42c3-a5d9-c4a2dde5125a",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4MDgsImlhdCI6MTc5MzI4OTkwOCwianRpIjoiMTQ2NTNhMmItN2M0ZS00NzQ2LThhZjYtM2VhODM5YmJkYzVmIiwic2lkIjoiNTRhZTdmZWQtYThhOS00MmMzLWE1ZDktYzRhMmRkZTUxMjVhIn0.4NCTdTt7UP8WQZSugTHSH6e90lMa8VrSoO1IvabD24U",
  "access_expires_at": "2026-10-29T16:20:08.829538512Z",
  "refresh_token": "iUfXyfOphSWOcFvLpZug3zQnOLBbGpsJKuyxs1llEMY",
  "refresh_expires_at": "2026-10-30T04:05:08.82858816Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "21d757a8-5acf-4b80-9176-7d44b4b7525a",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T16:05:09Z"
}
```

```json
{
  "id": "f5fdf320-5f6d-4942-a551-aea6e266d20a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T16:05:09Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/f5fdf320-5f6d-4942-a551-aea6e266d20a/publish` → **200**

```json
{
  "command_id": "bbfbc6c0-207d-4c0c-a4ca-5701916edb09",
  "expected_version": 0
}
```

```json
{
  "id": "f5fdf320-5f6d-4942-a551-aea6e266d20a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T16:05:09.409407Z",
  "published_at": "2026-10-29T16:05:09.409407Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "f5fdf320-5f6d-4942-a551-aea6e266d20a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T16:05:09.409407Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630747145",
  "device_ref": "sandbox-22918"
}
```

```json
{
  "challenge_id": "199e1af5-14a6-4a18-a90a-b62b41a07172",
  "expires_at": "2026-10-29T16:10:09.951553124Z",
  "resend_available_at": "2026-10-29T16:05:10.951553124Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630747145` → **200**

```json
{
  "phone": "+380630747145",
  "audience": "CLIENT",
  "code": "731181",
  "sent_at": "2026-10-29T16:05:09.955059663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "199e1af5-14a6-4a18-a90a-b62b41a07172",
  "code": "731181",
  "device_ref": "sandbox-22918"
}
```

```json
{
  "session_id": "2cb4e290-9d2a-46c4-8901-0f2e3acde9b5",
  "subject": {
    "type": "CLIENT",
    "id": "596c506b-fbc6-43f7-b05c-e20c98d516e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OTZjNTA2Yi1mYmM2LTQzZjctYjA1Yy1lMjBjOThkNTE2ZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODEwLCJpYXQiOjE3OTMyODk5MTAsImp0aSI6ImFiNzk1MGJiLWVlMzctNDEzOC1iN2Y4LTA2OWYwNGVhN2YxNyIsInNpZCI6IjJjYjRlMjkwLTlkMmEtNDZjNC04OTAxLTBmMmUzYWNkZTliNSJ9.rWCYGFnQIvBvBenLowGhb1cdM8dNgrJ7txqOOAxIMw8",
  "access_expires_at": "2026-10-29T16:20:10.249990057Z",
  "refresh_token": "BqtSjmKkcm9Db9-c80S98eYZn9at7Nl6UMSfRIhgsSo",
  "refresh_expires_at": "2026-11-28T16:05:10.249516015Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "f5fdf320-5f6d-4942-a551-aea6e266d20a",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T16:05:09.409407Z",
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
  "command_id": "a9023195-dba1-4e7e-a898-e235e23c6e3f",
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
  "id": "7ac65e94-b131-4454-9849-21e1e8104068",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:10.808984Z",
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
  "command_id": "a07c5c3f-9eac-41a1-b1d3-cb108d07b496",
  "quote_id": "7ac65e94-b131-4454-9849-21e1e8104068",
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
  "correlation_id": "862d7554-0613-47d5-a548-7f39fe1237e9"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "71661839-3e99-4481-8fd6-307d924d469f",
  "version_id": "f5fdf320-5f6d-4942-a551-aea6e266d20a",
  "language": "uk"
}
```

```json
{
  "version_id": "f5fdf320-5f6d-4942-a551-aea6e266d20a",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T16:05:11.378634Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a8c2b16c-9e7d-4fa4-9567-c50de316bc6d",
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
  "id": "fba89863-5f08-4197-bc00-e953ddc7d24c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:11.659024Z",
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
  "command_id": "69491552-5816-44ae-8f41-4acb9c576006",
  "quote_id": "fba89863-5f08-4197-bc00-e953ddc7d24c",
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
  "id": "a0ef1b12-d742-4f60-ada1-cd3034cd6b29",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "596c506b-fbc6-43f7-b05c-e20c98d516e8",
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
  "created_at": "2026-10-29T16:05:11.943685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a0ef1b12-d742-4f60-ada1-cd3034cd6b29` → **200**

```json
{
  "id": "a0ef1b12-d742-4f60-ada1-cd3034cd6b29",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "596c506b-fbc6-43f7-b05c-e20c98d516e8",
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
  "created_at": "2026-10-29T16:05:11.943685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a0ef1b12-d742-4f60-ada1-cd3034cd6b29/cancel` → **200**

```json
{
  "command_id": "87f9fb7a-64b0-4d1d-a35d-96a83c94f635",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a0ef1b12-d742-4f60-ada1-cd3034cd6b29",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "596c506b-fbc6-43f7-b05c-e20c98d516e8",
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
  "created_at": "2026-10-29T16:05:11.943685Z",
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

`POST /api/admin/v1/legal-documents/f5fdf320-5f6d-4942-a551-aea6e266d20a` → **409**

```json
{
  "command_id": "1123c16b-083e-4d63-9e18-2c94ebfcc6de",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T16:05:12Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/f5fdf320-5f6d-4942-a551-aea6e266d20a",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d77d9066-8a61-4e69-9745-7c63a72928a8"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a498bd07-f5cc-45ac-baca-5d1bee6bb195",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T16:05:13Z"
}
```

```json
{
  "id": "41d66199-8e7e-4e3c-a50a-dabd1c3b2df1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T16:05:13Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/41d66199-8e7e-4e3c-a50a-dabd1c3b2df1/publish` → **200**

```json
{
  "command_id": "dfe6442c-70d7-4362-a735-933f2a9db558",
  "expected_version": 0
}
```

```json
{
  "id": "41d66199-8e7e-4e3c-a50a-dabd1c3b2df1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T16:05:13.394706Z",
  "published_at": "2026-10-29T16:05:13.394706Z",
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
  "device_ref": "sandbox-28280"
}
```

```json
{
  "challenge_id": "f5b6527f-31d8-41f3-8190-347c91eea01a",
  "expires_at": "2026-10-29T16:10:13.681546Z",
  "resend_available_at": "2026-10-29T16:05:14.681546Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "290382",
  "sent_at": "2026-10-29T16:05:13.684236816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5b6527f-31d8-41f3-8190-347c91eea01a",
  "code": "290382",
  "device_ref": "sandbox-28280"
}
```

```json
{
  "session_id": "26ba07a5-cc27-45ea-bdf6-a42fecf1c1bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDgxMywiaWF0IjoxNzkzMjg5OTEzLCJqdGkiOiI0NGFjZDdjNS0zMDI0LTQ3NWUtODBiZC1hY2I2ZWRlYWYzNTQiLCJzaWQiOiIyNmJhMDdhNS1jYzI3LTQ1ZWEtYmRmNi1hNDJmZWNmMWMxYmIifQ.bEeGt8imBf39fEg77KQQdWQ4ZBT4dHX__iAndgmW2vo",
  "access_expires_at": "2026-10-29T16:20:13.979548284Z",
  "refresh_token": "aRDhtONLMA4QAjQ60oOhL0WCl8ZLL0yHMFNoy91Xnbk",
  "refresh_expires_at": "2026-11-28T16:05:13.978906949Z",
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
  "command_id": "54b47528-0db6-4bfd-83c5-eabacaec1605",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:05:14Z",
    "sequence": 1793289914510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "001ee8cb-e001-44e6-9935-aaae9c27e59d",
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
  "last_heartbeat_at": "2026-10-29T16:05:14.527308Z",
  "last_location_at": "2026-10-29T16:05:14.527308Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671120866",
  "device_ref": "sandbox-3880"
}
```

```json
{
  "challenge_id": "0b686c27-e406-462d-bb51-55efe673ecde",
  "expires_at": "2026-10-29T16:10:14.79984551Z",
  "resend_available_at": "2026-10-29T16:05:15.79984551Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671120866` → **200**

```json
{
  "phone": "+380671120866",
  "audience": "CLIENT",
  "code": "605368",
  "sent_at": "2026-10-29T16:05:14.802449307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b686c27-e406-462d-bb51-55efe673ecde",
  "code": "605368",
  "device_ref": "sandbox-3880"
}
```

```json
{
  "session_id": "abcdfc0d-b2eb-4d9c-b1f7-c9764219f6f7",
  "subject": {
    "type": "CLIENT",
    "id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2VkM2I4Yi01NTg4LTRmM2YtOWFhMS01ZjU4ODc3NjE2YTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODE1LCJpYXQiOjE3OTMyODk5MTUsImp0aSI6IjRiYmI1YjEzLTQ0MjEtNGNmNy1iNzhjLWUyOWVhNmZkYWE2MCIsInNpZCI6ImFiY2RmYzBkLWIyZWItNGQ5Yy1iMWY3LWM5NzY0MjE5ZjZmNyJ9.xReq-ZL17Kaa_c4fOzAOSHaBY-UfTm9nzMY3rReDVfc",
  "access_expires_at": "2026-10-29T16:20:15.092952999Z",
  "refresh_token": "RmVglKqDp67b6Qr07FCjRBRtY7Td0MPWniD8rtFaDOA",
  "refresh_expires_at": "2026-11-28T16:05:15.092434719Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad91ec58-56c4-4f3d-951e-ed2301eeaf84",
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
  "id": "74c24568-8b84-4ce9-a2f4-721692f31f66",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:15.367681Z",
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
  "command_id": "a6a8c659-c475-40c1-ae88-c6b8ba4d4269",
  "quote_id": "74c24568-8b84-4ce9-a2f4-721692f31f66",
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
    "phone": "+380675803441"
  }
}
```

```json
{
  "id": "5b410a04-3f9f-4533-945e-349df9306954",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:05:15.648482Z",
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
    "id": "399257b7-fc2b-4fd7-ac9e-6931f4a05c00",
    "order_id": "5b410a04-3f9f-4533-945e-349df9306954",
    "expires_at": "2026-10-29T16:05:30.651562Z",
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

`POST /api/driver/v1/offers/399257b7-fc2b-4fd7-ac9e-6931f4a05c00/accept` → **200**

```json
{
  "command_id": "635f2671-2f2e-4c2a-8af1-d0ecb9183aa7"
}
```

```json
{
  "id": "aca7f3ef-bf7f-4046-a79d-4ab7396df623",
  "order_id": "5b410a04-3f9f-4533-945e-349df9306954",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ca66d6b4-a9b0-4dd3-aafe-1d1c884807b3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ca66d6b4-a9b0-4dd3-aafe-1d1c884807b3",
  "order_id": "5b410a04-3f9f-4533-945e-349df9306954",
  "assignment_id": "aca7f3ef-bf7f-4046-a79d-4ab7396df623",
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
    "phone": "+380675803441"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4ca91123-d889-47ce-8683-e83644ae69c5",
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
  "id": "d9734fb1-3d02-454a-8ac8-dee6461d95d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:16.804258Z",
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
  "command_id": "101a407a-b120-48aa-bf2a-4c4fe30bcffe",
  "quote_id": "d9734fb1-3d02-454a-8ac8-dee6461d95d7",
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
  "id": "ef48529b-c09c-4636-9fa1-b63b549954ce",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:05:17.088555Z",
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
  "command_id": "d463124a-ca23-41b7-9dcc-a38331ddc9a1",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T19:05:17Z"
}
```

```json
{
  "id": "fd25dc6c-8c2d-48d2-bbc0-d89470be4d39",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:17.384702Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T19:05:17Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7a3f112b-45be-4e88-b0af-1c845d2bb80b",
  "quote_id": "fd25dc6c-8c2d-48d2-bbc0-d89470be4d39",
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
  "pickup_at": "2026-10-29T19:05:17Z"
}
```

```json
{
  "id": "f3017976-d89e-44e1-8bbd-160803a70908",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T16:05:17.673517Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T19:05:17Z",
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
  "command_id": "43ca0940-7fda-41cd-b70d-7b453473f499",
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
  "id": "0096ea96-940d-4b94-9b91-38fa74619416",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:17.969705Z",
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
  "command_id": "aa93a913-77b3-463a-b653-3f771514d1fc",
  "quote_id": "0096ea96-940d-4b94-9b91-38fa74619416",
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
  "correlation_id": "5eefc2d6-49e1-40a3-a008-47f8657a22d6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f3017976-d89e-44e1-8bbd-160803a70908",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T16:05:17.673517Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T19:05:17Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ef48529b-c09c-4636-9fa1-b63b549954ce",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T16:05:17.088555Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "5b410a04-3f9f-4533-945e-349df9306954",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ef48529b-c09c-4636-9fa1-b63b549954ce",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:05:17.088555Z",
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

`GET /api/rider/v1/orders/5b410a04-3f9f-4533-945e-349df9306954` → **200**

```json
{
  "id": "5b410a04-3f9f-4533-945e-349df9306954",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "aca7f3ef-bf7f-4046-a79d-4ab7396df623",
    "order_id": "5b410a04-3f9f-4533-945e-349df9306954",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ca66d6b4-a9b0-4dd3-aafe-1d1c884807b3",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T16:05:15.648482Z",
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
    "location_at": "2026-10-29T16:05:14.527308Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/5b410a04-3f9f-4533-945e-349df9306954/cancel` → **200**

```json
{
  "command_id": "d1760287-2f5e-4b57-aaac-a47a32b0db81",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5b410a04-3f9f-4533-945e-349df9306954",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "aca7f3ef-bf7f-4046-a79d-4ab7396df623",
    "order_id": "5b410a04-3f9f-4533-945e-349df9306954",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ca66d6b4-a9b0-4dd3-aafe-1d1c884807b3",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T16:05:15.648482Z",
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

`GET /api/rider/v1/orders/ef48529b-c09c-4636-9fa1-b63b549954ce` → **200**

```json
{
  "id": "ef48529b-c09c-4636-9fa1-b63b549954ce",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:05:17.088555Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ef48529b-c09c-4636-9fa1-b63b549954ce/cancel` → **200**

```json
{
  "command_id": "2c5e35a3-363d-410f-ba63-e85c2d72c908",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ef48529b-c09c-4636-9fa1-b63b549954ce",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:05:17.088555Z",
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

`GET /api/rider/v1/orders/f3017976-d89e-44e1-8bbd-160803a70908` → **200**

```json
{
  "id": "f3017976-d89e-44e1-8bbd-160803a70908",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T16:05:17.673517Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T19:05:17Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f3017976-d89e-44e1-8bbd-160803a70908/cancel` → **200**

```json
{
  "command_id": "c5127040-75a7-4387-b705-247e22234fe9",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f3017976-d89e-44e1-8bbd-160803a70908",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "dced3b8b-5588-4f3f-9aa1-5f58877616a2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T16:05:17.673517Z",
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
  "pickup_at": "2026-10-29T19:05:17Z",
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
  "session_id": "001ee8cb-e001-44e6-9935-aaae9c27e59d",
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
  "last_heartbeat_at": "2026-10-29T16:05:14.527308Z",
  "last_location_at": "2026-10-29T16:05:14.527308Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/001ee8cb-e001-44e6-9935-aaae9c27e59d/close` → **200**

```json
{
  "command_id": "c1c0fb79-d82a-434f-94ed-f5f2769b762c",
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

Done: orders 5b410a04-3f9f-4533-945e-349df9306954, ef48529b-c09c-4636-9fa1-b63b549954ce, f3017976-d89e-44e1-8bbd-160803a70908.

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
  "session_id": "c9821941-9a69-49f9-b241-aff74328c632",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4MjEsImlhdCI6MTc5MzI4OTkyMSwianRpIjoiNTBhMDA5ODMtYzY0NC00MjhmLTkwMzAtOWM5NTBmMTRlZTcwIiwic2lkIjoiYzk4MjE5NDEtOWE2OS00OWY5LWIyNDEtYWZmNzQzMjhjNjMyIn0.oa2P8GTRxx43c0jU3KUOXHC7DqyUk3TWELfTJXwCvlY",
  "access_expires_at": "2026-10-29T16:20:21.696772042Z",
  "refresh_token": "vilT-UXBsSkIlIvT5ksnzn9sb3y_EkY5fvv6R_ZFpfI",
  "refresh_expires_at": "2026-10-30T04:05:21.696157916Z",
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
  "session_id": "5b936a9f-fcf7-4cd4-8dc0-cf07bc714384",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4MjIsImlhdCI6MTc5MzI4OTkyMiwianRpIjoiZDUzZGM1MTMtZjM3Ny00YTBjLTgxZjAtYzAyMGY5NWIxNzI4Iiwic2lkIjoiNWI5MzZhOWYtZmNmNy00Y2Q0LThkYzAtY2YwN2JjNzE0Mzg0In0.y-4jwbW6Z3E-S2BQkXbj5JmOUhO1GGF6eeVLB4ZDzX0",
  "access_expires_at": "2026-10-29T16:20:22.286947341Z",
  "refresh_token": "7fYrj6oigzSU4UfJp26TMZWWfPsmg-BDV9ZD5APL2pI",
  "refresh_expires_at": "2026-10-30T04:05:22.286448039Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26877"
}
```

```json
{
  "challenge_id": "729af666-bb37-42a8-9b95-d96c254b843e",
  "expires_at": "2026-10-29T16:10:22.551976063Z",
  "resend_available_at": "2026-10-29T16:05:23.551976063Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "420082",
  "sent_at": "2026-10-29T16:05:22.554508936Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "729af666-bb37-42a8-9b95-d96c254b843e",
  "code": "420082",
  "device_ref": "sandbox-26877"
}
```

```json
{
  "session_id": "70701399-5e17-46e5-a842-5e6108eb704b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDgyMiwiaWF0IjoxNzkzMjg5OTIyLCJqdGkiOiIwYWMwOWIyNy1kN2E3LTQyYTEtYWEyZS02MjA0M2MwZmFkMzAiLCJzaWQiOiI3MDcwMTM5OS01ZTE3LTQ2ZTUtYTg0Mi01ZTYxMDhlYjcwNGIifQ.AYxCObQb1xF9I03EB6l3OeZLkcGm2I1mMYgcVZHJrm8",
  "access_expires_at": "2026-10-29T16:20:22.8534455Z",
  "refresh_token": "EKPdVKp3C8OdxQ3PLocg6rWJ__66985K9fmL9_qAqOQ",
  "refresh_expires_at": "2026-11-28T16:05:22.852683266Z",
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
  "command_id": "de2f94ba-d697-438f-9a42-f81580c09354",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:05:23Z",
    "sequence": 1793289923392
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a62f3fc-a255-43d1-8163-5907ce34e1fe",
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
  "last_heartbeat_at": "2026-10-29T16:05:23.410558Z",
  "last_location_at": "2026-10-29T16:05:23.410558Z",
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
  "command_id": "9da2c2a1-60f3-4559-821d-28d755e70460",
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
  "effective_at": "2026-10-29T16:05:23.990225Z",
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T16:02:46.367788Z",
  "last_entries": [
    {
      "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T16:02:46.367788Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a9c230bd-a36c-4743-9411-2e0425ddb9ee",
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
  "id": "4ed57534-2e32-4c9a-b751-a405dd0565d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:24.545922Z",
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
  "command_id": "bef32988-f0ea-475b-afb2-a52ec55c671f",
  "quote_id": "4ed57534-2e32-4c9a-b751-a405dd0565d8",
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
    "phone": "+3806711131565"
  }
}
```

```json
{
  "id": "29c138a6-2a0a-434f-b737-715f9b57bbbf",
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
  "created_at": "2026-10-29T16:05:24.828939Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131565"
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
    "id": "49e61cac-ba13-42fc-ad1c-f26ed8ce9cde",
    "order_id": "29c138a6-2a0a-434f-b737-715f9b57bbbf",
    "expires_at": "2026-10-29T16:05:39.832792Z",
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

`POST /api/driver/v1/offers/49e61cac-ba13-42fc-ad1c-f26ed8ce9cde/accept` → **200**

```json
{
  "command_id": "f457018c-8665-4228-83a1-c37b15c24cd2"
}
```

```json
{
  "id": "83e89600-21bd-43ed-91cd-b1c569b9eac8",
  "order_id": "29c138a6-2a0a-434f-b737-715f9b57bbbf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "afca242a-ef29-4de7-8c48-df6c2b70b0ee",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "afca242a-ef29-4de7-8c48-df6c2b70b0ee",
  "order_id": "29c138a6-2a0a-434f-b737-715f9b57bbbf",
  "assignment_id": "83e89600-21bd-43ed-91cd-b1c569b9eac8",
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
    "phone": "+3806711131565"
  }
}
```

`POST /api/driver/v1/work-sessions/8a62f3fc-a255-43d1-8163-5907ce34e1fe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:05:25Z",
    "sequence": 1793289925907
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a62f3fc-a255-43d1-8163-5907ce34e1fe",
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
  "last_heartbeat_at": "2026-10-29T16:05:25.924549Z",
  "last_location_at": "2026-10-29T16:05:25.924549Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/afca242a-ef29-4de7-8c48-df6c2b70b0ee/arrive` → **200**

```json
{
  "command_id": "f4bed73b-fa03-4ca7-a939-9eb9ec71121f",
  "expected_version": 0
}
```

```json
{
  "id": "afca242a-ef29-4de7-8c48-df6c2b70b0ee",
  "order_id": "29c138a6-2a0a-434f-b737-715f9b57bbbf",
  "assignment_id": "83e89600-21bd-43ed-91cd-b1c569b9eac8",
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
  "arrived_at": "2026-10-29T16:05:26.196473Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131565"
  }
}
```

`POST /api/driver/v1/trips/afca242a-ef29-4de7-8c48-df6c2b70b0ee/start` → **200**

```json
{
  "command_id": "9f0b6bac-0c52-4e6f-9c6e-26a238cda39b",
  "expected_version": 1
}
```

```json
{
  "id": "afca242a-ef29-4de7-8c48-df6c2b70b0ee",
  "order_id": "29c138a6-2a0a-434f-b737-715f9b57bbbf",
  "assignment_id": "83e89600-21bd-43ed-91cd-b1c569b9eac8",
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
  "arrived_at": "2026-10-29T16:05:26.196473Z",
  "started_at": "2026-10-29T16:05:26.48525Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131565"
  }
}
```

`POST /api/driver/v1/trips/afca242a-ef29-4de7-8c48-df6c2b70b0ee/complete` → **200**

```json
{
  "command_id": "bb137222-8377-4b3c-a194-cbb2b787990c",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:05:26Z",
  "cash_received": true
}
```

```json
{
  "id": "afca242a-ef29-4de7-8c48-df6c2b70b0ee",
  "order_id": "29c138a6-2a0a-434f-b737-715f9b57bbbf",
  "assignment_id": "83e89600-21bd-43ed-91cd-b1c569b9eac8",
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
  "arrived_at": "2026-10-29T16:05:26.196473Z",
  "started_at": "2026-10-29T16:05:26.48525Z",
  "completed_at": "2026-10-29T16:05:26.7705Z",
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
  "command_id": "7500e090-fab6-40f5-91be-ff8e57bace50",
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
  "id": "db5896fa-e584-4b8e-bf6f-232be5f0d2c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:27.056093Z",
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
  "command_id": "cd380f84-6986-49cf-9248-035e1b0a492a",
  "quote_id": "db5896fa-e584-4b8e-bf6f-232be5f0d2c0",
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
    "phone": "+3806711122214"
  }
}
```

```json
{
  "id": "155b6050-69a2-48a0-92be-ebf060b7f354",
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
  "created_at": "2026-10-29T16:05:27.340679Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122214"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/155b6050-69a2-48a0-92be-ebf060b7f354` → **200**

```json
{
  "id": "155b6050-69a2-48a0-92be-ebf060b7f354",
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
  "created_at": "2026-10-29T16:05:27.340679Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122214"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/155b6050-69a2-48a0-92be-ebf060b7f354/cancel` → **200**

```json
{
  "command_id": "dfb0b4e5-de44-489a-97e8-0ac454c6bd1b",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "155b6050-69a2-48a0-92be-ebf060b7f354",
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
  "created_at": "2026-10-29T16:05:27.340679Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122214"
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
  "staff_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T16:02:46.367788Z",
  "last_entries": [
    {
      "order_id": "155b6050-69a2-48a0-92be-ebf060b7f354",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T16:05:27.923582Z"
    },
    {
      "order_id": "29c138a6-2a0a-434f-b737-715f9b57bbbf",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T16:05:26.774425Z"
    },
    {
      "order_id": "93074465-d1c6-4433-b81e-ba02a950793b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T16:02:46.367788Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8a62f3fc-a255-43d1-8163-5907ce34e1fe",
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
  "last_heartbeat_at": "2026-10-29T16:05:25.924549Z",
  "last_location_at": "2026-10-29T16:05:25.924549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a62f3fc-a255-43d1-8163-5907ce34e1fe/close` → **200**

```json
{
  "command_id": "462f8c92-75ab-4e80-b0ad-c6b8b732939c",
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

Done: operator bonus for fulfilled 29c138a6-2a0a-434f-b737-715f9b57bbbf and operator-fault cancellation 155b6050-69a2-48a0-92be-ebf060b7f354.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675848055",
  "device_ref": "sandbox-15033"
}
```

```json
{
  "challenge_id": "56a6eba8-2eab-44b3-8397-37a24ee27eb8",
  "expires_at": "2026-10-29T16:10:32.276878913Z",
  "resend_available_at": "2026-10-29T16:05:33.276878913Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675848055` → **200**

```json
{
  "phone": "+380675848055",
  "audience": "CLIENT",
  "code": "229256",
  "sent_at": "2026-10-29T16:05:32.279246787Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678240527",
  "device_ref": "sandbox-30983",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "9f57718c-5d13-4f96-a8d6-fccc098485ac",
  "expires_at": "2026-10-29T16:10:33.78095415Z",
  "resend_available_at": "2026-10-29T16:05:34.78095415Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678240527` → **200**

```json
{
  "phone": "+380678240527",
  "audience": "CLIENT",
  "code": "256928",
  "sent_at": "2026-10-29T16:05:33.783547635Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678240527",
  "device_ref": "sandbox-27650",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "86d548f7-20eb-459d-b49e-4303b523a2c1",
  "expires_at": "2026-10-29T16:10:35.284022091Z",
  "resend_available_at": "2026-10-29T16:05:36.284022091Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678240527` → **200**

```json
{
  "phone": "+380678240527",
  "audience": "CLIENT",
  "code": "129450",
  "sent_at": "2026-10-29T16:05:35.287487216Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670210000",
  "device_ref": "sandbox-31580"
}
```

```json
{
  "challenge_id": "8f729704-b544-4c0d-8f5d-43f28d532e4a",
  "expires_at": "2026-10-29T16:10:36.78644643Z",
  "resend_available_at": "2026-10-29T16:05:37.78644643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670210000",
  "device_ref": "sandbox-6899"
}
```

```json
{
  "challenge_id": "51850435-2ebe-4f79-82d5-8eccb792cb62",
  "expires_at": "2026-10-29T16:10:38.262209882Z",
  "resend_available_at": "2026-10-29T16:05:39.262209882Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670210000` → **200**

```json
{
  "phone": "+380670210000",
  "audience": "CLIENT",
  "code": "538126",
  "sent_at": "2026-10-29T16:05:38.265097241Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670210000",
  "device_ref": "sandbox-18599",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0ff43f41-cd8d-4a84-aa39-6138e74c6377",
  "expires_at": "2026-10-29T16:10:39.769466928Z",
  "resend_available_at": "2026-10-29T16:05:40.769466928Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670210000` → **200**

```json
{
  "phone": "+380670210000",
  "audience": "CLIENT",
  "code": "841011",
  "sent_at": "2026-10-29T16:05:39.771894347Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380670210000",
  "device_ref": "sandbox-22201",
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
  "correlation_id": "d2fd9501-56f9-4233-878e-630e4241ad3d",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000031213"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "dd79eae6-bd2d-42d9-b4d8-9ea4cba8ce0b"
}
```

`GET /sandbox/v1/otp?phone=%2B442000031213` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120026045"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "8f8ef628-6f16-4aa7-8f0e-1a68d6423569"
}
```

`GET /sandbox/v1/otp?phone=%2B37120026045` → **404**

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
  "session_id": "c757b1fb-aea8-4436-a8a2-d0e9ff5f98a8",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NDIsImlhdCI6MTc5MzI4OTk0MiwianRpIjoiOGRlMWQ5NjEtNGNmNy00MWMzLWI1OTQtYThlZTJlNTc2YTVhIiwic2lkIjoiYzc1N2IxZmItYWVhOC00NDM2LWE4YTItZDBlOWZmNWY5OGE4In0.T5VE60SYbm4MXrvHgTa0k2RxMtoW76jEKUiiXZHGN1M",
  "access_expires_at": "2026-10-29T16:20:42.527397224Z",
  "refresh_token": "zCICWUlwv9RktMXIqVrO2-wPOZBAc8y4g1tHpIUTHPo",
  "refresh_expires_at": "2026-10-30T04:05:42.526858205Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670210000` → **200**

```json
{
  "deliveries": [
    {
      "id": "07cf0ae2-375f-45c7-a78c-c94cae8d0ad7",
      "challenge_id": "0ff43f41-cd8d-4a84-aa39-6138e74c6377",
      "phone": "+380670210000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0a08a714-080d-43a9-aace-99a7ff4f419f",
      "error": null,
      "attempted_at": "2026-10-29T16:05:39.772221Z"
    },
    {
      "id": "d172ded8-0b04-4532-9947-95e9181a81f6",
      "challenge_id": "51850435-2ebe-4f79-82d5-8eccb792cb62",
      "phone": "+380670210000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-084ee32c-85e5-42a4-b736-2bd035efaf32",
      "error": null,
      "attempted_at": "2026-10-29T16:05:38.265465Z"
    },
    {
      "id": "0db3a48f-35f8-4250-b456-4e16ce890575",
      "challenge_id": "8f729704-b544-4c0d-8f5d-43f28d532e4a",
      "phone": "+380670210000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T16:05:36.789021Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380670210000` → **200**

```json
{
  "phone": "+380670210000",
  "audience": "CLIENT",
  "code": "841011",
  "sent_at": "2026-10-29T16:05:39.771894347Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678240527` → **200**

```json
{
  "deliveries": [
    {
      "id": "8c20e902-4250-4034-ae7f-aca0ba32e6dd",
      "challenge_id": "86d548f7-20eb-459d-b49e-4303b523a2c1",
      "phone": "+380678240527",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9774ee08-c90b-4d1f-a100-06f6af054dec",
      "error": null,
      "attempted_at": "2026-10-29T16:05:35.288021Z"
    },
    {
      "id": "b85cf983-785e-4f3f-a244-adceb55600d8",
      "challenge_id": "9f57718c-5d13-4f96-a8d6-fccc098485ac",
      "phone": "+380678240527",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bffe5e56-1dcb-441c-b9d7-6ff99c4038b9",
      "error": null,
      "attempted_at": "2026-10-29T16:05:33.783897Z"
    }
  ]
}
```

Done: SMS to +380675848055; SMS then a call to +380678240527; a failed SMS, two calls and a refused third to +380670210000; +44 and +371 refused.

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
  "session_id": "22b0f86d-1624-4a8c-962d-cd662f7115b3",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NDMsImlhdCI6MTc5MzI4OTk0MywianRpIjoiODdlOWM3NDUtYmZkOS00ZmJjLTk3YTItYmFkMDM3MWYxZmU3Iiwic2lkIjoiMjJiMGY4NmQtMTYyNC00YThjLTk2MmQtY2Q2NjJmNzExNWIzIn0.wkbM6iuzKLYTn9Mpn-vDLah398qlF8i1DfOp-jDNOIo",
  "access_expires_at": "2026-10-29T16:20:43.701330751Z",
  "refresh_token": "8zxHxiPPAGzsLczB9ZnapQ8FHvTIn2R0hTHtxUULbMM",
  "refresh_expires_at": "2026-10-30T04:05:43.700567235Z",
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
  "session_id": "8eb8c261-7909-4c5a-a3fe-b9f3f4daafcb",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NDQsImlhdCI6MTc5MzI4OTk0NCwianRpIjoiYzRlZmEwMTQtM2JhOS00YWQ3LWFhNDEtYTc2NmI3NDQ2NmJmIiwic2lkIjoiOGViOGMyNjEtNzkwOS00YzVhLWEzZmUtYjlmM2Y0ZGFhZmNiIn0.qYRtPjOmZSZTZ13Vtkky_6aEJUUqU7y-iS-qTUfP9xs",
  "access_expires_at": "2026-10-29T16:20:44.30020693Z",
  "refresh_token": "iA8iyTmCWFLks-cHA-UFcXWtpEP19GLs6pfBHq-Lp5I",
  "refresh_expires_at": "2026-10-30T04:05:44.29969801Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
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

`POST /api/admin/v1/staff-extensions/7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4` → **200**

```json
{
  "command_id": "ed01f0a8-ad86-423a-a8f8-933a0739af0a",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "3143b450-a207-4785-a03e-edb3c88b900c",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T16:05:45.451168Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T16:05:45.451168Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fb65d7d0-cd55-4e85-b8ab-573d9c6227df",
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
  "id": "2d1f8d25-42a2-4a61-a248-a1c895f5c097",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:10:45.997394Z",
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
  "command_id": "358f18f6-843c-4bad-8ca7-3dbf57ede2ee",
  "quote_id": "2d1f8d25-42a2-4a61-a248-a1c895f5c097",
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
    "phone": "+380676514379"
  }
}
```

```json
{
  "id": "7653902b-6c49-41fc-bea7-a383cdb7b4c5",
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
  "created_at": "2026-10-29T16:05:46.28409Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676514379"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/7653902b-6c49-41fc-bea7-a383cdb7b4c5/calls` → **201**

```json
{
  "command_id": "3d060516-7f31-4b3c-a66b-ea1e1f03e00b",
  "to": "CALLER"
}
```

```json
{
  "id": "caf19828-1d24-402d-bb4f-60d17132764e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "order_ids": [
    "7653902b-6c49-41fc-bea7-a383cdb7b4c5"
  ],
  "started_at": "2026-10-29T16:05:46.592051Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/7653902b-6c49-41fc-bea7-a383cdb7b4c5/calls` → **201**

```json
{
  "command_id": "3d060516-7f31-4b3c-a66b-ea1e1f03e00b",
  "to": "CALLER"
}
```

```json
{
  "id": "caf19828-1d24-402d-bb4f-60d17132764e",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "order_ids": [
    "7653902b-6c49-41fc-bea7-a383cdb7b4c5"
  ],
  "started_at": "2026-10-29T16:05:46.592051Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "caf19828-1d24-402d-bb4f-60d17132764e",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676514379",
    "at": "2026-10-29T16:05:46.594910584Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "caf19828-1d24-402d-bb4f-60d17132764e",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16658",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "caf19828-1d24-402d-bb4f-60d17132764e"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "caf19828-1d24-402d-bb4f-60d17132764e",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=7653902b-6c49-41fc-bea7-a383cdb7b4c5` → **200**

```json
{
  "calls": [
    {
      "id": "caf19828-1d24-402d-bb4f-60d17132764e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [
        "7653902b-6c49-41fc-bea7-a383cdb7b4c5"
      ],
      "started_at": "2026-10-29T16:05:46.592051Z",
      "answered_at": "2026-10-29T16:05:47.216336Z",
      "ended_at": "2026-10-29T16:05:47.239795Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7653902b-6c49-41fc-bea7-a383cdb7b4c5` → **200**

```json
{
  "calls": [
    {
      "id": "caf19828-1d24-402d-bb4f-60d17132764e",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "order_ids": [
        "7653902b-6c49-41fc-bea7-a383cdb7b4c5"
      ],
      "started_at": "2026-10-29T16:05:46.592051Z",
      "answered_at": "2026-10-29T16:05:47.216336Z",
      "ended_at": "2026-10-29T16:05:47.239795Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T16:05:47.511932Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/7653902b-6c49-41fc-bea7-a383cdb7b4c5` → **200**

```json
{
  "id": "7653902b-6c49-41fc-bea7-a383cdb7b4c5",
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
  "created_at": "2026-10-29T16:05:46.28409Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676514379"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7653902b-6c49-41fc-bea7-a383cdb7b4c5/cancel` → **200**

```json
{
  "command_id": "25aa53d0-53c2-469e-a019-98282fca62c6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7653902b-6c49-41fc-bea7-a383cdb7b4c5",
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
  "created_at": "2026-10-29T16:05:46.28409Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676514379"
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
  "command_id": "39cae6b0-9839-4cfb-ae58-4e178deb625a",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T16:05:50.416982Z",
  "extension": "101"
}
```

Done: outgoing call caf19828-1d24-402d-bb4f-60d17132764e from order 7653902b-6c49-41fc-bea7-a383cdb7b4c5, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637140807",
  "device_ref": "sandbox-29057"
}
```

```json
{
  "challenge_id": "2673cbd1-5f22-4630-8307-2bccbd9ef041",
  "expires_at": "2026-10-29T16:10:50.69343115Z",
  "resend_available_at": "2026-10-29T16:05:51.69343115Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637140807` → **200**

```json
{
  "phone": "+380637140807",
  "audience": "CLIENT",
  "code": "133392",
  "sent_at": "2026-10-29T16:05:50.695912473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2673cbd1-5f22-4630-8307-2bccbd9ef041",
  "code": "133392",
  "device_ref": "sandbox-29057"
}
```

```json
{
  "session_id": "4edc0f81-c731-400f-a0b2-894d01da87e4",
  "subject": {
    "type": "CLIENT",
    "id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwM2IyZDRmNi0zYWRlLTQ2ZTktYTEzZS0xNTM2NGI0NWU5YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODUwLCJpYXQiOjE3OTMyODk5NTAsImp0aSI6ImQ4OWUwNWQzLWNkMzQtNGZhMC04YjFhLWIwZjJjMTRmOTY4ZCIsInNpZCI6IjRlZGMwZjgxLWM3MzEtNDAwZi1hMGIyLTg5NGQwMWRhODdlNCJ9.7VEHWsghaE4D_5g6iuG-VkfOQJgsP1fwM9Ub9l8lvBw",
  "access_expires_at": "2026-10-29T16:20:50.988773971Z",
  "refresh_token": "-lz-eNEYbDL2MWhlvPY48cx_kUM0nuuQzA1Yiel30iM",
  "refresh_expires_at": "2026-11-28T16:05:50.988379118Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8",
  "session_id": "4edc0f81-c731-400f-a0b2-894d01da87e4",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637140807",
  "device_ref": "sandbox-4825"
}
```

```json
{
  "challenge_id": "d6ec2bf9-a45b-4414-81ab-dba9d59f8e4d",
  "expires_at": "2026-10-29T16:10:53.504562613Z",
  "resend_available_at": "2026-10-29T16:05:54.504562613Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637140807` → **200**

```json
{
  "phone": "+380637140807",
  "audience": "CLIENT",
  "code": "673143",
  "sent_at": "2026-10-29T16:05:53.507031752Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6ec2bf9-a45b-4414-81ab-dba9d59f8e4d",
  "code": "673143",
  "device_ref": "sandbox-4825"
}
```

```json
{
  "session_id": "559ec161-6c52-4610-be30-6e42c575885a",
  "subject": {
    "type": "CLIENT",
    "id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwM2IyZDRmNi0zYWRlLTQ2ZTktYTEzZS0xNTM2NGI0NWU5YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODUzLCJpYXQiOjE3OTMyODk5NTMsImp0aSI6ImZjZTQ3MzgzLTBhMTItNGYwMy1iNjg3LWI1NjJiNjViN2NlZCIsInNpZCI6IjU1OWVjMTYxLTZjNTItNDYxMC1iZTMwLTZlNDJjNTc1ODg1YSJ9.sHt2V-gemooz50U1qpdIfxGY2jRiemVb6rIvVvQHNmE",
  "access_expires_at": "2026-10-29T16:20:53.80393331Z",
  "refresh_token": "1My-zIrPl8q9okk0VcIG0NPp5uYKsGFDvDILUiztBLk",
  "refresh_expires_at": "2026-11-28T16:05:53.803474928Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "55211d14-1708-43de-be61-b0e6d426dc44",
  "expires_at": "2026-10-29T16:10:56.089773672Z",
  "resend_available_at": "2026-10-29T16:05:57.089773672Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637140807` → **200**

```json
{
  "phone": "+380637140807",
  "audience": "CLIENT",
  "code": "163377",
  "sent_at": "2026-10-29T16:05:56.092012629Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380633798959"
}
```

```json
{
  "challenge_id": "21926736-3e72-4e98-8525-0d1b0775f5b5",
  "expires_at": "2026-10-29T16:10:56.379487553Z",
  "resend_available_at": "2026-10-29T16:05:57.379487553Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633798959` → **200**

```json
{
  "phone": "+380633798959",
  "audience": "CLIENT",
  "code": "023927",
  "sent_at": "2026-10-29T16:05:56.382032189Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "72a824e6-7b53-47b9-b604-cb019123eb50",
  "current_challenge_id": "55211d14-1708-43de-be61-b0e6d426dc44",
  "current_code": "000000",
  "new_challenge_id": "21926736-3e72-4e98-8525-0d1b0775f5b5",
  "new_code": "023927"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e3bdc98a-235b-4d4b-9382-1756e692203e"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "97148343-49aa-436b-b88d-945568360ac3",
  "current_challenge_id": "55211d14-1708-43de-be61-b0e6d426dc44",
  "current_code": "163377",
  "new_challenge_id": "21926736-3e72-4e98-8525-0d1b0775f5b5",
  "new_code": "023927"
}
```

```json
{
  "subject_id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8",
  "phone": "+380633798959",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8",
  "session_id": "4edc0f81-c731-400f-a0b2-894d01da87e4",
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
  "correlation_id": "fbc22dce-3ff9-46db-a585-bc4a74966025"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633798959",
  "device_ref": "sandbox-8954"
}
```

```json
{
  "challenge_id": "02f26bbe-2b6d-40dc-a52e-29bf3a9bf37c",
  "expires_at": "2026-10-29T16:10:59.761636503Z",
  "resend_available_at": "2026-10-29T16:06:00.761636503Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633798959` → **200**

```json
{
  "phone": "+380633798959",
  "audience": "CLIENT",
  "code": "158173",
  "sent_at": "2026-10-29T16:05:59.764406177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02f26bbe-2b6d-40dc-a52e-29bf3a9bf37c",
  "code": "158173",
  "device_ref": "sandbox-8954"
}
```

```json
{
  "session_id": "01b61d31-b301-4c41-9ae0-1585260d2165",
  "subject": {
    "type": "CLIENT",
    "id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwM2IyZDRmNi0zYWRlLTQ2ZTktYTEzZS0xNTM2NGI0NWU5YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODYwLCJpYXQiOjE3OTMyODk5NjAsImp0aSI6ImIwODQ0ODE4LWU2NTQtNDk0OS05ZjExLTI0MWU1YjllYjgwNyIsInNpZCI6IjAxYjYxZDMxLWIzMDEtNGM0MS05YWUwLTE1ODUyNjBkMjE2NSJ9.ukumKeK55HqpTnotESzLeri32Ay925jYEHdsVywtjYI",
  "access_expires_at": "2026-10-29T16:21:00.062493278Z",
  "refresh_token": "L7tgGSKjeaeQu0Rv3-vz5F5Wjy0ABiQ6PMpjHaoGCOM",
  "refresh_expires_at": "2026-11-28T16:06:00.06199261Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8",
  "session_id": "01b61d31-b301-4c41-9ae0-1585260d2165",
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
  "session_id": "568a8913-08ef-42e4-ad11-4d2bd12b8d27",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NjAsImlhdCI6MTc5MzI4OTk2MCwianRpIjoiYjJiYjQ4YTYtNzMxYi00MjQyLTk3NzMtNWUzNjQ5ZjkyMDNkIiwic2lkIjoiNTY4YTg5MTMtMDhlZi00MmU0LWFkMTEtNGQyYmQxMmI4ZDI3In0.nFzM0p65hIIEitk1m7xBAPwLmNxKaSrDdRF7bVUBBbI",
  "access_expires_at": "2026-10-29T16:21:00.916681229Z",
  "refresh_token": "Ho3tYqTukU8ZrQUL7WIRjg4ffpkpZGrp4Q1xRNn1M_Q",
  "refresh_expires_at": "2026-10-30T04:06:00.916153527Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/03b2d4f6-3ade-46e9-a13e-15364b45e9b8` → **200**

```json
{
  "client": {
    "id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8",
    "phone": "+380633798959",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T16:05:50.986749Z",
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

`POST /api/admin/v1/clients/03b2d4f6-3ade-46e9-a13e-15364b45e9b8/phone/new-code` → **201**

```json
{
  "phone": "+380630685232"
}
```

```json
{
  "challenge_id": "caaf345d-010f-4e2a-9661-06206d63484b",
  "expires_at": "2026-10-29T16:11:01.50000221Z",
  "resend_available_at": "2026-10-29T16:06:02.50000221Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630685232` → **200**

```json
{
  "phone": "+380630685232",
  "audience": "CLIENT",
  "code": "130230",
  "sent_at": "2026-10-29T16:06:01.502052091Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/03b2d4f6-3ade-46e9-a13e-15364b45e9b8/phone` → **422**

```json
{
  "command_id": "b2b1f5f7-1437-44ec-97e1-9a23112ef354",
  "expected_version": 3,
  "new_challenge_id": "caaf345d-010f-4e2a-9661-06206d63484b",
  "new_code": "130231",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/03b2d4f6-3ade-46e9-a13e-15364b45e9b8/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "138e22aa-dc7e-41f8-892e-4412ca51f3b8"
}
```

`POST /api/admin/v1/clients/03b2d4f6-3ade-46e9-a13e-15364b45e9b8/phone` → **400**

```json
{
  "command_id": "7f9e10ff-8972-41aa-9ca6-b2435f102f81",
  "expected_version": 3,
  "new_challenge_id": "caaf345d-010f-4e2a-9661-06206d63484b",
  "new_code": "130230",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/03b2d4f6-3ade-46e9-a13e-15364b45e9b8/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d0a52fae-870d-454e-909e-0972b5214c1f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/03b2d4f6-3ade-46e9-a13e-15364b45e9b8/phone` → **200**

```json
{
  "command_id": "c9e81fc8-2fbe-4396-8ef4-fc5a084b4793",
  "expected_version": 3,
  "new_challenge_id": "caaf345d-010f-4e2a-9661-06206d63484b",
  "new_code": "130230",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8",
  "phone": "+380630685232",
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
  "correlation_id": "60adb328-af1f-46c0-b4d5-a3576948939a"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630685232",
  "device_ref": "sandbox-9784"
}
```

```json
{
  "challenge_id": "55431de2-e61a-44ab-abe2-7553455c078c",
  "expires_at": "2026-10-29T16:11:02.907890087Z",
  "resend_available_at": "2026-10-29T16:06:03.907890087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630685232` → **200**

```json
{
  "phone": "+380630685232",
  "audience": "CLIENT",
  "code": "970280",
  "sent_at": "2026-10-29T16:06:02.910406486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55431de2-e61a-44ab-abe2-7553455c078c",
  "code": "970280",
  "device_ref": "sandbox-9784"
}
```

```json
{
  "session_id": "b7eac5c0-8599-463f-80fb-dac88f13f08e",
  "subject": {
    "type": "CLIENT",
    "id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwM2IyZDRmNi0zYWRlLTQ2ZTktYTEzZS0xNTM2NGI0NWU5YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODYzLCJpYXQiOjE3OTMyODk5NjMsImp0aSI6ImVlMTU4ZjM4LTFjOTgtNDhmZi05OTNmLTdlNjg5MGJlOWY4NiIsInNpZCI6ImI3ZWFjNWMwLTg1OTktNDYzZi04MGZiLWRhYzg4ZjEzZjA4ZSJ9.2qPkugVm2qJIlcxhkWunvj3DJotK87p_mJpwy_iECe4",
  "access_expires_at": "2026-10-29T16:21:03.208281288Z",
  "refresh_token": "LJg9zEve8KDl2ikIW0UVs8spep4IsXi_rNbgWm18Kmo",
  "refresh_expires_at": "2026-11-28T16:06:03.207811665Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "03b2d4f6-3ade-46e9-a13e-15364b45e9b8",
  "session_id": "b7eac5c0-8599-463f-80fb-dac88f13f08e",
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
  "phone": "+380631222455",
  "device_ref": "sandbox-19575"
}
```

```json
{
  "challenge_id": "d7158596-5046-47f1-9177-3e84621d6fcb",
  "expires_at": "2026-10-29T16:11:03.763295906Z",
  "resend_available_at": "2026-10-29T16:06:04.763295906Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631222455` → **200**

```json
{
  "phone": "+380631222455",
  "audience": "CLIENT",
  "code": "762170",
  "sent_at": "2026-10-29T16:06:03.766112429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7158596-5046-47f1-9177-3e84621d6fcb",
  "code": "762170",
  "device_ref": "sandbox-19575"
}
```

```json
{
  "session_id": "edf9bf4c-2583-4332-acfb-38265fc80f34",
  "subject": {
    "type": "CLIENT",
    "id": "25be47db-1d47-4917-952d-d78a28c4ebf9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNWJlNDdkYi0xZDQ3LTQ5MTctOTUyZC1kNzhhMjhjNGViZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODY0LCJpYXQiOjE3OTMyODk5NjQsImp0aSI6IjM2YWVmZjdjLTdjOTYtNDlhYS1iMjBhLWJiOTk2ZjExOGZhNiIsInNpZCI6ImVkZjliZjRjLTI1ODMtNDMzMi1hY2ZiLTM4MjY1ZmM4MGYzNCJ9.CAZc0wBxACibAMhgNBpViy5PvaAN-kVBb0ClMLKMzDg",
  "access_expires_at": "2026-10-29T16:21:04.409380774Z",
  "refresh_token": "GSrsp3igywbsIYsIGGGHtzb6_ZN5N6zRYTjrKRJL2MA",
  "refresh_expires_at": "2026-11-28T16:06:04.408798004Z",
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
  "session_id": "c91f0c36-6bf0-4bd6-b0a2-c558c507e4e0",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NjUsImlhdCI6MTc5MzI4OTk2NSwianRpIjoiZGRlMjVlM2EtYjIyMS00ZDFiLThmOTktM2FhYWI4NWNhZmJkIiwic2lkIjoiYzkxZjBjMzYtNmJmMC00YmQ2LWIwYTItYzU1OGM1MDdlNGUwIn0.o-eSvvIExBjl-cTc-X1y75Z7pHx-1bDVFKOTqNaOGIY",
  "access_expires_at": "2026-10-29T16:21:05.561569141Z",
  "refresh_token": "CzIN2vk6Nt4NeQn6mgJKB2LDS9Qxf1VqG5pC-odItuU",
  "refresh_expires_at": "2026-10-30T04:06:05.56109109Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631222455` → **200**

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
  "correlation_id": "90d87b73-7c13-454f-9f24-30e3dc3e6384"
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
  "session_id": "14fb6832-03fb-47f9-850a-0d8ffa2d24a1",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NjYsImlhdCI6MTc5MzI4OTk2NiwianRpIjoiOThiMDVlYzQtNzY2Yy00NTkxLWI2MzItYTgyMzUzZjRmN2UyIiwic2lkIjoiMTRmYjY4MzItMDNmYi00N2Y5LTg1MGEtMGQ4ZmZhMmQyNGExIn0.CmQq49F9AegSfNH6TxtCMfuvud4G6oHuDKaOoptU1rM",
  "access_expires_at": "2026-10-29T16:21:06.709314875Z",
  "refresh_token": "8dzSYg3mA3YAFxOMo0cLVdT2DqeKuckMrivxCxlbq1I",
  "refresh_expires_at": "2026-10-30T04:06:06.708843364Z",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T16:02:15.79516Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c07e662f-f965-47a7-b678-e5dcd9b00fa3",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T16:06:07.269031255Z"
}
```

## The rider books the airport for 2026-10-29T19:06:06Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600905649",
  "device_ref": "sandbox-5664"
}
```

```json
{
  "challenge_id": "9daf9123-24f5-4a5c-b68f-a938f7b0a4a7",
  "expires_at": "2026-10-29T16:11:07.555666851Z",
  "resend_available_at": "2026-10-29T16:06:08.555666851Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600905649` → **200**

```json
{
  "phone": "+48600905649",
  "audience": "CLIENT",
  "code": "986127",
  "sent_at": "2026-10-29T16:06:07.558163938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9daf9123-24f5-4a5c-b68f-a938f7b0a4a7",
  "code": "986127",
  "device_ref": "sandbox-5664"
}
```

```json
{
  "session_id": "f2ddea49-af53-49c7-b554-adeeffde91db",
  "subject": {
    "type": "CLIENT",
    "id": "f221ac7f-eaad-44f3-911f-9cb7e798eb92"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMjIxYWM3Zi1lYWFkLTQ0ZjMtOTExZi05Y2I3ZTc5OGViOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODY3LCJpYXQiOjE3OTMyODk5NjcsImp0aSI6ImUyOGZkOTdjLTM3NjgtNDMzMS05MmIyLWY4OTcxMjZkYWUyZSIsInNpZCI6ImYyZGRlYTQ5LWFmNTMtNDljNy1iNTU0LWFkZWVmZmRlOTFkYiJ9.U9EH4Qb7RdS2PqMjbd1I0qRzNJhkSYIYa0mhm5-HCdM",
  "access_expires_at": "2026-10-29T16:21:07.84380707Z",
  "refresh_token": "1mm55xT0VN0dswPB-Kc_ZwvuJKESfxKUBqu9BBLYj1I",
  "refresh_expires_at": "2026-11-28T16:06:07.843284432Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "143028be-ac23-4fc2-b22a-a4f5cc618cb0",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T19:06:06Z"
}
```

```json
{
  "id": "42557db9-587c-4e79-ab4f-e45f74154451",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:11:08.120011Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T19:06:06Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e277af67-cc19-4cc2-969b-48003c995992",
  "quote_id": "42557db9-587c-4e79-ab4f-e45f74154451",
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
  "pickup_at": "2026-10-29T19:06:06Z"
}
```

```json
{
  "id": "ebdcb304-15de-4277-85d6-af48e594d6e6",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f221ac7f-eaad-44f3-911f-9cb7e798eb92",
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
  "created_at": "2026-10-29T16:06:08.397645Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T19:06:06Z",
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
  "device_ref": "sandbox-24162"
}
```

```json
{
  "challenge_id": "e96decc3-7fd6-4c2d-90a3-94ca41891416",
  "expires_at": "2026-10-29T16:11:08.679016206Z",
  "resend_available_at": "2026-10-29T16:06:09.679016206Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "938119",
  "sent_at": "2026-10-29T16:06:08.6815163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e96decc3-7fd6-4c2d-90a3-94ca41891416",
  "code": "938119",
  "device_ref": "sandbox-24162"
}
```

```json
{
  "session_id": "007b45f9-f8ef-495c-9d66-68ea342d77e7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDg2OCwiaWF0IjoxNzkzMjg5OTY4LCJqdGkiOiI2NDc2MmRhZS1jMmY3LTQwODEtYTQ0Ny05NmZhOGY5OWE1NGIiLCJzaWQiOiIwMDdiNDVmOS1mOGVmLTQ5NWMtOWQ2Ni02OGVhMzQyZDc3ZTcifQ.xxBR0sVncoN0xUpVPuOklcaKko6x82PNRr4TZxVw5PE",
  "access_expires_at": "2026-10-29T16:21:08.971964372Z",
  "refresh_token": "FdkAN7JlvxaTKl225qY2HG1ebupxcvFHsJXq-Wk_5ms",
  "refresh_expires_at": "2026-11-28T16:06:08.971399318Z",
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
  "command_id": "145c4522-2789-4e02-a971-d04534de8277",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:09Z",
    "sequence": 1793289969507
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6ccc47a7-fd7e-44d3-96f2-b00784bb1439",
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
  "last_heartbeat_at": "2026-10-29T16:06:09.523648Z",
  "last_location_at": "2026-10-29T16:06:09.523648Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "ebdcb304-15de-4277-85d6-af48e594d6e6",
      "short_number": 24,
      "pickup_at": "2026-10-29T19:06:06Z",
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

`POST /api/driver/v1/preorders/ebdcb304-15de-4277-85d6-af48e594d6e6/reserve` → **200**

```json
{
  "command_id": "54a625db-dd0f-4cf0-a1ae-3585edd3c1af"
}
```

```json
{
  "id": "d0a38340-77bd-4ce8-811f-c2efed3b2667",
  "state": "RESERVED",
  "order": {
    "order_id": "ebdcb304-15de-4277-85d6-af48e594d6e6",
    "short_number": 24,
    "pickup_at": "2026-10-29T19:06:06Z",
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
  "reserved_at": "2026-10-29T16:06:10.082069Z",
  "confirm_from": "2026-10-29T18:36:06Z",
  "confirm_until": "2026-10-29T18:46:06Z",
  "drop_until": "2026-10-29T18:06:06Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "d0a38340-77bd-4ce8-811f-c2efed3b2667",
      "state": "RESERVED",
      "order": {
        "order_id": "ebdcb304-15de-4277-85d6-af48e594d6e6",
        "short_number": 24,
        "pickup_at": "2026-10-29T19:06:06Z",
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
      "reserved_at": "2026-10-29T16:06:10.082069Z",
      "confirm_from": "2026-10-29T18:36:06Z",
      "confirm_until": "2026-10-29T18:46:06Z",
      "drop_until": "2026-10-29T18:06:06Z"
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
      "id": "d0a38340-77bd-4ce8-811f-c2efed3b2667",
      "state": "RESERVED",
      "order": {
        "order_id": "ebdcb304-15de-4277-85d6-af48e594d6e6",
        "short_number": 24,
        "pickup_at": "2026-10-29T19:06:06Z",
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
      "reserved_at": "2026-10-29T16:06:10.082069Z",
      "confirm_from": "2026-10-29T18:36:06Z",
      "confirm_until": "2026-10-29T18:46:06Z",
      "drop_until": "2026-10-29T18:06:06Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/d0a38340-77bd-4ce8-811f-c2efed3b2667/confirm` → **409**

```json
{
  "command_id": "4d9e1957-f5e6-4b34-a81e-1b11dee183c3"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/d0a38340-77bd-4ce8-811f-c2efed3b2667/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ca9b3cb8-e3bd-4693-81a8-eb3bb6304b05"
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
  "session_id": "37282e7d-24cd-4c67-a341-2ebbd0c63f83",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NzEsImlhdCI6MTc5MzI4OTk3MSwianRpIjoiOTI0NTU0ZWMtMWZlYS00MTg5LThlMDgtZjYwNGE5MDYzMTAzIiwic2lkIjoiMzcyODJlN2QtMjRjZC00YzY3LWEzNDEtMmViYmQwYzYzZjgzIn0.HSg_3YofQPqDU_Z-8jJns_P3WN4noRXZ6z968Y5eIxI",
  "access_expires_at": "2026-10-29T16:21:11.476148242Z",
  "refresh_token": "6WMUPHc2_ooy-s9vX3XkZUXgY8REFwuzbODdEV8VBSc",
  "refresh_expires_at": "2026-10-30T04:06:11.475688343Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ebdcb304-15de-4277-85d6-af48e594d6e6` → **200**

```json
{
  "id": "ebdcb304-15de-4277-85d6-af48e594d6e6",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f221ac7f-eaad-44f3-911f-9cb7e798eb92",
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
  "created_at": "2026-10-29T16:06:08.397645Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T19:06:06Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "d0a38340-77bd-4ce8-811f-c2efed3b2667",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T16:06:10.082069Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ebdcb304-15de-4277-85d6-af48e594d6e6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T16:06:08.39865Z",
      "actor": {
        "type": "CLIENT",
        "id": "f221ac7f-eaad-44f3-911f-9cb7e798eb92",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "ebdcb304-15de-4277-85d6-af48e594d6e6",
        "preorder": true,
        "quote_id": "42557db9-587c-4e79-ab4f-e45f74154451",
        "pickup_at": "2026-10-29T19:06:06Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "8fb27242-fd3b-4c4b-8d76-d9fcb00a259c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T16:06:10.083274Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ebdcb304-15de-4277-85d6-af48e594d6e6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "d0a38340-77bd-4ce8-811f-c2efed3b2667"
      },
      "correlation_id": "075c3006-21cf-4fc3-abe1-ab53338bd5ff"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order ebdcb304-15de-4277-85d6-af48e594d6e6, reservation d0a38340-77bd-4ce8-811f-c2efed3b2667.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25752"
}
```

```json
{
  "challenge_id": "ad6c7bff-e30a-41a8-9cc5-f8964bc578f7",
  "expires_at": "2026-10-29T16:11:12.321751512Z",
  "resend_available_at": "2026-10-29T16:06:13.321751512Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "626872",
  "sent_at": "2026-10-29T16:06:12.324342409Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad6c7bff-e30a-41a8-9cc5-f8964bc578f7",
  "code": "626872",
  "device_ref": "sandbox-25752"
}
```

```json
{
  "session_id": "f18b7e90-c62b-47d4-82ab-9e845e3a2b33",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDg3MiwiaWF0IjoxNzkzMjg5OTcyLCJqdGkiOiJlOGRjZmJiYy1jMTIwLTQwNGYtODczYi01NDRlZjQ3YjNlYTYiLCJzaWQiOiJmMThiN2U5MC1jNjJiLTQ3ZDQtODJhYi05ZTg0NWUzYTJiMzMifQ.EmY_gRcP99_OBy-eDy04STBHu5fy6BO8IePzxMJSRFU",
  "access_expires_at": "2026-10-29T16:21:12.611493022Z",
  "refresh_token": "VLMFnSAZ28WEMQ6SWkLV6nzjy0gSHQOqz59v9KFcVC8",
  "refresh_expires_at": "2026-11-28T16:06:12.611008011Z",
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
  "command_id": "32d60d81-5369-43b2-8b19-26fa587059d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:13Z",
    "sequence": 1793289973136
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6698d06-b312-4d55-81e4-bd92bf546466",
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
  "last_heartbeat_at": "2026-10-29T16:06:13.15444Z",
  "last_location_at": "2026-10-29T16:06:13.15444Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676891923",
  "device_ref": "sandbox-24044"
}
```

```json
{
  "challenge_id": "6d9f6cff-9021-4436-b7d5-303d25483afa",
  "expires_at": "2026-10-29T16:11:13.430961437Z",
  "resend_available_at": "2026-10-29T16:06:14.430961437Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676891923` → **200**

```json
{
  "phone": "+380676891923",
  "audience": "CLIENT",
  "code": "866153",
  "sent_at": "2026-10-29T16:06:13.433604068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d9f6cff-9021-4436-b7d5-303d25483afa",
  "code": "866153",
  "device_ref": "sandbox-24044"
}
```

```json
{
  "session_id": "5f7a63d7-df44-443c-83e3-121e12611290",
  "subject": {
    "type": "CLIENT",
    "id": "8a5d8814-3fba-4dee-a537-a9adbbac2fea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YTVkODgxNC0zZmJhLTRkZWUtYTUzNy1hOWFkYmJhYzJmZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODczLCJpYXQiOjE3OTMyODk5NzMsImp0aSI6IjU0MGI4OGQ4LTc0NDEtNDY5Mi04ZWEyLWUwMzAzZTYxZTM4NiIsInNpZCI6IjVmN2E2M2Q3LWRmNDQtNDQzYy04M2UzLTEyMWUxMjYxMTI5MCJ9.IV5hATszT-S_gLXcR5gRMV_dOLVXZVSLEgOrdD340v4",
  "access_expires_at": "2026-10-29T16:21:13.719043436Z",
  "refresh_token": "S9sRwgJJOBejXsSdd_PBJmnDO4-DZC6TR2KvsFtdEMw",
  "refresh_expires_at": "2026-11-28T16:06:13.718342964Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "19e815e8-6085-4818-943b-fc5e704bd74d",
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
  "id": "ffeb0439-feba-46f7-8b01-6f00258cf031",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:11:13.990811Z",
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
  "command_id": "af5f7f79-dfe9-49f5-984c-288c6ff903b4",
  "quote_id": "ffeb0439-feba-46f7-8b01-6f00258cf031",
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
  "id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8a5d8814-3fba-4dee-a537-a9adbbac2fea",
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
  "created_at": "2026-10-29T16:06:14.276155Z",
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
    "id": "bef8cae7-a6a1-41e2-a629-32364843cd9b",
    "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
    "expires_at": "2026-10-29T16:06:29.280477Z",
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

`POST /api/driver/v1/offers/bef8cae7-a6a1-41e2-a629-32364843cd9b/accept` → **200**

```json
{
  "command_id": "77f77442-f967-4a58-b368-08f5c8006646"
}
```

```json
{
  "id": "532b9050-0173-4893-910e-358a7611ff4c",
  "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3",
  "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "assignment_id": "532b9050-0173-4893-910e-358a7611ff4c",
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

`POST /api/driver/v1/work-sessions/e6698d06-b312-4d55-81e4-bd92bf546466/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:15Z",
    "sequence": 1793289975374
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6698d06-b312-4d55-81e4-bd92bf546466",
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
  "last_heartbeat_at": "2026-10-29T16:06:15.391796Z",
  "last_location_at": "2026-10-29T16:06:15.391796Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3",
  "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "assignment_id": "532b9050-0173-4893-910e-358a7611ff4c",
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

`POST /api/driver/v1/trips/17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3/arrive` → **200**

```json
{
  "command_id": "3ff1858f-c599-45c4-86b1-fd1e89ae8ecb",
  "expected_version": 0
}
```

```json
{
  "id": "17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3",
  "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "assignment_id": "532b9050-0173-4893-910e-358a7611ff4c",
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
  "arrived_at": "2026-10-29T16:06:15.923186Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3/start` → **200**

```json
{
  "command_id": "95acafa2-2d54-43fb-972c-bb160b4e27d6",
  "expected_version": 1
}
```

```json
{
  "id": "17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3",
  "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "assignment_id": "532b9050-0173-4893-910e-358a7611ff4c",
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
  "arrived_at": "2026-10-29T16:06:15.923186Z",
  "started_at": "2026-10-29T16:06:16.200313Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e6698d06-b312-4d55-81e4-bd92bf546466/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:16Z",
    "sequence": 1793289976494
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6698d06-b312-4d55-81e4-bd92bf546466",
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
  "last_heartbeat_at": "2026-10-29T16:06:16.515495Z",
  "last_location_at": "2026-10-29T16:06:16.515495Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3/complete` → **200**

```json
{
  "command_id": "38a83da0-20ba-492b-86cd-efa78fab80e9",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:06:16Z",
  "cash_received": true
}
```

```json
{
  "id": "17cde745-6b02-4e9e-b3ab-eab1a6a5a4c3",
  "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "assignment_id": "532b9050-0173-4893-910e-358a7611ff4c",
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
  "arrived_at": "2026-10-29T16:06:15.923186Z",
  "started_at": "2026-10-29T16:06:16.200313Z",
  "completed_at": "2026-10-29T16:06:16.807004Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/033d8e68-acc9-465b-a8bd-6c0fd378d064/rating` → **200**

```json
{
  "command_id": "5fb15311-630e-44ce-97c4-fb21a94beb7f",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "score": 5,
  "created_at": "2026-10-29T16:06:17.120924921Z"
}
```

`POST /api/driver/v1/orders/033d8e68-acc9-465b-a8bd-6c0fd378d064/rating` → **200**

```json
{
  "command_id": "bce34506-8f3c-4ccd-a3e5-a09d797ffebb",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
  "score": 4,
  "created_at": "2026-10-29T16:06:17.398426977Z"
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
  "session_id": "5ab0bb29-9af0-4ab0-9b96-d0765fe844c7",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NzgsImlhdCI6MTc5MzI4OTk3OCwianRpIjoiNWJhYTQ3ZmEtNzZjOC00MDk5LTkwZTctMDdlM2Q0Y2ExMmUyIiwic2lkIjoiNWFiMGJiMjktOWFmMC00YWIwLTliOTYtZDA3NjVmZTg0NGM3In0.wbBm6Rzb6Yt9n08keJdpfritIBzzx9dhMZms_m2zcow",
  "access_expires_at": "2026-10-29T16:21:18.257312687Z",
  "refresh_token": "_RrtvDnMGVGOa7yPxjG-5i5hdwvlCZhtFc19Nm9SI9o",
  "refresh_expires_at": "2026-10-30T04:06:18.256875548Z",
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
  "session_id": "50cc29e5-d5ee-42a8-8411-0d188b6d3ef8",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4NzgsImlhdCI6MTc5MzI4OTk3OCwianRpIjoiOTE3MjJmYzgtNDI4Yi00ZWViLTlhMzMtNTU3MDcwZjk5YmQ3Iiwic2lkIjoiNTBjYzI5ZTUtZDVlZS00MmE4LTg0MTEtMGQxODhiNmQzZWY4In0.xPHM8fWuph7W7BCC0ra1rrn3l4Qq1iyxJcNwfWwSFGY",
  "access_expires_at": "2026-10-29T16:21:18.839894838Z",
  "refresh_token": "D_RUdkwJNQJo9Ssu8b-9WcIT7n04_hwBmYalgExxPRw",
  "refresh_expires_at": "2026-10-30T04:06:18.839438786Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/033d8e68-acc9-465b-a8bd-6c0fd378d064/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
      "author_type": "RIDER",
      "author_id": "8a5d8814-3fba-4dee-a537-a9adbbac2fea",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T16:06:17.120925Z"
    },
    {
      "order_id": "033d8e68-acc9-465b-a8bd-6c0fd378d064",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "8a5d8814-3fba-4dee-a537-a9adbbac2fea",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T16:06:17.398427Z"
    }
  ]
}
```

Done: ratings for order 033d8e68-acc9-465b-a8bd-6c0fd378d064.

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
  "session_id": "f5b6d634-9543-4635-9db1-c4eaeeb2295d",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4ODAsImlhdCI6MTc5MzI4OTk4MCwianRpIjoiMjQ5ZGNhYzItNzNhNy00OWU1LTk4MjEtMzM3OWM4MzlhYzA3Iiwic2lkIjoiZjViNmQ2MzQtOTU0My00NjM1LTlkYjEtYzRlYWVlYjIyOTVkIn0.tyRQrV34p0-VVZ4Di9po-Dyxu7jB4NL5xVnH6ArOh2Y",
  "access_expires_at": "2026-10-29T16:21:20.014642173Z",
  "refresh_token": "-3bvTzNMe1Kgv3mGMFg-uVEBitB6LV1R90MG8vXTYdQ",
  "refresh_expires_at": "2026-10-30T04:06:20.014001899Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "d15d55c0-09ad-4c05-a20e-59838b8acfef",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "919ab198-a0fa-4280-b0cc-1d9681bae893",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T16:06:20.290039Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/919ab198-a0fa-4280-b0cc-1d9681bae893` → **200**

```json
{
  "id": "919ab198-a0fa-4280-b0cc-1d9681bae893",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T16:06:20.290039Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/919ab198-a0fa-4280-b0cc-1d9681bae893` → **200**

```json
{
  "id": "919ab198-a0fa-4280-b0cc-1d9681bae893",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T16:06:20.290039Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/919ab198-a0fa-4280-b0cc-1d9681bae893` → **200**

```json
{
  "id": "919ab198-a0fa-4280-b0cc-1d9681bae893",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T16:06:20.290039Z",
  "ready_at": "2026-10-29T16:06:22.586378Z",
  "expires_at": "2026-10-30T16:06:22.586378Z"
}
```

`GET /api/admin/v1/reports/exports/919ab198-a0fa-4280-b0cc-1d9681bae893/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f3047a31-6d15-443c-b43f-2d100bd0fc74",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "4a3d68d7-3ad3-42a7-859a-08657a3f0eed",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T16:06:23.417481Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4a3d68d7-3ad3-42a7-859a-08657a3f0eed` → **200**

```json
{
  "id": "4a3d68d7-3ad3-42a7-859a-08657a3f0eed",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T16:06:23.417481Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4a3d68d7-3ad3-42a7-859a-08657a3f0eed` → **200**

```json
{
  "id": "4a3d68d7-3ad3-42a7-859a-08657a3f0eed",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T16:06:23.417481Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4a3d68d7-3ad3-42a7-859a-08657a3f0eed` → **200**

```json
{
  "id": "4a3d68d7-3ad3-42a7-859a-08657a3f0eed",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T16:06:23.417481Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4a3d68d7-3ad3-42a7-859a-08657a3f0eed` → **200**

```json
{
  "id": "4a3d68d7-3ad3-42a7-859a-08657a3f0eed",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T16:06:23.417481Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4a3d68d7-3ad3-42a7-859a-08657a3f0eed` → **200**

```json
{
  "id": "4a3d68d7-3ad3-42a7-859a-08657a3f0eed",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T16:06:23.417481Z",
  "ready_at": "2026-10-29T16:06:27.596301Z",
  "expires_at": "2026-10-30T16:06:27.596301Z"
}
```

`GET /api/admin/v1/reports/exports/4a3d68d7-3ad3-42a7-859a-08657a3f0eed/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4a6e52ff-e51d-4f17-a7ab-dd20a73214e2` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4a6e52ff-e51d-4f17-a7ab-dd20a73214e2",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "444da143-d785-4199-897b-c77a8503c08e"
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
  "device_ref": "sandbox-24411"
}
```

```json
{
  "challenge_id": "a2eabcf8-b1ef-4dd6-9092-9a191eb8fc06",
  "expires_at": "2026-10-29T16:11:29.352322336Z",
  "resend_available_at": "2026-10-29T16:06:30.352322336Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "101916",
  "sent_at": "2026-10-29T16:06:29.354962049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2eabcf8-b1ef-4dd6-9092-9a191eb8fc06",
  "code": "101916",
  "device_ref": "sandbox-24411"
}
```

```json
{
  "session_id": "86d9befb-2936-4bfa-bbc3-043b78074d87",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDg4OSwiaWF0IjoxNzkzMjg5OTg5LCJqdGkiOiJjZGM1YTQ0Ni01NzhiLTQwYTMtYWUxMy0xOGYxZmYyN2Q5OTUiLCJzaWQiOiI4NmQ5YmVmYi0yOTM2LTRiZmEtYmJjMy0wNDNiNzgwNzRkODcifQ.N1TOgFDMtUhAPT_bCVbaRUXwNEHCgaCm5XpEKW8g8ME",
  "access_expires_at": "2026-10-29T16:21:29.659998334Z",
  "refresh_token": "a-C4zysOug1l3cB0UN3BSlNNZOz-YpE_KvBFocmmjsQ",
  "refresh_expires_at": "2026-11-28T16:06:29.659173295Z",
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
  "command_id": "bdbad53b-8158-46df-a85a-b0b573bfa354",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:30Z",
    "sequence": 1793289990461
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6a6551d7-9cbd-4d76-a38a-0340538e4131",
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
  "last_heartbeat_at": "2026-10-29T16:06:30.47848Z",
  "last_location_at": "2026-10-29T16:06:30.47848Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "1f69f283-ab21-4fd5-94b3-1df16914ffe4",
  "points": [
    {
      "sequence": 1793289992753,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T16:05:32Z"
    },
    {
      "sequence": 1793289992761,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T16:06:32Z"
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
  "session_id": "6eddb131-f3a9-4942-9654-3bd54ff2099c",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4OTMsImlhdCI6MTc5MzI4OTk5MywianRpIjoiODlkMjU1ZGMtNjI0YS00YjVmLTllODYtNGQwMmY5ZTkzZjQ4Iiwic2lkIjoiNmVkZGIxMzEtZjNhOS00OTQyLTk2NTQtM2JkNTRmZjIwOTljIn0.fHPQPAZFDd1P17JLkU_Uh9lGJWEGRt0kMImwhxEg8kg",
  "access_expires_at": "2026-10-29T16:21:33.392064105Z",
  "refresh_token": "P9CoyrIWY9o92vY1oa24ZUDMhTpotLrO24-JMp_aHIw",
  "refresh_expires_at": "2026-10-30T04:06:33.391597622Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "359ff9e9-9726-436c-963f-3de66cb62fc6",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T16:06:32Z",
        "track_point_id": "e92e1455-8116-4a76-9f00-a71cd78efc22",
        "work_session_id": "6a6551d7-9cbd-4d76-a38a-0340538e4131"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T16:06:32Z",
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

`POST /api/admin/v1/driver-risk-flags/359ff9e9-9726-436c-963f-3de66cb62fc6/confirm` → **200**

```json
{
  "command_id": "2eae9850-6995-4ffb-88a1-059b2a31e5d0",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "359ff9e9-9726-436c-963f-3de66cb62fc6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T16:06:32Z",
    "track_point_id": "e92e1455-8116-4a76-9f00-a71cd78efc22",
    "work_session_id": "6a6551d7-9cbd-4d76-a38a-0340538e4131"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T16:06:32Z",
  "reason": null,
  "reviewed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reviewed_at": "2026-10-29T16:06:34.248576Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/359ff9e9-9726-436c-963f-3de66cb62fc6/dismiss` → **409**

```json
{
  "command_id": "f98f4d7d-d36d-40c9-86fd-7f2136aa8592",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/359ff9e9-9726-436c-963f-3de66cb62fc6/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "88662a60-13fa-48ae-bb75-aab374d56dd4"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c8d29481-22ba-4722-a2ae-c12b1cab36bc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "10668f64-b497-4092-a9c4-c2c6257c857d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "raised_at": "2026-10-29T16:06:34.816791Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/10668f64-b497-4092-a9c4-c2c6257c857d/dismiss` → **200**

```json
{
  "command_id": "01db48e8-57f6-4dbd-b271-72966d5f0ce1",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "10668f64-b497-4092-a9c4-c2c6257c857d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "raised_at": "2026-10-29T16:06:34.816791Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reviewed_at": "2026-10-29T16:06:35.095727Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c17d56d1-89a2-438f-93a8-484f58a39b11",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "359ff9e9-9726-436c-963f-3de66cb62fc6"
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
      "actor_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T16:06:35.380978Z"
    }
  ]
}
```

Done: flag 359ff9e9-9726-436c-963f-3de66cb62fc6 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "d8293434-0037-4c99-bd81-93b63ef27259",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4OTYsImlhdCI6MTc5MzI4OTk5NiwianRpIjoiODk4N2ZlNDgtMzA4Yy00YTBlLTg4OGQtNjk1OTZkZTExMWRmIiwic2lkIjoiZDgyOTM0MzQtMDAzNy00Yzk5LWJkODEtOTNiNjNlZjI3MjU5In0.14ErNNYYJJBHu2cDvG9sTxkLMgxlTg-DnTC0_eI-e3E",
  "access_expires_at": "2026-10-29T16:21:36.250207304Z",
  "refresh_token": "c-2MHdrWzyEHrmziGmS1LobHqyVr8Q9_M6Kprqx7u7s",
  "refresh_expires_at": "2026-10-30T04:06:36.249553761Z",
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
      "actor_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T16:06:35.380978Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "247bdcb9-9160-4032-b6ac-3279a6676339",
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
  "session_id": "6a6551d7-9cbd-4d76-a38a-0340538e4131",
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
  "last_heartbeat_at": "2026-10-29T16:06:30.47848Z",
  "last_location_at": "2026-10-29T16:06:30.47848Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a6551d7-9cbd-4d76-a38a-0340538e4131/close` → **200**

```json
{
  "command_id": "66ceab43-4fab-4c15-b184-91c56495e761",
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
  "session_id": "b16db306-79a3-43d8-9060-df75cc2c6f4b",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA4OTcsImlhdCI6MTc5MzI4OTk5NywianRpIjoiYTBiMjFjMzUtNTdiYS00NWEyLTgwZWMtODM4NzIwZjRmYTBjIiwic2lkIjoiYjE2ZGIzMDYtNzlhMy00M2Q4LTkwNjAtZGY3NWNjMmM2ZjRiIn0.bNPLVktdslKqMYm4Zt5naclPW_CcF6U7wMfc_WIKAxs",
  "access_expires_at": "2026-10-29T16:21:37.93327865Z",
  "refresh_token": "dE9edStPoMXoL_UQXsjvj4vfRtyRFU0oh4d9FY3Lafg",
  "refresh_expires_at": "2026-10-30T04:06:37.932754826Z",
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
  "command_id": "21b6cd71-8dbd-4db4-9a12-dc51f0b51ee1",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T16:06:38.481165Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "21b6cd71-8dbd-4db4-9a12-dc51f0b51ee1",
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
  "changed_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T16:06:38.481165Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48967627383",
  "device_ref": "sandbox-22682"
}
```

```json
{
  "challenge_id": "3e4c5716-e8a8-4c7a-b141-b85631f0dfd8",
  "expires_at": "2026-10-29T16:11:39.040615628Z",
  "resend_available_at": "2026-10-29T16:06:40.040615628Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48967627383` → **200**

```json
{
  "phone": "+48967627383",
  "audience": "CLIENT",
  "code": "207293",
  "sent_at": "2026-10-29T16:06:39.043258604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e4c5716-e8a8-4c7a-b141-b85631f0dfd8",
  "code": "207293",
  "device_ref": "sandbox-22682"
}
```

```json
{
  "session_id": "3bc7affb-8e0a-439f-b5c5-828b6484935c",
  "subject": {
    "type": "CLIENT",
    "id": "7b3ed082-6adf-454b-bb9d-04d9cf802dbf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjNlZDA4Mi02YWRmLTQ1NGItYmI5ZC0wNGQ5Y2Y4MDJkYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwODk5LCJpYXQiOjE3OTMyODk5OTksImp0aSI6ImFjNzc4ZWRkLWZhMTktNDM0My05NTc2LWRkM2VjOTFhODFiNSIsInNpZCI6IjNiYzdhZmZiLThlMGEtNDM5Zi1iNWM1LTgyOGI2NDg0OTM1YyJ9.YAjYwb29Tf2EFKYHPzpXBJAEB8tPE23LseRnL_8lsJA",
  "access_expires_at": "2026-10-29T16:21:39.41807761Z",
  "refresh_token": "cb9c0_I6vQmP1DE3qdGdATMHs8ZyWSbQ7CpCbJcsMnk",
  "refresh_expires_at": "2026-11-28T16:06:39.417475824Z",
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
  "correlation_id": "3ac9e542-89fc-420c-8711-be79ae0a2619"
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
  "device_ref": "sandbox-680"
}
```

```json
{
  "challenge_id": "a597fc5e-cc55-4997-a5ef-99f6dd33ed1e",
  "expires_at": "2026-10-29T16:11:40.25194241Z",
  "resend_available_at": "2026-10-29T16:06:41.25194241Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "263004",
  "sent_at": "2026-10-29T16:06:40.254320709Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a597fc5e-cc55-4997-a5ef-99f6dd33ed1e",
  "code": "263004",
  "device_ref": "sandbox-680"
}
```

```json
{
  "session_id": "ddc9014e-e682-4725-ac7f-dcefcd5e8581",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDkwMCwiaWF0IjoxNzkzMjkwMDAwLCJqdGkiOiI5YmQwMDFjZC1hNTU0LTQ1NjgtYWI4ZC1hNGU1NjA0OGI2Y2UiLCJzaWQiOiJkZGM5MDE0ZS1lNjgyLTQ3MjUtYWM3Zi1kY2VmY2Q1ZTg1ODEifQ.9abDVLu48Z3wY8WUQFFWHOvO87FbS2X8HCd2Q-px8L4",
  "access_expires_at": "2026-10-29T16:21:40.546802819Z",
  "refresh_token": "LvvdyE_o-_UQqfFddwrnVG_XQrTd4Ouo1Pzwck0HWAI",
  "refresh_expires_at": "2026-11-28T16:06:40.546403499Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6ccc47a7-fd7e-44d3-96f2-b00784bb1439",
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
  "last_heartbeat_at": "2026-10-29T16:06:09.523648Z",
  "last_location_at": "2026-10-29T16:06:09.523648Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6ccc47a7-fd7e-44d3-96f2-b00784bb1439/handover` → **200**

```json
{
  "command_id": "98994681-771a-4121-8d7d-1ec70efe9364",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6ccc47a7-fd7e-44d3-96f2-b00784bb1439",
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
  "last_heartbeat_at": "2026-10-29T16:06:09.523648Z",
  "last_location_at": "2026-10-29T16:06:09.523648Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6ccc47a7-fd7e-44d3-96f2-b00784bb1439/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:41Z",
    "sequence": 1793290001354
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6ccc47a7-fd7e-44d3-96f2-b00784bb1439",
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
  "last_heartbeat_at": "2026-10-29T16:06:41.371785Z",
  "last_location_at": "2026-10-29T16:06:41.371785Z",
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
  "session_id": "6ccc47a7-fd7e-44d3-96f2-b00784bb1439",
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
  "last_heartbeat_at": "2026-10-29T16:06:41.371785Z",
  "last_location_at": "2026-10-29T16:06:41.371785Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6ccc47a7-fd7e-44d3-96f2-b00784bb1439/close` → **200**

```json
{
  "command_id": "371e68aa-fe74-48b9-af93-083494e23a09",
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
  "correlation_id": "fe126971-ee87-451f-b263-d67ce991e9b9"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675952655",
  "device_ref": "sandbox-13826"
}
```

```json
{
  "challenge_id": "d42d3bff-9229-4e23-a22b-ae3b43fa556e",
  "expires_at": "2026-10-29T16:11:42.734984188Z",
  "resend_available_at": "2026-10-29T16:06:43.734984188Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675952655` → **200**

```json
{
  "phone": "+380675952655",
  "audience": "CLIENT",
  "code": "089320",
  "sent_at": "2026-10-29T16:06:42.737410702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d42d3bff-9229-4e23-a22b-ae3b43fa556e",
  "code": "089320",
  "device_ref": "sandbox-13826"
}
```

```json
{
  "session_id": "8d6ff519-cc27-4c2b-999f-6531f84bc3ca",
  "subject": {
    "type": "CLIENT",
    "id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTQ5OGJiZC05YWYyLTQxYmQtOGEwYi0wZjIwYmU5YzhjZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwOTAzLCJpYXQiOjE3OTMyOTAwMDMsImp0aSI6ImNlMzhiYjQ4LTdjYjItNDBmZC04ZDUwLTNjY2VhYmM1MzJjOCIsInNpZCI6IjhkNmZmNTE5LWNjMjctNGMyYi05OTlmLTY1MzFmODRiYzNjYSJ9.yKEWdLuLVFgSr0JG6Tf566GafogtbKLtYxtEaD9ibz8",
  "access_expires_at": "2026-10-29T16:21:43.027281069Z",
  "refresh_token": "O2TLZ_tiF83tUgaAJ-qS0Q5bTNZs2ee2LnloFxejF50",
  "refresh_expires_at": "2026-11-28T16:06:43.026845018Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "9f7f2337-8638-4284-a0ad-9dbb7c1da83c",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "42c5f680-03aa-4cc6-9744-1c91ec7297cc",
  "upload_path": "/api/rider/v1/uploads/42c5f680-03aa-4cc6-9744-1c91ec7297cc",
  "expires_at": "2026-10-29T16:21:43.301599073Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/42c5f680-03aa-4cc6-9744-1c91ec7297cc` → **200**

```json
{
  "file_id": "42c5f680-03aa-4cc6-9744-1c91ec7297cc",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "58beb616-6d24-4f9b-ba05-2144029a951a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "42c5f680-03aa-4cc6-9744-1c91ec7297cc"
  ]
}
```

```json
{
  "id": "74f794f9-ea02-42cc-8e43-a9ea9213beec",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T16:06:43.603518Z",
  "updated_at": "2026-10-29T16:06:43.603518Z",
  "respond_by": "2026-10-29T20:06:43.603518Z",
  "messages": [
    {
      "id": "e31dd485-c58b-4fc2-9f6e-0ce601348235",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T16:06:43.604535Z",
      "attachments": [
        {
          "file_id": "42c5f680-03aa-4cc6-9744-1c91ec7297cc",
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
  "session_id": "a1477557-4ddd-4a03-b59e-97bfb84f265a",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA5MDQsImlhdCI6MTc5MzI5MDAwNCwianRpIjoiY2Q3YWJhNjQtYWY0MC00Yjg1LWIxNmEtZTA2OTg3NDRjY2Y1Iiwic2lkIjoiYTE0Nzc1NTctNGRkZC00YTAzLWI1OWUtOTdiZmI4NGYyNjVhIn0.NgWXDkh2vWvzQRfZFdl35oPk3jDHL5lpb_YWxaJCIQ4",
  "access_expires_at": "2026-10-29T16:21:44.209553365Z",
  "refresh_token": "v4ITgsXtqXktBHaZzG4oG7577XwXIPlxAwLtH0rAaSM",
  "refresh_expires_at": "2026-10-30T04:06:44.209053487Z",
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
  "session_id": "51712062-1942-4ed9-8a0c-dd259e8cbf81",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA5MDQsImlhdCI6MTc5MzI5MDAwNCwianRpIjoiOWMzNDNjODUtZmZjNi00M2Q4LTk3NGEtYjQyMzk1ODZiMWVmIiwic2lkIjoiNTE3MTIwNjItMTk0Mi00ZWQ5LThhMGMtZGQyNTllOGNiZjgxIn0.ipihE6CRJv1j7xJmAr_qeiS1WbOC76OZ37hM6ornPws",
  "access_expires_at": "2026-10-29T16:21:44.783797718Z",
  "refresh_token": "hC9enMrBncgaa_cTrhqZA7dmQRN5bFcczxq6_gKCXwI",
  "refresh_expires_at": "2026-10-30T04:06:44.783268536Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/74f794f9-ea02-42cc-8e43-a9ea9213beec/attachments/42c5f680-03aa-4cc6-9744-1c91ec7297cc` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "56fe8052-84c9-473a-8ef5-c0d4a03bf948",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "2d685d2d-a7b2-4db5-9a5a-a6523a801fcd",
  "upload_path": "/api/operator/v1/uploads/2d685d2d-a7b2-4db5-9a5a-a6523a801fcd",
  "expires_at": "2026-10-29T16:21:45.065854401Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/2d685d2d-a7b2-4db5-9a5a-a6523a801fcd` → **200**

```json
{
  "file_id": "2d685d2d-a7b2-4db5-9a5a-a6523a801fcd",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/74f794f9-ea02-42cc-8e43-a9ea9213beec` → **200**

```json
{
  "id": "74f794f9-ea02-42cc-8e43-a9ea9213beec",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T16:06:43.603518Z",
  "updated_at": "2026-10-29T16:06:43.603518Z",
  "respond_by": "2026-10-29T20:06:43.603518Z",
  "messages": [
    {
      "id": "e31dd485-c58b-4fc2-9f6e-0ce601348235",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T16:06:43.604535Z",
      "attachments": [
        {
          "file_id": "42c5f680-03aa-4cc6-9744-1c91ec7297cc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/74f794f9-ea02-42cc-8e43-a9ea9213beec/comments` → **200**

```json
{
  "command_id": "75aab450-c7cc-4f4d-bff5-04a046d6c480",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "2d685d2d-a7b2-4db5-9a5a-a6523a801fcd"
  ]
}
```

```json
{
  "id": "74f794f9-ea02-42cc-8e43-a9ea9213beec",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T16:06:43.603518Z",
  "updated_at": "2026-10-29T16:06:45.640891Z",
  "respond_by": "2026-10-29T20:06:43.603518Z",
  "messages": [
    {
      "id": "e31dd485-c58b-4fc2-9f6e-0ce601348235",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T16:06:43.604535Z",
      "attachments": [
        {
          "file_id": "42c5f680-03aa-4cc6-9744-1c91ec7297cc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f6ab549d-aa85-4f09-906b-8d3d7f256bc4",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T16:06:45.640403Z",
      "attachments": [
        {
          "file_id": "2d685d2d-a7b2-4db5-9a5a-a6523a801fcd",
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

`GET /api/rider/v1/support/cases/74f794f9-ea02-42cc-8e43-a9ea9213beec` → **200**

```json
{
  "id": "74f794f9-ea02-42cc-8e43-a9ea9213beec",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T16:06:43.603518Z",
  "updated_at": "2026-10-29T16:06:45.640891Z",
  "respond_by": "2026-10-29T20:06:43.603518Z",
  "messages": [
    {
      "id": "e31dd485-c58b-4fc2-9f6e-0ce601348235",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "21498bbd-9af2-41bd-8a0b-0f20be9c8cf3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T16:06:43.604535Z",
      "attachments": [
        {
          "file_id": "42c5f680-03aa-4cc6-9744-1c91ec7297cc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f6ab549d-aa85-4f09-906b-8d3d7f256bc4",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T16:06:45.640403Z",
      "attachments": [
        {
          "file_id": "2d685d2d-a7b2-4db5-9a5a-a6523a801fcd",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/74f794f9-ea02-42cc-8e43-a9ea9213beec/attachments/2d685d2d-a7b2-4db5-9a5a-a6523a801fcd` → **200**

Done: support case 74f794f9-ea02-42cc-8e43-a9ea9213beec, rider attachment 42c5f680-03aa-4cc6-9744-1c91ec7297cc, operator attachment 2d685d2d-a7b2-4db5-9a5a-a6523a801fcd.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738027518",
  "device_ref": "sandbox-6915"
}
```

```json
{
  "challenge_id": "16373fad-58a5-4bf0-91fa-df51270a2f46",
  "expires_at": "2026-10-29T16:11:46.216836051Z",
  "resend_available_at": "2026-10-29T16:06:47.216836051Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738027518` → **200**

```json
{
  "phone": "+380738027518",
  "audience": "CLIENT",
  "code": "593003",
  "sent_at": "2026-10-29T16:06:46.219457154Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16373fad-58a5-4bf0-91fa-df51270a2f46",
  "code": "593003",
  "device_ref": "sandbox-6915"
}
```

```json
{
  "session_id": "34352bcd-e6fb-4788-b752-5ddeb0ec2f44",
  "subject": {
    "type": "CLIENT",
    "id": "b726e1ba-6526-4704-b061-c7a793663986"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzI2ZTFiYS02NTI2LTQ3MDQtYjA2MS1jN2E3OTM2NjM5ODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwOTA2LCJpYXQiOjE3OTMyOTAwMDYsImp0aSI6IjBlYzIzZDZjLWIyMDMtNDAwYy05ZjBjLTkxOGZhMGIxNTRhZSIsInNpZCI6IjM0MzUyYmNkLWU2ZmItNDc4OC1iNzUyLTVkZGViMGVjMmY0NCJ9.QPmRBdYmQK5ZI1vxRn7G6XBDHW9TlvCd1ktuloYQKK4",
  "access_expires_at": "2026-10-29T16:21:46.510549355Z",
  "refresh_token": "PckYNTgOvVaglfZ6b3csv56KScMz3aZD5PIV3DNZC7o",
  "refresh_expires_at": "2026-11-28T16:06:46.509945591Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "de62f91a-0dd1-4ea4-bf30-431bfa8a261d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a30846f3-dae8-4f90-b175-7c202f33f18c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a30846f3-dae8-4f90-b175-7c202f33f18c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "32a14b2f38fc5747e1ccf1ae1ec5b9a4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a30846f3-dae8-4f90-b175-7c202f33f18c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738027518"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a30846f3-dae8-4f90-b175-7c202f33f18c",
  "expires_at": "2026-10-29T16:36:46.775531Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/a30846f3-dae8-4f90-b175-7c202f33f18c` → **200**

```json
{
  "id": "a30846f3-dae8-4f90-b175-7c202f33f18c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:36:46.775531Z",
  "card": {
    "id": "6f460fa6-e99d-4ff2-b162-2507aefccf93",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7718",
    "card_type": "Visa",
    "created_at": "2026-10-29T16:06:47.048168Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "111f93da-608c-4fed-8064-00be7ba08baa",
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
  "id": "3b9d312a-7186-4a3f-9348-ace1e8ea5311",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:11:47.339302Z",
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
  "command_id": "d65f5ab1-8510-4aff-a654-d389ccfcf3b0",
  "quote_id": "3b9d312a-7186-4a3f-9348-ace1e8ea5311",
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
  "id": "5d7d7b67-9b2e-48f1-86af-430c5e19252f",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b726e1ba-6526-4704-b061-c7a793663986",
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
  "created_at": "2026-10-29T16:06:47.619335Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5d7d7b67-9b2e-48f1-86af-430c5e19252f` → **200**

```json
{
  "id": "5d7d7b67-9b2e-48f1-86af-430c5e19252f",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b726e1ba-6526-4704-b061-c7a793663986",
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
  "created_at": "2026-10-29T16:06:47.619335Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5d7d7b67-9b2e-48f1-86af-430c5e19252f` → **200**

```json
{
  "id": "5d7d7b67-9b2e-48f1-86af-430c5e19252f",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b726e1ba-6526-4704-b061-c7a793663986",
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
  "created_at": "2026-10-29T16:06:47.619335Z",
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

`GET /api/rider/v1/orders/5d7d7b67-9b2e-48f1-86af-430c5e19252f` → **200**

```json
{
  "id": "5d7d7b67-9b2e-48f1-86af-430c5e19252f",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b726e1ba-6526-4704-b061-c7a793663986",
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
  "created_at": "2026-10-29T16:06:47.619335Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5d7d7b67-9b2e-48f1-86af-430c5e19252f/switch-to-cash` → **200**

```json
{
  "command_id": "51a2b28f-e2f9-44e2-8225-658931e0044e",
  "expected_version": 3
}
```

```json
{
  "id": "5d7d7b67-9b2e-48f1-86af-430c5e19252f",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "b726e1ba-6526-4704-b061-c7a793663986",
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
  "created_at": "2026-10-29T16:06:47.619335Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5d7d7b67-9b2e-48f1-86af-430c5e19252f/switch-to-cash` → **409**

```json
{
  "command_id": "8b25776a-9272-4758-a45e-820f3fc02714",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/5d7d7b67-9b2e-48f1-86af-430c5e19252f/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e7a1fed8-7ccf-4e61-80de-bdef4fae1a7e"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/5d7d7b67-9b2e-48f1-86af-430c5e19252f` → **200**

```json
{
  "id": "5d7d7b67-9b2e-48f1-86af-430c5e19252f",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "b726e1ba-6526-4704-b061-c7a793663986",
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
  "created_at": "2026-10-29T16:06:47.619335Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5d7d7b67-9b2e-48f1-86af-430c5e19252f/cancel` → **200**

```json
{
  "command_id": "2a44f2b2-7a5d-4968-9df2-3ef0f35b6340",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5d7d7b67-9b2e-48f1-86af-430c5e19252f",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "b726e1ba-6526-4704-b061-c7a793663986",
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
  "created_at": "2026-10-29T16:06:47.619335Z",
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
  "session_id": "60be20fa-3859-4e1b-8330-153b21541e6f",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA5MTEsImlhdCI6MTc5MzI5MDAxMSwianRpIjoiMjZiOWY0NjUtYzA5Ny00Njc2LWE3MGQtYTc0NjFiMjFlNjNmIiwic2lkIjoiNjBiZTIwZmEtMzg1OS00ZTFiLTgzMzAtMTUzYjIxNTQxZTZmIn0.n7QgN5NMkTKgjQS01lckF8V-He_YhD5wmkZvGtJLBz4",
  "access_expires_at": "2026-10-29T16:21:51.218311805Z",
  "refresh_token": "ikuhZlPOikovpKIemrvCl3Th7Ae1RgqbsWE_xrj8RDw",
  "refresh_expires_at": "2026-10-30T04:06:51.217864335Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23088"
}
```

```json
{
  "challenge_id": "30cc605a-5a41-431f-b65a-1f8bc8c3c192",
  "expires_at": "2026-10-29T16:11:51.482807883Z",
  "resend_available_at": "2026-10-29T16:06:52.482807883Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "768981",
  "sent_at": "2026-10-29T16:06:51.485643532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30cc605a-5a41-431f-b65a-1f8bc8c3c192",
  "code": "768981",
  "device_ref": "sandbox-23088"
}
```

```json
{
  "session_id": "b20753fe-3331-44b7-8d17-27a5fcbd1c13",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDkxMSwiaWF0IjoxNzkzMjkwMDExLCJqdGkiOiJhNTQ5MGUwNC03MmM2LTRkMGYtYTI0ZC1iOGVlMjFkNzFmOWYiLCJzaWQiOiJiMjA3NTNmZS0zMzMxLTQ0YjctOGQxNy0yN2E1ZmNiZDFjMTMifQ.kDJoLA8-fKZkQBsqZ_-Vtx68fXXGB7uiVKDEwHkQhl4",
  "access_expires_at": "2026-10-29T16:21:51.769991142Z",
  "refresh_token": "4XU5Fap3i-e5crY_HV0xDABHws-TWSTvWqLS5QsZklk",
  "refresh_expires_at": "2026-11-28T16:06:51.769563658Z",
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
      "actor_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T16:06:35.380978Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T16:06:36.796267Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "c321e25b-4df1-45b2-8a43-4471cdabbafe",
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
  "device_ref": "sandbox-9164"
}
```

```json
{
  "challenge_id": "b1e83745-a64f-4e0f-bb91-b8fa488aea32",
  "expires_at": "2026-10-29T16:11:52.858337444Z",
  "resend_available_at": "2026-10-29T16:06:53.858337444Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "059496",
  "sent_at": "2026-10-29T16:06:52.860989041Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1e83745-a64f-4e0f-bb91-b8fa488aea32",
  "code": "059496",
  "device_ref": "sandbox-9164"
}
```

```json
{
  "session_id": "0c06ab48-267d-48d4-9fbd-ee73d926ef1e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDkxMywiaWF0IjoxNzkzMjkwMDEzLCJqdGkiOiJhNWE2NmI3Yy1lOWNjLTQ1MjEtYmQ2ZC0yMmY4NWJlODM0ZGIiLCJzaWQiOiIwYzA2YWI0OC0yNjdkLTQ4ZDQtOWZiZC1lZTczZDkyNmVmMWUifQ.zrQQpjzDWAtTE4d7FYlFMx01jzZdDkXui-P56V_jEKY",
  "access_expires_at": "2026-10-29T16:21:53.151226912Z",
  "refresh_token": "zFe4-YLZ6JlYKHfd7lTQlaCACw-N7-dMOGj-JNRvtyQ",
  "refresh_expires_at": "2026-11-28T16:06:53.150649032Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6698d06-b312-4d55-81e4-bd92bf546466",
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
  "last_heartbeat_at": "2026-10-29T16:06:16.515495Z",
  "last_location_at": "2026-10-29T16:06:16.515495Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e6698d06-b312-4d55-81e4-bd92bf546466/handover` → **200**

```json
{
  "command_id": "728d2083-d49a-4b06-9232-2f79493bfd3c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6698d06-b312-4d55-81e4-bd92bf546466",
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
  "last_heartbeat_at": "2026-10-29T16:06:16.515495Z",
  "last_location_at": "2026-10-29T16:06:16.515495Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e6698d06-b312-4d55-81e4-bd92bf546466/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:53Z",
    "sequence": 1793290013964
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e6698d06-b312-4d55-81e4-bd92bf546466",
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
  "last_heartbeat_at": "2026-10-29T16:06:53.981777Z",
  "last_location_at": "2026-10-29T16:06:53.981777Z",
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
  "command_id": "e207d199-7fa4-4b21-92c9-66110e1bf073",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:54Z",
    "sequence": 1793290014509
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5b5508bc-8470-46a9-9640-760a1b471ce1",
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
  "last_heartbeat_at": "2026-10-29T16:06:54.526055Z",
  "last_location_at": "2026-10-29T16:06:54.526055Z",
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
  "session_id": "93b78fc5-af33-4bd8-981d-754c2f9341ea",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTA5MTUsImlhdCI6MTc5MzI5MDAxNSwianRpIjoiYzEyNWYzYzYtMGNlNC00NDVlLWJjNzEtMzIyODc1OWQxYjIzIiwic2lkIjoiOTNiNzhmYzUtYWYzMy00YmQ4LTk4MWQtNzU0YzJmOTM0MWVhIn0.zG9BMJtaIFkNhCg_4F247U18sczWBRl1F2Gh5wqpd9I",
  "access_expires_at": "2026-10-29T16:21:55.115311357Z",
  "refresh_token": "4vrM-xWtKfk1hBNAFE3LQ0XADWpV9lphTiUb7V37XCY",
  "refresh_expires_at": "2026-10-30T04:06:55.114851948Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f91db266-ee2b-4e69-b484-affacb862358",
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
  "id": "12188730-3d63-458c-88bb-141fbb415901",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:11:55.384215Z",
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
  "command_id": "273778fa-d752-4f3f-9f09-c3473b68cdf3",
  "quote_id": "12188730-3d63-458c-88bb-141fbb415901",
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
  "id": "0223f557-e997-4529-b858-c7696807c744",
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
  "created_at": "2026-10-29T16:06:55.665526Z",
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
    "id": "f220e146-4df3-41fe-923e-8585d476a9e3",
    "order_id": "0223f557-e997-4529-b858-c7696807c744",
    "expires_at": "2026-10-29T16:07:10.669106Z",
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

`POST /api/driver/v1/offers/f220e146-4df3-41fe-923e-8585d476a9e3/accept` → **200**

```json
{
  "command_id": "99ce0981-5be4-4fc0-85f0-1f0d2d571b2a"
}
```

```json
{
  "id": "89f022b6-c1ab-499d-8185-97c35b973704",
  "order_id": "0223f557-e997-4529-b858-c7696807c744",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb",
  "order_id": "0223f557-e997-4529-b858-c7696807c744",
  "assignment_id": "89f022b6-c1ab-499d-8185-97c35b973704",
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

`POST /api/driver/v1/work-sessions/5b5508bc-8470-46a9-9640-760a1b471ce1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T16:06:57Z",
    "sequence": 1793290017199
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5b5508bc-8470-46a9-9640-760a1b471ce1",
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
  "last_heartbeat_at": "2026-10-29T16:06:57.036538Z",
  "last_location_at": "2026-10-29T16:06:57.036538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb/arrive` → **200**

```json
{
  "command_id": "4197ebf8-154b-463a-97b9-789b65d05b82",
  "expected_version": 0
}
```

```json
{
  "id": "e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb",
  "order_id": "0223f557-e997-4529-b858-c7696807c744",
  "assignment_id": "89f022b6-c1ab-499d-8185-97c35b973704",
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
  "arrived_at": "2026-10-29T16:06:57.315169Z",
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

`POST /api/driver/v1/trips/e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb/start` → **200**

```json
{
  "command_id": "ffc4b75f-4a16-4637-8037-fb80a6ae8cbb",
  "expected_version": 1
}
```

```json
{
  "id": "e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb",
  "order_id": "0223f557-e997-4529-b858-c7696807c744",
  "assignment_id": "89f022b6-c1ab-499d-8185-97c35b973704",
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
  "arrived_at": "2026-10-29T16:06:57.315169Z",
  "started_at": "2026-10-29T16:06:57.596161Z",
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

`POST /api/driver/v1/trips/e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb/complete` → **200**

```json
{
  "command_id": "6f24a1ff-7b32-43f3-b150-0571ea402719",
  "expected_version": 2,
  "reported_at": "2026-10-29T16:06:57Z",
  "cash_received": true
}
```

```json
{
  "id": "e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb",
  "order_id": "0223f557-e997-4529-b858-c7696807c744",
  "assignment_id": "89f022b6-c1ab-499d-8185-97c35b973704",
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
  "arrived_at": "2026-10-29T16:06:57.315169Z",
  "started_at": "2026-10-29T16:06:57.596161Z",
  "completed_at": "2026-10-29T16:06:57.881612Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/0223f557-e997-4529-b858-c7696807c744` → **200**

```json
{
  "id": "0223f557-e997-4529-b858-c7696807c744",
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
    "id": "89f022b6-c1ab-499d-8185-97c35b973704",
    "order_id": "0223f557-e997-4529-b858-c7696807c744",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e2a6b361-e4b3-400b-88ae-3bad3f2ee7eb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T16:06:55.665526Z",
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
  "session_id": "e6698d06-b312-4d55-81e4-bd92bf546466",
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
  "last_heartbeat_at": "2026-10-29T16:06:53.981777Z",
  "last_location_at": "2026-10-29T16:06:53.981777Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e6698d06-b312-4d55-81e4-bd92bf546466/close` → **200**

```json
{
  "command_id": "cb1aa3f9-69a4-44a2-9d1e-4807c6a5c075",
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
  "session_id": "5b5508bc-8470-46a9-9640-760a1b471ce1",
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
  "last_heartbeat_at": "2026-10-29T16:06:57.036538Z",
  "last_location_at": "2026-10-29T16:06:57.036538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b5508bc-8470-46a9-9640-760a1b471ce1/close` → **200**

```json
{
  "command_id": "768c006a-78fb-44a5-98c4-168556a9ae74",
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

Done: terminal order 0223f557-e997-4529-b858-c7696807c744 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30905"
}
```

```json
{
  "challenge_id": "c71ee138-a6d8-47c6-90cb-9ba27aa05aba",
  "expires_at": "2026-10-29T16:12:02.790158142Z",
  "resend_available_at": "2026-10-29T16:07:03.790158142Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "554079",
  "sent_at": "2026-10-29T16:07:02.792752963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c71ee138-a6d8-47c6-90cb-9ba27aa05aba",
  "code": "554079",
  "device_ref": "sandbox-30905"
}
```

```json
{
  "session_id": "f45aae12-332c-431a-84a7-4dc3a454e84d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDkyMywiaWF0IjoxNzkzMjkwMDIzLCJqdGkiOiI3NWI0OTBmMi04MmRkLTRmN2UtYTQ2OS1jMGRmNTBkNjUzZmYiLCJzaWQiOiJmNDVhYWUxMi0zMzJjLTQzMWEtODRhNy00ZGMzYTQ1NGU4NGQifQ.6P0tEjRy2U0-LyUiP-7cixyYYs3rmkdwHQ9NxIgg6pM",
  "access_expires_at": "2026-10-29T16:22:03.085873202Z",
  "refresh_token": "1QYYye2K9v4dPBd9--V-74w5KFCKnEHZBJ_gbyOsYzg",
  "refresh_expires_at": "2026-11-28T16:07:03.085288542Z",
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
  "device_ref": "sandbox-10588"
}
```

```json
{
  "challenge_id": "16c2e76e-917a-42d4-ab7e-b82e5865dbc9",
  "expires_at": "2026-10-29T16:12:03.617181314Z",
  "resend_available_at": "2026-10-29T16:07:04.617181314Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "235000",
  "sent_at": "2026-10-29T16:07:03.620613553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16c2e76e-917a-42d4-ab7e-b82e5865dbc9",
  "code": "235000",
  "device_ref": "sandbox-10588"
}
```

```json
{
  "session_id": "51274fa5-c506-49b6-8ab5-6cd0e1bf6041",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDkyMywiaWF0IjoxNzkzMjkwMDIzLCJqdGkiOiJlZmYwZjZkMy01ZDBmLTQwNjgtYjE1Yy0xOWFlMGQwNmNkZDkiLCJzaWQiOiI1MTI3NGZhNS1jNTA2LTQ5YjYtOGFiNS02Y2QwZTFiZjYwNDEifQ.R9HvRFOZKoqhSG9SPqMZZWhrLb31cQAydBbW-i-O_3U",
  "access_expires_at": "2026-10-29T16:22:03.911580213Z",
  "refresh_token": "ywk6_COzY-x0XsCrMuMHF2A0a4ng3sxqU-3K3m8cUXc",
  "refresh_expires_at": "2026-11-28T16:07:03.911133959Z",
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
  "device_ref": "sandbox-17794"
}
```

```json
{
  "challenge_id": "e4fa74ba-1bd1-4ef6-9df9-1eefc9406a1e",
  "expires_at": "2026-10-29T16:12:04.755276488Z",
  "resend_available_at": "2026-10-29T16:07:05.755276488Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "205200",
  "sent_at": "2026-10-29T16:07:04.75767171Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4fa74ba-1bd1-4ef6-9df9-1eefc9406a1e",
  "code": "205200",
  "device_ref": "sandbox-17794"
}
```

```json
{
  "session_id": "0a7f8cea-6abc-4ce1-939b-28a122e93725",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5MDkyNSwiaWF0IjoxNzkzMjkwMDI1LCJqdGkiOiIyYjgyZjgyYi1lYmUwLTRkYjAtOTU3MS0xMTQyOWU0NzIwZjciLCJzaWQiOiIwYTdmOGNlYS02YWJjLTRjZTEtOTM5Yi0yOGExMjJlOTM3MjUifQ.wp6pkTkg2qQTRZhcWL11O0nUKd65dlzPMgcU-gXDGzY",
  "access_expires_at": "2026-10-29T16:22:05.064383032Z",
  "refresh_token": "a3lzkVzyo6eO-x3mq_LQuTOvRnoX4JG6njB4RivC9y4",
  "refresh_expires_at": "2026-11-28T16:07:05.063813789Z",
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
  "phone": "+380696680831",
  "device_ref": "sandbox-26247"
}
```

```json
{
  "challenge_id": "2d3b1cf9-b8c6-423f-b938-6c5c8bd8156f",
  "expires_at": "2026-10-29T16:12:05.59523097Z",
  "resend_available_at": "2026-10-29T16:07:06.59523097Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380696680831` → **200**

```json
{
  "phone": "+380696680831",
  "audience": "CLIENT",
  "code": "058796",
  "sent_at": "2026-10-29T16:07:05.597594787Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d3b1cf9-b8c6-423f-b938-6c5c8bd8156f",
  "code": "058796",
  "device_ref": "sandbox-26247"
}
```

```json
{
  "session_id": "8f588139-0a7f-4e1c-8acf-56fbfcf025fb",
  "subject": {
    "type": "CLIENT",
    "id": "909e7343-27f4-43f2-934b-612cdc5856b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MDllNzM0My0yN2Y0LTQzZjItOTM0Yi02MTJjZGM1ODU2YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjkwOTI1LCJpYXQiOjE3OTMyOTAwMjUsImp0aSI6IjU5ZWNkNWMxLWFlMmItNGRjZC05NGFlLTliNmMzY2M1OTEwNCIsInNpZCI6IjhmNTg4MTM5LTBhN2YtNGUxYy04YWNmLTU2ZmJmY2YwMjVmYiJ9.simI9CE71KCG590B3F4ZSRz9PVhz42pNZEhgMzBmjnQ",
  "access_expires_at": "2026-10-29T16:22:05.88516719Z",
  "refresh_token": "qMcvaMPLBtVno4obkmPjIpVoSVVdFXXSfGY8fxyrMMg",
  "refresh_expires_at": "2026-11-28T16:07:05.884656422Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ae725805-732e-49b2-96bc-6e7bd7f5830d",
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
  "id": "afcc00e7-15c1-44b1-afc3-cab43b660516",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T16:12:06.157391Z",
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
  "command_id": "9a78e05a-4a22-4422-b2d6-02f594f82921",
  "quote_id": "afcc00e7-15c1-44b1-afc3-cab43b660516",
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
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T16:07:06.440026Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:07:06.440026Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.574464632
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.180315168
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

`GET /api/rider/v1/orders/76983a0d-cbcb-4dcb-9c40-4472b1c2e953` → **200**

```json
{
  "id": "76983a0d-cbcb-4dcb-9c40-4472b1c2e953",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "909e7343-27f4-43f2-934b-612cdc5856b8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T16:07:06.440026Z",
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
  "session_id": "fce6209c-d24f-4b97-8f8f-3c77cbe421e8",
  "subject": {
    "type": "STAFF",
    "id": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNmNDZjMC0yZmM1LTRhYTEtOGMwMi1lY2QwYTU4OTViZTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTExMTIsImlhdCI6MTc5MzI5MDIxMiwianRpIjoiZjM1MjI0MzUtZjBkOC00ZmZhLWI3YjYtYWZlNWJiYWMyMDdkIiwic2lkIjoiZmNlNjIwOWMtZDI0Zi00Yjk3LThmOGYtM2M3N2NiZTQyMWU4In0.aLjrfuh6tKMozJtDEwRVz2yhIerwjkG1qcNA6tFyjIE",
  "access_expires_at": "2026-10-29T16:25:12.915644161Z",
  "refresh_token": "PMeUkfOrGgLFaFjxv1fTznqg5lA_M8t1lHFaeBIzNa4",
  "refresh_expires_at": "2026-10-30T04:10:12.915123Z",
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
  "id": "f263d755-0bed-44a1-868c-692a0c2c7ccb",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T16:10:13.200007Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T16:10:13.200088Z",
  "updated_at": "2026-10-29T16:10:13.217773Z",
  "finished_at": "2026-10-29T16:10:13.217773Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/f263d755-0bed-44a1-868c-692a0c2c7ccb` → **200**

```json
{
  "run": {
    "id": "f263d755-0bed-44a1-868c-692a0c2c7ccb",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T16:10:13.200007Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T16:10:13.200088Z",
    "updated_at": "2026-10-29T16:10:13.217773Z",
    "finished_at": "2026-10-29T16:10:13.217773Z",
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
  "id": "f263d755-0bed-44a1-868c-692a0c2c7ccb",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T16:10:13.200007Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T16:10:13.200088Z",
  "updated_at": "2026-10-29T16:10:13.217773Z",
  "finished_at": "2026-10-29T16:10:13.217773Z",
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
  "id": "f263d755-0bed-44a1-868c-692a0c2c7ccb",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T16:10:13.200007Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T16:10:13.200088Z",
  "updated_at": "2026-10-29T16:10:13.217773Z",
  "finished_at": "2026-10-29T16:10:13.217773Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/8e6fed5a-47e9-4883-8f3e-d95ab8759fa8` → **204**

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
  "id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T16:10:13.633698Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T16:10:13.63377Z",
  "updated_at": "2026-10-29T16:10:13.642481Z",
  "finished_at": "2026-10-29T16:10:13.642481Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6` → **200**

```json
{
  "run": {
    "id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T16:10:13.633698Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T16:10:13.63377Z",
    "updated_at": "2026-10-29T16:10:13.642481Z",
    "finished_at": "2026-10-29T16:10:13.642481Z",
    "version": 1
  },
  "items": [
    {
      "id": "be375c24-1dac-4deb-b289-c223a5ed3f99",
      "run_id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "41104e5f0c5f326fb1d5a5268ecc7c6fb07e9a3e18e3128f0e459e395638cab1",
      "reference_display": "sandbox-reconciliation-8e6fed5a-47e9-4883-8f3e-d95ab8759fa8",
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
      "provider_at": "2026-10-29T16:10:13Z",
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
  "id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T16:10:13.633698Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T16:10:13.63377Z",
  "updated_at": "2026-10-29T16:10:13.642481Z",
  "finished_at": "2026-10-29T16:10:13.642481Z",
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
  "id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T16:10:13.633698Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T16:10:13.63377Z",
  "updated_at": "2026-10-29T16:10:13.642481Z",
  "finished_at": "2026-10-29T16:10:13.642481Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/be375c24-1dac-4deb-b289-c223a5ed3f99/resolve` → **200**

```json
{
  "command_id": "ab780a5f-6e87-404d-89bd-e1ac9148baa6",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "be375c24-1dac-4deb-b289-c223a5ed3f99",
  "run_id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "41104e5f0c5f326fb1d5a5268ecc7c6fb07e9a3e18e3128f0e459e395638cab1",
  "reference_display": "sandbox-reconciliation-8e6fed5a-47e9-4883-8f3e-d95ab8759fa8",
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
  "provider_at": "2026-10-29T16:10:13Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "resolved_at": "2026-10-29T16:10:14.073461Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/be375c24-1dac-4deb-b289-c223a5ed3f99/resolve` → **200**

```json
{
  "command_id": "ab780a5f-6e87-404d-89bd-e1ac9148baa6",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "be375c24-1dac-4deb-b289-c223a5ed3f99",
  "run_id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "41104e5f0c5f326fb1d5a5268ecc7c6fb07e9a3e18e3128f0e459e395638cab1",
  "reference_display": "sandbox-reconciliation-8e6fed5a-47e9-4883-8f3e-d95ab8759fa8",
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
  "provider_at": "2026-10-29T16:10:13Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
  "resolved_at": "2026-10-29T16:10:14.073461Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/be375c24-1dac-4deb-b289-c223a5ed3f99/resolve` → **409**

```json
{
  "command_id": "59fbfca4-d165-4d84-b32f-2ebd62126f82",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/be375c24-1dac-4deb-b289-c223a5ed3f99/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bd28fb07-5ecf-4393-9b05-8d956f5435ee"
}
```

`GET /api/admin/v1/payment-reconciliations/859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6` → **200**

```json
{
  "run": {
    "id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T16:10:13.633698Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T16:10:13.63377Z",
    "updated_at": "2026-10-29T16:10:14.073461Z",
    "finished_at": "2026-10-29T16:10:13.642481Z",
    "version": 2
  },
  "items": [
    {
      "id": "be375c24-1dac-4deb-b289-c223a5ed3f99",
      "run_id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "41104e5f0c5f326fb1d5a5268ecc7c6fb07e9a3e18e3128f0e459e395638cab1",
      "reference_display": "sandbox-reconciliation-8e6fed5a-47e9-4883-8f3e-d95ab8759fa8",
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
      "provider_at": "2026-10-29T16:10:13Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "7e3f46c0-2fc5-4aa1-8c02-ecd0a5895be4",
      "resolved_at": "2026-10-29T16:10:14.073461Z",
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
      "id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T16:10:13.633698Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T16:10:13.63377Z",
      "updated_at": "2026-10-29T16:10:14.073461Z",
      "finished_at": "2026-10-29T16:10:13.642481Z",
      "version": 2
    },
    {
      "id": "ae8ef9f3-9a08-4915-967d-bc41012d19e1",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T16:02:27.470641Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T16:02:27.470826Z",
      "updated_at": "2026-10-29T16:02:27.477096Z",
      "finished_at": "2026-10-29T16:02:27.477096Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/8e6fed5a-47e9-4883-8f3e-d95ab8759fa8` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "859d6a41-c0b8-48a9-8cb9-b4a4fd68e8c6",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T16:10:13.633698Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T16:10:13.63377Z",
  "updated_at": "2026-10-29T16:10:14.073461Z",
  "finished_at": "2026-10-29T16:10:13.642481Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793290337669E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793290337957E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793290337958E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793290337698E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793290337959E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
