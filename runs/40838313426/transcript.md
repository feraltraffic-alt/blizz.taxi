# Sandbox transcript (2026-10-29T07:54:09Z, 3683ef6)

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
  "correlation_id": "4ba261b2-c661-4e28-9a51-24d0f613fd77"
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
  "session_id": "51e4331b-089f-476f-a684-5c373891a05a",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjEzNTcsImlhdCI6MTc5MzI2MDQ1NywianRpIjoiMjhhYjBmYmYtYzZhZS00NTUwLWI2NmItYmJkMTJlNzFiMmYxIiwic2lkIjoiNTFlNDMzMWItMDg5Zi00NzZmLWE2ODQtNWMzNzM4OTFhMDVhIn0.aK-KyOJzhNqzyygv8QqVIBjZEPaJyyFK4z45DMUWFOg",
  "access_expires_at": "2026-10-29T08:09:17.021008437Z",
  "refresh_token": "9aUB59B-IhkoPMDf2gFnjYYnV_UVBOtHbaJAIRAQllQ",
  "refresh_expires_at": "2026-10-29T19:54:17.019060016Z",
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
  "session_id": "e996bb91-064b-4c5a-bced-9afd6c1c0052",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjEzNTgsImlhdCI6MTc5MzI2MDQ1OCwianRpIjoiNTY2OWMwYWYtODNkNy00OWYzLTgyNjktNTNmNjEyNmI5YjZhIiwic2lkIjoiZTk5NmJiOTEtMDY0Yi00YzVhLWJjZWQtOWFmZDZjMWMwMDUyIn0.Mzo__amyddOW44F8rdQlP2tjYwmsJZDX9oCWHGw3onw",
  "access_expires_at": "2026-10-29T08:09:18.572995228Z",
  "refresh_token": "5tEreZMQzq8_xwN7LloeXCawipFNrFkgwACV4uObOIY",
  "refresh_expires_at": "2026-10-29T19:54:18.572007988Z",
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
  "device_ref": "sandbox-2860"
}
```

```json
{
  "challenge_id": "7e0c9b1a-3487-49b2-b686-41c6fd7328be",
  "expires_at": "2026-10-29T07:59:19.172343017Z",
  "resend_available_at": "2026-10-29T07:54:20.172343017Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "227183",
  "sent_at": "2026-10-29T07:54:19.181338378Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e0c9b1a-3487-49b2-b686-41c6fd7328be",
  "code": "227183",
  "device_ref": "sandbox-2860"
}
```

```json
{
  "session_id": "048caaf0-99a9-4480-a859-fce1101d70a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTM1OSwiaWF0IjoxNzkzMjYwNDU5LCJqdGkiOiJjYTE1YmM3My0yNzVmLTQyMDQtOGRlZi0xMDdiMzllMTIwYWQiLCJzaWQiOiIwNDhjYWFmMC05OWE5LTQ0ODAtYTg1OS1mY2UxMTAxZDcwYTEifQ.r60Ro8nVmaXqfPrh5pNVJsK6NL7n8f8-AO2P_6J3rXM",
  "access_expires_at": "2026-10-29T08:09:19.507169314Z",
  "refresh_token": "T9ejk00MaQUVwnsHTskGNJtKLnYzls_d0zBebrQSB8I",
  "refresh_expires_at": "2026-11-28T07:54:19.506273084Z",
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
  "command_id": "9201fdbc-63e6-4773-b590-e1d9d4bf0e19",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:54:20Z",
    "sequence": 1793260460544
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd8a9484-2ac9-4342-8c8f-6172e42aa910",
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
  "last_heartbeat_at": "2026-10-29T07:54:20.124648Z",
  "last_location_at": "2026-10-29T07:54:20.124648Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637813378",
  "device_ref": "sandbox-19763"
}
```

```json
{
  "challenge_id": "610781ff-85b4-4b22-b62e-794a460aaedf",
  "expires_at": "2026-10-29T07:59:20.411545271Z",
  "resend_available_at": "2026-10-29T07:54:21.411545271Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637813378` → **200**

```json
{
  "phone": "+380637813378",
  "audience": "CLIENT",
  "code": "620569",
  "sent_at": "2026-10-29T07:54:20.415210748Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "610781ff-85b4-4b22-b62e-794a460aaedf",
  "code": "620569",
  "device_ref": "sandbox-19763"
}
```

```json
{
  "session_id": "e0535a52-db9c-4b4d-9ccc-c254fa6a67e5",
  "subject": {
    "type": "CLIENT",
    "id": "7fd7796a-ce2a-4b83-b7b4-a63919c423af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZmQ3Nzk2YS1jZTJhLTRiODMtYjdiNC1hNjM5MTljNDIzYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxMzYwLCJpYXQiOjE3OTMyNjA0NjAsImp0aSI6ImQ5MzEyNjBkLTU2NjctNDE1OS1iMzcyLWQ3Y2FkOGQ3NzMzYiIsInNpZCI6ImUwNTM1YTUyLWRiOWMtNGI0ZC05Y2NjLWMyNTRmYTZhNjdlNSJ9.0OlRUPIya1LIIYoSpGYPzCpWjTpz6x9srrs_b2Kmpe4",
  "access_expires_at": "2026-10-29T08:09:20.728116016Z",
  "refresh_token": "1N1Ba8K7j-3fl9QJ-mbYnV0XmXe56x2TI2YRn9u-Hx0",
  "refresh_expires_at": "2026-11-28T07:54:20.727218595Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d09875e6-70b1-40bc-9d22-35b44ceb42ca",
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
  "id": "0ef276f9-9c8f-457e-a3eb-c398e7d10485",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:59:21.047785Z",
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
  "command_id": "077543be-4b85-498e-90f0-998e0ee86427",
  "quote_id": "0ef276f9-9c8f-457e-a3eb-c398e7d10485",
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
  "id": "5006aae9-55ad-4a5e-ac1c-3d05b07234b8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7fd7796a-ce2a-4b83-b7b4-a63919c423af",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:54:21.439313Z",
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
    "id": "41c22cbf-e9a2-45a8-bd74-63e94c86755f",
    "order_id": "5006aae9-55ad-4a5e-ac1c-3d05b07234b8",
    "expires_at": "2026-10-29T07:54:36.451348Z",
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

`POST /api/driver/v1/offers/41c22cbf-e9a2-45a8-bd74-63e94c86755f/accept` → **200**

```json
{
  "command_id": "6a4f42a3-fe0f-4574-958e-73e528e3fe11"
}
```

```json
{
  "id": "dac13c9c-3d4e-4f7b-80d9-2b97597e2f88",
  "order_id": "5006aae9-55ad-4a5e-ac1c-3d05b07234b8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8507a609-eb34-4437-b1fd-8ae92b7601d6",
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
  "command_id": "36315920-3bb4-4824-b31c-7bd6f400fcee",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:54:22.724040189Z"
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
  "id": "8507a609-eb34-4437-b1fd-8ae92b7601d6",
  "order_id": "5006aae9-55ad-4a5e-ac1c-3d05b07234b8",
  "assignment_id": "dac13c9c-3d4e-4f7b-80d9-2b97597e2f88",
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

`POST /api/driver/v1/work-sessions/fd8a9484-2ac9-4342-8c8f-6172e42aa910/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:54:23Z",
    "sequence": 1793260463567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fd8a9484-2ac9-4342-8c8f-6172e42aa910",
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
  "last_heartbeat_at": "2026-10-29T07:54:23.593282Z",
  "last_location_at": "2026-10-29T07:54:23.593282Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8507a609-eb34-4437-b1fd-8ae92b7601d6/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "63df9d8a-b13f-4b68-a12c-d50de98a2332",
  "expected_version": 0
}
```

```json
{
  "id": "8507a609-eb34-4437-b1fd-8ae92b7601d6",
  "order_id": "5006aae9-55ad-4a5e-ac1c-3d05b07234b8",
  "assignment_id": "dac13c9c-3d4e-4f7b-80d9-2b97597e2f88",
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
  "arrived_at": "2026-10-29T07:54:23.890357Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8507a609-eb34-4437-b1fd-8ae92b7601d6/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "cc12da63-73e5-4e0d-bb91-23b376a74228",
  "expected_version": 1
}
```

```json
{
  "id": "8507a609-eb34-4437-b1fd-8ae92b7601d6",
  "order_id": "5006aae9-55ad-4a5e-ac1c-3d05b07234b8",
  "assignment_id": "dac13c9c-3d4e-4f7b-80d9-2b97597e2f88",
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
  "arrived_at": "2026-10-29T07:54:23.890357Z",
  "started_at": "2026-10-29T07:54:24.179718Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8507a609-eb34-4437-b1fd-8ae92b7601d6/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "87e367b7-8f27-4a7f-83a6-13c7425dafc6",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:54:24Z",
  "cash_received": true
}
```

```json
{
  "id": "8507a609-eb34-4437-b1fd-8ae92b7601d6",
  "order_id": "5006aae9-55ad-4a5e-ac1c-3d05b07234b8",
  "assignment_id": "dac13c9c-3d4e-4f7b-80d9-2b97597e2f88",
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
  "arrived_at": "2026-10-29T07:54:23.890357Z",
  "started_at": "2026-10-29T07:54:24.179718Z",
  "completed_at": "2026-10-29T07:54:24.475547Z",
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
  "session_id": "fd8a9484-2ac9-4342-8c8f-6172e42aa910",
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
  "last_heartbeat_at": "2026-10-29T07:54:23.593282Z",
  "last_location_at": "2026-10-29T07:54:23.593282Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fd8a9484-2ac9-4342-8c8f-6172e42aa910/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "944cbb9d-2169-4e2c-939c-cd1d41823142",
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
  "command_id": "f7b9fa65-01ba-413a-914b-bae5a1ecb265",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:54:25Z",
    "sequence": 1793260465357
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
  "correlation_id": "c7717e16-9125-4fc9-8938-7ffe80452a78",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "fc7713ee-0e89-4ebc-87fa-e9822962908f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:54:25Z",
    "sequence": 1793260465662
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e740050-cc85-4eb2-896a-97d0e44c3e23",
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
  "last_heartbeat_at": "2026-10-29T07:54:25.683703Z",
  "last_location_at": "2026-10-29T07:54:25.683703Z",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:54:22.72404Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "85cc04fd-66fd-4e4f-8144-23ce073bf56d",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:54:26.257541431Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8e740050-cc85-4eb2-896a-97d0e44c3e23",
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
  "last_heartbeat_at": "2026-10-29T07:54:25.683703Z",
  "last_location_at": "2026-10-29T07:54:25.683703Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8e740050-cc85-4eb2-896a-97d0e44c3e23/close` → **200**

```json
{
  "command_id": "995fd53a-d01e-459d-9215-b53721095a90",
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
  "session_id": "36577e1a-91c0-4553-b2a1-0e829b33b626",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjEzNjcsImlhdCI6MTc5MzI2MDQ2NywianRpIjoiMDk1ZWNlN2ItNTI5NC00NDFjLWFhYzUtNWM5ZTg4YmNkMDMwIiwic2lkIjoiMzY1NzdlMWEtOTFjMC00NTUzLWIyYTEtMGU4MjliMzNiNjI2In0.8CbGNzLZcDlifRIhpq65eouI4tNp92xigRgTGI7Lnx0",
  "access_expires_at": "2026-10-29T08:09:27.434876161Z",
  "refresh_token": "lmAGuRfJICe67sT1ZglPKSP9PFi7LLKPT3XQUv_MR28",
  "refresh_expires_at": "2026-10-29T19:54:27.434075821Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "5d69f00a-2c55-4665-b032-baea123db882",
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
  "id": "bd7aa189-2ea6-4e2a-b3a3-1677ab08e9b5",
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
  "created_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "created_at": "2026-10-29T07:54:27.721317Z",
  "updated_at": "2026-10-29T07:54:27.721317Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636768520",
  "device_ref": "sandbox-12014"
}
```

```json
{
  "challenge_id": "2afeb347-b3dc-44df-bf36-aa46650d1055",
  "expires_at": "2026-10-29T07:59:28.011762401Z",
  "resend_available_at": "2026-10-29T07:54:29.011762401Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636768520` → **200**

```json
{
  "phone": "+380636768520",
  "audience": "CLIENT",
  "code": "099298",
  "sent_at": "2026-10-29T07:54:28.015381448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2afeb347-b3dc-44df-bf36-aa46650d1055",
  "code": "099298",
  "device_ref": "sandbox-12014"
}
```

```json
{
  "session_id": "3886fadf-baa9-46fe-b070-546daf72adaf",
  "subject": {
    "type": "CLIENT",
    "id": "477295e2-88db-4d2b-ba82-48805c5203e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NzcyOTVlMi04OGRiLTRkMmItYmE4Mi00ODgwNWM1MjAzZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxMzY4LCJpYXQiOjE3OTMyNjA0NjgsImp0aSI6IjMxM2E4ZDliLWFlMjktNDEzNS1hOTJiLTA1YjQyYTViOWJhYiIsInNpZCI6IjM4ODZmYWRmLWJhYTktNDZmZS1iMDcwLTU0NmRhZjcyYWRhZiJ9.AYKSLzaXkgOmu8qiUy5L78NZTAHvKuWJPrmprG3fGrA",
  "access_expires_at": "2026-10-29T08:09:28.317482115Z",
  "refresh_token": "D3kERVWin9P-aUj6C_2J3SeN4larA6ie6vmeHEVSRe8",
  "refresh_expires_at": "2026-11-28T07:54:28.316678217Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636768520` → **200**

```json
{
  "client_id": "477295e2-88db-4d2b-ba82-48805c5203e7"
}
```

`POST /api/admin/v1/rider-wallets/477295e2-88db-4d2b-ba82-48805c5203e7/top-ups` → **201**

```json
{
  "command_id": "40f3fe4a-c5a9-480b-8584-0cfe3c1f3c3f",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "477295e2-88db-4d2b-ba82-48805c5203e7",
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
      "id": "3ffcd564-14d6-4bc0-a16d-e08f02f96a06",
      "at": "2026-10-29T07:54:28.858851Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b7ac9cd6-3c1b-4448-a7ee-15dd0759aebf",
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
  "id": "0c3e1a65-5271-4f06-9514-1995bdd77b8d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:59:29.157956Z",
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
      "id": "bd7aa189-2ea6-4e2a-b3a3-1677ab08e9b5",
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
  "device_ref": "sandbox-16092"
}
```

```json
{
  "challenge_id": "1f1812a4-dd72-4476-998b-7ce091532a9a",
  "expires_at": "2026-10-29T07:59:29.447984464Z",
  "resend_available_at": "2026-10-29T07:54:30.447984464Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "960448",
  "sent_at": "2026-10-29T07:54:29.451408221Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f1812a4-dd72-4476-998b-7ce091532a9a",
  "code": "960448",
  "device_ref": "sandbox-16092"
}
```

```json
{
  "session_id": "009ed3a9-0536-49e3-92cd-b144f7d004ea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTM2OSwiaWF0IjoxNzkzMjYwNDY5LCJqdGkiOiIzYzgyZGMzZi0yYjMzLTRmMzUtOWY5Ny03NmUxYjBjMDBiNDAiLCJzaWQiOiIwMDllZDNhOS0wNTM2LTQ5ZTMtOTJjZC1iMTQ0ZjdkMDA0ZWEifQ.Fk6FQzOh8ByWzqE_iiJw1vQcf3LCg_gbMpYt85QnUnM",
  "access_expires_at": "2026-10-29T08:09:29.751343693Z",
  "refresh_token": "rWWPWSLHgjZve_eNobOxcl5YUq2Zxc5OObDrXGF9ntg",
  "refresh_expires_at": "2026-11-28T07:54:29.750714754Z",
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
  "command_id": "d1194727-2c00-4596-a54a-72e23bd4429a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:54:30Z",
    "sequence": 1793260470290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "78547f5f-9f2e-4c03-8a1a-95c04c181c92",
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
  "last_heartbeat_at": "2026-10-29T07:54:30.311131Z",
  "last_location_at": "2026-10-29T07:54:30.311131Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dd81f1d5-3304-4014-a05d-1a1157fcce3d",
  "quote_id": "0c3e1a65-5271-4f06-9514-1995bdd77b8d",
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
  "id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "477295e2-88db-4d2b-ba82-48805c5203e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:54:30.608727Z",
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
  "client_id": "477295e2-88db-4d2b-ba82-48805c5203e7",
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
      "id": "3ffcd564-14d6-4bc0-a16d-e08f02f96a06",
      "at": "2026-10-29T07:54:28.858851Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "154415a5-2c56-488b-931a-26ab06629f74",
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
    "id": "15d58142-8bd7-4e8e-a08d-0c8c54aa29ef",
    "order_id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29",
    "expires_at": "2026-10-29T07:54:45.617494Z",
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

`POST /api/driver/v1/offers/15d58142-8bd7-4e8e-a08d-0c8c54aa29ef/accept` → **200**

```json
{
  "command_id": "aaa99cf7-63a5-4e25-b50a-9774eb669288"
}
```

```json
{
  "id": "274da646-6374-4763-971d-a6f37619297e",
  "order_id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7786a3ab-8748-4630-8a09-8b1adf0a832a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7786a3ab-8748-4630-8a09-8b1adf0a832a",
  "order_id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29",
  "assignment_id": "274da646-6374-4763-971d-a6f37619297e",
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

`POST /api/driver/v1/work-sessions/78547f5f-9f2e-4c03-8a1a-95c04c181c92/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:54:32Z",
    "sequence": 1793260472364
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "78547f5f-9f2e-4c03-8a1a-95c04c181c92",
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
  "last_heartbeat_at": "2026-10-29T07:54:32.057174Z",
  "last_location_at": "2026-10-29T07:54:32.057174Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7786a3ab-8748-4630-8a09-8b1adf0a832a/arrive` → **200**

```json
{
  "command_id": "147b8f91-6b79-4025-9fdf-9c6be247f7c9",
  "expected_version": 0
}
```

```json
{
  "id": "7786a3ab-8748-4630-8a09-8b1adf0a832a",
  "order_id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29",
  "assignment_id": "274da646-6374-4763-971d-a6f37619297e",
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
  "arrived_at": "2026-10-29T07:54:32.347916Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7786a3ab-8748-4630-8a09-8b1adf0a832a/start` → **200**

```json
{
  "command_id": "075bdfb7-4816-46a2-8d1c-100617acf115",
  "expected_version": 1
}
```

```json
{
  "id": "7786a3ab-8748-4630-8a09-8b1adf0a832a",
  "order_id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29",
  "assignment_id": "274da646-6374-4763-971d-a6f37619297e",
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
  "arrived_at": "2026-10-29T07:54:32.347916Z",
  "started_at": "2026-10-29T07:54:32.64573Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/7786a3ab-8748-4630-8a09-8b1adf0a832a/complete` → **200**

```json
{
  "command_id": "e8d6c7ff-46d1-48d3-9e6e-d1142e264d18",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:54:32Z",
  "cash_received": true
}
```

```json
{
  "id": "7786a3ab-8748-4630-8a09-8b1adf0a832a",
  "order_id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29",
  "assignment_id": "274da646-6374-4763-971d-a6f37619297e",
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
  "arrived_at": "2026-10-29T07:54:32.347916Z",
  "started_at": "2026-10-29T07:54:32.64573Z",
  "completed_at": "2026-10-29T07:54:32.955716Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "477295e2-88db-4d2b-ba82-48805c5203e7",
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
      "id": "b1ae47ab-45bf-4ad5-a0c1-1cfb93e58506",
      "at": "2026-10-29T07:54:33.781559Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29"
    },
    {
      "id": "3ffcd564-14d6-4bc0-a16d-e08f02f96a06",
      "at": "2026-10-29T07:54:28.858851Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/bd7aa189-2ea6-4e2a-b3a3-1677ab08e9b5/archive` → **200**

```json
{
  "command_id": "51e64706-f761-43c8-b1fb-46d47bfacbc7",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "bd7aa189-2ea6-4e2a-b3a3-1677ab08e9b5",
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
  "created_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "created_at": "2026-10-29T07:54:27.721317Z",
  "updated_at": "2026-10-29T07:54:36.563327Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "78547f5f-9f2e-4c03-8a1a-95c04c181c92",
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
  "last_heartbeat_at": "2026-10-29T07:54:32.057174Z",
  "last_location_at": "2026-10-29T07:54:32.057174Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/78547f5f-9f2e-4c03-8a1a-95c04c181c92/close` → **200**

```json
{
  "command_id": "89cae5bb-7cf1-47c3-b156-9bf6c8ee79c0",
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

Done: order 6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29.

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
  "session_id": "2509e41a-d2d2-4806-b9a7-f71df9bcf767",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjEzNzcsImlhdCI6MTc5MzI2MDQ3NywianRpIjoiYTcyZmM3MzItMGYyMS00MzQ1LWE5ZDQtZjVmMTU3MWJjYTg2Iiwic2lkIjoiMjUwOWU0MWEtZDJkMi00ODA2LWI5YTctZjcxZGY5YmNmNzY3In0.ntxEChnYti-591FZF1WwWcgzcTt6JvYHv-Hz7oF_PEk",
  "access_expires_at": "2026-10-29T08:09:37.718002018Z",
  "refresh_token": "whYS9otPxztwbhmbZ5E-V-QXdy3Z4prYUZvCH13IF2M",
  "refresh_expires_at": "2026-10-29T19:54:37.717337765Z",
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
  "command_id": "b71b083e-e70c-44ec-9a63-69816eef932c",
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
  "session_id": "14ce0f0d-b710-406c-be66-ace7e78a6a2b",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjEzNzgsImlhdCI6MTc5MzI2MDQ3OCwianRpIjoiMDI3NzdkMjEtNWU3MS00NGEyLTgyNWQtZGE4N2I4ZDYxNzBkIiwic2lkIjoiMTRjZTBmMGQtYjcxMC00MDZjLWJlNjYtYWNlN2U3OGE2YTJiIn0.PLSk2VQ12r5hiQXHVTIVIA5bbQPqhYj0JHlTZsq1EEE",
  "access_expires_at": "2026-10-29T08:09:38.853215199Z",
  "refresh_token": "u5tD9PD0lTWBlNQOXOw_1SxYsWrGYJCHRgf4rIRyKGk",
  "refresh_expires_at": "2026-10-29T19:54:38.852411831Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.21787796",
    "linkedid": "1730052700.21787796",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672709960"
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
    "id": "1730052700.21787796",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "7174a961-2b60-4593-a60b-f9006bf238da",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.118897Z",
      "answered_at": null,
      "ended_at": "2026-10-29T07:54:39.144317Z",
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
    "id": "1730052600.1377814734",
    "linkedid": "1730052600.1377814734",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672709960"
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
      "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.458137Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/79cb413b-d37d-41de-9372-a1693252f9b8/answer` → **200**

```json
{
  "command_id": "0c9ddad4-3020-4e9f-9738-7fb8b4391a75"
}
```

```json
{
  "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672709960",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "order_ids": [],
  "started_at": "2026-10-29T07:54:39.458137Z",
  "answered_at": "2026-10-29T07:54:39.7676Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1377814734",
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
    "id": "1730052600.1377814734",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.458137Z",
      "answered_at": "2026-10-29T07:54:39.7676Z",
      "ended_at": "2026-10-29T07:54:40.072902Z",
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
      "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.458137Z",
      "answered_at": "2026-10-29T07:54:39.7676Z",
      "ended_at": "2026-10-29T07:54:40.072902Z",
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
      "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.458137Z",
      "answered_at": "2026-10-29T07:54:39.7676Z",
      "ended_at": "2026-10-29T07:54:40.072902Z",
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
      "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.458137Z",
      "answered_at": "2026-10-29T07:54:39.7676Z",
      "ended_at": "2026-10-29T07:54:40.072902Z",
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
      "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.458137Z",
      "answered_at": "2026-10-29T07:54:39.7676Z",
      "ended_at": "2026-10-29T07:54:40.072902Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:54:48.446149Z"
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
      "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.458137Z",
      "answered_at": "2026-10-29T07:54:39.7676Z",
      "ended_at": "2026-10-29T07:54:40.072902Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:54:48.446149Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/79cb413b-d37d-41de-9372-a1693252f9b8/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/79cb413b-d37d-41de-9372-a1693252f9b8/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=79cb413b-d37d-41de-9372-a1693252f9b8` → **200**

```json
{
  "changes": [
    {
      "id": "973ee937-0802-480a-b19a-6b3944423411",
      "occurred_at": "2026-10-29T07:54:49.802964Z",
      "actor_type": "STAFF",
      "actor_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f5003e32-4b04-4c30-967b-d901bc09bd39\", \"order_ids\": []}",
      "correlation_id": "b108fe09-2334-4ae3-b006-66e32a612ebe"
    },
    {
      "id": "8d318dc4-7faa-4eea-ae81-823aa05c9909",
      "occurred_at": "2026-10-29T07:54:49.770868Z",
      "actor_type": "STAFF",
      "actor_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f5003e32-4b04-4c30-967b-d901bc09bd39\", \"order_ids\": []}",
      "correlation_id": "8d800245-2a31-4154-8bdd-e59475d0043a"
    }
  ]
}
```

Done: call 79cb413b-d37d-41de-9372-a1693252f9b8 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18850"
}
```

```json
{
  "challenge_id": "bf9817d5-945b-4985-a113-2916bc7412aa",
  "expires_at": "2026-10-29T07:59:50.124568877Z",
  "resend_available_at": "2026-10-29T07:54:51.124568877Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "940186",
  "sent_at": "2026-10-29T07:54:50.128195684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf9817d5-945b-4985-a113-2916bc7412aa",
  "code": "940186",
  "device_ref": "sandbox-18850"
}
```

```json
{
  "session_id": "78ece6c5-a482-4dd8-aa4a-7d403fd57fa7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTM5MCwiaWF0IjoxNzkzMjYwNDkwLCJqdGkiOiJhMjQ5MDZkMC00Yjk3LTQ3Y2UtYmMwZi02OWJjYjE5ZGViMTkiLCJzaWQiOiI3OGVjZTZjNS1hNDgyLTRkZDgtYWE0YS03ZDQwM2ZkNTdmYTcifQ.ptgGlan8KIlPbDrp5tcmBiKiv-5mjjV8zaeuTjEt4UA",
  "access_expires_at": "2026-10-29T08:09:50.417158336Z",
  "refresh_token": "OAzzdGpGWS1JBA8B8OBfVWYbKoSfsdcZTtxmom3Xu9w",
  "refresh_expires_at": "2026-11-28T07:54:50.416479545Z",
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
  "command_id": "3f7ddb63-fc93-45c5-bec3-de7a5b934124",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:54:50Z",
    "sequence": 1793260490948
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7c497152-56bf-4260-a0c5-8c8d411afbe6",
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
  "last_heartbeat_at": "2026-10-29T07:54:50.971614Z",
  "last_location_at": "2026-10-29T07:54:50.971614Z",
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
  "session_id": "83ec1e22-75dc-43c4-9a9c-90f260d33967",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjEzOTEsImlhdCI6MTc5MzI2MDQ5MSwianRpIjoiZDhkYzg1ZGEtMGUyZS00MmI2LWJiOGUtNDdjNjRkYmM5ZDBmIiwic2lkIjoiODNlYzFlMjItNzVkYy00M2M0LTlhOWMtOTBmMjYwZDMzOTY3In0.pffoKVVK5ZYbGfyVeFeiXzl3eHNM5kEUnLDSKpVetEs",
  "access_expires_at": "2026-10-29T08:09:51.535195141Z",
  "refresh_token": "mF75bHCCpii2Ja3f6cGDJta3tXR0T2UPHAMd4snnEjg",
  "refresh_expires_at": "2026-10-29T19:54:51.53459657Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4c607adc-a4c1-48d9-ac08-fadf36fe6c80",
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
  "id": "dcdc0831-6513-4c56-839e-aa7c58d01b5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:59:51.834618Z",
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
  "command_id": "a10504bc-6dcb-492c-a8d3-520672ea7a0a",
  "quote_id": "dcdc0831-6513-4c56-839e-aa7c58d01b5d",
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
    "phone": "+380674380999"
  }
}
```

```json
{
  "id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
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
  "created_at": "2026-10-29T07:54:52.137657Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674380999"
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
    "id": "e405c807-dc9a-4920-9f65-3e0846c8afc9",
    "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
    "expires_at": "2026-10-29T07:55:07.143013Z",
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

`POST /api/driver/v1/offers/e405c807-dc9a-4920-9f65-3e0846c8afc9/accept` → **200**

```json
{
  "command_id": "2de1e849-fe4e-4774-930e-aa62e4edec8c"
}
```

```json
{
  "id": "09f1f42a-7154-4668-a380-8ad019f2fb71",
  "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a3508fc5-7550-4d2c-ac0e-eb60dd5667f6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674380999` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674380999` → **200**

```json
[
  {
    "phone": "+380674380999",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:53.647770186Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674380999` → **200**

```json
[
  {
    "phone": "+380674380999",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:53.647770186Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674380999` → **200**

```json
[
  {
    "phone": "+380674380999",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:53.647770186Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a3508fc5-7550-4d2c-ac0e-eb60dd5667f6",
  "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
  "assignment_id": "09f1f42a-7154-4668-a380-8ad019f2fb71",
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
    "phone": "+380674380999"
  }
}
```

`POST /api/driver/v1/work-sessions/7c497152-56bf-4260-a0c5-8c8d411afbe6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:54:54Z",
    "sequence": 1793260494360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7c497152-56bf-4260-a0c5-8c8d411afbe6",
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
  "last_heartbeat_at": "2026-10-29T07:54:54.379948Z",
  "last_location_at": "2026-10-29T07:54:54.379948Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a3508fc5-7550-4d2c-ac0e-eb60dd5667f6/arrive` → **200**

```json
{
  "command_id": "45922521-fd2a-46bc-ac57-c1e9f911670d",
  "expected_version": 0
}
```

```json
{
  "id": "a3508fc5-7550-4d2c-ac0e-eb60dd5667f6",
  "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
  "assignment_id": "09f1f42a-7154-4668-a380-8ad019f2fb71",
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
  "arrived_at": "2026-10-29T07:54:54.660238Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674380999"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674380999` → **200**

```json
[
  {
    "phone": "+380674380999",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:53.647770186Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674380999` → **200**

```json
[
  {
    "phone": "+380674380999",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:53.647770186Z"
  },
  {
    "phone": "+380674380999",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:55.655040797Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674380999` → **200**

```json
[
  {
    "phone": "+380674380999",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:53.647770186Z"
  },
  {
    "phone": "+380674380999",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:55.655040797Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674380999` → **200**

```json
[
  {
    "phone": "+380674380999",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:53.647770186Z"
  },
  {
    "phone": "+380674380999",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:54:55.655040797Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/a3508fc5-7550-4d2c-ac0e-eb60dd5667f6/start` → **200**

```json
{
  "command_id": "fef9577e-5440-4379-8b8c-3fecf217ba5f",
  "expected_version": 1
}
```

```json
{
  "id": "a3508fc5-7550-4d2c-ac0e-eb60dd5667f6",
  "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
  "assignment_id": "09f1f42a-7154-4668-a380-8ad019f2fb71",
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
  "arrived_at": "2026-10-29T07:54:54.660238Z",
  "started_at": "2026-10-29T07:54:56.059455Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674380999"
  }
}
```

`POST /api/driver/v1/trips/a3508fc5-7550-4d2c-ac0e-eb60dd5667f6/complete` → **200**

```json
{
  "command_id": "17a59c0b-9b51-457b-9776-6f6b3d0276ad",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:54:56Z",
  "cash_received": true
}
```

```json
{
  "id": "a3508fc5-7550-4d2c-ac0e-eb60dd5667f6",
  "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
  "assignment_id": "09f1f42a-7154-4668-a380-8ad019f2fb71",
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
  "arrived_at": "2026-10-29T07:54:54.660238Z",
  "started_at": "2026-10-29T07:54:56.059455Z",
  "completed_at": "2026-10-29T07:54:56.362156Z",
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
  "session_id": "7c497152-56bf-4260-a0c5-8c8d411afbe6",
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
  "last_heartbeat_at": "2026-10-29T07:54:54.379948Z",
  "last_location_at": "2026-10-29T07:54:54.379948Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7c497152-56bf-4260-a0c5-8c8d411afbe6/close` → **200**

```json
{
  "command_id": "1d49e144-c700-48d3-aa58-351a6a5d1d47",
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
  "phone": "+380634232165",
  "device_ref": "sandbox-12296"
}
```

```json
{
  "challenge_id": "0774c712-2452-4090-867e-bf8f9d708754",
  "expires_at": "2026-10-29T07:59:57.238418332Z",
  "resend_available_at": "2026-10-29T07:54:58.238418332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634232165` → **200**

```json
{
  "phone": "+380634232165",
  "audience": "CLIENT",
  "code": "300705",
  "sent_at": "2026-10-29T07:54:57.241660205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0774c712-2452-4090-867e-bf8f9d708754",
  "code": "300705",
  "device_ref": "sandbox-12296"
}
```

```json
{
  "session_id": "110d1eb7-5268-4740-9dc6-52a76c945a26",
  "subject": {
    "type": "CLIENT",
    "id": "a6f2ec16-5f8a-4f74-9e6c-d9a1c6670647"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNmYyZWMxNi01ZjhhLTRmNzQtOWU2Yy1kOWExYzY2NzA2NDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxMzk3LCJpYXQiOjE3OTMyNjA0OTcsImp0aSI6ImEzNmI3MzMwLTczMTktNDQ3ZS04MzcyLTIzY2IwYjcwODBlOSIsInNpZCI6IjExMGQxZWI3LTUyNjgtNDc0MC05ZGM2LTUyYTc2Yzk0NWEyNiJ9.1yLxeNFYFkb0Cvly86hgZDXbOwcOcXSAHsdhhMPSgWw",
  "access_expires_at": "2026-10-29T08:09:57.526617064Z",
  "refresh_token": "G7O9XVhyv97puPyMOxmFN5K3LPeA2MjSm8mjVGGJ32s",
  "refresh_expires_at": "2026-11-28T07:54:57.525958999Z",
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
  "device_ref": "sandbox-30898"
}
```

```json
{
  "challenge_id": "2e7ab4c6-391e-48d7-9b5c-86ce18306987",
  "expires_at": "2026-10-29T07:59:58.070741517Z",
  "resend_available_at": "2026-10-29T07:54:59.070741517Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "361568",
  "sent_at": "2026-10-29T07:54:58.07357595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e7ab4c6-391e-48d7-9b5c-86ce18306987",
  "code": "361568",
  "device_ref": "sandbox-30898"
}
```

```json
{
  "session_id": "443452a1-05de-420e-895d-66a2c2dca04c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTM5OCwiaWF0IjoxNzkzMjYwNDk4LCJqdGkiOiI0MWQ2OTYyZC1lNTYyLTRkNjItOGQxNy05ZDRlZWEwZjg2MjciLCJzaWQiOiI0NDM0NTJhMS0wNWRlLTQyMGUtODk1ZC02NmEyYzJkY2EwNGMifQ.OBmNb8do4SQVrTZCbeuLJxdLS1fAqDIlz01M_7OVNK0",
  "access_expires_at": "2026-10-29T08:09:58.363224512Z",
  "refresh_token": "huAWPm9ysswvXy2eQYfuXGLzGc1tPY2X-OWtbFMbFXQ",
  "refresh_expires_at": "2026-11-28T07:54:58.362609038Z",
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
  "session_id": "457c6dfc-435b-474c-8e5d-274cc7b5c095",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjEzOTksImlhdCI6MTc5MzI2MDQ5OSwianRpIjoiNmY2MDI4ZDMtYjU0MS00NmFlLWJmODQtZDM3ZTZmNTM4MDdiIiwic2lkIjoiNDU3YzZkZmMtNDM1Yi00NzRjLThlNWQtMjc0Y2M3YjVjMDk1In0.K851I2q0X86K41_uXZ2M9mdA4s01tEJRl6UXYJSytFE",
  "access_expires_at": "2026-10-29T08:09:59.178556021Z",
  "refresh_token": "Hu63ZYyCtkhFUE1l3ukFi4q7j__7zhyAxAUQqeQuyQ8",
  "refresh_expires_at": "2026-10-29T19:54:59.177908458Z",
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
  "session_id": "c7475831-ae81-4338-963e-65f2cd9f05e5",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjEzOTksImlhdCI6MTc5MzI2MDQ5OSwianRpIjoiY2FmMTdlOTItNzEwMy00N2Q2LWI3NTctOTEzYTMwNTI0NTIyIiwic2lkIjoiYzc0NzU4MzEtYWU4MS00MzM4LTk2M2UtNjVmMmNkOWYwNWU1In0.boOM9ZLNAkhZVpm8ltYF5WXDc55jzzsVuf0EQ16SIbk",
  "access_expires_at": "2026-10-29T08:09:59.736406275Z",
  "refresh_token": "S2a0J2xjutyY9Vch2wtX8CNCZI-CXjxsMao85L-aYjc",
  "refresh_expires_at": "2026-10-29T19:54:59.735860042Z",
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
  "command_id": "2c487a58-b4f7-4933-9acf-c0443aa9f584",
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
  "id": "ae4658e1-f38b-4b36-9937-1d556790a44f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:00.277598Z",
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
  "command_id": "f10ab399-6db5-402c-85fb-86bc7f106376",
  "quote_id": "ae4658e1-f38b-4b36-9937-1d556790a44f",
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
  "id": "fa2792fc-2339-434a-9c5a-f2112154a501",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6f2ec16-5f8a-4f74-9e6c-d9a1c6670647",
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
  "created_at": "2026-10-29T07:55:00.567872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fa2792fc-2339-434a-9c5a-f2112154a501` → **200**

```json
{
  "id": "fa2792fc-2339-434a-9c5a-f2112154a501",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6f2ec16-5f8a-4f74-9e6c-d9a1c6670647",
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
  "created_at": "2026-10-29T07:55:00.567872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fa2792fc-2339-434a-9c5a-f2112154a501/cancel` → **200**

```json
{
  "command_id": "5b753009-a560-466f-a0b8-529880cbbb28",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "fa2792fc-2339-434a-9c5a-f2112154a501",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6f2ec16-5f8a-4f74-9e6c-d9a1c6670647",
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
  "created_at": "2026-10-29T07:55:00.567872Z",
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
  "command_id": "93ee50bd-2818-4ac7-80b1-03eef4081bfd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:55:01Z",
    "sequence": 1793260501731
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "703d4ff8-6e8f-462b-8c6d-c84ba52cd241",
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
  "last_heartbeat_at": "2026-10-29T07:55:01.751407Z",
  "last_location_at": "2026-10-29T07:55:01.751407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11424"
}
```

```json
{
  "challenge_id": "acfd575c-8606-43b5-8538-b0b9fdccbc5d",
  "expires_at": "2026-10-29T08:00:02.044437332Z",
  "resend_available_at": "2026-10-29T07:55:03.044437332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "528078",
  "sent_at": "2026-10-29T07:55:02.047349477Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "acfd575c-8606-43b5-8538-b0b9fdccbc5d",
  "code": "528078",
  "device_ref": "sandbox-11424"
}
```

```json
{
  "session_id": "4836366a-4489-48f2-9612-03061d232b45",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTQwMiwiaWF0IjoxNzkzMjYwNTAyLCJqdGkiOiIwM2EyNWEzMS1lZmY4LTQzNTEtOGM5OS0yMDU5ODllN2IzM2IiLCJzaWQiOiI0ODM2MzY2YS00NDg5LTQ4ZjItOTYxMi0wMzA2MWQyMzJiNDUifQ.mjQebSwsaPGs7L394AzDF8kqxTqZ7Vbplj1A7Skman8",
  "access_expires_at": "2026-10-29T08:10:02.34605674Z",
  "refresh_token": "5zdcMb-gZKw8RutKzoKclx2HtMLRf65FGf4uhbpe0d0",
  "refresh_expires_at": "2026-11-28T07:55:02.3454752Z",
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
  "command_id": "0081bbd2-6a98-4ee4-b486-fb0e42d63199",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:55:02Z",
    "sequence": 1793260502886
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "66dc0e74-a210-414d-8676-7b4514075a8a",
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
  "last_heartbeat_at": "2026-10-29T07:55:02.906758Z",
  "last_location_at": "2026-10-29T07:55:02.906758Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "78260563-a55f-4181-85f7-702ba63f49b7",
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
  "id": "0148ed48-048f-41da-a96e-5b5f6be348d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:03.198075Z",
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
  "command_id": "254157e9-75d1-43c2-8b03-888dfe5f43e8",
  "quote_id": "0148ed48-048f-41da-a96e-5b5f6be348d2",
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
  "id": "b95cc7de-58c9-4127-8070-ad514182c852",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6f2ec16-5f8a-4f74-9e6c-d9a1c6670647",
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
  "created_at": "2026-10-29T07:55:03.491957Z",
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
    "id": "8e512c09-5054-4f88-bda5-868c62035c59",
    "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
    "expires_at": "2026-10-29T07:55:18.496044Z",
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

`POST /api/driver/v1/offers/8e512c09-5054-4f88-bda5-868c62035c59/accept` → **200**

```json
{
  "command_id": "c84e7c42-bbe7-4105-aad6-26ad68c4dc37"
}
```

```json
{
  "id": "64bc95b1-5fcd-48a9-a55b-0965765ae230",
  "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2bc5fb73-ed90-422d-8c41-b4efec00f00d",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2bc5fb73-ed90-422d-8c41-b4efec00f00d",
  "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
  "assignment_id": "64bc95b1-5fcd-48a9-a55b-0965765ae230",
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

`POST /api/driver/v1/trips/2bc5fb73-ed90-422d-8c41-b4efec00f00d/cancel` → **200**

```json
{
  "command_id": "34a492b1-3f76-4168-a0d3-4643f2298a53",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "2bc5fb73-ed90-422d-8c41-b4efec00f00d",
  "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
  "assignment_id": "64bc95b1-5fcd-48a9-a55b-0965765ae230",
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

`GET /api/rider/v1/orders/b95cc7de-58c9-4127-8070-ad514182c852` → **200**

```json
{
  "id": "b95cc7de-58c9-4127-8070-ad514182c852",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a6f2ec16-5f8a-4f74-9e6c-d9a1c6670647",
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
    "id": "64bc95b1-5fcd-48a9-a55b-0965765ae230",
    "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2bc5fb73-ed90-422d-8c41-b4efec00f00d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:55:03.491957Z",
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
    "id": "3334d4fb-2b44-4850-acec-893c66335573",
    "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
    "expires_at": "2026-10-29T07:55:19.619699Z",
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

`POST /api/driver/v1/offers/3334d4fb-2b44-4850-acec-893c66335573/accept` → **200**

```json
{
  "command_id": "abf29b5c-ec72-423b-b99e-f741b43f543d"
}
```

```json
{
  "id": "0485cf1c-3cb2-4792-8baa-34e27a7ecc5b",
  "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7369c546-ea63-4144-927c-c813a0797cb6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7369c546-ea63-4144-927c-c813a0797cb6",
  "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
  "assignment_id": "0485cf1c-3cb2-4792-8baa-34e27a7ecc5b",
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

`POST /api/driver/v1/trips/7369c546-ea63-4144-927c-c813a0797cb6/cancel` → **200**

```json
{
  "command_id": "d26b26ac-6529-4999-b122-87b3b352cf14",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "7369c546-ea63-4144-927c-c813a0797cb6",
  "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
  "assignment_id": "0485cf1c-3cb2-4792-8baa-34e27a7ecc5b",
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
    "id": "b95cc7de-58c9-4127-8070-ad514182c852",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:55:03.491957Z",
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
    "id": "fa2792fc-2339-434a-9c5a-f2112154a501",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:55:00.567872Z",
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

`GET /api/operator/v1/orders/b95cc7de-58c9-4127-8070-ad514182c852/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:55:03.492619Z",
      "actor": {
        "type": "CLIENT",
        "id": "a6f2ec16-5f8a-4f74-9e6c-d9a1c6670647",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
        "quote_id": "0148ed48-048f-41da-a96e-5b5f6be348d2",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "8d2ab598-6a67-4b01-bd74-b14716f9e346"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:55:03.495033Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
        "attempt_id": "8fe0f43f-f8d1-41e0-87e3-510dd7074b84",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8d2ab598-6a67-4b01-bd74-b14716f9e346"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:55:03.502554Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8e512c09-5054-4f88-bda5-868c62035c59",
        "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "8d2ab598-6a67-4b01-bd74-b14716f9e346"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:55:04.07287Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8e512c09-5054-4f88-bda5-868c62035c59",
        "order_id": "b95cc7de-58c9-4127-8070-ad514182c852",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "64bc95b1-5fcd-48a9-a55b-0965765ae230"
      },
      "correlation_id": "d4bcd150-c125-42ac-88cc-c3f2c16ea6f6"
```

Done: orders fa2792fc-2339-434a-9c5a-f2112154a501, b95cc7de-58c9-4127-8070-ad514182c852.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733001731",
  "device_ref": "sandbox-17755"
}
```

```json
{
  "challenge_id": "3c40994d-5ff3-4ac1-8941-44fca0dfc72e",
  "expires_at": "2026-10-29T08:00:06.876849133Z",
  "resend_available_at": "2026-10-29T07:55:07.876849133Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733001731` → **200**

```json
{
  "phone": "+380733001731",
  "audience": "CLIENT",
  "code": "086994",
  "sent_at": "2026-10-29T07:55:06.880657528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c40994d-5ff3-4ac1-8941-44fca0dfc72e",
  "code": "086994",
  "device_ref": "sandbox-17755"
}
```

```json
{
  "session_id": "fb6dd3fe-7990-4bb2-bb0f-e0084634b44f",
  "subject": {
    "type": "CLIENT",
    "id": "523ce892-1a88-4488-9135-197d0a0eb07e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MjNjZTg5Mi0xYTg4LTQ0ODgtOTEzNS0xOTdkMGEwZWIwN2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDA3LCJpYXQiOjE3OTMyNjA1MDcsImp0aSI6IjFlNzkyYTBjLWUwYmItNDgyOS1iNGU1LTU2YjY0MjAxOGNjZSIsInNpZCI6ImZiNmRkM2ZlLTc5OTAtNGJiMi1iYjBmLWUwMDg0NjM0YjQ0ZiJ9.igFb1uc71B0C5K0GRbzelJda3rMaXEXfGPQXsoklrpE",
  "access_expires_at": "2026-10-29T08:10:07.181755863Z",
  "refresh_token": "Xlr4SjglxP0xlOgDB1Pd82fBt13MQd-_EjzZvTX1pc0",
  "refresh_expires_at": "2026-11-28T07:55:07.181194241Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "71ebd32c-11bd-469c-b9e4-7630fa28c18c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e6002e32-f742-4390-a615-f8c24708cd16",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e6002e32-f742-4390-a615-f8c24708cd16",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "c052c3f6a64a11ba3c2d286b126017f0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e6002e32-f742-4390-a615-f8c24708cd16",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733001731"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e6002e32-f742-4390-a615-f8c24708cd16",
  "expires_at": "2026-10-29T08:25:07.455204Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e6002e32-f742-4390-a615-f8c24708cd16` → **200**

```json
{
  "id": "e6002e32-f742-4390-a615-f8c24708cd16",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:25:07.455204Z",
  "card": {
    "id": "989c71de-961f-445e-9503-60e15795840c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6656",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:55:07.750403Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "989c71de-961f-445e-9503-60e15795840c",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6656",
      "card_type": "Visa",
      "created_at": "2026-10-29T07:55:07.750403Z"
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
  "device_ref": "sandbox-27357"
}
```

```json
{
  "challenge_id": "27c255b3-0502-4b9e-950a-768cd1de44ea",
  "expires_at": "2026-10-29T08:00:08.299909118Z",
  "resend_available_at": "2026-10-29T07:55:09.299909118Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "164264",
  "sent_at": "2026-10-29T07:55:08.302968504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27c255b3-0502-4b9e-950a-768cd1de44ea",
  "code": "164264",
  "device_ref": "sandbox-27357"
}
```

```json
{
  "session_id": "df00aa41-3a50-47d3-8d07-4628983f4125",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTQwOCwiaWF0IjoxNzkzMjYwNTA4LCJqdGkiOiI4NTdkNzc3Yy04OGI2LTQyYzctODhlYS0wZGJjOWFlYzA4N2UiLCJzaWQiOiJkZjAwYWE0MS0zYTUwLTQ3ZDMtOGQwNy00NjI4OTgzZjQxMjUifQ.dP63pw9Ne4fZhZSA8P1DRr65-WicQnX5xAl-iAne4PM",
  "access_expires_at": "2026-10-29T08:10:08.615312149Z",
  "refresh_token": "SBe2CZHUYfKRyFb1TMPP25n64Iw-hMBn-fx0EswZ8WI",
  "refresh_expires_at": "2026-11-28T07:55:08.614715489Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "66dc0e74-a210-414d-8676-7b4514075a8a",
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
  "last_heartbeat_at": "2026-10-29T07:55:02.906758Z",
  "last_location_at": "2026-10-29T07:55:02.906758Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/66dc0e74-a210-414d-8676-7b4514075a8a/handover` → **200**

```json
{
  "command_id": "645875f1-0975-4b4a-b2b4-30b8ebbee8f1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "66dc0e74-a210-414d-8676-7b4514075a8a",
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
  "last_heartbeat_at": "2026-10-29T07:55:02.906758Z",
  "last_location_at": "2026-10-29T07:55:02.906758Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/66dc0e74-a210-414d-8676-7b4514075a8a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:55:09Z",
    "sequence": 1793260509441
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "66dc0e74-a210-414d-8676-7b4514075a8a",
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
  "last_heartbeat_at": "2026-10-29T07:55:09.460774Z",
  "last_location_at": "2026-10-29T07:55:09.460774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "658972b1-3cd4-4a30-ae44-61e53114a65c",
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
  "id": "e935389e-e3b2-4364-8ff7-16758ed73958",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:09.768105Z",
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
  "command_id": "c23b7aed-1b63-4a51-8713-b44b870a3eb6",
  "quote_id": "e935389e-e3b2-4364-8ff7-16758ed73958",
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
  "id": "367a231a-7c92-4244-a34f-593f324c0617",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
  "created_at": "2026-10-29T07:55:10.058899Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/367a231a-7c92-4244-a34f-593f324c0617` → **200**

```json
{
  "id": "367a231a-7c92-4244-a34f-593f324c0617",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
  "created_at": "2026-10-29T07:55:10.058899Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/367a231a-7c92-4244-a34f-593f324c0617` → **200**

```json
{
  "id": "367a231a-7c92-4244-a34f-593f324c0617",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
  "created_at": "2026-10-29T07:55:10.058899Z",
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
    "id": "fab1337c-e631-4835-9190-bdf0649b7360",
    "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
    "expires_at": "2026-10-29T07:55:25.982963Z",
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

`POST /api/driver/v1/offers/fab1337c-e631-4835-9190-bdf0649b7360/accept` → **200**

```json
{
  "command_id": "9363d94f-3693-419a-9ced-04214b775f74"
}
```

```json
{
  "id": "f84acb67-dc41-47f3-9913-0dd7f03c6081",
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b0c601e-fa9c-430f-b97d-d41f852a9f11",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b0c601e-fa9c-430f-b97d-d41f852a9f11",
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
  "assignment_id": "f84acb67-dc41-47f3-9913-0dd7f03c6081",
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

`POST /api/driver/v1/work-sessions/66dc0e74-a210-414d-8676-7b4514075a8a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:55:12Z",
    "sequence": 1793260512764
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "66dc0e74-a210-414d-8676-7b4514075a8a",
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
  "last_heartbeat_at": "2026-10-29T07:55:12.784839Z",
  "last_location_at": "2026-10-29T07:55:12.784839Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3b0c601e-fa9c-430f-b97d-d41f852a9f11/arrive` → **200**

```json
{
  "command_id": "f09e9112-4062-47a3-b147-8cbcd0df6916",
  "expected_version": 0
}
```

```json
{
  "id": "3b0c601e-fa9c-430f-b97d-d41f852a9f11",
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
  "assignment_id": "f84acb67-dc41-47f3-9913-0dd7f03c6081",
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
  "arrived_at": "2026-10-29T07:55:13.082613Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b0c601e-fa9c-430f-b97d-d41f852a9f11/start` → **200**

```json
{
  "command_id": "2bb8625f-848d-4400-b7e9-4f8af0d9e41f",
  "expected_version": 1
}
```

```json
{
  "id": "3b0c601e-fa9c-430f-b97d-d41f852a9f11",
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
  "assignment_id": "f84acb67-dc41-47f3-9913-0dd7f03c6081",
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
  "arrived_at": "2026-10-29T07:55:13.082613Z",
  "started_at": "2026-10-29T07:55:13.379118Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3b0c601e-fa9c-430f-b97d-d41f852a9f11/complete` → **200**

```json
{
  "command_id": "198dbaec-2323-4277-b8c2-32a625b3bdeb",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:55:13Z",
  "cash_received": true
}
```

```json
{
  "id": "3b0c601e-fa9c-430f-b97d-d41f852a9f11",
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
  "assignment_id": "f84acb67-dc41-47f3-9913-0dd7f03c6081",
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
  "arrived_at": "2026-10-29T07:55:13.082613Z",
  "started_at": "2026-10-29T07:55:13.379118Z",
  "completed_at": "2026-10-29T07:55:13.670978Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/367a231a-7c92-4244-a34f-593f324c0617` → **200**

```json
{
  "id": "367a231a-7c92-4244-a34f-593f324c0617",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
    "id": "f84acb67-dc41-47f3-9913-0dd7f03c6081",
    "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b0c601e-fa9c-430f-b97d-d41f852a9f11",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:55:10.058899Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/367a231a-7c92-4244-a34f-593f324c0617` → **200**

```json
{
  "id": "367a231a-7c92-4244-a34f-593f324c0617",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
    "id": "f84acb67-dc41-47f3-9913-0dd7f03c6081",
    "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b0c601e-fa9c-430f-b97d-d41f852a9f11",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:55:10.058899Z",
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

`GET /api/rider/v1/orders/367a231a-7c92-4244-a34f-593f324c0617/tip` → **200**

```json
{
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
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
  "available_until": "2026-10-30T07:55:13.670978Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/367a231a-7c92-4244-a34f-593f324c0617/tip` → **201**

```json
{
  "command_id": "2759d8e3-416a-45f8-821e-771a13372cf1",
  "amount_minor": 2500
}
```

```json
{
  "id": "a9dd5a17-1f0f-4ed4-a79c-5ffb50280b41",
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:55:16.093563Z"
}
```

`GET /api/rider/v1/orders/367a231a-7c92-4244-a34f-593f324c0617/tip` → **200**

```json
{
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
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
  "available_until": "2026-10-30T07:55:13.670978Z",
  "open": false,
  "tip": {
    "id": "a9dd5a17-1f0f-4ed4-a79c-5ffb50280b41",
    "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T07:55:16.093563Z"
  }
}
```

`GET /api/rider/v1/orders/367a231a-7c92-4244-a34f-593f324c0617/tip` → **200**

```json
{
  "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
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
  "available_until": "2026-10-30T07:55:13.670978Z",
  "open": false,
  "tip": {
    "id": "a9dd5a17-1f0f-4ed4-a79c-5ffb50280b41",
    "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:55:16.093563Z"
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
      "id": "604906c5-14f3-4275-9bf1-b0b2de745d76",
      "at": "2026-10-29T07:55:14.036135Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
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
      "id": "5c0bb11a-8110-46bf-9eda-01f9f234a975",
      "at": "2026-10-29T07:55:18.090709Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
      "counterpart_id": null
    },
    {
      "id": "604906c5-14f3-4275-9bf1-b0b2de745d76",
      "at": "2026-10-29T07:55:14.036135Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a56806f0-d517-4bbe-9fe6-d05d90b25c2a",
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
  "id": "2c4cb476-3a6e-4d2c-a108-ca6ea6e05e91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:19.489686Z",
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
  "session_id": "81c68db5-56b7-448c-9dfc-3563bee8a733",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0MjAsImlhdCI6MTc5MzI2MDUyMCwianRpIjoiNzU2NDhkM2ItNDc3NS00ZTYzLWI4NGMtZDY4MmZkMjk4M2VjIiwic2lkIjoiODFjNjhkYjUtNTZiNy00NDhjLTlkZmMtMzU2M2JlZThhNzMzIn0.pEVjRp5LNz9TCld7R0nar6caFzB9WRadu1ES2q8oLsU",
  "access_expires_at": "2026-10-29T08:10:20.082996858Z",
  "refresh_token": "XWjp6mgpqmjH9MoMVNNySKP4w530WKcrbK1jVXT7X48",
  "refresh_expires_at": "2026-10-29T19:55:20.082418494Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733001731` → **200**

```json
{
  "client_id": "523ce892-1a88-4488-9135-197d0a0eb07e"
}
```

`POST /api/admin/v1/rider-wallets/523ce892-1a88-4488-9135-197d0a0eb07e/top-ups` → **201**

```json
{
  "command_id": "daa42d10-537d-4688-a89b-d1300b3f10ac",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
      "id": "3dfae5d2-cdb3-45ba-91eb-91e4a6fcf0b9",
      "at": "2026-10-29T07:55:20.615189Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "edabc6d0-3128-4ece-9c98-8d59eadc3a3e",
  "quote_id": "2c4cb476-3a6e-4d2c-a108-ca6ea6e05e91",
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
  "id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
  "created_at": "2026-10-29T07:55:20.910451Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2fba311-3e1f-46ad-8ea9-2d5ed56e9538` → **200**

```json
{
  "id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
  "created_at": "2026-10-29T07:55:20.910451Z",
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
    "id": "58517030-99c4-4ab8-bc48-56bf7ef11f8b",
    "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
    "expires_at": "2026-10-29T07:55:35.916198Z",
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

`POST /api/driver/v1/offers/58517030-99c4-4ab8-bc48-56bf7ef11f8b/accept` → **200**

```json
{
  "command_id": "ef7491f8-5234-4fae-8328-4a3d3d2a017f"
}
```

```json
{
  "id": "6e451d2c-fa76-480d-a0bd-0b81356d7a77",
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c3d0a8b2-1b8e-4052-adc8-daef589659ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c3d0a8b2-1b8e-4052-adc8-daef589659ac",
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
  "assignment_id": "6e451d2c-fa76-480d-a0bd-0b81356d7a77",
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

`POST /api/driver/v1/work-sessions/66dc0e74-a210-414d-8676-7b4514075a8a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:55:22Z",
    "sequence": 1793260522324
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "66dc0e74-a210-414d-8676-7b4514075a8a",
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
  "last_heartbeat_at": "2026-10-29T07:55:22.343193Z",
  "last_location_at": "2026-10-29T07:55:22.343193Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c3d0a8b2-1b8e-4052-adc8-daef589659ac/arrive` → **200**

```json
{
  "command_id": "5b4c8a4a-ee8d-4fe5-8b17-0b1d7932651d",
  "expected_version": 0
}
```

```json
{
  "id": "c3d0a8b2-1b8e-4052-adc8-daef589659ac",
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
  "assignment_id": "6e451d2c-fa76-480d-a0bd-0b81356d7a77",
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
  "arrived_at": "2026-10-29T07:55:22.627431Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c3d0a8b2-1b8e-4052-adc8-daef589659ac/start` → **200**

```json
{
  "command_id": "afc8dbdc-bd9f-458a-905c-1c3979d4640d",
  "expected_version": 1
}
```

```json
{
  "id": "c3d0a8b2-1b8e-4052-adc8-daef589659ac",
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
  "assignment_id": "6e451d2c-fa76-480d-a0bd-0b81356d7a77",
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
  "arrived_at": "2026-10-29T07:55:22.627431Z",
  "started_at": "2026-10-29T07:55:22.93825Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c3d0a8b2-1b8e-4052-adc8-daef589659ac/complete` → **200**

```json
{
  "command_id": "9ea7a87d-f3ff-41c8-bd4d-9a2be94a3dc6",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:55:23Z",
  "cash_received": true
}
```

```json
{
  "id": "c3d0a8b2-1b8e-4052-adc8-daef589659ac",
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
  "assignment_id": "6e451d2c-fa76-480d-a0bd-0b81356d7a77",
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
  "arrived_at": "2026-10-29T07:55:22.627431Z",
  "started_at": "2026-10-29T07:55:22.93825Z",
  "completed_at": "2026-10-29T07:55:23.242113Z",
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
  "client_id": "523ce892-1a88-4488-9135-197d0a0eb07e",
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
      "id": "3dfae5d2-cdb3-45ba-91eb-91e4a6fcf0b9",
      "at": "2026-10-29T07:55:20.615189Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "154415a5-2c56-488b-931a-26ab06629f74",
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

`GET /api/rider/v1/orders/c2fba311-3e1f-46ad-8ea9-2d5ed56e9538/tip` → **200**

```json
{
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
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
  "available_until": "2026-10-30T07:55:23.242113Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c2fba311-3e1f-46ad-8ea9-2d5ed56e9538/tip` → **201**

```json
{
  "command_id": "c0299cc2-ea7d-4847-8a58-7789d603a4b0",
  "amount_minor": 2500
}
```

```json
{
  "id": "170522c8-57b8-4993-b4e0-ba0f229369a7",
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:55:24.362865Z"
}
```

`GET /api/rider/v1/orders/c2fba311-3e1f-46ad-8ea9-2d5ed56e9538/tip` → **200**

```json
{
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
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
  "available_until": "2026-10-30T07:55:23.242113Z",
  "open": false,
  "tip": {
    "id": "170522c8-57b8-4993-b4e0-ba0f229369a7",
    "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T07:55:24.362865Z"
  }
}
```

`GET /api/rider/v1/orders/c2fba311-3e1f-46ad-8ea9-2d5ed56e9538/tip` → **200**

```json
{
  "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
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
  "available_until": "2026-10-30T07:55:23.242113Z",
  "open": false,
  "tip": {
    "id": "170522c8-57b8-4993-b4e0-ba0f229369a7",
    "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:55:24.362865Z"
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
      "id": "5cfc394a-3e07-4b00-b410-1f4b91e2433c",
      "at": "2026-10-29T07:55:26.165891Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
      "counterpart_id": null
    },
    {
      "id": "de2ea90a-41a9-4f7d-a60f-d45c64166420",
      "at": "2026-10-29T07:55:24.142892Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c2fba311-3e1f-46ad-8ea9-2d5ed56e9538",
      "counterpart_id": null
    },
    {
      "id": "5c0bb11a-8110-46bf-9eda-01f9f234a975",
      "at": "2026-10-29T07:55:18.090709Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
      "counterpart_id": null
    },
    {
      "id": "604906c5-14f3-4275-9bf1-b0b2de745d76",
      "at": "2026-10-29T07:55:14.036135Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "367a231a-7c92-4244-a34f-593f324c0617",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "66dc0e74-a210-414d-8676-7b4514075a8a",
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
  "last_heartbeat_at": "2026-10-29T07:55:22.343193Z",
  "last_location_at": "2026-10-29T07:55:22.343193Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/66dc0e74-a210-414d-8676-7b4514075a8a/close` → **200**

```json
{
  "command_id": "ae0a3aca-6db8-47d9-955e-8bfb98ef63ab",
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

Done: card order c2fba311-3e1f-46ad-8ea9-2d5ed56e9538.

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
  "phone": "+380730511852",
  "device_ref": "sandbox-12759"
}
```

```json
{
  "challenge_id": "130501f0-3c33-4569-9713-7feb9fa31dae",
  "expires_at": "2026-10-29T08:00:27.318284478Z",
  "resend_available_at": "2026-10-29T07:55:28.318284478Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730511852` → **200**

```json
{
  "phone": "+380730511852",
  "audience": "CLIENT",
  "code": "325178",
  "sent_at": "2026-10-29T07:55:27.32117309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "130501f0-3c33-4569-9713-7feb9fa31dae",
  "code": "325178",
  "device_ref": "sandbox-12759"
}
```

```json
{
  "session_id": "002eff68-8685-4afc-aa01-549bf100fc0a",
  "subject": {
    "type": "CLIENT",
    "id": "beb87b06-54db-4dda-8134-c93ce4ea4aa0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZWI4N2IwNi01NGRiLTRkZGEtODEzNC1jOTNjZTRlYTRhYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDI3LCJpYXQiOjE3OTMyNjA1MjcsImp0aSI6ImJiNzVjNWQ4LWU2NzAtNDA3Ny1hYmRiLTM2Mjg5ZDA4YTQ4YyIsInNpZCI6IjAwMmVmZjY4LTg2ODUtNGFmYy1hYTAxLTU0OWJmMTAwZmMwYSJ9.F2M3eTIfXhJG7iau7ljl-YThRKIgXQepqH_YXd400CM",
  "access_expires_at": "2026-10-29T08:10:27.611670127Z",
  "refresh_token": "XKQsRpguNkT2UPCIEYSGA9IFgAuWvJZy1hP4vAICsuk",
  "refresh_expires_at": "2026-11-28T07:55:27.611036209Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "b7b2b4be-12ba-4ca2-92b1-bb802cde0bd2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "4b687e34-9cc0-4d5c-a0b8-4399d7c1d87d",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4b687e34-9cc0-4d5c-a0b8-4399d7c1d87d",
    "orderDate": "1793260527",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8bf8a6c7507e6751cffcb8b5ca21caaa",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4b687e34-9cc0-4d5c-a0b8-4399d7c1d87d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730511852"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4b687e34-9cc0-4d5c-a0b8-4399d7c1d87d",
  "created_at": "2026-10-29T07:55:27.887853Z",
  "expires_at": "2026-10-29T08:25:27.887853Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/4b687e34-9cc0-4d5c-a0b8-4399d7c1d87d` → **200**

```json
{
  "id": "4b687e34-9cc0-4d5c-a0b8-4399d7c1d87d",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:55:27.887853Z",
  "expires_at": "2026-10-29T08:25:27.887853Z",
  "completed_at": "2026-10-29T07:55:28.16983Z",
  "masked_pan": "41****3167",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "beb87b06-54db-4dda-8134-c93ce4ea4aa0",
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
      "id": "d718b035-f4ab-4b08-a8a3-8afa6c95838f",
      "at": "2026-10-29T07:55:28.193402Z",
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
  "client_id": "beb87b06-54db-4dda-8134-c93ce4ea4aa0",
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
      "id": "d718b035-f4ab-4b08-a8a3-8afa6c95838f",
      "at": "2026-10-29T07:55:28.193402Z",
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
  "device_ref": "sandbox-8749"
}
```

```json
{
  "challenge_id": "0735802b-d7ef-4ffe-b0c9-2b061b3e7c60",
  "expires_at": "2026-10-29T08:00:29.013598666Z",
  "resend_available_at": "2026-10-29T07:55:30.013598666Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "185734",
  "sent_at": "2026-10-29T07:55:29.016127083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0735802b-d7ef-4ffe-b0c9-2b061b3e7c60",
  "code": "185734",
  "device_ref": "sandbox-8749"
}
```

```json
{
  "session_id": "013f0e04-4acb-40fd-8681-1579007eabb4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTQyOSwiaWF0IjoxNzkzMjYwNTI5LCJqdGkiOiIwNzNlZmE0OC02NGJjLTQwYjctYTQ2MS03YmVjYjQzYjlmYzUiLCJzaWQiOiIwMTNmMGUwNC00YWNiLTQwZmQtODY4MS0xNTc5MDA3ZWFiYjQifQ.7pb8TQtYFUl-ttUe1qtNqs4qMdM9ED91jXDx1IhZ7-w",
  "access_expires_at": "2026-10-29T08:10:29.310310466Z",
  "refresh_token": "qOLt1a_wvGQzR5VScD5UwlNaYTHMdV6wjHQRbqFN3TE",
  "refresh_expires_at": "2026-11-28T07:55:29.309756819Z",
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
  "command_id": "b7c01fc6-32be-4f80-9310-71327800eaaf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "86d4d2cf-6aff-496f-8ff6-0e14ea81a8d4",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-86d4d2cf-6aff-496f-8ff6-0e14ea81a8d4",
    "orderDate": "1793260529",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "9e728d64477d3dd3a3b7cc1b3cda04c1",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=86d4d2cf-6aff-496f-8ff6-0e14ea81a8d4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=86d4d2cf-6aff-496f-8ff6-0e14ea81a8d4",
  "created_at": "2026-10-29T07:55:29.844404Z",
  "expires_at": "2026-10-29T08:25:29.844404Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/86d4d2cf-6aff-496f-8ff6-0e14ea81a8d4` → **200**

```json
{
  "id": "86d4d2cf-6aff-496f-8ff6-0e14ea81a8d4",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:55:29.844404Z",
  "expires_at": "2026-10-29T08:25:29.844404Z",
  "completed_at": "2026-10-29T07:55:30.125507Z",
  "masked_pan": "41****3228",
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
      "id": "ad127a21-2fb3-4bf1-a54a-d3e0544db227",
      "at": "2026-10-29T07:55:30.199809Z",
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
  "command_id": "29c3e4b5-0cc3-4683-8843-4f4028009558",
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
  "correlation_id": "4a2d8747-fc3a-4cc9-be90-4304b935cf7b"
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
  "device_ref": "sandbox-28061"
}
```

```json
{
  "challenge_id": "3959377a-07c9-469d-9796-b967a4440830",
  "expires_at": "2026-10-29T08:00:30.982158366Z",
  "resend_available_at": "2026-10-29T07:55:31.982158366Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "298199",
  "sent_at": "2026-10-29T07:55:30.984761383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3959377a-07c9-469d-9796-b967a4440830",
  "code": "298199",
  "device_ref": "sandbox-28061"
}
```

```json
{
  "session_id": "ef178e60-91a7-414c-b66f-fd0c16d5e710",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTQzMSwiaWF0IjoxNzkzMjYwNTMxLCJqdGkiOiJhODEyNDgzMi0xYWQyLTRkNzAtOGUzYy05YjdiNjAxNzhjNDYiLCJzaWQiOiJlZjE3OGU2MC05MWE3LTQxNGMtYjY2Zi1mZDBjMTZkNWU3MTAifQ.2NOTO3FIcdhFFlzO3XlSpHI3a01JxPkm4F0NlK0qgU0",
  "access_expires_at": "2026-10-29T08:10:31.279969726Z",
  "refresh_token": "X-KXJm5YGzEUmBxkRo46s87HtP9_xkQ68fKnzb7Pd78",
  "refresh_expires_at": "2026-11-28T07:55:31.279426468Z",
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
  "command_id": "389d69c8-2340-4e7a-b5bd-8f0e7aa1cef6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:55:31Z",
    "sequence": 1793260531823
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99a567b4-33fd-458a-a88f-b94295e33293",
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
  "last_heartbeat_at": "2026-10-29T07:55:31.842399Z",
  "last_location_at": "2026-10-29T07:55:31.842399Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630663700",
  "device_ref": "sandbox-8023"
}
```

```json
{
  "challenge_id": "e527ec9f-7ce4-491c-9656-20ceae20125f",
  "expires_at": "2026-10-29T08:00:32.119401409Z",
  "resend_available_at": "2026-10-29T07:55:33.119401409Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630663700` → **200**

```json
{
  "phone": "+380630663700",
  "audience": "CLIENT",
  "code": "301202",
  "sent_at": "2026-10-29T07:55:32.121991832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e527ec9f-7ce4-491c-9656-20ceae20125f",
  "code": "301202",
  "device_ref": "sandbox-8023"
}
```

```json
{
  "session_id": "41c85202-cd2e-4f7d-abec-14027d586153",
  "subject": {
    "type": "CLIENT",
    "id": "e67ed118-6288-4288-b520-d0529e387f6e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjdlZDExOC02Mjg4LTQyODgtYjUyMC1kMDUyOWUzODdmNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDMyLCJpYXQiOjE3OTMyNjA1MzIsImp0aSI6ImIzZjNjMmRjLTBhNmQtNDI1Yi04M2Q2LTQ1NWM4MjE2NDUwZiIsInNpZCI6IjQxYzg1MjAyLWNkMmUtNGY3ZC1hYmVjLTE0MDI3ZDU4NjE1MyJ9.ka9jOE6FszoZb5oCeWRTYOhTtQR2A8Qv-huZFAmc6cA",
  "access_expires_at": "2026-10-29T08:10:32.448305607Z",
  "refresh_token": "H1WT0qrqip_ZM0lj5-ThTGYiwLcsKwxb6CP1i2MxANE",
  "refresh_expires_at": "2026-11-28T07:55:32.447707487Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c772a525-893a-4bb9-ae5f-b2bc24100e39",
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
  "id": "73b2f62c-52bc-44fb-82e8-a04b02fcc75a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:32.731157Z",
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
  "command_id": "9112b788-5003-4030-b842-63d6e5ec3818",
  "quote_id": "73b2f62c-52bc-44fb-82e8-a04b02fcc75a",
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
  "id": "966ef850-6c86-4d4a-884c-38e0d0138258",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e67ed118-6288-4288-b520-d0529e387f6e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:55:33.02644Z",
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
    "id": "d18e9db9-c7b0-49be-8ae3-349700cb67b2",
    "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
    "expires_at": "2026-10-29T07:55:48.029854Z",
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

`POST /api/driver/v1/offers/d18e9db9-c7b0-49be-8ae3-349700cb67b2/accept` → **200**

```json
{
  "command_id": "cea61c7f-d400-4c72-9f09-03ca29fb917d"
}
```

```json
{
  "id": "6794494c-2c9d-4fd1-af6d-0cc68d14c6b9",
  "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "21ca26ac-c7b9-4471-ba22-b6e32db27ca2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "21ca26ac-c7b9-4471-ba22-b6e32db27ca2",
  "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
  "assignment_id": "6794494c-2c9d-4fd1-af6d-0cc68d14c6b9",
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

`POST /api/driver/v1/work-sessions/99a567b4-33fd-458a-a88f-b94295e33293/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:55:34Z",
    "sequence": 1793260534145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99a567b4-33fd-458a-a88f-b94295e33293",
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
  "last_heartbeat_at": "2026-10-29T07:55:34.16515Z",
  "last_location_at": "2026-10-29T07:55:34.16515Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/21ca26ac-c7b9-4471-ba22-b6e32db27ca2/arrive` → **200**

```json
{
  "command_id": "68c4c873-6400-43a2-adc0-dfcbd05f5d6c",
  "expected_version": 0
}
```

```json
{
  "id": "21ca26ac-c7b9-4471-ba22-b6e32db27ca2",
  "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
  "assignment_id": "6794494c-2c9d-4fd1-af6d-0cc68d14c6b9",
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
  "arrived_at": "2026-10-29T07:55:34.441687Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/21ca26ac-c7b9-4471-ba22-b6e32db27ca2/start` → **200**

```json
{
  "command_id": "b7008a0c-9869-49cf-b5c2-f88ff27c6096",
  "expected_version": 1
}
```

```json
{
  "id": "21ca26ac-c7b9-4471-ba22-b6e32db27ca2",
  "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
  "assignment_id": "6794494c-2c9d-4fd1-af6d-0cc68d14c6b9",
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
  "arrived_at": "2026-10-29T07:55:34.441687Z",
  "started_at": "2026-10-29T07:55:34.717144Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/21ca26ac-c7b9-4471-ba22-b6e32db27ca2/complete` → **200**

```json
{
  "command_id": "cea996a6-a07f-4a8e-8227-1662180d93cc",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:55:34Z",
  "cash_received": false
}
```

```json
{
  "id": "21ca26ac-c7b9-4471-ba22-b6e32db27ca2",
  "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
  "assignment_id": "6794494c-2c9d-4fd1-af6d-0cc68d14c6b9",
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
  "arrived_at": "2026-10-29T07:55:34.441687Z",
  "started_at": "2026-10-29T07:55:34.717144Z",
  "completed_at": "2026-10-29T07:55:35.003841Z",
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
  "session_id": "5ad162f5-6a81-4462-8cb6-4dd9551b2cef",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0MzUsImlhdCI6MTc5MzI2MDUzNSwianRpIjoiNWFmMTI3NGYtZTZjZC00ZmI0LTgyMmUtMzVjZDUyZGFlMTAwIiwic2lkIjoiNWFkMTYyZjUtNmE4MS00NDYyLThjYjYtNGRkOTU1MWIyY2VmIn0.t1__uP6X9lrBOgpPmEVUJtszn_Ascho9xhcGjEEOhXs",
  "access_expires_at": "2026-10-29T08:10:35.601813215Z",
  "refresh_token": "fyTtrmBy_J8NCHujQDXSWxX7M3XntcVsU2kRg-uspOc",
  "refresh_expires_at": "2026-10-29T19:55:35.601261261Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/966ef850-6c86-4d4a-884c-38e0d0138258/cash-dispute` → **200**

```json
{
  "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e67ed118-6288-4288-b520-d0529e387f6e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:55:35.251175Z",
  "decide_by": "2026-11-12T07:55:35.251175Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T07:55:35.251175Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "e67ed118-6288-4288-b520-d0529e387f6e",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T07:55:35.251175Z",
      "decide_by": "2026-11-12T07:55:35.251175Z",
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

`POST /api/admin/v1/orders/966ef850-6c86-4d4a-884c-38e0d0138258/cash-dispute/decide` → **400**

```json
{
  "command_id": "2f82b82a-db1f-4335-a973-78b7c70e2662",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/966ef850-6c86-4d4a-884c-38e0d0138258/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6786fb13-68d9-4f4d-ac78-2215116c2f1c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/966ef850-6c86-4d4a-884c-38e0d0138258/cash-dispute/decide` → **200**

```json
{
  "command_id": "96e06631-b360-4b8e-834e-4943c77f0f68",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "e67ed118-6288-4288-b520-d0529e387f6e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:55:35.251175Z",
  "decide_by": "2026-11-12T07:55:35.251175Z",
  "decision": "PAY_DRIVER",
  "decided_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T07:55:36.729103Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/966ef850-6c86-4d4a-884c-38e0d0138258/cash-dispute/decide` → **409**

```json
{
  "command_id": "4c0f9ac0-d86f-4e04-91ba-a2b788776881",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/966ef850-6c86-4d4a-884c-38e0d0138258/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "94d737c2-a3e6-4f2b-b0f6-4102732f3829"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99a567b4-33fd-458a-a88f-b94295e33293",
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
  "last_heartbeat_at": "2026-10-29T07:55:34.16515Z",
  "last_location_at": "2026-10-29T07:55:34.16515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99a567b4-33fd-458a-a88f-b94295e33293/close` → **200**

```json
{
  "command_id": "99c2d726-a797-4a05-a1bc-d8d75ecdbd08",
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
  "session_id": "441e8255-3600-4ff1-9f3f-025a2dbb281f",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0MzgsImlhdCI6MTc5MzI2MDUzOCwianRpIjoiNjg3MmFiNmQtZjA3OC00OGE4LWE4OTAtYjA5YjA0YTZmYzIwIiwic2lkIjoiNDQxZTgyNTUtMzYwMC00ZmYxLTlmM2YtMDI1YTJkYmIyODFmIn0.uwo4n-2Y08hQFfD_P2v_Bll1JO_LBvUkb8w7DTCNan0",
  "access_expires_at": "2026-10-29T08:10:38.158475444Z",
  "refresh_token": "UULOoCEdeG9dtu_POfvkMzQlpKUF_pZmzDbmCkBgarQ",
  "refresh_expires_at": "2026-10-29T19:55:38.157946173Z",
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
  "phone": "+48600469276",
  "device_ref": "sandbox-6564"
}
```

```json
{
  "challenge_id": "39b3436a-6fd9-4913-b7ba-5b9429261e7a",
  "expires_at": "2026-10-29T08:00:38.998563008Z",
  "resend_available_at": "2026-10-29T07:55:39.998563008Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600469276` → **200**

```json
{
  "phone": "+48600469276",
  "audience": "CLIENT",
  "code": "322590",
  "sent_at": "2026-10-29T07:55:39.000948827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39b3436a-6fd9-4913-b7ba-5b9429261e7a",
  "code": "322590",
  "device_ref": "sandbox-6564"
}
```

```json
{
  "session_id": "fc28cd0c-da4c-4b21-8de5-173bc483f42b",
  "subject": {
    "type": "CLIENT",
    "id": "d79ad211-0dd5-4889-b630-41ce0fd8c6c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzlhZDIxMS0wZGQ1LTQ4ODktYjYzMC00MWNlMGZkOGM2YzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDM5LCJpYXQiOjE3OTMyNjA1MzksImp0aSI6ImQxNGVmZGRjLTI4YjYtNDgxNy05ZGEyLTY5ZDA1YmUzNThmNSIsInNpZCI6ImZjMjhjZDBjLWRhNGMtNGIyMS04ZGU1LTE3M2JjNDgzZjQyYiJ9.PVcF-7b0C9TfSCv0AXztZrsYex-PkNyePzeAg4DvbXM",
  "access_expires_at": "2026-10-29T08:10:39.291833809Z",
  "refresh_token": "KqYWY_KG5DofpPZ3rfzUpE6rrZepYixCH826FsbzvqE",
  "refresh_expires_at": "2026-11-28T07:55:39.291197789Z",
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
  "command_id": "6a681dbb-d546-42b9-af41-939079c26776",
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
  "correlation_id": "162e4ee4-c190-4b82-b085-e8932cbfa069",
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
  "command_id": "c6874a9d-146e-4855-bf9e-59886019041f",
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
  "paused_at": "2026-10-29T07:55:40.387548518Z",
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
  "command_id": "222b675b-7970-40f4-9e92-621fff5fa7d1",
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
  "id": "00beb0c3-c1cc-4280-9e66-8a5f13aeae1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:40.974795Z",
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
  "command_id": "dbb69a98-f9f5-4223-a4c2-5a5cb875dd13",
  "quote_id": "00beb0c3-c1cc-4280-9e66-8a5f13aeae1e",
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
  "correlation_id": "ae4aeeca-a263-45bd-a0f0-7660139a8790"
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
  "paused_at": "2026-10-29T07:55:40.387549Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "56125ca9-d9b7-416d-a72b-4839d0fcdc63",
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
  "command_id": "cb75223f-412d-4a0c-ae3f-ee6b02a17dff",
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
  "command_id": "e1140223-c3d9-4d57-a9ed-f1aa54b555f9",
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
  "id": "e40f7d8e-335e-47da-8627-ea099be73649",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:42.676230Z",
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
  "command_id": "277b0136-06d6-4f92-9454-8b98fce93757",
  "quote_id": "e40f7d8e-335e-47da-8627-ea099be73649",
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
  "correlation_id": "5bee9e3f-c20f-4734-b94e-a1804ac5d949"
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
  "command_id": "2e93c6e8-c3dd-46b4-b82f-72e9cbde850a",
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
  "command_id": "2866fadb-139a-404c-ba23-e6ba1fce4e31",
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
  "id": "a18dfe87-7f7b-4042-934a-6bf9246f6861",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:43.908282Z",
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
  "command_id": "a3fa7640-01b1-48e8-ba99-2bcd98e1bce9",
  "quote_id": "a18dfe87-7f7b-4042-934a-6bf9246f6861",
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
  "correlation_id": "1b3ed715-8d4a-4cfb-866f-59ecfe9d2537"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "dfb8f8de-8c90-4eba-9353-9d96ee285860",
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
  "correlation_id": "9b0424d9-76da-448b-bdf0-758756e345c0"
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
  "command_id": "a683f348-0ebf-4318-bfd8-cf91d38eb5b2",
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
  "phone": "+380678236257",
  "device_ref": "sandbox-11854"
}
```

```json
{
  "challenge_id": "be9e9712-dd3c-4509-adf1-1cad404b4086",
  "expires_at": "2026-10-29T08:00:45.367831309Z",
  "resend_available_at": "2026-10-29T07:55:46.367831309Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678236257` → **200**

```json
{
  "phone": "+380678236257",
  "audience": "CLIENT",
  "code": "120972",
  "sent_at": "2026-10-29T07:55:45.370045926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be9e9712-dd3c-4509-adf1-1cad404b4086",
  "code": "120972",
  "device_ref": "sandbox-11854"
}
```

```json
{
  "session_id": "d719bc26-45cc-4c2f-bb6c-fea729d16a80",
  "subject": {
    "type": "CLIENT",
    "id": "eb666245-ae58-494b-ab96-9d8de2291dea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjY2NjI0NS1hZTU4LTQ5NGItYWI5Ni05ZDhkZTIyOTFkZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDQ1LCJpYXQiOjE3OTMyNjA1NDUsImp0aSI6IjNlN2RjZjhjLTI1YzUtNDY1NS05ZTkxLTgzNDg3NzcwNjk3ZCIsInNpZCI6ImQ3MTliYzI2LTQ1Y2MtNGMyZi1iYjZjLWZlYTcyOWQxNmE4MCJ9.xxlL3PrrJ2io1Ud0qITFCS23UurZ2cBXEPsKnhnghTM",
  "access_expires_at": "2026-10-29T08:10:45.66454906Z",
  "refresh_token": "H-F7xQx_4zpb5EtP-GOxpUH43FSD1qO3sD2zRCjCkBE",
  "refresh_expires_at": "2026-11-28T07:55:45.663981707Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "eb666245-ae58-494b-ab96-9d8de2291dea",
  "session_id": "d719bc26-45cc-4c2f-bb6c-fea729d16a80",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "53a4a6cd-51c7-45b7-9db2-6b511ae850e6",
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
  "id": "f7174256-47af-4d4e-86d8-9137280aab3b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:00:46.205031Z",
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
  "challenge_id": "0db4c550-2d0e-4e19-8151-e407cd817643",
  "expires_at": "2026-10-29T08:00:48.49284291Z",
  "resend_available_at": "2026-10-29T07:55:49.49284291Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678236257` → **200**

```json
{
  "phone": "+380678236257",
  "audience": "CLIENT",
  "code": "075426",
  "sent_at": "2026-10-29T07:55:48.494752961Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "9f63fece-6e9b-4f8c-bbca-f43c12297b6f",
  "challenge_id": "0db4c550-2d0e-4e19-8151-e407cd817643",
  "otp_code": "075426"
}
```

```json
{
  "client_id": "eb666245-ae58-494b-ab96-9d8de2291dea",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T07:55:48.803052385Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "e4ea13a9-5768-47cd-9fb9-cd10ef0b599e",
  "quote_id": "f7174256-47af-4d4e-86d8-9137280aab3b",
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
  "correlation_id": "71256f2c-efdb-4c3e-980f-b036e1e68491"
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
  "session_id": "e3b0e1cd-1078-494b-bb64-133e9ac2227f",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0NDksImlhdCI6MTc5MzI2MDU0OSwianRpIjoiNDUwZTlmNTktZGQ0Ni00NDQ2LWI3OTQtMzNmNjYwNTg5ZjBlIiwic2lkIjoiZTNiMGUxY2QtMTA3OC00OTRiLWJiNjQtMTMzZTlhYzIyMjdmIn0.2Gvf-EqvR0ZtQ7RCA06mhFWA0cog44KwqDeSbFL2KzA",
  "access_expires_at": "2026-10-29T08:10:49.649404373Z",
  "refresh_token": "L-NiPobf8JPpaVCliEa1_uM3IWKBBoqOnGUOpM2DGPs",
  "refresh_expires_at": "2026-10-29T19:55:49.648783389Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "eb666245-ae58-494b-ab96-9d8de2291dea",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T07:55:48.803052Z",
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

`POST /api/admin/v1/client-deletions/eb666245-ae58-494b-ab96-9d8de2291dea/complete` → **200**

```json
{
  "command_id": "7b1fc9e4-0f51-478d-9d25-6ea43cad7711",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "eb666245-ae58-494b-ab96-9d8de2291dea",
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
  "correlation_id": "e5ce7409-e2ff-4ff4-9789-ec85a467355a"
}
```

Done: client eb666245-ae58-494b-ab96-9d8de2291dea anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663084826",
  "device_ref": "sandbox-8416"
}
```

```json
{
  "challenge_id": "5947bd9b-b807-433f-8563-f18ee0a66296",
  "expires_at": "2026-10-29T08:00:50.771097808Z",
  "resend_available_at": "2026-10-29T07:55:51.771097808Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663084826` → **200**

```json
{
  "phone": "+380663084826",
  "audience": "CLIENT",
  "code": "411967",
  "sent_at": "2026-10-29T07:55:50.774371452Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5947bd9b-b807-433f-8563-f18ee0a66296",
  "code": "411967",
  "device_ref": "sandbox-8416"
}
```

```json
{
  "session_id": "2c9de6e4-b54a-4ea3-adda-589132944a24",
  "subject": {
    "type": "CLIENT",
    "id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MWNiMzNhZS00ZjczLTQ1ZTEtYTBkNC0xN2EwOGFlNzJlYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDUxLCJpYXQiOjE3OTMyNjA1NTEsImp0aSI6IjNjZTEwZmY4LTM3NzktNDQyYS04OTRiLTQwOTc3NGQzNjI4ZSIsInNpZCI6IjJjOWRlNmU0LWI1NGEtNGVhMy1hZGRhLTU4OTEzMjk0NGEyNCJ9.9Yj3Mwk0Pu2Rdfw3BQlBv9HZqX3OITG2dP2rhgP41qY",
  "access_expires_at": "2026-10-29T08:10:51.065902034Z",
  "refresh_token": "2SP-0wnlLF4zUfNf8FvPrJTD2Tbq39Vci_MqQPlC2ak",
  "refresh_expires_at": "2026-11-28T07:55:51.065363956Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1",
  "session_id": "2c9de6e4-b54a-4ea3-adda-589132944a24",
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
  "session_id": "db914818-5bce-4e63-b486-6aa2874120a2",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0NTEsImlhdCI6MTc5MzI2MDU1MSwianRpIjoiYWVlYjBlMzktYjczNS00ZTkyLTk2ZDMtOGEwZjRiNDk2NjE0Iiwic2lkIjoiZGI5MTQ4MTgtNWJjZS00ZTYzLWI0ODYtNmFhMjg3NDEyMGEyIn0.3r50J85Ujrt0hRF2Z-5-MS_F8qmtPdAqhRt1CpyiGog",
  "access_expires_at": "2026-10-29T08:10:51.893415987Z",
  "refresh_token": "8OwShhbOZpyMwodMYuJ7mu-SmDRXp5ZHn_IcANPPqck",
  "refresh_expires_at": "2026-10-29T19:55:51.892888288Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3084826&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1",
      "phone": "+380663084826",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T07:55:51.063654Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/71cb33ae-4f73-45e1-a0d4-17a08ae72ec1` → **200**

```json
{
  "client": {
    "id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1",
    "phone": "+380663084826",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:55:51.063654Z",
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

`POST /api/admin/v1/clients/71cb33ae-4f73-45e1-a0d4-17a08ae72ec1/block` → **400**

```json
{
  "command_id": "25a1baac-0513-461b-a049-460aa8349f56",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/71cb33ae-4f73-45e1-a0d4-17a08ae72ec1/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a05a602f-3680-4f2e-941f-9efb9e2da748",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/71cb33ae-4f73-45e1-a0d4-17a08ae72ec1/block` → **200**

```json
{
  "command_id": "617ba38b-d49d-46c8-ba1f-0f2172ee2a6d",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1",
  "phone": "+380663084826",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T07:55:51.063654Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T07:55:53.081513Z",
    "by": "154415a5-2c56-488b-931a-26ab06629f74"
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
  "correlation_id": "d8f631f6-4185-448c-912b-e6e6cd90e722"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663084826",
  "device_ref": "sandbox-498"
}
```

```json
{
  "challenge_id": "be7ded91-4a9d-4d2f-8b86-a97c4ba35632",
  "expires_at": "2026-10-29T08:00:55.633579361Z",
  "resend_available_at": "2026-10-29T07:55:56.633579361Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663084826` → **200**

```json
{
  "phone": "+380663084826",
  "audience": "CLIENT",
  "code": "893337",
  "sent_at": "2026-10-29T07:55:55.635684723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "be7ded91-4a9d-4d2f-8b86-a97c4ba35632",
  "code": "893337",
  "device_ref": "sandbox-498"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "8c147067-37e6-463b-bfcc-97dadcf99fdd"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/71cb33ae-4f73-45e1-a0d4-17a08ae72ec1` → **200**

```json
{
  "client": {
    "id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1",
    "phone": "+380663084826",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T07:55:51.063654Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T07:55:53.081513Z",
      "by": "154415a5-2c56-488b-931a-26ab06629f74"
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

`POST /api/admin/v1/clients/71cb33ae-4f73-45e1-a0d4-17a08ae72ec1/unblock` → **200**

```json
{
  "command_id": "22a08c02-6da5-4b92-9f45-96e3afb41370",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1",
  "phone": "+380663084826",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T07:55:51.063654Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663084826",
  "device_ref": "sandbox-8573"
}
```

```json
{
  "challenge_id": "168d35b1-ed99-4fa8-b84e-25cfc10f732d",
  "expires_at": "2026-10-29T08:00:58.793118937Z",
  "resend_available_at": "2026-10-29T07:55:59.793118937Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663084826` → **200**

```json
{
  "phone": "+380663084826",
  "audience": "CLIENT",
  "code": "625176",
  "sent_at": "2026-10-29T07:55:58.795488657Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "168d35b1-ed99-4fa8-b84e-25cfc10f732d",
  "code": "625176",
  "device_ref": "sandbox-8573"
}
```

```json
{
  "session_id": "98e20659-7e98-438e-8f85-c58636ef808e",
  "subject": {
    "type": "CLIENT",
    "id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MWNiMzNhZS00ZjczLTQ1ZTEtYTBkNC0xN2EwOGFlNzJlYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDU5LCJpYXQiOjE3OTMyNjA1NTksImp0aSI6ImQwZjQxMDhmLTA0NmQtNGVhYi1iMTc4LWVlNzg4OTE2MGJjNiIsInNpZCI6Ijk4ZTIwNjU5LTdlOTgtNDM4ZS04Zjg1LWM1ODYzNmVmODA4ZSJ9.j_Lw0rhYOCmcK8P7gcw99e1W5LoYfT9qDnZqngc-yh8",
  "access_expires_at": "2026-10-29T08:10:59.096363368Z",
  "refresh_token": "sWfS8ayMdOjvH_PE6NDrRTFDATeVfZPB9J8e1Kkb9_c",
  "refresh_expires_at": "2026-11-28T07:55:59.095733704Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "71cb33ae-4f73-45e1-a0d4-17a08ae72ec1",
  "session_id": "98e20659-7e98-438e-8f85-c58636ef808e",
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
  "phone": "+380667679838",
  "device_ref": "sandbox-2846"
}
```

```json
{
  "challenge_id": "8860c25f-da81-42e7-9760-b36e3a769032",
  "expires_at": "2026-10-29T08:00:59.642005598Z",
  "resend_available_at": "2026-10-29T07:56:00.642005598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667679838` → **200**

```json
{
  "phone": "+380667679838",
  "audience": "CLIENT",
  "code": "128103",
  "sent_at": "2026-10-29T07:55:59.644241383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8860c25f-da81-42e7-9760-b36e3a769032",
  "code": "128103",
  "device_ref": "sandbox-2846"
}
```

```json
{
  "session_id": "052d8704-97c2-4a45-8797-7d99a3220f3d",
  "subject": {
    "type": "CLIENT",
    "id": "ba9025c9-698d-4bdf-92d9-f24f5b41feaa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTkwMjVjOS02OThkLTRiZGYtOTJkOS1mMjRmNWI0MWZlYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDU5LCJpYXQiOjE3OTMyNjA1NTksImp0aSI6ImY2ZTliZDgzLTEwYjMtNDY2NC04Y2ZiLTYyMTcwYjk0NGJjYyIsInNpZCI6IjA1MmQ4NzA0LTk3YzItNGE0NS04Nzk3LTdkOTlhMzIyMGYzZCJ9.0u3H9AVHu3icneYjRK0rHPIaaarLGYqxONOwdYl5dOs",
  "access_expires_at": "2026-10-29T08:10:59.936837731Z",
  "refresh_token": "zsBkD2Jnb7PYh_J7a9tAc3HFgpeYULIzsMYt9IcBeLM",
  "refresh_expires_at": "2026-11-28T07:55:59.93628746Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e1db080e-2d55-4955-abc7-4fad24ea5be3",
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
  "id": "afb75a0e-d6e0-4318-8e42-62d6d4b5e629",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:01:00.213063Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: f32d34ee-5e80-4406-ab28-9a5df3f9a4bc) → **201**

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
  "session_id": "548e413c-67c1-4f84-903c-dba5803a1cdf",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0NjAsImlhdCI6MTc5MzI2MDU2MCwianRpIjoiMjA5Y2FiOGItZmJmZC00NGM0LThlZTAtZjM1YmNhM2Y0OTEyIiwic2lkIjoiNTQ4ZTQxM2MtNjdjMS00Zjg0LTkwM2MtZGJhNTgwM2ExY2RmIn0.tu5DNU77WowZbR9VO3VOLJEUycdcTFmCkYkMD0x3_iA",
  "access_expires_at": "2026-10-29T08:11:00.819971252Z",
  "refresh_token": "FpHXI-mCp6pVYUC81SdqtW5XeTo61AnRi04oB5XunFs",
  "refresh_expires_at": "2026-10-29T19:56:00.819318148Z",
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
  "session_id": "dc2d2aed-ed16-4aca-8cd9-12451e7ecbcd",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0NjEsImlhdCI6MTc5MzI2MDU2MSwianRpIjoiYzEwYTRkZDctY2MxYS00MzZjLWJiZTYtNTY1MjczZWEwODEzIiwic2lkIjoiZGMyZDJhZWQtZWQxNi00YWNhLThjZDktMTI0NTFlN2VjYmNkIn0.8hAqhy7mxX5QYhTLYV-7lOQZ_9ma2aCHwBf8kx1A89w",
  "access_expires_at": "2026-10-29T08:11:01.395680334Z",
  "refresh_token": "Y3ukNN5A88WiXDDyL7atKK3VFaqBVs0NCcxCwlnz3v0",
  "refresh_expires_at": "2026-10-29T19:56:01.395141605Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5705d2a3-cee8-446a-a7d8-476216936354/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:56:00.491772Z",
      "actor": {
        "type": "CLIENT",
        "id": "ba9025c9-698d-4bdf-92d9-f24f5b41feaa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5705d2a3-cee8-446a-a7d8-476216936354",
        "quote_id": "afb75a0e-d6e0-4318-8e42-62d6d4b5e629",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f32d34ee-5e80-4406-ab28-9a5df3f9a4bc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:56:00.494447Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5705d2a3-cee8-446a-a7d8-476216936354",
        "attempt_id": "25c7fed3-4a0f-4024-b15b-4fae6f03bab6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f32d34ee-5e80-4406-ab28-9a5df3f9a4bc"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T07:56:00.503195Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5705d2a3-cee8-446a-a7d8-476216936354",
        "attempt_id": "25c7fed3-4a0f-4024-b15b-4fae6f03bab6"
      },
      "correlation_id": "f32d34ee-5e80-4406-ab28-9a5df3f9a4bc"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "25c7fed3-4a0f-4024-b15b-4fae6f03bab6",
        "generation": 1,
        "started_at": "2026-10-29T07:56:00.493267Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T07:56:00.503195Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T07:56:00.495353Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/f32d34ee-5e80-4406-ab28-9a5df3f9a4bc` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "5705d2a3-cee8-446a-a7d8-476216936354:0",
      "order_id": "5705d2a3-cee8-446a-a7d8-476216936354",
      "at": "2026-10-29T07:56:00.491772Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5705d2a3-cee8-446a-a7d8-476216936354:1",
      "order_id": "5705d2a3-cee8-446a-a7d8-476216936354",
      "at": "2026-10-29T07:56:00.494447Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "5705d2a3-cee8-446a-a7d8-476216936354:2",
      "order_id": "5705d2a3-cee8-446a-a7d8-476216936354",
      "at": "2026-10-29T07:56:00.503195Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/26fb28a1-498e-4d85-abb7-b7650893aa0c` → **200**

```json
{
  "found": []
}
```

Done: request f32d34ee-5e80-4406-ab28-9a5df3f9a4bc — order 5705d2a3-cee8-446a-a7d8-476216936354 found by its id.

`GET /api/rider/v1/orders/5705d2a3-cee8-446a-a7d8-476216936354` → **200**

```json
{
  "id": "5705d2a3-cee8-446a-a7d8-476216936354",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ba9025c9-698d-4bdf-92d9-f24f5b41feaa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:56:00.491264Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5705d2a3-cee8-446a-a7d8-476216936354/cancel` → **200**

```json
{
  "command_id": "c740ffda-c0b3-481c-90b9-0776426d7d9a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5705d2a3-cee8-446a-a7d8-476216936354",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ba9025c9-698d-4bdf-92d9-f24f5b41feaa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:56:00.491264Z",
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
  "phone": "+380637186655",
  "device_ref": "sandbox-23331"
}
```

```json
{
  "challenge_id": "d847e68e-edaa-481c-82fd-34e35934ff5c",
  "expires_at": "2026-10-29T08:01:03.114310818Z",
  "resend_available_at": "2026-10-29T07:56:04.114310818Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637186655` → **200**

```json
{
  "phone": "+380637186655",
  "audience": "CLIENT",
  "code": "050272",
  "sent_at": "2026-10-29T07:56:03.11647446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d847e68e-edaa-481c-82fd-34e35934ff5c",
  "code": "050272",
  "device_ref": "sandbox-23331"
}
```

```json
{
  "session_id": "05f80912-b90d-4587-9edd-ff4b42385333",
  "subject": {
    "type": "CLIENT",
    "id": "b0381ddf-da4c-43f5-982f-c6cad3474969"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMDM4MWRkZi1kYTRjLTQzZjUtOTgyZi1jNmNhZDM0NzQ5NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDYzLCJpYXQiOjE3OTMyNjA1NjMsImp0aSI6ImM2Y2I3YTEwLTlhNzAtNGRhZS04N2RjLTBlYjRlODFiYzgzMiIsInNpZCI6IjA1ZjgwOTEyLWI5MGQtNDU4Ny05ZWRkLWZmNGI0MjM4NTMzMyJ9.gxdmNTcD1Erjw-S45opZvVY5IQsmPHybMEVdbsn32Sg",
  "access_expires_at": "2026-10-29T08:11:03.40375695Z",
  "refresh_token": "QgeYfy1kkRR0LA-JANUbdfwsY0zkiRyzqA-fW2kKisY",
  "refresh_expires_at": "2026-11-28T07:56:03.403218691Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "1d7e6837-5aac-4ec1-bae7-635f3b476dbf",
  "expires_at": "2026-10-29T08:01:05.670169122Z",
  "resend_available_at": "2026-10-29T07:56:06.670169122Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637186655` → **200**

```json
{
  "phone": "+380637186655",
  "audience": "CLIENT",
  "code": "837062",
  "sent_at": "2026-10-29T07:56:05.672276761Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "00f038b4-d690-4f5f-a803-c9ad5f3dbb9d",
  "challenge_id": "1d7e6837-5aac-4ec1-bae7-635f3b476dbf",
  "otp_code": "837062"
}
```

```json
{
  "id": "12066d08-5692-467a-a03a-8eb349438320",
  "state": "PENDING",
  "created_at": "2026-10-29T07:56:05.974449Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/12066d08-5692-467a-a03a-8eb349438320` → **200**

```json
{
  "id": "12066d08-5692-467a-a03a-8eb349438320",
  "state": "PENDING",
  "created_at": "2026-10-29T07:56:05.974449Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12066d08-5692-467a-a03a-8eb349438320` → **200**

```json
{
  "id": "12066d08-5692-467a-a03a-8eb349438320",
  "state": "PENDING",
  "created_at": "2026-10-29T07:56:05.974449Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12066d08-5692-467a-a03a-8eb349438320` → **200**

```json
{
  "id": "12066d08-5692-467a-a03a-8eb349438320",
  "state": "READY",
  "created_at": "2026-10-29T07:56:05.974449Z",
  "ready_at": "2026-10-29T07:56:08.4676Z",
  "expires_at": "2026-11-05T07:56:08.4676Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/12066d08-5692-467a-a03a-8eb349438320/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632806697",
  "device_ref": "sandbox-20685"
}
```

```json
{
  "challenge_id": "dca1b3d0-eacd-4920-add6-2e21481fb04c",
  "expires_at": "2026-10-29T08:01:09.081902889Z",
  "resend_available_at": "2026-10-29T07:56:10.081902889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632806697` → **200**

```json
{
  "phone": "+380632806697",
  "audience": "CLIENT",
  "code": "900165",
  "sent_at": "2026-10-29T07:56:09.084314164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dca1b3d0-eacd-4920-add6-2e21481fb04c",
  "code": "900165",
  "device_ref": "sandbox-20685"
}
```

```json
{
  "session_id": "ac00b408-95cb-4178-82d5-95b56f3b644e",
  "subject": {
    "type": "CLIENT",
    "id": "6f4aabe1-0ed7-4d5e-addf-e55fd64c7b7f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjRhYWJlMS0wZWQ3LTRkNWUtYWRkZi1lNTVmZDY0YzdiN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDY5LCJpYXQiOjE3OTMyNjA1NjksImp0aSI6ImU3OWVlMWZkLWY0NDMtNGFkYS05MGZmLWE3ZjE4ZDA2OWFjOCIsInNpZCI6ImFjMDBiNDA4LTk1Y2ItNDE3OC04MmQ1LTk1YjU2ZjNiNjQ0ZSJ9.Kfzw-4Bux48xwIT7wgfbxxxljYZiUatQh7PGc-recMw",
  "access_expires_at": "2026-10-29T08:11:09.38311091Z",
  "refresh_token": "LsrVwiH3Cl28vmQVVYDkoaK733pLLdMai5M3Xw2t-vQ",
  "refresh_expires_at": "2026-11-28T07:56:09.382505603Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/12066d08-5692-467a-a03a-8eb349438320/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/12066d08-5692-467a-a03a-8eb349438320/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6d0f7f64-51eb-42ea-8958-cb0fbba60b01"
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
  "session_id": "12039e61-6849-45cb-b06a-74068948156b",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0NzAsImlhdCI6MTc5MzI2MDU3MCwianRpIjoiMDFiMzg1OWEtNzcwMi00Y2FmLTllZTUtY2Q5NjdkOTcxZDA4Iiwic2lkIjoiMTIwMzllNjEtNjg0OS00NWNiLWIwNmEtNzQwNjg5NDgxNTZiIn0._ouKpJUIeAmv4gzZYMy33xLuRAdOx0TwFA1L49JrMeE",
  "access_expires_at": "2026-10-29T08:11:10.220607555Z",
  "refresh_token": "WqOpV7zGvBExRXPUhDRc8wYQr0_5LfxLhG3lxI6kHJc",
  "refresh_expires_at": "2026-10-29T19:56:10.220029612Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b0381ddf-da4c-43f5-982f-c6cad3474969",
  "session_id": "05f80912-b90d-4587-9edd-ff4b42385333",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/b0381ddf-da4c-43f5-982f-c6cad3474969/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "12066d08-5692-467a-a03a-8eb349438320",
      "state": "READY",
      "created_at": "2026-10-29T07:56:05.974449Z",
      "ready_at": "2026-10-29T07:56:08.4676Z",
      "expires_at": "2026-11-05T07:56:08.4676Z",
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
  "device_ref": "sandbox-11001"
}
```

```json
{
  "challenge_id": "1818744b-db08-4624-bf7f-75ffb8726929",
  "expires_at": "2026-10-29T08:01:11.034297785Z",
  "resend_available_at": "2026-10-29T07:56:12.034297785Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "544648",
  "sent_at": "2026-10-29T07:56:11.037068935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1818744b-db08-4624-bf7f-75ffb8726929",
  "code": "544648",
  "device_ref": "sandbox-11001"
}
```

```json
{
  "session_id": "8e17327c-865b-4a26-ae53-92750e6fdf39",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTQ3MSwiaWF0IjoxNzkzMjYwNTcxLCJqdGkiOiI2MDFmNzViMi0yYjU4LTQ5YWMtYWE3Ny1iODhhNzZjMDc4MzAiLCJzaWQiOiI4ZTE3MzI3Yy04NjViLTRhMjYtYWU1My05Mjc1MGU2ZmRmMzkifQ.nhA26sOF_h9NDxr90RFr6toUslqAqwJa2he54-5VVfU",
  "access_expires_at": "2026-10-29T08:11:11.336647603Z",
  "refresh_token": "bx71ISdeUSQmj-pBGt8czy6kHImPoUpQOqnGcVsRHMw",
  "refresh_expires_at": "2026-11-28T07:56:11.336120786Z",
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
  "device_ref": "sandbox-6464"
}
```

```json
{
  "challenge_id": "253a634c-2ddf-4693-9708-fbf2f96de385",
  "expires_at": "2026-10-29T08:01:11.869669393Z",
  "resend_available_at": "2026-10-29T07:56:12.869669393Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "231478",
  "sent_at": "2026-10-29T07:56:11.872147366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "253a634c-2ddf-4693-9708-fbf2f96de385",
  "code": "231478",
  "device_ref": "sandbox-6464"
}
```

```json
{
  "session_id": "8341e409-9b0b-449b-ac10-68f57655e3db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTQ3MiwiaWF0IjoxNzkzMjYwNTcyLCJqdGkiOiJkYTYzM2FlOS1jNjMyLTRhZDMtYmQzYy0wMDJhNWIyZDQ4ODkiLCJzaWQiOiI4MzQxZTQwOS05YjBiLTQ0OWItYWMxMC02OGY1NzY1NWUzZGIifQ.o-dPY_BS6_uNY7pnRfXEey-RZI15N3LqsCU2x4zRvYw",
  "access_expires_at": "2026-10-29T08:11:12.166010025Z",
  "refresh_token": "fOjOTMnxxN-Hol2RzJGEALN_kKWbG55WNHJ6mimeehg",
  "refresh_expires_at": "2026-11-28T07:56:12.165460563Z",
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
  "command_id": "9da02983-773e-4213-9912-34a7fc59f52a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:12Z",
    "sequence": 1793260572691
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a3cb33d-5611-49ee-a3a9-4f022891c44f",
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
  "last_heartbeat_at": "2026-10-29T07:56:12.709159Z",
  "last_location_at": "2026-10-29T07:56:12.709159Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-2774"
}
```

```json
{
  "challenge_id": "62efab88-0f49-464c-9990-f4d723d8e1bc",
  "expires_at": "2026-10-29T08:01:13.005095851Z",
  "resend_available_at": "2026-10-29T07:56:14.005095851Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "468454",
  "sent_at": "2026-10-29T07:56:13.007293203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62efab88-0f49-464c-9990-f4d723d8e1bc",
  "code": "468454",
  "device_ref": "sandbox-2774"
}
```

```json
{
  "session_id": "b5962e09-57ae-457a-a92c-2a0ee0d769a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTQ3MywiaWF0IjoxNzkzMjYwNTczLCJqdGkiOiIwNzkzYTliZi0xZDBjLTQ4YmUtODAzNC0xODVlNmYzMDBkZjYiLCJzaWQiOiJiNTk2MmUwOS01N2FlLTQ1N2EtYTkyYy0yYTBlZTBkNzY5YTgifQ.Fs2LqtaoWuCVqOpBdwk-vyAEaSB1QH4wDlZ74o3tB9Y",
  "access_expires_at": "2026-10-29T08:11:13.31094626Z",
  "refresh_token": "8-ZFE0trDwZ8RhaUBdzpO61LmP15qTw97T5teFZqOJY",
  "refresh_expires_at": "2026-11-28T07:56:13.310372435Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "703d4ff8-6e8f-462b-8c6d-c84ba52cd241",
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
  "last_heartbeat_at": "2026-10-29T07:55:01.751407Z",
  "last_location_at": "2026-10-29T07:55:01.751407Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/703d4ff8-6e8f-462b-8c6d-c84ba52cd241/handover` → **200**

```json
{
  "command_id": "8b1f1f98-1dc0-48b7-8a5a-7e636ac23f3c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "703d4ff8-6e8f-462b-8c6d-c84ba52cd241",
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
  "last_heartbeat_at": "2026-10-29T07:55:01.751407Z",
  "last_location_at": "2026-10-29T07:55:01.751407Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/703d4ff8-6e8f-462b-8c6d-c84ba52cd241/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:14Z",
    "sequence": 1793260574128
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "703d4ff8-6e8f-462b-8c6d-c84ba52cd241",
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
  "last_heartbeat_at": "2026-10-29T07:56:14.147145Z",
  "last_location_at": "2026-10-29T07:56:14.147145Z",
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
  "session_id": "b0027077-abcb-483a-b260-65923b8e75f8",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0NzQsImlhdCI6MTc5MzI2MDU3NCwianRpIjoiYzM1YjY1OWYtYzNmMy00ZTJiLTljNTYtNzZjZjRlZjE5OTg4Iiwic2lkIjoiYjAwMjcwNzctYWJjYi00ODNhLWIyNjAtNjU5MjNiOGU3NWY4In0.MdiDrBj1wQTlX5ET0aCKY1q36E91DtX-Q-Fb9-3UPfA",
  "access_expires_at": "2026-10-29T08:11:14.713887648Z",
  "refresh_token": "hG5cfO-VH8k4RNfi_xCqMwmvJjVmzMTd-AhX0ckB_Bg",
  "refresh_expires_at": "2026-10-29T19:56:14.713249357Z",
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
  "session_id": "03ad09c6-0622-4d41-b4e7-cdbe8090a3d2",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0NzUsImlhdCI6MTc5MzI2MDU3NSwianRpIjoiM2M4ZmUzZDAtMmU2ZC00NDA2LTg2ZGQtMWRmMTQ3OWVjYmYxIiwic2lkIjoiMDNhZDA5YzYtMDYyMi00ZDQxLWI0ZTctY2RiZTgwOTBhM2QyIn0.gnUCNWl44hsUEU3bYjPRNZKNzf9gGDk-KAumm1UVlWc",
  "access_expires_at": "2026-10-29T08:11:15.278549518Z",
  "refresh_token": "ZjxHfyPbfS5_s-MWNijbGtJ9zPJP2GWCrbn-QC7suqk",
  "refresh_expires_at": "2026-10-29T19:56:15.277940449Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683609213",
  "device_ref": "sandbox-17969"
}
```

```json
{
  "challenge_id": "49e97a49-2756-4c8e-854d-2d41d52ba77d",
  "expires_at": "2026-10-29T08:01:15.549171014Z",
  "resend_available_at": "2026-10-29T07:56:16.549171014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683609213` → **200**

```json
{
  "phone": "+380683609213",
  "audience": "CLIENT",
  "code": "696574",
  "sent_at": "2026-10-29T07:56:15.551285167Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49e97a49-2756-4c8e-854d-2d41d52ba77d",
  "code": "696574",
  "device_ref": "sandbox-17969"
}
```

```json
{
  "session_id": "0aab26e6-4f1f-4723-a783-8c9a53fb90b3",
  "subject": {
    "type": "CLIENT",
    "id": "9f9acf2f-d4ff-428e-b0de-8b9f28b3a68f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjlhY2YyZi1kNGZmLTQyOGUtYjBkZS04YjlmMjhiM2E2OGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDc1LCJpYXQiOjE3OTMyNjA1NzUsImp0aSI6ImNjNTRhZDI0LTA2OTctNGI0OC05N2MzLTFlNjdkMmUwMThiYyIsInNpZCI6IjBhYWIyNmU2LTRmMWYtNDcyMy1hNzgzLThjOWE1M2ZiOTBiMyJ9.lNtLluXdxgcvnH5xHpqILzmY5wjrYtuKbuhGQQ-vAzc",
  "access_expires_at": "2026-10-29T08:11:15.848738121Z",
  "refresh_token": "XBopqPTFRvxrW36LTSvm0kRowE8iaLNa-XxYWTyoNvc",
  "refresh_expires_at": "2026-11-28T07:56:15.848202398Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "38b6c8b8-3417-48ad-a205-881838679795",
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
  "id": "a6561fa1-11d5-41eb-9033-a871572af1a4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:01:16.120777Z",
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
  "command_id": "05aec602-e401-47dc-95fd-5081dc174de3",
  "quote_id": "a6561fa1-11d5-41eb-9033-a871572af1a4",
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
  "id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9f9acf2f-d4ff-428e-b0de-8b9f28b3a68f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:56:16.404471Z",
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
    "id": "287f7a47-2b2b-4207-98ec-f53a85c99a85",
    "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
    "expires_at": "2026-10-29T07:56:31.407923Z",
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

`POST /api/driver/v1/offers/287f7a47-2b2b-4207-98ec-f53a85c99a85/reject` → **204**

```json
{
  "command_id": "c9619c37-2aed-4fba-a3cf-3d71f30446b4"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0a9b32cd-0446-47ce-884c-84c3a37142ec",
    "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
    "expires_at": "2026-10-29T07:56:31.965202Z",
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

`POST /api/driver/v1/offers/0a9b32cd-0446-47ce-884c-84c3a37142ec/accept` → **200**

```json
{
  "command_id": "1a9b3dc1-4f21-49b2-8e86-bab8dad26ab8"
}
```

```json
{
  "id": "1438b332-1845-46f6-9adb-9f938796caf7",
  "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "075cebe3-5f71-47af-906b-ce6270f4aaea",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/fb68890d-dd23-4b6d-bd63-e99c61eea6de/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:56:16.405007Z",
      "actor": {
        "type": "CLIENT",
        "id": "9f9acf2f-d4ff-428e-b0de-8b9f28b3a68f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
        "quote_id": "a6561fa1-11d5-41eb-9033-a871572af1a4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5c7d73d7-3e0f-4785-bd5b-0782dab3e4cc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:56:16.4071Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
        "attempt_id": "7374edff-5d5c-4267-8454-70adf3c370be",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5c7d73d7-3e0f-4785-bd5b-0782dab3e4cc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:56:16.411163Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "287f7a47-2b2b-4207-98ec-f53a85c99a85",
        "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "5c7d73d7-3e0f-4785-bd5b-0782dab3e4cc"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T07:56:16.964252Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "287f7a47-2b2b-4207-98ec-f53a85c99a85",
        "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de"
      },
      "correlation_id": "20088697-db2e-4315-9e5d-6617c2fb8c94"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order fb68890d-dd23-4b6d-bd63-e99c61eea6de — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/fb68890d-dd23-4b6d-bd63-e99c61eea6de` → **200**

```json
{
  "id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9f9acf2f-d4ff-428e-b0de-8b9f28b3a68f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1438b332-1845-46f6-9adb-9f938796caf7",
    "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "075cebe3-5f71-47af-906b-ce6270f4aaea",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:56:16.404471Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/fb68890d-dd23-4b6d-bd63-e99c61eea6de/cancel` → **200**

```json
{
  "command_id": "e28750be-641c-463f-beb9-8bc168c2e9c3",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9f9acf2f-d4ff-428e-b0de-8b9f28b3a68f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1438b332-1845-46f6-9adb-9f938796caf7",
    "order_id": "fb68890d-dd23-4b6d-bd63-e99c61eea6de",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "075cebe3-5f71-47af-906b-ce6270f4aaea",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:56:16.404471Z",
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
  "session_id": "2a3cb33d-5611-49ee-a3a9-4f022891c44f",
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
  "last_heartbeat_at": "2026-10-29T07:56:12.709159Z",
  "last_location_at": "2026-10-29T07:56:12.709159Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a3cb33d-5611-49ee-a3a9-4f022891c44f/close` → **200**

```json
{
  "command_id": "d85ffe7c-98f2-4ad9-96fd-da8c5ebcdcc6",
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
  "session_id": "703d4ff8-6e8f-462b-8c6d-c84ba52cd241",
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
  "last_heartbeat_at": "2026-10-29T07:56:14.147145Z",
  "last_location_at": "2026-10-29T07:56:14.147145Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/703d4ff8-6e8f-462b-8c6d-c84ba52cd241/close` → **200**

```json
{
  "command_id": "eac3b7af-e426-4539-9f6f-58965f837df2",
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
  "session_id": "0dfec295-36eb-4bea-a077-89eb8664cae8",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0NzksImlhdCI6MTc5MzI2MDU3OSwianRpIjoiODVkNDQ0OTQtY2EzOC00Y2I2LWEwYTctYTgyZWE1YTBhM2YxIiwic2lkIjoiMGRmZWMyOTUtMzZlYi00YmVhLWEwNzctODllYjg2NjRjYWU4In0.alD8e9Mbvh3YR90f1mxwMSKw3DMQdMFmYPCSDuTnYs0",
  "access_expires_at": "2026-10-29T08:11:19.905716266Z",
  "refresh_token": "uwvBUc7qL6iJqp0uDh5JzZLED5_R1_bF-ow4tSrPc-M",
  "refresh_expires_at": "2026-10-29T19:56:19.905146648Z",
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
  "command_id": "29f79369-1054-4e77-bdc7-f476f6dda64c",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T07:56:20.46702Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "068e758a-3667-41dc-8664-230e8715d3f6",
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
  "correlation_id": "89fa36d6-9596-4f9c-a411-a3290c21f27a"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "54bf83ac-5fa9-40cd-bbf7-e7119d477877",
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
  "correlation_id": "413483e0-3b68-4cb6-b8bd-5472751ea1c3"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635567273",
  "device_ref": "sandbox-18230"
}
```

```json
{
  "challenge_id": "a99cf8e9-5d8a-46cb-b094-e90569401a0e",
  "expires_at": "2026-10-29T08:01:21.309779554Z",
  "resend_available_at": "2026-10-29T07:56:22.309779554Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635567273` → **200**

```json
{
  "phone": "+380635567273",
  "audience": "CLIENT",
  "code": "289273",
  "sent_at": "2026-10-29T07:56:21.312960423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a99cf8e9-5d8a-46cb-b094-e90569401a0e",
  "code": "289273",
  "device_ref": "sandbox-18230"
}
```

```json
{
  "session_id": "b8efe663-6219-4264-aa9b-9fde2b25ca02",
  "subject": {
    "type": "CLIENT",
    "id": "aeb0f2c8-1aff-4573-84df-95bf7f5288fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWIwZjJjOC0xYWZmLTQ1NzMtODRkZi05NWJmN2Y1Mjg4ZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDgxLCJpYXQiOjE3OTMyNjA1ODEsImp0aSI6IjU1ZmY2ZTQwLTc3ZjktNDg0Yi1iNmJhLTM5MDFkY2Q5MDE2YiIsInNpZCI6ImI4ZWZlNjYzLTYyMTktNDI2NC1hYTliLTlmZGUyYjI1Y2EwMiJ9.9c8wxfl7jvm3W_ol1o9etBIcTSrC_qaO3vctCzcCJyA",
  "access_expires_at": "2026-10-29T08:11:21.609178374Z",
  "refresh_token": "Gqx8OL8eW8P0OsoJvhYCP_-iBfwCoqMvHoPc2TdW9ps",
  "refresh_expires_at": "2026-11-28T07:56:21.608693916Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2456d2d2-240e-4500-822c-5c87785c41bb",
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
  "id": "716a53b2-4e13-4528-93a7-dbb74a2f0ea8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:01:21.893453Z",
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
  "command_id": "63b54ca9-22fe-4d9f-9081-79fa327636f8",
  "quote_id": "716a53b2-4e13-4528-93a7-dbb74a2f0ea8",
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
  "correlation_id": "ae7c93e7-cfea-42e4-8544-d6bac5a29162"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c7cc45c3-e813-42b3-9de8-98dad3e814b9",
  "quote_id": "716a53b2-4e13-4528-93a7-dbb74a2f0ea8",
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
  "id": "31951d70-b31f-4657-961f-15d58841f388",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aeb0f2c8-1aff-4573-84df-95bf7f5288fc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:56:22.453734Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/31951d70-b31f-4657-961f-15d58841f388/cancel` → **200**

```json
{
  "command_id": "99456ddf-a719-4c93-b875-631021dcc913",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "31951d70-b31f-4657-961f-15d58841f388",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "aeb0f2c8-1aff-4573-84df-95bf7f5288fc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:56:22.453734Z",
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
  "command_id": "073e7de6-c3ae-4746-8ed5-1ea020a7daf9",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T07:56:23.101191Z"
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
      "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T07:56:23.101191Z"
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
  "device_ref": "sandbox-4883"
}
```

```json
{
  "challenge_id": "88f61479-e8f4-421a-9a76-2ada33aeba05",
  "expires_at": "2026-10-29T08:01:23.93049514Z",
  "resend_available_at": "2026-10-29T07:56:24.93049514Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "499149",
  "sent_at": "2026-10-29T07:56:23.932659901Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88f61479-e8f4-421a-9a76-2ada33aeba05",
  "code": "499149",
  "device_ref": "sandbox-4883"
}
```

```json
{
  "session_id": "ff3eeae9-67e1-403d-bb9d-36066af77fda",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTQ4NCwiaWF0IjoxNzkzMjYwNTg0LCJqdGkiOiJlMzQ2ZGM1Yy0xNmFkLTRkMzktYjdkZC0xOTFiNGJkNTI4ZDUiLCJzaWQiOiJmZjNlZWFlOS02N2UxLTQwM2QtYmI5ZC0zNjA2NmFmNzdmZGEifQ.NHeIckDjLCZL7-680UhCig2RZ7a6Vhu47TUyuuxNir4",
  "access_expires_at": "2026-10-29T08:11:24.222633057Z",
  "refresh_token": "XQnM_OgMErMLKajNWXknpfAy6VgDimKurKBI0RTq-vw",
  "refresh_expires_at": "2026-11-28T07:56:24.22200897Z",
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
  "command_id": "9dc8f660-812f-4e83-83cd-063cf929cd87",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:24Z",
    "sequence": 1793260584771
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:24.790126Z",
  "last_location_at": "2026-10-29T07:56:24.790126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677904069",
  "device_ref": "sandbox-28909"
}
```

```json
{
  "challenge_id": "67fef1ee-280e-4050-8be6-1a617986b8d0",
  "expires_at": "2026-10-29T08:01:25.063940011Z",
  "resend_available_at": "2026-10-29T07:56:26.063940011Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677904069` → **200**

```json
{
  "phone": "+380677904069",
  "audience": "CLIENT",
  "code": "208683",
  "sent_at": "2026-10-29T07:56:25.066134142Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67fef1ee-280e-4050-8be6-1a617986b8d0",
  "code": "208683",
  "device_ref": "sandbox-28909"
}
```

```json
{
  "session_id": "fa506e0d-59e6-45c9-9bf4-9ba7a6b509d9",
  "subject": {
    "type": "CLIENT",
    "id": "7e1a3a36-02b6-45a3-89d0-f89d36474572"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTFhM2EzNi0wMmI2LTQ1YTMtODlkMC1mODlkMzY0NzQ1NzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNDg1LCJpYXQiOjE3OTMyNjA1ODUsImp0aSI6IjE1ZmIwODM4LThkZTktNGY3ZS1iYzdiLWNiMDljODg1OTFkYyIsInNpZCI6ImZhNTA2ZTBkLTU5ZTYtNDVjOS05YmY0LTliYTdhNmI1MDlkOSJ9.P76TirLH7DJZni_ZdqkyB4dlihrxqdE0P74X4bGBPq8",
  "access_expires_at": "2026-10-29T08:11:25.357298778Z",
  "refresh_token": "qNx93GWNbTjFMs9IW3WVob-c4xFhqtwifIxleP58wks",
  "refresh_expires_at": "2026-11-28T07:56:25.356810012Z",
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
  "command_id": "b4d7bcf0-4c00-409b-9d04-384c1cd47302",
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
  "id": "c2e5b6cb-8052-4c3a-95cc-fc67d2c63953",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:01:25.891212Z",
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
  "command_id": "e1bbc3b2-92da-4368-a15a-d556a38efe27",
  "platform": "ANDROID",
  "token": "sandbox-driver-54624806-a3ef-4360-94b2-048240b2a2f6"
}
```

```json
{
  "id": "98416693-e180-4d92-969f-f3168f8ea1d9",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:56:26.177987Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "afcc5def-4961-446b-bd0b-e20a2e9146e9",
  "platform": "ANDROID",
  "token": "sandbox-rider-9e539f63-da45-4808-906a-a2b5e5d2ec58"
}
```

```json
{
  "id": "b27906a8-b853-42af-85b6-e0a7326f8d19",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:56:26.452135Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "03083e95-6a51-447e-bb5d-40361f1ae4b5",
  "quote_id": "c2e5b6cb-8052-4c3a-95cc-fc67d2c63953",
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
  "id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7e1a3a36-02b6-45a3-89d0-f89d36474572",
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
  "created_at": "2026-10-29T07:56:26.734939Z",
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
    "id": "a18d2968-461c-4308-a0c2-c932c008700c",
    "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
    "expires_at": "2026-10-29T07:56:41.737824Z",
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

`POST /api/driver/v1/offers/a18d2968-461c-4308-a0c2-c932c008700c/accept` → **200**

```json
{
  "command_id": "c9ffa7ef-c7cc-4288-80dc-8f0ea9518d11"
}
```

```json
{
  "id": "8915b9c7-0df0-4fbd-8967-8e0a9e39d430",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3542a174-7bc5-495d-848d-59b1c5738994",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T07:56:26.710Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T07:56:26.710Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:56:27.866894206Z",
    "token_suffix": "b2a2f6",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "1dd50ca3-97d5-4fb4-a96f-2c17a053608a",
      "order_version": "2",
      "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677904069&after=2026-10-29T07:56:26.710Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:56:27.87096099Z",
    "token_suffix": "d2ec58",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "98f4fed5-539d-4bc2-befd-1bd7d525bd36",
      "order_version": "3",
      "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/08b617c7-6867-4e0f-911e-a0e3a1043ae7/messages` → **201**

```json
{
  "command_id": "bd605ebb-8267-45b1-aefc-210e116babcd",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "66959a79-f4ba-4836-8dee-38342ee989e1",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T07:56:28.673441074Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3542a174-7bc5-495d-848d-59b1c5738994",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "assignment_id": "8915b9c7-0df0-4fbd-8967-8e0a9e39d430",
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

`POST /api/driver/v1/trips/3542a174-7bc5-495d-848d-59b1c5738994/messages` → **201**

```json
{
  "command_id": "1abf2ba3-6bb4-41f5-adb6-29e50ec390c8",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "65d74e12-e487-454d-a998-29c80ede95dc",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T07:56:29.200416586Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/08b617c7-6867-4e0f-911e-a0e3a1043ae7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/3542a174-7bc5-495d-848d-59b1c5738994/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677904069"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/52d8ff61-71f5-43cb-b387-d616e0588bba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:29Z",
    "sequence": 1793260589999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:30.016943Z",
  "last_location_at": "2026-10-29T07:56:30.016943Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3542a174-7bc5-495d-848d-59b1c5738994",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "assignment_id": "8915b9c7-0df0-4fbd-8967-8e0a9e39d430",
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

`POST /api/driver/v1/trips/3542a174-7bc5-495d-848d-59b1c5738994/arrive` → **200**

```json
{
  "command_id": "2f0e48a2-71ea-4eda-bb32-31f0265ddc0c",
  "expected_version": 0
}
```

```json
{
  "id": "3542a174-7bc5-495d-848d-59b1c5738994",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "assignment_id": "8915b9c7-0df0-4fbd-8967-8e0a9e39d430",
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
  "arrived_at": "2026-10-29T07:56:30.558194Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3542a174-7bc5-495d-848d-59b1c5738994/start` → **200**

```json
{
  "command_id": "b6255c3d-3c0d-4f98-a48a-f24eac433a68",
  "expected_version": 1
}
```

```json
{
  "id": "3542a174-7bc5-495d-848d-59b1c5738994",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "assignment_id": "8915b9c7-0df0-4fbd-8967-8e0a9e39d430",
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
  "arrived_at": "2026-10-29T07:56:30.558194Z",
  "started_at": "2026-10-29T07:56:30.841717Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/52d8ff61-71f5-43cb-b387-d616e0588bba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:31Z",
    "sequence": 1793260591107
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:31.125949Z",
  "last_location_at": "2026-10-29T07:56:31.125949Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/3542a174-7bc5-495d-848d-59b1c5738994/complete` → **200**

```json
{
  "command_id": "e8e06974-3f5e-42f7-8821-27b75faa811d",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:56:31Z",
  "cash_received": true
}
```

```json
{
  "id": "3542a174-7bc5-495d-848d-59b1c5738994",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "assignment_id": "8915b9c7-0df0-4fbd-8967-8e0a9e39d430",
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
  "arrived_at": "2026-10-29T07:56:30.558194Z",
  "started_at": "2026-10-29T07:56:30.841717Z",
  "completed_at": "2026-10-29T07:56:31.40606Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/08b617c7-6867-4e0f-911e-a0e3a1043ae7` → **200**

```json
{
  "id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7e1a3a36-02b6-45a3-89d0-f89d36474572",
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
    "id": "8915b9c7-0df0-4fbd-8967-8e0a9e39d430",
    "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3542a174-7bc5-495d-848d-59b1c5738994",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:56:26.734939Z",
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
    "id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:56:26.734939Z",
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
    "id": "3542a174-7bc5-495d-848d-59b1c5738994",
    "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
    "order_short_number": 12,
    "created_at": "2026-10-29T07:56:27.308649Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "21ca26ac-c7b9-4471-ba22-b6e32db27ca2",
    "order_id": "966ef850-6c86-4d4a-884c-38e0d0138258",
    "order_short_number": 8,
    "created_at": "2026-10-29T07:55:33.607842Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a3508fc5-7550-4d2c-ac0e-eb60dd5667f6",
    "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
    "order_short_number": 3,
    "created_at": "2026-10-29T07:54:52.718472Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7786a3ab-8748-4630-8a09-8b1adf0a832a",
    "order_id": "6aa7b2c4-bbf6-4841-bcb0-22a0c7b0ef29",
    "order_short_number": 2,
    "created_at": "2026-10-29T07:54:31.496107Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8507a609-eb34-4437-b1fd-8ae92b7601d6",
    "order_id": "5006aae9-55ad-4a5e-ac1c-3d05b07234b8",
    "order_short_number": 1,
    "created_at": "2026-10-29T07:54:22.120508Z",
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

`GET /api/rider/v1/orders/08b617c7-6867-4e0f-911e-a0e3a1043ae7/tip` → **200**

```json
{
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
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
  "available_until": "2026-10-30T07:56:31.40606Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/08b617c7-6867-4e0f-911e-a0e3a1043ae7/tip` → **201**

```json
{
  "command_id": "ada37607-de90-4994-887d-697512547ef2",
  "amount_minor": 1100
}
```

```json
{
  "id": "d79ac59b-6f0f-4f2e-a733-22a08781f044",
  "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T07:56:36.38274Z"
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
  "session_id": "81d7a865-2a74-4db8-abd8-5543b350c5e6",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0OTYsImlhdCI6MTc5MzI2MDU5NiwianRpIjoiOWY3ZTA0YmEtMjNmMi00MjFlLWI0OGYtMjhjNzRiM2Q2YjFhIiwic2lkIjoiODFkN2E4NjUtMmE3NC00ZGI4LWFiZDgtNTU0M2IzNTBjNWU2In0.sBtrOV6LkH5bvdzPwA1LJEXF6a2xPZBsf0CVewYhl3w",
  "access_expires_at": "2026-10-29T08:11:36.959690162Z",
  "refresh_token": "baSSNaFd4R9a4HsoiOD-Nz1RO7314vz7KOu7QEpBEjM",
  "refresh_expires_at": "2026-10-29T19:56:36.959132978Z",
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
          "PHONE": 1,
          "APP": 11
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
      "PHONE": 1,
      "APP": 11
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
  "generated_at": "2026-10-29T07:56:37.228456386Z"
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
  "generated_at": "2026-10-29T07:56:37.505334569Z"
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
  "session_id": "767d185d-5deb-42ca-842c-e83df34e10c3",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0OTgsImlhdCI6MTc5MzI2MDU5OCwianRpIjoiOTZmZWRiMmItZDgxMi00ZGQwLWE3NjgtZTBlM2ZhMjQxYmI3Iiwic2lkIjoiNzY3ZDE4NWQtNWRlYi00MmNhLTg0MmMtZTgzZGYzNGUxMGMzIn0.r-ayz4cmYRWYE10yzRB2pyr6__dQ0XSYsfsnaDRQl3U",
  "access_expires_at": "2026-10-29T08:11:38.065898754Z",
  "refresh_token": "B-e7b60UfPfdO6gZXYrDCizpZA9AtWBprX4OuXDnOEU",
  "refresh_expires_at": "2026-10-29T19:56:38.065228468Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/08b617c7-6867-4e0f-911e-a0e3a1043ae7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:56:26.735375Z",
      "actor": {
        "type": "CLIENT",
        "id": "7e1a3a36-02b6-45a3-89d0-f89d36474572",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
        "quote_id": "c2e5b6cb-8052-4c3a-95cc-fc67d2c63953",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cdbd1161-d76e-4e9f-a60b-8b97517db1ba"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:56:26.737127Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
        "attempt_id": "6c686f8a-fec9-46e0-88d0-d9a9f556a6aa",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cdbd1161-d76e-4e9f-a60b-8b97517db1ba"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:56:26.739683Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a18d2968-461c-4308-a0c2-c932c008700c",
        "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "cdbd1161-d76e-4e9f-a60b-8b97517db1ba"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:56:27.310155Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a18d2968-461c-4308-a0c2-c932c008700c",
        "order_id": "08b617c7-6867-4e0f-911e-a0e3a1043ae7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8915b9c7-0df0-4fbd-8967-8e0a9e39d430"
      },
      "correlation_id": "c1b19c7f-35cd-4333-ab71-8c55ad4db9a9"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T07:56:38.637135372Z",
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
      "last_location_at": "2026-10-29T07:56:31.125949Z",
      "order_id": null
    }
  ]
}
```

Done: order 08b617c7-6867-4e0f-911e-a0e3a1043ae7.

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
  "session_id": "5ff31c6e-2cbe-4d68-b27b-42a5a2ebe3a5",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE0OTksImlhdCI6MTc5MzI2MDU5OSwianRpIjoiMTljOGMzNGItMWI1OC00MDA1LWFhNTAtZjg4ZWI0MzNjMjdmIiwic2lkIjoiNWZmMzFjNmUtMmNiZS00ZDY4LWIyN2ItNDJhNWEyZWJlM2E1In0.bECtgj4a91feiUEPNPdkuBTBRSj-NIJF6CwBL8V2V3Q",
  "access_expires_at": "2026-10-29T08:11:39.236091703Z",
  "refresh_token": "YH21VXtNuarfwpqad7Rck6964vJegEX8HTazatrjL7k",
  "refresh_expires_at": "2026-10-29T19:56:39.235496909Z",
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
  "command_id": "bde8c1f5-cdff-4a37-ab78-d7e69b6c00c6",
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
  "timestamp": "2026-10-29T07:56:40.000+0000",
  "channel": {
    "id": "1730052000.3232318516",
    "linkedid": "1730052000.3232318516",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676482802"
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
  "timestamp": "2026-10-29T07:56:40.000+0000",
  "channel": {
    "id": "1730052000.3232318516",
    "linkedid": "1730052000.3232318516",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676482802"
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
  "session_id": "1389642a-96d1-42fc-91f1-5ff0d3059a86",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1MDAsImlhdCI6MTc5MzI2MDYwMCwianRpIjoiMDVmZThhNGQtZWQzZS00YmFlLWI0NzUtZjRhNmM2MTIyMTRjIiwic2lkIjoiMTM4OTY0MmEtOTZkMS00MmZjLTkxZjEtNWZmMGQzMDU5YTg2In0.Mqd1PApIEO9_MA6F1y1ebv6q1K1nNLG2aLxZLDhX0rQ",
  "access_expires_at": "2026-10-29T08:11:40.386014582Z",
  "refresh_token": "9ATc91EJD-FGSOwKpA8k2DuIVKrqmt3CQ0mcjyCuMIo",
  "refresh_expires_at": "2026-10-29T19:56:40.385442473Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "98ad299c-e11d-4cce-8298-ecd2a11a76c8",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676482802",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:56:40Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/98ad299c-e11d-4cce-8298-ecd2a11a76c8/answer` → **200**

```json
{
  "command_id": "8d563077-9c79-403f-b17d-99a1536543f1"
}
```

```json
{
  "id": "98ad299c-e11d-4cce-8298-ecd2a11a76c8",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676482802",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "order_ids": [],
  "started_at": "2026-10-29T07:56:40Z",
  "answered_at": "2026-10-29T07:56:40.952699Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.3232318516",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3d68c1dc-72ae-4e52-96a4-c43938ead035",
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
  "id": "2dfc3fbb-375a-4b2d-8fde-e2e3727ed45b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:01:41.255375Z",
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
  "command_id": "62091225-a186-452b-9d84-af391dea699d",
  "quote_id": "2dfc3fbb-375a-4b2d-8fde-e2e3727ed45b",
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
    "phone": "+380676482802"
  },
  "call_id": "98ad299c-e11d-4cce-8298-ecd2a11a76c8"
}
```

```json
{
  "id": "b9266c4a-7940-49aa-8e45-2b1788aae174",
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
  "created_at": "2026-10-29T07:56:41.538447Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676482802"
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
    "id": "1730052000.3232318516",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "98ad299c-e11d-4cce-8298-ecd2a11a76c8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676482802",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [
        "b9266c4a-7940-49aa-8e45-2b1788aae174"
      ],
      "started_at": "2026-10-29T07:56:40Z",
      "answered_at": "2026-10-29T07:56:40.952699Z",
      "ended_at": "2026-10-29T07:56:41.841067Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "79cb413b-d37d-41de-9372-a1693252f9b8",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672709960",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [],
      "started_at": "2026-10-29T07:54:39.458137Z",
      "answered_at": "2026-10-29T07:54:39.7676Z",
      "ended_at": "2026-10-29T07:54:40.072902Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:54:48.446149Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/b9266c4a-7940-49aa-8e45-2b1788aae174` → **200**

```json
{
  "id": "b9266c4a-7940-49aa-8e45-2b1788aae174",
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
  "created_at": "2026-10-29T07:56:41.538447Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676482802"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/b9266c4a-7940-49aa-8e45-2b1788aae174` → **200**

```json
{
  "id": "b9266c4a-7940-49aa-8e45-2b1788aae174",
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
  "created_at": "2026-10-29T07:56:41.538447Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676482802"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b9266c4a-7940-49aa-8e45-2b1788aae174/cancel` → **200**

```json
{
  "command_id": "c79d0f2d-feed-4f32-96fd-e4cd28b370c5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b9266c4a-7940-49aa-8e45-2b1788aae174",
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
  "created_at": "2026-10-29T07:56:41.538447Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676482802"
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

Done: call 98ad299c-e11d-4cce-8298-ecd2a11a76c8 with order b9266c4a-7940-49aa-8e45-2b1788aae174.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11449"
}
```

```json
{
  "challenge_id": "ffae7a64-a461-4fe4-8752-70c7265b1ac8",
  "expires_at": "2026-10-29T08:01:43.038051587Z",
  "resend_available_at": "2026-10-29T07:56:44.038051587Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "619280",
  "sent_at": "2026-10-29T07:56:43.040416006Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ffae7a64-a461-4fe4-8752-70c7265b1ac8",
  "code": "619280",
  "device_ref": "sandbox-11449"
}
```

```json
{
  "session_id": "93079f9b-8606-4462-ae4d-3a364a5fb61e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTUwMywiaWF0IjoxNzkzMjYwNjAzLCJqdGkiOiIwYWVlZjQ3YS1lN2MwLTRjNjktYTZkZi1hZTQ4OWZkZWVmMzMiLCJzaWQiOiI5MzA3OWY5Yi04NjA2LTQ0NjItYWU0ZC0zYTM2NGE1ZmI2MWUifQ.NIGlExH_Zo4sEB3Z1YRMvAdWD-qGVHSPmZO_I6a04Mo",
  "access_expires_at": "2026-10-29T08:11:43.406400803Z",
  "refresh_token": "TcNQ14TGuMLcz9h4KRfr0g0274e5y4e6_zyAVl-IueY",
  "refresh_expires_at": "2026-11-28T07:56:43.405850614Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:31.125949Z",
  "last_location_at": "2026-10-29T07:56:31.125949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/52d8ff61-71f5-43cb-b387-d616e0588bba/handover` → **200**

```json
{
  "command_id": "684c0bab-2320-4806-8d80-e0ae237c457b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:31.125949Z",
  "last_location_at": "2026-10-29T07:56:31.125949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/52d8ff61-71f5-43cb-b387-d616e0588bba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:44Z",
    "sequence": 1793260604292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:44.309992Z",
  "last_location_at": "2026-10-29T07:56:44.309992Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667206760",
  "device_ref": "sandbox-9183"
}
```

```json
{
  "challenge_id": "ce8c7774-fa2b-46bc-b1ba-08e5b3137db7",
  "expires_at": "2026-10-29T08:01:44.578480519Z",
  "resend_available_at": "2026-10-29T07:56:45.578480519Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667206760` → **200**

```json
{
  "phone": "+380667206760",
  "audience": "CLIENT",
  "code": "872996",
  "sent_at": "2026-10-29T07:56:44.580661656Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce8c7774-fa2b-46bc-b1ba-08e5b3137db7",
  "code": "872996",
  "device_ref": "sandbox-9183"
}
```

```json
{
  "session_id": "12194a12-968d-4a63-805f-f0dd7fca1ab6",
  "subject": {
    "type": "CLIENT",
    "id": "afaa0a06-b36c-4b43-bb8a-002256d0aa6b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmFhMGEwNi1iMzZjLTRiNDMtYmI4YS0wMDIyNTZkMGFhNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTA0LCJpYXQiOjE3OTMyNjA2MDQsImp0aSI6ImEwYzUwYTNlLTNjZTUtNDE0NC04NjMwLTE0OTA4MTNiYmEzOCIsInNpZCI6IjEyMTk0YTEyLTk2OGQtNGE2My04MDVmLWYwZGQ3ZmNhMWFiNiJ9.HT--cTfFckB8W1BArSOewLBZTsErpLtm04cFu-vS8EM",
  "access_expires_at": "2026-10-29T08:11:44.871478037Z",
  "refresh_token": "avEe8Csyjmk274K2LT_NOHfXUb5xkVI7-UhUKwNpibY",
  "refresh_expires_at": "2026-11-28T07:56:44.870938278Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8170837e-3082-4a20-ac4c-1bfbbd369d0a",
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
  "id": "41099bd3-3f05-4001-bf1d-7f3e562cfcce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:01:45.149511Z",
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
  "command_id": "544b03a8-0861-4768-9c4b-df31c70e4da7",
  "quote_id": "41099bd3-3f05-4001-bf1d-7f3e562cfcce",
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
  "id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "afaa0a06-b36c-4b43-bb8a-002256d0aa6b",
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
  "created_at": "2026-10-29T07:56:45.435576Z",
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
    "id": "93dd226a-57be-4161-9964-1348dcf7ad10",
    "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
    "expires_at": "2026-10-29T07:57:00.438883Z",
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

`POST /api/driver/v1/offers/93dd226a-57be-4161-9964-1348dcf7ad10/accept` → **200**

```json
{
  "command_id": "7fa9289c-d9b6-41c9-8278-6cb213658c0e"
}
```

```json
{
  "id": "a52ce731-abc6-4361-bf2b-5189ab02ab8e",
  "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0d5b1230-57ba-496b-b81c-eb0fe3f2bc49",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0d5b1230-57ba-496b-b81c-eb0fe3f2bc49",
  "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
  "assignment_id": "a52ce731-abc6-4361-bf2b-5189ab02ab8e",
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

`POST /api/driver/v1/work-sessions/52d8ff61-71f5-43cb-b387-d616e0588bba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:46Z",
    "sequence": 1793260606546
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:46.56466Z",
  "last_location_at": "2026-10-29T07:56:46.56466Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0d5b1230-57ba-496b-b81c-eb0fe3f2bc49/arrive` → **200**

```json
{
  "command_id": "84087cc5-d04d-4a02-ba40-11ecbaba87fa",
  "expected_version": 0
}
```

```json
{
  "id": "0d5b1230-57ba-496b-b81c-eb0fe3f2bc49",
  "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
  "assignment_id": "a52ce731-abc6-4361-bf2b-5189ab02ab8e",
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
  "arrived_at": "2026-10-29T07:56:46.847277Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0d5b1230-57ba-496b-b81c-eb0fe3f2bc49/start` → **200**

```json
{
  "command_id": "1671f4b4-fd09-4e06-8e8d-49189e6a7976",
  "expected_version": 1
}
```

```json
{
  "id": "0d5b1230-57ba-496b-b81c-eb0fe3f2bc49",
  "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
  "assignment_id": "a52ce731-abc6-4361-bf2b-5189ab02ab8e",
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
  "arrived_at": "2026-10-29T07:56:46.847277Z",
  "started_at": "2026-10-29T07:56:47.138479Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/52d8ff61-71f5-43cb-b387-d616e0588bba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:47Z",
    "sequence": 1793260607409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:47.427502Z",
  "last_location_at": "2026-10-29T07:56:47.427502Z",
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
  "device_ref": "sandbox-6697"
}
```

```json
{
  "challenge_id": "34580f5c-5641-4301-8d82-abced1bfd4c1",
  "expires_at": "2026-10-29T08:01:47.705825591Z",
  "resend_available_at": "2026-10-29T07:56:48.705825591Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "039189",
  "sent_at": "2026-10-29T07:56:47.708502789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34580f5c-5641-4301-8d82-abced1bfd4c1",
  "code": "039189",
  "device_ref": "sandbox-6697"
}
```

```json
{
  "session_id": "7a570d87-1e3d-4ba1-822d-85398d725951",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTUwOCwiaWF0IjoxNzkzMjYwNjA4LCJqdGkiOiI5ZTIxNTdlMy01ZWY1LTQ3NmQtOTJjMi01YWI5YzMzY2Q5YjciLCJzaWQiOiI3YTU3MGQ4Ny0xZTNkLTRiYTEtODIyZC04NTM5OGQ3MjU5NTEifQ.jwoCTDYxYuHNvnk93CCsyWwKesdeHuxSin60rd8K_9c",
  "access_expires_at": "2026-10-29T08:11:48.002063614Z",
  "refresh_token": "QWf1LD-U7WfTmFVZbGKWbf8UmQDgesbloGiWAbf_u9w",
  "refresh_expires_at": "2026-11-28T07:56:48.001576291Z",
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
  "command_id": "3a14790d-b33f-4e8a-8f2c-ceab9740833d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:48Z",
    "sequence": 1793260608554
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f0e7f171-0def-4f14-bb27-a6b2fab951c7",
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
  "last_heartbeat_at": "2026-10-29T07:56:48.572947Z",
  "last_location_at": "2026-10-29T07:56:48.572947Z",
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
  "session_id": "bab55884-f453-4374-be94-deb33de4a747",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1MDksImlhdCI6MTc5MzI2MDYwOSwianRpIjoiMDNiZDI5MTctMTRlZi00M2Q0LTg0YzctZjg2N2VlMWE3NTgyIiwic2lkIjoiYmFiNTU4ODQtZjQ1My00Mzc0LWJlOTQtZGViMzNkZTRhNzQ3In0.uYlQH1woRwycRmNJeUSFMZ7JO_UWHAYnTo7YR7VlbRA",
  "access_expires_at": "2026-10-29T08:11:49.144751092Z",
  "refresh_token": "69r-W6oe5bg6FYNzdth8xoeOybD-ObC8McXvZEkWdc4",
  "refresh_expires_at": "2026-10-29T19:56:49.144181395Z",
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
  "session_id": "5114a616-9e9d-4903-ab06-346cd77f572a",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1MDksImlhdCI6MTc5MzI2MDYwOSwianRpIjoiOGNkNGRiNDAtYzU5MC00NjA4LThkMTEtNGU1MjMyMDMxZjg0Iiwic2lkIjoiNTExNGE2MTYtOWU5ZC00OTAzLWFiMDYtMzQ2Y2Q3N2Y1NzJhIn0.1qTBt2K_-LF3-mMb3kG9IokzW-Y7Xuyi4uuQkL-7FjY",
  "access_expires_at": "2026-10-29T08:11:49.717501909Z",
  "refresh_token": "DXqQMH4ytOn3SYF-qgoGP_8z5WjHIX9kqT-FQEzrKlo",
  "refresh_expires_at": "2026-10-29T19:56:49.716822669Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ac242292-8b61-4fec-8027-f14f1979ff4d` → **200**

```json
{
  "id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "afaa0a06-b36c-4b43-bb8a-002256d0aa6b",
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
    "id": "a52ce731-abc6-4361-bf2b-5189ab02ab8e",
    "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0d5b1230-57ba-496b-b81c-eb0fe3f2bc49",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T07:56:45.435576Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ac242292-8b61-4fec-8027-f14f1979ff4d/interrupt` → **200**

```json
{
  "command_id": "18e48ab1-374d-4819-ad7c-53847c5af6f7",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "afaa0a06-b36c-4b43-bb8a-002256d0aa6b",
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
      "id": "a52ce731-abc6-4361-bf2b-5189ab02ab8e",
      "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "0d5b1230-57ba-496b-b81c-eb0fe3f2bc49",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T07:56:45.435576Z",
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
    "id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "afaa0a06-b36c-4b43-bb8a-002256d0aa6b",
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
    "id": "727f2a8c-1e89-435f-8953-2738160770c8",
    "order_id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
    "expires_at": "2026-10-29T07:57:05.323703Z",
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

`POST /api/driver/v1/offers/727f2a8c-1e89-435f-8953-2738160770c8/accept` → **200**

```json
{
  "command_id": "aa55f307-44b1-4b1f-b932-5aef8b302bdc"
}
```

```json
{
  "id": "11cd5d34-6809-48ff-9a2a-e8c25f0105c2",
  "order_id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "277194f2-e5a6-4a12-acae-25ad624c5818",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "277194f2-e5a6-4a12-acae-25ad624c5818",
  "order_id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
  "assignment_id": "11cd5d34-6809-48ff-9a2a-e8c25f0105c2",
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
  "session_id": "f0e7f171-0def-4f14-bb27-a6b2fab951c7",
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
  "last_heartbeat_at": "2026-10-29T07:56:48.572947Z",
  "last_location_at": "2026-10-29T07:56:48.572947Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f0e7f171-0def-4f14-bb27-a6b2fab951c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:56:51Z",
    "sequence": 1793260611739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f0e7f171-0def-4f14-bb27-a6b2fab951c7",
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
  "last_heartbeat_at": "2026-10-29T07:56:51.757465Z",
  "last_location_at": "2026-10-29T07:56:51.757465Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/277194f2-e5a6-4a12-acae-25ad624c5818/arrive` → **200**

```json
{
  "command_id": "e5a0bec4-b9e1-4652-b387-c71dc8c7209c",
  "expected_version": 0
}
```

```json
{
  "id": "277194f2-e5a6-4a12-acae-25ad624c5818",
  "order_id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
  "assignment_id": "11cd5d34-6809-48ff-9a2a-e8c25f0105c2",
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
  "arrived_at": "2026-10-29T07:56:52.038083Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/277194f2-e5a6-4a12-acae-25ad624c5818/start` → **200**

```json
{
  "command_id": "bae42ad0-d53f-49f9-8cd8-05d6294f8f8a",
  "expected_version": 1
}
```

```json
{
  "id": "277194f2-e5a6-4a12-acae-25ad624c5818",
  "order_id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
  "assignment_id": "11cd5d34-6809-48ff-9a2a-e8c25f0105c2",
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
  "arrived_at": "2026-10-29T07:56:52.038083Z",
  "started_at": "2026-10-29T07:56:52.328559Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/277194f2-e5a6-4a12-acae-25ad624c5818/complete` → **200**

```json
{
  "command_id": "05c25d8a-4df0-4dc3-b384-fbc2d25eeaf9",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:56:52Z"
}
```

```json
{
  "id": "277194f2-e5a6-4a12-acae-25ad624c5818",
  "order_id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
  "assignment_id": "11cd5d34-6809-48ff-9a2a-e8c25f0105c2",
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
  "arrived_at": "2026-10-29T07:56:52.038083Z",
  "started_at": "2026-10-29T07:56:52.328559Z",
  "completed_at": "2026-10-29T07:56:52.617046Z",
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
    "id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:56:50.312949Z",
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
    "id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:56:45.435576Z",
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

`GET /api/operator/v1/orders/ac242292-8b61-4fec-8027-f14f1979ff4d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:56:45.436139Z",
      "actor": {
        "type": "CLIENT",
        "id": "afaa0a06-b36c-4b43-bb8a-002256d0aa6b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
        "quote_id": "41099bd3-3f05-4001-bf1d-7f3e562cfcce",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "61e8b824-d47f-4671-b36b-59a7b9b06a35"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:56:45.438131Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
        "attempt_id": "eae9a411-7994-4b9e-8893-382c220bdea5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "61e8b824-d47f-4671-b36b-59a7b9b06a35"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:56:45.441025Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "93dd226a-57be-4161-9964-1348dcf7ad10",
        "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "61e8b824-d47f-4671-b36b-59a7b9b06a35"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:56:46.012239Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "93dd226a-57be-4161-9964-1348dcf7ad10",
        "order_id": "ac242292-8b61-4fec-8027-f14f1979ff4d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a52ce731-abc6-4361-bf2b-5189ab02ab8e"
      },
      "correlation_id": "945d7292-abb7-42aa-a5bf-1ce6692851b0"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/a000aad8-2eaf-4727-a4ad-759d7bb79538/tip` → **200**

```json
{
  "order_id": "a000aad8-2eaf-4727-a4ad-759d7bb79538",
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
  "available_until": "2026-10-30T07:56:52.617046Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/a000aad8-2eaf-4727-a4ad-759d7bb79538/tip` → **409**

```json
{
  "command_id": "fd2042f3-9e67-4a37-8214-312e1939be49",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/a000aad8-2eaf-4727-a4ad-759d7bb79538/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "65226098-e10f-46de-9493-a1e90700b23e"
}
```

Done: interrupted ac242292-8b61-4fec-8027-f14f1979ff4d, follow-up a000aad8-2eaf-4727-a4ad-759d7bb79538.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52d8ff61-71f5-43cb-b387-d616e0588bba",
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
  "last_heartbeat_at": "2026-10-29T07:56:47.427502Z",
  "last_location_at": "2026-10-29T07:56:47.427502Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/52d8ff61-71f5-43cb-b387-d616e0588bba/close` → **200**

```json
{
  "command_id": "75e9d9b2-4705-4ddb-a1c3-6052776e6dff",
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
  "session_id": "f0e7f171-0def-4f14-bb27-a6b2fab951c7",
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
  "last_heartbeat_at": "2026-10-29T07:56:51.757465Z",
  "last_location_at": "2026-10-29T07:56:51.757465Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f0e7f171-0def-4f14-bb27-a6b2fab951c7/close` → **200**

```json
{
  "command_id": "9cb3cc5e-35f3-4f79-8b24-bb6e9396bf02",
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
  "session_id": "172645a9-b321-4430-a915-84241bbb0549",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1MTgsImlhdCI6MTc5MzI2MDYxOCwianRpIjoiMGZlOWMwZjAtODA0MS00Y2VmLWFiMGEtNTdiMDQ1ODMzZTQzIiwic2lkIjoiMTcyNjQ1YTktYjMyMS00NDMwLWE5MTUtODQyNDFiYmIwNTQ5In0.gnUPd-js8SH8zDgcyjE3Qbtdl-Xj9LV9JsvQ_U4C8_A",
  "access_expires_at": "2026-10-29T08:11:58.681012314Z",
  "refresh_token": "J1ZUJaMAN04hUtjK0fTFhMgnkBdQcmtulqoEShyj9Tc",
  "refresh_expires_at": "2026-10-29T19:56:58.680442466Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ce34172a-90cf-426b-8617-0d88ac54ef88",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:56:58Z"
}
```

```json
{
  "id": "4aeb899f-510f-40f4-9b71-90aa24ac93d7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:56:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4aeb899f-510f-40f4-9b71-90aa24ac93d7/publish` → **200**

```json
{
  "command_id": "9ac27d3f-c95b-4fed-899f-85fa46be7a2d",
  "expected_version": 0
}
```

```json
{
  "id": "4aeb899f-510f-40f4-9b71-90aa24ac93d7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:56:59.254307Z",
  "published_at": "2026-10-29T07:56:59.254307Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "4aeb899f-510f-40f4-9b71-90aa24ac93d7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T07:56:59.254307Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633445353",
  "device_ref": "sandbox-29428"
}
```

```json
{
  "challenge_id": "c9c72b5d-4a9b-4850-ab1d-baaca2892da4",
  "expires_at": "2026-10-29T08:01:59.78700471Z",
  "resend_available_at": "2026-10-29T07:57:00.78700471Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633445353` → **200**

```json
{
  "phone": "+380633445353",
  "audience": "CLIENT",
  "code": "180521",
  "sent_at": "2026-10-29T07:56:59.789582307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c9c72b5d-4a9b-4850-ab1d-baaca2892da4",
  "code": "180521",
  "device_ref": "sandbox-29428"
}
```

```json
{
  "session_id": "44092355-00e2-44da-9d30-85f481f9ddcd",
  "subject": {
    "type": "CLIENT",
    "id": "d63967f5-1042-4d4e-949f-716fc263eb9e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjM5NjdmNS0xMDQyLTRkNGUtOTQ5Zi03MTZmYzI2M2ViOWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTIwLCJpYXQiOjE3OTMyNjA2MjAsImp0aSI6ImQ5YTU4MGQ4LTc3ZDYtNGEwYy1iOTY2LThkMDY2NmZlMTMxZCIsInNpZCI6IjQ0MDkyMzU1LTAwZTItNDRkYS05ZDMwLTg1ZjQ4MWY5ZGRjZCJ9.hNHSsfaP4ur6ZDi6tTEYt_UoOxUMdfJnIfYHAgoXpy0",
  "access_expires_at": "2026-10-29T08:12:00.085875588Z",
  "refresh_token": "Ir3TLdfZMhJ_gS5DwxdppDILEnAG_pdWs-47ZAhInks",
  "refresh_expires_at": "2026-11-28T07:57:00.085278337Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "4aeb899f-510f-40f4-9b71-90aa24ac93d7",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T07:56:59.254307Z",
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
  "command_id": "100121e7-2d4c-4b1f-ae14-d8898c50090f",
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
  "id": "afd1671e-6885-4e9e-9bbb-6d1530e6470e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:00.634475Z",
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
  "command_id": "25595e23-7b67-4f95-ae37-ff12f405e61d",
  "quote_id": "afd1671e-6885-4e9e-9bbb-6d1530e6470e",
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
  "correlation_id": "19c48f6e-6e67-415e-b362-13a4950e929d"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "57e8c75a-518e-4679-8a77-4e4c72b16822",
  "version_id": "4aeb899f-510f-40f4-9b71-90aa24ac93d7",
  "language": "uk"
}
```

```json
{
  "version_id": "4aeb899f-510f-40f4-9b71-90aa24ac93d7",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T07:57:01.214411Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "830976a0-38e2-4d70-8e78-6f508e7702ea",
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
  "id": "315db824-1ec6-46c7-b3ca-de5612beabb2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:01.487942Z",
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
  "command_id": "07f7facd-ec52-4f6c-9460-99c53b72b041",
  "quote_id": "315db824-1ec6-46c7-b3ca-de5612beabb2",
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
  "id": "38a47b0a-5bb8-4892-8bb9-6dee38065c5f",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d63967f5-1042-4d4e-949f-716fc263eb9e",
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
  "created_at": "2026-10-29T07:57:01.770278Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/38a47b0a-5bb8-4892-8bb9-6dee38065c5f` → **200**

```json
{
  "id": "38a47b0a-5bb8-4892-8bb9-6dee38065c5f",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d63967f5-1042-4d4e-949f-716fc263eb9e",
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
  "created_at": "2026-10-29T07:57:01.770278Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/38a47b0a-5bb8-4892-8bb9-6dee38065c5f/cancel` → **200**

```json
{
  "command_id": "c32f0181-d21e-434d-9285-15ac29af4020",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "38a47b0a-5bb8-4892-8bb9-6dee38065c5f",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d63967f5-1042-4d4e-949f-716fc263eb9e",
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
  "created_at": "2026-10-29T07:57:01.770278Z",
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

`POST /api/admin/v1/legal-documents/4aeb899f-510f-40f4-9b71-90aa24ac93d7` → **409**

```json
{
  "command_id": "6442b87e-dad6-44b0-b102-caf31ab2ec37",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:57:02Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/4aeb899f-510f-40f4-9b71-90aa24ac93d7",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "694b1f70-3fa2-4af1-8a8d-768b5c64c112"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "dc28c247-c8ff-436b-81b6-f8f9ad1b6de7",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:57:02Z"
}
```

```json
{
  "id": "606b9515-99d8-4023-a938-12e868c253a0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:57:02Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/606b9515-99d8-4023-a938-12e868c253a0/publish` → **200**

```json
{
  "command_id": "6518d982-d87b-4027-94bc-a73c74a7eb50",
  "expected_version": 0
}
```

```json
{
  "id": "606b9515-99d8-4023-a938-12e868c253a0",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:57:03.208051Z",
  "published_at": "2026-10-29T07:57:03.208051Z",
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
  "device_ref": "sandbox-12655"
}
```

```json
{
  "challenge_id": "f0d6bf8e-18ae-4ab8-87cb-cc296241c08b",
  "expires_at": "2026-10-29T08:02:03.480785993Z",
  "resend_available_at": "2026-10-29T07:57:04.480785993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "229783",
  "sent_at": "2026-10-29T07:57:03.48282834Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0d6bf8e-18ae-4ab8-87cb-cc296241c08b",
  "code": "229783",
  "device_ref": "sandbox-12655"
}
```

```json
{
  "session_id": "e0d5df60-e73e-4620-9627-7bec0d559428",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTUyMywiaWF0IjoxNzkzMjYwNjIzLCJqdGkiOiIxMzY4MDgwYy05NTEwLTQ0YWQtODY1NC1kNGI0YzMzM2M5NWYiLCJzaWQiOiJlMGQ1ZGY2MC1lNzNlLTQ2MjAtOTYyNy03YmVjMGQ1NTk0MjgifQ.ER5uxqCKQ2CEIfj9diqfjoYh9tct9v5EwpO_8jfv3WI",
  "access_expires_at": "2026-10-29T08:12:03.792093148Z",
  "refresh_token": "geLdobthML1WzC7QhRjMGwB0UODrYboBr56TvGceyUE",
  "refresh_expires_at": "2026-11-28T07:57:03.791557775Z",
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
  "command_id": "0f9abb19-a2e9-4452-9da7-0d2e92948f2c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:57:04Z",
    "sequence": 1793260624321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a484d5c0-4259-4eb3-bf8a-3bddaed96e3d",
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
  "last_heartbeat_at": "2026-10-29T07:57:04.339255Z",
  "last_location_at": "2026-10-29T07:57:04.339255Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675779256",
  "device_ref": "sandbox-14151"
}
```

```json
{
  "challenge_id": "c77a1dfe-3ceb-4fb3-baa5-096ad66b0bd3",
  "expires_at": "2026-10-29T08:02:04.609973549Z",
  "resend_available_at": "2026-10-29T07:57:05.609973549Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675779256` → **200**

```json
{
  "phone": "+380675779256",
  "audience": "CLIENT",
  "code": "996044",
  "sent_at": "2026-10-29T07:57:04.612384066Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c77a1dfe-3ceb-4fb3-baa5-096ad66b0bd3",
  "code": "996044",
  "device_ref": "sandbox-14151"
}
```

```json
{
  "session_id": "ed0925c2-9dcb-4315-b890-4ca855b9a566",
  "subject": {
    "type": "CLIENT",
    "id": "6abb07b0-5242-4aef-87da-8b2a51ea034c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YWJiMDdiMC01MjQyLTRhZWYtODdkYS04YjJhNTFlYTAzNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTI0LCJpYXQiOjE3OTMyNjA2MjQsImp0aSI6IjdiYzE5MjZkLWQ3NzItNDhlYS05MTk1LWQ2MDFjNjU2MmVjNyIsInNpZCI6ImVkMDkyNWMyLTlkY2ItNDMxNS1iODkwLTRjYTg1NWI5YTU2NiJ9.kVo4Zuk6luPTpmzLAjUUiQwnuwF9_yDk4yoxKnqm57I",
  "access_expires_at": "2026-10-29T08:12:04.911134489Z",
  "refresh_token": "1zgfdeXxAkBEeUcoqWp83BcwzQam8S4mZpPuFt3Le0M",
  "refresh_expires_at": "2026-11-28T07:57:04.910635133Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9ecbc008-9410-44c8-9159-da0da9df2309",
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
  "id": "4b762d70-a7db-4edb-9ca4-bd7b4cc5717c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:05.187955Z",
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
  "command_id": "4b87548b-0dd6-4493-89f4-f49f94c3c25d",
  "quote_id": "4b762d70-a7db-4edb-9ca4-bd7b4cc5717c",
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
    "phone": "+380671590068"
  }
}
```

```json
{
  "id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:57:05.476759Z",
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
    "id": "0c056abe-3e5b-45bb-92c0-db03012c2d07",
    "order_id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
    "expires_at": "2026-10-29T07:57:20.479909Z",
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

`POST /api/driver/v1/offers/0c056abe-3e5b-45bb-92c0-db03012c2d07/accept` → **200**

```json
{
  "command_id": "9826a5f5-a906-4129-9031-c0db8108980d"
}
```

```json
{
  "id": "2c612689-b7d6-4f08-93a6-cb053b3ffcf6",
  "order_id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8b949d9a-25a9-468e-98b4-4010013eb42a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8b949d9a-25a9-468e-98b4-4010013eb42a",
  "order_id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
  "assignment_id": "2c612689-b7d6-4f08-93a6-cb053b3ffcf6",
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
    "phone": "+380671590068"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e3b8433e-7b96-43a3-ad5f-c14978f4de9a",
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
  "id": "d8994bdf-3e62-42eb-bbdf-206011857dd4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:06.604971Z",
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
  "command_id": "92467534-debd-416f-ace6-378d0da1edf4",
  "quote_id": "d8994bdf-3e62-42eb-bbdf-206011857dd4",
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
  "id": "8fd96a6e-6b77-4b2a-9783-fa68c0d5b437",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:57:06.897614Z",
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
  "command_id": "7662b675-a489-4982-bfac-99492253099e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T10:57:07Z"
}
```

```json
{
  "id": "5e341d41-9488-49eb-b2ce-4091c8c19e8f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:07.204643Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:57:07Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "31b955e1-bf49-4a34-bbfd-ef4a81a13f7e",
  "quote_id": "5e341d41-9488-49eb-b2ce-4091c8c19e8f",
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
  "pickup_at": "2026-10-29T10:57:07Z"
}
```

```json
{
  "id": "839d39e9-0155-4449-93a1-f07ea9c75c6b",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:57:07.494777Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:57:07Z",
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
  "command_id": "043a4341-d5c8-4721-8a1d-0755b7b9ceb5",
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
  "id": "7cd19de1-81bc-4635-b383-4b2b81dfa404",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:07.797643Z",
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
  "command_id": "7e80952d-d787-4122-95ec-f61d996eaab2",
  "quote_id": "7cd19de1-81bc-4635-b383-4b2b81dfa404",
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
  "correlation_id": "356c9953-abc1-49aa-9926-aa3b9f103fe3"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "839d39e9-0155-4449-93a1-f07ea9c75c6b",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T07:57:07.494777Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T10:57:07Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "8fd96a6e-6b77-4b2a-9783-fa68c0d5b437",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T07:57:06.897614Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "8fd96a6e-6b77-4b2a-9783-fa68c0d5b437",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:57:06.897614Z",
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

`GET /api/rider/v1/orders/d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b` → **200**

```json
{
  "id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2c612689-b7d6-4f08-93a6-cb053b3ffcf6",
    "order_id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8b949d9a-25a9-468e-98b4-4010013eb42a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:57:05.476759Z",
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
    "location_at": "2026-10-29T07:57:04.339255Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b/cancel` → **200**

```json
{
  "command_id": "2aee042e-0510-4067-9f5e-aa914a79f112",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "2c612689-b7d6-4f08-93a6-cb053b3ffcf6",
    "order_id": "d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8b949d9a-25a9-468e-98b4-4010013eb42a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:57:05.476759Z",
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

`GET /api/rider/v1/orders/8fd96a6e-6b77-4b2a-9783-fa68c0d5b437` → **200**

```json
{
  "id": "8fd96a6e-6b77-4b2a-9783-fa68c0d5b437",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:57:06.897614Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8fd96a6e-6b77-4b2a-9783-fa68c0d5b437/cancel` → **200**

```json
{
  "command_id": "66fe7327-68a7-45ee-99e2-743d33df0f53",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8fd96a6e-6b77-4b2a-9783-fa68c0d5b437",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:57:06.897614Z",
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

`GET /api/rider/v1/orders/839d39e9-0155-4449-93a1-f07ea9c75c6b` → **200**

```json
{
  "id": "839d39e9-0155-4449-93a1-f07ea9c75c6b",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:57:07.494777Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:57:07Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/839d39e9-0155-4449-93a1-f07ea9c75c6b/cancel` → **200**

```json
{
  "command_id": "1504028a-e674-4fd0-9208-02165eeaa07c",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "839d39e9-0155-4449-93a1-f07ea9c75c6b",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6abb07b0-5242-4aef-87da-8b2a51ea034c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:57:07.494777Z",
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
  "pickup_at": "2026-10-29T10:57:07Z",
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
  "session_id": "a484d5c0-4259-4eb3-bf8a-3bddaed96e3d",
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
  "last_heartbeat_at": "2026-10-29T07:57:04.339255Z",
  "last_location_at": "2026-10-29T07:57:04.339255Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a484d5c0-4259-4eb3-bf8a-3bddaed96e3d/close` → **200**

```json
{
  "command_id": "bd29aa3a-2b1d-4b41-a5b2-ecfc2a4f6e9f",
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

Done: orders d8eb3f7d-942c-4b12-a0c8-2abfbfd76d4b, 8fd96a6e-6b77-4b2a-9783-fa68c0d5b437, 839d39e9-0155-4449-93a1-f07ea9c75c6b.

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
  "session_id": "55b97550-d7f5-4b00-987d-34d44bdfc69d",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1MzEsImlhdCI6MTc5MzI2MDYzMSwianRpIjoiOTIzY2I3YjgtN2YyNy00NzNlLTliZTQtMGMxODEwMmNlMDI5Iiwic2lkIjoiNTViOTc1NTAtZDdmNS00YjAwLTk4N2QtMzRkNDRiZGZjNjlkIn0.JFMkgxdFbOlPQNPWcWqKogNA5Iq_AckxpuKD9XLWEMA",
  "access_expires_at": "2026-10-29T08:12:11.542409361Z",
  "refresh_token": "T9vY8xxuX43T8og0dRHW159Xrn90vARtNOdWQpmN0yo",
  "refresh_expires_at": "2026-10-29T19:57:11.54190703Z",
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
  "session_id": "fa9290cb-41ed-4978-998b-c9288edc4950",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1MzIsImlhdCI6MTc5MzI2MDYzMiwianRpIjoiZjQ2YWI2OTMtNDMyNy00N2I1LTkwYzEtMDFhMzk1Y2QwMmVhIiwic2lkIjoiZmE5MjkwY2ItNDFlZC00OTc4LTk5OGItYzkyODhlZGM0OTUwIn0.FRt3Py6pG9IZhU-1XrLG2VE4Ua7sCzPQEnB2unnSJa4",
  "access_expires_at": "2026-10-29T08:12:12.093674673Z",
  "refresh_token": "DIXmXItwsG-OPw1Rj23qdLvVkpTqwtPDcXp4CE_Yk9Y",
  "refresh_expires_at": "2026-10-29T19:57:12.093170759Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19082"
}
```

```json
{
  "challenge_id": "f968b4e3-b417-4c20-ac16-07451b8d9aef",
  "expires_at": "2026-10-29T08:02:12.359714281Z",
  "resend_available_at": "2026-10-29T07:57:13.359714281Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "902466",
  "sent_at": "2026-10-29T07:57:12.361974866Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f968b4e3-b417-4c20-ac16-07451b8d9aef",
  "code": "902466",
  "device_ref": "sandbox-19082"
}
```

```json
{
  "session_id": "da3ae5cd-d4f4-4273-862c-b5aa9a525e00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTUzMiwiaWF0IjoxNzkzMjYwNjMyLCJqdGkiOiI0NGE4ZTcxYS1hYmZiLTRlNzktYWUwZi04NzFiOTE3MmI3ZmMiLCJzaWQiOiJkYTNhZTVjZC1kNGY0LTQyNzMtODYyYy1iNWFhOWE1MjVlMDAifQ.jhSsehrPEp82kcf_kn5WVvbzRNM6eP8KLvSKRKfQfdg",
  "access_expires_at": "2026-10-29T08:12:12.66611435Z",
  "refresh_token": "SlMz-1mOkevgjiEWVu497ZtsbkM9HNxaeqViCZOcsi4",
  "refresh_expires_at": "2026-11-28T07:57:12.665608251Z",
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
  "command_id": "7d17c3cd-58b2-4c9f-b833-537aaf45d48d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:57:13Z",
    "sequence": 1793260633198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "423e61cd-2ad3-476a-a11d-aee1515aceab",
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
  "last_heartbeat_at": "2026-10-29T07:57:13.216863Z",
  "last_location_at": "2026-10-29T07:57:13.216863Z",
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
  "command_id": "68be7bc9-8591-4546-b739-2d5892aa72f6",
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
  "effective_at": "2026-10-29T07:57:13.781091Z",
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "154415a5-2c56-488b-931a-26ab06629f74",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T07:54:56.36832Z",
  "last_entries": [
    {
      "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:54:56.36832Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "da924b14-6908-47e7-85b0-5d4561d3fbd9",
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
  "id": "ac0a2208-54f4-438b-a235-a61949c94ac1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:14.347324Z",
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
  "command_id": "77975f1b-f3a1-4240-9551-8a7b8e26061e",
  "quote_id": "ac0a2208-54f4-438b-a235-a61949c94ac1",
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
    "phone": "+3806711115132"
  }
}
```

```json
{
  "id": "d7ac39e4-34dd-4a17-b239-02bbb07932ad",
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
  "created_at": "2026-10-29T07:57:14.635966Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115132"
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
    "id": "608341d0-cfab-4360-8e58-9b44f4cadd35",
    "order_id": "d7ac39e4-34dd-4a17-b239-02bbb07932ad",
    "expires_at": "2026-10-29T07:57:29.639765Z",
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

`POST /api/driver/v1/offers/608341d0-cfab-4360-8e58-9b44f4cadd35/accept` → **200**

```json
{
  "command_id": "72267d51-a7a9-4f92-badb-e9d8895a22d8"
}
```

```json
{
  "id": "238ac795-e4ee-4f20-bd33-cf657315d9b3",
  "order_id": "d7ac39e4-34dd-4a17-b239-02bbb07932ad",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "360a33f7-6f99-4bed-a61c-e9117ba2dfce",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "360a33f7-6f99-4bed-a61c-e9117ba2dfce",
  "order_id": "d7ac39e4-34dd-4a17-b239-02bbb07932ad",
  "assignment_id": "238ac795-e4ee-4f20-bd33-cf657315d9b3",
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
    "phone": "+3806711115132"
  }
}
```

`POST /api/driver/v1/work-sessions/423e61cd-2ad3-476a-a11d-aee1515aceab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:57:15Z",
    "sequence": 1793260635735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "423e61cd-2ad3-476a-a11d-aee1515aceab",
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
  "last_heartbeat_at": "2026-10-29T07:57:15.753648Z",
  "last_location_at": "2026-10-29T07:57:15.753648Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/360a33f7-6f99-4bed-a61c-e9117ba2dfce/arrive` → **200**

```json
{
  "command_id": "e13c3b28-51e7-4325-b1e9-cfa308fa387c",
  "expected_version": 0
}
```

```json
{
  "id": "360a33f7-6f99-4bed-a61c-e9117ba2dfce",
  "order_id": "d7ac39e4-34dd-4a17-b239-02bbb07932ad",
  "assignment_id": "238ac795-e4ee-4f20-bd33-cf657315d9b3",
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
  "arrived_at": "2026-10-29T07:57:16.03829Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115132"
  }
}
```

`POST /api/driver/v1/trips/360a33f7-6f99-4bed-a61c-e9117ba2dfce/start` → **200**

```json
{
  "command_id": "d85eebeb-fa51-4489-8268-2c4edfe70d0a",
  "expected_version": 1
}
```

```json
{
  "id": "360a33f7-6f99-4bed-a61c-e9117ba2dfce",
  "order_id": "d7ac39e4-34dd-4a17-b239-02bbb07932ad",
  "assignment_id": "238ac795-e4ee-4f20-bd33-cf657315d9b3",
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
  "arrived_at": "2026-10-29T07:57:16.03829Z",
  "started_at": "2026-10-29T07:57:16.330485Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711115132"
  }
}
```

`POST /api/driver/v1/trips/360a33f7-6f99-4bed-a61c-e9117ba2dfce/complete` → **200**

```json
{
  "command_id": "80ca1b5e-c70e-4396-a620-1360f6544a63",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:57:16Z",
  "cash_received": true
}
```

```json
{
  "id": "360a33f7-6f99-4bed-a61c-e9117ba2dfce",
  "order_id": "d7ac39e4-34dd-4a17-b239-02bbb07932ad",
  "assignment_id": "238ac795-e4ee-4f20-bd33-cf657315d9b3",
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
  "arrived_at": "2026-10-29T07:57:16.03829Z",
  "started_at": "2026-10-29T07:57:16.330485Z",
  "completed_at": "2026-10-29T07:57:16.62255Z",
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
  "command_id": "e3f0d38d-4b9d-4ada-92c8-1ee7a2b52931",
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
  "id": "1de24b05-edc3-4405-b7e9-6024344a6758",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:16.923160Z",
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
  "command_id": "faa28377-5ca3-4b74-a075-03df93888a8e",
  "quote_id": "1de24b05-edc3-4405-b7e9-6024344a6758",
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
    "phone": "+3806711113841"
  }
}
```

```json
{
  "id": "d5f156ed-369f-4512-9494-01bc04ac9f80",
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
  "created_at": "2026-10-29T07:57:17.209823Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113841"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d5f156ed-369f-4512-9494-01bc04ac9f80` → **200**

```json
{
  "id": "d5f156ed-369f-4512-9494-01bc04ac9f80",
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
  "created_at": "2026-10-29T07:57:17.209823Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113841"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d5f156ed-369f-4512-9494-01bc04ac9f80/cancel` → **200**

```json
{
  "command_id": "5b856987-f574-4367-9d5c-de9efae581bc",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d5f156ed-369f-4512-9494-01bc04ac9f80",
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
  "created_at": "2026-10-29T07:57:17.209823Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113841"
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
  "staff_id": "154415a5-2c56-488b-931a-26ab06629f74",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T07:54:56.36832Z",
  "last_entries": [
    {
      "order_id": "d5f156ed-369f-4512-9494-01bc04ac9f80",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T07:57:17.806293Z"
    },
    {
      "order_id": "d7ac39e4-34dd-4a17-b239-02bbb07932ad",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T07:57:16.626928Z"
    },
    {
      "order_id": "eb5b01b6-a945-43fb-886b-bbadefc669cc",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:54:56.36832Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "423e61cd-2ad3-476a-a11d-aee1515aceab",
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
  "last_heartbeat_at": "2026-10-29T07:57:15.753648Z",
  "last_location_at": "2026-10-29T07:57:15.753648Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/423e61cd-2ad3-476a-a11d-aee1515aceab/close` → **200**

```json
{
  "command_id": "91334759-ae1e-47d2-81d5-296e05ca0088",
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

Done: operator bonus for fulfilled d7ac39e4-34dd-4a17-b239-02bbb07932ad and operator-fault cancellation d5f156ed-369f-4512-9494-01bc04ac9f80.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670982650",
  "device_ref": "sandbox-3803"
}
```

```json
{
  "challenge_id": "a9516844-228b-4740-bfe9-bd85e10f7250",
  "expires_at": "2026-10-29T08:02:20.951762344Z",
  "resend_available_at": "2026-10-29T07:57:21.951762344Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670982650` → **200**

```json
{
  "phone": "+380670982650",
  "audience": "CLIENT",
  "code": "164504",
  "sent_at": "2026-10-29T07:57:20.954049551Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672783547",
  "device_ref": "sandbox-986",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b50fcdf9-6b12-4641-989f-07e687c812a2",
  "expires_at": "2026-10-29T08:02:21.249129559Z",
  "resend_available_at": "2026-10-29T07:57:22.249129559Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672783547` → **200**

```json
{
  "phone": "+380672783547",
  "audience": "CLIENT",
  "code": "189571",
  "sent_at": "2026-10-29T07:57:21.251173989Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678870000",
  "device_ref": "sandbox-24375"
}
```

```json
{
  "challenge_id": "b4fb08ce-f309-4fcb-bfc3-7496de455c97",
  "expires_at": "2026-10-29T08:02:21.5420357Z",
  "resend_available_at": "2026-10-29T07:57:22.5420357Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678870000` → **200**

```json
{
  "phone": "+380678870000",
  "audience": "CLIENT",
  "code": "897184",
  "sent_at": "2026-10-29T07:57:21.545134341Z",
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
  "session_id": "84f9a24a-19b6-4cfd-ab4f-f44dc0c8b807",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NDIsImlhdCI6MTc5MzI2MDY0MiwianRpIjoiMjQwYmI4YTYtYmRlZS00YTI4LWFkNGItYTVlYThhYTA1YTEzIiwic2lkIjoiODRmOWEyNGEtMTliNi00Y2ZkLWFiNGYtZjQ0ZGMwYzhiODA3In0.UXEZOkDMQkLBNYYlVzL38ObTlxuANXq-FC45Kk_i6sA",
  "access_expires_at": "2026-10-29T08:12:22.13284982Z",
  "refresh_token": "nQCyvewAUy-Ukum0GCRAvFlA0k62csSeEQatMOFGh64",
  "refresh_expires_at": "2026-10-29T19:57:22.132052947Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678870000` → **200**

```json
{
  "deliveries": [
    {
      "id": "7a371955-a8b7-4443-a8ed-624b3ee5e9fd",
      "challenge_id": "b4fb08ce-f309-4fcb-bfc3-7496de455c97",
      "phone": "+380678870000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-89f3deb3-d868-417a-8e5c-40a405805a93",
      "error": null,
      "attempted_at": "2026-10-29T07:57:21.545406Z"
    },
    {
      "id": "e47959c3-2cb6-400c-bb0f-6a3701bdb939",
      "challenge_id": "b4fb08ce-f309-4fcb-bfc3-7496de455c97",
      "phone": "+380678870000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T07:57:21.544218Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380678870000` → **200**

```json
{
  "phone": "+380678870000",
  "audience": "CLIENT",
  "code": "897184",
  "sent_at": "2026-10-29T07:57:21.545134341Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672783547` → **200**

```json
{
  "deliveries": [
    {
      "id": "f35d72ad-3ec0-4a56-9dd8-7b5e64100e91",
      "challenge_id": "b50fcdf9-6b12-4641-989f-07e687c812a2",
      "phone": "+380672783547",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-eebff2b0-535f-4b05-b62c-7afacb1a6400",
      "error": null,
      "attempted_at": "2026-10-29T07:57:21.251424Z"
    }
  ]
}
```

Done: SMS to +380670982650, a call to +380672783547, SMS then a call to +380678870000.

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
  "session_id": "9c910ce4-56a8-41a9-ac68-7cb8f1113dff",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NDMsImlhdCI6MTc5MzI2MDY0MywianRpIjoiODIwNzgyNzctYjIyNi00YzVkLWJjOGYtODBiZDVmZmIyZjRiIiwic2lkIjoiOWM5MTBjZTQtNTZhOC00MWE5LWFjNjgtN2NiOGYxMTEzZGZmIn0.aqJUYuVziTHStQwa87rBkVCgMNLx39AhsOCFg0U2fvE",
  "access_expires_at": "2026-10-29T08:12:23.279360576Z",
  "refresh_token": "57hCdaFqtSNpuseyWRgiM2bI91o62YFxWoY_6xQ8OGs",
  "refresh_expires_at": "2026-10-29T19:57:23.278726558Z",
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
  "session_id": "44a97e87-e78f-4413-99db-a9c21daa6650",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NDMsImlhdCI6MTc5MzI2MDY0MywianRpIjoiMjVmZmI0NzItNDc4ZC00YzU1LTlmZWItNjI3NTEwMzI2NDY1Iiwic2lkIjoiNDRhOTdlODctZTc4Zi00NDEzLTk5ZGItYTljMjFkYWE2NjUwIn0.I-mt8AGeADv_XWof8Xcye9opbqNMiPKeSyDd_VDhdFs",
  "access_expires_at": "2026-10-29T08:12:23.840148432Z",
  "refresh_token": "veghzy7Ms5gXNbLr6SKTxnNfijr9wPwC-LvkVNSfB4E",
  "refresh_expires_at": "2026-10-29T19:57:23.839571801Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "154415a5-2c56-488b-931a-26ab06629f74",
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

`POST /api/admin/v1/staff-extensions/154415a5-2c56-488b-931a-26ab06629f74` → **200**

```json
{
  "command_id": "d7e4e7dc-385c-4fa4-ba81-8fed786e2ce7",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "154415a5-2c56-488b-931a-26ab06629f74",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "05a40400-bbf2-48e2-a0e1-0a21333a3dac",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:57:24.93059Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:57:24.93059Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c509d002-b1b9-4897-add3-0b64607db6e1",
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
  "id": "a0aeb0e4-bc2c-467a-ae96-838589f28b04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:25.466823Z",
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
  "command_id": "92a654e7-9be6-4bb7-8efe-6211db7a730f",
  "quote_id": "a0aeb0e4-bc2c-467a-ae96-838589f28b04",
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
    "phone": "+380675648743"
  }
}
```

```json
{
  "id": "4d981461-1fd1-4c13-a84b-6f081b488cbc",
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
  "created_at": "2026-10-29T07:57:25.753433Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675648743"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/4d981461-1fd1-4c13-a84b-6f081b488cbc/calls` → **201**

```json
{
  "command_id": "dc8bfce6-19a6-425f-b0bc-14b5a7b98c4f",
  "to": "CALLER"
}
```

```json
{
  "id": "69d21cda-dd98-45a9-ab20-e2bc094487eb",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "order_ids": [
    "4d981461-1fd1-4c13-a84b-6f081b488cbc"
  ],
  "started_at": "2026-10-29T07:57:26.058093Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/4d981461-1fd1-4c13-a84b-6f081b488cbc/calls` → **201**

```json
{
  "command_id": "dc8bfce6-19a6-425f-b0bc-14b5a7b98c4f",
  "to": "CALLER"
}
```

```json
{
  "id": "69d21cda-dd98-45a9-ab20-e2bc094487eb",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "order_ids": [
    "4d981461-1fd1-4c13-a84b-6f081b488cbc"
  ],
  "started_at": "2026-10-29T07:57:26.058093Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "69d21cda-dd98-45a9-ab20-e2bc094487eb",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675648743",
    "at": "2026-10-29T07:57:26.06040023Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "69d21cda-dd98-45a9-ab20-e2bc094487eb",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.18535",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "69d21cda-dd98-45a9-ab20-e2bc094487eb"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "69d21cda-dd98-45a9-ab20-e2bc094487eb",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=4d981461-1fd1-4c13-a84b-6f081b488cbc` → **200**

```json
{
  "calls": [
    {
      "id": "69d21cda-dd98-45a9-ab20-e2bc094487eb",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [
        "4d981461-1fd1-4c13-a84b-6f081b488cbc"
      ],
      "started_at": "2026-10-29T07:57:26.058093Z",
      "answered_at": "2026-10-29T07:57:26.696302Z",
      "ended_at": "2026-10-29T07:57:26.717256Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4d981461-1fd1-4c13-a84b-6f081b488cbc` → **200**

```json
{
  "calls": [
    {
      "id": "69d21cda-dd98-45a9-ab20-e2bc094487eb",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "154415a5-2c56-488b-931a-26ab06629f74",
      "order_ids": [
        "4d981461-1fd1-4c13-a84b-6f081b488cbc"
      ],
      "started_at": "2026-10-29T07:57:26.058093Z",
      "answered_at": "2026-10-29T07:57:26.696302Z",
      "ended_at": "2026-10-29T07:57:26.717256Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:57:28.489573Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/4d981461-1fd1-4c13-a84b-6f081b488cbc` → **200**

```json
{
  "id": "4d981461-1fd1-4c13-a84b-6f081b488cbc",
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
  "created_at": "2026-10-29T07:57:25.753433Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675648743"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4d981461-1fd1-4c13-a84b-6f081b488cbc/cancel` → **200**

```json
{
  "command_id": "fe6a6758-fea3-48e3-bc7b-27019fff333c",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4d981461-1fd1-4c13-a84b-6f081b488cbc",
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
  "created_at": "2026-10-29T07:57:25.753433Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675648743"
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
  "command_id": "3ee764fb-e4ee-4445-a739-a2f7ef7f020b",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T07:57:29.921212Z",
  "extension": "101"
}
```

Done: outgoing call 69d21cda-dd98-45a9-ab20-e2bc094487eb from order 4d981461-1fd1-4c13-a84b-6f081b488cbc, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633193076",
  "device_ref": "sandbox-23242"
}
```

```json
{
  "challenge_id": "badda8cc-e2a3-4799-a5b7-ff4d917132a2",
  "expires_at": "2026-10-29T08:02:30.200424702Z",
  "resend_available_at": "2026-10-29T07:57:31.200424702Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633193076` → **200**

```json
{
  "phone": "+380633193076",
  "audience": "CLIENT",
  "code": "503237",
  "sent_at": "2026-10-29T07:57:30.20275615Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "badda8cc-e2a3-4799-a5b7-ff4d917132a2",
  "code": "503237",
  "device_ref": "sandbox-23242"
}
```

```json
{
  "session_id": "9691efd3-7831-4c6f-8da3-c60f41d0ba97",
  "subject": {
    "type": "CLIENT",
    "id": "84dbbc93-f58b-41b6-918c-02e904dc607f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGRiYmM5My1mNThiLTQxYjYtOTE4Yy0wMmU5MDRkYzYwN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTUwLCJpYXQiOjE3OTMyNjA2NTAsImp0aSI6ImFhM2UzOTUyLTg5ZTgtNDFlMi04NjhlLWQ5NjlhZjY3ZWUxMSIsInNpZCI6Ijk2OTFlZmQzLTc4MzEtNGM2Zi04ZGEzLWM2MGY0MWQwYmE5NyJ9.YzxsNUFYN01Dmj9i5KDUwyf3bq9qRza-ZJwJlUdf7UQ",
  "access_expires_at": "2026-10-29T08:12:30.501383503Z",
  "refresh_token": "R01EAZwpHmvbbd1X_9RyjZE4twkbgPyh-ikpeZIJHMY",
  "refresh_expires_at": "2026-11-28T07:57:30.50082719Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "84dbbc93-f58b-41b6-918c-02e904dc607f",
  "session_id": "9691efd3-7831-4c6f-8da3-c60f41d0ba97",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633193076",
  "device_ref": "sandbox-3085"
}
```

```json
{
  "challenge_id": "d645328b-6471-413c-bfce-ebac7446c394",
  "expires_at": "2026-10-29T08:02:33.045375764Z",
  "resend_available_at": "2026-10-29T07:57:34.045375764Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633193076` → **200**

```json
{
  "phone": "+380633193076",
  "audience": "CLIENT",
  "code": "792031",
  "sent_at": "2026-10-29T07:57:33.047332182Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d645328b-6471-413c-bfce-ebac7446c394",
  "code": "792031",
  "device_ref": "sandbox-3085"
}
```

```json
{
  "session_id": "3048673e-da00-411c-bac7-bc5d22895601",
  "subject": {
    "type": "CLIENT",
    "id": "84dbbc93-f58b-41b6-918c-02e904dc607f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGRiYmM5My1mNThiLTQxYjYtOTE4Yy0wMmU5MDRkYzYwN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTUzLCJpYXQiOjE3OTMyNjA2NTMsImp0aSI6Ijg3ZGFmMzY0LWFjODMtNDg5YS04ODg5LTMyMTVmNWRmMzgwMyIsInNpZCI6IjMwNDg2NzNlLWRhMDAtNDExYy1iYWM3LWJjNWQyMjg5NTYwMSJ9.P68ZGIQWYoJUootn-Aj0BA4lNUs-dMCoiruCAP7EozQ",
  "access_expires_at": "2026-10-29T08:12:33.334621861Z",
  "refresh_token": "rfZkvS4OUzqClzO5AbRN5Vdgf-8OXKrLR2XxF028hho",
  "refresh_expires_at": "2026-11-28T07:57:33.333793607Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "7c0238a0-0058-43aa-b083-58975fd1ae50",
  "expires_at": "2026-10-29T08:02:35.610371046Z",
  "resend_available_at": "2026-10-29T07:57:36.610371046Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633193076` → **200**

```json
{
  "phone": "+380633193076",
  "audience": "CLIENT",
  "code": "539195",
  "sent_at": "2026-10-29T07:57:35.612561277Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380634066826"
}
```

```json
{
  "challenge_id": "a9e9f7d8-d3e3-47c5-bc77-ff4ec0f9389e",
  "expires_at": "2026-10-29T08:02:35.89977889Z",
  "resend_available_at": "2026-10-29T07:57:36.89977889Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634066826` → **200**

```json
{
  "phone": "+380634066826",
  "audience": "CLIENT",
  "code": "444488",
  "sent_at": "2026-10-29T07:57:35.901708042Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "1a3b55ca-3f50-4612-b0b0-a370d28fd5c9",
  "current_challenge_id": "7c0238a0-0058-43aa-b083-58975fd1ae50",
  "current_code": "000000",
  "new_challenge_id": "a9e9f7d8-d3e3-47c5-bc77-ff4ec0f9389e",
  "new_code": "444488"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "a8b5aeec-b99c-4ae6-a0a2-b3ef805c5d18"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "c7c42baf-1caa-4bd6-ac70-dcc4430b3a9d",
  "current_challenge_id": "7c0238a0-0058-43aa-b083-58975fd1ae50",
  "current_code": "539195",
  "new_challenge_id": "a9e9f7d8-d3e3-47c5-bc77-ff4ec0f9389e",
  "new_code": "444488"
}
```

```json
{
  "subject_id": "84dbbc93-f58b-41b6-918c-02e904dc607f",
  "phone": "+380634066826",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "84dbbc93-f58b-41b6-918c-02e904dc607f",
  "session_id": "9691efd3-7831-4c6f-8da3-c60f41d0ba97",
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
  "correlation_id": "743e7a45-22b8-46ee-9451-1842f5ed8caa"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634066826",
  "device_ref": "sandbox-9881"
}
```

```json
{
  "challenge_id": "de92bf9e-a8c9-45ad-a7bb-3b9c0027d3ab",
  "expires_at": "2026-10-29T08:02:39.28004701Z",
  "resend_available_at": "2026-10-29T07:57:40.28004701Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634066826` → **200**

```json
{
  "phone": "+380634066826",
  "audience": "CLIENT",
  "code": "087126",
  "sent_at": "2026-10-29T07:57:39.282298759Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de92bf9e-a8c9-45ad-a7bb-3b9c0027d3ab",
  "code": "087126",
  "device_ref": "sandbox-9881"
}
```

```json
{
  "session_id": "bca6d080-8fdd-4109-af0e-df6d68c01358",
  "subject": {
    "type": "CLIENT",
    "id": "84dbbc93-f58b-41b6-918c-02e904dc607f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGRiYmM5My1mNThiLTQxYjYtOTE4Yy0wMmU5MDRkYzYwN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTU5LCJpYXQiOjE3OTMyNjA2NTksImp0aSI6IjBiODRkYWZlLTE5YWQtNDZhMC05YjA0LTc2NGY5MGQ5M2JkOSIsInNpZCI6ImJjYTZkMDgwLThmZGQtNDEwOS1hZjBlLWRmNmQ2OGMwMTM1OCJ9.M3lp2H2xd635K2-Pmp3tIF5vVeCgbMS1AD2DsUfG3ek",
  "access_expires_at": "2026-10-29T08:12:39.576936401Z",
  "refresh_token": "lsGN6EBlx3WesFOZNiiJ5456T_yMBuLj6X78djGM8Uo",
  "refresh_expires_at": "2026-11-28T07:57:39.576322789Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "84dbbc93-f58b-41b6-918c-02e904dc607f",
  "session_id": "bca6d080-8fdd-4109-af0e-df6d68c01358",
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
  "session_id": "8e6eef6d-e9e6-4954-aca3-9373f5f0910d",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NjAsImlhdCI6MTc5MzI2MDY2MCwianRpIjoiMTE3MmMxOGItNjUzYy00NDM0LTllOTctYjYwOWM2NDQxZjU1Iiwic2lkIjoiOGU2ZWVmNmQtZTllNi00OTU0LWFjYTMtOTM3M2Y1ZjA5MTBkIn0.HwL1ivVKKCzuu1vXWekasvo_uHdV-WT7yScAUE3qCdE",
  "access_expires_at": "2026-10-29T08:12:40.399044464Z",
  "refresh_token": "iGuDmkLJ4pEMx_gYPkfoStojQNDrv_W9fuQrQMyaD74",
  "refresh_expires_at": "2026-10-29T19:57:40.398506536Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/84dbbc93-f58b-41b6-918c-02e904dc607f` → **200**

```json
{
  "client": {
    "id": "84dbbc93-f58b-41b6-918c-02e904dc607f",
    "phone": "+380634066826",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:57:30.499282Z",
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

`POST /api/admin/v1/clients/84dbbc93-f58b-41b6-918c-02e904dc607f/phone/new-code` → **201**

```json
{
  "phone": "+380635072054"
}
```

```json
{
  "challenge_id": "7193e57e-5787-496f-b3b0-df9150e16ca4",
  "expires_at": "2026-10-29T08:02:40.986431039Z",
  "resend_available_at": "2026-10-29T07:57:41.986431039Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635072054` → **200**

```json
{
  "phone": "+380635072054",
  "audience": "CLIENT",
  "code": "187112",
  "sent_at": "2026-10-29T07:57:40.988337842Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/84dbbc93-f58b-41b6-918c-02e904dc607f/phone` → **422**

```json
{
  "command_id": "2e979ead-5cc5-4ddc-8c7f-153f50df59fa",
  "expected_version": 3,
  "new_challenge_id": "7193e57e-5787-496f-b3b0-df9150e16ca4",
  "new_code": "187113",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/84dbbc93-f58b-41b6-918c-02e904dc607f/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "989f45af-8da4-40c9-9fe2-37b2e5a061cd"
}
```

`POST /api/admin/v1/clients/84dbbc93-f58b-41b6-918c-02e904dc607f/phone` → **400**

```json
{
  "command_id": "0183e79f-78a4-43cf-b425-b1c7cb5aac1b",
  "expected_version": 3,
  "new_challenge_id": "7193e57e-5787-496f-b3b0-df9150e16ca4",
  "new_code": "187112",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/84dbbc93-f58b-41b6-918c-02e904dc607f/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f8452096-ad4d-4de6-947e-bbf3dc3a611c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/84dbbc93-f58b-41b6-918c-02e904dc607f/phone` → **200**

```json
{
  "command_id": "33338001-7de6-4078-8843-fdc1ce27c14c",
  "expected_version": 3,
  "new_challenge_id": "7193e57e-5787-496f-b3b0-df9150e16ca4",
  "new_code": "187112",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "84dbbc93-f58b-41b6-918c-02e904dc607f",
  "phone": "+380635072054",
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
  "correlation_id": "03a53990-43fc-402c-afc1-9b1b50fb5298"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635072054",
  "device_ref": "sandbox-3992"
}
```

```json
{
  "challenge_id": "d539abca-30dd-442f-b4a3-b9ff87d024b7",
  "expires_at": "2026-10-29T08:02:42.383844015Z",
  "resend_available_at": "2026-10-29T07:57:43.383844015Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635072054` → **200**

```json
{
  "phone": "+380635072054",
  "audience": "CLIENT",
  "code": "240202",
  "sent_at": "2026-10-29T07:57:42.385962274Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d539abca-30dd-442f-b4a3-b9ff87d024b7",
  "code": "240202",
  "device_ref": "sandbox-3992"
}
```

```json
{
  "session_id": "c86b7178-3735-4ec1-b664-889a87f8d64d",
  "subject": {
    "type": "CLIENT",
    "id": "84dbbc93-f58b-41b6-918c-02e904dc607f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGRiYmM5My1mNThiLTQxYjYtOTE4Yy0wMmU5MDRkYzYwN2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTYyLCJpYXQiOjE3OTMyNjA2NjIsImp0aSI6ImM4MjM0MzY3LTJlZTUtNDMxMy1iNzkyLTFlM2JlNThmMGExMCIsInNpZCI6ImM4NmI3MTc4LTM3MzUtNGVjMS1iNjY0LTg4OWE4N2Y4ZDY0ZCJ9.JQ_gvJ4gTJQlRSFMpLqdoOxNOHNNyRVkCJd-BU-LgIo",
  "access_expires_at": "2026-10-29T08:12:42.671500069Z",
  "refresh_token": "wLImbXuqM1rdqmo82jcRoolAJ0-qk55SDs4IuAFSiMw",
  "refresh_expires_at": "2026-11-28T07:57:42.670964918Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "84dbbc93-f58b-41b6-918c-02e904dc607f",
  "session_id": "c86b7178-3735-4ec1-b664-889a87f8d64d",
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
  "phone": "+380631478131",
  "device_ref": "sandbox-18578"
}
```

```json
{
  "challenge_id": "3139f025-781f-4ce4-8015-0ae430e8ae9f",
  "expires_at": "2026-10-29T08:02:43.230250993Z",
  "resend_available_at": "2026-10-29T07:57:44.230250993Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631478131` → **200**

```json
{
  "phone": "+380631478131",
  "audience": "CLIENT",
  "code": "425095",
  "sent_at": "2026-10-29T07:57:43.232489245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3139f025-781f-4ce4-8015-0ae430e8ae9f",
  "code": "425095",
  "device_ref": "sandbox-18578"
}
```

```json
{
  "session_id": "3979c9c4-a1b5-4957-b60c-ae74c7d9fd5f",
  "subject": {
    "type": "CLIENT",
    "id": "735ac6d6-816a-4cb0-a491-34f4098bce32"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzVhYzZkNi04MTZhLTRjYjAtYTQ5MS0zNGY0MDk4YmNlMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTYzLCJpYXQiOjE3OTMyNjA2NjMsImp0aSI6IjdjMmIxYjM1LTIzYWEtNDlmYS1iMzMxLTVmMmFmZjJiZTU5MiIsInNpZCI6IjM5NzljOWM0LWExYjUtNDk1Ny1iNjBjLWFlNzRjN2Q5ZmQ1ZiJ9.KtOXU1XhUwmc6wwaIz9sd1GmSqUgHt8V5_upsdeqbjI",
  "access_expires_at": "2026-10-29T08:12:43.560911534Z",
  "refresh_token": "Z3dnlAaFM9Q61-iMdQhBecwIRIine2vMkW3MoCRdddI",
  "refresh_expires_at": "2026-11-28T07:57:43.560306851Z",
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
  "session_id": "e441f6ca-5d1a-44aa-ad18-d39d7fb3e5d3",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NjQsImlhdCI6MTc5MzI2MDY2NCwianRpIjoiZjk5Y2E1OGYtNDUyZi00Nzk1LWIzOTEtZjhlYTdlYWNkOTQyIiwic2lkIjoiZTQ0MWY2Y2EtNWQxYS00NGFhLWFkMTgtZDM5ZDdmYjNlNWQzIn0.vDiE_UwaDNEUNcipQqvf8UjgJ3WxGoWNILC_k9idjoY",
  "access_expires_at": "2026-10-29T08:12:44.744262199Z",
  "refresh_token": "G8lQnHq3ESSMTxL-RYFjis6pklg4gXzb6MTPuZ6tEJE",
  "refresh_expires_at": "2026-10-29T19:57:44.743688478Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631478131` → **200**

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
  "correlation_id": "1c4d5638-f536-49b2-9b77-50142e51f874"
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
  "session_id": "8b87b752-a8d3-4d2b-b1f0-a1482809e72c",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NjUsImlhdCI6MTc5MzI2MDY2NSwianRpIjoiZmY1ZmQ2MWQtYjIwYS00YWMyLTkxZWQtYjI1MTY4MmQ4NjljIiwic2lkIjoiOGI4N2I3NTItYThkMy00ZDJiLWIxZjAtYTE0ODI4MDllNzJjIn0.dTj0g-bWdcdVQGZ5JiQdGMzGULC05btctJj99XEd-sM",
  "access_expires_at": "2026-10-29T08:12:45.856362673Z",
  "refresh_token": "TKoaw5I_0mOf1chG_6WYjfLzlEvouHBApkOMRppZ8hU",
  "refresh_expires_at": "2026-10-29T19:57:45.855862707Z",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:54:26.257541Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6c754af5-1277-46a4-b764-f255a4d69a4b",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T07:57:46.407496707Z"
}
```

## The rider books the airport for 2026-10-29T10:57:45Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600530052",
  "device_ref": "sandbox-26564"
}
```

```json
{
  "challenge_id": "cd7c3ce0-cc86-42b8-ba05-91f3071f07d4",
  "expires_at": "2026-10-29T08:02:46.688493803Z",
  "resend_available_at": "2026-10-29T07:57:47.688493803Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600530052` → **200**

```json
{
  "phone": "+48600530052",
  "audience": "CLIENT",
  "code": "404592",
  "sent_at": "2026-10-29T07:57:46.690949379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd7c3ce0-cc86-42b8-ba05-91f3071f07d4",
  "code": "404592",
  "device_ref": "sandbox-26564"
}
```

```json
{
  "session_id": "e5b28eab-482e-4a70-9ef9-922cc3f6cafb",
  "subject": {
    "type": "CLIENT",
    "id": "05f6fb5d-5088-411c-acdb-6d1afc8c5269"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNWY2ZmI1ZC01MDg4LTQxMWMtYWNkYi02ZDFhZmM4YzUyNjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTY2LCJpYXQiOjE3OTMyNjA2NjYsImp0aSI6IjFmMWE1N2ZjLWQ3YWItNGZjOS1iOTk1LTAxMGI2NjhmNTQyYiIsInNpZCI6ImU1YjI4ZWFiLTQ4MmUtNGE3MC05ZWY5LTkyMmNjM2Y2Y2FmYiJ9.gfOPN5s5aebDqqUX9iROwgFcsCfDyYm-AelKBIEO864",
  "access_expires_at": "2026-10-29T08:12:46.983490882Z",
  "refresh_token": "IcpeEegYXKgDGKogFrcTpqbfsnjkBDeUtZU5sUnWicc",
  "refresh_expires_at": "2026-11-28T07:57:46.982975056Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e573e282-b753-4b02-89ed-317e199e5f3d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T10:57:45Z"
}
```

```json
{
  "id": "2bfda6e6-b0c0-4e81-943f-2423062c1f2b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:47.262697Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:57:45Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "aeda1865-b5a9-409b-a8eb-74f3bbea6888",
  "quote_id": "2bfda6e6-b0c0-4e81-943f-2423062c1f2b",
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
  "pickup_at": "2026-10-29T10:57:45Z"
}
```

```json
{
  "id": "9c92d15b-c73e-41fa-bc80-06bcf1ab7f63",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "05f6fb5d-5088-411c-acdb-6d1afc8c5269",
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
  "created_at": "2026-10-29T07:57:47.543718Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:57:45Z",
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
  "device_ref": "sandbox-17386"
}
```

```json
{
  "challenge_id": "6f122d75-243e-4e18-a30f-95750aff8443",
  "expires_at": "2026-10-29T08:02:47.833735775Z",
  "resend_available_at": "2026-10-29T07:57:48.833735775Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "981676",
  "sent_at": "2026-10-29T07:57:47.835882717Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f122d75-243e-4e18-a30f-95750aff8443",
  "code": "981676",
  "device_ref": "sandbox-17386"
}
```

```json
{
  "session_id": "c1da939b-e5c0-41b4-bfbe-b8d867b8ad0a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTU2OCwiaWF0IjoxNzkzMjYwNjY4LCJqdGkiOiJmNTg4YjIwMy01NmU5LTRkMGYtYjI2Ny0yOGZiZTFkMjAyNTUiLCJzaWQiOiJjMWRhOTM5Yi1lNWMwLTQxYjQtYmZiZS1iOGQ4NjdiOGFkMGEifQ.8f_CeJXWna8Lh5fiRdVN-NRWNZfpfAZssIKQvw81iOc",
  "access_expires_at": "2026-10-29T08:12:48.137004787Z",
  "refresh_token": "1mgs9eUMT2qp4uxTY04ewBd1n-nyiFfl8RNCVAkTQZc",
  "refresh_expires_at": "2026-11-28T07:57:48.136480805Z",
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
  "command_id": "defad07e-1cc0-4c0a-8545-40dde4309331",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:57:48Z",
    "sequence": 1793260668690
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "01de09eb-25fa-4141-9676-3103a66e03dc",
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
  "last_heartbeat_at": "2026-10-29T07:57:48.708344Z",
  "last_location_at": "2026-10-29T07:57:48.708344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9c92d15b-c73e-41fa-bc80-06bcf1ab7f63",
      "short_number": 23,
      "pickup_at": "2026-10-29T10:57:45Z",
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

`POST /api/driver/v1/preorders/9c92d15b-c73e-41fa-bc80-06bcf1ab7f63/reserve` → **200**

```json
{
  "command_id": "78756a8f-a7db-4e3f-9226-9bfcc8231849"
}
```

```json
{
  "id": "76fd14e2-efd6-474c-bc78-b0c7a448fce8",
  "state": "RESERVED",
  "order": {
    "order_id": "9c92d15b-c73e-41fa-bc80-06bcf1ab7f63",
    "short_number": 23,
    "pickup_at": "2026-10-29T10:57:45Z",
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
  "reserved_at": "2026-10-29T07:57:49.27411Z",
  "confirm_from": "2026-10-29T10:27:45Z",
  "confirm_until": "2026-10-29T10:37:45Z",
  "drop_until": "2026-10-29T09:57:45Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "76fd14e2-efd6-474c-bc78-b0c7a448fce8",
      "state": "RESERVED",
      "order": {
        "order_id": "9c92d15b-c73e-41fa-bc80-06bcf1ab7f63",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:57:45Z",
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
      "reserved_at": "2026-10-29T07:57:49.27411Z",
      "confirm_from": "2026-10-29T10:27:45Z",
      "confirm_until": "2026-10-29T10:37:45Z",
      "drop_until": "2026-10-29T09:57:45Z"
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
      "id": "76fd14e2-efd6-474c-bc78-b0c7a448fce8",
      "state": "RESERVED",
      "order": {
        "order_id": "9c92d15b-c73e-41fa-bc80-06bcf1ab7f63",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:57:45Z",
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
      "reserved_at": "2026-10-29T07:57:49.27411Z",
      "confirm_from": "2026-10-29T10:27:45Z",
      "confirm_until": "2026-10-29T10:37:45Z",
      "drop_until": "2026-10-29T09:57:45Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/76fd14e2-efd6-474c-bc78-b0c7a448fce8/confirm` → **409**

```json
{
  "command_id": "242df4ff-dbf6-41d4-8f79-a5162d8493f4"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/76fd14e2-efd6-474c-bc78-b0c7a448fce8/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "915eb6bf-0640-44d4-8b77-5933ea434847"
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
  "session_id": "a7c76a04-2dcf-42dd-bfe6-2e04b619e04b",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NzAsImlhdCI6MTc5MzI2MDY3MCwianRpIjoiNzg1MGVkMDUtN2VhOC00NDliLTljNWYtZDhhOTI1OGYzZWJiIiwic2lkIjoiYTdjNzZhMDQtMmRjZi00MmRkLWJmZTYtMmUwNGI2MTllMDRiIn0.ggtQgfVPgD8wbRNEB4-VvTxL6WbTfMYkSDl2k34nazQ",
  "access_expires_at": "2026-10-29T08:12:50.663240262Z",
  "refresh_token": "jNI-L2RU8gu9oD4IEhWXlLaCjtAcf9dcZsSshsfuiHo",
  "refresh_expires_at": "2026-10-29T19:57:50.662727571Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9c92d15b-c73e-41fa-bc80-06bcf1ab7f63` → **200**

```json
{
  "id": "9c92d15b-c73e-41fa-bc80-06bcf1ab7f63",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "05f6fb5d-5088-411c-acdb-6d1afc8c5269",
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
  "created_at": "2026-10-29T07:57:47.543718Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T10:57:45Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "76fd14e2-efd6-474c-bc78-b0c7a448fce8",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T07:57:49.27411Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9c92d15b-c73e-41fa-bc80-06bcf1ab7f63/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T07:57:47.544995Z",
      "actor": {
        "type": "CLIENT",
        "id": "05f6fb5d-5088-411c-acdb-6d1afc8c5269",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9c92d15b-c73e-41fa-bc80-06bcf1ab7f63",
        "preorder": true,
        "quote_id": "2bfda6e6-b0c0-4e81-943f-2423062c1f2b",
        "pickup_at": "2026-10-29T10:57:45Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "3596fb7b-8ab1-4605-ad32-83d4486cd3fa"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T07:57:49.275254Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9c92d15b-c73e-41fa-bc80-06bcf1ab7f63",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "76fd14e2-efd6-474c-bc78-b0c7a448fce8"
      },
      "correlation_id": "c601f9ef-5613-461e-8a06-26316484be92"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9c92d15b-c73e-41fa-bc80-06bcf1ab7f63, reservation 76fd14e2-efd6-474c-bc78-b0c7a448fce8.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17967"
}
```

```json
{
  "challenge_id": "66c980e7-d815-4955-8583-e07d417d375d",
  "expires_at": "2026-10-29T08:02:51.521559751Z",
  "resend_available_at": "2026-10-29T07:57:52.521559751Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "660691",
  "sent_at": "2026-10-29T07:57:51.523580517Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66c980e7-d815-4955-8583-e07d417d375d",
  "code": "660691",
  "device_ref": "sandbox-17967"
}
```

```json
{
  "session_id": "016dca3f-8631-4d95-bd59-dd8dd91a6e49",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTU3MSwiaWF0IjoxNzkzMjYwNjcxLCJqdGkiOiIyMDdkODc4MC02Y2RhLTQ4ZjItODcxYS1kN2Q2NGVhYjAxNzYiLCJzaWQiOiIwMTZkY2EzZi04NjMxLTRkOTUtYmQ1OS1kZDhkZDkxYTZlNDkifQ.dHbkHmdr1yamvP8kbKEidxZg2uV6SiEuHqkY1BXZBiw",
  "access_expires_at": "2026-10-29T08:12:51.826953235Z",
  "refresh_token": "E29uPl4Eq0De7gqtoJKy-Vqvk_TAD_EjmxfcCZTKuNE",
  "refresh_expires_at": "2026-11-28T07:57:51.826361095Z",
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
  "command_id": "8802c72e-0230-4972-96cb-543118638a7c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:57:52Z",
    "sequence": 1793260672360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c3d763c8-af4b-43cb-9f28-2a6b866a0163",
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
  "last_heartbeat_at": "2026-10-29T07:57:52.379101Z",
  "last_location_at": "2026-10-29T07:57:52.379101Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670405880",
  "device_ref": "sandbox-30208"
}
```

```json
{
  "challenge_id": "da2a1bea-fe5f-4ab6-8bdb-722443d19910",
  "expires_at": "2026-10-29T08:02:52.66060851Z",
  "resend_available_at": "2026-10-29T07:57:53.66060851Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670405880` → **200**

```json
{
  "phone": "+380670405880",
  "audience": "CLIENT",
  "code": "060872",
  "sent_at": "2026-10-29T07:57:52.663458244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da2a1bea-fe5f-4ab6-8bdb-722443d19910",
  "code": "060872",
  "device_ref": "sandbox-30208"
}
```

```json
{
  "session_id": "5e0133a7-5205-4c75-84dd-c9a3afd5b873",
  "subject": {
    "type": "CLIENT",
    "id": "2047700d-a859-48fa-831d-9e2ddc57f0c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDQ3NzAwZC1hODU5LTQ4ZmEtODMxZC05ZTJkZGM1N2YwYzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNTcyLCJpYXQiOjE3OTMyNjA2NzIsImp0aSI6IjJlYjNmM2NmLTgxNTUtNDFlYy05ZDdmLTIyOGNkODg0MWIyMSIsInNpZCI6IjVlMDEzM2E3LTUyMDUtNGM3NS04NGRkLWM5YTNhZmQ1Yjg3MyJ9.twId-TGjlpYFNTU8CwiPNJXlMINqXad5lPuN0TEl5c8",
  "access_expires_at": "2026-10-29T08:12:52.958740889Z",
  "refresh_token": "G4GV5tVr565fdKEVyRNkByi7xJZiZGjeF_bT3knJ3IE",
  "refresh_expires_at": "2026-11-28T07:57:52.958233639Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6b0ecb3f-5494-4f5c-ae8b-3d2342f8f027",
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
  "id": "54e76c6a-583b-4ed4-b7ca-4756c40c3873",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:02:53.233682Z",
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
  "command_id": "2ed650d3-b1a2-490b-8a45-5db8cf1a41a2",
  "quote_id": "54e76c6a-583b-4ed4-b7ca-4756c40c3873",
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
  "id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2047700d-a859-48fa-831d-9e2ddc57f0c7",
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
  "created_at": "2026-10-29T07:57:53.510775Z",
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
    "id": "16bd1929-bf26-41ff-915a-fe49986704f8",
    "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
    "expires_at": "2026-10-29T07:58:08.513821Z",
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

`POST /api/driver/v1/offers/16bd1929-bf26-41ff-915a-fe49986704f8/accept` → **200**

```json
{
  "command_id": "720656a6-3818-4eb2-a8bc-41f77c11ff3b"
}
```

```json
{
  "id": "c02bd7ec-d1b9-4502-a64d-e8e6aa6fca34",
  "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93465e06-cf32-4e59-be29-118b9576ad95",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93465e06-cf32-4e59-be29-118b9576ad95",
  "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "assignment_id": "c02bd7ec-d1b9-4502-a64d-e8e6aa6fca34",
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

`POST /api/driver/v1/work-sessions/c3d763c8-af4b-43cb-9f28-2a6b866a0163/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:57:54Z",
    "sequence": 1793260674619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c3d763c8-af4b-43cb-9f28-2a6b866a0163",
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
  "last_heartbeat_at": "2026-10-29T07:57:54.636769Z",
  "last_location_at": "2026-10-29T07:57:54.636769Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93465e06-cf32-4e59-be29-118b9576ad95",
  "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "assignment_id": "c02bd7ec-d1b9-4502-a64d-e8e6aa6fca34",
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

`POST /api/driver/v1/trips/93465e06-cf32-4e59-be29-118b9576ad95/arrive` → **200**

```json
{
  "command_id": "8fd43905-1dae-4205-92bd-87b5139c74ad",
  "expected_version": 0
}
```

```json
{
  "id": "93465e06-cf32-4e59-be29-118b9576ad95",
  "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "assignment_id": "c02bd7ec-d1b9-4502-a64d-e8e6aa6fca34",
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
  "arrived_at": "2026-10-29T07:57:55.169487Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/93465e06-cf32-4e59-be29-118b9576ad95/start` → **200**

```json
{
  "command_id": "8e0787a0-5a7d-427a-9b18-adbf7ae22c75",
  "expected_version": 1
}
```

```json
{
  "id": "93465e06-cf32-4e59-be29-118b9576ad95",
  "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "assignment_id": "c02bd7ec-d1b9-4502-a64d-e8e6aa6fca34",
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
  "arrived_at": "2026-10-29T07:57:55.169487Z",
  "started_at": "2026-10-29T07:57:55.458016Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c3d763c8-af4b-43cb-9f28-2a6b866a0163/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:57:55Z",
    "sequence": 1793260675725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c3d763c8-af4b-43cb-9f28-2a6b866a0163",
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
  "last_heartbeat_at": "2026-10-29T07:57:55.742716Z",
  "last_location_at": "2026-10-29T07:57:55.742716Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/93465e06-cf32-4e59-be29-118b9576ad95/complete` → **200**

```json
{
  "command_id": "032ebf78-2d56-4333-ba72-2286fc61c4c7",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:57:56Z",
  "cash_received": true
}
```

```json
{
  "id": "93465e06-cf32-4e59-be29-118b9576ad95",
  "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "assignment_id": "c02bd7ec-d1b9-4502-a64d-e8e6aa6fca34",
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
  "arrived_at": "2026-10-29T07:57:55.169487Z",
  "started_at": "2026-10-29T07:57:55.458016Z",
  "completed_at": "2026-10-29T07:57:56.031239Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/eaf45bb9-7134-4344-8c71-9aebcee55f69/rating` → **200**

```json
{
  "command_id": "b4fe1b79-44c5-4d1e-a931-e1fc4f7ee122",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "score": 5,
  "created_at": "2026-10-29T07:57:56.325911342Z"
}
```

`POST /api/driver/v1/orders/eaf45bb9-7134-4344-8c71-9aebcee55f69/rating` → **200**

```json
{
  "command_id": "c9b9f880-01a8-4ee8-b727-eda052d01466",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
  "score": 4,
  "created_at": "2026-10-29T07:57:56.607462Z"
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
  "session_id": "6f263d93-33f3-49c1-9ba3-adb49e10cb87",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NzcsImlhdCI6MTc5MzI2MDY3NywianRpIjoiMDUxYTg5YWItZWY0NS00NDliLTg1ZjktMGVhNTg0MWFjMDRjIiwic2lkIjoiNmYyNjNkOTMtMzNmMy00OWMxLTliYTMtYWRiNDllMTBjYjg3In0.83pga0ikiB03DCvREH1Z1mv3VidD6-Am_34amG69k3g",
  "access_expires_at": "2026-10-29T08:12:57.457659869Z",
  "refresh_token": "N5e3w4mi4YVGCObDXg91SeUDu5KNiTwwZvjoWlS9D9o",
  "refresh_expires_at": "2026-10-29T19:57:57.457126319Z",
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
  "session_id": "9edebfab-95bc-44c6-820e-f238c2d34001",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NzgsImlhdCI6MTc5MzI2MDY3OCwianRpIjoiYjQ2YTRhNDctNDdjZi00NGUzLWI1NDMtNDA3MWQ4ZjI5NTc5Iiwic2lkIjoiOWVkZWJmYWItOTViYy00NGM2LTgyMGUtZjIzOGMyZDM0MDAxIn0.IxHzOQRiQ-NnerIk3Ucs2-GKkkCEYFGAY-KoGObSl-Y",
  "access_expires_at": "2026-10-29T08:12:58.015451611Z",
  "refresh_token": "oyUKAMRAJiGEZdx0PR8jXUdsq7No4zjbM9Q3mG4w3sY",
  "refresh_expires_at": "2026-10-29T19:57:58.014924393Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eaf45bb9-7134-4344-8c71-9aebcee55f69/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
      "author_type": "RIDER",
      "author_id": "2047700d-a859-48fa-831d-9e2ddc57f0c7",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T07:57:56.325911Z"
    },
    {
      "order_id": "eaf45bb9-7134-4344-8c71-9aebcee55f69",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "2047700d-a859-48fa-831d-9e2ddc57f0c7",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T07:57:56.607462Z"
    }
  ]
}
```

Done: ratings for order eaf45bb9-7134-4344-8c71-9aebcee55f69.

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
  "session_id": "3be4b21c-7b59-4335-908f-5cf32ba00670",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1NzgsImlhdCI6MTc5MzI2MDY3OCwianRpIjoiOWZlYWM4Y2QtNjk2Yi00M2I3LWIyZGItNmVkZjc1OGI0ZTlkIiwic2lkIjoiM2JlNGIyMWMtN2I1OS00MzM1LTkwOGYtNWNmMzJiYTAwNjcwIn0.FyMe_W54Isk8bV0ptBWpC07sC0vfWaXL8Ag-vdW-Kgw",
  "access_expires_at": "2026-10-29T08:12:58.865105164Z",
  "refresh_token": "F66OIRiOirZLugS5Zm2ExF3X_oWTvZN3kLriA7u9Z2w",
  "refresh_expires_at": "2026-10-29T19:57:58.864283392Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b9f5ca38-b54c-45fc-a5b7-816a2f16f2ec",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "7f177d55-5b55-4b09-b7f7-dd16de881f8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:57:59.14379Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7f177d55-5b55-4b09-b7f7-dd16de881f8d` → **200**

```json
{
  "id": "7f177d55-5b55-4b09-b7f7-dd16de881f8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:57:59.14379Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7f177d55-5b55-4b09-b7f7-dd16de881f8d` → **200**

```json
{
  "id": "7f177d55-5b55-4b09-b7f7-dd16de881f8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:57:59.14379Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7f177d55-5b55-4b09-b7f7-dd16de881f8d` → **200**

```json
{
  "id": "7f177d55-5b55-4b09-b7f7-dd16de881f8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:57:59.14379Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7f177d55-5b55-4b09-b7f7-dd16de881f8d` → **200**

```json
{
  "id": "7f177d55-5b55-4b09-b7f7-dd16de881f8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:57:59.14379Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7f177d55-5b55-4b09-b7f7-dd16de881f8d` → **200**

```json
{
  "id": "7f177d55-5b55-4b09-b7f7-dd16de881f8d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:57:59.14379Z",
  "ready_at": "2026-10-29T07:58:03.520269Z",
  "expires_at": "2026-10-30T07:58:03.520269Z"
}
```

`GET /api/admin/v1/reports/exports/7f177d55-5b55-4b09-b7f7-dd16de881f8d/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6eee650a-378a-4067-b3d7-f26f38ca6604",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "8c7f9807-2ffa-4338-881c-df7dc2cda6ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:58:04.827338Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8c7f9807-2ffa-4338-881c-df7dc2cda6ae` → **200**

```json
{
  "id": "8c7f9807-2ffa-4338-881c-df7dc2cda6ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:58:04.827338Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8c7f9807-2ffa-4338-881c-df7dc2cda6ae` → **200**

```json
{
  "id": "8c7f9807-2ffa-4338-881c-df7dc2cda6ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:58:04.827338Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8c7f9807-2ffa-4338-881c-df7dc2cda6ae` → **200**

```json
{
  "id": "8c7f9807-2ffa-4338-881c-df7dc2cda6ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:58:04.827338Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8c7f9807-2ffa-4338-881c-df7dc2cda6ae` → **200**

```json
{
  "id": "8c7f9807-2ffa-4338-881c-df7dc2cda6ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:58:04.827338Z",
  "ready_at": "2026-10-29T07:58:08.527688Z",
  "expires_at": "2026-10-30T07:58:08.527688Z"
}
```

`GET /api/admin/v1/reports/exports/8c7f9807-2ffa-4338-881c-df7dc2cda6ae/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/05795d30-11cf-41f9-8963-1bb0c0401bf5` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/05795d30-11cf-41f9-8963-1bb0c0401bf5",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c7e7489d-153d-4dc3-9436-b050c85f4bc3"
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
  "device_ref": "sandbox-14372"
}
```

```json
{
  "challenge_id": "d2e4a80f-be18-4620-8695-7e4e7345f915",
  "expires_at": "2026-10-29T08:03:09.499046315Z",
  "resend_available_at": "2026-10-29T07:58:10.499046315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "334526",
  "sent_at": "2026-10-29T07:58:09.501330846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2e4a80f-be18-4620-8695-7e4e7345f915",
  "code": "334526",
  "device_ref": "sandbox-14372"
}
```

```json
{
  "session_id": "2433995b-9d15-4804-bb5a-4adba8413155",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTU4OSwiaWF0IjoxNzkzMjYwNjg5LCJqdGkiOiI2MWUwZjViNC03NjdhLTQxMjMtYTdhYS1iNDgwZmNhMzQ2ZWYiLCJzaWQiOiIyNDMzOTk1Yi05ZDE1LTQ4MDQtYmI1YS00YWRiYTg0MTMxNTUifQ.9EnCyBAnmFQPfssupRNy2BiCwQ56diJRDZK97PhmF8k",
  "access_expires_at": "2026-10-29T08:13:09.807179236Z",
  "refresh_token": "K9OGDAj0knt9gBEj5VN_yc7hpPjeNUrFEYsshmwTRJA",
  "refresh_expires_at": "2026-11-28T07:58:09.806552847Z",
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
  "command_id": "1836fee0-f55c-4983-8be1-f0143ffb2eb5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:58:10Z",
    "sequence": 1793260690639
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6226f85e-33f0-4e37-8dbc-82d505db5714",
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
  "last_heartbeat_at": "2026-10-29T07:58:10.658161Z",
  "last_location_at": "2026-10-29T07:58:10.658161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "c1637620-649f-4282-9c36-5d222f449446",
  "points": [
    {
      "sequence": 1793260692935,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:57:12Z"
    },
    {
      "sequence": 1793260692943,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:58:12Z"
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
  "session_id": "b4b34d79-acff-4701-a058-581751f3626d",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1OTMsImlhdCI6MTc5MzI2MDY5MywianRpIjoiZTM4NDk2YmYtZmE1MC00ZmJiLWFhZGMtNjllY2EzYjI3YzBhIiwic2lkIjoiYjRiMzRkNzktYWNmZi00NzAxLWEwNTgtNTgxNzUxZjM2MjZkIn0.g2N5d63JMtDRvIKJnioK5E7iSeoVk7W8D9RGxemyfCo",
  "access_expires_at": "2026-10-29T08:13:13.546563228Z",
  "refresh_token": "5jSryWPVueEL9zTwQc24W__GMyOFR1HwuGQL5DzN6CY",
  "refresh_expires_at": "2026-10-29T19:58:13.546032383Z",
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
      "id": "ca20170e-d3eb-41a2-ab02-22d288255b97",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T07:58:12Z",
        "track_point_id": "bed5b931-d58b-4f93-94cf-0b9db49194c2",
        "work_session_id": "6226f85e-33f0-4e37-8dbc-82d505db5714"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T07:58:12Z",
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

`POST /api/admin/v1/driver-risk-flags/ca20170e-d3eb-41a2-ab02-22d288255b97/confirm` → **200**

```json
{
  "command_id": "f118d2a4-13fb-49f0-92fd-66ad84f54f1f",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "ca20170e-d3eb-41a2-ab02-22d288255b97",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T07:58:12Z",
    "track_point_id": "bed5b931-d58b-4f93-94cf-0b9db49194c2",
    "work_session_id": "6226f85e-33f0-4e37-8dbc-82d505db5714"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T07:58:12Z",
  "reason": null,
  "reviewed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reviewed_at": "2026-10-29T07:58:15.713416Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/ca20170e-d3eb-41a2-ab02-22d288255b97/dismiss` → **409**

```json
{
  "command_id": "4712903c-4436-4d09-9b8d-40e44fce0f22",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/ca20170e-d3eb-41a2-ab02-22d288255b97/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1618bd2d-1f89-4260-984f-e0473b190822"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "6ad61658-45d2-4733-a403-9b17e33a70e7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "06685417-cd64-4740-ba4c-6f4da3b8747f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "raised_at": "2026-10-29T07:58:16.290157Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/06685417-cd64-4740-ba4c-6f4da3b8747f/dismiss` → **200**

```json
{
  "command_id": "a9c8dc5f-489f-4bcc-909a-038023111388",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "06685417-cd64-4740-ba4c-6f4da3b8747f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "raised_at": "2026-10-29T07:58:16.290157Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reviewed_at": "2026-10-29T07:58:16.577379Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "2b5efc8c-1238-40bc-81c4-e6161e1a1948",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "ca20170e-d3eb-41a2-ab02-22d288255b97"
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
      "actor_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:58:16.870741Z"
    }
  ]
}
```

Done: flag ca20170e-d3eb-41a2-ab02-22d288255b97 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "ccd5e65e-dad4-43ff-a103-3bc180ddafc1",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1OTcsImlhdCI6MTc5MzI2MDY5NywianRpIjoiYWNmZDZhYzAtNmI4Yy00YjM3LWIxZWUtZmUyOGJhNzhlM2RkIiwic2lkIjoiY2NkNWU2NWUtZGFkNC00M2ZmLWExMDMtM2JjMTgwZGRhZmMxIn0.j-oiaGDe9eGR7fRonp3s6tebQ3yqTcngy7H-HdOVJT4",
  "access_expires_at": "2026-10-29T08:13:17.74317609Z",
  "refresh_token": "2Mq1bmng9AFCFsYA6ARQBIeS8H--kK7F0j6C5ernE6E",
  "refresh_expires_at": "2026-10-29T19:58:17.742673588Z",
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
      "actor_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:58:16.870741Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "b733257c-7677-4ef0-941b-211ee10572d6",
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
  "session_id": "6226f85e-33f0-4e37-8dbc-82d505db5714",
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
  "last_heartbeat_at": "2026-10-29T07:58:10.658161Z",
  "last_location_at": "2026-10-29T07:58:10.658161Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6226f85e-33f0-4e37-8dbc-82d505db5714/close` → **200**

```json
{
  "command_id": "2b172d42-08cf-40e7-b030-a39a79802c7b",
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
  "session_id": "2fa62bbc-71ea-4c0a-9fd3-d3191f458117",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE1OTksImlhdCI6MTc5MzI2MDY5OSwianRpIjoiYjk2ZjM5YzMtODM1Yy00MTVlLTg3YTYtMjFkMzQ5OGU2OGVmIiwic2lkIjoiMmZhNjJiYmMtNzFlYS00YzBhLTlmZDMtZDMxOTFmNDU4MTE3In0.hj9fEpow-tHV9UoxYIHLtnpwFfob2NFt4_dV-GqN6Eo",
  "access_expires_at": "2026-10-29T08:13:19.465408761Z",
  "refresh_token": "I8D7U8cehbMYpFkzjAbyS4rk8MngRHcLiuJmRdsx5VI",
  "refresh_expires_at": "2026-10-29T19:58:19.46491171Z",
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
  "command_id": "8df704d2-cb78-4028-8ecb-edee038ddef6",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:58:20.034638Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "8df704d2-cb78-4028-8ecb-edee038ddef6",
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
  "changed_by": "154415a5-2c56-488b-931a-26ab06629f74",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:58:20.034638Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48658361927",
  "device_ref": "sandbox-8206"
}
```

```json
{
  "challenge_id": "c4148850-4463-45af-bfe5-29c2e6698aae",
  "expires_at": "2026-10-29T08:03:20.606989605Z",
  "resend_available_at": "2026-10-29T07:58:21.606989605Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48658361927` → **200**

```json
{
  "phone": "+48658361927",
  "audience": "CLIENT",
  "code": "847384",
  "sent_at": "2026-10-29T07:58:20.609828846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4148850-4463-45af-bfe5-29c2e6698aae",
  "code": "847384",
  "device_ref": "sandbox-8206"
}
```

```json
{
  "session_id": "0130e1cc-4db5-4936-b3c7-92f5bf0edea1",
  "subject": {
    "type": "CLIENT",
    "id": "ee9fce88-0ab5-4930-ba3c-dd2d8d9e4c1b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZTlmY2U4OC0wYWI1LTQ5MzAtYmEzYy1kZDJkOGQ5ZTRjMWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNjAwLCJpYXQiOjE3OTMyNjA3MDAsImp0aSI6ImU2YzQxZGFiLTk0NmUtNDZiNi1hMWFkLTFiMjYzNzgyMDYzOCIsInNpZCI6IjAxMzBlMWNjLTRkYjUtNDkzNi1iM2M3LTkyZjViZjBlZGVhMSJ9.modzlliTuf_OwCfILa7oxFrO4PO-dt2I0RW9FlainYQ",
  "access_expires_at": "2026-10-29T08:13:20.907591843Z",
  "refresh_token": "UOfOkGATwkAKXZK1jGPajv6tbEzuVAl0gTTYrWaGhLI",
  "refresh_expires_at": "2026-11-28T07:58:20.90702451Z",
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
  "correlation_id": "10d99235-00db-42e4-af12-cfbe87ded362"
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
  "device_ref": "sandbox-4224"
}
```

```json
{
  "challenge_id": "e9f1c5a0-b5ba-4cf2-b663-7dbbc4869e3d",
  "expires_at": "2026-10-29T08:03:21.734997513Z",
  "resend_available_at": "2026-10-29T07:58:22.734997513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "287813",
  "sent_at": "2026-10-29T07:58:21.737111553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9f1c5a0-b5ba-4cf2-b663-7dbbc4869e3d",
  "code": "287813",
  "device_ref": "sandbox-4224"
}
```

```json
{
  "session_id": "9c472eb5-7805-4712-bb0d-0f57dee6e8b0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTYwMiwiaWF0IjoxNzkzMjYwNzAyLCJqdGkiOiJkZGJlMTNmZC1mNGMxLTRhMjItODVmZi1lYmMxODk5M2Y2ZDUiLCJzaWQiOiI5YzQ3MmViNS03ODA1LTQ3MTItYmIwZC0wZjU3ZGVlNmU4YjAifQ.E_aiOcSxYBX0JHc4fEgTTR6sHWnZ8vnkr9wHKJj2W4g",
  "access_expires_at": "2026-10-29T08:13:22.032180756Z",
  "refresh_token": "5TOz4mAjos0WrCCM67NWsjJ1Vyz6bwq8D3sxfn7sbLE",
  "refresh_expires_at": "2026-11-28T07:58:22.031641966Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "01de09eb-25fa-4141-9676-3103a66e03dc",
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
  "last_heartbeat_at": "2026-10-29T07:57:48.708344Z",
  "last_location_at": "2026-10-29T07:57:48.708344Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/01de09eb-25fa-4141-9676-3103a66e03dc/handover` → **200**

```json
{
  "command_id": "145fc750-33dd-4e3a-b134-ff4cb4eeab96",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "01de09eb-25fa-4141-9676-3103a66e03dc",
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
  "last_heartbeat_at": "2026-10-29T07:57:48.708344Z",
  "last_location_at": "2026-10-29T07:57:48.708344Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/01de09eb-25fa-4141-9676-3103a66e03dc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:58:22Z",
    "sequence": 1793260702854
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "01de09eb-25fa-4141-9676-3103a66e03dc",
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
  "last_heartbeat_at": "2026-10-29T07:58:22.872429Z",
  "last_location_at": "2026-10-29T07:58:22.872429Z",
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
  "session_id": "01de09eb-25fa-4141-9676-3103a66e03dc",
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
  "last_heartbeat_at": "2026-10-29T07:58:22.872429Z",
  "last_location_at": "2026-10-29T07:58:22.872429Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/01de09eb-25fa-4141-9676-3103a66e03dc/close` → **200**

```json
{
  "command_id": "bdd4a503-4f23-400a-9c61-0368917e5d6b",
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
  "correlation_id": "9fe99c45-611d-44d5-9bb5-21ce24bf23b1"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672399439",
  "device_ref": "sandbox-15969"
}
```

```json
{
  "challenge_id": "cc7b5995-9e8d-4765-abe2-7f0138f227b2",
  "expires_at": "2026-10-29T08:03:24.268812457Z",
  "resend_available_at": "2026-10-29T07:58:25.268812457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672399439` → **200**

```json
{
  "phone": "+380672399439",
  "audience": "CLIENT",
  "code": "828777",
  "sent_at": "2026-10-29T07:58:24.270858463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc7b5995-9e8d-4765-abe2-7f0138f227b2",
  "code": "828777",
  "device_ref": "sandbox-15969"
}
```

```json
{
  "session_id": "f237ecf7-8790-4094-9ee6-8c526a84a659",
  "subject": {
    "type": "CLIENT",
    "id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YWI3ODdjNC0yNGYxLTRkZjItOWQyZS0wYjE5N2Q2ZjQzZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNjA0LCJpYXQiOjE3OTMyNjA3MDQsImp0aSI6ImIzYzZjNGU2LTYyZGEtNDBkNi1iOWY2LWU0YjlmMWQ3NThkZiIsInNpZCI6ImYyMzdlY2Y3LTg3OTAtNDA5NC05ZWU2LThjNTI2YTg0YTY1OSJ9.JC8TqlidDk-YuX8IO7qo19RGhBjlouK7AaFRQWB0PJk",
  "access_expires_at": "2026-10-29T08:13:24.569152709Z",
  "refresh_token": "SvZsiLcwHWOya3wA-fAFZwB2Z7E9ZmlEhZteaokgoxg",
  "refresh_expires_at": "2026-11-28T07:58:24.568578123Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "06d3331a-6d6c-4721-8a17-2c7d65ff84ab",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0",
  "upload_path": "/api/rider/v1/uploads/7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0",
  "expires_at": "2026-10-29T08:13:24.860603694Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0` → **200**

```json
{
  "file_id": "7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "7f55f1a3-39cc-4604-a8d4-d8cbdc685080",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0"
  ]
}
```

```json
{
  "id": "43afaff0-689b-417b-9713-5950e8a00d9a",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:58:25.176101Z",
  "updated_at": "2026-10-29T07:58:25.176101Z",
  "respond_by": "2026-10-29T11:58:25.176101Z",
  "messages": [
    {
      "id": "cb3e42d0-91d8-4a5d-b616-2cc60c2fda64",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:58:25.177106Z",
      "attachments": [
        {
          "file_id": "7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0",
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
  "session_id": "11925b9f-7560-4479-a854-75eed634cccd",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE2MDUsImlhdCI6MTc5MzI2MDcwNSwianRpIjoiOTJjYmZhN2ItNzBmZC00ZTg5LTgxMjEtOGNkZWZkNTZhZDdlIiwic2lkIjoiMTE5MjViOWYtNzU2MC00NDc5LWE4NTQtNzVlZWQ2MzRjY2NkIn0.xx1d2qHP3yPGeYO6YlMh9elF7rQaZHTFXilo3ko8BgA",
  "access_expires_at": "2026-10-29T08:13:25.761774186Z",
  "refresh_token": "B9Olpcm89JtadFZHgpuucmHlMT32clp6bIU4g8FCrxg",
  "refresh_expires_at": "2026-10-29T19:58:25.761190522Z",
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
  "session_id": "6adf3198-cf34-4ec2-be0a-772108ab496c",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE2MDYsImlhdCI6MTc5MzI2MDcwNiwianRpIjoiMDZiODVmOTQtNGVmYi00YjJmLTlkYzctMTIxYjY2OGZiOTczIiwic2lkIjoiNmFkZjMxOTgtY2YzNC00ZWMyLWJlMGEtNzcyMTA4YWI0OTZjIn0.h5R-rbjXKwvOm0h8GHG-32Y6_jzgu7bXKOBUNIvUbLs",
  "access_expires_at": "2026-10-29T08:13:26.32811272Z",
  "refresh_token": "em3aXEl3kCzUpXK6tv1vbDAlFWv_AFDH5PW52Ab_QUo",
  "refresh_expires_at": "2026-10-29T19:58:26.327596252Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/43afaff0-689b-417b-9713-5950e8a00d9a/attachments/7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "e32cb13a-74c3-452f-8c28-e5eca3f16ec6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "9a3349fa-0033-4735-bc82-e2e4b64600a8",
  "upload_path": "/api/operator/v1/uploads/9a3349fa-0033-4735-bc82-e2e4b64600a8",
  "expires_at": "2026-10-29T08:13:26.619074298Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/9a3349fa-0033-4735-bc82-e2e4b64600a8` → **200**

```json
{
  "file_id": "9a3349fa-0033-4735-bc82-e2e4b64600a8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/43afaff0-689b-417b-9713-5950e8a00d9a` → **200**

```json
{
  "id": "43afaff0-689b-417b-9713-5950e8a00d9a",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:58:25.176101Z",
  "updated_at": "2026-10-29T07:58:25.176101Z",
  "respond_by": "2026-10-29T11:58:25.176101Z",
  "messages": [
    {
      "id": "cb3e42d0-91d8-4a5d-b616-2cc60c2fda64",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:58:25.177106Z",
      "attachments": [
        {
          "file_id": "7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/43afaff0-689b-417b-9713-5950e8a00d9a/comments` → **200**

```json
{
  "command_id": "4939b989-c810-400a-a5e5-5f9e9d3dbb9e",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "9a3349fa-0033-4735-bc82-e2e4b64600a8"
  ]
}
```

```json
{
  "id": "43afaff0-689b-417b-9713-5950e8a00d9a",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:58:25.176101Z",
  "updated_at": "2026-10-29T07:58:27.198948Z",
  "respond_by": "2026-10-29T11:58:25.176101Z",
  "messages": [
    {
      "id": "cb3e42d0-91d8-4a5d-b616-2cc60c2fda64",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:58:25.177106Z",
      "attachments": [
        {
          "file_id": "7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ad80c28b-dcc6-4136-8b62-7f443e3ee497",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:58:27.198463Z",
      "attachments": [
        {
          "file_id": "9a3349fa-0033-4735-bc82-e2e4b64600a8",
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

`GET /api/rider/v1/support/cases/43afaff0-689b-417b-9713-5950e8a00d9a` → **200**

```json
{
  "id": "43afaff0-689b-417b-9713-5950e8a00d9a",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:58:25.176101Z",
  "updated_at": "2026-10-29T07:58:27.198948Z",
  "respond_by": "2026-10-29T11:58:25.176101Z",
  "messages": [
    {
      "id": "cb3e42d0-91d8-4a5d-b616-2cc60c2fda64",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8ab787c4-24f1-4df2-9d2e-0b197d6f43d7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:58:25.177106Z",
      "attachments": [
        {
          "file_id": "7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ad80c28b-dcc6-4136-8b62-7f443e3ee497",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:58:27.198463Z",
      "attachments": [
        {
          "file_id": "9a3349fa-0033-4735-bc82-e2e4b64600a8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/43afaff0-689b-417b-9713-5950e8a00d9a/attachments/9a3349fa-0033-4735-bc82-e2e4b64600a8` → **200**

Done: support case 43afaff0-689b-417b-9713-5950e8a00d9a, rider attachment 7bdb64cb-d3a1-4c91-9b72-aa2cfbd991a0, operator attachment 9a3349fa-0033-4735-bc82-e2e4b64600a8.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734888844",
  "device_ref": "sandbox-9969"
}
```

```json
{
  "challenge_id": "6e0504c8-b2a1-473b-8dad-00fac119cc03",
  "expires_at": "2026-10-29T08:03:27.793672868Z",
  "resend_available_at": "2026-10-29T07:58:28.793672868Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734888844` → **200**

```json
{
  "phone": "+380734888844",
  "audience": "CLIENT",
  "code": "898547",
  "sent_at": "2026-10-29T07:58:27.796190905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e0504c8-b2a1-473b-8dad-00fac119cc03",
  "code": "898547",
  "device_ref": "sandbox-9969"
}
```

```json
{
  "session_id": "247589dc-0051-458c-b434-60bf79c6cc10",
  "subject": {
    "type": "CLIENT",
    "id": "086187bc-bd9f-4879-a0df-a301c5fe2adc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODYxODdiYy1iZDlmLTQ4NzktYTBkZi1hMzAxYzVmZTJhZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNjA4LCJpYXQiOjE3OTMyNjA3MDgsImp0aSI6ImQ4ZmU2OWE1LTMwMWYtNGUyNy05YzBjLTIzMGE2ZTFkNmE5NiIsInNpZCI6IjI0NzU4OWRjLTAwNTEtNDU4Yy1iNDM0LTYwYmY3OWM2Y2MxMCJ9.Ep2zTpS7_VtZT1LkMWGw_MOO-hZh4zY2mgxFv3hDCio",
  "access_expires_at": "2026-10-29T08:13:28.086860692Z",
  "refresh_token": "eJN1VTVCeNgvJPu330m8FeUvjqG9TrL2xZuIDWfn3Ic",
  "refresh_expires_at": "2026-11-28T07:58:28.08620862Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "2c813102-a49c-48c0-92e7-3947e9d7d080",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "58e55309-cc9b-4ace-a2d7-fda64294eea4",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-58e55309-cc9b-4ace-a2d7-fda64294eea4",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "9593b6a05d47bfcd16c69424e0f0b798",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=58e55309-cc9b-4ace-a2d7-fda64294eea4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734888844"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=58e55309-cc9b-4ace-a2d7-fda64294eea4",
  "expires_at": "2026-10-29T08:28:28.358063Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/58e55309-cc9b-4ace-a2d7-fda64294eea4` → **200**

```json
{
  "id": "58e55309-cc9b-4ace-a2d7-fda64294eea4",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:28:28.358063Z",
  "card": {
    "id": "a5bd17c4-069d-4dcb-96a1-795c44f81e7f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7672",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:58:28.642834Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "76ed1169-e5e5-4c5f-bb17-99d64257f910",
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
  "id": "d4043da6-4b49-4272-b4b6-ccb3f0e8c57e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:03:28.946062Z",
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
  "command_id": "d43b2eba-8ba3-447f-b45c-dba2b6df2c13",
  "quote_id": "d4043da6-4b49-4272-b4b6-ccb3f0e8c57e",
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
  "id": "5dba324c-e8ab-42ed-aad9-b3acd8649b1c",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "086187bc-bd9f-4879-a0df-a301c5fe2adc",
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
  "created_at": "2026-10-29T07:58:29.230553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dba324c-e8ab-42ed-aad9-b3acd8649b1c` → **200**

```json
{
  "id": "5dba324c-e8ab-42ed-aad9-b3acd8649b1c",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "086187bc-bd9f-4879-a0df-a301c5fe2adc",
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
  "created_at": "2026-10-29T07:58:29.230553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dba324c-e8ab-42ed-aad9-b3acd8649b1c` → **200**

```json
{
  "id": "5dba324c-e8ab-42ed-aad9-b3acd8649b1c",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "086187bc-bd9f-4879-a0df-a301c5fe2adc",
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
  "created_at": "2026-10-29T07:58:29.230553Z",
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

`GET /api/rider/v1/orders/5dba324c-e8ab-42ed-aad9-b3acd8649b1c` → **200**

```json
{
  "id": "5dba324c-e8ab-42ed-aad9-b3acd8649b1c",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "086187bc-bd9f-4879-a0df-a301c5fe2adc",
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
  "created_at": "2026-10-29T07:58:29.230553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5dba324c-e8ab-42ed-aad9-b3acd8649b1c/switch-to-cash` → **200**

```json
{
  "command_id": "5642e5bf-c697-4cd8-8ad2-e3deaf69baf0",
  "expected_version": 3
}
```

```json
{
  "id": "5dba324c-e8ab-42ed-aad9-b3acd8649b1c",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "086187bc-bd9f-4879-a0df-a301c5fe2adc",
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
  "created_at": "2026-10-29T07:58:29.230553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5dba324c-e8ab-42ed-aad9-b3acd8649b1c/switch-to-cash` → **409**

```json
{
  "command_id": "5674368f-ac1f-497d-b4e0-bbb726589d76",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/5dba324c-e8ab-42ed-aad9-b3acd8649b1c/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d19be1ec-2f3f-40d4-ba79-7037e04fce11"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/5dba324c-e8ab-42ed-aad9-b3acd8649b1c` → **200**

```json
{
  "id": "5dba324c-e8ab-42ed-aad9-b3acd8649b1c",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "086187bc-bd9f-4879-a0df-a301c5fe2adc",
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
  "created_at": "2026-10-29T07:58:29.230553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5dba324c-e8ab-42ed-aad9-b3acd8649b1c/cancel` → **200**

```json
{
  "command_id": "759ce4d0-1c1e-4b5a-8ddc-2c990083721f",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5dba324c-e8ab-42ed-aad9-b3acd8649b1c",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "086187bc-bd9f-4879-a0df-a301c5fe2adc",
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
  "created_at": "2026-10-29T07:58:29.230553Z",
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
  "session_id": "9f2d33b0-e406-4ee0-9627-884891cbbba8",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE2MTIsImlhdCI6MTc5MzI2MDcxMiwianRpIjoiMjcwNzA2OTgtYWJmNS00YTI1LWEyN2EtMDNjMDczMTA3MzY3Iiwic2lkIjoiOWYyZDMzYjAtZTQwNi00ZWUwLTk2MjctODg0ODkxY2JiYmE4In0.uBadqNwYiGbry_PFl9SI0mVTqCnhzpkLYo1d5YpddYA",
  "access_expires_at": "2026-10-29T08:13:32.813182893Z",
  "refresh_token": "maMHr3Y1TppPPx4KWZ-S_5kXjRl-5n42ubRaT_v-8iY",
  "refresh_expires_at": "2026-10-29T19:58:32.812689288Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24571"
}
```

```json
{
  "challenge_id": "bc69649a-5d1e-4c3b-809d-4e9cec84d7cd",
  "expires_at": "2026-10-29T08:03:33.08432639Z",
  "resend_available_at": "2026-10-29T07:58:34.08432639Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "571272",
  "sent_at": "2026-10-29T07:58:33.086546902Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc69649a-5d1e-4c3b-809d-4e9cec84d7cd",
  "code": "571272",
  "device_ref": "sandbox-24571"
}
```

```json
{
  "session_id": "5b56350b-40d9-4c3f-a974-0dce8c79d838",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTYxMywiaWF0IjoxNzkzMjYwNzEzLCJqdGkiOiI3MDIzN2RiOC1mZTg5LTQ1ODAtODQwNC0wY2Q4ZWM0OGU0ZjMiLCJzaWQiOiI1YjU2MzUwYi00MGQ5LTRjM2YtYTk3NC0wZGNlOGM3OWQ4MzgifQ.upH5XcW5j16X-vIL7pMlViVjr7pTaw-VIq5djPNbo8I",
  "access_expires_at": "2026-10-29T08:13:33.373368808Z",
  "refresh_token": "aWHXbtZNmVVofLxUyxlXDgX9BPn-aMtXyFBx5pD2OsM",
  "refresh_expires_at": "2026-11-28T07:58:33.372839947Z",
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
      "actor_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:58:16.870741Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "154415a5-2c56-488b-931a-26ab06629f74",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T07:58:18.308695Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "f1fbb2ef-96bd-446f-b3d4-7653355c368a",
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
  "device_ref": "sandbox-26295"
}
```

```json
{
  "challenge_id": "f537529d-76e7-45fd-b901-33be490944cd",
  "expires_at": "2026-10-29T08:03:34.475681175Z",
  "resend_available_at": "2026-10-29T07:58:35.475681175Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "743016",
  "sent_at": "2026-10-29T07:58:34.477756644Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f537529d-76e7-45fd-b901-33be490944cd",
  "code": "743016",
  "device_ref": "sandbox-26295"
}
```

```json
{
  "session_id": "4e51c47e-b06b-4817-a856-7d2ac879c5b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTYxNCwiaWF0IjoxNzkzMjYwNzE0LCJqdGkiOiJjNTA3Y2QyNC05MWJlLTQ2NjAtODcwMy02YjVkNjI0MDg5ODciLCJzaWQiOiI0ZTUxYzQ3ZS1iMDZiLTQ4MTctYTg1Ni03ZDJhYzg3OWM1YjUifQ.4nRPQt8-r8h4gCUYuV25iJZWpje_feT08mme4ufXaaE",
  "access_expires_at": "2026-10-29T08:13:34.762324156Z",
  "refresh_token": "lM4Jx6Ur2ay8LRVGd_KWrJ6DBCv9a-IQtJ6_-E4rvuM",
  "refresh_expires_at": "2026-11-28T07:58:34.761809462Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c3d763c8-af4b-43cb-9f28-2a6b866a0163",
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
  "last_heartbeat_at": "2026-10-29T07:57:55.742716Z",
  "last_location_at": "2026-10-29T07:57:55.742716Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c3d763c8-af4b-43cb-9f28-2a6b866a0163/handover` → **200**

```json
{
  "command_id": "9498b25a-74e6-48f8-919d-5eed6c084ecd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c3d763c8-af4b-43cb-9f28-2a6b866a0163",
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
  "last_heartbeat_at": "2026-10-29T07:57:55.742716Z",
  "last_location_at": "2026-10-29T07:57:55.742716Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/c3d763c8-af4b-43cb-9f28-2a6b866a0163/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:58:35Z",
    "sequence": 1793260715598
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c3d763c8-af4b-43cb-9f28-2a6b866a0163",
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
  "last_heartbeat_at": "2026-10-29T07:58:35.61583Z",
  "last_location_at": "2026-10-29T07:58:35.61583Z",
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
  "command_id": "9ece2149-7c3e-4536-9efc-fef24c85a6ca",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:58:36Z",
    "sequence": 1793260716159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4961707-dac8-4f6b-9981-949e942956b4",
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
  "last_heartbeat_at": "2026-10-29T07:58:36.17709Z",
  "last_location_at": "2026-10-29T07:58:36.17709Z",
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
  "session_id": "f532ae6c-6a06-49e6-a7ef-fac043e84e30",
  "subject": {
    "type": "STAFF",
    "id": "154415a5-2c56-488b-931a-26ab06629f74"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTQ0MTVhNS0yYzU2LTQ4OGItOTMxYS0yNmFiMDY2MjlmNzQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjE2MTYsImlhdCI6MTc5MzI2MDcxNiwianRpIjoiNzgxZDY3YjMtMGYxMi00MWU5LWE0MjYtODBlZGIzMjY4YTc5Iiwic2lkIjoiZjUzMmFlNmMtNmEwNi00OWU2LWE3ZWYtZmFjMDQzZTg0ZTMwIn0.Geasx1J8Jcqmu67dU98H6I8bIitt0N9eYjaTssStuU4",
  "access_expires_at": "2026-10-29T08:13:36.738839355Z",
  "refresh_token": "FvZ-Gvtdj0m-ut1L3RvZDlEd1TiPX6IWabiYeYcrAjo",
  "refresh_expires_at": "2026-10-29T19:58:36.738248888Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a9ba98ac-3869-48e9-ba57-7ab9466dca80",
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
  "id": "16a6e239-e62b-4e84-a174-8c362c8ab407",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:03:37.010898Z",
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
  "command_id": "3f00abb0-980c-443d-b0e9-fa82612e96cc",
  "quote_id": "16a6e239-e62b-4e84-a174-8c362c8ab407",
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
  "id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
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
  "created_at": "2026-10-29T07:58:37.297154Z",
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
    "id": "ed85e4a1-89c6-4f7d-b4a2-dc92a95a9d1a",
    "order_id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
    "expires_at": "2026-10-29T07:58:52.300803Z",
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

`POST /api/driver/v1/offers/ed85e4a1-89c6-4f7d-b4a2-dc92a95a9d1a/accept` → **200**

```json
{
  "command_id": "f0a361bc-aa92-4f76-9215-27e3c50356db"
}
```

```json
{
  "id": "c319a327-4f39-470a-b319-7c7063232259",
  "order_id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9dfb4919-ed1c-4cc7-8228-ad310a3c36cd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9dfb4919-ed1c-4cc7-8228-ad310a3c36cd",
  "order_id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
  "assignment_id": "c319a327-4f39-470a-b319-7c7063232259",
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

`POST /api/driver/v1/work-sessions/d4961707-dac8-4f6b-9981-949e942956b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:58:38Z",
    "sequence": 1793260718658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d4961707-dac8-4f6b-9981-949e942956b4",
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
  "last_heartbeat_at": "2026-10-29T07:58:38.677612Z",
  "last_location_at": "2026-10-29T07:58:38.677612Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9dfb4919-ed1c-4cc7-8228-ad310a3c36cd/arrive` → **200**

```json
{
  "command_id": "6e0335eb-b4d4-4751-a49d-c9a6d7d832d9",
  "expected_version": 0
}
```

```json
{
  "id": "9dfb4919-ed1c-4cc7-8228-ad310a3c36cd",
  "order_id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
  "assignment_id": "c319a327-4f39-470a-b319-7c7063232259",
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
  "arrived_at": "2026-10-29T07:58:38.965626Z",
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

`POST /api/driver/v1/trips/9dfb4919-ed1c-4cc7-8228-ad310a3c36cd/start` → **200**

```json
{
  "command_id": "ad7f2472-6106-4762-a590-4071e8d05047",
  "expected_version": 1
}
```

```json
{
  "id": "9dfb4919-ed1c-4cc7-8228-ad310a3c36cd",
  "order_id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
  "assignment_id": "c319a327-4f39-470a-b319-7c7063232259",
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
  "arrived_at": "2026-10-29T07:58:38.965626Z",
  "started_at": "2026-10-29T07:58:39.256248Z",
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

`POST /api/driver/v1/trips/9dfb4919-ed1c-4cc7-8228-ad310a3c36cd/complete` → **200**

```json
{
  "command_id": "c8742f2a-d6ad-4722-a9d1-2a572b6b72cc",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:58:39Z",
  "cash_received": true
}
```

```json
{
  "id": "9dfb4919-ed1c-4cc7-8228-ad310a3c36cd",
  "order_id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
  "assignment_id": "c319a327-4f39-470a-b319-7c7063232259",
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
  "arrived_at": "2026-10-29T07:58:38.965626Z",
  "started_at": "2026-10-29T07:58:39.256248Z",
  "completed_at": "2026-10-29T07:58:39.541794Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/f0926a1b-2f91-4c3c-9159-67ea35a59b69` → **200**

```json
{
  "id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
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
    "id": "c319a327-4f39-470a-b319-7c7063232259",
    "order_id": "f0926a1b-2f91-4c3c-9159-67ea35a59b69",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9dfb4919-ed1c-4cc7-8228-ad310a3c36cd",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:58:37.297154Z",
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
  "session_id": "c3d763c8-af4b-43cb-9f28-2a6b866a0163",
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
  "last_heartbeat_at": "2026-10-29T07:58:35.61583Z",
  "last_location_at": "2026-10-29T07:58:35.61583Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c3d763c8-af4b-43cb-9f28-2a6b866a0163/close` → **200**

```json
{
  "command_id": "3eb7a919-a4e4-40d4-87b3-1be5cc3c2b04",
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
  "session_id": "d4961707-dac8-4f6b-9981-949e942956b4",
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
  "last_heartbeat_at": "2026-10-29T07:58:38.677612Z",
  "last_location_at": "2026-10-29T07:58:38.677612Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4961707-dac8-4f6b-9981-949e942956b4/close` → **200**

```json
{
  "command_id": "0ee494be-6322-4c92-915d-4471a02945dd",
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

Done: terminal order f0926a1b-2f91-4c3c-9159-67ea35a59b69 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-143"
}
```

```json
{
  "challenge_id": "ebda689d-8b2f-4ad4-b378-8bc4e0de349f",
  "expires_at": "2026-10-29T08:03:44.638104449Z",
  "resend_available_at": "2026-10-29T07:58:45.638104449Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "339159",
  "sent_at": "2026-10-29T07:58:44.64059746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebda689d-8b2f-4ad4-b378-8bc4e0de349f",
  "code": "339159",
  "device_ref": "sandbox-143"
}
```

```json
{
  "session_id": "4c3c55da-a5c8-41d4-ad35-bbd3c14c659d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTYyNCwiaWF0IjoxNzkzMjYwNzI0LCJqdGkiOiI2ODAxZjIwYy1mZWQ0LTQwZWUtODMwMi04OTJmNjlhOTllZDQiLCJzaWQiOiI0YzNjNTVkYS1hNWM4LTQxZDQtYWQzNS1iYmQzYzE0YzY1OWQifQ.UX8loAIJC52FjmMvba2dfun-aU2AQHQQMq8DKaR8RWM",
  "access_expires_at": "2026-10-29T08:13:44.94302649Z",
  "refresh_token": "wtkoL5AWoZDNic8jRzs5t3LsjVGAW8QKChjowhx2xvM",
  "refresh_expires_at": "2026-11-28T07:58:44.942470508Z",
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
  "device_ref": "sandbox-2063"
}
```

```json
{
  "challenge_id": "ecf2d197-4eaf-4ed6-bcc8-4d060276be4f",
  "expires_at": "2026-10-29T08:03:45.509707494Z",
  "resend_available_at": "2026-10-29T07:58:46.509707494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "010390",
  "sent_at": "2026-10-29T07:58:45.512181682Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecf2d197-4eaf-4ed6-bcc8-4d060276be4f",
  "code": "010390",
  "device_ref": "sandbox-2063"
}
```

```json
{
  "session_id": "ad3f9e1f-f3c6-4710-84ee-ba425ff61a3b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTYyNSwiaWF0IjoxNzkzMjYwNzI1LCJqdGkiOiI2Y2ZmMTlhNC00NGY5LTQ4NjktOTllZC0xM2ZjMjEwZTlhNTYiLCJzaWQiOiJhZDNmOWUxZi1mM2M2LTQ3MTAtODRlZS1iYTQyNWZmNjFhM2IifQ.MzHFU3NJUgFehXY6K55okA3iypho4oh0KkYVrYpsBMg",
  "access_expires_at": "2026-10-29T08:13:45.809924295Z",
  "refresh_token": "ckYop9oVDb5629jOZGnJJM-PBFRhv1pMZV7ou1thwbc",
  "refresh_expires_at": "2026-11-28T07:58:45.809394703Z",
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
  "device_ref": "sandbox-31951"
}
```

```json
{
  "challenge_id": "ce66b63f-14b8-47fc-9d5a-0f3798cddbef",
  "expires_at": "2026-10-29T08:03:46.341087721Z",
  "resend_available_at": "2026-10-29T07:58:47.341087721Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "770742",
  "sent_at": "2026-10-29T07:58:46.343207743Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce66b63f-14b8-47fc-9d5a-0f3798cddbef",
  "code": "770742",
  "device_ref": "sandbox-31951"
}
```

```json
{
  "session_id": "56d7ba4b-8bd6-458c-867a-4374cce80fc2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MTYyNiwiaWF0IjoxNzkzMjYwNzI2LCJqdGkiOiIyNDM3NzNkOS05NDcxLTQwNDQtOWE4YS04Mjc3MzI3M2ExNjgiLCJzaWQiOiI1NmQ3YmE0Yi04YmQ2LTQ1OGMtODY3YS00Mzc0Y2NlODBmYzIifQ.IgoJlLsBVI2p0oJyZ91MJx9kk-S8PaRosl-ixxxQSOQ",
  "access_expires_at": "2026-10-29T08:13:46.636908191Z",
  "refresh_token": "7KHVTGhrDQ8uuOu8I2eJoaRobK5dA5ptLA5tkxIrST8",
  "refresh_expires_at": "2026-11-28T07:58:46.636285586Z",
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
  "phone": "+380697496774",
  "device_ref": "sandbox-1799"
}
```

```json
{
  "challenge_id": "bae817a9-eaf3-495d-bdd2-9b60c32faf26",
  "expires_at": "2026-10-29T08:03:47.174108419Z",
  "resend_available_at": "2026-10-29T07:58:48.174108419Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380697496774` → **200**

```json
{
  "phone": "+380697496774",
  "audience": "CLIENT",
  "code": "158131",
  "sent_at": "2026-10-29T07:58:47.176184247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bae817a9-eaf3-495d-bdd2-9b60c32faf26",
  "code": "158131",
  "device_ref": "sandbox-1799"
}
```

```json
{
  "session_id": "db4747df-380b-4114-8178-4581f4e22d94",
  "subject": {
    "type": "CLIENT",
    "id": "4d842680-15b4-4842-ad9b-0bc025e353ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDg0MjY4MC0xNWI0LTQ4NDItYWQ5Yi0wYmMwMjVlMzUzZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYxNjI3LCJpYXQiOjE3OTMyNjA3MjcsImp0aSI6Ijc0OTk2MTVkLWI4MzMtNGRmZC1iNGYwLWIxOTU5NDMzOTUwMSIsInNpZCI6ImRiNDc0N2RmLTM4MGItNDExNC04MTc4LTQ1ODFmNGUyMmQ5NCJ9.S8yNfs48QHaeBL4ua5gvpBfiLUfHz_u0H6sUrsb7L_A",
  "access_expires_at": "2026-10-29T08:13:47.477542767Z",
  "refresh_token": "3H4CbheBSeFSI2yMy-Y6EV7JcAlyPb83IjrX1lTlCFc",
  "refresh_expires_at": "2026-11-28T07:58:47.477045736Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7e299324-f260-49eb-b360-d6c84b9446c9",
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
  "id": "b892fc1b-974b-4aa3-969c-3bf97b83360f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T08:03:47.752334Z",
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
  "command_id": "ed827aad-20e8-40aa-af62-4853e3646a7f",
  "quote_id": "b892fc1b-974b-4aa3-969c-3bf97b83360f",
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
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:58:48.046644Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 12.611670923
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.138149267
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

`GET /api/rider/v1/orders/2346b61c-9fa3-4129-a723-91fd79957875` → **200**

```json
{
  "id": "2346b61c-9fa3-4129-a723-91fd79957875",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4d842680-15b4-4842-ad9b-0bc025e353ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:58:48.046644Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
