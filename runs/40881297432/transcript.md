# Sandbox transcript (2026-10-29T13:23:04Z, 035f8cd)

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
  "correlation_id": "86b6a104-c96d-44f7-82c9-04d20ec6de43"
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
  "session_id": "cdadae03-f495-4033-bdea-5edfa66f0ed1",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEwOTAsImlhdCI6MTc5MzI4MDE5MCwianRpIjoiYzFlMjBjOTctNzE3NC00MThkLWE2YmYtYTkyMDIzNTFkNDY3Iiwic2lkIjoiY2RhZGFlMDMtZjQ5NS00MDMzLWJkZWEtNWVkZmE2NmYwZWQxIn0.1Ym7JeUrhxDZyMnEasw5u7cONqqv9Bm7PGsDSkzBjlw",
  "access_expires_at": "2026-10-29T13:38:10.263111554Z",
  "refresh_token": "h2kxVthamOGNdv9Wbh3IlNyPvQrf_q_qiPDCKd2jUdQ",
  "refresh_expires_at": "2026-10-30T01:23:10.261548932Z",
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
  "session_id": "82a1abb6-3546-4993-84da-ddbc6d2a54ff",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEwOTEsImlhdCI6MTc5MzI4MDE5MSwianRpIjoiZmJmZTdiNjAtMjZiYS00YmViLWE4MWUtMzhhYzU1ZjJiMmIwIiwic2lkIjoiODJhMWFiYjYtMzU0Ni00OTkzLTg0ZGEtZGRiYzZkMmE1NGZmIn0.5LKEiiAVmbg2Qsa59dbxcWqutdvKHJRxeRCaZJ0pkX4",
  "access_expires_at": "2026-10-29T13:38:11.356412765Z",
  "refresh_token": "XBq8Q6YgSG1AYhwDyrvXgDGM4uRqUFa1mFo9q14drxI",
  "refresh_expires_at": "2026-10-30T01:23:11.355889053Z",
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
  "device_ref": "sandbox-13654"
}
```

```json
{
  "challenge_id": "6664e9a4-ba29-4f65-a6ea-fd1c50fa100b",
  "expires_at": "2026-10-29T13:28:11.748066244Z",
  "resend_available_at": "2026-10-29T13:23:12.748066244Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "727834",
  "sent_at": "2026-10-29T13:23:11.756879028Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6664e9a4-ba29-4f65-a6ea-fd1c50fa100b",
  "code": "727834",
  "device_ref": "sandbox-13654"
}
```

```json
{
  "session_id": "3fab659d-7519-425f-890d-bcde1d9f75eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTA5MSwiaWF0IjoxNzkzMjgwMTkxLCJqdGkiOiJiNjYwYzAxYi01OWJhLTQxZDQtYTdjYS1lYmNjMDkwZWQ0YmMiLCJzaWQiOiIzZmFiNjU5ZC03NTE5LTQyNWYtODkwZC1iY2RlMWQ5Zjc1ZWIifQ.gkveYrxvZBsHBZIAVz9Xpk-hyqbh2CB4WhPKqfzSFIw",
  "access_expires_at": "2026-10-29T13:38:11.984958134Z",
  "refresh_token": "7X-a7QJjPiBTFd_pRaYNPrOMin_B5OzV7ZvVkw5I2as",
  "refresh_expires_at": "2026-11-28T13:23:11.984284046Z",
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
  "command_id": "a5c567ac-3569-4a62-95d2-a041361cadd6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:12Z",
    "sequence": 1793280192363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52905454-3320-4342-897c-de7c0d8d5bdb",
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
  "last_heartbeat_at": "2026-10-29T13:23:12.443646Z",
  "last_location_at": "2026-10-29T13:23:12.443646Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639017341",
  "device_ref": "sandbox-30424"
}
```

```json
{
  "challenge_id": "e7fb70ba-10bf-4262-9bb5-6a380419d82d",
  "expires_at": "2026-10-29T13:28:12.64045978Z",
  "resend_available_at": "2026-10-29T13:23:13.64045978Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639017341` → **200**

```json
{
  "phone": "+380639017341",
  "audience": "CLIENT",
  "code": "465309",
  "sent_at": "2026-10-29T13:23:12.644219815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7fb70ba-10bf-4262-9bb5-6a380419d82d",
  "code": "465309",
  "device_ref": "sandbox-30424"
}
```

```json
{
  "session_id": "6b87cc46-c348-48aa-9513-6a96af4cef6d",
  "subject": {
    "type": "CLIENT",
    "id": "3fe12157-4485-4519-9576-84ba3a81e686"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmUxMjE1Ny00NDg1LTQ1MTktOTU3Ni04NGJhM2E4MWU2ODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMDkyLCJpYXQiOjE3OTMyODAxOTIsImp0aSI6IjEyODk4MmM4LWE2YzktNGU0MS04NjZmLTM2ZWNmYWE1MWM2YiIsInNpZCI6IjZiODdjYzQ2LWMzNDgtNDhhYS05NTEzLTZhOTZhZjRjZWY2ZCJ9.uk8Y85FuFN_IeQYGOjbFVK-0DofKpkv9Hoo1N6Rbt80",
  "access_expires_at": "2026-10-29T13:38:12.859369292Z",
  "refresh_token": "KMUl8nD-6NzmVQbbn8UMOTwqkJk-4iPvz6D6DpzWd5o",
  "refresh_expires_at": "2026-11-28T13:23:12.858648031Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cd1e0abe-62ee-4577-826b-0e3fc0cba742",
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
  "id": "7f4db291-7440-47e6-955c-28024191dd58",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:28:13.076698Z",
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
  "command_id": "8a0aaa2d-05c4-47a9-989a-baf6937b8051",
  "quote_id": "7f4db291-7440-47e6-955c-28024191dd58",
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
  "id": "79275c10-4ed5-4121-b2ef-235611aed4cb",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fe12157-4485-4519-9576-84ba3a81e686",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:23:13.341176Z",
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
    "id": "3fb5db75-32f9-4248-9317-47eb4174af19",
    "order_id": "79275c10-4ed5-4121-b2ef-235611aed4cb",
    "expires_at": "2026-10-29T13:23:28.348498Z",
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

`POST /api/driver/v1/offers/3fb5db75-32f9-4248-9317-47eb4174af19/accept` → **200**

```json
{
  "command_id": "9de7f5d9-abb3-4a2b-bb0f-4d5997ee0d3c"
}
```

```json
{
  "id": "cfd5a030-1d5a-4aa1-a34b-2e078abbe9dd",
  "order_id": "79275c10-4ed5-4121-b2ef-235611aed4cb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "13a5f08d-3aba-4091-902f-4b28ea36d764",
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
  "command_id": "c5a00011-6b13-4336-a4da-02511e9b4ae4",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T13:23:14.180819555Z"
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
  "id": "13a5f08d-3aba-4091-902f-4b28ea36d764",
  "order_id": "79275c10-4ed5-4121-b2ef-235611aed4cb",
  "assignment_id": "cfd5a030-1d5a-4aa1-a34b-2e078abbe9dd",
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

`POST /api/driver/v1/work-sessions/52905454-3320-4342-897c-de7c0d8d5bdb/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:14Z",
    "sequence": 1793280194769
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "52905454-3320-4342-897c-de7c0d8d5bdb",
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
  "last_heartbeat_at": "2026-10-29T13:23:14.791673Z",
  "last_location_at": "2026-10-29T13:23:14.791673Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/13a5f08d-3aba-4091-902f-4b28ea36d764/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "6adf509f-11e2-49e5-892f-f2e7e16ee740",
  "expected_version": 0
}
```

```json
{
  "id": "13a5f08d-3aba-4091-902f-4b28ea36d764",
  "order_id": "79275c10-4ed5-4121-b2ef-235611aed4cb",
  "assignment_id": "cfd5a030-1d5a-4aa1-a34b-2e078abbe9dd",
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
  "arrived_at": "2026-10-29T13:23:14.99792Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/13a5f08d-3aba-4091-902f-4b28ea36d764/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b27284ef-04fd-403a-a94b-1948610de369",
  "expected_version": 1
}
```

```json
{
  "id": "13a5f08d-3aba-4091-902f-4b28ea36d764",
  "order_id": "79275c10-4ed5-4121-b2ef-235611aed4cb",
  "assignment_id": "cfd5a030-1d5a-4aa1-a34b-2e078abbe9dd",
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
  "arrived_at": "2026-10-29T13:23:14.99792Z",
  "started_at": "2026-10-29T13:23:15.200246Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/13a5f08d-3aba-4091-902f-4b28ea36d764/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8f622deb-e753-4f32-b3e8-79d27ed8fa4a",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:23:15Z",
  "cash_received": true
}
```

```json
{
  "id": "13a5f08d-3aba-4091-902f-4b28ea36d764",
  "order_id": "79275c10-4ed5-4121-b2ef-235611aed4cb",
  "assignment_id": "cfd5a030-1d5a-4aa1-a34b-2e078abbe9dd",
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
  "arrived_at": "2026-10-29T13:23:14.99792Z",
  "started_at": "2026-10-29T13:23:15.200246Z",
  "completed_at": "2026-10-29T13:23:15.415724Z",
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
  "session_id": "52905454-3320-4342-897c-de7c0d8d5bdb",
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
  "last_heartbeat_at": "2026-10-29T13:23:14.791673Z",
  "last_location_at": "2026-10-29T13:23:14.791673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/52905454-3320-4342-897c-de7c0d8d5bdb/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d9910ac2-cefc-49ae-9f72-859de112b93a",
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
  "command_id": "e3d3038c-73d6-4319-ae35-a5f2a263f5fc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:15Z",
    "sequence": 1793280195986
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
  "correlation_id": "197487ed-64d8-4e0a-b854-742e3524ad29",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "a7c67ce8-aa80-4d4d-9f0f-6ab8e3d3286e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:16Z",
    "sequence": 1793280196176
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a324a396-9845-4aad-bcb8-a9d835efd564",
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
  "last_heartbeat_at": "2026-10-29T13:23:16.193553Z",
  "last_location_at": "2026-10-29T13:23:16.193553Z",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T13:23:14.18082Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "f2653db6-2e71-487f-9639-913e26b99550",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T13:23:16.603145032Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a324a396-9845-4aad-bcb8-a9d835efd564",
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
  "last_heartbeat_at": "2026-10-29T13:23:16.193553Z",
  "last_location_at": "2026-10-29T13:23:16.193553Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a324a396-9845-4aad-bcb8-a9d835efd564/close` → **200**

```json
{
  "command_id": "84e990dd-52f7-49e7-970e-3a9c8e9e5cbc",
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
  "session_id": "353f16ef-efa0-471b-9716-204ebea74bc1",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEwOTcsImlhdCI6MTc5MzI4MDE5NywianRpIjoiYzE4NWMwZDctZWQ3ZC00M2VkLWJhODEtOTM3OTg1NmU1ZDRiIiwic2lkIjoiMzUzZjE2ZWYtZWZhMC00NzFiLTk3MTYtMjA0ZWJlYTc0YmMxIn0.WudKkImN_edR34ILbhsey4qITjFMOnr2lsHca_6pPcc",
  "access_expires_at": "2026-10-29T13:38:17.400197154Z",
  "refresh_token": "2WoWeV08EGW7NcpD9q6_ue3QzV7CHEvZ_JPykaaG2Nw",
  "refresh_expires_at": "2026-10-30T01:23:17.399501573Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "808a1edb-c611-497a-815c-3218b5a66dff",
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
  "id": "7c79955d-04b5-4f8a-bb06-9598fcc45c14",
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
  "created_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "created_at": "2026-10-29T13:23:17.597602Z",
  "updated_at": "2026-10-29T13:23:17.597602Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636820978",
  "device_ref": "sandbox-6171"
}
```

```json
{
  "challenge_id": "e6adf0b8-9c5c-4bc5-bc97-20bb985c95f5",
  "expires_at": "2026-10-29T13:28:17.792173475Z",
  "resend_available_at": "2026-10-29T13:23:18.792173475Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636820978` → **200**

```json
{
  "phone": "+380636820978",
  "audience": "CLIENT",
  "code": "139139",
  "sent_at": "2026-10-29T13:23:17.795818154Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6adf0b8-9c5c-4bc5-bc97-20bb985c95f5",
  "code": "139139",
  "device_ref": "sandbox-6171"
}
```

```json
{
  "session_id": "88f6cab2-c9da-4588-abf8-cc1e440aa137",
  "subject": {
    "type": "CLIENT",
    "id": "5875735f-9903-4143-93ca-e23ce8a15d8b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ODc1NzM1Zi05OTAzLTQxNDMtOTNjYS1lMjNjZThhMTVkOGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMDk4LCJpYXQiOjE3OTMyODAxOTgsImp0aSI6IjA0YWJkYzAyLTA3NDItNGI3NC05ZjhhLWY3NjRlMjI2ZGI2MyIsInNpZCI6Ijg4ZjZjYWIyLWM5ZGEtNDU4OC1hYmY4LWNjMWU0NDBhYTEzNyJ9.aCsPpo-nLO1h_NQBquTek-fAjRJ0Em7wNYZwC7QD6UA",
  "access_expires_at": "2026-10-29T13:38:18.00164512Z",
  "refresh_token": "YKdcU32_2XlLKU25NThkw9Luoj0UTpukrkU8jOaefFM",
  "refresh_expires_at": "2026-11-28T13:23:18.00107629Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636820978` → **200**

```json
{
  "client_id": "5875735f-9903-4143-93ca-e23ce8a15d8b"
}
```

`POST /api/admin/v1/rider-wallets/5875735f-9903-4143-93ca-e23ce8a15d8b/top-ups` → **201**

```json
{
  "command_id": "bc340298-670c-4145-9b56-9b0c832595e6",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "5875735f-9903-4143-93ca-e23ce8a15d8b",
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
      "id": "77ce0fee-8ee5-4cd9-87ad-755fec4e3f81",
      "at": "2026-10-29T13:23:18.383126Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "385da7bf-4e0f-4f4a-a8da-843dd64e34ba",
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
  "id": "da224a40-a613-461a-822a-df6d45acfa35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:28:18.586290Z",
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
      "id": "7c79955d-04b5-4f8a-bb06-9598fcc45c14",
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
  "device_ref": "sandbox-20948"
}
```

```json
{
  "challenge_id": "179aa39e-64ea-4714-b2da-c4b5bcfb127f",
  "expires_at": "2026-10-29T13:28:18.788284082Z",
  "resend_available_at": "2026-10-29T13:23:19.788284082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "016311",
  "sent_at": "2026-10-29T13:23:18.791457499Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "179aa39e-64ea-4714-b2da-c4b5bcfb127f",
  "code": "016311",
  "device_ref": "sandbox-20948"
}
```

```json
{
  "session_id": "42bfe554-4c89-41cc-bdf5-9fdc2773fbc8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTA5OCwiaWF0IjoxNzkzMjgwMTk4LCJqdGkiOiI0OTkwNjkzOS1jZTY5LTQ1YzAtODZmYy00OTYyZTRiNmJjZTgiLCJzaWQiOiI0MmJmZTU1NC00Yzg5LTQxY2MtYmRmNS05ZmRjMjc3M2ZiYzgifQ._QyxE9XCeUju6SYGdzFQNiyUamJZ75LCOSGRdgBoBa0",
  "access_expires_at": "2026-10-29T13:38:18.997383055Z",
  "refresh_token": "w7a0k2np2jzuUZMlkA1XjxroUXVvdKUKYcpFfB4tFJo",
  "refresh_expires_at": "2026-11-28T13:23:18.996978183Z",
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
  "command_id": "87623f38-d065-4a6e-a3a4-bab3275cc09b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:19Z",
    "sequence": 1793280199378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6779a58d-1f40-46ed-a5aa-605615b37021",
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
  "last_heartbeat_at": "2026-10-29T13:23:19.396743Z",
  "last_location_at": "2026-10-29T13:23:19.396743Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8d1846f0-c7d1-42d5-8786-b3175c8dc305",
  "quote_id": "da224a40-a613-461a-822a-df6d45acfa35",
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
  "id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5875735f-9903-4143-93ca-e23ce8a15d8b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:23:19.615509Z",
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
  "client_id": "5875735f-9903-4143-93ca-e23ce8a15d8b",
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
      "id": "77ce0fee-8ee5-4cd9-87ad-755fec4e3f81",
      "at": "2026-10-29T13:23:18.383126Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
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
    "id": "e40d0e2b-698c-41f1-986d-8dfd2b8f8185",
    "order_id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014",
    "expires_at": "2026-10-29T13:23:34.622146Z",
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

`POST /api/driver/v1/offers/e40d0e2b-698c-41f1-986d-8dfd2b8f8185/accept` → **200**

```json
{
  "command_id": "26da8142-fab4-4fa1-aeac-b3ff66f601d7"
}
```

```json
{
  "id": "1ad247bd-dd37-494a-b6d3-0a4edc65e7c2",
  "order_id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "db60f676-f24e-4e82-b63c-fe54801d71f6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "db60f676-f24e-4e82-b63c-fe54801d71f6",
  "order_id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014",
  "assignment_id": "1ad247bd-dd37-494a-b6d3-0a4edc65e7c2",
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

`POST /api/driver/v1/work-sessions/6779a58d-1f40-46ed-a5aa-605615b37021/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:20Z",
    "sequence": 1793280200592
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6779a58d-1f40-46ed-a5aa-605615b37021",
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
  "last_heartbeat_at": "2026-10-29T13:23:20.613048Z",
  "last_location_at": "2026-10-29T13:23:20.613048Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/db60f676-f24e-4e82-b63c-fe54801d71f6/arrive` → **200**

```json
{
  "command_id": "60a9dcfb-fff3-444b-b85d-14d30a647d87",
  "expected_version": 0
}
```

```json
{
  "id": "db60f676-f24e-4e82-b63c-fe54801d71f6",
  "order_id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014",
  "assignment_id": "1ad247bd-dd37-494a-b6d3-0a4edc65e7c2",
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
  "arrived_at": "2026-10-29T13:23:20.813602Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/db60f676-f24e-4e82-b63c-fe54801d71f6/start` → **200**

```json
{
  "command_id": "7349ef0c-0aff-48cc-8a41-7ad8af06af7f",
  "expected_version": 1
}
```

```json
{
  "id": "db60f676-f24e-4e82-b63c-fe54801d71f6",
  "order_id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014",
  "assignment_id": "1ad247bd-dd37-494a-b6d3-0a4edc65e7c2",
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
  "arrived_at": "2026-10-29T13:23:20.813602Z",
  "started_at": "2026-10-29T13:23:21.023173Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/db60f676-f24e-4e82-b63c-fe54801d71f6/complete` → **200**

```json
{
  "command_id": "be80b06a-a41f-4c5b-a66f-9795eb8f9c0c",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:23:21Z",
  "cash_received": true
}
```

```json
{
  "id": "db60f676-f24e-4e82-b63c-fe54801d71f6",
  "order_id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014",
  "assignment_id": "1ad247bd-dd37-494a-b6d3-0a4edc65e7c2",
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
  "arrived_at": "2026-10-29T13:23:20.813602Z",
  "started_at": "2026-10-29T13:23:21.023173Z",
  "completed_at": "2026-10-29T13:23:21.24988Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5875735f-9903-4143-93ca-e23ce8a15d8b",
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
      "id": "441f555e-a804-4527-b1d7-974478f6881c",
      "at": "2026-10-29T13:23:21.403529Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014"
    },
    {
      "id": "77ce0fee-8ee5-4cd9-87ad-755fec4e3f81",
      "at": "2026-10-29T13:23:18.383126Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/7c79955d-04b5-4f8a-bb06-9598fcc45c14/archive` → **200**

```json
{
  "command_id": "8a35cf64-1e19-4726-9583-e9d49f0d5fbc",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "7c79955d-04b5-4f8a-bb06-9598fcc45c14",
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
  "created_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "created_at": "2026-10-29T13:23:17.597602Z",
  "updated_at": "2026-10-29T13:23:24.668485Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6779a58d-1f40-46ed-a5aa-605615b37021",
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
  "last_heartbeat_at": "2026-10-29T13:23:20.613048Z",
  "last_location_at": "2026-10-29T13:23:20.613048Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6779a58d-1f40-46ed-a5aa-605615b37021/close` → **200**

```json
{
  "command_id": "24fe3f2c-bf0a-4379-9b12-f1fa3a746e83",
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

Done: order 20d2caad-c6ed-40d1-81e7-ce4f1b7ac014.

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
  "session_id": "47ddc345-a4e9-4697-b6bc-9e84e3464606",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExMDUsImlhdCI6MTc5MzI4MDIwNSwianRpIjoiYTE1ZjJhMDgtMDJiMy00OWY2LWEwMTYtOWJjNDNjZWE1MjE1Iiwic2lkIjoiNDdkZGMzNDUtYTRlOS00Njk3LWI2YmMtOWU4NGUzNDY0NjA2In0.FtHWDXwU9-E5_djJaA6Q7ocgW9TQkrQtxEUFu3GFZuE",
  "access_expires_at": "2026-10-29T13:38:25.487292991Z",
  "refresh_token": "JwcPfAMnARw67_pPGp3IBkW__eMTLn_VFVahjbLYJUQ",
  "refresh_expires_at": "2026-10-30T01:23:25.486688028Z",
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
  "command_id": "70a426da-34a9-41e2-8e1c-931f0cd7a8fc",
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
  "session_id": "326d3fe5-ee7f-4685-8ec8-995d3f49afb0",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExMDYsImlhdCI6MTc5MzI4MDIwNiwianRpIjoiMDM3MDViMWYtZjVhNy00ZjVmLWE2NmMtOGNmYTYyM2Q1NTY0Iiwic2lkIjoiMzI2ZDNmZTUtZWU3Zi00Njg1LThlYzgtOTk1ZDNmNDlhZmIwIn0.ZE2ZDXEvtO5_1m3Mn_zcEisCuahOSXWBFxAUBUtTPAY",
  "access_expires_at": "2026-10-29T13:38:26.301273122Z",
  "refresh_token": "RLjkwYxRJFgchhPThx62GxESKR1rDrCuA9lp0UmURB8",
  "refresh_expires_at": "2026-10-30T01:23:26.300879437Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.984316186",
    "linkedid": "1730052700.984316186",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675098412"
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
    "id": "1730052700.984316186",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "e96f69f1-e50f-46ae-ae29-d8b3fedb82e4",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675098412",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T13:23:26.513581Z",
      "answered_at": null,
      "ended_at": "2026-10-29T13:23:26.535325Z",
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
    "id": "1730052600.2425520094",
    "linkedid": "1730052600.2425520094",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675098412"
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
      "id": "057657cc-ee80-46e6-b483-7258699b255c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675098412",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T13:23:26.753596Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/057657cc-ee80-46e6-b483-7258699b255c/answer` → **200**

```json
{
  "command_id": "b6e19d96-b740-4857-9ec7-f7d8b306418f"
}
```

```json
{
  "id": "057657cc-ee80-46e6-b483-7258699b255c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675098412",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "order_ids": [],
  "started_at": "2026-10-29T13:23:26.753596Z",
  "answered_at": "2026-10-29T13:23:26.974115Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2425520094",
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
    "id": "1730052600.2425520094",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "057657cc-ee80-46e6-b483-7258699b255c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675098412",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [],
      "started_at": "2026-10-29T13:23:26.753596Z",
      "answered_at": "2026-10-29T13:23:26.974115Z",
      "ended_at": "2026-10-29T13:23:27.184691Z",
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
      "id": "057657cc-ee80-46e6-b483-7258699b255c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675098412",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [],
      "started_at": "2026-10-29T13:23:26.753596Z",
      "answered_at": "2026-10-29T13:23:26.974115Z",
      "ended_at": "2026-10-29T13:23:27.184691Z",
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
      "id": "057657cc-ee80-46e6-b483-7258699b255c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675098412",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [],
      "started_at": "2026-10-29T13:23:26.753596Z",
      "answered_at": "2026-10-29T13:23:26.974115Z",
      "ended_at": "2026-10-29T13:23:27.184691Z",
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
      "id": "057657cc-ee80-46e6-b483-7258699b255c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675098412",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [],
      "started_at": "2026-10-29T13:23:26.753596Z",
      "answered_at": "2026-10-29T13:23:26.974115Z",
      "ended_at": "2026-10-29T13:23:27.184691Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T13:23:33.192655Z"
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
      "id": "057657cc-ee80-46e6-b483-7258699b255c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675098412",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [],
      "started_at": "2026-10-29T13:23:26.753596Z",
      "answered_at": "2026-10-29T13:23:26.974115Z",
      "ended_at": "2026-10-29T13:23:27.184691Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T13:23:33.192655Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/057657cc-ee80-46e6-b483-7258699b255c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/057657cc-ee80-46e6-b483-7258699b255c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=057657cc-ee80-46e6-b483-7258699b255c` → **200**

```json
{
  "changes": [
    {
      "id": "0bb7afc6-a578-4c76-9f98-bc7547db9ec9",
      "occurred_at": "2026-10-29T13:23:34.217317Z",
      "actor_type": "STAFF",
      "actor_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "057657cc-ee80-46e6-b483-7258699b255c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"bdd1f504-d588-4738-82a0-b38314280085\", \"order_ids\": []}",
      "correlation_id": "b062b0cf-cd9f-463d-bc12-f038e27e042b"
    },
    {
      "id": "9d6fce58-91b0-48e7-af04-e907a47ac968",
      "occurred_at": "2026-10-29T13:23:34.190096Z",
      "actor_type": "STAFF",
      "actor_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "057657cc-ee80-46e6-b483-7258699b255c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"bdd1f504-d588-4738-82a0-b38314280085\", \"order_ids\": []}",
      "correlation_id": "a3ba663e-58dc-414e-a82f-c1ca7bdd6b5e"
    }
  ]
}
```

Done: call 057657cc-ee80-46e6-b483-7258699b255c recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11941"
}
```

```json
{
  "challenge_id": "c194e11f-2902-4364-b455-6313771c97b2",
  "expires_at": "2026-10-29T13:28:34.445823218Z",
  "resend_available_at": "2026-10-29T13:23:35.445823218Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "243380",
  "sent_at": "2026-10-29T13:23:34.448948461Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c194e11f-2902-4364-b455-6313771c97b2",
  "code": "243380",
  "device_ref": "sandbox-11941"
}
```

```json
{
  "session_id": "8f1d3f48-150c-4e92-be95-9cad185929cf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTExNCwiaWF0IjoxNzkzMjgwMjE0LCJqdGkiOiI1NGE4NjRiMC05NTFlLTQxNmQtOGMxMC0wYjM1ZDdlNjk3ZWUiLCJzaWQiOiI4ZjFkM2Y0OC0xNTBjLTRlOTItYmU5NS05Y2FkMTg1OTI5Y2YifQ.E6VlipokipGPmU0grEEvyWhR3NsCWitoJ0OZ5lF-HZY",
  "access_expires_at": "2026-10-29T13:38:34.659837999Z",
  "refresh_token": "n7JDZeC0j5tEHAfUHbeaXpw1STy4cOX2E7Ja5xHP8g0",
  "refresh_expires_at": "2026-11-28T13:23:34.65933531Z",
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
  "command_id": "94f8ea32-1fc5-4783-bb8e-478997caf7fa",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:35Z",
    "sequence": 1793280215285
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a8f95ed-77a8-4913-9c4c-7ce7b03f8288",
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
  "last_heartbeat_at": "2026-10-29T13:23:35.046971Z",
  "last_location_at": "2026-10-29T13:23:35.046971Z",
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
  "session_id": "35db8ef0-e436-4398-91fa-a84983c62619",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExMTUsImlhdCI6MTc5MzI4MDIxNSwianRpIjoiNmU0NmRjNTgtMTUzMC00Y2UzLWI2YzUtZjRmNjZlYzk2YWQ0Iiwic2lkIjoiMzVkYjhlZjAtZTQzNi00Mzk4LTkxZmEtYTg0OTgzYzYyNjE5In0.Mq1O_TyGRy1sA0kCx7dAtkKDhR0Eqxj81QjbC0rXh6E",
  "access_expires_at": "2026-10-29T13:38:35.44566177Z",
  "refresh_token": "UE7fpdBca_8NnotGwTUB1b99AODfxsRUm1qsgMYqR6k",
  "refresh_expires_at": "2026-10-30T01:23:35.445156125Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "caaa14de-f773-47a9-a3a4-7eb2d1a87b39",
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
  "id": "75002cbe-8456-44ac-9ecb-cf46040c105f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:28:35.640315Z",
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
  "command_id": "ffa5e23c-5a7d-42c5-9161-73263b6b2ce4",
  "quote_id": "75002cbe-8456-44ac-9ecb-cf46040c105f",
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
    "phone": "+380675391166"
  }
}
```

```json
{
  "id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
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
  "created_at": "2026-10-29T13:23:35.857382Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675391166"
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
    "id": "caaaf3d1-04bc-4fcd-ae2e-9526bccf254a",
    "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
    "expires_at": "2026-10-29T13:23:50.861207Z",
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

`POST /api/driver/v1/offers/caaaf3d1-04bc-4fcd-ae2e-9526bccf254a/accept` → **200**

```json
{
  "command_id": "1a65a8da-7b2e-4eb7-a0e3-bd1498e12260"
}
```

```json
{
  "id": "0fb46578-da04-4210-a140-787fbf5e736e",
  "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f411819-ef01-4350-b4a5-8aeabb2ce429",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[
  {
    "phone": "+380675391166",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:37.284492514Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[
  {
    "phone": "+380675391166",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:37.284492514Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[
  {
    "phone": "+380675391166",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:37.284492514Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6f411819-ef01-4350-b4a5-8aeabb2ce429",
  "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
  "assignment_id": "0fb46578-da04-4210-a140-787fbf5e736e",
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
    "phone": "+380675391166"
  }
}
```

`POST /api/driver/v1/work-sessions/3a8f95ed-77a8-4913-9c4c-7ce7b03f8288/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:37Z",
    "sequence": 1793280217715
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a8f95ed-77a8-4913-9c4c-7ce7b03f8288",
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
  "last_heartbeat_at": "2026-10-29T13:23:37.731836Z",
  "last_location_at": "2026-10-29T13:23:37.731836Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6f411819-ef01-4350-b4a5-8aeabb2ce429/arrive` → **200**

```json
{
  "command_id": "f6d6e31b-1fcd-4373-8164-af102dd3853d",
  "expected_version": 0
}
```

```json
{
  "id": "6f411819-ef01-4350-b4a5-8aeabb2ce429",
  "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
  "assignment_id": "0fb46578-da04-4210-a140-787fbf5e736e",
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
  "arrived_at": "2026-10-29T13:23:37.92084Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675391166"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[
  {
    "phone": "+380675391166",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:37.284492514Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[
  {
    "phone": "+380675391166",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:37.284492514Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[
  {
    "phone": "+380675391166",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:37.284492514Z"
  },
  {
    "phone": "+380675391166",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:39.289771353Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[
  {
    "phone": "+380675391166",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:37.284492514Z"
  },
  {
    "phone": "+380675391166",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:39.289771353Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675391166` → **200**

```json
[
  {
    "phone": "+380675391166",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:37.284492514Z"
  },
  {
    "phone": "+380675391166",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T13:23:39.289771353Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/6f411819-ef01-4350-b4a5-8aeabb2ce429/start` → **200**

```json
{
  "command_id": "57087e10-b056-4a00-9ca6-80c4861cf762",
  "expected_version": 1
}
```

```json
{
  "id": "6f411819-ef01-4350-b4a5-8aeabb2ce429",
  "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
  "assignment_id": "0fb46578-da04-4210-a140-787fbf5e736e",
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
  "arrived_at": "2026-10-29T13:23:37.92084Z",
  "started_at": "2026-10-29T13:23:40.240775Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675391166"
  }
}
```

`POST /api/driver/v1/trips/6f411819-ef01-4350-b4a5-8aeabb2ce429/complete` → **200**

```json
{
  "command_id": "b8f83607-15ad-47a5-a31a-4e29b535ccae",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:23:40Z",
  "cash_received": true
}
```

```json
{
  "id": "6f411819-ef01-4350-b4a5-8aeabb2ce429",
  "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
  "assignment_id": "0fb46578-da04-4210-a140-787fbf5e736e",
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
  "arrived_at": "2026-10-29T13:23:37.92084Z",
  "started_at": "2026-10-29T13:23:40.240775Z",
  "completed_at": "2026-10-29T13:23:40.440667Z",
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
  "session_id": "3a8f95ed-77a8-4913-9c4c-7ce7b03f8288",
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
  "last_heartbeat_at": "2026-10-29T13:23:37.731836Z",
  "last_location_at": "2026-10-29T13:23:37.731836Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a8f95ed-77a8-4913-9c4c-7ce7b03f8288/close` → **200**

```json
{
  "command_id": "d2a939d6-b46e-459a-9847-b08e0f9940bb",
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
  "phone": "+380638484854",
  "device_ref": "sandbox-4153"
}
```

```json
{
  "challenge_id": "1ce4d7c4-894e-4685-b3e6-7fc46120a091",
  "expires_at": "2026-10-29T13:28:41.068682809Z",
  "resend_available_at": "2026-10-29T13:23:42.068682809Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638484854` → **200**

```json
{
  "phone": "+380638484854",
  "audience": "CLIENT",
  "code": "923354",
  "sent_at": "2026-10-29T13:23:41.071549121Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ce4d7c4-894e-4685-b3e6-7fc46120a091",
  "code": "923354",
  "device_ref": "sandbox-4153"
}
```

```json
{
  "session_id": "c501cb3c-2a62-4545-94a6-b31b3283d933",
  "subject": {
    "type": "CLIENT",
    "id": "394a483d-4031-4211-9d3b-480f8c061068"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTRhNDgzZC00MDMxLTQyMTEtOWQzYi00ODBmOGMwNjEwNjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTIxLCJpYXQiOjE3OTMyODAyMjEsImp0aSI6ImIzMzRiYTNhLWQ5NjYtNDQzYy1hY2ZlLTQwZDNhYmVjZGNmYSIsInNpZCI6ImM1MDFjYjNjLTJhNjItNDU0NS05NGE2LWIzMWIzMjgzZDkzMyJ9.DBqWbZWyuh3-F0ySOx3Dtmg-aPHQwWtfud4vER4zBIE",
  "access_expires_at": "2026-10-29T13:38:41.276746065Z",
  "refresh_token": "CIba2OH9ur9Qp5Oo4IpjuWB1nxxVar8WgBO0K9o7JvY",
  "refresh_expires_at": "2026-11-28T13:23:41.276206498Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте"
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
  "device_ref": "sandbox-22794"
}
```

```json
{
  "challenge_id": "3f9c9e86-94ab-4d1b-b209-d141d19f17d1",
  "expires_at": "2026-10-29T13:28:41.642574223Z",
  "resend_available_at": "2026-10-29T13:23:42.642574223Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "852915",
  "sent_at": "2026-10-29T13:23:41.64509409Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f9c9e86-94ab-4d1b-b209-d141d19f17d1",
  "code": "852915",
  "device_ref": "sandbox-22794"
}
```

```json
{
  "session_id": "756c1353-6a2a-426f-ad4a-f09f509abe3d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTEyMSwiaWF0IjoxNzkzMjgwMjIxLCJqdGkiOiIxMGNjN2U2MC00MzAzLTQ2MTktODFkYi04NjU3YmZlNDgwYjAiLCJzaWQiOiI3NTZjMTM1My02YTJhLTQyNmYtYWQ0YS1mMDlmNTA5YWJlM2QifQ.M0cKBmsYpWpq99nSAUbqp_VQSpuWuQ-kS017PE4UTKI",
  "access_expires_at": "2026-10-29T13:38:41.858643368Z",
  "refresh_token": "VKwRfdkNlKeHjgmICtQq7JsDKSWTkSJNbdsmBRnwhK8",
  "refresh_expires_at": "2026-11-28T13:23:41.858249282Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать"
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
  "session_id": "97636a6e-e7b7-4dce-a5ee-fa358ee489cc",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExMjIsImlhdCI6MTc5MzI4MDIyMiwianRpIjoiN2U4N2RkZmMtNDk4YS00Y2RlLWIzYzItZDcxNWRjNWZlYjllIiwic2lkIjoiOTc2MzZhNmUtZTdiNy00ZGNlLWE1ZWUtZmEzNThlZTQ4OWNjIn0.40I2y61Vs4pnWaWSnMuntKoY2fgU6oCUDOqvJVlX0RY",
  "access_expires_at": "2026-10-29T13:38:42.465540886Z",
  "refresh_token": "oVGwNFdG8LfqNKaWWHZqYboUs6ArdrvTymVtTQatkdI",
  "refresh_expires_at": "2026-10-30T01:23:42.465161713Z",
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
  "session_id": "db0b20ea-8070-4c94-a60e-03c6be036e21",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExMjIsImlhdCI6MTc5MzI4MDIyMiwianRpIjoiZDc5YzBjMWYtOWJiMy00OGVmLTg2ZTktOGViMGU4ZDhlODQxIiwic2lkIjoiZGIwYjIwZWEtODA3MC00Yzk0LWE2MGUtMDNjNmJlMDM2ZTIxIn0.CSIlVc5aDplt2nUpJjINdGbQnF1ny2beohAWAmpCBFM",
  "access_expires_at": "2026-10-29T13:38:42.855486564Z",
  "refresh_token": "OmO0FtVRycofOkPNa4hRnkAl_UrEj4mSzrP7Ym8stDg",
  "refresh_expires_at": "2026-10-30T01:23:42.855003115Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП"
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
  "command_id": "d222f37c-c2c5-4c7d-b2d8-127c36ecbdd0",
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
  "id": "1dacaf26-b750-4962-9583-88c3b32d9a00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:28:43.233370Z",
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
  "command_id": "c81159ee-2fec-4fc3-94a0-4dac9dbada2f",
  "quote_id": "1dacaf26-b750-4962-9583-88c3b32d9a00",
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
  "id": "3afed53b-0562-4a4c-a86f-2a3dc81b3155",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "394a483d-4031-4211-9d3b-480f8c061068",
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
  "created_at": "2026-10-29T13:23:43.463359Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3afed53b-0562-4a4c-a86f-2a3dc81b3155` → **200**

```json
{
  "id": "3afed53b-0562-4a4c-a86f-2a3dc81b3155",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "394a483d-4031-4211-9d3b-480f8c061068",
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
  "created_at": "2026-10-29T13:23:43.463359Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3afed53b-0562-4a4c-a86f-2a3dc81b3155/cancel` → **200**

```json
{
  "command_id": "beff88bb-9a08-4c16-a5ee-8d2f4fd144b8",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "3afed53b-0562-4a4c-a86f-2a3dc81b3155",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "394a483d-4031-4211-9d3b-480f8c061068",
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
  "created_at": "2026-10-29T13:23:43.463359Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину"
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
  "command_id": "efe96718-d5f5-458f-b664-00fec55db7ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:44Z",
    "sequence": 1793280224246
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91c452de-6fb4-486c-bd0e-f4ca9fe9cd2a",
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
  "last_heartbeat_at": "2026-10-29T13:23:44.263907Z",
  "last_location_at": "2026-10-29T13:23:44.263907Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17657"
}
```

```json
{
  "challenge_id": "a7c161de-b39f-4886-bdb9-eae8ce32ec8d",
  "expires_at": "2026-10-29T13:28:44.449819201Z",
  "resend_available_at": "2026-10-29T13:23:45.449819201Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "789368",
  "sent_at": "2026-10-29T13:23:44.453489458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7c161de-b39f-4886-bdb9-eae8ce32ec8d",
  "code": "789368",
  "device_ref": "sandbox-17657"
}
```

```json
{
  "session_id": "39127724-aafe-48fc-98fc-498f34e00e45",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTEyNCwiaWF0IjoxNzkzMjgwMjI0LCJqdGkiOiJhZjZkMTEwYS0zNzM3LTRkNWUtODRhOS1hMDY2MGFhODQ0OWUiLCJzaWQiOiIzOTEyNzcyNC1hYWZlLTQ4ZmMtOThmYy00OThmMzRlMDBlNDUifQ.dMHuB5sac8_5qM8k4q17mKrd-rVuvuRVBYjVtl2zXYk",
  "access_expires_at": "2026-10-29T13:38:44.667064815Z",
  "refresh_token": "TzXAPjimeK1CzIgKjbHCoK8JL3eBvRQg_9THMpIqWVA",
  "refresh_expires_at": "2026-11-28T13:23:44.666677529Z",
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
  "command_id": "e7869e9c-aaf0-4898-9f4f-6ca18bf94687",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:45Z",
    "sequence": 1793280225635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5764c5a8-9db7-4e06-8a23-da81ff434f40",
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
  "last_heartbeat_at": "2026-10-29T13:23:45.081366Z",
  "last_location_at": "2026-10-29T13:23:45.081366Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "89813377-ab7b-44b4-828b-9c171a8da149",
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
  "id": "3f173282-3753-44b3-839e-2a35c8971dc3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:28:45.279767Z",
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
  "command_id": "d14320ee-f189-403c-94a8-4a0dc5b3f158",
  "quote_id": "3f173282-3753-44b3-839e-2a35c8971dc3",
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
  "id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "394a483d-4031-4211-9d3b-480f8c061068",
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
  "created_at": "2026-10-29T13:23:45.477117Z",
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
    "id": "65c1ff3c-0096-4467-a0e1-bf118c381d5e",
    "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
    "expires_at": "2026-10-29T13:24:00.480802Z",
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

`POST /api/driver/v1/offers/65c1ff3c-0096-4467-a0e1-bf118c381d5e/accept` → **200**

```json
{
  "command_id": "cd7a9464-f677-4cf7-89b6-28839c32882f"
}
```

```json
{
  "id": "25cb4029-cffb-4028-a7d8-8786913d0827",
  "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "daaba4ca-cff5-446c-9e30-13aa50e3f25b",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "daaba4ca-cff5-446c-9e30-13aa50e3f25b",
  "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
  "assignment_id": "25cb4029-cffb-4028-a7d8-8786913d0827",
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

`POST /api/driver/v1/trips/daaba4ca-cff5-446c-9e30-13aa50e3f25b/cancel` → **200**

```json
{
  "command_id": "8d797b01-5783-48ec-a549-b4735ade63b9",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "daaba4ca-cff5-446c-9e30-13aa50e3f25b",
  "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
  "assignment_id": "25cb4029-cffb-4028-a7d8-8786913d0827",
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

`GET /api/rider/v1/orders/5755787d-f159-4a68-9ba7-f0d8ede2e92b` → **200**

```json
{
  "id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "394a483d-4031-4211-9d3b-480f8c061068",
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
    "id": "25cb4029-cffb-4028-a7d8-8786913d0827",
    "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "daaba4ca-cff5-446c-9e30-13aa50e3f25b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T13:23:45.477117Z",
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
    "id": "6e3096da-3570-40e7-ba7a-9e28e918ed91",
    "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
    "expires_at": "2026-10-29T13:24:01.255979Z",
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

`POST /api/driver/v1/offers/6e3096da-3570-40e7-ba7a-9e28e918ed91/accept` → **200**

```json
{
  "command_id": "3d990f0a-a928-45c1-bff3-10f244e461f3"
}
```

```json
{
  "id": "d90dc389-04e1-4894-bc88-2573eb387120",
  "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f6b1aff9-8bdf-4f31-a718-2a515f18e74c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f6b1aff9-8bdf-4f31-a718-2a515f18e74c",
  "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
  "assignment_id": "d90dc389-04e1-4894-bc88-2573eb387120",
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

`POST /api/driver/v1/trips/f6b1aff9-8bdf-4f31-a718-2a515f18e74c/cancel` → **200**

```json
{
  "command_id": "8500e208-21b7-47a1-a539-fa555a5cf708",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f6b1aff9-8bdf-4f31-a718-2a515f18e74c",
  "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
  "assignment_id": "d90dc389-04e1-4894-bc88-2573eb387120",
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
    "id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T13:23:45.477117Z",
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
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "3afed53b-0562-4a4c-a86f-2a3dc81b3155",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T13:23:43.463359Z",
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
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/5755787d-f159-4a68-9ba7-f0d8ede2e92b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T13:23:45.477823Z",
      "actor": {
        "type": "CLIENT",
        "id": "394a483d-4031-4211-9d3b-480f8c061068",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
        "quote_id": "3f173282-3753-44b3-839e-2a35c8971dc3",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "73e00a5f-7ec2-4ade-88ed-e296728fe102"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T13:23:45.479854Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
        "attempt_id": "b32cd69c-7033-4d7d-8a18-f9d55ba44b91",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "73e00a5f-7ec2-4ade-88ed-e296728fe102"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T13:23:45.486194Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "65c1ff3c-0096-4467-a0e1-bf118c381d5e",
        "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "73e00a5f-7ec2-4ade-88ed-e296728fe102"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T13:23:45.876862Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "65c1ff3c-0096-4467-a0e1-bf118c381d5e",
        "order_id": "5755787d-f159-4a68-9ba7-f0d8ede2e92b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "25cb4029-cffb-4028-a7d8-8786913d0827"
      },
      "correlation_id": "ee4e3571-3fcc-48b7-ab6b-8e9e1224d04d"
```

Done: orders 3afed53b-0562-4a4c-a86f-2a3dc81b3155, 5755787d-f159-4a68-9ba7-f0d8ede2e92b.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739786608",
  "device_ref": "sandbox-27995"
}
```

```json
{
  "challenge_id": "051c9be9-d278-4d67-a7c7-f7b449b89871",
  "expires_at": "2026-10-29T13:28:47.838941043Z",
  "resend_available_at": "2026-10-29T13:23:48.838941043Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739786608` → **200**

```json
{
  "phone": "+380739786608",
  "audience": "CLIENT",
  "code": "722955",
  "sent_at": "2026-10-29T13:23:47.842106445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "051c9be9-d278-4d67-a7c7-f7b449b89871",
  "code": "722955",
  "device_ref": "sandbox-27995"
}
```

```json
{
  "session_id": "4de9bd7b-3f16-4e4a-b354-21bd8d289514",
  "subject": {
    "type": "CLIENT",
    "id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTE0ZDJmNC0yNWU3LTQzMTEtOGFhZS02ZGQwNGJhMDEwYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTI4LCJpYXQiOjE3OTMyODAyMjgsImp0aSI6IjA5MTdmMTFjLTIxZDYtNDI1Zi05ZGM3LTNmYzE4MGNlYjYyNyIsInNpZCI6IjRkZTliZDdiLTNmMTYtNGU0YS1iMzU0LTIxYmQ4ZDI4OTUxNCJ9.8QQjCmTMldkzlcAoxWRWrMe-iUDkw5FHq6ptcgrFe7M",
  "access_expires_at": "2026-10-29T13:38:48.054976742Z",
  "refresh_token": "06jhQDolyojmw9R2SKL0OREyQGeVd7yBEIxxcl134Y4",
  "refresh_expires_at": "2026-11-28T13:23:48.05453935Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "41bb7fe7-9bec-436d-91e0-ed1cd5db5feb",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "716c6318-e14b-454b-bf81-82b02363da91",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-716c6318-e14b-454b-bf81-82b02363da91",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "62725060c1f376b85258c554f1fb3fe0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=716c6318-e14b-454b-bf81-82b02363da91",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739786608"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=716c6318-e14b-454b-bf81-82b02363da91",
  "expires_at": "2026-10-29T13:53:48.248393Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/716c6318-e14b-454b-bf81-82b02363da91` → **200**

```json
{
  "id": "716c6318-e14b-454b-bf81-82b02363da91",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T13:53:48.248393Z",
  "card": {
    "id": "e52262dd-659c-40f7-9bc7-a014a76df671",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2443",
    "card_type": "Visa",
    "created_at": "2026-10-29T13:23:48.455349Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e52262dd-659c-40f7-9bc7-a014a76df671",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2443",
      "card_type": "Visa",
      "created_at": "2026-10-29T13:23:48.455349Z"
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
  "device_ref": "sandbox-21864"
}
```

```json
{
  "challenge_id": "572c5f4c-df4f-4064-9dbe-e96c7276ef0f",
  "expires_at": "2026-10-29T13:28:48.851343242Z",
  "resend_available_at": "2026-10-29T13:23:49.851343242Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "919941",
  "sent_at": "2026-10-29T13:23:48.85383002Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "572c5f4c-df4f-4064-9dbe-e96c7276ef0f",
  "code": "919941",
  "device_ref": "sandbox-21864"
}
```

```json
{
  "session_id": "771a1297-b9b8-4598-aaf8-e1f669721974",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTEyOSwiaWF0IjoxNzkzMjgwMjI5LCJqdGkiOiI0NWFiMjkyOC01NWUyLTRjNzMtYjJiMi03NzA2ZDQ0NGZlYWQiLCJzaWQiOiI3NzFhMTI5Ny1iOWI4LTQ1OTgtYWFmOC1lMWY2Njk3MjE5NzQifQ.er-IXknqiCqQXLqid7lUFA5HWZwI7BbnxacIVWQgJzg",
  "access_expires_at": "2026-10-29T13:38:49.065526414Z",
  "refresh_token": "bKwOa39jStCX-IHJoJRiH36E3Q0-19VfPXLOGSNB3cg",
  "refresh_expires_at": "2026-11-28T13:23:49.065042803Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5764c5a8-9db7-4e06-8a23-da81ff434f40",
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
  "last_heartbeat_at": "2026-10-29T13:23:45.081366Z",
  "last_location_at": "2026-10-29T13:23:45.081366Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5764c5a8-9db7-4e06-8a23-da81ff434f40/handover` → **200**

```json
{
  "command_id": "d12055a7-63f8-4ce9-a0f7-436e442539c9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5764c5a8-9db7-4e06-8a23-da81ff434f40",
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
  "last_heartbeat_at": "2026-10-29T13:23:45.081366Z",
  "last_location_at": "2026-10-29T13:23:45.081366Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5764c5a8-9db7-4e06-8a23-da81ff434f40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:49Z",
    "sequence": 1793280229663
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5764c5a8-9db7-4e06-8a23-da81ff434f40",
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
  "last_heartbeat_at": "2026-10-29T13:23:49.680596Z",
  "last_location_at": "2026-10-29T13:23:49.680596Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "574ee9a2-a30e-4a17-b181-a88396b8aa98",
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
  "id": "3b529be3-a7fa-44fd-a3e2-a7a80f2f6f8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:28:49.874807Z",
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
  "command_id": "627c9c5e-9c5c-4377-b984-65e3582e70f5",
  "quote_id": "3b529be3-a7fa-44fd-a3e2-a7a80f2f6f8e",
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
  "id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
  "created_at": "2026-10-29T13:23:50.085894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240` → **200**

```json
{
  "id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
  "created_at": "2026-10-29T13:23:50.085894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240` → **200**

```json
{
  "id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
  "created_at": "2026-10-29T13:23:50.085894Z",
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
    "id": "a97b769b-abfe-425f-987d-c74901dbc625",
    "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
    "expires_at": "2026-10-29T13:24:05.582345Z",
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

`POST /api/driver/v1/offers/a97b769b-abfe-425f-987d-c74901dbc625/accept` → **200**

```json
{
  "command_id": "e7f982c5-f3b2-4dfe-81ee-00caa11ae175"
}
```

```json
{
  "id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "88682f91-f01c-499a-9102-98890e1527ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "88682f91-f01c-499a-9102-98890e1527ed",
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "assignment_id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
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

`POST /api/driver/v1/work-sessions/5764c5a8-9db7-4e06-8a23-da81ff434f40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:23:52Z",
    "sequence": 1793280232258
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5764c5a8-9db7-4e06-8a23-da81ff434f40",
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
  "last_heartbeat_at": "2026-10-29T13:23:52.274773Z",
  "last_location_at": "2026-10-29T13:23:52.274773Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/88682f91-f01c-499a-9102-98890e1527ed/arrive` → **200**

```json
{
  "command_id": "e590e778-147a-448f-a6dc-5a99baa7d54d",
  "expected_version": 0
}
```

```json
{
  "id": "88682f91-f01c-499a-9102-98890e1527ed",
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "assignment_id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
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
  "arrived_at": "2026-10-29T13:23:52.482549Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/88682f91-f01c-499a-9102-98890e1527ed/start` → **200**

```json
{
  "command_id": "539c5214-547a-4871-8240-337935e97fa2",
  "expected_version": 1
}
```

```json
{
  "id": "88682f91-f01c-499a-9102-98890e1527ed",
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "assignment_id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
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
  "arrived_at": "2026-10-29T13:23:52.482549Z",
  "started_at": "2026-10-29T13:23:52.696384Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/88682f91-f01c-499a-9102-98890e1527ed/complete` → **200**

```json
{
  "command_id": "2a707408-6b5b-477e-90c3-7e926e746baf",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:23:52Z",
  "cash_received": true
}
```

```json
{
  "id": "88682f91-f01c-499a-9102-98890e1527ed",
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "assignment_id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
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
  "arrived_at": "2026-10-29T13:23:52.482549Z",
  "started_at": "2026-10-29T13:23:52.696384Z",
  "completed_at": "2026-10-29T13:23:52.899904Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240` → **200**

```json
{
  "id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
    "id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
    "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88682f91-f01c-499a-9102-98890e1527ed",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:23:50.085894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240` → **200**

```json
{
  "id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
    "id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
    "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88682f91-f01c-499a-9102-98890e1527ed",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:23:50.085894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240` → **200**

```json
{
  "id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
    "id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
    "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88682f91-f01c-499a-9102-98890e1527ed",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:23:50.085894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240` → **200**

```json
{
  "id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
    "id": "3929e0e2-4ef6-4214-8806-30a0b3ae3368",
    "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "88682f91-f01c-499a-9102-98890e1527ed",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:23:50.085894Z",
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

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240/tip` → **200**

```json
{
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
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
  "available_until": "2026-10-30T13:23:52.899904Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240/tip` → **201**

```json
{
  "command_id": "691d4c02-ceff-4374-999f-ed6ec1a69aa9",
  "amount_minor": 2500
}
```

```json
{
  "id": "5c472665-fdf3-4bc3-b09a-59956c9b9b8f",
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T13:23:57.278435Z"
}
```

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240/tip` → **200**

```json
{
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
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
  "available_until": "2026-10-30T13:23:52.899904Z",
  "open": false,
  "tip": {
    "id": "5c472665-fdf3-4bc3-b09a-59956c9b9b8f",
    "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T13:23:57.278435Z"
  }
}
```

`GET /api/rider/v1/orders/288d1d1c-643b-439a-9300-472bbefb8240/tip` → **200**

```json
{
  "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
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
  "available_until": "2026-10-30T13:23:52.899904Z",
  "open": false,
  "tip": {
    "id": "5c472665-fdf3-4bc3-b09a-59956c9b9b8f",
    "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T13:23:57.278435Z"
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
      "id": "98dc004d-3cca-49f1-b8d4-a12610b2f27a",
      "at": "2026-10-29T13:23:58.681229Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
      "counterpart_id": null
    },
    {
      "id": "1cec7dad-2fe4-4bba-8144-e7344fa7bc0e",
      "at": "2026-10-29T13:23:53.637042Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "44df7fc8-dc89-40de-86fd-aff83445c1c2",
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
  "id": "ea2a5798-12a2-439e-9a7d-fde51728f713",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:28:59.076460Z",
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
  "session_id": "b087151e-e891-413f-9a39-3ecff1f4c201",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExMzksImlhdCI6MTc5MzI4MDIzOSwianRpIjoiMzRjZTA1ZWMtOTU2NS00MTY5LTk4MjYtN2RmMjI1ZjUyNzhjIiwic2lkIjoiYjA4NzE1MWUtZTg5MS00MTNmLTlhMzktM2VjZmYxZjRjMjAxIn0.ptZ5m9F86bRT4LnKar80xBR_4beuSwoDN_X9J_BxjMg",
  "access_expires_at": "2026-10-29T13:38:59.497206488Z",
  "refresh_token": "YiuD8Dx6BLHmJQ_2xEoxRz4k8xzeUV3xA2wEDgK3oNg",
  "refresh_expires_at": "2026-10-30T01:23:59.496842538Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739786608` → **200**

```json
{
  "client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae"
}
```

`POST /api/admin/v1/rider-wallets/1a14d2f4-25e7-4311-8aae-6dd04ba010ae/top-ups` → **201**

```json
{
  "command_id": "fe3de5d3-506e-4b10-9644-4eb085507178",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
      "id": "756ddb16-b372-4a94-8f3d-9bddb1d42900",
      "at": "2026-10-29T13:23:59.880871Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "670fc303-2af0-4b8c-ba6e-cbe2696815f9",
  "quote_id": "ea2a5798-12a2-439e-9a7d-fde51728f713",
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
  "id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
  "created_at": "2026-10-29T13:24:00.085205Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa` → **200**

```json
{
  "id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
  "created_at": "2026-10-29T13:24:00.085205Z",
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
    "id": "98f2b891-0d9a-4900-ae42-e3d4e64a1173",
    "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
    "expires_at": "2026-10-29T13:24:15.088863Z",
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

`POST /api/driver/v1/offers/98f2b891-0d9a-4900-ae42-e3d4e64a1173/accept` → **200**

```json
{
  "command_id": "011b2f07-d51d-4982-a7fe-d2ae64078b89"
}
```

```json
{
  "id": "d7bb9a1b-2591-4772-a2f6-29683bba202a",
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "92149e59-e19a-4263-afb0-ae786eef30ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "92149e59-e19a-4263-afb0-ae786eef30ac",
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
  "assignment_id": "d7bb9a1b-2591-4772-a2f6-29683bba202a",
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

`POST /api/driver/v1/work-sessions/5764c5a8-9db7-4e06-8a23-da81ff434f40/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:24:01Z",
    "sequence": 1793280241789
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5764c5a8-9db7-4e06-8a23-da81ff434f40",
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
  "last_heartbeat_at": "2026-10-29T13:24:01.095538Z",
  "last_location_at": "2026-10-29T13:24:01.095538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/92149e59-e19a-4263-afb0-ae786eef30ac/arrive` → **200**

```json
{
  "command_id": "6bc6bcdb-5cb6-4709-8bf3-a70de9e758f2",
  "expected_version": 0
}
```

```json
{
  "id": "92149e59-e19a-4263-afb0-ae786eef30ac",
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
  "assignment_id": "d7bb9a1b-2591-4772-a2f6-29683bba202a",
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
  "arrived_at": "2026-10-29T13:24:01.283774Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/92149e59-e19a-4263-afb0-ae786eef30ac/start` → **200**

```json
{
  "command_id": "a5884506-b00b-48b9-bdc0-186c777f33b7",
  "expected_version": 1
}
```

```json
{
  "id": "92149e59-e19a-4263-afb0-ae786eef30ac",
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
  "assignment_id": "d7bb9a1b-2591-4772-a2f6-29683bba202a",
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
  "arrived_at": "2026-10-29T13:24:01.283774Z",
  "started_at": "2026-10-29T13:24:01.4838Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/92149e59-e19a-4263-afb0-ae786eef30ac/complete` → **200**

```json
{
  "command_id": "12b5e12a-db7e-47f5-8a92-569b3ea5b6a0",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:24:01Z",
  "cash_received": true
}
```

```json
{
  "id": "92149e59-e19a-4263-afb0-ae786eef30ac",
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
  "assignment_id": "d7bb9a1b-2591-4772-a2f6-29683bba202a",
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
  "arrived_at": "2026-10-29T13:24:01.283774Z",
  "started_at": "2026-10-29T13:24:01.4838Z",
  "completed_at": "2026-10-29T13:24:01.693216Z",
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
  "client_id": "1a14d2f4-25e7-4311-8aae-6dd04ba010ae",
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
      "id": "756ddb16-b372-4a94-8f3d-9bddb1d42900",
      "at": "2026-10-29T13:23:59.880871Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
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

`GET /api/rider/v1/orders/d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa/tip` → **200**

```json
{
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
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
  "available_until": "2026-10-30T13:24:01.693216Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa/tip` → **201**

```json
{
  "command_id": "6482839d-4f05-4acb-a14e-eb400149c471",
  "amount_minor": 2500
}
```

```json
{
  "id": "42508f01-cd02-43eb-a621-db97846dc52c",
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T13:24:02.478064Z"
}
```

`GET /api/rider/v1/orders/d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa/tip` → **200**

```json
{
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
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
  "available_until": "2026-10-30T13:24:01.693216Z",
  "open": false,
  "tip": {
    "id": "42508f01-cd02-43eb-a621-db97846dc52c",
    "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T13:24:02.478064Z"
  }
}
```

`GET /api/rider/v1/orders/d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa/tip` → **200**

```json
{
  "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
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
  "available_until": "2026-10-30T13:24:01.693216Z",
  "open": false,
  "tip": {
    "id": "42508f01-cd02-43eb-a621-db97846dc52c",
    "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T13:24:02.478064Z"
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
      "id": "ffa283dd-a087-4700-87c8-826d429c8711",
      "at": "2026-10-29T13:24:03.741991Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
      "counterpart_id": null
    },
    {
      "id": "11f3691d-7bfa-49dc-a0fd-ae8691a59f16",
      "at": "2026-10-29T13:24:02.727155Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa",
      "counterpart_id": null
    },
    {
      "id": "98dc004d-3cca-49f1-b8d4-a12610b2f27a",
      "at": "2026-10-29T13:23:58.681229Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
      "counterpart_id": null
    },
    {
      "id": "1cec7dad-2fe4-4bba-8144-e7344fa7bc0e",
      "at": "2026-10-29T13:23:53.637042Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "288d1d1c-643b-439a-9300-472bbefb8240",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5764c5a8-9db7-4e06-8a23-da81ff434f40",
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
  "last_heartbeat_at": "2026-10-29T13:24:01.095538Z",
  "last_location_at": "2026-10-29T13:24:01.095538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5764c5a8-9db7-4e06-8a23-da81ff434f40/close` → **200**

```json
{
  "command_id": "71af8b1c-1255-46ac-8787-6b0b2452adb3",
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

Done: card order d1836cd4-f6d9-4a59-a1dd-37abfd6a2cfa.

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
  "phone": "+380734898272",
  "device_ref": "sandbox-23181"
}
```

```json
{
  "challenge_id": "1cab476c-4800-4530-90b3-27e5770df51e",
  "expires_at": "2026-10-29T13:29:04.844919489Z",
  "resend_available_at": "2026-10-29T13:24:05.844919489Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734898272` → **200**

```json
{
  "phone": "+380734898272",
  "audience": "CLIENT",
  "code": "902269",
  "sent_at": "2026-10-29T13:24:04.847865751Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cab476c-4800-4530-90b3-27e5770df51e",
  "code": "902269",
  "device_ref": "sandbox-23181"
}
```

```json
{
  "session_id": "206e9780-3e63-4244-87cf-e9c0d55a0dfa",
  "subject": {
    "type": "CLIENT",
    "id": "22eb4d09-f517-4514-84de-a6d34302d580"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMmViNGQwOS1mNTE3LTQ1MTQtODRkZS1hNmQzNDMwMmQ1ODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTQ1LCJpYXQiOjE3OTMyODAyNDUsImp0aSI6IjY1NmIwMzk2LWQ4OGYtNDJmNy04M2JjLTRiODliMjI5MDEzNCIsInNpZCI6IjIwNmU5NzgwLTNlNjMtNDI0NC04N2NmLWU5YzBkNTVhMGRmYSJ9.f3WOYKExYYrdg54123L6LlQlSc2DN02oBs-4gajeA_U",
  "access_expires_at": "2026-10-29T13:39:05.073456628Z",
  "refresh_token": "moFKj2nFIW7dUMaZu0p3eR66Pp0-GUScDdCulMUg2Mg",
  "refresh_expires_at": "2026-11-28T13:24:05.073023334Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "47a8fc1f-44d1-4bea-a51b-fc6225032725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "3311ea92-7ddb-4296-9189-efb19829be4a",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-3311ea92-7ddb-4296-9189-efb19829be4a",
    "orderDate": "1793280245",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "180639e3bf2bea39de9cbcf038bb5a36",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=3311ea92-7ddb-4296-9189-efb19829be4a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734898272"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=3311ea92-7ddb-4296-9189-efb19829be4a",
  "created_at": "2026-10-29T13:24:05.270597Z",
  "expires_at": "2026-10-29T13:54:05.270597Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/3311ea92-7ddb-4296-9189-efb19829be4a` → **200**

```json
{
  "id": "3311ea92-7ddb-4296-9189-efb19829be4a",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T13:24:05.270597Z",
  "expires_at": "2026-10-29T13:54:05.270597Z",
  "completed_at": "2026-10-29T13:24:05.471459Z",
  "masked_pan": "41****9487",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "22eb4d09-f517-4514-84de-a6d34302d580",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "22eb4d09-f517-4514-84de-a6d34302d580",
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
      "id": "5a78c6d4-707f-484c-9745-5c5dab83bdac",
      "at": "2026-10-29T13:24:05.753346Z",
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
  "client_id": "22eb4d09-f517-4514-84de-a6d34302d580",
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
      "id": "5a78c6d4-707f-484c-9745-5c5dab83bdac",
      "at": "2026-10-29T13:24:05.753346Z",
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
  "device_ref": "sandbox-6546"
}
```

```json
{
  "challenge_id": "ccd65dd0-0f45-4a4e-bc0b-a7d1b6336cd0",
  "expires_at": "2026-10-29T13:29:07.262279943Z",
  "resend_available_at": "2026-10-29T13:24:08.262279943Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "079401",
  "sent_at": "2026-10-29T13:24:07.264665739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ccd65dd0-0f45-4a4e-bc0b-a7d1b6336cd0",
  "code": "079401",
  "device_ref": "sandbox-6546"
}
```

```json
{
  "session_id": "575e8619-c3ba-4668-82cc-df31e4e50203",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTE0NywiaWF0IjoxNzkzMjgwMjQ3LCJqdGkiOiIwYmMzOTAyMS1hMzhhLTRjMDItYTgyZi1hNGM4NTQ0Y2E5YzAiLCJzaWQiOiI1NzVlODYxOS1jM2JhLTQ2NjgtODJjYy1kZjMxZTRlNTAyMDMifQ.2E9E5p5woTIDvUKDppq0nKEk0f5ALpajg6ncfBXlbdI",
  "access_expires_at": "2026-10-29T13:39:07.487897991Z",
  "refresh_token": "FW5w-934wMp8gnYsTTLRPVbwYjJ0wEoniRwgq33EmOk",
  "refresh_expires_at": "2026-11-28T13:24:07.487529975Z",
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
  "command_id": "e2668ccd-0b29-4d30-abe6-a4ae2ba308df",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "eb959acc-8b79-4ca2-8bd5-7126d130a9c5",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-eb959acc-8b79-4ca2-8bd5-7126d130a9c5",
    "orderDate": "1793280247",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "4d7661d81e57ce9bed740f1462edcbba",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=eb959acc-8b79-4ca2-8bd5-7126d130a9c5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=eb959acc-8b79-4ca2-8bd5-7126d130a9c5",
  "created_at": "2026-10-29T13:24:07.919233Z",
  "expires_at": "2026-10-29T13:54:07.919233Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/eb959acc-8b79-4ca2-8bd5-7126d130a9c5` → **200**

```json
{
  "id": "eb959acc-8b79-4ca2-8bd5-7126d130a9c5",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T13:24:07.919233Z",
  "expires_at": "2026-10-29T13:54:07.919233Z",
  "completed_at": "2026-10-29T13:24:08.115171Z",
  "masked_pan": "41****1001",
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
      "id": "967754e7-7918-47d9-bcc7-9cad24600d70",
      "at": "2026-10-29T13:24:08.761448Z",
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
  "command_id": "9732aa6c-7408-45bb-8065-1f594cda7ac4",
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
  "correlation_id": "5750ade9-070d-48bf-878f-5dbf0f10b565"
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
  "device_ref": "sandbox-4315"
}
```

```json
{
  "challenge_id": "18837b0a-61b9-46a3-97ee-d1de3eb190ab",
  "expires_at": "2026-10-29T13:29:09.924887227Z",
  "resend_available_at": "2026-10-29T13:24:10.924887227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "202764",
  "sent_at": "2026-10-29T13:24:09.927095805Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18837b0a-61b9-46a3-97ee-d1de3eb190ab",
  "code": "202764",
  "device_ref": "sandbox-4315"
}
```

```json
{
  "session_id": "88e79ef2-f4e0-4eaa-8041-1810df952b7b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTE1MCwiaWF0IjoxNzkzMjgwMjUwLCJqdGkiOiI2ZTNiY2JiNC01YjFhLTQ2YmYtOGFlMy01ZmVjN2MyZDA0ZGIiLCJzaWQiOiI4OGU3OWVmMi1mNGUwLTRlYWEtODA0MS0xODEwZGY5NTJiN2IifQ.a_YR325tvxTCoFomMZHaR3TQjK7F6woFZnWBnVkliEY",
  "access_expires_at": "2026-10-29T13:39:10.139752056Z",
  "refresh_token": "wkQByYuGB8EOFA596jXmKxdPkzNXJlUIch8iv6cKv-0",
  "refresh_expires_at": "2026-11-28T13:24:10.139198368Z",
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
  "command_id": "cff7a90f-0683-471a-876b-6b3fd4d82645",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:24:10Z",
    "sequence": 1793280250522
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "442550e7-1300-4b80-8417-1ef5e0290f91",
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
  "last_heartbeat_at": "2026-10-29T13:24:10.538748Z",
  "last_location_at": "2026-10-29T13:24:10.538748Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639947621",
  "device_ref": "sandbox-12896"
}
```

```json
{
  "challenge_id": "809faea8-060c-4d9a-9a5d-d8d6ed642a66",
  "expires_at": "2026-10-29T13:29:10.736642365Z",
  "resend_available_at": "2026-10-29T13:24:11.736642365Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639947621` → **200**

```json
{
  "phone": "+380639947621",
  "audience": "CLIENT",
  "code": "828183",
  "sent_at": "2026-10-29T13:24:10.738800904Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "809faea8-060c-4d9a-9a5d-d8d6ed642a66",
  "code": "828183",
  "device_ref": "sandbox-12896"
}
```

```json
{
  "session_id": "98b08834-b634-4fac-b5f5-4adb5ac5a84f",
  "subject": {
    "type": "CLIENT",
    "id": "15ee474c-548d-4bcc-af82-882dcd73af31"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWVlNDc0Yy01NDhkLTRiY2MtYWY4Mi04ODJkY2Q3M2FmMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTUwLCJpYXQiOjE3OTMyODAyNTAsImp0aSI6IjFkNDMxNDYxLTc2MWYtNDdmNS05ZGYxLWZhMTBlZmQwZTM0NyIsInNpZCI6Ijk4YjA4ODM0LWI2MzQtNGZhYy1iNWY1LTRhZGI1YWM1YTg0ZiJ9.iSAkP8-TKVXuaPU183oQLVMqbCs19NOhYVgKZL9MYd0",
  "access_expires_at": "2026-10-29T13:39:10.954433268Z",
  "refresh_token": "TgsEFXxw8GJrb33MRjNFJQzLcPGL1rhYV4TaC2HtUx8",
  "refresh_expires_at": "2026-11-28T13:24:10.954006813Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a060921d-63ed-4726-90b6-8b9c3427b8c3",
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
  "id": "a16c9348-94fa-4f00-96da-174eb0584f07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:29:11.152261Z",
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
  "command_id": "7da0dbbb-fc09-40a4-93ed-4fe729cbe365",
  "quote_id": "a16c9348-94fa-4f00-96da-174eb0584f07",
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
  "id": "75780af9-3674-4090-9604-9158e8f08a42",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15ee474c-548d-4bcc-af82-882dcd73af31",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:24:11.351768Z",
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
    "id": "980c723f-850f-4f83-a6b8-c015a18a4702",
    "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
    "expires_at": "2026-10-29T13:24:26.353892Z",
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

`POST /api/driver/v1/offers/980c723f-850f-4f83-a6b8-c015a18a4702/accept` → **200**

```json
{
  "command_id": "d9871959-3f36-457e-b761-c22065b6edae"
}
```

```json
{
  "id": "77860286-7966-42f3-8ad5-d3ac7af91753",
  "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f",
  "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
  "assignment_id": "77860286-7966-42f3-8ad5-d3ac7af91753",
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

`POST /api/driver/v1/work-sessions/442550e7-1300-4b80-8417-1ef5e0290f91/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:24:12Z",
    "sequence": 1793280252124
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "442550e7-1300-4b80-8417-1ef5e0290f91",
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
  "last_heartbeat_at": "2026-10-29T13:24:12.141221Z",
  "last_location_at": "2026-10-29T13:24:12.141221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f/arrive` → **200**

```json
{
  "command_id": "62943433-8bbc-4443-ab9b-859a9d91da77",
  "expected_version": 0
}
```

```json
{
  "id": "fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f",
  "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
  "assignment_id": "77860286-7966-42f3-8ad5-d3ac7af91753",
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
  "arrived_at": "2026-10-29T13:24:12.339409Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f/start` → **200**

```json
{
  "command_id": "910b6206-50fd-4c91-9756-329c52cea4f9",
  "expected_version": 1
}
```

```json
{
  "id": "fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f",
  "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
  "assignment_id": "77860286-7966-42f3-8ad5-d3ac7af91753",
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
  "arrived_at": "2026-10-29T13:24:12.339409Z",
  "started_at": "2026-10-29T13:24:12.536177Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f/complete` → **200**

```json
{
  "command_id": "dad1a50c-d008-4578-89c4-a28764e11d96",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:24:12Z",
  "cash_received": false
}
```

```json
{
  "id": "fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f",
  "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
  "assignment_id": "77860286-7966-42f3-8ad5-d3ac7af91753",
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
  "arrived_at": "2026-10-29T13:24:12.339409Z",
  "started_at": "2026-10-29T13:24:12.536177Z",
  "completed_at": "2026-10-29T13:24:12.752303Z",
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
  "session_id": "aa4b4f63-7a61-4233-84a8-63eb7d946624",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExNTMsImlhdCI6MTc5MzI4MDI1MywianRpIjoiNWQwZjJkODktNGJiMi00YjNkLWI0YjgtNDEzN2NiMTA5NGMzIiwic2lkIjoiYWE0YjRmNjMtN2E2MS00MjMzLTg0YTgtNjNlYjdkOTQ2NjI0In0.YCdFRYi1VWXL0saJBDRl5n1x7KtVqflqcsRxvqULJps",
  "access_expires_at": "2026-10-29T13:39:13.170924509Z",
  "refresh_token": "2NblWSS5cWtesjcgaF7LxALPD6BgD8PQuolm3M_NZVs",
  "refresh_expires_at": "2026-10-30T01:24:13.170536243Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/75780af9-3674-4090-9604-9158e8f08a42/cash-dispute` → **200**

```json
{
  "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "15ee474c-548d-4bcc-af82-882dcd73af31",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T13:24:12.793501Z",
  "decide_by": "2026-11-12T13:24:12.793501Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T13:24:12.793501Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "15ee474c-548d-4bcc-af82-882dcd73af31",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T13:24:12.793501Z",
      "decide_by": "2026-11-12T13:24:12.793501Z",
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

`POST /api/admin/v1/orders/75780af9-3674-4090-9604-9158e8f08a42/cash-dispute/decide` → **400**

```json
{
  "command_id": "6ab23816-69cf-4087-bb7f-7a70b350adec",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/75780af9-3674-4090-9604-9158e8f08a42/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "17791b10-2126-46cf-a9df-fccfe9366407",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/75780af9-3674-4090-9604-9158e8f08a42/cash-dispute/decide` → **200**

```json
{
  "command_id": "d7df3b7f-8068-484f-b19f-4de2a2828ead",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "15ee474c-548d-4bcc-af82-882dcd73af31",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T13:24:12.793501Z",
  "decide_by": "2026-11-12T13:24:12.793501Z",
  "decision": "PAY_DRIVER",
  "decided_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T13:24:13.95819Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/75780af9-3674-4090-9604-9158e8f08a42/cash-dispute/decide` → **409**

```json
{
  "command_id": "3b13e29a-badf-4b6a-893f-48d4252241a1",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/75780af9-3674-4090-9604-9158e8f08a42/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "be562ec7-ccbf-45d9-9137-664472985b4f"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "442550e7-1300-4b80-8417-1ef5e0290f91",
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
  "last_heartbeat_at": "2026-10-29T13:24:12.141221Z",
  "last_location_at": "2026-10-29T13:24:12.141221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/442550e7-1300-4b80-8417-1ef5e0290f91/close` → **200**

```json
{
  "command_id": "8782ea8f-bfa9-413c-90e9-567284696be0",
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
  "phone": "+380732315337",
  "device_ref": "sandbox-15258"
}
```

```json
{
  "challenge_id": "4ba318dd-07d2-49aa-8df6-dfe8b2e40180",
  "expires_at": "2026-10-29T13:29:14.752122607Z",
  "resend_available_at": "2026-10-29T13:24:15.752122607Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732315337` → **200**

```json
{
  "phone": "+380732315337",
  "audience": "CLIENT",
  "code": "479365",
  "sent_at": "2026-10-29T13:24:14.754220117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ba318dd-07d2-49aa-8df6-dfe8b2e40180",
  "code": "479365",
  "device_ref": "sandbox-15258"
}
```

```json
{
  "session_id": "80d57c64-5e4d-4de5-a2d4-2439d1f86ee3",
  "subject": {
    "type": "CLIENT",
    "id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTViNWE5NS05MWI4LTRlM2EtYTJjNi1kZjQwMzVmNDg3OWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTU0LCJpYXQiOjE3OTMyODAyNTQsImp0aSI6IjllMjhkMmU0LWRhZTctNDFiYS04MGMxLTA0MDdmNDg1YTY1NCIsInNpZCI6IjgwZDU3YzY0LTVlNGQtNGRlNS1hMmQ0LTI0MzlkMWY4NmVlMyJ9.dJIL_HzgSFHhGIMLOoRltwgBiZinZZd20FqdmQ0WBP4",
  "access_expires_at": "2026-10-29T13:39:14.969329331Z",
  "refresh_token": "VPxIs3_nru41ND-w82q3fsn__nhyYa1M4WO-0H4aVrM",
  "refresh_expires_at": "2026-11-28T13:24:14.968921654Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "bda10ea3-eb99-413f-a15c-8a8aae2b9ba0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b913c6c7-98f4-4e4b-9a2c-8c2cb5fed1d1",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b913c6c7-98f4-4e4b-9a2c-8c2cb5fed1d1",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "563f2f42b47457870fe75d39537d1440",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b913c6c7-98f4-4e4b-9a2c-8c2cb5fed1d1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732315337"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b913c6c7-98f4-4e4b-9a2c-8c2cb5fed1d1",
  "expires_at": "2026-10-29T13:54:15.157178Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b913c6c7-98f4-4e4b-9a2c-8c2cb5fed1d1` → **200**

```json
{
  "id": "b913c6c7-98f4-4e4b-9a2c-8c2cb5fed1d1",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T13:54:15.157178Z",
  "card": {
    "id": "252f96bf-245d-4470-8b45-ef1767522397",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1422",
    "card_type": "Visa",
    "created_at": "2026-10-29T13:24:15.352089Z"
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
  "device_ref": "sandbox-29045"
}
```

```json
{
  "challenge_id": "c4a58676-72d1-43c6-b6a5-9f6edda9be23",
  "expires_at": "2026-10-29T13:29:15.564696251Z",
  "resend_available_at": "2026-10-29T13:24:16.564696251Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "710491",
  "sent_at": "2026-10-29T13:24:15.566695642Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4a58676-72d1-43c6-b6a5-9f6edda9be23",
  "code": "710491",
  "device_ref": "sandbox-29045"
}
```

```json
{
  "session_id": "c256a8c0-f0a4-46ec-b0d9-10131d71ba0f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTE1NSwiaWF0IjoxNzkzMjgwMjU1LCJqdGkiOiI0M2RlZjRlNC0yNDM2LTRiMDgtOTA4MC1lNWExZjlmM2Y4NmMiLCJzaWQiOiJjMjU2YThjMC1mMGE0LTQ2ZWMtYjBkOS0xMDEzMWQ3MWJhMGYifQ.iTe_p6acw2GOS1YYSgkYcSRNRDFgSM3WNkvJbshXB7o",
  "access_expires_at": "2026-10-29T13:39:15.783629425Z",
  "refresh_token": "loFU35JLjX1NOCnhRjG_ORo_0luLso1Ou8PUUwl7SmQ",
  "refresh_expires_at": "2026-11-28T13:24:15.783164852Z",
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
  "command_id": "9aee855b-c4f1-450a-8940-c9b9760fb146",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:24:16Z",
    "sequence": 1793280256149
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "304a59e4-178f-4c25-94db-8b2106771bbe",
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
  "last_heartbeat_at": "2026-10-29T13:24:16.165945Z",
  "last_location_at": "2026-10-29T13:24:16.165945Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e37bab4-71d3-43c2-b203-1499c09eafc9",
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
  "id": "8650755f-381c-4374-a5c4-88d19db7c3a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:29:16.358399Z",
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
  "command_id": "2a136b95-6a05-40bf-bb12-e2f94b413e08",
  "quote_id": "8650755f-381c-4374-a5c4-88d19db7c3a2",
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
  "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
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
  "created_at": "2026-10-29T13:24:16.551446Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4` → **200**

```json
{
  "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
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
  "created_at": "2026-10-29T13:24:16.551446Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4` → **200**

```json
{
  "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
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
  "created_at": "2026-10-29T13:24:16.551446Z",
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
    "id": "276ac1f4-500f-4735-af85-225f6cf45619",
    "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
    "expires_at": "2026-10-29T13:24:31.824221Z",
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

`POST /api/driver/v1/offers/276ac1f4-500f-4735-af85-225f6cf45619/accept` → **200**

```json
{
  "command_id": "7ce0961d-59fe-4c82-b1a0-46f937aec7c7"
}
```

```json
{
  "id": "26241788-857a-446b-8b48-dbc721fcaf3e",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "07862257-c271-4322-a332-e62f7f2187e5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "07862257-c271-4322-a332-e62f7f2187e5",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "assignment_id": "26241788-857a-446b-8b48-dbc721fcaf3e",
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

`POST /api/rider/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/messages` → **201**

```json
{
  "command_id": "27cf6852-3c0b-45ff-8158-71f6fbb2890f",
  "body": "Я біля входу, мій номер +380732315337, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "4db9d775-465b-4c38-8d7a-4fb6ad30e568",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380732315337, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T13:24:18.706803481Z"
}
```

`POST /api/driver/v1/trips/07862257-c271-4322-a332-e62f7f2187e5/messages` → **201**

```json
{
  "command_id": "396da332-5d7b-4871-b209-d4d83a73ff40",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "75a7eb53-51fd-4a00-a6d2-e4248e80141c",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T13:24:18.902304686Z"
}
```

`POST /api/driver/v1/work-sessions/304a59e4-178f-4c25-94db-8b2106771bbe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:24:19Z",
    "sequence": 1793280259817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "304a59e4-178f-4c25-94db-8b2106771bbe",
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
  "last_heartbeat_at": "2026-10-29T13:24:19.098695Z",
  "last_location_at": "2026-10-29T13:24:19.098695Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/07862257-c271-4322-a332-e62f7f2187e5/arrive` → **200**

```json
{
  "command_id": "406ac4be-031e-4ac1-a162-96650fdfac90",
  "expected_version": 0
}
```

```json
{
  "id": "07862257-c271-4322-a332-e62f7f2187e5",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "assignment_id": "26241788-857a-446b-8b48-dbc721fcaf3e",
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
  "arrived_at": "2026-10-29T13:24:19.300152Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/07862257-c271-4322-a332-e62f7f2187e5/start` → **200**

```json
{
  "command_id": "a03ea872-6109-482b-9083-aebf9db73d6e",
  "expected_version": 1
}
```

```json
{
  "id": "07862257-c271-4322-a332-e62f7f2187e5",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "assignment_id": "26241788-857a-446b-8b48-dbc721fcaf3e",
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
  "arrived_at": "2026-10-29T13:24:19.300152Z",
  "started_at": "2026-10-29T13:24:19.503352Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/304a59e4-178f-4c25-94db-8b2106771bbe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:24:19Z",
    "sequence": 1793280259818
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "304a59e4-178f-4c25-94db-8b2106771bbe",
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
  "last_heartbeat_at": "2026-10-29T13:24:19.712589Z",
  "last_location_at": "2026-10-29T13:24:19.712589Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/07862257-c271-4322-a332-e62f7f2187e5/complete` → **200**

```json
{
  "command_id": "559724ac-eb54-4a7e-a85b-2eeaf346af0d",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:24:19Z",
  "cash_received": false
}
```

```json
{
  "id": "07862257-c271-4322-a332-e62f7f2187e5",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "assignment_id": "26241788-857a-446b-8b48-dbc721fcaf3e",
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
  "arrived_at": "2026-10-29T13:24:19.300152Z",
  "started_at": "2026-10-29T13:24:19.503352Z",
  "completed_at": "2026-10-29T13:24:19.915567Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4` → **200**

```json
{
  "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
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
    "id": "26241788-857a-446b-8b48-dbc721fcaf3e",
    "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "07862257-c271-4322-a332-e62f7f2187e5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:24:16.551446Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4` → **200**

```json
{
  "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
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
    "id": "26241788-857a-446b-8b48-dbc721fcaf3e",
    "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "07862257-c271-4322-a332-e62f7f2187e5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:24:16.551446Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4` → **200**

```json
{
  "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
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
    "id": "26241788-857a-446b-8b48-dbc721fcaf3e",
    "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "07862257-c271-4322-a332-e62f7f2187e5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:24:16.551446Z",
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
  "session_id": "304a59e4-178f-4c25-94db-8b2106771bbe",
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
  "last_heartbeat_at": "2026-10-29T13:24:19.712589Z",
  "last_location_at": "2026-10-29T13:24:19.712589Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/304a59e4-178f-4c25-94db-8b2106771bbe/close` → **200**

```json
{
  "command_id": "5f228a4f-ea4b-4e8b-badf-bddef85bad56",
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
  "session_id": "5ab43e0f-9956-4867-9619-96a174d9cbf6",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExNjMsImlhdCI6MTc5MzI4MDI2MywianRpIjoiODY3OTI1NjctOTc3ZS00NTcyLWI2NzctYWQ1NDE3NGVmYTdiIiwic2lkIjoiNWFiNDNlMGYtOTk1Ni00ODY3LTk2MTktOTZhMTc0ZDljYmY2In0.Xq1grNSjahthdci57V8lPf1pzgTD2HOS3hHSzQVTth0",
  "access_expires_at": "2026-10-29T13:39:23.34623803Z",
  "refresh_token": "rLLUEEhudAs5k54cdHMtPOu86P6P8EBbNsWrxZxuzbQ",
  "refresh_expires_at": "2026-10-30T01:24:23.345924836Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "33b6554e-66b3-43c9-8da6-dbb58a56d923"
}
```

`GET /api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T13:24:23.723570406Z",
  "order": {
    "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
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
    "created_at": "2026-10-29T13:24:16.551446Z",
    "assigned_at": "2026-10-29T13:24:18.3252Z",
    "arrived_at": "2026-10-29T13:24:19.300152Z",
    "started_at": "2026-10-29T13:24:19.503352Z",
    "completed_at": "2026-10-29T13:24:19.915567Z"
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
    "id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
    "registered_at": "2026-10-29T13:24:14.967209Z",
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
      "created_at": "2026-10-29T13:24:16.553359Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T13:24:20.871203Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/chargebacks` → **422**

```json
{
  "command_id": "5d5544cb-a517-4141-9db4-6cab5130c181",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "d68c93ad-ba35-4d7e-9895-c493294b7739"
}
```

`POST /api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/chargebacks` → **201**

```json
{
  "command_id": "59a33912-2976-409c-a858-c54dabaf344c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "4e1c6312-2dd0-40a6-b450-963930a3172e",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T13:24:24.161148Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/chargebacks` → **201**

```json
{
  "command_id": "59a33912-2976-409c-a858-c54dabaf344c",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "4e1c6312-2dd0-40a6-b450-963930a3172e",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T13:24:24.161148Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/9a5b5a95-91b8-4e3a-a2c6-df4035f4879a` → **200**

```json
{
  "client": {
    "id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
    "phone": "+380732315337",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T13:24:14.967209Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T13:24:16.551446Z",
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

`GET /api/admin/v1/clients/9a5b5a95-91b8-4e3a-a2c6-df4035f4879a` → **200**

```json
{
  "client": {
    "id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
    "phone": "+380732315337",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T13:24:14.967209Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T13:24:16.551446Z",
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

`POST /api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/chargebacks/4e1c6312-2dd0-40a6-b450-963930a3172e/resolve` → **200**

```json
{
  "command_id": "8ba17b53-09f0-439d-825d-5005d8df51ba",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "4e1c6312-2dd0-40a6-b450-963930a3172e",
  "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T13:24:24.161148Z",
  "resolved_at": "2026-10-29T13:24:25.967951Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/9a5b5a95-91b8-4e3a-a2c6-df4035f4879a` → **200**

```json
{
  "client": {
    "id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
    "phone": "+380732315337",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T13:24:14.967209Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T13:24:16.551446Z",
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

`GET /api/admin/v1/clients/9a5b5a95-91b8-4e3a-a2c6-df4035f4879a` → **200**

```json
{
  "client": {
    "id": "9a5b5a95-91b8-4e3a-a2c6-df4035f4879a",
    "phone": "+380732315337",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T13:24:14.967209Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T13:24:16.551446Z",
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

`POST /api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/chargebacks/4e1c6312-2dd0-40a6-b450-963930a3172e/resolve` → **409**

```json
{
  "command_id": "81ffa99c-fbb0-42bc-9e33-8dea748a38ec",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/chargebacks/4e1c6312-2dd0-40a6-b450-963930a3172e/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "82071296-eea4-4fb3-b4c9-fa4f0ea61409"
}
```

`GET /api/admin/v1/orders/e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "4e1c6312-2dd0-40a6-b450-963930a3172e",
      "order_id": "e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T13:24:24.161148Z",
      "resolved_at": "2026-10-29T13:24:25.967951Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order e0f0a87b-62c1-4cb2-9ba3-87c29c3738c4 without phone or card digits; chargeback 4e1c6312-2dd0-40a6-b450-963930a3172e recorded and won.

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
  "session_id": "01695034-b1ce-4bd7-a242-a5ebc4ea7997",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExNjgsImlhdCI6MTc5MzI4MDI2OCwianRpIjoiOTAzMWI5ZWYtNTFlZi00NjA0LWE0MWYtYjBlOWQ1N2Q3ZTYxIiwic2lkIjoiMDE2OTUwMzQtYjFjZS00YmQ3LWEyNDItYTVlYmM0ZWE3OTk3In0.QkstHG72bUEN3SO1MpsJjA0Fh1CCwQfGPGhLzUWznR0",
  "access_expires_at": "2026-10-29T13:39:28.391757276Z",
  "refresh_token": "EYAohc14_K-dkgGf9ArFR_1Svu7ikc05Ogw0efrBDLQ",
  "refresh_expires_at": "2026-10-30T01:24:28.391437162Z",
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
  "phone": "+48600682377",
  "device_ref": "sandbox-6595"
}
```

```json
{
  "challenge_id": "c252350f-5958-46cd-b072-255a688bb456",
  "expires_at": "2026-10-29T13:29:28.969708765Z",
  "resend_available_at": "2026-10-29T13:24:29.969708765Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600682377` → **200**

```json
{
  "phone": "+48600682377",
  "audience": "CLIENT",
  "code": "864964",
  "sent_at": "2026-10-29T13:24:28.973504588Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c252350f-5958-46cd-b072-255a688bb456",
  "code": "864964",
  "device_ref": "sandbox-6595"
}
```

```json
{
  "session_id": "a037d91d-44c5-4622-8df6-d66354ccb109",
  "subject": {
    "type": "CLIENT",
    "id": "40cace4f-712f-4cb8-bed2-4be1687d69c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGNhY2U0Zi03MTJmLTRjYjgtYmVkMi00YmUxNjg3ZDY5YzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTY5LCJpYXQiOjE3OTMyODAyNjksImp0aSI6ImI3NmFiMTYzLTM1OTMtNGE2OS1hMWEwLTY1MTk1YWY2Zjk4YSIsInNpZCI6ImEwMzdkOTFkLTQ0YzUtNDYyMi04ZGY2LWQ2NjM1NGNjYjEwOSJ9.8D9wDlhyuFYdojxIYtX-hwR5fEj-NYM6ecCe5yqlAD0",
  "access_expires_at": "2026-10-29T13:39:29.210787606Z",
  "refresh_token": "BrBhbrVC_TkYjJwOY7_d8sP0fWbXB_N7w9uT4ROAcqY",
  "refresh_expires_at": "2026-11-28T13:24:29.209616077Z",
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
  "command_id": "a54852b3-3d99-4b8f-a19f-ce50895d8150",
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
  "correlation_id": "d2cddbc0-fa7b-497c-af43-9d914aa94bfb",
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
  "command_id": "023f0fd8-5dee-4621-ab6c-8b6bbe45d2f8",
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
  "paused_at": "2026-10-29T13:24:30.000622666Z",
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
  "command_id": "355989b9-caba-4271-bb78-4923039715f6",
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
  "id": "ff6abc98-6b2e-4965-bcdd-48d772aa9ad6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:29:30.404556Z",
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
  "command_id": "2692a338-2df8-4fb9-8f75-8229c4b7b276",
  "quote_id": "ff6abc98-6b2e-4965-bcdd-48d772aa9ad6",
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
  "correlation_id": "6ece26d1-40db-423b-8af0-aafd2bc47ec6"
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
  "paused_at": "2026-10-29T13:24:30.000623Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "5233d51a-02a6-460c-a7a3-6d6360972f65",
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
  "command_id": "3e696c29-810b-4d01-955c-5ce57311ee0c",
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
  "command_id": "ff50d6c3-886e-40ec-a691-aef3c88c123a",
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
  "id": "c0a1e099-50cf-441c-8e55-a1c84e51f109",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:29:31.589282Z",
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
  "command_id": "38d853f0-6c04-47f2-be23-e6b989abfb7a",
  "quote_id": "c0a1e099-50cf-441c-8e55-a1c84e51f109",
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
  "correlation_id": "c19966bc-6ee6-4fed-beef-1b52807498e1"
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
  "command_id": "47cd6cf3-caf8-45c9-8cd4-8335bfd7f726",
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
      "from": "16:00",
      "to": "17:00"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "d2545a09-04df-4022-a6c5-d11e7a634f59",
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
  "id": "89b845d0-c009-464c-9e2f-3a43ef126ba2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:29:32.383310Z",
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
  "command_id": "de7abafb-a18d-4079-8d9f-032473e34866",
  "quote_id": "89b845d0-c009-464c-9e2f-3a43ef126ba2",
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
  "correlation_id": "aef71f9e-4e70-472c-9bc9-d06979e4b30c"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "f1b50be7-c326-45c9-92c1-ffa4037f6b00",
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
  "correlation_id": "279e647e-a4c9-45e0-9855-2ad8450ec59f"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "6a97c3a5-17e5-4994-a10a-f884e58f7688",
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
  "phone": "+380675995548",
  "device_ref": "sandbox-8335"
}
```

```json
{
  "challenge_id": "224c041b-b266-414d-9980-1ac393ce8a8a",
  "expires_at": "2026-10-29T13:29:33.395538277Z",
  "resend_available_at": "2026-10-29T13:24:34.395538277Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675995548` → **200**

```json
{
  "phone": "+380675995548",
  "audience": "CLIENT",
  "code": "017547",
  "sent_at": "2026-10-29T13:24:33.397372317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "224c041b-b266-414d-9980-1ac393ce8a8a",
  "code": "017547",
  "device_ref": "sandbox-8335"
}
```

```json
{
  "session_id": "65c2f61f-29ac-43cd-bd00-dd4876de724a",
  "subject": {
    "type": "CLIENT",
    "id": "c3e03d62-f308-4478-86a0-f9b1e7897d56"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjM2UwM2Q2Mi1mMzA4LTQ0NzgtODZhMC1mOWIxZTc4OTdkNTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTczLCJpYXQiOjE3OTMyODAyNzMsImp0aSI6IjEwYjc2YTk4LTA4OTgtNDg2Ni1hMzI2LWZmM2ZkMDI4OTg1MCIsInNpZCI6IjY1YzJmNjFmLTI5YWMtNDNjZC1iZDAwLWRkNDg3NmRlNzI0YSJ9.pUdKwsIH9YvGyIJ6GbCWOhFd0S7xW4XUo9STYWYJGGA",
  "access_expires_at": "2026-10-29T13:39:33.605531696Z",
  "refresh_token": "W2ZFlzKwQm6SjBTLVi-xrl33PYQOQ7ORsv-eJ3CdPeE",
  "refresh_expires_at": "2026-11-28T13:24:33.605114696Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c3e03d62-f308-4478-86a0-f9b1e7897d56",
  "session_id": "65c2f61f-29ac-43cd-bd00-dd4876de724a",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a898c580-49ad-4d56-af0b-5ac45ca974b8",
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
  "id": "cedbc461-ad2c-4828-9b4e-7a2488f760ee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:29:33.981418Z",
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
  "challenge_id": "67903019-79a5-4246-962f-33e18ac2e51f",
  "expires_at": "2026-10-29T13:29:36.17977466Z",
  "resend_available_at": "2026-10-29T13:24:37.17977466Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675995548` → **200**

```json
{
  "phone": "+380675995548",
  "audience": "CLIENT",
  "code": "423211",
  "sent_at": "2026-10-29T13:24:36.181498374Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "d09a4145-c9dc-4145-b7c6-df95722ebbdb",
  "challenge_id": "67903019-79a5-4246-962f-33e18ac2e51f",
  "otp_code": "423211"
}
```

```json
{
  "client_id": "c3e03d62-f308-4478-86a0-f9b1e7897d56",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T13:24:36.401080735Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "e892bee4-5c35-49e8-ab39-44feb005ceae",
  "quote_id": "cedbc461-ad2c-4828-9b4e-7a2488f760ee",
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
  "correlation_id": "47f4376e-2d72-4f80-8816-7f8e47a71dad"
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
  "session_id": "ef029b3f-8bb5-4470-b66c-78d3390da0b0",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExNzcsImlhdCI6MTc5MzI4MDI3NywianRpIjoiMzIzNmRiODMtYjk5Zi00OWY1LWEzMWYtYTAwZDc1YjhmODE4Iiwic2lkIjoiZWYwMjliM2YtOGJiNS00NDcwLWI2NmMtNzhkMzM5MGRhMGIwIn0.a7PXtvY_knoWOxomPBezHFpRJNgijkcCv4YtyIpJuOM",
  "access_expires_at": "2026-10-29T13:39:37.008861367Z",
  "refresh_token": "aERLT3zKk_WCGS4dyaa2Lh1NnxjNEplHscaOa-GAl9U",
  "refresh_expires_at": "2026-10-30T01:24:37.008506301Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "c3e03d62-f308-4478-86a0-f9b1e7897d56",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T13:24:36.401081Z",
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

`POST /api/admin/v1/client-deletions/c3e03d62-f308-4478-86a0-f9b1e7897d56/complete` → **200**

```json
{
  "command_id": "03433cd1-cd3d-4855-b3bb-db4304dbb4a8",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "c3e03d62-f308-4478-86a0-f9b1e7897d56",
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
  "correlation_id": "ac983e84-39d0-449f-b648-50190f1ed6a2"
}
```

Done: client c3e03d62-f308-4478-86a0-f9b1e7897d56 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666974057",
  "device_ref": "sandbox-15088"
}
```

```json
{
  "challenge_id": "48f684b6-4ec8-4789-b402-9bbb21142a60",
  "expires_at": "2026-10-29T13:29:37.792705408Z",
  "resend_available_at": "2026-10-29T13:24:38.792705408Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666974057` → **200**

```json
{
  "phone": "+380666974057",
  "audience": "CLIENT",
  "code": "219673",
  "sent_at": "2026-10-29T13:24:37.794836387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48f684b6-4ec8-4789-b402-9bbb21142a60",
  "code": "219673",
  "device_ref": "sandbox-15088"
}
```

```json
{
  "session_id": "70069b21-1045-410c-a098-ad1dc8559109",
  "subject": {
    "type": "CLIENT",
    "id": "ae4345f2-9a1e-4972-934c-022514ebd6de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTQzNDVmMi05YTFlLTQ5NzItOTM0Yy0wMjI1MTRlYmQ2ZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTc4LCJpYXQiOjE3OTMyODAyNzgsImp0aSI6IjQ4OGI5YzdiLTdlMzktNGVjZS1hNDNkLTUwMzZlMDRlOTJiMCIsInNpZCI6IjcwMDY5YjIxLTEwNDUtNDEwYy1hMDk4LWFkMWRjODU1OTEwOSJ9.XYJcQPhVE8Bl-cOHlQeybqGJcFtq5Ejlj_xZiWPOL4o",
  "access_expires_at": "2026-10-29T13:39:38.020293264Z",
  "refresh_token": "C5nzi6C8JvkC8CVq-VyR0kbay86AZLt_wVKnVBCo6TA",
  "refresh_expires_at": "2026-11-28T13:24:38.019867121Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ae4345f2-9a1e-4972-934c-022514ebd6de",
  "session_id": "70069b21-1045-410c-a098-ad1dc8559109",
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
  "session_id": "f2628ea8-cd39-43f6-b536-9b6c899a20a2",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExNzgsImlhdCI6MTc5MzI4MDI3OCwianRpIjoiMzY1MmFjMzMtZTI2Ni00YmZjLWIyOGYtNjdlYjA0MGZiMjVmIiwic2lkIjoiZjI2MjhlYTgtY2QzOS00M2Y2LWI1MzYtOWI2Yzg5OWEyMGEyIn0.Z7EGuMEidfepOumXJE1tWnDnMxrjfuxPZ6bKxqpz6A4",
  "access_expires_at": "2026-10-29T13:39:38.618528085Z",
  "refresh_token": "38xPdV311zsD1YYpGnWw3UA9mT0gcspE9lWrUR0Ygnk",
  "refresh_expires_at": "2026-10-30T01:24:38.618115964Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6974057&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "ae4345f2-9a1e-4972-934c-022514ebd6de",
      "phone": "+380666974057",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T13:24:38.018185Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/ae4345f2-9a1e-4972-934c-022514ebd6de` → **200**

```json
{
  "client": {
    "id": "ae4345f2-9a1e-4972-934c-022514ebd6de",
    "phone": "+380666974057",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T13:24:38.018185Z",
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

`POST /api/admin/v1/clients/ae4345f2-9a1e-4972-934c-022514ebd6de/block` → **400**

```json
{
  "command_id": "ce6babe3-503e-467b-a902-21f35bbd5baf",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/ae4345f2-9a1e-4972-934c-022514ebd6de/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "fff6b18f-8e22-486b-a14d-693be57b43f2",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/ae4345f2-9a1e-4972-934c-022514ebd6de/block` → **200**

```json
{
  "command_id": "f8b3d02c-3d70-4f03-b833-550436dc092c",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "ae4345f2-9a1e-4972-934c-022514ebd6de",
  "phone": "+380666974057",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T13:24:38.018185Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T13:24:39.468011Z",
    "by": "9d5e612b-6560-4572-ae4f-87d07514b00f"
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
  "correlation_id": "0678f75c-1c51-4459-92b8-125ee4827e42"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666974057",
  "device_ref": "sandbox-20453"
}
```

```json
{
  "challenge_id": "9c3b8ec8-24c1-434f-88af-f08533b1d8c9",
  "expires_at": "2026-10-29T13:29:41.872795856Z",
  "resend_available_at": "2026-10-29T13:24:42.872795856Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666974057` → **200**

```json
{
  "phone": "+380666974057",
  "audience": "CLIENT",
  "code": "327203",
  "sent_at": "2026-10-29T13:24:41.874815918Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "9c3b8ec8-24c1-434f-88af-f08533b1d8c9",
  "code": "327203",
  "device_ref": "sandbox-20453"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "44ffd1b8-73fc-4817-8416-cb40526a9540"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/ae4345f2-9a1e-4972-934c-022514ebd6de` → **200**

```json
{
  "client": {
    "id": "ae4345f2-9a1e-4972-934c-022514ebd6de",
    "phone": "+380666974057",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T13:24:38.018185Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T13:24:39.468011Z",
      "by": "9d5e612b-6560-4572-ae4f-87d07514b00f"
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

`POST /api/admin/v1/clients/ae4345f2-9a1e-4972-934c-022514ebd6de/unblock` → **200**

```json
{
  "command_id": "e7190acf-97d4-4b45-acca-8c62c8f576b6",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "ae4345f2-9a1e-4972-934c-022514ebd6de",
  "phone": "+380666974057",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T13:24:38.018185Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666974057",
  "device_ref": "sandbox-11798"
}
```

```json
{
  "challenge_id": "4edc9daa-6824-4bcc-9ad5-ac63d5461efb",
  "expires_at": "2026-10-29T13:29:44.723079297Z",
  "resend_available_at": "2026-10-29T13:24:45.723079297Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666974057` → **200**

```json
{
  "phone": "+380666974057",
  "audience": "CLIENT",
  "code": "028976",
  "sent_at": "2026-10-29T13:24:44.725073821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4edc9daa-6824-4bcc-9ad5-ac63d5461efb",
  "code": "028976",
  "device_ref": "sandbox-11798"
}
```

```json
{
  "session_id": "c4e26afa-14c5-48c8-a16f-bccbfcbc1130",
  "subject": {
    "type": "CLIENT",
    "id": "ae4345f2-9a1e-4972-934c-022514ebd6de"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTQzNDVmMi05YTFlLTQ5NzItOTM0Yy0wMjI1MTRlYmQ2ZGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTg0LCJpYXQiOjE3OTMyODAyODQsImp0aSI6ImVkZWY0OWI3LWQ1YjAtNGU5OC05Yjk3LTRhNDIzYTI0ODJkZiIsInNpZCI6ImM0ZTI2YWZhLTE0YzUtNDhjOC1hMTZmLWJjY2JmY2JjMTEzMCJ9.3iKjG_AV5e90oU8VYLDNml379OMk9DY23sFUJcMn9zk",
  "access_expires_at": "2026-10-29T13:39:44.936542311Z",
  "refresh_token": "6m1zhsCevFJ0OsiGgQLpP3iVT3aeLBJgZsuESROBwTs",
  "refresh_expires_at": "2026-11-28T13:24:44.93611185Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ae4345f2-9a1e-4972-934c-022514ebd6de",
  "session_id": "c4e26afa-14c5-48c8-a16f-bccbfcbc1130",
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
  "phone": "+380662520111",
  "device_ref": "sandbox-12779"
}
```

```json
{
  "challenge_id": "4af80719-c974-4035-a5eb-67f7a2606fdd",
  "expires_at": "2026-10-29T13:29:45.329611683Z",
  "resend_available_at": "2026-10-29T13:24:46.329611683Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662520111` → **200**

```json
{
  "phone": "+380662520111",
  "audience": "CLIENT",
  "code": "638719",
  "sent_at": "2026-10-29T13:24:45.331664494Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4af80719-c974-4035-a5eb-67f7a2606fdd",
  "code": "638719",
  "device_ref": "sandbox-12779"
}
```

```json
{
  "session_id": "d1d8d854-daf1-4bdb-87cd-6839afe4b918",
  "subject": {
    "type": "CLIENT",
    "id": "4441bb1a-7db6-4bcc-ad4a-6c9f6b0693f0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDQxYmIxYS03ZGI2LTRiY2MtYWQ0YS02YzlmNmIwNjkzZjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTg1LCJpYXQiOjE3OTMyODAyODUsImp0aSI6IjcyODRmNjYxLTA1ZDAtNGFkNS04MmNmLTNlZGNmMzdiODg1NCIsInNpZCI6ImQxZDhkODU0LWRhZjEtNGJkYi04N2NkLTY4MzlhZmU0YjkxOCJ9.zribQGvT4EIxuwjlYUXp7pCtptzFJxzGqYnPo2xPEUk",
  "access_expires_at": "2026-10-29T13:39:45.542357782Z",
  "refresh_token": "TH_ydrXExzn3xcADRPZM_xF8I0y_pkXsG-nxCqO_xLw",
  "refresh_expires_at": "2026-11-28T13:24:45.542040713Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2404d19b-c688-42a8-8a6b-18facc3f2b5a",
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
  "id": "9a3526e8-c8bb-4efc-8574-365fb3d7a73a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:29:45.733941Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: c90c046c-d881-4791-bbaf-fa27824ff422) → **201**

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
  "session_id": "6ad3dd70-33af-44aa-a088-122a28186e67",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExODYsImlhdCI6MTc5MzI4MDI4NiwianRpIjoiZjdiYTE2MDktYzYwNC00NGQ0LTg3YzAtZjQ3ZTI4NTUxZmIxIiwic2lkIjoiNmFkM2RkNzAtMzNhZi00NGFhLWEwODgtMTIyYTI4MTg2ZTY3In0.UL7EETGsRKVBCgwmlBBVy1Ffxeu8FGtVvZpeIrSZQhg",
  "access_expires_at": "2026-10-29T13:39:46.172625399Z",
  "refresh_token": "vX09LNlQ6nyhyRONj-ISfrk-NG7Wb1Q8aGZFnoa_AH0",
  "refresh_expires_at": "2026-10-30T01:24:46.172274328Z",
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
  "session_id": "309f7745-4734-4faa-bf4e-6e4012007e0c",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExODYsImlhdCI6MTc5MzI4MDI4NiwianRpIjoiOTM2NmQ4MTctYzMzOC00ZjNiLWFmNzQtYzU5MGUzOThlZWI4Iiwic2lkIjoiMzA5Zjc3NDUtNDczNC00ZmFhLWJmNGUtNmU0MDEyMDA3ZTBjIn0.eLc7OSUmD6uROS-DA-GVo8g7zRMyu5KinSev5cSzLos",
  "access_expires_at": "2026-10-29T13:39:46.56037839Z",
  "refresh_token": "bBTS_lWmK28lHxS0AoQZSepYY9rMotBrLRk0yXmS0Lw",
  "refresh_expires_at": "2026-10-30T01:24:46.559919757Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1972a344-d54e-4c2c-94d5-70f1dfce23fb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T13:24:45.934118Z",
      "actor": {
        "type": "CLIENT",
        "id": "4441bb1a-7db6-4bcc-ad4a-6c9f6b0693f0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb",
        "quote_id": "9a3526e8-c8bb-4efc-8574-365fb3d7a73a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c90c046c-d881-4791-bbaf-fa27824ff422"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T13:24:45.935259Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb",
        "attempt_id": "8137ca6b-05d2-4d66-b85d-e06b566e079e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c90c046c-d881-4791-bbaf-fa27824ff422"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T13:24:45.939854Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb",
        "attempt_id": "8137ca6b-05d2-4d66-b85d-e06b566e079e"
      },
      "correlation_id": "c90c046c-d881-4791-bbaf-fa27824ff422"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "8137ca6b-05d2-4d66-b85d-e06b566e079e",
        "generation": 1,
        "started_at": "2026-10-29T13:24:45.934691Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T13:24:45.939854Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T13:24:45.935661Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/c90c046c-d881-4791-bbaf-fa27824ff422` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb:0",
      "order_id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb",
      "at": "2026-10-29T13:24:45.934118Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb:1",
      "order_id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb",
      "at": "2026-10-29T13:24:45.935259Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb:2",
      "order_id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb",
      "at": "2026-10-29T13:24:45.939854Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/cf53168b-8ba0-48be-8958-83ba3403be29` → **200**

```json
{
  "found": []
}
```

Done: request c90c046c-d881-4791-bbaf-fa27824ff422 — order 1972a344-d54e-4c2c-94d5-70f1dfce23fb found by its id.

`GET /api/rider/v1/orders/1972a344-d54e-4c2c-94d5-70f1dfce23fb` → **200**

```json
{
  "id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4441bb1a-7db6-4bcc-ad4a-6c9f6b0693f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:24:45.93372Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1972a344-d54e-4c2c-94d5-70f1dfce23fb/cancel` → **200**

```json
{
  "command_id": "373ca02c-8b0c-4000-b1e2-c82ffa8ff19e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1972a344-d54e-4c2c-94d5-70f1dfce23fb",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4441bb1a-7db6-4bcc-ad4a-6c9f6b0693f0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:24:45.93372Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
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
  "phone": "+380633000323",
  "device_ref": "sandbox-20540"
}
```

```json
{
  "challenge_id": "f69b5561-f0a8-4721-9969-30c0302869ea",
  "expires_at": "2026-10-29T13:29:47.718609264Z",
  "resend_available_at": "2026-10-29T13:24:48.718609264Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633000323` → **200**

```json
{
  "phone": "+380633000323",
  "audience": "CLIENT",
  "code": "315510",
  "sent_at": "2026-10-29T13:24:47.720658721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f69b5561-f0a8-4721-9969-30c0302869ea",
  "code": "315510",
  "device_ref": "sandbox-20540"
}
```

```json
{
  "session_id": "7e50dda1-f69d-41cf-ac26-adb1f7c0dec3",
  "subject": {
    "type": "CLIENT",
    "id": "e928d663-faa9-4ea4-aaa2-65653755b9a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTI4ZDY2My1mYWE5LTRlYTQtYWFhMi02NTY1Mzc1NWI5YTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTg3LCJpYXQiOjE3OTMyODAyODcsImp0aSI6IjgzMzAwMmFkLWJhMDQtNGQxMC05YjIxLTM4MWI0Mjc3NzA4YiIsInNpZCI6IjdlNTBkZGExLWY2OWQtNDFjZi1hYzI2LWFkYjFmN2MwZGVjMyJ9.-_Irm74ReHYKFt7ILk8N6rlo7UqJmSL8QEWVRs3lBM4",
  "access_expires_at": "2026-10-29T13:39:47.928629535Z",
  "refresh_token": "ptIsFo42NJoLGPlmcKnsfzHuM9RGPs7kWf-3UC969Wg",
  "refresh_expires_at": "2026-11-28T13:24:47.92830211Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "1a090709-20cc-46c5-a481-7018da9b9067",
  "expires_at": "2026-10-29T13:29:50.151196114Z",
  "resend_available_at": "2026-10-29T13:24:51.151196114Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633000323` → **200**

```json
{
  "phone": "+380633000323",
  "audience": "CLIENT",
  "code": "729019",
  "sent_at": "2026-10-29T13:24:50.15294801Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "97fcdc39-3438-4609-a1cb-2237f70dc4e6",
  "challenge_id": "1a090709-20cc-46c5-a481-7018da9b9067",
  "otp_code": "729019"
}
```

```json
{
  "id": "5c235661-da3b-45e4-8fb1-2591eee4c1fc",
  "state": "PENDING",
  "created_at": "2026-10-29T13:24:50.382609Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/5c235661-da3b-45e4-8fb1-2591eee4c1fc` → **200**

```json
{
  "id": "5c235661-da3b-45e4-8fb1-2591eee4c1fc",
  "state": "PENDING",
  "created_at": "2026-10-29T13:24:50.382609Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5c235661-da3b-45e4-8fb1-2591eee4c1fc` → **200**

```json
{
  "id": "5c235661-da3b-45e4-8fb1-2591eee4c1fc",
  "state": "PENDING",
  "created_at": "2026-10-29T13:24:50.382609Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5c235661-da3b-45e4-8fb1-2591eee4c1fc` → **200**

```json
{
  "id": "5c235661-da3b-45e4-8fb1-2591eee4c1fc",
  "state": "PENDING",
  "created_at": "2026-10-29T13:24:50.382609Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5c235661-da3b-45e4-8fb1-2591eee4c1fc` → **200**

```json
{
  "id": "5c235661-da3b-45e4-8fb1-2591eee4c1fc",
  "state": "READY",
  "created_at": "2026-10-29T13:24:50.382609Z",
  "ready_at": "2026-10-29T13:24:53.203644Z",
  "expires_at": "2026-11-05T13:24:53.203644Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/5c235661-da3b-45e4-8fb1-2591eee4c1fc/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633431203",
  "device_ref": "sandbox-3483"
}
```

```json
{
  "challenge_id": "ef2753b5-d237-44c5-8691-b7eee9b38877",
  "expires_at": "2026-10-29T13:29:54.343237699Z",
  "resend_available_at": "2026-10-29T13:24:55.343237699Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633431203` → **200**

```json
{
  "phone": "+380633431203",
  "audience": "CLIENT",
  "code": "690196",
  "sent_at": "2026-10-29T13:24:54.34504747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef2753b5-d237-44c5-8691-b7eee9b38877",
  "code": "690196",
  "device_ref": "sandbox-3483"
}
```

```json
{
  "session_id": "97b7c4eb-2ba0-4fba-9b07-cf7bf38dcec9",
  "subject": {
    "type": "CLIENT",
    "id": "b211c1e8-bae0-4022-800d-c64b86c88fc8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjExYzFlOC1iYWUwLTQwMjItODAwZC1jNjRiODZjODhmYzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTk0LCJpYXQiOjE3OTMyODAyOTQsImp0aSI6IjlkODFkMDgzLTk3ODctNGVjOS04ZTdiLWE5NjE4ZGIxMGNjZCIsInNpZCI6Ijk3YjdjNGViLTJiYTAtNGZiYS05YjA3LWNmN2JmMzhkY2VjOSJ9.8ZhrBWigVZfkyajQ8ehkQaB833CAzrKwOCOKIU6SJ88",
  "access_expires_at": "2026-10-29T13:39:54.549860038Z",
  "refresh_token": "_Rxz3c3MOAalT0pYq7pxHYGC84SlhLcNihZUvLpop7o",
  "refresh_expires_at": "2026-11-28T13:24:54.549465892Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/5c235661-da3b-45e4-8fb1-2591eee4c1fc/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/5c235661-da3b-45e4-8fb1-2591eee4c1fc/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ceeaaa28-19ae-47b9-8c66-6f3084ceb8fb"
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
  "session_id": "ab1e2bfe-512b-46c0-8030-c2b3f658dea3",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExOTUsImlhdCI6MTc5MzI4MDI5NSwianRpIjoiYjNlMTViZDgtODcyZC00Mjg2LWIyMmItMjJkODc4MTFlM2FhIiwic2lkIjoiYWIxZTJiZmUtNTEyYi00NmMwLTgwMzAtYzJiM2Y2NThkZWEzIn0.k-SeT0Vu55CtT0cJN5RzpjY6AgCdJMUwx8Ypsv_Pgng",
  "access_expires_at": "2026-10-29T13:39:55.12308045Z",
  "refresh_token": "h-tEV3hyzxuCpPwFFWXgYxyQJ68eBvvfY6asMvUwWAs",
  "refresh_expires_at": "2026-10-30T01:24:55.122666335Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e928d663-faa9-4ea4-aaa2-65653755b9a8",
  "session_id": "7e50dda1-f69d-41cf-ac26-adb1f7c0dec3",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/e928d663-faa9-4ea4-aaa2-65653755b9a8/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "5c235661-da3b-45e4-8fb1-2591eee4c1fc",
      "state": "READY",
      "created_at": "2026-10-29T13:24:50.382609Z",
      "ready_at": "2026-10-29T13:24:53.203644Z",
      "expires_at": "2026-11-05T13:24:53.203644Z",
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
  "device_ref": "sandbox-10449"
}
```

```json
{
  "challenge_id": "dd806535-c218-403f-ac52-c64b6a176a3e",
  "expires_at": "2026-10-29T13:29:55.684717223Z",
  "resend_available_at": "2026-10-29T13:24:56.684717223Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "786229",
  "sent_at": "2026-10-29T13:24:55.686669572Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd806535-c218-403f-ac52-c64b6a176a3e",
  "code": "786229",
  "device_ref": "sandbox-10449"
}
```

```json
{
  "session_id": "88b8224e-e526-412c-95dd-57c0fed6aaec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTE5NSwiaWF0IjoxNzkzMjgwMjk1LCJqdGkiOiJiMTY4YjZkOS1iNGEyLTRhMzMtODRlNi02NDU1ZTUyMDZlZjEiLCJzaWQiOiI4OGI4MjI0ZS1lNTI2LTQxMmMtOTVkZC01N2MwZmVkNmFhZWMifQ.fl8rv90-PxXTsFWznEbatEOsHPEJ9xlksWSAK0FwlNs",
  "access_expires_at": "2026-10-29T13:39:55.894064514Z",
  "refresh_token": "R2dqjMQC1ZqITbnCAUIpzSIOusfA2ISSsFSpmXSBhAQ",
  "refresh_expires_at": "2026-11-28T13:24:55.893713294Z",
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
  "device_ref": "sandbox-18116"
}
```

```json
{
  "challenge_id": "0d3f4270-b22a-42fe-930c-667cca6fb838",
  "expires_at": "2026-10-29T13:29:56.264544475Z",
  "resend_available_at": "2026-10-29T13:24:57.264544475Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "751040",
  "sent_at": "2026-10-29T13:24:56.266506559Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d3f4270-b22a-42fe-930c-667cca6fb838",
  "code": "751040",
  "device_ref": "sandbox-18116"
}
```

```json
{
  "session_id": "51d9dcb4-1806-45aa-a729-f2637e0196df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTE5NiwiaWF0IjoxNzkzMjgwMjk2LCJqdGkiOiI1NmZmZmQzNS0zYWVkLTQ2YWEtOTIwYS04ZTMxOWU4MTIwMTMiLCJzaWQiOiI1MWQ5ZGNiNC0xODA2LTQ1YWEtYTcyOS1mMjYzN2UwMTk2ZGYifQ.E7J0qnJ1RU60Q0kIhoGsvJw_8q2dt4M4XQuNwTDnHaA",
  "access_expires_at": "2026-10-29T13:39:56.474172201Z",
  "refresh_token": "u1Abke8AQte0vg7m8sObAZsF2ZaLWQ_JOUV04vbnH10",
  "refresh_expires_at": "2026-11-28T13:24:56.473782102Z",
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
  "command_id": "7b4519d1-c3b6-48f0-8240-913027f76c69",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:24:56Z",
    "sequence": 1793280296845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fb563475-406b-41b5-add3-04ee05936059",
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
  "last_heartbeat_at": "2026-10-29T13:24:56.861716Z",
  "last_location_at": "2026-10-29T13:24:56.861716Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-270"
}
```

```json
{
  "challenge_id": "244ff72b-f790-4cf9-b684-72352aeed029",
  "expires_at": "2026-10-29T13:29:57.053935337Z",
  "resend_available_at": "2026-10-29T13:24:58.053935337Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "533038",
  "sent_at": "2026-10-29T13:24:57.055944883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "244ff72b-f790-4cf9-b684-72352aeed029",
  "code": "533038",
  "device_ref": "sandbox-270"
}
```

```json
{
  "session_id": "7e143a67-7a18-40de-8ee3-79d0a74e4ddb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTE5NywiaWF0IjoxNzkzMjgwMjk3LCJqdGkiOiJlYmNjYjNjNC1kMTc5LTQ2YjUtYjlmOC0zZjczMzNkZTYyMWYiLCJzaWQiOiI3ZTE0M2E2Ny03YTE4LTQwZGUtOGVlMy03OWQwYTc0ZTRkZGIifQ.-BQo6wvPc3y8Fk6TgL8YmTr8ge4F8BlrNJpsw4-vFdg",
  "access_expires_at": "2026-10-29T13:39:57.273245671Z",
  "refresh_token": "0Sd3rZyOy1plnJE2Hw0t0oNa7_E5013sz_8l8-PMvLY",
  "refresh_expires_at": "2026-11-28T13:24:57.27287446Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91c452de-6fb4-486c-bd0e-f4ca9fe9cd2a",
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
  "last_heartbeat_at": "2026-10-29T13:23:44.263907Z",
  "last_location_at": "2026-10-29T13:23:44.263907Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/91c452de-6fb4-486c-bd0e-f4ca9fe9cd2a/handover` → **200**

```json
{
  "command_id": "6f67e1d0-7347-4c85-9d44-4a9679aa3d4d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91c452de-6fb4-486c-bd0e-f4ca9fe9cd2a",
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
  "last_heartbeat_at": "2026-10-29T13:23:44.263907Z",
  "last_location_at": "2026-10-29T13:23:44.263907Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/91c452de-6fb4-486c-bd0e-f4ca9fe9cd2a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:24:57Z",
    "sequence": 1793280297865
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91c452de-6fb4-486c-bd0e-f4ca9fe9cd2a",
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
  "last_heartbeat_at": "2026-10-29T13:24:57.881385Z",
  "last_location_at": "2026-10-29T13:24:57.881385Z",
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
  "session_id": "e1392e5c-ee0c-438d-822e-f5ff70e8f5e9",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExOTgsImlhdCI6MTc5MzI4MDI5OCwianRpIjoiY2I4ZDg2OTYtOWI1Mi00MjFkLWI2OGMtNjEwN2I0NjNmYzk4Iiwic2lkIjoiZTEzOTJlNWMtZWUwYy00MzhkLTgyMmUtZjVmZjcwZThmNWU5In0.TAjzH25tBNXUGtv81K8_v0O73vxFYLbCU_m9i92VJBY",
  "access_expires_at": "2026-10-29T13:39:58.279270533Z",
  "refresh_token": "7bbtzodvhK6O-KjnXjT1BLzuL4jn23plQC7xkVP5k34",
  "refresh_expires_at": "2026-10-30T01:24:58.278857278Z",
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
  "session_id": "d3271adf-19ad-4032-83f9-ae8d66530575",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODExOTgsImlhdCI6MTc5MzI4MDI5OCwianRpIjoiZjgzZDIyNTEtOWYwOS00NTJiLWFjOTEtNDdlOTk4ZTEyYzEzIiwic2lkIjoiZDMyNzFhZGYtMTlhZC00MDMyLTgzZjktYWU4ZDY2NTMwNTc1In0.bKRf94iBsODodXXIyNeI_XNaLii1n1Mtqfe_Cagq0p0",
  "access_expires_at": "2026-10-29T13:39:58.679102142Z",
  "refresh_token": "EUM0d82Ll7Px0xrR57meqRQAEGIqnQjxrq8ZnzWdgSQ",
  "refresh_expires_at": "2026-10-30T01:24:58.678781397Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682646163",
  "device_ref": "sandbox-29115"
}
```

```json
{
  "challenge_id": "c12602db-df0c-4cc3-b8ae-4c8b3afbe12c",
  "expires_at": "2026-10-29T13:29:58.859735296Z",
  "resend_available_at": "2026-10-29T13:24:59.859735296Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682646163` → **200**

```json
{
  "phone": "+380682646163",
  "audience": "CLIENT",
  "code": "459087",
  "sent_at": "2026-10-29T13:24:58.861582439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c12602db-df0c-4cc3-b8ae-4c8b3afbe12c",
  "code": "459087",
  "device_ref": "sandbox-29115"
}
```

```json
{
  "session_id": "9315edfb-3d0f-4890-8b04-165cad0a52ee",
  "subject": {
    "type": "CLIENT",
    "id": "76aa5b08-4ca7-4e7a-9652-74b6901ec34f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmFhNWIwOC00Y2E3LTRlN2EtOTY1Mi03NGI2OTAxZWMzNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMTk5LCJpYXQiOjE3OTMyODAyOTksImp0aSI6IjBkMDFkNzU3LTk4MDctNDAzYy1hYjlhLWViZTFhZGQ2NTRlYiIsInNpZCI6IjkzMTVlZGZiLTNkMGYtNDg5MC04YjA0LTE2NWNhZDBhNTJlZSJ9.MzR9VBEs7YtXiRuD68TWYj9uw8NZ69Ped0qD5qSNF9g",
  "access_expires_at": "2026-10-29T13:39:59.065461078Z",
  "refresh_token": "kXx8L2uq3y9DZzIy0nfKmZBp3AABW1-ediym91ONaPE",
  "refresh_expires_at": "2026-11-28T13:24:59.065162026Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "26c9633a-2934-408e-acea-07859de987ed",
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
  "id": "c0aa9be9-e86a-404f-9a99-08a78e2501e3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:29:59.250281Z",
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
  "command_id": "653857a6-8f30-420a-830c-ccceff73af89",
  "quote_id": "c0aa9be9-e86a-404f-9a99-08a78e2501e3",
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
  "id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "76aa5b08-4ca7-4e7a-9652-74b6901ec34f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:24:59.442927Z",
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
    "id": "55e6964d-0c2e-42a7-9876-fa865090ede9",
    "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
    "expires_at": "2026-10-29T13:25:14.445155Z",
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

`POST /api/driver/v1/offers/55e6964d-0c2e-42a7-9876-fa865090ede9/reject` → **204**

```json
{
  "command_id": "336b7d42-8755-4871-8663-9b999cbb855a"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6e4de1b7-a063-4b20-98fd-6aee0ad75581",
    "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
    "expires_at": "2026-10-29T13:25:14.861611Z",
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

`POST /api/driver/v1/offers/6e4de1b7-a063-4b20-98fd-6aee0ad75581/accept` → **200**

```json
{
  "command_id": "3a3b3288-ad08-43ee-8c20-b6447859135f"
}
```

```json
{
  "id": "01bd04b9-cbd5-417e-86f6-2280981c397a",
  "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d8a7948e-2efe-47dd-b05b-faed7ef179dd",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/56c0d74a-49b8-4f72-a34a-baf0d5384c97/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T13:24:59.443302Z",
      "actor": {
        "type": "CLIENT",
        "id": "76aa5b08-4ca7-4e7a-9652-74b6901ec34f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
        "quote_id": "c0aa9be9-e86a-404f-9a99-08a78e2501e3",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0fc47b07-c981-4f02-b738-c080635390d5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T13:24:59.444677Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
        "attempt_id": "f90ab613-e105-442e-9f0d-8d231d004983",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0fc47b07-c981-4f02-b738-c080635390d5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T13:24:59.447095Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "55e6964d-0c2e-42a7-9876-fa865090ede9",
        "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "0fc47b07-c981-4f02-b738-c080635390d5"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T13:24:59.860927Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "55e6964d-0c2e-42a7-9876-fa865090ede9",
        "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97"
      },
      "correlation_id": "a85344d2-4fbd-42da-a870-ffe7e1500e64"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 56c0d74a-49b8-4f72-a34a-baf0d5384c97 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/56c0d74a-49b8-4f72-a34a-baf0d5384c97` → **200**

```json
{
  "id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "76aa5b08-4ca7-4e7a-9652-74b6901ec34f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "01bd04b9-cbd5-417e-86f6-2280981c397a",
    "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d8a7948e-2efe-47dd-b05b-faed7ef179dd",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T13:24:59.442927Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/56c0d74a-49b8-4f72-a34a-baf0d5384c97/cancel` → **200**

```json
{
  "command_id": "21a91c35-1882-4931-be25-2ae93908cc9c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "76aa5b08-4ca7-4e7a-9652-74b6901ec34f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "01bd04b9-cbd5-417e-86f6-2280981c397a",
    "order_id": "56c0d74a-49b8-4f72-a34a-baf0d5384c97",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d8a7948e-2efe-47dd-b05b-faed7ef179dd",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T13:24:59.442927Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
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
  "session_id": "fb563475-406b-41b5-add3-04ee05936059",
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
  "last_heartbeat_at": "2026-10-29T13:24:56.861716Z",
  "last_location_at": "2026-10-29T13:24:56.861716Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fb563475-406b-41b5-add3-04ee05936059/close` → **200**

```json
{
  "command_id": "e4b347a3-761f-4f62-85c8-e1cc724dc21b",
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
  "session_id": "91c452de-6fb4-486c-bd0e-f4ca9fe9cd2a",
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
  "last_heartbeat_at": "2026-10-29T13:24:57.881385Z",
  "last_location_at": "2026-10-29T13:24:57.881385Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/91c452de-6fb4-486c-bd0e-f4ca9fe9cd2a/close` → **200**

```json
{
  "command_id": "b121e542-708d-4119-9c95-63b7623bbba9",
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
  "session_id": "9932701f-fb95-4f24-95f1-8d8ab962a836",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyMDEsImlhdCI6MTc5MzI4MDMwMSwianRpIjoiOWI4NzFhYTgtZTdiOS00MTYxLTgyZDAtNjk5ZDYzZjdhYTI4Iiwic2lkIjoiOTkzMjcwMWYtZmI5NS00ZjI0LTk1ZjEtOGQ4YWI5NjJhODM2In0.fE4CSJK9N-MMd6L1j8WdsfGjSp3RugqRO7RTSfkXk08",
  "access_expires_at": "2026-10-29T13:40:01.866726043Z",
  "refresh_token": "vvE61d9EhWUF-2a3zEzWMdE8xb_cOeIdNbSRS32sa4o",
  "refresh_expires_at": "2026-10-30T01:25:01.86632736Z",
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
  "command_id": "4032bd96-6df6-44a1-85c8-563f44f3f668",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T13:25:02.261073Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "20f2b14a-3eb7-4a96-bc6c-8ce2754677dd",
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
  "correlation_id": "56e9d703-f79a-4505-8574-feb612f6c7a6"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "388b74b1-288c-4599-96b0-16339a73e677",
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
  "correlation_id": "6569810e-cf84-4674-9976-20c170e33fde"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633094656",
  "device_ref": "sandbox-31331"
}
```

```json
{
  "challenge_id": "3f783643-7f15-4e2e-8a84-fe388a47bc26",
  "expires_at": "2026-10-29T13:30:02.872641741Z",
  "resend_available_at": "2026-10-29T13:25:03.872641741Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633094656` → **200**

```json
{
  "phone": "+380633094656",
  "audience": "CLIENT",
  "code": "124051",
  "sent_at": "2026-10-29T13:25:02.874895279Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f783643-7f15-4e2e-8a84-fe388a47bc26",
  "code": "124051",
  "device_ref": "sandbox-31331"
}
```

```json
{
  "session_id": "567a988b-7e06-4d40-a63e-2124eb65d014",
  "subject": {
    "type": "CLIENT",
    "id": "e179f367-c5f9-463f-863d-28c3c3f085c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMTc5ZjM2Ny1jNWY5LTQ2M2YtODYzZC0yOGMzYzNmMDg1YzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjAzLCJpYXQiOjE3OTMyODAzMDMsImp0aSI6ImExOTU0ZmRlLTE0NDAtNDdlNS05MzhkLWVmYjRlYTE4MjRiMyIsInNpZCI6IjU2N2E5ODhiLTdlMDYtNGQ0MC1hNjNlLTIxMjRlYjY1ZDAxNCJ9.0jQ-_p4MwDr2jDozKXOsKFis6Fu5agpO2nSiK19bV48",
  "access_expires_at": "2026-10-29T13:40:03.088362579Z",
  "refresh_token": "PouO5obgfxrDKxVzOX1an63K1LcRJiExyE5Qo0H2nNo",
  "refresh_expires_at": "2026-11-28T13:25:03.088008823Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bf75f5ef-d268-4b36-94da-9ddad0341ac5",
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
  "id": "c371e84f-e9fc-4218-bfa8-d60caeaa10b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:03.292554Z",
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
  "command_id": "aa03d443-e188-4312-8c3e-fc2477825728",
  "quote_id": "c371e84f-e9fc-4218-bfa8-d60caeaa10b8",
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
  "correlation_id": "fe357d70-37cb-4f62-adb4-266429ff8126"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9dbd4760-a3aa-457d-b576-297917ae3865",
  "quote_id": "c371e84f-e9fc-4218-bfa8-d60caeaa10b8",
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
  "id": "7432d330-3914-40c1-8701-45f07fef66a5",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e179f367-c5f9-463f-863d-28c3c3f085c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:25:03.68966Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7432d330-3914-40c1-8701-45f07fef66a5/cancel` → **200**

```json
{
  "command_id": "d18097b5-696f-40d8-b807-8d27baf74f05",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7432d330-3914-40c1-8701-45f07fef66a5",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e179f367-c5f9-463f-863d-28c3c3f085c3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:25:03.68966Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
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
  "command_id": "815402a2-3f28-4d9c-bbd9-bf02bb1008c0",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T13:25:04.103923Z"
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
      "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T13:25:04.103923Z"
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
  "device_ref": "sandbox-11497"
}
```

```json
{
  "challenge_id": "5c130242-baed-4c20-bbe4-ec2b07dde165",
  "expires_at": "2026-10-29T13:30:04.672578029Z",
  "resend_available_at": "2026-10-29T13:25:05.672578029Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "033988",
  "sent_at": "2026-10-29T13:25:04.674632504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c130242-baed-4c20-bbe4-ec2b07dde165",
  "code": "033988",
  "device_ref": "sandbox-11497"
}
```

```json
{
  "session_id": "9d8b1482-e8f7-4e6d-abfe-6b6a906ce984",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTIwNCwiaWF0IjoxNzkzMjgwMzA0LCJqdGkiOiIxMTc0YmVhYi0xYzBlLTQ3NmEtODg2MS1mYjVmODgzZmQxNDEiLCJzaWQiOiI5ZDhiMTQ4Mi1lOGY3LTRlNmQtYWJmZS02YjZhOTA2Y2U5ODQifQ.zeJJuSgZlxtiNWhmlWL2gbN2qGc8pAi-qezBQvrFfAw",
  "access_expires_at": "2026-10-29T13:40:04.880244847Z",
  "refresh_token": "1CDkRBaMr6W8Ds_Bend9J6eI81oLIhkD0IlldEePrOE",
  "refresh_expires_at": "2026-11-28T13:25:04.87983645Z",
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
  "command_id": "d1281ed3-a170-4471-b700-58779abff542",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:05Z",
    "sequence": 1793280305252
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:05.267368Z",
  "last_location_at": "2026-10-29T13:25:05.267368Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672998978",
  "device_ref": "sandbox-16939"
}
```

```json
{
  "challenge_id": "a6052131-eb5f-41de-bef9-15b4a4f28b28",
  "expires_at": "2026-10-29T13:30:05.453057002Z",
  "resend_available_at": "2026-10-29T13:25:06.453057002Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672998978` → **200**

```json
{
  "phone": "+380672998978",
  "audience": "CLIENT",
  "code": "315839",
  "sent_at": "2026-10-29T13:25:05.454871344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6052131-eb5f-41de-bef9-15b4a4f28b28",
  "code": "315839",
  "device_ref": "sandbox-16939"
}
```

```json
{
  "session_id": "959e2f46-951e-4f6e-bfc6-5190b1939284",
  "subject": {
    "type": "CLIENT",
    "id": "fe69cd2e-fa83-46d3-8527-6e5576fb6ba6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTY5Y2QyZS1mYTgzLTQ2ZDMtODUyNy02ZTU1NzZmYjZiYTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjA1LCJpYXQiOjE3OTMyODAzMDUsImp0aSI6ImQwYzZhYmNlLTI0ZjgtNDE1NC05MTQ4LTU4MGUzMTdhM2QyYiIsInNpZCI6Ijk1OWUyZjQ2LTk1MWUtNGY2ZS1iZmM2LTUxOTBiMTkzOTI4NCJ9.x6wIo3meJFvCsZALlhsGZLG_YxldvB4lesIOzmTCSVc",
  "access_expires_at": "2026-10-29T13:40:05.667778318Z",
  "refresh_token": "i4-aE3KnwBAJhKHXUg-ZN6bD_N-PA14XwLTWW_-Enls",
  "refresh_expires_at": "2026-11-28T13:25:05.667398604Z",
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
  "command_id": "ddec4dbd-fb29-49b6-8914-dca468153ad7",
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
  "id": "f04842d6-a5f7-4a2c-acb8-120c2be479c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:06.036680Z",
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
  "command_id": "b034622c-e768-4ce4-b5a9-be4ad7cd9480",
  "platform": "ANDROID",
  "token": "sandbox-driver-a853494d-77a0-4f76-911f-defd2a3e40c6"
}
```

```json
{
  "id": "1a218c9e-469c-4c65-a840-ce6b4fa17ff4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T13:25:06.236334Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "20ad780b-704b-449b-9f24-7b085d22968c",
  "platform": "ANDROID",
  "token": "sandbox-rider-98198fa8-5af1-401b-820a-e4414128a7f3"
}
```

```json
{
  "id": "b30e5333-d515-4a30-b7f4-cf6625e121d9",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T13:25:06.422218Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fc6fea68-9087-4490-a8c3-6768fe345409",
  "quote_id": "f04842d6-a5f7-4a2c-acb8-120c2be479c0",
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
  "id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe69cd2e-fa83-46d3-8527-6e5576fb6ba6",
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
  "created_at": "2026-10-29T13:25:06.618052Z",
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
    "id": "26a431bd-e2cf-4583-a802-907fc03dd4b3",
    "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
    "expires_at": "2026-10-29T13:25:21.620068Z",
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

`POST /api/driver/v1/offers/26a431bd-e2cf-4583-a802-907fc03dd4b3/accept` → **200**

```json
{
  "command_id": "f6e55f38-2515-43e8-8428-f6af056d895f"
}
```

```json
{
  "id": "529239d6-682e-478f-9b86-0aec9b1b19c8",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b940bab3-a7c7-4d30-84de-adf16b0374a5",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T13:25:06.598Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T13:25:06.598Z` → **200**

```json
[
  {
    "at": "2026-10-29T13:25:07.472623368Z",
    "token_suffix": "3e40c6",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "756a46fa-a7f1-4521-a36a-81b95f98ad27",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672998978&after=2026-10-29T13:25:06.598Z` → **200**

```json
[
  {
    "at": "2026-10-29T13:25:07.474377207Z",
    "token_suffix": "28a7f3",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "8d5569da-8855-48a1-9788-edd591d94019",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/11375336-20d8-4b25-bf9b-77001f5ea97a/messages` → **201**

```json
{
  "command_id": "6a0dafe8-e733-439a-bf35-a0777e6e73fd",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "163720b8-87cb-45db-ad1d-46860f6ede98",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T13:25:08.263200758Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b940bab3-a7c7-4d30-84de-adf16b0374a5",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "assignment_id": "529239d6-682e-478f-9b86-0aec9b1b19c8",
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

`POST /api/driver/v1/trips/b940bab3-a7c7-4d30-84de-adf16b0374a5/messages` → **201**

```json
{
  "command_id": "4b9facde-2f5b-4127-b20b-d2ab25edf03c",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "0a25d24b-6706-4f9f-92a6-f90d68b5a921",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T13:25:08.671544152Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/11375336-20d8-4b25-bf9b-77001f5ea97a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b940bab3-a7c7-4d30-84de-adf16b0374a5/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672998978"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/f3342166-e2ae-48bf-bd5c-53da064ad66b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:09Z",
    "sequence": 1793280309229
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:09.245416Z",
  "last_location_at": "2026-10-29T13:25:09.245416Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b940bab3-a7c7-4d30-84de-adf16b0374a5",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "assignment_id": "529239d6-682e-478f-9b86-0aec9b1b19c8",
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

`POST /api/driver/v1/trips/b940bab3-a7c7-4d30-84de-adf16b0374a5/arrive` → **200**

```json
{
  "command_id": "fc26a14c-9c63-4668-bf9e-229d4e23bc7d",
  "expected_version": 0
}
```

```json
{
  "id": "b940bab3-a7c7-4d30-84de-adf16b0374a5",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "assignment_id": "529239d6-682e-478f-9b86-0aec9b1b19c8",
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
  "arrived_at": "2026-10-29T13:25:09.614915Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b940bab3-a7c7-4d30-84de-adf16b0374a5/start` → **200**

```json
{
  "command_id": "85489232-64a9-4b25-8c9a-1e2e5835f198",
  "expected_version": 1
}
```

```json
{
  "id": "b940bab3-a7c7-4d30-84de-adf16b0374a5",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "assignment_id": "529239d6-682e-478f-9b86-0aec9b1b19c8",
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
  "arrived_at": "2026-10-29T13:25:09.614915Z",
  "started_at": "2026-10-29T13:25:09.810128Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f3342166-e2ae-48bf-bd5c-53da064ad66b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:10Z",
    "sequence": 1793280310682
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:10.022736Z",
  "last_location_at": "2026-10-29T13:25:10.022736Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b940bab3-a7c7-4d30-84de-adf16b0374a5/complete` → **200**

```json
{
  "command_id": "5391411b-7e5a-4645-9ec6-b8602abf9b90",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:25:10Z",
  "cash_received": true
}
```

```json
{
  "id": "b940bab3-a7c7-4d30-84de-adf16b0374a5",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "assignment_id": "529239d6-682e-478f-9b86-0aec9b1b19c8",
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
  "arrived_at": "2026-10-29T13:25:09.614915Z",
  "started_at": "2026-10-29T13:25:09.810128Z",
  "completed_at": "2026-10-29T13:25:10.21432Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/11375336-20d8-4b25-bf9b-77001f5ea97a` → **200**

```json
{
  "id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fe69cd2e-fa83-46d3-8527-6e5576fb6ba6",
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
    "id": "529239d6-682e-478f-9b86-0aec9b1b19c8",
    "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b940bab3-a7c7-4d30-84de-adf16b0374a5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:25:06.618052Z",
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
    "id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T13:25:06.618052Z",
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
    "id": "b940bab3-a7c7-4d30-84de-adf16b0374a5",
    "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
    "order_short_number": 13,
    "created_at": "2026-10-29T13:25:06.995062Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "fe8dcf9a-bfb4-4b64-a3e8-62d10c585f0f",
    "order_id": "75780af9-3674-4090-9604-9158e8f08a42",
    "order_short_number": 8,
    "created_at": "2026-10-29T13:24:11.749626Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6f411819-ef01-4350-b4a5-8aeabb2ce429",
    "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
    "order_short_number": 3,
    "created_at": "2026-10-29T13:23:36.261922Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "db60f676-f24e-4e82-b63c-fe54801d71f6",
    "order_id": "20d2caad-c6ed-40d1-81e7-ce4f1b7ac014",
    "order_short_number": 2,
    "created_at": "2026-10-29T13:23:20.219517Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "13a5f08d-3aba-4091-902f-4b28ea36d764",
    "order_id": "79275c10-4ed5-4121-b2ef-235611aed4cb",
    "order_short_number": 1,
    "created_at": "2026-10-29T13:23:13.755257Z",
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

`GET /api/rider/v1/orders/11375336-20d8-4b25-bf9b-77001f5ea97a/tip` → **200**

```json
{
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
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
  "available_until": "2026-10-30T13:25:10.21432Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/11375336-20d8-4b25-bf9b-77001f5ea97a/tip` → **201**

```json
{
  "command_id": "f35c2d71-78a8-4bbc-a380-3a656bb9d2a6",
  "amount_minor": 1100
}
```

```json
{
  "id": "b8ac1527-0f38-41fb-81ec-eda32a6c4895",
  "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T13:25:14.588953Z"
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
  "session_id": "e0bf79cd-3029-4fe6-ab5c-dea92cdb56e0",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyMTUsImlhdCI6MTc5MzI4MDMxNSwianRpIjoiNWY5OTk5NmEtZGJjYy00MGY2LWJhOTktNTY5ZDg3MjEzMTg1Iiwic2lkIjoiZTBiZjc5Y2QtMzAyOS00ZmU2LWFiNWMtZGVhOTJjZGI1NmUwIn0.9r_2L0H1c1K-ijEkdtPeZ7A7DHYNlwwTe6zdjiufAVw",
  "access_expires_at": "2026-10-29T13:40:15.009809336Z",
  "refresh_token": "_ov3XdUt8pTrn_GeyCBDtms1IxesuYFiCcibBgbVYP0",
  "refresh_expires_at": "2026-10-30T01:25:15.00946781Z",
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
          "STAFF": 1,
          "DRIVER": 1,
          "RIDER": 3
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
      "STAFF": 1,
      "DRIVER": 1,
      "RIDER": 3
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
  "generated_at": "2026-10-29T13:25:15.208383216Z"
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
  "generated_at": "2026-10-29T13:25:15.402420869Z"
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
  "session_id": "9070663b-6809-44e3-a958-2856ed949d9d",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyMTUsImlhdCI6MTc5MzI4MDMxNSwianRpIjoiNzcwZDRjMmYtZmZhOS00NzVhLTk1YjktZGU1ZTMwZTRjNzViIiwic2lkIjoiOTA3MDY2M2ItNjgwOS00NGUzLWE5NTgtMjg1NmVkOTQ5ZDlkIn0.GnyagwCeTIJ7rZ9CgL6F740pX_ixyJafKyA9gEh1VMk",
  "access_expires_at": "2026-10-29T13:40:15.812551882Z",
  "refresh_token": "m0zjb88mBVulhXJYqie-DPtlKRK-YGW-FtJI9gsLTUE",
  "refresh_expires_at": "2026-10-30T01:25:15.812152329Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/11375336-20d8-4b25-bf9b-77001f5ea97a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T13:25:06.618398Z",
      "actor": {
        "type": "CLIENT",
        "id": "fe69cd2e-fa83-46d3-8527-6e5576fb6ba6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
        "quote_id": "f04842d6-a5f7-4a2c-acb8-120c2be479c0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9cb569fc-43f8-4cd0-8129-f48adfb1bab1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T13:25:06.619647Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
        "attempt_id": "a9503636-86aa-44d1-93ad-e61c2b346e61",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9cb569fc-43f8-4cd0-8129-f48adfb1bab1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T13:25:06.621307Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "26a431bd-e2cf-4583-a802-907fc03dd4b3",
        "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "9cb569fc-43f8-4cd0-8129-f48adfb1bab1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T13:25:06.996198Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "26a431bd-e2cf-4583-a802-907fc03dd4b3",
        "order_id": "11375336-20d8-4b25-bf9b-77001f5ea97a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "529239d6-682e-478f-9b86-0aec9b1b19c8"
      },
      "correlation_id": "084899e5-c196-47ab-b244-0ffa1e0a79e7"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T13:25:16.195543779Z",
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
      "last_location_at": "2026-10-29T13:25:10.022736Z",
      "order_id": null
    }
  ]
}
```

Done: order 11375336-20d8-4b25-bf9b-77001f5ea97a.

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
  "session_id": "b8fbf164-c4ee-40de-831b-ef26c6691804",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyMTYsImlhdCI6MTc5MzI4MDMxNiwianRpIjoiOWJmMmQ3ZDAtYTE0Zi00MDFlLWFmZGEtZTdjNWI4Mjc1MGUzIiwic2lkIjoiYjhmYmYxNjQtYzRlZS00MGRlLTgzMWItZWYyNmM2NjkxODA0In0.qAUncCnzVoTiWtpYbpciRX3N29VGgnjLi16-bxDMufA",
  "access_expires_at": "2026-10-29T13:40:16.614929336Z",
  "refresh_token": "8wLqIn8WUqQFs19UUQigtUOpze9EH3SAspxrGTv7Ocw",
  "refresh_expires_at": "2026-10-30T01:25:16.614556182Z",
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
  "command_id": "18078682-385c-4304-981e-8295dd5380fb",
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
  "timestamp": "2026-10-29T13:25:17.000+0000",
  "channel": {
    "id": "1730052000.220102609",
    "linkedid": "1730052000.220102609",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677453680"
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
  "timestamp": "2026-10-29T13:25:17.000+0000",
  "channel": {
    "id": "1730052000.220102609",
    "linkedid": "1730052000.220102609",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677453680"
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
  "session_id": "a6eebea3-23e5-43fb-92d7-c7506aae1db3",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyMTcsImlhdCI6MTc5MzI4MDMxNywianRpIjoiODYwNTZmM2EtYmNiYi00NjUyLWFiYzYtZjdhN2I3YzI5Y2JhIiwic2lkIjoiYTZlZWJlYTMtMjNlNS00M2ZiLTkyZDctYzc1MDZhYWUxZGIzIn0.n5aDtVMVAvJm2Moa4orJ7gZDliMKDtxaRZWjC4Vvckc",
  "access_expires_at": "2026-10-29T13:40:17.441164639Z",
  "refresh_token": "CP_q9IYIZH5lT8rcqT7XbCVbrLXxwnEmf9eiQHFWNKc",
  "refresh_expires_at": "2026-10-30T01:25:17.440824486Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "31a26159-a1b6-4c4e-bd74-74c9a350f9c5",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677453680",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T13:25:17Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/31a26159-a1b6-4c4e-bd74-74c9a350f9c5/answer` → **200**

```json
{
  "command_id": "ae049b4b-85b1-4ee7-9ce5-3a94648d0d8b"
}
```

```json
{
  "id": "31a26159-a1b6-4c4e-bd74-74c9a350f9c5",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677453680",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "order_ids": [],
  "started_at": "2026-10-29T13:25:17Z",
  "answered_at": "2026-10-29T13:25:17.836256Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.220102609",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "955da511-2718-4416-ad9d-156851e9d352",
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
  "id": "c5567c0a-c3a9-4a33-81d0-22406a121822",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:18.052600Z",
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
  "command_id": "afd0211d-bb96-47e9-b29f-543423642309",
  "quote_id": "c5567c0a-c3a9-4a33-81d0-22406a121822",
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
    "phone": "+380677453680"
  },
  "call_id": "31a26159-a1b6-4c4e-bd74-74c9a350f9c5"
}
```

```json
{
  "id": "e3b7b45e-307f-45ed-8a67-4253ce088fc4",
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
  "created_at": "2026-10-29T13:25:18.254783Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677453680"
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
    "id": "1730052000.220102609",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "31a26159-a1b6-4c4e-bd74-74c9a350f9c5",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677453680",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [
        "e3b7b45e-307f-45ed-8a67-4253ce088fc4"
      ],
      "started_at": "2026-10-29T13:25:17Z",
      "answered_at": "2026-10-29T13:25:17.836256Z",
      "ended_at": "2026-10-29T13:25:18.46833Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "057657cc-ee80-46e6-b483-7258699b255c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675098412",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [],
      "started_at": "2026-10-29T13:23:26.753596Z",
      "answered_at": "2026-10-29T13:23:26.974115Z",
      "ended_at": "2026-10-29T13:23:27.184691Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T13:23:33.192655Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/e3b7b45e-307f-45ed-8a67-4253ce088fc4` → **200**

```json
{
  "id": "e3b7b45e-307f-45ed-8a67-4253ce088fc4",
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
  "created_at": "2026-10-29T13:25:18.254783Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677453680"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/e3b7b45e-307f-45ed-8a67-4253ce088fc4` → **200**

```json
{
  "id": "e3b7b45e-307f-45ed-8a67-4253ce088fc4",
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
  "created_at": "2026-10-29T13:25:18.254783Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677453680"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e3b7b45e-307f-45ed-8a67-4253ce088fc4/cancel` → **200**

```json
{
  "command_id": "b3ed0a88-cffc-4239-a869-a9feb50ece65",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e3b7b45e-307f-45ed-8a67-4253ce088fc4",
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
  "created_at": "2026-10-29T13:25:18.254783Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677453680"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 31a26159-a1b6-4c4e-bd74-74c9a350f9c5 with order e3b7b45e-307f-45ed-8a67-4253ce088fc4.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11251"
}
```

```json
{
  "challenge_id": "add15127-a480-40de-ae4b-be5cfa8209c8",
  "expires_at": "2026-10-29T13:30:19.339225225Z",
  "resend_available_at": "2026-10-29T13:25:20.339225225Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "793383",
  "sent_at": "2026-10-29T13:25:19.342039223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "add15127-a480-40de-ae4b-be5cfa8209c8",
  "code": "793383",
  "device_ref": "sandbox-11251"
}
```

```json
{
  "session_id": "b184ba26-22de-491d-9c32-4b91fc9fe9e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTIxOSwiaWF0IjoxNzkzMjgwMzE5LCJqdGkiOiJkNTRjNTcwNy02OTRkLTQ0ZTMtYWVlYy0wYjA2M2MzZjhlOTciLCJzaWQiOiJiMTg0YmEyNi0yMmRlLTQ5MWQtOWMzMi00YjkxZmM5ZmU5ZTMifQ.rE1UpvUdfJwtNJVsS0kvtPcGjySGEkVkj_DKUFAVOpM",
  "access_expires_at": "2026-10-29T13:40:19.552236533Z",
  "refresh_token": "QYdAUAf9ueqOItNY5xUSgz54sIptxENFvp-Z0FgAXKM",
  "refresh_expires_at": "2026-11-28T13:25:19.55150619Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:10.022736Z",
  "last_location_at": "2026-10-29T13:25:10.022736Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3342166-e2ae-48bf-bd5c-53da064ad66b/handover` → **200**

```json
{
  "command_id": "3e345c3b-3ea0-4f10-b086-65a20d1bbba6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:10.022736Z",
  "last_location_at": "2026-10-29T13:25:10.022736Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3342166-e2ae-48bf-bd5c-53da064ad66b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:20Z",
    "sequence": 1793280320119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:20.135228Z",
  "last_location_at": "2026-10-29T13:25:20.135228Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668421232",
  "device_ref": "sandbox-3836"
}
```

```json
{
  "challenge_id": "4f3922ff-ea1d-41e1-885f-c85288e6bdf7",
  "expires_at": "2026-10-29T13:30:20.310528596Z",
  "resend_available_at": "2026-10-29T13:25:21.310528596Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668421232` → **200**

```json
{
  "phone": "+380668421232",
  "audience": "CLIENT",
  "code": "414302",
  "sent_at": "2026-10-29T13:25:20.312414453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f3922ff-ea1d-41e1-885f-c85288e6bdf7",
  "code": "414302",
  "device_ref": "sandbox-3836"
}
```

```json
{
  "session_id": "8f214a8e-5e5a-4bdc-b8e9-3783931bfc89",
  "subject": {
    "type": "CLIENT",
    "id": "66ca8a92-8b21-4806-90a6-0348dd04bb8a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NmNhOGE5Mi04YjIxLTQ4MDYtOTBhNi0wMzQ4ZGQwNGJiOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjIwLCJpYXQiOjE3OTMyODAzMjAsImp0aSI6IjRiYzllMDYwLWFmOWUtNGE1OS1iMDIxLTIzZTk5N2U2N2NiYyIsInNpZCI6IjhmMjE0YThlLTVlNWEtNGJkYy1iOGU5LTM3ODM5MzFiZmM4OSJ9.jvOSWfAxK4R2USq--9FUqtzt9v9tD786M04nXpvlEfE",
  "access_expires_at": "2026-10-29T13:40:20.515466194Z",
  "refresh_token": "zSRcfI98zmZa_S7QrESsTS0qdlSgad1EbbqNS_SmZvk",
  "refresh_expires_at": "2026-11-28T13:25:20.515090467Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4d124b9e-1abe-4aea-870e-2e60135510d6",
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
  "id": "4a522488-2504-45ea-bceb-907ce741243d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:20.704505Z",
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
  "command_id": "93a2864f-ef30-4ef6-85e2-5cf5db0a575c",
  "quote_id": "4a522488-2504-45ea-bceb-907ce741243d",
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
  "id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66ca8a92-8b21-4806-90a6-0348dd04bb8a",
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
  "created_at": "2026-10-29T13:25:20.904621Z",
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
    "id": "469883ab-4cbd-41b3-a94e-86b49df200b7",
    "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
    "expires_at": "2026-10-29T13:25:35.906948Z",
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

`POST /api/driver/v1/offers/469883ab-4cbd-41b3-a94e-86b49df200b7/accept` → **200**

```json
{
  "command_id": "9c9af997-77e5-46cc-878a-4645e01495c1"
}
```

```json
{
  "id": "740352e9-66c8-4f35-a87f-2e3f8a2eff39",
  "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4127b037-0ad0-4f92-b3f1-2fe528f545c7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4127b037-0ad0-4f92-b3f1-2fe528f545c7",
  "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
  "assignment_id": "740352e9-66c8-4f35-a87f-2e3f8a2eff39",
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

`POST /api/driver/v1/work-sessions/f3342166-e2ae-48bf-bd5c-53da064ad66b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:21Z",
    "sequence": 1793280321666
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:21.682077Z",
  "last_location_at": "2026-10-29T13:25:21.682077Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4127b037-0ad0-4f92-b3f1-2fe528f545c7/arrive` → **200**

```json
{
  "command_id": "238a8aad-e90f-4d71-8b33-79f5f856749f",
  "expected_version": 0
}
```

```json
{
  "id": "4127b037-0ad0-4f92-b3f1-2fe528f545c7",
  "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
  "assignment_id": "740352e9-66c8-4f35-a87f-2e3f8a2eff39",
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
  "arrived_at": "2026-10-29T13:25:21.877026Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4127b037-0ad0-4f92-b3f1-2fe528f545c7/start` → **200**

```json
{
  "command_id": "9cd089c2-bdcd-49c2-aa8d-82192fecdb50",
  "expected_version": 1
}
```

```json
{
  "id": "4127b037-0ad0-4f92-b3f1-2fe528f545c7",
  "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
  "assignment_id": "740352e9-66c8-4f35-a87f-2e3f8a2eff39",
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
  "arrived_at": "2026-10-29T13:25:21.877026Z",
  "started_at": "2026-10-29T13:25:22.079807Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/f3342166-e2ae-48bf-bd5c-53da064ad66b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:22Z",
    "sequence": 1793280322269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:22.285164Z",
  "last_location_at": "2026-10-29T13:25:22.285164Z",
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
  "device_ref": "sandbox-22921"
}
```

```json
{
  "challenge_id": "352afb41-0fab-4e10-9773-4876297dbb09",
  "expires_at": "2026-10-29T13:30:22.467239874Z",
  "resend_available_at": "2026-10-29T13:25:23.467239874Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "929571",
  "sent_at": "2026-10-29T13:25:22.469112183Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "352afb41-0fab-4e10-9773-4876297dbb09",
  "code": "929571",
  "device_ref": "sandbox-22921"
}
```

```json
{
  "session_id": "65cf13c0-cf34-4665-88e5-cb38b38c3066",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTIyMiwiaWF0IjoxNzkzMjgwMzIyLCJqdGkiOiIwM2JkNGZiYy1iYjAxLTQ4ODktOGQ0Ny00NDc0NmNiMzEzOWYiLCJzaWQiOiI2NWNmMTNjMC1jZjM0LTQ2NjUtODhlNS1jYjM4YjM4YzMwNjYifQ.SfuM06dDI7kwBHEUjroKSic_NO8jrA00xSd9WMJhjn8",
  "access_expires_at": "2026-10-29T13:40:22.678895953Z",
  "refresh_token": "RLfLXtTTvgjls8lrICcxtcIzA7SxIGn8ZsysT93hKc4",
  "refresh_expires_at": "2026-11-28T13:25:22.678421666Z",
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
  "command_id": "36380c67-8483-4b16-a65e-ac4636aab00b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:23Z",
    "sequence": 1793280323455
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "25688aaa-08ce-43d2-9311-c1d5bb4e84d5",
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
  "last_heartbeat_at": "2026-10-29T13:25:23.061694Z",
  "last_location_at": "2026-10-29T13:25:23.061694Z",
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
  "session_id": "aa031b12-27f6-4e9f-8393-ec688083e3da",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyMjMsImlhdCI6MTc5MzI4MDMyMywianRpIjoiNmNiNDBiMWUtMWMyYy00ODQ1LTk0MTgtMWU2ZmYxMTk2ZmI3Iiwic2lkIjoiYWEwMzFiMTItMjdmNi00ZTlmLTgzOTMtZWM2ODgwODNlM2RhIn0.0hrARu6mD2OhMaAhKlhCeZ0yR3f3DxeCSsl63Vgf1Vs",
  "access_expires_at": "2026-10-29T13:40:23.47575569Z",
  "refresh_token": "nh_C-RnF8SzVggnHaNI8keeOMBkwgjmKcvhMIwWwsRY",
  "refresh_expires_at": "2026-10-30T01:25:23.475176835Z",
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
  "session_id": "e4dab9b6-c9dd-434c-8031-e48e9fe64d3e",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyMjMsImlhdCI6MTc5MzI4MDMyMywianRpIjoiMzljZjYyNzUtZTRjOC00YzgxLWFkYjAtN2FhNjQzMzZlYmNjIiwic2lkIjoiZTRkYWI5YjYtYzlkZC00MzRjLTgwMzEtZTQ4ZTlmZTY0ZDNlIn0.PzKzyVbvVkbQLEkTbp07TJQY890wVhiiNylxr0FtCXk",
  "access_expires_at": "2026-10-29T13:40:23.888166726Z",
  "refresh_token": "oF2E42VICFWxFG63Js-5d1DMyWe9Zbn0Qkh_7Qxxm4I",
  "refresh_expires_at": "2026-10-30T01:25:23.887223741Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b3a73a5f-3426-4569-bcc5-e3fd21eacf3c` → **200**

```json
{
  "id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "66ca8a92-8b21-4806-90a6-0348dd04bb8a",
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
    "id": "740352e9-66c8-4f35-a87f-2e3f8a2eff39",
    "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4127b037-0ad0-4f92-b3f1-2fe528f545c7",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T13:25:20.904621Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b3a73a5f-3426-4569-bcc5-e3fd21eacf3c/interrupt` → **200**

```json
{
  "command_id": "3b0c38c8-7fe6-4ea9-8749-b00a1b240af2",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "66ca8a92-8b21-4806-90a6-0348dd04bb8a",
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
      "id": "740352e9-66c8-4f35-a87f-2e3f8a2eff39",
      "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "4127b037-0ad0-4f92-b3f1-2fe528f545c7",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T13:25:20.904621Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "66ca8a92-8b21-4806-90a6-0348dd04bb8a",
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
    "id": "47813f30-bbc7-45a2-8ad8-f5c638ab3ee4",
    "order_id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
    "expires_at": "2026-10-29T13:25:39.308057Z",
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

`POST /api/driver/v1/offers/47813f30-bbc7-45a2-8ad8-f5c638ab3ee4/accept` → **200**

```json
{
  "command_id": "8040a32d-3189-4fa4-9cb1-bfc1bd439dc9"
}
```

```json
{
  "id": "4b7e32eb-f2d8-4416-8fb6-e9938ffc3336",
  "order_id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cd6d2c29-3b23-416d-af52-0a25ef0a5fca",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cd6d2c29-3b23-416d-af52-0a25ef0a5fca",
  "order_id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
  "assignment_id": "4b7e32eb-f2d8-4416-8fb6-e9938ffc3336",
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
  "session_id": "25688aaa-08ce-43d2-9311-c1d5bb4e84d5",
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
  "last_heartbeat_at": "2026-10-29T13:25:23.061694Z",
  "last_location_at": "2026-10-29T13:25:23.061694Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/25688aaa-08ce-43d2-9311-c1d5bb4e84d5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:25Z",
    "sequence": 1793280325293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "25688aaa-08ce-43d2-9311-c1d5bb4e84d5",
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
  "last_heartbeat_at": "2026-10-29T13:25:25.309666Z",
  "last_location_at": "2026-10-29T13:25:25.309666Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cd6d2c29-3b23-416d-af52-0a25ef0a5fca/arrive` → **200**

```json
{
  "command_id": "369d64e5-be64-4db0-9da2-69077c1672db",
  "expected_version": 0
}
```

```json
{
  "id": "cd6d2c29-3b23-416d-af52-0a25ef0a5fca",
  "order_id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
  "assignment_id": "4b7e32eb-f2d8-4416-8fb6-e9938ffc3336",
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
  "arrived_at": "2026-10-29T13:25:25.503961Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cd6d2c29-3b23-416d-af52-0a25ef0a5fca/start` → **200**

```json
{
  "command_id": "29cec346-06c4-48a8-8892-dbdf8e69b78c",
  "expected_version": 1
}
```

```json
{
  "id": "cd6d2c29-3b23-416d-af52-0a25ef0a5fca",
  "order_id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
  "assignment_id": "4b7e32eb-f2d8-4416-8fb6-e9938ffc3336",
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
  "arrived_at": "2026-10-29T13:25:25.503961Z",
  "started_at": "2026-10-29T13:25:25.700436Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cd6d2c29-3b23-416d-af52-0a25ef0a5fca/complete` → **200**

```json
{
  "command_id": "557186f3-b569-452e-9e23-222481bcf4b3",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:25:25Z"
}
```

```json
{
  "id": "cd6d2c29-3b23-416d-af52-0a25ef0a5fca",
  "order_id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
  "assignment_id": "4b7e32eb-f2d8-4416-8fb6-e9938ffc3336",
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
  "arrived_at": "2026-10-29T13:25:25.503961Z",
  "started_at": "2026-10-29T13:25:25.700436Z",
  "completed_at": "2026-10-29T13:25:25.897018Z",
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
    "id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T13:25:24.301872Z",
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
    "id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T13:25:20.904621Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
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

`GET /api/operator/v1/orders/b3a73a5f-3426-4569-bcc5-e3fd21eacf3c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T13:25:20.905038Z",
      "actor": {
        "type": "CLIENT",
        "id": "66ca8a92-8b21-4806-90a6-0348dd04bb8a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
        "quote_id": "4a522488-2504-45ea-bceb-907ce741243d",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "3df0f107-e7d3-44d7-8a2d-632d21d36d6d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T13:25:20.906466Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
        "attempt_id": "c1daf4eb-a55f-41f2-a6be-2922af7d93e5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3df0f107-e7d3-44d7-8a2d-632d21d36d6d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T13:25:20.910853Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "469883ab-4cbd-41b3-a94e-86b49df200b7",
        "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "3df0f107-e7d3-44d7-8a2d-632d21d36d6d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T13:25:21.300853Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "469883ab-4cbd-41b3-a94e-86b49df200b7",
        "order_id": "b3a73a5f-3426-4569-bcc5-e3fd21eacf3c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "740352e9-66c8-4f35-a87f-2e3f8a2eff39"
      },
      "correlation_id": "9a7af151-f385-4cfd-8221-9291a2045ed8"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/8f28234a-d195-4cea-91d7-b7f76f6c836a/tip` → **200**

```json
{
  "order_id": "8f28234a-d195-4cea-91d7-b7f76f6c836a",
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
  "available_until": "2026-10-30T13:25:25.897018Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/8f28234a-d195-4cea-91d7-b7f76f6c836a/tip` → **409**

```json
{
  "command_id": "d8655a67-908e-4045-b6cc-ecb6132763ed",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/8f28234a-d195-4cea-91d7-b7f76f6c836a/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2485c609-21fb-40aa-985b-f2a5b6fd3107"
}
```

Done: interrupted b3a73a5f-3426-4569-bcc5-e3fd21eacf3c, follow-up 8f28234a-d195-4cea-91d7-b7f76f6c836a.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3342166-e2ae-48bf-bd5c-53da064ad66b",
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
  "last_heartbeat_at": "2026-10-29T13:25:22.285164Z",
  "last_location_at": "2026-10-29T13:25:22.285164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3342166-e2ae-48bf-bd5c-53da064ad66b/close` → **200**

```json
{
  "command_id": "4ff75845-d950-4b4b-b5e0-3b852e2f660f",
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
  "session_id": "25688aaa-08ce-43d2-9311-c1d5bb4e84d5",
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
  "last_heartbeat_at": "2026-10-29T13:25:25.309666Z",
  "last_location_at": "2026-10-29T13:25:25.309666Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/25688aaa-08ce-43d2-9311-c1d5bb4e84d5/close` → **200**

```json
{
  "command_id": "23c6d420-808b-4d2b-b5a7-7dbe168e42d2",
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
  "session_id": "bdc85619-2452-4ec4-b08b-f2f2eecbcdd0",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyMzEsImlhdCI6MTc5MzI4MDMzMSwianRpIjoiZDQzZGQxMDQtNmRkYy00NzhiLWE0OTAtMGJhNDEzZDAxNTZhIiwic2lkIjoiYmRjODU2MTktMjQ1Mi00ZWM0LWIwOGItZjJmMmVlY2JjZGQwIn0.TgwIRjERRiGdi6875_d1UwfXer_TkXwihzzplkH4yK0",
  "access_expires_at": "2026-10-29T13:40:31.114621428Z",
  "refresh_token": "wC5vS6q9-bIWwnHcAhV6yfaSGFJbAQPMZatROIcVYKY",
  "refresh_expires_at": "2026-10-30T01:25:31.114153842Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c582275f-c169-486d-82e2-cea1893deb7c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T13:25:31Z"
}
```

```json
{
  "id": "5bc9d963-f4f7-4bde-8f9d-20130fff3b69",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T13:25:31Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/5bc9d963-f4f7-4bde-8f9d-20130fff3b69/publish` → **200**

```json
{
  "command_id": "44558d15-5746-45ef-b103-2174ff9d0c13",
  "expected_version": 0
}
```

```json
{
  "id": "5bc9d963-f4f7-4bde-8f9d-20130fff3b69",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T13:25:31.521982Z",
  "published_at": "2026-10-29T13:25:31.521982Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "5bc9d963-f4f7-4bde-8f9d-20130fff3b69",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T13:25:31.521982Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634717859",
  "device_ref": "sandbox-30347"
}
```

```json
{
  "challenge_id": "ddf53ad5-ef6a-434e-8bcb-e21a92c4512b",
  "expires_at": "2026-10-29T13:30:31.951711325Z",
  "resend_available_at": "2026-10-29T13:25:32.951711325Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634717859` → **200**

```json
{
  "phone": "+380634717859",
  "audience": "CLIENT",
  "code": "270617",
  "sent_at": "2026-10-29T13:25:31.953635722Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddf53ad5-ef6a-434e-8bcb-e21a92c4512b",
  "code": "270617",
  "device_ref": "sandbox-30347"
}
```

```json
{
  "session_id": "82b20761-a1da-4b0e-8ee9-9142d4f33e59",
  "subject": {
    "type": "CLIENT",
    "id": "7961b88d-a15b-49f3-b4d1-dcd4ead2684b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OTYxYjg4ZC1hMTViLTQ5ZjMtYjRkMS1kY2Q0ZWFkMjY4NGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjMyLCJpYXQiOjE3OTMyODAzMzIsImp0aSI6IjAxZjYxYjUyLTk4ZTItNDM0Yi1iZGFmLTY5YzgzNzYyYjM1ZiIsInNpZCI6IjgyYjIwNzYxLWExZGEtNGIwZS04ZWU5LTkxNDJkNGYzM2U1OSJ9.CEKd9LHfiAMunmb4YALJGTyR8kORc5iUMrJyGav8PJQ",
  "access_expires_at": "2026-10-29T13:40:32.166394997Z",
  "refresh_token": "ytVB4YDQGRiCnNK2s7BgCdordIv1ZM7rqDYbGzcrisY",
  "refresh_expires_at": "2026-11-28T13:25:32.166026831Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "5bc9d963-f4f7-4bde-8f9d-20130fff3b69",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T13:25:31.521982Z",
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
  "command_id": "90c80f8e-33f8-46f4-b763-d19973bf4db6",
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
  "id": "bbe8a4bb-3428-4259-9297-f2688dbd0032",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:32.546199Z",
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
  "command_id": "32e0997d-de90-4402-bd01-f064ab183c64",
  "quote_id": "bbe8a4bb-3428-4259-9297-f2688dbd0032",
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
  "correlation_id": "e07f4ba8-a676-4fe4-91c7-936556cbf2a1"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "0a474a68-6bef-4bb4-a0f8-9dd913bff938",
  "version_id": "5bc9d963-f4f7-4bde-8f9d-20130fff3b69",
  "language": "uk"
}
```

```json
{
  "version_id": "5bc9d963-f4f7-4bde-8f9d-20130fff3b69",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T13:25:32.933079Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8ebaccd4-7890-45a3-a49e-ef59303826b9",
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
  "id": "4197f8a3-caf3-4d13-9c28-696257c85c1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:33.122399Z",
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
  "command_id": "bd9a5e56-c422-4522-ba27-11b218ec066b",
  "quote_id": "4197f8a3-caf3-4d13-9c28-696257c85c1a",
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
  "id": "781979f2-4d2a-4412-bb4d-e63dca1bb14d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7961b88d-a15b-49f3-b4d1-dcd4ead2684b",
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
  "created_at": "2026-10-29T13:25:33.318094Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/781979f2-4d2a-4412-bb4d-e63dca1bb14d` → **200**

```json
{
  "id": "781979f2-4d2a-4412-bb4d-e63dca1bb14d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7961b88d-a15b-49f3-b4d1-dcd4ead2684b",
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
  "created_at": "2026-10-29T13:25:33.318094Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/781979f2-4d2a-4412-bb4d-e63dca1bb14d/cancel` → **200**

```json
{
  "command_id": "1f5d15a0-4cf4-46f1-89bc-f5fcb9e34bb9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "781979f2-4d2a-4412-bb4d-e63dca1bb14d",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7961b88d-a15b-49f3-b4d1-dcd4ead2684b",
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
  "created_at": "2026-10-29T13:25:33.318094Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
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

`POST /api/admin/v1/legal-documents/5bc9d963-f4f7-4bde-8f9d-20130fff3b69` → **409**

```json
{
  "command_id": "a987a743-99c5-4cdc-9d5f-23614066219a",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T13:25:33Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/5bc9d963-f4f7-4bde-8f9d-20130fff3b69",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "59f4d251-0266-4990-b7c9-68a49dfe14c0"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f22b8732-73f1-4712-a95c-9620e0a5a72b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T13:25:34Z"
}
```

```json
{
  "id": "945a694e-e440-4cc3-82c8-4f1d52553ee5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T13:25:34Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/945a694e-e440-4cc3-82c8-4f1d52553ee5/publish` → **200**

```json
{
  "command_id": "da4128b9-dd96-4ef9-afb4-d7bf4c9e3954",
  "expected_version": 0
}
```

```json
{
  "id": "945a694e-e440-4cc3-82c8-4f1d52553ee5",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T13:25:34.387584Z",
  "published_at": "2026-10-29T13:25:34.387584Z",
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
  "device_ref": "sandbox-7470"
}
```

```json
{
  "challenge_id": "69a55dfa-5a2d-4d59-9adc-ff7ecf30c980",
  "expires_at": "2026-10-29T13:30:34.591091238Z",
  "resend_available_at": "2026-10-29T13:25:35.591091238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "924762",
  "sent_at": "2026-10-29T13:25:34.593222697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69a55dfa-5a2d-4d59-9adc-ff7ecf30c980",
  "code": "924762",
  "device_ref": "sandbox-7470"
}
```

```json
{
  "session_id": "52826718-5dfe-487c-a802-2d81a884365c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTIzNCwiaWF0IjoxNzkzMjgwMzM0LCJqdGkiOiIwODY0Mzg2Ny1iOGNkLTRjZWEtYWM3NC0xZDE4NTUxZTA3YTQiLCJzaWQiOiI1MjgyNjcxOC01ZGZlLTQ4N2MtYTgwMi0yZDgxYTg4NDM2NWMifQ.Z9EwqVfkeAzDkrL7zyqmMZQ4EtUjjAU5lrHdpxcCCoE",
  "access_expires_at": "2026-10-29T13:40:34.804043017Z",
  "refresh_token": "vAzqqD2H8A4r9rjkPlCa0GSb-rtFWjyeueG5p9Xm8aA",
  "refresh_expires_at": "2026-11-28T13:25:34.803684255Z",
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
  "command_id": "1b38e533-3d5c-47eb-82d3-ab2ec83fa0ba",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:35Z",
    "sequence": 1793280335176
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b5582357-a8e8-437b-87f4-5e31c59c2adb",
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
  "last_heartbeat_at": "2026-10-29T13:25:35.194677Z",
  "last_location_at": "2026-10-29T13:25:35.194677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674615008",
  "device_ref": "sandbox-6084"
}
```

```json
{
  "challenge_id": "8a62e7da-28a4-42da-9dd4-3f604e765df6",
  "expires_at": "2026-10-29T13:30:35.381509415Z",
  "resend_available_at": "2026-10-29T13:25:36.381509415Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674615008` → **200**

```json
{
  "phone": "+380674615008",
  "audience": "CLIENT",
  "code": "287446",
  "sent_at": "2026-10-29T13:25:35.383534261Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a62e7da-28a4-42da-9dd4-3f604e765df6",
  "code": "287446",
  "device_ref": "sandbox-6084"
}
```

```json
{
  "session_id": "7a7c6f3e-40f5-4c25-ab06-122e971ad96a",
  "subject": {
    "type": "CLIENT",
    "id": "fec31b87-48b2-4377-92af-04bf68ae7649"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWMzMWI4Ny00OGIyLTQzNzctOTJhZi0wNGJmNjhhZTc2NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjM1LCJpYXQiOjE3OTMyODAzMzUsImp0aSI6IjIxN2M3ZjJkLWEwY2QtNDU4Yi1hN2RmLTMwZWM2MmNiYmEzMyIsInNpZCI6IjdhN2M2ZjNlLTQwZjUtNGMyNS1hYjA2LTEyMmU5NzFhZDk2YSJ9.xzzGlC1WZg3ctxmjCWlZG1j92zTBQhpfQ0QFyuKMZe8",
  "access_expires_at": "2026-10-29T13:40:35.597336564Z",
  "refresh_token": "xtZwtEnkcthQ8nFxGsfsQduFRBz0O5Ikhv0SukuXcaM",
  "refresh_expires_at": "2026-11-28T13:25:35.597014367Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c6c92c82-8192-440d-88ec-42413628adce",
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
  "id": "73faed28-7ad9-40b5-969c-d087d32aa09c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:35.790655Z",
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
  "command_id": "b1d3bf03-b178-4b06-8c39-8837bdf1dd05",
  "quote_id": "73faed28-7ad9-40b5-969c-d087d32aa09c",
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
    "phone": "+380671810892"
  }
}
```

```json
{
  "id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:25:35.986168Z",
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
    "id": "2a87e1bc-eddd-4b67-a4eb-d4b106749338",
    "order_id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
    "expires_at": "2026-10-29T13:25:50.98804Z",
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

`POST /api/driver/v1/offers/2a87e1bc-eddd-4b67-a4eb-d4b106749338/accept` → **200**

```json
{
  "command_id": "55d55898-1058-4c95-b260-bca390998937"
}
```

```json
{
  "id": "6aa1b5d5-74eb-4912-bba8-dfe37b03f397",
  "order_id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "690f07e2-d3fc-49ea-bbc8-56e7ee2b33ef",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "690f07e2-d3fc-49ea-bbc8-56e7ee2b33ef",
  "order_id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
  "assignment_id": "6aa1b5d5-74eb-4912-bba8-dfe37b03f397",
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
    "phone": "+380671810892"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fdef8ebe-9255-4235-977c-81e0da55f10d",
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
  "id": "c6613d5e-49f0-426f-8a32-76419e6a8951",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:36.784592Z",
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
  "command_id": "3f9bbcfb-39b5-478c-9b18-bff9bd87b777",
  "quote_id": "c6613d5e-49f0-426f-8a32-76419e6a8951",
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
  "id": "bed208e7-7746-46c6-b658-5886a255012c",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:25:36.982317Z",
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
  "command_id": "e7fec83b-8f4a-401d-a0fe-a4df12dd50f9",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T16:25:37Z"
}
```

```json
{
  "id": "2bafaa4d-d605-4c70-a0d4-498b76cf9753",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:37.197447Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T16:25:37Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "51cf4c2b-897e-4650-b3c1-5352cd4fb518",
  "quote_id": "2bafaa4d-d605-4c70-a0d4-498b76cf9753",
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
  "pickup_at": "2026-10-29T16:25:37Z"
}
```

```json
{
  "id": "68df1784-ae6f-404a-afca-daaadcdf14e8",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T13:25:37.421911Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T16:25:37Z",
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
  "command_id": "0dcbeade-3dd5-401f-a033-12a42c67343a",
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
  "id": "502ac696-2c6a-47a0-a09c-5263bef123b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:37.661375Z",
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
  "command_id": "feb8f3dc-176a-4ce6-832a-26fc5d517711",
  "quote_id": "502ac696-2c6a-47a0-a09c-5263bef123b3",
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
  "correlation_id": "18105b1e-e0cd-4c82-a913-c9356d5768ec"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "68df1784-ae6f-404a-afca-daaadcdf14e8",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T13:25:37.421911Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T16:25:37Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "bed208e7-7746-46c6-b658-5886a255012c",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T13:25:36.982317Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "bed208e7-7746-46c6-b658-5886a255012c",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:25:36.982317Z",
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

`GET /api/rider/v1/orders/2740f573-9aa1-4635-8ff5-2d58925793e3` → **200**

```json
{
  "id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6aa1b5d5-74eb-4912-bba8-dfe37b03f397",
    "order_id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "690f07e2-d3fc-49ea-bbc8-56e7ee2b33ef",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T13:25:35.986168Z",
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
    "location_at": "2026-10-29T13:25:35.194677Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/2740f573-9aa1-4635-8ff5-2d58925793e3/cancel` → **200**

```json
{
  "command_id": "99570b20-ec2d-41a8-9ed6-9dd8105909eb",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "6aa1b5d5-74eb-4912-bba8-dfe37b03f397",
    "order_id": "2740f573-9aa1-4635-8ff5-2d58925793e3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "690f07e2-d3fc-49ea-bbc8-56e7ee2b33ef",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T13:25:35.986168Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
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

`GET /api/rider/v1/orders/bed208e7-7746-46c6-b658-5886a255012c` → **200**

```json
{
  "id": "bed208e7-7746-46c6-b658-5886a255012c",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:25:36.982317Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bed208e7-7746-46c6-b658-5886a255012c/cancel` → **200**

```json
{
  "command_id": "01260fcc-1408-4f3e-a0a8-04c0043edeba",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bed208e7-7746-46c6-b658-5886a255012c",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:25:36.982317Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
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

`GET /api/rider/v1/orders/68df1784-ae6f-404a-afca-daaadcdf14e8` → **200**

```json
{
  "id": "68df1784-ae6f-404a-afca-daaadcdf14e8",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T13:25:37.421911Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T16:25:37Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/68df1784-ae6f-404a-afca-daaadcdf14e8/cancel` → **200**

```json
{
  "command_id": "6b606a9f-55e5-4971-9e01-0b702dc2f6d0",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "68df1784-ae6f-404a-afca-daaadcdf14e8",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "fec31b87-48b2-4377-92af-04bf68ae7649",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T13:25:37.421911Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-29T16:25:37Z",
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
  "session_id": "b5582357-a8e8-437b-87f4-5e31c59c2adb",
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
  "last_heartbeat_at": "2026-10-29T13:25:35.194677Z",
  "last_location_at": "2026-10-29T13:25:35.194677Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b5582357-a8e8-437b-87f4-5e31c59c2adb/close` → **200**

```json
{
  "command_id": "faa8ad75-815d-4439-86f0-749d0b4c0807",
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

Done: orders 2740f573-9aa1-4635-8ff5-2d58925793e3, bed208e7-7746-46c6-b658-5886a255012c, 68df1784-ae6f-404a-afca-daaadcdf14e8.

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
  "session_id": "e9c8e423-5060-491f-9221-3bd5b0509933",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyNDAsImlhdCI6MTc5MzI4MDM0MCwianRpIjoiZjBkYmI5NzAtOTRhOC00ZDY3LTgwM2ItYzk5OGUyMDdkNzM5Iiwic2lkIjoiZTljOGU0MjMtNTA2MC00OTFmLTkyMjEtM2JkNWIwNTA5OTMzIn0.8u4TdVX0lf8yDQcjoAnoNXQkKaZtPlsTKBFKkd192GE",
  "access_expires_at": "2026-10-29T13:40:40.269014252Z",
  "refresh_token": "s0jApwwgqVtwxo85tTkfc0U328vOuJCP3mCRyNApIJE",
  "refresh_expires_at": "2026-10-30T01:25:40.268693748Z",
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
  "session_id": "c2ea17e9-0039-48ba-8961-9f0b0b255638",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyNDAsImlhdCI6MTc5MzI4MDM0MCwianRpIjoiNDNlMmQwNGEtOTU5ZS00MGMyLWI5Y2EtZTllNmRiMjNjMzUzIiwic2lkIjoiYzJlYTE3ZTktMDAzOS00OGJhLTg5NjEtOWYwYjBiMjU1NjM4In0.Yf5fnxD9y7u6CBrt4jJX4-GYIrJh2NhHiD0oOaio7WA",
  "access_expires_at": "2026-10-29T13:40:40.685168482Z",
  "refresh_token": "mFsEK8wysqViWLMKTBmFZsj8okTpklCeIlLOGXTIpzw",
  "refresh_expires_at": "2026-10-30T01:25:40.684850882Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5728"
}
```

```json
{
  "challenge_id": "05b21c8c-682e-4177-b297-2f9be4604806",
  "expires_at": "2026-10-29T13:30:40.870839736Z",
  "resend_available_at": "2026-10-29T13:25:41.870839736Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "193870",
  "sent_at": "2026-10-29T13:25:40.872707969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05b21c8c-682e-4177-b297-2f9be4604806",
  "code": "193870",
  "device_ref": "sandbox-5728"
}
```

```json
{
  "session_id": "67b786f3-5675-4480-87d2-8e0c3420c334",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTI0MSwiaWF0IjoxNzkzMjgwMzQxLCJqdGkiOiJmZDNkZjU3NC0xZGYzLTQxZTEtYjZmOC02OTRhMmVmZmZjODYiLCJzaWQiOiI2N2I3ODZmMy01Njc1LTQ0ODAtODdkMi04ZTBjMzQyMGMzMzQifQ.9sbkv1YY2XbU9qapQcxIXaIZxv7CKxgGJqmvWvVxgcY",
  "access_expires_at": "2026-10-29T13:40:41.088628122Z",
  "refresh_token": "0m0sLlqVbEutdW_Q-ccMPrUxFTJQHaoi7UIXV4G9piM",
  "refresh_expires_at": "2026-11-28T13:25:41.088192895Z",
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
  "command_id": "ee0a3ae2-fcfb-4940-90dd-434b54bf14c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:41Z",
    "sequence": 1793280341482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71b17123-fd3e-4121-8c60-466392a0c360",
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
  "last_heartbeat_at": "2026-10-29T13:25:41.502267Z",
  "last_location_at": "2026-10-29T13:25:41.502267Z",
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
  "command_id": "48bdb08b-a162-497c-979e-c47cdab66532",
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
  "effective_at": "2026-10-29T13:25:41.898261Z",
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T13:23:40.44426Z",
  "last_entries": [
    {
      "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T13:23:40.44426Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d7d22826-d50e-4a2b-b3e4-dca96472d41d",
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
  "id": "136a3e13-5c79-421e-be40-32d5ace35682",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:42.288800Z",
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
  "command_id": "56628fcb-1358-4ec6-a85e-61a83c668c86",
  "quote_id": "136a3e13-5c79-421e-be40-32d5ace35682",
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
    "phone": "+3806711120799"
  }
}
```

```json
{
  "id": "20b16c5a-e78b-4890-9aab-a9e38d562886",
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
  "created_at": "2026-10-29T13:25:42.492107Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120799"
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
    "id": "4f08f9db-726e-4400-9d8c-d767e552d350",
    "order_id": "20b16c5a-e78b-4890-9aab-a9e38d562886",
    "expires_at": "2026-10-29T13:25:57.494634Z",
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

`POST /api/driver/v1/offers/4f08f9db-726e-4400-9d8c-d767e552d350/accept` → **200**

```json
{
  "command_id": "7c9f1c05-e9c0-420f-b104-217906a56bcf"
}
```

```json
{
  "id": "27f1304c-f3f7-4b7e-9c06-e3b3b6697d87",
  "order_id": "20b16c5a-e78b-4890-9aab-a9e38d562886",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f63f528-023c-467c-8310-85f2caaff89c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f63f528-023c-467c-8310-85f2caaff89c",
  "order_id": "20b16c5a-e78b-4890-9aab-a9e38d562886",
  "assignment_id": "27f1304c-f3f7-4b7e-9c06-e3b3b6697d87",
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
    "phone": "+3806711120799"
  }
}
```

`POST /api/driver/v1/work-sessions/71b17123-fd3e-4121-8c60-466392a0c360/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:25:43Z",
    "sequence": 1793280343261
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71b17123-fd3e-4121-8c60-466392a0c360",
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
  "last_heartbeat_at": "2026-10-29T13:25:43.277Z",
  "last_location_at": "2026-10-29T13:25:43.277Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1f63f528-023c-467c-8310-85f2caaff89c/arrive` → **200**

```json
{
  "command_id": "987ecddd-805e-45c9-a1d6-d63e81e763bf",
  "expected_version": 0
}
```

```json
{
  "id": "1f63f528-023c-467c-8310-85f2caaff89c",
  "order_id": "20b16c5a-e78b-4890-9aab-a9e38d562886",
  "assignment_id": "27f1304c-f3f7-4b7e-9c06-e3b3b6697d87",
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
  "arrived_at": "2026-10-29T13:25:43.479271Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711120799"
  }
}
```

`POST /api/driver/v1/trips/1f63f528-023c-467c-8310-85f2caaff89c/start` → **200**

```json
{
  "command_id": "05676347-3c1c-44b3-9911-3f46a19cc97e",
  "expected_version": 1
}
```

```json
{
  "id": "1f63f528-023c-467c-8310-85f2caaff89c",
  "order_id": "20b16c5a-e78b-4890-9aab-a9e38d562886",
  "assignment_id": "27f1304c-f3f7-4b7e-9c06-e3b3b6697d87",
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
  "arrived_at": "2026-10-29T13:25:43.479271Z",
  "started_at": "2026-10-29T13:25:43.689425Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711120799"
  }
}
```

`POST /api/driver/v1/trips/1f63f528-023c-467c-8310-85f2caaff89c/complete` → **200**

```json
{
  "command_id": "9f0abf9a-d054-45ba-927f-9b190b354f6d",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:25:43Z",
  "cash_received": true
}
```

```json
{
  "id": "1f63f528-023c-467c-8310-85f2caaff89c",
  "order_id": "20b16c5a-e78b-4890-9aab-a9e38d562886",
  "assignment_id": "27f1304c-f3f7-4b7e-9c06-e3b3b6697d87",
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
  "arrived_at": "2026-10-29T13:25:43.479271Z",
  "started_at": "2026-10-29T13:25:43.689425Z",
  "completed_at": "2026-10-29T13:25:43.893373Z",
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
  "command_id": "d75ae680-802b-4b1c-a90b-e030481dcf61",
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
  "id": "2833fd22-aa46-41ab-a1d7-6dfcea6c756c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:30:44.095868Z",
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
  "command_id": "f0117451-b3a5-4414-aecd-d780ac8a8083",
  "quote_id": "2833fd22-aa46-41ab-a1d7-6dfcea6c756c",
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
    "phone": "+3806711119217"
  }
}
```

```json
{
  "id": "c1a26bfc-12a6-4274-8509-83c4053bc6ea",
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
  "created_at": "2026-10-29T13:25:44.300788Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119217"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c1a26bfc-12a6-4274-8509-83c4053bc6ea` → **200**

```json
{
  "id": "c1a26bfc-12a6-4274-8509-83c4053bc6ea",
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
  "created_at": "2026-10-29T13:25:44.300788Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119217"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c1a26bfc-12a6-4274-8509-83c4053bc6ea/cancel` → **200**

```json
{
  "command_id": "f622a0ec-53a5-472a-ac3c-887e165a6f57",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "c1a26bfc-12a6-4274-8509-83c4053bc6ea",
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
  "created_at": "2026-10-29T13:25:44.300788Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119217"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора"
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
  "staff_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T13:23:40.44426Z",
  "last_entries": [
    {
      "order_id": "c1a26bfc-12a6-4274-8509-83c4053bc6ea",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T13:25:44.759172Z"
    },
    {
      "order_id": "20b16c5a-e78b-4890-9aab-a9e38d562886",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T13:25:43.896279Z"
    },
    {
      "order_id": "6bc33cc8-d9a1-4577-97b9-cded64a0e7c2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T13:23:40.44426Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71b17123-fd3e-4121-8c60-466392a0c360",
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
  "last_heartbeat_at": "2026-10-29T13:25:43.277Z",
  "last_location_at": "2026-10-29T13:25:43.277Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71b17123-fd3e-4121-8c60-466392a0c360/close` → **200**

```json
{
  "command_id": "69eb61e5-7656-4ec0-b7a1-84cefb8d0a27",
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

Done: operator bonus for fulfilled 20b16c5a-e78b-4890-9aab-a9e38d562886 and operator-fault cancellation c1a26bfc-12a6-4274-8509-83c4053bc6ea.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675175721",
  "device_ref": "sandbox-8002"
}
```

```json
{
  "challenge_id": "bf405388-fc28-4a9e-9233-e4cb53451ed8",
  "expires_at": "2026-10-29T13:30:48.77418945Z",
  "resend_available_at": "2026-10-29T13:25:49.77418945Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675175721` → **200**

```json
{
  "phone": "+380675175721",
  "audience": "CLIENT",
  "code": "161957",
  "sent_at": "2026-10-29T13:25:48.776188439Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674863229",
  "device_ref": "sandbox-11043",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "354b89ce-247d-4080-ba88-fe9441f3d41c",
  "expires_at": "2026-10-29T13:30:50.193232277Z",
  "resend_available_at": "2026-10-29T13:25:51.193232277Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674863229` → **200**

```json
{
  "phone": "+380674863229",
  "audience": "CLIENT",
  "code": "000626",
  "sent_at": "2026-10-29T13:25:50.194891875Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674863229",
  "device_ref": "sandbox-18167",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "cfda87ea-94e0-4ed1-a770-91d3e2c9a24c",
  "expires_at": "2026-10-29T13:30:51.613736773Z",
  "resend_available_at": "2026-10-29T13:25:52.613736773Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674863229` → **200**

```json
{
  "phone": "+380674863229",
  "audience": "CLIENT",
  "code": "082893",
  "sent_at": "2026-10-29T13:25:51.615883536Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677100000",
  "device_ref": "sandbox-32149"
}
```

```json
{
  "challenge_id": "541f6761-4643-4e41-9476-5c42b7ff7097",
  "expires_at": "2026-10-29T13:30:53.037620683Z",
  "resend_available_at": "2026-10-29T13:25:54.037620683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677100000",
  "device_ref": "sandbox-21466"
}
```

```json
{
  "challenge_id": "2fdfb9ed-4a15-4dbf-a80f-d855c018572d",
  "expires_at": "2026-10-29T13:30:54.428371108Z",
  "resend_available_at": "2026-10-29T13:25:55.428371108Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677100000` → **200**

```json
{
  "phone": "+380677100000",
  "audience": "CLIENT",
  "code": "369752",
  "sent_at": "2026-10-29T13:25:54.430593375Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677100000",
  "device_ref": "sandbox-5529",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "713a90e9-b437-4013-9af9-8eaf7a089fec",
  "expires_at": "2026-10-29T13:30:55.846027764Z",
  "resend_available_at": "2026-10-29T13:25:56.846027764Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677100000` → **200**

```json
{
  "phone": "+380677100000",
  "audience": "CLIENT",
  "code": "440535",
  "sent_at": "2026-10-29T13:25:55.847982708Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677100000",
  "device_ref": "sandbox-622",
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
  "correlation_id": "c144693c-0806-440c-b3db-0558925d6d98",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000030476"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "78abb31f-f82a-4122-be23-d4c7d1fa4c88"
}
```

`GET /sandbox/v1/otp?phone=%2B442000030476` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120024469"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "190413d4-0a49-4192-9520-dcd99b235435"
}
```

`GET /sandbox/v1/otp?phone=%2B37120024469` → **404**

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
  "session_id": "8b9be47f-f2de-4108-b322-35bc84bcb73a",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyNTgsImlhdCI6MTc5MzI4MDM1OCwianRpIjoiYzdkYmE5MjQtYWU5OS00Y2YxLTliMjAtZGMwM2FmODQ5NWFkIiwic2lkIjoiOGI5YmU0N2YtZjJkZS00MTA4LWIzMjItMzViYzg0YmNiNzNhIn0.eHsWAzQlaBpuM-JJOm2GMtYts7E0nuHCMUKOsb3Fkyg",
  "access_expires_at": "2026-10-29T13:40:58.092209959Z",
  "refresh_token": "sybxEim2fW4t8lRYZ4dbUr_73LanLsbJUoXSOySKtww",
  "refresh_expires_at": "2026-10-30T01:25:58.091819159Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677100000` → **200**

```json
{
  "deliveries": [
    {
      "id": "513e08eb-cafe-4f46-adf6-acb245be89e2",
      "challenge_id": "713a90e9-b437-4013-9af9-8eaf7a089fec",
      "phone": "+380677100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2535105a-99ae-49a4-8cab-48a32aa76d04",
      "error": null,
      "attempted_at": "2026-10-29T13:25:55.848242Z"
    },
    {
      "id": "056b6622-78ac-4776-b5e7-8292fd7a4219",
      "challenge_id": "2fdfb9ed-4a15-4dbf-a80f-d855c018572d",
      "phone": "+380677100000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c5786150-67f4-4356-9c84-d1f6732c00d4",
      "error": null,
      "attempted_at": "2026-10-29T13:25:54.430876Z"
    },
    {
      "id": "51a3dc92-b98c-4256-b3d8-839a00b15348",
      "challenge_id": "541f6761-4643-4e41-9476-5c42b7ff7097",
      "phone": "+380677100000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T13:25:53.039573Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677100000` → **200**

```json
{
  "phone": "+380677100000",
  "audience": "CLIENT",
  "code": "440535",
  "sent_at": "2026-10-29T13:25:55.847982708Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674863229` → **200**

```json
{
  "deliveries": [
    {
      "id": "91110915-397b-4523-b11c-56df28ca6153",
      "challenge_id": "cfda87ea-94e0-4ed1-a770-91d3e2c9a24c",
      "phone": "+380674863229",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e97a7b93-f4fe-4d3b-9ec1-c8b3df7c5e26",
      "error": null,
      "attempted_at": "2026-10-29T13:25:51.616191Z"
    },
    {
      "id": "421fe9ed-172f-4596-a150-1f0e865e9e72",
      "challenge_id": "354b89ce-247d-4080-ba88-fe9441f3d41c",
      "phone": "+380674863229",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8f9d403e-8d32-4138-b96d-6816db3c6c8a",
      "error": null,
      "attempted_at": "2026-10-29T13:25:50.195309Z"
    }
  ]
}
```

Done: SMS to +380675175721; SMS then a call to +380674863229; a failed SMS, two calls and a refused third to +380677100000; +44 and +371 refused.

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
  "session_id": "be4d4a18-3261-4286-ac6f-98715d933e18",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyNTgsImlhdCI6MTc5MzI4MDM1OCwianRpIjoiZDhkYTVkNTMtYWNjYy00MTNkLWJhMjYtMGVhOWZjMWExY2I3Iiwic2lkIjoiYmU0ZDRhMTgtMzI2MS00Mjg2LWFjNmYtOTg3MTVkOTMzZTE4In0.vqsg2KARLGhJul7pExOPyc5sFtKzpsCE4SzPKTeXbE8",
  "access_expires_at": "2026-10-29T13:40:58.912715583Z",
  "refresh_token": "CCzfj7BWS83TBW9lIea09GM-Jt2mi7TEIkJHwBNuVBQ",
  "refresh_expires_at": "2026-10-30T01:25:58.912161155Z",
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
  "session_id": "a6f613ba-5bf6-4779-8010-9e5cc4edef47",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyNTksImlhdCI6MTc5MzI4MDM1OSwianRpIjoiN2Q3NWVjNjMtNjE5NS00ZjNmLWE0MTQtODliMjdhOGVjMzYyIiwic2lkIjoiYTZmNjEzYmEtNWJmNi00Nzc5LTgwMTAtOWU1Y2M0ZWRlZjQ3In0.L9LdobKKIuy9fr_vfZJIxfjDoMk7v72mG_T7ZyzXeXk",
  "access_expires_at": "2026-10-29T13:40:59.305104349Z",
  "refresh_token": "yLqyD6R8luvJGeAg0GobLQzP4cUqWWfYDUmBAzz5nMQ",
  "refresh_expires_at": "2026-10-30T01:25:59.304774851Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
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

`POST /api/admin/v1/staff-extensions/9d5e612b-6560-4572-ae4f-87d07514b00f` → **200**

```json
{
  "command_id": "28098ed6-31b8-4e97-bff3-794bddbd86a6",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "b56cc001-6aca-4f30-bf36-26a9c26c0e82",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T13:26:00.089754Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T13:26:00.089754Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "11cfaaa2-34b8-4ef0-95f3-ee506d94af7f",
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
  "id": "624278c9-a879-45bc-ab3f-fc810124a173",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:31:00.486806Z",
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
  "command_id": "9ea20815-df64-4878-ad06-3f48af8adb13",
  "quote_id": "624278c9-a879-45bc-ab3f-fc810124a173",
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
    "phone": "+380672686478"
  }
}
```

```json
{
  "id": "dca0c510-0c8e-4766-af25-74d7da94cb8d",
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
  "created_at": "2026-10-29T13:26:00.694051Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672686478"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/dca0c510-0c8e-4766-af25-74d7da94cb8d/calls` → **201**

```json
{
  "command_id": "02c27da5-0e9e-48c7-aea8-21f0e0e733e2",
  "to": "CALLER"
}
```

```json
{
  "id": "2cca2162-3055-4005-a2ef-5b45cec05c36",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "order_ids": [
    "dca0c510-0c8e-4766-af25-74d7da94cb8d"
  ],
  "started_at": "2026-10-29T13:26:00.922203Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/dca0c510-0c8e-4766-af25-74d7da94cb8d/calls` → **201**

```json
{
  "command_id": "02c27da5-0e9e-48c7-aea8-21f0e0e733e2",
  "to": "CALLER"
}
```

```json
{
  "id": "2cca2162-3055-4005-a2ef-5b45cec05c36",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "order_ids": [
    "dca0c510-0c8e-4766-af25-74d7da94cb8d"
  ],
  "started_at": "2026-10-29T13:26:00.922203Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "2cca2162-3055-4005-a2ef-5b45cec05c36",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672686478",
    "at": "2026-10-29T13:26:00.924250846Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "2cca2162-3055-4005-a2ef-5b45cec05c36",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16819",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "2cca2162-3055-4005-a2ef-5b45cec05c36"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "2cca2162-3055-4005-a2ef-5b45cec05c36",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=dca0c510-0c8e-4766-af25-74d7da94cb8d` → **200**

```json
{
  "calls": [
    {
      "id": "2cca2162-3055-4005-a2ef-5b45cec05c36",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [
        "dca0c510-0c8e-4766-af25-74d7da94cb8d"
      ],
      "started_at": "2026-10-29T13:26:00.922203Z",
      "answered_at": "2026-10-29T13:26:01.398089Z",
      "ended_at": "2026-10-29T13:26:01.417684Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=dca0c510-0c8e-4766-af25-74d7da94cb8d` → **200**

```json
{
  "calls": [
    {
      "id": "2cca2162-3055-4005-a2ef-5b45cec05c36",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "order_ids": [
        "dca0c510-0c8e-4766-af25-74d7da94cb8d"
      ],
      "started_at": "2026-10-29T13:26:00.922203Z",
      "answered_at": "2026-10-29T13:26:01.398089Z",
      "ended_at": "2026-10-29T13:26:01.417684Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T13:26:03.231194Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/dca0c510-0c8e-4766-af25-74d7da94cb8d` → **200**

```json
{
  "id": "dca0c510-0c8e-4766-af25-74d7da94cb8d",
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
  "created_at": "2026-10-29T13:26:00.694051Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672686478"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dca0c510-0c8e-4766-af25-74d7da94cb8d/cancel` → **200**

```json
{
  "command_id": "32589b42-c007-4382-a5a8-27c46a529df2",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dca0c510-0c8e-4766-af25-74d7da94cb8d",
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
  "created_at": "2026-10-29T13:26:00.694051Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672686478"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин"
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
  "command_id": "96cebf2d-e946-4282-bed1-8ff02c2c1c41",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T13:26:04.279395Z",
  "extension": "101"
}
```

Done: outgoing call 2cca2162-3055-4005-a2ef-5b45cec05c36 from order dca0c510-0c8e-4766-af25-74d7da94cb8d, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636112226",
  "device_ref": "sandbox-15254"
}
```

```json
{
  "challenge_id": "e290b504-5972-454d-9903-54872feac544",
  "expires_at": "2026-10-29T13:31:04.483515058Z",
  "resend_available_at": "2026-10-29T13:26:05.483515058Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636112226` → **200**

```json
{
  "phone": "+380636112226",
  "audience": "CLIENT",
  "code": "495184",
  "sent_at": "2026-10-29T13:26:04.485408558Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e290b504-5972-454d-9903-54872feac544",
  "code": "495184",
  "device_ref": "sandbox-15254"
}
```

```json
{
  "session_id": "69eac61d-0235-4f0d-859d-f1d977a0f3b6",
  "subject": {
    "type": "CLIENT",
    "id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmU0ZTQ1Ny1kZGQ2LTQ3M2QtOGI3NC1lMGM3ZmRjYmNkMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjY0LCJpYXQiOjE3OTMyODAzNjQsImp0aSI6ImRlZTU4NjcxLTVhODItNDFhYS04NTljLTI1Nzg5YWQ5MzBmOSIsInNpZCI6IjY5ZWFjNjFkLTAyMzUtNGYwZC04NTlkLWYxZDk3N2EwZjNiNiJ9.Lk7QHf32jH4B1FaiiH9o8-_MzCU_3RerkWmElngC-Vc",
  "access_expires_at": "2026-10-29T13:41:04.705650845Z",
  "refresh_token": "ePyKuVdryXzNZO_qtA2eoy_jlSuwwoeWlP1W2Dkzp8U",
  "refresh_expires_at": "2026-11-28T13:26:04.705217261Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e",
  "session_id": "69eac61d-0235-4f0d-859d-f1d977a0f3b6",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636112226",
  "device_ref": "sandbox-23799"
}
```

```json
{
  "challenge_id": "eb0cd4cb-c3b4-4edb-9cfb-9f0ee7a32df9",
  "expires_at": "2026-10-29T13:31:07.095134868Z",
  "resend_available_at": "2026-10-29T13:26:08.095134868Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636112226` → **200**

```json
{
  "phone": "+380636112226",
  "audience": "CLIENT",
  "code": "293619",
  "sent_at": "2026-10-29T13:26:07.096962339Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb0cd4cb-c3b4-4edb-9cfb-9f0ee7a32df9",
  "code": "293619",
  "device_ref": "sandbox-23799"
}
```

```json
{
  "session_id": "cb75a8be-064e-4271-8c39-f931236995b3",
  "subject": {
    "type": "CLIENT",
    "id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmU0ZTQ1Ny1kZGQ2LTQ3M2QtOGI3NC1lMGM3ZmRjYmNkMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjY3LCJpYXQiOjE3OTMyODAzNjcsImp0aSI6IjA2OWM2ODBmLTA5ZDItNGE1Yi1hM2MyLWJhN2M2YzBiZDY0OSIsInNpZCI6ImNiNzVhOGJlLTA2NGUtNDI3MS04YzM5LWY5MzEyMzY5OTViMyJ9.dyyhKxRSw5naUMW8LltmsWFPbbFHafp8GnsUjZkZqwo",
  "access_expires_at": "2026-10-29T13:41:07.308758079Z",
  "refresh_token": "yyXvSs2DWi-R6hT41sVXHu9CbbVjDo5CbzVo8HQq4uk",
  "refresh_expires_at": "2026-11-28T13:26:07.308387139Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "97ad394b-d923-4ce6-8f39-5c83f54ed5f4",
  "expires_at": "2026-10-29T13:31:09.509604465Z",
  "resend_available_at": "2026-10-29T13:26:10.509604465Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636112226` → **200**

```json
{
  "phone": "+380636112226",
  "audience": "CLIENT",
  "code": "020497",
  "sent_at": "2026-10-29T13:26:09.511210451Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380635073158"
}
```

```json
{
  "challenge_id": "277c7f3e-8c6d-4cee-8f7c-c61f7784c6c0",
  "expires_at": "2026-10-29T13:31:09.717575315Z",
  "resend_available_at": "2026-10-29T13:26:10.717575315Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635073158` → **200**

```json
{
  "phone": "+380635073158",
  "audience": "CLIENT",
  "code": "412860",
  "sent_at": "2026-10-29T13:26:09.71914796Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "374ca6bc-494e-4635-89be-a089c9dc0494",
  "current_challenge_id": "97ad394b-d923-4ce6-8f39-5c83f54ed5f4",
  "current_code": "000000",
  "new_challenge_id": "277c7f3e-8c6d-4cee-8f7c-c61f7784c6c0",
  "new_code": "412860"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "9652b116-c8e2-42dd-8680-035f56266fcb"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "05a4088a-4afa-4a93-8130-da063ab5edb1",
  "current_challenge_id": "97ad394b-d923-4ce6-8f39-5c83f54ed5f4",
  "current_code": "020497",
  "new_challenge_id": "277c7f3e-8c6d-4cee-8f7c-c61f7784c6c0",
  "new_code": "412860"
}
```

```json
{
  "subject_id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e",
  "phone": "+380635073158",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e",
  "session_id": "69eac61d-0235-4f0d-859d-f1d977a0f3b6",
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
  "correlation_id": "2b07cc14-5b7a-4986-8aa4-6c56f8ab2fad"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635073158",
  "device_ref": "sandbox-13806"
}
```

```json
{
  "challenge_id": "7105bec8-77d8-42dc-972f-9a9905a58bb7",
  "expires_at": "2026-10-29T13:31:12.70273539Z",
  "resend_available_at": "2026-10-29T13:26:13.70273539Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635073158` → **200**

```json
{
  "phone": "+380635073158",
  "audience": "CLIENT",
  "code": "281609",
  "sent_at": "2026-10-29T13:26:12.705094013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7105bec8-77d8-42dc-972f-9a9905a58bb7",
  "code": "281609",
  "device_ref": "sandbox-13806"
}
```

```json
{
  "session_id": "ecc84f40-1725-4236-9caa-63b68fe2d2be",
  "subject": {
    "type": "CLIENT",
    "id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmU0ZTQ1Ny1kZGQ2LTQ3M2QtOGI3NC1lMGM3ZmRjYmNkMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjcyLCJpYXQiOjE3OTMyODAzNzIsImp0aSI6IjE1NGMyOTNkLTQ1YzYtNGNkZS1hM2QwLTg0MDdmMWQ5OWE1NSIsInNpZCI6ImVjYzg0ZjQwLTE3MjUtNDIzNi05Y2FhLTYzYjY4ZmUyZDJiZSJ9.e_UD64qrBCys0XvOS3jbgCj2Bl6DAMOqAYpAriDxH60",
  "access_expires_at": "2026-10-29T13:41:12.914797672Z",
  "refresh_token": "Xkf6xIJmOf9y4sqnxcmh-IfCwjeP7WJqjUmObZ9gJX4",
  "refresh_expires_at": "2026-11-28T13:26:12.914449736Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e",
  "session_id": "ecc84f40-1725-4236-9caa-63b68fe2d2be",
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
  "session_id": "0054f1c6-3d4d-4331-beb7-359c41881438",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyNzMsImlhdCI6MTc5MzI4MDM3MywianRpIjoiMjYzYmFhZjgtNDQ2MS00ZjYwLWIwMjYtZGNiMDE2YTRjMGI2Iiwic2lkIjoiMDA1NGYxYzYtM2Q0ZC00MzMxLWJlYjctMzU5YzQxODgxNDM4In0.Wjk-gDFDSxg7az7Tmx3b-GjXeIS13UnbLBsotivF_Oc",
  "access_expires_at": "2026-10-29T13:41:13.49002927Z",
  "refresh_token": "bqQf8QFqLu-xhoWjmmg0HxA4nikOH2PZCjKvThEqAIU",
  "refresh_expires_at": "2026-10-30T01:26:13.489696137Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e` → **200**

```json
{
  "client": {
    "id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e",
    "phone": "+380635073158",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T13:26:04.703702Z",
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

`POST /api/admin/v1/clients/06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e/phone/new-code` → **201**

```json
{
  "phone": "+380634509494"
}
```

```json
{
  "challenge_id": "5d3df7d4-1772-44c6-b28d-be2252e87179",
  "expires_at": "2026-10-29T13:31:13.887576135Z",
  "resend_available_at": "2026-10-29T13:26:14.887576135Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634509494` → **200**

```json
{
  "phone": "+380634509494",
  "audience": "CLIENT",
  "code": "633943",
  "sent_at": "2026-10-29T13:26:13.8889571Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e/phone` → **422**

```json
{
  "command_id": "29431b9a-0c0b-4598-bbe5-11fd781818b9",
  "expected_version": 3,
  "new_challenge_id": "5d3df7d4-1772-44c6-b28d-be2252e87179",
  "new_code": "633944",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "b196ea5e-64ac-4f49-a2f0-7a4ff2fb20bc"
}
```

`POST /api/admin/v1/clients/06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e/phone` → **400**

```json
{
  "command_id": "9f5c6b83-7320-4b64-8882-1c1cf05eb2ef",
  "expected_version": 3,
  "new_challenge_id": "5d3df7d4-1772-44c6-b28d-be2252e87179",
  "new_code": "633943",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9000a857-70b0-45c0-ab90-a8132ed6644b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e/phone` → **200**

```json
{
  "command_id": "8005f664-9a03-4bb9-b8f0-4ac9d1d0872f",
  "expected_version": 3,
  "new_challenge_id": "5d3df7d4-1772-44c6-b28d-be2252e87179",
  "new_code": "633943",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e",
  "phone": "+380634509494",
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
  "correlation_id": "76719a57-df4f-46db-8e6c-a688f14874c7"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380634509494",
  "device_ref": "sandbox-16845"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "9cb622fc-05e3-46a2-b1bb-eaa9530eff50",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634509494",
  "device_ref": "sandbox-16845"
}
```

```json
{
  "challenge_id": "bc79c998-5811-40f7-8033-b15eefcae76c",
  "expires_at": "2026-10-29T13:31:16.073746331Z",
  "resend_available_at": "2026-10-29T13:26:17.073746331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634509494` → **200**

```json
{
  "phone": "+380634509494",
  "audience": "CLIENT",
  "code": "621663",
  "sent_at": "2026-10-29T13:26:16.075597637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc79c998-5811-40f7-8033-b15eefcae76c",
  "code": "621663",
  "device_ref": "sandbox-16845"
}
```

```json
{
  "session_id": "b99513d7-4a53-49ef-ab42-86f45ee86fb7",
  "subject": {
    "type": "CLIENT",
    "id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmU0ZTQ1Ny1kZGQ2LTQ3M2QtOGI3NC1lMGM3ZmRjYmNkMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjc2LCJpYXQiOjE3OTMyODAzNzYsImp0aSI6ImY5NDFhMmFkLTE3NjEtNDlmNC1iOThjLTUyZGViMjdhMmIwYSIsInNpZCI6ImI5OTUxM2Q3LTRhNTMtNDllZi1hYjQyLTg2ZjQ1ZWU4NmZiNyJ9.frRZVcTysDYh0sq7V6IbDeZA2ypa6aNoTka74GW88pk",
  "access_expires_at": "2026-10-29T13:41:16.282381397Z",
  "refresh_token": "tYm7zbUMtgbSlmqzvHfcKR0klkbWG5TXvKalee5S62Q",
  "refresh_expires_at": "2026-11-28T13:26:16.282054383Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06e4e457-ddd6-473d-8b74-e0c7fdcbcd1e",
  "session_id": "b99513d7-4a53-49ef-ab42-86f45ee86fb7",
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
  "phone": "+380634467662",
  "device_ref": "sandbox-12231"
}
```

```json
{
  "challenge_id": "409d7023-07dd-41f9-9e7e-a45a63933214",
  "expires_at": "2026-10-29T13:31:16.660501864Z",
  "resend_available_at": "2026-10-29T13:26:17.660501864Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634467662` → **200**

```json
{
  "phone": "+380634467662",
  "audience": "CLIENT",
  "code": "171108",
  "sent_at": "2026-10-29T13:26:16.662455023Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "409d7023-07dd-41f9-9e7e-a45a63933214",
  "code": "171108",
  "device_ref": "sandbox-12231"
}
```

```json
{
  "session_id": "a6a0ed30-a249-4d58-b96a-4e0515acc256",
  "subject": {
    "type": "CLIENT",
    "id": "c58ef164-5476-41ca-840a-162c275909b1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNThlZjE2NC01NDc2LTQxY2EtODQwYS0xNjJjMjc1OTA5YjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjc2LCJpYXQiOjE3OTMyODAzNzYsImp0aSI6ImU1ZTI0ODgzLTMzYWEtNGNkNy04MDNhLTY5M2I0YjU5ZDhhYiIsInNpZCI6ImE2YTBlZDMwLWEyNDktNGQ1OC1iOTZhLTRlMDUxNWFjYzI1NiJ9.I_JEe6ItP_wQDPsFsKjMm6SmYl7oMGytIid1a1K5zvE",
  "access_expires_at": "2026-10-29T13:41:16.868364453Z",
  "refresh_token": "uWXrVpsKe6EOOoEmp9B7lbd5zmb-dIkHrXkmmi9BS5U",
  "refresh_expires_at": "2026-11-28T13:26:16.868027935Z",
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
  "session_id": "c072948e-3d77-446f-bf84-123c201c3cc7",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyNzcsImlhdCI6MTc5MzI4MDM3NywianRpIjoiY2MyMWVhOTEtOTc5NS00NGRkLTgyZWUtMjcyYzU0NTJjY2U5Iiwic2lkIjoiYzA3Mjk0OGUtM2Q3Ny00NDZmLWJmODQtMTIzYzIwMWMzY2M3In0.phIFe0cJ-uxo6NeyNQIq-HYYixMhDJlZBKan34-R4cI",
  "access_expires_at": "2026-10-29T13:41:17.660239321Z",
  "refresh_token": "5Mz1o2t-gHfVSu6d3N-YessaxNPRtpMjvhejDJRVsQs",
  "refresh_expires_at": "2026-10-30T01:26:17.659899988Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634467662` → **200**

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
  "correlation_id": "1e2b8b0a-7650-4c89-b593-7e11a316987b"
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
  "session_id": "bb48cfbf-4afb-438a-a636-6b8ec1d98d89",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyNzgsImlhdCI6MTc5MzI4MDM3OCwianRpIjoiNjY3ZTg1NWYtZjUxYy00Y2U3LThkZmItZDE3MTBhZWEwODc5Iiwic2lkIjoiYmI0OGNmYmYtNGFmYi00MzhhLWE2MzYtNmI4ZWMxZDk4ZDg5In0.dyEd0AgRJire_WxYPxYlxeXUmgd__sscqQhevEVBr_Y",
  "access_expires_at": "2026-10-29T13:41:18.454627074Z",
  "refresh_token": "RabYHWP9RLrL7A3FWMxMyqaNIGBhDsRyryBE_1tn13s",
  "refresh_expires_at": "2026-10-30T01:26:18.454223696Z",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T13:23:16.603145Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "4bb72db7-e803-4aef-bdfa-d5e405a7b79c",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T13:26:18.870252879Z"
}
```

## The rider books the airport for 2026-10-29T16:26:18Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600935443",
  "device_ref": "sandbox-5791"
}
```

```json
{
  "challenge_id": "c658e0f7-18c1-4d6f-bebe-60e173fdd97d",
  "expires_at": "2026-10-29T13:31:19.079287797Z",
  "resend_available_at": "2026-10-29T13:26:20.079287797Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600935443` → **200**

```json
{
  "phone": "+48600935443",
  "audience": "CLIENT",
  "code": "656770",
  "sent_at": "2026-10-29T13:26:19.081182669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c658e0f7-18c1-4d6f-bebe-60e173fdd97d",
  "code": "656770",
  "device_ref": "sandbox-5791"
}
```

```json
{
  "session_id": "3b22f0e6-19f3-4fc2-afde-2b4293c2c4be",
  "subject": {
    "type": "CLIENT",
    "id": "a177603c-040d-4d8f-8f09-2a5f818f440c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTc3NjAzYy0wNDBkLTRkOGYtOGYwOS0yYTVmODE4ZjQ0MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjc5LCJpYXQiOjE3OTMyODAzNzksImp0aSI6ImE5NDRjNDIwLWUzZGEtNDJiMS1iNDliLTJmMjg3ZDkwYzY5YiIsInNpZCI6IjNiMjJmMGU2LTE5ZjMtNGZjMi1hZmRlLTJiNDI5M2MyYzRiZSJ9.iLtnq7MzjFYBXRqWVWJ40ZXZpWaNeG066FS4vxavlFg",
  "access_expires_at": "2026-10-29T13:41:19.299172784Z",
  "refresh_token": "8D5n31HDTj-Za1m27eebZKutZnNEvuPqHhvpebpyPU8",
  "refresh_expires_at": "2026-11-28T13:26:19.298700181Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6ede06f6-7f7b-4fc8-851c-3255fd6f8ef8",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T16:26:18Z"
}
```

```json
{
  "id": "45110a24-450b-490a-9721-cc38230ab13c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:31:19.503209Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T16:26:18Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a33fe4e6-4842-4738-8529-216ffd83f0f7",
  "quote_id": "45110a24-450b-490a-9721-cc38230ab13c",
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
  "pickup_at": "2026-10-29T16:26:18Z"
}
```

```json
{
  "id": "c083cdec-2b80-46b3-8845-b3f25143ed05",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a177603c-040d-4d8f-8f09-2a5f818f440c",
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
  "created_at": "2026-10-29T13:26:19.710078Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T16:26:18Z",
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
  "device_ref": "sandbox-2960"
}
```

```json
{
  "challenge_id": "bf85d230-bedf-4e4d-8e3f-970e69b3b5d9",
  "expires_at": "2026-10-29T13:31:19.906968268Z",
  "resend_available_at": "2026-10-29T13:26:20.906968268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "119484",
  "sent_at": "2026-10-29T13:26:19.909142551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf85d230-bedf-4e4d-8e3f-970e69b3b5d9",
  "code": "119484",
  "device_ref": "sandbox-2960"
}
```

```json
{
  "session_id": "2ed70dd1-076a-4b88-a3b7-3892c552efe3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTI4MCwiaWF0IjoxNzkzMjgwMzgwLCJqdGkiOiIzZGUyNjNhMi1jY2NmLTQ2ZTctODU3Zi04MTc0NDZiMDI5MjIiLCJzaWQiOiIyZWQ3MGRkMS0wNzZhLTRiODgtYTNiNy0zODkyYzU1MmVmZTMifQ.RoXfbHW7kBAaXb6uSCGzSUJlB30ExbJEE97ZD9GE768",
  "access_expires_at": "2026-10-29T13:41:20.122188879Z",
  "refresh_token": "5y8gmPdRj5NljTnyd9gtyJMNh0aKWpgy3NaT6ZdstBc",
  "refresh_expires_at": "2026-11-28T13:26:20.121798789Z",
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
  "command_id": "e5bc4f90-3026-455f-84f9-383dd85b2115",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:20Z",
    "sequence": 1793280380524
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2eaabbf5-9d13-43c9-9138-e7692dba0d00",
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
  "last_heartbeat_at": "2026-10-29T13:26:20.539785Z",
  "last_location_at": "2026-10-29T13:26:20.539785Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "c083cdec-2b80-46b3-8845-b3f25143ed05",
      "short_number": 24,
      "pickup_at": "2026-10-29T16:26:18Z",
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

`POST /api/driver/v1/preorders/c083cdec-2b80-46b3-8845-b3f25143ed05/reserve` → **200**

```json
{
  "command_id": "d8876a00-3235-40a5-9639-24cabfd13fa7"
}
```

```json
{
  "id": "46b053cc-0ed1-46a9-8214-3c9d2867f66a",
  "state": "RESERVED",
  "order": {
    "order_id": "c083cdec-2b80-46b3-8845-b3f25143ed05",
    "short_number": 24,
    "pickup_at": "2026-10-29T16:26:18Z",
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
  "reserved_at": "2026-10-29T13:26:20.937926Z",
  "confirm_from": "2026-10-29T15:56:18Z",
  "confirm_until": "2026-10-29T16:06:18Z",
  "drop_until": "2026-10-29T15:26:18Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "46b053cc-0ed1-46a9-8214-3c9d2867f66a",
      "state": "RESERVED",
      "order": {
        "order_id": "c083cdec-2b80-46b3-8845-b3f25143ed05",
        "short_number": 24,
        "pickup_at": "2026-10-29T16:26:18Z",
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
      "reserved_at": "2026-10-29T13:26:20.937926Z",
      "confirm_from": "2026-10-29T15:56:18Z",
      "confirm_until": "2026-10-29T16:06:18Z",
      "drop_until": "2026-10-29T15:26:18Z"
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
      "id": "46b053cc-0ed1-46a9-8214-3c9d2867f66a",
      "state": "RESERVED",
      "order": {
        "order_id": "c083cdec-2b80-46b3-8845-b3f25143ed05",
        "short_number": 24,
        "pickup_at": "2026-10-29T16:26:18Z",
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
      "reserved_at": "2026-10-29T13:26:20.937926Z",
      "confirm_from": "2026-10-29T15:56:18Z",
      "confirm_until": "2026-10-29T16:06:18Z",
      "drop_until": "2026-10-29T15:26:18Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/46b053cc-0ed1-46a9-8214-3c9d2867f66a/confirm` → **409**

```json
{
  "command_id": "dca931ac-ecf5-4b37-97fe-177155903b61"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/46b053cc-0ed1-46a9-8214-3c9d2867f66a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6b669b17-9e6b-4a87-8c99-c310adb27dab"
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
  "session_id": "fb102ddf-629b-4779-88c2-da95996e8097",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyODEsImlhdCI6MTc5MzI4MDM4MSwianRpIjoiZGE2YmQwOTQtMGI2Yi00NDc2LWE0NTktNzBmNGZlNTE1NzE0Iiwic2lkIjoiZmIxMDJkZGYtNjI5Yi00Nzc5LTg4YzItZGE5NTk5NmU4MDk3In0.usSsu_1HtnaiS5pOq53wZJy1NDVUEEWNQWmB94uRFg8",
  "access_expires_at": "2026-10-29T13:41:21.92918622Z",
  "refresh_token": "l8Rq26d1KHoYqAhs1VSa-KvTaheBE-yA7JOaNLvkgvQ",
  "refresh_expires_at": "2026-10-30T01:26:21.928762319Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c083cdec-2b80-46b3-8845-b3f25143ed05` → **200**

```json
{
  "id": "c083cdec-2b80-46b3-8845-b3f25143ed05",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "a177603c-040d-4d8f-8f09-2a5f818f440c",
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
  "created_at": "2026-10-29T13:26:19.710078Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T16:26:18Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "46b053cc-0ed1-46a9-8214-3c9d2867f66a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T13:26:20.937926Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/c083cdec-2b80-46b3-8845-b3f25143ed05/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T13:26:19.710899Z",
      "actor": {
        "type": "CLIENT",
        "id": "a177603c-040d-4d8f-8f09-2a5f818f440c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "c083cdec-2b80-46b3-8845-b3f25143ed05",
        "preorder": true,
        "quote_id": "45110a24-450b-490a-9721-cc38230ab13c",
        "pickup_at": "2026-10-29T16:26:18Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "e910718c-f2f2-4400-b9f0-2ededbd37ba3"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T13:26:20.938904Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c083cdec-2b80-46b3-8845-b3f25143ed05",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "46b053cc-0ed1-46a9-8214-3c9d2867f66a"
      },
      "correlation_id": "3721169b-b082-4ec3-8c98-c791e3358b1d"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order c083cdec-2b80-46b3-8845-b3f25143ed05, reservation 46b053cc-0ed1-46a9-8214-3c9d2867f66a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18397"
}
```

```json
{
  "challenge_id": "5008261e-fdea-48e6-b145-f13d7e9d8641",
  "expires_at": "2026-10-29T13:31:22.533104426Z",
  "resend_available_at": "2026-10-29T13:26:23.533104426Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "750047",
  "sent_at": "2026-10-29T13:26:22.534924655Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5008261e-fdea-48e6-b145-f13d7e9d8641",
  "code": "750047",
  "device_ref": "sandbox-18397"
}
```

```json
{
  "session_id": "bb907065-e551-44ac-ab02-6b7990458021",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTI4MiwiaWF0IjoxNzkzMjgwMzgyLCJqdGkiOiI5NjVmNTA0Zi1lZmNjLTQxNWQtYWY2ZS03MWZjNjg2NDRkOTciLCJzaWQiOiJiYjkwNzA2NS1lNTUxLTQ0YWMtYWIwMi02Yjc5OTA0NTgwMjEifQ.T5bCkKJcu4tbN5pqhLQcwS-2xDetsTU55NWlRL0Vej4",
  "access_expires_at": "2026-10-29T13:41:22.745397275Z",
  "refresh_token": "u1EDkyn6oSCKDjQOSxHpd-H2ag2W4FM95VrH9nv-DHw",
  "refresh_expires_at": "2026-11-28T13:26:22.745032444Z",
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
  "command_id": "9b8fa4cb-656b-479d-8325-85f6a66aa563",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:23Z",
    "sequence": 1793280383127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5abd8f-565d-4864-a065-c0eb1b0c5cbb",
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
  "last_heartbeat_at": "2026-10-29T13:26:23.14404Z",
  "last_location_at": "2026-10-29T13:26:23.14404Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679897517",
  "device_ref": "sandbox-3411"
}
```

```json
{
  "challenge_id": "9091c1c7-528a-45c7-aa4b-fed0fb9b1186",
  "expires_at": "2026-10-29T13:31:23.333263923Z",
  "resend_available_at": "2026-10-29T13:26:24.333263923Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679897517` → **200**

```json
{
  "phone": "+380679897517",
  "audience": "CLIENT",
  "code": "871534",
  "sent_at": "2026-10-29T13:26:23.335264624Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9091c1c7-528a-45c7-aa4b-fed0fb9b1186",
  "code": "871534",
  "device_ref": "sandbox-3411"
}
```

```json
{
  "session_id": "f5605b7c-464f-4aa3-b6c5-10180519e0c6",
  "subject": {
    "type": "CLIENT",
    "id": "7d7baac1-a5b5-49b4-829a-bae54c902a6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDdiYWFjMS1hNWI1LTQ5YjQtODI5YS1iYWU1NGM5MDJhNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMjgzLCJpYXQiOjE3OTMyODAzODMsImp0aSI6IjE0ZGJhNWQzLTIwYjQtNDIwOC04ODQ3LTkwMGUzYWMyMDFmNCIsInNpZCI6ImY1NjA1YjdjLTQ2NGYtNGFhMy1iNmM1LTEwMTgwNTE5ZTBjNiJ9.OP5vxXDKg8JiV4jIxjJsWhnYim8A5CKSluY5NiuA9pA",
  "access_expires_at": "2026-10-29T13:41:23.550405987Z",
  "refresh_token": "Z2ct0JlvFR54dvX1v6SXhz_A1p4vOwdn2ijDZDhe-s8",
  "refresh_expires_at": "2026-11-28T13:26:23.549917659Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7713a0ad-1c07-4f64-92fb-50ffeb6592b9",
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
  "id": "889991cd-3700-4588-97a6-8e07d1eaf26d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:31:23.744831Z",
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
  "command_id": "458bd7df-e7bc-4a92-8f7f-282fb4f07687",
  "quote_id": "889991cd-3700-4588-97a6-8e07d1eaf26d",
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
  "id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7d7baac1-a5b5-49b4-829a-bae54c902a6d",
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
  "created_at": "2026-10-29T13:26:23.946257Z",
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
    "id": "96363c78-99ee-40b3-be91-dc5a081409df",
    "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
    "expires_at": "2026-10-29T13:26:38.948381Z",
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

`POST /api/driver/v1/offers/96363c78-99ee-40b3-be91-dc5a081409df/accept` → **200**

```json
{
  "command_id": "74daf131-bb0f-4a77-b51e-292c7bee1554"
}
```

```json
{
  "id": "198cd93a-a5e7-4a38-9d06-c66f02bfdf4f",
  "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa621698-9306-4a39-9832-7e9fc21fb4e0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa621698-9306-4a39-9832-7e9fc21fb4e0",
  "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "assignment_id": "198cd93a-a5e7-4a38-9d06-c66f02bfdf4f",
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

`POST /api/driver/v1/work-sessions/8f5abd8f-565d-4864-a065-c0eb1b0c5cbb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:24Z",
    "sequence": 1793280384730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5abd8f-565d-4864-a065-c0eb1b0c5cbb",
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
  "last_heartbeat_at": "2026-10-29T13:26:24.74641Z",
  "last_location_at": "2026-10-29T13:26:24.74641Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa621698-9306-4a39-9832-7e9fc21fb4e0",
  "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "assignment_id": "198cd93a-a5e7-4a38-9d06-c66f02bfdf4f",
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

`POST /api/driver/v1/trips/aa621698-9306-4a39-9832-7e9fc21fb4e0/arrive` → **200**

```json
{
  "command_id": "25b07509-7dcc-4aa1-a9d4-acc26ea97abd",
  "expected_version": 0
}
```

```json
{
  "id": "aa621698-9306-4a39-9832-7e9fc21fb4e0",
  "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "assignment_id": "198cd93a-a5e7-4a38-9d06-c66f02bfdf4f",
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
  "arrived_at": "2026-10-29T13:26:25.113621Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa621698-9306-4a39-9832-7e9fc21fb4e0/start` → **200**

```json
{
  "command_id": "bdab121b-ab2d-4252-961d-1d70ae9fd08c",
  "expected_version": 1
}
```

```json
{
  "id": "aa621698-9306-4a39-9832-7e9fc21fb4e0",
  "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "assignment_id": "198cd93a-a5e7-4a38-9d06-c66f02bfdf4f",
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
  "arrived_at": "2026-10-29T13:26:25.113621Z",
  "started_at": "2026-10-29T13:26:25.311987Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8f5abd8f-565d-4864-a065-c0eb1b0c5cbb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:25Z",
    "sequence": 1793280385502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5abd8f-565d-4864-a065-c0eb1b0c5cbb",
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
  "last_heartbeat_at": "2026-10-29T13:26:25.517854Z",
  "last_location_at": "2026-10-29T13:26:25.517854Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/aa621698-9306-4a39-9832-7e9fc21fb4e0/complete` → **200**

```json
{
  "command_id": "c4e7d510-3512-458f-8b96-fd0d46f98a24",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:26:25Z",
  "cash_received": true
}
```

```json
{
  "id": "aa621698-9306-4a39-9832-7e9fc21fb4e0",
  "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "assignment_id": "198cd93a-a5e7-4a38-9d06-c66f02bfdf4f",
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
  "arrived_at": "2026-10-29T13:26:25.113621Z",
  "started_at": "2026-10-29T13:26:25.311987Z",
  "completed_at": "2026-10-29T13:26:25.713802Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16/rating` → **200**

```json
{
  "command_id": "6b128fb0-4103-4b27-a338-4a2d5a818a15",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "score": 5,
  "created_at": "2026-10-29T13:26:25.916917423Z"
}
```

`POST /api/driver/v1/orders/aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16/rating` → **200**

```json
{
  "command_id": "44ca8cce-8332-47bf-8bef-3c6baf76cb7a",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
  "score": 4,
  "created_at": "2026-10-29T13:26:26.108553218Z"
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
  "session_id": "f9b1248b-2dc3-4b50-9c24-df0faf7f0922",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyODYsImlhdCI6MTc5MzI4MDM4NiwianRpIjoiNjc3ZWU3YjYtNjdiYS00ZmMwLTgwNzItZWE5ZmU0NTQ2NTA5Iiwic2lkIjoiZjliMTI0OGItMmRjMy00YjUwLTljMjQtZGYwZmFmN2YwOTIyIn0.HbMulG30os7p-eIq6E8WOR0Dk7cQkbpsSX-lNh5mkVI",
  "access_expires_at": "2026-10-29T13:41:26.699310451Z",
  "refresh_token": "Fk2yJ0L-4Q6rux4msU1K6-entQ6AxsqgNdEjm8WG_dQ",
  "refresh_expires_at": "2026-10-30T01:26:26.698950347Z",
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
  "session_id": "b977376b-d8c3-4610-8213-d4e379a932ed",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyODcsImlhdCI6MTc5MzI4MDM4NywianRpIjoiYzJiYzdiMjUtMzVmMS00NzU3LThiNjUtYTNkZWI3Y2M4ZTBiIiwic2lkIjoiYjk3NzM3NmItZDhjMy00NjEwLTgyMTMtZDRlMzc5YTkzMmVkIn0.Ood7ekfj4dS07tCGVrzZ9Vu1TgG4GcEXI7xD7SVNkhU",
  "access_expires_at": "2026-10-29T13:41:27.097905096Z",
  "refresh_token": "0LVAhHLzT7Kf2vH1BAB1teWJRUFfqmE_Od8rTGmt6cA",
  "refresh_expires_at": "2026-10-30T01:26:27.097421866Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
      "author_type": "RIDER",
      "author_id": "7d7baac1-a5b5-49b4-829a-bae54c902a6d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T13:26:25.916917Z"
    },
    {
      "order_id": "aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "7d7baac1-a5b5-49b4-829a-bae54c902a6d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T13:26:26.108553Z"
    }
  ]
}
```

Done: ratings for order aecf3862-a66c-4d80-bb8a-e6b9e6eb4f16.

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
  "session_id": "faeb5848-56fa-4286-92a7-6841ae39edb3",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyODcsImlhdCI6MTc5MzI4MDM4NywianRpIjoiY2JjYWRiMWItODQ5Ni00MjY3LWE3YTAtMjI0MWE3ZGFkNTU2Iiwic2lkIjoiZmFlYjU4NDgtNTZmYS00Mjg2LTkyYTctNjg0MWFlMzllZGIzIn0.GUgEcA5UfgwOilHGAcW_0lYTtWNdu4a1KKv0WunDwus",
  "access_expires_at": "2026-10-29T13:41:27.697754325Z",
  "refresh_token": "hLR0KqK3d3Z28OpkBPafJIJdwhcbGW5nfbXqt4smSIk",
  "refresh_expires_at": "2026-10-30T01:26:27.697371777Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "63fb1327-8876-43fc-83ae-95f94b489ece",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "f221b89f-5a25-4707-b23e-5bda27983798",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T13:26:27.89518Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f221b89f-5a25-4707-b23e-5bda27983798` → **200**

```json
{
  "id": "f221b89f-5a25-4707-b23e-5bda27983798",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T13:26:27.89518Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f221b89f-5a25-4707-b23e-5bda27983798` → **200**

```json
{
  "id": "f221b89f-5a25-4707-b23e-5bda27983798",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T13:26:27.89518Z",
  "ready_at": "2026-10-29T13:26:28.244166Z",
  "expires_at": "2026-10-30T13:26:28.244166Z"
}
```

`GET /api/admin/v1/reports/exports/f221b89f-5a25-4707-b23e-5bda27983798/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ce356710-c475-4ff7-980e-243fc55c9bbe",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "a43f47bf-1691-43cd-801e-420c1a3f5bf4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T13:26:29.507816Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a43f47bf-1691-43cd-801e-420c1a3f5bf4` → **200**

```json
{
  "id": "a43f47bf-1691-43cd-801e-420c1a3f5bf4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T13:26:29.507816Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a43f47bf-1691-43cd-801e-420c1a3f5bf4` → **200**

```json
{
  "id": "a43f47bf-1691-43cd-801e-420c1a3f5bf4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T13:26:29.507816Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a43f47bf-1691-43cd-801e-420c1a3f5bf4` → **200**

```json
{
  "id": "a43f47bf-1691-43cd-801e-420c1a3f5bf4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T13:26:29.507816Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a43f47bf-1691-43cd-801e-420c1a3f5bf4` → **200**

```json
{
  "id": "a43f47bf-1691-43cd-801e-420c1a3f5bf4",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T13:26:29.507816Z",
  "ready_at": "2026-10-29T13:26:33.250153Z",
  "expires_at": "2026-10-30T13:26:33.250153Z"
}
```

`GET /api/admin/v1/reports/exports/a43f47bf-1691-43cd-801e-420c1a3f5bf4/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/318894ff-6d53-4d92-bee6-7b6568b269a2` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/318894ff-6d53-4d92-bee6-7b6568b269a2",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "180c710e-dc9e-463e-a0d7-a40295c7ecc6"
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
  "device_ref": "sandbox-20737"
}
```

```json
{
  "challenge_id": "8ff9f0f5-6e0d-463f-956d-2f6994569953",
  "expires_at": "2026-10-29T13:31:33.692013905Z",
  "resend_available_at": "2026-10-29T13:26:34.692013905Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "477990",
  "sent_at": "2026-10-29T13:26:33.694057553Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ff9f0f5-6e0d-463f-956d-2f6994569953",
  "code": "477990",
  "device_ref": "sandbox-20737"
}
```

```json
{
  "session_id": "fc55a569-7cb9-4e70-8b6c-c55d1567dc69",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTI5MywiaWF0IjoxNzkzMjgwMzkzLCJqdGkiOiJlMmUyMDllOC0wYTIxLTQ4MmMtYjY0MC1iODUwMmRmY2M2MDQiLCJzaWQiOiJmYzU1YTU2OS03Y2I5LTRlNzAtOGI2Yy1jNTVkMTU2N2RjNjkifQ.WiXEnWhhYttsw1jT5tFTQkU-RjaU3xn4DCoXCLVhQo4",
  "access_expires_at": "2026-10-29T13:41:33.90357485Z",
  "refresh_token": "v7LRG2mb4j_-2UI14cXpU3RZWAXJgiFefuYStSVXEVE",
  "refresh_expires_at": "2026-11-28T13:26:33.903219813Z",
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
  "command_id": "619aefb3-8d75-45fa-a435-3fbbdca17759",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:34Z",
    "sequence": 1793280394475
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "687fdf70-2c35-4ace-942e-89767b2f432c",
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
  "last_heartbeat_at": "2026-10-29T13:26:34.491126Z",
  "last_location_at": "2026-10-29T13:26:34.491126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "226d3fd4-8ad9-4a8f-aba1-379aa768ad54",
  "points": [
    {
      "sequence": 1793280396687,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T13:25:36Z"
    },
    {
      "sequence": 1793280396694,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T13:26:36Z"
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
  "session_id": "266f1a60-d9b7-4cb6-9e3d-e82ec11f6eb2",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEyOTcsImlhdCI6MTc5MzI4MDM5NywianRpIjoiOWQ4ZDY4YzgtNDk4Yi00MTM4LTliNGEtMzQ4YzBjYjkyMmRhIiwic2lkIjoiMjY2ZjFhNjAtZDliNy00Y2I2LTllM2QtZTgyZWMxMWY2ZWIyIn0.04z72sHasnvfNlCGnU3k_vB3GeYIDixXXnVfmiq-OqQ",
  "access_expires_at": "2026-10-29T13:41:37.126752625Z",
  "refresh_token": "_aZzfJMtBZ1hGBJka_boLf5g5gTqpovcS9eFAKXTvFY",
  "refresh_expires_at": "2026-10-30T01:26:37.126378801Z",
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
      "id": "ea568f5c-a999-4c3d-867e-c69702ef89d9",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T13:26:36Z",
        "track_point_id": "79a0266e-d685-4e68-abad-cb0c6ee20fd4",
        "work_session_id": "687fdf70-2c35-4ace-942e-89767b2f432c"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T13:26:36Z",
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

`POST /api/admin/v1/driver-risk-flags/ea568f5c-a999-4c3d-867e-c69702ef89d9/confirm` → **200**

```json
{
  "command_id": "d8fdc5b2-7978-4d88-88e8-7a27a6fd44b1",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "ea568f5c-a999-4c3d-867e-c69702ef89d9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T13:26:36Z",
    "track_point_id": "79a0266e-d685-4e68-abad-cb0c6ee20fd4",
    "work_session_id": "687fdf70-2c35-4ace-942e-89767b2f432c"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T13:26:36Z",
  "reason": null,
  "reviewed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reviewed_at": "2026-10-29T13:26:38.943057Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/ea568f5c-a999-4c3d-867e-c69702ef89d9/dismiss` → **409**

```json
{
  "command_id": "f0040fd0-18bb-4208-9551-c34ef34097ce",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/ea568f5c-a999-4c3d-867e-c69702ef89d9/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d286e9c8-48d1-4331-af61-a113ddd275b7"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "0ca1eee5-aba0-4414-b56a-59ced60ebe8d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "b09e4f12-5183-4625-b240-e236d18951fb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "raised_at": "2026-10-29T13:26:39.36695Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/b09e4f12-5183-4625-b240-e236d18951fb/dismiss` → **200**

```json
{
  "command_id": "a2b23aad-ede9-41f6-b682-163ee9a813ae",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "b09e4f12-5183-4625-b240-e236d18951fb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "raised_at": "2026-10-29T13:26:39.36695Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reviewed_at": "2026-10-29T13:26:39.598972Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "8129c2a8-cdf5-4f73-99e3-ec8b6700874e",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "ea568f5c-a999-4c3d-867e-c69702ef89d9"
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
      "actor_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T13:26:39.802952Z"
    }
  ]
}
```

Done: flag ea568f5c-a999-4c3d-867e-c69702ef89d9 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "03a059d3-0271-46b6-9ee1-ffc21ad1d092",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEzMDAsImlhdCI6MTc5MzI4MDQwMCwianRpIjoiNzY5OTYxMjItNGFkYS00YWI5LTkxZTgtNDliOTY3MGYxOGNjIiwic2lkIjoiMDNhMDU5ZDMtMDI3MS00NmI2LTllZTEtZmZjMjFhZDFkMDkyIn0.Uoa0263IXbs8CE4rympDI1uXxCEuR60R55EUAOrYHiY",
  "access_expires_at": "2026-10-29T13:41:40.402433041Z",
  "refresh_token": "ju0Qv3C_8dlXJHN20K8KXXyCDH36am9V8coGnpi9Ttg",
  "refresh_expires_at": "2026-10-30T01:26:40.402033909Z",
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
      "actor_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T13:26:39.802952Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "e66aac5f-6013-4047-905e-e3a3e66e8d2b",
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
  "session_id": "687fdf70-2c35-4ace-942e-89767b2f432c",
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
  "last_heartbeat_at": "2026-10-29T13:26:34.491126Z",
  "last_location_at": "2026-10-29T13:26:34.491126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/687fdf70-2c35-4ace-942e-89767b2f432c/close` → **200**

```json
{
  "command_id": "923fae5c-3a20-42d9-b824-0727e98787c4",
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
  "session_id": "dff525f3-0f42-435b-a3ed-3ace9fdfeac4",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEzMDEsImlhdCI6MTc5MzI4MDQwMSwianRpIjoiNmRmZTYxMWItMjk5YS00YjU3LTkzMjItMmQ0NzM5NjQwN2ViIiwic2lkIjoiZGZmNTI1ZjMtMGY0Mi00MzViLWEzZWQtM2FjZTlmZGZlYWM0In0.VXp22vyYtjIYFiKgGzKgtHeHxHhbjVSFSRLZ7eHlwlI",
  "access_expires_at": "2026-10-29T13:41:41.579836489Z",
  "refresh_token": "36VUIvMLe70WnFpfNub9hYZvVWnVfTtY_WmAOK-ZNhU",
  "refresh_expires_at": "2026-10-30T01:26:41.579441993Z",
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
  "command_id": "5249ecf2-5914-46b6-a22a-8e3542df58e2",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T13:26:41.964928Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "5249ecf2-5914-46b6-a22a-8e3542df58e2",
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
  "changed_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T13:26:41.964928Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48376862818",
  "device_ref": "sandbox-19218"
}
```

```json
{
  "challenge_id": "01ad8915-c69c-462b-9282-cf8ebdb1c0b4",
  "expires_at": "2026-10-29T13:31:42.347095813Z",
  "resend_available_at": "2026-10-29T13:26:43.347095813Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48376862818` → **200**

```json
{
  "phone": "+48376862818",
  "audience": "CLIENT",
  "code": "519559",
  "sent_at": "2026-10-29T13:26:42.349004186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01ad8915-c69c-462b-9282-cf8ebdb1c0b4",
  "code": "519559",
  "device_ref": "sandbox-19218"
}
```

```json
{
  "session_id": "2527efcf-204c-40e1-9f96-16d311a79b1d",
  "subject": {
    "type": "CLIENT",
    "id": "5d65fe6c-2c7f-4a5e-b5e4-2bf29750aee0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDY1ZmU2Yy0yYzdmLTRhNWUtYjVlNC0yYmYyOTc1MGFlZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMzAyLCJpYXQiOjE3OTMyODA0MDIsImp0aSI6IjgyZWY0ZDczLWNlMDAtNGZiZi1hZDA1LWQyNzM5ZmQ3ZDNiNSIsInNpZCI6IjI1MjdlZmNmLTIwNGMtNDBlMS05Zjk2LTE2ZDMxMWE3OWIxZCJ9.OCdEOVi0ygN_lkbkpyHwX4ER5yBwqaPD_9VHGSXvz3g",
  "access_expires_at": "2026-10-29T13:41:42.548543259Z",
  "refresh_token": "XxdcwnACmOpIldEl5vGQhIsPxrGsD9dSrje69JqiBv4",
  "refresh_expires_at": "2026-11-28T13:26:42.548230216Z",
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
  "correlation_id": "88106853-1b43-4f2e-bd93-0c15ef73e947"
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
  "device_ref": "sandbox-23139"
}
```

```json
{
  "challenge_id": "7bf562a5-c3a1-4162-add8-daf4525d6aba",
  "expires_at": "2026-10-29T13:31:43.097145093Z",
  "resend_available_at": "2026-10-29T13:26:44.097145093Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "280664",
  "sent_at": "2026-10-29T13:26:43.099375672Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bf562a5-c3a1-4162-add8-daf4525d6aba",
  "code": "280664",
  "device_ref": "sandbox-23139"
}
```

```json
{
  "session_id": "76322934-4fb5-4093-acdc-87f7d66732a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTMwMywiaWF0IjoxNzkzMjgwNDAzLCJqdGkiOiI0MWEyZGVjYy03YTU3LTQ4NWEtYjE3Ny05YTI0NjMwNTA2NWUiLCJzaWQiOiI3NjMyMjkzNC00ZmI1LTQwOTMtYWNkYy04N2Y3ZDY2NzMyYTEifQ.ieAaXP_n76c8nyRU7i7S_Rk8PCK2gfe3hccg2ji7tp4",
  "access_expires_at": "2026-10-29T13:41:43.32961982Z",
  "refresh_token": "2P1DNmtmKHmgfvGqEowW0eS_8_9yQzNABHEVGZnaYAc",
  "refresh_expires_at": "2026-11-28T13:26:43.329265835Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2eaabbf5-9d13-43c9-9138-e7692dba0d00",
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
  "last_heartbeat_at": "2026-10-29T13:26:20.539785Z",
  "last_location_at": "2026-10-29T13:26:20.539785Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2eaabbf5-9d13-43c9-9138-e7692dba0d00/handover` → **200**

```json
{
  "command_id": "7a075973-e049-4b25-ab87-918cb9c3e19a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2eaabbf5-9d13-43c9-9138-e7692dba0d00",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-29T13:26:20.539785Z",
  "last_location_at": "2026-10-29T13:26:20.539785Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2eaabbf5-9d13-43c9-9138-e7692dba0d00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:43Z",
    "sequence": 1793280403891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "2eaabbf5-9d13-43c9-9138-e7692dba0d00",
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
  "last_heartbeat_at": "2026-10-29T13:26:43.907179Z",
  "last_location_at": "2026-10-29T13:26:43.907179Z",
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
  "session_id": "2eaabbf5-9d13-43c9-9138-e7692dba0d00",
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
  "last_heartbeat_at": "2026-10-29T13:26:43.907179Z",
  "last_location_at": "2026-10-29T13:26:43.907179Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2eaabbf5-9d13-43c9-9138-e7692dba0d00/close` → **200**

```json
{
  "command_id": "f54177a6-1f16-49da-9a0a-c4ead368a6d4",
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
  "correlation_id": "cb5e6960-2579-4339-9400-c3ac5f2f4958"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674922029",
  "device_ref": "sandbox-23614"
}
```

```json
{
  "challenge_id": "e877fb70-895e-44f7-a26a-1a3716a2dd82",
  "expires_at": "2026-10-29T13:31:44.864264029Z",
  "resend_available_at": "2026-10-29T13:26:45.864264029Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674922029` → **200**

```json
{
  "phone": "+380674922029",
  "audience": "CLIENT",
  "code": "626248",
  "sent_at": "2026-10-29T13:26:44.866093524Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e877fb70-895e-44f7-a26a-1a3716a2dd82",
  "code": "626248",
  "device_ref": "sandbox-23614"
}
```

```json
{
  "session_id": "075843a0-8cce-4ad3-99f9-540da7f40572",
  "subject": {
    "type": "CLIENT",
    "id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjM2NjZjczOC04YzAzLTRhYmQtYTZmZS03MDQ0ZmE3ZDA5MDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMzA1LCJpYXQiOjE3OTMyODA0MDUsImp0aSI6IjY3M2UzYWM1LWY3ZDgtNDVhOC05NWI0LTE2Y2ZlMjcxZTc1MCIsInNpZCI6IjA3NTg0M2EwLThjY2UtNGFkMy05OWY5LTU0MGRhN2Y0MDU3MiJ9.NgxbANdErms-ACu6XQo5ZcTBd3hbu4uy7Mtg6pi0BUQ",
  "access_expires_at": "2026-10-29T13:41:45.070654202Z",
  "refresh_token": "yAs5HzyT5FG-cVoE3MXrxdPlJKcSp8bRLCiMRNuUSpw",
  "refresh_expires_at": "2026-11-28T13:26:45.070296913Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "4916a7b5-3692-4e59-8d03-6e9cdce57c98",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "639742ab-d69b-4182-8301-d74e6d901655",
  "upload_path": "/api/rider/v1/uploads/639742ab-d69b-4182-8301-d74e6d901655",
  "expires_at": "2026-10-29T13:41:45.266957816Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/639742ab-d69b-4182-8301-d74e6d901655` → **200**

```json
{
  "file_id": "639742ab-d69b-4182-8301-d74e6d901655",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "9d02e8c7-b4ec-48d8-9ab7-29a706f86fc2",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "639742ab-d69b-4182-8301-d74e6d901655"
  ]
}
```

```json
{
  "id": "3cb25c3d-6867-449d-aa22-051978063a6e",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T13:26:45.485094Z",
  "updated_at": "2026-10-29T13:26:45.485094Z",
  "respond_by": "2026-10-29T17:26:45.485094Z",
  "messages": [
    {
      "id": "aee3abc9-5965-4e3f-98bf-36634a8088aa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T13:26:45.485854Z",
      "attachments": [
        {
          "file_id": "639742ab-d69b-4182-8301-d74e6d901655",
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
  "session_id": "8a7966f6-282b-479b-bab2-27531d290a4a",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEzMDUsImlhdCI6MTc5MzI4MDQwNSwianRpIjoiY2YxMzA1NTctNTZhYi00YWRkLWExNGItM2VjYzkxMThkOTA4Iiwic2lkIjoiOGE3OTY2ZjYtMjgyYi00NzliLWJhYjItMjc1MzFkMjkwYTRhIn0.ysN29tOdmYI-dAaJ1wqu9PsA0SBdVg4tYX_Z0ISI4I4",
  "access_expires_at": "2026-10-29T13:41:45.901804525Z",
  "refresh_token": "MikkK7oD5bdyWR-bqFLuDfWuVNcic8jWS0jAVT1aA9Q",
  "refresh_expires_at": "2026-10-30T01:26:45.901439233Z",
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
  "session_id": "5f82bbc8-5509-4726-bf74-3c315d49d532",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEzMDYsImlhdCI6MTc5MzI4MDQwNiwianRpIjoiMmQ3ZjE0NmEtYjQwMC00N2M1LTk5ZjgtODhkYzM2NDQ1YTQzIiwic2lkIjoiNWY4MmJiYzgtNTUwOS00NzI2LWJmNzQtM2MzMTVkNDlkNTMyIn0.po7G_2LV50ku74NC_Tmpufu0fHpGhgQQk3xVc9vUNHs",
  "access_expires_at": "2026-10-29T13:41:46.296133395Z",
  "refresh_token": "8phKzmHH0q0uSQnmA2eYudyDlM80RuPX-lZxTR27-AM",
  "refresh_expires_at": "2026-10-30T01:26:46.295782044Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/3cb25c3d-6867-449d-aa22-051978063a6e/attachments/639742ab-d69b-4182-8301-d74e6d901655` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "1a10c718-248b-4d6a-854a-a050b68e940c",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "62d2f799-f12a-4f4a-8855-dd7ccf8eabc1",
  "upload_path": "/api/operator/v1/uploads/62d2f799-f12a-4f4a-8855-dd7ccf8eabc1",
  "expires_at": "2026-10-29T13:41:46.496014394Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/62d2f799-f12a-4f4a-8855-dd7ccf8eabc1` → **200**

```json
{
  "file_id": "62d2f799-f12a-4f4a-8855-dd7ccf8eabc1",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/3cb25c3d-6867-449d-aa22-051978063a6e` → **200**

```json
{
  "id": "3cb25c3d-6867-449d-aa22-051978063a6e",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T13:26:45.485094Z",
  "updated_at": "2026-10-29T13:26:45.485094Z",
  "respond_by": "2026-10-29T17:26:45.485094Z",
  "messages": [
    {
      "id": "aee3abc9-5965-4e3f-98bf-36634a8088aa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T13:26:45.485854Z",
      "attachments": [
        {
          "file_id": "639742ab-d69b-4182-8301-d74e6d901655",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/3cb25c3d-6867-449d-aa22-051978063a6e/comments` → **200**

```json
{
  "command_id": "073ba604-344a-48cb-b4b6-54c48317d16b",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "62d2f799-f12a-4f4a-8855-dd7ccf8eabc1"
  ]
}
```

```json
{
  "id": "3cb25c3d-6867-449d-aa22-051978063a6e",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T13:26:45.485094Z",
  "updated_at": "2026-10-29T13:26:46.893805Z",
  "respond_by": "2026-10-29T17:26:45.485094Z",
  "messages": [
    {
      "id": "aee3abc9-5965-4e3f-98bf-36634a8088aa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T13:26:45.485854Z",
      "attachments": [
        {
          "file_id": "639742ab-d69b-4182-8301-d74e6d901655",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4a076565-3f56-4dca-be32-6c154dd7fd1c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T13:26:46.893499Z",
      "attachments": [
        {
          "file_id": "62d2f799-f12a-4f4a-8855-dd7ccf8eabc1",
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

`GET /api/rider/v1/support/cases/3cb25c3d-6867-449d-aa22-051978063a6e` → **200**

```json
{
  "id": "3cb25c3d-6867-449d-aa22-051978063a6e",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T13:26:45.485094Z",
  "updated_at": "2026-10-29T13:26:46.893805Z",
  "respond_by": "2026-10-29T17:26:45.485094Z",
  "messages": [
    {
      "id": "aee3abc9-5965-4e3f-98bf-36634a8088aa",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "c3ccf738-8c03-4abd-a6fe-7044fa7d0903",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T13:26:45.485854Z",
      "attachments": [
        {
          "file_id": "639742ab-d69b-4182-8301-d74e6d901655",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "4a076565-3f56-4dca-be32-6c154dd7fd1c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T13:26:46.893499Z",
      "attachments": [
        {
          "file_id": "62d2f799-f12a-4f4a-8855-dd7ccf8eabc1",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/3cb25c3d-6867-449d-aa22-051978063a6e/attachments/62d2f799-f12a-4f4a-8855-dd7ccf8eabc1` → **200**

Done: support case 3cb25c3d-6867-449d-aa22-051978063a6e, rider attachment 639742ab-d69b-4182-8301-d74e6d901655, operator attachment 62d2f799-f12a-4f4a-8855-dd7ccf8eabc1.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731202960",
  "device_ref": "sandbox-10244"
}
```

```json
{
  "challenge_id": "b18a1bf1-9a98-45b8-a96d-86fb84810426",
  "expires_at": "2026-10-29T13:31:47.302542701Z",
  "resend_available_at": "2026-10-29T13:26:48.302542701Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731202960` → **200**

```json
{
  "phone": "+380731202960",
  "audience": "CLIENT",
  "code": "740676",
  "sent_at": "2026-10-29T13:26:47.304139353Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b18a1bf1-9a98-45b8-a96d-86fb84810426",
  "code": "740676",
  "device_ref": "sandbox-10244"
}
```

```json
{
  "session_id": "2f20f7de-1a54-473f-8147-1972299c4d7b",
  "subject": {
    "type": "CLIENT",
    "id": "9dc732c1-9d52-4b13-93a4-95cd5893a4a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGM3MzJjMS05ZDUyLTRiMTMtOTNhNC05NWNkNTg5M2E0YTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMzA3LCJpYXQiOjE3OTMyODA0MDcsImp0aSI6ImMyOGU5YmQ2LTI0NDgtNDdjYS1iMDhhLWFhZjQ3N2M4ZGNhMCIsInNpZCI6IjJmMjBmN2RlLTFhNTQtNDczZi04MTQ3LTE5NzIyOTljNGQ3YiJ9.oBagZMMkjJQIVPknIAkkkx-FaQxt3TrnvEDMUbYBrnM",
  "access_expires_at": "2026-10-29T13:41:47.517627758Z",
  "refresh_token": "s7RQ5p8WV442m4Kj8PpWq6P_yyyX_WYp99I4EHViLbM",
  "refresh_expires_at": "2026-11-28T13:26:47.517281275Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b79031a8-d17c-4865-9973-360288157297",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b2a84c13-2b60-4d41-818a-cc094053f914",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b2a84c13-2b60-4d41-818a-cc094053f914",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d2807a85e3ef4461ffd98b65ee8f76e0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b2a84c13-2b60-4d41-818a-cc094053f914",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731202960"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b2a84c13-2b60-4d41-818a-cc094053f914",
  "expires_at": "2026-10-29T13:56:47.712619Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/b2a84c13-2b60-4d41-818a-cc094053f914` → **200**

```json
{
  "id": "b2a84c13-2b60-4d41-818a-cc094053f914",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T13:56:47.712619Z",
  "card": {
    "id": "cb5cbae6-06b1-4923-9ddf-3093d1aac1ff",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5311",
    "card_type": "Visa",
    "created_at": "2026-10-29T13:26:47.909769Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3150f9b3-4600-4d8a-bf9f-4271ae5632ce",
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
  "id": "051c0e92-7d74-478c-90ed-af3d497d99dd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:31:48.118101Z",
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
  "command_id": "ea6b41c2-b711-4b74-8307-dba504923e89",
  "quote_id": "051c0e92-7d74-478c-90ed-af3d497d99dd",
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
  "id": "36248e35-22cc-4126-ba73-1593101d9cd1",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9dc732c1-9d52-4b13-93a4-95cd5893a4a3",
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
  "created_at": "2026-10-29T13:26:48.340455Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/36248e35-22cc-4126-ba73-1593101d9cd1` → **200**

```json
{
  "id": "36248e35-22cc-4126-ba73-1593101d9cd1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9dc732c1-9d52-4b13-93a4-95cd5893a4a3",
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
  "created_at": "2026-10-29T13:26:48.340455Z",
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

`GET /api/rider/v1/orders/36248e35-22cc-4126-ba73-1593101d9cd1` → **200**

```json
{
  "id": "36248e35-22cc-4126-ba73-1593101d9cd1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9dc732c1-9d52-4b13-93a4-95cd5893a4a3",
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
  "created_at": "2026-10-29T13:26:48.340455Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/36248e35-22cc-4126-ba73-1593101d9cd1/switch-to-cash` → **200**

```json
{
  "command_id": "1e501781-b3fc-4346-9f8c-6486f06fbce1",
  "expected_version": 3
}
```

```json
{
  "id": "36248e35-22cc-4126-ba73-1593101d9cd1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9dc732c1-9d52-4b13-93a4-95cd5893a4a3",
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
  "created_at": "2026-10-29T13:26:48.340455Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/36248e35-22cc-4126-ba73-1593101d9cd1/switch-to-cash` → **409**

```json
{
  "command_id": "4033581f-6c9f-4b24-9044-87fb15b50093",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/36248e35-22cc-4126-ba73-1593101d9cd1/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3bb241dc-d951-43b7-88e0-384d1af8b093"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/36248e35-22cc-4126-ba73-1593101d9cd1` → **200**

```json
{
  "id": "36248e35-22cc-4126-ba73-1593101d9cd1",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "9dc732c1-9d52-4b13-93a4-95cd5893a4a3",
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
  "created_at": "2026-10-29T13:26:48.340455Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/36248e35-22cc-4126-ba73-1593101d9cd1/cancel` → **200**

```json
{
  "command_id": "5c5bb29b-e605-4d2f-8699-1848c71aae18",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "36248e35-22cc-4126-ba73-1593101d9cd1",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9dc732c1-9d52-4b13-93a4-95cd5893a4a3",
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
  "created_at": "2026-10-29T13:26:48.340455Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать"
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
  "session_id": "3e89cdd8-e0b2-45c3-97c9-ab322059afbb",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEzMTAsImlhdCI6MTc5MzI4MDQxMCwianRpIjoiZjY2NDA1NmUtYzE3OC00MjFiLTg0M2YtNDQwZDc2OTIzNmIxIiwic2lkIjoiM2U4OWNkZDgtZTBiMi00NWMzLTk3YzktYWIzMjIwNTlhZmJiIn0.DyyMp_MUYP7tUcIOU3MtUa0vvSvsohhI1GNDqjxisRc",
  "access_expires_at": "2026-10-29T13:41:50.039055837Z",
  "refresh_token": "Jhdy5ELNNbh-kGSbCvRZA0hBdDn94LpcbzOL24Ra974",
  "refresh_expires_at": "2026-10-30T01:26:50.038665307Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17408"
}
```

```json
{
  "challenge_id": "9c34e842-0d16-410c-ab71-373654722ca2",
  "expires_at": "2026-10-29T13:31:50.227877699Z",
  "resend_available_at": "2026-10-29T13:26:51.227877699Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "750835",
  "sent_at": "2026-10-29T13:26:50.229907146Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c34e842-0d16-410c-ab71-373654722ca2",
  "code": "750835",
  "device_ref": "sandbox-17408"
}
```

```json
{
  "session_id": "d96929ee-4b95-4b81-a042-40d9be0b2b96",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTMxMCwiaWF0IjoxNzkzMjgwNDEwLCJqdGkiOiJhODUxODkxZS1kYTQ1LTQ5NzctYWJmMS0xNDNhMjlmMWI3ZjMiLCJzaWQiOiJkOTY5MjllZS00Yjk1LTRiODEtYTA0Mi00MGQ5YmUwYjJiOTYifQ.j1Ph2c6TFYZIvZA1kX4zsLjU6W22nEB37NHOlY0F4Sk",
  "access_expires_at": "2026-10-29T13:41:50.439235537Z",
  "refresh_token": "sRpBT4frN7HahUyve6aZqAe40cwGFU7Xvm43jqvZpSA",
  "refresh_expires_at": "2026-11-28T13:26:50.438841761Z",
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
      "actor_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T13:26:39.802952Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T13:26:40.784074Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "e6c6319b-da8f-47b0-bbf0-1f4174536be3",
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
  "device_ref": "sandbox-23198"
}
```

```json
{
  "challenge_id": "60fd86aa-25b6-48b7-b400-6f09d6198667",
  "expires_at": "2026-10-29T13:31:51.222804824Z",
  "resend_available_at": "2026-10-29T13:26:52.222804824Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "104905",
  "sent_at": "2026-10-29T13:26:51.224792406Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60fd86aa-25b6-48b7-b400-6f09d6198667",
  "code": "104905",
  "device_ref": "sandbox-23198"
}
```

```json
{
  "session_id": "60c81148-db0d-4454-a033-b757208daeb6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTMxMSwiaWF0IjoxNzkzMjgwNDExLCJqdGkiOiIyMzVlM2UzOS0wNzE3LTQ2OTktOTFlNi1mMmQ1MTM0MzNiZDciLCJzaWQiOiI2MGM4MTE0OC1kYjBkLTQ0NTQtYTAzMy1iNzU3MjA4ZGFlYjYifQ.NzwUJOeTq6Aj-SCLHNvQPSHE0SZeCjIeyCnkgP19ijI",
  "access_expires_at": "2026-10-29T13:41:51.448319004Z",
  "refresh_token": "0OHpD4s8qwxI7aGvandrPv6XocSS6N5BdqhICA4cOh4",
  "refresh_expires_at": "2026-11-28T13:26:51.447967183Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5abd8f-565d-4864-a065-c0eb1b0c5cbb",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-29T13:26:25.517854Z",
  "last_location_at": "2026-10-29T13:26:25.517854Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8f5abd8f-565d-4864-a065-c0eb1b0c5cbb/handover` → **200**

```json
{
  "command_id": "28349ada-6cf9-4528-b947-3883fe6ad65d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5abd8f-565d-4864-a065-c0eb1b0c5cbb",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-29T13:26:25.517854Z",
  "last_location_at": "2026-10-29T13:26:25.517854Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8f5abd8f-565d-4864-a065-c0eb1b0c5cbb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:52Z",
    "sequence": 1793280412273
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8f5abd8f-565d-4864-a065-c0eb1b0c5cbb",
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
  "last_heartbeat_at": "2026-10-29T13:26:52.043374Z",
  "last_location_at": "2026-10-29T13:26:52.043374Z",
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
  "command_id": "844fe4d4-7cef-445e-95f6-0bc7cf9f8ff5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:52Z",
    "sequence": 1793280412433
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4a3551f2-0b39-4527-8a07-6a4927c38bf5",
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
  "last_heartbeat_at": "2026-10-29T13:26:52.44893Z",
  "last_location_at": "2026-10-29T13:26:52.44893Z",
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
  "session_id": "82f755d8-3680-48a5-83f0-ce1ce9d296b7",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODEzMTIsImlhdCI6MTc5MzI4MDQxMiwianRpIjoiNjc5NWM0OTctZjFiMS00M2M0LWIyYTgtYzQxMTI2NTQ2NTc1Iiwic2lkIjoiODJmNzU1ZDgtMzY4MC00OGE1LTgzZjAtY2UxY2U5ZDI5NmI3In0.plg_EWEy3E9Oo4R5K9TWQ14n6YRyJE322sPsyy4BrhE",
  "access_expires_at": "2026-10-29T13:41:52.852860143Z",
  "refresh_token": "v5ADeoUxDjV8hWJSdzuQgMp_XXO1mHAsYX5RugC-J2E",
  "refresh_expires_at": "2026-10-30T01:26:52.852502804Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c47d2c4e-5fe1-44cb-934d-df96bb805f23",
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
  "id": "1bdc9cae-cc54-4507-ad27-afe16c848296",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:31:53.045269Z",
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
  "command_id": "b8bf6c89-c848-4ec1-b65c-56849b553f8c",
  "quote_id": "1bdc9cae-cc54-4507-ad27-afe16c848296",
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
  "id": "457af620-6607-4cec-a393-8a9677e2dd4a",
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
  "created_at": "2026-10-29T13:26:53.24678Z",
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
    "id": "ace43380-f3d9-4e18-9361-17dae9f2c5fa",
    "order_id": "457af620-6607-4cec-a393-8a9677e2dd4a",
    "expires_at": "2026-10-29T13:27:08.249504Z",
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

`POST /api/driver/v1/offers/ace43380-f3d9-4e18-9361-17dae9f2c5fa/accept` → **200**

```json
{
  "command_id": "e10a3e27-3b3b-4c95-bf7a-cacc56c41963"
}
```

```json
{
  "id": "239fb098-04da-4655-9c7e-dbc69e24dfc7",
  "order_id": "457af620-6607-4cec-a393-8a9677e2dd4a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "476ec3b8-81fa-45ba-ac5b-5507540495c4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "476ec3b8-81fa-45ba-ac5b-5507540495c4",
  "order_id": "457af620-6607-4cec-a393-8a9677e2dd4a",
  "assignment_id": "239fb098-04da-4655-9c7e-dbc69e24dfc7",
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

`POST /api/driver/v1/work-sessions/4a3551f2-0b39-4527-8a07-6a4927c38bf5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T13:26:54Z",
    "sequence": 1793280414195
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4a3551f2-0b39-4527-8a07-6a4927c38bf5",
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
  "last_heartbeat_at": "2026-10-29T13:26:54.210992Z",
  "last_location_at": "2026-10-29T13:26:54.210992Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/476ec3b8-81fa-45ba-ac5b-5507540495c4/arrive` → **200**

```json
{
  "command_id": "0cfe8ffd-ce6e-4e50-ba38-114a336d3bcc",
  "expected_version": 0
}
```

```json
{
  "id": "476ec3b8-81fa-45ba-ac5b-5507540495c4",
  "order_id": "457af620-6607-4cec-a393-8a9677e2dd4a",
  "assignment_id": "239fb098-04da-4655-9c7e-dbc69e24dfc7",
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
  "arrived_at": "2026-10-29T13:26:54.436573Z",
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

`POST /api/driver/v1/trips/476ec3b8-81fa-45ba-ac5b-5507540495c4/start` → **200**

```json
{
  "command_id": "93d0be6e-9468-45ca-b533-38083182dfb3",
  "expected_version": 1
}
```

```json
{
  "id": "476ec3b8-81fa-45ba-ac5b-5507540495c4",
  "order_id": "457af620-6607-4cec-a393-8a9677e2dd4a",
  "assignment_id": "239fb098-04da-4655-9c7e-dbc69e24dfc7",
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
  "arrived_at": "2026-10-29T13:26:54.436573Z",
  "started_at": "2026-10-29T13:26:54.634095Z",
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

`POST /api/driver/v1/trips/476ec3b8-81fa-45ba-ac5b-5507540495c4/complete` → **200**

```json
{
  "command_id": "e688df7b-2f1c-49c9-88c0-f282d8063cfb",
  "expected_version": 2,
  "reported_at": "2026-10-29T13:26:54Z",
  "cash_received": true
}
```

```json
{
  "id": "476ec3b8-81fa-45ba-ac5b-5507540495c4",
  "order_id": "457af620-6607-4cec-a393-8a9677e2dd4a",
  "assignment_id": "239fb098-04da-4655-9c7e-dbc69e24dfc7",
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
  "arrived_at": "2026-10-29T13:26:54.436573Z",
  "started_at": "2026-10-29T13:26:54.634095Z",
  "completed_at": "2026-10-29T13:26:54.85577Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/457af620-6607-4cec-a393-8a9677e2dd4a` → **200**

```json
{
  "id": "457af620-6607-4cec-a393-8a9677e2dd4a",
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
    "id": "239fb098-04da-4655-9c7e-dbc69e24dfc7",
    "order_id": "457af620-6607-4cec-a393-8a9677e2dd4a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "476ec3b8-81fa-45ba-ac5b-5507540495c4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T13:26:53.24678Z",
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
  "session_id": "8f5abd8f-565d-4864-a065-c0eb1b0c5cbb",
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
  "last_heartbeat_at": "2026-10-29T13:26:52.043374Z",
  "last_location_at": "2026-10-29T13:26:52.043374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8f5abd8f-565d-4864-a065-c0eb1b0c5cbb/close` → **200**

```json
{
  "command_id": "6c4a5954-1209-4f61-be2c-5b180b32ca06",
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
  "session_id": "4a3551f2-0b39-4527-8a07-6a4927c38bf5",
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
  "last_heartbeat_at": "2026-10-29T13:26:54.210992Z",
  "last_location_at": "2026-10-29T13:26:54.210992Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4a3551f2-0b39-4527-8a07-6a4927c38bf5/close` → **200**

```json
{
  "command_id": "b9941da4-eaab-41f7-8c70-2a09ba7369e9",
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

Done: terminal order 457af620-6607-4cec-a393-8a9677e2dd4a by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-23630"
}
```

```json
{
  "challenge_id": "d5a6b8dc-3c0b-4d4d-9543-e85358192a98",
  "expires_at": "2026-10-29T13:31:59.226462082Z",
  "resend_available_at": "2026-10-29T13:27:00.226462082Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "605672",
  "sent_at": "2026-10-29T13:26:59.22866589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5a6b8dc-3c0b-4d4d-9543-e85358192a98",
  "code": "605672",
  "device_ref": "sandbox-23630"
}
```

```json
{
  "session_id": "b9270498-982d-4d37-b9b6-e68a0f575eee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTMxOSwiaWF0IjoxNzkzMjgwNDE5LCJqdGkiOiJkMDI1Y2JhZS1jZGM5LTQ3ZDgtOWU5YS02MTYyNWE4MDMwZWUiLCJzaWQiOiJiOTI3MDQ5OC05ODJkLTRkMzctYjliNi1lNjhhMGY1NzVlZWUifQ.o606OQNwm-ingZ6OhopHZrKLtn0feyJvOuzWmq4m_kE",
  "access_expires_at": "2026-10-29T13:41:59.442216263Z",
  "refresh_token": "r-MuylMgj8Z6Rr-UCsbC5GtYN8rjzVXWVDTgSo9zyXQ",
  "refresh_expires_at": "2026-11-28T13:26:59.441745382Z",
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
  "device_ref": "sandbox-25032"
}
```

```json
{
  "challenge_id": "4d2f9563-4890-4e6c-9393-56bb22649872",
  "expires_at": "2026-10-29T13:31:59.818316823Z",
  "resend_available_at": "2026-10-29T13:27:00.818316823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "911542",
  "sent_at": "2026-10-29T13:26:59.820246498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d2f9563-4890-4e6c-9393-56bb22649872",
  "code": "911542",
  "device_ref": "sandbox-25032"
}
```

```json
{
  "session_id": "a90d0832-27c6-44c4-9fd9-b39dd4c31132",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTMyMCwiaWF0IjoxNzkzMjgwNDIwLCJqdGkiOiJmNjcxNjkxNy02MmY4LTQ4YmUtOWM4Ni00NjZhYTNmNzNkYTMiLCJzaWQiOiJhOTBkMDgzMi0yN2M2LTQ0YzQtOWZkOS1iMzlkZDRjMzExMzIifQ.SML5g9hqDcbU0PWVoUqqdIfpoe6TJ32Yjf45cyqDJwM",
  "access_expires_at": "2026-10-29T13:42:00.032120457Z",
  "refresh_token": "EW5zJ322XpZezefLHOhjAjIjyMnVEgnp8GNgZhG2JWY",
  "refresh_expires_at": "2026-11-28T13:27:00.031723618Z",
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
  "device_ref": "sandbox-12293"
}
```

```json
{
  "challenge_id": "f79bddfb-966a-42f8-baf3-17723e94ac52",
  "expires_at": "2026-10-29T13:32:00.413420052Z",
  "resend_available_at": "2026-10-29T13:27:01.413420052Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "280551",
  "sent_at": "2026-10-29T13:27:00.415634437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f79bddfb-966a-42f8-baf3-17723e94ac52",
  "code": "280551",
  "device_ref": "sandbox-12293"
}
```

```json
{
  "session_id": "889249ca-060c-4034-8a5f-5c0ea36643ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4MTMyMCwiaWF0IjoxNzkzMjgwNDIwLCJqdGkiOiIwNzYyOGZhYy0zZWIyLTQxNzctOTg0MC1kYmY3MGQ3YmM3ZWUiLCJzaWQiOiI4ODkyNDljYS0wNjBjLTQwMzQtOGE1Zi01YzBlYTM2NjQzZWQifQ.9vW2FxXIAi80DepUuA1ybk9yMLA79uhO52f2n0e7y5g",
  "access_expires_at": "2026-10-29T13:42:00.626718582Z",
  "refresh_token": "qqmVC5kCXh-vDfJoUkCYiVM61-jiB1jNH6YbHovt7FI",
  "refresh_expires_at": "2026-11-28T13:27:00.62631263Z",
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
  "phone": "+380694279393",
  "device_ref": "sandbox-17056"
}
```

```json
{
  "challenge_id": "cec0f2a8-ffcb-4cf1-b3ef-8c6edf3789cb",
  "expires_at": "2026-10-29T13:32:01.00009665Z",
  "resend_available_at": "2026-10-29T13:27:02.00009665Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694279393` → **200**

```json
{
  "phone": "+380694279393",
  "audience": "CLIENT",
  "code": "646804",
  "sent_at": "2026-10-29T13:27:01.002487381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cec0f2a8-ffcb-4cf1-b3ef-8c6edf3789cb",
  "code": "646804",
  "device_ref": "sandbox-17056"
}
```

```json
{
  "session_id": "ea3546d1-b1d2-4038-bbc0-90d7e335b4e2",
  "subject": {
    "type": "CLIENT",
    "id": "9c9976da-9469-4a26-85ae-c1a17f746153"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Yzk5NzZkYS05NDY5LTRhMjYtODVhZS1jMWExN2Y3NDYxNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjgxMzIxLCJpYXQiOjE3OTMyODA0MjEsImp0aSI6IjYwMTg2NjVjLTEwMTUtNDc1OS1hYmY4LWEzMDk4YzUwZDU2YyIsInNpZCI6ImVhMzU0NmQxLWIxZDItNDAzOC1iYmMwLTkwZDdlMzM1YjRlMiJ9.8urvg5GxjNJpLJBz3xTKzMCyIGTvjIhMXuMJK_tDo9E",
  "access_expires_at": "2026-10-29T13:42:01.216437478Z",
  "refresh_token": "tHOwHBjR80uQAwE6GJjdlrhoZ-ufPHz7DQpQMkjDuKY",
  "refresh_expires_at": "2026-11-28T13:27:01.216075049Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a68e8acf-2904-4441-86d0-efb52003c7fd",
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
  "id": "68673bea-badd-4816-afc2-e1dd27098c83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T13:32:01.407875Z",
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
  "command_id": "f7dbe623-d86e-48c1-986a-9a5b04d5cdce",
  "quote_id": "68673bea-badd-4816-afc2-e1dd27098c83",
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
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T13:27:01.60767Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:27:01.60767Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 10.636346646
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.103231231
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

`GET /api/rider/v1/orders/f7e6022e-85dd-4604-ab20-0173d6ac38d5` → **200**

```json
{
  "id": "f7e6022e-85dd-4604-ab20-0173d6ac38d5",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c9976da-9469-4a26-85ae-c1a17f746153",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T13:27:01.60767Z",
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
  "session_id": "bc6fc406-428b-41c5-b8c4-dd55a8fab8ae",
  "subject": {
    "type": "STAFF",
    "id": "9d5e612b-6560-4572-ae4f-87d07514b00f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZDVlNjEyYi02NTYwLTQ1NzItYWU0Zi04N2QwNzUxNGIwMGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODE1MDQsImlhdCI6MTc5MzI4MDYwNCwianRpIjoiN2VjMDU2ZGYtZmI2OC00ZDQ2LThkM2QtMDI5NjczYmYxMjVmIiwic2lkIjoiYmM2ZmM0MDYtNDI4Yi00MWM1LWI4YzQtZGQ1NWE4ZmFiOGFlIn0.3lJhGA58KgOBbUE9bYDK8H17L21BZ_ZONvNZ170iH1A",
  "access_expires_at": "2026-10-29T13:45:04.670801963Z",
  "refresh_token": "UtDgMHacGLFy8b2FSo4xKrr9KvTYVageREaZubAhUyE",
  "refresh_expires_at": "2026-10-30T01:30:04.670313024Z",
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
  "id": "fcbdcf03-db72-43ff-a310-c927e014176c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T13:30:04.882571Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T13:30:04.882647Z",
  "updated_at": "2026-10-29T13:30:04.893457Z",
  "finished_at": "2026-10-29T13:30:04.893457Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/fcbdcf03-db72-43ff-a310-c927e014176c` → **200**

```json
{
  "run": {
    "id": "fcbdcf03-db72-43ff-a310-c927e014176c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T13:30:04.882571Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T13:30:04.882647Z",
    "updated_at": "2026-10-29T13:30:04.893457Z",
    "finished_at": "2026-10-29T13:30:04.893457Z",
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
  "id": "fcbdcf03-db72-43ff-a310-c927e014176c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T13:30:04.882571Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T13:30:04.882647Z",
  "updated_at": "2026-10-29T13:30:04.893457Z",
  "finished_at": "2026-10-29T13:30:04.893457Z",
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
  "id": "fcbdcf03-db72-43ff-a310-c927e014176c",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T13:30:04.882571Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T13:30:04.882647Z",
  "updated_at": "2026-10-29T13:30:04.893457Z",
  "finished_at": "2026-10-29T13:30:04.893457Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/fc52ab84-7d90-493f-98a4-f4c222db81cd` → **204**

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
  "id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T13:30:05.248632Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T13:30:05.248728Z",
  "updated_at": "2026-10-29T13:30:05.254396Z",
  "finished_at": "2026-10-29T13:30:05.254396Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/eb12dd78-4de2-42e0-aeb8-d09343b085ae` → **200**

```json
{
  "run": {
    "id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T13:30:05.248632Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T13:30:05.248728Z",
    "updated_at": "2026-10-29T13:30:05.254396Z",
    "finished_at": "2026-10-29T13:30:05.254396Z",
    "version": 1
  },
  "items": [
    {
      "id": "9c731b64-6785-4e4d-a83c-d2e4f803697e",
      "run_id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "93fc8bc3570803bf29c0fb3c46d4d4797fc09d1b669da3e0c8e1dcd17be579aa",
      "reference_display": "sandbox-reconciliation-fc52ab84-7d90-493f-98a4-f4c222db81cd",
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
      "provider_at": "2026-10-29T13:30:05Z",
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
  "id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T13:30:05.248632Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T13:30:05.248728Z",
  "updated_at": "2026-10-29T13:30:05.254396Z",
  "finished_at": "2026-10-29T13:30:05.254396Z",
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
  "id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T13:30:05.248632Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T13:30:05.248728Z",
  "updated_at": "2026-10-29T13:30:05.254396Z",
  "finished_at": "2026-10-29T13:30:05.254396Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/9c731b64-6785-4e4d-a83c-d2e4f803697e/resolve` → **200**

```json
{
  "command_id": "f3876587-9f2b-4020-8064-5edee5d1ad27",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "9c731b64-6785-4e4d-a83c-d2e4f803697e",
  "run_id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "93fc8bc3570803bf29c0fb3c46d4d4797fc09d1b669da3e0c8e1dcd17be579aa",
  "reference_display": "sandbox-reconciliation-fc52ab84-7d90-493f-98a4-f4c222db81cd",
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
  "provider_at": "2026-10-29T13:30:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "resolved_at": "2026-10-29T13:30:05.563327Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/9c731b64-6785-4e4d-a83c-d2e4f803697e/resolve` → **200**

```json
{
  "command_id": "f3876587-9f2b-4020-8064-5edee5d1ad27",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "9c731b64-6785-4e4d-a83c-d2e4f803697e",
  "run_id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "93fc8bc3570803bf29c0fb3c46d4d4797fc09d1b669da3e0c8e1dcd17be579aa",
  "reference_display": "sandbox-reconciliation-fc52ab84-7d90-493f-98a4-f4c222db81cd",
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
  "provider_at": "2026-10-29T13:30:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
  "resolved_at": "2026-10-29T13:30:05.563327Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/9c731b64-6785-4e4d-a83c-d2e4f803697e/resolve` → **409**

```json
{
  "command_id": "5507e6ab-eb2f-455a-b436-bd017138a617",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/9c731b64-6785-4e4d-a83c-d2e4f803697e/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8d2467bf-634b-44eb-b616-fbcd3dd3da83"
}
```

`GET /api/admin/v1/payment-reconciliations/eb12dd78-4de2-42e0-aeb8-d09343b085ae` → **200**

```json
{
  "run": {
    "id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T13:30:05.248632Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T13:30:05.248728Z",
    "updated_at": "2026-10-29T13:30:05.563327Z",
    "finished_at": "2026-10-29T13:30:05.254396Z",
    "version": 2
  },
  "items": [
    {
      "id": "9c731b64-6785-4e4d-a83c-d2e4f803697e",
      "run_id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "93fc8bc3570803bf29c0fb3c46d4d4797fc09d1b669da3e0c8e1dcd17be579aa",
      "reference_display": "sandbox-reconciliation-fc52ab84-7d90-493f-98a4-f4c222db81cd",
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
      "provider_at": "2026-10-29T13:30:05Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "9d5e612b-6560-4572-ae4f-87d07514b00f",
      "resolved_at": "2026-10-29T13:30:05.563327Z",
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
      "id": "ddf122c4-f228-42ca-b9c7-aaf7c4120c92",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T13:23:33.172719Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T13:23:33.172777Z",
      "updated_at": "2026-10-29T13:23:33.175984Z",
      "finished_at": "2026-10-29T13:23:33.175984Z",
      "version": 1
    },
    {
      "id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T13:30:05.248632Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T13:30:05.248728Z",
      "updated_at": "2026-10-29T13:30:05.563327Z",
      "finished_at": "2026-10-29T13:30:05.254396Z",
      "version": 2
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/fc52ab84-7d90-493f-98a4-f4c222db81cd` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "eb12dd78-4de2-42e0-aeb8-d09343b085ae",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T13:30:05.248632Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T13:30:05.248728Z",
  "updated_at": "2026-10-29T13:30:05.563327Z",
  "finished_at": "2026-10-29T13:30:05.254396Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793280728321E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793280728391E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793280728391E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793280728392E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793280728391E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
