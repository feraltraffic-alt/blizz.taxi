# Sandbox transcript (2026-10-29T14:39:37Z, 525c48e)

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
  "correlation_id": "92e79a95-3373-41e6-8a42-0d50cc406978"
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
  "session_id": "d3a13759-4908-470b-8ebd-d0f5192c774e",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU2ODcsImlhdCI6MTc5MzI4NDc4NywianRpIjoiMWIyMzdlZDUtYjM5NS00MzgzLWE2ZjgtODVlZWI2YzkzZjI2Iiwic2lkIjoiZDNhMTM3NTktNDkwOC00NzBiLThlYmQtZDBmNTE5MmM3NzRlIn0.RmP2MbMrkG6MTdW5ECl8WSS2OsMPwEFZ7kh4arvuQHE",
  "access_expires_at": "2026-10-29T14:54:47.783184882Z",
  "refresh_token": "oXkZGlPS6eVBJ4W0zizBXALuwmVp50_jrAcROW2Hp3c",
  "refresh_expires_at": "2026-10-30T02:39:47.780952463Z",
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
  "session_id": "729224f5-8239-4717-9306-a3801910c3d5",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU2ODksImlhdCI6MTc5MzI4NDc4OSwianRpIjoiODAwY2Q5YTYtZjQ2Zi00ZDUxLWFhY2YtNGU2ZjY1NDllNGVkIiwic2lkIjoiNzI5MjI0ZjUtODIzOS00NzE3LTkzMDYtYTM4MDE5MTBjM2Q1In0.zmUJ2XZxfp19IJtEY6xQKELHj12NF3_dHguusLS7gIQ",
  "access_expires_at": "2026-10-29T14:54:49.647741702Z",
  "refresh_token": "8EGQrOA3gJzhidzN4j-HCfnquxtDXLxniq0yk0LLYOA",
  "refresh_expires_at": "2026-10-30T02:39:49.646797913Z",
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
  "device_ref": "sandbox-31654"
}
```

```json
{
  "challenge_id": "628fa408-46c0-4653-a404-df2eb7e9590e",
  "expires_at": "2026-10-29T14:44:50.256479875Z",
  "resend_available_at": "2026-10-29T14:39:51.256479875Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "620392",
  "sent_at": "2026-10-29T14:39:50.268993218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "628fa408-46c0-4653-a404-df2eb7e9590e",
  "code": "620392",
  "device_ref": "sandbox-31654"
}
```

```json
{
  "session_id": "74a5f4dd-dea0-42d9-ba5a-671bc748206f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTY5MCwiaWF0IjoxNzkzMjg0NzkwLCJqdGkiOiJkNWE1OTJjOS1jYTllLTRjY2YtODgyZC0wMWZmNjYzMzc0NjAiLCJzaWQiOiI3NGE1ZjRkZC1kZWEwLTQyZDktYmE1YS02NzFiYzc0ODIwNmYifQ.Y7avFwFseL12s2DwtqXHTHYEoLmZa17OTGMFJxRJ17k",
  "access_expires_at": "2026-10-29T14:54:50.63714497Z",
  "refresh_token": "KcaHDC-FSfbvzTzGPd_bgF7UZI0nM45lEToU5hLSgrs",
  "refresh_expires_at": "2026-11-28T14:39:50.636157084Z",
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
  "command_id": "037ece1f-d2a0-4108-b4c3-7cf173478cc3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:51Z",
    "sequence": 1793284791209
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c27e031d-5086-4aaa-9c51-c9d7648d4a85",
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
  "last_heartbeat_at": "2026-10-29T14:39:51.336533Z",
  "last_location_at": "2026-10-29T14:39:51.336533Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635206268",
  "device_ref": "sandbox-23335"
}
```

```json
{
  "challenge_id": "f4e662f8-1eec-4f44-951c-75bd5cfa703c",
  "expires_at": "2026-10-29T14:44:51.638826453Z",
  "resend_available_at": "2026-10-29T14:39:52.638826453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635206268` → **200**

```json
{
  "phone": "+380635206268",
  "audience": "CLIENT",
  "code": "624333",
  "sent_at": "2026-10-29T14:39:51.643701547Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4e662f8-1eec-4f44-951c-75bd5cfa703c",
  "code": "624333",
  "device_ref": "sandbox-23335"
}
```

```json
{
  "session_id": "c9bf77bb-5673-46a7-ab26-c9a225380ed7",
  "subject": {
    "type": "CLIENT",
    "id": "81550469-1816-4a9b-99b5-8a21c84c9e13"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MTU1MDQ2OS0xODE2LTRhOWItOTliNS04YTIxYzg0YzllMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NjkxLCJpYXQiOjE3OTMyODQ3OTEsImp0aSI6IjU4NGRmOTJkLWI4OWYtNGI1MS1iYzEwLThkNTNmMmM0MjMyMiIsInNpZCI6ImM5YmY3N2JiLTU2NzMtNDZhNy1hYjI2LWM5YTIyNTM4MGVkNyJ9.3rer3aYGeFOCgkueTVAf3djRuZ531TfezjW3b_rqtPc",
  "access_expires_at": "2026-10-29T14:54:51.958571137Z",
  "refresh_token": "fz6p6M6tXj3tliumkDLRdduK0jFX2oog-9IHDfSTOtA",
  "refresh_expires_at": "2026-11-28T14:39:51.957659089Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5f872172-d9d7-40c8-8ff0-0901fe49c305",
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
  "id": "a9478c7f-5d42-4284-8a2a-a7b55085d763",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:44:52.271762Z",
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
  "command_id": "89ffdfe1-6232-46c9-88b0-7112e4d1a442",
  "quote_id": "a9478c7f-5d42-4284-8a2a-a7b55085d763",
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
  "id": "edf6cfe8-d3c0-49ff-95e5-6d70bd5fd105",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "81550469-1816-4a9b-99b5-8a21c84c9e13",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:39:52.652486Z",
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
    "id": "b2856724-ee2c-4ca3-ac5a-f4464ce6cd59",
    "order_id": "edf6cfe8-d3c0-49ff-95e5-6d70bd5fd105",
    "expires_at": "2026-10-29T14:40:07.663019Z",
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

`POST /api/driver/v1/offers/b2856724-ee2c-4ca3-ac5a-f4464ce6cd59/accept` → **200**

```json
{
  "command_id": "b113dd81-26f6-4f93-ad96-56416ce90cfb"
}
```

```json
{
  "id": "e4428686-7fa8-4e8c-a426-b76ae3371fc8",
  "order_id": "edf6cfe8-d3c0-49ff-95e5-6d70bd5fd105",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "080381d4-88c5-4801-adcd-d41ebb66a39b",
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
  "command_id": "57de30b7-5dfb-4e59-af53-1569ded31a91",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:39:53.935636838Z"
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
  "id": "080381d4-88c5-4801-adcd-d41ebb66a39b",
  "order_id": "edf6cfe8-d3c0-49ff-95e5-6d70bd5fd105",
  "assignment_id": "e4428686-7fa8-4e8c-a426-b76ae3371fc8",
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

`POST /api/driver/v1/work-sessions/c27e031d-5086-4aaa-9c51-c9d7648d4a85/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:54Z",
    "sequence": 1793284794850
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c27e031d-5086-4aaa-9c51-c9d7648d4a85",
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
  "last_heartbeat_at": "2026-10-29T14:39:54.876123Z",
  "last_location_at": "2026-10-29T14:39:54.876123Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/080381d4-88c5-4801-adcd-d41ebb66a39b/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d720eac5-c7b0-497a-9a8f-26922e4e7726",
  "expected_version": 0
}
```

```json
{
  "id": "080381d4-88c5-4801-adcd-d41ebb66a39b",
  "order_id": "edf6cfe8-d3c0-49ff-95e5-6d70bd5fd105",
  "assignment_id": "e4428686-7fa8-4e8c-a426-b76ae3371fc8",
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
  "arrived_at": "2026-10-29T14:39:55.17793Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/080381d4-88c5-4801-adcd-d41ebb66a39b/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "64118575-cb66-47b6-80ee-82497fe76410",
  "expected_version": 1
}
```

```json
{
  "id": "080381d4-88c5-4801-adcd-d41ebb66a39b",
  "order_id": "edf6cfe8-d3c0-49ff-95e5-6d70bd5fd105",
  "assignment_id": "e4428686-7fa8-4e8c-a426-b76ae3371fc8",
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
  "arrived_at": "2026-10-29T14:39:55.17793Z",
  "started_at": "2026-10-29T14:39:55.480877Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/080381d4-88c5-4801-adcd-d41ebb66a39b/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "861d6c7f-7174-47a5-8aa9-d035b2a6edb2",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:39:55Z",
  "cash_received": true
}
```

```json
{
  "id": "080381d4-88c5-4801-adcd-d41ebb66a39b",
  "order_id": "edf6cfe8-d3c0-49ff-95e5-6d70bd5fd105",
  "assignment_id": "e4428686-7fa8-4e8c-a426-b76ae3371fc8",
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
  "arrived_at": "2026-10-29T14:39:55.17793Z",
  "started_at": "2026-10-29T14:39:55.480877Z",
  "completed_at": "2026-10-29T14:39:55.805351Z",
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
  "session_id": "c27e031d-5086-4aaa-9c51-c9d7648d4a85",
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
  "last_heartbeat_at": "2026-10-29T14:39:54.876123Z",
  "last_location_at": "2026-10-29T14:39:54.876123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c27e031d-5086-4aaa-9c51-c9d7648d4a85/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "2657e8b8-d411-49b3-8942-59e33185767d",
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
  "command_id": "8d3b4379-5d0c-4aee-a0c7-f27000ee47fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:56Z",
    "sequence": 1793284796722
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
  "correlation_id": "f2db718b-d3ab-490a-9944-731ce23dcae7",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "43e27c91-0eca-4b32-ae64-71a97365de03",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:39:57Z",
    "sequence": 1793284797168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fec859d8-8d3a-43a1-ba90-a0b9e04bcc98",
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
  "last_heartbeat_at": "2026-10-29T14:39:57.038464Z",
  "last_location_at": "2026-10-29T14:39:57.038464Z",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:39:53.935637Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "304ddf15-7680-4eae-9ea4-9a13c2750dfc",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:39:57.639162071Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fec859d8-8d3a-43a1-ba90-a0b9e04bcc98",
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
  "last_heartbeat_at": "2026-10-29T14:39:57.038464Z",
  "last_location_at": "2026-10-29T14:39:57.038464Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fec859d8-8d3a-43a1-ba90-a0b9e04bcc98/close` → **200**

```json
{
  "command_id": "e520b03c-37e0-4fe7-bd9e-da3af841b670",
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
  "session_id": "dee0bae0-8279-4067-ba23-43b89757bbc6",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU2OTgsImlhdCI6MTc5MzI4NDc5OCwianRpIjoiZDcxOTVmMmItODg3YS00YzNiLTk1OTYtMzYxOGVkZjhhZmQ4Iiwic2lkIjoiZGVlMGJhZTAtODI3OS00MDY3LWJhMjMtNDNiODk3NTdiYmM2In0.aoLSQkK60dRWC8aIXy1mxU7XRXPH5c23IGp_3GavWB0",
  "access_expires_at": "2026-10-29T14:54:58.80523507Z",
  "refresh_token": "M2g083fyDCJzvSQUQskUGPtG8XGsxQIVsNjSRtl32IA",
  "refresh_expires_at": "2026-10-30T02:39:58.804448226Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "6542de4f-f439-4ed9-8696-6d39e74abdc7",
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
  "id": "27ef7d8b-fcfa-421b-b223-4db48a02fe5b",
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
  "created_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "created_at": "2026-10-29T14:39:59.092093Z",
  "updated_at": "2026-10-29T14:39:59.092093Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631324823",
  "device_ref": "sandbox-31055"
}
```

```json
{
  "challenge_id": "7cd93c5e-3228-48b5-ac59-bb6d9693f2c2",
  "expires_at": "2026-10-29T14:44:59.39672692Z",
  "resend_available_at": "2026-10-29T14:40:00.39672692Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631324823` → **200**

```json
{
  "phone": "+380631324823",
  "audience": "CLIENT",
  "code": "965811",
  "sent_at": "2026-10-29T14:39:59.400999382Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cd93c5e-3228-48b5-ac59-bb6d9693f2c2",
  "code": "965811",
  "device_ref": "sandbox-31055"
}
```

```json
{
  "session_id": "9ea89cbf-b5d5-4860-9c78-14589a18b830",
  "subject": {
    "type": "CLIENT",
    "id": "6ee0c007-7304-4864-8cb0-f8c9e23af306"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZWUwYzAwNy03MzA0LTQ4NjQtOGNiMC1mOGM5ZTIzYWYzMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1Njk5LCJpYXQiOjE3OTMyODQ3OTksImp0aSI6IjQyNTk3ZTk1LTIwMzYtNDI2Zi1iYzg0LTA2ZWY4OTdmOTIwNiIsInNpZCI6IjllYTg5Y2JmLWI1ZDUtNDg2MC05Yzc4LTE0NTg5YTE4YjgzMCJ9.JfF3tQ1qM3wgUvEVOWrSYGuFLRp6_GF61-tk3zg90gs",
  "access_expires_at": "2026-10-29T14:54:59.716077888Z",
  "refresh_token": "R_KMyUb6fOWUq5U9hQ8vilK8X8BYuPtTkytZqp31pqQ",
  "refresh_expires_at": "2026-11-28T14:39:59.715259534Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631324823` → **200**

```json
{
  "client_id": "6ee0c007-7304-4864-8cb0-f8c9e23af306"
}
```

`POST /api/admin/v1/rider-wallets/6ee0c007-7304-4864-8cb0-f8c9e23af306/top-ups` → **201**

```json
{
  "command_id": "9f51b2cf-86ce-47ad-8054-600d6a233434",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "6ee0c007-7304-4864-8cb0-f8c9e23af306",
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
      "id": "21d486d5-7edd-4068-9ba8-852b7ca54905",
      "at": "2026-10-29T14:40:00.279463Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82840ed9-ca34-4eec-b586-95af133b26ae",
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
  "id": "d723f4d5-2137-43bb-8b2e-a2b3c621bad8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:00.590731Z",
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
      "id": "27ef7d8b-fcfa-421b-b223-4db48a02fe5b",
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
  "device_ref": "sandbox-16221"
}
```

```json
{
  "challenge_id": "ecae018e-649a-496e-a862-46996261754e",
  "expires_at": "2026-10-29T14:45:00.896461977Z",
  "resend_available_at": "2026-10-29T14:40:01.896461977Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "225858",
  "sent_at": "2026-10-29T14:40:00.900549578Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecae018e-649a-496e-a862-46996261754e",
  "code": "225858",
  "device_ref": "sandbox-16221"
}
```

```json
{
  "session_id": "c1157b89-09f3-4ccb-8ba7-02ead3d167da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTcwMSwiaWF0IjoxNzkzMjg0ODAxLCJqdGkiOiJmMmJlZGNiNS0zZmZmLTQzNzgtOWM2My0xNDE0NjhlYWM3NjkiLCJzaWQiOiJjMTE1N2I4OS0wOWYzLTRjY2ItOGJhNy0wMmVhZDNkMTY3ZGEifQ.Q1mDDMJR2eLvefP6JpjYFzakhpmhCN2Q1GifMg97bFs",
  "access_expires_at": "2026-10-29T14:55:01.203019544Z",
  "refresh_token": "e15ofvzfU6P4Y0oR88wFMPOQ5k_C71ypSSZpRqs6pTo",
  "refresh_expires_at": "2026-11-28T14:40:01.20230808Z",
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
  "command_id": "fe30cfd0-02a4-47cb-9528-126839b42667",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:01Z",
    "sequence": 1793284801770
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "690b6db1-08e4-41e0-88f1-6edcdf9fa1bd",
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
  "last_heartbeat_at": "2026-10-29T14:40:01.791932Z",
  "last_location_at": "2026-10-29T14:40:01.791932Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0c008158-bf3a-4fc3-96b3-3c9bc02e71fa",
  "quote_id": "d723f4d5-2137-43bb-8b2e-a2b3c621bad8",
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
  "id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ee0c007-7304-4864-8cb0-f8c9e23af306",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:40:02.089891Z",
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
  "client_id": "6ee0c007-7304-4864-8cb0-f8c9e23af306",
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
      "id": "21d486d5-7edd-4068-9ba8-852b7ca54905",
      "at": "2026-10-29T14:40:00.279463Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
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
    "id": "a57c5204-47d3-43cd-b239-37d3604dbd78",
    "order_id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54",
    "expires_at": "2026-10-29T14:40:17.098491Z",
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

`POST /api/driver/v1/offers/a57c5204-47d3-43cd-b239-37d3604dbd78/accept` → **200**

```json
{
  "command_id": "cd7693f8-7c0e-4168-a076-877c2b3bf948"
}
```

```json
{
  "id": "ee15a181-1831-4451-88e8-5c3a5494258d",
  "order_id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0677d9bb-a703-4eff-b171-23441dd910be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0677d9bb-a703-4eff-b171-23441dd910be",
  "order_id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54",
  "assignment_id": "ee15a181-1831-4451-88e8-5c3a5494258d",
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

`POST /api/driver/v1/work-sessions/690b6db1-08e4-41e0-88f1-6edcdf9fa1bd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:03Z",
    "sequence": 1793284803524
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "690b6db1-08e4-41e0-88f1-6edcdf9fa1bd",
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
  "last_heartbeat_at": "2026-10-29T14:40:03.547511Z",
  "last_location_at": "2026-10-29T14:40:03.547511Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0677d9bb-a703-4eff-b171-23441dd910be/arrive` → **200**

```json
{
  "command_id": "744bbdd3-d570-4e65-ac3b-96bdf5353c49",
  "expected_version": 0
}
```

```json
{
  "id": "0677d9bb-a703-4eff-b171-23441dd910be",
  "order_id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54",
  "assignment_id": "ee15a181-1831-4451-88e8-5c3a5494258d",
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
  "arrived_at": "2026-10-29T14:40:03.842199Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0677d9bb-a703-4eff-b171-23441dd910be/start` → **200**

```json
{
  "command_id": "52ae55d2-3de6-400b-8628-a70772dd5a9d",
  "expected_version": 1
}
```

```json
{
  "id": "0677d9bb-a703-4eff-b171-23441dd910be",
  "order_id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54",
  "assignment_id": "ee15a181-1831-4451-88e8-5c3a5494258d",
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
  "arrived_at": "2026-10-29T14:40:03.842199Z",
  "started_at": "2026-10-29T14:40:04.148367Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/0677d9bb-a703-4eff-b171-23441dd910be/complete` → **200**

```json
{
  "command_id": "23625d1b-7a26-4248-af7f-d45adbb93c0e",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:04Z",
  "cash_received": true
}
```

```json
{
  "id": "0677d9bb-a703-4eff-b171-23441dd910be",
  "order_id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54",
  "assignment_id": "ee15a181-1831-4451-88e8-5c3a5494258d",
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
  "arrived_at": "2026-10-29T14:40:03.842199Z",
  "started_at": "2026-10-29T14:40:04.148367Z",
  "completed_at": "2026-10-29T14:40:04.458905Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6ee0c007-7304-4864-8cb0-f8c9e23af306",
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
      "id": "949e7db2-eafc-4c73-a3a7-358edb71c0a1",
      "at": "2026-10-29T14:40:04.689554Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54"
    },
    {
      "id": "21d486d5-7edd-4068-9ba8-852b7ca54905",
      "at": "2026-10-29T14:40:00.279463Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/27ef7d8b-fcfa-421b-b223-4db48a02fe5b/archive` → **200**

```json
{
  "command_id": "4d875983-d407-4306-82e1-b97434692a2b",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "27ef7d8b-fcfa-421b-b223-4db48a02fe5b",
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
  "created_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "created_at": "2026-10-29T14:39:59.092093Z",
  "updated_at": "2026-10-29T14:40:08.091783Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "690b6db1-08e4-41e0-88f1-6edcdf9fa1bd",
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
  "last_heartbeat_at": "2026-10-29T14:40:03.547511Z",
  "last_location_at": "2026-10-29T14:40:03.547511Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/690b6db1-08e4-41e0-88f1-6edcdf9fa1bd/close` → **200**

```json
{
  "command_id": "3dbbaf8f-1cef-4d44-975e-d1c49f052dd7",
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

Done: order c85c1bed-0511-4c66-af14-7ffd15bd6c54.

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
  "session_id": "7295a9f8-dd4f-4f74-adcc-09222ba17f96",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MDksImlhdCI6MTc5MzI4NDgwOSwianRpIjoiYjUxNWNjOWMtNGJiNC00YTcxLTg2MGUtNTg1MmFlMDJmNTQ4Iiwic2lkIjoiNzI5NWE5ZjgtZGQ0Zi00Zjc0LWFkY2MtMDkyMjJiYTE3Zjk2In0.ES7iKYBKQh8ldUz-LfHrL3LRqlSaX1Np1vte4OTavBc",
  "access_expires_at": "2026-10-29T14:55:09.290130047Z",
  "refresh_token": "cInztMmgtEjbnX-2lf-jMpb3C3s_glv4sJTa6iQDRpg",
  "refresh_expires_at": "2026-10-30T02:40:09.289393227Z",
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
  "command_id": "51d3ff62-0ed8-46ca-aa67-05db4f277176",
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
  "session_id": "8f65bd38-1f6a-46fd-9c27-820ab5649a96",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MTAsImlhdCI6MTc5MzI4NDgxMCwianRpIjoiOGY5ZTljYWItNjBlOC00NjY0LThiNTEtOTFiYmU4NjczYTcwIiwic2lkIjoiOGY2NWJkMzgtMWY2YS00NmZkLTljMjctODIwYWI1NjQ5YTk2In0.ww1GUWu4_NB-gYBvmbNYesSZt2RlXpoCrYOgiocEYCM",
  "access_expires_at": "2026-10-29T14:55:10.46665847Z",
  "refresh_token": "3hxEi3UVppYaslt90FwGXS5OR1kowcfXC1U3UHiUHQk",
  "refresh_expires_at": "2026-10-30T02:40:10.466026215Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.305378612",
    "linkedid": "1730052700.305378612",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673805134"
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
    "id": "1730052700.305378612",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "1cd93871-20f1-4d0c-8bb1-50440af2e274",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673805134",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:40:10.761775Z",
      "answered_at": null,
      "ended_at": "2026-10-29T14:40:10.788924Z",
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
    "id": "1730052600.21388246",
    "linkedid": "1730052600.21388246",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673805134"
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
      "id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673805134",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:40:11.121043Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/ae3bf5da-2d95-4c47-a52e-a64629c12ff6/answer` → **200**

```json
{
  "command_id": "ba2fa54c-043a-4a23-9496-15481a854966"
}
```

```json
{
  "id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673805134",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "order_ids": [],
  "started_at": "2026-10-29T14:40:11.121043Z",
  "answered_at": "2026-10-29T14:40:11.452163Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.21388246",
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
    "id": "1730052600.21388246",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673805134",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:11.121043Z",
      "answered_at": "2026-10-29T14:40:11.452163Z",
      "ended_at": "2026-10-29T14:40:11.769975Z",
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
      "id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673805134",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:11.121043Z",
      "answered_at": "2026-10-29T14:40:11.452163Z",
      "ended_at": "2026-10-29T14:40:11.769975Z",
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
      "id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673805134",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:11.121043Z",
      "answered_at": "2026-10-29T14:40:11.452163Z",
      "ended_at": "2026-10-29T14:40:11.769975Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:16.331661Z"
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
      "id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673805134",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:11.121043Z",
      "answered_at": "2026-10-29T14:40:11.452163Z",
      "ended_at": "2026-10-29T14:40:11.769975Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:16.331661Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/ae3bf5da-2d95-4c47-a52e-a64629c12ff6/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/ae3bf5da-2d95-4c47-a52e-a64629c12ff6/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=ae3bf5da-2d95-4c47-a52e-a64629c12ff6` → **200**

```json
{
  "changes": [
    {
      "id": "9ec69c9b-f747-419e-88ba-e8e88a01dfa4",
      "occurred_at": "2026-10-29T14:40:17.041172Z",
      "actor_type": "STAFF",
      "actor_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9b39b774-4121-428c-a033-2e49bf39c64f\", \"order_ids\": []}",
      "correlation_id": "9af053f0-99bc-4c24-88b8-26d37ef41069"
    },
    {
      "id": "fc9c28fb-60bd-4852-9265-fa77d759ece3",
      "occurred_at": "2026-10-29T14:40:17.008037Z",
      "actor_type": "STAFF",
      "actor_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9b39b774-4121-428c-a033-2e49bf39c64f\", \"order_ids\": []}",
      "correlation_id": "6910e120-55fc-420a-932e-03619460e45c"
    }
  ]
}
```

Done: call ae3bf5da-2d95-4c47-a52e-a64629c12ff6 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32197"
}
```

```json
{
  "challenge_id": "e6440fbc-84dc-4ce5-b222-a7f21fcdb2b5",
  "expires_at": "2026-10-29T14:45:17.364174938Z",
  "resend_available_at": "2026-10-29T14:40:18.364174938Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "623469",
  "sent_at": "2026-10-29T14:40:17.368662626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6440fbc-84dc-4ce5-b222-a7f21fcdb2b5",
  "code": "623469",
  "device_ref": "sandbox-32197"
}
```

```json
{
  "session_id": "f8029f12-6b7f-4ed0-89e1-6630ef08497c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTcxNywiaWF0IjoxNzkzMjg0ODE3LCJqdGkiOiI3M2Y0NGE4ZS01OGJjLTRhMGYtYTMwOC0wYTBjODliOGMxNWQiLCJzaWQiOiJmODAyOWYxMi02YjdmLTRlZDAtODllMS02NjMwZWYwODQ5N2MifQ.XhcGLlppaX1k4ISyAhCHG59HzjIDRiLXbsRK721OaHQ",
  "access_expires_at": "2026-10-29T14:55:17.684033934Z",
  "refresh_token": "1WmC_OSWICp-L-t83DiDTU_0buhP1V0AbnOMEZ0bljI",
  "refresh_expires_at": "2026-11-28T14:40:17.683052147Z",
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
  "command_id": "0c3c7908-04e9-43dd-8e42-3d6561636327",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:18Z",
    "sequence": 1793284818236
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "74362ac0-3c26-4b5a-8bb2-a2bfbe910fe4",
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
  "last_heartbeat_at": "2026-10-29T14:40:18.257205Z",
  "last_location_at": "2026-10-29T14:40:18.257205Z",
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
  "session_id": "1a6416f7-eb33-41aa-ad23-4d3f6e0d18d0",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MTgsImlhdCI6MTc5MzI4NDgxOCwianRpIjoiN2ZkYmI2YzQtNjI0MC00YzE2LWI2MjItZGE0NGQxZWRiZDkxIiwic2lkIjoiMWE2NDE2ZjctZWIzMy00MWFhLWFkMjMtNGQzZjZlMGQxOGQwIn0.oeZ4y8dwmVl9jj07zamC8OazkHS4rZOj6roImXZELXE",
  "access_expires_at": "2026-10-29T14:55:18.86845451Z",
  "refresh_token": "CpqPk8bTvm0xsrpzXvqIF9LuD6MDxgz2Mm0kE00Sy1U",
  "refresh_expires_at": "2026-10-30T02:40:18.867781935Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2df1472d-a6d7-4cc6-b6bd-4484dd25637a",
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
  "id": "6bcec450-1375-48fc-9940-e902b1ec1835",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:19.159334Z",
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
  "command_id": "4ee603fd-07e5-4df0-807d-5f3357e110f1",
  "quote_id": "6bcec450-1375-48fc-9940-e902b1ec1835",
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
    "phone": "+380677023795"
  }
}
```

```json
{
  "id": "949727c1-6b19-4031-9eaa-491a49c24f41",
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
  "created_at": "2026-10-29T14:40:19.488138Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677023795"
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
    "id": "9e21cdf0-a84f-44cf-b9de-00a0ba40d6fc",
    "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
    "expires_at": "2026-10-29T14:40:34.494483Z",
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

`POST /api/driver/v1/offers/9e21cdf0-a84f-44cf-b9de-00a0ba40d6fc/accept` → **200**

```json
{
  "command_id": "bbea58dc-3e6e-4355-97a5-7e90de012ec0"
}
```

```json
{
  "id": "1fd438e2-acb3-4eed-bd69-8707723ac710",
  "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[
  {
    "phone": "+380677023795",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:21.604450797Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[
  {
    "phone": "+380677023795",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:21.604450797Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[
  {
    "phone": "+380677023795",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:21.604450797Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f",
  "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
  "assignment_id": "1fd438e2-acb3-4eed-bd69-8707723ac710",
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
    "phone": "+380677023795"
  }
}
```

`POST /api/driver/v1/work-sessions/74362ac0-3c26-4b5a-8bb2-a2bfbe910fe4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:22Z",
    "sequence": 1793284822817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "74362ac0-3c26-4b5a-8bb2-a2bfbe910fe4",
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
  "last_heartbeat_at": "2026-10-29T14:40:22.838158Z",
  "last_location_at": "2026-10-29T14:40:22.838158Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f/arrive` → **200**

```json
{
  "command_id": "91d9599e-84d8-44f6-8e2a-25a645d4c75a",
  "expected_version": 0
}
```

```json
{
  "id": "ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f",
  "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
  "assignment_id": "1fd438e2-acb3-4eed-bd69-8707723ac710",
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
  "arrived_at": "2026-10-29T14:40:23.12619Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677023795"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[
  {
    "phone": "+380677023795",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:21.604450797Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[
  {
    "phone": "+380677023795",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:21.604450797Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[
  {
    "phone": "+380677023795",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:21.604450797Z"
  },
  {
    "phone": "+380677023795",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:24.614465655Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[
  {
    "phone": "+380677023795",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:21.604450797Z"
  },
  {
    "phone": "+380677023795",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:24.614465655Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677023795` → **200**

```json
[
  {
    "phone": "+380677023795",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:21.604450797Z"
  },
  {
    "phone": "+380677023795",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:40:24.614465655Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f/start` → **200**

```json
{
  "command_id": "753151e0-3b24-45de-8264-8970430fcc8a",
  "expected_version": 1
}
```

```json
{
  "id": "ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f",
  "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
  "assignment_id": "1fd438e2-acb3-4eed-bd69-8707723ac710",
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
  "arrived_at": "2026-10-29T14:40:23.12619Z",
  "started_at": "2026-10-29T14:40:25.556157Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677023795"
  }
}
```

`POST /api/driver/v1/trips/ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f/complete` → **200**

```json
{
  "command_id": "32b5b7f8-71ec-434f-8f4b-eacd568fb35e",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:25Z",
  "cash_received": true
}
```

```json
{
  "id": "ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f",
  "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
  "assignment_id": "1fd438e2-acb3-4eed-bd69-8707723ac710",
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
  "arrived_at": "2026-10-29T14:40:23.12619Z",
  "started_at": "2026-10-29T14:40:25.556157Z",
  "completed_at": "2026-10-29T14:40:25.858469Z",
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
  "session_id": "74362ac0-3c26-4b5a-8bb2-a2bfbe910fe4",
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
  "last_heartbeat_at": "2026-10-29T14:40:22.838158Z",
  "last_location_at": "2026-10-29T14:40:22.838158Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/74362ac0-3c26-4b5a-8bb2-a2bfbe910fe4/close` → **200**

```json
{
  "command_id": "3c8973f9-204b-4eed-a4e9-145bb3df91e9",
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
  "phone": "+380631694517",
  "device_ref": "sandbox-10275"
}
```

```json
{
  "challenge_id": "e8eb0e60-c423-41ad-8b41-20af8b3a9522",
  "expires_at": "2026-10-29T14:45:26.778688162Z",
  "resend_available_at": "2026-10-29T14:40:27.778688162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631694517` → **200**

```json
{
  "phone": "+380631694517",
  "audience": "CLIENT",
  "code": "016790",
  "sent_at": "2026-10-29T14:40:26.78285486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8eb0e60-c423-41ad-8b41-20af8b3a9522",
  "code": "016790",
  "device_ref": "sandbox-10275"
}
```

```json
{
  "session_id": "9459a057-c998-47fe-b607-ecf521b3985a",
  "subject": {
    "type": "CLIENT",
    "id": "e6705807-17ea-4909-9441-2337338b4ccf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjcwNTgwNy0xN2VhLTQ5MDktOTQ0MS0yMzM3MzM4YjRjY2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzI3LCJpYXQiOjE3OTMyODQ4MjcsImp0aSI6IjA3MmJiMmM3LTQ2ZDItNDBmYi1iYjI1LTM3OGI3NzM5NmVlYSIsInNpZCI6Ijk0NTlhMDU3LWM5OTgtNDdmZS1iNjA3LWVjZjUyMWIzOTg1YSJ9.ujcpKvlM2dzdQ-XBJh78I_BjJW06j9a2GgAE_7uy8ic",
  "access_expires_at": "2026-10-29T14:55:27.100740894Z",
  "refresh_token": "oDkPgo7Fho_kiBLE-MnV39iEmfkrRGoTRznQLTbnZjg",
  "refresh_expires_at": "2026-11-28T14:40:27.100183283Z",
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
  "device_ref": "sandbox-11140"
}
```

```json
{
  "challenge_id": "4fd89d4e-bc00-4bb5-8280-6850b428032a",
  "expires_at": "2026-10-29T14:45:27.664018659Z",
  "resend_available_at": "2026-10-29T14:40:28.664018659Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "889023",
  "sent_at": "2026-10-29T14:40:27.66758211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fd89d4e-bc00-4bb5-8280-6850b428032a",
  "code": "889023",
  "device_ref": "sandbox-11140"
}
```

```json
{
  "session_id": "6048c513-1e82-463f-955e-2cfe8e83d935",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTcyNywiaWF0IjoxNzkzMjg0ODI3LCJqdGkiOiIyZDUyNjMzZi0yOTMyLTQ2MWEtYmVmMC0wMTQ1MThiYzNjZDMiLCJzaWQiOiI2MDQ4YzUxMy0xZTgyLTQ2M2YtOTU1ZS0yY2ZlOGU4M2Q5MzUifQ.UfzvqG_Q-2LRV7UzJNQMGORlPuy7sj61mUNwMqIOpII",
  "access_expires_at": "2026-10-29T14:55:27.97275972Z",
  "refresh_token": "EJvzzc3kzAr3a42QWV3-l0sdm7y-2tusyWaehURjSeY",
  "refresh_expires_at": "2026-11-28T14:40:27.972164375Z",
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
  "session_id": "6adcd933-ae89-4e1c-9605-dff7eed572aa",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MjgsImlhdCI6MTc5MzI4NDgyOCwianRpIjoiMGY4ZThmNTItYzA2YS00YmJjLWFlYjQtYTNkM2I1ZDQzNTk1Iiwic2lkIjoiNmFkY2Q5MzMtYWU4OS00ZTFjLTk2MDUtZGZmN2VlZDU3MmFhIn0.sGQuib9t2fbmzqXkoEwCtGCrGOe0Pl55kR3MCFFinL4",
  "access_expires_at": "2026-10-29T14:55:28.837805968Z",
  "refresh_token": "YG7OlZrEWW8v8EQL9An1VzMM7d0Tk6cpx05VXHeT654",
  "refresh_expires_at": "2026-10-30T02:40:28.837172641Z",
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
  "session_id": "24a93e83-ab92-4164-91ed-a1233cafbe20",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3MjksImlhdCI6MTc5MzI4NDgyOSwianRpIjoiYWNlMjU1ZmUtNGQ1Yy00MzFmLTkzY2ItODM3YjY2NDMwMzVhIiwic2lkIjoiMjRhOTNlODMtYWI5Mi00MTY0LTkxZWQtYTEyMzNjYWZiZTIwIn0.8odJn3Whk_1Q0S0ED_ySZba0IvTYE0I3wKcHgh9lU_Y",
  "access_expires_at": "2026-10-29T14:55:29.416709359Z",
  "refresh_token": "Ijpb-g8R26uI88zU-lE48XcejKEyI0037bj0BeAPuhM",
  "refresh_expires_at": "2026-10-30T02:40:29.416119945Z",
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
  "command_id": "760d3496-251d-428a-815e-aefc8ac3b5a1",
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
  "id": "6e3aabed-6f4d-4d92-ad33-3ef5cdfe0d1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:29.996864Z",
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
  "command_id": "19adeb2f-d473-45e4-811d-3168fc07de62",
  "quote_id": "6e3aabed-6f4d-4d92-ad33-3ef5cdfe0d1b",
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
  "id": "d416c9d7-5e20-42c5-ab80-109fe8cebce1",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6705807-17ea-4909-9441-2337338b4ccf",
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
  "created_at": "2026-10-29T14:40:30.298198Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d416c9d7-5e20-42c5-ab80-109fe8cebce1` → **200**

```json
{
  "id": "d416c9d7-5e20-42c5-ab80-109fe8cebce1",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6705807-17ea-4909-9441-2337338b4ccf",
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
  "created_at": "2026-10-29T14:40:30.298198Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d416c9d7-5e20-42c5-ab80-109fe8cebce1/cancel` → **200**

```json
{
  "command_id": "f7d6d4d6-c0c4-4ab2-8d22-1cf5c45658a8",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "d416c9d7-5e20-42c5-ab80-109fe8cebce1",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e6705807-17ea-4909-9441-2337338b4ccf",
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
  "created_at": "2026-10-29T14:40:30.298198Z",
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
  "command_id": "837c2908-4c35-4494-98a2-e23ca1ffad25",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:31Z",
    "sequence": 1793284831545
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b807ad6-2d3c-4ee4-86ea-9466b9ee9227",
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
  "last_heartbeat_at": "2026-10-29T14:40:31.565484Z",
  "last_location_at": "2026-10-29T14:40:31.565484Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8319"
}
```

```json
{
  "challenge_id": "bb91e029-ccfb-4b10-9061-5a2160c0dd16",
  "expires_at": "2026-10-29T14:45:31.84652729Z",
  "resend_available_at": "2026-10-29T14:40:32.84652729Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "492086",
  "sent_at": "2026-10-29T14:40:31.850878745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb91e029-ccfb-4b10-9061-5a2160c0dd16",
  "code": "492086",
  "device_ref": "sandbox-8319"
}
```

```json
{
  "session_id": "49c3fd01-1730-4278-a429-74fbb4d1f8c3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTczMiwiaWF0IjoxNzkzMjg0ODMyLCJqdGkiOiI3MmM5YjdiMS1hOTAzLTQxYmMtOWFmZS02ZGFmM2JmYTEzNjIiLCJzaWQiOiI0OWMzZmQwMS0xNzMwLTQyNzgtYTQyOS03NGZiYjRkMWY4YzMifQ.-QX9kiyd4RX-P89iGedHE5jvitSawyhZqDxvTCw8qxI",
  "access_expires_at": "2026-10-29T14:55:32.157134219Z",
  "refresh_token": "r4BbH8H8UOOaSY4fnL574NszQfDlq1DtU-9IWndOnHY",
  "refresh_expires_at": "2026-11-28T14:40:32.156564141Z",
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
  "command_id": "2bf7f345-3527-4ef8-afd1-3c772a4a9409",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:32Z",
    "sequence": 1793284832716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6bd713d-73cc-468b-8297-57a4b06db61e",
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
  "last_heartbeat_at": "2026-10-29T14:40:32.736861Z",
  "last_location_at": "2026-10-29T14:40:32.736861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "174fc9a0-de40-4f14-abc8-410dae884714",
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
  "id": "9d59af1a-3510-4b9f-a3d1-36f09b01414d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:33.038895Z",
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
  "command_id": "521ff559-8af4-4a51-a5e0-db059c8487f2",
  "quote_id": "9d59af1a-3510-4b9f-a3d1-36f09b01414d",
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
  "id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6705807-17ea-4909-9441-2337338b4ccf",
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
  "created_at": "2026-10-29T14:40:33.352457Z",
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
    "id": "9795c23d-4f50-4056-8a81-188bd68e53aa",
    "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
    "expires_at": "2026-10-29T14:40:48.356644Z",
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

`POST /api/driver/v1/offers/9795c23d-4f50-4056-8a81-188bd68e53aa/accept` → **200**

```json
{
  "command_id": "1729758c-9fc9-44f5-a0f6-3384fc5e9393"
}
```

```json
{
  "id": "430449a9-821d-4423-a4d0-be810704c9bf",
  "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "66e17b5d-5af1-4ed2-af6d-308dda3d811b",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "66e17b5d-5af1-4ed2-af6d-308dda3d811b",
  "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
  "assignment_id": "430449a9-821d-4423-a4d0-be810704c9bf",
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

`POST /api/driver/v1/trips/66e17b5d-5af1-4ed2-af6d-308dda3d811b/cancel` → **200**

```json
{
  "command_id": "0088ca6d-850d-4a43-a3f0-52dd70a5c4d5",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "66e17b5d-5af1-4ed2-af6d-308dda3d811b",
  "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
  "assignment_id": "430449a9-821d-4423-a4d0-be810704c9bf",
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

`GET /api/rider/v1/orders/10220589-886d-4ccd-9cc9-f0581cdfd45c` → **200**

```json
{
  "id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e6705807-17ea-4909-9441-2337338b4ccf",
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
    "id": "430449a9-821d-4423-a4d0-be810704c9bf",
    "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "66e17b5d-5af1-4ed2-af6d-308dda3d811b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:40:33.352457Z",
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
    "id": "92ada736-22d8-409e-b1d7-07b67d6bf312",
    "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
    "expires_at": "2026-10-29T14:40:49.544231Z",
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

`POST /api/driver/v1/offers/92ada736-22d8-409e-b1d7-07b67d6bf312/accept` → **200**

```json
{
  "command_id": "ab071edf-00f3-418a-ac71-9fa8012b0b4a"
}
```

```json
{
  "id": "09279a08-7db7-4f4d-a01a-48f910951cfd",
  "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1a97222d-c6f0-4074-8517-ac38ed4943e0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1a97222d-c6f0-4074-8517-ac38ed4943e0",
  "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
  "assignment_id": "09279a08-7db7-4f4d-a01a-48f910951cfd",
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

`POST /api/driver/v1/trips/1a97222d-c6f0-4074-8517-ac38ed4943e0/cancel` → **200**

```json
{
  "command_id": "d9728cfe-746d-4da5-bc9f-6dedf9f2d629",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1a97222d-c6f0-4074-8517-ac38ed4943e0",
  "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
  "assignment_id": "09279a08-7db7-4f4d-a01a-48f910951cfd",
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
    "id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:40:33.352457Z",
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
    "id": "d416c9d7-5e20-42c5-ab80-109fe8cebce1",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:40:30.298198Z",
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

`GET /api/operator/v1/orders/10220589-886d-4ccd-9cc9-f0581cdfd45c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:40:33.35313Z",
      "actor": {
        "type": "CLIENT",
        "id": "e6705807-17ea-4909-9441-2337338b4ccf",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
        "quote_id": "9d59af1a-3510-4b9f-a3d1-36f09b01414d",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "200de9e4-b24d-4802-8650-fcec316b92d2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:40:33.355673Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
        "attempt_id": "f3827352-9368-4e7f-9f18-0b2810fd5228",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "200de9e4-b24d-4802-8650-fcec316b92d2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:40:33.363095Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9795c23d-4f50-4056-8a81-188bd68e53aa",
        "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "200de9e4-b24d-4802-8650-fcec316b92d2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:40:33.957665Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9795c23d-4f50-4056-8a81-188bd68e53aa",
        "order_id": "10220589-886d-4ccd-9cc9-f0581cdfd45c",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "430449a9-821d-4423-a4d0-be810704c9bf"
      },
      "correlation_id": "7e44146f-ce67-42c2-bd56-46ec809dd771"
```

Done: orders d416c9d7-5e20-42c5-ab80-109fe8cebce1, 10220589-886d-4ccd-9cc9-f0581cdfd45c.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734017032",
  "device_ref": "sandbox-29085"
}
```

```json
{
  "challenge_id": "ffd4d2ab-efc0-4fe9-9542-2bcd9bac906a",
  "expires_at": "2026-10-29T14:45:36.967128926Z",
  "resend_available_at": "2026-10-29T14:40:37.967128926Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734017032` → **200**

```json
{
  "phone": "+380734017032",
  "audience": "CLIENT",
  "code": "220851",
  "sent_at": "2026-10-29T14:40:36.971437126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffd4d2ab-efc0-4fe9-9542-2bcd9bac906a",
  "code": "220851",
  "device_ref": "sandbox-29085"
}
```

```json
{
  "session_id": "2c73ecf3-260c-4f29-a5a3-d471cb69b8bf",
  "subject": {
    "type": "CLIENT",
    "id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTU3YWMyNy0wODkyLTQxYzItOGY3My03YTRkOWFmOTdmNjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzM3LCJpYXQiOjE3OTMyODQ4MzcsImp0aSI6ImI3MmU3NzE0LWMwMTYtNDVjNi1iZTkzLTQxMmE5MWUzODEzYSIsInNpZCI6IjJjNzNlY2YzLTI2MGMtNGYyOS1hNWEzLWQ0NzFjYjY5YjhiZiJ9.WLQ2OQ5s6OjQr1yB4ATyMBw4AjwqzVZLAcp2vfZUM-0",
  "access_expires_at": "2026-10-29T14:55:37.274059276Z",
  "refresh_token": "ufkubpqqv5qOenn_-CNCM_aF1SYl_QyO2tMoUGHnT68",
  "refresh_expires_at": "2026-11-28T14:40:37.27345741Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "2094990d-3db3-4f7d-992b-8e14f25e1a42",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "44bc9a4f-a908-4dfc-8c16-e4251adf8855",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-44bc9a4f-a908-4dfc-8c16-e4251adf8855",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a74e1a6dc4f7a765da64ef975215378d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=44bc9a4f-a908-4dfc-8c16-e4251adf8855",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734017032"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=44bc9a4f-a908-4dfc-8c16-e4251adf8855",
  "expires_at": "2026-10-29T15:10:37.559319Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/44bc9a4f-a908-4dfc-8c16-e4251adf8855` → **200**

```json
{
  "id": "44bc9a4f-a908-4dfc-8c16-e4251adf8855",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:10:37.559319Z",
  "card": {
    "id": "506c20c6-a04e-4db6-9ad9-4a9a5fae880f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9593",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:40:37.860437Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "506c20c6-a04e-4db6-9ad9-4a9a5fae880f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9593",
      "card_type": "Visa",
      "created_at": "2026-10-29T14:40:37.860437Z"
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
  "device_ref": "sandbox-18715"
}
```

```json
{
  "challenge_id": "7b8d979b-0fbe-445c-8d91-237ecf801318",
  "expires_at": "2026-10-29T14:45:38.450154586Z",
  "resend_available_at": "2026-10-29T14:40:39.450154586Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "850121",
  "sent_at": "2026-10-29T14:40:38.454378731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b8d979b-0fbe-445c-8d91-237ecf801318",
  "code": "850121",
  "device_ref": "sandbox-18715"
}
```

```json
{
  "session_id": "f09ef8ee-b3bd-474f-8b1a-167ed8d57d30",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTczOCwiaWF0IjoxNzkzMjg0ODM4LCJqdGkiOiI4ODdjMGU5NC1lNGFkLTRmMzctYmUzMC1jNTgzYzY0YzNhNDciLCJzaWQiOiJmMDllZjhlZS1iM2JkLTQ3NGYtOGIxYS0xNjdlZDhkNTdkMzAifQ.vaECL0ZmGRQSYe8c6yiR7KnLrp_aybBXnyZWqZAV0Fw",
  "access_expires_at": "2026-10-29T14:55:38.763651086Z",
  "refresh_token": "D1DLNEPhTbc6KYE6DgBOFqezLxj5PxpDiR7me2QdYS8",
  "refresh_expires_at": "2026-11-28T14:40:38.763053769Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6bd713d-73cc-468b-8297-57a4b06db61e",
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
  "last_heartbeat_at": "2026-10-29T14:40:32.736861Z",
  "last_location_at": "2026-10-29T14:40:32.736861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b6bd713d-73cc-468b-8297-57a4b06db61e/handover` → **200**

```json
{
  "command_id": "a881667e-2c7a-441d-9cf1-7624f71e8009",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6bd713d-73cc-468b-8297-57a4b06db61e",
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
  "last_heartbeat_at": "2026-10-29T14:40:32.736861Z",
  "last_location_at": "2026-10-29T14:40:32.736861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b6bd713d-73cc-468b-8297-57a4b06db61e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:39Z",
    "sequence": 1793284839633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6bd713d-73cc-468b-8297-57a4b06db61e",
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
  "last_heartbeat_at": "2026-10-29T14:40:39.652985Z",
  "last_location_at": "2026-10-29T14:40:39.652985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "86786ab6-3222-44a4-a26a-46ae42daa599",
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
  "id": "6cc1e1dd-56b0-41b5-9d56-67665670a3cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:39.950731Z",
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
  "command_id": "ad87558d-7ce0-47b1-b565-cd7983be731e",
  "quote_id": "6cc1e1dd-56b0-41b5-9d56-67665670a3cf",
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
  "id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
  "created_at": "2026-10-29T14:40:40.270253Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f0f4cdcf-96b2-45bf-ae75-aa681617d142` → **200**

```json
{
  "id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
  "created_at": "2026-10-29T14:40:40.270253Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f0f4cdcf-96b2-45bf-ae75-aa681617d142` → **200**

```json
{
  "id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
  "created_at": "2026-10-29T14:40:40.270253Z",
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
    "id": "28a4adc7-2fea-4fcd-82ad-f0a3c62d28f5",
    "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
    "expires_at": "2026-10-29T14:40:55.959903Z",
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

`POST /api/driver/v1/offers/28a4adc7-2fea-4fcd-82ad-f0a3c62d28f5/accept` → **200**

```json
{
  "command_id": "78379643-9389-41e3-a32e-13a2ac979cac"
}
```

```json
{
  "id": "c33aec4d-4bbd-4337-8580-d0759b598b54",
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1",
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "assignment_id": "c33aec4d-4bbd-4337-8580-d0759b598b54",
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

`POST /api/driver/v1/work-sessions/b6bd713d-73cc-468b-8297-57a4b06db61e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:43Z",
    "sequence": 1793284843683
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6bd713d-73cc-468b-8297-57a4b06db61e",
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
  "last_heartbeat_at": "2026-10-29T14:40:43.089416Z",
  "last_location_at": "2026-10-29T14:40:43.089416Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1/arrive` → **200**

```json
{
  "command_id": "d66ef1c0-eecf-4b71-a8c3-f1ded2d4da9e",
  "expected_version": 0
}
```

```json
{
  "id": "e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1",
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "assignment_id": "c33aec4d-4bbd-4337-8580-d0759b598b54",
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
  "arrived_at": "2026-10-29T14:40:43.383371Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1/start` → **200**

```json
{
  "command_id": "8181edb9-6c82-4967-9fb7-85aa420b084f",
  "expected_version": 1
}
```

```json
{
  "id": "e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1",
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "assignment_id": "c33aec4d-4bbd-4337-8580-d0759b598b54",
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
  "arrived_at": "2026-10-29T14:40:43.383371Z",
  "started_at": "2026-10-29T14:40:43.683852Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1/complete` → **200**

```json
{
  "command_id": "54332c54-3c05-40d9-8596-754a0cc993e2",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:43Z",
  "cash_received": true
}
```

```json
{
  "id": "e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1",
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "assignment_id": "c33aec4d-4bbd-4337-8580-d0759b598b54",
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
  "arrived_at": "2026-10-29T14:40:43.383371Z",
  "started_at": "2026-10-29T14:40:43.683852Z",
  "completed_at": "2026-10-29T14:40:43.988908Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f0f4cdcf-96b2-45bf-ae75-aa681617d142` → **200**

```json
{
  "id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
    "id": "c33aec4d-4bbd-4337-8580-d0759b598b54",
    "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:40:40.270253Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f0f4cdcf-96b2-45bf-ae75-aa681617d142` → **200**

```json
{
  "id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
    "id": "c33aec4d-4bbd-4337-8580-d0759b598b54",
    "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e6acc70b-f1c2-4df7-ad80-4d3ce1508ae1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:40:40.270253Z",
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

`GET /api/rider/v1/orders/f0f4cdcf-96b2-45bf-ae75-aa681617d142/tip` → **200**

```json
{
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
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
  "available_until": "2026-10-30T14:40:43.988908Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f0f4cdcf-96b2-45bf-ae75-aa681617d142/tip` → **201**

```json
{
  "command_id": "66ac627d-685f-45a4-9f54-410671000f69",
  "amount_minor": 2500
}
```

```json
{
  "id": "35e97654-08df-4430-956c-4c809103d192",
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:40:46.523963Z"
}
```

`GET /api/rider/v1/orders/f0f4cdcf-96b2-45bf-ae75-aa681617d142/tip` → **200**

```json
{
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
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
  "available_until": "2026-10-30T14:40:43.988908Z",
  "open": false,
  "tip": {
    "id": "35e97654-08df-4430-956c-4c809103d192",
    "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T14:40:46.523963Z"
  }
}
```

`GET /api/rider/v1/orders/f0f4cdcf-96b2-45bf-ae75-aa681617d142/tip` → **200**

```json
{
  "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
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
  "available_until": "2026-10-30T14:40:43.988908Z",
  "open": false,
  "tip": {
    "id": "35e97654-08df-4430-956c-4c809103d192",
    "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:40:46.523963Z"
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
      "id": "e13b084b-6aad-4402-9efc-60a4de93e13d",
      "at": "2026-10-29T14:40:48.09779Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
      "counterpart_id": null
    },
    {
      "id": "112ec466-7e4a-41e3-b180-58aaa27519d7",
      "at": "2026-10-29T14:40:44.034607Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82c99ebc-d8d5-4780-8032-701e22d57f5b",
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
  "id": "b64be245-9661-429a-9a26-0b63f9c03d64",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:45:48.692048Z",
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
  "session_id": "79a29682-e036-4cc0-bcd6-96a1b8b721d9",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3NDksImlhdCI6MTc5MzI4NDg0OSwianRpIjoiNzU0YzA3NjAtNTBkNy00YzVlLWI2YTUtNzZhMDdjMzhkOGFkIiwic2lkIjoiNzlhMjk2ODItZTAzNi00Y2MwLWJjZDYtOTZhMWI4YjcyMWQ5In0.yfmmFWl9s_YdnN5ZiOvY5pn-IBRYPYqEpT1R5vzPTPw",
  "access_expires_at": "2026-10-29T14:55:49.293219897Z",
  "refresh_token": "xwBTSuYu4n04s2lzKzRix84tUExbTgOb0LCb5IYpn3U",
  "refresh_expires_at": "2026-10-30T02:40:49.292558007Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734017032` → **200**

```json
{
  "client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63"
}
```

`POST /api/admin/v1/rider-wallets/2a57ac27-0892-41c2-8f73-7a4d9af97f63/top-ups` → **201**

```json
{
  "command_id": "66a6c437-386e-4967-9962-3060dbd5ce3c",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
      "id": "5580c13e-f6d5-4eb7-abbd-6909b2fedeaa",
      "at": "2026-10-29T14:40:49.8488Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0bef59fe-5f24-4ab2-8b81-b38d1b92b356",
  "quote_id": "b64be245-9661-429a-9a26-0b63f9c03d64",
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
  "id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
  "created_at": "2026-10-29T14:40:50.155438Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/844054b1-1228-46ad-b6c9-9cef55e63ce3` → **200**

```json
{
  "id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
  "created_at": "2026-10-29T14:40:50.155438Z",
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
    "id": "e213ac76-3dd3-4674-bbec-c7e8456533f6",
    "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
    "expires_at": "2026-10-29T14:41:05.160762Z",
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

`POST /api/driver/v1/offers/e213ac76-3dd3-4674-bbec-c7e8456533f6/accept` → **200**

```json
{
  "command_id": "2058d4b9-a0a3-482d-8f6b-d4e590936068"
}
```

```json
{
  "id": "7a866ea8-f16f-4cdf-aa50-d1a2f656c018",
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "73415ed3-97af-4a6c-8bbf-468ce66cb295",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "73415ed3-97af-4a6c-8bbf-468ce66cb295",
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
  "assignment_id": "7a866ea8-f16f-4cdf-aa50-d1a2f656c018",
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

`POST /api/driver/v1/work-sessions/b6bd713d-73cc-468b-8297-57a4b06db61e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:40:51Z",
    "sequence": 1793284851660
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6bd713d-73cc-468b-8297-57a4b06db61e",
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
  "last_heartbeat_at": "2026-10-29T14:40:51.67981Z",
  "last_location_at": "2026-10-29T14:40:51.67981Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/73415ed3-97af-4a6c-8bbf-468ce66cb295/arrive` → **200**

```json
{
  "command_id": "db55097d-cf8f-406c-93d8-61cf83822d00",
  "expected_version": 0
}
```

```json
{
  "id": "73415ed3-97af-4a6c-8bbf-468ce66cb295",
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
  "assignment_id": "7a866ea8-f16f-4cdf-aa50-d1a2f656c018",
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
  "arrived_at": "2026-10-29T14:40:51.968751Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/73415ed3-97af-4a6c-8bbf-468ce66cb295/start` → **200**

```json
{
  "command_id": "f077978b-3a9e-4ed9-aa20-8b9b283fd7ba",
  "expected_version": 1
}
```

```json
{
  "id": "73415ed3-97af-4a6c-8bbf-468ce66cb295",
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
  "assignment_id": "7a866ea8-f16f-4cdf-aa50-d1a2f656c018",
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
  "arrived_at": "2026-10-29T14:40:51.968751Z",
  "started_at": "2026-10-29T14:40:52.288736Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/73415ed3-97af-4a6c-8bbf-468ce66cb295/complete` → **200**

```json
{
  "command_id": "b5574e91-b7f1-49f7-a81a-37d45fe902a4",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:40:52Z",
  "cash_received": true
}
```

```json
{
  "id": "73415ed3-97af-4a6c-8bbf-468ce66cb295",
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
  "assignment_id": "7a866ea8-f16f-4cdf-aa50-d1a2f656c018",
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
  "arrived_at": "2026-10-29T14:40:51.968751Z",
  "started_at": "2026-10-29T14:40:52.288736Z",
  "completed_at": "2026-10-29T14:40:52.584652Z",
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
  "client_id": "2a57ac27-0892-41c2-8f73-7a4d9af97f63",
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
      "id": "5580c13e-f6d5-4eb7-abbd-6909b2fedeaa",
      "at": "2026-10-29T14:40:49.8488Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
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

`GET /api/rider/v1/orders/844054b1-1228-46ad-b6c9-9cef55e63ce3/tip` → **200**

```json
{
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
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
  "available_until": "2026-10-30T14:40:52.584652Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/844054b1-1228-46ad-b6c9-9cef55e63ce3/tip` → **201**

```json
{
  "command_id": "f7c2d378-0f4c-478e-8ab6-6d7aac5fa732",
  "amount_minor": 2500
}
```

```json
{
  "id": "5776e975-43c5-4e59-b8fe-b870c149086e",
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:40:53.763873Z"
}
```

`GET /api/rider/v1/orders/844054b1-1228-46ad-b6c9-9cef55e63ce3/tip` → **200**

```json
{
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
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
  "available_until": "2026-10-30T14:40:52.584652Z",
  "open": false,
  "tip": {
    "id": "5776e975-43c5-4e59-b8fe-b870c149086e",
    "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T14:40:53.763873Z"
  }
}
```

`GET /api/rider/v1/orders/844054b1-1228-46ad-b6c9-9cef55e63ce3/tip` → **200**

```json
{
  "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
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
  "available_until": "2026-10-30T14:40:52.584652Z",
  "open": false,
  "tip": {
    "id": "5776e975-43c5-4e59-b8fe-b870c149086e",
    "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:40:53.763873Z"
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
      "id": "a04fb4e1-0e32-4efe-a4aa-d4cf72c4faf4",
      "at": "2026-10-29T14:40:55.177835Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
      "counterpart_id": null
    },
    {
      "id": "479d341e-2f22-4e06-b2c2-6e508ea55959",
      "at": "2026-10-29T14:40:53.147997Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "844054b1-1228-46ad-b6c9-9cef55e63ce3",
      "counterpart_id": null
    },
    {
      "id": "e13b084b-6aad-4402-9efc-60a4de93e13d",
      "at": "2026-10-29T14:40:48.09779Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
      "counterpart_id": null
    },
    {
      "id": "112ec466-7e4a-41e3-b180-58aaa27519d7",
      "at": "2026-10-29T14:40:44.034607Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f0f4cdcf-96b2-45bf-ae75-aa681617d142",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6bd713d-73cc-468b-8297-57a4b06db61e",
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
  "last_heartbeat_at": "2026-10-29T14:40:51.67981Z",
  "last_location_at": "2026-10-29T14:40:51.67981Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b6bd713d-73cc-468b-8297-57a4b06db61e/close` → **200**

```json
{
  "command_id": "6b338e72-d525-430e-8626-276f02a8dacb",
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

Done: card order 844054b1-1228-46ad-b6c9-9cef55e63ce3.

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
  "phone": "+380730965792",
  "device_ref": "sandbox-19412"
}
```

```json
{
  "challenge_id": "27848261-b321-4f5d-997b-61b95c75fd81",
  "expires_at": "2026-10-29T14:45:56.821801929Z",
  "resend_available_at": "2026-10-29T14:40:57.821801929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730965792` → **200**

```json
{
  "phone": "+380730965792",
  "audience": "CLIENT",
  "code": "315766",
  "sent_at": "2026-10-29T14:40:56.825567025Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27848261-b321-4f5d-997b-61b95c75fd81",
  "code": "315766",
  "device_ref": "sandbox-19412"
}
```

```json
{
  "session_id": "f6b3299f-ae23-42ee-862f-d727535b13dd",
  "subject": {
    "type": "CLIENT",
    "id": "38e958b9-70b2-4273-8e75-e18499487f33"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGU5NThiOS03MGIyLTQyNzMtOGU3NS1lMTg0OTk0ODdmMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzU3LCJpYXQiOjE3OTMyODQ4NTcsImp0aSI6ImQzYmZhMGJmLTQ5NDYtNDFkYi04MjA2LTMzNGRkYWVjZWE0YyIsInNpZCI6ImY2YjMyOTlmLWFlMjMtNDJlZS04NjJmLWQ3Mjc1MzViMTNkZCJ9.ClL0bSCH7_VlqgWI_9ihwjydkYm0pZzxS1-t-6j0pHA",
  "access_expires_at": "2026-10-29T14:55:57.131249567Z",
  "refresh_token": "6pakGNfeRuMjDkK9VrsH600qKkqJ-0f2xAihWQs9Ia4",
  "refresh_expires_at": "2026-11-28T14:40:57.130436219Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "d56b87c1-19b5-430f-8d24-3409c13897a0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "83c3cdb9-8be8-47e1-8ce4-66aff94f7bd0",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-83c3cdb9-8be8-47e1-8ce4-66aff94f7bd0",
    "orderDate": "1793284857",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "410e77d2c347f653d07f61e003adc84f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=83c3cdb9-8be8-47e1-8ce4-66aff94f7bd0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730965792"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=83c3cdb9-8be8-47e1-8ce4-66aff94f7bd0",
  "created_at": "2026-10-29T14:40:57.428157Z",
  "expires_at": "2026-10-29T15:10:57.428157Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/83c3cdb9-8be8-47e1-8ce4-66aff94f7bd0` → **200**

```json
{
  "id": "83c3cdb9-8be8-47e1-8ce4-66aff94f7bd0",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:40:57.428157Z",
  "expires_at": "2026-10-29T15:10:57.428157Z",
  "completed_at": "2026-10-29T14:40:57.730975Z",
  "masked_pan": "41****0329",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "38e958b9-70b2-4273-8e75-e18499487f33",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "38e958b9-70b2-4273-8e75-e18499487f33",
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
      "id": "53c46c44-cc82-498b-b445-e3f4864227c0",
      "at": "2026-10-29T14:40:58.199125Z",
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
  "client_id": "38e958b9-70b2-4273-8e75-e18499487f33",
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
      "id": "53c46c44-cc82-498b-b445-e3f4864227c0",
      "at": "2026-10-29T14:40:58.199125Z",
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
  "device_ref": "sandbox-8217"
}
```

```json
{
  "challenge_id": "016f7ad2-7ba4-4543-a93e-4042f36f0a70",
  "expires_at": "2026-10-29T14:45:59.903958994Z",
  "resend_available_at": "2026-10-29T14:41:00.903958994Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "395262",
  "sent_at": "2026-10-29T14:40:59.907261388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "016f7ad2-7ba4-4543-a93e-4042f36f0a70",
  "code": "395262",
  "device_ref": "sandbox-8217"
}
```

```json
{
  "session_id": "33dbecd2-c627-4a19-b90e-5d2560e73f33",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc2MCwiaWF0IjoxNzkzMjg0ODYwLCJqdGkiOiJmMmQzN2JlNC0wYTcwLTRiNDEtYjgzOC05NzBlYzM3YzZiODEiLCJzaWQiOiIzM2RiZWNkMi1jNjI3LTRhMTktYjkwZS01ZDI1NjBlNzNmMzMifQ.Qy9iM2ZLFEPZFs-CWVHqQfQqIrwfXM1rL4TtLxAC5-4",
  "access_expires_at": "2026-10-29T14:56:00.222667942Z",
  "refresh_token": "0BFAnlSQzAgXgIrgCVUFHt_hdI4wmWGaXLEJW-EyYaY",
  "refresh_expires_at": "2026-11-28T14:41:00.22207969Z",
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
  "command_id": "e0f31d66-37e7-4ec2-8875-2d772d6fd9ef",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "f9435b81-c9b0-4571-a013-8203512ea72b",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f9435b81-c9b0-4571-a013-8203512ea72b",
    "orderDate": "1793284860",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "d5a6625c31b6de60ece7377d38ec503b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f9435b81-c9b0-4571-a013-8203512ea72b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f9435b81-c9b0-4571-a013-8203512ea72b",
  "created_at": "2026-10-29T14:41:00.79804Z",
  "expires_at": "2026-10-29T15:11:00.79804Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/f9435b81-c9b0-4571-a013-8203512ea72b` → **200**

```json
{
  "id": "f9435b81-c9b0-4571-a013-8203512ea72b",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:41:00.79804Z",
  "expires_at": "2026-10-29T15:11:00.79804Z",
  "completed_at": "2026-10-29T14:41:01.089449Z",
  "masked_pan": "41****1325",
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
      "id": "9f02e306-c025-4889-9a7b-5fdd181f8ee1",
      "at": "2026-10-29T14:41:01.206782Z",
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
  "command_id": "7b59482a-1777-49ec-9f0e-a820c86f2ba9",
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
  "correlation_id": "897f25eb-0c9c-4162-8e13-102d6800f6bb"
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
  "device_ref": "sandbox-2270"
}
```

```json
{
  "challenge_id": "3d96a9ea-a7ce-483b-ae64-8b8ad3320751",
  "expires_at": "2026-10-29T14:46:02.016336398Z",
  "resend_available_at": "2026-10-29T14:41:03.016336398Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "892587",
  "sent_at": "2026-10-29T14:41:02.019963676Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d96a9ea-a7ce-483b-ae64-8b8ad3320751",
  "code": "892587",
  "device_ref": "sandbox-2270"
}
```

```json
{
  "session_id": "5a542f3d-7548-4b91-9c85-d293a263b186",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc2MiwiaWF0IjoxNzkzMjg0ODYyLCJqdGkiOiI3NmQ1NTk1YS1hMWE1LTQwM2MtOGRmNi0wYmRlOGYyNTJmNTEiLCJzaWQiOiI1YTU0MmYzZC03NTQ4LTRiOTEtOWM4NS1kMjkzYTI2M2IxODYifQ.lAFYSblIgRJ8LnHaXdusLYJhj7KtJ2klcDq5alCeIDA",
  "access_expires_at": "2026-10-29T14:56:02.331829073Z",
  "refresh_token": "NyfgIH7pW_pGlKS5xyG4Ib2isv65VabDJuuy9d_DmK4",
  "refresh_expires_at": "2026-11-28T14:41:02.331120947Z",
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
  "command_id": "f6b4a8a5-33b6-469c-9b23-578963e6d8ed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:02Z",
    "sequence": 1793284862892
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6487938e-82d6-4641-a63d-a13292ce53f4",
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
  "last_heartbeat_at": "2026-10-29T14:41:02.911833Z",
  "last_location_at": "2026-10-29T14:41:02.911833Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635699126",
  "device_ref": "sandbox-26509"
}
```

```json
{
  "challenge_id": "9a27abd4-9911-41b0-9f0d-50733e0e03b6",
  "expires_at": "2026-10-29T14:46:03.196019556Z",
  "resend_available_at": "2026-10-29T14:41:04.196019556Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635699126` → **200**

```json
{
  "phone": "+380635699126",
  "audience": "CLIENT",
  "code": "176055",
  "sent_at": "2026-10-29T14:41:03.199451494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a27abd4-9911-41b0-9f0d-50733e0e03b6",
  "code": "176055",
  "device_ref": "sandbox-26509"
}
```

```json
{
  "session_id": "66f00c62-d913-4438-ab74-97f75a4c5dbd",
  "subject": {
    "type": "CLIENT",
    "id": "6e9a3c72-4b1a-4cac-9122-a119c12ad673"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTlhM2M3Mi00YjFhLTRjYWMtOTEyMi1hMTE5YzEyYWQ2NzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzYzLCJpYXQiOjE3OTMyODQ4NjMsImp0aSI6IjMwNmZjYTAyLTgzYWQtNGI2NC1hOTIzLWVjYjhkNDU5ZDRlOCIsInNpZCI6IjY2ZjAwYzYyLWQ5MTMtNDQzOC1hYjc0LTk3Zjc1YTRjNWRiZCJ9.09mnljfkXhcYCpBTNkMK_ccbrXcIpIM0N7gCCR7AsIU",
  "access_expires_at": "2026-10-29T14:56:03.500941708Z",
  "refresh_token": "cl0tIqb6nIW21GTSLPuEoAvfiOPk_iXEUIRxscTo_3U",
  "refresh_expires_at": "2026-11-28T14:41:03.500342695Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4c557cb4-3c88-436a-b2b1-89723d5c6802",
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
  "id": "57267adb-91a1-4723-957c-5d1895865087",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:03.796188Z",
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
  "command_id": "6652e828-8961-4814-b088-b84250bae56e",
  "quote_id": "57267adb-91a1-4723-957c-5d1895865087",
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
  "id": "a22aa052-105d-446c-94be-2a9c109b8791",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6e9a3c72-4b1a-4cac-9122-a119c12ad673",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:41:04.093497Z",
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
    "id": "7cd32840-16be-44c4-9d83-6c0a9e317156",
    "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
    "expires_at": "2026-10-29T14:41:19.097329Z",
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

`POST /api/driver/v1/offers/7cd32840-16be-44c4-9d83-6c0a9e317156/accept` → **200**

```json
{
  "command_id": "565d5aa9-8dab-4781-bb4f-cbb38f70bffd"
}
```

```json
{
  "id": "0192201b-2f1b-4d25-a6f3-f4a9ec1f7e85",
  "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6a28c508-b23e-46a8-b458-b6203f540484",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6a28c508-b23e-46a8-b458-b6203f540484",
  "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
  "assignment_id": "0192201b-2f1b-4d25-a6f3-f4a9ec1f7e85",
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

`POST /api/driver/v1/work-sessions/6487938e-82d6-4641-a63d-a13292ce53f4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:05Z",
    "sequence": 1793284865249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6487938e-82d6-4641-a63d-a13292ce53f4",
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
  "last_heartbeat_at": "2026-10-29T14:41:05.269845Z",
  "last_location_at": "2026-10-29T14:41:05.269845Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6a28c508-b23e-46a8-b458-b6203f540484/arrive` → **200**

```json
{
  "command_id": "42a371a6-e713-48b8-acbe-cfe13ec9f1a9",
  "expected_version": 0
}
```

```json
{
  "id": "6a28c508-b23e-46a8-b458-b6203f540484",
  "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
  "assignment_id": "0192201b-2f1b-4d25-a6f3-f4a9ec1f7e85",
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
  "arrived_at": "2026-10-29T14:41:05.564226Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6a28c508-b23e-46a8-b458-b6203f540484/start` → **200**

```json
{
  "command_id": "55cf7605-4866-48ab-b066-51a2e1060738",
  "expected_version": 1
}
```

```json
{
  "id": "6a28c508-b23e-46a8-b458-b6203f540484",
  "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
  "assignment_id": "0192201b-2f1b-4d25-a6f3-f4a9ec1f7e85",
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
  "arrived_at": "2026-10-29T14:41:05.564226Z",
  "started_at": "2026-10-29T14:41:05.864973Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6a28c508-b23e-46a8-b458-b6203f540484/complete` → **200**

```json
{
  "command_id": "37aeb20c-b420-47f2-aa5b-9cf2510edf4b",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:41:06Z",
  "cash_received": false
}
```

```json
{
  "id": "6a28c508-b23e-46a8-b458-b6203f540484",
  "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
  "assignment_id": "0192201b-2f1b-4d25-a6f3-f4a9ec1f7e85",
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
  "arrived_at": "2026-10-29T14:41:05.564226Z",
  "started_at": "2026-10-29T14:41:05.864973Z",
  "completed_at": "2026-10-29T14:41:06.168479Z",
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
  "session_id": "e304ea2c-132b-45eb-8382-97e5afc30bde",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3NjYsImlhdCI6MTc5MzI4NDg2NiwianRpIjoiZGI5MTU0MDEtMWFkYi00ZTljLWFkNjgtZDM4NTdiNWE3MGY2Iiwic2lkIjoiZTMwNGVhMmMtMTMyYi00NWViLTgzODItOTdlNWFmYzMwYmRlIn0.mzXhLclslQrhnGtnEaPTYI_y-3aJistKqagxbbb7WVk",
  "access_expires_at": "2026-10-29T14:56:06.781896779Z",
  "refresh_token": "NJHD4R5R6l7CVzzr3GV43BkSL0AvMtthiaH-0P9BDDM",
  "refresh_expires_at": "2026-10-30T02:41:06.781223918Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a22aa052-105d-446c-94be-2a9c109b8791/cash-dispute` → **200**

```json
{
  "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "6e9a3c72-4b1a-4cac-9122-a119c12ad673",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:41:06.258228Z",
  "decide_by": "2026-11-12T14:41:06.258228Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T14:41:06.258228Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "6e9a3c72-4b1a-4cac-9122-a119c12ad673",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T14:41:06.258228Z",
      "decide_by": "2026-11-12T14:41:06.258228Z",
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

`POST /api/admin/v1/orders/a22aa052-105d-446c-94be-2a9c109b8791/cash-dispute/decide` → **400**

```json
{
  "command_id": "f1e3d002-8533-41a5-ae14-11fb999b986a",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/a22aa052-105d-446c-94be-2a9c109b8791/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "cffa6786-d1a3-4119-b7e3-b683674b6e42",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/a22aa052-105d-446c-94be-2a9c109b8791/cash-dispute/decide` → **200**

```json
{
  "command_id": "a6fb72da-951d-46f7-b5a5-c274d4c9c638",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "6e9a3c72-4b1a-4cac-9122-a119c12ad673",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:41:06.258228Z",
  "decide_by": "2026-11-12T14:41:06.258228Z",
  "decision": "PAY_DRIVER",
  "decided_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T14:41:07.958022Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/a22aa052-105d-446c-94be-2a9c109b8791/cash-dispute/decide` → **409**

```json
{
  "command_id": "fc8502fb-4142-4983-ae36-9902552043c3",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a22aa052-105d-446c-94be-2a9c109b8791/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ebeaa0f2-be7a-429d-99e6-dffe155ddcda"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6487938e-82d6-4641-a63d-a13292ce53f4",
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
  "last_heartbeat_at": "2026-10-29T14:41:05.269845Z",
  "last_location_at": "2026-10-29T14:41:05.269845Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6487938e-82d6-4641-a63d-a13292ce53f4/close` → **200**

```json
{
  "command_id": "bbda184c-3b02-4cd3-a38e-da32a2f99580",
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
  "phone": "+380738496133",
  "device_ref": "sandbox-4583"
}
```

```json
{
  "challenge_id": "f3ed77fe-b2db-44e9-8db7-1decf35e54ab",
  "expires_at": "2026-10-29T14:46:09.122230321Z",
  "resend_available_at": "2026-10-29T14:41:10.122230321Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738496133` → **200**

```json
{
  "phone": "+380738496133",
  "audience": "CLIENT",
  "code": "361531",
  "sent_at": "2026-10-29T14:41:09.125241502Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3ed77fe-b2db-44e9-8db7-1decf35e54ab",
  "code": "361531",
  "device_ref": "sandbox-4583"
}
```

```json
{
  "session_id": "c5219e04-96ae-4c45-8f3e-4de0580a563e",
  "subject": {
    "type": "CLIENT",
    "id": "ff542837-2cb1-4253-8420-e5b319c48aef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZjU0MjgzNy0yY2IxLTQyNTMtODQyMC1lNWIzMTljNDhhZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzY5LCJpYXQiOjE3OTMyODQ4NjksImp0aSI6IjIyZmY4NzkxLTcxYzYtNGU3Ny04ZjliLTk0ZjcxYzIwZjk3MiIsInNpZCI6ImM1MjE5ZTA0LTk2YWUtNGM0NS04ZjNlLTRkZTA1ODBhNTYzZSJ9.-4HpYvjmMVgwvw6f0_82x1t_YHSqG4L3oZhhJlNZpMo",
  "access_expires_at": "2026-10-29T14:56:09.437636194Z",
  "refresh_token": "PX2zVCZhEGC5tbMyUzOwdg9vyIiNP5nQQ9N13SbYEFE",
  "refresh_expires_at": "2026-11-28T14:41:09.437070637Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c98ec7a3-a227-4178-8004-b9e54e1fc4c4",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ee3ea8e9-8e18-474f-bc35-30ef6ec5263c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ee3ea8e9-8e18-474f-bc35-30ef6ec5263c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "710ea2af4b6fdff0bc42e09e20b9fab0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ee3ea8e9-8e18-474f-bc35-30ef6ec5263c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738496133"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ee3ea8e9-8e18-474f-bc35-30ef6ec5263c",
  "expires_at": "2026-10-29T15:11:09.728536Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ee3ea8e9-8e18-474f-bc35-30ef6ec5263c` → **200**

```json
{
  "id": "ee3ea8e9-8e18-474f-bc35-30ef6ec5263c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:11:09.728536Z",
  "card": {
    "id": "ea6f1039-a516-4058-b36e-c4f883ed906e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3499",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:41:10.014723Z"
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
  "device_ref": "sandbox-5873"
}
```

```json
{
  "challenge_id": "c5e9459d-b3b8-4bc1-89c6-9a485ed5d627",
  "expires_at": "2026-10-29T14:46:10.329172164Z",
  "resend_available_at": "2026-10-29T14:41:11.329172164Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "124454",
  "sent_at": "2026-10-29T14:41:10.332229293Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5e9459d-b3b8-4bc1-89c6-9a485ed5d627",
  "code": "124454",
  "device_ref": "sandbox-5873"
}
```

```json
{
  "session_id": "3a9dc857-e3bb-46b6-90e2-04eb83bf3328",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTc3MCwiaWF0IjoxNzkzMjg0ODcwLCJqdGkiOiJkZTU2MzQ3Yy03YjFiLTRhMzItYThmNC1lMTRhNDFiNDU1ODUiLCJzaWQiOiIzYTlkYzg1Ny1lM2JiLTQ2YjYtOTBlMi0wNGViODNiZjMzMjgifQ.DVH3Vm6PLhyIDWWTqIrpsyKpvws8q0fsYRGF_gE9Tjo",
  "access_expires_at": "2026-10-29T14:56:10.63894638Z",
  "refresh_token": "PSlqcZYlfRynJsDpnpEMye9dWI0uDDm4DWJU0yMspXY",
  "refresh_expires_at": "2026-11-28T14:41:10.638356184Z",
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
  "command_id": "9eb004cf-6d5e-4687-b5e3-72e8ce9b0985",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:11Z",
    "sequence": 1793284871198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "056d7858-466a-440d-af4f-d755ef33d994",
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
  "last_heartbeat_at": "2026-10-29T14:41:11.217804Z",
  "last_location_at": "2026-10-29T14:41:11.217804Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e1d084f-50e1-49fb-bb75-bbc6e068960c",
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
  "id": "ed3cada3-4a45-4695-b398-2787058ccc38",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:11.512743Z",
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
  "command_id": "54ce1b32-2215-46d8-a794-df34d9941c78",
  "quote_id": "ed3cada3-4a45-4695-b398-2787058ccc38",
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
  "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ff542837-2cb1-4253-8420-e5b319c48aef",
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
  "created_at": "2026-10-29T14:41:11.824Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1` → **200**

```json
{
  "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ff542837-2cb1-4253-8420-e5b319c48aef",
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
  "created_at": "2026-10-29T14:41:11.824Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1` → **200**

```json
{
  "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ff542837-2cb1-4253-8420-e5b319c48aef",
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
  "created_at": "2026-10-29T14:41:11.824Z",
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
    "id": "611ecd98-813f-4e7e-bedf-311fe569c767",
    "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
    "expires_at": "2026-10-29T14:41:27.306013Z",
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

`POST /api/driver/v1/offers/611ecd98-813f-4e7e-bedf-311fe569c767/accept` → **200**

```json
{
  "command_id": "6248dd7e-a173-43c2-a402-a6044d02b619"
}
```

```json
{
  "id": "a0b39d24-b6ae-4bc3-81df-f98cfd86eaec",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "23ae7dc0-66bf-43df-bfdf-b41e7d70dc22",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "23ae7dc0-66bf-43df-bfdf-b41e7d70dc22",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "assignment_id": "a0b39d24-b6ae-4bc3-81df-f98cfd86eaec",
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

`POST /api/rider/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/messages` → **201**

```json
{
  "command_id": "446a2c0a-abdf-4442-a04c-d3505a17d50b",
  "body": "Я біля входу, мій номер +380738496133, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "4257a589-e3fb-49ef-8eb0-064d202dd99a",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380738496133, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T14:41:14.706694848Z"
}
```

`POST /api/driver/v1/trips/23ae7dc0-66bf-43df-bfdf-b41e7d70dc22/messages` → **201**

```json
{
  "command_id": "ac79daef-ef90-40c5-8d3d-5c17610ec7b1",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "483056af-b747-4719-995c-4e65da6c8c67",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T14:41:15.026045721Z"
}
```

`POST /api/driver/v1/work-sessions/056d7858-466a-440d-af4f-d755ef33d994/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:15Z",
    "sequence": 1793284875325
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "056d7858-466a-440d-af4f-d755ef33d994",
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
  "last_heartbeat_at": "2026-10-29T14:41:15.346155Z",
  "last_location_at": "2026-10-29T14:41:15.346155Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/23ae7dc0-66bf-43df-bfdf-b41e7d70dc22/arrive` → **200**

```json
{
  "command_id": "a48b8cc7-cdd2-4b3e-bee0-aa3aec79126a",
  "expected_version": 0
}
```

```json
{
  "id": "23ae7dc0-66bf-43df-bfdf-b41e7d70dc22",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "assignment_id": "a0b39d24-b6ae-4bc3-81df-f98cfd86eaec",
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
  "arrived_at": "2026-10-29T14:41:15.654652Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/23ae7dc0-66bf-43df-bfdf-b41e7d70dc22/start` → **200**

```json
{
  "command_id": "1af9a311-2948-44d6-85c8-a08623adf518",
  "expected_version": 1
}
```

```json
{
  "id": "23ae7dc0-66bf-43df-bfdf-b41e7d70dc22",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "assignment_id": "a0b39d24-b6ae-4bc3-81df-f98cfd86eaec",
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
  "arrived_at": "2026-10-29T14:41:15.654652Z",
  "started_at": "2026-10-29T14:41:15.955541Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/056d7858-466a-440d-af4f-d755ef33d994/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:41:16Z",
    "sequence": 1793284876252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "056d7858-466a-440d-af4f-d755ef33d994",
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
  "last_heartbeat_at": "2026-10-29T14:41:16.272195Z",
  "last_location_at": "2026-10-29T14:41:16.272195Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/23ae7dc0-66bf-43df-bfdf-b41e7d70dc22/complete` → **200**

```json
{
  "command_id": "56273cb6-de4e-4521-98ce-917b32cd4829",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:41:16Z",
  "cash_received": false
}
```

```json
{
  "id": "23ae7dc0-66bf-43df-bfdf-b41e7d70dc22",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "assignment_id": "a0b39d24-b6ae-4bc3-81df-f98cfd86eaec",
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
  "arrived_at": "2026-10-29T14:41:15.654652Z",
  "started_at": "2026-10-29T14:41:15.955541Z",
  "completed_at": "2026-10-29T14:41:16.588844Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1` → **200**

```json
{
  "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ff542837-2cb1-4253-8420-e5b319c48aef",
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
    "id": "a0b39d24-b6ae-4bc3-81df-f98cfd86eaec",
    "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "23ae7dc0-66bf-43df-bfdf-b41e7d70dc22",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:41:11.824Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1` → **200**

```json
{
  "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ff542837-2cb1-4253-8420-e5b319c48aef",
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
    "id": "a0b39d24-b6ae-4bc3-81df-f98cfd86eaec",
    "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "23ae7dc0-66bf-43df-bfdf-b41e7d70dc22",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:41:11.824Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1` → **200**

```json
{
  "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "ff542837-2cb1-4253-8420-e5b319c48aef",
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
    "id": "a0b39d24-b6ae-4bc3-81df-f98cfd86eaec",
    "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "23ae7dc0-66bf-43df-bfdf-b41e7d70dc22",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:41:11.824Z",
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
  "session_id": "056d7858-466a-440d-af4f-d755ef33d994",
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
  "last_heartbeat_at": "2026-10-29T14:41:16.272195Z",
  "last_location_at": "2026-10-29T14:41:16.272195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/056d7858-466a-440d-af4f-d755ef33d994/close` → **200**

```json
{
  "command_id": "9b3c071c-7fa6-4dc4-951f-926e4bf828fb",
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
  "session_id": "f86ba8fc-afc9-42ad-8637-992f741fbe0b",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3ODAsImlhdCI6MTc5MzI4NDg4MCwianRpIjoiZWE1MTlhOWUtZjMzMS00Y2Q4LWIzYjgtMTJiNTYwOWMzZGVkIiwic2lkIjoiZjg2YmE4ZmMtYWZjOS00MmFkLTg2MzctOTkyZjc0MWZiZTBiIn0.rFTJMNSxi7Nb_kyka2mRYzPH9KaEmDH0ZLvi9rskxV0",
  "access_expires_at": "2026-10-29T14:56:20.646864241Z",
  "refresh_token": "Sw5sKg9u8KGKh-T1mAacJHRJbomtQlXabFA6Mbo01Go",
  "refresh_expires_at": "2026-10-30T02:41:20.646317717Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8488e42e-f267-4832-a9ef-06b9267966bb"
}
```

`GET /api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T14:41:21.204976894Z",
  "order": {
    "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
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
    "created_at": "2026-10-29T14:41:11.824Z",
    "assigned_at": "2026-10-29T14:41:14.034351Z",
    "arrived_at": "2026-10-29T14:41:15.654652Z",
    "started_at": "2026-10-29T14:41:15.955541Z",
    "completed_at": "2026-10-29T14:41:16.588844Z"
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
    "id": "ff542837-2cb1-4253-8420-e5b319c48aef",
    "registered_at": "2026-10-29T14:41:09.435092Z",
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
      "created_at": "2026-10-29T14:41:11.826493Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T14:41:17.402318Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/chargebacks` → **422**

```json
{
  "command_id": "755ce204-9598-4200-a024-b6cfbfdfa227",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "f2bb530e-52a7-42df-86a1-b4f923d504ca"
}
```

`POST /api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/chargebacks` → **201**

```json
{
  "command_id": "6a50a1f6-0106-4f92-939c-f019a9c6010c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "a5b2e061-762a-4b94-a86d-52d4be4efbfb",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:41:21.888246Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/chargebacks` → **201**

```json
{
  "command_id": "6a50a1f6-0106-4f92-939c-f019a9c6010c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "a5b2e061-762a-4b94-a86d-52d4be4efbfb",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:41:21.888246Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/ff542837-2cb1-4253-8420-e5b319c48aef` → **200**

```json
{
  "client": {
    "id": "ff542837-2cb1-4253-8420-e5b319c48aef",
    "phone": "+380738496133",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:09.435092Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:11.824Z",
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

`POST /api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/chargebacks/a5b2e061-762a-4b94-a86d-52d4be4efbfb/resolve` → **200**

```json
{
  "command_id": "f50f67c0-ec9c-42e8-9a4e-95b0fe07d8f2",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "a5b2e061-762a-4b94-a86d-52d4be4efbfb",
  "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T14:41:21.888246Z",
  "resolved_at": "2026-10-29T14:41:22.819396Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/ff542837-2cb1-4253-8420-e5b319c48aef` → **200**

```json
{
  "client": {
    "id": "ff542837-2cb1-4253-8420-e5b319c48aef",
    "phone": "+380738496133",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:09.435092Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:11.824Z",
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

`GET /api/admin/v1/clients/ff542837-2cb1-4253-8420-e5b319c48aef` → **200**

```json
{
  "client": {
    "id": "ff542837-2cb1-4253-8420-e5b319c48aef",
    "phone": "+380738496133",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:09.435092Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:41:11.824Z",
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

`POST /api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/chargebacks/a5b2e061-762a-4b94-a86d-52d4be4efbfb/resolve` → **409**

```json
{
  "command_id": "5a9c3e3c-72eb-443d-b746-afb41bafe5e3",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/chargebacks/a5b2e061-762a-4b94-a86d-52d4be4efbfb/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "42c3fabf-5235-40fc-80e6-708426729bd1"
}
```

`GET /api/admin/v1/orders/188941b4-e1d4-43f4-b660-84c975b0bae1/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "a5b2e061-762a-4b94-a86d-52d4be4efbfb",
      "order_id": "188941b4-e1d4-43f4-b660-84c975b0bae1",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T14:41:21.888246Z",
      "resolved_at": "2026-10-29T14:41:22.819396Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 188941b4-e1d4-43f4-b660-84c975b0bae1 without phone or card digits; chargeback a5b2e061-762a-4b94-a86d-52d4be4efbfb recorded and won.

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
  "session_id": "4f02c5c5-b38b-48a7-bee1-8b40c1e6620c",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3ODUsImlhdCI6MTc5MzI4NDg4NSwianRpIjoiNDZmYmQ2MTktY2Y0MC00YmU1LTgyNjYtOTBhODQ0OTgzYzFiIiwic2lkIjoiNGYwMmM1YzUtYjM4Yi00OGE3LWJlZTEtOGI0MGMxZTY2MjBjIn0.P_UAgCZFfahixoWLYMfU7ueS1A6mwHHq83v3btbkPvM",
  "access_expires_at": "2026-10-29T14:56:25.920994113Z",
  "refresh_token": "iXHs9qZqShiZjHSVpzwHJw_xfdOkdx-1sy7hbUhBOtA",
  "refresh_expires_at": "2026-10-30T02:41:25.920383178Z",
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
  "phone": "+48600665288",
  "device_ref": "sandbox-31921"
}
```

```json
{
  "challenge_id": "4affb79b-e272-4dad-92e1-f796c7554245",
  "expires_at": "2026-10-29T14:46:26.774032937Z",
  "resend_available_at": "2026-10-29T14:41:27.774032937Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600665288` → **200**

```json
{
  "phone": "+48600665288",
  "audience": "CLIENT",
  "code": "157841",
  "sent_at": "2026-10-29T14:41:26.776875892Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4affb79b-e272-4dad-92e1-f796c7554245",
  "code": "157841",
  "device_ref": "sandbox-31921"
}
```

```json
{
  "session_id": "5887ab3d-9dc4-4ff3-9991-8670684b04ea",
  "subject": {
    "type": "CLIENT",
    "id": "48726202-338f-4529-b44d-516a22e1b674"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODcyNjIwMi0zMzhmLTQ1MjktYjQ0ZC01MTZhMjJlMWI2NzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1Nzg3LCJpYXQiOjE3OTMyODQ4ODcsImp0aSI6Ijc2NWEzZWQyLTlmYWEtNGEzNC1iMDBiLTMwOTQzNTA5ZDMyZCIsInNpZCI6IjU4ODdhYjNkLTlkYzQtNGZmMy05OTkxLTg2NzA2ODRiMDRlYSJ9.Oqm9qRM5r7m2V4fANUBiWtUwTHjCUB5pyEJgvHZKNJY",
  "access_expires_at": "2026-10-29T14:56:27.091964006Z",
  "refresh_token": "EmPYvabcvgDMTPEc-e9u05GqMfLdhKe1ccKSHgUfwCQ",
  "refresh_expires_at": "2026-11-28T14:41:27.091422311Z",
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
  "command_id": "8082e9a6-b070-4862-9ef7-2e3ba6a692af",
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
  "correlation_id": "f479dc95-e7f3-4564-a7a9-f2f0b8da00e8",
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
  "command_id": "6be0addb-8b49-4bff-ab1d-38ea6cfb80e2",
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
  "paused_at": "2026-10-29T14:41:28.24353967Z",
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
  "command_id": "fcb4f8af-789c-425c-a4a9-c269176dcef5",
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
  "id": "5cb66c76-ca9f-4079-a2bb-d61b50323fd0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:28.829986Z",
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
  "command_id": "16f009f5-3cef-44de-8841-550bb4c907f1",
  "quote_id": "5cb66c76-ca9f-4079-a2bb-d61b50323fd0",
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
  "correlation_id": "3a2a30d8-2bc2-4782-85f5-31d341d9fb5c"
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
  "paused_at": "2026-10-29T14:41:28.24354Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "fb6a9355-70d2-4d37-9298-f84acc73001d",
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
  "command_id": "77864cd3-c8b0-403d-81d1-2a722907974a",
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
  "command_id": "07f7b5a0-0272-4604-948d-ce0f5f0f74df",
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
  "id": "e0025d0b-cfcb-45d2-aea8-bd0097d518e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:30.564351Z",
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
  "command_id": "b4a46ed9-7608-40c9-9b74-c5fa5a4a3997",
  "quote_id": "e0025d0b-cfcb-45d2-aea8-bd0097d518e8",
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
  "correlation_id": "879d5b97-9225-47f8-8e85-9c8b046aa392"
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
  "command_id": "7aa33fab-077d-4e74-9805-8d0b3f82b5cc",
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
      "from": "17:00",
      "to": "18:00"
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
      "from": "17:00",
      "to": "18:00"
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
  "command_id": "9da05bb8-96d2-434e-9e81-64e423902ee2",
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
  "id": "f9884764-73ea-4dc5-a712-4710db980fb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:31.736214Z",
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
  "command_id": "d92d3860-8821-4e82-8569-3f177920ba58",
  "quote_id": "f9884764-73ea-4dc5-a712-4710db980fb4",
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
  "correlation_id": "3c454b63-7a7a-4127-9f51-2be3058a2b64"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "4e9eef77-a967-4418-b07d-174ae1623e00",
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
  "correlation_id": "37624bc2-f447-48a4-97f3-3d6627f662a1"
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
      "from": "17:00",
      "to": "18:00"
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
  "command_id": "64121559-4cd8-4a66-96fb-32f99f06e99f",
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
  "phone": "+380677521544",
  "device_ref": "sandbox-12146"
}
```

```json
{
  "challenge_id": "96d40e76-4c06-4269-8519-4697e4a843df",
  "expires_at": "2026-10-29T14:46:33.249219117Z",
  "resend_available_at": "2026-10-29T14:41:34.249219117Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677521544` → **200**

```json
{
  "phone": "+380677521544",
  "audience": "CLIENT",
  "code": "980645",
  "sent_at": "2026-10-29T14:41:33.252073716Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "96d40e76-4c06-4269-8519-4697e4a843df",
  "code": "980645",
  "device_ref": "sandbox-12146"
}
```

```json
{
  "session_id": "b545732b-a897-4d41-a530-add9bbd14400",
  "subject": {
    "type": "CLIENT",
    "id": "966dec5d-7a8f-46f6-b018-e81cca79fadb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjZkZWM1ZC03YThmLTQ2ZjYtYjAxOC1lODFjY2E3OWZhZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1NzkzLCJpYXQiOjE3OTMyODQ4OTMsImp0aSI6IjFlZjUyZmQxLTMwZmMtNDA1OC1iY2I5LWVlYTBhOTg4NzI0YyIsInNpZCI6ImI1NDU3MzJiLWE4OTctNGQ0MS1hNTMwLWFkZDliYmQxNDQwMCJ9.GQ9J10ws0w08DxmUORt-iRpByJleuUoZlyX66iJK12Y",
  "access_expires_at": "2026-10-29T14:56:33.553987828Z",
  "refresh_token": "VXGVS-MBQBQc5Ac7axbeJ4yl52gIQq90hBGUpFkUnwU",
  "refresh_expires_at": "2026-11-28T14:41:33.553485357Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "966dec5d-7a8f-46f6-b018-e81cca79fadb",
  "session_id": "b545732b-a897-4d41-a530-add9bbd14400",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "762de89b-56aa-43fb-af4d-1ad73a8a0eaa",
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
  "id": "4875afc6-7b08-4f9e-babc-3a60319ecbc3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:34.107800Z",
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
  "challenge_id": "266603ad-6f14-4e90-ae46-0ea84fd113b3",
  "expires_at": "2026-10-29T14:46:36.40251237Z",
  "resend_available_at": "2026-10-29T14:41:37.40251237Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677521544` → **200**

```json
{
  "phone": "+380677521544",
  "audience": "CLIENT",
  "code": "212877",
  "sent_at": "2026-10-29T14:41:36.404897531Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "3d3919f2-699d-4c87-bcab-2383159ce532",
  "challenge_id": "266603ad-6f14-4e90-ae46-0ea84fd113b3",
  "otp_code": "212877"
}
```

```json
{
  "client_id": "966dec5d-7a8f-46f6-b018-e81cca79fadb",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T14:41:36.712910542Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "b47a2dd8-c185-431b-92c4-0e9286463ee7",
  "quote_id": "4875afc6-7b08-4f9e-babc-3a60319ecbc3",
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
  "correlation_id": "bea1c42b-550b-4023-a46f-7cf8458fe236"
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
  "session_id": "f036dc16-d8d4-4d36-9993-e5ffe5c5a49f",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3OTcsImlhdCI6MTc5MzI4NDg5NywianRpIjoiOGQ2OGQ5OGUtMTQ3ZS00NjJmLWFjYjUtM2NjNjQxZjBjY2VlIiwic2lkIjoiZjAzNmRjMTYtZDhkNC00ZDM2LTk5OTMtZTVmZmU1YzVhNDlmIn0.n5QLD1cWcK8hgiSOH3kaYWzmYiXs3GCDBoglcmOreps",
  "access_expires_at": "2026-10-29T14:56:37.590016375Z",
  "refresh_token": "vrULmLHBiYQg0eBxC6F7bCy4ngJCzW01Cv_lT9gn2Qk",
  "refresh_expires_at": "2026-10-30T02:41:37.58946403Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "966dec5d-7a8f-46f6-b018-e81cca79fadb",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T14:41:36.712911Z",
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

`POST /api/admin/v1/client-deletions/966dec5d-7a8f-46f6-b018-e81cca79fadb/complete` → **200**

```json
{
  "command_id": "bc03091a-04fe-4bad-a6c3-953f6ab08706",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "966dec5d-7a8f-46f6-b018-e81cca79fadb",
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
  "correlation_id": "01f395f8-bd36-410a-aec8-bb00f71a23b7"
}
```

Done: client 966dec5d-7a8f-46f6-b018-e81cca79fadb anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669076349",
  "device_ref": "sandbox-31678"
}
```

```json
{
  "challenge_id": "e5ae54a5-da20-4ae8-a225-b73c4efc8608",
  "expires_at": "2026-10-29T14:46:38.740271974Z",
  "resend_available_at": "2026-10-29T14:41:39.740271974Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669076349` → **200**

```json
{
  "phone": "+380669076349",
  "audience": "CLIENT",
  "code": "556211",
  "sent_at": "2026-10-29T14:41:38.743475838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5ae54a5-da20-4ae8-a225-b73c4efc8608",
  "code": "556211",
  "device_ref": "sandbox-31678"
}
```

```json
{
  "session_id": "e3f55370-3d4b-4164-8e0a-d7a9f0bc3c09",
  "subject": {
    "type": "CLIENT",
    "id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTExZTRlMC05MzJkLTRmY2MtYmRjMi05ZDc4YmY0ODIzYmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1Nzk5LCJpYXQiOjE3OTMyODQ4OTksImp0aSI6IjEzNWJmMDRiLWQ0MGEtNDgyZi04ZDQ3LTljNTE5NmUyZWE4MiIsInNpZCI6ImUzZjU1MzcwLTNkNGItNDE2NC04ZTBhLWQ3YTlmMGJjM2MwOSJ9.D7e3BRKhlx6IXVacbQcbqtgWIG-ARO-DerMIf1HvXrM",
  "access_expires_at": "2026-10-29T14:56:39.051895203Z",
  "refresh_token": "uXmW4c68mK-z_B7PQi15G-NAOYd5z7SLkhqgI5z2Y84",
  "refresh_expires_at": "2026-11-28T14:41:39.051383796Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba",
  "session_id": "e3f55370-3d4b-4164-8e0a-d7a9f0bc3c09",
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
  "session_id": "4ba94700-2539-429a-8dd2-0fae0aa4af73",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU3OTksImlhdCI6MTc5MzI4NDg5OSwianRpIjoiODI5NTAzZDQtYmFhMi00MGU1LTg1OGQtMDM0ZTQxMmRkOGZkIiwic2lkIjoiNGJhOTQ3MDAtMjUzOS00MjlhLThkZDItMGZhZTBhYTRhZjczIn0.Sq0IGFbqCE15YDKZtOr8LzspiWgecbvoZGoK_jEXcTc",
  "access_expires_at": "2026-10-29T14:56:39.896148448Z",
  "refresh_token": "egZnPeMIJp1VIV_mt5wLVpiMEMVBdAfyR6BMsjzVh1o",
  "refresh_expires_at": "2026-10-30T02:41:39.895507308Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9076349&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba",
      "phone": "+380669076349",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T14:41:39.049704Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba` → **200**

```json
{
  "client": {
    "id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba",
    "phone": "+380669076349",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:41:39.049704Z",
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

`POST /api/admin/v1/clients/5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba/block` → **400**

```json
{
  "command_id": "7efe3261-08eb-4b22-a938-d69b774c52c7",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1692d16c-358f-48cb-b190-071798080f85",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba/block` → **200**

```json
{
  "command_id": "26a4d6c5-d212-4154-a1e1-0bbdaf4c8cd8",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba",
  "phone": "+380669076349",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T14:41:39.049704Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T14:41:41.107987Z",
    "by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
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
  "correlation_id": "3071a1e7-b0c2-4c82-9ee8-b63b9f7df998"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669076349",
  "device_ref": "sandbox-28339"
}
```

```json
{
  "challenge_id": "aa55310a-151a-45c7-b145-da7f229e37d1",
  "expires_at": "2026-10-29T14:46:43.725369684Z",
  "resend_available_at": "2026-10-29T14:41:44.725369684Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669076349` → **200**

```json
{
  "phone": "+380669076349",
  "audience": "CLIENT",
  "code": "989686",
  "sent_at": "2026-10-29T14:41:43.727990935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "aa55310a-151a-45c7-b145-da7f229e37d1",
  "code": "989686",
  "device_ref": "sandbox-28339"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "9a1f4e2e-f5ba-48d0-9ed3-085059e02c69"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba` → **200**

```json
{
  "client": {
    "id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba",
    "phone": "+380669076349",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T14:41:39.049704Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T14:41:41.107987Z",
      "by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
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

`POST /api/admin/v1/clients/5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba/unblock` → **200**

```json
{
  "command_id": "b0d7d5d3-833a-4f9a-9b00-fee0a5490015",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba",
  "phone": "+380669076349",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T14:41:39.049704Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669076349",
  "device_ref": "sandbox-20080"
}
```

```json
{
  "challenge_id": "2fcf7046-7570-4cbf-b9c8-cf8b68810456",
  "expires_at": "2026-10-29T14:46:46.936594031Z",
  "resend_available_at": "2026-10-29T14:41:47.936594031Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669076349` → **200**

```json
{
  "phone": "+380669076349",
  "audience": "CLIENT",
  "code": "967960",
  "sent_at": "2026-10-29T14:41:46.939525503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2fcf7046-7570-4cbf-b9c8-cf8b68810456",
  "code": "967960",
  "device_ref": "sandbox-20080"
}
```

```json
{
  "session_id": "76553ceb-30f0-458c-9f04-4a728a6aa97a",
  "subject": {
    "type": "CLIENT",
    "id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTExZTRlMC05MzJkLTRmY2MtYmRjMi05ZDc4YmY0ODIzYmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODA3LCJpYXQiOjE3OTMyODQ5MDcsImp0aSI6Ijk5YWQxOTljLWI0YjgtNGIyZC1iMzExLWM3YjY3NzQxYTVkYSIsInNpZCI6Ijc2NTUzY2ViLTMwZjAtNDU4Yy05ZjA0LTRhNzI4YTZhYTk3YSJ9.aqdg-0BAFA1tmXaBu6VJyWZ6EmJxCBble797YOY9dKg",
  "access_expires_at": "2026-10-29T14:56:47.258268288Z",
  "refresh_token": "jZwz6mEH0_EDxKYIvRfmsIgVjhWwE6BzLoRkjo7vGVo",
  "refresh_expires_at": "2026-11-28T14:41:47.257736071Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5a11e4e0-932d-4fcc-bdc2-9d78bf4823ba",
  "session_id": "76553ceb-30f0-458c-9f04-4a728a6aa97a",
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
  "phone": "+380661086923",
  "device_ref": "sandbox-21789"
}
```

```json
{
  "challenge_id": "7e23256e-7573-4504-8657-24cc5bcaf77d",
  "expires_at": "2026-10-29T14:46:47.828757943Z",
  "resend_available_at": "2026-10-29T14:41:48.828757943Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661086923` → **200**

```json
{
  "phone": "+380661086923",
  "audience": "CLIENT",
  "code": "824870",
  "sent_at": "2026-10-29T14:41:47.831408007Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e23256e-7573-4504-8657-24cc5bcaf77d",
  "code": "824870",
  "device_ref": "sandbox-21789"
}
```

```json
{
  "session_id": "6dbb79f3-5bd2-4da4-b47e-2b0a31451cf4",
  "subject": {
    "type": "CLIENT",
    "id": "3dbed6e2-8861-42c5-aa60-4a3713af5869"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZGJlZDZlMi04ODYxLTQyYzUtYWE2MC00YTM3MTNhZjU4NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODA4LCJpYXQiOjE3OTMyODQ5MDgsImp0aSI6ImEzNDE0ZGZhLTcyMzAtNDIwZC1hZTE1LWNjMDg1MjI3ODlhZCIsInNpZCI6IjZkYmI3OWYzLTViZDItNGRhNC1iNDdlLTJiMGEzMTQ1MWNmNCJ9.i1blThKI6UCCxnf8owzy2IaEDSYsSQVK8QVkvwqD9FY",
  "access_expires_at": "2026-10-29T14:56:48.135745699Z",
  "refresh_token": "iiLU08ZzO5706eTzvw24zuuhz5AGrlMGVENzRMSP33A",
  "refresh_expires_at": "2026-11-28T14:41:48.135166787Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0c35ca4e-89a8-4681-baea-6a3dfe960073",
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
  "id": "480ef774-f8fc-4d2c-96a8-2f24c1d7cf09",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:46:48.426757Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 34328d85-cae9-4081-b597-228430657f5d) → **201**

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
  "session_id": "89310a3e-351a-4fd4-b8d9-0aa5dc995f2c",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MDksImlhdCI6MTc5MzI4NDkwOSwianRpIjoiN2VhODczMTctOWVjYS00YmU2LThjZmYtNTYyZTM5OGIyNWUzIiwic2lkIjoiODkzMTBhM2UtMzUxYS00ZmQ0LWI4ZDktMGFhNWRjOTk1ZjJjIn0.O20vzWqvCXVxce93XacfhXIRms8LM_g2k-OHBCILe9g",
  "access_expires_at": "2026-10-29T14:56:49.048540619Z",
  "refresh_token": "p08Gykwox5OMj84AYf_OfucgA0vMBGNw4RaV6NHRrK0",
  "refresh_expires_at": "2026-10-30T02:41:49.047953178Z",
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
  "session_id": "0a0f44b8-8b3a-45a0-b10e-2c174107af79",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MDksImlhdCI6MTc5MzI4NDkwOSwianRpIjoiOGM2YmM5NTMtMGE3ZS00MTBjLThkNDUtMTBjMWJkYzJmYjNjIiwic2lkIjoiMGEwZjQ0YjgtOGIzYS00NWEwLWIxMGUtMmMxNzQxMDdhZjc5In0.Jb_OeKrZRtaF8B6ZJR8bM1kcFcgSWYno2WcyUV3SxWU",
  "access_expires_at": "2026-10-29T14:56:49.629387526Z",
  "refresh_token": "EWglDgF3yZR-bZ70ThA9nciC8wR-UcHW3Cn8AdUXzBs",
  "refresh_expires_at": "2026-10-30T02:41:49.628857403Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0a9e3ce8-a874-4dae-b599-ecd7312db068/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:41:48.716137Z",
      "actor": {
        "type": "CLIENT",
        "id": "3dbed6e2-8861-42c5-aa60-4a3713af5869",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0a9e3ce8-a874-4dae-b599-ecd7312db068",
        "quote_id": "480ef774-f8fc-4d2c-96a8-2f24c1d7cf09",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "34328d85-cae9-4081-b597-228430657f5d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:41:48.718576Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0a9e3ce8-a874-4dae-b599-ecd7312db068",
        "attempt_id": "12afa86f-4f68-4b65-9648-62bc52de738a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "34328d85-cae9-4081-b597-228430657f5d"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T14:41:48.72861Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0a9e3ce8-a874-4dae-b599-ecd7312db068",
        "attempt_id": "12afa86f-4f68-4b65-9648-62bc52de738a"
      },
      "correlation_id": "34328d85-cae9-4081-b597-228430657f5d"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "12afa86f-4f68-4b65-9648-62bc52de738a",
        "generation": 1,
        "started_at": "2026-10-29T14:41:48.717531Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T14:41:48.72861Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T14:41:48.719369Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/34328d85-cae9-4081-b597-228430657f5d` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "0a9e3ce8-a874-4dae-b599-ecd7312db068:0",
      "order_id": "0a9e3ce8-a874-4dae-b599-ecd7312db068",
      "at": "2026-10-29T14:41:48.716137Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "0a9e3ce8-a874-4dae-b599-ecd7312db068:1",
      "order_id": "0a9e3ce8-a874-4dae-b599-ecd7312db068",
      "at": "2026-10-29T14:41:48.718576Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "0a9e3ce8-a874-4dae-b599-ecd7312db068:2",
      "order_id": "0a9e3ce8-a874-4dae-b599-ecd7312db068",
      "at": "2026-10-29T14:41:48.72861Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/c867304c-e03b-4c52-841a-5bb9a1d7236f` → **200**

```json
{
  "found": []
}
```

Done: request 34328d85-cae9-4081-b597-228430657f5d — order 0a9e3ce8-a874-4dae-b599-ecd7312db068 found by its id.

`GET /api/rider/v1/orders/0a9e3ce8-a874-4dae-b599-ecd7312db068` → **200**

```json
{
  "id": "0a9e3ce8-a874-4dae-b599-ecd7312db068",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3dbed6e2-8861-42c5-aa60-4a3713af5869",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:41:48.715581Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0a9e3ce8-a874-4dae-b599-ecd7312db068/cancel` → **200**

```json
{
  "command_id": "a716d048-62ce-494b-888d-1b3afb95d882",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0a9e3ce8-a874-4dae-b599-ecd7312db068",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3dbed6e2-8861-42c5-aa60-4a3713af5869",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:41:48.715581Z",
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
  "phone": "+380632638127",
  "device_ref": "sandbox-23069"
}
```

```json
{
  "challenge_id": "14c40470-63cd-4ea0-8bf8-ed21ab55d4bf",
  "expires_at": "2026-10-29T14:46:51.410534596Z",
  "resend_available_at": "2026-10-29T14:41:52.410534596Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632638127` → **200**

```json
{
  "phone": "+380632638127",
  "audience": "CLIENT",
  "code": "386417",
  "sent_at": "2026-10-29T14:41:51.413174699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14c40470-63cd-4ea0-8bf8-ed21ab55d4bf",
  "code": "386417",
  "device_ref": "sandbox-23069"
}
```

```json
{
  "session_id": "d7ef7157-e451-4cfd-a431-167c1ec3de1f",
  "subject": {
    "type": "CLIENT",
    "id": "100019cc-4c3d-4b20-b56f-bb8659dd68be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDAwMTljYy00YzNkLTRiMjAtYjU2Zi1iYjg2NTlkZDY4YmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODExLCJpYXQiOjE3OTMyODQ5MTEsImp0aSI6ImMxNDkyYWUxLThhMDMtNDgwNi05ZTk3LTQ5NWJmM2FkMzY0NCIsInNpZCI6ImQ3ZWY3MTU3LWU0NTEtNGNmZC1hNDMxLTE2N2MxZWMzZGUxZiJ9.kvp7Z-UUEjZSUcJXAONPpjJBCDHWk0bkH0J6JmzM16E",
  "access_expires_at": "2026-10-29T14:56:51.728019273Z",
  "refresh_token": "qUwuP6Z4iC3Mh9QFJwKAWULOQ4NmH0SNXf-e8tjY3u8",
  "refresh_expires_at": "2026-11-28T14:41:51.727405591Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "17dfbfbf-13c3-4cd2-b352-3691cedcc342",
  "expires_at": "2026-10-29T14:46:54.005535457Z",
  "resend_available_at": "2026-10-29T14:41:55.005535457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632638127` → **200**

```json
{
  "phone": "+380632638127",
  "audience": "CLIENT",
  "code": "686276",
  "sent_at": "2026-10-29T14:41:54.007939177Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "76f05447-4a0b-496c-abeb-fc95f3a938b0",
  "challenge_id": "17dfbfbf-13c3-4cd2-b352-3691cedcc342",
  "otp_code": "686276"
}
```

```json
{
  "id": "054d565e-4292-49db-baa5-712d229d5f00",
  "state": "PENDING",
  "created_at": "2026-10-29T14:41:54.320175Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/054d565e-4292-49db-baa5-712d229d5f00` → **200**

```json
{
  "id": "054d565e-4292-49db-baa5-712d229d5f00",
  "state": "PENDING",
  "created_at": "2026-10-29T14:41:54.320175Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/054d565e-4292-49db-baa5-712d229d5f00` → **200**

```json
{
  "id": "054d565e-4292-49db-baa5-712d229d5f00",
  "state": "PENDING",
  "created_at": "2026-10-29T14:41:54.320175Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/054d565e-4292-49db-baa5-712d229d5f00` → **200**

```json
{
  "id": "054d565e-4292-49db-baa5-712d229d5f00",
  "state": "READY",
  "created_at": "2026-10-29T14:41:54.320175Z",
  "ready_at": "2026-10-29T14:41:56.357532Z",
  "expires_at": "2026-11-05T14:41:56.357532Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/054d565e-4292-49db-baa5-712d229d5f00/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636050901",
  "device_ref": "sandbox-385"
}
```

```json
{
  "challenge_id": "6918d07b-d255-4d7b-a76b-dba1812a939d",
  "expires_at": "2026-10-29T14:46:57.453246064Z",
  "resend_available_at": "2026-10-29T14:41:58.453246064Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636050901` → **200**

```json
{
  "phone": "+380636050901",
  "audience": "CLIENT",
  "code": "986089",
  "sent_at": "2026-10-29T14:41:57.455762789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6918d07b-d255-4d7b-a76b-dba1812a939d",
  "code": "986089",
  "device_ref": "sandbox-385"
}
```

```json
{
  "session_id": "069ba7c2-b2b7-4ca5-bc26-1946828224ed",
  "subject": {
    "type": "CLIENT",
    "id": "7f808ed9-32cb-4762-ad6a-ae87bf8cdb4c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZjgwOGVkOS0zMmNiLTQ3NjItYWQ2YS1hZTg3YmY4Y2RiNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODE3LCJpYXQiOjE3OTMyODQ5MTcsImp0aSI6IjNlMzM5ZGMxLWVlODMtNGI0Zi1iMjM5LTBmNDUwODljOGNhNSIsInNpZCI6IjA2OWJhN2MyLWIyYjctNGNhNS1iYzI2LTE5NDY4MjgyMjRlZCJ9.zcPou90BmU0bKskfLfX6NmezeCZ9U74lKQZtq_JdWk0",
  "access_expires_at": "2026-10-29T14:56:57.75946091Z",
  "refresh_token": "chPplxs9ulpDBVSwwtWEUOXeEPQcpKPXnM3YvzZRi50",
  "refresh_expires_at": "2026-11-28T14:41:57.758918244Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/054d565e-4292-49db-baa5-712d229d5f00/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/054d565e-4292-49db-baa5-712d229d5f00/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e38aa092-49c2-4964-83cd-2479c06cea96"
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
  "session_id": "f58a9676-258e-4212-9b31-6c5142dc9a03",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MTgsImlhdCI6MTc5MzI4NDkxOCwianRpIjoiMTJkY2QwMDgtYjdlOC00YjYxLTkyNjItZDMxYWJjOTgzZjczIiwic2lkIjoiZjU4YTk2NzYtMjU4ZS00MjEyLTliMzEtNmM1MTQyZGM5YTAzIn0.bSkjbpxu33GIuJ3IxLKTqxsCQc-TcUfNLFyiOcyr5_g",
  "access_expires_at": "2026-10-29T14:56:58.611441437Z",
  "refresh_token": "XJpIYnW-Nq0I5ri8D5KiQOpSTFyS2ZrlFKiSIWgp6o0",
  "refresh_expires_at": "2026-10-30T02:41:58.610896687Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "100019cc-4c3d-4b20-b56f-bb8659dd68be",
  "session_id": "d7ef7157-e451-4cfd-a431-167c1ec3de1f",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/100019cc-4c3d-4b20-b56f-bb8659dd68be/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "054d565e-4292-49db-baa5-712d229d5f00",
      "state": "READY",
      "created_at": "2026-10-29T14:41:54.320175Z",
      "ready_at": "2026-10-29T14:41:56.357532Z",
      "expires_at": "2026-11-05T14:41:56.357532Z",
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
  "device_ref": "sandbox-4325"
}
```

```json
{
  "challenge_id": "57e1479d-4562-4090-adc6-450fc11ffcd5",
  "expires_at": "2026-10-29T14:46:59.458771308Z",
  "resend_available_at": "2026-10-29T14:42:00.458771308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "046450",
  "sent_at": "2026-10-29T14:41:59.461514798Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57e1479d-4562-4090-adc6-450fc11ffcd5",
  "code": "046450",
  "device_ref": "sandbox-4325"
}
```

```json
{
  "session_id": "64b18e91-7e65-4a59-98b9-1cfe71e9ee79",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgxOSwiaWF0IjoxNzkzMjg0OTE5LCJqdGkiOiI1NWYyYzM3Yy1mMTAyLTRmODEtODMwYi00ODZkMTU2ZTVjZTciLCJzaWQiOiI2NGIxOGU5MS03ZTY1LTRhNTktOThiOS0xY2ZlNzFlOWVlNzkifQ.B2aO1o2xrg2TiLMzoQ_feHY9aRl6XwtP65Vc_y5REXc",
  "access_expires_at": "2026-10-29T14:56:59.770899219Z",
  "refresh_token": "MBt82OZWISFam5LABc25_TVUoZ-eJlqeofSrEV269Yk",
  "refresh_expires_at": "2026-11-28T14:41:59.770361424Z",
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
  "device_ref": "sandbox-17278"
}
```

```json
{
  "challenge_id": "28a87b1d-692f-4db6-a63d-481ef49f7957",
  "expires_at": "2026-10-29T14:47:00.327167033Z",
  "resend_available_at": "2026-10-29T14:42:01.327167033Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "828843",
  "sent_at": "2026-10-29T14:42:00.329729429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28a87b1d-692f-4db6-a63d-481ef49f7957",
  "code": "828843",
  "device_ref": "sandbox-17278"
}
```

```json
{
  "session_id": "693d6c00-c6e2-456b-a1d2-2f4b72d46671",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgyMCwiaWF0IjoxNzkzMjg0OTIwLCJqdGkiOiI2MTk0MzkwZi1jYTEwLTRiZDctOTkxYS0xY2I5ZWIzZDhmMDYiLCJzaWQiOiI2OTNkNmMwMC1jNmUyLTQ1NmItYTFkMi0yZjRiNzJkNDY2NzEifQ.9Z962xnXJGibtZYJRhCuzLNDRdH61b7CVLY0to91lrE",
  "access_expires_at": "2026-10-29T14:57:00.627181379Z",
  "refresh_token": "2fZ9joEB1UT4FwoIrAo8U6_wadEIXVek3hDbYM_LHLY",
  "refresh_expires_at": "2026-11-28T14:42:00.626645918Z",
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
  "command_id": "432a2fea-ee82-46bd-8aec-8f18666402f7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:01Z",
    "sequence": 1793284921188
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9fcc85d8-e2bc-4a49-ba7f-8ebace62123e",
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
  "last_heartbeat_at": "2026-10-29T14:42:01.207781Z",
  "last_location_at": "2026-10-29T14:42:01.207781Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-18556"
}
```

```json
{
  "challenge_id": "66f146f0-cfef-4548-b150-0be534447797",
  "expires_at": "2026-10-29T14:47:01.496515269Z",
  "resend_available_at": "2026-10-29T14:42:02.496515269Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "329060",
  "sent_at": "2026-10-29T14:42:01.49898673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66f146f0-cfef-4548-b150-0be534447797",
  "code": "329060",
  "device_ref": "sandbox-18556"
}
```

```json
{
  "session_id": "bf715213-e1ef-42c3-9825-63a5ef0e16f6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgyMSwiaWF0IjoxNzkzMjg0OTIxLCJqdGkiOiI4Y2Y0NzVlNS1kOTAxLTQ5ZTMtOThkNi1kZmVlYzhhN2E0NmYiLCJzaWQiOiJiZjcxNTIxMy1lMWVmLTQyYzMtOTgyNS02M2E1ZWYwZTE2ZjYifQ.ONY9nNT2CeTxhJ5Jvy599Q9PFMizm6cMJXlVprl0FKQ",
  "access_expires_at": "2026-10-29T14:57:01.807186625Z",
  "refresh_token": "LlreI2UScxcSiuj04EqI-wUS_flsWRASWakaBp_lbBA",
  "refresh_expires_at": "2026-11-28T14:42:01.806684765Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b807ad6-2d3c-4ee4-86ea-9466b9ee9227",
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
  "last_heartbeat_at": "2026-10-29T14:40:31.565484Z",
  "last_location_at": "2026-10-29T14:40:31.565484Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5b807ad6-2d3c-4ee4-86ea-9466b9ee9227/handover` → **200**

```json
{
  "command_id": "13c5a07b-f644-4986-89e2-9412d5ab98f3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b807ad6-2d3c-4ee4-86ea-9466b9ee9227",
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
  "last_heartbeat_at": "2026-10-29T14:40:31.565484Z",
  "last_location_at": "2026-10-29T14:40:31.565484Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5b807ad6-2d3c-4ee4-86ea-9466b9ee9227/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:02Z",
    "sequence": 1793284922663
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b807ad6-2d3c-4ee4-86ea-9466b9ee9227",
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
  "last_heartbeat_at": "2026-10-29T14:42:02.683099Z",
  "last_location_at": "2026-10-29T14:42:02.683099Z",
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
  "session_id": "f6029aac-8b2d-4c69-8d3e-a9bf2da199d5",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MjMsImlhdCI6MTc5MzI4NDkyMywianRpIjoiODNiZjBiMWItODJjMy00MDMwLTg0NzYtMTM4NWYyNWFkMzFkIiwic2lkIjoiZjYwMjlhYWMtOGIyZC00YzY5LThkM2UtYTliZjJkYTE5OWQ1In0.palNE69RM3WiUeLerxSlQ1LrIQf6odMYHajmaveDcvg",
  "access_expires_at": "2026-10-29T14:57:03.261950073Z",
  "refresh_token": "a7t6D6gJwp2vkSfWAxlCe-smCrFA2xjSeS7zsMJ87KA",
  "refresh_expires_at": "2026-10-30T02:42:03.261438386Z",
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
  "session_id": "7054902a-223b-4728-8ef2-b1c448f154d0",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MjMsImlhdCI6MTc5MzI4NDkyMywianRpIjoiNDYwYWM1YTktNTc5ZS00NTY4LTk4OGYtNGMxYmEwMzRmNzcyIiwic2lkIjoiNzA1NDkwMmEtMjIzYi00NzI4LThlZjItYjFjNDQ4ZjE1NGQwIn0.uylsTVdYPlIvZEcXQn__JT6ArhFOoLwb0rrvSacxANg",
  "access_expires_at": "2026-10-29T14:57:03.8338178Z",
  "refresh_token": "JRkTz_AoxS3dSRhPqpuYM-Jv3ppCyDL_l6shUBl5AHI",
  "refresh_expires_at": "2026-10-30T02:42:03.833214301Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683384789",
  "device_ref": "sandbox-590"
}
```

```json
{
  "challenge_id": "72c59ad0-deb5-43d8-b676-e910936fe90d",
  "expires_at": "2026-10-29T14:47:04.107036099Z",
  "resend_available_at": "2026-10-29T14:42:05.107036099Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683384789` → **200**

```json
{
  "phone": "+380683384789",
  "audience": "CLIENT",
  "code": "267303",
  "sent_at": "2026-10-29T14:42:04.110023456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72c59ad0-deb5-43d8-b676-e910936fe90d",
  "code": "267303",
  "device_ref": "sandbox-590"
}
```

```json
{
  "session_id": "9829103a-01c3-40e6-850e-30bc8dd82e83",
  "subject": {
    "type": "CLIENT",
    "id": "fea7761a-5538-4c0d-8efa-bfb8e1d622cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWE3NzYxYS01NTM4LTRjMGQtOGVmYS1iZmI4ZTFkNjIyY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODI0LCJpYXQiOjE3OTMyODQ5MjQsImp0aSI6ImJmNjZmNTkwLTI5ZjgtNDJiNy05Y2IwLTA5NmU1NjRmMjhlNCIsInNpZCI6Ijk4MjkxMDNhLTAxYzMtNDBlNi04NTBlLTMwYmM4ZGQ4MmU4MyJ9.VQfTZarF_L4hTmgFvAiu7KzU1oLZg4wNp0Tqbtc6kwA",
  "access_expires_at": "2026-10-29T14:57:04.421216591Z",
  "refresh_token": "hapLFVMhzNWTjGmInWp2fDvFIELgU8Rfr2SBoIpf4SY",
  "refresh_expires_at": "2026-11-28T14:42:04.420664346Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "339f56ed-3bc3-4754-b97b-95cffbb36b16",
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
  "id": "6d38abfc-4f9a-4222-9323-38d7f6e010dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:04.712853Z",
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
  "command_id": "448a8669-9684-4fc6-b5ff-12a8156baa04",
  "quote_id": "6d38abfc-4f9a-4222-9323-38d7f6e010dc",
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
  "id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fea7761a-5538-4c0d-8efa-bfb8e1d622cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:05.012934Z",
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
    "id": "b14db906-63c1-4946-9f55-edbd33e69639",
    "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
    "expires_at": "2026-10-29T14:42:20.016491Z",
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

`POST /api/driver/v1/offers/b14db906-63c1-4946-9f55-edbd33e69639/reject` → **204**

```json
{
  "command_id": "5e18ae1f-9c53-4e67-b0f4-baf5bd7bc766"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2578090e-ba99-48de-848a-9c418913b1ac",
    "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
    "expires_at": "2026-10-29T14:42:20.60503Z",
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

`POST /api/driver/v1/offers/2578090e-ba99-48de-848a-9c418913b1ac/accept` → **200**

```json
{
  "command_id": "177e732f-92d0-40b0-a9f9-c198b0d225ae"
}
```

```json
{
  "id": "7f4a8639-3b89-4899-81ef-3a1fa2390498",
  "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9d7003b-1a6f-41b0-85d2-9ee4d4ae34d2",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/202af652-2ce6-4ab0-9d34-6a2b3ca20b91/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:05.013497Z",
      "actor": {
        "type": "CLIENT",
        "id": "fea7761a-5538-4c0d-8efa-bfb8e1d622cd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
        "quote_id": "6d38abfc-4f9a-4222-9323-38d7f6e010dc",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "704d59ee-d6cc-488e-baea-298566fe708d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:05.01564Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
        "attempt_id": "7644d31b-0032-4765-b771-934135efd459",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "704d59ee-d6cc-488e-baea-298566fe708d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:42:05.019459Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b14db906-63c1-4946-9f55-edbd33e69639",
        "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "704d59ee-d6cc-488e-baea-298566fe708d"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T14:42:05.603969Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b14db906-63c1-4946-9f55-edbd33e69639",
        "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91"
      },
      "correlation_id": "5911e67d-daaf-4336-8d55-4c362f8d0dbe"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 202af652-2ce6-4ab0-9d34-6a2b3ca20b91 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/202af652-2ce6-4ab0-9d34-6a2b3ca20b91` → **200**

```json
{
  "id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "fea7761a-5538-4c0d-8efa-bfb8e1d622cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7f4a8639-3b89-4899-81ef-3a1fa2390498",
    "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a9d7003b-1a6f-41b0-85d2-9ee4d4ae34d2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:42:05.012934Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/202af652-2ce6-4ab0-9d34-6a2b3ca20b91/cancel` → **200**

```json
{
  "command_id": "2144f62b-9053-4eee-a0d5-a93348699622",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fea7761a-5538-4c0d-8efa-bfb8e1d622cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7f4a8639-3b89-4899-81ef-3a1fa2390498",
    "order_id": "202af652-2ce6-4ab0-9d34-6a2b3ca20b91",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a9d7003b-1a6f-41b0-85d2-9ee4d4ae34d2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:42:05.012934Z",
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
  "session_id": "9fcc85d8-e2bc-4a49-ba7f-8ebace62123e",
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
  "last_heartbeat_at": "2026-10-29T14:42:01.207781Z",
  "last_location_at": "2026-10-29T14:42:01.207781Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9fcc85d8-e2bc-4a49-ba7f-8ebace62123e/close` → **200**

```json
{
  "command_id": "4dc87f84-b421-4e7d-ad5a-9610569d641b",
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
  "session_id": "5b807ad6-2d3c-4ee4-86ea-9466b9ee9227",
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
  "last_heartbeat_at": "2026-10-29T14:42:02.683099Z",
  "last_location_at": "2026-10-29T14:42:02.683099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b807ad6-2d3c-4ee4-86ea-9466b9ee9227/close` → **200**

```json
{
  "command_id": "bba0a92a-e434-421b-81f3-1d8dbcaf3f96",
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
  "session_id": "36622bcf-24bf-45b4-99f0-eb5fb0fcac26",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4MjgsImlhdCI6MTc5MzI4NDkyOCwianRpIjoiMTRjZjE3ZDctODUwYy00OGFkLWE0ZDEtMjBlNDYzZTA5YjQ3Iiwic2lkIjoiMzY2MjJiY2YtMjRiZi00NWI0LTk5ZjAtZWI1ZmIwZmNhYzI2In0.9IreoD9b7HBkI1saeCN0_OTRpr_pXjenYnooxriUIS4",
  "access_expires_at": "2026-10-29T14:57:08.634071008Z",
  "refresh_token": "9jABSOIj8WSMbRIK_dWn1ynl-YWp576Pza9oOOryWTQ",
  "refresh_expires_at": "2026-10-30T02:42:08.63344209Z",
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
  "command_id": "19cf4e5d-1834-4e8e-93c5-e40702e48712",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T14:42:09.230457Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "1f763c3d-bb31-4675-9dde-810e3857e8bc",
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
  "correlation_id": "7fc57814-8000-4f8a-981a-217b3de17fd1"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "4fa750a8-1979-4970-b7a8-870c2d57e4da",
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
  "correlation_id": "cc9fbb55-e82d-45c4-8bb6-b9913fb0c3ed"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638170105",
  "device_ref": "sandbox-11670"
}
```

```json
{
  "challenge_id": "18583a93-e76c-41a0-8195-e07b5a4e82c4",
  "expires_at": "2026-10-29T14:47:10.135752281Z",
  "resend_available_at": "2026-10-29T14:42:11.135752281Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638170105` → **200**

```json
{
  "phone": "+380638170105",
  "audience": "CLIENT",
  "code": "100555",
  "sent_at": "2026-10-29T14:42:10.138359603Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18583a93-e76c-41a0-8195-e07b5a4e82c4",
  "code": "100555",
  "device_ref": "sandbox-11670"
}
```

```json
{
  "session_id": "3cc406b9-c916-4ed2-88b6-91e288916154",
  "subject": {
    "type": "CLIENT",
    "id": "6174fa9e-50cc-4355-b6e4-4cb627389cd0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTc0ZmE5ZS01MGNjLTQzNTUtYjZlNC00Y2I2MjczODljZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODMwLCJpYXQiOjE3OTMyODQ5MzAsImp0aSI6IjA4NTI3MGM0LTQ4MDEtNGRhYS05MTI3LTIxOGYyZGNmZjQ5YyIsInNpZCI6IjNjYzQwNmI5LWM5MTYtNGVkMi04OGI2LTkxZTI4ODkxNjE1NCJ9.fBw5jrVUDU-cuWDGFPcZ5a2cArEtQhX_boy8XNo-4oM",
  "access_expires_at": "2026-10-29T14:57:10.438330266Z",
  "refresh_token": "JtndBXDIEPMNO_-ATnt4wi8WaWnUMZk1upNKmJQSUww",
  "refresh_expires_at": "2026-11-28T14:42:10.437800552Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4214e89a-5c95-4a04-b570-5fe137b26b22",
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
  "id": "20fd35fc-b3a7-4b89-8681-520680739898",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:10.723758Z",
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
  "command_id": "8e213a8e-f7e3-4451-9877-a1ff82633f35",
  "quote_id": "20fd35fc-b3a7-4b89-8681-520680739898",
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
  "correlation_id": "cbee8df0-ea44-4873-903d-683fa5fafcab"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "91a77bf0-bb27-421a-8945-14e4080217ba",
  "quote_id": "20fd35fc-b3a7-4b89-8681-520680739898",
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
  "id": "5ede2e41-9c76-444b-bf1f-830b847cabf0",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6174fa9e-50cc-4355-b6e4-4cb627389cd0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:42:11.323715Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5ede2e41-9c76-444b-bf1f-830b847cabf0/cancel` → **200**

```json
{
  "command_id": "48a9e3e7-d90a-4ae8-8ff6-b3d626769f41",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5ede2e41-9c76-444b-bf1f-830b847cabf0",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6174fa9e-50cc-4355-b6e4-4cb627389cd0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:11.323715Z",
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
  "command_id": "803439ae-387a-4695-abb2-f28014f73395",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T14:42:11.953023Z"
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
      "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T14:42:11.953023Z"
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
  "device_ref": "sandbox-31768"
}
```

```json
{
  "challenge_id": "5301e307-527d-4804-a200-cc2a7fdd724e",
  "expires_at": "2026-10-29T14:47:12.847145309Z",
  "resend_available_at": "2026-10-29T14:42:13.847145309Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "546611",
  "sent_at": "2026-10-29T14:42:12.8498367Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5301e307-527d-4804-a200-cc2a7fdd724e",
  "code": "546611",
  "device_ref": "sandbox-31768"
}
```

```json
{
  "session_id": "14b88fc9-9bdb-4243-a218-f1941078c751",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTgzMywiaWF0IjoxNzkzMjg0OTMzLCJqdGkiOiIwNmJjYWUxOC1lMzViLTRkOWYtODliNS1jNDkwMDZlMDcyYTIiLCJzaWQiOiIxNGI4OGZjOS05YmRiLTQyNDMtYTIxOC1mMTk0MTA3OGM3NTEifQ.9XiNdlBBgM5jaHD_C5glvKG_zjfa_UjjZJllsV4mhvQ",
  "access_expires_at": "2026-10-29T14:57:13.156050389Z",
  "refresh_token": "nZMUjDJPRJlLZKPnQ4y5pFDXbuj7Le57kZDE3esJc2Q",
  "refresh_expires_at": "2026-11-28T14:42:13.155379975Z",
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
  "command_id": "f0ed5f33-2ef3-443f-92a8-b674f8fcf448",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:13Z",
    "sequence": 1793284933710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:13.729434Z",
  "last_location_at": "2026-10-29T14:42:13.729434Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679924319",
  "device_ref": "sandbox-29515"
}
```

```json
{
  "challenge_id": "666e1bbd-2964-43cb-9f9a-f1dc67e9e692",
  "expires_at": "2026-10-29T14:47:14.017011768Z",
  "resend_available_at": "2026-10-29T14:42:15.017011768Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679924319` → **200**

```json
{
  "phone": "+380679924319",
  "audience": "CLIENT",
  "code": "105747",
  "sent_at": "2026-10-29T14:42:14.020213938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "666e1bbd-2964-43cb-9f9a-f1dc67e9e692",
  "code": "105747",
  "device_ref": "sandbox-29515"
}
```

```json
{
  "session_id": "fe5ec020-2f9f-49fd-ba74-6829f8a223e1",
  "subject": {
    "type": "CLIENT",
    "id": "2f6b38bb-e238-4c5c-a720-3dbbd1f1a2d2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjZiMzhiYi1lMjM4LTRjNWMtYTcyMC0zZGJiZDFmMWEyZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODM0LCJpYXQiOjE3OTMyODQ5MzQsImp0aSI6IjdjYjNhYjMxLTE4NjctNGQyZC1hMmRmLTg1NTk0YmZhMmJhNCIsInNpZCI6ImZlNWVjMDIwLTJmOWYtNDlmZC1iYTc0LTY4MjlmOGEyMjNlMSJ9._ZUtShnov6f0JewWu-UVHQ-JaawyiO5b7_2j0Dgw4cE",
  "access_expires_at": "2026-10-29T14:57:14.353318279Z",
  "refresh_token": "LFZgrJYr7foCi0Z3vsTmE0A-3Idu8XsDWXO0tem2e7U",
  "refresh_expires_at": "2026-11-28T14:42:14.352703822Z",
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
  "command_id": "72ce42c9-b234-451a-b0b2-bf9f54c91eae",
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
  "id": "a9ffe694-60ea-4d98-a3aa-e52069a1f1f7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:14.972819Z",
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
  "command_id": "7ef5c767-000d-4240-ac5c-d459236d6bc3",
  "platform": "ANDROID",
  "token": "sandbox-driver-7fc64bdb-76e0-45e7-8332-3f2cb3d87536"
}
```

```json
{
  "id": "f0d06d8a-aae3-4069-a18f-dc58508705fe",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:42:15.283419Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1dc64f9e-eb19-4058-9767-c9e11c9ab716",
  "platform": "ANDROID",
  "token": "sandbox-rider-32fbebca-dbbf-478c-ac68-8690820581f8"
}
```

```json
{
  "id": "b49dccbf-0f03-4f0e-8840-d4533dafb83c",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:42:15.564579Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f02037a3-dadb-466e-b8c3-70318cbd1644",
  "quote_id": "a9ffe694-60ea-4d98-a3aa-e52069a1f1f7",
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
  "id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2f6b38bb-e238-4c5c-a720-3dbbd1f1a2d2",
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
  "created_at": "2026-10-29T14:42:15.855865Z",
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
    "id": "bafc37eb-a41d-492d-a57a-c13c2811b146",
    "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
    "expires_at": "2026-10-29T14:42:30.858882Z",
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

`POST /api/driver/v1/offers/bafc37eb-a41d-492d-a57a-c13c2811b146/accept` → **200**

```json
{
  "command_id": "232a51f1-2ee3-4c4a-91d0-f1148e43ba80"
}
```

```json
{
  "id": "14974c8b-ee44-4056-abc3-14edd63f9316",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "103851de-408c-4698-bb59-f2c8ba45efc5",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:42:15.831Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:42:15.831Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:42:16.93377682Z",
    "token_suffix": "d87536",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "832b526f-dc7f-4083-ba7d-60ddd6c5d84c",
      "order_version": "2",
      "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679924319&after=2026-10-29T14:42:15.831Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:42:16.936867126Z",
    "token_suffix": "0581f8",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "5243bc9e-4776-4b7b-be12-890738f3ddc6",
      "order_version": "3",
      "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/10784d09-a682-46e6-a2dc-b5129d8a3ffc/messages` → **201**

```json
{
  "command_id": "c39a6cc0-548a-456b-aa54-126b2d65016d",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "84557151-ab9a-4b55-9389-9da3dd5a8061",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T14:42:17.825362493Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "103851de-408c-4698-bb59-f2c8ba45efc5",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "assignment_id": "14974c8b-ee44-4056-abc3-14edd63f9316",
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

`POST /api/driver/v1/trips/103851de-408c-4698-bb59-f2c8ba45efc5/messages` → **201**

```json
{
  "command_id": "47e760ce-e4d4-477f-b4ad-0e6df8d9752f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "a60ed9f1-237f-4683-8c43-35ac66c85a11",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T14:42:18.380748464Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/10784d09-a682-46e6-a2dc-b5129d8a3ffc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/103851de-408c-4698-bb59-f2c8ba45efc5/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679924319"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/23d651d1-4317-47d0-8dc4-8f0877f50397/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:19Z",
    "sequence": 1793284939200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:19.220578Z",
  "last_location_at": "2026-10-29T14:42:19.220578Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "103851de-408c-4698-bb59-f2c8ba45efc5",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "assignment_id": "14974c8b-ee44-4056-abc3-14edd63f9316",
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

`POST /api/driver/v1/trips/103851de-408c-4698-bb59-f2c8ba45efc5/arrive` → **200**

```json
{
  "command_id": "2055b3bc-f1e8-4c36-8131-21d018e3dea7",
  "expected_version": 0
}
```

```json
{
  "id": "103851de-408c-4698-bb59-f2c8ba45efc5",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "assignment_id": "14974c8b-ee44-4056-abc3-14edd63f9316",
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
  "arrived_at": "2026-10-29T14:42:19.783268Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/103851de-408c-4698-bb59-f2c8ba45efc5/start` → **200**

```json
{
  "command_id": "e0a47a6e-f7a4-4294-b9cd-2bb85acdf0b7",
  "expected_version": 1
}
```

```json
{
  "id": "103851de-408c-4698-bb59-f2c8ba45efc5",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "assignment_id": "14974c8b-ee44-4056-abc3-14edd63f9316",
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
  "arrived_at": "2026-10-29T14:42:19.783268Z",
  "started_at": "2026-10-29T14:42:20.075984Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/23d651d1-4317-47d0-8dc4-8f0877f50397/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:20Z",
    "sequence": 1793284940360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:20.379049Z",
  "last_location_at": "2026-10-29T14:42:20.379049Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/103851de-408c-4698-bb59-f2c8ba45efc5/complete` → **200**

```json
{
  "command_id": "b5e39872-3103-4ffd-bbd8-fff2f39242e0",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:42:20Z",
  "cash_received": true
}
```

```json
{
  "id": "103851de-408c-4698-bb59-f2c8ba45efc5",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "assignment_id": "14974c8b-ee44-4056-abc3-14edd63f9316",
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
  "arrived_at": "2026-10-29T14:42:19.783268Z",
  "started_at": "2026-10-29T14:42:20.075984Z",
  "completed_at": "2026-10-29T14:42:20.665066Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/10784d09-a682-46e6-a2dc-b5129d8a3ffc` → **200**

```json
{
  "id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2f6b38bb-e238-4c5c-a720-3dbbd1f1a2d2",
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
    "id": "14974c8b-ee44-4056-abc3-14edd63f9316",
    "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "103851de-408c-4698-bb59-f2c8ba45efc5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:42:15.855865Z",
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
    "id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:42:15.855865Z",
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
    "id": "103851de-408c-4698-bb59-f2c8ba45efc5",
    "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
    "order_short_number": 13,
    "created_at": "2026-10-29T14:42:16.448081Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6a28c508-b23e-46a8-b458-b6203f540484",
    "order_id": "a22aa052-105d-446c-94be-2a9c109b8791",
    "order_short_number": 8,
    "created_at": "2026-10-29T14:41:04.698247Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "ae8117b3-01c9-4d23-8e7b-eacd9fcc2c1f",
    "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
    "order_short_number": 3,
    "created_at": "2026-10-29T14:40:20.106075Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0677d9bb-a703-4eff-b171-23441dd910be",
    "order_id": "c85c1bed-0511-4c66-af14-7ffd15bd6c54",
    "order_short_number": 2,
    "created_at": "2026-10-29T14:40:02.974871Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "080381d4-88c5-4801-adcd-d41ebb66a39b",
    "order_id": "edf6cfe8-d3c0-49ff-95e5-6d70bd5fd105",
    "order_short_number": 1,
    "created_at": "2026-10-29T14:39:53.297532Z",
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

`GET /api/rider/v1/orders/10784d09-a682-46e6-a2dc-b5129d8a3ffc/tip` → **200**

```json
{
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
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
  "available_until": "2026-10-30T14:42:20.665066Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/10784d09-a682-46e6-a2dc-b5129d8a3ffc/tip` → **201**

```json
{
  "command_id": "84e45a02-f585-4817-9627-d89e648e5b6e",
  "amount_minor": 1100
}
```

```json
{
  "id": "bd83718c-b993-4378-ae19-ccb7050bc822",
  "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T14:42:25.712718Z"
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
  "session_id": "cd1ee5c0-4617-4046-8f6e-67b01b29c96e",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDYsImlhdCI6MTc5MzI4NDk0NiwianRpIjoiZDM5OTQyMGMtZmI2NC00YjM0LWEwYmQtNWVjZDdjZjA5MTMyIiwic2lkIjoiY2QxZWU1YzAtNDYxNy00MDQ2LThmNmUtNjdiMDFiMjljOTZlIn0.hHAAfK_CL6PmTi2At-NnA_5sbJ-lhQEiSYEgsoAyGPk",
  "access_expires_at": "2026-10-29T14:57:26.291487128Z",
  "refresh_token": "BACZoDtnuzXChHeputdGjrxTk1jENHn0ISMgFpF7QWg",
  "refresh_expires_at": "2026-10-30T02:42:26.290946566Z",
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
      "PHONE": 1,
      "APP": 12
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
  "generated_at": "2026-10-29T14:42:26.572775195Z"
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
  "generated_at": "2026-10-29T14:42:26.86162249Z"
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
  "session_id": "128bce13-72fe-4e67-9b96-013139717771",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDcsImlhdCI6MTc5MzI4NDk0NywianRpIjoiMWQ5YTk3YTAtMTcyMC00N2VjLTgyOGYtYTc1MWI3MTc4Nzg3Iiwic2lkIjoiMTI4YmNlMTMtNzJmZS00ZTY3LTliOTYtMDEzMTM5NzE3NzcxIn0.ffJ9fmQN0hvjNPLNogXOoi05iTSbGoz3IFw3Wrjtow8",
  "access_expires_at": "2026-10-29T14:57:27.435435448Z",
  "refresh_token": "IubRu7xiFdgaXGO8XVGvXJojywx_01cKR5zXogyjk8U",
  "refresh_expires_at": "2026-10-30T02:42:27.434764592Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/10784d09-a682-46e6-a2dc-b5129d8a3ffc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:15.856355Z",
      "actor": {
        "type": "CLIENT",
        "id": "2f6b38bb-e238-4c5c-a720-3dbbd1f1a2d2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
        "quote_id": "a9ffe694-60ea-4d98-a3aa-e52069a1f1f7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1ef378ce-d094-4636-8f51-dfa0a42cb83f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:15.858112Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
        "attempt_id": "27d54f58-f30c-4dec-a13d-86e2009a1e62",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1ef378ce-d094-4636-8f51-dfa0a42cb83f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:42:15.860791Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bafc37eb-a41d-492d-a57a-c13c2811b146",
        "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "1ef378ce-d094-4636-8f51-dfa0a42cb83f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:42:16.450069Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bafc37eb-a41d-492d-a57a-c13c2811b146",
        "order_id": "10784d09-a682-46e6-a2dc-b5129d8a3ffc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "14974c8b-ee44-4056-abc3-14edd63f9316"
      },
      "correlation_id": "1041dd84-a088-4c63-a80a-72d3d07e2504"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T14:42:28.022368727Z",
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
      "last_location_at": "2026-10-29T14:42:20.379049Z",
      "order_id": null
    }
  ]
}
```

Done: order 10784d09-a682-46e6-a2dc-b5129d8a3ffc.

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
  "session_id": "53008a9f-2f3c-4891-8671-52dd6fe0da75",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDgsImlhdCI6MTc5MzI4NDk0OCwianRpIjoiOGYxZDQ2ZDYtNzQyYi00OGU0LWIwYjQtZjMzZmFlMzY0YTYxIiwic2lkIjoiNTMwMDhhOWYtMmYzYy00ODkxLTg2NzEtNTJkZDZmZTBkYTc1In0.82gIrLQf5d3g_k_n9k5oHWDBwZr2zfnWKMMgDA1cp8s",
  "access_expires_at": "2026-10-29T14:57:28.630067626Z",
  "refresh_token": "ZG1PRuw7e8wlgFbky1d2nGAca2464xRamo9Pl0iqAKg",
  "refresh_expires_at": "2026-10-30T02:42:28.629498862Z",
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
  "command_id": "72e4f6fa-c42e-4864-93cb-7a2213cfae28",
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
  "timestamp": "2026-10-29T14:42:29.000+0000",
  "channel": {
    "id": "1730052000.1861911561",
    "linkedid": "1730052000.1861911561",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677481054"
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
  "timestamp": "2026-10-29T14:42:29.000+0000",
  "channel": {
    "id": "1730052000.1861911561",
    "linkedid": "1730052000.1861911561",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677481054"
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
  "session_id": "4570cc38-0576-4f5d-ab25-bbea9830f31c",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NDksImlhdCI6MTc5MzI4NDk0OSwianRpIjoiM2Y3YjY0YjAtMzQ4MS00ZTgzLWI2ZGUtNDkxZTI4ZTUxNTU1Iiwic2lkIjoiNDU3MGNjMzgtMDU3Ni00ZjVkLWFiMjUtYmJlYTk4MzBmMzFjIn0.hAnA9dqxcDc-YxMK2q_3BpFzQ_ehmoOzNe4gu8MAZhk",
  "access_expires_at": "2026-10-29T14:57:29.837024028Z",
  "refresh_token": "1Wk9NNa1zlHQTgnP589mvVY4kI8ujO996BWrmcKrORs",
  "refresh_expires_at": "2026-10-30T02:42:29.836484928Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "51fa21ab-d1fe-45ce-9709-4f271fce3d4e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677481054",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:42:29Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/51fa21ab-d1fe-45ce-9709-4f271fce3d4e/answer` → **200**

```json
{
  "command_id": "e8fec850-ce42-4cc3-90ec-8d606b5ba2ce"
}
```

```json
{
  "id": "51fa21ab-d1fe-45ce-9709-4f271fce3d4e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677481054",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "order_ids": [],
  "started_at": "2026-10-29T14:42:29Z",
  "answered_at": "2026-10-29T14:42:30.421636Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1861911561",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "262b59d4-a5f3-4229-9b44-751719998d23",
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
  "id": "95912b76-1c2a-4931-a175-b78d5c10fb31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:30.744089Z",
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
  "command_id": "c587f222-ad9b-4594-a652-2e586a87e9c4",
  "quote_id": "95912b76-1c2a-4931-a175-b78d5c10fb31",
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
    "phone": "+380677481054"
  },
  "call_id": "51fa21ab-d1fe-45ce-9709-4f271fce3d4e"
}
```

```json
{
  "id": "5b4c04e1-b35d-4c84-a201-c72ee9069aee",
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
  "created_at": "2026-10-29T14:42:31.044092Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677481054"
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
    "id": "1730052000.1861911561",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "51fa21ab-d1fe-45ce-9709-4f271fce3d4e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677481054",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [
        "5b4c04e1-b35d-4c84-a201-c72ee9069aee"
      ],
      "started_at": "2026-10-29T14:42:29Z",
      "answered_at": "2026-10-29T14:42:30.421636Z",
      "ended_at": "2026-10-29T14:42:31.356638Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "ae3bf5da-2d95-4c47-a52e-a64629c12ff6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673805134",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [],
      "started_at": "2026-10-29T14:40:11.121043Z",
      "answered_at": "2026-10-29T14:40:11.452163Z",
      "ended_at": "2026-10-29T14:40:11.769975Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:40:16.331661Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/5b4c04e1-b35d-4c84-a201-c72ee9069aee` → **200**

```json
{
  "id": "5b4c04e1-b35d-4c84-a201-c72ee9069aee",
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
  "created_at": "2026-10-29T14:42:31.044092Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677481054"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/5b4c04e1-b35d-4c84-a201-c72ee9069aee` → **200**

```json
{
  "id": "5b4c04e1-b35d-4c84-a201-c72ee9069aee",
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
  "created_at": "2026-10-29T14:42:31.044092Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677481054"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5b4c04e1-b35d-4c84-a201-c72ee9069aee/cancel` → **200**

```json
{
  "command_id": "c42d9e79-06b9-41e8-a92e-3d7b1d061720",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5b4c04e1-b35d-4c84-a201-c72ee9069aee",
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
  "created_at": "2026-10-29T14:42:31.044092Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677481054"
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

Done: call 51fa21ab-d1fe-45ce-9709-4f271fce3d4e with order 5b4c04e1-b35d-4c84-a201-c72ee9069aee.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4848"
}
```

```json
{
  "challenge_id": "8fb81a2b-8ca2-4226-b828-a75bd869a7c9",
  "expires_at": "2026-10-29T14:47:32.604983063Z",
  "resend_available_at": "2026-10-29T14:42:33.604983063Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "784259",
  "sent_at": "2026-10-29T14:42:32.607755764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8fb81a2b-8ca2-4226-b828-a75bd869a7c9",
  "code": "784259",
  "device_ref": "sandbox-4848"
}
```

```json
{
  "session_id": "535e5629-1d04-4389-8b45-90aacdbf45a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg1MiwiaWF0IjoxNzkzMjg0OTUyLCJqdGkiOiI1ODA5MmE3ZS00MzhjLTQxZTQtOGVkYi02ZGMwMDg4NDk0MDEiLCJzaWQiOiI1MzVlNTYyOS0xZDA0LTQzODktOGI0NS05MGFhY2RiZjQ1YTkifQ.nNjZ5Rs3nUIjXQioG0zZ-bmOUQStl8V8E0lR4lxCVy4",
  "access_expires_at": "2026-10-29T14:57:32.928111511Z",
  "refresh_token": "QoXAsUSdl4Npunel5x6TJN2zX9Hfvk9NjVM5eUmbweE",
  "refresh_expires_at": "2026-11-28T14:42:32.927570719Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:20.379049Z",
  "last_location_at": "2026-10-29T14:42:20.379049Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/23d651d1-4317-47d0-8dc4-8f0877f50397/handover` → **200**

```json
{
  "command_id": "b23900c4-6e5c-47ae-a3f4-1ac1466fc57f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:20.379049Z",
  "last_location_at": "2026-10-29T14:42:20.379049Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/23d651d1-4317-47d0-8dc4-8f0877f50397/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:33Z",
    "sequence": 1793284953758
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:33.776847Z",
  "last_location_at": "2026-10-29T14:42:33.776847Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669664792",
  "device_ref": "sandbox-30598"
}
```

```json
{
  "challenge_id": "b6c41ee8-347b-4421-89f7-d7e8c119c310",
  "expires_at": "2026-10-29T14:47:34.06627282Z",
  "resend_available_at": "2026-10-29T14:42:35.06627282Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669664792` → **200**

```json
{
  "phone": "+380669664792",
  "audience": "CLIENT",
  "code": "791064",
  "sent_at": "2026-10-29T14:42:34.069781262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6c41ee8-347b-4421-89f7-d7e8c119c310",
  "code": "791064",
  "device_ref": "sandbox-30598"
}
```

```json
{
  "session_id": "285f5c17-440e-4f20-b21e-7f2def4df962",
  "subject": {
    "type": "CLIENT",
    "id": "997f50db-9b88-4db2-b61a-a3479dd31c19"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTdmNTBkYi05Yjg4LTRkYjItYjYxYS1hMzQ3OWRkMzFjMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODU0LCJpYXQiOjE3OTMyODQ5NTQsImp0aSI6IjUyMDExOGI3LTUxYjYtNDFhNS04ZTdkLTQyNDZmYTY2ZjI4NyIsInNpZCI6IjI4NWY1YzE3LTQ0MGUtNGYyMC1iMjFlLTdmMmRlZjRkZjk2MiJ9.DrxKkgasOD57tBCPsLeLgZ5BsQ6SXILXB5owp4fq3E4",
  "access_expires_at": "2026-10-29T14:57:34.37706778Z",
  "refresh_token": "V7ZvXK_fAqyhKBbLVd5y4VuK6cNVGrn59y5zS4JCkg8",
  "refresh_expires_at": "2026-11-28T14:42:34.37644785Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b08f572a-25db-4adb-9210-958a55e0092e",
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
  "id": "3463e98f-2595-45d7-adc9-def8ea1e7ec3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:34.658925Z",
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
  "command_id": "26cd2d37-bad1-4a35-b832-83fe8135c493",
  "quote_id": "3463e98f-2595-45d7-adc9-def8ea1e7ec3",
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
  "id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "997f50db-9b88-4db2-b61a-a3479dd31c19",
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
  "created_at": "2026-10-29T14:42:34.959839Z",
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
    "id": "7cf03298-790d-4049-a268-dadbdeb2c38d",
    "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
    "expires_at": "2026-10-29T14:42:49.96316Z",
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

`POST /api/driver/v1/offers/7cf03298-790d-4049-a268-dadbdeb2c38d/accept` → **200**

```json
{
  "command_id": "f6aa21ac-cd5f-4e38-883f-e38fc9ac9ebd"
}
```

```json
{
  "id": "d4973208-2728-4193-92e8-db491766cdd8",
  "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "84ef2701-11af-48e4-b09d-e773edd30246",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "84ef2701-11af-48e4-b09d-e773edd30246",
  "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
  "assignment_id": "d4973208-2728-4193-92e8-db491766cdd8",
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

`POST /api/driver/v1/work-sessions/23d651d1-4317-47d0-8dc4-8f0877f50397/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:36Z",
    "sequence": 1793284956932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:36.111652Z",
  "last_location_at": "2026-10-29T14:42:36.111652Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/84ef2701-11af-48e4-b09d-e773edd30246/arrive` → **200**

```json
{
  "command_id": "ad7a59b5-dcfa-48cd-bcbd-4afafe769edb",
  "expected_version": 0
}
```

```json
{
  "id": "84ef2701-11af-48e4-b09d-e773edd30246",
  "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
  "assignment_id": "d4973208-2728-4193-92e8-db491766cdd8",
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
  "arrived_at": "2026-10-29T14:42:36.397792Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/84ef2701-11af-48e4-b09d-e773edd30246/start` → **200**

```json
{
  "command_id": "1a23f23d-7efa-41f1-9749-ec3a3f41a0d3",
  "expected_version": 1
}
```

```json
{
  "id": "84ef2701-11af-48e4-b09d-e773edd30246",
  "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
  "assignment_id": "d4973208-2728-4193-92e8-db491766cdd8",
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
  "arrived_at": "2026-10-29T14:42:36.397792Z",
  "started_at": "2026-10-29T14:42:36.692635Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/23d651d1-4317-47d0-8dc4-8f0877f50397/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:36Z",
    "sequence": 1793284957569
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:37.019446Z",
  "last_location_at": "2026-10-29T14:42:37.019446Z",
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
  "device_ref": "sandbox-32349"
}
```

```json
{
  "challenge_id": "cc162f0d-5550-4b7d-8514-22482e330929",
  "expires_at": "2026-10-29T14:47:37.306482994Z",
  "resend_available_at": "2026-10-29T14:42:38.306482994Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "651068",
  "sent_at": "2026-10-29T14:42:37.310152363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc162f0d-5550-4b7d-8514-22482e330929",
  "code": "651068",
  "device_ref": "sandbox-32349"
}
```

```json
{
  "session_id": "ba74c26a-5d79-4ac7-ad36-849c134a8a77",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg1NywiaWF0IjoxNzkzMjg0OTU3LCJqdGkiOiJkZGZjNTdjYy1iNGNjLTQ2MzEtYTE0Ny0xZWU4NjgyYzFmMGUiLCJzaWQiOiJiYTc0YzI2YS01ZDc5LTRhYzctYWQzNi04NDljMTM0YThhNzcifQ.aaR3QI6yzGWQuOGBjfJ_L_30HRC2_wiomjhMdrLbYNI",
  "access_expires_at": "2026-10-29T14:57:37.611434152Z",
  "refresh_token": "piWxrzAc-MkwPdSQoaSXtGuPQ6VqDOdh_gUTzQeuo4o",
  "refresh_expires_at": "2026-11-28T14:42:37.610516474Z",
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
  "command_id": "bf2026b4-b054-43be-8c91-fc31b81753e8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:38Z",
    "sequence": 1793284958180
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d55f603-2064-452c-830a-f5de933da065",
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
  "last_heartbeat_at": "2026-10-29T14:42:38.199687Z",
  "last_location_at": "2026-10-29T14:42:38.199687Z",
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
  "session_id": "4efd8302-9210-457e-8843-0ced06ca4944",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NTgsImlhdCI6MTc5MzI4NDk1OCwianRpIjoiYjJmNzA1NDEtOGZmMS00NDhiLTkzMzktNWMzMTEwNWFlNDIwIiwic2lkIjoiNGVmZDgzMDItOTIxMC00NTdlLTg4NDMtMGNlZDA2Y2E0OTQ0In0.sRB-NdLAwqgR-l-KlBiKqYuKFbK00KVAPIcWm6qAfqI",
  "access_expires_at": "2026-10-29T14:57:38.772501886Z",
  "refresh_token": "qfzzkLef84DE-7MbBSFweXPeshM-3rR05J7JGej9BMs",
  "refresh_expires_at": "2026-10-30T02:42:38.771864353Z",
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
  "session_id": "04b3990f-4858-4425-a3f2-5bf4dc14f046",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NTksImlhdCI6MTc5MzI4NDk1OSwianRpIjoiODBmN2I1MGUtZDRiZS00ODUxLWJhZmYtZDc1ZTYxM2E5MTdjIiwic2lkIjoiMDRiMzk5MGYtNDg1OC00NDI1LWEzZjItNWJmNGRjMTRmMDQ2In0.L5mFx87wzXS2pnMvU-zZWeWTgQeYGtCdlfkmX_1iy5o",
  "access_expires_at": "2026-10-29T14:57:39.334626499Z",
  "refresh_token": "CoO74RkohPCwJbW28AQAV0qSBJqEBnMZN6w-bPmCvqY",
  "refresh_expires_at": "2026-10-30T02:42:39.333970231Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4ced5463-9778-4b96-b161-bec418ff4c3c` → **200**

```json
{
  "id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "997f50db-9b88-4db2-b61a-a3479dd31c19",
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
    "id": "d4973208-2728-4193-92e8-db491766cdd8",
    "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "84ef2701-11af-48e4-b09d-e773edd30246",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T14:42:34.959839Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4ced5463-9778-4b96-b161-bec418ff4c3c/interrupt` → **200**

```json
{
  "command_id": "06e16071-5c7d-46ea-b3db-8c104e73c7d4",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "997f50db-9b88-4db2-b61a-a3479dd31c19",
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
      "id": "d4973208-2728-4193-92e8-db491766cdd8",
      "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "84ef2701-11af-48e4-b09d-e773edd30246",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T14:42:34.959839Z",
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
    "id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "997f50db-9b88-4db2-b61a-a3479dd31c19",
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
    "id": "54a6ba04-7bdc-4c30-b65a-2514ee4d79dc",
    "order_id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
    "expires_at": "2026-10-29T14:42:54.926458Z",
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

`POST /api/driver/v1/offers/54a6ba04-7bdc-4c30-b65a-2514ee4d79dc/accept` → **200**

```json
{
  "command_id": "530cf3f1-c607-43be-871e-eb222791d424"
}
```

```json
{
  "id": "555abc04-4305-44e5-9b7b-3fbda86c1658",
  "order_id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6e05b9ee-f635-4d87-82fa-4b1eb8da0520",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6e05b9ee-f635-4d87-82fa-4b1eb8da0520",
  "order_id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
  "assignment_id": "555abc04-4305-44e5-9b7b-3fbda86c1658",
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
  "session_id": "8d55f603-2064-452c-830a-f5de933da065",
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
  "last_heartbeat_at": "2026-10-29T14:42:38.199687Z",
  "last_location_at": "2026-10-29T14:42:38.199687Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8d55f603-2064-452c-830a-f5de933da065/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:41Z",
    "sequence": 1793284961404
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d55f603-2064-452c-830a-f5de933da065",
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
  "last_heartbeat_at": "2026-10-29T14:42:41.424053Z",
  "last_location_at": "2026-10-29T14:42:41.424053Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6e05b9ee-f635-4d87-82fa-4b1eb8da0520/arrive` → **200**

```json
{
  "command_id": "52be911a-2072-4262-a8c8-4b3828c613d3",
  "expected_version": 0
}
```

```json
{
  "id": "6e05b9ee-f635-4d87-82fa-4b1eb8da0520",
  "order_id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
  "assignment_id": "555abc04-4305-44e5-9b7b-3fbda86c1658",
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
  "arrived_at": "2026-10-29T14:42:41.716046Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6e05b9ee-f635-4d87-82fa-4b1eb8da0520/start` → **200**

```json
{
  "command_id": "5e95fa44-f072-488b-8cab-271f76f333cb",
  "expected_version": 1
}
```

```json
{
  "id": "6e05b9ee-f635-4d87-82fa-4b1eb8da0520",
  "order_id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
  "assignment_id": "555abc04-4305-44e5-9b7b-3fbda86c1658",
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
  "arrived_at": "2026-10-29T14:42:41.716046Z",
  "started_at": "2026-10-29T14:42:42.013761Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6e05b9ee-f635-4d87-82fa-4b1eb8da0520/complete` → **200**

```json
{
  "command_id": "4ebb674e-5afe-423a-ab0c-e633e75203a4",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:42:42Z"
}
```

```json
{
  "id": "6e05b9ee-f635-4d87-82fa-4b1eb8da0520",
  "order_id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
  "assignment_id": "555abc04-4305-44e5-9b7b-3fbda86c1658",
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
  "arrived_at": "2026-10-29T14:42:41.716046Z",
  "started_at": "2026-10-29T14:42:42.013761Z",
  "completed_at": "2026-10-29T14:42:42.302964Z",
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
    "id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:42:39.91474Z",
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
    "id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:42:34.959839Z",
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

`GET /api/operator/v1/orders/4ced5463-9778-4b96-b161-bec418ff4c3c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:42:34.960328Z",
      "actor": {
        "type": "CLIENT",
        "id": "997f50db-9b88-4db2-b61a-a3479dd31c19",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
        "quote_id": "3463e98f-2595-45d7-adc9-def8ea1e7ec3",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "84e1ef92-cfea-414e-bce5-373cebae1603"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:42:34.962415Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
        "attempt_id": "6dd030e9-f7a3-4730-90d5-7df10befef60",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "84e1ef92-cfea-414e-bce5-373cebae1603"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:42:34.965316Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7cf03298-790d-4049-a268-dadbdeb2c38d",
        "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "84e1ef92-cfea-414e-bce5-373cebae1603"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:42:35.53455Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7cf03298-790d-4049-a268-dadbdeb2c38d",
        "order_id": "4ced5463-9778-4b96-b161-bec418ff4c3c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d4973208-2728-4193-92e8-db491766cdd8"
      },
      "correlation_id": "51425de6-ab71-40e1-8f50-b3a04173afe6"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/c0e5b41e-cb37-4b1b-8121-5e2ce63b4994/tip` → **200**

```json
{
  "order_id": "c0e5b41e-cb37-4b1b-8121-5e2ce63b4994",
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
  "available_until": "2026-10-30T14:42:42.302964Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/c0e5b41e-cb37-4b1b-8121-5e2ce63b4994/tip` → **409**

```json
{
  "command_id": "8f830a76-52b3-405c-8a89-50cb27a90631",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/c0e5b41e-cb37-4b1b-8121-5e2ce63b4994/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cd2c1e56-ac9a-4192-8cff-f4b701fb4588"
}
```

Done: interrupted 4ced5463-9778-4b96-b161-bec418ff4c3c, follow-up c0e5b41e-cb37-4b1b-8121-5e2ce63b4994.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23d651d1-4317-47d0-8dc4-8f0877f50397",
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
  "last_heartbeat_at": "2026-10-29T14:42:37.019446Z",
  "last_location_at": "2026-10-29T14:42:37.019446Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/23d651d1-4317-47d0-8dc4-8f0877f50397/close` → **200**

```json
{
  "command_id": "1a48a01a-4e0d-4326-9c35-81969a075f15",
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
  "session_id": "8d55f603-2064-452c-830a-f5de933da065",
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
  "last_heartbeat_at": "2026-10-29T14:42:41.424053Z",
  "last_location_at": "2026-10-29T14:42:41.424053Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d55f603-2064-452c-830a-f5de933da065/close` → **200**

```json
{
  "command_id": "6a1ec685-c2ad-4df4-8200-d63f32f2a1b0",
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
  "session_id": "69f50e7a-cd65-4614-8865-f43bcc0aca34",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4NjgsImlhdCI6MTc5MzI4NDk2OCwianRpIjoiZWVhZWZkNmMtODdkNC00NjNjLThlYjItYTM1NGU4NDM3ZTc4Iiwic2lkIjoiNjlmNTBlN2EtY2Q2NS00NjE0LTg4NjUtZjQzYmNjMGFjYTM0In0.-pa2b2Wn7ItdWNkzzfAe5rvF1QB569U3A-mKcT32iOI",
  "access_expires_at": "2026-10-29T14:57:48.507689132Z",
  "refresh_token": "AvkxDyQZyl_o6jH-DTLq0BVG5m6cJrAChIteYVZgNN4",
  "refresh_expires_at": "2026-10-30T02:42:48.50704174Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "7c20dc4e-7088-40d6-8e5e-bcc632af89f0",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:42:48Z"
}
```

```json
{
  "id": "0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:42:48Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa/publish` → **200**

```json
{
  "command_id": "4d393e08-a9d0-422c-a4eb-9aae9891161a",
  "expected_version": 0
}
```

```json
{
  "id": "0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:42:49.109659Z",
  "published_at": "2026-10-29T14:42:49.109659Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T14:42:49.109659Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636047750",
  "device_ref": "sandbox-7846"
}
```

```json
{
  "challenge_id": "aa8b4b3a-a1ef-4cb1-95db-8acab0460a18",
  "expires_at": "2026-10-29T14:47:49.688899966Z",
  "resend_available_at": "2026-10-29T14:42:50.688899966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636047750` → **200**

```json
{
  "phone": "+380636047750",
  "audience": "CLIENT",
  "code": "002245",
  "sent_at": "2026-10-29T14:42:49.69169674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa8b4b3a-a1ef-4cb1-95db-8acab0460a18",
  "code": "002245",
  "device_ref": "sandbox-7846"
}
```

```json
{
  "session_id": "93d76238-1a42-4eed-b7e4-78595a7c17b4",
  "subject": {
    "type": "CLIENT",
    "id": "f9a2f0fc-3424-466a-9a32-3083715f3557"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOWEyZjBmYy0zNDI0LTQ2NmEtOWEzMi0zMDgzNzE1ZjM1NTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODcwLCJpYXQiOjE3OTMyODQ5NzAsImp0aSI6IjlhMTNiNzJhLTJlOGEtNGYzMS1hMDRmLWIzY2E1ZGRjZjMwOCIsInNpZCI6IjkzZDc2MjM4LTFhNDItNGVlZC1iN2U0LTc4NTk1YTdjMTdiNCJ9.QxzojpzssZk_QbfYTYdNJLOatGHZpskltFE-QP4bnT0",
  "access_expires_at": "2026-10-29T14:57:50.002139385Z",
  "refresh_token": "C_p7Wx8FAp3ioFR2IlKHVQjrBjVp_8eHy0DgZsKFDGc",
  "refresh_expires_at": "2026-11-28T14:42:50.00157467Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T14:42:49.109659Z",
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
  "command_id": "78a89e16-5b32-4c2d-9c6f-3d235622035b",
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
  "id": "bc8826b9-28e8-4a05-a0d5-5503e7bd0d81",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:50.585732Z",
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
  "command_id": "003e2328-f0fc-4d69-b933-936584611249",
  "quote_id": "bc8826b9-28e8-4a05-a0d5-5503e7bd0d81",
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
  "correlation_id": "535bc26c-305e-40c2-9d4f-8bbb66b687d7"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "94eafe0d-4e81-4d08-9823-f9c85f87bbe6",
  "version_id": "0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa",
  "language": "uk"
}
```

```json
{
  "version_id": "0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T14:42:51.183167Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "345c2f4b-3b92-4633-ba51-a9bc0b0fdf74",
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
  "id": "71c2b808-fc9f-421e-bbee-d126f791db71",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:51.478392Z",
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
  "command_id": "90f1188f-221e-440c-903a-1cfa47fee91f",
  "quote_id": "71c2b808-fc9f-421e-bbee-d126f791db71",
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
  "id": "6585d1c0-1aa6-4117-8a50-05ebbe61a484",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f9a2f0fc-3424-466a-9a32-3083715f3557",
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
  "created_at": "2026-10-29T14:42:51.768422Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/6585d1c0-1aa6-4117-8a50-05ebbe61a484` → **200**

```json
{
  "id": "6585d1c0-1aa6-4117-8a50-05ebbe61a484",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f9a2f0fc-3424-466a-9a32-3083715f3557",
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
  "created_at": "2026-10-29T14:42:51.768422Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6585d1c0-1aa6-4117-8a50-05ebbe61a484/cancel` → **200**

```json
{
  "command_id": "f4cbec0f-c4a9-4505-9f06-59c572b7d0df",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6585d1c0-1aa6-4117-8a50-05ebbe61a484",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f9a2f0fc-3424-466a-9a32-3083715f3557",
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
  "created_at": "2026-10-29T14:42:51.768422Z",
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

`POST /api/admin/v1/legal-documents/0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa` → **409**

```json
{
  "command_id": "8db0416e-6582-4c49-8fe2-3ee98b8c873f",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:42:52Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/0d0724a6-c7c9-41f4-a5ac-b861d1a26eaa",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "daf26326-79d4-493a-ac19-6120322adaec"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f591ee09-3d8d-4327-b2d2-75de4f3c826d",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:42:52Z"
}
```

```json
{
  "id": "30ddf9f8-8245-4009-a0f1-9e4654cd7676",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:42:52Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/30ddf9f8-8245-4009-a0f1-9e4654cd7676/publish` → **200**

```json
{
  "command_id": "8e432221-8843-4435-9be3-5e7d776911fc",
  "expected_version": 0
}
```

```json
{
  "id": "30ddf9f8-8245-4009-a0f1-9e4654cd7676",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:42:53.289244Z",
  "published_at": "2026-10-29T14:42:53.289244Z",
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
  "device_ref": "sandbox-24845"
}
```

```json
{
  "challenge_id": "aa48678b-f9c2-4f50-ac7d-6898d43a6c38",
  "expires_at": "2026-10-29T14:47:53.585436977Z",
  "resend_available_at": "2026-10-29T14:42:54.585436977Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "960025",
  "sent_at": "2026-10-29T14:42:53.587836029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa48678b-f9c2-4f50-ac7d-6898d43a6c38",
  "code": "960025",
  "device_ref": "sandbox-24845"
}
```

```json
{
  "session_id": "4f3d8afa-0293-44e6-97f8-c06d62183754",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg3MywiaWF0IjoxNzkzMjg0OTczLCJqdGkiOiJmYjZhZmFmNC1lMmQ1LTRlMDUtYTRlNi0yMTNiNWEzMDhlZjgiLCJzaWQiOiI0ZjNkOGFmYS0wMjkzLTQ0ZTYtOTdmOC1jMDZkNjIxODM3NTQifQ.R_OXz7o6qHJQUy0Hp6IejicRz7URlr77-NTkLc4hC5o",
  "access_expires_at": "2026-10-29T14:57:53.889337913Z",
  "refresh_token": "mggLtRUbV7UQLp1ECfG16aeneGWf7yur0zlFDffskl0",
  "refresh_expires_at": "2026-11-28T14:42:53.888723582Z",
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
  "command_id": "a468b026-954b-4bf5-b413-481cdd458d9f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:42:54Z",
    "sequence": 1793284974445
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "02d8c59a-56a9-481f-9d98-73e3d02c1aca",
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
  "last_heartbeat_at": "2026-10-29T14:42:54.463575Z",
  "last_location_at": "2026-10-29T14:42:54.463575Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670088546",
  "device_ref": "sandbox-25492"
}
```

```json
{
  "challenge_id": "c6e0a6fd-61d2-4840-8f77-e43918505327",
  "expires_at": "2026-10-29T14:47:54.740997961Z",
  "resend_available_at": "2026-10-29T14:42:55.740997961Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670088546` → **200**

```json
{
  "phone": "+380670088546",
  "audience": "CLIENT",
  "code": "812722",
  "sent_at": "2026-10-29T14:42:54.743528319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6e0a6fd-61d2-4840-8f77-e43918505327",
  "code": "812722",
  "device_ref": "sandbox-25492"
}
```

```json
{
  "session_id": "eb2c1423-a12d-4bf0-92f8-9d6f8d1bf6d8",
  "subject": {
    "type": "CLIENT",
    "id": "64a6a44d-3b35-422d-bc85-616fefcba997"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NGE2YTQ0ZC0zYjM1LTQyMmQtYmM4NS02MTZmZWZjYmE5OTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1ODc1LCJpYXQiOjE3OTMyODQ5NzUsImp0aSI6IjI1YjFmNmMwLTU3YzQtNDY0Yi04NmQxLWQ4YWMzZDRlMDcyNCIsInNpZCI6ImViMmMxNDIzLWExMmQtNGJmMC05MmY4LTlkNmY4ZDFiZjZkOCJ9.NGX2Sj_sya8ZDXKgCp4a28dBbqepSPbWCcl_73GUNr8",
  "access_expires_at": "2026-10-29T14:57:55.056304247Z",
  "refresh_token": "zrUHQEqMSltANZF89n7g73ysmTVmHuxp2r6ecunOTok",
  "refresh_expires_at": "2026-11-28T14:42:55.055706084Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b2cb3411-ec03-4885-846e-cfb0f64028c6",
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
  "id": "c7be267c-5748-4614-aff2-54c8c9163bc2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:55.349849Z",
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
  "command_id": "73e668b2-8e10-4b6b-ba57-4bc91522cfbe",
  "quote_id": "c7be267c-5748-4614-aff2-54c8c9163bc2",
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
    "phone": "+380672010748"
  }
}
```

```json
{
  "id": "03edcd9f-57fb-4070-b742-2d3f63986817",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:55.644871Z",
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
    "id": "9c252322-1606-4817-9c27-f7798d563e7d",
    "order_id": "03edcd9f-57fb-4070-b742-2d3f63986817",
    "expires_at": "2026-10-29T14:43:10.648511Z",
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

`POST /api/driver/v1/offers/9c252322-1606-4817-9c27-f7798d563e7d/accept` → **200**

```json
{
  "command_id": "ea2d46db-561b-4289-bc93-ecaeee22425f"
}
```

```json
{
  "id": "784bd4a9-ea61-45db-ad9f-20f6b62dbc1f",
  "order_id": "03edcd9f-57fb-4070-b742-2d3f63986817",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "386de9d6-5cdf-4edb-8694-ce895627e381",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "386de9d6-5cdf-4edb-8694-ce895627e381",
  "order_id": "03edcd9f-57fb-4070-b742-2d3f63986817",
  "assignment_id": "784bd4a9-ea61-45db-ad9f-20f6b62dbc1f",
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
    "phone": "+380672010748"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d94e1e28-b8cd-4931-ba00-cd30d24ff8d3",
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
  "id": "95f34a30-0935-4cc6-bba8-3a06c975c2cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:56.792220Z",
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
  "command_id": "4a4f1e93-4cb8-444f-bd0f-058df70e828d",
  "quote_id": "95f34a30-0935-4cc6-bba8-3a06c975c2cd",
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
  "id": "2d0adff9-174c-43c0-a4e5-d74bc8d79e12",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:42:57.082381Z",
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
  "command_id": "6e943f8e-8b61-4000-b8a6-41ea417fa572",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T17:42:57Z"
}
```

```json
{
  "id": "42afc285-8ec8-4a8c-be37-31d505016be7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:57.399184Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:42:57Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c724230d-9494-4e38-b71d-a3a431bdd38e",
  "quote_id": "42afc285-8ec8-4a8c-be37-31d505016be7",
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
  "pickup_at": "2026-10-29T17:42:57Z"
}
```

```json
{
  "id": "f647210e-c5a3-4204-bf42-98434ec27757",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:42:57.692078Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:42:57Z",
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
  "command_id": "8b60aa92-eab4-45b9-829e-705a4ee1ca3f",
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
  "id": "bd695d14-f140-4f1e-aa9f-466e29876724",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:47:58.009328Z",
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
  "command_id": "7143f26e-2eec-40b6-ad63-872249226dc4",
  "quote_id": "bd695d14-f140-4f1e-aa9f-466e29876724",
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
  "correlation_id": "647d7297-8adb-4ab6-83f2-3fcd8505b80e"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f647210e-c5a3-4204-bf42-98434ec27757",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T14:42:57.692078Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T17:42:57Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "2d0adff9-174c-43c0-a4e5-d74bc8d79e12",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T14:42:57.082381Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "03edcd9f-57fb-4070-b742-2d3f63986817",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "2d0adff9-174c-43c0-a4e5-d74bc8d79e12",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:42:57.082381Z",
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

`GET /api/rider/v1/orders/03edcd9f-57fb-4070-b742-2d3f63986817` → **200**

```json
{
  "id": "03edcd9f-57fb-4070-b742-2d3f63986817",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "784bd4a9-ea61-45db-ad9f-20f6b62dbc1f",
    "order_id": "03edcd9f-57fb-4070-b742-2d3f63986817",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "386de9d6-5cdf-4edb-8694-ce895627e381",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:42:55.644871Z",
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
    "location_at": "2026-10-29T14:42:54.463575Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/03edcd9f-57fb-4070-b742-2d3f63986817/cancel` → **200**

```json
{
  "command_id": "9f5ef406-0e6d-40d6-a4b0-26f24ce63f7c",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "03edcd9f-57fb-4070-b742-2d3f63986817",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "784bd4a9-ea61-45db-ad9f-20f6b62dbc1f",
    "order_id": "03edcd9f-57fb-4070-b742-2d3f63986817",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "386de9d6-5cdf-4edb-8694-ce895627e381",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:42:55.644871Z",
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

`GET /api/rider/v1/orders/2d0adff9-174c-43c0-a4e5-d74bc8d79e12` → **200**

```json
{
  "id": "2d0adff9-174c-43c0-a4e5-d74bc8d79e12",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:42:57.082381Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2d0adff9-174c-43c0-a4e5-d74bc8d79e12/cancel` → **200**

```json
{
  "command_id": "269b393d-7a34-431c-916a-28c0a382a1cc",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2d0adff9-174c-43c0-a4e5-d74bc8d79e12",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:42:57.082381Z",
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

`GET /api/rider/v1/orders/f647210e-c5a3-4204-bf42-98434ec27757` → **200**

```json
{
  "id": "f647210e-c5a3-4204-bf42-98434ec27757",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:42:57.692078Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:42:57Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f647210e-c5a3-4204-bf42-98434ec27757/cancel` → **200**

```json
{
  "command_id": "b922f05f-6c96-4830-b8f2-04fab4ec962b",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f647210e-c5a3-4204-bf42-98434ec27757",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "64a6a44d-3b35-422d-bc85-616fefcba997",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:42:57.692078Z",
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
  "pickup_at": "2026-10-29T17:42:57Z",
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
  "session_id": "02d8c59a-56a9-481f-9d98-73e3d02c1aca",
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
  "last_heartbeat_at": "2026-10-29T14:42:54.463575Z",
  "last_location_at": "2026-10-29T14:42:54.463575Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/02d8c59a-56a9-481f-9d98-73e3d02c1aca/close` → **200**

```json
{
  "command_id": "0109721c-fe09-4ffd-834f-55adbd413e00",
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

Done: orders 03edcd9f-57fb-4070-b742-2d3f63986817, 2d0adff9-174c-43c0-a4e5-d74bc8d79e12, f647210e-c5a3-4204-bf42-98434ec27757.

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
  "session_id": "d190e06e-fdf0-4829-b08b-2358c1669a02",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4ODEsImlhdCI6MTc5MzI4NDk4MSwianRpIjoiMWNjMzg5ZGItOTZjZS00MTBlLThhZjctMTE5ZDBiZjYzOGZlIiwic2lkIjoiZDE5MGUwNmUtZmRmMC00ODI5LWIwOGItMjM1OGMxNjY5YTAyIn0.-GyWb4GX_JfSxqgt3gSWHVgnlUHf_vTp3B-xFzlOi18",
  "access_expires_at": "2026-10-29T14:58:01.90889417Z",
  "refresh_token": "XkrKJ-KKmoNVeHcz3AyZcMt5C5XReccSjULQQqmKNNI",
  "refresh_expires_at": "2026-10-30T02:43:01.908092108Z",
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
  "session_id": "d3e33450-676f-450e-8fbf-9ca7f2666331",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU4ODIsImlhdCI6MTc5MzI4NDk4MiwianRpIjoiOWNhNTNmNTctZWNkMC00Njc0LWIzN2EtMTQ4Yzc3OTk3ZWYzIiwic2lkIjoiZDNlMzM0NTAtNjc2Zi00NTBlLThmYmYtOWNhN2YyNjY2MzMxIn0.yTvIRu_w01auK6f4B6rBRnsqLuEBNdfyy-Az5127NLE",
  "access_expires_at": "2026-10-29T14:58:02.484831884Z",
  "refresh_token": "w4PHyyXHmQiK77W_psEMWfFJXGfyJI2rhs2_J5O2ZLg",
  "refresh_expires_at": "2026-10-30T02:43:02.48430095Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13757"
}
```

```json
{
  "challenge_id": "d3bb9b99-54c4-4051-b79d-666011cf6f77",
  "expires_at": "2026-10-29T14:48:02.751163682Z",
  "resend_available_at": "2026-10-29T14:43:03.751163682Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "338412",
  "sent_at": "2026-10-29T14:43:02.753643166Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3bb9b99-54c4-4051-b79d-666011cf6f77",
  "code": "338412",
  "device_ref": "sandbox-13757"
}
```

```json
{
  "session_id": "f2fe5287-9e96-4ea9-9b78-8d367a948b66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTg4MywiaWF0IjoxNzkzMjg0OTgzLCJqdGkiOiI3YTU3N2VjMy0yODgyLTRmNjUtYWEzOS0yNTg2MjUwZmQ4MjAiLCJzaWQiOiJmMmZlNTI4Ny05ZTk2LTRlYTktOWI3OC04ZDM2N2E5NDhiNjYifQ.H4_IWYgIMojjpBvq9YfqTNZet8e5MEy-x1kDhJOASK8",
  "access_expires_at": "2026-10-29T14:58:03.054704576Z",
  "refresh_token": "WBm3j1PWButuiyC6Ya34A8qFZ3QqJR2Av1gdZ8GFYto",
  "refresh_expires_at": "2026-11-28T14:43:03.0540134Z",
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
  "command_id": "a74026f0-022a-4069-84e7-a4cc8c9a7f8c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:03Z",
    "sequence": 1793284983613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e31685c7-4a0b-45b7-8346-c874531e01e8",
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
  "last_heartbeat_at": "2026-10-29T14:43:03.631321Z",
  "last_location_at": "2026-10-29T14:43:03.631321Z",
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
  "command_id": "9849e20f-1ea3-48f0-9f99-e094d3effdc4",
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
  "effective_at": "2026-10-29T14:43:04.224676Z",
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T14:40:25.864652Z",
  "last_entries": [
    {
      "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:40:25.864652Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ca131b90-1cc2-42ee-b023-1e5347e28a75",
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
  "id": "84c007f3-73d2-4873-a2a6-658156d4e27d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:04.803543Z",
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
  "command_id": "c2ba7fe1-4e52-47d9-aed7-12a5058c1a22",
  "quote_id": "84c007f3-73d2-4873-a2a6-658156d4e27d",
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
    "phone": "+380671112699"
  }
}
```

```json
{
  "id": "78a2435e-5718-4f29-a16e-3034b6d044fa",
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
  "created_at": "2026-10-29T14:43:05.097409Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112699"
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
    "id": "88bb34b2-3ac3-43f1-b189-c911602a10d0",
    "order_id": "78a2435e-5718-4f29-a16e-3034b6d044fa",
    "expires_at": "2026-10-29T14:43:20.101269Z",
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

`POST /api/driver/v1/offers/88bb34b2-3ac3-43f1-b189-c911602a10d0/accept` → **200**

```json
{
  "command_id": "0547f01b-f2da-4744-883d-983052612eac"
}
```

```json
{
  "id": "a8fe873f-16ce-4b26-9a6e-edf545a320f2",
  "order_id": "78a2435e-5718-4f29-a16e-3034b6d044fa",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3f8921c7-8920-4184-a030-1f705b0ddae7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3f8921c7-8920-4184-a030-1f705b0ddae7",
  "order_id": "78a2435e-5718-4f29-a16e-3034b6d044fa",
  "assignment_id": "a8fe873f-16ce-4b26-9a6e-edf545a320f2",
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
    "phone": "+380671112699"
  }
}
```

`POST /api/driver/v1/work-sessions/e31685c7-4a0b-45b7-8346-c874531e01e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:06Z",
    "sequence": 1793284986238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e31685c7-4a0b-45b7-8346-c874531e01e8",
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
  "last_heartbeat_at": "2026-10-29T14:43:06.257201Z",
  "last_location_at": "2026-10-29T14:43:06.257201Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3f8921c7-8920-4184-a030-1f705b0ddae7/arrive` → **200**

```json
{
  "command_id": "35e3a50d-a9be-4428-99f7-6a9a9edae0c2",
  "expected_version": 0
}
```

```json
{
  "id": "3f8921c7-8920-4184-a030-1f705b0ddae7",
  "order_id": "78a2435e-5718-4f29-a16e-3034b6d044fa",
  "assignment_id": "a8fe873f-16ce-4b26-9a6e-edf545a320f2",
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
  "arrived_at": "2026-10-29T14:43:06.55823Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112699"
  }
}
```

`POST /api/driver/v1/trips/3f8921c7-8920-4184-a030-1f705b0ddae7/start` → **200**

```json
{
  "command_id": "1bd17f36-623f-4cdc-9466-86d4bc05ecdd",
  "expected_version": 1
}
```

```json
{
  "id": "3f8921c7-8920-4184-a030-1f705b0ddae7",
  "order_id": "78a2435e-5718-4f29-a16e-3034b6d044fa",
  "assignment_id": "a8fe873f-16ce-4b26-9a6e-edf545a320f2",
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
  "arrived_at": "2026-10-29T14:43:06.55823Z",
  "started_at": "2026-10-29T14:43:06.85602Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112699"
  }
}
```

`POST /api/driver/v1/trips/3f8921c7-8920-4184-a030-1f705b0ddae7/complete` → **200**

```json
{
  "command_id": "8c2b268c-1db2-4156-9e20-806be1d1402a",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:43:07Z",
  "cash_received": true
}
```

```json
{
  "id": "3f8921c7-8920-4184-a030-1f705b0ddae7",
  "order_id": "78a2435e-5718-4f29-a16e-3034b6d044fa",
  "assignment_id": "a8fe873f-16ce-4b26-9a6e-edf545a320f2",
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
  "arrived_at": "2026-10-29T14:43:06.55823Z",
  "started_at": "2026-10-29T14:43:06.85602Z",
  "completed_at": "2026-10-29T14:43:07.152778Z",
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
  "command_id": "20d4ab09-4f69-448f-b080-2bd28984c8df",
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
  "id": "bc79d4a3-fd1a-480d-9dd0-42911f86ce54",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:07.446677Z",
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
  "command_id": "bd114583-d473-4e4c-82e8-33f8530ae2a1",
  "quote_id": "bc79d4a3-fd1a-480d-9dd0-42911f86ce54",
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
    "phone": "+380671115518"
  }
}
```

```json
{
  "id": "df1ffa0a-7f7b-4db0-b43a-3453ec5d0bac",
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
  "created_at": "2026-10-29T14:43:07.748Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115518"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/df1ffa0a-7f7b-4db0-b43a-3453ec5d0bac` → **200**

```json
{
  "id": "df1ffa0a-7f7b-4db0-b43a-3453ec5d0bac",
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
  "created_at": "2026-10-29T14:43:07.748Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115518"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/df1ffa0a-7f7b-4db0-b43a-3453ec5d0bac/cancel` → **200**

```json
{
  "command_id": "9126d7ad-aba4-495d-971d-1be2b3540a51",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "df1ffa0a-7f7b-4db0-b43a-3453ec5d0bac",
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
  "created_at": "2026-10-29T14:43:07.748Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115518"
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
  "staff_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T14:40:25.864652Z",
  "last_entries": [
    {
      "order_id": "df1ffa0a-7f7b-4db0-b43a-3453ec5d0bac",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T14:43:08.383652Z"
    },
    {
      "order_id": "78a2435e-5718-4f29-a16e-3034b6d044fa",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T14:43:07.157667Z"
    },
    {
      "order_id": "949727c1-6b19-4031-9eaa-491a49c24f41",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:40:25.864652Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e31685c7-4a0b-45b7-8346-c874531e01e8",
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
  "last_heartbeat_at": "2026-10-29T14:43:06.257201Z",
  "last_location_at": "2026-10-29T14:43:06.257201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e31685c7-4a0b-45b7-8346-c874531e01e8/close` → **200**

```json
{
  "command_id": "c6b65d0f-8ac4-48bb-8677-d068639a2640",
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

Done: operator bonus for fulfilled 78a2435e-5718-4f29-a16e-3034b6d044fa and operator-fault cancellation df1ffa0a-7f7b-4db0-b43a-3453ec5d0bac.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670361953",
  "device_ref": "sandbox-6261"
}
```

```json
{
  "challenge_id": "1e64b792-72f7-432e-9d71-ac5c7f0f5a1f",
  "expires_at": "2026-10-29T14:48:12.780975598Z",
  "resend_available_at": "2026-10-29T14:43:13.780975598Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670361953` → **200**

```json
{
  "phone": "+380670361953",
  "audience": "CLIENT",
  "code": "079332",
  "sent_at": "2026-10-29T14:43:12.783459978Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677152726",
  "device_ref": "sandbox-9775",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7357a271-b429-43dd-9195-293a085edc71",
  "expires_at": "2026-10-29T14:48:14.290010949Z",
  "resend_available_at": "2026-10-29T14:43:15.290010949Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677152726` → **200**

```json
{
  "phone": "+380677152726",
  "audience": "CLIENT",
  "code": "362699",
  "sent_at": "2026-10-29T14:43:14.292767872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677152726",
  "device_ref": "sandbox-13868",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2bbaa93f-d5d7-4b9f-8fbc-b964381eab70",
  "expires_at": "2026-10-29T14:48:15.833472733Z",
  "resend_available_at": "2026-10-29T14:43:16.833472733Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677152726` → **200**

```json
{
  "phone": "+380677152726",
  "audience": "CLIENT",
  "code": "874500",
  "sent_at": "2026-10-29T14:43:15.837214874Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675170000",
  "device_ref": "sandbox-17166"
}
```

```json
{
  "challenge_id": "b270bf02-09de-40f0-bd3a-65d9d207859f",
  "expires_at": "2026-10-29T14:48:17.360247322Z",
  "resend_available_at": "2026-10-29T14:43:18.360247322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675170000",
  "device_ref": "sandbox-31077"
}
```

```json
{
  "challenge_id": "20d79ac1-919c-4088-bf24-5f5befbed729",
  "expires_at": "2026-10-29T14:48:18.850182131Z",
  "resend_available_at": "2026-10-29T14:43:19.850182131Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675170000` → **200**

```json
{
  "phone": "+380675170000",
  "audience": "CLIENT",
  "code": "705909",
  "sent_at": "2026-10-29T14:43:18.853054916Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675170000",
  "device_ref": "sandbox-14328",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2ccc5c97-ce05-4184-8b97-931706afcb07",
  "expires_at": "2026-10-29T14:48:20.35924302Z",
  "resend_available_at": "2026-10-29T14:43:21.35924302Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675170000` → **200**

```json
{
  "phone": "+380675170000",
  "audience": "CLIENT",
  "code": "310277",
  "sent_at": "2026-10-29T14:43:20.362217558Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675170000",
  "device_ref": "sandbox-7132",
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
  "correlation_id": "23c7a0eb-de1a-46aa-9b0d-af3615c980b7",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000000067"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "9e75b299-93a0-4c41-98f0-f1c9f4c0c118"
}
```

`GET /sandbox/v1/otp?phone=%2B442000000067` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120021202"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "a7726bfe-e465-4f4f-81b4-d0293f994d4a"
}
```

`GET /sandbox/v1/otp?phone=%2B37120021202` → **404**

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
  "session_id": "d7cde845-2f07-49f6-900d-55fc7ba2464f",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MDMsImlhdCI6MTc5MzI4NTAwMywianRpIjoiMTFjODlhYjAtYjY5MS00NWU2LTlkMjAtYTc2ZmI3MTljNzk0Iiwic2lkIjoiZDdjZGU4NDUtMmYwNy00OWY2LTkwMGQtNTVmYzdiYTI0NjRmIn0.WSSUJTAAlOu4K3A3U5PBgrA4huIgA4Jmi8_QLtztEoQ",
  "access_expires_at": "2026-10-29T14:58:23.064466299Z",
  "refresh_token": "H5ev9ueJ2MOR5D-U_NCe7RwjPg9s0_tKTQGanoxCiWA",
  "refresh_expires_at": "2026-10-30T02:43:23.063899599Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675170000` → **200**

```json
{
  "deliveries": [
    {
      "id": "b3a6f201-3005-42ee-ae2e-1a7cfd282a24",
      "challenge_id": "2ccc5c97-ce05-4184-8b97-931706afcb07",
      "phone": "+380675170000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-cd24615d-ff27-4ad0-9773-fe76ee37d6aa",
      "error": null,
      "attempted_at": "2026-10-29T14:43:20.362502Z"
    },
    {
      "id": "ca577a60-5a46-4f66-8643-17654c33a12b",
      "challenge_id": "20d79ac1-919c-4088-bf24-5f5befbed729",
      "phone": "+380675170000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-361b17ab-aca8-49a6-9b32-e3f42fb3b24c",
      "error": null,
      "attempted_at": "2026-10-29T14:43:18.853488Z"
    },
    {
      "id": "370f7e98-6718-48bd-b0e3-1d52503597fe",
      "challenge_id": "b270bf02-09de-40f0-bd3a-65d9d207859f",
      "phone": "+380675170000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T14:43:17.363191Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675170000` → **200**

```json
{
  "phone": "+380675170000",
  "audience": "CLIENT",
  "code": "310277",
  "sent_at": "2026-10-29T14:43:20.362217558Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677152726` → **200**

```json
{
  "deliveries": [
    {
      "id": "3eb39ad0-3fdb-4a39-8eb1-addefe1546ba",
      "challenge_id": "2bbaa93f-d5d7-4b9f-8fbc-b964381eab70",
      "phone": "+380677152726",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-78856ea5-3936-40db-af8f-09cf0a810a52",
      "error": null,
      "attempted_at": "2026-10-29T14:43:15.837687Z"
    },
    {
      "id": "8a2e68ad-4fe3-4f77-a414-02345258dbe1",
      "challenge_id": "7357a271-b429-43dd-9195-293a085edc71",
      "phone": "+380677152726",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-492fec1d-69dd-4903-a8e2-e4e562c6d178",
      "error": null,
      "attempted_at": "2026-10-29T14:43:14.293303Z"
    }
  ]
}
```

Done: SMS to +380670361953; SMS then a call to +380677152726; a failed SMS, two calls and a refused third to +380675170000; +44 and +371 refused.

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
  "session_id": "e60f74c3-93d5-4a5d-bf3e-177b7f76e6e9",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MDQsImlhdCI6MTc5MzI4NTAwNCwianRpIjoiZTc1MjNiN2ItMmNlMC00Njg4LTkwY2EtY2EyOWQxMjE3YmIyIiwic2lkIjoiZTYwZjc0YzMtOTNkNS00YTVkLWJmM2UtMTc3YjdmNzZlNmU5In0.jIX7NYvKZrK2GhmpFkGtqfyb2L64ClnQrkJTQa2IXVc",
  "access_expires_at": "2026-10-29T14:58:24.246235968Z",
  "refresh_token": "tUjS9gQ-UjWPJ-fADl1EvbsNq6u0x3cGyytqFPh9Ytw",
  "refresh_expires_at": "2026-10-30T02:43:24.245500462Z",
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
  "session_id": "8e6501b1-73e3-4eb6-b030-8ea4e45d39d9",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MDQsImlhdCI6MTc5MzI4NTAwNCwianRpIjoiNWEzZWZhMDQtM2YzZi00YTY4LWIwMTQtNjM2NDQzMWIxOGNkIiwic2lkIjoiOGU2NTAxYjEtNzNlMy00ZWI2LWIwMzAtOGVhNGU0NWQzOWQ5In0.xi_ebcbecJl4Orvl1w84vmwx_DEUYT5VSxrFvrMnXe8",
  "access_expires_at": "2026-10-29T14:58:24.813018179Z",
  "refresh_token": "xkZwmYbI-WAlZStzLoiqCGY__VAI5d-gtADwx-s5PFs",
  "refresh_expires_at": "2026-10-30T02:43:24.81247062Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
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

`POST /api/admin/v1/staff-extensions/c8b8597d-0592-4ccb-98bd-39afee2dea7b` → **200**

```json
{
  "command_id": "3de0d37e-821f-4510-bc88-d54e657bfda4",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "04bcc356-f656-429d-bd76-6ed5d5811071",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:43:25.940392Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:43:25.940392Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a3b29355-0e2e-4f17-bf58-ae75f19cf705",
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
  "id": "721cdeab-065c-4500-8ca5-dd9b8f36b5da",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:26.499190Z",
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
  "command_id": "db2d591b-e24d-4b82-8276-cefb4e6f03ba",
  "quote_id": "721cdeab-065c-4500-8ca5-dd9b8f36b5da",
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
    "phone": "+380678730606"
  }
}
```

```json
{
  "id": "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f",
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
  "created_at": "2026-10-29T14:43:26.790991Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678730606"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/0810c14d-fb5a-4138-8e6a-d4f239cc1a8f/calls` → **201**

```json
{
  "command_id": "d928524f-368d-41e7-b98e-04ce611abe9f",
  "to": "CALLER"
}
```

```json
{
  "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "order_ids": [
    "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f"
  ],
  "started_at": "2026-10-29T14:43:27.119514Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/0810c14d-fb5a-4138-8e6a-d4f239cc1a8f/calls` → **201**

```json
{
  "command_id": "d928524f-368d-41e7-b98e-04ce611abe9f",
  "to": "CALLER"
}
```

```json
{
  "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "order_ids": [
    "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f"
  ],
  "started_at": "2026-10-29T14:43:27.119514Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678730606",
    "at": "2026-10-29T14:43:27.121995076Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.8960",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "fbd749ec-c56a-48c7-b120-3989b7404ea4"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=0810c14d-fb5a-4138-8e6a-d4f239cc1a8f` → **200**

```json
{
  "calls": [
    {
      "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [
        "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f"
      ],
      "started_at": "2026-10-29T14:43:27.119514Z",
      "answered_at": "2026-10-29T14:43:27.778793Z",
      "ended_at": "2026-10-29T14:43:27.800714Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0810c14d-fb5a-4138-8e6a-d4f239cc1a8f` → **200**

```json
{
  "calls": [
    {
      "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [
        "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f"
      ],
      "started_at": "2026-10-29T14:43:27.119514Z",
      "answered_at": "2026-10-29T14:43:27.778793Z",
      "ended_at": "2026-10-29T14:43:27.800714Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0810c14d-fb5a-4138-8e6a-d4f239cc1a8f` → **200**

```json
{
  "calls": [
    {
      "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [
        "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f"
      ],
      "started_at": "2026-10-29T14:43:27.119514Z",
      "answered_at": "2026-10-29T14:43:27.778793Z",
      "ended_at": "2026-10-29T14:43:27.800714Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0810c14d-fb5a-4138-8e6a-d4f239cc1a8f` → **200**

```json
{
  "calls": [
    {
      "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [
        "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f"
      ],
      "started_at": "2026-10-29T14:43:27.119514Z",
      "answered_at": "2026-10-29T14:43:27.778793Z",
      "ended_at": "2026-10-29T14:43:27.800714Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=0810c14d-fb5a-4138-8e6a-d4f239cc1a8f` → **200**

```json
{
  "calls": [
    {
      "id": "fbd749ec-c56a-48c7-b120-3989b7404ea4",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "order_ids": [
        "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f"
      ],
      "started_at": "2026-10-29T14:43:27.119514Z",
      "answered_at": "2026-10-29T14:43:27.778793Z",
      "ended_at": "2026-10-29T14:43:27.800714Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:43:36.38573Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/0810c14d-fb5a-4138-8e6a-d4f239cc1a8f` → **200**

```json
{
  "id": "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f",
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
  "created_at": "2026-10-29T14:43:26.790991Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678730606"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0810c14d-fb5a-4138-8e6a-d4f239cc1a8f/cancel` → **200**

```json
{
  "command_id": "fa9d8d06-d23b-4d85-b292-f8f109b777d4",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0810c14d-fb5a-4138-8e6a-d4f239cc1a8f",
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
  "created_at": "2026-10-29T14:43:26.790991Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678730606"
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
  "command_id": "89748229-bccd-41e7-a543-3c58c5297cf5",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T14:43:37.901783Z",
  "extension": "101"
}
```

Done: outgoing call fbd749ec-c56a-48c7-b120-3989b7404ea4 from order 0810c14d-fb5a-4138-8e6a-d4f239cc1a8f, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635614610",
  "device_ref": "sandbox-10934"
}
```

```json
{
  "challenge_id": "070cb6cf-ee45-4c8f-be64-5c45e6fc5c72",
  "expires_at": "2026-10-29T14:48:38.19888073Z",
  "resend_available_at": "2026-10-29T14:43:39.19888073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635614610` → **200**

```json
{
  "phone": "+380635614610",
  "audience": "CLIENT",
  "code": "970374",
  "sent_at": "2026-10-29T14:43:38.201766601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "070cb6cf-ee45-4c8f-be64-5c45e6fc5c72",
  "code": "970374",
  "device_ref": "sandbox-10934"
}
```

```json
{
  "session_id": "cbdedbea-b528-4eed-b6a5-90d4fbc61109",
  "subject": {
    "type": "CLIENT",
    "id": "35ac8b77-938b-487e-84d8-395d16498ac5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNWFjOGI3Ny05MzhiLTQ4N2UtODRkOC0zOTVkMTY0OThhYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTE4LCJpYXQiOjE3OTMyODUwMTgsImp0aSI6IjQ5NTdlZjFlLTU5MTAtNDViZS1iMmFhLWE2NTc2Y2ZhZjQ1MiIsInNpZCI6ImNiZGVkYmVhLWI1MjgtNGVlZC1iNmE1LTkwZDRmYmM2MTEwOSJ9.jYqL1YSfjYeM8OO4URoxDwIFLmkJ2nzQDEQ-HwPAZ74",
  "access_expires_at": "2026-10-29T14:58:38.508605552Z",
  "refresh_token": "oeeFwg9ajDBdqiAAgeoSBdLNgAsyAWerW0WYVZCLTE4",
  "refresh_expires_at": "2026-11-28T14:43:38.508051124Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "35ac8b77-938b-487e-84d8-395d16498ac5",
  "session_id": "cbdedbea-b528-4eed-b6a5-90d4fbc61109",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635614610",
  "device_ref": "sandbox-13061"
}
```

```json
{
  "challenge_id": "23f29a8b-68c9-47ca-b47a-586104ffc157",
  "expires_at": "2026-10-29T14:48:41.091985335Z",
  "resend_available_at": "2026-10-29T14:43:42.091985335Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635614610` → **200**

```json
{
  "phone": "+380635614610",
  "audience": "CLIENT",
  "code": "169191",
  "sent_at": "2026-10-29T14:43:41.094252899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23f29a8b-68c9-47ca-b47a-586104ffc157",
  "code": "169191",
  "device_ref": "sandbox-13061"
}
```

```json
{
  "session_id": "c1149540-fdfb-418f-8d97-22d12043172e",
  "subject": {
    "type": "CLIENT",
    "id": "35ac8b77-938b-487e-84d8-395d16498ac5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNWFjOGI3Ny05MzhiLTQ4N2UtODRkOC0zOTVkMTY0OThhYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTIxLCJpYXQiOjE3OTMyODUwMjEsImp0aSI6ImFlNWJjMjYwLTUxYjItNGJlMy1iMDU3LTVjYjIxM2FhMDQ1NCIsInNpZCI6ImMxMTQ5NTQwLWZkZmItNDE4Zi04ZDk3LTIyZDEyMDQzMTcyZSJ9.pTH978q3vNKwhhqI_5dUZzMcz6ysNz3kvFtoJarZWQg",
  "access_expires_at": "2026-10-29T14:58:41.398268426Z",
  "refresh_token": "xRd2kn5FNzOQokkQg6sOn1-reLEqBZuiUFulJI2KrEM",
  "refresh_expires_at": "2026-11-28T14:43:41.397476221Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "3bee76fc-4ded-43c3-b300-7b9736849140",
  "expires_at": "2026-10-29T14:48:43.687375403Z",
  "resend_available_at": "2026-10-29T14:43:44.687375403Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635614610` → **200**

```json
{
  "phone": "+380635614610",
  "audience": "CLIENT",
  "code": "538238",
  "sent_at": "2026-10-29T14:43:43.690218344Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380635612777"
}
```

```json
{
  "challenge_id": "2ef76e2c-4ade-4a9a-a278-cd75232e5228",
  "expires_at": "2026-10-29T14:48:44.006452298Z",
  "resend_available_at": "2026-10-29T14:43:45.006452298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635612777` → **200**

```json
{
  "phone": "+380635612777",
  "audience": "CLIENT",
  "code": "980332",
  "sent_at": "2026-10-29T14:43:44.008568057Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "a67e92fc-d4ea-4fc9-b159-63f301c3667e",
  "current_challenge_id": "3bee76fc-4ded-43c3-b300-7b9736849140",
  "current_code": "000000",
  "new_challenge_id": "2ef76e2c-4ade-4a9a-a278-cd75232e5228",
  "new_code": "980332"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "c5aa44bc-5ab9-42fc-b1dc-5474d7f965f9"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "2225d191-71cf-472c-8a6d-59899b1b3509",
  "current_challenge_id": "3bee76fc-4ded-43c3-b300-7b9736849140",
  "current_code": "538238",
  "new_challenge_id": "2ef76e2c-4ade-4a9a-a278-cd75232e5228",
  "new_code": "980332"
}
```

```json
{
  "subject_id": "35ac8b77-938b-487e-84d8-395d16498ac5",
  "phone": "+380635612777",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "35ac8b77-938b-487e-84d8-395d16498ac5",
  "session_id": "cbdedbea-b528-4eed-b6a5-90d4fbc61109",
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
  "correlation_id": "12bbc574-c00c-49ed-ada8-e956d81ed022"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635612777",
  "device_ref": "sandbox-26342"
}
```

```json
{
  "challenge_id": "15bd37c8-ad95-45c5-9350-45bc1cf3873f",
  "expires_at": "2026-10-29T14:48:47.440156986Z",
  "resend_available_at": "2026-10-29T14:43:48.440156986Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635612777` → **200**

```json
{
  "phone": "+380635612777",
  "audience": "CLIENT",
  "code": "649301",
  "sent_at": "2026-10-29T14:43:47.44278765Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15bd37c8-ad95-45c5-9350-45bc1cf3873f",
  "code": "649301",
  "device_ref": "sandbox-26342"
}
```

```json
{
  "session_id": "6750f389-c5c4-4636-b75a-62bc13fbfa83",
  "subject": {
    "type": "CLIENT",
    "id": "35ac8b77-938b-487e-84d8-395d16498ac5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNWFjOGI3Ny05MzhiLTQ4N2UtODRkOC0zOTVkMTY0OThhYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTI3LCJpYXQiOjE3OTMyODUwMjcsImp0aSI6ImMxMzY5NTQ0LTFkZjctNDZmMS1hOTY0LWY0NzBmNTAxODFmNyIsInNpZCI6IjY3NTBmMzg5LWM1YzQtNDYzNi1iNzVhLTYyYmMxM2ZiZmE4MyJ9.s12xqNQEH0SwmADKZZAIV9-1cUHK7LGgy_qTgQKLvHg",
  "access_expires_at": "2026-10-29T14:58:47.747725134Z",
  "refresh_token": "bVhpA6CDQs95QXEcJ9Vot6boKsVYSkIjillJ0uqJ7Ok",
  "refresh_expires_at": "2026-11-28T14:43:47.747195373Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "35ac8b77-938b-487e-84d8-395d16498ac5",
  "session_id": "6750f389-c5c4-4636-b75a-62bc13fbfa83",
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
  "session_id": "9673f54a-ece7-4cb3-8a7d-df12ea8f2e91",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MjgsImlhdCI6MTc5MzI4NTAyOCwianRpIjoiNGFkYzVlOTktY2E4OC00N2I3LTlkYzUtNzk4MzFlM2FhMGNhIiwic2lkIjoiOTY3M2Y1NGEtZWNlNy00Y2IzLThhN2QtZGYxMmVhOGYyZTkxIn0.z4OzTlSHbH8tncLZhkJ0U8YZ77RbRwEBVAKPH4rO2SE",
  "access_expires_at": "2026-10-29T14:58:48.600066693Z",
  "refresh_token": "aaT1yClD_wmqUmDyLT_ZuytK1LdsopOtRsAUzG4tXbs",
  "refresh_expires_at": "2026-10-30T02:43:48.59955743Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/35ac8b77-938b-487e-84d8-395d16498ac5` → **200**

```json
{
  "client": {
    "id": "35ac8b77-938b-487e-84d8-395d16498ac5",
    "phone": "+380635612777",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:43:38.506534Z",
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

`POST /api/admin/v1/clients/35ac8b77-938b-487e-84d8-395d16498ac5/phone/new-code` → **201**

```json
{
  "phone": "+380635158259"
}
```

```json
{
  "challenge_id": "bfe76883-7e68-46d9-a42a-0b85398e42b3",
  "expires_at": "2026-10-29T14:48:49.228982763Z",
  "resend_available_at": "2026-10-29T14:43:50.228982763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635158259` → **200**

```json
{
  "phone": "+380635158259",
  "audience": "CLIENT",
  "code": "353931",
  "sent_at": "2026-10-29T14:43:49.231961612Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/35ac8b77-938b-487e-84d8-395d16498ac5/phone` → **422**

```json
{
  "command_id": "695ea072-e54b-47dd-a264-5e6634d4a4d8",
  "expected_version": 3,
  "new_challenge_id": "bfe76883-7e68-46d9-a42a-0b85398e42b3",
  "new_code": "353932",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/35ac8b77-938b-487e-84d8-395d16498ac5/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e2e4bd4b-4ea3-43b1-a3d1-9327fcddffa8"
}
```

`POST /api/admin/v1/clients/35ac8b77-938b-487e-84d8-395d16498ac5/phone` → **400**

```json
{
  "command_id": "00f9cb94-2367-4843-ac64-b8dff21405f9",
  "expected_version": 3,
  "new_challenge_id": "bfe76883-7e68-46d9-a42a-0b85398e42b3",
  "new_code": "353931",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/35ac8b77-938b-487e-84d8-395d16498ac5/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b372077a-0f00-4f26-86dd-344cae44c973",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/35ac8b77-938b-487e-84d8-395d16498ac5/phone` → **200**

```json
{
  "command_id": "c0463a64-e4b9-4780-acdf-a63c404b5816",
  "expected_version": 3,
  "new_challenge_id": "bfe76883-7e68-46d9-a42a-0b85398e42b3",
  "new_code": "353931",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "35ac8b77-938b-487e-84d8-395d16498ac5",
  "phone": "+380635158259",
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
  "correlation_id": "dba908b7-3d3d-47e4-b2a0-cbac5587dcfd"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635158259",
  "device_ref": "sandbox-14734"
}
```

```json
{
  "challenge_id": "fafec82f-00c2-4b4f-802b-c28e4a241fe4",
  "expires_at": "2026-10-29T14:48:50.684657305Z",
  "resend_available_at": "2026-10-29T14:43:51.684657305Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635158259` → **200**

```json
{
  "phone": "+380635158259",
  "audience": "CLIENT",
  "code": "278220",
  "sent_at": "2026-10-29T14:43:50.687169196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fafec82f-00c2-4b4f-802b-c28e4a241fe4",
  "code": "278220",
  "device_ref": "sandbox-14734"
}
```

```json
{
  "session_id": "6f9a38dd-048b-47d0-a40b-1081002e36c4",
  "subject": {
    "type": "CLIENT",
    "id": "35ac8b77-938b-487e-84d8-395d16498ac5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNWFjOGI3Ny05MzhiLTQ4N2UtODRkOC0zOTVkMTY0OThhYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTMwLCJpYXQiOjE3OTMyODUwMzAsImp0aSI6IjllMmUyMzQ5LTNiOTYtNGY0ZS04NjFkLWI2ZGY5YzQ2ZGFmYiIsInNpZCI6IjZmOWEzOGRkLTA0OGItNDdkMC1hNDBiLTEwODEwMDJlMzZjNCJ9.61Xlr1gxrPal31rGTrRq-IHxWvF0fDCeiOBDhhx2Uqk",
  "access_expires_at": "2026-10-29T14:58:50.99970222Z",
  "refresh_token": "Z6zaIeoDFKIvv463sGsEE0Uu3wLeGTVr92ktqO05wcI",
  "refresh_expires_at": "2026-11-28T14:43:50.99907225Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "35ac8b77-938b-487e-84d8-395d16498ac5",
  "session_id": "6f9a38dd-048b-47d0-a40b-1081002e36c4",
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
  "phone": "+380637869903",
  "device_ref": "sandbox-30185"
}
```

```json
{
  "challenge_id": "c2d6b39f-6b48-4485-adcf-3d133035319f",
  "expires_at": "2026-10-29T14:48:51.554727325Z",
  "resend_available_at": "2026-10-29T14:43:52.554727325Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637869903` → **200**

```json
{
  "phone": "+380637869903",
  "audience": "CLIENT",
  "code": "395342",
  "sent_at": "2026-10-29T14:43:51.557309328Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2d6b39f-6b48-4485-adcf-3d133035319f",
  "code": "395342",
  "device_ref": "sandbox-30185"
}
```

```json
{
  "session_id": "9df8e5b2-6740-43d2-a0ad-4af34dbd9f67",
  "subject": {
    "type": "CLIENT",
    "id": "d59e36d8-7897-4a1e-af23-be4f85957c47"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTllMzZkOC03ODk3LTRhMWUtYWYyMy1iZTRmODU5NTdjNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTMxLCJpYXQiOjE3OTMyODUwMzEsImp0aSI6IjcyYWE2M2RiLWE4NDUtNDg5OC04ZTZjLWE3NTQxMDdjMTA5MSIsInNpZCI6IjlkZjhlNWIyLTY3NDAtNDNkMi1hMGFkLTRhZjM0ZGJkOWY2NyJ9.tN87OEtcWSKZIVCczyybhvKSHvVbbuVm0OGsm_SYSe8",
  "access_expires_at": "2026-10-29T14:58:51.86180086Z",
  "refresh_token": "0GRINnru8-_QGg4GLsaMqprSMlnKbSteZ-baenh-0Zk",
  "refresh_expires_at": "2026-11-28T14:43:51.861251542Z",
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
  "session_id": "e0f11bd0-927f-484d-9891-448d7d82b428",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MzMsImlhdCI6MTc5MzI4NTAzMywianRpIjoiYThlZjQ3YmYtMjZmYy00ZjIzLTg3MDUtNDUzYmQ3OTcxMzM1Iiwic2lkIjoiZTBmMTFiZDAtOTI3Zi00ODRkLTk4OTEtNDQ4ZDdkODJiNDI4In0._7ouaPeRjF1S0Y7Fx2onFBfxdgXWqLj1ZSshVckx2YM",
  "access_expires_at": "2026-10-29T14:58:53.022253632Z",
  "refresh_token": "aKKgWcQhSo6RqJSkThoUBAYWLjyXXHjzCnzc4tOlrmU",
  "refresh_expires_at": "2026-10-30T02:43:53.021652287Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637869903` → **200**

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
  "correlation_id": "11483f2b-f0e4-4f0c-af00-99e6f020a89e"
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
  "session_id": "e04d4e17-56eb-4462-8f40-56e0edcdfec5",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MzQsImlhdCI6MTc5MzI4NTAzNCwianRpIjoiNjQ5ODQ4NmYtODA5Mi00ODJjLWI2MTAtN2NjNDdjNzg3MGU0Iiwic2lkIjoiZTA0ZDRlMTctNTZlYi00NDYyLThmNDAtNTZlMGVkY2RmZWM1In0.4_9ftJt0sW7v0ed18PoUuEcsubUwy_weiipFaJ4dcS8",
  "access_expires_at": "2026-10-29T14:58:54.206015794Z",
  "refresh_token": "I9Z_2HT6qQI85ftQHvT6Cw8msQ5L-fTvepPbB7fN-nc",
  "refresh_expires_at": "2026-10-30T02:43:54.205467989Z",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:39:57.639162Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "39031b3f-d51b-4d5d-964c-16c3f433404b",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T14:43:54.79229843Z"
}
```

## The rider books the airport for 2026-10-29T17:43:53Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600022061",
  "device_ref": "sandbox-32683"
}
```

```json
{
  "challenge_id": "85733437-131a-4c65-a259-2e8fc360f03b",
  "expires_at": "2026-10-29T14:48:55.086159402Z",
  "resend_available_at": "2026-10-29T14:43:56.086159402Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600022061` → **200**

```json
{
  "phone": "+48600022061",
  "audience": "CLIENT",
  "code": "714605",
  "sent_at": "2026-10-29T14:43:55.088848848Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85733437-131a-4c65-a259-2e8fc360f03b",
  "code": "714605",
  "device_ref": "sandbox-32683"
}
```

```json
{
  "session_id": "8fe14bc7-0c52-452b-8032-5a74725b713a",
  "subject": {
    "type": "CLIENT",
    "id": "1a4668f1-7d0a-4fea-905f-02b84e971be7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTQ2NjhmMS03ZDBhLTRmZWEtOTA1Zi0wMmI4NGU5NzFiZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTM1LCJpYXQiOjE3OTMyODUwMzUsImp0aSI6ImM5NzdmOTU5LTAyZDgtNDJjOS04YjlhLTBjNGZjOTdmZDEyNyIsInNpZCI6IjhmZTE0YmM3LTBjNTItNDUyYi04MDMyLTVhNzQ3MjViNzEzYSJ9.GCdolTiaQthfQxjfH9nNYruPHjuxuxCO_xWonaIQcto",
  "access_expires_at": "2026-10-29T14:58:55.402057543Z",
  "refresh_token": "dNX-ZkyXoKaohTuWuVggNUgOcNaM1-sYCeLVs6hlW_M",
  "refresh_expires_at": "2026-11-28T14:43:55.40153278Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "af62b5ba-1615-446f-9c64-5ae3b2afb322",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T17:43:53Z"
}
```

```json
{
  "id": "9406eff4-2739-495c-87ae-b789136414bd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:48:55.686671Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:43:53Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9ad875cc-1cdc-48d9-a251-f17ea3476a72",
  "quote_id": "9406eff4-2739-495c-87ae-b789136414bd",
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
  "pickup_at": "2026-10-29T17:43:53Z"
}
```

```json
{
  "id": "a96ce3fd-236c-4e33-88f7-ec2e909911f5",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1a4668f1-7d0a-4fea-905f-02b84e971be7",
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
  "created_at": "2026-10-29T14:43:55.987475Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:43:53Z",
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
  "device_ref": "sandbox-4747"
}
```

```json
{
  "challenge_id": "ca32cbbc-af74-4652-bb1b-cb7b6598b7fe",
  "expires_at": "2026-10-29T14:48:56.298199763Z",
  "resend_available_at": "2026-10-29T14:43:57.298199763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "683216",
  "sent_at": "2026-10-29T14:43:56.300902015Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca32cbbc-af74-4652-bb1b-cb7b6598b7fe",
  "code": "683216",
  "device_ref": "sandbox-4747"
}
```

```json
{
  "session_id": "d6afda6d-3bd2-4dc5-bfac-cb71730688ce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTkzNiwiaWF0IjoxNzkzMjg1MDM2LCJqdGkiOiJlOGU3NTg3NC00ZTMwLTQxYzUtOTZlMy0xZGY0YTM4ZTUyZDgiLCJzaWQiOiJkNmFmZGE2ZC0zYmQyLTRkYzUtYmZhYy1jYjcxNzMwNjg4Y2UifQ.0F_fr7xmnBlRWXrLD0c-wqkLbYSl5UFjeGb69ZLQ6yo",
  "access_expires_at": "2026-10-29T14:58:56.617459489Z",
  "refresh_token": "gPOYfikfMaF7uUz3vOwoLlhv4Tt-mv4JZKhXs0o8T1o",
  "refresh_expires_at": "2026-11-28T14:43:56.616813577Z",
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
  "command_id": "4a13eb15-444c-49b3-a728-7806b778a47b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:43:57Z",
    "sequence": 1793285037171
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ea7fb53c-68fe-4ad7-9eb0-e3b430d0ab44",
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
  "last_heartbeat_at": "2026-10-29T14:43:57.190171Z",
  "last_location_at": "2026-10-29T14:43:57.190171Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "a96ce3fd-236c-4e33-88f7-ec2e909911f5",
      "short_number": 24,
      "pickup_at": "2026-10-29T17:43:53Z",
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

`POST /api/driver/v1/preorders/a96ce3fd-236c-4e33-88f7-ec2e909911f5/reserve` → **200**

```json
{
  "command_id": "8db46164-9947-4faf-a47f-d4aef9bfac8f"
}
```

```json
{
  "id": "858e0c28-8b54-464b-88a6-fe01aba08022",
  "state": "RESERVED",
  "order": {
    "order_id": "a96ce3fd-236c-4e33-88f7-ec2e909911f5",
    "short_number": 24,
    "pickup_at": "2026-10-29T17:43:53Z",
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
  "reserved_at": "2026-10-29T14:43:57.762572Z",
  "confirm_from": "2026-10-29T17:13:53Z",
  "confirm_until": "2026-10-29T17:23:53Z",
  "drop_until": "2026-10-29T16:43:53Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "858e0c28-8b54-464b-88a6-fe01aba08022",
      "state": "RESERVED",
      "order": {
        "order_id": "a96ce3fd-236c-4e33-88f7-ec2e909911f5",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:43:53Z",
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
      "reserved_at": "2026-10-29T14:43:57.762572Z",
      "confirm_from": "2026-10-29T17:13:53Z",
      "confirm_until": "2026-10-29T17:23:53Z",
      "drop_until": "2026-10-29T16:43:53Z"
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
      "id": "858e0c28-8b54-464b-88a6-fe01aba08022",
      "state": "RESERVED",
      "order": {
        "order_id": "a96ce3fd-236c-4e33-88f7-ec2e909911f5",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:43:53Z",
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
      "reserved_at": "2026-10-29T14:43:57.762572Z",
      "confirm_from": "2026-10-29T17:13:53Z",
      "confirm_until": "2026-10-29T17:23:53Z",
      "drop_until": "2026-10-29T16:43:53Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/858e0c28-8b54-464b-88a6-fe01aba08022/confirm` → **409**

```json
{
  "command_id": "63727535-a59c-4d29-bfd4-ed74d6e6c8ea"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/858e0c28-8b54-464b-88a6-fe01aba08022/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ea1110d2-c53d-4ec2-9d94-d6c0dd6f8959"
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
  "session_id": "0b0cd16a-9885-4902-af06-3dd6e159fa2c",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5MzksImlhdCI6MTc5MzI4NTAzOSwianRpIjoiNTI2ZWU3OGItYmQzYi00ZWVhLTg1ZDgtZDJhNzc1OGE4NGU5Iiwic2lkIjoiMGIwY2QxNmEtOTg4NS00OTAyLWFmMDYtM2RkNmUxNTlmYTJjIn0.6Orpi5gzEteYTljWFFgSQpzqj3uzn4M2u59pUg01FL0",
  "access_expires_at": "2026-10-29T14:58:59.208204343Z",
  "refresh_token": "3odZV86MeKabzlbmgTHZsoUq7HySjG6aepTylvPbElI",
  "refresh_expires_at": "2026-10-30T02:43:59.207722952Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a96ce3fd-236c-4e33-88f7-ec2e909911f5` → **200**

```json
{
  "id": "a96ce3fd-236c-4e33-88f7-ec2e909911f5",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1a4668f1-7d0a-4fea-905f-02b84e971be7",
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
  "created_at": "2026-10-29T14:43:55.987475Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T17:43:53Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "858e0c28-8b54-464b-88a6-fe01aba08022",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T14:43:57.762572Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a96ce3fd-236c-4e33-88f7-ec2e909911f5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T14:43:55.988951Z",
      "actor": {
        "type": "CLIENT",
        "id": "1a4668f1-7d0a-4fea-905f-02b84e971be7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "a96ce3fd-236c-4e33-88f7-ec2e909911f5",
        "preorder": true,
        "quote_id": "9406eff4-2739-495c-87ae-b789136414bd",
        "pickup_at": "2026-10-29T17:43:53Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "cd735f0f-86b2-49d2-8d5a-44088337f8ac"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T14:43:57.763687Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a96ce3fd-236c-4e33-88f7-ec2e909911f5",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "858e0c28-8b54-464b-88a6-fe01aba08022"
      },
      "correlation_id": "27b9099a-ef42-46e3-bdd5-781d19201b12"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order a96ce3fd-236c-4e33-88f7-ec2e909911f5, reservation 858e0c28-8b54-464b-88a6-fe01aba08022.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1931"
}
```

```json
{
  "challenge_id": "41c0470e-b754-48b9-95e3-3f7809bb1af9",
  "expires_at": "2026-10-29T14:49:00.088553654Z",
  "resend_available_at": "2026-10-29T14:44:01.088553654Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "799389",
  "sent_at": "2026-10-29T14:44:00.091093317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41c0470e-b754-48b9-95e3-3f7809bb1af9",
  "code": "799389",
  "device_ref": "sandbox-1931"
}
```

```json
{
  "session_id": "eaceabfa-b122-4a22-95cc-32a44968344b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk0MCwiaWF0IjoxNzkzMjg1MDQwLCJqdGkiOiI3YjI5NjZhZS1kMTgxLTQyYmYtOGYyMS02ZTU5Y2E0M2YzNDMiLCJzaWQiOiJlYWNlYWJmYS1iMTIyLTRhMjItOTVjYy0zMmE0NDk2ODM0NGIifQ.__v9e5URTkhDS0GAR2LiymVAFk9OMnn058AnWp0vlQU",
  "access_expires_at": "2026-10-29T14:59:00.398008965Z",
  "refresh_token": "fTnoBHLi1Yg6SGK3p2YScnKnFhUgzqyTdMXAQ2XWDoA",
  "refresh_expires_at": "2026-11-28T14:44:00.397468537Z",
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
  "command_id": "17850b61-85cf-40d7-bec8-412cebd6729c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:00Z",
    "sequence": 1793285040977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edcfd250-1c5e-4b0a-901f-5307fd1f14c1",
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
  "last_heartbeat_at": "2026-10-29T14:44:00.996681Z",
  "last_location_at": "2026-10-29T14:44:00.996681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675302344",
  "device_ref": "sandbox-9235"
}
```

```json
{
  "challenge_id": "eb458b9f-1905-42f5-84e3-e0070acdae65",
  "expires_at": "2026-10-29T14:49:01.291357629Z",
  "resend_available_at": "2026-10-29T14:44:02.291357629Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675302344` → **200**

```json
{
  "phone": "+380675302344",
  "audience": "CLIENT",
  "code": "252740",
  "sent_at": "2026-10-29T14:44:01.293862147Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb458b9f-1905-42f5-84e3-e0070acdae65",
  "code": "252740",
  "device_ref": "sandbox-9235"
}
```

```json
{
  "session_id": "19eb4c94-464e-4a44-9ea4-c24fe8df97d2",
  "subject": {
    "type": "CLIENT",
    "id": "0dffaa19-55e6-464a-bd6f-78e8d4d7749a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZGZmYWExOS01NWU2LTQ2NGEtYmQ2Zi03OGU4ZDRkNzc0OWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTQxLCJpYXQiOjE3OTMyODUwNDEsImp0aSI6ImM0MzU0NDdiLWNjZjEtNGY5Mi04NDU1LTM1ZGM5YTM1NTY0YSIsInNpZCI6IjE5ZWI0Yzk0LTQ2NGUtNGE0NC05ZWE0LWMyNGZlOGRmOTdkMiJ9.0nh57ibH7xYmC5y9lzFlPh1J1-5NCCS6eXnii1UtluQ",
  "access_expires_at": "2026-10-29T14:59:01.608423574Z",
  "refresh_token": "muo5ywdT8cB9LjvLN3EL6lKXb--tnbg1XnRt9eYtMog",
  "refresh_expires_at": "2026-11-28T14:44:01.60771101Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3554ed8c-4718-45fd-8c69-eef4765c3c1c",
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
  "id": "c1bcf4e8-32ce-4b8e-a7dd-fa22d0380222",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:01.897258Z",
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
  "command_id": "8132aef8-9e01-42eb-9a1f-8408213f1f8a",
  "quote_id": "c1bcf4e8-32ce-4b8e-a7dd-fa22d0380222",
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
  "id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0dffaa19-55e6-464a-bd6f-78e8d4d7749a",
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
  "created_at": "2026-10-29T14:44:02.188761Z",
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
    "id": "ee1c46ef-a849-48a8-9fae-3628bf7bdad3",
    "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
    "expires_at": "2026-10-29T14:44:17.192415Z",
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

`POST /api/driver/v1/offers/ee1c46ef-a849-48a8-9fae-3628bf7bdad3/accept` → **200**

```json
{
  "command_id": "911f46ec-60d7-43a3-96d5-2010f797e29d"
}
```

```json
{
  "id": "3999bd6a-d751-4f75-8ff3-35a5522210a0",
  "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b2862d02-778b-45ec-8f61-ed8b4c1c0697",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2862d02-778b-45ec-8f61-ed8b4c1c0697",
  "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "assignment_id": "3999bd6a-d751-4f75-8ff3-35a5522210a0",
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

`POST /api/driver/v1/work-sessions/edcfd250-1c5e-4b0a-901f-5307fd1f14c1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:03Z",
    "sequence": 1793285043328
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edcfd250-1c5e-4b0a-901f-5307fd1f14c1",
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
  "last_heartbeat_at": "2026-10-29T14:44:03.346353Z",
  "last_location_at": "2026-10-29T14:44:03.346353Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b2862d02-778b-45ec-8f61-ed8b4c1c0697",
  "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "assignment_id": "3999bd6a-d751-4f75-8ff3-35a5522210a0",
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

`POST /api/driver/v1/trips/b2862d02-778b-45ec-8f61-ed8b4c1c0697/arrive` → **200**

```json
{
  "command_id": "9647b0f3-1b85-4370-a3fd-9619c32eede6",
  "expected_version": 0
}
```

```json
{
  "id": "b2862d02-778b-45ec-8f61-ed8b4c1c0697",
  "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "assignment_id": "3999bd6a-d751-4f75-8ff3-35a5522210a0",
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
  "arrived_at": "2026-10-29T14:44:03.887639Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b2862d02-778b-45ec-8f61-ed8b4c1c0697/start` → **200**

```json
{
  "command_id": "18a3e87f-0bb2-4edf-8efe-4f02318cec32",
  "expected_version": 1
}
```

```json
{
  "id": "b2862d02-778b-45ec-8f61-ed8b4c1c0697",
  "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "assignment_id": "3999bd6a-d751-4f75-8ff3-35a5522210a0",
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
  "arrived_at": "2026-10-29T14:44:03.887639Z",
  "started_at": "2026-10-29T14:44:04.191486Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/edcfd250-1c5e-4b0a-901f-5307fd1f14c1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:04Z",
    "sequence": 1793285044476
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edcfd250-1c5e-4b0a-901f-5307fd1f14c1",
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
  "last_heartbeat_at": "2026-10-29T14:44:04.494194Z",
  "last_location_at": "2026-10-29T14:44:04.494194Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b2862d02-778b-45ec-8f61-ed8b4c1c0697/complete` → **200**

```json
{
  "command_id": "5409d649-fd69-4113-8e91-3f5a2d3aa509",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:44:04Z",
  "cash_received": true
}
```

```json
{
  "id": "b2862d02-778b-45ec-8f61-ed8b4c1c0697",
  "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "assignment_id": "3999bd6a-d751-4f75-8ff3-35a5522210a0",
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
  "arrived_at": "2026-10-29T14:44:03.887639Z",
  "started_at": "2026-10-29T14:44:04.191486Z",
  "completed_at": "2026-10-29T14:44:04.782634Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/b56dadc0-430e-48bd-8363-6a71a110b027/rating` → **200**

```json
{
  "command_id": "9e371807-867d-41f1-8459-74ee731a9761",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "score": 5,
  "created_at": "2026-10-29T14:44:05.084939982Z"
}
```

`POST /api/driver/v1/orders/b56dadc0-430e-48bd-8363-6a71a110b027/rating` → **200**

```json
{
  "command_id": "57937fba-e910-4c96-9beb-8275506169c4",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
  "score": 4,
  "created_at": "2026-10-29T14:44:05.370890048Z"
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
  "session_id": "5a6f8a90-9a25-4d8d-bd75-7823e81759f7",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NDYsImlhdCI6MTc5MzI4NTA0NiwianRpIjoiZmJjN2M3OWQtYjYzYS00ZDJlLTgyMGUtODE0YTQyNDBjNTZmIiwic2lkIjoiNWE2ZjhhOTAtOWEyNS00ZDhkLWJkNzUtNzgyM2U4MTc1OWY3In0.CgCowgCC2VTDxyZCBpwkzFxw4_r2eP4-GJ03PO1IRIc",
  "access_expires_at": "2026-10-29T14:59:06.220305941Z",
  "refresh_token": "04gc8Pwx0uNbRS4msqjNb3in0lv75NKMMy1JlM8vQ-0",
  "refresh_expires_at": "2026-10-30T02:44:06.219759408Z",
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
  "session_id": "0b69bfea-e606-45e9-ab00-c373c82201db",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NDYsImlhdCI6MTc5MzI4NTA0NiwianRpIjoiMWEwMDhkZTAtMWY4Ny00NGQxLTk5ZTEtMWJmZGE3MzE3YjRlIiwic2lkIjoiMGI2OWJmZWEtZTYwNi00NWU5LWFiMDAtYzM3M2M4MjIwMWRiIn0.wYmTiyIRSkCq2YU37OtbciXubi-jWw0P_EgwicjPz6U",
  "access_expires_at": "2026-10-29T14:59:06.797028751Z",
  "refresh_token": "H-VDLdIL6vwt5l585JktXB779qXl5Q9fNdJX9-oIVZw",
  "refresh_expires_at": "2026-10-30T02:44:06.796439408Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b56dadc0-430e-48bd-8363-6a71a110b027/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
      "author_type": "RIDER",
      "author_id": "0dffaa19-55e6-464a-bd6f-78e8d4d7749a",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T14:44:05.08494Z"
    },
    {
      "order_id": "b56dadc0-430e-48bd-8363-6a71a110b027",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "0dffaa19-55e6-464a-bd6f-78e8d4d7749a",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T14:44:05.37089Z"
    }
  ]
}
```

Done: ratings for order b56dadc0-430e-48bd-8363-6a71a110b027.

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
  "session_id": "420e5e35-1a5f-430b-b628-2173a338ef99",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NDcsImlhdCI6MTc5MzI4NTA0NywianRpIjoiNjEzNjk1YTQtYmRiMi00YWQ2LTk0ZGQtM2JjYzhhZDdhZDY5Iiwic2lkIjoiNDIwZTVlMzUtMWE1Zi00MzBiLWI2MjgtMjE3M2EzMzhlZjk5In0.fDZrP0zgYmRk6kkktVxyC00ZQXUkNufekjnU4hWrIRk",
  "access_expires_at": "2026-10-29T14:59:07.659016871Z",
  "refresh_token": "oNDdUnAV6c10Z1ZN2AzQWMns-DIFuwsT2TKz7dyQEGw",
  "refresh_expires_at": "2026-10-30T02:44:07.658500648Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "582b8869-17f8-43b1-b341-4db255d717d4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "9315b34a-2f88-4c30-94af-5b86bf75359e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:07.944976Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9315b34a-2f88-4c30-94af-5b86bf75359e` → **200**

```json
{
  "id": "9315b34a-2f88-4c30-94af-5b86bf75359e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:07.944976Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9315b34a-2f88-4c30-94af-5b86bf75359e` → **200**

```json
{
  "id": "9315b34a-2f88-4c30-94af-5b86bf75359e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:07.944976Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9315b34a-2f88-4c30-94af-5b86bf75359e` → **200**

```json
{
  "id": "9315b34a-2f88-4c30-94af-5b86bf75359e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:07.944976Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9315b34a-2f88-4c30-94af-5b86bf75359e` → **200**

```json
{
  "id": "9315b34a-2f88-4c30-94af-5b86bf75359e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:44:07.944976Z",
  "ready_at": "2026-10-29T14:44:11.439528Z",
  "expires_at": "2026-10-30T14:44:11.439528Z"
}
```

`GET /api/admin/v1/reports/exports/9315b34a-2f88-4c30-94af-5b86bf75359e/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "47f7922f-0fff-4657-8327-32d8d81a9cfc",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "f486f1c2-4878-4d9e-be98-02454ca89209",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:12.376451Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f486f1c2-4878-4d9e-be98-02454ca89209` → **200**

```json
{
  "id": "f486f1c2-4878-4d9e-be98-02454ca89209",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:12.376451Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f486f1c2-4878-4d9e-be98-02454ca89209` → **200**

```json
{
  "id": "f486f1c2-4878-4d9e-be98-02454ca89209",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:12.376451Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f486f1c2-4878-4d9e-be98-02454ca89209` → **200**

```json
{
  "id": "f486f1c2-4878-4d9e-be98-02454ca89209",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:44:12.376451Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f486f1c2-4878-4d9e-be98-02454ca89209` → **200**

```json
{
  "id": "f486f1c2-4878-4d9e-be98-02454ca89209",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:44:12.376451Z",
  "ready_at": "2026-10-29T14:44:16.447463Z",
  "expires_at": "2026-10-30T14:44:16.447463Z"
}
```

`GET /api/admin/v1/reports/exports/f486f1c2-4878-4d9e-be98-02454ca89209/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/9d2b5f0c-9bbd-4126-8230-ecad9250dfdf` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/9d2b5f0c-9bbd-4126-8230-ecad9250dfdf",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0bd6dd14-3468-4541-be6e-493e13412305"
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
  "device_ref": "sandbox-13481"
}
```

```json
{
  "challenge_id": "ac7a1ee1-a7d1-48f1-b556-3f7653282cb1",
  "expires_at": "2026-10-29T14:49:17.105494419Z",
  "resend_available_at": "2026-10-29T14:44:18.105494419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "106691",
  "sent_at": "2026-10-29T14:44:17.108057718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac7a1ee1-a7d1-48f1-b556-3f7653282cb1",
  "code": "106691",
  "device_ref": "sandbox-13481"
}
```

```json
{
  "session_id": "64b02fb7-5eb4-4986-a493-2aab3b32d2e7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk1NywiaWF0IjoxNzkzMjg1MDU3LCJqdGkiOiI4MjIyODlmNC02MzY3LTRkOGYtYTZiMS0xMDU0YTk5YWYzNDIiLCJzaWQiOiI2NGIwMmZiNy01ZWI0LTQ5ODYtYTQ5My0yYWFiM2IzMmQyZTcifQ.gUSWC0sgBDRx7R8uKSy9f_Senrk6NSY61qKldHLWteU",
  "access_expires_at": "2026-10-29T14:59:17.405560101Z",
  "refresh_token": "OyPN2lip3V6xdVAypSSdN23o2xXfbdIyATJTQmtuC7c",
  "refresh_expires_at": "2026-11-28T14:44:17.404997031Z",
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
  "command_id": "fc95418a-47e9-4cd6-83f1-3f24c2f01f91",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:18Z",
    "sequence": 1793285058228
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b02c167d-7f11-444d-ae02-13025e76be50",
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
  "last_heartbeat_at": "2026-10-29T14:44:18.245612Z",
  "last_location_at": "2026-10-29T14:44:18.245612Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "48a2ba69-b5e8-48b9-abae-6d187ee42548",
  "points": [
    {
      "sequence": 1793285060535,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:43:20Z"
    },
    {
      "sequence": 1793285060543,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:44:20Z"
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
  "session_id": "94186489-8cbe-4a48-ad73-f366a544beda",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjEsImlhdCI6MTc5MzI4NTA2MSwianRpIjoiZjhhZjcwYTUtNTQzNy00NmRhLTkzZTgtOGVlODc2NzYyM2FjIiwic2lkIjoiOTQxODY0ODktOGNiZS00YTQ4LWFkNzMtZjM2NmE1NDRiZWRhIn0.tlV2orilqRMz8cIRlmKIqd3i59ZUXtv3xnrrgPoKKt0",
  "access_expires_at": "2026-10-29T14:59:21.168010827Z",
  "refresh_token": "vKzvzZwlqZ1BCiZBy-0hyo7K0V_a-i-EQQp1K_fTYzk",
  "refresh_expires_at": "2026-10-30T02:44:21.167534305Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "e269254d-3b0a-4971-b06c-9c192a24e507",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T14:44:20Z",
        "track_point_id": "16212c77-64f7-4d30-a0f5-0c5f6710baf6",
        "work_session_id": "b02c167d-7f11-444d-ae02-13025e76be50"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T14:44:20Z",
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

`POST /api/admin/v1/driver-risk-flags/e269254d-3b0a-4971-b06c-9c192a24e507/confirm` → **200**

```json
{
  "command_id": "53cb2007-f318-42df-9617-be0efd47e7b9",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "e269254d-3b0a-4971-b06c-9c192a24e507",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T14:44:20Z",
    "track_point_id": "16212c77-64f7-4d30-a0f5-0c5f6710baf6",
    "work_session_id": "b02c167d-7f11-444d-ae02-13025e76be50"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T14:44:20Z",
  "reason": null,
  "reviewed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reviewed_at": "2026-10-29T14:44:22.075532Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/e269254d-3b0a-4971-b06c-9c192a24e507/dismiss` → **409**

```json
{
  "command_id": "775cd77a-0a4a-4769-b08f-511a226a74f8",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/e269254d-3b0a-4971-b06c-9c192a24e507/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9fda8a2e-af5f-49ea-9619-fcc64d377566"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "f4b9b6f7-6420-4312-87f7-1cef94eb716c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "50f2510c-b626-494c-8d41-9e86cb6cf20a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "raised_at": "2026-10-29T14:44:22.681615Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/50f2510c-b626-494c-8d41-9e86cb6cf20a/dismiss` → **200**

```json
{
  "command_id": "c2b22a07-f8ce-41a2-9378-62228f06db54",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "50f2510c-b626-494c-8d41-9e86cb6cf20a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "raised_at": "2026-10-29T14:44:22.681615Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reviewed_at": "2026-10-29T14:44:22.984125Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1cf8adc3-c103-48f8-ba20-a86267eb7925",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "e269254d-3b0a-4971-b06c-9c192a24e507"
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
      "actor_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:23.277851Z"
    }
  ]
}
```

Done: flag e269254d-3b0a-4971-b06c-9c192a24e507 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "f4b7fe4a-4f3a-4c2b-8c5d-5af9c6f607ee",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjQsImlhdCI6MTc5MzI4NTA2NCwianRpIjoiYWNiMWRjZjEtNDNiMi00YTM0LTk4NjItZjFlNjA3ODBmZDQ4Iiwic2lkIjoiZjRiN2ZlNGEtNGYzYS00YzJiLThjNWQtNWFmOWM2ZjYwN2VlIn0.90LfDzDEvKVmssPUV-yTtq7ISiPhFwWMCIlZs3YskJs",
  "access_expires_at": "2026-10-29T14:59:24.136377646Z",
  "refresh_token": "9t_UuwVAYvzHTFGfW1vmga2QX97xrLhcJKyVBlz7CFI",
  "refresh_expires_at": "2026-10-30T02:44:24.135625858Z",
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
      "actor_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:23.277851Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f0319b48-cc8d-4673-9042-0485b61f5497",
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
  "session_id": "b02c167d-7f11-444d-ae02-13025e76be50",
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
  "last_heartbeat_at": "2026-10-29T14:44:18.245612Z",
  "last_location_at": "2026-10-29T14:44:18.245612Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b02c167d-7f11-444d-ae02-13025e76be50/close` → **200**

```json
{
  "command_id": "8bce4a24-1548-46fd-96e6-67d803a81bfe",
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
  "session_id": "f1ffeccc-2ad5-4a95-9958-6701d00b7e78",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NjUsImlhdCI6MTc5MzI4NTA2NSwianRpIjoiOThhN2IzNTEtZGY5NC00MTIxLWI4NTUtZGFmMzkyYjYwOTNmIiwic2lkIjoiZjFmZmVjY2MtMmFkNS00YTk1LTk5NTgtNjcwMWQwMGI3ZTc4In0.qG1NURUh9nqMzMLPKyoDvJRoHrHK38DFQzPcHC8Ilt4",
  "access_expires_at": "2026-10-29T14:59:25.869458531Z",
  "refresh_token": "wZ4xa3o4T8oeKteq_QU2caoUu43AikorH7ETpc4-yl8",
  "refresh_expires_at": "2026-10-30T02:44:25.868858169Z",
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
  "command_id": "4d6963c5-9ff4-4cbf-a00e-93e6d9835cfc",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:44:26.44607Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "4d6963c5-9ff4-4cbf-a00e-93e6d9835cfc",
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
  "changed_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:44:26.44607Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48345456161",
  "device_ref": "sandbox-11145"
}
```

```json
{
  "challenge_id": "cc9c367f-7b59-477b-95b4-b717cbe2bbae",
  "expires_at": "2026-10-29T14:49:27.025935861Z",
  "resend_available_at": "2026-10-29T14:44:28.025935861Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48345456161` → **200**

```json
{
  "phone": "+48345456161",
  "audience": "CLIENT",
  "code": "278167",
  "sent_at": "2026-10-29T14:44:27.02865516Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc9c367f-7b59-477b-95b4-b717cbe2bbae",
  "code": "278167",
  "device_ref": "sandbox-11145"
}
```

```json
{
  "session_id": "e0f0acc3-57ee-4232-a90c-a872679a386d",
  "subject": {
    "type": "CLIENT",
    "id": "b5cafbc9-5166-40e6-975b-7f3cbf6b6d6a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNWNhZmJjOS01MTY2LTQwZTYtOTc1Yi03ZjNjYmY2YjZkNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTY3LCJpYXQiOjE3OTMyODUwNjcsImp0aSI6IjU2NjFmNWYzLWU4NzQtNGVhNS04MWUzLWFkYzYyY2MzMjAzNyIsInNpZCI6ImUwZjBhY2MzLTU3ZWUtNDIzMi1hOTBjLWE4NzI2NzlhMzg2ZCJ9.t5gC9_28rL1hbjazFQvV6FTWrx_I_YTkD-sUHSDSONM",
  "access_expires_at": "2026-10-29T14:59:27.336087699Z",
  "refresh_token": "Je6zlJ7atNZ2veQbxGmcasRCtoKhev6a-Df1la42-XM",
  "refresh_expires_at": "2026-11-28T14:44:27.335592769Z",
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
  "correlation_id": "beb3d6eb-c718-477e-90b6-32861105de32"
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
  "device_ref": "sandbox-30318"
}
```

```json
{
  "challenge_id": "e55d8939-f319-4da1-862f-90159ea4bd64",
  "expires_at": "2026-10-29T14:49:28.18990999Z",
  "resend_available_at": "2026-10-29T14:44:29.18990999Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "836229",
  "sent_at": "2026-10-29T14:44:28.19236406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e55d8939-f319-4da1-862f-90159ea4bd64",
  "code": "836229",
  "device_ref": "sandbox-30318"
}
```

```json
{
  "session_id": "5bbca0ff-863c-4630-a427-2238354066b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk2OCwiaWF0IjoxNzkzMjg1MDY4LCJqdGkiOiJjOTFlZTgzYy01ZWY4LTRkMTktOWY0MS04NzUyOTQxNjE4YTMiLCJzaWQiOiI1YmJjYTBmZi04NjNjLTQ2MzAtYTQyNy0yMjM4MzU0MDY2YjMifQ.tfem2plKoB4YNdGjnu8iUD26tLGXVeGR_Eq2sVwRlBc",
  "access_expires_at": "2026-10-29T14:59:28.490216233Z",
  "refresh_token": "B80fFv--FTUcBVw4LnkHfMURiYzv31jcGSshj0D_MB8",
  "refresh_expires_at": "2026-11-28T14:44:28.489549423Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ea7fb53c-68fe-4ad7-9eb0-e3b430d0ab44",
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
  "last_heartbeat_at": "2026-10-29T14:43:57.190171Z",
  "last_location_at": "2026-10-29T14:43:57.190171Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ea7fb53c-68fe-4ad7-9eb0-e3b430d0ab44/handover` → **200**

```json
{
  "command_id": "0326b1d4-deb6-4dfb-b360-4c40f2827b14",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ea7fb53c-68fe-4ad7-9eb0-e3b430d0ab44",
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
  "last_heartbeat_at": "2026-10-29T14:43:57.190171Z",
  "last_location_at": "2026-10-29T14:43:57.190171Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ea7fb53c-68fe-4ad7-9eb0-e3b430d0ab44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:29Z",
    "sequence": 1793285069350
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ea7fb53c-68fe-4ad7-9eb0-e3b430d0ab44",
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
  "last_heartbeat_at": "2026-10-29T14:44:29.369043Z",
  "last_location_at": "2026-10-29T14:44:29.369043Z",
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
  "session_id": "ea7fb53c-68fe-4ad7-9eb0-e3b430d0ab44",
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
  "last_heartbeat_at": "2026-10-29T14:44:29.369043Z",
  "last_location_at": "2026-10-29T14:44:29.369043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ea7fb53c-68fe-4ad7-9eb0-e3b430d0ab44/close` → **200**

```json
{
  "command_id": "ca6a01d9-c4fa-4ccf-8e0e-fc7c541ad3c6",
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
  "correlation_id": "33bb191c-5fce-4d82-ad09-2e658d946049"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673413083",
  "device_ref": "sandbox-31740"
}
```

```json
{
  "challenge_id": "82a73e95-9127-4489-a201-ddc673db3e9a",
  "expires_at": "2026-10-29T14:49:30.849332762Z",
  "resend_available_at": "2026-10-29T14:44:31.849332762Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673413083` → **200**

```json
{
  "phone": "+380673413083",
  "audience": "CLIENT",
  "code": "496997",
  "sent_at": "2026-10-29T14:44:30.851903936Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82a73e95-9127-4489-a201-ddc673db3e9a",
  "code": "496997",
  "device_ref": "sandbox-31740"
}
```

```json
{
  "session_id": "11106743-5428-44c1-989f-07da6c0444e0",
  "subject": {
    "type": "CLIENT",
    "id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTBmY2RkMi0zZTUwLTQyYmEtOWIxMS03Nzc4MDI5ZTVmMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTcxLCJpYXQiOjE3OTMyODUwNzEsImp0aSI6ImM1NTU3ZjNhLTVhNzktNDc2MC1iYjFkLTNiYzIxMDgwYmY2ZCIsInNpZCI6IjExMTA2NzQzLTU0MjgtNDRjMS05ODlmLTA3ZGE2YzA0NDRlMCJ9.2CsWIuq2LBHE7iXiHlEj6-UprrTX3FfL9HGMvhnrCrw",
  "access_expires_at": "2026-10-29T14:59:31.151693949Z",
  "refresh_token": "rYgVH-tVrTSX3rCJmPY2hrI32xjkaykTTYfaNRo-2AU",
  "refresh_expires_at": "2026-11-28T14:44:31.151200606Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "77329261-c566-491d-a5dd-3a9635c83627",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "1d43633f-0f05-46d4-aa78-a96de7c16249",
  "upload_path": "/api/rider/v1/uploads/1d43633f-0f05-46d4-aa78-a96de7c16249",
  "expires_at": "2026-10-29T14:59:31.443632726Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/1d43633f-0f05-46d4-aa78-a96de7c16249` → **200**

```json
{
  "file_id": "1d43633f-0f05-46d4-aa78-a96de7c16249",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "40ab9f3f-fbb9-4b34-8b81-8c556caae5d0",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "1d43633f-0f05-46d4-aa78-a96de7c16249"
  ]
}
```

```json
{
  "id": "6906645a-946f-43f4-b46b-a8c3dd2f69c8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:44:31.762317Z",
  "updated_at": "2026-10-29T14:44:31.762317Z",
  "respond_by": "2026-10-29T18:44:31.762317Z",
  "messages": [
    {
      "id": "f23dbfa5-764a-41a6-b073-a83b7112a7e0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:31.763317Z",
      "attachments": [
        {
          "file_id": "1d43633f-0f05-46d4-aa78-a96de7c16249",
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
  "session_id": "fdf730bf-e268-4346-8d81-da22c3754fea",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NzIsImlhdCI6MTc5MzI4NTA3MiwianRpIjoiYTgzNjFkM2ItNjJiOC00NmRlLWJiNTAtODY1YWYxZGI0NzdiIiwic2lkIjoiZmRmNzMwYmYtZTI2OC00MzQ2LThkODEtZGEyMmMzNzU0ZmVhIn0.aPUxYyxnGFx8Cl0-OS8Y8NanVSscqksUQjDtl13vPhs",
  "access_expires_at": "2026-10-29T14:59:32.360582455Z",
  "refresh_token": "09GdtdyMsZq6SuyVnWB9DteAg0dii3e0BQ4Z1xdexjQ",
  "refresh_expires_at": "2026-10-30T02:44:32.36007223Z",
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
  "session_id": "37fbc313-1933-4fc1-9405-c560c60189b5",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NzIsImlhdCI6MTc5MzI4NTA3MiwianRpIjoiNzAzYzdlN2YtYjVjYi00OTU1LTgxYjEtYjY0Njg0MjI0OWI3Iiwic2lkIjoiMzdmYmMzMTMtMTkzMy00ZmMxLTk0MDUtYzU2MGM2MDE4OWI1In0.vdXo73oWlf6_OeGcX-nsrFK01-0uj25oliaWoXJhjlc",
  "access_expires_at": "2026-10-29T14:59:32.936212678Z",
  "refresh_token": "3jFjEDoAcqZBkN3fl7lInT9-So4q2eu5aw2o-lOx_18",
  "refresh_expires_at": "2026-10-30T02:44:32.935720005Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/6906645a-946f-43f4-b46b-a8c3dd2f69c8/attachments/1d43633f-0f05-46d4-aa78-a96de7c16249` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d869a68b-d12c-4b49-8740-397b7cf9a2c0",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "3ae56512-3c75-44d6-88c6-c81a3d34884e",
  "upload_path": "/api/operator/v1/uploads/3ae56512-3c75-44d6-88c6-c81a3d34884e",
  "expires_at": "2026-10-29T14:59:33.229358394Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/3ae56512-3c75-44d6-88c6-c81a3d34884e` → **200**

```json
{
  "file_id": "3ae56512-3c75-44d6-88c6-c81a3d34884e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/6906645a-946f-43f4-b46b-a8c3dd2f69c8` → **200**

```json
{
  "id": "6906645a-946f-43f4-b46b-a8c3dd2f69c8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:44:31.762317Z",
  "updated_at": "2026-10-29T14:44:31.762317Z",
  "respond_by": "2026-10-29T18:44:31.762317Z",
  "messages": [
    {
      "id": "f23dbfa5-764a-41a6-b073-a83b7112a7e0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:31.763317Z",
      "attachments": [
        {
          "file_id": "1d43633f-0f05-46d4-aa78-a96de7c16249",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/6906645a-946f-43f4-b46b-a8c3dd2f69c8/comments` → **200**

```json
{
  "command_id": "58213fd0-2d94-43a4-a516-41dce7fd1559",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "3ae56512-3c75-44d6-88c6-c81a3d34884e"
  ]
}
```

```json
{
  "id": "6906645a-946f-43f4-b46b-a8c3dd2f69c8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:44:31.762317Z",
  "updated_at": "2026-10-29T14:44:33.829541Z",
  "respond_by": "2026-10-29T18:44:31.762317Z",
  "messages": [
    {
      "id": "f23dbfa5-764a-41a6-b073-a83b7112a7e0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:31.763317Z",
      "attachments": [
        {
          "file_id": "1d43633f-0f05-46d4-aa78-a96de7c16249",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bb421bf7-b15c-4a02-bf04-ae8a2796ea74",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:44:33.829049Z",
      "attachments": [
        {
          "file_id": "3ae56512-3c75-44d6-88c6-c81a3d34884e",
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

`GET /api/rider/v1/support/cases/6906645a-946f-43f4-b46b-a8c3dd2f69c8` → **200**

```json
{
  "id": "6906645a-946f-43f4-b46b-a8c3dd2f69c8",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:44:31.762317Z",
  "updated_at": "2026-10-29T14:44:33.829541Z",
  "respond_by": "2026-10-29T18:44:31.762317Z",
  "messages": [
    {
      "id": "f23dbfa5-764a-41a6-b073-a83b7112a7e0",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "e90fcdd2-3e50-42ba-9b11-7778029e5f04",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:44:31.763317Z",
      "attachments": [
        {
          "file_id": "1d43633f-0f05-46d4-aa78-a96de7c16249",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "bb421bf7-b15c-4a02-bf04-ae8a2796ea74",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:44:33.829049Z",
      "attachments": [
        {
          "file_id": "3ae56512-3c75-44d6-88c6-c81a3d34884e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/6906645a-946f-43f4-b46b-a8c3dd2f69c8/attachments/3ae56512-3c75-44d6-88c6-c81a3d34884e` → **200**

Done: support case 6906645a-946f-43f4-b46b-a8c3dd2f69c8, rider attachment 1d43633f-0f05-46d4-aa78-a96de7c16249, operator attachment 3ae56512-3c75-44d6-88c6-c81a3d34884e.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734612890",
  "device_ref": "sandbox-7797"
}
```

```json
{
  "challenge_id": "660db24a-b417-45c2-8e4f-3abe50178a7b",
  "expires_at": "2026-10-29T14:49:34.433975039Z",
  "resend_available_at": "2026-10-29T14:44:35.433975039Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734612890` → **200**

```json
{
  "phone": "+380734612890",
  "audience": "CLIENT",
  "code": "006907",
  "sent_at": "2026-10-29T14:44:34.437067669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "660db24a-b417-45c2-8e4f-3abe50178a7b",
  "code": "006907",
  "device_ref": "sandbox-7797"
}
```

```json
{
  "session_id": "15676af3-c684-464c-bac0-f713afa681db",
  "subject": {
    "type": "CLIENT",
    "id": "ee739f41-eb38-4048-9c41-2cca8d5c32ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTczOWY0MS1lYjM4LTQwNDgtOWM0MS0yY2NhOGQ1YzMyZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTc0LCJpYXQiOjE3OTMyODUwNzQsImp0aSI6ImM4ZDhmZmUwLThmZGEtNDA3Yi1hODhiLTQ5MmY3NmRlZDBjYSIsInNpZCI6IjE1Njc2YWYzLWM2ODQtNDY0Yy1iYWMwLWY3MTNhZmE2ODFkYiJ9.QXJaAiioO6MbadcdtC7GFSngdEOcCis1sw6yh7uAPuY",
  "access_expires_at": "2026-10-29T14:59:34.761100282Z",
  "refresh_token": "sx0rz_mXxNdSUVZvSHP2MFJV_D2IOCwnClA4ZnvKP8A",
  "refresh_expires_at": "2026-11-28T14:44:34.760632525Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "435d3a94-a9a6-49df-bf2f-eab5a8299a32",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "16ab530e-0721-4375-98bb-5ee428fd33c6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-16ab530e-0721-4375-98bb-5ee428fd33c6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "faeba29508355100862e9e12b320f9ed",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=16ab530e-0721-4375-98bb-5ee428fd33c6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734612890"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=16ab530e-0721-4375-98bb-5ee428fd33c6",
  "expires_at": "2026-10-29T15:14:35.042308Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/16ab530e-0721-4375-98bb-5ee428fd33c6` → **200**

```json
{
  "id": "16ab530e-0721-4375-98bb-5ee428fd33c6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:14:35.042308Z",
  "card": {
    "id": "6672e1e5-cb43-42d7-9280-94928d34b9f9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6372",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:44:35.32162Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2df7b5f6-5b16-4957-9003-6f995548f6fc",
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
  "id": "89462be0-fe12-4284-8ee9-6bd12fc300d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:35.619816Z",
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
  "command_id": "c231f3c0-de85-41b6-8c15-a5401a2723b6",
  "quote_id": "89462be0-fe12-4284-8ee9-6bd12fc300d9",
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
  "id": "2b69e76e-fd64-4101-927f-d87f631cfda0",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ee739f41-eb38-4048-9c41-2cca8d5c32ef",
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
  "created_at": "2026-10-29T14:44:35.918772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2b69e76e-fd64-4101-927f-d87f631cfda0` → **200**

```json
{
  "id": "2b69e76e-fd64-4101-927f-d87f631cfda0",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ee739f41-eb38-4048-9c41-2cca8d5c32ef",
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
  "created_at": "2026-10-29T14:44:35.918772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2b69e76e-fd64-4101-927f-d87f631cfda0` → **200**

```json
{
  "id": "2b69e76e-fd64-4101-927f-d87f631cfda0",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ee739f41-eb38-4048-9c41-2cca8d5c32ef",
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
  "created_at": "2026-10-29T14:44:35.918772Z",
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

`GET /api/rider/v1/orders/2b69e76e-fd64-4101-927f-d87f631cfda0` → **200**

```json
{
  "id": "2b69e76e-fd64-4101-927f-d87f631cfda0",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ee739f41-eb38-4048-9c41-2cca8d5c32ef",
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
  "created_at": "2026-10-29T14:44:35.918772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2b69e76e-fd64-4101-927f-d87f631cfda0/switch-to-cash` → **200**

```json
{
  "command_id": "e06d0c60-ed52-4d7e-bd40-8c5a1890520f",
  "expected_version": 3
}
```

```json
{
  "id": "2b69e76e-fd64-4101-927f-d87f631cfda0",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ee739f41-eb38-4048-9c41-2cca8d5c32ef",
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
  "created_at": "2026-10-29T14:44:35.918772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2b69e76e-fd64-4101-927f-d87f631cfda0/switch-to-cash` → **409**

```json
{
  "command_id": "cc440d6a-dd45-4357-877c-ccfc34889a9f",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/2b69e76e-fd64-4101-927f-d87f631cfda0/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "04a2a53e-e369-459a-8fe0-11473ca306f7"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/2b69e76e-fd64-4101-927f-d87f631cfda0` → **200**

```json
{
  "id": "2b69e76e-fd64-4101-927f-d87f631cfda0",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ee739f41-eb38-4048-9c41-2cca8d5c32ef",
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
  "created_at": "2026-10-29T14:44:35.918772Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2b69e76e-fd64-4101-927f-d87f631cfda0/cancel` → **200**

```json
{
  "command_id": "857edabb-8fc5-4d93-8621-56db247548fc",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2b69e76e-fd64-4101-927f-d87f631cfda0",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ee739f41-eb38-4048-9c41-2cca8d5c32ef",
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
  "created_at": "2026-10-29T14:44:35.918772Z",
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
  "session_id": "a246fbcd-f3f5-44fc-b876-c8e978a2538c",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5NzksImlhdCI6MTc5MzI4NTA3OSwianRpIjoiNzYzMDQwNDktNjBhMC00OGFlLWIzMTAtMjIxMWNmMmFlZmEwIiwic2lkIjoiYTI0NmZiY2QtZjNmNS00NGZjLWI4NzYtYzhlOTc4YTI1MzhjIn0.gajXHYkHqdZ4h92Qk9Fc5bZ_wjP_-IwPzMfkvn08nMs",
  "access_expires_at": "2026-10-29T14:59:39.614030475Z",
  "refresh_token": "E3Phu-O3MBiMhguV9bUfkJkSkuKr_EzaLDOAcJgd1xA",
  "refresh_expires_at": "2026-10-30T02:44:39.61354222Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4058"
}
```

```json
{
  "challenge_id": "162fb547-28ee-4ef3-a4dc-3c21cf4a7a9e",
  "expires_at": "2026-10-29T14:49:39.913872777Z",
  "resend_available_at": "2026-10-29T14:44:40.913872777Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "466467",
  "sent_at": "2026-10-29T14:44:39.916779799Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "162fb547-28ee-4ef3-a4dc-3c21cf4a7a9e",
  "code": "466467",
  "device_ref": "sandbox-4058"
}
```

```json
{
  "session_id": "e04784ad-672d-40dd-8005-38151903d0fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk4MCwiaWF0IjoxNzkzMjg1MDgwLCJqdGkiOiI5ZGJmZGYxNy00MTQ4LTRkMjgtYmM4ZS0yZWY3YmJmZmE1MTciLCJzaWQiOiJlMDQ3ODRhZC02NzJkLTQwZGQtODAwNS0zODE1MTkwM2QwZmQifQ.DjMAlbnrUoyATgiN_A_0g-S_R2li-dmPnCS68iQHS3g",
  "access_expires_at": "2026-10-29T14:59:40.224289587Z",
  "refresh_token": "KXnBRnem9YMB-uyHhJlT9TVJwjckV9ChvhQKMnjswwg",
  "refresh_expires_at": "2026-11-28T14:44:40.223767118Z",
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
      "actor_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:44:23.277851Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T14:44:24.722027Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "4b82c934-4e31-4d0b-87f2-bee6deb1a2da",
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
  "device_ref": "sandbox-2683"
}
```

```json
{
  "challenge_id": "6f60a9f4-296d-4609-85d8-534146d764a5",
  "expires_at": "2026-10-29T14:49:41.386699516Z",
  "resend_available_at": "2026-10-29T14:44:42.386699516Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "350230",
  "sent_at": "2026-10-29T14:44:41.389424598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f60a9f4-296d-4609-85d8-534146d764a5",
  "code": "350230",
  "device_ref": "sandbox-2683"
}
```

```json
{
  "session_id": "d39a803e-b970-4fdd-a779-77c5c8dc843b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk4MSwiaWF0IjoxNzkzMjg1MDgxLCJqdGkiOiIxYjA2OGU4Zi00MWVkLTQzNDQtYjg0NS0zNGMyMDU1ZGQxNWEiLCJzaWQiOiJkMzlhODAzZS1iOTcwLTRmZGQtYTc3OS03N2M1YzhkYzg0M2IifQ.E4WmpT9rxeNG4v_oPGHd3-mHKvJBOiwJGyaCG8KyXN0",
  "access_expires_at": "2026-10-29T14:59:41.697379333Z",
  "refresh_token": "W0Xyg6AwEKKIb237zf4jgFFBMrtrxzxBeaHySIhqRUc",
  "refresh_expires_at": "2026-11-28T14:44:41.696860662Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edcfd250-1c5e-4b0a-901f-5307fd1f14c1",
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
  "last_heartbeat_at": "2026-10-29T14:44:04.494194Z",
  "last_location_at": "2026-10-29T14:44:04.494194Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/edcfd250-1c5e-4b0a-901f-5307fd1f14c1/handover` → **200**

```json
{
  "command_id": "6538cc51-bceb-469b-880e-b75b0ed5f583",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edcfd250-1c5e-4b0a-901f-5307fd1f14c1",
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
  "last_heartbeat_at": "2026-10-29T14:44:04.494194Z",
  "last_location_at": "2026-10-29T14:44:04.494194Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/edcfd250-1c5e-4b0a-901f-5307fd1f14c1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:42Z",
    "sequence": 1793285082559
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "edcfd250-1c5e-4b0a-901f-5307fd1f14c1",
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
  "last_heartbeat_at": "2026-10-29T14:44:42.577628Z",
  "last_location_at": "2026-10-29T14:44:42.577628Z",
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
  "command_id": "bf2f780f-c1f2-4096-a11d-5abaae2580ba",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:43Z",
    "sequence": 1793285083133
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cd7fbd56-bb55-4610-b81f-82798f0b29bb",
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
  "last_heartbeat_at": "2026-10-29T14:44:43.152119Z",
  "last_location_at": "2026-10-29T14:44:43.152119Z",
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
  "session_id": "9d2b065e-31ba-4fc5-96d9-4bbe31f649aa",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODU5ODMsImlhdCI6MTc5MzI4NTA4MywianRpIjoiYTRjMmQwMmUtMmRiMC00OTA3LTgxOGEtNTA5ZmNkMjZiMTcwIiwic2lkIjoiOWQyYjA2NWUtMzFiYS00ZmM1LTk2ZDktNGJiZTMxZjY0OWFhIn0.d5OKKxd7UMHyKkz40jSMp8mKCKCx6QzYjkOS--QnVFk",
  "access_expires_at": "2026-10-29T14:59:43.740802898Z",
  "refresh_token": "KXU7DH5_5udSUgkIFW2_SSRS78uUzDJ9P4Z0GC0lORw",
  "refresh_expires_at": "2026-10-30T02:44:43.740233146Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a29eb99c-da6d-4923-b7f1-4a8519e59051",
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
  "id": "f9ff1041-b7b0-49a7-8c4b-82cceaa2f5c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:44.024633Z",
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
  "command_id": "a53a3cde-c0e0-4641-b60c-9cd526cdafc3",
  "quote_id": "f9ff1041-b7b0-49a7-8c4b-82cceaa2f5c3",
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
  "id": "b27801e6-2222-48c7-8302-1632efd3c987",
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
  "created_at": "2026-10-29T14:44:44.321013Z",
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
    "id": "231477eb-3a72-46a7-b02e-3237601178ae",
    "order_id": "b27801e6-2222-48c7-8302-1632efd3c987",
    "expires_at": "2026-10-29T14:44:59.324913Z",
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

`POST /api/driver/v1/offers/231477eb-3a72-46a7-b02e-3237601178ae/accept` → **200**

```json
{
  "command_id": "d49e05fe-dfc5-46d8-a22e-67950ad85bf8"
}
```

```json
{
  "id": "94f31fab-f8e4-41fc-8c95-3508a4aff8c1",
  "order_id": "b27801e6-2222-48c7-8302-1632efd3c987",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bd17df80-bb75-4fc1-9e62-9c44721bb473",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bd17df80-bb75-4fc1-9e62-9c44721bb473",
  "order_id": "b27801e6-2222-48c7-8302-1632efd3c987",
  "assignment_id": "94f31fab-f8e4-41fc-8c95-3508a4aff8c1",
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

`POST /api/driver/v1/work-sessions/cd7fbd56-bb55-4610-b81f-82798f0b29bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:44:45Z",
    "sequence": 1793285085766
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cd7fbd56-bb55-4610-b81f-82798f0b29bb",
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
  "last_heartbeat_at": "2026-10-29T14:44:45.784413Z",
  "last_location_at": "2026-10-29T14:44:45.784413Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bd17df80-bb75-4fc1-9e62-9c44721bb473/arrive` → **200**

```json
{
  "command_id": "561a83db-e695-4d1f-8422-1f696c305319",
  "expected_version": 0
}
```

```json
{
  "id": "bd17df80-bb75-4fc1-9e62-9c44721bb473",
  "order_id": "b27801e6-2222-48c7-8302-1632efd3c987",
  "assignment_id": "94f31fab-f8e4-41fc-8c95-3508a4aff8c1",
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
  "arrived_at": "2026-10-29T14:44:46.077714Z",
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

`POST /api/driver/v1/trips/bd17df80-bb75-4fc1-9e62-9c44721bb473/start` → **200**

```json
{
  "command_id": "05ebabd8-48ec-425e-8041-7c13fc327d48",
  "expected_version": 1
}
```

```json
{
  "id": "bd17df80-bb75-4fc1-9e62-9c44721bb473",
  "order_id": "b27801e6-2222-48c7-8302-1632efd3c987",
  "assignment_id": "94f31fab-f8e4-41fc-8c95-3508a4aff8c1",
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
  "arrived_at": "2026-10-29T14:44:46.077714Z",
  "started_at": "2026-10-29T14:44:46.375209Z",
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

`POST /api/driver/v1/trips/bd17df80-bb75-4fc1-9e62-9c44721bb473/complete` → **200**

```json
{
  "command_id": "29d5538a-8d63-4aff-bc54-fcb0d1ab6b77",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:44:46Z",
  "cash_received": true
}
```

```json
{
  "id": "bd17df80-bb75-4fc1-9e62-9c44721bb473",
  "order_id": "b27801e6-2222-48c7-8302-1632efd3c987",
  "assignment_id": "94f31fab-f8e4-41fc-8c95-3508a4aff8c1",
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
  "arrived_at": "2026-10-29T14:44:46.077714Z",
  "started_at": "2026-10-29T14:44:46.375209Z",
  "completed_at": "2026-10-29T14:44:46.685064Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/b27801e6-2222-48c7-8302-1632efd3c987` → **200**

```json
{
  "id": "b27801e6-2222-48c7-8302-1632efd3c987",
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
    "id": "94f31fab-f8e4-41fc-8c95-3508a4aff8c1",
    "order_id": "b27801e6-2222-48c7-8302-1632efd3c987",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bd17df80-bb75-4fc1-9e62-9c44721bb473",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:44:44.321013Z",
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
  "session_id": "edcfd250-1c5e-4b0a-901f-5307fd1f14c1",
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
  "last_heartbeat_at": "2026-10-29T14:44:42.577628Z",
  "last_location_at": "2026-10-29T14:44:42.577628Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/edcfd250-1c5e-4b0a-901f-5307fd1f14c1/close` → **200**

```json
{
  "command_id": "89704a6c-0faa-4993-8aad-1313308f7488",
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
  "session_id": "cd7fbd56-bb55-4610-b81f-82798f0b29bb",
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
  "last_heartbeat_at": "2026-10-29T14:44:45.784413Z",
  "last_location_at": "2026-10-29T14:44:45.784413Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cd7fbd56-bb55-4610-b81f-82798f0b29bb/close` → **200**

```json
{
  "command_id": "232bf01c-997e-45b8-b78b-f1ebb3e266aa",
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

Done: terminal order b27801e6-2222-48c7-8302-1632efd3c987 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18180"
}
```

```json
{
  "challenge_id": "b04d16e5-7b85-4387-9ef9-f2cdd203752a",
  "expires_at": "2026-10-29T14:49:51.729647165Z",
  "resend_available_at": "2026-10-29T14:44:52.729647165Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "124367",
  "sent_at": "2026-10-29T14:44:51.732358064Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b04d16e5-7b85-4387-9ef9-f2cdd203752a",
  "code": "124367",
  "device_ref": "sandbox-18180"
}
```

```json
{
  "session_id": "e03d0feb-ecae-4f7d-a59a-01a1137d55b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk5MiwiaWF0IjoxNzkzMjg1MDkyLCJqdGkiOiI3MDRlOWU2MC05YTg1LTQ5ODAtYmM3Zi0xYzE4YTc5MjA0YTUiLCJzaWQiOiJlMDNkMGZlYi1lY2FlLTRmN2QtYTU5YS0wMWExMTM3ZDU1YjMifQ.J7YDB4DYettgfv7KdP4g1qNqmFKaxQryA8jnj3uUfiE",
  "access_expires_at": "2026-10-29T14:59:52.041645134Z",
  "refresh_token": "1qC_g8w3jiM9w0HzPhMc7CGq8MUGfH1NqBSXk_EDDtE",
  "refresh_expires_at": "2026-11-28T14:44:52.041068634Z",
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
  "device_ref": "sandbox-26304"
}
```

```json
{
  "challenge_id": "21b48fa1-6963-44db-88cf-58fcd39e16e4",
  "expires_at": "2026-10-29T14:49:52.605901873Z",
  "resend_available_at": "2026-10-29T14:44:53.605901873Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "017113",
  "sent_at": "2026-10-29T14:44:52.608469073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21b48fa1-6963-44db-88cf-58fcd39e16e4",
  "code": "017113",
  "device_ref": "sandbox-26304"
}
```

```json
{
  "session_id": "c6603256-e27b-4bc3-91cd-0e9d8735bef2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk5MiwiaWF0IjoxNzkzMjg1MDkyLCJqdGkiOiJkNmE2YjM0OC0xMmQ0LTRiZTctOTYyMy0wYWZhODU5MzQ0NmEiLCJzaWQiOiJjNjYwMzI1Ni1lMjdiLTRiYzMtOTFjZC0wZTlkODczNWJlZjIifQ.jcwea88ksn5mCF45hLAxCLj_bFzRyO8lRLwAvpFuVLo",
  "access_expires_at": "2026-10-29T14:59:52.914587391Z",
  "refresh_token": "owgUrdnWrQoCy8pDlTzqj1pJdYRmQr79bPvSoZwBhKA",
  "refresh_expires_at": "2026-11-28T14:44:52.914075362Z",
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
  "device_ref": "sandbox-27960"
}
```

```json
{
  "challenge_id": "60bd74fd-66f9-4469-add3-5a5ca35ba11c",
  "expires_at": "2026-10-29T14:49:53.466390643Z",
  "resend_available_at": "2026-10-29T14:44:54.466390643Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "884169",
  "sent_at": "2026-10-29T14:44:53.469637901Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60bd74fd-66f9-4469-add3-5a5ca35ba11c",
  "code": "884169",
  "device_ref": "sandbox-27960"
}
```

```json
{
  "session_id": "bc56199e-113c-4754-9322-d4db052eaa4c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTk5MywiaWF0IjoxNzkzMjg1MDkzLCJqdGkiOiJiZTcxYzkyMi01MDNiLTRlYTYtYTU2Yi1hMjI1YzRiZGI5ZjAiLCJzaWQiOiJiYzU2MTk5ZS0xMTNjLTQ3NTQtOTMyMi1kNGRiMDUyZWFhNGMifQ.SxUksxyu3jX8mgLY4NQYIQISY7OoZjVL1_14UAMRwq8",
  "access_expires_at": "2026-10-29T14:59:53.779113873Z",
  "refresh_token": "_JAGlziGSqheqZZFcsYWSr8XDlnhwrBYgsBgComOHpI",
  "refresh_expires_at": "2026-11-28T14:44:53.778566329Z",
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
  "phone": "+380691739307",
  "device_ref": "sandbox-16285"
}
```

```json
{
  "challenge_id": "d57a4257-c766-46b7-83a2-8bdc6dca94bc",
  "expires_at": "2026-10-29T14:49:54.347043637Z",
  "resend_available_at": "2026-10-29T14:44:55.347043637Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380691739307` → **200**

```json
{
  "phone": "+380691739307",
  "audience": "CLIENT",
  "code": "126434",
  "sent_at": "2026-10-29T14:44:54.349488345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d57a4257-c766-46b7-83a2-8bdc6dca94bc",
  "code": "126434",
  "device_ref": "sandbox-16285"
}
```

```json
{
  "session_id": "abae1e30-6f88-4593-a435-266c09252d5a",
  "subject": {
    "type": "CLIENT",
    "id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MWM3ZWZlYi02ZDU3LTQxYWMtODVlOS05Y2NmMzQ1YWJlOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1OTk0LCJpYXQiOjE3OTMyODUwOTQsImp0aSI6IjhjNWMxYmM1LTY1YzktNDQ0Ni1iNmQzLTY2OWFkNGUyMjI2MSIsInNpZCI6ImFiYWUxZTMwLTZmODgtNDU5My1hNDM1LTI2NmMwOTI1MmQ1YSJ9.D1kxyCLFfuX6IkwgE5L9sfTIb_RnCLN4D443rGNiUKQ",
  "access_expires_at": "2026-10-29T14:59:54.655706595Z",
  "refresh_token": "AksJNU1n5oofXpBdd2e1HWSR2ncoW6TazVDREecsDuM",
  "refresh_expires_at": "2026-11-28T14:44:54.655180369Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4a2c9dd9-ee04-4e89-8a64-20d81031af0b",
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
  "id": "c3a06612-57ab-439c-acb4-2d8d4a32a068",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:49:54.966887Z",
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
  "command_id": "8295bf94-7bb7-440c-a6e2-4ea39b6cedd6",
  "quote_id": "c3a06612-57ab-439c-acb4-2d8d4a32a068",
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
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:44:55.275379Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:44:55.275379Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.983820519
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.213633199
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

`GET /api/rider/v1/orders/735f8023-befd-452b-96b9-a94924da725c` → **200**

```json
{
  "id": "735f8023-befd-452b-96b9-a94924da725c",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "51c7efeb-6d57-41ac-85e9-9ccf345abe90",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:44:55.275379Z",
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
  "session_id": "7f6334f7-813e-4e9f-af2d-9a721cd9bb4c",
  "subject": {
    "type": "STAFF",
    "id": "c8b8597d-0592-4ccb-98bd-39afee2dea7b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGI4NTk3ZC0wNTkyLTRjY2ItOThiZC0zOWFmZWUyZGVhN2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODYxODIsImlhdCI6MTc5MzI4NTI4MiwianRpIjoiMGUzOGEzYzAtN2NlNi00OTVmLWEwMWYtMzRiMDNjMzJiN2MyIiwic2lkIjoiN2Y2MzM0ZjctODEzZS00ZTlmLWFmMmQtOWE3MjFjZDliYjRjIn0.I3v7Fcsq3r7_FGe5eDV_o3JGt10hA_-EvI_ckDvZzSQ",
  "access_expires_at": "2026-10-29T15:03:02.209851323Z",
  "refresh_token": "dtZI-wyvzolV_jkdvCuoTx6XkURqnVmCvlxmG9IIP08",
  "refresh_expires_at": "2026-10-30T02:48:02.206479794Z",
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
  "id": "1de97ab2-8501-4162-b0ec-2519bd3ddd27",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:48:02.514344Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:48:02.514379Z",
  "updated_at": "2026-10-29T14:48:02.530984Z",
  "finished_at": "2026-10-29T14:48:02.530984Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/1de97ab2-8501-4162-b0ec-2519bd3ddd27` → **200**

```json
{
  "run": {
    "id": "1de97ab2-8501-4162-b0ec-2519bd3ddd27",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:48:02.514344Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:48:02.514379Z",
    "updated_at": "2026-10-29T14:48:02.530984Z",
    "finished_at": "2026-10-29T14:48:02.530984Z",
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
  "id": "1de97ab2-8501-4162-b0ec-2519bd3ddd27",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:48:02.514344Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:48:02.514379Z",
  "updated_at": "2026-10-29T14:48:02.530984Z",
  "finished_at": "2026-10-29T14:48:02.530984Z",
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
  "id": "1de97ab2-8501-4162-b0ec-2519bd3ddd27",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:48:02.514344Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:48:02.514379Z",
  "updated_at": "2026-10-29T14:48:02.530984Z",
  "finished_at": "2026-10-29T14:48:02.530984Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/0f0bbca4-7960-4029-9214-06eaf0e63fb8` → **204**

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
  "id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:48:02.954757Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:48:02.954793Z",
  "updated_at": "2026-10-29T14:48:02.962771Z",
  "finished_at": "2026-10-29T14:48:02.962771Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/8bdbb341-a14c-48a0-b10b-6cd63a26aa54` → **200**

```json
{
  "run": {
    "id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:48:02.954757Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:48:02.954793Z",
    "updated_at": "2026-10-29T14:48:02.962771Z",
    "finished_at": "2026-10-29T14:48:02.962771Z",
    "version": 1
  },
  "items": [
    {
      "id": "34c8b173-b67f-4695-bd15-35487721738d",
      "run_id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "e2541524d83a2672d4135fd1bbe50b5165277a4f3339962666196573a3afb226",
      "reference_display": "sandbox-reconciliation-0f0bbca4-7960-4029-9214-06eaf0e63fb8",
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
      "provider_at": "2026-10-29T14:48:02Z",
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
  "id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:48:02.954757Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:48:02.954793Z",
  "updated_at": "2026-10-29T14:48:02.962771Z",
  "finished_at": "2026-10-29T14:48:02.962771Z",
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
  "id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:48:02.954757Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:48:02.954793Z",
  "updated_at": "2026-10-29T14:48:02.962771Z",
  "finished_at": "2026-10-29T14:48:02.962771Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/34c8b173-b67f-4695-bd15-35487721738d/resolve` → **200**

```json
{
  "command_id": "e8dae2f7-9f3d-4e87-a62a-3d28154a9adb",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "34c8b173-b67f-4695-bd15-35487721738d",
  "run_id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "e2541524d83a2672d4135fd1bbe50b5165277a4f3339962666196573a3afb226",
  "reference_display": "sandbox-reconciliation-0f0bbca4-7960-4029-9214-06eaf0e63fb8",
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
  "provider_at": "2026-10-29T14:48:02Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "resolved_at": "2026-10-29T14:48:03.381949Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/34c8b173-b67f-4695-bd15-35487721738d/resolve` → **200**

```json
{
  "command_id": "e8dae2f7-9f3d-4e87-a62a-3d28154a9adb",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "34c8b173-b67f-4695-bd15-35487721738d",
  "run_id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "e2541524d83a2672d4135fd1bbe50b5165277a4f3339962666196573a3afb226",
  "reference_display": "sandbox-reconciliation-0f0bbca4-7960-4029-9214-06eaf0e63fb8",
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
  "provider_at": "2026-10-29T14:48:02Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
  "resolved_at": "2026-10-29T14:48:03.381949Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/34c8b173-b67f-4695-bd15-35487721738d/resolve` → **409**

```json
{
  "command_id": "20e73c1d-2064-41a4-a5f6-857ff934acac",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/34c8b173-b67f-4695-bd15-35487721738d/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "77baff6f-0f05-48db-ba8f-b0dfdff5b88e"
}
```

`GET /api/admin/v1/payment-reconciliations/8bdbb341-a14c-48a0-b10b-6cd63a26aa54` → **200**

```json
{
  "run": {
    "id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:48:02.954757Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:48:02.954793Z",
    "updated_at": "2026-10-29T14:48:03.381949Z",
    "finished_at": "2026-10-29T14:48:02.962771Z",
    "version": 2
  },
  "items": [
    {
      "id": "34c8b173-b67f-4695-bd15-35487721738d",
      "run_id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "e2541524d83a2672d4135fd1bbe50b5165277a4f3339962666196573a3afb226",
      "reference_display": "sandbox-reconciliation-0f0bbca4-7960-4029-9214-06eaf0e63fb8",
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
      "provider_at": "2026-10-29T14:48:02Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "c8b8597d-0592-4ccb-98bd-39afee2dea7b",
      "resolved_at": "2026-10-29T14:48:03.381949Z",
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
      "id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T14:48:02.954757Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:48:02.954793Z",
      "updated_at": "2026-10-29T14:48:03.381949Z",
      "finished_at": "2026-10-29T14:48:02.962771Z",
      "version": 2
    },
    {
      "id": "a4a65f89-5976-4ec0-97dd-6d441a0b9441",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T14:40:06.325646Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:40:06.325737Z",
      "updated_at": "2026-10-29T14:40:06.330058Z",
      "finished_at": "2026-10-29T14:40:06.330058Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/0f0bbca4-7960-4029-9214-06eaf0e63fb8` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "8bdbb341-a14c-48a0-b10b-6cd63a26aa54",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:48:02.954757Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:48:02.954793Z",
  "updated_at": "2026-10-29T14:48:03.381949Z",
  "finished_at": "2026-10-29T14:48:02.962771Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793285411535E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793285411771E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793285411772E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793285411551E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793285411773E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
