# Sandbox transcript (2026-10-29T14:52:17Z, 48ff250)

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
  "correlation_id": "27adbf41-fe45-4cc8-967f-e383ec53cba3"
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
  "session_id": "098132a0-9d30-4e5f-ab24-3265ae2037cb",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NDUsImlhdCI6MTc5MzI4NTU0NSwianRpIjoiYzk0ZTFiODktNzJiZC00Njc2LWE1NjMtYzZlZTU0NTMwY2VjIiwic2lkIjoiMDk4MTMyYTAtOWQzMC00ZTVmLWFiMjQtMzI2NWFlMjAzN2NiIn0.iNqfK0WKmpoPB8WmMhgPf7VzWADSAAbMD_ZQe83G0-w",
  "access_expires_at": "2026-10-29T15:07:25.378386307Z",
  "refresh_token": "fmHk9wa33QglzcSnbRk_i4SnjyLtrOrg96kLQrIcBT8",
  "refresh_expires_at": "2026-10-30T02:52:25.375882881Z",
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
  "session_id": "09c532b6-7f07-4df8-a9b2-1682121426cb",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NDcsImlhdCI6MTc5MzI4NTU0NywianRpIjoiNTM0YjRkODgtMzFhMy00NjZkLTkyZDQtMGY1MGI3ODMwMzMzIiwic2lkIjoiMDljNTMyYjYtN2YwNy00ZGY4LWE5YjItMTY4MjEyMTQyNmNiIn0.PhqPj7d4c4P-C_bzqlnIipyv1t6BVtt324vJU-LKO1A",
  "access_expires_at": "2026-10-29T15:07:27.256060996Z",
  "refresh_token": "DXmIzlMP52mkj_ea5CWE3yg0tbsgNURi-9jrZgn1WpA",
  "refresh_expires_at": "2026-10-30T02:52:27.254824972Z",
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
  "device_ref": "sandbox-11568"
}
```

```json
{
  "challenge_id": "79cef0c2-3fe2-41a6-b03f-c13e0c1fea32",
  "expires_at": "2026-10-29T14:57:27.916967816Z",
  "resend_available_at": "2026-10-29T14:52:28.916967816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "951219",
  "sent_at": "2026-10-29T14:52:27.930357649Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79cef0c2-3fe2-41a6-b03f-c13e0c1fea32",
  "code": "951219",
  "device_ref": "sandbox-11568"
}
```

```json
{
  "session_id": "3759c407-3e07-4c00-b492-b6e6bb38a3cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ0OCwiaWF0IjoxNzkzMjg1NTQ4LCJqdGkiOiJlYjdiYjU3Yi0yNWQyLTQxN2MtYWQwYy0xZDVhMTQ4N2JjODciLCJzaWQiOiIzNzU5YzQwNy0zZTA3LTRjMDAtYjQ5Mi1iNmU2YmIzOGEzY2YifQ.KN3umeSIfDQRFgXkkN0Gqdli4FbfPHMhKcnG2VgCxv4",
  "access_expires_at": "2026-10-29T15:07:28.294060188Z",
  "refresh_token": "puTDE907tpfqvH4PKS6XBUKxz7pQJR8W0ObJEAmb6jg",
  "refresh_expires_at": "2026-11-28T14:52:28.292949619Z",
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
  "command_id": "bb0ccc10-81fa-464c-ad31-f762c6d53a04",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:28Z",
    "sequence": 1793285548900
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "039c0490-5ab0-47c3-ab5c-101c2e450280",
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
  "last_heartbeat_at": "2026-10-29T14:52:29.008478Z",
  "last_location_at": "2026-10-29T14:52:29.008478Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636242355",
  "device_ref": "sandbox-1308"
}
```

```json
{
  "challenge_id": "e25cfc6a-06cc-46ea-8934-f619d40403b5",
  "expires_at": "2026-10-29T14:57:29.327182867Z",
  "resend_available_at": "2026-10-29T14:52:30.327182867Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636242355` → **200**

```json
{
  "phone": "+380636242355",
  "audience": "CLIENT",
  "code": "818196",
  "sent_at": "2026-10-29T14:52:29.332221308Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e25cfc6a-06cc-46ea-8934-f619d40403b5",
  "code": "818196",
  "device_ref": "sandbox-1308"
}
```

```json
{
  "session_id": "6656a514-ccf6-4680-8db2-ae0e5cc922e3",
  "subject": {
    "type": "CLIENT",
    "id": "91eb3a13-d7a5-4b8c-85a5-a55e24b4d420"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWViM2ExMy1kN2E1LTRiOGMtODVhNS1hNTVlMjRiNGQ0MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NDQ5LCJpYXQiOjE3OTMyODU1NDksImp0aSI6ImFlMzIzMDNlLTdjMGUtNGI0Yy05ZjhjLTZiMzAyNjk1MDY5NCIsInNpZCI6IjY2NTZhNTE0LWNjZjYtNDY4MC04ZGIyLWFlMGU1Y2M5MjJlMyJ9.igSnvjtRrYPiMwYP-IFqlzWY6L0EPzHY69Azn6v5hd0",
  "access_expires_at": "2026-10-29T15:07:29.662157304Z",
  "refresh_token": "WrvAlErqSp-tydnGGCbI9L_ABCJv_FCclRjZki89XhY",
  "refresh_expires_at": "2026-11-28T14:52:29.66096534Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8edd44b-7bd4-40a8-86d3-da1c5b7de80a",
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
  "id": "f8f32a9c-18e1-441a-8403-989666c761eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:57:30.041906Z",
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
  "command_id": "45210225-5647-49ba-8401-9aba3b74e276",
  "quote_id": "f8f32a9c-18e1-441a-8403-989666c761eb",
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
  "id": "0e3bf446-40bc-487f-8d63-4e77743eb7b7",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91eb3a13-d7a5-4b8c-85a5-a55e24b4d420",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:52:30.445593Z",
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
    "id": "fecc6d0b-512a-4625-b3bc-2466d8cb243c",
    "order_id": "0e3bf446-40bc-487f-8d63-4e77743eb7b7",
    "expires_at": "2026-10-29T14:52:45.457475Z",
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

`POST /api/driver/v1/offers/fecc6d0b-512a-4625-b3bc-2466d8cb243c/accept` → **200**

```json
{
  "command_id": "f9f3c18f-8242-468c-bebd-f750f9d4378b"
}
```

```json
{
  "id": "634f29f2-de09-470a-a2cc-7e7098e5b849",
  "order_id": "0e3bf446-40bc-487f-8d63-4e77743eb7b7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fecc7543-10fa-4d5d-8072-99eed0548db3",
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
  "command_id": "6b5f1965-dd37-412a-8ad6-a0aaa48c7eea",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:52:31.842329368Z"
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
  "id": "fecc7543-10fa-4d5d-8072-99eed0548db3",
  "order_id": "0e3bf446-40bc-487f-8d63-4e77743eb7b7",
  "assignment_id": "634f29f2-de09-470a-a2cc-7e7098e5b849",
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

`POST /api/driver/v1/work-sessions/039c0490-5ab0-47c3-ab5c-101c2e450280/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:32Z",
    "sequence": 1793285552819
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "039c0490-5ab0-47c3-ab5c-101c2e450280",
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
  "last_heartbeat_at": "2026-10-29T14:52:32.851058Z",
  "last_location_at": "2026-10-29T14:52:32.851058Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fecc7543-10fa-4d5d-8072-99eed0548db3/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3dfc2a5b-f5fb-4783-9a26-ea76c4d49537",
  "expected_version": 0
}
```

```json
{
  "id": "fecc7543-10fa-4d5d-8072-99eed0548db3",
  "order_id": "0e3bf446-40bc-487f-8d63-4e77743eb7b7",
  "assignment_id": "634f29f2-de09-470a-a2cc-7e7098e5b849",
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
  "arrived_at": "2026-10-29T14:52:33.192123Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fecc7543-10fa-4d5d-8072-99eed0548db3/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5980867f-7ef9-4a45-8573-a58f4c8dcc15",
  "expected_version": 1
}
```

```json
{
  "id": "fecc7543-10fa-4d5d-8072-99eed0548db3",
  "order_id": "0e3bf446-40bc-487f-8d63-4e77743eb7b7",
  "assignment_id": "634f29f2-de09-470a-a2cc-7e7098e5b849",
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
  "arrived_at": "2026-10-29T14:52:33.192123Z",
  "started_at": "2026-10-29T14:52:33.523408Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fecc7543-10fa-4d5d-8072-99eed0548db3/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "bc4a6bc8-d945-4891-a30c-7421bb6b719b",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:52:33Z",
  "cash_received": true
}
```

```json
{
  "id": "fecc7543-10fa-4d5d-8072-99eed0548db3",
  "order_id": "0e3bf446-40bc-487f-8d63-4e77743eb7b7",
  "assignment_id": "634f29f2-de09-470a-a2cc-7e7098e5b849",
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
  "arrived_at": "2026-10-29T14:52:33.192123Z",
  "started_at": "2026-10-29T14:52:33.523408Z",
  "completed_at": "2026-10-29T14:52:33.856174Z",
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
  "session_id": "039c0490-5ab0-47c3-ab5c-101c2e450280",
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
  "last_heartbeat_at": "2026-10-29T14:52:32.851058Z",
  "last_location_at": "2026-10-29T14:52:32.851058Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/039c0490-5ab0-47c3-ab5c-101c2e450280/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3cc0bb8c-cb7f-48ae-a27d-21133383c5b2",
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
  "command_id": "15f461c2-19f2-4764-9755-19d0139be0ef",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:34Z",
    "sequence": 1793285554815
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
  "correlation_id": "714efad3-9a22-410f-92c9-38ccb852d02a",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "c0c82d18-2614-4efe-b091-9bfc75254b38",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:35Z",
    "sequence": 1793285555163
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3daa72c-2083-4b73-b606-324a848117a3",
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
  "last_heartbeat_at": "2026-10-29T14:52:35.188591Z",
  "last_location_at": "2026-10-29T14:52:35.188591Z",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:52:31.842329Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e65b09d5-3826-4912-aa37-f9265ad60e21",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:52:35.814713517Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3daa72c-2083-4b73-b606-324a848117a3",
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
  "last_heartbeat_at": "2026-10-29T14:52:35.188591Z",
  "last_location_at": "2026-10-29T14:52:35.188591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3daa72c-2083-4b73-b606-324a848117a3/close` → **200**

```json
{
  "command_id": "bc53e6d9-d1a7-4435-8d4b-ffe72f483e4b",
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
  "session_id": "d7364cb2-8367-484b-bdb5-d22e254e41b6",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NTcsImlhdCI6MTc5MzI4NTU1NywianRpIjoiNjEyOTQ2ZTgtNmVkZC00MzgxLTkzMGQtNGEyNWUzMzhhYmY5Iiwic2lkIjoiZDczNjRjYjItODM2Ny00ODRiLWJkYjUtZDIyZTI1NGU0MWI2In0.vuwsgQRUWO7ajH55ssO4WUuv3dMLUeZ8Yh8YSlccp88",
  "access_expires_at": "2026-10-29T15:07:37.098791281Z",
  "refresh_token": "LSRZ-dkNTUO7hqMi84Rl6mgKMGrlgy5xkcZjhvKMo6U",
  "refresh_expires_at": "2026-10-30T02:52:37.097726475Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "2fc01e1b-1dfc-4334-a08d-233651c59460",
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
  "id": "b5e50ce9-1fee-4080-adfb-b0280c57fa31",
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
  "created_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "created_at": "2026-10-29T14:52:37.426757Z",
  "updated_at": "2026-10-29T14:52:37.426757Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639718118",
  "device_ref": "sandbox-28840"
}
```

```json
{
  "challenge_id": "2d9cff51-ab12-4ffe-8ab6-dc83a799eb66",
  "expires_at": "2026-10-29T14:57:37.743491641Z",
  "resend_available_at": "2026-10-29T14:52:38.743491641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639718118` → **200**

```json
{
  "phone": "+380639718118",
  "audience": "CLIENT",
  "code": "123512",
  "sent_at": "2026-10-29T14:52:37.748226222Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d9cff51-ab12-4ffe-8ab6-dc83a799eb66",
  "code": "123512",
  "device_ref": "sandbox-28840"
}
```

```json
{
  "session_id": "bb9a9e36-8c11-49dd-87e3-496c58a5d2c0",
  "subject": {
    "type": "CLIENT",
    "id": "2625b8ba-57ec-477c-a7c0-5be03d6f33db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNjI1YjhiYS01N2VjLTQ3N2MtYTdjMC01YmUwM2Q2ZjMzZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NDU4LCJpYXQiOjE3OTMyODU1NTgsImp0aSI6IjdmZDY4YmQ5LTgzN2EtNGZlNy1hNDg5LTllODBiYjc5MWE4ZSIsInNpZCI6ImJiOWE5ZTM2LThjMTEtNDlkZC04N2UzLTQ5NmM1OGE1ZDJjMCJ9.kjjMY9Qz21XMzH7QQ9au0Dr2CPBZLFeeDthZAU2sP-A",
  "access_expires_at": "2026-10-29T15:07:38.093104699Z",
  "refresh_token": "tt5csWeTN8-0_c65UR4qh99H_fnDyrC12eBqssJjuoE",
  "refresh_expires_at": "2026-11-28T14:52:38.092167804Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380639718118` → **200**

```json
{
  "client_id": "2625b8ba-57ec-477c-a7c0-5be03d6f33db"
}
```

`POST /api/admin/v1/rider-wallets/2625b8ba-57ec-477c-a7c0-5be03d6f33db/top-ups` → **201**

```json
{
  "command_id": "457c9011-1462-4cda-9254-6a581a51def6",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "2625b8ba-57ec-477c-a7c0-5be03d6f33db",
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
      "id": "65fc0914-5daa-40cc-8ffc-ad540fc69cc6",
      "at": "2026-10-29T14:52:38.724775Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bb951567-2530-4935-9b03-171ce6d0d6d1",
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
  "id": "77fa9575-af0e-4b3e-9319-7eed9c518dec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:57:39.078305Z",
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
      "id": "b5e50ce9-1fee-4080-adfb-b0280c57fa31",
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
  "device_ref": "sandbox-31676"
}
```

```json
{
  "challenge_id": "6d7251f8-f802-4201-9cb2-4de8f52e2789",
  "expires_at": "2026-10-29T14:57:39.410089872Z",
  "resend_available_at": "2026-10-29T14:52:40.410089872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "576630",
  "sent_at": "2026-10-29T14:52:39.414953969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d7251f8-f802-4201-9cb2-4de8f52e2789",
  "code": "576630",
  "device_ref": "sandbox-31676"
}
```

```json
{
  "session_id": "2e73d899-9ef1-4ca3-b0e0-0d63dad68722",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ1OSwiaWF0IjoxNzkzMjg1NTU5LCJqdGkiOiI4NDFkNTY0Zi1iZThiLTQ1YTUtYWFlMS0xY2NjMzA3ZWVkNWIiLCJzaWQiOiIyZTczZDg5OS05ZWYxLTRjYTMtYjBlMC0wZDYzZGFkNjg3MjIifQ.n15CgYEddU81g0CmEE3mt8y0BjQRpVtCGjSApCVdos8",
  "access_expires_at": "2026-10-29T15:07:39.74263011Z",
  "refresh_token": "x4MF8cTVseyG0tt1T0OoyTGWaQct_mVgiBbCi22qSu4",
  "refresh_expires_at": "2026-11-28T14:52:39.741743547Z",
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
  "command_id": "85146057-9b50-41f8-bc8f-f29041975fe8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:40Z",
    "sequence": 1793285560334
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "64f7d126-3835-4c9c-a140-750a5b400654",
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
  "last_heartbeat_at": "2026-10-29T14:52:40.356947Z",
  "last_location_at": "2026-10-29T14:52:40.356947Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ef6178e3-3357-406c-b5f1-9c0f1982eb15",
  "quote_id": "77fa9575-af0e-4b3e-9319-7eed9c518dec",
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
  "id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2625b8ba-57ec-477c-a7c0-5be03d6f33db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:52:40.67031Z",
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
  "client_id": "2625b8ba-57ec-477c-a7c0-5be03d6f33db",
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
      "id": "65fc0914-5daa-40cc-8ffc-ad540fc69cc6",
      "at": "2026-10-29T14:52:38.724775Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
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
    "id": "ece0852a-642d-488b-8f06-03348b74e18b",
    "order_id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f",
    "expires_at": "2026-10-29T14:52:55.680381Z",
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

`POST /api/driver/v1/offers/ece0852a-642d-488b-8f06-03348b74e18b/accept` → **200**

```json
{
  "command_id": "d4c36513-e146-4d3a-89d1-5bf587c932e5"
}
```

```json
{
  "id": "6c97ada6-2c47-402b-8ab4-c764fe9d3a6a",
  "order_id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9ba14cd1-8f42-4ef8-bddd-888461c669df",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9ba14cd1-8f42-4ef8-bddd-888461c669df",
  "order_id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f",
  "assignment_id": "6c97ada6-2c47-402b-8ab4-c764fe9d3a6a",
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

`POST /api/driver/v1/work-sessions/64f7d126-3835-4c9c-a140-750a5b400654/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:42Z",
    "sequence": 1793285562264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "64f7d126-3835-4c9c-a140-750a5b400654",
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
  "last_heartbeat_at": "2026-10-29T14:52:42.28857Z",
  "last_location_at": "2026-10-29T14:52:42.28857Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9ba14cd1-8f42-4ef8-bddd-888461c669df/arrive` → **200**

```json
{
  "command_id": "39fe7207-bab1-4496-a1fa-7d32620c5ebc",
  "expected_version": 0
}
```

```json
{
  "id": "9ba14cd1-8f42-4ef8-bddd-888461c669df",
  "order_id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f",
  "assignment_id": "6c97ada6-2c47-402b-8ab4-c764fe9d3a6a",
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
  "arrived_at": "2026-10-29T14:52:42.618748Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9ba14cd1-8f42-4ef8-bddd-888461c669df/start` → **200**

```json
{
  "command_id": "1a6b4341-e1a4-481a-8bb1-de09b418e118",
  "expected_version": 1
}
```

```json
{
  "id": "9ba14cd1-8f42-4ef8-bddd-888461c669df",
  "order_id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f",
  "assignment_id": "6c97ada6-2c47-402b-8ab4-c764fe9d3a6a",
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
  "arrived_at": "2026-10-29T14:52:42.618748Z",
  "started_at": "2026-10-29T14:52:42.953999Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9ba14cd1-8f42-4ef8-bddd-888461c669df/complete` → **200**

```json
{
  "command_id": "3c64053c-811c-4a8e-a77a-d40f47034d55",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:52:43Z",
  "cash_received": true
}
```

```json
{
  "id": "9ba14cd1-8f42-4ef8-bddd-888461c669df",
  "order_id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f",
  "assignment_id": "6c97ada6-2c47-402b-8ab4-c764fe9d3a6a",
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
  "arrived_at": "2026-10-29T14:52:42.618748Z",
  "started_at": "2026-10-29T14:52:42.953999Z",
  "completed_at": "2026-10-29T14:52:43.309836Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2625b8ba-57ec-477c-a7c0-5be03d6f33db",
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
      "id": "0a27cad6-d55c-45b8-bc3d-fe94d6321894",
      "at": "2026-10-29T14:52:43.979613Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f"
    },
    {
      "id": "65fc0914-5daa-40cc-8ffc-ad540fc69cc6",
      "at": "2026-10-29T14:52:38.724775Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/b5e50ce9-1fee-4080-adfb-b0280c57fa31/archive` → **200**

```json
{
  "command_id": "660006fa-1171-494b-b4f4-1f519f8f56c8",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "b5e50ce9-1fee-4080-adfb-b0280c57fa31",
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
  "created_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "created_at": "2026-10-29T14:52:37.426757Z",
  "updated_at": "2026-10-29T14:52:46.984576Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "64f7d126-3835-4c9c-a140-750a5b400654",
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
  "last_heartbeat_at": "2026-10-29T14:52:42.28857Z",
  "last_location_at": "2026-10-29T14:52:42.28857Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/64f7d126-3835-4c9c-a140-750a5b400654/close` → **200**

```json
{
  "command_id": "11fbecce-4d59-4936-aff1-61a9b1a4110a",
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

Done: order 8e7abf05-b08d-4fcd-94cb-f765a0b08a9f.

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
  "session_id": "37df8f28-b3a5-4643-bad6-0abfad719ba4",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NjgsImlhdCI6MTc5MzI4NTU2OCwianRpIjoiNDZkODljYWEtNzg4Zi00ZjU5LWExYTMtYWVjMjZmMjgxYzEyIiwic2lkIjoiMzdkZjhmMjgtYjNhNS00NjQzLWJhZDYtMGFiZmFkNzE5YmE0In0._qL99VA8E3nTzOgpTaIrjsv09rvy_VPSJ_q6hM2CWpM",
  "access_expires_at": "2026-10-29T15:07:48.245547991Z",
  "refresh_token": "c8BaY43nrWEt6qaVYX84KBfKeVJsxEJyOh5YJQmaIZw",
  "refresh_expires_at": "2026-10-30T02:52:48.244563947Z",
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
  "command_id": "10ef76d3-25a5-474f-98e6-901080a47795",
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
  "session_id": "88981ca7-f009-4187-900a-3efa2f8398b7",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NjksImlhdCI6MTc5MzI4NTU2OSwianRpIjoiNWI4NzZkMDItNDcxMy00ZGM3LWI1MWMtZGY5OWQ2NDQ1NTRiIiwic2lkIjoiODg5ODFjYTctZjAwOS00MTg3LTkwMGEtM2VmYTJmODM5OGI3In0.dNL1hx8lYNq0FN8VEUOj5Iav0E-RDOxr_aurYPAbaIg",
  "access_expires_at": "2026-10-29T15:07:49.467556357Z",
  "refresh_token": "QYK6Uzc6nm5DvH-UyTHpjQXtJqKItJuY59yBO29YImU",
  "refresh_expires_at": "2026-10-30T02:52:49.466651551Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1557417847",
    "linkedid": "1730052700.1557417847",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677692260"
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
    "id": "1730052700.1557417847",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "c3724540-698d-4900-8fd4-043cf49d4cfd",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677692260",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:52:49.790948Z",
      "answered_at": null,
      "ended_at": "2026-10-29T14:52:49.820418Z",
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
    "id": "1730052600.2105922884",
    "linkedid": "1730052600.2105922884",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677692260"
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
      "id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677692260",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:52:50.186713Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/d13ac396-1126-41f3-a9fc-6513bbd25ee0/answer` → **200**

```json
{
  "command_id": "54ef6106-e4c8-4370-8588-71629f1cccd8"
}
```

```json
{
  "id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677692260",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "order_ids": [],
  "started_at": "2026-10-29T14:52:50.186713Z",
  "answered_at": "2026-10-29T14:52:50.539109Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2105922884",
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
    "id": "1730052600.2105922884",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677692260",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:50.186713Z",
      "answered_at": "2026-10-29T14:52:50.539109Z",
      "ended_at": "2026-10-29T14:52:50.868465Z",
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
      "id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677692260",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:50.186713Z",
      "answered_at": "2026-10-29T14:52:50.539109Z",
      "ended_at": "2026-10-29T14:52:50.868465Z",
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
      "id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677692260",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:50.186713Z",
      "answered_at": "2026-10-29T14:52:50.539109Z",
      "ended_at": "2026-10-29T14:52:50.868465Z",
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
      "id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677692260",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:50.186713Z",
      "answered_at": "2026-10-29T14:52:50.539109Z",
      "ended_at": "2026-10-29T14:52:50.868465Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:52:56.625466Z"
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
      "id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677692260",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:50.186713Z",
      "answered_at": "2026-10-29T14:52:50.539109Z",
      "ended_at": "2026-10-29T14:52:50.868465Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:52:56.625466Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/d13ac396-1126-41f3-a9fc-6513bbd25ee0/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/d13ac396-1126-41f3-a9fc-6513bbd25ee0/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=d13ac396-1126-41f3-a9fc-6513bbd25ee0` → **200**

```json
{
  "changes": [
    {
      "id": "7df3e683-f791-451d-84b6-1c065be72bc7",
      "occurred_at": "2026-10-29T14:52:58.513327Z",
      "actor_type": "STAFF",
      "actor_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"fa3319eb-8860-48bc-b4df-716f7006c0de\", \"order_ids\": []}",
      "correlation_id": "f47b3928-f755-45b6-aeb1-3b6db78735d8"
    },
    {
      "id": "3cb3f07b-3d82-4f03-9b8f-610ccaf1c15b",
      "occurred_at": "2026-10-29T14:52:58.476054Z",
      "actor_type": "STAFF",
      "actor_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"fa3319eb-8860-48bc-b4df-716f7006c0de\", \"order_ids\": []}",
      "correlation_id": "9fb45138-182e-40d6-afca-6d49c4fa8712"
    }
  ]
}
```

Done: call d13ac396-1126-41f3-a9fc-6513bbd25ee0 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18276"
}
```

```json
{
  "challenge_id": "a76892fa-edea-494e-9654-bac2d7cdbff0",
  "expires_at": "2026-10-29T14:57:58.869281892Z",
  "resend_available_at": "2026-10-29T14:52:59.869281892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "046401",
  "sent_at": "2026-10-29T14:52:58.874906354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a76892fa-edea-494e-9654-bac2d7cdbff0",
  "code": "046401",
  "device_ref": "sandbox-18276"
}
```

```json
{
  "session_id": "0b1c67d8-67bf-4cf6-bbfe-8292a5af65fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ3OSwiaWF0IjoxNzkzMjg1NTc5LCJqdGkiOiI1YWVmOTNjNC01OWQ2LTRlMmItOWJjNS02ZDY3YzAxOWUwODQiLCJzaWQiOiIwYjFjNjdkOC02N2JmLTRjZjYtYmJmZS04MjkyYTVhZjY1ZmIifQ.9t5rhxzHXBYzFwuZRs1DIF9pUWgSwxuZJJltKUUf_z8",
  "access_expires_at": "2026-10-29T15:07:59.215621525Z",
  "refresh_token": "9fRhSCP2I7-ASnXfcC2-EKSw32V8WYhggALeog8BmEM",
  "refresh_expires_at": "2026-11-28T14:52:59.214911015Z",
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
  "command_id": "4c364de6-160c-478b-8cdd-611b4d0e4f5e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:59Z",
    "sequence": 1793285579808
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "84dc8085-8005-44f3-8383-a43ab015b6ec",
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
  "last_heartbeat_at": "2026-10-29T14:52:59.832947Z",
  "last_location_at": "2026-10-29T14:52:59.832947Z",
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
  "session_id": "6a53843b-c5c2-48fa-a9ed-c29cd79de890",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0ODAsImlhdCI6MTc5MzI4NTU4MCwianRpIjoiYjgxYWM0Y2MtYzViNC00YzgwLWE2NjctODYwNTRlNThiNzRkIiwic2lkIjoiNmE1Mzg0M2ItYzVjMi00OGZhLWE5ZWQtYzI5Y2Q3OWRlODkwIn0.X1ZKlrJ1i19OncSC1Im6eozdSrdMgZ7yw2dGlh0iHrg",
  "access_expires_at": "2026-10-29T15:08:00.452151366Z",
  "refresh_token": "UK8eOsbvMYQV16QnxQwvkwFMTeww3h93f7m-hnbnZoA",
  "refresh_expires_at": "2026-10-30T02:53:00.451460571Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0d3c6dc4-c454-43de-9a6a-4537ccb8dd33",
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
  "id": "f16b037b-c959-47dd-9c29-87c23a9818ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:00.745899Z",
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
  "command_id": "d243b7f1-493e-437e-b437-b9f96e13dc12",
  "quote_id": "f16b037b-c959-47dd-9c29-87c23a9818ab",
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
    "phone": "+380676574715"
  }
}
```

```json
{
  "id": "e5329273-6d04-4f59-8720-502afd4b8dda",
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
  "created_at": "2026-10-29T14:53:01.099464Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676574715"
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
    "id": "0644a6ca-92b2-499a-993e-f013e82c3cd7",
    "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
    "expires_at": "2026-10-29T14:53:16.104957Z",
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

`POST /api/driver/v1/offers/0644a6ca-92b2-499a-993e-f013e82c3cd7/accept` → **200**

```json
{
  "command_id": "70e46088-157d-4d61-9aef-411ea6079f85"
}
```

```json
{
  "id": "9cd34082-7c7c-48a6-bd07-c25c9ead5cde",
  "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8a5a6bd3-5052-4ae0-89ac-908c006497e6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676574715` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676574715` → **200**

```json
[
  {
    "phone": "+380676574715",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:02.918880125Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676574715` → **200**

```json
[
  {
    "phone": "+380676574715",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:02.918880125Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676574715` → **200**

```json
[
  {
    "phone": "+380676574715",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:02.918880125Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8a5a6bd3-5052-4ae0-89ac-908c006497e6",
  "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
  "assignment_id": "9cd34082-7c7c-48a6-bd07-c25c9ead5cde",
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
    "phone": "+380676574715"
  }
}
```

`POST /api/driver/v1/work-sessions/84dc8085-8005-44f3-8383-a43ab015b6ec/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:03Z",
    "sequence": 1793285583478
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "84dc8085-8005-44f3-8383-a43ab015b6ec",
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
  "last_heartbeat_at": "2026-10-29T14:53:03.502985Z",
  "last_location_at": "2026-10-29T14:53:03.502985Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8a5a6bd3-5052-4ae0-89ac-908c006497e6/arrive` → **200**

```json
{
  "command_id": "801d1113-d294-4158-8520-9e4a86ff6369",
  "expected_version": 0
}
```

```json
{
  "id": "8a5a6bd3-5052-4ae0-89ac-908c006497e6",
  "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
  "assignment_id": "9cd34082-7c7c-48a6-bd07-c25c9ead5cde",
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
  "arrived_at": "2026-10-29T14:53:03.813397Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676574715"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676574715` → **200**

```json
[
  {
    "phone": "+380676574715",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:02.918880125Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676574715` → **200**

```json
[
  {
    "phone": "+380676574715",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:02.918880125Z"
  },
  {
    "phone": "+380676574715",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:04.928370847Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676574715` → **200**

```json
[
  {
    "phone": "+380676574715",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:02.918880125Z"
  },
  {
    "phone": "+380676574715",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:04.928370847Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676574715` → **200**

```json
[
  {
    "phone": "+380676574715",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:02.918880125Z"
  },
  {
    "phone": "+380676574715",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:53:04.928370847Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/8a5a6bd3-5052-4ae0-89ac-908c006497e6/start` → **200**

```json
{
  "command_id": "0b6cb9a3-06a4-4873-87ef-024c1c836559",
  "expected_version": 1
}
```

```json
{
  "id": "8a5a6bd3-5052-4ae0-89ac-908c006497e6",
  "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
  "assignment_id": "9cd34082-7c7c-48a6-bd07-c25c9ead5cde",
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
  "arrived_at": "2026-10-29T14:53:03.813397Z",
  "started_at": "2026-10-29T14:53:05.271534Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676574715"
  }
}
```

`POST /api/driver/v1/trips/8a5a6bd3-5052-4ae0-89ac-908c006497e6/complete` → **200**

```json
{
  "command_id": "dea67a31-edce-4c0d-a147-4828d8d79b46",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:53:05Z",
  "cash_received": true
}
```

```json
{
  "id": "8a5a6bd3-5052-4ae0-89ac-908c006497e6",
  "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
  "assignment_id": "9cd34082-7c7c-48a6-bd07-c25c9ead5cde",
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
  "arrived_at": "2026-10-29T14:53:03.813397Z",
  "started_at": "2026-10-29T14:53:05.271534Z",
  "completed_at": "2026-10-29T14:53:05.596883Z",
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
  "session_id": "84dc8085-8005-44f3-8383-a43ab015b6ec",
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
  "last_heartbeat_at": "2026-10-29T14:53:03.502985Z",
  "last_location_at": "2026-10-29T14:53:03.502985Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/84dc8085-8005-44f3-8383-a43ab015b6ec/close` → **200**

```json
{
  "command_id": "0f811c08-814f-471d-8b8a-cb57d0f11900",
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
  "phone": "+380632296679",
  "device_ref": "sandbox-7081"
}
```

```json
{
  "challenge_id": "25f45e89-adc0-45ac-a088-22273880295f",
  "expires_at": "2026-10-29T14:58:06.565431345Z",
  "resend_available_at": "2026-10-29T14:53:07.565431345Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632296679` → **200**

```json
{
  "phone": "+380632296679",
  "audience": "CLIENT",
  "code": "508772",
  "sent_at": "2026-10-29T14:53:06.571044014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25f45e89-adc0-45ac-a088-22273880295f",
  "code": "508772",
  "device_ref": "sandbox-7081"
}
```

```json
{
  "session_id": "83f54494-9b87-45d2-b3fe-2ec678c78278",
  "subject": {
    "type": "CLIENT",
    "id": "8499a131-f2c9-4cb3-bf26-d3b6e03c6734"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDk5YTEzMS1mMmM5LTRjYjMtYmYyNi1kM2I2ZTAzYzY3MzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NDg2LCJpYXQiOjE3OTMyODU1ODYsImp0aSI6Ijc3NDdkNjIyLWQ2MmUtNDAxYy04YjAwLWUwNjZiMDZlODY3NyIsInNpZCI6IjgzZjU0NDk0LTliODctNDVkMi1iM2ZlLTJlYzY3OGM3ODI3OCJ9.oiZzDQvm0hgjpZ8mlwSzJgcZTMtG8yvRdBJrtZqJm9s",
  "access_expires_at": "2026-10-29T15:08:06.921173969Z",
  "refresh_token": "p_0Hnp-gxx4YoDP8Pgsw89w1-jJVgpkXYI29ym2slwg",
  "refresh_expires_at": "2026-11-28T14:53:06.920449044Z",
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
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
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
  "device_ref": "sandbox-31909"
}
```

```json
{
  "challenge_id": "f6583a76-c331-4b7f-8590-c6b01fd4a49c",
  "expires_at": "2026-10-29T14:58:07.53143313Z",
  "resend_available_at": "2026-10-29T14:53:08.53143313Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "861938",
  "sent_at": "2026-10-29T14:53:07.535091245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6583a76-c331-4b7f-8590-c6b01fd4a49c",
  "code": "861938",
  "device_ref": "sandbox-31909"
}
```

```json
{
  "session_id": "d6388a94-a2f7-4d0a-afde-792102a63d4a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ4NywiaWF0IjoxNzkzMjg1NTg3LCJqdGkiOiIwNjJlMWZmYS03ZDhjLTQ2ZmYtODRkMy1iMDJkZTIzODg2ZWIiLCJzaWQiOiJkNjM4OGE5NC1hMmY3LTRkMGEtYWZkZS03OTIxMDJhNjNkNGEifQ.NhuSUerE1TWyvkmFwtf9Tv2ecJ2IPEHBoYBc0Asf-iA",
  "access_expires_at": "2026-10-29T15:08:07.87111417Z",
  "refresh_token": "xQU5baTLLJ9v2NdXxst5JUkSgkvUe_U97icCCJ35tbM",
  "refresh_expires_at": "2026-11-28T14:53:07.870395212Z",
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
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
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
  "session_id": "26b48669-ed01-44d2-887b-72d30aa0f4b6",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0ODgsImlhdCI6MTc5MzI4NTU4OCwianRpIjoiOWJmMjA5ZWUtZTVlMC00NjM2LTk1YjAtNjFjNzNmYjllODFiIiwic2lkIjoiMjZiNDg2NjktZWQwMS00NGQyLTg4N2ItNzJkMzBhYTBmNGI2In0.4rhfwNRFHrOzk4QXl2vFm4GnrQWoGakbCCWpkeOtTjQ",
  "access_expires_at": "2026-10-29T15:08:08.758672749Z",
  "refresh_token": "_SyLw65y36tSUJaUTCgIjzFPyfRyQhkozCtCxzTHvbU",
  "refresh_expires_at": "2026-10-30T02:53:08.758105438Z",
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
  "session_id": "57a3cbc3-55f4-4a8b-ae7e-12884bbe43d2",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0ODksImlhdCI6MTc5MzI4NTU4OSwianRpIjoiNjEwYWMzZTAtZjczYy00NGJmLWI4MjgtOGRlNTE2Zjc2MDM0Iiwic2lkIjoiNTdhM2NiYzMtNTVmNC00YThiLWFlN2UtMTI4ODRiYmU0M2QyIn0.lXtUGFkF0P1CIBz7nebA1tDSfAjGEHiq-FHnEuFSM_4",
  "access_expires_at": "2026-10-29T15:08:09.360877223Z",
  "refresh_token": "FiOzeSMvTSnIbr_sKRFAzIFruEJW2_vvxi3L9Ya1xrM",
  "refresh_expires_at": "2026-10-30T02:53:09.360285524Z",
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
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek",
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
  "command_id": "e716d82c-7a0d-4529-b456-d7db60eb3e6f",
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
  "id": "21f3411d-a0c6-4805-93e6-a9041ad1791c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:09.964165Z",
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
  "command_id": "6b7aafbf-d7bd-4d4e-b15a-2ebbc2d9efa3",
  "quote_id": "21f3411d-a0c6-4805-93e6-a9041ad1791c",
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
  "id": "4cb56ac4-cdd3-4538-9d1a-b2cb36db6aed",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8499a131-f2c9-4cb3-bf26-d3b6e03c6734",
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
  "created_at": "2026-10-29T14:53:10.278704Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4cb56ac4-cdd3-4538-9d1a-b2cb36db6aed` → **200**

```json
{
  "id": "4cb56ac4-cdd3-4538-9d1a-b2cb36db6aed",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8499a131-f2c9-4cb3-bf26-d3b6e03c6734",
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
  "created_at": "2026-10-29T14:53:10.278704Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4cb56ac4-cdd3-4538-9d1a-b2cb36db6aed/cancel` → **200**

```json
{
  "command_id": "674d387a-04d3-40e1-b406-f657f63222b1",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "4cb56ac4-cdd3-4538-9d1a-b2cb36db6aed",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8499a131-f2c9-4cb3-bf26-d3b6e03c6734",
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
  "created_at": "2026-10-29T14:53:10.278704Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
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
  "command_id": "8a5e8f0e-0225-488d-be87-47c1c7ccb1c3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:11Z",
    "sequence": 1793285591528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1f31b09-35f7-4edb-9efc-df7facd076a3",
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
  "last_heartbeat_at": "2026-10-29T14:53:11.550385Z",
  "last_location_at": "2026-10-29T14:53:11.550385Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10331"
}
```

```json
{
  "challenge_id": "8f854390-5176-417f-88f7-aaffa5365377",
  "expires_at": "2026-10-29T14:58:11.84591965Z",
  "resend_available_at": "2026-10-29T14:53:12.84591965Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "119751",
  "sent_at": "2026-10-29T14:53:11.849352757Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f854390-5176-417f-88f7-aaffa5365377",
  "code": "119751",
  "device_ref": "sandbox-10331"
}
```

```json
{
  "session_id": "e3f84e64-f052-410f-8ec8-411c4a99191d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ5MiwiaWF0IjoxNzkzMjg1NTkyLCJqdGkiOiJkMTJmOTIxZS02MGExLTQ5YjgtYTg5MC1hZDkxZjFiMjMyNmQiLCJzaWQiOiJlM2Y4NGU2NC1mMDUyLTQxMGYtOGVjOC00MTFjNGE5OTE5MWQifQ.H1nSodlQJZ6GmIGzxFtbe3njPCgPykycEyiKic5qiLs",
  "access_expires_at": "2026-10-29T15:08:12.175663448Z",
  "refresh_token": "i2fROi9WGx_q_aVrCunNfv49IvpWL3pcB5BIWKmOfq8",
  "refresh_expires_at": "2026-11-28T14:53:12.175058634Z",
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
  "command_id": "a667e90d-9fea-4888-aa9e-07917de9c886",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:12Z",
    "sequence": 1793285592769
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1978a225-b350-41b1-98f7-6517dd2138f0",
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
  "last_heartbeat_at": "2026-10-29T14:53:12.791891Z",
  "last_location_at": "2026-10-29T14:53:12.791891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "981fe764-81b8-4412-93a6-12989f3a7735",
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
  "id": "8c58b4d5-be06-447a-8c95-4fdf1527dc78",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:13.129498Z",
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
  "command_id": "ec6c1410-49f6-4915-a009-9e90f62b9c5c",
  "quote_id": "8c58b4d5-be06-447a-8c95-4fdf1527dc78",
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
  "id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8499a131-f2c9-4cb3-bf26-d3b6e03c6734",
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
  "created_at": "2026-10-29T14:53:13.449393Z",
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
    "id": "db6ec13b-2631-40e8-becf-4b206e33d51d",
    "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
    "expires_at": "2026-10-29T14:53:28.454032Z",
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

`POST /api/driver/v1/offers/db6ec13b-2631-40e8-becf-4b206e33d51d/accept` → **200**

```json
{
  "command_id": "76299aae-8ae7-4a1a-9934-efe8e5ce6740"
}
```

```json
{
  "id": "678e308a-61ae-42ec-a9a5-8607867cde06",
  "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "83e5558c-b4f1-4f93-9227-19a39b7fe5b8",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "83e5558c-b4f1-4f93-9227-19a39b7fe5b8",
  "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
  "assignment_id": "678e308a-61ae-42ec-a9a5-8607867cde06",
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

`POST /api/driver/v1/trips/83e5558c-b4f1-4f93-9227-19a39b7fe5b8/cancel` → **200**

```json
{
  "command_id": "644d8fc3-0db3-4960-850d-fb6db9ab149e",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "83e5558c-b4f1-4f93-9227-19a39b7fe5b8",
  "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
  "assignment_id": "678e308a-61ae-42ec-a9a5-8607867cde06",
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

`GET /api/rider/v1/orders/94e51abe-4e8e-47f1-b94b-feda5f461a57` → **200**

```json
{
  "id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8499a131-f2c9-4cb3-bf26-d3b6e03c6734",
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
    "id": "678e308a-61ae-42ec-a9a5-8607867cde06",
    "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "83e5558c-b4f1-4f93-9227-19a39b7fe5b8",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:53:13.449393Z",
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
    "id": "33b99400-6809-4117-8e82-7881f5e018c6",
    "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
    "expires_at": "2026-10-29T14:53:29.707748Z",
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

`POST /api/driver/v1/offers/33b99400-6809-4117-8e82-7881f5e018c6/accept` → **200**

```json
{
  "command_id": "a6a30898-58b6-45a6-9c91-a177917f6c35"
}
```

```json
{
  "id": "60c9dc70-6b4f-41db-8fd2-ca57e3ad77ce",
  "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2c57a8e0-780b-4c9d-ac24-2dd0f75f41a3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2c57a8e0-780b-4c9d-ac24-2dd0f75f41a3",
  "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
  "assignment_id": "60c9dc70-6b4f-41db-8fd2-ca57e3ad77ce",
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

`POST /api/driver/v1/trips/2c57a8e0-780b-4c9d-ac24-2dd0f75f41a3/cancel` → **200**

```json
{
  "command_id": "ddf3e4fa-9824-4ed0-ab8f-26160e1f2780",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "2c57a8e0-780b-4c9d-ac24-2dd0f75f41a3",
  "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
  "assignment_id": "60c9dc70-6b4f-41db-8fd2-ca57e3ad77ce",
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
    "id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:53:13.449393Z",
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
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "4cb56ac4-cdd3-4538-9d1a-b2cb36db6aed",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:53:10.278704Z",
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
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/94e51abe-4e8e-47f1-b94b-feda5f461a57/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:53:13.450283Z",
      "actor": {
        "type": "CLIENT",
        "id": "8499a131-f2c9-4cb3-bf26-d3b6e03c6734",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
        "quote_id": "8c58b4d5-be06-447a-8c95-4fdf1527dc78",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "6c0d7112-c08b-4628-88d0-51060953a1cf"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:53:13.452896Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
        "attempt_id": "9c37325f-48c0-495d-b27a-5e204f60bf12",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6c0d7112-c08b-4628-88d0-51060953a1cf"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:53:13.460785Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "db6ec13b-2631-40e8-becf-4b206e33d51d",
        "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "6c0d7112-c08b-4628-88d0-51060953a1cf"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:53:14.084561Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "db6ec13b-2631-40e8-becf-4b206e33d51d",
        "order_id": "94e51abe-4e8e-47f1-b94b-feda5f461a57",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "678e308a-61ae-42ec-a9a5-8607867cde06"
      },
      "correlation_id": "1317f158-8a29-4ec0-8119-9335e67a4fa9"
```

Done: orders 4cb56ac4-cdd3-4538-9d1a-b2cb36db6aed, 94e51abe-4e8e-47f1-b94b-feda5f461a57.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734773116",
  "device_ref": "sandbox-14055"
}
```

```json
{
  "challenge_id": "95fa915f-45ac-40d2-b65d-43d46ad724e1",
  "expires_at": "2026-10-29T14:58:17.246845901Z",
  "resend_available_at": "2026-10-29T14:53:18.246845901Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734773116` → **200**

```json
{
  "phone": "+380734773116",
  "audience": "CLIENT",
  "code": "047059",
  "sent_at": "2026-10-29T14:53:17.250442651Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95fa915f-45ac-40d2-b65d-43d46ad724e1",
  "code": "047059",
  "device_ref": "sandbox-14055"
}
```

```json
{
  "session_id": "02a16566-550f-4b27-ac0c-9c1595cd4ec1",
  "subject": {
    "type": "CLIENT",
    "id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGQ0ZTk0Mi0xYWU2LTQ1NjYtOGQwMi0xY2U1NmRlMWM1ZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NDk3LCJpYXQiOjE3OTMyODU1OTcsImp0aSI6IjAxNTIxZmQ5LTA5N2MtNGI0ZC1iMWQ2LTk5YjA5NzkwMjIzOCIsInNpZCI6IjAyYTE2NTY2LTU1MGYtNGIyNy1hYzBjLTljMTU5NWNkNGVjMSJ9.wmuS4g1xBDZYcKRRuJieACEvxTrS94FFKaITtR7rXEw",
  "access_expires_at": "2026-10-29T15:08:17.569183202Z",
  "refresh_token": "hpeiiHgS4YQM1mU2fiNtvAOFC41Didbl-4F3fN_VOOA",
  "refresh_expires_at": "2026-11-28T14:53:17.568498289Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "414d62a0-cf33-43e3-847b-f250dc3b5884",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "429b364c-144c-4fa3-b1ae-c7c7d1f4e5f1",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-429b364c-144c-4fa3-b1ae-c7c7d1f4e5f1",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a6bb23dcd62cb7dfa6094f544c4f9dc9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=429b364c-144c-4fa3-b1ae-c7c7d1f4e5f1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734773116"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=429b364c-144c-4fa3-b1ae-c7c7d1f4e5f1",
  "expires_at": "2026-10-29T15:23:17.873272Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/429b364c-144c-4fa3-b1ae-c7c7d1f4e5f1` → **200**

```json
{
  "id": "429b364c-144c-4fa3-b1ae-c7c7d1f4e5f1",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:23:17.873272Z",
  "card": {
    "id": "e0995f8c-c262-43cf-bd2b-86771e99e43c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5347",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:53:18.20145Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e0995f8c-c262-43cf-bd2b-86771e99e43c",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5347",
      "card_type": "Visa",
      "created_at": "2026-10-29T14:53:18.20145Z"
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
  "device_ref": "sandbox-923"
}
```

```json
{
  "challenge_id": "33c76f69-956f-485d-b938-e30a277ab737",
  "expires_at": "2026-10-29T14:58:18.815726494Z",
  "resend_available_at": "2026-10-29T14:53:19.815726494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "224593",
  "sent_at": "2026-10-29T14:53:18.819690494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33c76f69-956f-485d-b938-e30a277ab737",
  "code": "224593",
  "device_ref": "sandbox-923"
}
```

```json
{
  "session_id": "3c9a6f79-d91c-4d1d-a10b-f8dbc0e4f9de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ5OSwiaWF0IjoxNzkzMjg1NTk5LCJqdGkiOiI3NTY4ZDFlYi04NTQ4LTQzOWMtYWE4MS03ZTAyNDdjZGMyZTkiLCJzaWQiOiIzYzlhNmY3OS1kOTFjLTRkMWQtYTEwYi1mOGRiYzBlNGY5ZGUifQ.OaCxzRWMqhR-_Ppuf7XwEiHlsUHU5hIZSvKXzHa2Cn0",
  "access_expires_at": "2026-10-29T15:08:19.168236164Z",
  "refresh_token": "qbIrycizPyaLdh4I5V-JOaPhkMddfeb4bTJRg3Yk55s",
  "refresh_expires_at": "2026-11-28T14:53:19.167595713Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1978a225-b350-41b1-98f7-6517dd2138f0",
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
  "last_heartbeat_at": "2026-10-29T14:53:12.791891Z",
  "last_location_at": "2026-10-29T14:53:12.791891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1978a225-b350-41b1-98f7-6517dd2138f0/handover` → **200**

```json
{
  "command_id": "02070cf4-8615-4aa3-8001-1ed1dd6b9786",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1978a225-b350-41b1-98f7-6517dd2138f0",
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
  "last_heartbeat_at": "2026-10-29T14:53:12.791891Z",
  "last_location_at": "2026-10-29T14:53:12.791891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1978a225-b350-41b1-98f7-6517dd2138f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:20Z",
    "sequence": 1793285600682
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1978a225-b350-41b1-98f7-6517dd2138f0",
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
  "last_heartbeat_at": "2026-10-29T14:53:20.089483Z",
  "last_location_at": "2026-10-29T14:53:20.089483Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f95b67a2-70f1-44c6-920d-f7b597f6e360",
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
  "id": "21dec7b0-8054-4893-a04d-f810fe4b3df0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:20.402199Z",
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
  "command_id": "8957134a-2e0a-4471-934a-2149bdb563e5",
  "quote_id": "21dec7b0-8054-4893-a04d-f810fe4b3df0",
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
  "id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
  "created_at": "2026-10-29T14:53:20.7272Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9` → **200**

```json
{
  "id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
  "created_at": "2026-10-29T14:53:20.7272Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9` → **200**

```json
{
  "id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
  "created_at": "2026-10-29T14:53:20.7272Z",
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
    "id": "ca545475-5518-4ed9-aae7-8a5f911c06db",
    "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
    "expires_at": "2026-10-29T14:53:36.311292Z",
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

`POST /api/driver/v1/offers/ca545475-5518-4ed9-aae7-8a5f911c06db/accept` → **200**

```json
{
  "command_id": "4bf8a182-d067-4f2a-996c-0510f98b6121"
}
```

```json
{
  "id": "ceab6103-cdb2-4f16-af20-114442e1e099",
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e047ba41-9afa-4a0a-afa2-e715f88a1fcb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e047ba41-9afa-4a0a-afa2-e715f88a1fcb",
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "assignment_id": "ceab6103-cdb2-4f16-af20-114442e1e099",
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

`POST /api/driver/v1/work-sessions/1978a225-b350-41b1-98f7-6517dd2138f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:23Z",
    "sequence": 1793285603607
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1978a225-b350-41b1-98f7-6517dd2138f0",
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
  "last_heartbeat_at": "2026-10-29T14:53:23.627147Z",
  "last_location_at": "2026-10-29T14:53:23.627147Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e047ba41-9afa-4a0a-afa2-e715f88a1fcb/arrive` → **200**

```json
{
  "command_id": "36f70b10-5488-42ec-a2c7-5d298b067d56",
  "expected_version": 0
}
```

```json
{
  "id": "e047ba41-9afa-4a0a-afa2-e715f88a1fcb",
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "assignment_id": "ceab6103-cdb2-4f16-af20-114442e1e099",
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
  "arrived_at": "2026-10-29T14:53:23.934441Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e047ba41-9afa-4a0a-afa2-e715f88a1fcb/start` → **200**

```json
{
  "command_id": "14aa1cb0-d690-4902-98af-66c3a9d1bc53",
  "expected_version": 1
}
```

```json
{
  "id": "e047ba41-9afa-4a0a-afa2-e715f88a1fcb",
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "assignment_id": "ceab6103-cdb2-4f16-af20-114442e1e099",
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
  "arrived_at": "2026-10-29T14:53:23.934441Z",
  "started_at": "2026-10-29T14:53:24.251501Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e047ba41-9afa-4a0a-afa2-e715f88a1fcb/complete` → **200**

```json
{
  "command_id": "6fa53d93-ce27-4678-9e40-116e1ebb436c",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:53:24Z",
  "cash_received": true
}
```

```json
{
  "id": "e047ba41-9afa-4a0a-afa2-e715f88a1fcb",
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "assignment_id": "ceab6103-cdb2-4f16-af20-114442e1e099",
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
  "arrived_at": "2026-10-29T14:53:23.934441Z",
  "started_at": "2026-10-29T14:53:24.251501Z",
  "completed_at": "2026-10-29T14:53:24.579085Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9` → **200**

```json
{
  "id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
    "id": "ceab6103-cdb2-4f16-af20-114442e1e099",
    "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e047ba41-9afa-4a0a-afa2-e715f88a1fcb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:20.7272Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9` → **200**

```json
{
  "id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
    "id": "ceab6103-cdb2-4f16-af20-114442e1e099",
    "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e047ba41-9afa-4a0a-afa2-e715f88a1fcb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:20.7272Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9` → **200**

```json
{
  "id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
    "id": "ceab6103-cdb2-4f16-af20-114442e1e099",
    "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e047ba41-9afa-4a0a-afa2-e715f88a1fcb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:20.7272Z",
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

`GET /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9/tip` → **200**

```json
{
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
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
  "available_until": "2026-10-30T14:53:24.579085Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9/tip` → **201**

```json
{
  "command_id": "e236899a-f4e3-4413-8462-43dab27e9ac4",
  "amount_minor": 2500
}
```

```json
{
  "id": "465cf4ce-349e-40c1-8c75-bbf6b619910b",
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:53:28.469359Z"
}
```

`GET /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9/tip` → **200**

```json
{
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
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
  "available_until": "2026-10-30T14:53:24.579085Z",
  "open": false,
  "tip": {
    "id": "465cf4ce-349e-40c1-8c75-bbf6b619910b",
    "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T14:53:28.469359Z"
  }
}
```

`GET /api/rider/v1/orders/4bedb65a-afbb-4df9-b5af-0fc8193f36f9/tip` → **200**

```json
{
  "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
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
  "available_until": "2026-10-30T14:53:24.579085Z",
  "open": false,
  "tip": {
    "id": "465cf4ce-349e-40c1-8c75-bbf6b619910b",
    "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:53:28.469359Z"
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
      "id": "be9f4955-ff9b-4c2c-beb2-6b26c99e259c",
      "at": "2026-10-29T14:53:25.361037Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
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
      "id": "5a506c06-3291-426d-ad8b-9ae79fc4c98c",
      "at": "2026-10-29T14:53:30.427096Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
      "counterpart_id": null
    },
    {
      "id": "be9f4955-ff9b-4c2c-beb2-6b26c99e259c",
      "at": "2026-10-29T14:53:25.361037Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77bc5b46-69d5-4416-9a74-0737b5189d09",
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
  "id": "d5ef4c15-d892-43bc-9ce5-d6d14e1a5f3c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:32.029476Z",
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
  "session_id": "55162943-9c65-44cf-9160-aa61d95f3719",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1MTIsImlhdCI6MTc5MzI4NTYxMiwianRpIjoiYTk4MTM3MjYtZjYxOS00NGMyLWJiOTAtMDFhNjdmZDk2NDk0Iiwic2lkIjoiNTUxNjI5NDMtOWM2NS00NGNmLTkxNjAtYWE2MWQ5NWYzNzE5In0.cPXfEeVpEhgUMfEnx1r5JiawRjIOd8Pz5NAaRY1Jw5E",
  "access_expires_at": "2026-10-29T15:08:32.63779285Z",
  "refresh_token": "99le2ETn8zvizFXoy7pY0AxoCOquSo4aN5CLNJHsqmY",
  "refresh_expires_at": "2026-10-30T02:53:32.637160809Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734773116` → **200**

```json
{
  "client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb"
}
```

`POST /api/admin/v1/rider-wallets/8dd4e942-1ae6-4566-8d02-1ce56de1c5eb/top-ups` → **201**

```json
{
  "command_id": "b4610f49-8c97-4739-a728-dacdd27b797a",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
      "id": "0e7d12aa-beff-40f0-90f2-e3fe2aaa06c3",
      "at": "2026-10-29T14:53:33.234685Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "52bbdb09-45fb-4ebd-afcc-172cf0e11d96",
  "quote_id": "d5ef4c15-d892-43bc-9ce5-d6d14e1a5f3c",
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
  "id": "1e06002c-266a-4bae-8db7-b00731e64869",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
  "created_at": "2026-10-29T14:53:33.554842Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1e06002c-266a-4bae-8db7-b00731e64869` → **200**

```json
{
  "id": "1e06002c-266a-4bae-8db7-b00731e64869",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
  "created_at": "2026-10-29T14:53:33.554842Z",
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
    "id": "48dfe732-35e2-48fa-9f0e-6b4f2444e420",
    "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
    "expires_at": "2026-10-29T14:53:48.559906Z",
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

`POST /api/driver/v1/offers/48dfe732-35e2-48fa-9f0e-6b4f2444e420/accept` → **200**

```json
{
  "command_id": "6a10fb58-6e87-4568-a032-92924eaed8da"
}
```

```json
{
  "id": "4bf7ac66-1038-49ed-9d45-9fb71540bab8",
  "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "72952295-c8aa-4d26-b5fb-5c843ec232de",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "72952295-c8aa-4d26-b5fb-5c843ec232de",
  "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
  "assignment_id": "4bf7ac66-1038-49ed-9d45-9fb71540bab8",
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

`POST /api/driver/v1/work-sessions/1978a225-b350-41b1-98f7-6517dd2138f0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:35Z",
    "sequence": 1793285615696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1978a225-b350-41b1-98f7-6517dd2138f0",
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
  "last_heartbeat_at": "2026-10-29T14:53:35.089672Z",
  "last_location_at": "2026-10-29T14:53:35.089672Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/72952295-c8aa-4d26-b5fb-5c843ec232de/arrive` → **200**

```json
{
  "command_id": "c4cd7848-74b3-4850-8bae-e046e45dbd33",
  "expected_version": 0
}
```

```json
{
  "id": "72952295-c8aa-4d26-b5fb-5c843ec232de",
  "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
  "assignment_id": "4bf7ac66-1038-49ed-9d45-9fb71540bab8",
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
  "arrived_at": "2026-10-29T14:53:35.399384Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/72952295-c8aa-4d26-b5fb-5c843ec232de/start` → **200**

```json
{
  "command_id": "ad22df5f-675e-4e4d-b05b-060ae07da32e",
  "expected_version": 1
}
```

```json
{
  "id": "72952295-c8aa-4d26-b5fb-5c843ec232de",
  "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
  "assignment_id": "4bf7ac66-1038-49ed-9d45-9fb71540bab8",
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
  "arrived_at": "2026-10-29T14:53:35.399384Z",
  "started_at": "2026-10-29T14:53:35.719735Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/72952295-c8aa-4d26-b5fb-5c843ec232de/complete` → **200**

```json
{
  "command_id": "f38ca128-1296-4c75-9a86-27422dcc229e",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:53:36Z",
  "cash_received": true
}
```

```json
{
  "id": "72952295-c8aa-4d26-b5fb-5c843ec232de",
  "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
  "assignment_id": "4bf7ac66-1038-49ed-9d45-9fb71540bab8",
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
  "arrived_at": "2026-10-29T14:53:35.399384Z",
  "started_at": "2026-10-29T14:53:35.719735Z",
  "completed_at": "2026-10-29T14:53:36.034479Z",
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
  "client_id": "8dd4e942-1ae6-4566-8d02-1ce56de1c5eb",
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
      "id": "0e7d12aa-beff-40f0-90f2-e3fe2aaa06c3",
      "at": "2026-10-29T14:53:33.234685Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
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

`GET /api/rider/v1/orders/1e06002c-266a-4bae-8db7-b00731e64869/tip` → **200**

```json
{
  "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
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
  "available_until": "2026-10-30T14:53:36.034479Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1e06002c-266a-4bae-8db7-b00731e64869/tip` → **201**

```json
{
  "command_id": "63e0ed43-0e04-483c-bb0c-2fc77cbd1beb",
  "amount_minor": 2500
}
```

```json
{
  "id": "7ebb4c54-682f-40b5-9f1e-3131cd1858cb",
  "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:53:37.255176Z"
}
```

`GET /api/rider/v1/orders/1e06002c-266a-4bae-8db7-b00731e64869/tip` → **200**

```json
{
  "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
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
  "available_until": "2026-10-30T14:53:36.034479Z",
  "open": false,
  "tip": {
    "id": "7ebb4c54-682f-40b5-9f1e-3131cd1858cb",
    "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:53:37.255176Z"
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
      "id": "1464c81d-c304-48ad-8278-bc021c6ab540",
      "at": "2026-10-29T14:53:36.50768Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
      "counterpart_id": null
    },
    {
      "id": "5a506c06-3291-426d-ad8b-9ae79fc4c98c",
      "at": "2026-10-29T14:53:30.427096Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
      "counterpart_id": null
    },
    {
      "id": "be9f4955-ff9b-4c2c-beb2-6b26c99e259c",
      "at": "2026-10-29T14:53:25.361037Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
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
      "id": "8bc2a456-0acc-4fd1-9b7d-bd103fdc06ac",
      "at": "2026-10-29T14:53:38.544958Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
      "counterpart_id": null
    },
    {
      "id": "1464c81d-c304-48ad-8278-bc021c6ab540",
      "at": "2026-10-29T14:53:36.50768Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1e06002c-266a-4bae-8db7-b00731e64869",
      "counterpart_id": null
    },
    {
      "id": "5a506c06-3291-426d-ad8b-9ae79fc4c98c",
      "at": "2026-10-29T14:53:30.427096Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
      "counterpart_id": null
    },
    {
      "id": "be9f4955-ff9b-4c2c-beb2-6b26c99e259c",
      "at": "2026-10-29T14:53:25.361037Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "4bedb65a-afbb-4df9-b5af-0fc8193f36f9",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1978a225-b350-41b1-98f7-6517dd2138f0",
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
  "last_heartbeat_at": "2026-10-29T14:53:35.089672Z",
  "last_location_at": "2026-10-29T14:53:35.089672Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1978a225-b350-41b1-98f7-6517dd2138f0/close` → **200**

```json
{
  "command_id": "ace209f2-7cd8-417a-84d8-4e863cc77fb2",
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

Done: card order 1e06002c-266a-4bae-8db7-b00731e64869.

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
  "phone": "+380733649512",
  "device_ref": "sandbox-15167"
}
```

```json
{
  "challenge_id": "2c441a8c-bbd2-44b6-8331-33dcb82925a0",
  "expires_at": "2026-10-29T14:58:40.387378413Z",
  "resend_available_at": "2026-10-29T14:53:41.387378413Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733649512` → **200**

```json
{
  "phone": "+380733649512",
  "audience": "CLIENT",
  "code": "858106",
  "sent_at": "2026-10-29T14:53:40.390703058Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c441a8c-bbd2-44b6-8331-33dcb82925a0",
  "code": "858106",
  "device_ref": "sandbox-15167"
}
```

```json
{
  "session_id": "2682a540-6f4a-4449-bf1d-b3f3cabe6a82",
  "subject": {
    "type": "CLIENT",
    "id": "90e4fac9-af46-4082-9238-b695a6cd8f58"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MGU0ZmFjOS1hZjQ2LTQwODItOTIzOC1iNjk1YTZjZDhmNTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTIwLCJpYXQiOjE3OTMyODU2MjAsImp0aSI6IjNiYTQzODRkLWJjYzQtNGE3ZS1iMThlLTMwNTM0NjBmNTAwYyIsInNpZCI6IjI2ODJhNTQwLTZmNGEtNDQ0OS1iZjFkLWIzZjNjYWJlNmE4MiJ9.EbRwxXKN7TGHnn-4Phvgf-DVk1rlSLIvt6gOkNBy6Mw",
  "access_expires_at": "2026-10-29T15:08:40.711477374Z",
  "refresh_token": "K3oqBON9POOWrz3J3t2IT65FBjWKM0zsMsEqUtr2Teo",
  "refresh_expires_at": "2026-11-28T14:53:40.710788554Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "58d33d32-acd0-4a42-b33a-9734e8032436",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "9dcb012a-c609-4e9e-9a37-487a36cc8565",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9dcb012a-c609-4e9e-9a37-487a36cc8565",
    "orderDate": "1793285621",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "9ad93a95de66703d839fbf808816cfa8",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9dcb012a-c609-4e9e-9a37-487a36cc8565",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733649512"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9dcb012a-c609-4e9e-9a37-487a36cc8565",
  "created_at": "2026-10-29T14:53:41.029567Z",
  "expires_at": "2026-10-29T15:23:41.029567Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/9dcb012a-c609-4e9e-9a37-487a36cc8565` → **200**

```json
{
  "id": "9dcb012a-c609-4e9e-9a37-487a36cc8565",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:53:41.029567Z",
  "expires_at": "2026-10-29T15:23:41.029567Z",
  "completed_at": "2026-10-29T14:53:41.355083Z",
  "masked_pan": "41****0409",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "90e4fac9-af46-4082-9238-b695a6cd8f58",
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
      "id": "c66fe857-ff81-4271-b8dd-ba1dd68099d1",
      "at": "2026-10-29T14:53:41.575914Z",
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
  "client_id": "90e4fac9-af46-4082-9238-b695a6cd8f58",
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
      "id": "c66fe857-ff81-4271-b8dd-ba1dd68099d1",
      "at": "2026-10-29T14:53:41.575914Z",
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
  "device_ref": "sandbox-8169"
}
```

```json
{
  "challenge_id": "e6404884-cdb2-41fd-9112-58de3c317be1",
  "expires_at": "2026-10-29T14:58:42.311178881Z",
  "resend_available_at": "2026-10-29T14:53:43.311178881Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "772001",
  "sent_at": "2026-10-29T14:53:42.315892829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6404884-cdb2-41fd-9112-58de3c317be1",
  "code": "772001",
  "device_ref": "sandbox-8169"
}
```

```json
{
  "session_id": "59293153-f383-4919-9d54-b636c96626b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjUyMiwiaWF0IjoxNzkzMjg1NjIyLCJqdGkiOiI1ZWZmZjNmYS01NjJhLTQ0MGQtYTBlOC1iZmRjNjZkMDA1ZmEiLCJzaWQiOiI1OTI5MzE1My1mMzgzLTQ5MTktOWQ1NC1iNjM2Yzk2NjI2YjQifQ.V4T_TBNkEN_IdxU_EHtN-Spox2kH6uafABgEyMpDpr4",
  "access_expires_at": "2026-10-29T15:08:42.640709849Z",
  "refresh_token": "4Pn0BlJnuX2mFKupTmglx4GM_AI1C1i2ZJieZM2g1YY",
  "refresh_expires_at": "2026-11-28T14:53:42.640155009Z",
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
  "command_id": "af97c5a9-e639-40f7-bc8c-a7b8cf4a8ddf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "4899a9f5-3f4a-4627-8d81-9eadfc870d00",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4899a9f5-3f4a-4627-8d81-9eadfc870d00",
    "orderDate": "1793285623",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "e6ce917b2415c3db2ec614c45aadb1ca",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4899a9f5-3f4a-4627-8d81-9eadfc870d00",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4899a9f5-3f4a-4627-8d81-9eadfc870d00",
  "created_at": "2026-10-29T14:53:43.244747Z",
  "expires_at": "2026-10-29T15:23:43.244747Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/4899a9f5-3f4a-4627-8d81-9eadfc870d00` → **200**

```json
{
  "id": "4899a9f5-3f4a-4627-8d81-9eadfc870d00",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:53:43.244747Z",
  "expires_at": "2026-10-29T15:23:43.244747Z",
  "completed_at": "2026-10-29T14:53:43.559427Z",
  "masked_pan": "41****7529",
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
      "id": "bb87afd9-7196-4e1e-9c7f-2ab76e98ea57",
      "at": "2026-10-29T14:53:43.586285Z",
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
  "command_id": "ef054c10-c16e-4209-9547-dedf6e8a8d17",
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
  "correlation_id": "c1dbd739-5128-4710-9ea8-eeb09aae648a"
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
  "device_ref": "sandbox-3320"
}
```

```json
{
  "challenge_id": "03b32894-56e5-4d3e-91f1-376569aa589d",
  "expires_at": "2026-10-29T14:58:44.505742775Z",
  "resend_available_at": "2026-10-29T14:53:45.505742775Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "011894",
  "sent_at": "2026-10-29T14:53:44.521981536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03b32894-56e5-4d3e-91f1-376569aa589d",
  "code": "011894",
  "device_ref": "sandbox-3320"
}
```

```json
{
  "session_id": "1b9afef5-6377-4d48-950a-29943ed2a3e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjUyNCwiaWF0IjoxNzkzMjg1NjI0LCJqdGkiOiJiMGU5YTM0YS05YWUzLTQzZGMtYWQ3My04ZWVlMjQ5ZTQ5ZTAiLCJzaWQiOiIxYjlhZmVmNS02Mzc3LTRkNDgtOTUwYS0yOTk0M2VkMmEzZTUifQ.Nppu8Ffea3Rqno4J6E7yNELDRWIFWbj0qHHDthQM-Q4",
  "access_expires_at": "2026-10-29T15:08:44.854839835Z",
  "refresh_token": "VbFgZWKiSGBapzsvO82jOrXMNUrHAUHFOmsou4eZy4o",
  "refresh_expires_at": "2026-11-28T14:53:44.854226304Z",
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
  "command_id": "be72c5e2-e660-4aeb-8b12-652972ca0836",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:45Z",
    "sequence": 1793285625459
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d2976b6-1366-4104-986f-9ad8c7cf9421",
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
  "last_heartbeat_at": "2026-10-29T14:53:45.479496Z",
  "last_location_at": "2026-10-29T14:53:45.479496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636805559",
  "device_ref": "sandbox-25369"
}
```

```json
{
  "challenge_id": "700ab22a-99f7-4ec6-9e91-0d51a42f754a",
  "expires_at": "2026-10-29T14:58:45.778717687Z",
  "resend_available_at": "2026-10-29T14:53:46.778717687Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636805559` → **200**

```json
{
  "phone": "+380636805559",
  "audience": "CLIENT",
  "code": "732139",
  "sent_at": "2026-10-29T14:53:45.782097219Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "700ab22a-99f7-4ec6-9e91-0d51a42f754a",
  "code": "732139",
  "device_ref": "sandbox-25369"
}
```

```json
{
  "session_id": "d8ff7fc3-5a5d-4612-bc88-374bdd5f1c82",
  "subject": {
    "type": "CLIENT",
    "id": "15165eb2-7303-4c00-aedc-e92642d4f895"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTE2NWViMi03MzAzLTRjMDAtYWVkYy1lOTI2NDJkNGY4OTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTI2LCJpYXQiOjE3OTMyODU2MjYsImp0aSI6IjAwMGFjMGE2LTZjNzgtNGQ1Yi05NDFkLTJlNWY4NTg4YzBmYyIsInNpZCI6ImQ4ZmY3ZmMzLTVhNWQtNDYxMi1iYzg4LTM3NGJkZDVmMWM4MiJ9.ShXIy9kKLouppJlQ85iljx_sQoDjhSO0oz0KQB-5jls",
  "access_expires_at": "2026-10-29T15:08:46.121767591Z",
  "refresh_token": "3CuqfglvYJkXBkhh9SGJhDpwBoV-heuIvtetZOumUww",
  "refresh_expires_at": "2026-11-28T14:53:46.121045684Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1de073e3-6aae-4b3f-afc3-7b7712c42b15",
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
  "id": "56749bdd-48af-4f57-8c65-17788601a6ee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:46.449753Z",
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
  "command_id": "70ec823a-c2ec-41b6-a1fc-650f8b1b8e6b",
  "quote_id": "56749bdd-48af-4f57-8c65-17788601a6ee",
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
  "id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15165eb2-7303-4c00-aedc-e92642d4f895",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:53:46.806997Z",
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
    "id": "00b4bb3b-1b21-468a-815a-e91a0cf79c54",
    "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
    "expires_at": "2026-10-29T14:54:01.811031Z",
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

`POST /api/driver/v1/offers/00b4bb3b-1b21-468a-815a-e91a0cf79c54/accept` → **200**

```json
{
  "command_id": "9c3ea3a8-c555-4963-bde4-fbb07a0218b6"
}
```

```json
{
  "id": "bb14e3d9-006e-4f8f-ae0e-e1a2be224e04",
  "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "51cd4685-48d5-4b7b-b503-896614f6002c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "51cd4685-48d5-4b7b-b503-896614f6002c",
  "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
  "assignment_id": "bb14e3d9-006e-4f8f-ae0e-e1a2be224e04",
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

`POST /api/driver/v1/work-sessions/8d2976b6-1366-4104-986f-9ad8c7cf9421/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:48Z",
    "sequence": 1793285628552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d2976b6-1366-4104-986f-9ad8c7cf9421",
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
  "last_heartbeat_at": "2026-10-29T14:53:48.076992Z",
  "last_location_at": "2026-10-29T14:53:48.076992Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/51cd4685-48d5-4b7b-b503-896614f6002c/arrive` → **200**

```json
{
  "command_id": "6fb6c1df-c3cd-40cb-bf83-4ab556a6047d",
  "expected_version": 0
}
```

```json
{
  "id": "51cd4685-48d5-4b7b-b503-896614f6002c",
  "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
  "assignment_id": "bb14e3d9-006e-4f8f-ae0e-e1a2be224e04",
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
  "arrived_at": "2026-10-29T14:53:48.382486Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/51cd4685-48d5-4b7b-b503-896614f6002c/start` → **200**

```json
{
  "command_id": "df85cc0e-a7b5-4590-90f3-5d94fb161a28",
  "expected_version": 1
}
```

```json
{
  "id": "51cd4685-48d5-4b7b-b503-896614f6002c",
  "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
  "assignment_id": "bb14e3d9-006e-4f8f-ae0e-e1a2be224e04",
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
  "arrived_at": "2026-10-29T14:53:48.382486Z",
  "started_at": "2026-10-29T14:53:48.710542Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/51cd4685-48d5-4b7b-b503-896614f6002c/complete` → **200**

```json
{
  "command_id": "3a80d1d5-51b3-4f4c-88f6-786046509ca6",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:53:49Z",
  "cash_received": false
}
```

```json
{
  "id": "51cd4685-48d5-4b7b-b503-896614f6002c",
  "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
  "assignment_id": "bb14e3d9-006e-4f8f-ae0e-e1a2be224e04",
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
  "arrived_at": "2026-10-29T14:53:48.382486Z",
  "started_at": "2026-10-29T14:53:48.710542Z",
  "completed_at": "2026-10-29T14:53:49.030512Z",
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
  "session_id": "d89097df-0413-4de4-8c68-44af9ef65906",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1MjksImlhdCI6MTc5MzI4NTYyOSwianRpIjoiMTM1ZTJkZjEtMjA3My00NmI0LWFhZjAtYzk4MWJlMzFjNzAwIiwic2lkIjoiZDg5MDk3ZGYtMDQxMy00ZGU0LThjNjgtNDRhZjllZjY1OTA2In0.NOfv1Tc9tCaGScelP-rY5PcLaknMukhnmqhgk5Oe27c",
  "access_expires_at": "2026-10-29T15:08:49.655497749Z",
  "refresh_token": "mCXAw3niEfeNmkMHtT3GsIx6JJe_9f43omqlF7giya8",
  "refresh_expires_at": "2026-10-30T02:53:49.653916646Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4/cash-dispute` → **200**

```json
{
  "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "15165eb2-7303-4c00-aedc-e92642d4f895",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:53:49.651327Z",
  "decide_by": "2026-11-12T14:53:49.651327Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T14:53:49.651327Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "15165eb2-7303-4c00-aedc-e92642d4f895",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T14:53:49.651327Z",
      "decide_by": "2026-11-12T14:53:49.651327Z",
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

`POST /api/admin/v1/orders/4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4/cash-dispute/decide` → **400**

```json
{
  "command_id": "6fb28476-d936-472a-b828-f9d3b8d9c0b8",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "db538ff7-f104-4c94-8f98-3615895b7d0b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4/cash-dispute/decide` → **200**

```json
{
  "command_id": "21ec096e-54f6-4af0-be72-fb79b45f1366",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "15165eb2-7303-4c00-aedc-e92642d4f895",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:53:49.651327Z",
  "decide_by": "2026-11-12T14:53:49.651327Z",
  "decision": "PAY_DRIVER",
  "decided_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T14:53:51.004112Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4/cash-dispute/decide` → **409**

```json
{
  "command_id": "3f11d0cf-a9db-4c57-ba2c-5184d92e8e5f",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bffdbec5-64e2-4d04-b787-e028f77894a5"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8d2976b6-1366-4104-986f-9ad8c7cf9421",
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
  "last_heartbeat_at": "2026-10-29T14:53:48.076992Z",
  "last_location_at": "2026-10-29T14:53:48.076992Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d2976b6-1366-4104-986f-9ad8c7cf9421/close` → **200**

```json
{
  "command_id": "48975c0b-c578-41a2-99af-4d9f558502e0",
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
  "phone": "+380733383816",
  "device_ref": "sandbox-31132"
}
```

```json
{
  "challenge_id": "154323d3-f257-4888-8f5f-ae29bf43d929",
  "expires_at": "2026-10-29T14:58:52.287274694Z",
  "resend_available_at": "2026-10-29T14:53:53.287274694Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733383816` → **200**

```json
{
  "phone": "+380733383816",
  "audience": "CLIENT",
  "code": "385520",
  "sent_at": "2026-10-29T14:53:52.290142132Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "154323d3-f257-4888-8f5f-ae29bf43d929",
  "code": "385520",
  "device_ref": "sandbox-31132"
}
```

```json
{
  "session_id": "37364459-2343-43c6-9493-b70048830079",
  "subject": {
    "type": "CLIENT",
    "id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOTFiM2NlZC1hZTBjLTQzNzMtYTBlZS1iNWJmMDY2MmEyYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTMyLCJpYXQiOjE3OTMyODU2MzIsImp0aSI6Ijg0MmNiNTE5LTY0MjktNDQ4ZC04MWY4LTZlZTNjY2YwNjhmOSIsInNpZCI6IjM3MzY0NDU5LTIzNDMtNDNjNi05NDkzLWI3MDA0ODgzMDA3OSJ9.jVmG0SKRcEyWJvEa-_vAa240pMKoxh_O9HoakZyfxrk",
  "access_expires_at": "2026-10-29T15:08:52.632936863Z",
  "refresh_token": "gbz7V5a-MagYaxoufdhZ0nTW8U5gaYjaqcnDYtLPDqo",
  "refresh_expires_at": "2026-11-28T14:53:52.632360532Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b271e0bb-0158-44ed-b09c-fe124e971e2c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "efd97f28-7233-43dd-bb1a-751d044f750f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-efd97f28-7233-43dd-bb1a-751d044f750f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "903802cb610e056797803344e80fc1ef",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=efd97f28-7233-43dd-bb1a-751d044f750f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733383816"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=efd97f28-7233-43dd-bb1a-751d044f750f",
  "expires_at": "2026-10-29T15:23:52.933401Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/efd97f28-7233-43dd-bb1a-751d044f750f` → **200**

```json
{
  "id": "efd97f28-7233-43dd-bb1a-751d044f750f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:23:52.933401Z",
  "card": {
    "id": "5088d63e-d0ec-478b-9284-1a3ef519eb81",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5799",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:53:53.239307Z"
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
  "device_ref": "sandbox-28600"
}
```

```json
{
  "challenge_id": "d926d2a1-be06-4c73-beb9-4014495f1354",
  "expires_at": "2026-10-29T14:58:53.592882863Z",
  "resend_available_at": "2026-10-29T14:53:54.592882863Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "144711",
  "sent_at": "2026-10-29T14:53:53.597277544Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d926d2a1-be06-4c73-beb9-4014495f1354",
  "code": "144711",
  "device_ref": "sandbox-28600"
}
```

```json
{
  "session_id": "426a6f98-9a5c-4c25-b9d8-6e8ced0893e0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjUzMywiaWF0IjoxNzkzMjg1NjMzLCJqdGkiOiIzZTU4NzAyZC1lMmZkLTRlNDUtYTBhOC1hZDEyZWQwYzJmOTQiLCJzaWQiOiI0MjZhNmY5OC05YTVjLTRjMjUtYjlkOC02ZThjZWQwODkzZTAifQ.EX3qopltMSR3c2id4rQ66q94F2eMW4y0mvlkyBqGi5U",
  "access_expires_at": "2026-10-29T15:08:53.926693585Z",
  "refresh_token": "LsjqDQfM_AxweVr4gSUZdMCm9IL_d_aOXAoQlrY6bKU",
  "refresh_expires_at": "2026-11-28T14:53:53.926063955Z",
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
  "command_id": "e012944a-e508-40dd-89b8-69c80cb52cf4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:54Z",
    "sequence": 1793285634534
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8ceaa0c5-30d1-4e29-bda0-6665782a4fa3",
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
  "last_heartbeat_at": "2026-10-29T14:53:54.555299Z",
  "last_location_at": "2026-10-29T14:53:54.555299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "60453f98-62e4-48b5-9fca-80d5aef51a7f",
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
  "id": "b8709706-f223-47d9-9600-2adcc60d1b0d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:54.879725Z",
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
  "command_id": "cda6ea8e-7173-4bd7-b240-5c7ed52dca87",
  "quote_id": "b8709706-f223-47d9-9600-2adcc60d1b0d",
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
  "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
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
  "created_at": "2026-10-29T14:53:55.222857Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880` → **200**

```json
{
  "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
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
  "created_at": "2026-10-29T14:53:55.222857Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880` → **200**

```json
{
  "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
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
  "created_at": "2026-10-29T14:53:55.222857Z",
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
    "id": "0c1369aa-e00f-4cdd-92f8-2fe0c9fd5428",
    "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
    "expires_at": "2026-10-29T14:54:10.704327Z",
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

`POST /api/driver/v1/offers/0c1369aa-e00f-4cdd-92f8-2fe0c9fd5428/accept` → **200**

```json
{
  "command_id": "f81b1644-d9d8-4759-a9e9-f24d20668cf7"
}
```

```json
{
  "id": "6ce5751e-00b8-4e9d-a78b-fee9d90bc32d",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b438bd9c-b39a-47d4-94c1-7267bd5d76f7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b438bd9c-b39a-47d4-94c1-7267bd5d76f7",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "assignment_id": "6ce5751e-00b8-4e9d-a78b-fee9d90bc32d",
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

`POST /api/rider/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/messages` → **201**

```json
{
  "command_id": "3fad9399-5763-4e50-8fe5-00f8fb0bc345",
  "body": "Я біля входу, мій номер +380733383816, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "d7ecdf9b-3451-4c26-9020-b573ee4241cb",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380733383816, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T14:53:58.099689686Z"
}
```

`POST /api/driver/v1/trips/b438bd9c-b39a-47d4-94c1-7267bd5d76f7/messages` → **201**

```json
{
  "command_id": "489ab726-a3ad-4715-a3d0-b4c124af9254",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "28c69bd2-1a37-44e7-8098-a4ca1bddd1fb",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T14:53:58.404702595Z"
}
```

`POST /api/driver/v1/work-sessions/8ceaa0c5-30d1-4e29-bda0-6665782a4fa3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:58Z",
    "sequence": 1793285638707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8ceaa0c5-30d1-4e29-bda0-6665782a4fa3",
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
  "last_heartbeat_at": "2026-10-29T14:53:58.727838Z",
  "last_location_at": "2026-10-29T14:53:58.727838Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b438bd9c-b39a-47d4-94c1-7267bd5d76f7/arrive` → **200**

```json
{
  "command_id": "188e7aaf-4967-4659-abbb-225b291e41e3",
  "expected_version": 0
}
```

```json
{
  "id": "b438bd9c-b39a-47d4-94c1-7267bd5d76f7",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "assignment_id": "6ce5751e-00b8-4e9d-a78b-fee9d90bc32d",
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
  "arrived_at": "2026-10-29T14:53:59.04139Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b438bd9c-b39a-47d4-94c1-7267bd5d76f7/start` → **200**

```json
{
  "command_id": "591de647-24cb-484a-b737-755a16e2d80b",
  "expected_version": 1
}
```

```json
{
  "id": "b438bd9c-b39a-47d4-94c1-7267bd5d76f7",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "assignment_id": "6ce5751e-00b8-4e9d-a78b-fee9d90bc32d",
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
  "arrived_at": "2026-10-29T14:53:59.04139Z",
  "started_at": "2026-10-29T14:53:59.370456Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8ceaa0c5-30d1-4e29-bda0-6665782a4fa3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:59Z",
    "sequence": 1793285639666
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8ceaa0c5-30d1-4e29-bda0-6665782a4fa3",
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
  "last_heartbeat_at": "2026-10-29T14:53:59.686504Z",
  "last_location_at": "2026-10-29T14:53:59.686504Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b438bd9c-b39a-47d4-94c1-7267bd5d76f7/complete` → **200**

```json
{
  "command_id": "0e8ec4e7-8d8e-46e3-9254-d72a80fa3d63",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:54:00Z",
  "cash_received": false
}
```

```json
{
  "id": "b438bd9c-b39a-47d4-94c1-7267bd5d76f7",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "assignment_id": "6ce5751e-00b8-4e9d-a78b-fee9d90bc32d",
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
  "arrived_at": "2026-10-29T14:53:59.04139Z",
  "started_at": "2026-10-29T14:53:59.370456Z",
  "completed_at": "2026-10-29T14:54:00.025497Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880` → **200**

```json
{
  "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
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
    "id": "6ce5751e-00b8-4e9d-a78b-fee9d90bc32d",
    "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b438bd9c-b39a-47d4-94c1-7267bd5d76f7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:55.222857Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880` → **200**

```json
{
  "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
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
    "id": "6ce5751e-00b8-4e9d-a78b-fee9d90bc32d",
    "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b438bd9c-b39a-47d4-94c1-7267bd5d76f7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:55.222857Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880` → **200**

```json
{
  "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
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
    "id": "6ce5751e-00b8-4e9d-a78b-fee9d90bc32d",
    "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b438bd9c-b39a-47d4-94c1-7267bd5d76f7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:55.222857Z",
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
  "session_id": "8ceaa0c5-30d1-4e29-bda0-6665782a4fa3",
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
  "last_heartbeat_at": "2026-10-29T14:53:59.686504Z",
  "last_location_at": "2026-10-29T14:53:59.686504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8ceaa0c5-30d1-4e29-bda0-6665782a4fa3/close` → **200**

```json
{
  "command_id": "288b6d0f-f7ba-4bc1-8b63-f8c4e9a2e0ba",
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
  "session_id": "8e3d3a7e-46d7-41d3-8676-398389411f29",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NDQsImlhdCI6MTc5MzI4NTY0NCwianRpIjoiNjgxNDA4MzUtMjkyZi00NzhjLWE1MjItMzcyYTY5YjYwMDBiIiwic2lkIjoiOGUzZDNhN2UtNDZkNy00MWQzLTg2NzYtMzk4Mzg5NDExZjI5In0.hjVOwOsT9fiy8Z1Kp4ghFVywNSFwh5SWf5bhoWaPdKA",
  "access_expires_at": "2026-10-29T15:09:04.210382855Z",
  "refresh_token": "dh4jFtuu_M68tE_VpT5EJjkRqiy3r8d6ihNbC98LQPE",
  "refresh_expires_at": "2026-10-30T02:54:04.209726614Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "80675b61-4291-417c-a25f-43c4d3df6def"
}
```

`GET /api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T14:54:04.802939396Z",
  "order": {
    "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
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
    "created_at": "2026-10-29T14:53:55.222857Z",
    "assigned_at": "2026-10-29T14:53:57.493466Z",
    "arrived_at": "2026-10-29T14:53:59.04139Z",
    "started_at": "2026-10-29T14:53:59.370456Z",
    "completed_at": "2026-10-29T14:54:00.025497Z"
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
    "id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
    "registered_at": "2026-10-29T14:53:52.629994Z",
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
      "created_at": "2026-10-29T14:53:55.225458Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T14:54:00.782639Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/chargebacks` → **422**

```json
{
  "command_id": "95c18638-85cd-4c06-aa36-fbf6b1ae3872",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "860c6947-7efa-4bac-affa-b14e15104c0f"
}
```

`POST /api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/chargebacks` → **201**

```json
{
  "command_id": "23808caf-5dce-4462-b940-5e020810e076",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "d43b8d4f-8144-4c69-a52a-b9a7f391f00c",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:54:05.504749Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/chargebacks` → **201**

```json
{
  "command_id": "23808caf-5dce-4462-b940-5e020810e076",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "d43b8d4f-8144-4c69-a52a-b9a7f391f00c",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:54:05.504749Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/b91b3ced-ae0c-4373-a0ee-b5bf0662a2af` → **200**

```json
{
  "client": {
    "id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
    "phone": "+380733383816",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:53:52.629994Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:53:55.222857Z",
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

`POST /api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/chargebacks/d43b8d4f-8144-4c69-a52a-b9a7f391f00c/resolve` → **200**

```json
{
  "command_id": "97803477-bd7f-4f02-9eb1-0159631e0e21",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "d43b8d4f-8144-4c69-a52a-b9a7f391f00c",
  "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T14:54:05.504749Z",
  "resolved_at": "2026-10-29T14:54:06.485541Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/b91b3ced-ae0c-4373-a0ee-b5bf0662a2af` → **200**

```json
{
  "client": {
    "id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
    "phone": "+380733383816",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:53:52.629994Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:53:55.222857Z",
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

`GET /api/admin/v1/clients/b91b3ced-ae0c-4373-a0ee-b5bf0662a2af` → **200**

```json
{
  "client": {
    "id": "b91b3ced-ae0c-4373-a0ee-b5bf0662a2af",
    "phone": "+380733383816",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:53:52.629994Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:53:55.222857Z",
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

`POST /api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/chargebacks/d43b8d4f-8144-4c69-a52a-b9a7f391f00c/resolve` → **409**

```json
{
  "command_id": "fbd0e3be-6ad6-4293-bc67-b52648ea3baf",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/chargebacks/d43b8d4f-8144-4c69-a52a-b9a7f391f00c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7844deaa-86aa-4b8b-b399-653005df1681"
}
```

`GET /api/admin/v1/orders/1bed3d52-3135-4c6b-a487-6a26d21d5880/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "d43b8d4f-8144-4c69-a52a-b9a7f391f00c",
      "order_id": "1bed3d52-3135-4c6b-a487-6a26d21d5880",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T14:54:05.504749Z",
      "resolved_at": "2026-10-29T14:54:06.485541Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 1bed3d52-3135-4c6b-a487-6a26d21d5880 without phone or card digits; chargeback d43b8d4f-8144-4c69-a52a-b9a7f391f00c recorded and won.

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
  "session_id": "5086ba3e-0c69-4345-b4b1-f65ea60aa232",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NDksImlhdCI6MTc5MzI4NTY0OSwianRpIjoiYTRjY2QzMjItZjRmMi00YWYwLTk3MDQtMmIxZjRhMWY0NGYxIiwic2lkIjoiNTA4NmJhM2UtMGM2OS00MzQ1LWI0YjEtZjY1ZWE2MGFhMjMyIn0.n3DsKYq_PQz2DGVi6cD9XPhAInY_IMQ25BEPTGkBIw8",
  "access_expires_at": "2026-10-29T15:09:09.73684455Z",
  "refresh_token": "2NCZBkos0aMevffBAw-ki-L9UmqfMCPWwTP71T73OLo",
  "refresh_expires_at": "2026-10-30T02:54:09.736294259Z",
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
  "phone": "+48600048136",
  "device_ref": "sandbox-5532"
}
```

```json
{
  "challenge_id": "62a3a6d1-f8ad-4e5e-9d0d-46b2e28974d2",
  "expires_at": "2026-10-29T14:59:10.666941614Z",
  "resend_available_at": "2026-10-29T14:54:11.666941614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600048136` → **200**

```json
{
  "phone": "+48600048136",
  "audience": "CLIENT",
  "code": "224588",
  "sent_at": "2026-10-29T14:54:10.669856856Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62a3a6d1-f8ad-4e5e-9d0d-46b2e28974d2",
  "code": "224588",
  "device_ref": "sandbox-5532"
}
```

```json
{
  "session_id": "894b1db8-4054-4a64-9def-239486af592d",
  "subject": {
    "type": "CLIENT",
    "id": "9b643a73-555a-457e-86b6-6ab1094997ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjY0M2E3My01NTVhLTQ1N2UtODZiNi02YWIxMDk0OTk3YWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTUxLCJpYXQiOjE3OTMyODU2NTEsImp0aSI6IjMyOGY5MzUwLWRlN2ItNDM0OC1iMTg2LWIxMDc5NGNmZDhlZiIsInNpZCI6Ijg5NGIxZGI4LTQwNTQtNGE2NC05ZGVmLTIzOTQ4NmFmNTkyZCJ9.48HNZsJ6RADOak1-n5c0OsApI52aGopcZgTYz5A3HAU",
  "access_expires_at": "2026-10-29T15:09:11.003095611Z",
  "refresh_token": "ln86cMCDCiu5KM-hv2wnthCW6Wcar4M37rdTtrMhbgk",
  "refresh_expires_at": "2026-11-28T14:54:11.002429452Z",
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
  "command_id": "ce35647b-c67c-4bd8-b46e-f1def6fad03f",
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
  "correlation_id": "8e65d6de-fe9f-473b-a527-7a8d072e2cf4",
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
  "command_id": "5d9cd341-4f5e-4961-a241-4a428fde41b7",
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
  "paused_at": "2026-10-29T14:54:12.237063105Z",
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
  "command_id": "38e1b61c-4dd2-4539-a6a4-879fbf992df8",
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
  "id": "09413dd6-9435-4a84-9ceb-104f2ed8a319",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:12.866261Z",
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
  "command_id": "da766e37-3221-4881-b120-db7cb726f4e1",
  "quote_id": "09413dd6-9435-4a84-9ceb-104f2ed8a319",
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
  "correlation_id": "bb4bb007-ee80-4a64-b8b6-36449354ba48"
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
  "paused_at": "2026-10-29T14:54:12.237063Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "b4432e72-213f-4212-a19a-f182e13b12a3",
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
  "command_id": "4bdd3f72-7da7-40d3-a9ba-e7470503660b",
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
  "command_id": "eadd864a-71b3-4ef6-93ca-89c80cbd4581",
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
  "id": "0ca77e55-f86c-4098-8044-f8d34c9f8c1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:14.765435Z",
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
  "command_id": "099b2b6a-1735-44df-bb13-1798971e3a1f",
  "quote_id": "0ca77e55-f86c-4098-8044-f8d34c9f8c1e",
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
  "correlation_id": "95316a95-717b-46fd-a16a-e32a9910ba00"
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
  "command_id": "f7e5a0d0-ab69-4bfe-badb-284be3ac0ea0",
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
  "command_id": "6dd228f3-eb99-42db-bdb1-9de4b1edb823",
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
  "id": "6d29a5a0-aa6f-436d-a9af-a81189bb36d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:16.015100Z",
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
  "command_id": "b9ff4f25-e1a6-458d-8b8b-620f0d8c4e8d",
  "quote_id": "6d29a5a0-aa6f-436d-a9af-a81189bb36d8",
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
  "correlation_id": "d4e57c10-8634-4abc-bb33-c2fd7ec4e97b"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "484f9d1a-50e9-4a02-9aa2-4dc6be2ca25b",
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
  "correlation_id": "a7c41d5d-bedf-4404-b542-29f9da008cf7"
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
  "command_id": "16b1a2ed-9d62-418d-8d0c-c10c5e16ea2c",
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
  "phone": "+380677382095",
  "device_ref": "sandbox-16167"
}
```

```json
{
  "challenge_id": "212852e2-5630-4d82-bcc9-df21886d2acd",
  "expires_at": "2026-10-29T14:59:17.595430858Z",
  "resend_available_at": "2026-10-29T14:54:18.595430858Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677382095` → **200**

```json
{
  "phone": "+380677382095",
  "audience": "CLIENT",
  "code": "370421",
  "sent_at": "2026-10-29T14:54:17.601374416Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "212852e2-5630-4d82-bcc9-df21886d2acd",
  "code": "370421",
  "device_ref": "sandbox-16167"
}
```

```json
{
  "session_id": "aa5c8369-4a27-43de-affe-d440cb68c12c",
  "subject": {
    "type": "CLIENT",
    "id": "04c3e9ad-1b54-4e6a-854a-2788d1e607c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGMzZTlhZC0xYjU0LTRlNmEtODU0YS0yNzg4ZDFlNjA3YzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTU3LCJpYXQiOjE3OTMyODU2NTcsImp0aSI6ImQ1MDYzMWNkLTcxOTctNDAxMi04MGY4LWFhMzcyMDZiYjNhNyIsInNpZCI6ImFhNWM4MzY5LTRhMjctNDNkZS1hZmZlLWQ0NDBjYjY4YzEyYyJ9.Y6f1sFcwmucsOlkjIS2z8PQsHYu5JKyK8zTli_2mZF0",
  "access_expires_at": "2026-10-29T15:09:17.929155008Z",
  "refresh_token": "LHuDtB3HyXqb7jLAl5OqNSRl2nhWE4-_YCCWnmceZKY",
  "refresh_expires_at": "2026-11-28T14:54:17.928438335Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "04c3e9ad-1b54-4e6a-854a-2788d1e607c7",
  "session_id": "aa5c8369-4a27-43de-affe-d440cb68c12c",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d576bdfd-18b0-40fe-8e86-7e1501b58f32",
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
  "id": "adad5873-6015-4caa-b0aa-fcbcbd79f255",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:18.540824Z",
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
  "challenge_id": "3039ef22-040a-495c-91ad-8d30db06cc73",
  "expires_at": "2026-10-29T14:59:20.856876244Z",
  "resend_available_at": "2026-10-29T14:54:21.856876244Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677382095` → **200**

```json
{
  "phone": "+380677382095",
  "audience": "CLIENT",
  "code": "063956",
  "sent_at": "2026-10-29T14:54:20.859338323Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "5677ad5a-ff46-4c72-ba3e-71b6c41f6425",
  "challenge_id": "3039ef22-040a-495c-91ad-8d30db06cc73",
  "otp_code": "063956"
}
```

```json
{
  "client_id": "04c3e9ad-1b54-4e6a-854a-2788d1e607c7",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T14:54:21.193650895Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "63d12e8d-cfc0-48fe-8c34-ef63958c359d",
  "quote_id": "adad5873-6015-4caa-b0aa-fcbcbd79f255",
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
  "correlation_id": "586b1bd4-a90b-467b-b533-4cda3a730058"
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
  "session_id": "dc35c8a2-80e3-47a9-8515-494c7c5eeded",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NjIsImlhdCI6MTc5MzI4NTY2MiwianRpIjoiOGEyZGYyNDQtZDQyYS00MGVhLWJlOWQtNmYzZTk2OTBkZTQzIiwic2lkIjoiZGMzNWM4YTItODBlMy00N2E5LTg1MTUtNDk0YzdjNWVlZGVkIn0.JClu31qqqDBHtzDRINswfN8X5EwIAl9NYXkdbGZcQEI",
  "access_expires_at": "2026-10-29T15:09:22.100630015Z",
  "refresh_token": "2pQsFK9NQN35QTjmTOemVaf3ed-lYBfjdOoy-obZSPw",
  "refresh_expires_at": "2026-10-30T02:54:22.100069104Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "04c3e9ad-1b54-4e6a-854a-2788d1e607c7",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T14:54:21.193651Z",
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

`POST /api/admin/v1/client-deletions/04c3e9ad-1b54-4e6a-854a-2788d1e607c7/complete` → **200**

```json
{
  "command_id": "68a586df-b307-440d-b3b9-2e5a1de55ddb",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "04c3e9ad-1b54-4e6a-854a-2788d1e607c7",
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
  "correlation_id": "c3aad156-e289-45d1-9854-a81a9b1ca6df"
}
```

Done: client 04c3e9ad-1b54-4e6a-854a-2788d1e607c7 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663235241",
  "device_ref": "sandbox-10513"
}
```

```json
{
  "challenge_id": "43032ab1-8d8e-432d-a1ee-fc87c1b6b1f3",
  "expires_at": "2026-10-29T14:59:23.330711971Z",
  "resend_available_at": "2026-10-29T14:54:24.330711971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663235241` → **200**

```json
{
  "phone": "+380663235241",
  "audience": "CLIENT",
  "code": "209631",
  "sent_at": "2026-10-29T14:54:23.333693257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43032ab1-8d8e-432d-a1ee-fc87c1b6b1f3",
  "code": "209631",
  "device_ref": "sandbox-10513"
}
```

```json
{
  "session_id": "c5d449bb-d7f5-4838-a853-0b861748344a",
  "subject": {
    "type": "CLIENT",
    "id": "a03b66ed-4373-4670-be2a-97152772cc66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMDNiNjZlZC00MzczLTQ2NzAtYmUyYS05NzE1Mjc3MmNjNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTYzLCJpYXQiOjE3OTMyODU2NjMsImp0aSI6ImVlZmQwODY4LTc3NDktNDQxYy05YTNlLTI4M2QzMjIwNzcwZSIsInNpZCI6ImM1ZDQ0OWJiLWQ3ZjUtNDgzOC1hODUzLTBiODYxNzQ4MzQ0YSJ9.NfbRMEtvgquBaDEDncv8uPeyvGyrM6iFt0Knc0Ixeqs",
  "access_expires_at": "2026-10-29T15:09:23.666394133Z",
  "refresh_token": "ZmowYV_aiyp8GuSzBEjkdfkSvAChJPNzCuvyPKatrW8",
  "refresh_expires_at": "2026-11-28T14:54:23.665815038Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a03b66ed-4373-4670-be2a-97152772cc66",
  "session_id": "c5d449bb-d7f5-4838-a853-0b861748344a",
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
  "session_id": "8397d0d6-e273-44ef-b535-2a362d5e735a",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NjQsImlhdCI6MTc5MzI4NTY2NCwianRpIjoiZGY1Nzk3N2UtMGQ2Yi00OTRlLWJlMzQtNDQwMjA5NWQ5YjVjIiwic2lkIjoiODM5N2QwZDYtZTI3My00NGVmLWI1MzUtMmEzNjJkNWU3MzVhIn0.KjVrITltN91jUJqr6-m4To4m7X_P9dRhaitjrnnSu2s",
  "access_expires_at": "2026-10-29T15:09:24.556520917Z",
  "refresh_token": "kBtq08jGrCYtZFtKC3tBrq3w9rPNcknnN4VLHxxHz0k",
  "refresh_expires_at": "2026-10-30T02:54:24.555907327Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3235241&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "a03b66ed-4373-4670-be2a-97152772cc66",
      "phone": "+380663235241",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T14:54:23.664079Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/a03b66ed-4373-4670-be2a-97152772cc66` → **200**

```json
{
  "client": {
    "id": "a03b66ed-4373-4670-be2a-97152772cc66",
    "phone": "+380663235241",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:54:23.664079Z",
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

`POST /api/admin/v1/clients/a03b66ed-4373-4670-be2a-97152772cc66/block` → **400**

```json
{
  "command_id": "21792656-6ccc-4707-be90-0a2ec45adaf5",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a03b66ed-4373-4670-be2a-97152772cc66/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0b440adb-86ba-4c13-b92b-7d69ceaad748",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/a03b66ed-4373-4670-be2a-97152772cc66/block` → **200**

```json
{
  "command_id": "86df15eb-48b7-4b18-bcca-5bd6c7e0e1c2",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "a03b66ed-4373-4670-be2a-97152772cc66",
  "phone": "+380663235241",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T14:54:23.664079Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T14:54:25.824804Z",
    "by": "efe949ae-ae39-47f2-8672-c36f54fcf297"
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
  "correlation_id": "0c8b6b08-a799-485a-a1b1-ce9c496d100d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663235241",
  "device_ref": "sandbox-27715"
}
```

```json
{
  "challenge_id": "1cdf7fd8-69c4-48ff-a7d6-eccce48cef7e",
  "expires_at": "2026-10-29T14:59:28.435628517Z",
  "resend_available_at": "2026-10-29T14:54:29.435628517Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663235241` → **200**

```json
{
  "phone": "+380663235241",
  "audience": "CLIENT",
  "code": "650344",
  "sent_at": "2026-10-29T14:54:28.43849483Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1cdf7fd8-69c4-48ff-a7d6-eccce48cef7e",
  "code": "650344",
  "device_ref": "sandbox-27715"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "02422523-1ec3-46cc-bc73-ee6a1150d4bf"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/a03b66ed-4373-4670-be2a-97152772cc66` → **200**

```json
{
  "client": {
    "id": "a03b66ed-4373-4670-be2a-97152772cc66",
    "phone": "+380663235241",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T14:54:23.664079Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T14:54:25.824804Z",
      "by": "efe949ae-ae39-47f2-8672-c36f54fcf297"
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

`POST /api/admin/v1/clients/a03b66ed-4373-4670-be2a-97152772cc66/unblock` → **200**

```json
{
  "command_id": "6eee26e4-8524-43c1-9c27-3db5fc4e9110",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "a03b66ed-4373-4670-be2a-97152772cc66",
  "phone": "+380663235241",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T14:54:23.664079Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663235241",
  "device_ref": "sandbox-5902"
}
```

```json
{
  "challenge_id": "11b80c3c-d530-4613-b83f-f69cab7d0c08",
  "expires_at": "2026-10-29T14:59:31.708051115Z",
  "resend_available_at": "2026-10-29T14:54:32.708051115Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663235241` → **200**

```json
{
  "phone": "+380663235241",
  "audience": "CLIENT",
  "code": "432784",
  "sent_at": "2026-10-29T14:54:31.71065741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11b80c3c-d530-4613-b83f-f69cab7d0c08",
  "code": "432784",
  "device_ref": "sandbox-5902"
}
```

```json
{
  "session_id": "33201f12-8d95-4362-981d-d2ace8db65c3",
  "subject": {
    "type": "CLIENT",
    "id": "a03b66ed-4373-4670-be2a-97152772cc66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMDNiNjZlZC00MzczLTQ2NzAtYmUyYS05NzE1Mjc3MmNjNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTcyLCJpYXQiOjE3OTMyODU2NzIsImp0aSI6ImMzYzRmZGE1LTViZTQtNDQ2OS04N2Q1LTc2MzY4OTA3NDg5NiIsInNpZCI6IjMzMjAxZjEyLThkOTUtNDM2Mi05ODFkLWQyYWNlOGRiNjVjMyJ9.CsQFkN_M22Sd1kpgrsLuOB8_Pw3oTpToC2PkdKxPbBM",
  "access_expires_at": "2026-10-29T15:09:32.034948371Z",
  "refresh_token": "gHNuw2QY1PkemXf65EeghGk6XTBdyJuksKIBh4DQazg",
  "refresh_expires_at": "2026-11-28T14:54:32.034405915Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a03b66ed-4373-4670-be2a-97152772cc66",
  "session_id": "33201f12-8d95-4362-981d-d2ace8db65c3",
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
  "phone": "+380661639719",
  "device_ref": "sandbox-22471"
}
```

```json
{
  "challenge_id": "83cb9edd-fa43-4bcb-9731-e06adb2cfd4a",
  "expires_at": "2026-10-29T14:59:32.629069658Z",
  "resend_available_at": "2026-10-29T14:54:33.629069658Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661639719` → **200**

```json
{
  "phone": "+380661639719",
  "audience": "CLIENT",
  "code": "865479",
  "sent_at": "2026-10-29T14:54:32.631988521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83cb9edd-fa43-4bcb-9731-e06adb2cfd4a",
  "code": "865479",
  "device_ref": "sandbox-22471"
}
```

```json
{
  "session_id": "9ea47ce3-8f25-4f8d-8e74-f3a8a181ea1a",
  "subject": {
    "type": "CLIENT",
    "id": "394b9e7d-8bdd-4c8f-9025-b6348f6c41dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTRiOWU3ZC04YmRkLTRjOGYtOTAyNS1iNjM0OGY2YzQxZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTcyLCJpYXQiOjE3OTMyODU2NzIsImp0aSI6IjkxOTU4YTg3LTliNmMtNDA4Zi1iMzI1LTYwODM1ZTcyOTQwZCIsInNpZCI6IjllYTQ3Y2UzLThmMjUtNGY4ZC04ZTc0LWYzYThhMTgxZWExYSJ9.oSP92ChbxkYJFL3v9iCZtRkt4bhD1brl4qKJkF-zOpQ",
  "access_expires_at": "2026-10-29T15:09:32.956263322Z",
  "refresh_token": "9hZP1kFvBQnIScoR8OnZ_XbcAgMySURWSxbi3Ewgj5A",
  "refresh_expires_at": "2026-11-28T14:54:32.955700237Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9f949ba9-2eda-4caa-9702-fb46b254d72c",
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
  "id": "b89932b7-f17b-4b93-bb03-b3c9b135539b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:33.270305Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 75c85134-a064-45c0-89b9-4b7935149320) → **201**

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
  "session_id": "779d1e43-d4ef-4329-8499-0ef32f60490f",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NzMsImlhdCI6MTc5MzI4NTY3MywianRpIjoiYTYxYTRlYmQtYTFlMi00MzlkLThiYmUtOWZlZDNjYTU2MjA3Iiwic2lkIjoiNzc5ZDFlNDMtZDRlZi00MzI5LTg0OTktMGVmMzJmNjA0OTBmIn0.OAP88qrts3vhfVzTLT_3od77SN5pQunrnwj2UM24kSc",
  "access_expires_at": "2026-10-29T15:09:33.909620194Z",
  "refresh_token": "jz1uQ2VnU1yv5ogHvRkorjvStcPIoilcCy1-jL4KO6M",
  "refresh_expires_at": "2026-10-30T02:54:33.909064983Z",
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
  "session_id": "4868d84a-424f-4951-83db-3e76ce7fa875",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NzQsImlhdCI6MTc5MzI4NTY3NCwianRpIjoiODI5OGRjMjEtNzYwZi00NjU2LWJiYjctMDM5NDRhOTg1YzU1Iiwic2lkIjoiNDg2OGQ4NGEtNDI0Zi00OTUxLTgzZGItM2U3NmNlN2ZhODc1In0.lbaQOua30uQONSWyrXeEwDfrV8ac3DBZ4z82NuMPFgw",
  "access_expires_at": "2026-10-29T15:09:34.519465929Z",
  "refresh_token": "VeGvDIRyADH9f-N8Xxg1lc2PnAHYkubNKBoqiCIT2DA",
  "refresh_expires_at": "2026-10-30T02:54:34.518838175Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/367ea597-1eba-4a8a-9871-5dbffcecc57a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:54:33.5781Z",
      "actor": {
        "type": "CLIENT",
        "id": "394b9e7d-8bdd-4c8f-9025-b6348f6c41dc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "367ea597-1eba-4a8a-9871-5dbffcecc57a",
        "quote_id": "b89932b7-f17b-4b93-bb03-b3c9b135539b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "75c85134-a064-45c0-89b9-4b7935149320"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:54:33.580595Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "367ea597-1eba-4a8a-9871-5dbffcecc57a",
        "attempt_id": "c77ba0e5-72de-4ebc-946c-5986952fb79e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "75c85134-a064-45c0-89b9-4b7935149320"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T14:54:33.587357Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "367ea597-1eba-4a8a-9871-5dbffcecc57a",
        "attempt_id": "c77ba0e5-72de-4ebc-946c-5986952fb79e"
      },
      "correlation_id": "75c85134-a064-45c0-89b9-4b7935149320"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "c77ba0e5-72de-4ebc-946c-5986952fb79e",
        "generation": 1,
        "started_at": "2026-10-29T14:54:33.579576Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T14:54:33.587357Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T14:54:33.581342Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/75c85134-a064-45c0-89b9-4b7935149320` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "367ea597-1eba-4a8a-9871-5dbffcecc57a:0",
      "order_id": "367ea597-1eba-4a8a-9871-5dbffcecc57a",
      "at": "2026-10-29T14:54:33.5781Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "367ea597-1eba-4a8a-9871-5dbffcecc57a:1",
      "order_id": "367ea597-1eba-4a8a-9871-5dbffcecc57a",
      "at": "2026-10-29T14:54:33.580595Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "367ea597-1eba-4a8a-9871-5dbffcecc57a:2",
      "order_id": "367ea597-1eba-4a8a-9871-5dbffcecc57a",
      "at": "2026-10-29T14:54:33.587357Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/d683a213-c5ed-41fe-a68f-78c1503efa55` → **200**

```json
{
  "found": []
}
```

Done: request 75c85134-a064-45c0-89b9-4b7935149320 — order 367ea597-1eba-4a8a-9871-5dbffcecc57a found by its id.

`GET /api/rider/v1/orders/367ea597-1eba-4a8a-9871-5dbffcecc57a` → **200**

```json
{
  "id": "367ea597-1eba-4a8a-9871-5dbffcecc57a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "394b9e7d-8bdd-4c8f-9025-b6348f6c41dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:54:33.577527Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/367ea597-1eba-4a8a-9871-5dbffcecc57a/cancel` → **200**

```json
{
  "command_id": "bea0bfb9-b3cd-490d-8821-f52c2e983a0b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "367ea597-1eba-4a8a-9871-5dbffcecc57a",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "394b9e7d-8bdd-4c8f-9025-b6348f6c41dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:54:33.577527Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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
  "phone": "+380633298754",
  "device_ref": "sandbox-24225"
}
```

```json
{
  "challenge_id": "36bbd708-0816-4c0a-af1c-ec7116d4ec5a",
  "expires_at": "2026-10-29T14:59:36.363327837Z",
  "resend_available_at": "2026-10-29T14:54:37.363327837Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633298754` → **200**

```json
{
  "phone": "+380633298754",
  "audience": "CLIENT",
  "code": "055515",
  "sent_at": "2026-10-29T14:54:36.366302493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36bbd708-0816-4c0a-af1c-ec7116d4ec5a",
  "code": "055515",
  "device_ref": "sandbox-24225"
}
```

```json
{
  "session_id": "3d3d19e9-9ac4-471a-b1e2-d8bcd743c6b5",
  "subject": {
    "type": "CLIENT",
    "id": "1ca02113-3527-4183-a24c-805b7b169eeb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxY2EwMjExMy0zNTI3LTQxODMtYTI0Yy04MDViN2IxNjllZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTc2LCJpYXQiOjE3OTMyODU2NzYsImp0aSI6ImFmNTYwNzkwLWM5Y2YtNGY1Ny1iNThiLTIyMDcwNGE1ZjdmMyIsInNpZCI6IjNkM2QxOWU5LTlhYzQtNDcxYS1iMWUyLWQ4YmNkNzQzYzZiNSJ9.DtThdbuZboK9DKQxm6rg3jAZ_4VFEFAWZTtySB3e25Q",
  "access_expires_at": "2026-10-29T15:09:36.692858747Z",
  "refresh_token": "N3XfJejCZzaurmXdwXnw4pm3aaBmFqwwX_z9ZVaBv3Y",
  "refresh_expires_at": "2026-11-28T14:54:36.692194984Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "d26c2578-30b8-479a-a1db-bb7c466a26bb",
  "expires_at": "2026-10-29T14:59:38.995733782Z",
  "resend_available_at": "2026-10-29T14:54:39.995733782Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633298754` → **200**

```json
{
  "phone": "+380633298754",
  "audience": "CLIENT",
  "code": "563650",
  "sent_at": "2026-10-29T14:54:38.998328594Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "ad992bc3-0059-4b9f-8475-d5ee2ae72466",
  "challenge_id": "d26c2578-30b8-479a-a1db-bb7c466a26bb",
  "otp_code": "563650"
}
```

```json
{
  "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:39.338205Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517` → **200**

```json
{
  "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:39.338205Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517` → **200**

```json
{
  "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:39.338205Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517` → **200**

```json
{
  "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:39.338205Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517` → **200**

```json
{
  "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:39.338205Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517` → **200**

```json
{
  "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:39.338205Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517` → **200**

```json
{
  "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:39.338205Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517` → **200**

```json
{
  "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
  "state": "READY",
  "created_at": "2026-10-29T14:54:39.338205Z",
  "ready_at": "2026-10-29T14:54:46.670062Z",
  "expires_at": "2026-11-05T14:54:46.670062Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635660240",
  "device_ref": "sandbox-32300"
}
```

```json
{
  "challenge_id": "0783fccc-4867-4921-8a22-2ef66ccdac06",
  "expires_at": "2026-10-29T14:59:47.704480561Z",
  "resend_available_at": "2026-10-29T14:54:48.704480561Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635660240` → **200**

```json
{
  "phone": "+380635660240",
  "audience": "CLIENT",
  "code": "783070",
  "sent_at": "2026-10-29T14:54:47.707407125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0783fccc-4867-4921-8a22-2ef66ccdac06",
  "code": "783070",
  "device_ref": "sandbox-32300"
}
```

```json
{
  "session_id": "340a4b7f-c6eb-412d-88bb-46cde3e1d647",
  "subject": {
    "type": "CLIENT",
    "id": "b6971eeb-0568-4dc0-be60-00efd4fc2f56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjk3MWVlYi0wNTY4LTRkYzAtYmU2MC0wMGVmZDRmYzJmNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTg4LCJpYXQiOjE3OTMyODU2ODgsImp0aSI6ImZmNTZhMzQzLTczNjEtNGU3Yy1hYjFiLTJkZTQ5YjAxODAzOSIsInNpZCI6IjM0MGE0YjdmLWM2ZWItNDEyZC04OGJiLTQ2Y2RlM2UxZDY0NyJ9.1quNSEuxJT8KrQ730-lAVXfIaOEF0ih46P9o5YLs_6o",
  "access_expires_at": "2026-10-29T15:09:48.034457963Z",
  "refresh_token": "eFiXf6caHTab4NhUVAYm3Rw2IdP67_czK86T76G5jpw",
  "refresh_expires_at": "2026-11-28T14:54:48.033876483Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/836bf13c-12b8-4dc8-b161-c73961ba1517/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "878fcb27-f85a-42a1-9ce9-b2f7101d43e1"
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
  "session_id": "8c556e14-7de9-4663-b30d-fe58b63d6a98",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1ODgsImlhdCI6MTc5MzI4NTY4OCwianRpIjoiMzE2YTNjYTYtMjc5MS00NGViLTg2MjctMTJjYjZmY2Y0YzQ2Iiwic2lkIjoiOGM1NTZlMTQtN2RlOS00NjYzLWIzMGQtZmU1OGI2M2Q2YTk4In0.pLpxtcGstZmiF5Ijr4CMDVfHy125e330B8WJw9mFKCs",
  "access_expires_at": "2026-10-29T15:09:48.935328394Z",
  "refresh_token": "izx7YvovsuIgNx2mh-l-0Q3Hf2ONSd5iR87iaMnWjP0",
  "refresh_expires_at": "2026-10-30T02:54:48.934734902Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1ca02113-3527-4183-a24c-805b7b169eeb",
  "session_id": "3d3d19e9-9ac4-471a-b1e2-d8bcd743c6b5",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/1ca02113-3527-4183-a24c-805b7b169eeb/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "836bf13c-12b8-4dc8-b161-c73961ba1517",
      "state": "READY",
      "created_at": "2026-10-29T14:54:39.338205Z",
      "ready_at": "2026-10-29T14:54:46.670062Z",
      "expires_at": "2026-11-05T14:54:46.670062Z",
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
  "device_ref": "sandbox-25876"
}
```

```json
{
  "challenge_id": "0aae4acd-fe45-4697-9a12-46b0c374ee1c",
  "expires_at": "2026-10-29T14:59:49.895777314Z",
  "resend_available_at": "2026-10-29T14:54:50.895777314Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "183264",
  "sent_at": "2026-10-29T14:54:49.899108256Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0aae4acd-fe45-4697-9a12-46b0c374ee1c",
  "code": "183264",
  "device_ref": "sandbox-25876"
}
```

```json
{
  "session_id": "24e219ef-43f7-4cd4-994c-abeacb9d00f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjU5MCwiaWF0IjoxNzkzMjg1NjkwLCJqdGkiOiIxYmIwMzcyMy0wZmY1LTRhMGItOThhNi1kNWU0N2M5OGFhYjciLCJzaWQiOiIyNGUyMTllZi00M2Y3LTRjZDQtOTk0Yy1hYmVhY2I5ZDAwZjUifQ.SyTrVY3R927qkzmnbu8qVB2CTQpJIKyB4KMGOR963Ck",
  "access_expires_at": "2026-10-29T15:09:50.254035183Z",
  "refresh_token": "SafforspUl20hMD5Prkr1VucrwkwQlGlVo3Ykt_GNhY",
  "refresh_expires_at": "2026-11-28T14:54:50.252706894Z",
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
  "device_ref": "sandbox-24127"
}
```

```json
{
  "challenge_id": "383a011f-8930-4690-9ca4-9731f75c1540",
  "expires_at": "2026-10-29T14:59:50.85604695Z",
  "resend_available_at": "2026-10-29T14:54:51.85604695Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "309261",
  "sent_at": "2026-10-29T14:54:50.859229895Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "383a011f-8930-4690-9ca4-9731f75c1540",
  "code": "309261",
  "device_ref": "sandbox-24127"
}
```

```json
{
  "session_id": "47b408f7-adc4-4034-993a-35c8e9532968",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjU5MSwiaWF0IjoxNzkzMjg1NjkxLCJqdGkiOiI0Y2M1MDYxYS03MTAyLTQ5Y2MtYWJiNC1hZjJjMTMzYTMyMzQiLCJzaWQiOiI0N2I0MDhmNy1hZGM0LTQwMzQtOTkzYS0zNWM4ZTk1MzI5NjgifQ.kxUmBU1VFFd1eD8CcQrcLORenc1-PyG1D-MFAc2lXwU",
  "access_expires_at": "2026-10-29T15:09:51.172464888Z",
  "refresh_token": "FJUGmfEbekCxwPmuVhRW_yipC9NN3P4tqiMMKc8IPvU",
  "refresh_expires_at": "2026-11-28T14:54:51.171818787Z",
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
  "command_id": "661dc846-28a8-4eaf-b3b5-e257bf225aa7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:54:51Z",
    "sequence": 1793285691760
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62305456-5f4b-4ceb-bf84-16a9f39018e5",
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
  "last_heartbeat_at": "2026-10-29T14:54:51.78118Z",
  "last_location_at": "2026-10-29T14:54:51.78118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-32263"
}
```

```json
{
  "challenge_id": "f1af13b5-2841-4d45-80b8-ba1d96cb5cae",
  "expires_at": "2026-10-29T14:59:52.083577538Z",
  "resend_available_at": "2026-10-29T14:54:53.083577538Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "552653",
  "sent_at": "2026-10-29T14:54:52.086615192Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1af13b5-2841-4d45-80b8-ba1d96cb5cae",
  "code": "552653",
  "device_ref": "sandbox-32263"
}
```

```json
{
  "session_id": "1e76aaf5-f9f4-471a-b9c6-63f725ee82ac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjU5MiwiaWF0IjoxNzkzMjg1NjkyLCJqdGkiOiI3ZWU5N2E1NS1mODU3LTRiMTktYTliOS1kZDhiZDNlOWRhMzUiLCJzaWQiOiIxZTc2YWFmNS1mOWY0LTQ3MWEtYjljNi02M2Y3MjVlZTgyYWMifQ.LfIO7-vmlj2_uDc1z3yHtIRydxd-OGqSpaDKnjeRMTs",
  "access_expires_at": "2026-10-29T15:09:52.404192037Z",
  "refresh_token": "QUndTXEG56YX31lZSrKb6SXR2e-m_5CdV-JlW2S7zQ0",
  "refresh_expires_at": "2026-11-28T14:54:52.403549866Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1f31b09-35f7-4edb-9efc-df7facd076a3",
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
  "last_heartbeat_at": "2026-10-29T14:53:11.550385Z",
  "last_location_at": "2026-10-29T14:53:11.550385Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1f31b09-35f7-4edb-9efc-df7facd076a3/handover` → **200**

```json
{
  "command_id": "52b6b2a7-40cd-4c55-9678-dd7317e25170",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1f31b09-35f7-4edb-9efc-df7facd076a3",
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
  "last_heartbeat_at": "2026-10-29T14:53:11.550385Z",
  "last_location_at": "2026-10-29T14:53:11.550385Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1f31b09-35f7-4edb-9efc-df7facd076a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:54:53Z",
    "sequence": 1793285693278
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1f31b09-35f7-4edb-9efc-df7facd076a3",
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
  "last_heartbeat_at": "2026-10-29T14:54:53.298464Z",
  "last_location_at": "2026-10-29T14:54:53.298464Z",
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
  "session_id": "b940f693-15c3-4f66-91f2-470907b517d9",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1OTMsImlhdCI6MTc5MzI4NTY5MywianRpIjoiN2Y4MzdjMmQtYzc0ZC00YTExLTkzZjUtMDIwN2ViMmJkMWM5Iiwic2lkIjoiYjk0MGY2OTMtMTVjMy00ZjY2LTkxZjItNDcwOTA3YjUxN2Q5In0.KYs_MiLBa33SZ-fSdfNZpnndDvw5Bf5qc3NLVl9uMQ8",
  "access_expires_at": "2026-10-29T15:09:53.884383768Z",
  "refresh_token": "UVdGJVF_HU_lH8TKTX0wJ3NuTpjBzXngkM1xpMDvbKE",
  "refresh_expires_at": "2026-10-30T02:54:53.883761556Z",
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
  "session_id": "a3c7cd7b-2b3a-43aa-94a4-835c94a2af78",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1OTQsImlhdCI6MTc5MzI4NTY5NCwianRpIjoiOWUyMDkzOGUtMjFlMy00MjhkLTg5YzctYTNmYjE1MDkxNTQ5Iiwic2lkIjoiYTNjN2NkN2ItMmIzYS00M2FhLTk0YTQtODM1Yzk0YTJhZjc4In0.20wj8tSb-3E6Kb9GKs0hiiJAy-Tb3M0dckXJODJ-p2M",
  "access_expires_at": "2026-10-29T15:09:54.484333191Z",
  "refresh_token": "LMs9qYdlD7EDsSZDaviar9THrt3Qtt2DjDideT4-fTA",
  "refresh_expires_at": "2026-10-30T02:54:54.483627208Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689922352",
  "device_ref": "sandbox-22878"
}
```

```json
{
  "challenge_id": "476fc109-2e9c-4f78-9d31-59bdbf4ee9a4",
  "expires_at": "2026-10-29T14:59:54.779990162Z",
  "resend_available_at": "2026-10-29T14:54:55.779990162Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689922352` → **200**

```json
{
  "phone": "+380689922352",
  "audience": "CLIENT",
  "code": "600204",
  "sent_at": "2026-10-29T14:54:54.782897279Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "476fc109-2e9c-4f78-9d31-59bdbf4ee9a4",
  "code": "600204",
  "device_ref": "sandbox-22878"
}
```

```json
{
  "session_id": "0be5ae6e-78f0-4547-a3e6-22c395bdb6c3",
  "subject": {
    "type": "CLIENT",
    "id": "a31737d4-0e0c-41b2-b811-6df4695a551d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzE3MzdkNC0wZTBjLTQxYjItYjgxMS02ZGY0Njk1YTU1MWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTk1LCJpYXQiOjE3OTMyODU2OTUsImp0aSI6ImIwODM3MjE2LTlhZDYtNGZhMS1hNjJlLTE4Mzk4MzkwZmNmMSIsInNpZCI6IjBiZTVhZTZlLTc4ZjAtNDU0Ny1hM2U2LTIyYzM5NWJkYjZjMyJ9.rb5IMfaRliEYDKKhq14qD0h4ZzkCMS9ZjK283TYFyOQ",
  "access_expires_at": "2026-10-29T15:09:55.135169448Z",
  "refresh_token": "DJIiK5FWIW0L7WrJXx82x3kqti0pIGrmLjaO8dvlfdo",
  "refresh_expires_at": "2026-11-28T14:54:55.134549558Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d44c83f1-1c37-4f7e-877a-cf0d1d8df455",
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
  "id": "936b4e39-bb8b-4cd0-8e6b-8925d791da78",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:55.438319Z",
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
  "command_id": "223d4de2-7c63-46e5-b131-d80f752f4109",
  "quote_id": "936b4e39-bb8b-4cd0-8e6b-8925d791da78",
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
  "id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a31737d4-0e0c-41b2-b811-6df4695a551d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:54:55.750911Z",
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
    "id": "6619f711-cca0-439a-b0f2-d708231fb946",
    "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
    "expires_at": "2026-10-29T14:55:10.753993Z",
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

`POST /api/driver/v1/offers/6619f711-cca0-439a-b0f2-d708231fb946/reject` → **204**

```json
{
  "command_id": "32d48bae-f40f-4f96-8145-75af40543c21"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1f37dc63-449d-46e4-a50f-ec9b237c282b",
    "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
    "expires_at": "2026-10-29T14:55:11.379622Z",
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

`POST /api/driver/v1/offers/1f37dc63-449d-46e4-a50f-ec9b237c282b/accept` → **200**

```json
{
  "command_id": "2b87499a-c414-4da8-9f57-5207ba567f4f"
}
```

```json
{
  "id": "d5694a47-62c6-4ad3-a6ec-881e5a614af3",
  "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "52c9d919-2882-4c91-a488-e8826b6f9777",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/b5d2c005-ba10-42aa-a226-2e48835419ea/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:54:55.751369Z",
      "actor": {
        "type": "CLIENT",
        "id": "a31737d4-0e0c-41b2-b811-6df4695a551d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
        "quote_id": "936b4e39-bb8b-4cd0-8e6b-8925d791da78",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8b12b7c6-6239-4dda-bac9-f0565ec57937"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:54:55.753318Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
        "attempt_id": "53b59b02-62ed-4ea8-9f1f-a46e71d55314",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8b12b7c6-6239-4dda-bac9-f0565ec57937"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:54:55.756188Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6619f711-cca0-439a-b0f2-d708231fb946",
        "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "8b12b7c6-6239-4dda-bac9-f0565ec57937"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T14:54:56.378637Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6619f711-cca0-439a-b0f2-d708231fb946",
        "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea"
      },
      "correlation_id": "8cf7cf05-413f-45ab-b998-4eb79401e955"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order b5d2c005-ba10-42aa-a226-2e48835419ea — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/b5d2c005-ba10-42aa-a226-2e48835419ea` → **200**

```json
{
  "id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a31737d4-0e0c-41b2-b811-6df4695a551d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d5694a47-62c6-4ad3-a6ec-881e5a614af3",
    "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "52c9d919-2882-4c91-a488-e8826b6f9777",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:54:55.750911Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b5d2c005-ba10-42aa-a226-2e48835419ea/cancel` → **200**

```json
{
  "command_id": "822e2391-2edb-45a1-b4c4-02b84a0a623c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a31737d4-0e0c-41b2-b811-6df4695a551d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d5694a47-62c6-4ad3-a6ec-881e5a614af3",
    "order_id": "b5d2c005-ba10-42aa-a226-2e48835419ea",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "52c9d919-2882-4c91-a488-e8826b6f9777",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:54:55.750911Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
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
  "session_id": "62305456-5f4b-4ceb-bf84-16a9f39018e5",
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
  "last_heartbeat_at": "2026-10-29T14:54:51.78118Z",
  "last_location_at": "2026-10-29T14:54:51.78118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62305456-5f4b-4ceb-bf84-16a9f39018e5/close` → **200**

```json
{
  "command_id": "c0b7590a-089a-4c03-ae8d-8264523ba274",
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
  "session_id": "f1f31b09-35f7-4edb-9efc-df7facd076a3",
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
  "last_heartbeat_at": "2026-10-29T14:54:53.298464Z",
  "last_location_at": "2026-10-29T14:54:53.298464Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1f31b09-35f7-4edb-9efc-df7facd076a3/close` → **200**

```json
{
  "command_id": "92a442a6-4d0e-43d3-b1cb-1cbfee4033c1",
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
  "session_id": "32b26090-c5f8-4336-8e8c-67c2bfa95300",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1OTksImlhdCI6MTc5MzI4NTY5OSwianRpIjoiYTNhMzU4ODUtMDhjYi00ODUwLTg1MjQtYzQ4M2IwNjhhNTE5Iiwic2lkIjoiMzJiMjYwOTAtYzVmOC00MzM2LThlOGMtNjdjMmJmYTk1MzAwIn0.2XUdFIKA39zeD_wqHphIKg2SE5yJKxmQfqZYlXTHHbE",
  "access_expires_at": "2026-10-29T15:09:59.507901412Z",
  "refresh_token": "FF4HPal3vNTNzqnUjrAn8NB56gK-7QJNLzHP4m0sNiQ",
  "refresh_expires_at": "2026-10-30T02:54:59.507272854Z",
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
  "command_id": "42186e99-f37b-4703-a73a-6c1992a12739",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T14:55:00.136491Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "8c0051e5-112a-4f19-ad89-6e15af756ac3",
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
  "correlation_id": "dcebfc25-22f7-40cc-822c-6e11077bc204"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "230fdd12-bbe2-4b72-8c0a-988daebdd785",
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
  "correlation_id": "a4af570c-afc4-4cc6-999d-3119273eb6f5"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639564089",
  "device_ref": "sandbox-31115"
}
```

```json
{
  "challenge_id": "737b7204-be3f-46df-8a99-af25f3866b96",
  "expires_at": "2026-10-29T15:00:01.046430136Z",
  "resend_available_at": "2026-10-29T14:55:02.046430136Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639564089` → **200**

```json
{
  "phone": "+380639564089",
  "audience": "CLIENT",
  "code": "782164",
  "sent_at": "2026-10-29T14:55:01.049078702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "737b7204-be3f-46df-8a99-af25f3866b96",
  "code": "782164",
  "device_ref": "sandbox-31115"
}
```

```json
{
  "session_id": "cebf6aad-0c7d-4369-b419-c9e0cb558a85",
  "subject": {
    "type": "CLIENT",
    "id": "caf1e096-763e-4c80-836b-afbed92b400e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYWYxZTA5Ni03NjNlLTRjODAtODM2Yi1hZmJlZDkyYjQwMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjAxLCJpYXQiOjE3OTMyODU3MDEsImp0aSI6Ijg0MDAzODY0LTM5Y2EtNDI0ZC05YTQxLTA3NjQzMTU5ZWRjYyIsInNpZCI6ImNlYmY2YWFkLTBjN2QtNDM2OS1iNDE5LWM5ZTBjYjU1OGE4NSJ9.7wf9jGRRpEdZGQlj-JhdUenpXhmmqD9QomzNVhfgD94",
  "access_expires_at": "2026-10-29T15:10:01.375516078Z",
  "refresh_token": "h_z4YADY0-GHpMO_1RnWkAZyDGLYYtZCirLQCSsjJBw",
  "refresh_expires_at": "2026-11-28T14:55:01.374974475Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "94a2b03a-08a2-4aaa-97be-796f6a471ea7",
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
  "id": "69f2ea08-6392-4b4c-b856-6ed410ddddbd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:01.690614Z",
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
  "command_id": "92b2ba10-39f0-4ea0-912e-99f0a4a29f7c",
  "quote_id": "69f2ea08-6392-4b4c-b856-6ed410ddddbd",
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
  "correlation_id": "2d234b97-cd08-4628-b5e0-0dc8d0c95ab1"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8925f16e-13f7-49ef-8bf9-fe61df2a21f0",
  "quote_id": "69f2ea08-6392-4b4c-b856-6ed410ddddbd",
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
  "id": "1bdc3d13-7e72-467f-9749-378872a8bde6",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "caf1e096-763e-4c80-836b-afbed92b400e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:55:02.324145Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1bdc3d13-7e72-467f-9749-378872a8bde6/cancel` → **200**

```json
{
  "command_id": "c36f7a14-dfe9-4a03-8ae5-4d8c06bc1f5d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1bdc3d13-7e72-467f-9749-378872a8bde6",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "caf1e096-763e-4c80-836b-afbed92b400e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:55:02.324145Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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
  "command_id": "6b18d9dc-a736-4e12-bd6a-e166660ae385",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T14:55:02.975077Z"
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
      "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T14:55:02.975077Z"
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
  "device_ref": "sandbox-5536"
}
```

```json
{
  "challenge_id": "39b327f6-3778-4483-ae42-1e6a1c812f1c",
  "expires_at": "2026-10-29T15:00:03.890967769Z",
  "resend_available_at": "2026-10-29T14:55:04.890967769Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "203206",
  "sent_at": "2026-10-29T14:55:03.921557144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39b327f6-3778-4483-ae42-1e6a1c812f1c",
  "code": "203206",
  "device_ref": "sandbox-5536"
}
```

```json
{
  "session_id": "5248f9d0-845c-4b0a-aac7-da965aa14d68",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjYwNCwiaWF0IjoxNzkzMjg1NzA0LCJqdGkiOiJlZTA1MjJkZC1hNmQwLTRiYjMtOGQ2ZC01ZTI4YmEwZTExYzAiLCJzaWQiOiI1MjQ4ZjlkMC04NDVjLTRiMGEtYWFjNy1kYTk2NWFhMTRkNjgifQ.um4RCq18c1XRofd8pgKeAjlI-93E9x2_8afuczBpxyQ",
  "access_expires_at": "2026-10-29T15:10:04.25020801Z",
  "refresh_token": "TkHubK10q7ATzTud45rVvNwQedGYt3OihBosFPZctH0",
  "refresh_expires_at": "2026-11-28T14:55:04.249569212Z",
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
  "command_id": "6e5c677d-d28b-492f-b2dc-7e0ce169bcf3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:04Z",
    "sequence": 1793285704849
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:04.871291Z",
  "last_location_at": "2026-10-29T14:55:04.871291Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679381880",
  "device_ref": "sandbox-10203"
}
```

```json
{
  "challenge_id": "b4b5acac-eb43-4976-a6a0-e797a4f62880",
  "expires_at": "2026-10-29T15:00:05.193953802Z",
  "resend_available_at": "2026-10-29T14:55:06.193953802Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679381880` → **200**

```json
{
  "phone": "+380679381880",
  "audience": "CLIENT",
  "code": "793880",
  "sent_at": "2026-10-29T14:55:05.196928119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4b5acac-eb43-4976-a6a0-e797a4f62880",
  "code": "793880",
  "device_ref": "sandbox-10203"
}
```

```json
{
  "session_id": "d61d9a44-d4fd-4323-ac1a-3dbe8b8f7095",
  "subject": {
    "type": "CLIENT",
    "id": "920091f6-e410-45ef-a3a9-160ba70b2831"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MjAwOTFmNi1lNDEwLTQ1ZWYtYTNhOS0xNjBiYTcwYjI4MzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjA1LCJpYXQiOjE3OTMyODU3MDUsImp0aSI6IjYwODNkZTg4LWFkMmQtNDE0Ni1iZGFiLTdlMGM1YWQzOWM4NyIsInNpZCI6ImQ2MWQ5YTQ0LWQ0ZmQtNDMyMy1hYzFhLTNkYmU4YjhmNzA5NSJ9.puBk89b_D4UaCdaEynSbUoS_1854qumc8CKia3QEPQ8",
  "access_expires_at": "2026-10-29T15:10:05.514539339Z",
  "refresh_token": "qahk1LM43u8C7-jcqwsru0FrhcpVtSBUhNpWohuQih4",
  "refresh_expires_at": "2026-11-28T14:55:05.513899601Z",
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
  "command_id": "1fb058ac-3c31-4928-b8fe-8a74833ca0ea",
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
  "id": "a56404ef-6f38-44e8-8af5-5dabd749472a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:06.106678Z",
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
  "command_id": "cece7a3d-13a4-4dca-861f-22dad1ba3ebf",
  "platform": "ANDROID",
  "token": "sandbox-driver-f5ae964b-5b47-44c5-a102-bc35f12e64b2"
}
```

```json
{
  "id": "0f698db6-dbbc-4075-bde7-728e243d1aa7",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:55:06.427394Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "0bd94087-d5e6-4586-9041-e8887b561aa2",
  "platform": "ANDROID",
  "token": "sandbox-rider-721c5895-451e-4724-ab41-cfbde2f4081e"
}
```

```json
{
  "id": "dd8ccbd8-18d7-4570-aff6-fe4fc9acf02f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:55:06.719715Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "402a2786-ad10-4fc5-b881-d5cff1795826",
  "quote_id": "a56404ef-6f38-44e8-8af5-5dabd749472a",
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
  "id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "920091f6-e410-45ef-a3a9-160ba70b2831",
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
  "created_at": "2026-10-29T14:55:07.035098Z",
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
    "id": "18374938-edcb-4097-9f47-caab001b46ff",
    "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
    "expires_at": "2026-10-29T14:55:22.038403Z",
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

`POST /api/driver/v1/offers/18374938-edcb-4097-9f47-caab001b46ff/accept` → **200**

```json
{
  "command_id": "591f745a-0f63-4b77-9684-7ea02400c608"
}
```

```json
{
  "id": "4606a23d-9276-4b19-9920-efe7d50ba0a1",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5f1dd52f-6c9e-47e2-8002-4d556c2af03b",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:55:07.832Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:55:07.832Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:55:08.307512563Z",
    "token_suffix": "2e64b2",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
      "order_version": "2",
      "event_id": "15f578f2-5d8e-496e-8067-d4ec7b53fa8f",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679381880&after=2026-10-29T14:55:07.832Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:55:08.304034016Z",
    "token_suffix": "f4081e",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
      "order_version": "3",
      "event_id": "82679dcd-2d50-47f1-a157-9c56d59275d6",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/e457c898-ccb9-4677-8c40-d226737aa27f/messages` → **201**

```json
{
  "command_id": "ab29b60c-3697-4cf7-bd4a-d40454d04e23",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "35534451-d925-4ec8-860e-c8744830d77b",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T14:55:09.057400204Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5f1dd52f-6c9e-47e2-8002-4d556c2af03b",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "assignment_id": "4606a23d-9276-4b19-9920-efe7d50ba0a1",
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

`POST /api/driver/v1/trips/5f1dd52f-6c9e-47e2-8002-4d556c2af03b/messages` → **201**

```json
{
  "command_id": "10b2f18a-372b-4b56-bfa0-df2f29dbee7b",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1952f943-2e94-4e4e-ac89-1d538d4edf48",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T14:55:09.656042132Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/e457c898-ccb9-4677-8c40-d226737aa27f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/5f1dd52f-6c9e-47e2-8002-4d556c2af03b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679381880"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/183cdba0-7f58-44e0-972b-42555319bd5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:10Z",
    "sequence": 1793285710572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:10.592485Z",
  "last_location_at": "2026-10-29T14:55:10.592485Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5f1dd52f-6c9e-47e2-8002-4d556c2af03b",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "assignment_id": "4606a23d-9276-4b19-9920-efe7d50ba0a1",
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

`POST /api/driver/v1/trips/5f1dd52f-6c9e-47e2-8002-4d556c2af03b/arrive` → **200**

```json
{
  "command_id": "8e89b033-c60a-4b8c-8a82-f585519d3200",
  "expected_version": 0
}
```

```json
{
  "id": "5f1dd52f-6c9e-47e2-8002-4d556c2af03b",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "assignment_id": "4606a23d-9276-4b19-9920-efe7d50ba0a1",
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
  "arrived_at": "2026-10-29T14:55:11.208748Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5f1dd52f-6c9e-47e2-8002-4d556c2af03b/start` → **200**

```json
{
  "command_id": "3ee5d2f9-46c4-4371-84f8-f72bc5dbe69e",
  "expected_version": 1
}
```

```json
{
  "id": "5f1dd52f-6c9e-47e2-8002-4d556c2af03b",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "assignment_id": "4606a23d-9276-4b19-9920-efe7d50ba0a1",
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
  "arrived_at": "2026-10-29T14:55:11.208748Z",
  "started_at": "2026-10-29T14:55:11.518466Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/183cdba0-7f58-44e0-972b-42555319bd5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:11Z",
    "sequence": 1793285711817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:11.839758Z",
  "last_location_at": "2026-10-29T14:55:11.839758Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/5f1dd52f-6c9e-47e2-8002-4d556c2af03b/complete` → **200**

```json
{
  "command_id": "082af1bd-214c-4cad-b335-6f2366e44287",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:55:12Z",
  "cash_received": true
}
```

```json
{
  "id": "5f1dd52f-6c9e-47e2-8002-4d556c2af03b",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "assignment_id": "4606a23d-9276-4b19-9920-efe7d50ba0a1",
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
  "arrived_at": "2026-10-29T14:55:11.208748Z",
  "started_at": "2026-10-29T14:55:11.518466Z",
  "completed_at": "2026-10-29T14:55:12.174242Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/e457c898-ccb9-4677-8c40-d226737aa27f` → **200**

```json
{
  "id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "920091f6-e410-45ef-a3a9-160ba70b2831",
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
    "id": "4606a23d-9276-4b19-9920-efe7d50ba0a1",
    "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5f1dd52f-6c9e-47e2-8002-4d556c2af03b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:55:07.035098Z",
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
    "id": "e457c898-ccb9-4677-8c40-d226737aa27f",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:55:07.035098Z",
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
    "id": "5f1dd52f-6c9e-47e2-8002-4d556c2af03b",
    "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
    "order_short_number": 13,
    "created_at": "2026-10-29T14:55:07.647784Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "51cd4685-48d5-4b7b-b503-896614f6002c",
    "order_id": "4777469f-f5e9-4a15-bc2f-8e5dc7dc43e4",
    "order_short_number": 8,
    "created_at": "2026-10-29T14:53:47.449523Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8a5a6bd3-5052-4ae0-89ac-908c006497e6",
    "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
    "order_short_number": 3,
    "created_at": "2026-10-29T14:53:01.751881Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9ba14cd1-8f42-4ef8-bddd-888461c669df",
    "order_id": "8e7abf05-b08d-4fcd-94cb-f765a0b08a9f",
    "order_short_number": 2,
    "created_at": "2026-10-29T14:52:41.657396Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "fecc7543-10fa-4d5d-8072-99eed0548db3",
    "order_id": "0e3bf446-40bc-487f-8d63-4e77743eb7b7",
    "order_short_number": 1,
    "created_at": "2026-10-29T14:52:31.180339Z",
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

`GET /api/rider/v1/orders/e457c898-ccb9-4677-8c40-d226737aa27f/tip` → **200**

```json
{
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
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
  "available_until": "2026-10-30T14:55:12.174242Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e457c898-ccb9-4677-8c40-d226737aa27f/tip` → **201**

```json
{
  "command_id": "5024d6bd-d16a-49e3-bb38-ac33f4e7c04c",
  "amount_minor": 1100
}
```

```json
{
  "id": "846ed622-a8fc-4ad7-a81f-05312ab0b550",
  "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T14:55:17.422622Z"
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
  "session_id": "cedf0cfb-6c84-4beb-8573-a8ea57376973",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MTgsImlhdCI6MTc5MzI4NTcxOCwianRpIjoiOTU3Mzk0YjgtMGRjYS00MjMzLWFmZmYtMTA3MzM0NjJlZTlhIiwic2lkIjoiY2VkZjBjZmItNmM4NC00YmViLTg1NzMtYThlYTU3Mzc2OTczIn0.6w7vBEXsJYwWQKSx2c1mFcPuLFdCTISdd0RshxEZXK4",
  "access_expires_at": "2026-10-29T15:10:18.024406991Z",
  "refresh_token": "R16UBGN4XKGqngGbZdbLVm_drWmwxu6qpwHtsbAokyY",
  "refresh_expires_at": "2026-10-30T02:55:18.023763216Z",
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
  "generated_at": "2026-10-29T14:55:18.333071993Z"
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
  "generated_at": "2026-10-29T14:55:18.638130213Z"
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
  "session_id": "9c20355e-6c8f-40a5-a5e0-bbe6c8fd1ba6",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MTksImlhdCI6MTc5MzI4NTcxOSwianRpIjoiNmM0ODEyYTItNDVmMy00NDg4LThlYWEtZDVhZTBhYjU5Y2NiIiwic2lkIjoiOWMyMDM1NWUtNmM4Zi00MGE1LWE1ZTAtYmJlNmM4ZmQxYmE2In0.BxOK2udt2unepw26CdIHtIgPSuXVBy-NyBSWQtwqcoE",
  "access_expires_at": "2026-10-29T15:10:19.257238897Z",
  "refresh_token": "ejdZrmEP2dlO73nVVnQk1fF-45dG9DtynIaUE1eJPkk",
  "refresh_expires_at": "2026-10-30T02:55:19.256589141Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e457c898-ccb9-4677-8c40-d226737aa27f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:55:07.035621Z",
      "actor": {
        "type": "CLIENT",
        "id": "920091f6-e410-45ef-a3a9-160ba70b2831",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
        "quote_id": "a56404ef-6f38-44e8-8af5-5dabd749472a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "cf6ac7f4-4049-4ef6-9bda-6459ae753880"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:55:07.037631Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
        "attempt_id": "fb02ac3b-204a-4c1c-8d58-88006f7049c9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cf6ac7f4-4049-4ef6-9bda-6459ae753880"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:55:07.040507Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "18374938-edcb-4097-9f47-caab001b46ff",
        "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "cf6ac7f4-4049-4ef6-9bda-6459ae753880"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:55:07.649504Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "18374938-edcb-4097-9f47-caab001b46ff",
        "order_id": "e457c898-ccb9-4677-8c40-d226737aa27f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4606a23d-9276-4b19-9920-efe7d50ba0a1"
      },
      "correlation_id": "ea59bb2f-53c5-459e-9f44-299653ac813d"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T14:55:19.864929301Z",
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
      "last_location_at": "2026-10-29T14:55:11.839758Z",
      "order_id": null
    }
  ]
}
```

Done: order e457c898-ccb9-4677-8c40-d226737aa27f.

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
  "session_id": "91531854-b1b6-483f-86fb-289dc4d223c8",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MjAsImlhdCI6MTc5MzI4NTcyMCwianRpIjoiMWQzNmNkNWYtMTdhYS00Nzk3LThhMDctZDUxNTJhMThkNzMzIiwic2lkIjoiOTE1MzE4NTQtYjFiNi00ODNmLTg2ZmItMjg5ZGM0ZDIyM2M4In0.6Y1K-hcBEyYMAEcrRV6tw0hIipb-nGDQ2s9fvES52sI",
  "access_expires_at": "2026-10-29T15:10:20.526833363Z",
  "refresh_token": "Q7Zv8jTz5pblT99KKqIp-75PxFjiDLqFss5GJom1DlQ",
  "refresh_expires_at": "2026-10-30T02:55:20.526263818Z",
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
  "command_id": "f3564700-e7e9-4759-93e9-f44ac735dd3f",
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
  "timestamp": "2026-10-29T14:55:21.000+0000",
  "channel": {
    "id": "1730052000.3108819408",
    "linkedid": "1730052000.3108819408",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675264040"
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
  "timestamp": "2026-10-29T14:55:21.000+0000",
  "channel": {
    "id": "1730052000.3108819408",
    "linkedid": "1730052000.3108819408",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675264040"
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
  "session_id": "30b768ef-ce21-4630-8115-9a510727f9eb",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MjEsImlhdCI6MTc5MzI4NTcyMSwianRpIjoiYjk2MTFiZWItYzlhNy00NTQwLWJmNzctYmRjMGZmMDM3ZTBkIiwic2lkIjoiMzBiNzY4ZWYtY2UyMS00NjMwLTgxMTUtOWE1MTA3MjdmOWViIn0.TQJG_I0j_jxmq-mkltdPZN8nLZ9T7ADFuan4ielnjTM",
  "access_expires_at": "2026-10-29T15:10:21.757449111Z",
  "refresh_token": "7B522niOmMEOj1OVwPLU7d7B6rv7KUnVEDs1EPP9YSU",
  "refresh_expires_at": "2026-10-30T02:55:21.756852196Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "63ed1450-d13f-4963-b263-49dd135cb1b4",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675264040",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:55:21Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/63ed1450-d13f-4963-b263-49dd135cb1b4/answer` → **200**

```json
{
  "command_id": "a0bc7cee-2327-42d5-afe8-7d7e9e366e6a"
}
```

```json
{
  "id": "63ed1450-d13f-4963-b263-49dd135cb1b4",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675264040",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "order_ids": [],
  "started_at": "2026-10-29T14:55:21Z",
  "answered_at": "2026-10-29T14:55:22.372986Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.3108819408",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f9778853-77c9-480f-9371-52d7db556108",
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
  "id": "9f079c53-46d2-49d1-ab51-79082e034292",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:22.703975Z",
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
  "command_id": "a1248b59-6705-4c46-9f5b-c9c97b653cf7",
  "quote_id": "9f079c53-46d2-49d1-ab51-79082e034292",
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
    "phone": "+380675264040"
  },
  "call_id": "63ed1450-d13f-4963-b263-49dd135cb1b4"
}
```

```json
{
  "id": "3c06f9bd-388f-4d2f-a480-2613845b95e2",
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
  "created_at": "2026-10-29T14:55:23.023035Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675264040"
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
    "id": "1730052000.3108819408",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "63ed1450-d13f-4963-b263-49dd135cb1b4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675264040",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [
        "3c06f9bd-388f-4d2f-a480-2613845b95e2"
      ],
      "started_at": "2026-10-29T14:55:21Z",
      "answered_at": "2026-10-29T14:55:22.372986Z",
      "ended_at": "2026-10-29T14:55:23.365702Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "d13ac396-1126-41f3-a9fc-6513bbd25ee0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677692260",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:50.186713Z",
      "answered_at": "2026-10-29T14:52:50.539109Z",
      "ended_at": "2026-10-29T14:52:50.868465Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:52:56.625466Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/3c06f9bd-388f-4d2f-a480-2613845b95e2` → **200**

```json
{
  "id": "3c06f9bd-388f-4d2f-a480-2613845b95e2",
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
  "created_at": "2026-10-29T14:55:23.023035Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675264040"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/3c06f9bd-388f-4d2f-a480-2613845b95e2` → **200**

```json
{
  "id": "3c06f9bd-388f-4d2f-a480-2613845b95e2",
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
  "created_at": "2026-10-29T14:55:23.023035Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675264040"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3c06f9bd-388f-4d2f-a480-2613845b95e2/cancel` → **200**

```json
{
  "command_id": "6d3b929d-a496-4b19-9edd-b7c176e966a6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "3c06f9bd-388f-4d2f-a480-2613845b95e2",
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
  "created_at": "2026-10-29T14:55:23.023035Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675264040"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 63ed1450-d13f-4963-b263-49dd135cb1b4 with order 3c06f9bd-388f-4d2f-a480-2613845b95e2.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28209"
}
```

```json
{
  "challenge_id": "28067d2f-0231-4669-9c2b-dc83decd3811",
  "expires_at": "2026-10-29T15:00:24.688494622Z",
  "resend_available_at": "2026-10-29T14:55:25.688494622Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "650081",
  "sent_at": "2026-10-29T14:55:24.692533414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28067d2f-0231-4669-9c2b-dc83decd3811",
  "code": "650081",
  "device_ref": "sandbox-28209"
}
```

```json
{
  "session_id": "12fcf882-075c-4d2e-ad09-75f6a244dcd8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjYyNSwiaWF0IjoxNzkzMjg1NzI1LCJqdGkiOiIxYjlhNTNmOC1hMGI5LTQ0NzUtODAzZi02Yzg3ZTczOTA5MTgiLCJzaWQiOiIxMmZjZjg4Mi0wNzVjLTRkMmUtYWQwOS03NWY2YTI0NGRjZDgifQ.vvjwSlwcHQVcLHQ1ljdlt3luvh2jblODlDR2mE0clXg",
  "access_expires_at": "2026-10-29T15:10:25.030802869Z",
  "refresh_token": "ib9qOXLKqw33XbZLhCNPOgLHUqgrCFCcADE97oKXQjc",
  "refresh_expires_at": "2026-11-28T14:55:25.029981205Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:11.839758Z",
  "last_location_at": "2026-10-29T14:55:11.839758Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/183cdba0-7f58-44e0-972b-42555319bd5f/handover` → **200**

```json
{
  "command_id": "33ba4713-4738-4c4f-90e6-e6649a6feb1d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:11.839758Z",
  "last_location_at": "2026-10-29T14:55:11.839758Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/183cdba0-7f58-44e0-972b-42555319bd5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:25Z",
    "sequence": 1793285725955
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:25.976866Z",
  "last_location_at": "2026-10-29T14:55:25.976866Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662264793",
  "device_ref": "sandbox-6035"
}
```

```json
{
  "challenge_id": "eaec8046-658b-475d-aa7c-af5fe5bbdfd9",
  "expires_at": "2026-10-29T15:00:26.278183172Z",
  "resend_available_at": "2026-10-29T14:55:27.278183172Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662264793` → **200**

```json
{
  "phone": "+380662264793",
  "audience": "CLIENT",
  "code": "984929",
  "sent_at": "2026-10-29T14:55:26.281604631Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eaec8046-658b-475d-aa7c-af5fe5bbdfd9",
  "code": "984929",
  "device_ref": "sandbox-6035"
}
```

```json
{
  "session_id": "feda0d5d-be64-4734-9cc4-a8461dd1719b",
  "subject": {
    "type": "CLIENT",
    "id": "1bd8bf37-cbe7-45a3-965e-87332c0dee3d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYmQ4YmYzNy1jYmU3LTQ1YTMtOTY1ZS04NzMzMmMwZGVlM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjI2LCJpYXQiOjE3OTMyODU3MjYsImp0aSI6IjZkM2JjOGQ3LWZlOTgtNGMwMC04Yjg2LWU3ODdmZGRjZjJjMCIsInNpZCI6ImZlZGEwZDVkLWJlNjQtNDczNC05Y2M0LWE4NDYxZGQxNzE5YiJ9.c9q91JAAzBVyXQYyxamyJbz4Hd7SmRy15mR1L3OhGbs",
  "access_expires_at": "2026-10-29T15:10:26.598217001Z",
  "refresh_token": "_ZLSNEAzxW2vZ_0UUbeLfkAgmv_0637ON0ks3OuN3ME",
  "refresh_expires_at": "2026-11-28T14:55:26.597407925Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1ba315d1-f73d-4ad7-af72-d2a5d2303694",
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
  "id": "770de763-55f8-4d09-9474-bbb67bdb562e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:26.906980Z",
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
  "command_id": "eded6812-c14d-4741-afe4-7017f2ed22dc",
  "quote_id": "770de763-55f8-4d09-9474-bbb67bdb562e",
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
  "id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1bd8bf37-cbe7-45a3-965e-87332c0dee3d",
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
  "created_at": "2026-10-29T14:55:27.221466Z",
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
    "id": "4b5af647-971e-4439-b25d-054b8b101a48",
    "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
    "expires_at": "2026-10-29T14:55:42.226128Z",
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

`POST /api/driver/v1/offers/4b5af647-971e-4439-b25d-054b8b101a48/accept` → **200**

```json
{
  "command_id": "5a7848af-5349-46be-84b3-51d792026616"
}
```

```json
{
  "id": "4a90af52-6b61-4275-8936-ce8078557cfd",
  "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cb10f4a6-e068-468c-81a6-719927846264",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cb10f4a6-e068-468c-81a6-719927846264",
  "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
  "assignment_id": "4a90af52-6b61-4275-8936-ce8078557cfd",
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

`POST /api/driver/v1/work-sessions/183cdba0-7f58-44e0-972b-42555319bd5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:28Z",
    "sequence": 1793285728466
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:28.485717Z",
  "last_location_at": "2026-10-29T14:55:28.485717Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cb10f4a6-e068-468c-81a6-719927846264/arrive` → **200**

```json
{
  "command_id": "06c9d266-9545-49b3-a19b-851dd325e7be",
  "expected_version": 0
}
```

```json
{
  "id": "cb10f4a6-e068-468c-81a6-719927846264",
  "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
  "assignment_id": "4a90af52-6b61-4275-8936-ce8078557cfd",
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
  "arrived_at": "2026-10-29T14:55:28.783325Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cb10f4a6-e068-468c-81a6-719927846264/start` → **200**

```json
{
  "command_id": "5bd43894-25e8-4f69-ab75-ed9f646c2f9e",
  "expected_version": 1
}
```

```json
{
  "id": "cb10f4a6-e068-468c-81a6-719927846264",
  "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
  "assignment_id": "4a90af52-6b61-4275-8936-ce8078557cfd",
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
  "arrived_at": "2026-10-29T14:55:28.783325Z",
  "started_at": "2026-10-29T14:55:29.10475Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/183cdba0-7f58-44e0-972b-42555319bd5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:29Z",
    "sequence": 1793285729407
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:29.426615Z",
  "last_location_at": "2026-10-29T14:55:29.426615Z",
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
  "device_ref": "sandbox-13706"
}
```

```json
{
  "challenge_id": "097ab4b5-2023-4857-89bc-1de3ffe53ddb",
  "expires_at": "2026-10-29T15:00:29.721474406Z",
  "resend_available_at": "2026-10-29T14:55:30.721474406Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "075188",
  "sent_at": "2026-10-29T14:55:29.724682778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "097ab4b5-2023-4857-89bc-1de3ffe53ddb",
  "code": "075188",
  "device_ref": "sandbox-13706"
}
```

```json
{
  "session_id": "0fb06f20-7870-492c-89b8-95f2a63cfff9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjYzMCwiaWF0IjoxNzkzMjg1NzMwLCJqdGkiOiIyY2Y1MzBhZC0xMTFlLTRkYjQtOGEzYy02NzViZjg5YTAwNzEiLCJzaWQiOiIwZmIwNmYyMC03ODcwLTQ5MmMtODliOC05NWYyYTYzY2ZmZjkifQ.CB2QGAWKyBFRXe4MZ9abBGPr3KneGfSqz-pVmKPqfrI",
  "access_expires_at": "2026-10-29T15:10:30.072001792Z",
  "refresh_token": "aUSo0ZxU_XaLUV_E2TYIcx1xewxiGFgtCoAPvXXPbYY",
  "refresh_expires_at": "2026-11-28T14:55:30.070598062Z",
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
  "command_id": "a11438d0-c077-490a-ab6c-7d13a290cb7e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:30Z",
    "sequence": 1793285730659
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8cdd6b3c-758c-4e8f-9fc4-e7cafd616a12",
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
  "last_heartbeat_at": "2026-10-29T14:55:30.67926Z",
  "last_location_at": "2026-10-29T14:55:30.67926Z",
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
  "session_id": "a41656ef-5b0d-474c-a411-c58f2d22c44f",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MzEsImlhdCI6MTc5MzI4NTczMSwianRpIjoiOTZkMjliOWItNWI1OC00ZTQ3LWIwYTctNDk4ZTYxYzc2ZTcxIiwic2lkIjoiYTQxNjU2ZWYtNWIwZC00NzRjLWE0MTEtYzU4ZjJkMjJjNDRmIn0.bSxsBgKC64_ck9nSPLc7dtXpXAppQE335IuwTh5N7cM",
  "access_expires_at": "2026-10-29T15:10:31.266578099Z",
  "refresh_token": "CBtpdEdJJMYUva5mT9Gqz2xjY2WdtzYUWnovo9-L0-Y",
  "refresh_expires_at": "2026-10-30T02:55:31.265879891Z",
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
  "session_id": "06f4638a-c7ba-42a3-a4c1-0b475d70ba2b",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MzEsImlhdCI6MTc5MzI4NTczMSwianRpIjoiMTZlMDk3MTgtNmFhNS00M2E3LWIxYjAtZDU5MmQxZTkzM2FlIiwic2lkIjoiMDZmNDYzOGEtYzdiYS00MmEzLWE0YzEtMGI0NzVkNzBiYTJiIn0.he1wGfL-M-DexR23EPh6IsVD3yfT_y3es8o1bLXkLlo",
  "access_expires_at": "2026-10-29T15:10:31.855065368Z",
  "refresh_token": "eEbIuqvjePJjwdI1ngKI8fHcX14V6KDU0HpT6et2LqM",
  "refresh_expires_at": "2026-10-30T02:55:31.854394794Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2276711b-62b7-4674-a2a3-94b1e9403f11` → **200**

```json
{
  "id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1bd8bf37-cbe7-45a3-965e-87332c0dee3d",
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
    "id": "4a90af52-6b61-4275-8936-ce8078557cfd",
    "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "cb10f4a6-e068-468c-81a6-719927846264",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T14:55:27.221466Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2276711b-62b7-4674-a2a3-94b1e9403f11/interrupt` → **200**

```json
{
  "command_id": "8b9fae59-1c58-4030-9f21-7caabbec7877",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1bd8bf37-cbe7-45a3-965e-87332c0dee3d",
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
      "id": "4a90af52-6b61-4275-8936-ce8078557cfd",
      "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "cb10f4a6-e068-468c-81a6-719927846264",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T14:55:27.221466Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1bd8bf37-cbe7-45a3-965e-87332c0dee3d",
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
    "id": "cd3b90c1-e383-491a-adea-41e93d1deb94",
    "order_id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
    "expires_at": "2026-10-29T14:55:47.507922Z",
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

`POST /api/driver/v1/offers/cd3b90c1-e383-491a-adea-41e93d1deb94/accept` → **200**

```json
{
  "command_id": "4ed87c57-fdae-4e74-a117-946ad9bdf1b4"
}
```

```json
{
  "id": "a5341f11-ac78-4edb-aea4-a7e627ead878",
  "order_id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7f5a1371-5c6b-407d-8145-74e39e00edaf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7f5a1371-5c6b-407d-8145-74e39e00edaf",
  "order_id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
  "assignment_id": "a5341f11-ac78-4edb-aea4-a7e627ead878",
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
  "session_id": "8cdd6b3c-758c-4e8f-9fc4-e7cafd616a12",
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
  "last_heartbeat_at": "2026-10-29T14:55:30.67926Z",
  "last_location_at": "2026-10-29T14:55:30.67926Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8cdd6b3c-758c-4e8f-9fc4-e7cafd616a12/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:34Z",
    "sequence": 1793285734499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8cdd6b3c-758c-4e8f-9fc4-e7cafd616a12",
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
  "last_heartbeat_at": "2026-10-29T14:55:34.070371Z",
  "last_location_at": "2026-10-29T14:55:34.070371Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7f5a1371-5c6b-407d-8145-74e39e00edaf/arrive` → **200**

```json
{
  "command_id": "cf6bc8bb-619f-48e3-9423-0d5dac1e1ef0",
  "expected_version": 0
}
```

```json
{
  "id": "7f5a1371-5c6b-407d-8145-74e39e00edaf",
  "order_id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
  "assignment_id": "a5341f11-ac78-4edb-aea4-a7e627ead878",
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
  "arrived_at": "2026-10-29T14:55:34.385175Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7f5a1371-5c6b-407d-8145-74e39e00edaf/start` → **200**

```json
{
  "command_id": "de4b90a2-0626-4248-81b9-d968d89d07f7",
  "expected_version": 1
}
```

```json
{
  "id": "7f5a1371-5c6b-407d-8145-74e39e00edaf",
  "order_id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
  "assignment_id": "a5341f11-ac78-4edb-aea4-a7e627ead878",
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
  "arrived_at": "2026-10-29T14:55:34.385175Z",
  "started_at": "2026-10-29T14:55:34.68973Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7f5a1371-5c6b-407d-8145-74e39e00edaf/complete` → **200**

```json
{
  "command_id": "fc0e3b20-3d55-4895-aaa7-ff24a5752c7d",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:55:34Z"
}
```

```json
{
  "id": "7f5a1371-5c6b-407d-8145-74e39e00edaf",
  "order_id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
  "assignment_id": "a5341f11-ac78-4edb-aea4-a7e627ead878",
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
  "arrived_at": "2026-10-29T14:55:34.385175Z",
  "started_at": "2026-10-29T14:55:34.68973Z",
  "completed_at": "2026-10-29T14:55:35.011484Z",
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
    "id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:55:32.498215Z",
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
    "id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:55:27.221466Z",
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
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
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

`GET /api/operator/v1/orders/2276711b-62b7-4674-a2a3-94b1e9403f11/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:55:27.222301Z",
      "actor": {
        "type": "CLIENT",
        "id": "1bd8bf37-cbe7-45a3-965e-87332c0dee3d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
        "quote_id": "770de763-55f8-4d09-9474-bbb67bdb562e",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "0e401c8f-2a5a-4493-93de-a5fee1f6b85a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:55:27.225121Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
        "attempt_id": "14ab82dd-da9a-4868-82f4-399f0efaf967",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0e401c8f-2a5a-4493-93de-a5fee1f6b85a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:55:27.23356Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4b5af647-971e-4439-b25d-054b8b101a48",
        "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "0e401c8f-2a5a-4493-93de-a5fee1f6b85a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:55:27.870893Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4b5af647-971e-4439-b25d-054b8b101a48",
        "order_id": "2276711b-62b7-4674-a2a3-94b1e9403f11",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4a90af52-6b61-4275-8936-ce8078557cfd"
      },
      "correlation_id": "3bf63f3f-e615-4c9c-8986-c1eddabca211"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/858cbfef-ce16-4311-adf9-d4115f2c39f9/tip` → **200**

```json
{
  "order_id": "858cbfef-ce16-4311-adf9-d4115f2c39f9",
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
  "available_until": "2026-10-30T14:55:35.011484Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/858cbfef-ce16-4311-adf9-d4115f2c39f9/tip` → **409**

```json
{
  "command_id": "a89e4d80-0292-4645-bc35-d9a803d22f74",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/858cbfef-ce16-4311-adf9-d4115f2c39f9/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e988d8a6-1f1e-471d-a983-7ba71ccd6d4d"
}
```

Done: interrupted 2276711b-62b7-4674-a2a3-94b1e9403f11, follow-up 858cbfef-ce16-4311-adf9-d4115f2c39f9.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "183cdba0-7f58-44e0-972b-42555319bd5f",
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
  "last_heartbeat_at": "2026-10-29T14:55:29.426615Z",
  "last_location_at": "2026-10-29T14:55:29.426615Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/183cdba0-7f58-44e0-972b-42555319bd5f/close` → **200**

```json
{
  "command_id": "937fc215-cfcd-45b5-ac55-6e484399cae8",
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
  "session_id": "8cdd6b3c-758c-4e8f-9fc4-e7cafd616a12",
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
  "last_heartbeat_at": "2026-10-29T14:55:34.070371Z",
  "last_location_at": "2026-10-29T14:55:34.070371Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8cdd6b3c-758c-4e8f-9fc4-e7cafd616a12/close` → **200**

```json
{
  "command_id": "d1290b27-0d34-47bb-a992-729de0c0c797",
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
  "session_id": "42b0eb72-33d6-4d61-8fe0-2ba2e1e2538c",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NDEsImlhdCI6MTc5MzI4NTc0MSwianRpIjoiNjA5ODAxZTEtZTU2Mi00NWNmLWE1NjMtOWJjNjY3NDIyZmIxIiwic2lkIjoiNDJiMGViNzItMzNkNi00ZDYxLThmZTAtMmJhMmUxZTI1MzhjIn0.rMmUsAYMe36itN3WU_DgkPqzvIdeBrFqmB3jsufV_0E",
  "access_expires_at": "2026-10-29T15:10:41.416795083Z",
  "refresh_token": "JBDnSwxeGrJ-NE3uGre0Ay6ABe7nO2ejjduv1_OzwH0",
  "refresh_expires_at": "2026-10-30T02:55:41.416123188Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5484e0e3-e83f-4258-9ea9-68c16078b21e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:55:41Z"
}
```

```json
{
  "id": "85cfe091-d4ee-4e02-b968-b587a68bd7b6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:55:41Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/85cfe091-d4ee-4e02-b968-b587a68bd7b6/publish` → **200**

```json
{
  "command_id": "15f68992-3e71-4067-a002-e1962802e745",
  "expected_version": 0
}
```

```json
{
  "id": "85cfe091-d4ee-4e02-b968-b587a68bd7b6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:55:42.04887Z",
  "published_at": "2026-10-29T14:55:42.04887Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "85cfe091-d4ee-4e02-b968-b587a68bd7b6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T14:55:42.04887Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632440101",
  "device_ref": "sandbox-26860"
}
```

```json
{
  "challenge_id": "d9d031ab-e305-4f48-87e0-83620633570d",
  "expires_at": "2026-10-29T15:00:42.63994802Z",
  "resend_available_at": "2026-10-29T14:55:43.63994802Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632440101` → **200**

```json
{
  "phone": "+380632440101",
  "audience": "CLIENT",
  "code": "737919",
  "sent_at": "2026-10-29T14:55:42.642581411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9d031ab-e305-4f48-87e0-83620633570d",
  "code": "737919",
  "device_ref": "sandbox-26860"
}
```

```json
{
  "session_id": "dc2b5df6-0535-499a-b74c-3dc1d2fc01d7",
  "subject": {
    "type": "CLIENT",
    "id": "4d50106d-37fe-4885-ab49-c0910505174d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDUwMTA2ZC0zN2ZlLTQ4ODUtYWI0OS1jMDkxMDUwNTE3NGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjQyLCJpYXQiOjE3OTMyODU3NDIsImp0aSI6IjA5YzM2NjMzLTA5ZDItNGNmOS05MGNlLTM3NjllYzg0MjE4NiIsInNpZCI6ImRjMmI1ZGY2LTA1MzUtNDk5YS1iNzRjLTNkYzFkMmZjMDFkNyJ9.xAlXkgn0oME9ySKQFq1orWXtTZX3hQCLjg3GFI5GKKo",
  "access_expires_at": "2026-10-29T15:10:42.96585658Z",
  "refresh_token": "wOlgvIbgcz4Izj9isgKAWQMqaGBMSe_IZl9KQxNDF6w",
  "refresh_expires_at": "2026-11-28T14:55:42.965207468Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "85cfe091-d4ee-4e02-b968-b587a68bd7b6",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T14:55:42.04887Z",
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
  "command_id": "5cd720f5-f015-4569-9a19-4dd3e69b71df",
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
  "id": "42d0a815-e206-4bca-9dc9-41d5fbd55892",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:43.543686Z",
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
  "command_id": "93794734-d3a1-4137-9dea-7dfe7db13c5c",
  "quote_id": "42d0a815-e206-4bca-9dc9-41d5fbd55892",
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
  "correlation_id": "6d52d69f-9661-4d1f-9c78-4747353a47eb"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "e7eb9fca-105f-4414-b386-4b40c990c817",
  "version_id": "85cfe091-d4ee-4e02-b968-b587a68bd7b6",
  "language": "uk"
}
```

```json
{
  "version_id": "85cfe091-d4ee-4e02-b968-b587a68bd7b6",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T14:55:44.163603Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d002443f-f76e-4c89-9471-0c48f6536a40",
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
  "id": "9895b58d-c9ec-4dae-9d0f-1944c4ea03c8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:44.467172Z",
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
  "command_id": "f5876e30-6390-45da-9625-074ef8a7fd88",
  "quote_id": "9895b58d-c9ec-4dae-9d0f-1944c4ea03c8",
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
  "id": "97ea2bff-e6ff-48df-804f-6c9b4b81b95f",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d50106d-37fe-4885-ab49-c0910505174d",
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
  "created_at": "2026-10-29T14:55:44.783731Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/97ea2bff-e6ff-48df-804f-6c9b4b81b95f` → **200**

```json
{
  "id": "97ea2bff-e6ff-48df-804f-6c9b4b81b95f",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4d50106d-37fe-4885-ab49-c0910505174d",
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
  "created_at": "2026-10-29T14:55:44.783731Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/97ea2bff-e6ff-48df-804f-6c9b4b81b95f/cancel` → **200**

```json
{
  "command_id": "178dfdba-c57f-42d0-a252-c73542ee1640",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "97ea2bff-e6ff-48df-804f-6c9b4b81b95f",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4d50106d-37fe-4885-ab49-c0910505174d",
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
  "created_at": "2026-10-29T14:55:44.783731Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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

`POST /api/admin/v1/legal-documents/85cfe091-d4ee-4e02-b968-b587a68bd7b6` → **409**

```json
{
  "command_id": "66931e0e-a1e8-4ea5-aba3-f160e4d46cda",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:55:45Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/85cfe091-d4ee-4e02-b968-b587a68bd7b6",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3d61c139-a557-4aa4-aee3-164ec6b32992"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "68ca846c-8822-400d-a973-2953379aa70e",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:55:46Z"
}
```

```json
{
  "id": "51ccbb75-fe6c-45b2-abe4-e32c25349f7a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:55:46Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/51ccbb75-fe6c-45b2-abe4-e32c25349f7a/publish` → **200**

```json
{
  "command_id": "9442dbe0-1a43-4174-865c-d377d01d5667",
  "expected_version": 0
}
```

```json
{
  "id": "51ccbb75-fe6c-45b2-abe4-e32c25349f7a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:55:46.372283Z",
  "published_at": "2026-10-29T14:55:46.372283Z",
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
  "device_ref": "sandbox-8265"
}
```

```json
{
  "challenge_id": "95f1632d-128a-4bcf-b205-881cf934d22d",
  "expires_at": "2026-10-29T15:00:46.675667937Z",
  "resend_available_at": "2026-10-29T14:55:47.675667937Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "023459",
  "sent_at": "2026-10-29T14:55:46.678570038Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95f1632d-128a-4bcf-b205-881cf934d22d",
  "code": "023459",
  "device_ref": "sandbox-8265"
}
```

```json
{
  "session_id": "1c3805bc-3d11-4657-8fd2-d6b31200498b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjY0NywiaWF0IjoxNzkzMjg1NzQ3LCJqdGkiOiIzOGYyOTE4OS0yMTZlLTQyOTMtOGQ0NC1mNWJkYjU5ZTUxOGMiLCJzaWQiOiIxYzM4MDViYy0zZDExLTQ2NTctOGZkMi1kNmIzMTIwMDQ5OGIifQ.ReJBBA6PFA8FW7J6I09jvplnnDO5fXjwOqCFYcbSAaI",
  "access_expires_at": "2026-10-29T15:10:47.00169445Z",
  "refresh_token": "RcGOVspXqtA8Nbk0c4Grzij0xYUSWescbrXkL3OLPgE",
  "refresh_expires_at": "2026-11-28T14:55:47.001087132Z",
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
  "command_id": "fcd137ae-9445-4d8c-9a48-63a2fd4d0353",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:47Z",
    "sequence": 1793285747587
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a1335dc3-b6df-4af9-8e63-58b7ff0d4099",
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
  "last_heartbeat_at": "2026-10-29T14:55:47.608344Z",
  "last_location_at": "2026-10-29T14:55:47.608344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678159341",
  "device_ref": "sandbox-27195"
}
```

```json
{
  "challenge_id": "e2e8581f-97d0-4e2e-b0a9-3f4ccac104c2",
  "expires_at": "2026-10-29T15:00:47.896560968Z",
  "resend_available_at": "2026-10-29T14:55:48.896560968Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678159341` → **200**

```json
{
  "phone": "+380678159341",
  "audience": "CLIENT",
  "code": "122104",
  "sent_at": "2026-10-29T14:55:47.899576882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2e8581f-97d0-4e2e-b0a9-3f4ccac104c2",
  "code": "122104",
  "device_ref": "sandbox-27195"
}
```

```json
{
  "session_id": "e9d25d2a-7178-4c02-a213-9b2fb1a8f600",
  "subject": {
    "type": "CLIENT",
    "id": "bcd15339-a7f7-487d-bb65-a522719bc378"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiY2QxNTMzOS1hN2Y3LTQ4N2QtYmI2NS1hNTIyNzE5YmMzNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjQ4LCJpYXQiOjE3OTMyODU3NDgsImp0aSI6ImY1Y2I0MTk3LTRmY2MtNGViMi04NDk4LWQ4ZDQxN2I4ZDRkYyIsInNpZCI6ImU5ZDI1ZDJhLTcxNzgtNGMwMi1hMjEzLTliMmZiMWE4ZjYwMCJ9.6-rRsoTdbaDIGDfC8VyXBw5J9BAZY-R0PFdFR4bZ8-g",
  "access_expires_at": "2026-10-29T15:10:48.214199038Z",
  "refresh_token": "_zhuxWlFGxEsHDbGlRyMMvJSyZN388yug9_8Zn0LLx4",
  "refresh_expires_at": "2026-11-28T14:55:48.213594866Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "71cf0860-7780-4ee2-9f95-2505131fa528",
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
  "id": "e2b0dfd5-2e14-4dc3-8c41-b51f5e7e3a37",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:48.520390Z",
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
  "command_id": "12252db7-0298-45e1-89ef-e5afcada22ef",
  "quote_id": "e2b0dfd5-2e14-4dc3-8c41-b51f5e7e3a37",
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
    "phone": "+380677586559"
  }
}
```

```json
{
  "id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:55:48.827409Z",
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
    "id": "3032626d-c3ad-4d44-bf9a-46eaa4c8c322",
    "order_id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
    "expires_at": "2026-10-29T14:56:03.830845Z",
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

`POST /api/driver/v1/offers/3032626d-c3ad-4d44-bf9a-46eaa4c8c322/accept` → **200**

```json
{
  "command_id": "071609a7-eb93-4fc9-bbdc-3dff80873cc2"
}
```

```json
{
  "id": "e5323a83-d220-4316-9f68-cd2d7a6973be",
  "order_id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "129b051f-de58-47f2-bcbd-076795877377",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "129b051f-de58-47f2-bcbd-076795877377",
  "order_id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
  "assignment_id": "e5323a83-d220-4316-9f68-cd2d7a6973be",
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
    "phone": "+380677586559"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cc47a460-8672-4037-9df2-8eb143b9e534",
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
  "id": "d168fce5-665d-47d3-a81c-53813def6a6f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:50.139649Z",
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
  "command_id": "580e22a4-a26d-4ac3-9422-373207642446",
  "quote_id": "d168fce5-665d-47d3-a81c-53813def6a6f",
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
  "id": "f28d42c5-dd43-43c9-a194-7ce7e4dfd9c1",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:55:50.485746Z",
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
  "command_id": "3fd5e03a-ec20-48e2-91b0-5604c9c7a715",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T17:55:50Z"
}
```

```json
{
  "id": "37bf4882-7b5b-49b3-987e-57ab057d4254",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:50.807485Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:55:50Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9bcd8efa-83be-4eb7-a23e-89be21dea5ef",
  "quote_id": "37bf4882-7b5b-49b3-987e-57ab057d4254",
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
  "pickup_at": "2026-10-29T17:55:50Z"
}
```

```json
{
  "id": "c875c3a9-8c9d-4965-8520-19c94e7c8c13",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:55:51.112341Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:55:50Z",
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
  "command_id": "ad14a70b-92de-45cd-8c5b-500c879d72db",
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
  "id": "95e398e0-918b-47d5-b25e-aaa94890637c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:51.429902Z",
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
  "command_id": "7268e6f6-75e4-49aa-8aac-8262df643406",
  "quote_id": "95e398e0-918b-47d5-b25e-aaa94890637c",
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
  "correlation_id": "09a5cd34-9836-44e6-9344-1c2cbd14fc1a"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "c875c3a9-8c9d-4965-8520-19c94e7c8c13",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T14:55:51.112341Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T17:55:50Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f28d42c5-dd43-43c9-a194-7ce7e4dfd9c1",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T14:55:50.485746Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "f28d42c5-dd43-43c9-a194-7ce7e4dfd9c1",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:55:50.485746Z",
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

`GET /api/rider/v1/orders/2f1afc89-ee3c-4495-897b-01f7abf5f796` → **200**

```json
{
  "id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e5323a83-d220-4316-9f68-cd2d7a6973be",
    "order_id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "129b051f-de58-47f2-bcbd-076795877377",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:55:48.827409Z",
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
    "location_at": "2026-10-29T14:55:47.608344Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/2f1afc89-ee3c-4495-897b-01f7abf5f796/cancel` → **200**

```json
{
  "command_id": "4e0e4c36-491c-402c-a46e-116128278d52",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e5323a83-d220-4316-9f68-cd2d7a6973be",
    "order_id": "2f1afc89-ee3c-4495-897b-01f7abf5f796",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "129b051f-de58-47f2-bcbd-076795877377",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:55:48.827409Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/f28d42c5-dd43-43c9-a194-7ce7e4dfd9c1` → **200**

```json
{
  "id": "f28d42c5-dd43-43c9-a194-7ce7e4dfd9c1",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:55:50.485746Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f28d42c5-dd43-43c9-a194-7ce7e4dfd9c1/cancel` → **200**

```json
{
  "command_id": "feef20fd-8bc4-4258-b5ea-1ade49e4f2c3",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f28d42c5-dd43-43c9-a194-7ce7e4dfd9c1",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:55:50.485746Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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

`GET /api/rider/v1/orders/c875c3a9-8c9d-4965-8520-19c94e7c8c13` → **200**

```json
{
  "id": "c875c3a9-8c9d-4965-8520-19c94e7c8c13",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:55:51.112341Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:55:50Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c875c3a9-8c9d-4965-8520-19c94e7c8c13/cancel` → **200**

```json
{
  "command_id": "dd198416-bd78-416b-9f46-1f01fc817ae2",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c875c3a9-8c9d-4965-8520-19c94e7c8c13",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "bcd15339-a7f7-487d-bb65-a522719bc378",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:55:51.112341Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-29T17:55:50Z",
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
  "session_id": "a1335dc3-b6df-4af9-8e63-58b7ff0d4099",
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
  "last_heartbeat_at": "2026-10-29T14:55:47.608344Z",
  "last_location_at": "2026-10-29T14:55:47.608344Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1335dc3-b6df-4af9-8e63-58b7ff0d4099/close` → **200**

```json
{
  "command_id": "c1e14f8d-3147-4438-9aba-73216d6e6498",
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

Done: orders 2f1afc89-ee3c-4495-897b-01f7abf5f796, f28d42c5-dd43-43c9-a194-7ce7e4dfd9c1, c875c3a9-8c9d-4965-8520-19c94e7c8c13.

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
  "session_id": "1c734d18-f6a7-4451-9f23-103bd3a6e1ce",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NTUsImlhdCI6MTc5MzI4NTc1NSwianRpIjoiNWI4YTRhYWQtMjcyYi00Mjk2LTg5MzItYTJiODg5ZTFmNzZhIiwic2lkIjoiMWM3MzRkMTgtZjZhNy00NDUxLTlmMjMtMTAzYmQzYTZlMWNlIn0.QRWDyH9u_eQqqql0rHo1QsiHlSaqnnJTYHfAWbK5wZM",
  "access_expires_at": "2026-10-29T15:10:55.401177198Z",
  "refresh_token": "zRrcv-RfpUKgZJbQtdmgWSpscH2jGD3_Pd2qr4LSiLk",
  "refresh_expires_at": "2026-10-30T02:55:55.400587523Z",
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
  "session_id": "c1e0a062-3f1f-4c04-8298-739eddbdea93",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NTUsImlhdCI6MTc5MzI4NTc1NSwianRpIjoiN2U3NjU3YmYtOGYyZC00YWEwLWFhMDMtYTE4OTk3NDQ0ZDE1Iiwic2lkIjoiYzFlMGEwNjItM2YxZi00YzA0LTgyOTgtNzM5ZWRkYmRlYTkzIn0.qNLIAMnSF3AHo0tKKm1u6vG_8k1XkRBRfmph9xUDKDk",
  "access_expires_at": "2026-10-29T15:10:55.9955216Z",
  "refresh_token": "2O3Xzdu2jHyZ0NTd8JXXHvAqKit8MDMLnkA4-CTinj4",
  "refresh_expires_at": "2026-10-30T02:55:55.994913221Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19961"
}
```

```json
{
  "challenge_id": "a40222d2-0cec-4d0d-8627-4993989f69d0",
  "expires_at": "2026-10-29T15:00:56.285239637Z",
  "resend_available_at": "2026-10-29T14:55:57.285239637Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "684981",
  "sent_at": "2026-10-29T14:55:56.288177982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a40222d2-0cec-4d0d-8627-4993989f69d0",
  "code": "684981",
  "device_ref": "sandbox-19961"
}
```

```json
{
  "session_id": "41e2572a-5aa9-4127-b528-473db589347b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjY1NiwiaWF0IjoxNzkzMjg1NzU2LCJqdGkiOiI3MTczMWViZi02M2NlLTQxOWItYTNjYy1iYjQxMGEyYzNhMmQiLCJzaWQiOiI0MWUyNTcyYS01YWE5LTQxMjctYjUyOC00NzNkYjU4OTM0N2IifQ.vx9lkMhWkc_33xxSyivA4nHZ4z8sQ-glzHVmkUtmHTM",
  "access_expires_at": "2026-10-29T15:10:56.609512221Z",
  "refresh_token": "FwJri3jTj2aWaqPYIHLlIDtShFYhjrbLqO9_2_tl-xs",
  "refresh_expires_at": "2026-11-28T14:55:56.608857194Z",
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
  "command_id": "6f064e27-d1ff-4918-acd7-6038b5a129dd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:57Z",
    "sequence": 1793285757191
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87ceb062-e49d-4e7f-84fa-00dfbaa3acb8",
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
  "last_heartbeat_at": "2026-10-29T14:55:57.210779Z",
  "last_location_at": "2026-10-29T14:55:57.210779Z",
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
  "command_id": "86bd513e-053e-4791-a426-1b0c4ac69e0b",
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
  "effective_at": "2026-10-29T14:55:57.812335Z",
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T14:53:05.603085Z",
  "last_entries": [
    {
      "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:53:05.603085Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bcb11093-2e75-411b-a341-8b4c21156749",
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
  "id": "133a508c-a49b-4cce-a8bb-193c85af2e29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:58.429894Z",
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
  "command_id": "4974ea0e-58c8-4cee-8282-377620f9d563",
  "quote_id": "133a508c-a49b-4cce-a8bb-193c85af2e29",
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
    "phone": "+3806711123435"
  }
}
```

```json
{
  "id": "675f4f59-6027-45e5-881f-df51b4dde30d",
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
  "created_at": "2026-10-29T14:55:58.730969Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123435"
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
    "id": "e14a32c6-1d91-4fad-b430-85df80543019",
    "order_id": "675f4f59-6027-45e5-881f-df51b4dde30d",
    "expires_at": "2026-10-29T14:56:13.734771Z",
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

`POST /api/driver/v1/offers/e14a32c6-1d91-4fad-b430-85df80543019/accept` → **200**

```json
{
  "command_id": "357d67e6-33e5-4fb4-b8c3-e12c0d0c65af"
}
```

```json
{
  "id": "f9570b46-f790-4a1e-a93c-7ad78ada26b3",
  "order_id": "675f4f59-6027-45e5-881f-df51b4dde30d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9437fddd-1c83-49ae-8f71-7aa0933c6a15",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9437fddd-1c83-49ae-8f71-7aa0933c6a15",
  "order_id": "675f4f59-6027-45e5-881f-df51b4dde30d",
  "assignment_id": "f9570b46-f790-4a1e-a93c-7ad78ada26b3",
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
    "phone": "+3806711123435"
  }
}
```

`POST /api/driver/v1/work-sessions/87ceb062-e49d-4e7f-84fa-00dfbaa3acb8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:59Z",
    "sequence": 1793285759933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87ceb062-e49d-4e7f-84fa-00dfbaa3acb8",
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
  "last_heartbeat_at": "2026-10-29T14:55:59.953401Z",
  "last_location_at": "2026-10-29T14:55:59.953401Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9437fddd-1c83-49ae-8f71-7aa0933c6a15/arrive` → **200**

```json
{
  "command_id": "f7fb50cd-05aa-49e9-b100-cf434e4050e9",
  "expected_version": 0
}
```

```json
{
  "id": "9437fddd-1c83-49ae-8f71-7aa0933c6a15",
  "order_id": "675f4f59-6027-45e5-881f-df51b4dde30d",
  "assignment_id": "f9570b46-f790-4a1e-a93c-7ad78ada26b3",
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
  "arrived_at": "2026-10-29T14:56:00.255841Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123435"
  }
}
```

`POST /api/driver/v1/trips/9437fddd-1c83-49ae-8f71-7aa0933c6a15/start` → **200**

```json
{
  "command_id": "f0f3276a-baab-4114-ae80-a82089dcc6ef",
  "expected_version": 1
}
```

```json
{
  "id": "9437fddd-1c83-49ae-8f71-7aa0933c6a15",
  "order_id": "675f4f59-6027-45e5-881f-df51b4dde30d",
  "assignment_id": "f9570b46-f790-4a1e-a93c-7ad78ada26b3",
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
  "arrived_at": "2026-10-29T14:56:00.255841Z",
  "started_at": "2026-10-29T14:56:00.57182Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711123435"
  }
}
```

`POST /api/driver/v1/trips/9437fddd-1c83-49ae-8f71-7aa0933c6a15/complete` → **200**

```json
{
  "command_id": "a3e307c2-1947-4fb9-9d65-dcd653c7cf9c",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:56:00Z",
  "cash_received": true
}
```

```json
{
  "id": "9437fddd-1c83-49ae-8f71-7aa0933c6a15",
  "order_id": "675f4f59-6027-45e5-881f-df51b4dde30d",
  "assignment_id": "f9570b46-f790-4a1e-a93c-7ad78ada26b3",
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
  "arrived_at": "2026-10-29T14:56:00.255841Z",
  "started_at": "2026-10-29T14:56:00.57182Z",
  "completed_at": "2026-10-29T14:56:00.916731Z",
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
  "command_id": "838fbfa5-1494-4873-bbd1-12935ead154c",
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
  "id": "dc5bf661-926f-41d1-802d-bcb30566f088",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:01:01.231325Z",
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
  "command_id": "2a25a18f-ce32-4eb3-bfc7-621b3dcda470",
  "quote_id": "dc5bf661-926f-41d1-802d-bcb30566f088",
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
    "phone": "+3806711118478"
  }
}
```

```json
{
  "id": "b1611451-3113-43a4-a121-99276ed2b604",
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
  "created_at": "2026-10-29T14:56:01.543942Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118478"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b1611451-3113-43a4-a121-99276ed2b604` → **200**

```json
{
  "id": "b1611451-3113-43a4-a121-99276ed2b604",
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
  "created_at": "2026-10-29T14:56:01.543942Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118478"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b1611451-3113-43a4-a121-99276ed2b604/cancel` → **200**

```json
{
  "command_id": "9f3d8359-e30a-4415-a3b0-06f6b47ab730",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "b1611451-3113-43a4-a121-99276ed2b604",
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
  "created_at": "2026-10-29T14:56:01.543942Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118478"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
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
  "staff_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T14:53:05.603085Z",
  "last_entries": [
    {
      "order_id": "b1611451-3113-43a4-a121-99276ed2b604",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T14:56:02.186902Z"
    },
    {
      "order_id": "675f4f59-6027-45e5-881f-df51b4dde30d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T14:56:00.922549Z"
    },
    {
      "order_id": "e5329273-6d04-4f59-8720-502afd4b8dda",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:53:05.603085Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "87ceb062-e49d-4e7f-84fa-00dfbaa3acb8",
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
  "last_heartbeat_at": "2026-10-29T14:55:59.953401Z",
  "last_location_at": "2026-10-29T14:55:59.953401Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/87ceb062-e49d-4e7f-84fa-00dfbaa3acb8/close` → **200**

```json
{
  "command_id": "c9502805-a660-46d0-bec0-49ca99e8f3e4",
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

Done: operator bonus for fulfilled 675f4f59-6027-45e5-881f-df51b4dde30d and operator-fault cancellation b1611451-3113-43a4-a121-99276ed2b604.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672036672",
  "device_ref": "sandbox-21434"
}
```

```json
{
  "challenge_id": "b632b6e5-faa0-4278-ab13-6e34d1c12430",
  "expires_at": "2026-10-29T15:01:06.655525836Z",
  "resend_available_at": "2026-10-29T14:56:07.655525836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672036672` → **200**

```json
{
  "phone": "+380672036672",
  "audience": "CLIENT",
  "code": "066631",
  "sent_at": "2026-10-29T14:56:06.658149984Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670035841",
  "device_ref": "sandbox-14952",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "8028b673-7e2e-4e1b-897c-ad1ce2f71d89",
  "expires_at": "2026-10-29T15:01:08.198486653Z",
  "resend_available_at": "2026-10-29T14:56:09.198486653Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670035841` → **200**

```json
{
  "phone": "+380670035841",
  "audience": "CLIENT",
  "code": "397998",
  "sent_at": "2026-10-29T14:56:08.200601667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670035841",
  "device_ref": "sandbox-23950",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "bce2652b-1186-4f2f-a416-5afe08733b65",
  "expires_at": "2026-10-29T15:01:09.717848848Z",
  "resend_available_at": "2026-10-29T14:56:10.717848848Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670035841` → **200**

```json
{
  "phone": "+380670035841",
  "audience": "CLIENT",
  "code": "680443",
  "sent_at": "2026-10-29T14:56:09.72076376Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674270000",
  "device_ref": "sandbox-11367"
}
```

```json
{
  "challenge_id": "602a6f20-c1c2-46fa-a53f-33ce7c9e8288",
  "expires_at": "2026-10-29T15:01:11.236622671Z",
  "resend_available_at": "2026-10-29T14:56:12.236622671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674270000",
  "device_ref": "sandbox-28190"
}
```

```json
{
  "challenge_id": "c82d3351-001e-4240-9c9b-eefbe4cf77eb",
  "expires_at": "2026-10-29T15:01:12.745453076Z",
  "resend_available_at": "2026-10-29T14:56:13.745453076Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674270000` → **200**

```json
{
  "phone": "+380674270000",
  "audience": "CLIENT",
  "code": "958509",
  "sent_at": "2026-10-29T14:56:12.748665077Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674270000",
  "device_ref": "sandbox-8039",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "02be35ef-92b6-4c64-903b-6ddda4d12538",
  "expires_at": "2026-10-29T15:01:14.291111364Z",
  "resend_available_at": "2026-10-29T14:56:15.291111364Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674270000` → **200**

```json
{
  "phone": "+380674270000",
  "audience": "CLIENT",
  "code": "849804",
  "sent_at": "2026-10-29T14:56:14.293783065Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380674270000",
  "device_ref": "sandbox-5426",
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
  "correlation_id": "8e6ce66a-4731-4fec-ac52-0758868c4945",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000023811"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "8b2f6497-e616-4c90-9162-2fc5ffe2bc34"
}
```

`GET /sandbox/v1/otp?phone=%2B442000023811` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120014357"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "e3f33e88-1ee3-4923-be51-386971fb5cf3"
}
```

`GET /sandbox/v1/otp?phone=%2B37120014357` → **404**

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
  "session_id": "4c03ecd5-48b1-4836-9eeb-1eb6e2ca491c",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NzcsImlhdCI6MTc5MzI4NTc3NywianRpIjoiMjE5YzRhODItOWQ1ZC00YmVlLWFlMDItNzg2N2FlOTA1NDk3Iiwic2lkIjoiNGMwM2VjZDUtNDhiMS00ODM2LTllZWItMWViNmUyY2E0OTFjIn0.Ec597zilQSoMB7OJtSJp9f4cruF-glcq_jM16SzrRhc",
  "access_expires_at": "2026-10-29T15:11:17.048816818Z",
  "refresh_token": "pvJI7in8rlMhJnG3xpxU09Q29I-P6YME_ThKNSLvYT8",
  "refresh_expires_at": "2026-10-30T02:56:17.048288959Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674270000` → **200**

```json
{
  "deliveries": [
    {
      "id": "54aafc54-6d8b-4209-bd1b-d0dcd235a727",
      "challenge_id": "02be35ef-92b6-4c64-903b-6ddda4d12538",
      "phone": "+380674270000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-fe45fca0-3205-4b41-aced-e724c2fb2d58",
      "error": null,
      "attempted_at": "2026-10-29T14:56:14.294344Z"
    },
    {
      "id": "24b6f6b5-bb54-45f6-b0da-401595577d27",
      "challenge_id": "c82d3351-001e-4240-9c9b-eefbe4cf77eb",
      "phone": "+380674270000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-404a6121-7f47-4501-b000-079eb2a913b3",
      "error": null,
      "attempted_at": "2026-10-29T14:56:12.749191Z"
    },
    {
      "id": "7c762489-367a-4ab6-9d31-337209e6b021",
      "challenge_id": "602a6f20-c1c2-46fa-a53f-33ce7c9e8288",
      "phone": "+380674270000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T14:56:11.239921Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674270000` → **200**

```json
{
  "phone": "+380674270000",
  "audience": "CLIENT",
  "code": "849804",
  "sent_at": "2026-10-29T14:56:14.293783065Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670035841` → **200**

```json
{
  "deliveries": [
    {
      "id": "7fc33a2c-970c-43ca-a370-bf6b24283ccd",
      "challenge_id": "bce2652b-1186-4f2f-a416-5afe08733b65",
      "phone": "+380670035841",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8a26ea4a-1b55-4720-9f68-5233066bcc2f",
      "error": null,
      "attempted_at": "2026-10-29T14:56:09.721278Z"
    },
    {
      "id": "f96e29c0-89e4-44fd-a53e-edc1c8bd46fd",
      "challenge_id": "8028b673-7e2e-4e1b-897c-ad1ce2f71d89",
      "phone": "+380670035841",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-122e037a-f31d-4dee-974b-51102fadc35b",
      "error": null,
      "attempted_at": "2026-10-29T14:56:08.201058Z"
    }
  ]
}
```

Done: SMS to +380672036672; SMS then a call to +380670035841; a failed SMS, two calls and a refused third to +380674270000; +44 and +371 refused.

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
  "session_id": "bbc1a081-a97c-48cd-b697-1168cdc8ea12",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NzgsImlhdCI6MTc5MzI4NTc3OCwianRpIjoiMmU4NjMzNGYtYzU4Ni00ZmUzLTg1NTQtZjJjODZiYTIxYTk1Iiwic2lkIjoiYmJjMWEwODEtYTk3Yy00OGNkLWI2OTctMTE2OGNkYzhlYTEyIn0.2NYlq9vbP20KuZf2Rs1tgq5mMHPvfPgtbfjYzEnuS_I",
  "access_expires_at": "2026-10-29T15:11:18.276866356Z",
  "refresh_token": "KH9FaetG1pe9h1p8MHV3HyG8rKtC2Pp4OfBq-CU71bU",
  "refresh_expires_at": "2026-10-30T02:56:18.275997007Z",
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
  "session_id": "72badd12-e568-433b-80cd-78c4198b5025",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NzgsImlhdCI6MTc5MzI4NTc3OCwianRpIjoiZmY0M2E4YmQtNTdhYS00MTdhLWIwNGEtNTZjNTM3MGQ4NWU0Iiwic2lkIjoiNzJiYWRkMTItZTU2OC00MzNiLTgwY2QtNzhjNDE5OGI1MDI1In0.bU4AyIs6_sx1bWsN3yUu9Hbb5BXzzRqFjdf4M13mMLY",
  "access_expires_at": "2026-10-29T15:11:18.874523469Z",
  "refresh_token": "p9Q5bkiPUUkBV2TlrEF_Tx39j0StnlytD3Hhaj7YH4U",
  "refresh_expires_at": "2026-10-30T02:56:18.87394732Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
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

`POST /api/admin/v1/staff-extensions/efe949ae-ae39-47f2-8672-c36f54fcf297` → **200**

```json
{
  "command_id": "6813aa46-bdb3-4caf-84ed-0169de07bedd",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "68124608-b701-45cf-abc1-0865d0c83b86",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:56:20.12022Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:56:20.12022Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7bea30ef-5843-4c77-aff3-374a710c5dea",
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
  "id": "6629dcf9-be4a-4de7-b711-8703e88f03ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:01:20.709744Z",
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
  "command_id": "051ae394-fdfc-40f5-a0ea-513fef2489d7",
  "quote_id": "6629dcf9-be4a-4de7-b711-8703e88f03ea",
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
    "phone": "+380675826463"
  }
}
```

```json
{
  "id": "a13f9e28-4bca-428f-a51c-282601da2fbf",
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
  "created_at": "2026-10-29T14:56:21.071029Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675826463"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/a13f9e28-4bca-428f-a51c-282601da2fbf/calls` → **201**

```json
{
  "command_id": "c3707f61-fa9a-49d1-bc09-7068e4933c2e",
  "to": "CALLER"
}
```

```json
{
  "id": "648de0e9-96fa-493d-8c8e-d8553f63cc29",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "order_ids": [
    "a13f9e28-4bca-428f-a51c-282601da2fbf"
  ],
  "started_at": "2026-10-29T14:56:21.42907Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/a13f9e28-4bca-428f-a51c-282601da2fbf/calls` → **201**

```json
{
  "command_id": "c3707f61-fa9a-49d1-bc09-7068e4933c2e",
  "to": "CALLER"
}
```

```json
{
  "id": "648de0e9-96fa-493d-8c8e-d8553f63cc29",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "order_ids": [
    "a13f9e28-4bca-428f-a51c-282601da2fbf"
  ],
  "started_at": "2026-10-29T14:56:21.42907Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "648de0e9-96fa-493d-8c8e-d8553f63cc29",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380675826463",
    "at": "2026-10-29T14:56:21.431615855Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "648de0e9-96fa-493d-8c8e-d8553f63cc29",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.11362",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "648de0e9-96fa-493d-8c8e-d8553f63cc29"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "648de0e9-96fa-493d-8c8e-d8553f63cc29",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=a13f9e28-4bca-428f-a51c-282601da2fbf` → **200**

```json
{
  "calls": [
    {
      "id": "648de0e9-96fa-493d-8c8e-d8553f63cc29",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [
        "a13f9e28-4bca-428f-a51c-282601da2fbf"
      ],
      "started_at": "2026-10-29T14:56:21.42907Z",
      "answered_at": "2026-10-29T14:56:22.152739Z",
      "ended_at": "2026-10-29T14:56:22.176917Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a13f9e28-4bca-428f-a51c-282601da2fbf` → **200**

```json
{
  "calls": [
    {
      "id": "648de0e9-96fa-493d-8c8e-d8553f63cc29",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [
        "a13f9e28-4bca-428f-a51c-282601da2fbf"
      ],
      "started_at": "2026-10-29T14:56:21.42907Z",
      "answered_at": "2026-10-29T14:56:22.152739Z",
      "ended_at": "2026-10-29T14:56:22.176917Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a13f9e28-4bca-428f-a51c-282601da2fbf` → **200**

```json
{
  "calls": [
    {
      "id": "648de0e9-96fa-493d-8c8e-d8553f63cc29",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "order_ids": [
        "a13f9e28-4bca-428f-a51c-282601da2fbf"
      ],
      "started_at": "2026-10-29T14:56:21.42907Z",
      "answered_at": "2026-10-29T14:56:22.152739Z",
      "ended_at": "2026-10-29T14:56:22.176917Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:56:26.676782Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/a13f9e28-4bca-428f-a51c-282601da2fbf` → **200**

```json
{
  "id": "a13f9e28-4bca-428f-a51c-282601da2fbf",
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
  "created_at": "2026-10-29T14:56:21.071029Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675826463"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a13f9e28-4bca-428f-a51c-282601da2fbf/cancel` → **200**

```json
{
  "command_id": "9ae2e345-7686-4488-8793-efa0cbcbd89a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a13f9e28-4bca-428f-a51c-282601da2fbf",
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
  "created_at": "2026-10-29T14:56:21.071029Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675826463"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
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
  "command_id": "d0c4ac6e-3608-42a2-afcd-de1e7dbcd560",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T14:56:27.791205Z",
  "extension": "101"
}
```

Done: outgoing call 648de0e9-96fa-493d-8c8e-d8553f63cc29 from order a13f9e28-4bca-428f-a51c-282601da2fbf, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637554143",
  "device_ref": "sandbox-26134"
}
```

```json
{
  "challenge_id": "22864a49-d948-4f0c-af7e-af564a73ab2e",
  "expires_at": "2026-10-29T15:01:28.129855829Z",
  "resend_available_at": "2026-10-29T14:56:29.129855829Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637554143` → **200**

```json
{
  "phone": "+380637554143",
  "audience": "CLIENT",
  "code": "928884",
  "sent_at": "2026-10-29T14:56:28.132552006Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22864a49-d948-4f0c-af7e-af564a73ab2e",
  "code": "928884",
  "device_ref": "sandbox-26134"
}
```

```json
{
  "session_id": "909c1f88-7fc4-4255-bd65-a3f23fc55680",
  "subject": {
    "type": "CLIENT",
    "id": "a75eb2f1-8645-46da-926c-b1bd87427c16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzVlYjJmMS04NjQ1LTQ2ZGEtOTI2Yy1iMWJkODc0MjdjMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2Njg4LCJpYXQiOjE3OTMyODU3ODgsImp0aSI6IjFkNTRhYjc5LTUxNDctNGY1MC1hZDFmLTE0Yzk0ODBhYjhiNiIsInNpZCI6IjkwOWMxZjg4LTdmYzQtNDI1NS1iZDY1LWEzZjIzZmM1NTY4MCJ9.A3XSFvpivE-vXLjNdJKT4ABSVvPbamFWYXm5X9ddgAo",
  "access_expires_at": "2026-10-29T15:11:28.453329832Z",
  "refresh_token": "xUUUgn3zpULz8o856vFN3qvbmjev8XUw4rZwIrn4pUM",
  "refresh_expires_at": "2026-11-28T14:56:28.452570329Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a75eb2f1-8645-46da-926c-b1bd87427c16",
  "session_id": "909c1f88-7fc4-4255-bd65-a3f23fc55680",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637554143",
  "device_ref": "sandbox-13285"
}
```

```json
{
  "challenge_id": "eda853c3-77f5-4c8c-89e1-1cd6658a6591",
  "expires_at": "2026-10-29T15:01:31.037950948Z",
  "resend_available_at": "2026-10-29T14:56:32.037950948Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637554143` → **200**

```json
{
  "phone": "+380637554143",
  "audience": "CLIENT",
  "code": "322162",
  "sent_at": "2026-10-29T14:56:31.041934529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eda853c3-77f5-4c8c-89e1-1cd6658a6591",
  "code": "322162",
  "device_ref": "sandbox-13285"
}
```

```json
{
  "session_id": "9c4841c3-8309-4135-936f-57f959956c36",
  "subject": {
    "type": "CLIENT",
    "id": "a75eb2f1-8645-46da-926c-b1bd87427c16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzVlYjJmMS04NjQ1LTQ2ZGEtOTI2Yy1iMWJkODc0MjdjMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjkxLCJpYXQiOjE3OTMyODU3OTEsImp0aSI6IjNmODEwMmM3LTU0NjUtNGY0MC1hOTBmLWUwMjhhODE3YzNmMiIsInNpZCI6IjljNDg0MWMzLTgzMDktNDEzNS05MzZmLTU3Zjk1OTk1NmMzNiJ9.P63aOcLzdxtbLYM7UDHgs9dKr59a4HXlh_YpVx218P0",
  "access_expires_at": "2026-10-29T15:11:31.373831139Z",
  "refresh_token": "Uz1eGlWIOMzj9E84YUHR1hq4a02WrId8JFVhcLAYqdY",
  "refresh_expires_at": "2026-11-28T14:56:31.373304042Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "af844f95-bda7-44a8-b4a9-d6bcba7ea6ae",
  "expires_at": "2026-10-29T15:01:33.659150265Z",
  "resend_available_at": "2026-10-29T14:56:34.659150265Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637554143` → **200**

```json
{
  "phone": "+380637554143",
  "audience": "CLIENT",
  "code": "885400",
  "sent_at": "2026-10-29T14:56:33.662287587Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630351000"
}
```

```json
{
  "challenge_id": "aa9fbd8c-f64a-4b0f-b85e-57ecebdfebd6",
  "expires_at": "2026-10-29T15:01:33.9780012Z",
  "resend_available_at": "2026-10-29T14:56:34.9780012Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630351000` → **200**

```json
{
  "phone": "+380630351000",
  "audience": "CLIENT",
  "code": "285284",
  "sent_at": "2026-10-29T14:56:33.980505222Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "4b68e722-957b-4d0a-94a6-60fb09d5b3c5",
  "current_challenge_id": "af844f95-bda7-44a8-b4a9-d6bcba7ea6ae",
  "current_code": "000000",
  "new_challenge_id": "aa9fbd8c-f64a-4b0f-b85e-57ecebdfebd6",
  "new_code": "285284"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b8f5c650-0a3b-4b7b-9196-30ed699095b4"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "eaf1f033-9c56-4eef-9a42-3ecf19107986",
  "current_challenge_id": "af844f95-bda7-44a8-b4a9-d6bcba7ea6ae",
  "current_code": "885400",
  "new_challenge_id": "aa9fbd8c-f64a-4b0f-b85e-57ecebdfebd6",
  "new_code": "285284"
}
```

```json
{
  "subject_id": "a75eb2f1-8645-46da-926c-b1bd87427c16",
  "phone": "+380630351000",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a75eb2f1-8645-46da-926c-b1bd87427c16",
  "session_id": "909c1f88-7fc4-4255-bd65-a3f23fc55680",
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
  "correlation_id": "127b5ea0-6493-4884-8d6e-0e9e3d304c69"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630351000",
  "device_ref": "sandbox-13212"
}
```

```json
{
  "challenge_id": "09c5557f-b886-4ad1-a22f-aaad8bfcb3c5",
  "expires_at": "2026-10-29T15:01:37.497900019Z",
  "resend_available_at": "2026-10-29T14:56:38.497900019Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630351000` → **200**

```json
{
  "phone": "+380630351000",
  "audience": "CLIENT",
  "code": "375958",
  "sent_at": "2026-10-29T14:56:37.500832429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09c5557f-b886-4ad1-a22f-aaad8bfcb3c5",
  "code": "375958",
  "device_ref": "sandbox-13212"
}
```

```json
{
  "session_id": "a0eccb76-b352-4da6-85e9-b79efd97f004",
  "subject": {
    "type": "CLIENT",
    "id": "a75eb2f1-8645-46da-926c-b1bd87427c16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzVlYjJmMS04NjQ1LTQ2ZGEtOTI2Yy1iMWJkODc0MjdjMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2Njk3LCJpYXQiOjE3OTMyODU3OTcsImp0aSI6IjlhZTA3YjE4LTFkNDctNDY1MS1iYzU0LTE4MDQ2ODFmZDZiOCIsInNpZCI6ImEwZWNjYjc2LWIzNTItNGRhNi04NWU5LWI3OWVmZDk3ZjAwNCJ9.3t7h3eL15rjhtzmUpzRpJN9iddE1H7CcFkeYqaxPFtw",
  "access_expires_at": "2026-10-29T15:11:37.829129605Z",
  "refresh_token": "9aTuPOC9X5GuL6eBfCzIbMnu8xLdXMpaSH7p3RlJovs",
  "refresh_expires_at": "2026-11-28T14:56:37.82839062Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a75eb2f1-8645-46da-926c-b1bd87427c16",
  "session_id": "a0eccb76-b352-4da6-85e9-b79efd97f004",
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
  "session_id": "e6305feb-9b10-42d4-a95b-f9ef021d9712",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2OTgsImlhdCI6MTc5MzI4NTc5OCwianRpIjoiZjFkMmU1NzYtMjkxMC00NThjLTk0NGYtNGY0NzRmODY5NjVkIiwic2lkIjoiZTYzMDVmZWItOWIxMC00MmQ0LWE5NWItZjllZjAyMWQ5NzEyIn0.HwrOiT5gtlmMOF_PcAGgCHbiuwrXFPWMsu65CmTAxA0",
  "access_expires_at": "2026-10-29T15:11:38.720919754Z",
  "refresh_token": "ohZAvEA0E-4CztaKKpoWl_tuVPGfWZsgXf0NkZWAi0g",
  "refresh_expires_at": "2026-10-30T02:56:38.720417253Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/a75eb2f1-8645-46da-926c-b1bd87427c16` → **200**

```json
{
  "client": {
    "id": "a75eb2f1-8645-46da-926c-b1bd87427c16",
    "phone": "+380630351000",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:56:28.450673Z",
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

`POST /api/admin/v1/clients/a75eb2f1-8645-46da-926c-b1bd87427c16/phone/new-code` → **201**

```json
{
  "phone": "+380632419431"
}
```

```json
{
  "challenge_id": "542f33ed-4c37-46a3-a621-c5c20115605d",
  "expires_at": "2026-10-29T15:01:39.360941819Z",
  "resend_available_at": "2026-10-29T14:56:40.360941819Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632419431` → **200**

```json
{
  "phone": "+380632419431",
  "audience": "CLIENT",
  "code": "116733",
  "sent_at": "2026-10-29T14:56:39.363402189Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/a75eb2f1-8645-46da-926c-b1bd87427c16/phone` → **422**

```json
{
  "command_id": "e21f2d2b-c263-450a-bdbd-b0fbee4253ff",
  "expected_version": 3,
  "new_challenge_id": "542f33ed-4c37-46a3-a621-c5c20115605d",
  "new_code": "116734",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/a75eb2f1-8645-46da-926c-b1bd87427c16/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "7657244f-8b59-4295-abb6-8b6e00bed296"
}
```

`POST /api/admin/v1/clients/a75eb2f1-8645-46da-926c-b1bd87427c16/phone` → **400**

```json
{
  "command_id": "55017ba8-695f-4935-bb63-b6474c116a82",
  "expected_version": 3,
  "new_challenge_id": "542f33ed-4c37-46a3-a621-c5c20115605d",
  "new_code": "116733",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a75eb2f1-8645-46da-926c-b1bd87427c16/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8bc3c329-b170-4475-b4cf-acbc77462374",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/a75eb2f1-8645-46da-926c-b1bd87427c16/phone` → **200**

```json
{
  "command_id": "85fb1da6-cba8-4001-80e7-ee262c24442c",
  "expected_version": 3,
  "new_challenge_id": "542f33ed-4c37-46a3-a621-c5c20115605d",
  "new_code": "116733",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "a75eb2f1-8645-46da-926c-b1bd87427c16",
  "phone": "+380632419431",
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
  "correlation_id": "ad5f1671-ce32-4c56-8c04-b2b9dc7675ee"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632419431",
  "device_ref": "sandbox-29966"
}
```

```json
{
  "challenge_id": "d239fb20-8ac2-48e2-bc62-8af729663626",
  "expires_at": "2026-10-29T15:01:40.897920513Z",
  "resend_available_at": "2026-10-29T14:56:41.897920513Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632419431` → **200**

```json
{
  "phone": "+380632419431",
  "audience": "CLIENT",
  "code": "469635",
  "sent_at": "2026-10-29T14:56:40.900583322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d239fb20-8ac2-48e2-bc62-8af729663626",
  "code": "469635",
  "device_ref": "sandbox-29966"
}
```

```json
{
  "session_id": "98e5c58a-bf7e-4ab1-b7e5-e8c742104494",
  "subject": {
    "type": "CLIENT",
    "id": "a75eb2f1-8645-46da-926c-b1bd87427c16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzVlYjJmMS04NjQ1LTQ2ZGEtOTI2Yy1iMWJkODc0MjdjMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzAxLCJpYXQiOjE3OTMyODU4MDEsImp0aSI6IjVhYzNlNGE0LWMyNWItNGM4Zi1hYTIxLTg5NjVlOWE4Y2NlNCIsInNpZCI6Ijk4ZTVjNThhLWJmN2UtNGFiMS1iN2U1LWU4Yzc0MjEwNDQ5NCJ9.QUTR84f-h9mW3pemfsMXA-oofZoyLbPlOY4ynWAHd7Q",
  "access_expires_at": "2026-10-29T15:11:41.234260586Z",
  "refresh_token": "JtkTARNbFo07m_sw8l6OOnatIwyrDa-d-nibSvqfQHM",
  "refresh_expires_at": "2026-11-28T14:56:41.233690181Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a75eb2f1-8645-46da-926c-b1bd87427c16",
  "session_id": "98e5c58a-bf7e-4ab1-b7e5-e8c742104494",
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
  "phone": "+380633620641",
  "device_ref": "sandbox-23856"
}
```

```json
{
  "challenge_id": "7911710a-967c-4b23-a067-97a77d398c26",
  "expires_at": "2026-10-29T15:01:41.8071309Z",
  "resend_available_at": "2026-10-29T14:56:42.8071309Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633620641` → **200**

```json
{
  "phone": "+380633620641",
  "audience": "CLIENT",
  "code": "795504",
  "sent_at": "2026-10-29T14:56:41.809955368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7911710a-967c-4b23-a067-97a77d398c26",
  "code": "795504",
  "device_ref": "sandbox-23856"
}
```

```json
{
  "session_id": "83b1ef62-e213-46ba-881b-6a894ae987be",
  "subject": {
    "type": "CLIENT",
    "id": "d46bb79c-d349-4cfe-8426-5afcbe700789"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNDZiYjc5Yy1kMzQ5LTRjZmUtODQyNi01YWZjYmU3MDA3ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzAyLCJpYXQiOjE3OTMyODU4MDIsImp0aSI6IjhhODFlNWViLTYxZDMtNDhhYi05Y2FlLTNkZmNiNWFkMTY3MSIsInNpZCI6IjgzYjFlZjYyLWUyMTMtNDZiYS04ODFiLTZhODk0YWU5ODdiZSJ9.oxuBuHbeGc51ETWrLUSwcafnkVd5I661eWySgmmqqNQ",
  "access_expires_at": "2026-10-29T15:11:42.132637442Z",
  "refresh_token": "nXR841DaebZxlr_MASMXIcn2M_-kwdsNlmHLxrgZ-F4",
  "refresh_expires_at": "2026-11-28T14:56:42.132125873Z",
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
  "session_id": "c06169de-bb9a-48a7-93e4-684a9bac5edc",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MDMsImlhdCI6MTc5MzI4NTgwMywianRpIjoiZTIwM2NmZjAtOWIwZC00ZTM2LTg3ZjEtNmIyMmI2YWMxYzFhIiwic2lkIjoiYzA2MTY5ZGUtYmI5YS00OGE3LTkzZTQtNjg0YTliYWM1ZWRjIn0.3UETwPiejOTngZ8M2zruuiz7QVlwAmD2_B_1FZ_FWe8",
  "access_expires_at": "2026-10-29T15:11:43.320706434Z",
  "refresh_token": "gYy_6A2lfzAL-AdTHlwxwJRRAfNdsWUJ9bRB7li6e5E",
  "refresh_expires_at": "2026-10-30T02:56:43.320134021Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633620641` → **200**

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
  "correlation_id": "b1625104-74e1-471d-983d-4547ce98d75a"
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
  "session_id": "d85c4dc1-ae5f-4b4e-8151-e1898e3321e0",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MDQsImlhdCI6MTc5MzI4NTgwNCwianRpIjoiMDcxOWMzOTMtMWZmYy00ZjkzLWI1NGQtZGIxNGJhZDE4YjQ5Iiwic2lkIjoiZDg1YzRkYzEtYWU1Zi00YjRlLTgxNTEtZTE4OThlMzMyMWUwIn0.JotrmwGXazuAx4uXAmfNio5QhCHgXKjMkKZWE2ZUJdo",
  "access_expires_at": "2026-10-29T15:11:44.528195804Z",
  "refresh_token": "3C5tZJw9dnvPGYn7prwZquvuO4a_XGiBDtn6ELd91_Q",
  "refresh_expires_at": "2026-10-30T02:56:44.527563186Z",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:52:35.814714Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "b9af45db-c507-41a3-b483-6e99d2b4ae7a",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T14:56:45.167362857Z"
}
```

## The rider books the airport for 2026-10-29T17:56:44Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600276866",
  "device_ref": "sandbox-15079"
}
```

```json
{
  "challenge_id": "fb6a5c63-b452-46c5-a72b-fd55a757c71e",
  "expires_at": "2026-10-29T15:01:45.479431849Z",
  "resend_available_at": "2026-10-29T14:56:46.479431849Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600276866` → **200**

```json
{
  "phone": "+48600276866",
  "audience": "CLIENT",
  "code": "659806",
  "sent_at": "2026-10-29T14:56:45.482325301Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb6a5c63-b452-46c5-a72b-fd55a757c71e",
  "code": "659806",
  "device_ref": "sandbox-15079"
}
```

```json
{
  "session_id": "d46bd083-7c48-4f40-955a-df12617498e4",
  "subject": {
    "type": "CLIENT",
    "id": "8cf15ff0-d0ee-4c48-815d-8feee1841b10"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Y2YxNWZmMC1kMGVlLTRjNDgtODE1ZC04ZmVlZTE4NDFiMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzA1LCJpYXQiOjE3OTMyODU4MDUsImp0aSI6ImYwOGNjYzNiLWUxZGQtNDM4ZS05ZDJiLWY3NTZiZjI4NmUxMCIsInNpZCI6ImQ0NmJkMDgzLTdjNDgtNGY0MC05NTVhLWRmMTI2MTc0OThlNCJ9.hByOv3tumto4Df8Q-OGuC21rbfcSERO1z8rjS_quTg8",
  "access_expires_at": "2026-10-29T15:11:45.819554568Z",
  "refresh_token": "FtOEP3ATl4I_0YaCrWg-ZCYmGD0EzGwELLTaXN4sKAM",
  "refresh_expires_at": "2026-11-28T14:56:45.818693381Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "19761640-400e-4139-9b63-0381a8239c76",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T17:56:44Z"
}
```

```json
{
  "id": "d8a1c837-d05d-446d-a047-d9ed061a8a3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:01:46.132568Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:56:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a3895043-2e48-4066-b201-93ec0abba412",
  "quote_id": "d8a1c837-d05d-446d-a047-d9ed061a8a3a",
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
  "pickup_at": "2026-10-29T17:56:44Z"
}
```

```json
{
  "id": "0da0beee-e2b2-4afd-a234-abb2f2389b14",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8cf15ff0-d0ee-4c48-815d-8feee1841b10",
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
  "created_at": "2026-10-29T14:56:46.443937Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:56:44Z",
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
  "device_ref": "sandbox-5338"
}
```

```json
{
  "challenge_id": "0dc8b337-7e93-447a-9f6d-7bd51fcc457f",
  "expires_at": "2026-10-29T15:01:46.771287444Z",
  "resend_available_at": "2026-10-29T14:56:47.771287444Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "598735",
  "sent_at": "2026-10-29T14:56:46.773886003Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0dc8b337-7e93-447a-9f6d-7bd51fcc457f",
  "code": "598735",
  "device_ref": "sandbox-5338"
}
```

```json
{
  "session_id": "5af02127-aec1-4dfe-afd7-7fd751eabdc2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjcwNywiaWF0IjoxNzkzMjg1ODA3LCJqdGkiOiJlNzc2NTlmZS1mMGFjLTQ2ODYtODlhZS02YjRkYTY5ODEzYTYiLCJzaWQiOiI1YWYwMjEyNy1hZWMxLTRkZmUtYWZkNy03ZmQ3NTFlYWJkYzIifQ.1NSS9Oox-xHSDni39zPww2QIxN2x0fstzg1z5GMmfe8",
  "access_expires_at": "2026-10-29T15:11:47.103755685Z",
  "refresh_token": "EaRa_CxtybFM8cS6R5wrQFvT8ku3Neo-e91TEstXLo4",
  "refresh_expires_at": "2026-11-28T14:56:47.103213653Z",
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
  "command_id": "d6e27f63-8fbd-41c7-8e34-937fa15467fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:47Z",
    "sequence": 1793285807668
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "40d798f9-e36b-4f99-b5b0-bce0d9b44e89",
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
  "last_heartbeat_at": "2026-10-29T14:56:47.686675Z",
  "last_location_at": "2026-10-29T14:56:47.686675Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "0da0beee-e2b2-4afd-a234-abb2f2389b14",
      "short_number": 24,
      "pickup_at": "2026-10-29T17:56:44Z",
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

`POST /api/driver/v1/preorders/0da0beee-e2b2-4afd-a234-abb2f2389b14/reserve` → **200**

```json
{
  "command_id": "afc60e2a-8fed-4b33-98b4-a3c63058767b"
}
```

```json
{
  "id": "796a7176-5efb-4436-85d6-439346745dfe",
  "state": "RESERVED",
  "order": {
    "order_id": "0da0beee-e2b2-4afd-a234-abb2f2389b14",
    "short_number": 24,
    "pickup_at": "2026-10-29T17:56:44Z",
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
  "reserved_at": "2026-10-29T14:56:48.302389Z",
  "confirm_from": "2026-10-29T17:26:44Z",
  "confirm_until": "2026-10-29T17:36:44Z",
  "drop_until": "2026-10-29T16:56:44Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "796a7176-5efb-4436-85d6-439346745dfe",
      "state": "RESERVED",
      "order": {
        "order_id": "0da0beee-e2b2-4afd-a234-abb2f2389b14",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:56:44Z",
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
      "reserved_at": "2026-10-29T14:56:48.302389Z",
      "confirm_from": "2026-10-29T17:26:44Z",
      "confirm_until": "2026-10-29T17:36:44Z",
      "drop_until": "2026-10-29T16:56:44Z"
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
      "id": "796a7176-5efb-4436-85d6-439346745dfe",
      "state": "RESERVED",
      "order": {
        "order_id": "0da0beee-e2b2-4afd-a234-abb2f2389b14",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:56:44Z",
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
      "reserved_at": "2026-10-29T14:56:48.302389Z",
      "confirm_from": "2026-10-29T17:26:44Z",
      "confirm_until": "2026-10-29T17:36:44Z",
      "drop_until": "2026-10-29T16:56:44Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/796a7176-5efb-4436-85d6-439346745dfe/confirm` → **409**

```json
{
  "command_id": "42dc6106-6e30-4661-94e4-1dc3388147a6"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/796a7176-5efb-4436-85d6-439346745dfe/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6060ea4d-0ed7-4350-967a-1756e44ce093"
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
  "session_id": "819c0b6b-5467-42fe-a475-39147aa8f293",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MDksImlhdCI6MTc5MzI4NTgwOSwianRpIjoiNTQ5N2Y2OGMtYWJjNC00ZTk1LWI1ODgtZjc4ZmU5NDBlZGIxIiwic2lkIjoiODE5YzBiNmItNTQ2Ny00MmZlLWE0NzUtMzkxNDdhYThmMjkzIn0.un7aV4B5_FcQSb6cP2P3crBGPRFcLuRQbNnkY8cKZKM",
  "access_expires_at": "2026-10-29T15:11:49.811323036Z",
  "refresh_token": "X068jAImCQiMMpk5rlqFllEDN-poblxlN39sTGQWCKY",
  "refresh_expires_at": "2026-10-30T02:56:49.810634616Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0da0beee-e2b2-4afd-a234-abb2f2389b14` → **200**

```json
{
  "id": "0da0beee-e2b2-4afd-a234-abb2f2389b14",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8cf15ff0-d0ee-4c48-815d-8feee1841b10",
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
  "created_at": "2026-10-29T14:56:46.443937Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T17:56:44Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "796a7176-5efb-4436-85d6-439346745dfe",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T14:56:48.302389Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0da0beee-e2b2-4afd-a234-abb2f2389b14/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T14:56:46.445151Z",
      "actor": {
        "type": "CLIENT",
        "id": "8cf15ff0-d0ee-4c48-815d-8feee1841b10",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "0da0beee-e2b2-4afd-a234-abb2f2389b14",
        "preorder": true,
        "quote_id": "d8a1c837-d05d-446d-a047-d9ed061a8a3a",
        "pickup_at": "2026-10-29T17:56:44Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "31964084-f186-4579-8bbc-0ce02ca70e5c"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T14:56:48.303602Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0da0beee-e2b2-4afd-a234-abb2f2389b14",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "796a7176-5efb-4436-85d6-439346745dfe"
      },
      "correlation_id": "b357c90d-a69f-44c5-9c9f-6a8391ab47e4"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 0da0beee-e2b2-4afd-a234-abb2f2389b14, reservation 796a7176-5efb-4436-85d6-439346745dfe.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28537"
}
```

```json
{
  "challenge_id": "094c90d6-02ac-4ea2-8599-14a8d670c283",
  "expires_at": "2026-10-29T15:01:50.758176718Z",
  "resend_available_at": "2026-10-29T14:56:51.758176718Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "586695",
  "sent_at": "2026-10-29T14:56:50.766904525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "094c90d6-02ac-4ea2-8599-14a8d670c283",
  "code": "586695",
  "device_ref": "sandbox-28537"
}
```

```json
{
  "session_id": "80a20b66-c38c-437d-94c4-627162de0334",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjcxMSwiaWF0IjoxNzkzMjg1ODExLCJqdGkiOiJmMjQ4YmJhMC1iZmRjLTRlNDctYWQ5OS0wZjg1ZDU2MTIwZTMiLCJzaWQiOiI4MGEyMGI2Ni1jMzhjLTQzN2QtOTRjNC02MjcxNjJkZTAzMzQifQ.RJ0M5biADMlnMdNlKnPEc5Y7IHAZQVPD7aeWcQ2j0I4",
  "access_expires_at": "2026-10-29T15:11:51.093388126Z",
  "refresh_token": "MC7q0nwCfJw3bV7pWrq9MxgPw4YbK-SZ-wfEZKwUk3s",
  "refresh_expires_at": "2026-11-28T14:56:51.092809873Z",
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
  "command_id": "c3cdec00-2bbe-4fe8-82f4-d518a4940a82",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:51Z",
    "sequence": 1793285811702
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f83e0d8-d11c-40d2-bd47-0c9c7119d506",
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
  "last_heartbeat_at": "2026-10-29T14:56:51.723445Z",
  "last_location_at": "2026-10-29T14:56:51.723445Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676345535",
  "device_ref": "sandbox-2606"
}
```

```json
{
  "challenge_id": "cd169ae6-b5a9-4603-9386-4a312f7486df",
  "expires_at": "2026-10-29T15:01:52.030742102Z",
  "resend_available_at": "2026-10-29T14:56:53.030742102Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676345535` → **200**

```json
{
  "phone": "+380676345535",
  "audience": "CLIENT",
  "code": "815324",
  "sent_at": "2026-10-29T14:56:52.033571161Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd169ae6-b5a9-4603-9386-4a312f7486df",
  "code": "815324",
  "device_ref": "sandbox-2606"
}
```

```json
{
  "session_id": "3807e00a-acef-4ed0-9cd4-36aca88dae40",
  "subject": {
    "type": "CLIENT",
    "id": "33d30ea7-48d3-438e-a9d6-47c15c8e1487"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzM2QzMGVhNy00OGQzLTQzOGUtYTlkNi00N2MxNWM4ZTE0ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzEyLCJpYXQiOjE3OTMyODU4MTIsImp0aSI6ImNkNjk0Y2EyLTI2YWUtNDJiMS1iZDY3LTBlMjlhMDY0NDJhZSIsInNpZCI6IjM4MDdlMDBhLWFjZWYtNGVkMC05Y2Q0LTM2YWNhODhkYWU0MCJ9.SJBFTy8OpgVUFjviEB4Xk692qKh4MAGad0JQ1tEuVEM",
  "access_expires_at": "2026-10-29T15:11:52.348547614Z",
  "refresh_token": "zy2n842UBVFBQ-OfhprQEnCwo6lVmCSJkEZ9EF_FJro",
  "refresh_expires_at": "2026-11-28T14:56:52.347792849Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0fee9b26-602f-4f2a-84de-c00e4ed7c74c",
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
  "id": "93afe3a4-66fe-4229-a3e4-e8a2f72e625f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:01:52.645815Z",
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
  "command_id": "b80197f0-5376-44c9-8f26-f08ea4d15ace",
  "quote_id": "93afe3a4-66fe-4229-a3e4-e8a2f72e625f",
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
  "id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "33d30ea7-48d3-438e-a9d6-47c15c8e1487",
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
  "created_at": "2026-10-29T14:56:52.954275Z",
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
    "id": "bfd03915-932a-4c2e-9263-97e8e9bf70d2",
    "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
    "expires_at": "2026-10-29T14:57:07.958652Z",
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

`POST /api/driver/v1/offers/bfd03915-932a-4c2e-9263-97e8e9bf70d2/accept` → **200**

```json
{
  "command_id": "7f83ca1d-c776-48dd-a6fc-3f24aa3e2b69"
}
```

```json
{
  "id": "e4596ad6-bd84-4c53-b3f0-a02a7b4b6816",
  "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cc3dc3bc-7bae-4db3-a639-61a0e0221626",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc3dc3bc-7bae-4db3-a639-61a0e0221626",
  "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "assignment_id": "e4596ad6-bd84-4c53-b3f0-a02a7b4b6816",
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

`POST /api/driver/v1/work-sessions/8f83e0d8-d11c-40d2-bd47-0c9c7119d506/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:54Z",
    "sequence": 1793285814170
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f83e0d8-d11c-40d2-bd47-0c9c7119d506",
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
  "last_heartbeat_at": "2026-10-29T14:56:54.189105Z",
  "last_location_at": "2026-10-29T14:56:54.189105Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc3dc3bc-7bae-4db3-a639-61a0e0221626",
  "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "assignment_id": "e4596ad6-bd84-4c53-b3f0-a02a7b4b6816",
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

`POST /api/driver/v1/trips/cc3dc3bc-7bae-4db3-a639-61a0e0221626/arrive` → **200**

```json
{
  "command_id": "83b8afad-1cc6-4d29-8193-b5a654e8f06f",
  "expected_version": 0
}
```

```json
{
  "id": "cc3dc3bc-7bae-4db3-a639-61a0e0221626",
  "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "assignment_id": "e4596ad6-bd84-4c53-b3f0-a02a7b4b6816",
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
  "arrived_at": "2026-10-29T14:56:54.760047Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cc3dc3bc-7bae-4db3-a639-61a0e0221626/start` → **200**

```json
{
  "command_id": "fdfb8ce7-05e4-42c3-88c4-4eef4295647d",
  "expected_version": 1
}
```

```json
{
  "id": "cc3dc3bc-7bae-4db3-a639-61a0e0221626",
  "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "assignment_id": "e4596ad6-bd84-4c53-b3f0-a02a7b4b6816",
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
  "arrived_at": "2026-10-29T14:56:54.760047Z",
  "started_at": "2026-10-29T14:56:55.068685Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8f83e0d8-d11c-40d2-bd47-0c9c7119d506/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:55Z",
    "sequence": 1793285815369
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f83e0d8-d11c-40d2-bd47-0c9c7119d506",
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
  "last_heartbeat_at": "2026-10-29T14:56:55.387273Z",
  "last_location_at": "2026-10-29T14:56:55.387273Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/cc3dc3bc-7bae-4db3-a639-61a0e0221626/complete` → **200**

```json
{
  "command_id": "26445d68-88d6-4852-998e-843b87383864",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:56:55Z",
  "cash_received": true
}
```

```json
{
  "id": "cc3dc3bc-7bae-4db3-a639-61a0e0221626",
  "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "assignment_id": "e4596ad6-bd84-4c53-b3f0-a02a7b4b6816",
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
  "arrived_at": "2026-10-29T14:56:54.760047Z",
  "started_at": "2026-10-29T14:56:55.068685Z",
  "completed_at": "2026-10-29T14:56:55.681084Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/96d639bd-be70-4f8e-b033-a0623560aaf6/rating` → **200**

```json
{
  "command_id": "6ba8dbba-edfd-4f80-b205-4bf8c2d3e3a9",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "score": 5,
  "created_at": "2026-10-29T14:56:56.000111271Z"
}
```

`POST /api/driver/v1/orders/96d639bd-be70-4f8e-b033-a0623560aaf6/rating` → **200**

```json
{
  "command_id": "3fe6e8e9-f1f7-4229-90fb-18e0a674223c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
  "score": 4,
  "created_at": "2026-10-29T14:56:56.292244018Z"
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
  "session_id": "980b58f8-7194-4366-aa38-34465a178779",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MTcsImlhdCI6MTc5MzI4NTgxNywianRpIjoiZmI4OTdjYzUtODE2My00M2YwLWJlN2ItYzk2NmUzNTljY2I2Iiwic2lkIjoiOTgwYjU4ZjgtNzE5NC00MzY2LWFhMzgtMzQ0NjVhMTc4Nzc5In0.60E3_9wsCwxUQr7ksLF2YRW7xqxpat2VMKixP9gYBqU",
  "access_expires_at": "2026-10-29T15:11:57.18418149Z",
  "refresh_token": "Eu6HrIvandTPRixJEnJKy_D0drCo-F5O-cD5SQ29XwA",
  "refresh_expires_at": "2026-10-30T02:56:57.183611672Z",
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
  "session_id": "6a5e292a-e721-457f-b9c7-d2dab49ad0bd",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MTcsImlhdCI6MTc5MzI4NTgxNywianRpIjoiMmUyMzlmZDQtMWY5Ni00MzM4LTgzMGItOWJlZTgxYTFhMmY1Iiwic2lkIjoiNmE1ZTI5MmEtZTcyMS00NTdmLWI5YzctZDJkYWI0OWFkMGJkIn0.3nC2Axfg4Olbzsw6OW-ay1IoJlJzkGg5u0wEOMRWrvo",
  "access_expires_at": "2026-10-29T15:11:57.761113058Z",
  "refresh_token": "gov17C-IJ3QvtuRFTBbwkfvZqwpy0HuLFQuRlFeTpzk",
  "refresh_expires_at": "2026-10-30T02:56:57.76046848Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/96d639bd-be70-4f8e-b033-a0623560aaf6/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
      "author_type": "RIDER",
      "author_id": "33d30ea7-48d3-438e-a9d6-47c15c8e1487",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T14:56:56.000111Z"
    },
    {
      "order_id": "96d639bd-be70-4f8e-b033-a0623560aaf6",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "33d30ea7-48d3-438e-a9d6-47c15c8e1487",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T14:56:56.292244Z"
    }
  ]
}
```

Done: ratings for order 96d639bd-be70-4f8e-b033-a0623560aaf6.

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
  "session_id": "c695e4b0-c257-4a1c-981c-acfa39605a94",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MTgsImlhdCI6MTc5MzI4NTgxOCwianRpIjoiMzc0Yzg4ZjktYjQxNC00MmM2LWFkZjktZWJlZTM5YzM2ZDFlIiwic2lkIjoiYzY5NWU0YjAtYzI1Ny00YTFjLTk4MWMtYWNmYTM5NjA1YTk0In0.RUSYqs4y_s176mFn-n3g9E61dDW51uGJRqYQlGilC_E",
  "access_expires_at": "2026-10-29T15:11:58.658906153Z",
  "refresh_token": "Ue4rQz4003G6NptRRowNX1Wwr_GPS_5hGRkuCW8cjgE",
  "refresh_expires_at": "2026-10-30T02:56:58.658405755Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a82289df-ee85-4463-9639-0711a325c0fc",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "3beefcfe-ee05-43ce-a8ea-06bbbf39412f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:58.955545Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3beefcfe-ee05-43ce-a8ea-06bbbf39412f` → **200**

```json
{
  "id": "3beefcfe-ee05-43ce-a8ea-06bbbf39412f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:58.955545Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3beefcfe-ee05-43ce-a8ea-06bbbf39412f` → **200**

```json
{
  "id": "3beefcfe-ee05-43ce-a8ea-06bbbf39412f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:58.955545Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3beefcfe-ee05-43ce-a8ea-06bbbf39412f` → **200**

```json
{
  "id": "3beefcfe-ee05-43ce-a8ea-06bbbf39412f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:56:58.955545Z",
  "ready_at": "2026-10-29T14:57:01.747202Z",
  "expires_at": "2026-10-30T14:57:01.747202Z"
}
```

`GET /api/admin/v1/reports/exports/3beefcfe-ee05-43ce-a8ea-06bbbf39412f/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b9753158-7150-4dbb-91ca-b059b9a92b57",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "a1fcbb25-4670-449e-88ba-29d77abec19f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:57:02.153742Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1fcbb25-4670-449e-88ba-29d77abec19f` → **200**

```json
{
  "id": "a1fcbb25-4670-449e-88ba-29d77abec19f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:57:02.153742Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1fcbb25-4670-449e-88ba-29d77abec19f` → **200**

```json
{
  "id": "a1fcbb25-4670-449e-88ba-29d77abec19f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:57:02.153742Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1fcbb25-4670-449e-88ba-29d77abec19f` → **200**

```json
{
  "id": "a1fcbb25-4670-449e-88ba-29d77abec19f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:57:02.153742Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1fcbb25-4670-449e-88ba-29d77abec19f` → **200**

```json
{
  "id": "a1fcbb25-4670-449e-88ba-29d77abec19f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:57:02.153742Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a1fcbb25-4670-449e-88ba-29d77abec19f` → **200**

```json
{
  "id": "a1fcbb25-4670-449e-88ba-29d77abec19f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:57:02.153742Z",
  "ready_at": "2026-10-29T14:57:06.754227Z",
  "expires_at": "2026-10-30T14:57:06.754227Z"
}
```

`GET /api/admin/v1/reports/exports/a1fcbb25-4670-449e-88ba-29d77abec19f/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/8ee6608a-fb02-4153-8741-8c8725f2a00f` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/8ee6608a-fb02-4153-8741-8c8725f2a00f",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3e8d6528-ef54-4bed-898b-5f6ef263efcd"
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
  "device_ref": "sandbox-13142"
}
```

```json
{
  "challenge_id": "5e265ba0-bb4e-4b9d-92ac-fde7526e1a73",
  "expires_at": "2026-10-29T15:02:08.247312389Z",
  "resend_available_at": "2026-10-29T14:57:09.247312389Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "300758",
  "sent_at": "2026-10-29T14:57:08.250086477Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e265ba0-bb4e-4b9d-92ac-fde7526e1a73",
  "code": "300758",
  "device_ref": "sandbox-13142"
}
```

```json
{
  "session_id": "d04c339e-e8db-4072-b0a7-a69949fe74cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjcyOCwiaWF0IjoxNzkzMjg1ODI4LCJqdGkiOiI0NGZiY2YwZi01YmIwLTQxMzEtYTUzYy0wNThlYTg4ZDZiZjkiLCJzaWQiOiJkMDRjMzM5ZS1lOGRiLTQwNzItYjBhNy1hNjk5NDlmZTc0Y2YifQ.Akw62SzOJnp_tTq85U5hPSGCeQoFMAgBPka0bzPj8CA",
  "access_expires_at": "2026-10-29T15:12:08.569542108Z",
  "refresh_token": "21k18KyXCvSeu00DvkJ5h7G6MeqEc1gqCQAurp97EcY",
  "refresh_expires_at": "2026-11-28T14:57:08.568961303Z",
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
  "command_id": "2218f12f-5245-4907-b6e8-68f0d4ccc452",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:09Z",
    "sequence": 1793285829416
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "28f73811-f3e3-453a-b434-71b74d560b0b",
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
  "last_heartbeat_at": "2026-10-29T14:57:09.435267Z",
  "last_location_at": "2026-10-29T14:57:09.435267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "c1a8488e-eace-4e8f-aff5-5ad83eec680e",
  "points": [
    {
      "sequence": 1793285831733,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:56:11Z"
    },
    {
      "sequence": 1793285831741,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:57:11Z"
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
  "session_id": "76283527-38a0-400e-92eb-415c355dbc52",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MzIsImlhdCI6MTc5MzI4NTgzMiwianRpIjoiMDAzNjM4M2MtNWZhZS00MDY1LTk1OWItZmVlYjg3OGM1NDBhIiwic2lkIjoiNzYyODM1MjctMzhhMC00MDBlLTkyZWItNDE1YzM1NWRiYzUyIn0.HTzsWxwy8uRb0oAtqqSLDwoxqQ-65_J_-zMe8xFhuHU",
  "access_expires_at": "2026-10-29T15:12:12.358652899Z",
  "refresh_token": "7kNzbEWsSBIYVGlmHEOD7AOVWt5PAhJ64XZR4rtKVdQ",
  "refresh_expires_at": "2026-10-30T02:57:12.358121904Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "fc7b7030-f160-4f24-96c5-ebd4594c6dc1",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T14:57:11Z",
        "track_point_id": "70a700ec-9b1e-4424-bff8-ce689d005374",
        "work_session_id": "28f73811-f3e3-453a-b434-71b74d560b0b"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T14:57:11Z",
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

`POST /api/admin/v1/driver-risk-flags/fc7b7030-f160-4f24-96c5-ebd4594c6dc1/confirm` → **200**

```json
{
  "command_id": "453ec879-3568-4aed-be0f-86cd762a5560",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "fc7b7030-f160-4f24-96c5-ebd4594c6dc1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T14:57:11Z",
    "track_point_id": "70a700ec-9b1e-4424-bff8-ce689d005374",
    "work_session_id": "28f73811-f3e3-453a-b434-71b74d560b0b"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T14:57:11Z",
  "reason": null,
  "reviewed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reviewed_at": "2026-10-29T14:57:13.267959Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/fc7b7030-f160-4f24-96c5-ebd4594c6dc1/dismiss` → **409**

```json
{
  "command_id": "25ec9b26-c6ac-4a2c-9399-23c83131d114",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/fc7b7030-f160-4f24-96c5-ebd4594c6dc1/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "06027564-373e-46fd-bc35-368137201322"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "1d83cde2-31b3-46bf-9613-c95a4097e762",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "4c60287d-cf43-4099-b6a8-88bb56f97a40",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "raised_at": "2026-10-29T14:57:13.881984Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/4c60287d-cf43-4099-b6a8-88bb56f97a40/dismiss` → **200**

```json
{
  "command_id": "cf33ee94-2e8a-4cad-8f00-09bc871a5cb2",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "4c60287d-cf43-4099-b6a8-88bb56f97a40",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "raised_at": "2026-10-29T14:57:13.881984Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reviewed_at": "2026-10-29T14:57:14.183455Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "a6f7c13f-cb71-4f94-879d-fab930fd5985",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "fc7b7030-f160-4f24-96c5-ebd4594c6dc1"
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
      "actor_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:57:14.493067Z"
    }
  ]
}
```

Done: flag fc7b7030-f160-4f24-96c5-ebd4594c6dc1 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "fbfe1cfd-088a-46c9-aa99-9cc35414a24f",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MzUsImlhdCI6MTc5MzI4NTgzNSwianRpIjoiOThmOTljYzEtYjM5My00MjBiLWEyMTctMmZlODA1MDU1YzNkIiwic2lkIjoiZmJmZTFjZmQtMDg4YS00NmM5LWFhOTktOWNjMzU0MTRhMjRmIn0.XbpCv32ZB8ZgzTxNc3CupgBshyqKHEqq31O5nsqo4ZM",
  "access_expires_at": "2026-10-29T15:12:15.386144474Z",
  "refresh_token": "SgHTVaSWs331RPi_qwwi2oohQo2s4mo3pQrLHDYE-u8",
  "refresh_expires_at": "2026-10-30T02:57:15.38556624Z",
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
      "actor_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:57:14.493067Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "d7925ee6-d777-416a-b80f-12c34ef72f04",
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
  "session_id": "28f73811-f3e3-453a-b434-71b74d560b0b",
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
  "last_heartbeat_at": "2026-10-29T14:57:09.435267Z",
  "last_location_at": "2026-10-29T14:57:09.435267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/28f73811-f3e3-453a-b434-71b74d560b0b/close` → **200**

```json
{
  "command_id": "dabbdcd1-61da-4803-8d5a-0e3fd600d4f2",
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
  "session_id": "949ef654-228e-46a6-9c7c-796b7c76ab2f",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MzcsImlhdCI6MTc5MzI4NTgzNywianRpIjoiNzNjNDZiOTItMzg5Zi00NmI0LWFhMjMtZGVkODgxNTI5ZmQzIiwic2lkIjoiOTQ5ZWY2NTQtMjI4ZS00NmE2LTljN2MtNzk2YjdjNzZhYjJmIn0.MxVHAQIxFKPO6hLDtiWdIE31bnyJcYgeKpMHT7iB8IE",
  "access_expires_at": "2026-10-29T15:12:17.183875578Z",
  "refresh_token": "mzdjVruy4gTk_sIRhGs3_2xuZ6NYb1mXYj2UuE3bTC0",
  "refresh_expires_at": "2026-10-30T02:57:17.183346567Z",
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
  "command_id": "a07b0f12-9efd-425c-b853-4d19bb28d57e",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:57:17.75793Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "a07b0f12-9efd-425c-b853-4d19bb28d57e",
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
  "changed_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:57:17.75793Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48336052793",
  "device_ref": "sandbox-26159"
}
```

```json
{
  "challenge_id": "e3a373e2-9895-43fa-8b91-df3dd9f1d36f",
  "expires_at": "2026-10-29T15:02:18.352352011Z",
  "resend_available_at": "2026-10-29T14:57:19.352352011Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48336052793` → **200**

```json
{
  "phone": "+48336052793",
  "audience": "CLIENT",
  "code": "189847",
  "sent_at": "2026-10-29T14:57:18.354989393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3a373e2-9895-43fa-8b91-df3dd9f1d36f",
  "code": "189847",
  "device_ref": "sandbox-26159"
}
```

```json
{
  "session_id": "7fef9281-6083-4cc3-bac9-8d52221e3a54",
  "subject": {
    "type": "CLIENT",
    "id": "30fb9b56-8a30-4e7e-82d6-9024715e15f8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMGZiOWI1Ni04YTMwLTRlN2UtODJkNi05MDI0NzE1ZTE1ZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzM4LCJpYXQiOjE3OTMyODU4MzgsImp0aSI6ImE3ZjRiMDI1LTExNDctNDU3Yy1iNmMyLThmYTAzMTE0YjA3ZiIsInNpZCI6IjdmZWY5MjgxLTYwODMtNGNjMy1iYWM5LThkNTIyMjFlM2E1NCJ9.T9xU7ckwv5qj3Vb0cGbw9Art-Wyy1sLaesUduD7grcA",
  "access_expires_at": "2026-10-29T15:12:18.662823861Z",
  "refresh_token": "FCDmvyZ1PHHuKmLr-U2JCLHKr78zEcTz8QrCJtQJpOo",
  "refresh_expires_at": "2026-11-28T14:57:18.662322672Z",
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
  "correlation_id": "7cfa57b8-9a86-4d01-ae0e-378c13ed226e"
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
  "device_ref": "sandbox-19309"
}
```

```json
{
  "challenge_id": "61ab429d-122f-4950-a18d-8b703012742a",
  "expires_at": "2026-10-29T15:02:19.512243029Z",
  "resend_available_at": "2026-10-29T14:57:20.512243029Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "282007",
  "sent_at": "2026-10-29T14:57:19.515893744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61ab429d-122f-4950-a18d-8b703012742a",
  "code": "282007",
  "device_ref": "sandbox-19309"
}
```

```json
{
  "session_id": "6df17bf4-9394-46c0-94f9-276d5cf92fae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjczOSwiaWF0IjoxNzkzMjg1ODM5LCJqdGkiOiI3NTA5OGM2Mi03MjlkLTQ2OGEtOTU3YS05ZDRkNDdlNzE4ZGIiLCJzaWQiOiI2ZGYxN2JmNC05Mzk0LTQ2YzAtOTRmOS0yNzZkNWNmOTJmYWUifQ.8loM2FBxQV2hNwJcfiZd3zopjFJV3TIdcidGXPVAO5Q",
  "access_expires_at": "2026-10-29T15:12:19.83518911Z",
  "refresh_token": "p_cYI9vm3dV-ToerwoynHaI7GQ2WaPx2Od8cKqNTsUM",
  "refresh_expires_at": "2026-11-28T14:57:19.834603757Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "40d798f9-e36b-4f99-b5b0-bce0d9b44e89",
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
  "last_heartbeat_at": "2026-10-29T14:56:47.686675Z",
  "last_location_at": "2026-10-29T14:56:47.686675Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/40d798f9-e36b-4f99-b5b0-bce0d9b44e89/handover` → **200**

```json
{
  "command_id": "50702537-723a-43cb-a318-57c6f4fcacbf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "40d798f9-e36b-4f99-b5b0-bce0d9b44e89",
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
  "last_heartbeat_at": "2026-10-29T14:56:47.686675Z",
  "last_location_at": "2026-10-29T14:56:47.686675Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/40d798f9-e36b-4f99-b5b0-bce0d9b44e89/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:20Z",
    "sequence": 1793285840691
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "40d798f9-e36b-4f99-b5b0-bce0d9b44e89",
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
  "last_heartbeat_at": "2026-10-29T14:57:20.709749Z",
  "last_location_at": "2026-10-29T14:57:20.709749Z",
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
  "session_id": "40d798f9-e36b-4f99-b5b0-bce0d9b44e89",
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
  "last_heartbeat_at": "2026-10-29T14:57:20.709749Z",
  "last_location_at": "2026-10-29T14:57:20.709749Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/40d798f9-e36b-4f99-b5b0-bce0d9b44e89/close` → **200**

```json
{
  "command_id": "3ebb8c50-2d32-4ec5-a206-93ea9dd6de17",
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
  "correlation_id": "909e65fb-bff0-4388-98be-1341d582c6e1"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674257092",
  "device_ref": "sandbox-25047"
}
```

```json
{
  "challenge_id": "326a52e0-6242-461d-989a-191aa1ccb65e",
  "expires_at": "2026-10-29T15:02:22.205145341Z",
  "resend_available_at": "2026-10-29T14:57:23.205145341Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674257092` → **200**

```json
{
  "phone": "+380674257092",
  "audience": "CLIENT",
  "code": "948879",
  "sent_at": "2026-10-29T14:57:22.229781987Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "326a52e0-6242-461d-989a-191aa1ccb65e",
  "code": "948879",
  "device_ref": "sandbox-25047"
}
```

```json
{
  "session_id": "a77fead1-516f-4aa5-9c19-5a8cd3f26fa3",
  "subject": {
    "type": "CLIENT",
    "id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjI0YWZmNS00Y2ZiLTRhYmItOWNlYy00N2MwZGViZThjZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzQyLCJpYXQiOjE3OTMyODU4NDIsImp0aSI6IjQ1YjEzMTk1LTIzNzktNDE1OS1iZDczLWRiODI4YmVjODUxZiIsInNpZCI6ImE3N2ZlYWQxLTUxNmYtNGFhNS05YzE5LTVhOGNkM2YyNmZhMyJ9.VVack-RTTURfU7kARWqm3NvW3dpW7iTDpGygbrCZic8",
  "access_expires_at": "2026-10-29T15:12:22.552526939Z",
  "refresh_token": "JGA5XchiGYbyouX_7m_PdFLyT2an5ZxNKLAbtpokAnE",
  "refresh_expires_at": "2026-11-28T14:57:22.551923502Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "0ad13dcf-61ed-4a4c-a3ae-a53b82307c9d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "826d98bc-54f8-4a10-be56-9caa3cad2eaa",
  "upload_path": "/api/rider/v1/uploads/826d98bc-54f8-4a10-be56-9caa3cad2eaa",
  "expires_at": "2026-10-29T15:12:22.864041406Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/826d98bc-54f8-4a10-be56-9caa3cad2eaa` → **200**

```json
{
  "file_id": "826d98bc-54f8-4a10-be56-9caa3cad2eaa",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b7d7877d-d0b0-4198-931e-1ff90fcef576",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "826d98bc-54f8-4a10-be56-9caa3cad2eaa"
  ]
}
```

```json
{
  "id": "f7e26068-ebf4-4201-9f56-a309af9f5aac",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:57:23.235147Z",
  "updated_at": "2026-10-29T14:57:23.235147Z",
  "respond_by": "2026-10-29T18:57:23.235147Z",
  "messages": [
    {
      "id": "c204950e-05d5-4b1b-aa7e-dc1756b67935",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:57:23.236087Z",
      "attachments": [
        {
          "file_id": "826d98bc-54f8-4a10-be56-9caa3cad2eaa",
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
  "session_id": "39d6f477-2479-4bf6-87e0-524e73426154",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3NDMsImlhdCI6MTc5MzI4NTg0MywianRpIjoiM2I3MDZjMTMtNDAxNC00ZTk0LWE0MDEtYzY3MjliMDY4NDc2Iiwic2lkIjoiMzlkNmY0NzctMjQ3OS00YmY2LTg3ZTAtNTI0ZTczNDI2MTU0In0.7XZqy8UwO8vD-PZct-ACd3Fdr4QZjTCwQLLhA7rvlKk",
  "access_expires_at": "2026-10-29T15:12:23.881690353Z",
  "refresh_token": "8wRoQgpXGNUJZ8sY0BXPrw0hLuLvU9wttvN4Uop1Src",
  "refresh_expires_at": "2026-10-30T02:57:23.880939703Z",
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
  "session_id": "a5f302f6-8ad0-44d0-b761-10237c90154f",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3NDQsImlhdCI6MTc5MzI4NTg0NCwianRpIjoiNjNhOTRmMTUtZDVjOS00YjgzLThhNjYtMThkYTFjZDE3YTQwIiwic2lkIjoiYTVmMzAyZjYtOGFkMC00NGQwLWI3NjEtMTAyMzdjOTAxNTRmIn0.BImp2pcUFjEbdGGuL7ecu2d6hxraGMTGoYK-mKEr9Aw",
  "access_expires_at": "2026-10-29T15:12:24.470518301Z",
  "refresh_token": "TEW-aNk4FrhlgzXj0a8rTWs6zBrYyjjOHfLQpHVJQaw",
  "refresh_expires_at": "2026-10-30T02:57:24.469938477Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f7e26068-ebf4-4201-9f56-a309af9f5aac/attachments/826d98bc-54f8-4a10-be56-9caa3cad2eaa` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "71d400e9-06ba-4b38-bfb2-e762a13efa93",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f430dc0a-fa02-446f-95df-0f2ca356f307",
  "upload_path": "/api/operator/v1/uploads/f430dc0a-fa02-446f-95df-0f2ca356f307",
  "expires_at": "2026-10-29T15:12:24.774450947Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/f430dc0a-fa02-446f-95df-0f2ca356f307` → **200**

```json
{
  "file_id": "f430dc0a-fa02-446f-95df-0f2ca356f307",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f7e26068-ebf4-4201-9f56-a309af9f5aac` → **200**

```json
{
  "id": "f7e26068-ebf4-4201-9f56-a309af9f5aac",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:57:23.235147Z",
  "updated_at": "2026-10-29T14:57:23.235147Z",
  "respond_by": "2026-10-29T18:57:23.235147Z",
  "messages": [
    {
      "id": "c204950e-05d5-4b1b-aa7e-dc1756b67935",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:57:23.236087Z",
      "attachments": [
        {
          "file_id": "826d98bc-54f8-4a10-be56-9caa3cad2eaa",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f7e26068-ebf4-4201-9f56-a309af9f5aac/comments` → **200**

```json
{
  "command_id": "5099c7e9-9ed5-4a24-8291-cc1ab2c85507",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "f430dc0a-fa02-446f-95df-0f2ca356f307"
  ]
}
```

```json
{
  "id": "f7e26068-ebf4-4201-9f56-a309af9f5aac",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:57:23.235147Z",
  "updated_at": "2026-10-29T14:57:25.398288Z",
  "respond_by": "2026-10-29T18:57:23.235147Z",
  "messages": [
    {
      "id": "c204950e-05d5-4b1b-aa7e-dc1756b67935",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:57:23.236087Z",
      "attachments": [
        {
          "file_id": "826d98bc-54f8-4a10-be56-9caa3cad2eaa",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f64d73a1-c855-4a1f-adb4-9f61b298bcc7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:57:25.397722Z",
      "attachments": [
        {
          "file_id": "f430dc0a-fa02-446f-95df-0f2ca356f307",
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

`GET /api/rider/v1/support/cases/f7e26068-ebf4-4201-9f56-a309af9f5aac` → **200**

```json
{
  "id": "f7e26068-ebf4-4201-9f56-a309af9f5aac",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:57:23.235147Z",
  "updated_at": "2026-10-29T14:57:25.398288Z",
  "respond_by": "2026-10-29T18:57:23.235147Z",
  "messages": [
    {
      "id": "c204950e-05d5-4b1b-aa7e-dc1756b67935",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8f24aff5-4cfb-4abb-9cec-47c0debe8cff",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:57:23.236087Z",
      "attachments": [
        {
          "file_id": "826d98bc-54f8-4a10-be56-9caa3cad2eaa",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "f64d73a1-c855-4a1f-adb4-9f61b298bcc7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:57:25.397722Z",
      "attachments": [
        {
          "file_id": "f430dc0a-fa02-446f-95df-0f2ca356f307",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f7e26068-ebf4-4201-9f56-a309af9f5aac/attachments/f430dc0a-fa02-446f-95df-0f2ca356f307` → **200**

Done: support case f7e26068-ebf4-4201-9f56-a309af9f5aac, rider attachment 826d98bc-54f8-4a10-be56-9caa3cad2eaa, operator attachment f430dc0a-fa02-446f-95df-0f2ca356f307.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736024317",
  "device_ref": "sandbox-13427"
}
```

```json
{
  "challenge_id": "7e6b6d16-15a5-4344-a325-7c828c0329e3",
  "expires_at": "2026-10-29T15:02:26.023907886Z",
  "resend_available_at": "2026-10-29T14:57:27.023907886Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736024317` → **200**

```json
{
  "phone": "+380736024317",
  "audience": "CLIENT",
  "code": "786602",
  "sent_at": "2026-10-29T14:57:26.028145036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e6b6d16-15a5-4344-a325-7c828c0329e3",
  "code": "786602",
  "device_ref": "sandbox-13427"
}
```

```json
{
  "session_id": "9564333a-b4b8-439e-a4c4-dd94d34b902c",
  "subject": {
    "type": "CLIENT",
    "id": "175d1eeb-9988-4c17-b500-a765e46b905e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzVkMWVlYi05OTg4LTRjMTctYjUwMC1hNzY1ZTQ2YjkwNWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzQ2LCJpYXQiOjE3OTMyODU4NDYsImp0aSI6IjExNjZkNTBiLWU1MDktNDNlNC04YmMyLTg3NjUyODYyNDk0OCIsInNpZCI6Ijk1NjQzMzNhLWI0YjgtNDM5ZS1hNGM0LWRkOTRkMzRiOTAyYyJ9.U74QfSW0kQN5d1A-F85bwYDiQ0yCF0csi7hZELBLmj8",
  "access_expires_at": "2026-10-29T15:12:26.338791793Z",
  "refresh_token": "VceiA_fMdIOwHLTsOhy3SKSAYWau9zeDre2CWG19qjA",
  "refresh_expires_at": "2026-11-28T14:57:26.338317578Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "513510ed-0794-4296-a3b9-7c87d1e08bb9",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7e332d90-e6df-4307-a7c5-63cff6001a39",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7e332d90-e6df-4307-a7c5-63cff6001a39",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ffea1d19588df626ff79418d6d70b3f6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7e332d90-e6df-4307-a7c5-63cff6001a39",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736024317"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7e332d90-e6df-4307-a7c5-63cff6001a39",
  "expires_at": "2026-10-29T15:27:26.629875Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/7e332d90-e6df-4307-a7c5-63cff6001a39` → **200**

```json
{
  "id": "7e332d90-e6df-4307-a7c5-63cff6001a39",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:27:26.629875Z",
  "card": {
    "id": "2c74fdb2-a366-4fe6-b02f-8eea6723f0e1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7781",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:57:26.959233Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3a5497f6-a241-48ae-b805-6c0bdc858ee4",
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
  "id": "51dac3cb-7784-4ae4-8129-51101cc63932",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:02:27.273632Z",
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
  "command_id": "9fa1f8d0-c602-4a25-9a3f-e117621c42bf",
  "quote_id": "51dac3cb-7784-4ae4-8129-51101cc63932",
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
  "id": "794e7785-b7df-43ff-81fb-4834471de3b4",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "175d1eeb-9988-4c17-b500-a765e46b905e",
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
  "created_at": "2026-10-29T14:57:27.58621Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/794e7785-b7df-43ff-81fb-4834471de3b4` → **200**

```json
{
  "id": "794e7785-b7df-43ff-81fb-4834471de3b4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "175d1eeb-9988-4c17-b500-a765e46b905e",
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
  "created_at": "2026-10-29T14:57:27.58621Z",
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

`GET /api/rider/v1/orders/794e7785-b7df-43ff-81fb-4834471de3b4` → **200**

```json
{
  "id": "794e7785-b7df-43ff-81fb-4834471de3b4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "175d1eeb-9988-4c17-b500-a765e46b905e",
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
  "created_at": "2026-10-29T14:57:27.58621Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/794e7785-b7df-43ff-81fb-4834471de3b4/switch-to-cash` → **200**

```json
{
  "command_id": "104d3c36-5fa7-4af9-9f43-5e6371bbef42",
  "expected_version": 3
}
```

```json
{
  "id": "794e7785-b7df-43ff-81fb-4834471de3b4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "175d1eeb-9988-4c17-b500-a765e46b905e",
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
  "created_at": "2026-10-29T14:57:27.58621Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/794e7785-b7df-43ff-81fb-4834471de3b4/switch-to-cash` → **409**

```json
{
  "command_id": "0df0d315-8c87-43c4-a934-3e7713f2fc39",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/794e7785-b7df-43ff-81fb-4834471de3b4/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "89e8534b-02af-4390-8c02-49c30f859d3b"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/794e7785-b7df-43ff-81fb-4834471de3b4` → **200**

```json
{
  "id": "794e7785-b7df-43ff-81fb-4834471de3b4",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "175d1eeb-9988-4c17-b500-a765e46b905e",
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
  "created_at": "2026-10-29T14:57:27.58621Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/794e7785-b7df-43ff-81fb-4834471de3b4/cancel` → **200**

```json
{
  "command_id": "5c012ae2-4adb-436e-8783-212f6259c2d4",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "794e7785-b7df-43ff-81fb-4834471de3b4",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "175d1eeb-9988-4c17-b500-a765e46b905e",
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
  "created_at": "2026-10-29T14:57:27.58621Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
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
  "session_id": "cd4bd700-6bf2-4d07-b89b-7047cf21562a",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3NTAsImlhdCI6MTc5MzI4NTg1MCwianRpIjoiN2I2Y2JhMTUtNDYzNS00YmFmLTk0ZWQtY2UzNzI5OWVlOWJkIiwic2lkIjoiY2Q0YmQ3MDAtNmJmMi00ZDA3LWI4OWItNzA0N2NmMjE1NjJhIn0.kKYS5NQH-6-LrPUl4eJaqFCjT4k0jQP4iZ39gWBU_wo",
  "access_expires_at": "2026-10-29T15:12:30.061821312Z",
  "refresh_token": "mWY0UEIbcYz0yIRFG4YHK31-b-1WWxUlyVZC866_FAE",
  "refresh_expires_at": "2026-10-30T02:57:30.061339409Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-424"
}
```

```json
{
  "challenge_id": "3cf95aa8-6b87-4b7c-b7a2-e8750c558bd5",
  "expires_at": "2026-10-29T15:02:30.358466372Z",
  "resend_available_at": "2026-10-29T14:57:31.358466372Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "593069",
  "sent_at": "2026-10-29T14:57:30.361150081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3cf95aa8-6b87-4b7c-b7a2-e8750c558bd5",
  "code": "593069",
  "device_ref": "sandbox-424"
}
```

```json
{
  "session_id": "fba04ec5-5691-4bb7-a2d0-534c436cb225",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4Njc1MCwiaWF0IjoxNzkzMjg1ODUwLCJqdGkiOiI0ZmQzOThmZS01ODRlLTQxNDctYWZlMS0yMzgxZmExYzQ1MTEiLCJzaWQiOiJmYmEwNGVjNS01NjkxLTRiYjctYTJkMC01MzRjNDM2Y2IyMjUifQ.pdwMhXUTlNbA1Hg9VDYSr03Il9AcnitwmLlbeZryK9s",
  "access_expires_at": "2026-10-29T15:12:30.677150274Z",
  "refresh_token": "imnxuiIcitDNBC1cAfCU-FMnTVVFedxjeBvtyPxgkJU",
  "refresh_expires_at": "2026-11-28T14:57:30.676440699Z",
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
      "actor_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:57:14.493067Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T14:57:15.985807Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "8d78705c-56c1-4670-a6ab-ce57e54f4524",
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
  "device_ref": "sandbox-2325"
}
```

```json
{
  "challenge_id": "d1cc617d-2da9-406d-9895-e7a49f3bc884",
  "expires_at": "2026-10-29T15:02:31.844495748Z",
  "resend_available_at": "2026-10-29T14:57:32.844495748Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "263172",
  "sent_at": "2026-10-29T14:57:31.848790417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1cc617d-2da9-406d-9895-e7a49f3bc884",
  "code": "263172",
  "device_ref": "sandbox-2325"
}
```

```json
{
  "session_id": "8c413d41-f13d-4a6c-8db7-ec31ab7b7a2c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4Njc1MiwiaWF0IjoxNzkzMjg1ODUyLCJqdGkiOiJhMjY4NDUzOS0yN2EzLTQ3YWYtODNkOS01ODQ3OTFlZGMwNzMiLCJzaWQiOiI4YzQxM2Q0MS1mMTNkLTRhNmMtOGRiNy1lYzMxYWI3YjdhMmMifQ.TOmSOjyDZJeLiPMZ9Hl9UGl5bW0roVh-jdNBcihc-4w",
  "access_expires_at": "2026-10-29T15:12:32.175752791Z",
  "refresh_token": "LGcQ4YuF9gkI-BEbIyvYH3GrUhfxOL3sZ2UC2Y4NjfE",
  "refresh_expires_at": "2026-11-28T14:57:32.175149163Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f83e0d8-d11c-40d2-bd47-0c9c7119d506",
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
  "last_heartbeat_at": "2026-10-29T14:56:55.387273Z",
  "last_location_at": "2026-10-29T14:56:55.387273Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8f83e0d8-d11c-40d2-bd47-0c9c7119d506/handover` → **200**

```json
{
  "command_id": "9c786891-844a-4cd1-8fce-b604dd190be4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f83e0d8-d11c-40d2-bd47-0c9c7119d506",
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
  "last_heartbeat_at": "2026-10-29T14:56:55.387273Z",
  "last_location_at": "2026-10-29T14:56:55.387273Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8f83e0d8-d11c-40d2-bd47-0c9c7119d506/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:33Z",
    "sequence": 1793285853501
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f83e0d8-d11c-40d2-bd47-0c9c7119d506",
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
  "last_heartbeat_at": "2026-10-29T14:57:33.068856Z",
  "last_location_at": "2026-10-29T14:57:33.068856Z",
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
  "command_id": "bbe7269a-bd2f-4206-aa5c-b75db782cf6b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:33Z",
    "sequence": 1793285853621
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40f468f3-9677-4a96-873e-d1d8ab6c5fd2",
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
  "last_heartbeat_at": "2026-10-29T14:57:33.639287Z",
  "last_location_at": "2026-10-29T14:57:33.639287Z",
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
  "session_id": "98793ab9-14cb-4973-adba-9aaaa65e5d35",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3NTQsImlhdCI6MTc5MzI4NTg1NCwianRpIjoiNDM2ZmNiYWYtMTZjYy00Y2UxLWE2NTAtM2M5ZDFhZmE4Y2MwIiwic2lkIjoiOTg3OTNhYjktMTRjYi00OTczLWFkYmEtOWFhYWE2NWU1ZDM1In0.EK3P08JMxVe1_XILWQTqgDfOWdVLxpV7Weu7B0vbddM",
  "access_expires_at": "2026-10-29T15:12:34.215436548Z",
  "refresh_token": "tSdeUNtzNYWIYZ7QEv3q39GODGujA81z1aUF1g5Yi7E",
  "refresh_expires_at": "2026-10-30T02:57:34.214878963Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "87a53cca-663a-468f-a3fe-becb67ec0ab0",
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
  "id": "463fd659-f198-4b5e-84fe-f82d39b0cc18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:02:34.504350Z",
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
  "command_id": "60315d21-46fa-4738-97df-31a48f72ef99",
  "quote_id": "463fd659-f198-4b5e-84fe-f82d39b0cc18",
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
  "id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
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
  "created_at": "2026-10-29T14:57:34.806347Z",
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
    "id": "2c8b1baf-52c3-48a9-9ea6-e9ee847a1d0e",
    "order_id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
    "expires_at": "2026-10-29T14:57:49.810823Z",
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

`POST /api/driver/v1/offers/2c8b1baf-52c3-48a9-9ea6-e9ee847a1d0e/accept` → **200**

```json
{
  "command_id": "d7a89012-a90c-4728-b24a-8a8cc80db970"
}
```

```json
{
  "id": "c8a3efd9-3cb2-4dc8-97b0-9d8bc79b3eff",
  "order_id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "abcd7575-9967-475e-bea0-21f282d20aed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "abcd7575-9967-475e-bea0-21f282d20aed",
  "order_id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
  "assignment_id": "c8a3efd9-3cb2-4dc8-97b0-9d8bc79b3eff",
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

`POST /api/driver/v1/work-sessions/40f468f3-9677-4a96-873e-d1d8ab6c5fd2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:36Z",
    "sequence": 1793285856270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "40f468f3-9677-4a96-873e-d1d8ab6c5fd2",
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
  "last_heartbeat_at": "2026-10-29T14:57:36.288712Z",
  "last_location_at": "2026-10-29T14:57:36.288712Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/abcd7575-9967-475e-bea0-21f282d20aed/arrive` → **200**

```json
{
  "command_id": "7793a6cc-1ecb-4815-a428-d315d5235aa6",
  "expected_version": 0
}
```

```json
{
  "id": "abcd7575-9967-475e-bea0-21f282d20aed",
  "order_id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
  "assignment_id": "c8a3efd9-3cb2-4dc8-97b0-9d8bc79b3eff",
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
  "arrived_at": "2026-10-29T14:57:36.575765Z",
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

`POST /api/driver/v1/trips/abcd7575-9967-475e-bea0-21f282d20aed/start` → **200**

```json
{
  "command_id": "57b4163f-cf18-459c-9248-61dce70fe7cf",
  "expected_version": 1
}
```

```json
{
  "id": "abcd7575-9967-475e-bea0-21f282d20aed",
  "order_id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
  "assignment_id": "c8a3efd9-3cb2-4dc8-97b0-9d8bc79b3eff",
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
  "arrived_at": "2026-10-29T14:57:36.575765Z",
  "started_at": "2026-10-29T14:57:36.875281Z",
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

`POST /api/driver/v1/trips/abcd7575-9967-475e-bea0-21f282d20aed/complete` → **200**

```json
{
  "command_id": "3edff75c-51a6-4d01-8fd5-c0432dbfdf96",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:57:37Z",
  "cash_received": true
}
```

```json
{
  "id": "abcd7575-9967-475e-bea0-21f282d20aed",
  "order_id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
  "assignment_id": "c8a3efd9-3cb2-4dc8-97b0-9d8bc79b3eff",
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
  "arrived_at": "2026-10-29T14:57:36.575765Z",
  "started_at": "2026-10-29T14:57:36.875281Z",
  "completed_at": "2026-10-29T14:57:37.198909Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/c7d1ef57-7b10-45d0-a281-3669bed55457` → **200**

```json
{
  "id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
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
    "id": "c8a3efd9-3cb2-4dc8-97b0-9d8bc79b3eff",
    "order_id": "c7d1ef57-7b10-45d0-a281-3669bed55457",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "abcd7575-9967-475e-bea0-21f282d20aed",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:57:34.806347Z",
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
  "session_id": "8f83e0d8-d11c-40d2-bd47-0c9c7119d506",
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
  "last_heartbeat_at": "2026-10-29T14:57:33.068856Z",
  "last_location_at": "2026-10-29T14:57:33.068856Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8f83e0d8-d11c-40d2-bd47-0c9c7119d506/close` → **200**

```json
{
  "command_id": "ac5c353f-9737-42c5-9708-877eba3fd9c1",
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
  "session_id": "40f468f3-9677-4a96-873e-d1d8ab6c5fd2",
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
  "last_heartbeat_at": "2026-10-29T14:57:36.288712Z",
  "last_location_at": "2026-10-29T14:57:36.288712Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/40f468f3-9677-4a96-873e-d1d8ab6c5fd2/close` → **200**

```json
{
  "command_id": "bdb416a6-b41b-4ec2-9f92-1fc9e0dc487a",
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

Done: terminal order c7d1ef57-7b10-45d0-a281-3669bed55457 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17072"
}
```

```json
{
  "challenge_id": "d9346801-5d30-4f7c-b78f-8d157e79430d",
  "expires_at": "2026-10-29T15:02:42.251708702Z",
  "resend_available_at": "2026-10-29T14:57:43.251708702Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "808320",
  "sent_at": "2026-10-29T14:57:42.255409751Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9346801-5d30-4f7c-b78f-8d157e79430d",
  "code": "808320",
  "device_ref": "sandbox-17072"
}
```

```json
{
  "session_id": "96fd84ca-4cb2-489d-be82-9f1b0b3cad71",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4Njc2MiwiaWF0IjoxNzkzMjg1ODYyLCJqdGkiOiI5YjhhYzQyNy02YWY3LTRhMTktYmZhMC1lY2JlYmMyNDIwNGEiLCJzaWQiOiI5NmZkODRjYS00Y2IyLTQ4OWQtYmU4Mi05ZjFiMGIzY2FkNzEifQ.Qpex8g-Gw9Cerx9TisAeF_dCN2skAQmfTib0_XZgRFY",
  "access_expires_at": "2026-10-29T15:12:42.555833279Z",
  "refresh_token": "7SfmYmy7hE3sAVxcU8MCiaSMoUHQvtgQOdfVi8URIu4",
  "refresh_expires_at": "2026-11-28T14:57:42.555367988Z",
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
  "device_ref": "sandbox-25037"
}
```

```json
{
  "challenge_id": "0906cd7e-9894-46b9-a9de-7d23f3c5e9a3",
  "expires_at": "2026-10-29T15:02:43.106529584Z",
  "resend_available_at": "2026-10-29T14:57:44.106529584Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "504863",
  "sent_at": "2026-10-29T14:57:43.109341341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0906cd7e-9894-46b9-a9de-7d23f3c5e9a3",
  "code": "504863",
  "device_ref": "sandbox-25037"
}
```

```json
{
  "session_id": "671dfd2a-13d9-461c-8fd5-09541c70ada8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4Njc2MywiaWF0IjoxNzkzMjg1ODYzLCJqdGkiOiJiZDgzZjA3NS0zYTc0LTRlZWEtODg3Yi01NzNhMDA1MDk2NTQiLCJzaWQiOiI2NzFkZmQyYS0xM2Q5LTQ2MWMtOGZkNS0wOTU0MWM3MGFkYTgifQ.aRe1K8B1ncQUBX50GkvDBqHEXikzqPeKtMQ5iTXmwfE",
  "access_expires_at": "2026-10-29T15:12:43.419579842Z",
  "refresh_token": "LmhiR5iy6EaD1SjQzdgMm-_UzSIVi5RMr3clQlIUGwQ",
  "refresh_expires_at": "2026-11-28T14:57:43.418930163Z",
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
  "device_ref": "sandbox-13813"
}
```

```json
{
  "challenge_id": "d775ba9f-f366-4f53-84c8-b2b281047681",
  "expires_at": "2026-10-29T15:02:43.99116738Z",
  "resend_available_at": "2026-10-29T14:57:44.99116738Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "060110",
  "sent_at": "2026-10-29T14:57:43.993948051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d775ba9f-f366-4f53-84c8-b2b281047681",
  "code": "060110",
  "device_ref": "sandbox-13813"
}
```

```json
{
  "session_id": "1ba3cce0-6214-49a8-b1de-6c9e04744b50",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4Njc2NCwiaWF0IjoxNzkzMjg1ODY0LCJqdGkiOiJmNGMzOWQyMS0zZWI2LTQ4YWItOTdkNi04N2UxMDc5MmIyNmIiLCJzaWQiOiIxYmEzY2NlMC02MjE0LTQ5YTgtYjFkZS02YzllMDQ3NDRiNTAifQ.nlXxffXNUrw8xCoQAQQ0OzNYx3a7DU4gI4PKyCigQSM",
  "access_expires_at": "2026-10-29T15:12:44.30030692Z",
  "refresh_token": "oPTx7HvnE5qFGgz1sMowVzE8ZC8Y9GS2VuXbdbtRJls",
  "refresh_expires_at": "2026-11-28T14:57:44.299515817Z",
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
  "phone": "+380691157182",
  "device_ref": "sandbox-31282"
}
```

```json
{
  "challenge_id": "21481134-3772-4d9c-9b25-a92b5b1e4e9d",
  "expires_at": "2026-10-29T15:02:44.855405838Z",
  "resend_available_at": "2026-10-29T14:57:45.855405838Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380691157182` → **200**

```json
{
  "phone": "+380691157182",
  "audience": "CLIENT",
  "code": "695252",
  "sent_at": "2026-10-29T14:57:44.858075002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21481134-3772-4d9c-9b25-a92b5b1e4e9d",
  "code": "695252",
  "device_ref": "sandbox-31282"
}
```

```json
{
  "session_id": "1a8daa9a-f891-4ad0-b69f-0480239cbd4f",
  "subject": {
    "type": "CLIENT",
    "id": "72545806-a8eb-4eb7-affe-7cc26c5f266d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjU0NTgwNi1hOGViLTRlYjctYWZmZS03Y2MyNmM1ZjI2NmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzY1LCJpYXQiOjE3OTMyODU4NjUsImp0aSI6IjZlNzZiMjAxLTE3N2MtNDEzMS1iM2JkLTBkNjUxMTA1NmY4YSIsInNpZCI6IjFhOGRhYTlhLWY4OTEtNGFkMC1iNjlmLTA0ODAyMzljYmQ0ZiJ9.hOg4SWuQLZKSFaXD5nmN9S8YwXMZvOjVy8bHxNbD7Rg",
  "access_expires_at": "2026-10-29T15:12:45.171647177Z",
  "refresh_token": "f9ebp5mVxKJoUBO3UOssWLnSFk-igGeacQH1jASSjIQ",
  "refresh_expires_at": "2026-11-28T14:57:45.171168592Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "384c2117-6505-4049-936a-7f263448dc7c",
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
  "id": "a6a0625b-bd1c-4f17-a9e4-ee2b5e3d86f9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:02:45.465248Z",
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
  "command_id": "40728162-28a5-4b47-a955-a55fd3af3bc7",
  "quote_id": "a6a0625b-bd1c-4f17-a9e4-ee2b5e3d86f9",
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
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:45.763611Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:57:45.763611Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.905403683
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.182288664
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

`GET /api/rider/v1/orders/34578602-50cb-4521-b5b4-639efa13c6f8` → **200**

```json
{
  "id": "34578602-50cb-4521-b5b4-639efa13c6f8",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "72545806-a8eb-4eb7-affe-7cc26c5f266d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:57:45.763611Z",
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
  "session_id": "b87af6a5-b35e-4d39-9238-bfcb3fe0acd1",
  "subject": {
    "type": "STAFF",
    "id": "efe949ae-ae39-47f2-8672-c36f54fcf297"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZmU5NDlhZS1hZTM5LTQ3ZjItODY3Mi1jMzZmNTRmY2YyOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY5NDcsImlhdCI6MTc5MzI4NjA0NywianRpIjoiYWFmY2MyYzktMTliOS00NTA4LWE1ODQtMjhlNmE4OThmMzY1Iiwic2lkIjoiYjg3YWY2YTUtYjM1ZS00ZDM5LTkyMzgtYmZjYjNmZTBhY2QxIn0.L8p6owdfaOZ7FQATfGkENtXL7dZYptY1je7P-nhWblw",
  "access_expires_at": "2026-10-29T15:15:47.919759839Z",
  "refresh_token": "pdcPuWC6IEwaJfvhhuqhPc6hRrVq-pXcyUnaiffQO8g",
  "refresh_expires_at": "2026-10-30T03:00:47.919204789Z",
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
  "id": "9b1b2b09-15aa-4e53-8de9-549d65a5eeb7",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:48.224145Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:48.224186Z",
  "updated_at": "2026-10-29T15:00:48.240294Z",
  "finished_at": "2026-10-29T15:00:48.240294Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/9b1b2b09-15aa-4e53-8de9-549d65a5eeb7` → **200**

```json
{
  "run": {
    "id": "9b1b2b09-15aa-4e53-8de9-549d65a5eeb7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:00:48.224145Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:00:48.224186Z",
    "updated_at": "2026-10-29T15:00:48.240294Z",
    "finished_at": "2026-10-29T15:00:48.240294Z",
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
  "id": "9b1b2b09-15aa-4e53-8de9-549d65a5eeb7",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:48.224145Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:48.224186Z",
  "updated_at": "2026-10-29T15:00:48.240294Z",
  "finished_at": "2026-10-29T15:00:48.240294Z",
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
  "id": "9b1b2b09-15aa-4e53-8de9-549d65a5eeb7",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:48.224145Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:48.224186Z",
  "updated_at": "2026-10-29T15:00:48.240294Z",
  "finished_at": "2026-10-29T15:00:48.240294Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/4371726c-b687-4fb0-a6e5-e4135d63def6` → **204**

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
  "id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:48.705261Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:48.705303Z",
  "updated_at": "2026-10-29T15:00:48.712867Z",
  "finished_at": "2026-10-29T15:00:48.712867Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/a1cd23a5-4379-4ec2-92e6-491debf15934` → **200**

```json
{
  "run": {
    "id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:00:48.705261Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:00:48.705303Z",
    "updated_at": "2026-10-29T15:00:48.712867Z",
    "finished_at": "2026-10-29T15:00:48.712867Z",
    "version": 1
  },
  "items": [
    {
      "id": "811dbeb2-7abd-4c9f-aa2c-eb17dff7205f",
      "run_id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "04cd119ed9c122af831245cac9eb21f228102c431f8e4a53fc09874564f6aadc",
      "reference_display": "sandbox-reconciliation-#####c-b687-4fb0-a6e5-e4135d63def6",
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
      "provider_at": "2026-10-29T15:00:48Z",
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
  "id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:48.705261Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:48.705303Z",
  "updated_at": "2026-10-29T15:00:48.712867Z",
  "finished_at": "2026-10-29T15:00:48.712867Z",
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
  "id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:48.705261Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:48.705303Z",
  "updated_at": "2026-10-29T15:00:48.712867Z",
  "finished_at": "2026-10-29T15:00:48.712867Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/811dbeb2-7abd-4c9f-aa2c-eb17dff7205f/resolve` → **200**

```json
{
  "command_id": "20f1a7e5-0c39-4d06-b7d0-c39eb92699a4",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "811dbeb2-7abd-4c9f-aa2c-eb17dff7205f",
  "run_id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "04cd119ed9c122af831245cac9eb21f228102c431f8e4a53fc09874564f6aadc",
  "reference_display": "sandbox-reconciliation-#####c-b687-4fb0-a6e5-e4135d63def6",
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
  "provider_at": "2026-10-29T15:00:48Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "resolved_at": "2026-10-29T15:00:49.168341Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/811dbeb2-7abd-4c9f-aa2c-eb17dff7205f/resolve` → **200**

```json
{
  "command_id": "20f1a7e5-0c39-4d06-b7d0-c39eb92699a4",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "811dbeb2-7abd-4c9f-aa2c-eb17dff7205f",
  "run_id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "04cd119ed9c122af831245cac9eb21f228102c431f8e4a53fc09874564f6aadc",
  "reference_display": "sandbox-reconciliation-#####c-b687-4fb0-a6e5-e4135d63def6",
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
  "provider_at": "2026-10-29T15:00:48Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
  "resolved_at": "2026-10-29T15:00:49.168341Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/811dbeb2-7abd-4c9f-aa2c-eb17dff7205f/resolve` → **409**

```json
{
  "command_id": "43fe3f1c-ac85-412f-aef7-34302ba97d9a",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/811dbeb2-7abd-4c9f-aa2c-eb17dff7205f/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3d854b1e-8461-47b1-9a52-bbd1d5f09a22"
}
```

`GET /api/admin/v1/payment-reconciliations/a1cd23a5-4379-4ec2-92e6-491debf15934` → **200**

```json
{
  "run": {
    "id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:00:48.705261Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:00:48.705303Z",
    "updated_at": "2026-10-29T15:00:49.168341Z",
    "finished_at": "2026-10-29T15:00:48.712867Z",
    "version": 2
  },
  "items": [
    {
      "id": "811dbeb2-7abd-4c9f-aa2c-eb17dff7205f",
      "run_id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "04cd119ed9c122af831245cac9eb21f228102c431f8e4a53fc09874564f6aadc",
      "reference_display": "sandbox-reconciliation-#####c-b687-4fb0-a6e5-e4135d63def6",
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
      "provider_at": "2026-10-29T15:00:48Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "efe949ae-ae39-47f2-8672-c36f54fcf297",
      "resolved_at": "2026-10-29T15:00:49.168341Z",
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
      "id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T15:00:48.705261Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:00:48.705303Z",
      "updated_at": "2026-10-29T15:00:49.168341Z",
      "finished_at": "2026-10-29T15:00:48.712867Z",
      "version": 2
    },
    {
      "id": "fc366517-3524-4164-bf79-5839aea89ef8",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T14:52:46.634614Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:52:46.634809Z",
      "updated_at": "2026-10-29T14:52:46.644075Z",
      "finished_at": "2026-10-29T14:52:46.644075Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/4371726c-b687-4fb0-a6e5-e4135d63def6` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "a1cd23a5-4379-4ec2-92e6-491debf15934",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:48.705261Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:48.705303Z",
  "updated_at": "2026-10-29T15:00:49.168341Z",
  "finished_at": "2026-10-29T15:00:48.712867Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793286171827E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793286172128E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793286172128E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793286171887E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793286172129E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
