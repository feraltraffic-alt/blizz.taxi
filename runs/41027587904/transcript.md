# Sandbox transcript (2026-10-30T08:37:27Z, 4bfdf62)

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
  "correlation_id": "10a0b809-db2f-4642-b451-4c54b9ce71a0"
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
  "session_id": "10f88ae7-c12d-40a7-94ff-5fe00e436abf",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTAzNTQsImlhdCI6MTc5MzM0OTQ1NCwianRpIjoiYTEwNDgzMWEtYjU3Zi00NjkzLWIyODQtYzYyZjQ3ZmE0YmU1Iiwic2lkIjoiMTBmODhhZTctYzEyZC00MGE3LTk0ZmYtNWZlMDBlNDM2YWJmIn0.DYI2cgo7rTBpnSCh9rewxSQCvjH05tjxW_iqehxQx1A",
  "access_expires_at": "2026-10-30T08:52:34.654443032Z",
  "refresh_token": "TZMKH9KgC0kDhG0pO_foS77RiKID5Vmy4y2jjlfFSBo",
  "refresh_expires_at": "2026-10-30T20:37:34.652334655Z",
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
  "session_id": "154bd555-f985-46c2-b0ec-898ff66c9eb8",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTAzNTYsImlhdCI6MTc5MzM0OTQ1NiwianRpIjoiNjliNDgxOWUtNGY2MC00ODFhLTljMTEtYjIzNTg2ZTMwM2VmIiwic2lkIjoiMTU0YmQ1NTUtZjk4NS00NmMyLWIwZWMtODk4ZmY2NmM5ZWI4In0.FDY8Jg-bly_cFD0AM824llBh1nQJ_LhOnoz7MMIwAEM",
  "access_expires_at": "2026-10-30T08:52:36.516003838Z",
  "refresh_token": "YU0NkxSmXbo11Mj4_SSmF12wJVsPdHU8OCZ8n2yTh_s",
  "refresh_expires_at": "2026-10-30T20:37:36.51513038Z",
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
  "device_ref": "sandbox-13446"
}
```

```json
{
  "challenge_id": "c49b6057-1699-4069-ada0-9b45fe93e277",
  "expires_at": "2026-10-30T08:42:37.124668456Z",
  "resend_available_at": "2026-10-30T08:37:38.124668456Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "320074",
  "sent_at": "2026-10-30T08:37:37.138167267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c49b6057-1699-4069-ada0-9b45fe93e277",
  "code": "320074",
  "device_ref": "sandbox-13446"
}
```

```json
{
  "session_id": "f0187f08-070e-437b-8f6e-0a7ab44573b0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDM1NywiaWF0IjoxNzkzMzQ5NDU3LCJqdGkiOiI1NzNkOTk5My1hMmNmLTRhOTItOGMxNS1kODc3NGMzY2Q0MjYiLCJzaWQiOiJmMDE4N2YwOC0wNzBlLTQzN2ItOGY2ZS0wYTdhYjQ0NTczYjAifQ.fdGA1I_mzrqCBEJW-O5eq3o99PtYGjpPnhYAGe_QS_s",
  "access_expires_at": "2026-10-30T08:52:37.487730961Z",
  "refresh_token": "16GeA5VSIFG7ToIJR52A8dV2O-uZ57TVMigDFG3lo-Q",
  "refresh_expires_at": "2026-11-29T08:37:37.486702734Z",
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
  "command_id": "575ff70f-146e-4d96-8e2a-35ad45832a34",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:37:38Z",
    "sequence": 1793349458807
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d1896d56-a7eb-4dfd-b6b9-ea39981bd03f",
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
  "last_heartbeat_at": "2026-10-30T08:37:38.188085Z",
  "last_location_at": "2026-10-30T08:37:38.188085Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638760398",
  "device_ref": "sandbox-22574"
}
```

```json
{
  "challenge_id": "db3bdbdf-074b-4fd3-969d-e5e46b8e030b",
  "expires_at": "2026-10-30T08:42:38.498408277Z",
  "resend_available_at": "2026-10-30T08:37:39.498408277Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638760398` → **200**

```json
{
  "phone": "+380638760398",
  "audience": "CLIENT",
  "code": "887943",
  "sent_at": "2026-10-30T08:37:38.502864232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db3bdbdf-074b-4fd3-969d-e5e46b8e030b",
  "code": "887943",
  "device_ref": "sandbox-22574"
}
```

```json
{
  "session_id": "8f5cbb02-e3d0-4cc8-8a5f-69397fd9fcfa",
  "subject": {
    "type": "CLIENT",
    "id": "701343bf-76c7-4832-84d0-c9302f38ada4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MDEzNDNiZi03NmM3LTQ4MzItODRkMC1jOTMwMmYzOGFkYTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwMzU4LCJpYXQiOjE3OTMzNDk0NTgsImp0aSI6IjMyOWZlMjNmLWVlNGItNDlkMC05N2FkLWU1ZTgwNGI0MjY4YSIsInNpZCI6IjhmNWNiYjAyLWUzZDAtNGNjOC04YTVmLTY5Mzk3ZmQ5ZmNmYSJ9.RZn3ljfsZm7nOpziWoLtxz5KuzDKQNfc7tChqv4gG6A",
  "access_expires_at": "2026-10-30T08:52:38.813412958Z",
  "refresh_token": "A4me_kixGIGXqTdkmZSnBPnz1aIZPlzL1ptAkJsgWpw",
  "refresh_expires_at": "2026-11-29T08:37:38.812297409Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "46c3cca9-1fca-4276-a21d-c40e68e18278",
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
  "id": "cba701ba-5546-4262-8b09-c3212af02be8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:42:39.132340Z",
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
  "command_id": "3e888246-fe95-4b54-b2fc-ad5dbe59041d",
  "quote_id": "cba701ba-5546-4262-8b09-c3212af02be8",
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
  "id": "670fbe8b-4586-4a17-9780-5dc5770c482a",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "701343bf-76c7-4832-84d0-c9302f38ada4",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:37:39.513894Z",
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
    "id": "1a11544a-d529-47fd-9440-f92750edf6ef",
    "order_id": "670fbe8b-4586-4a17-9780-5dc5770c482a",
    "expires_at": "2026-10-30T08:37:54.526084Z",
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

`POST /api/driver/v1/offers/1a11544a-d529-47fd-9440-f92750edf6ef/accept` → **200**

```json
{
  "command_id": "1b1ae221-2579-42db-94a7-3e3de9507886"
}
```

```json
{
  "id": "ce2bd5f5-35d5-421b-86e7-796a4d89b2e5",
  "order_id": "670fbe8b-4586-4a17-9780-5dc5770c482a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bd064f7f-002d-4a54-b497-f3452cbd1b88",
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
  "command_id": "12d91762-12c1-4700-ab40-0bce61d4c55d",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:37:40.801248825Z"
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
  "id": "bd064f7f-002d-4a54-b497-f3452cbd1b88",
  "order_id": "670fbe8b-4586-4a17-9780-5dc5770c482a",
  "assignment_id": "ce2bd5f5-35d5-421b-86e7-796a4d89b2e5",
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

`POST /api/driver/v1/work-sessions/d1896d56-a7eb-4dfd-b6b9-ea39981bd03f/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:37:41Z",
    "sequence": 1793349461730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d1896d56-a7eb-4dfd-b6b9-ea39981bd03f",
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
  "last_heartbeat_at": "2026-10-30T08:37:41.758258Z",
  "last_location_at": "2026-10-30T08:37:41.758258Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/bd064f7f-002d-4a54-b497-f3452cbd1b88/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e5f2eccb-8dcc-4ce5-b9b7-92ead1cb7a11",
  "expected_version": 0
}
```

```json
{
  "id": "bd064f7f-002d-4a54-b497-f3452cbd1b88",
  "order_id": "670fbe8b-4586-4a17-9780-5dc5770c482a",
  "assignment_id": "ce2bd5f5-35d5-421b-86e7-796a4d89b2e5",
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
  "arrived_at": "2026-10-30T08:37:42.069597Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bd064f7f-002d-4a54-b497-f3452cbd1b88/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ae842632-eda5-485b-9339-f3f53cc4bd0a",
  "expected_version": 1
}
```

```json
{
  "id": "bd064f7f-002d-4a54-b497-f3452cbd1b88",
  "order_id": "670fbe8b-4586-4a17-9780-5dc5770c482a",
  "assignment_id": "ce2bd5f5-35d5-421b-86e7-796a4d89b2e5",
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
  "arrived_at": "2026-10-30T08:37:42.069597Z",
  "started_at": "2026-10-30T08:37:42.386159Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bd064f7f-002d-4a54-b497-f3452cbd1b88/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9e8dda9c-9a67-4070-a910-9629d6f74175",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:37:42Z",
  "cash_received": true
}
```

```json
{
  "id": "bd064f7f-002d-4a54-b497-f3452cbd1b88",
  "order_id": "670fbe8b-4586-4a17-9780-5dc5770c482a",
  "assignment_id": "ce2bd5f5-35d5-421b-86e7-796a4d89b2e5",
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
  "arrived_at": "2026-10-30T08:37:42.069597Z",
  "started_at": "2026-10-30T08:37:42.386159Z",
  "completed_at": "2026-10-30T08:37:42.718757Z",
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
  "session_id": "d1896d56-a7eb-4dfd-b6b9-ea39981bd03f",
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
  "last_heartbeat_at": "2026-10-30T08:37:41.758258Z",
  "last_location_at": "2026-10-30T08:37:41.758258Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d1896d56-a7eb-4dfd-b6b9-ea39981bd03f/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "92c67ac8-1f2b-4fad-934a-1d3e52395eff",
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
  "command_id": "54d6812e-44fd-4427-95ee-f3fcbb9c063c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:37:43Z",
    "sequence": 1793349463646
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
  "correlation_id": "7012ffc8-fbad-4dad-b05d-4543f592d97b",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "e5cace01-f33e-49f7-bd15-7588f328dc78",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:37:43Z",
    "sequence": 1793349463955
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ef70174-8d49-4158-b362-527aa38c0706",
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
  "last_heartbeat_at": "2026-10-30T08:37:43.976829Z",
  "last_location_at": "2026-10-30T08:37:43.976829Z",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:37:40.801249Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "34ff6882-77ae-41d0-93e9-245357110ea0",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:37:44.569042474Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ef70174-8d49-4158-b362-527aa38c0706",
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
  "last_heartbeat_at": "2026-10-30T08:37:43.976829Z",
  "last_location_at": "2026-10-30T08:37:43.976829Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ef70174-8d49-4158-b362-527aa38c0706/close` → **200**

```json
{
  "command_id": "c3047b4d-29d9-4dc5-afe8-c1f8d163c36b",
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
  "session_id": "b1dfb0a0-97cc-4787-af6f-fe976ee98031",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTAzNjUsImlhdCI6MTc5MzM0OTQ2NSwianRpIjoiYzYzM2NmNDgtMDMxZS00ZjZjLWI1MzItYjZlYzFlYmRlYTI3Iiwic2lkIjoiYjFkZmIwYTAtOTdjYy00Nzg3LWFmNmYtZmU5NzZlZTk4MDMxIn0.V6chbUQqbrQ0wUZaRdZ6ZKz0GzjI-_znN1gv23wpY8c",
  "access_expires_at": "2026-10-30T08:52:45.804519597Z",
  "refresh_token": "pB8mQt0AsLolTR1IU53ngbyir-NrrZ9q1Vx_TNs_Myk",
  "refresh_expires_at": "2026-10-30T20:37:45.803659139Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "e856ae6e-df28-422b-913d-18793a140bf5",
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
  "id": "f6b35c51-99ba-4cfa-9ea6-ec2311d5cc0d",
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
  "created_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "created_at": "2026-10-30T08:37:46.10822Z",
  "updated_at": "2026-10-30T08:37:46.10822Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637116575",
  "device_ref": "sandbox-2819"
}
```

```json
{
  "challenge_id": "89e58401-52ec-4a7c-9167-1bd9e2ceeec6",
  "expires_at": "2026-10-30T08:42:46.408806512Z",
  "resend_available_at": "2026-10-30T08:37:47.408806512Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637116575` → **200**

```json
{
  "phone": "+380637116575",
  "audience": "CLIENT",
  "code": "929802",
  "sent_at": "2026-10-30T08:37:46.413616879Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89e58401-52ec-4a7c-9167-1bd9e2ceeec6",
  "code": "929802",
  "device_ref": "sandbox-2819"
}
```

```json
{
  "session_id": "8067eedb-1507-40ef-8a53-8b3a112eb4df",
  "subject": {
    "type": "CLIENT",
    "id": "97906502-96d2-4b57-9cca-6495ee3f239d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzkwNjUwMi05NmQyLTRiNTctOWNjYS02NDk1ZWUzZjIzOWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwMzY2LCJpYXQiOjE3OTMzNDk0NjYsImp0aSI6ImYwNDFmYjYxLTU1YjItNDk5My04ODBhLWFiOGQ5NjA1Nzk1MiIsInNpZCI6IjgwNjdlZWRiLTE1MDctNDBlZi04YTUzLThiM2ExMTJlYjRkZiJ9.fjwaNmjrWlXYTFy9MzOUyFfzMBH_46kirDA2acH8VEw",
  "access_expires_at": "2026-10-30T08:52:46.720763044Z",
  "refresh_token": "_6CCF_dIqdpWJT9Zwiy3hqm3iTrNchaHdNYkbKsf_gI",
  "refresh_expires_at": "2026-11-29T08:37:46.719915654Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637116575` → **200**

```json
{
  "client_id": "97906502-96d2-4b57-9cca-6495ee3f239d"
}
```

`POST /api/admin/v1/rider-wallets/97906502-96d2-4b57-9cca-6495ee3f239d/top-ups` → **201**

```json
{
  "command_id": "b4c0df16-dcb8-44a2-ae3d-9d81fa5c74f1",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "97906502-96d2-4b57-9cca-6495ee3f239d",
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
      "id": "6eff823f-e915-4f9c-b444-11c2d592f20f",
      "at": "2026-10-30T08:37:47.286628Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7774598e-c8bd-4774-9378-2f8f187bf555",
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
  "id": "bcefe052-9489-44b9-a6e0-6633433c651a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:42:47.596833Z",
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
      "id": "f6b35c51-99ba-4cfa-9ea6-ec2311d5cc0d",
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
  "device_ref": "sandbox-24799"
}
```

```json
{
  "challenge_id": "d470fd65-1008-4bda-b13a-4eab635ffcae",
  "expires_at": "2026-10-30T08:42:47.903304614Z",
  "resend_available_at": "2026-10-30T08:37:48.903304614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "711259",
  "sent_at": "2026-10-30T08:37:47.907582614Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d470fd65-1008-4bda-b13a-4eab635ffcae",
  "code": "711259",
  "device_ref": "sandbox-24799"
}
```

```json
{
  "session_id": "3b2e0758-49f2-45f7-8322-6fba4b28b158",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDM2OCwiaWF0IjoxNzkzMzQ5NDY4LCJqdGkiOiI3ZWNjNzdiYS05NWE0LTQxOTAtYjdkOC1iNWYxZmE1ZDY4MzIiLCJzaWQiOiIzYjJlMDc1OC00OWYyLTQ1ZjctODMyMi02ZmJhNGIyOGIxNTgifQ.9Ps2dof4mHlS0JvKDU7rqVT9ANsPniGgQxOJnlX-pMo",
  "access_expires_at": "2026-10-30T08:52:48.213340128Z",
  "refresh_token": "CKqpnkxmGbAf6xBQeSoD4i0AJuMsNBBZqtUevBeGnMI",
  "refresh_expires_at": "2026-11-29T08:37:48.212419792Z",
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
  "command_id": "ff76e4c4-83d8-4e09-9a72-2c2e844380bb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:37:48Z",
    "sequence": 1793349468812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c58fa57a-ec79-4fbd-8810-0eccd89fa417",
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
  "last_heartbeat_at": "2026-10-30T08:37:48.834328Z",
  "last_location_at": "2026-10-30T08:37:48.834328Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "138aa79d-ce14-47bd-9614-3df0c0da570b",
  "quote_id": "bcefe052-9489-44b9-a6e0-6633433c651a",
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
  "id": "338c1547-5d56-4385-b4a2-e0079f1e5123",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "97906502-96d2-4b57-9cca-6495ee3f239d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:37:49.151611Z",
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
  "client_id": "97906502-96d2-4b57-9cca-6495ee3f239d",
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
      "id": "6eff823f-e915-4f9c-b444-11c2d592f20f",
      "at": "2026-10-30T08:37:47.286628Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
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
    "id": "6e3a76ac-7b0d-4f17-ad8d-d2114252b7cc",
    "order_id": "338c1547-5d56-4385-b4a2-e0079f1e5123",
    "expires_at": "2026-10-30T08:38:04.160521Z",
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

`POST /api/driver/v1/offers/6e3a76ac-7b0d-4f17-ad8d-d2114252b7cc/accept` → **200**

```json
{
  "command_id": "310b1cb6-33bf-47c2-8ae2-2f53e55a7c7f"
}
```

```json
{
  "id": "a37ae9f4-cf51-46c2-8757-55b06ed2b634",
  "order_id": "338c1547-5d56-4385-b4a2-e0079f1e5123",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6df4d905-d0c6-4b51-8e28-a59afbbebf29",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6df4d905-d0c6-4b51-8e28-a59afbbebf29",
  "order_id": "338c1547-5d56-4385-b4a2-e0079f1e5123",
  "assignment_id": "a37ae9f4-cf51-46c2-8757-55b06ed2b634",
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

`POST /api/driver/v1/work-sessions/c58fa57a-ec79-4fbd-8810-0eccd89fa417/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:37:52Z",
    "sequence": 1793349472676
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c58fa57a-ec79-4fbd-8810-0eccd89fa417",
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
  "last_heartbeat_at": "2026-10-30T08:37:52.698446Z",
  "last_location_at": "2026-10-30T08:37:52.698446Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/6df4d905-d0c6-4b51-8e28-a59afbbebf29/arrive` → **200**

```json
{
  "command_id": "0f3c8735-b21c-4e6b-9722-bd1ac8edfe0f",
  "expected_version": 0
}
```

```json
{
  "id": "6df4d905-d0c6-4b51-8e28-a59afbbebf29",
  "order_id": "338c1547-5d56-4385-b4a2-e0079f1e5123",
  "assignment_id": "a37ae9f4-cf51-46c2-8757-55b06ed2b634",
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
  "arrived_at": "2026-10-30T08:37:52.999032Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6df4d905-d0c6-4b51-8e28-a59afbbebf29/start` → **200**

```json
{
  "command_id": "cfa2799d-ecf0-4413-aec7-d6136ffaf6cd",
  "expected_version": 1
}
```

```json
{
  "id": "6df4d905-d0c6-4b51-8e28-a59afbbebf29",
  "order_id": "338c1547-5d56-4385-b4a2-e0079f1e5123",
  "assignment_id": "a37ae9f4-cf51-46c2-8757-55b06ed2b634",
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
  "arrived_at": "2026-10-30T08:37:52.999032Z",
  "started_at": "2026-10-30T08:37:53.310354Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/6df4d905-d0c6-4b51-8e28-a59afbbebf29/complete` → **200**

```json
{
  "command_id": "7c0a73eb-ee1c-4ce9-8ef7-18ca1f348ecb",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:37:53Z",
  "cash_received": true
}
```

```json
{
  "id": "6df4d905-d0c6-4b51-8e28-a59afbbebf29",
  "order_id": "338c1547-5d56-4385-b4a2-e0079f1e5123",
  "assignment_id": "a37ae9f4-cf51-46c2-8757-55b06ed2b634",
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
  "arrived_at": "2026-10-30T08:37:52.999032Z",
  "started_at": "2026-10-30T08:37:53.310354Z",
  "completed_at": "2026-10-30T08:37:53.628956Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "97906502-96d2-4b57-9cca-6495ee3f239d",
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
      "id": "4f14e293-2d1f-46c9-8305-a455332565f7",
      "at": "2026-10-30T08:37:54.515259Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "338c1547-5d56-4385-b4a2-e0079f1e5123"
    },
    {
      "id": "6eff823f-e915-4f9c-b444-11c2d592f20f",
      "at": "2026-10-30T08:37:47.286628Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/f6b35c51-99ba-4cfa-9ea6-ec2311d5cc0d/archive` → **200**

```json
{
  "command_id": "7c3554e3-4721-4774-ba33-538c5138a40a",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "f6b35c51-99ba-4cfa-9ea6-ec2311d5cc0d",
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
  "created_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "created_at": "2026-10-30T08:37:46.10822Z",
  "updated_at": "2026-10-30T08:37:57.242317Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c58fa57a-ec79-4fbd-8810-0eccd89fa417",
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
  "last_heartbeat_at": "2026-10-30T08:37:52.698446Z",
  "last_location_at": "2026-10-30T08:37:52.698446Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c58fa57a-ec79-4fbd-8810-0eccd89fa417/close` → **200**

```json
{
  "command_id": "871b25b4-0d61-4616-891f-6fb242385de4",
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

Done: order 338c1547-5d56-4385-b4a2-e0079f1e5123.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-8892"
}
```

```json
{
  "challenge_id": "f4142775-1792-4138-a197-18d2b4ae4cec",
  "expires_at": "2026-10-30T08:42:58.125871015Z",
  "resend_available_at": "2026-10-30T08:37:59.125871015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "784123",
  "sent_at": "2026-10-30T08:37:58.130069505Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4142775-1792-4138-a197-18d2b4ae4cec",
  "code": "784123",
  "device_ref": "sandbox-8892"
}
```

```json
{
  "session_id": "32fe55b5-bcc5-4be6-b060-81766f950e67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDM3OCwiaWF0IjoxNzkzMzQ5NDc4LCJqdGkiOiJkMTI0NDZjNi1mMDM4LTRlZTktYjBkYS1hMTczYmNlYWNjOGIiLCJzaWQiOiIzMmZlNTViNS1iY2M1LTRiZTYtYjA2MC04MTc2NmY5NTBlNjcifQ.duSfm1Vp-s7yPhLP9jFQ3lhc1SnPLsFI46LOeEJxM30",
  "access_expires_at": "2026-10-30T08:52:58.452959313Z",
  "refresh_token": "QsnAvu8XR3N-IZENun5Oqebranhtc4aC3cjBcssveRE",
  "refresh_expires_at": "2026-11-29T08:37:58.452204937Z",
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
  "command_id": "d3010199-e059-442c-861f-364adb3c7a2c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:37:59Z",
    "sequence": 1793349479323
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "782b19ef-3b4e-45b5-9886-1dd5275e4dad",
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
  "last_heartbeat_at": "2026-10-30T08:37:59.344815Z",
  "last_location_at": "2026-10-30T08:37:59.344815Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/782b19ef-3b4e-45b5-9886-1dd5275e4dad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:38:04Z",
    "sequence": 1793349484633
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "782b19ef-3b4e-45b5-9886-1dd5275e4dad",
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
  "last_heartbeat_at": "2026-10-30T08:38:04.654392Z",
  "last_location_at": "2026-10-30T08:37:59.344815Z",
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
  "session_id": "24cb6d9b-9837-4cd7-8c47-e7ff4dd39a03",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTAzODUsImlhdCI6MTc5MzM0OTQ4NSwianRpIjoiZTAzODkzYWMtODA0ZC00MTQyLWEwZWYtOGUyZDgyZGUzOWUwIiwic2lkIjoiMjRjYjZkOWItOTgzNy00Y2Q3LThjNDctZTdmZjRkZDM5YTAzIn0.dqSB80nuEj4swWI-MwOqypFR_ySKxK_aPgZxkInFg9k",
  "access_expires_at": "2026-10-30T08:53:05.277099899Z",
  "refresh_token": "FKcTjZzIAvtxMhzHa-7dSINLr-ZW4iRd1bstFWpZmfM",
  "refresh_expires_at": "2026-10-30T20:38:05.276373078Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T08:38:05.577615645Z",
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
      "last_location_at": "2026-10-30T08:37:59.344815Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/782b19ef-3b4e-45b5-9886-1dd5275e4dad/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:38:05Z",
    "sequence": 1793349485904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "782b19ef-3b4e-45b5-9886-1dd5275e4dad",
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
  "last_heartbeat_at": "2026-10-30T08:38:05.926175Z",
  "last_location_at": "2026-10-30T08:38:05.926175Z",
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
  "session_id": "782b19ef-3b4e-45b5-9886-1dd5275e4dad",
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
  "last_heartbeat_at": "2026-10-30T08:38:05.926175Z",
  "last_location_at": "2026-10-30T08:38:05.926175Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/782b19ef-3b4e-45b5-9886-1dd5275e4dad/close` → **200**

```json
{
  "command_id": "487068a5-8458-4449-85de-f5021c51e19a",
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
  "session_id": "52f2f81c-0aeb-4c87-a2a4-bd9809236561",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTAzODcsImlhdCI6MTc5MzM0OTQ4NywianRpIjoiZDg5YjMxYjEtNWRmYi00ODc0LWFmYTMtYzczZTI4ZGQwNWJiIiwic2lkIjoiNTJmMmY4MWMtMGFlYi00Yzg3LWEyYTQtYmQ5ODA5MjM2NTYxIn0.EP6oGQ4Wh1A3sd1ba1Z5_VYXqVMEJhZJMiakcgPY874",
  "access_expires_at": "2026-10-30T08:53:07.128615196Z",
  "refresh_token": "RYqvcf-hVE2ivqFUma9WQbUHBiNOFrO5LO7_0K8-EpM",
  "refresh_expires_at": "2026-10-30T20:38:07.12795738Z",
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
  "command_id": "5264c8a8-4f8f-4f36-b388-7e62ad0a1721",
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
  "session_id": "f09aa32a-8f73-4cb7-b391-3c9b426cf093",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTAzODgsImlhdCI6MTc5MzM0OTQ4OCwianRpIjoiZWNjNDk5NWYtNDAxYS00ZGFkLWJmY2EtOTM0NWVlYmU3YTg2Iiwic2lkIjoiZjA5YWEzMmEtOGY3My00Y2I3LWIzOTEtM2M5YjQyNmNmMDkzIn0.AKqTUaPg-RMdOxIaOlO6Fc0_BR_gHIV0IW8YxxOW_3k",
  "access_expires_at": "2026-10-30T08:53:08.313403993Z",
  "refresh_token": "DslNCdwxcbX31itlnfhxWvZd6YCeHM7FnYpoNDLwRJY",
  "refresh_expires_at": "2026-10-30T20:38:08.312742345Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.316113274",
    "linkedid": "1730052700.316113274",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675233167"
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
    "id": "1730052700.316113274",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "26404b2b-4489-433c-8cf4-c50a9e24399a",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675233167",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:38:08.609378Z",
      "answered_at": null,
      "ended_at": "2026-10-30T08:38:08.634463Z",
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
    "id": "1730052600.3100413392",
    "linkedid": "1730052600.3100413392",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675233167"
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
      "id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675233167",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:38:08.981064Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/e64fd3e2-884c-4896-b0b1-6981cedf7686/answer` → **200**

```json
{
  "command_id": "ce8b8351-5f56-48f2-a697-8a7cba7054ad"
}
```

```json
{
  "id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675233167",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "order_ids": [],
  "started_at": "2026-10-30T08:38:08.981064Z",
  "answered_at": "2026-10-30T08:38:09.307544Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.3100413392",
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
    "id": "1730052600.3100413392",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675233167",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [],
      "started_at": "2026-10-30T08:38:08.981064Z",
      "answered_at": "2026-10-30T08:38:09.307544Z",
      "ended_at": "2026-10-30T08:38:09.623393Z",
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
      "id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675233167",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [],
      "started_at": "2026-10-30T08:38:08.981064Z",
      "answered_at": "2026-10-30T08:38:09.307544Z",
      "ended_at": "2026-10-30T08:38:09.623393Z",
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
      "id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675233167",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [],
      "started_at": "2026-10-30T08:38:08.981064Z",
      "answered_at": "2026-10-30T08:38:09.307544Z",
      "ended_at": "2026-10-30T08:38:09.623393Z",
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
      "id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675233167",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [],
      "started_at": "2026-10-30T08:38:08.981064Z",
      "answered_at": "2026-10-30T08:38:09.307544Z",
      "ended_at": "2026-10-30T08:38:09.623393Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:38:16.155893Z"
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
      "id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675233167",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [],
      "started_at": "2026-10-30T08:38:08.981064Z",
      "answered_at": "2026-10-30T08:38:09.307544Z",
      "ended_at": "2026-10-30T08:38:09.623393Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:38:16.155893Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/e64fd3e2-884c-4896-b0b1-6981cedf7686/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/e64fd3e2-884c-4896-b0b1-6981cedf7686/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=e64fd3e2-884c-4896-b0b1-6981cedf7686` → **200**

```json
{
  "changes": [
    {
      "id": "e8a4b5fb-69d1-4896-9296-7ab8d661a3c5",
      "occurred_at": "2026-10-30T08:38:17.159269Z",
      "actor_type": "STAFF",
      "actor_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"27565e47-22e1-43e5-a7da-2d3cdb825e8c\", \"order_ids\": []}",
      "correlation_id": "f747f1bd-5268-4618-8c03-65ad90db47e3"
    },
    {
      "id": "9a557902-cb84-4d65-8c9b-0d288dd5e4e4",
      "occurred_at": "2026-10-30T08:38:17.125154Z",
      "actor_type": "STAFF",
      "actor_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"27565e47-22e1-43e5-a7da-2d3cdb825e8c\", \"order_ids\": []}",
      "correlation_id": "a5ec3fa6-1c6a-463f-a893-95e45a0bf6b1"
    }
  ]
}
```

Done: call e64fd3e2-884c-4896-b0b1-6981cedf7686 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6292"
}
```

```json
{
  "challenge_id": "76105e8a-0a8c-4fae-830c-b8abefc9851c",
  "expires_at": "2026-10-30T08:43:17.489726608Z",
  "resend_available_at": "2026-10-30T08:38:18.489726608Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "460535",
  "sent_at": "2026-10-30T08:38:17.493693811Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76105e8a-0a8c-4fae-830c-b8abefc9851c",
  "code": "460535",
  "device_ref": "sandbox-6292"
}
```

```json
{
  "session_id": "1f9ff8dc-2180-4e95-951c-e33a320d0525",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDM5NywiaWF0IjoxNzkzMzQ5NDk3LCJqdGkiOiI1NGVmOGU0OS1iNWQ5LTQ0MjQtOWQxMy04MGVlZDIxNTc3NDEiLCJzaWQiOiIxZjlmZjhkYy0yMTgwLTRlOTUtOTUxYy1lMzNhMzIwZDA1MjUifQ.94uSelsp6eYrDxshkSbIMfspKbVP_XhOOeHQulXqVp0",
  "access_expires_at": "2026-10-30T08:53:17.798510543Z",
  "refresh_token": "R8Fhyb6ZxDn7juCs9CTCX7frKYRS-Go2490EBXGxhWA",
  "refresh_expires_at": "2026-11-29T08:38:17.79790794Z",
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
  "command_id": "9ef4832d-d0bc-4684-b017-f4b0a6f4bf19",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:38:18Z",
    "sequence": 1793349498386
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa70e741-ec7f-4574-8fc0-99c8cddd9c41",
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
  "last_heartbeat_at": "2026-10-30T08:38:18.408061Z",
  "last_location_at": "2026-10-30T08:38:18.408061Z",
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
  "session_id": "13f11b4e-2936-4184-bdfc-757c886e6eca",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTAzOTgsImlhdCI6MTc5MzM0OTQ5OCwianRpIjoiNTk4NTgzOWItNDc4NS00N2YwLWI0YzQtNjIyMzRlN2M0OGVkIiwic2lkIjoiMTNmMTFiNGUtMjkzNi00MTg0LWJkZmMtNzU3Yzg4NmU2ZWNhIn0.XiahARpnJ8QipcZSDY8TZMxt-N-7Em-BuBXwen1RWk8",
  "access_expires_at": "2026-10-30T08:53:18.993062317Z",
  "refresh_token": "no-dTxAz1YKtKGOl4CW5SpHdZ-bBIvi22xvfXZRE4RE",
  "refresh_expires_at": "2026-10-30T20:38:18.992421904Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c06640b1-5d50-47d8-9129-2a413cb747ed",
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
  "id": "acba7015-02ea-4e81-8774-79f00e5d6b98",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:43:19.290834Z",
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
  "command_id": "b18db8a1-ac15-406b-8157-a340d12b44cb",
  "quote_id": "acba7015-02ea-4e81-8774-79f00e5d6b98",
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
    "phone": "+380678354257"
  }
}
```

```json
{
  "id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
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
  "created_at": "2026-10-30T08:38:19.614062Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678354257"
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
    "id": "9aa515a1-a8a1-47a9-8b37-219e65ee7ffe",
    "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
    "expires_at": "2026-10-30T08:38:34.619466Z",
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

`POST /api/driver/v1/offers/9aa515a1-a8a1-47a9-8b37-219e65ee7ffe/accept` → **200**

```json
{
  "command_id": "e4f01f87-3cdf-44a9-9cc1-428d494ab3a5"
}
```

```json
{
  "id": "533f4207-ed2b-42da-8edb-97d49593449a",
  "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678354257` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678354257` → **200**

```json
[
  {
    "phone": "+380678354257",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:21.421645233Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678354257` → **200**

```json
[
  {
    "phone": "+380678354257",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:21.421645233Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678354257` → **200**

```json
[
  {
    "phone": "+380678354257",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:21.421645233Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa",
  "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
  "assignment_id": "533f4207-ed2b-42da-8edb-97d49593449a",
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
    "phone": "+380678354257"
  }
}
```

`POST /api/driver/v1/work-sessions/aa70e741-ec7f-4574-8fc0-99c8cddd9c41/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:38:21Z",
    "sequence": 1793349501911
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aa70e741-ec7f-4574-8fc0-99c8cddd9c41",
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
  "last_heartbeat_at": "2026-10-30T08:38:21.931619Z",
  "last_location_at": "2026-10-30T08:38:21.931619Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa/arrive` → **200**

```json
{
  "command_id": "ed579b6b-7f7b-4544-b959-0f0c4c1aea73",
  "expected_version": 0
}
```

```json
{
  "id": "8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa",
  "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
  "assignment_id": "533f4207-ed2b-42da-8edb-97d49593449a",
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
  "arrived_at": "2026-10-30T08:38:22.224823Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678354257"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678354257` → **200**

```json
[
  {
    "phone": "+380678354257",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:21.421645233Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678354257` → **200**

```json
[
  {
    "phone": "+380678354257",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:21.421645233Z"
  },
  {
    "phone": "+380678354257",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:23.434087999Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678354257` → **200**

```json
[
  {
    "phone": "+380678354257",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:21.421645233Z"
  },
  {
    "phone": "+380678354257",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:23.434087999Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678354257` → **200**

```json
[
  {
    "phone": "+380678354257",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:21.421645233Z"
  },
  {
    "phone": "+380678354257",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:38:23.434087999Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa/start` → **200**

```json
{
  "command_id": "5a4c0905-e3b2-41c4-ba79-d650e3610f2b",
  "expected_version": 1
}
```

```json
{
  "id": "8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa",
  "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
  "assignment_id": "533f4207-ed2b-42da-8edb-97d49593449a",
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
  "arrived_at": "2026-10-30T08:38:22.224823Z",
  "started_at": "2026-10-30T08:38:23.632229Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678354257"
  }
}
```

`POST /api/driver/v1/trips/8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa/complete` → **200**

```json
{
  "command_id": "d9bc4cbf-ca8b-4695-8058-b89a7fc1499b",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:38:23Z",
  "cash_received": true
}
```

```json
{
  "id": "8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa",
  "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
  "assignment_id": "533f4207-ed2b-42da-8edb-97d49593449a",
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
  "arrived_at": "2026-10-30T08:38:22.224823Z",
  "started_at": "2026-10-30T08:38:23.632229Z",
  "completed_at": "2026-10-30T08:38:23.929808Z",
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
  "session_id": "aa70e741-ec7f-4574-8fc0-99c8cddd9c41",
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
  "last_heartbeat_at": "2026-10-30T08:38:21.931619Z",
  "last_location_at": "2026-10-30T08:38:21.931619Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa70e741-ec7f-4574-8fc0-99c8cddd9c41/close` → **200**

```json
{
  "command_id": "c2ee6598-5b4a-45cb-806b-3f301a77843e",
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
  "phone": "+380635275263",
  "device_ref": "sandbox-2680"
}
```

```json
{
  "challenge_id": "b4741f40-4740-4098-bdb8-adb8ae2348aa",
  "expires_at": "2026-10-30T08:43:24.86743841Z",
  "resend_available_at": "2026-10-30T08:38:25.86743841Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635275263` → **200**

```json
{
  "phone": "+380635275263",
  "audience": "CLIENT",
  "code": "926356",
  "sent_at": "2026-10-30T08:38:24.871238381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4741f40-4740-4098-bdb8-adb8ae2348aa",
  "code": "926356",
  "device_ref": "sandbox-2680"
}
```

```json
{
  "session_id": "2fbe5673-87e5-457e-8a59-ecac008631b0",
  "subject": {
    "type": "CLIENT",
    "id": "030444b8-6040-4f56-adad-65fac0e11391"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzA0NDRiOC02MDQwLTRmNTYtYWRhZC02NWZhYzBlMTEzOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNDA1LCJpYXQiOjE3OTMzNDk1MDUsImp0aSI6IjYzMjFiYjAyLTNlNzAtNDQ0Zi05ZTcxLTgyNmIzZjZiYTE2MyIsInNpZCI6IjJmYmU1NjczLTg3ZTUtNDU3ZS04YTU5LWVjYWMwMDg2MzFiMCJ9.9lSRnOnGoCoYHhYFF-6J3kk3eVNmDGEtAWlhS5wDZFA",
  "access_expires_at": "2026-10-30T08:53:25.19165009Z",
  "refresh_token": "yBaxQ4k5UU1Xs2mSFg328M3tYk6L8Dhm8BabU03pFD0",
  "refresh_expires_at": "2026-11-29T08:38:25.191064078Z",
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
  "device_ref": "sandbox-31353"
}
```

```json
{
  "challenge_id": "47f4d87c-0dc5-4e71-ad28-d55635cf4b3e",
  "expires_at": "2026-10-30T08:43:25.756675569Z",
  "resend_available_at": "2026-10-30T08:38:26.756675569Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "558989",
  "sent_at": "2026-10-30T08:38:25.760110984Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47f4d87c-0dc5-4e71-ad28-d55635cf4b3e",
  "code": "558989",
  "device_ref": "sandbox-31353"
}
```

```json
{
  "session_id": "8deb85c5-64d4-49ed-a745-cd12c7bfff89",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDQwNiwiaWF0IjoxNzkzMzQ5NTA2LCJqdGkiOiJhNGU5YWIxMC0zYTVhLTQwZTktODc5OS0xNTgzMjEyZjU2M2QiLCJzaWQiOiI4ZGViODVjNS02NGQ0LTQ5ZWQtYTc0NS1jZDEyYzdiZmZmODkifQ.7oDzPVWPT0_zqNAd4U9pC3yFPXAA1zOxgR0nPPZf4dk",
  "access_expires_at": "2026-10-30T08:53:26.064044831Z",
  "refresh_token": "jL_a1QUunUcsBV437n3fIFnTl2-ipSd3xSVEMBvQw1g",
  "refresh_expires_at": "2026-11-29T08:38:26.063437499Z",
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
  "session_id": "99f3275d-39e3-475a-9226-baf22eb03616",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA0MDYsImlhdCI6MTc5MzM0OTUwNiwianRpIjoiN2U4MDQxMWQtODVkNS00NDI2LWFiZGMtZjg1ODRjMmEyMWY0Iiwic2lkIjoiOTlmMzI3NWQtMzllMy00NzVhLTkyMjYtYmFmMjJlYjAzNjE2In0.TgLSPgWO_oA6fJZJDnqb5QetkvjU4IaCtkBjiAqNbTY",
  "access_expires_at": "2026-10-30T08:53:26.921938093Z",
  "refresh_token": "VymUqvcyhTZM-AaXt7Hd7-nPtJNR4m03F16niAJ5_SA",
  "refresh_expires_at": "2026-10-30T20:38:26.921184117Z",
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
  "session_id": "e3d94569-9bff-4a98-b8d4-b86e32793eb2",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA0MDcsImlhdCI6MTc5MzM0OTUwNywianRpIjoiMTc5OTg3OWYtMWIyZi00YWMxLTkyNWQtYmQ2YzA2NDUzMmNlIiwic2lkIjoiZTNkOTQ1NjktOWJmZi00YTk4LWI4ZDQtYjg2ZTMyNzkzZWIyIn0.c0QxKvSK1i0_9AERnbVLnNqhx6IOJTkIdeYG8Hfypss",
  "access_expires_at": "2026-10-30T08:53:27.493038019Z",
  "refresh_token": "GhlwMG4dVNcr64j_RZ43aeOgZLQFdJqDWWya2YNXjgs",
  "refresh_expires_at": "2026-10-30T20:38:27.492444603Z",
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
  "command_id": "bc7ec7fa-24d9-4c7e-a657-111a52165133",
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
  "id": "a349fc16-ed6d-42d4-a88d-7394ff7ea043",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:43:28.049085Z",
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
  "command_id": "5ceb9668-1967-4ea6-9a4b-5051467f0a2a",
  "quote_id": "a349fc16-ed6d-42d4-a88d-7394ff7ea043",
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
  "id": "c805a472-de2b-4632-a573-539bd87b2bc0",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "030444b8-6040-4f56-adad-65fac0e11391",
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
  "created_at": "2026-10-30T08:38:28.3406Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c805a472-de2b-4632-a573-539bd87b2bc0` → **200**

```json
{
  "id": "c805a472-de2b-4632-a573-539bd87b2bc0",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "030444b8-6040-4f56-adad-65fac0e11391",
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
  "created_at": "2026-10-30T08:38:28.3406Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c805a472-de2b-4632-a573-539bd87b2bc0/cancel` → **200**

```json
{
  "command_id": "83dfc2ee-cbcd-44a5-8187-c8562dfe046b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "c805a472-de2b-4632-a573-539bd87b2bc0",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "030444b8-6040-4f56-adad-65fac0e11391",
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
  "created_at": "2026-10-30T08:38:28.3406Z",
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
  "command_id": "e4f9b81b-9db3-4a0e-93a3-930665fd2e09",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:38:29Z",
    "sequence": 1793349509566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fb8c4d5d-4cbb-4de4-89c6-2d97ec75c1f4",
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
  "last_heartbeat_at": "2026-10-30T08:38:29.587942Z",
  "last_location_at": "2026-10-30T08:38:29.587942Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15535"
}
```

```json
{
  "challenge_id": "78cf7dae-e4d8-4f7b-8227-2223dfd9b30c",
  "expires_at": "2026-10-30T08:43:29.873860596Z",
  "resend_available_at": "2026-10-30T08:38:30.873860596Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "439011",
  "sent_at": "2026-10-30T08:38:29.877510562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78cf7dae-e4d8-4f7b-8227-2223dfd9b30c",
  "code": "439011",
  "device_ref": "sandbox-15535"
}
```

```json
{
  "session_id": "edffd72e-83ec-4bde-a74f-5cb834ee2003",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDQxMCwiaWF0IjoxNzkzMzQ5NTEwLCJqdGkiOiIxNDU0MmFmNy1hNDUyLTQyMTItYWE0MS02NjBkMmNkZDkzMjYiLCJzaWQiOiJlZGZmZDcyZS04M2VjLTRiZGUtYTc0Zi01Y2I4MzRlZTIwMDMifQ.JIE1FKxO25eljEqHqnlS9I-vB-ipIwP29mpGKzdPEUI",
  "access_expires_at": "2026-10-30T08:53:30.186207246Z",
  "refresh_token": "04tuVzRQxh6QScJTicv_v5SF0AAhlc8O1kwExU2F2Ig",
  "refresh_expires_at": "2026-11-29T08:38:30.185660246Z",
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
  "command_id": "7d830f4f-3d2b-441b-bfcc-9fe45349fccb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:38:30Z",
    "sequence": 1793349510780
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f44d24a-359f-42dd-89e3-17443ae65cc6",
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
  "last_heartbeat_at": "2026-10-30T08:38:30.801043Z",
  "last_location_at": "2026-10-30T08:38:30.801043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e7f6f281-00a0-4a9a-824a-01ac36766b1b",
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
  "id": "41ef9a8a-fbc6-468d-ae44-584494abbfe8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:43:31.092904Z",
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
  "command_id": "3f13dc4c-01ff-46f7-a29b-e678335eb8ed",
  "quote_id": "41ef9a8a-fbc6-468d-ae44-584494abbfe8",
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
  "id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "030444b8-6040-4f56-adad-65fac0e11391",
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
  "created_at": "2026-10-30T08:38:31.405177Z",
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
    "id": "6654c9c4-4ff9-417f-9391-4768e7e8a744",
    "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
    "expires_at": "2026-10-30T08:38:46.409354Z",
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

`POST /api/driver/v1/offers/6654c9c4-4ff9-417f-9391-4768e7e8a744/accept` → **200**

```json
{
  "command_id": "3dc02695-c565-44c2-9b29-3789657a76d1"
}
```

```json
{
  "id": "0904fedc-c918-4b29-96ec-76730a962843",
  "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "37f87239-74cd-46c2-b3be-5b898f126315",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37f87239-74cd-46c2-b3be-5b898f126315",
  "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
  "assignment_id": "0904fedc-c918-4b29-96ec-76730a962843",
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

`POST /api/driver/v1/trips/37f87239-74cd-46c2-b3be-5b898f126315/cancel` → **200**

```json
{
  "command_id": "4ffc4ffd-4760-4e67-afd3-7c5a60a1513e",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "37f87239-74cd-46c2-b3be-5b898f126315",
  "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
  "assignment_id": "0904fedc-c918-4b29-96ec-76730a962843",
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

`GET /api/rider/v1/orders/9e8ca48b-cc74-44b8-b2ce-b9d0782fa190` → **200**

```json
{
  "id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "030444b8-6040-4f56-adad-65fac0e11391",
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
    "id": "0904fedc-c918-4b29-96ec-76730a962843",
    "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "37f87239-74cd-46c2-b3be-5b898f126315",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:38:31.405177Z",
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
    "id": "80601f60-0d87-474b-b98e-66c28ead1252",
    "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
    "expires_at": "2026-10-30T08:38:47.586012Z",
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

`POST /api/driver/v1/offers/80601f60-0d87-474b-b98e-66c28ead1252/accept` → **200**

```json
{
  "command_id": "69932598-f27d-4284-bee8-d671e79cf1be"
}
```

```json
{
  "id": "8d055684-9d6a-4937-9283-380c30570c07",
  "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ef4f4aa7-ab19-4aab-b1e1-3d03b233d1a2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ef4f4aa7-ab19-4aab-b1e1-3d03b233d1a2",
  "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
  "assignment_id": "8d055684-9d6a-4937-9283-380c30570c07",
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

`POST /api/driver/v1/trips/ef4f4aa7-ab19-4aab-b1e1-3d03b233d1a2/cancel` → **200**

```json
{
  "command_id": "a29bbf2b-db78-4e4c-91f2-f5cb741bf0db",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "ef4f4aa7-ab19-4aab-b1e1-3d03b233d1a2",
  "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
  "assignment_id": "8d055684-9d6a-4937-9283-380c30570c07",
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
    "id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:38:31.405177Z",
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
    "id": "c805a472-de2b-4632-a573-539bd87b2bc0",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:38:28.3406Z",
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

`GET /api/operator/v1/orders/9e8ca48b-cc74-44b8-b2ce-b9d0782fa190/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:38:31.405887Z",
      "actor": {
        "type": "CLIENT",
        "id": "030444b8-6040-4f56-adad-65fac0e11391",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
        "quote_id": "41ef9a8a-fbc6-468d-ae44-584494abbfe8",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "525972cb-b1bd-4fdf-9089-0a8ec611a8d4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:38:31.408288Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
        "attempt_id": "4277f470-a759-4675-a889-2f781532b492",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "525972cb-b1bd-4fdf-9089-0a8ec611a8d4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:38:31.416264Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6654c9c4-4ff9-417f-9391-4768e7e8a744",
        "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "525972cb-b1bd-4fdf-9089-0a8ec611a8d4"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:38:32.002041Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6654c9c4-4ff9-417f-9391-4768e7e8a744",
        "order_id": "9e8ca48b-cc74-44b8-b2ce-b9d0782fa190",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "0904fedc-c918-4b29-96ec-76730a962843"
      },
      "correlation_id": "058136de-2135-427f-a65b-f51d8e921914"
```

Done: orders c805a472-de2b-4632-a573-539bd87b2bc0, 9e8ca48b-cc74-44b8-b2ce-b9d0782fa190.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739966702",
  "device_ref": "sandbox-15736"
}
```

```json
{
  "challenge_id": "31e880ab-f1b1-4e4a-b4f8-cef305aad61c",
  "expires_at": "2026-10-30T08:43:35.008616328Z",
  "resend_available_at": "2026-10-30T08:38:36.008616328Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739966702` → **200**

```json
{
  "phone": "+380739966702",
  "audience": "CLIENT",
  "code": "600135",
  "sent_at": "2026-10-30T08:38:35.012275375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31e880ab-f1b1-4e4a-b4f8-cef305aad61c",
  "code": "600135",
  "device_ref": "sandbox-15736"
}
```

```json
{
  "session_id": "77b35790-729a-42ab-a437-3f1241c14824",
  "subject": {
    "type": "CLIENT",
    "id": "99f78418-15d1-4495-b482-2efb97887cf1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OWY3ODQxOC0xNWQxLTQ0OTUtYjQ4Mi0yZWZiOTc4ODdjZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNDE1LCJpYXQiOjE3OTMzNDk1MTUsImp0aSI6ImFhMjNlYTM3LWRkNzMtNGNiMy04OWE2LTY2YzU4MWI0Y2E2MSIsInNpZCI6Ijc3YjM1NzkwLTcyOWEtNDJhYi1hNDM3LTNmMTI0MWMxNDgyNCJ9.bodS-p0UOk9vZpi9OLSOlzkAqKj6eeT3PMpeJ9nX_I0",
  "access_expires_at": "2026-10-30T08:53:35.334114681Z",
  "refresh_token": "ul5oN88uGvMHeCbbCU6ZI-rHnZRFgObS3ZTivySU0BQ",
  "refresh_expires_at": "2026-11-29T08:38:35.333573312Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "eb898812-5123-4fa8-b6d7-8f7c62357cf0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ecaa71f4-6c0f-43cf-b849-e31bd13491f3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ecaa71f4-6c0f-43cf-b849-e31bd13491f3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "04a650c6203ca4f730b2babf5718fc66",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ecaa71f4-6c0f-43cf-b849-e31bd13491f3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739966702"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ecaa71f4-6c0f-43cf-b849-e31bd13491f3",
  "expires_at": "2026-10-30T09:08:35.648585Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ecaa71f4-6c0f-43cf-b849-e31bd13491f3` → **200**

```json
{
  "id": "ecaa71f4-6c0f-43cf-b849-e31bd13491f3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:08:35.648585Z",
  "card": {
    "id": "6b0f46fc-046f-4a20-95a7-f22f442f2ae7",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8569",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:38:35.950417Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6b0f46fc-046f-4a20-95a7-f22f442f2ae7",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8569",
      "card_type": "Visa",
      "created_at": "2026-10-30T08:38:35.950417Z"
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
  "device_ref": "sandbox-30897"
}
```

```json
{
  "challenge_id": "d31fc89b-134f-4b59-bfa7-1851ec2ce356",
  "expires_at": "2026-10-30T08:43:36.545009981Z",
  "resend_available_at": "2026-10-30T08:38:37.545009981Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "817451",
  "sent_at": "2026-10-30T08:38:36.547985068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d31fc89b-134f-4b59-bfa7-1851ec2ce356",
  "code": "817451",
  "device_ref": "sandbox-30897"
}
```

```json
{
  "session_id": "54c5fd89-0a39-403c-86ac-ce67e85bafd3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDQxNiwiaWF0IjoxNzkzMzQ5NTE2LCJqdGkiOiI4MTNkMmIxMy1kNGIxLTQ4ZDEtOWFmNi0wZjBlODM2ZWFjYjEiLCJzaWQiOiI1NGM1ZmQ4OS0wYTM5LTQwM2MtODZhYy1jZTY3ZTg1YmFmZDMifQ.g9Ux53Hmyq6F2OKL3RhOQOVhyO8qRAuMTiRDr1aRjqY",
  "access_expires_at": "2026-10-30T08:53:36.854704003Z",
  "refresh_token": "5hJ9Ekcv7HIqHQbrJCe6fMNKv5ALf4vNkVbrjUXl9Ho",
  "refresh_expires_at": "2026-11-29T08:38:36.85409191Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f44d24a-359f-42dd-89e3-17443ae65cc6",
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
  "last_heartbeat_at": "2026-10-30T08:38:30.801043Z",
  "last_location_at": "2026-10-30T08:38:30.801043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f44d24a-359f-42dd-89e3-17443ae65cc6/handover` → **200**

```json
{
  "command_id": "e82aa0ef-1609-4a74-8a03-ec4700eb33d0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f44d24a-359f-42dd-89e3-17443ae65cc6",
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
  "last_heartbeat_at": "2026-10-30T08:38:30.801043Z",
  "last_location_at": "2026-10-30T08:38:30.801043Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/1f44d24a-359f-42dd-89e3-17443ae65cc6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:39:19Z",
    "sequence": 1793349559729
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f44d24a-359f-42dd-89e3-17443ae65cc6",
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
  "last_heartbeat_at": "2026-10-30T08:39:19.748977Z",
  "last_location_at": "2026-10-30T08:39:19.748977Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f8c50f68-1aac-45ea-b7cb-77cfc37fa980",
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
  "id": "29723659-1ed1-4875-84ea-049f24c6699d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:44:20.066374Z",
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
  "command_id": "52e93d18-9738-4eb9-9269-b293c0122c95",
  "quote_id": "29723659-1ed1-4875-84ea-049f24c6699d",
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
  "id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
  "created_at": "2026-10-30T08:39:20.377092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71246f9d-3a21-44ab-a0a4-c8be8e0deb4f` → **200**

```json
{
  "id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
  "created_at": "2026-10-30T08:39:20.377092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71246f9d-3a21-44ab-a0a4-c8be8e0deb4f` → **200**

```json
{
  "id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
  "created_at": "2026-10-30T08:39:20.377092Z",
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
    "id": "69cff8c0-b2fc-473d-a313-b2f34ab19ed2",
    "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
    "expires_at": "2026-10-30T08:39:35.867463Z",
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

`POST /api/driver/v1/offers/69cff8c0-b2fc-473d-a313-b2f34ab19ed2/accept` → **200**

```json
{
  "command_id": "8b94b033-8981-4a42-a260-5c50fbfa7d04"
}
```

```json
{
  "id": "503519e1-bc02-4dc0-82e2-d0631de76ae5",
  "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0dfcccf6-3e50-4009-b147-9686098ea58b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0dfcccf6-3e50-4009-b147-9686098ea58b",
  "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "assignment_id": "503519e1-bc02-4dc0-82e2-d0631de76ae5",
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

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/1f44d24a-359f-42dd-89e3-17443ae65cc6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:39:28Z",
    "sequence": 1793349568178
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f44d24a-359f-42dd-89e3-17443ae65cc6",
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
  "last_heartbeat_at": "2026-10-30T08:39:28.197799Z",
  "last_location_at": "2026-10-30T08:39:28.197799Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0dfcccf6-3e50-4009-b147-9686098ea58b/arrive` → **200**

```json
{
  "command_id": "be2c6d43-7bd6-4fbe-8775-71c97e1c38fb",
  "expected_version": 0
}
```

```json
{
  "id": "0dfcccf6-3e50-4009-b147-9686098ea58b",
  "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "assignment_id": "503519e1-bc02-4dc0-82e2-d0631de76ae5",
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
  "arrived_at": "2026-10-30T08:39:28.479801Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0dfcccf6-3e50-4009-b147-9686098ea58b/start` → **200**

```json
{
  "command_id": "f037ea8b-988b-4108-9563-a2a15dc7690c",
  "expected_version": 1
}
```

```json
{
  "id": "0dfcccf6-3e50-4009-b147-9686098ea58b",
  "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "assignment_id": "503519e1-bc02-4dc0-82e2-d0631de76ae5",
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
  "arrived_at": "2026-10-30T08:39:28.479801Z",
  "started_at": "2026-10-30T08:39:28.786915Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0dfcccf6-3e50-4009-b147-9686098ea58b/complete` → **200**

```json
{
  "command_id": "176c9ff9-1fcb-4040-9828-fd1d556b166e",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:39:29Z",
  "cash_received": true
}
```

```json
{
  "id": "0dfcccf6-3e50-4009-b147-9686098ea58b",
  "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "assignment_id": "503519e1-bc02-4dc0-82e2-d0631de76ae5",
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
  "arrived_at": "2026-10-30T08:39:28.479801Z",
  "started_at": "2026-10-30T08:39:28.786915Z",
  "completed_at": "2026-10-30T08:39:29.094555Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/71246f9d-3a21-44ab-a0a4-c8be8e0deb4f` → **200**

```json
{
  "id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
    "id": "503519e1-bc02-4dc0-82e2-d0631de76ae5",
    "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0dfcccf6-3e50-4009-b147-9686098ea58b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:39:20.377092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71246f9d-3a21-44ab-a0a4-c8be8e0deb4f` → **200**

```json
{
  "id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
    "id": "503519e1-bc02-4dc0-82e2-d0631de76ae5",
    "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0dfcccf6-3e50-4009-b147-9686098ea58b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:39:20.377092Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/71246f9d-3a21-44ab-a0a4-c8be8e0deb4f` → **200**

```json
{
  "id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
    "id": "503519e1-bc02-4dc0-82e2-d0631de76ae5",
    "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0dfcccf6-3e50-4009-b147-9686098ea58b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:39:20.377092Z",
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

`GET /api/rider/v1/orders/71246f9d-3a21-44ab-a0a4-c8be8e0deb4f/tip` → **200**

```json
{
  "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
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
  "available_until": "2026-10-31T08:39:29.094555Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/71246f9d-3a21-44ab-a0a4-c8be8e0deb4f/tip` → **201**

```json
{
  "command_id": "716cbe63-cb9d-4630-bf44-1d1b57506a0b",
  "amount_minor": 2500
}
```

```json
{
  "id": "33ef486c-9dd8-4537-8def-fc168e385993",
  "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:39:32.889003Z"
}
```

`GET /api/rider/v1/orders/71246f9d-3a21-44ab-a0a4-c8be8e0deb4f/tip` → **200**

```json
{
  "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
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
  "available_until": "2026-10-31T08:39:29.094555Z",
  "open": false,
  "tip": {
    "id": "33ef486c-9dd8-4537-8def-fc168e385993",
    "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:39:32.889003Z"
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
      "id": "54c867f1-43b1-46c9-ae7b-85b42f651865",
      "at": "2026-10-30T08:39:29.981013Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
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
      "id": "8a3d6449-df2e-4d92-b915-fdd4a00cd766",
      "at": "2026-10-30T08:39:34.043069Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
      "counterpart_id": null
    },
    {
      "id": "54c867f1-43b1-46c9-ae7b-85b42f651865",
      "at": "2026-10-30T08:39:29.981013Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ecf619d4-77b1-4207-8add-c6d178f9f0ba",
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
  "id": "ee8012c5-7055-45b0-8442-729d39c83b83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:44:35.052578Z",
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
  "session_id": "a8928840-651d-4de2-a9d8-bd60d8d1f2f9",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA0NzUsImlhdCI6MTc5MzM0OTU3NSwianRpIjoiZTY0ZjdlZTUtY2E3ZC00ODRmLWFiZWYtN2VkNzZmNjdkYWRjIiwic2lkIjoiYTg5Mjg4NDAtNjUxZC00ZGUyLWE5ZDgtYmQ2MGQ4ZDFmMmY5In0.2OgH4gJKEMqiewLPBja7xarRT0GdIAzdjp_Mv04cHZg",
  "access_expires_at": "2026-10-30T08:54:35.659139927Z",
  "refresh_token": "GI5xvazONI66ZViGhaWm-SiQ5F8kcFBsnHgtXTkZp5A",
  "refresh_expires_at": "2026-10-30T20:39:35.658493582Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739966702` → **200**

```json
{
  "client_id": "99f78418-15d1-4495-b482-2efb97887cf1"
}
```

`POST /api/admin/v1/rider-wallets/99f78418-15d1-4495-b482-2efb97887cf1/top-ups` → **201**

```json
{
  "command_id": "e29b3975-732f-486d-9e14-fa65bfbabe44",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
      "id": "9e3d2cbb-27c8-4efb-95da-08ddd9b0227f",
      "at": "2026-10-30T08:39:36.225118Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a22cab04-51d9-4393-b235-8c2969330cec",
  "quote_id": "ee8012c5-7055-45b0-8442-729d39c83b83",
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
  "id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
  "created_at": "2026-10-30T08:39:36.540771Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/80b3bb94-b145-4878-995f-7df54ad9f70f` → **200**

```json
{
  "id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
  "created_at": "2026-10-30T08:39:36.540771Z",
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
    "id": "e6b5163b-36b4-427d-8c0e-d7580e91f3f6",
    "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
    "expires_at": "2026-10-30T08:39:51.546408Z",
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

`POST /api/driver/v1/offers/e6b5163b-36b4-427d-8c0e-d7580e91f3f6/accept` → **200**

```json
{
  "command_id": "7c78cbca-7b94-495c-993c-aade09cb346f"
}
```

```json
{
  "id": "38cc14a2-56a7-47a9-bb31-b497f1d82112",
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f35d7729-86b3-45dc-8837-538e37b75a03",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f35d7729-86b3-45dc-8837-538e37b75a03",
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
  "assignment_id": "38cc14a2-56a7-47a9-bb31-b497f1d82112",
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

`POST /api/driver/v1/work-sessions/1f44d24a-359f-42dd-89e3-17443ae65cc6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:39:38Z",
    "sequence": 1793349578234
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f44d24a-359f-42dd-89e3-17443ae65cc6",
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
  "last_heartbeat_at": "2026-10-30T08:39:38.042699Z",
  "last_location_at": "2026-10-30T08:39:38.042699Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f35d7729-86b3-45dc-8837-538e37b75a03/arrive` → **200**

```json
{
  "command_id": "108dac66-ae67-4bcc-8580-5849a0ef9024",
  "expected_version": 0
}
```

```json
{
  "id": "f35d7729-86b3-45dc-8837-538e37b75a03",
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
  "assignment_id": "38cc14a2-56a7-47a9-bb31-b497f1d82112",
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
  "arrived_at": "2026-10-30T08:39:38.345504Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f35d7729-86b3-45dc-8837-538e37b75a03/start` → **200**

```json
{
  "command_id": "ed13cd8d-bd9d-4ae3-bf17-155c61e093b6",
  "expected_version": 1
}
```

```json
{
  "id": "f35d7729-86b3-45dc-8837-538e37b75a03",
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
  "assignment_id": "38cc14a2-56a7-47a9-bb31-b497f1d82112",
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
  "arrived_at": "2026-10-30T08:39:38.345504Z",
  "started_at": "2026-10-30T08:39:38.654948Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f35d7729-86b3-45dc-8837-538e37b75a03/complete` → **200**

```json
{
  "command_id": "38bcb10e-5f9d-4008-945b-f88a8b5865f5",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:39:38Z",
  "cash_received": true
}
```

```json
{
  "id": "f35d7729-86b3-45dc-8837-538e37b75a03",
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
  "assignment_id": "38cc14a2-56a7-47a9-bb31-b497f1d82112",
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
  "arrived_at": "2026-10-30T08:39:38.345504Z",
  "started_at": "2026-10-30T08:39:38.654948Z",
  "completed_at": "2026-10-30T08:39:38.965861Z",
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
  "client_id": "99f78418-15d1-4495-b482-2efb97887cf1",
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
      "id": "002e9255-e3a1-45ad-a847-e53106ffcf90",
      "at": "2026-10-30T08:39:39.113366Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f"
    },
    {
      "id": "9e3d2cbb-27c8-4efb-95da-08ddd9b0227f",
      "at": "2026-10-30T08:39:36.225118Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
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

`GET /api/rider/v1/orders/80b3bb94-b145-4878-995f-7df54ad9f70f/tip` → **200**

```json
{
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
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
  "available_until": "2026-10-31T08:39:38.965861Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/80b3bb94-b145-4878-995f-7df54ad9f70f/tip` → **201**

```json
{
  "command_id": "1051ce39-b90d-440c-8f4e-d76344064faf",
  "amount_minor": 2500
}
```

```json
{
  "id": "5a0d49bf-d59d-4be8-8f09-ab9d176f47fa",
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:39:40.13077Z"
}
```

`GET /api/rider/v1/orders/80b3bb94-b145-4878-995f-7df54ad9f70f/tip` → **200**

```json
{
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
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
  "available_until": "2026-10-31T08:39:38.965861Z",
  "open": false,
  "tip": {
    "id": "5a0d49bf-d59d-4be8-8f09-ab9d176f47fa",
    "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:39:40.13077Z"
  }
}
```

`GET /api/rider/v1/orders/80b3bb94-b145-4878-995f-7df54ad9f70f/tip` → **200**

```json
{
  "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
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
  "available_until": "2026-10-31T08:39:38.965861Z",
  "open": false,
  "tip": {
    "id": "5a0d49bf-d59d-4be8-8f09-ab9d176f47fa",
    "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:39:40.13077Z"
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
      "id": "a595d9a3-d5f7-4242-b179-5aff20de8416",
      "at": "2026-10-30T08:39:39.105301Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
      "counterpart_id": null
    },
    {
      "id": "8a3d6449-df2e-4d92-b915-fdd4a00cd766",
      "at": "2026-10-30T08:39:34.043069Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
      "counterpart_id": null
    },
    {
      "id": "54c867f1-43b1-46c9-ae7b-85b42f651865",
      "at": "2026-10-30T08:39:29.981013Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
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
      "id": "3db47b73-f38b-4871-8a18-e616734cadb8",
      "at": "2026-10-30T08:39:42.1457Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
      "counterpart_id": null
    },
    {
      "id": "a595d9a3-d5f7-4242-b179-5aff20de8416",
      "at": "2026-10-30T08:39:39.105301Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "80b3bb94-b145-4878-995f-7df54ad9f70f",
      "counterpart_id": null
    },
    {
      "id": "8a3d6449-df2e-4d92-b915-fdd4a00cd766",
      "at": "2026-10-30T08:39:34.043069Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
      "counterpart_id": null
    },
    {
      "id": "54c867f1-43b1-46c9-ae7b-85b42f651865",
      "at": "2026-10-30T08:39:29.981013Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "71246f9d-3a21-44ab-a0a4-c8be8e0deb4f",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1f44d24a-359f-42dd-89e3-17443ae65cc6",
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
  "last_heartbeat_at": "2026-10-30T08:39:38.042699Z",
  "last_location_at": "2026-10-30T08:39:38.042699Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1f44d24a-359f-42dd-89e3-17443ae65cc6/close` → **200**

```json
{
  "command_id": "5297813c-7c2b-44e8-9e5a-a09f6a8f2aa3",
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

Done: card order 80b3bb94-b145-4878-995f-7df54ad9f70f.

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
  "phone": "+380735169370",
  "device_ref": "sandbox-28084"
}
```

```json
{
  "challenge_id": "9c4c895d-88a0-446a-ac36-0125bb4ce583",
  "expires_at": "2026-10-30T08:44:44.455323469Z",
  "resend_available_at": "2026-10-30T08:39:45.455323469Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735169370` → **200**

```json
{
  "phone": "+380735169370",
  "audience": "CLIENT",
  "code": "060178",
  "sent_at": "2026-10-30T08:39:44.458168242Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c4c895d-88a0-446a-ac36-0125bb4ce583",
  "code": "060178",
  "device_ref": "sandbox-28084"
}
```

```json
{
  "session_id": "f530be84-8e14-4824-9524-4ecf9937bfb5",
  "subject": {
    "type": "CLIENT",
    "id": "42197134-514d-4864-aeee-5cfdbdcf82e8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MjE5NzEzNC01MTRkLTQ4NjQtYWVlZS01Y2ZkYmRjZjgyZTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNDg0LCJpYXQiOjE3OTMzNDk1ODQsImp0aSI6IjcxZWRiOWU4LTI0MGQtNDBjZi1iODMwLTQ1NGY1ZTFlMWE4MCIsInNpZCI6ImY1MzBiZTg0LThlMTQtNDgyNC05NTI0LTRlY2Y5OTM3YmZiNSJ9.ZUVyeX11KQ_RCMVdqUWjgXsJuQ0Uixlo-6EdmGEbZjk",
  "access_expires_at": "2026-10-30T08:54:44.77330837Z",
  "refresh_token": "OqPFlmxOfjXENNUJl95HOWBY9Na-iW4F_duzqmC3MUU",
  "refresh_expires_at": "2026-11-29T08:39:44.772641547Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "1dc57118-2561-4302-a46e-d6c56fe11dca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "448c4832-427d-4979-b9ee-2c9febbc7afc",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-448c4832-427d-4979-b9ee-2c9febbc7afc",
    "orderDate": "1793349585",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "ac90e6b1c07286db3e19bae29e84c1ab",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=448c4832-427d-4979-b9ee-2c9febbc7afc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735169370"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=448c4832-427d-4979-b9ee-2c9febbc7afc",
  "created_at": "2026-10-30T08:39:45.067298Z",
  "expires_at": "2026-10-30T09:09:45.067298Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/448c4832-427d-4979-b9ee-2c9febbc7afc` → **200**

```json
{
  "id": "448c4832-427d-4979-b9ee-2c9febbc7afc",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:39:45.067298Z",
  "expires_at": "2026-10-30T09:09:45.067298Z",
  "completed_at": "2026-10-30T08:39:45.375366Z",
  "masked_pan": "41****2259",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "42197134-514d-4864-aeee-5cfdbdcf82e8",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "42197134-514d-4864-aeee-5cfdbdcf82e8",
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
      "id": "46070e70-0cd6-4ba7-91c8-ac6ba85347c6",
      "at": "2026-10-30T08:39:46.163415Z",
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
  "client_id": "42197134-514d-4864-aeee-5cfdbdcf82e8",
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
      "id": "46070e70-0cd6-4ba7-91c8-ac6ba85347c6",
      "at": "2026-10-30T08:39:46.163415Z",
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
  "device_ref": "sandbox-3796"
}
```

```json
{
  "challenge_id": "95650ecf-2bd9-48a3-b32a-f75a2e5db9df",
  "expires_at": "2026-10-30T08:44:47.529446785Z",
  "resend_available_at": "2026-10-30T08:39:48.529446785Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "295475",
  "sent_at": "2026-10-30T08:39:47.532045006Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95650ecf-2bd9-48a3-b32a-f75a2e5db9df",
  "code": "295475",
  "device_ref": "sandbox-3796"
}
```

```json
{
  "session_id": "39641b28-3fc5-442f-a378-8d84731bd752",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDQ4NywiaWF0IjoxNzkzMzQ5NTg3LCJqdGkiOiI0N2ZmZDkxMC0wMmQ1LTQyNDAtODczOS00Nzk5NGI5ODdhNDYiLCJzaWQiOiIzOTY0MWIyOC0zZmM1LTQ0MmYtYTM3OC04ZDg0NzMxYmQ3NTIifQ.BqOZEHE3_gG8retxF1z4u1V-EJLb2urXkxAbumVN434",
  "access_expires_at": "2026-10-30T08:54:47.837322768Z",
  "refresh_token": "-RJhEeHPUCP4Exa16DZSofg5_uyQBp1vTydAN7h5A0E",
  "refresh_expires_at": "2026-11-29T08:39:47.836812286Z",
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
  "command_id": "51f762c7-c49a-4789-a5db-f466a61a171a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "0f424115-0d43-4898-ba3a-9f5dd31432db",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0f424115-0d43-4898-ba3a-9f5dd31432db",
    "orderDate": "1793349588",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "bf434c97da5657be224959f15056b67b",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0f424115-0d43-4898-ba3a-9f5dd31432db",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0f424115-0d43-4898-ba3a-9f5dd31432db",
  "created_at": "2026-10-30T08:39:48.391499Z",
  "expires_at": "2026-10-30T09:09:48.391499Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/0f424115-0d43-4898-ba3a-9f5dd31432db` → **200**

```json
{
  "id": "0f424115-0d43-4898-ba3a-9f5dd31432db",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:39:48.391499Z",
  "expires_at": "2026-10-30T09:09:48.391499Z",
  "completed_at": "2026-10-30T08:39:48.675535Z",
  "masked_pan": "41****9504",
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
      "id": "4f67c0e1-a74a-4619-bde1-ba3607cd35e8",
      "at": "2026-10-30T08:39:49.181513Z",
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
  "command_id": "b4e3feb0-961b-4c74-b845-0112b686bccc",
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
  "correlation_id": "b51a4ce7-5392-4492-ae0f-de037e43c872"
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
  "device_ref": "sandbox-18991"
}
```

```json
{
  "challenge_id": "7bc98efb-0478-4bac-b98e-f2a6624f485e",
  "expires_at": "2026-10-30T08:44:50.8686104Z",
  "resend_available_at": "2026-10-30T08:39:51.8686104Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "824875",
  "sent_at": "2026-10-30T08:39:50.871548518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bc98efb-0478-4bac-b98e-f2a6624f485e",
  "code": "824875",
  "device_ref": "sandbox-18991"
}
```

```json
{
  "session_id": "25c1a84d-4636-45ba-a226-8a78ca32f1e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDQ5MSwiaWF0IjoxNzkzMzQ5NTkxLCJqdGkiOiIyOGEyY2ZmOS0xMDcwLTQ5ZmYtOWFjOS1mNGI0YmViYmY3OTIiLCJzaWQiOiIyNWMxYTg0ZC00NjM2LTQ1YmEtYTIyNi04YTc4Y2EzMmYxZTEifQ.RYXwF8O8ntvWPhcZVHtB9wIiOjItxYRykiy-ijxtE50",
  "access_expires_at": "2026-10-30T08:54:51.175917657Z",
  "refresh_token": "JT_JkPwfcMeanM8aRZel0wF1bYAGPT3o3Lu95pF2JQo",
  "refresh_expires_at": "2026-11-29T08:39:51.175343179Z",
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
  "command_id": "10e3c93d-0ad2-4684-a54a-86b9471382e0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:39:51Z",
    "sequence": 1793349591754
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d10432ab-ee05-40f4-bd60-c52fe1ade979",
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
  "last_heartbeat_at": "2026-10-30T08:39:51.773783Z",
  "last_location_at": "2026-10-30T08:39:51.773783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637889331",
  "device_ref": "sandbox-15593"
}
```

```json
{
  "challenge_id": "d3d2c292-7a1b-4686-b52a-a92449f44430",
  "expires_at": "2026-10-30T08:44:52.057864768Z",
  "resend_available_at": "2026-10-30T08:39:53.057864768Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637889331` → **200**

```json
{
  "phone": "+380637889331",
  "audience": "CLIENT",
  "code": "671277",
  "sent_at": "2026-10-30T08:39:52.060594858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3d2c292-7a1b-4686-b52a-a92449f44430",
  "code": "671277",
  "device_ref": "sandbox-15593"
}
```

```json
{
  "session_id": "d0620955-0958-4431-b078-63d8237fcf78",
  "subject": {
    "type": "CLIENT",
    "id": "5719c4a7-3d50-4c37-81b6-7b614b37e0c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NzE5YzRhNy0zZDUwLTRjMzctODFiNi03YjYxNGIzN2UwYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNDkyLCJpYXQiOjE3OTMzNDk1OTIsImp0aSI6IjBmNzg0YWRkLTI0NjQtNDU0Ni05YjE1LTE1YTllYWIxMGM0YiIsInNpZCI6ImQwNjIwOTU1LTA5NTgtNDQzMS1iMDc4LTYzZDgyMzdmY2Y3OCJ9.2IG-WjbAylSjMOOmwrYIFkvJCI5J8wNdBo4exIqilOg",
  "access_expires_at": "2026-10-30T08:54:52.367023351Z",
  "refresh_token": "yg_SEk2SMUkyS5l3eWnveO8iXXbHJcBMEY7bRkBu9vU",
  "refresh_expires_at": "2026-11-29T08:39:52.366460161Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc2ef5b3-9121-4437-be53-f2174152a622",
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
  "id": "a309816f-6283-47d6-8fab-2bb5af3a0db1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:44:52.647721Z",
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
  "command_id": "c0e0ceca-9e70-4967-a618-d300b2045629",
  "quote_id": "a309816f-6283-47d6-8fab-2bb5af3a0db1",
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
  "id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5719c4a7-3d50-4c37-81b6-7b614b37e0c5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:39:52.943841Z",
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
    "id": "feb63836-eb87-489f-ba6e-b21cfe829ebe",
    "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
    "expires_at": "2026-10-30T08:40:07.94795Z",
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

`POST /api/driver/v1/offers/feb63836-eb87-489f-ba6e-b21cfe829ebe/accept` → **200**

```json
{
  "command_id": "74e04e32-47f0-4351-939d-52a5f4aceb43"
}
```

```json
{
  "id": "083de1f3-e48b-4229-884c-2bd8fa2478c8",
  "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "60bc37e0-4d8f-4083-b0da-f2eb92c85e13",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "60bc37e0-4d8f-4083-b0da-f2eb92c85e13",
  "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
  "assignment_id": "083de1f3-e48b-4229-884c-2bd8fa2478c8",
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

`POST /api/driver/v1/work-sessions/d10432ab-ee05-40f4-bd60-c52fe1ade979/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:39:54Z",
    "sequence": 1793349594126
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d10432ab-ee05-40f4-bd60-c52fe1ade979",
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
  "last_heartbeat_at": "2026-10-30T08:39:54.144501Z",
  "last_location_at": "2026-10-30T08:39:54.144501Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/60bc37e0-4d8f-4083-b0da-f2eb92c85e13/arrive` → **200**

```json
{
  "command_id": "a8fa4aee-b39e-4cb6-ba17-231bc1d5a499",
  "expected_version": 0
}
```

```json
{
  "id": "60bc37e0-4d8f-4083-b0da-f2eb92c85e13",
  "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
  "assignment_id": "083de1f3-e48b-4229-884c-2bd8fa2478c8",
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
  "arrived_at": "2026-10-30T08:39:54.434204Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/60bc37e0-4d8f-4083-b0da-f2eb92c85e13/start` → **200**

```json
{
  "command_id": "91630057-90d4-44ea-a143-76a7606caca1",
  "expected_version": 1
}
```

```json
{
  "id": "60bc37e0-4d8f-4083-b0da-f2eb92c85e13",
  "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
  "assignment_id": "083de1f3-e48b-4229-884c-2bd8fa2478c8",
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
  "arrived_at": "2026-10-30T08:39:54.434204Z",
  "started_at": "2026-10-30T08:39:54.73295Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/60bc37e0-4d8f-4083-b0da-f2eb92c85e13/complete` → **200**

```json
{
  "command_id": "e0f28c13-68a5-4558-b55c-06e144c87631",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:39:55Z",
  "cash_received": false
}
```

```json
{
  "id": "60bc37e0-4d8f-4083-b0da-f2eb92c85e13",
  "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
  "assignment_id": "083de1f3-e48b-4229-884c-2bd8fa2478c8",
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
  "arrived_at": "2026-10-30T08:39:54.434204Z",
  "started_at": "2026-10-30T08:39:54.73295Z",
  "completed_at": "2026-10-30T08:39:55.039301Z",
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
  "session_id": "5c0d9bc7-5844-4dee-91cf-399bab9f49bb",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA0OTUsImlhdCI6MTc5MzM0OTU5NSwianRpIjoiOTQ0MTY5MTQtNGQ0MC00NmYyLWE2MzYtN2M3OTVkM2UzZDIxIiwic2lkIjoiNWMwZDliYzctNTg0NC00ZGVlLTkxY2YtMzk5YmFiOWY0OWJiIn0.KPEtZ-Apb_OPMYRaaYWlF2MqhAZDJfjByY2uyXnUAPc",
  "access_expires_at": "2026-10-30T08:54:55.638930727Z",
  "refresh_token": "1T9X8yWnkdJEBkXDH7fSeTmC1xC-J-JyKjlegx8QUsQ",
  "refresh_expires_at": "2026-10-30T20:39:55.638314698Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/5b158242-8051-410f-b1b6-1a8b57ec4a2b/cash-dispute` → **200**

```json
{
  "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5719c4a7-3d50-4c37-81b6-7b614b37e0c5",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:39:55.253391Z",
  "decide_by": "2026-11-13T08:39:55.253391Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T08:39:55.253391Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "5719c4a7-3d50-4c37-81b6-7b614b37e0c5",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T08:39:55.253391Z",
      "decide_by": "2026-11-13T08:39:55.253391Z",
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

`POST /api/admin/v1/orders/5b158242-8051-410f-b1b6-1a8b57ec4a2b/cash-dispute/decide` → **400**

```json
{
  "command_id": "aaa5d336-8bdd-48fc-918a-f30cc17de9b9",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/5b158242-8051-410f-b1b6-1a8b57ec4a2b/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "10755f06-668e-4071-ae83-0cb353574191",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/5b158242-8051-410f-b1b6-1a8b57ec4a2b/cash-dispute/decide` → **200**

```json
{
  "command_id": "d18cb605-74f4-4672-88c9-1fdb8f5011bb",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5719c4a7-3d50-4c37-81b6-7b614b37e0c5",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:39:55.253391Z",
  "decide_by": "2026-11-13T08:39:55.253391Z",
  "decision": "PAY_DRIVER",
  "decided_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T08:39:56.92154Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/5b158242-8051-410f-b1b6-1a8b57ec4a2b/cash-dispute/decide` → **409**

```json
{
  "command_id": "252e1529-c197-4573-9744-d3460b700e6a",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/5b158242-8051-410f-b1b6-1a8b57ec4a2b/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2d7736ce-1af6-4239-8be8-480a2bb54a22"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d10432ab-ee05-40f4-bd60-c52fe1ade979",
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
  "last_heartbeat_at": "2026-10-30T08:39:54.144501Z",
  "last_location_at": "2026-10-30T08:39:54.144501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d10432ab-ee05-40f4-bd60-c52fe1ade979/close` → **200**

```json
{
  "command_id": "5d1abceb-a0ac-4928-83ae-7e03e6d9cb18",
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
  "phone": "+380739331193",
  "device_ref": "sandbox-6839"
}
```

```json
{
  "challenge_id": "e73fbc45-d523-42b9-b2e4-4303a0043b69",
  "expires_at": "2026-10-30T08:44:58.102446849Z",
  "resend_available_at": "2026-10-30T08:39:59.102446849Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739331193` → **200**

```json
{
  "phone": "+380739331193",
  "audience": "CLIENT",
  "code": "696752",
  "sent_at": "2026-10-30T08:39:58.105760838Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e73fbc45-d523-42b9-b2e4-4303a0043b69",
  "code": "696752",
  "device_ref": "sandbox-6839"
}
```

```json
{
  "session_id": "cc502e1d-0798-46fd-a89a-1d8ba1dc07f6",
  "subject": {
    "type": "CLIENT",
    "id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2Y2NhM2FhZS1kZjA1LTQ1ODQtYmM2NC0wZjViYTI4ZWE2NGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNDk4LCJpYXQiOjE3OTMzNDk1OTgsImp0aSI6IjA1NzY4ZDAzLWQwZTAtNDRjYi1iMTlmLTkyYmE2YmEyMTdiMSIsInNpZCI6ImNjNTAyZTFkLTA3OTgtNDZmZC1hODlhLTFkOGJhMWRjMDdmNiJ9.SPGtCfnFfHxqSTeXwqeUXWpr-ET4XP1PxFKlMH37qNM",
  "access_expires_at": "2026-10-30T08:54:58.423422994Z",
  "refresh_token": "PW4qPxanv_IIfOecH4vhIWXxCFIfanh_CXJS51okv-Y",
  "refresh_expires_at": "2026-11-29T08:39:58.422865312Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "80d379a9-ac70-431b-9b72-66006adfa0e3",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a2c2ad97-251e-4d1a-93ba-24904d9d91a1",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a2c2ad97-251e-4d1a-93ba-24904d9d91a1",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "906d35828f28eb1d0666fbf8159185b1",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a2c2ad97-251e-4d1a-93ba-24904d9d91a1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739331193"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a2c2ad97-251e-4d1a-93ba-24904d9d91a1",
  "expires_at": "2026-10-30T09:09:58.705978Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/a2c2ad97-251e-4d1a-93ba-24904d9d91a1` → **200**

```json
{
  "id": "a2c2ad97-251e-4d1a-93ba-24904d9d91a1",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:09:58.705978Z",
  "card": {
    "id": "9bf72954-bf50-416f-87e9-e8af7b58d25d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3690",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:39:58.998138Z"
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
  "device_ref": "sandbox-5717"
}
```

```json
{
  "challenge_id": "14105934-ecfb-4cb1-acb0-dd8208dd57f6",
  "expires_at": "2026-10-30T08:44:59.303280287Z",
  "resend_available_at": "2026-10-30T08:40:00.303280287Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "098272",
  "sent_at": "2026-10-30T08:39:59.305899413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14105934-ecfb-4cb1-acb0-dd8208dd57f6",
  "code": "098272",
  "device_ref": "sandbox-5717"
}
```

```json
{
  "session_id": "c76fa62a-7687-4f00-9136-bef7a5506bac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDQ5OSwiaWF0IjoxNzkzMzQ5NTk5LCJqdGkiOiI0M2Q4NGZkNC1jMzhiLTQ5ODAtODJlYy0zOGExMzViMDc4MTAiLCJzaWQiOiJjNzZmYTYyYS03Njg3LTRmMDAtOTEzNi1iZWY3YTU1MDZiYWMifQ.neJZHQrVc9tn2UPZkpFGs2lF_Ui3WsVL5P1i6-SL15A",
  "access_expires_at": "2026-10-30T08:54:59.607937974Z",
  "refresh_token": "cjXHSor0ATHA_CFsS2gK-50QbVIVPsVLDgn6vzw1aF0",
  "refresh_expires_at": "2026-11-29T08:39:59.60736674Z",
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
  "command_id": "ca56db82-cc6b-4528-a4b8-fb8bce3e5b8b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:00Z",
    "sequence": 1793349600186
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "90ff6504-e08f-424f-967a-0bde73d02b18",
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
  "last_heartbeat_at": "2026-10-30T08:40:00.205658Z",
  "last_location_at": "2026-10-30T08:40:00.205658Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e742825a-5ba1-49d0-a27d-e26353fde614",
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
  "id": "b154797d-73b8-472f-a30d-59f20b9ee388",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:45:00.524255Z",
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
  "command_id": "17f43675-4c8e-44e2-84de-9911c986437e",
  "quote_id": "b154797d-73b8-472f-a30d-59f20b9ee388",
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
  "id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c",
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
  "created_at": "2026-10-30T08:40:00.831233Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937` → **200**

```json
{
  "id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c",
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
  "created_at": "2026-10-30T08:40:00.831233Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937` → **200**

```json
{
  "id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c",
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
  "created_at": "2026-10-30T08:40:00.831233Z",
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
    "id": "198c6186-8e80-4d20-80ab-c5617d70ee5c",
    "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
    "expires_at": "2026-10-30T08:40:16.296525Z",
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

`POST /api/driver/v1/offers/198c6186-8e80-4d20-80ab-c5617d70ee5c/accept` → **200**

```json
{
  "command_id": "3bffdfbd-e9a7-484c-8c94-9db443f0d63a"
}
```

```json
{
  "id": "cf770198-4497-41c5-8584-3672e8681c21",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a7cdf987-4492-42ec-b5c7-79b3183c087b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a7cdf987-4492-42ec-b5c7-79b3183c087b",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "assignment_id": "cf770198-4497-41c5-8584-3672e8681c21",
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

`POST /api/rider/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/messages` → **201**

```json
{
  "command_id": "bf2b6cff-3dc9-4fc9-81de-e752882f9d6d",
  "body": "Я біля входу, мій номер +380739331193, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "7e18e704-5f01-4920-aa06-9c22a6159588",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380739331193, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T08:40:03.624453056Z"
}
```

`POST /api/driver/v1/trips/a7cdf987-4492-42ec-b5c7-79b3183c087b/messages` → **201**

```json
{
  "command_id": "48e9cb51-dd7a-476f-934c-96eab0b7a0a4",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "791e25df-4f2f-41f5-b81f-b6e9f6b8b9ef",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T08:40:03.911067614Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/90ff6504-e08f-424f-967a-0bde73d02b18/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:09Z",
    "sequence": 1793349609214
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "90ff6504-e08f-424f-967a-0bde73d02b18",
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
  "last_heartbeat_at": "2026-10-30T08:40:09.233617Z",
  "last_location_at": "2026-10-30T08:40:09.233617Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a7cdf987-4492-42ec-b5c7-79b3183c087b/arrive` → **200**

```json
{
  "command_id": "9db73a45-1d45-4a15-98ba-d96adcd71597",
  "expected_version": 0
}
```

```json
{
  "id": "a7cdf987-4492-42ec-b5c7-79b3183c087b",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "assignment_id": "cf770198-4497-41c5-8584-3672e8681c21",
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
  "arrived_at": "2026-10-30T08:40:09.53691Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a7cdf987-4492-42ec-b5c7-79b3183c087b/start` → **200**

```json
{
  "command_id": "8836bdd9-bc6f-4eee-9453-baa438c24f51",
  "expected_version": 1
}
```

```json
{
  "id": "a7cdf987-4492-42ec-b5c7-79b3183c087b",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "assignment_id": "cf770198-4497-41c5-8584-3672e8681c21",
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
  "arrived_at": "2026-10-30T08:40:09.53691Z",
  "started_at": "2026-10-30T08:40:09.835519Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/90ff6504-e08f-424f-967a-0bde73d02b18/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:41:40Z",
    "sequence": 1793349700140
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "90ff6504-e08f-424f-967a-0bde73d02b18",
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
  "last_heartbeat_at": "2026-10-30T08:41:40.160311Z",
  "last_location_at": "2026-10-30T08:41:40.160311Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a7cdf987-4492-42ec-b5c7-79b3183c087b/complete` → **200**

```json
{
  "command_id": "98b8d099-ec82-42a5-b0c0-e4a38a77dc3c",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:41:40Z",
  "cash_received": false
}
```

```json
{
  "id": "a7cdf987-4492-42ec-b5c7-79b3183c087b",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "assignment_id": "cf770198-4497-41c5-8584-3672e8681c21",
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
  "arrived_at": "2026-10-30T08:40:09.53691Z",
  "started_at": "2026-10-30T08:40:09.835519Z",
  "completed_at": "2026-10-30T08:41:40.458299Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937` → **200**

```json
{
  "id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c",
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
    "id": "cf770198-4497-41c5-8584-3672e8681c21",
    "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a7cdf987-4492-42ec-b5c7-79b3183c087b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:40:00.831233Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937` → **200**

```json
{
  "id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c",
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
    "id": "cf770198-4497-41c5-8584-3672e8681c21",
    "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a7cdf987-4492-42ec-b5c7-79b3183c087b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:40:00.831233Z",
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
  "session_id": "90ff6504-e08f-424f-967a-0bde73d02b18",
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
  "last_heartbeat_at": "2026-10-30T08:41:40.160311Z",
  "last_location_at": "2026-10-30T08:41:40.160311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/90ff6504-e08f-424f-967a-0bde73d02b18/close` → **200**

```json
{
  "command_id": "5eb18858-b1ed-4e3b-82bb-91d8c6758437",
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
  "session_id": "2d8cb3a7-858f-4915-8a91-6cb638d730dc",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MDMsImlhdCI6MTc5MzM0OTcwMywianRpIjoiYzM0ZjU4MzAtMDUxYS00NmViLWE5YjctM2E2OTc3NmVlMTM2Iiwic2lkIjoiMmQ4Y2IzYTctODU4Zi00OTE1LThhOTEtNmNiNjM4ZDczMGRjIn0.7mfLp4pyGllXZVABetMQJnIag_on5H_2je4TTdETS_I",
  "access_expires_at": "2026-10-30T08:56:43.212988209Z",
  "refresh_token": "RC_7kcVzuqOB-bpyeTX1B3eFMTVrZvDg9csSqED7GUg",
  "refresh_expires_at": "2026-10-30T20:41:43.212406845Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a3d78ed8-3d7d-4488-b7c7-7bfdba97dcfd"
}
```

`GET /api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T08:41:43.774372125Z",
  "order": {
    "id": "4bda7c27-01c4-4c21-a864-74c308109937",
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
    "created_at": "2026-10-30T08:40:00.831233Z",
    "assigned_at": "2026-10-30T08:40:03.046205Z",
    "arrived_at": "2026-10-30T08:40:09.53691Z",
    "started_at": "2026-10-30T08:40:09.835519Z",
    "completed_at": "2026-10-30T08:41:40.458299Z"
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
    "id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c",
    "registered_at": "2026-10-30T08:39:58.421005Z",
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
      "created_at": "2026-10-30T08:40:00.833883Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T08:41:40.512826Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/chargebacks` → **422**

```json
{
  "command_id": "8f6d7005-4d21-4f6c-89df-ff378d87b27a",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "bcc8399f-6904-40a9-a048-42fb028755bb"
}
```

`POST /api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/chargebacks` → **201**

```json
{
  "command_id": "95e7f5d5-c9cb-4ca3-9f55-188603554fe1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "362d47f1-7170-47de-a49f-5143ef1abff5",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:41:44.429676Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/chargebacks` → **201**

```json
{
  "command_id": "95e7f5d5-c9cb-4ca3-9f55-188603554fe1",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "362d47f1-7170-47de-a49f-5143ef1abff5",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:41:44.429676Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/6cca3aae-df05-4584-bc64-0f5ba28ea64c` → **200**

```json
{
  "client": {
    "id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c",
    "phone": "+380739331193",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:39:58.421005Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4bda7c27-01c4-4c21-a864-74c308109937",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:40:00.831233Z",
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

`POST /api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/chargebacks/362d47f1-7170-47de-a49f-5143ef1abff5/resolve` → **200**

```json
{
  "command_id": "0e0976db-95c1-496a-91d3-114467f27e45",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "362d47f1-7170-47de-a49f-5143ef1abff5",
  "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T08:41:44.429676Z",
  "resolved_at": "2026-10-30T08:41:45.343878Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/6cca3aae-df05-4584-bc64-0f5ba28ea64c` → **200**

```json
{
  "client": {
    "id": "6cca3aae-df05-4584-bc64-0f5ba28ea64c",
    "phone": "+380739331193",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:39:58.421005Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "4bda7c27-01c4-4c21-a864-74c308109937",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:40:00.831233Z",
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

`POST /api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/chargebacks/362d47f1-7170-47de-a49f-5143ef1abff5/resolve` → **409**

```json
{
  "command_id": "abdacc15-ee11-4a26-bbff-f4d4dfcefb72",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/chargebacks/362d47f1-7170-47de-a49f-5143ef1abff5/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6a35c69c-80d5-499f-9633-91133e82410e"
}
```

`GET /api/admin/v1/orders/4bda7c27-01c4-4c21-a864-74c308109937/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "362d47f1-7170-47de-a49f-5143ef1abff5",
      "order_id": "4bda7c27-01c4-4c21-a864-74c308109937",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T08:41:44.429676Z",
      "resolved_at": "2026-10-30T08:41:45.343878Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 4bda7c27-01c4-4c21-a864-74c308109937 without phone or card digits; chargeback 362d47f1-7170-47de-a49f-5143ef1abff5 recorded and won.

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
  "session_id": "ab73f8cf-2be0-412f-9ca2-86c42bf3dfb5",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MDcsImlhdCI6MTc5MzM0OTcwNywianRpIjoiMjFhN2ZiNTEtYjk4Ni00YTZkLWJiZWMtNjc5NTJjNTZlYmViIiwic2lkIjoiYWI3M2Y4Y2YtMmJlMC00MTJmLTljYTItODZjNDJiZjNkZmI1In0.aiZE1Djr0Jof-aNoHoTrP_icycwOon5U5CbudD_Ybmc",
  "access_expires_at": "2026-10-30T08:56:47.129431714Z",
  "refresh_token": "KdDStPHJMEi28rxwoy282FJXh2oQVkReGp50XVMiryo",
  "refresh_expires_at": "2026-10-30T20:41:47.128895144Z",
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
  "phone": "+48600255340",
  "device_ref": "sandbox-20902"
}
```

```json
{
  "challenge_id": "6e008e25-c85b-4cb5-8f9c-2210a37198ed",
  "expires_at": "2026-10-30T08:46:47.985928646Z",
  "resend_available_at": "2026-10-30T08:41:48.985928646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600255340` → **200**

```json
{
  "phone": "+48600255340",
  "audience": "CLIENT",
  "code": "153860",
  "sent_at": "2026-10-30T08:41:47.98854767Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e008e25-c85b-4cb5-8f9c-2210a37198ed",
  "code": "153860",
  "device_ref": "sandbox-20902"
}
```

```json
{
  "session_id": "dfd0f995-05a8-4c00-8e35-f0c757d88d25",
  "subject": {
    "type": "CLIENT",
    "id": "3abc969b-4938-46fb-a1b9-401183c524ea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYWJjOTY5Yi00OTM4LTQ2ZmItYTFiOS00MDExODNjNTI0ZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjA4LCJpYXQiOjE3OTMzNDk3MDgsImp0aSI6ImVhNTFjNTBmLWI3YWMtNGE5Yy1iNmI1LTcyOWRiNGIwNTM4NiIsInNpZCI6ImRmZDBmOTk1LTA1YTgtNGMwMC04ZTM1LWYwYzc1N2Q4OGQyNSJ9.agBBJfCzABLdJJtE0SrZTkUy3bFvFbxkz437oJSkPgU",
  "access_expires_at": "2026-10-30T08:56:48.302167937Z",
  "refresh_token": "5mmsplB4y8Z5O1Q3eYThkdgDBxtFt4vp6SkdBFA5Qs8",
  "refresh_expires_at": "2026-11-29T08:41:48.301664859Z",
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
  "command_id": "5b03a1ce-c124-42ca-a9cf-27e3ec48825f",
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
  "correlation_id": "de3816b5-ce47-4118-add7-eef03201c30a",
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
  "command_id": "6f6e4c51-62af-4050-a2f8-85cb1652e86a",
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
  "paused_at": "2026-10-30T08:41:49.443854516Z",
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
  "command_id": "c2cd5fba-6c2b-4ec5-97ba-3d231d4d173f",
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
  "id": "f28db1ce-16c8-4aa0-9695-094665187eb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:50.044745Z",
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
  "command_id": "2e9c63bf-79b7-4fe7-8298-d8e6f294dbb9",
  "quote_id": "f28db1ce-16c8-4aa0-9695-094665187eb4",
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
  "correlation_id": "68d2cc7a-106b-49a9-8158-115aafeaf147"
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
  "paused_at": "2026-10-30T08:41:49.443855Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "c73ff211-f3c6-4ad1-b615-71b7e25839ca",
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
  "command_id": "f89469b7-5454-4640-8a7f-034e115a7485",
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
  "command_id": "35021bd8-b2cb-490b-b16d-a1038c9dac20",
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
  "id": "f462cab8-5907-4241-899f-d37e3c0e3ec8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:51.815439Z",
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
  "command_id": "1a3e446f-6477-419e-b39f-4b60997dc69b",
  "quote_id": "f462cab8-5907-4241-899f-d37e3c0e3ec8",
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
  "correlation_id": "4da302f7-40d5-46e2-bc06-72c7b054032a"
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
  "command_id": "a96faf34-2af7-40d6-ac32-1b2d289e272f",
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
      "from": "11:00",
      "to": "12:00"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "e2d0533a-57ac-4cbb-9d53-19501ecbd574",
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
  "id": "772ee406-cfce-4174-98f0-e46fd5d217ef",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:53.001142Z",
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
  "command_id": "97124e2a-2c58-4a60-a78a-0fbf9f2402be",
  "quote_id": "772ee406-cfce-4174-98f0-e46fd5d217ef",
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
  "correlation_id": "4c977a4c-069b-4855-8f6b-800bb460e41e"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "3887c873-cb5f-45ee-90cf-11b8a12170f0",
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
  "correlation_id": "6571c2f0-8639-4207-a829-08901980a31c"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "46bad7fd-e144-4f68-be13-1e18af360382",
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
  "phone": "+380673987016",
  "device_ref": "sandbox-28517"
}
```

```json
{
  "challenge_id": "678dbe98-2739-4a38-94e9-c759b8f388a1",
  "expires_at": "2026-10-30T08:46:54.471029048Z",
  "resend_available_at": "2026-10-30T08:41:55.471029048Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673987016` → **200**

```json
{
  "phone": "+380673987016",
  "audience": "CLIENT",
  "code": "360928",
  "sent_at": "2026-10-30T08:41:54.473757556Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "678dbe98-2739-4a38-94e9-c759b8f388a1",
  "code": "360928",
  "device_ref": "sandbox-28517"
}
```

```json
{
  "session_id": "49af4c87-98b5-485a-8c98-03d0cde42925",
  "subject": {
    "type": "CLIENT",
    "id": "ca5b99de-30e4-4b9b-836c-f7aa60f9cf0d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTViOTlkZS0zMGU0LTRiOWItODM2Yy1mN2FhNjBmOWNmMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjE0LCJpYXQiOjE3OTMzNDk3MTQsImp0aSI6IjZiMmNiZGM5LTI1ZjEtNDA4NS05ZmViLWEyNjkxODhjOWI0NiIsInNpZCI6IjQ5YWY0Yzg3LTk4YjUtNDg1YS04Yzk4LTAzZDBjZGU0MjkyNSJ9.uhbNeZatRWdMbheoCByOEorcMw8SGGglahrvsOeFYgw",
  "access_expires_at": "2026-10-30T08:56:54.784793904Z",
  "refresh_token": "ta_sTHTpQE6KsmXAUMl6d4F4UB_x8OV_7OTgdsMTqWc",
  "refresh_expires_at": "2026-11-29T08:41:54.784206078Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "ca5b99de-30e4-4b9b-836c-f7aa60f9cf0d",
  "session_id": "49af4c87-98b5-485a-8c98-03d0cde42925",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1bab08f-03fa-435c-adbd-02b777257a50",
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
  "id": "2197d789-d7eb-419e-9cd4-5b0c82d02490",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:55.345038Z",
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
  "challenge_id": "ea359cfa-b53c-45f8-b9ea-281c89764ba1",
  "expires_at": "2026-10-30T08:46:57.637354772Z",
  "resend_available_at": "2026-10-30T08:41:58.637354772Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673987016` → **200**

```json
{
  "phone": "+380673987016",
  "audience": "CLIENT",
  "code": "034563",
  "sent_at": "2026-10-30T08:41:57.640187426Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "d9f64710-b929-463f-8527-68bfea00216b",
  "challenge_id": "ea359cfa-b53c-45f8-b9ea-281c89764ba1",
  "otp_code": "034563"
}
```

```json
{
  "client_id": "ca5b99de-30e4-4b9b-836c-f7aa60f9cf0d",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T08:41:57.960181678Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "342e696d-c76f-411c-b7e7-1ff6477ecbd8",
  "quote_id": "2197d789-d7eb-419e-9cd4-5b0c82d02490",
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
  "correlation_id": "564bb6e4-5297-4d2c-bb44-808d0a74331e"
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
  "session_id": "214b315c-5bad-434e-b7d3-2aab2969c85d",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MTgsImlhdCI6MTc5MzM0OTcxOCwianRpIjoiMGQ2NjRiYjEtN2I1ZC00MTFiLWJjYmEtY2QyYzdjYWQ5YThlIiwic2lkIjoiMjE0YjMxNWMtNWJhZC00MzRlLWI3ZDMtMmFhYjI5NjljODVkIn0.I2PuqAtZQLNyGu8A3gttqJHzhBSndgvhPDSTpsbJ_Jc",
  "access_expires_at": "2026-10-30T08:56:58.842697439Z",
  "refresh_token": "ZmU06kbzEGWVZA8yhNCqx_AF_ZpEEGLy0nfA29RRB1g",
  "refresh_expires_at": "2026-10-30T20:41:58.842101517Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "ca5b99de-30e4-4b9b-836c-f7aa60f9cf0d",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T08:41:57.960182Z",
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

`POST /api/admin/v1/client-deletions/ca5b99de-30e4-4b9b-836c-f7aa60f9cf0d/complete` → **200**

```json
{
  "command_id": "b5caa18e-c427-4709-94c5-83c23bea6f40",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "ca5b99de-30e4-4b9b-836c-f7aa60f9cf0d",
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
  "correlation_id": "6370147d-395e-45ae-ac5c-d17a38fd8680"
}
```

Done: client ca5b99de-30e4-4b9b-836c-f7aa60f9cf0d anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668411520",
  "device_ref": "sandbox-145"
}
```

```json
{
  "challenge_id": "7f6c9597-96b2-4fc0-bfbb-d3d493160dd7",
  "expires_at": "2026-10-30T08:47:00.014544004Z",
  "resend_available_at": "2026-10-30T08:42:01.014544004Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668411520` → **200**

```json
{
  "phone": "+380668411520",
  "audience": "CLIENT",
  "code": "277499",
  "sent_at": "2026-10-30T08:42:00.017313073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f6c9597-96b2-4fc0-bfbb-d3d493160dd7",
  "code": "277499",
  "device_ref": "sandbox-145"
}
```

```json
{
  "session_id": "3c1bdedc-d95e-4b38-8087-344f41c4600f",
  "subject": {
    "type": "CLIENT",
    "id": "734ff7d8-2fc6-41ab-9569-d26440c48229"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzRmZjdkOC0yZmM2LTQxYWItOTU2OS1kMjY0NDBjNDgyMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjIwLCJpYXQiOjE3OTMzNDk3MjAsImp0aSI6Ijc1ZDhhNWNmLWYyM2UtNGY3Zi05YmY4LTE0NzQwZTNkZGVlMSIsInNpZCI6IjNjMWJkZWRjLWQ5NWUtNGIzOC04MDg3LTM0NGY0MWM0NjAwZiJ9.sjutWLl211L3gKCI6ElbRW6yKnUJVDob3C0XJZZ3m2Y",
  "access_expires_at": "2026-10-30T08:57:00.323850884Z",
  "refresh_token": "s01NVkNMReFbhUq3Wbn3q0ZV7KV2MCUWJa0YWWBI13k",
  "refresh_expires_at": "2026-11-29T08:42:00.323344309Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "734ff7d8-2fc6-41ab-9569-d26440c48229",
  "session_id": "3c1bdedc-d95e-4b38-8087-344f41c4600f",
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
  "session_id": "1af22692-ec1f-49b2-aac4-334852a40233",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MjEsImlhdCI6MTc5MzM0OTcyMSwianRpIjoiYWE0ODA5MmItMzUyYi00YmM0LWFkMDktNDdmOTFkM2YwNzUyIiwic2lkIjoiMWFmMjI2OTItZWMxZi00OWIyLWFhYzQtMzM0ODUyYTQwMjMzIn0.fLpOXKK38a32fyaq7ZopSkLY-WgKqnz9U1EM9hCX5JU",
  "access_expires_at": "2026-10-30T08:57:01.172349669Z",
  "refresh_token": "6RoVZtv9u0RXITbF5uXCjx-STVDzhIaEszDmURi21VA",
  "refresh_expires_at": "2026-10-30T20:42:01.171858002Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8411520&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "734ff7d8-2fc6-41ab-9569-d26440c48229",
      "phone": "+380668411520",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T08:42:00.321703Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/734ff7d8-2fc6-41ab-9569-d26440c48229` → **200**

```json
{
  "client": {
    "id": "734ff7d8-2fc6-41ab-9569-d26440c48229",
    "phone": "+380668411520",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:42:00.321703Z",
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

`POST /api/admin/v1/clients/734ff7d8-2fc6-41ab-9569-d26440c48229/block` → **400**

```json
{
  "command_id": "ac11195c-b1b8-499e-86d8-bc432ccdf383",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/734ff7d8-2fc6-41ab-9569-d26440c48229/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "305b1d1f-3595-4d6d-b185-8fd821326b6f",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/734ff7d8-2fc6-41ab-9569-d26440c48229/block` → **200**

```json
{
  "command_id": "7b6c4c68-10ee-4521-a311-246512a58cd4",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "734ff7d8-2fc6-41ab-9569-d26440c48229",
  "phone": "+380668411520",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T08:42:00.321703Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T08:42:02.415177Z",
    "by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
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
  "correlation_id": "9e4f1de9-5244-44a9-b99c-cdf74c13a5b7"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668411520",
  "device_ref": "sandbox-4939"
}
```

```json
{
  "challenge_id": "a87526d3-a87d-4856-856c-0f0b641abf5f",
  "expires_at": "2026-10-30T08:47:05.007209608Z",
  "resend_available_at": "2026-10-30T08:42:06.007209608Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668411520` → **200**

```json
{
  "phone": "+380668411520",
  "audience": "CLIENT",
  "code": "028490",
  "sent_at": "2026-10-30T08:42:05.011610631Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "a87526d3-a87d-4856-856c-0f0b641abf5f",
  "code": "028490",
  "device_ref": "sandbox-4939"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e911401b-85e7-4f6b-9ed7-3ed480da0fbd"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/734ff7d8-2fc6-41ab-9569-d26440c48229` → **200**

```json
{
  "client": {
    "id": "734ff7d8-2fc6-41ab-9569-d26440c48229",
    "phone": "+380668411520",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T08:42:00.321703Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T08:42:02.415177Z",
      "by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
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

`POST /api/admin/v1/clients/734ff7d8-2fc6-41ab-9569-d26440c48229/unblock` → **200**

```json
{
  "command_id": "bcc25dba-2a5a-4517-ad90-620e34a5eba2",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "734ff7d8-2fc6-41ab-9569-d26440c48229",
  "phone": "+380668411520",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T08:42:00.321703Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668411520",
  "device_ref": "sandbox-7452"
}
```

```json
{
  "challenge_id": "2024933a-f6ef-400b-8bcf-e1c24b55b18c",
  "expires_at": "2026-10-30T08:47:08.297269802Z",
  "resend_available_at": "2026-10-30T08:42:09.297269802Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668411520` → **200**

```json
{
  "phone": "+380668411520",
  "audience": "CLIENT",
  "code": "407259",
  "sent_at": "2026-10-30T08:42:08.299912439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2024933a-f6ef-400b-8bcf-e1c24b55b18c",
  "code": "407259",
  "device_ref": "sandbox-7452"
}
```

```json
{
  "session_id": "b62a9510-2cac-4572-b3d2-313deff6f657",
  "subject": {
    "type": "CLIENT",
    "id": "734ff7d8-2fc6-41ab-9569-d26440c48229"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MzRmZjdkOC0yZmM2LTQxYWItOTU2OS1kMjY0NDBjNDgyMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjI4LCJpYXQiOjE3OTMzNDk3MjgsImp0aSI6Ijg3MjUyOWY2LTU1MzMtNGYyOS05OWUyLWJkMzM0NWQyNTJmMyIsInNpZCI6ImI2MmE5NTEwLTJjYWMtNDU3Mi1iM2QyLTMxM2RlZmY2ZjY1NyJ9.1ve3wzOCWYeKirgpuOlMTAxl1Tnrivd8Prtns8Bq6Fo",
  "access_expires_at": "2026-10-30T08:57:08.609896693Z",
  "refresh_token": "7VUzfB2uzCmSYRzmO91U3GD97PZxMyVDw3lrhV59_YQ",
  "refresh_expires_at": "2026-11-29T08:42:08.60932422Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "734ff7d8-2fc6-41ab-9569-d26440c48229",
  "session_id": "b62a9510-2cac-4572-b3d2-313deff6f657",
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
  "phone": "+380661720432",
  "device_ref": "sandbox-11426"
}
```

```json
{
  "challenge_id": "71771f5f-d111-442e-bd0d-bd420f4c2c74",
  "expires_at": "2026-10-30T08:47:09.194864983Z",
  "resend_available_at": "2026-10-30T08:42:10.194864983Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380661720432` → **200**

```json
{
  "phone": "+380661720432",
  "audience": "CLIENT",
  "code": "269038",
  "sent_at": "2026-10-30T08:42:09.197440306Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71771f5f-d111-442e-bd0d-bd420f4c2c74",
  "code": "269038",
  "device_ref": "sandbox-11426"
}
```

```json
{
  "session_id": "64514399-b77a-496e-991c-3caf7ac972a0",
  "subject": {
    "type": "CLIENT",
    "id": "86ed54dc-49d4-413f-8adf-ef2660513cf9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmVkNTRkYy00OWQ0LTQxM2YtOGFkZi1lZjI2NjA1MTNjZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjI5LCJpYXQiOjE3OTMzNDk3MjksImp0aSI6ImI4NjA1NjI1LTk1MjgtNDY5YS04NjNmLWVkYzhkZGU0MjdkNiIsInNpZCI6IjY0NTE0Mzk5LWI3N2EtNDk2ZS05OTFjLTNjYWY3YWM5NzJhMCJ9.B8YMXVzfiUJjJzGWpaJUKlYmlajgBMsXPHE1tTx5bgw",
  "access_expires_at": "2026-10-30T08:57:09.509301809Z",
  "refresh_token": "XJOVBwzSxXF7lpjq0qsBOiM3Y7yBKCmmLXMzWEZJA1Q",
  "refresh_expires_at": "2026-11-29T08:42:09.508758326Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "109f8174-0f22-490d-bcd1-b7f1dc730f60",
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
  "id": "d68c1423-327f-436d-88b5-da71e693e38b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:09.804984Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: a34b34d8-9da3-4ba6-b88a-877153148e94) → **201**

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
  "session_id": "00a17448-b2c8-43a5-988a-5d16c8f70243",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MzAsImlhdCI6MTc5MzM0OTczMCwianRpIjoiZjNkMGI0M2MtYTRkNC00YWNlLTg4YjktMmZiMzVkY2JmMGRiIiwic2lkIjoiMDBhMTc0NDgtYjJjOC00M2E1LTk4OGEtNWQxNmM4ZjcwMjQzIn0.Le1w_9qyRn0ZQqAfBQfgbworjulfY-5KzQjqtIZBEtU",
  "access_expires_at": "2026-10-30T08:57:10.439941339Z",
  "refresh_token": "iIaO0X_eAuDbhvJi2DrpMG1pVF8zFZh6tTtPRcyv3bw",
  "refresh_expires_at": "2026-10-30T20:42:10.439423463Z",
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
  "session_id": "18b5bb8f-e57a-4870-b087-2166ee6ed2ff",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MzEsImlhdCI6MTc5MzM0OTczMSwianRpIjoiNzE2Mzk4YjktZTFiYy00NWUzLWEzNjgtZmVhMTY0NTg1MDgzIiwic2lkIjoiMThiNWJiOGYtZTU3YS00ODcwLWIwODctMjE2NmVlNmVkMmZmIn0.xRKQTgEjjYhQvJV58btaVXbzPmJ1qbqDXUOcjL2M0UY",
  "access_expires_at": "2026-10-30T08:57:11.018506412Z",
  "refresh_token": "8crYYO3fNqLKm-DY4FqT7XIWOD06QLph0dnY2npFFx8",
  "refresh_expires_at": "2026-10-30T20:42:11.0177862Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/079a49c2-28db-4516-bede-917d0baa18c7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:42:10.111852Z",
      "actor": {
        "type": "CLIENT",
        "id": "86ed54dc-49d4-413f-8adf-ef2660513cf9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "079a49c2-28db-4516-bede-917d0baa18c7",
        "quote_id": "d68c1423-327f-436d-88b5-da71e693e38b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a34b34d8-9da3-4ba6-b88a-877153148e94"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:42:10.113728Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "079a49c2-28db-4516-bede-917d0baa18c7",
        "attempt_id": "3b1e375e-b196-403c-98a6-406435be350d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a34b34d8-9da3-4ba6-b88a-877153148e94"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T08:42:10.120435Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "079a49c2-28db-4516-bede-917d0baa18c7",
        "attempt_id": "3b1e375e-b196-403c-98a6-406435be350d"
      },
      "correlation_id": "a34b34d8-9da3-4ba6-b88a-877153148e94"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "3b1e375e-b196-403c-98a6-406435be350d",
        "generation": 1,
        "started_at": "2026-10-30T08:42:10.11283Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T08:42:10.120435Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T08:42:10.11443Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/a34b34d8-9da3-4ba6-b88a-877153148e94` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "079a49c2-28db-4516-bede-917d0baa18c7:0",
      "order_id": "079a49c2-28db-4516-bede-917d0baa18c7",
      "at": "2026-10-30T08:42:10.111852Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "079a49c2-28db-4516-bede-917d0baa18c7:1",
      "order_id": "079a49c2-28db-4516-bede-917d0baa18c7",
      "at": "2026-10-30T08:42:10.113728Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "079a49c2-28db-4516-bede-917d0baa18c7:2",
      "order_id": "079a49c2-28db-4516-bede-917d0baa18c7",
      "at": "2026-10-30T08:42:10.120435Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/55450ad8-93cb-4374-9ac5-4b4e97b211b7` → **200**

```json
{
  "found": []
}
```

Done: request a34b34d8-9da3-4ba6-b88a-877153148e94 — order 079a49c2-28db-4516-bede-917d0baa18c7 found by its id.

`GET /api/rider/v1/orders/079a49c2-28db-4516-bede-917d0baa18c7` → **200**

```json
{
  "id": "079a49c2-28db-4516-bede-917d0baa18c7",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "86ed54dc-49d4-413f-8adf-ef2660513cf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:42:10.111348Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/079a49c2-28db-4516-bede-917d0baa18c7/cancel` → **200**

```json
{
  "command_id": "8b83bc7b-ae62-411d-9358-0512190ccb53",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "079a49c2-28db-4516-bede-917d0baa18c7",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "86ed54dc-49d4-413f-8adf-ef2660513cf9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:42:10.111348Z",
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
  "phone": "+380635687483",
  "device_ref": "sandbox-19848"
}
```

```json
{
  "challenge_id": "76faf86c-72f4-4e0d-b64b-9f1fd53578a5",
  "expires_at": "2026-10-30T08:47:12.819670546Z",
  "resend_available_at": "2026-10-30T08:42:13.819670546Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635687483` → **200**

```json
{
  "phone": "+380635687483",
  "audience": "CLIENT",
  "code": "122857",
  "sent_at": "2026-10-30T08:42:12.822572346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76faf86c-72f4-4e0d-b64b-9f1fd53578a5",
  "code": "122857",
  "device_ref": "sandbox-19848"
}
```

```json
{
  "session_id": "53fee5a6-f325-4173-8366-c871a3f2c481",
  "subject": {
    "type": "CLIENT",
    "id": "a80172ed-b907-422f-a8c8-d2223d7bcb65"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhODAxNzJlZC1iOTA3LTQyMmYtYThjOC1kMjIyM2Q3YmNiNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjMzLCJpYXQiOjE3OTMzNDk3MzMsImp0aSI6Ijg1YjIzZWU0LTg0ZjgtNDc1OS1hOGI1LTgyMTkzZjAyYWM4OCIsInNpZCI6IjUzZmVlNWE2LWYzMjUtNDE3My04MzY2LWM4NzFhM2YyYzQ4MSJ9.TBENfX6zMaXSYhcSI2QGjRv_E-aa0P9fIdlzW5ffhHs",
  "access_expires_at": "2026-10-30T08:57:13.130140961Z",
  "refresh_token": "n2xhe9QdA99_hqG4TVyhOdSvTeZG6hjgA3GGkrqgyeE",
  "refresh_expires_at": "2026-11-29T08:42:13.129510576Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "2e9464f2-1bda-4cc1-a332-6bf9b4da74c1",
  "expires_at": "2026-10-30T08:47:15.411169743Z",
  "resend_available_at": "2026-10-30T08:42:16.411169743Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635687483` → **200**

```json
{
  "phone": "+380635687483",
  "audience": "CLIENT",
  "code": "972567",
  "sent_at": "2026-10-30T08:42:15.413734294Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "63f0da46-e991-4064-bfc8-af8f07ac9001",
  "challenge_id": "2e9464f2-1bda-4cc1-a332-6bf9b4da74c1",
  "otp_code": "972567"
}
```

```json
{
  "id": "bf2f2f01-8a31-4d54-b93a-24ec003f95b3",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:15.737091Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/bf2f2f01-8a31-4d54-b93a-24ec003f95b3` → **200**

```json
{
  "id": "bf2f2f01-8a31-4d54-b93a-24ec003f95b3",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:15.737091Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bf2f2f01-8a31-4d54-b93a-24ec003f95b3` → **200**

```json
{
  "id": "bf2f2f01-8a31-4d54-b93a-24ec003f95b3",
  "state": "READY",
  "created_at": "2026-10-30T08:42:15.737091Z",
  "ready_at": "2026-10-30T08:42:16.209919Z",
  "expires_at": "2026-11-06T08:42:16.209919Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/bf2f2f01-8a31-4d54-b93a-24ec003f95b3/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631385819",
  "device_ref": "sandbox-6893"
}
```

```json
{
  "challenge_id": "a5776ae2-e0f4-472b-91a1-866cf2d781dc",
  "expires_at": "2026-10-30T08:47:17.648991608Z",
  "resend_available_at": "2026-10-30T08:42:18.648991608Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631385819` → **200**

```json
{
  "phone": "+380631385819",
  "audience": "CLIENT",
  "code": "750444",
  "sent_at": "2026-10-30T08:42:17.651726698Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5776ae2-e0f4-472b-91a1-866cf2d781dc",
  "code": "750444",
  "device_ref": "sandbox-6893"
}
```

```json
{
  "session_id": "7f588768-8b5b-46bc-9561-2d358a0354f1",
  "subject": {
    "type": "CLIENT",
    "id": "82e33a68-0a68-4e60-8973-4bb3dfd28a91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmUzM2E2OC0wYTY4LTRlNjAtODk3My00YmIzZGZkMjhhOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjM3LCJpYXQiOjE3OTMzNDk3MzcsImp0aSI6IjRmZDE0NGY3LTAyYzctNDZiYy1hZDVlLTI1NDI3OWJlZTkyYSIsInNpZCI6IjdmNTg4NzY4LThiNWItNDZiYy05NTYxLTJkMzU4YTAzNTRmMSJ9.U7P798Tjd_wkLTH2B_WZql7w3Ubbm4XWqgk0NoMFrC0",
  "access_expires_at": "2026-10-30T08:57:17.956374581Z",
  "refresh_token": "WgqAP2jZTcRwtEVfV4-VI9IbgtDqW7D2lbZ1G_mePO0",
  "refresh_expires_at": "2026-11-29T08:42:17.955637066Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/bf2f2f01-8a31-4d54-b93a-24ec003f95b3/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/bf2f2f01-8a31-4d54-b93a-24ec003f95b3/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "89e02cf7-34e4-42a6-9c5a-05dfee247a74"
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
  "session_id": "0315b946-cff3-406d-b859-bbef63d7648d",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MzgsImlhdCI6MTc5MzM0OTczOCwianRpIjoiMjAzZmY4ZTAtNTBkNS00OGEyLWI3ZTMtMzg1NGMxNTFhMGY1Iiwic2lkIjoiMDMxNWI5NDYtY2ZmMy00MDZkLWI4NTktYmJlZjYzZDc2NDhkIn0.tHZCtOwyjisueBywJFb8_3NP4CbB5tbkCL1I3ayxHFk",
  "access_expires_at": "2026-10-30T08:57:18.832429405Z",
  "refresh_token": "pbBdfb5fgCkP2-VG2adILkEGj1J0DY86CRBgmeo7_RI",
  "refresh_expires_at": "2026-10-30T20:42:18.831885711Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a80172ed-b907-422f-a8c8-d2223d7bcb65",
  "session_id": "53fee5a6-f325-4173-8366-c871a3f2c481",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/a80172ed-b907-422f-a8c8-d2223d7bcb65/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "bf2f2f01-8a31-4d54-b93a-24ec003f95b3",
      "state": "READY",
      "created_at": "2026-10-30T08:42:15.737091Z",
      "ready_at": "2026-10-30T08:42:16.209919Z",
      "expires_at": "2026-11-06T08:42:16.209919Z",
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
  "device_ref": "sandbox-5130"
}
```

```json
{
  "challenge_id": "ddb6623f-d115-4508-b6cb-d1a9a1b676dc",
  "expires_at": "2026-10-30T08:47:19.697120264Z",
  "resend_available_at": "2026-10-30T08:42:20.697120264Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "896824",
  "sent_at": "2026-10-30T08:42:19.700039383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ddb6623f-d115-4508-b6cb-d1a9a1b676dc",
  "code": "896824",
  "device_ref": "sandbox-5130"
}
```

```json
{
  "session_id": "e3767949-8cc2-441a-ba0a-fdce28b6b132",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY0MCwiaWF0IjoxNzkzMzQ5NzQwLCJqdGkiOiI3ZTZiODAxMy0wNjA4LTQ1NjctYmI4Yi00NDNmZjU5NzVkYmUiLCJzaWQiOiJlMzc2Nzk0OS04Y2MyLTQ0MWEtYmEwYS1mZGNlMjhiNmIxMzIifQ.L9uGc1j1Kyqvey4s8-SToPqPjwpbecHrS2rjs9wikYU",
  "access_expires_at": "2026-10-30T08:57:20.007641399Z",
  "refresh_token": "RC9-Di65ulPJwCd0lwgJbWwXZWlNOOysvSX0_N7Zxxs",
  "refresh_expires_at": "2026-11-29T08:42:20.006879759Z",
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
  "device_ref": "sandbox-25849"
}
```

```json
{
  "challenge_id": "52c629c4-f671-432c-b76c-6c55936cb841",
  "expires_at": "2026-10-30T08:47:20.572812094Z",
  "resend_available_at": "2026-10-30T08:42:21.572812094Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "598757",
  "sent_at": "2026-10-30T08:42:20.575660993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "52c629c4-f671-432c-b76c-6c55936cb841",
  "code": "598757",
  "device_ref": "sandbox-25849"
}
```

```json
{
  "session_id": "22f11571-e09e-4c09-8e49-fe7e1d939d48",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY0MCwiaWF0IjoxNzkzMzQ5NzQwLCJqdGkiOiJjMWY3OTVlNy02NjkzLTQ4YjAtOTJhMC02MDkxODhhNGVjZGYiLCJzaWQiOiIyMmYxMTU3MS1lMDllLTRjMDktOGU0OS1mZTdlMWQ5MzlkNDgifQ.0tKV0t9Jp2niO3Bt_Ia9y4SaSYpNJja8bLSEFdJR-XU",
  "access_expires_at": "2026-10-30T08:57:20.89264446Z",
  "refresh_token": "gTaLFY7DrM87t63uGAV9ET-rzSoznGSfPcmhQiTz_Iw",
  "refresh_expires_at": "2026-11-29T08:42:20.891971095Z",
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
  "command_id": "e701ea8f-19f7-4b2f-b27d-237810cbd5fc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:21Z",
    "sequence": 1793349741485
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "439a8811-1eaa-43e1-b2e2-86eef545a2e9",
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
  "last_heartbeat_at": "2026-10-30T08:42:21.503869Z",
  "last_location_at": "2026-10-30T08:42:21.503869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-23244"
}
```

```json
{
  "challenge_id": "919cd7a7-4cf4-457b-8aff-c71a24df9997",
  "expires_at": "2026-10-30T08:47:21.794016907Z",
  "resend_available_at": "2026-10-30T08:42:22.794016907Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "467574",
  "sent_at": "2026-10-30T08:42:21.796651791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "919cd7a7-4cf4-457b-8aff-c71a24df9997",
  "code": "467574",
  "device_ref": "sandbox-23244"
}
```

```json
{
  "session_id": "a93c5db8-50e6-4e17-a1bd-cfacdc6bdee4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY0MiwiaWF0IjoxNzkzMzQ5NzQyLCJqdGkiOiIwNjQ5NmVhMS1jMDM2LTQ0ZGMtOWUxMS02ZDkxM2EwZDAwNmEiLCJzaWQiOiJhOTNjNWRiOC01MGU2LTRlMTctYTFiZC1jZmFjZGM2YmRlZTQifQ.CJsOgD1HHskN09RqUE-XIJaa6t0CPOBtsXx-gQfoa28",
  "access_expires_at": "2026-10-30T08:57:22.111270228Z",
  "refresh_token": "QU3JM3k-YPdvA1XEIMYeLGaYVDMwMERl0fGZygWH5NY",
  "refresh_expires_at": "2026-11-29T08:42:22.11077251Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fb8c4d5d-4cbb-4de4-89c6-2d97ec75c1f4",
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
  "last_heartbeat_at": "2026-10-30T08:38:29.587942Z",
  "last_location_at": "2026-10-30T08:38:29.587942Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fb8c4d5d-4cbb-4de4-89c6-2d97ec75c1f4/handover` → **200**

```json
{
  "command_id": "ad076d80-0a4e-4572-8951-8987fc49cecc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fb8c4d5d-4cbb-4de4-89c6-2d97ec75c1f4",
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
  "last_heartbeat_at": "2026-10-30T08:38:29.587942Z",
  "last_location_at": "2026-10-30T08:38:29.587942Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fb8c4d5d-4cbb-4de4-89c6-2d97ec75c1f4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:22Z",
    "sequence": 1793349742994
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "fb8c4d5d-4cbb-4de4-89c6-2d97ec75c1f4",
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
  "last_heartbeat_at": "2026-10-30T08:42:23.012865Z",
  "last_location_at": "2026-10-30T08:42:23.012865Z",
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
  "session_id": "a730555c-9f4f-44b3-a3dc-725462bfc335",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NDMsImlhdCI6MTc5MzM0OTc0MywianRpIjoiODYxZTQyMTYtMzcyZi00NDFmLWFmNzYtOWI1YTRjYjM5MTAwIiwic2lkIjoiYTczMDU1NWMtOWY0Zi00NGIzLWEzZGMtNzI1NDYyYmZjMzM1In0.YzrUr_kpI8lXUm652FtzJOaDCGk4BUUvVQMXcpmbGrc",
  "access_expires_at": "2026-10-30T08:57:23.589889695Z",
  "refresh_token": "zZOXZxDBPyOy2MbA9XKoT7quZl3WVIDW3sMfPm40WFg",
  "refresh_expires_at": "2026-10-30T20:42:23.589300014Z",
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
  "session_id": "dee9062b-c8b6-4090-b1a8-7eaac2dd1318",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NDQsImlhdCI6MTc5MzM0OTc0NCwianRpIjoiOTk1M2E1ODgtZDg2Ni00MGIwLTlmMDgtN2Q4ZmU3YjlmNWNkIiwic2lkIjoiZGVlOTA2MmItYzhiNi00MDkwLWIxYTgtN2VhYWMyZGQxMzE4In0.-lgpZoDRVSybp8ido_fkPvK_TsbFAhYTa8ZoncO9EvY",
  "access_expires_at": "2026-10-30T08:57:24.166754289Z",
  "refresh_token": "jyn2XL9TGBiio1SKG3yFKM9ylSm0hks7pLeV-RT4WXM",
  "refresh_expires_at": "2026-10-30T20:42:24.166204244Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680467762",
  "device_ref": "sandbox-17672"
}
```

```json
{
  "challenge_id": "57540c8f-b938-4b19-b6fa-c05070220123",
  "expires_at": "2026-10-30T08:47:24.450379971Z",
  "resend_available_at": "2026-10-30T08:42:25.450379971Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680467762` → **200**

```json
{
  "phone": "+380680467762",
  "audience": "CLIENT",
  "code": "932845",
  "sent_at": "2026-10-30T08:42:24.452922977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57540c8f-b938-4b19-b6fa-c05070220123",
  "code": "932845",
  "device_ref": "sandbox-17672"
}
```

```json
{
  "session_id": "91d3622d-be99-4961-ae9c-83c367158b2c",
  "subject": {
    "type": "CLIENT",
    "id": "3ba992e9-716a-475a-9f4a-1a0f17f5e3cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYmE5OTJlOS03MTZhLTQ3NWEtOWY0YS0xYTBmMTdmNWUzY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjQ0LCJpYXQiOjE3OTMzNDk3NDQsImp0aSI6IjBiNWE0OTIyLTRlYzctNGVlMC1hYTY0LTc2OWIwMTg2ZTlhYiIsInNpZCI6IjkxZDM2MjJkLWJlOTktNDk2MS1hZTljLTgzYzM2NzE1OGIyYyJ9.KYc6I3Dv3s0OrPFPGt5lhvIoe_KD9C360jiteaUs58Y",
  "access_expires_at": "2026-10-30T08:57:24.755836003Z",
  "refresh_token": "puWgrIL2pyXUoEgxF3b5S0QcVQRSgObZhf1vuEo0kzg",
  "refresh_expires_at": "2026-11-29T08:42:24.755270447Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f868d26b-5a39-4faa-918c-bc95a9f84144",
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
  "id": "cc178e1c-f5da-47b8-adcf-8a4d8444c010",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:25.032145Z",
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
  "command_id": "f9d5b753-5759-4ffb-a77f-b575d28b27ab",
  "quote_id": "cc178e1c-f5da-47b8-adcf-8a4d8444c010",
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
  "id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3ba992e9-716a-475a-9f4a-1a0f17f5e3cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:42:25.328811Z",
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
    "id": "8f49d56c-639b-444c-8dda-1a4739241408",
    "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
    "expires_at": "2026-10-30T08:42:40.33212Z",
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

`POST /api/driver/v1/offers/8f49d56c-639b-444c-8dda-1a4739241408/reject` → **204**

```json
{
  "command_id": "2db15bfb-5f8d-423b-8689-943e208812fd"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "69f40890-76b7-498e-a8d7-6ae1a7dae764",
    "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
    "expires_at": "2026-10-30T08:42:40.923127Z",
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

`POST /api/driver/v1/offers/69f40890-76b7-498e-a8d7-6ae1a7dae764/accept` → **200**

```json
{
  "command_id": "9409c28b-85aa-4e14-a312-ebab84b9db2e"
}
```

```json
{
  "id": "dc0dc14c-de51-4658-87e6-e0352ca87186",
  "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dfbf2f74-90e1-407b-899c-24eb03128b69",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/30fa5b6d-329e-47db-9dd2-a730aa0fbd93/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:42:25.329243Z",
      "actor": {
        "type": "CLIENT",
        "id": "3ba992e9-716a-475a-9f4a-1a0f17f5e3cb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
        "quote_id": "cc178e1c-f5da-47b8-adcf-8a4d8444c010",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9fde359e-af29-43f8-b7f6-f7f2b0c0b47e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:42:25.331289Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
        "attempt_id": "8932017d-c5b4-430f-8e27-fc0e40d30301",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9fde359e-af29-43f8-b7f6-f7f2b0c0b47e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:42:25.335103Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8f49d56c-639b-444c-8dda-1a4739241408",
        "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "9fde359e-af29-43f8-b7f6-f7f2b0c0b47e"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T08:42:25.922203Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8f49d56c-639b-444c-8dda-1a4739241408",
        "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93"
      },
      "correlation_id": "19b7a47d-2b89-4524-96a2-66d8ebe24fc3"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 30fa5b6d-329e-47db-9dd2-a730aa0fbd93 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/30fa5b6d-329e-47db-9dd2-a730aa0fbd93` → **200**

```json
{
  "id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3ba992e9-716a-475a-9f4a-1a0f17f5e3cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "dc0dc14c-de51-4658-87e6-e0352ca87186",
    "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dfbf2f74-90e1-407b-899c-24eb03128b69",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:42:25.328811Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/30fa5b6d-329e-47db-9dd2-a730aa0fbd93/cancel` → **200**

```json
{
  "command_id": "1dd43b99-f22a-4fb0-aed3-8e0ccec9896f",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3ba992e9-716a-475a-9f4a-1a0f17f5e3cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "dc0dc14c-de51-4658-87e6-e0352ca87186",
    "order_id": "30fa5b6d-329e-47db-9dd2-a730aa0fbd93",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dfbf2f74-90e1-407b-899c-24eb03128b69",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:42:25.328811Z",
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
  "session_id": "439a8811-1eaa-43e1-b2e2-86eef545a2e9",
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
  "last_heartbeat_at": "2026-10-30T08:42:21.503869Z",
  "last_location_at": "2026-10-30T08:42:21.503869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/439a8811-1eaa-43e1-b2e2-86eef545a2e9/close` → **200**

```json
{
  "command_id": "79f9b956-7ac5-43f2-a43e-1d7ec973a5e0",
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
  "session_id": "fb8c4d5d-4cbb-4de4-89c6-2d97ec75c1f4",
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
  "last_heartbeat_at": "2026-10-30T08:42:23.012865Z",
  "last_location_at": "2026-10-30T08:42:23.012865Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fb8c4d5d-4cbb-4de4-89c6-2d97ec75c1f4/close` → **200**

```json
{
  "command_id": "3e7113be-3d0f-4019-a435-0cd21b7bf743",
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
  "session_id": "1139acac-3900-4eb6-a3c0-d890142c39f4",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NDgsImlhdCI6MTc5MzM0OTc0OCwianRpIjoiZjIyNmVlZDYtMmE1Ni00YzUxLTkzYTAtMzAxOTUxYzc5ZjAxIiwic2lkIjoiMTEzOWFjYWMtMzkwMC00ZWI2LWEzYzAtZDg5MDE0MmMzOWY0In0.QCat5PGR8tcFtaaXbW-vQTbBOH6fJf_QzCpw5kqrru0",
  "access_expires_at": "2026-10-30T08:57:28.943270734Z",
  "refresh_token": "2q-7f8CetFP25nEn7hTaKd1C5z9DCURZj9W6vu0F-RM",
  "refresh_expires_at": "2026-10-30T20:42:28.942780529Z",
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
  "command_id": "679ee71f-d7ad-493f-ba2c-adbc766a9da4",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T08:42:29.539553Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "cd963291-3369-4a8e-bf5c-25f12362a48b",
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
  "correlation_id": "13f2f984-926f-4050-a46a-24b5accf4618"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "dab4657c-5f46-4b45-99b6-af3a7e248ff8",
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
  "correlation_id": "c2006643-ab9d-406a-9a54-b27ec37bd90e"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639854012",
  "device_ref": "sandbox-32189"
}
```

```json
{
  "challenge_id": "71169543-c1fe-40f2-a5e7-9641960c2d4b",
  "expires_at": "2026-10-30T08:47:30.401356754Z",
  "resend_available_at": "2026-10-30T08:42:31.401356754Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639854012` → **200**

```json
{
  "phone": "+380639854012",
  "audience": "CLIENT",
  "code": "912918",
  "sent_at": "2026-10-30T08:42:30.404899753Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71169543-c1fe-40f2-a5e7-9641960c2d4b",
  "code": "912918",
  "device_ref": "sandbox-32189"
}
```

```json
{
  "session_id": "ce4cc9bb-dd5e-47f2-9407-f84a309dadb5",
  "subject": {
    "type": "CLIENT",
    "id": "b87c3e3f-4bc4-4e4b-b2bc-a36cdeca6a25"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODdjM2UzZi00YmM0LTRlNGItYjJiYy1hMzZjZGVjYTZhMjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjUwLCJpYXQiOjE3OTMzNDk3NTAsImp0aSI6IjZhMDE4MThmLWNjYzYtNGUzNy1iYjNjLThlMmZkZDI4ZWZhZiIsInNpZCI6ImNlNGNjOWJiLWRkNWUtNDdmMi05NDA3LWY4NGEzMDlkYWRiNSJ9.PJAMG4Zb8xH4LvU2TgFd0aD4TtdgGEpEtuHMgbrv2c4",
  "access_expires_at": "2026-10-30T08:57:30.707434108Z",
  "refresh_token": "Yd1cQRRFw5cKWRPSd_kXSuDsuASi2KzvkC43mTag7Ak",
  "refresh_expires_at": "2026-11-29T08:42:30.70695794Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "adafccbc-f5e7-4aeb-92c8-e11d0998c5a0",
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
  "id": "b9e5c99c-3135-4c95-886d-80f80e836bde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:31.005391Z",
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
  "command_id": "71e28fff-148e-4aa7-9127-6a1bccf060ee",
  "quote_id": "b9e5c99c-3135-4c95-886d-80f80e836bde",
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
  "correlation_id": "a9880c5d-df54-4260-b58f-16a320786e65"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "61171e99-1c93-4304-94e5-96b9d315b9cb",
  "quote_id": "b9e5c99c-3135-4c95-886d-80f80e836bde",
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
  "id": "189b3d61-e2b6-4f0e-8e0d-74fd678df180",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b87c3e3f-4bc4-4e4b-b2bc-a36cdeca6a25",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:42:31.608372Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/189b3d61-e2b6-4f0e-8e0d-74fd678df180/cancel` → **200**

```json
{
  "command_id": "e4ad3f2e-f2fe-4e32-8c82-1ccd4c8a8a24",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "189b3d61-e2b6-4f0e-8e0d-74fd678df180",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b87c3e3f-4bc4-4e4b-b2bc-a36cdeca6a25",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:42:31.608372Z",
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
  "command_id": "0b2f78fd-0aa1-44ea-87b5-4a6905e48507",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T08:42:32.232835Z"
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
      "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T08:42:32.232835Z"
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
  "device_ref": "sandbox-32591"
}
```

```json
{
  "challenge_id": "187f33b8-e280-4f53-aafa-517ccc238b76",
  "expires_at": "2026-10-30T08:47:33.117764732Z",
  "resend_available_at": "2026-10-30T08:42:34.117764732Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "291304",
  "sent_at": "2026-10-30T08:42:33.120266453Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "187f33b8-e280-4f53-aafa-517ccc238b76",
  "code": "291304",
  "device_ref": "sandbox-32591"
}
```

```json
{
  "session_id": "44c8b0c1-c5cc-4d9e-96c3-00e7482b0c71",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY1MywiaWF0IjoxNzkzMzQ5NzUzLCJqdGkiOiI4YzYyMmE2My1iYjhjLTQ4NmItOTY4My1lNjFiYzk1MjhlNWUiLCJzaWQiOiI0NGM4YjBjMS1jNWNjLTRkOWUtOTZjMy0wMGU3NDgyYjBjNzEifQ.BQDuPdb8DU2lguYN-VbtnXzU6twqktl0tyVV0R7Gs6M",
  "access_expires_at": "2026-10-30T08:57:33.430616677Z",
  "refresh_token": "V20tfOSrTVvjPTGgD9n9c8JCZoy-OiRMxRUbEcmI8-k",
  "refresh_expires_at": "2026-11-29T08:42:33.429976303Z",
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
  "command_id": "faa5e839-d563-4988-8176-1ff1e342afe6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:34Z",
    "sequence": 1793349754167
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:42:34.03509Z",
  "last_location_at": "2026-10-30T08:42:34.03509Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670408958",
  "device_ref": "sandbox-6425"
}
```

```json
{
  "challenge_id": "b8d33299-e2b1-4e3c-801d-53996a5ed73c",
  "expires_at": "2026-10-30T08:47:34.316183047Z",
  "resend_available_at": "2026-10-30T08:42:35.316183047Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670408958` → **200**

```json
{
  "phone": "+380670408958",
  "audience": "CLIENT",
  "code": "743265",
  "sent_at": "2026-10-30T08:42:34.319777318Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8d33299-e2b1-4e3c-801d-53996a5ed73c",
  "code": "743265",
  "device_ref": "sandbox-6425"
}
```

```json
{
  "session_id": "f7a7699e-8407-432f-968a-2fdfc356d2b4",
  "subject": {
    "type": "CLIENT",
    "id": "5bc1a519-27fa-45b1-b829-da5303b4cd61"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmMxYTUxOS0yN2ZhLTQ1YjEtYjgyOS1kYTUzMDNiNGNkNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjU0LCJpYXQiOjE3OTMzNDk3NTQsImp0aSI6IjJjZDQ1MzMxLTUzYmEtNDAwNC1iMWM5LTAxMDc3YjFmZTI0NiIsInNpZCI6ImY3YTc2OTllLTg0MDctNDMyZi05NjhhLTJmZGZjMzU2ZDJiNCJ9.aLArS58rfG0RDpwbMf-N0Sdes967ptC3ORMeZmuEFRU",
  "access_expires_at": "2026-10-30T08:57:34.632518324Z",
  "refresh_token": "dDffcxRMYbfO0N9vNJl-U6Yb4xamju64C-8uIK_mq-o",
  "refresh_expires_at": "2026-11-29T08:42:34.632018332Z",
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
  "command_id": "a3b1518c-60e1-42f1-9b20-c22895d009a3",
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
  "id": "43279c1a-32c5-4bc0-93a4-ae45ae1be90a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:35.195143Z",
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
  "command_id": "16a05195-70ff-440c-826a-71f2a442a51f",
  "platform": "ANDROID",
  "token": "sandbox-driver-a5af9a57-c481-4e40-9891-f01d09d331b3"
}
```

```json
{
  "id": "532fc39e-6878-4c64-8647-d7fff70f8d56",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:42:35.495391Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "650586ee-c2ff-4de2-85ec-0854a4f37382",
  "platform": "ANDROID",
  "token": "sandbox-rider-eb8f2fef-35a3-4e7f-bd76-a77e98c8d9a2"
}
```

```json
{
  "id": "5252de5a-043b-4b15-8e1b-6aa0ef27e961",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:42:35.788494Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "80188665-81d2-4335-898e-1fe3c567cdd7",
  "quote_id": "43279c1a-32c5-4bc0-93a4-ae45ae1be90a",
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
  "id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5bc1a519-27fa-45b1-b829-da5303b4cd61",
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
  "created_at": "2026-10-30T08:42:36.087347Z",
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
    "id": "167bb3cd-1a06-47fe-b574-d47980576bcc",
    "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
    "expires_at": "2026-10-30T08:42:51.090525Z",
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

`POST /api/driver/v1/offers/167bb3cd-1a06-47fe-b574-d47980576bcc/accept` → **200**

```json
{
  "command_id": "6a7e3a03-594b-4870-97b1-c80d0bfbb715"
}
```

```json
{
  "id": "61e8c8b2-6f7c-46f6-9ed2-14a3f2df92da",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9d982bb-d607-40cc-8d94-4f0fcf3d7f93",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:42:36.613Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:42:36.613Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:42:37.00927945Z",
    "token_suffix": "d331b3",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
      "order_version": "2",
      "event_id": "b8cfa1e3-15ce-496e-8d0a-fbf5e68dfd02",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670408958&after=2026-10-30T08:42:36.613Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:42:37.006682655Z",
    "token_suffix": "c8d9a2",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
      "order_version": "3",
      "event_id": "f79080f2-d3d3-43b1-a920-9f880793579b",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/8fc50129-f242-412d-ab9c-188bb6d67781/messages` → **201**

```json
{
  "command_id": "4769b0f1-8703-49bc-a596-720d6550bddf",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "c9cc548d-912c-40ca-9817-758a21bb27ff",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T08:42:38.063919738Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9d982bb-d607-40cc-8d94-4f0fcf3d7f93",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "assignment_id": "61e8c8b2-6f7c-46f6-9ed2-14a3f2df92da",
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

`POST /api/driver/v1/trips/a9d982bb-d607-40cc-8d94-4f0fcf3d7f93/messages` → **201**

```json
{
  "command_id": "5a206fcc-6d2c-4344-a743-2bdaef15fd5b",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "54f54693-4748-4840-a65a-3e80500bbd62",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T08:42:38.630706146Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/8fc50129-f242-412d-ab9c-188bb6d67781/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/a9d982bb-d607-40cc-8d94-4f0fcf3d7f93/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670408958"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/727c9450-71c7-424f-9c47-287e473fab1c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:39Z",
    "sequence": 1793349759489
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:42:39.508038Z",
  "last_location_at": "2026-10-30T08:42:39.508038Z",
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
  "id": "a9d982bb-d607-40cc-8d94-4f0fcf3d7f93",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "assignment_id": "61e8c8b2-6f7c-46f6-9ed2-14a3f2df92da",
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

`POST /api/driver/v1/trips/a9d982bb-d607-40cc-8d94-4f0fcf3d7f93/arrive` → **200**

```json
{
  "command_id": "47aed304-1bce-4e41-83cc-ee832b48a233",
  "expected_version": 0
}
```

```json
{
  "id": "a9d982bb-d607-40cc-8d94-4f0fcf3d7f93",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "assignment_id": "61e8c8b2-6f7c-46f6-9ed2-14a3f2df92da",
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
  "arrived_at": "2026-10-30T08:42:40.092923Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a9d982bb-d607-40cc-8d94-4f0fcf3d7f93/start` → **200**

```json
{
  "command_id": "96b5a5c3-80bc-46b8-bbe4-f811e7be9a0c",
  "expected_version": 1
}
```

```json
{
  "id": "a9d982bb-d607-40cc-8d94-4f0fcf3d7f93",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "assignment_id": "61e8c8b2-6f7c-46f6-9ed2-14a3f2df92da",
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
  "arrived_at": "2026-10-30T08:42:40.092923Z",
  "started_at": "2026-10-30T08:42:40.378839Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/727c9450-71c7-424f-9c47-287e473fab1c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:28Z",
    "sequence": 1793349808695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:43:28.714354Z",
  "last_location_at": "2026-10-30T08:43:28.714354Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/a9d982bb-d607-40cc-8d94-4f0fcf3d7f93/complete` → **200**

```json
{
  "command_id": "b3ebf352-7c5b-405c-a834-78565ff66c78",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:43:28Z",
  "cash_received": true
}
```

```json
{
  "id": "a9d982bb-d607-40cc-8d94-4f0fcf3d7f93",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "assignment_id": "61e8c8b2-6f7c-46f6-9ed2-14a3f2df92da",
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
  "arrived_at": "2026-10-30T08:42:40.092923Z",
  "started_at": "2026-10-30T08:42:40.378839Z",
  "completed_at": "2026-10-30T08:43:29.007999Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/8fc50129-f242-412d-ab9c-188bb6d67781` → **200**

```json
{
  "id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5bc1a519-27fa-45b1-b829-da5303b4cd61",
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
    "id": "61e8c8b2-6f7c-46f6-9ed2-14a3f2df92da",
    "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a9d982bb-d607-40cc-8d94-4f0fcf3d7f93",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:42:36.087347Z",
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
    "id": "8fc50129-f242-412d-ab9c-188bb6d67781",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:42:36.087347Z",
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
    "id": "a9d982bb-d607-40cc-8d94-4f0fcf3d7f93",
    "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
    "order_short_number": 13,
    "created_at": "2026-10-30T08:42:36.682303Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "60bc37e0-4d8f-4083-b0da-f2eb92c85e13",
    "order_id": "5b158242-8051-410f-b1b6-1a8b57ec4a2b",
    "order_short_number": 8,
    "created_at": "2026-10-30T08:39:53.553583Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8e03691e-bc61-4c1c-a6cd-a49e9c24b5fa",
    "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
    "order_short_number": 3,
    "created_at": "2026-10-30T08:38:20.231996Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6df4d905-d0c6-4b51-8e28-a59afbbebf29",
    "order_id": "338c1547-5d56-4385-b4a2-e0079f1e5123",
    "order_short_number": 2,
    "created_at": "2026-10-30T08:37:50.064547Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "bd064f7f-002d-4a54-b497-f3452cbd1b88",
    "order_id": "670fbe8b-4586-4a17-9780-5dc5770c482a",
    "order_short_number": 1,
    "created_at": "2026-10-30T08:37:40.150439Z",
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

`GET /api/rider/v1/orders/8fc50129-f242-412d-ab9c-188bb6d67781/tip` → **200**

```json
{
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
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
  "available_until": "2026-10-31T08:43:29.007999Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/8fc50129-f242-412d-ab9c-188bb6d67781/tip` → **201**

```json
{
  "command_id": "97ed38e8-52ac-4810-8126-0bddae8c212a",
  "amount_minor": 1100
}
```

```json
{
  "id": "0d1099d5-18a8-4774-bbd3-bbfd90ab5eea",
  "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T08:43:34.090727Z"
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
  "session_id": "340c0966-7bc4-45f7-a0f1-e2f5050c6f4d",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MTQsImlhdCI6MTc5MzM0OTgxNCwianRpIjoiMDgzZjM5MjYtYzI5NS00Y2VlLTkzZDYtOWQzNjdhZTcyNzIyIiwic2lkIjoiMzQwYzA5NjYtN2JjNC00NWY3LWEwZjEtZTJmNTA1MGM2ZjRkIn0.cDbs9ifIOYKd5Bcc14kqLoioNWFBy8To_ONY8gbhOzc",
  "access_expires_at": "2026-10-30T08:58:34.676315534Z",
  "refresh_token": "Ypbr8S-aml0fSnSlMx8cS_WGoop_htGjjThyXtRZulQ",
  "refresh_expires_at": "2026-10-30T20:43:34.67553546Z",
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
          "STAFF": 1,
          "RIDER": 3,
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
      "STAFF": 1,
      "RIDER": 3,
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
  "generated_at": "2026-10-30T08:43:34.964707836Z"
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
  "generated_at": "2026-10-30T08:43:35.260261487Z"
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
  "session_id": "a4ca0842-85d6-48e7-9370-40d2535441a9",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MTUsImlhdCI6MTc5MzM0OTgxNSwianRpIjoiYjcwYmZjNGQtZjFlNi00MTJjLWEwMjctZjQ0ODE0Yjg3MjE1Iiwic2lkIjoiYTRjYTA4NDItODVkNi00OGU3LTkzNzAtNDBkMjUzNTQ0MWE5In0.hAVW1sGQf6x_nJGRBT-rUi1MqxhAr_sJkZc3KyzqO0E",
  "access_expires_at": "2026-10-30T08:58:35.855828465Z",
  "refresh_token": "p39vIOxFrz6RWOSs4CQqqOp4WSER7rFU_pLAijL9SpQ",
  "refresh_expires_at": "2026-10-30T20:43:35.855229378Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8fc50129-f242-412d-ab9c-188bb6d67781/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:42:36.087894Z",
      "actor": {
        "type": "CLIENT",
        "id": "5bc1a519-27fa-45b1-b829-da5303b4cd61",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
        "quote_id": "43279c1a-32c5-4bc0-93a4-ae45ae1be90a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "577d52d0-92d0-4cf9-b067-87520afc245d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:42:36.089711Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
        "attempt_id": "35c9acfc-8c5d-4c14-adaf-712f53eb0212",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "577d52d0-92d0-4cf9-b067-87520afc245d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:42:36.092735Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "167bb3cd-1a06-47fe-b574-d47980576bcc",
        "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "577d52d0-92d0-4cf9-b067-87520afc245d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:42:36.684033Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "167bb3cd-1a06-47fe-b574-d47980576bcc",
        "order_id": "8fc50129-f242-412d-ab9c-188bb6d67781",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "61e8c8b2-6f7c-46f6-9ed2-14a3f2df92da"
      },
      "correlation_id": "870e46ac-07ab-468a-9128-57ef25a675d1"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T08:43:36.423349375Z",
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
      "last_location_at": "2026-10-30T08:43:28.714354Z",
      "order_id": null
    }
  ]
}
```

Done: order 8fc50129-f242-412d-ab9c-188bb6d67781.

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
  "session_id": "1651cd6d-dc83-4460-8241-3296a4623fdf",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MTcsImlhdCI6MTc5MzM0OTgxNywianRpIjoiM2EyM2NlNjYtOTI2Zi00NDY1LTk0NjUtZmE4NzhhMzNkMWRmIiwic2lkIjoiMTY1MWNkNmQtZGM4My00NDYwLTgyNDEtMzI5NmE0NjIzZmRmIn0.0M-WxTwIg4DJTcQ461VokXcGXBj0xzht9deCbgvWNj4",
  "access_expires_at": "2026-10-30T08:58:37.020352053Z",
  "refresh_token": "cIU0X4zi5R1NILZqoAVBS2bRk4ggJGMPyySPSk9PEWo",
  "refresh_expires_at": "2026-10-30T20:43:37.019770338Z",
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
  "command_id": "8fa58e7f-bb52-4c4f-8ae7-1530ed3e2636",
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
  "timestamp": "2026-10-30T08:43:37.000+0000",
  "channel": {
    "id": "1730052000.2463024759",
    "linkedid": "1730052000.2463024759",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676448063"
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
  "timestamp": "2026-10-30T08:43:37.000+0000",
  "channel": {
    "id": "1730052000.2463024759",
    "linkedid": "1730052000.2463024759",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676448063"
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
  "session_id": "76d91227-c342-4806-9f3d-25ade1204662",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MTgsImlhdCI6MTc5MzM0OTgxOCwianRpIjoiOWMzYjk0ZWYtZGM2Zi00NGE3LWI0MjEtYzQyZTY3ZmY5MDVkIiwic2lkIjoiNzZkOTEyMjctYzM0Mi00ODA2LTlmM2QtMjVhZGUxMjA0NjYyIn0.5QoMe3FncUWzwVYIeHa7mCuSncJnk7VK00BAANK5PRg",
  "access_expires_at": "2026-10-30T08:58:38.227464288Z",
  "refresh_token": "qU8wumqbAyjVhMAOa31bmcnCBw9ROifowYsz0proBCI",
  "refresh_expires_at": "2026-10-30T20:43:38.226865694Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "f05c951c-5bec-468f-be82-45db3b65b6c3",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676448063",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:43:37Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/f05c951c-5bec-468f-be82-45db3b65b6c3/answer` → **200**

```json
{
  "command_id": "554e0eaa-4170-4925-8339-43ae98a63f8e"
}
```

```json
{
  "id": "f05c951c-5bec-468f-be82-45db3b65b6c3",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676448063",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "order_ids": [],
  "started_at": "2026-10-30T08:43:37Z",
  "answered_at": "2026-10-30T08:43:38.838271Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2463024759",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cab1cd9d-5540-4536-bd17-43a23918f663",
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
  "id": "73047b91-d790-4ddb-b0fa-ea50fc7b193d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:39.179287Z",
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
  "command_id": "141ed916-bb06-45e0-8393-08428e0bc047",
  "quote_id": "73047b91-d790-4ddb-b0fa-ea50fc7b193d",
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
    "phone": "+380676448063"
  },
  "call_id": "f05c951c-5bec-468f-be82-45db3b65b6c3"
}
```

```json
{
  "id": "2fbd6c8a-3c85-459f-b405-ca07bd709109",
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
  "created_at": "2026-10-30T08:43:39.477991Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676448063"
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
    "id": "1730052000.2463024759",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f05c951c-5bec-468f-be82-45db3b65b6c3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676448063",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [
        "2fbd6c8a-3c85-459f-b405-ca07bd709109"
      ],
      "started_at": "2026-10-30T08:43:37Z",
      "answered_at": "2026-10-30T08:43:38.838271Z",
      "ended_at": "2026-10-30T08:43:39.799233Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "e64fd3e2-884c-4896-b0b1-6981cedf7686",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675233167",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [],
      "started_at": "2026-10-30T08:38:08.981064Z",
      "answered_at": "2026-10-30T08:38:09.307544Z",
      "ended_at": "2026-10-30T08:38:09.623393Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:38:16.155893Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/2fbd6c8a-3c85-459f-b405-ca07bd709109` → **200**

```json
{
  "id": "2fbd6c8a-3c85-459f-b405-ca07bd709109",
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
  "created_at": "2026-10-30T08:43:39.477991Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676448063"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/2fbd6c8a-3c85-459f-b405-ca07bd709109` → **200**

```json
{
  "id": "2fbd6c8a-3c85-459f-b405-ca07bd709109",
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
  "created_at": "2026-10-30T08:43:39.477991Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676448063"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2fbd6c8a-3c85-459f-b405-ca07bd709109/cancel` → **200**

```json
{
  "command_id": "a86ccb16-a7d0-4b1d-b826-791de5f62757",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2fbd6c8a-3c85-459f-b405-ca07bd709109",
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
  "created_at": "2026-10-30T08:43:39.477991Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676448063"
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

Done: call f05c951c-5bec-468f-be82-45db3b65b6c3 with order 2fbd6c8a-3c85-459f-b405-ca07bd709109.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28009"
}
```

```json
{
  "challenge_id": "db89c671-1367-495e-8f22-e18051461a5f",
  "expires_at": "2026-10-30T08:48:41.045415885Z",
  "resend_available_at": "2026-10-30T08:43:42.045415885Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "554025",
  "sent_at": "2026-10-30T08:43:41.048355638Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db89c671-1367-495e-8f22-e18051461a5f",
  "code": "554025",
  "device_ref": "sandbox-28009"
}
```

```json
{
  "session_id": "0a8d9d25-a752-4089-9359-9e0ea8c7ef35",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDcyMSwiaWF0IjoxNzkzMzQ5ODIxLCJqdGkiOiIzMDRkZjhjMS0xYmY0LTQ5ZjQtYmIwNC0zZTA3ZDdhZTY2YmYiLCJzaWQiOiIwYThkOWQyNS1hNzUyLTQwODktOTM1OS05ZTBlYThjN2VmMzUifQ.WJYESAUPaIU7kQ27lC5pwctJt-T5ySujBCt2-5JN_as",
  "access_expires_at": "2026-10-30T08:58:41.376413398Z",
  "refresh_token": "MjOfMQlzy5IqnsoYROn2enFdoEyLVdKYGOjSr8oZzpA",
  "refresh_expires_at": "2026-11-29T08:43:41.37583543Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:43:28.714354Z",
  "last_location_at": "2026-10-30T08:43:28.714354Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/727c9450-71c7-424f-9c47-287e473fab1c/handover` → **200**

```json
{
  "command_id": "8f149610-1792-4da9-8416-e3906dfb16f5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:43:28.714354Z",
  "last_location_at": "2026-10-30T08:43:28.714354Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 85 s to the next point)

`POST /api/driver/v1/work-sessions/727c9450-71c7-424f-9c47-287e473fab1c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:45:07Z",
    "sequence": 1793349907248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:45:07.267415Z",
  "last_location_at": "2026-10-30T08:45:07.267415Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663707207",
  "device_ref": "sandbox-11181"
}
```

```json
{
  "challenge_id": "151afefd-3aa8-4248-a276-ac526bf5445c",
  "expires_at": "2026-10-30T08:50:07.549808258Z",
  "resend_available_at": "2026-10-30T08:45:08.549808258Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663707207` → **200**

```json
{
  "phone": "+380663707207",
  "audience": "CLIENT",
  "code": "293969",
  "sent_at": "2026-10-30T08:45:07.552853615Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "151afefd-3aa8-4248-a276-ac526bf5445c",
  "code": "293969",
  "device_ref": "sandbox-11181"
}
```

```json
{
  "session_id": "7730e469-d717-46ab-b9c2-3435d3c9ba19",
  "subject": {
    "type": "CLIENT",
    "id": "f428c0be-d1c3-4833-ae04-811be972a379"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNDI4YzBiZS1kMWMzLTQ4MzMtYWUwNC04MTFiZTk3MmEzNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODA3LCJpYXQiOjE3OTMzNDk5MDcsImp0aSI6ImRjZDgxN2QzLWZhMGQtNDAxNS04OGNlLWZiYzNiZTE3Mzg5ZCIsInNpZCI6Ijc3MzBlNDY5LWQ3MTctNDZhYi1iOWMyLTM0MzVkM2M5YmExOSJ9.0En9HkrFC9WUvk3zPeo2lwZE-lfsw3YcdrwMlu9yoHw",
  "access_expires_at": "2026-10-30T09:00:07.855988191Z",
  "refresh_token": "wXB12U8_onH80F9gkFhP0Ln71bSQfpegRXX-cYj4A0s",
  "refresh_expires_at": "2026-11-29T08:45:07.855303825Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a96095b4-d7c9-4d17-9ba1-8c7fc0a16743",
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
  "id": "dbaac8c3-ae69-4c95-bda8-35e2f440d11b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:50:08.151314Z",
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
  "command_id": "67f5eb1b-c76c-4c02-b563-168a44242bd9",
  "quote_id": "dbaac8c3-ae69-4c95-bda8-35e2f440d11b",
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
  "id": "ef368213-dc6e-4215-b680-cac75b4a0672",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f428c0be-d1c3-4833-ae04-811be972a379",
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
  "created_at": "2026-10-30T08:45:08.452509Z",
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
    "id": "3b737824-f9ab-4cd7-9d7a-35c50d547779",
    "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
    "expires_at": "2026-10-30T08:45:23.455756Z",
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

`POST /api/driver/v1/offers/3b737824-f9ab-4cd7-9d7a-35c50d547779/accept` → **200**

```json
{
  "command_id": "3940eb92-ba91-4bc4-8ac2-9372b0290e99"
}
```

```json
{
  "id": "7d171aae-65a7-488d-ab3f-ca4f2ed6347f",
  "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e2a0b8f3-d3ff-421c-9ea6-563ec1769407",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e2a0b8f3-d3ff-421c-9ea6-563ec1769407",
  "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
  "assignment_id": "7d171aae-65a7-488d-ab3f-ca4f2ed6347f",
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

`POST /api/driver/v1/work-sessions/727c9450-71c7-424f-9c47-287e473fab1c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:45:09Z",
    "sequence": 1793349909591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:45:09.610008Z",
  "last_location_at": "2026-10-30T08:45:09.610008Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e2a0b8f3-d3ff-421c-9ea6-563ec1769407/arrive` → **200**

```json
{
  "command_id": "04ee4773-2525-491d-beb2-565812fb2485",
  "expected_version": 0
}
```

```json
{
  "id": "e2a0b8f3-d3ff-421c-9ea6-563ec1769407",
  "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
  "assignment_id": "7d171aae-65a7-488d-ab3f-ca4f2ed6347f",
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
  "arrived_at": "2026-10-30T08:45:09.906894Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e2a0b8f3-d3ff-421c-9ea6-563ec1769407/start` → **200**

```json
{
  "command_id": "ef886b36-34c0-4325-868e-1d75b1e16c20",
  "expected_version": 1
}
```

```json
{
  "id": "e2a0b8f3-d3ff-421c-9ea6-563ec1769407",
  "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
  "assignment_id": "7d171aae-65a7-488d-ab3f-ca4f2ed6347f",
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
  "arrived_at": "2026-10-30T08:45:09.906894Z",
  "started_at": "2026-10-30T08:45:10.204566Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/727c9450-71c7-424f-9c47-287e473fab1c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:09Z",
    "sequence": 1793349969510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:46:09.528152Z",
  "last_location_at": "2026-10-30T08:46:09.528152Z",
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
  "device_ref": "sandbox-27347"
}
```

```json
{
  "challenge_id": "d715c2d9-4e40-44cc-9ddd-0b1bf23a5efa",
  "expires_at": "2026-10-30T08:51:09.812998033Z",
  "resend_available_at": "2026-10-30T08:46:10.812998033Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "468329",
  "sent_at": "2026-10-30T08:46:09.815688778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d715c2d9-4e40-44cc-9ddd-0b1bf23a5efa",
  "code": "468329",
  "device_ref": "sandbox-27347"
}
```

```json
{
  "session_id": "696da676-33ee-4b1a-9f9c-2a24cfd9a64c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDg3MCwiaWF0IjoxNzkzMzQ5OTcwLCJqdGkiOiJkMDQ2NmM4Yi02NThkLTRlMGItOGY0NS1mMTM5NDU0ZWM1M2QiLCJzaWQiOiI2OTZkYTY3Ni0zM2VlLTRiMWEtOWY5Yy0yYTI0Y2ZkOWE2NGMifQ.UXVQzKF37BIhEbYaSo4wW2BCnSzUew3IfUT2bOUB8Sg",
  "access_expires_at": "2026-10-30T09:01:10.119965283Z",
  "refresh_token": "jV47EYdsfjHY9v_7RZKZxszQ5Dpj878oDEghb0QOj0A",
  "refresh_expires_at": "2026-11-29T08:46:10.119399597Z",
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
  "command_id": "0b2063ee-a447-41b5-8ae2-dae601d514fe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:10Z",
    "sequence": 1793349970703
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5cdc10b0-41eb-4676-9dd0-194db1877fbd",
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
  "last_heartbeat_at": "2026-10-30T08:46:10.72238Z",
  "last_location_at": "2026-10-30T08:46:10.72238Z",
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
  "session_id": "1ed01a08-c7bd-4c39-918a-dd744fb276a6",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4NzEsImlhdCI6MTc5MzM0OTk3MSwianRpIjoiNDg5ODFkYzgtNTRlMC00MmY1LWFmOWItMzExNmExYzFjZWQxIiwic2lkIjoiMWVkMDFhMDgtYzdiZC00YzM5LTkxOGEtZGQ3NDRmYjI3NmE2In0.6QltI4Eh6MqxRS7eGPRA1APoofDqDiSgLrA11n9Od4I",
  "access_expires_at": "2026-10-30T09:01:11.30330583Z",
  "refresh_token": "DvnnhHgWZgYaa2_qQ95uY56FQOEKLBFsu9XoJp-Jd9w",
  "refresh_expires_at": "2026-10-30T20:46:11.302790679Z",
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
  "session_id": "f26bde58-2c5a-40ab-90c7-f186b85ef50b",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4NzEsImlhdCI6MTc5MzM0OTk3MSwianRpIjoiMDNlNWI2OTctZjg0ZC00YzIwLWJmNjUtODAwMDg3YmIyZGM3Iiwic2lkIjoiZjI2YmRlNTgtMmM1YS00MGFiLTkwYzctZjE4NmI4NWVmNTBiIn0.p21_xoF4mQDWu1wobrYio-lcUioFEGbx4xKcjG3w84M",
  "access_expires_at": "2026-10-30T09:01:11.878816864Z",
  "refresh_token": "McWZTan4a_4yxTHxv0yDJt25sU_NMv7z9yont1oRBg4",
  "refresh_expires_at": "2026-10-30T20:46:11.878236854Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ef368213-dc6e-4215-b680-cac75b4a0672` → **200**

```json
{
  "id": "ef368213-dc6e-4215-b680-cac75b4a0672",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f428c0be-d1c3-4833-ae04-811be972a379",
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
    "id": "7d171aae-65a7-488d-ab3f-ca4f2ed6347f",
    "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e2a0b8f3-d3ff-421c-9ea6-563ec1769407",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T08:45:08.452509Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ef368213-dc6e-4215-b680-cac75b4a0672/interrupt` → **200**

```json
{
  "command_id": "df3e896b-a9c5-475a-9c14-72c8c51e3d2c",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "ef368213-dc6e-4215-b680-cac75b4a0672",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "f428c0be-d1c3-4833-ae04-811be972a379",
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
      "id": "7d171aae-65a7-488d-ab3f-ca4f2ed6347f",
      "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "e2a0b8f3-d3ff-421c-9ea6-563ec1769407",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T08:45:08.452509Z",
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
    "id": "df90a026-039f-4c19-838f-358927194a9e",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "f428c0be-d1c3-4833-ae04-811be972a379",
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
    "id": "a6cbe2f9-6732-4fbb-906b-c618ba001c8b",
    "order_id": "df90a026-039f-4c19-838f-358927194a9e",
    "expires_at": "2026-10-30T08:46:27.4894Z",
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

`POST /api/driver/v1/offers/a6cbe2f9-6732-4fbb-906b-c618ba001c8b/accept` → **200**

```json
{
  "command_id": "967a1b67-b831-4bb7-85c4-f004a1e8c7e1"
}
```

```json
{
  "id": "371bf683-1d69-42b7-81e9-dc66ed47b44c",
  "order_id": "df90a026-039f-4c19-838f-358927194a9e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1cb01575-af97-49e0-87b4-5feb8589775e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1cb01575-af97-49e0-87b4-5feb8589775e",
  "order_id": "df90a026-039f-4c19-838f-358927194a9e",
  "assignment_id": "371bf683-1d69-42b7-81e9-dc66ed47b44c",
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
  "session_id": "5cdc10b0-41eb-4676-9dd0-194db1877fbd",
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
  "last_heartbeat_at": "2026-10-30T08:46:10.72238Z",
  "last_location_at": "2026-10-30T08:46:10.72238Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/5cdc10b0-41eb-4676-9dd0-194db1877fbd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:46:13Z",
    "sequence": 1793349973962
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5cdc10b0-41eb-4676-9dd0-194db1877fbd",
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
  "last_heartbeat_at": "2026-10-30T08:46:13.980146Z",
  "last_location_at": "2026-10-30T08:46:13.980146Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/1cb01575-af97-49e0-87b4-5feb8589775e/arrive` → **200**

```json
{
  "command_id": "29a26da5-e468-4fce-866b-42ad1e24031e",
  "expected_version": 0
}
```

```json
{
  "id": "1cb01575-af97-49e0-87b4-5feb8589775e",
  "order_id": "df90a026-039f-4c19-838f-358927194a9e",
  "assignment_id": "371bf683-1d69-42b7-81e9-dc66ed47b44c",
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
  "arrived_at": "2026-10-30T08:46:14.267408Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1cb01575-af97-49e0-87b4-5feb8589775e/start` → **200**

```json
{
  "command_id": "e5267e06-2be0-47b7-ac9b-6e41016f872c",
  "expected_version": 1
}
```

```json
{
  "id": "1cb01575-af97-49e0-87b4-5feb8589775e",
  "order_id": "df90a026-039f-4c19-838f-358927194a9e",
  "assignment_id": "371bf683-1d69-42b7-81e9-dc66ed47b44c",
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
  "arrived_at": "2026-10-30T08:46:14.267408Z",
  "started_at": "2026-10-30T08:46:14.569858Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1cb01575-af97-49e0-87b4-5feb8589775e/complete` → **200**

```json
{
  "command_id": "21c7220d-5cdc-4242-932f-199ae76f2951",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:46:14Z"
}
```

```json
{
  "id": "1cb01575-af97-49e0-87b4-5feb8589775e",
  "order_id": "df90a026-039f-4c19-838f-358927194a9e",
  "assignment_id": "371bf683-1d69-42b7-81e9-dc66ed47b44c",
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
  "arrived_at": "2026-10-30T08:46:14.267408Z",
  "started_at": "2026-10-30T08:46:14.569858Z",
  "completed_at": "2026-10-30T08:46:14.872809Z",
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
    "id": "df90a026-039f-4c19-838f-358927194a9e",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:46:12.478775Z",
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
    "id": "ef368213-dc6e-4215-b680-cac75b4a0672",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:45:08.452509Z",
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

`GET /api/operator/v1/orders/ef368213-dc6e-4215-b680-cac75b4a0672/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:45:08.45302Z",
      "actor": {
        "type": "CLIENT",
        "id": "f428c0be-d1c3-4833-ae04-811be972a379",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
        "quote_id": "dbaac8c3-ae69-4c95-bda8-35e2f440d11b",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "42b76db4-f991-482c-a123-d1dfb6b60798"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:45:08.454987Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
        "attempt_id": "928aabda-0ab5-4844-aafa-12ed84bee006",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "42b76db4-f991-482c-a123-d1dfb6b60798"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:45:08.457789Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3b737824-f9ab-4cd7-9d7a-35c50d547779",
        "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "42b76db4-f991-482c-a123-d1dfb6b60798"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:45:09.038642Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3b737824-f9ab-4cd7-9d7a-35c50d547779",
        "order_id": "ef368213-dc6e-4215-b680-cac75b4a0672",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7d171aae-65a7-488d-ab3f-ca4f2ed6347f"
      },
      "correlation_id": "83419131-b2c8-4da8-b5fc-0c2df9ec2bb0"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/df90a026-039f-4c19-838f-358927194a9e/tip` → **200**

```json
{
  "order_id": "df90a026-039f-4c19-838f-358927194a9e",
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
  "available_until": "2026-10-31T08:46:14.872809Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/df90a026-039f-4c19-838f-358927194a9e/tip` → **409**

```json
{
  "command_id": "272f90d8-7e01-408e-96e4-00ece9f0f20b",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/df90a026-039f-4c19-838f-358927194a9e/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "612b6658-5ecb-4837-92ce-5d96b0a02d1b"
}
```

Done: interrupted ef368213-dc6e-4215-b680-cac75b4a0672, follow-up df90a026-039f-4c19-838f-358927194a9e.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "727c9450-71c7-424f-9c47-287e473fab1c",
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
  "last_heartbeat_at": "2026-10-30T08:46:09.528152Z",
  "last_location_at": "2026-10-30T08:46:09.528152Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/727c9450-71c7-424f-9c47-287e473fab1c/close` → **200**

```json
{
  "command_id": "f79f92d4-8045-4f14-ae04-1ef0b17f7f51",
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
  "session_id": "5cdc10b0-41eb-4676-9dd0-194db1877fbd",
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
  "last_heartbeat_at": "2026-10-30T08:46:13.980146Z",
  "last_location_at": "2026-10-30T08:46:13.980146Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5cdc10b0-41eb-4676-9dd0-194db1877fbd/close` → **200**

```json
{
  "command_id": "7caa1754-e523-463b-b816-feb6bdea6395",
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
  "session_id": "66f529ae-49b8-4c72-aaf4-acfb289a91e2",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA4ODEsImlhdCI6MTc5MzM0OTk4MSwianRpIjoiODU1OTM1NmYtZWVkOS00N2ViLWJiNWEtNGE4NjlkOTQwZWJjIiwic2lkIjoiNjZmNTI5YWUtNDliOC00YzcyLWFhZjQtYWNmYjI4OWE5MWUyIn0.ZCOxOlOm0khwxZ9fuAVaQi0fiJn-9s2_HxhSbjL1u3M",
  "access_expires_at": "2026-10-30T09:01:21.129192084Z",
  "refresh_token": "Ex9UaocnOZIu7mjoOaaaua4kqmJ9BfQquUZ5UfvKv0w",
  "refresh_expires_at": "2026-10-30T20:46:21.128516633Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9146ceea-a7ae-41fb-a9c5-735c72c9cc41",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:46:21Z"
}
```

```json
{
  "id": "ffcff0eb-65d6-4485-93d9-1f74df0ae959",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:46:21Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/ffcff0eb-65d6-4485-93d9-1f74df0ae959/publish` → **200**

```json
{
  "command_id": "d01223a4-c93d-4b29-b094-cf96207fa30a",
  "expected_version": 0
}
```

```json
{
  "id": "ffcff0eb-65d6-4485-93d9-1f74df0ae959",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:46:21.736767Z",
  "published_at": "2026-10-30T08:46:21.736767Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "ffcff0eb-65d6-4485-93d9-1f74df0ae959",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T08:46:21.736767Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635158767",
  "device_ref": "sandbox-19261"
}
```

```json
{
  "challenge_id": "7d08f15e-6adb-480b-8817-29d9274b7cfb",
  "expires_at": "2026-10-30T08:51:22.299600478Z",
  "resend_available_at": "2026-10-30T08:46:23.299600478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635158767` → **200**

```json
{
  "phone": "+380635158767",
  "audience": "CLIENT",
  "code": "700229",
  "sent_at": "2026-10-30T08:46:22.30235287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d08f15e-6adb-480b-8817-29d9274b7cfb",
  "code": "700229",
  "device_ref": "sandbox-19261"
}
```

```json
{
  "session_id": "a842d8a1-e9fd-4604-b6c1-17cf3ff0070e",
  "subject": {
    "type": "CLIENT",
    "id": "7898ad7f-eaf8-4552-b357-12b39884024a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ODk4YWQ3Zi1lYWY4LTQ1NTItYjM1Ny0xMmIzOTg4NDAyNGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwODgyLCJpYXQiOjE3OTMzNDk5ODIsImp0aSI6ImJkZmY3ODkzLTQ2MDgtNGYxMS04MGI5LTU3OWFhNmEzOTlkYSIsInNpZCI6ImE4NDJkOGExLWU5ZmQtNDYwNC1iNmMxLTE3Y2YzZmYwMDcwZSJ9.J8PAgAOOfEuEiudL7A7orW70tqNRrtqM2rAOfJOVVmg",
  "access_expires_at": "2026-10-30T09:01:22.615100227Z",
  "refresh_token": "F_UPCxC0JT_8Oupk83vY0e7PX4zXJibIrLIMgj9QafI",
  "refresh_expires_at": "2026-11-29T08:46:22.614529363Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "ffcff0eb-65d6-4485-93d9-1f74df0ae959",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T08:46:21.736767Z",
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
  "command_id": "3a7a9617-efcf-467a-916f-6da456402b1a",
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
  "id": "27f314c7-0740-4fbe-a53d-5f628cbab78b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:23.192692Z",
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
  "command_id": "d3511657-0303-4644-a629-a63127ca459d",
  "quote_id": "27f314c7-0740-4fbe-a53d-5f628cbab78b",
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
  "correlation_id": "5f261678-4457-4d05-9058-2e4f4d6c9e65"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "d9e2ec08-2c99-444d-9aa8-ebe3e9d8d578",
  "version_id": "ffcff0eb-65d6-4485-93d9-1f74df0ae959",
  "language": "uk"
}
```

```json
{
  "version_id": "ffcff0eb-65d6-4485-93d9-1f74df0ae959",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T08:46:23.789246Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e95063e1-e3fd-4b16-9476-ba8ca0289303",
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
  "id": "7cc7e30b-b666-4627-a848-75958a43ff00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:51:24.076487Z",
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
  "command_id": "e1500d6b-e72f-4916-b006-762438733d2a",
  "quote_id": "7cc7e30b-b666-4627-a848-75958a43ff00",
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
  "id": "b3187adb-dd78-4506-9384-d6ef90da9246",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7898ad7f-eaf8-4552-b357-12b39884024a",
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
  "created_at": "2026-10-30T08:46:24.375307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b3187adb-dd78-4506-9384-d6ef90da9246` → **200**

```json
{
  "id": "b3187adb-dd78-4506-9384-d6ef90da9246",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7898ad7f-eaf8-4552-b357-12b39884024a",
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
  "created_at": "2026-10-30T08:46:24.375307Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b3187adb-dd78-4506-9384-d6ef90da9246/cancel` → **200**

```json
{
  "command_id": "97fafd6c-7750-4406-912f-2ac5f221f11c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b3187adb-dd78-4506-9384-d6ef90da9246",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7898ad7f-eaf8-4552-b357-12b39884024a",
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
  "created_at": "2026-10-30T08:46:24.375307Z",
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

`POST /api/admin/v1/legal-documents/ffcff0eb-65d6-4485-93d9-1f74df0ae959` → **409**

```json
{
  "command_id": "0dcf5781-a284-47e2-a171-bf220048a372",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:46:25Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/ffcff0eb-65d6-4485-93d9-1f74df0ae959",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d9947311-a75c-4c06-9459-203de295f56d"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5825193b-6279-4e79-a2f9-fe0597086623",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:46:25Z"
}
```

```json
{
  "id": "96b630d6-6270-4869-a003-10628c17cc23",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:46:25Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/96b630d6-6270-4869-a003-10628c17cc23/publish` → **200**

```json
{
  "command_id": "2e23091a-efa2-491d-83be-f95a658967c6",
  "expected_version": 0
}
```

```json
{
  "id": "96b630d6-6270-4869-a003-10628c17cc23",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:46:25.906446Z",
  "published_at": "2026-10-30T08:46:25.906446Z",
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
  "device_ref": "sandbox-17057"
}
```

```json
{
  "challenge_id": "03b01526-a3e5-4585-a935-a1cb717970ba",
  "expires_at": "2026-10-30T08:51:26.202600661Z",
  "resend_available_at": "2026-10-30T08:46:27.202600661Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "066722",
  "sent_at": "2026-10-30T08:46:26.205157992Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03b01526-a3e5-4585-a935-a1cb717970ba",
  "code": "066722",
  "device_ref": "sandbox-17057"
}
```

```json
{
  "session_id": "c6183f17-df5e-4065-9db8-dc322bb9217d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDg4NiwiaWF0IjoxNzkzMzQ5OTg2LCJqdGkiOiJiOGNmYWQ0MC1lZjEyLTQ5ZDgtOWQwZS04MWRkMGI2YjBkN2QiLCJzaWQiOiJjNjE4M2YxNy1kZjVlLTQwNjUtOWRiOC1kYzMyMmJiOTIxN2QifQ.1bss3Ut2t30SWkrQ4vjs2ZAuwHXe-S_6a5urkgyjwAA",
  "access_expires_at": "2026-10-30T09:01:26.510016942Z",
  "refresh_token": "TqopMXdJWdWJX5wGL5aPA_ifSAHczPxHST6_OKLQJmU",
  "refresh_expires_at": "2026-11-29T08:46:26.50943136Z",
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
  "command_id": "fdce517f-d044-4a16-a4b7-655b0f37298a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:47:37Z",
    "sequence": 1793350057108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "50f7fdc2-c6f0-477c-b2a2-2dbcbd3624b4",
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
  "last_heartbeat_at": "2026-10-30T08:47:37.127059Z",
  "last_location_at": "2026-10-30T08:47:37.127059Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676466163",
  "device_ref": "sandbox-18353"
}
```

```json
{
  "challenge_id": "4291cf3a-304d-433e-98a6-637ed3b1e8c1",
  "expires_at": "2026-10-30T08:52:37.412199645Z",
  "resend_available_at": "2026-10-30T08:47:38.412199645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676466163` → **200**

```json
{
  "phone": "+380676466163",
  "audience": "CLIENT",
  "code": "635862",
  "sent_at": "2026-10-30T08:47:37.41490604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4291cf3a-304d-433e-98a6-637ed3b1e8c1",
  "code": "635862",
  "device_ref": "sandbox-18353"
}
```

```json
{
  "session_id": "181d7533-e59a-41e9-b791-94bcea5bbdad",
  "subject": {
    "type": "CLIENT",
    "id": "3e50c2df-5444-4525-baf1-34bece20cd49"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTUwYzJkZi01NDQ0LTQ1MjUtYmFmMS0zNGJlY2UyMGNkNDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTU3LCJpYXQiOjE3OTMzNTAwNTcsImp0aSI6IjBlNjAyNmU5LTlhZWItNDMyOS04NDgxLWMwMjZhZDQ5NGQ3ZCIsInNpZCI6IjE4MWQ3NTMzLWU1OWEtNDFlOS1iNzkxLTk0YmNlYTViYmRhZCJ9.0EU_Ig7eFY0EatvSEL4spKw1OAIuFS5_spoRDyzsl8I",
  "access_expires_at": "2026-10-30T09:02:37.721089417Z",
  "refresh_token": "6c2KvUkE9BsbzKGrqd75eI2TcPG9uLqdn1041rXYd7I",
  "refresh_expires_at": "2026-11-29T08:47:37.72059218Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6c863c6b-7b08-440a-8709-8eda03b3c908",
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
  "id": "e64ad938-bed1-411e-b6d1-2b15001f1c11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:38.011658Z",
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
  "command_id": "9692cb19-301e-4528-bcf1-438a1ce0941c",
  "quote_id": "e64ad938-bed1-411e-b6d1-2b15001f1c11",
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
    "phone": "+380672938280"
  }
}
```

```json
{
  "id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:47:38.304182Z",
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
    "id": "6dd7f8b9-b1e9-44d3-af36-9f70a087a371",
    "order_id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
    "expires_at": "2026-10-30T08:47:53.308171Z",
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

`POST /api/driver/v1/offers/6dd7f8b9-b1e9-44d3-af36-9f70a087a371/accept` → **200**

```json
{
  "command_id": "e75bc30e-b4ae-488d-b620-c840cb168448"
}
```

```json
{
  "id": "c5d4c457-1875-4f02-afd1-15d909085701",
  "order_id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aaf159d1-208a-4975-b5ba-410160f7cde0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aaf159d1-208a-4975-b5ba-410160f7cde0",
  "order_id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
  "assignment_id": "c5d4c457-1875-4f02-afd1-15d909085701",
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
    "phone": "+380672938280"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d33daea0-c244-4d43-a9fc-657a9e73e2b0",
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
  "id": "17de948d-483c-4021-b979-e6d25fc6af82",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:39.482775Z",
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
  "command_id": "02a46f85-1110-4b32-84e0-25a3b18e5dbe",
  "quote_id": "17de948d-483c-4021-b979-e6d25fc6af82",
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
  "id": "f9746aca-205b-4bba-9c90-ff31431b1f40",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:47:39.779958Z",
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
  "command_id": "a9f51fe7-a958-49f4-bc4d-df3c7bf7d41b",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T11:47:40Z"
}
```

```json
{
  "id": "1e6a59c5-7f06-4c81-9817-7f0ad22fe5d9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:40.098326Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:47:40Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b7484141-437f-4bc0-b2fc-bdce6d31e413",
  "quote_id": "1e6a59c5-7f06-4c81-9817-7f0ad22fe5d9",
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
  "pickup_at": "2026-10-30T11:47:40Z"
}
```

```json
{
  "id": "fb56e721-9d25-4b2d-9ff9-2ff170d744d2",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:47:40.398874Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:47:40Z",
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
  "command_id": "d42d299e-74b6-4957-9533-41191c5d1cb6",
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
  "id": "9551f170-aab1-4eea-b339-d65b6d17321a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:40.717511Z",
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
  "command_id": "959d701f-fc5e-4b12-ae5e-f2dd5c8d3ab0",
  "quote_id": "9551f170-aab1-4eea-b339-d65b6d17321a",
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
  "correlation_id": "95cf0e63-e452-4215-9732-9d0d6f11d265"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "fb56e721-9d25-4b2d-9ff9-2ff170d744d2",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T08:47:40.398874Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T11:47:40Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f9746aca-205b-4bba-9c90-ff31431b1f40",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T08:47:39.779958Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "f9746aca-205b-4bba-9c90-ff31431b1f40",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:47:39.779958Z",
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

`GET /api/rider/v1/orders/8877960a-06e6-4fff-8bef-b7ab7d95c86a` → **200**

```json
{
  "id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c5d4c457-1875-4f02-afd1-15d909085701",
    "order_id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "aaf159d1-208a-4975-b5ba-410160f7cde0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:47:38.304182Z",
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
    "location_at": "2026-10-30T08:47:37.127059Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/8877960a-06e6-4fff-8bef-b7ab7d95c86a/cancel` → **200**

```json
{
  "command_id": "b64accba-a5b3-4177-bec6-c0c2e21e4884",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c5d4c457-1875-4f02-afd1-15d909085701",
    "order_id": "8877960a-06e6-4fff-8bef-b7ab7d95c86a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "aaf159d1-208a-4975-b5ba-410160f7cde0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:47:38.304182Z",
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

`GET /api/rider/v1/orders/f9746aca-205b-4bba-9c90-ff31431b1f40` → **200**

```json
{
  "id": "f9746aca-205b-4bba-9c90-ff31431b1f40",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:47:39.779958Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f9746aca-205b-4bba-9c90-ff31431b1f40/cancel` → **200**

```json
{
  "command_id": "e5da464b-7a91-4198-8de7-05d72d23fbdd",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f9746aca-205b-4bba-9c90-ff31431b1f40",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:47:39.779958Z",
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

`GET /api/rider/v1/orders/fb56e721-9d25-4b2d-9ff9-2ff170d744d2` → **200**

```json
{
  "id": "fb56e721-9d25-4b2d-9ff9-2ff170d744d2",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:47:40.398874Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:47:40Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fb56e721-9d25-4b2d-9ff9-2ff170d744d2/cancel` → **200**

```json
{
  "command_id": "d1b80c22-f44a-4ab0-b30e-f622b6289f59",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fb56e721-9d25-4b2d-9ff9-2ff170d744d2",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3e50c2df-5444-4525-baf1-34bece20cd49",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:47:40.398874Z",
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
  "pickup_at": "2026-10-30T11:47:40Z",
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
  "session_id": "50f7fdc2-c6f0-477c-b2a2-2dbcbd3624b4",
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
  "last_heartbeat_at": "2026-10-30T08:47:37.127059Z",
  "last_location_at": "2026-10-30T08:47:37.127059Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/50f7fdc2-c6f0-477c-b2a2-2dbcbd3624b4/close` → **200**

```json
{
  "command_id": "edcfdf58-735b-4346-893c-730d6f2075bd",
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

Done: orders 8877960a-06e6-4fff-8bef-b7ab7d95c86a, f9746aca-205b-4bba-9c90-ff31431b1f40, fb56e721-9d25-4b2d-9ff9-2ff170d744d2.

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
  "session_id": "fafbb732-c457-4257-b256-a97da380e040",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NjQsImlhdCI6MTc5MzM1MDA2NCwianRpIjoiZGRiOTZiMjktZjM4Yi00NGUyLWEwMDUtMzM0ZWY2ZGNlMmZjIiwic2lkIjoiZmFmYmI3MzItYzQ1Ny00MjU3LWIyNTYtYTk3ZGEzODBlMDQwIn0.x5TUhlxUbgJWk_rvzUqU5YqPJljD6K6ZNZVQj7IqDhE",
  "access_expires_at": "2026-10-30T09:02:44.59487179Z",
  "refresh_token": "r_kzYtTb-hCoDQGnEKX99TBkyxxlsHhYB8TWsiysVSU",
  "refresh_expires_at": "2026-10-30T20:47:44.594321694Z",
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
  "session_id": "6966b4e9-142c-4bb4-a179-0bc7cfe6defa",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NjUsImlhdCI6MTc5MzM1MDA2NSwianRpIjoiNWFhYWIxNmYtZDJkZS00Nzg2LWFmYjEtNmI4YTMzYTdlMjE5Iiwic2lkIjoiNjk2NmI0ZTktMTQyYy00YmI0LWExNzktMGJjN2NmZTZkZWZhIn0.qywAb_ysu1it-nxvb9BNCabgP6qkMGjnU4x6uFrDgm4",
  "access_expires_at": "2026-10-30T09:02:45.158949344Z",
  "refresh_token": "nJilByye2SQUnNmW2fFzH_lgdMdpn0gcdZ71-z4UW8Q",
  "refresh_expires_at": "2026-10-30T20:47:45.158355216Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2253"
}
```

```json
{
  "challenge_id": "bb4990cb-d546-46cf-9d6a-2948c6e2ea4f",
  "expires_at": "2026-10-30T08:52:45.433258495Z",
  "resend_available_at": "2026-10-30T08:47:46.433258495Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "112751",
  "sent_at": "2026-10-30T08:47:45.436202815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb4990cb-d546-46cf-9d6a-2948c6e2ea4f",
  "code": "112751",
  "device_ref": "sandbox-2253"
}
```

```json
{
  "session_id": "721ddef9-dc56-46b4-af8f-1524c187c81b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDk2NSwiaWF0IjoxNzkzMzUwMDY1LCJqdGkiOiIzOGJkZDJjOC01MWJjLTQyNTUtOTcyOS1hNjBiNjZjZmQyNmIiLCJzaWQiOiI3MjFkZGVmOS1kYzU2LTQ2YjQtYWY4Zi0xNTI0YzE4N2M4MWIifQ.o2lBTc6GZCL9CMnxYoNgQCDQFzGdqRgqzbTFdFzvZJc",
  "access_expires_at": "2026-10-30T09:02:45.747490088Z",
  "refresh_token": "hmFyH8fM7HwbBuI5tN6d-E3S0RtrUC7A_hDa0Mh4sTA",
  "refresh_expires_at": "2026-11-29T08:47:45.746785109Z",
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
  "command_id": "2c146c89-17ef-4583-8627-1671cfd5bd68",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:47:46Z",
    "sequence": 1793350066325
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "537170cd-404d-45df-8b76-6bb5db60e911",
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
  "last_heartbeat_at": "2026-10-30T08:47:46.344008Z",
  "last_location_at": "2026-10-30T08:47:46.344008Z",
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
  "command_id": "dd7e5f20-2e59-42a5-8997-be10dbdc427b",
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
  "effective_at": "2026-10-30T08:47:46.938449Z",
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T08:38:23.936166Z",
  "last_entries": [
    {
      "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:38:23.936166Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "028042dd-7da7-4acb-9cdd-9b119a04bde5",
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
  "id": "10bae90a-f0bf-42e1-9cf0-1b25e4b8e171",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:47.518911Z",
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
  "command_id": "1f8f2cb4-cca8-4956-8e25-4d59d6f12c11",
  "quote_id": "10bae90a-f0bf-42e1-9cf0-1b25e4b8e171",
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
    "phone": "+380671111661"
  }
}
```

```json
{
  "id": "68e00f64-2a63-4a78-9594-390bd1abef78",
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
  "created_at": "2026-10-30T08:47:47.809047Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111661"
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
    "id": "dbe49c95-7cee-49c1-81a2-fe5aa310b221",
    "order_id": "68e00f64-2a63-4a78-9594-390bd1abef78",
    "expires_at": "2026-10-30T08:48:02.812588Z",
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

`POST /api/driver/v1/offers/dbe49c95-7cee-49c1-81a2-fe5aa310b221/accept` → **200**

```json
{
  "command_id": "9b806ccc-f95e-41b5-a36c-a6c27a9e57b9"
}
```

```json
{
  "id": "26849306-f83b-4569-86d3-01e3663f3f2a",
  "order_id": "68e00f64-2a63-4a78-9594-390bd1abef78",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e221a20-36d6-4edc-9572-0b80ba28cedb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e221a20-36d6-4edc-9572-0b80ba28cedb",
  "order_id": "68e00f64-2a63-4a78-9594-390bd1abef78",
  "assignment_id": "26849306-f83b-4569-86d3-01e3663f3f2a",
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
    "phone": "+380671111661"
  }
}
```

`POST /api/driver/v1/work-sessions/537170cd-404d-45df-8b76-6bb5db60e911/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:47:48Z",
    "sequence": 1793350068982
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "537170cd-404d-45df-8b76-6bb5db60e911",
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
  "last_heartbeat_at": "2026-10-30T08:47:48.999713Z",
  "last_location_at": "2026-10-30T08:47:48.999713Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0e221a20-36d6-4edc-9572-0b80ba28cedb/arrive` → **200**

```json
{
  "command_id": "35748a8e-780f-4325-afcd-679c214bfb8b",
  "expected_version": 0
}
```

```json
{
  "id": "0e221a20-36d6-4edc-9572-0b80ba28cedb",
  "order_id": "68e00f64-2a63-4a78-9594-390bd1abef78",
  "assignment_id": "26849306-f83b-4569-86d3-01e3663f3f2a",
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
  "arrived_at": "2026-10-30T08:47:49.282949Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111661"
  }
}
```

`POST /api/driver/v1/trips/0e221a20-36d6-4edc-9572-0b80ba28cedb/start` → **200**

```json
{
  "command_id": "b4ff32c3-b762-4a38-b3fb-73faed747491",
  "expected_version": 1
}
```

```json
{
  "id": "0e221a20-36d6-4edc-9572-0b80ba28cedb",
  "order_id": "68e00f64-2a63-4a78-9594-390bd1abef78",
  "assignment_id": "26849306-f83b-4569-86d3-01e3663f3f2a",
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
  "arrived_at": "2026-10-30T08:47:49.282949Z",
  "started_at": "2026-10-30T08:47:49.588034Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111661"
  }
}
```

`POST /api/driver/v1/trips/0e221a20-36d6-4edc-9572-0b80ba28cedb/complete` → **200**

```json
{
  "command_id": "de275ca2-e5d4-4a88-a703-5c4c4d3b7100",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:47:49Z",
  "cash_received": true
}
```

```json
{
  "id": "0e221a20-36d6-4edc-9572-0b80ba28cedb",
  "order_id": "68e00f64-2a63-4a78-9594-390bd1abef78",
  "assignment_id": "26849306-f83b-4569-86d3-01e3663f3f2a",
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
  "arrived_at": "2026-10-30T08:47:49.282949Z",
  "started_at": "2026-10-30T08:47:49.588034Z",
  "completed_at": "2026-10-30T08:47:49.889148Z",
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
  "command_id": "a60b3970-8176-4810-b5ad-83f16086e910",
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
  "id": "f40a4683-ceff-45c3-a04a-7dd013f2fa0b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:52:50.192221Z",
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
  "command_id": "39733425-6979-4d36-8936-9eb3f3757eba",
  "quote_id": "f40a4683-ceff-45c3-a04a-7dd013f2fa0b",
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
    "phone": "+3806711118990"
  }
}
```

```json
{
  "id": "161f9662-e11c-4ae4-84b1-fde6d3d2f3e1",
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
  "created_at": "2026-10-30T08:47:50.504359Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118990"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/161f9662-e11c-4ae4-84b1-fde6d3d2f3e1` → **200**

```json
{
  "id": "161f9662-e11c-4ae4-84b1-fde6d3d2f3e1",
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
  "created_at": "2026-10-30T08:47:50.504359Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118990"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/161f9662-e11c-4ae4-84b1-fde6d3d2f3e1/cancel` → **200**

```json
{
  "command_id": "6852f941-11ba-409a-82bb-c4cea454d4c1",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "161f9662-e11c-4ae4-84b1-fde6d3d2f3e1",
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
  "created_at": "2026-10-30T08:47:50.504359Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118990"
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
  "staff_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T08:38:23.936166Z",
  "last_entries": [
    {
      "order_id": "161f9662-e11c-4ae4-84b1-fde6d3d2f3e1",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T08:47:51.141852Z"
    },
    {
      "order_id": "68e00f64-2a63-4a78-9594-390bd1abef78",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T08:47:49.894038Z"
    },
    {
      "order_id": "16ebceaf-90bf-4848-a4fc-211a0dcb816b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:38:23.936166Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "537170cd-404d-45df-8b76-6bb5db60e911",
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
  "last_heartbeat_at": "2026-10-30T08:47:48.999713Z",
  "last_location_at": "2026-10-30T08:47:48.999713Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/537170cd-404d-45df-8b76-6bb5db60e911/close` → **200**

```json
{
  "command_id": "f54a2187-4007-4e9f-9aec-8b15000d79c1",
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

Done: operator bonus for fulfilled 68e00f64-2a63-4a78-9594-390bd1abef78 and operator-fault cancellation 161f9662-e11c-4ae4-84b1-fde6d3d2f3e1.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677072409",
  "device_ref": "sandbox-5384"
}
```

```json
{
  "challenge_id": "20f18db8-fd64-41b8-a7cb-1422f9e8871b",
  "expires_at": "2026-10-30T08:52:55.571124585Z",
  "resend_available_at": "2026-10-30T08:47:56.571124585Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677072409` → **200**

```json
{
  "phone": "+380677072409",
  "audience": "CLIENT",
  "code": "712418",
  "sent_at": "2026-10-30T08:47:55.573880265Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671336199",
  "device_ref": "sandbox-6415",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "11318543-50e4-4148-8ea3-9ed444ee7bb3",
  "expires_at": "2026-10-30T08:52:57.07987661Z",
  "resend_available_at": "2026-10-30T08:47:58.07987661Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671336199` → **200**

```json
{
  "phone": "+380671336199",
  "audience": "CLIENT",
  "code": "232140",
  "sent_at": "2026-10-30T08:47:57.082893776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671336199",
  "device_ref": "sandbox-17273",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "7cb6e84c-77fc-4912-8bce-45382068ff0c",
  "expires_at": "2026-10-30T08:52:58.58740691Z",
  "resend_available_at": "2026-10-30T08:47:59.58740691Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380671336199` → **200**

```json
{
  "phone": "+380671336199",
  "audience": "CLIENT",
  "code": "434086",
  "sent_at": "2026-10-30T08:47:58.590077999Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675860000",
  "device_ref": "sandbox-28732"
}
```

```json
{
  "challenge_id": "2763444a-b5a8-4fb2-a895-d38fa0614b67",
  "expires_at": "2026-10-30T08:53:00.11275483Z",
  "resend_available_at": "2026-10-30T08:48:01.11275483Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675860000",
  "device_ref": "sandbox-22175"
}
```

```json
{
  "challenge_id": "b68452a0-0874-4931-80db-da3f06cba759",
  "expires_at": "2026-10-30T08:53:01.597836139Z",
  "resend_available_at": "2026-10-30T08:48:02.597836139Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675860000` → **200**

```json
{
  "phone": "+380675860000",
  "audience": "CLIENT",
  "code": "870338",
  "sent_at": "2026-10-30T08:48:01.600708244Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675860000",
  "device_ref": "sandbox-20420",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "983fd746-08e3-4405-9b02-0a1a152ba18f",
  "expires_at": "2026-10-30T08:53:03.119356031Z",
  "resend_available_at": "2026-10-30T08:48:04.119356031Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675860000` → **200**

```json
{
  "phone": "+380675860000",
  "audience": "CLIENT",
  "code": "608576",
  "sent_at": "2026-10-30T08:48:03.122169048Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675860000",
  "device_ref": "sandbox-3024",
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
  "correlation_id": "e14784b9-3a28-4faa-b22f-95a48a4cae8d",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000019592"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "d7702e73-fc3a-477c-acfe-adc42a7dbaaa"
}
```

`GET /sandbox/v1/otp?phone=%2B442000019592` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120020882"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "56d6f8e6-bf25-4e84-abb4-9b60a613152b"
}
```

`GET /sandbox/v1/otp?phone=%2B37120020882` → **404**

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
  "session_id": "d5a9e15d-2d71-4860-af47-6ba3fadbdd6d",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5ODUsImlhdCI6MTc5MzM1MDA4NSwianRpIjoiNTEzNWJmNzUtMzAyOC00Y2ZhLTg2M2EtMGZkMDQzYjYxZTg1Iiwic2lkIjoiZDVhOWUxNWQtMmQ3MS00ODYwLWFmNDctNmJhM2ZhZGJkZDZkIn0.SEZNjVv97BdhKM9rgCE21Hwmfmj7s4oXcU1nT7yJPOI",
  "access_expires_at": "2026-10-30T09:03:05.842343527Z",
  "refresh_token": "nLGOPK9Kk9jguWlfxW5FP-FMtZDLOS5jnXp-ayhFqoQ",
  "refresh_expires_at": "2026-10-30T20:48:05.841799733Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675860000` → **200**

```json
{
  "deliveries": [
    {
      "id": "f031dd5a-e8bd-4c45-98b5-deba9cf6c504",
      "challenge_id": "983fd746-08e3-4405-9b02-0a1a152ba18f",
      "phone": "+380675860000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b78036a8-841a-4a7b-ac61-c5ba9645fed2",
      "error": null,
      "attempted_at": "2026-10-30T08:48:03.122631Z"
    },
    {
      "id": "099d4f5c-5603-4538-aff0-c888e51e17cd",
      "challenge_id": "b68452a0-0874-4931-80db-da3f06cba759",
      "phone": "+380675860000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4d3ed767-3e18-4a52-b8b1-aac174a39be3",
      "error": null,
      "attempted_at": "2026-10-30T08:48:01.600958Z"
    },
    {
      "id": "17b0dac7-851f-4e58-a16e-f8d9e25c05ad",
      "challenge_id": "2763444a-b5a8-4fb2-a895-d38fa0614b67",
      "phone": "+380675860000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T08:48:00.115554Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675860000` → **200**

```json
{
  "phone": "+380675860000",
  "audience": "CLIENT",
  "code": "608576",
  "sent_at": "2026-10-30T08:48:03.122169048Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671336199` → **200**

```json
{
  "deliveries": [
    {
      "id": "c75fad6f-4164-4573-b6db-c5ffe72c7dd6",
      "challenge_id": "7cb6e84c-77fc-4912-8bce-45382068ff0c",
      "phone": "+380671336199",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-38c8f4e4-90f6-4928-944d-1263de66dff7",
      "error": null,
      "attempted_at": "2026-10-30T08:47:58.590552Z"
    },
    {
      "id": "01ce183f-2759-41e8-a219-dc9fb9f53cb6",
      "challenge_id": "11318543-50e4-4148-8ea3-9ed444ee7bb3",
      "phone": "+380671336199",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9574ad92-00f1-43d3-b4c6-b2973b884d0d",
      "error": null,
      "attempted_at": "2026-10-30T08:47:57.083133Z"
    }
  ]
}
```

Done: SMS to +380677072409; SMS then a call to +380671336199; a failed SMS, two calls and a refused third to +380675860000; +44 and +371 refused.

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
  "session_id": "d566db12-f820-4f1c-a2f2-b355bb63d4ff",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5ODcsImlhdCI6MTc5MzM1MDA4NywianRpIjoiNjg1ZTViZjctYmVlYy00NTMzLWEyMjYtNjQxYTI3YmI0MmY0Iiwic2lkIjoiZDU2NmRiMTItZjgyMC00ZjFjLWEyZjItYjM1NWJiNjNkNGZmIn0.9YIkMfcuepe0At-ZX8xPX0KZ3tbYH2JzMcBJ9S94Cg0",
  "access_expires_at": "2026-10-30T09:03:07.045956679Z",
  "refresh_token": "shlprV94gjkhjai04O9eN1go4LG3knL-lGSFnNT6CDI",
  "refresh_expires_at": "2026-10-30T20:48:07.045333056Z",
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
  "session_id": "5243068b-1360-499f-81a3-17c2f344751d",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5ODcsImlhdCI6MTc5MzM1MDA4NywianRpIjoiZTg4ZjQwMTUtMTMxOS00N2QxLWEyNzktNjY2NTU1MzM4YTEwIiwic2lkIjoiNTI0MzA2OGItMTM2MC00OTlmLTgxYTMtMTdjMmYzNDQ3NTFkIn0.ndnh5YgOmkDnObbH7kPyxeX60tHig2o8RXp-39U_7QA",
  "access_expires_at": "2026-10-30T09:03:07.617122287Z",
  "refresh_token": "bxvYBedk75fDt0UpJvHEaCkdFfqTu_T9I5gxKvuY9p4",
  "refresh_expires_at": "2026-10-30T20:48:07.616626252Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
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

`POST /api/admin/v1/staff-extensions/e34ab6b0-7b69-47fc-8eb4-011d0a4d993a` → **200**

```json
{
  "command_id": "879f09f5-9044-467f-9a86-2a4e9eff1d9b",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "28b62717-2c1a-4832-b3e3-ddbe9174bbdd",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:48:08.775615Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:48:08.775615Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3dc7c450-e1dd-4097-853f-8b3b0361c599",
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
  "id": "86a65e97-1125-4190-b973-5f989c47cc26",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:53:09.359515Z",
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
  "command_id": "cfcba978-4a75-4544-95e7-6d38f1f1c8bb",
  "quote_id": "86a65e97-1125-4190-b973-5f989c47cc26",
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
    "phone": "+380674228324"
  }
}
```

```json
{
  "id": "5366711d-337e-4181-a0bd-908236527766",
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
  "created_at": "2026-10-30T08:48:09.657745Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674228324"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/5366711d-337e-4181-a0bd-908236527766/calls` → **201**

```json
{
  "command_id": "cfc57344-25cf-43bb-92f0-f3281b3de622",
  "to": "CALLER"
}
```

```json
{
  "id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "order_ids": [
    "5366711d-337e-4181-a0bd-908236527766"
  ],
  "started_at": "2026-10-30T08:48:09.99605Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/5366711d-337e-4181-a0bd-908236527766/calls` → **201**

```json
{
  "command_id": "cfc57344-25cf-43bb-92f0-f3281b3de622",
  "to": "CALLER"
}
```

```json
{
  "id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "order_ids": [
    "5366711d-337e-4181-a0bd-908236527766"
  ],
  "started_at": "2026-10-30T08:48:09.99605Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674228324",
    "at": "2026-10-30T08:48:09.998215088Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.27990",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "3e656147-4a0f-4d6d-b343-e2b50a044dd8"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=5366711d-337e-4181-a0bd-908236527766` → **200**

```json
{
  "calls": [
    {
      "id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [
        "5366711d-337e-4181-a0bd-908236527766"
      ],
      "started_at": "2026-10-30T08:48:09.99605Z",
      "answered_at": "2026-10-30T08:48:10.668341Z",
      "ended_at": "2026-10-30T08:48:10.689943Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5366711d-337e-4181-a0bd-908236527766` → **200**

```json
{
  "calls": [
    {
      "id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [
        "5366711d-337e-4181-a0bd-908236527766"
      ],
      "started_at": "2026-10-30T08:48:09.99605Z",
      "answered_at": "2026-10-30T08:48:10.668341Z",
      "ended_at": "2026-10-30T08:48:10.689943Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5366711d-337e-4181-a0bd-908236527766` → **200**

```json
{
  "calls": [
    {
      "id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [
        "5366711d-337e-4181-a0bd-908236527766"
      ],
      "started_at": "2026-10-30T08:48:09.99605Z",
      "answered_at": "2026-10-30T08:48:10.668341Z",
      "ended_at": "2026-10-30T08:48:10.689943Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=5366711d-337e-4181-a0bd-908236527766` → **200**

```json
{
  "calls": [
    {
      "id": "3e656147-4a0f-4d6d-b343-e2b50a044dd8",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "order_ids": [
        "5366711d-337e-4181-a0bd-908236527766"
      ],
      "started_at": "2026-10-30T08:48:09.99605Z",
      "answered_at": "2026-10-30T08:48:10.668341Z",
      "ended_at": "2026-10-30T08:48:10.689943Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:48:16.242794Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/5366711d-337e-4181-a0bd-908236527766` → **200**

```json
{
  "id": "5366711d-337e-4181-a0bd-908236527766",
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
  "created_at": "2026-10-30T08:48:09.657745Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674228324"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5366711d-337e-4181-a0bd-908236527766/cancel` → **200**

```json
{
  "command_id": "ebb61b92-22a7-4518-8ffb-366f7a8c86d3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5366711d-337e-4181-a0bd-908236527766",
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
  "created_at": "2026-10-30T08:48:09.657745Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674228324"
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
  "command_id": "da477bdc-ce64-452c-841c-e324f6b6523c",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T08:48:18.514832Z",
  "extension": "101"
}
```

Done: outgoing call 3e656147-4a0f-4d6d-b343-e2b50a044dd8 from order 5366711d-337e-4181-a0bd-908236527766, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639107578",
  "device_ref": "sandbox-17884"
}
```

```json
{
  "challenge_id": "488bb9cb-0fb1-4404-ad32-df647d0f495b",
  "expires_at": "2026-10-30T08:53:18.823897769Z",
  "resend_available_at": "2026-10-30T08:48:19.823897769Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639107578` → **200**

```json
{
  "phone": "+380639107578",
  "audience": "CLIENT",
  "code": "172915",
  "sent_at": "2026-10-30T08:48:18.826434994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "488bb9cb-0fb1-4404-ad32-df647d0f495b",
  "code": "172915",
  "device_ref": "sandbox-17884"
}
```

```json
{
  "session_id": "90d47481-314d-458f-ad35-71e5b11ede0a",
  "subject": {
    "type": "CLIENT",
    "id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWRlMWVlNi02Nzk5LTRkZWUtODE2MC1iMmE4ZDVhZjM2YmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwOTk5LCJpYXQiOjE3OTMzNTAwOTksImp0aSI6IjhjYmY4ODhhLTVmNjktNGEyZC05NTM2LThmNjU5YTExNGE1YyIsInNpZCI6IjkwZDQ3NDgxLTMxNGQtNDU4Zi1hZDM1LTcxZTViMTFlZGUwYSJ9.bTnbV0KN0qxL2o3CxolwwbHuZrCv9BTH-IEgwTNheq4",
  "access_expires_at": "2026-10-30T09:03:19.128509391Z",
  "refresh_token": "MhBAbFo4Q6Hoed-saBiG3nBZNymlHX2ls03AdnBB8KU",
  "refresh_expires_at": "2026-11-29T08:48:19.127970166Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd",
  "session_id": "90d47481-314d-458f-ad35-71e5b11ede0a",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639107578",
  "device_ref": "sandbox-31809"
}
```

```json
{
  "challenge_id": "6c6e07d8-51fa-4bae-bed1-93a167fcf730",
  "expires_at": "2026-10-30T08:53:21.673191868Z",
  "resend_available_at": "2026-10-30T08:48:22.673191868Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639107578` → **200**

```json
{
  "phone": "+380639107578",
  "audience": "CLIENT",
  "code": "596307",
  "sent_at": "2026-10-30T08:48:21.675690367Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6c6e07d8-51fa-4bae-bed1-93a167fcf730",
  "code": "596307",
  "device_ref": "sandbox-31809"
}
```

```json
{
  "session_id": "00982238-c16a-490c-8f0b-87d69bdd59bb",
  "subject": {
    "type": "CLIENT",
    "id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWRlMWVlNi02Nzk5LTRkZWUtODE2MC1iMmE4ZDVhZjM2YmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDAxLCJpYXQiOjE3OTMzNTAxMDEsImp0aSI6IjEwNjljMThiLTY4NTUtNDlmYS04ZmI0LTA5MjNkOTQxZDZmMiIsInNpZCI6IjAwOTgyMjM4LWMxNmEtNDkwYy04ZjBiLTg3ZDY5YmRkNTliYiJ9.cCLiu7SmfnmOQ7d8pkVNzJzKEmiPiSb0AJiYapiU4TU",
  "access_expires_at": "2026-10-30T09:03:21.986366714Z",
  "refresh_token": "mXbqpBJQR1wirvPh8R4JZkrQu8Cfvz5csunse2IiCk8",
  "refresh_expires_at": "2026-11-29T08:48:21.985878573Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "5b8401d2-fb63-4656-a1ff-aca6ec0e976e",
  "expires_at": "2026-10-30T08:53:24.275533015Z",
  "resend_available_at": "2026-10-30T08:48:25.275533015Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639107578` → **200**

```json
{
  "phone": "+380639107578",
  "audience": "CLIENT",
  "code": "242627",
  "sent_at": "2026-10-30T08:48:24.277945223Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380635675995"
}
```

```json
{
  "challenge_id": "3bcb069b-d587-495a-bbef-4996db2380e8",
  "expires_at": "2026-10-30T08:53:24.577842967Z",
  "resend_available_at": "2026-10-30T08:48:25.577842967Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635675995` → **200**

```json
{
  "phone": "+380635675995",
  "audience": "CLIENT",
  "code": "113105",
  "sent_at": "2026-10-30T08:48:24.580358473Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "92b4a1e3-e784-41fc-a525-f2a2e2cd7f4d",
  "current_challenge_id": "5b8401d2-fb63-4656-a1ff-aca6ec0e976e",
  "current_code": "000000",
  "new_challenge_id": "3bcb069b-d587-495a-bbef-4996db2380e8",
  "new_code": "113105"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "32cca525-41f4-46f8-ac9d-739741366093"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "14b00656-4284-492b-b6e3-72826e447c66",
  "current_challenge_id": "5b8401d2-fb63-4656-a1ff-aca6ec0e976e",
  "current_code": "242627",
  "new_challenge_id": "3bcb069b-d587-495a-bbef-4996db2380e8",
  "new_code": "113105"
}
```

```json
{
  "subject_id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd",
  "phone": "+380635675995",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd",
  "session_id": "90d47481-314d-458f-ad35-71e5b11ede0a",
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
  "correlation_id": "11eaae74-b1cc-45bf-92d1-42457d53dec9"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635675995",
  "device_ref": "sandbox-22446"
}
```

```json
{
  "challenge_id": "8cbdccac-8188-421b-add4-4494480476c1",
  "expires_at": "2026-10-30T08:53:28.069211374Z",
  "resend_available_at": "2026-10-30T08:48:29.069211374Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635675995` → **200**

```json
{
  "phone": "+380635675995",
  "audience": "CLIENT",
  "code": "400257",
  "sent_at": "2026-10-30T08:48:28.072147492Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cbdccac-8188-421b-add4-4494480476c1",
  "code": "400257",
  "device_ref": "sandbox-22446"
}
```

```json
{
  "session_id": "2308b7bd-0963-41a5-94db-f2cec6573f16",
  "subject": {
    "type": "CLIENT",
    "id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWRlMWVlNi02Nzk5LTRkZWUtODE2MC1iMmE4ZDVhZjM2YmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDA4LCJpYXQiOjE3OTMzNTAxMDgsImp0aSI6IjkwZWUzMzA0LTRlOWItNDViOS04NmEzLWUzNmJkNThlMTAyNSIsInNpZCI6IjIzMDhiN2JkLTA5NjMtNDFhNS05NGRiLWYyY2VjNjU3M2YxNiJ9.1u11mP7rPtnuLMhOce8ZpEAS-T5kI04EdHdOkyq4X0c",
  "access_expires_at": "2026-10-30T09:03:28.378893354Z",
  "refresh_token": "TDC7-icpfd1moUX3C2nbpYAGsg-9zJ758b4VsihE3hQ",
  "refresh_expires_at": "2026-11-29T08:48:28.378359108Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd",
  "session_id": "2308b7bd-0963-41a5-94db-f2cec6573f16",
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
  "session_id": "6cd54dd3-41ff-49bb-ac7e-0d08f455a798",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwMDksImlhdCI6MTc5MzM1MDEwOSwianRpIjoiMWQwYTdmNzUtZTA1Ny00NzEyLTkzNmYtY2IxMTYwYmZjNzlkIiwic2lkIjoiNmNkNTRkZDMtNDFmZi00OWJiLWFjN2UtMGQwOGY0NTVhNzk4In0.tIoekoYIGlHPSJy8sagjMqazwETBZB9_Dt4enBgB5bM",
  "access_expires_at": "2026-10-30T09:03:29.21645405Z",
  "refresh_token": "8hWAg6lMfGH0o94Dpk_C4xsNQOZK1h9-2dWU7frtPR0",
  "refresh_expires_at": "2026-10-30T20:48:29.215970488Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/fede1ee6-6799-4dee-8160-b2a8d5af36bd` → **200**

```json
{
  "client": {
    "id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd",
    "phone": "+380635675995",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:48:19.126386Z",
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

`POST /api/admin/v1/clients/fede1ee6-6799-4dee-8160-b2a8d5af36bd/phone/new-code` → **201**

```json
{
  "phone": "+380634996005"
}
```

```json
{
  "challenge_id": "0f013b81-45f0-4f97-8f9f-2249fac7638c",
  "expires_at": "2026-10-30T08:53:29.827590833Z",
  "resend_available_at": "2026-10-30T08:48:30.827590833Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634996005` → **200**

```json
{
  "phone": "+380634996005",
  "audience": "CLIENT",
  "code": "263123",
  "sent_at": "2026-10-30T08:48:29.82999746Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/fede1ee6-6799-4dee-8160-b2a8d5af36bd/phone` → **422**

```json
{
  "command_id": "56e37564-5e85-4638-962b-5d3b657b1581",
  "expected_version": 3,
  "new_challenge_id": "0f013b81-45f0-4f97-8f9f-2249fac7638c",
  "new_code": "263124",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/fede1ee6-6799-4dee-8160-b2a8d5af36bd/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "59690fd3-f37d-4714-987b-0524f4435843"
}
```

`POST /api/admin/v1/clients/fede1ee6-6799-4dee-8160-b2a8d5af36bd/phone` → **400**

```json
{
  "command_id": "ec3a546e-07f0-45ce-88df-4003165def95",
  "expected_version": 3,
  "new_challenge_id": "0f013b81-45f0-4f97-8f9f-2249fac7638c",
  "new_code": "263123",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/fede1ee6-6799-4dee-8160-b2a8d5af36bd/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "93ef801f-5909-4828-880d-e2aed28f42fb",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/fede1ee6-6799-4dee-8160-b2a8d5af36bd/phone` → **200**

```json
{
  "command_id": "563a6ce3-9870-4535-af4e-7bde2a7429c8",
  "expected_version": 3,
  "new_challenge_id": "0f013b81-45f0-4f97-8f9f-2249fac7638c",
  "new_code": "263123",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd",
  "phone": "+380634996005",
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
  "correlation_id": "a71aeda6-a55b-48cb-849a-39eff8d72072"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634996005",
  "device_ref": "sandbox-3213"
}
```

```json
{
  "challenge_id": "0d9f50ad-1e57-4133-b452-d29b92ac9a19",
  "expires_at": "2026-10-30T08:53:31.299649799Z",
  "resend_available_at": "2026-10-30T08:48:32.299649799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634996005` → **200**

```json
{
  "phone": "+380634996005",
  "audience": "CLIENT",
  "code": "948876",
  "sent_at": "2026-10-30T08:48:31.302527683Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d9f50ad-1e57-4133-b452-d29b92ac9a19",
  "code": "948876",
  "device_ref": "sandbox-3213"
}
```

```json
{
  "session_id": "64380409-705e-4d01-9d36-0dd55d3a9034",
  "subject": {
    "type": "CLIENT",
    "id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWRlMWVlNi02Nzk5LTRkZWUtODE2MC1iMmE4ZDVhZjM2YmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDExLCJpYXQiOjE3OTMzNTAxMTEsImp0aSI6ImFiYjMzN2NlLWJiYzUtNDZiYi1iNDdiLTU2YzE5NzFhOTc5MCIsInNpZCI6IjY0MzgwNDA5LTcwNWUtNGQwMS05ZDM2LTBkZDU1ZDNhOTAzNCJ9.79aycr6X3mzWFyEnR-OLFBmkMFlAyQyU15Y7PQOIY_0",
  "access_expires_at": "2026-10-30T09:03:31.616509317Z",
  "refresh_token": "ZJztMpkrbuCd0Na-J5Mw-l0wnioZCmZZHGcdte9AsAM",
  "refresh_expires_at": "2026-11-29T08:48:31.615971204Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fede1ee6-6799-4dee-8160-b2a8d5af36bd",
  "session_id": "64380409-705e-4d01-9d36-0dd55d3a9034",
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
  "phone": "+380639114246",
  "device_ref": "sandbox-9519"
}
```

```json
{
  "challenge_id": "53909061-3e93-49e2-8188-7b44ed7fcc17",
  "expires_at": "2026-10-30T08:53:32.190007692Z",
  "resend_available_at": "2026-10-30T08:48:33.190007692Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639114246` → **200**

```json
{
  "phone": "+380639114246",
  "audience": "CLIENT",
  "code": "262672",
  "sent_at": "2026-10-30T08:48:32.192712245Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53909061-3e93-49e2-8188-7b44ed7fcc17",
  "code": "262672",
  "device_ref": "sandbox-9519"
}
```

```json
{
  "session_id": "f6930327-1b2e-4315-bfb1-252f026cb911",
  "subject": {
    "type": "CLIENT",
    "id": "40e69f05-9514-4642-94da-f0828b4f1716"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MGU2OWYwNS05NTE0LTQ2NDItOTRkYS1mMDgyOGI0ZjE3MTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDEyLCJpYXQiOjE3OTMzNTAxMTIsImp0aSI6IjUyOTU0Y2UzLTMwOWYtNDg3My04Y2Y1LWM0OWM1YTAzMzhjYiIsInNpZCI6ImY2OTMwMzI3LTFiMmUtNDMxNS1iZmIxLTI1MmYwMjZjYjkxMSJ9.jzIEDDDy0jwkcrCO0vAwPECMviWTpsEwhLltkiW17NI",
  "access_expires_at": "2026-10-30T09:03:32.520769533Z",
  "refresh_token": "iRpZ9RmF6Cnb_Wl8bA9VeFM2u9JHw-jFUdEJBIs0ZT4",
  "refresh_expires_at": "2026-11-29T08:48:32.52016522Z",
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
  "session_id": "21651b4e-365d-4b7f-a2db-ec56e4bf2d7f",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwMTMsImlhdCI6MTc5MzM1MDExMywianRpIjoiNWI4NTUyNDUtOWI1My00YjExLTgzNTQtMGUxMDQ1ODk3NjE1Iiwic2lkIjoiMjE2NTFiNGUtMzY1ZC00YjdmLWEyZGItZWM1NmU0YmYyZDdmIn0.6S101KLx6YqO_E2fstNi52vE_C37pxw-AxJWql4oWwc",
  "access_expires_at": "2026-10-30T09:03:33.709637806Z",
  "refresh_token": "H7cBlk-4S7Rskr8dguMFzXDKr0SgfKjQ2xET1zyD378",
  "refresh_expires_at": "2026-10-30T20:48:33.709097809Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639114246` → **200**

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
  "correlation_id": "2362bef4-04c4-4825-b8a1-0d107af40e23"
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
  "session_id": "229b6a2e-7143-4e6a-a464-aeebce3186b6",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwMTQsImlhdCI6MTc5MzM1MDExNCwianRpIjoiYjJiNjU5Y2MtNmI4OC00ODA0LTlkNjItYTg0M2E0MWYxMGNjIiwic2lkIjoiMjI5YjZhMmUtNzE0My00ZTZhLWE0NjQtYWVlYmNlMzE4NmI2In0.lslrTPmAnPemupJnsZMht5z6kJjdHs4QWSkaBDYtJ7o",
  "access_expires_at": "2026-10-30T09:03:34.873233778Z",
  "refresh_token": "voWaxJlR9bA0LKxtJMyHO2YdpUbGnK_EGvxL5-o0Bwg",
  "refresh_expires_at": "2026-10-30T20:48:34.872601188Z",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:37:44.569042Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "9b033e67-1dc5-4923-bb26-ab1442cd00b1",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T08:48:35.44441786Z"
}
```

## The rider books the airport for 2026-10-30T11:48:34Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600443166",
  "device_ref": "sandbox-11555"
}
```

```json
{
  "challenge_id": "efdf2a67-f168-41f9-b772-88a4cb9e089e",
  "expires_at": "2026-10-30T08:53:35.749634348Z",
  "resend_available_at": "2026-10-30T08:48:36.749634348Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600443166` → **200**

```json
{
  "phone": "+48600443166",
  "audience": "CLIENT",
  "code": "662721",
  "sent_at": "2026-10-30T08:48:35.752360376Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efdf2a67-f168-41f9-b772-88a4cb9e089e",
  "code": "662721",
  "device_ref": "sandbox-11555"
}
```

```json
{
  "session_id": "a0340e4c-b76e-4715-92d0-06c82a42d509",
  "subject": {
    "type": "CLIENT",
    "id": "d03f6264-8c2b-4e21-bf59-cdc7938969a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDNmNjI2NC04YzJiLTRlMjEtYmY1OS1jZGM3OTM4OTY5YTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDE2LCJpYXQiOjE3OTMzNTAxMTYsImp0aSI6ImE0ZjIwZWI2LWRiNWItNDZlYS04YmZmLWMxYzZmYzVhOTBiZSIsInNpZCI6ImEwMzQwZTRjLWI3NmUtNDcxNS05MmQwLTA2YzgyYTQyZDUwOSJ9.NSjwCtG3bwpiAvbLxiqVhogb8bOCuwBzqPzDK1jcxVI",
  "access_expires_at": "2026-10-30T09:03:36.064080148Z",
  "refresh_token": "3XJjTj2hVYAysgZibc92RdhxE6cTeoaj7yHGFqsQRH4",
  "refresh_expires_at": "2026-11-29T08:48:36.063455784Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5e47727d-07fb-49fe-a817-d420b7809b98",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T11:48:34Z"
}
```

```json
{
  "id": "6695f215-cfe0-4845-8677-fb0a6cd12acd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:53:36.366303Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:48:34Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d1eb5cd4-a22f-4352-9048-3a707c50aac3",
  "quote_id": "6695f215-cfe0-4845-8677-fb0a6cd12acd",
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
  "pickup_at": "2026-10-30T11:48:34Z"
}
```

```json
{
  "id": "a688be3b-8982-43d3-8f88-a78c1cfdb3cb",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "d03f6264-8c2b-4e21-bf59-cdc7938969a3",
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
  "created_at": "2026-10-30T08:48:36.65807Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:48:34Z",
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
  "device_ref": "sandbox-7980"
}
```

```json
{
  "challenge_id": "2614b136-098b-4062-8db1-0b23cf1aa0d0",
  "expires_at": "2026-10-30T08:53:36.962442061Z",
  "resend_available_at": "2026-10-30T08:48:37.962442061Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "088085",
  "sent_at": "2026-10-30T08:48:36.965123473Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2614b136-098b-4062-8db1-0b23cf1aa0d0",
  "code": "088085",
  "device_ref": "sandbox-7980"
}
```

```json
{
  "session_id": "b770711d-f509-4024-94d6-e8e4fb976300",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTAxNywiaWF0IjoxNzkzMzUwMTE3LCJqdGkiOiI3NzQxZTE2YS05NzY5LTRkY2EtOTZiOC0yYjE5ZmJhNWVlNDQiLCJzaWQiOiJiNzcwNzExZC1mNTA5LTQwMjQtOTRkNi1lOGU0ZmI5NzYzMDAifQ.6em3QU6ruYxIiAaORSrqUDnEz-FnFqyzP6cUL1UxIgA",
  "access_expires_at": "2026-10-30T09:03:37.262097272Z",
  "refresh_token": "g8744x_NbWfbgk0cvLC9y-pQUuFAoIRk_UlZ5ozZQO0",
  "refresh_expires_at": "2026-11-29T08:48:37.261570162Z",
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
  "command_id": "41d91285-3b93-47d3-99bb-f5f4bdd48cb6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:48:37Z",
    "sequence": 1793350117827
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0b244eae-ab9b-43fc-bcef-05c5f81f9396",
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
  "last_heartbeat_at": "2026-10-30T08:48:37.845257Z",
  "last_location_at": "2026-10-30T08:48:37.845257Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "a688be3b-8982-43d3-8f88-a78c1cfdb3cb",
      "short_number": 24,
      "pickup_at": "2026-10-30T11:48:34Z",
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

`POST /api/driver/v1/preorders/a688be3b-8982-43d3-8f88-a78c1cfdb3cb/reserve` → **200**

```json
{
  "command_id": "d7ae43ff-2c93-4b4b-869b-c4d2f4849e43"
}
```

```json
{
  "id": "2f523a3a-1c24-48c0-81f2-6e7880642788",
  "state": "RESERVED",
  "order": {
    "order_id": "a688be3b-8982-43d3-8f88-a78c1cfdb3cb",
    "short_number": 24,
    "pickup_at": "2026-10-30T11:48:34Z",
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
  "reserved_at": "2026-10-30T08:48:38.428995Z",
  "confirm_from": "2026-10-30T11:18:34Z",
  "confirm_until": "2026-10-30T11:28:34Z",
  "drop_until": "2026-10-30T10:48:34Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "2f523a3a-1c24-48c0-81f2-6e7880642788",
      "state": "RESERVED",
      "order": {
        "order_id": "a688be3b-8982-43d3-8f88-a78c1cfdb3cb",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:48:34Z",
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
      "reserved_at": "2026-10-30T08:48:38.428995Z",
      "confirm_from": "2026-10-30T11:18:34Z",
      "confirm_until": "2026-10-30T11:28:34Z",
      "drop_until": "2026-10-30T10:48:34Z"
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
      "id": "2f523a3a-1c24-48c0-81f2-6e7880642788",
      "state": "RESERVED",
      "order": {
        "order_id": "a688be3b-8982-43d3-8f88-a78c1cfdb3cb",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:48:34Z",
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
      "reserved_at": "2026-10-30T08:48:38.428995Z",
      "confirm_from": "2026-10-30T11:18:34Z",
      "confirm_until": "2026-10-30T11:28:34Z",
      "drop_until": "2026-10-30T10:48:34Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/2f523a3a-1c24-48c0-81f2-6e7880642788/confirm` → **409**

```json
{
  "command_id": "6302699b-e7c0-4eec-9674-59ff792ffce8"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/2f523a3a-1c24-48c0-81f2-6e7880642788/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cd3c2606-4944-496e-8a24-a4a950855d8a"
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
  "session_id": "31c33fe4-abcf-44cc-a5c2-8886acfb91c6",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwMTksImlhdCI6MTc5MzM1MDExOSwianRpIjoiYWNlODQ5ODEtMTJkNi00NDAwLWJlNWMtZTg2MWE1YmQwODYyIiwic2lkIjoiMzFjMzNmZTQtYWJjZi00NGNjLWE1YzItODg4NmFjZmI5MWM2In0.rGYEYe8XijatAxOjyoyXmCEYfiWr2BO0h4ZAbGh-vQI",
  "access_expires_at": "2026-10-30T09:03:39.861366739Z",
  "refresh_token": "tbJpzsn8bVLb8ug5OqsKVPeKXfpQji7TXLhzyLHbaJE",
  "refresh_expires_at": "2026-10-30T20:48:39.860607875Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a688be3b-8982-43d3-8f88-a78c1cfdb3cb` → **200**

```json
{
  "id": "a688be3b-8982-43d3-8f88-a78c1cfdb3cb",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "d03f6264-8c2b-4e21-bf59-cdc7938969a3",
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
  "created_at": "2026-10-30T08:48:36.65807Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T11:48:34Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "2f523a3a-1c24-48c0-81f2-6e7880642788",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T08:48:38.428995Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a688be3b-8982-43d3-8f88-a78c1cfdb3cb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T08:48:36.659174Z",
      "actor": {
        "type": "CLIENT",
        "id": "d03f6264-8c2b-4e21-bf59-cdc7938969a3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "a688be3b-8982-43d3-8f88-a78c1cfdb3cb",
        "preorder": true,
        "quote_id": "6695f215-cfe0-4845-8677-fb0a6cd12acd",
        "pickup_at": "2026-10-30T11:48:34Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "61e0f2ad-9c53-4141-8104-51d8d3aa1ffa"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T08:48:38.430197Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a688be3b-8982-43d3-8f88-a78c1cfdb3cb",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "2f523a3a-1c24-48c0-81f2-6e7880642788"
      },
      "correlation_id": "6ae210d7-3fba-48a2-8443-090c8758a09e"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order a688be3b-8982-43d3-8f88-a78c1cfdb3cb, reservation 2f523a3a-1c24-48c0-81f2-6e7880642788.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4557"
}
```

```json
{
  "challenge_id": "0d3a65f3-c64d-411e-92aa-c4174770a78c",
  "expires_at": "2026-10-30T08:53:40.755834029Z",
  "resend_available_at": "2026-10-30T08:48:41.755834029Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "147807",
  "sent_at": "2026-10-30T08:48:40.759856808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d3a65f3-c64d-411e-92aa-c4174770a78c",
  "code": "147807",
  "device_ref": "sandbox-4557"
}
```

```json
{
  "session_id": "95dfeca7-4daa-4b8f-8c47-327ef131a426",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTAyMSwiaWF0IjoxNzkzMzUwMTIxLCJqdGkiOiJmZjNlZmYwMi1iNzgzLTQ1YTEtYjY1YS05MjM1ZTJhZDRkMDUiLCJzaWQiOiI5NWRmZWNhNy00ZGFhLTRiOGYtOGM0Ny0zMjdlZjEzMWE0MjYifQ.IAONZANyC1_xG1fLdfFpmMqbYc_HwoTYcQNPlTp3XqA",
  "access_expires_at": "2026-10-30T09:03:41.069378248Z",
  "refresh_token": "-_OsEzcn7uiIm9riRXBBC8SeaglTc1bX5ycgS3OFatk",
  "refresh_expires_at": "2026-11-29T08:48:41.068829279Z",
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
  "command_id": "64a88e6b-f463-4859-8651-1a9a4dd3e723",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:48:41Z",
    "sequence": 1793350121655
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe",
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
  "last_heartbeat_at": "2026-10-30T08:48:41.673457Z",
  "last_location_at": "2026-10-30T08:48:41.673457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675932198",
  "device_ref": "sandbox-10660"
}
```

```json
{
  "challenge_id": "ab45029c-79dc-493c-8d66-68c073326780",
  "expires_at": "2026-10-30T08:53:41.968065199Z",
  "resend_available_at": "2026-10-30T08:48:42.968065199Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675932198` → **200**

```json
{
  "phone": "+380675932198",
  "audience": "CLIENT",
  "code": "351733",
  "sent_at": "2026-10-30T08:48:41.970584346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab45029c-79dc-493c-8d66-68c073326780",
  "code": "351733",
  "device_ref": "sandbox-10660"
}
```

```json
{
  "session_id": "6d3cf65e-c315-435a-a02a-0985f3e8a7ff",
  "subject": {
    "type": "CLIENT",
    "id": "dcf52a87-4aa9-4dd1-97d9-243e4897e06f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkY2Y1MmE4Ny00YWE5LTRkZDEtOTdkOS0yNDNlNDg5N2UwNmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDIyLCJpYXQiOjE3OTMzNTAxMjIsImp0aSI6IjY2ZmM2Mzk4LTYxMjYtNGRjNi05YWZmLTlkODMyYWIzYzQ4ZCIsInNpZCI6IjZkM2NmNjVlLWMzMTUtNDM1YS1hMDJhLTA5ODVmM2U4YTdmZiJ9.FaRpbnakORpoS7klTm3wtrY5Gt6O-1Bp_FTm5WHIuf0",
  "access_expires_at": "2026-10-30T09:03:42.282077548Z",
  "refresh_token": "efj18fK6EFk9QVCBm9GSJByJKQ9L33LnnfL1LzMve44",
  "refresh_expires_at": "2026-11-29T08:48:42.281628991Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d2918873-3d11-408d-b2f6-a1f4bc0cab7c",
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
  "id": "6c52e9c9-46cc-4765-9713-8e0d65250929",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:53:42.589648Z",
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
  "command_id": "2c3ad2b3-e15f-484d-947d-97d1adf82b71",
  "quote_id": "6c52e9c9-46cc-4765-9713-8e0d65250929",
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
  "id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dcf52a87-4aa9-4dd1-97d9-243e4897e06f",
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
  "created_at": "2026-10-30T08:48:42.893331Z",
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
    "id": "1e83b51f-1774-47de-a912-7a2a8464d7e3",
    "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
    "expires_at": "2026-10-30T08:48:57.89657Z",
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

`POST /api/driver/v1/offers/1e83b51f-1774-47de-a912-7a2a8464d7e3/accept` → **200**

```json
{
  "command_id": "a80947f0-ca6a-4615-b1fb-2fe943fe7466"
}
```

```json
{
  "id": "48436729-8240-4545-968a-5a127ea69f01",
  "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a05dd513-9594-447a-8580-2a8f68cbe391",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a05dd513-9594-447a-8580-2a8f68cbe391",
  "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "assignment_id": "48436729-8240-4545-968a-5a127ea69f01",
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

`POST /api/driver/v1/work-sessions/a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:48:44Z",
    "sequence": 1793350124739
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe",
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
  "last_heartbeat_at": "2026-10-30T08:48:44.091685Z",
  "last_location_at": "2026-10-30T08:48:44.091685Z",
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
  "id": "a05dd513-9594-447a-8580-2a8f68cbe391",
  "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "assignment_id": "48436729-8240-4545-968a-5a127ea69f01",
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

`POST /api/driver/v1/trips/a05dd513-9594-447a-8580-2a8f68cbe391/arrive` → **200**

```json
{
  "command_id": "e9b68945-eaf2-49b7-8f34-3656c262135a",
  "expected_version": 0
}
```

```json
{
  "id": "a05dd513-9594-447a-8580-2a8f68cbe391",
  "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "assignment_id": "48436729-8240-4545-968a-5a127ea69f01",
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
  "arrived_at": "2026-10-30T08:48:44.665621Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a05dd513-9594-447a-8580-2a8f68cbe391/start` → **200**

```json
{
  "command_id": "e0789b7c-82e2-41b6-87eb-6600c40d6e6a",
  "expected_version": 1
}
```

```json
{
  "id": "a05dd513-9594-447a-8580-2a8f68cbe391",
  "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "assignment_id": "48436729-8240-4545-968a-5a127ea69f01",
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
  "arrived_at": "2026-10-30T08:48:44.665621Z",
  "started_at": "2026-10-30T08:48:44.952926Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:49:33Z",
    "sequence": 1793350173263
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe",
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
  "last_heartbeat_at": "2026-10-30T08:49:33.283377Z",
  "last_location_at": "2026-10-30T08:49:33.283377Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a05dd513-9594-447a-8580-2a8f68cbe391/complete` → **200**

```json
{
  "command_id": "56bbe88b-657e-4547-817c-ea09de375569",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:49:33Z",
  "cash_received": true
}
```

```json
{
  "id": "a05dd513-9594-447a-8580-2a8f68cbe391",
  "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "assignment_id": "48436729-8240-4545-968a-5a127ea69f01",
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
  "arrived_at": "2026-10-30T08:48:44.665621Z",
  "started_at": "2026-10-30T08:48:44.952926Z",
  "completed_at": "2026-10-30T08:49:33.577084Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/b967a2e7-5a18-45d5-96d7-7d9cd7de3eec/rating` → **200**

```json
{
  "command_id": "7a434b66-c3ab-495a-9ef3-16971f7c4520",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "score": 5,
  "created_at": "2026-10-30T08:49:33.884016317Z"
}
```

`POST /api/driver/v1/orders/b967a2e7-5a18-45d5-96d7-7d9cd7de3eec/rating` → **200**

```json
{
  "command_id": "d996e9bd-f1ce-455d-a168-e22425456e42",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
  "score": 4,
  "created_at": "2026-10-30T08:49:34.178892291Z"
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
  "session_id": "a8e471ad-d6ae-4cc7-a7b8-31ea0db16874",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwNzUsImlhdCI6MTc5MzM1MDE3NSwianRpIjoiYzRiMTZhYzctYTNmOC00MTM0LTk1YWYtNjQ5MmMyNWI3NjdlIiwic2lkIjoiYThlNDcxYWQtZDZhZS00Y2M3LWE3YjgtMzFlYTBkYjE2ODc0In0.5zLQ7yTcleouKk8U4Q2nveKsGTdPW1__td3r0M1jWik",
  "access_expires_at": "2026-10-30T09:04:35.046143849Z",
  "refresh_token": "5UsTbOnDSeuEA2EHXrc7jQ2d5um1YCThTJp2wzf44jg",
  "refresh_expires_at": "2026-10-30T20:49:35.045649707Z",
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
  "session_id": "52227826-7237-404e-a7d4-45b4cc971c2b",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwNzUsImlhdCI6MTc5MzM1MDE3NSwianRpIjoiMWUzYjU5YzUtMmFjOS00Y2ZlLWEzMzktNjE4OTQzZmZjZWU4Iiwic2lkIjoiNTIyMjc4MjYtNzIzNy00MDRlLWE3ZDQtNDViNGNjOTcxYzJiIn0.oL9DOpoIvx6GpKouRP8bWNnQ8w_7m5KOMCAxV-2raSM",
  "access_expires_at": "2026-10-30T09:04:35.627065234Z",
  "refresh_token": "4imxVBHbKd8ZXB0wYY-EcpWjVsYe3bsfz63CmI2hKHc",
  "refresh_expires_at": "2026-10-30T20:49:35.626520628Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b967a2e7-5a18-45d5-96d7-7d9cd7de3eec/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
      "author_type": "RIDER",
      "author_id": "dcf52a87-4aa9-4dd1-97d9-243e4897e06f",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T08:49:33.884016Z"
    },
    {
      "order_id": "b967a2e7-5a18-45d5-96d7-7d9cd7de3eec",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "dcf52a87-4aa9-4dd1-97d9-243e4897e06f",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T08:49:34.178892Z"
    }
  ]
}
```

Done: ratings for order b967a2e7-5a18-45d5-96d7-7d9cd7de3eec.

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
  "session_id": "7b58680c-8348-4c70-a858-2473fdc333a6",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwNzYsImlhdCI6MTc5MzM1MDE3NiwianRpIjoiZTIxN2VkOTgtNmNlYy00N2QyLWE2ZTgtZWY2Y2U3MzY3NDI5Iiwic2lkIjoiN2I1ODY4MGMtODM0OC00YzcwLWE4NTgtMjQ3M2ZkYzMzM2E2In0.qmDxqmc5sV_-GN_edu4KF9jbUyAYfN1YYVEN5vt5qSI",
  "access_expires_at": "2026-10-30T09:04:36.503410144Z",
  "refresh_token": "txDtDhMsRr9PbjZG-Ky-rCU5a8UIfWPJ0y2US0rTSWI",
  "refresh_expires_at": "2026-10-30T20:49:36.502865629Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "750758d6-0ba4-4f52-bfbb-5887d6bb624b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "d1a03bd4-5284-4aba-8dd6-2e81fceee8b4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:36.797129Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d1a03bd4-5284-4aba-8dd6-2e81fceee8b4` → **200**

```json
{
  "id": "d1a03bd4-5284-4aba-8dd6-2e81fceee8b4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:36.797129Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d1a03bd4-5284-4aba-8dd6-2e81fceee8b4` → **200**

```json
{
  "id": "d1a03bd4-5284-4aba-8dd6-2e81fceee8b4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:36.797129Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d1a03bd4-5284-4aba-8dd6-2e81fceee8b4` → **200**

```json
{
  "id": "d1a03bd4-5284-4aba-8dd6-2e81fceee8b4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:36.797129Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d1a03bd4-5284-4aba-8dd6-2e81fceee8b4` → **200**

```json
{
  "id": "d1a03bd4-5284-4aba-8dd6-2e81fceee8b4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:36.797129Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d1a03bd4-5284-4aba-8dd6-2e81fceee8b4` → **200**

```json
{
  "id": "d1a03bd4-5284-4aba-8dd6-2e81fceee8b4",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:49:36.797129Z",
  "ready_at": "2026-10-30T08:49:41.416329Z",
  "expires_at": "2026-10-31T08:49:41.416329Z"
}
```

`GET /api/admin/v1/reports/exports/d1a03bd4-5284-4aba-8dd6-2e81fceee8b4/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f70222a1-9ae5-4359-ae4f-76cb10d821ca",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "8ef72e66-5f44-4de7-bf7d-9d6df4d99585",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:42.54816Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8ef72e66-5f44-4de7-bf7d-9d6df4d99585` → **200**

```json
{
  "id": "8ef72e66-5f44-4de7-bf7d-9d6df4d99585",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:42.54816Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8ef72e66-5f44-4de7-bf7d-9d6df4d99585` → **200**

```json
{
  "id": "8ef72e66-5f44-4de7-bf7d-9d6df4d99585",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:42.54816Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8ef72e66-5f44-4de7-bf7d-9d6df4d99585` → **200**

```json
{
  "id": "8ef72e66-5f44-4de7-bf7d-9d6df4d99585",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:49:42.54816Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8ef72e66-5f44-4de7-bf7d-9d6df4d99585` → **200**

```json
{
  "id": "8ef72e66-5f44-4de7-bf7d-9d6df4d99585",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:49:42.54816Z",
  "ready_at": "2026-10-30T08:49:46.424311Z",
  "expires_at": "2026-10-31T08:49:46.424311Z"
}
```

`GET /api/admin/v1/reports/exports/8ef72e66-5f44-4de7-bf7d-9d6df4d99585/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/501b6c3d-a9ff-4118-96bd-213088d1891a` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/501b6c3d-a9ff-4118-96bd-213088d1891a",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "35cfbfeb-9207-4cf3-8d08-b509514cbd64"
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
  "device_ref": "sandbox-14116"
}
```

```json
{
  "challenge_id": "325beec9-11e5-4e41-ab39-7fd3d3fde6b1",
  "expires_at": "2026-10-30T08:54:47.320903651Z",
  "resend_available_at": "2026-10-30T08:49:48.320903651Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "688668",
  "sent_at": "2026-10-30T08:49:47.323563821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "325beec9-11e5-4e41-ab39-7fd3d3fde6b1",
  "code": "688668",
  "device_ref": "sandbox-14116"
}
```

```json
{
  "session_id": "095e8611-123d-4476-8c73-d53b352a0729",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTA4NywiaWF0IjoxNzkzMzUwMTg3LCJqdGkiOiI4NjQ5MjUzMS03MDMyLTQ2MGItYjJhZC1lZWIyYmI0NTU4YWQiLCJzaWQiOiIwOTVlODYxMS0xMjNkLTQ0NzYtOGM3My1kNTNiMzUyYTA3MjkifQ.I7nzj7D6_0XY5FWQ3o2anxtnq8i2OXaUN9wI2vV3rKk",
  "access_expires_at": "2026-10-30T09:04:47.635087483Z",
  "refresh_token": "A_R0jT-GmRBNC4pv_0nGXUEezPCGATVw3v3_etBe-UM",
  "refresh_expires_at": "2026-11-29T08:49:47.634600615Z",
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
  "command_id": "69f521ef-185b-4ee4-a28c-2f78dd1c5f2b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:49:48Z",
    "sequence": 1793350188524
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9d15365a-f9f2-43f5-9532-42e4de7e610b",
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
  "last_heartbeat_at": "2026-10-30T08:49:48.542976Z",
  "last_location_at": "2026-10-30T08:49:48.542976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "0d2a45de-15da-49e5-89dc-f6cbf5fc58c6",
  "points": [
    {
      "sequence": 1793350190838,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:48:50Z"
    },
    {
      "sequence": 1793350190846,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:49:50Z"
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
  "session_id": "1dccb19d-7f52-4879-873e-adb3c54b7897",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwOTEsImlhdCI6MTc5MzM1MDE5MSwianRpIjoiMjM0YzNhZjEtNjM0Yy00MTIxLTk5NzctOGI3NjdkN2FlZDMzIiwic2lkIjoiMWRjY2IxOWQtN2Y1Mi00ODc5LTg3M2UtYWRiM2M1NGI3ODk3In0.rgRG2s-zCCpaeOFuLpzVTZ2mlPsmgiQRuVzGI5m1syE",
  "access_expires_at": "2026-10-30T09:04:51.47773432Z",
  "refresh_token": "49XnXtesLh19N5YvT_shitF_z16G6e44_S4PS28dEKQ",
  "refresh_expires_at": "2026-10-30T20:49:51.477189073Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "ae988358-53df-436e-92e5-29f72de47e51",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T08:49:50Z",
        "track_point_id": "75284947-f172-45fe-a78c-3e384f1d97cd",
        "work_session_id": "9d15365a-f9f2-43f5-9532-42e4de7e610b"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T08:49:50Z",
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

`POST /api/admin/v1/driver-risk-flags/ae988358-53df-436e-92e5-29f72de47e51/confirm` → **200**

```json
{
  "command_id": "6298f13b-3a74-4bdc-9535-727b1d8546f9",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "ae988358-53df-436e-92e5-29f72de47e51",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T08:49:50Z",
    "track_point_id": "75284947-f172-45fe-a78c-3e384f1d97cd",
    "work_session_id": "9d15365a-f9f2-43f5-9532-42e4de7e610b"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T08:49:50Z",
  "reason": null,
  "reviewed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reviewed_at": "2026-10-30T08:49:52.383888Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/ae988358-53df-436e-92e5-29f72de47e51/dismiss` → **409**

```json
{
  "command_id": "8ccd22b3-536c-419d-91fc-45f2c4afb356",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/ae988358-53df-436e-92e5-29f72de47e51/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ab0b4d13-7bb5-440b-a6e2-5ca456325c55"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "1f837350-cf27-4632-8d1b-be0395048dbe",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "8a7a659e-31b3-4593-a84e-13ab37ccfffb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "raised_at": "2026-10-30T08:49:52.973672Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/8a7a659e-31b3-4593-a84e-13ab37ccfffb/dismiss` → **200**

```json
{
  "command_id": "80e2bf33-c53c-47b4-bd45-2a7004b4f44a",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "8a7a659e-31b3-4593-a84e-13ab37ccfffb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "raised_at": "2026-10-30T08:49:52.973672Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reviewed_at": "2026-10-30T08:49:53.272835Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "c6f38403-9554-4adc-8097-3984628a41e6",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "ae988358-53df-436e-92e5-29f72de47e51"
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
      "actor_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:49:53.595718Z"
    }
  ]
}
```

Done: flag ae988358-53df-436e-92e5-29f72de47e51 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "afbbb643-b5d4-4220-916e-82ad2bda7da0",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwOTQsImlhdCI6MTc5MzM1MDE5NCwianRpIjoiOWMyMWJkYjctMjRkOC00YTA2LWE3NDMtOTVlNTNkNzBhOWFlIiwic2lkIjoiYWZiYmI2NDMtYjVkNC00MjIwLTkxNmUtODJhZDJiZGE3ZGEwIn0.apZpOVM_-k-c7dDHi9_0UE2ZWtiFMSjwxta4iZnm5UY",
  "access_expires_at": "2026-10-30T09:04:54.470100854Z",
  "refresh_token": "Qe-DFQb6k6AOCznuI_fA2_XKmaHwmit5FhkW3of2knE",
  "refresh_expires_at": "2026-10-30T20:49:54.46955162Z",
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
      "actor_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:49:53.595718Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "84aaa9ff-504e-45cb-9a94-9c5f1e6ba02a",
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
  "session_id": "9d15365a-f9f2-43f5-9532-42e4de7e610b",
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
  "last_heartbeat_at": "2026-10-30T08:49:48.542976Z",
  "last_location_at": "2026-10-30T08:49:48.542976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9d15365a-f9f2-43f5-9532-42e4de7e610b/close` → **200**

```json
{
  "command_id": "5eb65940-cf7b-4794-abb2-c438e44b4938",
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
  "session_id": "ce383386-790f-4508-b6a6-fb5444cee9a5",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEwOTYsImlhdCI6MTc5MzM1MDE5NiwianRpIjoiZjU5ZWEwZGQtMDY0Yi00ZjI1LTgyOGUtYWZlMmFjOGExOGIwIiwic2lkIjoiY2UzODMzODYtNzkwZi00NTA4LWI2YTYtZmI1NDQ0Y2VlOWE1In0.2Z_knRYR-JSGl_IL82K1SbxCETudaA8B7rN_XckF7AA",
  "access_expires_at": "2026-10-30T09:04:56.222590664Z",
  "refresh_token": "gesIFDIoewkuZ1AQ5bKfe6XpFRnLE9gjW9Y4nni-pUs",
  "refresh_expires_at": "2026-10-30T20:49:56.222051088Z",
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
  "command_id": "1b008df5-1abb-456a-85c4-c871c6887d8d",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:49:56.825567Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "1b008df5-1abb-456a-85c4-c871c6887d8d",
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
  "changed_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:49:56.825567Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48881582411",
  "device_ref": "sandbox-5768"
}
```

```json
{
  "challenge_id": "35d2e7a3-a14e-4c2f-a1a8-c39c7ec9d796",
  "expires_at": "2026-10-30T08:54:57.457842507Z",
  "resend_available_at": "2026-10-30T08:49:58.457842507Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48881582411` → **200**

```json
{
  "phone": "+48881582411",
  "audience": "CLIENT",
  "code": "233242",
  "sent_at": "2026-10-30T08:49:57.460607643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35d2e7a3-a14e-4c2f-a1a8-c39c7ec9d796",
  "code": "233242",
  "device_ref": "sandbox-5768"
}
```

```json
{
  "session_id": "6a11f225-973d-4db1-a88b-078d6c5fd3ba",
  "subject": {
    "type": "CLIENT",
    "id": "c498b84f-4486-41c3-9c85-e3f191c0a8b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNDk4Yjg0Zi00NDg2LTQxYzMtOWM4NS1lM2YxOTFjMGE4YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMDk3LCJpYXQiOjE3OTMzNTAxOTcsImp0aSI6ImZhOTYzNDAwLTRkM2UtNGMxYS05Yjk3LWE1N2NjNmQwNTc5OCIsInNpZCI6IjZhMTFmMjI1LTk3M2QtNGRiMS1hODhiLTA3OGQ2YzVmZDNiYSJ9.DZeXdNvCevZbPj5QHrj8Q0I45gWTofRQXFZqm28CVl0",
  "access_expires_at": "2026-10-30T09:04:57.763352741Z",
  "refresh_token": "vYAgV2evGPtmTHms7YBygxCqQwJnnvBUwlP6Qtbd9Eo",
  "refresh_expires_at": "2026-11-29T08:49:57.762754748Z",
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
  "correlation_id": "7ee0d83a-8574-43da-8a70-148f2120a3aa"
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
  "device_ref": "sandbox-16906"
}
```

```json
{
  "challenge_id": "4dbad8f9-9de6-4518-864c-ed612fc83c16",
  "expires_at": "2026-10-30T08:54:58.635837905Z",
  "resend_available_at": "2026-10-30T08:49:59.635837905Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "703896",
  "sent_at": "2026-10-30T08:49:58.640208905Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dbad8f9-9de6-4518-864c-ed612fc83c16",
  "code": "703896",
  "device_ref": "sandbox-16906"
}
```

```json
{
  "session_id": "dcc2475e-d3a0-49bf-bde2-d69780dbd854",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTA5OCwiaWF0IjoxNzkzMzUwMTk4LCJqdGkiOiI1YjA2MGZjNS04ZTQwLTRkMjUtOWIxNi0xMDk4ZmNmYTcxMDAiLCJzaWQiOiJkY2MyNDc1ZS1kM2EwLTQ5YmYtYmRlMi1kNjk3ODBkYmQ4NTQifQ.4tuTY4SiB_mnDgdQ0b9DEwvMiWKdPagEdayEPH3jO48",
  "access_expires_at": "2026-10-30T09:04:58.961096012Z",
  "refresh_token": "PaiLUJFBU7GHQthK8q82UEs6lzCSsnj9sto3Jdfixlo",
  "refresh_expires_at": "2026-11-29T08:49:58.960627539Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0b244eae-ab9b-43fc-bcef-05c5f81f9396",
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
  "last_heartbeat_at": "2026-10-30T08:48:37.845257Z",
  "last_location_at": "2026-10-30T08:48:37.845257Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0b244eae-ab9b-43fc-bcef-05c5f81f9396/handover` → **200**

```json
{
  "command_id": "7566773a-17f6-41da-aee5-a35a13e5942f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0b244eae-ab9b-43fc-bcef-05c5f81f9396",
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
  "last_heartbeat_at": "2026-10-30T08:48:37.845257Z",
  "last_location_at": "2026-10-30T08:48:37.845257Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0b244eae-ab9b-43fc-bcef-05c5f81f9396/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:49:59Z",
    "sequence": 1793350199833
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0b244eae-ab9b-43fc-bcef-05c5f81f9396",
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
  "last_heartbeat_at": "2026-10-30T08:49:59.851569Z",
  "last_location_at": "2026-10-30T08:49:59.851569Z",
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
  "session_id": "0b244eae-ab9b-43fc-bcef-05c5f81f9396",
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
  "last_heartbeat_at": "2026-10-30T08:49:59.851569Z",
  "last_location_at": "2026-10-30T08:49:59.851569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0b244eae-ab9b-43fc-bcef-05c5f81f9396/close` → **200**

```json
{
  "command_id": "6e73f431-5026-496f-979f-65096bbb7033",
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
  "correlation_id": "e40fe952-e116-4382-a8fa-8b5c09f0b827"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674044500",
  "device_ref": "sandbox-11532"
}
```

```json
{
  "challenge_id": "d562893d-69df-4367-9552-25f4cced0e44",
  "expires_at": "2026-10-30T08:55:01.301289621Z",
  "resend_available_at": "2026-10-30T08:50:02.301289621Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674044500` → **200**

```json
{
  "phone": "+380674044500",
  "audience": "CLIENT",
  "code": "986823",
  "sent_at": "2026-10-30T08:50:01.303719263Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d562893d-69df-4367-9552-25f4cced0e44",
  "code": "986823",
  "device_ref": "sandbox-11532"
}
```

```json
{
  "session_id": "58453419-92ef-4751-af37-e7b4eeb61c79",
  "subject": {
    "type": "CLIENT",
    "id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTM3NmNkYi1iOWE5LTRkODEtYmQ5Yi1hY2MzMzk3NmQ4YWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMTAxLCJpYXQiOjE3OTMzNTAyMDEsImp0aSI6ImJlZjAzNGI1LWM4M2MtNGE1MS1hMGZlLTIxYzNjN2NiMWUxMiIsInNpZCI6IjU4NDUzNDE5LTkyZWYtNDc1MS1hZjM3LWU3YjRlZWI2MWM3OSJ9.0boH2mHAyk1VoA4iFkJfe6Dhko5l2SWTGbPqonw50tQ",
  "access_expires_at": "2026-10-30T09:05:01.605628804Z",
  "refresh_token": "439dk8wH7kh_KwZSJOGgXAzyhYMRbhEeVXLoS60CnTI",
  "refresh_expires_at": "2026-11-29T08:50:01.605125084Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "b92916ae-eaed-483e-bfb4-1b11dd050a03",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "98f778e0-edb6-4285-87eb-2fa41e2b6b21",
  "upload_path": "/api/rider/v1/uploads/98f778e0-edb6-4285-87eb-2fa41e2b6b21",
  "expires_at": "2026-10-30T09:05:01.903364025Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/98f778e0-edb6-4285-87eb-2fa41e2b6b21` → **200**

```json
{
  "file_id": "98f778e0-edb6-4285-87eb-2fa41e2b6b21",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "f63b7221-136f-4308-9415-6a1125bcb951",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "98f778e0-edb6-4285-87eb-2fa41e2b6b21"
  ]
}
```

```json
{
  "id": "d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:50:02.229905Z",
  "updated_at": "2026-10-30T08:50:02.229905Z",
  "respond_by": "2026-10-30T12:50:02.229905Z",
  "messages": [
    {
      "id": "92b220fc-a62d-4d2b-acfa-d575cdc7b7df",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:50:02.23114Z",
      "attachments": [
        {
          "file_id": "98f778e0-edb6-4285-87eb-2fa41e2b6b21",
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
  "session_id": "3647bc6f-888a-47c1-b9f9-9c61bf12b1cd",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTExMDIsImlhdCI6MTc5MzM1MDIwMiwianRpIjoiMjcwNDg5ZjQtYmMxYi00OTAwLWFjMTMtMjMxNDM5MTAxYzBjIiwic2lkIjoiMzY0N2JjNmYtODg4YS00N2MxLWI5ZjktOWM2MWJmMTJiMWNkIn0.6-XlPEpnHLI-bNVtKfIPxlz7DxTg5NfoEpG8Kwq4xrE",
  "access_expires_at": "2026-10-30T09:05:02.842104384Z",
  "refresh_token": "ZySz6xx0X_SG7wW2gIL3DZ5sVswlaLOLcRjbgyksAQE",
  "refresh_expires_at": "2026-10-30T20:50:02.841629198Z",
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
  "session_id": "fa9d5e8a-631e-49a1-80e9-106b6afc42aa",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTExMDMsImlhdCI6MTc5MzM1MDIwMywianRpIjoiM2FlNjgyYTgtZWZjNi00ZDVkLWEwMTctOGIyMTExMzQwYzMwIiwic2lkIjoiZmE5ZDVlOGEtNjMxZS00OWExLTgwZTktMTA2YjZhZmM0MmFhIn0.LLRBSlUZj8yxM9mLZ8NQBSb5s91A46-xbMFl15ObrKk",
  "access_expires_at": "2026-10-30T09:05:03.423299635Z",
  "refresh_token": "qas5vvTA6tT8NLWaPVY0rmyDRX0I1aoeUA1hKY6mf2M",
  "refresh_expires_at": "2026-10-30T20:50:03.422801135Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b/attachments/98f778e0-edb6-4285-87eb-2fa41e2b6b21` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "885fcf03-3e87-4a6d-a708-9dda500aa4b3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "46c12eee-008e-43a6-91b3-a901017257d5",
  "upload_path": "/api/operator/v1/uploads/46c12eee-008e-43a6-91b3-a901017257d5",
  "expires_at": "2026-10-30T09:05:03.736367763Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/46c12eee-008e-43a6-91b3-a901017257d5` → **200**

```json
{
  "file_id": "46c12eee-008e-43a6-91b3-a901017257d5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b` → **200**

```json
{
  "id": "d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:50:02.229905Z",
  "updated_at": "2026-10-30T08:50:02.229905Z",
  "respond_by": "2026-10-30T12:50:02.229905Z",
  "messages": [
    {
      "id": "92b220fc-a62d-4d2b-acfa-d575cdc7b7df",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:50:02.23114Z",
      "attachments": [
        {
          "file_id": "98f778e0-edb6-4285-87eb-2fa41e2b6b21",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b/comments` → **200**

```json
{
  "command_id": "e415ace5-44f5-4aab-871e-f72e89919ad6",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "46c12eee-008e-43a6-91b3-a901017257d5"
  ]
}
```

```json
{
  "id": "d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:50:02.229905Z",
  "updated_at": "2026-10-30T08:50:04.358669Z",
  "respond_by": "2026-10-30T12:50:02.229905Z",
  "messages": [
    {
      "id": "92b220fc-a62d-4d2b-acfa-d575cdc7b7df",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:50:02.23114Z",
      "attachments": [
        {
          "file_id": "98f778e0-edb6-4285-87eb-2fa41e2b6b21",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c941248f-bb81-4f32-8a60-97f3bae9eb16",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:50:04.358207Z",
      "attachments": [
        {
          "file_id": "46c12eee-008e-43a6-91b3-a901017257d5",
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

`GET /api/rider/v1/support/cases/d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b` → **200**

```json
{
  "id": "d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:50:02.229905Z",
  "updated_at": "2026-10-30T08:50:04.358669Z",
  "respond_by": "2026-10-30T12:50:02.229905Z",
  "messages": [
    {
      "id": "92b220fc-a62d-4d2b-acfa-d575cdc7b7df",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "05376cdb-b9a9-4d81-bd9b-acc33976d8ab",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:50:02.23114Z",
      "attachments": [
        {
          "file_id": "98f778e0-edb6-4285-87eb-2fa41e2b6b21",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c941248f-bb81-4f32-8a60-97f3bae9eb16",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:50:04.358207Z",
      "attachments": [
        {
          "file_id": "46c12eee-008e-43a6-91b3-a901017257d5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b/attachments/46c12eee-008e-43a6-91b3-a901017257d5` → **200**

Done: support case d8fcf4f7-b649-47c4-9ae4-96e00e5a2a6b, rider attachment 98f778e0-edb6-4285-87eb-2fa41e2b6b21, operator attachment 46c12eee-008e-43a6-91b3-a901017257d5.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735517349",
  "device_ref": "sandbox-13156"
}
```

```json
{
  "challenge_id": "a5919879-d6e8-498a-a9f6-8eacad07f518",
  "expires_at": "2026-10-30T08:55:04.963497902Z",
  "resend_available_at": "2026-10-30T08:50:05.963497902Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735517349` → **200**

```json
{
  "phone": "+380735517349",
  "audience": "CLIENT",
  "code": "030995",
  "sent_at": "2026-10-30T08:50:04.966395795Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5919879-d6e8-498a-a9f6-8eacad07f518",
  "code": "030995",
  "device_ref": "sandbox-13156"
}
```

```json
{
  "session_id": "d1e2b1b2-086e-4d7d-86bc-3d8f7d8b92eb",
  "subject": {
    "type": "CLIENT",
    "id": "0ee65986-4795-4e5c-96d9-bc709aa57ec8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZWU2NTk4Ni00Nzk1LTRlNWMtOTZkOS1iYzcwOWFhNTdlYzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMTA1LCJpYXQiOjE3OTMzNTAyMDUsImp0aSI6ImU2MGNkNzcyLWJmYWItNDgyYi1iMmFhLTNmM2QyMThhNzQxMyIsInNpZCI6ImQxZTJiMWIyLTA4NmUtNGQ3ZC04NmJjLTNkOGY3ZDhiOTJlYiJ9.rfq4tbU3NMt4Lxv4yAC2KTz1hJ657U127IoVNPp137Q",
  "access_expires_at": "2026-10-30T09:05:05.276698448Z",
  "refresh_token": "8V60A8rzdcFoaopXlxYJLqhfpcFPW-uynhiWo5NljCE",
  "refresh_expires_at": "2026-11-29T08:50:05.27615801Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9b4fcef9-3936-4ffa-be0a-ec46a7eaf63b",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a22905f6-9984-434a-a001-1cc65da2f760",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a22905f6-9984-434a-a001-1cc65da2f760",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "37ee3f37279e11842a04f1c5e5ebbe8a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a22905f6-9984-434a-a001-1cc65da2f760",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735517349"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a22905f6-9984-434a-a001-1cc65da2f760",
  "expires_at": "2026-10-30T09:20:05.590193Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/a22905f6-9984-434a-a001-1cc65da2f760` → **200**

```json
{
  "id": "a22905f6-9984-434a-a001-1cc65da2f760",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:20:05.590193Z",
  "card": {
    "id": "7b21d3cf-bf11-471f-b7d0-0f53ba3f52c4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7114",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:50:05.899823Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "19a6f40d-8ead-4f3a-b34a-3c12109ad398",
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
  "id": "d9909e30-7ffa-4c02-9b28-8a97a53386bd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:55:06.246739Z",
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
  "command_id": "af025103-27aa-485d-81a8-5bc7465dac7e",
  "quote_id": "d9909e30-7ffa-4c02-9b28-8a97a53386bd",
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
  "id": "15604121-31e3-463b-a4d5-308064cba767",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0ee65986-4795-4e5c-96d9-bc709aa57ec8",
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
  "created_at": "2026-10-30T08:50:06.560393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/15604121-31e3-463b-a4d5-308064cba767` → **200**

```json
{
  "id": "15604121-31e3-463b-a4d5-308064cba767",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0ee65986-4795-4e5c-96d9-bc709aa57ec8",
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
  "created_at": "2026-10-30T08:50:06.560393Z",
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

`GET /api/rider/v1/orders/15604121-31e3-463b-a4d5-308064cba767` → **200**

```json
{
  "id": "15604121-31e3-463b-a4d5-308064cba767",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0ee65986-4795-4e5c-96d9-bc709aa57ec8",
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
  "created_at": "2026-10-30T08:50:06.560393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/15604121-31e3-463b-a4d5-308064cba767/switch-to-cash` → **200**

```json
{
  "command_id": "3e335820-d3e1-4498-aa60-93bf52eb31cb",
  "expected_version": 3
}
```

```json
{
  "id": "15604121-31e3-463b-a4d5-308064cba767",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0ee65986-4795-4e5c-96d9-bc709aa57ec8",
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
  "created_at": "2026-10-30T08:50:06.560393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/15604121-31e3-463b-a4d5-308064cba767/switch-to-cash` → **409**

```json
{
  "command_id": "e5e49531-5d81-4478-92c4-66792c240c70",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/15604121-31e3-463b-a4d5-308064cba767/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d74ab96f-e84b-49fc-86a7-349de6da67e2"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/15604121-31e3-463b-a4d5-308064cba767` → **200**

```json
{
  "id": "15604121-31e3-463b-a4d5-308064cba767",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0ee65986-4795-4e5c-96d9-bc709aa57ec8",
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
  "created_at": "2026-10-30T08:50:06.560393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/15604121-31e3-463b-a4d5-308064cba767/cancel` → **200**

```json
{
  "command_id": "8de730d0-aa9d-4536-b273-aaf36c7f0f4d",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "15604121-31e3-463b-a4d5-308064cba767",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0ee65986-4795-4e5c-96d9-bc709aa57ec8",
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
  "created_at": "2026-10-30T08:50:06.560393Z",
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
  "session_id": "b653432e-bd4e-49a6-a490-616ec635f0f0",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTExMDgsImlhdCI6MTc5MzM1MDIwOCwianRpIjoiNjY1NjA2MGMtY2JjZS00ODY4LWIyYjktYTZjMWM2YjEwYTdjIiwic2lkIjoiYjY1MzQzMmUtYmQ0ZS00OWE2LWE0OTAtNjE2ZWM2MzVmMGYwIn0.zcejDnqM8H3TNrqW6_aftKybFPa5CfGYJaxBbakIeSY",
  "access_expires_at": "2026-10-30T09:05:08.947828381Z",
  "refresh_token": "71YlmBpmOjt9L-HR__6DBhkei65hjiWQMZLcbPG5U_M",
  "refresh_expires_at": "2026-10-30T20:50:08.947301789Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18246"
}
```

```json
{
  "challenge_id": "a777fd20-16f3-4054-9811-278fcabbe8ca",
  "expires_at": "2026-10-30T08:55:09.224198415Z",
  "resend_available_at": "2026-10-30T08:50:10.224198415Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "619655",
  "sent_at": "2026-10-30T08:50:09.226652878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a777fd20-16f3-4054-9811-278fcabbe8ca",
  "code": "619655",
  "device_ref": "sandbox-18246"
}
```

```json
{
  "session_id": "be618b82-ca65-4029-adf9-8ece019bfbec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTEwOSwiaWF0IjoxNzkzMzUwMjA5LCJqdGkiOiJiNjJiMmE1OS1mZTZhLTQzMjEtYmU2OC0yNTBiMWU0OTc4OTkiLCJzaWQiOiJiZTYxOGI4Mi1jYTY1LTQwMjktYWRmOS04ZWNlMDE5YmZiZWMifQ.XiVZn_UUvGSAC52XHDazTzLAKk8jix0619yCrLpcc28",
  "access_expires_at": "2026-10-30T09:05:09.523505283Z",
  "refresh_token": "Al6-dHN-CUTLc_itdvawWpWvFWBgq5ukRbM_EOCBfBU",
  "refresh_expires_at": "2026-11-29T08:50:09.522991275Z",
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
      "actor_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:49:53.595718Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T08:49:55.061022Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "2e80b345-245c-49c1-b197-720eb31af8eb",
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
  "device_ref": "sandbox-22311"
}
```

```json
{
  "challenge_id": "f380317c-d682-45a5-ab8c-3bdeb07dc60e",
  "expires_at": "2026-10-30T08:55:10.6355064Z",
  "resend_available_at": "2026-10-30T08:50:11.6355064Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "060060",
  "sent_at": "2026-10-30T08:50:10.640513802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f380317c-d682-45a5-ab8c-3bdeb07dc60e",
  "code": "060060",
  "device_ref": "sandbox-22311"
}
```

```json
{
  "session_id": "ee5cf82e-0476-4f53-a7f8-e0931726419d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTExMCwiaWF0IjoxNzkzMzUwMjEwLCJqdGkiOiJlZTJhOWU4Mi0xOTgxLTQ5ZmQtYWMwMi1hNTkwMzE1MzAwZjIiLCJzaWQiOiJlZTVjZjgyZS0wNDc2LTRmNTMtYTdmOC1lMDkzMTcyNjQxOWQifQ.Qv_SRqaBnqTR0qI9Mk8WVGkxG7Z8oyB31rFixU9Wrao",
  "access_expires_at": "2026-10-30T09:05:10.938077805Z",
  "refresh_token": "1drV5Bgg8ycE26usxxmBrxUhmjlcY098wb1o5O6xLl0",
  "refresh_expires_at": "2026-11-29T08:50:10.937569409Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe",
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
  "last_heartbeat_at": "2026-10-30T08:49:33.283377Z",
  "last_location_at": "2026-10-30T08:49:33.283377Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe/handover` → **200**

```json
{
  "command_id": "e2648f38-ace8-430c-866c-ae26631ce7a5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe",
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
  "last_heartbeat_at": "2026-10-30T08:49:33.283377Z",
  "last_location_at": "2026-10-30T08:49:33.283377Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 11 s to the next point)

`POST /api/driver/v1/work-sessions/a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:50:22Z",
    "sequence": 1793350222812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe",
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
  "last_heartbeat_at": "2026-10-30T08:50:22.831437Z",
  "last_location_at": "2026-10-30T08:50:22.831437Z",
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
  "command_id": "8b5b91c3-8441-4b70-ad48-a7d552c95b1d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:50:23Z",
    "sequence": 1793350223421
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5a7bb7dd-0ea9-48f5-b495-618fd618d94c",
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
  "last_heartbeat_at": "2026-10-30T08:50:23.43895Z",
  "last_location_at": "2026-10-30T08:50:23.43895Z",
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
  "session_id": "f2ed4c69-d33f-4431-992b-2958d8ce78a4",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTExMjQsImlhdCI6MTc5MzM1MDIyNCwianRpIjoiNjY3MTY2ZWYtYzU5Zi00NzJmLWI1YTctZjQ4M2E5YWQ1YTk3Iiwic2lkIjoiZjJlZDRjNjktZDMzZi00NDMxLTk5MmItMjk1OGQ4Y2U3OGE0In0.W07fW7H5YMY9JasznIIKn_xr59tRad7lkYUS_epEB9c",
  "access_expires_at": "2026-10-30T09:05:24.032521492Z",
  "refresh_token": "pxDPaAWJiJCdr_7FqwsmmRS7_AgiV1K-ms_K1-Fq2U8",
  "refresh_expires_at": "2026-10-30T20:50:24.031998417Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "189b7a79-debb-4048-a6bc-0e9333d061d6",
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
  "id": "c7fecb13-9de6-4e68-84db-467563e349e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:55:24.313085Z",
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
  "command_id": "f3e2e1cc-ce1e-45e4-967e-e30857eb1732",
  "quote_id": "c7fecb13-9de6-4e68-84db-467563e349e5",
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
  "id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
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
  "created_at": "2026-10-30T08:50:24.616018Z",
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
    "id": "426a024e-af0d-4017-91af-6a56fc2e2c95",
    "order_id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
    "expires_at": "2026-10-30T08:50:39.619602Z",
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

`POST /api/driver/v1/offers/426a024e-af0d-4017-91af-6a56fc2e2c95/accept` → **200**

```json
{
  "command_id": "3f38d2d4-34a7-4804-8f06-3705a8faf7f1"
}
```

```json
{
  "id": "f3086eee-2843-4092-8f6e-350e0836fd47",
  "order_id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eba868d5-434b-4094-8a10-77b03ecdddc1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eba868d5-434b-4094-8a10-77b03ecdddc1",
  "order_id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
  "assignment_id": "f3086eee-2843-4092-8f6e-350e0836fd47",
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

`POST /api/driver/v1/work-sessions/5a7bb7dd-0ea9-48f5-b495-618fd618d94c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:50:35Z",
    "sequence": 1793350235109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5a7bb7dd-0ea9-48f5-b495-618fd618d94c",
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
  "last_heartbeat_at": "2026-10-30T08:50:35.127798Z",
  "last_location_at": "2026-10-30T08:50:35.127798Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/eba868d5-434b-4094-8a10-77b03ecdddc1/arrive` → **200**

```json
{
  "command_id": "9489aa1d-b4ca-4b5b-b8a0-fd8f77746855",
  "expected_version": 0
}
```

```json
{
  "id": "eba868d5-434b-4094-8a10-77b03ecdddc1",
  "order_id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
  "assignment_id": "f3086eee-2843-4092-8f6e-350e0836fd47",
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
  "arrived_at": "2026-10-30T08:50:35.415282Z",
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

`POST /api/driver/v1/trips/eba868d5-434b-4094-8a10-77b03ecdddc1/start` → **200**

```json
{
  "command_id": "bf824fbe-bfce-4028-a39b-0bae9276ed80",
  "expected_version": 1
}
```

```json
{
  "id": "eba868d5-434b-4094-8a10-77b03ecdddc1",
  "order_id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
  "assignment_id": "f3086eee-2843-4092-8f6e-350e0836fd47",
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
  "arrived_at": "2026-10-30T08:50:35.415282Z",
  "started_at": "2026-10-30T08:50:35.708775Z",
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

`POST /api/driver/v1/trips/eba868d5-434b-4094-8a10-77b03ecdddc1/complete` → **200**

```json
{
  "command_id": "b8fa21c1-d937-4ffb-ae32-cfed5a7ad679",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:50:36Z",
  "cash_received": true
}
```

```json
{
  "id": "eba868d5-434b-4094-8a10-77b03ecdddc1",
  "order_id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
  "assignment_id": "f3086eee-2843-4092-8f6e-350e0836fd47",
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
  "arrived_at": "2026-10-30T08:50:35.415282Z",
  "started_at": "2026-10-30T08:50:35.708775Z",
  "completed_at": "2026-10-30T08:50:36.017759Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/53bdc818-4271-4d5c-9b9f-fac358b3959c` → **200**

```json
{
  "id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
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
    "id": "f3086eee-2843-4092-8f6e-350e0836fd47",
    "order_id": "53bdc818-4271-4d5c-9b9f-fac358b3959c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "eba868d5-434b-4094-8a10-77b03ecdddc1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:50:24.616018Z",
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
  "session_id": "a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe",
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
  "last_heartbeat_at": "2026-10-30T08:50:22.831437Z",
  "last_location_at": "2026-10-30T08:50:22.831437Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a8caa4e3-3fd4-4b7a-b75e-335e6cf8dbfe/close` → **200**

```json
{
  "command_id": "d3ab241b-b34a-4beb-a261-299f62cc651c",
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
  "session_id": "5a7bb7dd-0ea9-48f5-b495-618fd618d94c",
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
  "last_heartbeat_at": "2026-10-30T08:50:35.127798Z",
  "last_location_at": "2026-10-30T08:50:35.127798Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5a7bb7dd-0ea9-48f5-b495-618fd618d94c/close` → **200**

```json
{
  "command_id": "4415edac-d25b-4430-900e-47ea6ea6bcad",
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

Done: terminal order 53bdc818-4271-4d5c-9b9f-fac358b3959c by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19088"
}
```

```json
{
  "challenge_id": "2dfb8e6d-5ff1-44d7-aefb-a386831bfa84",
  "expires_at": "2026-10-30T08:55:41.04142907Z",
  "resend_available_at": "2026-10-30T08:50:42.04142907Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "391858",
  "sent_at": "2026-10-30T08:50:41.044970594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2dfb8e6d-5ff1-44d7-aefb-a386831bfa84",
  "code": "391858",
  "device_ref": "sandbox-19088"
}
```

```json
{
  "session_id": "734d6655-89ff-4185-bff8-699fdb8ca1b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTE0MSwiaWF0IjoxNzkzMzUwMjQxLCJqdGkiOiIyOTI1MGQ3Ni04ZTA5LTQxZTgtOGQ0Ny1jNTQ1NWVmMzljZDkiLCJzaWQiOiI3MzRkNjY1NS04OWZmLTQxODUtYmZmOC02OTlmZGI4Y2ExYjQifQ.Ka4kB56-FvD69LUrFuupbNHlDLu6C0cM31Kfco9oh5k",
  "access_expires_at": "2026-10-30T09:05:41.35144416Z",
  "refresh_token": "48nE_EGzGJz8sX56FVn8K28CSSBHUtVgWEdCZ-8aCLU",
  "refresh_expires_at": "2026-11-29T08:50:41.35091323Z",
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
  "device_ref": "sandbox-28504"
}
```

```json
{
  "challenge_id": "a2ce5c47-da47-4e07-a7c9-0680caf81626",
  "expires_at": "2026-10-30T08:55:41.90886296Z",
  "resend_available_at": "2026-10-30T08:50:42.90886296Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "834598",
  "sent_at": "2026-10-30T08:50:41.911296647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2ce5c47-da47-4e07-a7c9-0680caf81626",
  "code": "834598",
  "device_ref": "sandbox-28504"
}
```

```json
{
  "session_id": "1aae6e82-a87d-4b4c-8f81-caa5b2866a38",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTE0MiwiaWF0IjoxNzkzMzUwMjQyLCJqdGkiOiI1ZjE5OTAzMC0wZDkzLTQzYmMtOGM5ZS1lMjRmZTI2MjA2NWYiLCJzaWQiOiIxYWFlNmU4Mi1hODdkLTRiNGMtOGY4MS1jYWE1YjI4NjZhMzgifQ.GxZ8oSt3f4F1Fk01AG3IpGYDmr1DakQb1CJ9HERl6hc",
  "access_expires_at": "2026-10-30T09:05:42.22988523Z",
  "refresh_token": "r06vxQ56ylw9-uZ2Zk7vDMww2iK15j_C0e7TjXKJ1Mw",
  "refresh_expires_at": "2026-11-29T08:50:42.229271473Z",
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
  "device_ref": "sandbox-6750"
}
```

```json
{
  "challenge_id": "dd8fb643-4213-47bb-8405-cb4aa38e4d9e",
  "expires_at": "2026-10-30T08:55:42.790683424Z",
  "resend_available_at": "2026-10-30T08:50:43.790683424Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "283199",
  "sent_at": "2026-10-30T08:50:42.79318218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd8fb643-4213-47bb-8405-cb4aa38e4d9e",
  "code": "283199",
  "device_ref": "sandbox-6750"
}
```

```json
{
  "session_id": "542b70cd-cfa8-429f-9c8f-8b280db3e3a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MTE0MywiaWF0IjoxNzkzMzUwMjQzLCJqdGkiOiJmODg3MWEzNC05YTBlLTQ1YTQtYTIzOS01ODQ3YTUzYjdiN2EiLCJzaWQiOiI1NDJiNzBjZC1jZmE4LTQyOWYtOWM4Zi04YjI4MGRiM2UzYTcifQ.MZBXDzTjbjUoqb1YELkLLIkoCIsF3ilk95Uxvpvllt0",
  "access_expires_at": "2026-10-30T09:05:43.099599881Z",
  "refresh_token": "a3W_4DJ_EYPKhIFvRQXHC1g9Fx8IoLCJUVmjXIJTQ_Y",
  "refresh_expires_at": "2026-11-29T08:50:43.099049633Z",
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
  "phone": "+380694216180",
  "device_ref": "sandbox-747"
}
```

```json
{
  "challenge_id": "431a74b6-ced6-4d4d-adb4-60bcc073c9f1",
  "expires_at": "2026-10-30T08:55:43.65611433Z",
  "resend_available_at": "2026-10-30T08:50:44.65611433Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380694216180` → **200**

```json
{
  "phone": "+380694216180",
  "audience": "CLIENT",
  "code": "619697",
  "sent_at": "2026-10-30T08:50:43.658622295Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "431a74b6-ced6-4d4d-adb4-60bcc073c9f1",
  "code": "619697",
  "device_ref": "sandbox-747"
}
```

```json
{
  "session_id": "34c7a59f-3f32-42ef-a1cc-b5f388fc769e",
  "subject": {
    "type": "CLIENT",
    "id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWJkMmNhOC1kNWM5LTQzNDMtYWJhNC1mNzNlMDk2MmUwZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUxMTQzLCJpYXQiOjE3OTMzNTAyNDMsImp0aSI6IjYzOWZjNzdlLThiYzUtNDBjMi1iOTViLTVjZGNlNzhhNjA2ZCIsInNpZCI6IjM0YzdhNTlmLTNmMzItNDJlZi1hMWNjLWI1ZjM4OGZjNzY5ZSJ9.v9kNKiAiECq9v2kq4HxZ8gSZKIvmw6CN6_f-tgS2-PE",
  "access_expires_at": "2026-10-30T09:05:43.968146735Z",
  "refresh_token": "X5-i6lc5bGhPhx81rjan-pROmIks8TAGVaQcsFMMBCQ",
  "refresh_expires_at": "2026-11-29T08:50:43.9676613Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "056ce537-79ac-459b-bae5-355d908b535b",
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
  "id": "d02d8696-5550-4328-8dab-0e76bdbd159e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:55:44.301003Z",
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
  "command_id": "5d870015-afc9-4dbe-859b-4dfb6ba71388",
  "quote_id": "d02d8696-5550-4328-8dab-0e76bdbd159e",
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
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T08:50:44.607378Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:50:44.607378Z",
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
  "blizz_dispatch_excluded_total": 11,
  "blizz_sms_sent_total": 73
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.236491152
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.212826033
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 66.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/aba2e66b-cfff-4f57-b9ce-a7921ec1a488` → **200**

```json
{
  "id": "aba2e66b-cfff-4f57-b9ce-a7921ec1a488",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "aebd2ca8-d5c9-4343-aba4-f73e0962e0da",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:50:44.607378Z",
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
  "session_id": "149eb582-7693-46c8-acae-9ce69fe6ee62",
  "subject": {
    "type": "STAFF",
    "id": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzRhYjZiMC03YjY5LTQ3ZmMtOGViNC0wMTFkMGE0ZDk5M2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTEzMzEsImlhdCI6MTc5MzM1MDQzMSwianRpIjoiMDVjMjFiNzgtOWUxNi00Yzc4LWI1NjYtN2YzOGZmYzEzY2EzIiwic2lkIjoiMTQ5ZWI1ODItNzY5My00NmM4LWFjYWUtOWNlNjlmZTZlZTYyIn0.5jYxRq2mU1TjlqV0swuDnu9NQH369JmwtMisXN4Gy7E",
  "access_expires_at": "2026-10-30T09:08:51.648450775Z",
  "refresh_token": "a290lG0RadAiJyVuXcZO9GUP8JJ6yprLLGoOzUTWbNQ",
  "refresh_expires_at": "2026-10-30T20:53:51.647831912Z",
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
  "id": "045a19a6-d03b-47fd-80e8-1ff6ea8a7a01",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:53:51.958098Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:53:51.958124Z",
  "updated_at": "2026-10-30T08:53:51.974675Z",
  "finished_at": "2026-10-30T08:53:51.974675Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/045a19a6-d03b-47fd-80e8-1ff6ea8a7a01` → **200**

```json
{
  "run": {
    "id": "045a19a6-d03b-47fd-80e8-1ff6ea8a7a01",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:53:51.958098Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:53:51.958124Z",
    "updated_at": "2026-10-30T08:53:51.974675Z",
    "finished_at": "2026-10-30T08:53:51.974675Z",
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
  "id": "045a19a6-d03b-47fd-80e8-1ff6ea8a7a01",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:53:51.958098Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:53:51.958124Z",
  "updated_at": "2026-10-30T08:53:51.974675Z",
  "finished_at": "2026-10-30T08:53:51.974675Z",
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
  "id": "045a19a6-d03b-47fd-80e8-1ff6ea8a7a01",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:53:51.958098Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:53:51.958124Z",
  "updated_at": "2026-10-30T08:53:51.974675Z",
  "finished_at": "2026-10-30T08:53:51.974675Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/a88010cb-578f-4770-b9e6-b250e924af94` → **204**

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
  "id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:53:52.444578Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:53:52.44461Z",
  "updated_at": "2026-10-30T08:53:52.453031Z",
  "finished_at": "2026-10-30T08:53:52.453031Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/45ca79ab-ddc1-408f-9142-8acb4e2b0f2f` → **200**

```json
{
  "run": {
    "id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:53:52.444578Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:53:52.44461Z",
    "updated_at": "2026-10-30T08:53:52.453031Z",
    "finished_at": "2026-10-30T08:53:52.453031Z",
    "version": 1
  },
  "items": [
    {
      "id": "407d3c72-8064-4628-83fa-0c5a30eefe61",
      "run_id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "d0d7e0b102a214b1a1e7ebde065b8d2b89d90d4d8cbbbb1f6928c25d2da0e2b7",
      "reference_display": "sandbox-reconciliation-a#####cb-578f-4770-b9e6-b250e924af94",
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
      "provider_at": "2026-10-30T08:53:52Z",
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
  "id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:53:52.444578Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:53:52.44461Z",
  "updated_at": "2026-10-30T08:53:52.453031Z",
  "finished_at": "2026-10-30T08:53:52.453031Z",
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
  "id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:53:52.444578Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:53:52.44461Z",
  "updated_at": "2026-10-30T08:53:52.453031Z",
  "finished_at": "2026-10-30T08:53:52.453031Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/407d3c72-8064-4628-83fa-0c5a30eefe61/resolve` → **200**

```json
{
  "command_id": "aaecbb56-8953-4a49-a8ef-ae6f97107d2c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "407d3c72-8064-4628-83fa-0c5a30eefe61",
  "run_id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "d0d7e0b102a214b1a1e7ebde065b8d2b89d90d4d8cbbbb1f6928c25d2da0e2b7",
  "reference_display": "sandbox-reconciliation-a#####cb-578f-4770-b9e6-b250e924af94",
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
  "provider_at": "2026-10-30T08:53:52Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "resolved_at": "2026-10-30T08:53:52.874044Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/407d3c72-8064-4628-83fa-0c5a30eefe61/resolve` → **200**

```json
{
  "command_id": "aaecbb56-8953-4a49-a8ef-ae6f97107d2c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "407d3c72-8064-4628-83fa-0c5a30eefe61",
  "run_id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "d0d7e0b102a214b1a1e7ebde065b8d2b89d90d4d8cbbbb1f6928c25d2da0e2b7",
  "reference_display": "sandbox-reconciliation-a#####cb-578f-4770-b9e6-b250e924af94",
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
  "provider_at": "2026-10-30T08:53:52Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
  "resolved_at": "2026-10-30T08:53:52.874044Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/407d3c72-8064-4628-83fa-0c5a30eefe61/resolve` → **409**

```json
{
  "command_id": "7dd4c0fb-d9c5-4193-9c0b-e6c3ae894b59",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/407d3c72-8064-4628-83fa-0c5a30eefe61/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ae5ba0b2-1bb4-48f6-a8dc-a2e2b1c13435"
}
```

`GET /api/admin/v1/payment-reconciliations/45ca79ab-ddc1-408f-9142-8acb4e2b0f2f` → **200**

```json
{
  "run": {
    "id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:53:52.444578Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:53:52.44461Z",
    "updated_at": "2026-10-30T08:53:52.874044Z",
    "finished_at": "2026-10-30T08:53:52.453031Z",
    "version": 2
  },
  "items": [
    {
      "id": "407d3c72-8064-4628-83fa-0c5a30eefe61",
      "run_id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "d0d7e0b102a214b1a1e7ebde065b8d2b89d90d4d8cbbbb1f6928c25d2da0e2b7",
      "reference_display": "sandbox-reconciliation-a#####cb-578f-4770-b9e6-b250e924af94",
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
      "provider_at": "2026-10-30T08:53:52Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "e34ab6b0-7b69-47fc-8eb4-011d0a4d993a",
      "resolved_at": "2026-10-30T08:53:52.874044Z",
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
      "id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T08:53:52.444578Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:53:52.44461Z",
      "updated_at": "2026-10-30T08:53:52.874044Z",
      "finished_at": "2026-10-30T08:53:52.453031Z",
      "version": 2
    },
    {
      "id": "4442f839-1031-4921-b569-ed4f36e015bc",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T08:37:56.158562Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:37:56.15866Z",
      "updated_at": "2026-10-30T08:37:56.16508Z",
      "finished_at": "2026-10-30T08:37:56.16508Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/a88010cb-578f-4770-b9e6-b250e924af94` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "45ca79ab-ddc1-408f-9142-8acb4e2b0f2f",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:53:52.444578Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:53:52.44461Z",
  "updated_at": "2026-10-30T08:53:52.874044Z",
  "finished_at": "2026-10-30T08:53:52.453031Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793350556512E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793350556838E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793350556839E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793350556512E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793350556839E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
