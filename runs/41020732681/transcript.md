# Sandbox transcript (2026-10-30T07:33:41Z, 306b180)

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
  "correlation_id": "b5354011-e8d9-41a2-8238-bb2b7c4146d0"
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
  "session_id": "4e3fdce0-db98-4edf-b491-a6d776dfae2a",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1MzIsImlhdCI6MTc5MzM0NTYzMiwianRpIjoiY2YyZGM0NGUtYTI0Ni00MTQ2LWJjOWUtNzdmNmI4ZDk1ZjQ4Iiwic2lkIjoiNGUzZmRjZTAtZGI5OC00ZWRmLWI0OTEtYTZkNzc2ZGZhZTJhIn0.j9vxQs0P-Lo6ofqnIKzP3ENWGCyBn71EF39bCXrQvH0",
  "access_expires_at": "2026-10-30T07:48:52.310568856Z",
  "refresh_token": "pB5_4zKl09ZEojWYzb3C0Nq3XrRJxTuJ5_QXdIqqUZY",
  "refresh_expires_at": "2026-10-30T19:33:52.307679614Z",
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
  "session_id": "391facb5-d960-47f1-b9e8-25486eeaff31",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1MzQsImlhdCI6MTc5MzM0NTYzNCwianRpIjoiOWNiOWRjYzUtZjAzYy00MjUyLWIxYjEtNmM5ODllYjdiMGZkIiwic2lkIjoiMzkxZmFjYjUtZDk2MC00N2YxLWI5ZTgtMjU0ODZlZWFmZjMxIn0.kBh9MQOkneU776fgfaPfmh9FLSVetB2heK4D-wCyEW4",
  "access_expires_at": "2026-10-30T07:48:54.184510432Z",
  "refresh_token": "LLU57KR7lqM_kysXc5TKEGLLq7a4dJ3pTZzWeEvsL3c",
  "refresh_expires_at": "2026-10-30T19:33:54.183570698Z",
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
  "device_ref": "sandbox-1611"
}
```

```json
{
  "challenge_id": "dc933eed-85f7-4981-b93d-76d1bc4abef6",
  "expires_at": "2026-10-30T07:38:54.814987126Z",
  "resend_available_at": "2026-10-30T07:33:55.814987126Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "187724",
  "sent_at": "2026-10-30T07:33:54.829351963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc933eed-85f7-4981-b93d-76d1bc4abef6",
  "code": "187724",
  "device_ref": "sandbox-1611"
}
```

```json
{
  "session_id": "9c66ac10-a745-4571-8e52-d313e660da53",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjUzNSwiaWF0IjoxNzkzMzQ1NjM1LCJqdGkiOiJlNDVhYzIwYy02ZjQ3LTQ4ZGMtODVkMS1mNzEzMDA3Y2RkODQiLCJzaWQiOiI5YzY2YWMxMC1hNzQ1LTQ1NzEtOGU1Mi1kMzEzZTY2MGRhNTMifQ.5ipKUYbn2JlAkxbcrl6YX4srjruccZ7clg3myzmq7KU",
  "access_expires_at": "2026-10-30T07:48:55.17822473Z",
  "refresh_token": "9dJ4G4-uWDBARhUuF6vyX-dAZMsp_X28cmc_jyf5WpE",
  "refresh_expires_at": "2026-11-29T07:33:55.177236819Z",
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
  "command_id": "f8c5c0c1-4a3c-4aee-a301-f91e25d85e46",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:33:55Z",
    "sequence": 1793345635752
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54eabe51-8d36-4ac3-925b-a36b9ef4ad26",
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
  "last_heartbeat_at": "2026-10-30T07:33:55.954969Z",
  "last_location_at": "2026-10-30T07:33:55.954969Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631409409",
  "device_ref": "sandbox-17720"
}
```

```json
{
  "challenge_id": "56c7e62c-2266-4744-b111-e2cbe88fa654",
  "expires_at": "2026-10-30T07:38:56.26455781Z",
  "resend_available_at": "2026-10-30T07:33:57.26455781Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631409409` → **200**

```json
{
  "phone": "+380631409409",
  "audience": "CLIENT",
  "code": "458696",
  "sent_at": "2026-10-30T07:33:56.269396236Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56c7e62c-2266-4744-b111-e2cbe88fa654",
  "code": "458696",
  "device_ref": "sandbox-17720"
}
```

```json
{
  "session_id": "8513f601-4b32-498d-afb2-64fcf215f130",
  "subject": {
    "type": "CLIENT",
    "id": "88a8b41b-4f4d-402c-9729-74f38a463be9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGE4YjQxYi00ZjRkLTQwMmMtOTcyOS03NGYzOGE0NjNiZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NTM2LCJpYXQiOjE3OTMzNDU2MzYsImp0aSI6ImQ1YWZiNTc3LWIzNjctNGExYy04MjlmLTE1Mjg4NmZjMWRiYyIsInNpZCI6Ijg1MTNmNjAxLTRiMzItNDk4ZC1hZmIyLTY0ZmNmMjE1ZjEzMCJ9.3ulhL7HkRvrBxrR8CmBcqh2-pu0LrobH5a92_2rP5jA",
  "access_expires_at": "2026-10-30T07:48:56.595117877Z",
  "refresh_token": "kcvwwwq3cfHXSF-vi_W-nsoHMcpfAnmyXI9V-LoaDO0",
  "refresh_expires_at": "2026-11-29T07:33:56.594102648Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "23e4cd60-ce35-4210-9323-fc9abde6b6c9",
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
  "id": "7e2ceeee-3b26-4908-9e92-4d4df7999192",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:38:56.927614Z",
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
  "command_id": "e28c76a4-671d-433e-aa1c-e3a7e54dc91f",
  "quote_id": "7e2ceeee-3b26-4908-9e92-4d4df7999192",
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
  "id": "80b9ee38-a379-4223-abf7-5af9f7cf8563",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "88a8b41b-4f4d-402c-9729-74f38a463be9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:33:57.332722Z",
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
    "id": "738b1aa9-a0d6-43e5-9579-91996478f196",
    "order_id": "80b9ee38-a379-4223-abf7-5af9f7cf8563",
    "expires_at": "2026-10-30T07:34:12.34315Z",
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

`POST /api/driver/v1/offers/738b1aa9-a0d6-43e5-9579-91996478f196/accept` → **200**

```json
{
  "command_id": "7ae68138-0212-448a-9a52-f1fd38330c3e"
}
```

```json
{
  "id": "47bf52ec-2bd9-45f8-b214-d01e074fb1ae",
  "order_id": "80b9ee38-a379-4223-abf7-5af9f7cf8563",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ecb4b19d-8dec-483c-8763-3e45efef4824",
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
  "command_id": "9d7c36de-7ef5-4b59-b75f-037fae86b4d5",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T07:33:58.683823888Z"
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
  "id": "ecb4b19d-8dec-483c-8763-3e45efef4824",
  "order_id": "80b9ee38-a379-4223-abf7-5af9f7cf8563",
  "assignment_id": "47bf52ec-2bd9-45f8-b214-d01e074fb1ae",
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

`POST /api/driver/v1/work-sessions/54eabe51-8d36-4ac3-925b-a36b9ef4ad26/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:33:59Z",
    "sequence": 1793345639644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54eabe51-8d36-4ac3-925b-a36b9ef4ad26",
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
  "last_heartbeat_at": "2026-10-30T07:33:59.67208Z",
  "last_location_at": "2026-10-30T07:33:59.67208Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ecb4b19d-8dec-483c-8763-3e45efef4824/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "6386c7a8-11b3-48e3-a6c6-68a96c1d8e75",
  "expected_version": 0
}
```

```json
{
  "id": "ecb4b19d-8dec-483c-8763-3e45efef4824",
  "order_id": "80b9ee38-a379-4223-abf7-5af9f7cf8563",
  "assignment_id": "47bf52ec-2bd9-45f8-b214-d01e074fb1ae",
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
  "arrived_at": "2026-10-30T07:33:59.977972Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ecb4b19d-8dec-483c-8763-3e45efef4824/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "48337ce7-1ef7-4941-a8e6-04627cca5ba7",
  "expected_version": 1
}
```

```json
{
  "id": "ecb4b19d-8dec-483c-8763-3e45efef4824",
  "order_id": "80b9ee38-a379-4223-abf7-5af9f7cf8563",
  "assignment_id": "47bf52ec-2bd9-45f8-b214-d01e074fb1ae",
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
  "arrived_at": "2026-10-30T07:33:59.977972Z",
  "started_at": "2026-10-30T07:34:00.295932Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ecb4b19d-8dec-483c-8763-3e45efef4824/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "63cdeacf-37ec-48d7-9eb1-8d40c7100ae9",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:34:00Z",
  "cash_received": true
}
```

```json
{
  "id": "ecb4b19d-8dec-483c-8763-3e45efef4824",
  "order_id": "80b9ee38-a379-4223-abf7-5af9f7cf8563",
  "assignment_id": "47bf52ec-2bd9-45f8-b214-d01e074fb1ae",
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
  "arrived_at": "2026-10-30T07:33:59.977972Z",
  "started_at": "2026-10-30T07:34:00.295932Z",
  "completed_at": "2026-10-30T07:34:00.616143Z",
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
  "session_id": "54eabe51-8d36-4ac3-925b-a36b9ef4ad26",
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
  "last_heartbeat_at": "2026-10-30T07:33:59.67208Z",
  "last_location_at": "2026-10-30T07:33:59.67208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54eabe51-8d36-4ac3-925b-a36b9ef4ad26/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d8a4c23b-ab9a-4b5c-ba01-b5a6d8d56728",
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
  "command_id": "34d197be-dbf0-4986-b3d7-9759446b5b11",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:01Z",
    "sequence": 1793345641581
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
  "correlation_id": "dd99a0ec-1b51-4103-afa0-854beefe2617",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "44547e3d-95ba-478d-968d-895a82d24217",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:01Z",
    "sequence": 1793345641901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c071aaa8-2651-4f65-9a9e-b80fc989918a",
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
  "last_heartbeat_at": "2026-10-30T07:34:01.925952Z",
  "last_location_at": "2026-10-30T07:34:01.925952Z",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T07:33:58.683824Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "a1e8abcb-9eee-4626-8563-1a179ea3b353",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T07:34:02.59969711Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c071aaa8-2651-4f65-9a9e-b80fc989918a",
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
  "last_heartbeat_at": "2026-10-30T07:34:01.925952Z",
  "last_location_at": "2026-10-30T07:34:01.925952Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c071aaa8-2651-4f65-9a9e-b80fc989918a/close` → **200**

```json
{
  "command_id": "c25fc894-420a-43bb-bbb9-4661c5f536ab",
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
  "session_id": "c5e262c5-266e-4431-9250-466c5c160ad4",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1NDMsImlhdCI6MTc5MzM0NTY0MywianRpIjoiNzlmMmJhNTgtZDZjYi00ZmMwLTkxNDMtNmRlNGY4OTQ1YzQzIiwic2lkIjoiYzVlMjYyYzUtMjY2ZS00NDMxLTkyNTAtNDY2YzVjMTYwYWQ0In0.R1DUOwwXqs98pQnvLua_ga1G76-NFok35cj3iqy8xxc",
  "access_expires_at": "2026-10-30T07:49:03.838754902Z",
  "refresh_token": "CPXXnLL6OWwaId0svoWUZiFBxv-nyFnRnkd5_thghNo",
  "refresh_expires_at": "2026-10-30T19:34:03.837909129Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "97abeaa0-e5c2-482a-8cdb-d73f8d9862f9",
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
  "id": "7b98aa7b-96b2-4840-ba08-face82b1cf8d",
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
  "created_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "created_at": "2026-10-30T07:34:04.135273Z",
  "updated_at": "2026-10-30T07:34:04.135273Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632834522",
  "device_ref": "sandbox-19269"
}
```

```json
{
  "challenge_id": "12629266-e38f-4cf5-8379-c156892178be",
  "expires_at": "2026-10-30T07:39:04.444698069Z",
  "resend_available_at": "2026-10-30T07:34:05.444698069Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632834522` → **200**

```json
{
  "phone": "+380632834522",
  "audience": "CLIENT",
  "code": "986499",
  "sent_at": "2026-10-30T07:34:04.449949381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12629266-e38f-4cf5-8379-c156892178be",
  "code": "986499",
  "device_ref": "sandbox-19269"
}
```

```json
{
  "session_id": "fd1b99f7-5967-4ab6-af87-c56a9a6ef503",
  "subject": {
    "type": "CLIENT",
    "id": "26e210ff-701a-458a-8dca-821455f1ba43"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmUyMTBmZi03MDFhLTQ1OGEtOGRjYS04MjE0NTVmMWJhNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NTQ0LCJpYXQiOjE3OTMzNDU2NDQsImp0aSI6ImFmNDNhYzA5LWJkOTctNGVjZS04NTU3LTkxYTE5MjRlNWQ0OCIsInNpZCI6ImZkMWI5OWY3LTU5NjctNGFiNi1hZjg3LWM1NmE5YTZlZjUwMyJ9.q_DMSj1GRrT5dRwS1wliZM6Z6z_24D3w2VHOnfogtsU",
  "access_expires_at": "2026-10-30T07:49:04.770399865Z",
  "refresh_token": "f5f9MVb7QkyfZt21kMAoyz82WPFv0zH-1bEhq9jyqqY",
  "refresh_expires_at": "2026-11-29T07:34:04.769527762Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632834522` → **200**

```json
{
  "client_id": "26e210ff-701a-458a-8dca-821455f1ba43"
}
```

`POST /api/admin/v1/rider-wallets/26e210ff-701a-458a-8dca-821455f1ba43/top-ups` → **201**

```json
{
  "command_id": "ff3fa6db-2540-40ec-8be1-cacff5ea7175",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "26e210ff-701a-458a-8dca-821455f1ba43",
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
      "id": "a92e9056-0e09-41d4-bebd-bfb6035665fd",
      "at": "2026-10-30T07:34:05.349229Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e0982d8c-d109-4e05-bb65-77dd6373b1b1",
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
  "id": "edcdaf3e-e1e2-4772-a9d0-e636a8144eb3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:39:05.670154Z",
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
      "id": "7b98aa7b-96b2-4840-ba08-face82b1cf8d",
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
  "device_ref": "sandbox-12062"
}
```

```json
{
  "challenge_id": "cd97fc9d-74b7-4035-ac28-8bbb10f43c07",
  "expires_at": "2026-10-30T07:39:05.980126548Z",
  "resend_available_at": "2026-10-30T07:34:06.980126548Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "094133",
  "sent_at": "2026-10-30T07:34:05.985157191Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd97fc9d-74b7-4035-ac28-8bbb10f43c07",
  "code": "094133",
  "device_ref": "sandbox-12062"
}
```

```json
{
  "session_id": "809b8d15-d724-4178-b1b5-5fed2a223ed6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjU0NiwiaWF0IjoxNzkzMzQ1NjQ2LCJqdGkiOiI3ZGQxNzA1Ny0zY2E3LTQ5ODMtOGE0Ni02MGJiMWYyNDQwYzUiLCJzaWQiOiI4MDliOGQxNS1kNzI0LTQxNzgtYjFiNS01ZmVkMmEyMjNlZDYifQ.dJIj_JUF3WsFqOtC9buOKbtj0uhWzBfmfbx0CvT-Ozk",
  "access_expires_at": "2026-10-30T07:49:06.314605797Z",
  "refresh_token": "xxQ9afEoqGVkgy8mFJKrUNFVnLrbvsMCUuGFK_gYPlA",
  "refresh_expires_at": "2026-11-29T07:34:06.313799189Z",
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
  "command_id": "776dcdb2-a276-4d4f-b3d8-c642128c8714",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:06Z",
    "sequence": 1793345646880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec877608-bb7d-4efa-a78b-9481bb68e613",
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
  "last_heartbeat_at": "2026-10-30T07:34:06.901641Z",
  "last_location_at": "2026-10-30T07:34:06.901641Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "18a2aff2-7e06-4e62-837e-5f45823fa810",
  "quote_id": "edcdaf3e-e1e2-4772-a9d0-e636a8144eb3",
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
  "id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "26e210ff-701a-458a-8dca-821455f1ba43",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:34:07.212889Z",
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
  "client_id": "26e210ff-701a-458a-8dca-821455f1ba43",
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
      "id": "a92e9056-0e09-41d4-bebd-bfb6035665fd",
      "at": "2026-10-30T07:34:05.349229Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
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
    "id": "a2d52ba9-7007-41df-b7f3-2b84687ba045",
    "order_id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb",
    "expires_at": "2026-10-30T07:34:22.221734Z",
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

`POST /api/driver/v1/offers/a2d52ba9-7007-41df-b7f3-2b84687ba045/accept` → **200**

```json
{
  "command_id": "8c0991d6-b58e-4644-8054-475da6de7256"
}
```

```json
{
  "id": "314536c2-d1c1-47f7-9634-20dbe4389aee",
  "order_id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e516871-50ca-420b-ac9f-64d1a2b1e6cc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e516871-50ca-420b-ac9f-64d1a2b1e6cc",
  "order_id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb",
  "assignment_id": "314536c2-d1c1-47f7-9634-20dbe4389aee",
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

`POST /api/driver/v1/work-sessions/ec877608-bb7d-4efa-a78b-9481bb68e613/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:08Z",
    "sequence": 1793345648847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec877608-bb7d-4efa-a78b-9481bb68e613",
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
  "last_heartbeat_at": "2026-10-30T07:34:08.869539Z",
  "last_location_at": "2026-10-30T07:34:08.869539Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3e516871-50ca-420b-ac9f-64d1a2b1e6cc/arrive` → **200**

```json
{
  "command_id": "ba80a29b-b13f-4976-bfa3-d1a5666d1ac5",
  "expected_version": 0
}
```

```json
{
  "id": "3e516871-50ca-420b-ac9f-64d1a2b1e6cc",
  "order_id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb",
  "assignment_id": "314536c2-d1c1-47f7-9634-20dbe4389aee",
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
  "arrived_at": "2026-10-30T07:34:09.188233Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3e516871-50ca-420b-ac9f-64d1a2b1e6cc/start` → **200**

```json
{
  "command_id": "c17930ba-f582-453e-9888-1a9296887f64",
  "expected_version": 1
}
```

```json
{
  "id": "3e516871-50ca-420b-ac9f-64d1a2b1e6cc",
  "order_id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb",
  "assignment_id": "314536c2-d1c1-47f7-9634-20dbe4389aee",
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
  "arrived_at": "2026-10-30T07:34:09.188233Z",
  "started_at": "2026-10-30T07:34:09.510117Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/3e516871-50ca-420b-ac9f-64d1a2b1e6cc/complete` → **200**

```json
{
  "command_id": "c97ed76f-b827-42ce-95dd-06e70ea0e099",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:34:09Z",
  "cash_received": true
}
```

```json
{
  "id": "3e516871-50ca-420b-ac9f-64d1a2b1e6cc",
  "order_id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb",
  "assignment_id": "314536c2-d1c1-47f7-9634-20dbe4389aee",
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
  "arrived_at": "2026-10-30T07:34:09.188233Z",
  "started_at": "2026-10-30T07:34:09.510117Z",
  "completed_at": "2026-10-30T07:34:09.839794Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "26e210ff-701a-458a-8dca-821455f1ba43",
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
      "id": "5c950cd0-808a-4902-9132-6a7b3edabc1f",
      "at": "2026-10-30T07:34:10.241144Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb"
    },
    {
      "id": "a92e9056-0e09-41d4-bebd-bfb6035665fd",
      "at": "2026-10-30T07:34:05.349229Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/7b98aa7b-96b2-4840-ba08-face82b1cf8d/archive` → **200**

```json
{
  "command_id": "bbdbfb30-5523-44fc-a08d-5dfdda67acca",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "7b98aa7b-96b2-4840-ba08-face82b1cf8d",
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
  "created_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "created_at": "2026-10-30T07:34:04.135273Z",
  "updated_at": "2026-10-30T07:34:13.485877Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ec877608-bb7d-4efa-a78b-9481bb68e613",
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
  "last_heartbeat_at": "2026-10-30T07:34:08.869539Z",
  "last_location_at": "2026-10-30T07:34:08.869539Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec877608-bb7d-4efa-a78b-9481bb68e613/close` → **200**

```json
{
  "command_id": "c9f22c11-e198-483b-8072-3ef52cc33666",
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

Done: order 4e16ae2a-5286-4cfa-945d-3d25411f0adb.

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
  "session_id": "185a0107-7646-43e3-9a89-3e8699b9988a",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1NTQsImlhdCI6MTc5MzM0NTY1NCwianRpIjoiNjM0MWNjODktMmFlYS00MmNhLTgxMGItZWVmMTBmOTJmMjVhIiwic2lkIjoiMTg1YTAxMDctNzY0Ni00M2UzLTlhODktM2U4Njk5Yjk5ODhhIn0.aIKnjbndr0RNQKZuzGUwTfakPVUJlOxR5voSZcvmgL8",
  "access_expires_at": "2026-10-30T07:49:14.697821639Z",
  "refresh_token": "sGI7EJoGJYYKbCSOzgggEJUQ9zdzWCMxGpgpsVVONbg",
  "refresh_expires_at": "2026-10-30T19:34:14.697097323Z",
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
  "command_id": "37c3c459-5b1f-4fa2-8833-de13e7453e48",
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
  "session_id": "990aa33d-9742-4b48-ba1b-04f791bd1d19",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1NTUsImlhdCI6MTc5MzM0NTY1NSwianRpIjoiYjRiOTMwYmQtZDc2ZC00ZjI3LWIzZDYtN2E1NjRiMjhkOThjIiwic2lkIjoiOTkwYWEzM2QtOTc0Mi00YjQ4LWJhMWItMDRmNzkxYmQxZDE5In0.VnPdajbX4hsB9FTIjhbe3xrbe9lzlZetLSJXuB2jnII",
  "access_expires_at": "2026-10-30T07:49:15.87643982Z",
  "refresh_token": "GBOvFLDEB_JyrhuGxQrT97sGoCepthNr7O57OLXWa7s",
  "refresh_expires_at": "2026-10-30T19:34:15.875719814Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3042317704",
    "linkedid": "1730052700.3042317704",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672138608"
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
    "id": "1730052700.3042317704",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "a49fa1fe-2d69-4aba-9e34-e9adc7b5218a",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672138608",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T07:34:16.16946Z",
      "answered_at": null,
      "ended_at": "2026-10-30T07:34:16.195818Z",
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
    "id": "1730052600.9431253",
    "linkedid": "1730052600.9431253",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672138608"
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
      "id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672138608",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T07:34:16.535717Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/dbdd3e98-cff3-4b5e-b1e7-7edb8e855045/answer` → **200**

```json
{
  "command_id": "c88af525-c2f1-4574-b23b-112086d144f7"
}
```

```json
{
  "id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672138608",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "order_ids": [],
  "started_at": "2026-10-30T07:34:16.535717Z",
  "answered_at": "2026-10-30T07:34:16.85534Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.9431253",
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
    "id": "1730052600.9431253",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672138608",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [],
      "started_at": "2026-10-30T07:34:16.535717Z",
      "answered_at": "2026-10-30T07:34:16.85534Z",
      "ended_at": "2026-10-30T07:34:17.168337Z",
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
      "id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672138608",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [],
      "started_at": "2026-10-30T07:34:16.535717Z",
      "answered_at": "2026-10-30T07:34:16.85534Z",
      "ended_at": "2026-10-30T07:34:17.168337Z",
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
      "id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672138608",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [],
      "started_at": "2026-10-30T07:34:16.535717Z",
      "answered_at": "2026-10-30T07:34:16.85534Z",
      "ended_at": "2026-10-30T07:34:17.168337Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T07:34:20.850886Z"
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
      "id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672138608",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [],
      "started_at": "2026-10-30T07:34:16.535717Z",
      "answered_at": "2026-10-30T07:34:16.85534Z",
      "ended_at": "2026-10-30T07:34:17.168337Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T07:34:20.850886Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/dbdd3e98-cff3-4b5e-b1e7-7edb8e855045/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/dbdd3e98-cff3-4b5e-b1e7-7edb8e855045/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=dbdd3e98-cff3-4b5e-b1e7-7edb8e855045` → **200**

```json
{
  "changes": [
    {
      "id": "27a5c11b-15e9-4e4c-adad-15a56fdea06d",
      "occurred_at": "2026-10-30T07:34:22.429779Z",
      "actor_type": "STAFF",
      "actor_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"4470f1a0-092a-4373-9d68-db2f24acf3a8\", \"order_ids\": []}",
      "correlation_id": "65278458-0048-4151-810e-6a04839dedad"
    },
    {
      "id": "b383052a-a86d-4b0d-a882-da42b2b5f172",
      "occurred_at": "2026-10-30T07:34:22.394975Z",
      "actor_type": "STAFF",
      "actor_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"4470f1a0-092a-4373-9d68-db2f24acf3a8\", \"order_ids\": []}",
      "correlation_id": "3dc29e50-540e-4a6f-8673-6b65df803048"
    }
  ]
}
```

Done: call dbdd3e98-cff3-4b5e-b1e7-7edb8e855045 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3951"
}
```

```json
{
  "challenge_id": "22a812d7-9008-40b7-a3d3-f4578450408e",
  "expires_at": "2026-10-30T07:39:22.762568411Z",
  "resend_available_at": "2026-10-30T07:34:23.762568411Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "269097",
  "sent_at": "2026-10-30T07:34:22.767337785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22a812d7-9008-40b7-a3d3-f4578450408e",
  "code": "269097",
  "device_ref": "sandbox-3951"
}
```

```json
{
  "session_id": "c290e0cc-b1e0-44cc-9c62-b6f2e5744eb2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjU2MywiaWF0IjoxNzkzMzQ1NjYzLCJqdGkiOiJjMjk3MzU5NC1lYzc0LTRkMzktOWM4ZS0wNThiYTM5OGRmNzAiLCJzaWQiOiJjMjkwZTBjYy1iMWUwLTQ0Y2MtOWM2Mi1iNmYyZTU3NDRlYjIifQ.4VcPzNiFpCHidZxYm4IzO0H45F5Q5SCRSAFQ79_O6kw",
  "access_expires_at": "2026-10-30T07:49:23.09549574Z",
  "refresh_token": "yS9cuqdVS9BThtAT0zjyFVvM9JACnO35mLKt6jC517M",
  "refresh_expires_at": "2026-11-29T07:34:23.094763582Z",
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
  "command_id": "46cab28d-21fd-4ee0-8e44-3bcd8ba8c456",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:23Z",
    "sequence": 1793345663666
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d91c38e-deaa-40bf-aa46-d23e55282f3e",
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
  "last_heartbeat_at": "2026-10-30T07:34:23.688004Z",
  "last_location_at": "2026-10-30T07:34:23.688004Z",
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
  "session_id": "89e175f9-40b3-4888-922a-a24f1ab13ec0",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1NjQsImlhdCI6MTc5MzM0NTY2NCwianRpIjoiMDMxYWU2MzYtNGYwYi00OWY5LTk1MmQtY2RlOTI2M2VhOTkzIiwic2lkIjoiODllMTc1ZjktNDBiMy00ODg4LTkyMmEtYTI0ZjFhYjEzZWMwIn0.XfXaoGq5vPY6ZJvoWsThgVbU6euREITF2kKyLO1ZU3o",
  "access_expires_at": "2026-10-30T07:49:24.277787469Z",
  "refresh_token": "PofmadthLTmbU5GCLB6Ve_yzvM6orjFifL9ApbSpX1U",
  "refresh_expires_at": "2026-10-30T19:34:24.27699802Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "be892ea2-dcec-44ba-b57e-3369f29aa85c",
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
  "id": "57fd47b5-87b9-435e-9a9a-aeaa1a2ad15f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:39:24.637005Z",
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
  "command_id": "3cf236a9-ea72-4039-801b-5a1e0f1d22da",
  "quote_id": "57fd47b5-87b9-435e-9a9a-aeaa1a2ad15f",
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
    "phone": "+380678793195"
  }
}
```

```json
{
  "id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
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
  "created_at": "2026-10-30T07:34:25.087267Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678793195"
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
    "id": "ef8afe1e-be37-4207-99af-c6f64506ebda",
    "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
    "expires_at": "2026-10-30T07:34:40.093126Z",
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

`POST /api/driver/v1/offers/ef8afe1e-be37-4207-99af-c6f64506ebda/accept` → **200**

```json
{
  "command_id": "42cce89a-4792-4b05-a677-39421d38d8a3"
}
```

```json
{
  "id": "ebfa52f7-ec99-412e-9bd1-8f972503026b",
  "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1ec057ea-46e3-431b-853f-ad64148a5939",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[
  {
    "phone": "+380678793195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:27.095224226Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[
  {
    "phone": "+380678793195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:27.095224226Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[
  {
    "phone": "+380678793195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:27.095224226Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1ec057ea-46e3-431b-853f-ad64148a5939",
  "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
  "assignment_id": "ebfa52f7-ec99-412e-9bd1-8f972503026b",
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
    "phone": "+380678793195"
  }
}
```

`POST /api/driver/v1/work-sessions/8d91c38e-deaa-40bf-aa46-d23e55282f3e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:28Z",
    "sequence": 1793345668484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d91c38e-deaa-40bf-aa46-d23e55282f3e",
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
  "last_heartbeat_at": "2026-10-30T07:34:28.506844Z",
  "last_location_at": "2026-10-30T07:34:28.506844Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1ec057ea-46e3-431b-853f-ad64148a5939/arrive` → **200**

```json
{
  "command_id": "b31319dd-8a0f-4e7d-be24-aed31586e387",
  "expected_version": 0
}
```

```json
{
  "id": "1ec057ea-46e3-431b-853f-ad64148a5939",
  "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
  "assignment_id": "ebfa52f7-ec99-412e-9bd1-8f972503026b",
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
  "arrived_at": "2026-10-30T07:34:28.810335Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678793195"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[
  {
    "phone": "+380678793195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:27.095224226Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[
  {
    "phone": "+380678793195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:27.095224226Z"
  },
  {
    "phone": "+380678793195",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:30.107713013Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[
  {
    "phone": "+380678793195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:27.095224226Z"
  },
  {
    "phone": "+380678793195",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:30.107713013Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678793195` → **200**

```json
[
  {
    "phone": "+380678793195",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:27.095224226Z"
  },
  {
    "phone": "+380678793195",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T07:34:30.107713013Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/1ec057ea-46e3-431b-853f-ad64148a5939/start` → **200**

```json
{
  "command_id": "a78d6e03-c1eb-4757-8141-d462fd5f0980",
  "expected_version": 1
}
```

```json
{
  "id": "1ec057ea-46e3-431b-853f-ad64148a5939",
  "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
  "assignment_id": "ebfa52f7-ec99-412e-9bd1-8f972503026b",
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
  "arrived_at": "2026-10-30T07:34:28.810335Z",
  "started_at": "2026-10-30T07:34:30.236518Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678793195"
  }
}
```

`POST /api/driver/v1/trips/1ec057ea-46e3-431b-853f-ad64148a5939/complete` → **200**

```json
{
  "command_id": "729dccee-7d45-4a78-984a-32d6c3d61c1a",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:34:30Z",
  "cash_received": true
}
```

```json
{
  "id": "1ec057ea-46e3-431b-853f-ad64148a5939",
  "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
  "assignment_id": "ebfa52f7-ec99-412e-9bd1-8f972503026b",
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
  "arrived_at": "2026-10-30T07:34:28.810335Z",
  "started_at": "2026-10-30T07:34:30.236518Z",
  "completed_at": "2026-10-30T07:34:30.548641Z",
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
  "session_id": "8d91c38e-deaa-40bf-aa46-d23e55282f3e",
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
  "last_heartbeat_at": "2026-10-30T07:34:28.506844Z",
  "last_location_at": "2026-10-30T07:34:28.506844Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d91c38e-deaa-40bf-aa46-d23e55282f3e/close` → **200**

```json
{
  "command_id": "066bd2d3-8b12-4d27-9005-0b855a2118bc",
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
  "phone": "+380636214343",
  "device_ref": "sandbox-31519"
}
```

```json
{
  "challenge_id": "68f7d79f-09ed-41cf-a981-a63e9e3199b2",
  "expires_at": "2026-10-30T07:39:31.492019453Z",
  "resend_available_at": "2026-10-30T07:34:32.492019453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636214343` → **200**

```json
{
  "phone": "+380636214343",
  "audience": "CLIENT",
  "code": "188045",
  "sent_at": "2026-10-30T07:34:31.496334385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "68f7d79f-09ed-41cf-a981-a63e9e3199b2",
  "code": "188045",
  "device_ref": "sandbox-31519"
}
```

```json
{
  "session_id": "d6beeb71-f8c9-4720-9416-d179b21bb63c",
  "subject": {
    "type": "CLIENT",
    "id": "616ff8a7-a710-438b-9155-a6e8783746e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTZmZjhhNy1hNzEwLTQzOGItOTE1NS1hNmU4NzgzNzQ2ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NTcxLCJpYXQiOjE3OTMzNDU2NzEsImp0aSI6IjIyYThiZDJhLWI2OGQtNDkzMS04ODViLTU0YTk1YTY3ZjU0MCIsInNpZCI6ImQ2YmVlYjcxLWY4YzktNDcyMC05NDE2LWQxNzliMjFiYjYzYyJ9.3R_OlsJ3bpm8T0r5WUr0SKjG2j-i7wt0Q7OESjtA2ZQ",
  "access_expires_at": "2026-10-30T07:49:31.815896889Z",
  "refresh_token": "1aNJpQWhplOJlZgmAaBAUNUwuAGjJzOAqZTYR5emY7U",
  "refresh_expires_at": "2026-11-29T07:34:31.815289314Z",
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
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом"
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
  "device_ref": "sandbox-2962"
}
```

```json
{
  "challenge_id": "ad9d8e64-26c2-437b-a2ae-1d11d5046ec9",
  "expires_at": "2026-10-30T07:39:32.397865825Z",
  "resend_available_at": "2026-10-30T07:34:33.397865825Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "533796",
  "sent_at": "2026-10-30T07:34:32.40413158Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad9d8e64-26c2-437b-a2ae-1d11d5046ec9",
  "code": "533796",
  "device_ref": "sandbox-2962"
}
```

```json
{
  "session_id": "bf6d670a-e7d7-4980-a221-1e64f2639636",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjU3MiwiaWF0IjoxNzkzMzQ1NjcyLCJqdGkiOiJkNWFjODIyMC1kYmE5LTQ1YmYtYWY3Yy04ZTAxZTQ1NjQwMGEiLCJzaWQiOiJiZjZkNjcwYS1lN2Q3LTQ5ODAtYTIyMS0xZTY0ZjI2Mzk2MzYifQ.CCcyJclaPJEOQLxK_L-UiVoTCM83wi-owoO8Zd1SHOg",
  "access_expires_at": "2026-10-30T07:49:32.719418536Z",
  "refresh_token": "szyqtwaVWr1rvTNZQ3o46WlVsCkmewEnncM_bHAW1e0",
  "refresh_expires_at": "2026-11-29T07:34:32.718752151Z",
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
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати"
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
  "session_id": "c4a11813-cda9-4d72-9a55-a24b984eba2e",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1NzMsImlhdCI6MTc5MzM0NTY3MywianRpIjoiYWY5NmVjNDItY2NkOC00Yzg4LWJmMDktMWNmNjI1MzI0YTU2Iiwic2lkIjoiYzRhMTE4MTMtY2RhOS00ZDcyLTlhNTUtYTI0Yjk4NGViYTJlIn0.J8qr68oOFWEgFl9MxWavxkRj00gA2YVuVNtVGEp8VjE",
  "access_expires_at": "2026-10-30T07:49:33.590508724Z",
  "refresh_token": "UOqFn1awh1BPaSdDZmSxSSBqkh9bQI_5D_atugrJWBU",
  "refresh_expires_at": "2026-10-30T19:34:33.589894995Z",
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
  "session_id": "8e0c9947-025e-4663-88cb-0d5dbdf02355",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1NzQsImlhdCI6MTc5MzM0NTY3NCwianRpIjoiMDY3ZjQwOWUtODUyOC00ZjJjLWI3MDgtODM4YTk3YjdkMGM0Iiwic2lkIjoiOGUwYzk5NDctMDI1ZS00NjYzLTg4Y2ItMGQ1ZGJkZjAyMzU1In0.ijnnIu04DQf1Abn66IYR4yHJbJAZa6A3gFRV4XobLHs",
  "access_expires_at": "2026-10-30T07:49:34.180042603Z",
  "refresh_token": "zrDu51daMxbwXaeex-6xbcRxpL4Hrb-MV8jfUrMEaCk",
  "refresh_expires_at": "2026-10-30T19:34:34.179430307Z",
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
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident",
        "uk": "ДТП"
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
  "command_id": "4379d891-5cd9-4d02-83bc-5d157d3eca30",
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
  "id": "a4b12546-bf5d-4706-88a9-425a45ee2d85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:39:34.762692Z",
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
  "command_id": "772526d6-bf47-4712-887d-134312f4ec44",
  "quote_id": "a4b12546-bf5d-4706-88a9-425a45ee2d85",
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
  "id": "466a6c6d-6892-400b-bb82-48ffac390183",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "616ff8a7-a710-438b-9155-a6e8783746e3",
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
  "created_at": "2026-10-30T07:34:35.078588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/466a6c6d-6892-400b-bb82-48ffac390183` → **200**

```json
{
  "id": "466a6c6d-6892-400b-bb82-48ffac390183",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "616ff8a7-a710-438b-9155-a6e8783746e3",
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
  "created_at": "2026-10-30T07:34:35.078588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/466a6c6d-6892-400b-bb82-48ffac390183/cancel` → **200**

```json
{
  "command_id": "b36d2b49-15d8-44c2-8095-7cdccfd2d5e6",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "466a6c6d-6892-400b-bb82-48ffac390183",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "616ff8a7-a710-438b-9155-a6e8783746e3",
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
  "created_at": "2026-10-30T07:34:35.078588Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
      "uk": "Довго чекати авто"
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
  "command_id": "dd6f8239-3a94-4bdb-a2e5-49f70f12f5b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:36Z",
    "sequence": 1793345676329
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "25677e3a-2a60-4249-9b9f-a1a138f7c7b6",
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
  "last_heartbeat_at": "2026-10-30T07:34:36.349718Z",
  "last_location_at": "2026-10-30T07:34:36.349718Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11045"
}
```

```json
{
  "challenge_id": "2db0859d-6cab-430a-abe4-3e9a906934c3",
  "expires_at": "2026-10-30T07:39:36.654884517Z",
  "resend_available_at": "2026-10-30T07:34:37.654884517Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "181350",
  "sent_at": "2026-10-30T07:34:36.659109894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2db0859d-6cab-430a-abe4-3e9a906934c3",
  "code": "181350",
  "device_ref": "sandbox-11045"
}
```

```json
{
  "session_id": "9769c4f3-cdb4-4f2c-869c-21536c2545ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjU3NiwiaWF0IjoxNzkzMzQ1Njc2LCJqdGkiOiI5NDYzMTQxMy01YjZkLTQxMDktYjgxNC1jMzVmNzJlMGIwYzkiLCJzaWQiOiI5NzY5YzRmMy1jZGI0LTRmMmMtODY5Yy0yMTUzNmMyNTQ1ZWQifQ.2VW8PiXC6Fcl4WMJ6Xz5ekqaPT6NkT0Wtsfx7qJMVgY",
  "access_expires_at": "2026-10-30T07:49:36.970139196Z",
  "refresh_token": "JbX6WRyw_spYoj9pQe52y1oQnUwblCMHBOUE6xaJapY",
  "refresh_expires_at": "2026-11-29T07:34:36.969596259Z",
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
  "command_id": "7f693a83-b5eb-45b5-9feb-1387edfdc389",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:37Z",
    "sequence": 1793345677543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "781893a4-f10e-4a07-9bf1-1e22577e1760",
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
  "last_heartbeat_at": "2026-10-30T07:34:37.564517Z",
  "last_location_at": "2026-10-30T07:34:37.564517Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73a5da43-a48d-4b37-a3a2-3b0f42b5b81f",
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
  "id": "b951d593-9fe0-4372-9335-a04802242ace",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:39:37.871829Z",
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
  "command_id": "d52d1d5a-9953-44d0-bac4-13c8726d45d8",
  "quote_id": "b951d593-9fe0-4372-9335-a04802242ace",
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
  "id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "616ff8a7-a710-438b-9155-a6e8783746e3",
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
  "created_at": "2026-10-30T07:34:38.173262Z",
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
    "id": "678e2ecf-1d1e-4737-946b-a4e1b217ebf2",
    "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
    "expires_at": "2026-10-30T07:34:53.177922Z",
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

`POST /api/driver/v1/offers/678e2ecf-1d1e-4737-946b-a4e1b217ebf2/accept` → **200**

```json
{
  "command_id": "d81dd21e-1ba7-4918-8c86-ba337cc522e0"
}
```

```json
{
  "id": "b32b3578-b414-43d1-90df-111f86dd2770",
  "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f07d69cf-d1bf-4a9d-aabc-52fa10cd7dfe",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f07d69cf-d1bf-4a9d-aabc-52fa10cd7dfe",
  "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
  "assignment_id": "b32b3578-b414-43d1-90df-111f86dd2770",
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

`POST /api/driver/v1/trips/f07d69cf-d1bf-4a9d-aabc-52fa10cd7dfe/cancel` → **200**

```json
{
  "command_id": "e75d2ce4-9581-4b0d-bf1b-bb720213445d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "f07d69cf-d1bf-4a9d-aabc-52fa10cd7dfe",
  "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
  "assignment_id": "b32b3578-b414-43d1-90df-111f86dd2770",
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

`GET /api/rider/v1/orders/a87f963d-28ef-407c-bc9c-943e7b5425dc` → **200**

```json
{
  "id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "616ff8a7-a710-438b-9155-a6e8783746e3",
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
    "id": "b32b3578-b414-43d1-90df-111f86dd2770",
    "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f07d69cf-d1bf-4a9d-aabc-52fa10cd7dfe",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T07:34:38.173262Z",
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
    "id": "244c5700-6c40-4cc5-b39d-52cde91b0121",
    "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
    "expires_at": "2026-10-30T07:34:54.426671Z",
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

`POST /api/driver/v1/offers/244c5700-6c40-4cc5-b39d-52cde91b0121/accept` → **200**

```json
{
  "command_id": "d29ca5a9-4241-4380-991a-0a43d2873b9a"
}
```

```json
{
  "id": "547ff305-89cb-4729-b71d-a57676045bde",
  "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7f490bcf-9cf5-4efe-a9d3-34685505ea13",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7f490bcf-9cf5-4efe-a9d3-34685505ea13",
  "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
  "assignment_id": "547ff305-89cb-4729-b71d-a57676045bde",
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

`POST /api/driver/v1/trips/7f490bcf-9cf5-4efe-a9d3-34685505ea13/cancel` → **200**

```json
{
  "command_id": "1cea78df-654b-48fa-a6e6-3a3be2eb4194",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "7f490bcf-9cf5-4efe-a9d3-34685505ea13",
  "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
  "assignment_id": "547ff305-89cb-4729-b71d-a57676045bde",
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
    "id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T07:34:38.173262Z",
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
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "466a6c6d-6892-400b-bb82-48ffac390183",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T07:34:35.078588Z",
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
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/a87f963d-28ef-407c-bc9c-943e7b5425dc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:34:38.173958Z",
      "actor": {
        "type": "CLIENT",
        "id": "616ff8a7-a710-438b-9155-a6e8783746e3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
        "quote_id": "b951d593-9fe0-4372-9335-a04802242ace",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "fda07299-96c3-480e-ac4c-ab9ffd413697"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:34:38.176604Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
        "attempt_id": "2d668014-d6ab-4437-92ec-02329b44917e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "fda07299-96c3-480e-ac4c-ab9ffd413697"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T07:34:38.187824Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "678e2ecf-1d1e-4737-946b-a4e1b217ebf2",
        "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "fda07299-96c3-480e-ac4c-ab9ffd413697"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T07:34:38.81426Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "678e2ecf-1d1e-4737-946b-a4e1b217ebf2",
        "order_id": "a87f963d-28ef-407c-bc9c-943e7b5425dc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "b32b3578-b414-43d1-90df-111f86dd2770"
      },
      "correlation_id": "ec7b01a5-91ab-458d-bdbc-2f79d1051311"
```

Done: orders 466a6c6d-6892-400b-bb82-48ffac390183, a87f963d-28ef-407c-bc9c-943e7b5425dc.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735337738",
  "device_ref": "sandbox-4979"
}
```

```json
{
  "challenge_id": "218d29e9-c187-43cc-8b20-95b1dedef5f7",
  "expires_at": "2026-10-30T07:39:41.885910609Z",
  "resend_available_at": "2026-10-30T07:34:42.885910609Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735337738` → **200**

```json
{
  "phone": "+380735337738",
  "audience": "CLIENT",
  "code": "953782",
  "sent_at": "2026-10-30T07:34:41.889884923Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "218d29e9-c187-43cc-8b20-95b1dedef5f7",
  "code": "953782",
  "device_ref": "sandbox-4979"
}
```

```json
{
  "session_id": "46b8cd7f-275f-430b-a0a9-a77830069813",
  "subject": {
    "type": "CLIENT",
    "id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ODM4YjNlZC1mZWJjLTRmZjktYTRmNS1kYmQ2N2U0NDcyZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NTgyLCJpYXQiOjE3OTMzNDU2ODIsImp0aSI6IjNkNDIyZWExLTU1M2QtNGUwMS1iYzRkLTdiYWRlZjJlZDc4NSIsInNpZCI6IjQ2YjhjZDdmLTI3NWYtNDMwYi1hMGE5LWE3NzgzMDA2OTgxMyJ9.kkil8owtBXWqkDV5AtOGT9nS5ONmhRZY433IiapH26E",
  "access_expires_at": "2026-10-30T07:49:42.204672775Z",
  "refresh_token": "2d_2Mbmi43JB85uJRcXpZfrxZ2HMAiLFu3gLOMw8WmA",
  "refresh_expires_at": "2026-11-29T07:34:42.203985488Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "12264bcf-0c62-4b85-88e7-129be7e18ea6",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "531ea685-80cf-4dbf-b75b-50233a51baa8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-531ea685-80cf-4dbf-b75b-50233a51baa8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a841eec549169f1425d603f392e58a07",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=531ea685-80cf-4dbf-b75b-50233a51baa8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735337738"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=531ea685-80cf-4dbf-b75b-50233a51baa8",
  "expires_at": "2026-10-30T08:04:42.497986Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/531ea685-80cf-4dbf-b75b-50233a51baa8` → **200**

```json
{
  "id": "531ea685-80cf-4dbf-b75b-50233a51baa8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:04:42.497986Z",
  "card": {
    "id": "e3ff9f99-3d3a-4ce0-81a0-e5bdcf099aef",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9716",
    "card_type": "Visa",
    "created_at": "2026-10-30T07:34:42.797749Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e3ff9f99-3d3a-4ce0-81a0-e5bdcf099aef",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9716",
      "card_type": "Visa",
      "created_at": "2026-10-30T07:34:42.797749Z"
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
  "device_ref": "sandbox-22619"
}
```

```json
{
  "challenge_id": "484d43d2-4933-442e-956c-338fa2a23fd8",
  "expires_at": "2026-10-30T07:39:43.384427649Z",
  "resend_available_at": "2026-10-30T07:34:44.384427649Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "247155",
  "sent_at": "2026-10-30T07:34:43.387980954Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "484d43d2-4933-442e-956c-338fa2a23fd8",
  "code": "247155",
  "device_ref": "sandbox-22619"
}
```

```json
{
  "session_id": "a9e9a247-5059-4343-a786-1f5364665f9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjU4MywiaWF0IjoxNzkzMzQ1NjgzLCJqdGkiOiIzMDM3ZjgwNy03ZTllLTRiYTEtODU5MC03YzMyODUyOTZlNDMiLCJzaWQiOiJhOWU5YTI0Ny01MDU5LTQzNDMtYTc4Ni0xZjUzNjQ2NjVmOWMifQ.EOoQDumw_gWo43l4JMhEs_l0RPqOdUTwBtJmzoyeuxk",
  "access_expires_at": "2026-10-30T07:49:43.708842749Z",
  "refresh_token": "mvlbngEm5gCvxQzedHvJ7htZbF-mlR9-Gsu7M-vEfBI",
  "refresh_expires_at": "2026-11-29T07:34:43.708153505Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "781893a4-f10e-4a07-9bf1-1e22577e1760",
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
  "last_heartbeat_at": "2026-10-30T07:34:37.564517Z",
  "last_location_at": "2026-10-30T07:34:37.564517Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/781893a4-f10e-4a07-9bf1-1e22577e1760/handover` → **200**

```json
{
  "command_id": "89b31998-aace-4ec0-8f06-3b3c247f6f4c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "781893a4-f10e-4a07-9bf1-1e22577e1760",
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
  "last_heartbeat_at": "2026-10-30T07:34:37.564517Z",
  "last_location_at": "2026-10-30T07:34:37.564517Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/781893a4-f10e-4a07-9bf1-1e22577e1760/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:44Z",
    "sequence": 1793345684579
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "781893a4-f10e-4a07-9bf1-1e22577e1760",
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
  "last_heartbeat_at": "2026-10-30T07:34:44.599649Z",
  "last_location_at": "2026-10-30T07:34:44.599649Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ed557e7-538a-40fe-afc3-564fe811781c",
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
  "id": "24087432-58ad-4e26-934c-bc2cc3510a32",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:39:44.893795Z",
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
  "command_id": "187982d0-e11f-4be0-97d3-425474267711",
  "quote_id": "24087432-58ad-4e26-934c-bc2cc3510a32",
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
  "id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
  "created_at": "2026-10-30T07:34:45.207333Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb` → **200**

```json
{
  "id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
  "created_at": "2026-10-30T07:34:45.207333Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb` → **200**

```json
{
  "id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
  "created_at": "2026-10-30T07:34:45.207333Z",
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
    "id": "2bbe0d08-f728-4a44-975f-ec5cd70cd53b",
    "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
    "expires_at": "2026-10-30T07:35:00.554046Z",
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

`POST /api/driver/v1/offers/2bbe0d08-f728-4a44-975f-ec5cd70cd53b/accept` → **200**

```json
{
  "command_id": "3985cadb-72bd-4b02-a29e-7bd52c53ffb6"
}
```

```json
{
  "id": "83303b2c-313a-4407-a9c8-0be3ae0e05d6",
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45",
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "assignment_id": "83303b2c-313a-4407-a9c8-0be3ae0e05d6",
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

`POST /api/driver/v1/work-sessions/781893a4-f10e-4a07-9bf1-1e22577e1760/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:48Z",
    "sequence": 1793345688484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "781893a4-f10e-4a07-9bf1-1e22577e1760",
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
  "last_heartbeat_at": "2026-10-30T07:34:48.069482Z",
  "last_location_at": "2026-10-30T07:34:48.069482Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45/arrive` → **200**

```json
{
  "command_id": "6d21353b-54af-48ba-8168-41280bd62586",
  "expected_version": 0
}
```

```json
{
  "id": "cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45",
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "assignment_id": "83303b2c-313a-4407-a9c8-0be3ae0e05d6",
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
  "arrived_at": "2026-10-30T07:34:48.368052Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45/start` → **200**

```json
{
  "command_id": "2234cbda-8b9c-4399-8361-44ce85b83bd0",
  "expected_version": 1
}
```

```json
{
  "id": "cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45",
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "assignment_id": "83303b2c-313a-4407-a9c8-0be3ae0e05d6",
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
  "arrived_at": "2026-10-30T07:34:48.368052Z",
  "started_at": "2026-10-30T07:34:48.666674Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45/complete` → **200**

```json
{
  "command_id": "83f5aa41-68fc-49f6-9b09-ef6a0bf53ad6",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:34:48Z",
  "cash_received": true
}
```

```json
{
  "id": "cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45",
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "assignment_id": "83303b2c-313a-4407-a9c8-0be3ae0e05d6",
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
  "arrived_at": "2026-10-30T07:34:48.368052Z",
  "started_at": "2026-10-30T07:34:48.666674Z",
  "completed_at": "2026-10-30T07:34:49.003583Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb` → **200**

```json
{
  "id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
    "id": "83303b2c-313a-4407-a9c8-0be3ae0e05d6",
    "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:34:45.207333Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb` → **200**

```json
{
  "id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
    "id": "83303b2c-313a-4407-a9c8-0be3ae0e05d6",
    "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:34:45.207333Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb` → **200**

```json
{
  "id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
    "id": "83303b2c-313a-4407-a9c8-0be3ae0e05d6",
    "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cfb3ef7c-f9a7-46c7-bfa3-d8a6469caa45",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:34:45.207333Z",
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

`GET /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb/tip` → **200**

```json
{
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
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
  "available_until": "2026-10-31T07:34:49.003583Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb/tip` → **201**

```json
{
  "command_id": "26053099-b3d9-4a71-94db-6ec27792de2e",
  "amount_minor": 2500
}
```

```json
{
  "id": "1d03dee6-13c1-4021-bbb4-a9f8ba72fcd0",
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T07:34:52.819326Z"
}
```

`GET /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb/tip` → **200**

```json
{
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
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
  "available_until": "2026-10-31T07:34:49.003583Z",
  "open": false,
  "tip": {
    "id": "1d03dee6-13c1-4021-bbb4-a9f8ba72fcd0",
    "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T07:34:52.819326Z"
  }
}
```

`GET /api/rider/v1/orders/1b442a5f-aacd-41d1-a3cc-6efc6a75dddb/tip` → **200**

```json
{
  "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
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
  "available_until": "2026-10-31T07:34:49.003583Z",
  "open": false,
  "tip": {
    "id": "1d03dee6-13c1-4021-bbb4-a9f8ba72fcd0",
    "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T07:34:52.819326Z"
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
      "id": "5a3694e6-7150-4ff9-873e-df4aa7c7f4b0",
      "at": "2026-10-30T07:34:54.700915Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
      "counterpart_id": null
    },
    {
      "id": "ee633f81-8677-4188-aee9-a8064f80132c",
      "at": "2026-10-30T07:34:49.619242Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "977b0ea3-34ad-4038-83a4-7c089351f9fb",
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
  "id": "de016019-8fa4-43e3-89eb-c56321cf0238",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:39:55.030593Z",
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
  "session_id": "ca13f663-092f-4e69-b39f-f4b287c7eeb5",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY1OTUsImlhdCI6MTc5MzM0NTY5NSwianRpIjoiZDllZThlYzktYTNhOC00MzcyLWI1OWQtMWNjNDEzZjUyNmYwIiwic2lkIjoiY2ExM2Y2NjMtMDkyZi00ZTY5LWIzOWYtZjRiMjg3YzdlZWI1In0.vuaQ1F3nilAH8xdmlawB_FL5l3Ss_ODnb6tJBMVIpAo",
  "access_expires_at": "2026-10-30T07:49:55.626919971Z",
  "refresh_token": "jvswV16Gcuh8v1V5mrVDF9LQ3OCdUOzDbT-a60lTGb0",
  "refresh_expires_at": "2026-10-30T19:34:55.62634794Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735337738` → **200**

```json
{
  "client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db"
}
```

`POST /api/admin/v1/rider-wallets/9838b3ed-febc-4ff9-a4f5-dbd67e4472db/top-ups` → **201**

```json
{
  "command_id": "86f97f92-215b-4d1c-9312-acdc6edf196b",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
      "id": "837cea20-20bb-44ec-bb0e-3cb32a669d4d",
      "at": "2026-10-30T07:34:56.187351Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3695d1eb-3ede-4889-826e-81529c1b9d3a",
  "quote_id": "de016019-8fa4-43e3-89eb-c56321cf0238",
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
  "id": "267bc2c7-f502-4111-9667-57f8b37d2400",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
  "created_at": "2026-10-30T07:34:56.492308Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/267bc2c7-f502-4111-9667-57f8b37d2400` → **200**

```json
{
  "id": "267bc2c7-f502-4111-9667-57f8b37d2400",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
  "created_at": "2026-10-30T07:34:56.492308Z",
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
    "id": "58e5dde2-522b-466a-9ba7-b943ea25e6c7",
    "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
    "expires_at": "2026-10-30T07:35:11.497392Z",
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

`POST /api/driver/v1/offers/58e5dde2-522b-466a-9ba7-b943ea25e6c7/accept` → **200**

```json
{
  "command_id": "a7c0bc92-73b7-4fa7-bda9-2c33f34ef465"
}
```

```json
{
  "id": "32a4dec6-97cc-437e-a164-a117a3b97072",
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8407e78-c0b4-4b89-8fc1-2ffe6e59c67b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8407e78-c0b4-4b89-8fc1-2ffe6e59c67b",
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
  "assignment_id": "32a4dec6-97cc-437e-a164-a117a3b97072",
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

`POST /api/driver/v1/work-sessions/781893a4-f10e-4a07-9bf1-1e22577e1760/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:34:57Z",
    "sequence": 1793345697972
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "781893a4-f10e-4a07-9bf1-1e22577e1760",
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
  "last_heartbeat_at": "2026-10-30T07:34:57.993735Z",
  "last_location_at": "2026-10-30T07:34:57.993735Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a8407e78-c0b4-4b89-8fc1-2ffe6e59c67b/arrive` → **200**

```json
{
  "command_id": "b29fd83d-7a44-4dc0-8f44-e65b9d154bd8",
  "expected_version": 0
}
```

```json
{
  "id": "a8407e78-c0b4-4b89-8fc1-2ffe6e59c67b",
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
  "assignment_id": "32a4dec6-97cc-437e-a164-a117a3b97072",
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
  "arrived_at": "2026-10-30T07:34:58.319491Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a8407e78-c0b4-4b89-8fc1-2ffe6e59c67b/start` → **200**

```json
{
  "command_id": "c9a1016f-8c7e-4d4c-b6b2-78ee81cd6ce4",
  "expected_version": 1
}
```

```json
{
  "id": "a8407e78-c0b4-4b89-8fc1-2ffe6e59c67b",
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
  "assignment_id": "32a4dec6-97cc-437e-a164-a117a3b97072",
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
  "arrived_at": "2026-10-30T07:34:58.319491Z",
  "started_at": "2026-10-30T07:34:58.630806Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a8407e78-c0b4-4b89-8fc1-2ffe6e59c67b/complete` → **200**

```json
{
  "command_id": "63205f78-0ee7-46d1-9c32-5efb8e811bbb",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:34:58Z",
  "cash_received": true
}
```

```json
{
  "id": "a8407e78-c0b4-4b89-8fc1-2ffe6e59c67b",
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
  "assignment_id": "32a4dec6-97cc-437e-a164-a117a3b97072",
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
  "arrived_at": "2026-10-30T07:34:58.319491Z",
  "started_at": "2026-10-30T07:34:58.630806Z",
  "completed_at": "2026-10-30T07:34:58.964537Z",
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
  "client_id": "9838b3ed-febc-4ff9-a4f5-dbd67e4472db",
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
      "id": "837cea20-20bb-44ec-bb0e-3cb32a669d4d",
      "at": "2026-10-30T07:34:56.187351Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
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

`GET /api/rider/v1/orders/267bc2c7-f502-4111-9667-57f8b37d2400/tip` → **200**

```json
{
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
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
  "available_until": "2026-10-31T07:34:58.964537Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/267bc2c7-f502-4111-9667-57f8b37d2400/tip` → **201**

```json
{
  "command_id": "67ebed89-bb96-4bbc-a494-75108b63cdb6",
  "amount_minor": 2500
}
```

```json
{
  "id": "96d8025d-6400-4e91-97c7-0a7f572113a3",
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T07:35:00.150713Z"
}
```

`GET /api/rider/v1/orders/267bc2c7-f502-4111-9667-57f8b37d2400/tip` → **200**

```json
{
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
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
  "available_until": "2026-10-31T07:34:58.964537Z",
  "open": false,
  "tip": {
    "id": "96d8025d-6400-4e91-97c7-0a7f572113a3",
    "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T07:35:00.150713Z"
  }
}
```

`GET /api/rider/v1/orders/267bc2c7-f502-4111-9667-57f8b37d2400/tip` → **200**

```json
{
  "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
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
  "available_until": "2026-10-31T07:34:58.964537Z",
  "open": false,
  "tip": {
    "id": "96d8025d-6400-4e91-97c7-0a7f572113a3",
    "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T07:35:00.150713Z"
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
      "id": "ec4e1ebb-84b8-47cd-9aea-70741513938f",
      "at": "2026-10-30T07:35:01.784425Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
      "counterpart_id": null
    },
    {
      "id": "b0e7d39d-1017-4c60-8cf2-600cdf1b6fd2",
      "at": "2026-10-30T07:34:59.750788Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "267bc2c7-f502-4111-9667-57f8b37d2400",
      "counterpart_id": null
    },
    {
      "id": "5a3694e6-7150-4ff9-873e-df4aa7c7f4b0",
      "at": "2026-10-30T07:34:54.700915Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
      "counterpart_id": null
    },
    {
      "id": "ee633f81-8677-4188-aee9-a8064f80132c",
      "at": "2026-10-30T07:34:49.619242Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1b442a5f-aacd-41d1-a3cc-6efc6a75dddb",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "781893a4-f10e-4a07-9bf1-1e22577e1760",
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
  "last_heartbeat_at": "2026-10-30T07:34:57.993735Z",
  "last_location_at": "2026-10-30T07:34:57.993735Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/781893a4-f10e-4a07-9bf1-1e22577e1760/close` → **200**

```json
{
  "command_id": "932f27f2-1201-4895-988a-8d176d70cd92",
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

Done: card order 267bc2c7-f502-4111-9667-57f8b37d2400.

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
  "phone": "+380734331167",
  "device_ref": "sandbox-14147"
}
```

```json
{
  "challenge_id": "8bdb3ce2-ad63-4549-a2d6-342d382a3fe8",
  "expires_at": "2026-10-30T07:40:03.224076605Z",
  "resend_available_at": "2026-10-30T07:35:04.224076605Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734331167` → **200**

```json
{
  "phone": "+380734331167",
  "audience": "CLIENT",
  "code": "622562",
  "sent_at": "2026-10-30T07:35:03.227559407Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8bdb3ce2-ad63-4549-a2d6-342d382a3fe8",
  "code": "622562",
  "device_ref": "sandbox-14147"
}
```

```json
{
  "session_id": "af1242d8-2002-45ee-b6e8-9391947e4b2a",
  "subject": {
    "type": "CLIENT",
    "id": "f3541923-540d-4471-a0bf-a50933356359"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMzU0MTkyMy01NDBkLTQ0NzEtYTBiZi1hNTA5MzMzNTYzNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjAzLCJpYXQiOjE3OTMzNDU3MDMsImp0aSI6IjJlM2VkNzg4LWYyYWMtNGZhYy04YTlkLTQ3ZTNhOWY4Y2FjMyIsInNpZCI6ImFmMTI0MmQ4LTIwMDItNDVlZS1iNmU4LTkzOTE5NDdlNGIyYSJ9.BJdZWK6nI6qjuF52WskCtMCCs3vjd5ookWK6UTSFTYc",
  "access_expires_at": "2026-10-30T07:50:03.548527726Z",
  "refresh_token": "Jb_cW1s85AAGPS7uUndwPEYmxxO81Udr_WG3jZVlKdU",
  "refresh_expires_at": "2026-11-29T07:35:03.547782037Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "40e95378-c59f-4173-bf7c-6d8e1ed5fc11",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "7a574186-4013-4598-9cfc-9abe182b8159",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-7a574186-4013-4598-9cfc-9abe182b8159",
    "orderDate": "1793345703",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8d918203194f8ae7829a6f47d27af86e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=7a574186-4013-4598-9cfc-9abe182b8159",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734331167"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=7a574186-4013-4598-9cfc-9abe182b8159",
  "created_at": "2026-10-30T07:35:03.84748Z",
  "expires_at": "2026-10-30T08:05:03.84748Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/7a574186-4013-4598-9cfc-9abe182b8159` → **200**

```json
{
  "id": "7a574186-4013-4598-9cfc-9abe182b8159",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T07:35:03.84748Z",
  "expires_at": "2026-10-30T08:05:03.84748Z",
  "completed_at": "2026-10-30T07:35:04.151447Z",
  "masked_pan": "41****4910",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f3541923-540d-4471-a0bf-a50933356359",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f3541923-540d-4471-a0bf-a50933356359",
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
      "id": "b698de96-62f7-4f80-a65f-fc127443d52e",
      "at": "2026-10-30T07:35:04.803431Z",
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
  "client_id": "f3541923-540d-4471-a0bf-a50933356359",
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
      "id": "b698de96-62f7-4f80-a65f-fc127443d52e",
      "at": "2026-10-30T07:35:04.803431Z",
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
  "device_ref": "sandbox-25425"
}
```

```json
{
  "challenge_id": "99bed277-1885-4fb0-bbe1-14738eeedff8",
  "expires_at": "2026-10-30T07:40:06.336842815Z",
  "resend_available_at": "2026-10-30T07:35:07.336842815Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "918070",
  "sent_at": "2026-10-30T07:35:06.339849953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99bed277-1885-4fb0-bbe1-14738eeedff8",
  "code": "918070",
  "device_ref": "sandbox-25425"
}
```

```json
{
  "session_id": "915f88c8-2ae8-43d0-8d91-bfca4c49e521",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjYwNiwiaWF0IjoxNzkzMzQ1NzA2LCJqdGkiOiJhYWY3MGU2ZS0xNDkxLTQyYzYtYTg5My0zNDQ5MjQ0MzYyYjAiLCJzaWQiOiI5MTVmODhjOC0yYWU4LTQzZDAtOGQ5MS1iZmNhNGM0OWU1MjEifQ.VPiqTrqvyef9tZZwhjSx5nxNY52BwJK9MMG3tRtxD6s",
  "access_expires_at": "2026-10-30T07:50:06.657401632Z",
  "refresh_token": "VYKPxik-ge70CmIvuNDOT3hcg67PQ_4Cb8E0MbYY3wc",
  "refresh_expires_at": "2026-11-29T07:35:06.656782893Z",
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
  "command_id": "51e5513a-40ed-48af-828a-52f9fe9093d3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "3530251f-412e-40b7-8533-5e5fda51ec39",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3530251f-412e-40b7-8533-5e5fda51ec39",
    "orderDate": "1793345707",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "dc5f9e0011fb6d1ddc00a208fe91e56c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3530251f-412e-40b7-8533-5e5fda51ec39",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3530251f-412e-40b7-8533-5e5fda51ec39",
  "created_at": "2026-10-30T07:35:07.239452Z",
  "expires_at": "2026-10-30T08:05:07.239452Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/3530251f-412e-40b7-8533-5e5fda51ec39` → **200**

```json
{
  "id": "3530251f-412e-40b7-8533-5e5fda51ec39",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T07:35:07.239452Z",
  "expires_at": "2026-10-30T08:05:07.239452Z",
  "completed_at": "2026-10-30T07:35:07.541833Z",
  "masked_pan": "41****8790",
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
      "id": "bb9c7c6c-4a69-4f43-bbcc-20a36730d680",
      "at": "2026-10-30T07:35:07.811855Z",
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
  "command_id": "602cd85e-41ad-42fd-9afc-6de9f65e8021",
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
  "correlation_id": "52d56907-f47e-432b-8111-bf9ce049c28e"
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
  "device_ref": "sandbox-12017"
}
```

```json
{
  "challenge_id": "876ac274-1951-4ac2-86e3-690d2e4aeec1",
  "expires_at": "2026-10-30T07:40:08.522114759Z",
  "resend_available_at": "2026-10-30T07:35:09.522114759Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "304383",
  "sent_at": "2026-10-30T07:35:08.5271421Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "876ac274-1951-4ac2-86e3-690d2e4aeec1",
  "code": "304383",
  "device_ref": "sandbox-12017"
}
```

```json
{
  "session_id": "7912ceb9-c255-48c6-84f4-a53f4da30789",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjYwOCwiaWF0IjoxNzkzMzQ1NzA4LCJqdGkiOiIzY2I2ZGVlYi0zZGI4LTQ4ZWYtYTMxNi0zZTA0MDlhMWZlZWIiLCJzaWQiOiI3OTEyY2ViOS1jMjU1LTQ4YzYtODRmNC1hNTNmNGRhMzA3ODkifQ.T8kxGEt0QpDGhhMU8SWkidq45Y24HL-gIjTtvc1VXpQ",
  "access_expires_at": "2026-10-30T07:50:08.889786273Z",
  "refresh_token": "dxc7XvOxeq6Wvxvmpy0b0VoOjEYOotTcS5G1LoelvfQ",
  "refresh_expires_at": "2026-11-29T07:35:08.889065874Z",
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
  "command_id": "3c72b347-171c-40bc-a283-0db9a48af18e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:35:09Z",
    "sequence": 1793345709513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d9ffce7e-6f34-4efb-8f59-2d121d66035b",
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
  "last_heartbeat_at": "2026-10-30T07:35:09.534931Z",
  "last_location_at": "2026-10-30T07:35:09.534931Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639147534",
  "device_ref": "sandbox-17216"
}
```

```json
{
  "challenge_id": "17f3110b-965c-45b1-a829-7418688ff7f0",
  "expires_at": "2026-10-30T07:40:09.838801714Z",
  "resend_available_at": "2026-10-30T07:35:10.838801714Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639147534` → **200**

```json
{
  "phone": "+380639147534",
  "audience": "CLIENT",
  "code": "351254",
  "sent_at": "2026-10-30T07:35:09.841923059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17f3110b-965c-45b1-a829-7418688ff7f0",
  "code": "351254",
  "device_ref": "sandbox-17216"
}
```

```json
{
  "session_id": "cb9b27ee-c6fa-47ac-a492-bec9b089d030",
  "subject": {
    "type": "CLIENT",
    "id": "d6999501-6996-4bd5-835f-cd1eab4c97c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjk5OTUwMS02OTk2LTRiZDUtODM1Zi1jZDFlYWI0Yzk3YzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjEwLCJpYXQiOjE3OTMzNDU3MTAsImp0aSI6ImVjYTU5ZjNmLTQ3ZDUtNGU4Yi04NWE4LTNiNDE4OTczZWRkNiIsInNpZCI6ImNiOWIyN2VlLWM2ZmEtNDdhYy1hNDkyLWJlYzliMDg5ZDAzMCJ9.SIvQR0mMujnNLMqVE5o-hU3hacEoc-kC4TWkWK9YZFc",
  "access_expires_at": "2026-10-30T07:50:10.166500834Z",
  "refresh_token": "2bLZ-krtItmAFWMW4OABtgRrKDjJHidGHyGolxrWJ3c",
  "refresh_expires_at": "2026-11-29T07:35:10.16594873Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4891a62-ff13-424a-8a4a-de0f5167db49",
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
  "id": "f0de175c-61be-4acf-bc26-e2a4321992a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:40:10.474700Z",
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
  "command_id": "dd282a88-6541-466a-88ab-79f8879c40e0",
  "quote_id": "f0de175c-61be-4acf-bc26-e2a4321992a5",
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
  "id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d6999501-6996-4bd5-835f-cd1eab4c97c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:35:10.783756Z",
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
    "id": "7623ed4f-f6fa-479f-9a03-2d6a5e408aae",
    "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
    "expires_at": "2026-10-30T07:35:25.786917Z",
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

`POST /api/driver/v1/offers/7623ed4f-f6fa-479f-9a03-2d6a5e408aae/accept` → **200**

```json
{
  "command_id": "c8dc32ba-a3b1-4396-8c83-92e206734274"
}
```

```json
{
  "id": "e71367a8-9e6e-4327-b737-f5c99281e5da",
  "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b2bcf33-0572-455a-ab83-e2f5b709729e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b2bcf33-0572-455a-ab83-e2f5b709729e",
  "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
  "assignment_id": "e71367a8-9e6e-4327-b737-f5c99281e5da",
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

`POST /api/driver/v1/work-sessions/d9ffce7e-6f34-4efb-8f59-2d121d66035b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:35:11Z",
    "sequence": 1793345711982
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d9ffce7e-6f34-4efb-8f59-2d121d66035b",
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
  "last_heartbeat_at": "2026-10-30T07:35:12.002784Z",
  "last_location_at": "2026-10-30T07:35:12.002784Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3b2bcf33-0572-455a-ab83-e2f5b709729e/arrive` → **200**

```json
{
  "command_id": "1840047b-45b5-493b-aee4-9df9806e2f32",
  "expected_version": 0
}
```

```json
{
  "id": "3b2bcf33-0572-455a-ab83-e2f5b709729e",
  "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
  "assignment_id": "e71367a8-9e6e-4327-b737-f5c99281e5da",
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
  "arrived_at": "2026-10-30T07:35:12.304428Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b2bcf33-0572-455a-ab83-e2f5b709729e/start` → **200**

```json
{
  "command_id": "58304bb6-d64b-481f-bafb-f0add819b5ee",
  "expected_version": 1
}
```

```json
{
  "id": "3b2bcf33-0572-455a-ab83-e2f5b709729e",
  "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
  "assignment_id": "e71367a8-9e6e-4327-b737-f5c99281e5da",
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
  "arrived_at": "2026-10-30T07:35:12.304428Z",
  "started_at": "2026-10-30T07:35:12.602359Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b2bcf33-0572-455a-ab83-e2f5b709729e/complete` → **200**

```json
{
  "command_id": "e55bd36f-8931-475a-803c-674d17e066c5",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:35:12Z",
  "cash_received": false
}
```

```json
{
  "id": "3b2bcf33-0572-455a-ab83-e2f5b709729e",
  "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
  "assignment_id": "e71367a8-9e6e-4327-b737-f5c99281e5da",
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
  "arrived_at": "2026-10-30T07:35:12.304428Z",
  "started_at": "2026-10-30T07:35:12.602359Z",
  "completed_at": "2026-10-30T07:35:12.917086Z",
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
  "session_id": "4ddc196c-1e60-4414-b0f9-fa18c39663de",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2MTMsImlhdCI6MTc5MzM0NTcxMywianRpIjoiMDliMzM2MjgtMjg5YS00MWM0LTg0NzUtYzk0NzBjMzViMDkzIiwic2lkIjoiNGRkYzE5NmMtMWU2MC00NDE0LWIwZjktZmExOGMzOTY2M2RlIn0.ZUKpNLxQQbe9JNNwefhS8EPu0Qgkdhqzc1t5i5A6U5A",
  "access_expires_at": "2026-10-30T07:50:13.521497103Z",
  "refresh_token": "3I96K-idkS6Way1cC7Yc9OoByQcNAaN461W5lq1ZCJs",
  "refresh_expires_at": "2026-10-30T19:35:13.520878665Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/77d39da4-e622-4a3f-af56-8e432ec4a670/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/77d39da4-e622-4a3f-af56-8e432ec4a670/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1b6653af-c084-4788-9d03-a1cb69155369"
}
```

`GET /api/admin/v1/orders/77d39da4-e622-4a3f-af56-8e432ec4a670/cash-dispute` → **200**

```json
{
  "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "d6999501-6996-4bd5-835f-cd1eab4c97c3",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T07:35:13.895805Z",
  "decide_by": "2026-11-13T07:35:13.895805Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T07:35:13.895805Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "d6999501-6996-4bd5-835f-cd1eab4c97c3",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T07:35:13.895805Z",
      "decide_by": "2026-11-13T07:35:13.895805Z",
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

`POST /api/admin/v1/orders/77d39da4-e622-4a3f-af56-8e432ec4a670/cash-dispute/decide` → **400**

```json
{
  "command_id": "dbbc5ded-695f-4244-bd77-5c6515d707ca",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/77d39da4-e622-4a3f-af56-8e432ec4a670/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9a8309a9-b183-4eb9-a41a-c40be5af824b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/77d39da4-e622-4a3f-af56-8e432ec4a670/cash-dispute/decide` → **200**

```json
{
  "command_id": "1dc2167c-f8d9-4086-9b91-8048024653db",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "d6999501-6996-4bd5-835f-cd1eab4c97c3",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T07:35:13.895805Z",
  "decide_by": "2026-11-13T07:35:13.895805Z",
  "decision": "PAY_DRIVER",
  "decided_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T07:35:16.045396Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/77d39da4-e622-4a3f-af56-8e432ec4a670/cash-dispute/decide` → **409**

```json
{
  "command_id": "6564786e-1967-4dfa-a2e8-186e06511858",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/77d39da4-e622-4a3f-af56-8e432ec4a670/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bd211023-77c2-4da5-adee-59edddb75915"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d9ffce7e-6f34-4efb-8f59-2d121d66035b",
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
  "last_heartbeat_at": "2026-10-30T07:35:12.002784Z",
  "last_location_at": "2026-10-30T07:35:12.002784Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d9ffce7e-6f34-4efb-8f59-2d121d66035b/close` → **200**

```json
{
  "command_id": "4493c61e-14a8-4b28-8463-7f8309fe7575",
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
  "phone": "+380735160453",
  "device_ref": "sandbox-27071"
}
```

```json
{
  "challenge_id": "b8f2e72a-1b5f-4b92-b8e6-e4b178e16dd4",
  "expires_at": "2026-10-30T07:40:17.24577969Z",
  "resend_available_at": "2026-10-30T07:35:18.24577969Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735160453` → **200**

```json
{
  "phone": "+380735160453",
  "audience": "CLIENT",
  "code": "225268",
  "sent_at": "2026-10-30T07:35:17.248681753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8f2e72a-1b5f-4b92-b8e6-e4b178e16dd4",
  "code": "225268",
  "device_ref": "sandbox-27071"
}
```

```json
{
  "session_id": "b7d70fc1-7be8-49ed-a489-1e12a5ed4f89",
  "subject": {
    "type": "CLIENT",
    "id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzdhYTY2Yy02YzllLTQ3MGYtODlkNi03NWFkOTY3NGUwYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjE3LCJpYXQiOjE3OTMzNDU3MTcsImp0aSI6IjUzNjU3MjA5LTk3MzYtNGVkOC1iZTU5LTMzNTFiZWQ3YjgyNCIsInNpZCI6ImI3ZDcwZmMxLTdiZTgtNDllZC1hNDg5LTFlMTJhNWVkNGY4OSJ9.2R-jNc13g1Istqejd-QgYrFOz2aNJmt_k11lQ_n_VZ0",
  "access_expires_at": "2026-10-30T07:50:17.56982519Z",
  "refresh_token": "jGqkIqLiM_2P8viXloUsX6OmwDUtgizfYYnYYQfjFVw",
  "refresh_expires_at": "2026-11-29T07:35:17.569269301Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "100ce674-c94d-483c-ae44-d93944be3bcc",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b09efe78-91d5-4f78-abcd-170f1e063819",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b09efe78-91d5-4f78-abcd-170f1e063819",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "26a7696c90c3aa9b9ccbfda604ce1bee",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b09efe78-91d5-4f78-abcd-170f1e063819",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735160453"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b09efe78-91d5-4f78-abcd-170f1e063819",
  "expires_at": "2026-10-30T08:05:17.871975Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b09efe78-91d5-4f78-abcd-170f1e063819` → **200**

```json
{
  "id": "b09efe78-91d5-4f78-abcd-170f1e063819",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:05:17.871975Z",
  "card": {
    "id": "c895b360-1db9-42cd-99af-a63c893a0ebd",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8930",
    "card_type": "Visa",
    "created_at": "2026-10-30T07:35:18.176608Z"
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
  "device_ref": "sandbox-7642"
}
```

```json
{
  "challenge_id": "c6622b83-4939-4a0c-8073-d8750b457b6b",
  "expires_at": "2026-10-30T07:40:18.499382569Z",
  "resend_available_at": "2026-10-30T07:35:19.499382569Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "130758",
  "sent_at": "2026-10-30T07:35:18.502297566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6622b83-4939-4a0c-8073-d8750b457b6b",
  "code": "130758",
  "device_ref": "sandbox-7642"
}
```

```json
{
  "session_id": "fe65cef2-8725-4fd3-b657-aafdc2d5216e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjYxOCwiaWF0IjoxNzkzMzQ1NzE4LCJqdGkiOiJjMzI0NGY4MS1hZDQ1LTQxZjAtOWNiMC03MTJkN2VkZTlhZjIiLCJzaWQiOiJmZTY1Y2VmMi04NzI1LTRmZDMtYjY1Ny1hYWZkYzJkNTIxNmUifQ.lw_qL_mqbQ5fBU0PULmHXtHa0rpeEVS-x_fnQDob5bo",
  "access_expires_at": "2026-10-30T07:50:18.822322909Z",
  "refresh_token": "_UZLBFMbOsGwCmeR9mSYwnrQDmSvG6xY9qI7NtBzz1c",
  "refresh_expires_at": "2026-11-29T07:35:18.821681177Z",
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
  "command_id": "1c6e1781-0dab-4150-b198-41ce726dcb8e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:35:19Z",
    "sequence": 1793345719410
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "46532da4-44d4-473b-8001-2729e5eb274e",
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
  "last_heartbeat_at": "2026-10-30T07:35:19.430498Z",
  "last_location_at": "2026-10-30T07:35:19.430498Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b338e460-3723-4bc3-b081-1988c88c39fc",
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
  "id": "fe6a5a42-3de7-411b-b552-f31d77a91c44",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:40:19.742082Z",
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
  "command_id": "a5e518de-7664-46cf-b9d6-5655089f399e",
  "quote_id": "fe6a5a42-3de7-411b-b552-f31d77a91c44",
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
  "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
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
  "created_at": "2026-10-30T07:35:20.046053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef` → **200**

```json
{
  "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
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
  "created_at": "2026-10-30T07:35:20.046053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef` → **200**

```json
{
  "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
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
  "created_at": "2026-10-30T07:35:20.046053Z",
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
    "id": "3bb5d0a2-92ae-45e9-a5e5-e5cae508c6e0",
    "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
    "expires_at": "2026-10-30T07:35:35.937542Z",
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

`POST /api/driver/v1/offers/3bb5d0a2-92ae-45e9-a5e5-e5cae508c6e0/accept` → **200**

```json
{
  "command_id": "25162342-c334-4a97-a5df-1340262261a6"
}
```

```json
{
  "id": "7024b3fb-e6cd-41b0-82c7-4d719e7431dc",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ed73713-2ff5-4029-b010-d2dc60423221",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3ed73713-2ff5-4029-b010-d2dc60423221",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "assignment_id": "7024b3fb-e6cd-41b0-82c7-4d719e7431dc",
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

`POST /api/rider/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/messages` → **201**

```json
{
  "command_id": "e7626673-eeee-41fe-b5ad-821e81b561a0",
  "body": "Я біля входу, мій номер +380735160453, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "b0ccb6ca-c948-43a5-a4d6-c7e8275cf18e",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735160453, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T07:35:22.820956438Z"
}
```

`POST /api/driver/v1/trips/3ed73713-2ff5-4029-b010-d2dc60423221/messages` → **201**

```json
{
  "command_id": "a6e21a40-7dd6-4711-b68d-f0ff539758ce",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "262fd872-1ccb-4229-b254-1c644909e5fd",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T07:35:23.14474545Z"
}
```

`POST /api/driver/v1/work-sessions/46532da4-44d4-473b-8001-2729e5eb274e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:35:23Z",
    "sequence": 1793345723431
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "46532da4-44d4-473b-8001-2729e5eb274e",
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
  "last_heartbeat_at": "2026-10-30T07:35:23.453698Z",
  "last_location_at": "2026-10-30T07:35:23.453698Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3ed73713-2ff5-4029-b010-d2dc60423221/arrive` → **200**

```json
{
  "command_id": "b991df05-1fad-46db-9ebb-2a72c15708e8",
  "expected_version": 0
}
```

```json
{
  "id": "3ed73713-2ff5-4029-b010-d2dc60423221",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "assignment_id": "7024b3fb-e6cd-41b0-82c7-4d719e7431dc",
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
  "arrived_at": "2026-10-30T07:35:23.750867Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3ed73713-2ff5-4029-b010-d2dc60423221/start` → **200**

```json
{
  "command_id": "33e83c27-ce2b-40b0-a8d4-a17bc23a4d6e",
  "expected_version": 1
}
```

```json
{
  "id": "3ed73713-2ff5-4029-b010-d2dc60423221",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "assignment_id": "7024b3fb-e6cd-41b0-82c7-4d719e7431dc",
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
  "arrived_at": "2026-10-30T07:35:23.750867Z",
  "started_at": "2026-10-30T07:35:24.065813Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/46532da4-44d4-473b-8001-2729e5eb274e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:35:24Z",
    "sequence": 1793345724377
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "46532da4-44d4-473b-8001-2729e5eb274e",
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
  "last_heartbeat_at": "2026-10-30T07:35:24.397522Z",
  "last_location_at": "2026-10-30T07:35:24.397522Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/3ed73713-2ff5-4029-b010-d2dc60423221/complete` → **200**

```json
{
  "command_id": "f740ecbe-518d-4092-a16b-9deeef82dd66",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:35:24Z",
  "cash_received": false
}
```

```json
{
  "id": "3ed73713-2ff5-4029-b010-d2dc60423221",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "assignment_id": "7024b3fb-e6cd-41b0-82c7-4d719e7431dc",
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
  "arrived_at": "2026-10-30T07:35:23.750867Z",
  "started_at": "2026-10-30T07:35:24.065813Z",
  "completed_at": "2026-10-30T07:35:24.692106Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef` → **200**

```json
{
  "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
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
    "id": "7024b3fb-e6cd-41b0-82c7-4d719e7431dc",
    "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3ed73713-2ff5-4029-b010-d2dc60423221",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:35:20.046053Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef` → **200**

```json
{
  "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
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
    "id": "7024b3fb-e6cd-41b0-82c7-4d719e7431dc",
    "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3ed73713-2ff5-4029-b010-d2dc60423221",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:35:20.046053Z",
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
  "session_id": "46532da4-44d4-473b-8001-2729e5eb274e",
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
  "last_heartbeat_at": "2026-10-30T07:35:24.397522Z",
  "last_location_at": "2026-10-30T07:35:24.397522Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/46532da4-44d4-473b-8001-2729e5eb274e/close` → **200**

```json
{
  "command_id": "71bb3e36-031f-482e-8df4-4a94d1d5dd9a",
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
  "session_id": "eae73666-fd23-46ee-b5d9-4a8fdb75839f",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2MjcsImlhdCI6MTc5MzM0NTcyNywianRpIjoiYjcwYTI0ZjgtMGJjYi00YTFiLWJhOTgtMjJlMDYzYTgxZTAzIiwic2lkIjoiZWFlNzM2NjYtZmQyMy00NmVlLWI1ZDktNGE4ZmRiNzU4MzlmIn0.kXTu-jYeeaI5YpaU5czHAUFd1EXF3VeSqngkvVjgc5A",
  "access_expires_at": "2026-10-30T07:50:27.46919002Z",
  "refresh_token": "cFqeZwW2NIf5hBEgW1XTcgOuktnAJ93mWOZ4kVEALsM",
  "refresh_expires_at": "2026-10-30T19:35:27.468659626Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b8c5f931-e69d-4065-845e-0618ca9e990d"
}
```

`GET /api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T07:35:28.057782751Z",
  "order": {
    "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
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
    "created_at": "2026-10-30T07:35:20.046053Z",
    "assigned_at": "2026-10-30T07:35:22.249548Z",
    "arrived_at": "2026-10-30T07:35:23.750867Z",
    "started_at": "2026-10-30T07:35:24.065813Z",
    "completed_at": "2026-10-30T07:35:24.692106Z"
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
    "id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
    "registered_at": "2026-10-30T07:35:17.567443Z",
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
      "created_at": "2026-10-30T07:35:20.048619Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T07:35:25.004938Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/chargebacks` → **422**

```json
{
  "command_id": "7909a314-c6fb-4f78-94e4-e6eca618c1d2",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "58f0cccb-6830-431f-adc5-eb191a74eead"
}
```

`POST /api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/chargebacks` → **201**

```json
{
  "command_id": "1aca4163-58a1-49dc-9c99-a5801db882df",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "57402e11-0562-4339-aa83-9106d2d44771",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T07:35:28.734497Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/chargebacks` → **201**

```json
{
  "command_id": "1aca4163-58a1-49dc-9c99-a5801db882df",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "57402e11-0562-4339-aa83-9106d2d44771",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T07:35:28.734497Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/a77aa66c-6c9e-470f-89d6-75ad9674e0aa` → **200**

```json
{
  "client": {
    "id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
    "phone": "+380735160453",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:35:17.567443Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T07:35:20.046053Z",
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

`POST /api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/chargebacks/57402e11-0562-4339-aa83-9106d2d44771/resolve` → **200**

```json
{
  "command_id": "6f78ff44-b730-4dd0-b64b-73aaf61f37d8",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "57402e11-0562-4339-aa83-9106d2d44771",
  "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T07:35:28.734497Z",
  "resolved_at": "2026-10-30T07:35:29.710665Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/a77aa66c-6c9e-470f-89d6-75ad9674e0aa` → **200**

```json
{
  "client": {
    "id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
    "phone": "+380735160453",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:35:17.567443Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T07:35:20.046053Z",
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

`GET /api/admin/v1/clients/a77aa66c-6c9e-470f-89d6-75ad9674e0aa` → **200**

```json
{
  "client": {
    "id": "a77aa66c-6c9e-470f-89d6-75ad9674e0aa",
    "phone": "+380735160453",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:35:17.567443Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T07:35:20.046053Z",
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

`POST /api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/chargebacks/57402e11-0562-4339-aa83-9106d2d44771/resolve` → **409**

```json
{
  "command_id": "064264df-3355-46c8-9d6d-6946c214e7ad",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/chargebacks/57402e11-0562-4339-aa83-9106d2d44771/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4a7546bd-ad17-4806-bdba-4aba47411dcc"
}
```

`GET /api/admin/v1/orders/be94cc68-3134-446b-b977-a3f9a5e5c5ef/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "57402e11-0562-4339-aa83-9106d2d44771",
      "order_id": "be94cc68-3134-446b-b977-a3f9a5e5c5ef",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T07:35:28.734497Z",
      "resolved_at": "2026-10-30T07:35:29.710665Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order be94cc68-3134-446b-b977-a3f9a5e5c5ef without phone or card digits; chargeback 57402e11-0562-4339-aa83-9106d2d44771 recorded and won.

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
  "session_id": "4bd2d7bc-268c-4932-8dd8-7a1c00eaba1f",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2MzIsImlhdCI6MTc5MzM0NTczMiwianRpIjoiYWU4MTA5ZTctNjIxMC00MWUzLTkxMjYtZmZjMTY2M2NiMzgwIiwic2lkIjoiNGJkMmQ3YmMtMjY4Yy00OTMyLThkZDgtN2ExYzAwZWFiYTFmIn0.TBroJKd481_sFH_lk45S_xOtlq6jbLB3M583t9T1EYQ",
  "access_expires_at": "2026-10-30T07:50:32.844663259Z",
  "refresh_token": "ZluGWB_XyG4WluV8sC14cQOXU4Xneq3ZzBj5I5rIy_M",
  "refresh_expires_at": "2026-10-30T19:35:32.844035333Z",
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
  "phone": "+48600003004",
  "device_ref": "sandbox-10543"
}
```

```json
{
  "challenge_id": "13aa587d-d873-4649-9b7c-cbe98117e130",
  "expires_at": "2026-10-30T07:40:33.738106293Z",
  "resend_available_at": "2026-10-30T07:35:34.738106293Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600003004` → **200**

```json
{
  "phone": "+48600003004",
  "audience": "CLIENT",
  "code": "953691",
  "sent_at": "2026-10-30T07:35:33.741048423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13aa587d-d873-4649-9b7c-cbe98117e130",
  "code": "953691",
  "device_ref": "sandbox-10543"
}
```

```json
{
  "session_id": "b3ef7fec-c9eb-4d61-b881-17188c6df61d",
  "subject": {
    "type": "CLIENT",
    "id": "3cf47c25-7736-4d06-a94f-7311070e2c87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzY2Y0N2MyNS03NzM2LTRkMDYtYTk0Zi03MzExMDcwZTJjODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjM0LCJpYXQiOjE3OTMzNDU3MzQsImp0aSI6ImUzYjJhZmEzLWZjMGItNDc0MS04ZjkyLTlmYjAyYmMyY2YyNSIsInNpZCI6ImIzZWY3ZmVjLWM5ZWItNGQ2MS1iODgxLTE3MTg4YzZkZjYxZCJ9.w2pgOqo6zvLuUlO96kI3oMiwZB-YYm3leMFISBvYJu0",
  "access_expires_at": "2026-10-30T07:50:34.056510702Z",
  "refresh_token": "ecrL70egEP8C3rTqyXq7xRCQP3U8c91wByAngqWWM_4",
  "refresh_expires_at": "2026-11-29T07:35:34.055957265Z",
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
  "command_id": "bbe02d2a-0056-425d-b6b5-ecb7b45f7669",
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
  "correlation_id": "3fcf1a3d-5626-49f1-b9f7-bc3e0244ced7",
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
  "command_id": "f8bde5ad-3095-4273-9190-9ed8bc2089b1",
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
  "paused_at": "2026-10-30T07:35:35.22188619Z",
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
  "command_id": "a84033ef-8954-4fab-827b-fbb75775bbe6",
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
  "id": "f76586e8-cecf-4646-a360-32efd3cb259a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:40:35.843636Z",
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
  "command_id": "6a0aa47d-7cea-4c78-936a-9e0b8450a743",
  "quote_id": "f76586e8-cecf-4646-a360-32efd3cb259a",
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
  "correlation_id": "ae6c864f-8d20-4b9f-870c-ad73c171c927"
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
  "paused_at": "2026-10-30T07:35:35.221886Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "e3551514-ae3e-406b-8def-c0900099449d",
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
  "command_id": "d85e241e-c7a2-4e61-8d9a-760d9d4b0f76",
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
  "command_id": "86171b6c-3522-436b-904c-9468865a0e9e",
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
  "id": "0bcf9858-dc04-465b-9d35-6c3ec5923503",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:40:37.648769Z",
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
  "command_id": "c00494b8-3ecb-4bb2-836e-fa306f09a858",
  "quote_id": "0bcf9858-dc04-465b-9d35-6c3ec5923503",
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
  "correlation_id": "35b3ff3f-e5a2-4070-8296-c868f0bdaad2"
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
  "command_id": "48d3d055-f156-4f86-beb9-bddfd108da69",
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
  "command_id": "c9240c99-eb79-4c95-bcdf-740e922b8e8a",
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
  "id": "8749e544-e59b-43b9-a44a-06416de8dfb0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:40:38.853661Z",
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
  "command_id": "c7fc2636-55af-49d4-b4d5-2646c4c085f0",
  "quote_id": "8749e544-e59b-43b9-a44a-06416de8dfb0",
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
  "correlation_id": "367a1eb4-5553-45b7-bb5f-4eeba207bb8c"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "175b87e8-9f5a-45a3-ae97-a8995a617fcb",
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
  "correlation_id": "10859768-b627-4faa-8b29-775e19ac9baf"
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
  "command_id": "65c9c1e6-707a-4643-998a-841a2d8fee5d",
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
  "phone": "+380673237454",
  "device_ref": "sandbox-28578"
}
```

```json
{
  "challenge_id": "1e9d75d3-0258-4720-bb00-09278ae389c7",
  "expires_at": "2026-10-30T07:40:40.410278484Z",
  "resend_available_at": "2026-10-30T07:35:41.410278484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673237454` → **200**

```json
{
  "phone": "+380673237454",
  "audience": "CLIENT",
  "code": "974945",
  "sent_at": "2026-10-30T07:35:40.413051847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e9d75d3-0258-4720-bb00-09278ae389c7",
  "code": "974945",
  "device_ref": "sandbox-28578"
}
```

```json
{
  "session_id": "f3b293fd-5e6d-40f9-b32b-bc601397a000",
  "subject": {
    "type": "CLIENT",
    "id": "dbe04d8e-98c4-4689-9213-527dd5a61a98"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmUwNGQ4ZS05OGM0LTQ2ODktOTIxMy01MjdkZDVhNjFhOTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjQwLCJpYXQiOjE3OTMzNDU3NDAsImp0aSI6IjE0NjdhYWQwLTA5NDUtNDJkYS05NmY1LTA4NzlkZGZiMWRjYSIsInNpZCI6ImYzYjI5M2ZkLTVlNmQtNDBmOS1iMzJiLWJjNjAxMzk3YTAwMCJ9.sX5wyZnbjkQ189WcQO7b80qm1aKNo04fr3-VGB2O1ME",
  "access_expires_at": "2026-10-30T07:50:40.728848984Z",
  "refresh_token": "r2cQ6svHKBZf1a7dcYn2a-_LwTuMnuge08Im7G-qxfQ",
  "refresh_expires_at": "2026-11-29T07:35:40.72831278Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "dbe04d8e-98c4-4689-9213-527dd5a61a98",
  "session_id": "f3b293fd-5e6d-40f9-b32b-bc601397a000",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8bfea50e-0b3e-49a6-bb3e-afdf3b672fd1",
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
  "id": "dd772dcf-3384-4d2e-8339-23bfc797c0af",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:40:41.362471Z",
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
  "challenge_id": "4fee1d92-b2a4-4530-87c3-daa422f8b8d0",
  "expires_at": "2026-10-30T07:40:43.664046597Z",
  "resend_available_at": "2026-10-30T07:35:44.664046597Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673237454` → **200**

```json
{
  "phone": "+380673237454",
  "audience": "CLIENT",
  "code": "642480",
  "sent_at": "2026-10-30T07:35:43.666581064Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "24c720de-41e1-4677-8a25-b50f82410529",
  "challenge_id": "4fee1d92-b2a4-4530-87c3-daa422f8b8d0",
  "otp_code": "642480"
}
```

```json
{
  "client_id": "dbe04d8e-98c4-4689-9213-527dd5a61a98",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T07:35:44.002633104Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "45d4445a-f76f-4e2a-8515-132e582b75ca",
  "quote_id": "dd772dcf-3384-4d2e-8339-23bfc797c0af",
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
  "correlation_id": "4a21abfa-047e-43e9-9db7-712cf965c44f"
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
  "session_id": "dd27694c-b984-483c-95b3-25279da84635",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2NDQsImlhdCI6MTc5MzM0NTc0NCwianRpIjoiM2QyODcxZjctMjY1MS00MjAzLWIzOTAtMzI2ODgzZjZhMWMzIiwic2lkIjoiZGQyNzY5NGMtYjk4NC00ODNjLTk1YjMtMjUyNzlkYTg0NjM1In0.IzfeV2IN7WBHUrXjcF6mRUWCuMkjCpfxBZTJQdOut_4",
  "access_expires_at": "2026-10-30T07:50:44.935154312Z",
  "refresh_token": "75CI-wkkBnwXRxNx5STxS7CrJz4Tj0ngnGBsZMmdnDI",
  "refresh_expires_at": "2026-10-30T19:35:44.934521218Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "dbe04d8e-98c4-4689-9213-527dd5a61a98",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T07:35:44.002633Z",
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

`POST /api/admin/v1/client-deletions/dbe04d8e-98c4-4689-9213-527dd5a61a98/complete` → **200**

```json
{
  "command_id": "0eaeb1f7-8649-46bb-9d20-9c3e64aef99f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "dbe04d8e-98c4-4689-9213-527dd5a61a98",
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
  "correlation_id": "a830660e-b27a-4e28-9511-aa7e2cf7c28a"
}
```

Done: client dbe04d8e-98c4-4689-9213-527dd5a61a98 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662385589",
  "device_ref": "sandbox-16558"
}
```

```json
{
  "challenge_id": "4bce52e4-dbf9-400c-b38d-dba97177c3d5",
  "expires_at": "2026-10-30T07:40:46.157030611Z",
  "resend_available_at": "2026-10-30T07:35:47.157030611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662385589` → **200**

```json
{
  "phone": "+380662385589",
  "audience": "CLIENT",
  "code": "228074",
  "sent_at": "2026-10-30T07:35:46.161303213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bce52e4-dbf9-400c-b38d-dba97177c3d5",
  "code": "228074",
  "device_ref": "sandbox-16558"
}
```

```json
{
  "session_id": "8a0d1ac3-d0fa-42df-b680-cf38b350fd02",
  "subject": {
    "type": "CLIENT",
    "id": "54fc283f-d324-4185-b50c-8d0c2b669d19"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NGZjMjgzZi1kMzI0LTQxODUtYjUwYy04ZDBjMmI2NjlkMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjQ2LCJpYXQiOjE3OTMzNDU3NDYsImp0aSI6ImM4MjAwMzk2LTQ5NWUtNDRlYi04YWNkLTc3NmUwNGM2YjJkOCIsInNpZCI6IjhhMGQxYWMzLWQwZmEtNDJkZi1iNjgwLWNmMzhiMzUwZmQwMiJ9.n5H08QXDoCyJMMyFGAyxXgkbs5xkCnR-qdM03DG2eKc",
  "access_expires_at": "2026-10-30T07:50:46.477766846Z",
  "refresh_token": "tobcxJZkvaUzf5WMKUrR3FeMCxfsMNwPTOSS5X89bTs",
  "refresh_expires_at": "2026-11-29T07:35:46.477284723Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "54fc283f-d324-4185-b50c-8d0c2b669d19",
  "session_id": "8a0d1ac3-d0fa-42df-b680-cf38b350fd02",
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
  "session_id": "55ea465d-ce9a-4d64-9ba5-95396c710478",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2NDcsImlhdCI6MTc5MzM0NTc0NywianRpIjoiNGEzMDdhZjMtOWE1MS00YzMxLWE0NjctOGQ5ZGRjMGQyMjM5Iiwic2lkIjoiNTVlYTQ2NWQtY2U5YS00ZDY0LTliYTUtOTUzOTZjNzEwNDc4In0.7SoRGoqzpj9VaJWkvV0Y4V9TwbEcoYTh0W8but3gies",
  "access_expires_at": "2026-10-30T07:50:47.349149715Z",
  "refresh_token": "hNVvO63fIBBnKmKqbP-T2BQ9YW8lVSMSPqHUCRnPRgU",
  "refresh_expires_at": "2026-10-30T19:35:47.348653155Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2385589&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "54fc283f-d324-4185-b50c-8d0c2b669d19",
      "phone": "+380662385589",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T07:35:46.475557Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/54fc283f-d324-4185-b50c-8d0c2b669d19` → **200**

```json
{
  "client": {
    "id": "54fc283f-d324-4185-b50c-8d0c2b669d19",
    "phone": "+380662385589",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:35:46.475557Z",
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

`POST /api/admin/v1/clients/54fc283f-d324-4185-b50c-8d0c2b669d19/block` → **400**

```json
{
  "command_id": "d7445ca5-afa7-46dd-bef3-8000b8774800",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/54fc283f-d324-4185-b50c-8d0c2b669d19/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8e7ba99c-8b74-4051-b5c7-a620e243ff39",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/54fc283f-d324-4185-b50c-8d0c2b669d19/block` → **200**

```json
{
  "command_id": "2379a99e-061f-497d-b00b-85eb97430032",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "54fc283f-d324-4185-b50c-8d0c2b669d19",
  "phone": "+380662385589",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T07:35:46.475557Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T07:35:48.586462Z",
    "by": "c4a173f9-11cd-4781-befc-d6722f2847c3"
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
  "correlation_id": "d1be3fb0-0a65-461f-951f-1d82e0e52571"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662385589",
  "device_ref": "sandbox-30998"
}
```

```json
{
  "challenge_id": "de5daddb-3d79-4396-aa97-69dda5001513",
  "expires_at": "2026-10-30T07:40:51.184552247Z",
  "resend_available_at": "2026-10-30T07:35:52.184552247Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662385589` → **200**

```json
{
  "phone": "+380662385589",
  "audience": "CLIENT",
  "code": "826011",
  "sent_at": "2026-10-30T07:35:51.187647942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "de5daddb-3d79-4396-aa97-69dda5001513",
  "code": "826011",
  "device_ref": "sandbox-30998"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "4019c1c4-2eff-4ade-964e-35c47006d05c"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/54fc283f-d324-4185-b50c-8d0c2b669d19` → **200**

```json
{
  "client": {
    "id": "54fc283f-d324-4185-b50c-8d0c2b669d19",
    "phone": "+380662385589",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T07:35:46.475557Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T07:35:48.586462Z",
      "by": "c4a173f9-11cd-4781-befc-d6722f2847c3"
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

`POST /api/admin/v1/clients/54fc283f-d324-4185-b50c-8d0c2b669d19/unblock` → **200**

```json
{
  "command_id": "1f08b5fc-c9f5-499e-9fc8-87010dd70ce7",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "54fc283f-d324-4185-b50c-8d0c2b669d19",
  "phone": "+380662385589",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T07:35:46.475557Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662385589",
  "device_ref": "sandbox-15918"
}
```

```json
{
  "challenge_id": "f6a5e5fd-55d9-4f67-8cff-f72ccc085b54",
  "expires_at": "2026-10-30T07:40:54.4034157Z",
  "resend_available_at": "2026-10-30T07:35:55.4034157Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662385589` → **200**

```json
{
  "phone": "+380662385589",
  "audience": "CLIENT",
  "code": "253864",
  "sent_at": "2026-10-30T07:35:54.406103424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6a5e5fd-55d9-4f67-8cff-f72ccc085b54",
  "code": "253864",
  "device_ref": "sandbox-15918"
}
```

```json
{
  "session_id": "6fd5bc57-3734-4231-b9ef-fccc3b754067",
  "subject": {
    "type": "CLIENT",
    "id": "54fc283f-d324-4185-b50c-8d0c2b669d19"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NGZjMjgzZi1kMzI0LTQxODUtYjUwYy04ZDBjMmI2NjlkMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjU0LCJpYXQiOjE3OTMzNDU3NTQsImp0aSI6IjA3N2E0YTA5LTRjOGEtNGU1MC1hYzJhLWYyNjQ1NGEwMmRjZiIsInNpZCI6IjZmZDViYzU3LTM3MzQtNDIzMS1iOWVmLWZjY2MzYjc1NDA2NyJ9.4e1M1I9eJTD917ukfGdDGuLe1CFWVjSamnI0wAsuld0",
  "access_expires_at": "2026-10-30T07:50:54.72801374Z",
  "refresh_token": "4f_cnu022Y7f9uoLrebLRdN01Uc2Y9ZG8HbLI4O-duo",
  "refresh_expires_at": "2026-11-29T07:35:54.727317298Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "54fc283f-d324-4185-b50c-8d0c2b669d19",
  "session_id": "6fd5bc57-3734-4231-b9ef-fccc3b754067",
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
  "phone": "+380664874334",
  "device_ref": "sandbox-30287"
}
```

```json
{
  "challenge_id": "703118e0-7dda-4881-ae5c-a6809b52a2d9",
  "expires_at": "2026-10-30T07:40:55.315733371Z",
  "resend_available_at": "2026-10-30T07:35:56.315733371Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664874334` → **200**

```json
{
  "phone": "+380664874334",
  "audience": "CLIENT",
  "code": "457617",
  "sent_at": "2026-10-30T07:35:55.318648029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "703118e0-7dda-4881-ae5c-a6809b52a2d9",
  "code": "457617",
  "device_ref": "sandbox-30287"
}
```

```json
{
  "session_id": "675b62d9-d2c4-4d01-95b4-26a04d6b1ba4",
  "subject": {
    "type": "CLIENT",
    "id": "c226cadc-5cf0-4dc7-8bda-69724f541900"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjI2Y2FkYy01Y2YwLTRkYzctOGJkYS02OTcyNGY1NDE5MDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjU1LCJpYXQiOjE3OTMzNDU3NTUsImp0aSI6IjQxODM0ZjM5LWQ4MGUtNGUwYi05NTY1LWY1ZDNhZjU2MDg4MyIsInNpZCI6IjY3NWI2MmQ5LWQyYzQtNGQwMS05NWI0LTI2YTA0ZDZiMWJhNCJ9.4czZUtaurYPUpcK-w59594Lm_IDv0oAaVl0GKM5kS5k",
  "access_expires_at": "2026-10-30T07:50:55.623413639Z",
  "refresh_token": "GVMN0MedD4ZRqizp-SFZZU8TPDof93Xk0sEqS89cX4g",
  "refresh_expires_at": "2026-11-29T07:35:55.6229017Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "50ec6c3b-79a3-4f66-8331-4bdb5ba50310",
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
  "id": "5d429ae2-99af-470f-912a-3915d3279169",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:40:55.917414Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 98a6522e-8c58-4f9c-9716-582bc2b75391) → **201**

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
  "session_id": "8b392d2d-3c16-4651-88d4-1776d6c204b6",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2NTYsImlhdCI6MTc5MzM0NTc1NiwianRpIjoiYWFiMjMzNDEtNTc4Yy00MWYwLTg3ZmYtNDVlZGMzMmVhN2YzIiwic2lkIjoiOGIzOTJkMmQtM2MxNi00NjUxLTg4ZDQtMTc3NmQ2YzIwNGI2In0.IH9Xb97l5aZQspgGkR3XsBhIbk_gstW-E3KBCc-GH0U",
  "access_expires_at": "2026-10-30T07:50:56.536176182Z",
  "refresh_token": "ieh9QoyT36VFu7UV5RMC0vllmMOzpULOQrs5lkb2RA8",
  "refresh_expires_at": "2026-10-30T19:35:56.535634247Z",
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
  "session_id": "b56aa961-6017-4513-b894-e9572eddf51c",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2NTcsImlhdCI6MTc5MzM0NTc1NywianRpIjoiY2FjZThjNmQtMTc1Ni00NTU2LWEyOTItMmExOTA1YTZlZmUyIiwic2lkIjoiYjU2YWE5NjEtNjAxNy00NTEzLWI4OTQtZTk1NzJlZGRmNTFjIn0.jnFhR2JOEVuGGG4xHc1_Q6MnCT72PSTFfdh9USQ4UvQ",
  "access_expires_at": "2026-10-30T07:50:57.111910053Z",
  "refresh_token": "1seXG-PBoEN7uLnskBnn4p3u6JLbFD7rROP_uSK6b0U",
  "refresh_expires_at": "2026-10-30T19:35:57.111376273Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9050eac2-6dea-40fa-ad8a-9e11e89fdb20/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:35:56.205457Z",
      "actor": {
        "type": "CLIENT",
        "id": "c226cadc-5cf0-4dc7-8bda-69724f541900",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20",
        "quote_id": "5d429ae2-99af-470f-912a-3915d3279169",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "98a6522e-8c58-4f9c-9716-582bc2b75391"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:35:56.207929Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20",
        "attempt_id": "fe2ce32b-75be-4bc8-9617-af07ec04b512",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "98a6522e-8c58-4f9c-9716-582bc2b75391"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T07:35:56.215102Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20",
        "attempt_id": "fe2ce32b-75be-4bc8-9617-af07ec04b512"
      },
      "correlation_id": "98a6522e-8c58-4f9c-9716-582bc2b75391"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "fe2ce32b-75be-4bc8-9617-af07ec04b512",
        "generation": 1,
        "started_at": "2026-10-30T07:35:56.206868Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T07:35:56.215102Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T07:35:56.208754Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/98a6522e-8c58-4f9c-9716-582bc2b75391` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20:0",
      "order_id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20",
      "at": "2026-10-30T07:35:56.205457Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20:1",
      "order_id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20",
      "at": "2026-10-30T07:35:56.207929Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20:2",
      "order_id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20",
      "at": "2026-10-30T07:35:56.215102Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/5e1cb7bd-4e65-487e-92bb-1b5aaf8156fd` → **200**

```json
{
  "found": []
}
```

Done: request 98a6522e-8c58-4f9c-9716-582bc2b75391 — order 9050eac2-6dea-40fa-ad8a-9e11e89fdb20 found by its id.

`GET /api/rider/v1/orders/9050eac2-6dea-40fa-ad8a-9e11e89fdb20` → **200**

```json
{
  "id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c226cadc-5cf0-4dc7-8bda-69724f541900",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:35:56.204861Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9050eac2-6dea-40fa-ad8a-9e11e89fdb20/cancel` → **200**

```json
{
  "command_id": "e20845c9-d847-4b95-8ecb-77114442d72d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9050eac2-6dea-40fa-ad8a-9e11e89fdb20",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c226cadc-5cf0-4dc7-8bda-69724f541900",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:35:56.204861Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "phone": "+380637808688",
  "device_ref": "sandbox-12711"
}
```

```json
{
  "challenge_id": "46f7ae7b-fad3-4d78-8364-d87cbe3b8e82",
  "expires_at": "2026-10-30T07:40:58.900756856Z",
  "resend_available_at": "2026-10-30T07:35:59.900756856Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637808688` → **200**

```json
{
  "phone": "+380637808688",
  "audience": "CLIENT",
  "code": "334385",
  "sent_at": "2026-10-30T07:35:58.903854007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46f7ae7b-fad3-4d78-8364-d87cbe3b8e82",
  "code": "334385",
  "device_ref": "sandbox-12711"
}
```

```json
{
  "session_id": "fdaa415f-5281-46bd-bce3-c775f66ba75f",
  "subject": {
    "type": "CLIENT",
    "id": "8789d829-fc77-4d3e-b011-f2cb804c0e0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Nzg5ZDgyOS1mYzc3LTRkM2UtYjAxMS1mMmNiODA0YzBlMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjU5LCJpYXQiOjE3OTMzNDU3NTksImp0aSI6IjQ4NGQ4M2MwLWJiM2MtNDY0OS05MmE0LTNmOWUxYmRiZTg1YyIsInNpZCI6ImZkYWE0MTVmLTUyODEtNDZiZC1iY2UzLWM3NzVmNjZiYTc1ZiJ9.0VkgbsM8YL444gTQ_E0PM2OzjAV8K72_qCe2utyrjV8",
  "access_expires_at": "2026-10-30T07:50:59.223376183Z",
  "refresh_token": "x2muEIZeVsvf5jPt-QvdkZNb0-cGZdz9q3G3isvmW6w",
  "refresh_expires_at": "2026-11-29T07:35:59.22280783Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "9ca85c11-36de-43d6-a0cf-dd44083737db",
  "expires_at": "2026-10-30T07:41:01.506639207Z",
  "resend_available_at": "2026-10-30T07:36:02.506639207Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637808688` → **200**

```json
{
  "phone": "+380637808688",
  "audience": "CLIENT",
  "code": "462371",
  "sent_at": "2026-10-30T07:36:01.509025889Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "c4c1c244-bdb2-414a-b259-ebe93b9e2127",
  "challenge_id": "9ca85c11-36de-43d6-a0cf-dd44083737db",
  "otp_code": "462371"
}
```

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "PENDING",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427` → **200**

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "PENDING",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427` → **200**

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "PENDING",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427` → **200**

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "PENDING",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427` → **200**

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "PENDING",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427` → **200**

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "PENDING",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427` → **200**

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "PENDING",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427` → **200**

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "PENDING",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427` → **200**

```json
{
  "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
  "state": "READY",
  "created_at": "2026-10-30T07:36:01.828281Z",
  "ready_at": "2026-10-30T07:36:10.876456Z",
  "expires_at": "2026-11-06T07:36:10.876456Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630664427",
  "device_ref": "sandbox-14414"
}
```

```json
{
  "challenge_id": "95e7cea5-9513-41af-aba2-494558ee3159",
  "expires_at": "2026-10-30T07:41:11.369957989Z",
  "resend_available_at": "2026-10-30T07:36:12.369957989Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630664427` → **200**

```json
{
  "phone": "+380630664427",
  "audience": "CLIENT",
  "code": "028883",
  "sent_at": "2026-10-30T07:36:11.373981002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95e7cea5-9513-41af-aba2-494558ee3159",
  "code": "028883",
  "device_ref": "sandbox-14414"
}
```

```json
{
  "session_id": "5063be49-3a68-4159-b20e-c9420de65e95",
  "subject": {
    "type": "CLIENT",
    "id": "37f7fb79-b408-479c-a51a-4b0a7577d86e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzN2Y3ZmI3OS1iNDA4LTQ3OWMtYTUxYS00YjBhNzU3N2Q4NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NjcxLCJpYXQiOjE3OTMzNDU3NzEsImp0aSI6IjVhZGUzNzBiLTJhOWQtNDRiZC05NzEzLTA1Njc2ZjU1N2U3YyIsInNpZCI6IjUwNjNiZTQ5LTNhNjgtNDE1OS1iMjBlLWM5NDIwZGU2NWU5NSJ9.pwniKsiFqEsP5AV33UvIU-I329BXK_8xtqHTBgpQGi4",
  "access_expires_at": "2026-10-30T07:51:11.678431157Z",
  "refresh_token": "nisPsQ5MIUfWVeoaAgHoYPF2o9AsGCWo19eGHRgUnWk",
  "refresh_expires_at": "2026-11-29T07:36:11.677874547Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/d064e3c1-e044-47de-a908-6d6dbab40427/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "646a6cf5-25a4-407c-b105-f63fbfb6c268"
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
  "session_id": "05fe0136-ba9f-47bd-9c90-b84ec04fa44f",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2NzIsImlhdCI6MTc5MzM0NTc3MiwianRpIjoiNzI1YzlhMWEtMjUxMy00YTgzLWI0N2YtN2I3ZGZjMTczMjcwIiwic2lkIjoiMDVmZTAxMzYtYmE5Zi00N2JkLTljOTAtYjg0ZWMwNGZhNDRmIn0.catdGDDfzROjMlToaN4ffk3gkA6_w9Ee7fM0U4qHJs4",
  "access_expires_at": "2026-10-30T07:51:12.54496199Z",
  "refresh_token": "9cTdJj60XFSNT5L4KKe780ClgDOy3OWvn9ufo2L88BI",
  "refresh_expires_at": "2026-10-30T19:36:12.54441176Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8789d829-fc77-4d3e-b011-f2cb804c0e0a",
  "session_id": "fdaa415f-5281-46bd-bce3-c775f66ba75f",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/8789d829-fc77-4d3e-b011-f2cb804c0e0a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "d064e3c1-e044-47de-a908-6d6dbab40427",
      "state": "READY",
      "created_at": "2026-10-30T07:36:01.828281Z",
      "ready_at": "2026-10-30T07:36:10.876456Z",
      "expires_at": "2026-11-06T07:36:10.876456Z",
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
  "device_ref": "sandbox-12323"
}
```

```json
{
  "challenge_id": "5d9ea3d9-5e2f-4c8b-b145-8a465ef49c1e",
  "expires_at": "2026-10-30T07:41:13.400490937Z",
  "resend_available_at": "2026-10-30T07:36:14.400490937Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "130697",
  "sent_at": "2026-10-30T07:36:13.403074344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d9ea3d9-5e2f-4c8b-b145-8a465ef49c1e",
  "code": "130697",
  "device_ref": "sandbox-12323"
}
```

```json
{
  "session_id": "209c0276-5b94-40fb-8d85-0e669dd9b331",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjY3MywiaWF0IjoxNzkzMzQ1NzczLCJqdGkiOiJjNTdhNjk4Ni0xNzE1LTQyYWItYThkNi02ODllNTQ1ZGFlOTgiLCJzaWQiOiIyMDljMDI3Ni01Yjk0LTQwZmItOGQ4NS0wZTY2OWRkOWIzMzEifQ.fLsZEcKYq2gBSz4SCii_l4GHLPpVolwPwnN9mRscdZA",
  "access_expires_at": "2026-10-30T07:51:13.706220203Z",
  "refresh_token": "QSV9fG2CcUgzxEtLFYAC5ePlNRlsZw1ZLE6eqr8pX70",
  "refresh_expires_at": "2026-11-29T07:36:13.705609349Z",
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
  "device_ref": "sandbox-8743"
}
```

```json
{
  "challenge_id": "ea9dcddc-94e6-4f80-8d1c-95c4379511da",
  "expires_at": "2026-10-30T07:41:14.256000884Z",
  "resend_available_at": "2026-10-30T07:36:15.256000884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "547083",
  "sent_at": "2026-10-30T07:36:14.258627552Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea9dcddc-94e6-4f80-8d1c-95c4379511da",
  "code": "547083",
  "device_ref": "sandbox-8743"
}
```

```json
{
  "session_id": "2e08597b-ccb9-4cf2-bb34-1dffc3e1b82f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjY3NCwiaWF0IjoxNzkzMzQ1Nzc0LCJqdGkiOiI0MzI0YmI0OS0wNGM1LTQ2MTYtODI1MS1hZDNkM2YzYTRkOGQiLCJzaWQiOiIyZTA4NTk3Yi1jY2I5LTRjZjItYmIzNC0xZGZmYzNlMWI4MmYifQ.loOpPJvsC4g3CLwi6efIVOufoACIRa-eNKwNWx-fkLo",
  "access_expires_at": "2026-10-30T07:51:14.56973186Z",
  "refresh_token": "sPrHp5XZYmLRPknYyT6BG74tpIl40sS3nlaGDYz_YmU",
  "refresh_expires_at": "2026-11-29T07:36:14.569015819Z",
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
  "command_id": "d39b58ee-529c-4b7f-a804-fac2e6cfe3aa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:15Z",
    "sequence": 1793345775168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2f16c5f8-3084-4f82-b34b-a886c0feeeb4",
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
  "last_heartbeat_at": "2026-10-30T07:36:15.189589Z",
  "last_location_at": "2026-10-30T07:36:15.189589Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-3083"
}
```

```json
{
  "challenge_id": "52cdce26-20c2-4195-a8ef-04dd0e3a58a2",
  "expires_at": "2026-10-30T07:41:15.476462607Z",
  "resend_available_at": "2026-10-30T07:36:16.476462607Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "448346",
  "sent_at": "2026-10-30T07:36:15.479748801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52cdce26-20c2-4195-a8ef-04dd0e3a58a2",
  "code": "448346",
  "device_ref": "sandbox-3083"
}
```

```json
{
  "session_id": "f83ed124-2073-4a60-acd0-9c00d06cb057",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjY3NSwiaWF0IjoxNzkzMzQ1Nzc1LCJqdGkiOiIzNGE0MWIxYy1hODQyLTRjOTYtOGZmZC1mZTk1NDRjYzgyMDAiLCJzaWQiOiJmODNlZDEyNC0yMDczLTRhNjAtYWNkMC05YzAwZDA2Y2IwNTcifQ.zgtoIWUgA4JIsPsCmaRhZ1444-QjMSNQ44GC5W3n0yw",
  "access_expires_at": "2026-10-30T07:51:15.788078697Z",
  "refresh_token": "SYL6yoCeutnD8AFgi0xgoOawqVKhfVNB5hFJx9c7lQc",
  "refresh_expires_at": "2026-11-29T07:36:15.787544457Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "25677e3a-2a60-4249-9b9f-a1a138f7c7b6",
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
  "last_heartbeat_at": "2026-10-30T07:34:36.349718Z",
  "last_location_at": "2026-10-30T07:34:36.349718Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/25677e3a-2a60-4249-9b9f-a1a138f7c7b6/handover` → **200**

```json
{
  "command_id": "53395ff6-13e2-4303-bc7d-e1b457e72e47",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "25677e3a-2a60-4249-9b9f-a1a138f7c7b6",
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
  "last_heartbeat_at": "2026-10-30T07:34:36.349718Z",
  "last_location_at": "2026-10-30T07:34:36.349718Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/25677e3a-2a60-4249-9b9f-a1a138f7c7b6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:16Z",
    "sequence": 1793345776658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "25677e3a-2a60-4249-9b9f-a1a138f7c7b6",
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
  "last_heartbeat_at": "2026-10-30T07:36:16.6777Z",
  "last_location_at": "2026-10-30T07:36:16.6777Z",
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
  "session_id": "917bcc3a-d4bb-41ba-aa22-a5f6275ffb7c",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2NzcsImlhdCI6MTc5MzM0NTc3NywianRpIjoiYjE3NmM5OTMtM2Q5OS00OWRhLThhM2UtZTg2NjAwNTE5Y2IxIiwic2lkIjoiOTE3YmNjM2EtZDRiYi00MWJhLWFhMjItYTVmNjI3NWZmYjdjIn0.Klcw7D-7oKEpkRD1TPK6wj_BWQ3_FuHJLP61vUg9sMo",
  "access_expires_at": "2026-10-30T07:51:17.248429648Z",
  "refresh_token": "jKSPAOvIS50bNwrwnCIk45uznUHCZmqGVbTshgK4qZQ",
  "refresh_expires_at": "2026-10-30T19:36:17.247840755Z",
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
  "session_id": "47309d46-1287-4a06-9241-683243b168ce",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2NzcsImlhdCI6MTc5MzM0NTc3NywianRpIjoiYmFhYWYxMDAtNjM3Zi00ZDBjLTkzYmYtZjBlYTNmZDMwOTNiIiwic2lkIjoiNDczMDlkNDYtMTI4Ny00YTA2LTkyNDEtNjgzMjQzYjE2OGNlIn0.FlYFY9fTYN2UvU0DrlW6ThZs1tLvUV7pBl45-msVC-0",
  "access_expires_at": "2026-10-30T07:51:17.821809201Z",
  "refresh_token": "m0bK3QKRuwbDxCZzKHj5xG2eznAN7hsbcylMFcb516s",
  "refresh_expires_at": "2026-10-30T19:36:17.821245145Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685381326",
  "device_ref": "sandbox-16378"
}
```

```json
{
  "challenge_id": "d81caf25-90de-45f4-959f-a0b8f60a3b52",
  "expires_at": "2026-10-30T07:41:18.108352265Z",
  "resend_available_at": "2026-10-30T07:36:19.108352265Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380685381326` → **200**

```json
{
  "phone": "+380685381326",
  "audience": "CLIENT",
  "code": "397574",
  "sent_at": "2026-10-30T07:36:18.111686198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d81caf25-90de-45f4-959f-a0b8f60a3b52",
  "code": "397574",
  "device_ref": "sandbox-16378"
}
```

```json
{
  "session_id": "81b3bb92-dc5d-4467-9341-43cec0f4dcab",
  "subject": {
    "type": "CLIENT",
    "id": "1a861f42-af55-4bcc-885d-bad36fa48fec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTg2MWY0Mi1hZjU1LTRiY2MtODg1ZC1iYWQzNmZhNDhmZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2Njc4LCJpYXQiOjE3OTMzNDU3NzgsImp0aSI6IjQwNzcxM2UxLWFkZmMtNDIwYS1hNzI0LWIzOGQ3ZTBkNTRkMSIsInNpZCI6IjgxYjNiYjkyLWRjNWQtNDQ2Ny05MzQxLTQzY2VjMGY0ZGNhYiJ9.wuLB4JBkIzeJ1FH-V__pX-2J7Un3MK3DM1niqNbwVV8",
  "access_expires_at": "2026-10-30T07:51:18.429837674Z",
  "refresh_token": "hLWvmEdr_vCQ92_G7mTnSLOgMtkLI_63HRawXZ-ZuFM",
  "refresh_expires_at": "2026-11-29T07:36:18.429308373Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ecd88474-eddb-4ef0-9a89-1bd555a471db",
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
  "id": "42a9b031-db94-41ed-8496-43b5d4d7870e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:41:18.715963Z",
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
  "command_id": "1f637c00-4a50-40af-83ee-8e26ff0f9d0d",
  "quote_id": "42a9b031-db94-41ed-8496-43b5d4d7870e",
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
  "id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a861f42-af55-4bcc-885d-bad36fa48fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:36:19.00532Z",
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
    "id": "6ecd0d7d-b8ea-4bfd-9feb-8d2c8633ab25",
    "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
    "expires_at": "2026-10-30T07:36:34.008317Z",
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

`POST /api/driver/v1/offers/6ecd0d7d-b8ea-4bfd-9feb-8d2c8633ab25/reject` → **204**

```json
{
  "command_id": "1c33d405-ebbf-423e-baec-0ef1c4b751b6"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e6a3ec24-cfd9-482f-8ac3-d39ca95f4ba9",
    "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
    "expires_at": "2026-10-30T07:36:34.615169Z",
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

`POST /api/driver/v1/offers/e6a3ec24-cfd9-482f-8ac3-d39ca95f4ba9/accept` → **200**

```json
{
  "command_id": "0a7602c2-ff34-4e08-9146-473befc26387"
}
```

```json
{
  "id": "03d7af62-5860-47ad-a7ba-ce8dd04ab572",
  "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1e3edbd0-a1fc-4012-aba6-f25313fc1273",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/9b94dcb9-d489-4d47-91dd-980fe948528a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:36:19.005742Z",
      "actor": {
        "type": "CLIENT",
        "id": "1a861f42-af55-4bcc-885d-bad36fa48fec",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
        "quote_id": "42a9b031-db94-41ed-8496-43b5d4d7870e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b3b9c8b5-34cb-410d-ae30-dabcfd5cb653"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:36:19.007558Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
        "attempt_id": "e444f98d-6a5b-485c-9e44-de74bc47b692",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b3b9c8b5-34cb-410d-ae30-dabcfd5cb653"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T07:36:19.010282Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6ecd0d7d-b8ea-4bfd-9feb-8d2c8633ab25",
        "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "b3b9c8b5-34cb-410d-ae30-dabcfd5cb653"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T07:36:19.613616Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6ecd0d7d-b8ea-4bfd-9feb-8d2c8633ab25",
        "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a"
      },
      "correlation_id": "ffc9b333-89fb-4811-bd11-a123672a08d2"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 9b94dcb9-d489-4d47-91dd-980fe948528a — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/9b94dcb9-d489-4d47-91dd-980fe948528a` → **200**

```json
{
  "id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1a861f42-af55-4bcc-885d-bad36fa48fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "03d7af62-5860-47ad-a7ba-ce8dd04ab572",
    "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1e3edbd0-a1fc-4012-aba6-f25313fc1273",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T07:36:19.00532Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9b94dcb9-d489-4d47-91dd-980fe948528a/cancel` → **200**

```json
{
  "command_id": "58957779-46d5-40a8-ae79-29183245e4a3",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1a861f42-af55-4bcc-885d-bad36fa48fec",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "03d7af62-5860-47ad-a7ba-ce8dd04ab572",
    "order_id": "9b94dcb9-d489-4d47-91dd-980fe948528a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1e3edbd0-a1fc-4012-aba6-f25313fc1273",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T07:36:19.00532Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "session_id": "2f16c5f8-3084-4f82-b34b-a886c0feeeb4",
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
  "last_heartbeat_at": "2026-10-30T07:36:15.189589Z",
  "last_location_at": "2026-10-30T07:36:15.189589Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2f16c5f8-3084-4f82-b34b-a886c0feeeb4/close` → **200**

```json
{
  "command_id": "0144cd7b-8092-48d9-a457-55716b42ff75",
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
  "session_id": "25677e3a-2a60-4249-9b9f-a1a138f7c7b6",
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
  "last_heartbeat_at": "2026-10-30T07:36:16.6777Z",
  "last_location_at": "2026-10-30T07:36:16.6777Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/25677e3a-2a60-4249-9b9f-a1a138f7c7b6/close` → **200**

```json
{
  "command_id": "2370a44b-1435-4ed6-b29d-19b562a8bc3c",
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
  "session_id": "16bcaba4-3afb-46f5-b2ca-efe1624acfb0",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY2ODIsImlhdCI6MTc5MzM0NTc4MiwianRpIjoiYjc5ZGY4ODktNTA2NC00Y2FkLTgxNjgtZTljYTc3YWNjNzQ1Iiwic2lkIjoiMTZiY2FiYTQtM2FmYi00NmY1LWIyY2EtZWZlMTYyNGFjZmIwIn0.JCd1yrKafVGMhhDZsK61x_Osxau-ZK9YaB-eSP_PHhk",
  "access_expires_at": "2026-10-30T07:51:22.692169901Z",
  "refresh_token": "QKRIIopIpo0-9mCYbfHDjrGqAUP5WReOSy721_S9hiQ",
  "refresh_expires_at": "2026-10-30T19:36:22.69137352Z",
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
  "command_id": "89b58738-1b3e-4def-b83e-a4850b2857b7",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T07:36:23.30522Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "4e5b579f-8d1b-4a13-972b-af87c60c89dd",
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
  "correlation_id": "375b2063-cc36-4c62-a0b9-1de1c371a710"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "f77b7a6f-26b7-4829-a86e-98b521133f6a",
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
  "correlation_id": "33889959-bf96-40e1-920c-3ffc252a3402"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630176196",
  "device_ref": "sandbox-8737"
}
```

```json
{
  "challenge_id": "640cfdbc-900e-424d-8fa3-595a7306e284",
  "expires_at": "2026-10-30T07:41:24.216399265Z",
  "resend_available_at": "2026-10-30T07:36:25.216399265Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630176196` → **200**

```json
{
  "phone": "+380630176196",
  "audience": "CLIENT",
  "code": "992324",
  "sent_at": "2026-10-30T07:36:24.220289406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "640cfdbc-900e-424d-8fa3-595a7306e284",
  "code": "992324",
  "device_ref": "sandbox-8737"
}
```

```json
{
  "session_id": "415a87d9-b3b3-48dd-a7a8-1660e25d5a7f",
  "subject": {
    "type": "CLIENT",
    "id": "4a46417e-8216-4c98-a20b-31b58a742a84"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTQ2NDE3ZS04MjE2LTRjOTgtYTIwYi0zMWI1OGE3NDJhODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2Njg0LCJpYXQiOjE3OTMzNDU3ODQsImp0aSI6ImZiYTM3ZWEwLWFiYTgtNDUzZC04MDkxLTgyMjZkOGE2M2Q3MSIsInNpZCI6IjQxNWE4N2Q5LWIzYjMtNDhkZC1hN2E4LTE2NjBlMjVkNWE3ZiJ9.OUN_pXQnbaTtAWL6_uFmQbPUD0lb7l18Li3IivBN4rs",
  "access_expires_at": "2026-10-30T07:51:24.542690724Z",
  "refresh_token": "VZa3aWqamatzXO-xVmo2OK5LXpyHI8xzvz2cJ1GHpvs",
  "refresh_expires_at": "2026-11-29T07:36:24.542152416Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0d8e7311-3d43-493b-817f-ec16d7b2c564",
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
  "id": "db2cfdd7-48a0-4d4a-8863-30c74b717c32",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:41:24.841957Z",
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
  "command_id": "4004949d-cc7b-482e-87ff-8fd95e7cea5f",
  "quote_id": "db2cfdd7-48a0-4d4a-8863-30c74b717c32",
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
  "correlation_id": "38e4c0c4-62ac-4d47-9e1e-6e54b012ecbb"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7438b384-ec20-4b6f-99ca-65c5e6eacae3",
  "quote_id": "db2cfdd7-48a0-4d4a-8863-30c74b717c32",
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
  "id": "238086de-d04a-41bf-a488-4367f96d381d",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4a46417e-8216-4c98-a20b-31b58a742a84",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:36:25.456636Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/238086de-d04a-41bf-a488-4367f96d381d/cancel` → **200**

```json
{
  "command_id": "891ab21a-3875-4bba-a26b-5c18072415ea",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "238086de-d04a-41bf-a488-4367f96d381d",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4a46417e-8216-4c98-a20b-31b58a742a84",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:36:25.456636Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "command_id": "46efce7e-ef76-46fb-bf70-44be5e7e6cca",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T07:36:26.085643Z"
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
      "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T07:36:26.085643Z"
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
  "device_ref": "sandbox-6176"
}
```

```json
{
  "challenge_id": "6262d3b4-4d02-464c-8ed8-6542ebb72ee7",
  "expires_at": "2026-10-30T07:41:26.978708153Z",
  "resend_available_at": "2026-10-30T07:36:27.978708153Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "350292",
  "sent_at": "2026-10-30T07:36:26.982149517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6262d3b4-4d02-464c-8ed8-6542ebb72ee7",
  "code": "350292",
  "device_ref": "sandbox-6176"
}
```

```json
{
  "session_id": "2aa0d564-1bf7-42ce-a5bb-f34a2e79b124",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjY4NywiaWF0IjoxNzkzMzQ1Nzg3LCJqdGkiOiI0YjIzZmFiOC0zODZmLTQ3M2YtYThkNi0yMWNjM2Q4YzI5YjgiLCJzaWQiOiIyYWEwZDU2NC0xYmY3LTQyY2UtYTViYi1mMzRhMmU3OWIxMjQifQ.ARY8m0LigxabGlUqOD7bCaCdYZgPmUrr7UNHATQGUus",
  "access_expires_at": "2026-10-30T07:51:27.29273649Z",
  "refresh_token": "mtg4PAas1AZzVHazcch9DFK0qSEnvwbp2Lcj5sl8aqo",
  "refresh_expires_at": "2026-11-29T07:36:27.292177272Z",
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
  "command_id": "8115a8ba-5e07-4bab-8be8-3bfc50975369",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:27Z",
    "sequence": 1793345787867
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:27.886624Z",
  "last_location_at": "2026-10-30T07:36:27.886624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674918063",
  "device_ref": "sandbox-28977"
}
```

```json
{
  "challenge_id": "7904d510-8537-46fc-91ea-3040dd2ae7e1",
  "expires_at": "2026-10-30T07:41:28.194068423Z",
  "resend_available_at": "2026-10-30T07:36:29.194068423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674918063` → **200**

```json
{
  "phone": "+380674918063",
  "audience": "CLIENT",
  "code": "050307",
  "sent_at": "2026-10-30T07:36:28.197552654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7904d510-8537-46fc-91ea-3040dd2ae7e1",
  "code": "050307",
  "device_ref": "sandbox-28977"
}
```

```json
{
  "session_id": "132a6da0-399b-48ea-ab24-68e5a794db9b",
  "subject": {
    "type": "CLIENT",
    "id": "84e2715a-1296-4053-b69a-e01074c48fd2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGUyNzE1YS0xMjk2LTQwNTMtYjY5YS1lMDEwNzRjNDhmZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2Njg4LCJpYXQiOjE3OTMzNDU3ODgsImp0aSI6IjY0OWNmOWRjLTgwZDYtNGFkMi04OGYwLTU2MDgxMWQzZmQxMyIsInNpZCI6IjEzMmE2ZGEwLTM5OWItNDhlYS1hYjI0LTY4ZTVhNzk0ZGI5YiJ9.ldI2INzjEM5z02mP47vfcD2_ipxz-V-IGcdjl-QOyqY",
  "access_expires_at": "2026-10-30T07:51:28.505219564Z",
  "refresh_token": "53PnK4jS-kYeStgUUJXkDuCPPeIOfhAfgyNkgk1KsaY",
  "refresh_expires_at": "2026-11-29T07:36:28.504566782Z",
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
  "command_id": "1ae731e2-bb95-4008-8a0e-d5884a53dbaf",
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
  "id": "b1032289-c6e6-4807-9c3f-2ddbd4a4d0b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:41:29.074012Z",
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
  "command_id": "f8e3820e-68cc-4851-a0b9-ec9ced203408",
  "platform": "ANDROID",
  "token": "sandbox-driver-a023bd77-0d57-43f5-b070-af4eeebddede"
}
```

```json
{
  "id": "1be29ec9-5c8b-4d40-a89c-532893a9b7a9",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T07:36:29.37092Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ba0e0826-26a6-4afb-8063-6cfd7c239622",
  "platform": "ANDROID",
  "token": "sandbox-rider-443156d5-f099-4b0a-a02f-6f9187fbb217"
}
```

```json
{
  "id": "daac5d9b-ff33-4df7-887f-88142cee28e8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T07:36:29.666394Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7b237b26-2893-49d9-afd1-49d35f7e2f48",
  "quote_id": "b1032289-c6e6-4807-9c3f-2ddbd4a4d0b9",
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
  "id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "84e2715a-1296-4053-b69a-e01074c48fd2",
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
  "created_at": "2026-10-30T07:36:29.951983Z",
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
    "id": "2eed2e11-0efa-4881-9045-33530684f640",
    "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
    "expires_at": "2026-10-30T07:36:44.955158Z",
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

`POST /api/driver/v1/offers/2eed2e11-0efa-4881-9045-33530684f640/accept` → **200**

```json
{
  "command_id": "dc652714-3cf6-47cc-8ff8-8defc529faf2"
}
```

```json
{
  "id": "60b226cd-07d1-4d90-a90d-a147ea77585e",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7cde5be4-91db-4a14-8b00-677d0af3a4fc",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T07:36:29.927Z` → **200**

```json
[
  {
    "at": "2026-10-30T07:36:30.442273693Z",
    "token_suffix": "bddede",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "92940148-149c-4ab5-b017-7928790e9065",
      "order_version": "2",
      "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674918063&after=2026-10-30T07:36:29.927Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380674918063&after=2026-10-30T07:36:29.927Z` → **200**

```json
[
  {
    "at": "2026-10-30T07:36:31.447630726Z",
    "token_suffix": "fbb217",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "bfdb7367-cf2e-4271-bae8-c6a36308f06e",
      "order_version": "3",
      "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/31f2b65c-811a-4c9b-adbd-155fd48b74c9/messages` → **201**

```json
{
  "command_id": "66f9f9ff-5f21-45c7-a78e-a00ad1539c5d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "a4c05d65-7ca4-4e47-87b2-dd7b0385d2db",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T07:36:31.933452504Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7cde5be4-91db-4a14-8b00-677d0af3a4fc",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "assignment_id": "60b226cd-07d1-4d90-a90d-a147ea77585e",
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

`POST /api/driver/v1/trips/7cde5be4-91db-4a14-8b00-677d0af3a4fc/messages` → **201**

```json
{
  "command_id": "dd2eb4df-fbab-48cc-9e7b-b572991937a4",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "2a75a25a-3a69-4aeb-a64d-7b1bafa00598",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T07:36:32.50344028Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/31f2b65c-811a-4c9b-adbd-155fd48b74c9/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/7cde5be4-91db-4a14-8b00-677d0af3a4fc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674918063"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/d7f62973-0283-4687-8efa-c3c72eae54e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:33Z",
    "sequence": 1793345793352
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:33.372404Z",
  "last_location_at": "2026-10-30T07:36:33.372404Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7cde5be4-91db-4a14-8b00-677d0af3a4fc",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "assignment_id": "60b226cd-07d1-4d90-a90d-a147ea77585e",
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

`POST /api/driver/v1/trips/7cde5be4-91db-4a14-8b00-677d0af3a4fc/arrive` → **200**

```json
{
  "command_id": "8443dc81-769f-4cdf-ac3e-98d35de062e7",
  "expected_version": 0
}
```

```json
{
  "id": "7cde5be4-91db-4a14-8b00-677d0af3a4fc",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "assignment_id": "60b226cd-07d1-4d90-a90d-a147ea77585e",
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
  "arrived_at": "2026-10-30T07:36:33.937376Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7cde5be4-91db-4a14-8b00-677d0af3a4fc/start` → **200**

```json
{
  "command_id": "dc60a4c2-d268-496e-91e6-2091e385cffd",
  "expected_version": 1
}
```

```json
{
  "id": "7cde5be4-91db-4a14-8b00-677d0af3a4fc",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "assignment_id": "60b226cd-07d1-4d90-a90d-a147ea77585e",
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
  "arrived_at": "2026-10-30T07:36:33.937376Z",
  "started_at": "2026-10-30T07:36:34.226263Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d7f62973-0283-4687-8efa-c3c72eae54e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:34Z",
    "sequence": 1793345794521
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:34.54102Z",
  "last_location_at": "2026-10-30T07:36:34.54102Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/7cde5be4-91db-4a14-8b00-677d0af3a4fc/complete` → **200**

```json
{
  "command_id": "211679c4-71fe-49c1-b96d-e211e176c58c",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:36:34Z",
  "cash_received": true
}
```

```json
{
  "id": "7cde5be4-91db-4a14-8b00-677d0af3a4fc",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "assignment_id": "60b226cd-07d1-4d90-a90d-a147ea77585e",
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
  "arrived_at": "2026-10-30T07:36:33.937376Z",
  "started_at": "2026-10-30T07:36:34.226263Z",
  "completed_at": "2026-10-30T07:36:34.842553Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/31f2b65c-811a-4c9b-adbd-155fd48b74c9` → **200**

```json
{
  "id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "84e2715a-1296-4053-b69a-e01074c48fd2",
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
    "id": "60b226cd-07d1-4d90-a90d-a147ea77585e",
    "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7cde5be4-91db-4a14-8b00-677d0af3a4fc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:36:29.951983Z",
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
    "id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T07:36:29.951983Z",
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
    "id": "7cde5be4-91db-4a14-8b00-677d0af3a4fc",
    "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
    "order_short_number": 13,
    "created_at": "2026-10-30T07:36:30.557299Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3b2bcf33-0572-455a-ab83-e2f5b709729e",
    "order_id": "77d39da4-e622-4a3f-af56-8e432ec4a670",
    "order_short_number": 8,
    "created_at": "2026-10-30T07:35:11.400228Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1ec057ea-46e3-431b-853f-ad64148a5939",
    "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
    "order_short_number": 3,
    "created_at": "2026-10-30T07:34:25.741733Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3e516871-50ca-420b-ac9f-64d1a2b1e6cc",
    "order_id": "4e16ae2a-5286-4cfa-945d-3d25411f0adb",
    "order_short_number": 2,
    "created_at": "2026-10-30T07:34:08.229051Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ecb4b19d-8dec-483c-8763-3e45efef4824",
    "order_id": "80b9ee38-a379-4223-abf7-5af9f7cf8563",
    "order_short_number": 1,
    "created_at": "2026-10-30T07:33:58.035734Z",
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

`GET /api/rider/v1/orders/31f2b65c-811a-4c9b-adbd-155fd48b74c9/tip` → **200**

```json
{
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
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
  "available_until": "2026-10-31T07:36:34.842553Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/31f2b65c-811a-4c9b-adbd-155fd48b74c9/tip` → **201**

```json
{
  "command_id": "793c8078-ca0f-4ba8-983d-2fa73032dba6",
  "amount_minor": 1100
}
```

```json
{
  "id": "76848b57-2d8d-41b4-86e9-54340e805e4b",
  "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T07:36:39.932906Z"
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
  "session_id": "6d406050-f595-45a2-b767-b1ae56ba951d",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MDAsImlhdCI6MTc5MzM0NTgwMCwianRpIjoiNzAzMWI0Y2YtZTNjNC00MTU5LWE0NTctOTk5ZTRiYmRmOTAwIiwic2lkIjoiNmQ0MDYwNTAtZjU5NS00NWEyLWI3NjctYjFhZTU2YmE5NTFkIn0.oxBhEx35CL_3aiJO9oMpwnyQIyANUIEOt9RjIEUm3ak",
  "access_expires_at": "2026-10-30T07:51:40.519527131Z",
  "refresh_token": "t5quzneWYqosiRo3kukJXfCxE-GSBPlGLmX-5wy-29k",
  "refresh_expires_at": "2026-10-30T19:36:40.518942807Z",
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
  "generated_at": "2026-10-30T07:36:40.799147347Z"
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
  "generated_at": "2026-10-30T07:36:41.097359811Z"
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
  "session_id": "319846d4-c43b-46f6-a683-1ec3fd253f64",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MDEsImlhdCI6MTc5MzM0NTgwMSwianRpIjoiMTQ0ZjlkYmItZjM0Ni00Y2ZkLTk3MWUtMjkxOTIxYWUzYTcyIiwic2lkIjoiMzE5ODQ2ZDQtYzQzYi00NmY2LWE2ODMtMWVjM2ZkMjUzZjY0In0.QBXDecNGI9gC1Y2oQsWCzLX4sVzvNFbkBcuPxAzhaCA",
  "access_expires_at": "2026-10-30T07:51:41.672675098Z",
  "refresh_token": "YQFKupcK26MHvQxJDkfX0-aq-CueZxMqZrLLItLpJas",
  "refresh_expires_at": "2026-10-30T19:36:41.672156357Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/31f2b65c-811a-4c9b-adbd-155fd48b74c9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:36:29.952481Z",
      "actor": {
        "type": "CLIENT",
        "id": "84e2715a-1296-4053-b69a-e01074c48fd2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
        "quote_id": "b1032289-c6e6-4807-9c3f-2ddbd4a4d0b9",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "bd5d3f1c-1685-46d6-a1c1-3e7ce636eba7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:36:29.954441Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
        "attempt_id": "7311b18e-fe87-4624-9342-2bf3b576d65c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "bd5d3f1c-1685-46d6-a1c1-3e7ce636eba7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T07:36:29.957238Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2eed2e11-0efa-4881-9045-33530684f640",
        "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "bd5d3f1c-1685-46d6-a1c1-3e7ce636eba7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T07:36:30.559111Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2eed2e11-0efa-4881-9045-33530684f640",
        "order_id": "31f2b65c-811a-4c9b-adbd-155fd48b74c9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "60b226cd-07d1-4d90-a90d-a147ea77585e"
      },
      "correlation_id": "5efee54a-cc3d-41c9-8c08-f1c27732bf54"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T07:36:42.256553228Z",
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
      "last_location_at": "2026-10-30T07:36:34.54102Z",
      "order_id": null
    }
  ]
}
```

Done: order 31f2b65c-811a-4c9b-adbd-155fd48b74c9.

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
  "session_id": "a3cf581d-fceb-4b47-9f07-12ef3e9f3371",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MDIsImlhdCI6MTc5MzM0NTgwMiwianRpIjoiOWExZWM0ZTUtMGNmYS00NGY2LThmN2MtMTk0NzFjNjg4MmEyIiwic2lkIjoiYTNjZjU4MWQtZmNlYi00YjQ3LTlmMDctMTJlZjNlOWYzMzcxIn0.Lid14WfurPbjDy7dyoDVVa7U-iueW7H03Qm4BPJ4sbo",
  "access_expires_at": "2026-10-30T07:51:42.854685104Z",
  "refresh_token": "W-eU5bwYmvngA1VKs-vTynJVP7BtbeX5lrhTjYUT654",
  "refresh_expires_at": "2026-10-30T19:36:42.854113286Z",
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
  "command_id": "37f2a4c5-9e06-42fc-8e29-9363ba00c354",
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
  "timestamp": "2026-10-30T07:36:43.000+0000",
  "channel": {
    "id": "1730052000.1405023257",
    "linkedid": "1730052000.1405023257",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679345055"
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
  "timestamp": "2026-10-30T07:36:43.000+0000",
  "channel": {
    "id": "1730052000.1405023257",
    "linkedid": "1730052000.1405023257",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679345055"
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
  "session_id": "5fa39783-57da-4ef1-9034-32155af7302d",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MDQsImlhdCI6MTc5MzM0NTgwNCwianRpIjoiNzdlNTYwMTItZDk3Yy00MDliLWJhYTEtZTIwODRiYjE2ZjA0Iiwic2lkIjoiNWZhMzk3ODMtNTdkYS00ZWYxLTkwMzQtMzIxNTVhZjczMDJkIn0.3ZfzHMAcDFHrUTH_EdifcaqsRPQ-vrr8OgUTfDISZC8",
  "access_expires_at": "2026-10-30T07:51:44.034217835Z",
  "refresh_token": "PIG0bugPglgTNXs7Xz50XO-hoCTj8mcxe_8WktG0BPM",
  "refresh_expires_at": "2026-10-30T19:36:44.033703742Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "688bb03a-1652-479b-8c42-16f7d8f04ae1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679345055",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T07:36:43Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/688bb03a-1652-479b-8c42-16f7d8f04ae1/answer` → **200**

```json
{
  "command_id": "e535a929-694e-4ede-b7ec-9efd06387c47"
}
```

```json
{
  "id": "688bb03a-1652-479b-8c42-16f7d8f04ae1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679345055",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "order_ids": [],
  "started_at": "2026-10-30T07:36:43Z",
  "answered_at": "2026-10-30T07:36:44.618486Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1405023257",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "feb6f336-bd80-4761-b549-ae02552dc186",
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
  "id": "8a7e1698-7c30-4f35-9a57-9480e6713e04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:41:44.935569Z",
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
  "command_id": "b669bfd7-25ab-428e-98ae-a91bf6024d1c",
  "quote_id": "8a7e1698-7c30-4f35-9a57-9480e6713e04",
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
    "phone": "+380679345055"
  },
  "call_id": "688bb03a-1652-479b-8c42-16f7d8f04ae1"
}
```

```json
{
  "id": "d7552a15-50c7-4be5-87d8-87f27db933b9",
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
  "created_at": "2026-10-30T07:36:45.255269Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679345055"
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
    "id": "1730052000.1405023257",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "688bb03a-1652-479b-8c42-16f7d8f04ae1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679345055",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [
        "d7552a15-50c7-4be5-87d8-87f27db933b9"
      ],
      "started_at": "2026-10-30T07:36:43Z",
      "answered_at": "2026-10-30T07:36:44.618486Z",
      "ended_at": "2026-10-30T07:36:45.588454Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "dbdd3e98-cff3-4b5e-b1e7-7edb8e855045",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672138608",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [],
      "started_at": "2026-10-30T07:34:16.535717Z",
      "answered_at": "2026-10-30T07:34:16.85534Z",
      "ended_at": "2026-10-30T07:34:17.168337Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T07:34:20.850886Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/d7552a15-50c7-4be5-87d8-87f27db933b9` → **200**

```json
{
  "id": "d7552a15-50c7-4be5-87d8-87f27db933b9",
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
  "created_at": "2026-10-30T07:36:45.255269Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679345055"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/d7552a15-50c7-4be5-87d8-87f27db933b9` → **200**

```json
{
  "id": "d7552a15-50c7-4be5-87d8-87f27db933b9",
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
  "created_at": "2026-10-30T07:36:45.255269Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679345055"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d7552a15-50c7-4be5-87d8-87f27db933b9/cancel` → **200**

```json
{
  "command_id": "d46316c5-f84f-4098-acc0-9668093ecc14",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d7552a15-50c7-4be5-87d8-87f27db933b9",
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
  "created_at": "2026-10-30T07:36:45.255269Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679345055"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 688bb03a-1652-479b-8c42-16f7d8f04ae1 with order d7552a15-50c7-4be5-87d8-87f27db933b9.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16584"
}
```

```json
{
  "challenge_id": "9ec35c62-79c3-4b50-958c-e8d9accd8218",
  "expires_at": "2026-10-30T07:41:46.846169874Z",
  "resend_available_at": "2026-10-30T07:36:47.846169874Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "819119",
  "sent_at": "2026-10-30T07:36:46.850070206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ec35c62-79c3-4b50-958c-e8d9accd8218",
  "code": "819119",
  "device_ref": "sandbox-16584"
}
```

```json
{
  "session_id": "22e66142-bd28-4dad-af35-ffb8208b7dde",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjcwNywiaWF0IjoxNzkzMzQ1ODA3LCJqdGkiOiIyMjBkYWJkNC04OWU4LTQxN2YtOGM5NS1lODViYzY0ZTVmZWMiLCJzaWQiOiIyMmU2NjE0Mi1iZDI4LTRkYWQtYWYzNS1mZmI4MjA4YjdkZGUifQ.cRRZMFFNiMgWomCRMmfDQamDIdKBAmo6vIR9FU0vU_I",
  "access_expires_at": "2026-10-30T07:51:47.155479886Z",
  "refresh_token": "SBq75o_lq-chtHOjICYNgoenzebnZ8f3yY_HZeo6jJo",
  "refresh_expires_at": "2026-11-29T07:36:47.154715935Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:34.54102Z",
  "last_location_at": "2026-10-30T07:36:34.54102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7f62973-0283-4687-8efa-c3c72eae54e6/handover` → **200**

```json
{
  "command_id": "c7172413-24b3-448b-bb03-2292541ac353",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:34.54102Z",
  "last_location_at": "2026-10-30T07:36:34.54102Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7f62973-0283-4687-8efa-c3c72eae54e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:48Z",
    "sequence": 1793345808454
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:48.023381Z",
  "last_location_at": "2026-10-30T07:36:48.023381Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668268114",
  "device_ref": "sandbox-12475"
}
```

```json
{
  "challenge_id": "c9846700-a5a0-4570-8b9d-e54cf4976195",
  "expires_at": "2026-10-30T07:41:48.305792619Z",
  "resend_available_at": "2026-10-30T07:36:49.305792619Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668268114` → **200**

```json
{
  "phone": "+380668268114",
  "audience": "CLIENT",
  "code": "330382",
  "sent_at": "2026-10-30T07:36:48.308535574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9846700-a5a0-4570-8b9d-e54cf4976195",
  "code": "330382",
  "device_ref": "sandbox-12475"
}
```

```json
{
  "session_id": "66acd72a-d1d1-4af1-865b-4a8556ab8eb5",
  "subject": {
    "type": "CLIENT",
    "id": "2383b32a-d382-4961-8c22-cdfaadbf7be8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMzgzYjMyYS1kMzgyLTQ5NjEtOGMyMi1jZGZhYWRiZjdiZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NzA4LCJpYXQiOjE3OTMzNDU4MDgsImp0aSI6IjQ1NTI1ODIzLTNlNjMtNGVhMC04OGZlLWQyMjFjZmQ5ODU4MiIsInNpZCI6IjY2YWNkNzJhLWQxZDEtNGFmMS04NjViLTRhODU1NmFiOGViNSJ9.EGwaFt763PUSNRANjuTbwDr1iv2cVXoTEMigxJusNXE",
  "access_expires_at": "2026-10-30T07:51:48.611158931Z",
  "refresh_token": "9mOFXi9hu3XONiNQJ0_JSNa4TxKkRopd9CxnuqNr5z8",
  "refresh_expires_at": "2026-11-29T07:36:48.610416891Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6bdd838c-5c25-4c97-8ea9-86e3e78b3229",
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
  "id": "7851549a-85c7-4125-94b4-7a6d31d2ce37",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:41:48.901341Z",
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
  "command_id": "777e302d-cc7f-4b3d-9208-749893815bbf",
  "quote_id": "7851549a-85c7-4125-94b4-7a6d31d2ce37",
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
  "id": "4c99ba46-a499-43b8-97b4-55e24509658e",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2383b32a-d382-4961-8c22-cdfaadbf7be8",
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
  "created_at": "2026-10-30T07:36:49.193269Z",
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
    "id": "69a9aa87-e301-4c0a-b1dc-7f18f28b87fd",
    "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
    "expires_at": "2026-10-30T07:37:04.196295Z",
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

`POST /api/driver/v1/offers/69a9aa87-e301-4c0a-b1dc-7f18f28b87fd/accept` → **200**

```json
{
  "command_id": "deac029a-bf81-4117-9053-4bd923eca655"
}
```

```json
{
  "id": "f4e98c54-ec16-46f3-83d4-ffbe7cc1caf4",
  "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b36e20c1-4486-4fb4-95d6-82ad427d08a4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b36e20c1-4486-4fb4-95d6-82ad427d08a4",
  "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
  "assignment_id": "f4e98c54-ec16-46f3-83d4-ffbe7cc1caf4",
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

`POST /api/driver/v1/work-sessions/d7f62973-0283-4687-8efa-c3c72eae54e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:50Z",
    "sequence": 1793345810325
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:50.344172Z",
  "last_location_at": "2026-10-30T07:36:50.344172Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b36e20c1-4486-4fb4-95d6-82ad427d08a4/arrive` → **200**

```json
{
  "command_id": "ad4b5368-a811-49cc-a0de-84780a4bbf3b",
  "expected_version": 0
}
```

```json
{
  "id": "b36e20c1-4486-4fb4-95d6-82ad427d08a4",
  "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
  "assignment_id": "f4e98c54-ec16-46f3-83d4-ffbe7cc1caf4",
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
  "arrived_at": "2026-10-30T07:36:50.651959Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b36e20c1-4486-4fb4-95d6-82ad427d08a4/start` → **200**

```json
{
  "command_id": "425c0660-5deb-40e4-8e2c-b56535fc8970",
  "expected_version": 1
}
```

```json
{
  "id": "b36e20c1-4486-4fb4-95d6-82ad427d08a4",
  "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
  "assignment_id": "f4e98c54-ec16-46f3-83d4-ffbe7cc1caf4",
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
  "arrived_at": "2026-10-30T07:36:50.651959Z",
  "started_at": "2026-10-30T07:36:50.954518Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/d7f62973-0283-4687-8efa-c3c72eae54e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:51Z",
    "sequence": 1793345811246
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:51.26558Z",
  "last_location_at": "2026-10-30T07:36:51.26558Z",
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
  "device_ref": "sandbox-28004"
}
```

```json
{
  "challenge_id": "02b08fa7-7be9-4b03-8d2b-26a223d7611c",
  "expires_at": "2026-10-30T07:41:51.542728723Z",
  "resend_available_at": "2026-10-30T07:36:52.542728723Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "058395",
  "sent_at": "2026-10-30T07:36:51.545425753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02b08fa7-7be9-4b03-8d2b-26a223d7611c",
  "code": "058395",
  "device_ref": "sandbox-28004"
}
```

```json
{
  "session_id": "00daefd9-fdcf-4edb-bd19-617381a758a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjcxMSwiaWF0IjoxNzkzMzQ1ODExLCJqdGkiOiJhNGYwZjYxNS01MDY0LTQwZWItYmVjZi1kODVhMjE4NDlmZTYiLCJzaWQiOiIwMGRhZWZkOS1mZGNmLTRlZGItYmQxOS02MTczODFhNzU4YTIifQ.rLqs3zumE-ie8J4YLnm9faQu0TsfzA3zk0OQdiwUFcY",
  "access_expires_at": "2026-10-30T07:51:51.847068236Z",
  "refresh_token": "lBzvPDMmlHefU4c_jRH1g38A0jsAyJKs3AIao6OXSNE",
  "refresh_expires_at": "2026-11-29T07:36:51.846451992Z",
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
  "command_id": "995976a8-0d05-4147-9c84-3c4f6d326f02",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:52Z",
    "sequence": 1793345812399
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3a1afd77-821c-4dac-8b7c-bb4baae963dd",
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
  "last_heartbeat_at": "2026-10-30T07:36:52.418123Z",
  "last_location_at": "2026-10-30T07:36:52.418123Z",
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
  "session_id": "fb7669aa-7bd7-4d75-a7c4-992e2a0a8e45",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MTMsImlhdCI6MTc5MzM0NTgxMywianRpIjoiNTc5YjBlYzAtMzdhMS00MzVlLWIxZjMtMjA4YTJlMGE5ZDdkIiwic2lkIjoiZmI3NjY5YWEtN2JkNy00ZDc1LWE3YzQtOTkyZTJhMGE4ZTQ1In0.TSYWaGhMfgcOgPYyTdOdmQ7oQCZcfMHx0Ttb6m1-Cwg",
  "access_expires_at": "2026-10-30T07:51:53.008981286Z",
  "refresh_token": "d334pD9q5HMIUG2g4YB85XmW7IMtr3_szCC9da7UEFM",
  "refresh_expires_at": "2026-10-30T19:36:53.008008137Z",
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
  "session_id": "a542d084-286d-4ffd-8e2f-51671e15e895",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MTMsImlhdCI6MTc5MzM0NTgxMywianRpIjoiOTg1YTM4ZmYtZjhlNS00ZDJlLWIyMTMtMWE0YjdlZGRhMGNhIiwic2lkIjoiYTU0MmQwODQtMjg2ZC00ZmZkLThlMmYtNTE2NzFlMTVlODk1In0.JPToyzU9h5SUO18Q1kKU0WrdjGt6USv4K-laEphn_HY",
  "access_expires_at": "2026-10-30T07:51:53.584986787Z",
  "refresh_token": "NmHO2NpMwEKDBRYTWBFcOL1hgPg4X7Zig3eqaxBDtTI",
  "refresh_expires_at": "2026-10-30T19:36:53.584371545Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4c99ba46-a499-43b8-97b4-55e24509658e` → **200**

```json
{
  "id": "4c99ba46-a499-43b8-97b4-55e24509658e",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2383b32a-d382-4961-8c22-cdfaadbf7be8",
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
    "id": "f4e98c54-ec16-46f3-83d4-ffbe7cc1caf4",
    "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b36e20c1-4486-4fb4-95d6-82ad427d08a4",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T07:36:49.193269Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4c99ba46-a499-43b8-97b4-55e24509658e/interrupt` → **200**

```json
{
  "command_id": "b6ad7f53-7057-4c97-853d-cc4f5153161a",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "4c99ba46-a499-43b8-97b4-55e24509658e",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "2383b32a-d382-4961-8c22-cdfaadbf7be8",
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
      "id": "f4e98c54-ec16-46f3-83d4-ffbe7cc1caf4",
      "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b36e20c1-4486-4fb4-95d6-82ad427d08a4",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T07:36:49.193269Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "2383b32a-d382-4961-8c22-cdfaadbf7be8",
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
    "id": "5e598056-595a-4edf-92fc-809816d51fe0",
    "order_id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
    "expires_at": "2026-10-30T07:37:09.193757Z",
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

`POST /api/driver/v1/offers/5e598056-595a-4edf-92fc-809816d51fe0/accept` → **200**

```json
{
  "command_id": "465ddad5-c751-440c-bcab-5a09e9106ca9"
}
```

```json
{
  "id": "83d0f294-d308-45f4-8f44-95ecae19731d",
  "order_id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7c75489e-1c9c-4a00-940f-d4896e173b8e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c75489e-1c9c-4a00-940f-d4896e173b8e",
  "order_id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
  "assignment_id": "83d0f294-d308-45f4-8f44-95ecae19731d",
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
  "session_id": "3a1afd77-821c-4dac-8b7c-bb4baae963dd",
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
  "last_heartbeat_at": "2026-10-30T07:36:52.418123Z",
  "last_location_at": "2026-10-30T07:36:52.418123Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/3a1afd77-821c-4dac-8b7c-bb4baae963dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:36:55Z",
    "sequence": 1793345815663
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3a1afd77-821c-4dac-8b7c-bb4baae963dd",
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
  "last_heartbeat_at": "2026-10-30T07:36:55.691293Z",
  "last_location_at": "2026-10-30T07:36:55.691293Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7c75489e-1c9c-4a00-940f-d4896e173b8e/arrive` → **200**

```json
{
  "command_id": "6f9fe542-d08d-45dd-96ff-cd1da54d15a8",
  "expected_version": 0
}
```

```json
{
  "id": "7c75489e-1c9c-4a00-940f-d4896e173b8e",
  "order_id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
  "assignment_id": "83d0f294-d308-45f4-8f44-95ecae19731d",
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
  "arrived_at": "2026-10-30T07:36:55.99444Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7c75489e-1c9c-4a00-940f-d4896e173b8e/start` → **200**

```json
{
  "command_id": "ea7837a2-cd29-4099-8dc3-91d3f2328075",
  "expected_version": 1
}
```

```json
{
  "id": "7c75489e-1c9c-4a00-940f-d4896e173b8e",
  "order_id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
  "assignment_id": "83d0f294-d308-45f4-8f44-95ecae19731d",
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
  "arrived_at": "2026-10-30T07:36:55.99444Z",
  "started_at": "2026-10-30T07:36:56.294434Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7c75489e-1c9c-4a00-940f-d4896e173b8e/complete` → **200**

```json
{
  "command_id": "177d551f-ca99-46ad-a63f-5a492a555bd4",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:36:56Z"
}
```

```json
{
  "id": "7c75489e-1c9c-4a00-940f-d4896e173b8e",
  "order_id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
  "assignment_id": "83d0f294-d308-45f4-8f44-95ecae19731d",
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
  "arrived_at": "2026-10-30T07:36:55.99444Z",
  "started_at": "2026-10-30T07:36:56.294434Z",
  "completed_at": "2026-10-30T07:36:56.606697Z",
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
    "id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T07:36:54.184324Z",
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
    "id": "4c99ba46-a499-43b8-97b4-55e24509658e",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T07:36:49.193269Z",
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
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
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

`GET /api/operator/v1/orders/4c99ba46-a499-43b8-97b4-55e24509658e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T07:36:49.193755Z",
      "actor": {
        "type": "CLIENT",
        "id": "2383b32a-d382-4961-8c22-cdfaadbf7be8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
        "quote_id": "7851549a-85c7-4125-94b4-7a6d31d2ce37",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "95f72d28-92a2-4133-9c19-07902a319fa5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T07:36:49.195594Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
        "attempt_id": "9c0d4b08-ebe9-48c1-844d-6e4ffbe1f50d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "95f72d28-92a2-4133-9c19-07902a319fa5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T07:36:49.198521Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "69a9aa87-e301-4c0a-b1dc-7f18f28b87fd",
        "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "95f72d28-92a2-4133-9c19-07902a319fa5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T07:36:49.777424Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "69a9aa87-e301-4c0a-b1dc-7f18f28b87fd",
        "order_id": "4c99ba46-a499-43b8-97b4-55e24509658e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f4e98c54-ec16-46f3-83d4-ffbe7cc1caf4"
      },
      "correlation_id": "d0b2cb0a-87a6-4160-8877-5fdbd83d95b3"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/63a50e2d-5271-49cf-bc1d-545ec3606dfb/tip` → **200**

```json
{
  "order_id": "63a50e2d-5271-49cf-bc1d-545ec3606dfb",
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
  "available_until": "2026-10-31T07:36:56.606697Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/63a50e2d-5271-49cf-bc1d-545ec3606dfb/tip` → **409**

```json
{
  "command_id": "2154cdd5-966e-44a9-a2cb-3335ebdfc065",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/63a50e2d-5271-49cf-bc1d-545ec3606dfb/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f1e6452f-bb67-4ef5-a254-7149d5e9af08"
}
```

Done: interrupted 4c99ba46-a499-43b8-97b4-55e24509658e, follow-up 63a50e2d-5271-49cf-bc1d-545ec3606dfb.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d7f62973-0283-4687-8efa-c3c72eae54e6",
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
  "last_heartbeat_at": "2026-10-30T07:36:51.26558Z",
  "last_location_at": "2026-10-30T07:36:51.26558Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7f62973-0283-4687-8efa-c3c72eae54e6/close` → **200**

```json
{
  "command_id": "b43a790d-a862-4041-8b1c-1936520dfb6e",
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
  "session_id": "3a1afd77-821c-4dac-8b7c-bb4baae963dd",
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
  "last_heartbeat_at": "2026-10-30T07:36:55.691293Z",
  "last_location_at": "2026-10-30T07:36:55.691293Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a1afd77-821c-4dac-8b7c-bb4baae963dd/close` → **200**

```json
{
  "command_id": "5d3dfafd-9256-4e2f-8998-1add6139a140",
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
  "session_id": "e9594b8c-5785-4513-954a-0cfd88979167",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MjIsImlhdCI6MTc5MzM0NTgyMiwianRpIjoiNzAyODQwYjEtOGMzMS00NDI4LWE4OTAtNWY1YzIwYjgwYTczIiwic2lkIjoiZTk1OTRiOGMtNTc4NS00NTEzLTk1NGEtMGNmZDg4OTc5MTY3In0.U7O-_BqK62WNhslULF1awmD68T8NGFu33xs-L-DdGmk",
  "access_expires_at": "2026-10-30T07:52:02.796453512Z",
  "refresh_token": "H1_NXt7JcrcS2asafAX96un7UWRSqq9E2xgU9r7XkOI",
  "refresh_expires_at": "2026-10-30T19:37:02.795769922Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "fe95c8e9-88d6-4b8a-bdd7-e1aa18ab0de0",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T07:37:03Z"
}
```

```json
{
  "id": "786673ef-ca9b-43d0-af6e-87c79466e6d1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T07:37:03Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/786673ef-ca9b-43d0-af6e-87c79466e6d1/publish` → **200**

```json
{
  "command_id": "4ea941f4-8d30-46a4-b2ed-5f3fba3d872f",
  "expected_version": 0
}
```

```json
{
  "id": "786673ef-ca9b-43d0-af6e-87c79466e6d1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T07:37:03.37934Z",
  "published_at": "2026-10-30T07:37:03.37934Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "786673ef-ca9b-43d0-af6e-87c79466e6d1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T07:37:03.37934Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636099144",
  "device_ref": "sandbox-27566"
}
```

```json
{
  "challenge_id": "8df5195f-ee64-4208-b7bc-26a9376ef0dd",
  "expires_at": "2026-10-30T07:42:03.944241206Z",
  "resend_available_at": "2026-10-30T07:37:04.944241206Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636099144` → **200**

```json
{
  "phone": "+380636099144",
  "audience": "CLIENT",
  "code": "964761",
  "sent_at": "2026-10-30T07:37:03.946993308Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8df5195f-ee64-4208-b7bc-26a9376ef0dd",
  "code": "964761",
  "device_ref": "sandbox-27566"
}
```

```json
{
  "session_id": "2465babf-f3ac-4554-9e98-35f2e782affb",
  "subject": {
    "type": "CLIENT",
    "id": "a2adadce-6981-40f7-8fb5-8d79bb37c008"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMmFkYWRjZS02OTgxLTQwZjctOGZiNS04ZDc5YmIzN2MwMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NzI0LCJpYXQiOjE3OTMzNDU4MjQsImp0aSI6IjIyMDA5NTBjLTdhNmMtNDQzZC1iZDYzLTEzNGFiMjdhYjMzYyIsInNpZCI6IjI0NjViYWJmLWYzYWMtNDU1NC05ZTk4LTM1ZjJlNzgyYWZmYiJ9.o5-3jCNuaPvtM5PfcrbFwbE2u8azU9wsahCC6cMVmFI",
  "access_expires_at": "2026-10-30T07:52:04.255618033Z",
  "refresh_token": "Fk9IN4t2a_Ui6PGvgXBtfJbKSBi-s-MxhIfC28TC89A",
  "refresh_expires_at": "2026-11-29T07:37:04.255046363Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "786673ef-ca9b-43d0-af6e-87c79466e6d1",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T07:37:03.37934Z",
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
  "command_id": "2157cc79-75e7-4a39-b98e-d727fc9313a7",
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
  "id": "1199e203-ff65-4d41-9ecb-f0c6dc8a98c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:04.830174Z",
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
  "command_id": "0d4fb94a-ba83-4d44-9bd2-005157e3f6b2",
  "quote_id": "1199e203-ff65-4d41-9ecb-f0c6dc8a98c7",
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
  "correlation_id": "4101d1a6-d355-47ed-8d3c-17a6d1eb1e08"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "c40d08ec-1e02-4d80-8e09-e69c2d5d0696",
  "version_id": "786673ef-ca9b-43d0-af6e-87c79466e6d1",
  "language": "uk"
}
```

```json
{
  "version_id": "786673ef-ca9b-43d0-af6e-87c79466e6d1",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T07:37:05.424531Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "378c6eb9-1dfe-4e84-8108-d0bd1b30da1f",
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
  "id": "defaaaea-088f-490b-848b-8123675180ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:05.709122Z",
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
  "command_id": "c41dc535-6367-40c0-a3f7-b99081946191",
  "quote_id": "defaaaea-088f-490b-848b-8123675180ef",
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
  "id": "4a50db8c-5294-4e01-9657-1964896d38e0",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a2adadce-6981-40f7-8fb5-8d79bb37c008",
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
  "created_at": "2026-10-30T07:37:06.030098Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4a50db8c-5294-4e01-9657-1964896d38e0` → **200**

```json
{
  "id": "4a50db8c-5294-4e01-9657-1964896d38e0",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a2adadce-6981-40f7-8fb5-8d79bb37c008",
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
  "created_at": "2026-10-30T07:37:06.030098Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4a50db8c-5294-4e01-9657-1964896d38e0/cancel` → **200**

```json
{
  "command_id": "63f6b11c-f83d-40be-9a14-cdbd4532b453",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4a50db8c-5294-4e01-9657-1964896d38e0",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a2adadce-6981-40f7-8fb5-8d79bb37c008",
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
  "created_at": "2026-10-30T07:37:06.030098Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`POST /api/admin/v1/legal-documents/786673ef-ca9b-43d0-af6e-87c79466e6d1` → **409**

```json
{
  "command_id": "93094de0-7f48-4ff6-81b4-e3a10d194974",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T07:37:06Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/786673ef-ca9b-43d0-af6e-87c79466e6d1",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9b612659-120d-4cb0-838a-b3ca75e56221"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b2f2dae1-a35f-49fa-a53e-8815330b4185",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T07:37:07Z"
}
```

```json
{
  "id": "dff57ea1-1fec-441e-ab9d-f2a9b70e21b9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T07:37:07Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/dff57ea1-1fec-441e-ab9d-f2a9b70e21b9/publish` → **200**

```json
{
  "command_id": "defba940-fd69-444f-9e51-dbc9b02c79d6",
  "expected_version": 0
}
```

```json
{
  "id": "dff57ea1-1fec-441e-ab9d-f2a9b70e21b9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T07:37:07.519333Z",
  "published_at": "2026-10-30T07:37:07.519333Z",
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
  "device_ref": "sandbox-19345"
}
```

```json
{
  "challenge_id": "55824a12-292d-4497-aa2d-6b8966468c39",
  "expires_at": "2026-10-30T07:42:07.830380868Z",
  "resend_available_at": "2026-10-30T07:37:08.830380868Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "738472",
  "sent_at": "2026-10-30T07:37:07.833633517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55824a12-292d-4497-aa2d-6b8966468c39",
  "code": "738472",
  "device_ref": "sandbox-19345"
}
```

```json
{
  "session_id": "6a6ede35-ecc0-4e31-a0e9-b21c904e80cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjcyOCwiaWF0IjoxNzkzMzQ1ODI4LCJqdGkiOiJkN2Q3ZTM3Ni0xNDNkLTQ3N2ItODc5Yy01ZWZjZmRmZDQ2NGQiLCJzaWQiOiI2YTZlZGUzNS1lY2MwLTRlMzEtYTBlOS1iMjFjOTA0ZTgwY2YifQ.usF8cXiwLcf3u9qaatCiEeWxeoEszKMqCtdtK-qOyHg",
  "access_expires_at": "2026-10-30T07:52:08.186951661Z",
  "refresh_token": "sJNSp9bulZJSKPphem4EjTQ-7heFnU4uIs4LtFd2cz0",
  "refresh_expires_at": "2026-11-29T07:37:08.186308337Z",
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
  "command_id": "8506ae4e-d8bb-4484-93c5-c0fd1bac71f7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:37:08Z",
    "sequence": 1793345828801
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9ac4cf86-f1d0-48b2-b8a7-fd0959f7625f",
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
  "last_heartbeat_at": "2026-10-30T07:37:08.820819Z",
  "last_location_at": "2026-10-30T07:37:08.820819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677021869",
  "device_ref": "sandbox-25885"
}
```

```json
{
  "challenge_id": "31ce4f31-0022-43c2-975e-f4c6aff01e68",
  "expires_at": "2026-10-30T07:42:09.108808851Z",
  "resend_available_at": "2026-10-30T07:37:10.108808851Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677021869` → **200**

```json
{
  "phone": "+380677021869",
  "audience": "CLIENT",
  "code": "033557",
  "sent_at": "2026-10-30T07:37:09.111751069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31ce4f31-0022-43c2-975e-f4c6aff01e68",
  "code": "033557",
  "device_ref": "sandbox-25885"
}
```

```json
{
  "session_id": "4f208fd8-a5f1-49f5-9f8b-9e97b84735b5",
  "subject": {
    "type": "CLIENT",
    "id": "578c94e1-0c1c-48df-8b55-3d735955256b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NzhjOTRlMS0wYzFjLTQ4ZGYtOGI1NS0zZDczNTk1NTI1NmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NzI5LCJpYXQiOjE3OTMzNDU4MjksImp0aSI6Ijk0ODViMGVmLTFlMTgtNGRiNi04YjI1LTg2OTA5YWVkOTU3NyIsInNpZCI6IjRmMjA4ZmQ4LWE1ZjEtNDlmNS05ZjhiLTllOTdiODQ3MzViNSJ9.N4xuQqw5nLZuutZ5SR1rdUjWTk6-c6wIdhcEx9Kg8Q0",
  "access_expires_at": "2026-10-30T07:52:09.427163346Z",
  "refresh_token": "4ziG3s-3k1HhVPAA3YMBvcmAm4cPfOZNi3CIGaezxRU",
  "refresh_expires_at": "2026-11-29T07:37:09.426582351Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4e5d0072-f09e-4623-a235-0774e64d4260",
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
  "id": "a19a10fb-903d-48c0-a47d-8c43f7d4e50e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:09.715105Z",
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
  "command_id": "c3bb05e6-096c-4599-ba09-de2443bac715",
  "quote_id": "a19a10fb-903d-48c0-a47d-8c43f7d4e50e",
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
    "phone": "+380676062083"
  }
}
```

```json
{
  "id": "52220eca-e6fd-43e3-9f93-16c874175766",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:37:10.012554Z",
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
    "id": "3adf8903-e6a7-489a-87a3-75b69785a4ef",
    "order_id": "52220eca-e6fd-43e3-9f93-16c874175766",
    "expires_at": "2026-10-30T07:37:25.015777Z",
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

`POST /api/driver/v1/offers/3adf8903-e6a7-489a-87a3-75b69785a4ef/accept` → **200**

```json
{
  "command_id": "ddb9654b-3fad-4864-a282-106ce894facf"
}
```

```json
{
  "id": "6fb136e3-424f-4be4-92c3-93ea8f5d1abe",
  "order_id": "52220eca-e6fd-43e3-9f93-16c874175766",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "982978e2-1ae5-4722-9917-ecb989bbea07",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "982978e2-1ae5-4722-9917-ecb989bbea07",
  "order_id": "52220eca-e6fd-43e3-9f93-16c874175766",
  "assignment_id": "6fb136e3-424f-4be4-92c3-93ea8f5d1abe",
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
    "phone": "+380676062083"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e370a95-937c-4f45-9372-718f45806968",
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
  "id": "141c216f-25d9-44d0-8cb3-d8619a16215f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:11.222904Z",
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
  "command_id": "67bfe439-af05-4313-846c-a6bde18c06dd",
  "quote_id": "141c216f-25d9-44d0-8cb3-d8619a16215f",
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
  "id": "418dcf89-d1ba-43af-bae8-3ad506c567e1",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:37:11.529874Z",
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
  "command_id": "4ba07522-b010-4c38-bb5a-9a4b5550e42b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T10:37:11Z"
}
```

```json
{
  "id": "6a0de053-14eb-44b0-9857-e3f318bcc72e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:11.849977Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T10:37:11Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e33c6c50-19ec-4422-bdd4-ae752b011caf",
  "quote_id": "6a0de053-14eb-44b0-9857-e3f318bcc72e",
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
  "pickup_at": "2026-10-30T10:37:11Z"
}
```

```json
{
  "id": "93d60914-c15f-41a2-b511-6a27748c5f1d",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T07:37:12.143952Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T10:37:11Z",
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
  "command_id": "f61491a7-74cc-45fa-82dc-cada2d28d1e4",
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
  "id": "320309fe-54ee-4089-81e2-a1f45cddaba0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:12.457396Z",
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
  "command_id": "40421ea5-ce45-42a5-85c3-01e5a3c303d0",
  "quote_id": "320309fe-54ee-4089-81e2-a1f45cddaba0",
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
  "correlation_id": "ee0e4005-db9f-48ba-875e-6e72d06f2528"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "93d60914-c15f-41a2-b511-6a27748c5f1d",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T07:37:12.143952Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T10:37:11Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "418dcf89-d1ba-43af-bae8-3ad506c567e1",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T07:37:11.529874Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "52220eca-e6fd-43e3-9f93-16c874175766",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "418dcf89-d1ba-43af-bae8-3ad506c567e1",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:37:11.529874Z",
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

`GET /api/rider/v1/orders/52220eca-e6fd-43e3-9f93-16c874175766` → **200**

```json
{
  "id": "52220eca-e6fd-43e3-9f93-16c874175766",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6fb136e3-424f-4be4-92c3-93ea8f5d1abe",
    "order_id": "52220eca-e6fd-43e3-9f93-16c874175766",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "982978e2-1ae5-4722-9917-ecb989bbea07",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T07:37:10.012554Z",
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
    "location_at": "2026-10-30T07:37:08.820819Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/52220eca-e6fd-43e3-9f93-16c874175766/cancel` → **200**

```json
{
  "command_id": "c910becf-f1af-4d4e-b518-9937a578b0f3",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "52220eca-e6fd-43e3-9f93-16c874175766",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6fb136e3-424f-4be4-92c3-93ea8f5d1abe",
    "order_id": "52220eca-e6fd-43e3-9f93-16c874175766",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "982978e2-1ae5-4722-9917-ecb989bbea07",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T07:37:10.012554Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`GET /api/rider/v1/orders/418dcf89-d1ba-43af-bae8-3ad506c567e1` → **200**

```json
{
  "id": "418dcf89-d1ba-43af-bae8-3ad506c567e1",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:37:11.529874Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/418dcf89-d1ba-43af-bae8-3ad506c567e1/cancel` → **200**

```json
{
  "command_id": "3095494c-7a11-4834-8828-2b0044b0881d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "418dcf89-d1ba-43af-bae8-3ad506c567e1",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:37:11.529874Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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

`GET /api/rider/v1/orders/93d60914-c15f-41a2-b511-6a27748c5f1d` → **200**

```json
{
  "id": "93d60914-c15f-41a2-b511-6a27748c5f1d",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T07:37:12.143952Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T10:37:11Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/93d60914-c15f-41a2-b511-6a27748c5f1d/cancel` → **200**

```json
{
  "command_id": "b2cae648-8091-463b-b113-4921a674530e",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "93d60914-c15f-41a2-b511-6a27748c5f1d",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "578c94e1-0c1c-48df-8b55-3d735955256b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T07:37:12.143952Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-30T10:37:11Z",
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
  "session_id": "9ac4cf86-f1d0-48b2-b8a7-fd0959f7625f",
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
  "last_heartbeat_at": "2026-10-30T07:37:08.820819Z",
  "last_location_at": "2026-10-30T07:37:08.820819Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9ac4cf86-f1d0-48b2-b8a7-fd0959f7625f/close` → **200**

```json
{
  "command_id": "bc2b0e0b-e8ab-47f7-96a7-5869379931ab",
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

Done: orders 52220eca-e6fd-43e3-9f93-16c874175766, 418dcf89-d1ba-43af-bae8-3ad506c567e1, 93d60914-c15f-41a2-b511-6a27748c5f1d.

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
  "session_id": "75f4daaf-c85c-440c-b905-6127e96debf1",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MzYsImlhdCI6MTc5MzM0NTgzNiwianRpIjoiMzk4ZDczOTQtZjExMi00YTNjLWE4ZDItZjZkZmM2ODVkOWRlIiwic2lkIjoiNzVmNGRhYWYtYzg1Yy00NDBjLWI5MDUtNjEyN2U5NmRlYmYxIn0.fQsJrnJKqAQLiVRCyuIRBn6-2-DSaZYNKVb5qOpso4I",
  "access_expires_at": "2026-10-30T07:52:16.25939644Z",
  "refresh_token": "-8P4DBVanY2V3_L-yIFqSREv3ZDfGon-U4kjbZFigCU",
  "refresh_expires_at": "2026-10-30T19:37:16.258883229Z",
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
  "session_id": "9452397a-39da-40bb-b2d7-49aa8e18c8e8",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3MzYsImlhdCI6MTc5MzM0NTgzNiwianRpIjoiMWU5MWZlYzAtOWRjZS00NDJlLTkxZGMtZmIyZjczNDZiODExIiwic2lkIjoiOTQ1MjM5N2EtMzlkYS00MGJiLWIyZDctNDlhYThlMThjOGU4In0.ycO4-QwLIsUEOCtv30d7TnghUTeF2YJEQU7cjY38o7s",
  "access_expires_at": "2026-10-30T07:52:16.829690767Z",
  "refresh_token": "5JVhjO3M4oeqWXIWX5QHIJy4CTzcNO1RvlIVMSvvAFg",
  "refresh_expires_at": "2026-10-30T19:37:16.829119199Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17188"
}
```

```json
{
  "challenge_id": "affb9f0d-2fe8-41d8-8337-7d7fc47475dc",
  "expires_at": "2026-10-30T07:42:17.109235557Z",
  "resend_available_at": "2026-10-30T07:37:18.109235557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "726540",
  "sent_at": "2026-10-30T07:37:17.112187113Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "affb9f0d-2fe8-41d8-8337-7d7fc47475dc",
  "code": "726540",
  "device_ref": "sandbox-17188"
}
```

```json
{
  "session_id": "8118a37d-c77d-4dce-a3af-17502305e072",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjczNywiaWF0IjoxNzkzMzQ1ODM3LCJqdGkiOiI3NzU2MGQwNy1lYWRhLTQxM2MtYjYxMi0yZjJhYThhNGNmOWMiLCJzaWQiOiI4MTE4YTM3ZC1jNzdkLTRkY2UtYTNhZi0xNzUwMjMwNWUwNzIifQ.y5WI143m3bSAXSDGypwg25MEDMXqhPckd94UP7tKp5c",
  "access_expires_at": "2026-10-30T07:52:17.414864536Z",
  "refresh_token": "Iy9eph0UYT001IqRuLEo5ApRksc5FBa7LKqGVjfuEtY",
  "refresh_expires_at": "2026-11-29T07:37:17.414344462Z",
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
  "command_id": "a4e422ad-d39f-4540-b35e-c288b77cd827",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:37:17Z",
    "sequence": 1793345837991
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93b20ffb-fdb6-4edf-906a-4fb2c5cf5825",
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
  "last_heartbeat_at": "2026-10-30T07:37:18.009786Z",
  "last_location_at": "2026-10-30T07:37:18.009786Z",
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
  "command_id": "4dfb7c15-a612-43d9-b2b9-2c51badce8fe",
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
  "effective_at": "2026-10-30T07:37:18.595559Z",
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T07:34:30.554585Z",
  "last_entries": [
    {
      "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T07:34:30.554585Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "29dd94fa-85a8-42b3-b3d7-979b274f36d3",
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
  "id": "b2b59fa8-c2f2-464f-b372-ac47704c5648",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:19.168582Z",
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
  "command_id": "9b7b2f60-51e1-425a-84c1-25e0db8d0be2",
  "quote_id": "b2b59fa8-c2f2-464f-b372-ac47704c5648",
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
    "phone": "+3806711123597"
  }
}
```

```json
{
  "id": "d27ca52b-6c89-4bff-ace9-3642a6fcd1fb",
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
  "created_at": "2026-10-30T07:37:19.47475Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123597"
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
    "id": "48289052-8f80-451d-8e3c-2893d1a36df8",
    "order_id": "d27ca52b-6c89-4bff-ace9-3642a6fcd1fb",
    "expires_at": "2026-10-30T07:37:34.478449Z",
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

`POST /api/driver/v1/offers/48289052-8f80-451d-8e3c-2893d1a36df8/accept` → **200**

```json
{
  "command_id": "19dc0774-a3bb-4545-b3aa-e3655a32bfc9"
}
```

```json
{
  "id": "1ea3e10c-6df6-4aeb-a619-31e1c88ae2cd",
  "order_id": "d27ca52b-6c89-4bff-ace9-3642a6fcd1fb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c6904660-1e1d-4254-990f-0cb7712546c5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c6904660-1e1d-4254-990f-0cb7712546c5",
  "order_id": "d27ca52b-6c89-4bff-ace9-3642a6fcd1fb",
  "assignment_id": "1ea3e10c-6df6-4aeb-a619-31e1c88ae2cd",
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
    "phone": "+3806711123597"
  }
}
```

`POST /api/driver/v1/work-sessions/93b20ffb-fdb6-4edf-906a-4fb2c5cf5825/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:37:20Z",
    "sequence": 1793345840624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93b20ffb-fdb6-4edf-906a-4fb2c5cf5825",
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
  "last_heartbeat_at": "2026-10-30T07:37:20.642998Z",
  "last_location_at": "2026-10-30T07:37:20.642998Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c6904660-1e1d-4254-990f-0cb7712546c5/arrive` → **200**

```json
{
  "command_id": "3e6ce219-e41f-4f6c-85ee-21c966f6190d",
  "expected_version": 0
}
```

```json
{
  "id": "c6904660-1e1d-4254-990f-0cb7712546c5",
  "order_id": "d27ca52b-6c89-4bff-ace9-3642a6fcd1fb",
  "assignment_id": "1ea3e10c-6df6-4aeb-a619-31e1c88ae2cd",
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
  "arrived_at": "2026-10-30T07:37:20.931243Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123597"
  }
}
```

`POST /api/driver/v1/trips/c6904660-1e1d-4254-990f-0cb7712546c5/start` → **200**

```json
{
  "command_id": "0e59de04-fae0-420e-8c90-44207f8172ed",
  "expected_version": 1
}
```

```json
{
  "id": "c6904660-1e1d-4254-990f-0cb7712546c5",
  "order_id": "d27ca52b-6c89-4bff-ace9-3642a6fcd1fb",
  "assignment_id": "1ea3e10c-6df6-4aeb-a619-31e1c88ae2cd",
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
  "arrived_at": "2026-10-30T07:37:20.931243Z",
  "started_at": "2026-10-30T07:37:21.250635Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123597"
  }
}
```

`POST /api/driver/v1/trips/c6904660-1e1d-4254-990f-0cb7712546c5/complete` → **200**

```json
{
  "command_id": "0b2709a1-91e6-4513-8370-85ebf35a8a8a",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:37:21Z",
  "cash_received": true
}
```

```json
{
  "id": "c6904660-1e1d-4254-990f-0cb7712546c5",
  "order_id": "d27ca52b-6c89-4bff-ace9-3642a6fcd1fb",
  "assignment_id": "1ea3e10c-6df6-4aeb-a619-31e1c88ae2cd",
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
  "arrived_at": "2026-10-30T07:37:20.931243Z",
  "started_at": "2026-10-30T07:37:21.250635Z",
  "completed_at": "2026-10-30T07:37:21.548654Z",
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
  "command_id": "bac2ad6a-a5ff-4dfa-8f5d-a87506e776d4",
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
  "id": "0421b647-1ccd-47e5-afbb-2ea9232e4e1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:21.869431Z",
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
  "command_id": "ee104933-9b0d-4263-a75b-c69833fa1c61",
  "quote_id": "0421b647-1ccd-47e5-afbb-2ea9232e4e1f",
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
    "phone": "+3806711114457"
  }
}
```

```json
{
  "id": "ef2a2b0c-c847-44d5-8d7c-03cbe1a84be8",
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
  "created_at": "2026-10-30T07:37:22.175926Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114457"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ef2a2b0c-c847-44d5-8d7c-03cbe1a84be8` → **200**

```json
{
  "id": "ef2a2b0c-c847-44d5-8d7c-03cbe1a84be8",
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
  "created_at": "2026-10-30T07:37:22.175926Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114457"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ef2a2b0c-c847-44d5-8d7c-03cbe1a84be8/cancel` → **200**

```json
{
  "command_id": "868c1b3b-605f-4c44-be71-0c61f924a6d4",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ef2a2b0c-c847-44d5-8d7c-03cbe1a84be8",
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
  "created_at": "2026-10-30T07:37:22.175926Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114457"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error",
      "uk": "Помилка оператора"
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
  "staff_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T07:34:30.554585Z",
  "last_entries": [
    {
      "order_id": "ef2a2b0c-c847-44d5-8d7c-03cbe1a84be8",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T07:37:22.81044Z"
    },
    {
      "order_id": "d27ca52b-6c89-4bff-ace9-3642a6fcd1fb",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T07:37:21.553814Z"
    },
    {
      "order_id": "4248065f-3aa7-4bfd-8967-866291d3ac43",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T07:34:30.554585Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "93b20ffb-fdb6-4edf-906a-4fb2c5cf5825",
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
  "last_heartbeat_at": "2026-10-30T07:37:20.642998Z",
  "last_location_at": "2026-10-30T07:37:20.642998Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/93b20ffb-fdb6-4edf-906a-4fb2c5cf5825/close` → **200**

```json
{
  "command_id": "f635b634-1fbe-4c02-a7c5-aa70b3ceb69e",
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

Done: operator bonus for fulfilled d27ca52b-6c89-4bff-ace9-3642a6fcd1fb and operator-fault cancellation ef2a2b0c-c847-44d5-8d7c-03cbe1a84be8.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677692221",
  "device_ref": "sandbox-17970"
}
```

```json
{
  "challenge_id": "b50586b4-74b6-49f7-a355-d629fffa89dc",
  "expires_at": "2026-10-30T07:42:27.195466744Z",
  "resend_available_at": "2026-10-30T07:37:28.195466744Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677692221` → **200**

```json
{
  "phone": "+380677692221",
  "audience": "CLIENT",
  "code": "050996",
  "sent_at": "2026-10-30T07:37:27.198259462Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673193430",
  "device_ref": "sandbox-13720",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "712bb4a9-bd41-4d8b-bfa8-ef91e3982b8a",
  "expires_at": "2026-10-30T07:42:28.705789456Z",
  "resend_available_at": "2026-10-30T07:37:29.705789456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673193430` → **200**

```json
{
  "phone": "+380673193430",
  "audience": "CLIENT",
  "code": "915634",
  "sent_at": "2026-10-30T07:37:28.708260131Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673193430",
  "device_ref": "sandbox-13024",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b51acaf6-0bca-4413-adb7-149abd5e0b64",
  "expires_at": "2026-10-30T07:42:30.20912861Z",
  "resend_available_at": "2026-10-30T07:37:31.20912861Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673193430` → **200**

```json
{
  "phone": "+380673193430",
  "audience": "CLIENT",
  "code": "539052",
  "sent_at": "2026-10-30T07:37:30.212110753Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678850000",
  "device_ref": "sandbox-16968"
}
```

```json
{
  "challenge_id": "7a59a5b1-d1eb-48dc-b22d-434341564e0d",
  "expires_at": "2026-10-30T07:42:31.72346034Z",
  "resend_available_at": "2026-10-30T07:37:32.72346034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678850000",
  "device_ref": "sandbox-2731"
}
```

```json
{
  "challenge_id": "5cc1b3c5-424b-4869-8c66-a6a694a8036e",
  "expires_at": "2026-10-30T07:42:33.209731969Z",
  "resend_available_at": "2026-10-30T07:37:34.209731969Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678850000` → **200**

```json
{
  "phone": "+380678850000",
  "audience": "CLIENT",
  "code": "860513",
  "sent_at": "2026-10-30T07:37:33.212761708Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678850000",
  "device_ref": "sandbox-9250",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "f127d6b5-a38f-43eb-8e34-8303c8df437f",
  "expires_at": "2026-10-30T07:42:34.725403599Z",
  "resend_available_at": "2026-10-30T07:37:35.725403599Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678850000` → **200**

```json
{
  "phone": "+380678850000",
  "audience": "CLIENT",
  "code": "138853",
  "sent_at": "2026-10-30T07:37:34.728365373Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380678850000",
  "device_ref": "sandbox-16688",
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
  "correlation_id": "a9d24126-e11a-4e7e-a802-a362d9aa7ed0",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000011414"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "c701bc85-ab70-43f9-9181-7b7eb0da8278"
}
```

`GET /sandbox/v1/otp?phone=%2B442000011414` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120023748"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b188d06c-d4da-4a2f-9be0-15161d5d17a8"
}
```

`GET /sandbox/v1/otp?phone=%2B37120023748` → **404**

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
  "session_id": "d5b41549-2992-4fac-b56e-446f58ab5f75",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3NTcsImlhdCI6MTc5MzM0NTg1NywianRpIjoiZWM2NmE3OTItODFhMi00OTRjLTkyYzItNDhhNmY0ZDg2Y2IxIiwic2lkIjoiZDViNDE1NDktMjk5Mi00ZmFjLWI1NmUtNDQ2ZjU4YWI1Zjc1In0.-BsfZckBM1fWk-o32YgEUMumU-Nco_mYKyVGJnz_seQ",
  "access_expires_at": "2026-10-30T07:52:37.441668254Z",
  "refresh_token": "oozIonylx_QWDWGnThx6Tq3hJBrc2ZB2tpDBffBTuwM",
  "refresh_expires_at": "2026-10-30T19:37:37.441132941Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678850000` → **200**

```json
{
  "deliveries": [
    {
      "id": "99ffced1-bf48-4475-9ce4-266f4ad6928b",
      "challenge_id": "f127d6b5-a38f-43eb-8e34-8303c8df437f",
      "phone": "+380678850000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-71235e30-d3f4-4505-871f-3984e5c10e76",
      "error": null,
      "attempted_at": "2026-10-30T07:37:34.72881Z"
    },
    {
      "id": "c907c331-7c64-440e-85ad-3c0d3f794ccc",
      "challenge_id": "5cc1b3c5-424b-4869-8c66-a6a694a8036e",
      "phone": "+380678850000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d9b6076d-10c6-4399-bc83-db160097cc38",
      "error": null,
      "attempted_at": "2026-10-30T07:37:33.213255Z"
    },
    {
      "id": "c9de40a1-5301-4fab-affb-c8dda5566d5b",
      "challenge_id": "7a59a5b1-d1eb-48dc-b22d-434341564e0d",
      "phone": "+380678850000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T07:37:31.726433Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678850000` → **200**

```json
{
  "phone": "+380678850000",
  "audience": "CLIENT",
  "code": "138853",
  "sent_at": "2026-10-30T07:37:34.728365373Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673193430` → **200**

```json
{
  "deliveries": [
    {
      "id": "f8523ce0-b98f-498e-aefc-a9f02531a6ab",
      "challenge_id": "b51acaf6-0bca-4413-adb7-149abd5e0b64",
      "phone": "+380673193430",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-05b1de21-9a9d-4d11-96a6-40c1b7bd28a6",
      "error": null,
      "attempted_at": "2026-10-30T07:37:30.212588Z"
    },
    {
      "id": "9e0f5469-5eaa-4f95-a76c-41013e33b14e",
      "challenge_id": "712bb4a9-bd41-4d8b-bfa8-ef91e3982b8a",
      "phone": "+380673193430",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-23987cbf-5d18-41b9-ab67-d2d875eca581",
      "error": null,
      "attempted_at": "2026-10-30T07:37:28.708515Z"
    }
  ]
}
```

Done: SMS to +380677692221; SMS then a call to +380673193430; a failed SMS, two calls and a refused third to +380678850000; +44 and +371 refused.

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
  "session_id": "dc419292-69a0-4057-9818-41b9506951bc",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3NTgsImlhdCI6MTc5MzM0NTg1OCwianRpIjoiNTRkNTNmNmUtOGViOC00ZDhmLTg4MGYtODc3NDA4Yzc0OWJhIiwic2lkIjoiZGM0MTkyOTItNjlhMC00MDU3LTk4MTgtNDFiOTUwNjk1MWJjIn0.Hs7bUO-cbzC1QAku8JIh5kAoquc947oaOxLmzIA3rbI",
  "access_expires_at": "2026-10-30T07:52:38.626756933Z",
  "refresh_token": "9z39RZ4V-F314etKkyYwLvy0RvBuKYVhKJyDsGW4rAA",
  "refresh_expires_at": "2026-10-30T19:37:38.626014552Z",
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
  "session_id": "1f29a761-30ca-4eac-8ae8-2324607144c2",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3NTksImlhdCI6MTc5MzM0NTg1OSwianRpIjoiMzVhOTI5YmItZTU5YS00OWFlLTkxZGQtZjgwYWViNGMwMDI2Iiwic2lkIjoiMWYyOWE3NjEtMzBjYS00ZWFjLThhZTgtMjMyNDYwNzE0NGMyIn0.apUBJfFfDDbsYh4_VXNQ9bXWgNCWiN6Thqb16Neli6s",
  "access_expires_at": "2026-10-30T07:52:39.203168566Z",
  "refresh_token": "x-nRwfdSu5BRNHdKu_ghNsVCoaBlhZe8Z7PVSvOVqQw",
  "refresh_expires_at": "2026-10-30T19:37:39.202676675Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
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

`POST /api/admin/v1/staff-extensions/c4a173f9-11cd-4781-befc-d6722f2847c3` → **200**

```json
{
  "command_id": "59c660bf-0034-4c84-bdcd-c2b278696c60",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "f3af0ea1-7c12-47c7-b86a-b787a5bc79e3",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T07:37:40.349165Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T07:37:40.349165Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "15a8b77f-5e73-4fb2-beab-e9863f7b8105",
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
  "id": "849aafa0-9f85-4154-bef3-5952e6959dda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:42:40.920354Z",
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
  "command_id": "d25e8bfc-0a55-4e51-b0c8-a24a8b40f8f7",
  "quote_id": "849aafa0-9f85-4154-bef3-5952e6959dda",
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
    "phone": "+380676039921"
  }
}
```

```json
{
  "id": "8a8b889b-eee1-4130-8d2b-f548ce5a35cf",
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
  "created_at": "2026-10-30T07:37:41.221932Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676039921"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/8a8b889b-eee1-4130-8d2b-f548ce5a35cf/calls` → **201**

```json
{
  "command_id": "9c7a98da-49bc-44fa-b576-27307ad6eb30",
  "to": "CALLER"
}
```

```json
{
  "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "order_ids": [
    "8a8b889b-eee1-4130-8d2b-f548ce5a35cf"
  ],
  "started_at": "2026-10-30T07:37:41.559329Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/8a8b889b-eee1-4130-8d2b-f548ce5a35cf/calls` → **201**

```json
{
  "command_id": "9c7a98da-49bc-44fa-b576-27307ad6eb30",
  "to": "CALLER"
}
```

```json
{
  "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "order_ids": [
    "8a8b889b-eee1-4130-8d2b-f548ce5a35cf"
  ],
  "started_at": "2026-10-30T07:37:41.559329Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676039921",
    "at": "2026-10-30T07:37:41.561800757Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.5695",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ab59b965-bdf5-449d-acc2-606a378f0fdc"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=8a8b889b-eee1-4130-8d2b-f548ce5a35cf` → **200**

```json
{
  "calls": [
    {
      "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [
        "8a8b889b-eee1-4130-8d2b-f548ce5a35cf"
      ],
      "started_at": "2026-10-30T07:37:41.559329Z",
      "answered_at": "2026-10-30T07:37:42.229573Z",
      "ended_at": "2026-10-30T07:37:42.251386Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8a8b889b-eee1-4130-8d2b-f548ce5a35cf` → **200**

```json
{
  "calls": [
    {
      "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [
        "8a8b889b-eee1-4130-8d2b-f548ce5a35cf"
      ],
      "started_at": "2026-10-30T07:37:41.559329Z",
      "answered_at": "2026-10-30T07:37:42.229573Z",
      "ended_at": "2026-10-30T07:37:42.251386Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8a8b889b-eee1-4130-8d2b-f548ce5a35cf` → **200**

```json
{
  "calls": [
    {
      "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [
        "8a8b889b-eee1-4130-8d2b-f548ce5a35cf"
      ],
      "started_at": "2026-10-30T07:37:41.559329Z",
      "answered_at": "2026-10-30T07:37:42.229573Z",
      "ended_at": "2026-10-30T07:37:42.251386Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8a8b889b-eee1-4130-8d2b-f548ce5a35cf` → **200**

```json
{
  "calls": [
    {
      "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [
        "8a8b889b-eee1-4130-8d2b-f548ce5a35cf"
      ],
      "started_at": "2026-10-30T07:37:41.559329Z",
      "answered_at": "2026-10-30T07:37:42.229573Z",
      "ended_at": "2026-10-30T07:37:42.251386Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=8a8b889b-eee1-4130-8d2b-f548ce5a35cf` → **200**

```json
{
  "calls": [
    {
      "id": "ab59b965-bdf5-449d-acc2-606a378f0fdc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "order_ids": [
        "8a8b889b-eee1-4130-8d2b-f548ce5a35cf"
      ],
      "started_at": "2026-10-30T07:37:41.559329Z",
      "answered_at": "2026-10-30T07:37:42.229573Z",
      "ended_at": "2026-10-30T07:37:42.251386Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T07:37:50.902554Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/8a8b889b-eee1-4130-8d2b-f548ce5a35cf` → **200**

```json
{
  "id": "8a8b889b-eee1-4130-8d2b-f548ce5a35cf",
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
  "created_at": "2026-10-30T07:37:41.221932Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676039921"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8a8b889b-eee1-4130-8d2b-f548ce5a35cf/cancel` → **200**

```json
{
  "command_id": "af4da366-91a3-4937-bf50-5d5885d21595",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8a8b889b-eee1-4130-8d2b-f548ce5a35cf",
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
  "created_at": "2026-10-30T07:37:41.221932Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676039921"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
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
  "command_id": "f8aa1b3e-f271-4f7b-8261-7317c146ac81",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T07:37:52.394155Z",
  "extension": "101"
}
```

Done: outgoing call ab59b965-bdf5-449d-acc2-606a378f0fdc from order 8a8b889b-eee1-4130-8d2b-f548ce5a35cf, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632989894",
  "device_ref": "sandbox-4606"
}
```

```json
{
  "challenge_id": "29d6e5e4-6a2f-489c-9267-ac0ec71810cd",
  "expires_at": "2026-10-30T07:42:52.704139967Z",
  "resend_available_at": "2026-10-30T07:37:53.704139967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632989894` → **200**

```json
{
  "phone": "+380632989894",
  "audience": "CLIENT",
  "code": "518216",
  "sent_at": "2026-10-30T07:37:52.706866141Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29d6e5e4-6a2f-489c-9267-ac0ec71810cd",
  "code": "518216",
  "device_ref": "sandbox-4606"
}
```

```json
{
  "session_id": "4e17f837-ba15-4ae3-9412-c13d4a842e17",
  "subject": {
    "type": "CLIENT",
    "id": "90df9c0e-af57-4138-8c54-2059a67e5970"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MGRmOWMwZS1hZjU3LTQxMzgtOGM1NC0yMDU5YTY3ZTU5NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NzczLCJpYXQiOjE3OTMzNDU4NzMsImp0aSI6ImEwYTE5YzdhLTk0OWItNDkzNi04NzA4LTBlNjZhOGZhYTRkZiIsInNpZCI6IjRlMTdmODM3LWJhMTUtNGFlMy05NDEyLWMxM2Q0YTg0MmUxNyJ9.4OucZmgZcUnfC0ELUP70rsX8WxTvc8P3zgRhkma81FU",
  "access_expires_at": "2026-10-30T07:52:53.00547154Z",
  "refresh_token": "jSL6L4BUO4kew8FQsTOcuURyNShPW2MrKsvTUcbdFxM",
  "refresh_expires_at": "2026-11-29T07:37:53.004865907Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "90df9c0e-af57-4138-8c54-2059a67e5970",
  "session_id": "4e17f837-ba15-4ae3-9412-c13d4a842e17",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632989894",
  "device_ref": "sandbox-27001"
}
```

```json
{
  "challenge_id": "23b823ac-a3a7-4947-8b3c-18b2a0c17af0",
  "expires_at": "2026-10-30T07:42:55.556100333Z",
  "resend_available_at": "2026-10-30T07:37:56.556100333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632989894` → **200**

```json
{
  "phone": "+380632989894",
  "audience": "CLIENT",
  "code": "065670",
  "sent_at": "2026-10-30T07:37:55.558711275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23b823ac-a3a7-4947-8b3c-18b2a0c17af0",
  "code": "065670",
  "device_ref": "sandbox-27001"
}
```

```json
{
  "session_id": "34e485c8-21af-498f-a3f5-bc70c8fd9702",
  "subject": {
    "type": "CLIENT",
    "id": "90df9c0e-af57-4138-8c54-2059a67e5970"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MGRmOWMwZS1hZjU3LTQxMzgtOGM1NC0yMDU5YTY3ZTU5NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2Nzc1LCJpYXQiOjE3OTMzNDU4NzUsImp0aSI6IjgyZTdlZmRjLTA5YWQtNDZmNy1hYTE3LWU3ZjAzYmVkZDUzMyIsInNpZCI6IjM0ZTQ4NWM4LTIxYWYtNDk4Zi1hM2Y1LWJjNzBjOGZkOTcwMiJ9.jpx10ltQr4YoFgYvEHkxMxRk0r5k-nruatu54oDt5Cw",
  "access_expires_at": "2026-10-30T07:52:55.86106735Z",
  "refresh_token": "Lz5eVLpvkW2GV0rY-tcI_hAbkE3VXL-HLxJREzfCoTI",
  "refresh_expires_at": "2026-11-29T07:37:55.860545303Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "864f8258-da6f-4325-a6db-6d04390b0ea1",
  "expires_at": "2026-10-30T07:42:58.154859315Z",
  "resend_available_at": "2026-10-30T07:37:59.154859315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632989894` → **200**

```json
{
  "phone": "+380632989894",
  "audience": "CLIENT",
  "code": "371081",
  "sent_at": "2026-10-30T07:37:58.157393276Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630373600"
}
```

```json
{
  "challenge_id": "78bc0e14-f887-42b8-8f00-cae29000d351",
  "expires_at": "2026-10-30T07:42:58.463622536Z",
  "resend_available_at": "2026-10-30T07:37:59.463622536Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630373600` → **200**

```json
{
  "phone": "+380630373600",
  "audience": "CLIENT",
  "code": "849532",
  "sent_at": "2026-10-30T07:37:58.466077372Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "075ca459-cefc-4d05-ad55-c3c26f789adf",
  "current_challenge_id": "864f8258-da6f-4325-a6db-6d04390b0ea1",
  "current_code": "000000",
  "new_challenge_id": "78bc0e14-f887-42b8-8f00-cae29000d351",
  "new_code": "849532"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "7255931a-6701-4d4b-86b0-c06d56dc0cd2"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "8baa4083-7d54-49ee-9159-be1e8359f0ec",
  "current_challenge_id": "864f8258-da6f-4325-a6db-6d04390b0ea1",
  "current_code": "371081",
  "new_challenge_id": "78bc0e14-f887-42b8-8f00-cae29000d351",
  "new_code": "849532"
}
```

```json
{
  "subject_id": "90df9c0e-af57-4138-8c54-2059a67e5970",
  "phone": "+380630373600",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "90df9c0e-af57-4138-8c54-2059a67e5970",
  "session_id": "4e17f837-ba15-4ae3-9412-c13d4a842e17",
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
  "correlation_id": "99a04e4b-389c-4444-beaa-6201036d6a01"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630373600",
  "device_ref": "sandbox-27490"
}
```

```json
{
  "challenge_id": "241f84d8-2598-4d24-8cec-94fca5590234",
  "expires_at": "2026-10-30T07:43:01.92734944Z",
  "resend_available_at": "2026-10-30T07:38:02.92734944Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630373600` → **200**

```json
{
  "phone": "+380630373600",
  "audience": "CLIENT",
  "code": "377894",
  "sent_at": "2026-10-30T07:38:01.930170381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "241f84d8-2598-4d24-8cec-94fca5590234",
  "code": "377894",
  "device_ref": "sandbox-27490"
}
```

```json
{
  "session_id": "140cb6e6-2722-4fad-906c-ba5dd1e7c642",
  "subject": {
    "type": "CLIENT",
    "id": "90df9c0e-af57-4138-8c54-2059a67e5970"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MGRmOWMwZS1hZjU3LTQxMzgtOGM1NC0yMDU5YTY3ZTU5NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2NzgyLCJpYXQiOjE3OTMzNDU4ODIsImp0aSI6IjRiNzVhODhiLWJiYzgtNGM3ZC05ZWVjLTFjYTY1OGVlMWFkYSIsInNpZCI6IjE0MGNiNmU2LTI3MjItNGZhZC05MDZjLWJhNWRkMWU3YzY0MiJ9.l9qHvzdGUC9LRUwtLafR0RypJOOsnGiVUg3i9UIfZ58",
  "access_expires_at": "2026-10-30T07:53:02.24158187Z",
  "refresh_token": "lGVxgdebXW9QgZ5Q7jUGBJPgfmg2uVvLFSbfLb6SHoQ",
  "refresh_expires_at": "2026-11-29T07:38:02.241051528Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "90df9c0e-af57-4138-8c54-2059a67e5970",
  "session_id": "140cb6e6-2722-4fad-906c-ba5dd1e7c642",
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
  "session_id": "a742f62c-bcb7-4dd0-87b5-f954baebee49",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3ODMsImlhdCI6MTc5MzM0NTg4MywianRpIjoiNzQ5ZDM4OTMtMDE1Ni00YjEyLWJiODYtMDc3YzAyZDFhZWIxIiwic2lkIjoiYTc0MmY2MmMtYmNiNy00ZGQwLTg3YjUtZjk1NGJhZWJlZTQ5In0.B9lJKRv98wv2fVA91KrTrHqfwZqhhgGlX6jK-IP17bY",
  "access_expires_at": "2026-10-30T07:53:03.100018018Z",
  "refresh_token": "HzLMM5xgCFGqXpvjaQUGBSKe2CezaJs1qHqgEqdh0Vs",
  "refresh_expires_at": "2026-10-30T19:38:03.099519454Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/90df9c0e-af57-4138-8c54-2059a67e5970` → **200**

```json
{
  "client": {
    "id": "90df9c0e-af57-4138-8c54-2059a67e5970",
    "phone": "+380630373600",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T07:37:53.003341Z",
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

`POST /api/admin/v1/clients/90df9c0e-af57-4138-8c54-2059a67e5970/phone/new-code` → **201**

```json
{
  "phone": "+380634408088"
}
```

```json
{
  "challenge_id": "3c2fa66f-1989-4492-86dd-4ff8c225926d",
  "expires_at": "2026-10-30T07:43:03.697084479Z",
  "resend_available_at": "2026-10-30T07:38:04.697084479Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634408088` → **200**

```json
{
  "phone": "+380634408088",
  "audience": "CLIENT",
  "code": "270197",
  "sent_at": "2026-10-30T07:38:03.699821363Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/90df9c0e-af57-4138-8c54-2059a67e5970/phone` → **422**

```json
{
  "command_id": "a9c34149-def9-4540-9ab8-ca6ea01d05cb",
  "expected_version": 3,
  "new_challenge_id": "3c2fa66f-1989-4492-86dd-4ff8c225926d",
  "new_code": "270198",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/90df9c0e-af57-4138-8c54-2059a67e5970/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "033fe884-e3fa-4b14-b319-da661038fa00"
}
```

`POST /api/admin/v1/clients/90df9c0e-af57-4138-8c54-2059a67e5970/phone` → **400**

```json
{
  "command_id": "34b9b846-29e4-4708-b730-5e534f401a6c",
  "expected_version": 3,
  "new_challenge_id": "3c2fa66f-1989-4492-86dd-4ff8c225926d",
  "new_code": "270197",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/90df9c0e-af57-4138-8c54-2059a67e5970/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "43149b31-5869-4576-8d04-4732dbc8cea0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/90df9c0e-af57-4138-8c54-2059a67e5970/phone` → **200**

```json
{
  "command_id": "bf914a39-d881-4a30-a005-e2529bb0ceb3",
  "expected_version": 3,
  "new_challenge_id": "3c2fa66f-1989-4492-86dd-4ff8c225926d",
  "new_code": "270197",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "90df9c0e-af57-4138-8c54-2059a67e5970",
  "phone": "+380634408088",
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
  "correlation_id": "e1077bb7-cc50-469d-a01a-3da5c4672f19"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634408088",
  "device_ref": "sandbox-16248"
}
```

```json
{
  "challenge_id": "f3d4328f-f2d3-4fdb-a1b4-f2b6b0ff9dde",
  "expires_at": "2026-10-30T07:43:05.15301747Z",
  "resend_available_at": "2026-10-30T07:38:06.15301747Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634408088` → **200**

```json
{
  "phone": "+380634408088",
  "audience": "CLIENT",
  "code": "674325",
  "sent_at": "2026-10-30T07:38:05.156254971Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3d4328f-f2d3-4fdb-a1b4-f2b6b0ff9dde",
  "code": "674325",
  "device_ref": "sandbox-16248"
}
```

```json
{
  "session_id": "09d602ec-d760-4ae7-82fb-4f80ff9caba6",
  "subject": {
    "type": "CLIENT",
    "id": "90df9c0e-af57-4138-8c54-2059a67e5970"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MGRmOWMwZS1hZjU3LTQxMzgtOGM1NC0yMDU5YTY3ZTU5NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2Nzg1LCJpYXQiOjE3OTMzNDU4ODUsImp0aSI6IjYzZmNhMjY4LTA5MjMtNDc4OS04Y2JmLWZjMTkwYzgyMTdmNSIsInNpZCI6IjA5ZDYwMmVjLWQ3NjAtNGFlNy04MmZiLTRmODBmZjljYWJhNiJ9.I-HPwqZ2-5oZilaHGZu7L0lfSUpxssSGMToYASno668",
  "access_expires_at": "2026-10-30T07:53:05.465784417Z",
  "refresh_token": "scBz6KeI_VmDUPABEmGntQbB4lGu4LirkZljcpWOcso",
  "refresh_expires_at": "2026-11-29T07:38:05.465254094Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "90df9c0e-af57-4138-8c54-2059a67e5970",
  "session_id": "09d602ec-d760-4ae7-82fb-4f80ff9caba6",
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
  "phone": "+380636215426",
  "device_ref": "sandbox-28782"
}
```

```json
{
  "challenge_id": "433f2868-25c7-410f-bac2-80d3509b88ed",
  "expires_at": "2026-10-30T07:43:06.035879997Z",
  "resend_available_at": "2026-10-30T07:38:07.035879997Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636215426` → **200**

```json
{
  "phone": "+380636215426",
  "audience": "CLIENT",
  "code": "266004",
  "sent_at": "2026-10-30T07:38:06.038566023Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "433f2868-25c7-410f-bac2-80d3509b88ed",
  "code": "266004",
  "device_ref": "sandbox-28782"
}
```

```json
{
  "session_id": "42e485f0-29e9-4b7c-8758-7d29c311401d",
  "subject": {
    "type": "CLIENT",
    "id": "93bbf36f-ddad-4625-9c3a-778f8a4890f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5M2JiZjM2Zi1kZGFkLTQ2MjUtOWMzYS03NzhmOGE0ODkwZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2Nzg2LCJpYXQiOjE3OTMzNDU4ODYsImp0aSI6IjFiYTk3OWVhLWQ2M2QtNDQxYy1iYjk4LWY5NDY5ZmIzNDJlYiIsInNpZCI6IjQyZTQ4NWYwLTI5ZTktNGI3Yy04NzU4LTdkMjljMzExNDAxZCJ9._nlsag4A2OvHoNIwktQ6tUMhOueCTWSXE84qYTO_esQ",
  "access_expires_at": "2026-10-30T07:53:06.344167776Z",
  "refresh_token": "ui-zpO2FWMFonNJebWJx63SF51w79bnhG1Py5Y-pgT4",
  "refresh_expires_at": "2026-11-29T07:38:06.34368365Z",
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
  "session_id": "d92df760-e75a-4851-95a6-00734f441f4e",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3ODcsImlhdCI6MTc5MzM0NTg4NywianRpIjoiMWM4NGQ4YzEtYzc4OC00NTZjLWI3NzUtMTI2YWRhOTQ4YzgxIiwic2lkIjoiZDkyZGY3NjAtZTc1YS00ODUxLTk1YTYtMDA3MzRmNDQxZjRlIn0.laVJwD2-1j1-cXrn5UwJuVlxpSxKtC50VTbdbHpKAp0",
  "access_expires_at": "2026-10-30T07:53:07.519861902Z",
  "refresh_token": "HJnb3_HB2FuqK12iA0-MUlCaQXykOsScBreJLTLUuDM",
  "refresh_expires_at": "2026-10-30T19:38:07.519241645Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380636215426` → **200**

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
  "correlation_id": "9236d07b-ab56-4dba-9160-c4f8cdf72cda"
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
  "session_id": "aba322e9-167f-4f9c-bd01-ff6ea9a0f38f",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3ODgsImlhdCI6MTc5MzM0NTg4OCwianRpIjoiMDliMDc4YjItM2Y3ZC00YzlhLWI0MTItZDllZTQ0OTVmNzM4Iiwic2lkIjoiYWJhMzIyZTktMTY3Zi00ZjljLWJkMDEtZmY2ZWE5YTBmMzhmIn0.pCJcjW9KOg1zOFIPf7CWpLVstC73TsOzaP9fU-F99_A",
  "access_expires_at": "2026-10-30T07:53:08.800818972Z",
  "refresh_token": "UOVKU9mumMj1nNiTm6i46SrhqkPP-0veWhcqjDuU44A",
  "refresh_expires_at": "2026-10-30T19:38:08.800327335Z",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T07:34:02.599697Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "333f3b93-feb4-4320-bc08-3b4092f705bb",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T07:38:09.380569434Z"
}
```

## The rider books the airport for 2026-10-30T10:38:08Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600227565",
  "device_ref": "sandbox-15905"
}
```

```json
{
  "challenge_id": "9d11a085-ef47-4351-ba8d-416afd87911e",
  "expires_at": "2026-10-30T07:43:09.667390714Z",
  "resend_available_at": "2026-10-30T07:38:10.667390714Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600227565` → **200**

```json
{
  "phone": "+48600227565",
  "audience": "CLIENT",
  "code": "937793",
  "sent_at": "2026-10-30T07:38:09.671893557Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d11a085-ef47-4351-ba8d-416afd87911e",
  "code": "937793",
  "device_ref": "sandbox-15905"
}
```

```json
{
  "session_id": "65107b43-7548-4b82-b462-e539ff7c15d8",
  "subject": {
    "type": "CLIENT",
    "id": "689c7924-fb45-4028-b88f-70de1293a827"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODljNzkyNC1mYjQ1LTQwMjgtYjg4Zi03MGRlMTI5M2E4MjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2Nzg5LCJpYXQiOjE3OTMzNDU4ODksImp0aSI6ImE4MGMwZTNhLTM4YTMtNDdjYS1iNGZhLTA4NjhiMzFkODgzZiIsInNpZCI6IjY1MTA3YjQzLTc1NDgtNGI4Mi1iNDYyLWU1MzlmZjdjMTVkOCJ9.WFHoiPPScUsM5Ct7d1bL1CDHQQnxA1Jjr0_hurwzSi0",
  "access_expires_at": "2026-10-30T07:53:09.972527689Z",
  "refresh_token": "gdUvEUr5y-yPg1Svy439lWJ9ub0Fc8AwxkJ1VLhE3zk",
  "refresh_expires_at": "2026-11-29T07:38:09.971987618Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ef59627c-d169-4379-8ef1-e479e9dd9d5d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T10:38:08Z"
}
```

```json
{
  "id": "db0457ef-3c3d-455c-82d4-cab9ca83856d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:43:10.267671Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T10:38:08Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8564fe8f-0262-4188-b4f8-eb97c40d793b",
  "quote_id": "db0457ef-3c3d-455c-82d4-cab9ca83856d",
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
  "pickup_at": "2026-10-30T10:38:08Z"
}
```

```json
{
  "id": "708677d5-6146-43c7-a17c-0633c7ab96cf",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "689c7924-fb45-4028-b88f-70de1293a827",
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
  "created_at": "2026-10-30T07:38:10.566191Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T10:38:08Z",
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
  "device_ref": "sandbox-13550"
}
```

```json
{
  "challenge_id": "89fcfa0e-9643-4c56-804b-a3d10ad1a5ac",
  "expires_at": "2026-10-30T07:43:10.867471786Z",
  "resend_available_at": "2026-10-30T07:38:11.867471786Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "840810",
  "sent_at": "2026-10-30T07:38:10.870292989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89fcfa0e-9643-4c56-804b-a3d10ad1a5ac",
  "code": "840810",
  "device_ref": "sandbox-13550"
}
```

```json
{
  "session_id": "3949f030-96cf-46ad-9e4a-ac3b7ba7281a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0Njc5MSwiaWF0IjoxNzkzMzQ1ODkxLCJqdGkiOiI3YmFiZDE0NS1iYzk5LTRiMDUtOWExYy1kYWQwNWNhZjE2NDIiLCJzaWQiOiIzOTQ5ZjAzMC05NmNmLTQ2YWQtOWU0YS1hYzNiN2JhNzI4MWEifQ.Ia3xB_AYOYbEyose24XzlbXINWELO6GcFPoz7hxX1Jg",
  "access_expires_at": "2026-10-30T07:53:11.178001386Z",
  "refresh_token": "2-Qo_TIaVFfqLaqBq7D2BbxB9v19aJpIiyn4zCYm0aY",
  "refresh_expires_at": "2026-11-29T07:38:11.177429875Z",
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
  "command_id": "9ec3b007-dbc9-4e45-9396-90b60c64621a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:38:11Z",
    "sequence": 1793345891723
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2a9eaf3b-b038-42b8-aa99-5161875b0fba",
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
  "last_heartbeat_at": "2026-10-30T07:38:11.741564Z",
  "last_location_at": "2026-10-30T07:38:11.741564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "708677d5-6146-43c7-a17c-0633c7ab96cf",
      "short_number": 24,
      "pickup_at": "2026-10-30T10:38:08Z",
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

`POST /api/driver/v1/preorders/708677d5-6146-43c7-a17c-0633c7ab96cf/reserve` → **200**

```json
{
  "command_id": "e4d58313-18a5-4650-86df-c6077886a13e"
}
```

```json
{
  "id": "6d1d0bfd-3172-4dd9-ade7-14b4ab15743e",
  "state": "RESERVED",
  "order": {
    "order_id": "708677d5-6146-43c7-a17c-0633c7ab96cf",
    "short_number": 24,
    "pickup_at": "2026-10-30T10:38:08Z",
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
  "reserved_at": "2026-10-30T07:38:12.32544Z",
  "confirm_from": "2026-10-30T10:08:08Z",
  "confirm_until": "2026-10-30T10:18:08Z",
  "drop_until": "2026-10-30T09:38:08Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "6d1d0bfd-3172-4dd9-ade7-14b4ab15743e",
      "state": "RESERVED",
      "order": {
        "order_id": "708677d5-6146-43c7-a17c-0633c7ab96cf",
        "short_number": 24,
        "pickup_at": "2026-10-30T10:38:08Z",
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
      "reserved_at": "2026-10-30T07:38:12.32544Z",
      "confirm_from": "2026-10-30T10:08:08Z",
      "confirm_until": "2026-10-30T10:18:08Z",
      "drop_until": "2026-10-30T09:38:08Z"
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
      "id": "6d1d0bfd-3172-4dd9-ade7-14b4ab15743e",
      "state": "RESERVED",
      "order": {
        "order_id": "708677d5-6146-43c7-a17c-0633c7ab96cf",
        "short_number": 24,
        "pickup_at": "2026-10-30T10:38:08Z",
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
      "reserved_at": "2026-10-30T07:38:12.32544Z",
      "confirm_from": "2026-10-30T10:08:08Z",
      "confirm_until": "2026-10-30T10:18:08Z",
      "drop_until": "2026-10-30T09:38:08Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/6d1d0bfd-3172-4dd9-ade7-14b4ab15743e/confirm` → **409**

```json
{
  "command_id": "575fc7c3-62bc-4376-ae01-6138f64ca392"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/6d1d0bfd-3172-4dd9-ade7-14b4ab15743e/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9d5b8eb1-b815-4f38-911d-ac8ace25a7a5"
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
  "session_id": "4c3f3891-13fe-426e-bb0c-d22f18e2b5d1",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY3OTMsImlhdCI6MTc5MzM0NTg5MywianRpIjoiODRmYzBiMTQtMjIzMi00NGNiLThkZjEtMjFlYzRmYjEzNWU4Iiwic2lkIjoiNGMzZjM4OTEtMTNmZS00MjZlLWJiMGMtZDIyZjE4ZTJiNWQxIn0.sWKU5VuY74h9tdWRNQOEQ3nZtErvesuOexEvXXKrtF8",
  "access_expires_at": "2026-10-30T07:53:13.751970725Z",
  "refresh_token": "lolPkSmPEsBOeAe_GQKLHtP77XHaJy6Q4aHmJolg_4I",
  "refresh_expires_at": "2026-10-30T19:38:13.751469617Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/708677d5-6146-43c7-a17c-0633c7ab96cf` → **200**

```json
{
  "id": "708677d5-6146-43c7-a17c-0633c7ab96cf",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "689c7924-fb45-4028-b88f-70de1293a827",
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
  "created_at": "2026-10-30T07:38:10.566191Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T10:38:08Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "6d1d0bfd-3172-4dd9-ade7-14b4ab15743e",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T07:38:12.32544Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/708677d5-6146-43c7-a17c-0633c7ab96cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T07:38:10.567346Z",
      "actor": {
        "type": "CLIENT",
        "id": "689c7924-fb45-4028-b88f-70de1293a827",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "708677d5-6146-43c7-a17c-0633c7ab96cf",
        "preorder": true,
        "quote_id": "db0457ef-3c3d-455c-82d4-cab9ca83856d",
        "pickup_at": "2026-10-30T10:38:08Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "bf45980b-fe46-4183-9075-84ae0ed18206"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T07:38:12.326568Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "708677d5-6146-43c7-a17c-0633c7ab96cf",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "6d1d0bfd-3172-4dd9-ade7-14b4ab15743e"
      },
      "correlation_id": "cc7fb127-1a21-4723-b064-786287f1696c"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 708677d5-6146-43c7-a17c-0633c7ab96cf, reservation 6d1d0bfd-3172-4dd9-ade7-14b4ab15743e.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20439"
}
```

```json
{
  "challenge_id": "ec2b21c9-dacc-4122-a857-91616f75b0ac",
  "expires_at": "2026-10-30T07:43:14.649347991Z",
  "resend_available_at": "2026-10-30T07:38:15.649347991Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "362215",
  "sent_at": "2026-10-30T07:38:14.652016775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec2b21c9-dacc-4122-a857-91616f75b0ac",
  "code": "362215",
  "device_ref": "sandbox-20439"
}
```

```json
{
  "session_id": "5a1c9170-265e-477b-a8d0-a89b6f0cffcf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0Njc5NCwiaWF0IjoxNzkzMzQ1ODk0LCJqdGkiOiJjZWQ2NWNmMS00NTY0LTQ2NmMtOTA2Ny1iNDBlZTkxNWYxMzkiLCJzaWQiOiI1YTFjOTE3MC0yNjVlLTQ3N2ItYThkMC1hODliNmYwY2ZmY2YifQ.M4r5ZYkxvdbLCfd9cR2yvuXPnNgP1pXeUK_rVjplmJk",
  "access_expires_at": "2026-10-30T07:53:14.953599643Z",
  "refresh_token": "9V7qsRvqFglsRD-HM05gIguW0rupu4dyrfC-_3wxmEI",
  "refresh_expires_at": "2026-11-29T07:38:14.953069801Z",
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
  "command_id": "1a3d3430-97e7-40f8-9e2a-dd2950614ae1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:38:15Z",
    "sequence": 1793345895513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4b10518-080a-4bbf-bf0b-85426a57bd92",
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
  "last_heartbeat_at": "2026-10-30T07:38:15.531757Z",
  "last_location_at": "2026-10-30T07:38:15.531757Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673759640",
  "device_ref": "sandbox-28799"
}
```

```json
{
  "challenge_id": "61703855-d2f4-4d1f-a19f-9071ba766063",
  "expires_at": "2026-10-30T07:43:15.82646616Z",
  "resend_available_at": "2026-10-30T07:38:16.82646616Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673759640` → **200**

```json
{
  "phone": "+380673759640",
  "audience": "CLIENT",
  "code": "328099",
  "sent_at": "2026-10-30T07:38:15.82932926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61703855-d2f4-4d1f-a19f-9071ba766063",
  "code": "328099",
  "device_ref": "sandbox-28799"
}
```

```json
{
  "session_id": "b73f84d8-bd10-4f68-a6f6-adbd8a731abc",
  "subject": {
    "type": "CLIENT",
    "id": "a4e12c8c-49ce-4092-95fe-eccf0059a3ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGUxMmM4Yy00OWNlLTQwOTItOTVmZS1lY2NmMDA1OWEzZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2Nzk2LCJpYXQiOjE3OTMzNDU4OTYsImp0aSI6ImU3ZDNjZmQ4LWI1MzQtNDFlNy1iMDEzLTdiMjM0Mzg5MDQxNiIsInNpZCI6ImI3M2Y4NGQ4LWJkMTAtNGY2OC1hNmY2LWFkYmQ4YTczMWFiYyJ9.sTeEBggx7KHmlfq2ulKogSl0EC4l7wUm-X0o9uWO8V0",
  "access_expires_at": "2026-10-30T07:53:16.13564512Z",
  "refresh_token": "ffk84pwupAuIK5_AdDM4yuFX_ky5b--19AHDw8PLsYg",
  "refresh_expires_at": "2026-11-29T07:38:16.134885155Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4b6ea7d3-5691-4d79-97dd-422259d30af4",
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
  "id": "7c4f0d48-7ffb-4d42-9a49-53e7eba2bc69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:43:16.428693Z",
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
  "command_id": "b1fa6b85-f13f-45d6-a6c1-6f85758e703c",
  "quote_id": "7c4f0d48-7ffb-4d42-9a49-53e7eba2bc69",
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
  "id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a4e12c8c-49ce-4092-95fe-eccf0059a3ea",
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
  "created_at": "2026-10-30T07:38:16.722491Z",
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
    "id": "41f46c88-2260-44aa-bd34-772f06aa0e21",
    "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
    "expires_at": "2026-10-30T07:38:31.726065Z",
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

`POST /api/driver/v1/offers/41f46c88-2260-44aa-bd34-772f06aa0e21/accept` → **200**

```json
{
  "command_id": "08e8a19d-bf59-4928-93e0-95498973af55"
}
```

```json
{
  "id": "d24796c6-bb0b-4abb-ba14-aa178e7e705f",
  "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "880cc871-097f-4d16-bd5c-79abf4d5419b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "880cc871-097f-4d16-bd5c-79abf4d5419b",
  "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "assignment_id": "d24796c6-bb0b-4abb-ba14-aa178e7e705f",
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

`POST /api/driver/v1/work-sessions/d4b10518-080a-4bbf-bf0b-85426a57bd92/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:38:17Z",
    "sequence": 1793345897897
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4b10518-080a-4bbf-bf0b-85426a57bd92",
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
  "last_heartbeat_at": "2026-10-30T07:38:17.91698Z",
  "last_location_at": "2026-10-30T07:38:17.91698Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "880cc871-097f-4d16-bd5c-79abf4d5419b",
  "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "assignment_id": "d24796c6-bb0b-4abb-ba14-aa178e7e705f",
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

`POST /api/driver/v1/trips/880cc871-097f-4d16-bd5c-79abf4d5419b/arrive` → **200**

```json
{
  "command_id": "e29c6f59-b0f1-47e7-910d-c76c05a76708",
  "expected_version": 0
}
```

```json
{
  "id": "880cc871-097f-4d16-bd5c-79abf4d5419b",
  "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "assignment_id": "d24796c6-bb0b-4abb-ba14-aa178e7e705f",
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
  "arrived_at": "2026-10-30T07:38:18.468834Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/880cc871-097f-4d16-bd5c-79abf4d5419b/start` → **200**

```json
{
  "command_id": "7d4d0161-5a27-49cf-a844-f645f4a4b32e",
  "expected_version": 1
}
```

```json
{
  "id": "880cc871-097f-4d16-bd5c-79abf4d5419b",
  "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "assignment_id": "d24796c6-bb0b-4abb-ba14-aa178e7e705f",
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
  "arrived_at": "2026-10-30T07:38:18.468834Z",
  "started_at": "2026-10-30T07:38:18.754599Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d4b10518-080a-4bbf-bf0b-85426a57bd92/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:38:19Z",
    "sequence": 1793345899341
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4b10518-080a-4bbf-bf0b-85426a57bd92",
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
  "last_heartbeat_at": "2026-10-30T07:38:19.05226Z",
  "last_location_at": "2026-10-30T07:38:19.05226Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/880cc871-097f-4d16-bd5c-79abf4d5419b/complete` → **200**

```json
{
  "command_id": "c0742dce-ed41-4288-9b66-fb17e21d4d3a",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:38:19Z",
  "cash_received": true
}
```

```json
{
  "id": "880cc871-097f-4d16-bd5c-79abf4d5419b",
  "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "assignment_id": "d24796c6-bb0b-4abb-ba14-aa178e7e705f",
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
  "arrived_at": "2026-10-30T07:38:18.468834Z",
  "started_at": "2026-10-30T07:38:18.754599Z",
  "completed_at": "2026-10-30T07:38:19.337553Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/42c488cd-061d-4e12-a953-63ec1c74b0ce/rating` → **200**

```json
{
  "command_id": "68acd2a3-72f8-4b8f-84c3-20f1c01a9685",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "score": 5,
  "created_at": "2026-10-30T07:38:19.652556426Z"
}
```

`POST /api/driver/v1/orders/42c488cd-061d-4e12-a953-63ec1c74b0ce/rating` → **200**

```json
{
  "command_id": "6d982e72-b365-491a-9647-eaaf08e26c90",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
  "score": 4,
  "created_at": "2026-10-30T07:38:19.943658336Z"
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
  "session_id": "8de9e163-b9d2-4546-86e1-4327297067d0",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MDAsImlhdCI6MTc5MzM0NTkwMCwianRpIjoiOWUwNzJiNDUtNGJlZC00NDFkLWFiYTMtYzhlYmIzMjZiNzkxIiwic2lkIjoiOGRlOWUxNjMtYjlkMi00NTQ2LTg2ZTEtNDMyNzI5NzA2N2QwIn0.UuZjczzY29dqtMgdKP2WHh6InuQLV4bxxnqwVGB-XIs",
  "access_expires_at": "2026-10-30T07:53:20.798167401Z",
  "refresh_token": "fsa40JqMVUUhEIWCOyzbwK3j_HooBjIpylcYW2ouPJ8",
  "refresh_expires_at": "2026-10-30T19:38:20.797691399Z",
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
  "session_id": "33045122-5225-4d43-b1b1-a68f1525ad34",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MDEsImlhdCI6MTc5MzM0NTkwMSwianRpIjoiNzk5MzRkNmEtMzAxZi00NzQwLTg3NjEtYTBlOTE3MzBlNTMxIiwic2lkIjoiMzMwNDUxMjItNTIyNS00ZDQzLWIxYjEtYTY4ZjE1MjVhZDM0In0._4Rkbicn7lp5RFC_UXNa63tLjJ4oVAcTbtEDUeR77Ek",
  "access_expires_at": "2026-10-30T07:53:21.378370416Z",
  "refresh_token": "6Lip-Kcy7w8uQoWuZ_eEdLFvY3gW39WaU1IiHfOWNFo",
  "refresh_expires_at": "2026-10-30T19:38:21.377846094Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/42c488cd-061d-4e12-a953-63ec1c74b0ce/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
      "author_type": "RIDER",
      "author_id": "a4e12c8c-49ce-4092-95fe-eccf0059a3ea",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T07:38:19.652556Z"
    },
    {
      "order_id": "42c488cd-061d-4e12-a953-63ec1c74b0ce",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "a4e12c8c-49ce-4092-95fe-eccf0059a3ea",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T07:38:19.943658Z"
    }
  ]
}
```

Done: ratings for order 42c488cd-061d-4e12-a953-63ec1c74b0ce.

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
  "session_id": "93390b4b-9d97-458e-8f79-a7960d513b8f",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MDIsImlhdCI6MTc5MzM0NTkwMiwianRpIjoiODA5MWQ4NjQtYWU4ZS00YWM4LWFlNjEtMmIyMTM2NDE5NTI1Iiwic2lkIjoiOTMzOTBiNGItOWQ5Ny00NThlLThmNzktYTc5NjBkNTEzYjhmIn0.ZzhgW9Ofl-SCrX2KV_8Uv2D2SiO2g1Mb4NStM0bBdnY",
  "access_expires_at": "2026-10-30T07:53:22.257540886Z",
  "refresh_token": "w05OGz-iTkSQTNi_31GNNuwVKGdag89ctjr0e786rhM",
  "refresh_expires_at": "2026-10-30T19:38:22.256976289Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "2f75a5c1-bebd-4ace-a407-8da03d21ea28",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "1abe3ddf-ffef-40e3-be5c-8e094b8005c1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:38:22.548793Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1abe3ddf-ffef-40e3-be5c-8e094b8005c1` → **200**

```json
{
  "id": "1abe3ddf-ffef-40e3-be5c-8e094b8005c1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:38:22.548793Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1abe3ddf-ffef-40e3-be5c-8e094b8005c1` → **200**

```json
{
  "id": "1abe3ddf-ffef-40e3-be5c-8e094b8005c1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:38:22.548793Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1abe3ddf-ffef-40e3-be5c-8e094b8005c1` → **200**

```json
{
  "id": "1abe3ddf-ffef-40e3-be5c-8e094b8005c1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:38:22.548793Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1abe3ddf-ffef-40e3-be5c-8e094b8005c1` → **200**

```json
{
  "id": "1abe3ddf-ffef-40e3-be5c-8e094b8005c1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T07:38:22.548793Z",
  "ready_at": "2026-10-30T07:38:25.942911Z",
  "expires_at": "2026-10-31T07:38:25.942911Z"
}
```

`GET /api/admin/v1/reports/exports/1abe3ddf-ffef-40e3-be5c-8e094b8005c1/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e388acd6-4769-4dcc-8202-716fa9c8613c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "ab09193a-8bf4-45d6-b379-37fa65ec8e87",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:38:26.996427Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ab09193a-8bf4-45d6-b379-37fa65ec8e87` → **200**

```json
{
  "id": "ab09193a-8bf4-45d6-b379-37fa65ec8e87",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:38:26.996427Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ab09193a-8bf4-45d6-b379-37fa65ec8e87` → **200**

```json
{
  "id": "ab09193a-8bf4-45d6-b379-37fa65ec8e87",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:38:26.996427Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ab09193a-8bf4-45d6-b379-37fa65ec8e87` → **200**

```json
{
  "id": "ab09193a-8bf4-45d6-b379-37fa65ec8e87",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T07:38:26.996427Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ab09193a-8bf4-45d6-b379-37fa65ec8e87` → **200**

```json
{
  "id": "ab09193a-8bf4-45d6-b379-37fa65ec8e87",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T07:38:26.996427Z",
  "ready_at": "2026-10-30T07:38:30.950325Z",
  "expires_at": "2026-10-31T07:38:30.950325Z"
}
```

`GET /api/admin/v1/reports/exports/ab09193a-8bf4-45d6-b379-37fa65ec8e87/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/2e8578f2-4f94-4eb5-af4a-9b295fcffbe1` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/2e8578f2-4f94-4eb5-af4a-9b295fcffbe1",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "937eb7a9-9977-4e3f-be6b-46820d789e81"
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
  "device_ref": "sandbox-8774"
}
```

```json
{
  "challenge_id": "9bbe1f97-94ba-4a9e-9add-9b490939970e",
  "expires_at": "2026-10-30T07:43:31.746864652Z",
  "resend_available_at": "2026-10-30T07:38:32.746864652Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "673650",
  "sent_at": "2026-10-30T07:38:31.749583097Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9bbe1f97-94ba-4a9e-9add-9b490939970e",
  "code": "673650",
  "device_ref": "sandbox-8774"
}
```

```json
{
  "session_id": "297bc721-72d9-48a2-a6ce-ae96c3a29990",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjgxMiwiaWF0IjoxNzkzMzQ1OTEyLCJqdGkiOiI1NGIyNTk3NC0wMmQ0LTQ3MDQtYjUzNy02OTkzY2IyYWNlMjUiLCJzaWQiOiIyOTdiYzcyMS03MmQ5LTQ4YTItYTZjZS1hZTk2YzNhMjk5OTAifQ.faIgFDEsB6m1XP2iu5K3twbX3PzySYhLk8FQtLAJEs8",
  "access_expires_at": "2026-10-30T07:53:32.059619238Z",
  "refresh_token": "Jdgu0MD8NwY0FhM1LsTireo5imSIFw-RPsdPtKU4S8Q",
  "refresh_expires_at": "2026-11-29T07:38:32.059073587Z",
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
  "command_id": "47277d98-d112-4d62-83c3-cf952c5bce00",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:38:32Z",
    "sequence": 1793345912893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7db7c4ee-2d27-45d8-b323-efd8f6a5e03e",
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
  "last_heartbeat_at": "2026-10-30T07:38:32.91267Z",
  "last_location_at": "2026-10-30T07:38:32.91267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "c714e2fc-0d89-432e-acc6-ed23953b0c50",
  "points": [
    {
      "sequence": 1793345915214,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T07:37:35Z"
    },
    {
      "sequence": 1793345915222,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T07:38:35Z"
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
  "session_id": "14a0990d-5910-4497-9ce3-7d0fd116825f",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MTUsImlhdCI6MTc5MzM0NTkxNSwianRpIjoiNDgyODU1MjgtMjZlNC00M2Y5LWE1ZGYtNTVmNzRmODY4ZThhIiwic2lkIjoiMTRhMDk5MGQtNTkxMC00NDk3LTljZTMtN2QwZmQxMTY4MjVmIn0.TyGsW7a3wmgtgU1b23nRTaX2eK_LT0M6sF6iAlgzwcQ",
  "access_expires_at": "2026-10-30T07:53:35.861136815Z",
  "refresh_token": "VA1IOvryhOUgyd5n_mc-lpqIq_22oep7WvLvFgVkDdI",
  "refresh_expires_at": "2026-10-30T19:38:35.860601544Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "446aefb9-344f-4784-9085-3a21176cb49a",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T07:38:35Z",
        "track_point_id": "49c9cfb7-84dc-488d-9436-d937951bcfba",
        "work_session_id": "7db7c4ee-2d27-45d8-b323-efd8f6a5e03e"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T07:38:35Z",
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

`POST /api/admin/v1/driver-risk-flags/446aefb9-344f-4784-9085-3a21176cb49a/confirm` → **200**

```json
{
  "command_id": "ee733885-29cd-4887-a89e-950e02670a67",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "446aefb9-344f-4784-9085-3a21176cb49a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T07:38:35Z",
    "track_point_id": "49c9cfb7-84dc-488d-9436-d937951bcfba",
    "work_session_id": "7db7c4ee-2d27-45d8-b323-efd8f6a5e03e"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T07:38:35Z",
  "reason": null,
  "reviewed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reviewed_at": "2026-10-30T07:38:36.781838Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/446aefb9-344f-4784-9085-3a21176cb49a/dismiss` → **409**

```json
{
  "command_id": "824211e3-39c1-404c-931a-e335345e4d31",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/446aefb9-344f-4784-9085-3a21176cb49a/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "61f5bbdc-5f43-4cd8-bf8b-0371350b06f0"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "e72fe59b-0d8d-4cae-88df-8c384b25ce8c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "60de48a4-f060-4b9d-9c05-5a673557e369",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "raised_at": "2026-10-30T07:38:37.388243Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/60de48a4-f060-4b9d-9c05-5a673557e369/dismiss` → **200**

```json
{
  "command_id": "79b9d6ff-8936-4514-a74e-d58ce43bac3d",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "60de48a4-f060-4b9d-9c05-5a673557e369",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "raised_at": "2026-10-30T07:38:37.388243Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reviewed_at": "2026-10-30T07:38:37.696064Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "e0f39c9d-ca0a-4353-bd61-285b90b5ab08",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "446aefb9-344f-4784-9085-3a21176cb49a"
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
      "actor_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T07:38:37.997918Z"
    }
  ]
}
```

Done: flag 446aefb9-344f-4784-9085-3a21176cb49a confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "6d1095be-3a53-423b-a984-9edd5f5f73bd",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MTgsImlhdCI6MTc5MzM0NTkxOCwianRpIjoiMjBkZTE0ZmMtNmU1NC00OTliLTg1NTItMGJiZTQwZWVjYmE3Iiwic2lkIjoiNmQxMDk1YmUtM2E1My00MjNiLWE5ODQtOWVkZDVmNWY3M2JkIn0.q0PCcNPQGV8V5ISpD0Kyl0b7g7bsbYmlC-ASQZCdrEE",
  "access_expires_at": "2026-10-30T07:53:38.881227954Z",
  "refresh_token": "Rx13YG6OOVkppycfqPydjy1AySIYVyjgV951iJ1SXvc",
  "refresh_expires_at": "2026-10-30T19:38:38.880653789Z",
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
      "actor_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T07:38:37.997918Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "234bb623-2868-4288-91da-caf4728d4e34",
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
  "session_id": "7db7c4ee-2d27-45d8-b323-efd8f6a5e03e",
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
  "last_heartbeat_at": "2026-10-30T07:38:32.91267Z",
  "last_location_at": "2026-10-30T07:38:32.91267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7db7c4ee-2d27-45d8-b323-efd8f6a5e03e/close` → **200**

```json
{
  "command_id": "d75b5451-91ad-495e-a7c0-c993d74f997c",
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
  "session_id": "b2095809-264d-4d83-8ad2-5cdca6df4132",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MjAsImlhdCI6MTc5MzM0NTkyMCwianRpIjoiYzk1MDdmYjgtNmU5NC00ZTVlLThjZmMtYjg3N2M0ZDg1YWNlIiwic2lkIjoiYjIwOTU4MDktMjY0ZC00ZDgzLThhZDItNWNkY2E2ZGY0MTMyIn0.gTP6z0VjTUb3bUNEkmhR_PwS8vxKpyN77LiAnKufVZI",
  "access_expires_at": "2026-10-30T07:53:40.662688629Z",
  "refresh_token": "BC25ZDk_oIEi99n6D7XAM1RPx8F4OyM0EG_9jOncgpg",
  "refresh_expires_at": "2026-10-30T19:38:40.662090691Z",
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
  "command_id": "a05ade54-87b6-4d70-bb44-578053c39253",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T07:38:41.261905Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "a05ade54-87b6-4d70-bb44-578053c39253",
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
  "changed_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T07:38:41.261905Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48624538122",
  "device_ref": "sandbox-20665"
}
```

```json
{
  "challenge_id": "588e8000-e505-465d-9fa1-3363ede4cd0c",
  "expires_at": "2026-10-30T07:43:41.850640315Z",
  "resend_available_at": "2026-10-30T07:38:42.850640315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48624538122` → **200**

```json
{
  "phone": "+48624538122",
  "audience": "CLIENT",
  "code": "419275",
  "sent_at": "2026-10-30T07:38:41.853922421Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "588e8000-e505-465d-9fa1-3363ede4cd0c",
  "code": "419275",
  "device_ref": "sandbox-20665"
}
```

```json
{
  "session_id": "4cc9d7b0-db67-432a-b956-dc7c21dd8215",
  "subject": {
    "type": "CLIENT",
    "id": "f6602966-3563-4e1f-bdcf-bd39c9352a4f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjYwMjk2Ni0zNTYzLTRlMWYtYmRjZi1iZDM5YzkzNTJhNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2ODIyLCJpYXQiOjE3OTMzNDU5MjIsImp0aSI6IjRkNTJmZjNlLWNiNjItNGUzMi1iYmEyLWRkMGM4OTBhNTkyOCIsInNpZCI6IjRjYzlkN2IwLWRiNjctNDMyYS1iOTU2LWRjN2MyMWRkODIxNSJ9.5Nts5YCWFfcSK_S16ToOv9qefB81dAsLty9HyTCQJ3M",
  "access_expires_at": "2026-10-30T07:53:42.161878129Z",
  "refresh_token": "YStdqbjs4PSDrWk-XaTiOfACZGLyMYYQwkjWO0bmHGg",
  "refresh_expires_at": "2026-11-29T07:38:42.161399925Z",
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
  "correlation_id": "b86604a8-7a3d-47c7-b780-db672348146d"
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
  "device_ref": "sandbox-17477"
}
```

```json
{
  "challenge_id": "90e74dd9-0b92-4ec4-af14-ea198ee05017",
  "expires_at": "2026-10-30T07:43:43.032556068Z",
  "resend_available_at": "2026-10-30T07:38:44.032556068Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "406921",
  "sent_at": "2026-10-30T07:38:43.035719099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90e74dd9-0b92-4ec4-af14-ea198ee05017",
  "code": "406921",
  "device_ref": "sandbox-17477"
}
```

```json
{
  "session_id": "431e8ecb-0700-4719-a95b-b48d4ed5a593",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjgyMywiaWF0IjoxNzkzMzQ1OTIzLCJqdGkiOiJlNDQ4MzFkNS0yMWE0LTQzMTgtODgyZC0xM2IxMzE1NGQ0ZGUiLCJzaWQiOiI0MzFlOGVjYi0wNzAwLTQ3MTktYTk1Yi1iNDhkNGVkNWE1OTMifQ.SpwxvwU2YzZAEbopn5Z12YDjqS7jWrKL7GLZDAWg6bo",
  "access_expires_at": "2026-10-30T07:53:43.344421743Z",
  "refresh_token": "JDXSiMvz9gcQOkChnNs1pfY5oTFC0Y9BNgkvDcF0fbM",
  "refresh_expires_at": "2026-11-29T07:38:43.343875031Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2a9eaf3b-b038-42b8-aa99-5161875b0fba",
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
  "last_heartbeat_at": "2026-10-30T07:38:11.741564Z",
  "last_location_at": "2026-10-30T07:38:11.741564Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2a9eaf3b-b038-42b8-aa99-5161875b0fba/handover` → **200**

```json
{
  "command_id": "dfe4c246-97cf-4cd7-87a5-ed2a65132c20",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2a9eaf3b-b038-42b8-aa99-5161875b0fba",
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
  "last_heartbeat_at": "2026-10-30T07:38:11.741564Z",
  "last_location_at": "2026-10-30T07:38:11.741564Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2a9eaf3b-b038-42b8-aa99-5161875b0fba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:38:44Z",
    "sequence": 1793345924196
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2a9eaf3b-b038-42b8-aa99-5161875b0fba",
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
  "last_heartbeat_at": "2026-10-30T07:38:44.213673Z",
  "last_location_at": "2026-10-30T07:38:44.213673Z",
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
  "session_id": "2a9eaf3b-b038-42b8-aa99-5161875b0fba",
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
  "last_heartbeat_at": "2026-10-30T07:38:44.213673Z",
  "last_location_at": "2026-10-30T07:38:44.213673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a9eaf3b-b038-42b8-aa99-5161875b0fba/close` → **200**

```json
{
  "command_id": "e2fb1a53-3d5c-447d-b7bd-86f505fbab59",
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
  "correlation_id": "70ccf88b-0d28-42ff-83fe-3668827c70ed"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678846286",
  "device_ref": "sandbox-29844"
}
```

```json
{
  "challenge_id": "32a27d50-37af-4d27-bf49-75e9c126b7c8",
  "expires_at": "2026-10-30T07:43:45.653633063Z",
  "resend_available_at": "2026-10-30T07:38:46.653633063Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678846286` → **200**

```json
{
  "phone": "+380678846286",
  "audience": "CLIENT",
  "code": "441766",
  "sent_at": "2026-10-30T07:38:45.656611037Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32a27d50-37af-4d27-bf49-75e9c126b7c8",
  "code": "441766",
  "device_ref": "sandbox-29844"
}
```

```json
{
  "session_id": "096d4778-9ffe-4282-bc91-5bd3ba885399",
  "subject": {
    "type": "CLIENT",
    "id": "b4c5588a-9359-4b1c-b7ec-721fd115196c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNGM1NTg4YS05MzU5LTRiMWMtYjdlYy03MjFmZDExNTE5NmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2ODI1LCJpYXQiOjE3OTMzNDU5MjUsImp0aSI6IjdmMjllNTEwLTcwOTQtNDkxYi05OGY5LTdkNzIyNDU0YmIzYyIsInNpZCI6IjA5NmQ0Nzc4LTlmZmUtNDI4Mi1iYzkxLTViZDNiYTg4NTM5OSJ9.9BCa6fNQ0-ezk64arD3nVRZdqQKjCu9010-wwLbl0go",
  "access_expires_at": "2026-10-30T07:53:45.968803894Z",
  "refresh_token": "L2MPmr9wBlkwTI54tnj8EK-406s3Prd7ww8DF7vv-ik",
  "refresh_expires_at": "2026-11-29T07:38:45.968313145Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "3ec63109-b1cf-4e3a-9bda-c47b9ba3d6ac",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "66bd52c5-cf72-4995-ba5f-31a46ff0de52",
  "upload_path": "/api/rider/v1/uploads/66bd52c5-cf72-4995-ba5f-31a46ff0de52",
  "expires_at": "2026-10-30T07:53:46.252304502Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/66bd52c5-cf72-4995-ba5f-31a46ff0de52` → **200**

```json
{
  "file_id": "66bd52c5-cf72-4995-ba5f-31a46ff0de52",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "4ee47e93-bb82-4a0c-a97b-9eb1081d18a1",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "66bd52c5-cf72-4995-ba5f-31a46ff0de52"
  ]
}
```

```json
{
  "id": "7a000c32-e973-4f26-ad9c-ddccc5e31a06",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b4c5588a-9359-4b1c-b7ec-721fd115196c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T07:38:46.589312Z",
  "updated_at": "2026-10-30T07:38:46.589312Z",
  "respond_by": "2026-10-30T11:38:46.589312Z",
  "messages": [
    {
      "id": "f5c1700b-3e99-43e9-861e-d50799fe2a62",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b4c5588a-9359-4b1c-b7ec-721fd115196c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T07:38:46.590914Z",
      "attachments": [
        {
          "file_id": "66bd52c5-cf72-4995-ba5f-31a46ff0de52",
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
  "session_id": "e89f37c3-ac03-4126-a498-c5922557544f",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MjcsImlhdCI6MTc5MzM0NTkyNywianRpIjoiOWJjZmMwNzMtN2RjOC00N2I1LTg3YjgtMzMzYjBmZDI3MjBkIiwic2lkIjoiZTg5ZjM3YzMtYWMwMy00MTI2LWE0OTgtYzU5MjI1NTc1NDRmIn0.rpd4wyZSVOIo-evwu9ZKaRmWmrTEr24MaO3Zr2DbCi0",
  "access_expires_at": "2026-10-30T07:53:47.237738848Z",
  "refresh_token": "EzqD88tTf0VyCP9WjHftAlh5AweKbjNp9KGLFIdFwiY",
  "refresh_expires_at": "2026-10-30T19:38:47.237084402Z",
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
  "session_id": "f8ee970d-f1f2-424c-8ccd-12f27ddb8c41",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MjcsImlhdCI6MTc5MzM0NTkyNywianRpIjoiZmMyMTQwZGUtZDZhYi00Y2NmLWIxZDQtMzAwMTg2MDBmMWM1Iiwic2lkIjoiZjhlZTk3MGQtZjFmMi00MjRjLThjY2QtMTJmMjdkZGI4YzQxIn0.RII91BxHRo09GfWrIh3pGt0Vi-9UOIdpJySP6cmy0DM",
  "access_expires_at": "2026-10-30T07:53:47.844443143Z",
  "refresh_token": "yV9-8vntDCSvnCZ8MDI0nyUMt4W5XS2fwpKx3ea3MmM",
  "refresh_expires_at": "2026-10-30T19:38:47.843906778Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/7a000c32-e973-4f26-ad9c-ddccc5e31a06/attachments/66bd52c5-cf72-4995-ba5f-31a46ff0de52` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "0cd00129-0d32-4edb-a1fa-3eb81b06481f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0074d944-5524-4a43-93fc-c8852123bd53",
  "upload_path": "/api/operator/v1/uploads/0074d944-5524-4a43-93fc-c8852123bd53",
  "expires_at": "2026-10-30T07:53:48.148273584Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/0074d944-5524-4a43-93fc-c8852123bd53` → **200**

```json
{
  "file_id": "0074d944-5524-4a43-93fc-c8852123bd53",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/7a000c32-e973-4f26-ad9c-ddccc5e31a06` → **200**

```json
{
  "id": "7a000c32-e973-4f26-ad9c-ddccc5e31a06",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b4c5588a-9359-4b1c-b7ec-721fd115196c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T07:38:46.589312Z",
  "updated_at": "2026-10-30T07:38:46.589312Z",
  "respond_by": "2026-10-30T11:38:46.589312Z",
  "messages": [
    {
      "id": "f5c1700b-3e99-43e9-861e-d50799fe2a62",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b4c5588a-9359-4b1c-b7ec-721fd115196c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T07:38:46.590914Z",
      "attachments": [
        {
          "file_id": "66bd52c5-cf72-4995-ba5f-31a46ff0de52",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/7a000c32-e973-4f26-ad9c-ddccc5e31a06/comments` → **200**

```json
{
  "command_id": "6122f452-ae1d-439c-a313-45be135722a9",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "0074d944-5524-4a43-93fc-c8852123bd53"
  ]
}
```

```json
{
  "id": "7a000c32-e973-4f26-ad9c-ddccc5e31a06",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b4c5588a-9359-4b1c-b7ec-721fd115196c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T07:38:46.589312Z",
  "updated_at": "2026-10-30T07:38:48.748002Z",
  "respond_by": "2026-10-30T11:38:46.589312Z",
  "messages": [
    {
      "id": "f5c1700b-3e99-43e9-861e-d50799fe2a62",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b4c5588a-9359-4b1c-b7ec-721fd115196c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T07:38:46.590914Z",
      "attachments": [
        {
          "file_id": "66bd52c5-cf72-4995-ba5f-31a46ff0de52",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4c1829ee-5c0e-4d50-ad6e-0e184f502e2b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T07:38:48.747548Z",
      "attachments": [
        {
          "file_id": "0074d944-5524-4a43-93fc-c8852123bd53",
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

`GET /api/rider/v1/support/cases/7a000c32-e973-4f26-ad9c-ddccc5e31a06` → **200**

```json
{
  "id": "7a000c32-e973-4f26-ad9c-ddccc5e31a06",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b4c5588a-9359-4b1c-b7ec-721fd115196c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T07:38:46.589312Z",
  "updated_at": "2026-10-30T07:38:48.748002Z",
  "respond_by": "2026-10-30T11:38:46.589312Z",
  "messages": [
    {
      "id": "f5c1700b-3e99-43e9-861e-d50799fe2a62",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b4c5588a-9359-4b1c-b7ec-721fd115196c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T07:38:46.590914Z",
      "attachments": [
        {
          "file_id": "66bd52c5-cf72-4995-ba5f-31a46ff0de52",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4c1829ee-5c0e-4d50-ad6e-0e184f502e2b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T07:38:48.747548Z",
      "attachments": [
        {
          "file_id": "0074d944-5524-4a43-93fc-c8852123bd53",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/7a000c32-e973-4f26-ad9c-ddccc5e31a06/attachments/0074d944-5524-4a43-93fc-c8852123bd53` → **200**

Done: support case 7a000c32-e973-4f26-ad9c-ddccc5e31a06, rider attachment 66bd52c5-cf72-4995-ba5f-31a46ff0de52, operator attachment 0074d944-5524-4a43-93fc-c8852123bd53.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737627756",
  "device_ref": "sandbox-20745"
}
```

```json
{
  "challenge_id": "12ae63a9-f8aa-46f4-9e19-d427d6330e92",
  "expires_at": "2026-10-30T07:43:49.370883593Z",
  "resend_available_at": "2026-10-30T07:38:50.370883593Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737627756` → **200**

```json
{
  "phone": "+380737627756",
  "audience": "CLIENT",
  "code": "083958",
  "sent_at": "2026-10-30T07:38:49.374039494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12ae63a9-f8aa-46f4-9e19-d427d6330e92",
  "code": "083958",
  "device_ref": "sandbox-20745"
}
```

```json
{
  "session_id": "cd682e55-12ed-47fe-bddc-778a55fbb398",
  "subject": {
    "type": "CLIENT",
    "id": "767f7234-1b0b-4504-a706-5f15fa625d42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjdmNzIzNC0xYjBiLTQ1MDQtYTcwNi01ZjE1ZmE2MjVkNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2ODI5LCJpYXQiOjE3OTMzNDU5MjksImp0aSI6IjJiODY3YjlhLTYxOTYtNDgyMy04ZTQwLWNmMTE4OTA3MjgzMCIsInNpZCI6ImNkNjgyZTU1LTEyZWQtNDdmZS1iZGRjLTc3OGE1NWZiYjM5OCJ9.yDdRMme3CFFzIK6RUdPsaNe0GGs0KAsF_PusdfohkI0",
  "access_expires_at": "2026-10-30T07:53:49.691511592Z",
  "refresh_token": "AQMLJsT8Qdv5hUn9ByxVdmu4SZc3GglQ2jWN66dIr4I",
  "refresh_expires_at": "2026-11-29T07:38:49.690879368Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b592dfed-c914-432c-9730-c0a6928f5a58",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "103c4918-7fd0-42f4-b3af-faec51fb3b8b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-103c4918-7fd0-42f4-b3af-faec51fb3b8b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6c785ddb894892ffb869637e809dd834",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=103c4918-7fd0-42f4-b3af-faec51fb3b8b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737627756"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=103c4918-7fd0-42f4-b3af-faec51fb3b8b",
  "expires_at": "2026-10-30T08:08:49.981014Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/103c4918-7fd0-42f4-b3af-faec51fb3b8b` → **200**

```json
{
  "id": "103c4918-7fd0-42f4-b3af-faec51fb3b8b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T08:08:49.981014Z",
  "card": {
    "id": "ab2ace71-80f7-4f8e-92f6-8e06dbe70fb1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1597",
    "card_type": "Visa",
    "created_at": "2026-10-30T07:38:50.259448Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2d8e83c-07a7-4654-bffc-3fca053309ad",
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
  "id": "c50ea823-5bc7-4555-839e-4870c224b4b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:43:50.559151Z",
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
  "command_id": "d4d53b47-8602-40f2-98a5-45f1aaa92bcb",
  "quote_id": "c50ea823-5bc7-4555-839e-4870c224b4b9",
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
  "id": "ad41f4b2-82b3-4496-9da4-30bf593cea27",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "767f7234-1b0b-4504-a706-5f15fa625d42",
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
  "created_at": "2026-10-30T07:38:50.852622Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ad41f4b2-82b3-4496-9da4-30bf593cea27` → **200**

```json
{
  "id": "ad41f4b2-82b3-4496-9da4-30bf593cea27",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "767f7234-1b0b-4504-a706-5f15fa625d42",
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
  "created_at": "2026-10-30T07:38:50.852622Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ad41f4b2-82b3-4496-9da4-30bf593cea27` → **200**

```json
{
  "id": "ad41f4b2-82b3-4496-9da4-30bf593cea27",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "767f7234-1b0b-4504-a706-5f15fa625d42",
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
  "created_at": "2026-10-30T07:38:50.852622Z",
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

`GET /api/rider/v1/orders/ad41f4b2-82b3-4496-9da4-30bf593cea27` → **200**

```json
{
  "id": "ad41f4b2-82b3-4496-9da4-30bf593cea27",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "767f7234-1b0b-4504-a706-5f15fa625d42",
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
  "created_at": "2026-10-30T07:38:50.852622Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ad41f4b2-82b3-4496-9da4-30bf593cea27/switch-to-cash` → **200**

```json
{
  "command_id": "5d6a6769-e701-4008-9bce-dac925ce9681",
  "expected_version": 3
}
```

```json
{
  "id": "ad41f4b2-82b3-4496-9da4-30bf593cea27",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "767f7234-1b0b-4504-a706-5f15fa625d42",
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
  "created_at": "2026-10-30T07:38:50.852622Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ad41f4b2-82b3-4496-9da4-30bf593cea27/switch-to-cash` → **409**

```json
{
  "command_id": "54795354-0651-4ec3-9740-5c007df58173",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/ad41f4b2-82b3-4496-9da4-30bf593cea27/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3fad1fa7-444f-433f-99f7-02e70a3f529e"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/ad41f4b2-82b3-4496-9da4-30bf593cea27` → **200**

```json
{
  "id": "ad41f4b2-82b3-4496-9da4-30bf593cea27",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "767f7234-1b0b-4504-a706-5f15fa625d42",
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
  "created_at": "2026-10-30T07:38:50.852622Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ad41f4b2-82b3-4496-9da4-30bf593cea27/cancel` → **200**

```json
{
  "command_id": "b1778196-239c-41eb-b69a-1c32b64c90b7",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ad41f4b2-82b3-4496-9da4-30bf593cea27",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "767f7234-1b0b-4504-a706-5f15fa625d42",
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
  "created_at": "2026-10-30T07:38:50.852622Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
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
  "session_id": "db294ba9-63bc-4fc0-a615-95e9e436861b",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MzQsImlhdCI6MTc5MzM0NTkzNCwianRpIjoiZmU0MDZkMmMtYmE1Mi00YjUwLTljNDgtOGU3YjM2YjAyZTk3Iiwic2lkIjoiZGIyOTRiYTktNjNiYy00ZmMwLWE2MTUtOTVlOWU0MzY4NjFiIn0.XwbEYd0UnynUsaHL3G9lvQoQPPKa97t7En0PPRoI4qk",
  "access_expires_at": "2026-10-30T07:53:54.570581253Z",
  "refresh_token": "uRKs3z778ow6mGMv6-6I_0HbgvT6FkFaM1wISYmL0jA",
  "refresh_expires_at": "2026-10-30T19:38:54.570004343Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12439"
}
```

```json
{
  "challenge_id": "aa0279ce-707d-4e32-a9ea-8fdf93d6d1e8",
  "expires_at": "2026-10-30T07:43:54.847690961Z",
  "resend_available_at": "2026-10-30T07:38:55.847690961Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "925280",
  "sent_at": "2026-10-30T07:38:54.850918302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa0279ce-707d-4e32-a9ea-8fdf93d6d1e8",
  "code": "925280",
  "device_ref": "sandbox-12439"
}
```

```json
{
  "session_id": "37706f92-97e9-4cc2-8e8e-9a802f403fc1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjgzNSwiaWF0IjoxNzkzMzQ1OTM1LCJqdGkiOiIzY2FhNTg4NC0yMzc5LTQxN2MtOTJiMi1iMmJiMTI2NmJkZTAiLCJzaWQiOiIzNzcwNmY5Mi05N2U5LTRjYzItOGU4ZS05YTgwMmY0MDNmYzEifQ.SuvNotpL2FRq7ToG7VQTckv3BjLp72cdko_MhQ31fM0",
  "access_expires_at": "2026-10-30T07:53:55.158257885Z",
  "refresh_token": "wTMPrNNdXcn9TzOFSi0cRAcCIGAYU5qRpi4hh3fGicA",
  "refresh_expires_at": "2026-11-29T07:38:55.157714498Z",
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
      "actor_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T07:38:37.997918Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T07:38:39.475739Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "3ffd3717-a849-4062-ad2f-9caba7ac07a2",
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
  "device_ref": "sandbox-504"
}
```

```json
{
  "challenge_id": "ba103d27-13d5-4acf-93a5-0a57bb237775",
  "expires_at": "2026-10-30T07:43:56.326652739Z",
  "resend_available_at": "2026-10-30T07:38:57.326652739Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "905116",
  "sent_at": "2026-10-30T07:38:56.329371104Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba103d27-13d5-4acf-93a5-0a57bb237775",
  "code": "905116",
  "device_ref": "sandbox-504"
}
```

```json
{
  "session_id": "aec80b9f-920a-4a26-a22c-bbd7e9d893f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0NjgzNiwiaWF0IjoxNzkzMzQ1OTM2LCJqdGkiOiI3MDNjYWEwMi1hYzhkLTQyNjMtYmVmNS03NDMyYmU1NmI4Y2IiLCJzaWQiOiJhZWM4MGI5Zi05MjBhLTRhMjYtYTIyYy1iYmQ3ZTlkODkzZjEifQ.Y4XCvpVNVPmG4r8hmoeDKSL4oopveDKzTurpxPWIsGA",
  "access_expires_at": "2026-10-30T07:53:56.642105622Z",
  "refresh_token": "IXM23pdxN_7fDps2caZeC5gc1X7osMeC1Ze0ZiT6oM4",
  "refresh_expires_at": "2026-11-29T07:38:56.641617639Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4b10518-080a-4bbf-bf0b-85426a57bd92",
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
  "last_heartbeat_at": "2026-10-30T07:38:19.05226Z",
  "last_location_at": "2026-10-30T07:38:19.05226Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d4b10518-080a-4bbf-bf0b-85426a57bd92/handover` → **200**

```json
{
  "command_id": "d0fd1ad0-a118-4798-8aca-44b77e720494",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4b10518-080a-4bbf-bf0b-85426a57bd92",
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
  "last_heartbeat_at": "2026-10-30T07:38:19.05226Z",
  "last_location_at": "2026-10-30T07:38:19.05226Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d4b10518-080a-4bbf-bf0b-85426a57bd92/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:38:57Z",
    "sequence": 1793345937496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4b10518-080a-4bbf-bf0b-85426a57bd92",
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
  "last_heartbeat_at": "2026-10-30T07:38:57.516648Z",
  "last_location_at": "2026-10-30T07:38:57.516648Z",
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
  "command_id": "a0afd6a2-45e9-4be1-b88b-dd911756e610",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:38:58Z",
    "sequence": 1793345938939
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a12a2c42-f388-4dad-bc81-55336b3d8bb2",
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
  "last_heartbeat_at": "2026-10-30T07:38:58.111905Z",
  "last_location_at": "2026-10-30T07:38:58.111905Z",
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
  "session_id": "5853900c-9fd5-4913-a679-483f00c2ea44",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDY4MzgsImlhdCI6MTc5MzM0NTkzOCwianRpIjoiNzQ3NWU0M2EtYmVkOC00YWZiLTg3MjgtZjBiNGVmMGUyZGFjIiwic2lkIjoiNTg1MzkwMGMtOWZkNS00OTEzLWE2NzktNDgzZjAwYzJlYTQ0In0.vEHtpMLCdkKAzWZlyCuZG1XK7vjRQSjMLgqXt6pYbkU",
  "access_expires_at": "2026-10-30T07:53:58.684846393Z",
  "refresh_token": "u_2oajle18lS_GgUvdMApxkCVHxs_XkCNUY_n8tB4_Q",
  "refresh_expires_at": "2026-10-30T19:38:58.684300421Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "14e0ef28-d1b8-408d-87aa-b28b589f2c72",
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
  "id": "bf75f763-8a77-42e5-b5b2-606ab5542de9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:43:58.962597Z",
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
  "command_id": "95bff0ec-0730-47a5-b3ff-5c55ba760dab",
  "quote_id": "bf75f763-8a77-42e5-b5b2-606ab5542de9",
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
  "id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
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
  "created_at": "2026-10-30T07:38:59.270739Z",
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
    "id": "5c1a810a-49db-4b1e-89d3-5a94d75dfdb4",
    "order_id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
    "expires_at": "2026-10-30T07:39:14.274501Z",
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

`POST /api/driver/v1/offers/5c1a810a-49db-4b1e-89d3-5a94d75dfdb4/accept` → **200**

```json
{
  "command_id": "712cde51-07ae-405c-a766-65f140d066ad"
}
```

```json
{
  "id": "575ee585-411c-4ce1-afea-026345826116",
  "order_id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "77075f02-9dc2-49a7-bcce-bc32b159ad2e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "77075f02-9dc2-49a7-bcce-bc32b159ad2e",
  "order_id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
  "assignment_id": "575ee585-411c-4ce1-afea-026345826116",
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

`POST /api/driver/v1/work-sessions/a12a2c42-f388-4dad-bc81-55336b3d8bb2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T07:39:00Z",
    "sequence": 1793345940722
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a12a2c42-f388-4dad-bc81-55336b3d8bb2",
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
  "last_heartbeat_at": "2026-10-30T07:39:00.742453Z",
  "last_location_at": "2026-10-30T07:39:00.742453Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/77075f02-9dc2-49a7-bcce-bc32b159ad2e/arrive` → **200**

```json
{
  "command_id": "ab34e8e7-df2f-4f48-8a89-069d40cf88e2",
  "expected_version": 0
}
```

```json
{
  "id": "77075f02-9dc2-49a7-bcce-bc32b159ad2e",
  "order_id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
  "assignment_id": "575ee585-411c-4ce1-afea-026345826116",
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
  "arrived_at": "2026-10-30T07:39:01.040413Z",
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

`POST /api/driver/v1/trips/77075f02-9dc2-49a7-bcce-bc32b159ad2e/start` → **200**

```json
{
  "command_id": "8933b45f-e58a-4862-b976-10883e1f1843",
  "expected_version": 1
}
```

```json
{
  "id": "77075f02-9dc2-49a7-bcce-bc32b159ad2e",
  "order_id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
  "assignment_id": "575ee585-411c-4ce1-afea-026345826116",
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
  "arrived_at": "2026-10-30T07:39:01.040413Z",
  "started_at": "2026-10-30T07:39:01.339004Z",
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

`POST /api/driver/v1/trips/77075f02-9dc2-49a7-bcce-bc32b159ad2e/complete` → **200**

```json
{
  "command_id": "6dbc93c5-ed2b-43d4-8ade-fbe5617445b9",
  "expected_version": 2,
  "reported_at": "2026-10-30T07:39:01Z",
  "cash_received": true
}
```

```json
{
  "id": "77075f02-9dc2-49a7-bcce-bc32b159ad2e",
  "order_id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
  "assignment_id": "575ee585-411c-4ce1-afea-026345826116",
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
  "arrived_at": "2026-10-30T07:39:01.040413Z",
  "started_at": "2026-10-30T07:39:01.339004Z",
  "completed_at": "2026-10-30T07:39:01.648874Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/9125e121-0a3f-4b4b-8576-7e59e899ddba` → **200**

```json
{
  "id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
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
    "id": "575ee585-411c-4ce1-afea-026345826116",
    "order_id": "9125e121-0a3f-4b4b-8576-7e59e899ddba",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "77075f02-9dc2-49a7-bcce-bc32b159ad2e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T07:38:59.270739Z",
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
  "session_id": "d4b10518-080a-4bbf-bf0b-85426a57bd92",
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
  "last_heartbeat_at": "2026-10-30T07:38:57.516648Z",
  "last_location_at": "2026-10-30T07:38:57.516648Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4b10518-080a-4bbf-bf0b-85426a57bd92/close` → **200**

```json
{
  "command_id": "c4f4a555-7352-4f42-93bd-ba11d2371d30",
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
  "session_id": "a12a2c42-f388-4dad-bc81-55336b3d8bb2",
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
  "last_heartbeat_at": "2026-10-30T07:39:00.742453Z",
  "last_location_at": "2026-10-30T07:39:00.742453Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a12a2c42-f388-4dad-bc81-55336b3d8bb2/close` → **200**

```json
{
  "command_id": "87f7bfa3-c9d1-45e3-8f90-a0aa155f65eb",
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

Done: terminal order 9125e121-0a3f-4b4b-8576-7e59e899ddba by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29627"
}
```

```json
{
  "challenge_id": "4fa28961-168b-4fe7-bf9f-e04a9dd3c67f",
  "expires_at": "2026-10-30T07:44:06.769089807Z",
  "resend_available_at": "2026-10-30T07:39:07.769089807Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "542619",
  "sent_at": "2026-10-30T07:39:06.773406337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fa28961-168b-4fe7-bf9f-e04a9dd3c67f",
  "code": "542619",
  "device_ref": "sandbox-29627"
}
```

```json
{
  "session_id": "718816cf-077f-40fa-b6d9-b84a74bccbea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0Njg0NywiaWF0IjoxNzkzMzQ1OTQ3LCJqdGkiOiI2YzY3YmY1Mi05NjVlLTQ2OWMtYmI2Yi03M2U3ZmU0NDMyNzIiLCJzaWQiOiI3MTg4MTZjZi0wNzdmLTQwZmEtYjZkOS1iODRhNzRiY2NiZWEifQ.CGcGLEaiYA7Vlvh4Eo0dSGEYyr397Z_kAg2_zkBfWS0",
  "access_expires_at": "2026-10-30T07:54:07.114866288Z",
  "refresh_token": "zf6iTZMOzNCK0XZ5GgxuXPnAorni5m1INUKRUXKwAfA",
  "refresh_expires_at": "2026-11-29T07:39:07.114274817Z",
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
  "device_ref": "sandbox-22564"
}
```

```json
{
  "challenge_id": "14e3f48e-3278-4875-85b6-27fac9788080",
  "expires_at": "2026-10-30T07:44:07.750794249Z",
  "resend_available_at": "2026-10-30T07:39:08.750794249Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "178927",
  "sent_at": "2026-10-30T07:39:07.756899354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14e3f48e-3278-4875-85b6-27fac9788080",
  "code": "178927",
  "device_ref": "sandbox-22564"
}
```

```json
{
  "session_id": "e977f70a-0190-4be9-bd43-c0617f39e26d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0Njg0OCwiaWF0IjoxNzkzMzQ1OTQ4LCJqdGkiOiI3MDYwZmQ4MS05YTFhLTQ1NzEtODQ3ZC1kMWNlNGJiYzhkMDIiLCJzaWQiOiJlOTc3ZjcwYS0wMTkwLTRiZTktYmQ0My1jMDYxN2YzOWUyNmQifQ.FZCtO0Zx7I-yOT8-kVmBSz5D2ezinZWF4suTaCQ6D7M",
  "access_expires_at": "2026-10-30T07:54:08.091339916Z",
  "refresh_token": "4aiqjNUySrc-Gx2YpJll6zk6JxyZfu1-1xMJgeVW_4s",
  "refresh_expires_at": "2026-11-29T07:39:08.090775128Z",
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
  "device_ref": "sandbox-16998"
}
```

```json
{
  "challenge_id": "69947c7a-9605-4486-b227-7aae03d84dea",
  "expires_at": "2026-10-30T07:44:08.651021731Z",
  "resend_available_at": "2026-10-30T07:39:09.651021731Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "760927",
  "sent_at": "2026-10-30T07:39:08.653785599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69947c7a-9605-4486-b227-7aae03d84dea",
  "code": "760927",
  "device_ref": "sandbox-16998"
}
```

```json
{
  "session_id": "6d116848-9f62-4ce7-92b5-73e2ace2adf8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM0Njg0OCwiaWF0IjoxNzkzMzQ1OTQ4LCJqdGkiOiI5MGEwMGNjYS00MTMyLTQ2YWUtYWU4Zi04NzA4ODVlOWY2NTYiLCJzaWQiOiI2ZDExNjg0OC05ZjYyLTRjZTctOTJiNS03M2UyYWNlMmFkZjgifQ.veNKdfZ_b9CfBHXXhgW-xU7sCJRTbncD4NL_KS9m4kI",
  "access_expires_at": "2026-10-30T07:54:08.972463378Z",
  "refresh_token": "aDTeFNHDw_9PYhBYXGz4SauTeMTAWfksmbwoHkQwPLY",
  "refresh_expires_at": "2026-11-29T07:39:08.971874024Z",
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
  "phone": "+380699000859",
  "device_ref": "sandbox-1218"
}
```

```json
{
  "challenge_id": "d8e9afdb-0528-4a3b-b94c-a382a1e54275",
  "expires_at": "2026-10-30T07:44:09.550073733Z",
  "resend_available_at": "2026-10-30T07:39:10.550073733Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380699000859` → **200**

```json
{
  "phone": "+380699000859",
  "audience": "CLIENT",
  "code": "674436",
  "sent_at": "2026-10-30T07:39:09.553108343Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8e9afdb-0528-4a3b-b94c-a382a1e54275",
  "code": "674436",
  "device_ref": "sandbox-1218"
}
```

```json
{
  "session_id": "39d45c6d-1c30-4519-b25e-9c63e86368c5",
  "subject": {
    "type": "CLIENT",
    "id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMGQzYTk5Yy1kOGZmLTRmNzMtYWMwYi05ZmVkZjY2YTJiOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzQ2ODQ5LCJpYXQiOjE3OTMzNDU5NDksImp0aSI6ImRhNGU4YTk0LTExM2EtNGJjMi1hYzM0LWIwNzk5YWJhZWZkYiIsInNpZCI6IjM5ZDQ1YzZkLTFjMzAtNDUxOS1iMjVlLTljNjNlODYzNjhjNSJ9.W55CDGsuTzSmXa-M9YEZcw_ZjeI4ehwko4FHjEj0XQg",
  "access_expires_at": "2026-10-30T07:54:09.878753861Z",
  "refresh_token": "p49UQjwmTcgUx1gAdT_jSE5_-tSJOn_vB9iIMKbdOms",
  "refresh_expires_at": "2026-11-29T07:39:09.878237635Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "889ccb90-5e07-4f62-844b-2db2b7e205a4",
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
  "id": "ad8c5afc-a140-436b-a488-c15ae60dfd8d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T07:44:10.175478Z",
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
  "command_id": "f28400aa-d598-4f9d-9b17-3e0a132cc572",
  "quote_id": "ad8c5afc-a140-436b-a488-c15ae60dfd8d",
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
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T07:39:10.479985Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:39:10.479985Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.399928346
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.161542654
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

`GET /api/rider/v1/orders/fa111c20-d18a-421d-8317-303bde9d196a` → **200**

```json
{
  "id": "fa111c20-d18a-421d-8317-303bde9d196a",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "20d3a99c-d8ff-4f73-ac0b-9fedf66a2b94",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T07:39:10.479985Z",
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
  "session_id": "5cef5759-ec70-4f19-ac1f-235dba56a949",
  "subject": {
    "type": "STAFF",
    "id": "c4a173f9-11cd-4781-befc-d6722f2847c3"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNGExNzNmOS0xMWNkLTQ3ODEtYmVmYy1kNjcyMmYyODQ3YzMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNDcwMzIsImlhdCI6MTc5MzM0NjEzMiwianRpIjoiZjIxZTRiZjYtMTNlNy00MmNhLTljZjMtNDlmNjI3ZDRlYWMzIiwic2lkIjoiNWNlZjU3NTktZWM3MC00ZjE5LWFjMWYtMjM1ZGJhNTZhOTQ5In0.Fn-yyywU7mbHHvxm7Ee1hC1q0vUJQli6rwJu5cFpzrw",
  "access_expires_at": "2026-10-30T07:57:12.432770606Z",
  "refresh_token": "N5EagFWRk3Tl8l2JBPxsSX3VPaRBJZg5QVR1WePzzhc",
  "refresh_expires_at": "2026-10-30T19:42:12.432185501Z",
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
  "id": "cda81474-efe8-44a8-86b6-9ca21f13d8a9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T07:42:12.72729Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T07:42:12.727325Z",
  "updated_at": "2026-10-30T07:42:12.743953Z",
  "finished_at": "2026-10-30T07:42:12.743953Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/cda81474-efe8-44a8-86b6-9ca21f13d8a9` → **200**

```json
{
  "run": {
    "id": "cda81474-efe8-44a8-86b6-9ca21f13d8a9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T07:42:12.72729Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T07:42:12.727325Z",
    "updated_at": "2026-10-30T07:42:12.743953Z",
    "finished_at": "2026-10-30T07:42:12.743953Z",
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
  "id": "cda81474-efe8-44a8-86b6-9ca21f13d8a9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T07:42:12.72729Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T07:42:12.727325Z",
  "updated_at": "2026-10-30T07:42:12.743953Z",
  "finished_at": "2026-10-30T07:42:12.743953Z",
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
  "id": "cda81474-efe8-44a8-86b6-9ca21f13d8a9",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T07:42:12.72729Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T07:42:12.727325Z",
  "updated_at": "2026-10-30T07:42:12.743953Z",
  "finished_at": "2026-10-30T07:42:12.743953Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/d33f0249-ac27-4eb9-bd31-9ce6d15cf7a2` → **204**

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
  "id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T07:42:13.181758Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T07:42:13.181786Z",
  "updated_at": "2026-10-30T07:42:13.189951Z",
  "finished_at": "2026-10-30T07:42:13.189951Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7` → **200**

```json
{
  "run": {
    "id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T07:42:13.181758Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T07:42:13.181786Z",
    "updated_at": "2026-10-30T07:42:13.189951Z",
    "finished_at": "2026-10-30T07:42:13.189951Z",
    "version": 1
  },
  "items": [
    {
      "id": "8a96cf2a-ab00-419e-9c26-81c11646caf5",
      "run_id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "627524a6330b8b26bba5f91c59852ce11c67ac8d7c7bfbd969469c8fbec845e3",
      "reference_display": "sandbox-reconciliation-d33f0249-ac27-4eb9-bd31-9ce6d15cf7a2",
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
      "provider_at": "2026-10-30T07:42:13Z",
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
  "id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T07:42:13.181758Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T07:42:13.181786Z",
  "updated_at": "2026-10-30T07:42:13.189951Z",
  "finished_at": "2026-10-30T07:42:13.189951Z",
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
  "id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T07:42:13.181758Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T07:42:13.181786Z",
  "updated_at": "2026-10-30T07:42:13.189951Z",
  "finished_at": "2026-10-30T07:42:13.189951Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/8a96cf2a-ab00-419e-9c26-81c11646caf5/resolve` → **200**

```json
{
  "command_id": "dc1510fd-fa43-462e-b3df-a9910c3a4e23",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "8a96cf2a-ab00-419e-9c26-81c11646caf5",
  "run_id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "627524a6330b8b26bba5f91c59852ce11c67ac8d7c7bfbd969469c8fbec845e3",
  "reference_display": "sandbox-reconciliation-d33f0249-ac27-4eb9-bd31-9ce6d15cf7a2",
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
  "provider_at": "2026-10-30T07:42:13Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "resolved_at": "2026-10-30T07:42:13.612451Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/8a96cf2a-ab00-419e-9c26-81c11646caf5/resolve` → **200**

```json
{
  "command_id": "dc1510fd-fa43-462e-b3df-a9910c3a4e23",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "8a96cf2a-ab00-419e-9c26-81c11646caf5",
  "run_id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "627524a6330b8b26bba5f91c59852ce11c67ac8d7c7bfbd969469c8fbec845e3",
  "reference_display": "sandbox-reconciliation-d33f0249-ac27-4eb9-bd31-9ce6d15cf7a2",
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
  "provider_at": "2026-10-30T07:42:13Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
  "resolved_at": "2026-10-30T07:42:13.612451Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/8a96cf2a-ab00-419e-9c26-81c11646caf5/resolve` → **409**

```json
{
  "command_id": "7961a091-1c5a-4f01-88c1-837f93eda41b",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/8a96cf2a-ab00-419e-9c26-81c11646caf5/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "55ba1e86-30d8-40dc-8bab-63b9af313be2"
}
```

`GET /api/admin/v1/payment-reconciliations/bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7` → **200**

```json
{
  "run": {
    "id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T07:42:13.181758Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T07:42:13.181786Z",
    "updated_at": "2026-10-30T07:42:13.612451Z",
    "finished_at": "2026-10-30T07:42:13.189951Z",
    "version": 2
  },
  "items": [
    {
      "id": "8a96cf2a-ab00-419e-9c26-81c11646caf5",
      "run_id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "627524a6330b8b26bba5f91c59852ce11c67ac8d7c7bfbd969469c8fbec845e3",
      "reference_display": "sandbox-reconciliation-d33f0249-ac27-4eb9-bd31-9ce6d15cf7a2",
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
      "provider_at": "2026-10-30T07:42:13Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "c4a173f9-11cd-4781-befc-d6722f2847c3",
      "resolved_at": "2026-10-30T07:42:13.612451Z",
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
      "id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T07:42:13.181758Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T07:42:13.181786Z",
      "updated_at": "2026-10-30T07:42:13.612451Z",
      "finished_at": "2026-10-30T07:42:13.189951Z",
      "version": 2
    },
    {
      "id": "1a1ded1c-8108-4dff-9d2c-940a7901c991",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T07:34:10.845085Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T07:34:10.845165Z",
      "updated_at": "2026-10-30T07:34:10.850649Z",
      "finished_at": "2026-10-30T07:34:10.850649Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/d33f0249-ac27-4eb9-bd31-9ce6d15cf7a2` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "bd2a0bc9-8fbf-4b7a-ab0c-4efff8ebd5b7",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T07:42:13.181758Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T07:42:13.181786Z",
  "updated_at": "2026-10-30T07:42:13.612451Z",
  "finished_at": "2026-10-30T07:42:13.189951Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793346256031E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793346256339E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793346256339E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793346256082E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.79334625634E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
