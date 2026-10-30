# Sandbox transcript (2026-10-30T09:01:31Z, 95dd676)

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
  "correlation_id": "01373215-5497-4bc1-8313-8095c3eeb59c"
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
  "session_id": "063327d9-a4c3-4b1c-a833-ce1268f52251",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE3OTksImlhdCI6MTc5MzM1MDg5OSwianRpIjoiNzYyMzFhMWItNzM1Mi00NjljLWIxNGEtMTg4ZTUzNDZhZTg0Iiwic2lkIjoiMDYzMzI3ZDktYTRjMy00YjFjLWE4MzMtY2UxMjY4ZjUyMjUxIn0.kc_B77RfbJdyuWdLXFYmSgKUuj8H6uTy0MMy-rmxkC8",
  "access_expires_at": "2026-10-30T09:16:39.651940409Z",
  "refresh_token": "Oz_7gDQSHrhh_TxRx4Y5wQcBcSng4Ki2iJmOre5Gu6g",
  "refresh_expires_at": "2026-10-30T21:01:39.649614437Z",
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
  "session_id": "ceaf7579-0e08-4f78-8bb3-721f0134125f",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4MDEsImlhdCI6MTc5MzM1MDkwMSwianRpIjoiMTJlMzIyZGQtYWU4NS00YTY2LTg0MDctZjk5ZDA2OWZlNzZhIiwic2lkIjoiY2VhZjc1NzktMGUwOC00Zjc4LThiYjMtNzIxZjAxMzQxMjVmIn0.QqgJtLZF33AZ5UnjptFm7v1WiBQdb6UFvbT8-L41Azw",
  "access_expires_at": "2026-10-30T09:16:41.50941821Z",
  "refresh_token": "m585984tfyFoj61bBrrF759sbpd3BIQhnHUniAUlX44",
  "refresh_expires_at": "2026-10-30T21:01:41.50819679Z",
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
  "device_ref": "sandbox-6070"
}
```

```json
{
  "challenge_id": "5435af19-3148-4f1f-b681-bbb834124f23",
  "expires_at": "2026-10-30T09:06:42.076314342Z",
  "resend_available_at": "2026-10-30T09:01:43.076314342Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "942047",
  "sent_at": "2026-10-30T09:01:42.089227563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5435af19-3148-4f1f-b681-bbb834124f23",
  "code": "942047",
  "device_ref": "sandbox-6070"
}
```

```json
{
  "session_id": "8b05e014-ed2f-4b44-ad26-0de29ddb37d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTgwMiwiaWF0IjoxNzkzMzUwOTAyLCJqdGkiOiIyOTQyYTA5NC03OGYzLTRhMTctYjIyZC00OGRiNjRjOTQ3ODYiLCJzaWQiOiI4YjA1ZTAxNC1lZDJmLTRiNDQtYWQyNi0wZGUyOWRkYjM3ZDEifQ.KhvYvOUYzb9G08HPTkznuuPzYmI1TGvqOZVzvJ4DsTY",
  "access_expires_at": "2026-10-30T09:16:42.391142824Z",
  "refresh_token": "L9dNRW0PtjaOCiT7OfnGbmESj-RXeW2nEnBM-AcNVI4",
  "refresh_expires_at": "2026-11-29T09:01:42.39014519Z",
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
  "command_id": "5d5ee19a-0c28-4635-9487-7abd0f5f5a4b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:01:42Z",
    "sequence": 1793350902891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "00c53e6d-01a1-443e-ac1f-0917bd7d0f8c",
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
  "last_heartbeat_at": "2026-10-30T09:01:42.988567Z",
  "last_location_at": "2026-10-30T09:01:42.988567Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631501107",
  "device_ref": "sandbox-13221"
}
```

```json
{
  "challenge_id": "0ca9c2d5-4ca2-405e-871a-4a192d6a7867",
  "expires_at": "2026-10-30T09:06:43.250278809Z",
  "resend_available_at": "2026-10-30T09:01:44.250278809Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631501107` → **200**

```json
{
  "phone": "+380631501107",
  "audience": "CLIENT",
  "code": "768670",
  "sent_at": "2026-10-30T09:01:43.255491932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ca9c2d5-4ca2-405e-871a-4a192d6a7867",
  "code": "768670",
  "device_ref": "sandbox-13221"
}
```

```json
{
  "session_id": "71eb98e3-d6e4-47d8-b55a-b803c651c42b",
  "subject": {
    "type": "CLIENT",
    "id": "f1c1b0ec-a7ca-429d-b38a-ac2dfb6faf23"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMWMxYjBlYy1hN2NhLTQyOWQtYjM4YS1hYzJkZmI2ZmFmMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxODAzLCJpYXQiOjE3OTMzNTA5MDMsImp0aSI6IjkwOThjM2YyLWIzYjEtNDY4Mi04MTNmLTI0NWZhOTIzMjg0NSIsInNpZCI6IjcxZWI5OGUzLWQ2ZTQtNDdkOC1iNTVhLWI4MDNjNjUxYzQyYiJ9.3hCa9w918za9rVzdiJkngp8bkj8y661c3dVHeOHw7kQ",
  "access_expires_at": "2026-10-30T09:16:43.535123406Z",
  "refresh_token": "fM8-rrtYMlQX_WGfjLrLv9qaxi4P4UgDWPJyh1OxdQY",
  "refresh_expires_at": "2026-11-29T09:01:43.53404044Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5aadded3-174b-45e7-b36a-62f4f0895931",
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
  "id": "99982472-8225-410f-885a-8f67fcd88c27",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:06:43.828995Z",
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
  "command_id": "468520bd-f9f1-4588-a389-e3d0429a2e36",
  "quote_id": "99982472-8225-410f-885a-8f67fcd88c27",
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
  "id": "d006736a-8522-46f6-afbb-ed544043da3a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f1c1b0ec-a7ca-429d-b38a-ac2dfb6faf23",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:01:44.167095Z",
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
    "id": "23dc2c01-b730-4065-a272-81f469da6d79",
    "order_id": "d006736a-8522-46f6-afbb-ed544043da3a",
    "expires_at": "2026-10-30T09:01:59.178429Z",
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

`POST /api/driver/v1/offers/23dc2c01-b730-4065-a272-81f469da6d79/accept` → **200**

```json
{
  "command_id": "a7e32e93-2248-49a7-bab5-ca9245dd2925"
}
```

```json
{
  "id": "970b7e06-12ed-447f-83c4-78b9ff733cc6",
  "order_id": "d006736a-8522-46f6-afbb-ed544043da3a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5afeafc7-d71a-49c6-a232-46cf1dfdcdb8",
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
  "command_id": "06474c79-c150-4db6-ba2f-ef501d2ce9bb",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:01:45.308125057Z"
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
  "id": "5afeafc7-d71a-49c6-a232-46cf1dfdcdb8",
  "order_id": "d006736a-8522-46f6-afbb-ed544043da3a",
  "assignment_id": "970b7e06-12ed-447f-83c4-78b9ff733cc6",
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

`POST /api/driver/v1/work-sessions/00c53e6d-01a1-443e-ac1f-0917bd7d0f8c/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:01:46Z",
    "sequence": 1793350906123
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "00c53e6d-01a1-443e-ac1f-0917bd7d0f8c",
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
  "last_heartbeat_at": "2026-10-30T09:01:46.14665Z",
  "last_location_at": "2026-10-30T09:01:46.14665Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5afeafc7-d71a-49c6-a232-46cf1dfdcdb8/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0ccb9cee-1be8-48ed-b9ef-b45c5caadb64",
  "expected_version": 0
}
```

```json
{
  "id": "5afeafc7-d71a-49c6-a232-46cf1dfdcdb8",
  "order_id": "d006736a-8522-46f6-afbb-ed544043da3a",
  "assignment_id": "970b7e06-12ed-447f-83c4-78b9ff733cc6",
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
  "arrived_at": "2026-10-30T09:01:46.417362Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5afeafc7-d71a-49c6-a232-46cf1dfdcdb8/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "cda2b298-7e56-4107-b133-d81deb1017b7",
  "expected_version": 1
}
```

```json
{
  "id": "5afeafc7-d71a-49c6-a232-46cf1dfdcdb8",
  "order_id": "d006736a-8522-46f6-afbb-ed544043da3a",
  "assignment_id": "970b7e06-12ed-447f-83c4-78b9ff733cc6",
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
  "arrived_at": "2026-10-30T09:01:46.417362Z",
  "started_at": "2026-10-30T09:01:46.688966Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5afeafc7-d71a-49c6-a232-46cf1dfdcdb8/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "924c07d1-c0b8-4f8f-be5e-5846c1404d98",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:01:46Z",
  "cash_received": true
}
```

```json
{
  "id": "5afeafc7-d71a-49c6-a232-46cf1dfdcdb8",
  "order_id": "d006736a-8522-46f6-afbb-ed544043da3a",
  "assignment_id": "970b7e06-12ed-447f-83c4-78b9ff733cc6",
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
  "arrived_at": "2026-10-30T09:01:46.417362Z",
  "started_at": "2026-10-30T09:01:46.688966Z",
  "completed_at": "2026-10-30T09:01:46.976367Z",
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
  "session_id": "00c53e6d-01a1-443e-ac1f-0917bd7d0f8c",
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
  "last_heartbeat_at": "2026-10-30T09:01:46.14665Z",
  "last_location_at": "2026-10-30T09:01:46.14665Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/00c53e6d-01a1-443e-ac1f-0917bd7d0f8c/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "200ea18a-3a13-48bd-b940-9e0fa45a154c",
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
  "command_id": "71411b6e-6b7a-45fe-b7ed-e248fe950903",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:01:47Z",
    "sequence": 1793350907782
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
  "correlation_id": "810d4149-7169-4a57-a572-b187fdcf08ce",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "f7b99f4b-d87c-41f8-9a83-665e1034d0f5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:01:48Z",
    "sequence": 1793350908541
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "234d460b-e7cd-4427-a297-16c5c52152ea",
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
  "last_heartbeat_at": "2026-10-30T09:01:48.073925Z",
  "last_location_at": "2026-10-30T09:01:48.073925Z",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T09:01:45.308125Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "bcb10d0c-0abe-4766-b7c1-5dbf7ef10567",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:01:48.602340577Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "234d460b-e7cd-4427-a297-16c5c52152ea",
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
  "last_heartbeat_at": "2026-10-30T09:01:48.073925Z",
  "last_location_at": "2026-10-30T09:01:48.073925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/234d460b-e7cd-4427-a297-16c5c52152ea/close` → **200**

```json
{
  "command_id": "f498fee0-12cf-405a-9b18-8de1f8f74985",
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
  "session_id": "6cabe25f-2bc0-4a24-8b28-79a190b723b2",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4MDksImlhdCI6MTc5MzM1MDkwOSwianRpIjoiNzM2ZGNmZmYtMTEyYS00MDU0LWEyYmItNDQwOTNhZTc1MjNjIiwic2lkIjoiNmNhYmUyNWYtMmJjMC00YTI0LThiMjgtNzlhMTkwYjcyM2IyIn0.35UtS1VUvlccdkGeFmY6Myrg4_6TN1cTaX74rWsuDUY",
  "access_expires_at": "2026-10-30T09:16:49.996391389Z",
  "refresh_token": "vsCAH4nnB4xdA2Rpfg3bDuYWw-pw90HNGLpjhIvUTDo",
  "refresh_expires_at": "2026-10-30T21:01:49.995480282Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "f382d9e9-c3db-48c3-a6bf-5ddf69707b29",
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
  "id": "41e33002-0ec1-4e38-b47f-4a893c3d510c",
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
  "created_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "created_at": "2026-10-30T09:01:50.263975Z",
  "updated_at": "2026-10-30T09:01:50.263975Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630008381",
  "device_ref": "sandbox-22535"
}
```

```json
{
  "challenge_id": "37d422d6-5d8c-4323-983e-6439acf11665",
  "expires_at": "2026-10-30T09:06:50.524416453Z",
  "resend_available_at": "2026-10-30T09:01:51.524416453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630008381` → **200**

```json
{
  "phone": "+380630008381",
  "audience": "CLIENT",
  "code": "751891",
  "sent_at": "2026-10-30T09:01:50.528915538Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37d422d6-5d8c-4323-983e-6439acf11665",
  "code": "751891",
  "device_ref": "sandbox-22535"
}
```

```json
{
  "session_id": "9c2fd902-598c-4382-8211-7dc6513e5dac",
  "subject": {
    "type": "CLIENT",
    "id": "9ef01c3a-f8df-4913-afc1-4350b8fe861f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZWYwMWMzYS1mOGRmLTQ5MTMtYWZjMS00MzUwYjhmZTg2MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxODEwLCJpYXQiOjE3OTMzNTA5MTAsImp0aSI6ImE0OTY5ZTMxLTRhNDgtNDg5MS04ZGI5LTUyZDZmNGE3NzhiYyIsInNpZCI6IjljMmZkOTAyLTU5OGMtNDM4Mi04MjExLTdkYzY1MTNlNWRhYyJ9.NTiGHioeKP9D7shUHLq7wcIjCF0ULy3gpNJXmzD7TxM",
  "access_expires_at": "2026-10-30T09:16:50.814968815Z",
  "refresh_token": "hFDRXgNvPb6gwT0PiuF1qiya3BhPR27lR9dsYoHVaEM",
  "refresh_expires_at": "2026-11-29T09:01:50.813818453Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630008381` → **200**

```json
{
  "client_id": "9ef01c3a-f8df-4913-afc1-4350b8fe861f"
}
```

`POST /api/admin/v1/rider-wallets/9ef01c3a-f8df-4913-afc1-4350b8fe861f/top-ups` → **201**

```json
{
  "command_id": "2a696b72-f742-4fd1-a0d1-14b34184eb7d",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "9ef01c3a-f8df-4913-afc1-4350b8fe861f",
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
      "id": "d8eca4f5-900b-4017-b0ac-d57932da093c",
      "at": "2026-10-30T09:01:51.330791Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "238a4f1d-2b5a-41a0-8c78-00d69611beeb",
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
  "id": "b483cbd7-0fe5-40b9-ad7f-b0aa6cf69020",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:06:51.610387Z",
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
      "id": "41e33002-0ec1-4e38-b47f-4a893c3d510c",
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
  "device_ref": "sandbox-1206"
}
```

```json
{
  "challenge_id": "28d491b6-41ee-491d-b32f-fbedf0eb7bc3",
  "expires_at": "2026-10-30T09:06:51.887015951Z",
  "resend_available_at": "2026-10-30T09:01:52.887015951Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "000394",
  "sent_at": "2026-10-30T09:01:51.891773729Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28d491b6-41ee-491d-b32f-fbedf0eb7bc3",
  "code": "000394",
  "device_ref": "sandbox-1206"
}
```

```json
{
  "session_id": "4463f4f0-5480-42c2-a860-6111946cb06e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTgxMiwiaWF0IjoxNzkzMzUwOTEyLCJqdGkiOiIxNjU1M2JiZi1kMjZlLTRlMjMtYjhjOC0zZGMyOTc4Y2Y0ODYiLCJzaWQiOiI0NDYzZjRmMC01NDgwLTQyYzItYTg2MC02MTExOTQ2Y2IwNmUifQ.LCepzIcJ9ELJefvaOE1geMt51ptmDlSO-20Fem7iq-s",
  "access_expires_at": "2026-10-30T09:16:52.179367962Z",
  "refresh_token": "X-fkxbAbRb2B-muS5CFpUVsodRyeOfdyV1bA0M8R888",
  "refresh_expires_at": "2026-11-29T09:01:52.178616877Z",
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
  "command_id": "5e4685c5-80ab-4ef8-8242-f29d524a302b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:01:52Z",
    "sequence": 1793350912678
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b95955a7-5146-4db8-85cb-9d560f01a010",
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
  "last_heartbeat_at": "2026-10-30T09:01:52.697997Z",
  "last_location_at": "2026-10-30T09:01:52.697997Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0ac5c86d-314e-4c8b-8366-53eaf229fb65",
  "quote_id": "b483cbd7-0fe5-40b9-ad7f-b0aa6cf69020",
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
  "id": "4ccbad59-a28a-4376-b0dc-d674901bf835",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ef01c3a-f8df-4913-afc1-4350b8fe861f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:01:52.974058Z",
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
  "client_id": "9ef01c3a-f8df-4913-afc1-4350b8fe861f",
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
      "id": "d8eca4f5-900b-4017-b0ac-d57932da093c",
      "at": "2026-10-30T09:01:51.330791Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3c5921be-dff9-4218-aea6-464468b5f646",
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
    "id": "7dc5b161-d5f3-48b6-881e-085384f7e260",
    "order_id": "4ccbad59-a28a-4376-b0dc-d674901bf835",
    "expires_at": "2026-10-30T09:02:07.984988Z",
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

`POST /api/driver/v1/offers/7dc5b161-d5f3-48b6-881e-085384f7e260/accept` → **200**

```json
{
  "command_id": "a4d8ce9d-af05-4631-a921-34420423b29b"
}
```

```json
{
  "id": "d6a22653-9281-4161-8840-8bbb831bd055",
  "order_id": "4ccbad59-a28a-4376-b0dc-d674901bf835",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af81957b-d2b8-4fab-b92b-27dccf6b9db9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af81957b-d2b8-4fab-b92b-27dccf6b9db9",
  "order_id": "4ccbad59-a28a-4376-b0dc-d674901bf835",
  "assignment_id": "d6a22653-9281-4161-8840-8bbb831bd055",
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

`POST /api/driver/v1/work-sessions/b95955a7-5146-4db8-85cb-9d560f01a010/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:01:54Z",
    "sequence": 1793350914282
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b95955a7-5146-4db8-85cb-9d560f01a010",
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
  "last_heartbeat_at": "2026-10-30T09:01:54.301677Z",
  "last_location_at": "2026-10-30T09:01:54.301677Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/af81957b-d2b8-4fab-b92b-27dccf6b9db9/arrive` → **200**

```json
{
  "command_id": "b89b7612-90df-4c6b-bb5b-dc998459d294",
  "expected_version": 0
}
```

```json
{
  "id": "af81957b-d2b8-4fab-b92b-27dccf6b9db9",
  "order_id": "4ccbad59-a28a-4376-b0dc-d674901bf835",
  "assignment_id": "d6a22653-9281-4161-8840-8bbb831bd055",
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
  "arrived_at": "2026-10-30T09:01:54.566605Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/af81957b-d2b8-4fab-b92b-27dccf6b9db9/start` → **200**

```json
{
  "command_id": "51e399bf-de6a-4182-8a9b-104b1ed660f8",
  "expected_version": 1
}
```

```json
{
  "id": "af81957b-d2b8-4fab-b92b-27dccf6b9db9",
  "order_id": "4ccbad59-a28a-4376-b0dc-d674901bf835",
  "assignment_id": "d6a22653-9281-4161-8840-8bbb831bd055",
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
  "arrived_at": "2026-10-30T09:01:54.566605Z",
  "started_at": "2026-10-30T09:01:54.830529Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/af81957b-d2b8-4fab-b92b-27dccf6b9db9/complete` → **200**

```json
{
  "command_id": "466f9ed5-1dd9-4517-9121-bd3088dcaada",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:01:55Z",
  "cash_received": true
}
```

```json
{
  "id": "af81957b-d2b8-4fab-b92b-27dccf6b9db9",
  "order_id": "4ccbad59-a28a-4376-b0dc-d674901bf835",
  "assignment_id": "d6a22653-9281-4161-8840-8bbb831bd055",
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
  "arrived_at": "2026-10-30T09:01:54.566605Z",
  "started_at": "2026-10-30T09:01:54.830529Z",
  "completed_at": "2026-10-30T09:01:55.111945Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9ef01c3a-f8df-4913-afc1-4350b8fe861f",
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
      "id": "ebac4aa5-c429-48ec-a15e-04a185492cfb",
      "at": "2026-10-30T09:01:55.865717Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "4ccbad59-a28a-4376-b0dc-d674901bf835"
    },
    {
      "id": "d8eca4f5-900b-4017-b0ac-d57932da093c",
      "at": "2026-10-30T09:01:51.330791Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/41e33002-0ec1-4e38-b47f-4a893c3d510c/archive` → **200**

```json
{
  "command_id": "65ecb9d0-cbea-49f0-8e0c-b1a925880368",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "41e33002-0ec1-4e38-b47f-4a893c3d510c",
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
  "created_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "created_at": "2026-10-30T09:01:50.263975Z",
  "updated_at": "2026-10-30T09:01:58.646669Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b95955a7-5146-4db8-85cb-9d560f01a010",
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
  "last_heartbeat_at": "2026-10-30T09:01:54.301677Z",
  "last_location_at": "2026-10-30T09:01:54.301677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b95955a7-5146-4db8-85cb-9d560f01a010/close` → **200**

```json
{
  "command_id": "cf776f47-69bf-4dcd-87e0-391ff7a8840f",
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

Done: order 4ccbad59-a28a-4376-b0dc-d674901bf835.

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
  "session_id": "218e712c-c373-4ec9-9114-6d628110cb9c",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4MTksImlhdCI6MTc5MzM1MDkxOSwianRpIjoiYmVlNzk0NGUtZjczZC00NmEzLWJiMzItMDc0NGI3NWUxYzI0Iiwic2lkIjoiMjE4ZTcxMmMtYzM3My00ZWM5LTkxMTQtNmQ2MjgxMTBjYjljIn0.6Lsnr9IVJ095Z2c3GBPAztqwc-oBEPsJMDCefYRmE2M",
  "access_expires_at": "2026-10-30T09:16:59.745213651Z",
  "refresh_token": "iAzU0Rm9_LQg_SUckbnVh3R3onYWrN5U9Fsj8_iddZY",
  "refresh_expires_at": "2026-10-30T21:01:59.74435975Z",
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
  "command_id": "06d2a20d-0bce-4acb-8002-6497c426f9fa",
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
  "session_id": "1de361a3-0f43-48e1-a9eb-60434fbae79d",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4MjAsImlhdCI6MTc5MzM1MDkyMCwianRpIjoiOTQzMzE5ZDMtYWRhOS00OWFiLThlZDUtNGI0MzUzODk0MWJiIiwic2lkIjoiMWRlMzYxYTMtMGY0My00OGUxLWE5ZWItNjA0MzRmYmFlNzlkIn0.Jn5H9hm7DgEWQR13Et7b5YzV-ryyEacmEu5hzpbxQY0",
  "access_expires_at": "2026-10-30T09:17:00.85379144Z",
  "refresh_token": "GWmtODbslDEv80RuCHlP_fGcQBhmneaDV6ZPtoYtAXQ",
  "refresh_expires_at": "2026-10-30T21:02:00.853219435Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.191167143",
    "linkedid": "1730052700.191167143",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671785346"
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
    "id": "1730052700.191167143",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "e3de4bc0-f95c-43bc-a1d6-392dc35b6b4a",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.126192Z",
      "answered_at": null,
      "ended_at": "2026-10-30T09:02:01.153036Z",
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
    "id": "1730052600.1388521532",
    "linkedid": "1730052600.1388521532",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671785346"
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
      "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.459996Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/5924b90e-9ed1-4e27-806e-41fe594e1d82/answer` → **200**

```json
{
  "command_id": "a8d218e2-d3b8-493d-a0c4-be83f54d5001"
}
```

```json
{
  "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671785346",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "order_ids": [],
  "started_at": "2026-10-30T09:02:01.459996Z",
  "answered_at": "2026-10-30T09:02:01.74724Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1388521532",
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
    "id": "1730052600.1388521532",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.459996Z",
      "answered_at": "2026-10-30T09:02:01.74724Z",
      "ended_at": "2026-10-30T09:02:02.026828Z",
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
      "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.459996Z",
      "answered_at": "2026-10-30T09:02:01.74724Z",
      "ended_at": "2026-10-30T09:02:02.026828Z",
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
      "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.459996Z",
      "answered_at": "2026-10-30T09:02:01.74724Z",
      "ended_at": "2026-10-30T09:02:02.026828Z",
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
      "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.459996Z",
      "answered_at": "2026-10-30T09:02:01.74724Z",
      "ended_at": "2026-10-30T09:02:02.026828Z",
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
      "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.459996Z",
      "answered_at": "2026-10-30T09:02:01.74724Z",
      "ended_at": "2026-10-30T09:02:02.026828Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:02:09.537814Z"
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
      "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.459996Z",
      "answered_at": "2026-10-30T09:02:01.74724Z",
      "ended_at": "2026-10-30T09:02:02.026828Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:02:09.537814Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/5924b90e-9ed1-4e27-806e-41fe594e1d82/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/5924b90e-9ed1-4e27-806e-41fe594e1d82/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=5924b90e-9ed1-4e27-806e-41fe594e1d82` → **200**

```json
{
  "changes": [
    {
      "id": "0fb8a753-139d-44b4-9594-f1cc27f85051",
      "occurred_at": "2026-10-30T09:02:11.646421Z",
      "actor_type": "STAFF",
      "actor_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"84d5bcb8-8d5c-44d7-9a32-c01b8dfb51fb\", \"order_ids\": []}",
      "correlation_id": "11d2030c-be6c-46a6-821b-06383ccc9972"
    },
    {
      "id": "9c2801f9-6710-4864-a55b-33431b3fca89",
      "occurred_at": "2026-10-30T09:02:11.616229Z",
      "actor_type": "STAFF",
      "actor_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"84d5bcb8-8d5c-44d7-9a32-c01b8dfb51fb\", \"order_ids\": []}",
      "correlation_id": "331faebb-06da-4407-9f88-cc4030d4b622"
    }
  ]
}
```

Done: call 5924b90e-9ed1-4e27-806e-41fe594e1d82 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2125"
}
```

```json
{
  "challenge_id": "d3519258-0fd0-42e3-a0f1-925019a245c8",
  "expires_at": "2026-10-30T09:07:11.931424617Z",
  "resend_available_at": "2026-10-30T09:02:12.931424617Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "362606",
  "sent_at": "2026-10-30T09:02:11.935087139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3519258-0fd0-42e3-a0f1-925019a245c8",
  "code": "362606",
  "device_ref": "sandbox-2125"
}
```

```json
{
  "session_id": "322291df-18b6-4e4f-856b-2f091947003e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTgzMiwiaWF0IjoxNzkzMzUwOTMyLCJqdGkiOiI1ZmNkZjk5NS0wNDRkLTQ5MmEtYjRmYS1iYTBmMWJmYmZlMDAiLCJzaWQiOiIzMjIyOTFkZi0xOGI2LTRlNGYtODU2Yi0yZjA5MTk0NzAwM2UifQ.fEvpynhRIcjqOP0uox1Ed5rCR6r0ccgBhww3OWoii98",
  "access_expires_at": "2026-10-30T09:17:12.207494479Z",
  "refresh_token": "Wd_rc2F2-hQq3TDswQ-q2PNN4alakgECLfXyQAwJjBE",
  "refresh_expires_at": "2026-11-29T09:02:12.206872301Z",
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
  "command_id": "9bc5258d-1ed0-4151-95dd-cac703fe1582",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:12Z",
    "sequence": 1793350932707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7d0ef1e-2369-45c7-bfd8-df3cc4d6b65f",
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
  "last_heartbeat_at": "2026-10-30T09:02:12.725776Z",
  "last_location_at": "2026-10-30T09:02:12.725776Z",
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
  "session_id": "e2af2414-2f2a-4c34-8858-6cf4b06df158",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4MzMsImlhdCI6MTc5MzM1MDkzMywianRpIjoiZGM3NTI5NGYtZWQzMS00Yzk5LWE1MjktN2ZjODI1MTgxMWZkIiwic2lkIjoiZTJhZjI0MTQtMmYyYS00YzM0LTg4NTgtNmNmNGIwNmRmMTU4In0.Fwu1h-WRFNgBkjpIHbqiwnXld2KL8b9EYPB9v0HlLZQ",
  "access_expires_at": "2026-10-30T09:17:13.273566572Z",
  "refresh_token": "hFYBW7DzC2H0VV9xvAvhrQMUc_WTrlkxYSyt1gC8IEw",
  "refresh_expires_at": "2026-10-30T21:02:13.272890349Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "df939818-8a71-456f-b920-16815ea6cce9",
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
  "id": "f234f26e-d5ea-4f31-9a68-5d27b862dc20",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:07:13.534439Z",
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
  "command_id": "61701144-6935-4303-9a5d-d3697b810f4b",
  "quote_id": "f234f26e-d5ea-4f31-9a68-5d27b862dc20",
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
    "phone": "+380676798807"
  }
}
```

```json
{
  "id": "003ec985-cf82-4725-8246-8d04a2758659",
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
  "created_at": "2026-10-30T09:02:13.821883Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676798807"
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
    "id": "545e3244-6d77-4b8d-b184-8fc5600cec4f",
    "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
    "expires_at": "2026-10-30T09:02:28.828469Z",
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

`POST /api/driver/v1/offers/545e3244-6d77-4b8d-b184-8fc5600cec4f/accept` → **200**

```json
{
  "command_id": "0bd1397f-0143-494a-a5b6-cb5f81edc3a5"
}
```

```json
{
  "id": "c4cd7ee6-1adc-4399-bff9-68db3e7fdce2",
  "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34f2d856-946c-4138-93d7-845fc040a614",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[
  {
    "phone": "+380676798807",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:15.762923432Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[
  {
    "phone": "+380676798807",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:15.762923432Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[
  {
    "phone": "+380676798807",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:15.762923432Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34f2d856-946c-4138-93d7-845fc040a614",
  "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
  "assignment_id": "c4cd7ee6-1adc-4399-bff9-68db3e7fdce2",
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
    "phone": "+380676798807"
  }
}
```

`POST /api/driver/v1/work-sessions/c7d0ef1e-2369-45c7-bfd8-df3cc4d6b65f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:16Z",
    "sequence": 1793350936993
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c7d0ef1e-2369-45c7-bfd8-df3cc4d6b65f",
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
  "last_heartbeat_at": "2026-10-30T09:02:17.010137Z",
  "last_location_at": "2026-10-30T09:02:17.010137Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/34f2d856-946c-4138-93d7-845fc040a614/arrive` → **200**

```json
{
  "command_id": "27f8f787-0b5b-442f-8140-8b7b30336625",
  "expected_version": 0
}
```

```json
{
  "id": "34f2d856-946c-4138-93d7-845fc040a614",
  "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
  "assignment_id": "c4cd7ee6-1adc-4399-bff9-68db3e7fdce2",
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
  "arrived_at": "2026-10-30T09:02:17.265968Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676798807"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[
  {
    "phone": "+380676798807",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:15.762923432Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[
  {
    "phone": "+380676798807",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:15.762923432Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[
  {
    "phone": "+380676798807",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:15.762923432Z"
  },
  {
    "phone": "+380676798807",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:18.774092468Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[
  {
    "phone": "+380676798807",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:15.762923432Z"
  },
  {
    "phone": "+380676798807",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:18.774092468Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676798807` → **200**

```json
[
  {
    "phone": "+380676798807",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:15.762923432Z"
  },
  {
    "phone": "+380676798807",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T09:02:18.774092468Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/34f2d856-946c-4138-93d7-845fc040a614/start` → **200**

```json
{
  "command_id": "4850ca48-3602-459d-9c39-8aac5b08542d",
  "expected_version": 1
}
```

```json
{
  "id": "34f2d856-946c-4138-93d7-845fc040a614",
  "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
  "assignment_id": "c4cd7ee6-1adc-4399-bff9-68db3e7fdce2",
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
  "arrived_at": "2026-10-30T09:02:17.265968Z",
  "started_at": "2026-10-30T09:02:19.663042Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676798807"
  }
}
```

`POST /api/driver/v1/trips/34f2d856-946c-4138-93d7-845fc040a614/complete` → **200**

```json
{
  "command_id": "6e631cea-bf00-4f71-82d1-db632a1b5d49",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:02:19Z",
  "cash_received": true
}
```

```json
{
  "id": "34f2d856-946c-4138-93d7-845fc040a614",
  "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
  "assignment_id": "c4cd7ee6-1adc-4399-bff9-68db3e7fdce2",
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
  "arrived_at": "2026-10-30T09:02:17.265968Z",
  "started_at": "2026-10-30T09:02:19.663042Z",
  "completed_at": "2026-10-30T09:02:19.934056Z",
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
  "session_id": "c7d0ef1e-2369-45c7-bfd8-df3cc4d6b65f",
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
  "last_heartbeat_at": "2026-10-30T09:02:17.010137Z",
  "last_location_at": "2026-10-30T09:02:17.010137Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c7d0ef1e-2369-45c7-bfd8-df3cc4d6b65f/close` → **200**

```json
{
  "command_id": "55ec06c4-8f58-47b1-92cd-58a129a99c4f",
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
  "phone": "+380631874605",
  "device_ref": "sandbox-14690"
}
```

```json
{
  "challenge_id": "8d88e4e1-ba1f-4251-baab-1b115d9df30e",
  "expires_at": "2026-10-30T09:07:20.732643673Z",
  "resend_available_at": "2026-10-30T09:02:21.732643673Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631874605` → **200**

```json
{
  "phone": "+380631874605",
  "audience": "CLIENT",
  "code": "911239",
  "sent_at": "2026-10-30T09:02:20.735905202Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8d88e4e1-ba1f-4251-baab-1b115d9df30e",
  "code": "911239",
  "device_ref": "sandbox-14690"
}
```

```json
{
  "session_id": "13ca5882-0e87-4231-9fdf-dfd60252cda9",
  "subject": {
    "type": "CLIENT",
    "id": "95cb6783-acff-4a9c-8fa4-b0df87a890d1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NWNiNjc4My1hY2ZmLTRhOWMtOGZhNC1iMGRmODdhODkwZDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxODQxLCJpYXQiOjE3OTMzNTA5NDEsImp0aSI6ImFiOTQ1NzMwLTVmZmQtNGVkYi1hNzk1LWQwNDMwNDhiOGUyZiIsInNpZCI6IjEzY2E1ODgyLTBlODctNDIzMS05ZmRmLWRmZDYwMjUyY2RhOSJ9.iSDJuHCEWBiATh8oIdMLkZOUTHdfQA7fZYvfHX9aFh8",
  "access_expires_at": "2026-10-30T09:17:21.005339746Z",
  "refresh_token": "SVnUg0m0omN_D1XjoJzLRwNUxYpsOWCB44do0Ug1PLA",
  "refresh_expires_at": "2026-11-29T09:02:21.004677862Z",
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
  "device_ref": "sandbox-15854"
}
```

```json
{
  "challenge_id": "ca83b255-bc31-47ce-bebc-002655f30ee1",
  "expires_at": "2026-10-30T09:07:21.49622495Z",
  "resend_available_at": "2026-10-30T09:02:22.49622495Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "478636",
  "sent_at": "2026-10-30T09:02:21.499394126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca83b255-bc31-47ce-bebc-002655f30ee1",
  "code": "478636",
  "device_ref": "sandbox-15854"
}
```

```json
{
  "session_id": "d133ec05-2616-470a-afa8-1235d99be278",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTg0MSwiaWF0IjoxNzkzMzUwOTQxLCJqdGkiOiJlODViMzBiMy04NDAwLTQ2ZjItYmM0Yi1iOTMxZTQ4MTA0NWEiLCJzaWQiOiJkMTMzZWMwNS0yNjE2LTQ3MGEtYWZhOC0xMjM1ZDk5YmUyNzgifQ.wCeNJo9YpwaI2olu6o5kh89he5vYKnTj4cpz3hysYMk",
  "access_expires_at": "2026-10-30T09:17:21.772322884Z",
  "refresh_token": "00h_KlMDvjIhZ-2-5XfrsIbwLyMAM-YHxhkhjpTxr0Q",
  "refresh_expires_at": "2026-11-29T09:02:21.771679631Z",
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
  "session_id": "cca85d14-c9d1-4c40-9c05-98c08a8b7072",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4NDIsImlhdCI6MTc5MzM1MDk0MiwianRpIjoiNzJiYzZjMDQtYzcyMy00ZjdjLTlkM2QtODQ2M2EwODdlMGQ3Iiwic2lkIjoiY2NhODVkMTQtYzlkMS00YzQwLTljMDUtOThjMDhhOGI3MDcyIn0.w44VFjLIFjUmAqjF4HeNMgIAqygG7Z_0YMjRlNug0ac",
  "access_expires_at": "2026-10-30T09:17:22.565111321Z",
  "refresh_token": "iVckQ12n5qn2G-twR_6SH-mrhs9UVwQihP8HfDe-4w8",
  "refresh_expires_at": "2026-10-30T21:02:22.564556496Z",
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
  "session_id": "553d681b-a7d4-40c7-9440-31d72811d03f",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4NDMsImlhdCI6MTc5MzM1MDk0MywianRpIjoiOTFkZTMyMzEtZWI0NS00YmMwLTgxYTEtNDgzNjdhOWFjNWJkIiwic2lkIjoiNTUzZDY4MWItYTdkNC00MGM3LTk0NDAtMzFkNzI4MTFkMDNmIn0.wvYLuA6q16hFlXUlhTt3e18yj52Beh5P1aYG22O86LM",
  "access_expires_at": "2026-10-30T09:17:23.116692954Z",
  "refresh_token": "I93i8ZpEJQRaVNWnnKVlHVYQKT_6REFjgmz7qmUD81I",
  "refresh_expires_at": "2026-10-30T21:02:23.115990208Z",
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
  "command_id": "6c977b2b-647c-4aca-9d43-729be1bfa014",
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
  "id": "95a28e5a-8b12-45ca-9f8a-e7b4a3491dd0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:07:23.625431Z",
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
  "command_id": "1c5285f2-f3c9-4479-b386-fdfa0e5bf431",
  "quote_id": "95a28e5a-8b12-45ca-9f8a-e7b4a3491dd0",
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
  "id": "1ee6dd3c-87b7-468b-80cd-52dc0af992c7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "95cb6783-acff-4a9c-8fa4-b0df87a890d1",
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
  "created_at": "2026-10-30T09:02:23.899942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1ee6dd3c-87b7-468b-80cd-52dc0af992c7` → **200**

```json
{
  "id": "1ee6dd3c-87b7-468b-80cd-52dc0af992c7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "95cb6783-acff-4a9c-8fa4-b0df87a890d1",
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
  "created_at": "2026-10-30T09:02:23.899942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1ee6dd3c-87b7-468b-80cd-52dc0af992c7/cancel` → **200**

```json
{
  "command_id": "3698b823-3149-432f-96c4-da870a05583f",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "1ee6dd3c-87b7-468b-80cd-52dc0af992c7",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "95cb6783-acff-4a9c-8fa4-b0df87a890d1",
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
  "created_at": "2026-10-30T09:02:23.899942Z",
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
  "command_id": "0507e32f-f216-42ff-83c6-72099e9f192d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:24Z",
    "sequence": 1793350944970
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e55467f9-c1c2-4a4f-b5f4-be4c6ec6e740",
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
  "last_heartbeat_at": "2026-10-30T09:02:24.988728Z",
  "last_location_at": "2026-10-30T09:02:24.988728Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13415"
}
```

```json
{
  "challenge_id": "4dc7606c-8608-49c0-a3ba-645b0f810a08",
  "expires_at": "2026-10-30T09:07:25.241268275Z",
  "resend_available_at": "2026-10-30T09:02:26.241268275Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "043907",
  "sent_at": "2026-10-30T09:02:25.246780955Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dc7606c-8608-49c0-a3ba-645b0f810a08",
  "code": "043907",
  "device_ref": "sandbox-13415"
}
```

```json
{
  "session_id": "95b38c79-7acf-4a7f-a585-80481b0e5789",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTg0NSwiaWF0IjoxNzkzMzUwOTQ1LCJqdGkiOiI3N2EwYTUwNy1hODY3LTQ4MDEtOTI1NC1lNDlhZTQyMmQ5OTMiLCJzaWQiOiI5NWIzOGM3OS03YWNmLTRhN2YtYTU4NS04MDQ4MWIwZTU3ODkifQ.CSUbLqx7CmIcEOaRLc2KUWh9BU-PTOiWO8qzGrVSKTA",
  "access_expires_at": "2026-10-30T09:17:25.519935983Z",
  "refresh_token": "FFbcQWWoUdhAMh3ez3xMUK2cqpt7I8QeNfa8D4OyWoE",
  "refresh_expires_at": "2026-11-29T09:02:25.519420668Z",
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
  "command_id": "c7c6f93a-13d0-4244-8022-3407a9fe770b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:26Z",
    "sequence": 1793350946126
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "20ba33d1-17ce-4e9f-9be0-618409c61121",
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
  "last_heartbeat_at": "2026-10-30T09:02:26.03012Z",
  "last_location_at": "2026-10-30T09:02:26.03012Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4c82d1b3-f478-4f9a-bc35-b02f72070ac5",
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
  "id": "d88ac5bb-957c-45a3-94f3-89d819af7cdd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:07:26.289670Z",
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
  "command_id": "48b57e81-89e4-425e-ad73-b9ae054565a6",
  "quote_id": "d88ac5bb-957c-45a3-94f3-89d819af7cdd",
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
  "id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "95cb6783-acff-4a9c-8fa4-b0df87a890d1",
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
  "created_at": "2026-10-30T09:02:26.556189Z",
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
    "id": "96e75de0-4e36-4967-8550-26790e0b1c4a",
    "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
    "expires_at": "2026-10-30T09:02:41.561335Z",
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

`POST /api/driver/v1/offers/96e75de0-4e36-4967-8550-26790e0b1c4a/accept` → **200**

```json
{
  "command_id": "baf15da5-1c97-4a82-83d1-ae248b7db3b8"
}
```

```json
{
  "id": "9e6e8e64-31cc-42f0-8aea-2e32092e1a22",
  "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6fb92a2f-bdde-45fe-9ac3-5788f8e94b02",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6fb92a2f-bdde-45fe-9ac3-5788f8e94b02",
  "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
  "assignment_id": "9e6e8e64-31cc-42f0-8aea-2e32092e1a22",
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

`POST /api/driver/v1/trips/6fb92a2f-bdde-45fe-9ac3-5788f8e94b02/cancel` → **200**

```json
{
  "command_id": "efe48680-9e32-4e65-add3-302c5ae485ee",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "6fb92a2f-bdde-45fe-9ac3-5788f8e94b02",
  "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
  "assignment_id": "9e6e8e64-31cc-42f0-8aea-2e32092e1a22",
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

`GET /api/rider/v1/orders/9dc81f5d-f777-471f-8f68-bf1657c16d7b` → **200**

```json
{
  "id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "95cb6783-acff-4a9c-8fa4-b0df87a890d1",
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
    "id": "9e6e8e64-31cc-42f0-8aea-2e32092e1a22",
    "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6fb92a2f-bdde-45fe-9ac3-5788f8e94b02",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:02:26.556189Z",
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
    "id": "d47ee82b-15d5-4165-9d00-349656651d4d",
    "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
    "expires_at": "2026-10-30T09:02:42.649669Z",
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

`POST /api/driver/v1/offers/d47ee82b-15d5-4165-9d00-349656651d4d/accept` → **200**

```json
{
  "command_id": "314e4425-f8f8-47d0-b05f-b18409eb69f9"
}
```

```json
{
  "id": "77d03781-82f7-4c76-bc1c-1d2f5b65cb06",
  "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1c0e8710-47fe-49e5-a438-090495b4187a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1c0e8710-47fe-49e5-a438-090495b4187a",
  "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
  "assignment_id": "77d03781-82f7-4c76-bc1c-1d2f5b65cb06",
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

`POST /api/driver/v1/trips/1c0e8710-47fe-49e5-a438-090495b4187a/cancel` → **200**

```json
{
  "command_id": "3e889550-7680-4e40-9c59-571867dff681",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1c0e8710-47fe-49e5-a438-090495b4187a",
  "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
  "assignment_id": "77d03781-82f7-4c76-bc1c-1d2f5b65cb06",
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
    "id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:02:26.556189Z",
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
    "id": "1ee6dd3c-87b7-468b-80cd-52dc0af992c7",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:02:23.899942Z",
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

`GET /api/operator/v1/orders/9dc81f5d-f777-471f-8f68-bf1657c16d7b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:02:26.557102Z",
      "actor": {
        "type": "CLIENT",
        "id": "95cb6783-acff-4a9c-8fa4-b0df87a890d1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
        "quote_id": "d88ac5bb-957c-45a3-94f3-89d819af7cdd",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "eff8d88d-19b8-4f37-8ac5-096f182aa09f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:02:26.560092Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
        "attempt_id": "46ce3a8c-1c57-4637-8ef1-2b7115b6c6e8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "eff8d88d-19b8-4f37-8ac5-096f182aa09f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:02:26.56958Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "96e75de0-4e36-4967-8550-26790e0b1c4a",
        "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "eff8d88d-19b8-4f37-8ac5-096f182aa09f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:02:27.109614Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "96e75de0-4e36-4967-8550-26790e0b1c4a",
        "order_id": "9dc81f5d-f777-471f-8f68-bf1657c16d7b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "9e6e8e64-31cc-42f0-8aea-2e32092e1a22"
      },
      "correlation_id": "73e113b5-8ede-440d-ae69-f627b2c30408"
```

Done: orders 1ee6dd3c-87b7-468b-80cd-52dc0af992c7, 9dc81f5d-f777-471f-8f68-bf1657c16d7b.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732802693",
  "device_ref": "sandbox-19583"
}
```

```json
{
  "challenge_id": "18143dff-f3dd-4666-96d4-cb39b2ddfb53",
  "expires_at": "2026-10-30T09:07:29.745924964Z",
  "resend_available_at": "2026-10-30T09:02:30.745924964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732802693` → **200**

```json
{
  "phone": "+380732802693",
  "audience": "CLIENT",
  "code": "027508",
  "sent_at": "2026-10-30T09:02:29.748605846Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18143dff-f3dd-4666-96d4-cb39b2ddfb53",
  "code": "027508",
  "device_ref": "sandbox-19583"
}
```

```json
{
  "session_id": "f241a506-b142-4333-835e-b40f61b258fe",
  "subject": {
    "type": "CLIENT",
    "id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzBmNmI3Ni1iMjYyLTQzZDYtOWE2MS0zZjNlN2M5ODQyOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxODUwLCJpYXQiOjE3OTMzNTA5NTAsImp0aSI6IjM4NWRmY2Y1LWY0ZGEtNGVkYy04MDExLWUyZWE3ODNmNjcyNyIsInNpZCI6ImYyNDFhNTA2LWIxNDItNDMzMy04MzVlLWI0MGY2MWIyNThmZSJ9.IPHkBBMgn6RKSTPaFMc6XrOLt5UVE79DkPLKh1Qpfwc",
  "access_expires_at": "2026-10-30T09:17:30.026036171Z",
  "refresh_token": "NMf0dQeE77ptHgHOaVnRP9hykxCK_CFoeRiElXOcvgw",
  "refresh_expires_at": "2026-11-29T09:02:30.025495798Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c0bb8cb6-d3a7-4619-ad78-d8ff5a373038",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "de3080b5-0844-42cb-a2a6-bb0f70f583df",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-de3080b5-0844-42cb-a2a6-bb0f70f583df",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "db7a3874f14790b613bde6b42a885663",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=de3080b5-0844-42cb-a2a6-bb0f70f583df",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732802693"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=de3080b5-0844-42cb-a2a6-bb0f70f583df",
  "expires_at": "2026-10-30T09:32:30.280563Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/de3080b5-0844-42cb-a2a6-bb0f70f583df` → **200**

```json
{
  "id": "de3080b5-0844-42cb-a2a6-bb0f70f583df",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:32:30.280563Z",
  "card": {
    "id": "a5f5b20b-c7ba-4674-87f9-a2f9af3b7a8a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2144",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:02:30.544977Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "a5f5b20b-c7ba-4674-87f9-a2f9af3b7a8a",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2144",
      "card_type": "Visa",
      "created_at": "2026-10-30T09:02:30.544977Z"
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
  "device_ref": "sandbox-8413"
}
```

```json
{
  "challenge_id": "12c8b722-dfee-4bd0-b249-c342252be777",
  "expires_at": "2026-10-30T09:07:31.065919583Z",
  "resend_available_at": "2026-10-30T09:02:32.065919583Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "673214",
  "sent_at": "2026-10-30T09:02:31.069802887Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12c8b722-dfee-4bd0-b249-c342252be777",
  "code": "673214",
  "device_ref": "sandbox-8413"
}
```

```json
{
  "session_id": "ef8310fb-dee0-4ec5-86a8-fb74eebe67fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTg1MSwiaWF0IjoxNzkzMzUwOTUxLCJqdGkiOiI0NzZjZjJkNi05ZmJmLTRkMDEtYWIwYy02NzBiYzFkMWYyMjEiLCJzaWQiOiJlZjgzMTBmYi1kZWUwLTRlYzUtODZhOC1mYjc0ZWViZTY3ZmQifQ.6FJeaMvEqA8j3pKts69SeyURPHrBK3egbJ7hAHVv570",
  "access_expires_at": "2026-10-30T09:17:31.345469456Z",
  "refresh_token": "X6IGz-sUfCessKzuEPchciYYRB5_HqIzOFVhrE1LuxQ",
  "refresh_expires_at": "2026-11-29T09:02:31.344839464Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "20ba33d1-17ce-4e9f-9be0-618409c61121",
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
  "last_heartbeat_at": "2026-10-30T09:02:26.03012Z",
  "last_location_at": "2026-10-30T09:02:26.03012Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/20ba33d1-17ce-4e9f-9be0-618409c61121/handover` → **200**

```json
{
  "command_id": "3aa86c89-067d-4ed7-afcd-32e0200a9060",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "20ba33d1-17ce-4e9f-9be0-618409c61121",
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
  "last_heartbeat_at": "2026-10-30T09:02:26.03012Z",
  "last_location_at": "2026-10-30T09:02:26.03012Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/20ba33d1-17ce-4e9f-9be0-618409c61121/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:32Z",
    "sequence": 1793350952948
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "20ba33d1-17ce-4e9f-9be0-618409c61121",
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
  "last_heartbeat_at": "2026-10-30T09:02:32.112123Z",
  "last_location_at": "2026-10-30T09:02:32.112123Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2341f4bb-65d5-4aee-9e9e-daff08a37e74",
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
  "id": "ef26e3ba-f6ad-45de-a84c-8374e8a956bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:07:32.372927Z",
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
  "command_id": "d3778d77-4e5d-412c-ac56-26d2bbb988d9",
  "quote_id": "ef26e3ba-f6ad-45de-a84c-8374e8a956bb",
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
  "id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
  "created_at": "2026-10-30T09:02:32.653558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274` → **200**

```json
{
  "id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
  "created_at": "2026-10-30T09:02:32.653558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274` → **200**

```json
{
  "id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
  "created_at": "2026-10-30T09:02:32.653558Z",
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
    "id": "e2e78219-0d41-4162-8770-006a03a78cc6",
    "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
    "expires_at": "2026-10-30T09:02:48.143214Z",
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

`POST /api/driver/v1/offers/e2e78219-0d41-4162-8770-006a03a78cc6/accept` → **200**

```json
{
  "command_id": "4838ed31-19e1-4f5b-b22c-98c7f8624407"
}
```

```json
{
  "id": "031a781c-ce50-4a61-80fe-06795443aa9a",
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "da014bfb-895c-418b-8874-6de803453334",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "da014bfb-895c-418b-8874-6de803453334",
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "assignment_id": "031a781c-ce50-4a61-80fe-06795443aa9a",
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

`POST /api/driver/v1/work-sessions/20ba33d1-17ce-4e9f-9be0-618409c61121/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:35Z",
    "sequence": 1793350955202
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "20ba33d1-17ce-4e9f-9be0-618409c61121",
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
  "last_heartbeat_at": "2026-10-30T09:02:35.221442Z",
  "last_location_at": "2026-10-30T09:02:35.221442Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/da014bfb-895c-418b-8874-6de803453334/arrive` → **200**

```json
{
  "command_id": "461c4573-97cd-428e-80ed-08aa3a0460ab",
  "expected_version": 0
}
```

```json
{
  "id": "da014bfb-895c-418b-8874-6de803453334",
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "assignment_id": "031a781c-ce50-4a61-80fe-06795443aa9a",
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
  "arrived_at": "2026-10-30T09:02:35.48537Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/da014bfb-895c-418b-8874-6de803453334/start` → **200**

```json
{
  "command_id": "3ccca36a-8891-4053-96e3-f167d92e2b51",
  "expected_version": 1
}
```

```json
{
  "id": "da014bfb-895c-418b-8874-6de803453334",
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "assignment_id": "031a781c-ce50-4a61-80fe-06795443aa9a",
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
  "arrived_at": "2026-10-30T09:02:35.48537Z",
  "started_at": "2026-10-30T09:02:35.75166Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/da014bfb-895c-418b-8874-6de803453334/complete` → **200**

```json
{
  "command_id": "1026e317-fb60-46c2-9419-48564745cfa0",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:02:36Z",
  "cash_received": true
}
```

```json
{
  "id": "da014bfb-895c-418b-8874-6de803453334",
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "assignment_id": "031a781c-ce50-4a61-80fe-06795443aa9a",
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
  "arrived_at": "2026-10-30T09:02:35.48537Z",
  "started_at": "2026-10-30T09:02:35.75166Z",
  "completed_at": "2026-10-30T09:02:36.021653Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274` → **200**

```json
{
  "id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
    "id": "031a781c-ce50-4a61-80fe-06795443aa9a",
    "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "da014bfb-895c-418b-8874-6de803453334",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:02:32.653558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274` → **200**

```json
{
  "id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
    "id": "031a781c-ce50-4a61-80fe-06795443aa9a",
    "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "da014bfb-895c-418b-8874-6de803453334",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:02:32.653558Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274` → **200**

```json
{
  "id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
    "id": "031a781c-ce50-4a61-80fe-06795443aa9a",
    "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "da014bfb-895c-418b-8874-6de803453334",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:02:32.653558Z",
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

`GET /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274/tip` → **200**

```json
{
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
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
  "available_until": "2026-10-31T09:02:36.021653Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274/tip` → **201**

```json
{
  "command_id": "befe84cd-a2eb-41f8-84ba-1562ff9e3611",
  "amount_minor": 2500
}
```

```json
{
  "id": "92e2493d-ad08-438f-b0f3-78fde864dab7",
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:02:39.64535Z"
}
```

`GET /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274/tip` → **200**

```json
{
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
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
  "available_until": "2026-10-31T09:02:36.021653Z",
  "open": false,
  "tip": {
    "id": "92e2493d-ad08-438f-b0f3-78fde864dab7",
    "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T09:02:39.64535Z"
  }
}
```

`GET /api/rider/v1/orders/d4351df1-6761-4f71-a56f-0cb55cc55274/tip` → **200**

```json
{
  "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
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
  "available_until": "2026-10-31T09:02:36.021653Z",
  "open": false,
  "tip": {
    "id": "92e2493d-ad08-438f-b0f3-78fde864dab7",
    "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:02:39.64535Z"
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
      "id": "0373ab79-44c8-41d8-b7f5-a541c43cf196",
      "at": "2026-10-30T09:02:41.309808Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
      "counterpart_id": null
    },
    {
      "id": "062b9914-62a2-4b92-8e9d-266fe944e18a",
      "at": "2026-10-30T09:02:36.224813Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f3a9fc85-6df2-42cf-a320-a74e9530f6dc",
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
  "id": "645e0ddd-d1e2-450a-89c9-316ccb38391e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:07:41.679969Z",
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
  "session_id": "c8ff73cd-e63b-46ca-8610-eea0729120c3",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4NjIsImlhdCI6MTc5MzM1MDk2MiwianRpIjoiOGM3MzljZDUtNGEzMi00NWVhLTgzZDQtNjNlZDAwYWY1YjkzIiwic2lkIjoiYzhmZjczY2QtZTYzYi00NmNhLTg2MTAtZWVhMDcyOTEyMGMzIn0.5u4TeDLOVvokC-qXSKCzGNWVnI_bSN-6TTVYTrkqIR0",
  "access_expires_at": "2026-10-30T09:17:42.242483029Z",
  "refresh_token": "h6ccKwIriluqMYgThcXuQ-LdEKV58MaFqVQMR4gKbug",
  "refresh_expires_at": "2026-10-30T21:02:42.241888443Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732802693` → **200**

```json
{
  "client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299"
}
```

`POST /api/admin/v1/rider-wallets/8c0f6b76-b262-43d6-9a61-3f3e7c984299/top-ups` → **201**

```json
{
  "command_id": "5c220f4a-d3c1-4209-9f13-cd2224987299",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
      "id": "d3a52db7-0a42-4dec-8303-ab6396f1ff52",
      "at": "2026-10-30T09:02:42.74845Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dd8c9865-65fa-43e8-abc4-c89b55a981ad",
  "quote_id": "645e0ddd-d1e2-450a-89c9-316ccb38391e",
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
  "id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
  "created_at": "2026-10-30T09:02:43.021105Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/78b27ba9-f3d6-4a84-adf2-c8313feb753a` → **200**

```json
{
  "id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
  "created_at": "2026-10-30T09:02:43.021105Z",
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
    "id": "4bf23488-eeaf-42b2-9873-8cc51cc43ea1",
    "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
    "expires_at": "2026-10-30T09:02:58.027818Z",
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

`POST /api/driver/v1/offers/4bf23488-eeaf-42b2-9873-8cc51cc43ea1/accept` → **200**

```json
{
  "command_id": "986aa207-3328-4646-a432-ab0665e7ee0b"
}
```

```json
{
  "id": "376d6cd3-463d-420d-a94b-968926ffa33b",
  "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f24b4f17-8a52-4c57-bc5d-d35b8dd1b7eb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f24b4f17-8a52-4c57-bc5d-d35b8dd1b7eb",
  "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
  "assignment_id": "376d6cd3-463d-420d-a94b-968926ffa33b",
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

`POST /api/driver/v1/work-sessions/20ba33d1-17ce-4e9f-9be0-618409c61121/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:44Z",
    "sequence": 1793350964326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "20ba33d1-17ce-4e9f-9be0-618409c61121",
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
  "last_heartbeat_at": "2026-10-30T09:02:44.344382Z",
  "last_location_at": "2026-10-30T09:02:44.344382Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f24b4f17-8a52-4c57-bc5d-d35b8dd1b7eb/arrive` → **200**

```json
{
  "command_id": "c82fe4e4-6f8c-412c-b25f-5a51bd31b4fe",
  "expected_version": 0
}
```

```json
{
  "id": "f24b4f17-8a52-4c57-bc5d-d35b8dd1b7eb",
  "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
  "assignment_id": "376d6cd3-463d-420d-a94b-968926ffa33b",
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
  "arrived_at": "2026-10-30T09:02:44.610791Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f24b4f17-8a52-4c57-bc5d-d35b8dd1b7eb/start` → **200**

```json
{
  "command_id": "a515343f-c7e6-4c1a-9ecd-bbf83de68fb3",
  "expected_version": 1
}
```

```json
{
  "id": "f24b4f17-8a52-4c57-bc5d-d35b8dd1b7eb",
  "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
  "assignment_id": "376d6cd3-463d-420d-a94b-968926ffa33b",
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
  "arrived_at": "2026-10-30T09:02:44.610791Z",
  "started_at": "2026-10-30T09:02:44.87572Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f24b4f17-8a52-4c57-bc5d-d35b8dd1b7eb/complete` → **200**

```json
{
  "command_id": "ced5d2f2-a0f4-45ab-92e2-a5f4d0abac35",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:02:45Z",
  "cash_received": true
}
```

```json
{
  "id": "f24b4f17-8a52-4c57-bc5d-d35b8dd1b7eb",
  "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
  "assignment_id": "376d6cd3-463d-420d-a94b-968926ffa33b",
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
  "arrived_at": "2026-10-30T09:02:44.610791Z",
  "started_at": "2026-10-30T09:02:44.87572Z",
  "completed_at": "2026-10-30T09:02:45.141911Z",
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
  "client_id": "8c0f6b76-b262-43d6-9a61-3f3e7c984299",
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
      "id": "c217f8b9-cf8d-4f37-a59f-421001501753",
      "at": "2026-10-30T09:02:45.357097Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a"
    },
    {
      "id": "d3a52db7-0a42-4dec-8303-ab6396f1ff52",
      "at": "2026-10-30T09:02:42.74845Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "3c5921be-dff9-4218-aea6-464468b5f646",
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

`GET /api/rider/v1/orders/78b27ba9-f3d6-4a84-adf2-c8313feb753a/tip` → **200**

```json
{
  "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
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
  "available_until": "2026-10-31T09:02:45.141911Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/78b27ba9-f3d6-4a84-adf2-c8313feb753a/tip` → **201**

```json
{
  "command_id": "61d8bf7a-fa9c-4940-8872-2a15df3ba0c7",
  "amount_minor": 2500
}
```

```json
{
  "id": "56a452df-7a7a-4fb2-b320-d22ea7dbc05d",
  "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T09:02:46.169476Z"
}
```

`GET /api/rider/v1/orders/78b27ba9-f3d6-4a84-adf2-c8313feb753a/tip` → **200**

```json
{
  "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
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
  "available_until": "2026-10-31T09:02:45.141911Z",
  "open": false,
  "tip": {
    "id": "56a452df-7a7a-4fb2-b320-d22ea7dbc05d",
    "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T09:02:46.169476Z"
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
      "id": "65ea9975-eeb4-402c-9519-9016f80606c9",
      "at": "2026-10-30T09:02:45.352755Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
      "counterpart_id": null
    },
    {
      "id": "0373ab79-44c8-41d8-b7f5-a541c43cf196",
      "at": "2026-10-30T09:02:41.309808Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
      "counterpart_id": null
    },
    {
      "id": "062b9914-62a2-4b92-8e9d-266fe944e18a",
      "at": "2026-10-30T09:02:36.224813Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
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
      "id": "81dcef0f-2ed0-4971-a372-543e1cb5e028",
      "at": "2026-10-30T09:02:47.381611Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
      "counterpart_id": null
    },
    {
      "id": "65ea9975-eeb4-402c-9519-9016f80606c9",
      "at": "2026-10-30T09:02:45.352755Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "78b27ba9-f3d6-4a84-adf2-c8313feb753a",
      "counterpart_id": null
    },
    {
      "id": "0373ab79-44c8-41d8-b7f5-a541c43cf196",
      "at": "2026-10-30T09:02:41.309808Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
      "counterpart_id": null
    },
    {
      "id": "062b9914-62a2-4b92-8e9d-266fe944e18a",
      "at": "2026-10-30T09:02:36.224813Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d4351df1-6761-4f71-a56f-0cb55cc55274",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "20ba33d1-17ce-4e9f-9be0-618409c61121",
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
  "last_heartbeat_at": "2026-10-30T09:02:44.344382Z",
  "last_location_at": "2026-10-30T09:02:44.344382Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/20ba33d1-17ce-4e9f-9be0-618409c61121/close` → **200**

```json
{
  "command_id": "f131eaf9-2356-4c75-9151-a0c7fe06a4d1",
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

Done: card order 78b27ba9-f3d6-4a84-adf2-c8313feb753a.

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
  "phone": "+380737094976",
  "device_ref": "sandbox-19698"
}
```

```json
{
  "challenge_id": "594e63ad-8283-453f-ac76-583557d7bdda",
  "expires_at": "2026-10-30T09:07:48.955777982Z",
  "resend_available_at": "2026-10-30T09:02:49.955777982Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737094976` → **200**

```json
{
  "phone": "+380737094976",
  "audience": "CLIENT",
  "code": "034511",
  "sent_at": "2026-10-30T09:02:48.958870133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "594e63ad-8283-453f-ac76-583557d7bdda",
  "code": "034511",
  "device_ref": "sandbox-19698"
}
```

```json
{
  "session_id": "02831f20-46bb-4a23-843e-f87dd75421bc",
  "subject": {
    "type": "CLIENT",
    "id": "3c47c40e-25b0-4f99-a3cd-0ecb0fdf78cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzQ3YzQwZS0yNWIwLTRmOTktYTNjZC0wZWNiMGZkZjc4Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxODY5LCJpYXQiOjE3OTMzNTA5NjksImp0aSI6IjNiYjUwMzBjLTU3ZTctNDZmMy1iYTVkLTMyOGY5YjY5ZGIyZSIsInNpZCI6IjAyODMxZjIwLTQ2YmItNGEyMy04NDNlLWY4N2RkNzU0MjFiYyJ9.Mi3pGd-Nk6ylcsZYNNaXv9gTggaGIhyTmg86p8kDrKY",
  "access_expires_at": "2026-10-30T09:17:49.231331224Z",
  "refresh_token": "s31zJQBO8YztCI34Cnlp_3E8_t2lMunX3lvS9cOAAV4",
  "refresh_expires_at": "2026-11-29T09:02:49.230644036Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "f66cdd7b-ee41-4dcf-82b9-3b93cd5634e1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "a2df4bd5-71ba-4605-a34a-2725dd0c2989",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-a2df4bd5-71ba-4605-a34a-2725dd0c2989",
    "orderDate": "1793350969",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8a90752bf45cbdfdf15fcd2c04404cb3",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=a2df4bd5-71ba-4605-a34a-2725dd0c2989",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737094976"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=a2df4bd5-71ba-4605-a34a-2725dd0c2989",
  "created_at": "2026-10-30T09:02:49.500525Z",
  "expires_at": "2026-10-30T09:32:49.500525Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/a2df4bd5-71ba-4605-a34a-2725dd0c2989` → **200**

```json
{
  "id": "a2df4bd5-71ba-4605-a34a-2725dd0c2989",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:02:49.500525Z",
  "expires_at": "2026-10-30T09:32:49.500525Z",
  "completed_at": "2026-10-30T09:02:49.763441Z",
  "masked_pan": "41****9057",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3c47c40e-25b0-4f99-a3cd-0ecb0fdf78cd",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3c47c40e-25b0-4f99-a3cd-0ecb0fdf78cd",
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
      "id": "b5713162-99ba-466e-b1d1-36963e5698c8",
      "at": "2026-10-30T09:02:50.39901Z",
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
  "client_id": "3c47c40e-25b0-4f99-a3cd-0ecb0fdf78cd",
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
      "id": "b5713162-99ba-466e-b1d1-36963e5698c8",
      "at": "2026-10-30T09:02:50.39901Z",
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
  "device_ref": "sandbox-25331"
}
```

```json
{
  "challenge_id": "af1307f2-7cf8-450d-80c4-0b8ff4efc578",
  "expires_at": "2026-10-30T09:07:51.809000987Z",
  "resend_available_at": "2026-10-30T09:02:52.809000987Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "196432",
  "sent_at": "2026-10-30T09:02:51.811625899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af1307f2-7cf8-450d-80c4-0b8ff4efc578",
  "code": "196432",
  "device_ref": "sandbox-25331"
}
```

```json
{
  "session_id": "68c861d0-6e8e-4a4a-90bb-a0e5a448484c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTg3MiwiaWF0IjoxNzkzMzUwOTcyLCJqdGkiOiJkNjQ3MzdhYi04YWY2LTQ2ZTgtYTdiNi03MTgyNzYwYWFkZjUiLCJzaWQiOiI2OGM4NjFkMC02ZThlLTRhNGEtOTBiYi1hMGU1YTQ0ODQ4NGMifQ.QKtb_vMOGJN47p5oSBE0KRvTi-q2-dqufZkLD2nVT4g",
  "access_expires_at": "2026-10-30T09:17:52.085111858Z",
  "refresh_token": "QVlEuKCBQK71YVCWGDHDj2PmpuUJUrpXI7oZmuqFs9c",
  "refresh_expires_at": "2026-11-29T09:02:52.084418822Z",
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
  "command_id": "1dd9874b-107b-41d3-88ca-620616c4f89b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "be4f6d4a-5e63-41cb-a49e-26c7c4513444",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-be4f6d4a-5e63-41cb-a49e-26c7c4513444",
    "orderDate": "1793350972",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "053e397d41089ed57fdad5ef7c7f6db5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=be4f6d4a-5e63-41cb-a49e-26c7c4513444",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=be4f6d4a-5e63-41cb-a49e-26c7c4513444",
  "created_at": "2026-10-30T09:02:52.600672Z",
  "expires_at": "2026-10-30T09:32:52.600672Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/be4f6d4a-5e63-41cb-a49e-26c7c4513444` → **200**

```json
{
  "id": "be4f6d4a-5e63-41cb-a49e-26c7c4513444",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T09:02:52.600672Z",
  "expires_at": "2026-10-30T09:32:52.600672Z",
  "completed_at": "2026-10-30T09:02:52.857283Z",
  "masked_pan": "41****2339",
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
      "id": "e6783189-06dd-43dc-953c-5ff211a79a95",
      "at": "2026-10-30T09:02:53.408617Z",
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
  "command_id": "fda25603-8f5f-4e94-bde5-79da88b68f79",
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
  "correlation_id": "8d1ab45e-5e1f-41ec-8244-2f4718caad5e"
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
  "device_ref": "sandbox-14204"
}
```

```json
{
  "challenge_id": "eb3bc163-cdfd-4611-9d65-3eddceab01d1",
  "expires_at": "2026-10-30T09:07:54.915444895Z",
  "resend_available_at": "2026-10-30T09:02:55.915444895Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "345593",
  "sent_at": "2026-10-30T09:02:54.917845154Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb3bc163-cdfd-4611-9d65-3eddceab01d1",
  "code": "345593",
  "device_ref": "sandbox-14204"
}
```

```json
{
  "session_id": "0189bc16-2d68-48a6-8412-08c68fb240a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTg3NSwiaWF0IjoxNzkzMzUwOTc1LCJqdGkiOiJiYzc3MmE0MC0xZjNhLTQzOTUtYTFjNS02NTU2MjdjOTJjMWYiLCJzaWQiOiIwMTg5YmMxNi0yZDY4LTQ4YTYtODQxMi0wOGM2OGZiMjQwYTIifQ.c9EGpZfASCP9IodQ_Xt3R_U2HBRQ4--nI4aIKQsrz2E",
  "access_expires_at": "2026-10-30T09:17:55.195699509Z",
  "refresh_token": "TGtC4WVvryCrgXZAT7zE6uoezIm6Oqy_amNNWjKO0O4",
  "refresh_expires_at": "2026-11-29T09:02:55.194913244Z",
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
  "command_id": "9aa5816c-7936-4eda-a362-6a148655a7b9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:55Z",
    "sequence": 1793350975703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef723d1f-8377-4372-825c-73cbc1026b32",
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
  "last_heartbeat_at": "2026-10-30T09:02:55.721289Z",
  "last_location_at": "2026-10-30T09:02:55.721289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638904673",
  "device_ref": "sandbox-29241"
}
```

```json
{
  "challenge_id": "9ed1c147-03b4-4a42-8957-09880882a71d",
  "expires_at": "2026-10-30T09:07:55.979676795Z",
  "resend_available_at": "2026-10-30T09:02:56.979676795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638904673` → **200**

```json
{
  "phone": "+380638904673",
  "audience": "CLIENT",
  "code": "698257",
  "sent_at": "2026-10-30T09:02:55.982359882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ed1c147-03b4-4a42-8957-09880882a71d",
  "code": "698257",
  "device_ref": "sandbox-29241"
}
```

```json
{
  "session_id": "d97618cd-a7ff-4a38-aef9-44d815533fe6",
  "subject": {
    "type": "CLIENT",
    "id": "5189dea6-df5f-4ffb-866f-48ec6e722150"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTg5ZGVhNi1kZjVmLTRmZmItODY2Zi00OGVjNmU3MjIxNTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxODc2LCJpYXQiOjE3OTMzNTA5NzYsImp0aSI6IjJmMDg5ZmEyLTdlNjQtNGFiNS1hOTE2LTBhODI0OTI4ZTMyYiIsInNpZCI6ImQ5NzYxOGNkLWE3ZmYtNGEzOC1hZWY5LTQ0ZDgxNTUzM2ZlNiJ9.z8xSHXSOGAGYo7NcFKjIkabjlyXPcoIqO9EOP589Yd8",
  "access_expires_at": "2026-10-30T09:17:56.25434156Z",
  "refresh_token": "dFpxkivcJO-pHuuHWbySGdaFwBoBnURA3H70GEYYbOc",
  "refresh_expires_at": "2026-11-29T09:02:56.253898148Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f53f35c3-a80b-46e7-8a5b-978d732ec71e",
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
  "id": "4bceaaeb-db06-4842-beeb-53ce77d2edff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:07:56.516771Z",
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
  "command_id": "5e5afc0c-0142-4762-b566-75bbbef511b1",
  "quote_id": "4bceaaeb-db06-4842-beeb-53ce77d2edff",
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
  "id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5189dea6-df5f-4ffb-866f-48ec6e722150",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:02:56.788749Z",
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
    "id": "4a8c2416-00a3-422e-aa6c-2205bc4509b1",
    "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
    "expires_at": "2026-10-30T09:03:11.791836Z",
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

`POST /api/driver/v1/offers/4a8c2416-00a3-422e-aa6c-2205bc4509b1/accept` → **200**

```json
{
  "command_id": "652ed740-f8cf-4693-a17b-7e43c3ddbd7c"
}
```

```json
{
  "id": "08ffa39f-c9bf-4fc6-aa02-124c0812bc65",
  "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c1b477f-d935-4417-8f1a-05bd98fcfd23",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c1b477f-d935-4417-8f1a-05bd98fcfd23",
  "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
  "assignment_id": "08ffa39f-c9bf-4fc6-aa02-124c0812bc65",
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

`POST /api/driver/v1/work-sessions/ef723d1f-8377-4372-825c-73cbc1026b32/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:02:57Z",
    "sequence": 1793350977819
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef723d1f-8377-4372-825c-73cbc1026b32",
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
  "last_heartbeat_at": "2026-10-30T09:02:57.835746Z",
  "last_location_at": "2026-10-30T09:02:57.835746Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6c1b477f-d935-4417-8f1a-05bd98fcfd23/arrive` → **200**

```json
{
  "command_id": "0696d405-4482-41d1-8934-a00c39afa7ac",
  "expected_version": 0
}
```

```json
{
  "id": "6c1b477f-d935-4417-8f1a-05bd98fcfd23",
  "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
  "assignment_id": "08ffa39f-c9bf-4fc6-aa02-124c0812bc65",
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
  "arrived_at": "2026-10-30T09:02:58.102396Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c1b477f-d935-4417-8f1a-05bd98fcfd23/start` → **200**

```json
{
  "command_id": "de77e991-185e-473a-9986-b51eac86d866",
  "expected_version": 1
}
```

```json
{
  "id": "6c1b477f-d935-4417-8f1a-05bd98fcfd23",
  "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
  "assignment_id": "08ffa39f-c9bf-4fc6-aa02-124c0812bc65",
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
  "arrived_at": "2026-10-30T09:02:58.102396Z",
  "started_at": "2026-10-30T09:02:58.378834Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6c1b477f-d935-4417-8f1a-05bd98fcfd23/complete` → **200**

```json
{
  "command_id": "cb888501-9f9f-4d88-9a86-298020590a02",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:02:58Z",
  "cash_received": false
}
```

```json
{
  "id": "6c1b477f-d935-4417-8f1a-05bd98fcfd23",
  "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
  "assignment_id": "08ffa39f-c9bf-4fc6-aa02-124c0812bc65",
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
  "arrived_at": "2026-10-30T09:02:58.102396Z",
  "started_at": "2026-10-30T09:02:58.378834Z",
  "completed_at": "2026-10-30T09:02:58.645309Z",
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
  "session_id": "b720cc32-657b-4d4a-a302-453fc1d84c06",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4NzksImlhdCI6MTc5MzM1MDk3OSwianRpIjoiOGQ5ZGI4M2YtYTllYy00ZTlhLTk3OTUtMzIyOTEyY2U0Yjg3Iiwic2lkIjoiYjcyMGNjMzItNjU3Yi00ZDRhLWEzMDItNDUzZmMxZDg0YzA2In0.VkZdvIYxcLMgNdGKKZasym2jWgy9mR-biMs1ric0YZo",
  "access_expires_at": "2026-10-30T09:17:59.209766558Z",
  "refresh_token": "gzsv_wg_tCg3-3kkz1ZFV98wBOiqeblpDxQqa9T_gNM",
  "refresh_expires_at": "2026-10-30T21:02:59.209259358Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/942c3978-60b4-429d-aab7-24ff2d5c098a/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/942c3978-60b4-429d-aab7-24ff2d5c098a/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "87274633-4bd9-4888-8667-af0f177d7753"
}
```

`GET /api/admin/v1/orders/942c3978-60b4-429d-aab7-24ff2d5c098a/cash-dispute` → **200**

```json
{
  "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5189dea6-df5f-4ffb-866f-48ec6e722150",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:02:59.486181Z",
  "decide_by": "2026-11-13T09:02:59.486181Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T09:02:59.486181Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "5189dea6-df5f-4ffb-866f-48ec6e722150",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T09:02:59.486181Z",
      "decide_by": "2026-11-13T09:02:59.486181Z",
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

`POST /api/admin/v1/orders/942c3978-60b4-429d-aab7-24ff2d5c098a/cash-dispute/decide` → **400**

```json
{
  "command_id": "2cebd7c2-2819-4b46-9709-4e47f0cba30e",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/942c3978-60b4-429d-aab7-24ff2d5c098a/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "54f73b24-cab1-4dd8-a9e8-f26689921831",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/942c3978-60b4-429d-aab7-24ff2d5c098a/cash-dispute/decide` → **200**

```json
{
  "command_id": "96cb18fe-dd5b-467c-a1f8-d387bdc550ce",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5189dea6-df5f-4ffb-866f-48ec6e722150",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T09:02:59.486181Z",
  "decide_by": "2026-11-13T09:02:59.486181Z",
  "decision": "PAY_DRIVER",
  "decided_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T09:03:01.594966Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/942c3978-60b4-429d-aab7-24ff2d5c098a/cash-dispute/decide` → **409**

```json
{
  "command_id": "75d0dcea-e661-4232-a041-3ceb5c321429",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/942c3978-60b4-429d-aab7-24ff2d5c098a/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "263acd01-4f64-4fe8-884b-85acece01c43"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ef723d1f-8377-4372-825c-73cbc1026b32",
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
  "last_heartbeat_at": "2026-10-30T09:02:57.835746Z",
  "last_location_at": "2026-10-30T09:02:57.835746Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ef723d1f-8377-4372-825c-73cbc1026b32/close` → **200**

```json
{
  "command_id": "2a064f3a-79ba-4a08-929e-fa1cb8032363",
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
  "phone": "+380733233338",
  "device_ref": "sandbox-10428"
}
```

```json
{
  "challenge_id": "60519542-98d6-46e4-a27c-1adb8243c8fc",
  "expires_at": "2026-10-30T09:08:02.651008305Z",
  "resend_available_at": "2026-10-30T09:03:03.651008305Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733233338` → **200**

```json
{
  "phone": "+380733233338",
  "audience": "CLIENT",
  "code": "371381",
  "sent_at": "2026-10-30T09:03:02.653810448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60519542-98d6-46e4-a27c-1adb8243c8fc",
  "code": "371381",
  "device_ref": "sandbox-10428"
}
```

```json
{
  "session_id": "7ecedec3-2c69-4708-80be-d26afefc5b27",
  "subject": {
    "type": "CLIENT",
    "id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OTdmNjBjMC1mMmMyLTRhOWItYTQ0YS1lMGVjNjE2NzA0YmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxODgyLCJpYXQiOjE3OTMzNTA5ODIsImp0aSI6IjA2ZThiNmYwLTc2M2EtNGUyNC05YmUyLWFjZmEzMWQ0NjI0MyIsInNpZCI6IjdlY2VkZWMzLTJjNjktNDcwOC04MGJlLWQyNmFmZWZjNWIyNyJ9.5wPu4VRRglrNLF-3KophH2I39fQyNRD8IaJBl411j48",
  "access_expires_at": "2026-10-30T09:18:02.927931064Z",
  "refresh_token": "41ZaHJjmNO5rMOEeLc78Xq_NCn4aZ-kfsgv4iCSTiPM",
  "refresh_expires_at": "2026-11-29T09:03:02.927315091Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ab4f566f-20ac-412c-8c82-bc33a09e24fd",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b55bcd2b-38d1-438c-b6a2-a31f1821cecc",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b55bcd2b-38d1-438c-b6a2-a31f1821cecc",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "460c3a5fd83a02152488fc1f3331248a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b55bcd2b-38d1-438c-b6a2-a31f1821cecc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733233338"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b55bcd2b-38d1-438c-b6a2-a31f1821cecc",
  "expires_at": "2026-10-30T09:33:03.196883Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b55bcd2b-38d1-438c-b6a2-a31f1821cecc` → **200**

```json
{
  "id": "b55bcd2b-38d1-438c-b6a2-a31f1821cecc",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:33:03.196883Z",
  "card": {
    "id": "ea5e7654-69f6-4579-86ef-b6becf00c630",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0272",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:03:03.455468Z"
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
  "device_ref": "sandbox-2664"
}
```

```json
{
  "challenge_id": "ac9340bc-e62f-496f-98d0-3c0154593eb4",
  "expires_at": "2026-10-30T09:08:03.725020842Z",
  "resend_available_at": "2026-10-30T09:03:04.725020842Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "023158",
  "sent_at": "2026-10-30T09:03:03.727305244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ac9340bc-e62f-496f-98d0-3c0154593eb4",
  "code": "023158",
  "device_ref": "sandbox-2664"
}
```

```json
{
  "session_id": "3fb4360b-7fdf-418a-899c-cb6f2accb323",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTg4NCwiaWF0IjoxNzkzMzUwOTg0LCJqdGkiOiIyYjZiODVhOC1mNTYwLTRlNzMtYjZiNC0xMWU5N2QwMDJjYzgiLCJzaWQiOiIzZmI0MzYwYi03ZmRmLTQxOGEtODk5Yy1jYjZmMmFjY2IzMjMifQ.SbjvqHZTkpZFrchD0vWkW4Pu-Nc2jJVakMVYiFfLqa0",
  "access_expires_at": "2026-10-30T09:18:04.003100668Z",
  "refresh_token": "nAAmTDGy0_dN6mA4oeO5donIK8wIIGOb7dnKDuk6VC8",
  "refresh_expires_at": "2026-11-29T09:03:04.002440265Z",
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
  "command_id": "0baabb77-2ca8-4fc8-a7de-6cbae81cb3dd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:03:04Z",
    "sequence": 1793350984508
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f8ec1fb3-d390-42e6-8774-c316a61f2db9",
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
  "last_heartbeat_at": "2026-10-30T09:03:04.525694Z",
  "last_location_at": "2026-10-30T09:03:04.525694Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c1b88d46-4e22-4615-aadc-eb2c61755689",
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
  "id": "0928fc89-3caa-4b03-abc6-2cbf66f1dddc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:08:04.797223Z",
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
  "command_id": "784dcd26-5acd-4ac7-bdb1-6830c340801d",
  "quote_id": "0928fc89-3caa-4b03-abc6-2cbf66f1dddc",
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
  "id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
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
  "created_at": "2026-10-30T09:03:05.064155Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d` → **200**

```json
{
  "id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
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
  "created_at": "2026-10-30T09:03:05.064155Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d` → **200**

```json
{
  "id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
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
  "created_at": "2026-10-30T09:03:05.064155Z",
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
    "id": "e1c9f692-cd5b-4d48-8716-d266799aeaf1",
    "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
    "expires_at": "2026-10-30T09:03:20.536011Z",
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

`POST /api/driver/v1/offers/e1c9f692-cd5b-4d48-8716-d266799aeaf1/accept` → **200**

```json
{
  "command_id": "4f787350-a92b-4e4d-9d09-82df9e903945"
}
```

```json
{
  "id": "f7904c38-4582-4a0b-a19c-1385dbc871eb",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b1b2d95e-f6f6-4995-b4a8-f30bb47a2604",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b1b2d95e-f6f6-4995-b4a8-f30bb47a2604",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "assignment_id": "f7904c38-4582-4a0b-a19c-1385dbc871eb",
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

`POST /api/rider/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/messages` → **201**

```json
{
  "command_id": "64e0cb24-8722-4d45-b35f-078cf425196a",
  "body": "Я біля входу, мій номер +380733233338, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "27b275dc-2276-4907-8a8a-aa00448c8daf",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380733233338, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T09:03:07.646377218Z"
}
```

`POST /api/driver/v1/trips/b1b2d95e-f6f6-4995-b4a8-f30bb47a2604/messages` → **201**

```json
{
  "command_id": "6a70c252-be63-416d-b261-f4035201d582",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "653afa7c-8f7e-48fc-9d5a-d734fabb8d43",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T09:03:07.907187355Z"
}
```

`POST /api/driver/v1/work-sessions/f8ec1fb3-d390-42e6-8774-c316a61f2db9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:03:08Z",
    "sequence": 1793350988162
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f8ec1fb3-d390-42e6-8774-c316a61f2db9",
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
  "last_heartbeat_at": "2026-10-30T09:03:08.179714Z",
  "last_location_at": "2026-10-30T09:03:08.179714Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b1b2d95e-f6f6-4995-b4a8-f30bb47a2604/arrive` → **200**

```json
{
  "command_id": "f322e72f-630e-4f6b-9fe8-eae1ef2a05d1",
  "expected_version": 0
}
```

```json
{
  "id": "b1b2d95e-f6f6-4995-b4a8-f30bb47a2604",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "assignment_id": "f7904c38-4582-4a0b-a19c-1385dbc871eb",
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
  "arrived_at": "2026-10-30T09:03:08.442507Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b1b2d95e-f6f6-4995-b4a8-f30bb47a2604/start` → **200**

```json
{
  "command_id": "0471cd00-ac55-475f-b522-ac6f114311cb",
  "expected_version": 1
}
```

```json
{
  "id": "b1b2d95e-f6f6-4995-b4a8-f30bb47a2604",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "assignment_id": "f7904c38-4582-4a0b-a19c-1385dbc871eb",
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
  "arrived_at": "2026-10-30T09:03:08.442507Z",
  "started_at": "2026-10-30T09:03:08.710597Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f8ec1fb3-d390-42e6-8774-c316a61f2db9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:03:08Z",
    "sequence": 1793350988957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f8ec1fb3-d390-42e6-8774-c316a61f2db9",
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
  "last_heartbeat_at": "2026-10-30T09:03:08.973863Z",
  "last_location_at": "2026-10-30T09:03:08.973863Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/b1b2d95e-f6f6-4995-b4a8-f30bb47a2604/complete` → **200**

```json
{
  "command_id": "e56fb168-c4fd-4b67-970b-e35fa9fabc3b",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:03:09Z",
  "cash_received": false
}
```

```json
{
  "id": "b1b2d95e-f6f6-4995-b4a8-f30bb47a2604",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "assignment_id": "f7904c38-4582-4a0b-a19c-1385dbc871eb",
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
  "arrived_at": "2026-10-30T09:03:08.442507Z",
  "started_at": "2026-10-30T09:03:08.710597Z",
  "completed_at": "2026-10-30T09:03:09.24055Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d` → **200**

```json
{
  "id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
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
    "id": "f7904c38-4582-4a0b-a19c-1385dbc871eb",
    "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b1b2d95e-f6f6-4995-b4a8-f30bb47a2604",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:03:05.064155Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d` → **200**

```json
{
  "id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
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
    "id": "f7904c38-4582-4a0b-a19c-1385dbc871eb",
    "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b1b2d95e-f6f6-4995-b4a8-f30bb47a2604",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:03:05.064155Z",
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
  "session_id": "f8ec1fb3-d390-42e6-8774-c316a61f2db9",
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
  "last_heartbeat_at": "2026-10-30T09:03:08.973863Z",
  "last_location_at": "2026-10-30T09:03:08.973863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f8ec1fb3-d390-42e6-8774-c316a61f2db9/close` → **200**

```json
{
  "command_id": "00334f4d-4800-4e56-b076-91163985e66f",
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
  "session_id": "fe10e9ff-71ea-4d54-9370-bf7ee0532fa7",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4OTEsImlhdCI6MTc5MzM1MDk5MSwianRpIjoiZDllMTExMWYtZTdjMC00NzI1LTk2Y2UtYzJjNGYwZWUwNDAyIiwic2lkIjoiZmUxMGU5ZmYtNzFlYS00ZDU0LTkzNzAtYmY3ZWUwNTMyZmE3In0.8rEJCUlzw4wZa1JCpFAPM4nFb-rAdKl0TwGwsFg2DnY",
  "access_expires_at": "2026-10-30T09:18:11.855493432Z",
  "refresh_token": "0wCktEmBol848pkPoukjNZLPwkf5dJ3ah-u_IMLMbQg",
  "refresh_expires_at": "2026-10-30T21:03:11.854984339Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "406b97c8-91e0-49e6-8623-0b785efdf4e8"
}
```

`GET /api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T09:03:12.364828007Z",
  "order": {
    "id": "4d75a354-f62c-437d-9784-e52722273b8d",
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
    "created_at": "2026-10-30T09:03:05.064155Z",
    "assigned_at": "2026-10-30T09:03:07.120361Z",
    "arrived_at": "2026-10-30T09:03:08.442507Z",
    "started_at": "2026-10-30T09:03:08.710597Z",
    "completed_at": "2026-10-30T09:03:09.24055Z"
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
    "id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
    "registered_at": "2026-10-30T09:03:02.92537Z",
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
      "created_at": "2026-10-30T09:03:05.066608Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T09:03:09.599952Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/chargebacks` → **422**

```json
{
  "command_id": "fb67a723-775a-42fb-8a39-5fd943956e23",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "d1d1f6b1-ab38-453d-8ba4-099332b42f76"
}
```

`POST /api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/chargebacks` → **201**

```json
{
  "command_id": "e1cc5439-5aeb-4c24-b870-7b43b1675f3f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "5481c0cb-9882-4c75-baa0-c73f63b5593d",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:03:12.952558Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/chargebacks` → **201**

```json
{
  "command_id": "e1cc5439-5aeb-4c24-b870-7b43b1675f3f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "5481c0cb-9882-4c75-baa0-c73f63b5593d",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T09:03:12.952558Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/797f60c0-f2c2-4a9b-a44a-e0ec616704bc` → **200**

```json
{
  "client": {
    "id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
    "phone": "+380733233338",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:03:02.92537Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4d75a354-f62c-437d-9784-e52722273b8d",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:03:05.064155Z",
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

`GET /api/admin/v1/clients/797f60c0-f2c2-4a9b-a44a-e0ec616704bc` → **200**

```json
{
  "client": {
    "id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
    "phone": "+380733233338",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:03:02.92537Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4d75a354-f62c-437d-9784-e52722273b8d",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:03:05.064155Z",
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

`POST /api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/chargebacks/5481c0cb-9882-4c75-baa0-c73f63b5593d/resolve` → **200**

```json
{
  "command_id": "3e3f44fd-ae8b-4d67-8b17-b9c53266115a",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "5481c0cb-9882-4c75-baa0-c73f63b5593d",
  "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T09:03:12.952558Z",
  "resolved_at": "2026-10-30T09:03:15.08126Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/797f60c0-f2c2-4a9b-a44a-e0ec616704bc` → **200**

```json
{
  "client": {
    "id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
    "phone": "+380733233338",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:03:02.92537Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4d75a354-f62c-437d-9784-e52722273b8d",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:03:05.064155Z",
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

`GET /api/admin/v1/clients/797f60c0-f2c2-4a9b-a44a-e0ec616704bc` → **200**

```json
{
  "client": {
    "id": "797f60c0-f2c2-4a9b-a44a-e0ec616704bc",
    "phone": "+380733233338",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:03:02.92537Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4d75a354-f62c-437d-9784-e52722273b8d",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T09:03:05.064155Z",
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

`POST /api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/chargebacks/5481c0cb-9882-4c75-baa0-c73f63b5593d/resolve` → **409**

```json
{
  "command_id": "fab9f80a-aa85-4621-b7f9-bb8f5f9a8cf1",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/chargebacks/5481c0cb-9882-4c75-baa0-c73f63b5593d/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0c4a5612-2496-4b69-b795-318c7a40fa4d"
}
```

`GET /api/admin/v1/orders/4d75a354-f62c-437d-9784-e52722273b8d/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "5481c0cb-9882-4c75-baa0-c73f63b5593d",
      "order_id": "4d75a354-f62c-437d-9784-e52722273b8d",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T09:03:12.952558Z",
      "resolved_at": "2026-10-30T09:03:15.08126Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 4d75a354-f62c-437d-9784-e52722273b8d without phone or card digits; chargeback 5481c0cb-9882-4c75-baa0-c73f63b5593d recorded and won.

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
  "session_id": "cb0e9c8d-a582-40e5-8e72-c3c7b9eeef15",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE4OTcsImlhdCI6MTc5MzM1MDk5NywianRpIjoiZmIzOGNjZDAtOTg2ZC00NzJiLWFiZWEtNjYzNzQzNjNjNTZkIiwic2lkIjoiY2IwZTljOGQtYTU4Mi00MGU1LThlNzItYzNjN2I5ZWVlZjE1In0.2tuf54EXS46hFQgL4ZTPxKDxJ-eDhsvgibZWCZdGMTw",
  "access_expires_at": "2026-10-30T09:18:17.963417096Z",
  "refresh_token": "MyyUNF-jGxXvToyCFP0aEQMp4axCfA1CfRf28c8syk0",
  "refresh_expires_at": "2026-10-30T21:03:17.962717744Z",
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
  "phone": "+48600127985",
  "device_ref": "sandbox-10972"
}
```

```json
{
  "challenge_id": "7051e29d-1cdb-4d5b-a1bc-ebfc489b624a",
  "expires_at": "2026-10-30T09:08:18.741973088Z",
  "resend_available_at": "2026-10-30T09:03:19.741973088Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600127985` → **200**

```json
{
  "phone": "+48600127985",
  "audience": "CLIENT",
  "code": "460689",
  "sent_at": "2026-10-30T09:03:18.74448194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7051e29d-1cdb-4d5b-a1bc-ebfc489b624a",
  "code": "460689",
  "device_ref": "sandbox-10972"
}
```

```json
{
  "session_id": "1ae61c39-0afa-493f-a78d-343e553fea57",
  "subject": {
    "type": "CLIENT",
    "id": "4e6b1389-ef14-411e-b5fa-835905037ea9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTZiMTM4OS1lZjE0LTQxMWUtYjVmYS04MzU5MDUwMzdlYTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxODk5LCJpYXQiOjE3OTMzNTA5OTksImp0aSI6IjU2MzgxY2Q3LTYzNDktNDc2Mi04NmM5LWMyYjExMjQ1OGE5NyIsInNpZCI6IjFhZTYxYzM5LTBhZmEtNDkzZi1hNzhkLTM0M2U1NTNmZWE1NyJ9.QQ_OytTjW6KC13P59MGdGmWpPJFXc4zlRQy_GzE6488",
  "access_expires_at": "2026-10-30T09:18:19.015850646Z",
  "refresh_token": "DBsEIl-Uk5phKe_MG9Gg9RANI21lK7WwtEGAZCWj6tA",
  "refresh_expires_at": "2026-11-29T09:03:19.015360531Z",
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
  "command_id": "d2dee823-6a40-4a4a-96b0-72ebf4421601",
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
  "correlation_id": "49448cb0-a61d-4794-9989-79286ad771a7",
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
  "command_id": "4fd32516-ae82-4de0-94fd-6f31d8492dce",
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
  "paused_at": "2026-10-30T09:03:20.038945116Z",
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
  "command_id": "9726d922-0f4b-4274-9774-754cf5305e76",
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
  "id": "99e412f3-4d72-42ce-931d-17f93545adb1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:08:20.577307Z",
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
  "command_id": "9150411d-882a-4dec-ae0b-d21ddb2aaaed",
  "quote_id": "99e412f3-4d72-42ce-931d-17f93545adb1",
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
  "correlation_id": "527850c4-3fd1-4e4e-9d64-89c194e8cd65"
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
  "paused_at": "2026-10-30T09:03:20.038945Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "d9fe45d8-79bf-4f8c-8c22-787b3cfd8e1e",
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
  "command_id": "dfa7f156-1843-4484-923c-31221b3d39c5",
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
  "command_id": "02bbe1f9-c7dc-4971-9a10-9b2ede5b266d",
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
  "id": "42f5aaca-c0bf-49d8-aabb-c08b55d5af7a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:08:22.153561Z",
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
  "command_id": "b62f870e-d449-41cc-9725-8d8043cdbe9f",
  "quote_id": "42f5aaca-c0bf-49d8-aabb-c08b55d5af7a",
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
  "correlation_id": "9044926c-2535-4415-b8b2-b041cf1417f9"
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
  "command_id": "37e42b63-80cc-40c7-8f03-1b5047d6efca",
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
  "command_id": "d7955483-0332-4018-bbb1-10b72bc75ceb",
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
  "id": "ae810878-ac77-443a-8c48-a066b6bdc47d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:08:23.184984Z",
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
  "command_id": "b955afcf-2d91-4c7e-a96a-ef5a3902fa0a",
  "quote_id": "ae810878-ac77-443a-8c48-a066b6bdc47d",
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
  "correlation_id": "233f609f-27de-4574-a034-e756cc307849"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "1b77aac9-7578-4232-aa5c-a5b3ca726de8",
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
  "correlation_id": "605da5d6-976d-4531-ab2a-91d1904782a5"
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
  "command_id": "c9e503d8-0a4d-43e5-89c3-84391931c7d3",
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
  "phone": "+380673106943",
  "device_ref": "sandbox-25813"
}
```

```json
{
  "challenge_id": "b28e805f-9f9c-4d65-af97-5a0087e5ca78",
  "expires_at": "2026-10-30T09:08:24.495909595Z",
  "resend_available_at": "2026-10-30T09:03:25.495909595Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673106943` → **200**

```json
{
  "phone": "+380673106943",
  "audience": "CLIENT",
  "code": "306834",
  "sent_at": "2026-10-30T09:03:24.498733497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b28e805f-9f9c-4d65-af97-5a0087e5ca78",
  "code": "306834",
  "device_ref": "sandbox-25813"
}
```

```json
{
  "session_id": "1ec929b5-2c47-47fc-a4ef-c53b0e7e2722",
  "subject": {
    "type": "CLIENT",
    "id": "d02777aa-0239-4fd4-a28d-205aae3850d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDI3NzdhYS0wMjM5LTRmZDQtYTI4ZC0yMDVhYWUzODUwZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTA0LCJpYXQiOjE3OTMzNTEwMDQsImp0aSI6IjhiMmJkMTU0LWVkMzctNGM3MS1hOWJkLWIzM2QwMzkzNTA4NSIsInNpZCI6IjFlYzkyOWI1LTJjNDctNDdmYy1hNGVmLWM1M2IwZTdlMjcyMiJ9.cTUpaqymLbwfDD06ytSY32vcorbk6YCB7Hhuj-0dJ28",
  "access_expires_at": "2026-10-30T09:18:24.777432535Z",
  "refresh_token": "SOYxZIKPmkWl6x2yPk14UK16wIa5RjnOr2fo65TvsZU",
  "refresh_expires_at": "2026-11-29T09:03:24.77687344Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d02777aa-0239-4fd4-a28d-205aae3850d5",
  "session_id": "1ec929b5-2c47-47fc-a4ef-c53b0e7e2722",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bbef3b4b-bdad-4a52-9b6e-131469a455c1",
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
  "id": "689401cf-6211-42d5-bf45-ad6beaaa09ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:08:25.282318Z",
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
  "challenge_id": "bf290cd1-a8af-451c-b055-5642bfb47b73",
  "expires_at": "2026-10-30T09:08:27.544558441Z",
  "resend_available_at": "2026-10-30T09:03:28.544558441Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673106943` → **200**

```json
{
  "phone": "+380673106943",
  "audience": "CLIENT",
  "code": "047180",
  "sent_at": "2026-10-30T09:03:27.546676236Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "7066afb7-346b-4c53-9121-20eea6f64c0c",
  "challenge_id": "bf290cd1-a8af-451c-b055-5642bfb47b73",
  "otp_code": "047180"
}
```

```json
{
  "client_id": "d02777aa-0239-4fd4-a28d-205aae3850d5",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T09:03:27.832546563Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "59637b92-eb2b-4967-b313-7a60f845bef3",
  "quote_id": "689401cf-6211-42d5-bf45-ad6beaaa09ff",
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
  "correlation_id": "23b113e2-73ca-42dd-8a66-587a4d24f643"
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
  "session_id": "04088036-efbd-4985-875e-8ea3936a3125",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5MDgsImlhdCI6MTc5MzM1MTAwOCwianRpIjoiNzY4OTRkZjMtNzM2Ni00ZjMxLThmMmEtOWE5YmEwNjJlMmVmIiwic2lkIjoiMDQwODgwMzYtZWZiZC00OTg1LTg3NWUtOGVhMzkzNmEzMTI1In0.XeRTt2QOO_PvyvzxpRou1vEggzkcL86KJt6UUm39aGg",
  "access_expires_at": "2026-10-30T09:18:28.658894815Z",
  "refresh_token": "B8DVrN5Zd0rqMSXSr716LUQiBaXpOZ2PepgZ6USEf0s",
  "refresh_expires_at": "2026-10-30T21:03:28.658384467Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "d02777aa-0239-4fd4-a28d-205aae3850d5",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T09:03:27.832547Z",
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

`POST /api/admin/v1/client-deletions/d02777aa-0239-4fd4-a28d-205aae3850d5/complete` → **200**

```json
{
  "command_id": "eb766fb7-7825-4348-b8a9-0790d66b6182",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "d02777aa-0239-4fd4-a28d-205aae3850d5",
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
  "correlation_id": "d57ef792-718c-4d60-97e8-da19479bf7ae"
}
```

Done: client d02777aa-0239-4fd4-a28d-205aae3850d5 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666485651",
  "device_ref": "sandbox-21269"
}
```

```json
{
  "challenge_id": "f810c249-b8a0-4436-8541-02880c802e04",
  "expires_at": "2026-10-30T09:08:29.710605087Z",
  "resend_available_at": "2026-10-30T09:03:30.710605087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666485651` → **200**

```json
{
  "phone": "+380666485651",
  "audience": "CLIENT",
  "code": "335641",
  "sent_at": "2026-10-30T09:03:29.713517883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f810c249-b8a0-4436-8541-02880c802e04",
  "code": "335641",
  "device_ref": "sandbox-21269"
}
```

```json
{
  "session_id": "475c0585-2a74-4ec2-8b58-f460b8502d8d",
  "subject": {
    "type": "CLIENT",
    "id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYjUyMDY0ZS1jMmM3LTRmYjQtODgxOC1jOWQ0YTNhMTcxZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTEwLCJpYXQiOjE3OTMzNTEwMTAsImp0aSI6ImE5OTFmODhiLTk1YWItNDVkZC05MmZiLTEwODVjODFmYzI2ZCIsInNpZCI6IjQ3NWMwNTg1LTJhNzQtNGVjMi04YjU4LWY0NjBiODUwMmQ4ZCJ9._Wy7l2HgyVQDdnqgWsPr1a3W8AYLYYfTEQJ08oSQ8Oo",
  "access_expires_at": "2026-10-30T09:18:30.003740072Z",
  "refresh_token": "D_El01nlWDiyfdx9Czq-VOKnQ53L5xF8NeBP2l9HTuY",
  "refresh_expires_at": "2026-11-29T09:03:30.003201516Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da",
  "session_id": "475c0585-2a74-4ec2-8b58-f460b8502d8d",
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
  "session_id": "4e2068ec-f2fd-4e75-b83e-c92d6dfe4417",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5MTAsImlhdCI6MTc5MzM1MTAxMCwianRpIjoiZTUxYjE2MjAtNWIzZC00OGZkLTg4NTYtYjM4MzM3YjQxMGNkIiwic2lkIjoiNGUyMDY4ZWMtZjJmZC00ZTc1LWI4M2UtYzkyZDZkZmU0NDE3In0.-devVBst3dgzRDpL0MWnpp6iF9B1FcldO10fUt5t-Jg",
  "access_expires_at": "2026-10-30T09:18:30.803596388Z",
  "refresh_token": "bgceZYDsecZ9pg7ewCGxEy4QG-G8bMHjx7nvN8o36U8",
  "refresh_expires_at": "2026-10-30T21:03:30.803090901Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6485651&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da",
      "phone": "+380666485651",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T09:03:30.001232Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/cb52064e-c2c7-4fb4-8818-c9d4a3a171da` → **200**

```json
{
  "client": {
    "id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da",
    "phone": "+380666485651",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:03:30.001232Z",
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

`POST /api/admin/v1/clients/cb52064e-c2c7-4fb4-8818-c9d4a3a171da/block` → **400**

```json
{
  "command_id": "b88a3fe2-e76d-4248-90e5-995fedf0f466",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/cb52064e-c2c7-4fb4-8818-c9d4a3a171da/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c25058c7-49f3-4ca5-9a84-39a35f18de71",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/cb52064e-c2c7-4fb4-8818-c9d4a3a171da/block` → **200**

```json
{
  "command_id": "8458b5ea-31ed-4465-91ba-d75303abf902",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da",
  "phone": "+380666485651",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T09:03:30.001232Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T09:03:31.876575Z",
    "by": "3c5921be-dff9-4218-aea6-464468b5f646"
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
  "correlation_id": "e4c615c4-e242-4c5c-97ca-60989ea6be62"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666485651",
  "device_ref": "sandbox-20881"
}
```

```json
{
  "challenge_id": "c8872ae0-a750-4354-863c-a25d67c615c0",
  "expires_at": "2026-10-30T09:08:34.388197939Z",
  "resend_available_at": "2026-10-30T09:03:35.388197939Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666485651` → **200**

```json
{
  "phone": "+380666485651",
  "audience": "CLIENT",
  "code": "223007",
  "sent_at": "2026-10-30T09:03:34.390583478Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c8872ae0-a750-4354-863c-a25d67c615c0",
  "code": "223007",
  "device_ref": "sandbox-20881"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "7663fe84-4c07-40fa-91fb-cfdacb0b17c3"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/cb52064e-c2c7-4fb4-8818-c9d4a3a171da` → **200**

```json
{
  "client": {
    "id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da",
    "phone": "+380666485651",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T09:03:30.001232Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T09:03:31.876575Z",
      "by": "3c5921be-dff9-4218-aea6-464468b5f646"
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

`POST /api/admin/v1/clients/cb52064e-c2c7-4fb4-8818-c9d4a3a171da/unblock` → **200**

```json
{
  "command_id": "e279164f-5d6e-40d0-8c55-94de14ea997b",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da",
  "phone": "+380666485651",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T09:03:30.001232Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666485651",
  "device_ref": "sandbox-28520"
}
```

```json
{
  "challenge_id": "3d10081d-2d59-4749-a0ba-d2e069a078c6",
  "expires_at": "2026-10-30T09:08:37.477200192Z",
  "resend_available_at": "2026-10-30T09:03:38.477200192Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666485651` → **200**

```json
{
  "phone": "+380666485651",
  "audience": "CLIENT",
  "code": "229107",
  "sent_at": "2026-10-30T09:03:37.479393938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d10081d-2d59-4749-a0ba-d2e069a078c6",
  "code": "229107",
  "device_ref": "sandbox-28520"
}
```

```json
{
  "session_id": "e3e68605-ef56-4226-a4e7-25c443212676",
  "subject": {
    "type": "CLIENT",
    "id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYjUyMDY0ZS1jMmM3LTRmYjQtODgxOC1jOWQ0YTNhMTcxZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTE3LCJpYXQiOjE3OTMzNTEwMTcsImp0aSI6ImYxMWE2OGZlLTY1MzUtNDYyYS1hZmJkLTZhODVjOWJmMDMyNiIsInNpZCI6ImUzZTY4NjA1LWVmNTYtNDIyNi1hNGU3LTI1YzQ0MzIxMjY3NiJ9.d0hoojHZK721ZyJNo2_lp5WbqDdtiEHQGIv9IT8HudM",
  "access_expires_at": "2026-10-30T09:18:37.760015187Z",
  "refresh_token": "Y1gfaBfLZ7aK9Wu3ZSmqzeUJ5gbumNjDulJt4Lb2wUE",
  "refresh_expires_at": "2026-11-29T09:03:37.759556285Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cb52064e-c2c7-4fb4-8818-c9d4a3a171da",
  "session_id": "e3e68605-ef56-4226-a4e7-25c443212676",
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
  "phone": "+380660350242",
  "device_ref": "sandbox-7652"
}
```

```json
{
  "challenge_id": "43d98d97-59d5-450b-8f1b-11be3937e287",
  "expires_at": "2026-10-30T09:08:38.274873877Z",
  "resend_available_at": "2026-10-30T09:03:39.274873877Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660350242` → **200**

```json
{
  "phone": "+380660350242",
  "audience": "CLIENT",
  "code": "286884",
  "sent_at": "2026-10-30T09:03:38.277350529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43d98d97-59d5-450b-8f1b-11be3937e287",
  "code": "286884",
  "device_ref": "sandbox-7652"
}
```

```json
{
  "session_id": "1e7577f1-5583-4c06-8d07-c12ad80a8ec4",
  "subject": {
    "type": "CLIENT",
    "id": "b906c268-8732-42ed-8dc2-497a96c409d1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOTA2YzI2OC04NzMyLTQyZWQtOGRjMi00OTdhOTZjNDA5ZDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTE4LCJpYXQiOjE3OTMzNTEwMTgsImp0aSI6ImI4MmM2NzI5LTdlMmQtNDRiNS1iOWZmLWFjMDA0ZTQ5ZTMzYiIsInNpZCI6IjFlNzU3N2YxLTU1ODMtNGMwNi04ZDA3LWMxMmFkODBhOGVjNCJ9.4zz4CTZWpGeHtXw1xbg-Ji90Wb4rJZziyNOyZE19S9s",
  "access_expires_at": "2026-10-30T09:18:38.565867705Z",
  "refresh_token": "5paTze65r9LC5fPQMd2I9AOsPUgGRnDK-ZwUIbrwc2Y",
  "refresh_expires_at": "2026-11-29T09:03:38.565304294Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bf499056-40c0-4c15-b502-0a9ba3978610",
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
  "id": "40e88504-d366-465e-926e-91dc4f4c1572",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:08:38.825586Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 5e313eb4-5268-4d34-84e5-8840e423a10a) → **201**

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
  "session_id": "f1a3a814-b832-411c-bd64-7844df8aa27f",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5MTksImlhdCI6MTc5MzM1MTAxOSwianRpIjoiNjNjYTQwMmQtMjY3NS00YzJkLWJjZGUtMGE5ZDhhMDBmZWQ2Iiwic2lkIjoiZjFhM2E4MTQtYjgzMi00MTFjLWJkNjQtNzg0NGRmOGFhMjdmIn0.IDVaaP6HLStOARCnfmXaWEmuI4zLP3pB_S9ovkdIReY",
  "access_expires_at": "2026-10-30T09:18:39.419193335Z",
  "refresh_token": "N-9tuRtb_Oebv9C0cnkDgiEtvgs07PRxNhZRifTWEOA",
  "refresh_expires_at": "2026-10-30T21:03:39.418653732Z",
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
  "session_id": "badff23b-9ebe-4d17-b57e-ff387a5c60b0",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5MTksImlhdCI6MTc5MzM1MTAxOSwianRpIjoiZWYyY2MxYmItZTBkZi00MGFhLWI0MzQtYjFhOTcyNTI0Njg4Iiwic2lkIjoiYmFkZmYyM2ItOWViZS00ZDE3LWI1N2UtZmYzODdhNWM2MGIwIn0.42UUSktFLCbtGkOQy6g8WyAMBRPPLGJGtJAv_nea3kQ",
  "access_expires_at": "2026-10-30T09:18:39.972881527Z",
  "refresh_token": "qC7lGaWzEd5K4HnoSXBTLthdR79jp-6kSYBBvdcCYdc",
  "refresh_expires_at": "2026-10-30T21:03:39.972379551Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4a6c6a61-df4d-400c-be6b-60505e8b5450/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:03:39.091365Z",
      "actor": {
        "type": "CLIENT",
        "id": "b906c268-8732-42ed-8dc2-497a96c409d1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4a6c6a61-df4d-400c-be6b-60505e8b5450",
        "quote_id": "40e88504-d366-465e-926e-91dc4f4c1572",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5e313eb4-5268-4d34-84e5-8840e423a10a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:03:39.093353Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a6c6a61-df4d-400c-be6b-60505e8b5450",
        "attempt_id": "c54fe0dd-8709-4179-bee3-fbbdf78dc7d1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5e313eb4-5268-4d34-84e5-8840e423a10a"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T09:03:39.099519Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4a6c6a61-df4d-400c-be6b-60505e8b5450",
        "attempt_id": "c54fe0dd-8709-4179-bee3-fbbdf78dc7d1"
      },
      "correlation_id": "5e313eb4-5268-4d34-84e5-8840e423a10a"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "c54fe0dd-8709-4179-bee3-fbbdf78dc7d1",
        "generation": 1,
        "started_at": "2026-10-30T09:03:39.092333Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T09:03:39.099519Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T09:03:39.094123Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/5e313eb4-5268-4d34-84e5-8840e423a10a` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "4a6c6a61-df4d-400c-be6b-60505e8b5450:0",
      "order_id": "4a6c6a61-df4d-400c-be6b-60505e8b5450",
      "at": "2026-10-30T09:03:39.091365Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4a6c6a61-df4d-400c-be6b-60505e8b5450:1",
      "order_id": "4a6c6a61-df4d-400c-be6b-60505e8b5450",
      "at": "2026-10-30T09:03:39.093353Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "4a6c6a61-df4d-400c-be6b-60505e8b5450:2",
      "order_id": "4a6c6a61-df4d-400c-be6b-60505e8b5450",
      "at": "2026-10-30T09:03:39.099519Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/b403b57e-9f40-4496-a133-6d80ec1cd471` → **200**

```json
{
  "found": []
}
```

Done: request 5e313eb4-5268-4d34-84e5-8840e423a10a — order 4a6c6a61-df4d-400c-be6b-60505e8b5450 found by its id.

`GET /api/rider/v1/orders/4a6c6a61-df4d-400c-be6b-60505e8b5450` → **200**

```json
{
  "id": "4a6c6a61-df4d-400c-be6b-60505e8b5450",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b906c268-8732-42ed-8dc2-497a96c409d1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:03:39.090692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4a6c6a61-df4d-400c-be6b-60505e8b5450/cancel` → **200**

```json
{
  "command_id": "9512f686-3013-4920-8dd5-1574afe6e378",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4a6c6a61-df4d-400c-be6b-60505e8b5450",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b906c268-8732-42ed-8dc2-497a96c409d1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:03:39.090692Z",
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
  "phone": "+380631990373",
  "device_ref": "sandbox-28454"
}
```

```json
{
  "challenge_id": "356c3da7-48fc-41ab-b695-1c46529776b9",
  "expires_at": "2026-10-30T09:08:41.538470238Z",
  "resend_available_at": "2026-10-30T09:03:42.538470238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631990373` → **200**

```json
{
  "phone": "+380631990373",
  "audience": "CLIENT",
  "code": "986974",
  "sent_at": "2026-10-30T09:03:41.54085643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "356c3da7-48fc-41ab-b695-1c46529776b9",
  "code": "986974",
  "device_ref": "sandbox-28454"
}
```

```json
{
  "session_id": "cd15b79d-4925-4e73-92fc-66e0c5b362c4",
  "subject": {
    "type": "CLIENT",
    "id": "c16f1f84-4033-4cc0-84aa-681cf8367b6c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMTZmMWY4NC00MDMzLTRjYzAtODRhYS02ODFjZjgzNjdiNmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTIxLCJpYXQiOjE3OTMzNTEwMjEsImp0aSI6Ijk1MWEzMjFmLTRlNTUtNGIwMC05ZTc3LWUxMWM5ODEwMmM2ZSIsInNpZCI6ImNkMTViNzlkLTQ5MjUtNGU3My05MmZjLTY2ZTBjNWIzNjJjNCJ9.IB_aGTHj9upneG0KtFyDbXYEOQ4VmHnO-7KHxyivWxw",
  "access_expires_at": "2026-10-30T09:18:41.820154606Z",
  "refresh_token": "hAROi6CCVOwNzQktVmj1EyZwMcHIzoAYxo47OS9pmY8",
  "refresh_expires_at": "2026-11-29T09:03:41.819587554Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "01e748ca-5cf5-42f7-9058-2cfe77a3f1e2",
  "expires_at": "2026-10-30T09:08:44.072579644Z",
  "resend_available_at": "2026-10-30T09:03:45.072579644Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631990373` → **200**

```json
{
  "phone": "+380631990373",
  "audience": "CLIENT",
  "code": "734440",
  "sent_at": "2026-10-30T09:03:44.075016749Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "b2692a0f-95e1-4b4e-8832-cd3a0434c720",
  "challenge_id": "01e748ca-5cf5-42f7-9058-2cfe77a3f1e2",
  "otp_code": "734440"
}
```

```json
{
  "id": "34acb7e9-85d7-4878-8c75-93b76a880b42",
  "state": "PENDING",
  "created_at": "2026-10-30T09:03:44.352523Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/34acb7e9-85d7-4878-8c75-93b76a880b42` → **200**

```json
{
  "id": "34acb7e9-85d7-4878-8c75-93b76a880b42",
  "state": "PENDING",
  "created_at": "2026-10-30T09:03:44.352523Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/34acb7e9-85d7-4878-8c75-93b76a880b42` → **200**

```json
{
  "id": "34acb7e9-85d7-4878-8c75-93b76a880b42",
  "state": "PENDING",
  "created_at": "2026-10-30T09:03:44.352523Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/34acb7e9-85d7-4878-8c75-93b76a880b42` → **200**

```json
{
  "id": "34acb7e9-85d7-4878-8c75-93b76a880b42",
  "state": "PENDING",
  "created_at": "2026-10-30T09:03:44.352523Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/34acb7e9-85d7-4878-8c75-93b76a880b42` → **200**

```json
{
  "id": "34acb7e9-85d7-4878-8c75-93b76a880b42",
  "state": "PENDING",
  "created_at": "2026-10-30T09:03:44.352523Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/34acb7e9-85d7-4878-8c75-93b76a880b42` → **200**

```json
{
  "id": "34acb7e9-85d7-4878-8c75-93b76a880b42",
  "state": "READY",
  "created_at": "2026-10-30T09:03:44.352523Z",
  "ready_at": "2026-10-30T09:03:49.55833Z",
  "expires_at": "2026-11-06T09:03:49.55833Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/34acb7e9-85d7-4878-8c75-93b76a880b42/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635686336",
  "device_ref": "sandbox-959"
}
```

```json
{
  "challenge_id": "fabfdfec-67e5-40d1-b6d3-c8c1d273bb11",
  "expires_at": "2026-10-30T09:08:49.893984016Z",
  "resend_available_at": "2026-10-30T09:03:50.893984016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635686336` → **200**

```json
{
  "phone": "+380635686336",
  "audience": "CLIENT",
  "code": "627605",
  "sent_at": "2026-10-30T09:03:49.896347882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fabfdfec-67e5-40d1-b6d3-c8c1d273bb11",
  "code": "627605",
  "device_ref": "sandbox-959"
}
```

```json
{
  "session_id": "09007fe5-053c-4354-bf05-bc9b4dd291de",
  "subject": {
    "type": "CLIENT",
    "id": "f69e79e5-a4aa-49b5-8cfd-942b6b6cfe18"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNjllNzllNS1hNGFhLTQ5YjUtOGNmZC05NDJiNmI2Y2ZlMTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTMwLCJpYXQiOjE3OTMzNTEwMzAsImp0aSI6IjUyZDE1MjJkLTFlNjEtNGQxZC1hZTUxLWRkNWZhN2U1ZTBiMCIsInNpZCI6IjA5MDA3ZmU1LTA1M2MtNDM1NC1iZjA1LWJjOWI0ZGQyOTFkZSJ9.pT0LGbGSHsQyC7dRNOsHmMXS2Co6tHxRbukXQ3If3mg",
  "access_expires_at": "2026-10-30T09:18:50.172034015Z",
  "refresh_token": "lPrp-YnpeJne2_Hks-bhDzp14CD-bz-KU82PSdemrsU",
  "refresh_expires_at": "2026-11-29T09:03:50.171521574Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/34acb7e9-85d7-4878-8c75-93b76a880b42/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/34acb7e9-85d7-4878-8c75-93b76a880b42/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fc018ffa-9c57-4747-ac28-d9f66d1e9650"
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
  "session_id": "6da4bb83-9aac-47ee-b468-602efb72f2eb",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5MzAsImlhdCI6MTc5MzM1MTAzMCwianRpIjoiZGMyYWRjMWYtMDhmYi00NjZhLTlkMjAtYjg5MDkyZjMxMmEwIiwic2lkIjoiNmRhNGJiODMtOWFhYy00N2VlLWI0NjgtNjAyZWZiNzJmMmViIn0.xqCsOYO702BZ4WOqsrQaHzsTxHuXpEzlpIyDi51Jukk",
  "access_expires_at": "2026-10-30T09:18:50.983588502Z",
  "refresh_token": "w3WN7jMVKjiV1GnDis-Bzjdnty6uiTTyaOEJ2CxNrTY",
  "refresh_expires_at": "2026-10-30T21:03:50.982893335Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c16f1f84-4033-4cc0-84aa-681cf8367b6c",
  "session_id": "cd15b79d-4925-4e73-92fc-66e0c5b362c4",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/c16f1f84-4033-4cc0-84aa-681cf8367b6c/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "34acb7e9-85d7-4878-8c75-93b76a880b42",
      "state": "READY",
      "created_at": "2026-10-30T09:03:44.352523Z",
      "ready_at": "2026-10-30T09:03:49.55833Z",
      "expires_at": "2026-11-06T09:03:49.55833Z",
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
  "device_ref": "sandbox-4584"
}
```

```json
{
  "challenge_id": "a054ff1f-c6cb-4ba2-bbb8-24930aa29588",
  "expires_at": "2026-10-30T09:08:51.749090683Z",
  "resend_available_at": "2026-10-30T09:03:52.749090683Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "707331",
  "sent_at": "2026-10-30T09:03:51.751378466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a054ff1f-c6cb-4ba2-bbb8-24930aa29588",
  "code": "707331",
  "device_ref": "sandbox-4584"
}
```

```json
{
  "session_id": "e1b5796c-0786-4755-8ee2-7800474fed75",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTkzMiwiaWF0IjoxNzkzMzUxMDMyLCJqdGkiOiI4ZDk1Nzg2OS03Y2EyLTQzOGEtYmFkOS00OTNmYTI2ODI0YWMiLCJzaWQiOiJlMWI1Nzk2Yy0wNzg2LTQ3NTUtOGVlMi03ODAwNDc0ZmVkNzUifQ.odKwqcfuV2DNVlFGoEmqeIEtNpk4kBf61DX605NK0Cc",
  "access_expires_at": "2026-10-30T09:18:52.047845411Z",
  "refresh_token": "ILMstF0B4xZUkPL23Yoeb-tyxcFCZoUhoBVsRositS0",
  "refresh_expires_at": "2026-11-29T09:03:52.047334895Z",
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
  "device_ref": "sandbox-17036"
}
```

```json
{
  "challenge_id": "097d4a69-53d2-4add-9387-9c0686789df8",
  "expires_at": "2026-10-30T09:08:52.556184495Z",
  "resend_available_at": "2026-10-30T09:03:53.556184495Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "967153",
  "sent_at": "2026-10-30T09:03:52.558750348Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "097d4a69-53d2-4add-9387-9c0686789df8",
  "code": "967153",
  "device_ref": "sandbox-17036"
}
```

```json
{
  "session_id": "5143d32d-c148-4930-baaa-40187c590a65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTkzMiwiaWF0IjoxNzkzMzUxMDMyLCJqdGkiOiJhNzNiNTVkOS03YmE3LTQzNmQtODU0OS0wNGY4OGVjNmZjYjMiLCJzaWQiOiI1MTQzZDMyZC1jMTQ4LTQ5MzAtYmFhYS00MDE4N2M1OTBhNjUifQ.XkjWhMHaicVwW-Ydl4bzBEkmPLsch9IDVhrpLHtizqQ",
  "access_expires_at": "2026-10-30T09:18:52.833322507Z",
  "refresh_token": "MNojHsvrTutJPvZ1Ey2FTcUx-LXbBEt4LEvPKQ7zJAM",
  "refresh_expires_at": "2026-11-29T09:03:52.832601493Z",
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
  "command_id": "1f1b477a-4b69-4379-98ab-b2a6c51881ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:03:53Z",
    "sequence": 1793351033334
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83c8b2be-20d7-409a-a9d7-409ba7aa94ee",
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
  "last_heartbeat_at": "2026-10-30T09:03:53.351461Z",
  "last_location_at": "2026-10-30T09:03:53.351461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-19472"
}
```

```json
{
  "challenge_id": "55a4edef-8ae7-4766-9aa6-831297b8e394",
  "expires_at": "2026-10-30T09:08:53.601935376Z",
  "resend_available_at": "2026-10-30T09:03:54.601935376Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "957881",
  "sent_at": "2026-10-30T09:03:53.60423768Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55a4edef-8ae7-4766-9aa6-831297b8e394",
  "code": "957881",
  "device_ref": "sandbox-19472"
}
```

```json
{
  "session_id": "5f050468-9675-464d-8ab7-7224776be252",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTkzMywiaWF0IjoxNzkzMzUxMDMzLCJqdGkiOiIzOGZkMmY0NC0yMDMwLTRlODUtYjFjOS1mMTBhNzJkZmFlYzciLCJzaWQiOiI1ZjA1MDQ2OC05Njc1LTQ2NGQtOGFiNy03MjI0Nzc2YmUyNTIifQ.3tgrIhg1Y74G7qFWpUdVNAPgW4wM28xBkRVqsWckgRM",
  "access_expires_at": "2026-10-30T09:18:53.895284107Z",
  "refresh_token": "UZ-_CbdgzBDLCk-UsgwSDeVLYrbtI7GJaXjil3oB5bw",
  "refresh_expires_at": "2026-11-29T09:03:53.894785735Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e55467f9-c1c2-4a4f-b5f4-be4c6ec6e740",
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
  "last_heartbeat_at": "2026-10-30T09:02:24.988728Z",
  "last_location_at": "2026-10-30T09:02:24.988728Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e55467f9-c1c2-4a4f-b5f4-be4c6ec6e740/handover` → **200**

```json
{
  "command_id": "2b51c305-12fe-4289-908b-b1738f006587",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e55467f9-c1c2-4a4f-b5f4-be4c6ec6e740",
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
  "last_heartbeat_at": "2026-10-30T09:02:24.988728Z",
  "last_location_at": "2026-10-30T09:02:24.988728Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e55467f9-c1c2-4a4f-b5f4-be4c6ec6e740/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:03:54Z",
    "sequence": 1793351034652
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e55467f9-c1c2-4a4f-b5f4-be4c6ec6e740",
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
  "last_heartbeat_at": "2026-10-30T09:03:54.670486Z",
  "last_location_at": "2026-10-30T09:03:54.670486Z",
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
  "session_id": "d8af9387-9785-4098-9ee4-840f2df4f90a",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5MzUsImlhdCI6MTc5MzM1MTAzNSwianRpIjoiY2YyZWZkYWUtNjk2Ny00YTBlLTg2MTMtZWQ0ZTA3OWQ2MGUxIiwic2lkIjoiZDhhZjkzODctOTc4NS00MDk4LTllZTQtODQwZjJkZjRmOTBhIn0.V_BKRGFaE0RxaNlUViVWxPt590akJ8tXRIv4iBbbZRE",
  "access_expires_at": "2026-10-30T09:18:55.220085643Z",
  "refresh_token": "QQZjSzklTAmCgrCNBcyDcXOiO8LUAgzq2227kJu888Q",
  "refresh_expires_at": "2026-10-30T21:03:55.219598001Z",
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
  "session_id": "2ae08f62-cdb4-4839-9b55-455614263788",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5MzUsImlhdCI6MTc5MzM1MTAzNSwianRpIjoiMjI0YzRkZjMtMTlhOC00ZGQ1LTk1M2ItMWFkZmI4NjQ2YjNlIiwic2lkIjoiMmFlMDhmNjItY2RiNC00ODM5LTliNTUtNDU1NjE0MjYzNzg4In0.e3eezR28vnXiqI7d5Qg2eFtji5YsVsauFsPAt1LipMw",
  "access_expires_at": "2026-10-30T09:18:55.775103966Z",
  "refresh_token": "NGNNo2reQ5EbmyiN4nzg57pvg5A1aDlKVl7hcn7nV_4",
  "refresh_expires_at": "2026-10-30T21:03:55.774620481Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688161118",
  "device_ref": "sandbox-18221"
}
```

```json
{
  "challenge_id": "2e9398fd-4d63-4f5d-b9e8-7e7072f9a8ef",
  "expires_at": "2026-10-30T09:08:56.023584527Z",
  "resend_available_at": "2026-10-30T09:03:57.023584527Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380688161118` → **200**

```json
{
  "phone": "+380688161118",
  "audience": "CLIENT",
  "code": "852475",
  "sent_at": "2026-10-30T09:03:56.026143867Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e9398fd-4d63-4f5d-b9e8-7e7072f9a8ef",
  "code": "852475",
  "device_ref": "sandbox-18221"
}
```

```json
{
  "session_id": "9f8e20ea-3b6c-4780-85d6-f9cbe320e5fd",
  "subject": {
    "type": "CLIENT",
    "id": "f9e6a8d6-f9ae-4bc6-ae9c-871673b59fe3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOWU2YThkNi1mOWFlLTRiYzYtYWU5Yy04NzE2NzNiNTlmZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTM2LCJpYXQiOjE3OTMzNTEwMzYsImp0aSI6IjAxNTgzZjNjLWQyMWItNDkxZi1hMGIyLTk2YjA1Y2YxMjgxNyIsInNpZCI6IjlmOGUyMGVhLTNiNmMtNDc4MC04NWQ2LWY5Y2JlMzIwZTVmZCJ9.fITiMhAXOgrP1wFW-GPzWR7AElOTxLfkYwu5QWAdHbc",
  "access_expires_at": "2026-10-30T09:18:56.295163035Z",
  "refresh_token": "EMEt6kMih2QegdgUzKwaqrlRh3IKSIGkVV6ft5F87Dg",
  "refresh_expires_at": "2026-11-29T09:03:56.294684347Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1ba767c8-bc89-40b7-bb00-d2a70a327330",
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
  "id": "7f2ecdab-0290-4b63-a824-9afe1d1333f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:08:56.548578Z",
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
  "command_id": "b8e4f817-0d1f-4e0f-9b15-1c54bd64c029",
  "quote_id": "7f2ecdab-0290-4b63-a824-9afe1d1333f2",
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
  "id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f9e6a8d6-f9ae-4bc6-ae9c-871673b59fe3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:03:56.817433Z",
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
    "id": "82ed237a-ee41-4681-b933-ae0cedf86265",
    "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
    "expires_at": "2026-10-30T09:04:11.820864Z",
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

`POST /api/driver/v1/offers/82ed237a-ee41-4681-b933-ae0cedf86265/reject` → **204**

```json
{
  "command_id": "30c3550b-c3bb-4e50-a40c-4c78cd3858eb"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "09127fbe-9594-44c7-861a-9d21fff72855",
    "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
    "expires_at": "2026-10-30T09:04:12.351398Z",
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

`POST /api/driver/v1/offers/09127fbe-9594-44c7-861a-9d21fff72855/accept` → **200**

```json
{
  "command_id": "8b1f579e-e82f-4010-9c48-aeae811fe8de"
}
```

```json
{
  "id": "fcbc15a0-5647-4917-9b2e-f6d70ee8db7d",
  "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f9d40a24-d1a2-46a4-b84f-e92af4a89c6a",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c42e5f07-a19c-4a59-9c44-500fbdabddf0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:03:56.817972Z",
      "actor": {
        "type": "CLIENT",
        "id": "f9e6a8d6-f9ae-4bc6-ae9c-871673b59fe3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
        "quote_id": "7f2ecdab-0290-4b63-a824-9afe1d1333f2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "54633371-43ad-4224-b3b5-8fa4f5bfce04"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:03:56.819985Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
        "attempt_id": "0f2cf791-db1f-408b-b666-f773af36cb0a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "54633371-43ad-4224-b3b5-8fa4f5bfce04"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:03:56.823666Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "82ed237a-ee41-4681-b933-ae0cedf86265",
        "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "54633371-43ad-4224-b3b5-8fa4f5bfce04"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T09:03:57.350517Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "82ed237a-ee41-4681-b933-ae0cedf86265",
        "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0"
      },
      "correlation_id": "f96d50bf-0e18-4d07-b7ae-6c7d4b3b3221"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c42e5f07-a19c-4a59-9c44-500fbdabddf0 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c42e5f07-a19c-4a59-9c44-500fbdabddf0` → **200**

```json
{
  "id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f9e6a8d6-f9ae-4bc6-ae9c-871673b59fe3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "fcbc15a0-5647-4917-9b2e-f6d70ee8db7d",
    "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f9d40a24-d1a2-46a4-b84f-e92af4a89c6a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:03:56.817433Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c42e5f07-a19c-4a59-9c44-500fbdabddf0/cancel` → **200**

```json
{
  "command_id": "44a3beff-9a5b-49dc-9163-ec3b52ebfe0b",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f9e6a8d6-f9ae-4bc6-ae9c-871673b59fe3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "fcbc15a0-5647-4917-9b2e-f6d70ee8db7d",
    "order_id": "c42e5f07-a19c-4a59-9c44-500fbdabddf0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f9d40a24-d1a2-46a4-b84f-e92af4a89c6a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:03:56.817433Z",
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
  "session_id": "83c8b2be-20d7-409a-a9d7-409ba7aa94ee",
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
  "last_heartbeat_at": "2026-10-30T09:03:53.351461Z",
  "last_location_at": "2026-10-30T09:03:53.351461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/83c8b2be-20d7-409a-a9d7-409ba7aa94ee/close` → **200**

```json
{
  "command_id": "394a0998-716c-4db3-8cbe-4c6897d036b0",
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
  "session_id": "e55467f9-c1c2-4a4f-b5f4-be4c6ec6e740",
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
  "last_heartbeat_at": "2026-10-30T09:03:54.670486Z",
  "last_location_at": "2026-10-30T09:03:54.670486Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e55467f9-c1c2-4a4f-b5f4-be4c6ec6e740/close` → **200**

```json
{
  "command_id": "3f9ac24e-016b-45be-be46-f04be93b9ed6",
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
  "session_id": "6add54d3-b3ad-448a-b22c-befbe9d6b4ef",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5NDAsImlhdCI6MTc5MzM1MTA0MCwianRpIjoiOWU5ZmQ3MjctNGFkMy00ZGYwLWE0N2EtOWRjOGVlM2EzMzZjIiwic2lkIjoiNmFkZDU0ZDMtYjNhZC00NDhhLWIyMmMtYmVmYmU5ZDZiNGVmIn0.bSPI0R7Iyb83zXdghcX6J6H7cx38kDsrdICOiq4d_JA",
  "access_expires_at": "2026-10-30T09:19:00.08447292Z",
  "refresh_token": "18wmctFR5kJDEt8xj4PA9h2FPKOatksB3OPZWAFZ8Q4",
  "refresh_expires_at": "2026-10-30T21:04:00.083814097Z",
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
  "command_id": "617fa04d-0cd1-40be-832a-d4e1e8245029",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T09:04:00.607599Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "b56d12ce-28f7-45f1-9a36-e3e9c3e27939",
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
  "correlation_id": "aa60c504-1e09-4f85-9e92-8cf7f990cd76"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "878c735a-5ee2-490d-bc4e-01fc768747de",
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
  "correlation_id": "2fbdb642-b48b-48a4-9f57-9df0d1cc7e58"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632496949",
  "device_ref": "sandbox-25475"
}
```

```json
{
  "challenge_id": "9ab6d242-3038-4487-8590-49280f047097",
  "expires_at": "2026-10-30T09:09:01.455800018Z",
  "resend_available_at": "2026-10-30T09:04:02.455800018Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632496949` → **200**

```json
{
  "phone": "+380632496949",
  "audience": "CLIENT",
  "code": "475409",
  "sent_at": "2026-10-30T09:04:01.4581916Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ab6d242-3038-4487-8590-49280f047097",
  "code": "475409",
  "device_ref": "sandbox-25475"
}
```

```json
{
  "session_id": "8e988e31-0876-41ea-85be-585d7adfcc81",
  "subject": {
    "type": "CLIENT",
    "id": "639b76b2-da16-4a51-8a6f-bb0f2d2ac101"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MzliNzZiMi1kYTE2LTRhNTEtOGE2Zi1iYjBmMmQyYWMxMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTQxLCJpYXQiOjE3OTMzNTEwNDEsImp0aSI6Ijg4ZjlkNDRlLWUzMzgtNGZmMy05MzI4LTUyMTRlZmIzYmM3MyIsInNpZCI6IjhlOTg4ZTMxLTA4NzYtNDFlYS04NWJlLTU4NWQ3YWRmY2M4MSJ9.pYzs__QQly8hkR9BXnBuogBJLyDkKjXXiVlewtOWzQU",
  "access_expires_at": "2026-10-30T09:19:01.730256018Z",
  "refresh_token": "4vhWxC1vTopMBKfNr4-D98tcw5cLO4EMJAl8Ysg-5i0",
  "refresh_expires_at": "2026-11-29T09:04:01.729821956Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d50cd8b-d59e-481e-9546-89a4e8fc9404",
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
  "id": "d14b4aac-9ed8-47b0-b324-30c32ecefaed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:01.987535Z",
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
  "command_id": "ec422a6f-f7b4-464b-b80d-0d469d76a420",
  "quote_id": "d14b4aac-9ed8-47b0-b324-30c32ecefaed",
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
  "correlation_id": "6dec0123-b1bc-411c-b5c2-9eddcc173fdb"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "67f0ab13-0296-46f3-9418-694d17c0e836",
  "quote_id": "d14b4aac-9ed8-47b0-b324-30c32ecefaed",
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
  "id": "6f9318b9-5b93-4255-b39f-3aba6d3a553e",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "639b76b2-da16-4a51-8a6f-bb0f2d2ac101",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:04:02.504601Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6f9318b9-5b93-4255-b39f-3aba6d3a553e/cancel` → **200**

```json
{
  "command_id": "354898e0-3d57-4d0e-902f-ad2a5a15f58f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6f9318b9-5b93-4255-b39f-3aba6d3a553e",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "639b76b2-da16-4a51-8a6f-bb0f2d2ac101",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:04:02.504601Z",
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
  "command_id": "8ca32609-3ecc-4ae6-aa08-17452f5ceae2",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T09:04:03.050704Z"
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
      "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T09:04:03.050704Z"
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
  "device_ref": "sandbox-13904"
}
```

```json
{
  "challenge_id": "e6e689ee-d724-4ed0-800b-5d7a4b29d749",
  "expires_at": "2026-10-30T09:09:03.819971868Z",
  "resend_available_at": "2026-10-30T09:04:04.819971868Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "701496",
  "sent_at": "2026-10-30T09:04:03.82204533Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6e689ee-d724-4ed0-800b-5d7a4b29d749",
  "code": "701496",
  "device_ref": "sandbox-13904"
}
```

```json
{
  "session_id": "7a7b9ea2-716a-4a9d-b6bc-fb051d2dca9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTk0NCwiaWF0IjoxNzkzMzUxMDQ0LCJqdGkiOiJhMWUzMGM5Mi1iMDRhLTRkNWEtYjliOS05YjMyZGQ0ODg4NzQiLCJzaWQiOiI3YTdiOWVhMi03MTZhLTRhOWQtYjZiYy1mYjA1MWQyZGNhOWQifQ.eNfAsn5z3T4GPm_opOd2TRCBGZPuPPMoF06SXeN1Stg",
  "access_expires_at": "2026-10-30T09:19:04.092733314Z",
  "refresh_token": "NcQyVSmtz6tq9ToXBZ5Wju5Wobt6MjiH0giPhHJOVE0",
  "refresh_expires_at": "2026-11-29T09:04:04.092241254Z",
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
  "command_id": "b1e1d733-fc53-43df-ada6-28ea4aa3b43f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:04Z",
    "sequence": 1793351044588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:04.605264Z",
  "last_location_at": "2026-10-30T09:04:04.605264Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671683240",
  "device_ref": "sandbox-10746"
}
```

```json
{
  "challenge_id": "22ca616f-08f8-4544-96ca-ed48c343d592",
  "expires_at": "2026-10-30T09:09:04.861581919Z",
  "resend_available_at": "2026-10-30T09:04:05.861581919Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671683240` → **200**

```json
{
  "phone": "+380671683240",
  "audience": "CLIENT",
  "code": "393674",
  "sent_at": "2026-10-30T09:04:04.863683584Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22ca616f-08f8-4544-96ca-ed48c343d592",
  "code": "393674",
  "device_ref": "sandbox-10746"
}
```

```json
{
  "session_id": "c4176ad0-89e7-4e71-858e-e7cffca7b0bd",
  "subject": {
    "type": "CLIENT",
    "id": "43152223-4a05-4826-9d6b-78a807a50460"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzE1MjIyMy00YTA1LTQ4MjYtOWQ2Yi03OGE4MDdhNTA0NjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTQ1LCJpYXQiOjE3OTMzNTEwNDUsImp0aSI6IjAzNmU0MjZmLTcwZjEtNDJhNS1hNTAwLTBiYjQ5ODg1ZGRlZiIsInNpZCI6ImM0MTc2YWQwLTg5ZTctNGU3MS04NThlLWU3Y2ZmY2E3YjBiZCJ9.7TMtRTl1tmE-tUJOuqJUR1ozch7WW5b4ETPyrUzEJGk",
  "access_expires_at": "2026-10-30T09:19:05.12384146Z",
  "refresh_token": "SsWyuSHoymbOvcvvIMIzbbQmeX58z80RY-CxNAelW2g",
  "refresh_expires_at": "2026-11-29T09:04:05.123400044Z",
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
  "command_id": "6450417c-e408-4d0e-94d2-b4a05be80577",
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
  "id": "e571a502-7eec-457a-9190-d0724691c6ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:05.621406Z",
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
  "command_id": "c6d1c0ce-edf3-45bd-8e09-3070f2719669",
  "platform": "ANDROID",
  "token": "sandbox-driver-f71f1cb3-fc11-4c50-9f56-489c009676e2"
}
```

```json
{
  "id": "63836a39-2c5f-45ba-a278-5ecac8cdd1a4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:04:05.882961Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "4bb89fc9-e18e-43c3-a293-fd3138112dc2",
  "platform": "ANDROID",
  "token": "sandbox-rider-fb360a77-5b68-44d6-a934-c80648c754e2"
}
```

```json
{
  "id": "2713d48b-fb39-474f-9b3e-6c8d47445bdf",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T09:04:06.131623Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4f5987f2-e6d2-4d86-bb66-74ac0a1db565",
  "quote_id": "e571a502-7eec-457a-9190-d0724691c6ba",
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
  "id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "43152223-4a05-4826-9d6b-78a807a50460",
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
  "created_at": "2026-10-30T09:04:06.389369Z",
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
    "id": "f60ffa18-28cb-47b7-aa97-82911658331f",
    "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
    "expires_at": "2026-10-30T09:04:21.392309Z",
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

`POST /api/driver/v1/offers/f60ffa18-28cb-47b7-aa97-82911658331f/accept` → **200**

```json
{
  "command_id": "8fbcc9d0-0f02-4e7e-ab80-b2646f9bafbd"
}
```

```json
{
  "id": "407a507b-31ae-4d21-b834-eda21dbb50c6",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "686480be-ba4e-4f58-8d7a-4f9ae7f3d028",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T09:04:06.367Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:04:07.105389216Z",
    "token_suffix": "9676e2",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "9277da0c-14a5-484f-bc15-91b7f7c22522",
      "order_version": "2",
      "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671683240&after=2026-10-30T09:04:06.367Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380671683240&after=2026-10-30T09:04:06.367Z` → **200**

```json
[
  {
    "at": "2026-10-30T09:04:08.111875595Z",
    "token_suffix": "c754e2",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "f2bfcf4a-c485-4a25-9940-362b29480e38",
      "order_version": "3",
      "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/36fdd763-1786-4ce3-a60e-def35c7e1f0f/messages` → **201**

```json
{
  "command_id": "0cd3a8f2-56ac-40ac-8f06-2cd1f4f28b8e",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "47ddd9d9-79e9-40a8-a697-b8c23cc34f3d",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T09:04:08.244239684Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "686480be-ba4e-4f58-8d7a-4f9ae7f3d028",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "assignment_id": "407a507b-31ae-4d21-b834-eda21dbb50c6",
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

`POST /api/driver/v1/trips/686480be-ba4e-4f58-8d7a-4f9ae7f3d028/messages` → **201**

```json
{
  "command_id": "243cffea-4e47-4c51-800b-23ed7c1b0d7e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "4916015e-57c3-4c01-b5bd-46fa649c9680",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T09:04:08.731334774Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/36fdd763-1786-4ce3-a60e-def35c7e1f0f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/686480be-ba4e-4f58-8d7a-4f9ae7f3d028/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671683240"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/a47e6362-38c2-41d8-9159-17b8825eeecc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:09Z",
    "sequence": 1793351049484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:09.500892Z",
  "last_location_at": "2026-10-30T09:04:09.500892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "686480be-ba4e-4f58-8d7a-4f9ae7f3d028",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "assignment_id": "407a507b-31ae-4d21-b834-eda21dbb50c6",
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

`POST /api/driver/v1/trips/686480be-ba4e-4f58-8d7a-4f9ae7f3d028/arrive` → **200**

```json
{
  "command_id": "28a31b35-29a9-4984-a94f-a420ed789129",
  "expected_version": 0
}
```

```json
{
  "id": "686480be-ba4e-4f58-8d7a-4f9ae7f3d028",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "assignment_id": "407a507b-31ae-4d21-b834-eda21dbb50c6",
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
  "arrived_at": "2026-10-30T09:04:10.000689Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/686480be-ba4e-4f58-8d7a-4f9ae7f3d028/start` → **200**

```json
{
  "command_id": "7c4fa796-391f-49ac-8c67-58e4cca0580c",
  "expected_version": 1
}
```

```json
{
  "id": "686480be-ba4e-4f58-8d7a-4f9ae7f3d028",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "assignment_id": "407a507b-31ae-4d21-b834-eda21dbb50c6",
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
  "arrived_at": "2026-10-30T09:04:10.000689Z",
  "started_at": "2026-10-30T09:04:10.259217Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a47e6362-38c2-41d8-9159-17b8825eeecc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:10Z",
    "sequence": 1793351050496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:10.514515Z",
  "last_location_at": "2026-10-30T09:04:10.514515Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/686480be-ba4e-4f58-8d7a-4f9ae7f3d028/complete` → **200**

```json
{
  "command_id": "a3259cd3-94a0-469a-9fb1-8fc662ca28d7",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:04:10Z",
  "cash_received": true
}
```

```json
{
  "id": "686480be-ba4e-4f58-8d7a-4f9ae7f3d028",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "assignment_id": "407a507b-31ae-4d21-b834-eda21dbb50c6",
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
  "arrived_at": "2026-10-30T09:04:10.000689Z",
  "started_at": "2026-10-30T09:04:10.259217Z",
  "completed_at": "2026-10-30T09:04:10.767916Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/36fdd763-1786-4ce3-a60e-def35c7e1f0f` → **200**

```json
{
  "id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "43152223-4a05-4826-9d6b-78a807a50460",
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
    "id": "407a507b-31ae-4d21-b834-eda21dbb50c6",
    "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "686480be-ba4e-4f58-8d7a-4f9ae7f3d028",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:04:06.389369Z",
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
    "id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:04:06.389369Z",
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
    "id": "686480be-ba4e-4f58-8d7a-4f9ae7f3d028",
    "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
    "order_short_number": 13,
    "created_at": "2026-10-30T09:04:06.920648Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6c1b477f-d935-4417-8f1a-05bd98fcfd23",
    "order_id": "942c3978-60b4-429d-aab7-24ff2d5c098a",
    "order_short_number": 8,
    "created_at": "2026-10-30T09:02:57.31934Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "34f2d856-946c-4138-93d7-845fc040a614",
    "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
    "order_short_number": 3,
    "created_at": "2026-10-30T09:02:14.366942Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "af81957b-d2b8-4fab-b92b-27dccf6b9db9",
    "order_id": "4ccbad59-a28a-4376-b0dc-d674901bf835",
    "order_short_number": 2,
    "created_at": "2026-10-30T09:01:53.768128Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5afeafc7-d71a-49c6-a232-46cf1dfdcdb8",
    "order_id": "d006736a-8522-46f6-afbb-ed544043da3a",
    "order_short_number": 1,
    "created_at": "2026-10-30T09:01:44.756173Z",
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

`GET /api/rider/v1/orders/36fdd763-1786-4ce3-a60e-def35c7e1f0f/tip` → **200**

```json
{
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
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
  "available_until": "2026-10-31T09:04:10.767916Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/36fdd763-1786-4ce3-a60e-def35c7e1f0f/tip` → **201**

```json
{
  "command_id": "a652ea64-8364-4d58-9599-5c43f6dea03a",
  "amount_minor": 1100
}
```

```json
{
  "id": "ac59a545-fd3f-474f-819c-235561cba133",
  "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T09:04:15.558427Z"
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
  "session_id": "98e40e1e-0917-4760-a1ef-cd91d6ab4d2c",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5NTYsImlhdCI6MTc5MzM1MTA1NiwianRpIjoiYjJiZWQ3YmYtMTUxYi00NDY2LTllMTktMjllZDU3NDljMjhlIiwic2lkIjoiOThlNDBlMWUtMDkxNy00NzYwLWExZWYtY2Q5MWQ2YWI0ZDJjIn0.FmwbEdtT1N3NUHfCDsdX4qAN8mTsuQyJFyClvY3aJXo",
  "access_expires_at": "2026-10-30T09:19:16.089023227Z",
  "refresh_token": "H1cMhDrLQQN_cH39gpZ5_Lk9HryjOWan5NPYfQOqOhY",
  "refresh_expires_at": "2026-10-30T21:04:16.088556524Z",
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
  "generated_at": "2026-10-30T09:04:16.330497481Z"
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
  "generated_at": "2026-10-30T09:04:16.586383533Z"
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
  "session_id": "df1a05e0-3ad9-462c-88d6-3dd63556a828",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5NTcsImlhdCI6MTc5MzM1MTA1NywianRpIjoiYzc2YjAzMmMtMzYxZi00MDY0LThkNjUtZDg3ZDg1N2ZlOGM0Iiwic2lkIjoiZGYxYTA1ZTAtM2FkOS00NjJjLTg4ZDYtM2RkNjM1NTZhODI4In0.J9cmUw-8sZcbgPldmvQyuj5lzrW_R1zZNSKo4Nzhrv4",
  "access_expires_at": "2026-10-30T09:19:17.126415145Z",
  "refresh_token": "J2OLHsqhh8ebQWF7DgAY3O2t7ktAP3QZl2re2PWmZn8",
  "refresh_expires_at": "2026-10-30T21:04:17.12571012Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/36fdd763-1786-4ce3-a60e-def35c7e1f0f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:04:06.389899Z",
      "actor": {
        "type": "CLIENT",
        "id": "43152223-4a05-4826-9d6b-78a807a50460",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
        "quote_id": "e571a502-7eec-457a-9190-d0724691c6ba",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ff397f81-eaeb-4b8b-aca3-a4b4bc35c931"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:04:06.391587Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
        "attempt_id": "1c37f8ae-c5ff-4141-a711-7babc053775f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ff397f81-eaeb-4b8b-aca3-a4b4bc35c931"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:04:06.394064Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f60ffa18-28cb-47b7-aa97-82911658331f",
        "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "ff397f81-eaeb-4b8b-aca3-a4b4bc35c931"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:04:06.921897Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f60ffa18-28cb-47b7-aa97-82911658331f",
        "order_id": "36fdd763-1786-4ce3-a60e-def35c7e1f0f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "407a507b-31ae-4d21-b834-eda21dbb50c6"
      },
      "correlation_id": "4f2a771c-56b4-4b3f-bc1e-3d1fa2cfd138"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T09:04:17.628805307Z",
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
      "last_location_at": "2026-10-30T09:04:10.514515Z",
      "order_id": null
    }
  ]
}
```

Done: order 36fdd763-1786-4ce3-a60e-def35c7e1f0f.

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
  "session_id": "9bb48582-ec62-4b9b-baf3-81251b582028",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5NTgsImlhdCI6MTc5MzM1MTA1OCwianRpIjoiNDhhY2YwM2QtMWQ0MC00YjQ3LWI4MzMtYmJjNjA1NjkyOGFlIiwic2lkIjoiOWJiNDg1ODItZWM2Mi00YjliLWJhZjMtODEyNTFiNTgyMDI4In0.yRcrljCDaAyfpy29h-8MvaMeBPFTGdGUZPdkr9IMhtY",
  "access_expires_at": "2026-10-30T09:19:18.183079244Z",
  "refresh_token": "O9odWkItdejtvxn_KftZhTBZ3WLosMAh0VKzFVfg88s",
  "refresh_expires_at": "2026-10-30T21:04:18.182469009Z",
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
  "command_id": "3fd04a55-4ae5-4264-b632-ed35dbc25685",
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
  "timestamp": "2026-10-30T09:04:18.000+0000",
  "channel": {
    "id": "1730052000.267912348",
    "linkedid": "1730052000.267912348",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676388802"
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
  "timestamp": "2026-10-30T09:04:18.000+0000",
  "channel": {
    "id": "1730052000.267912348",
    "linkedid": "1730052000.267912348",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676388802"
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
  "session_id": "83f04cf2-36d9-40e4-b22d-c4df54cd3205",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5NTksImlhdCI6MTc5MzM1MTA1OSwianRpIjoiNDI3YjMwMTQtMGQ0Yi00YmM1LTliMzgtNjE0Y2MwMGIxOWEyIiwic2lkIjoiODNmMDRjZjItMzZkOS00MGU0LWIyMmQtYzRkZjU0Y2QzMjA1In0.yF25Ll0lzYFwd9jBCBM0QB0nROgZsWB7NvlXT_0_zZ0",
  "access_expires_at": "2026-10-30T09:19:19.252186465Z",
  "refresh_token": "MC2IkukFHMbOmX0cAS3v0Q63f3tYWM-bqv9zUQNAOs0",
  "refresh_expires_at": "2026-10-30T21:04:19.251501021Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "3f5d8265-ef3d-4932-ac3e-df2735c5b848",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676388802",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T09:04:18Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/3f5d8265-ef3d-4932-ac3e-df2735c5b848/answer` → **200**

```json
{
  "command_id": "998c52b3-17f6-4bf3-993a-89e14a18300a"
}
```

```json
{
  "id": "3f5d8265-ef3d-4932-ac3e-df2735c5b848",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676388802",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "order_ids": [],
  "started_at": "2026-10-30T09:04:18Z",
  "answered_at": "2026-10-30T09:04:19.767643Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.267912348",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "61fca35c-0d01-4a14-bf81-5ff93129fd2e",
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
  "id": "a59d2eae-4169-49cd-858e-90b529a29eeb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:20.057063Z",
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
  "command_id": "e889f33a-48aa-42c8-8237-b8e525192378",
  "quote_id": "a59d2eae-4169-49cd-858e-90b529a29eeb",
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
    "phone": "+380676388802"
  },
  "call_id": "3f5d8265-ef3d-4932-ac3e-df2735c5b848"
}
```

```json
{
  "id": "127ff58d-f417-47a6-9605-0bf09b9e6ab8",
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
  "created_at": "2026-10-30T09:04:20.317153Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676388802"
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
    "id": "1730052000.267912348",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3f5d8265-ef3d-4932-ac3e-df2735c5b848",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676388802",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [
        "127ff58d-f417-47a6-9605-0bf09b9e6ab8"
      ],
      "started_at": "2026-10-30T09:04:18Z",
      "answered_at": "2026-10-30T09:04:19.767643Z",
      "ended_at": "2026-10-30T09:04:20.592022Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "5924b90e-9ed1-4e27-806e-41fe594e1d82",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671785346",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [],
      "started_at": "2026-10-30T09:02:01.459996Z",
      "answered_at": "2026-10-30T09:02:01.74724Z",
      "ended_at": "2026-10-30T09:02:02.026828Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:02:09.537814Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/127ff58d-f417-47a6-9605-0bf09b9e6ab8` → **200**

```json
{
  "id": "127ff58d-f417-47a6-9605-0bf09b9e6ab8",
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
  "created_at": "2026-10-30T09:04:20.317153Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676388802"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/127ff58d-f417-47a6-9605-0bf09b9e6ab8` → **200**

```json
{
  "id": "127ff58d-f417-47a6-9605-0bf09b9e6ab8",
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
  "created_at": "2026-10-30T09:04:20.317153Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676388802"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/127ff58d-f417-47a6-9605-0bf09b9e6ab8/cancel` → **200**

```json
{
  "command_id": "4ca1fc49-3b2a-4d44-9ca1-da9c7cec1fd3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "127ff58d-f417-47a6-9605-0bf09b9e6ab8",
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
  "created_at": "2026-10-30T09:04:20.317153Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676388802"
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

Done: call 3f5d8265-ef3d-4932-ac3e-df2735c5b848 with order 127ff58d-f417-47a6-9605-0bf09b9e6ab8.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9982"
}
```

```json
{
  "challenge_id": "5ec5a98b-8c2d-4088-8299-cd7b967772ff",
  "expires_at": "2026-10-30T09:09:21.673913748Z",
  "resend_available_at": "2026-10-30T09:04:22.673913748Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "443758",
  "sent_at": "2026-10-30T09:04:21.676303045Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ec5a98b-8c2d-4088-8299-cd7b967772ff",
  "code": "443758",
  "device_ref": "sandbox-9982"
}
```

```json
{
  "session_id": "a41f3015-f6f4-41f3-992f-08b38d4a466a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTk2MSwiaWF0IjoxNzkzMzUxMDYxLCJqdGkiOiJiODc2NGE5NS1mMzlmLTQ2YjMtOTU3Yy04OGJiNGM4MDBhYTQiLCJzaWQiOiJhNDFmMzAxNS1mNmY0LTQxZjMtOTkyZi0wOGIzOGQ0YTQ2NmEifQ.emrvcMslleqrq0uyKq2ZIhLNCG8yc9AL_NoB1Xl_Yt4",
  "access_expires_at": "2026-10-30T09:19:21.950568066Z",
  "refresh_token": "eXQVheUjfbipWbpUvp54RUb_Be49fxbErVFGSWY3_sw",
  "refresh_expires_at": "2026-11-29T09:04:21.95010373Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:10.514515Z",
  "last_location_at": "2026-10-30T09:04:10.514515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a47e6362-38c2-41d8-9159-17b8825eeecc/handover` → **200**

```json
{
  "command_id": "f2e23757-c89e-4f28-b370-fd5543244ce1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:10.514515Z",
  "last_location_at": "2026-10-30T09:04:10.514515Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a47e6362-38c2-41d8-9159-17b8825eeecc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:22Z",
    "sequence": 1793351062706
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:22.722925Z",
  "last_location_at": "2026-10-30T09:04:22.722925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663446165",
  "device_ref": "sandbox-29674"
}
```

```json
{
  "challenge_id": "1cf9826b-866a-49e0-bf7e-476c87209ea2",
  "expires_at": "2026-10-30T09:09:22.964682884Z",
  "resend_available_at": "2026-10-30T09:04:23.964682884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663446165` → **200**

```json
{
  "phone": "+380663446165",
  "audience": "CLIENT",
  "code": "032703",
  "sent_at": "2026-10-30T09:04:22.967042231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cf9826b-866a-49e0-bf7e-476c87209ea2",
  "code": "032703",
  "device_ref": "sandbox-29674"
}
```

```json
{
  "session_id": "c453b9d9-c031-4c1f-ad51-3f26d2df0378",
  "subject": {
    "type": "CLIENT",
    "id": "6844dc4c-22df-4d04-8ad0-63badbc8415c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODQ0ZGM0Yy0yMmRmLTRkMDQtOGFkMC02M2JhZGJjODQxNWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTYzLCJpYXQiOjE3OTMzNTEwNjMsImp0aSI6ImY2ZTQyYWM1LWQwNzktNDljNS1hYWRkLWQ2ZTgzNDFkOGM3ZCIsInNpZCI6ImM0NTNiOWQ5LWMwMzEtNGMxZi1hZDUxLTNmMjZkMmRmMDM3OCJ9.tg-gWZu8TSlgKC6kdzpP5kX5xFfjSSWVNdYyw1Atkgs",
  "access_expires_at": "2026-10-30T09:19:23.236594515Z",
  "refresh_token": "6dEtY-o2E_yZlonY337A7pgDLtFgMIq0yMw6BnLLrGs",
  "refresh_expires_at": "2026-11-29T09:04:23.236055419Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a5af8294-884c-4ef0-a3af-ad225fa3ea67",
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
  "id": "4999846a-f779-4abe-bbd8-17689825f1ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:23.482894Z",
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
  "command_id": "275f14ca-a4ea-49a1-9d3f-709fe56ecd2e",
  "quote_id": "4999846a-f779-4abe-bbd8-17689825f1ac",
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
  "id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6844dc4c-22df-4d04-8ad0-63badbc8415c",
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
  "created_at": "2026-10-30T09:04:23.741372Z",
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
    "id": "01bca813-613d-49c6-b672-b94e79dabfe7",
    "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
    "expires_at": "2026-10-30T09:04:38.744474Z",
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

`POST /api/driver/v1/offers/01bca813-613d-49c6-b672-b94e79dabfe7/accept` → **200**

```json
{
  "command_id": "42d43fcf-1568-4af9-8bf1-c3b2c4c141a8"
}
```

```json
{
  "id": "abef0558-d688-4d7e-8e2b-7d75b635ce93",
  "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3f1f5022-4767-4231-80fa-291b79eb8c81",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3f1f5022-4767-4231-80fa-291b79eb8c81",
  "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
  "assignment_id": "abef0558-d688-4d7e-8e2b-7d75b635ce93",
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

`POST /api/driver/v1/work-sessions/a47e6362-38c2-41d8-9159-17b8825eeecc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:24Z",
    "sequence": 1793351064714
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:24.730089Z",
  "last_location_at": "2026-10-30T09:04:24.730089Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3f1f5022-4767-4231-80fa-291b79eb8c81/arrive` → **200**

```json
{
  "command_id": "8bad45b7-297d-4a93-a39e-8563877957aa",
  "expected_version": 0
}
```

```json
{
  "id": "3f1f5022-4767-4231-80fa-291b79eb8c81",
  "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
  "assignment_id": "abef0558-d688-4d7e-8e2b-7d75b635ce93",
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
  "arrived_at": "2026-10-30T09:04:24.988552Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3f1f5022-4767-4231-80fa-291b79eb8c81/start` → **200**

```json
{
  "command_id": "2821320b-86e7-4137-bf37-8df6ef37f863",
  "expected_version": 1
}
```

```json
{
  "id": "3f1f5022-4767-4231-80fa-291b79eb8c81",
  "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
  "assignment_id": "abef0558-d688-4d7e-8e2b-7d75b635ce93",
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
  "arrived_at": "2026-10-30T09:04:24.988552Z",
  "started_at": "2026-10-30T09:04:25.239622Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/a47e6362-38c2-41d8-9159-17b8825eeecc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:25Z",
    "sequence": 1793351065481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:25.497771Z",
  "last_location_at": "2026-10-30T09:04:25.497771Z",
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
  "device_ref": "sandbox-6173"
}
```

```json
{
  "challenge_id": "07e6f88c-7108-4901-9154-e3c6c5319dd9",
  "expires_at": "2026-10-30T09:09:25.727179557Z",
  "resend_available_at": "2026-10-30T09:04:26.727179557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "049645",
  "sent_at": "2026-10-30T09:04:25.729272282Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07e6f88c-7108-4901-9154-e3c6c5319dd9",
  "code": "049645",
  "device_ref": "sandbox-6173"
}
```

```json
{
  "session_id": "409095a9-cf3a-4659-8442-62664856d1e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTk2NSwiaWF0IjoxNzkzMzUxMDY1LCJqdGkiOiJlNGMyN2EyOC1lMzViLTRlODYtYTNhOS1jZTY4NmE0YjllMzQiLCJzaWQiOiI0MDkwOTVhOS1jZjNhLTQ2NTktODQ0Mi02MjY2NDg1NmQxZTUifQ.1o0vwofclKcvcOIvQeA3dG0CvCwCfmQPWVKr_RpBH7A",
  "access_expires_at": "2026-10-30T09:19:25.990620574Z",
  "refresh_token": "7f7r0axUMkX0vPvcodzAymvJ-67oSOX1coy-lox3mds",
  "refresh_expires_at": "2026-11-29T09:04:25.990137331Z",
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
  "command_id": "e96cbfcb-3514-4f9b-9c34-ffccb5de0deb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:26Z",
    "sequence": 1793351066468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "153fcb6e-3714-4e69-ac3e-0c83bbf6c33b",
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
  "last_heartbeat_at": "2026-10-30T09:04:26.483494Z",
  "last_location_at": "2026-10-30T09:04:26.483494Z",
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
  "session_id": "49466ba2-46e5-4e24-b536-5511c55f51ae",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5NjYsImlhdCI6MTc5MzM1MTA2NiwianRpIjoiNTM5MWUyYzYtNTNkOS00YjFmLWJlYTUtMDRjYzJkMmNkZGMxIiwic2lkIjoiNDk0NjZiYTItNDZlNS00ZTI0LWI1MzYtNTUxMWM1NWY1MWFlIn0.uWlG4oKSMEk9BKMFFYnhkJe5bITSpKQ54Rho-jlVAKY",
  "access_expires_at": "2026-10-30T09:19:26.99790327Z",
  "refresh_token": "Ow4e1kISLXrQpQx86X1_ReVASmgp0l1WVt06c26i2u0",
  "refresh_expires_at": "2026-10-30T21:04:26.997385966Z",
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
  "session_id": "1ff8ffc2-dfba-4526-83eb-97896d645b1a",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5NjcsImlhdCI6MTc5MzM1MTA2NywianRpIjoiNWY4OGRmMjQtY2FjZi00NDBhLWJhMjAtMzQ2MjNhMjY2NmViIiwic2lkIjoiMWZmOGZmYzItZGZiYS00NTI2LTgzZWItOTc4OTZkNjQ1YjFhIn0.BDn2fogPzT39Me6jlh1oegV70fBRPsBre1D6_ehoWbU",
  "access_expires_at": "2026-10-30T09:19:27.513458982Z",
  "refresh_token": "G0_bo78rGk2kkRE20S04xTcKN24zTpZHeCs-SANHa2Q",
  "refresh_expires_at": "2026-10-30T21:04:27.512989262Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/973bbb4f-b1b0-48f1-801e-8c67897be32d` → **200**

```json
{
  "id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6844dc4c-22df-4d04-8ad0-63badbc8415c",
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
    "id": "abef0558-d688-4d7e-8e2b-7d75b635ce93",
    "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3f1f5022-4767-4231-80fa-291b79eb8c81",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T09:04:23.741372Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/973bbb4f-b1b0-48f1-801e-8c67897be32d/interrupt` → **200**

```json
{
  "command_id": "4f35b510-f136-47aa-ba2a-e89e2f51748f",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "6844dc4c-22df-4d04-8ad0-63badbc8415c",
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
      "id": "abef0558-d688-4d7e-8e2b-7d75b635ce93",
      "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "3f1f5022-4767-4231-80fa-291b79eb8c81",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T09:04:23.741372Z",
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
    "id": "7ae1d762-1150-465a-b001-9d673444510f",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "6844dc4c-22df-4d04-8ad0-63badbc8415c",
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
    "id": "0b4d3eb3-e3c8-4254-b62f-a4ed59427d0e",
    "order_id": "7ae1d762-1150-465a-b001-9d673444510f",
    "expires_at": "2026-10-30T09:04:43.033747Z",
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

`POST /api/driver/v1/offers/0b4d3eb3-e3c8-4254-b62f-a4ed59427d0e/accept` → **200**

```json
{
  "command_id": "c7bdb0a8-c16d-4aa9-b6e4-b0ccd65c5927"
}
```

```json
{
  "id": "ada3e960-5180-468c-baa9-61b491255838",
  "order_id": "7ae1d762-1150-465a-b001-9d673444510f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "924341fc-d397-44c2-aeae-51742944845a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "924341fc-d397-44c2-aeae-51742944845a",
  "order_id": "7ae1d762-1150-465a-b001-9d673444510f",
  "assignment_id": "ada3e960-5180-468c-baa9-61b491255838",
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
  "session_id": "153fcb6e-3714-4e69-ac3e-0c83bbf6c33b",
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
  "last_heartbeat_at": "2026-10-30T09:04:26.483494Z",
  "last_location_at": "2026-10-30T09:04:26.483494Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/153fcb6e-3714-4e69-ac3e-0c83bbf6c33b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:29Z",
    "sequence": 1793351069255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "153fcb6e-3714-4e69-ac3e-0c83bbf6c33b",
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
  "last_heartbeat_at": "2026-10-30T09:04:29.271063Z",
  "last_location_at": "2026-10-30T09:04:29.271063Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/924341fc-d397-44c2-aeae-51742944845a/arrive` → **200**

```json
{
  "command_id": "e93fecfb-373b-4a89-9e2b-bb0d32052dde",
  "expected_version": 0
}
```

```json
{
  "id": "924341fc-d397-44c2-aeae-51742944845a",
  "order_id": "7ae1d762-1150-465a-b001-9d673444510f",
  "assignment_id": "ada3e960-5180-468c-baa9-61b491255838",
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
  "arrived_at": "2026-10-30T09:04:29.518263Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/924341fc-d397-44c2-aeae-51742944845a/start` → **200**

```json
{
  "command_id": "65fad6aa-bd18-42ba-9515-9279abcaf63c",
  "expected_version": 1
}
```

```json
{
  "id": "924341fc-d397-44c2-aeae-51742944845a",
  "order_id": "7ae1d762-1150-465a-b001-9d673444510f",
  "assignment_id": "ada3e960-5180-468c-baa9-61b491255838",
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
  "arrived_at": "2026-10-30T09:04:29.518263Z",
  "started_at": "2026-10-30T09:04:29.78529Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/924341fc-d397-44c2-aeae-51742944845a/complete` → **200**

```json
{
  "command_id": "222b6d36-62f4-4569-818a-8e4ffba7afb7",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:04:30Z"
}
```

```json
{
  "id": "924341fc-d397-44c2-aeae-51742944845a",
  "order_id": "7ae1d762-1150-465a-b001-9d673444510f",
  "assignment_id": "ada3e960-5180-468c-baa9-61b491255838",
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
  "arrived_at": "2026-10-30T09:04:29.518263Z",
  "started_at": "2026-10-30T09:04:29.78529Z",
  "completed_at": "2026-10-30T09:04:30.037657Z",
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
    "id": "7ae1d762-1150-465a-b001-9d673444510f",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T09:04:28.025665Z",
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
    "id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T09:04:23.741372Z",
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

`GET /api/operator/v1/orders/973bbb4f-b1b0-48f1-801e-8c67897be32d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T09:04:23.741905Z",
      "actor": {
        "type": "CLIENT",
        "id": "6844dc4c-22df-4d04-8ad0-63badbc8415c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
        "quote_id": "4999846a-f779-4abe-bbd8-17689825f1ac",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "2647afb3-6b35-4697-9dfd-63b17ca3789f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T09:04:23.743703Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
        "attempt_id": "3fb62b81-bae8-4c59-a984-b8bd7f5ea1d0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2647afb3-6b35-4697-9dfd-63b17ca3789f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T09:04:23.746135Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "01bca813-613d-49c6-b672-b94e79dabfe7",
        "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "2647afb3-6b35-4697-9dfd-63b17ca3789f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T09:04:24.248392Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "01bca813-613d-49c6-b672-b94e79dabfe7",
        "order_id": "973bbb4f-b1b0-48f1-801e-8c67897be32d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "abef0558-d688-4d7e-8e2b-7d75b635ce93"
      },
      "correlation_id": "f9bf94a2-4c82-4320-82e6-3afd68ad9b7d"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/7ae1d762-1150-465a-b001-9d673444510f/tip` → **200**

```json
{
  "order_id": "7ae1d762-1150-465a-b001-9d673444510f",
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
  "available_until": "2026-10-31T09:04:30.037657Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/7ae1d762-1150-465a-b001-9d673444510f/tip` → **409**

```json
{
  "command_id": "4796b037-4f4e-4188-b6a5-4e60b3518044",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/7ae1d762-1150-465a-b001-9d673444510f/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "12d8a825-dafa-4979-bc57-185c769ee858"
}
```

Done: interrupted 973bbb4f-b1b0-48f1-801e-8c67897be32d, follow-up 7ae1d762-1150-465a-b001-9d673444510f.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a47e6362-38c2-41d8-9159-17b8825eeecc",
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
  "last_heartbeat_at": "2026-10-30T09:04:25.497771Z",
  "last_location_at": "2026-10-30T09:04:25.497771Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a47e6362-38c2-41d8-9159-17b8825eeecc/close` → **200**

```json
{
  "command_id": "c6aeca2c-c5bf-4729-9b25-cf9a58d89dbd",
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
  "session_id": "153fcb6e-3714-4e69-ac3e-0c83bbf6c33b",
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
  "last_heartbeat_at": "2026-10-30T09:04:29.271063Z",
  "last_location_at": "2026-10-30T09:04:29.271063Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/153fcb6e-3714-4e69-ac3e-0c83bbf6c33b/close` → **200**

```json
{
  "command_id": "66d46c09-79c0-4d7c-89ca-619a0ab35237",
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
  "session_id": "e9f32307-10e3-4839-bb4e-2f26a604f73f",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5NzUsImlhdCI6MTc5MzM1MTA3NSwianRpIjoiNDRkN2M5YzktNmRiZS00NGI1LTgyZTctNmY3NmRlMWRmYTJiIiwic2lkIjoiZTlmMzIzMDctMTBlMy00ODM5LWJiNGUtMmYyNmE2MDRmNzNmIn0.mxLsg7D13bS8Bv0s85TCxV-YBRC7x7WFHFYosWF1PiM",
  "access_expires_at": "2026-10-30T09:19:35.877036369Z",
  "refresh_token": "tPDWrq_VOsXkVypNRhvbamSPSyrB-Um2DPxeN98KLI4",
  "refresh_expires_at": "2026-10-30T21:04:35.876424414Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d2c214c2-41b9-4e18-808f-fc606fe25113",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:04:36Z"
}
```

```json
{
  "id": "085e5a18-1da9-4e82-9666-7450a2b23c81",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:04:36Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/085e5a18-1da9-4e82-9666-7450a2b23c81/publish` → **200**

```json
{
  "command_id": "5a896e11-265f-418b-97af-b925a29d286e",
  "expected_version": 0
}
```

```json
{
  "id": "085e5a18-1da9-4e82-9666-7450a2b23c81",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:04:36.399741Z",
  "published_at": "2026-10-30T09:04:36.399741Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "085e5a18-1da9-4e82-9666-7450a2b23c81",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T09:04:36.399741Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633044813",
  "device_ref": "sandbox-29499"
}
```

```json
{
  "challenge_id": "e2bc20c5-a2fa-4483-968a-c8508f82b57a",
  "expires_at": "2026-10-30T09:09:36.90328802Z",
  "resend_available_at": "2026-10-30T09:04:37.90328802Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633044813` → **200**

```json
{
  "phone": "+380633044813",
  "audience": "CLIENT",
  "code": "849097",
  "sent_at": "2026-10-30T09:04:36.90568981Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2bc20c5-a2fa-4483-968a-c8508f82b57a",
  "code": "849097",
  "device_ref": "sandbox-29499"
}
```

```json
{
  "session_id": "008ab004-03e8-4fb3-a933-e086564cd5f4",
  "subject": {
    "type": "CLIENT",
    "id": "45d03298-ed3f-4cb8-a45e-e8162f9902f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NWQwMzI5OC1lZDNmLTRjYjgtYTQ1ZS1lODE2MmY5OTAyZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTc3LCJpYXQiOjE3OTMzNTEwNzcsImp0aSI6ImEzNzcwNjAzLTkwMjktNGEwYS1iN2E5LTE4ZWE2OGVjNWY4NyIsInNpZCI6IjAwOGFiMDA0LTAzZTgtNGZiMy1hOTMzLWUwODY1NjRjZDVmNCJ9.PhmlvheNIsyY9qlNkrwuBxI810jmP3PTbxmCMR76tx4",
  "access_expires_at": "2026-10-30T09:19:37.169672432Z",
  "refresh_token": "tA-LgcCuy9B0_rObi3aeUYqvS8iVc0uy7Muu3LBtSEQ",
  "refresh_expires_at": "2026-11-29T09:04:37.169126465Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "085e5a18-1da9-4e82-9666-7450a2b23c81",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T09:04:36.399741Z",
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
  "command_id": "4e1d0a01-b8ba-4d2f-a1ec-2d629a00f7b8",
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
  "id": "b6d3b083-4e08-48d9-8e43-93bd7a9feca7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:37.662810Z",
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
  "command_id": "df42d1ac-47c1-4470-8c85-84d50f07d205",
  "quote_id": "b6d3b083-4e08-48d9-8e43-93bd7a9feca7",
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
  "correlation_id": "481eaae6-0137-4fba-ad8a-1dc76c02a6fb"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "d4f628ee-8c36-462d-8e0d-9d0e17da069f",
  "version_id": "085e5a18-1da9-4e82-9666-7450a2b23c81",
  "language": "uk"
}
```

```json
{
  "version_id": "085e5a18-1da9-4e82-9666-7450a2b23c81",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T09:04:38.173005Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "beb23b9c-d5f2-403d-9f7a-844ceb9beb67",
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
  "id": "3bb77153-661a-422c-8599-e21b31f76cfa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:38.422814Z",
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
  "command_id": "a0f55d16-7a96-45ec-b689-74fe90302134",
  "quote_id": "3bb77153-661a-422c-8599-e21b31f76cfa",
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
  "id": "5972eff3-9648-4cf9-9b22-ab70db3b7dcb",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "45d03298-ed3f-4cb8-a45e-e8162f9902f4",
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
  "created_at": "2026-10-30T09:04:38.681504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5972eff3-9648-4cf9-9b22-ab70db3b7dcb` → **200**

```json
{
  "id": "5972eff3-9648-4cf9-9b22-ab70db3b7dcb",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "45d03298-ed3f-4cb8-a45e-e8162f9902f4",
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
  "created_at": "2026-10-30T09:04:38.681504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5972eff3-9648-4cf9-9b22-ab70db3b7dcb/cancel` → **200**

```json
{
  "command_id": "01d8814c-a5f0-4ac2-b441-ee3b304200bb",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5972eff3-9648-4cf9-9b22-ab70db3b7dcb",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "45d03298-ed3f-4cb8-a45e-e8162f9902f4",
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
  "created_at": "2026-10-30T09:04:38.681504Z",
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

`POST /api/admin/v1/legal-documents/085e5a18-1da9-4e82-9666-7450a2b23c81` → **409**

```json
{
  "command_id": "c7021b67-f192-4138-9b9f-2905b6ca4768",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T09:04:39Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/085e5a18-1da9-4e82-9666-7450a2b23c81",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "06a47c3c-3c16-44c2-be52-f697314588d4"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "0f863539-08ea-4441-8e38-0df2cfbbca30",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:04:39Z"
}
```

```json
{
  "id": "f661f060-2462-4fe4-9216-2e13df13a672",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:04:39Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/f661f060-2462-4fe4-9216-2e13df13a672/publish` → **200**

```json
{
  "command_id": "9d2f998c-e210-49dd-9462-557212230e6b",
  "expected_version": 0
}
```

```json
{
  "id": "f661f060-2462-4fe4-9216-2e13df13a672",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T09:04:40.0544Z",
  "published_at": "2026-10-30T09:04:40.0544Z",
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
  "device_ref": "sandbox-13877"
}
```

```json
{
  "challenge_id": "beb64915-ffc0-47a5-9245-28323fa0834c",
  "expires_at": "2026-10-30T09:09:40.297918659Z",
  "resend_available_at": "2026-10-30T09:04:41.297918659Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "342753",
  "sent_at": "2026-10-30T09:04:40.300930486Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "beb64915-ffc0-47a5-9245-28323fa0834c",
  "code": "342753",
  "device_ref": "sandbox-13877"
}
```

```json
{
  "session_id": "126635b6-2fbb-4c71-91c5-44b17e680717",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTk4MCwiaWF0IjoxNzkzMzUxMDgwLCJqdGkiOiI5Mzg1MmZhYi04NjU2LTQyNDUtYmMyYi04NjIxMWI1Y2E0ODIiLCJzaWQiOiIxMjY2MzViNi0yZmJiLTRjNzEtOTFjNS00NGIxN2U2ODA3MTcifQ.b09ZFXIjjZjFjyGdCfjLAz4sUfgY9iksWYDl4N8VGbI",
  "access_expires_at": "2026-10-30T09:19:40.547809091Z",
  "refresh_token": "rzbW7C9wUGWSCo6sESn7j6MQxR0faR9waquPVL1D5Qc",
  "refresh_expires_at": "2026-11-29T09:04:40.547003373Z",
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
  "command_id": "a05761fa-e2dc-4027-a9a1-b79fe9a961cc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:41Z",
    "sequence": 1793351081128
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6f85b0f3-92eb-4e80-b62e-c2819ba93a16",
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
  "last_heartbeat_at": "2026-10-30T09:04:41.028496Z",
  "last_location_at": "2026-10-30T09:04:41.028496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676099288",
  "device_ref": "sandbox-21239"
}
```

```json
{
  "challenge_id": "1cc3d407-6c5d-440a-a3a0-5de13e8e6586",
  "expires_at": "2026-10-30T09:09:41.27754273Z",
  "resend_available_at": "2026-10-30T09:04:42.27754273Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676099288` → **200**

```json
{
  "phone": "+380676099288",
  "audience": "CLIENT",
  "code": "384371",
  "sent_at": "2026-10-30T09:04:41.280027819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cc3d407-6c5d-440a-a3a0-5de13e8e6586",
  "code": "384371",
  "device_ref": "sandbox-21239"
}
```

```json
{
  "session_id": "2408637f-28e1-4731-ae6b-364a8df61e48",
  "subject": {
    "type": "CLIENT",
    "id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWVkNjFhNi1lYWViLTQyMTMtOGJlMy1mN2VhNGE2NDhlZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxOTgxLCJpYXQiOjE3OTMzNTEwODEsImp0aSI6ImFiZTQ0MzkzLWZhNjUtNGE1My1hZWQzLTRhOWZhM2FjZjc1MiIsInNpZCI6IjI0MDg2MzdmLTI4ZTEtNDczMS1hZTZiLTM2NGE4ZGY2MWU0OCJ9.lw_3ac8P0puFkzPraqblUbrHcBNyf8_47L5jSXSg4QY",
  "access_expires_at": "2026-10-30T09:19:41.53327078Z",
  "refresh_token": "OIN9aoYVJ7D3yotRhkct4nKrOmfcAyTNQmEBa9SCSXg",
  "refresh_expires_at": "2026-11-29T09:04:41.532614215Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "009853d9-cbc5-4526-912b-db32ec25de60",
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
  "id": "d14e91bd-be75-4874-a57d-2993e3fba1e6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:41.775820Z",
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
  "command_id": "b2cd6d09-535f-4726-924d-5ee41e58ac79",
  "quote_id": "d14e91bd-be75-4874-a57d-2993e3fba1e6",
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
    "phone": "+380678815307"
  }
}
```

```json
{
  "id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:04:42.029288Z",
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
    "id": "608d1909-348e-4427-a5c4-2e2a557d9477",
    "order_id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
    "expires_at": "2026-10-30T09:04:57.033675Z",
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

`POST /api/driver/v1/offers/608d1909-348e-4427-a5c4-2e2a557d9477/accept` → **200**

```json
{
  "command_id": "869d4976-7633-42d6-b59f-8513cb7e83e0"
}
```

```json
{
  "id": "b35a7652-a285-4930-bd50-bc3c9426bd45",
  "order_id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e69ef76b-c9a2-402a-9549-697e5f563bbb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e69ef76b-c9a2-402a-9549-697e5f563bbb",
  "order_id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
  "assignment_id": "b35a7652-a285-4930-bd50-bc3c9426bd45",
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
    "phone": "+380678815307"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2cbb82f-3596-4a34-a26a-06cb3f7ae823",
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
  "id": "f2eb843b-3aa3-477a-8075-e06eacd00e5f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:43.021571Z",
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
  "command_id": "274bb2c1-c9b8-4215-b244-5b2770338dda",
  "quote_id": "f2eb843b-3aa3-477a-8075-e06eacd00e5f",
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
  "id": "827a4d99-241a-4445-b3fa-fdf5484080a4",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:04:43.2744Z",
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
  "command_id": "ff8d8de3-3165-4f94-abc6-142159287c92",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T12:04:43Z"
}
```

```json
{
  "id": "e3ad1414-08fb-4053-9deb-ff7561ed019c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:43.528459Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:04:43Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "581c3bb3-2b99-4112-9b53-8972597f8cba",
  "quote_id": "e3ad1414-08fb-4053-9deb-ff7561ed019c",
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
  "pickup_at": "2026-10-30T12:04:43Z"
}
```

```json
{
  "id": "c9fa8e11-db47-47ec-b957-aa5070539010",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:04:43.777866Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:04:43Z",
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
  "command_id": "6d5e558b-be5a-452f-85d8-7841a9d11cfa",
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
  "id": "651648b8-96e7-42d9-9836-6a0a7be07ca7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:44.044187Z",
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
  "command_id": "e91ee53b-5b99-4d6d-afde-28c673919eb9",
  "quote_id": "651648b8-96e7-42d9-9836-6a0a7be07ca7",
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
  "correlation_id": "81dd785c-31ac-499d-999a-18a72e7ead16"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "c9fa8e11-db47-47ec-b957-aa5070539010",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T09:04:43.777866Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T12:04:43Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "827a4d99-241a-4445-b3fa-fdf5484080a4",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T09:04:43.2744Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "827a4d99-241a-4445-b3fa-fdf5484080a4",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:04:43.2744Z",
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

`GET /api/rider/v1/orders/fee7c860-56c3-4a1a-b440-ee1c497dd5a9` → **200**

```json
{
  "id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b35a7652-a285-4930-bd50-bc3c9426bd45",
    "order_id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e69ef76b-c9a2-402a-9549-697e5f563bbb",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T09:04:42.029288Z",
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
    "location_at": "2026-10-30T09:04:41.028496Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/fee7c860-56c3-4a1a-b440-ee1c497dd5a9/cancel` → **200**

```json
{
  "command_id": "748043ba-b6a9-414c-8c71-fe1b4f457ddb",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b35a7652-a285-4930-bd50-bc3c9426bd45",
    "order_id": "fee7c860-56c3-4a1a-b440-ee1c497dd5a9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e69ef76b-c9a2-402a-9549-697e5f563bbb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T09:04:42.029288Z",
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

`GET /api/rider/v1/orders/827a4d99-241a-4445-b3fa-fdf5484080a4` → **200**

```json
{
  "id": "827a4d99-241a-4445-b3fa-fdf5484080a4",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:04:43.2744Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/827a4d99-241a-4445-b3fa-fdf5484080a4/cancel` → **200**

```json
{
  "command_id": "59b932cf-bab9-414c-99b1-bfb224c45e8d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "827a4d99-241a-4445-b3fa-fdf5484080a4",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:04:43.2744Z",
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

`GET /api/rider/v1/orders/c9fa8e11-db47-47ec-b957-aa5070539010` → **200**

```json
{
  "id": "c9fa8e11-db47-47ec-b957-aa5070539010",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:04:43.777866Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:04:43Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c9fa8e11-db47-47ec-b957-aa5070539010/cancel` → **200**

```json
{
  "command_id": "7bb8dda4-b6f0-43b6-b77f-52e888ac4415",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c9fa8e11-db47-47ec-b957-aa5070539010",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a9ed61a6-eaeb-4213-8be3-f7ea4a648ef5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T09:04:43.777866Z",
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
  "pickup_at": "2026-10-30T12:04:43Z",
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
  "session_id": "6f85b0f3-92eb-4e80-b62e-c2819ba93a16",
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
  "last_heartbeat_at": "2026-10-30T09:04:41.028496Z",
  "last_location_at": "2026-10-30T09:04:41.028496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6f85b0f3-92eb-4e80-b62e-c2819ba93a16/close` → **200**

```json
{
  "command_id": "d5065c69-0cdb-4b50-ad19-0aaf6d690c51",
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

Done: orders fee7c860-56c3-4a1a-b440-ee1c497dd5a9, 827a4d99-241a-4445-b3fa-fdf5484080a4, c9fa8e11-db47-47ec-b957-aa5070539010.

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
  "session_id": "1809ec4f-4068-4455-ba29-fcf0f78cf722",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5ODcsImlhdCI6MTc5MzM1MTA4NywianRpIjoiMzQ5ZTViMzktZGE2Yy00ZjBkLWEwZjMtMjc0MTY2YTcwM2U3Iiwic2lkIjoiMTgwOWVjNGYtNDA2OC00NDU1LWJhMjktZmNmMGY3OGNmNzIyIn0.miHKq-rFt4kzIFZWQUscSL3VRsfn9Ni6L6_uXEgDBVA",
  "access_expires_at": "2026-10-30T09:19:47.406578146Z",
  "refresh_token": "mA0T_ox2pb_r3lp4NL4RFjFVIM1TBuf8zk6uI1VZrQc",
  "refresh_expires_at": "2026-10-30T21:04:47.406044044Z",
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
  "session_id": "5759869f-9d01-4040-b3eb-f6821bdff80d",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTE5ODcsImlhdCI6MTc5MzM1MTA4NywianRpIjoiY2ZjZTRmOWItYzllOS00NWUwLTgzMTItN2IzMWNmMjFkNmQ3Iiwic2lkIjoiNTc1OTg2OWYtOWQwMS00MDQwLWIzZWItZjY4MjFiZGZmODBkIn0.IAX59yngXZSIwjfDgyrOS0wBkgH9d07dyEakRKGsgqA",
  "access_expires_at": "2026-10-30T09:19:47.953495083Z",
  "refresh_token": "5YFUFPfZz75Z9Ro30l98mWWDIpxBcX7JnIjPKEqRbY0",
  "refresh_expires_at": "2026-10-30T21:04:47.952920791Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-574"
}
```

```json
{
  "challenge_id": "2f3fe84c-9e16-412b-ab28-25206b591159",
  "expires_at": "2026-10-30T09:09:48.204374143Z",
  "resend_available_at": "2026-10-30T09:04:49.204374143Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "572368",
  "sent_at": "2026-10-30T09:04:48.20699542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f3fe84c-9e16-412b-ab28-25206b591159",
  "code": "572368",
  "device_ref": "sandbox-574"
}
```

```json
{
  "session_id": "d7045511-0c8c-4edf-a1e2-1fcd44f9603b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTk4OCwiaWF0IjoxNzkzMzUxMDg4LCJqdGkiOiJiNGZlOTAwNS1mYjM2LTQ0MjAtOTRhYi1lMzMxOTE2MDYxNmQiLCJzaWQiOiJkNzA0NTUxMS0wYzhjLTRlZGYtYTFlMi0xZmNkNDRmOTYwM2IifQ.jgUEy1FiJDIn-ilpMzdLdPHrXC3KKJoByPNnjtVObkI",
  "access_expires_at": "2026-10-30T09:19:48.46878158Z",
  "refresh_token": "_Sa1J8vE_w5YU7YvG-HE4O_-WWVKWC4WL1vdshJh1HE",
  "refresh_expires_at": "2026-11-29T09:04:48.468267621Z",
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
  "command_id": "ab36b41a-77b7-411a-9e13-bcfa5e6f2061",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:48Z",
    "sequence": 1793351088931
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fd66da7-6457-4ce6-b688-0756056c6890",
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
  "last_heartbeat_at": "2026-10-30T09:04:48.947822Z",
  "last_location_at": "2026-10-30T09:04:48.947822Z",
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
  "command_id": "2bfdddb5-9366-4d88-9754-1393078129a6",
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
  "effective_at": "2026-10-30T09:04:49.441098Z",
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "3c5921be-dff9-4218-aea6-464468b5f646",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T09:02:19.939371Z",
  "last_entries": [
    {
      "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:02:19.939371Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "87d67a46-d4e6-4586-9939-038cf2e2a83c",
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
  "id": "d7c62d6f-6583-45d1-8ee0-c02d3ef2c2f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:49.928850Z",
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
  "command_id": "0e8fd76f-4765-4431-b8f6-dd346fc58e63",
  "quote_id": "d7c62d6f-6583-45d1-8ee0-c02d3ef2c2f8",
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
    "phone": "+3806711120190"
  }
}
```

```json
{
  "id": "957acf35-a2cd-465b-b413-4e4bc41d18b3",
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
  "created_at": "2026-10-30T09:04:50.188258Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120190"
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
    "id": "54cc28ad-b524-47ea-b003-efc9f5b0432e",
    "order_id": "957acf35-a2cd-465b-b413-4e4bc41d18b3",
    "expires_at": "2026-10-30T09:05:05.191517Z",
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

`POST /api/driver/v1/offers/54cc28ad-b524-47ea-b003-efc9f5b0432e/accept` → **200**

```json
{
  "command_id": "ed4d45b8-8e19-4f53-b188-04c15517fcda"
}
```

```json
{
  "id": "27d267bf-b736-4320-858a-2be91f618004",
  "order_id": "957acf35-a2cd-465b-b413-4e4bc41d18b3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "714132ad-fea0-40dd-930e-47e550fd2e86",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "714132ad-fea0-40dd-930e-47e550fd2e86",
  "order_id": "957acf35-a2cd-465b-b413-4e4bc41d18b3",
  "assignment_id": "27d267bf-b736-4320-858a-2be91f618004",
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
    "phone": "+3806711120190"
  }
}
```

`POST /api/driver/v1/work-sessions/2fd66da7-6457-4ce6-b688-0756056c6890/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:04:51Z",
    "sequence": 1793351091168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fd66da7-6457-4ce6-b688-0756056c6890",
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
  "last_heartbeat_at": "2026-10-30T09:04:51.184118Z",
  "last_location_at": "2026-10-30T09:04:51.184118Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/714132ad-fea0-40dd-930e-47e550fd2e86/arrive` → **200**

```json
{
  "command_id": "c57922a1-e22e-4967-8d85-4e556337baa3",
  "expected_version": 0
}
```

```json
{
  "id": "714132ad-fea0-40dd-930e-47e550fd2e86",
  "order_id": "957acf35-a2cd-465b-b413-4e4bc41d18b3",
  "assignment_id": "27d267bf-b736-4320-858a-2be91f618004",
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
  "arrived_at": "2026-10-30T09:04:51.43288Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711120190"
  }
}
```

`POST /api/driver/v1/trips/714132ad-fea0-40dd-930e-47e550fd2e86/start` → **200**

```json
{
  "command_id": "b148d2d9-08f1-41a1-8643-f9e2a768f7e2",
  "expected_version": 1
}
```

```json
{
  "id": "714132ad-fea0-40dd-930e-47e550fd2e86",
  "order_id": "957acf35-a2cd-465b-b413-4e4bc41d18b3",
  "assignment_id": "27d267bf-b736-4320-858a-2be91f618004",
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
  "arrived_at": "2026-10-30T09:04:51.43288Z",
  "started_at": "2026-10-30T09:04:51.677643Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711120190"
  }
}
```

`POST /api/driver/v1/trips/714132ad-fea0-40dd-930e-47e550fd2e86/complete` → **200**

```json
{
  "command_id": "cdb008c3-e9d0-4a3d-a3b7-e07cc9f6c424",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:04:51Z",
  "cash_received": true
}
```

```json
{
  "id": "714132ad-fea0-40dd-930e-47e550fd2e86",
  "order_id": "957acf35-a2cd-465b-b413-4e4bc41d18b3",
  "assignment_id": "27d267bf-b736-4320-858a-2be91f618004",
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
  "arrived_at": "2026-10-30T09:04:51.43288Z",
  "started_at": "2026-10-30T09:04:51.677643Z",
  "completed_at": "2026-10-30T09:04:51.936377Z",
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
  "command_id": "91330460-1761-4d70-b15d-9deb6d222e1f",
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
  "id": "8eb6446a-8c4e-4b30-a481-31e96c72b770",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:09:52.204184Z",
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
  "command_id": "d32b3d77-1a83-4a0b-9e85-3dc6ee6b49a0",
  "quote_id": "8eb6446a-8c4e-4b30-a481-31e96c72b770",
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
    "phone": "+3806711122291"
  }
}
```

```json
{
  "id": "4e29c326-aed7-49a7-94cc-ba637b70f659",
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
  "created_at": "2026-10-30T09:04:52.458776Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122291"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4e29c326-aed7-49a7-94cc-ba637b70f659` → **200**

```json
{
  "id": "4e29c326-aed7-49a7-94cc-ba637b70f659",
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
  "created_at": "2026-10-30T09:04:52.458776Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122291"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4e29c326-aed7-49a7-94cc-ba637b70f659/cancel` → **200**

```json
{
  "command_id": "3e8ba66f-decb-4c7c-8713-e788234542eb",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "4e29c326-aed7-49a7-94cc-ba637b70f659",
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
  "created_at": "2026-10-30T09:04:52.458776Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122291"
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
  "staff_id": "3c5921be-dff9-4218-aea6-464468b5f646",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T09:02:19.939371Z",
  "last_entries": [
    {
      "order_id": "4e29c326-aed7-49a7-94cc-ba637b70f659",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T09:04:52.961819Z"
    },
    {
      "order_id": "957acf35-a2cd-465b-b413-4e4bc41d18b3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T09:04:51.940313Z"
    },
    {
      "order_id": "003ec985-cf82-4725-8246-8d04a2758659",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T09:02:19.939371Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fd66da7-6457-4ce6-b688-0756056c6890",
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
  "last_heartbeat_at": "2026-10-30T09:04:51.184118Z",
  "last_location_at": "2026-10-30T09:04:51.184118Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2fd66da7-6457-4ce6-b688-0756056c6890/close` → **200**

```json
{
  "command_id": "f44b70ae-cadb-4e56-9206-d1b477ac17c6",
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

Done: operator bonus for fulfilled 957acf35-a2cd-465b-b413-4e4bc41d18b3 and operator-fault cancellation 4e29c326-aed7-49a7-94cc-ba637b70f659.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675169175",
  "device_ref": "sandbox-20817"
}
```

```json
{
  "challenge_id": "f25176cc-cc79-4aae-9d15-d709c7d1e859",
  "expires_at": "2026-10-30T09:09:57.164204293Z",
  "resend_available_at": "2026-10-30T09:04:58.164204293Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675169175` → **200**

```json
{
  "phone": "+380675169175",
  "audience": "CLIENT",
  "code": "038265",
  "sent_at": "2026-10-30T09:04:57.166606225Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671203494",
  "device_ref": "sandbox-23034",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "491c5cef-9001-40d8-874c-ff3c7acaf6c8",
  "expires_at": "2026-10-30T09:09:58.631345606Z",
  "resend_available_at": "2026-10-30T09:04:59.631345606Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671203494` → **200**

```json
{
  "phone": "+380671203494",
  "audience": "CLIENT",
  "code": "006903",
  "sent_at": "2026-10-30T09:04:58.633581701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671203494",
  "device_ref": "sandbox-29663",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d7804697-23b0-4dfb-ab66-49270ea5d216",
  "expires_at": "2026-10-30T09:10:00.110302867Z",
  "resend_available_at": "2026-10-30T09:05:01.110302867Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671203494` → **200**

```json
{
  "phone": "+380671203494",
  "audience": "CLIENT",
  "code": "886191",
  "sent_at": "2026-10-30T09:05:00.113507074Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675960000",
  "device_ref": "sandbox-31187"
}
```

```json
{
  "challenge_id": "939185e2-36da-48d5-8311-d083f59611a7",
  "expires_at": "2026-10-30T09:10:01.597400995Z",
  "resend_available_at": "2026-10-30T09:05:02.597400995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675960000",
  "device_ref": "sandbox-21864"
}
```

```json
{
  "challenge_id": "9ea35e73-2dbc-46db-8efb-7c215b512246",
  "expires_at": "2026-10-30T09:10:03.040311411Z",
  "resend_available_at": "2026-10-30T09:05:04.040311411Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675960000` → **200**

```json
{
  "phone": "+380675960000",
  "audience": "CLIENT",
  "code": "017399",
  "sent_at": "2026-10-30T09:05:03.04291505Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675960000",
  "device_ref": "sandbox-2677",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "052b5874-7538-4148-b8df-73156d19f677",
  "expires_at": "2026-10-30T09:10:04.517775502Z",
  "resend_available_at": "2026-10-30T09:05:05.517775502Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675960000` → **200**

```json
{
  "phone": "+380675960000",
  "audience": "CLIENT",
  "code": "292295",
  "sent_at": "2026-10-30T09:05:04.520276273Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675960000",
  "device_ref": "sandbox-14813",
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
  "correlation_id": "1b100588-49e3-4096-8cb1-9c336b332c9b",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000011406"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "8755e349-9377-4440-9ffd-d63d05d9ec35"
}
```

`GET /sandbox/v1/otp?phone=%2B442000011406` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120008220"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "3b904821-763c-48e2-b16c-61dee10e35e0"
}
```

`GET /sandbox/v1/otp?phone=%2B37120008220` → **404**

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
  "session_id": "abf602ae-4d40-4fed-8213-7f7aef3f8325",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwMDcsImlhdCI6MTc5MzM1MTEwNywianRpIjoiMDZmNTBlNTMtMDY1ZS00MDFjLWI4MDgtYjk5YzIzODJlYzU5Iiwic2lkIjoiYWJmNjAyYWUtNGQ0MC00ZmVkLTgyMTMtN2Y3YWVmM2Y4MzI1In0.uMp0oKo3DX7gId8ByNuPdkUgnBGW-aseL8wr4VPq6B4",
  "access_expires_at": "2026-10-30T09:20:07.069803328Z",
  "refresh_token": "8cNHvad2L4rryftbmWzRP5M4ee_aduzipXFh8g2JIlY",
  "refresh_expires_at": "2026-10-30T21:05:07.06927749Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675960000` → **200**

```json
{
  "deliveries": [
    {
      "id": "33209564-4a49-4c9d-9eda-6b92e8d9b37d",
      "challenge_id": "052b5874-7538-4148-b8df-73156d19f677",
      "phone": "+380675960000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ec41ac52-9630-4538-a8ec-f648dc53690e",
      "error": null,
      "attempted_at": "2026-10-30T09:05:04.520751Z"
    },
    {
      "id": "ef73566d-8699-4344-8961-b44d7cfcee3f",
      "challenge_id": "9ea35e73-2dbc-46db-8efb-7c215b512246",
      "phone": "+380675960000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ee7c3100-183e-4718-9d65-12f13498e1fc",
      "error": null,
      "attempted_at": "2026-10-30T09:05:03.043419Z"
    },
    {
      "id": "5f928deb-64e8-408a-8c27-989184750b24",
      "challenge_id": "939185e2-36da-48d5-8311-d083f59611a7",
      "phone": "+380675960000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T09:05:01.599882Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675960000` → **200**

```json
{
  "phone": "+380675960000",
  "audience": "CLIENT",
  "code": "292295",
  "sent_at": "2026-10-30T09:05:04.520276273Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671203494` → **200**

```json
{
  "deliveries": [
    {
      "id": "756a0651-4ac8-4cd7-acb2-73bfb9ff9857",
      "challenge_id": "d7804697-23b0-4dfb-ab66-49270ea5d216",
      "phone": "+380671203494",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a2f8b693-8186-4ad2-8247-30d910860999",
      "error": null,
      "attempted_at": "2026-10-30T09:05:00.113888Z"
    },
    {
      "id": "598abdce-357a-4ed5-8ad6-cb75ff34812c",
      "challenge_id": "491c5cef-9001-40d8-874c-ff3c7acaf6c8",
      "phone": "+380671203494",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c398783b-b40c-4a71-a90f-0403becc390d",
      "error": null,
      "attempted_at": "2026-10-30T09:04:58.633926Z"
    }
  ]
}
```

Done: SMS to +380675169175; SMS then a call to +380671203494; a failed SMS, two calls and a refused third to +380675960000; +44 and +371 refused.

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
  "session_id": "d9b3a7d8-281b-4a5c-8162-e5ad6279c9cd",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwMDgsImlhdCI6MTc5MzM1MTEwOCwianRpIjoiODNjMWM1NjUtYmEyMi00Njg3LThiYzUtMTE0MDA3NDk3ZThmIiwic2lkIjoiZDliM2E3ZDgtMjgxYi00YTVjLTgxNjItZTVhZDYyNzljOWNkIn0.nccgJFPVmhCvoRwTDLiVwxYXjVsH_ghBDd-fdjz7LM8",
  "access_expires_at": "2026-10-30T09:20:08.125956037Z",
  "refresh_token": "6oK8chkfaY_8TuVae3kL_I7wAvMonIk_jw7RwhME-5Y",
  "refresh_expires_at": "2026-10-30T21:05:08.125194641Z",
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
  "session_id": "c994b6be-08e1-49ca-bc6c-ad95dab3ad77",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwMDgsImlhdCI6MTc5MzM1MTEwOCwianRpIjoiNzMzNTg4YTEtMWE0Ni00ZDk5LWJlY2ItNjAyZWYyZTYzNDFhIiwic2lkIjoiYzk5NGI2YmUtMDhlMS00OWNhLWJjNmMtYWQ5NWRhYjNhZDc3In0.rdHatQ6z-EJmE6_yWV385ECYDSpEKBrRVi1Ph1dwpFA",
  "access_expires_at": "2026-10-30T09:20:08.657580587Z",
  "refresh_token": "9qKj_PVdnzCKMgG-lYLJJmFKwt-I41oAHMFJONlKQRg",
  "refresh_expires_at": "2026-10-30T21:05:08.657110511Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "3c5921be-dff9-4218-aea6-464468b5f646",
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
    "retention.manage",
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

`POST /api/admin/v1/staff-extensions/3c5921be-dff9-4218-aea6-464468b5f646` → **200**

```json
{
  "command_id": "84609c18-344d-4a49-aa2d-1882bbf77263",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "3c5921be-dff9-4218-aea6-464468b5f646",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "9174aa4f-4946-4e1e-8948-34fd4a8f3166",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:05:09.662161Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T09:05:09.662161Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ad82d45d-99fc-436f-9269-0d843fff7b51",
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
  "id": "bc863467-f005-40ee-9884-5806569f697a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:10:10.163933Z",
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
  "command_id": "6858bc8e-7f5e-4867-94bf-e25ab27c6f2c",
  "quote_id": "bc863467-f005-40ee-9884-5806569f697a",
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
    "phone": "+380672620985"
  }
}
```

```json
{
  "id": "67461d81-2543-499d-8f95-4375696c3e56",
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
  "created_at": "2026-10-30T09:05:10.421039Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672620985"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/67461d81-2543-499d-8f95-4375696c3e56/calls` → **201**

```json
{
  "command_id": "95634d27-6e21-4128-8d1a-7447b71923d6",
  "to": "CALLER"
}
```

```json
{
  "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "order_ids": [
    "67461d81-2543-499d-8f95-4375696c3e56"
  ],
  "started_at": "2026-10-30T09:05:10.699849Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/67461d81-2543-499d-8f95-4375696c3e56/calls` → **201**

```json
{
  "command_id": "95634d27-6e21-4128-8d1a-7447b71923d6",
  "to": "CALLER"
}
```

```json
{
  "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "order_ids": [
    "67461d81-2543-499d-8f95-4375696c3e56"
  ],
  "started_at": "2026-10-30T09:05:10.699849Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672620985",
    "at": "2026-10-30T09:05:10.702137003Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.26382",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=67461d81-2543-499d-8f95-4375696c3e56` → **200**

```json
{
  "calls": [
    {
      "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [
        "67461d81-2543-499d-8f95-4375696c3e56"
      ],
      "started_at": "2026-10-30T09:05:10.699849Z",
      "answered_at": "2026-10-30T09:05:11.249961Z",
      "ended_at": "2026-10-30T09:05:11.265489Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=67461d81-2543-499d-8f95-4375696c3e56` → **200**

```json
{
  "calls": [
    {
      "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [
        "67461d81-2543-499d-8f95-4375696c3e56"
      ],
      "started_at": "2026-10-30T09:05:10.699849Z",
      "answered_at": "2026-10-30T09:05:11.249961Z",
      "ended_at": "2026-10-30T09:05:11.265489Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=67461d81-2543-499d-8f95-4375696c3e56` → **200**

```json
{
  "calls": [
    {
      "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [
        "67461d81-2543-499d-8f95-4375696c3e56"
      ],
      "started_at": "2026-10-30T09:05:10.699849Z",
      "answered_at": "2026-10-30T09:05:11.249961Z",
      "ended_at": "2026-10-30T09:05:11.265489Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=67461d81-2543-499d-8f95-4375696c3e56` → **200**

```json
{
  "calls": [
    {
      "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [
        "67461d81-2543-499d-8f95-4375696c3e56"
      ],
      "started_at": "2026-10-30T09:05:10.699849Z",
      "answered_at": "2026-10-30T09:05:11.249961Z",
      "ended_at": "2026-10-30T09:05:11.265489Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=67461d81-2543-499d-8f95-4375696c3e56` → **200**

```json
{
  "calls": [
    {
      "id": "06aed641-f7f5-4732-a8f9-42bb7a0d73bc",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "order_ids": [
        "67461d81-2543-499d-8f95-4375696c3e56"
      ],
      "started_at": "2026-10-30T09:05:10.699849Z",
      "answered_at": "2026-10-30T09:05:11.249961Z",
      "ended_at": "2026-10-30T09:05:11.265489Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T09:05:19.584979Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/67461d81-2543-499d-8f95-4375696c3e56` → **200**

```json
{
  "id": "67461d81-2543-499d-8f95-4375696c3e56",
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
  "created_at": "2026-10-30T09:05:10.421039Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672620985"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/67461d81-2543-499d-8f95-4375696c3e56/cancel` → **200**

```json
{
  "command_id": "7eec756e-3d91-4047-a0b1-a545de1b45b5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "67461d81-2543-499d-8f95-4375696c3e56",
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
  "created_at": "2026-10-30T09:05:10.421039Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672620985"
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
  "command_id": "9361c0aa-c752-4b7b-a188-72653c0dd83c",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T09:05:21.07197Z",
  "extension": "101"
}
```

Done: outgoing call 06aed641-f7f5-4732-a8f9-42bb7a0d73bc from order 67461d81-2543-499d-8f95-4375696c3e56, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638437332",
  "device_ref": "sandbox-21233"
}
```

```json
{
  "challenge_id": "8bda1fce-2b4b-4993-a561-f284bc1961af",
  "expires_at": "2026-10-30T09:10:21.326630431Z",
  "resend_available_at": "2026-10-30T09:05:22.326630431Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638437332` → **200**

```json
{
  "phone": "+380638437332",
  "audience": "CLIENT",
  "code": "847516",
  "sent_at": "2026-10-30T09:05:21.329586447Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8bda1fce-2b4b-4993-a561-f284bc1961af",
  "code": "847516",
  "device_ref": "sandbox-21233"
}
```

```json
{
  "session_id": "2ea060e2-3806-403e-befe-29aaab17c485",
  "subject": {
    "type": "CLIENT",
    "id": "bd56e66b-481b-4258-b579-921f668e3cff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDU2ZTY2Yi00ODFiLTQyNTgtYjU3OS05MjFmNjY4ZTNjZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDIxLCJpYXQiOjE3OTMzNTExMjEsImp0aSI6ImMxZmVlZWFmLTE5NzktNGI2Yi1hODU1LWQ4YjkxOThhNmU4NiIsInNpZCI6IjJlYTA2MGUyLTM4MDYtNDAzZS1iZWZlLTI5YWFhYjE3YzQ4NSJ9.Ahq5Js8Hc_gjUqT21Jf2A6SOjTBr7ISuzzYP1Zp5TDI",
  "access_expires_at": "2026-10-30T09:20:21.592205466Z",
  "refresh_token": "Ltyks9NOZMg2DkFj8UADweXtTYYiaiZRxXS9j-styLM",
  "refresh_expires_at": "2026-11-29T09:05:21.591733048Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bd56e66b-481b-4258-b579-921f668e3cff",
  "session_id": "2ea060e2-3806-403e-befe-29aaab17c485",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638437332",
  "device_ref": "sandbox-3889"
}
```

```json
{
  "challenge_id": "342ef38b-c84c-4c44-8ddc-6e44bb15b2c8",
  "expires_at": "2026-10-30T09:10:24.064670331Z",
  "resend_available_at": "2026-10-30T09:05:25.064670331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638437332` → **200**

```json
{
  "phone": "+380638437332",
  "audience": "CLIENT",
  "code": "023070",
  "sent_at": "2026-10-30T09:05:24.066641816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "342ef38b-c84c-4c44-8ddc-6e44bb15b2c8",
  "code": "023070",
  "device_ref": "sandbox-3889"
}
```

```json
{
  "session_id": "0b6368dc-70ee-406c-8067-bb0bf2d4001d",
  "subject": {
    "type": "CLIENT",
    "id": "bd56e66b-481b-4258-b579-921f668e3cff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDU2ZTY2Yi00ODFiLTQyNTgtYjU3OS05MjFmNjY4ZTNjZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDI0LCJpYXQiOjE3OTMzNTExMjQsImp0aSI6IjA4MDU5ZjRjLThhNGUtNGMzMi05M2Q5LTQ3MjMxMGJiYmI4OSIsInNpZCI6IjBiNjM2OGRjLTcwZWUtNDA2Yy04MDY3LWJiMGJmMmQ0MDAxZCJ9.ZZAS6ADB9WYE_rjGf-PCITfCB_xOv7vS5AUetCLSN7E",
  "access_expires_at": "2026-10-30T09:20:24.320953016Z",
  "refresh_token": "H4LCEhmVuAxFgSs9Viob5Wr6ui4wUJRYseK5D1BLxmY",
  "refresh_expires_at": "2026-11-29T09:05:24.320518671Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "911dec92-b92c-41cc-88a5-13d40553195f",
  "expires_at": "2026-10-30T09:10:26.561005498Z",
  "resend_available_at": "2026-10-30T09:05:27.561005498Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638437332` → **200**

```json
{
  "phone": "+380638437332",
  "audience": "CLIENT",
  "code": "108767",
  "sent_at": "2026-10-30T09:05:26.56354561Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636942307"
}
```

```json
{
  "challenge_id": "4cb5e23e-830f-4af9-8a64-8a653d9bc0ba",
  "expires_at": "2026-10-30T09:10:26.817906642Z",
  "resend_available_at": "2026-10-30T09:05:27.817906642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636942307` → **200**

```json
{
  "phone": "+380636942307",
  "audience": "CLIENT",
  "code": "361829",
  "sent_at": "2026-10-30T09:05:26.819705603Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "b2eaffbc-701e-4278-b023-5c155490f2c6",
  "current_challenge_id": "911dec92-b92c-41cc-88a5-13d40553195f",
  "current_code": "000000",
  "new_challenge_id": "4cb5e23e-830f-4af9-8a64-8a653d9bc0ba",
  "new_code": "361829"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "a60d108d-a047-4d81-825d-648466b6b4fb"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "ad9b7eea-d06f-44b2-944a-71c73adbe768",
  "current_challenge_id": "911dec92-b92c-41cc-88a5-13d40553195f",
  "current_code": "108767",
  "new_challenge_id": "4cb5e23e-830f-4af9-8a64-8a653d9bc0ba",
  "new_code": "361829"
}
```

```json
{
  "subject_id": "bd56e66b-481b-4258-b579-921f668e3cff",
  "phone": "+380636942307",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bd56e66b-481b-4258-b579-921f668e3cff",
  "session_id": "2ea060e2-3806-403e-befe-29aaab17c485",
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
  "correlation_id": "4a85f50f-3fce-4bb5-89bf-b8e044ce622a"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636942307",
  "device_ref": "sandbox-21847"
}
```

```json
{
  "challenge_id": "4e023e5c-a640-477b-acf7-34cb49e8c187",
  "expires_at": "2026-10-30T09:10:30.023490913Z",
  "resend_available_at": "2026-10-30T09:05:31.023490913Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636942307` → **200**

```json
{
  "phone": "+380636942307",
  "audience": "CLIENT",
  "code": "253404",
  "sent_at": "2026-10-30T09:05:30.025916183Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4e023e5c-a640-477b-acf7-34cb49e8c187",
  "code": "253404",
  "device_ref": "sandbox-21847"
}
```

```json
{
  "session_id": "71cd696c-4bcf-4aed-a5c3-051f983b9d79",
  "subject": {
    "type": "CLIENT",
    "id": "bd56e66b-481b-4258-b579-921f668e3cff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDU2ZTY2Yi00ODFiLTQyNTgtYjU3OS05MjFmNjY4ZTNjZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDMwLCJpYXQiOjE3OTMzNTExMzAsImp0aSI6ImY5NzU1ODY0LTI2N2MtNGNhNC05YTM0LTY3MGY3NDFjM2Q1MiIsInNpZCI6IjcxY2Q2OTZjLTRiY2YtNGFlZC1hNWMzLTA1MWY5ODNiOWQ3OSJ9.9uaIkBYDkFr2GaWB8sW_fMmfknmsylfa9vgRmXQfuEk",
  "access_expires_at": "2026-10-30T09:20:30.288713271Z",
  "refresh_token": "v1x7n4wEO7hMYhOq2oJorENeozUB0ygCTawQxdu--To",
  "refresh_expires_at": "2026-11-29T09:05:30.288285153Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bd56e66b-481b-4258-b579-921f668e3cff",
  "session_id": "71cd696c-4bcf-4aed-a5c3-051f983b9d79",
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
  "session_id": "340e170f-fe73-454e-9980-607c2047b393",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwMzEsImlhdCI6MTc5MzM1MTEzMSwianRpIjoiNDk4NGZjNzgtMDA1NC00NmZlLWIyMDUtYTlmOWEwY2UxNDgwIiwic2lkIjoiMzQwZTE3MGYtZmU3My00NTRlLTk5ODAtNjA3YzIwNDdiMzkzIn0.vs_lSmykJbg9x7rTCOYHIFEIniQmXdqt15wJ2y4Dzps",
  "access_expires_at": "2026-10-30T09:20:31.029882657Z",
  "refresh_token": "rzLujpMrp9y-nyXyPx0TT1VpuIikLZfkoN2z8-0_fZg",
  "refresh_expires_at": "2026-10-30T21:05:31.029378767Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/bd56e66b-481b-4258-b579-921f668e3cff` → **200**

```json
{
  "client": {
    "id": "bd56e66b-481b-4258-b579-921f668e3cff",
    "phone": "+380636942307",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T09:05:21.590316Z",
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

`POST /api/admin/v1/clients/bd56e66b-481b-4258-b579-921f668e3cff/phone/new-code` → **201**

```json
{
  "phone": "+380632685876"
}
```

```json
{
  "challenge_id": "b3088b04-e59c-40a0-9dc2-a48a33e5e91e",
  "expires_at": "2026-10-30T09:10:31.543783665Z",
  "resend_available_at": "2026-10-30T09:05:32.543783665Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632685876` → **200**

```json
{
  "phone": "+380632685876",
  "audience": "CLIENT",
  "code": "828105",
  "sent_at": "2026-10-30T09:05:31.545402042Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/bd56e66b-481b-4258-b579-921f668e3cff/phone` → **422**

```json
{
  "command_id": "6a306f2a-2172-4cc9-85ef-5f135fcb33e0",
  "expected_version": 3,
  "new_challenge_id": "b3088b04-e59c-40a0-9dc2-a48a33e5e91e",
  "new_code": "828106",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/bd56e66b-481b-4258-b579-921f668e3cff/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "df2ed296-b0f4-46cc-8723-5f250e2d7d80"
}
```

`POST /api/admin/v1/clients/bd56e66b-481b-4258-b579-921f668e3cff/phone` → **400**

```json
{
  "command_id": "15553fc6-b8cd-415e-8580-e8eb9d314fdf",
  "expected_version": 3,
  "new_challenge_id": "b3088b04-e59c-40a0-9dc2-a48a33e5e91e",
  "new_code": "828105",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/bd56e66b-481b-4258-b579-921f668e3cff/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "64fea804-4e78-4f9d-b77d-73070d032552",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/bd56e66b-481b-4258-b579-921f668e3cff/phone` → **200**

```json
{
  "command_id": "763efd4c-97b7-4fc6-b97b-d492a238b27e",
  "expected_version": 3,
  "new_challenge_id": "b3088b04-e59c-40a0-9dc2-a48a33e5e91e",
  "new_code": "828105",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "bd56e66b-481b-4258-b579-921f668e3cff",
  "phone": "+380632685876",
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
  "correlation_id": "027629df-9edc-4c74-a259-b8dffec2883a"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632685876",
  "device_ref": "sandbox-31818"
}
```

```json
{
  "challenge_id": "9b2210b7-0dc1-4ba3-8dda-6cafb6f14e93",
  "expires_at": "2026-10-30T09:10:32.790567775Z",
  "resend_available_at": "2026-10-30T09:05:33.790567775Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632685876` → **200**

```json
{
  "phone": "+380632685876",
  "audience": "CLIENT",
  "code": "368757",
  "sent_at": "2026-10-30T09:05:32.793135221Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b2210b7-0dc1-4ba3-8dda-6cafb6f14e93",
  "code": "368757",
  "device_ref": "sandbox-31818"
}
```

```json
{
  "session_id": "a15f3e51-5951-4d70-bc72-9c0bcd865538",
  "subject": {
    "type": "CLIENT",
    "id": "bd56e66b-481b-4258-b579-921f668e3cff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDU2ZTY2Yi00ODFiLTQyNTgtYjU3OS05MjFmNjY4ZTNjZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDMzLCJpYXQiOjE3OTMzNTExMzMsImp0aSI6IjAzNWQ4NjkxLTZiYWUtNGVkZC1iZDRiLTZjMTBiMjUzZmM1ZCIsInNpZCI6ImExNWYzZTUxLTU5NTEtNGQ3MC1iYzcyLTljMGJjZDg2NTUzOCJ9.aDfYPT3nWGc1D4vSs5I1RwMV7y6CmKW7D7x1qgJ34xw",
  "access_expires_at": "2026-10-30T09:20:33.0536916Z",
  "refresh_token": "cHvr0TMSvRLzwLvm0zQj9qNX7TlZSdGv7t0vAppiw28",
  "refresh_expires_at": "2026-11-29T09:05:33.053054604Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bd56e66b-481b-4258-b579-921f668e3cff",
  "session_id": "a15f3e51-5951-4d70-bc72-9c0bcd865538",
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
  "phone": "+380639661907",
  "device_ref": "sandbox-6850"
}
```

```json
{
  "challenge_id": "5691ef65-45a1-4d1a-b23d-4ecb11f787cd",
  "expires_at": "2026-10-30T09:10:33.531798887Z",
  "resend_available_at": "2026-10-30T09:05:34.531798887Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639661907` → **200**

```json
{
  "phone": "+380639661907",
  "audience": "CLIENT",
  "code": "379598",
  "sent_at": "2026-10-30T09:05:33.534234035Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5691ef65-45a1-4d1a-b23d-4ecb11f787cd",
  "code": "379598",
  "device_ref": "sandbox-6850"
}
```

```json
{
  "session_id": "1bc4caca-1739-4921-acf4-fdd3d1b0b6fe",
  "subject": {
    "type": "CLIENT",
    "id": "ef1dc77f-d9c7-400c-bef3-ba254b6a520b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjFkYzc3Zi1kOWM3LTQwMGMtYmVmMy1iYTI1NGI2YTUyMGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDMzLCJpYXQiOjE3OTMzNTExMzMsImp0aSI6ImY2YmQ1ZDMyLWRlM2YtNDgzMy04NTNiLTE0MGI3MWY5NjFmZCIsInNpZCI6IjFiYzRjYWNhLTE3MzktNDkyMS1hY2Y0LWZkZDNkMWIwYjZmZSJ9.uxpOovWKWstGmk_U4jU1cKvXT2DlaC2npzA1HuW63Sc",
  "access_expires_at": "2026-10-30T09:20:33.798455672Z",
  "refresh_token": "O2LskI_G1r7jIqy10l2ZREUFiOy_jnXPUK5uAGioHd4",
  "refresh_expires_at": "2026-11-29T09:05:33.797934972Z",
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
  "session_id": "ee808f89-4bd0-4951-b602-516b15a40618",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwMzQsImlhdCI6MTc5MzM1MTEzNCwianRpIjoiYTI2ZDVkMWEtMzg1Ni00ODRlLTkxOTctOGY2ZDcyZDJhZTMyIiwic2lkIjoiZWU4MDhmODktNGJkMC00OTUxLWI2MDItNTE2YjE1YTQwNjE4In0.gxDf1yAF5mf9UIqn7u4N4owMXLdSVzVY6sCoSu-Ob2M",
  "access_expires_at": "2026-10-30T09:20:34.817593193Z",
  "refresh_token": "EdBRwaHhFSSgCIGNgI1_WQTkjXMhOKBbOavhgpGsVyc",
  "refresh_expires_at": "2026-10-30T21:05:34.817114603Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639661907` → **200**

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
  "correlation_id": "1e2cb1c9-2e44-4ca3-aabe-a53b4c0a7199"
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
  "session_id": "aff1615c-6f4c-4f66-b030-005b25de1edf",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwMzUsImlhdCI6MTc5MzM1MTEzNSwianRpIjoiOWM4MmZkZDUtZDcyNi00MjZkLWJlZTEtZWJjYzgzYzljNmEzIiwic2lkIjoiYWZmMTYxNWMtNmY0Yy00ZjY2LWIwMzAtMDA1YjI1ZGUxZWRmIn0.pVsE7zMf6j44mUYA0OA6i4Ufu7UMRhX5kZJSWPfhuSY",
  "access_expires_at": "2026-10-30T09:20:35.824028714Z",
  "refresh_token": "_xDtYwEItWh65__XYPgBqbHtF7ae_Bzt4p6sUdHDsbI",
  "refresh_expires_at": "2026-10-30T21:05:35.823367288Z",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T09:01:48.602341Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "5969ba38-3598-4ba7-9955-b568a2d554fa",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T09:05:36.313512466Z"
}
```

## The rider books the airport for 2026-10-30T12:05:35Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600007178",
  "device_ref": "sandbox-17971"
}
```

```json
{
  "challenge_id": "17bf787a-1ad4-4f99-b04a-8563c6f87376",
  "expires_at": "2026-10-30T09:10:36.567274932Z",
  "resend_available_at": "2026-10-30T09:05:37.567274932Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600007178` → **200**

```json
{
  "phone": "+48600007178",
  "audience": "CLIENT",
  "code": "526880",
  "sent_at": "2026-10-30T09:05:36.569359152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "17bf787a-1ad4-4f99-b04a-8563c6f87376",
  "code": "526880",
  "device_ref": "sandbox-17971"
}
```

```json
{
  "session_id": "6e692f63-88bd-4b15-9399-fbb4b30c90e1",
  "subject": {
    "type": "CLIENT",
    "id": "28f82dbb-4bfe-4472-b50f-7aa5d7e37770"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOGY4MmRiYi00YmZlLTQ0NzItYjUwZi03YWE1ZDdlMzc3NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDM2LCJpYXQiOjE3OTMzNTExMzYsImp0aSI6IjkxODhjZDg2LTZhMzctNDY2Yi1hZDgyLTA5Y2U0MTQzZjdjNCIsInNpZCI6IjZlNjkyZjYzLTg4YmQtNGIxNS05Mzk5LWZiYjRiMzBjOTBlMSJ9.SxrFQqM9GbWNEXKdYDLyi51ErZeLJ5H6Al4YRtvx5WE",
  "access_expires_at": "2026-10-30T09:20:36.828739848Z",
  "refresh_token": "ERHSskvtJjc1XMqSV1Qtdq36hKzdLvvvANG4s1wDaL0",
  "refresh_expires_at": "2026-11-29T09:05:36.828190657Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d5ceee19-461f-4dec-890c-5b7549c17527",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T12:05:35Z"
}
```

```json
{
  "id": "afad3926-6641-4f5e-b854-bdeea4b5f142",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:10:37.073553Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T12:05:35Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "334e1541-af61-4502-ba67-d703685ce74d",
  "quote_id": "afad3926-6641-4f5e-b854-bdeea4b5f142",
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
  "pickup_at": "2026-10-30T12:05:35Z"
}
```

```json
{
  "id": "2da2c191-cc5a-4742-8e26-7e4d088f03c5",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "28f82dbb-4bfe-4472-b50f-7aa5d7e37770",
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
  "created_at": "2026-10-30T09:05:37.330537Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T12:05:35Z",
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
  "device_ref": "sandbox-14869"
}
```

```json
{
  "challenge_id": "f1c4410b-dcf5-4259-817e-cd8df2761426",
  "expires_at": "2026-10-30T09:10:37.57941733Z",
  "resend_available_at": "2026-10-30T09:05:38.57941733Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "339014",
  "sent_at": "2026-10-30T09:05:37.58208808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1c4410b-dcf5-4259-817e-cd8df2761426",
  "code": "339014",
  "device_ref": "sandbox-14869"
}
```

```json
{
  "session_id": "f24817fc-0c17-47d3-a5a8-d8f6a3c0086b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjAzNywiaWF0IjoxNzkzMzUxMTM3LCJqdGkiOiJiZmQ4Yjg2Ni00MWVhLTQwYzYtYTFjMi1lNDdhY2E4MzNmZTUiLCJzaWQiOiJmMjQ4MTdmYy0wYzE3LTQ3ZDMtYTVhOC1kOGY2YTNjMDA4NmIifQ.jKkxCy5yJPIGX-nIyUYGYpXCgXxD-xtTxu_s-KetN64",
  "access_expires_at": "2026-10-30T09:20:37.841791036Z",
  "refresh_token": "YQn20tTSTK3joFKlwIUB_4OP7IYHAg2g0eubVQpnk4I",
  "refresh_expires_at": "2026-11-29T09:05:37.841244115Z",
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
  "command_id": "7474621e-62ef-4daa-99e2-2a9ce6bd22a2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:05:38Z",
    "sequence": 1793351138309
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f3d85d80-458a-447b-bb35-da22765860ee",
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
  "last_heartbeat_at": "2026-10-30T09:05:38.324052Z",
  "last_location_at": "2026-10-30T09:05:38.324052Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "2da2c191-cc5a-4742-8e26-7e4d088f03c5",
      "short_number": 24,
      "pickup_at": "2026-10-30T12:05:35Z",
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

`POST /api/driver/v1/preorders/2da2c191-cc5a-4742-8e26-7e4d088f03c5/reserve` → **200**

```json
{
  "command_id": "251ecc9b-174f-4720-af6c-4d6b42929ab3"
}
```

```json
{
  "id": "08498b57-a611-4129-b0ff-830ab7abe581",
  "state": "RESERVED",
  "order": {
    "order_id": "2da2c191-cc5a-4742-8e26-7e4d088f03c5",
    "short_number": 24,
    "pickup_at": "2026-10-30T12:05:35Z",
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
  "reserved_at": "2026-10-30T09:05:38.829317Z",
  "confirm_from": "2026-10-30T11:35:35Z",
  "confirm_until": "2026-10-30T11:45:35Z",
  "drop_until": "2026-10-30T11:05:35Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "08498b57-a611-4129-b0ff-830ab7abe581",
      "state": "RESERVED",
      "order": {
        "order_id": "2da2c191-cc5a-4742-8e26-7e4d088f03c5",
        "short_number": 24,
        "pickup_at": "2026-10-30T12:05:35Z",
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
      "reserved_at": "2026-10-30T09:05:38.829317Z",
      "confirm_from": "2026-10-30T11:35:35Z",
      "confirm_until": "2026-10-30T11:45:35Z",
      "drop_until": "2026-10-30T11:05:35Z"
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
      "id": "08498b57-a611-4129-b0ff-830ab7abe581",
      "state": "RESERVED",
      "order": {
        "order_id": "2da2c191-cc5a-4742-8e26-7e4d088f03c5",
        "short_number": 24,
        "pickup_at": "2026-10-30T12:05:35Z",
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
      "reserved_at": "2026-10-30T09:05:38.829317Z",
      "confirm_from": "2026-10-30T11:35:35Z",
      "confirm_until": "2026-10-30T11:45:35Z",
      "drop_until": "2026-10-30T11:05:35Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/08498b57-a611-4129-b0ff-830ab7abe581/confirm` → **409**

```json
{
  "command_id": "85e31667-f2c7-4f61-ac6f-3b92c05b61cb"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/08498b57-a611-4129-b0ff-830ab7abe581/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8c87fda1-1803-4038-86b9-2c3a84e8e5a0"
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
  "session_id": "6b464d84-dfd0-48e9-9118-295c90267590",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNDAsImlhdCI6MTc5MzM1MTE0MCwianRpIjoiYjk1ZjFhZTAtZWFjMi00ODFkLThiZTYtOGZhZmJlOGU4ZDhlIiwic2lkIjoiNmI0NjRkODQtZGZkMC00OGU5LTkxMTgtMjk1YzkwMjY3NTkwIn0.aCqaGNiTXbNoP20kXKLEW938sc-pFcB4Jd52qeM3UB0",
  "access_expires_at": "2026-10-30T09:20:40.077363208Z",
  "refresh_token": "Slng23eAqMBvcNm65Op6p8xoS6JrwZbY9fpXSZr4Ojs",
  "refresh_expires_at": "2026-10-30T21:05:40.076841703Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2da2c191-cc5a-4742-8e26-7e4d088f03c5` → **200**

```json
{
  "id": "2da2c191-cc5a-4742-8e26-7e4d088f03c5",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "28f82dbb-4bfe-4472-b50f-7aa5d7e37770",
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
  "created_at": "2026-10-30T09:05:37.330537Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T12:05:35Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "08498b57-a611-4129-b0ff-830ab7abe581",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T09:05:38.829317Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2da2c191-cc5a-4742-8e26-7e4d088f03c5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T09:05:37.331942Z",
      "actor": {
        "type": "CLIENT",
        "id": "28f82dbb-4bfe-4472-b50f-7aa5d7e37770",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "2da2c191-cc5a-4742-8e26-7e4d088f03c5",
        "preorder": true,
        "quote_id": "afad3926-6641-4f5e-b854-bdeea4b5f142",
        "pickup_at": "2026-10-30T12:05:35Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "abe47f69-af70-4c31-8eb1-29037ff21c2d"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T09:05:38.830212Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2da2c191-cc5a-4742-8e26-7e4d088f03c5",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "08498b57-a611-4129-b0ff-830ab7abe581"
      },
      "correlation_id": "ce36d6b5-8c7e-4852-bef9-c484c2e2bcb8"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 2da2c191-cc5a-4742-8e26-7e4d088f03c5, reservation 08498b57-a611-4129-b0ff-830ab7abe581.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25486"
}
```

```json
{
  "challenge_id": "a70b953b-368c-4926-8aec-9026de3d941d",
  "expires_at": "2026-10-30T09:10:40.820010964Z",
  "resend_available_at": "2026-10-30T09:05:41.820010964Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "637966",
  "sent_at": "2026-10-30T09:05:40.822823724Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a70b953b-368c-4926-8aec-9026de3d941d",
  "code": "637966",
  "device_ref": "sandbox-25486"
}
```

```json
{
  "session_id": "56dffea0-3f6c-4beb-88b6-2e4263617d3a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjA0MSwiaWF0IjoxNzkzMzUxMTQxLCJqdGkiOiJjZDk0YzRiNi1jODQ2LTQzNTItYmY4ZC1kNzM3YjQ2YWNjNjYiLCJzaWQiOiI1NmRmZmVhMC0zZjZjLTRiZWItODhiNi0yZTQyNjM2MTdkM2EifQ.WaDbxOPCvjNuz3OqePcOc0pPRtcwad3yU6gHZ1GYWzg",
  "access_expires_at": "2026-10-30T09:20:41.083687533Z",
  "refresh_token": "OIs1i8tdCgqNlCgJ2dnTsNYXQZBgwFsY83UM711pdKw",
  "refresh_expires_at": "2026-11-29T09:05:41.083231692Z",
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
  "command_id": "ac791c44-3b7a-406b-b10f-8dded54b72ca",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:05:41Z",
    "sequence": 1793351141554
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb",
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
  "last_heartbeat_at": "2026-10-30T09:05:41.569018Z",
  "last_location_at": "2026-10-30T09:05:41.569018Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670055637",
  "device_ref": "sandbox-1872"
}
```

```json
{
  "challenge_id": "1c1ecdf7-adaf-42f0-b865-ade1ca54bc91",
  "expires_at": "2026-10-30T09:10:41.804740875Z",
  "resend_available_at": "2026-10-30T09:05:42.804740875Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670055637` → **200**

```json
{
  "phone": "+380670055637",
  "audience": "CLIENT",
  "code": "449225",
  "sent_at": "2026-10-30T09:05:41.806955643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c1ecdf7-adaf-42f0-b865-ade1ca54bc91",
  "code": "449225",
  "device_ref": "sandbox-1872"
}
```

```json
{
  "session_id": "4f176cc4-fec8-4bfd-b25e-8acfa1e46ca1",
  "subject": {
    "type": "CLIENT",
    "id": "104c6b94-0edf-44cb-bc0a-76f9c571c5b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDRjNmI5NC0wZWRmLTQ0Y2ItYmMwYS03NmY5YzU3MWM1YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDQyLCJpYXQiOjE3OTMzNTExNDIsImp0aSI6IjBhN2RlNzk4LWFhYjgtNGRkZS04M2QwLWY1ZGU0YzQwZDQ4MCIsInNpZCI6IjRmMTc2Y2M0LWZlYzgtNGJmZC1iMjVlLThhY2ZhMWU0NmNhMSJ9.T7do9gbt6e1t1POj8g7waFHLmzuRwS00XYJ2qka6CMY",
  "access_expires_at": "2026-10-30T09:20:42.060160685Z",
  "refresh_token": "gPWIZAvqZpK2WUyZj3nmSCFcGNlUjZoSDO0fbcGRCIU",
  "refresh_expires_at": "2026-11-29T09:05:42.059665294Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "de8d3a09-b898-41a9-8b76-e4582dfe7f4e",
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
  "id": "e85b9bc3-87c1-4db3-b15d-f299ebfe9f0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:10:42.304452Z",
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
  "command_id": "3cd769c1-927c-45cb-a8cf-e6972d9de507",
  "quote_id": "e85b9bc3-87c1-4db3-b15d-f299ebfe9f0f",
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
  "id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "104c6b94-0edf-44cb-bc0a-76f9c571c5b8",
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
  "created_at": "2026-10-30T09:05:42.550547Z",
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
    "id": "2f33d812-b224-4167-b30f-4d34fc321d69",
    "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
    "expires_at": "2026-10-30T09:05:57.553469Z",
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

`POST /api/driver/v1/offers/2f33d812-b224-4167-b30f-4d34fc321d69/accept` → **200**

```json
{
  "command_id": "35f32eeb-2ba5-4e8d-b556-610cc3cb82c1"
}
```

```json
{
  "id": "c4d7d072-9c24-4c42-9a91-602269297f8d",
  "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2350b586-b7e1-4cbd-8c85-d95ee61b2ec5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2350b586-b7e1-4cbd-8c85-d95ee61b2ec5",
  "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "assignment_id": "c4d7d072-9c24-4c42-9a91-602269297f8d",
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

`POST /api/driver/v1/work-sessions/3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:05:43Z",
    "sequence": 1793351143510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb",
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
  "last_heartbeat_at": "2026-10-30T09:05:43.525187Z",
  "last_location_at": "2026-10-30T09:05:43.525187Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2350b586-b7e1-4cbd-8c85-d95ee61b2ec5",
  "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "assignment_id": "c4d7d072-9c24-4c42-9a91-602269297f8d",
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

`POST /api/driver/v1/trips/2350b586-b7e1-4cbd-8c85-d95ee61b2ec5/arrive` → **200**

```json
{
  "command_id": "3a6ec918-16c4-43e8-aabc-db1134691cde",
  "expected_version": 0
}
```

```json
{
  "id": "2350b586-b7e1-4cbd-8c85-d95ee61b2ec5",
  "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "assignment_id": "c4d7d072-9c24-4c42-9a91-602269297f8d",
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
  "arrived_at": "2026-10-30T09:05:44.001509Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2350b586-b7e1-4cbd-8c85-d95ee61b2ec5/start` → **200**

```json
{
  "command_id": "719f6e65-0500-42fc-bfb3-0df490cea4c9",
  "expected_version": 1
}
```

```json
{
  "id": "2350b586-b7e1-4cbd-8c85-d95ee61b2ec5",
  "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "assignment_id": "c4d7d072-9c24-4c42-9a91-602269297f8d",
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
  "arrived_at": "2026-10-30T09:05:44.001509Z",
  "started_at": "2026-10-30T09:05:44.247775Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:05:44Z",
    "sequence": 1793351144488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb",
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
  "last_heartbeat_at": "2026-10-30T09:05:44.503217Z",
  "last_location_at": "2026-10-30T09:05:44.503217Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/2350b586-b7e1-4cbd-8c85-d95ee61b2ec5/complete` → **200**

```json
{
  "command_id": "62a2beec-64b2-44e7-8fc7-c1f1c690b545",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:05:44Z",
  "cash_received": true
}
```

```json
{
  "id": "2350b586-b7e1-4cbd-8c85-d95ee61b2ec5",
  "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "assignment_id": "c4d7d072-9c24-4c42-9a91-602269297f8d",
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
  "arrived_at": "2026-10-30T09:05:44.001509Z",
  "started_at": "2026-10-30T09:05:44.247775Z",
  "completed_at": "2026-10-30T09:05:44.740201Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/5a09a14e-698d-4339-b1e6-b74f49b97110/rating` → **200**

```json
{
  "command_id": "6a422981-5046-4a02-bc05-0b23f1ee892a",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "score": 5,
  "created_at": "2026-10-30T09:05:45.004016144Z"
}
```

`POST /api/driver/v1/orders/5a09a14e-698d-4339-b1e6-b74f49b97110/rating` → **200**

```json
{
  "command_id": "acb406f2-48d4-427a-90a7-7203f2746cd6",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
  "score": 4,
  "created_at": "2026-10-30T09:05:45.249719513Z"
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
  "session_id": "cc325294-6fa7-4d38-971b-e9c2db6735dc",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNDYsImlhdCI6MTc5MzM1MTE0NiwianRpIjoiNzFlODI0YzYtNGYyZS00ZGJiLTk1YTMtZmQ2OTAxNGUwZTM2Iiwic2lkIjoiY2MzMjUyOTQtNmZhNy00ZDM4LTk3MWItZTljMmRiNjczNWRjIn0.gIT8J47Z3Q-vVYYOgW7C6FhiHctuiRyztWbj7JTXQE8",
  "access_expires_at": "2026-10-30T09:20:46.014599251Z",
  "refresh_token": "4XgKIASkxFbWf87HIFFNmhcWL1kpVwJn4SrFU_XmPBc",
  "refresh_expires_at": "2026-10-30T21:05:46.014127444Z",
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
  "session_id": "263d32d4-c809-4d1e-bbe8-80a98e22d521",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNDYsImlhdCI6MTc5MzM1MTE0NiwianRpIjoiMTJmYmU2MzYtNmZiMi00ZWMwLWEyZWMtZjRkYjAwZWNhZDI2Iiwic2lkIjoiMjYzZDMyZDQtYzgwOS00ZDFlLWJiZTgtODBhOThlMjJkNTIxIn0.Fjp-SqXK9KRmQxyG84endHumuTAfeMgvrQ1Y7pSEfAg",
  "access_expires_at": "2026-10-30T09:20:46.541987192Z",
  "refresh_token": "5yudV3sR2C-TRJzhBbo_KfMjzABslPg9XcidHwzt8F4",
  "refresh_expires_at": "2026-10-30T21:05:46.541528641Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5a09a14e-698d-4339-b1e6-b74f49b97110/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
      "author_type": "RIDER",
      "author_id": "104c6b94-0edf-44cb-bc0a-76f9c571c5b8",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T09:05:45.004016Z"
    },
    {
      "order_id": "5a09a14e-698d-4339-b1e6-b74f49b97110",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "104c6b94-0edf-44cb-bc0a-76f9c571c5b8",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T09:05:45.24972Z"
    }
  ]
}
```

Done: ratings for order 5a09a14e-698d-4339-b1e6-b74f49b97110.

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
  "session_id": "429f7f06-cafb-4cf4-8e48-a702844a8b4d",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNDcsImlhdCI6MTc5MzM1MTE0NywianRpIjoiZGZjZTQzYTItMDVkMi00ZjZmLTg3YzEtZTIyNjAzZWFiNzM2Iiwic2lkIjoiNDI5ZjdmMDYtY2FmYi00Y2Y0LThlNDgtYTcwMjg0NGE4YjRkIn0.q5oBlhQ8twO0IrXRGFjMzwiD4oTGIQScWOTLpdsP_SM",
  "access_expires_at": "2026-10-30T09:20:47.320170807Z",
  "refresh_token": "OfrlrMJ618vJSdT10oCrZhPjrC6VaI4BOAqQlZItn9I",
  "refresh_expires_at": "2026-10-30T21:05:47.319641151Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "893329a2-92be-45ff-b438-7de93550c516",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "0424e452-cbe1-40ac-937e-e8a26ae8cf69",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:05:47.566845Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0424e452-cbe1-40ac-937e-e8a26ae8cf69` → **200**

```json
{
  "id": "0424e452-cbe1-40ac-937e-e8a26ae8cf69",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:05:47.566845Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0424e452-cbe1-40ac-937e-e8a26ae8cf69` → **200**

```json
{
  "id": "0424e452-cbe1-40ac-937e-e8a26ae8cf69",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:05:47.566845Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/0424e452-cbe1-40ac-937e-e8a26ae8cf69` → **200**

```json
{
  "id": "0424e452-cbe1-40ac-937e-e8a26ae8cf69",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:05:47.566845Z",
  "ready_at": "2026-10-30T09:05:49.625888Z",
  "expires_at": "2026-10-31T09:05:49.625888Z"
}
```

`GET /api/admin/v1/reports/exports/0424e452-cbe1-40ac-937e-e8a26ae8cf69/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ab7293f1-0ce8-42a7-8c28-72047fba843d",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "cf049b18-faa0-4381-9b24-f2c12e36d84f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:05:50.56453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/cf049b18-faa0-4381-9b24-f2c12e36d84f` → **200**

```json
{
  "id": "cf049b18-faa0-4381-9b24-f2c12e36d84f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:05:50.56453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/cf049b18-faa0-4381-9b24-f2c12e36d84f` → **200**

```json
{
  "id": "cf049b18-faa0-4381-9b24-f2c12e36d84f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:05:50.56453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/cf049b18-faa0-4381-9b24-f2c12e36d84f` → **200**

```json
{
  "id": "cf049b18-faa0-4381-9b24-f2c12e36d84f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:05:50.56453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/cf049b18-faa0-4381-9b24-f2c12e36d84f` → **200**

```json
{
  "id": "cf049b18-faa0-4381-9b24-f2c12e36d84f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T09:05:50.56453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/cf049b18-faa0-4381-9b24-f2c12e36d84f` → **200**

```json
{
  "id": "cf049b18-faa0-4381-9b24-f2c12e36d84f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T09:05:50.56453Z",
  "ready_at": "2026-10-30T09:05:54.63436Z",
  "expires_at": "2026-10-31T09:05:54.63436Z"
}
```

`GET /api/admin/v1/reports/exports/cf049b18-faa0-4381-9b24-f2c12e36d84f/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/1af5a218-4165-4d7d-87e5-982c07402e3d` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/1af5a218-4165-4d7d-87e5-982c07402e3d",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "20c918bc-0e92-4c8a-b6ee-13c4782b0534"
}
```

Done: both reports were built in the background and downloaded.

# Scenario: retention

## Technical data retention

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "5794f42c-6517-4435-b0cd-9e3951bd9adc",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNTYsImlhdCI6MTc5MzM1MTE1NiwianRpIjoiYTg4MDJjZGYtN2E2OS00MzQ1LWE2YmItZjQzNzJmYTIzYzAwIiwic2lkIjoiNTc5NGY0MmMtNjUxNy00NDM1LWIwY2QtOWUzOTUxYmQ5YWRjIn0.uhh9CsSKGsdmW9Ce5UMNt9RJgmpOKx_YdTXZUmZNhPM",
  "access_expires_at": "2026-10-30T09:20:56.57696114Z",
  "refresh_token": "0mpmLyUFCdm-NVyZsbLuCaDx7GVoZs6BMzeYWgUIGyI",
  "refresh_expires_at": "2026-10-30T21:05:56.57647704Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "1ae90e23-c56f-47ed-a190-6e762286943c",
  "expected_version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Sandbox retention boundary"
}
```

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T09:05:57.099804082Z"
}
```

`POST /sandbox/v1/retention/fixtures/f0467079-2300-4a9a-8932-520ab37c27e1` → **200**

```json
{
  "old_done": 1,
  "recent_done": 1,
  "failed": 1
}
```

`POST /sandbox/v1/retention/run` → **200**

```json
{
  "sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "sign_in_codes": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "code_deliveries": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "delivered_events": {
    "deleted": 1,
    "failures": 0,
    "examined": 1
  },
  "consumer_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "command_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "upload_sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "quarantined_files": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "call_recordings": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  }
}
```

`GET /sandbox/v1/retention/fixtures/f0467079-2300-4a9a-8932-520ab37c27e1` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/f0467079-2300-4a9a-8932-520ab37c27e1` → **204**

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T09:05:57.099804Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "a4884946-a0dc-468e-9788-47ce4c6da7c1",
  "expected_version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Restore policy after retention sandbox"
}
```

```json
{
  "version": 2,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T09:05:57.683548991Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5296"
}
```

```json
{
  "challenge_id": "fac0076b-12c1-4f28-83cc-a6178af7ded4",
  "expires_at": "2026-10-30T09:10:57.927373478Z",
  "resend_available_at": "2026-10-30T09:05:58.927373478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "932456",
  "sent_at": "2026-10-30T09:05:57.929582739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fac0076b-12c1-4f28-83cc-a6178af7ded4",
  "code": "932456",
  "device_ref": "sandbox-5296"
}
```

```json
{
  "session_id": "d1d700ce-e258-4431-b22f-c343b154639a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjA1OCwiaWF0IjoxNzkzMzUxMTU4LCJqdGkiOiI0ZWI0MDZhMy1iZjg1LTRkMDEtYmU2YS1iYmYwYTI0ZDFhYjIiLCJzaWQiOiJkMWQ3MDBjZS1lMjU4LTQ0MzEtYjIyZi1jMzQzYjE1NDYzOWEifQ.VpTTR-jpKeNGyVT0MtjLth8E495AOx5titqkz2JXWNg",
  "access_expires_at": "2026-10-30T09:20:58.174636659Z",
  "refresh_token": "jP3VsnPF7eSXiok03YYK5FhJ3ElEKDn8BIBsqQ9vdYM",
  "refresh_expires_at": "2026-11-29T09:05:58.174012929Z",
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
  "command_id": "8f876580-9da1-42bf-b561-546ed1d68007",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:05:58Z",
    "sequence": 1793351158873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c8d050f6-0249-482e-873d-14c2486786a0",
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
  "last_heartbeat_at": "2026-10-30T09:05:58.890987Z",
  "last_location_at": "2026-10-30T09:05:58.890987Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "864a5f4a-d15b-486b-a738-281dc6ab648b",
  "points": [
    {
      "sequence": 1793351161134,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:05:01Z"
    },
    {
      "sequence": 1793351161140,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T09:06:01Z"
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
  "session_id": "bac30e8b-c531-4b5a-ac84-67b4ad0c11bd",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNjEsImlhdCI6MTc5MzM1MTE2MSwianRpIjoiODk5ODIyYzgtNjAyNy00MDhhLWE0MmUtOTU0ODliMjhjYWZkIiwic2lkIjoiYmFjMzBlOGItYzUzMS00YjVhLWFjODQtNjdiNGFkMGMxMWJkIn0.0fAaH3ZjZlx02wUkY8MIes4PGR2DjKI7ZezzeiWWGKg",
  "access_expires_at": "2026-10-30T09:21:01.696725275Z",
  "refresh_token": "i5RSVhv7qPQDoLMLfGTQ70M0tRiugNPnsg-WnFQMctU",
  "refresh_expires_at": "2026-10-30T21:06:01.696205762Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "fd5849b3-2997-497a-938e-0a570ee6acc9",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T09:06:01Z",
        "track_point_id": "0cb6ac6f-bc4b-4a4a-bad5-d03e9d91f97c",
        "work_session_id": "c8d050f6-0249-482e-873d-14c2486786a0"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T09:06:01Z",
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

`POST /api/admin/v1/driver-risk-flags/fd5849b3-2997-497a-938e-0a570ee6acc9/confirm` → **200**

```json
{
  "command_id": "d50229d9-d8aa-4dfe-9329-2ebc275da853",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "fd5849b3-2997-497a-938e-0a570ee6acc9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T09:06:01Z",
    "track_point_id": "0cb6ac6f-bc4b-4a4a-bad5-d03e9d91f97c",
    "work_session_id": "c8d050f6-0249-482e-873d-14c2486786a0"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T09:06:01Z",
  "reason": null,
  "reviewed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reviewed_at": "2026-10-30T09:06:02.450706Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/fd5849b3-2997-497a-938e-0a570ee6acc9/dismiss` → **409**

```json
{
  "command_id": "73e86d12-21f1-429d-8e8e-c7debd563736",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/fd5849b3-2997-497a-938e-0a570ee6acc9/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5386ed41-72a3-4df5-8484-2267388c7641"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "e4f86bed-40d8-4c62-ba08-472716b5fc74",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "bbcfc9ae-58ae-4261-bd55-6cbcc49794a7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "raised_at": "2026-10-30T09:06:02.950463Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/bbcfc9ae-58ae-4261-bd55-6cbcc49794a7/dismiss` → **200**

```json
{
  "command_id": "a5168d20-873a-412f-9899-8daf2d4afc7a",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "bbcfc9ae-58ae-4261-bd55-6cbcc49794a7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "raised_at": "2026-10-30T09:06:02.950463Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reviewed_at": "2026-10-30T09:06:03.195849Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c2f44f40-0917-4970-937b-3fda720690bb",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "fd5849b3-2997-497a-938e-0a570ee6acc9"
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
      "actor_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:06:03.451573Z"
    }
  ]
}
```

Done: flag fd5849b3-2997-497a-938e-0a570ee6acc9 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "65527fe6-1b85-478f-bebc-06d9533faa0d",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNjQsImlhdCI6MTc5MzM1MTE2NCwianRpIjoiOTVhMTBkMjktZTQ5ZC00ZjE1LWI0MmUtMDRiNjE2ZjczMTJkIiwic2lkIjoiNjU1MjdmZTYtMWI4NS00NzhmLWJlYmMtMDZkOTUzM2ZhYTBkIn0.8Fy76PL3nL14_Z75uiMP3Lig54w-xrR2b7O_wKkyvis",
  "access_expires_at": "2026-10-30T09:21:04.209823176Z",
  "refresh_token": "beWRAxou6GPznqPP980THe6d-yEBxRQw-YQYLyn89FQ",
  "refresh_expires_at": "2026-10-30T21:06:04.209363936Z",
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
      "actor_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:06:03.451573Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "b31d36cc-4d81-4319-8558-29b549604108",
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
  "session_id": "c8d050f6-0249-482e-873d-14c2486786a0",
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
  "last_heartbeat_at": "2026-10-30T09:05:58.890987Z",
  "last_location_at": "2026-10-30T09:05:58.890987Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c8d050f6-0249-482e-873d-14c2486786a0/close` → **200**

```json
{
  "command_id": "186bdcce-aedd-40ff-b053-dc7343317e2e",
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
  "session_id": "91e35351-408e-4356-81dc-e961683f838e",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNjUsImlhdCI6MTc5MzM1MTE2NSwianRpIjoiYWM4N2VmM2EtYzMxNy00MWYxLTljNDYtZGZjYmRjZTY3Y2QwIiwic2lkIjoiOTFlMzUzNTEtNDA4ZS00MzU2LTgxZGMtZTk2MTY4M2Y4MzhlIn0._TqHpTwIbiTkU_evVmv9q3FAzjmpmbmTsp1zgAS8TS0",
  "access_expires_at": "2026-10-30T09:21:05.751057922Z",
  "refresh_token": "rTEdGwQ3W1hFUKMCfMdFXLeE5K8_rrdQo66l-NiAYSg",
  "refresh_expires_at": "2026-10-30T21:06:05.750646239Z",
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
  "command_id": "d9315837-8070-4bbe-82cc-afb2b004677a",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:06:06.255698Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "d9315837-8070-4bbe-82cc-afb2b004677a",
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
  "changed_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T09:06:06.255698Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48912606964",
  "device_ref": "sandbox-29563"
}
```

```json
{
  "challenge_id": "efbf8266-9d63-4260-b7fa-6bc0b86b154b",
  "expires_at": "2026-10-30T09:11:06.768516499Z",
  "resend_available_at": "2026-10-30T09:06:07.768516499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48912606964` → **200**

```json
{
  "phone": "+48912606964",
  "audience": "CLIENT",
  "code": "090681",
  "sent_at": "2026-10-30T09:06:06.771304437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efbf8266-9d63-4260-b7fa-6bc0b86b154b",
  "code": "090681",
  "device_ref": "sandbox-29563"
}
```

```json
{
  "session_id": "a7dfb309-31c9-4fc0-84b1-e13603e894e5",
  "subject": {
    "type": "CLIENT",
    "id": "7c198876-fce0-4559-b841-1264c598f0bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzE5ODg3Ni1mY2UwLTQ1NTktYjg0MS0xMjY0YzU5OGYwYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDY3LCJpYXQiOjE3OTMzNTExNjcsImp0aSI6ImI4MzMyMTY5LTUxMjEtNGI1ZC05MTQ4LTBlZDI5NjM3ZjU2NiIsInNpZCI6ImE3ZGZiMzA5LTMxYzktNGZjMC04NGIxLWUxMzYwM2U4OTRlNSJ9.2yAP1jb1XQMu3Xs3VILjNuFpY3hVECMDf08qINRDELY",
  "access_expires_at": "2026-10-30T09:21:07.02680407Z",
  "refresh_token": "AnrJK4HuXDOmz3VOZF5Y4J-O8C0rPZyPhhgOaMLXAs0",
  "refresh_expires_at": "2026-11-29T09:06:07.026339575Z",
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
  "correlation_id": "71888d42-cdc3-485a-8264-09fb5e3fea83"
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
  "device_ref": "sandbox-22930"
}
```

```json
{
  "challenge_id": "04bffdd7-f577-4f23-b727-81b462b2b337",
  "expires_at": "2026-10-30T09:11:07.724884864Z",
  "resend_available_at": "2026-10-30T09:06:08.724884864Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "462778",
  "sent_at": "2026-10-30T09:06:07.727250205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04bffdd7-f577-4f23-b727-81b462b2b337",
  "code": "462778",
  "device_ref": "sandbox-22930"
}
```

```json
{
  "session_id": "f5bc6459-e790-43cd-af4d-44a21b6a4645",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjA2NywiaWF0IjoxNzkzMzUxMTY3LCJqdGkiOiIyMzY1YjFlNi03YTMyLTQyMzYtODEzYS02NTYyMjY5OGY2NWMiLCJzaWQiOiJmNWJjNjQ1OS1lNzkwLTQzY2QtYWY0ZC00NGEyMWI2YTQ2NDUifQ.IT6vBi-m_lJ0CmuaMbzW4nNLzvE-cE9SkRS3saahIf8",
  "access_expires_at": "2026-10-30T09:21:07.976306916Z",
  "refresh_token": "Tn6QA84I3xllEp8aUFlmyfZEHm0pH1ivtLVKw7Zd18Q",
  "refresh_expires_at": "2026-11-29T09:06:07.975711237Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f3d85d80-458a-447b-bb35-da22765860ee",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-30T09:05:38.324052Z",
  "last_location_at": "2026-10-30T09:05:38.324052Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f3d85d80-458a-447b-bb35-da22765860ee/handover` → **200**

```json
{
  "command_id": "8359cb0b-231b-4a34-ac79-3c5ba8010de1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f3d85d80-458a-447b-bb35-da22765860ee",
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
  "last_heartbeat_at": "2026-10-30T09:05:38.324052Z",
  "last_location_at": "2026-10-30T09:05:38.324052Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f3d85d80-458a-447b-bb35-da22765860ee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:06:08Z",
    "sequence": 1793351168678
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f3d85d80-458a-447b-bb35-da22765860ee",
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
  "last_heartbeat_at": "2026-10-30T09:06:08.694131Z",
  "last_location_at": "2026-10-30T09:06:08.694131Z",
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
  "session_id": "f3d85d80-458a-447b-bb35-da22765860ee",
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
  "last_heartbeat_at": "2026-10-30T09:06:08.694131Z",
  "last_location_at": "2026-10-30T09:06:08.694131Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3d85d80-458a-447b-bb35-da22765860ee/close` → **200**

```json
{
  "command_id": "20eddace-bd64-49c2-b404-6c68cfd8d216",
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
  "correlation_id": "dc9ee1b6-5a98-4c05-abb6-21c6aba6131d"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672101685",
  "device_ref": "sandbox-24385"
}
```

```json
{
  "challenge_id": "2f62a45f-359e-4e26-9810-64c9a4f75f30",
  "expires_at": "2026-10-30T09:11:09.886769563Z",
  "resend_available_at": "2026-10-30T09:06:10.886769563Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672101685` → **200**

```json
{
  "phone": "+380672101685",
  "audience": "CLIENT",
  "code": "075607",
  "sent_at": "2026-10-30T09:06:09.888871881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f62a45f-359e-4e26-9810-64c9a4f75f30",
  "code": "075607",
  "device_ref": "sandbox-24385"
}
```

```json
{
  "session_id": "ac11231c-c32d-4aaa-b6ac-5a2d90b0838b",
  "subject": {
    "type": "CLIENT",
    "id": "6f541790-6406-48d5-a226-15aacbc82ee7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjU0MTc5MC02NDA2LTQ4ZDUtYTIyNi0xNWFhY2JjODJlZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDcwLCJpYXQiOjE3OTMzNTExNzAsImp0aSI6IjhlNWNmNzJlLTdlODctNGNlNC04Y2QxLTE0YzQxMjA1MDdhMiIsInNpZCI6ImFjMTEyMzFjLWMzMmQtNGFhYS1iNmFjLTVhMmQ5MGIwODM4YiJ9.Jq_jrmoK87WigdYwqFK_S6JAOJPifgbsBQJUC_tx6XE",
  "access_expires_at": "2026-10-30T09:21:10.139613856Z",
  "refresh_token": "4vWUsTNgCzkAx3uzXlz51oOETiBS_fm0LKQhFssiF0g",
  "refresh_expires_at": "2026-11-29T09:06:10.139180915Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "87b810c6-530a-4d4c-992b-1761a8def21e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "87eca952-bdaa-4a5b-bda5-2bedb2880014",
  "upload_path": "/api/rider/v1/uploads/87eca952-bdaa-4a5b-bda5-2bedb2880014",
  "expires_at": "2026-10-30T09:21:10.405735505Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/87eca952-bdaa-4a5b-bda5-2bedb2880014` → **200**

```json
{
  "file_id": "87eca952-bdaa-4a5b-bda5-2bedb2880014",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "451533fc-1007-4b41-a50f-48207132c240",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "87eca952-bdaa-4a5b-bda5-2bedb2880014"
  ]
}
```

```json
{
  "id": "972cbbe6-22ab-40aa-aa20-04c7a75540ca",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6f541790-6406-48d5-a226-15aacbc82ee7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:06:10.67784Z",
  "updated_at": "2026-10-30T09:06:10.67784Z",
  "respond_by": "2026-10-30T13:06:10.67784Z",
  "messages": [
    {
      "id": "b6a74c01-537b-43c8-8dbe-27a31ea73162",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6f541790-6406-48d5-a226-15aacbc82ee7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:06:10.678751Z",
      "attachments": [
        {
          "file_id": "87eca952-bdaa-4a5b-bda5-2bedb2880014",
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
  "session_id": "935360e0-eb3a-4846-82e4-7148bb1c22d7",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNzEsImlhdCI6MTc5MzM1MTE3MSwianRpIjoiNjFiNzQ1MzEtMjdhNy00YzBiLTg3ZDctMjM2M2NhM2FjM2U3Iiwic2lkIjoiOTM1MzYwZTAtZWIzYS00ODQ2LTgyZTQtNzE0OGJiMWMyMmQ3In0.z7DgOtFZvej40irzRECazP2KdB_7T79Yxs26ptnAQOw",
  "access_expires_at": "2026-10-30T09:21:11.212357924Z",
  "refresh_token": "mGautaPG7cKLsbflR9idUv5MjO4xYEumDr1TmvP4rB0",
  "refresh_expires_at": "2026-10-30T21:06:11.211902302Z",
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
  "session_id": "4084b8f8-99f7-45db-972b-475d28f9fcbd",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNzEsImlhdCI6MTc5MzM1MTE3MSwianRpIjoiYjU5NjgyNDUtYTQyMi00MTg0LTgyYTktODI1ZTIxMzVmNTc5Iiwic2lkIjoiNDA4NGI4ZjgtOTlmNy00NWRiLTk3MmItNDc1ZDI4ZjlmY2JkIn0.fuG1F-zH4wL0AnnVXS6hUI3sC9rRqvivPQlL0Ts7NgY",
  "access_expires_at": "2026-10-30T09:21:11.727226403Z",
  "refresh_token": "NYSqCG7vShkX9tS4RicAKgF39bA2lIMMQp8BDmzSDKQ",
  "refresh_expires_at": "2026-10-30T21:06:11.726716368Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/972cbbe6-22ab-40aa-aa20-04c7a75540ca/attachments/87eca952-bdaa-4a5b-bda5-2bedb2880014` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "091e16d0-fdc1-4266-9a31-74cd744c07cd",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6504078a-f84a-4d88-8a2a-b042349f9866",
  "upload_path": "/api/operator/v1/uploads/6504078a-f84a-4d88-8a2a-b042349f9866",
  "expires_at": "2026-10-30T09:21:11.97949679Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/6504078a-f84a-4d88-8a2a-b042349f9866` → **200**

```json
{
  "file_id": "6504078a-f84a-4d88-8a2a-b042349f9866",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/972cbbe6-22ab-40aa-aa20-04c7a75540ca` → **200**

```json
{
  "id": "972cbbe6-22ab-40aa-aa20-04c7a75540ca",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6f541790-6406-48d5-a226-15aacbc82ee7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T09:06:10.67784Z",
  "updated_at": "2026-10-30T09:06:10.67784Z",
  "respond_by": "2026-10-30T13:06:10.67784Z",
  "messages": [
    {
      "id": "b6a74c01-537b-43c8-8dbe-27a31ea73162",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6f541790-6406-48d5-a226-15aacbc82ee7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:06:10.678751Z",
      "attachments": [
        {
          "file_id": "87eca952-bdaa-4a5b-bda5-2bedb2880014",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/972cbbe6-22ab-40aa-aa20-04c7a75540ca/comments` → **200**

```json
{
  "command_id": "25a7b2d5-80cd-4351-86fc-495c9402f6dc",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "6504078a-f84a-4d88-8a2a-b042349f9866"
  ]
}
```

```json
{
  "id": "972cbbe6-22ab-40aa-aa20-04c7a75540ca",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6f541790-6406-48d5-a226-15aacbc82ee7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:06:10.67784Z",
  "updated_at": "2026-10-30T09:06:12.496084Z",
  "respond_by": "2026-10-30T13:06:10.67784Z",
  "messages": [
    {
      "id": "b6a74c01-537b-43c8-8dbe-27a31ea73162",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6f541790-6406-48d5-a226-15aacbc82ee7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:06:10.678751Z",
      "attachments": [
        {
          "file_id": "87eca952-bdaa-4a5b-bda5-2bedb2880014",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8e7e332b-3ffb-4262-98d8-6b3b3ba91392",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:06:12.4955Z",
      "attachments": [
        {
          "file_id": "6504078a-f84a-4d88-8a2a-b042349f9866",
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

`GET /api/rider/v1/support/cases/972cbbe6-22ab-40aa-aa20-04c7a75540ca` → **200**

```json
{
  "id": "972cbbe6-22ab-40aa-aa20-04c7a75540ca",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6f541790-6406-48d5-a226-15aacbc82ee7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T09:06:10.67784Z",
  "updated_at": "2026-10-30T09:06:12.496084Z",
  "respond_by": "2026-10-30T13:06:10.67784Z",
  "messages": [
    {
      "id": "b6a74c01-537b-43c8-8dbe-27a31ea73162",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6f541790-6406-48d5-a226-15aacbc82ee7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T09:06:10.678751Z",
      "attachments": [
        {
          "file_id": "87eca952-bdaa-4a5b-bda5-2bedb2880014",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "8e7e332b-3ffb-4262-98d8-6b3b3ba91392",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T09:06:12.4955Z",
      "attachments": [
        {
          "file_id": "6504078a-f84a-4d88-8a2a-b042349f9866",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/972cbbe6-22ab-40aa-aa20-04c7a75540ca/attachments/6504078a-f84a-4d88-8a2a-b042349f9866` → **200**

Done: support case 972cbbe6-22ab-40aa-aa20-04c7a75540ca, rider attachment 87eca952-bdaa-4a5b-bda5-2bedb2880014, operator attachment 6504078a-f84a-4d88-8a2a-b042349f9866.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738036232",
  "device_ref": "sandbox-28777"
}
```

```json
{
  "challenge_id": "eeaea8cd-1277-4132-b6ef-7fbb1cabc2aa",
  "expires_at": "2026-10-30T09:11:13.026505459Z",
  "resend_available_at": "2026-10-30T09:06:14.026505459Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738036232` → **200**

```json
{
  "phone": "+380738036232",
  "audience": "CLIENT",
  "code": "099644",
  "sent_at": "2026-10-30T09:06:13.028722736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eeaea8cd-1277-4132-b6ef-7fbb1cabc2aa",
  "code": "099644",
  "device_ref": "sandbox-28777"
}
```

```json
{
  "session_id": "f0e47ec5-f56b-458a-8d7f-1866de6ff13d",
  "subject": {
    "type": "CLIENT",
    "id": "4e465787-a14e-402c-a9a0-e2feeb4bb853"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTQ2NTc4Ny1hMTRlLTQwMmMtYTlhMC1lMmZlZWI0YmI4NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDczLCJpYXQiOjE3OTMzNTExNzMsImp0aSI6ImUyNDM2Y2E5LTc3OTAtNDE3ZS05ZmFjLTI3NzY4NjNhZjFmNiIsInNpZCI6ImYwZTQ3ZWM1LWY1NmItNDU4YS04ZDdmLTE4NjZkZTZmZjEzZCJ9.E01IPHJpOaPHonboXZjKSiod4PnceFhYK4WNqHlGzdE",
  "access_expires_at": "2026-10-30T09:21:13.285871049Z",
  "refresh_token": "Yt-4ks--kyTXJibPcKT_ucEfBkpwXpe04V__4MpRhWs",
  "refresh_expires_at": "2026-11-29T09:06:13.285437894Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ec385179-41ee-4632-b1d8-c0acfa68f6d5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e49eb59f-af03-4876-9eb7-e09959b0a933",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e49eb59f-af03-4876-9eb7-e09959b0a933",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d9117bc61d85a23055b7c018443c01b4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e49eb59f-af03-4876-9eb7-e09959b0a933",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738036232"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e49eb59f-af03-4876-9eb7-e09959b0a933",
  "expires_at": "2026-10-30T09:36:13.524482Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/e49eb59f-af03-4876-9eb7-e09959b0a933` → **200**

```json
{
  "id": "e49eb59f-af03-4876-9eb7-e09959b0a933",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:36:13.524482Z",
  "card": {
    "id": "e3acb5f2-9bab-41e8-8c2a-8bcdec023d56",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9319",
    "card_type": "Visa",
    "created_at": "2026-10-30T09:06:13.769207Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8733451f-ad67-4a4d-ba1b-d173ad545aa9",
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
  "id": "10e89842-54a2-4575-8481-2bdb5cc79848",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:11:14.023960Z",
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
  "command_id": "2f2aa17f-a5fc-43bb-bbee-2c7135b775e5",
  "quote_id": "10e89842-54a2-4575-8481-2bdb5cc79848",
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
  "id": "0615db0e-dd78-44e1-9e11-751cbdfaf05d",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4e465787-a14e-402c-a9a0-e2feeb4bb853",
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
  "created_at": "2026-10-30T09:06:14.273695Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0615db0e-dd78-44e1-9e11-751cbdfaf05d` → **200**

```json
{
  "id": "0615db0e-dd78-44e1-9e11-751cbdfaf05d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4e465787-a14e-402c-a9a0-e2feeb4bb853",
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
  "created_at": "2026-10-30T09:06:14.273695Z",
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

`GET /api/rider/v1/orders/0615db0e-dd78-44e1-9e11-751cbdfaf05d` → **200**

```json
{
  "id": "0615db0e-dd78-44e1-9e11-751cbdfaf05d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4e465787-a14e-402c-a9a0-e2feeb4bb853",
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
  "created_at": "2026-10-30T09:06:14.273695Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0615db0e-dd78-44e1-9e11-751cbdfaf05d/switch-to-cash` → **200**

```json
{
  "command_id": "6997b35f-34f9-4d6c-9718-28cb877b47c6",
  "expected_version": 3
}
```

```json
{
  "id": "0615db0e-dd78-44e1-9e11-751cbdfaf05d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4e465787-a14e-402c-a9a0-e2feeb4bb853",
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
  "created_at": "2026-10-30T09:06:14.273695Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0615db0e-dd78-44e1-9e11-751cbdfaf05d/switch-to-cash` → **409**

```json
{
  "command_id": "47a17b33-59c4-4c6f-b874-b35289e5f723",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/0615db0e-dd78-44e1-9e11-751cbdfaf05d/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "38a13ed8-ad3e-4621-b845-00609f3dda97"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/0615db0e-dd78-44e1-9e11-751cbdfaf05d` → **200**

```json
{
  "id": "0615db0e-dd78-44e1-9e11-751cbdfaf05d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4e465787-a14e-402c-a9a0-e2feeb4bb853",
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
  "created_at": "2026-10-30T09:06:14.273695Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0615db0e-dd78-44e1-9e11-751cbdfaf05d/cancel` → **200**

```json
{
  "command_id": "662e4e28-8fe5-49d0-9e63-0dfa1e78d268",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0615db0e-dd78-44e1-9e11-751cbdfaf05d",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4e465787-a14e-402c-a9a0-e2feeb4bb853",
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
  "created_at": "2026-10-30T09:06:14.273695Z",
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
  "session_id": "9185b432-d970-4887-ab3f-db969acc8dfb",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNzYsImlhdCI6MTc5MzM1MTE3NiwianRpIjoiZTE2OTg1ZWItOTE5Zi00MmNhLTljYmYtMjM2M2FlZWYzN2FiIiwic2lkIjoiOTE4NWI0MzItZDk3MC00ODg3LWFiM2YtZGI5NjlhY2M4ZGZiIn0.a5pMEee1XZndc5Bmer62pqL37Pj3wr0D4w94Utlly5M",
  "access_expires_at": "2026-10-30T09:21:16.34758614Z",
  "refresh_token": "Akf6LwlWq_tZ3Y9_QgZcV0ZGeN1PmGiAiYpgSYAOTVk",
  "refresh_expires_at": "2026-10-30T21:06:16.347119541Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31545"
}
```

```json
{
  "challenge_id": "947659b0-5bdd-4ca7-bdb4-068e9cbce438",
  "expires_at": "2026-10-30T09:11:16.578273305Z",
  "resend_available_at": "2026-10-30T09:06:17.578273305Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "856367",
  "sent_at": "2026-10-30T09:06:16.580613887Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "947659b0-5bdd-4ca7-bdb4-068e9cbce438",
  "code": "856367",
  "device_ref": "sandbox-31545"
}
```

```json
{
  "session_id": "63da6b35-77fb-4381-b914-8f390e3c73f2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjA3NiwiaWF0IjoxNzkzMzUxMTc2LCJqdGkiOiJhYjdiOWEzYy02MDFkLTRjZDktOTkxZi01MjViY2FlZTc2ZjQiLCJzaWQiOiI2M2RhNmIzNS03N2ZiLTQzODEtYjkxNC04ZjM5MGUzYzczZjIifQ.VzyzRfsi1DWiORyy-QFW_M6c-zkFqGUUCnY99EVrzmk",
  "access_expires_at": "2026-10-30T09:21:16.83414493Z",
  "refresh_token": "B5BuVjy6cQK3k3EAnM8XziHrkgzm1S05ezekzuEhvA8",
  "refresh_expires_at": "2026-11-29T09:06:16.833463304Z",
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
      "actor_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T09:06:03.451573Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "3c5921be-dff9-4218-aea6-464468b5f646",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T09:06:04.705765Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "4d34b20f-cafb-4c20-92aa-e41cc55fa563",
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
  "device_ref": "sandbox-24958"
}
```

```json
{
  "challenge_id": "1d497012-d7ac-4f69-9b47-ed5b62ef7097",
  "expires_at": "2026-10-30T09:11:17.799846641Z",
  "resend_available_at": "2026-10-30T09:06:18.799846641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "588756",
  "sent_at": "2026-10-30T09:06:17.802183042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d497012-d7ac-4f69-9b47-ed5b62ef7097",
  "code": "588756",
  "device_ref": "sandbox-24958"
}
```

```json
{
  "session_id": "b79dbc8a-c1b5-41a7-990e-fd0a38ec6c26",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjA3OCwiaWF0IjoxNzkzMzUxMTc4LCJqdGkiOiIzMmNiNTg5YS1kNGY4LTRmNzgtOTFlYS1kY2RlNzZlY2FkODAiLCJzaWQiOiJiNzlkYmM4YS1jMWI1LTQxYTctOTkwZS1mZDBhMzhlYzZjMjYifQ.Obw8oNeoY1tpCfutDjiZ7xQ7KUdzN66W7dJXxhqIfXw",
  "access_expires_at": "2026-10-30T09:21:18.051684195Z",
  "refresh_token": "5uD9xW_iz0RfgpyxGkH2wbV_YO9VgljcJcwGMrcc4hM",
  "refresh_expires_at": "2026-11-29T09:06:18.051235437Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb",
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
  "last_heartbeat_at": "2026-10-30T09:05:44.503217Z",
  "last_location_at": "2026-10-30T09:05:44.503217Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb/handover` → **200**

```json
{
  "command_id": "d9e4f857-d868-4164-8651-2aa1fec1748a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb",
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
  "last_heartbeat_at": "2026-10-30T09:05:44.503217Z",
  "last_location_at": "2026-10-30T09:05:44.503217Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:06:18Z",
    "sequence": 1793351178755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb",
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
  "last_heartbeat_at": "2026-10-30T09:06:18.769987Z",
  "last_location_at": "2026-10-30T09:06:18.769987Z",
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
  "command_id": "c59b9f3c-775f-4854-ade9-d20cca0936e4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:06:19Z",
    "sequence": 1793351179238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "46fcfc39-4694-4072-b65f-0b7c8be38c1b",
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
  "last_heartbeat_at": "2026-10-30T09:06:19.252848Z",
  "last_location_at": "2026-10-30T09:06:19.252848Z",
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
  "session_id": "158d1fa2-65a9-4ae1-8795-1cd452e2e4de",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIwNzksImlhdCI6MTc5MzM1MTE3OSwianRpIjoiODVlZDY5Y2EtZjg0MS00ZTg3LWFlOGYtMTYwNjlhZTY3ZTVmIiwic2lkIjoiMTU4ZDFmYTItNjVhOS00YWUxLTg3OTUtMWNkNDUyZTJlNGRlIn0.n60NtP9CVf8FAOE-ZlF-hVQhUQpEAzcq51AVXLYb11U",
  "access_expires_at": "2026-10-30T09:21:19.770729409Z",
  "refresh_token": "KE52pDHQl-sQGzNHq9L5-CvoOY64k4bmtoKN-TRB_WY",
  "refresh_expires_at": "2026-10-30T21:06:19.770178187Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "da75fe75-0755-48bb-b80c-1dc5380d72f6",
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
  "id": "7e8b0d45-6b74-4a68-a7c0-6e0a7235db9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:11:20.018460Z",
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
  "command_id": "df6c5b99-ce74-48d8-8eb6-48572a09cb7c",
  "quote_id": "7e8b0d45-6b74-4a68-a7c0-6e0a7235db9b",
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
  "id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
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
  "created_at": "2026-10-30T09:06:20.266907Z",
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
    "id": "3982ccff-180c-467d-a26a-a601898c0ebe",
    "order_id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
    "expires_at": "2026-10-30T09:06:35.269834Z",
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

`POST /api/driver/v1/offers/3982ccff-180c-467d-a26a-a601898c0ebe/accept` → **200**

```json
{
  "command_id": "86b47044-1ae6-499c-baca-36f30a93efab"
}
```

```json
{
  "id": "124f6f7c-20fb-4c2f-8356-6d3003370ea6",
  "order_id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5b0552d2-29cb-45e8-92e8-4a22d1527d8b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5b0552d2-29cb-45e8-92e8-4a22d1527d8b",
  "order_id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
  "assignment_id": "124f6f7c-20fb-4c2f-8356-6d3003370ea6",
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

`POST /api/driver/v1/work-sessions/46fcfc39-4694-4072-b65f-0b7c8be38c1b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T09:06:21Z",
    "sequence": 1793351181465
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "46fcfc39-4694-4072-b65f-0b7c8be38c1b",
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
  "last_heartbeat_at": "2026-10-30T09:06:21.480654Z",
  "last_location_at": "2026-10-30T09:06:21.480654Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5b0552d2-29cb-45e8-92e8-4a22d1527d8b/arrive` → **200**

```json
{
  "command_id": "cf05c625-614f-4e18-ab25-3b055f616fc2",
  "expected_version": 0
}
```

```json
{
  "id": "5b0552d2-29cb-45e8-92e8-4a22d1527d8b",
  "order_id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
  "assignment_id": "124f6f7c-20fb-4c2f-8356-6d3003370ea6",
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
  "arrived_at": "2026-10-30T09:06:21.724737Z",
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

`POST /api/driver/v1/trips/5b0552d2-29cb-45e8-92e8-4a22d1527d8b/start` → **200**

```json
{
  "command_id": "ab751d5e-06b4-442b-ba28-2b4b645af5a9",
  "expected_version": 1
}
```

```json
{
  "id": "5b0552d2-29cb-45e8-92e8-4a22d1527d8b",
  "order_id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
  "assignment_id": "124f6f7c-20fb-4c2f-8356-6d3003370ea6",
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
  "arrived_at": "2026-10-30T09:06:21.724737Z",
  "started_at": "2026-10-30T09:06:21.969249Z",
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

`POST /api/driver/v1/trips/5b0552d2-29cb-45e8-92e8-4a22d1527d8b/complete` → **200**

```json
{
  "command_id": "4f80238d-5216-4121-84aa-50d201954081",
  "expected_version": 2,
  "reported_at": "2026-10-30T09:06:22Z",
  "cash_received": true
}
```

```json
{
  "id": "5b0552d2-29cb-45e8-92e8-4a22d1527d8b",
  "order_id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
  "assignment_id": "124f6f7c-20fb-4c2f-8356-6d3003370ea6",
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
  "arrived_at": "2026-10-30T09:06:21.724737Z",
  "started_at": "2026-10-30T09:06:21.969249Z",
  "completed_at": "2026-10-30T09:06:22.225286Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/76842f26-0b06-417e-97bb-23e56a0fb9f9` → **200**

```json
{
  "id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
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
    "id": "124f6f7c-20fb-4c2f-8356-6d3003370ea6",
    "order_id": "76842f26-0b06-417e-97bb-23e56a0fb9f9",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5b0552d2-29cb-45e8-92e8-4a22d1527d8b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T09:06:20.266907Z",
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
  "session_id": "3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb",
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
  "last_heartbeat_at": "2026-10-30T09:06:18.769987Z",
  "last_location_at": "2026-10-30T09:06:18.769987Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d2895a2-29cf-4ab5-a6d5-ff1973da4cdb/close` → **200**

```json
{
  "command_id": "2bfa4fff-382d-4039-a82b-5fedf47c6370",
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
  "session_id": "46fcfc39-4694-4072-b65f-0b7c8be38c1b",
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
  "last_heartbeat_at": "2026-10-30T09:06:21.480654Z",
  "last_location_at": "2026-10-30T09:06:21.480654Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/46fcfc39-4694-4072-b65f-0b7c8be38c1b/close` → **200**

```json
{
  "command_id": "2bb9c236-fe8d-47f2-a5d3-ae515d1f0ee7",
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

Done: terminal order 76842f26-0b06-417e-97bb-23e56a0fb9f9 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31450"
}
```

```json
{
  "challenge_id": "2eed2e47-0e8d-4677-b229-e23a606e256a",
  "expires_at": "2026-10-30T09:11:26.91274681Z",
  "resend_available_at": "2026-10-30T09:06:27.91274681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "475621",
  "sent_at": "2026-10-30T09:06:26.914956405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2eed2e47-0e8d-4677-b229-e23a606e256a",
  "code": "475621",
  "device_ref": "sandbox-31450"
}
```

```json
{
  "session_id": "61fa0410-04af-419e-a332-a7070bc58fd5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjA4NywiaWF0IjoxNzkzMzUxMTg3LCJqdGkiOiJjOWFhZDRhZi01YWMwLTQ0ZmMtOTllOS0xN2Q5ZGZiZTExODQiLCJzaWQiOiI2MWZhMDQxMC0wNGFmLTQxOWUtYTMzMi1hNzA3MGJjNThmZDUifQ.rpaVm2FzZqgDy6LKLKegoOh1UOLzRtRQK8rZXb86hBE",
  "access_expires_at": "2026-10-30T09:21:27.170596921Z",
  "refresh_token": "geM69irH-KNlyTX_xgHZND3TxKJBHWqksn36SlykF-A",
  "refresh_expires_at": "2026-11-29T09:06:27.170143767Z",
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
  "device_ref": "sandbox-14865"
}
```

```json
{
  "challenge_id": "25e435cc-73a1-4a63-baf5-bd877bb5c60a",
  "expires_at": "2026-10-30T09:11:27.642929635Z",
  "resend_available_at": "2026-10-30T09:06:28.642929635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "536152",
  "sent_at": "2026-10-30T09:06:27.645404177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25e435cc-73a1-4a63-baf5-bd877bb5c60a",
  "code": "536152",
  "device_ref": "sandbox-14865"
}
```

```json
{
  "session_id": "8a828b11-434b-40e5-9cc3-94cb2af1450f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjA4NywiaWF0IjoxNzkzMzUxMTg3LCJqdGkiOiI2MmRlYjI1NC1hZjIwLTQwMGItYmM1ZS0zMTFkYWQ4ZGY2MmQiLCJzaWQiOiI4YTgyOGIxMS00MzRiLTQwZTUtOWNjMy05NGNiMmFmMTQ1MGYifQ.XjqJmSSSJ2YW3qWBvyc5sKlIhS5T-f0xWlbuS1g-zrI",
  "access_expires_at": "2026-10-30T09:21:27.899365662Z",
  "refresh_token": "A3DmTefemNsdS5m6hnwYIo8js3WMvIpI8F34soQdZ08",
  "refresh_expires_at": "2026-11-29T09:06:27.898956866Z",
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
  "device_ref": "sandbox-14519"
}
```

```json
{
  "challenge_id": "efbe12b5-c2c6-4fa2-911d-73cbcd4462d9",
  "expires_at": "2026-10-30T09:11:28.368929158Z",
  "resend_available_at": "2026-10-30T09:06:29.368929158Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "017669",
  "sent_at": "2026-10-30T09:06:28.371310528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efbe12b5-c2c6-4fa2-911d-73cbcd4462d9",
  "code": "017669",
  "device_ref": "sandbox-14519"
}
```

```json
{
  "session_id": "bc957d89-8b8c-4d90-b9a7-d22f0d24acfe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MjA4OCwiaWF0IjoxNzkzMzUxMTg4LCJqdGkiOiIzYTYyMjExNy00NTI2LTRjZDctOGYyMy1mNmE4MWI4YTQ0N2UiLCJzaWQiOiJiYzk1N2Q4OS04YjhjLTRkOTAtYjlhNy1kMjJmMGQyNGFjZmUifQ.9LW9__UvnxdHYx9UW80hO7qx2ZYW3k-XpHv7Bg_nss8",
  "access_expires_at": "2026-10-30T09:21:28.63135039Z",
  "refresh_token": "FDDHe-TMTXIC5L1Erl7AGcC55evCcPHAvUnm-nexZeg",
  "refresh_expires_at": "2026-11-29T09:06:28.630825077Z",
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
  "phone": "+380696062130",
  "device_ref": "sandbox-13045"
}
```

```json
{
  "challenge_id": "9443660e-80fa-491f-bd24-b065dc96d03a",
  "expires_at": "2026-10-30T09:11:29.100098139Z",
  "resend_available_at": "2026-10-30T09:06:30.100098139Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380696062130` → **200**

```json
{
  "phone": "+380696062130",
  "audience": "CLIENT",
  "code": "357382",
  "sent_at": "2026-10-30T09:06:29.10229111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9443660e-80fa-491f-bd24-b065dc96d03a",
  "code": "357382",
  "device_ref": "sandbox-13045"
}
```

```json
{
  "session_id": "8faf4398-4a7e-471a-a817-2f826ebb8a33",
  "subject": {
    "type": "CLIENT",
    "id": "d076471b-94ff-4181-a9b9-b22f9ed805dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDc2NDcxYi05NGZmLTQxODEtYTliOS1iMjJmOWVkODA1ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUyMDg5LCJpYXQiOjE3OTMzNTExODksImp0aSI6IjcxMjM2ZTI0LWZmMWItNGRhZi05MGQyLTRiZWQxMDQ4OTZiMiIsInNpZCI6IjhmYWY0Mzk4LTRhN2UtNDcxYS1hODE3LTJmODI2ZWJiOGEzMyJ9.hrY1o-x7LpXzD2oGeDrAAO0NkLn-5Q-FNKwcavOIwwo",
  "access_expires_at": "2026-10-30T09:21:29.367714096Z",
  "refresh_token": "q_0E191KvJ2p7ApybIk6W4th-jiQ7dvfnjrWtkEQ9Ks",
  "refresh_expires_at": "2026-11-29T09:06:29.367227486Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "053f5468-85e6-4657-951a-59954cbd5124",
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
  "id": "438ae381-b519-42c7-862e-9acd44986a73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T09:11:29.614713Z",
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
  "command_id": "c5c2d015-b694-42bf-b48d-6edeeeb1440c",
  "quote_id": "438ae381-b519-42c7-862e-9acd44986a73",
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
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T09:06:29.863685Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:06:29.863685Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.461103481
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.150381669
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

`GET /api/rider/v1/orders/3a964eac-03d6-47c8-8ca5-0f2e7e563fd8` → **200**

```json
{
  "id": "3a964eac-03d6-47c8-8ca5-0f2e7e563fd8",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d076471b-94ff-4181-a9b9-b22f9ed805dc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T09:06:29.863685Z",
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
  "session_id": "4ba8a2ea-5142-42d4-9969-4e3bd113d9ba",
  "subject": {
    "type": "STAFF",
    "id": "3c5921be-dff9-4218-aea6-464468b5f646"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzU5MjFiZS1kZmY5LTQyMTgtYWVhNi00NjQ0NjhiNWY2NDYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTIyNzQsImlhdCI6MTc5MzM1MTM3NCwianRpIjoiM2RhODQ1NmYtZGMxYS00YjI4LTgwY2ItOTlhYmNhZmVmOWZkIiwic2lkIjoiNGJhOGEyZWEtNTE0Mi00MmQ0LTk5NjktNGUzYmQxMTNkOWJhIn0.Kk2ACZnfo_fK97tiXZljgT09mBFnm15F04ekz1_e_Q4",
  "access_expires_at": "2026-10-30T09:24:34.896290562Z",
  "refresh_token": "HoZGn5g9AhESsx0fLtSyPBDf6TH3ii-bxcW3Kt0dFQM",
  "refresh_expires_at": "2026-10-30T21:09:34.895774582Z",
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
  "id": "e171778f-d55e-4905-ac34-ec53031647b2",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:09:35.151091Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:09:35.151177Z",
  "updated_at": "2026-10-30T09:09:35.169459Z",
  "finished_at": "2026-10-30T09:09:35.169459Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/e171778f-d55e-4905-ac34-ec53031647b2` → **200**

```json
{
  "run": {
    "id": "e171778f-d55e-4905-ac34-ec53031647b2",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:09:35.151091Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:09:35.151177Z",
    "updated_at": "2026-10-30T09:09:35.169459Z",
    "finished_at": "2026-10-30T09:09:35.169459Z",
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
  "id": "e171778f-d55e-4905-ac34-ec53031647b2",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:09:35.151091Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:09:35.151177Z",
  "updated_at": "2026-10-30T09:09:35.169459Z",
  "finished_at": "2026-10-30T09:09:35.169459Z",
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
  "id": "e171778f-d55e-4905-ac34-ec53031647b2",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:09:35.151091Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:09:35.151177Z",
  "updated_at": "2026-10-30T09:09:35.169459Z",
  "finished_at": "2026-10-30T09:09:35.169459Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/6894e78a-f75c-486e-b28b-033aacca5938` → **204**

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
  "id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:09:35.5222Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:09:35.522265Z",
  "updated_at": "2026-10-30T09:09:35.528942Z",
  "finished_at": "2026-10-30T09:09:35.528942Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/f8bda43a-3ea4-45b9-847d-b806c53d76d3` → **200**

```json
{
  "run": {
    "id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:09:35.5222Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:09:35.522265Z",
    "updated_at": "2026-10-30T09:09:35.528942Z",
    "finished_at": "2026-10-30T09:09:35.528942Z",
    "version": 1
  },
  "items": [
    {
      "id": "19aca115-4c45-4178-8574-1fddef53e782",
      "run_id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "fc1d2080a2dac9024b14d1d8f3abb74b7933a2a048de5b16316a30969176f46d",
      "reference_display": "sandbox-reconciliation-6894e78a-f75c-486e-b28b-033aacca5938",
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
      "provider_at": "2026-10-30T09:09:35Z",
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
  "id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:09:35.5222Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:09:35.522265Z",
  "updated_at": "2026-10-30T09:09:35.528942Z",
  "finished_at": "2026-10-30T09:09:35.528942Z",
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
  "id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:09:35.5222Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:09:35.522265Z",
  "updated_at": "2026-10-30T09:09:35.528942Z",
  "finished_at": "2026-10-30T09:09:35.528942Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/19aca115-4c45-4178-8574-1fddef53e782/resolve` → **200**

```json
{
  "command_id": "ffeda27f-6e1d-4b1c-b6af-d394784e9f3c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "19aca115-4c45-4178-8574-1fddef53e782",
  "run_id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "fc1d2080a2dac9024b14d1d8f3abb74b7933a2a048de5b16316a30969176f46d",
  "reference_display": "sandbox-reconciliation-6894e78a-f75c-486e-b28b-033aacca5938",
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
  "provider_at": "2026-10-30T09:09:35Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "resolved_at": "2026-10-30T09:09:35.866806Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/19aca115-4c45-4178-8574-1fddef53e782/resolve` → **200**

```json
{
  "command_id": "ffeda27f-6e1d-4b1c-b6af-d394784e9f3c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "19aca115-4c45-4178-8574-1fddef53e782",
  "run_id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "fc1d2080a2dac9024b14d1d8f3abb74b7933a2a048de5b16316a30969176f46d",
  "reference_display": "sandbox-reconciliation-6894e78a-f75c-486e-b28b-033aacca5938",
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
  "provider_at": "2026-10-30T09:09:35Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "3c5921be-dff9-4218-aea6-464468b5f646",
  "resolved_at": "2026-10-30T09:09:35.866806Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/19aca115-4c45-4178-8574-1fddef53e782/resolve` → **409**

```json
{
  "command_id": "6af767b6-29a9-4904-8763-cb4e3b4fd619",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/19aca115-4c45-4178-8574-1fddef53e782/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "212e37df-454e-44bd-bf41-4ee5a168d149"
}
```

`GET /api/admin/v1/payment-reconciliations/f8bda43a-3ea4-45b9-847d-b806c53d76d3` → **200**

```json
{
  "run": {
    "id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T09:09:35.5222Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T09:09:35.522265Z",
    "updated_at": "2026-10-30T09:09:35.866806Z",
    "finished_at": "2026-10-30T09:09:35.528942Z",
    "version": 2
  },
  "items": [
    {
      "id": "19aca115-4c45-4178-8574-1fddef53e782",
      "run_id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "fc1d2080a2dac9024b14d1d8f3abb74b7933a2a048de5b16316a30969176f46d",
      "reference_display": "sandbox-reconciliation-6894e78a-f75c-486e-b28b-033aacca5938",
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
      "provider_at": "2026-10-30T09:09:35Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "3c5921be-dff9-4218-aea6-464468b5f646",
      "resolved_at": "2026-10-30T09:09:35.866806Z",
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
      "id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T09:09:35.5222Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:09:35.522265Z",
      "updated_at": "2026-10-30T09:09:35.866806Z",
      "finished_at": "2026-10-30T09:09:35.528942Z",
      "version": 2
    },
    {
      "id": "bbd97900-2f3c-43bf-98cb-aa0a9c0f5c46",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T09:01:59.537197Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T09:01:59.537312Z",
      "updated_at": "2026-10-30T09:01:59.543017Z",
      "finished_at": "2026-10-30T09:01:59.543017Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/6894e78a-f75c-486e-b28b-033aacca5938` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "f8bda43a-3ea4-45b9-847d-b806c53d76d3",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T09:09:35.5222Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T09:09:35.522265Z",
  "updated_at": "2026-10-30T09:09:35.866806Z",
  "finished_at": "2026-10-30T09:09:35.528942Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793351499713E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79335149998E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79335149998E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793351499722E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793351499981E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
