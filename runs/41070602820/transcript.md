# Sandbox transcript (2026-10-30T14:18:44Z, d567f66)

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
  "correlation_id": "1637607c-6d93-494e-8194-a14da245c1f6"
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
  "session_id": "5ce9b7a6-23f3-4472-b2ec-07701d1bc581",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzA4MzQsImlhdCI6MTc5MzM2OTkzNCwianRpIjoiNGY1YWM0MWUtNjI2YS00YjlhLWI3OTgtOGYwNjZhNzkwODI1Iiwic2lkIjoiNWNlOWI3YTYtMjNmMy00NDcyLWIyZWMtMDc3MDFkMWJjNTgxIn0.seE2oXfGs-pfTfFGZxe92ONkzrQDqA8z9pnBHD1jzLU",
  "access_expires_at": "2026-10-30T14:33:54.937424182Z",
  "refresh_token": "EVz89Gri_EN9ix8BIw7KOG7mklYG3wDAXmQTvwCl1io",
  "refresh_expires_at": "2026-10-31T02:18:54.935200324Z",
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
  "session_id": "48ad1e35-704f-4398-9d52-805e7b75f525",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzA4MzYsImlhdCI6MTc5MzM2OTkzNiwianRpIjoiZThiMWYwZGEtMzMwMC00OWY4LTg5YzQtYzdkMTYxNWRkZjkxIiwic2lkIjoiNDhhZDFlMzUtNzA0Zi00Mzk4LTlkNTItODA1ZTdiNzVmNTI1In0.fpgNQ5HQRiF10AJZsmUfpownTnvQakpbGMp_NkM5gV8",
  "access_expires_at": "2026-10-30T14:33:56.785989618Z",
  "refresh_token": "1HwHPFmB8jTTi2p_stJPKL4O5XUY2vBaqITcBkloCXY",
  "refresh_expires_at": "2026-10-31T02:18:56.784893277Z",
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
  "device_ref": "sandbox-10159"
}
```

```json
{
  "challenge_id": "237538e9-dc4e-40bd-8a49-af8255ff54c9",
  "expires_at": "2026-10-30T14:23:57.426122317Z",
  "resend_available_at": "2026-10-30T14:18:58.426122317Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "654737",
  "sent_at": "2026-10-30T14:18:57.439506051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "237538e9-dc4e-40bd-8a49-af8255ff54c9",
  "code": "654737",
  "device_ref": "sandbox-10159"
}
```

```json
{
  "session_id": "5238a619-49eb-48d2-a774-aba2742dc346",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDgzNywiaWF0IjoxNzkzMzY5OTM3LCJqdGkiOiIwMTA2YTc2OS1lNTAxLTQ3ZDctOTY0MC1hY2ZiYzU4YzJiM2EiLCJzaWQiOiI1MjM4YTYxOS00OWViLTQ4ZDItYTc3NC1hYmEyNzQyZGMzNDYifQ.ssWKBxduXHF8VTlkoztYb2AuXM3Q8jHKg5CwEaXw5BY",
  "access_expires_at": "2026-10-30T14:33:57.786715727Z",
  "refresh_token": "xO-R4PRFMGYhQv54BHL3Fk6DPm_yeqZ30JBgu176YmI",
  "refresh_expires_at": "2026-11-29T14:18:57.785555558Z",
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
  "command_id": "dd4373f2-09de-4d1b-baf1-105feb468025",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:18:58Z",
    "sequence": 1793369938401
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7f80bcf-98a8-472f-ba90-7f8d5dd926ca",
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
  "last_heartbeat_at": "2026-10-30T14:18:58.501498Z",
  "last_location_at": "2026-10-30T14:18:58.501498Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631177710",
  "device_ref": "sandbox-29249"
}
```

```json
{
  "challenge_id": "f6aa24df-9aa1-4eb8-a5cd-734dfd81d610",
  "expires_at": "2026-10-30T14:23:58.840847031Z",
  "resend_available_at": "2026-10-30T14:18:59.840847031Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631177710` → **200**

```json
{
  "phone": "+380631177710",
  "audience": "CLIENT",
  "code": "343042",
  "sent_at": "2026-10-30T14:18:58.84584304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6aa24df-9aa1-4eb8-a5cd-734dfd81d610",
  "code": "343042",
  "device_ref": "sandbox-29249"
}
```

```json
{
  "session_id": "d3937166-8e0e-4ef5-8e15-79316b15098a",
  "subject": {
    "type": "CLIENT",
    "id": "2717254f-e1fa-423e-b05a-8eca3a859071"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzE3MjU0Zi1lMWZhLTQyM2UtYjA1YS04ZWNhM2E4NTkwNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwODM5LCJpYXQiOjE3OTMzNjk5MzksImp0aSI6ImY4MmUxOTFlLWYxM2EtNDE3My1iNzkzLWViMjgyMzA3YmIxOSIsInNpZCI6ImQzOTM3MTY2LThlMGUtNGVmNS04ZTE1LTc5MzE2YjE1MDk4YSJ9.mvpSe2QhVGRqNh6Emi2nmC8hdxTpSOjc6qHNSHKAuO4",
  "access_expires_at": "2026-10-30T14:33:59.184144571Z",
  "refresh_token": "alRGZb9G52n6ytTo0GqvcZMscsUEClLUYYjbQjltZ1A",
  "refresh_expires_at": "2026-11-29T14:18:59.183115912Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "337ed972-8294-4a45-8ad4-808b4bb92c02",
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
  "id": "3bcf90ed-f331-4735-8e19-b97af4f0ef30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:23:59.525719Z",
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
  "command_id": "d122fd64-89b7-4553-b911-b24604239d21",
  "quote_id": "3bcf90ed-f331-4735-8e19-b97af4f0ef30",
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
  "id": "393b69bb-74b4-40eb-a29d-00ee1125149e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2717254f-e1fa-423e-b05a-8eca3a859071",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:18:59.925446Z",
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
    "id": "6b73dbd0-a6ea-4d8f-a50c-1f713922116e",
    "order_id": "393b69bb-74b4-40eb-a29d-00ee1125149e",
    "expires_at": "2026-10-30T14:19:14.934362Z",
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

`POST /api/driver/v1/offers/6b73dbd0-a6ea-4d8f-a50c-1f713922116e/accept` → **200**

```json
{
  "command_id": "b0477575-2527-4bc3-9fcb-57c15eeb0c13"
}
```

```json
{
  "id": "70903304-0f07-495d-ab40-beee970d0904",
  "order_id": "393b69bb-74b4-40eb-a29d-00ee1125149e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f3600348-c2f4-46a0-83dc-ad74730c302f",
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
  "command_id": "4d1b0429-7517-44d7-8717-6ca5df9469fb",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T14:19:01.248381842Z"
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
  "id": "f3600348-c2f4-46a0-83dc-ad74730c302f",
  "order_id": "393b69bb-74b4-40eb-a29d-00ee1125149e",
  "assignment_id": "70903304-0f07-495d-ab40-beee970d0904",
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

`POST /api/driver/v1/work-sessions/a7f80bcf-98a8-472f-ba90-7f8d5dd926ca/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:19:02Z",
    "sequence": 1793369942230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7f80bcf-98a8-472f-ba90-7f8d5dd926ca",
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
  "last_heartbeat_at": "2026-10-30T14:19:02.256117Z",
  "last_location_at": "2026-10-30T14:19:02.256117Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f3600348-c2f4-46a0-83dc-ad74730c302f/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "53608d09-362f-4de6-84fc-e2b18e559512",
  "expected_version": 0
}
```

```json
{
  "id": "f3600348-c2f4-46a0-83dc-ad74730c302f",
  "order_id": "393b69bb-74b4-40eb-a29d-00ee1125149e",
  "assignment_id": "70903304-0f07-495d-ab40-beee970d0904",
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
  "arrived_at": "2026-10-30T14:19:02.570371Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f3600348-c2f4-46a0-83dc-ad74730c302f/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9d9525ba-d2c7-433d-9a06-dd70746816aa",
  "expected_version": 1
}
```

```json
{
  "id": "f3600348-c2f4-46a0-83dc-ad74730c302f",
  "order_id": "393b69bb-74b4-40eb-a29d-00ee1125149e",
  "assignment_id": "70903304-0f07-495d-ab40-beee970d0904",
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
  "arrived_at": "2026-10-30T14:19:02.570371Z",
  "started_at": "2026-10-30T14:19:02.889367Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f3600348-c2f4-46a0-83dc-ad74730c302f/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "bd06ecf0-55d4-49f0-8398-436e49adbdf3",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:19:03Z",
  "cash_received": true
}
```

```json
{
  "id": "f3600348-c2f4-46a0-83dc-ad74730c302f",
  "order_id": "393b69bb-74b4-40eb-a29d-00ee1125149e",
  "assignment_id": "70903304-0f07-495d-ab40-beee970d0904",
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
  "arrived_at": "2026-10-30T14:19:02.570371Z",
  "started_at": "2026-10-30T14:19:02.889367Z",
  "completed_at": "2026-10-30T14:19:03.222586Z",
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
  "session_id": "a7f80bcf-98a8-472f-ba90-7f8d5dd926ca",
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
  "last_heartbeat_at": "2026-10-30T14:19:02.256117Z",
  "last_location_at": "2026-10-30T14:19:02.256117Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a7f80bcf-98a8-472f-ba90-7f8d5dd926ca/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e2f1279c-ad7c-438a-83db-d3498ecf527f",
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
  "command_id": "9ca76f13-dbb2-44f8-9c89-1afba340e5d5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:19:04Z",
    "sequence": 1793369944195
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
  "correlation_id": "d6c348e6-5b3f-4c48-ad77-9e327c9c019c",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "24ee3b21-1d45-48a4-a925-4960c656cf22",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:19:04Z",
    "sequence": 1793369944516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "82979564-08b6-463a-853f-0be59fc615c3",
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
  "last_heartbeat_at": "2026-10-30T14:19:04.538804Z",
  "last_location_at": "2026-10-30T14:19:04.538804Z",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T14:19:01.248382Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "aebe3f9d-63de-49d2-89ec-c12da3c69039",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T14:19:05.171232962Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "82979564-08b6-463a-853f-0be59fc615c3",
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
  "last_heartbeat_at": "2026-10-30T14:19:04.538804Z",
  "last_location_at": "2026-10-30T14:19:04.538804Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/82979564-08b6-463a-853f-0be59fc615c3/close` → **200**

```json
{
  "command_id": "ebc987a9-9838-409e-b6dd-bbb8a739a9b5",
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
  "session_id": "766e3964-4962-48a2-b28f-10825f4ce68f",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzA4NDYsImlhdCI6MTc5MzM2OTk0NiwianRpIjoiNDk3N2VhZjgtOTA5NS00N2Y4LThmNDEtNTA3ZDUxNzNmZTM1Iiwic2lkIjoiNzY2ZTM5NjQtNDk2Mi00OGEyLWIyOGYtMTA4MjVmNGNlNjhmIn0.jueHLBFRUTr-gGPXcaDbisOWoNYjFup04Hv3ZXfGUeo",
  "access_expires_at": "2026-10-30T14:34:06.412707066Z",
  "refresh_token": "goCREuUbYpw140Ie3RtDLtOYECH0H2fuHIvEgpaZRwY",
  "refresh_expires_at": "2026-10-31T02:19:06.411825702Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "9019caed-9f57-4e4c-90c6-b31badf900f0",
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
  "id": "41c58cbd-0d37-4720-80ff-ddb7418a51fe",
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
  "created_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "created_at": "2026-10-30T14:19:06.725516Z",
  "updated_at": "2026-10-30T14:19:06.725516Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632975655",
  "device_ref": "sandbox-6510"
}
```

```json
{
  "challenge_id": "79b32095-7a36-400a-962f-ff5b2fbc3552",
  "expires_at": "2026-10-30T14:24:07.078536083Z",
  "resend_available_at": "2026-10-30T14:19:08.078536083Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632975655` → **200**

```json
{
  "phone": "+380632975655",
  "audience": "CLIENT",
  "code": "497256",
  "sent_at": "2026-10-30T14:19:07.084199345Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79b32095-7a36-400a-962f-ff5b2fbc3552",
  "code": "497256",
  "device_ref": "sandbox-6510"
}
```

```json
{
  "session_id": "aedddd59-cdca-41fb-bf8b-401433acb5ca",
  "subject": {
    "type": "CLIENT",
    "id": "e92d4506-39f8-4276-b1f7-a6afaa84eea1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTJkNDUwNi0zOWY4LTQyNzYtYjFmNy1hNmFmYWE4NGVlYTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcwODQ3LCJpYXQiOjE3OTMzNjk5NDcsImp0aSI6ImQ1MjM1ODI5LTFmNDgtNDUyNS04MjAzLTZmNjc5ZWJlZjE1ZiIsInNpZCI6ImFlZGRkZDU5LWNkY2EtNDFmYi1iZjhiLTQwMTQzM2FjYjVjYSJ9._M6ELrGo-GgVs5eSfzVWpdBT0yrHP1DwD8tpNA2OtrM",
  "access_expires_at": "2026-10-30T14:34:07.444422134Z",
  "refresh_token": "6ttfBLBZ2TES95JVXZ49dMyDCWICnVVfRq5z_gYh1wQ",
  "refresh_expires_at": "2026-11-29T14:19:07.443637621Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632975655` → **200**

```json
{
  "client_id": "e92d4506-39f8-4276-b1f7-a6afaa84eea1"
}
```

`POST /api/admin/v1/rider-wallets/e92d4506-39f8-4276-b1f7-a6afaa84eea1/top-ups` → **201**

```json
{
  "command_id": "105d743a-9172-41e0-b229-77eb0437cec1",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e92d4506-39f8-4276-b1f7-a6afaa84eea1",
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
      "id": "d3fd04b7-11a0-414f-823d-34291840c4a1",
      "at": "2026-10-30T14:19:08.079826Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b27b14c0-6dce-4fa1-a351-9ae73a8783c0",
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
  "id": "71a4de80-776b-4104-b38d-7e7d9f46a873",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:24:08.405563Z",
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
      "id": "41c58cbd-0d37-4720-80ff-ddb7418a51fe",
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
  "device_ref": "sandbox-6792"
}
```

```json
{
  "challenge_id": "cd6b670f-f5da-49ab-8b63-d912b2683ba8",
  "expires_at": "2026-10-30T14:24:08.735753318Z",
  "resend_available_at": "2026-10-30T14:19:09.735753318Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "099924",
  "sent_at": "2026-10-30T14:19:08.740803134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd6b670f-f5da-49ab-8b63-d912b2683ba8",
  "code": "099924",
  "device_ref": "sandbox-6792"
}
```

```json
{
  "session_id": "70bdb3b8-e681-4720-acd3-6a9f1edac81c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDg0OSwiaWF0IjoxNzkzMzY5OTQ5LCJqdGkiOiI4ODVjODk1MC00MTc3LTQzMmMtOTVlYi1jZTRiNjQ3NGU3MDYiLCJzaWQiOiI3MGJkYjNiOC1lNjgxLTQ3MjAtYWNkMy02YTlmMWVkYWM4MWMifQ.Xa60LrC3l6RT2knEBNuW4Ce46SqJc18_uK3-ztyCQgk",
  "access_expires_at": "2026-10-30T14:34:09.090277506Z",
  "refresh_token": "uA3MggybZnKO9JvH6I6Rt_voYJPMptZbkQ8waCQ8GEQ",
  "refresh_expires_at": "2026-11-29T14:19:09.089547325Z",
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
  "command_id": "f2e6304d-7f5e-438c-893e-2bb4c01ef0d4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:19:09Z",
    "sequence": 1793369949700
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ca4549ac-e2d2-4f57-9f12-c73e9295367a",
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
  "last_heartbeat_at": "2026-10-30T14:19:09.724695Z",
  "last_location_at": "2026-10-30T14:19:09.724695Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c6d3bcdc-2ce2-4b80-bc59-a35628e76ffc",
  "quote_id": "71a4de80-776b-4104-b38d-7e7d9f46a873",
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
  "id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92d4506-39f8-4276-b1f7-a6afaa84eea1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:19:10.076734Z",
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
  "client_id": "e92d4506-39f8-4276-b1f7-a6afaa84eea1",
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
      "id": "d3fd04b7-11a0-414f-823d-34291840c4a1",
      "at": "2026-10-30T14:19:08.079826Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
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
    "id": "b3fa04a5-20e6-4a86-94d5-8187d89f31a9",
    "order_id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c",
    "expires_at": "2026-10-30T14:19:25.085216Z",
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

`POST /api/driver/v1/offers/b3fa04a5-20e6-4a86-94d5-8187d89f31a9/accept` → **200**

```json
{
  "command_id": "1f20881e-0086-4aa9-a805-4513704133c7"
}
```

```json
{
  "id": "4e4a3c55-a2cf-414b-88e8-f0c48bc2b88f",
  "order_id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "138663df-d4cc-49b3-a546-d87b840d8813",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "138663df-d4cc-49b3-a546-d87b840d8813",
  "order_id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c",
  "assignment_id": "4e4a3c55-a2cf-414b-88e8-f0c48bc2b88f",
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

`POST /api/driver/v1/work-sessions/ca4549ac-e2d2-4f57-9f12-c73e9295367a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:19:13Z",
    "sequence": 1793369953676
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ca4549ac-e2d2-4f57-9f12-c73e9295367a",
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
  "last_heartbeat_at": "2026-10-30T14:19:13.713617Z",
  "last_location_at": "2026-10-30T14:19:13.713617Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/138663df-d4cc-49b3-a546-d87b840d8813/arrive` → **200**

```json
{
  "command_id": "9d33caf4-0f7e-415b-b97c-588ff0525972",
  "expected_version": 0
}
```

```json
{
  "id": "138663df-d4cc-49b3-a546-d87b840d8813",
  "order_id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c",
  "assignment_id": "4e4a3c55-a2cf-414b-88e8-f0c48bc2b88f",
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
  "arrived_at": "2026-10-30T14:19:14.065906Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/138663df-d4cc-49b3-a546-d87b840d8813/start` → **200**

```json
{
  "command_id": "12d03c50-4f3f-4f02-b378-0dd345d5fc62",
  "expected_version": 1
}
```

```json
{
  "id": "138663df-d4cc-49b3-a546-d87b840d8813",
  "order_id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c",
  "assignment_id": "4e4a3c55-a2cf-414b-88e8-f0c48bc2b88f",
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
  "arrived_at": "2026-10-30T14:19:14.065906Z",
  "started_at": "2026-10-30T14:19:14.390308Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/138663df-d4cc-49b3-a546-d87b840d8813/complete` → **200**

```json
{
  "command_id": "9314728a-436f-4285-950e-25f04475248e",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:19:14Z",
  "cash_received": true
}
```

```json
{
  "id": "138663df-d4cc-49b3-a546-d87b840d8813",
  "order_id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c",
  "assignment_id": "4e4a3c55-a2cf-414b-88e8-f0c48bc2b88f",
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
  "arrived_at": "2026-10-30T14:19:14.065906Z",
  "started_at": "2026-10-30T14:19:14.390308Z",
  "completed_at": "2026-10-30T14:19:14.732357Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e92d4506-39f8-4276-b1f7-a6afaa84eea1",
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
      "id": "3b05572d-ad98-4e93-983e-9a39428c1ee8",
      "at": "2026-10-30T14:19:15.111033Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c"
    },
    {
      "id": "d3fd04b7-11a0-414f-823d-34291840c4a1",
      "at": "2026-10-30T14:19:08.079826Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/41c58cbd-0d37-4720-80ff-ddb7418a51fe/archive` → **200**

```json
{
  "command_id": "a48668a9-a1ba-4c99-a5de-4c84c2c85e49",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "41c58cbd-0d37-4720-80ff-ddb7418a51fe",
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
  "created_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "created_at": "2026-10-30T14:19:06.725516Z",
  "updated_at": "2026-10-30T14:19:18.388043Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ca4549ac-e2d2-4f57-9f12-c73e9295367a",
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
  "last_heartbeat_at": "2026-10-30T14:19:13.713617Z",
  "last_location_at": "2026-10-30T14:19:13.713617Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ca4549ac-e2d2-4f57-9f12-c73e9295367a/close` → **200**

```json
{
  "command_id": "bc1b631b-a4c4-4467-9dd7-657bc4477d6a",
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

Done: order 41e0ec16-6354-4b57-86d6-66cb094b0c4c.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-10198"
}
```

```json
{
  "challenge_id": "c2741dfb-995b-4453-8047-d5f2fb7b3882",
  "expires_at": "2026-10-30T14:24:19.364784806Z",
  "resend_available_at": "2026-10-30T14:19:20.364784806Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "820209",
  "sent_at": "2026-10-30T14:19:19.371034465Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2741dfb-995b-4453-8047-d5f2fb7b3882",
  "code": "820209",
  "device_ref": "sandbox-10198"
}
```

```json
{
  "session_id": "2121b315-1ddd-49a3-85a2-12f16a8d18ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDg1OSwiaWF0IjoxNzkzMzY5OTU5LCJqdGkiOiJjNTQyZDA5OC00M2RjLTRlMWItOTZmMy1hYjBmOGI3MjI5YzQiLCJzaWQiOiIyMTIxYjMxNS0xZGRkLTQ5YTMtODVhMi0xMmYxNmE4ZDE4Y2EifQ.DCMRraoj0FIxP0aVFBqP-YHTW3-kmuLOSK4ZAJ9nHXE",
  "access_expires_at": "2026-10-30T14:34:19.7005946Z",
  "refresh_token": "apvUweYCqMMxBAhGvn4LMiqpdQrTLoV80_Hi43wId_Q",
  "refresh_expires_at": "2026-11-29T14:19:19.699488433Z",
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
  "command_id": "1b9ac59e-5205-4638-bcc8-99db360406ca",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:19:20Z",
    "sequence": 1793369960634
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aaccad7c-ecc2-4742-b946-209aa5247cea",
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
  "last_heartbeat_at": "2026-10-30T14:19:20.658091Z",
  "last_location_at": "2026-10-30T14:19:20.658091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/aaccad7c-ecc2-4742-b946-209aa5247cea/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:19:25Z",
    "sequence": 1793369965969
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aaccad7c-ecc2-4742-b946-209aa5247cea",
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
  "last_heartbeat_at": "2026-10-30T14:19:25.994439Z",
  "last_location_at": "2026-10-30T14:19:20.658091Z",
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
  "session_id": "8db37313-1a94-49cd-9343-a0a6269b75a3",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzA4NjYsImlhdCI6MTc5MzM2OTk2NiwianRpIjoiMDkyZTk3MTQtNTIwNy00ZDdlLTk3NzEtZWJmMjNkYjllNWQxIiwic2lkIjoiOGRiMzczMTMtMWE5NC00OWNkLTkzNDMtYTBhNjI2OWI3NWEzIn0.VTF3OGVxsS75uP4LGtKAqfqhUEqEY41HW5sf48GrMiM",
  "access_expires_at": "2026-10-30T14:34:26.622260746Z",
  "refresh_token": "ExNwVbJdfh8J5HOaSGPzinFIOUxT4UptwqpRDKynXN0",
  "refresh_expires_at": "2026-10-31T02:19:26.621306947Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T14:19:26.921303364Z",
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
      "last_location_at": "2026-10-30T14:19:20.658091Z",
      "last_heartbeat_at": "2026-10-30T14:19:25.994439Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/aaccad7c-ecc2-4742-b946-209aa5247cea/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:19:27Z",
    "sequence": 1793369967231
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "aaccad7c-ecc2-4742-b946-209aa5247cea",
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
  "last_heartbeat_at": "2026-10-30T14:19:27.252571Z",
  "last_location_at": "2026-10-30T14:19:27.252571Z",
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
  "session_id": "aaccad7c-ecc2-4742-b946-209aa5247cea",
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
  "last_heartbeat_at": "2026-10-30T14:19:27.252571Z",
  "last_location_at": "2026-10-30T14:19:27.252571Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aaccad7c-ecc2-4742-b946-209aa5247cea/close` → **200**

```json
{
  "command_id": "09d59a2e-d787-4ded-a904-b427f4a1d481",
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
  "device_ref": "sandbox-13610"
}
```

```json
{
  "challenge_id": "8eefcb57-9e27-4f92-a2da-fbf606d1dde8",
  "expires_at": "2026-10-30T14:24:28.197909254Z",
  "resend_available_at": "2026-10-30T14:19:29.197909254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "701534",
  "sent_at": "2026-10-30T14:19:28.20284848Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8eefcb57-9e27-4f92-a2da-fbf606d1dde8",
  "code": "701534",
  "device_ref": "sandbox-13610"
}
```

```json
{
  "session_id": "f056d0f9-ad6a-42ea-8048-631039daa860",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDg2OCwiaWF0IjoxNzkzMzY5OTY4LCJqdGkiOiIzYjFhOGRlMi0yYzA2LTRmOTgtYmJhNi0xNTg4YjZkOTQ3OTEiLCJzaWQiOiJmMDU2ZDBmOS1hZDZhLTQyZWEtODA0OC02MzEwMzlkYWE4NjAifQ.ln39DBpINyDIf2xja8vab9PZrgdMdQcsKrxBwDsGKHU",
  "access_expires_at": "2026-10-30T14:34:28.541496554Z",
  "refresh_token": "bpLSxdNjx4VfkFpKSIKYTEO0owzDTSObwz6bK_w7Rnw",
  "refresh_expires_at": "2026-11-29T14:19:28.540670879Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-1804"
}
```

```json
{
  "challenge_id": "cdf868e4-1024-45f7-863c-60e5d0a1a4f2",
  "expires_at": "2026-10-30T14:24:29.218571094Z",
  "resend_available_at": "2026-10-30T14:19:30.218571094Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "015390",
  "sent_at": "2026-10-30T14:19:29.224482829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdf868e4-1024-45f7-863c-60e5d0a1a4f2",
  "code": "015390",
  "device_ref": "sandbox-1804"
}
```

```json
{
  "session_id": "bed86935-b1fd-4805-a55e-0c94fc8176dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDg2OSwiaWF0IjoxNzkzMzY5OTY5LCJqdGkiOiI5NjhiMGM5Mi0wZGVmLTQ1Y2EtYTEwMi0zNzQwYWFhYWFjYzYiLCJzaWQiOiJiZWQ4NjkzNS1iMWZkLTQ4MDUtYTU1ZS0wYzk0ZmM4MTc2ZGMifQ.szW1VfGLhY4M9e0EtzgCCB0uRoHJ749DmRu-pPCvDuo",
  "access_expires_at": "2026-10-30T14:34:29.588410297Z",
  "refresh_token": "mWGU0YoJTlq0-TRvXmpKS9Y4V1Ae1Vq6DfloWGPY8pQ",
  "refresh_expires_at": "2026-11-29T14:19:29.587110664Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-26042"
}
```

```json
{
  "challenge_id": "18693820-c959-4a64-861a-7bcf95bf2f2d",
  "expires_at": "2026-10-30T14:24:29.88159588Z",
  "resend_available_at": "2026-10-30T14:19:30.88159588Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "024921",
  "sent_at": "2026-10-30T14:19:29.885910566Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18693820-c959-4a64-861a-7bcf95bf2f2d",
  "code": "024921",
  "device_ref": "sandbox-26042"
}
```

```json
{
  "session_id": "f8f8a708-6692-4489-b18a-05bd32c71186",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MDg3MCwiaWF0IjoxNzkzMzY5OTcwLCJqdGkiOiJmZTE1YjZjOC0wZThmLTQzN2QtODU0Zi1hMjI1MmQzYjI5NmEiLCJzaWQiOiJmOGY4YTcwOC02NjkyLTQ0ODktYjE4YS0wNWJkMzJjNzExODYifQ.FmoPkN8yFsXC-7eGUQ2otRayYdo3rhkozyK-1riwlDE",
  "access_expires_at": "2026-10-30T14:34:30.223442815Z",
  "refresh_token": "bumO5uwaYX2Zc_WurzB-Au6PF5tTpIQcQRp4ZppJ670",
  "refresh_expires_at": "2026-11-29T14:19:30.222686565Z",
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
  "command_id": "6e9f78d1-ee22-4f92-8748-c51e24cec747",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:22:34Z",
    "sequence": 1793370154148
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "ddf94f19-067e-43a3-87a9-2d8f35bc35c7",
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
  "last_heartbeat_at": "2026-10-30T14:22:34.16975Z",
  "last_location_at": "2026-10-30T14:22:34.16975Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600954726",
  "device_ref": "sandbox-26077"
}
```

```json
{
  "challenge_id": "a84fa4c7-2a69-43fb-8831-28b5061440d3",
  "expires_at": "2026-10-30T14:27:34.465369572Z",
  "resend_available_at": "2026-10-30T14:22:35.465369572Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600954726` → **200**

```json
{
  "phone": "+48600954726",
  "audience": "CLIENT",
  "code": "048352",
  "sent_at": "2026-10-30T14:22:34.473576699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a84fa4c7-2a69-43fb-8831-28b5061440d3",
  "code": "048352",
  "device_ref": "sandbox-26077"
}
```

```json
{
  "session_id": "bad76387-5fc0-4db2-9229-09d4dc703b01",
  "subject": {
    "type": "CLIENT",
    "id": "6ad1b2e6-08c7-4314-b6fb-ca4dc6255449"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YWQxYjJlNi0wOGM3LTQzMTQtYjZmYi1jYTRkYzYyNTU0NDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMDU0LCJpYXQiOjE3OTMzNzAxNTQsImp0aSI6IjVlOTQzMmVlLWVlZTYtNGY4Yy1iNjhmLTZlNzYxZTQzMjI1MCIsInNpZCI6ImJhZDc2Mzg3LTVmYzAtNGRiMi05MjI5LTA5ZDRkYzcwM2IwMSJ9.6BvIx1wX_XgMUbB4yi67EyMWtX-knOo3nGeDV0w64lc",
  "access_expires_at": "2026-10-30T14:37:34.791660854Z",
  "refresh_token": "JhZEWz-iV75rVcIkfDbb2QbzuYFsvL8osslTJjvQYJg",
  "refresh_expires_at": "2026-11-29T14:22:34.790772861Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "084789a8-44e7-4bc1-ba0b-15a6eb7210a0",
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
  "id": "2bf41a94-dffd-41a9-b2ad-624532ec81a7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:27:35.097974Z",
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
  "command_id": "1c4a560e-037d-4f88-b73d-01ced153f69a",
  "quote_id": "2bf41a94-dffd-41a9-b2ad-624532ec81a7",
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
  "id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ad1b2e6-08c7-4314-b6fb-ca4dc6255449",
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
  "created_at": "2026-10-30T14:22:35.407174Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5c6cfe5b-8042-48ed-b3b7-ad74f224ac16` → **200**

```json
{
  "id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ad1b2e6-08c7-4314-b6fb-ca4dc6255449",
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
  "created_at": "2026-10-30T14:22:35.407174Z",
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

`POST /api/driver/v1/orders/5c6cfe5b-8042-48ed-b3b7-ad74f224ac16/claim` → **422**

```json
{
  "command_id": "f1990c8e-6b29-434d-983f-636edafcd310"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5c6cfe5b-8042-48ed-b3b7-ad74f224ac16/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "e61a810e-a943-4c9e-9838-172bbdfdbed6"
}
```

`GET /api/rider/v1/orders/5c6cfe5b-8042-48ed-b3b7-ad74f224ac16` → **200**

```json
{
  "id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ad1b2e6-08c7-4314-b6fb-ca4dc6255449",
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
  "created_at": "2026-10-30T14:22:35.407174Z",
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

`POST /api/driver/v1/orders/5f5a71e2-d3ec-4d21-9106-f286f50c1db4/claim` → **404**

```json
{
  "command_id": "f257c567-a510-478f-b47b-c014686c1f22"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5f5a71e2-d3ec-4d21-9106-f286f50c1db4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4dfbf059-ec76-437b-9636-6b6f29d2b06a"
}
```

`POST /api/driver/v1/orders/bbcdda27-789b-4c3e-835f-55ebd6efefb6/claim` → **404**

```json
{
  "command_id": "aa25a808-884d-4d4a-a834-788672a41dd7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bbcdda27-789b-4c3e-835f-55ebd6efefb6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "76563266-742b-49f3-9a6a-600bb85593ec"
}
```

`POST /api/driver/v1/orders/02dd4207-17a8-453b-8d2a-eb3e1c18ad63/claim` → **404**

```json
{
  "command_id": "4a30d3fc-a5f0-4ad0-ae5e-abac5c9c39a0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/02dd4207-17a8-453b-8d2a-eb3e1c18ad63/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "62f0c512-337c-43f9-8370-7aed404f61a6"
}
```

`POST /api/driver/v1/orders/a6cd0efe-2f2d-4027-9e79-58a708694112/claim` → **404**

```json
{
  "command_id": "e4db9611-5f90-4083-9cbb-8cf2db3a50cb"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a6cd0efe-2f2d-4027-9e79-58a708694112/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "42202da9-1804-4e13-886c-fca8a46379b4"
}
```

`POST /api/driver/v1/orders/132cc978-c3ce-4de9-b9b2-4fc662138369/claim` → **404**

```json
{
  "command_id": "ff1784ac-4680-4c89-bfb5-d1ba49024c10"
}
```

```json
{
  "instance": "/api/driver/v1/orders/132cc978-c3ce-4de9-b9b2-4fc662138369/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d717db50-1e32-43ae-9ff5-d9abb9bd5266"
}
```

`POST /api/driver/v1/orders/d9851808-115a-45f4-a3a0-8967305ec4a5/claim` → **404**

```json
{
  "command_id": "94690454-373b-4560-a8a1-595ebcd06e82"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d9851808-115a-45f4-a3a0-8967305ec4a5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c13ae6fb-6738-4ae4-8b9c-91f49f4477a4"
}
```

`POST /api/driver/v1/orders/5241c85b-193a-4d5b-a53b-7f1c851b3cf1/claim` → **404**

```json
{
  "command_id": "6a9fdabe-1b23-4426-bd28-8e5682f3954c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5241c85b-193a-4d5b-a53b-7f1c851b3cf1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d95b3b55-96c5-4731-96dd-a55fbd9ead15"
}
```

`POST /api/driver/v1/orders/5f277cb1-d77e-4ddb-b3ae-73b21c7be8d2/claim` → **404**

```json
{
  "command_id": "f9965309-59f4-453b-80d1-dbea59dcaa21"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5f277cb1-d77e-4ddb-b3ae-73b21c7be8d2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "49ca64f2-6ffa-4126-a19c-05a69e9b717e"
}
```

`POST /api/driver/v1/orders/937e7450-47ad-407a-997a-99ae26915a72/claim` → **404**

```json
{
  "command_id": "a490b7db-ca75-4b2a-b6cd-d115f8e26e71"
}
```

```json
{
  "instance": "/api/driver/v1/orders/937e7450-47ad-407a-997a-99ae26915a72/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "89505f5a-3626-41b6-92ad-483658ed7a5f"
}
```

`POST /api/driver/v1/orders/40cdcc3a-dc2b-435f-9159-3eef24a033c2/claim` → **404**

```json
{
  "command_id": "c27f123c-e279-4090-92c9-4e8f52f98f41"
}
```

```json
{
  "instance": "/api/driver/v1/orders/40cdcc3a-dc2b-435f-9159-3eef24a033c2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "99ebd006-c0f2-44a0-b063-a424241f5690"
}
```

`POST /api/driver/v1/orders/ae106079-82a6-4a18-914a-2e895875a7a5/claim` → **404**

```json
{
  "command_id": "615346b5-bb5e-4fd3-8fb6-ced0213288c4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ae106079-82a6-4a18-914a-2e895875a7a5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3f050ebd-0b67-424a-9dc5-475dcf0e72a0"
}
```

`POST /api/driver/v1/orders/e96ccef5-0cd5-4b5e-8002-1be486bb969b/claim` → **404**

```json
{
  "command_id": "6eb6b55e-a2b6-4323-b90d-b019abbe041f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e96ccef5-0cd5-4b5e-8002-1be486bb969b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fb3c2dc5-4694-4e42-9432-1c2a699b0277"
}
```

`POST /api/driver/v1/orders/00dd394c-fdf8-4e08-8fe6-41054ca2b6af/claim` → **404**

```json
{
  "command_id": "d89b1151-db7f-40ce-bb65-9aaf5cc107ab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/00dd394c-fdf8-4e08-8fe6-41054ca2b6af/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d928665e-ea15-45f8-8c2f-7836bd54f147"
}
```

`POST /api/driver/v1/orders/327dadac-7f45-4279-9234-ac057a25b101/claim` → **404**

```json
{
  "command_id": "3679f87a-da1e-4e85-bf1d-c84b9bc75930"
}
```

```json
{
  "instance": "/api/driver/v1/orders/327dadac-7f45-4279-9234-ac057a25b101/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a203bb2a-2c71-4dd0-b1b4-a1a1d312f677"
}
```

`POST /api/driver/v1/orders/d69f01f9-d7a0-458d-9e98-5ebcd32e89f2/claim` → **404**

```json
{
  "command_id": "fb62abcd-7d5b-4442-8cf4-49ca7699aa37"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d69f01f9-d7a0-458d-9e98-5ebcd32e89f2/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "58c9411c-9fcf-45ff-bdff-e67f670d7060"
}
```

`POST /api/driver/v1/orders/1fc58602-744a-498b-8dfd-c70268a58a50/claim` → **404**

```json
{
  "command_id": "3ba522bb-4891-4d9c-ae90-780a91919d98"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1fc58602-744a-498b-8dfd-c70268a58a50/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4ceedba7-ae4e-44f0-a5a8-11eadd441aac"
}
```

`POST /api/driver/v1/orders/defc3de9-603a-44c0-8c35-412d24926883/claim` → **404**

```json
{
  "command_id": "35493288-2cd8-453a-b714-ae4350356bfd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/defc3de9-603a-44c0-8c35-412d24926883/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f2919272-d48a-494d-a39e-490662dfca7b"
}
```

`POST /api/driver/v1/orders/82ea1f81-dbdf-4462-bb2f-ebeabff2d262/claim` → **404**

```json
{
  "command_id": "dabd45ff-cf9d-4bfd-8589-40433b1a0a74"
}
```

```json
{
  "instance": "/api/driver/v1/orders/82ea1f81-dbdf-4462-bb2f-ebeabff2d262/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2c0e2e55-1c8e-461f-a6ab-b488fd7485af"
}
```

`POST /api/driver/v1/orders/c65d4b3f-39b1-44e8-be44-d15646d919d6/claim` → **404**

```json
{
  "command_id": "e0935da7-feff-42c6-bf34-94835c2dfb0f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c65d4b3f-39b1-44e8-be44-d15646d919d6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "45dd98a0-145a-49bd-be17-517b2733eb9a"
}
```

`POST /api/driver/v1/orders/5d311307-4f8c-4e1e-a2f3-b91e41aaccdf/claim` → **404**

```json
{
  "command_id": "b1d2f1a5-17f9-4e6e-b3b6-cb8e5f420fa5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5d311307-4f8c-4e1e-a2f3-b91e41aaccdf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4a2d8936-1ac9-4cbf-9056-8059a17344c0"
}
```

`POST /api/driver/v1/orders/617cc199-2aae-46df-92cd-79f30722a38d/claim` → **404**

```json
{
  "command_id": "3a9417c9-5047-47c4-a3b5-f400e6448896"
}
```

```json
{
  "instance": "/api/driver/v1/orders/617cc199-2aae-46df-92cd-79f30722a38d/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c0099f1f-ee82-456f-8d8e-31c5c735c92e"
}
```

`POST /api/driver/v1/orders/2ea17d50-f85b-4a1c-a680-2e5386f97329/claim` → **404**

```json
{
  "command_id": "f14cee31-efe4-4ba6-b735-8ad278e14a1c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2ea17d50-f85b-4a1c-a680-2e5386f97329/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3da91e94-387a-4125-b542-62dc2d212205"
}
```

`POST /api/driver/v1/orders/e9809fe4-f55e-448e-92d1-b4dace35da71/claim` → **404**

```json
{
  "command_id": "7ce8c39d-2838-4c8a-baa7-302c8ee9256f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e9809fe4-f55e-448e-92d1-b4dace35da71/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "efad332e-f32d-45d8-ae6d-2bf53d460f44"
}
```

`POST /api/driver/v1/orders/ee85ab51-6ffc-4abf-b755-1ff85ecc8caf/claim` → **404**

```json
{
  "command_id": "95eddb66-ecbd-46c9-9657-0182c513f0ba"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ee85ab51-6ffc-4abf-b755-1ff85ecc8caf/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d4cc8703-6c0d-423a-89db-7eff050a96a1"
}
```

`POST /api/driver/v1/orders/314e7ad4-fc34-479b-a3f1-24abad729583/claim` → **404**

```json
{
  "command_id": "b84557af-0bf1-4b39-91d2-40ff552c02c6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/314e7ad4-fc34-479b-a3f1-24abad729583/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3396d329-5d37-40c6-bcdc-7bc196f00ba0"
}
```

`POST /api/driver/v1/orders/b801a000-cf21-47f9-8c03-4563f3d91f5c/claim` → **404**

```json
{
  "command_id": "47f8a9df-b132-4dfe-9bbf-d668d6dd6bbc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b801a000-cf21-47f9-8c03-4563f3d91f5c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c2fd867d-b56a-4f34-9ce1-93a273dee7d2"
}
```

`POST /api/driver/v1/orders/763499d5-1a52-4759-99bb-accd5931ab36/claim` → **404**

```json
{
  "command_id": "d63af7c7-9e0f-47ae-865d-e07e8360d657"
}
```

```json
{
  "instance": "/api/driver/v1/orders/763499d5-1a52-4759-99bb-accd5931ab36/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a29d5d8e-bdcc-4e47-9d7c-d922d92cf505"
}
```

`POST /api/driver/v1/orders/c52995e1-a1bd-4ede-a25b-e1289c054570/claim` → **404**

```json
{
  "command_id": "fdb2aad1-0d58-428d-b06c-42709217b757"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c52995e1-a1bd-4ede-a25b-e1289c054570/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b8b9214f-d3e9-43d0-a2e2-5e5af49884ec"
}
```

`POST /api/driver/v1/orders/7199d55e-ffe2-4b82-b790-90a85d7b6fa4/claim` → **404**

```json
{
  "command_id": "a645c452-6307-41e0-8c73-d5f771e2b9da"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7199d55e-ffe2-4b82-b790-90a85d7b6fa4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "243c0f0a-19e5-48a2-94a2-a1d400b79677"
}
```

`POST /api/driver/v1/orders/ebef1ca8-f317-43b7-baf6-b48b54910a76/claim` → **429**

```json
{
  "command_id": "d0185421-f36f-4e94-bba5-8d9bf77ec0cd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ebef1ca8-f317-43b7-baf6-b48b54910a76/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "ac80c2fb-2f24-4088-a77e-5452cfd771d4",
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
  "command_id": "b1d6d8af-dcf7-4028-9ed6-ca9a2b50dc0b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:22:46Z",
    "sequence": 1793370166492
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "89a8dbea-9209-4874-94b5-404ed72b353a",
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
  "last_heartbeat_at": "2026-10-30T14:22:46.514601Z",
  "last_location_at": "2026-10-30T14:22:46.514601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
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

`POST /api/driver/v1/orders/5c6cfe5b-8042-48ed-b3b7-ad74f224ac16/claim` → **409**

```json
{
  "command_id": "4fd9851a-9f84-45dc-8a4b-378dc7320434"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5c6cfe5b-8042-48ed-b3b7-ad74f224ac16/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a48b3485-6e99-487b-8830-57e04fe9f1e3"
}
```

`POST /api/driver/v1/orders/5c6cfe5b-8042-48ed-b3b7-ad74f224ac16/claim` → **200**

```json
{
  "command_id": "e9d5c073-8001-4348-9a99-233352ccdb71"
}
```

```json
{
  "id": "7780d8de-8f5a-4c2d-b38b-3a96502107cf",
  "order_id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "de04261d-1f8a-4bfe-8c77-885ffb59404f",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "de04261d-1f8a-4bfe-8c77-885ffb59404f",
  "order_id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
  "assignment_id": "7780d8de-8f5a-4c2d-b38b-3a96502107cf",
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

`POST /api/driver/v1/trips/de04261d-1f8a-4bfe-8c77-885ffb59404f/cancel` → **200**

```json
{
  "command_id": "67e1dc37-4310-4e7e-8445-380c41e17c09",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "de04261d-1f8a-4bfe-8c77-885ffb59404f",
  "order_id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
  "assignment_id": "7780d8de-8f5a-4c2d-b38b-3a96502107cf",
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

`GET /api/rider/v1/orders/5c6cfe5b-8042-48ed-b3b7-ad74f224ac16` → **200**

```json
{
  "id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6ad1b2e6-08c7-4314-b6fb-ca4dc6255449",
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
    "id": "7780d8de-8f5a-4c2d-b38b-3a96502107cf",
    "order_id": "5c6cfe5b-8042-48ed-b3b7-ad74f224ac16",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "de04261d-1f8a-4bfe-8c77-885ffb59404f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:22:35.407174Z",
  "cancellation": {
    "by": "DRIVER",
    "reason_code": "PASSENGER_ASKED",
    "reason_labels": {
      "uk": "Пасажир попросив скасувати",
      "pl": "Pasażer poprosił o anulowanie",
      "ru": "Пассажир попросил отменить",
      "en": "Passenger asked to cancel"
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
  "session_id": "ddf94f19-067e-43a3-87a9-2d8f35bc35c7",
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
  "last_heartbeat_at": "2026-10-30T14:22:34.16975Z",
  "last_location_at": "2026-10-30T14:22:34.16975Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ddf94f19-067e-43a3-87a9-2d8f35bc35c7/close` → **200**

```json
{
  "command_id": "6673c429-1206-466d-a0b8-4b4cd4dda8ca",
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
  "session_id": "89a8dbea-9209-4874-94b5-404ed72b353a",
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
  "last_heartbeat_at": "2026-10-30T14:22:46.514601Z",
  "last_location_at": "2026-10-30T14:22:46.514601Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/89a8dbea-9209-4874-94b5-404ed72b353a/close` → **200**

```json
{
  "command_id": "17ccb8d3-9191-42de-9134-34a43c3aeebb",
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
  "session_id": "a845c63f-b99b-48db-bb28-e2df2e59211b",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEwNzAsImlhdCI6MTc5MzM3MDE3MCwianRpIjoiMTc3OWU5OGEtOTJmYy00MGNlLWI3MmMtNjk5NWIxZjAxZDY4Iiwic2lkIjoiYTg0NWM2M2YtYjk5Yi00OGRiLWJiMjgtZTJkZjJlNTkyMTFiIn0.YVzc82Tym41KkGyB7oLicEjdM-tsrDxypLWn27VCvjk",
  "access_expires_at": "2026-10-30T14:37:50.155370302Z",
  "refresh_token": "WqUHyWdoC9ayatqaD8GlF3Hoo_VS4CZCtBpB20B9JC8",
  "refresh_expires_at": "2026-10-31T02:22:50.153859695Z",
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
  "command_id": "2d025b73-ac22-4969-ac7d-b8c13d7f6d23",
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
  "session_id": "9b8f8c73-30cc-40fe-8d1b-6448cfe4236a",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEwNzEsImlhdCI6MTc5MzM3MDE3MSwianRpIjoiOGVkOTZjNmQtNGFhMC00NGY2LTliNjktOWI2ODZjOWE3NTgwIiwic2lkIjoiOWI4ZjhjNzMtMzBjYy00MGZlLThkMWItNjQ0OGNmZTQyMzZhIn0.aUO3fxsE5sYuup_rb9ncODOGrJB_l0pvDhzCK2rTgWo",
  "access_expires_at": "2026-10-30T14:37:51.339702547Z",
  "refresh_token": "uceoYt0Oo5AMegjbpjoUHQkxBotdl2Su5pPUOa_-WO4",
  "refresh_expires_at": "2026-10-31T02:22:51.339082263Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1135432060",
    "linkedid": "1730052700.1135432060",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674467727"
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
    "id": "1730052700.1135432060",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "4310c274-f933-4012-899d-aa3cf0a1be83",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674467727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T14:22:51.635692Z",
      "answered_at": null,
      "ended_at": "2026-10-30T14:22:51.660805Z",
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
    "id": "1730052600.9299735",
    "linkedid": "1730052600.9299735",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674467727"
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
      "id": "ee28a516-87d1-426d-badd-a6113692802a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674467727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T14:22:52.013426Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/ee28a516-87d1-426d-badd-a6113692802a/answer` → **200**

```json
{
  "command_id": "2603c57a-9b69-4e73-b640-237e7f30d472"
}
```

```json
{
  "id": "ee28a516-87d1-426d-badd-a6113692802a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674467727",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "order_ids": [],
  "started_at": "2026-10-30T14:22:52.013426Z",
  "answered_at": "2026-10-30T14:22:52.354849Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.9299735",
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
    "id": "1730052600.9299735",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ee28a516-87d1-426d-badd-a6113692802a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674467727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [],
      "started_at": "2026-10-30T14:22:52.013426Z",
      "answered_at": "2026-10-30T14:22:52.354849Z",
      "ended_at": "2026-10-30T14:22:52.688471Z",
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
      "id": "ee28a516-87d1-426d-badd-a6113692802a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674467727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [],
      "started_at": "2026-10-30T14:22:52.013426Z",
      "answered_at": "2026-10-30T14:22:52.354849Z",
      "ended_at": "2026-10-30T14:22:52.688471Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:22:53.770747Z"
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
      "id": "ee28a516-87d1-426d-badd-a6113692802a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674467727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [],
      "started_at": "2026-10-30T14:22:52.013426Z",
      "answered_at": "2026-10-30T14:22:52.354849Z",
      "ended_at": "2026-10-30T14:22:52.688471Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:22:53.770747Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/ee28a516-87d1-426d-badd-a6113692802a/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/ee28a516-87d1-426d-badd-a6113692802a/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=ee28a516-87d1-426d-badd-a6113692802a` → **200**

```json
{
  "changes": [
    {
      "id": "68fdff7d-8573-4a95-9053-8025b0a5d2ef",
      "occurred_at": "2026-10-30T14:22:55.654352Z",
      "actor_type": "STAFF",
      "actor_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ee28a516-87d1-426d-badd-a6113692802a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"fd2fec3b-aa7f-4859-a71f-6eaeeb135a2f\", \"order_ids\": []}",
      "correlation_id": "5c8e490c-6746-4bfd-960f-c715e2419f6f"
    },
    {
      "id": "d198954f-8499-44f6-9ccc-caba76cb11a5",
      "occurred_at": "2026-10-30T14:22:55.621516Z",
      "actor_type": "STAFF",
      "actor_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ee28a516-87d1-426d-badd-a6113692802a",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"fd2fec3b-aa7f-4859-a71f-6eaeeb135a2f\", \"order_ids\": []}",
      "correlation_id": "65ee2189-3b85-441a-84f1-9947ad6c3986"
    }
  ]
}
```

Done: call ee28a516-87d1-426d-badd-a6113692802a recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31134"
}
```

```json
{
  "challenge_id": "cbbffa21-d261-41f3-914f-5215def0dbea",
  "expires_at": "2026-10-30T14:27:55.982237017Z",
  "resend_available_at": "2026-10-30T14:22:56.982237017Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "877571",
  "sent_at": "2026-10-30T14:22:55.986216179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbbffa21-d261-41f3-914f-5215def0dbea",
  "code": "877571",
  "device_ref": "sandbox-31134"
}
```

```json
{
  "session_id": "8b75c4da-640f-4fe9-b81b-031e6912eba4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTA3NiwiaWF0IjoxNzkzMzcwMTc2LCJqdGkiOiJlYTVlMTY4OS0yMGZiLTRkYWMtYWIwMS0zMmI3NDc0NzhlZTgiLCJzaWQiOiI4Yjc1YzRkYS02NDBmLTRmZTktYjgxYi0wMzFlNjkxMmViYTQifQ.SmJdFdV70Lf1NT6p02x1vT_NrRnD80j4QROVAYu7FqE",
  "access_expires_at": "2026-10-30T14:37:56.294939867Z",
  "refresh_token": "Twg1KvixwInHPGTUhWSfXy_Y4qHU9HgcRkhLbxdAr1s",
  "refresh_expires_at": "2026-11-29T14:22:56.294363579Z",
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
  "command_id": "af6dd7f9-e979-4fb8-a16e-d87954811a54",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:22:56Z",
    "sequence": 1793370176893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d9e71bb-8699-4e30-a974-26a2548cfa0b",
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
  "last_heartbeat_at": "2026-10-30T14:22:56.913596Z",
  "last_location_at": "2026-10-30T14:22:56.913596Z",
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
  "session_id": "e037f303-c0ab-4764-8868-3cb7b265d444",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEwNzcsImlhdCI6MTc5MzM3MDE3NywianRpIjoiM2UwZGE4MDktZDA5My00ZDY3LWE2YjAtN2Q3Y2Q0YzRmZTk2Iiwic2lkIjoiZTAzN2YzMDMtYzBhYi00NzY0LTg4NjgtM2NiN2IyNjVkNDQ0In0.Jzv70XSR6D6yL9aNy1hXKW0MeA-bsk-whAxCaJ_QEWI",
  "access_expires_at": "2026-10-30T14:37:57.53959717Z",
  "refresh_token": "Xz9bZnO5C6cp4VgJWjjgmkqlMyeind_nwG1shGV09lc",
  "refresh_expires_at": "2026-10-31T02:22:57.538785213Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "213adc89-f80e-4bce-b7e2-22d22db98628",
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
  "id": "0b37f446-134e-48fa-b132-b249daa010dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:27:57.841107Z",
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
  "command_id": "79e4a9d3-5b9c-4436-847c-a9b95d874ea7",
  "quote_id": "0b37f446-134e-48fa-b132-b249daa010dc",
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
    "phone": "+380673413968"
  }
}
```

```json
{
  "id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
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
  "created_at": "2026-10-30T14:22:58.170356Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673413968"
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
    "id": "05d29776-b083-4d56-a431-c57de98ec7ea",
    "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
    "expires_at": "2026-10-30T14:23:13.175722Z",
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

`POST /api/driver/v1/offers/05d29776-b083-4d56-a431-c57de98ec7ea/accept` → **200**

```json
{
  "command_id": "2c09087c-d8ae-4afe-8dc3-a6aacc792c23"
}
```

```json
{
  "id": "a671ed2c-8cb2-4bd4-a39f-82fd80ace1c6",
  "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "14eac4b3-58d3-4797-b222-ec0f898822a1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[
  {
    "phone": "+380673413968",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:00.459592953Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[
  {
    "phone": "+380673413968",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:00.459592953Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[
  {
    "phone": "+380673413968",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:00.459592953Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "14eac4b3-58d3-4797-b222-ec0f898822a1",
  "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
  "assignment_id": "a671ed2c-8cb2-4bd4-a39f-82fd80ace1c6",
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
    "phone": "+380673413968"
  }
}
```

`POST /api/driver/v1/work-sessions/2d9e71bb-8699-4e30-a974-26a2548cfa0b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:23:01Z",
    "sequence": 1793370181527
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2d9e71bb-8699-4e30-a974-26a2548cfa0b",
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
  "last_heartbeat_at": "2026-10-30T14:23:01.546572Z",
  "last_location_at": "2026-10-30T14:23:01.546572Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/14eac4b3-58d3-4797-b222-ec0f898822a1/arrive` → **200**

```json
{
  "command_id": "d9b8b8d3-bd3b-47de-8055-2a4ecd3b913d",
  "expected_version": 0
}
```

```json
{
  "id": "14eac4b3-58d3-4797-b222-ec0f898822a1",
  "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
  "assignment_id": "a671ed2c-8cb2-4bd4-a39f-82fd80ace1c6",
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
  "arrived_at": "2026-10-30T14:23:01.858398Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673413968"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[
  {
    "phone": "+380673413968",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:00.459592953Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[
  {
    "phone": "+380673413968",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:00.459592953Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[
  {
    "phone": "+380673413968",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:00.459592953Z"
  },
  {
    "phone": "+380673413968",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:03.46954919Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[
  {
    "phone": "+380673413968",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:00.459592953Z"
  },
  {
    "phone": "+380673413968",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:03.46954919Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673413968` → **200**

```json
[
  {
    "phone": "+380673413968",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:00.459592953Z"
  },
  {
    "phone": "+380673413968",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T14:23:03.46954919Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/14eac4b3-58d3-4797-b222-ec0f898822a1/start` → **200**

```json
{
  "command_id": "7b983963-e7d6-4f73-ad59-eccf00628384",
  "expected_version": 1
}
```

```json
{
  "id": "14eac4b3-58d3-4797-b222-ec0f898822a1",
  "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
  "assignment_id": "a671ed2c-8cb2-4bd4-a39f-82fd80ace1c6",
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
  "arrived_at": "2026-10-30T14:23:01.858398Z",
  "started_at": "2026-10-30T14:23:04.311256Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673413968"
  }
}
```

`POST /api/driver/v1/trips/14eac4b3-58d3-4797-b222-ec0f898822a1/complete` → **200**

```json
{
  "command_id": "a1f772a4-03eb-4636-a663-7d4f49f6bf07",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:23:04Z",
  "cash_received": true
}
```

```json
{
  "id": "14eac4b3-58d3-4797-b222-ec0f898822a1",
  "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
  "assignment_id": "a671ed2c-8cb2-4bd4-a39f-82fd80ace1c6",
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
  "arrived_at": "2026-10-30T14:23:01.858398Z",
  "started_at": "2026-10-30T14:23:04.311256Z",
  "completed_at": "2026-10-30T14:23:04.623248Z",
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
  "session_id": "2d9e71bb-8699-4e30-a974-26a2548cfa0b",
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
  "last_heartbeat_at": "2026-10-30T14:23:01.546572Z",
  "last_location_at": "2026-10-30T14:23:01.546572Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2d9e71bb-8699-4e30-a974-26a2548cfa0b/close` → **200**

```json
{
  "command_id": "b264ed8c-8342-4d8f-9482-677730917051",
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
  "phone": "+380638953253",
  "device_ref": "sandbox-16566"
}
```

```json
{
  "challenge_id": "bf305ad0-745f-43ba-a371-09717c5bcec3",
  "expires_at": "2026-10-30T14:28:05.530638158Z",
  "resend_available_at": "2026-10-30T14:23:06.530638158Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638953253` → **200**

```json
{
  "phone": "+380638953253",
  "audience": "CLIENT",
  "code": "471359",
  "sent_at": "2026-10-30T14:23:05.534563897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf305ad0-745f-43ba-a371-09717c5bcec3",
  "code": "471359",
  "device_ref": "sandbox-16566"
}
```

```json
{
  "session_id": "08a97cdf-869d-4f87-b1dc-e12dca5e8dc2",
  "subject": {
    "type": "CLIENT",
    "id": "35b81ec2-6a8d-46b3-9ed5-78600dcea843"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNWI4MWVjMi02YThkLTQ2YjMtOWVkNS03ODYwMGRjZWE4NDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMDg1LCJpYXQiOjE3OTMzNzAxODUsImp0aSI6Ijc1YTFiMTI0LTY5MzYtNDM3Mi1iZDY2LWZkMzg0Y2NhNWViYyIsInNpZCI6IjA4YTk3Y2RmLTg2OWQtNGY4Ny1iMWRjLWUxMmRjYTVlOGRjMiJ9.4bONBDkAPXqi4cbiqtxvgW0518vsbRZsQkbArIDQ_OU",
  "access_expires_at": "2026-10-30T14:38:05.869228896Z",
  "refresh_token": "KaLacEPL4tjyJ0FnVGdIMXBI8rYkny8Zf6DfZO-WTWs",
  "refresh_expires_at": "2026-11-29T14:23:05.868651656Z",
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
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
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
  "device_ref": "sandbox-19093"
}
```

```json
{
  "challenge_id": "b7076b65-47ea-4934-abfb-b3376fe932ce",
  "expires_at": "2026-10-30T14:28:06.424396608Z",
  "resend_available_at": "2026-10-30T14:23:07.424396608Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "436735",
  "sent_at": "2026-10-30T14:23:06.427595689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7076b65-47ea-4934-abfb-b3376fe932ce",
  "code": "436735",
  "device_ref": "sandbox-19093"
}
```

```json
{
  "session_id": "1d227812-bf57-4915-8f76-3a84bc8ea203",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTA4NiwiaWF0IjoxNzkzMzcwMTg2LCJqdGkiOiJhZTA1ZGE2MS0xMzZmLTQyZmEtODdlYi1iZWY1NTg2Nzg1NjYiLCJzaWQiOiIxZDIyNzgxMi1iZjU3LTQ5MTUtOGY3Ni0zYTg0YmM4ZWEyMDMifQ.IL3_CE0XL5PPzUReeB0_d1_EcmIbe6QVj__a2xJ9JbI",
  "access_expires_at": "2026-10-30T14:38:06.747570929Z",
  "refresh_token": "GAYfsXLuRP_-aZ0fvMzQwqi7Fa0v7qjRbfzsk-3Hbtg",
  "refresh_expires_at": "2026-11-29T14:23:06.746825856Z",
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
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
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
  "session_id": "7cc72819-c608-4629-be1f-1e7779691792",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEwODcsImlhdCI6MTc5MzM3MDE4NywianRpIjoiMDgyMmRlYWQtODRhMy00NTk5LTg0YTUtYWMxNzYwYzk4N2YzIiwic2lkIjoiN2NjNzI4MTktYzYwOC00NjI5LWJlMWYtMWU3Nzc5NjkxNzkyIn0.IBTh3fl2jUC7f2pz76ec4G3lQ_lydm6356KZAVitgNY",
  "access_expires_at": "2026-10-30T14:38:07.646422946Z",
  "refresh_token": "oSbajsrDKINOMBvtsds8VFidwK_ZILKGuqqEv38aI5k",
  "refresh_expires_at": "2026-10-31T02:23:07.645653207Z",
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
  "session_id": "364b9004-f5c0-49a0-86cd-da42bf5a3930",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEwODgsImlhdCI6MTc5MzM3MDE4OCwianRpIjoiMzNiOTRlZmMtYjRjZC00MjBjLTg4NzctYjcxYWFhYzE4ZjQzIiwic2lkIjoiMzY0YjkwMDQtZjVjMC00OWEwLTg2Y2QtZGE0MmJmNWEzOTMwIn0.iDHrq6i3eXLuHTd1tbLhEu3BGnm3yLOC0lYmf5VMr60",
  "access_expires_at": "2026-10-30T14:38:08.244048499Z",
  "refresh_token": "OR8v11mwj9MWlBOl3lUUhtQi1P6DUp5hZmeG4eaXxAU",
  "refresh_expires_at": "2026-10-31T02:23:08.243338952Z",
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
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
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
  "command_id": "652b5724-856a-400d-9a6c-ae32b8bdec3e",
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
  "id": "15c85a8d-8880-4774-8657-61b11b789cde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:28:08.873702Z",
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
  "command_id": "83c34005-9ac5-4919-80fa-18c004753a44",
  "quote_id": "15c85a8d-8880-4774-8657-61b11b789cde",
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
  "id": "2c09a1ca-bb27-42d8-9350-f72c7db03b31",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "35b81ec2-6a8d-46b3-9ed5-78600dcea843",
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
  "created_at": "2026-10-30T14:23:09.191481Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2c09a1ca-bb27-42d8-9350-f72c7db03b31` → **200**

```json
{
  "id": "2c09a1ca-bb27-42d8-9350-f72c7db03b31",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "35b81ec2-6a8d-46b3-9ed5-78600dcea843",
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
  "created_at": "2026-10-30T14:23:09.191481Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2c09a1ca-bb27-42d8-9350-f72c7db03b31/cancel` → **200**

```json
{
  "command_id": "72304aa1-afd9-4197-a8de-b76f7cb836d3",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "2c09a1ca-bb27-42d8-9350-f72c7db03b31",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "35b81ec2-6a8d-46b3-9ed5-78600dcea843",
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
  "created_at": "2026-10-30T14:23:09.191481Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
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
  "command_id": "1b56b17a-dc41-46cd-8064-f8d9deee72d0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:23:10Z",
    "sequence": 1793370190443
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1ca2fa00-bd3d-45b8-a1a4-318c83670612",
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
  "last_heartbeat_at": "2026-10-30T14:23:10.464105Z",
  "last_location_at": "2026-10-30T14:23:10.464105Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27039"
}
```

```json
{
  "challenge_id": "fe6c21ac-405b-4bac-8573-d6b9c756f3f6",
  "expires_at": "2026-10-30T14:28:10.761010215Z",
  "resend_available_at": "2026-10-30T14:23:11.761010215Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "054100",
  "sent_at": "2026-10-30T14:23:10.764428546Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe6c21ac-405b-4bac-8573-d6b9c756f3f6",
  "code": "054100",
  "device_ref": "sandbox-27039"
}
```

```json
{
  "session_id": "9efcc48f-34f0-4d29-b27d-3c5742a94a35",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTA5MSwiaWF0IjoxNzkzMzcwMTkxLCJqdGkiOiIwMjQyNmY5OC1jYzAyLTQzZmYtYTkyMi1lODEyOThiMTg0MjkiLCJzaWQiOiI5ZWZjYzQ4Zi0zNGYwLTRkMjktYjI3ZC0zYzU3NDJhOTRhMzUifQ.PW7kLwq9lTOChXSL1QO9kLqVw-1zVzYzmsTkY1_uGjs",
  "access_expires_at": "2026-10-30T14:38:11.07975339Z",
  "refresh_token": "5gba7BUSbX1vtNvSuFCsSUiU-PdN1fGzqokteexBYc0",
  "refresh_expires_at": "2026-11-29T14:23:11.079068141Z",
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
  "command_id": "9b44ec2f-0865-43b2-9173-19184925fb6d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:23:11Z",
    "sequence": 1793370191658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "72c9f2a3-5a8c-4cfe-850f-b3c194a19da6",
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
  "last_heartbeat_at": "2026-10-30T14:23:11.678974Z",
  "last_location_at": "2026-10-30T14:23:11.678974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e4b852c-16ea-4f54-9f45-83754cc1df94",
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
  "id": "65ac49f8-acb6-4969-96d1-59de05d51986",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:28:11.975816Z",
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
  "command_id": "aec5a631-0a82-4b82-8946-d21d7ee4fe3d",
  "quote_id": "65ac49f8-acb6-4969-96d1-59de05d51986",
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
  "id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "35b81ec2-6a8d-46b3-9ed5-78600dcea843",
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
  "created_at": "2026-10-30T14:23:12.302088Z",
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
    "id": "2de412c0-e698-45e0-89ac-f6f96848819a",
    "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
    "expires_at": "2026-10-30T14:23:27.309548Z",
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

`POST /api/driver/v1/offers/2de412c0-e698-45e0-89ac-f6f96848819a/accept` → **200**

```json
{
  "command_id": "ab7b2d73-ddf5-44a0-bb0f-ac04fa7bdb44"
}
```

```json
{
  "id": "a3b7d8f9-92a1-45c2-9959-41af7bdc3463",
  "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a8fdeeb7-034f-45f5-b307-da32b4dc560a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a8fdeeb7-034f-45f5-b307-da32b4dc560a",
  "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
  "assignment_id": "a3b7d8f9-92a1-45c2-9959-41af7bdc3463",
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

`POST /api/driver/v1/trips/a8fdeeb7-034f-45f5-b307-da32b4dc560a/cancel` → **200**

```json
{
  "command_id": "fae7e660-17c9-4991-b50f-ed0337f9e38a",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "a8fdeeb7-034f-45f5-b307-da32b4dc560a",
  "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
  "assignment_id": "a3b7d8f9-92a1-45c2-9959-41af7bdc3463",
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

`GET /api/rider/v1/orders/b765c7a0-40a2-4dc6-bc24-da12ac6f41ae` → **200**

```json
{
  "id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "35b81ec2-6a8d-46b3-9ed5-78600dcea843",
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
    "id": "a3b7d8f9-92a1-45c2-9959-41af7bdc3463",
    "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a8fdeeb7-034f-45f5-b307-da32b4dc560a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:23:12.302088Z",
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
    "id": "eb1162c6-9726-42be-98a9-eeb56c0846dd",
    "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
    "expires_at": "2026-10-30T14:23:28.510548Z",
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

`POST /api/driver/v1/offers/eb1162c6-9726-42be-98a9-eeb56c0846dd/accept` → **200**

```json
{
  "command_id": "bfb5fab1-6c8e-49f8-b57b-57bdd1976e10"
}
```

```json
{
  "id": "502b3a2f-68cb-4ef0-abf5-4af2c6422331",
  "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "de98e82a-134b-402c-8bcc-3857b606ca62",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "de98e82a-134b-402c-8bcc-3857b606ca62",
  "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
  "assignment_id": "502b3a2f-68cb-4ef0-abf5-4af2c6422331",
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

`POST /api/driver/v1/trips/de98e82a-134b-402c-8bcc-3857b606ca62/cancel` → **200**

```json
{
  "command_id": "05a8fe03-66a9-4041-a197-c5830f96e968",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "de98e82a-134b-402c-8bcc-3857b606ca62",
  "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
  "assignment_id": "502b3a2f-68cb-4ef0-abf5-4af2c6422331",
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
    "id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T14:23:12.302088Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "2c09a1ca-bb27-42d8-9350-f72c7db03b31",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T14:23:09.191481Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/b765c7a0-40a2-4dc6-bc24-da12ac6f41ae/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:23:12.303597Z",
      "actor": {
        "type": "CLIENT",
        "id": "35b81ec2-6a8d-46b3-9ed5-78600dcea843",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
        "quote_id": "65ac49f8-acb6-4969-96d1-59de05d51986",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "681eed72-c940-4a8c-b618-dac7511c8f13"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:23:12.307467Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
        "attempt_id": "81a65a54-b400-48b3-8fda-c7c4f0647a6d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "681eed72-c940-4a8c-b618-dac7511c8f13"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:23:12.322892Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2de412c0-e698-45e0-89ac-f6f96848819a",
        "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "681eed72-c940-4a8c-b618-dac7511c8f13"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T14:23:12.938495Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2de412c0-e698-45e0-89ac-f6f96848819a",
        "order_id": "b765c7a0-40a2-4dc6-bc24-da12ac6f41ae",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "a3b7d8f9-92a1-45c2-9959-41af7bdc3463"
      },
      "correlation_id": "0c4eef5e-7390-4b8a-9238-6c11bda817c1"
```

Done: orders 2c09a1ca-bb27-42d8-9350-f72c7db03b31, b765c7a0-40a2-4dc6-bc24-da12ac6f41ae.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739620182",
  "device_ref": "sandbox-485"
}
```

```json
{
  "challenge_id": "8e0dad3e-94a0-4160-9ea4-29ad4aae2c47",
  "expires_at": "2026-10-30T14:28:15.959867163Z",
  "resend_available_at": "2026-10-30T14:23:16.959867163Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739620182` → **200**

```json
{
  "phone": "+380739620182",
  "audience": "CLIENT",
  "code": "461837",
  "sent_at": "2026-10-30T14:23:15.964276125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e0dad3e-94a0-4160-9ea4-29ad4aae2c47",
  "code": "461837",
  "device_ref": "sandbox-485"
}
```

```json
{
  "session_id": "9c5356c4-ea17-41b4-baf7-da1485963d4e",
  "subject": {
    "type": "CLIENT",
    "id": "ba332a6e-b927-43a0-9454-4710b6cbac07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTMzMmE2ZS1iOTI3LTQzYTAtOTQ1NC00NzEwYjZjYmFjMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMDk2LCJpYXQiOjE3OTMzNzAxOTYsImp0aSI6IjIyOTNhMWI2LTcyYWYtNGJhNy05NzBiLTAwZjQzMDVkNzZhNCIsInNpZCI6IjljNTM1NmM0LWVhMTctNDFiNC1iYWY3LWRhMTQ4NTk2M2Q0ZSJ9.AgAAlzbkCPmhSD0gw_wwyD9iQXFheTea8i8BGXhDFCE",
  "access_expires_at": "2026-10-30T14:38:16.292180764Z",
  "refresh_token": "2MaoQY8vSe91CzY03AMbH_qrZ6E-MhGf4WjEntwfw6Q",
  "refresh_expires_at": "2026-11-29T14:23:16.291597844Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f9cbc446-aa95-4c14-ba8d-cefa57595f71",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4cdffdaf-3767-4f80-ae9d-4a87d7e73539",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4cdffdaf-3767-4f80-ae9d-4a87d7e73539",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ebcd14d0a556dfd7b507259f7400311f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4cdffdaf-3767-4f80-ae9d-4a87d7e73539",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739620182"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4cdffdaf-3767-4f80-ae9d-4a87d7e73539",
  "expires_at": "2026-10-30T14:53:16.596038Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/4cdffdaf-3767-4f80-ae9d-4a87d7e73539` → **200**

```json
{
  "id": "4cdffdaf-3767-4f80-ae9d-4a87d7e73539",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T14:53:16.596038Z",
  "card": {
    "id": "867b81e8-5688-4535-9195-b409c620a6c0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****9696",
    "card_type": "Visa",
    "created_at": "2026-10-30T14:23:16.90337Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "867b81e8-5688-4535-9195-b409c620a6c0",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****9696",
      "card_type": "Visa",
      "created_at": "2026-10-30T14:23:16.90337Z"
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
  "device_ref": "sandbox-8503"
}
```

```json
{
  "challenge_id": "672b6ce9-3697-4aee-af0c-300cb041e9ff",
  "expires_at": "2026-10-30T14:28:17.541559015Z",
  "resend_available_at": "2026-10-30T14:23:18.541559015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "576371",
  "sent_at": "2026-10-30T14:23:17.544199992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "672b6ce9-3697-4aee-af0c-300cb041e9ff",
  "code": "576371",
  "device_ref": "sandbox-8503"
}
```

```json
{
  "session_id": "f4c74642-3eea-4bdf-a66e-f3d6bb97d882",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTA5NywiaWF0IjoxNzkzMzcwMTk3LCJqdGkiOiI3Y2JkNGQ2OC1hM2Q2LTQzMTYtYTEwYy1iMGQyMjk0OGJiNTkiLCJzaWQiOiJmNGM3NDY0Mi0zZWVhLTRiZGYtYTY2ZS1mM2Q2YmI5N2Q4ODIifQ.3SoYyNBBrai4F8oAVYoTYIINIkEjQflO4ozqsgvrGKM",
  "access_expires_at": "2026-10-30T14:38:17.878618074Z",
  "refresh_token": "Civ26adhgGZ-cMYAeLzlJNk29-EXt1cQA3P1e1pqFtM",
  "refresh_expires_at": "2026-11-29T14:23:17.877906687Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "72c9f2a3-5a8c-4cfe-850f-b3c194a19da6",
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
  "last_heartbeat_at": "2026-10-30T14:23:11.678974Z",
  "last_location_at": "2026-10-30T14:23:11.678974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/72c9f2a3-5a8c-4cfe-850f-b3c194a19da6/handover` → **200**

```json
{
  "command_id": "eb0a0961-9f2f-4e04-8f3a-83b4c3f0ab86",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "72c9f2a3-5a8c-4cfe-850f-b3c194a19da6",
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
  "last_heartbeat_at": "2026-10-30T14:23:11.678974Z",
  "last_location_at": "2026-10-30T14:23:11.678974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/72c9f2a3-5a8c-4cfe-850f-b3c194a19da6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:24:00Z",
    "sequence": 1793370240819
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "72c9f2a3-5a8c-4cfe-850f-b3c194a19da6",
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
  "last_heartbeat_at": "2026-10-30T14:24:00.839595Z",
  "last_location_at": "2026-10-30T14:24:00.839595Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e5f97c61-ef38-42f6-a9ec-c70b49dd806d",
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
  "id": "aff8904d-e813-49a1-a06b-2c590fd74863",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:29:01.143547Z",
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
  "command_id": "aebcfe52-406b-4bdc-ad60-c3118aa5d67d",
  "quote_id": "aff8904d-e813-49a1-a06b-2c590fd74863",
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
  "id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
  "created_at": "2026-10-30T14:24:01.457598Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08` → **200**

```json
{
  "id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
  "created_at": "2026-10-30T14:24:01.457598Z",
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
    "id": "ba542d7a-5fd1-4da5-a577-c1ffb3870018",
    "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
    "expires_at": "2026-10-30T14:24:16.774264Z",
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

`POST /api/driver/v1/offers/ba542d7a-5fd1-4da5-a577-c1ffb3870018/accept` → **200**

```json
{
  "command_id": "c00e535f-56fa-4ff3-8afd-2f13c096f8ba"
}
```

```json
{
  "id": "213407a3-7944-4ae3-94f5-8460022e3943",
  "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0766c816-c4a1-424e-a17a-a13c75fbb36f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0766c816-c4a1-424e-a17a-a13c75fbb36f",
  "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "assignment_id": "213407a3-7944-4ae3-94f5-8460022e3943",
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

`POST /api/driver/v1/work-sessions/72c9f2a3-5a8c-4cfe-850f-b3c194a19da6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:24:09Z",
    "sequence": 1793370249976
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "72c9f2a3-5a8c-4cfe-850f-b3c194a19da6",
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
  "last_heartbeat_at": "2026-10-30T14:24:09.996243Z",
  "last_location_at": "2026-10-30T14:24:09.996243Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0766c816-c4a1-424e-a17a-a13c75fbb36f/arrive` → **200**

```json
{
  "command_id": "273e8ed6-ea8b-4796-8107-328ab07f35e4",
  "expected_version": 0
}
```

```json
{
  "id": "0766c816-c4a1-424e-a17a-a13c75fbb36f",
  "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "assignment_id": "213407a3-7944-4ae3-94f5-8460022e3943",
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
  "arrived_at": "2026-10-30T14:24:10.296086Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0766c816-c4a1-424e-a17a-a13c75fbb36f/start` → **200**

```json
{
  "command_id": "477aeb49-0b51-49a4-8076-7f68c3df0450",
  "expected_version": 1
}
```

```json
{
  "id": "0766c816-c4a1-424e-a17a-a13c75fbb36f",
  "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "assignment_id": "213407a3-7944-4ae3-94f5-8460022e3943",
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
  "arrived_at": "2026-10-30T14:24:10.296086Z",
  "started_at": "2026-10-30T14:24:10.606548Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0766c816-c4a1-424e-a17a-a13c75fbb36f/complete` → **200**

```json
{
  "command_id": "02d7e2bc-5e1a-4dc9-ad0d-f1db1cc92d88",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:24:10Z",
  "cash_received": true
}
```

```json
{
  "id": "0766c816-c4a1-424e-a17a-a13c75fbb36f",
  "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "assignment_id": "213407a3-7944-4ae3-94f5-8460022e3943",
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
  "arrived_at": "2026-10-30T14:24:10.296086Z",
  "started_at": "2026-10-30T14:24:10.606548Z",
  "completed_at": "2026-10-30T14:24:10.922987Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08` → **200**

```json
{
  "id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
    "id": "213407a3-7944-4ae3-94f5-8460022e3943",
    "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0766c816-c4a1-424e-a17a-a13c75fbb36f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:24:01.457598Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08` → **200**

```json
{
  "id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
    "id": "213407a3-7944-4ae3-94f5-8460022e3943",
    "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0766c816-c4a1-424e-a17a-a13c75fbb36f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:24:01.457598Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08` → **200**

```json
{
  "id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
    "id": "213407a3-7944-4ae3-94f5-8460022e3943",
    "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0766c816-c4a1-424e-a17a-a13c75fbb36f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:24:01.457598Z",
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

`GET /api/rider/v1/orders/f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08/tip` → **200**

```json
{
  "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
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
  "available_until": "2026-10-31T14:24:10.922987Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08/tip` → **201**

```json
{
  "command_id": "5957087a-5460-4f5a-92c6-4649a32d9b9d",
  "amount_minor": 2500
}
```

```json
{
  "id": "5a8a3733-d1d7-4780-9d15-fff0eb9ca705",
  "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T14:24:14.737037Z"
}
```

`GET /api/rider/v1/orders/f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08/tip` → **200**

```json
{
  "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
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
  "available_until": "2026-10-31T14:24:10.922987Z",
  "open": false,
  "tip": {
    "id": "5a8a3733-d1d7-4780-9d15-fff0eb9ca705",
    "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T14:24:14.737037Z"
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
      "id": "5f137619-bf5a-4d79-a26b-2d052bd73f2d",
      "at": "2026-10-30T14:24:11.834738Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
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
      "id": "3a2d0426-f25e-47da-85da-daa76be5e8df",
      "at": "2026-10-30T14:24:15.893631Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
      "counterpart_id": null
    },
    {
      "id": "5f137619-bf5a-4d79-a26b-2d052bd73f2d",
      "at": "2026-10-30T14:24:11.834738Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f66912b0-f5ac-40f1-8b96-2c693c3df308",
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
  "id": "6b5d5ead-7941-4958-a6fd-3e417a1f6f0e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:29:16.917623Z",
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
  "session_id": "b84042b3-76f6-488d-ae76-ca0949212b95",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzExNTcsImlhdCI6MTc5MzM3MDI1NywianRpIjoiNjAyYTRiMGYtNzhmNC00OTkwLTgyMWUtN2U5ZWI5YmMyYjdkIiwic2lkIjoiYjg0MDQyYjMtNzZmNi00ODhkLWFlNzYtY2EwOTQ5MjEyYjk1In0.WFoXCp1uoga-J3EQYsENTGr4ZQNSc97zZHd-YAFm1Jo",
  "access_expires_at": "2026-10-30T14:39:17.515330628Z",
  "refresh_token": "FoX7Xes2x9y2p_ox2yv002x69hfoIg4aQFEA_bDrkic",
  "refresh_expires_at": "2026-10-31T02:24:17.51464159Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739620182` → **200**

```json
{
  "client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07"
}
```

`POST /api/admin/v1/rider-wallets/ba332a6e-b927-43a0-9454-4710b6cbac07/top-ups` → **201**

```json
{
  "command_id": "2fbc7372-0ee7-48cc-92f4-9aaf184c380e",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
      "id": "f13e8ea4-8e1d-49e0-a177-4618651e8bf5",
      "at": "2026-10-30T14:24:18.096517Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ebe41f59-f018-42d8-b32e-e98e2e941a49",
  "quote_id": "6b5d5ead-7941-4958-a6fd-3e417a1f6f0e",
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
  "id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
  "created_at": "2026-10-30T14:24:18.413347Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b110f616-71e7-464c-b9aa-c2d89e257d7f` → **200**

```json
{
  "id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
  "created_at": "2026-10-30T14:24:18.413347Z",
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
    "id": "3159d4ad-b329-4e7a-ad25-c10d8fd184fc",
    "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
    "expires_at": "2026-10-30T14:24:33.418626Z",
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

`POST /api/driver/v1/offers/3159d4ad-b329-4e7a-ad25-c10d8fd184fc/accept` → **200**

```json
{
  "command_id": "44fc5f4a-a79d-494f-bcaa-63fb0f9a5058"
}
```

```json
{
  "id": "6e25110b-7630-40df-affb-9313cb5d7034",
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ab0800e5-feab-49c9-a0ac-17809096fb6f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ab0800e5-feab-49c9-a0ac-17809096fb6f",
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
  "assignment_id": "6e25110b-7630-40df-affb-9313cb5d7034",
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

`POST /api/driver/v1/work-sessions/72c9f2a3-5a8c-4cfe-850f-b3c194a19da6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:24:19Z",
    "sequence": 1793370259922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "72c9f2a3-5a8c-4cfe-850f-b3c194a19da6",
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
  "last_heartbeat_at": "2026-10-30T14:24:19.943585Z",
  "last_location_at": "2026-10-30T14:24:19.943585Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ab0800e5-feab-49c9-a0ac-17809096fb6f/arrive` → **200**

```json
{
  "command_id": "9520fe35-5309-41fa-a254-096a9f209b83",
  "expected_version": 0
}
```

```json
{
  "id": "ab0800e5-feab-49c9-a0ac-17809096fb6f",
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
  "assignment_id": "6e25110b-7630-40df-affb-9313cb5d7034",
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
  "arrived_at": "2026-10-30T14:24:20.246419Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ab0800e5-feab-49c9-a0ac-17809096fb6f/start` → **200**

```json
{
  "command_id": "c84b40d7-43a7-4c9d-a5ae-8e640037976e",
  "expected_version": 1
}
```

```json
{
  "id": "ab0800e5-feab-49c9-a0ac-17809096fb6f",
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
  "assignment_id": "6e25110b-7630-40df-affb-9313cb5d7034",
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
  "arrived_at": "2026-10-30T14:24:20.246419Z",
  "started_at": "2026-10-30T14:24:20.557783Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ab0800e5-feab-49c9-a0ac-17809096fb6f/complete` → **200**

```json
{
  "command_id": "b9d501d9-12b2-4633-b47f-8b93e42c2411",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:24:20Z",
  "cash_received": true
}
```

```json
{
  "id": "ab0800e5-feab-49c9-a0ac-17809096fb6f",
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
  "assignment_id": "6e25110b-7630-40df-affb-9313cb5d7034",
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
  "arrived_at": "2026-10-30T14:24:20.246419Z",
  "started_at": "2026-10-30T14:24:20.557783Z",
  "completed_at": "2026-10-30T14:24:20.878189Z",
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
  "client_id": "ba332a6e-b927-43a0-9454-4710b6cbac07",
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
      "id": "76fbd052-8e27-417b-8d8b-4203a5fd496a",
      "at": "2026-10-30T14:24:20.950496Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f"
    },
    {
      "id": "f13e8ea4-8e1d-49e0-a177-4618651e8bf5",
      "at": "2026-10-30T14:24:18.096517Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
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

`GET /api/rider/v1/orders/b110f616-71e7-464c-b9aa-c2d89e257d7f/tip` → **200**

```json
{
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
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
  "available_until": "2026-10-31T14:24:20.878189Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b110f616-71e7-464c-b9aa-c2d89e257d7f/tip` → **201**

```json
{
  "command_id": "ca572cc4-9207-41e2-8918-fc4a52a7deff",
  "amount_minor": 2500
}
```

```json
{
  "id": "031b2926-3c76-486f-8275-a6f262af7688",
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T14:24:22.075721Z"
}
```

`GET /api/rider/v1/orders/b110f616-71e7-464c-b9aa-c2d89e257d7f/tip` → **200**

```json
{
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
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
  "available_until": "2026-10-31T14:24:20.878189Z",
  "open": false,
  "tip": {
    "id": "031b2926-3c76-486f-8275-a6f262af7688",
    "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T14:24:22.075721Z"
  }
}
```

`GET /api/rider/v1/orders/b110f616-71e7-464c-b9aa-c2d89e257d7f/tip` → **200**

```json
{
  "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
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
  "available_until": "2026-10-31T14:24:20.878189Z",
  "open": false,
  "tip": {
    "id": "031b2926-3c76-486f-8275-a6f262af7688",
    "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T14:24:22.075721Z"
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
      "id": "e86eb614-9327-400e-ad48-d2eac1a074ac",
      "at": "2026-10-30T14:24:20.945765Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
      "counterpart_id": null
    },
    {
      "id": "3a2d0426-f25e-47da-85da-daa76be5e8df",
      "at": "2026-10-30T14:24:15.893631Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
      "counterpart_id": null
    },
    {
      "id": "5f137619-bf5a-4d79-a26b-2d052bd73f2d",
      "at": "2026-10-30T14:24:11.834738Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
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
      "id": "5ebbb0ad-cd44-4636-ac6f-e917037f751d",
      "at": "2026-10-30T14:24:23.975068Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
      "counterpart_id": null
    },
    {
      "id": "e86eb614-9327-400e-ad48-d2eac1a074ac",
      "at": "2026-10-30T14:24:20.945765Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b110f616-71e7-464c-b9aa-c2d89e257d7f",
      "counterpart_id": null
    },
    {
      "id": "3a2d0426-f25e-47da-85da-daa76be5e8df",
      "at": "2026-10-30T14:24:15.893631Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
      "counterpart_id": null
    },
    {
      "id": "5f137619-bf5a-4d79-a26b-2d052bd73f2d",
      "at": "2026-10-30T14:24:11.834738Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f50b3678-a7c3-4a2c-ae6b-50d9d3cf3b08",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "72c9f2a3-5a8c-4cfe-850f-b3c194a19da6",
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
  "last_heartbeat_at": "2026-10-30T14:24:19.943585Z",
  "last_location_at": "2026-10-30T14:24:19.943585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/72c9f2a3-5a8c-4cfe-850f-b3c194a19da6/close` → **200**

```json
{
  "command_id": "75b13a8d-35a9-4c65-b29b-8195b85b78df",
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

Done: card order b110f616-71e7-464c-b9aa-c2d89e257d7f.

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
  "phone": "+380732815792",
  "device_ref": "sandbox-4263"
}
```

```json
{
  "challenge_id": "8efda480-c43a-4326-87d9-8c602cd72af7",
  "expires_at": "2026-10-30T14:29:26.429764638Z",
  "resend_available_at": "2026-10-30T14:24:27.429764638Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732815792` → **200**

```json
{
  "phone": "+380732815792",
  "audience": "CLIENT",
  "code": "095125",
  "sent_at": "2026-10-30T14:24:26.433465914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8efda480-c43a-4326-87d9-8c602cd72af7",
  "code": "095125",
  "device_ref": "sandbox-4263"
}
```

```json
{
  "session_id": "836a9814-959e-499f-b3aa-e20fc0d9e24a",
  "subject": {
    "type": "CLIENT",
    "id": "9336630e-8e0d-4a09-b705-84a333093b99"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzM2NjMwZS04ZTBkLTRhMDktYjcwNS04NGEzMzMwOTNiOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMTY2LCJpYXQiOjE3OTMzNzAyNjYsImp0aSI6Ijg2NzkzNWYxLTYzNTgtNGMzNi05Y2Y3LWRmYTBlZDg0NmRjMiIsInNpZCI6IjgzNmE5ODE0LTk1OWUtNDk5Zi1iM2FhLWUyMGZjMGQ5ZTI0YSJ9.Ati0EGMeQPt5cGhlrr8_Z8lT7meGubxoVmBvmiETYPs",
  "access_expires_at": "2026-10-30T14:39:26.745540886Z",
  "refresh_token": "Q5p75AVi7TZmgktAe1rMHctcgK1CWZ0VtZfyFNCxCB8",
  "refresh_expires_at": "2026-11-29T14:24:26.744976542Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "8ace966b-556a-4121-845c-25a58e155104",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "be0cd39a-c226-4d48-b95c-11e534262423",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-be0cd39a-c226-4d48-b95c-11e534262423",
    "orderDate": "1793370267",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "cec061a4cccedaacbe35aab8162436a6",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=be0cd39a-c226-4d48-b95c-11e534262423",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732815792"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=be0cd39a-c226-4d48-b95c-11e534262423",
  "created_at": "2026-10-30T14:24:27.039751Z",
  "expires_at": "2026-10-30T14:54:27.039751Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/be0cd39a-c226-4d48-b95c-11e534262423` → **200**

```json
{
  "id": "be0cd39a-c226-4d48-b95c-11e534262423",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T14:24:27.039751Z",
  "expires_at": "2026-10-30T14:54:27.039751Z",
  "completed_at": "2026-10-30T14:24:27.337531Z",
  "masked_pan": "41****3390",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9336630e-8e0d-4a09-b705-84a333093b99",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9336630e-8e0d-4a09-b705-84a333093b99",
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
      "id": "09faecad-507b-4791-9300-4e7a9a352d83",
      "at": "2026-10-30T14:24:27.991313Z",
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
  "client_id": "9336630e-8e0d-4a09-b705-84a333093b99",
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
      "id": "09faecad-507b-4791-9300-4e7a9a352d83",
      "at": "2026-10-30T14:24:27.991313Z",
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
  "device_ref": "sandbox-2700"
}
```

```json
{
  "challenge_id": "d982f62c-a016-4076-b8a1-a055f7595d31",
  "expires_at": "2026-10-30T14:29:29.571950666Z",
  "resend_available_at": "2026-10-30T14:24:30.571950666Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "053923",
  "sent_at": "2026-10-30T14:24:29.574883602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d982f62c-a016-4076-b8a1-a055f7595d31",
  "code": "053923",
  "device_ref": "sandbox-2700"
}
```

```json
{
  "session_id": "59d2329b-6c09-4961-8ee5-0cc8bf46bb71",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTE2OSwiaWF0IjoxNzkzMzcwMjY5LCJqdGkiOiI5YTA5ZjY4Ni1mNzQyLTRjYzYtYTdmZi1lODM4NzY2OTRkMDciLCJzaWQiOiI1OWQyMzI5Yi02YzA5LTQ5NjEtOGVlNS0wY2M4YmY0NmJiNzEifQ.IZyCxoIHGPsSfz8ajxTN3vDp98mBk0l7CKXGoXwr31Y",
  "access_expires_at": "2026-10-30T14:39:29.909843096Z",
  "refresh_token": "mjAHuIxvKLZlfWPMkahVJW-wuuQ7F0XCRH6g3-flmco",
  "refresh_expires_at": "2026-11-29T14:24:29.909297727Z",
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
  "command_id": "c87059c8-f59a-4597-9ebe-bd78af96451c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "7f90fbb3-a0b6-410c-ac03-3f33e838a0d8",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-7f90fbb3-a0b6-410c-ac03-3f33e838a0d8",
    "orderDate": "1793370270",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "c2696299811a8f92e5c6e0b54e52b442",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=7f90fbb3-a0b6-410c-ac03-3f33e838a0d8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=7f90fbb3-a0b6-410c-ac03-3f33e838a0d8",
  "created_at": "2026-10-30T14:24:30.498474Z",
  "expires_at": "2026-10-30T14:54:30.498474Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/7f90fbb3-a0b6-410c-ac03-3f33e838a0d8` → **200**

```json
{
  "id": "7f90fbb3-a0b6-410c-ac03-3f33e838a0d8",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T14:24:30.498474Z",
  "expires_at": "2026-10-30T14:54:30.498474Z",
  "completed_at": "2026-10-30T14:24:30.799949Z",
  "masked_pan": "41****5414",
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
      "id": "ee82b483-3b10-4cb8-bc2b-1e24b0cd560b",
      "at": "2026-10-30T14:24:31.000347Z",
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
  "command_id": "30b28519-9813-4841-bb50-661dc480f0cf",
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
  "correlation_id": "09c0c37a-4095-40f8-8b2d-ca44f3a00065"
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
  "device_ref": "sandbox-28922"
}
```

```json
{
  "challenge_id": "1b078f68-1af5-4974-a968-a9457f1678a4",
  "expires_at": "2026-10-30T14:29:31.696561604Z",
  "resend_available_at": "2026-10-30T14:24:32.696561604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "830535",
  "sent_at": "2026-10-30T14:24:31.699467247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b078f68-1af5-4974-a968-a9457f1678a4",
  "code": "830535",
  "device_ref": "sandbox-28922"
}
```

```json
{
  "session_id": "dc610e0e-e6db-4589-bbe8-913149640921",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTE3MiwiaWF0IjoxNzkzMzcwMjcyLCJqdGkiOiIwZmJjYWZjYy01MGJmLTRhNGEtODY0Yy1hZjFiNDNhMjRkYjAiLCJzaWQiOiJkYzYxMGUwZS1lNmRiLTQ1ODktYmJlOC05MTMxNDk2NDA5MjEifQ.0KHmaDBU9ARCknF5lkjywo-XnNhmOlNJxCxB_6BK2JY",
  "access_expires_at": "2026-10-30T14:39:32.01973498Z",
  "refresh_token": "DqVJpEPfPTfHM3kz1iR0voeNY4yVEOVuAb3-mNzaI1w",
  "refresh_expires_at": "2026-11-29T14:24:32.019068034Z",
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
  "command_id": "1d1aa982-3a5f-4f6c-9d0a-867a2546f453",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:24:32Z",
    "sequence": 1793370272608
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5ef44f0-6157-4b16-a840-ed7c860e8695",
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
  "last_heartbeat_at": "2026-10-30T14:24:32.627992Z",
  "last_location_at": "2026-10-30T14:24:32.627992Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637584571",
  "device_ref": "sandbox-18266"
}
```

```json
{
  "challenge_id": "c1b3e327-e707-4f81-9a10-f9a232f9f99d",
  "expires_at": "2026-10-30T14:29:32.924824429Z",
  "resend_available_at": "2026-10-30T14:24:33.924824429Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637584571` → **200**

```json
{
  "phone": "+380637584571",
  "audience": "CLIENT",
  "code": "319337",
  "sent_at": "2026-10-30T14:24:32.927787762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c1b3e327-e707-4f81-9a10-f9a232f9f99d",
  "code": "319337",
  "device_ref": "sandbox-18266"
}
```

```json
{
  "session_id": "ca062041-0a1e-4b23-b328-f0e2aa5e660e",
  "subject": {
    "type": "CLIENT",
    "id": "1aca2d31-a9a1-4387-8678-2be5a85d95ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYWNhMmQzMS1hOWExLTQzODctODY3OC0yYmU1YTg1ZDk1ZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMTczLCJpYXQiOjE3OTMzNzAyNzMsImp0aSI6Ijk3NTIwMmE1LTM1YzctNGRlMy04YWUwLTVhNDhmZTNjM2RkNCIsInNpZCI6ImNhMDYyMDQxLTBhMWUtNGIyMy1iMzI4LWYwZTJhYTVlNjYwZSJ9.MJRe6ntUs7A11D58DcW2xis8hgzL3VUAtX9Rp-OTb5g",
  "access_expires_at": "2026-10-30T14:39:33.248379605Z",
  "refresh_token": "KgyhRhj0gj3t0cW7UWrgjf9OzpmltKnPwmtitwMj_vE",
  "refresh_expires_at": "2026-11-29T14:24:33.247634733Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1117c9b2-5ebe-481d-9c19-4e6d910d0a73",
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
  "id": "3592d126-c677-455e-b5f9-4c941ccbf111",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:29:33.564538Z",
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
  "command_id": "f4a4042d-d876-4532-9be9-9d4b7ce580bd",
  "quote_id": "3592d126-c677-455e-b5f9-4c941ccbf111",
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
  "id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1aca2d31-a9a1-4387-8678-2be5a85d95ee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:24:33.86633Z",
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
    "id": "ecce9431-954e-4f09-abe7-911670d8fe1e",
    "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
    "expires_at": "2026-10-30T14:24:48.870399Z",
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

`POST /api/driver/v1/offers/ecce9431-954e-4f09-abe7-911670d8fe1e/accept` → **200**

```json
{
  "command_id": "e3c4d0f9-53fb-4e47-93d6-885a04563f5c"
}
```

```json
{
  "id": "5180b47b-287f-41f0-bee1-1b91f9923c29",
  "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "248ab364-a67d-4980-92af-806ec8fbee63",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "248ab364-a67d-4980-92af-806ec8fbee63",
  "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
  "assignment_id": "5180b47b-287f-41f0-bee1-1b91f9923c29",
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

`POST /api/driver/v1/work-sessions/a5ef44f0-6157-4b16-a840-ed7c860e8695/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:24:35Z",
    "sequence": 1793370275797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5ef44f0-6157-4b16-a840-ed7c860e8695",
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
  "last_heartbeat_at": "2026-10-30T14:24:35.098243Z",
  "last_location_at": "2026-10-30T14:24:35.098243Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/248ab364-a67d-4980-92af-806ec8fbee63/arrive` → **200**

```json
{
  "command_id": "c2ca5069-2010-4d0f-8cc5-27a967d64ac9",
  "expected_version": 0
}
```

```json
{
  "id": "248ab364-a67d-4980-92af-806ec8fbee63",
  "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
  "assignment_id": "5180b47b-287f-41f0-bee1-1b91f9923c29",
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
  "arrived_at": "2026-10-30T14:24:35.401287Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/248ab364-a67d-4980-92af-806ec8fbee63/start` → **200**

```json
{
  "command_id": "2ce96630-c9c1-4428-a96d-1e10195b8397",
  "expected_version": 1
}
```

```json
{
  "id": "248ab364-a67d-4980-92af-806ec8fbee63",
  "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
  "assignment_id": "5180b47b-287f-41f0-bee1-1b91f9923c29",
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
  "arrived_at": "2026-10-30T14:24:35.401287Z",
  "started_at": "2026-10-30T14:24:35.71872Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/248ab364-a67d-4980-92af-806ec8fbee63/complete` → **200**

```json
{
  "command_id": "8fff5325-2e5d-4286-8c3f-6c4049a077a9",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:24:36Z",
  "cash_received": false
}
```

```json
{
  "id": "248ab364-a67d-4980-92af-806ec8fbee63",
  "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
  "assignment_id": "5180b47b-287f-41f0-bee1-1b91f9923c29",
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
  "arrived_at": "2026-10-30T14:24:35.401287Z",
  "started_at": "2026-10-30T14:24:35.71872Z",
  "completed_at": "2026-10-30T14:24:36.028316Z",
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
  "session_id": "f5fbdf48-142c-40de-934f-8bda9ec4905f",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzExNzYsImlhdCI6MTc5MzM3MDI3NiwianRpIjoiYWM4MzA3ZTYtMjgzZi00YjJiLWE5NzAtODQ5OGJmZTNmN2Q0Iiwic2lkIjoiZjVmYmRmNDgtMTQyYy00MGRlLTkzNGYtOGJkYTllYzQ5MDVmIn0.5QjU6lBLPlPdOheo3rtfMFbEMZ0N1leLFkHVfssCGpg",
  "access_expires_at": "2026-10-30T14:39:36.630913476Z",
  "refresh_token": "LAaR61TxvVw9_afgmy1sApKuzeEpTxETD64cxZEiqBY",
  "refresh_expires_at": "2026-10-31T02:24:36.629746596Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c5298825-a680-4e48-a99c-cab13030cf6d"
}
```

`GET /api/admin/v1/orders/7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732/cash-dispute` → **200**

```json
{
  "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "1aca2d31-a9a1-4387-8678-2be5a85d95ee",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T14:24:37.077935Z",
  "decide_by": "2026-11-13T14:24:37.077935Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T14:24:37.077935Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "1aca2d31-a9a1-4387-8678-2be5a85d95ee",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T14:24:37.077935Z",
      "decide_by": "2026-11-13T14:24:37.077935Z",
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

`POST /api/admin/v1/orders/7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732/cash-dispute/decide` → **400**

```json
{
  "command_id": "87382f4c-901e-4e36-b568-8692bafe9b84",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1a277728-4bc2-462b-a086-dd3c8bc4f5ea",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732/cash-dispute/decide` → **200**

```json
{
  "command_id": "e2f42e46-c930-4182-bf29-96f008d6d1f7",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "1aca2d31-a9a1-4387-8678-2be5a85d95ee",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T14:24:37.077935Z",
  "decide_by": "2026-11-13T14:24:37.077935Z",
  "decision": "PAY_DRIVER",
  "decided_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T14:24:39.14502Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732/cash-dispute/decide` → **409**

```json
{
  "command_id": "cae56bc5-8730-4b3a-897f-69738a5b657e",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "da0d7f07-b21c-4058-b090-1414c6d1d9de"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a5ef44f0-6157-4b16-a840-ed7c860e8695",
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
  "last_heartbeat_at": "2026-10-30T14:24:35.098243Z",
  "last_location_at": "2026-10-30T14:24:35.098243Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a5ef44f0-6157-4b16-a840-ed7c860e8695/close` → **200**

```json
{
  "command_id": "07fb9197-42ee-470e-a23e-69bec377aa8d",
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
  "phone": "+380731924216",
  "device_ref": "sandbox-3545"
}
```

```json
{
  "challenge_id": "0f064b1c-21e2-4615-bd53-9a7029f2ab6f",
  "expires_at": "2026-10-30T14:29:40.333611767Z",
  "resend_available_at": "2026-10-30T14:24:41.333611767Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731924216` → **200**

```json
{
  "phone": "+380731924216",
  "audience": "CLIENT",
  "code": "301199",
  "sent_at": "2026-10-30T14:24:40.336385346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f064b1c-21e2-4615-bd53-9a7029f2ab6f",
  "code": "301199",
  "device_ref": "sandbox-3545"
}
```

```json
{
  "session_id": "6eed5876-36f6-466a-aeab-86b419316755",
  "subject": {
    "type": "CLIENT",
    "id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzgyZDliYS0yZjJiLTRjZTUtOWExYi1jNzNjYjJkNWIyNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMTgwLCJpYXQiOjE3OTMzNzAyODAsImp0aSI6ImIyMmQ4ZWMzLThkNmEtNGQxZi1hMTYyLTcwMWRmNjkwN2JlOCIsInNpZCI6IjZlZWQ1ODc2LTM2ZjYtNDY2YS1hZWFiLTg2YjQxOTMxNjc1NSJ9.Ib13g12p2Leofv2A8tpLkmSAlk-3zeHyZatNk6hkHJw",
  "access_expires_at": "2026-10-30T14:39:40.654326373Z",
  "refresh_token": "NEOnmFlae4PxOzbEiIy4H_BQ6-tU_8cl5dDiMXTfOMw",
  "refresh_expires_at": "2026-11-29T14:24:40.653678031Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a8fae774-ecae-42a7-935f-007a3ca8d722",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6f3cbbac-4836-4fe6-9389-099f7908eb84",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6f3cbbac-4836-4fe6-9389-099f7908eb84",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e38aa578eff62698b25c97dc170d9648",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6f3cbbac-4836-4fe6-9389-099f7908eb84",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731924216"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6f3cbbac-4836-4fe6-9389-099f7908eb84",
  "expires_at": "2026-10-30T14:54:40.95217Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/6f3cbbac-4836-4fe6-9389-099f7908eb84` → **200**

```json
{
  "id": "6f3cbbac-4836-4fe6-9389-099f7908eb84",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T14:54:40.95217Z",
  "card": {
    "id": "af644dfa-4bcf-467f-bfbc-b2a72f8b998b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5449",
    "card_type": "Visa",
    "created_at": "2026-10-30T14:24:41.25317Z"
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
  "device_ref": "sandbox-1752"
}
```

```json
{
  "challenge_id": "eb2bbfca-7a97-4768-b29f-c54fc584bae3",
  "expires_at": "2026-10-30T14:29:41.559745465Z",
  "resend_available_at": "2026-10-30T14:24:42.559745465Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "588459",
  "sent_at": "2026-10-30T14:24:41.562392713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb2bbfca-7a97-4768-b29f-c54fc584bae3",
  "code": "588459",
  "device_ref": "sandbox-1752"
}
```

```json
{
  "session_id": "a6bc4512-602d-4f39-abc0-ad990ecec713",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTE4MSwiaWF0IjoxNzkzMzcwMjgxLCJqdGkiOiIyYWJmMjE4ZC0wNTQ5LTQzZTUtYjk3Yy03NDgyOTM5ZDZkNGQiLCJzaWQiOiJhNmJjNDUxMi02MDJkLTRmMzktYWJjMC1hZDk5MGVjZWM3MTMifQ.FRl172jxqlXYn0d2SfAhu1WUWtK29lMZKMpRHTDPi0A",
  "access_expires_at": "2026-10-30T14:39:41.875905955Z",
  "refresh_token": "JpJrY39lTdgr-3YJz1g07niNu2qzXJWXmBZYjvM9h3M",
  "refresh_expires_at": "2026-11-29T14:24:41.875242613Z",
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
  "command_id": "bade211d-2750-46a6-b52c-f555fab98a51",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:24:42Z",
    "sequence": 1793370282460
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edef8c5f-7f64-4787-8aa5-246afc2faaa3",
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
  "last_heartbeat_at": "2026-10-30T14:24:42.479613Z",
  "last_location_at": "2026-10-30T14:24:42.479613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "df7aca9e-ec91-403f-aca7-afde808eed81",
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
  "id": "8757d637-2b68-44e7-8c63-38067fe34d73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:29:42.786836Z",
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
  "command_id": "7f21dca3-23c8-49c0-bf23-f6977a6ef3e0",
  "quote_id": "8757d637-2b68-44e7-8c63-38067fe34d73",
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
  "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
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
  "created_at": "2026-10-30T14:24:43.104061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d` → **200**

```json
{
  "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
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
  "created_at": "2026-10-30T14:24:43.104061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d` → **200**

```json
{
  "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
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
  "created_at": "2026-10-30T14:24:43.104061Z",
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
    "id": "32b150ae-f1db-4989-b8c9-7b8b317a2473",
    "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
    "expires_at": "2026-10-30T14:24:59.118572Z",
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

`POST /api/driver/v1/offers/32b150ae-f1db-4989-b8c9-7b8b317a2473/accept` → **200**

```json
{
  "command_id": "21072876-372a-4178-84cc-f3766b366b19"
}
```

```json
{
  "id": "4442205c-a76a-4e02-a813-a1d459e81cae",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "21a18b3d-5cb4-4d33-aa77-afd2d23016b3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "21a18b3d-5cb4-4d33-aa77-afd2d23016b3",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "assignment_id": "4442205c-a76a-4e02-a813-a1d459e81cae",
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

`POST /api/rider/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/messages` → **201**

```json
{
  "command_id": "f3faf86f-cbb5-4117-8318-619af37cc103",
  "body": "Я біля входу, мій номер +380731924216, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "cc0bcfe0-1455-40d7-9ae5-9201901e489b",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380731924216, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T14:24:45.932247634Z"
}
```

`POST /api/driver/v1/trips/21a18b3d-5cb4-4d33-aa77-afd2d23016b3/messages` → **201**

```json
{
  "command_id": "4d4279c1-f1d4-4178-a786-bebbe0426194",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "50ee9e36-6b66-4bd9-8b67-0b898f7dfbee",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T14:24:46.238375155Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/edef8c5f-7f64-4787-8aa5-246afc2faaa3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:24:51Z",
    "sequence": 1793370291552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edef8c5f-7f64-4787-8aa5-246afc2faaa3",
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
  "last_heartbeat_at": "2026-10-30T14:24:51.572617Z",
  "last_location_at": "2026-10-30T14:24:51.572617Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/21a18b3d-5cb4-4d33-aa77-afd2d23016b3/arrive` → **200**

```json
{
  "command_id": "91749c48-37a0-48b5-b9ab-cf050af8bd79",
  "expected_version": 0
}
```

```json
{
  "id": "21a18b3d-5cb4-4d33-aa77-afd2d23016b3",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "assignment_id": "4442205c-a76a-4e02-a813-a1d459e81cae",
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
  "arrived_at": "2026-10-30T14:24:51.881841Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/21a18b3d-5cb4-4d33-aa77-afd2d23016b3/start` → **200**

```json
{
  "command_id": "afe8ef91-7334-4fa2-9fba-bb6311a0773a",
  "expected_version": 1
}
```

```json
{
  "id": "21a18b3d-5cb4-4d33-aa77-afd2d23016b3",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "assignment_id": "4442205c-a76a-4e02-a813-a1d459e81cae",
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
  "arrived_at": "2026-10-30T14:24:51.881841Z",
  "started_at": "2026-10-30T14:24:52.186284Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/edef8c5f-7f64-4787-8aa5-246afc2faaa3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:26:22Z",
    "sequence": 1793370382502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "edef8c5f-7f64-4787-8aa5-246afc2faaa3",
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
  "last_heartbeat_at": "2026-10-30T14:26:22.522014Z",
  "last_location_at": "2026-10-30T14:26:22.522014Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/21a18b3d-5cb4-4d33-aa77-afd2d23016b3/complete` → **200**

```json
{
  "command_id": "7f0e5850-beb3-417f-ac95-0965f06d8742",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:26:22Z",
  "cash_received": false
}
```

```json
{
  "id": "21a18b3d-5cb4-4d33-aa77-afd2d23016b3",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "assignment_id": "4442205c-a76a-4e02-a813-a1d459e81cae",
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
  "arrived_at": "2026-10-30T14:24:51.881841Z",
  "started_at": "2026-10-30T14:24:52.186284Z",
  "completed_at": "2026-10-30T14:26:22.839651Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d` → **200**

```json
{
  "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
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
    "id": "4442205c-a76a-4e02-a813-a1d459e81cae",
    "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "21a18b3d-5cb4-4d33-aa77-afd2d23016b3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:24:43.104061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d` → **200**

```json
{
  "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
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
    "id": "4442205c-a76a-4e02-a813-a1d459e81cae",
    "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "21a18b3d-5cb4-4d33-aa77-afd2d23016b3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:24:43.104061Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d` → **200**

```json
{
  "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
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
    "id": "4442205c-a76a-4e02-a813-a1d459e81cae",
    "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "21a18b3d-5cb4-4d33-aa77-afd2d23016b3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:24:43.104061Z",
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
  "session_id": "edef8c5f-7f64-4787-8aa5-246afc2faaa3",
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
  "last_heartbeat_at": "2026-10-30T14:26:22.522014Z",
  "last_location_at": "2026-10-30T14:26:22.522014Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/edef8c5f-7f64-4787-8aa5-246afc2faaa3/close` → **200**

```json
{
  "command_id": "7badbeb9-90ac-4986-82d2-80cb47631023",
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
  "session_id": "ee269162-9307-4ee9-914a-f5b133c87a47",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEyODYsImlhdCI6MTc5MzM3MDM4NiwianRpIjoiNDkxNGY4YzctZTNhMy00MDZjLWI4YjgtMDEzMGI0OWQyNmRhIiwic2lkIjoiZWUyNjkxNjItOTMwNy00ZWU5LTkxNGEtZjViMTMzYzg3YTQ3In0.pLSoNdqJaBFLEMZtAXRg1wrQJK-3Rh33ciTuHI_Z85s",
  "access_expires_at": "2026-10-30T14:41:26.992248551Z",
  "refresh_token": "-wj-eFoDGxqYjeLDFhBLhrDwoTYgwz4QvIUC3NHgGx0",
  "refresh_expires_at": "2026-10-31T02:26:26.991543846Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8f270c6c-db87-4ee1-ab83-92bbdb19ab0e"
}
```

`GET /api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T14:26:27.581782601Z",
  "order": {
    "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
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
    "created_at": "2026-10-30T14:24:43.104061Z",
    "assigned_at": "2026-10-30T14:24:45.342183Z",
    "arrived_at": "2026-10-30T14:24:51.881841Z",
    "started_at": "2026-10-30T14:24:52.186284Z",
    "completed_at": "2026-10-30T14:26:22.839651Z"
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
    "id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
    "registered_at": "2026-10-30T14:24:40.651732Z",
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
      "created_at": "2026-10-30T14:24:43.106319Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T14:26:23.324843Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/chargebacks` → **422**

```json
{
  "command_id": "d74d9205-e099-4d6e-b279-ba9873e2a13d",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "e1528b87-933a-44b5-87fe-2579b42f5997"
}
```

`POST /api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/chargebacks` → **201**

```json
{
  "command_id": "921584dd-12b5-443b-b126-a08946e122c6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "921b0bbd-bf80-4f01-b34d-6b2dc0ef8b39",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T14:26:28.261431Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/chargebacks` → **201**

```json
{
  "command_id": "921584dd-12b5-443b-b126-a08946e122c6",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "921b0bbd-bf80-4f01-b34d-6b2dc0ef8b39",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T14:26:28.261431Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b` → **200**

```json
{
  "client": {
    "id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
    "phone": "+380731924216",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:24:40.651732Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T14:24:43.104061Z",
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

`POST /api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/chargebacks/921b0bbd-bf80-4f01-b34d-6b2dc0ef8b39/resolve` → **200**

```json
{
  "command_id": "d56e1e2a-40a3-47d3-8f8e-48f09938062e",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "921b0bbd-bf80-4f01-b34d-6b2dc0ef8b39",
  "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T14:26:28.261431Z",
  "resolved_at": "2026-10-30T14:26:29.321862Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b` → **200**

```json
{
  "client": {
    "id": "9c82d9ba-2f2b-4ce5-9a1b-c73cb2d5b24b",
    "phone": "+380731924216",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:24:40.651732Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T14:24:43.104061Z",
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

`POST /api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/chargebacks/921b0bbd-bf80-4f01-b34d-6b2dc0ef8b39/resolve` → **409**

```json
{
  "command_id": "7fb090b4-5c97-4e48-b1e4-879b7a155162",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/chargebacks/921b0bbd-bf80-4f01-b34d-6b2dc0ef8b39/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "878f6ac1-55d3-4b3a-822e-16aa570cb33e"
}
```

`GET /api/admin/v1/orders/2433a24a-622b-4e59-a082-22f8bdcecb9d/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "921b0bbd-bf80-4f01-b34d-6b2dc0ef8b39",
      "order_id": "2433a24a-622b-4e59-a082-22f8bdcecb9d",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T14:26:28.261431Z",
      "resolved_at": "2026-10-30T14:26:29.321862Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 2433a24a-622b-4e59-a082-22f8bdcecb9d without phone or card digits; chargeback 921b0bbd-bf80-4f01-b34d-6b2dc0ef8b39 recorded and won.

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
  "session_id": "f5150df3-7300-4c15-88e4-d09d844e8a10",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEyOTEsImlhdCI6MTc5MzM3MDM5MSwianRpIjoiYTIwNTY4NTYtZGYzYS00YjI3LTk2ODktYmU0MjA1YjAwNjQyIiwic2lkIjoiZjUxNTBkZjMtNzMwMC00YzE1LTg4ZTQtZDA5ZDg0NGU4YTEwIn0.qVqZVtEbyMeeQOWTQHcQkUP_tYBd0lBgQMTzTS8HJqM",
  "access_expires_at": "2026-10-30T14:41:31.198677162Z",
  "refresh_token": "-FUq37wBBUDvGackQqf3oWdmVdyvzjWAEYqoP736w0E",
  "refresh_expires_at": "2026-10-31T02:26:31.1980281Z",
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
  "phone": "+48600614122",
  "device_ref": "sandbox-30489"
}
```

```json
{
  "challenge_id": "f533786d-541a-4546-a9ad-7d2a54aef28f",
  "expires_at": "2026-10-30T14:31:32.101550658Z",
  "resend_available_at": "2026-10-30T14:26:33.101550658Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600614122` → **200**

```json
{
  "phone": "+48600614122",
  "audience": "CLIENT",
  "code": "505091",
  "sent_at": "2026-10-30T14:26:32.1043522Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f533786d-541a-4546-a9ad-7d2a54aef28f",
  "code": "505091",
  "device_ref": "sandbox-30489"
}
```

```json
{
  "session_id": "6adb5211-1386-48ae-b2ef-962394339588",
  "subject": {
    "type": "CLIENT",
    "id": "449ecad4-b559-4600-87d7-597d902b3041"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDllY2FkNC1iNTU5LTQ2MDAtODdkNy01OTdkOTAyYjMwNDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMjkyLCJpYXQiOjE3OTMzNzAzOTIsImp0aSI6IjVkOTU1YjA2LTU1MmYtNDZjMy04ZTdiLTA1OTc1MzNmNDI2YyIsInNpZCI6IjZhZGI1MjExLTEzODYtNDhhZS1iMmVmLTk2MjM5NDMzOTU4OCJ9.PhcLavus5uySeGYdEoSZj6tM0w-dlVOT64xTKVrqv1c",
  "access_expires_at": "2026-10-30T14:41:32.426697374Z",
  "refresh_token": "EIxUUzzl7aY1Sk4_EPtImPu_Xt_srbJtvDWi5zSsyN4",
  "refresh_expires_at": "2026-11-29T14:26:32.426052109Z",
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
  "command_id": "30fed799-937a-4ef5-ae5d-622240b76b59",
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
  "correlation_id": "4a0af7c7-d333-4419-af42-2aff6ca5415c",
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
  "command_id": "398fca84-40ac-4a06-aaf2-1f6bbc3278d2",
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
  "paused_at": "2026-10-30T14:26:33.604681747Z",
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
  "command_id": "9cfa392b-63cf-4608-949e-aabd5bfe65b9",
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
  "id": "89b0ae17-6c42-4d18-bedc-4a1e4cba6f89",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:31:34.240964Z",
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
  "command_id": "0ec8c2bf-0ee6-4a5c-aa3e-d11519107492",
  "quote_id": "89b0ae17-6c42-4d18-bedc-4a1e4cba6f89",
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
  "correlation_id": "f0603653-c3c7-444a-b796-0ad6fe91e522"
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
  "paused_at": "2026-10-30T14:26:33.604682Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "3805848f-883d-4d9f-abe6-816a70579334",
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
  "command_id": "8d18bbe8-69cf-4802-88f0-e3121efa4a1a",
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
  "command_id": "581bfd10-2db9-4426-a4a5-9da5142229e6",
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
  "id": "44081e40-5484-44ae-8938-33a937224188",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:31:36.101114Z",
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
  "command_id": "b0effe38-ced4-4939-bf96-5848d309b5b6",
  "quote_id": "44081e40-5484-44ae-8938-33a937224188",
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
  "correlation_id": "2b652daa-97e0-4a49-b92e-26a8bd4175b1"
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
  "command_id": "8c5897f6-f3d8-44e1-b2a1-db1edaf8f2dc",
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
  "command_id": "f4a643ca-de8c-4a7d-8955-52cbf8c4ab86",
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
  "id": "4f55949c-c2d5-408b-a3c4-47922826cc3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:31:37.320506Z",
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
  "command_id": "c3c95926-fa49-4bbf-b04f-46cebe0ba365",
  "quote_id": "4f55949c-c2d5-408b-a3c4-47922826cc3a",
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
  "correlation_id": "4b55d389-2e09-4df0-a70c-60ddc956019d"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "cd749901-9c85-4445-8b1e-e288a0e7fee1",
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
  "correlation_id": "e66d1a80-a849-4183-abd5-8f87688a9b72",
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
  "command_id": "76cb9ba9-3862-4f17-81cb-11b53997ada2",
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
  "phone": "+380672259956",
  "device_ref": "sandbox-12244"
}
```

```json
{
  "challenge_id": "aa379ee5-c4f1-42f6-b77a-47fc60d5c81c",
  "expires_at": "2026-10-30T14:31:38.877894474Z",
  "resend_available_at": "2026-10-30T14:26:39.877894474Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672259956` → **200**

```json
{
  "phone": "+380672259956",
  "audience": "CLIENT",
  "code": "874630",
  "sent_at": "2026-10-30T14:26:38.881023868Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa379ee5-c4f1-42f6-b77a-47fc60d5c81c",
  "code": "874630",
  "device_ref": "sandbox-12244"
}
```

```json
{
  "session_id": "d4b31778-922f-48ea-934f-34dc3507701f",
  "subject": {
    "type": "CLIENT",
    "id": "0fc48e91-9307-458d-bf50-b60afe2c7fd0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmM0OGU5MS05MzA3LTQ1OGQtYmY1MC1iNjBhZmUyYzdmZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMjk5LCJpYXQiOjE3OTMzNzAzOTksImp0aSI6IjRjY2IwOTNhLWI1MjAtNGQ1Yi05OGEyLWQzN2RjYTlmNGZkZiIsInNpZCI6ImQ0YjMxNzc4LTkyMmYtNDhlYS05MzRmLTM0ZGMzNTA3NzAxZiJ9.c6DJinDZywsamZzox-VEa5iafRI3Hvg_Vf1XUY-kLBQ",
  "access_expires_at": "2026-10-30T14:41:39.207291397Z",
  "refresh_token": "MRLBcLGhmVHwVJagv5M4VRz7Vu9djAjFL5dO8X_N7_g",
  "refresh_expires_at": "2026-11-29T14:26:39.206700504Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0fc48e91-9307-458d-bf50-b60afe2c7fd0",
  "session_id": "d4b31778-922f-48ea-934f-34dc3507701f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "be2cd923-cca6-4edc-9581-7e1c6ffe5a8d",
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
  "id": "89d5d4f9-ef21-427b-8123-df5e62ceb98d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:31:39.803643Z",
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
  "challenge_id": "b2615805-3c88-4238-9fea-d9978755361a",
  "expires_at": "2026-10-30T14:31:42.116059457Z",
  "resend_available_at": "2026-10-30T14:26:43.116059457Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672259956` → **200**

```json
{
  "phone": "+380672259956",
  "audience": "CLIENT",
  "code": "716335",
  "sent_at": "2026-10-30T14:26:42.118529736Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "f4f5fa72-664a-4b6f-a603-ea0cd91d7fda",
  "challenge_id": "b2615805-3c88-4238-9fea-d9978755361a",
  "otp_code": "716335"
}
```

```json
{
  "client_id": "0fc48e91-9307-458d-bf50-b60afe2c7fd0",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T14:26:42.452467949Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "45e28599-4ab2-478d-a37f-b4022f6834e0",
  "quote_id": "89d5d4f9-ef21-427b-8123-df5e62ceb98d",
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
  "correlation_id": "12feb2f6-799b-4790-bcd5-4e402e2edc96"
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
  "session_id": "6d37357a-3e42-47a5-9a7d-cbdc62e54307",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzMDMsImlhdCI6MTc5MzM3MDQwMywianRpIjoiNjZiNmU1ZjUtZjE5Yy00YjJjLTgxNmEtNWJiZDY1ODUwMWY5Iiwic2lkIjoiNmQzNzM1N2EtM2U0Mi00N2E1LTlhN2QtY2JkYzYyZTU0MzA3In0.O-AjO3WI2YvXFqvp9H5dn9MFSQwYOe32rpdAg7ezkAs",
  "access_expires_at": "2026-10-30T14:41:43.347727397Z",
  "refresh_token": "fYwE0XjaniYqC7J5djaOcDoxhj4nFHPkl4Xj2PsrB3s",
  "refresh_expires_at": "2026-10-31T02:26:43.347110355Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "0fc48e91-9307-458d-bf50-b60afe2c7fd0",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T14:26:42.452468Z",
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

`POST /api/admin/v1/client-deletions/0fc48e91-9307-458d-bf50-b60afe2c7fd0/complete` → **200**

```json
{
  "command_id": "3e6dfe02-e3d9-450f-a17b-121f6fa41f73",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "0fc48e91-9307-458d-bf50-b60afe2c7fd0",
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
  "correlation_id": "b6190a3b-9fbf-4e0a-b915-3be0f015fa8f"
}
```

Done: client 0fc48e91-9307-458d-bf50-b60afe2c7fd0 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665798193",
  "device_ref": "sandbox-19751"
}
```

```json
{
  "challenge_id": "e1cf748c-5137-41ef-8597-182368791fd1",
  "expires_at": "2026-10-30T14:31:44.575770853Z",
  "resend_available_at": "2026-10-30T14:26:45.575770853Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665798193` → **200**

```json
{
  "phone": "+380665798193",
  "audience": "CLIENT",
  "code": "910687",
  "sent_at": "2026-10-30T14:26:44.578814606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1cf748c-5137-41ef-8597-182368791fd1",
  "code": "910687",
  "device_ref": "sandbox-19751"
}
```

```json
{
  "session_id": "46476efd-68f2-4139-86af-daab74c70176",
  "subject": {
    "type": "CLIENT",
    "id": "6b56b502-d3ef-4c1c-b499-8242be7ec920"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjU2YjUwMi1kM2VmLTRjMWMtYjQ5OS04MjQyYmU3ZWM5MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzA0LCJpYXQiOjE3OTMzNzA0MDQsImp0aSI6ImY5YzkxNWE4LTdhZWEtNDAxMS04OWUzLWVjYzIzMmEwMGU3OCIsInNpZCI6IjQ2NDc2ZWZkLTY4ZjItNDEzOS04NmFmLWRhYWI3NGM3MDE3NiJ9.KU-K9q5UUntGjQe8TfH0aPNkfhhRlg6kJyeer0jBuWg",
  "access_expires_at": "2026-10-30T14:41:44.904060943Z",
  "refresh_token": "xpxnOFqmc4qP5mDYWRLfxy3E7f8iVjEBhEe4Docoh9M",
  "refresh_expires_at": "2026-11-29T14:26:44.903449912Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b56b502-d3ef-4c1c-b499-8242be7ec920",
  "session_id": "46476efd-68f2-4139-86af-daab74c70176",
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
  "session_id": "c44915a2-77df-453c-86ce-2aafa5b3da17",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzMDUsImlhdCI6MTc5MzM3MDQwNSwianRpIjoiYmI1MGRiNTktN2IxOC00ODIyLWFjNTItYmMzOTI2MzU2NTJkIiwic2lkIjoiYzQ0OTE1YTItNzdkZi00NTNjLTg2Y2UtMmFhZmE1YjNkYTE3In0.exNk1ly10-jf0zWwzq99ontjz2lAt-05izM-omL18gU",
  "access_expires_at": "2026-10-30T14:41:45.786436356Z",
  "refresh_token": "g-MDjqhFKUYkArXyLCF4djO4r-6fDwpdv_MMEKeLStI",
  "refresh_expires_at": "2026-10-31T02:26:45.785784409Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5798193&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "6b56b502-d3ef-4c1c-b499-8242be7ec920",
      "phone": "+380665798193",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T14:26:44.901484Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/6b56b502-d3ef-4c1c-b499-8242be7ec920` → **200**

```json
{
  "client": {
    "id": "6b56b502-d3ef-4c1c-b499-8242be7ec920",
    "phone": "+380665798193",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:26:44.901484Z",
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

`POST /api/admin/v1/clients/6b56b502-d3ef-4c1c-b499-8242be7ec920/block` → **400**

```json
{
  "command_id": "61096c0e-3596-4158-b164-20b6b01feb5b",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6b56b502-d3ef-4c1c-b499-8242be7ec920/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4c4a5359-7362-4056-9de7-85ab5ee13126",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/6b56b502-d3ef-4c1c-b499-8242be7ec920/block` → **200**

```json
{
  "command_id": "531893b9-0744-4bd4-92d8-60e1ec16b8ba",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "6b56b502-d3ef-4c1c-b499-8242be7ec920",
  "phone": "+380665798193",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T14:26:44.901484Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T14:26:47.047848Z",
    "by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
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
  "correlation_id": "cb52485c-0c65-444e-a782-860ef73ce965"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665798193",
  "device_ref": "sandbox-18857"
}
```

```json
{
  "challenge_id": "e38f7d66-789e-4dae-b122-fb4ec31b8cdd",
  "expires_at": "2026-10-30T14:31:49.658352913Z",
  "resend_available_at": "2026-10-30T14:26:50.658352913Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665798193` → **200**

```json
{
  "phone": "+380665798193",
  "audience": "CLIENT",
  "code": "703193",
  "sent_at": "2026-10-30T14:26:49.66125529Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "e38f7d66-789e-4dae-b122-fb4ec31b8cdd",
  "code": "703193",
  "device_ref": "sandbox-18857"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "1651a56b-1ff2-449a-9e64-485ca38fff35"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/6b56b502-d3ef-4c1c-b499-8242be7ec920` → **200**

```json
{
  "client": {
    "id": "6b56b502-d3ef-4c1c-b499-8242be7ec920",
    "phone": "+380665798193",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T14:26:44.901484Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T14:26:47.047848Z",
      "by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
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

`POST /api/admin/v1/clients/6b56b502-d3ef-4c1c-b499-8242be7ec920/unblock` → **200**

```json
{
  "command_id": "c445e720-264c-4ba8-b33a-82f3c7691355",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "6b56b502-d3ef-4c1c-b499-8242be7ec920",
  "phone": "+380665798193",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T14:26:44.901484Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665798193",
  "device_ref": "sandbox-13544"
}
```

```json
{
  "challenge_id": "c15ab631-c213-4825-857b-59a9da862366",
  "expires_at": "2026-10-30T14:31:52.975781532Z",
  "resend_available_at": "2026-10-30T14:26:53.975781532Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665798193` → **200**

```json
{
  "phone": "+380665798193",
  "audience": "CLIENT",
  "code": "738309",
  "sent_at": "2026-10-30T14:26:52.978804365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c15ab631-c213-4825-857b-59a9da862366",
  "code": "738309",
  "device_ref": "sandbox-13544"
}
```

```json
{
  "session_id": "777b00a0-7048-4b71-9e77-60fc071974df",
  "subject": {
    "type": "CLIENT",
    "id": "6b56b502-d3ef-4c1c-b499-8242be7ec920"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjU2YjUwMi1kM2VmLTRjMWMtYjQ5OS04MjQyYmU3ZWM5MjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzEzLCJpYXQiOjE3OTMzNzA0MTMsImp0aSI6IjY4NzgzZGZjLTljNTUtNDVhNi1hNGNlLTY4Y2RlNTRlMThiOCIsInNpZCI6Ijc3N2IwMGEwLTcwNDgtNGI3MS05ZTc3LTYwZmMwNzE5NzRkZiJ9.2n4CTGzd5JDKxQhFV5stc4g14_Sem3hG0MFIqKx3dbY",
  "access_expires_at": "2026-10-30T14:41:53.302351572Z",
  "refresh_token": "BFNvUAwvQ9w0FXJ69AjaSc0i7zFbL40ALwRHhrh7OmE",
  "refresh_expires_at": "2026-11-29T14:26:53.301732857Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b56b502-d3ef-4c1c-b499-8242be7ec920",
  "session_id": "777b00a0-7048-4b71-9e77-60fc071974df",
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
  "phone": "+380666563345",
  "device_ref": "sandbox-22447"
}
```

```json
{
  "challenge_id": "cf07144d-4735-44f0-bc50-2aa287039c74",
  "expires_at": "2026-10-30T14:31:53.904250752Z",
  "resend_available_at": "2026-10-30T14:26:54.904250752Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666563345` → **200**

```json
{
  "phone": "+380666563345",
  "audience": "CLIENT",
  "code": "000475",
  "sent_at": "2026-10-30T14:26:53.908147801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf07144d-4735-44f0-bc50-2aa287039c74",
  "code": "000475",
  "device_ref": "sandbox-22447"
}
```

```json
{
  "session_id": "74de8764-e02a-4699-bfd5-6452ff3a09e8",
  "subject": {
    "type": "CLIENT",
    "id": "f07beba8-69ef-4d50-87c3-d9f88b8ec8be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDdiZWJhOC02OWVmLTRkNTAtODdjMy1kOWY4OGI4ZWM4YmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzE0LCJpYXQiOjE3OTMzNzA0MTQsImp0aSI6ImJhMmMyYzU1LTljNzgtNDY3NS04NDBkLWNmOTY5ZTgyYTZkYyIsInNpZCI6Ijc0ZGU4NzY0LWUwMmEtNDY5OS1iZmQ1LTY0NTJmZjNhMDllOCJ9.f-NfYsyInVfblDv-0TtbPNaLwlSUZshd9GtAUz-YKpw",
  "access_expires_at": "2026-10-30T14:41:54.237605783Z",
  "refresh_token": "3asFpBGR1B2tMbRIThoanNTeq3a2mF_BPYTviYtkVXo",
  "refresh_expires_at": "2026-11-29T14:26:54.237075993Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f5bd21a-0eaf-4048-80fc-d19c675df773",
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
  "id": "594adb1a-dcf7-40d9-ab43-0a87cb58f9e9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:31:54.551991Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 73ed0a88-70f0-46e3-90ac-e6289dcd6871) → **201**

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
  "session_id": "fc54887e-966b-427e-a41b-5a9d1bde61fc",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzMTUsImlhdCI6MTc5MzM3MDQxNSwianRpIjoiM2JlY2Q0ZTQtMDg2Yy00NjU3LWIzZWUtZjRmMDAzMjdlMjE2Iiwic2lkIjoiZmM1NDg4N2UtOTY2Yi00MjdlLWE0MWItNWE5ZDFiZGU2MWZjIn0.-zB7ajcIto5Iw_H7fDHv5ieeliWhW8eoSby2tNz-CuE",
  "access_expires_at": "2026-10-30T14:41:55.196850591Z",
  "refresh_token": "9k_qd3wztyN2RBNyUSRUSe-or0GjoyQYOBfIsAQACYM",
  "refresh_expires_at": "2026-10-31T02:26:55.195662553Z",
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
  "session_id": "12e2a86d-f97e-4736-8477-a07efbcffd06",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzMTUsImlhdCI6MTc5MzM3MDQxNSwianRpIjoiNDBkZTU0ZmMtZDUzNi00YzZjLWEwOGItNDc4NzY5NjlhZGIzIiwic2lkIjoiMTJlMmE4NmQtZjk3ZS00NzM2LTg0NzctYTA3ZWZiY2ZmZDA2In0.CyyC-e3sa2F2U5KuMj-imuHMY9-O6lfUbKienYCtpyE",
  "access_expires_at": "2026-10-30T14:41:55.800942847Z",
  "refresh_token": "M_a-amk9q9yTJeN2IdCkTIMypxan5M3xEg645s0xtd8",
  "refresh_expires_at": "2026-10-31T02:26:55.800375949Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d049b45d-ff5c-4772-9ed7-9b91671fccfe/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:26:54.86844Z",
      "actor": {
        "type": "CLIENT",
        "id": "f07beba8-69ef-4d50-87c3-d9f88b8ec8be",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe",
        "quote_id": "594adb1a-dcf7-40d9-ab43-0a87cb58f9e9",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "73ed0a88-70f0-46e3-90ac-e6289dcd6871"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:26:54.870372Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe",
        "attempt_id": "134de3e8-ea47-4962-888c-ded15128a249",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "73ed0a88-70f0-46e3-90ac-e6289dcd6871"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T14:26:54.877811Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe",
        "attempt_id": "134de3e8-ea47-4962-888c-ded15128a249"
      },
      "correlation_id": "73ed0a88-70f0-46e3-90ac-e6289dcd6871"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "134de3e8-ea47-4962-888c-ded15128a249",
        "generation": 1,
        "started_at": "2026-10-30T14:26:54.869419Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T14:26:54.877811Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T14:26:54.871119Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/73ed0a88-70f0-46e3-90ac-e6289dcd6871` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe:0",
      "order_id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe",
      "at": "2026-10-30T14:26:54.86844Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe:1",
      "order_id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe",
      "at": "2026-10-30T14:26:54.870372Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe:2",
      "order_id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe",
      "at": "2026-10-30T14:26:54.877811Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/1e46974b-c033-4375-a7b2-ec208bf0e019` → **200**

```json
{
  "found": []
}
```

Done: request 73ed0a88-70f0-46e3-90ac-e6289dcd6871 — order d049b45d-ff5c-4772-9ed7-9b91671fccfe found by its id.

`GET /api/rider/v1/orders/d049b45d-ff5c-4772-9ed7-9b91671fccfe` → **200**

```json
{
  "id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f07beba8-69ef-4d50-87c3-d9f88b8ec8be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:26:54.867796Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d049b45d-ff5c-4772-9ed7-9b91671fccfe/cancel` → **200**

```json
{
  "command_id": "1ba8952d-db27-4552-8490-63f0eea99fc4",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d049b45d-ff5c-4772-9ed7-9b91671fccfe",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f07beba8-69ef-4d50-87c3-d9f88b8ec8be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:26:54.867796Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "phone": "+380630260185",
  "device_ref": "sandbox-20493"
}
```

```json
{
  "challenge_id": "aa411fb2-805d-468c-87a1-d497152f9f73",
  "expires_at": "2026-10-30T14:31:57.668545468Z",
  "resend_available_at": "2026-10-30T14:26:58.668545468Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630260185` → **200**

```json
{
  "phone": "+380630260185",
  "audience": "CLIENT",
  "code": "624270",
  "sent_at": "2026-10-30T14:26:57.671403305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa411fb2-805d-468c-87a1-d497152f9f73",
  "code": "624270",
  "device_ref": "sandbox-20493"
}
```

```json
{
  "session_id": "9e1df155-894b-4a31-9d4e-954069c371bd",
  "subject": {
    "type": "CLIENT",
    "id": "15d59707-ebd8-46b0-ad26-5ce206685789"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWQ1OTcwNy1lYmQ4LTQ2YjAtYWQyNi01Y2UyMDY2ODU3ODkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzE3LCJpYXQiOjE3OTMzNzA0MTcsImp0aSI6ImZmYTAyZTVkLTc4NTgtNDM5MC1hZDg4LWYzNWViMWExNWU5MSIsInNpZCI6IjllMWRmMTU1LTg5NGItNGEzMS05ZDRlLTk1NDA2OWMzNzFiZCJ9.BkvQd-iJrKOs34cZWlYulJLKBRtdFbgVncoQ2yPLumA",
  "access_expires_at": "2026-10-30T14:41:57.98977192Z",
  "refresh_token": "EMY6rvcFZWoW29bY9cai_8n56nr5sONr_Ojd2uQNtGo",
  "refresh_expires_at": "2026-11-29T14:26:57.989210552Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "32351c54-8854-462f-835e-f3b311a1ea69",
  "expires_at": "2026-10-30T14:32:00.289918145Z",
  "resend_available_at": "2026-10-30T14:27:01.289918145Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630260185` → **200**

```json
{
  "phone": "+380630260185",
  "audience": "CLIENT",
  "code": "341236",
  "sent_at": "2026-10-30T14:27:00.293115083Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "92237edf-89a2-4e79-922c-00f8bdbaca23",
  "challenge_id": "32351c54-8854-462f-835e-f3b311a1ea69",
  "otp_code": "341236"
}
```

```json
{
  "id": "705ede8d-4448-4c01-a84e-bf62cb641c15",
  "state": "PENDING",
  "created_at": "2026-10-30T14:27:00.647016Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/705ede8d-4448-4c01-a84e-bf62cb641c15` → **200**

```json
{
  "id": "705ede8d-4448-4c01-a84e-bf62cb641c15",
  "state": "PENDING",
  "created_at": "2026-10-30T14:27:00.647016Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/705ede8d-4448-4c01-a84e-bf62cb641c15` → **200**

```json
{
  "id": "705ede8d-4448-4c01-a84e-bf62cb641c15",
  "state": "PENDING",
  "created_at": "2026-10-30T14:27:00.647016Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/705ede8d-4448-4c01-a84e-bf62cb641c15` → **200**

```json
{
  "id": "705ede8d-4448-4c01-a84e-bf62cb641c15",
  "state": "PENDING",
  "created_at": "2026-10-30T14:27:00.647016Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/705ede8d-4448-4c01-a84e-bf62cb641c15` → **200**

```json
{
  "id": "705ede8d-4448-4c01-a84e-bf62cb641c15",
  "state": "READY",
  "created_at": "2026-10-30T14:27:00.647016Z",
  "ready_at": "2026-10-30T14:27:03.837027Z",
  "expires_at": "2026-11-06T14:27:03.837027Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/705ede8d-4448-4c01-a84e-bf62cb641c15/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636632439",
  "device_ref": "sandbox-23650"
}
```

```json
{
  "challenge_id": "c7a5eaba-5e38-4ebc-b83a-07a6398dd88f",
  "expires_at": "2026-10-30T14:32:05.190751883Z",
  "resend_available_at": "2026-10-30T14:27:06.190751883Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636632439` → **200**

```json
{
  "phone": "+380636632439",
  "audience": "CLIENT",
  "code": "012901",
  "sent_at": "2026-10-30T14:27:05.193638087Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7a5eaba-5e38-4ebc-b83a-07a6398dd88f",
  "code": "012901",
  "device_ref": "sandbox-23650"
}
```

```json
{
  "session_id": "f002f582-50f4-4cac-8257-4737ad09fac7",
  "subject": {
    "type": "CLIENT",
    "id": "a0df3e85-5eb7-4f39-9a9a-35dd9c7364f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMGRmM2U4NS01ZWI3LTRmMzktOWE5YS0zNWRkOWM3MzY0ZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzI1LCJpYXQiOjE3OTMzNzA0MjUsImp0aSI6ImUxYWZlMmMzLWQ4YWEtNDI3Yi1iNDJjLTI2ZTE2YmMxNzBhZCIsInNpZCI6ImYwMDJmNTgyLTUwZjQtNGNhYy04MjU3LTQ3MzdhZDA5ZmFjNyJ9.hcy9xD_18MJUsC0g3lrkd56ssLl3xcKboEilZ1UEDJs",
  "access_expires_at": "2026-10-30T14:42:05.515708467Z",
  "refresh_token": "jdI0oD1VLkhcKGrBTi3Dp8vckrP9wSlbNK10EGD9jqo",
  "refresh_expires_at": "2026-11-29T14:27:05.515180933Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/705ede8d-4448-4c01-a84e-bf62cb641c15/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/705ede8d-4448-4c01-a84e-bf62cb641c15/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b7b9e46e-575a-4add-b483-6afb9a96e95c"
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
  "session_id": "303c8b5d-aa07-41fa-953e-97cd34e52f10",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzMjYsImlhdCI6MTc5MzM3MDQyNiwianRpIjoiYTAwZjYyNDMtMWY3Zi00NTc2LWI0MjMtOGE5NjVmOGZmYzM0Iiwic2lkIjoiMzAzYzhiNWQtYWEwNy00MWZhLTk1M2UtOTdjZDM0ZTUyZjEwIn0.WrAW8fU4rXE0Gcb27h8pp9R4Wx3zVPp7I5tefMy2Pzo",
  "access_expires_at": "2026-10-30T14:42:06.415829631Z",
  "refresh_token": "NRO5DHB1rmnFaV23PEUS582059JIVFtbU1zW0thblTU",
  "refresh_expires_at": "2026-10-31T02:27:06.415270388Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "15d59707-ebd8-46b0-ad26-5ce206685789",
  "session_id": "9e1df155-894b-4a31-9d4e-954069c371bd",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/15d59707-ebd8-46b0-ad26-5ce206685789/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "705ede8d-4448-4c01-a84e-bf62cb641c15",
      "state": "READY",
      "created_at": "2026-10-30T14:27:00.647016Z",
      "ready_at": "2026-10-30T14:27:03.837027Z",
      "expires_at": "2026-11-06T14:27:03.837027Z",
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
  "device_ref": "sandbox-28613"
}
```

```json
{
  "challenge_id": "27730626-dec7-47be-acb1-36a30ba8a1ab",
  "expires_at": "2026-10-30T14:32:07.319477966Z",
  "resend_available_at": "2026-10-30T14:27:08.319477966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "195571",
  "sent_at": "2026-10-30T14:27:07.322195821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27730626-dec7-47be-acb1-36a30ba8a1ab",
  "code": "195571",
  "device_ref": "sandbox-28613"
}
```

```json
{
  "session_id": "2ba9162e-018a-4510-ac54-3e82437e7ed0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTMyNywiaWF0IjoxNzkzMzcwNDI3LCJqdGkiOiI4NDIzOTRhNy1lYjFhLTQxOTItYTFhMi1lZmUzMzUzNWUyN2UiLCJzaWQiOiIyYmE5MTYyZS0wMThhLTQ1MTAtYWM1NC0zZTgyNDM3ZTdlZDAifQ.DBY0s_S4CsXMAJVN8e1nIUp2fZcg3kzD4LOXizSe0As",
  "access_expires_at": "2026-10-30T14:42:07.644179528Z",
  "refresh_token": "Oi6_8Vqy-KM-K-VnHl4HSxBgYbj8ZE_Pb-J0gmZx3jI",
  "refresh_expires_at": "2026-11-29T14:27:07.643553901Z",
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
  "device_ref": "sandbox-23421"
}
```

```json
{
  "challenge_id": "d9dc81ea-a037-4b4d-b858-de5d81c2b7bd",
  "expires_at": "2026-10-30T14:32:08.238441043Z",
  "resend_available_at": "2026-10-30T14:27:09.238441043Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "612886",
  "sent_at": "2026-10-30T14:27:08.241372365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9dc81ea-a037-4b4d-b858-de5d81c2b7bd",
  "code": "612886",
  "device_ref": "sandbox-23421"
}
```

```json
{
  "session_id": "1be65498-fe5c-49b0-9241-51ca03b462d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTMyOCwiaWF0IjoxNzkzMzcwNDI4LCJqdGkiOiIyYmI1MTRhMS1mNTUyLTQzZDgtOTFlYS04OWUxN2EzODkwMTkiLCJzaWQiOiIxYmU2NTQ5OC1mZTVjLTQ5YjAtOTI0MS01MWNhMDNiNDYyZDEifQ.Lr5zZ6xKJZf5_dpzmMaFNT1gRTNpU6IDp1hqlDyM0c0",
  "access_expires_at": "2026-10-30T14:42:08.563968109Z",
  "refresh_token": "ZVsweQjwuG7TLESzJvBgY3wgZkTm1Ai-EcbQYiovtec",
  "refresh_expires_at": "2026-11-29T14:27:08.563385451Z",
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
  "command_id": "b7b1d3a8-8f9a-493e-9e56-bc1621a17c09",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:27:09Z",
    "sequence": 1793370429182
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6971626-1746-42e6-9372-86be3f7c2b38",
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
  "last_heartbeat_at": "2026-10-30T14:27:09.202122Z",
  "last_location_at": "2026-10-30T14:27:09.202122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-27627"
}
```

```json
{
  "challenge_id": "63cf215b-feb7-40ca-a5d9-582fd30f04d2",
  "expires_at": "2026-10-30T14:32:09.499838066Z",
  "resend_available_at": "2026-10-30T14:27:10.499838066Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "735383",
  "sent_at": "2026-10-30T14:27:09.502644514Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "63cf215b-feb7-40ca-a5d9-582fd30f04d2",
  "code": "735383",
  "device_ref": "sandbox-27627"
}
```

```json
{
  "session_id": "8cbd8530-1994-4f57-98f9-8fb1dfa4b1de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTMyOSwiaWF0IjoxNzkzMzcwNDI5LCJqdGkiOiJjOWU1YjkwNS1hMmUzLTQyMzMtOWU5Ny0yYzZjY2Q0Mzg0ZWQiLCJzaWQiOiI4Y2JkODUzMC0xOTk0LTRmNTctOThmOS04ZmIxZGZhNGIxZGUifQ.Uk7V-zjkzvPe8fMbU3d6JkjYM1lMmzjUPFoj5Upe2Sg",
  "access_expires_at": "2026-10-30T14:42:09.835660314Z",
  "refresh_token": "Hc9e4fzCqTQQNFKL_K-KPnj_ontwbRbXiy1rGQrNTSg",
  "refresh_expires_at": "2026-11-29T14:27:09.835086121Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1ca2fa00-bd3d-45b8-a1a4-318c83670612",
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
  "last_heartbeat_at": "2026-10-30T14:23:10.464105Z",
  "last_location_at": "2026-10-30T14:23:10.464105Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1ca2fa00-bd3d-45b8-a1a4-318c83670612/handover` → **200**

```json
{
  "command_id": "1e8835cc-ebde-4590-b0fc-b100c75ebe07",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1ca2fa00-bd3d-45b8-a1a4-318c83670612",
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
  "last_heartbeat_at": "2026-10-30T14:23:10.464105Z",
  "last_location_at": "2026-10-30T14:23:10.464105Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/1ca2fa00-bd3d-45b8-a1a4-318c83670612/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:27:10Z",
    "sequence": 1793370430781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "1ca2fa00-bd3d-45b8-a1a4-318c83670612",
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
  "last_heartbeat_at": "2026-10-30T14:27:10.801224Z",
  "last_location_at": "2026-10-30T14:27:10.801224Z",
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
  "session_id": "deacaffd-2cbf-4344-b28e-568419c86537",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzMzEsImlhdCI6MTc5MzM3MDQzMSwianRpIjoiODI2NjFjNDMtN2I2NS00N2ViLThiZDUtMmFmNGFjZTkwMDA5Iiwic2lkIjoiZGVhY2FmZmQtMmNiZi00MzQ0LWIyOGUtNTY4NDE5Yzg2NTM3In0.H3x0ntRgTLZFY6gTWDxHK_cYwT5eBGVZXOaOnqMFMuc",
  "access_expires_at": "2026-10-30T14:42:11.399257576Z",
  "refresh_token": "V-WZVqTo2w-qkUxh0BZFK1E2kpC7WumvI_iuAsE84BE",
  "refresh_expires_at": "2026-10-31T02:27:11.398619955Z",
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
  "session_id": "c490ffa0-704e-4108-a358-72cc045ff88e",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzMzEsImlhdCI6MTc5MzM3MDQzMSwianRpIjoiZjgyMjVhMTAtN2ZmMC00YjVmLTljNzYtNGY4OWFmZTRkYTJhIiwic2lkIjoiYzQ5MGZmYTAtNzA0ZS00MTA4LWEzNTgtNzJjYzA0NWZmODhlIn0.YukD2eepi3xmZU8_LtrjVXbDffIkWHXVfsoeN_I-2UA",
  "access_expires_at": "2026-10-30T14:42:11.980915361Z",
  "refresh_token": "D18-bquBxylXsBBXxKKRgOtDI5VfOMflRGQjcMPzOHk",
  "refresh_expires_at": "2026-10-31T02:27:11.980363634Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680676884",
  "device_ref": "sandbox-24821"
}
```

```json
{
  "challenge_id": "777d0506-203b-4072-a387-724efe104fa3",
  "expires_at": "2026-10-30T14:32:12.273782601Z",
  "resend_available_at": "2026-10-30T14:27:13.273782601Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680676884` → **200**

```json
{
  "phone": "+380680676884",
  "audience": "CLIENT",
  "code": "762604",
  "sent_at": "2026-10-30T14:27:12.27676155Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "777d0506-203b-4072-a387-724efe104fa3",
  "code": "762604",
  "device_ref": "sandbox-24821"
}
```

```json
{
  "session_id": "12c94967-4c2c-42b7-870c-c64637031c23",
  "subject": {
    "type": "CLIENT",
    "id": "df22c5eb-ca05-4864-92e7-d8543f7ad172"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjIyYzVlYi1jYTA1LTQ4NjQtOTJlNy1kODU0M2Y3YWQxNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzMyLCJpYXQiOjE3OTMzNzA0MzIsImp0aSI6ImU1OGI3ZGEzLTQ3N2UtNDYwZC05MjkyLTEzNDM3YjgxNGY3ZSIsInNpZCI6IjEyYzk0OTY3LTRjMmMtNDJiNy04NzBjLWM2NDYzNzAzMWMyMyJ9.O-ohdNSHgxs0HK44vVxqjL-v6d1ESZ9LCFULh9P2554",
  "access_expires_at": "2026-10-30T14:42:12.606359278Z",
  "refresh_token": "Et62q3D6hrMPnH7Thz0pB-su1ZEQvc42dN8vFFuCNYQ",
  "refresh_expires_at": "2026-11-29T14:27:12.605758529Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5b76824e-b87f-4b45-854a-211601b782b8",
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
  "id": "6b477849-29a3-480b-a1ad-64eb7631f709",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:32:12.904766Z",
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
  "command_id": "57c9fa59-9a50-4e40-a5c5-d03c24ad52a6",
  "quote_id": "6b477849-29a3-480b-a1ad-64eb7631f709",
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
  "id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "df22c5eb-ca05-4864-92e7-d8543f7ad172",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:13.211403Z",
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
    "id": "c6884fc2-4606-442e-9c1d-3151041d7534",
    "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
    "expires_at": "2026-10-30T14:27:28.214733Z",
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

`POST /api/driver/v1/offers/c6884fc2-4606-442e-9c1d-3151041d7534/reject` → **204**

```json
{
  "command_id": "e57bceae-9195-435e-accf-18d345e70640"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "208d0ac7-fa29-45a7-94e0-fd53ccf5e0fd",
    "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
    "expires_at": "2026-10-30T14:27:28.836865Z",
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

`POST /api/driver/v1/offers/208d0ac7-fa29-45a7-94e0-fd53ccf5e0fd/accept` → **200**

```json
{
  "command_id": "5bc25666-6abb-4952-9d4b-49a923e73eb1"
}
```

```json
{
  "id": "f175f983-1e6c-4637-9c42-4c476a5fad62",
  "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "49bdd956-83d9-4029-a99a-69aff3e299da",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/a9db3c63-9eac-4af4-889e-451a1e33688b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:27:13.211948Z",
      "actor": {
        "type": "CLIENT",
        "id": "df22c5eb-ca05-4864-92e7-d8543f7ad172",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
        "quote_id": "6b477849-29a3-480b-a1ad-64eb7631f709",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "70c3f58a-2e6a-45d8-ac6e-0f171c708498"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:27:13.213924Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
        "attempt_id": "1c6cee49-02b9-41b3-8f58-c22a78231664",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "70c3f58a-2e6a-45d8-ac6e-0f171c708498"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:27:13.217966Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c6884fc2-4606-442e-9c1d-3151041d7534",
        "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "70c3f58a-2e6a-45d8-ac6e-0f171c708498"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T14:27:13.835897Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c6884fc2-4606-442e-9c1d-3151041d7534",
        "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b"
      },
      "correlation_id": "9a89b6d8-90f2-44db-b2e1-63190923987d"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order a9db3c63-9eac-4af4-889e-451a1e33688b — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/a9db3c63-9eac-4af4-889e-451a1e33688b` → **200**

```json
{
  "id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "df22c5eb-ca05-4864-92e7-d8543f7ad172",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "f175f983-1e6c-4637-9c42-4c476a5fad62",
    "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "49bdd956-83d9-4029-a99a-69aff3e299da",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T14:27:13.211403Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a9db3c63-9eac-4af4-889e-451a1e33688b/cancel` → **200**

```json
{
  "command_id": "7d353c87-2d4f-4b92-9231-9b06878fbc94",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "df22c5eb-ca05-4864-92e7-d8543f7ad172",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "f175f983-1e6c-4637-9c42-4c476a5fad62",
    "order_id": "a9db3c63-9eac-4af4-889e-451a1e33688b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "49bdd956-83d9-4029-a99a-69aff3e299da",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:27:13.211403Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "session_id": "d6971626-1746-42e6-9372-86be3f7c2b38",
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
  "last_heartbeat_at": "2026-10-30T14:27:09.202122Z",
  "last_location_at": "2026-10-30T14:27:09.202122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6971626-1746-42e6-9372-86be3f7c2b38/close` → **200**

```json
{
  "command_id": "80ea9eb3-4558-4e3a-891d-090c91e60892",
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
  "session_id": "1ca2fa00-bd3d-45b8-a1a4-318c83670612",
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
  "last_heartbeat_at": "2026-10-30T14:27:10.801224Z",
  "last_location_at": "2026-10-30T14:27:10.801224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1ca2fa00-bd3d-45b8-a1a4-318c83670612/close` → **200**

```json
{
  "command_id": "d9cd9493-6097-4600-8f31-42da8e40c2a0",
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

# Scenario: document-at-rest

## Oleh uploads a scan of his licence

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-1417"
}
```

```json
{
  "challenge_id": "466a4668-a888-4e32-8b64-836dbba8cc9c",
  "expires_at": "2026-10-30T14:32:16.721216194Z",
  "resend_available_at": "2026-10-30T14:27:17.721216194Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "138421",
  "sent_at": "2026-10-30T14:27:16.723912708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "466a4668-a888-4e32-8b64-836dbba8cc9c",
  "code": "138421",
  "device_ref": "sandbox-1417"
}
```

```json
{
  "session_id": "a3c2fc16-678b-42a5-bd3f-71d8989a6f1c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTMzNywiaWF0IjoxNzkzMzcwNDM3LCJqdGkiOiIzZjk3M2MyOS0wZGUzLTRlOTAtYWNlMi01OTliZDM2ODcyMTgiLCJzaWQiOiJhM2MyZmMxNi02NzhiLTQyYTUtYmQzZi03MWQ4OTg5YTZmMWMifQ.KG9uqEGtHd3TQ0Ca_L5nhbBMV5Ahu3fl3QuNm8hxRug",
  "access_expires_at": "2026-10-30T14:42:17.050026239Z",
  "refresh_token": "HFS-QxFaw2GqRAeY7wyvNY5bQTyMRLRJDUNx0SpsaA4",
  "refresh_expires_at": "2026-11-29T14:27:17.049397219Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "4611c6e6-1e8c-465b-9064-f7939f452f50",
  "content_type": "application/pdf",
  "size_bytes": 87
}
```

```json
{
  "file_id": "cb8e5f43-aec7-41a0-b76d-b249335cbadb",
  "upload_path": "/api/driver/v1/uploads/cb8e5f43-aec7-41a0-b76d-b249335cbadb",
  "expires_at": "2026-10-30T14:42:17.350940416Z",
  "max_bytes": 87
}
```

`PUT /api/driver/v1/uploads/cb8e5f43-aec7-41a0-b76d-b249335cbadb` → **200**

```json
{
  "file_id": "cb8e5f43-aec7-41a0-b76d-b249335cbadb",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 87,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/cb8e5f43-aec7-41a0-b76d-b249335cbadb`, first bytes `425a463152ef4098` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/cb8e5f43-aec7-41a0-b76d-b249335cbadb` → **200**

SHA-256 uploaded `e31281a42b38bf2989e81c29deb6cf7ae1109e24a1a1c030d703ad1601e4ff3f`, downloaded `e31281a42b38bf2989e81c29deb6cf7ae1109e24a1a1c030d703ad1601e4ff3f`.

Done: document cb8e5f43-aec7-41a0-b76d-b249335cbadb is encrypted on disk and downloads unchanged.

# Scenario: driver-states

## Only the two drivers of this scenario are online: Near about 200 m from the pickup, Far about 600 m

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4871"
}
```

```json
{
  "challenge_id": "1a63b158-dd05-48ef-aa47-c2e2bfcccdba",
  "expires_at": "2026-10-30T14:32:17.743435635Z",
  "resend_available_at": "2026-10-30T14:27:18.743435635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "216738",
  "sent_at": "2026-10-30T14:27:17.74713619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a63b158-dd05-48ef-aa47-c2e2bfcccdba",
  "code": "216738",
  "device_ref": "sandbox-4871"
}
```

```json
{
  "session_id": "cd0ae458-b109-4a37-baa6-d4cd936749dd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTMzOCwiaWF0IjoxNzkzMzcwNDM4LCJqdGkiOiI3Mzc3ODM3Zi0xNTY0LTRjZmYtYTIyYy1hOGZjODIzNDdhZGEiLCJzaWQiOiJjZDBhZTQ1OC1iMTA5LTRhMzctYmFhNi1kNGNkOTM2NzQ5ZGQifQ.cUvaPQmU44SXM7rYJTfNROw8r5twNxKFuhE8lev3wC4",
  "access_expires_at": "2026-10-30T14:42:18.082300539Z",
  "refresh_token": "GDMmPS0YKAI4-Uo8oYX1jCxXFF6p_uwbEcpdoEVdGy0",
  "refresh_expires_at": "2026-11-29T14:27:18.081670643Z",
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
  "device_ref": "sandbox-3370"
}
```

```json
{
  "challenge_id": "6a87c42a-3d5a-41b6-aa3a-d1f3328ebe32",
  "expires_at": "2026-10-30T14:32:18.680978212Z",
  "resend_available_at": "2026-10-30T14:27:19.680978212Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "989515",
  "sent_at": "2026-10-30T14:27:18.683783451Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a87c42a-3d5a-41b6-aa3a-d1f3328ebe32",
  "code": "989515",
  "device_ref": "sandbox-3370"
}
```

```json
{
  "session_id": "aa2039ae-12b4-46ec-afff-165335a3edc3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTMzOSwiaWF0IjoxNzkzMzcwNDM5LCJqdGkiOiIyYmIyMWIxNi01Yjc2LTRkZGYtYTI3MS1lMTlhODNiNTI1YzYiLCJzaWQiOiJhYTIwMzlhZS0xMmI0LTQ2ZWMtYWZmZi0xNjUzMzVhM2VkYzMifQ.650A8Z2AFpnMNdJxdGLbwZJo3MbbbmLI1OOAmLVt79A",
  "access_expires_at": "2026-10-30T14:42:19.009297991Z",
  "refresh_token": "XiIzhRs_zEs1kVsLbhh9_Jdz1PKkHRG0zvSGwFKUybw",
  "refresh_expires_at": "2026-11-29T14:27:19.008704964Z",
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
  "command_id": "a6a5077a-24c3-48c6-a1e5-cb42a07fc1a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:27:19Z",
    "sequence": 1793370439612
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
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
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-12400"
}
```

```json
{
  "challenge_id": "8b2199bd-ee31-4320-a2b3-c4cb007a01cf",
  "expires_at": "2026-10-30T14:32:19.932712816Z",
  "resend_available_at": "2026-10-30T14:27:20.932712816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "876399",
  "sent_at": "2026-10-30T14:27:19.935436458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b2199bd-ee31-4320-a2b3-c4cb007a01cf",
  "code": "876399",
  "device_ref": "sandbox-12400"
}
```

```json
{
  "session_id": "890e9b4a-f999-4d99-8940-14c4fd9d3fef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTM0MCwiaWF0IjoxNzkzMzcwNDQwLCJqdGkiOiJlZDNiNzg4MS1kYzA2LTQyMDktODAwMy1lOGMwNzMzNzNiMjkiLCJzaWQiOiI4OTBlOWI0YS1mOTk5LTRkOTktODk0MC0xNGM0ZmQ5ZDNmZWYifQ.r2AXlWRUBt78DyBokOk3z2h-q9K1W_9xJqyDI_Vmnro",
  "access_expires_at": "2026-10-30T14:42:20.26025991Z",
  "refresh_token": "U5trKtDrkUtRZUkta4zP2LkIIDF0jcbkR4w01wBJGnE",
  "refresh_expires_at": "2026-11-29T14:27:20.259684657Z",
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
  "command_id": "cf54aaa4-2a27-4b7b-a6f9-6f1f7c58011b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:27:20Z",
    "sequence": 1793370440891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dea8c99d-4f85-4063-b302-e39c53f61b2d",
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
  "last_heartbeat_at": "2026-10-30T14:27:20.910403Z",
  "last_location_at": "2026-10-30T14:27:20.910403Z",
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
  "session_id": "993a65c1-37f4-4729-a786-16e70542abda",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzNDEsImlhdCI6MTc5MzM3MDQ0MSwianRpIjoiZjgxN2IyNzctMTQ3YS00MGZmLWI1YTMtMDkxZmM4ZjQ1NGRlIiwic2lkIjoiOTkzYTY1YzEtMzdmNC00NzI5LWE3ODYtMTZlNzA1NDJhYmRhIn0.5Jy4np542gc1fERG1WdMTEX58FoGlAVoTpW4Ce_mDV0",
  "access_expires_at": "2026-10-30T14:42:21.504402412Z",
  "refresh_token": "5DIIckE6NuJraH_CQcReiNEVWgith8I6k2k5wY0JTxQ",
  "refresh_expires_at": "2026-10-31T02:27:21.503806179Z",
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
  "session_id": "34e68f7a-fdaf-4b9c-810f-d4ea04146bba",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzNDIsImlhdCI6MTc5MzM3MDQ0MiwianRpIjoiZmYzZDM5ZGQtNjU3Yy00ZDQwLThlZmMtNTVkMjRlOTkyZGRkIiwic2lkIjoiMzRlNjhmN2EtZmRhZi00YjljLTgxMGYtZDRlYTA0MTQ2YmJhIn0.zsQQB_wxv1J8JF9iobcQkalRwbFc_tShGXJFrb27Am0",
  "access_expires_at": "2026-10-30T14:42:22.093553827Z",
  "refresh_token": "CIKarj4Wyi1Ca0sP2v5nR_9lw7nAyoXEG02TsSoD1vE",
  "refresh_expires_at": "2026-10-31T02:27:22.092947546Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686174683",
  "device_ref": "sandbox-7307"
}
```

```json
{
  "challenge_id": "9a018cf3-4fba-42c7-80bb-5326f67faf52",
  "expires_at": "2026-10-30T14:32:22.391948709Z",
  "resend_available_at": "2026-10-30T14:27:23.391948709Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686174683` → **200**

```json
{
  "phone": "+380686174683",
  "audience": "CLIENT",
  "code": "858984",
  "sent_at": "2026-10-30T14:27:22.394723917Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a018cf3-4fba-42c7-80bb-5326f67faf52",
  "code": "858984",
  "device_ref": "sandbox-7307"
}
```

```json
{
  "session_id": "0b81fc95-aa5d-4ad8-b3a1-1ebc12f8961b",
  "subject": {
    "type": "CLIENT",
    "id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTBlZWQ1Yy01MmY0LTRiZGEtOWVjZS05M2NkNGI0ZTMwOTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzQyLCJpYXQiOjE3OTMzNzA0NDIsImp0aSI6IjQxOTBlOWY0LTQyNzUtNDJjYi05YzQ2LTE1NzFjNzJkYWZkNSIsInNpZCI6IjBiODFmYzk1LWFhNWQtNGFkOC1iM2ExLTFlYmMxMmY4OTYxYiJ9.PTyxRCWfeuzfT7LTAwaAy_7-N8tCzaCRHFDbKJLDVfY",
  "access_expires_at": "2026-10-30T14:42:22.722885355Z",
  "refresh_token": "eI-SJilsjnwYgDCm3ps80vLxK_X_p1y5zsNzHvKMSEQ",
  "refresh_expires_at": "2026-11-29T14:27:22.722285004Z",
  "account_created": true
}
```

## E2: Near has the offer and pauses: the offer is revoked and Far gets the order at once

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ed7fe116-a7b4-4cc3-9224-ff6db7384096",
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
  "id": "21c6d0fd-dbce-4b89-a9f8-91fb80311e31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:32:23.030078Z",
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
  "command_id": "4f5e8360-eaec-497a-9f59-7726a2f37a2b",
  "quote_id": "21c6d0fd-dbce-4b89-a9f8-91fb80311e31",
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
  "id": "d55e2a79-5c90-4c74-82a7-34055393a091",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:23.34564Z",
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
    "id": "bbb709c3-d90a-41b5-9aa5-4a1831aaaa52",
    "order_id": "d55e2a79-5c90-4c74-82a7-34055393a091",
    "expires_at": "2026-10-30T14:27:38.349442Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/pause` → **200**

```json
{
  "command_id": "ef751861-c053-43f7-a0ac-e83ca16a5c6b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/offers/bbb709c3-d90a-41b5-9aa5-4a1831aaaa52/accept` → **409**

```json
{
  "command_id": "3a44511c-dd1e-40e7-9082-38cac8bbbcfe"
}
```

```json
{
  "instance": "/api/driver/v1/offers/bbb709c3-d90a-41b5-9aa5-4a1831aaaa52/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "4297c0b7-a541-423a-b098-31d59d32e257"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "9f963e72-c87d-42b5-ad84-e62b39b0b078",
    "order_id": "d55e2a79-5c90-4c74-82a7-34055393a091",
    "expires_at": "2026-10-30T14:27:39.30214Z",
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

`POST /api/driver/v1/offers/9f963e72-c87d-42b5-ad84-e62b39b0b078/reject` → **204**

```json
{
  "command_id": "888409f1-10de-447a-8361-6e20571198a7"
}
```

`GET /api/operator/v1/orders/d55e2a79-5c90-4c74-82a7-34055393a091/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:27:23.346332Z",
      "actor": {
        "type": "CLIENT",
        "id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d55e2a79-5c90-4c74-82a7-34055393a091",
        "quote_id": "21c6d0fd-dbce-4b89-a9f8-91fb80311e31",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f1522349-ea85-4204-984a-d16ec4268ee7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:27:23.348568Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d55e2a79-5c90-4c74-82a7-34055393a091",
        "attempt_id": "616ccd3f-68a6-414e-a6db-11226dd70826",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f1522349-ea85-4204-984a-d16ec4268ee7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:27:23.356431Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bbb709c3-d90a-41b5-9aa5-4a1831aaaa52",
        "order_id": "d55e2a79-5c90-4c74-82a7-34055393a091",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "f1522349-ea85-4204-984a-d16ec4268ee7"
    },
    {
      "sequence": 3,
      "type": "OfferRevoked",
      "occurred_at": "2026-10-30T14:27:24.301327Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": "DRIVER_PAUSED",
      "details": {
        "reason": "DRIVER_PAUSED",
        "offer_id": "bbb709c3-d90a-41b5-9aa5-4a1831aaaa52",
        "order_id": "d55e2a79-5c90-4c74-82a7-34055393a091",
        "driver_id": "5a000000-0000-4000-8000-000000000401"
      },
      "correlation_id": "cfa81569-c0eb-41a2-b2ae-29df094166e2"
    },
```

`GET /api/operator/v1/orders/d55e2a79-5c90-4c74-82a7-34055393a091` → **200**

```json
{
  "id": "d55e2a79-5c90-4c74-82a7-34055393a091",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:23.34564Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d55e2a79-5c90-4c74-82a7-34055393a091/cancel` → **200**

```json
{
  "command_id": "7743748f-8681-4337-8aa3-139c5160d72a",
  "expected_version": 6,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d55e2a79-5c90-4c74-82a7-34055393a091",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 7,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:23.34564Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

E2: offer bbb709c3-d90a-41b5-9aa5-4a1831aaaa52 revoked by the pause, the late accept got OFFER_REVOKED, Far had the order next.

## E5: pause and accept sent at the same moment, five rounds; Far is offline so each order goes to Near

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dea8c99d-4f85-4063-b302-e39c53f61b2d",
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
  "last_heartbeat_at": "2026-10-30T14:27:20.910403Z",
  "last_location_at": "2026-10-30T14:27:20.910403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dea8c99d-4f85-4063-b302-e39c53f61b2d/close` → **200**

```json
{
  "command_id": "6fa80b5e-6947-4a62-82c1-85a15b64768c",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/resume` → **200**

```json
{
  "command_id": "83c713f3-1097-407b-b024-87399f475da7",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0e27eae6-301b-44f4-9ff3-f6a91fd0f435",
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
  "id": "056d5270-b94e-4a50-91b9-0f7fd7a0176e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:32:27.455539Z",
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
  "command_id": "fef8ae20-72bf-4bca-884c-d752068d922e",
  "quote_id": "056d5270-b94e-4a50-91b9-0f7fd7a0176e",
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
  "id": "b106eb44-f8d7-43af-a694-6ea105a275a5",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:27.779362Z",
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
    "id": "6027b046-dc3c-4feb-a832-55536eada08d",
    "order_id": "b106eb44-f8d7-43af-a694-6ea105a275a5",
    "expires_at": "2026-10-30T14:27:42.783029Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 1, at the same moment:

`POST /api/driver/v1/offers/6027b046-dc3c-4feb-a832-55536eada08d/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/6027b046-dc3c-4feb-a832-55536eada08d/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "5981bb01-4a9f-4237-bb16-fddf13fffaa6"
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 1: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/b106eb44-f8d7-43af-a694-6ea105a275a5` → **200**

```json
{
  "id": "b106eb44-f8d7-43af-a694-6ea105a275a5",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:27.779362Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b106eb44-f8d7-43af-a694-6ea105a275a5` → **200**

```json
{
  "id": "b106eb44-f8d7-43af-a694-6ea105a275a5",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:27.779362Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b106eb44-f8d7-43af-a694-6ea105a275a5/cancel` → **200**

```json
{
  "command_id": "07bd56a3-7e38-4cb0-b459-d92ee4108b92",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b106eb44-f8d7-43af-a694-6ea105a275a5",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:27.779362Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 3,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/resume` → **200**

```json
{
  "command_id": "624bd56d-e5ed-4c17-9ffc-84bdadb70916",
  "expected_version": 3
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9f0dea99-4cd9-4464-9c5a-d76367172019",
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
  "id": "7c09b548-22b0-4e66-9696-9f44762842f8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:32:30.499414Z",
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
  "command_id": "73bb03e8-c3a2-4f69-b410-57dd30369fbf",
  "quote_id": "7c09b548-22b0-4e66-9696-9f44762842f8",
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
  "id": "5007dd07-7b0e-49f2-99bf-f7dbb57af578",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:30.815626Z",
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
    "id": "af6dfa02-e998-4ae0-964f-ad26bd295241",
    "order_id": "5007dd07-7b0e-49f2-99bf-f7dbb57af578",
    "expires_at": "2026-10-30T14:27:45.819229Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 4,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 2, at the same moment:

`POST /api/driver/v1/offers/af6dfa02-e998-4ae0-964f-ad26bd295241/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/af6dfa02-e998-4ae0-964f-ad26bd295241/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "730c7e8d-549e-44dc-b726-f6550a06ff20"
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

Round 2: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/5007dd07-7b0e-49f2-99bf-f7dbb57af578` → **200**

```json
{
  "id": "5007dd07-7b0e-49f2-99bf-f7dbb57af578",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:30.815626Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5007dd07-7b0e-49f2-99bf-f7dbb57af578` → **200**

```json
{
  "id": "5007dd07-7b0e-49f2-99bf-f7dbb57af578",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:30.815626Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5007dd07-7b0e-49f2-99bf-f7dbb57af578/cancel` → **200**

```json
{
  "command_id": "d1cbbdf7-eef1-4de2-9093-18f5fd894b45",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5007dd07-7b0e-49f2-99bf-f7dbb57af578",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:30.815626Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 5,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING"
  ]
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/resume` → **200**

```json
{
  "command_id": "b12053a5-023e-461a-ae33-1a3e20508533",
  "expected_version": 5
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9ee54f10-2ddd-4771-aa71-536e2dcaf714",
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
  "id": "ee51c61b-8752-44f1-bdaf-791cb17ad020",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:32:33.432280Z",
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
  "command_id": "8325bfe8-1f26-458d-bbca-950e7fd16c05",
  "quote_id": "ee51c61b-8752-44f1-bdaf-791cb17ad020",
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
  "id": "99a87691-4a16-4119-8bc9-f3e86c95f33d",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:33.753063Z",
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
    "id": "741109f7-6ff1-46fe-866e-f2ff7bc94524",
    "order_id": "99a87691-4a16-4119-8bc9-f3e86c95f33d",
    "expires_at": "2026-10-30T14:27:48.756597Z",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 6,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "OFFERED",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_OFFERED"
  ]
}
```

Round 3, at the same moment:

`POST /api/driver/v1/offers/741109f7-6ff1-46fe-866e-f2ff7bc94524/accept` → **409**

```json
{
  "instance": "/api/driver/v1/offers/741109f7-6ff1-46fe-866e-f2ff7bc94524/accept",
  "status": 409,
  "title": "Offer revoked",
  "type": "https://errors.blizz.taxi/offer-revoked",
  "code": "OFFER_REVOKED",
  "correlation_id": "555c4d63-07ce-41ab-973e-825346c10fdf"
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/pause` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING",
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

Round 3: the pause won; the accept got OFFER_REVOKED.

`GET /api/operator/v1/orders/99a87691-4a16-4119-8bc9-f3e86c95f33d` → **200**

```json
{
  "id": "99a87691-4a16-4119-8bc9-f3e86c95f33d",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:33.753063Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/99a87691-4a16-4119-8bc9-f3e86c95f33d` → **200**

```json
{
  "id": "99a87691-4a16-4119-8bc9-f3e86c95f33d",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:33.753063Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/99a87691-4a16-4119-8bc9-f3e86c95f33d/cancel` → **200**

```json
{
  "command_id": "499dda51-f5f4-4462-98f6-53170221e107",
  "expected_version": 4,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "99a87691-4a16-4119-8bc9-f3e86c95f33d",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:33.753063Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 7,
  "session_state": "OPEN",
  "intent": "NOT_ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "INTENT_NOT_ACCEPTING",
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/resume` → **200**

```json
{
  "command_id": "b515b855-438c-4c97-9e7b-8dfbce390656",
  "expected_version": 7
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "61bde361-12e1-48c7-b259-3e6b7af6ae84",
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
  "id": "bbe01f3f-373f-4e2f-934c-6714e2e21b93",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:32:36.333183Z",
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
  "command_id": "7a2d1b04-700e-484d-89ae-3e4a2613d247",
  "quote_id": "bbe01f3f-373f-4e2f-934c-6714e2e21b93",
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
  "id": "a6a7619f-9b56-47b0-9091-74dea6ef54ef",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "390eed5c-52f4-4bda-9ece-93cd4b4e3093",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:36.651196Z",
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
[]
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8c1561c1-d557-4816-bf3f-d3b8493004ed",
  "session_version": 8,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-30T14:27:19.632242Z",
  "last_location_at": "2026-10-30T14:27:19.632242Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8c1561c1-d557-4816-bf3f-d3b8493004ed/close` → **200**

```json
{
  "command_id": "e5c7a8b3-ec75-4750-813c-a492170d1902",
  "expected_version": 8
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
  "session_id": null,
  "session_version": 0,
  "session_state": "CLOSED",
  "intent": null,
  "connection": "DISCONNECTED",
  "geolocation": "UNAVAILABLE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": null,
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
  "session_id": "53349afa-2e7f-4da7-b5f6-87aaf9923f8a",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzEzNTgsImlhdCI6MTc5MzM3MDQ1OCwianRpIjoiNzIzNWYzNWQtMjdmOS00NTQxLWFjYjQtNGFmZGIzNmUzY2Y3Iiwic2lkIjoiNTMzNDlhZmEtMmU3Zi00ZGE3LWI1ZjYtODdhYWY5OTIzZjhhIn0.v0Y8fU97FT0EIpTmIZPJB8oSiCvKZOeUgYzfqeXbq6Q",
  "access_expires_at": "2026-10-30T14:42:38.487087342Z",
  "refresh_token": "Qkvpe2b3IN6F-3EWDUdMtNLN8zDUz3RsQ3cL6Rtzwr0",
  "refresh_expires_at": "2026-10-31T02:27:38.486478977Z",
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
  "command_id": "7d62c486-bc21-4678-a356-2656d4090b22",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T14:27:39.142391Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "4c21ac83-690e-4099-95bc-bf86660f7c1e",
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
  "correlation_id": "babbffc4-33e7-4389-b1f5-f762cb10c85f",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "5839cb39-530d-4179-bcb8-2111af13884c",
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
  "correlation_id": "8ec52057-8cca-4e72-9c0e-3cb47a6e7974"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637074678",
  "device_ref": "sandbox-9865"
}
```

```json
{
  "challenge_id": "b7fdb1c5-7ec2-4040-b34d-06c1dddd0872",
  "expires_at": "2026-10-30T14:32:40.058056481Z",
  "resend_available_at": "2026-10-30T14:27:41.058056481Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637074678` → **200**

```json
{
  "phone": "+380637074678",
  "audience": "CLIENT",
  "code": "174649",
  "sent_at": "2026-10-30T14:27:40.061772445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7fdb1c5-7ec2-4040-b34d-06c1dddd0872",
  "code": "174649",
  "device_ref": "sandbox-9865"
}
```

```json
{
  "session_id": "96fe74ca-63bb-4748-82f8-5e8e78b81fcb",
  "subject": {
    "type": "CLIENT",
    "id": "b51e3f74-ffad-42e9-b8ac-9de49ff304b0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNTFlM2Y3NC1mZmFkLTQyZTktYjhhYy05ZGU0OWZmMzA0YjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzYwLCJpYXQiOjE3OTMzNzA0NjAsImp0aSI6IjhhODI1MDFlLTgyMzktNGU4Yy04MzFhLWNiYzMxMjAwZmE3OCIsInNpZCI6Ijk2ZmU3NGNhLTYzYmItNDc0OC04MmY4LTVlOGU3OGI4MWZjYiJ9.fgdUY0ZkpEXpJOZGDYTwHerllsqPvDussEYLUa6oDks",
  "access_expires_at": "2026-10-30T14:42:40.38281096Z",
  "refresh_token": "wvLLh0RL9viHDXb7TNP3Zc5wot1viqRXvkgXP9Iuy_c",
  "refresh_expires_at": "2026-11-29T14:27:40.382187715Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6225162f-b0b3-4ffe-a4b2-7f002c36f70d",
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
  "id": "61d6fc9d-5616-4c99-96fa-02db628244c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:32:40.689361Z",
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
  "command_id": "c6bd814d-fe68-4ee8-bbd0-a6ef25de1c3a",
  "quote_id": "61d6fc9d-5616-4c99-96fa-02db628244c2",
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
  "correlation_id": "61c8362a-cfa6-41f6-a0e6-ab93729de36b"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "79e2155a-3eba-45c5-a05b-b47642859957",
  "quote_id": "61d6fc9d-5616-4c99-96fa-02db628244c2",
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
  "id": "283f22a6-ef9b-4642-981b-e57ecc9c78f9",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b51e3f74-ffad-42e9-b8ac-9de49ff304b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:27:41.341257Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/283f22a6-ef9b-4642-981b-e57ecc9c78f9/cancel` → **200**

```json
{
  "command_id": "84208cca-0c3b-4956-bc13-da83fe759b9f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "283f22a6-ef9b-4642-981b-e57ecc9c78f9",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b51e3f74-ffad-42e9-b8ac-9de49ff304b0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:27:41.341257Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "command_id": "f39cbe93-9926-467d-883b-e5a54c7d336d",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T14:27:42.007655Z"
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
      "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T14:27:42.007655Z"
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
  "device_ref": "sandbox-8461"
}
```

```json
{
  "challenge_id": "62d7c493-4e0e-4794-8118-f3d65bd744e0",
  "expires_at": "2026-10-30T14:32:42.919409736Z",
  "resend_available_at": "2026-10-30T14:27:43.919409736Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "413447",
  "sent_at": "2026-10-30T14:27:42.922737536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62d7c493-4e0e-4794-8118-f3d65bd744e0",
  "code": "413447",
  "device_ref": "sandbox-8461"
}
```

```json
{
  "session_id": "27afdfdc-5513-4470-a1e4-f9ecb9cf8c65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTM2MywiaWF0IjoxNzkzMzcwNDYzLCJqdGkiOiI1NGQwMmUxOS00ZjU5LTQxYWEtOWU2YS1jMjU5NTA4MmQ1ZmIiLCJzaWQiOiIyN2FmZGZkYy01NTEzLTQ0NzAtYTFlNC1mOWVjYjljZjhjNjUifQ.YZIvI5YTsuW9HZJoNypE9GhbZLVNFYhNP1T7nizErk4",
  "access_expires_at": "2026-10-30T14:42:43.24153668Z",
  "refresh_token": "In1nfR2vHhIE_FgNnoeFOSNi7i2xRfgjvHRWs2qIT24",
  "refresh_expires_at": "2026-11-29T14:27:43.240968459Z",
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
  "command_id": "0f306c50-ace2-41b3-a925-c2c3a5dd2a65",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:27:43Z",
    "sequence": 1793370463847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:27:43.866424Z",
  "last_location_at": "2026-10-30T14:27:43.866424Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672860377",
  "device_ref": "sandbox-16781"
}
```

```json
{
  "challenge_id": "ecf00ae0-66c0-4c74-a5ce-949d4c0dca9a",
  "expires_at": "2026-10-30T14:32:44.164305242Z",
  "resend_available_at": "2026-10-30T14:27:45.164305242Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672860377` → **200**

```json
{
  "phone": "+380672860377",
  "audience": "CLIENT",
  "code": "635685",
  "sent_at": "2026-10-30T14:27:44.167762967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ecf00ae0-66c0-4c74-a5ce-949d4c0dca9a",
  "code": "635685",
  "device_ref": "sandbox-16781"
}
```

```json
{
  "session_id": "359c6f93-bb97-407c-b5d4-a996ac830bfd",
  "subject": {
    "type": "CLIENT",
    "id": "0991bc4d-6517-4859-aa4d-e314281cc3aa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTkxYmM0ZC02NTE3LTQ4NTktYWE0ZC1lMzE0MjgxY2MzYWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxMzY0LCJpYXQiOjE3OTMzNzA0NjQsImp0aSI6IjJhMGNiYzBmLWMzOGQtNGUzNi1iZjYxLTg0MWE0YzhiNzJhMCIsInNpZCI6IjM1OWM2ZjkzLWJiOTctNDA3Yy1iNWQ0LWE5OTZhYzgzMGJmZCJ9.qquBC6CerbvQkzH24wGnCwuhV6d9QHEuE5vMMUSiSWY",
  "access_expires_at": "2026-10-30T14:42:44.487103581Z",
  "refresh_token": "NNpqxiY1drszeieVFL7vYbyKTIbWTLtB1CvnCPENMzE",
  "refresh_expires_at": "2026-11-29T14:27:44.486490607Z",
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
  "command_id": "eebe4a51-2eb0-4385-88bf-3be0297939d8",
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
  "id": "d351eaf3-4036-4c3e-8cb5-85ba5c451d47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:32:45.070157Z",
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
  "command_id": "dc111db1-1f0b-46e4-8357-d1521ff6bdd2",
  "platform": "ANDROID",
  "token": "sandbox-driver-9716e95e-b36a-4751-87a8-c67d2e872674"
}
```

```json
{
  "id": "7b94bac4-5ac8-415b-9430-10d6e02b7902",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T14:27:45.387208Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "aabf2518-cd63-43b1-b7e6-d0258598387d",
  "platform": "ANDROID",
  "token": "sandbox-rider-e7487df9-1d65-41f2-be5d-989b89dfee01"
}
```

```json
{
  "id": "97aca1b5-5878-46a3-8408-da74b5319541",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T14:27:45.70081Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "783e03e1-43cb-4f35-98f0-bd354042048c",
  "quote_id": "d351eaf3-4036-4c3e-8cb5-85ba5c451d47",
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
  "id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0991bc4d-6517-4859-aa4d-e314281cc3aa",
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
  "created_at": "2026-10-30T14:27:46.011053Z",
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
    "id": "92f2a338-b3f2-4122-93ac-0dfad6fc3a20",
    "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
    "expires_at": "2026-10-30T14:28:01.0153Z",
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

`POST /api/driver/v1/offers/92f2a338-b3f2-4122-93ac-0dfad6fc3a20/accept` → **200**

```json
{
  "command_id": "3a6b3f7e-e51d-44b2-80e1-447913f82e4b"
}
```

```json
{
  "id": "e9b119d1-fbbb-4339-897c-592ce0067be5",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f20938c3-12f7-420b-862c-98d0dbe1346e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T14:27:45.984Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T14:27:45.984Z` → **200**

```json
[
  {
    "at": "2026-10-30T14:27:47.095217537Z",
    "token_suffix": "872674",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "8d2bee63-ba65-41ea-95d1-b34c723ed6d3",
      "order_version": "2",
      "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672860377&after=2026-10-30T14:27:45.984Z` → **200**

```json
[
  {
    "at": "2026-10-30T14:27:47.092853215Z",
    "token_suffix": "dfee01",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "578e39f3-733f-4811-9aac-f61724c09749",
      "order_version": "3",
      "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/e6f7647e-96a8-4025-9a6a-bb7dfa971f8b/messages` → **201**

```json
{
  "command_id": "32e3b8da-81ea-4917-a18e-f3103b8a5c29",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "8af10f7a-8454-4a0b-90bb-94e25fddb5f8",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T14:27:48.060850875Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f20938c3-12f7-420b-862c-98d0dbe1346e",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "assignment_id": "e9b119d1-fbbb-4339-897c-592ce0067be5",
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

`POST /api/driver/v1/trips/f20938c3-12f7-420b-862c-98d0dbe1346e/messages` → **201**

```json
{
  "command_id": "2ed491df-78fd-4e0b-af14-69ee04e563be",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "961e9ae3-3770-48c1-86da-5510ff4ca3ca",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T14:27:48.680811552Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/e6f7647e-96a8-4025-9a6a-bb7dfa971f8b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/f20938c3-12f7-420b-862c-98d0dbe1346e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672860377"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/caf8cff2-73a6-4ea1-bacd-8efdf9694437/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:27:49Z",
    "sequence": 1793370469612
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:27:49.633069Z",
  "last_location_at": "2026-10-30T14:27:49.633069Z",
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
  "id": "f20938c3-12f7-420b-862c-98d0dbe1346e",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "assignment_id": "e9b119d1-fbbb-4339-897c-592ce0067be5",
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

`POST /api/driver/v1/trips/f20938c3-12f7-420b-862c-98d0dbe1346e/arrive` → **200**

```json
{
  "command_id": "37cf39d2-4965-4d5c-9ace-240dd21f02c6",
  "expected_version": 0
}
```

```json
{
  "id": "f20938c3-12f7-420b-862c-98d0dbe1346e",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "assignment_id": "e9b119d1-fbbb-4339-897c-592ce0067be5",
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
  "arrived_at": "2026-10-30T14:27:50.229389Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f20938c3-12f7-420b-862c-98d0dbe1346e/start` → **200**

```json
{
  "command_id": "0954b688-a0b6-4626-8221-1eca025ad132",
  "expected_version": 1
}
```

```json
{
  "id": "f20938c3-12f7-420b-862c-98d0dbe1346e",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "assignment_id": "e9b119d1-fbbb-4339-897c-592ce0067be5",
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
  "arrived_at": "2026-10-30T14:27:50.229389Z",
  "started_at": "2026-10-30T14:27:50.546847Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/caf8cff2-73a6-4ea1-bacd-8efdf9694437/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:28:38Z",
    "sequence": 1793370518877
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:28:38.896384Z",
  "last_location_at": "2026-10-30T14:28:38.896384Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/f20938c3-12f7-420b-862c-98d0dbe1346e/complete` → **200**

```json
{
  "command_id": "eeb22c1d-6d23-4eaf-9e6b-4e45203a1cdf",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:28:39Z",
  "cash_received": true
}
```

```json
{
  "id": "f20938c3-12f7-420b-862c-98d0dbe1346e",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "assignment_id": "e9b119d1-fbbb-4339-897c-592ce0067be5",
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
  "arrived_at": "2026-10-30T14:27:50.229389Z",
  "started_at": "2026-10-30T14:27:50.546847Z",
  "completed_at": "2026-10-30T14:28:39.212409Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/e6f7647e-96a8-4025-9a6a-bb7dfa971f8b` → **200**

```json
{
  "id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "short_number": 19,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0991bc4d-6517-4859-aa4d-e314281cc3aa",
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
    "id": "e9b119d1-fbbb-4339-897c-592ce0067be5",
    "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f20938c3-12f7-420b-862c-98d0dbe1346e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:27:46.011053Z",
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
    "id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
    "short_number": 19,
    "status": "FULFILLED",
    "created_at": "2026-10-30T14:27:46.011053Z",
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
    "id": "f20938c3-12f7-420b-862c-98d0dbe1346e",
    "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
    "order_short_number": 19,
    "created_at": "2026-10-30T14:27:46.654461Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "248ab364-a67d-4980-92af-806ec8fbee63",
    "order_id": "7fa7e1ba-31d4-4597-b5dc-bf3fd0ae8732",
    "order_short_number": 9,
    "created_at": "2026-10-30T14:24:34.485231Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "14eac4b3-58d3-4797-b222-ec0f898822a1",
    "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
    "order_short_number": 4,
    "created_at": "2026-10-30T14:22:58.796855Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "138663df-d4cc-49b3-a546-d87b840d8813",
    "order_id": "41e0ec16-6354-4b57-86d6-66cb094b0c4c",
    "order_short_number": 2,
    "created_at": "2026-10-30T14:19:11.047728Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f3600348-c2f4-46a0-83dc-ad74730c302f",
    "order_id": "393b69bb-74b4-40eb-a29d-00ee1125149e",
    "order_short_number": 1,
    "created_at": "2026-10-30T14:19:00.603903Z",
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

`GET /api/rider/v1/orders/e6f7647e-96a8-4025-9a6a-bb7dfa971f8b/tip` → **200**

```json
{
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
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
  "available_until": "2026-10-31T14:28:39.212409Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e6f7647e-96a8-4025-9a6a-bb7dfa971f8b/tip` → **201**

```json
{
  "command_id": "96278351-5255-478f-a7bf-bae49d4a5915",
  "amount_minor": 1100
}
```

```json
{
  "id": "d4dd93b7-9634-44f6-a7da-d9c68f20d83b",
  "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T14:28:44.380659Z"
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
  "session_id": "7a36a242-cab2-4c1b-9c62-ce0fe43dc846",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE0MjQsImlhdCI6MTc5MzM3MDUyNCwianRpIjoiYzBhMTMxNzItMTkwMy00ZmQwLWJkNjUtNTgwOWYzODViZmEzIiwic2lkIjoiN2EzNmEyNDItY2FiMi00YzFiLTljNjItY2UwZmU0M2RjODQ2In0.-H1L-VGb0WYzONR5s6qZF6jk1mo5KsJWFr7uJEJyo34",
  "access_expires_at": "2026-10-30T14:43:44.97881927Z",
  "refresh_token": "Q9uBjQ_2qK-q72uv94Drog9lmIhCBc4bKp_m5ANNDt4",
  "refresh_expires_at": "2026-10-31T02:28:44.977857406Z",
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
        "created": 18,
        "fulfilled": 8,
        "cancelled": 9,
        "unfulfilled": 0,
        "open": 1,
        "by_channel": {
          "PHONE": 1,
          "APP": 17
        },
        "by_payment": {
          "CASH": 16,
          "CARD": 2
        },
        "cancelled_by": {
          "STAFF": 5,
          "DRIVER": 1,
          "RIDER": 3
        }
      }
    }
  ],
  "total": {
    "created": 18,
    "fulfilled": 8,
    "cancelled": 9,
    "unfulfilled": 0,
    "open": 1,
    "by_channel": {
      "PHONE": 1,
      "APP": 17
    },
    "by_payment": {
      "CASH": 16,
      "CARD": 2
    },
    "cancelled_by": {
      "STAFF": 5,
      "DRIVER": 1,
      "RIDER": 3
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 5
    },
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 2
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
  "generated_at": "2026-10-30T14:28:45.278911821Z"
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
  "generated_at": "2026-10-30T14:28:45.581513426Z"
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
  "session_id": "ba69df61-353a-4eb0-97e3-67ae9d572c6d",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE0MjYsImlhdCI6MTc5MzM3MDUyNiwianRpIjoiMWQ4ZTg5MWQtOTgyMy00OWVmLWE0MDktYjc4MWE2YmQxZTlmIiwic2lkIjoiYmE2OWRmNjEtMzUzYS00ZWIwLTk3ZTMtNjdhZTlkNTcyYzZkIn0.o59K3Vs4MehI4B_dIKJ9xudHWLBR_0SgxHctlQfFtM8",
  "access_expires_at": "2026-10-30T14:43:46.178743736Z",
  "refresh_token": "rgqzyYyRA7nQeg1bIHfU3zpnTzjGgcPYNjc1Fhye6uw",
  "refresh_expires_at": "2026-10-31T02:28:46.177805275Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e6f7647e-96a8-4025-9a6a-bb7dfa971f8b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:27:46.011678Z",
      "actor": {
        "type": "CLIENT",
        "id": "0991bc4d-6517-4859-aa4d-e314281cc3aa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
        "quote_id": "d351eaf3-4036-4c3e-8cb5-85ba5c451d47",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "dabea7e1-2efa-46ed-97d4-5b99a185e7d8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:27:46.014311Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
        "attempt_id": "6852d588-468c-45e5-ac0f-b5c55604d9e5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "dabea7e1-2efa-46ed-97d4-5b99a185e7d8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:27:46.021476Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "92f2a338-b3f2-4122-93ac-0dfad6fc3a20",
        "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "dabea7e1-2efa-46ed-97d4-5b99a185e7d8"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T14:27:46.656828Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "92f2a338-b3f2-4122-93ac-0dfad6fc3a20",
        "order_id": "e6f7647e-96a8-4025-9a6a-bb7dfa971f8b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e9b119d1-fbbb-4339-897c-592ce0067be5"
      },
      "correlation_id": "ff494472-5de6-44cf-bd13-884516ccb566"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T14:28:46.792355698Z",
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
      "last_location_at": "2026-10-30T14:28:38.896384Z",
      "last_heartbeat_at": "2026-10-30T14:28:38.896384Z",
      "order_id": null
    }
  ]
}
```

Done: order e6f7647e-96a8-4025-9a6a-bb7dfa971f8b.

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
  "session_id": "5ff546ec-e3e1-4eb9-94b7-8233ebaa6c1b",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE0MjcsImlhdCI6MTc5MzM3MDUyNywianRpIjoiOTcwNWFkZjEtMGY5MS00ZDhhLTllOGYtMTFiYjY1NTM4M2U1Iiwic2lkIjoiNWZmNTQ2ZWMtZTNlMS00ZWI5LTk0YjctODIzM2ViYWE2YzFiIn0.CcJOUsKyv1hw1KlzEq6MYd_AryR-oN_glH0MZM-ttus",
  "access_expires_at": "2026-10-30T14:43:47.40844975Z",
  "refresh_token": "VJX0MbFQAe3xNXnB4UnveKbs5yAGe1fbPahxFSLPGpk",
  "refresh_expires_at": "2026-10-31T02:28:47.407779369Z",
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
  "command_id": "16d50473-0e4f-4a18-b987-05ca0da4d354",
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
  "timestamp": "2026-10-30T14:28:48.000+0000",
  "channel": {
    "id": "1730052000.1715918237",
    "linkedid": "1730052000.1715918237",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672840874"
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
  "timestamp": "2026-10-30T14:28:48.000+0000",
  "channel": {
    "id": "1730052000.1715918237",
    "linkedid": "1730052000.1715918237",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672840874"
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
  "session_id": "905308b7-cfd3-4216-8abb-364ecc376bfe",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE0MjgsImlhdCI6MTc5MzM3MDUyOCwianRpIjoiZjRmMjg3YmUtNTBkZC00ZTlmLTgzYTUtYmUzNDhiNzY4ODZhIiwic2lkIjoiOTA1MzA4YjctY2ZkMy00MjE2LThhYmItMzY0ZWNjMzc2YmZlIn0.2f1luV_hMwKImDX4-wGlnTbnhQgTdnUiTlfODdBHDg0",
  "access_expires_at": "2026-10-30T14:43:48.635979786Z",
  "refresh_token": "1Rll73-gCV8fUawTYXjZSfBnW5aPjaLrx8lJz8CaQEM",
  "refresh_expires_at": "2026-10-31T02:28:48.635363342Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "6f30edfe-e603-4e43-ac82-96cce2f2fedc",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672840874",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T14:28:48Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/6f30edfe-e603-4e43-ac82-96cce2f2fedc/answer` → **200**

```json
{
  "command_id": "c4248019-f552-4ae7-aa44-5023fa46d3a3"
}
```

```json
{
  "id": "6f30edfe-e603-4e43-ac82-96cce2f2fedc",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672840874",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "order_ids": [],
  "started_at": "2026-10-30T14:28:48Z",
  "answered_at": "2026-10-30T14:28:49.264115Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1715918237",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "918ad75e-aefa-4a1b-ba62-1ba59dd172cd",
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
  "id": "42938cad-d9f5-4c2e-b1f7-92831d9d010f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:33:49.607690Z",
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
  "command_id": "5065282b-c904-4557-9b58-e9996083f3b1",
  "quote_id": "42938cad-d9f5-4c2e-b1f7-92831d9d010f",
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
    "phone": "+380672840874"
  },
  "call_id": "6f30edfe-e603-4e43-ac82-96cce2f2fedc"
}
```

```json
{
  "id": "7269feb8-416b-4ab6-a7fb-0ecb425b5386",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:28:49.91922Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672840874"
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
    "id": "1730052000.1715918237",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "6f30edfe-e603-4e43-ac82-96cce2f2fedc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672840874",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [
        "7269feb8-416b-4ab6-a7fb-0ecb425b5386"
      ],
      "started_at": "2026-10-30T14:28:48Z",
      "answered_at": "2026-10-30T14:28:49.264115Z",
      "ended_at": "2026-10-30T14:28:50.25359Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "ee28a516-87d1-426d-badd-a6113692802a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674467727",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [],
      "started_at": "2026-10-30T14:22:52.013426Z",
      "answered_at": "2026-10-30T14:22:52.354849Z",
      "ended_at": "2026-10-30T14:22:52.688471Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:22:53.770747Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/7269feb8-416b-4ab6-a7fb-0ecb425b5386` → **200**

```json
{
  "id": "7269feb8-416b-4ab6-a7fb-0ecb425b5386",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:28:49.91922Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672840874"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/7269feb8-416b-4ab6-a7fb-0ecb425b5386` → **200**

```json
{
  "id": "7269feb8-416b-4ab6-a7fb-0ecb425b5386",
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
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:28:49.91922Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672840874"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7269feb8-416b-4ab6-a7fb-0ecb425b5386/cancel` → **200**

```json
{
  "command_id": "63454fb8-1537-46ff-9afe-1881c5187bfd",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7269feb8-416b-4ab6-a7fb-0ecb425b5386",
  "short_number": 20,
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
  "created_at": "2026-10-30T14:28:49.91922Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672840874"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 6f30edfe-e603-4e43-ac82-96cce2f2fedc with order 7269feb8-416b-4ab6-a7fb-0ecb425b5386.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22418"
}
```

```json
{
  "challenge_id": "73682f11-ee26-4e73-91dc-b65bbb10a215",
  "expires_at": "2026-10-30T14:33:51.554251091Z",
  "resend_available_at": "2026-10-30T14:28:52.554251091Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "261813",
  "sent_at": "2026-10-30T14:28:51.557712381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73682f11-ee26-4e73-91dc-b65bbb10a215",
  "code": "261813",
  "device_ref": "sandbox-22418"
}
```

```json
{
  "session_id": "5be7a9bc-f734-4e5e-9fca-2f3e369b9ffa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTQzMSwiaWF0IjoxNzkzMzcwNTMxLCJqdGkiOiJhNGNjY2UxMC01M2FmLTRhMDMtYmQwZC1iNmRjNDUzZDRhOWQiLCJzaWQiOiI1YmU3YTliYy1mNzM0LTRlNWUtOWZjYS0yZjNlMzY5YjlmZmEifQ.Ka_NoSRH_XtgtnP3tUQv1vRICT7Uz8r_CIf0UZqbVWQ",
  "access_expires_at": "2026-10-30T14:43:51.897597332Z",
  "refresh_token": "oOffG7fFbFwNNfsf4mlVShIXF-BAzz1Y1JI-lt4cgrU",
  "refresh_expires_at": "2026-11-29T14:28:51.896638809Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:28:38.896384Z",
  "last_location_at": "2026-10-30T14:28:38.896384Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/caf8cff2-73a6-4ea1-bacd-8efdf9694437/handover` → **200**

```json
{
  "command_id": "198061b4-98bc-4bd2-bc5e-a79d6cad91c4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:28:38.896384Z",
  "last_location_at": "2026-10-30T14:28:38.896384Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/caf8cff2-73a6-4ea1-bacd-8efdf9694437/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:30:17Z",
    "sequence": 1793370617831
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:30:17.851454Z",
  "last_location_at": "2026-10-30T14:30:17.851454Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664808890",
  "device_ref": "sandbox-10459"
}
```

```json
{
  "challenge_id": "9f0f5851-3128-4bfc-bbbb-5405308f9eee",
  "expires_at": "2026-10-30T14:35:18.150890611Z",
  "resend_available_at": "2026-10-30T14:30:19.150890611Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664808890` → **200**

```json
{
  "phone": "+380664808890",
  "audience": "CLIENT",
  "code": "345489",
  "sent_at": "2026-10-30T14:30:18.154896151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f0f5851-3128-4bfc-bbbb-5405308f9eee",
  "code": "345489",
  "device_ref": "sandbox-10459"
}
```

```json
{
  "session_id": "ef96c8c7-0b74-40cf-9aa7-2ac793733b54",
  "subject": {
    "type": "CLIENT",
    "id": "95c9a4cc-59c2-4589-905f-0e6f3f1422d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NWM5YTRjYy01OWMyLTQ1ODktOTA1Zi0wZTZmM2YxNDIyZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNTE4LCJpYXQiOjE3OTMzNzA2MTgsImp0aSI6ImM3ZGMwODgzLTczNWQtNDIwMi1iMGQ2LWFmMjM5YjE1Y2IyMCIsInNpZCI6ImVmOTZjOGM3LTBiNzQtNDBjZi05YWE3LTJhYzc5MzczM2I1NCJ9.bfGcL6XXkbJ5ieeyGM3uzcRYvdn229nkHY4VoGaKY94",
  "access_expires_at": "2026-10-30T14:45:18.507752994Z",
  "refresh_token": "3fiCi6kRVlt8fHV8b9tX82J11sjwnIPG3HBWIc0WM4w",
  "refresh_expires_at": "2026-11-29T14:30:18.507095356Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d2150d10-b458-422b-b038-ae7e03820951",
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
  "id": "887b606b-72f0-4e6d-bc52-b5749c6214ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:35:18.813568Z",
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
  "command_id": "c85d94f2-3262-4a74-8ffd-a041024dad35",
  "quote_id": "887b606b-72f0-4e6d-bc52-b5749c6214ba",
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
  "id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "95c9a4cc-59c2-4589-905f-0e6f3f1422d9",
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
  "created_at": "2026-10-30T14:30:19.123237Z",
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
    "id": "2f02e223-ff0c-4434-8aff-c8e527734858",
    "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
    "expires_at": "2026-10-30T14:30:34.126726Z",
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

`POST /api/driver/v1/offers/2f02e223-ff0c-4434-8aff-c8e527734858/accept` → **200**

```json
{
  "command_id": "7bae99fe-0431-4ea9-9ddb-cc7a7c225d65"
}
```

```json
{
  "id": "9bac5f58-1cac-42a7-b2a8-1ccfe172a2da",
  "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e094b667-0d57-499f-9419-21dfd06b4d0b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e094b667-0d57-499f-9419-21dfd06b4d0b",
  "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
  "assignment_id": "9bac5f58-1cac-42a7-b2a8-1ccfe172a2da",
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

`POST /api/driver/v1/work-sessions/caf8cff2-73a6-4ea1-bacd-8efdf9694437/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:30:20Z",
    "sequence": 1793370620341
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:30:20.359815Z",
  "last_location_at": "2026-10-30T14:30:20.359815Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e094b667-0d57-499f-9419-21dfd06b4d0b/arrive` → **200**

```json
{
  "command_id": "f284742b-324e-4338-a617-99910f9717e2",
  "expected_version": 0
}
```

```json
{
  "id": "e094b667-0d57-499f-9419-21dfd06b4d0b",
  "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
  "assignment_id": "9bac5f58-1cac-42a7-b2a8-1ccfe172a2da",
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
  "arrived_at": "2026-10-30T14:30:20.674617Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e094b667-0d57-499f-9419-21dfd06b4d0b/start` → **200**

```json
{
  "command_id": "f7b7b8ca-a4b1-4d49-ae75-676b1342285d",
  "expected_version": 1
}
```

```json
{
  "id": "e094b667-0d57-499f-9419-21dfd06b4d0b",
  "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
  "assignment_id": "9bac5f58-1cac-42a7-b2a8-1ccfe172a2da",
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
  "arrived_at": "2026-10-30T14:30:20.674617Z",
  "started_at": "2026-10-30T14:30:20.991521Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/caf8cff2-73a6-4ea1-bacd-8efdf9694437/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:31:20Z",
    "sequence": 1793370680319
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:31:20.340306Z",
  "last_location_at": "2026-10-30T14:31:20.340306Z",
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
  "device_ref": "sandbox-8154"
}
```

```json
{
  "challenge_id": "a9258489-8fa6-440d-a50b-8d1af55803df",
  "expires_at": "2026-10-30T14:36:20.646935328Z",
  "resend_available_at": "2026-10-30T14:31:21.646935328Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "019071",
  "sent_at": "2026-10-30T14:31:20.650726432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9258489-8fa6-440d-a50b-8d1af55803df",
  "code": "019071",
  "device_ref": "sandbox-8154"
}
```

```json
{
  "session_id": "125abf97-0dcb-4674-82f2-92edcd678067",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTU4MCwiaWF0IjoxNzkzMzcwNjgwLCJqdGkiOiI5OTg2YWRjNC04NjA0LTRmYjYtOTcxOS1hYmRjNTYwM2FjZDMiLCJzaWQiOiIxMjVhYmY5Ny0wZGNiLTQ2NzQtODJmMi05MmVkY2Q2NzgwNjcifQ.5MNC_QetDy2N_ftwXsSmP3gkLsVZ9YKDFAqhkNVFkLs",
  "access_expires_at": "2026-10-30T14:46:20.981760372Z",
  "refresh_token": "giz0q0Jfrw4gZaKKsg4jS5WwvfIsgqMbWSBnkh8CAHo",
  "refresh_expires_at": "2026-11-29T14:31:20.980810025Z",
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
  "command_id": "32684640-ba61-478c-9501-a90c0bf7cfb9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:31:21Z",
    "sequence": 1793370681596
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a5677274-f46b-41b6-bc40-fed78faa753b",
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
  "last_heartbeat_at": "2026-10-30T14:31:21.617541Z",
  "last_location_at": "2026-10-30T14:31:21.617541Z",
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
  "session_id": "daf4a3b7-4522-4ed9-a879-8e43e3fa45ae",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE1ODIsImlhdCI6MTc5MzM3MDY4MiwianRpIjoiMDk4YWU0OWQtYjdlNy00YTRmLWFmNTEtMTUzMDQ4Y2IzZjE2Iiwic2lkIjoiZGFmNGEzYjctNDUyMi00ZWQ5LWE4NzktOGU0M2UzZmE0NWFlIn0.llpbx6Jma7A9LvSuP3ehjlZsN5nlH03tosYevg8XC84",
  "access_expires_at": "2026-10-30T14:46:22.221268558Z",
  "refresh_token": "XkfE_SZXjoS72qKy3ytWgImOmfhUZeVdkPhCmAibe4o",
  "refresh_expires_at": "2026-10-31T02:31:22.220600022Z",
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
  "session_id": "a5dfd578-11fb-4564-a679-e2cb8f383b5c",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE1ODIsImlhdCI6MTc5MzM3MDY4MiwianRpIjoiNzM0YWM1OWYtNTFkNy00ZjdmLWJiM2ItYTQ0ZDE0ZjkwNGM2Iiwic2lkIjoiYTVkZmQ1NzgtMTFmYi00NTY0LWE2NzktZTJjYjhmMzgzYjVjIn0.T9oZYdcY8FCZALaMZ8fIDISWJtGzp9f4O0L1zXwS3F0",
  "access_expires_at": "2026-10-30T14:46:22.814259402Z",
  "refresh_token": "MRWbH2qgzaBeR_LqfosTdADRWuMfoTHZixE3QJ4zD-c",
  "refresh_expires_at": "2026-10-31T02:31:22.813569615Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/873ac8f1-f1b7-48fc-96a1-93074618ae96` → **200**

```json
{
  "id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
  "short_number": 21,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "95c9a4cc-59c2-4589-905f-0e6f3f1422d9",
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
    "id": "9bac5f58-1cac-42a7-b2a8-1ccfe172a2da",
    "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e094b667-0d57-499f-9419-21dfd06b4d0b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T14:30:19.123237Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/873ac8f1-f1b7-48fc-96a1-93074618ae96/interrupt` → **200**

```json
{
  "command_id": "148f313c-77ed-4290-a93e-7c8b71633661",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
    "short_number": 21,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "95c9a4cc-59c2-4589-905f-0e6f3f1422d9",
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
      "id": "9bac5f58-1cac-42a7-b2a8-1ccfe172a2da",
      "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "e094b667-0d57-499f-9419-21dfd06b4d0b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T14:30:19.123237Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "07190463-93f9-4ee9-8c0e-c368628496df",
    "short_number": 22,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "95c9a4cc-59c2-4589-905f-0e6f3f1422d9",
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
    "id": "52263de4-8e9d-4fc8-92f2-6adc760e86a7",
    "order_id": "07190463-93f9-4ee9-8c0e-c368628496df",
    "expires_at": "2026-10-30T14:31:38.457643Z",
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

`POST /api/driver/v1/offers/52263de4-8e9d-4fc8-92f2-6adc760e86a7/accept` → **200**

```json
{
  "command_id": "a73b5f74-321e-4393-b033-8e2ac7658f26"
}
```

```json
{
  "id": "02697483-634d-4b3b-b683-92c653ff17b9",
  "order_id": "07190463-93f9-4ee9-8c0e-c368628496df",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d26d1bc-3989-4c77-a360-63c11214ec4f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d26d1bc-3989-4c77-a360-63c11214ec4f",
  "order_id": "07190463-93f9-4ee9-8c0e-c368628496df",
  "assignment_id": "02697483-634d-4b3b-b683-92c653ff17b9",
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
  "session_id": "a5677274-f46b-41b6-bc40-fed78faa753b",
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
  "last_heartbeat_at": "2026-10-30T14:31:21.617541Z",
  "last_location_at": "2026-10-30T14:31:21.617541Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a5677274-f46b-41b6-bc40-fed78faa753b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:31:25Z",
    "sequence": 1793370685509
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a5677274-f46b-41b6-bc40-fed78faa753b",
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
  "last_heartbeat_at": "2026-10-30T14:31:25.070351Z",
  "last_location_at": "2026-10-30T14:31:25.070351Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9d26d1bc-3989-4c77-a360-63c11214ec4f/arrive` → **200**

```json
{
  "command_id": "93e80ba6-64c2-4398-93e5-949053fc893d",
  "expected_version": 0
}
```

```json
{
  "id": "9d26d1bc-3989-4c77-a360-63c11214ec4f",
  "order_id": "07190463-93f9-4ee9-8c0e-c368628496df",
  "assignment_id": "02697483-634d-4b3b-b683-92c653ff17b9",
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
  "arrived_at": "2026-10-30T14:31:25.390715Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d26d1bc-3989-4c77-a360-63c11214ec4f/start` → **200**

```json
{
  "command_id": "4ebf375e-6ddc-4f5b-a863-19282e44aa4b",
  "expected_version": 1
}
```

```json
{
  "id": "9d26d1bc-3989-4c77-a360-63c11214ec4f",
  "order_id": "07190463-93f9-4ee9-8c0e-c368628496df",
  "assignment_id": "02697483-634d-4b3b-b683-92c653ff17b9",
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
  "arrived_at": "2026-10-30T14:31:25.390715Z",
  "started_at": "2026-10-30T14:31:25.70891Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d26d1bc-3989-4c77-a360-63c11214ec4f/complete` → **200**

```json
{
  "command_id": "fac85d38-9df6-4c9a-81fa-ccc349a20030",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:31:26Z"
}
```

```json
{
  "id": "9d26d1bc-3989-4c77-a360-63c11214ec4f",
  "order_id": "07190463-93f9-4ee9-8c0e-c368628496df",
  "assignment_id": "02697483-634d-4b3b-b683-92c653ff17b9",
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
  "arrived_at": "2026-10-30T14:31:25.390715Z",
  "started_at": "2026-10-30T14:31:25.70891Z",
  "completed_at": "2026-10-30T14:31:26.036107Z",
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
    "id": "07190463-93f9-4ee9-8c0e-c368628496df",
    "short_number": 22,
    "status": "FULFILLED",
    "created_at": "2026-10-30T14:31:23.446069Z",
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
    "id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
    "short_number": 21,
    "status": "CANCELLED",
    "created_at": "2026-10-30T14:30:19.123237Z",
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
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
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

`GET /api/operator/v1/orders/873ac8f1-f1b7-48fc-96a1-93074618ae96/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T14:30:19.123785Z",
      "actor": {
        "type": "CLIENT",
        "id": "95c9a4cc-59c2-4589-905f-0e6f3f1422d9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
        "quote_id": "887b606b-72f0-4e6d-bc52-b5749c6214ba",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "9905c587-4276-4cf8-bacf-38e643662b20"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T14:30:19.125914Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
        "attempt_id": "ef38a5bd-fe0a-4035-a93c-029564b1f213",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9905c587-4276-4cf8-bacf-38e643662b20"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T14:30:19.132176Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2f02e223-ff0c-4434-8aff-c8e527734858",
        "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "9905c587-4276-4cf8-bacf-38e643662b20"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T14:30:19.736392Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2f02e223-ff0c-4434-8aff-c8e527734858",
        "order_id": "873ac8f1-f1b7-48fc-96a1-93074618ae96",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9bac5f58-1cac-42a7-b2a8-1ccfe172a2da"
      },
      "correlation_id": "d17ecda9-d9c7-4d74-bf6d-c3caaf36cda9"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/07190463-93f9-4ee9-8c0e-c368628496df/tip` → **200**

```json
{
  "order_id": "07190463-93f9-4ee9-8c0e-c368628496df",
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
  "available_until": "2026-10-31T14:31:26.036107Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/07190463-93f9-4ee9-8c0e-c368628496df/tip` → **409**

```json
{
  "command_id": "7533d290-0af8-48fd-8688-e1059823dfa3",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/07190463-93f9-4ee9-8c0e-c368628496df/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1f7e6bb7-0fb2-4f1d-b541-e3aa02686a9a"
}
```

Done: interrupted 873ac8f1-f1b7-48fc-96a1-93074618ae96, follow-up 07190463-93f9-4ee9-8c0e-c368628496df.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf8cff2-73a6-4ea1-bacd-8efdf9694437",
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
  "last_heartbeat_at": "2026-10-30T14:31:20.340306Z",
  "last_location_at": "2026-10-30T14:31:20.340306Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/caf8cff2-73a6-4ea1-bacd-8efdf9694437/close` → **200**

```json
{
  "command_id": "ab937507-56a1-4b48-a368-973390ecdcb7",
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
  "session_id": "a5677274-f46b-41b6-bc40-fed78faa753b",
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
  "last_heartbeat_at": "2026-10-30T14:31:25.070351Z",
  "last_location_at": "2026-10-30T14:31:25.070351Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a5677274-f46b-41b6-bc40-fed78faa753b/close` → **200**

```json
{
  "command_id": "f21256c0-8206-45f1-9454-e567c1d461ab",
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
  "session_id": "681d97d0-a7e9-4973-a1fe-8cb47213df07",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE1OTIsImlhdCI6MTc5MzM3MDY5MiwianRpIjoiZTcyNGNhNjYtMjYxZC00MjhmLTk1NTUtOGZkNzgxNDA4YjA4Iiwic2lkIjoiNjgxZDk3ZDAtYTdlOS00OTczLWExZmUtOGNiNDcyMTNkZjA3In0.Igf5Od4tpbEBei6lS9N4Mbo_JpFVE3Y0DOIYSM_pTZY",
  "access_expires_at": "2026-10-30T14:46:32.581898257Z",
  "refresh_token": "V_YBzvQKQlnkkFkCTA_KNtLw4me49qscC-iQTRSc9tQ",
  "refresh_expires_at": "2026-10-31T02:31:32.581308606Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d271ec79-1073-4aaf-941d-5ede0b9c2603",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:31:32Z"
}
```

```json
{
  "id": "2fbbed81-380f-4308-8bda-5c807904624d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:31:32Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2fbbed81-380f-4308-8bda-5c807904624d/publish` → **200**

```json
{
  "command_id": "c531e621-224d-47d4-b55d-3efcce917f98",
  "expected_version": 0
}
```

```json
{
  "id": "2fbbed81-380f-4308-8bda-5c807904624d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:31:33.231472Z",
  "published_at": "2026-10-30T14:31:33.231472Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "2fbbed81-380f-4308-8bda-5c807904624d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T14:31:33.231472Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631115445",
  "device_ref": "sandbox-13110"
}
```

```json
{
  "challenge_id": "5d13efaa-56d4-4187-bb13-11eabfabe39f",
  "expires_at": "2026-10-30T14:36:33.840671982Z",
  "resend_available_at": "2026-10-30T14:31:34.840671982Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631115445` → **200**

```json
{
  "phone": "+380631115445",
  "audience": "CLIENT",
  "code": "128762",
  "sent_at": "2026-10-30T14:31:33.844468049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d13efaa-56d4-4187-bb13-11eabfabe39f",
  "code": "128762",
  "device_ref": "sandbox-13110"
}
```

```json
{
  "session_id": "a0b99482-b2ca-4e98-a6a5-6754de77c3fb",
  "subject": {
    "type": "CLIENT",
    "id": "9767f68f-ba2c-4b43-8855-9af965495507"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzY3ZjY4Zi1iYTJjLTRiNDMtODg1NS05YWY5NjU0OTU1MDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNTk0LCJpYXQiOjE3OTMzNzA2OTQsImp0aSI6ImU3ODg4M2I1LTY5NWItNGZiZS05N2ViLTFhYjMxZmY5YWRjZiIsInNpZCI6ImEwYjk5NDgyLWIyY2EtNGU5OC1hNmE1LTY3NTRkZTc3YzNmYiJ9.dFiiJnUJwxKcHNrzWBzG-dSmNId-7Nl5PUPZbt5HA2I",
  "access_expires_at": "2026-10-30T14:46:34.176504854Z",
  "refresh_token": "zJwdPMGGQl8kdNZZ2eDfHUxny-mi5E1mS3zVo9C6CKg",
  "refresh_expires_at": "2026-11-29T14:31:34.175691065Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "2fbbed81-380f-4308-8bda-5c807904624d",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T14:31:33.231472Z",
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
  "command_id": "bec61d1b-c0e0-4b60-b3bb-9414af21ae79",
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
  "id": "e23c230c-d2e2-473d-bc93-49870a5eaccb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:36:34.797172Z",
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
  "command_id": "b9436d6f-46c9-4593-80bc-d4aa2814b2f0",
  "quote_id": "e23c230c-d2e2-473d-bc93-49870a5eaccb",
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
  "correlation_id": "7277df54-443d-403e-ba6c-9461d125db36"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "eac13670-fa30-49fa-88db-484d34884c26",
  "version_id": "2fbbed81-380f-4308-8bda-5c807904624d",
  "language": "uk"
}
```

```json
{
  "version_id": "2fbbed81-380f-4308-8bda-5c807904624d",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T14:31:35.417819Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0380e10b-0246-4bdd-9cd4-621f1df0dd56",
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
  "id": "af6d9861-a756-48a6-b7f9-cfcb116dc6b1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:36:35.729238Z",
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
  "command_id": "14404b2f-fd1e-4a9a-aea5-796a1871e3bd",
  "quote_id": "af6d9861-a756-48a6-b7f9-cfcb116dc6b1",
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
  "id": "23c7bb11-2227-47aa-8134-c8719fd6f3eb",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9767f68f-ba2c-4b43-8855-9af965495507",
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
  "created_at": "2026-10-30T14:31:36.061144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/23c7bb11-2227-47aa-8134-c8719fd6f3eb` → **200**

```json
{
  "id": "23c7bb11-2227-47aa-8134-c8719fd6f3eb",
  "short_number": 23,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9767f68f-ba2c-4b43-8855-9af965495507",
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
  "created_at": "2026-10-30T14:31:36.061144Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/23c7bb11-2227-47aa-8134-c8719fd6f3eb/cancel` → **200**

```json
{
  "command_id": "91043d3d-4d7a-43bf-a396-dc63f62621f8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "23c7bb11-2227-47aa-8134-c8719fd6f3eb",
  "short_number": 23,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9767f68f-ba2c-4b43-8855-9af965495507",
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
  "created_at": "2026-10-30T14:31:36.061144Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`POST /api/admin/v1/legal-documents/2fbbed81-380f-4308-8bda-5c807904624d` → **409**

```json
{
  "command_id": "a2f95b68-3975-4b10-841d-d10a551228e2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T14:31:37Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/2fbbed81-380f-4308-8bda-5c807904624d",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c6080d47-04f5-4968-9a70-1eeb3ae6b7cf"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "62fc6af8-f97f-4df0-9e01-c6bb64f3ca77",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:31:37Z"
}
```

```json
{
  "id": "9c9ab22b-8f3c-4c45-98eb-7cf1137095ba",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:31:37Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9c9ab22b-8f3c-4c45-98eb-7cf1137095ba/publish` → **200**

```json
{
  "command_id": "3aad9f3d-11ca-4ee9-9754-059fc1d7a82b",
  "expected_version": 0
}
```

```json
{
  "id": "9c9ab22b-8f3c-4c45-98eb-7cf1137095ba",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T14:31:37.664316Z",
  "published_at": "2026-10-30T14:31:37.664316Z",
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
  "device_ref": "sandbox-28847"
}
```

```json
{
  "challenge_id": "50b979d2-0295-4ab1-aa4e-c7f0208d80ac",
  "expires_at": "2026-10-30T14:36:37.982704948Z",
  "resend_available_at": "2026-10-30T14:31:38.982704948Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "413017",
  "sent_at": "2026-10-30T14:31:37.986130382Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50b979d2-0295-4ab1-aa4e-c7f0208d80ac",
  "code": "413017",
  "device_ref": "sandbox-28847"
}
```

```json
{
  "session_id": "ce33d02e-952d-4a0e-a3c5-4df8033e867f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTU5OCwiaWF0IjoxNzkzMzcwNjk4LCJqdGkiOiI4ODVhZTk0YS1iMGUyLTQzZTgtOTdhYS0yNzU4MzcxZTFiMjEiLCJzaWQiOiJjZTMzZDAyZS05NTJkLTRhMGUtYTNjNS00ZGY4MDMzZTg2N2YifQ.4b9a5QFPVKJ-ZSoH-chfNWvr_oPzOYKNvVnYxJTxQFU",
  "access_expires_at": "2026-10-30T14:46:38.313534917Z",
  "refresh_token": "_NkKkT0iWvE2uD7eogMiLwBkTqhYPD2r14518AU_Dq8",
  "refresh_expires_at": "2026-11-29T14:31:38.31287233Z",
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

(the car drives 71 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "ae0c0e04-f028-47e8-ab7b-68080e72e47c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:32:49Z",
    "sequence": 1793370769936
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "3a5f162e-b871-4991-a3a1-dfd96947fa20",
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
  "last_heartbeat_at": "2026-10-30T14:32:49.955391Z",
  "last_location_at": "2026-10-30T14:32:49.955391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678162481",
  "device_ref": "sandbox-2413"
}
```

```json
{
  "challenge_id": "5943df53-3522-4218-9e94-9ad66a90d125",
  "expires_at": "2026-10-30T14:37:50.258791003Z",
  "resend_available_at": "2026-10-30T14:32:51.258791003Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678162481` → **200**

```json
{
  "phone": "+380678162481",
  "audience": "CLIENT",
  "code": "705419",
  "sent_at": "2026-10-30T14:32:50.261678754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5943df53-3522-4218-9e94-9ad66a90d125",
  "code": "705419",
  "device_ref": "sandbox-2413"
}
```

```json
{
  "session_id": "affbceb7-9a99-4ee8-acce-7599b1c0734a",
  "subject": {
    "type": "CLIENT",
    "id": "2856df41-543d-4d26-8c99-260e94a6a85f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyODU2ZGY0MS01NDNkLTRkMjYtOGM5OS0yNjBlOTRhNmE4NWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNjcwLCJpYXQiOjE3OTMzNzA3NzAsImp0aSI6ImVmNDBlYzE0LTFmNzMtNDI0Mi1iODA1LWEzMDljNWQ5MWM2YyIsInNpZCI6ImFmZmJjZWI3LTlhOTktNGVlOC1hY2NlLTc1OTliMWMwNzM0YSJ9.iI4X2dWROsb3YrotQ2DLMulOZDryKBFQYfXUD2yvWeU",
  "access_expires_at": "2026-10-30T14:47:50.603661122Z",
  "refresh_token": "yyzEMvmcJOabIwdy9OJAgRmIKaixhCtzx1RBE90VmdA",
  "refresh_expires_at": "2026-11-29T14:32:50.603130101Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "068094e4-91f7-4e89-9da5-bd9fd3f3fd81",
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
  "id": "f66e402d-c289-447e-9041-d081acf6a97b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:37:50.906264Z",
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
  "command_id": "2fa98ee9-adc7-4b38-9350-ef3998afb09f",
  "quote_id": "f66e402d-c289-447e-9041-d081acf6a97b",
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
    "phone": "+380672079113"
  }
}
```

```json
{
  "id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:32:51.232188Z",
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
    "id": "e73e0c94-b9df-4dfe-af3b-c47c96ab6da7",
    "order_id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
    "expires_at": "2026-10-30T14:33:06.235894Z",
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

`POST /api/driver/v1/offers/e73e0c94-b9df-4dfe-af3b-c47c96ab6da7/accept` → **200**

```json
{
  "command_id": "0635f153-5fef-4637-be38-3b5b4c0061a3"
}
```

```json
{
  "id": "822fb244-3809-404e-b47f-a2ea3b12b984",
  "order_id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c291b2d-0874-494c-929c-de9344be648a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c291b2d-0874-494c-929c-de9344be648a",
  "order_id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
  "assignment_id": "822fb244-3809-404e-b47f-a2ea3b12b984",
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
    "phone": "+380672079113"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "82ef2580-fe5e-4c25-837e-b353f5225b15",
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
  "id": "b5d635ca-310f-497f-8bf5-b65e3f384e10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:37:52.488810Z",
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
  "command_id": "c5a09a89-2814-432c-89c9-0206afa5e54b",
  "quote_id": "b5d635ca-310f-497f-8bf5-b65e3f384e10",
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
  "id": "6a13bb4a-4d51-47a8-88db-d46e7ac09d9b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:32:52.796885Z",
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
  "command_id": "6ee3b8d6-0c00-4dcb-b24e-ad00c1a15f1c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T17:32:53Z"
}
```

```json
{
  "id": "a4ab4591-e651-4147-893b-c4aa2befc232",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:37:53.138958Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T17:32:53Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0ae68054-6ac3-4b2b-bebd-6fba8c4a7080",
  "quote_id": "a4ab4591-e651-4147-893b-c4aa2befc232",
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
  "pickup_at": "2026-10-30T17:32:53Z"
}
```

```json
{
  "id": "a5e8a02a-dd19-4057-bfa9-326720429557",
  "short_number": 26,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:32:53.451793Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:32:53Z",
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
  "command_id": "ca56c58e-17cd-4c3c-a638-2dea9affba28",
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
  "id": "bbe905a9-7161-4e69-8cf6-2bae82a5a2a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:37:53.769515Z",
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
  "command_id": "85311f91-68dc-432a-8eb0-05762a2d5b39",
  "quote_id": "bbe905a9-7161-4e69-8cf6-2bae82a5a2a8",
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
  "correlation_id": "514f9308-53e2-453f-812f-9d49c86fee78"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "a5e8a02a-dd19-4057-bfa9-326720429557",
      "short_number": 26,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T14:32:53.451793Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T17:32:53Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6a13bb4a-4d51-47a8-88db-d46e7ac09d9b",
      "short_number": 25,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T14:32:52.796885Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
      "short_number": 24,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "6a13bb4a-4d51-47a8-88db-d46e7ac09d9b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:32:52.796885Z",
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

`GET /api/rider/v1/orders/25d62d76-731d-41d7-8db6-d0013668dd7f` → **200**

```json
{
  "id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
  "short_number": 24,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "822fb244-3809-404e-b47f-a2ea3b12b984",
    "order_id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6c291b2d-0874-494c-929c-de9344be648a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T14:32:51.232188Z",
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
    "location_at": "2026-10-30T14:32:49.955391Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/25d62d76-731d-41d7-8db6-d0013668dd7f/cancel` → **200**

```json
{
  "command_id": "654ab0d3-e659-46a5-98a5-2558b8308e27",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
  "short_number": 24,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "822fb244-3809-404e-b47f-a2ea3b12b984",
    "order_id": "25d62d76-731d-41d7-8db6-d0013668dd7f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6c291b2d-0874-494c-929c-de9344be648a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T14:32:51.232188Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/6a13bb4a-4d51-47a8-88db-d46e7ac09d9b` → **200**

```json
{
  "id": "6a13bb4a-4d51-47a8-88db-d46e7ac09d9b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:32:52.796885Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6a13bb4a-4d51-47a8-88db-d46e7ac09d9b/cancel` → **200**

```json
{
  "command_id": "eddcef36-4bf6-446a-86c0-c04f785f1893",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6a13bb4a-4d51-47a8-88db-d46e7ac09d9b",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:32:52.796885Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/a5e8a02a-dd19-4057-bfa9-326720429557` → **200**

```json
{
  "id": "a5e8a02a-dd19-4057-bfa9-326720429557",
  "short_number": 26,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:32:53.451793Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:32:53Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a5e8a02a-dd19-4057-bfa9-326720429557/cancel` → **200**

```json
{
  "command_id": "3a090b94-e452-4a0b-8cf7-85d80cfd5e4a",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a5e8a02a-dd19-4057-bfa9-326720429557",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "2856df41-543d-4d26-8c99-260e94a6a85f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T14:32:53.451793Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-30T17:32:53Z",
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
  "session_id": "3a5f162e-b871-4991-a3a1-dfd96947fa20",
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
  "last_heartbeat_at": "2026-10-30T14:32:49.955391Z",
  "last_location_at": "2026-10-30T14:32:49.955391Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a5f162e-b871-4991-a3a1-dfd96947fa20/close` → **200**

```json
{
  "command_id": "6226ec6d-53a8-48ea-9c67-a9563254904e",
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

Done: orders 25d62d76-731d-41d7-8db6-d0013668dd7f, 6a13bb4a-4d51-47a8-88db-d46e7ac09d9b, a5e8a02a-dd19-4057-bfa9-326720429557.

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
  "session_id": "ed09c383-69a5-46bc-acb6-6e6842e57b35",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE2NzcsImlhdCI6MTc5MzM3MDc3NywianRpIjoiNjRiMjRhN2EtOTA5NC00NzQxLWE0MzktZjJlZDdlNTQ5MmU4Iiwic2lkIjoiZWQwOWMzODMtNjlhNS00NmJjLWFjYjYtNmU2ODQyZTU3YjM1In0.H_t0xbCVLpVTQZM8HV2vreagoL4aB9IsvSC0d7tXyEE",
  "access_expires_at": "2026-10-30T14:47:57.794687725Z",
  "refresh_token": "r7lLF7j-CtUqPzCQAuH_Y-kwSio4WFfTidtKSiCfa1w",
  "refresh_expires_at": "2026-10-31T02:32:57.793798575Z",
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
  "session_id": "cab6e6b9-49fd-423c-9e88-c0be58097841",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE2NzgsImlhdCI6MTc5MzM3MDc3OCwianRpIjoiMDA4NDg1NWMtODBiMS00NzE5LWFkMTgtMzExMTFjOWNiNmQ3Iiwic2lkIjoiY2FiNmU2YjktNDlmZC00MjNjLTllODgtYzBiZTU4MDk3ODQxIn0.-wRc85u8WNHS7TDJLMS3B7wsFNBONqSjEpkpNJOP_is",
  "access_expires_at": "2026-10-30T14:47:58.376445537Z",
  "refresh_token": "-GleeCLLxBeI0ipdYp_CxZdxyHgqdxAOGHXVslLWzVU",
  "refresh_expires_at": "2026-10-31T02:32:58.375780776Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21785"
}
```

```json
{
  "challenge_id": "65e1ecfd-de62-4b3a-b2bb-1334e09cc863",
  "expires_at": "2026-10-30T14:37:58.662230766Z",
  "resend_available_at": "2026-10-30T14:32:59.662230766Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "782449",
  "sent_at": "2026-10-30T14:32:58.665166095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65e1ecfd-de62-4b3a-b2bb-1334e09cc863",
  "code": "782449",
  "device_ref": "sandbox-21785"
}
```

```json
{
  "session_id": "03b06739-d59b-434f-8bdd-67931f064397",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTY3OCwiaWF0IjoxNzkzMzcwNzc4LCJqdGkiOiI0YzNiNmIyZS1jNzFkLTQ0NjktOWNhYS01MjZkY2VkM2YwODYiLCJzaWQiOiIwM2IwNjczOS1kNTliLTQzNGYtOGJkZC02NzkzMWYwNjQzOTcifQ.Wy0c68PgsOONkPnf_lgR2BnEEsc6-FWt34PIfTaXTko",
  "access_expires_at": "2026-10-30T14:47:58.995301603Z",
  "refresh_token": "jxFkpd3_xAB1aG9UiOtzOOnnXk5ZMFzQr0TnTXM9TgM",
  "refresh_expires_at": "2026-11-29T14:32:58.994623697Z",
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
  "command_id": "6ad0f5e5-13cf-4d85-a67c-58ce9deecd75",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:32:59Z",
    "sequence": 1793370779591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a411d75-a150-42c6-8432-890c0b88245c",
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
  "last_heartbeat_at": "2026-10-30T14:32:59.610756Z",
  "last_location_at": "2026-10-30T14:32:59.610756Z",
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
  "command_id": "73683423-ae20-422c-8272-230bbf1a4616",
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
  "effective_at": "2026-10-30T14:33:00.222688Z",
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T14:23:04.629068Z",
  "last_entries": [
    {
      "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T14:23:04.629068Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c2eed460-4d97-487e-a4c4-d11398682e26",
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
  "id": "20e807fe-301b-49ca-a87a-2f7ca0df4a74",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:38:00.831021Z",
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
  "command_id": "c03e1b11-9b07-47d8-965e-ce48fbba0a15",
  "quote_id": "20e807fe-301b-49ca-a87a-2f7ca0df4a74",
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
    "phone": "+380671118018"
  }
}
```

```json
{
  "id": "f6c809e5-d3ee-4220-9214-c57196a458e6",
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
  "created_at": "2026-10-30T14:33:01.139589Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118018"
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
    "id": "59348231-ff24-4e22-839d-82dbbfb59c77",
    "order_id": "f6c809e5-d3ee-4220-9214-c57196a458e6",
    "expires_at": "2026-10-30T14:33:16.14354Z",
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

`POST /api/driver/v1/offers/59348231-ff24-4e22-839d-82dbbfb59c77/accept` → **200**

```json
{
  "command_id": "9f53306d-9816-4e63-8a6f-b7aa04df1391"
}
```

```json
{
  "id": "94735cce-fc9b-404b-b058-093a7c5d31e8",
  "order_id": "f6c809e5-d3ee-4220-9214-c57196a458e6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6b612b7c-cfc2-4810-bbf2-03b5bbc4e9bf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6b612b7c-cfc2-4810-bbf2-03b5bbc4e9bf",
  "order_id": "f6c809e5-d3ee-4220-9214-c57196a458e6",
  "assignment_id": "94735cce-fc9b-404b-b058-093a7c5d31e8",
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
    "phone": "+380671118018"
  }
}
```

`POST /api/driver/v1/work-sessions/3a411d75-a150-42c6-8432-890c0b88245c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:33:02Z",
    "sequence": 1793370782363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a411d75-a150-42c6-8432-890c0b88245c",
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
  "last_heartbeat_at": "2026-10-30T14:33:02.38173Z",
  "last_location_at": "2026-10-30T14:33:02.38173Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6b612b7c-cfc2-4810-bbf2-03b5bbc4e9bf/arrive` → **200**

```json
{
  "command_id": "dfa918db-d8b4-4595-9861-26b600da2a35",
  "expected_version": 0
}
```

```json
{
  "id": "6b612b7c-cfc2-4810-bbf2-03b5bbc4e9bf",
  "order_id": "f6c809e5-d3ee-4220-9214-c57196a458e6",
  "assignment_id": "94735cce-fc9b-404b-b058-093a7c5d31e8",
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
  "arrived_at": "2026-10-30T14:33:02.681732Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118018"
  }
}
```

`POST /api/driver/v1/trips/6b612b7c-cfc2-4810-bbf2-03b5bbc4e9bf/start` → **200**

```json
{
  "command_id": "a1bc740b-81b0-4ab0-a92a-c55ae0c33e35",
  "expected_version": 1
}
```

```json
{
  "id": "6b612b7c-cfc2-4810-bbf2-03b5bbc4e9bf",
  "order_id": "f6c809e5-d3ee-4220-9214-c57196a458e6",
  "assignment_id": "94735cce-fc9b-404b-b058-093a7c5d31e8",
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
  "arrived_at": "2026-10-30T14:33:02.681732Z",
  "started_at": "2026-10-30T14:33:02.990782Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671118018"
  }
}
```

`POST /api/driver/v1/trips/6b612b7c-cfc2-4810-bbf2-03b5bbc4e9bf/complete` → **200**

```json
{
  "command_id": "e1599b71-eba4-422a-a465-ef95e09b0b85",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:33:03Z",
  "cash_received": true
}
```

```json
{
  "id": "6b612b7c-cfc2-4810-bbf2-03b5bbc4e9bf",
  "order_id": "f6c809e5-d3ee-4220-9214-c57196a458e6",
  "assignment_id": "94735cce-fc9b-404b-b058-093a7c5d31e8",
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
  "arrived_at": "2026-10-30T14:33:02.681732Z",
  "started_at": "2026-10-30T14:33:02.990782Z",
  "completed_at": "2026-10-30T14:33:03.313928Z",
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
  "command_id": "d56931f2-f4dc-425a-8f55-93143ea729f6",
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
  "id": "11a10ee5-df60-47ea-9f3b-f034ae8631f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:38:03.640607Z",
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
  "command_id": "77dd4c1e-2c14-46dc-8118-30f5836d6c35",
  "quote_id": "11a10ee5-df60-47ea-9f3b-f034ae8631f1",
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
    "phone": "+3806711132470"
  }
}
```

```json
{
  "id": "8f7f577b-36d5-42c4-aff1-770eca507464",
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
  "created_at": "2026-10-30T14:33:03.959782Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132470"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8f7f577b-36d5-42c4-aff1-770eca507464` → **200**

```json
{
  "id": "8f7f577b-36d5-42c4-aff1-770eca507464",
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
  "created_at": "2026-10-30T14:33:03.959782Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132470"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8f7f577b-36d5-42c4-aff1-770eca507464/cancel` → **200**

```json
{
  "command_id": "f1dc61b9-04a9-4a37-ab6a-9a54bb5a7c66",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "8f7f577b-36d5-42c4-aff1-770eca507464",
  "short_number": 28,
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
  "created_at": "2026-10-30T14:33:03.959782Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132470"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
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
  "staff_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T14:23:04.629068Z",
  "last_entries": [
    {
      "order_id": "8f7f577b-36d5-42c4-aff1-770eca507464",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T14:33:04.631437Z"
    },
    {
      "order_id": "f6c809e5-d3ee-4220-9214-c57196a458e6",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T14:33:03.320302Z"
    },
    {
      "order_id": "dc25f791-7bf7-4519-a8a5-faad5f5d03d3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T14:23:04.629068Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3a411d75-a150-42c6-8432-890c0b88245c",
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
  "last_heartbeat_at": "2026-10-30T14:33:02.38173Z",
  "last_location_at": "2026-10-30T14:33:02.38173Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3a411d75-a150-42c6-8432-890c0b88245c/close` → **200**

```json
{
  "command_id": "1bb35a55-e400-4fa3-a01b-33a448e4a94a",
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

Done: operator bonus for fulfilled f6c809e5-d3ee-4220-9214-c57196a458e6 and operator-fault cancellation 8f7f577b-36d5-42c4-aff1-770eca507464.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674993747",
  "device_ref": "sandbox-15767"
}
```

```json
{
  "challenge_id": "998e3d00-8bf2-48f8-b443-55a642267415",
  "expires_at": "2026-10-30T14:38:09.085794486Z",
  "resend_available_at": "2026-10-30T14:33:10.085794486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674993747` → **200**

```json
{
  "phone": "+380674993747",
  "audience": "CLIENT",
  "code": "055283",
  "sent_at": "2026-10-30T14:33:09.089018864Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675687931",
  "device_ref": "sandbox-1570",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ad9da08b-96f3-4386-87fb-57dea63fb5bf",
  "expires_at": "2026-10-30T14:38:10.611460347Z",
  "resend_available_at": "2026-10-30T14:33:11.611460347Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675687931` → **200**

```json
{
  "phone": "+380675687931",
  "audience": "CLIENT",
  "code": "486213",
  "sent_at": "2026-10-30T14:33:10.613811585Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675687931",
  "device_ref": "sandbox-21925",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2a22cee8-4390-4eba-8859-8990b90f723d",
  "expires_at": "2026-10-30T14:38:12.154333864Z",
  "resend_available_at": "2026-10-30T14:33:13.154333864Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675687931` → **200**

```json
{
  "phone": "+380675687931",
  "audience": "CLIENT",
  "code": "147960",
  "sent_at": "2026-10-30T14:33:12.158536394Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679440000",
  "device_ref": "sandbox-11332"
}
```

```json
{
  "challenge_id": "8a3b1b8f-9272-4b2e-b522-31b2dd80e04b",
  "expires_at": "2026-10-30T14:38:13.691944177Z",
  "resend_available_at": "2026-10-30T14:33:14.691944177Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679440000",
  "device_ref": "sandbox-18241"
}
```

```json
{
  "challenge_id": "742d525d-3419-4483-b037-c81f1290f955",
  "expires_at": "2026-10-30T14:38:15.197335258Z",
  "resend_available_at": "2026-10-30T14:33:16.197335258Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679440000` → **200**

```json
{
  "phone": "+380679440000",
  "audience": "CLIENT",
  "code": "857946",
  "sent_at": "2026-10-30T14:33:15.200672876Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679440000",
  "device_ref": "sandbox-30722",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "d3c59c39-0428-43cf-97a6-e79df90959ea",
  "expires_at": "2026-10-30T14:38:16.724984764Z",
  "resend_available_at": "2026-10-30T14:33:17.724984764Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679440000` → **200**

```json
{
  "phone": "+380679440000",
  "audience": "CLIENT",
  "code": "873043",
  "sent_at": "2026-10-30T14:33:16.728214378Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380679440000",
  "device_ref": "sandbox-10400",
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
  "correlation_id": "6e3f4895-ecf7-4b96-98ae-94d7f30c77f2",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000023919"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "b241cdc4-d158-4ca3-9802-749e005434ed"
}
```

`GET /sandbox/v1/otp?phone=%2B442000023919` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120025190"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "ccedb6f5-58ac-400f-9287-3c2ee824cfcd"
}
```

`GET /sandbox/v1/otp?phone=%2B37120025190` → **404**

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
  "session_id": "0024dd27-7338-4a2a-a5e2-78028f98a423",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE2OTksImlhdCI6MTc5MzM3MDc5OSwianRpIjoiZThiYjc2ZTItNmMwOC00NTMwLWFmOTAtNWM2N2YwODllMmRlIiwic2lkIjoiMDAyNGRkMjctNzMzOC00YTJhLWE1ZTItNzgwMjhmOThhNDIzIn0.YWdp3OHwbTQdQikQWBEf-bfg2JdPdcd4SLTx9WSI_5Q",
  "access_expires_at": "2026-10-30T14:48:19.493191146Z",
  "refresh_token": "VH8Wu2XmDX-5lCmQhHx9Gh5_2cGlGlK1oH22_BRRc6M",
  "refresh_expires_at": "2026-10-31T02:33:19.492596877Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679440000` → **200**

```json
{
  "deliveries": [
    {
      "id": "f3075e6a-a515-4712-a9da-00aa6a169d09",
      "challenge_id": "d3c59c39-0428-43cf-97a6-e79df90959ea",
      "phone": "+380679440000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-18ce812a-d1de-449d-89bc-05b2f18a2851",
      "error": null,
      "attempted_at": "2026-10-30T14:33:16.728711Z"
    },
    {
      "id": "4c48feb8-9490-455d-9495-fd613abf8676",
      "challenge_id": "742d525d-3419-4483-b037-c81f1290f955",
      "phone": "+380679440000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e7e061ad-4285-4312-a00a-a2f927c77188",
      "error": null,
      "attempted_at": "2026-10-30T14:33:15.201052Z"
    },
    {
      "id": "8cef1426-152b-443f-abff-aba85bb758dd",
      "challenge_id": "8a3b1b8f-9272-4b2e-b522-31b2dd80e04b",
      "phone": "+380679440000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T14:33:13.695173Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679440000` → **200**

```json
{
  "phone": "+380679440000",
  "audience": "CLIENT",
  "code": "873043",
  "sent_at": "2026-10-30T14:33:16.728214378Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675687931` → **200**

```json
{
  "deliveries": [
    {
      "id": "dd4e41e0-62f5-499e-9e7d-54036647961a",
      "challenge_id": "2a22cee8-4390-4eba-8859-8990b90f723d",
      "phone": "+380675687931",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-81d77f15-ff8d-4367-8431-77445cfae1be",
      "error": null,
      "attempted_at": "2026-10-30T14:33:12.158825Z"
    },
    {
      "id": "badec589-3669-484c-8672-0ff1d706d1df",
      "challenge_id": "ad9da08b-96f3-4386-87fb-57dea63fb5bf",
      "phone": "+380675687931",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b17b1ce4-784a-4c30-bcaa-32b5e6506c09",
      "error": null,
      "attempted_at": "2026-10-30T14:33:10.614261Z"
    }
  ]
}
```

Done: SMS to +380674993747; SMS then a call to +380675687931; a failed SMS, two calls and a refused third to +380679440000; +44 and +371 refused.

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
  "session_id": "0230ab0d-44eb-4d54-88cd-82fd03f49ebc",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3MDAsImlhdCI6MTc5MzM3MDgwMCwianRpIjoiMjYwODUzNTEtMjhhNC00OWRiLWI2MTYtNTEwN2U2NzAzNTMxIiwic2lkIjoiMDIzMGFiMGQtNDRlYi00ZDU0LTg4Y2QtODJmZDAzZjQ5ZWJjIn0.MnOmHt6CjuyAjmsFcTt--PONyXvSvZ15q5lCHqZrYSU",
  "access_expires_at": "2026-10-30T14:48:20.730105936Z",
  "refresh_token": "OKkzoHXF1t8lNXt5jAk2Bi0dGPXDVm_tW0gYG-I54JE",
  "refresh_expires_at": "2026-10-31T02:33:20.729535592Z",
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
  "session_id": "b4924c84-dfa7-4a6c-b1c2-54e226215ebb",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3MDEsImlhdCI6MTc5MzM3MDgwMSwianRpIjoiODc1MzA2NDUtMzFkMy00MDYyLWFmN2MtOWY4NWRiN2YxMTBmIiwic2lkIjoiYjQ5MjRjODQtZGZhNy00YTZjLWIxYzItNTRlMjI2MjE1ZWJiIn0.zn9RJHEt32Z9XNjbrKF4fiPBvgM3w74AeN4pTpNHkQ4",
  "access_expires_at": "2026-10-30T14:48:21.33725489Z",
  "refresh_token": "eb_VBI6kptwxKCqK4HSfe8Jzf5QahXuuekl8wAYSixk",
  "refresh_expires_at": "2026-10-31T02:33:21.336603966Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
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

`POST /api/admin/v1/staff-extensions/1fd239e2-3bcd-4466-a66b-062008a1dc3d` → **200**

```json
{
  "command_id": "811c89db-c305-4ebe-bd09-22abf2630b64",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "1a1f60a7-e983-44e0-9ff2-4af326a3c85a",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T14:33:22.622841Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T14:33:22.622841Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bc5d7d36-1ec2-49da-ad9b-5535e89fabe6",
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
  "id": "2c6cd6ea-0133-46c1-8c9f-7f51253dcdbe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:38:23.229808Z",
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
  "command_id": "1325346e-51ca-401b-abc0-dd8b3e49c62e",
  "quote_id": "2c6cd6ea-0133-46c1-8c9f-7f51253dcdbe",
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
    "phone": "+380676988784"
  }
}
```

```json
{
  "id": "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867",
  "short_number": 29,
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
  "created_at": "2026-10-30T14:33:23.532248Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676988784"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/dec2a0a0-4ff4-4f11-bdce-7fdc92b43867/calls` → **201**

```json
{
  "command_id": "9a34128a-3d11-4e83-9370-59373c30dea2",
  "to": "CALLER"
}
```

```json
{
  "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "order_ids": [
    "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867"
  ],
  "started_at": "2026-10-30T14:33:23.885987Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/dec2a0a0-4ff4-4f11-bdce-7fdc92b43867/calls` → **201**

```json
{
  "command_id": "9a34128a-3d11-4e83-9370-59373c30dea2",
  "to": "CALLER"
}
```

```json
{
  "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "order_ids": [
    "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867"
  ],
  "started_at": "2026-10-30T14:33:23.885987Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676988784",
    "at": "2026-10-30T14:33:23.888514247Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.9478",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "8b9e4542-4f92-42a7-b197-88fbd775518d"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=dec2a0a0-4ff4-4f11-bdce-7fdc92b43867` → **200**

```json
{
  "calls": [
    {
      "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [
        "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867"
      ],
      "started_at": "2026-10-30T14:33:23.885987Z",
      "answered_at": "2026-10-30T14:33:24.618498Z",
      "ended_at": "2026-10-30T14:33:24.642385Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=dec2a0a0-4ff4-4f11-bdce-7fdc92b43867` → **200**

```json
{
  "calls": [
    {
      "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [
        "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867"
      ],
      "started_at": "2026-10-30T14:33:23.885987Z",
      "answered_at": "2026-10-30T14:33:24.618498Z",
      "ended_at": "2026-10-30T14:33:24.642385Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=dec2a0a0-4ff4-4f11-bdce-7fdc92b43867` → **200**

```json
{
  "calls": [
    {
      "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [
        "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867"
      ],
      "started_at": "2026-10-30T14:33:23.885987Z",
      "answered_at": "2026-10-30T14:33:24.618498Z",
      "ended_at": "2026-10-30T14:33:24.642385Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=dec2a0a0-4ff4-4f11-bdce-7fdc92b43867` → **200**

```json
{
  "calls": [
    {
      "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [
        "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867"
      ],
      "started_at": "2026-10-30T14:33:23.885987Z",
      "answered_at": "2026-10-30T14:33:24.618498Z",
      "ended_at": "2026-10-30T14:33:24.642385Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=dec2a0a0-4ff4-4f11-bdce-7fdc92b43867` → **200**

```json
{
  "calls": [
    {
      "id": "8b9e4542-4f92-42a7-b197-88fbd775518d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "order_ids": [
        "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867"
      ],
      "started_at": "2026-10-30T14:33:23.885987Z",
      "answered_at": "2026-10-30T14:33:24.618498Z",
      "ended_at": "2026-10-30T14:33:24.642385Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T14:33:33.873754Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/dec2a0a0-4ff4-4f11-bdce-7fdc92b43867` → **200**

```json
{
  "id": "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867",
  "short_number": 29,
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
  "created_at": "2026-10-30T14:33:23.532248Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676988784"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dec2a0a0-4ff4-4f11-bdce-7fdc92b43867/cancel` → **200**

```json
{
  "command_id": "17950a60-5270-4726-b315-4fe9b27f69de",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dec2a0a0-4ff4-4f11-bdce-7fdc92b43867",
  "short_number": 29,
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
  "created_at": "2026-10-30T14:33:23.532248Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676988784"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
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
  "command_id": "64cbb326-1cc6-4f54-abef-95f608f2fe28",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T14:33:34.927469Z",
  "extension": "101"
}
```

Done: outgoing call 8b9e4542-4f92-42a7-b197-88fbd775518d from order dec2a0a0-4ff4-4f11-bdce-7fdc92b43867, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633207782",
  "device_ref": "sandbox-20942"
}
```

```json
{
  "challenge_id": "3c74b377-5655-4ca6-80f0-4cad0a2693d6",
  "expires_at": "2026-10-30T14:38:35.238047607Z",
  "resend_available_at": "2026-10-30T14:33:36.238047607Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633207782` → **200**

```json
{
  "phone": "+380633207782",
  "audience": "CLIENT",
  "code": "168216",
  "sent_at": "2026-10-30T14:33:35.240826244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c74b377-5655-4ca6-80f0-4cad0a2693d6",
  "code": "168216",
  "device_ref": "sandbox-20942"
}
```

```json
{
  "session_id": "9a18e12b-4305-47af-9e4b-ef15433765d7",
  "subject": {
    "type": "CLIENT",
    "id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjQ1MGNjMS00Y2ZiLTQ4OGQtODBmZS04ZmRhZDM0ZGMzYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNzE1LCJpYXQiOjE3OTMzNzA4MTUsImp0aSI6IjBmYTVjMmRlLTc4ZDAtNGY3Ni1iYjMxLWRmMzY5MmYzY2IzYyIsInNpZCI6IjlhMThlMTJiLTQzMDUtNDdhZi05ZTRiLWVmMTU0MzM3NjVkNyJ9.Wv8c3Uqvd7KBrUAFgkNLCCoCpStM5MykG0zjtc0nNcE",
  "access_expires_at": "2026-10-30T14:48:35.569946733Z",
  "refresh_token": "xp81p9egu8LXvysQmJUdJ_QPBiOChy-pmh-3KRM-LIs",
  "refresh_expires_at": "2026-11-29T14:33:35.569358267Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4",
  "session_id": "9a18e12b-4305-47af-9e4b-ef15433765d7",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633207782",
  "device_ref": "sandbox-15907"
}
```

```json
{
  "challenge_id": "43769e98-ed5e-49dd-9b0a-2fb4d6f5a206",
  "expires_at": "2026-10-30T14:38:38.15971087Z",
  "resend_available_at": "2026-10-30T14:33:39.15971087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633207782` → **200**

```json
{
  "phone": "+380633207782",
  "audience": "CLIENT",
  "code": "805556",
  "sent_at": "2026-10-30T14:33:38.162309934Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43769e98-ed5e-49dd-9b0a-2fb4d6f5a206",
  "code": "805556",
  "device_ref": "sandbox-15907"
}
```

```json
{
  "session_id": "7eb955e8-d80b-4450-ab19-a0288befad31",
  "subject": {
    "type": "CLIENT",
    "id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjQ1MGNjMS00Y2ZiLTQ4OGQtODBmZS04ZmRhZDM0ZGMzYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNzE4LCJpYXQiOjE3OTMzNzA4MTgsImp0aSI6IjI0Yzg3YjhmLTk4OTYtNGFiMy05ZGJiLTVjMWQwOTA0M2EwYyIsInNpZCI6IjdlYjk1NWU4LWQ4MGItNDQ1MC1hYjE5LWEwMjg4YmVmYWQzMSJ9.J_xt8Drr5QCR4Dqqni6XJa59R8WjEHZpXTVHRj8fapg",
  "access_expires_at": "2026-10-30T14:48:38.489339294Z",
  "refresh_token": "Ad5cALDZG9KR6loFd73UGH9A9Ed6w5tH3gDE1jIP-6A",
  "refresh_expires_at": "2026-11-29T14:33:38.488662541Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "7718af85-25de-480a-8bb7-fad4c846028a",
  "expires_at": "2026-10-30T14:38:40.786683988Z",
  "resend_available_at": "2026-10-30T14:33:41.786683988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633207782` → **200**

```json
{
  "phone": "+380633207782",
  "audience": "CLIENT",
  "code": "594809",
  "sent_at": "2026-10-30T14:33:40.78956296Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380634091110"
}
```

```json
{
  "challenge_id": "dc2d89d1-105a-4442-8297-72a5501c7933",
  "expires_at": "2026-10-30T14:38:41.108889584Z",
  "resend_available_at": "2026-10-30T14:33:42.108889584Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634091110` → **200**

```json
{
  "phone": "+380634091110",
  "audience": "CLIENT",
  "code": "168095",
  "sent_at": "2026-10-30T14:33:41.111737055Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "afa9d95d-6354-47c2-b80d-847fb234bc8f",
  "current_challenge_id": "7718af85-25de-480a-8bb7-fad4c846028a",
  "current_code": "000000",
  "new_challenge_id": "dc2d89d1-105a-4442-8297-72a5501c7933",
  "new_code": "168095"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "095ed7f1-417a-48c1-af7b-9b529546412c"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "5863f97e-5ffe-4a9e-8a5a-0e3b4559b3fe",
  "current_challenge_id": "7718af85-25de-480a-8bb7-fad4c846028a",
  "current_code": "594809",
  "new_challenge_id": "dc2d89d1-105a-4442-8297-72a5501c7933",
  "new_code": "168095"
}
```

```json
{
  "subject_id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4",
  "phone": "+380634091110",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4",
  "session_id": "9a18e12b-4305-47af-9e4b-ef15433765d7",
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
  "correlation_id": "48e6dfd5-2eb7-420b-8001-b64ff4db9ed5"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634091110",
  "device_ref": "sandbox-16463"
}
```

```json
{
  "challenge_id": "16286446-d900-46f6-bc32-aa451bb04ca7",
  "expires_at": "2026-10-30T14:38:44.655752827Z",
  "resend_available_at": "2026-10-30T14:33:45.655752827Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634091110` → **200**

```json
{
  "phone": "+380634091110",
  "audience": "CLIENT",
  "code": "575660",
  "sent_at": "2026-10-30T14:33:44.658649305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "16286446-d900-46f6-bc32-aa451bb04ca7",
  "code": "575660",
  "device_ref": "sandbox-16463"
}
```

```json
{
  "session_id": "565c587c-0342-467d-ad4a-2091408584aa",
  "subject": {
    "type": "CLIENT",
    "id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjQ1MGNjMS00Y2ZiLTQ4OGQtODBmZS04ZmRhZDM0ZGMzYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNzI0LCJpYXQiOjE3OTMzNzA4MjQsImp0aSI6IjU0Y2QwNjViLTRjZDQtNDUwYS04MGJmLTQ3MGY5MjQ3OTNhMCIsInNpZCI6IjU2NWM1ODdjLTAzNDItNDY3ZC1hZDRhLTIwOTE0MDg1ODRhYSJ9.OT2fa8w8LjmRdKQrphTNUNw8QBKeX0Dphx4EDcSUnQY",
  "access_expires_at": "2026-10-30T14:48:44.98266401Z",
  "refresh_token": "W88nYpOBcatYFyPRB-xdmogNDMt_qeZ80q4Kf4DHBug",
  "refresh_expires_at": "2026-11-29T14:33:44.982098745Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4",
  "session_id": "565c587c-0342-467d-ad4a-2091408584aa",
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
  "session_id": "912803f6-8d63-450b-b4e8-3f6f3f4c8c51",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3MjUsImlhdCI6MTc5MzM3MDgyNSwianRpIjoiYmI3YzcyYTgtMGIyMy00ZWViLWE5ZjYtMGMxZDkwNzMyN2YzIiwic2lkIjoiOTEyODAzZjYtOGQ2My00NTBiLWI0ZTgtM2Y2ZjNmNGM4YzUxIn0.ZON7U0A5xBkTj484kCekvCr2BZlhwOSt-xtuX_fw5Sc",
  "access_expires_at": "2026-10-30T14:48:45.857336607Z",
  "refresh_token": "3keBZNYF4hwLCeaMowRwNynR1qbSwfUoXm5yqXJdbm8",
  "refresh_expires_at": "2026-10-31T02:33:45.856482507Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/7b450cc1-4cfb-488d-80fe-8fdad34dc3c4` → **200**

```json
{
  "client": {
    "id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4",
    "phone": "+380634091110",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T14:33:35.56742Z",
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

`POST /api/admin/v1/clients/7b450cc1-4cfb-488d-80fe-8fdad34dc3c4/phone/new-code` → **201**

```json
{
  "phone": "+380634827836"
}
```

```json
{
  "challenge_id": "5321ea27-1b43-4716-86cb-ac82589b8b17",
  "expires_at": "2026-10-30T14:38:46.520807984Z",
  "resend_available_at": "2026-10-30T14:33:47.520807984Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634827836` → **200**

```json
{
  "phone": "+380634827836",
  "audience": "CLIENT",
  "code": "573417",
  "sent_at": "2026-10-30T14:33:46.524063852Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/7b450cc1-4cfb-488d-80fe-8fdad34dc3c4/phone` → **422**

```json
{
  "command_id": "37475db5-dd85-4bea-9eef-cee926c41882",
  "expected_version": 3,
  "new_challenge_id": "5321ea27-1b43-4716-86cb-ac82589b8b17",
  "new_code": "573418",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/7b450cc1-4cfb-488d-80fe-8fdad34dc3c4/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "140911b4-1c81-446c-a5fd-9c485095906a"
}
```

`POST /api/admin/v1/clients/7b450cc1-4cfb-488d-80fe-8fdad34dc3c4/phone` → **400**

```json
{
  "command_id": "51c88f5a-0f60-4bfd-8453-1daa196d64ee",
  "expected_version": 3,
  "new_challenge_id": "5321ea27-1b43-4716-86cb-ac82589b8b17",
  "new_code": "573417",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/7b450cc1-4cfb-488d-80fe-8fdad34dc3c4/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d711720c-d151-4882-bd50-05fe1bac722c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/7b450cc1-4cfb-488d-80fe-8fdad34dc3c4/phone` → **200**

```json
{
  "command_id": "f047ea56-0efb-4dea-99e6-d6d9204497ac",
  "expected_version": 3,
  "new_challenge_id": "5321ea27-1b43-4716-86cb-ac82589b8b17",
  "new_code": "573417",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4",
  "phone": "+380634827836",
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
  "correlation_id": "103a0b8c-a70b-4462-95f2-a0fb50ad33bd"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634827836",
  "device_ref": "sandbox-15870"
}
```

```json
{
  "challenge_id": "d88df869-1949-4735-8125-23a53fbd94fd",
  "expires_at": "2026-10-30T14:38:48.111178056Z",
  "resend_available_at": "2026-10-30T14:33:49.111178056Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634827836` → **200**

```json
{
  "phone": "+380634827836",
  "audience": "CLIENT",
  "code": "932642",
  "sent_at": "2026-10-30T14:33:48.114195629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d88df869-1949-4735-8125-23a53fbd94fd",
  "code": "932642",
  "device_ref": "sandbox-15870"
}
```

```json
{
  "session_id": "165699fb-46b6-4abc-ada8-1eb4a560044a",
  "subject": {
    "type": "CLIENT",
    "id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YjQ1MGNjMS00Y2ZiLTQ4OGQtODBmZS04ZmRhZDM0ZGMzYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNzI4LCJpYXQiOjE3OTMzNzA4MjgsImp0aSI6ImZhNGZmOWU4LTNkOGUtNGJhNC05YmVmLTVmZWUxOWQ5NzY1NiIsInNpZCI6IjE2NTY5OWZiLTQ2YjYtNGFiYy1hZGE4LTFlYjRhNTYwMDQ0YSJ9.tMbdjlHjrVdqLFjVdIVmZ6FUJIR2YZqu92kNWc7JSyE",
  "access_expires_at": "2026-10-30T14:48:48.44916006Z",
  "refresh_token": "X1SxMtBnbiiPmuJFEWko3VZgxDg95SlaDriRE4k9MDQ",
  "refresh_expires_at": "2026-11-29T14:33:48.448541825Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7b450cc1-4cfb-488d-80fe-8fdad34dc3c4",
  "session_id": "165699fb-46b6-4abc-ada8-1eb4a560044a",
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
  "phone": "+380634114075",
  "device_ref": "sandbox-29089"
}
```

```json
{
  "challenge_id": "5c75c16c-3602-445b-a5b2-888e45de3641",
  "expires_at": "2026-10-30T14:38:49.055755026Z",
  "resend_available_at": "2026-10-30T14:33:50.055755026Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634114075` → **200**

```json
{
  "phone": "+380634114075",
  "audience": "CLIENT",
  "code": "860492",
  "sent_at": "2026-10-30T14:33:49.058895689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c75c16c-3602-445b-a5b2-888e45de3641",
  "code": "860492",
  "device_ref": "sandbox-29089"
}
```

```json
{
  "session_id": "f7acdd57-41a2-4e4d-b83d-619ccd4abcbb",
  "subject": {
    "type": "CLIENT",
    "id": "9176b576-fce7-4136-b98d-ef5371e5edb3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTc2YjU3Ni1mY2U3LTQxMzYtYjk4ZC1lZjUzNzFlNWVkYjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNzI5LCJpYXQiOjE3OTMzNzA4MjksImp0aSI6ImMwYzc2OWZhLWU3MGYtNDMwNS1hMmJmLWU0NTQ4ODI3Njk0YiIsInNpZCI6ImY3YWNkZDU3LTQxYTItNGU0ZC1iODNkLTYxOWNjZDRhYmNiYiJ9.-ZXc7qOGtGHwOhzz68omFjHp_gN9L5jvFkqYktDEj5k",
  "access_expires_at": "2026-10-30T14:48:49.415173664Z",
  "refresh_token": "uOzA-wexcRFwwxHqssGscCRhj40JyL6PDCEngJasBe8",
  "refresh_expires_at": "2026-11-29T14:33:49.414480031Z",
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
  "session_id": "9fac62da-2d76-4ca8-8089-0712119c0bb1",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3MzAsImlhdCI6MTc5MzM3MDgzMCwianRpIjoiMjE1MTc5ZDUtMTZkMC00MGVjLWJmZDctOWQ2ZmU0NGY1NGJmIiwic2lkIjoiOWZhYzYyZGEtMmQ3Ni00Y2E4LTgwODktMDcxMjExOWMwYmIxIn0.vbit4s-Pv9HS-yqRor6_HJpGLe8Ur7DVOxymCFeZSLc",
  "access_expires_at": "2026-10-30T14:48:50.633191632Z",
  "refresh_token": "ZFumE7fYOe9xPfCegcoBtYS6AJf9XER63DBu7tsJypo",
  "refresh_expires_at": "2026-10-31T02:33:50.632473061Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634114075` → **200**

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
  "correlation_id": "1ca44b67-6530-45c4-88bb-267717afaed2"
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
  "session_id": "389fe11c-3802-42f2-902d-ad3acc4c1391",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3MzEsImlhdCI6MTc5MzM3MDgzMSwianRpIjoiMGVjM2VhYjItMmM2Zi00Nzc3LWE3YzQtMzFkMTAwNTQ0M2FhIiwic2lkIjoiMzg5ZmUxMWMtMzgwMi00MmYyLTkwMmQtYWQzYWNjNGMxMzkxIn0.IaPAeFciFo05sZIt3Cp5gWua341fF8l-4y3hThg42YE",
  "access_expires_at": "2026-10-30T14:48:51.893627729Z",
  "refresh_token": "xzgPZZXzRmPNJsz_ZriNec9L5KWys2gcPIEWaHhNTxo",
  "refresh_expires_at": "2026-10-31T02:33:51.892967437Z",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T14:19:05.171233Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "fe2e096f-107e-448a-96cd-c63116fcb6c3",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T14:33:52.504507541Z"
}
```

## The rider books the airport for 2026-10-30T17:33:51Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600567032",
  "device_ref": "sandbox-23958"
}
```

```json
{
  "challenge_id": "ade97503-957a-487b-9747-0ee9bd35e9d4",
  "expires_at": "2026-10-30T14:38:52.82604215Z",
  "resend_available_at": "2026-10-30T14:33:53.82604215Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600567032` → **200**

```json
{
  "phone": "+48600567032",
  "audience": "CLIENT",
  "code": "990891",
  "sent_at": "2026-10-30T14:33:52.82915725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ade97503-957a-487b-9747-0ee9bd35e9d4",
  "code": "990891",
  "device_ref": "sandbox-23958"
}
```

```json
{
  "session_id": "e52645b7-fb7d-4777-b773-fae88dd188a2",
  "subject": {
    "type": "CLIENT",
    "id": "845f1cc6-9a02-4ea6-aa31-9953dbd7120c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDVmMWNjNi05YTAyLTRlYTYtYWEzMS05OTUzZGJkNzEyMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNzMzLCJpYXQiOjE3OTMzNzA4MzMsImp0aSI6IjEwMmJkZGU4LTgwNjctNDFlOS05MmYyLWZmM2Q3NzhmZDc5ZiIsInNpZCI6ImU1MjY0NWI3LWZiN2QtNDc3Ny1iNzczLWZhZTg4ZGQxODhhMiJ9.355v79t-v9yBBNIxX7XqqcKXjmPJQBQiYlYoe5jjKfE",
  "access_expires_at": "2026-10-30T14:48:53.151862252Z",
  "refresh_token": "wg5rQaTvbp6DUsi_O8ZQI9VBnPybQt2YLwve-2JN36o",
  "refresh_expires_at": "2026-11-29T14:33:53.151304326Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "211ba78c-69ea-412e-8b0f-a543af3bb460",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T17:33:51Z"
}
```

```json
{
  "id": "3db2ea9d-ba56-44d8-bcc4-ba6890f7fc39",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:38:53.445585Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T17:33:51Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "17050ca6-fc97-4021-81f6-21308b282ddc",
  "quote_id": "3db2ea9d-ba56-44d8-bcc4-ba6890f7fc39",
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
  "pickup_at": "2026-10-30T17:33:51Z"
}
```

```json
{
  "id": "6dbb6352-ed40-456f-a95d-334943132322",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "845f1cc6-9a02-4ea6-aa31-9953dbd7120c",
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
  "created_at": "2026-10-30T14:33:53.761575Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T17:33:51Z",
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
  "device_ref": "sandbox-15604"
}
```

```json
{
  "challenge_id": "32ff0c79-d51c-4c4e-a340-54330efbce79",
  "expires_at": "2026-10-30T14:38:54.086668333Z",
  "resend_available_at": "2026-10-30T14:33:55.086668333Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "658795",
  "sent_at": "2026-10-30T14:33:54.089497763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32ff0c79-d51c-4c4e-a340-54330efbce79",
  "code": "658795",
  "device_ref": "sandbox-15604"
}
```

```json
{
  "session_id": "9ea52ed7-cf21-4a4f-9c71-51e114b8cb56",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTczNCwiaWF0IjoxNzkzMzcwODM0LCJqdGkiOiJmNjIwZGNhMy01MjA2LTQzNGMtYmQxNy01ZGMxYjFhY2Q4MjAiLCJzaWQiOiI5ZWE1MmVkNy1jZjIxLTRhNGYtOWM3MS01MWUxMTRiOGNiNTYifQ.Yxh_7zAK8z7DAHApl_BtmYrEDWvCKQ-51HksIggQmJI",
  "access_expires_at": "2026-10-30T14:48:54.41766671Z",
  "refresh_token": "N3MriVqlitqiId_YBoZz5KU0ysLPIy2-bJ8BLrdJZKI",
  "refresh_expires_at": "2026-11-29T14:33:54.41698075Z",
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
  "command_id": "ecbfaba4-5066-4084-a87f-c9e4e4ee35be",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:33:55Z",
    "sequence": 1793370835433
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e3d95442-8054-4ded-b64f-b136eac9db76",
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
  "last_heartbeat_at": "2026-10-30T14:33:55.06229Z",
  "last_location_at": "2026-10-30T14:33:55.06229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "6dbb6352-ed40-456f-a95d-334943132322",
      "short_number": 30,
      "pickup_at": "2026-10-30T17:33:51Z",
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

`POST /api/driver/v1/preorders/6dbb6352-ed40-456f-a95d-334943132322/reserve` → **200**

```json
{
  "command_id": "a991e036-ad9f-4ac3-823a-5f65e4dd1ef8"
}
```

```json
{
  "id": "4e748cc7-bf35-4699-a64a-055d4d2bdcc4",
  "state": "RESERVED",
  "order": {
    "order_id": "6dbb6352-ed40-456f-a95d-334943132322",
    "short_number": 30,
    "pickup_at": "2026-10-30T17:33:51Z",
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
  "reserved_at": "2026-10-30T14:33:55.675718Z",
  "confirm_from": "2026-10-30T17:03:51Z",
  "confirm_until": "2026-10-30T17:13:51Z",
  "drop_until": "2026-10-30T16:33:51Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "4e748cc7-bf35-4699-a64a-055d4d2bdcc4",
      "state": "RESERVED",
      "order": {
        "order_id": "6dbb6352-ed40-456f-a95d-334943132322",
        "short_number": 30,
        "pickup_at": "2026-10-30T17:33:51Z",
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
      "reserved_at": "2026-10-30T14:33:55.675718Z",
      "confirm_from": "2026-10-30T17:03:51Z",
      "confirm_until": "2026-10-30T17:13:51Z",
      "drop_until": "2026-10-30T16:33:51Z"
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
      "id": "4e748cc7-bf35-4699-a64a-055d4d2bdcc4",
      "state": "RESERVED",
      "order": {
        "order_id": "6dbb6352-ed40-456f-a95d-334943132322",
        "short_number": 30,
        "pickup_at": "2026-10-30T17:33:51Z",
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
      "reserved_at": "2026-10-30T14:33:55.675718Z",
      "confirm_from": "2026-10-30T17:03:51Z",
      "confirm_until": "2026-10-30T17:13:51Z",
      "drop_until": "2026-10-30T16:33:51Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/4e748cc7-bf35-4699-a64a-055d4d2bdcc4/confirm` → **409**

```json
{
  "command_id": "c06e7878-2ce0-4f49-85d5-e01364ce85df"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/4e748cc7-bf35-4699-a64a-055d4d2bdcc4/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c413a6e2-a7db-459b-b0aa-2dc8f1199bb5"
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
  "session_id": "3c1e03d3-00f2-4f55-b536-2eda1a8d4e8f",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3MzcsImlhdCI6MTc5MzM3MDgzNywianRpIjoiMGJlZDBhYWUtYmVmNS00Yjg2LWFjOTctOTI0YTkxMDY4MjRmIiwic2lkIjoiM2MxZTAzZDMtMDBmMi00ZjU1LWI1MzYtMmVkYTFhOGQ0ZThmIn0.WgHzFI4y-3q3J16rlaGAMPpDSDL8F6RXLMm6-8vZGCE",
  "access_expires_at": "2026-10-30T14:48:57.216790013Z",
  "refresh_token": "cNQLWeFyWeQGCnXOXA9tJYLPewY4LzrxKQX7Lw3SYtQ",
  "refresh_expires_at": "2026-10-31T02:33:57.216096209Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6dbb6352-ed40-456f-a95d-334943132322` → **200**

```json
{
  "id": "6dbb6352-ed40-456f-a95d-334943132322",
  "short_number": 30,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "845f1cc6-9a02-4ea6-aa31-9953dbd7120c",
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
  "created_at": "2026-10-30T14:33:53.761575Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T17:33:51Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "4e748cc7-bf35-4699-a64a-055d4d2bdcc4",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T14:33:55.675718Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6dbb6352-ed40-456f-a95d-334943132322/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T14:33:53.763079Z",
      "actor": {
        "type": "CLIENT",
        "id": "845f1cc6-9a02-4ea6-aa31-9953dbd7120c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "6dbb6352-ed40-456f-a95d-334943132322",
        "preorder": true,
        "quote_id": "3db2ea9d-ba56-44d8-bcc4-ba6890f7fc39",
        "pickup_at": "2026-10-30T17:33:51Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "11718b99-546c-4854-829a-62ae7374cc91"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T14:33:55.677058Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6dbb6352-ed40-456f-a95d-334943132322",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "4e748cc7-bf35-4699-a64a-055d4d2bdcc4"
      },
      "correlation_id": "59f47ad3-13f4-4faa-9a5d-1752d230b44b"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 6dbb6352-ed40-456f-a95d-334943132322, reservation 4e748cc7-bf35-4699-a64a-055d4d2bdcc4.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15462"
}
```

```json
{
  "challenge_id": "b9c6c014-da39-4505-9947-0ad84907c178",
  "expires_at": "2026-10-30T14:38:58.170136864Z",
  "resend_available_at": "2026-10-30T14:33:59.170136864Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "573455",
  "sent_at": "2026-10-30T14:33:58.173029463Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9c6c014-da39-4505-9947-0ad84907c178",
  "code": "573455",
  "device_ref": "sandbox-15462"
}
```

```json
{
  "session_id": "1588cd8e-ae87-44ae-8474-c991393286f2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTczOCwiaWF0IjoxNzkzMzcwODM4LCJqdGkiOiIwYTRlNTQ0Ni02OTExLTQ2YTktODllOS0yMWNkNmUwZTE5MzciLCJzaWQiOiIxNTg4Y2Q4ZS1hZTg3LTQ0YWUtODQ3NC1jOTkxMzkzMjg2ZjIifQ.UayvwObM-6KCANN0BvSnZW-YGKKY6GQ8fCilVPRq_EU",
  "access_expires_at": "2026-10-30T14:48:58.501395793Z",
  "refresh_token": "reUfRAAVyVJd_PtmCTIOrqJaNoMp70_wiSqeLIFibb0",
  "refresh_expires_at": "2026-11-29T14:33:58.500743096Z",
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
  "command_id": "87c0c27a-4cc2-4208-93c9-0f57b096e093",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:33:59Z",
    "sequence": 1793370839115
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f321208-b8d3-4b2c-b791-6d78d9174d7a",
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
  "last_heartbeat_at": "2026-10-30T14:33:59.134476Z",
  "last_location_at": "2026-10-30T14:33:59.134476Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676501158",
  "device_ref": "sandbox-23730"
}
```

```json
{
  "challenge_id": "4fe569ad-4603-48a5-b47c-751acec07560",
  "expires_at": "2026-10-30T14:38:59.441399388Z",
  "resend_available_at": "2026-10-30T14:34:00.441399388Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676501158` → **200**

```json
{
  "phone": "+380676501158",
  "audience": "CLIENT",
  "code": "987499",
  "sent_at": "2026-10-30T14:33:59.44424205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fe569ad-4603-48a5-b47c-751acec07560",
  "code": "987499",
  "device_ref": "sandbox-23730"
}
```

```json
{
  "session_id": "c5838623-fc5b-4cd7-81cd-0feb511ceb6a",
  "subject": {
    "type": "CLIENT",
    "id": "eaa104db-b370-4eee-a5ef-23b2170cf77b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYWExMDRkYi1iMzcwLTRlZWUtYTVlZi0yM2IyMTcwY2Y3N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxNzM5LCJpYXQiOjE3OTMzNzA4MzksImp0aSI6ImVlZTc5NDMxLWZmMGQtNGU4Yy04ZTRjLWIzNjcwOTkyNWY0MiIsInNpZCI6ImM1ODM4NjIzLWZjNWItNGNkNy04MWNkLTBmZWI1MTFjZWI2YSJ9.WboJht10ZlMaACwKycAnBUkYNOct8XqTSOx7ZdPZbe0",
  "access_expires_at": "2026-10-30T14:48:59.775626616Z",
  "refresh_token": "6xfkYftOLMco9B1JkcyuXoLrsVjclcqsA_Axqik356M",
  "refresh_expires_at": "2026-11-29T14:33:59.775048465Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "422642c0-4164-42e8-a199-c9ff9bd214ce",
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
  "id": "66f08eab-cdbb-4736-b493-8115ed2b59a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:39:00.093497Z",
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
  "command_id": "a49529c3-0c7b-4937-b155-4f12f9395fac",
  "quote_id": "66f08eab-cdbb-4736-b493-8115ed2b59a3",
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
  "id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "short_number": 31,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "eaa104db-b370-4eee-a5ef-23b2170cf77b",
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
  "created_at": "2026-10-30T14:34:00.413213Z",
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
    "id": "bcbd9066-b847-4136-843c-5bb2904f3c0c",
    "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
    "expires_at": "2026-10-30T14:34:15.417232Z",
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

`POST /api/driver/v1/offers/bcbd9066-b847-4136-843c-5bb2904f3c0c/accept` → **200**

```json
{
  "command_id": "9cdd7de4-d6fe-4146-a593-494ca0aea699"
}
```

```json
{
  "id": "5fb28070-6846-481d-a928-7e1ab15c33af",
  "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "126bbcba-2a9d-4bbd-9ac8-e6934b7694f8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "126bbcba-2a9d-4bbd-9ac8-e6934b7694f8",
  "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "assignment_id": "5fb28070-6846-481d-a928-7e1ab15c33af",
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

`POST /api/driver/v1/work-sessions/7f321208-b8d3-4b2c-b791-6d78d9174d7a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:34:01Z",
    "sequence": 1793370841661
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f321208-b8d3-4b2c-b791-6d78d9174d7a",
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
  "last_heartbeat_at": "2026-10-30T14:34:01.680873Z",
  "last_location_at": "2026-10-30T14:34:01.680873Z",
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
  "id": "126bbcba-2a9d-4bbd-9ac8-e6934b7694f8",
  "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "assignment_id": "5fb28070-6846-481d-a928-7e1ab15c33af",
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

`POST /api/driver/v1/trips/126bbcba-2a9d-4bbd-9ac8-e6934b7694f8/arrive` → **200**

```json
{
  "command_id": "ca77afe0-eea0-4ee0-928e-42c2b112563e",
  "expected_version": 0
}
```

```json
{
  "id": "126bbcba-2a9d-4bbd-9ac8-e6934b7694f8",
  "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "assignment_id": "5fb28070-6846-481d-a928-7e1ab15c33af",
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
  "arrived_at": "2026-10-30T14:34:02.294019Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/126bbcba-2a9d-4bbd-9ac8-e6934b7694f8/start` → **200**

```json
{
  "command_id": "b8874e84-fd52-47ae-88bb-4d0ba57238f4",
  "expected_version": 1
}
```

```json
{
  "id": "126bbcba-2a9d-4bbd-9ac8-e6934b7694f8",
  "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "assignment_id": "5fb28070-6846-481d-a928-7e1ab15c33af",
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
  "arrived_at": "2026-10-30T14:34:02.294019Z",
  "started_at": "2026-10-30T14:34:02.616878Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/7f321208-b8d3-4b2c-b791-6d78d9174d7a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:34:50Z",
    "sequence": 1793370890944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f321208-b8d3-4b2c-b791-6d78d9174d7a",
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
  "last_heartbeat_at": "2026-10-30T14:34:50.963382Z",
  "last_location_at": "2026-10-30T14:34:50.963382Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/126bbcba-2a9d-4bbd-9ac8-e6934b7694f8/complete` → **200**

```json
{
  "command_id": "23245691-0447-4ba5-b4c7-3cb75299f688",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:34:51Z",
  "cash_received": true
}
```

```json
{
  "id": "126bbcba-2a9d-4bbd-9ac8-e6934b7694f8",
  "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "assignment_id": "5fb28070-6846-481d-a928-7e1ab15c33af",
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
  "arrived_at": "2026-10-30T14:34:02.294019Z",
  "started_at": "2026-10-30T14:34:02.616878Z",
  "completed_at": "2026-10-30T14:34:51.267345Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/637e541c-68c9-4d0a-a91c-9f540644a15d/rating` → **200**

```json
{
  "command_id": "10800d03-196a-47fa-a9bc-6e0600d94958",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "score": 5,
  "created_at": "2026-10-30T14:34:51.579914816Z"
}
```

`POST /api/driver/v1/orders/637e541c-68c9-4d0a-a91c-9f540644a15d/rating` → **200**

```json
{
  "command_id": "3e88bb37-ad72-49de-9d7c-978f45f60fb5",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
  "score": 4,
  "created_at": "2026-10-30T14:34:51.890654981Z"
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
  "session_id": "948d626b-8cf2-4acc-8ae5-ca2a4ef7a7e5",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3OTIsImlhdCI6MTc5MzM3MDg5MiwianRpIjoiNDJlMjM2YTUtMWFiZC00MTYxLWI3MTYtODM2ZWMwMjQ1M2I0Iiwic2lkIjoiOTQ4ZDYyNmItOGNmMi00YWNjLThhZTUtY2EyYTRlZjdhN2U1In0.ae1a-T2ytYLyuLRqDMnvnBmDZbcBHUQdtQB5aQVk6wE",
  "access_expires_at": "2026-10-30T14:49:52.783384859Z",
  "refresh_token": "VtfMiA9lmWjZi4Z3OXA9yITXkqk-zXhv6DdI6UAOQnU",
  "refresh_expires_at": "2026-10-31T02:34:52.782772347Z",
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
  "session_id": "e138ecc4-2bd9-473e-812f-63426d5f8277",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3OTMsImlhdCI6MTc5MzM3MDg5MywianRpIjoiZGMyNzI5NDItMGQ2Ny00ZGQ1LWExMzktNmQzZmFjN2M3NTY0Iiwic2lkIjoiZTEzOGVjYzQtMmJkOS00NzNlLTgxMmYtNjM0MjZkNWY4Mjc3In0.tcGJkMm2y8tqSgif9FqPbbwyL9nS22jJSr91i0uCxh4",
  "access_expires_at": "2026-10-30T14:49:53.363714366Z",
  "refresh_token": "8sHZzikITgX5_R3CCVup63Bt5zUwhYEpDG4r5BFW4ts",
  "refresh_expires_at": "2026-10-31T02:34:53.363052822Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/637e541c-68c9-4d0a-a91c-9f540644a15d/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
      "author_type": "RIDER",
      "author_id": "eaa104db-b370-4eee-a5ef-23b2170cf77b",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T14:34:51.579915Z"
    },
    {
      "order_id": "637e541c-68c9-4d0a-a91c-9f540644a15d",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "eaa104db-b370-4eee-a5ef-23b2170cf77b",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T14:34:51.890655Z"
    }
  ]
}
```

Done: ratings for order 637e541c-68c9-4d0a-a91c-9f540644a15d.

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
  "session_id": "9fe1e007-f164-4cd4-b3a3-06b54a6f153c",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE3OTQsImlhdCI6MTc5MzM3MDg5NCwianRpIjoiODc3Zjc3ZmEtOGMxMi00OTgzLWI3NGUtNjZkNTZkYWEwZDJiIiwic2lkIjoiOWZlMWUwMDctZjE2NC00Y2Q0LWIzYTMtMDZiNTRhNmYxNTNjIn0.i7xVaCE5n49IvZA5zrtk2pgBMhz8_Ckd95ZQWt7msoA",
  "access_expires_at": "2026-10-30T14:49:54.259431996Z",
  "refresh_token": "oa3LVqAzVam2PWPgxAavgs16Dcpg0v1nnZ-566sjF1Y",
  "refresh_expires_at": "2026-10-31T02:34:54.258788068Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "4dbc449d-04eb-4375-9e0c-290df684062f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "e3598cad-781e-4cfe-864b-cf8296fefb39",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:34:54.558274Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3598cad-781e-4cfe-864b-cf8296fefb39` → **200**

```json
{
  "id": "e3598cad-781e-4cfe-864b-cf8296fefb39",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:34:54.558274Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3598cad-781e-4cfe-864b-cf8296fefb39` → **200**

```json
{
  "id": "e3598cad-781e-4cfe-864b-cf8296fefb39",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:34:54.558274Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3598cad-781e-4cfe-864b-cf8296fefb39` → **200**

```json
{
  "id": "e3598cad-781e-4cfe-864b-cf8296fefb39",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:34:54.558274Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3598cad-781e-4cfe-864b-cf8296fefb39` → **200**

```json
{
  "id": "e3598cad-781e-4cfe-864b-cf8296fefb39",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:34:54.558274Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e3598cad-781e-4cfe-864b-cf8296fefb39` → **200**

```json
{
  "id": "e3598cad-781e-4cfe-864b-cf8296fefb39",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T14:34:54.558274Z",
  "ready_at": "2026-10-30T14:34:59.050427Z",
  "expires_at": "2026-10-31T14:34:59.050427Z"
}
```

`GET /api/admin/v1/reports/exports/e3598cad-781e-4cfe-864b-cf8296fefb39/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,29,11,17,1,0,24,5,0,26,2,0,1,7,1,9
total,29,11,17,1,0,24,5,0,26,2,0,1,7,1,9
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "33211bb4-6afc-426c-9636-8b87689f9976",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "9a597157-132d-40d0-bdfe-fccde352ff77",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:35:00.335393Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9a597157-132d-40d0-bdfe-fccde352ff77` → **200**

```json
{
  "id": "9a597157-132d-40d0-bdfe-fccde352ff77",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:35:00.335393Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9a597157-132d-40d0-bdfe-fccde352ff77` → **200**

```json
{
  "id": "9a597157-132d-40d0-bdfe-fccde352ff77",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:35:00.335393Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9a597157-132d-40d0-bdfe-fccde352ff77` → **200**

```json
{
  "id": "9a597157-132d-40d0-bdfe-fccde352ff77",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T14:35:00.335393Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9a597157-132d-40d0-bdfe-fccde352ff77` → **200**

```json
{
  "id": "9a597157-132d-40d0-bdfe-fccde352ff77",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T14:35:00.335393Z",
  "ready_at": "2026-10-30T14:35:04.057723Z",
  "expires_at": "2026-10-31T14:35:04.057723Z"
}
```

`GET /api/admin/v1/reports/exports/9a597157-132d-40d0-bdfe-fccde352ff77/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/fa05ac38-724c-4149-baba-c7ca21e0eac6` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/fa05ac38-724c-4149-baba-c7ca21e0eac6",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "efa62797-3bf1-43f7-9f8c-47ce062c5341"
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
  "session_id": "5060efe1-5632-4912-bf0d-6a29ecd23da2",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE4MDUsImlhdCI6MTc5MzM3MDkwNSwianRpIjoiOTI3YTEwNTEtMDQ1YS00MDZkLTg0YzktMjYxODBlODU4ZThmIiwic2lkIjoiNTA2MGVmZTEtNTYzMi00OTEyLWJmMGQtNmEyOWVjZDIzZGEyIn0.wMb9-BuiVoEY3kiP3jMkrILNt1nFv4r7TV4UXrcxkWg",
  "access_expires_at": "2026-10-30T14:50:05.40218984Z",
  "refresh_token": "ZoRw8l3KHN18N9lW3Bk6Q7PP-brofjB4lNX0FdZi3nM",
  "refresh_expires_at": "2026-10-31T02:35:05.401518521Z",
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
  "command_id": "7d44d78b-3f1a-4ed6-88cc-491b83023dd7",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T14:35:06.006857434Z"
}
```

`POST /sandbox/v1/retention/fixtures/395a9cb8-59ba-42e6-b438-309659a03762` → **200**

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

`GET /sandbox/v1/retention/fixtures/395a9cb8-59ba-42e6-b438-309659a03762` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/395a9cb8-59ba-42e6-b438-309659a03762` → **204**

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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T14:35:06.006857Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "035d74e1-0c0c-4ccf-85f1-37c90c043a7c",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T14:35:06.714794557Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16842"
}
```

```json
{
  "challenge_id": "476155ee-f181-40ef-b769-de9d019d8446",
  "expires_at": "2026-10-30T14:40:07.020609487Z",
  "resend_available_at": "2026-10-30T14:35:08.020609487Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "142264",
  "sent_at": "2026-10-30T14:35:07.023570862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "476155ee-f181-40ef-b769-de9d019d8446",
  "code": "142264",
  "device_ref": "sandbox-16842"
}
```

```json
{
  "session_id": "4bf0d6d6-e8fa-462e-b238-20f5f39b560e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTgwNywiaWF0IjoxNzkzMzcwOTA3LCJqdGkiOiI2MGEwMmJmYS0zOGVlLTRlY2YtODBiYi1hZDU4M2VkYWIyMTEiLCJzaWQiOiI0YmYwZDZkNi1lOGZhLTQ2MmUtYjIzOC0yMGY1ZjM5YjU2MGUifQ.fV2zb8egrkq7Gn__ASdSUfKU8hhJCF_5QONliG4wB_U",
  "access_expires_at": "2026-10-30T14:50:07.348668087Z",
  "refresh_token": "4UR4yILLSIwDmwsl6OveNToOzYXYdR8SzkxBVX_Lp-8",
  "refresh_expires_at": "2026-11-29T14:35:07.348019026Z",
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
  "command_id": "5995f03b-8e5f-43de-a68f-993632cd737f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:35:08Z",
    "sequence": 1793370908255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4f92aefb-a08f-43a8-9136-09a495aed1c5",
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
  "last_heartbeat_at": "2026-10-30T14:35:08.27335Z",
  "last_location_at": "2026-10-30T14:35:08.27335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "c19a2535-f67f-4a68-864e-b3185295b2b5",
  "points": [
    {
      "sequence": 1793370910570,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T14:34:10Z"
    },
    {
      "sequence": 1793370910578,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T14:35:10Z"
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
  "session_id": "a299cc84-6431-4ae1-968c-9ce7c737bf5e",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE4MTEsImlhdCI6MTc5MzM3MDkxMSwianRpIjoiYTg2MmQ5MDAtZjU5Mi00YzgwLTkwMTUtZGUwYmFmZGJmNWMyIiwic2lkIjoiYTI5OWNjODQtNjQzMS00YWUxLTk2OGMtOWNlN2M3MzdiZjVlIn0.dyj8OpJ9RRNcJbsAbHeUSRLQCZXWU_CTtx5ra6ZEc4c",
  "access_expires_at": "2026-10-30T14:50:11.207623462Z",
  "refresh_token": "ys2oEKTUZqzj6lNUVZXaNgUXOFF1KXp9UAlty0QdQDI",
  "refresh_expires_at": "2026-10-31T02:35:11.207022341Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "2fb15b48-5446-470f-a826-adf308b7486e",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T14:35:10Z",
        "track_point_id": "c2974627-2e8a-4755-8d9a-081bca0298f5",
        "work_session_id": "4f92aefb-a08f-43a8-9136-09a495aed1c5"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T14:35:10Z",
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
  "history": [],
  "duplicates": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/2fb15b48-5446-470f-a826-adf308b7486e/confirm` → **200**

```json
{
  "command_id": "c2c510dc-e9e6-426d-aca7-4eb0619ae9a6",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "2fb15b48-5446-470f-a826-adf308b7486e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T14:35:10Z",
    "track_point_id": "c2974627-2e8a-4755-8d9a-081bca0298f5",
    "work_session_id": "4f92aefb-a08f-43a8-9136-09a495aed1c5"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T14:35:10Z",
  "reason": null,
  "reviewed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reviewed_at": "2026-10-30T14:35:12.149467Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/2fb15b48-5446-470f-a826-adf308b7486e/dismiss` → **409**

```json
{
  "command_id": "675c3a32-dd3a-4a01-8698-6343ea00060b",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/2fb15b48-5446-470f-a826-adf308b7486e/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "466ad86b-901a-4b5c-bf65-078f49001c3d"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "56aa6d70-c95e-4be3-97ec-da93c1c3df37",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "7a0399f6-62b4-4921-954a-1a836c651de5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "raised_at": "2026-10-30T14:35:12.771196Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/7a0399f6-62b4-4921-954a-1a836c651de5/dismiss` → **200**

```json
{
  "command_id": "3d513f30-7d0a-4618-9ae0-8d7a38dc3c1d",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "7a0399f6-62b4-4921-954a-1a836c651de5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "raised_at": "2026-10-30T14:35:12.771196Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reviewed_at": "2026-10-30T14:35:13.074639Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "1b2faeb2-7fb3-417d-bf9c-12007159adeb",
  "expected_version": 6,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "2fb15b48-5446-470f-a826-adf308b7486e"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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
    "review_status": "SUSPENDED",
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
      "actor_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:35:13.390052Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 2fb15b48-5446-470f-a826-adf308b7486e confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "66f19208-658e-4e35-b20a-a35bdf064880",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE4MTQsImlhdCI6MTc5MzM3MDkxNCwianRpIjoiY2JhMzU0OGEtMGY4Ny00OTU1LWFhZWMtNTIyZmNkODdkZWY1Iiwic2lkIjoiNjZmMTkyMDgtNjU4ZS00ZTM1LWIyMGEtYTM1YmRmMDY0ODgwIn0.wiyzJw2gGstxRPTBfx6H-cAQ9Q5T1UOxSLx4z19O93A",
  "access_expires_at": "2026-10-30T14:50:14.273056805Z",
  "refresh_token": "684DidfHssEt2pzhn0CtnguAfpiX8YbAk7SqgwTNl78",
  "refresh_expires_at": "2026-10-31T02:35:14.272483796Z",
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
      "actor_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:35:13.390052Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "50a5a741-d1fc-48a7-8d71-800648560bf3",
  "expected_version": 7,
  "reason": "Sandbox clean-up"
}
```

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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4f92aefb-a08f-43a8-9136-09a495aed1c5",
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
  "last_heartbeat_at": "2026-10-30T14:35:08.27335Z",
  "last_location_at": "2026-10-30T14:35:08.27335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4f92aefb-a08f-43a8-9136-09a495aed1c5/close` → **200**

```json
{
  "command_id": "34b4e478-2b0d-4e47-a7a8-caf39d7a13b3",
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
  "session_id": "70df564a-9ece-4b0b-82c2-b0554d76d97b",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE4MTYsImlhdCI6MTc5MzM3MDkxNiwianRpIjoiMjcxYjAxZjMtNDBjNy00ZTFkLTkzNWQtNjRlOTE3ZTFmZGQ5Iiwic2lkIjoiNzBkZjU2NGEtOWVjZS00YjBiLTgyYzItYjA1NTRkNzZkOTdiIn0.nCyVEm98ypux2DPs9HOHcmjWXwlC0JQEzz4fuV4upXU",
  "access_expires_at": "2026-10-30T14:50:16.044780027Z",
  "refresh_token": "sFaWytBYXAkxn8QQPV2irdNtdkOnZkKQWOopnIuityY",
  "refresh_expires_at": "2026-10-31T02:35:16.044137158Z",
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
  "command_id": "fa06fccf-859c-4244-9856-544945cbabd6",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T14:35:16.643988Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "fa06fccf-859c-4244-9856-544945cbabd6",
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
  "changed_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T14:35:16.643988Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48974111242",
  "device_ref": "sandbox-24708"
}
```

```json
{
  "challenge_id": "b052e863-4d1c-478a-a513-1a60a80fad07",
  "expires_at": "2026-10-30T14:40:17.251921786Z",
  "resend_available_at": "2026-10-30T14:35:18.251921786Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48974111242` → **200**

```json
{
  "phone": "+48974111242",
  "audience": "CLIENT",
  "code": "078442",
  "sent_at": "2026-10-30T14:35:17.254925679Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b052e863-4d1c-478a-a513-1a60a80fad07",
  "code": "078442",
  "device_ref": "sandbox-24708"
}
```

```json
{
  "session_id": "1f02d274-9b6e-4240-9dd9-27e366be7b4c",
  "subject": {
    "type": "CLIENT",
    "id": "86a207ed-a5c1-4eb2-a3b4-482fc0bc83a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmEyMDdlZC1hNWMxLTRlYjItYTNiNC00ODJmYzBiYzgzYTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxODE3LCJpYXQiOjE3OTMzNzA5MTcsImp0aSI6ImI2NDA2ODUwLTA0OTQtNGI1Ny1hMjFlLTc0MzZjNDg4ZmNiMiIsInNpZCI6IjFmMDJkMjc0LTliNmUtNDI0MC05ZGQ5LTI3ZTM2NmJlN2I0YyJ9.Kjc63ztObrBLlXwmneHSIKUQgyPw5icDKGW4YfnFMsE",
  "access_expires_at": "2026-10-30T14:50:17.562849136Z",
  "refresh_token": "uKeYvXSxZARWj7eP1BEjlhHv_hDE_ES9V3vw09nwgfw",
  "refresh_expires_at": "2026-11-29T14:35:17.562311343Z",
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
  "correlation_id": "1eb3aca2-b557-4ba6-b024-2762705afb9b"
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
  "device_ref": "sandbox-5317"
}
```

```json
{
  "challenge_id": "50ac175e-42d6-443a-8b50-cd7aa5e09387",
  "expires_at": "2026-10-30T14:40:18.441331353Z",
  "resend_available_at": "2026-10-30T14:35:19.441331353Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "060944",
  "sent_at": "2026-10-30T14:35:18.444709388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50ac175e-42d6-443a-8b50-cd7aa5e09387",
  "code": "060944",
  "device_ref": "sandbox-5317"
}
```

```json
{
  "session_id": "9f70431e-a05f-419e-ba17-9da48f6ad1c8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTgxOCwiaWF0IjoxNzkzMzcwOTE4LCJqdGkiOiIzZWM3OGRmNi03MzNlLTRlM2EtYjUzNi1jMGYzMWY5MDA4YjciLCJzaWQiOiI5ZjcwNDMxZS1hMDVmLTQxOWUtYmExNy05ZGE0OGY2YWQxYzgifQ.G-miufe5VUEbvWVdiEU9M6wyKX1VWQCFXvPjekuYX9w",
  "access_expires_at": "2026-10-30T14:50:18.764848201Z",
  "refresh_token": "4na4TUcHXh-SwK17rPk7Ka86Iun7XS01yjiFn0dLjxM",
  "refresh_expires_at": "2026-11-29T14:35:18.764289284Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e3d95442-8054-4ded-b64f-b136eac9db76",
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
  "last_heartbeat_at": "2026-10-30T14:33:55.06229Z",
  "last_location_at": "2026-10-30T14:33:55.06229Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e3d95442-8054-4ded-b64f-b136eac9db76/handover` → **200**

```json
{
  "command_id": "88068ca2-48d3-4c21-a2a1-e50b0809b039",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e3d95442-8054-4ded-b64f-b136eac9db76",
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
  "last_heartbeat_at": "2026-10-30T14:33:55.06229Z",
  "last_location_at": "2026-10-30T14:33:55.06229Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e3d95442-8054-4ded-b64f-b136eac9db76/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:35:19Z",
    "sequence": 1793370919644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e3d95442-8054-4ded-b64f-b136eac9db76",
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
  "last_heartbeat_at": "2026-10-30T14:35:19.663421Z",
  "last_location_at": "2026-10-30T14:35:19.663421Z",
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
  "session_id": "e3d95442-8054-4ded-b64f-b136eac9db76",
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
  "last_heartbeat_at": "2026-10-30T14:35:19.663421Z",
  "last_location_at": "2026-10-30T14:35:19.663421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e3d95442-8054-4ded-b64f-b136eac9db76/close` → **200**

```json
{
  "command_id": "0f038c7e-a54d-48a7-96bb-a115da1b93ee",
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
  "correlation_id": "f0d33b4c-60a5-47d3-a7f4-efd06d396903"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677739376",
  "device_ref": "sandbox-6121"
}
```

```json
{
  "challenge_id": "c44de2a2-81c5-4646-b5b3-4a00be99e9e7",
  "expires_at": "2026-10-30T14:40:21.152084233Z",
  "resend_available_at": "2026-10-30T14:35:22.152084233Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677739376` → **200**

```json
{
  "phone": "+380677739376",
  "audience": "CLIENT",
  "code": "712411",
  "sent_at": "2026-10-30T14:35:21.154748525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c44de2a2-81c5-4646-b5b3-4a00be99e9e7",
  "code": "712411",
  "device_ref": "sandbox-6121"
}
```

```json
{
  "session_id": "eb2baaa5-1d7d-4d7f-ac90-a1619be510ce",
  "subject": {
    "type": "CLIENT",
    "id": "9407be2f-8070-4c73-ac1c-3125cc257771"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDA3YmUyZi04MDcwLTRjNzMtYWMxYy0zMTI1Y2MyNTc3NzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxODIxLCJpYXQiOjE3OTMzNzA5MjEsImp0aSI6IjllZDgwMWIwLTIwYWUtNDQ3Yy04NmM0LTc1YjBiYzY1OWI2ZSIsInNpZCI6ImViMmJhYWE1LTFkN2QtNGQ3Zi1hYzkwLWExNjE5YmU1MTBjZSJ9.mQvWryVFp5MfpED68vz0iEowj7_uLG3qvMV10oY1dHM",
  "access_expires_at": "2026-10-30T14:50:21.480193214Z",
  "refresh_token": "3n-H4jWLqeDf8QAxTUcJ53pmIa1unX-pXC_2Koaj39s",
  "refresh_expires_at": "2026-11-29T14:35:21.479628302Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f9f8f296-013a-4b7c-ada5-bc1d5945db6a",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "9ce10fb1-901d-48db-aafc-e38ab5d0a188",
  "upload_path": "/api/rider/v1/uploads/9ce10fb1-901d-48db-aafc-e38ab5d0a188",
  "expires_at": "2026-10-30T14:50:21.785654877Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/9ce10fb1-901d-48db-aafc-e38ab5d0a188` → **200**

```json
{
  "file_id": "9ce10fb1-901d-48db-aafc-e38ab5d0a188",
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
  "command_id": "5c0f20d8-d28c-47a2-a425-b6a2fbf80aa0",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "7ed05129-44b0-482c-869d-1cca01034fc8",
  "upload_path": "/api/rider/v1/uploads/7ed05129-44b0-482c-869d-1cca01034fc8",
  "expires_at": "2026-10-30T14:50:22.11842309Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/7ed05129-44b0-482c-869d-1cca01034fc8` → **200**

```json
{
  "file_id": "7ed05129-44b0-482c-869d-1cca01034fc8",
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
  "command_id": "f7f1274c-7996-4231-8ecc-6964c58e0727",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0b83dc21-5c25-4ae8-aaab-b10751cae541",
  "upload_path": "/api/rider/v1/uploads/0b83dc21-5c25-4ae8-aaab-b10751cae541",
  "expires_at": "2026-10-30T14:50:22.450167566Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/0b83dc21-5c25-4ae8-aaab-b10751cae541` → **200**

```json
{
  "file_id": "0b83dc21-5c25-4ae8-aaab-b10751cae541",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "1bf95680-6729-4bcb-94d5-150b69c71285",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "0b83dc21-5c25-4ae8-aaab-b10751cae541"
  ]
}
```

```json
{
  "id": "a4ae19c7-1745-4cad-b677-c4ada6f909ca",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9407be2f-8070-4c73-ac1c-3125cc257771",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T14:35:22.785757Z",
  "updated_at": "2026-10-30T14:35:22.785757Z",
  "respond_by": "2026-10-30T18:35:22.785757Z",
  "messages": [
    {
      "id": "8feddad7-ad18-4f51-bfba-0cf9b0d26079",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9407be2f-8070-4c73-ac1c-3125cc257771",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:35:22.78699Z",
      "attachments": [
        {
          "file_id": "0b83dc21-5c25-4ae8-aaab-b10751cae541",
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
  "session_id": "b88b7620-2474-4746-a753-cbf751ef31c4",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE4MjMsImlhdCI6MTc5MzM3MDkyMywianRpIjoiMDYyNzU4MDUtNzg4MC00ZGQ3LWEwMTMtODVhMzRhYTllYjhjIiwic2lkIjoiYjg4Yjc2MjAtMjQ3NC00NzQ2LWE3NTMtY2JmNzUxZWYzMWM0In0.MAUwhiqZXBYNOTd1stRg-dY3O52eaNkCKSbUeHG7OAg",
  "access_expires_at": "2026-10-30T14:50:23.40234625Z",
  "refresh_token": "_WWAV8l8CpE89mQktAUh3tcQGn0JbUSVsB347gJqrzo",
  "refresh_expires_at": "2026-10-31T02:35:23.401727385Z",
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
  "session_id": "7f9408cc-84ba-4488-b272-0f09cb28b313",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE4MjQsImlhdCI6MTc5MzM3MDkyNCwianRpIjoiYzg5MmQ1MTItYzQ0Ni00ZjgwLThkOGEtOWE1YTQ5YmM0YjcwIiwic2lkIjoiN2Y5NDA4Y2MtODRiYS00NDg4LWIyNzItMGYwOWNiMjhiMzEzIn0.QRPkhVNtJC7E7lCpOsrbJxr9_qtj_6LrZAGuE0M0i30",
  "access_expires_at": "2026-10-30T14:50:24.001955197Z",
  "refresh_token": "GbxTnzlvMZaJeLG1IC7amQZc2ISq7m-vLEvFbQ_Bfwg",
  "refresh_expires_at": "2026-10-31T02:35:24.001280468Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/a4ae19c7-1745-4cad-b677-c4ada6f909ca/attachments/0b83dc21-5c25-4ae8-aaab-b10751cae541` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "dd3e47cc-14dc-4aa8-bbb5-ca51d799f34c",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "43076018-397a-4c43-87ca-e7fa676b80ef",
  "upload_path": "/api/operator/v1/uploads/43076018-397a-4c43-87ca-e7fa676b80ef",
  "expires_at": "2026-10-30T14:50:24.30693189Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/43076018-397a-4c43-87ca-e7fa676b80ef` → **200**

```json
{
  "file_id": "43076018-397a-4c43-87ca-e7fa676b80ef",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/a4ae19c7-1745-4cad-b677-c4ada6f909ca` → **200**

```json
{
  "id": "a4ae19c7-1745-4cad-b677-c4ada6f909ca",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9407be2f-8070-4c73-ac1c-3125cc257771",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T14:35:22.785757Z",
  "updated_at": "2026-10-30T14:35:22.785757Z",
  "respond_by": "2026-10-30T18:35:22.785757Z",
  "messages": [
    {
      "id": "8feddad7-ad18-4f51-bfba-0cf9b0d26079",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9407be2f-8070-4c73-ac1c-3125cc257771",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:35:22.78699Z",
      "attachments": [
        {
          "file_id": "0b83dc21-5c25-4ae8-aaab-b10751cae541",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/a4ae19c7-1745-4cad-b677-c4ada6f909ca/comments` → **200**

```json
{
  "command_id": "dbba777e-801a-4940-bb90-45634e6e36a2",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "43076018-397a-4c43-87ca-e7fa676b80ef"
  ]
}
```

```json
{
  "id": "a4ae19c7-1745-4cad-b677-c4ada6f909ca",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9407be2f-8070-4c73-ac1c-3125cc257771",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T14:35:22.785757Z",
  "updated_at": "2026-10-30T14:35:24.937179Z",
  "respond_by": "2026-10-30T18:35:22.785757Z",
  "messages": [
    {
      "id": "8feddad7-ad18-4f51-bfba-0cf9b0d26079",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9407be2f-8070-4c73-ac1c-3125cc257771",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:35:22.78699Z",
      "attachments": [
        {
          "file_id": "0b83dc21-5c25-4ae8-aaab-b10751cae541",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "377fd1c1-e96b-4368-8a6c-2f8e9c7d963e",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T14:35:24.936622Z",
      "attachments": [
        {
          "file_id": "43076018-397a-4c43-87ca-e7fa676b80ef",
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

`GET /api/rider/v1/support/cases/a4ae19c7-1745-4cad-b677-c4ada6f909ca` → **200**

```json
{
  "id": "a4ae19c7-1745-4cad-b677-c4ada6f909ca",
  "number": 4,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "9407be2f-8070-4c73-ac1c-3125cc257771",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T14:35:22.785757Z",
  "updated_at": "2026-10-30T14:35:24.937179Z",
  "respond_by": "2026-10-30T18:35:22.785757Z",
  "messages": [
    {
      "id": "8feddad7-ad18-4f51-bfba-0cf9b0d26079",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "9407be2f-8070-4c73-ac1c-3125cc257771",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T14:35:22.78699Z",
      "attachments": [
        {
          "file_id": "0b83dc21-5c25-4ae8-aaab-b10751cae541",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "377fd1c1-e96b-4368-8a6c-2f8e9c7d963e",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T14:35:24.936622Z",
      "attachments": [
        {
          "file_id": "43076018-397a-4c43-87ca-e7fa676b80ef",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/a4ae19c7-1745-4cad-b677-c4ada6f909ca/attachments/43076018-397a-4c43-87ca-e7fa676b80ef` → **200**

Done: support case a4ae19c7-1745-4cad-b677-c4ada6f909ca, rider attachment 0b83dc21-5c25-4ae8-aaab-b10751cae541, operator attachment 43076018-397a-4c43-87ca-e7fa676b80ef.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739109332",
  "device_ref": "sandbox-28105"
}
```

```json
{
  "challenge_id": "a0cead44-2c71-418e-9f75-eac68bd08afe",
  "expires_at": "2026-10-30T14:40:25.56976679Z",
  "resend_available_at": "2026-10-30T14:35:26.56976679Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739109332` → **200**

```json
{
  "phone": "+380739109332",
  "audience": "CLIENT",
  "code": "636350",
  "sent_at": "2026-10-30T14:35:25.572718739Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a0cead44-2c71-418e-9f75-eac68bd08afe",
  "code": "636350",
  "device_ref": "sandbox-28105"
}
```

```json
{
  "session_id": "875e6b47-142e-470b-b80d-d78ba97251e5",
  "subject": {
    "type": "CLIENT",
    "id": "848f4837-8134-465a-8c13-afebc11b215c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDhmNDgzNy04MTM0LTQ2NWEtOGMxMy1hZmViYzExYjIxNWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxODI1LCJpYXQiOjE3OTMzNzA5MjUsImp0aSI6IjI4NmU1NmI2LWU3MjMtNDIwZC05NTIwLTNkZDIzZGVjNzU3ZSIsInNpZCI6Ijg3NWU2YjQ3LTE0MmUtNDcwYi1iODBkLWQ3OGJhOTcyNTFlNSJ9.-VWqZOWwzoLakBcMtIM6fL4X07PVwmHHSWOSC4dQPBU",
  "access_expires_at": "2026-10-30T14:50:25.886955724Z",
  "refresh_token": "T2Z6WkaKHuSQspnLxD2QQG7hZPB54AurdtOBHSBMpnE",
  "refresh_expires_at": "2026-11-29T14:35:25.886405327Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4712899d-1266-48ec-a773-7cdf56bea384",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "21468e50-6e93-4f4a-9cc8-b6f4612fb762",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-21468e50-6e93-4f4a-9cc8-b6f4612fb762",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8b40bf07da7d14ca4ba1597c45f8f987",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=21468e50-6e93-4f4a-9cc8-b6f4612fb762",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739109332"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=21468e50-6e93-4f4a-9cc8-b6f4612fb762",
  "expires_at": "2026-10-30T15:05:26.185418Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/21468e50-6e93-4f4a-9cc8-b6f4612fb762` → **200**

```json
{
  "id": "21468e50-6e93-4f4a-9cc8-b6f4612fb762",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T15:05:26.185418Z",
  "card": {
    "id": "0b3cf689-94d7-4bc4-822a-b34ad30a665b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1455",
    "card_type": "Visa",
    "created_at": "2026-10-30T14:35:26.473501Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8cdea2e9-2faa-43f9-a1f6-5e9fefc783eb",
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
  "id": "df9d0010-67ce-4402-bf89-65c53314063e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:40:26.781605Z",
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
  "command_id": "1f9efa6f-4e61-4016-9c7a-127da50b2342",
  "quote_id": "df9d0010-67ce-4402-bf89-65c53314063e",
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
  "id": "4c91f6c2-f2de-40f3-84d8-fc25df134df8",
  "short_number": 32,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "848f4837-8134-465a-8c13-afebc11b215c",
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
  "created_at": "2026-10-30T14:35:27.088341Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4c91f6c2-f2de-40f3-84d8-fc25df134df8` → **200**

```json
{
  "id": "4c91f6c2-f2de-40f3-84d8-fc25df134df8",
  "short_number": 32,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "848f4837-8134-465a-8c13-afebc11b215c",
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
  "created_at": "2026-10-30T14:35:27.088341Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4c91f6c2-f2de-40f3-84d8-fc25df134df8` → **200**

```json
{
  "id": "4c91f6c2-f2de-40f3-84d8-fc25df134df8",
  "short_number": 32,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "848f4837-8134-465a-8c13-afebc11b215c",
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
  "created_at": "2026-10-30T14:35:27.088341Z",
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

`GET /api/rider/v1/orders/4c91f6c2-f2de-40f3-84d8-fc25df134df8` → **200**

```json
{
  "id": "4c91f6c2-f2de-40f3-84d8-fc25df134df8",
  "short_number": 32,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "848f4837-8134-465a-8c13-afebc11b215c",
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
  "created_at": "2026-10-30T14:35:27.088341Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4c91f6c2-f2de-40f3-84d8-fc25df134df8/switch-to-cash` → **200**

```json
{
  "command_id": "6ea31842-1cf9-4bf7-bb2a-0e1ca0e94da8",
  "expected_version": 3
}
```

```json
{
  "id": "4c91f6c2-f2de-40f3-84d8-fc25df134df8",
  "short_number": 32,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "848f4837-8134-465a-8c13-afebc11b215c",
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
  "created_at": "2026-10-30T14:35:27.088341Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4c91f6c2-f2de-40f3-84d8-fc25df134df8/switch-to-cash` → **409**

```json
{
  "command_id": "d78c8c54-3248-4622-b597-15acc736dc32",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/4c91f6c2-f2de-40f3-84d8-fc25df134df8/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f612d99c-aa67-446e-a483-6aaf217bd57b"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/4c91f6c2-f2de-40f3-84d8-fc25df134df8` → **200**

```json
{
  "id": "4c91f6c2-f2de-40f3-84d8-fc25df134df8",
  "short_number": 32,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "848f4837-8134-465a-8c13-afebc11b215c",
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
  "created_at": "2026-10-30T14:35:27.088341Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4c91f6c2-f2de-40f3-84d8-fc25df134df8/cancel` → **200**

```json
{
  "command_id": "bd15409a-7f28-41cd-aa90-0a73c2f91a29",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4c91f6c2-f2de-40f3-84d8-fc25df134df8",
  "short_number": 32,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "848f4837-8134-465a-8c13-afebc11b215c",
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
  "created_at": "2026-10-30T14:35:27.088341Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
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
  "session_id": "a389f6c5-b8e7-41d4-80f4-b567bd938ea2",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE4MzAsImlhdCI6MTc5MzM3MDkzMCwianRpIjoiOWUzZjdiZDEtNDY2OC00MjZmLWJlMDctZTcxN2FkMTNmY2M5Iiwic2lkIjoiYTM4OWY2YzUtYjhlNy00MWQ0LTgwZjQtYjU2N2JkOTM4ZWEyIn0.hOIXrk0GZOeoz2Cq02GFSH7Dq1iC-7lnpDmhtX728Iw",
  "access_expires_at": "2026-10-30T14:50:30.912437626Z",
  "refresh_token": "pZ_WCJI2zZjnl7IK8RUaEDenu3Pxle19D6SMeD-Pl64",
  "refresh_expires_at": "2026-10-31T02:35:30.911823399Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10698"
}
```

```json
{
  "challenge_id": "2b45547d-c8d1-4a31-a5d1-0779a22cff85",
  "expires_at": "2026-10-30T14:40:31.205629477Z",
  "resend_available_at": "2026-10-30T14:35:32.205629477Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "137468",
  "sent_at": "2026-10-30T14:35:31.208307343Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b45547d-c8d1-4a31-a5d1-0779a22cff85",
  "code": "137468",
  "device_ref": "sandbox-10698"
}
```

```json
{
  "session_id": "f84c01b0-e66a-40e8-94c3-4197c6fdc83d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTgzMSwiaWF0IjoxNzkzMzcwOTMxLCJqdGkiOiJiZTc0YzkyZC0yODRiLTQwN2YtOGU5My04ZDE1YTE1ZWZlZmIiLCJzaWQiOiJmODRjMDFiMC1lNjZhLTQwZTgtOTRjMy00MTk3YzZmZGM4M2QifQ.hJMcWVuE8z8CspgnatusMdeSgDUsD_kqpRnI45MTULU",
  "access_expires_at": "2026-10-30T14:50:31.527392919Z",
  "refresh_token": "GedvnXEKcHKhhJoH2zF2HJlUNA4I-hbXCX43UgmtAlc",
  "refresh_expires_at": "2026-11-29T14:35:31.526717322Z",
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
  "version": 9,
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
    "version": 9,
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
      "actor_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T14:35:13.390052Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T14:35:14.870504Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "bd0dea55-fc13-48be-b6d3-ab3c331f226a",
  "expected_version": 9,
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
  "version": 10,
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
  "device_ref": "sandbox-19950"
}
```

```json
{
  "challenge_id": "1e161cfb-b7a4-458d-9a86-190b700564c3",
  "expires_at": "2026-10-30T14:40:32.726889724Z",
  "resend_available_at": "2026-10-30T14:35:33.726889724Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "934315",
  "sent_at": "2026-10-30T14:35:32.72951099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e161cfb-b7a4-458d-9a86-190b700564c3",
  "code": "934315",
  "device_ref": "sandbox-19950"
}
```

```json
{
  "session_id": "8bc0048d-cb0a-4afd-8c65-6ddb751afe9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTgzMywiaWF0IjoxNzkzMzcwOTMzLCJqdGkiOiI4M2JhNTc1Zi03N2U3LTRlZDctODU1OC00OTg2ZDM1ZDY2MjEiLCJzaWQiOiI4YmMwMDQ4ZC1jYjBhLTRhZmQtOGM2NS02ZGRiNzUxYWZlOWQifQ.b71QT8O2Zcx04S05iOKFWxlPdLnQZHtLf3B-ADINjuQ",
  "access_expires_at": "2026-10-30T14:50:33.060424369Z",
  "refresh_token": "IPu9jivfdN9sE1yg82OE999UxZ7iIvdOKpbs_4jlHNU",
  "refresh_expires_at": "2026-11-29T14:35:33.059766632Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f321208-b8d3-4b2c-b791-6d78d9174d7a",
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
  "last_heartbeat_at": "2026-10-30T14:34:50.963382Z",
  "last_location_at": "2026-10-30T14:34:50.963382Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7f321208-b8d3-4b2c-b791-6d78d9174d7a/handover` → **200**

```json
{
  "command_id": "5d9698fd-38e3-47e2-abff-22c82b9e2794",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f321208-b8d3-4b2c-b791-6d78d9174d7a",
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
  "last_heartbeat_at": "2026-10-30T14:34:50.963382Z",
  "last_location_at": "2026-10-30T14:34:50.963382Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/7f321208-b8d3-4b2c-b791-6d78d9174d7a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:35:39Z",
    "sequence": 1793370939966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7f321208-b8d3-4b2c-b791-6d78d9174d7a",
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
  "last_heartbeat_at": "2026-10-30T14:35:39.98612Z",
  "last_location_at": "2026-10-30T14:35:39.98612Z",
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
  "command_id": "db90ebda-c0ee-4dd5-a4da-05cafacbf446",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:35:40Z",
    "sequence": 1793370940588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "65c4ab65-8a1e-45b7-8235-767c684e8409",
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
  "last_heartbeat_at": "2026-10-30T14:35:40.606062Z",
  "last_location_at": "2026-10-30T14:35:40.606062Z",
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
  "session_id": "b80d387c-abee-48ee-9785-68e7ed2b5143",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzE4NDEsImlhdCI6MTc5MzM3MDk0MSwianRpIjoiZTI0YTkwN2YtOTFmNi00NmZmLTlmNGUtNmRhM2VlOTY3ZjNmIiwic2lkIjoiYjgwZDM4N2MtYWJlZS00OGVlLTk3ODUtNjhlN2VkMmI1MTQzIn0.iLnmJvybhWNu1le015jaPte5ZB7cPU13_lKmr3MT3C8",
  "access_expires_at": "2026-10-30T14:50:41.194342882Z",
  "refresh_token": "tpf_U3ePOq3QEDHgMrBb5deMopdlMX2yvVC6S6Kh0dY",
  "refresh_expires_at": "2026-10-31T02:35:41.193670718Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "177a1f14-fa22-4778-a24c-b50adbf4d504",
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
  "id": "d505675a-70f5-4045-a75e-5fa25a3986d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:40:41.496728Z",
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
  "command_id": "49e30c04-7a1f-4a2e-a4af-5228ef6f870d",
  "quote_id": "d505675a-70f5-4045-a75e-5fa25a3986d3",
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
  "id": "c76cbf25-6aa5-4061-9447-7409cd394981",
  "short_number": 33,
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
  "created_at": "2026-10-30T14:35:41.828645Z",
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
    "id": "85cf041d-a395-4b9b-a6ae-7e220a01429c",
    "order_id": "c76cbf25-6aa5-4061-9447-7409cd394981",
    "expires_at": "2026-10-30T14:35:56.832799Z",
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

`POST /api/driver/v1/offers/85cf041d-a395-4b9b-a6ae-7e220a01429c/accept` → **200**

```json
{
  "command_id": "5e5d53fa-96b4-4bd6-ba88-c31982d8b8a1"
}
```

```json
{
  "id": "e88dbba3-9e66-4851-88ec-b05f12e1a09f",
  "order_id": "c76cbf25-6aa5-4061-9447-7409cd394981",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5cb899f1-603c-45a8-bef7-a5bb812ae2f8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5cb899f1-603c-45a8-bef7-a5bb812ae2f8",
  "order_id": "c76cbf25-6aa5-4061-9447-7409cd394981",
  "assignment_id": "e88dbba3-9e66-4851-88ec-b05f12e1a09f",
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

`POST /api/driver/v1/work-sessions/65c4ab65-8a1e-45b7-8235-767c684e8409/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T14:35:52Z",
    "sequence": 1793370952373
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "65c4ab65-8a1e-45b7-8235-767c684e8409",
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
  "last_heartbeat_at": "2026-10-30T14:35:52.391435Z",
  "last_location_at": "2026-10-30T14:35:52.391435Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5cb899f1-603c-45a8-bef7-a5bb812ae2f8/arrive` → **200**

```json
{
  "command_id": "dcd92dd8-b9c1-4834-9e9a-b8de54bde496",
  "expected_version": 0
}
```

```json
{
  "id": "5cb899f1-603c-45a8-bef7-a5bb812ae2f8",
  "order_id": "c76cbf25-6aa5-4061-9447-7409cd394981",
  "assignment_id": "e88dbba3-9e66-4851-88ec-b05f12e1a09f",
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
  "arrived_at": "2026-10-30T14:35:52.691987Z",
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

`POST /api/driver/v1/trips/5cb899f1-603c-45a8-bef7-a5bb812ae2f8/start` → **200**

```json
{
  "command_id": "801db056-26d6-4394-869e-e53f85f75545",
  "expected_version": 1
}
```

```json
{
  "id": "5cb899f1-603c-45a8-bef7-a5bb812ae2f8",
  "order_id": "c76cbf25-6aa5-4061-9447-7409cd394981",
  "assignment_id": "e88dbba3-9e66-4851-88ec-b05f12e1a09f",
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
  "arrived_at": "2026-10-30T14:35:52.691987Z",
  "started_at": "2026-10-30T14:35:53.00231Z",
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

`POST /api/driver/v1/trips/5cb899f1-603c-45a8-bef7-a5bb812ae2f8/complete` → **200**

```json
{
  "command_id": "9801e013-a6bc-4729-a253-b5f2f9f73dca",
  "expected_version": 2,
  "reported_at": "2026-10-30T14:35:53Z",
  "cash_received": true
}
```

```json
{
  "id": "5cb899f1-603c-45a8-bef7-a5bb812ae2f8",
  "order_id": "c76cbf25-6aa5-4061-9447-7409cd394981",
  "assignment_id": "e88dbba3-9e66-4851-88ec-b05f12e1a09f",
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
  "arrived_at": "2026-10-30T14:35:52.691987Z",
  "started_at": "2026-10-30T14:35:53.00231Z",
  "completed_at": "2026-10-30T14:35:53.328783Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/c76cbf25-6aa5-4061-9447-7409cd394981` → **200**

```json
{
  "id": "c76cbf25-6aa5-4061-9447-7409cd394981",
  "short_number": 33,
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
    "id": "e88dbba3-9e66-4851-88ec-b05f12e1a09f",
    "order_id": "c76cbf25-6aa5-4061-9447-7409cd394981",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5cb899f1-603c-45a8-bef7-a5bb812ae2f8",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T14:35:41.828645Z",
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
  "session_id": "7f321208-b8d3-4b2c-b791-6d78d9174d7a",
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
  "last_heartbeat_at": "2026-10-30T14:35:39.98612Z",
  "last_location_at": "2026-10-30T14:35:39.98612Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7f321208-b8d3-4b2c-b791-6d78d9174d7a/close` → **200**

```json
{
  "command_id": "0da6f91f-c99d-4549-b25e-ec14e9166765",
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
  "session_id": "65c4ab65-8a1e-45b7-8235-767c684e8409",
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
  "last_heartbeat_at": "2026-10-30T14:35:52.391435Z",
  "last_location_at": "2026-10-30T14:35:52.391435Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/65c4ab65-8a1e-45b7-8235-767c684e8409/close` → **200**

```json
{
  "command_id": "f74109d8-ff6e-4621-b21f-cd751c11ed49",
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

Done: terminal order c76cbf25-6aa5-4061-9447-7409cd394981 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5312"
}
```

```json
{
  "challenge_id": "6faaf16e-3e96-432c-a1c2-9cb8511213bc",
  "expires_at": "2026-10-30T14:40:58.435024014Z",
  "resend_available_at": "2026-10-30T14:35:59.435024014Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "791652",
  "sent_at": "2026-10-30T14:35:58.438817616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6faaf16e-3e96-432c-a1c2-9cb8511213bc",
  "code": "791652",
  "device_ref": "sandbox-5312"
}
```

```json
{
  "session_id": "caa3c740-c5c5-4baa-a31f-99185ee99248",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTg1OCwiaWF0IjoxNzkzMzcwOTU4LCJqdGkiOiI2ZTFmN2Y0Yi01MTBhLTRkZmUtOGZjZS01NjYwYzY3NjFjOWYiLCJzaWQiOiJjYWEzYzc0MC1jNWM1LTRiYWEtYTMxZi05OTE4NWVlOTkyNDgifQ.qP6FvJb7FTSaSlpU9t927wO9nPhLpA2Ab0z80o1fw0Q",
  "access_expires_at": "2026-10-30T14:50:58.755710492Z",
  "refresh_token": "TyotHLbVwTcWHZLSdW_kYAPbnzWJk1R_Jf5gcpzMLcE",
  "refresh_expires_at": "2026-11-29T14:35:58.755123958Z",
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
  "device_ref": "sandbox-3364"
}
```

```json
{
  "challenge_id": "343a19d1-59c3-4a39-88dd-97dffb0990d3",
  "expires_at": "2026-10-30T14:40:59.33009209Z",
  "resend_available_at": "2026-10-30T14:36:00.33009209Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "257415",
  "sent_at": "2026-10-30T14:35:59.332831759Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "343a19d1-59c3-4a39-88dd-97dffb0990d3",
  "code": "257415",
  "device_ref": "sandbox-3364"
}
```

```json
{
  "session_id": "020ae9d3-9256-416e-a312-ac81b41fc830",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTg1OSwiaWF0IjoxNzkzMzcwOTU5LCJqdGkiOiJiOGRlYzA0My03ZDhkLTQ4MDEtYjhjNC04MmFjYzFmYzRlMTQiLCJzaWQiOiIwMjBhZTlkMy05MjU2LTQxNmUtYTMxMi1hYzgxYjQxZmM4MzAifQ.X-viV6sTQAf3fAcDlySq5zGxQ-_9IbsF8YdK8v8LpKw",
  "access_expires_at": "2026-10-30T14:50:59.649804657Z",
  "refresh_token": "ZhycmocoZTNIFP05pp0cesfAv5rssJoYJhzPAnEVFNA",
  "refresh_expires_at": "2026-11-29T14:35:59.64928065Z",
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
  "device_ref": "sandbox-17363"
}
```

```json
{
  "challenge_id": "b158172f-aecf-4069-b907-3179f266aa50",
  "expires_at": "2026-10-30T14:41:00.224274491Z",
  "resend_available_at": "2026-10-30T14:36:01.224274491Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "653078",
  "sent_at": "2026-10-30T14:36:00.226979756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b158172f-aecf-4069-b907-3179f266aa50",
  "code": "653078",
  "device_ref": "sandbox-17363"
}
```

```json
{
  "session_id": "fea1b4b3-45e7-4ac8-bd6f-8fcd4a6c756c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3MTg2MCwiaWF0IjoxNzkzMzcwOTYwLCJqdGkiOiIzMjUzZDdiNC00NWJkLTQ2NzAtOWYwYS1iOTRmOGE4NTEyMDIiLCJzaWQiOiJmZWExYjRiMy00NWU3LTRhYzgtYmQ2Zi04ZmNkNGE2Yzc1NmMifQ.iyg1gFukDXcGAcbjhrwmsrsv6OhZ9D7CEEm9BW6Um3w",
  "access_expires_at": "2026-10-30T14:51:00.547361354Z",
  "refresh_token": "f54gz05jlF5MlhyJFlg5UdSV15edgKpxf2IdlDSkILs",
  "refresh_expires_at": "2026-11-29T14:36:00.546762116Z",
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
  "phone": "+380696250030",
  "device_ref": "sandbox-2887"
}
```

```json
{
  "challenge_id": "908a6fe2-97c9-4917-af1d-505f50fc8f2a",
  "expires_at": "2026-10-30T14:41:01.110568403Z",
  "resend_available_at": "2026-10-30T14:36:02.110568403Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380696250030` → **200**

```json
{
  "phone": "+380696250030",
  "audience": "CLIENT",
  "code": "869969",
  "sent_at": "2026-10-30T14:36:01.113188741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "908a6fe2-97c9-4917-af1d-505f50fc8f2a",
  "code": "869969",
  "device_ref": "sandbox-2887"
}
```

```json
{
  "session_id": "d65e32a2-56c5-4983-916c-af1f6f606b14",
  "subject": {
    "type": "CLIENT",
    "id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjA0YjdiNS1iN2I1LTQyYzctYTBlNC00MTM1MTBkY2MwMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzcxODYxLCJpYXQiOjE3OTMzNzA5NjEsImp0aSI6IjgwNmE4OTI1LTcxYzktNGY2NS1iMmZkLTc5OGI3ZDExMGQ5YSIsInNpZCI6ImQ2NWUzMmEyLTU2YzUtNDk4My05MTZjLWFmMWY2ZjYwNmIxNCJ9.KsMNvkhyl-qnwB1RqwY3h4Lo1jKaA-u6mKwoBJlSmp8",
  "access_expires_at": "2026-10-30T14:51:01.425494952Z",
  "refresh_token": "hF1O-flb9q-F8urbujrRp1PhzVuGHu7hGJnM0NUsOIU",
  "refresh_expires_at": "2026-11-29T14:36:01.424933705Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0bc4bb38-80df-42af-9890-98aee10813dd",
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
  "id": "c95b1651-e2c7-4fb1-9492-fbf0ebe1f005",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T14:41:01.709376Z",
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
  "command_id": "49190754-edcd-49fe-b8d2-4c80df57b581",
  "quote_id": "c95b1651-e2c7-4fb1-9492-fbf0ebe1f005",
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
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T14:36:02.013902Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:36:02.013902Z",
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
  "blizz_orders_total": 34,
  "blizz_orders_cancelled_total": 19,
  "blizz_orders_unfulfilled_total": 2,
  "blizz_dispatch_first_offer_seconds_count": 22,
  "blizz_dispatch_assigned_seconds_count": 18,
  "blizz_offers_total": 25,
  "blizz_dispatch_excluded_total": 19,
  "blizz_sms_sent_total": 82
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 12.03420759
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.121932656
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAUSED"} 4.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 8.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 22
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.218989879
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 17.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 2.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 6.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 26.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 2.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 2.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 75.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/334c23c8-ed0f-4204-b7a8-5b9bd587ab3d` → **200**

```json
{
  "id": "334c23c8-ed0f-4204-b7a8-5b9bd587ab3d",
  "short_number": 34,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c204b7b5-b7b5-42c7-a0e4-413510dcc013",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T14:36:02.013902Z",
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
  "session_id": "cd81f651-4294-4f2e-a3d3-1685b84b90e2",
  "subject": {
    "type": "STAFF",
    "id": "1fd239e2-3bcd-4466-a66b-062008a1dc3d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmQyMzllMi0zYmNkLTQ0NjYtYTY2Yi0wNjIwMDhhMWRjM2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzIwNDQsImlhdCI6MTc5MzM3MTE0NCwianRpIjoiNWJjZmVmZTUtOTZhMi00YWI4LWFiOTQtZTliZjQyZDAwOTFhIiwic2lkIjoiY2Q4MWY2NTEtNDI5NC00ZjJlLWEzZDMtMTY4NWI4NGI5MGUyIn0.k_nVwwizmLL2glSPplntKO913MZNue4x7AaNjLUZd5w",
  "access_expires_at": "2026-10-30T14:54:04.230054949Z",
  "refresh_token": "RAyvP6RrSNC3j7stGC7ua1gKbDxknUR20Hr_w76RsRQ",
  "refresh_expires_at": "2026-10-31T02:39:04.229158807Z",
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
  "id": "2067c4b7-a6d8-4d19-a96f-8b60519b0db0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:39:04.544325Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:39:04.544361Z",
  "updated_at": "2026-10-30T14:39:04.563096Z",
  "finished_at": "2026-10-30T14:39:04.563096Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/2067c4b7-a6d8-4d19-a96f-8b60519b0db0` → **200**

```json
{
  "run": {
    "id": "2067c4b7-a6d8-4d19-a96f-8b60519b0db0",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T14:39:04.544325Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T14:39:04.544361Z",
    "updated_at": "2026-10-30T14:39:04.563096Z",
    "finished_at": "2026-10-30T14:39:04.563096Z",
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
  "id": "2067c4b7-a6d8-4d19-a96f-8b60519b0db0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:39:04.544325Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:39:04.544361Z",
  "updated_at": "2026-10-30T14:39:04.563096Z",
  "finished_at": "2026-10-30T14:39:04.563096Z",
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
  "id": "2067c4b7-a6d8-4d19-a96f-8b60519b0db0",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:39:04.544325Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:39:04.544361Z",
  "updated_at": "2026-10-30T14:39:04.563096Z",
  "finished_at": "2026-10-30T14:39:04.563096Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/c975e349-f733-4e73-b5fb-e4670e9176d4` → **204**

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
  "id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:39:05.013419Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:39:05.013456Z",
  "updated_at": "2026-10-30T14:39:05.023031Z",
  "finished_at": "2026-10-30T14:39:05.023031Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/b284aaee-94c3-4375-b7f9-e33e7305d282` → **200**

```json
{
  "run": {
    "id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T14:39:05.013419Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T14:39:05.013456Z",
    "updated_at": "2026-10-30T14:39:05.023031Z",
    "finished_at": "2026-10-30T14:39:05.023031Z",
    "version": 1
  },
  "items": [
    {
      "id": "c2bd0bba-c5b3-4926-bb36-45e2ad932c00",
      "run_id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "3f5bc08b4eb924eda986f3fd26bc69bec3f4cc7394273c8067c5a28eabacbfd6",
      "reference_display": "sandbox-reconciliation-c975e349-f733-4e73-b5fb-e4670e9176d4",
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
      "provider_at": "2026-10-30T14:39:04Z",
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
  "id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:39:05.013419Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:39:05.013456Z",
  "updated_at": "2026-10-30T14:39:05.023031Z",
  "finished_at": "2026-10-30T14:39:05.023031Z",
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
  "id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:39:05.013419Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:39:05.013456Z",
  "updated_at": "2026-10-30T14:39:05.023031Z",
  "finished_at": "2026-10-30T14:39:05.023031Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/c2bd0bba-c5b3-4926-bb36-45e2ad932c00/resolve` → **200**

```json
{
  "command_id": "d53c0e24-dce4-43e7-87b1-efe8bf46310e",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "c2bd0bba-c5b3-4926-bb36-45e2ad932c00",
  "run_id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "3f5bc08b4eb924eda986f3fd26bc69bec3f4cc7394273c8067c5a28eabacbfd6",
  "reference_display": "sandbox-reconciliation-c975e349-f733-4e73-b5fb-e4670e9176d4",
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
  "provider_at": "2026-10-30T14:39:04Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "resolved_at": "2026-10-30T14:39:05.467441Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/c2bd0bba-c5b3-4926-bb36-45e2ad932c00/resolve` → **200**

```json
{
  "command_id": "d53c0e24-dce4-43e7-87b1-efe8bf46310e",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "c2bd0bba-c5b3-4926-bb36-45e2ad932c00",
  "run_id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "3f5bc08b4eb924eda986f3fd26bc69bec3f4cc7394273c8067c5a28eabacbfd6",
  "reference_display": "sandbox-reconciliation-c975e349-f733-4e73-b5fb-e4670e9176d4",
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
  "provider_at": "2026-10-30T14:39:04Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
  "resolved_at": "2026-10-30T14:39:05.467441Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/c2bd0bba-c5b3-4926-bb36-45e2ad932c00/resolve` → **409**

```json
{
  "command_id": "46fcae1c-60fc-48fc-9ff6-43195dcf5b79",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/c2bd0bba-c5b3-4926-bb36-45e2ad932c00/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b76307b8-dc24-406a-ba2c-bccdaf5dc864"
}
```

`GET /api/admin/v1/payment-reconciliations/b284aaee-94c3-4375-b7f9-e33e7305d282` → **200**

```json
{
  "run": {
    "id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T14:39:05.013419Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T14:39:05.013456Z",
    "updated_at": "2026-10-30T14:39:05.467441Z",
    "finished_at": "2026-10-30T14:39:05.023031Z",
    "version": 2
  },
  "items": [
    {
      "id": "c2bd0bba-c5b3-4926-bb36-45e2ad932c00",
      "run_id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "3f5bc08b4eb924eda986f3fd26bc69bec3f4cc7394273c8067c5a28eabacbfd6",
      "reference_display": "sandbox-reconciliation-c975e349-f733-4e73-b5fb-e4670e9176d4",
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
      "provider_at": "2026-10-30T14:39:04Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "1fd239e2-3bcd-4466-a66b-062008a1dc3d",
      "resolved_at": "2026-10-30T14:39:05.467441Z",
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
      "id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T14:39:05.013419Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T14:39:05.013456Z",
      "updated_at": "2026-10-30T14:39:05.467441Z",
      "finished_at": "2026-10-30T14:39:05.023031Z",
      "version": 2
    },
    {
      "id": "23433799-0281-4d66-88d4-c38213e0ecc6",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T14:19:13.73627Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T14:19:13.736419Z",
      "updated_at": "2026-10-30T14:19:13.742425Z",
      "finished_at": "2026-10-30T14:19:13.742425Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/c975e349-f733-4e73-b5fb-e4670e9176d4` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "b284aaee-94c3-4375-b7f9-e33e7305d282",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T14:39:05.013419Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T14:39:05.013456Z",
  "updated_at": "2026-10-30T14:39:05.467441Z",
  "finished_at": "2026-10-30T14:39:05.023031Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79337126915E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793371269685E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793371269686E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793371269172E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793371269687E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
