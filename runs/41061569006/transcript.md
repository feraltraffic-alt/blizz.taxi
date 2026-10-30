# Sandbox transcript (2026-10-30T13:15:20Z, 85091db)

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
  "correlation_id": "abde4e5c-a769-4584-ad53-5c37bb63693d"
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
  "session_id": "368094af-a641-4523-828c-e754d0901394",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcwMjcsImlhdCI6MTc5MzM2NjEyNywianRpIjoiOTVlMTc3YjktOTE3Ni00NTA2LWE5MzYtYjViOWVjOGM5ZTcwIiwic2lkIjoiMzY4MDk0YWYtYTY0MS00NTIzLTgyOGMtZTc1NGQwOTAxMzk0In0.jDRan3wtJCw2xVv4PUHlj5spsk4Mk2sDlHIwiVgXXDg",
  "access_expires_at": "2026-10-30T13:30:27.47827036Z",
  "refresh_token": "jj_9IBzLBjgtKhz-qDv62SgMHFOSGgCYydojvZUnwxo",
  "refresh_expires_at": "2026-10-31T01:15:27.475218231Z",
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
  "session_id": "62b408b9-ba68-4238-8bc0-e5fea06162f7",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcwMjksImlhdCI6MTc5MzM2NjEyOSwianRpIjoiOGZhZDZlNzEtY2ZlNi00ZTVjLThkNTEtYmZhODVhMmFmYzk1Iiwic2lkIjoiNjJiNDA4YjktYmE2OC00MjM4LThiYzAtZTVmZWEwNjE2MmY3In0.bgR5iuw4K4O5xXGyBoUhOJFurH-xUaAPFfq5zMGM9_A",
  "access_expires_at": "2026-10-30T13:30:29.353226802Z",
  "refresh_token": "L_9tKsOPFnWOJny6fsgKO3xMR_F5-YUO3PAHIF1c2Lw",
  "refresh_expires_at": "2026-10-31T01:15:29.351833897Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
  "device_ref": "sandbox-3170"
}
```

```json
{
  "challenge_id": "7f2fc75b-8e00-48c9-a0d8-b138eea9322b",
  "expires_at": "2026-10-30T13:20:30.030200447Z",
  "resend_available_at": "2026-10-30T13:15:31.030200447Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "525657",
  "sent_at": "2026-10-30T13:15:30.044220782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f2fc75b-8e00-48c9-a0d8-b138eea9322b",
  "code": "525657",
  "device_ref": "sandbox-3170"
}
```

```json
{
  "session_id": "23f34aae-4cbd-4934-bb01-941e5d072845",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzAzMCwiaWF0IjoxNzkzMzY2MTMwLCJqdGkiOiI0YWNiNTE2MS02NzI1LTQzNzQtYTU4My0wZTEzYjBhOTk5ZTEiLCJzaWQiOiIyM2YzNGFhZS00Y2JkLTQ5MzQtYmIwMS05NDFlNWQwNzI4NDUifQ.cJbIyW3tQK4z1PQq31Y3z_tAjaCTXkQxVU3yt0-LROI",
  "access_expires_at": "2026-10-30T13:30:30.396290008Z",
  "refresh_token": "vH4ZIO8-rMW0DvEOQr8NBIgjUDYd_11e_XAjvIDDAzU",
  "refresh_expires_at": "2026-11-29T13:15:30.39515182Z",
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
  "command_id": "36219909-fee2-4fc7-bde1-87a05577fd85",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:31Z",
    "sequence": 1793366131123
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b6822ee-d464-4ca5-8a1c-c5d0fb107ccf",
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
  "last_heartbeat_at": "2026-10-30T13:15:31.192008Z",
  "last_location_at": "2026-10-30T13:15:31.192008Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633841722",
  "device_ref": "sandbox-20652"
}
```

```json
{
  "challenge_id": "496d6255-2782-47ac-95ff-be70ffaa3c91",
  "expires_at": "2026-10-30T13:20:31.517239356Z",
  "resend_available_at": "2026-10-30T13:15:32.517239356Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633841722` → **200**

```json
{
  "phone": "+380633841722",
  "audience": "CLIENT",
  "code": "912321",
  "sent_at": "2026-10-30T13:15:31.522757593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "496d6255-2782-47ac-95ff-be70ffaa3c91",
  "code": "912321",
  "device_ref": "sandbox-20652"
}
```

```json
{
  "session_id": "c4ce965b-2bb2-4ed6-9bab-45349f3853ef",
  "subject": {
    "type": "CLIENT",
    "id": "2825075a-96ce-4ff9-a869-90e98c59847b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODI1MDc1YS05NmNlLTRmZjktYTg2OS05MGU5OGM1OTg0N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MDMxLCJpYXQiOjE3OTMzNjYxMzEsImp0aSI6IjdlMzg5OTYxLTkwMTEtNDU1OS05NjdlLWU2ZDNjMTdhYTYwMyIsInNpZCI6ImM0Y2U5NjViLTJiYjItNGVkNi05YmFiLTQ1MzQ5ZjM4NTNlZiJ9.Tu0bXYPmWH-GnjtNqrdPKrOkPpqwbQlI7egYMYFvebg",
  "access_expires_at": "2026-10-30T13:30:31.839953169Z",
  "refresh_token": "aHSf0-WF0gWBU3XkxGuCaHXZXezSe8qOp6euDYeT1lc",
  "refresh_expires_at": "2026-11-29T13:15:31.83894155Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eda3f66c-a11b-47ac-93f1-898302c0372a",
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
  "id": "fb047533-674e-4171-9c18-f5c59586c7e6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:20:32.186338Z",
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
  "command_id": "94e42ca3-b321-4a70-b3fb-3a2d69d75af4",
  "quote_id": "fb047533-674e-4171-9c18-f5c59586c7e6",
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
  "id": "81a7650e-39d2-4bf0-944c-40e8d1793e71",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2825075a-96ce-4ff9-a869-90e98c59847b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:15:32.62218Z",
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
    "id": "865a630a-88e2-42ef-ae10-ca68a1183bf3",
    "order_id": "81a7650e-39d2-4bf0-944c-40e8d1793e71",
    "expires_at": "2026-10-30T13:15:47.634931Z",
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

`POST /api/driver/v1/offers/865a630a-88e2-42ef-ae10-ca68a1183bf3/accept` → **200**

```json
{
  "command_id": "03dcdcb2-430f-4c7d-90aa-b7d1a8c33af9"
}
```

```json
{
  "id": "3e6f4c22-8b67-4f70-b0b1-34069ceaca7a",
  "order_id": "81a7650e-39d2-4bf0-944c-40e8d1793e71",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c84dc8d9-b9b6-418e-bb5f-8230e1b9f979",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
  "command_id": "a94cf4cd-a6ec-4edd-bfe9-9ea581e141d4",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:15:33.990150238Z"
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
  "id": "c84dc8d9-b9b6-418e-bb5f-8230e1b9f979",
  "order_id": "81a7650e-39d2-4bf0-944c-40e8d1793e71",
  "assignment_id": "3e6f4c22-8b67-4f70-b0b1-34069ceaca7a",
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

`POST /api/driver/v1/work-sessions/4b6822ee-d464-4ca5-8a1c-c5d0fb107ccf/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:34Z",
    "sequence": 1793366134996
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4b6822ee-d464-4ca5-8a1c-c5d0fb107ccf",
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
  "last_heartbeat_at": "2026-10-30T13:15:35.024375Z",
  "last_location_at": "2026-10-30T13:15:35.024375Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/c84dc8d9-b9b6-418e-bb5f-8230e1b9f979/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "010174d6-c318-46ae-92a4-d72bd3f5c635",
  "expected_version": 0
}
```

```json
{
  "id": "c84dc8d9-b9b6-418e-bb5f-8230e1b9f979",
  "order_id": "81a7650e-39d2-4bf0-944c-40e8d1793e71",
  "assignment_id": "3e6f4c22-8b67-4f70-b0b1-34069ceaca7a",
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
  "arrived_at": "2026-10-30T13:15:35.376655Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c84dc8d9-b9b6-418e-bb5f-8230e1b9f979/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ff45069e-7943-4bb2-8830-a4b672511897",
  "expected_version": 1
}
```

```json
{
  "id": "c84dc8d9-b9b6-418e-bb5f-8230e1b9f979",
  "order_id": "81a7650e-39d2-4bf0-944c-40e8d1793e71",
  "assignment_id": "3e6f4c22-8b67-4f70-b0b1-34069ceaca7a",
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
  "arrived_at": "2026-10-30T13:15:35.376655Z",
  "started_at": "2026-10-30T13:15:35.692497Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c84dc8d9-b9b6-418e-bb5f-8230e1b9f979/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "17d2305a-dc17-42a8-b741-f3b647177cb3",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:15:35Z",
  "cash_received": true
}
```

```json
{
  "id": "c84dc8d9-b9b6-418e-bb5f-8230e1b9f979",
  "order_id": "81a7650e-39d2-4bf0-944c-40e8d1793e71",
  "assignment_id": "3e6f4c22-8b67-4f70-b0b1-34069ceaca7a",
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
  "arrived_at": "2026-10-30T13:15:35.376655Z",
  "started_at": "2026-10-30T13:15:35.692497Z",
  "completed_at": "2026-10-30T13:15:36.024553Z",
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
  "session_id": "4b6822ee-d464-4ca5-8a1c-c5d0fb107ccf",
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
  "last_heartbeat_at": "2026-10-30T13:15:35.024375Z",
  "last_location_at": "2026-10-30T13:15:35.024375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4b6822ee-d464-4ca5-8a1c-c5d0fb107ccf/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7c75e120-b029-44d9-a5f5-9a06756a4ec6",
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
  "command_id": "7e35944f-7bd5-4a40-b0f0-aa4480d4f230",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:36Z",
    "sequence": 1793366137844
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
  "correlation_id": "3e9789f7-7dd7-4780-b65b-566de83e25a5",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "422c13bc-3c13-4d34-b5b2-1dc63979113e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:37Z",
    "sequence": 1793366137845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2224bda3-a493-4658-9aca-253dad747bf4",
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
  "last_heartbeat_at": "2026-10-30T13:15:37.347379Z",
  "last_location_at": "2026-10-30T13:15:37.347379Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:15:33.99015Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "48dbf84e-87b5-452a-8bf7-e7b0a26c53f5",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:15:37.978821754Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2224bda3-a493-4658-9aca-253dad747bf4",
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
  "last_heartbeat_at": "2026-10-30T13:15:37.347379Z",
  "last_location_at": "2026-10-30T13:15:37.347379Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2224bda3-a493-4658-9aca-253dad747bf4/close` → **200**

```json
{
  "command_id": "027d744b-86ce-4d4a-ade4-29586e19972d",
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
  "session_id": "54c9d6b1-898c-4745-9feb-fadb9121fd77",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcwMzksImlhdCI6MTc5MzM2NjEzOSwianRpIjoiZjAzMDZhMWYtYjU0Yi00NjBhLTg1NDYtYTFmMDBhZTBkOGJmIiwic2lkIjoiNTRjOWQ2YjEtODk4Yy00NzQ1LTlmZWItZmFkYjkxMjFmZDc3In0.2vKr7_uKk7WZfyGdLT8j5YbzwMNs5zP5Zs1Dcgbmjq8",
  "access_expires_at": "2026-10-30T13:30:39.214021266Z",
  "refresh_token": "oBOwS31PZglm5kk6BXE37SnGjVLwYJ_Z2E1FHQMcZ2w",
  "refresh_expires_at": "2026-10-31T01:15:39.212893458Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "9c2a743c-2ba5-4dd8-b99e-4e77f6ae911c",
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
  "id": "62dfc145-6d9b-4965-a07e-a5401a0c3ff1",
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
  "created_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "created_at": "2026-10-30T13:15:39.526145Z",
  "updated_at": "2026-10-30T13:15:39.526145Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630025744",
  "device_ref": "sandbox-19969"
}
```

```json
{
  "challenge_id": "f3424255-969c-4925-802a-ba4a8aaa2c42",
  "expires_at": "2026-10-30T13:20:39.854304125Z",
  "resend_available_at": "2026-10-30T13:15:40.854304125Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630025744` → **200**

```json
{
  "phone": "+380630025744",
  "audience": "CLIENT",
  "code": "763835",
  "sent_at": "2026-10-30T13:15:39.860006675Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3424255-969c-4925-802a-ba4a8aaa2c42",
  "code": "763835",
  "device_ref": "sandbox-19969"
}
```

```json
{
  "session_id": "5efe360a-c01b-49f7-8766-30bd679b4708",
  "subject": {
    "type": "CLIENT",
    "id": "51f3755f-d4a7-4207-87dd-6d5240f47d1a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MWYzNzU1Zi1kNGE3LTQyMDctODdkZC02ZDUyNDBmNDdkMWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MDQwLCJpYXQiOjE3OTMzNjYxNDAsImp0aSI6Ijg2ZmE0MWY5LTZkNjktNDQ0Yi04MGRhLTI3NzcwMWI3NWMxMiIsInNpZCI6IjVlZmUzNjBhLWMwMWItNDlmNy04NzY2LTMwYmQ2NzliNDcwOCJ9.bzNPGtVK9Tu34-8S_IcmiaIGSfeswRbOZZE4oBX3so0",
  "access_expires_at": "2026-10-30T13:30:40.188924568Z",
  "refresh_token": "BW-3-xhVewZOi_ZDtsFPK6YPpA_rl8FjYyn8ejTkymM",
  "refresh_expires_at": "2026-11-29T13:15:40.187968304Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630025744` → **200**

```json
{
  "client_id": "51f3755f-d4a7-4207-87dd-6d5240f47d1a"
}
```

`POST /api/admin/v1/rider-wallets/51f3755f-d4a7-4207-87dd-6d5240f47d1a/top-ups` → **201**

```json
{
  "command_id": "1f443094-e248-4359-96a0-9b55a70d375c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "51f3755f-d4a7-4207-87dd-6d5240f47d1a",
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
      "id": "994219e8-c380-4391-aa4a-98c1dbade98f",
      "at": "2026-10-30T13:15:40.794105Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b06eca17-d71d-484c-9278-40d6b720b99c",
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
  "id": "03a16fa2-18f2-41bd-ba1b-b84de0df612d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:20:41.122063Z",
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
      "id": "62dfc145-6d9b-4965-a07e-a5401a0c3ff1",
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
  "device_ref": "sandbox-16349"
}
```

```json
{
  "challenge_id": "78983bf6-9dfa-4bdd-ba1d-9a378ed7044c",
  "expires_at": "2026-10-30T13:20:41.446424947Z",
  "resend_available_at": "2026-10-30T13:15:42.446424947Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "524192",
  "sent_at": "2026-10-30T13:15:41.451220183Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78983bf6-9dfa-4bdd-ba1d-9a378ed7044c",
  "code": "524192",
  "device_ref": "sandbox-16349"
}
```

```json
{
  "session_id": "a8cf3ca1-a0b6-4c58-bcd8-e29021b22d4d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA0MSwiaWF0IjoxNzkzMzY2MTQxLCJqdGkiOiI4MTJmYWM1ZC04Mzc0LTQ1MjctOTYzYS0zMGU2Y2MyMTJhNzAiLCJzaWQiOiJhOGNmM2NhMS1hMGI2LTRjNTgtYmNkOC1lMjkwMjFiMjJkNGQifQ.pxiF8aHLrUYfKRBckN6RyJ8L4gU_ZeZWh1t9qCln7yo",
  "access_expires_at": "2026-10-30T13:30:41.779286509Z",
  "refresh_token": "a6DtpSSVPe-lnRs_PbmqHPFrkeEio0X3TZOa7d6_l7w",
  "refresh_expires_at": "2026-11-29T13:15:41.778473467Z",
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
  "command_id": "db608f18-18e1-41c2-a4ce-d94b89dbb0b6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:42Z",
    "sequence": 1793366142393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cbabf05e-580b-4882-9035-837c5e762192",
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
  "last_heartbeat_at": "2026-10-30T13:15:42.415107Z",
  "last_location_at": "2026-10-30T13:15:42.415107Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "cb41b44d-8ec9-4320-bc64-658c2f25ac0e",
  "quote_id": "03a16fa2-18f2-41bd-ba1b-b84de0df612d",
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
  "id": "8867ddf6-bd75-461e-875f-c86d2ed959c3",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "51f3755f-d4a7-4207-87dd-6d5240f47d1a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:15:42.728689Z",
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
  "client_id": "51f3755f-d4a7-4207-87dd-6d5240f47d1a",
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
      "id": "994219e8-c380-4391-aa4a-98c1dbade98f",
      "at": "2026-10-30T13:15:40.794105Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
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
    "id": "c50fd98b-63b4-4fbd-84e6-aa7db164dd0f",
    "order_id": "8867ddf6-bd75-461e-875f-c86d2ed959c3",
    "expires_at": "2026-10-30T13:15:57.737251Z",
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

`POST /api/driver/v1/offers/c50fd98b-63b4-4fbd-84e6-aa7db164dd0f/accept` → **200**

```json
{
  "command_id": "3d098996-b37b-4852-a4d0-a8fe7e19a3ee"
}
```

```json
{
  "id": "8ae46468-2bf0-42c2-8fe5-796e59a9db21",
  "order_id": "8867ddf6-bd75-461e-875f-c86d2ed959c3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f75dbe22-3df2-4450-9e3f-7f60820891fb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f75dbe22-3df2-4450-9e3f-7f60820891fb",
  "order_id": "8867ddf6-bd75-461e-875f-c86d2ed959c3",
  "assignment_id": "8ae46468-2bf0-42c2-8fe5-796e59a9db21",
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

(the car drives 2 s to the next point)

`POST /api/driver/v1/work-sessions/cbabf05e-580b-4882-9035-837c5e762192/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:46Z",
    "sequence": 1793366146287
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cbabf05e-580b-4882-9035-837c5e762192",
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
  "last_heartbeat_at": "2026-10-30T13:15:46.308925Z",
  "last_location_at": "2026-10-30T13:15:46.308925Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f75dbe22-3df2-4450-9e3f-7f60820891fb/arrive` → **200**

```json
{
  "command_id": "2627df94-40eb-4c54-a1d1-41469da63839",
  "expected_version": 0
}
```

```json
{
  "id": "f75dbe22-3df2-4450-9e3f-7f60820891fb",
  "order_id": "8867ddf6-bd75-461e-875f-c86d2ed959c3",
  "assignment_id": "8ae46468-2bf0-42c2-8fe5-796e59a9db21",
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
  "arrived_at": "2026-10-30T13:15:46.62094Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f75dbe22-3df2-4450-9e3f-7f60820891fb/start` → **200**

```json
{
  "command_id": "f9d8d247-d10b-43c9-aab8-5228a19733e9",
  "expected_version": 1
}
```

```json
{
  "id": "f75dbe22-3df2-4450-9e3f-7f60820891fb",
  "order_id": "8867ddf6-bd75-461e-875f-c86d2ed959c3",
  "assignment_id": "8ae46468-2bf0-42c2-8fe5-796e59a9db21",
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
  "arrived_at": "2026-10-30T13:15:46.62094Z",
  "started_at": "2026-10-30T13:15:46.927586Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/f75dbe22-3df2-4450-9e3f-7f60820891fb/complete` → **200**

```json
{
  "command_id": "a5490183-7e1a-4ed4-a901-9a45d97c63dd",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:15:47Z",
  "cash_received": true
}
```

```json
{
  "id": "f75dbe22-3df2-4450-9e3f-7f60820891fb",
  "order_id": "8867ddf6-bd75-461e-875f-c86d2ed959c3",
  "assignment_id": "8ae46468-2bf0-42c2-8fe5-796e59a9db21",
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
  "arrived_at": "2026-10-30T13:15:46.62094Z",
  "started_at": "2026-10-30T13:15:46.927586Z",
  "completed_at": "2026-10-30T13:15:47.263893Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "51f3755f-d4a7-4207-87dd-6d5240f47d1a",
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
      "id": "7cd225ef-217d-4f77-a5d1-56a69c18e09e",
      "at": "2026-10-30T13:15:47.465251Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "8867ddf6-bd75-461e-875f-c86d2ed959c3"
    },
    {
      "id": "994219e8-c380-4391-aa4a-98c1dbade98f",
      "at": "2026-10-30T13:15:40.794105Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/62dfc145-6d9b-4965-a07e-a5401a0c3ff1/archive` → **200**

```json
{
  "command_id": "f1adf20e-e287-4040-8386-316c0545ffa8",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "62dfc145-6d9b-4965-a07e-a5401a0c3ff1",
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
  "created_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "created_at": "2026-10-30T13:15:39.526145Z",
  "updated_at": "2026-10-30T13:15:50.915907Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cbabf05e-580b-4882-9035-837c5e762192",
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
  "last_heartbeat_at": "2026-10-30T13:15:46.308925Z",
  "last_location_at": "2026-10-30T13:15:46.308925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cbabf05e-580b-4882-9035-837c5e762192/close` → **200**

```json
{
  "command_id": "08f0b308-2e16-4a4f-90bc-81911bcdf0ab",
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

Done: order 8867ddf6-bd75-461e-875f-c86d2ed959c3.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-1338"
}
```

```json
{
  "challenge_id": "a9c79b73-41ea-427b-b847-0816543ddaa2",
  "expires_at": "2026-10-30T13:20:51.841314542Z",
  "resend_available_at": "2026-10-30T13:15:52.841314542Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "288314",
  "sent_at": "2026-10-30T13:15:51.846181337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9c79b73-41ea-427b-b847-0816543ddaa2",
  "code": "288314",
  "device_ref": "sandbox-1338"
}
```

```json
{
  "session_id": "b2750536-13d1-468e-bb61-e3885ad8d042",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA1MiwiaWF0IjoxNzkzMzY2MTUyLCJqdGkiOiJiZWQ4MDgyYy03YWYyLTQzNWMtODYxNC1jNWI4OTgwMGVhYmUiLCJzaWQiOiJiMjc1MDUzNi0xM2QxLTQ2OGUtYmI2MS1lMzg4NWFkOGQwNDIifQ.YIjOFoGb9O1SXbQ1g8Yjs-2OOVt10gP7n3YvXZ_wnPQ",
  "access_expires_at": "2026-10-30T13:30:52.169942982Z",
  "refresh_token": "B3b-J0KNsOoB0Z1dt9HRHIPHPai3iwPIDzEo-OoN_-o",
  "refresh_expires_at": "2026-11-29T13:15:52.169172942Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "command_id": "40dfbe99-18b1-4c99-986f-8ad8ed3c28c8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:53Z",
    "sequence": 1793366153678
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "6f0e75be-4ab2-4d04-b72c-9d8608b85dd3",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T13:15:53.090549Z",
  "last_location_at": "2026-10-30T13:15:53.090549Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/6f0e75be-4ab2-4d04-b72c-9d8608b85dd3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:58Z",
    "sequence": 1793366158400
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "6f0e75be-4ab2-4d04-b72c-9d8608b85dd3",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T13:15:58.421386Z",
  "last_location_at": "2026-10-30T13:15:53.090549Z",
  "eligible": false,
  "ineligible_reasons": [
    "LOCATION_STALE"
  ],
  "accepted": false
}
```

## The operator's map still shows her in Warsaw

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
  "session_id": "6c7a6dd4-a9b3-44c6-8d19-e307b81c1063",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcwNTksImlhdCI6MTc5MzM2NjE1OSwianRpIjoiMDZkNDFkNjAtYmM4NS00ZmFkLThkOTgtN2M3YTQwNjRjNGI3Iiwic2lkIjoiNmM3YTZkZDQtYTliMy00NGM2LThkMTktZTMwN2I4MWMxMDYzIn0.7o8JQi9ViXbcQIm9J5taTX7mL87axi0Jr1AZpn5Bmnc",
  "access_expires_at": "2026-10-30T13:30:59.028022396Z",
  "refresh_token": "sVLx8xj9aTfM3gkvenscpHtkGy9YzBNG4yuEyA85pSQ",
  "refresh_expires_at": "2026-10-31T01:15:59.027154411Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T13:15:59.327464182Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000405",
      "name": "Anna Wiśniewska",
      "car": {
        "registration_number": "WA0002T",
        "make": "Kia",
        "model": "Ceed",
        "color": "blue",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "STALE",
      "location": {
        "lat": 52.2297,
        "lon": 21.0122
      },
      "last_location_at": "2026-10-30T13:15:53.090549Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/6f0e75be-4ab2-4d04-b72c-9d8608b85dd3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:15:59Z",
    "sequence": 1793366159633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "6f0e75be-4ab2-4d04-b72c-9d8608b85dd3",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T13:15:59.654885Z",
  "last_location_at": "2026-10-30T13:15:59.654885Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

Done: the jump to Lviv was refused, the map kept Warsaw, the next plausible fix was accepted.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "6f0e75be-4ab2-4d04-b72c-9d8608b85dd3",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T13:15:59.654885Z",
  "last_location_at": "2026-10-30T13:15:59.654885Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6f0e75be-4ab2-4d04-b72c-9d8608b85dd3/close` → **200**

```json
{
  "command_id": "69141329-a041-4b05-9ac8-8f97497e63c1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

# Scenario: broadcast-claims

## Nobody is online in Warsaw; Piotr signs in on two phones, Anna goes online 10 km from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-15674"
}
```

```json
{
  "challenge_id": "3ec30417-9344-4183-ab1e-bfed39d55ba4",
  "expires_at": "2026-10-30T13:21:00.593119917Z",
  "resend_available_at": "2026-10-30T13:16:01.593119917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "879680",
  "sent_at": "2026-10-30T13:16:00.597458178Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ec30417-9344-4183-ab1e-bfed39d55ba4",
  "code": "879680",
  "device_ref": "sandbox-15674"
}
```

```json
{
  "session_id": "d763d9c4-1660-4561-995c-c3c3b5149941",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA2MCwiaWF0IjoxNzkzMzY2MTYwLCJqdGkiOiJlZjg2NzRmOC0xZjAwLTQyZmYtOGQ3OS1jMGU0ZmYwNzg2ODgiLCJzaWQiOiJkNzYzZDljNC0xNjYwLTQ1NjEtOTk1Yy1jM2MzYjUxNDk5NDEifQ.5SDc5OqqmqT2M07WYn9m7ZFIUHObooTXci2LnwBPK3o",
  "access_expires_at": "2026-10-30T13:31:00.934195127Z",
  "refresh_token": "jf9sBZsQYRCDuiAXrI2mGvhbM0BDgr7IJu9JTYyz894",
  "refresh_expires_at": "2026-11-29T13:16:00.933304215Z",
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

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-30883"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "56ec3aa0-104e-4c9e-bd2b-2cb8a81b390f",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-30883"
}
```

```json
{
  "challenge_id": "f150b838-260f-4226-ac6d-03adcb3199a3",
  "expires_at": "2026-10-30T13:21:02.832529802Z",
  "resend_available_at": "2026-10-30T13:16:03.832529802Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "142176",
  "sent_at": "2026-10-30T13:16:02.836426193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f150b838-260f-4226-ac6d-03adcb3199a3",
  "code": "142176",
  "device_ref": "sandbox-30883"
}
```

```json
{
  "session_id": "4f95b35c-2780-48ff-b52b-456a044e2834",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA2MywiaWF0IjoxNzkzMzY2MTYzLCJqdGkiOiIyZTU5NmM0Yi05NGY1LTQxMTAtOGQwOC04NDczYzY1OTQ4MzgiLCJzaWQiOiI0Zjk1YjM1Yy0yNzgwLTQ4ZmYtYjUyYi00NTZhMDQ0ZTI4MzQifQ.muOKgSvD7uErBnXieRb1ePL5A_YhfjQYd3c8W8v9sv0",
  "access_expires_at": "2026-10-30T13:31:03.147305583Z",
  "refresh_token": "9uskBElgZXLvnh49_wDAV6-asNeBgrjxwLOmrPeIm4s",
  "refresh_expires_at": "2026-11-29T13:16:03.146461307Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-20081"
}
```

```json
{
  "challenge_id": "953820b5-a074-42a0-8679-bc53e5a2f323",
  "expires_at": "2026-10-30T13:21:03.446029937Z",
  "resend_available_at": "2026-10-30T13:16:04.446029937Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "202767",
  "sent_at": "2026-10-30T13:16:03.450095722Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "953820b5-a074-42a0-8679-bc53e5a2f323",
  "code": "202767",
  "device_ref": "sandbox-20081"
}
```

```json
{
  "session_id": "ec6d3ced-ce25-4bbe-a745-f4feb53c016e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzA2MywiaWF0IjoxNzkzMzY2MTYzLCJqdGkiOiIxNDVhODU1Mi03YjFhLTRmYzEtYjExMi1lNTJiNmQ1ZDk2NzgiLCJzaWQiOiJlYzZkM2NlZC1jZTI1LTRiYmUtYTc0NS1mNGZlYjUzYzAxNmUifQ.80UJCjbL10bXG1G8GY93c2Q8o4kNDXDHgSkmlWcvjOo",
  "access_expires_at": "2026-10-30T13:31:03.780432213Z",
  "refresh_token": "rnQ-EiCquVItolFkk-aLGpvl8hfIHGM4g0VzUQtZyWA",
  "refresh_expires_at": "2026-11-29T13:16:03.779791239Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
  "vehicle_id": null,
  "last_heartbeat_at": null,
  "last_location_at": null,
  "eligible": false,
  "ineligible_reasons": [
    "NO_OPEN_SESSION"
  ]
}
```

(the car drives 183 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "bf3cf153-7eb2-46db-b487-2f1f44e5c821",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:07Z",
    "sequence": 1793366347693
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "ded13c06-9923-47a4-9b88-deda21f2631f",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T13:19:07.715319Z",
  "last_location_at": "2026-10-30T13:19:07.715319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600603476",
  "device_ref": "sandbox-13111"
}
```

```json
{
  "challenge_id": "820f5687-6271-4903-9973-79bed403e631",
  "expires_at": "2026-10-30T13:24:08.023138071Z",
  "resend_available_at": "2026-10-30T13:19:09.023138071Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600603476` → **200**

```json
{
  "phone": "+48600603476",
  "audience": "CLIENT",
  "code": "190022",
  "sent_at": "2026-10-30T13:19:08.027055918Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "820f5687-6271-4903-9973-79bed403e631",
  "code": "190022",
  "device_ref": "sandbox-13111"
}
```

```json
{
  "session_id": "d0f44a6d-6c84-4119-a37a-c3c190367e52",
  "subject": {
    "type": "CLIENT",
    "id": "deec2f82-6d54-44d4-8599-bbf60229dabc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZWVjMmY4Mi02ZDU0LTQ0ZDQtODU5OS1iYmY2MDIyOWRhYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjQ4LCJpYXQiOjE3OTMzNjYzNDgsImp0aSI6ImJkYzY4ZjA0LTA0ZDQtNGY3My1iNzk3LTZjOWI0OGE1MDAyMiIsInNpZCI6ImQwZjQ0YTZkLTZjODQtNDExOS1hMzdhLWMzYzE5MDM2N2U1MiJ9.Io5rB51kMbUPuYHu7zrD34JjhLGu-2j1Fpm1AyJxnfc",
  "access_expires_at": "2026-10-30T13:34:08.361900168Z",
  "refresh_token": "KNxDadBHd_cmMIFZ5zbZeDR125MTPKkkKTCpo6GAY_E",
  "refresh_expires_at": "2026-11-29T13:19:08.361097796Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5d9ff250-7418-4a38-9157-684480e8ef34",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  }
}
```

```json
{
  "id": "e7c47b8b-8351-4d00-a6fd-c85a6429b93c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:08.665940Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 4942,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4988ece2-67f7-47a2-b4b1-423448dc9570",
  "quote_id": "e7c47b8b-8351-4d00-a6fd-c85a6429b93c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH"
}
```

```json
{
  "id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "deec2f82-6d54-44d4-8599-bbf60229dabc",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:19:08.984662Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9f955aad-c0e2-445c-bc17-8e4a45d13d98` → **200**

```json
{
  "id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "deec2f82-6d54-44d4-8599-bbf60229dabc",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:19:08.984662Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Anna, 10 km away, does not see it, and her claim is refused: the order stays in the ALL tab

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[]
```

`POST /api/driver/v1/orders/9f955aad-c0e2-445c-bc17-8e4a45d13d98/claim` → **422**

```json
{
  "command_id": "d351b7ab-710f-433b-a2bf-13e3640fa670"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9f955aad-c0e2-445c-bc17-8e4a45d13d98/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "69f077c7-5157-4a89-a35a-c7df441475db"
}
```

`GET /api/rider/v1/orders/9f955aad-c0e2-445c-bc17-8e4a45d13d98` → **200**

```json
{
  "id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "deec2f82-6d54-44d4-8599-bbf60229dabc",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:19:08.984662Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A script on Anna's phone keeps claiming: from the 31st claim in 10 minutes, 429

`POST /api/driver/v1/orders/409ba35d-a214-49c1-8be0-6fb6a1e79330/claim` → **404**

```json
{
  "command_id": "6e030fa3-b9eb-444d-ad8c-4301477c77c7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/409ba35d-a214-49c1-8be0-6fb6a1e79330/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c4379b49-e725-4894-bbd2-3a0aeee3cf31"
}
```

`POST /api/driver/v1/orders/6551c3bf-1638-4c41-add1-323dc9ef1984/claim` → **404**

```json
{
  "command_id": "61458732-fd58-4240-86ec-1f691a3f22e5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6551c3bf-1638-4c41-add1-323dc9ef1984/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d90bd92a-c320-4f9f-9fda-f03b382fa056"
}
```

`POST /api/driver/v1/orders/dd8691b4-4bad-4ae0-995e-f2a50c6db5b7/claim` → **404**

```json
{
  "command_id": "c1ca20b0-e076-4a66-b6ad-5abdfb5e59fc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/dd8691b4-4bad-4ae0-995e-f2a50c6db5b7/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "87d8814e-f0c3-40dd-bb0c-47e072674a3f"
}
```

`POST /api/driver/v1/orders/4476cbe8-429f-49da-a978-44f200e0b662/claim` → **404**

```json
{
  "command_id": "5d9f216a-b304-4f61-aa19-deb181c5fa87"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4476cbe8-429f-49da-a978-44f200e0b662/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d69e0c61-6c45-482c-a102-25bc5d8effd8"
}
```

`POST /api/driver/v1/orders/de23a987-295a-432f-ae47-7b5c49dbd342/claim` → **404**

```json
{
  "command_id": "e0d5cd4c-724e-445d-ba05-2c146550e01f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/de23a987-295a-432f-ae47-7b5c49dbd342/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9a44be54-27e4-4a37-a52c-e4cdde7ad476"
}
```

`POST /api/driver/v1/orders/92f37f3f-12a6-44d1-9d42-f23987316977/claim` → **404**

```json
{
  "command_id": "dd5f2c40-9298-4fad-9f47-b18708697b70"
}
```

```json
{
  "instance": "/api/driver/v1/orders/92f37f3f-12a6-44d1-9d42-f23987316977/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "521a2ee6-97e7-4002-a0d6-bd689c1c4158"
}
```

`POST /api/driver/v1/orders/38546c1f-a8e2-4732-801f-a3e4051e49b8/claim` → **404**

```json
{
  "command_id": "351066d8-8572-4d98-b60e-ca2b27dfeeee"
}
```

```json
{
  "instance": "/api/driver/v1/orders/38546c1f-a8e2-4732-801f-a3e4051e49b8/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f9efb0dd-dff3-4d3d-992f-462d77c6af8a"
}
```

`POST /api/driver/v1/orders/10fe7169-c8b8-4c90-8c9e-7b394ff745bb/claim` → **404**

```json
{
  "command_id": "94697fcb-b411-40a3-8955-e0afcc4d1390"
}
```

```json
{
  "instance": "/api/driver/v1/orders/10fe7169-c8b8-4c90-8c9e-7b394ff745bb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "93bd3057-ba38-4cef-bbab-e85b12108307"
}
```

`POST /api/driver/v1/orders/44c0a1df-acdf-444f-b9aa-8a5ef916b0a0/claim` → **404**

```json
{
  "command_id": "358f6bd6-8e93-4bb8-9173-24a9fe50f0b2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/44c0a1df-acdf-444f-b9aa-8a5ef916b0a0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7b5634b6-25b4-4e1d-ac78-0623f7729ce0"
}
```

`POST /api/driver/v1/orders/4fa57716-8649-42ad-bac0-a739dab5c58e/claim` → **404**

```json
{
  "command_id": "fe86cced-2ec4-4575-b317-e7d22c03ae09"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4fa57716-8649-42ad-bac0-a739dab5c58e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c9d0611a-dae9-470d-925d-7f378796f251"
}
```

`POST /api/driver/v1/orders/2086db51-e2ea-4acb-af03-28d9447527ce/claim` → **404**

```json
{
  "command_id": "3f1ac1cc-3ef7-4298-847f-6709b5fbc039"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2086db51-e2ea-4acb-af03-28d9447527ce/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a2d6193e-53c7-4bf1-9691-dfdb2462419c"
}
```

`POST /api/driver/v1/orders/3837ea5c-a1b2-4ccf-9c8b-11eb7c54755f/claim` → **404**

```json
{
  "command_id": "accb62b3-c9c0-43e2-afa1-f1021ee6aca1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3837ea5c-a1b2-4ccf-9c8b-11eb7c54755f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fcc1389e-ae7b-4fc8-b942-541a9bbcb9af"
}
```

`POST /api/driver/v1/orders/6c6df102-229c-41d2-b55f-83bb09fb2534/claim` → **404**

```json
{
  "command_id": "128e1765-8f8a-4e64-a9c5-fae182687a7e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6c6df102-229c-41d2-b55f-83bb09fb2534/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bdfb5a4d-2213-4a82-8c0e-831723630f91"
}
```

`POST /api/driver/v1/orders/e9049312-e864-4543-b84e-58ccbd70dab4/claim` → **404**

```json
{
  "command_id": "2c9f0dc4-227e-4bae-b9d4-a137c6a6f2d9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e9049312-e864-4543-b84e-58ccbd70dab4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "badb652c-bdb7-4c9e-a83d-60e11e2e01d9"
}
```

`POST /api/driver/v1/orders/ab5aaa00-a81d-48cf-97aa-b301ee01af1f/claim` → **404**

```json
{
  "command_id": "c4ebf673-d1fd-4c04-beb0-79be4d8a6f11"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ab5aaa00-a81d-48cf-97aa-b301ee01af1f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1061620a-483b-4fa4-afb3-cf13cdaddde5"
}
```

`POST /api/driver/v1/orders/d0d41bd6-c514-4fe1-90fd-99b84713b0c3/claim` → **404**

```json
{
  "command_id": "11637415-7955-4200-bd44-e07045c1c0f7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d0d41bd6-c514-4fe1-90fd-99b84713b0c3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9e5c131b-10aa-417c-aa90-f18e842789ad"
}
```

`POST /api/driver/v1/orders/fb4e86d2-d3ff-4473-be5b-2b49935b9f37/claim` → **404**

```json
{
  "command_id": "962b0f8d-8f41-4a9c-bf36-738648cf296c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/fb4e86d2-d3ff-4473-be5b-2b49935b9f37/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1f7866d7-a542-4f4b-a5f1-a055ba81ab52"
}
```

`POST /api/driver/v1/orders/3eebc05c-1e6c-443d-b4f4-9fbb191d5dac/claim` → **404**

```json
{
  "command_id": "14703096-8fc9-4416-bd65-4157c42c0000"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3eebc05c-1e6c-443d-b4f4-9fbb191d5dac/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f8b5ce0e-6056-4d44-9b10-19a78a95c6ee"
}
```

`POST /api/driver/v1/orders/766a0363-0d02-4e24-9c57-c912672abf7d/claim` → **404**

```json
{
  "command_id": "7ce497dd-7de9-4a05-aad2-1000e90ca24a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/766a0363-0d02-4e24-9c57-c912672abf7d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d089ad5a-88bb-490f-9e4d-a799ea809903"
}
```

`POST /api/driver/v1/orders/663ddd28-1357-41d0-aeb0-0b079324cd72/claim` → **404**

```json
{
  "command_id": "8d39b5f2-6524-4530-896b-f05051915314"
}
```

```json
{
  "instance": "/api/driver/v1/orders/663ddd28-1357-41d0-aeb0-0b079324cd72/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4649304a-bd07-41e2-830d-a9dbe06a8b8d"
}
```

`POST /api/driver/v1/orders/37dd7070-c3fe-4650-9f77-020a61e2cbe3/claim` → **404**

```json
{
  "command_id": "6c368b42-28b4-437c-a690-649fe5f91190"
}
```

```json
{
  "instance": "/api/driver/v1/orders/37dd7070-c3fe-4650-9f77-020a61e2cbe3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9912dfe6-52fd-4001-9a3f-9ef9c33282ff"
}
```

`POST /api/driver/v1/orders/44636c10-41b4-4cae-a60f-7368f095a262/claim` → **404**

```json
{
  "command_id": "51ec63a6-b991-45cc-a290-9f57be4b41a2"
}
```

```json
{
  "instance": "/api/driver/v1/orders/44636c10-41b4-4cae-a60f-7368f095a262/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4106df51-1a8b-4759-8095-dc8782f4a9aa"
}
```

`POST /api/driver/v1/orders/f766fc82-fee1-4c96-9943-56ca15d5f96d/claim` → **404**

```json
{
  "command_id": "666e7a01-e5a8-4e76-8b10-33cbcb3af251"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f766fc82-fee1-4c96-9943-56ca15d5f96d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b6ab8e2b-1083-4597-af68-2cef9ad618c4"
}
```

`POST /api/driver/v1/orders/81b83196-62de-4cf9-996b-b453a565ef25/claim` → **404**

```json
{
  "command_id": "a31423b9-5d59-492c-880a-74c204b9cf5b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/81b83196-62de-4cf9-996b-b453a565ef25/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4cd00f64-df41-4c51-a94d-df044c6a140f"
}
```

`POST /api/driver/v1/orders/b539f183-b671-4b8b-a5ae-b207ab018f6d/claim` → **404**

```json
{
  "command_id": "fdccdb97-5db4-48b7-b6a7-d8cdba3b3430"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b539f183-b671-4b8b-a5ae-b207ab018f6d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c36da361-5796-46b1-97ff-2964b86424a5"
}
```

`POST /api/driver/v1/orders/937e7927-11c0-4fc2-b758-7e06775e1d53/claim` → **404**

```json
{
  "command_id": "b50bc73e-480b-4f8a-883a-a54ac2f12572"
}
```

```json
{
  "instance": "/api/driver/v1/orders/937e7927-11c0-4fc2-b758-7e06775e1d53/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e414b1b3-b2ec-4f8b-8486-d95d093952a9"
}
```

`POST /api/driver/v1/orders/262c5275-f5a9-4f7f-97f7-3004fccc4e7a/claim` → **404**

```json
{
  "command_id": "4299362f-de2b-4dba-a9f6-1e7206daf076"
}
```

```json
{
  "instance": "/api/driver/v1/orders/262c5275-f5a9-4f7f-97f7-3004fccc4e7a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e58fe3be-bd20-47db-8a92-dc950540b303"
}
```

`POST /api/driver/v1/orders/626c5f26-5128-4bff-bd53-5c84b1b98f4f/claim` → **404**

```json
{
  "command_id": "51b6256d-402e-43c5-b4c4-223f51d4bd34"
}
```

```json
{
  "instance": "/api/driver/v1/orders/626c5f26-5128-4bff-bd53-5c84b1b98f4f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c3682f59-b3f7-449b-ad29-0c5980d31c14"
}
```

`POST /api/driver/v1/orders/4eabf7c5-67f2-40ba-b63e-4225fbe4b924/claim` → **404**

```json
{
  "command_id": "a0ef3d91-7b58-4973-b5e0-096778f28acb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4eabf7c5-67f2-40ba-b63e-4225fbe4b924/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "36bba285-1ce1-48f6-bc79-dfa90bfee7fe"
}
```

`POST /api/driver/v1/orders/81443c0b-9240-42bf-98d2-ab1bd8620acd/claim` → **429**

```json
{
  "command_id": "a125d203-db99-489d-b094-cd43a7b59286"
}
```

```json
{
  "instance": "/api/driver/v1/orders/81443c0b-9240-42bf-98d2-ab1bd8620acd/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "e9271f73-e484-402d-82ff-8a5a02a457a1",
  "retryable": true,
  "retry_after_seconds": 591
}
```

## Piotr goes online next to the pickup on his phone; his other phone cannot claim, the phone with the shift can

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
  "command_id": "6b775283-871e-4638-9566-8a17c48ac0c1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:20Z",
    "sequence": 1793366360299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0fd8e6ef-f93a-49a3-a3ee-1fbb29cb44e9",
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
  "last_heartbeat_at": "2026-10-30T13:19:20.321184Z",
  "last_location_at": "2026-10-30T13:19:20.321184Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 52.2297,
      "lon": 21.0122
    },
    "pickup_label": "PKiN",
    "dropoff_label": "Lotnisko",
    "payment_method": "CASH",
    "price_minor": 4942,
    "currency": "PLN",
    "distance_m": 590
  }
]
```

`POST /api/driver/v1/orders/9f955aad-c0e2-445c-bc17-8e4a45d13d98/claim` → **409**

```json
{
  "command_id": "3e187c1d-b9da-48e2-811e-b8989da393b5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9f955aad-c0e2-445c-bc17-8e4a45d13d98/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f877b70a-1e8b-4ca3-962b-5c2eacb44537"
}
```

`POST /api/driver/v1/orders/9f955aad-c0e2-445c-bc17-8e4a45d13d98/claim` → **200**

```json
{
  "command_id": "08184510-38e3-4baa-9178-81c2f2ab0670"
}
```

```json
{
  "id": "af0b9c01-a258-44ef-8115-0fe53eb04535",
  "order_id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "94bfe730-1bef-408d-b00a-bf55db07727d",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "94bfe730-1bef-408d-b00a-bf55db07727d",
  "order_id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
  "assignment_id": "af0b9c01-a258-44ef-8115-0fe53eb04535",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "price_minor": 4942,
  "currency": "PLN",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/94bfe730-1bef-408d-b00a-bf55db07727d/cancel` → **200**

```json
{
  "command_id": "85867938-bbd8-4d9e-8f63-187e253a14cc",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "94bfe730-1bef-408d-b00a-bf55db07727d",
  "order_id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
  "assignment_id": "af0b9c01-a258-44ef-8115-0fe53eb04535",
  "phase": "ABORTED",
  "version": 1,
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "price_minor": 4942,
  "currency": "PLN",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: far claim 422, the 31st claim 429, the phone without the shift 409, the phone with it took the order.

`GET /api/rider/v1/orders/9f955aad-c0e2-445c-bc17-8e4a45d13d98` → **200**

```json
{
  "id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "deec2f82-6d54-44d4-8599-bbf60229dabc",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "PKiN",
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "dropoff_label": "Lotnisko",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 4942,
  "final_price_minor": null,
  "currency": "PLN",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "af0b9c01-a258-44ef-8115-0fe53eb04535",
    "order_id": "9f955aad-c0e2-445c-bc17-8e4a45d13d98",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "94bfe730-1bef-408d-b00a-bf55db07727d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:19:08.984662Z",
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
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "ded13c06-9923-47a4-9b88-deda21f2631f",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "last_heartbeat_at": "2026-10-30T13:19:07.715319Z",
  "last_location_at": "2026-10-30T13:19:07.715319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ded13c06-9923-47a4-9b88-deda21f2631f/close` → **200**

```json
{
  "command_id": "f9045e6d-37b0-47d0-9495-46fc600c51a3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0fd8e6ef-f93a-49a3-a3ee-1fbb29cb44e9",
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
  "last_heartbeat_at": "2026-10-30T13:19:20.321184Z",
  "last_location_at": "2026-10-30T13:19:20.321184Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0fd8e6ef-f93a-49a3-a3ee-1fbb29cb44e9/close` → **200**

```json
{
  "command_id": "f7388b5f-7235-498d-bdac-db0d10cd6531",
  "expected_version": 0
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
  "session_id": "4fe49d8e-d853-433c-98f5-0d18a7067c5a",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNjQsImlhdCI6MTc5MzM2NjM2NCwianRpIjoiMWM4NDU5MTQtZmNmMi00ODVmLThmODItYTY4YjhhMDliNWFiIiwic2lkIjoiNGZlNDlkOGUtZDg1My00MzNjLTk4ZjUtMGQxOGE3MDY3YzVhIn0.i62zDNJUJ73yap_2xY-Qxhoxaa4IYtWfN74KDjJP3R4",
  "access_expires_at": "2026-10-30T13:34:24.0341575Z",
  "refresh_token": "egtghs4Jz3iVgNeeRXYpdfl0wv5qYHC4NV_SKFnAebs",
  "refresh_expires_at": "2026-10-31T01:19:24.0335029Z",
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
  "command_id": "21693be7-bc11-4ee2-97f0-c63ceebb1c10",
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
  "session_id": "14bf4984-311e-44ed-aa0d-d9b62dee2d2e",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNjUsImlhdCI6MTc5MzM2NjM2NSwianRpIjoiMTk2Y2FlMTgtMDRjMi00YTgxLTgyM2EtY2Y3OTQ2YjIyOGE2Iiwic2lkIjoiMTRiZjQ5ODQtMzExZS00NGVkLWFhMGQtZDliNjJkZWUyZDJlIn0.AtmmR0MqX3g3IG-fMWZwVFi8IMhZuxEwD_49sH-kJ_w",
  "access_expires_at": "2026-10-30T13:34:25.242506099Z",
  "refresh_token": "09ySo-MQe_LRgB6EwU4kcugmk_rL59jsSLPQNV7qSyY",
  "refresh_expires_at": "2026-10-31T01:19:25.241712541Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.111307330",
    "linkedid": "1730052700.111307330",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679194454"
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
    "id": "1730052700.111307330",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "d9b8d6d6-bb33-4913-95fc-f680eff74904",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679194454",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:19:25.547695Z",
      "answered_at": null,
      "ended_at": "2026-10-30T13:19:25.57401Z",
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
    "id": "1730052600.1358726501",
    "linkedid": "1730052600.1358726501",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679194454"
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
      "id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679194454",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:19:25.919073Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/07959fae-e559-4a2e-8f50-1270e4e32d17/answer` → **200**

```json
{
  "command_id": "8f6d9e68-491e-43c8-9027-84472655ba54"
}
```

```json
{
  "id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679194454",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "order_ids": [],
  "started_at": "2026-10-30T13:19:25.919073Z",
  "answered_at": "2026-10-30T13:19:26.26213Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1358726501",
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
    "id": "1730052600.1358726501",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679194454",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [],
      "started_at": "2026-10-30T13:19:25.919073Z",
      "answered_at": "2026-10-30T13:19:26.26213Z",
      "ended_at": "2026-10-30T13:19:26.588284Z",
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
      "id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679194454",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [],
      "started_at": "2026-10-30T13:19:25.919073Z",
      "answered_at": "2026-10-30T13:19:26.26213Z",
      "ended_at": "2026-10-30T13:19:26.588284Z",
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
      "id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679194454",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [],
      "started_at": "2026-10-30T13:19:25.919073Z",
      "answered_at": "2026-10-30T13:19:26.26213Z",
      "ended_at": "2026-10-30T13:19:26.588284Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:19:29.142181Z"
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
      "id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679194454",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [],
      "started_at": "2026-10-30T13:19:25.919073Z",
      "answered_at": "2026-10-30T13:19:26.26213Z",
      "ended_at": "2026-10-30T13:19:26.588284Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:19:29.142181Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/07959fae-e559-4a2e-8f50-1270e4e32d17/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/07959fae-e559-4a2e-8f50-1270e4e32d17/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=07959fae-e559-4a2e-8f50-1270e4e32d17` → **200**

```json
{
  "changes": [
    {
      "id": "b447be8b-e5ab-4bcf-91c6-c98250f2df38",
      "occurred_at": "2026-10-30T13:19:31.911953Z",
      "actor_type": "STAFF",
      "actor_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"ced7bf6b-d58d-411b-b89b-0476c17b6ae4\", \"order_ids\": []}",
      "correlation_id": "1d9f8c7e-4cbe-4cb8-895b-ceccf7364ee2"
    },
    {
      "id": "69c7b865-45fa-46c1-9065-784c73a02d4d",
      "occurred_at": "2026-10-30T13:19:31.875053Z",
      "actor_type": "STAFF",
      "actor_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"ced7bf6b-d58d-411b-b89b-0476c17b6ae4\", \"order_ids\": []}",
      "correlation_id": "79b7a037-7265-4d60-bfb8-02f94884d308"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 07959fae-e559-4a2e-8f50-1270e4e32d17 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4989"
}
```

```json
{
  "challenge_id": "eb818fc7-9f7c-4663-a052-8991830122c8",
  "expires_at": "2026-10-30T13:24:32.270119715Z",
  "resend_available_at": "2026-10-30T13:19:33.270119715Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "840907",
  "sent_at": "2026-10-30T13:19:32.273808684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb818fc7-9f7c-4663-a052-8991830122c8",
  "code": "840907",
  "device_ref": "sandbox-4989"
}
```

```json
{
  "session_id": "4aa1ef09-0bb5-4685-8b1b-ab9f7db24300",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzI3MiwiaWF0IjoxNzkzMzY2MzcyLCJqdGkiOiIwYjMyZmU1MC04YjI4LTRhZDMtYjMxYy0wZWY1NjRlZGVjZDUiLCJzaWQiOiI0YWExZWYwOS0wYmI1LTQ2ODUtOGIxYi1hYjlmN2RiMjQzMDAifQ.qcXwY-6hfuVwIOy7MHYkcNwtSZbpcDYOdVggjlJfQZw",
  "access_expires_at": "2026-10-30T13:34:32.602153118Z",
  "refresh_token": "7gA-1jz3YqOhk0FSnhUOyvk1JofgNxYEoHWpfo5vFFY",
  "refresh_expires_at": "2026-11-29T13:19:32.601501375Z",
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
  "command_id": "b82c2824-ade5-4003-9049-b2903c7cdf7c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:33Z",
    "sequence": 1793366373250
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1f3953b-40e1-49e4-8314-0288baf2d116",
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
  "last_heartbeat_at": "2026-10-30T13:19:33.27161Z",
  "last_location_at": "2026-10-30T13:19:33.27161Z",
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
  "session_id": "a13bc750-2573-4f90-8193-0beff80dcc4b",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyNzMsImlhdCI6MTc5MzM2NjM3MywianRpIjoiZWRmNTUyZTItN2I5Yy00YmNjLWE2OWItM2VjMWUxNWM1NzAwIiwic2lkIjoiYTEzYmM3NTAtMjU3My00ZjkwLTgxOTMtMGJlZmY4MGRjYzRiIn0.jp9n6ZJAnZYaj3NJ5E18tEtsvF1Ap0un5pSpwn4Oplo",
  "access_expires_at": "2026-10-30T13:34:33.876102247Z",
  "refresh_token": "Jd-6WtQDD8H-sfhazdKSbrTdMWdhHqE2byBy5jcKelY",
  "refresh_expires_at": "2026-10-31T01:19:33.87545894Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "50d9b30d-ba25-4fa4-be54-2414b955301c",
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
  "id": "cbe8e027-4b0c-4552-80b6-5ae8acd56a9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:34.189102Z",
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
  "command_id": "c7a36cfe-01ac-4445-9ccb-c7fe2e09092c",
  "quote_id": "cbe8e027-4b0c-4552-80b6-5ae8acd56a9b",
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
    "phone": "+380675189890"
  }
}
```

```json
{
  "id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
  "short_number": 4,
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
  "created_at": "2026-10-30T13:19:34.527492Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675189890"
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
    "id": "00c36bea-f33b-4c38-a00a-4806facb943e",
    "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
    "expires_at": "2026-10-30T13:19:49.53243Z",
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

`POST /api/driver/v1/offers/00c36bea-f33b-4c38-a00a-4806facb943e/accept` → **200**

```json
{
  "command_id": "83be99f4-2036-4217-97ff-fd35331906ec"
}
```

```json
{
  "id": "27c87d85-e7c1-4198-b9b2-fc4863a150c5",
  "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc8ae1b6-c873-48c7-860b-809833dd3906",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[
  {
    "phone": "+380675189890",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:36.772401189Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[
  {
    "phone": "+380675189890",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:36.772401189Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[
  {
    "phone": "+380675189890",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:36.772401189Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc8ae1b6-c873-48c7-860b-809833dd3906",
  "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
  "assignment_id": "27c87d85-e7c1-4198-b9b2-fc4863a150c5",
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
    "phone": "+380675189890"
  }
}
```

`POST /api/driver/v1/work-sessions/f1f3953b-40e1-49e4-8314-0288baf2d116/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:37Z",
    "sequence": 1793366377908
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1f3953b-40e1-49e4-8314-0288baf2d116",
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
  "last_heartbeat_at": "2026-10-30T13:19:37.930854Z",
  "last_location_at": "2026-10-30T13:19:37.930854Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/dc8ae1b6-c873-48c7-860b-809833dd3906/arrive` → **200**

```json
{
  "command_id": "279dd8ff-ef9c-42ad-8a4d-cb5c39262270",
  "expected_version": 0
}
```

```json
{
  "id": "dc8ae1b6-c873-48c7-860b-809833dd3906",
  "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
  "assignment_id": "27c87d85-e7c1-4198-b9b2-fc4863a150c5",
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
  "arrived_at": "2026-10-30T13:19:38.247858Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675189890"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[
  {
    "phone": "+380675189890",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:36.772401189Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[
  {
    "phone": "+380675189890",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:36.772401189Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[
  {
    "phone": "+380675189890",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:36.772401189Z"
  },
  {
    "phone": "+380675189890",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:39.781619522Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[
  {
    "phone": "+380675189890",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:36.772401189Z"
  },
  {
    "phone": "+380675189890",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:39.781619522Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675189890` → **200**

```json
[
  {
    "phone": "+380675189890",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:36.772401189Z"
  },
  {
    "phone": "+380675189890",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:19:39.781619522Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/dc8ae1b6-c873-48c7-860b-809833dd3906/start` → **200**

```json
{
  "command_id": "2baaa5b6-2645-4c9d-bff2-eaf42f174976",
  "expected_version": 1
}
```

```json
{
  "id": "dc8ae1b6-c873-48c7-860b-809833dd3906",
  "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
  "assignment_id": "27c87d85-e7c1-4198-b9b2-fc4863a150c5",
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
  "arrived_at": "2026-10-30T13:19:38.247858Z",
  "started_at": "2026-10-30T13:19:40.699053Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675189890"
  }
}
```

`POST /api/driver/v1/trips/dc8ae1b6-c873-48c7-860b-809833dd3906/complete` → **200**

```json
{
  "command_id": "95c3f941-4bfb-47cf-8002-a478688e1385",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:19:41Z",
  "cash_received": true
}
```

```json
{
  "id": "dc8ae1b6-c873-48c7-860b-809833dd3906",
  "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
  "assignment_id": "27c87d85-e7c1-4198-b9b2-fc4863a150c5",
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
  "arrived_at": "2026-10-30T13:19:38.247858Z",
  "started_at": "2026-10-30T13:19:40.699053Z",
  "completed_at": "2026-10-30T13:19:41.017211Z",
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
  "session_id": "f1f3953b-40e1-49e4-8314-0288baf2d116",
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
  "last_heartbeat_at": "2026-10-30T13:19:37.930854Z",
  "last_location_at": "2026-10-30T13:19:37.930854Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1f3953b-40e1-49e4-8314-0288baf2d116/close` → **200**

```json
{
  "command_id": "1c427470-4525-48ea-952d-2e484797d003",
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
  "phone": "+380635433006",
  "device_ref": "sandbox-7822"
}
```

```json
{
  "challenge_id": "983fd0f1-5c9c-4cdb-a3e6-fdd2ba502936",
  "expires_at": "2026-10-30T13:24:41.94123456Z",
  "resend_available_at": "2026-10-30T13:19:42.94123456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635433006` → **200**

```json
{
  "phone": "+380635433006",
  "audience": "CLIENT",
  "code": "605291",
  "sent_at": "2026-10-30T13:19:41.944524871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "983fd0f1-5c9c-4cdb-a3e6-fdd2ba502936",
  "code": "605291",
  "device_ref": "sandbox-7822"
}
```

```json
{
  "session_id": "382af3d9-84e3-443f-a80a-d5899f7b956a",
  "subject": {
    "type": "CLIENT",
    "id": "4b730e52-4cfd-4a4b-a10f-c8859a8bd589"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YjczMGU1Mi00Y2ZkLTRhNGItYTEwZi1jODg1OWE4YmQ1ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjgyLCJpYXQiOjE3OTMzNjYzODIsImp0aSI6ImJhNDgxYWZjLWY1ZTYtNDViYS1hYmZmLWY4MjA0ZmYwMGQzOCIsInNpZCI6IjM4MmFmM2Q5LTg0ZTMtNDQzZi1hODBhLWQ1ODk5ZjdiOTU2YSJ9.FFujb3o2YI7ec_t87Y0b9LaJLfPunftmLk1y838EypE",
  "access_expires_at": "2026-10-30T13:34:42.281067606Z",
  "refresh_token": "tOm5chCsSl1dGFeJh3nKkrw6WOzeb1L095ssUVSJ8Gs",
  "refresh_expires_at": "2026-11-29T13:19:42.280467731Z",
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
  "device_ref": "sandbox-5138"
}
```

```json
{
  "challenge_id": "a10a7dc4-cbe3-4164-a1c6-dc246322302d",
  "expires_at": "2026-10-30T13:24:42.873570927Z",
  "resend_available_at": "2026-10-30T13:19:43.873570927Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "678439",
  "sent_at": "2026-10-30T13:19:42.877503608Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a10a7dc4-cbe3-4164-a1c6-dc246322302d",
  "code": "678439",
  "device_ref": "sandbox-5138"
}
```

```json
{
  "session_id": "5f03800b-7225-4ad3-8fe6-7948625f89f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzI4MywiaWF0IjoxNzkzMzY2MzgzLCJqdGkiOiI2NWZhMGE4Yy1mMTRkLTQwNTUtYTA0Ny0xMDBhMzNhNGI1MTYiLCJzaWQiOiI1ZjAzODAwYi03MjI1LTRhZDMtOGZlNi03OTQ4NjI1Zjg5ZjMifQ.1LZ8tOZXgZCRAA8zISYyh72JN9FhmVEjWVAbvrui5AE",
  "access_expires_at": "2026-10-30T13:34:43.210037361Z",
  "refresh_token": "VX4ztQsvJAClJF88b6ljdJ0XFr-865Jt9ImcRavU-j8",
  "refresh_expires_at": "2026-11-29T13:19:43.209435112Z",
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
  "session_id": "751c0512-b225-4977-95a6-d440fe4d879f",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyODQsImlhdCI6MTc5MzM2NjM4NCwianRpIjoiNThlNThiMjgtOWVlZC00Y2ZjLTk4OTEtNjM4NjQwY2MzYTZiIiwic2lkIjoiNzUxYzA1MTItYjIyNS00OTc3LTk1YTYtZDQ0MGZlNGQ4NzlmIn0.d_2TbKztxRuYk4rF3eBBH8ld76liuNZdybj2Y6Ft9g0",
  "access_expires_at": "2026-10-30T13:34:44.077371315Z",
  "refresh_token": "BS7mTDLPRfK6kznMaIghBXHcBO3thA8gUKQc_oC_Ing",
  "refresh_expires_at": "2026-10-31T01:19:44.07676099Z",
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
  "session_id": "f587d791-8ee4-4f0e-a9b1-a038fbc94c57",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjcyODQsImlhdCI6MTc5MzM2NjM4NCwianRpIjoiZTY4NjE4YWUtYjE3Yy00NWVjLWE1M2MtNzIwNWJjZDBlMmFhIiwic2lkIjoiZjU4N2Q3OTEtOGVlNC00ZjBlLWE5YjEtYTAzOGZiYzk0YzU3In0.6dZsth90lYT2XqRvYw9F9Nz5pqjdWvaH94uDmYCEkEw",
  "access_expires_at": "2026-10-30T13:34:44.661253047Z",
  "refresh_token": "V9dkcYEzdKxGYe9pKgwj9kE-JlxWn7iSH8xqrQ0EuuM",
  "refresh_expires_at": "2026-10-31T01:19:44.660529969Z",
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
  "command_id": "d3de552e-dc41-4441-b6ec-ec390c59a294",
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
  "id": "9419c09e-260b-4d40-9ca1-64e232f0427b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:45.251977Z",
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
  "command_id": "bb8a7021-def8-4f77-8884-56bfa5109a18",
  "quote_id": "9419c09e-260b-4d40-9ca1-64e232f0427b",
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
  "id": "c2c11a6c-f2d2-49b7-8d07-f8288e799369",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b730e52-4cfd-4a4b-a10f-c8859a8bd589",
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
  "created_at": "2026-10-30T13:19:45.560523Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c2c11a6c-f2d2-49b7-8d07-f8288e799369` → **200**

```json
{
  "id": "c2c11a6c-f2d2-49b7-8d07-f8288e799369",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b730e52-4cfd-4a4b-a10f-c8859a8bd589",
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
  "created_at": "2026-10-30T13:19:45.560523Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c2c11a6c-f2d2-49b7-8d07-f8288e799369/cancel` → **200**

```json
{
  "command_id": "7e6892d9-5091-4db5-90d6-484870367548",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c2c11a6c-f2d2-49b7-8d07-f8288e799369",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4b730e52-4cfd-4a4b-a10f-c8859a8bd589",
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
  "created_at": "2026-10-30T13:19:45.560523Z",
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
  "command_id": "675784a6-4ef6-42ab-a102-ac5f2cf3a022",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:46Z",
    "sequence": 1793366386829
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dae06908-2c74-493d-ac16-3352787d68a3",
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
  "last_heartbeat_at": "2026-10-30T13:19:46.848808Z",
  "last_location_at": "2026-10-30T13:19:46.848808Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26807"
}
```

```json
{
  "challenge_id": "0b9ac4b4-667e-40d7-a3a1-7648dcb87089",
  "expires_at": "2026-10-30T13:24:47.155842278Z",
  "resend_available_at": "2026-10-30T13:19:48.155842278Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "156188",
  "sent_at": "2026-10-30T13:19:47.159202673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0b9ac4b4-667e-40d7-a3a1-7648dcb87089",
  "code": "156188",
  "device_ref": "sandbox-26807"
}
```

```json
{
  "session_id": "9e00eab5-3eb6-4cef-8535-90af97a88480",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzI4NywiaWF0IjoxNzkzMzY2Mzg3LCJqdGkiOiJkNjFlZmM0NC0zZWM0LTQ4NWMtOWZhYS1jOTM3MzExMTMzNDQiLCJzaWQiOiI5ZTAwZWFiNS0zZWI2LTRjZWYtODUzNS05MGFmOTdhODg0ODAifQ.SzlwO5mHseHm0fOu5LJacCImhpUOEkTpIpeL4QbGMgk",
  "access_expires_at": "2026-10-30T13:34:47.489382107Z",
  "refresh_token": "rHyJF5wXjaoHAzkjtMtL4S3kLMQWNEzCuKh9Vg1rSR8",
  "refresh_expires_at": "2026-11-29T13:19:47.488717862Z",
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
  "command_id": "97a00ef2-ca2d-4831-98a6-6f104888f564",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:19:48Z",
    "sequence": 1793366388942
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf2f85e7-0dec-48c9-b811-c443ad187b39",
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
  "last_heartbeat_at": "2026-10-30T13:19:48.114333Z",
  "last_location_at": "2026-10-30T13:19:48.114333Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3482d734-6dff-4988-8527-aa444f85d882",
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
  "id": "d559f890-476f-4555-aeae-e0b497eb4636",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:24:48.428101Z",
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
  "command_id": "0896a613-5712-4bc1-bb04-e51d4f29750e",
  "quote_id": "d559f890-476f-4555-aeae-e0b497eb4636",
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
  "id": "b54cad22-0267-4439-8cea-0f14445f4196",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4b730e52-4cfd-4a4b-a10f-c8859a8bd589",
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
  "created_at": "2026-10-30T13:19:48.744932Z",
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
    "id": "9fdfe35b-9831-4af4-8915-cbd7dcccb366",
    "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
    "expires_at": "2026-10-30T13:20:03.749127Z",
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

`POST /api/driver/v1/offers/9fdfe35b-9831-4af4-8915-cbd7dcccb366/accept` → **200**

```json
{
  "command_id": "9e810e85-b6ba-4f96-ad95-ec8aed6af898"
}
```

```json
{
  "id": "49e7660f-8399-4b8b-ab45-70a8b5078472",
  "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8fa79ade-b0a8-45f1-a315-68e7c0e24f9f",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8fa79ade-b0a8-45f1-a315-68e7c0e24f9f",
  "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
  "assignment_id": "49e7660f-8399-4b8b-ab45-70a8b5078472",
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

`POST /api/driver/v1/trips/8fa79ade-b0a8-45f1-a315-68e7c0e24f9f/cancel` → **200**

```json
{
  "command_id": "36bf13d3-e81e-4c86-a22f-c7fb42ba3998",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "8fa79ade-b0a8-45f1-a315-68e7c0e24f9f",
  "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
  "assignment_id": "49e7660f-8399-4b8b-ab45-70a8b5078472",
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

`GET /api/rider/v1/orders/b54cad22-0267-4439-8cea-0f14445f4196` → **200**

```json
{
  "id": "b54cad22-0267-4439-8cea-0f14445f4196",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4b730e52-4cfd-4a4b-a10f-c8859a8bd589",
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
    "id": "49e7660f-8399-4b8b-ab45-70a8b5078472",
    "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8fa79ade-b0a8-45f1-a315-68e7c0e24f9f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:19:48.744932Z",
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
    "id": "9ad3e922-cca4-4254-88e0-d9d936ef9092",
    "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
    "expires_at": "2026-10-30T13:20:05.004484Z",
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

`POST /api/driver/v1/offers/9ad3e922-cca4-4254-88e0-d9d936ef9092/accept` → **200**

```json
{
  "command_id": "4bac7b91-5a24-44a5-b101-42d8da46caed"
}
```

```json
{
  "id": "7ac433c0-3b20-4da8-9b39-4f7dff268cfb",
  "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f8fb6631-8273-419f-999a-72b5641b50fa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f8fb6631-8273-419f-999a-72b5641b50fa",
  "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
  "assignment_id": "7ac433c0-3b20-4da8-9b39-4f7dff268cfb",
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

`POST /api/driver/v1/trips/f8fb6631-8273-419f-999a-72b5641b50fa/cancel` → **200**

```json
{
  "command_id": "89727d2e-5827-4d4e-8405-87dbf6ccf464",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f8fb6631-8273-419f-999a-72b5641b50fa",
  "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
  "assignment_id": "7ac433c0-3b20-4da8-9b39-4f7dff268cfb",
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
{
  "items": [
    {
      "id": "b54cad22-0267-4439-8cea-0f14445f4196",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T13:19:48.744932Z",
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
      "id": "c2c11a6c-f2d2-49b7-8d07-f8288e799369",
      "short_number": 5,
      "status": "CANCELLED",
      "created_at": "2026-10-30T13:19:45.560523Z",
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
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/b54cad22-0267-4439-8cea-0f14445f4196/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:19:48.745707Z",
      "actor": {
        "type": "CLIENT",
        "id": "4b730e52-4cfd-4a4b-a10f-c8859a8bd589",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
        "quote_id": "d559f890-476f-4555-aeae-e0b497eb4636",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "3cf1019e-9bd1-42f7-b127-f7adcf028be4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:19:48.748273Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
        "attempt_id": "4e0d5b03-3588-4821-8469-30c02f39c01d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3cf1019e-9bd1-42f7-b127-f7adcf028be4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:19:48.755552Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9fdfe35b-9831-4af4-8915-cbd7dcccb366",
        "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "3cf1019e-9bd1-42f7-b127-f7adcf028be4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:19:49.390243Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9fdfe35b-9831-4af4-8915-cbd7dcccb366",
        "order_id": "b54cad22-0267-4439-8cea-0f14445f4196",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "49e7660f-8399-4b8b-ab45-70a8b5078472"
      },
      "correlation_id": "9afce4e7-b900-477b-bfaa-f0c8d999b6bd"
```

Done: orders c2c11a6c-f2d2-49b7-8d07-f8288e799369, b54cad22-0267-4439-8cea-0f14445f4196.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732687229",
  "device_ref": "sandbox-980"
}
```

```json
{
  "challenge_id": "2e3f1401-687c-494e-88c2-1278b4f7a777",
  "expires_at": "2026-10-30T13:24:52.4504484Z",
  "resend_available_at": "2026-10-30T13:19:53.4504484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732687229` → **200**

```json
{
  "phone": "+380732687229",
  "audience": "CLIENT",
  "code": "184986",
  "sent_at": "2026-10-30T13:19:52.453485702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e3f1401-687c-494e-88c2-1278b4f7a777",
  "code": "184986",
  "device_ref": "sandbox-980"
}
```

```json
{
  "session_id": "6f5cefa8-d1e4-4c0f-aa2d-9cbc49304d0b",
  "subject": {
    "type": "CLIENT",
    "id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2Y4M2YyNS1kZDg2LTRjOGItOGZjMy0xMjYyODJiMjBlZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MjkyLCJpYXQiOjE3OTMzNjYzOTIsImp0aSI6IjI3MzNhMmFmLWQ4YjYtNDc2Yi1iZWM2LWMyNzNmODU5M2Q0MCIsInNpZCI6IjZmNWNlZmE4LWQxZTQtNGMwZi1hYTJkLTljYmM0OTMwNGQwYiJ9.0JiMFilSRCnPOTXIANtxowUqExs3iA30WJPAtES16gc",
  "access_expires_at": "2026-10-30T13:34:52.767754323Z",
  "refresh_token": "GSVMPu_T_oZ1_fmNFAZRr7W7gKHCottk8pKkGzEuDQ8",
  "refresh_expires_at": "2026-11-29T13:19:52.767034654Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3abfdd3a-611d-4f0a-be5b-061e8990873f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "cc3dfca5-974c-41f9-a28f-264d450efd61",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-cc3dfca5-974c-41f9-a28f-264d450efd61",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b89a5e2975ab05034eaa481abc9ed0e4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=cc3dfca5-974c-41f9-a28f-264d450efd61",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732687229"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=cc3dfca5-974c-41f9-a28f-264d450efd61",
  "expires_at": "2026-10-30T13:49:53.094843Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/cc3dfca5-974c-41f9-a28f-264d450efd61` → **200**

```json
{
  "id": "cc3dfca5-974c-41f9-a28f-264d450efd61",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:49:53.094843Z",
  "card": {
    "id": "fe63c544-dc2b-4fac-a999-0b27722b5fac",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4758",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:19:53.411405Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "fe63c544-dc2b-4fac-a999-0b27722b5fac",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4758",
      "card_type": "Visa",
      "created_at": "2026-10-30T13:19:53.411405Z"
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
  "device_ref": "sandbox-767"
}
```

```json
{
  "challenge_id": "3fb64d76-8171-484c-bfbf-6ecb320de535",
  "expires_at": "2026-10-30T13:24:54.008499958Z",
  "resend_available_at": "2026-10-30T13:19:55.008499958Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "854087",
  "sent_at": "2026-10-30T13:19:54.011174434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3fb64d76-8171-484c-bfbf-6ecb320de535",
  "code": "854087",
  "device_ref": "sandbox-767"
}
```

```json
{
  "session_id": "4e345586-002f-4b0c-aff7-932c5cdf1978",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzI5NCwiaWF0IjoxNzkzMzY2Mzk0LCJqdGkiOiI2MGYxZDI4Ny1hOTI2LTQ3YTItYjA2NC0zM2I0NjFkMDZmNjUiLCJzaWQiOiI0ZTM0NTU4Ni0wMDJmLTRiMGMtYWZmNy05MzJjNWNkZjE5NzgifQ.tZGAuWcl1xaUY80EYaiWh-gzbFUla4SNup3JxRR31Z0",
  "access_expires_at": "2026-10-30T13:34:54.327831412Z",
  "refresh_token": "3CAPVugdmM4DGsXcnU1SUz55zoCUCQBb4OnWaHOqwuE",
  "refresh_expires_at": "2026-11-29T13:19:54.327200257Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf2f85e7-0dec-48c9-b811-c443ad187b39",
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
  "last_heartbeat_at": "2026-10-30T13:19:48.114333Z",
  "last_location_at": "2026-10-30T13:19:48.114333Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf2f85e7-0dec-48c9-b811-c443ad187b39/handover` → **200**

```json
{
  "command_id": "43b8734e-5114-419a-851c-cf81e66012c8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf2f85e7-0dec-48c9-b811-c443ad187b39",
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
  "last_heartbeat_at": "2026-10-30T13:19:48.114333Z",
  "last_location_at": "2026-10-30T13:19:48.114333Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/bf2f85e7-0dec-48c9-b811-c443ad187b39/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:37Z",
    "sequence": 1793366437225
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf2f85e7-0dec-48c9-b811-c443ad187b39",
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
  "last_heartbeat_at": "2026-10-30T13:20:37.24499Z",
  "last_location_at": "2026-10-30T13:20:37.24499Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b9f17786-af43-49b5-8981-726cbfdb8394",
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
  "id": "f4c2c8da-1828-4a37-a170-9b92c29fc20b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:37.546856Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "55e7fe57-0dbf-4973-be13-82e1d2634e3d",
  "quote_id": "f4c2c8da-1828-4a37-a170-9b92c29fc20b",
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
  "id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
  "created_at": "2026-10-30T13:20:37.860522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9a70d02b-c629-41f5-a100-f4a4d8caef69` → **200**

```json
{
  "id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
  "created_at": "2026-10-30T13:20:37.860522Z",
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
    "id": "8a3d2a02-f227-4d4d-9cfb-8b4d94c0fd82",
    "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
    "expires_at": "2026-10-30T13:20:53.13022Z",
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

`POST /api/driver/v1/offers/8a3d2a02-f227-4d4d-9cfb-8b4d94c0fd82/accept` → **200**

```json
{
  "command_id": "cbdd8164-37c6-4d97-8ca3-6a0bd86f5818"
}
```

```json
{
  "id": "e765e287-e3e0-4279-b4c3-3c941ad9cab3",
  "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "03739522-93c9-4fa9-baf9-0be9ac4df4aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "03739522-93c9-4fa9-baf9-0be9ac4df4aa",
  "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "assignment_id": "e765e287-e3e0-4279-b4c3-3c941ad9cab3",
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

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/bf2f85e7-0dec-48c9-b811-c443ad187b39/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:46Z",
    "sequence": 1793366446431
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf2f85e7-0dec-48c9-b811-c443ad187b39",
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
  "last_heartbeat_at": "2026-10-30T13:20:46.450397Z",
  "last_location_at": "2026-10-30T13:20:46.450397Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/03739522-93c9-4fa9-baf9-0be9ac4df4aa/arrive` → **200**

```json
{
  "command_id": "d26d4f7c-be34-4948-aaa9-efd1406c9683",
  "expected_version": 0
}
```

```json
{
  "id": "03739522-93c9-4fa9-baf9-0be9ac4df4aa",
  "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "assignment_id": "e765e287-e3e0-4279-b4c3-3c941ad9cab3",
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
  "arrived_at": "2026-10-30T13:20:46.746074Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/03739522-93c9-4fa9-baf9-0be9ac4df4aa/start` → **200**

```json
{
  "command_id": "7092b677-f3db-45b4-b93c-77904f83fde7",
  "expected_version": 1
}
```

```json
{
  "id": "03739522-93c9-4fa9-baf9-0be9ac4df4aa",
  "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "assignment_id": "e765e287-e3e0-4279-b4c3-3c941ad9cab3",
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
  "arrived_at": "2026-10-30T13:20:46.746074Z",
  "started_at": "2026-10-30T13:20:47.061286Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/03739522-93c9-4fa9-baf9-0be9ac4df4aa/complete` → **200**

```json
{
  "command_id": "51e4ba06-e4c4-42e9-bb17-8f853bb4b661",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:20:47Z",
  "cash_received": true
}
```

```json
{
  "id": "03739522-93c9-4fa9-baf9-0be9ac4df4aa",
  "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "assignment_id": "e765e287-e3e0-4279-b4c3-3c941ad9cab3",
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
  "arrived_at": "2026-10-30T13:20:46.746074Z",
  "started_at": "2026-10-30T13:20:47.061286Z",
  "completed_at": "2026-10-30T13:20:47.377384Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/9a70d02b-c629-41f5-a100-f4a4d8caef69` → **200**

```json
{
  "id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
    "id": "e765e287-e3e0-4279-b4c3-3c941ad9cab3",
    "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "03739522-93c9-4fa9-baf9-0be9ac4df4aa",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:20:37.860522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9a70d02b-c629-41f5-a100-f4a4d8caef69` → **200**

```json
{
  "id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
    "id": "e765e287-e3e0-4279-b4c3-3c941ad9cab3",
    "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "03739522-93c9-4fa9-baf9-0be9ac4df4aa",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:20:37.860522Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9a70d02b-c629-41f5-a100-f4a4d8caef69` → **200**

```json
{
  "id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
    "id": "e765e287-e3e0-4279-b4c3-3c941ad9cab3",
    "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "03739522-93c9-4fa9-baf9-0be9ac4df4aa",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:20:37.860522Z",
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

`GET /api/rider/v1/orders/9a70d02b-c629-41f5-a100-f4a4d8caef69/tip` → **200**

```json
{
  "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
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
  "available_until": "2026-10-31T13:20:47.377384Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9a70d02b-c629-41f5-a100-f4a4d8caef69/tip` → **201**

```json
{
  "command_id": "10116c97-065b-4bad-9e76-88aa13066d58",
  "amount_minor": 2500
}
```

```json
{
  "id": "869ba2b3-529d-43e7-babf-b4b6bc733f29",
  "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:20:51.206424Z"
}
```

`GET /api/rider/v1/orders/9a70d02b-c629-41f5-a100-f4a4d8caef69/tip` → **200**

```json
{
  "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
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
  "available_until": "2026-10-31T13:20:47.377384Z",
  "open": false,
  "tip": {
    "id": "869ba2b3-529d-43e7-babf-b4b6bc733f29",
    "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:20:51.206424Z"
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
      "id": "ace6d88a-a312-427a-af78-8df718eb1bbc",
      "at": "2026-10-30T13:20:48.21854Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
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
      "id": "7f00f952-5b99-4ab6-bfeb-52eb20818147",
      "at": "2026-10-30T13:20:52.270196Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
      "counterpart_id": null
    },
    {
      "id": "ace6d88a-a312-427a-af78-8df718eb1bbc",
      "at": "2026-10-30T13:20:48.21854Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1a63bb53-a5ca-45f2-8506-4bb531272ff9",
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
  "id": "8c71978c-2006-4ae3-a4c8-e492fe64ff3b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:53.401633Z",
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
  "session_id": "d00cc65e-ea8f-4166-973f-dce113d0e95e",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczNTQsImlhdCI6MTc5MzM2NjQ1NCwianRpIjoiZDM2NTAwNWItMGY1Ny00ODI5LTk3YmUtOTViMmQ3NmQ2ZjI2Iiwic2lkIjoiZDAwY2M2NWUtZWE4Zi00MTY2LTk3M2YtZGNlMTEzZDBlOTVlIn0.EQXeDyfpkK0CnVNe8fES8St0vFiiIxddhIxjxOdkDZY",
  "access_expires_at": "2026-10-30T13:35:54.023593133Z",
  "refresh_token": "W9fC0OZg8Jfgu3uN1qkLZkkldPPJ4BI_B5aBxZ0EvVE",
  "refresh_expires_at": "2026-10-31T01:20:54.0229349Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732687229` → **200**

```json
{
  "client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9"
}
```

`POST /api/admin/v1/rider-wallets/17f83f25-dd86-4c8b-8fc3-126282b20ed9/top-ups` → **201**

```json
{
  "command_id": "b4e2601e-a89f-4526-aaf6-93e6a5fee86c",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
      "id": "22c69c85-ac01-485d-b955-56e639cf6fc1",
      "at": "2026-10-30T13:20:54.66969Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c856ee23-6ebf-4e41-bedf-12e07a9970c2",
  "quote_id": "8c71978c-2006-4ae3-a4c8-e492fe64ff3b",
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
  "id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
  "created_at": "2026-10-30T13:20:54.984504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c311c7a8-273a-4c9e-a087-65edb5bf177a` → **200**

```json
{
  "id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
  "created_at": "2026-10-30T13:20:54.984504Z",
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
    "id": "2093d8b5-41a1-4107-8d62-196b2229d3d5",
    "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
    "expires_at": "2026-10-30T13:21:09.989493Z",
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

`POST /api/driver/v1/offers/2093d8b5-41a1-4107-8d62-196b2229d3d5/accept` → **200**

```json
{
  "command_id": "c5babcc6-7008-47b7-afbf-9d5ff478e342"
}
```

```json
{
  "id": "03e70747-55e6-4895-82ea-68e5ec8e5b4e",
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8f18a04a-8307-4ed9-a7bb-847272ae1a84",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8f18a04a-8307-4ed9-a7bb-847272ae1a84",
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
  "assignment_id": "03e70747-55e6-4895-82ea-68e5ec8e5b4e",
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

`POST /api/driver/v1/work-sessions/bf2f85e7-0dec-48c9-b811-c443ad187b39/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:56Z",
    "sequence": 1793366456481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf2f85e7-0dec-48c9-b811-c443ad187b39",
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
  "last_heartbeat_at": "2026-10-30T13:20:56.500776Z",
  "last_location_at": "2026-10-30T13:20:56.500776Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8f18a04a-8307-4ed9-a7bb-847272ae1a84/arrive` → **200**

```json
{
  "command_id": "15639b7b-ae70-40e9-8d4e-674a7d619360",
  "expected_version": 0
}
```

```json
{
  "id": "8f18a04a-8307-4ed9-a7bb-847272ae1a84",
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
  "assignment_id": "03e70747-55e6-4895-82ea-68e5ec8e5b4e",
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
  "arrived_at": "2026-10-30T13:20:56.798968Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f18a04a-8307-4ed9-a7bb-847272ae1a84/start` → **200**

```json
{
  "command_id": "f6fbf443-bb22-4119-9352-2d16b7b91b78",
  "expected_version": 1
}
```

```json
{
  "id": "8f18a04a-8307-4ed9-a7bb-847272ae1a84",
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
  "assignment_id": "03e70747-55e6-4895-82ea-68e5ec8e5b4e",
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
  "arrived_at": "2026-10-30T13:20:56.798968Z",
  "started_at": "2026-10-30T13:20:57.102639Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8f18a04a-8307-4ed9-a7bb-847272ae1a84/complete` → **200**

```json
{
  "command_id": "959b9a19-8016-4602-952b-00b0ed47dab7",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:20:57Z",
  "cash_received": true
}
```

```json
{
  "id": "8f18a04a-8307-4ed9-a7bb-847272ae1a84",
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
  "assignment_id": "03e70747-55e6-4895-82ea-68e5ec8e5b4e",
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
  "arrived_at": "2026-10-30T13:20:56.798968Z",
  "started_at": "2026-10-30T13:20:57.102639Z",
  "completed_at": "2026-10-30T13:20:57.414001Z",
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
  "client_id": "17f83f25-dd86-4c8b-8fc3-126282b20ed9",
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
      "id": "22c69c85-ac01-485d-b955-56e639cf6fc1",
      "at": "2026-10-30T13:20:54.66969Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
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

`GET /api/rider/v1/orders/c311c7a8-273a-4c9e-a087-65edb5bf177a/tip` → **200**

```json
{
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
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
  "available_until": "2026-10-31T13:20:57.414001Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c311c7a8-273a-4c9e-a087-65edb5bf177a/tip` → **201**

```json
{
  "command_id": "648e68ba-a5a0-489b-817c-558982dbb26d",
  "amount_minor": 2500
}
```

```json
{
  "id": "f7f41198-a4de-4fd1-a15d-f87756dad452",
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:20:58.605535Z"
}
```

`GET /api/rider/v1/orders/c311c7a8-273a-4c9e-a087-65edb5bf177a/tip` → **200**

```json
{
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
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
  "available_until": "2026-10-31T13:20:57.414001Z",
  "open": false,
  "tip": {
    "id": "f7f41198-a4de-4fd1-a15d-f87756dad452",
    "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:20:58.605535Z"
  }
}
```

`GET /api/rider/v1/orders/c311c7a8-273a-4c9e-a087-65edb5bf177a/tip` → **200**

```json
{
  "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
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
  "available_until": "2026-10-31T13:20:57.414001Z",
  "open": false,
  "tip": {
    "id": "f7f41198-a4de-4fd1-a15d-f87756dad452",
    "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:20:58.605535Z"
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
      "id": "49a079bc-e867-42a7-807a-ccff74492dcf",
      "at": "2026-10-30T13:21:00.340079Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
      "counterpart_id": null
    },
    {
      "id": "266219eb-33e9-4cfc-b4de-b6e93f515772",
      "at": "2026-10-30T13:20:58.313983Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c311c7a8-273a-4c9e-a087-65edb5bf177a",
      "counterpart_id": null
    },
    {
      "id": "7f00f952-5b99-4ab6-bfeb-52eb20818147",
      "at": "2026-10-30T13:20:52.270196Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
      "counterpart_id": null
    },
    {
      "id": "ace6d88a-a312-427a-af78-8df718eb1bbc",
      "at": "2026-10-30T13:20:48.21854Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9a70d02b-c629-41f5-a100-f4a4d8caef69",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bf2f85e7-0dec-48c9-b811-c443ad187b39",
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
  "last_heartbeat_at": "2026-10-30T13:20:56.500776Z",
  "last_location_at": "2026-10-30T13:20:56.500776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf2f85e7-0dec-48c9-b811-c443ad187b39/close` → **200**

```json
{
  "command_id": "22cf11e7-57b1-49ec-a980-f7c765b809a3",
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

Done: card order c311c7a8-273a-4c9e-a087-65edb5bf177a.

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
  "phone": "+380738853912",
  "device_ref": "sandbox-22461"
}
```

```json
{
  "challenge_id": "6a5599d7-739f-41b9-85b1-526b13adae20",
  "expires_at": "2026-10-30T13:26:01.697277659Z",
  "resend_available_at": "2026-10-30T13:21:02.697277659Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738853912` → **200**

```json
{
  "phone": "+380738853912",
  "audience": "CLIENT",
  "code": "176203",
  "sent_at": "2026-10-30T13:21:01.700123425Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a5599d7-739f-41b9-85b1-526b13adae20",
  "code": "176203",
  "device_ref": "sandbox-22461"
}
```

```json
{
  "session_id": "aefd3d50-bf3f-4665-b00c-24aca5f499b6",
  "subject": {
    "type": "CLIENT",
    "id": "8363ecd2-10a7-494e-ba76-f4d240b8682c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzYzZWNkMi0xMGE3LTQ5NGUtYmE3Ni1mNGQyNDBiODY4MmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzYyLCJpYXQiOjE3OTMzNjY0NjIsImp0aSI6ImUyNzAwNzg4LWY3ZmItNDQwZS04ZjgzLWYyOWMwZGYzNGE4MyIsInNpZCI6ImFlZmQzZDUwLWJmM2YtNDY2NS1iMDBjLTI0YWNhNWY0OTliNiJ9.fxocQVILBE1q5RnOc9TdMHKkUXUFACupjQikuxDcE3w",
  "access_expires_at": "2026-10-30T13:36:02.027046897Z",
  "refresh_token": "teZwNDYNYtf5GZ0hOd-bDsqXb3Krr2TVkSkIMCDnlCk",
  "refresh_expires_at": "2026-11-29T13:21:02.026461489Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "838dba0d-e445-4730-8e61-367ba6f8aa5f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "1bcbecdd-fba1-42c2-82a0-38fe2f03be56",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-1bcbecdd-fba1-42c2-82a0-38fe2f03be56",
    "orderDate": "1793366462",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "151e302310f9d626b709bf1e302efd6b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=1bcbecdd-fba1-42c2-82a0-38fe2f03be56",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738853912"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=1bcbecdd-fba1-42c2-82a0-38fe2f03be56",
  "created_at": "2026-10-30T13:21:02.329744Z",
  "expires_at": "2026-10-30T13:51:02.329744Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/1bcbecdd-fba1-42c2-82a0-38fe2f03be56` → **200**

```json
{
  "id": "1bcbecdd-fba1-42c2-82a0-38fe2f03be56",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:21:02.329744Z",
  "expires_at": "2026-10-30T13:51:02.329744Z",
  "completed_at": "2026-10-30T13:21:02.643786Z",
  "masked_pan": "41****2082",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8363ecd2-10a7-494e-ba76-f4d240b8682c",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8363ecd2-10a7-494e-ba76-f4d240b8682c",
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
      "id": "87e27411-18a8-4fcd-a267-0161adb9bf18",
      "at": "2026-10-30T13:21:03.359095Z",
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
  "client_id": "8363ecd2-10a7-494e-ba76-f4d240b8682c",
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
      "id": "87e27411-18a8-4fcd-a267-0161adb9bf18",
      "at": "2026-10-30T13:21:03.359095Z",
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
  "device_ref": "sandbox-7000"
}
```

```json
{
  "challenge_id": "21ac2c4f-4a91-47da-ac47-cef28bd3b71f",
  "expires_at": "2026-10-30T13:26:04.837926127Z",
  "resend_available_at": "2026-10-30T13:21:05.837926127Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "028409",
  "sent_at": "2026-10-30T13:21:04.840648787Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21ac2c4f-4a91-47da-ac47-cef28bd3b71f",
  "code": "028409",
  "device_ref": "sandbox-7000"
}
```

```json
{
  "session_id": "ccd5d2ea-6e4d-4f21-bb46-6a27066e2f15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM2NSwiaWF0IjoxNzkzMzY2NDY1LCJqdGkiOiIwYmVhODAyNy03NWNlLTQ0YzItYTIzZC04ZDY0NTM2MTFjOTIiLCJzaWQiOiJjY2Q1ZDJlYS02ZTRkLTRmMjEtYmI0Ni02YTI3MDY2ZTJmMTUifQ.aRKadkJ7KBdrm6Z1l1_49DSDcT_uKJ0_Ut7H5KQocGk",
  "access_expires_at": "2026-10-30T13:36:05.152046681Z",
  "refresh_token": "bnD64cuQhU2TPmD2a1uJQSrwT2Y6_A9xhOvjJ1fPhro",
  "refresh_expires_at": "2026-11-29T13:21:05.151370488Z",
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
  "command_id": "99c59535-0238-426d-b54d-3871a2eeb198",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "a84a6d0f-bbdd-45ad-8ad0-891f01cb49d2",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-a84a6d0f-bbdd-45ad-8ad0-891f01cb49d2",
    "orderDate": "1793366465",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "f1c8dd6c33d83f62d0aceb9688479e99",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=a84a6d0f-bbdd-45ad-8ad0-891f01cb49d2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=a84a6d0f-bbdd-45ad-8ad0-891f01cb49d2",
  "created_at": "2026-10-30T13:21:05.727957Z",
  "expires_at": "2026-10-30T13:51:05.727957Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/a84a6d0f-bbdd-45ad-8ad0-891f01cb49d2` → **200**

```json
{
  "id": "a84a6d0f-bbdd-45ad-8ad0-891f01cb49d2",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:21:05.727957Z",
  "expires_at": "2026-10-30T13:51:05.727957Z",
  "completed_at": "2026-10-30T13:21:06.022114Z",
  "masked_pan": "41****4829",
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
      "id": "c78237b2-11be-4fc1-bfa9-f9c580899408",
      "at": "2026-10-30T13:21:06.366508Z",
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
  "command_id": "05e44b10-f80b-4bc5-aee5-310b7f6596dd",
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
  "correlation_id": "c892dc52-6819-4dd8-9255-ee266a7bdc38"
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
  "device_ref": "sandbox-6143"
}
```

```json
{
  "challenge_id": "cc3ef0cc-20b1-43dc-8097-39e532cdc6e6",
  "expires_at": "2026-10-30T13:26:08.201455297Z",
  "resend_available_at": "2026-10-30T13:21:09.201455297Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "923150",
  "sent_at": "2026-10-30T13:21:08.204203744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc3ef0cc-20b1-43dc-8097-39e532cdc6e6",
  "code": "923150",
  "device_ref": "sandbox-6143"
}
```

```json
{
  "session_id": "a338a97e-41eb-4130-9752-f94af947f8e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM2OCwiaWF0IjoxNzkzMzY2NDY4LCJqdGkiOiI0MGNkYTAyMi03ZDNiLTQ4ZmUtOGRhYi0yOTkxMzc1MjdmMWMiLCJzaWQiOiJhMzM4YTk3ZS00MWViLTQxMzAtOTc1Mi1mOTRhZjk0N2Y4ZTMifQ.9vaoQF0Hx8pNQXmvDitUFIOxaj1rZKtCUHT-EgSAV2g",
  "access_expires_at": "2026-10-30T13:36:08.510807708Z",
  "refresh_token": "jKRxvpm43DcUyT6O5DFiMdxgFK0VA94Usbm8y4c6k4Q",
  "refresh_expires_at": "2026-11-29T13:21:08.510220807Z",
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
  "command_id": "102fac83-9796-40c5-accf-cc3f66d44ab0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:21:09Z",
    "sequence": 1793366469949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c4a69fb-e64c-4cee-8ba3-752a8930e046",
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
  "last_heartbeat_at": "2026-10-30T13:21:09.113461Z",
  "last_location_at": "2026-10-30T13:21:09.113461Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637329778",
  "device_ref": "sandbox-3600"
}
```

```json
{
  "challenge_id": "a9cd0b74-c693-43fe-929c-22b82fafd487",
  "expires_at": "2026-10-30T13:26:09.417628252Z",
  "resend_available_at": "2026-10-30T13:21:10.417628252Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637329778` → **200**

```json
{
  "phone": "+380637329778",
  "audience": "CLIENT",
  "code": "911609",
  "sent_at": "2026-10-30T13:21:09.420194739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9cd0b74-c693-43fe-929c-22b82fafd487",
  "code": "911609",
  "device_ref": "sandbox-3600"
}
```

```json
{
  "session_id": "cdd54f5a-b003-4b7e-a1c4-4302a84b9433",
  "subject": {
    "type": "CLIENT",
    "id": "250559d2-88c6-4003-bd62-b02877f284f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTA1NTlkMi04OGM2LTQwMDMtYmQ2Mi1iMDI4NzdmMjg0ZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzY5LCJpYXQiOjE3OTMzNjY0NjksImp0aSI6ImVkZjhmY2U2LTZhZWQtNGVmYi1iZWVjLWM4YWZlZDQ0ZTU2MyIsInNpZCI6ImNkZDU0ZjVhLWIwMDMtNGI3ZS1hMWM0LTQzMDJhODRiOTQzMyJ9.WaG_68N4hL8joAjiTLW6NPctlYC14iW8STlOdLTK3bA",
  "access_expires_at": "2026-10-30T13:36:09.72795673Z",
  "refresh_token": "eB7h3itjvUYtkCVJfGFTHd7MyRJzgduyWY2O_1Ozeeg",
  "refresh_expires_at": "2026-11-29T13:21:09.727401233Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8c1526b-a0d2-4fc6-9803-7e51dabda16d",
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
  "id": "1f8122d8-7e20-4d1b-9177-fef2ea27f120",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:26:10.019820Z",
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
  "command_id": "7fba606c-980a-451e-9976-fbf3d504e073",
  "quote_id": "1f8122d8-7e20-4d1b-9177-fef2ea27f120",
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
  "id": "1a4819be-4ad6-45f8-ade2-130312be8371",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "250559d2-88c6-4003-bd62-b02877f284f4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:21:10.319564Z",
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
    "id": "35ed7bf5-cb8a-47aa-a20a-9ae2f4f4a686",
    "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
    "expires_at": "2026-10-30T13:21:25.322455Z",
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

`POST /api/driver/v1/offers/35ed7bf5-cb8a-47aa-a20a-9ae2f4f4a686/accept` → **200**

```json
{
  "command_id": "5f01e0bf-ad1d-4547-b4d2-bb5c5bfcf3b4"
}
```

```json
{
  "id": "387e4dd2-5104-42b7-b061-fdfc5e696a94",
  "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eee7840f-883c-456e-8da0-fc0f507f4005",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eee7840f-883c-456e-8da0-fc0f507f4005",
  "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
  "assignment_id": "387e4dd2-5104-42b7-b061-fdfc5e696a94",
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

`POST /api/driver/v1/work-sessions/9c4a69fb-e64c-4cee-8ba3-752a8930e046/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:21:11Z",
    "sequence": 1793366471522
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c4a69fb-e64c-4cee-8ba3-752a8930e046",
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
  "last_heartbeat_at": "2026-10-30T13:21:11.540641Z",
  "last_location_at": "2026-10-30T13:21:11.540641Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/eee7840f-883c-456e-8da0-fc0f507f4005/arrive` → **200**

```json
{
  "command_id": "80a1c929-8db8-4c48-bd54-133f5225e07a",
  "expected_version": 0
}
```

```json
{
  "id": "eee7840f-883c-456e-8da0-fc0f507f4005",
  "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
  "assignment_id": "387e4dd2-5104-42b7-b061-fdfc5e696a94",
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
  "arrived_at": "2026-10-30T13:21:11.835315Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/eee7840f-883c-456e-8da0-fc0f507f4005/start` → **200**

```json
{
  "command_id": "56b6b770-9bdb-42d9-84df-d73fbfc5c019",
  "expected_version": 1
}
```

```json
{
  "id": "eee7840f-883c-456e-8da0-fc0f507f4005",
  "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
  "assignment_id": "387e4dd2-5104-42b7-b061-fdfc5e696a94",
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
  "arrived_at": "2026-10-30T13:21:11.835315Z",
  "started_at": "2026-10-30T13:21:12.135336Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/eee7840f-883c-456e-8da0-fc0f507f4005/complete` → **200**

```json
{
  "command_id": "df83ede0-b9f0-4d85-a052-bc89670432b3",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:21:12Z",
  "cash_received": false
}
```

```json
{
  "id": "eee7840f-883c-456e-8da0-fc0f507f4005",
  "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
  "assignment_id": "387e4dd2-5104-42b7-b061-fdfc5e696a94",
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
  "arrived_at": "2026-10-30T13:21:11.835315Z",
  "started_at": "2026-10-30T13:21:12.135336Z",
  "completed_at": "2026-10-30T13:21:12.444235Z",
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
  "session_id": "665afe68-fbed-44c2-8ae5-1b340eb3e556",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczNzMsImlhdCI6MTc5MzM2NjQ3MywianRpIjoiOTk5MDY5NTAtMDFhOS00NDZlLTgwOTEtYWM5MGFmODkzNzk3Iiwic2lkIjoiNjY1YWZlNjgtZmJlZC00NGMyLThhZTUtMWIzNDBlYjNlNTU2In0.Bt1I_--bVdHAi01VN4X-AUf31wUFOcPoLYL2rOq_qHE",
  "access_expires_at": "2026-10-30T13:36:13.036796981Z",
  "refresh_token": "fjWF9OYHS2OJm_l_DOf9I-n34i2aOdzGV2ebgj7LqUk",
  "refresh_expires_at": "2026-10-31T01:21:13.036201485Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/1a4819be-4ad6-45f8-ade2-130312be8371/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/1a4819be-4ad6-45f8-ade2-130312be8371/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "97aa9887-eda7-4bbc-80b3-12ec5d437a09"
}
```

`GET /api/admin/v1/orders/1a4819be-4ad6-45f8-ade2-130312be8371/cash-dispute` → **200**

```json
{
  "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "250559d2-88c6-4003-bd62-b02877f284f4",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:21:13.449119Z",
  "decide_by": "2026-11-13T13:21:13.449119Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T13:21:13.449119Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "250559d2-88c6-4003-bd62-b02877f284f4",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T13:21:13.449119Z",
      "decide_by": "2026-11-13T13:21:13.449119Z",
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

`POST /api/admin/v1/orders/1a4819be-4ad6-45f8-ade2-130312be8371/cash-dispute/decide` → **400**

```json
{
  "command_id": "3866d2a8-a5bf-4a74-ae35-09e809a9dcda",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/1a4819be-4ad6-45f8-ade2-130312be8371/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bd07c3a3-6123-4023-b249-58aa93005c54",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/1a4819be-4ad6-45f8-ade2-130312be8371/cash-dispute/decide` → **200**

```json
{
  "command_id": "3593d956-8ca1-45bd-88e1-86f55e5b71b4",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "250559d2-88c6-4003-bd62-b02877f284f4",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:21:13.449119Z",
  "decide_by": "2026-11-13T13:21:13.449119Z",
  "decision": "PAY_DRIVER",
  "decided_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T13:21:15.531809Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/1a4819be-4ad6-45f8-ade2-130312be8371/cash-dispute/decide` → **409**

```json
{
  "command_id": "f1e17e95-1347-48c3-9b60-af5bdb24b844",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/1a4819be-4ad6-45f8-ade2-130312be8371/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7f3cde47-7b2b-4d58-92ca-795479141823"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9c4a69fb-e64c-4cee-8ba3-752a8930e046",
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
  "last_heartbeat_at": "2026-10-30T13:21:11.540641Z",
  "last_location_at": "2026-10-30T13:21:11.540641Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c4a69fb-e64c-4cee-8ba3-752a8930e046/close` → **200**

```json
{
  "command_id": "35d083fb-72ca-4846-9314-f3d25ccb0cee",
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
  "phone": "+380737557726",
  "device_ref": "sandbox-22891"
}
```

```json
{
  "challenge_id": "7ac2edaa-3ea9-4d49-81da-337c4b8acd9a",
  "expires_at": "2026-10-30T13:26:16.713462852Z",
  "resend_available_at": "2026-10-30T13:21:17.713462852Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737557726` → **200**

```json
{
  "phone": "+380737557726",
  "audience": "CLIENT",
  "code": "921519",
  "sent_at": "2026-10-30T13:21:16.717315156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ac2edaa-3ea9-4d49-81da-337c4b8acd9a",
  "code": "921519",
  "device_ref": "sandbox-22891"
}
```

```json
{
  "session_id": "307bcab5-6bed-4882-89b9-92d55c561518",
  "subject": {
    "type": "CLIENT",
    "id": "f0892e7d-81aa-43ad-85e3-0d5815939c53"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDg5MmU3ZC04MWFhLTQzYWQtODVlMy0wZDU4MTU5MzljNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Mzc3LCJpYXQiOjE3OTMzNjY0NzcsImp0aSI6ImI3M2FmODQ5LTQ1OWQtNDI4ZS1iMDM0LTRmNzUyZjQ3YzUzNSIsInNpZCI6IjMwN2JjYWI1LTZiZWQtNDg4Mi04OWI5LTkyZDU1YzU2MTUxOCJ9.CzPH1M0Ecl9Nogg7JqcQEYZRLrq50DI91U-Xk-TC5X4",
  "access_expires_at": "2026-10-30T13:36:17.030752685Z",
  "refresh_token": "s57lM9jv_FMB69S-yZ0t7fI4q8UMBWMOry0pupw4QQo",
  "refresh_expires_at": "2026-11-29T13:21:17.030057762Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "fb1c81a8-1764-4c45-902d-bc0a991dc0e5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "0b3ec331-f608-4cee-b883-4cf204ff5c5e",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-0b3ec331-f608-4cee-b883-4cf204ff5c5e",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b45d49ba350ffa299f18edc42d54623c",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=0b3ec331-f608-4cee-b883-4cf204ff5c5e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737557726"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=0b3ec331-f608-4cee-b883-4cf204ff5c5e",
  "expires_at": "2026-10-30T13:51:17.325176Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/0b3ec331-f608-4cee-b883-4cf204ff5c5e` → **200**

```json
{
  "id": "0b3ec331-f608-4cee-b883-4cf204ff5c5e",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:51:17.325176Z",
  "card": {
    "id": "dc87909d-a953-487e-8b78-f21aabfe6bf5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8786",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:21:17.613718Z"
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
  "device_ref": "sandbox-31674"
}
```

```json
{
  "challenge_id": "bc2bc8d0-a6fc-4d6a-b268-3a98df6c49b0",
  "expires_at": "2026-10-30T13:26:17.933075664Z",
  "resend_available_at": "2026-10-30T13:21:18.933075664Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "599110",
  "sent_at": "2026-10-30T13:21:17.935707148Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc2bc8d0-a6fc-4d6a-b268-3a98df6c49b0",
  "code": "599110",
  "device_ref": "sandbox-31674"
}
```

```json
{
  "session_id": "07ebbe50-b440-4565-8179-76714379eead",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM3OCwiaWF0IjoxNzkzMzY2NDc4LCJqdGkiOiJjOGQyZWJlYi0yNWM2LTQyM2ItYmYwNC0xNWVkZGJhNjBhZWQiLCJzaWQiOiIwN2ViYmU1MC1iNDQwLTQ1NjUtODE3OS03NjcxNDM3OWVlYWQifQ.N0EDXtGJ2aRGRjeGF0oXlVrQ-0OE02Kv5jSn08KoOUw",
  "access_expires_at": "2026-10-30T13:36:18.256402746Z",
  "refresh_token": "2GjvFEfu8yzgxvuHfddHLFNB9KejwqiCUEPjzbxUB9k",
  "refresh_expires_at": "2026-11-29T13:21:18.255838131Z",
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
  "command_id": "2813ae59-dc26-4d90-8fe4-bf648fadf2a3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:21:18Z",
    "sequence": 1793366478837
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2d99b154-6796-4b87-a874-4a0afed4082e",
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
  "last_heartbeat_at": "2026-10-30T13:21:18.855987Z",
  "last_location_at": "2026-10-30T13:21:18.855987Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "112049f0-822e-4087-9a6a-4dfae4e144b0",
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
  "id": "b88f2018-db07-4ef2-9721-1dcc6bf3832a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:26:19.162490Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "4c2af0cb-af63-4afd-b0ff-6779da865d4a",
  "quote_id": "b88f2018-db07-4ef2-9721-1dcc6bf3832a",
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
  "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
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
  "created_at": "2026-10-30T13:21:19.472855Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361` → **200**

```json
{
  "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
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
  "created_at": "2026-10-30T13:21:19.472855Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361` → **200**

```json
{
  "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
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
  "created_at": "2026-10-30T13:21:19.472855Z",
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
    "id": "3a2cb666-21ea-430e-a082-af846d40d088",
    "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
    "expires_at": "2026-10-30T13:21:35.494396Z",
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

`POST /api/driver/v1/offers/3a2cb666-21ea-430e-a082-af846d40d088/accept` → **200**

```json
{
  "command_id": "bbbcbdc1-8fc4-4e4e-8e97-c020f5dd5369"
}
```

```json
{
  "id": "f8765e7f-6008-42cb-b863-9240b5dd7b56",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3d132a74-da94-4be6-9a1c-09c6c9a8e921",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3d132a74-da94-4be6-9a1c-09c6c9a8e921",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "assignment_id": "f8765e7f-6008-42cb-b863-9240b5dd7b56",
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

`POST /api/rider/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/messages` → **201**

```json
{
  "command_id": "e5251d86-45b7-4143-ac14-4cad3a4dd074",
  "body": "Я біля входу, мій номер +380737557726, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "87a09bf8-6252-4a86-99de-2d5cd2550938",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737557726, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T13:21:22.304522533Z"
}
```

`POST /api/driver/v1/trips/3d132a74-da94-4be6-9a1c-09c6c9a8e921/messages` → **201**

```json
{
  "command_id": "887448a0-a32f-4705-8745-a29a1b6bd4c4",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "bfa66d64-cf05-49c1-9351-fb387b1b9b4a",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T13:21:22.615583272Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/2d99b154-6796-4b87-a874-4a0afed4082e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:21:27Z",
    "sequence": 1793366487941
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2d99b154-6796-4b87-a874-4a0afed4082e",
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
  "last_heartbeat_at": "2026-10-30T13:21:27.961568Z",
  "last_location_at": "2026-10-30T13:21:27.961568Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/3d132a74-da94-4be6-9a1c-09c6c9a8e921/arrive` → **200**

```json
{
  "command_id": "d0cb2cf9-4a6d-4e1d-8ca6-2b4df12a57a7",
  "expected_version": 0
}
```

```json
{
  "id": "3d132a74-da94-4be6-9a1c-09c6c9a8e921",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "assignment_id": "f8765e7f-6008-42cb-b863-9240b5dd7b56",
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
  "arrived_at": "2026-10-30T13:21:28.267368Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3d132a74-da94-4be6-9a1c-09c6c9a8e921/start` → **200**

```json
{
  "command_id": "81fe5494-83de-4f9d-b6b1-7a6399ca5fc8",
  "expected_version": 1
}
```

```json
{
  "id": "3d132a74-da94-4be6-9a1c-09c6c9a8e921",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "assignment_id": "f8765e7f-6008-42cb-b863-9240b5dd7b56",
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
  "arrived_at": "2026-10-30T13:21:28.267368Z",
  "started_at": "2026-10-30T13:21:28.582397Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/2d99b154-6796-4b87-a874-4a0afed4082e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:22:58Z",
    "sequence": 1793366578897
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2d99b154-6796-4b87-a874-4a0afed4082e",
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
  "last_heartbeat_at": "2026-10-30T13:22:58.918579Z",
  "last_location_at": "2026-10-30T13:22:58.918579Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/3d132a74-da94-4be6-9a1c-09c6c9a8e921/complete` → **200**

```json
{
  "command_id": "12081145-ce71-4cc8-aa62-691eec1dd475",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:22:59Z",
  "cash_received": false
}
```

```json
{
  "id": "3d132a74-da94-4be6-9a1c-09c6c9a8e921",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "assignment_id": "f8765e7f-6008-42cb-b863-9240b5dd7b56",
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
  "arrived_at": "2026-10-30T13:21:28.267368Z",
  "started_at": "2026-10-30T13:21:28.582397Z",
  "completed_at": "2026-10-30T13:22:59.233959Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361` → **200**

```json
{
  "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
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
    "id": "f8765e7f-6008-42cb-b863-9240b5dd7b56",
    "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3d132a74-da94-4be6-9a1c-09c6c9a8e921",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:21:19.472855Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361` → **200**

```json
{
  "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
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
    "id": "f8765e7f-6008-42cb-b863-9240b5dd7b56",
    "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3d132a74-da94-4be6-9a1c-09c6c9a8e921",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:21:19.472855Z",
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
  "session_id": "2d99b154-6796-4b87-a874-4a0afed4082e",
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
  "last_heartbeat_at": "2026-10-30T13:22:58.918579Z",
  "last_location_at": "2026-10-30T13:22:58.918579Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2d99b154-6796-4b87-a874-4a0afed4082e/close` → **200**

```json
{
  "command_id": "0e88d391-7249-4790-8c20-0c4b356663df",
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
  "session_id": "3a99ed01-7d68-4227-8fa2-c2976e1ac017",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc0ODIsImlhdCI6MTc5MzM2NjU4MiwianRpIjoiNjE4Yjg5MzEtZTY0NC00MjVhLThhYmEtZGQxMTM3MDZjN2NhIiwic2lkIjoiM2E5OWVkMDEtN2Q2OC00MjI3LThmYTItYzI5NzZlMWFjMDE3In0.t8nUkn4lDIbJwrLyazuYOdpViyHu6wHXQSrRgHBqLOE",
  "access_expires_at": "2026-10-30T13:38:02.119564174Z",
  "refresh_token": "PtW7nnSmyPHTN9owiQ6oQvOk92fbQJ227muNXLOZ7rI",
  "refresh_expires_at": "2026-10-31T01:23:02.118924587Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "479ed2a5-7a25-4266-a56a-86a21eb69a25"
}
```

`GET /api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T13:23:02.718561033Z",
  "order": {
    "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
    "short_number": 10,
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
    "created_at": "2026-10-30T13:21:19.472855Z",
    "assigned_at": "2026-10-30T13:21:21.709375Z",
    "arrived_at": "2026-10-30T13:21:28.267368Z",
    "started_at": "2026-10-30T13:21:28.582397Z",
    "completed_at": "2026-10-30T13:22:59.233959Z"
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
    "id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
    "registered_at": "2026-10-30T13:21:17.028152Z",
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
      "created_at": "2026-10-30T13:21:19.475144Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T13:22:59.690665Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/chargebacks` → **422**

```json
{
  "command_id": "de4472a1-15ac-49af-a8d3-87bb0a387085",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "45ab256e-be76-4897-8b0d-0bb9c6d3922a"
}
```

`POST /api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/chargebacks` → **201**

```json
{
  "command_id": "dd979df0-2f85-4167-8d66-f32b12fb0c18",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "74172128-f7d3-4f99-ab06-f61d1dcc9f2a",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:23:03.405396Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/chargebacks` → **201**

```json
{
  "command_id": "dd979df0-2f85-4167-8d66-f32b12fb0c18",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "74172128-f7d3-4f99-ab06-f61d1dcc9f2a",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:23:03.405396Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/f0892e7d-81aa-43ad-85e3-0d5815939c53` → **200**

```json
{
  "client": {
    "id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
    "phone": "+380737557726",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:21:17.028152Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:21:19.472855Z",
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

`POST /api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/chargebacks/74172128-f7d3-4f99-ab06-f61d1dcc9f2a/resolve` → **200**

```json
{
  "command_id": "574c28ad-1270-4762-a693-24fb6e8540b0",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "74172128-f7d3-4f99-ab06-f61d1dcc9f2a",
  "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T13:23:03.405396Z",
  "resolved_at": "2026-10-30T13:23:04.385956Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/f0892e7d-81aa-43ad-85e3-0d5815939c53` → **200**

```json
{
  "client": {
    "id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
    "phone": "+380737557726",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:21:17.028152Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:21:19.472855Z",
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

`GET /api/admin/v1/clients/f0892e7d-81aa-43ad-85e3-0d5815939c53` → **200**

```json
{
  "client": {
    "id": "f0892e7d-81aa-43ad-85e3-0d5815939c53",
    "phone": "+380737557726",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:21:17.028152Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:21:19.472855Z",
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

`POST /api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/chargebacks/74172128-f7d3-4f99-ab06-f61d1dcc9f2a/resolve` → **409**

```json
{
  "command_id": "d0eca459-d2b4-4745-8e7a-747663a57a9d",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/chargebacks/74172128-f7d3-4f99-ab06-f61d1dcc9f2a/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c54f384e-604f-4fac-a6a7-f641c595857d"
}
```

`GET /api/admin/v1/orders/89a68a9f-0ad4-497f-ba51-3b6dcdb4d361/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "74172128-f7d3-4f99-ab06-f61d1dcc9f2a",
      "order_id": "89a68a9f-0ad4-497f-ba51-3b6dcdb4d361",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T13:23:03.405396Z",
      "resolved_at": "2026-10-30T13:23:04.385956Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 89a68a9f-0ad4-497f-ba51-3b6dcdb4d361 without phone or card digits; chargeback 74172128-f7d3-4f99-ab06-f61d1dcc9f2a recorded and won.

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
  "session_id": "aa4d4dcf-5224-47fb-879c-8a89aa1e0900",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc0ODcsImlhdCI6MTc5MzM2NjU4NywianRpIjoiNTVmZDM4NTUtYzQ5ZS00NmU1LWE0Y2MtMmY1NWMxNzM5YzI4Iiwic2lkIjoiYWE0ZDRkY2YtNTIyNC00N2ZiLTg3OWMtOGE4OWFhMWUwOTAwIn0.gL1zJLW8s4PFaCYFibLBrHS7uGm77AReTOXRhua8x5A",
  "access_expires_at": "2026-10-30T13:38:07.543842186Z",
  "refresh_token": "4ihhLvb_d_BkWJk1PGZQZ1rixzAJC9xE-72v6-CQHeU",
  "refresh_expires_at": "2026-10-31T01:23:07.5431834Z",
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
  "phone": "+48600315349",
  "device_ref": "sandbox-4626"
}
```

```json
{
  "challenge_id": "bb4bbf29-6ae8-4e76-b7bf-b475888b09a9",
  "expires_at": "2026-10-30T13:28:08.434054479Z",
  "resend_available_at": "2026-10-30T13:23:09.434054479Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600315349` → **200**

```json
{
  "phone": "+48600315349",
  "audience": "CLIENT",
  "code": "924038",
  "sent_at": "2026-10-30T13:23:08.436812399Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb4bbf29-6ae8-4e76-b7bf-b475888b09a9",
  "code": "924038",
  "device_ref": "sandbox-4626"
}
```

```json
{
  "session_id": "34eb88d2-d09e-4af7-9864-9449be923cd7",
  "subject": {
    "type": "CLIENT",
    "id": "e70511b6-347a-4a0f-9c5a-758f3a05e41f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzA1MTFiNi0zNDdhLTRhMGYtOWM1YS03NThmM2EwNWU0MWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NDg4LCJpYXQiOjE3OTMzNjY1ODgsImp0aSI6IjIzOGZlYTQ1LTE5NGYtNGI4NC1iMGFiLWU1NzZjMTdjNjQ3ZCIsInNpZCI6IjM0ZWI4OGQyLWQwOWUtNGFmNy05ODY0LTk0NDliZTkyM2NkNyJ9.XzW2wwddyp2B6OxBcxSv3L4zx2ywGo9rdlgIlEoFBlI",
  "access_expires_at": "2026-10-30T13:38:08.751321743Z",
  "refresh_token": "4kS5mRacsQkA0cqwXPEnFCVfcf5a84PkD4WDirgc4XE",
  "refresh_expires_at": "2026-11-29T13:23:08.750797418Z",
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
  "command_id": "9d402776-cdd6-40b7-a000-18f5295d67a3",
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
  "correlation_id": "dd6b55d8-55d6-4576-ab5a-6a3f9ac45934",
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
  "command_id": "7d29bcdc-e35f-41d8-8f74-bee689598960",
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
  "paused_at": "2026-10-30T13:23:09.905119067Z",
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
  "command_id": "3c6e8983-a18c-4eb3-8247-9ce41d5e020b",
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
  "id": "9ac52add-e2b9-4261-be6b-05a2cf0ccf90",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:10.505372Z",
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
  "command_id": "8b2ba480-5159-42b9-a3db-eac089b6c451",
  "quote_id": "9ac52add-e2b9-4261-be6b-05a2cf0ccf90",
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
  "correlation_id": "9c9ddf06-d200-4a22-81f1-db639dfa69f9"
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
  "paused_at": "2026-10-30T13:23:09.905119Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "e4e2474b-cd72-4669-b091-4c9f02fb42f3",
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
  "command_id": "92c7eb79-122e-4af1-b62e-e70a5a1769bd",
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
  "command_id": "67aaf806-663e-497f-a09e-26326bed69c4",
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
  "id": "dafe1de0-aaf7-42ce-9dc6-68127fe7cf07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:12.324040Z",
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
  "command_id": "f2e790dc-f030-4009-9623-e4b3fb4441ea",
  "quote_id": "dafe1de0-aaf7-42ce-9dc6-68127fe7cf07",
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
  "correlation_id": "e82a47c2-3890-4bf8-ae67-231652f81ff4"
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
  "command_id": "920f53a7-e7b2-493f-8ea8-ced63c76db92",
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
  "command_id": "3477e961-3723-4609-9cce-271ede42bd65",
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
  "id": "72944308-9fcd-43e1-830c-0c59ed35ffff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:13.538927Z",
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
  "command_id": "ad4a7ad9-e9ed-4170-a581-a9f14911f2c5",
  "quote_id": "72944308-9fcd-43e1-830c-0c59ed35ffff",
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
  "correlation_id": "70ee604c-61be-4e88-9c2b-a3028312b85a"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "6591d9c2-312d-494c-995d-857bd382ce11",
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
  "correlation_id": "cb1c92f4-cfff-4a48-8f21-26cabae6f235",
  "current_version": 4
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
  "command_id": "2e4abb96-8cf6-4c2b-8dbd-666591aa78ee",
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
  "phone": "+380675562495",
  "device_ref": "sandbox-32260"
}
```

```json
{
  "challenge_id": "5934d0c5-7117-4d82-8808-d21cee288f6d",
  "expires_at": "2026-10-30T13:28:15.087422042Z",
  "resend_available_at": "2026-10-30T13:23:16.087422042Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675562495` → **200**

```json
{
  "phone": "+380675562495",
  "audience": "CLIENT",
  "code": "366834",
  "sent_at": "2026-10-30T13:23:15.090141312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5934d0c5-7117-4d82-8808-d21cee288f6d",
  "code": "366834",
  "device_ref": "sandbox-32260"
}
```

```json
{
  "session_id": "69b0e495-6b0a-49f1-b274-5ae2860876d3",
  "subject": {
    "type": "CLIENT",
    "id": "8365fdc8-c33d-4065-923f-b3e49c7261bb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzY1ZmRjOC1jMzNkLTQwNjUtOTIzZi1iM2U0OWM3MjYxYmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NDk1LCJpYXQiOjE3OTMzNjY1OTUsImp0aSI6IjAyN2FmYzdlLTFiYzMtNGJjYS05YzM5LWUwZTMxZjg5OTY3MSIsInNpZCI6IjY5YjBlNDk1LTZiMGEtNDlmMS1iMjc0LTVhZTI4NjA4NzZkMyJ9.CbUOYobLt4FGXZoxYtfyvD5o3r_R__JPU2bYj9h2M6Q",
  "access_expires_at": "2026-10-30T13:38:15.40967424Z",
  "refresh_token": "OVHVaiU6F9vLrDLkEG8RNUekDaIYwwySQn3p9wfIEXY",
  "refresh_expires_at": "2026-11-29T13:23:15.40915889Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8365fdc8-c33d-4065-923f-b3e49c7261bb",
  "session_id": "69b0e495-6b0a-49f1-b274-5ae2860876d3",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4bcc23a8-9c3a-4b51-8786-a9ffc48715e1",
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
  "id": "b2e74ecb-3b7c-4e9e-8c9a-72688f174a31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:16.001074Z",
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
  "challenge_id": "93cf616b-be61-4ca6-ae3b-628b4cde06c8",
  "expires_at": "2026-10-30T13:28:18.331055326Z",
  "resend_available_at": "2026-10-30T13:23:19.331055326Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675562495` → **200**

```json
{
  "phone": "+380675562495",
  "audience": "CLIENT",
  "code": "688911",
  "sent_at": "2026-10-30T13:23:18.333588335Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "eebc82e9-24dc-4d1f-81d5-74e2e13531c1",
  "challenge_id": "93cf616b-be61-4ca6-ae3b-628b4cde06c8",
  "otp_code": "688911"
}
```

```json
{
  "client_id": "8365fdc8-c33d-4065-923f-b3e49c7261bb",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T13:23:18.66704784Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "28c26c71-7817-4920-925f-1ff7322e5651",
  "quote_id": "b2e74ecb-3b7c-4e9e-8c9a-72688f174a31",
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
  "correlation_id": "f161fffe-02df-464d-a3b7-6efc573f7205"
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
  "session_id": "5122b229-e615-4ab6-ba94-c940c05815e3",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc0OTksImlhdCI6MTc5MzM2NjU5OSwianRpIjoiNmZiNGVmNDMtNjQ2OC00YjI5LWEzMzAtMGNkMjAxNjU3OTlmIiwic2lkIjoiNTEyMmIyMjktZTYxNS00YWI2LWJhOTQtYzk0MGMwNTgxNWUzIn0.P1ruQku6k03uW8wY4k9EuOo75OrALO9wDOYTIaw0ggM",
  "access_expires_at": "2026-10-30T13:38:19.564175467Z",
  "refresh_token": "jia3SwYyBK4yalg7FQl4ualslFR4cOublaN2YTr0p1A",
  "refresh_expires_at": "2026-10-31T01:23:19.563569794Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "8365fdc8-c33d-4065-923f-b3e49c7261bb",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T13:23:18.667048Z",
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

`POST /api/admin/v1/client-deletions/8365fdc8-c33d-4065-923f-b3e49c7261bb/complete` → **200**

```json
{
  "command_id": "816f5c44-adb0-4c21-a3f1-636fd5113994",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "8365fdc8-c33d-4065-923f-b3e49c7261bb",
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
  "correlation_id": "c75bdf95-220f-499e-82fb-200d6b22f0a2"
}
```

Done: client 8365fdc8-c33d-4065-923f-b3e49c7261bb anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668882499",
  "device_ref": "sandbox-6645"
}
```

```json
{
  "challenge_id": "3c46566e-9b0b-455a-b0af-f6c45256b886",
  "expires_at": "2026-10-30T13:28:20.742261572Z",
  "resend_available_at": "2026-10-30T13:23:21.742261572Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668882499` → **200**

```json
{
  "phone": "+380668882499",
  "audience": "CLIENT",
  "code": "792028",
  "sent_at": "2026-10-30T13:23:20.745114186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c46566e-9b0b-455a-b0af-f6c45256b886",
  "code": "792028",
  "device_ref": "sandbox-6645"
}
```

```json
{
  "session_id": "57c048d9-d536-4d9c-a9eb-85210ff23b7e",
  "subject": {
    "type": "CLIENT",
    "id": "0b4b2f78-8e62-482b-8c07-25d046220e34"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjRiMmY3OC04ZTYyLTQ4MmItOGMwNy0yNWQwNDYyMjBlMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTAxLCJpYXQiOjE3OTMzNjY2MDEsImp0aSI6ImY1OTY0YmJjLTM4ZDEtNGI2My04ZGZhLTM2YTA1NTg0MTI4MiIsInNpZCI6IjU3YzA0OGQ5LWQ1MzYtNGQ5Yy1hOWViLTg1MjEwZmYyM2I3ZSJ9.2f4XnAbEJ8QaXr_2-MOvskMV9zKoA8Cgbd6xB-7QJjU",
  "access_expires_at": "2026-10-30T13:38:21.055415407Z",
  "refresh_token": "UkWsUSC4cgkGUx1LoexenBwpneLVH1hSdXoBgHwMD-U",
  "refresh_expires_at": "2026-11-29T13:23:21.05489739Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0b4b2f78-8e62-482b-8c07-25d046220e34",
  "session_id": "57c048d9-d536-4d9c-a9eb-85210ff23b7e",
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
  "session_id": "77e9b23b-6d7b-42c0-a654-d29619c2385e",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1MDEsImlhdCI6MTc5MzM2NjYwMSwianRpIjoiYTk2MDEyNTYtZWY3Ny00ODA4LWFjYWItY2IyMDNjN2JkYWYyIiwic2lkIjoiNzdlOWIyM2ItNmQ3Yi00MmMwLWE2NTQtZDI5NjE5YzIzODVlIn0.d0LloWdypHic-FhqF1s3BHPXtEX4r6b1Bo44yz936G8",
  "access_expires_at": "2026-10-30T13:38:21.933614727Z",
  "refresh_token": "ud8socPRHK6DOCxQ2z_iKCYzT3pogPfJsb808fUF9aw",
  "refresh_expires_at": "2026-10-31T01:23:21.933081531Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8882499&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "0b4b2f78-8e62-482b-8c07-25d046220e34",
      "phone": "+380668882499",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T13:23:21.053172Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/0b4b2f78-8e62-482b-8c07-25d046220e34` → **200**

```json
{
  "client": {
    "id": "0b4b2f78-8e62-482b-8c07-25d046220e34",
    "phone": "+380668882499",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:23:21.053172Z",
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

`POST /api/admin/v1/clients/0b4b2f78-8e62-482b-8c07-25d046220e34/block` → **400**

```json
{
  "command_id": "563f0efc-7da7-457d-8ecf-f32ee656f51f",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/0b4b2f78-8e62-482b-8c07-25d046220e34/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d722cca7-39b7-4007-8fe8-e50849f4cb0e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/0b4b2f78-8e62-482b-8c07-25d046220e34/block` → **200**

```json
{
  "command_id": "6f8455cf-d233-4504-89d4-56599393bbf5",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "0b4b2f78-8e62-482b-8c07-25d046220e34",
  "phone": "+380668882499",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T13:23:21.053172Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T13:23:23.14149Z",
    "by": "6fbdd889-5214-4e17-b720-9961d4657bb6"
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
  "correlation_id": "c4acf61d-ac96-42a5-940a-f9838b96b8d3"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668882499",
  "device_ref": "sandbox-16084"
}
```

```json
{
  "challenge_id": "5a2d1b12-556d-42b3-a628-3bdf3aecaa82",
  "expires_at": "2026-10-30T13:28:25.729384558Z",
  "resend_available_at": "2026-10-30T13:23:26.729384558Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668882499` → **200**

```json
{
  "phone": "+380668882499",
  "audience": "CLIENT",
  "code": "970048",
  "sent_at": "2026-10-30T13:23:25.732019189Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "5a2d1b12-556d-42b3-a628-3bdf3aecaa82",
  "code": "970048",
  "device_ref": "sandbox-16084"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "12f8c885-9e2f-414a-9151-93b5b9199102"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/0b4b2f78-8e62-482b-8c07-25d046220e34` → **200**

```json
{
  "client": {
    "id": "0b4b2f78-8e62-482b-8c07-25d046220e34",
    "phone": "+380668882499",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T13:23:21.053172Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T13:23:23.14149Z",
      "by": "6fbdd889-5214-4e17-b720-9961d4657bb6"
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

`POST /api/admin/v1/clients/0b4b2f78-8e62-482b-8c07-25d046220e34/unblock` → **200**

```json
{
  "command_id": "67deb47f-34ee-4c83-b235-00ccaa832273",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "0b4b2f78-8e62-482b-8c07-25d046220e34",
  "phone": "+380668882499",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T13:23:21.053172Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668882499",
  "device_ref": "sandbox-27820"
}
```

```json
{
  "challenge_id": "1fc2e78d-c4c7-49ec-a4e4-287fa8ed7e7b",
  "expires_at": "2026-10-30T13:28:28.983425129Z",
  "resend_available_at": "2026-10-30T13:23:29.983425129Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668882499` → **200**

```json
{
  "phone": "+380668882499",
  "audience": "CLIENT",
  "code": "192433",
  "sent_at": "2026-10-30T13:23:28.986104679Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fc2e78d-c4c7-49ec-a4e4-287fa8ed7e7b",
  "code": "192433",
  "device_ref": "sandbox-27820"
}
```

```json
{
  "session_id": "0fe53fc9-3020-44ec-8de3-b375dab2e90d",
  "subject": {
    "type": "CLIENT",
    "id": "0b4b2f78-8e62-482b-8c07-25d046220e34"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjRiMmY3OC04ZTYyLTQ4MmItOGMwNy0yNWQwNDYyMjBlMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTA5LCJpYXQiOjE3OTMzNjY2MDksImp0aSI6IjYxM2MwYWJkLTM1ZmEtNDA5Mi04MGYwLWRmNzYyMGU4OGU0YSIsInNpZCI6IjBmZTUzZmM5LTMwMjAtNDRlYy04ZGUzLWIzNzVkYWIyZTkwZCJ9.CJlPlDNwW8ca_Vp-68Ze5VQy1MY0M4cXALEu7iYXxQE",
  "access_expires_at": "2026-10-30T13:38:29.300409405Z",
  "refresh_token": "ZAl9w7Ec6zrPwnf30UjpqeaMbk5dJ_wK19zsEU1qhAY",
  "refresh_expires_at": "2026-11-29T13:23:29.299892479Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0b4b2f78-8e62-482b-8c07-25d046220e34",
  "session_id": "0fe53fc9-3020-44ec-8de3-b375dab2e90d",
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
  "phone": "+380664448193",
  "device_ref": "sandbox-27252"
}
```

```json
{
  "challenge_id": "c8207b5f-58c1-4e50-a1d0-532f57e719f8",
  "expires_at": "2026-10-30T13:28:29.883971331Z",
  "resend_available_at": "2026-10-30T13:23:30.883971331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664448193` → **200**

```json
{
  "phone": "+380664448193",
  "audience": "CLIENT",
  "code": "903698",
  "sent_at": "2026-10-30T13:23:29.886930692Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8207b5f-58c1-4e50-a1d0-532f57e719f8",
  "code": "903698",
  "device_ref": "sandbox-27252"
}
```

```json
{
  "session_id": "93ae7d70-73f5-4d48-952d-37e7b95ff71f",
  "subject": {
    "type": "CLIENT",
    "id": "a86041a5-fc03-48e4-9fa2-808b92b86559"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODYwNDFhNS1mYzAzLTQ4ZTQtOWZhMi04MDhiOTJiODY1NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTEwLCJpYXQiOjE3OTMzNjY2MTAsImp0aSI6IjJhZGMxMmUyLWFkMDgtNDkzNi05MWZlLTJhYTViY2Q0YmVmZSIsInNpZCI6IjkzYWU3ZDcwLTczZjUtNGQ0OC05NTJkLTM3ZTdiOTVmZjcxZiJ9.YdN11IgQRaUCDEAokf8Vc1M8l6r3lF4KZDRZJOQXwb0",
  "access_expires_at": "2026-10-30T13:38:30.203014099Z",
  "refresh_token": "fT0EsJcLJlwsYh_e3MbFRkh-m8I7hInEeAzCwsuZzro",
  "refresh_expires_at": "2026-11-29T13:23:30.20235221Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d4866f86-7627-4337-9c9b-740694f35797",
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
  "id": "cbd50d47-0d99-4e97-81d0-76b624134e61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:30.492578Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 73092639-39d0-4f52-b10b-3df677f85b69) → **201**

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
  "session_id": "a1e00c7a-02f2-4a77-a0e3-c1cae5851818",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1MTEsImlhdCI6MTc5MzM2NjYxMSwianRpIjoiZTkzNjZmOTItZjFkNy00ZTc3LTg4MzYtZTY4Y2I2OWI2MDJhIiwic2lkIjoiYTFlMDBjN2EtMDJmMi00YTc3LWEwZTMtYzFjYWU1ODUxODE4In0.yCz6RIm4bojejBPoGAM8HtqJc2ouOVb6yW3OQOmezPM",
  "access_expires_at": "2026-10-30T13:38:31.117079706Z",
  "refresh_token": "jeRHmBsFTvd9aFYTmpJSpVQTpXcv9kcbsXNAT42uQCc",
  "refresh_expires_at": "2026-10-31T01:23:31.116392417Z",
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
  "session_id": "b4dfd18c-f12c-4dae-b833-20d7e196a363",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1MTEsImlhdCI6MTc5MzM2NjYxMSwianRpIjoiNGYyY2E5ZDAtOWFjNi00ZjNjLWJkMDEtNGQ4ZTVjZmNlNTZkIiwic2lkIjoiYjRkZmQxOGMtZjEyYy00ZGFlLWI4MzMtMjBkN2UxOTZhMzYzIn0.0-gMHT6HYhqmtXiR-wPsV8UL63giXaphtyUSULXFv_k",
  "access_expires_at": "2026-10-30T13:38:31.693713036Z",
  "refresh_token": "aFdTa3HG5V9-uWqCs3U5nGbkVUL5I5YBVkvpNb6IaOQ",
  "refresh_expires_at": "2026-10-31T01:23:31.69312628Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f98a4916-1150-480a-8494-a9ccb2e233f9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:23:30.785025Z",
      "actor": {
        "type": "CLIENT",
        "id": "a86041a5-fc03-48e4-9fa2-808b92b86559",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f98a4916-1150-480a-8494-a9ccb2e233f9",
        "quote_id": "cbd50d47-0d99-4e97-81d0-76b624134e61",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "73092639-39d0-4f52-b10b-3df677f85b69"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:23:30.78728Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f98a4916-1150-480a-8494-a9ccb2e233f9",
        "attempt_id": "95855dcc-5a45-406e-9bcb-bc63875e26fc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "73092639-39d0-4f52-b10b-3df677f85b69"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T13:23:30.798472Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f98a4916-1150-480a-8494-a9ccb2e233f9",
        "attempt_id": "95855dcc-5a45-406e-9bcb-bc63875e26fc"
      },
      "correlation_id": "73092639-39d0-4f52-b10b-3df677f85b69"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "95855dcc-5a45-406e-9bcb-bc63875e26fc",
        "generation": 1,
        "started_at": "2026-10-30T13:23:30.786166Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T13:23:30.798472Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T13:23:30.788188Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/73092639-39d0-4f52-b10b-3df677f85b69` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "f98a4916-1150-480a-8494-a9ccb2e233f9:0",
      "order_id": "f98a4916-1150-480a-8494-a9ccb2e233f9",
      "at": "2026-10-30T13:23:30.785025Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f98a4916-1150-480a-8494-a9ccb2e233f9:1",
      "order_id": "f98a4916-1150-480a-8494-a9ccb2e233f9",
      "at": "2026-10-30T13:23:30.78728Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f98a4916-1150-480a-8494-a9ccb2e233f9:2",
      "order_id": "f98a4916-1150-480a-8494-a9ccb2e233f9",
      "at": "2026-10-30T13:23:30.798472Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/d0c2432f-25bc-4d2a-aa94-675edd1292c0` → **200**

```json
{
  "found": []
}
```

Done: request 73092639-39d0-4f52-b10b-3df677f85b69 — order f98a4916-1150-480a-8494-a9ccb2e233f9 found by its id.

`GET /api/rider/v1/orders/f98a4916-1150-480a-8494-a9ccb2e233f9` → **200**

```json
{
  "id": "f98a4916-1150-480a-8494-a9ccb2e233f9",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a86041a5-fc03-48e4-9fa2-808b92b86559",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:23:30.784232Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f98a4916-1150-480a-8494-a9ccb2e233f9/cancel` → **200**

```json
{
  "command_id": "ed02ec6c-67d9-4e28-aa75-3a762e788aac",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f98a4916-1150-480a-8494-a9ccb2e233f9",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a86041a5-fc03-48e4-9fa2-808b92b86559",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:23:30.784232Z",
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
  "phone": "+380637627254",
  "device_ref": "sandbox-1313"
}
```

```json
{
  "challenge_id": "d2d427a2-ef6a-4f59-b706-45dd8925860e",
  "expires_at": "2026-10-30T13:28:33.483334066Z",
  "resend_available_at": "2026-10-30T13:23:34.483334066Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637627254` → **200**

```json
{
  "phone": "+380637627254",
  "audience": "CLIENT",
  "code": "839825",
  "sent_at": "2026-10-30T13:23:33.486565034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2d427a2-ef6a-4f59-b706-45dd8925860e",
  "code": "839825",
  "device_ref": "sandbox-1313"
}
```

```json
{
  "session_id": "396a7a05-869f-4e26-b367-794b4cfe8272",
  "subject": {
    "type": "CLIENT",
    "id": "a65b94ed-f928-497f-af1f-45ee8b5baf08"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjViOTRlZC1mOTI4LTQ5N2YtYWYxZi00NWVlOGI1YmFmMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTEzLCJpYXQiOjE3OTMzNjY2MTMsImp0aSI6ImMxNWVkYmU0LWFlM2YtNDFlYy04NjQ1LTMwZTg1OTQwZjRlNCIsInNpZCI6IjM5NmE3YTA1LTg2OWYtNGUyNi1iMzY3LTc5NGI0Y2ZlODI3MiJ9.7-xK0ZTlykYrUu2ejUJ9xvASy-jEFZjwG9dfGZ41n2k",
  "access_expires_at": "2026-10-30T13:38:33.807384048Z",
  "refresh_token": "sAdketihqCXiJkfMxkzYLYp8BsIXF1ml2I0_uc68KeI",
  "refresh_expires_at": "2026-11-29T13:23:33.806806218Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "71d602ac-479d-4307-ad3e-523d7cb46eea",
  "expires_at": "2026-10-30T13:28:36.115903501Z",
  "resend_available_at": "2026-10-30T13:23:37.115903501Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637627254` → **200**

```json
{
  "phone": "+380637627254",
  "audience": "CLIENT",
  "code": "489744",
  "sent_at": "2026-10-30T13:23:36.118399142Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "4e84c48f-9e6d-4d80-93f6-3b1e30d90a9a",
  "challenge_id": "71d602ac-479d-4307-ad3e-523d7cb46eea",
  "otp_code": "489744"
}
```

```json
{
  "id": "c85535d2-198c-4222-a93c-6a8212f70c66",
  "state": "PENDING",
  "created_at": "2026-10-30T13:23:36.452497Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/c85535d2-198c-4222-a93c-6a8212f70c66` → **200**

```json
{
  "id": "c85535d2-198c-4222-a93c-6a8212f70c66",
  "state": "PENDING",
  "created_at": "2026-10-30T13:23:36.452497Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c85535d2-198c-4222-a93c-6a8212f70c66` → **200**

```json
{
  "id": "c85535d2-198c-4222-a93c-6a8212f70c66",
  "state": "PENDING",
  "created_at": "2026-10-30T13:23:36.452497Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/c85535d2-198c-4222-a93c-6a8212f70c66` → **200**

```json
{
  "id": "c85535d2-198c-4222-a93c-6a8212f70c66",
  "state": "READY",
  "created_at": "2026-10-30T13:23:36.452497Z",
  "ready_at": "2026-10-30T13:23:39.176341Z",
  "expires_at": "2026-11-06T13:23:39.176341Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/c85535d2-198c-4222-a93c-6a8212f70c66/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633278162",
  "device_ref": "sandbox-8863"
}
```

```json
{
  "challenge_id": "deac92da-6cb5-4bf9-a44b-cac11e189a3c",
  "expires_at": "2026-10-30T13:28:39.661852987Z",
  "resend_available_at": "2026-10-30T13:23:40.661852987Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633278162` → **200**

```json
{
  "phone": "+380633278162",
  "audience": "CLIENT",
  "code": "489300",
  "sent_at": "2026-10-30T13:23:39.664576298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "deac92da-6cb5-4bf9-a44b-cac11e189a3c",
  "code": "489300",
  "device_ref": "sandbox-8863"
}
```

```json
{
  "session_id": "b49a0f72-5974-4f27-817d-d2a55bfa0599",
  "subject": {
    "type": "CLIENT",
    "id": "55f7c7c1-890e-4466-b85f-2771ab3eac70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWY3YzdjMS04OTBlLTQ0NjYtYjg1Zi0yNzcxYWIzZWFjNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTE5LCJpYXQiOjE3OTMzNjY2MTksImp0aSI6IjJiMWNjOWYwLWI4YjYtNDJlZS1iMzRkLWZiNWQ4NmVjZGRlYyIsInNpZCI6ImI0OWEwZjcyLTU5NzQtNGYyNy04MTdkLWQyYTU1YmZhMDU5OSJ9.89jnZgI7dYiZnJQny8geIgicVNiev5JIwjNP3ZnCloQ",
  "access_expires_at": "2026-10-30T13:38:39.981415109Z",
  "refresh_token": "kJNEyejU3ppFtFDyXmFOO6qTwmq-TkIPfmpVby-SWRE",
  "refresh_expires_at": "2026-11-29T13:23:39.980892578Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/c85535d2-198c-4222-a93c-6a8212f70c66/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/c85535d2-198c-4222-a93c-6a8212f70c66/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ef5d26d8-cb18-4101-8d12-ee14dea5080c"
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
  "session_id": "17f99294-003f-420c-bc40-2fcce2e5aaa3",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1MjAsImlhdCI6MTc5MzM2NjYyMCwianRpIjoiODA3YzIwOWUtMTBkMy00MDVkLWI1NTUtNzdiMDQ1NWUxNjZjIiwic2lkIjoiMTdmOTkyOTQtMDAzZi00MjBjLWJjNDAtMmZjY2UyZTVhYWEzIn0.YVcOyBREE3THzXrhiOnkCVBgx4QLUNLed9T1AifVKo8",
  "access_expires_at": "2026-10-30T13:38:40.876317564Z",
  "refresh_token": "6ylxFXPK571F_UzTqxkgPyqkLxXiVKz8l7b98YsfyH4",
  "refresh_expires_at": "2026-10-31T01:23:40.875703131Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a65b94ed-f928-497f-af1f-45ee8b5baf08",
  "session_id": "396a7a05-869f-4e26-b367-794b4cfe8272",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/a65b94ed-f928-497f-af1f-45ee8b5baf08/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "c85535d2-198c-4222-a93c-6a8212f70c66",
      "state": "READY",
      "created_at": "2026-10-30T13:23:36.452497Z",
      "ready_at": "2026-10-30T13:23:39.176341Z",
      "expires_at": "2026-11-06T13:23:39.176341Z",
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
  "device_ref": "sandbox-19477"
}
```

```json
{
  "challenge_id": "3dc5f0e5-d244-4db2-9af6-26c2a90c4d7d",
  "expires_at": "2026-10-30T13:28:41.785412594Z",
  "resend_available_at": "2026-10-30T13:23:42.785412594Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "376298",
  "sent_at": "2026-10-30T13:23:41.788830129Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3dc5f0e5-d244-4db2-9af6-26c2a90c4d7d",
  "code": "376298",
  "device_ref": "sandbox-19477"
}
```

```json
{
  "session_id": "a4586c47-e182-4276-9cc5-14714d6e6f7f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzUyMiwiaWF0IjoxNzkzMzY2NjIyLCJqdGkiOiIyYjE2OWM2Ny1mMTk4LTQ2N2QtYTk4Ni00ZjNhNzlmNDg5ZWEiLCJzaWQiOiJhNDU4NmM0Ny1lMTgyLTQyNzYtOWNjNS0xNDcxNGQ2ZTZmN2YifQ.8C7aun-aU-Alph7UrFJS3qDlUSMaCmaAllyXS2Cp80I",
  "access_expires_at": "2026-10-30T13:38:42.117345908Z",
  "refresh_token": "ApNxAKfuwcoFHjOL_gtmBCijDJ29mu2npjqOvI4ROyI",
  "refresh_expires_at": "2026-11-29T13:23:42.116640047Z",
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
  "device_ref": "sandbox-32430"
}
```

```json
{
  "challenge_id": "c1711202-ac74-4f92-95aa-db5c7fd5a1ac",
  "expires_at": "2026-10-30T13:28:42.704241915Z",
  "resend_available_at": "2026-10-30T13:23:43.704241915Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "757130",
  "sent_at": "2026-10-30T13:23:42.707188282Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1711202-ac74-4f92-95aa-db5c7fd5a1ac",
  "code": "757130",
  "device_ref": "sandbox-32430"
}
```

```json
{
  "session_id": "629de716-7fc5-49e3-a82c-9d9e8ce5e804",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzUyMywiaWF0IjoxNzkzMzY2NjIzLCJqdGkiOiJhZjg0MTA0NC1iOWMwLTQyYWUtYmE0Mi00MjQzNTM5NGZlYTQiLCJzaWQiOiI2MjlkZTcxNi03ZmM1LTQ5ZTMtYTgyYy05ZDllOGNlNWU4MDQifQ.XEnj9udasWlJE6o4ooHr8b66-Lk-MPu1Sr8zg_5P-bA",
  "access_expires_at": "2026-10-30T13:38:43.034599771Z",
  "refresh_token": "qzy0wbPckiHSuLUmDtWf0DLI-9GmTD-kw9s508gQBu8",
  "refresh_expires_at": "2026-11-29T13:23:43.033958992Z",
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
  "command_id": "4c76255c-b579-4b7f-bd1d-d8edc38c582f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:23:43Z",
    "sequence": 1793366623653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "071fdcd6-2641-44f8-b3c4-c861831dde6a",
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
  "last_heartbeat_at": "2026-10-30T13:23:43.6727Z",
  "last_location_at": "2026-10-30T13:23:43.6727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-18482"
}
```

```json
{
  "challenge_id": "ab97b46a-73f5-4859-9647-1632a595d14e",
  "expires_at": "2026-10-30T13:28:43.977101169Z",
  "resend_available_at": "2026-10-30T13:23:44.977101169Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "459003",
  "sent_at": "2026-10-30T13:23:43.979970069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab97b46a-73f5-4859-9647-1632a595d14e",
  "code": "459003",
  "device_ref": "sandbox-18482"
}
```

```json
{
  "session_id": "50f57165-9a2f-4a1c-835d-b486d0238eec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzUyNCwiaWF0IjoxNzkzMzY2NjI0LCJqdGkiOiIwZTE0N2MxMS04NTk2LTQ3MWYtYWUzMy1hYThmMzRiNWExMmMiLCJzaWQiOiI1MGY1NzE2NS05YTJmLTRhMWMtODM1ZC1iNDg2ZDAyMzhlZWMifQ.Su_ZNor1X6lsNxTx9GFLwMwMuKa9xA-Oul_fRatCh-c",
  "access_expires_at": "2026-10-30T13:38:44.312367211Z",
  "refresh_token": "czHa0NAXcpcUdTNKnONf1Nl70QP_7xHC_7TI7fNF8BU",
  "refresh_expires_at": "2026-11-29T13:23:44.311790233Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dae06908-2c74-493d-ac16-3352787d68a3",
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
  "last_heartbeat_at": "2026-10-30T13:19:46.848808Z",
  "last_location_at": "2026-10-30T13:19:46.848808Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dae06908-2c74-493d-ac16-3352787d68a3/handover` → **200**

```json
{
  "command_id": "cd0cb7ed-0799-4cf9-9af7-b4a62bc48116",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dae06908-2c74-493d-ac16-3352787d68a3",
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
  "last_heartbeat_at": "2026-10-30T13:19:46.848808Z",
  "last_location_at": "2026-10-30T13:19:46.848808Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dae06908-2c74-493d-ac16-3352787d68a3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:23:45Z",
    "sequence": 1793366625234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dae06908-2c74-493d-ac16-3352787d68a3",
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
  "last_heartbeat_at": "2026-10-30T13:23:45.253998Z",
  "last_location_at": "2026-10-30T13:23:45.253998Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "9741ee23-0978-458f-a011-7c1f4fed6ab5",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1MjUsImlhdCI6MTc5MzM2NjYyNSwianRpIjoiODY3MGE5ZWMtNmMwOS00Y2NkLTlhNGEtOTVlNDNjYzY1NjFiIiwic2lkIjoiOTc0MWVlMjMtMDk3OC00NThmLWEwMTEtN2MxZjRmZWQ2YWI1In0.JznlYZlDbq3_pLrpAyZolPPlHx8eEWc4MNiGbPQaTQg",
  "access_expires_at": "2026-10-30T13:38:45.837390933Z",
  "refresh_token": "shf_sTwX20zYCIHjdGHQb5lmMriH5n8Pir0WQsFPZEM",
  "refresh_expires_at": "2026-10-31T01:23:45.836831127Z",
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
  "session_id": "b90e7f53-5896-49b6-a895-da5de2c77d0e",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1MjYsImlhdCI6MTc5MzM2NjYyNiwianRpIjoiZmRjOTU3YjQtNGZkMy00ZmE4LWFkMTktMGRjZmMxMDg5MGQ5Iiwic2lkIjoiYjkwZTdmNTMtNTg5Ni00OWI2LWE4OTUtZGE1ZGUyYzc3ZDBlIn0.PTYhE7nUlKkDcX5MaJVWAMTnTWs446_uOQdmcBSgjYM",
  "access_expires_at": "2026-10-30T13:38:46.435667534Z",
  "refresh_token": "8QwykUG1LPofdO7EGxnxfd_6fmKsgs3owIo3pfAA38E",
  "refresh_expires_at": "2026-10-31T01:23:46.435104332Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380682262399",
  "device_ref": "sandbox-1675"
}
```

```json
{
  "challenge_id": "8a17e79c-83ce-4b1b-a36e-5137e3e810cc",
  "expires_at": "2026-10-30T13:28:46.759520589Z",
  "resend_available_at": "2026-10-30T13:23:47.759520589Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380682262399` → **200**

```json
{
  "phone": "+380682262399",
  "audience": "CLIENT",
  "code": "515250",
  "sent_at": "2026-10-30T13:23:46.762259808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a17e79c-83ce-4b1b-a36e-5137e3e810cc",
  "code": "515250",
  "device_ref": "sandbox-1675"
}
```

```json
{
  "session_id": "4dd94a5c-2348-455b-9f3a-ecdae3f72d9f",
  "subject": {
    "type": "CLIENT",
    "id": "f79d09cf-5fcc-4416-b26b-66f0c13f6f50"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzlkMDljZi01ZmNjLTQ0MTYtYjI2Yi02NmYwYzEzZjZmNTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTI3LCJpYXQiOjE3OTMzNjY2MjcsImp0aSI6IjAyN2U1ZGFjLWZiNWQtNGMxMy04NDJkLTg2YzIwYTU5NDQxZSIsInNpZCI6IjRkZDk0YTVjLTIzNDgtNDU1Yi05ZjNhLWVjZGFlM2Y3MmQ5ZiJ9.wF9zN-xdeki3hIggQelBUnDXkffOH4XSXDqFp3pMZgM",
  "access_expires_at": "2026-10-30T13:38:47.089994004Z",
  "refresh_token": "zbKbAhBSEGHwoeVJ58vZUb5AKzYwwia20-MI-gWvGfU",
  "refresh_expires_at": "2026-11-29T13:23:47.089409232Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "74f540cc-de33-4a1a-8e13-5aca11f143e7",
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
  "id": "1b35848f-3361-4757-8556-b8bcab1c30ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:47.395612Z",
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
  "command_id": "6f0504e2-de81-4d9f-bd8f-a83ded272817",
  "quote_id": "1b35848f-3361-4757-8556-b8bcab1c30ce",
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
  "id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f79d09cf-5fcc-4416-b26b-66f0c13f6f50",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:23:47.711628Z",
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
    "id": "1ab0fb60-c096-46b5-866b-7b063b598512",
    "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
    "expires_at": "2026-10-30T13:24:02.715094Z",
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

`POST /api/driver/v1/offers/1ab0fb60-c096-46b5-866b-7b063b598512/reject` → **204**

```json
{
  "command_id": "57c9c6fc-e3dc-4eab-8648-6e633243db02"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "81c33f0f-bb9b-4429-9ac4-95f99caba0d4",
    "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
    "expires_at": "2026-10-30T13:24:03.365871Z",
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

`POST /api/driver/v1/offers/81c33f0f-bb9b-4429-9ac4-95f99caba0d4/accept` → **200**

```json
{
  "command_id": "186780cb-c4bd-49bd-b7ee-f16f8bd32bdd"
}
```

```json
{
  "id": "0e4dc73d-389a-42ec-8572-71e54a654a81",
  "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3acc2d23-a5d3-4d83-a808-51ca7b7888ec",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/d8d6bc2d-f891-4397-bb40-07187fc92afa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:23:47.712254Z",
      "actor": {
        "type": "CLIENT",
        "id": "f79d09cf-5fcc-4416-b26b-66f0c13f6f50",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
        "quote_id": "1b35848f-3361-4757-8556-b8bcab1c30ce",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "88f879f2-acf1-46ca-adbc-16f1a6ca1789"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:23:47.714352Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
        "attempt_id": "0a2d284e-b216-4b0b-9777-3ab9ed15735c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "88f879f2-acf1-46ca-adbc-16f1a6ca1789"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:23:47.721147Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1ab0fb60-c096-46b5-866b-7b063b598512",
        "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "88f879f2-acf1-46ca-adbc-16f1a6ca1789"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T13:23:48.364888Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1ab0fb60-c096-46b5-866b-7b063b598512",
        "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa"
      },
      "correlation_id": "50a74099-729a-40c3-a946-f76909c4be3b"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order d8d6bc2d-f891-4397-bb40-07187fc92afa — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/d8d6bc2d-f891-4397-bb40-07187fc92afa` → **200**

```json
{
  "id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f79d09cf-5fcc-4416-b26b-66f0c13f6f50",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0e4dc73d-389a-42ec-8572-71e54a654a81",
    "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3acc2d23-a5d3-4d83-a808-51ca7b7888ec",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:23:47.711628Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d8d6bc2d-f891-4397-bb40-07187fc92afa/cancel` → **200**

```json
{
  "command_id": "6e811b34-4005-4522-8ee7-e148feac4529",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f79d09cf-5fcc-4416-b26b-66f0c13f6f50",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "0e4dc73d-389a-42ec-8572-71e54a654a81",
    "order_id": "d8d6bc2d-f891-4397-bb40-07187fc92afa",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3acc2d23-a5d3-4d83-a808-51ca7b7888ec",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:23:47.711628Z",
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
  "session_id": "071fdcd6-2641-44f8-b3c4-c861831dde6a",
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
  "last_heartbeat_at": "2026-10-30T13:23:43.6727Z",
  "last_location_at": "2026-10-30T13:23:43.6727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/071fdcd6-2641-44f8-b3c4-c861831dde6a/close` → **200**

```json
{
  "command_id": "1c372493-e373-4f3a-afd9-2cda7318ac02",
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
  "session_id": "dae06908-2c74-493d-ac16-3352787d68a3",
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
  "last_heartbeat_at": "2026-10-30T13:23:45.253998Z",
  "last_location_at": "2026-10-30T13:23:45.253998Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dae06908-2c74-493d-ac16-3352787d68a3/close` → **200**

```json
{
  "command_id": "9ae1e1ec-f9c7-43bb-be6a-5f1f4c6aee0a",
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
  "session_id": "6bf31df9-3aad-49e1-b59a-e66724ac511f",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1MzEsImlhdCI6MTc5MzM2NjYzMSwianRpIjoiMDNiNmM2OWMtMDUwMC00Y2NjLWEzYTMtZjc3NjVmNjhkYzhjIiwic2lkIjoiNmJmMzFkZjktM2FhZC00OWUxLWI1OWEtZTY2NzI0YWM1MTFmIn0.2v_SksED3TaAkH19hqx7lOjZx0m6ea3zSDg5ZYY7lFQ",
  "access_expires_at": "2026-10-30T13:38:51.540072865Z",
  "refresh_token": "8SOFZPtBNFpzeMmdCNm1JekjIyea-JftSfu6CJJMNlg",
  "refresh_expires_at": "2026-10-31T01:23:51.539476882Z",
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
  "command_id": "6c9051ac-a630-47f6-aa2f-d82f77c1ac71",
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
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T13:23:52.171465Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "344fc960-c199-4a25-a329-aed9bc4b4b29",
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
  "correlation_id": "692e4985-67b0-4127-a8b7-0adb80697bf2",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "0892b525-8375-439a-921d-e1cdf441896b",
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
  "correlation_id": "55569814-eb63-46c8-b557-46e4a634c4cb"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633470985",
  "device_ref": "sandbox-18696"
}
```

```json
{
  "challenge_id": "098a2a04-27ee-455e-87d2-cbda5fdab1af",
  "expires_at": "2026-10-30T13:28:53.093319659Z",
  "resend_available_at": "2026-10-30T13:23:54.093319659Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633470985` → **200**

```json
{
  "phone": "+380633470985",
  "audience": "CLIENT",
  "code": "543464",
  "sent_at": "2026-10-30T13:23:53.096125792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "098a2a04-27ee-455e-87d2-cbda5fdab1af",
  "code": "543464",
  "device_ref": "sandbox-18696"
}
```

```json
{
  "session_id": "1c45506a-e553-4161-820e-2c498fc68770",
  "subject": {
    "type": "CLIENT",
    "id": "1638a86d-b1d2-4506-8cf5-b4ba5ff84972"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjM4YTg2ZC1iMWQyLTQ1MDYtOGNmNS1iNGJhNWZmODQ5NzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTMzLCJpYXQiOjE3OTMzNjY2MzMsImp0aSI6IjhjZWZmODZmLTZjMmMtNGIzOS04ZmNjLTQ0ZjU4YWJjODhhNyIsInNpZCI6IjFjNDU1MDZhLWU1NTMtNDE2MS04MjBlLTJjNDk4ZmM2ODc3MCJ9.rpoe1M1nxjSCoSGYAVA6XC05V6s7rh_kqOFm-VnkaH8",
  "access_expires_at": "2026-10-30T13:38:53.417837957Z",
  "refresh_token": "D0dGOIyhyJyTk3ZdEphSM40F8BMxgbUk06BxcUKaWpg",
  "refresh_expires_at": "2026-11-29T13:23:53.417281449Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "064167b7-8f82-4b68-afdc-8e2f1e29761e",
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
  "id": "26f5a47a-afc5-41d8-b3cf-d1466070f4e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:53.719482Z",
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
  "command_id": "76ada3c9-00ac-4758-bfc8-a728f1057d41",
  "quote_id": "26f5a47a-afc5-41d8-b3cf-d1466070f4e1",
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
  "correlation_id": "1c1b57ec-63fb-4ce8-b1a8-d954a8381519"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5f943e5a-96a1-41ed-b5f6-1eb175a0bf8b",
  "quote_id": "26f5a47a-afc5-41d8-b3cf-d1466070f4e1",
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
  "id": "57b32efe-6581-4c41-9770-f9047c5ee8ea",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1638a86d-b1d2-4506-8cf5-b4ba5ff84972",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:23:54.329144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/57b32efe-6581-4c41-9770-f9047c5ee8ea/cancel` → **200**

```json
{
  "command_id": "a52335d4-a9ad-407d-ba0a-eccc366685f1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "57b32efe-6581-4c41-9770-f9047c5ee8ea",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1638a86d-b1d2-4506-8cf5-b4ba5ff84972",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:23:54.329144Z",
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
  "command_id": "25d651f0-69d7-4f41-8b07-d7b555d4430a",
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
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T13:23:54.98772Z"
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
      "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T13:23:54.98772Z"
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
  "device_ref": "sandbox-16812"
}
```

```json
{
  "challenge_id": "39bd0c6c-e595-45e6-b3e0-4937e8a3afcd",
  "expires_at": "2026-10-30T13:28:55.993764528Z",
  "resend_available_at": "2026-10-30T13:23:56.993764528Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "891838",
  "sent_at": "2026-10-30T13:23:55.998157389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39bd0c6c-e595-45e6-b3e0-4937e8a3afcd",
  "code": "891838",
  "device_ref": "sandbox-16812"
}
```

```json
{
  "session_id": "e6b7a692-efcc-4725-85f3-bff570a578df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzUzNiwiaWF0IjoxNzkzMzY2NjM2LCJqdGkiOiJiMDQzZTk2Ny1jYTNhLTQ3YzktODk1Yi05NWRkMWFlZTE4YjgiLCJzaWQiOiJlNmI3YTY5Mi1lZmNjLTQ3MjUtODVmMy1iZmY1NzBhNTc4ZGYifQ.YFdgrJqSCUSqoZMcYeBbZN9c-SIBevcgXHoK1CqW320",
  "access_expires_at": "2026-10-30T13:38:56.333962796Z",
  "refresh_token": "d4B7DCSkxX8k1KMYmQUHUkdtyAQBLsIeu-3SsQFRhvE",
  "refresh_expires_at": "2026-11-29T13:23:56.33335923Z",
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
  "command_id": "a473b484-1ed5-4b1c-95ad-84a48145825a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:23:56Z",
    "sequence": 1793366636948
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:23:56.96743Z",
  "last_location_at": "2026-10-30T13:23:56.96743Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673206671",
  "device_ref": "sandbox-30219"
}
```

```json
{
  "challenge_id": "cbdd59b1-cb61-41c9-9869-d3d470e23edb",
  "expires_at": "2026-10-30T13:28:57.265826545Z",
  "resend_available_at": "2026-10-30T13:23:58.265826545Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673206671` → **200**

```json
{
  "phone": "+380673206671",
  "audience": "CLIENT",
  "code": "220586",
  "sent_at": "2026-10-30T13:23:57.268573921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbdd59b1-cb61-41c9-9869-d3d470e23edb",
  "code": "220586",
  "device_ref": "sandbox-30219"
}
```

```json
{
  "session_id": "bdf6a3ce-f27a-48a7-a96d-a075fe597d50",
  "subject": {
    "type": "CLIENT",
    "id": "cad6ca8f-441a-4064-b685-ea24f898e5c9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYWQ2Y2E4Zi00NDFhLTQwNjQtYjY4NS1lYTI0Zjg5OGU1YzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTM3LCJpYXQiOjE3OTMzNjY2MzcsImp0aSI6Ijc4MDg4OWFmLTUzMzUtNDc1MC1hNTk4LWI2YmQ2NmZkOTViMyIsInNpZCI6ImJkZjZhM2NlLWYyN2EtNDhhNy1hOTZkLWEwNzVmZTU5N2Q1MCJ9.FklDpR8ycuBE0vnr0GeRCLDpWMMpInKYyx7R1Cylcas",
  "access_expires_at": "2026-10-30T13:38:57.590408614Z",
  "refresh_token": "ErCB0I6wio91DKsp5mLLXbbzLn4VRZ1ATdqiJZhOkQs",
  "refresh_expires_at": "2026-11-29T13:23:57.589897562Z",
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
  "command_id": "d00d8a9f-e157-4276-8b35-d9b1f102563f",
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
  "id": "92209e70-5dbd-481c-895d-d5a11099b0be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:58.191611Z",
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
  "command_id": "0b1671af-761d-4131-9629-19ec660bc7a3",
  "platform": "ANDROID",
  "token": "sandbox-driver-20a49ac5-fe66-42b7-b0fb-e905a16f9611"
}
```

```json
{
  "id": "aefffbc7-5a78-4df3-a2eb-43fa7bad9ebb",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:23:58.519212Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "2b603814-535b-4d5b-8c83-c0269cf2d5c7",
  "platform": "ANDROID",
  "token": "sandbox-rider-f3199367-5104-420c-9d0c-93a11850ff01"
}
```

```json
{
  "id": "e5b25b15-a566-4e43-95e1-7b2226216046",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:23:58.813336Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "54b0238b-a4fa-4ccd-a717-c32e48016589",
  "quote_id": "92209e70-5dbd-481c-895d-d5a11099b0be",
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
  "id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cad6ca8f-441a-4064-b685-ea24f898e5c9",
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
  "created_at": "2026-10-30T13:23:59.123374Z",
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
    "id": "fe7d5dcd-070d-4546-b6e8-ea9015f8e31b",
    "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
    "expires_at": "2026-10-30T13:24:14.126557Z",
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

`POST /api/driver/v1/offers/fe7d5dcd-070d-4546-b6e8-ea9015f8e31b/accept` → **200**

```json
{
  "command_id": "8b7e7c75-85bd-4f10-a8e5-b77f52ddd86b"
}
```

```json
{
  "id": "befa3fd8-3c38-4c73-b743-cef143b71d3c",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d139ec76-569c-4b29-b58a-74ad7260c272",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:23:59.990Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:23:59.990Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:24:00.32882946Z",
    "token_suffix": "6f9611",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "3ba449ba-f4c2-4991-a110-0e04807e9c8d",
      "order_version": "2",
      "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673206671&after=2026-10-30T13:23:59.990Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:24:00.33135376Z",
    "token_suffix": "50ff01",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "ff734e1d-ec63-4a6c-b08d-7a81e0a7fc07",
      "order_version": "3",
      "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b79bc0ea-253a-44b7-a7e8-890b6d1296f9/messages` → **201**

```json
{
  "command_id": "20e06eb3-ec28-4191-bd65-478bcf2a8742",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "a70f32ba-c769-457b-a169-5b850f87220e",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T13:24:01.152451844Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d139ec76-569c-4b29-b58a-74ad7260c272",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "assignment_id": "befa3fd8-3c38-4c73-b743-cef143b71d3c",
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

`POST /api/driver/v1/trips/d139ec76-569c-4b29-b58a-74ad7260c272/messages` → **201**

```json
{
  "command_id": "c6dd1fdf-a238-4916-bd01-7f648727faf8",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "53029a46-8c83-4bc8-952e-23d2ecd753dd",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T13:24:01.74269108Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b79bc0ea-253a-44b7-a7e8-890b6d1296f9/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d139ec76-569c-4b29-b58a-74ad7260c272/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673206671"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/3930e9bc-85cd-4bb9-893d-4bd0f81573bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:02Z",
    "sequence": 1793366642654
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:24:02.673499Z",
  "last_location_at": "2026-10-30T13:24:02.673499Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d139ec76-569c-4b29-b58a-74ad7260c272",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "assignment_id": "befa3fd8-3c38-4c73-b743-cef143b71d3c",
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

`POST /api/driver/v1/trips/d139ec76-569c-4b29-b58a-74ad7260c272/arrive` → **200**

```json
{
  "command_id": "7c3ed454-9c7b-4802-b764-a3b7eae08a70",
  "expected_version": 0
}
```

```json
{
  "id": "d139ec76-569c-4b29-b58a-74ad7260c272",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "assignment_id": "befa3fd8-3c38-4c73-b743-cef143b71d3c",
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
  "arrived_at": "2026-10-30T13:24:03.254373Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d139ec76-569c-4b29-b58a-74ad7260c272/start` → **200**

```json
{
  "command_id": "9447b01b-bd9f-4918-b967-7bb991183b1e",
  "expected_version": 1
}
```

```json
{
  "id": "d139ec76-569c-4b29-b58a-74ad7260c272",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "assignment_id": "befa3fd8-3c38-4c73-b743-cef143b71d3c",
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
  "arrived_at": "2026-10-30T13:24:03.254373Z",
  "started_at": "2026-10-30T13:24:03.565003Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/3930e9bc-85cd-4bb9-893d-4bd0f81573bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:51Z",
    "sequence": 1793366691887
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:24:51.908972Z",
  "last_location_at": "2026-10-30T13:24:51.908972Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d139ec76-569c-4b29-b58a-74ad7260c272/complete` → **200**

```json
{
  "command_id": "9633b45e-7e28-4e2d-bce6-dccf2414244b",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:24:52Z",
  "cash_received": true
}
```

```json
{
  "id": "d139ec76-569c-4b29-b58a-74ad7260c272",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "assignment_id": "befa3fd8-3c38-4c73-b743-cef143b71d3c",
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
  "arrived_at": "2026-10-30T13:24:03.254373Z",
  "started_at": "2026-10-30T13:24:03.565003Z",
  "completed_at": "2026-10-30T13:24:52.226356Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b79bc0ea-253a-44b7-a7e8-890b6d1296f9` → **200**

```json
{
  "id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cad6ca8f-441a-4064-b685-ea24f898e5c9",
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
    "id": "befa3fd8-3c38-4c73-b743-cef143b71d3c",
    "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d139ec76-569c-4b29-b58a-74ad7260c272",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:23:59.123374Z",
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
{
  "items": [
    {
      "id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
      "short_number": 14,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:23:59.123374Z",
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
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/trips` → **200**

```json
{
  "items": [
    {
      "id": "d139ec76-569c-4b29-b58a-74ad7260c272",
      "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
      "order_short_number": 14,
      "created_at": "2026-10-30T13:23:59.747884Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "eee7840f-883c-456e-8da0-fc0f507f4005",
      "order_id": "1a4819be-4ad6-45f8-ade2-130312be8371",
      "order_short_number": 9,
      "created_at": "2026-10-30T13:21:10.926346Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "dc8ae1b6-c873-48c7-860b-809833dd3906",
      "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
      "order_short_number": 4,
      "created_at": "2026-10-30T13:19:35.168795Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "f75dbe22-3df2-4450-9e3f-7f60820891fb",
      "order_id": "8867ddf6-bd75-461e-875f-c86d2ed959c3",
      "order_short_number": 2,
      "created_at": "2026-10-30T13:15:43.671409Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "c84dc8d9-b9b6-418e-bb5f-8230e1b9f979",
      "order_id": "81a7650e-39d2-4bf0-944c-40e8d1793e71",
      "order_short_number": 1,
      "created_at": "2026-10-30T13:15:33.320633Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
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

`GET /api/rider/v1/orders/b79bc0ea-253a-44b7-a7e8-890b6d1296f9/tip` → **200**

```json
{
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
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
  "available_until": "2026-10-31T13:24:52.226356Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b79bc0ea-253a-44b7-a7e8-890b6d1296f9/tip` → **201**

```json
{
  "command_id": "526df5ce-89f4-435e-86b8-8ee87b30aba9",
  "amount_minor": 1100
}
```

```json
{
  "id": "730e9949-c945-4924-9ec4-f28d5de784f8",
  "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T13:24:57.471399Z"
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
  "session_id": "551f6e92-6baf-4df4-a71d-7fadeb1998c4",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1OTgsImlhdCI6MTc5MzM2NjY5OCwianRpIjoiNTI5N2U1NTQtM2U2Ny00NTZmLWIwYTUtMTYwODAwZmMxMWVhIiwic2lkIjoiNTUxZjZlOTItNmJhZi00ZGY0LWE3MWQtN2ZhZGViMTk5OGM0In0.P76xYnLHCrHMwTNble2KR2GA5HpHi718XPc6sp1D5o4",
  "access_expires_at": "2026-10-30T13:39:58.085001513Z",
  "refresh_token": "wlxODbiIVNcwBVWmX64j2bTxBWj7t78h4lsls3HWhBs",
  "refresh_expires_at": "2026-10-31T01:24:58.084038351Z",
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
  "generated_at": "2026-10-30T13:24:58.39083046Z"
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
  "generated_at": "2026-10-30T13:24:58.719616401Z"
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
  "session_id": "a1812b2c-539d-480b-980a-cdd25b4c1755",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1OTksImlhdCI6MTc5MzM2NjY5OSwianRpIjoiYWI0MDk2YzctYzJjMS00ODI4LWFlYmMtMGUzZWNlY2E1NmM4Iiwic2lkIjoiYTE4MTJiMmMtNTM5ZC00ODBiLTk4MGEtY2RkMjViNGMxNzU1In0.a9MVSSs9vPQQ3ZZ0ldw6o8jybJ3J9SQqssN6RAldvuA",
  "access_expires_at": "2026-10-30T13:39:59.329987742Z",
  "refresh_token": "-d0D_YQ8gsWC9_3yLwfgTiAZShMduSZzX0O8oAcjsVI",
  "refresh_expires_at": "2026-10-31T01:24:59.329306971Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b79bc0ea-253a-44b7-a7e8-890b6d1296f9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:23:59.123851Z",
      "actor": {
        "type": "CLIENT",
        "id": "cad6ca8f-441a-4064-b685-ea24f898e5c9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
        "quote_id": "92209e70-5dbd-481c-895d-d5a11099b0be",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a0166f3f-01af-461d-a707-6967e51bbf67"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:23:59.125827Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
        "attempt_id": "089bfa58-3a1e-46a8-8a29-dacd4ff0cf2f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a0166f3f-01af-461d-a707-6967e51bbf67"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:23:59.128755Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fe7d5dcd-070d-4546-b6e8-ea9015f8e31b",
        "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "a0166f3f-01af-461d-a707-6967e51bbf67"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:23:59.74941Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fe7d5dcd-070d-4546-b6e8-ea9015f8e31b",
        "order_id": "b79bc0ea-253a-44b7-a7e8-890b6d1296f9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "befa3fd8-3c38-4c73-b743-cef143b71d3c"
      },
      "correlation_id": "149ba655-84ef-4e79-86af-250bcec93365"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T13:24:59.972193496Z",
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
      "last_location_at": "2026-10-30T13:24:51.908972Z",
      "order_id": null
    }
  ]
}
```

Done: order b79bc0ea-253a-44b7-a7e8-890b6d1296f9.

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
  "session_id": "c270c4ed-647d-429a-83cd-24b70123ddb4",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc2MDAsImlhdCI6MTc5MzM2NjcwMCwianRpIjoiMGU3MWJkMjItOTYxNy00NGNhLWE3YmQtZjdmMjQ4MmFkNjlhIiwic2lkIjoiYzI3MGM0ZWQtNjQ3ZC00MjlhLTgzY2QtMjRiNzAxMjNkZGI0In0.dEDju72rA24zz-0To7Y5JWCXzcjPFm47eWvlxBWdkaY",
  "access_expires_at": "2026-10-30T13:40:00.637143112Z",
  "refresh_token": "o2zBEDRL_g3QK4-J5KqU5gOyaHPZVDVZ3mUqY_R1ljA",
  "refresh_expires_at": "2026-10-31T01:25:00.63376561Z",
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
  "command_id": "08023d43-5d94-4985-b3bf-d0d0b7d276e5",
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
  "timestamp": "2026-10-30T13:25:01.000+0000",
  "channel": {
    "id": "1730052000.2112112950",
    "linkedid": "1730052000.2112112950",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679933874"
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
  "timestamp": "2026-10-30T13:25:01.000+0000",
  "channel": {
    "id": "1730052000.2112112950",
    "linkedid": "1730052000.2112112950",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679933874"
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
  "session_id": "71db1f79-a239-4b04-bd24-04bd178da9e5",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc2MDEsImlhdCI6MTc5MzM2NjcwMSwianRpIjoiMTM4YTkyZTItNmI5YS00OTQ4LTkxNDgtMGNjNTFkMTBhYjRkIiwic2lkIjoiNzFkYjFmNzktYTIzOS00YjA0LWJkMjQtMDRiZDE3OGRhOWU1In0.DzF38kI17va2evCtkNSoce8__-4suyc4kHMjv_fUrZk",
  "access_expires_at": "2026-10-30T13:40:01.919544815Z",
  "refresh_token": "sqguazmpov4YR9TM9_uHr9pkUlhpzsMrXmvf4pTqnbU",
  "refresh_expires_at": "2026-10-31T01:25:01.918884983Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "30448de7-f434-4841-9985-026610f0a1ec",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679933874",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:25:01Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/30448de7-f434-4841-9985-026610f0a1ec/answer` → **200**

```json
{
  "command_id": "8a43f3d0-989b-4cdc-9c56-daa933390162"
}
```

```json
{
  "id": "30448de7-f434-4841-9985-026610f0a1ec",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679933874",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "order_ids": [],
  "started_at": "2026-10-30T13:25:01Z",
  "answered_at": "2026-10-30T13:25:02.558895Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2112112950",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b56f7346-05cc-48d0-a8e0-0b89c5986195",
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
  "id": "8daf0ee1-09b3-4dfe-ba07-0b34bbacc8b6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:30:02.922325Z",
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
  "command_id": "2e791021-9dae-4025-becd-1681492ced46",
  "quote_id": "8daf0ee1-09b3-4dfe-ba07-0b34bbacc8b6",
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
    "phone": "+380679933874"
  },
  "call_id": "30448de7-f434-4841-9985-026610f0a1ec"
}
```

```json
{
  "id": "d88062e0-a341-4cc6-86fe-f3e5a52a28f2",
  "short_number": 15,
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
  "created_at": "2026-10-30T13:25:03.254411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679933874"
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
    "id": "1730052000.2112112950",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "30448de7-f434-4841-9985-026610f0a1ec",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679933874",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [
        "d88062e0-a341-4cc6-86fe-f3e5a52a28f2"
      ],
      "started_at": "2026-10-30T13:25:01Z",
      "answered_at": "2026-10-30T13:25:02.558895Z",
      "ended_at": "2026-10-30T13:25:03.604604Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "07959fae-e559-4a2e-8f50-1270e4e32d17",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679194454",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [],
      "started_at": "2026-10-30T13:19:25.919073Z",
      "answered_at": "2026-10-30T13:19:26.26213Z",
      "ended_at": "2026-10-30T13:19:26.588284Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:19:29.142181Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/d88062e0-a341-4cc6-86fe-f3e5a52a28f2` → **200**

```json
{
  "id": "d88062e0-a341-4cc6-86fe-f3e5a52a28f2",
  "short_number": 15,
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
  "created_at": "2026-10-30T13:25:03.254411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679933874"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/d88062e0-a341-4cc6-86fe-f3e5a52a28f2` → **200**

```json
{
  "id": "d88062e0-a341-4cc6-86fe-f3e5a52a28f2",
  "short_number": 15,
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
  "created_at": "2026-10-30T13:25:03.254411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679933874"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d88062e0-a341-4cc6-86fe-f3e5a52a28f2/cancel` → **200**

```json
{
  "command_id": "1625c398-69aa-48bf-8a84-28ae7288bd60",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d88062e0-a341-4cc6-86fe-f3e5a52a28f2",
  "short_number": 15,
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
  "created_at": "2026-10-30T13:25:03.254411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679933874"
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

Done: call 30448de7-f434-4841-9985-026610f0a1ec with order d88062e0-a341-4cc6-86fe-f3e5a52a28f2.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-275"
}
```

```json
{
  "challenge_id": "cdb82c1e-9e01-427d-82d2-b64bef3f16ae",
  "expires_at": "2026-10-30T13:30:04.947014912Z",
  "resend_available_at": "2026-10-30T13:25:05.947014912Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "488935",
  "sent_at": "2026-10-30T13:25:04.951037497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdb82c1e-9e01-427d-82d2-b64bef3f16ae",
  "code": "488935",
  "device_ref": "sandbox-275"
}
```

```json
{
  "session_id": "13a0986b-b68d-433c-81e2-684e35d43699",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzYwNSwiaWF0IjoxNzkzMzY2NzA1LCJqdGkiOiJkYzUzY2E2ZC05Mzg0LTQ3NjEtODY3NC1lODkwYWNmZGFkZmQiLCJzaWQiOiIxM2EwOTg2Yi1iNjhkLTQzM2MtODFlMi02ODRlMzVkNDM2OTkifQ.NBw7XrofvRN3QETBplPDfy1AMGXK2PfOTyZ4r2B-pMk",
  "access_expires_at": "2026-10-30T13:40:05.296630391Z",
  "refresh_token": "kBIL1-pAR6VsF5b4pd-gNd2xiFOdFt8AOYNop9ZTc3I",
  "refresh_expires_at": "2026-11-29T13:25:05.295991008Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:24:51.908972Z",
  "last_location_at": "2026-10-30T13:24:51.908972Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3930e9bc-85cd-4bb9-893d-4bd0f81573bc/handover` → **200**

```json
{
  "command_id": "e9a925d6-8b21-4167-9d76-5365a5710084",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:24:51.908972Z",
  "last_location_at": "2026-10-30T13:24:51.908972Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 84 s to the next point)

`POST /api/driver/v1/work-sessions/3930e9bc-85cd-4bb9-893d-4bd0f81573bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:26:30Z",
    "sequence": 1793366790241
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:26:30.261797Z",
  "last_location_at": "2026-10-30T13:26:30.261797Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660834452",
  "device_ref": "sandbox-74"
}
```

```json
{
  "challenge_id": "b2271122-4900-41b5-8561-11dc21b0923d",
  "expires_at": "2026-10-30T13:31:30.565335265Z",
  "resend_available_at": "2026-10-30T13:26:31.565335265Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660834452` → **200**

```json
{
  "phone": "+380660834452",
  "audience": "CLIENT",
  "code": "509154",
  "sent_at": "2026-10-30T13:26:30.568271563Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2271122-4900-41b5-8561-11dc21b0923d",
  "code": "509154",
  "device_ref": "sandbox-74"
}
```

```json
{
  "session_id": "610cba73-6435-4730-98db-f8afc039999e",
  "subject": {
    "type": "CLIENT",
    "id": "60bc7d58-3193-49bc-8edb-a7c9a603b05a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MGJjN2Q1OC0zMTkzLTQ5YmMtOGVkYi1hN2M5YTYwM2IwNWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NjkwLCJpYXQiOjE3OTMzNjY3OTAsImp0aSI6IjFmMGVjMzExLWEyZDAtNGM5ZC1iNWExLTMxMGI5ZjA0YzNkZCIsInNpZCI6IjYxMGNiYTczLTY0MzUtNDczMC05OGRiLWY4YWZjMDM5OTk5ZSJ9.3B_YlT1sNCHa1uY4_nJlZ6i1z5Bz7Vp7BEfDOw4SCos",
  "access_expires_at": "2026-10-30T13:41:30.90220912Z",
  "refresh_token": "USpxhLf2vg9yK20ODCyLjl-L_0Q7tXY08e27tSvgAdE",
  "refresh_expires_at": "2026-11-29T13:26:30.901575859Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f0d1a13e-829f-43de-99b0-cf33560d463e",
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
  "id": "ed6bcc31-c72a-4515-ab83-753015a17e43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:31:31.211751Z",
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
  "command_id": "0464fe28-9d4d-4986-94fb-e036106d3d30",
  "quote_id": "ed6bcc31-c72a-4515-ab83-753015a17e43",
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
  "id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "60bc7d58-3193-49bc-8edb-a7c9a603b05a",
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
  "created_at": "2026-10-30T13:26:31.536055Z",
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
    "id": "4d504a23-e3b9-42e2-9115-9d68d43cd158",
    "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
    "expires_at": "2026-10-30T13:26:46.539598Z",
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

`POST /api/driver/v1/offers/4d504a23-e3b9-42e2-9115-9d68d43cd158/accept` → **200**

```json
{
  "command_id": "a836880a-49f9-4a36-bd78-ffe24234aceb"
}
```

```json
{
  "id": "9b6fc352-1777-43d8-ad51-55cdc0c61e34",
  "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4393b1b8-4639-459c-b532-dee916fbea16",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4393b1b8-4639-459c-b532-dee916fbea16",
  "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
  "assignment_id": "9b6fc352-1777-43d8-ad51-55cdc0c61e34",
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

`POST /api/driver/v1/work-sessions/3930e9bc-85cd-4bb9-893d-4bd0f81573bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:26:32Z",
    "sequence": 1793366792812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:26:32.831702Z",
  "last_location_at": "2026-10-30T13:26:32.831702Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/4393b1b8-4639-459c-b532-dee916fbea16/arrive` → **200**

```json
{
  "command_id": "d850a11f-756a-4553-b1f8-368521cc30cd",
  "expected_version": 0
}
```

```json
{
  "id": "4393b1b8-4639-459c-b532-dee916fbea16",
  "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
  "assignment_id": "9b6fc352-1777-43d8-ad51-55cdc0c61e34",
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
  "arrived_at": "2026-10-30T13:26:33.145882Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4393b1b8-4639-459c-b532-dee916fbea16/start` → **200**

```json
{
  "command_id": "6f914f7e-5022-473b-9dd5-4558f1f37d25",
  "expected_version": 1
}
```

```json
{
  "id": "4393b1b8-4639-459c-b532-dee916fbea16",
  "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
  "assignment_id": "9b6fc352-1777-43d8-ad51-55cdc0c61e34",
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
  "arrived_at": "2026-10-30T13:26:33.145882Z",
  "started_at": "2026-10-30T13:26:33.467213Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/3930e9bc-85cd-4bb9-893d-4bd0f81573bc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:27:32Z",
    "sequence": 1793366852810
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:27:32.832371Z",
  "last_location_at": "2026-10-30T13:27:32.832371Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-31425"
}
```

```json
{
  "challenge_id": "95e13f67-7f15-4b38-8b63-fc26aa8876cd",
  "expires_at": "2026-10-30T13:32:33.159965071Z",
  "resend_available_at": "2026-10-30T13:27:34.159965071Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "291995",
  "sent_at": "2026-10-30T13:27:33.162938498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95e13f67-7f15-4b38-8b63-fc26aa8876cd",
  "code": "291995",
  "device_ref": "sandbox-31425"
}
```

```json
{
  "session_id": "f2c8e313-8ef7-44ac-9931-5db4ed34dfc4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzc1MywiaWF0IjoxNzkzMzY2ODUzLCJqdGkiOiJiNmI5MzJjZi0xNmMyLTRlOWUtOTgwNi1iNzJiMTk1ZTQxNDAiLCJzaWQiOiJmMmM4ZTMxMy04ZWY3LTQ0YWMtOTkzMS01ZGI0ZWQzNGRmYzQifQ.Id8pWIFDj_3Jm6BpC10KkjcS1UMkLHJGpw7GfAs8AAc",
  "access_expires_at": "2026-10-30T13:42:33.506881423Z",
  "refresh_token": "kp0SKjCIctwETd6uSeLk6XstivLzIPKSv6PJj0tjLbs",
  "refresh_expires_at": "2026-11-29T13:27:33.506266948Z",
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
  "command_id": "19a20150-d280-4b6f-ae58-e1ea564c2e9d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:27:34Z",
    "sequence": 1793366854159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c0638daf-9ae6-4e3f-965d-8137834f1eab",
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
  "last_heartbeat_at": "2026-10-30T13:27:34.180822Z",
  "last_location_at": "2026-10-30T13:27:34.180822Z",
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
  "session_id": "fcabfe4a-2b07-44a2-8fcb-82ae2afd0f44",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NTQsImlhdCI6MTc5MzM2Njg1NCwianRpIjoiMTQ2Y2I5NTYtNjQ0OS00ZGM3LTg0MGEtMWI5MTU2YjczZGE5Iiwic2lkIjoiZmNhYmZlNGEtMmIwNy00NGEyLThmY2ItODJhZTJhZmQwZjQ0In0.qx0ir82btshl5CWhaI_UPlyWW7evbi8vKlDYA4g5L60",
  "access_expires_at": "2026-10-30T13:42:34.805668909Z",
  "refresh_token": "Y4ZQgs_dAW3g2rApS0UTrYGwJdQ45_y2-S0fk76LkXQ",
  "refresh_expires_at": "2026-10-31T01:27:34.80455717Z",
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
  "session_id": "c6263c4d-939d-4fd2-ad35-af9da2232999",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NTUsImlhdCI6MTc5MzM2Njg1NSwianRpIjoiNjY4MTUzOGMtOGY3ZC00ZDg2LTg3MmQtMWJiMjk2OWRmNjU2Iiwic2lkIjoiYzYyNjNjNGQtOTM5ZC00ZmQyLWFkMzUtYWY5ZGEyMjMyOTk5In0.pTrmoMnsbVDwpvtKw6v9XFn4lV5vLIj72suB_sJoku4",
  "access_expires_at": "2026-10-30T13:42:35.427980586Z",
  "refresh_token": "kLSaQlPSZV559skQHV2HxiEHk7Omp2fSAF45f-dLHNs",
  "refresh_expires_at": "2026-10-31T01:27:35.427347707Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/535368ab-b16e-4fd1-84ff-4fd8fd3246ae` → **200**

```json
{
  "id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "60bc7d58-3193-49bc-8edb-a7c9a603b05a",
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
    "id": "9b6fc352-1777-43d8-ad51-55cdc0c61e34",
    "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4393b1b8-4639-459c-b532-dee916fbea16",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T13:26:31.536055Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/535368ab-b16e-4fd1-84ff-4fd8fd3246ae/interrupt` → **200**

```json
{
  "command_id": "100ba1ad-d432-441d-99f1-07aa17328a9d",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "60bc7d58-3193-49bc-8edb-a7c9a603b05a",
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
      "id": "9b6fc352-1777-43d8-ad51-55cdc0c61e34",
      "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "4393b1b8-4639-459c-b532-dee916fbea16",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T13:26:31.536055Z",
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
    "id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "60bc7d58-3193-49bc-8edb-a7c9a603b05a",
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
    "id": "18581f8a-e515-45b9-91b4-febca58e1776",
    "order_id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
    "expires_at": "2026-10-30T13:27:51.08282Z",
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

`POST /api/driver/v1/offers/18581f8a-e515-45b9-91b4-febca58e1776/accept` → **200**

```json
{
  "command_id": "38bd7db6-9bae-47d1-81dc-e4a73e25022f"
}
```

```json
{
  "id": "21af0ab6-cc34-4988-aa9e-ba6d371b9257",
  "order_id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0ca04be3-1528-4d4a-a15c-86208d7a2f4f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0ca04be3-1528-4d4a-a15c-86208d7a2f4f",
  "order_id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
  "assignment_id": "21af0ab6-cc34-4988-aa9e-ba6d371b9257",
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
  "session_id": "c0638daf-9ae6-4e3f-965d-8137834f1eab",
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
  "last_heartbeat_at": "2026-10-30T13:27:34.180822Z",
  "last_location_at": "2026-10-30T13:27:34.180822Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/c0638daf-9ae6-4e3f-965d-8137834f1eab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:27:37Z",
    "sequence": 1793366857697
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c0638daf-9ae6-4e3f-965d-8137834f1eab",
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
  "last_heartbeat_at": "2026-10-30T13:27:37.717906Z",
  "last_location_at": "2026-10-30T13:27:37.717906Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0ca04be3-1528-4d4a-a15c-86208d7a2f4f/arrive` → **200**

```json
{
  "command_id": "26e4db13-6852-4478-bdaf-2c3f58f50b18",
  "expected_version": 0
}
```

```json
{
  "id": "0ca04be3-1528-4d4a-a15c-86208d7a2f4f",
  "order_id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
  "assignment_id": "21af0ab6-cc34-4988-aa9e-ba6d371b9257",
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
  "arrived_at": "2026-10-30T13:27:38.034277Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0ca04be3-1528-4d4a-a15c-86208d7a2f4f/start` → **200**

```json
{
  "command_id": "2632ade3-fe3f-40e6-978e-9601d036e8b7",
  "expected_version": 1
}
```

```json
{
  "id": "0ca04be3-1528-4d4a-a15c-86208d7a2f4f",
  "order_id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
  "assignment_id": "21af0ab6-cc34-4988-aa9e-ba6d371b9257",
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
  "arrived_at": "2026-10-30T13:27:38.034277Z",
  "started_at": "2026-10-30T13:27:38.352502Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0ca04be3-1528-4d4a-a15c-86208d7a2f4f/complete` → **200**

```json
{
  "command_id": "842ea827-7d2c-4d53-b828-90e4364d7ae0",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:27:38Z"
}
```

```json
{
  "id": "0ca04be3-1528-4d4a-a15c-86208d7a2f4f",
  "order_id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
  "assignment_id": "21af0ab6-cc34-4988-aa9e-ba6d371b9257",
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
  "arrived_at": "2026-10-30T13:27:38.034277Z",
  "started_at": "2026-10-30T13:27:38.352502Z",
  "completed_at": "2026-10-30T13:27:38.67648Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
{
  "items": [
    {
      "id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
      "short_number": 17,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:27:36.07182Z",
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
      "id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
      "short_number": 16,
      "status": "CANCELLED",
      "created_at": "2026-10-30T13:26:31.536055Z",
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
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
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

`GET /api/operator/v1/orders/535368ab-b16e-4fd1-84ff-4fd8fd3246ae/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:26:31.53663Z",
      "actor": {
        "type": "CLIENT",
        "id": "60bc7d58-3193-49bc-8edb-a7c9a603b05a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
        "quote_id": "ed6bcc31-c72a-4515-ab83-753015a17e43",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "6797ef60-0e09-4e48-9aee-6f3c83be76d8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:26:31.53886Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
        "attempt_id": "47e6cc2a-6d5c-4820-bb33-66ac70687153",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6797ef60-0e09-4e48-9aee-6f3c83be76d8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:26:31.541971Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4d504a23-e3b9-42e2-9115-9d68d43cd158",
        "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "6797ef60-0e09-4e48-9aee-6f3c83be76d8"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:26:32.192384Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4d504a23-e3b9-42e2-9115-9d68d43cd158",
        "order_id": "535368ab-b16e-4fd1-84ff-4fd8fd3246ae",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9b6fc352-1777-43d8-ad51-55cdc0c61e34"
      },
      "correlation_id": "1834d0c3-08b6-44bb-97b6-c46c3fef634d"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/5e939835-52d5-4f5c-bac2-5fe3dec628ca/tip` → **200**

```json
{
  "order_id": "5e939835-52d5-4f5c-bac2-5fe3dec628ca",
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
  "available_until": "2026-10-31T13:27:38.67648Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/5e939835-52d5-4f5c-bac2-5fe3dec628ca/tip` → **409**

```json
{
  "command_id": "a7a1cc21-ac9e-41bc-8dc0-e890b86c2e20",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/5e939835-52d5-4f5c-bac2-5fe3dec628ca/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5ae5a570-44e6-4254-94fb-1d8875147657"
}
```

Done: interrupted 535368ab-b16e-4fd1-84ff-4fd8fd3246ae, follow-up 5e939835-52d5-4f5c-bac2-5fe3dec628ca.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3930e9bc-85cd-4bb9-893d-4bd0f81573bc",
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
  "last_heartbeat_at": "2026-10-30T13:27:32.832371Z",
  "last_location_at": "2026-10-30T13:27:32.832371Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3930e9bc-85cd-4bb9-893d-4bd0f81573bc/close` → **200**

```json
{
  "command_id": "9f63f3aa-e840-4eda-8120-d0967a78f9b9",
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
  "session_id": "c0638daf-9ae6-4e3f-965d-8137834f1eab",
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
  "last_heartbeat_at": "2026-10-30T13:27:37.717906Z",
  "last_location_at": "2026-10-30T13:27:37.717906Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c0638daf-9ae6-4e3f-965d-8137834f1eab/close` → **200**

```json
{
  "command_id": "442fa6be-0a50-4a9d-b73b-4a672a9ef231",
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
  "session_id": "039db449-1974-4f72-8d33-6ce81eabc89a",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NjUsImlhdCI6MTc5MzM2Njg2NSwianRpIjoiM2U3N2Q4ZDItNTUxYS00YjM3LWI4NTYtNWVhNDFlMjUzYWM5Iiwic2lkIjoiMDM5ZGI0NDktMTk3NC00ZjcyLThkMzMtNmNlODFlYWJjODlhIn0.EEoyC_OYuF4Pf-tFfOwZGxrpzMcy3BmorPMaRd0C-4Y",
  "access_expires_at": "2026-10-30T13:42:45.07847556Z",
  "refresh_token": "OFgvkBg4hcb3Aqu983bUZqoTLev5KvOht7X8V2AzwXk",
  "refresh_expires_at": "2026-10-31T01:27:45.077881223Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2d273a01-8fb3-400e-8f50-0f4e8833b16b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:27:45Z"
}
```

```json
{
  "id": "5d780325-872f-4516-b681-c73933d7732a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:27:45Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/5d780325-872f-4516-b681-c73933d7732a/publish` → **200**

```json
{
  "command_id": "d3688885-3d5f-4773-9c7f-55deadacf8bc",
  "expected_version": 0
}
```

```json
{
  "id": "5d780325-872f-4516-b681-c73933d7732a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:27:45.701783Z",
  "published_at": "2026-10-30T13:27:45.701783Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "5d780325-872f-4516-b681-c73933d7732a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T13:27:45.701783Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630803065",
  "device_ref": "sandbox-6611"
}
```

```json
{
  "challenge_id": "1687f022-99a3-4b89-a45c-6cf6ae7dad7e",
  "expires_at": "2026-10-30T13:32:46.295265368Z",
  "resend_available_at": "2026-10-30T13:27:47.295265368Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630803065` → **200**

```json
{
  "phone": "+380630803065",
  "audience": "CLIENT",
  "code": "881152",
  "sent_at": "2026-10-30T13:27:46.298322601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1687f022-99a3-4b89-a45c-6cf6ae7dad7e",
  "code": "881152",
  "device_ref": "sandbox-6611"
}
```

```json
{
  "session_id": "db87fe52-01a6-4783-a8b8-ca2edcb3669f",
  "subject": {
    "type": "CLIENT",
    "id": "e6998984-5607-429d-90e3-a3d65bf2fe08"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNjk5ODk4NC01NjA3LTQyOWQtOTBlMy1hM2Q2NWJmMmZlMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NzY2LCJpYXQiOjE3OTMzNjY4NjYsImp0aSI6IjMxM2E0MzNiLTc2MTgtNGE0OC05MzRkLWRiMzlmZmUxOTQxNSIsInNpZCI6ImRiODdmZTUyLTAxYTYtNDc4My1hOGI4LWNhMmVkY2IzNjY5ZiJ9.DjhkzlZZ-IiRi7hgvFDEcWHmqADoeUxAL-MDzy-BVlw",
  "access_expires_at": "2026-10-30T13:42:46.627017373Z",
  "refresh_token": "rpnjGRmVrXxM12-OsU7MnrqxXmEBd4IfNFJP2FAvHMo",
  "refresh_expires_at": "2026-11-29T13:27:46.626443394Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "5d780325-872f-4516-b681-c73933d7732a",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T13:27:45.701783Z",
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
  "command_id": "13564d98-1244-4e7d-88f8-f5f1420484f4",
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
  "id": "53aa6582-d137-4f65-8a60-a16f8088588d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:32:47.235823Z",
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
  "command_id": "b92d900e-3c51-4811-806b-3c6fbc005ce1",
  "quote_id": "53aa6582-d137-4f65-8a60-a16f8088588d",
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
  "correlation_id": "32f505d8-1df6-48ad-9f96-280d72f91a09"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "32fe5df6-9c50-4926-84c6-3ae84463809a",
  "version_id": "5d780325-872f-4516-b681-c73933d7732a",
  "language": "uk"
}
```

```json
{
  "version_id": "5d780325-872f-4516-b681-c73933d7732a",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T13:27:47.860018Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "afed3fb8-3fa8-4130-8aa3-2aa836b9c661",
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
  "id": "f7de48df-6a3a-4d01-9339-f3dbe783a24b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:32:48.166833Z",
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
  "command_id": "e4ef212c-e0b0-4390-9b71-7ddbd860093b",
  "quote_id": "f7de48df-6a3a-4d01-9339-f3dbe783a24b",
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
  "id": "8ae99ff2-7cae-43ba-995c-6e95fcfa0f71",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6998984-5607-429d-90e3-a3d65bf2fe08",
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
  "created_at": "2026-10-30T13:27:48.47982Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8ae99ff2-7cae-43ba-995c-6e95fcfa0f71` → **200**

```json
{
  "id": "8ae99ff2-7cae-43ba-995c-6e95fcfa0f71",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e6998984-5607-429d-90e3-a3d65bf2fe08",
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
  "created_at": "2026-10-30T13:27:48.47982Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8ae99ff2-7cae-43ba-995c-6e95fcfa0f71/cancel` → **200**

```json
{
  "command_id": "56510060-e541-4eb7-8970-a7debbe8c64a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8ae99ff2-7cae-43ba-995c-6e95fcfa0f71",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e6998984-5607-429d-90e3-a3d65bf2fe08",
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
  "created_at": "2026-10-30T13:27:48.47982Z",
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

`POST /api/admin/v1/legal-documents/5d780325-872f-4516-b681-c73933d7732a` → **409**

```json
{
  "command_id": "29450455-a3ef-445a-bd3b-219b9337c9f2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:27:49Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/5d780325-872f-4516-b681-c73933d7732a",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5a96c8cc-8e89-4840-8315-51bb11558ed1"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "405ce215-2488-4e15-8e8d-1f00fcb0ada9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:27:49Z"
}
```

```json
{
  "id": "2b809306-8e61-460a-903f-cbdefdfd9d8a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:27:49Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2b809306-8e61-460a-903f-cbdefdfd9d8a/publish` → **200**

```json
{
  "command_id": "b0227011-0ba6-4615-9a90-671ac0813de5",
  "expected_version": 0
}
```

```json
{
  "id": "2b809306-8e61-460a-903f-cbdefdfd9d8a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:27:50.11206Z",
  "published_at": "2026-10-30T13:27:50.11206Z",
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
  "device_ref": "sandbox-18166"
}
```

```json
{
  "challenge_id": "2ac11edf-ff1f-47f4-93e8-35835befcb35",
  "expires_at": "2026-10-30T13:32:50.420378938Z",
  "resend_available_at": "2026-10-30T13:27:51.420378938Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "104813",
  "sent_at": "2026-10-30T13:27:50.424484429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ac11edf-ff1f-47f4-93e8-35835befcb35",
  "code": "104813",
  "device_ref": "sandbox-18166"
}
```

```json
{
  "session_id": "5c09f1a3-091c-46a0-a028-293f12c66509",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzc3MCwiaWF0IjoxNzkzMzY2ODcwLCJqdGkiOiIyMGM3MzdiNS0yZTY2LTRkYzAtYWVhMS1hZjI3MTA3N2JlNDAiLCJzaWQiOiI1YzA5ZjFhMy0wOTFjLTQ2YTAtYTAyOC0yOTNmMTJjNjY1MDkifQ.joC8UVIPLewFipoFaLT3yNBUPVM4MUDqmJTMS1DQ4Gg",
  "access_expires_at": "2026-10-30T13:42:50.743032629Z",
  "refresh_token": "PPL3QVRYcprlxWIj9vchuu6Xmctji_FcyfYmPs0GAhE",
  "refresh_expires_at": "2026-11-29T13:27:50.742248711Z",
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

(the car drives 70 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "56fbd83b-da49-4390-8ffe-703ee9447d74",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:29:01Z",
    "sequence": 1793366941358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8eec0b76-ad1e-41a7-ae58-503255d2a4f9",
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
  "last_heartbeat_at": "2026-10-30T13:29:01.377504Z",
  "last_location_at": "2026-10-30T13:29:01.377504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672299168",
  "device_ref": "sandbox-5751"
}
```

```json
{
  "challenge_id": "8ece8cfb-5630-47e9-a74a-2d1fb9dfb77d",
  "expires_at": "2026-10-30T13:34:01.682306746Z",
  "resend_available_at": "2026-10-30T13:29:02.682306746Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672299168` → **200**

```json
{
  "phone": "+380672299168",
  "audience": "CLIENT",
  "code": "570956",
  "sent_at": "2026-10-30T13:29:01.686210021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ece8cfb-5630-47e9-a74a-2d1fb9dfb77d",
  "code": "570956",
  "device_ref": "sandbox-5751"
}
```

```json
{
  "session_id": "930cef22-5afa-4c45-872b-fd6401e6f690",
  "subject": {
    "type": "CLIENT",
    "id": "adea3ba0-6bf0-472e-a297-bf40a231f023"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGVhM2JhMC02YmYwLTQ3MmUtYTI5Ny1iZjQwYTIzMWYwMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODQyLCJpYXQiOjE3OTMzNjY5NDIsImp0aSI6IjBhOGIwZjljLTA3MmUtNGUwZi1iYTJkLTFmNjA5YzQ5ZDQwMiIsInNpZCI6IjkzMGNlZjIyLTVhZmEtNGM0NS04NzJiLWZkNjQwMWU2ZjY5MCJ9.bRI3Kw4ptSXQG-5T5PbKGpclgm5lBoJitV1V0h9Nglk",
  "access_expires_at": "2026-10-30T13:44:02.01393776Z",
  "refresh_token": "jrM5k_qZ0myS7lCEcqlBkH3nQunE36HQPPR36IdM7L0",
  "refresh_expires_at": "2026-11-29T13:29:02.013366244Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f1a848e3-2bb3-4583-bf9c-03522ab4665c",
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
  "id": "b3f9ecc1-1138-4a71-9505-18aaa854cc10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:02.321593Z",
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
  "command_id": "5d81c5f6-03c4-4d33-8f65-09a7741fe27f",
  "quote_id": "b3f9ecc1-1138-4a71-9505-18aaa854cc10",
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
    "phone": "+380670997772"
  }
}
```

```json
{
  "id": "2715a097-a9cd-48be-ac62-4a497f780685",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:29:02.635424Z",
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
    "id": "b40893e2-6690-4ae8-a355-36aa42566873",
    "order_id": "2715a097-a9cd-48be-ac62-4a497f780685",
    "expires_at": "2026-10-30T13:29:17.639377Z",
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

`POST /api/driver/v1/offers/b40893e2-6690-4ae8-a355-36aa42566873/accept` → **200**

```json
{
  "command_id": "f0cf8c43-e0e8-4735-9b48-b610a01d4498"
}
```

```json
{
  "id": "24bacedb-02e0-42d9-922f-c37142c2b59e",
  "order_id": "2715a097-a9cd-48be-ac62-4a497f780685",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7c601e29-dda9-4e3b-9481-6d153688126f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c601e29-dda9-4e3b-9481-6d153688126f",
  "order_id": "2715a097-a9cd-48be-ac62-4a497f780685",
  "assignment_id": "24bacedb-02e0-42d9-922f-c37142c2b59e",
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
    "phone": "+380670997772"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c42c0e10-b80d-4e89-8eb1-698c0b3e6dbd",
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
  "id": "b787340e-92de-4f11-8af9-6d32052def25",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:03.885014Z",
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
  "command_id": "dbea8962-8226-4baf-8323-03f5650c84bd",
  "quote_id": "b787340e-92de-4f11-8af9-6d32052def25",
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
  "id": "831b8728-b800-4460-80c7-53f5fe3e82bd",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:29:04.205122Z",
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
  "command_id": "3eb990bd-76f4-45b2-ae2b-df144ab31bf4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T16:29:04Z"
}
```

```json
{
  "id": "47a35bdb-0959-40e5-8913-3967d942d9b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:04.539756Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:29:04Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "57c0e9df-3a6f-4fe2-8bbd-9718b314e306",
  "quote_id": "47a35bdb-0959-40e5-8913-3967d942d9b4",
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
  "pickup_at": "2026-10-30T16:29:04Z"
}
```

```json
{
  "id": "b9a4c5ae-634f-4f13-bd23-be5d49f45b3d",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:29:04.859984Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:29:04Z",
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
  "command_id": "91816c91-f32e-4b71-aadd-21bff3ffee51",
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
  "id": "637491c2-a024-4d0d-9fca-5b91a5aba2a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:05.191863Z",
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
  "command_id": "2a7ad3a6-0e21-4692-9c9b-a3608f787110",
  "quote_id": "637491c2-a024-4d0d-9fca-5b91a5aba2a7",
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
  "correlation_id": "c152fd2d-d3af-40ff-84a6-b6785e10eca3"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b9a4c5ae-634f-4f13-bd23-be5d49f45b3d",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T13:29:04.859984Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T16:29:04Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "831b8728-b800-4460-80c7-53f5fe3e82bd",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T13:29:04.205122Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "2715a097-a9cd-48be-ac62-4a497f780685",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "831b8728-b800-4460-80c7-53f5fe3e82bd",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:29:04.205122Z",
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

`GET /api/rider/v1/orders/2715a097-a9cd-48be-ac62-4a497f780685` → **200**

```json
{
  "id": "2715a097-a9cd-48be-ac62-4a497f780685",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "24bacedb-02e0-42d9-922f-c37142c2b59e",
    "order_id": "2715a097-a9cd-48be-ac62-4a497f780685",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7c601e29-dda9-4e3b-9481-6d153688126f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:29:02.635424Z",
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
    "location_at": "2026-10-30T13:29:01.377504Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/2715a097-a9cd-48be-ac62-4a497f780685/cancel` → **200**

```json
{
  "command_id": "0010b9dd-e663-481e-b84d-5bcc28420a2d",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2715a097-a9cd-48be-ac62-4a497f780685",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "24bacedb-02e0-42d9-922f-c37142c2b59e",
    "order_id": "2715a097-a9cd-48be-ac62-4a497f780685",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7c601e29-dda9-4e3b-9481-6d153688126f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:29:02.635424Z",
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

`GET /api/rider/v1/orders/831b8728-b800-4460-80c7-53f5fe3e82bd` → **200**

```json
{
  "id": "831b8728-b800-4460-80c7-53f5fe3e82bd",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:29:04.205122Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/831b8728-b800-4460-80c7-53f5fe3e82bd/cancel` → **200**

```json
{
  "command_id": "ff9d2e78-5b3a-4c21-ade5-46c0a3290765",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "831b8728-b800-4460-80c7-53f5fe3e82bd",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:29:04.205122Z",
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

`GET /api/rider/v1/orders/b9a4c5ae-634f-4f13-bd23-be5d49f45b3d` → **200**

```json
{
  "id": "b9a4c5ae-634f-4f13-bd23-be5d49f45b3d",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:29:04.859984Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:29:04Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b9a4c5ae-634f-4f13-bd23-be5d49f45b3d/cancel` → **200**

```json
{
  "command_id": "e9c74c7a-ccd5-4947-a401-b518a6243ab3",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b9a4c5ae-634f-4f13-bd23-be5d49f45b3d",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "adea3ba0-6bf0-472e-a297-bf40a231f023",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:29:04.859984Z",
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
  "pickup_at": "2026-10-30T16:29:04Z",
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
  "session_id": "8eec0b76-ad1e-41a7-ae58-503255d2a4f9",
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
  "last_heartbeat_at": "2026-10-30T13:29:01.377504Z",
  "last_location_at": "2026-10-30T13:29:01.377504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8eec0b76-ad1e-41a7-ae58-503255d2a4f9/close` → **200**

```json
{
  "command_id": "3431a1df-a9e8-47af-96ee-8686843ca82e",
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

Done: orders 2715a097-a9cd-48be-ac62-4a497f780685, 831b8728-b800-4460-80c7-53f5fe3e82bd, b9a4c5ae-634f-4f13-bd23-be5d49f45b3d.

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
  "session_id": "38d880f1-b04b-4fc4-a9a6-1b8765a10b5d",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NDksImlhdCI6MTc5MzM2Njk0OSwianRpIjoiZTExOGU3YTAtOGEwZi00N2NiLTk0MzgtMDI3NjhkZWI5YzMzIiwic2lkIjoiMzhkODgwZjEtYjA0Yi00ZmM0LWE5YTYtMWI4NzY1YTEwYjVkIn0.gCBb4Ah8rvecO5tAsA9wUcdh-AbKF0ZNIbyq6IG8FN8",
  "access_expires_at": "2026-10-30T13:44:09.283188095Z",
  "refresh_token": "vUNY_aBNFlstmTKRj08jJPa_DjyEMJF0oEruFPQe8u0",
  "refresh_expires_at": "2026-10-31T01:29:09.282562269Z",
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
  "session_id": "651028f7-fcdf-45bb-bbfa-9cb1e15bf737",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NDksImlhdCI6MTc5MzM2Njk0OSwianRpIjoiOTljZmFhMzctNTk2NS00MTc3LWEwNDgtYzRmNTI5NWZmZDMxIiwic2lkIjoiNjUxMDI4ZjctZmNkZi00NWJiLWJiZmEtOWNiMWUxNWJmNzM3In0.LeVBzrEk9K8ir4FazD3w63uLwFA9AvMAV-VrvjvKXyE",
  "access_expires_at": "2026-10-30T13:44:09.881054345Z",
  "refresh_token": "cnnLgjR4TwAbo8X8G1LCTjbVKjyr6AF-FnmeEyy3LCo",
  "refresh_expires_at": "2026-10-31T01:29:09.879837339Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1112"
}
```

```json
{
  "challenge_id": "bd7aa519-3666-40c3-bbd3-02a434199790",
  "expires_at": "2026-10-30T13:34:10.173219896Z",
  "resend_available_at": "2026-10-30T13:29:11.173219896Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "609642",
  "sent_at": "2026-10-30T13:29:10.177363849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd7aa519-3666-40c3-bbd3-02a434199790",
  "code": "609642",
  "device_ref": "sandbox-1112"
}
```

```json
{
  "session_id": "457b59b0-5ee5-4d49-9a80-18b675892aaf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzg1MCwiaWF0IjoxNzkzMzY2OTUwLCJqdGkiOiJmNDE2MWIyNC0yZTIzLTQ2MWYtODNhNi0xMzI5ZDRkMTcyYTEiLCJzaWQiOiI0NTdiNTliMC01ZWU1LTRkNDktOWE4MC0xOGI2NzU4OTJhYWYifQ.Yy3UJsL6N_le7xrluhcs1sqWdVj3WresQ3po24mvIJg",
  "access_expires_at": "2026-10-30T13:44:10.507079185Z",
  "refresh_token": "ggnhbKqqxYS6fP4XXEqf4DYKbLYpXXwvpz6gHlrVaXg",
  "refresh_expires_at": "2026-11-29T13:29:10.506490327Z",
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
  "command_id": "ff158709-0ad9-493d-9749-3f798a46487f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:29:11Z",
    "sequence": 1793366951144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0244b946-7614-4331-9afb-c0c97812d3d0",
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
  "last_heartbeat_at": "2026-10-30T13:29:11.16615Z",
  "last_location_at": "2026-10-30T13:29:11.16615Z",
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
  "command_id": "e08ed500-f452-4b01-a1c7-4fc7caf94e55",
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
  "effective_at": "2026-10-30T13:29:11.789086Z",
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T13:19:41.022983Z",
  "last_entries": [
    {
      "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:19:41.022983Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "157fb86d-a0a2-48fc-96ea-18aea3ec645a",
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
  "id": "381da1f2-51a9-414f-971d-5c3f54888074",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:12.417430Z",
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
  "command_id": "ebb2b321-0f9e-48e5-a32b-c46ece994a90",
  "quote_id": "381da1f2-51a9-414f-971d-5c3f54888074",
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
    "phone": "+380671111348"
  }
}
```

```json
{
  "id": "cdc3e25d-395d-4d6c-8e29-20eb7668c0e0",
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
  "created_at": "2026-10-30T13:29:12.731111Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111348"
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
    "id": "b905ba1f-d7a4-4688-bd8e-a1496925b432",
    "order_id": "cdc3e25d-395d-4d6c-8e29-20eb7668c0e0",
    "expires_at": "2026-10-30T13:29:27.736239Z",
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

`POST /api/driver/v1/offers/b905ba1f-d7a4-4688-bd8e-a1496925b432/accept` → **200**

```json
{
  "command_id": "67a8fd03-d525-4fbf-b18c-3e83016e63eb"
}
```

```json
{
  "id": "2f6a38d9-7d9f-455e-9b16-c1e5828a91b1",
  "order_id": "cdc3e25d-395d-4d6c-8e29-20eb7668c0e0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a120df19-2483-4991-98a6-11ebe3caa29c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a120df19-2483-4991-98a6-11ebe3caa29c",
  "order_id": "cdc3e25d-395d-4d6c-8e29-20eb7668c0e0",
  "assignment_id": "2f6a38d9-7d9f-455e-9b16-c1e5828a91b1",
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
    "phone": "+380671111348"
  }
}
```

`POST /api/driver/v1/work-sessions/0244b946-7614-4331-9afb-c0c97812d3d0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:29:13Z",
    "sequence": 1793366953982
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0244b946-7614-4331-9afb-c0c97812d3d0",
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
  "last_heartbeat_at": "2026-10-30T13:29:14.003083Z",
  "last_location_at": "2026-10-30T13:29:14.003083Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a120df19-2483-4991-98a6-11ebe3caa29c/arrive` → **200**

```json
{
  "command_id": "0abbe56b-c639-4d48-bd78-3ec00c15a409",
  "expected_version": 0
}
```

```json
{
  "id": "a120df19-2483-4991-98a6-11ebe3caa29c",
  "order_id": "cdc3e25d-395d-4d6c-8e29-20eb7668c0e0",
  "assignment_id": "2f6a38d9-7d9f-455e-9b16-c1e5828a91b1",
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
  "arrived_at": "2026-10-30T13:29:14.319026Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111348"
  }
}
```

`POST /api/driver/v1/trips/a120df19-2483-4991-98a6-11ebe3caa29c/start` → **200**

```json
{
  "command_id": "919dce82-0826-4b2e-9b8f-82123722dabf",
  "expected_version": 1
}
```

```json
{
  "id": "a120df19-2483-4991-98a6-11ebe3caa29c",
  "order_id": "cdc3e25d-395d-4d6c-8e29-20eb7668c0e0",
  "assignment_id": "2f6a38d9-7d9f-455e-9b16-c1e5828a91b1",
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
  "arrived_at": "2026-10-30T13:29:14.319026Z",
  "started_at": "2026-10-30T13:29:14.643523Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111348"
  }
}
```

`POST /api/driver/v1/trips/a120df19-2483-4991-98a6-11ebe3caa29c/complete` → **200**

```json
{
  "command_id": "5be34068-53e4-4e85-b5af-c97baec148d8",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:29:14Z",
  "cash_received": true
}
```

```json
{
  "id": "a120df19-2483-4991-98a6-11ebe3caa29c",
  "order_id": "cdc3e25d-395d-4d6c-8e29-20eb7668c0e0",
  "assignment_id": "2f6a38d9-7d9f-455e-9b16-c1e5828a91b1",
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
  "arrived_at": "2026-10-30T13:29:14.319026Z",
  "started_at": "2026-10-30T13:29:14.643523Z",
  "completed_at": "2026-10-30T13:29:14.966351Z",
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
  "command_id": "a67029e3-49af-4874-8940-b206094628ac",
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
  "id": "e2cb4d65-dd78-48f2-a717-10ff5fcfedbe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:15.279548Z",
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
  "command_id": "72cf8d46-4082-4f5b-b03c-a48af56da421",
  "quote_id": "e2cb4d65-dd78-48f2-a717-10ff5fcfedbe",
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
    "phone": "+3806711119985"
  }
}
```

```json
{
  "id": "8e19aeb4-6da3-4ccb-bc43-1495ef5d835c",
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
  "created_at": "2026-10-30T13:29:15.59858Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119985"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8e19aeb4-6da3-4ccb-bc43-1495ef5d835c` → **200**

```json
{
  "id": "8e19aeb4-6da3-4ccb-bc43-1495ef5d835c",
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
  "created_at": "2026-10-30T13:29:15.59858Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119985"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8e19aeb4-6da3-4ccb-bc43-1495ef5d835c/cancel` → **200**

```json
{
  "command_id": "bc417cb3-5681-4ab2-9032-3bd8c0fccef8",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "8e19aeb4-6da3-4ccb-bc43-1495ef5d835c",
  "short_number": 23,
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
  "created_at": "2026-10-30T13:29:15.59858Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119985"
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
  "staff_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T13:19:41.022983Z",
  "last_entries": [
    {
      "order_id": "8e19aeb4-6da3-4ccb-bc43-1495ef5d835c",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T13:29:16.271442Z"
    },
    {
      "order_id": "cdc3e25d-395d-4d6c-8e29-20eb7668c0e0",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T13:29:14.971523Z"
    },
    {
      "order_id": "fd608daf-ee4b-4eb3-b21e-d455603826c0",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:19:41.022983Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0244b946-7614-4331-9afb-c0c97812d3d0",
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
  "last_heartbeat_at": "2026-10-30T13:29:14.003083Z",
  "last_location_at": "2026-10-30T13:29:14.003083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0244b946-7614-4331-9afb-c0c97812d3d0/close` → **200**

```json
{
  "command_id": "ae4468f7-514d-447d-80f0-ea1310c6ccb2",
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

Done: operator bonus for fulfilled cdc3e25d-395d-4d6c-8e29-20eb7668c0e0 and operator-fault cancellation 8e19aeb4-6da3-4ccb-bc43-1495ef5d835c.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678496708",
  "device_ref": "sandbox-6222"
}
```

```json
{
  "challenge_id": "69c160b1-dc84-47bb-af68-d53285dfce2d",
  "expires_at": "2026-10-30T13:34:20.754859216Z",
  "resend_available_at": "2026-10-30T13:29:21.754859216Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678496708` → **200**

```json
{
  "phone": "+380678496708",
  "audience": "CLIENT",
  "code": "539881",
  "sent_at": "2026-10-30T13:29:20.758558145Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671303517",
  "device_ref": "sandbox-696",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a1d4d1c3-449d-400a-825f-3064ea4da7aa",
  "expires_at": "2026-10-30T13:34:22.301655299Z",
  "resend_available_at": "2026-10-30T13:29:23.301655299Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671303517` → **200**

```json
{
  "phone": "+380671303517",
  "audience": "CLIENT",
  "code": "763535",
  "sent_at": "2026-10-30T13:29:22.30456069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671303517",
  "device_ref": "sandbox-13742",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "5820f95d-9a9d-4484-a594-02920678f6c6",
  "expires_at": "2026-10-30T13:34:23.836379438Z",
  "resend_available_at": "2026-10-30T13:29:24.836379438Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671303517` → **200**

```json
{
  "phone": "+380671303517",
  "audience": "CLIENT",
  "code": "374577",
  "sent_at": "2026-10-30T13:29:23.839446097Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679560000",
  "device_ref": "sandbox-25758"
}
```

```json
{
  "challenge_id": "55decc00-9ed2-477b-adba-037938fa4bdf",
  "expires_at": "2026-10-30T13:34:25.380394085Z",
  "resend_available_at": "2026-10-30T13:29:26.380394085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679560000",
  "device_ref": "sandbox-27571"
}
```

```json
{
  "challenge_id": "91076618-51e3-40cf-8eb4-86e6efdef607",
  "expires_at": "2026-10-30T13:34:26.888801937Z",
  "resend_available_at": "2026-10-30T13:29:27.888801937Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679560000` → **200**

```json
{
  "phone": "+380679560000",
  "audience": "CLIENT",
  "code": "349158",
  "sent_at": "2026-10-30T13:29:26.891960479Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679560000",
  "device_ref": "sandbox-28016",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7cd3afd6-8f32-4684-88f8-bdabb08de657",
  "expires_at": "2026-10-30T13:34:28.420031192Z",
  "resend_available_at": "2026-10-30T13:29:29.420031192Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679560000` → **200**

```json
{
  "phone": "+380679560000",
  "audience": "CLIENT",
  "code": "949621",
  "sent_at": "2026-10-30T13:29:28.422919897Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380679560000",
  "device_ref": "sandbox-24090",
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
  "correlation_id": "4cbe8905-f0bd-419d-a883-971895b89c6d",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000004282"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "0cc111da-f1a6-4f89-b406-3b5fd393467a"
}
```

`GET /sandbox/v1/otp?phone=%2B442000004282` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120030593"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "5113b1df-5bee-4b2f-a4d0-a65dbde9b0fa"
}
```

`GET /sandbox/v1/otp?phone=%2B37120030593` → **404**

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
  "session_id": "f5c4bfef-5137-419e-9707-d60f68323846",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NzEsImlhdCI6MTc5MzM2Njk3MSwianRpIjoiZmViODEzZmItNjI1OS00NzRkLTk3OTgtZDk1ZmY5NDNmNTZmIiwic2lkIjoiZjVjNGJmZWYtNTEzNy00MTllLTk3MDctZDYwZjY4MzIzODQ2In0.fRf8VJKSBnMpGPvuHQ4YeXZiBKws2jo3iipEosgcQYg",
  "access_expires_at": "2026-10-30T13:44:31.186758698Z",
  "refresh_token": "HjmyP3wPNrzqJ5X2uJv-Q8lbcLtF5UUC8GzHp0wJznw",
  "refresh_expires_at": "2026-10-31T01:29:31.186027342Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679560000` → **200**

```json
{
  "deliveries": [
    {
      "id": "3f74c584-324c-4a12-a97a-30e7f6bb4411",
      "challenge_id": "7cd3afd6-8f32-4684-88f8-bdabb08de657",
      "phone": "+380679560000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6ff8c42a-bfec-48f9-bca9-12a42ac46793",
      "error": null,
      "attempted_at": "2026-10-30T13:29:28.423167Z"
    },
    {
      "id": "a2b3d067-129f-4c9e-87b2-dfca06451f36",
      "challenge_id": "91076618-51e3-40cf-8eb4-86e6efdef607",
      "phone": "+380679560000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-eeb2d333-a207-47f3-afab-5a5c2c698ac6",
      "error": null,
      "attempted_at": "2026-10-30T13:29:26.892391Z"
    },
    {
      "id": "e32c7000-e341-42a7-a44f-9f274c1c5291",
      "challenge_id": "55decc00-9ed2-477b-adba-037938fa4bdf",
      "phone": "+380679560000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T13:29:25.384323Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679560000` → **200**

```json
{
  "phone": "+380679560000",
  "audience": "CLIENT",
  "code": "949621",
  "sent_at": "2026-10-30T13:29:28.422919897Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671303517` → **200**

```json
{
  "deliveries": [
    {
      "id": "5a73bcb0-9aaa-4df3-a795-1105adb8a180",
      "challenge_id": "5820f95d-9a9d-4484-a594-02920678f6c6",
      "phone": "+380671303517",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-dacd2e2a-a471-49b3-ae19-9a8d805ca792",
      "error": null,
      "attempted_at": "2026-10-30T13:29:23.839906Z"
    },
    {
      "id": "a3241ba1-37d9-4712-9548-01910667dc2a",
      "challenge_id": "a1d4d1c3-449d-400a-825f-3064ea4da7aa",
      "phone": "+380671303517",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b9ecfae1-1eb8-43d9-b778-30afab41bb87",
      "error": null,
      "attempted_at": "2026-10-30T13:29:22.305029Z"
    }
  ]
}
```

Done: SMS to +380678496708; SMS then a call to +380671303517; a failed SMS, two calls and a refused third to +380679560000; +44 and +371 refused.

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
  "session_id": "4d386f44-434e-4004-94ab-8677f0c2a93a",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NzIsImlhdCI6MTc5MzM2Njk3MiwianRpIjoiMmRhMjgyZWMtZTMxNC00OGYwLWIwODMtYjk4ZWM0ZjcwNDQzIiwic2lkIjoiNGQzODZmNDQtNDM0ZS00MDA0LTk0YWItODY3N2YwYzJhOTNhIn0.pTEPBT_jqPSZThMxkKAU-WHFeS5Yzy-Shr3KJ0HVVbY",
  "access_expires_at": "2026-10-30T13:44:32.456674204Z",
  "refresh_token": "S_w59C79dexX8JkXVyB7R0vKxUg35fh_PK6csBKHbEg",
  "refresh_expires_at": "2026-10-31T01:29:32.455800166Z",
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
  "session_id": "1e417bed-a7f1-4a09-a0d9-b085e61b2a5a",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NzMsImlhdCI6MTc5MzM2Njk3MywianRpIjoiZDYxYmVlZjAtZjgzOS00OTNjLTg1ZTAtMDdlZjYyZWRjYTU1Iiwic2lkIjoiMWU0MTdiZWQtYTdmMS00YTA5LWEwZDktYjA4NWU2MWIyYTVhIn0.bM8LlFZ2dlrmTL4kIBSfXtsz8MW7IaqU9beOgSNyMqU",
  "access_expires_at": "2026-10-30T13:44:33.046634787Z",
  "refresh_token": "XUn58R3hYMRtbz4AJqhVt_iuC2WF_Nnzu71w7rmllSU",
  "refresh_expires_at": "2026-10-31T01:29:33.045963729Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
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

`POST /api/admin/v1/staff-extensions/6fbdd889-5214-4e17-b720-9961d4657bb6` → **200**

```json
{
  "command_id": "76420c3a-6840-41aa-b14c-b6641a9c849c",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "1fd2d813-8093-4cd4-92b6-8ea811513876",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:29:34.278292Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:29:34.278292Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d58ee0ee-d00e-4c2e-8669-7dedd5067d03",
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
  "id": "34dff74b-5263-4894-a76b-cd5846c7b1c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:34.885276Z",
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
  "command_id": "c47f5dd7-6ac2-4bd4-9328-cf55721bf17b",
  "quote_id": "34dff74b-5263-4894-a76b-cd5846c7b1c5",
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
    "phone": "+380671167467"
  }
}
```

```json
{
  "id": "7c80867c-a528-41de-899d-cf3c077e465d",
  "short_number": 24,
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
  "created_at": "2026-10-30T13:29:35.20663Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671167467"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/7c80867c-a528-41de-899d-cf3c077e465d/calls` → **201**

```json
{
  "command_id": "4bdf1be5-3df7-42fa-9c79-b3b1ea67b3b7",
  "to": "CALLER"
}
```

```json
{
  "id": "82894d26-5733-4a91-b9e1-c0c237ef58f9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "order_ids": [
    "7c80867c-a528-41de-899d-cf3c077e465d"
  ],
  "started_at": "2026-10-30T13:29:35.557116Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/7c80867c-a528-41de-899d-cf3c077e465d/calls` → **201**

```json
{
  "command_id": "4bdf1be5-3df7-42fa-9c79-b3b1ea67b3b7",
  "to": "CALLER"
}
```

```json
{
  "id": "82894d26-5733-4a91-b9e1-c0c237ef58f9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "order_ids": [
    "7c80867c-a528-41de-899d-cf3c077e465d"
  ],
  "started_at": "2026-10-30T13:29:35.557116Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "82894d26-5733-4a91-b9e1-c0c237ef58f9",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671167467",
    "at": "2026-10-30T13:29:35.559433557Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "82894d26-5733-4a91-b9e1-c0c237ef58f9",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.25564",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "82894d26-5733-4a91-b9e1-c0c237ef58f9"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "82894d26-5733-4a91-b9e1-c0c237ef58f9",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=7c80867c-a528-41de-899d-cf3c077e465d` → **200**

```json
{
  "calls": [
    {
      "id": "82894d26-5733-4a91-b9e1-c0c237ef58f9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [
        "7c80867c-a528-41de-899d-cf3c077e465d"
      ],
      "started_at": "2026-10-30T13:29:35.557116Z",
      "answered_at": "2026-10-30T13:29:36.256395Z",
      "ended_at": "2026-10-30T13:29:36.278353Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7c80867c-a528-41de-899d-cf3c077e465d` → **200**

```json
{
  "calls": [
    {
      "id": "82894d26-5733-4a91-b9e1-c0c237ef58f9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [
        "7c80867c-a528-41de-899d-cf3c077e465d"
      ],
      "started_at": "2026-10-30T13:29:35.557116Z",
      "answered_at": "2026-10-30T13:29:36.256395Z",
      "ended_at": "2026-10-30T13:29:36.278353Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=7c80867c-a528-41de-899d-cf3c077e465d` → **200**

```json
{
  "calls": [
    {
      "id": "82894d26-5733-4a91-b9e1-c0c237ef58f9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "order_ids": [
        "7c80867c-a528-41de-899d-cf3c077e465d"
      ],
      "started_at": "2026-10-30T13:29:35.557116Z",
      "answered_at": "2026-10-30T13:29:36.256395Z",
      "ended_at": "2026-10-30T13:29:36.278353Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:29:39.243561Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/7c80867c-a528-41de-899d-cf3c077e465d` → **200**

```json
{
  "id": "7c80867c-a528-41de-899d-cf3c077e465d",
  "short_number": 24,
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
  "created_at": "2026-10-30T13:29:35.20663Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671167467"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7c80867c-a528-41de-899d-cf3c077e465d/cancel` → **200**

```json
{
  "command_id": "1a571785-6914-4ac3-a756-4d15daee2902",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7c80867c-a528-41de-899d-cf3c077e465d",
  "short_number": 24,
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
  "created_at": "2026-10-30T13:29:35.20663Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671167467"
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
  "command_id": "97e61627-b041-4636-bbb3-bc86e4e23e55",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T13:29:41.881275Z",
  "extension": "101"
}
```

Done: outgoing call 82894d26-5733-4a91-b9e1-c0c237ef58f9 from order 7c80867c-a528-41de-899d-cf3c077e465d, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635278050",
  "device_ref": "sandbox-9702"
}
```

```json
{
  "challenge_id": "0cc7c6c5-4240-4835-b05e-951b906de72a",
  "expires_at": "2026-10-30T13:34:42.18170458Z",
  "resend_available_at": "2026-10-30T13:29:43.18170458Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635278050` → **200**

```json
{
  "phone": "+380635278050",
  "audience": "CLIENT",
  "code": "691188",
  "sent_at": "2026-10-30T13:29:42.185108554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0cc7c6c5-4240-4835-b05e-951b906de72a",
  "code": "691188",
  "device_ref": "sandbox-9702"
}
```

```json
{
  "session_id": "dfec5076-3756-4adc-becf-cbe323bf5ad1",
  "subject": {
    "type": "CLIENT",
    "id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWJiYTlhNS03NzMwLTQ3Y2YtOWViNS05OWU0ZDVlNjUzOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODgyLCJpYXQiOjE3OTMzNjY5ODIsImp0aSI6IjRmODI4OTU2LWEyZDAtNDcyMy05ODg3LWEyN2I5YTUyMWQwZiIsInNpZCI6ImRmZWM1MDc2LTM3NTYtNGFkYy1iZWNmLWNiZTMyM2JmNWFkMSJ9.K3j7s-Pvx7C1ZNRvcSenGih73srhdqeHX-FuxvEB9bs",
  "access_expires_at": "2026-10-30T13:44:42.502195946Z",
  "refresh_token": "peCx4_tcps_lfRvxZQtm4Z1KcPhK0BObVgMST2EZkII",
  "refresh_expires_at": "2026-11-29T13:29:42.501542728Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d",
  "session_id": "dfec5076-3756-4adc-becf-cbe323bf5ad1",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635278050",
  "device_ref": "sandbox-3062"
}
```

```json
{
  "challenge_id": "cb776f26-3967-4404-b5c7-489145cbbc98",
  "expires_at": "2026-10-30T13:34:45.083856484Z",
  "resend_available_at": "2026-10-30T13:29:46.083856484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635278050` → **200**

```json
{
  "phone": "+380635278050",
  "audience": "CLIENT",
  "code": "891891",
  "sent_at": "2026-10-30T13:29:45.087206223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb776f26-3967-4404-b5c7-489145cbbc98",
  "code": "891891",
  "device_ref": "sandbox-3062"
}
```

```json
{
  "session_id": "af2ac858-57bb-4439-8949-ee8687950a9f",
  "subject": {
    "type": "CLIENT",
    "id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWJiYTlhNS03NzMwLTQ3Y2YtOWViNS05OWU0ZDVlNjUzOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODg1LCJpYXQiOjE3OTMzNjY5ODUsImp0aSI6IjNjYTRiNGE1LWI3MzAtNDhhZC05NTdmLThhMWE1MjU1YWIyNiIsInNpZCI6ImFmMmFjODU4LTU3YmItNDQzOS04OTQ5LWVlODY4Nzk1MGE5ZiJ9.TCUuWZ_c_scAuB5OguTmX0FhivoFr2yPom6mhJ-6KLI",
  "access_expires_at": "2026-10-30T13:44:45.412082591Z",
  "refresh_token": "moGwTZeLZrt_yXkFlMTDaX5A1mO0oto1i0XolYkYq3M",
  "refresh_expires_at": "2026-11-29T13:29:45.411505546Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "49136a80-fa3b-4bc2-87bc-8204660ef051",
  "expires_at": "2026-10-30T13:34:47.711977303Z",
  "resend_available_at": "2026-10-30T13:29:48.711977303Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635278050` → **200**

```json
{
  "phone": "+380635278050",
  "audience": "CLIENT",
  "code": "301561",
  "sent_at": "2026-10-30T13:29:47.714558589Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637888695"
}
```

```json
{
  "challenge_id": "d5c05947-b938-412f-a65f-b5bfd88747d3",
  "expires_at": "2026-10-30T13:34:48.029547041Z",
  "resend_available_at": "2026-10-30T13:29:49.029547041Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637888695` → **200**

```json
{
  "phone": "+380637888695",
  "audience": "CLIENT",
  "code": "685070",
  "sent_at": "2026-10-30T13:29:48.032563863Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "a33bd77a-ee31-42d9-b20c-f336fb79a2fd",
  "current_challenge_id": "49136a80-fa3b-4bc2-87bc-8204660ef051",
  "current_code": "000000",
  "new_challenge_id": "d5c05947-b938-412f-a65f-b5bfd88747d3",
  "new_code": "685070"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "4bc38f4b-ba58-4086-b1bd-79966df1eb29"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "753bddc8-5920-4d03-a31d-1ef4088f8ea0",
  "current_challenge_id": "49136a80-fa3b-4bc2-87bc-8204660ef051",
  "current_code": "301561",
  "new_challenge_id": "d5c05947-b938-412f-a65f-b5bfd88747d3",
  "new_code": "685070"
}
```

```json
{
  "subject_id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d",
  "phone": "+380637888695",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d",
  "session_id": "dfec5076-3756-4adc-becf-cbe323bf5ad1",
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
  "correlation_id": "f685aff9-8410-4bd7-90ea-a7b5a9c9efac"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637888695",
  "device_ref": "sandbox-3554"
}
```

```json
{
  "challenge_id": "fbd3eda3-21f3-4242-83bc-96177fa847ff",
  "expires_at": "2026-10-30T13:34:51.558825475Z",
  "resend_available_at": "2026-10-30T13:29:52.558825475Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637888695` → **200**

```json
{
  "phone": "+380637888695",
  "audience": "CLIENT",
  "code": "283701",
  "sent_at": "2026-10-30T13:29:51.56237033Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbd3eda3-21f3-4242-83bc-96177fa847ff",
  "code": "283701",
  "device_ref": "sandbox-3554"
}
```

```json
{
  "session_id": "736af3a8-1fe0-4be1-b021-1ef922b86f40",
  "subject": {
    "type": "CLIENT",
    "id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWJiYTlhNS03NzMwLTQ3Y2YtOWViNS05OWU0ZDVlNjUzOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODkxLCJpYXQiOjE3OTMzNjY5OTEsImp0aSI6IjJjNDg1ZDk4LWI5ODctNGJhMC05MTdiLTBkMGI5ODJiMTllYSIsInNpZCI6IjczNmFmM2E4LTFmZTAtNGJlMS1iMDIxLTFlZjkyMmI4NmY0MCJ9.eOf0jdOv_7aokzgN36SGL0WFFDq92fps_4gZoaibPzw",
  "access_expires_at": "2026-10-30T13:44:51.885586935Z",
  "refresh_token": "e1lgFcA9Wp4r99FmUbS_5y0ap1rJV5yCMuw554A0PAU",
  "refresh_expires_at": "2026-11-29T13:29:51.885055846Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d",
  "session_id": "736af3a8-1fe0-4be1-b021-1ef922b86f40",
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
  "session_id": "06e3208c-e319-432a-9c57-45a76c40362b",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4OTIsImlhdCI6MTc5MzM2Njk5MiwianRpIjoiYjg2MmM5YWMtYTdlYy00MjkwLTkwZTEtMWI2ZjFiZGQyYjZkIiwic2lkIjoiMDZlMzIwOGMtZTMxOS00MzJhLTljNTctNDVhNzZjNDAzNjJiIn0.I5xCpuYkSmBE1xmncTXIBwqKDfhXfxqmdaEMZ-g_YFM",
  "access_expires_at": "2026-10-30T13:44:52.745778945Z",
  "refresh_token": "Bk3-hdnbhQVaI3E5RPyP4i9gzOHsJ70rU9-sy8dlxJE",
  "refresh_expires_at": "2026-10-31T01:29:52.745057309Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/91bba9a5-7730-47cf-9eb5-99e4d5e6538d` → **200**

```json
{
  "client": {
    "id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d",
    "phone": "+380637888695",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:29:42.500012Z",
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

`POST /api/admin/v1/clients/91bba9a5-7730-47cf-9eb5-99e4d5e6538d/phone/new-code` → **201**

```json
{
  "phone": "+380630337842"
}
```

```json
{
  "challenge_id": "359c3881-9774-48d3-88a7-f1f012132003",
  "expires_at": "2026-10-30T13:34:53.365853763Z",
  "resend_available_at": "2026-10-30T13:29:54.365853763Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630337842` → **200**

```json
{
  "phone": "+380630337842",
  "audience": "CLIENT",
  "code": "645186",
  "sent_at": "2026-10-30T13:29:53.368434736Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/91bba9a5-7730-47cf-9eb5-99e4d5e6538d/phone` → **422**

```json
{
  "command_id": "c9e6656b-9d65-4285-8a41-1a91cbff2e14",
  "expected_version": 3,
  "new_challenge_id": "359c3881-9774-48d3-88a7-f1f012132003",
  "new_code": "645187",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/91bba9a5-7730-47cf-9eb5-99e4d5e6538d/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "c136f03b-c2fc-488e-a1e1-79e3c155aa05"
}
```

`POST /api/admin/v1/clients/91bba9a5-7730-47cf-9eb5-99e4d5e6538d/phone` → **400**

```json
{
  "command_id": "194439ee-6cf2-43d0-baed-27e9e97e76ed",
  "expected_version": 3,
  "new_challenge_id": "359c3881-9774-48d3-88a7-f1f012132003",
  "new_code": "645186",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/91bba9a5-7730-47cf-9eb5-99e4d5e6538d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "fb76573d-dbbc-47d1-87ed-135542ac69d1",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/91bba9a5-7730-47cf-9eb5-99e4d5e6538d/phone` → **200**

```json
{
  "command_id": "8f2d335f-22b4-4a64-bfad-1f6f722b9be2",
  "expected_version": 3,
  "new_challenge_id": "359c3881-9774-48d3-88a7-f1f012132003",
  "new_code": "645186",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d",
  "phone": "+380630337842",
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
  "correlation_id": "687e0ef6-0682-4dcc-813e-66ccf04cd544"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630337842",
  "device_ref": "sandbox-27815"
}
```

```json
{
  "challenge_id": "466508e5-d904-4b0d-bcc3-40edb6524c49",
  "expires_at": "2026-10-30T13:34:54.907278725Z",
  "resend_available_at": "2026-10-30T13:29:55.907278725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630337842` → **200**

```json
{
  "phone": "+380630337842",
  "audience": "CLIENT",
  "code": "578471",
  "sent_at": "2026-10-30T13:29:54.910051969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "466508e5-d904-4b0d-bcc3-40edb6524c49",
  "code": "578471",
  "device_ref": "sandbox-27815"
}
```

```json
{
  "session_id": "99e445e8-4e22-41d8-9c64-0c582527ecf9",
  "subject": {
    "type": "CLIENT",
    "id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWJiYTlhNS03NzMwLTQ3Y2YtOWViNS05OWU0ZDVlNjUzOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODk1LCJpYXQiOjE3OTMzNjY5OTUsImp0aSI6IjUyZjlmMGUyLWZkMzQtNDM4Yi1iYzljLTA5N2Q4NjI2NGUyMCIsInNpZCI6Ijk5ZTQ0NWU4LTRlMjItNDFkOC05YzY0LTBjNTgyNTI3ZWNmOSJ9.MrUs91E35Ys7RcRxwGM13TC1oeze5TJNycxauNH-Ovw",
  "access_expires_at": "2026-10-30T13:44:55.233399275Z",
  "refresh_token": "SDHcAremmIHw_G_dOGtRN-GnX-FbXMHra0joxq3HW3s",
  "refresh_expires_at": "2026-11-29T13:29:55.232847748Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "91bba9a5-7730-47cf-9eb5-99e4d5e6538d",
  "session_id": "99e445e8-4e22-41d8-9c64-0c582527ecf9",
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
  "phone": "+380630300215",
  "device_ref": "sandbox-21228"
}
```

```json
{
  "challenge_id": "fede4043-aac6-4948-a13a-26fa65176f4a",
  "expires_at": "2026-10-30T13:34:55.80568279Z",
  "resend_available_at": "2026-10-30T13:29:56.80568279Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630300215` → **200**

```json
{
  "phone": "+380630300215",
  "audience": "CLIENT",
  "code": "231445",
  "sent_at": "2026-10-30T13:29:55.808270699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fede4043-aac6-4948-a13a-26fa65176f4a",
  "code": "231445",
  "device_ref": "sandbox-21228"
}
```

```json
{
  "session_id": "03493050-6bff-46fa-bafe-4e6c289bda98",
  "subject": {
    "type": "CLIENT",
    "id": "ddad91c1-91d9-49d6-9f2b-12ce725f6488"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGFkOTFjMS05MWQ5LTQ5ZDYtOWYyYi0xMmNlNzI1ZjY0ODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODk2LCJpYXQiOjE3OTMzNjY5OTYsImp0aSI6ImEzZjYxODMwLTQyNTktNDMzZS1iZTI2LTdmOWZmZTA5MDM2MyIsInNpZCI6IjAzNDkzMDUwLTZiZmYtNDZmYS1iYWZlLTRlNmMyODliZGE5OCJ9.3Wnw6WjS9wxKiMJDtk_ESk76TNQ72Yi47nEOUF27DY4",
  "access_expires_at": "2026-10-30T13:44:56.12454602Z",
  "refresh_token": "CRPBPeyPYy2659FjqdV68Y1YNmJraU_Vb_HJex5jbRw",
  "refresh_expires_at": "2026-11-29T13:29:56.124027448Z",
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
  "session_id": "c1c3c7f2-c19c-4535-94b5-743fd3a8394f",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4OTcsImlhdCI6MTc5MzM2Njk5NywianRpIjoiMTc2ZWRiM2EtODFlZi00MTFmLTkzY2YtNDQ4YWIyMDZiNjZlIiwic2lkIjoiYzFjM2M3ZjItYzE5Yy00NTM1LTk0YjUtNzQzZmQzYTgzOTRmIn0.FC1NWePGP2n7AAVI8QjYl92VabVKycL4vrGtAQJJHdU",
  "access_expires_at": "2026-10-30T13:44:57.347600354Z",
  "refresh_token": "D0Uif_i3Ei68LPLhnaPd5yaVYrVKkhGl5K3LrBQy0c8",
  "refresh_expires_at": "2026-10-31T01:29:57.347052858Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380630300215` → **200**

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
  "correlation_id": "bca176c0-faf3-4d4e-a1ff-ff7a22a22356"
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
  "session_id": "a650becc-f1d9-49ef-8d05-23a5932f584b",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4OTgsImlhdCI6MTc5MzM2Njk5OCwianRpIjoiMjVkNGVjN2EtNmZhOC00MjRmLTlmOTAtOTU5NzJiMjk2YzdkIiwic2lkIjoiYTY1MGJlY2MtZjFkOS00OWVmLThkMDUtMjNhNTkzMmY1ODRiIn0.h-TG7O3RexA6JrpagIazvutS1IuFS-EZdrlvdBJKSqU",
  "access_expires_at": "2026-10-30T13:44:58.529812882Z",
  "refresh_token": "44peOdZjNHAViphllhekTkQttjiVftKMr_eOixM7RoM",
  "refresh_expires_at": "2026-10-31T01:29:58.529242153Z",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:15:37.978822Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "29f79d1b-fea0-4a06-a1e3-9bb35449c2f9",
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
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
    },
    "staff_top_ups": {
      "daily_max_per_staff_minor": {}
    }
  },
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T13:29:59.140233753Z"
}
```

## The rider books the airport for 2026-10-30T16:29:58Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600822896",
  "device_ref": "sandbox-16690"
}
```

```json
{
  "challenge_id": "3765f7f1-fa4a-4353-a730-33be3f6ee3cc",
  "expires_at": "2026-10-30T13:34:59.47019404Z",
  "resend_available_at": "2026-10-30T13:30:00.47019404Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600822896` → **200**

```json
{
  "phone": "+48600822896",
  "audience": "CLIENT",
  "code": "093245",
  "sent_at": "2026-10-30T13:29:59.473204998Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3765f7f1-fa4a-4353-a730-33be3f6ee3cc",
  "code": "093245",
  "device_ref": "sandbox-16690"
}
```

```json
{
  "session_id": "8afbed2d-0b8d-4a7f-a879-a670b2212df5",
  "subject": {
    "type": "CLIENT",
    "id": "be0cce05-3b12-4e26-b57b-b05d08a7ca87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTBjY2UwNS0zYjEyLTRlMjYtYjU3Yi1iMDVkMDhhN2NhODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODk5LCJpYXQiOjE3OTMzNjY5OTksImp0aSI6Ijg3MWU4NTczLWI4NjgtNGQzNS1iYWI2LTk1MTA5M2NiNmQ3ZSIsInNpZCI6IjhhZmJlZDJkLTBiOGQtNGE3Zi1hODc5LWE2NzBiMjIxMmRmNSJ9.95L43r3J5xi4edIM5ZBIrrfkdPZJNU_BXrBiRkDEa20",
  "access_expires_at": "2026-10-30T13:44:59.815206223Z",
  "refresh_token": "rhgQk7DJ3IECQ3kHhPQId8C0c9FhNN2bG_rqSQhvFvY",
  "refresh_expires_at": "2026-11-29T13:29:59.814443203Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08cce98a-0f5e-4058-b4a4-7e18476aa90f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T16:29:58Z"
}
```

```json
{
  "id": "dc390371-9674-480b-a804-76e819925c2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:35:00.134334Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:29:58Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "feeb8d82-4fdd-4508-80ed-c219de86ae90",
  "quote_id": "dc390371-9674-480b-a804-76e819925c2e",
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
  "pickup_at": "2026-10-30T16:29:58Z"
}
```

```json
{
  "id": "5457e131-7c18-440f-9ec2-2af99a0e4120",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "be0cce05-3b12-4e26-b57b-b05d08a7ca87",
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
  "created_at": "2026-10-30T13:30:00.457354Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:29:58Z",
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
  "device_ref": "sandbox-8231"
}
```

```json
{
  "challenge_id": "ed6f831f-7d0c-4713-82cd-571033874da5",
  "expires_at": "2026-10-30T13:35:00.76435596Z",
  "resend_available_at": "2026-10-30T13:30:01.76435596Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "487728",
  "sent_at": "2026-10-30T13:30:00.766982637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed6f831f-7d0c-4713-82cd-571033874da5",
  "code": "487728",
  "device_ref": "sandbox-8231"
}
```

```json
{
  "session_id": "449932de-8d16-4e76-abe3-671fd5072db9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzkwMSwiaWF0IjoxNzkzMzY3MDAxLCJqdGkiOiJiYTQ3MmViNy00ZGQwLTQ5ZTQtOTVmZC01NjU5MzcwYmQwZjkiLCJzaWQiOiI0NDk5MzJkZS04ZDE2LTRlNzYtYWJlMy02NzFmZDUwNzJkYjkifQ.S-Fdf_B-dvm1LzqDXzQLSruiWmaQLzxZac13Sz8dohU",
  "access_expires_at": "2026-10-30T13:45:01.085180914Z",
  "refresh_token": "R43Dq_w7pm_5b3Y4_YPU_KXwytfWKGZaV444qiTpxSg",
  "refresh_expires_at": "2026-11-29T13:30:01.084656818Z",
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
  "command_id": "923ecc3c-7a99-44ab-a37f-dab007398b37",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:30:01Z",
    "sequence": 1793367001682
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be99d810-dcda-4328-a67f-cd02c1e371fb",
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
  "last_heartbeat_at": "2026-10-30T13:30:01.700594Z",
  "last_location_at": "2026-10-30T13:30:01.700594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "5457e131-7c18-440f-9ec2-2af99a0e4120",
      "short_number": 25,
      "pickup_at": "2026-10-30T16:29:58Z",
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

`POST /api/driver/v1/preorders/5457e131-7c18-440f-9ec2-2af99a0e4120/reserve` → **200**

```json
{
  "command_id": "5f8572f5-f84a-4b99-ba1a-63334b9af8bf"
}
```

```json
{
  "id": "9954bbcc-34ab-4949-b08d-b4612eb32b71",
  "state": "RESERVED",
  "order": {
    "order_id": "5457e131-7c18-440f-9ec2-2af99a0e4120",
    "short_number": 25,
    "pickup_at": "2026-10-30T16:29:58Z",
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
  "reserved_at": "2026-10-30T13:30:02.309199Z",
  "confirm_from": "2026-10-30T15:59:58Z",
  "confirm_until": "2026-10-30T16:09:58Z",
  "drop_until": "2026-10-30T15:29:58Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "9954bbcc-34ab-4949-b08d-b4612eb32b71",
      "state": "RESERVED",
      "order": {
        "order_id": "5457e131-7c18-440f-9ec2-2af99a0e4120",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:29:58Z",
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
      "reserved_at": "2026-10-30T13:30:02.309199Z",
      "confirm_from": "2026-10-30T15:59:58Z",
      "confirm_until": "2026-10-30T16:09:58Z",
      "drop_until": "2026-10-30T15:29:58Z"
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
      "id": "9954bbcc-34ab-4949-b08d-b4612eb32b71",
      "state": "RESERVED",
      "order": {
        "order_id": "5457e131-7c18-440f-9ec2-2af99a0e4120",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:29:58Z",
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
      "reserved_at": "2026-10-30T13:30:02.309199Z",
      "confirm_from": "2026-10-30T15:59:58Z",
      "confirm_until": "2026-10-30T16:09:58Z",
      "drop_until": "2026-10-30T15:29:58Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/9954bbcc-34ab-4949-b08d-b4612eb32b71/confirm` → **409**

```json
{
  "command_id": "6a6700f3-3122-43a0-adfd-d529eb817194"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/9954bbcc-34ab-4949-b08d-b4612eb32b71/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9f71327e-f2b9-4ba5-91fd-d9794eb660b5"
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
  "session_id": "cc1e7dd7-0858-4a99-b6ce-79312ba50291",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5MDMsImlhdCI6MTc5MzM2NzAwMywianRpIjoiZmY0YzQ2MWMtOTgwYy00MzM2LTg2OGYtNmFjNGIyOTViYTUzIiwic2lkIjoiY2MxZTdkZDctMDg1OC00YTk5LWI2Y2UtNzkzMTJiYTUwMjkxIn0.mXHcEmzatzLwMnC20PbqSy-PyQ-Oyt3v6YzAYvbbqQ0",
  "access_expires_at": "2026-10-30T13:45:03.785446712Z",
  "refresh_token": "e9XqA9eR9LOv7pbqZoBVM36wELybpuYnJPnrnyVJDik",
  "refresh_expires_at": "2026-10-31T01:30:03.784907873Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5457e131-7c18-440f-9ec2-2af99a0e4120` → **200**

```json
{
  "id": "5457e131-7c18-440f-9ec2-2af99a0e4120",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "be0cce05-3b12-4e26-b57b-b05d08a7ca87",
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
  "created_at": "2026-10-30T13:30:00.457354Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T16:29:58Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "9954bbcc-34ab-4949-b08d-b4612eb32b71",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T13:30:02.309199Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5457e131-7c18-440f-9ec2-2af99a0e4120/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T13:30:00.458663Z",
      "actor": {
        "type": "CLIENT",
        "id": "be0cce05-3b12-4e26-b57b-b05d08a7ca87",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "5457e131-7c18-440f-9ec2-2af99a0e4120",
        "preorder": true,
        "quote_id": "dc390371-9674-480b-a804-76e819925c2e",
        "pickup_at": "2026-10-30T16:29:58Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "940a2b9c-038d-4769-9fe3-b0cd345f2343"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T13:30:02.310589Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5457e131-7c18-440f-9ec2-2af99a0e4120",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "9954bbcc-34ab-4949-b08d-b4612eb32b71"
      },
      "correlation_id": "2a1f41f1-42d4-4daa-aeac-3a9f58eb2911"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 5457e131-7c18-440f-9ec2-2af99a0e4120, reservation 9954bbcc-34ab-4949-b08d-b4612eb32b71.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28206"
}
```

```json
{
  "challenge_id": "0d345ae2-1167-4ada-b111-902b3ead6f49",
  "expires_at": "2026-10-30T13:35:04.707149747Z",
  "resend_available_at": "2026-10-30T13:30:05.707149747Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "011878",
  "sent_at": "2026-10-30T13:30:04.711360639Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d345ae2-1167-4ada-b111-902b3ead6f49",
  "code": "011878",
  "device_ref": "sandbox-28206"
}
```

```json
{
  "session_id": "d68002f8-cdba-441a-a73b-ede299899c00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzkwNSwiaWF0IjoxNzkzMzY3MDA1LCJqdGkiOiJlNDE5N2MzYy02ODhmLTQ2M2YtYWIzOS1mMjYxZTI5ZDJjZGQiLCJzaWQiOiJkNjgwMDJmOC1jZGJhLTQ0MWEtYTczYi1lZGUyOTk4OTljMDAifQ.goKQBQKGgfnRNN7k0bKf6Uvypdg1htTDcxULMg9BZU4",
  "access_expires_at": "2026-10-30T13:45:05.048828931Z",
  "refresh_token": "mVeXvNsXSnU1gNOucDIc2Kp933L0VyV6JBVMs_yBrhw",
  "refresh_expires_at": "2026-11-29T13:30:05.048294325Z",
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
  "command_id": "c14d3b6e-66dc-4144-9538-c454f249765d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:30:05Z",
    "sequence": 1793367005653
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39bde660-c2b7-4282-bc40-4e6f804a13f2",
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
  "last_heartbeat_at": "2026-10-30T13:30:05.672349Z",
  "last_location_at": "2026-10-30T13:30:05.672349Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673922731",
  "device_ref": "sandbox-32612"
}
```

```json
{
  "challenge_id": "e785c042-1106-4da2-a34d-135fd3b5b8dd",
  "expires_at": "2026-10-30T13:35:05.968426967Z",
  "resend_available_at": "2026-10-30T13:30:06.968426967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673922731` → **200**

```json
{
  "phone": "+380673922731",
  "audience": "CLIENT",
  "code": "453517",
  "sent_at": "2026-10-30T13:30:05.971884759Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e785c042-1106-4da2-a34d-135fd3b5b8dd",
  "code": "453517",
  "device_ref": "sandbox-32612"
}
```

```json
{
  "session_id": "9edc2e74-4743-4c8d-b113-0157d2cd02bc",
  "subject": {
    "type": "CLIENT",
    "id": "de52f327-70ed-4db7-a89c-90a2ffcf513f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTUyZjMyNy03MGVkLTRkYjctYTg5Yy05MGEyZmZjZjUxM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3OTA2LCJpYXQiOjE3OTMzNjcwMDYsImp0aSI6ImIwMjhjNmZiLWVhMWMtNDRkOC1iMjE5LTY5ZDNkNmVkMGQ0YyIsInNpZCI6IjllZGMyZTc0LTQ3NDMtNGM4ZC1iMTEzLTAxNTdkMmNkMDJiYyJ9.yV-l_ygyQMRDL2N1KeMVwisBnzNiGrVnVjHW5HMSMUw",
  "access_expires_at": "2026-10-30T13:45:06.291897174Z",
  "refresh_token": "WGqQeqyIYB-e98iuv46KUY5dHfrmCdE4dHNoZmUo14g",
  "refresh_expires_at": "2026-11-29T13:30:06.291291886Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8a537a7-f50f-468a-9b5c-2a9a15ab3da8",
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
  "id": "1192af95-8134-4ba5-b0aa-40db28fb865a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:35:06.594270Z",
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
  "command_id": "521496ae-275f-4d86-ba93-d6de8e046b01",
  "quote_id": "1192af95-8134-4ba5-b0aa-40db28fb865a",
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
  "id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "de52f327-70ed-4db7-a89c-90a2ffcf513f",
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
  "created_at": "2026-10-30T13:30:06.899592Z",
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
    "id": "d073957f-e38e-4d60-af4a-bd5c18993827",
    "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
    "expires_at": "2026-10-30T13:30:21.902688Z",
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

`POST /api/driver/v1/offers/d073957f-e38e-4d60-af4a-bd5c18993827/accept` → **200**

```json
{
  "command_id": "52b1d92e-f2de-4bcd-9612-51caec1872a5"
}
```

```json
{
  "id": "09b7d092-0ae2-4684-9d24-6be6417916d4",
  "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "85ab8c76-7f77-41f2-9611-1a2c5cdaedf1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85ab8c76-7f77-41f2-9611-1a2c5cdaedf1",
  "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "assignment_id": "09b7d092-0ae2-4684-9d24-6be6417916d4",
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

`POST /api/driver/v1/work-sessions/39bde660-c2b7-4282-bc40-4e6f804a13f2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:30:08Z",
    "sequence": 1793367008124
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39bde660-c2b7-4282-bc40-4e6f804a13f2",
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
  "last_heartbeat_at": "2026-10-30T13:30:08.143203Z",
  "last_location_at": "2026-10-30T13:30:08.143203Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85ab8c76-7f77-41f2-9611-1a2c5cdaedf1",
  "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "assignment_id": "09b7d092-0ae2-4684-9d24-6be6417916d4",
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

`POST /api/driver/v1/trips/85ab8c76-7f77-41f2-9611-1a2c5cdaedf1/arrive` → **200**

```json
{
  "command_id": "f7ec9805-9de8-4f28-a98b-9b360f99bd57",
  "expected_version": 0
}
```

```json
{
  "id": "85ab8c76-7f77-41f2-9611-1a2c5cdaedf1",
  "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "assignment_id": "09b7d092-0ae2-4684-9d24-6be6417916d4",
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
  "arrived_at": "2026-10-30T13:30:08.742453Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/85ab8c76-7f77-41f2-9611-1a2c5cdaedf1/start` → **200**

```json
{
  "command_id": "dcaaeb15-e50d-40e6-b395-15a748de9462",
  "expected_version": 1
}
```

```json
{
  "id": "85ab8c76-7f77-41f2-9611-1a2c5cdaedf1",
  "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "assignment_id": "09b7d092-0ae2-4684-9d24-6be6417916d4",
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
  "arrived_at": "2026-10-30T13:30:08.742453Z",
  "started_at": "2026-10-30T13:30:09.039231Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/39bde660-c2b7-4282-bc40-4e6f804a13f2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:30:57Z",
    "sequence": 1793367057358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39bde660-c2b7-4282-bc40-4e6f804a13f2",
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
  "last_heartbeat_at": "2026-10-30T13:30:57.378135Z",
  "last_location_at": "2026-10-30T13:30:57.378135Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/85ab8c76-7f77-41f2-9611-1a2c5cdaedf1/complete` → **200**

```json
{
  "command_id": "36f4d4da-fec8-4204-9912-7c741bb6f874",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:30:57Z",
  "cash_received": true
}
```

```json
{
  "id": "85ab8c76-7f77-41f2-9611-1a2c5cdaedf1",
  "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "assignment_id": "09b7d092-0ae2-4684-9d24-6be6417916d4",
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
  "arrived_at": "2026-10-30T13:30:08.742453Z",
  "started_at": "2026-10-30T13:30:09.039231Z",
  "completed_at": "2026-10-30T13:30:57.693857Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f9a2a60e-7dbe-476f-997d-fee4f09f5a9d/rating` → **200**

```json
{
  "command_id": "16802143-2188-468b-a0ba-bb58e50f432a",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "score": 5,
  "created_at": "2026-10-30T13:30:58.022304904Z"
}
```

`POST /api/driver/v1/orders/f9a2a60e-7dbe-476f-997d-fee4f09f5a9d/rating` → **200**

```json
{
  "command_id": "65e8d97e-e957-40de-a4e6-9773a8486de9",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
  "score": 4,
  "created_at": "2026-10-30T13:30:58.324518821Z"
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
  "session_id": "e00a95ab-6340-47c9-8e70-20e21c6197d2",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5NTksImlhdCI6MTc5MzM2NzA1OSwianRpIjoiZjFiN2M0MTgtM2MwOC00NjVkLWE2OWItYzRhOWVmMWMyMzBlIiwic2lkIjoiZTAwYTk1YWItNjM0MC00N2M5LThlNzAtMjBlMjFjNjE5N2QyIn0.bN8uRY0hKeGedlk-t1EZXgdSwYuA1lNEXcRdVKQG47g",
  "access_expires_at": "2026-10-30T13:45:59.220257507Z",
  "refresh_token": "R1dCzRj8sseI9xK3Psmek9YkpHV2G0RLsJm78q15SjA",
  "refresh_expires_at": "2026-10-31T01:30:59.219655976Z",
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
  "session_id": "78b605aa-a2bd-47f8-9da7-560d0c4bd5a1",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5NTksImlhdCI6MTc5MzM2NzA1OSwianRpIjoiZDE2ZWJmNjQtMWE4Mi00M2E3LWFjNWYtZmJiNmE5ZWU4MzRmIiwic2lkIjoiNzhiNjA1YWEtYTJiZC00N2Y4LTlkYTctNTYwZDBjNGJkNWExIn0.aQuzlCxGY0qMDpekJi_66K54eeTMmpqMkKQyLTydbMw",
  "access_expires_at": "2026-10-30T13:45:59.821300709Z",
  "refresh_token": "Lf59YQ92fyJFLn2hiDDTWHtBFs6if1lSZ4afFwmdluI",
  "refresh_expires_at": "2026-10-31T01:30:59.820717487Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f9a2a60e-7dbe-476f-997d-fee4f09f5a9d/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
      "author_type": "RIDER",
      "author_id": "de52f327-70ed-4db7-a89c-90a2ffcf513f",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T13:30:58.022305Z"
    },
    {
      "order_id": "f9a2a60e-7dbe-476f-997d-fee4f09f5a9d",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "de52f327-70ed-4db7-a89c-90a2ffcf513f",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T13:30:58.324519Z"
    }
  ]
}
```

Done: ratings for order f9a2a60e-7dbe-476f-997d-fee4f09f5a9d.

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
  "session_id": "5021310a-1ca0-47e5-91e0-4ba4a2bc789a",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5NjAsImlhdCI6MTc5MzM2NzA2MCwianRpIjoiN2Y5YzE0NmQtZDA5ZC00ODcwLTgyNTktYjhjMGE4Nzg0Y2ExIiwic2lkIjoiNTAyMTMxMGEtMWNhMC00N2U1LTkxZTAtNGJhNGEyYmM3ODlhIn0.pqixaF_MzFpIWomjeSlES5LWnhV8SAO38AzGGOl-Qv0",
  "access_expires_at": "2026-10-30T13:46:00.7189348Z",
  "refresh_token": "wz0Q7VRutRb6dXWKXZksesHJNcGzgLBSF_xm25P614E",
  "refresh_expires_at": "2026-10-31T01:31:00.71801018Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "6dd4e7ee-afe5-44c6-ba46-ae403cc36308",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "311e35a7-ec12-47ae-ace0-6a2a86bca6a2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:31:01.019255Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/311e35a7-ec12-47ae-ace0-6a2a86bca6a2` → **200**

```json
{
  "id": "311e35a7-ec12-47ae-ace0-6a2a86bca6a2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:31:01.019255Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/311e35a7-ec12-47ae-ace0-6a2a86bca6a2` → **200**

```json
{
  "id": "311e35a7-ec12-47ae-ace0-6a2a86bca6a2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:31:01.019255Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/311e35a7-ec12-47ae-ace0-6a2a86bca6a2` → **200**

```json
{
  "id": "311e35a7-ec12-47ae-ace0-6a2a86bca6a2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:31:01.019255Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/311e35a7-ec12-47ae-ace0-6a2a86bca6a2` → **200**

```json
{
  "id": "311e35a7-ec12-47ae-ace0-6a2a86bca6a2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:31:01.019255Z",
  "ready_at": "2026-10-30T13:31:04.408666Z",
  "expires_at": "2026-10-31T13:31:04.408666Z"
}
```

`GET /api/admin/v1/reports/exports/311e35a7-ec12-47ae-ace0-6a2a86bca6a2/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3e7b72c0-e91a-463b-8231-6531a01f6aec",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "e619e46b-8f28-45c7-bfb7-d63bb72b4d0f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:31:05.515763Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e619e46b-8f28-45c7-bfb7-d63bb72b4d0f` → **200**

```json
{
  "id": "e619e46b-8f28-45c7-bfb7-d63bb72b4d0f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:31:05.515763Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e619e46b-8f28-45c7-bfb7-d63bb72b4d0f` → **200**

```json
{
  "id": "e619e46b-8f28-45c7-bfb7-d63bb72b4d0f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:31:05.515763Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e619e46b-8f28-45c7-bfb7-d63bb72b4d0f` → **200**

```json
{
  "id": "e619e46b-8f28-45c7-bfb7-d63bb72b4d0f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:31:05.515763Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e619e46b-8f28-45c7-bfb7-d63bb72b4d0f` → **200**

```json
{
  "id": "e619e46b-8f28-45c7-bfb7-d63bb72b4d0f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:31:05.515763Z",
  "ready_at": "2026-10-30T13:31:09.41723Z",
  "expires_at": "2026-10-31T13:31:09.41723Z"
}
```

`GET /api/admin/v1/reports/exports/e619e46b-8f28-45c7-bfb7-d63bb72b4d0f/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/f13b6bae-482c-4945-bf88-1d5a0dd1c13c` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/f13b6bae-482c-4945-bf88-1d5a0dd1c13c",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "925502a8-0672-48fb-bcba-c1181bbace15"
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
  "session_id": "92d4aa46-d293-48a6-8dff-d9792d56df6d",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5NzAsImlhdCI6MTc5MzM2NzA3MCwianRpIjoiMTc0ZDdkMTEtODA0NS00YzA4LTlkMDYtNWY1ZWI0OWM5MDJhIiwic2lkIjoiOTJkNGFhNDYtZDI5My00OGE2LThkZmYtZDk3OTJkNTZkZjZkIn0.D9awn6stHg7BkQz9z0vMGOqCQuwcVLyJV4Q7E9jjWl8",
  "access_expires_at": "2026-10-30T13:46:10.60519614Z",
  "refresh_token": "elNu4tHjpUIm1wz8AjYnJyIYzBUBD5iB6zyZrMlk6Xk",
  "refresh_expires_at": "2026-10-31T01:31:10.604658578Z",
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
  "command_id": "6c395ffb-afe4-497f-8392-8743ad99485a",
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
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:31:11.195445132Z"
}
```

`POST /sandbox/v1/retention/fixtures/2f8f8c02-c499-4683-bf10-fafa9554ebdb` → **200**

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

`GET /sandbox/v1/retention/fixtures/2f8f8c02-c499-4683-bf10-fafa9554ebdb` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/2f8f8c02-c499-4683-bf10-fafa9554ebdb` → **204**

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
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:31:11.195445Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "773a7826-1db1-43df-90bb-e8b8ab5d5c33",
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
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T13:31:11.90748404Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7677"
}
```

```json
{
  "challenge_id": "5dce80b5-fbcf-4d26-acd6-cf61d277b32b",
  "expires_at": "2026-10-30T13:36:12.209715031Z",
  "resend_available_at": "2026-10-30T13:31:13.209715031Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "435190",
  "sent_at": "2026-10-30T13:31:12.213041468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5dce80b5-fbcf-4d26-acd6-cf61d277b32b",
  "code": "435190",
  "device_ref": "sandbox-7677"
}
```

```json
{
  "session_id": "4e644bbb-f869-4709-9380-c187b2b48f60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzk3MiwiaWF0IjoxNzkzMzY3MDcyLCJqdGkiOiI4ZDhiMmZiNC1kNDMwLTRkNjctYjkzOC0xZTYwYjA2NGEzMzEiLCJzaWQiOiI0ZTY0NGJiYi1mODY5LTQ3MDktOTM4MC1jMTg3YjJiNDhmNjAifQ.jAgT4bStAn5adVfMl_sT7jXxspikl2etqqp_5A2OGjU",
  "access_expires_at": "2026-10-30T13:46:12.533109004Z",
  "refresh_token": "biNTxGDh6lAmkZfHo3aGAD_7ZH1WR5mQf6745JFyoh8",
  "refresh_expires_at": "2026-11-29T13:31:12.532463771Z",
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
  "command_id": "a22985d2-8510-4756-a587-8f050f851762",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:13Z",
    "sequence": 1793367073409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "e4c4d29d-9044-4edc-8173-e9132745cb12",
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
  "last_heartbeat_at": "2026-10-30T13:31:13.427605Z",
  "last_location_at": "2026-10-30T13:31:13.427605Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "3ab08c5b-7f6d-4362-a306-58e02a8b161d",
  "points": [
    {
      "sequence": 1793367075714,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:30:15Z"
    },
    {
      "sequence": 1793367075722,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:31:15Z"
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
  "session_id": "fd962835-83d1-4886-938f-7c76c6d99e19",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5NzYsImlhdCI6MTc5MzM2NzA3NiwianRpIjoiNmM2NTFkZTktYzc4ZS00NWRkLTliNzQtMTNhZTBhN2U0ODRiIiwic2lkIjoiZmQ5NjI4MzUtODNkMS00ODg2LTkzOGYtN2M3NmM2ZDk5ZTE5In0.kuoapiFdHZ1r_X2Jv5mA0GkgulugVLX51Ts3N3sGQaA",
  "access_expires_at": "2026-10-30T13:46:16.362582787Z",
  "refresh_token": "6uuGZ56TuzoPGWA28bCEWP6PQL-rPsWvzFDxRTsQ5yI",
  "refresh_expires_at": "2026-10-31T01:31:16.362006662Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "f78ce3c8-1a39-4ef4-865b-55a1ec6c861e",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T13:31:15Z",
        "track_point_id": "c50044c3-73a1-4526-922e-f89ff3d8edc4",
        "work_session_id": "e4c4d29d-9044-4edc-8173-e9132745cb12"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T13:31:15Z",
      "reason": null,
      "reviewed_by": null,
      "reviewed_at": null,
      "review_reason": null,
      "version": 1
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
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
  "history": [],
  "duplicates": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/f78ce3c8-1a39-4ef4-865b-55a1ec6c861e/confirm` → **200**

```json
{
  "command_id": "c42e7c9c-7849-4076-89d6-96084e6ecc71",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "f78ce3c8-1a39-4ef4-865b-55a1ec6c861e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T13:31:15Z",
    "track_point_id": "c50044c3-73a1-4526-922e-f89ff3d8edc4",
    "work_session_id": "e4c4d29d-9044-4edc-8173-e9132745cb12"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T13:31:15Z",
  "reason": null,
  "reviewed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reviewed_at": "2026-10-30T13:31:17.27956Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/f78ce3c8-1a39-4ef4-865b-55a1ec6c861e/dismiss` → **409**

```json
{
  "command_id": "bdf91f51-c581-46d4-ad45-7be4c4b1789a",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/f78ce3c8-1a39-4ef4-865b-55a1ec6c861e/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f7502ff9-dd69-4815-9b63-3af0efc275a5"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "bc35ac64-35df-441a-9f91-a3084740b198",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "14777c7b-7aa0-40dd-a093-4ed5221f1bb0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "raised_at": "2026-10-30T13:31:17.872419Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/14777c7b-7aa0-40dd-a093-4ed5221f1bb0/dismiss` → **200**

```json
{
  "command_id": "57b3c28c-4a5d-4255-9c45-ebe7cb686cd2",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "14777c7b-7aa0-40dd-a093-4ed5221f1bb0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "raised_at": "2026-10-30T13:31:17.872419Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reviewed_at": "2026-10-30T13:31:18.188826Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "42ca90e4-dd2c-42b8-994b-74dfd1d996e2",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "f78ce3c8-1a39-4ef4-865b-55a1ec6c861e"
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
      "actor_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:31:18.505348Z"
    }
  ],
  "duplicates": []
}
```

Done: flag f78ce3c8-1a39-4ef4-865b-55a1ec6c861e confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "52f05fb3-4a72-4e5d-a99b-9a3e95feb99f",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5NzksImlhdCI6MTc5MzM2NzA3OSwianRpIjoiYmFmZWJkOTYtMWM4Zi00MzhiLWFlZDItNWJiMmZjYjRjNzc0Iiwic2lkIjoiNTJmMDVmYjMtNGE3Mi00ZTVkLWE5OWItOWEzZTk1ZmViOTlmIn0.mXbmHJLOI_lkf0btgRxvmTIhay_wKMWg3ghXzYQn6C4",
  "access_expires_at": "2026-10-30T13:46:19.408341952Z",
  "refresh_token": "sEn_08oGlwHAbnjfHFCUgdYo13jYxHVwtUB6OZSpvEg",
  "refresh_expires_at": "2026-10-31T01:31:19.407765355Z",
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
      "actor_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:31:18.505348Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "46cc3f30-a4af-41ca-ad52-a62a2a13b54a",
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
  "session_id": "e4c4d29d-9044-4edc-8173-e9132745cb12",
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
  "last_heartbeat_at": "2026-10-30T13:31:13.427605Z",
  "last_location_at": "2026-10-30T13:31:13.427605Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e4c4d29d-9044-4edc-8173-e9132745cb12/close` → **200**

```json
{
  "command_id": "0bfb1652-14d6-40f1-9db3-cc8d156f7d1b",
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
  "session_id": "5cf022e2-1a07-4858-b7fc-62d26547647f",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5ODEsImlhdCI6MTc5MzM2NzA4MSwianRpIjoiY2I4MzViZjktYjMzYy00MTk0LTkyMzQtZjQxYjkzYmNhYWEyIiwic2lkIjoiNWNmMDIyZTItMWEwNy00ODU4LWI3ZmMtNjJkMjY1NDc2NDdmIn0.3lJTjS2smFGNLvjPqIQEwLvy-79gVd-xZ6GHGCw3ih8",
  "access_expires_at": "2026-10-30T13:46:21.21822055Z",
  "refresh_token": "Npu_rwArsQlVwCv-LiZNvf2IRK6ftJQBMPYwdj7F40E",
  "refresh_expires_at": "2026-10-31T01:31:21.217652305Z",
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
  "command_id": "88f191f6-b987-44db-a348-b45464c4ca56",
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
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:31:21.812752Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "88f191f6-b987-44db-a348-b45464c4ca56",
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
  "changed_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:31:21.812752Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48373648541",
  "device_ref": "sandbox-30940"
}
```

```json
{
  "challenge_id": "97ed4be0-e39d-4620-8394-c6de44980561",
  "expires_at": "2026-10-30T13:36:22.413363696Z",
  "resend_available_at": "2026-10-30T13:31:23.413363696Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48373648541` → **200**

```json
{
  "phone": "+48373648541",
  "audience": "CLIENT",
  "code": "039251",
  "sent_at": "2026-10-30T13:31:22.416138357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97ed4be0-e39d-4620-8394-c6de44980561",
  "code": "039251",
  "device_ref": "sandbox-30940"
}
```

```json
{
  "session_id": "ec1d8f79-00c0-4ec8-8d64-a22c9e26890a",
  "subject": {
    "type": "CLIENT",
    "id": "04cb58c5-b482-4f4c-82d2-94cdd9a5748c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNGNiNThjNS1iNDgyLTRmNGMtODJkMi05NGNkZDlhNTc0OGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3OTgyLCJpYXQiOjE3OTMzNjcwODIsImp0aSI6IjAzZDI1NmE4LWIzNjItNGNjOS1iY2E3LTMxMjM2MDYyMDNmMyIsInNpZCI6ImVjMWQ4Zjc5LTAwYzAtNGVjOC04ZDY0LWEyMmM5ZTI2ODkwYSJ9.9-L2104-ib1e1XxOPcN6ieOWo2NFFOxHQ9KMdvrMbrQ",
  "access_expires_at": "2026-10-30T13:46:22.730161801Z",
  "refresh_token": "aTOuEHRgJFQD72LaSnBGw-CZ1nJFL5aKAEc_TYd8788",
  "refresh_expires_at": "2026-11-29T13:31:22.729607187Z",
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
  "correlation_id": "c14cbdc3-a45d-498f-8349-c79075cdb553"
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
  "device_ref": "sandbox-25117"
}
```

```json
{
  "challenge_id": "9d887350-53ed-4f2b-9d38-27ad51516a35",
  "expires_at": "2026-10-30T13:36:23.616601356Z",
  "resend_available_at": "2026-10-30T13:31:24.616601356Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "031062",
  "sent_at": "2026-10-30T13:31:23.619157968Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d887350-53ed-4f2b-9d38-27ad51516a35",
  "code": "031062",
  "device_ref": "sandbox-25117"
}
```

```json
{
  "session_id": "1f35d27a-c7eb-4b13-bf8c-2f341456bc31",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzk4MywiaWF0IjoxNzkzMzY3MDgzLCJqdGkiOiI5NTFkZTFhZi1hY2VjLTRmNzgtYjZjNS00Y2VhODMyZDRmZDUiLCJzaWQiOiIxZjM1ZDI3YS1jN2ViLTRiMTMtYmY4Yy0yZjM0MTQ1NmJjMzEifQ.sNUWtdOCzkn1yB4QrmXDfsKgTCxvc_GsUQdvoNfLVWo",
  "access_expires_at": "2026-10-30T13:46:23.930525474Z",
  "refresh_token": "2fuSr6tGhnh3HZrAoa3wP1WGjMDcTlp-Uuz2WtFPNeg",
  "refresh_expires_at": "2026-11-29T13:31:23.930004553Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be99d810-dcda-4328-a67f-cd02c1e371fb",
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
  "last_heartbeat_at": "2026-10-30T13:30:01.700594Z",
  "last_location_at": "2026-10-30T13:30:01.700594Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/be99d810-dcda-4328-a67f-cd02c1e371fb/handover` → **200**

```json
{
  "command_id": "5d07d06e-410d-4337-b1f8-54dfaac38c12",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be99d810-dcda-4328-a67f-cd02c1e371fb",
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
  "last_heartbeat_at": "2026-10-30T13:30:01.700594Z",
  "last_location_at": "2026-10-30T13:30:01.700594Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/be99d810-dcda-4328-a67f-cd02c1e371fb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:24Z",
    "sequence": 1793367084816
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be99d810-dcda-4328-a67f-cd02c1e371fb",
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
  "last_heartbeat_at": "2026-10-30T13:31:24.834968Z",
  "last_location_at": "2026-10-30T13:31:24.834968Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "session_id": "be99d810-dcda-4328-a67f-cd02c1e371fb",
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
  "last_heartbeat_at": "2026-10-30T13:31:24.834968Z",
  "last_location_at": "2026-10-30T13:31:24.834968Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/be99d810-dcda-4328-a67f-cd02c1e371fb/close` → **200**

```json
{
  "command_id": "10c4fa45-a27b-44b9-87f0-b24bacdc5398",
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
  "correlation_id": "783bfb42-4566-4adc-a851-073d7c8ad2ae"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675878555",
  "device_ref": "sandbox-2830"
}
```

```json
{
  "challenge_id": "fd066d3f-6025-43e6-9846-86487ad46cf9",
  "expires_at": "2026-10-30T13:36:26.295888461Z",
  "resend_available_at": "2026-10-30T13:31:27.295888461Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675878555` → **200**

```json
{
  "phone": "+380675878555",
  "audience": "CLIENT",
  "code": "739402",
  "sent_at": "2026-10-30T13:31:26.298300623Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd066d3f-6025-43e6-9846-86487ad46cf9",
  "code": "739402",
  "device_ref": "sandbox-2830"
}
```

```json
{
  "session_id": "37446165-cf21-478f-8e30-e0ab5ff05047",
  "subject": {
    "type": "CLIENT",
    "id": "d090c776-9e6c-4076-9a31-f9307b529503"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDkwYzc3Ni05ZTZjLTQwNzYtOWEzMS1mOTMwN2I1Mjk1MDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3OTg2LCJpYXQiOjE3OTMzNjcwODYsImp0aSI6IjRlODIxZjg0LTBhODUtNDJhZi05NTIyLTA4M2FjY2Y3MGRjMCIsInNpZCI6IjM3NDQ2MTY1LWNmMjEtNDc4Zi04ZTMwLWUwYWI1ZmYwNTA0NyJ9.C9cR4JfR2upQ9qHZyjOdxcq6VSvo9WXk69th9UvXSLM",
  "access_expires_at": "2026-10-30T13:46:26.602209284Z",
  "refresh_token": "8S2wYc5HlwoaRz-NuS7fA61IalSo96CEtsEfXJydowg",
  "refresh_expires_at": "2026-11-29T13:31:26.60164078Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "c1c6caf6-5ef7-45e9-b71e-ffe2182d4d74",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "fd5f9a43-7d89-46b2-b115-edcb6bc12f25",
  "upload_path": "/api/rider/v1/uploads/fd5f9a43-7d89-46b2-b115-edcb6bc12f25",
  "expires_at": "2026-10-30T13:46:26.900583009Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/fd5f9a43-7d89-46b2-b115-edcb6bc12f25` → **200**

```json
{
  "file_id": "fd5f9a43-7d89-46b2-b115-edcb6bc12f25",
  "state": "REJECTED",
  "content_type": null,
  "size_bytes": 0,
  "reject_reason": "The file did not pass the malware check"
}
```

## A PDF with a JavaScript action behind a name escape (/J#61vaScript) is refused

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "5ef526c9-b115-41af-9eb2-c10950cb82c6",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "6c17189e-ebaa-483f-a231-4b0fdb8125c6",
  "upload_path": "/api/rider/v1/uploads/6c17189e-ebaa-483f-a231-4b0fdb8125c6",
  "expires_at": "2026-10-30T13:46:27.234485525Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/6c17189e-ebaa-483f-a231-4b0fdb8125c6` → **200**

```json
{
  "file_id": "6c17189e-ebaa-483f-a231-4b0fdb8125c6",
  "state": "REJECTED",
  "content_type": null,
  "size_bytes": 0,
  "reject_reason": "PDF with active content is not accepted"
}
```

## Rider uploads a photo and opens a support case

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "41d81481-0894-49f0-9981-10a144bf5cf5",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b50fbc68-cd74-4c08-a911-b1bc814f5d9f",
  "upload_path": "/api/rider/v1/uploads/b50fbc68-cd74-4c08-a911-b1bc814f5d9f",
  "expires_at": "2026-10-30T13:46:27.545351131Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b50fbc68-cd74-4c08-a911-b1bc814f5d9f` → **200**

```json
{
  "file_id": "b50fbc68-cd74-4c08-a911-b1bc814f5d9f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "617b1e04-17ec-479a-a377-4a8a3dceedc2",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b50fbc68-cd74-4c08-a911-b1bc814f5d9f"
  ]
}
```

```json
{
  "id": "066a8b79-5b72-4d01-8a36-05485405c4f1",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d090c776-9e6c-4076-9a31-f9307b529503",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:31:27.861769Z",
  "updated_at": "2026-10-30T13:31:27.861769Z",
  "respond_by": "2026-10-30T17:31:27.861769Z",
  "messages": [
    {
      "id": "45983ad0-1f09-4401-bef4-7e7b05384158",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d090c776-9e6c-4076-9a31-f9307b529503",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:31:27.863015Z",
      "attachments": [
        {
          "file_id": "b50fbc68-cd74-4c08-a911-b1bc814f5d9f",
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
  "session_id": "16b734f4-43a9-4067-b947-692f6b907a1e",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5ODgsImlhdCI6MTc5MzM2NzA4OCwianRpIjoiNDg1NGM4YmItMDc2NS00OWI4LWIwZjktN2RmYWQ4MmFhOGUwIiwic2lkIjoiMTZiNzM0ZjQtNDNhOS00MDY3LWI5NDctNjkyZjZiOTA3YTFlIn0.Sgreod5awu6s9lrm_XCFLHdVDO7umwCostafckHJ4OU",
  "access_expires_at": "2026-10-30T13:46:28.470201425Z",
  "refresh_token": "qm2uohkJMAB1Tgq0vT-zZKd1EbONyKwen4xLUxt97Ok",
  "refresh_expires_at": "2026-10-31T01:31:28.469663873Z",
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
  "session_id": "ac60f3af-891c-4fe5-ac57-b6678eb32e4e",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5ODksImlhdCI6MTc5MzM2NzA4OSwianRpIjoiOTE1MGVlNDYtNmQwMy00MjZhLWEyMTItOTM4NjcxNDkxMWQ1Iiwic2lkIjoiYWM2MGYzYWYtODkxYy00ZmU1LWFjNTctYjY2NzhlYjMyZTRlIn0.wZnBcLG2_hWXGUu7DArRp70Ufk9eZJ231paWH6CCr6s",
  "access_expires_at": "2026-10-30T13:46:29.061183578Z",
  "refresh_token": "8_XwFHdrv193f5GYBBBC8FEDfnI1pVCe9UB2axaYfeU",
  "refresh_expires_at": "2026-10-31T01:31:29.060611641Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/066a8b79-5b72-4d01-8a36-05485405c4f1/attachments/b50fbc68-cd74-4c08-a911-b1bc814f5d9f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "667765df-1b54-4659-babf-a86e68aff989",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7a934d91-a7c5-4797-bea7-a7c6261a00c5",
  "upload_path": "/api/operator/v1/uploads/7a934d91-a7c5-4797-bea7-a7c6261a00c5",
  "expires_at": "2026-10-30T13:46:29.364970034Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/7a934d91-a7c5-4797-bea7-a7c6261a00c5` → **200**

```json
{
  "file_id": "7a934d91-a7c5-4797-bea7-a7c6261a00c5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/066a8b79-5b72-4d01-8a36-05485405c4f1` → **200**

```json
{
  "id": "066a8b79-5b72-4d01-8a36-05485405c4f1",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d090c776-9e6c-4076-9a31-f9307b529503",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:31:27.861769Z",
  "updated_at": "2026-10-30T13:31:27.861769Z",
  "respond_by": "2026-10-30T17:31:27.861769Z",
  "messages": [
    {
      "id": "45983ad0-1f09-4401-bef4-7e7b05384158",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d090c776-9e6c-4076-9a31-f9307b529503",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:31:27.863015Z",
      "attachments": [
        {
          "file_id": "b50fbc68-cd74-4c08-a911-b1bc814f5d9f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/066a8b79-5b72-4d01-8a36-05485405c4f1/comments` → **200**

```json
{
  "command_id": "db537e47-1a5c-4207-b484-420bdc03cee3",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "7a934d91-a7c5-4797-bea7-a7c6261a00c5"
  ]
}
```

```json
{
  "id": "066a8b79-5b72-4d01-8a36-05485405c4f1",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d090c776-9e6c-4076-9a31-f9307b529503",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:31:27.861769Z",
  "updated_at": "2026-10-30T13:31:30.002037Z",
  "respond_by": "2026-10-30T17:31:27.861769Z",
  "messages": [
    {
      "id": "45983ad0-1f09-4401-bef4-7e7b05384158",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d090c776-9e6c-4076-9a31-f9307b529503",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:31:27.863015Z",
      "attachments": [
        {
          "file_id": "b50fbc68-cd74-4c08-a911-b1bc814f5d9f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6e514901-4a27-44d7-88c7-4379b0e70ce7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:31:30.001503Z",
      "attachments": [
        {
          "file_id": "7a934d91-a7c5-4797-bea7-a7c6261a00c5",
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

`GET /api/rider/v1/support/cases/066a8b79-5b72-4d01-8a36-05485405c4f1` → **200**

```json
{
  "id": "066a8b79-5b72-4d01-8a36-05485405c4f1",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "d090c776-9e6c-4076-9a31-f9307b529503",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:31:27.861769Z",
  "updated_at": "2026-10-30T13:31:30.002037Z",
  "respond_by": "2026-10-30T17:31:27.861769Z",
  "messages": [
    {
      "id": "45983ad0-1f09-4401-bef4-7e7b05384158",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "d090c776-9e6c-4076-9a31-f9307b529503",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:31:27.863015Z",
      "attachments": [
        {
          "file_id": "b50fbc68-cd74-4c08-a911-b1bc814f5d9f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "6e514901-4a27-44d7-88c7-4379b0e70ce7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:31:30.001503Z",
      "attachments": [
        {
          "file_id": "7a934d91-a7c5-4797-bea7-a7c6261a00c5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/066a8b79-5b72-4d01-8a36-05485405c4f1/attachments/7a934d91-a7c5-4797-bea7-a7c6261a00c5` → **200**

Done: support case 066a8b79-5b72-4d01-8a36-05485405c4f1, rider attachment b50fbc68-cd74-4c08-a911-b1bc814f5d9f, operator attachment 7a934d91-a7c5-4797-bea7-a7c6261a00c5.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734543625",
  "device_ref": "sandbox-202"
}
```

```json
{
  "challenge_id": "146be08b-8c24-45cc-affa-19d44ab6202e",
  "expires_at": "2026-10-30T13:36:30.639484047Z",
  "resend_available_at": "2026-10-30T13:31:31.639484047Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734543625` → **200**

```json
{
  "phone": "+380734543625",
  "audience": "CLIENT",
  "code": "759775",
  "sent_at": "2026-10-30T13:31:30.643168832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "146be08b-8c24-45cc-affa-19d44ab6202e",
  "code": "759775",
  "device_ref": "sandbox-202"
}
```

```json
{
  "session_id": "26ea2442-bd25-4161-b6f4-6fcbbd61a825",
  "subject": {
    "type": "CLIENT",
    "id": "4d5b149b-1e42-4159-8140-f12a60865b39"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDViMTQ5Yi0xZTQyLTQxNTktODE0MC1mMTJhNjA4NjViMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3OTkwLCJpYXQiOjE3OTMzNjcwOTAsImp0aSI6IjM3ZjgwZTQ1LTcxMTAtNDE1YS1hMDMzLTg4YjMzMzYwNTI3NSIsInNpZCI6IjI2ZWEyNDQyLWJkMjUtNDE2MS1iNmY0LTZmY2JiZDYxYTgyNSJ9.WotrVSj7tZqjJuJaRPtM1wn36yP6zyn6UQQmGc5hxgk",
  "access_expires_at": "2026-10-30T13:46:30.95350513Z",
  "refresh_token": "7WembQkJWdFBEoDJiiAZ7x0SaAlODnF-oKhxH1OMHHg",
  "refresh_expires_at": "2026-11-29T13:31:30.952983371Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d28dd492-246a-4591-8664-1357621061de",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2703425a-940a-4a2d-92af-d83ab47662f5",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2703425a-940a-4a2d-92af-d83ab47662f5",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ac51694fcce0fe301dceab7d197e281f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2703425a-940a-4a2d-92af-d83ab47662f5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734543625"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2703425a-940a-4a2d-92af-d83ab47662f5",
  "expires_at": "2026-10-30T14:01:31.234601Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/2703425a-940a-4a2d-92af-d83ab47662f5` → **200**

```json
{
  "id": "2703425a-940a-4a2d-92af-d83ab47662f5",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T14:01:31.234601Z",
  "card": {
    "id": "7cc9d3fe-4c79-4125-be14-b8d1e6206d61",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3090",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:31:31.526064Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "23c0e807-82df-40b0-a342-167c3780e948",
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
  "id": "7cf66c12-0b4b-4d37-aa5a-fa3f9a125745",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:36:31.832097Z",
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

`POST /api/rider/v1/orders` → **202**

```json
{
  "command_id": "5bfd99ee-f164-48c1-966a-14193615373e",
  "quote_id": "7cf66c12-0b4b-4d37-aa5a-fa3f9a125745",
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
  "id": "a9e507a2-e5e9-43ea-adf1-5440449bcf61",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4d5b149b-1e42-4159-8140-f12a60865b39",
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
  "created_at": "2026-10-30T13:31:32.139221Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a9e507a2-e5e9-43ea-adf1-5440449bcf61` → **200**

```json
{
  "id": "a9e507a2-e5e9-43ea-adf1-5440449bcf61",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4d5b149b-1e42-4159-8140-f12a60865b39",
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
  "created_at": "2026-10-30T13:31:32.139221Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a9e507a2-e5e9-43ea-adf1-5440449bcf61` → **200**

```json
{
  "id": "a9e507a2-e5e9-43ea-adf1-5440449bcf61",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4d5b149b-1e42-4159-8140-f12a60865b39",
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
  "created_at": "2026-10-30T13:31:32.139221Z",
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

`GET /api/rider/v1/orders/a9e507a2-e5e9-43ea-adf1-5440449bcf61` → **200**

```json
{
  "id": "a9e507a2-e5e9-43ea-adf1-5440449bcf61",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4d5b149b-1e42-4159-8140-f12a60865b39",
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
  "created_at": "2026-10-30T13:31:32.139221Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a9e507a2-e5e9-43ea-adf1-5440449bcf61/switch-to-cash` → **200**

```json
{
  "command_id": "ead73ac3-b479-4ff6-8528-64888455961f",
  "expected_version": 3
}
```

```json
{
  "id": "a9e507a2-e5e9-43ea-adf1-5440449bcf61",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4d5b149b-1e42-4159-8140-f12a60865b39",
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
  "created_at": "2026-10-30T13:31:32.139221Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a9e507a2-e5e9-43ea-adf1-5440449bcf61/switch-to-cash` → **409**

```json
{
  "command_id": "82ec9fba-c0dc-472f-9d31-b181c01330a0",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/a9e507a2-e5e9-43ea-adf1-5440449bcf61/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b199f65f-3ab4-460e-9946-1a69449cbe20"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/a9e507a2-e5e9-43ea-adf1-5440449bcf61` → **200**

```json
{
  "id": "a9e507a2-e5e9-43ea-adf1-5440449bcf61",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4d5b149b-1e42-4159-8140-f12a60865b39",
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
  "created_at": "2026-10-30T13:31:32.139221Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a9e507a2-e5e9-43ea-adf1-5440449bcf61/cancel` → **200**

```json
{
  "command_id": "e3e43628-8252-4495-8e01-dd71bcf29a72",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a9e507a2-e5e9-43ea-adf1-5440449bcf61",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4d5b149b-1e42-4159-8140-f12a60865b39",
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
  "created_at": "2026-10-30T13:31:32.139221Z",
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
  "session_id": "2c3ef9cc-b2e9-4b2b-9145-1134939b9c18",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc5OTUsImlhdCI6MTc5MzM2NzA5NSwianRpIjoiZDEzMDI1YzYtODM2ZC00NmE1LTg4ZWEtNDc4MjE5N2RiNjg1Iiwic2lkIjoiMmMzZWY5Y2MtYjJlOS00YjJiLTkxNDUtMTEzNDkzOWI5YzE4In0.5xDlhZkUiAGtQuXiCp6NXWaa8IDoZ_KcOPHNImpEEQo",
  "access_expires_at": "2026-10-30T13:46:35.863955548Z",
  "refresh_token": "s34iJMPzfHemC7e5odZ60IiUC9Z1rnrXXtTnhqHzHBQ",
  "refresh_expires_at": "2026-10-31T01:31:35.863306067Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4680"
}
```

```json
{
  "challenge_id": "9da997d8-0aa1-4935-b603-9ba49b0380e4",
  "expires_at": "2026-10-30T13:36:36.15852927Z",
  "resend_available_at": "2026-10-30T13:31:37.15852927Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "334846",
  "sent_at": "2026-10-30T13:31:36.161590109Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9da997d8-0aa1-4935-b603-9ba49b0380e4",
  "code": "334846",
  "device_ref": "sandbox-4680"
}
```

```json
{
  "session_id": "b380cc9b-dabd-4b62-b262-5b158b36a2d5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzk5NiwiaWF0IjoxNzkzMzY3MDk2LCJqdGkiOiI1NDM4NjhiNy0zNjBkLTRlYTctYTRmMi1kNmNjZDRlOTdlOTkiLCJzaWQiOiJiMzgwY2M5Yi1kYWJkLTRiNjItYjI2Mi01YjE1OGIzNmEyZDUifQ.x3EYCjzTmZbo3pk6MDWKSIW8YlEfW4S1rz07tGn3i50",
  "access_expires_at": "2026-10-30T13:46:36.478657511Z",
  "refresh_token": "kHkMDtec5WFFvUvYY0BQW4fXVNBUfhpVLQurALwXphg",
  "refresh_expires_at": "2026-11-29T13:31:36.478113898Z",
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
      "actor_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:31:18.505348Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T13:31:20.014556Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "83c33ac4-535f-4870-8e53-1b28cbab087c",
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
  "device_ref": "sandbox-5140"
}
```

```json
{
  "challenge_id": "ee286546-5962-4823-b0d4-ef636a6929bb",
  "expires_at": "2026-10-30T13:36:37.646005619Z",
  "resend_available_at": "2026-10-30T13:31:38.646005619Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "163442",
  "sent_at": "2026-10-30T13:31:37.649772455Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee286546-5962-4823-b0d4-ef636a6929bb",
  "code": "163442",
  "device_ref": "sandbox-5140"
}
```

```json
{
  "session_id": "6ed2ece9-dd95-479d-a47f-d21109575d1b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzk5NywiaWF0IjoxNzkzMzY3MDk3LCJqdGkiOiI1Mjg4OWFlZi0zNTAyLTQwNWMtOTJkMy1kOTFlMzI4Y2FjYjIiLCJzaWQiOiI2ZWQyZWNlOS1kZDk1LTQ3OWQtYTQ3Zi1kMjExMDk1NzVkMWIifQ.HD1vbV6MqH2iLW0dJkAfX1xO_zPYEsAPCGSxS0XkWOs",
  "access_expires_at": "2026-10-30T13:46:37.95088971Z",
  "refresh_token": "Hrg6_rAIRagNDuOaplwFUdThYvOuyrF8pZ67MPDG7OE",
  "refresh_expires_at": "2026-11-29T13:31:37.950333534Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39bde660-c2b7-4282-bc40-4e6f804a13f2",
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
  "last_heartbeat_at": "2026-10-30T13:30:57.378135Z",
  "last_location_at": "2026-10-30T13:30:57.378135Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/39bde660-c2b7-4282-bc40-4e6f804a13f2/handover` → **200**

```json
{
  "command_id": "aa30cc99-8fea-44dc-a1e8-7eb9642093a0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39bde660-c2b7-4282-bc40-4e6f804a13f2",
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
  "last_heartbeat_at": "2026-10-30T13:30:57.378135Z",
  "last_location_at": "2026-10-30T13:30:57.378135Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 8 s to the next point)

`POST /api/driver/v1/work-sessions/39bde660-c2b7-4282-bc40-4e6f804a13f2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:46Z",
    "sequence": 1793367106832
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "39bde660-c2b7-4282-bc40-4e6f804a13f2",
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
  "last_heartbeat_at": "2026-10-30T13:31:46.849665Z",
  "last_location_at": "2026-10-30T13:31:46.849665Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
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
  "command_id": "98c68e80-90ee-47b5-9520-3aad614bea9a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:47Z",
    "sequence": 1793367107439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a23cf74e-dfb8-4a61-b7a6-79f296f72eb6",
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
  "last_heartbeat_at": "2026-10-30T13:31:47.456927Z",
  "last_location_at": "2026-10-30T13:31:47.456927Z",
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
  "session_id": "ca4477ea-7f23-4f4b-84d4-31c9eb1e08c7",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgwMDgsImlhdCI6MTc5MzM2NzEwOCwianRpIjoiNWFjOTQ0MjgtNDI2Yi00YzMwLTg0ZmQtYzU4MzQ4N2EwYWJiIiwic2lkIjoiY2E0NDc3ZWEtN2YyMy00ZjRiLTg0ZDQtMzFjOWViMWUwOGM3In0.i_O_LXIaXeR8cj_pCpCW3taaHs6lz6RaQ_DYDaOcfWM",
  "access_expires_at": "2026-10-30T13:46:48.047923836Z",
  "refresh_token": "rpF02NSxL3sd1yb5WS-dQboZ9d4LOfrNovHj_7ztv6Q",
  "refresh_expires_at": "2026-10-31T01:31:48.047314368Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8f6e3169-c362-4716-82ef-2a0134462676",
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
  "id": "e585d1b9-1f2e-490b-ad44-299a4867b73a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:36:48.335247Z",
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
  "command_id": "61a87609-b1ed-4548-a8c2-66bc6bfbb02b",
  "quote_id": "e585d1b9-1f2e-490b-ad44-299a4867b73a",
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
  "id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
  "short_number": 28,
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
  "created_at": "2026-10-30T13:31:48.645756Z",
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
    "id": "916c7305-b7c7-4e44-9a74-da7a4ae1213c",
    "order_id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
    "expires_at": "2026-10-30T13:32:03.649658Z",
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

`POST /api/driver/v1/offers/916c7305-b7c7-4e44-9a74-da7a4ae1213c/accept` → **200**

```json
{
  "command_id": "a73bbafa-a970-481f-8554-56317eae1560"
}
```

```json
{
  "id": "71ad456c-dbdb-44ce-bf8f-fed8b556a50b",
  "order_id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "09115575-a20a-4df9-8e68-929a557eda52",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "09115575-a20a-4df9-8e68-929a557eda52",
  "order_id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
  "assignment_id": "71ad456c-dbdb-44ce-bf8f-fed8b556a50b",
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

(the car drives 9 s to the next point)

`POST /api/driver/v1/work-sessions/a23cf74e-dfb8-4a61-b7a6-79f296f72eb6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:59Z",
    "sequence": 1793367119135
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a23cf74e-dfb8-4a61-b7a6-79f296f72eb6",
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
  "last_heartbeat_at": "2026-10-30T13:31:59.154242Z",
  "last_location_at": "2026-10-30T13:31:59.154242Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/09115575-a20a-4df9-8e68-929a557eda52/arrive` → **200**

```json
{
  "command_id": "73403bce-705f-474e-8bfb-87a2f77a7732",
  "expected_version": 0
}
```

```json
{
  "id": "09115575-a20a-4df9-8e68-929a557eda52",
  "order_id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
  "assignment_id": "71ad456c-dbdb-44ce-bf8f-fed8b556a50b",
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
  "arrived_at": "2026-10-30T13:31:59.461972Z",
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

`POST /api/driver/v1/trips/09115575-a20a-4df9-8e68-929a557eda52/start` → **200**

```json
{
  "command_id": "3c315d4d-ba45-423c-8f06-d26767102bc4",
  "expected_version": 1
}
```

```json
{
  "id": "09115575-a20a-4df9-8e68-929a557eda52",
  "order_id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
  "assignment_id": "71ad456c-dbdb-44ce-bf8f-fed8b556a50b",
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
  "arrived_at": "2026-10-30T13:31:59.461972Z",
  "started_at": "2026-10-30T13:31:59.773967Z",
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

`POST /api/driver/v1/trips/09115575-a20a-4df9-8e68-929a557eda52/complete` → **200**

```json
{
  "command_id": "d2e7d305-2f8a-4158-b92f-50e8353ee166",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:32:00Z",
  "cash_received": true
}
```

```json
{
  "id": "09115575-a20a-4df9-8e68-929a557eda52",
  "order_id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
  "assignment_id": "71ad456c-dbdb-44ce-bf8f-fed8b556a50b",
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
  "arrived_at": "2026-10-30T13:31:59.461972Z",
  "started_at": "2026-10-30T13:31:59.773967Z",
  "completed_at": "2026-10-30T13:32:00.072317Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/f613446f-2924-4fc5-8a3f-1d5942ca8f66` → **200**

```json
{
  "id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
  "short_number": 28,
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
    "id": "71ad456c-dbdb-44ce-bf8f-fed8b556a50b",
    "order_id": "f613446f-2924-4fc5-8a3f-1d5942ca8f66",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "09115575-a20a-4df9-8e68-929a557eda52",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:31:48.645756Z",
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
  "session_id": "39bde660-c2b7-4282-bc40-4e6f804a13f2",
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
  "last_heartbeat_at": "2026-10-30T13:31:46.849665Z",
  "last_location_at": "2026-10-30T13:31:46.849665Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/39bde660-c2b7-4282-bc40-4e6f804a13f2/close` → **200**

```json
{
  "command_id": "944c3d4e-9bf3-48e3-bb07-b7f8e188f5a2",
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
  "session_id": "a23cf74e-dfb8-4a61-b7a6-79f296f72eb6",
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
  "last_heartbeat_at": "2026-10-30T13:31:59.154242Z",
  "last_location_at": "2026-10-30T13:31:59.154242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a23cf74e-dfb8-4a61-b7a6-79f296f72eb6/close` → **200**

```json
{
  "command_id": "90e0658a-7774-4b59-ae64-3302c0cd9141",
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

Done: terminal order f613446f-2924-4fc5-8a3f-1d5942ca8f66 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12610"
}
```

```json
{
  "challenge_id": "f6c2ce6b-1e24-4779-b70e-63082fd88324",
  "expires_at": "2026-10-30T13:37:05.137776961Z",
  "resend_available_at": "2026-10-30T13:32:06.137776961Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "313573",
  "sent_at": "2026-10-30T13:32:05.140367601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6c2ce6b-1e24-4779-b70e-63082fd88324",
  "code": "313573",
  "device_ref": "sandbox-12610"
}
```

```json
{
  "session_id": "edca1667-9672-4230-97c2-9c88e4f3601b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODAyNSwiaWF0IjoxNzkzMzY3MTI1LCJqdGkiOiJjZjczOTVmZi03M2JiLTQ0MDEtODNiZS02ZWNjZjg1MDVmZDEiLCJzaWQiOiJlZGNhMTY2Ny05NjcyLTQyMzAtOTdjMi05Yzg4ZTRmMzYwMWIifQ.CIGFAKKQtnELmWowQV1EZpgF05tUfmIj6OV4ZeDsp8s",
  "access_expires_at": "2026-10-30T13:47:05.450503936Z",
  "refresh_token": "WILNYhqxUwgRnPstulD620NCRZkogZy5issLpanZ-Zo",
  "refresh_expires_at": "2026-11-29T13:32:05.449934085Z",
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
  "device_ref": "sandbox-30366"
}
```

```json
{
  "challenge_id": "d261d0d6-2ea1-458b-ae99-0b438b97f99f",
  "expires_at": "2026-10-30T13:37:06.016243457Z",
  "resend_available_at": "2026-10-30T13:32:07.016243457Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "942684",
  "sent_at": "2026-10-30T13:32:06.018885032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d261d0d6-2ea1-458b-ae99-0b438b97f99f",
  "code": "942684",
  "device_ref": "sandbox-30366"
}
```

```json
{
  "session_id": "455b3b4e-c2fc-4609-8700-bcdeca4726c4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODAyNiwiaWF0IjoxNzkzMzY3MTI2LCJqdGkiOiJlODBhNTA5OC0zMDRkLTRiZTAtOTRmMi0zYzkxYTRlMzVmZTIiLCJzaWQiOiI0NTViM2I0ZS1jMmZjLTQ2MDktODcwMC1iY2RlY2E0NzI2YzQifQ.wcQWkJLBPqB2y_JQX-ACeiDoZSpwTWU4fW0f60Bryk0",
  "access_expires_at": "2026-10-30T13:47:06.331295819Z",
  "refresh_token": "kQjpbjBBJvYXkAq40DT3Yg9zSHi4gyX4Fg4CDW5jUkU",
  "refresh_expires_at": "2026-11-29T13:32:06.330719105Z",
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
  "device_ref": "sandbox-31057"
}
```

```json
{
  "challenge_id": "e2eb17c1-8f4f-4f5b-8018-cff94a8218cf",
  "expires_at": "2026-10-30T13:37:06.898432486Z",
  "resend_available_at": "2026-10-30T13:32:07.898432486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "204873",
  "sent_at": "2026-10-30T13:32:06.90092416Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2eb17c1-8f4f-4f5b-8018-cff94a8218cf",
  "code": "204873",
  "device_ref": "sandbox-31057"
}
```

```json
{
  "session_id": "d1a092b3-3566-413a-8e6d-ca444cf6c027",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODAyNywiaWF0IjoxNzkzMzY3MTI3LCJqdGkiOiJiNTdhY2ExMC00ZThiLTQ5YzktODgyZi0xZDM0NDFiYzk2NjUiLCJzaWQiOiJkMWEwOTJiMy0zNTY2LTQxM2EtOGU2ZC1jYTQ0NGNmNmMwMjcifQ.WaehG6LyWh6G5YZhrySwMZxIlR9Z5ezaRex8L-4hL4g",
  "access_expires_at": "2026-10-30T13:47:07.216849604Z",
  "refresh_token": "c3yzXvnW9aOsE-Kh8CS5KX-QQTOOhDd_hA_BRfGJ5os",
  "refresh_expires_at": "2026-11-29T13:32:07.216294871Z",
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
  "phone": "+380694553129",
  "device_ref": "sandbox-13565"
}
```

```json
{
  "challenge_id": "0f5eba01-408a-408b-806c-668f6e21b6e5",
  "expires_at": "2026-10-30T13:37:07.802614721Z",
  "resend_available_at": "2026-10-30T13:32:08.802614721Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694553129` → **200**

```json
{
  "phone": "+380694553129",
  "audience": "CLIENT",
  "code": "386049",
  "sent_at": "2026-10-30T13:32:07.805366791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f5eba01-408a-408b-806c-668f6e21b6e5",
  "code": "386049",
  "device_ref": "sandbox-13565"
}
```

```json
{
  "session_id": "d38823e2-05e0-4e46-849b-947b062d29b5",
  "subject": {
    "type": "CLIENT",
    "id": "a6982b4d-a712-4290-b020-c607def61b73"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjk4MmI0ZC1hNzEyLTQyOTAtYjAyMC1jNjA3ZGVmNjFiNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MDI4LCJpYXQiOjE3OTMzNjcxMjgsImp0aSI6IjA0Y2ExNzUxLTczYjEtNGNiNC1iNDIyLWIwM2JjYjcxMDI5OCIsInNpZCI6ImQzODgyM2UyLTA1ZTAtNGU0Ni04NDliLTk0N2IwNjJkMjliNSJ9.hPetVhCFc2v0Y4fV02iIKy_oIstuOvzsw26X0z5ePLU",
  "access_expires_at": "2026-10-30T13:47:08.11890781Z",
  "refresh_token": "tKDqy5Qa7rN_iSTA62rhOkbl2ex0NZq_pfOl6PSwtPE",
  "refresh_expires_at": "2026-11-29T13:32:08.118325228Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04352569-9142-446a-bb6e-336aa410acd8",
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
  "id": "4759facb-aba2-484f-81dc-5c7140e5416b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:37:08.404593Z",
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
  "command_id": "8a1fe072-a6b9-47f5-8171-475d2af6eb59",
  "quote_id": "4759facb-aba2-484f-81dc-5c7140e5416b",
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
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:32:08.710694Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:32:08.710694Z",
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
  "blizz_orders_total": 29,
  "blizz_orders_cancelled_total": 15,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 18,
  "blizz_dispatch_assigned_seconds_count": 18,
  "blizz_offers_total": 20,
  "blizz_dispatch_excluded_total": 12,
  "blizz_sms_sent_total": 77
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 12.246703125
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.28182519
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.183073283
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 17.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 21.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 70.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/31ea44c8-8cb5-4862-90ec-ebea857e01c7` → **200**

```json
{
  "id": "31ea44c8-8cb5-4862-90ec-ebea857e01c7",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6982b4d-a712-4290-b020-c607def61b73",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:32:08.710694Z",
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
  "session_id": "19fa3f4b-12e5-41a0-a36a-5cb6558fdee6",
  "subject": {
    "type": "STAFF",
    "id": "6fbdd889-5214-4e17-b720-9961d4657bb6"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmJkZDg4OS01MjE0LTRlMTctYjcyMC05OTYxZDQ2NTdiYjYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyMTAsImlhdCI6MTc5MzM2NzMxMCwianRpIjoiYzIwMGQ4N2MtYmU5Ni00NTA0LTgzMjktNWZiMjgwZDAyOTVmIiwic2lkIjoiMTlmYTNmNGItMTJlNS00MWEwLWEzNmEtNWNiNjU1OGZkZWU2In0.uGtkIj5wD1uKlhoJujEIeztq6JoFZfbSaOpXYIRX9IM",
  "access_expires_at": "2026-10-30T13:50:10.924291231Z",
  "refresh_token": "aYVzCYMkpaZWWO4kgPt9BaWda_zUSW0bPK3z0z7jk18",
  "refresh_expires_at": "2026-10-31T01:35:10.923398207Z",
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
  "id": "ac296e8f-ea53-4592-a6b3-8a0291b2af82",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:35:11.24296Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:35:11.242996Z",
  "updated_at": "2026-10-30T13:35:11.260762Z",
  "finished_at": "2026-10-30T13:35:11.260762Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/ac296e8f-ea53-4592-a6b3-8a0291b2af82` → **200**

```json
{
  "run": {
    "id": "ac296e8f-ea53-4592-a6b3-8a0291b2af82",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:35:11.24296Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:35:11.242996Z",
    "updated_at": "2026-10-30T13:35:11.260762Z",
    "finished_at": "2026-10-30T13:35:11.260762Z",
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
  "id": "ac296e8f-ea53-4592-a6b3-8a0291b2af82",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:35:11.24296Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:35:11.242996Z",
  "updated_at": "2026-10-30T13:35:11.260762Z",
  "finished_at": "2026-10-30T13:35:11.260762Z",
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
  "id": "ac296e8f-ea53-4592-a6b3-8a0291b2af82",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:35:11.24296Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:35:11.242996Z",
  "updated_at": "2026-10-30T13:35:11.260762Z",
  "finished_at": "2026-10-30T13:35:11.260762Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/9e81ebb4-2b9a-47b1-9da2-14736c895aef` → **204**

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
  "id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:35:11.707352Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:35:11.707383Z",
  "updated_at": "2026-10-30T13:35:11.715183Z",
  "finished_at": "2026-10-30T13:35:11.715183Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/f1278130-befa-4912-aac3-d3a8b441bb1b` → **200**

```json
{
  "run": {
    "id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:35:11.707352Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:35:11.707383Z",
    "updated_at": "2026-10-30T13:35:11.715183Z",
    "finished_at": "2026-10-30T13:35:11.715183Z",
    "version": 1
  },
  "items": [
    {
      "id": "55053659-ec94-465d-bf5e-77dee11749eb",
      "run_id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "be4d00539ad507fcbd094ebbf99ef1ae61e62e230f99772ba9babe4f81975d93",
      "reference_display": "sandbox-reconciliation-9e81ebb4-2b9a-47b1-9da2-#####c895aef",
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
      "provider_at": "2026-10-30T13:35:11Z",
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
  "id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:35:11.707352Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:35:11.707383Z",
  "updated_at": "2026-10-30T13:35:11.715183Z",
  "finished_at": "2026-10-30T13:35:11.715183Z",
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
  "id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:35:11.707352Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:35:11.707383Z",
  "updated_at": "2026-10-30T13:35:11.715183Z",
  "finished_at": "2026-10-30T13:35:11.715183Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/55053659-ec94-465d-bf5e-77dee11749eb/resolve` → **200**

```json
{
  "command_id": "48d5d41b-1956-4e6f-b7a3-60735f321aff",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "55053659-ec94-465d-bf5e-77dee11749eb",
  "run_id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "be4d00539ad507fcbd094ebbf99ef1ae61e62e230f99772ba9babe4f81975d93",
  "reference_display": "sandbox-reconciliation-9e81ebb4-2b9a-47b1-9da2-#####c895aef",
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
  "provider_at": "2026-10-30T13:35:11Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "resolved_at": "2026-10-30T13:35:12.141114Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/55053659-ec94-465d-bf5e-77dee11749eb/resolve` → **200**

```json
{
  "command_id": "48d5d41b-1956-4e6f-b7a3-60735f321aff",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "55053659-ec94-465d-bf5e-77dee11749eb",
  "run_id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "be4d00539ad507fcbd094ebbf99ef1ae61e62e230f99772ba9babe4f81975d93",
  "reference_display": "sandbox-reconciliation-9e81ebb4-2b9a-47b1-9da2-#####c895aef",
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
  "provider_at": "2026-10-30T13:35:11Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
  "resolved_at": "2026-10-30T13:35:12.141114Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/55053659-ec94-465d-bf5e-77dee11749eb/resolve` → **409**

```json
{
  "command_id": "148a2cc7-8690-45b7-bb31-25b5cde65d95",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/55053659-ec94-465d-bf5e-77dee11749eb/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "38daa380-2dcf-4164-beea-fb20d5993373"
}
```

`GET /api/admin/v1/payment-reconciliations/f1278130-befa-4912-aac3-d3a8b441bb1b` → **200**

```json
{
  "run": {
    "id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:35:11.707352Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:35:11.707383Z",
    "updated_at": "2026-10-30T13:35:12.141114Z",
    "finished_at": "2026-10-30T13:35:11.715183Z",
    "version": 2
  },
  "items": [
    {
      "id": "55053659-ec94-465d-bf5e-77dee11749eb",
      "run_id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "be4d00539ad507fcbd094ebbf99ef1ae61e62e230f99772ba9babe4f81975d93",
      "reference_display": "sandbox-reconciliation-9e81ebb4-2b9a-47b1-9da2-#####c895aef",
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
      "provider_at": "2026-10-30T13:35:11Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "6fbdd889-5214-4e17-b720-9961d4657bb6",
      "resolved_at": "2026-10-30T13:35:12.141114Z",
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
      "id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T13:35:11.707352Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:35:11.707383Z",
      "updated_at": "2026-10-30T13:35:12.141114Z",
      "finished_at": "2026-10-30T13:35:11.715183Z",
      "version": 2
    },
    {
      "id": "740024ac-f1c4-4e1c-b330-c5eec25b3e44",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T13:15:49.089605Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:15:49.089715Z",
      "updated_at": "2026-10-30T13:15:49.095696Z",
      "finished_at": "2026-10-30T13:15:49.095696Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/9e81ebb4-2b9a-47b1-9da2-14736c895aef` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "f1278130-befa-4912-aac3-d3a8b441bb1b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:35:11.707352Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:35:11.707383Z",
  "updated_at": "2026-10-30T13:35:12.141114Z",
  "finished_at": "2026-10-30T13:35:11.715183Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793367434508E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793367434902E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793367434902E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793367434508E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793367434903E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
