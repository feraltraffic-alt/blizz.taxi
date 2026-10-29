# Sandbox transcript (2026-10-29T07:34:52Z, 624caa4)

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
  "correlation_id": "43e91ce9-d1c7-4d73-af6c-a15427aa4af3"
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
  "session_id": "7cae11bb-3872-44e2-b0f2-508592a09322",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxOTksImlhdCI6MTc5MzI1OTI5OSwianRpIjoiNGE4OWRhM2EtYmJhNy00ZjQxLTlhMjMtMmIxMjc0NWM5NmE5Iiwic2lkIjoiN2NhZTExYmItMzg3Mi00NGUyLWIwZjItNTA4NTkyYTA5MzIyIn0.434Jd_2yAC0btETnrChPZs29ZGXS5INeU9pElONXllU",
  "access_expires_at": "2026-10-29T07:49:59.898913897Z",
  "refresh_token": "32f9OtEkwJuHSJGNcTpXkk-mQMDyEU1YEolo6OeATNQ",
  "refresh_expires_at": "2026-10-29T19:34:59.896438849Z",
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
  "session_id": "bf76ae14-99f4-4631-8a96-422d3998a623",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMDEsImlhdCI6MTc5MzI1OTMwMSwianRpIjoiNDI3ZWE2NDAtYWVhYi00MGY4LWJlMTItZjkxOWVjZDBjMzQ2Iiwic2lkIjoiYmY3NmFlMTQtOTlmNC00NjMxLThhOTYtNDIyZDM5OThhNjIzIn0.pP4G0H3BTCXx-cQXIXDCPDQ7afZ1iDWlPV5tm7ER-Rc",
  "access_expires_at": "2026-10-29T07:50:01.459081632Z",
  "refresh_token": "PJIQqTIH9JI2DP7qKlrgoUTniMAJeIdryD1uR4LFxGk",
  "refresh_expires_at": "2026-10-29T19:35:01.458027116Z",
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
  "device_ref": "sandbox-26124"
}
```

```json
{
  "challenge_id": "94f72588-32e1-4fc5-bf76-e5a0997a7f8f",
  "expires_at": "2026-10-29T07:40:02.071504943Z",
  "resend_available_at": "2026-10-29T07:35:03.071504943Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "356843",
  "sent_at": "2026-10-29T07:35:02.081827046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "94f72588-32e1-4fc5-bf76-e5a0997a7f8f",
  "code": "356843",
  "device_ref": "sandbox-26124"
}
```

```json
{
  "session_id": "80af2950-8035-4a49-98ca-fa4da3f50dc6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDIwMiwiaWF0IjoxNzkzMjU5MzAyLCJqdGkiOiJlMTFlMDE3ZS01MmE2LTQzYWMtOGE3Zi02MDc0NWI4NTc2OTMiLCJzaWQiOiI4MGFmMjk1MC04MDM1LTRhNDktOThjYS1mYTRkYTNmNTBkYzYifQ.krlY-52kT-cWCCbM-0BTR0H8FA2vUYEA72nWx22z154",
  "access_expires_at": "2026-10-29T07:50:02.408421185Z",
  "refresh_token": "s0Fn09vYyUkCQ-KpItwEqxGGcl9pWDxmwor-IqcqCNw",
  "refresh_expires_at": "2026-11-28T07:35:02.407223499Z",
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
  "command_id": "0b29b3e2-631b-4c8e-bac6-cabb13ef4c33",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:03Z",
    "sequence": 1793259303872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f355beba-2275-48d6-9cf4-8718d6acb9fd",
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
  "last_heartbeat_at": "2026-10-29T07:35:03.173614Z",
  "last_location_at": "2026-10-29T07:35:03.173614Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635248454",
  "device_ref": "sandbox-14579"
}
```

```json
{
  "challenge_id": "4f0a18c1-3757-4f15-9c64-b6e9abccda4c",
  "expires_at": "2026-10-29T07:40:03.454486661Z",
  "resend_available_at": "2026-10-29T07:35:04.454486661Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635248454` → **200**

```json
{
  "phone": "+380635248454",
  "audience": "CLIENT",
  "code": "447305",
  "sent_at": "2026-10-29T07:35:03.458845625Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f0a18c1-3757-4f15-9c64-b6e9abccda4c",
  "code": "447305",
  "device_ref": "sandbox-14579"
}
```

```json
{
  "session_id": "a77ee918-1875-4abf-96fc-748a0dee3ad0",
  "subject": {
    "type": "CLIENT",
    "id": "91386a1c-ef3e-407b-889c-6f193ab4ea92"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTM4NmExYy1lZjNlLTQwN2ItODg5Yy02ZjE5M2FiNGVhOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjAzLCJpYXQiOjE3OTMyNTkzMDMsImp0aSI6ImVmNDJkNmE3LTE2OWEtNDAwOS05ODUwLTRiYjEzMWFmODRjMiIsInNpZCI6ImE3N2VlOTE4LTE4NzUtNGFiZi05NmZjLTc0OGEwZGVlM2FkMCJ9.2Wf3gBf-IZ4ajyjXDwOk3uJSi03L3HjZsVF-SKaSTXs",
  "access_expires_at": "2026-10-29T07:50:03.773713692Z",
  "refresh_token": "NAoadeilC7838RK2GrnDGTvNPyN05y1kOke63vOvJ-w",
  "refresh_expires_at": "2026-11-28T07:35:03.772724368Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8d52eb26-0e2d-4974-9bc1-9d217e20f058",
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
  "id": "bb9957f4-4a2d-4740-a321-7b290572ca91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:04.093852Z",
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
  "command_id": "3cffdcfd-bb88-456c-a574-01b95b856e02",
  "quote_id": "bb9957f4-4a2d-4740-a321-7b290572ca91",
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
  "id": "5c558cdf-d725-4d9d-a214-4e4258e7bc0f",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91386a1c-ef3e-407b-889c-6f193ab4ea92",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:35:04.461785Z",
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
    "id": "a4ae2b13-dcb4-49a0-b3fe-df92a6e8e004",
    "order_id": "5c558cdf-d725-4d9d-a214-4e4258e7bc0f",
    "expires_at": "2026-10-29T07:35:19.47253Z",
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

`POST /api/driver/v1/offers/a4ae2b13-dcb4-49a0-b3fe-df92a6e8e004/accept` → **200**

```json
{
  "command_id": "ae12a0b6-1b93-4c79-8368-1c7f02d0f706"
}
```

```json
{
  "id": "3aa6723d-1b86-489f-8e09-2844ee75cb8b",
  "order_id": "5c558cdf-d725-4d9d-a214-4e4258e7bc0f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "17138492-8516-49b9-8134-20535a1ad9da",
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
  "command_id": "747b888e-c718-4367-b77b-0c015d7b1ba0",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:35:05.707653371Z"
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
  "id": "17138492-8516-49b9-8134-20535a1ad9da",
  "order_id": "5c558cdf-d725-4d9d-a214-4e4258e7bc0f",
  "assignment_id": "3aa6723d-1b86-489f-8e09-2844ee75cb8b",
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

`POST /api/driver/v1/work-sessions/f355beba-2275-48d6-9cf4-8718d6acb9fd/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:06Z",
    "sequence": 1793259306585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f355beba-2275-48d6-9cf4-8718d6acb9fd",
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
  "last_heartbeat_at": "2026-10-29T07:35:06.610766Z",
  "last_location_at": "2026-10-29T07:35:06.610766Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/17138492-8516-49b9-8134-20535a1ad9da/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "ecedee19-a216-456d-86ef-4b9fe03d1a41",
  "expected_version": 0
}
```

```json
{
  "id": "17138492-8516-49b9-8134-20535a1ad9da",
  "order_id": "5c558cdf-d725-4d9d-a214-4e4258e7bc0f",
  "assignment_id": "3aa6723d-1b86-489f-8e09-2844ee75cb8b",
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
  "arrived_at": "2026-10-29T07:35:06.906188Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/17138492-8516-49b9-8134-20535a1ad9da/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a188f318-af3e-456f-a955-312137798bba",
  "expected_version": 1
}
```

```json
{
  "id": "17138492-8516-49b9-8134-20535a1ad9da",
  "order_id": "5c558cdf-d725-4d9d-a214-4e4258e7bc0f",
  "assignment_id": "3aa6723d-1b86-489f-8e09-2844ee75cb8b",
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
  "arrived_at": "2026-10-29T07:35:06.906188Z",
  "started_at": "2026-10-29T07:35:07.202707Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/17138492-8516-49b9-8134-20535a1ad9da/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f23e89f9-0409-4b7f-be6a-f62870264c5c",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:35:07Z",
  "cash_received": true
}
```

```json
{
  "id": "17138492-8516-49b9-8134-20535a1ad9da",
  "order_id": "5c558cdf-d725-4d9d-a214-4e4258e7bc0f",
  "assignment_id": "3aa6723d-1b86-489f-8e09-2844ee75cb8b",
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
  "arrived_at": "2026-10-29T07:35:06.906188Z",
  "started_at": "2026-10-29T07:35:07.202707Z",
  "completed_at": "2026-10-29T07:35:07.505749Z",
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
  "session_id": "f355beba-2275-48d6-9cf4-8718d6acb9fd",
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
  "last_heartbeat_at": "2026-10-29T07:35:06.610766Z",
  "last_location_at": "2026-10-29T07:35:06.610766Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f355beba-2275-48d6-9cf4-8718d6acb9fd/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f48ac543-e1c6-41cf-9d01-b31b07ce0da3",
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
  "command_id": "1454687d-52b9-4020-a4ce-27ad6617a152",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:08Z",
    "sequence": 1793259308387
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
  "correlation_id": "687c5da2-ed2c-4c0b-83a3-6e8d083efcdd",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "50595d56-e221-4491-bdc5-38ab23da1500",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:08Z",
    "sequence": 1793259308689
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fc093c63-7bf1-462a-868e-1a749884f0f6",
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
  "last_heartbeat_at": "2026-10-29T07:35:08.710697Z",
  "last_location_at": "2026-10-29T07:35:08.710697Z",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:35:05.707653Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "3aadad8d-474d-41ac-a164-d6c5a176553e",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:35:09.29501986Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fc093c63-7bf1-462a-868e-1a749884f0f6",
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
  "last_heartbeat_at": "2026-10-29T07:35:08.710697Z",
  "last_location_at": "2026-10-29T07:35:08.710697Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fc093c63-7bf1-462a-868e-1a749884f0f6/close` → **200**

```json
{
  "command_id": "f403e622-ea9b-4664-9cc0-8bf74762d252",
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
  "session_id": "312c4a9e-9171-4554-a3f4-fc0f2cf58f8b",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMTAsImlhdCI6MTc5MzI1OTMxMCwianRpIjoiOTk0YjMzZWItZDNhMy00M2I1LTk3MzYtODUwYTdmN2ZjZDg0Iiwic2lkIjoiMzEyYzRhOWUtOTE3MS00NTU0LWEzZjQtZmMwZjJjZjU4ZjhiIn0.10mhI4g-xAtxi9nCEWBoqigprGJYMzw2U-B8bmUMjKc",
  "access_expires_at": "2026-10-29T07:50:10.480626943Z",
  "refresh_token": "S33HiC0Q-Yl3D4yr7_J27cKZEN154PZxiK7GFmIg3H4",
  "refresh_expires_at": "2026-10-29T19:35:10.479797028Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "663f6c61-ed6b-4ddf-85a3-9ea195085171",
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
  "id": "fe6888b1-1d36-453f-9a83-2708c00e4bd4",
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
  "created_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "created_at": "2026-10-29T07:35:10.77316Z",
  "updated_at": "2026-10-29T07:35:10.77316Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636456946",
  "device_ref": "sandbox-26040"
}
```

```json
{
  "challenge_id": "975f44fe-8d7e-4e86-81b9-f86b24cb1af2",
  "expires_at": "2026-10-29T07:40:11.076477451Z",
  "resend_available_at": "2026-10-29T07:35:12.076477451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636456946` → **200**

```json
{
  "phone": "+380636456946",
  "audience": "CLIENT",
  "code": "295933",
  "sent_at": "2026-10-29T07:35:11.08015026Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "975f44fe-8d7e-4e86-81b9-f86b24cb1af2",
  "code": "295933",
  "device_ref": "sandbox-26040"
}
```

```json
{
  "session_id": "6a676433-5058-4d8c-9bf9-8a30e3548a68",
  "subject": {
    "type": "CLIENT",
    "id": "df3f9d28-4697-4727-918b-3c90aaa1e83c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZjNmOWQyOC00Njk3LTQ3MjctOTE4Yi0zYzkwYWFhMWU4M2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjExLCJpYXQiOjE3OTMyNTkzMTEsImp0aSI6IjFjZjM4MjM4LTI3NjQtNGFiNi1iYjUyLTMyMWQxMGJmOGUzMiIsInNpZCI6IjZhNjc2NDMzLTUwNTgtNGQ4Yy05YmY5LThhMzBlMzU0OGE2OCJ9._0P1vz5JL8fP2lQuDU0-Zez_ouxquwXKlsjyyr8rCjg",
  "access_expires_at": "2026-10-29T07:50:11.39119541Z",
  "refresh_token": "RobH74mdbNR6igHqVD3f2TQFBWSGzmizsjox03v1LqU",
  "refresh_expires_at": "2026-11-28T07:35:11.390446499Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636456946` → **200**

```json
{
  "client_id": "df3f9d28-4697-4727-918b-3c90aaa1e83c"
}
```

`POST /api/admin/v1/rider-wallets/df3f9d28-4697-4727-918b-3c90aaa1e83c/top-ups` → **201**

```json
{
  "command_id": "32d83fa9-2d28-4dc9-9d70-3ed67dbc7b56",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "df3f9d28-4697-4727-918b-3c90aaa1e83c",
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
      "id": "e83e494d-d755-4fad-8255-f3e4e2ca97b0",
      "at": "2026-10-29T07:35:11.97651Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ad3f2e21-e0f8-4cd0-9078-1733e31b0983",
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
  "id": "e27e2548-ac27-43b4-82d4-98d5998d574c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:12.294763Z",
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
      "id": "fe6888b1-1d36-453f-9a83-2708c00e4bd4",
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
  "device_ref": "sandbox-15253"
}
```

```json
{
  "challenge_id": "cb529507-cb96-4998-ade1-208bc42ec50d",
  "expires_at": "2026-10-29T07:40:12.598150067Z",
  "resend_available_at": "2026-10-29T07:35:13.598150067Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "009263",
  "sent_at": "2026-10-29T07:35:12.602214673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb529507-cb96-4998-ade1-208bc42ec50d",
  "code": "009263",
  "device_ref": "sandbox-15253"
}
```

```json
{
  "session_id": "dcbae6b0-204a-4d9b-9cfb-c6385cead89e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDIxMiwiaWF0IjoxNzkzMjU5MzEyLCJqdGkiOiJkMWM5YjIzMC04MjFhLTQ1NmUtYmU3YS0zMjcxNWMwMmUzMTAiLCJzaWQiOiJkY2JhZTZiMC0yMDRhLTRkOWItOWNmYi1jNjM4NWNlYWQ4OWUifQ.-mjufnfRTLJzHVNroKGjvpL8Ob03Y2ivNOMX_LzzcNQ",
  "access_expires_at": "2026-10-29T07:50:12.937689651Z",
  "refresh_token": "lns8uWy8NbW2R8C19c_VqGq2Y64bG2cf8eSTmj5cvWM",
  "refresh_expires_at": "2026-11-28T07:35:12.93683606Z",
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
  "command_id": "cda244fd-ac70-41dc-879c-2121b96833f6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:13Z",
    "sequence": 1793259313506
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a61cfeca-d032-4422-b8e1-df62565bfd44",
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
  "last_heartbeat_at": "2026-10-29T07:35:13.528448Z",
  "last_location_at": "2026-10-29T07:35:13.528448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "574b5659-88c5-4865-b1f0-719aaa6ac3ab",
  "quote_id": "e27e2548-ac27-43b4-82d4-98d5998d574c",
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
  "id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "df3f9d28-4697-4727-918b-3c90aaa1e83c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:35:13.827509Z",
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
  "client_id": "df3f9d28-4697-4727-918b-3c90aaa1e83c",
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
      "id": "e83e494d-d755-4fad-8255-f3e4e2ca97b0",
      "at": "2026-10-29T07:35:11.97651Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
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
    "id": "0f645b14-dcf6-4e07-8b45-940e1eab32c0",
    "order_id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f",
    "expires_at": "2026-10-29T07:35:28.836683Z",
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

`POST /api/driver/v1/offers/0f645b14-dcf6-4e07-8b45-940e1eab32c0/accept` → **200**

```json
{
  "command_id": "0860f989-5498-4768-bcb9-8650b93e156c"
}
```

```json
{
  "id": "676d0a24-fca5-45fa-b6af-a173858e228e",
  "order_id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "727ac1a1-0e97-431b-9f86-7d48946c6f5d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "727ac1a1-0e97-431b-9f86-7d48946c6f5d",
  "order_id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f",
  "assignment_id": "676d0a24-fca5-45fa-b6af-a173858e228e",
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

`POST /api/driver/v1/work-sessions/a61cfeca-d032-4422-b8e1-df62565bfd44/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:15Z",
    "sequence": 1793259315251
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a61cfeca-d032-4422-b8e1-df62565bfd44",
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
  "last_heartbeat_at": "2026-10-29T07:35:15.273468Z",
  "last_location_at": "2026-10-29T07:35:15.273468Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/727ac1a1-0e97-431b-9f86-7d48946c6f5d/arrive` → **200**

```json
{
  "command_id": "c45a55aa-8b46-4ba7-b7f3-19e110b0420f",
  "expected_version": 0
}
```

```json
{
  "id": "727ac1a1-0e97-431b-9f86-7d48946c6f5d",
  "order_id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f",
  "assignment_id": "676d0a24-fca5-45fa-b6af-a173858e228e",
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
  "arrived_at": "2026-10-29T07:35:15.556765Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/727ac1a1-0e97-431b-9f86-7d48946c6f5d/start` → **200**

```json
{
  "command_id": "0e5cec08-b028-4909-ac6d-1f4de46d09df",
  "expected_version": 1
}
```

```json
{
  "id": "727ac1a1-0e97-431b-9f86-7d48946c6f5d",
  "order_id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f",
  "assignment_id": "676d0a24-fca5-45fa-b6af-a173858e228e",
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
  "arrived_at": "2026-10-29T07:35:15.556765Z",
  "started_at": "2026-10-29T07:35:15.858935Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/727ac1a1-0e97-431b-9f86-7d48946c6f5d/complete` → **200**

```json
{
  "command_id": "d60c9de8-b1e6-4543-8769-7e633e25cb1f",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:35:16Z",
  "cash_received": true
}
```

```json
{
  "id": "727ac1a1-0e97-431b-9f86-7d48946c6f5d",
  "order_id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f",
  "assignment_id": "676d0a24-fca5-45fa-b6af-a173858e228e",
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
  "arrived_at": "2026-10-29T07:35:15.556765Z",
  "started_at": "2026-10-29T07:35:15.858935Z",
  "completed_at": "2026-10-29T07:35:16.181716Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "df3f9d28-4697-4727-918b-3c90aaa1e83c",
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
      "id": "b578748f-1b3b-4641-972d-f69aac46ddca",
      "at": "2026-10-29T07:35:16.93486Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f"
    },
    {
      "id": "e83e494d-d755-4fad-8255-f3e4e2ca97b0",
      "at": "2026-10-29T07:35:11.97651Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/fe6888b1-1d36-453f-9a83-2708c00e4bd4/archive` → **200**

```json
{
  "command_id": "864964fa-00bf-4638-a26b-ced2b5963008",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "fe6888b1-1d36-453f-9a83-2708c00e4bd4",
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
  "created_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "created_at": "2026-10-29T07:35:10.77316Z",
  "updated_at": "2026-10-29T07:35:19.775154Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a61cfeca-d032-4422-b8e1-df62565bfd44",
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
  "last_heartbeat_at": "2026-10-29T07:35:15.273468Z",
  "last_location_at": "2026-10-29T07:35:15.273468Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a61cfeca-d032-4422-b8e1-df62565bfd44/close` → **200**

```json
{
  "command_id": "b2e2cc63-00da-4d9f-a49a-628815821a74",
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

Done: order 06996fbb-1958-44a2-a874-9ea7aa2ca61f.

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
  "session_id": "a7ca0061-47d6-45f9-8cc2-8dc28f2347a9",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMjAsImlhdCI6MTc5MzI1OTMyMCwianRpIjoiODY2ZDc1YmYtOTA2Ni00NmRiLThlODItNTRmZTQ0ZTVhZmM5Iiwic2lkIjoiYTdjYTAwNjEtNDdkNi00NWY5LThjYzItOGRjMjhmMjM0N2E5In0.DmWCG_swXJ2UnZH7kvgul1iflZhExYQQuuIRthvCDqo",
  "access_expires_at": "2026-10-29T07:50:20.93917193Z",
  "refresh_token": "lXM8xHit-aLpNh6bKEOTv1p-HRcu4rDYO-yA8N_reSI",
  "refresh_expires_at": "2026-10-29T19:35:20.938450941Z",
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
  "command_id": "76323e32-1cd6-4b7c-9c5c-2d3711d37ab8",
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
  "session_id": "b6cc5856-8515-48e1-92ba-64ed70db2dda",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMjIsImlhdCI6MTc5MzI1OTMyMiwianRpIjoiNTg0MjkwMTktYzVjZS00NWExLWJjM2UtMmNhN2FhMDc4OTkwIiwic2lkIjoiYjZjYzU4NTYtODUxNS00OGUxLTkyYmEtNjRlZDcwZGIyZGRhIn0.MaYN-4DwOKAgf_rtlP5VMyW0_u5MboyqlMwB_VHs3VY",
  "access_expires_at": "2026-10-29T07:50:22.094712576Z",
  "refresh_token": "1UX-HzqByhOWGOXl5DBdmBRPXwUmFAMkxb9-tgap_Jw",
  "refresh_expires_at": "2026-10-29T19:35:22.09384405Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1620320710",
    "linkedid": "1730052700.1620320710",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673811236"
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
    "id": "1730052700.1620320710",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "3ada0c30-815a-4c23-b05c-7032c12e0830",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.367788Z",
      "answered_at": null,
      "ended_at": "2026-10-29T07:35:22.394955Z",
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
    "id": "1730052600.496813623",
    "linkedid": "1730052600.496813623",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673811236"
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
      "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.719966Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/78d325c3-693f-4850-96fb-6ceaf34baa2c/answer` → **200**

```json
{
  "command_id": "95f997a7-3e9d-4474-b200-8c6a85f8326d"
}
```

```json
{
  "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673811236",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "order_ids": [],
  "started_at": "2026-10-29T07:35:22.719966Z",
  "answered_at": "2026-10-29T07:35:23.039911Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.496813623",
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
    "id": "1730052600.496813623",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.719966Z",
      "answered_at": "2026-10-29T07:35:23.039911Z",
      "ended_at": "2026-10-29T07:35:23.363815Z",
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
      "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.719966Z",
      "answered_at": "2026-10-29T07:35:23.039911Z",
      "ended_at": "2026-10-29T07:35:23.363815Z",
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
      "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.719966Z",
      "answered_at": "2026-10-29T07:35:23.039911Z",
      "ended_at": "2026-10-29T07:35:23.363815Z",
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
      "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.719966Z",
      "answered_at": "2026-10-29T07:35:23.039911Z",
      "ended_at": "2026-10-29T07:35:23.363815Z",
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
      "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.719966Z",
      "answered_at": "2026-10-29T07:35:23.039911Z",
      "ended_at": "2026-10-29T07:35:23.363815Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:35:31.623915Z"
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
      "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.719966Z",
      "answered_at": "2026-10-29T07:35:23.039911Z",
      "ended_at": "2026-10-29T07:35:23.363815Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:35:31.623915Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/78d325c3-693f-4850-96fb-6ceaf34baa2c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/78d325c3-693f-4850-96fb-6ceaf34baa2c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=78d325c3-693f-4850-96fb-6ceaf34baa2c` → **200**

```json
{
  "changes": [
    {
      "id": "9b32bd1f-5389-431d-9e0d-be14f394db88",
      "occurred_at": "2026-10-29T07:35:33.16622Z",
      "actor_type": "STAFF",
      "actor_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"332cf2fd-830c-47a1-a7bf-e807bf0f9ee7\", \"order_ids\": []}",
      "correlation_id": "97b146c1-b2e2-41da-b60e-40095ed6f6a3"
    },
    {
      "id": "cb3271ff-c736-4af9-82f4-085ad1cdacff",
      "occurred_at": "2026-10-29T07:35:33.133207Z",
      "actor_type": "STAFF",
      "actor_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"332cf2fd-830c-47a1-a7bf-e807bf0f9ee7\", \"order_ids\": []}",
      "correlation_id": "7f21708b-196c-4036-8150-b4a2e193511f"
    }
  ]
}
```

Done: call 78d325c3-693f-4850-96fb-6ceaf34baa2c recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9708"
}
```

```json
{
  "challenge_id": "d4cff904-e9a3-4774-965f-e364d9bf4a38",
  "expires_at": "2026-10-29T07:40:33.500571191Z",
  "resend_available_at": "2026-10-29T07:35:34.500571191Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "458323",
  "sent_at": "2026-10-29T07:35:33.504448884Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4cff904-e9a3-4774-965f-e364d9bf4a38",
  "code": "458323",
  "device_ref": "sandbox-9708"
}
```

```json
{
  "session_id": "0faa15e0-56d7-4f03-b5c6-f09216f4a4d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDIzMywiaWF0IjoxNzkzMjU5MzMzLCJqdGkiOiI1ZmI1MzUxYy1kNmQ1LTQxOGMtOTkxMS0wMmYwZjBlN2YzYjkiLCJzaWQiOiIwZmFhMTVlMC01NmQ3LTRmMDMtYjVjNi1mMDkyMTZmNGE0ZDIifQ.5EBqWrj6sDwQZPiyZWYjvpKWyVX4SW0L6seiEOEvQVM",
  "access_expires_at": "2026-10-29T07:50:33.810895366Z",
  "refresh_token": "16W2ZlsfIR24r2mO58u9mXTR89vgp9YnPlRAjNx9RJQ",
  "refresh_expires_at": "2026-11-28T07:35:33.810204936Z",
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
  "command_id": "2bf16abf-fb31-44f2-8139-3d2e5c90663f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:34Z",
    "sequence": 1793259334363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "41803557-16a6-4c47-9673-a4a000fda8f3",
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
  "last_heartbeat_at": "2026-10-29T07:35:34.384631Z",
  "last_location_at": "2026-10-29T07:35:34.384631Z",
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
  "session_id": "b6e772b5-a700-4d6e-a62a-1d46ad628b62",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMzQsImlhdCI6MTc5MzI1OTMzNCwianRpIjoiNmU4ZTBmN2MtZWUxNC00ZmY2LWIzOTAtMGU0NTBkZjE1NzI5Iiwic2lkIjoiYjZlNzcyYjUtYTcwMC00ZDZlLWE2MmEtMWQ0NmFkNjI4YjYyIn0.B95amS-r5Sx4abFimokfPHAgzTH9W9rifB0c1rp3j0g",
  "access_expires_at": "2026-10-29T07:50:34.958086534Z",
  "refresh_token": "XCvXRti56PSJFWtJPy2PZq6k1SiZVhJ5xeMDDS7106E",
  "refresh_expires_at": "2026-10-29T19:35:34.957489489Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "567f8356-03e1-4a2c-8ac4-cd36dfc7e95c",
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
  "id": "032695dc-558d-4650-9f81-9dc0fe689fb2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:35.243932Z",
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
  "command_id": "ecd2ee5f-9a9a-421a-9076-da382b1b6da0",
  "quote_id": "032695dc-558d-4650-9f81-9dc0fe689fb2",
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
    "phone": "+380673275288"
  }
}
```

```json
{
  "id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
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
  "created_at": "2026-10-29T07:35:35.556395Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673275288"
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
    "id": "7f229c44-dfd6-47d6-9f8d-bbdaa642a809",
    "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
    "expires_at": "2026-10-29T07:35:50.562674Z",
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

`POST /api/driver/v1/offers/7f229c44-dfd6-47d6-9f8d-bbdaa642a809/accept` → **200**

```json
{
  "command_id": "8682619d-7c0b-4ce4-bd24-0391132f5173"
}
```

```json
{
  "id": "f655ea2d-069c-4814-a562-7b8d186b583b",
  "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7245b2a0-1954-4184-8033-2bf85a7d78c6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[
  {
    "phone": "+380673275288",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:37.821518107Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[
  {
    "phone": "+380673275288",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:37.821518107Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[
  {
    "phone": "+380673275288",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:37.821518107Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7245b2a0-1954-4184-8033-2bf85a7d78c6",
  "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
  "assignment_id": "f655ea2d-069c-4814-a562-7b8d186b583b",
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
    "phone": "+380673275288"
  }
}
```

`POST /api/driver/v1/work-sessions/41803557-16a6-4c47-9673-a4a000fda8f3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:38Z",
    "sequence": 1793259338839
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "41803557-16a6-4c47-9673-a4a000fda8f3",
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
  "last_heartbeat_at": "2026-10-29T07:35:38.860038Z",
  "last_location_at": "2026-10-29T07:35:38.860038Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7245b2a0-1954-4184-8033-2bf85a7d78c6/arrive` → **200**

```json
{
  "command_id": "0a530e08-3c51-4e9f-8f97-db130486eac1",
  "expected_version": 0
}
```

```json
{
  "id": "7245b2a0-1954-4184-8033-2bf85a7d78c6",
  "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
  "assignment_id": "f655ea2d-069c-4814-a562-7b8d186b583b",
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
  "arrived_at": "2026-10-29T07:35:39.144473Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673275288"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[
  {
    "phone": "+380673275288",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:37.821518107Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[
  {
    "phone": "+380673275288",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:37.821518107Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[
  {
    "phone": "+380673275288",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:37.821518107Z"
  },
  {
    "phone": "+380673275288",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:40.830986031Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[
  {
    "phone": "+380673275288",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:37.821518107Z"
  },
  {
    "phone": "+380673275288",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:40.830986031Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673275288` → **200**

```json
[
  {
    "phone": "+380673275288",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:37.821518107Z"
  },
  {
    "phone": "+380673275288",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:35:40.830986031Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/7245b2a0-1954-4184-8033-2bf85a7d78c6/start` → **200**

```json
{
  "command_id": "3bcf0971-2c42-4c6d-a24e-9a05c127e239",
  "expected_version": 1
}
```

```json
{
  "id": "7245b2a0-1954-4184-8033-2bf85a7d78c6",
  "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
  "assignment_id": "f655ea2d-069c-4814-a562-7b8d186b583b",
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
  "arrived_at": "2026-10-29T07:35:39.144473Z",
  "started_at": "2026-10-29T07:35:41.570693Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673275288"
  }
}
```

`POST /api/driver/v1/trips/7245b2a0-1954-4184-8033-2bf85a7d78c6/complete` → **200**

```json
{
  "command_id": "d9d21238-66e7-49f0-9eaf-a8d4c24b8d01",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:35:41Z",
  "cash_received": true
}
```

```json
{
  "id": "7245b2a0-1954-4184-8033-2bf85a7d78c6",
  "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
  "assignment_id": "f655ea2d-069c-4814-a562-7b8d186b583b",
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
  "arrived_at": "2026-10-29T07:35:39.144473Z",
  "started_at": "2026-10-29T07:35:41.570693Z",
  "completed_at": "2026-10-29T07:35:41.869784Z",
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
  "session_id": "41803557-16a6-4c47-9673-a4a000fda8f3",
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
  "last_heartbeat_at": "2026-10-29T07:35:38.860038Z",
  "last_location_at": "2026-10-29T07:35:38.860038Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41803557-16a6-4c47-9673-a4a000fda8f3/close` → **200**

```json
{
  "command_id": "01e94c7b-9ae1-40f5-a616-b975231a96e3",
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
  "phone": "+380633617295",
  "device_ref": "sandbox-4790"
}
```

```json
{
  "challenge_id": "ef068044-0cae-4eb3-a2ef-d07d643ef774",
  "expires_at": "2026-10-29T07:40:42.762931398Z",
  "resend_available_at": "2026-10-29T07:35:43.762931398Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633617295` → **200**

```json
{
  "phone": "+380633617295",
  "audience": "CLIENT",
  "code": "150633",
  "sent_at": "2026-10-29T07:35:42.766181096Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef068044-0cae-4eb3-a2ef-d07d643ef774",
  "code": "150633",
  "device_ref": "sandbox-4790"
}
```

```json
{
  "session_id": "741e1ebd-34ba-4459-9e02-9362814c5f4f",
  "subject": {
    "type": "CLIENT",
    "id": "4ebab3ed-9034-4083-b775-3ebb73df7cb0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWJhYjNlZC05MDM0LTQwODMtYjc3NS0zZWJiNzNkZjdjYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjQzLCJpYXQiOjE3OTMyNTkzNDMsImp0aSI6Ijk3NmUwOWExLTg5NTUtNGY4Zi05ZTAxLTRkMTdhNzI5ZWVmOSIsInNpZCI6Ijc0MWUxZWJkLTM0YmEtNDQ1OS05ZTAyLTkzNjI4MTRjNWY0ZiJ9.zSs0ODQaW0UvDeZNFzqqQ4rsZBR-uuNwlt4PezlFLoI",
  "access_expires_at": "2026-10-29T07:50:43.074738955Z",
  "refresh_token": "5qoYueA4SDXm2g_Vux40nJHrvKr9yMATee1SUIQn8NM",
  "refresh_expires_at": "2026-11-28T07:35:43.074101126Z",
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
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
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
  "device_ref": "sandbox-1635"
}
```

```json
{
  "challenge_id": "4b392bcf-e894-4d84-a710-837114013ee5",
  "expires_at": "2026-10-29T07:40:43.625044678Z",
  "resend_available_at": "2026-10-29T07:35:44.625044678Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "242479",
  "sent_at": "2026-10-29T07:35:43.627837967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b392bcf-e894-4d84-a710-837114013ee5",
  "code": "242479",
  "device_ref": "sandbox-1635"
}
```

```json
{
  "session_id": "3f8c1c27-180e-4562-aa85-23913fe79f44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI0MywiaWF0IjoxNzkzMjU5MzQzLCJqdGkiOiI4NGY2OTJkYy02YTlhLTQxNDItOTMwOS0xYjhkZmMzM2NhMDEiLCJzaWQiOiIzZjhjMWMyNy0xODBlLTQ1NjItYWE4NS0yMzkxM2ZlNzlmNDQifQ.zBiO7WFkQLaZgPCEwQrcBlY3TXAy6ZFCrNKTQj4GZU8",
  "access_expires_at": "2026-10-29T07:50:43.938248394Z",
  "refresh_token": "9ujJgVlDlAFZq2uiZYD3LTw7Z7FJibg4BrMZlrOSAMY",
  "refresh_expires_at": "2026-11-28T07:35:43.937645131Z",
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
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
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
  "session_id": "e92cbae3-736c-4c02-af09-173578abd628",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNDQsImlhdCI6MTc5MzI1OTM0NCwianRpIjoiYjYyNWZjMWMtNzRlYi00Nzg1LWIyNmMtNDZlOWRjY2U0NDMzIiwic2lkIjoiZTkyY2JhZTMtNzM2Yy00YzAyLWFmMDktMTczNTc4YWJkNjI4In0.R80AiLzi2BMEc92gmFWdManxMEbeebUEfjvggYqmBzo",
  "access_expires_at": "2026-10-29T07:50:44.781225208Z",
  "refresh_token": "XehF0SpEQWJSUI0sfA7UdHLhfixQ7x96uRdtcWB15ig",
  "refresh_expires_at": "2026-10-29T19:35:44.780644104Z",
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
  "session_id": "94b17b41-e292-42f0-a6f4-0ee52650138b",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNDUsImlhdCI6MTc5MzI1OTM0NSwianRpIjoiODU3YWUyZWItNDRlMi00N2QyLWFhOTQtYmY2OTZjNTg4YmUwIiwic2lkIjoiOTRiMTdiNDEtZTI5Mi00MmYwLWE2ZjQtMGVlNTI2NTAxMzhiIn0.JQKZv2Wqvy_3ZCp-rPauNKK4-DHQU6vBbz3UBKNou70",
  "access_expires_at": "2026-10-29T07:50:45.341862466Z",
  "refresh_token": "N2PgYIIRxzyc1kDSwAjVvL84wEeClLbtvw3poiD96MU",
  "refresh_expires_at": "2026-10-29T19:35:45.341118012Z",
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
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП",
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
  "command_id": "eb49d730-4f3c-4c8d-a944-44ca58f1ea8f",
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
  "id": "cec5c082-0ef0-4f66-9a53-8b7c2df00b9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:45.891746Z",
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
  "command_id": "b65da0c9-aab5-4a48-aa4a-7274e2378871",
  "quote_id": "cec5c082-0ef0-4f66-9a53-8b7c2df00b9e",
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
  "id": "cc3bdc32-dc54-4cdb-8c1d-dfcbe8d4f51f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ebab3ed-9034-4083-b775-3ebb73df7cb0",
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
  "created_at": "2026-10-29T07:35:46.180802Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cc3bdc32-dc54-4cdb-8c1d-dfcbe8d4f51f` → **200**

```json
{
  "id": "cc3bdc32-dc54-4cdb-8c1d-dfcbe8d4f51f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ebab3ed-9034-4083-b775-3ebb73df7cb0",
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
  "created_at": "2026-10-29T07:35:46.180802Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cc3bdc32-dc54-4cdb-8c1d-dfcbe8d4f51f/cancel` → **200**

```json
{
  "command_id": "7099ef10-4ee8-4e71-9958-bcca50099082",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "cc3bdc32-dc54-4cdb-8c1d-dfcbe8d4f51f",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4ebab3ed-9034-4083-b775-3ebb73df7cb0",
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
  "created_at": "2026-10-29T07:35:46.180802Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
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
  "command_id": "d5a0bf1b-02b7-4b62-ba3f-a58ae0af0fd1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:47Z",
    "sequence": 1793259347363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6cc009ab-e103-42fd-ad32-cf3ff0343487",
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
  "last_heartbeat_at": "2026-10-29T07:35:47.383593Z",
  "last_location_at": "2026-10-29T07:35:47.383593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4387"
}
```

```json
{
  "challenge_id": "4453341e-e77d-4dbf-ae38-3fc50ae72b1e",
  "expires_at": "2026-10-29T07:40:47.664811734Z",
  "resend_available_at": "2026-10-29T07:35:48.664811734Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "748123",
  "sent_at": "2026-10-29T07:35:47.667662313Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4453341e-e77d-4dbf-ae38-3fc50ae72b1e",
  "code": "748123",
  "device_ref": "sandbox-4387"
}
```

```json
{
  "session_id": "b2a952c1-994c-425e-b8e3-7b4327349283",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI0NywiaWF0IjoxNzkzMjU5MzQ3LCJqdGkiOiJkYTJmMzA3OS05YWRjLTQ1YjgtYTdjNS0yMWZmYTJmNWE3YWMiLCJzaWQiOiJiMmE5NTJjMS05OTRjLTQyNWUtYjhlMy03YjQzMjczNDkyODMifQ.Ox5MoukSwoAUzd-MkldO_JS2nKyWtuGJrBXyM0Z4HYY",
  "access_expires_at": "2026-10-29T07:50:47.970458453Z",
  "refresh_token": "k1kd_PUWRUoDDIiqduKGSGSL5DCxlXhLIrUoTFDjc1U",
  "refresh_expires_at": "2026-11-28T07:35:47.96983572Z",
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
  "command_id": "d663f975-8947-4e46-9f85-26b9a38d015b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:48Z",
    "sequence": 1793259348528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51282ad3-af07-4f92-b246-c211116056dd",
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
  "last_heartbeat_at": "2026-10-29T07:35:48.548789Z",
  "last_location_at": "2026-10-29T07:35:48.548789Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73253ac0-0473-40ae-a9f1-c83e999a0d7c",
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
  "id": "01a9ef4d-3a66-47e6-9702-ac276c3206cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:48.845162Z",
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
  "command_id": "a9fad0b6-fe4d-4b4d-9c15-20aa637c443a",
  "quote_id": "01a9ef4d-3a66-47e6-9702-ac276c3206cf",
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
  "id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ebab3ed-9034-4083-b775-3ebb73df7cb0",
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
  "created_at": "2026-10-29T07:35:49.144538Z",
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
    "id": "a2b66979-5869-45e8-b590-6ecfabc77700",
    "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
    "expires_at": "2026-10-29T07:36:04.14856Z",
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

`POST /api/driver/v1/offers/a2b66979-5869-45e8-b590-6ecfabc77700/accept` → **200**

```json
{
  "command_id": "165fdd7b-5f88-4bcb-8694-4af8c2b9f5bb"
}
```

```json
{
  "id": "11d34788-dac5-4ae3-835c-385ac1d26874",
  "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c6b78213-4f1b-4dae-8eb9-9f1ea17fffdd",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c6b78213-4f1b-4dae-8eb9-9f1ea17fffdd",
  "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
  "assignment_id": "11d34788-dac5-4ae3-835c-385ac1d26874",
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

`POST /api/driver/v1/trips/c6b78213-4f1b-4dae-8eb9-9f1ea17fffdd/cancel` → **200**

```json
{
  "command_id": "6637411f-d10a-45f9-9e08-e32bf0e1d268",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "c6b78213-4f1b-4dae-8eb9-9f1ea17fffdd",
  "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
  "assignment_id": "11d34788-dac5-4ae3-835c-385ac1d26874",
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

`GET /api/rider/v1/orders/53c3c36f-60ed-4404-bcea-bcee0313bd6f` → **200**

```json
{
  "id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "4ebab3ed-9034-4083-b775-3ebb73df7cb0",
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
    "id": "11d34788-dac5-4ae3-835c-385ac1d26874",
    "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c6b78213-4f1b-4dae-8eb9-9f1ea17fffdd",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:35:49.144538Z",
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
    "id": "689abd36-a6c2-4f0a-83ad-ad3025f95082",
    "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
    "expires_at": "2026-10-29T07:36:05.292449Z",
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

`POST /api/driver/v1/offers/689abd36-a6c2-4f0a-83ad-ad3025f95082/accept` → **200**

```json
{
  "command_id": "cb982942-66c8-4972-9c15-185e63bef86c"
}
```

```json
{
  "id": "c4fd4966-1f22-4d04-93ad-3a32fd9931cc",
  "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a655762-4567-4d58-94c6-f78ec9f44d7c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4a655762-4567-4d58-94c6-f78ec9f44d7c",
  "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
  "assignment_id": "c4fd4966-1f22-4d04-93ad-3a32fd9931cc",
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

`POST /api/driver/v1/trips/4a655762-4567-4d58-94c6-f78ec9f44d7c/cancel` → **200**

```json
{
  "command_id": "6d43e020-b99a-4204-ba42-102a8cdad949",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "4a655762-4567-4d58-94c6-f78ec9f44d7c",
  "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
  "assignment_id": "c4fd4966-1f22-4d04-93ad-3a32fd9931cc",
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
    "id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:35:49.144538Z",
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
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      }
    },
    "pickup_at": null
  },
  {
    "id": "cc3bdc32-dc54-4cdb-8c1d-dfcbe8d4f51f",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:35:46.180802Z",
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
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/53c3c36f-60ed-4404-bcea-bcee0313bd6f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:35:49.145233Z",
      "actor": {
        "type": "CLIENT",
        "id": "4ebab3ed-9034-4083-b775-3ebb73df7cb0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
        "quote_id": "01a9ef4d-3a66-47e6-9702-ac276c3206cf",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "503cec40-dbeb-4546-9dca-151a0a5cee48"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:35:49.147597Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
        "attempt_id": "c4285971-aa8a-4ede-8693-a8fd2714c566",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "503cec40-dbeb-4546-9dca-151a0a5cee48"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:35:49.154862Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a2b66979-5869-45e8-b590-6ecfabc77700",
        "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "503cec40-dbeb-4546-9dca-151a0a5cee48"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:35:49.718174Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a2b66979-5869-45e8-b590-6ecfabc77700",
        "order_id": "53c3c36f-60ed-4404-bcea-bcee0313bd6f",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "11d34788-dac5-4ae3-835c-385ac1d26874"
      },
      "correlation_id": "fc987a5b-d162-4848-a11f-234c9233c060"
```

Done: orders cc3bdc32-dc54-4cdb-8c1d-dfcbe8d4f51f, 53c3c36f-60ed-4404-bcea-bcee0313bd6f.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738689291",
  "device_ref": "sandbox-27840"
}
```

```json
{
  "challenge_id": "72911515-d183-4512-b5e3-fef8c610cc4d",
  "expires_at": "2026-10-29T07:40:52.601239521Z",
  "resend_available_at": "2026-10-29T07:35:53.601239521Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738689291` → **200**

```json
{
  "phone": "+380738689291",
  "audience": "CLIENT",
  "code": "412643",
  "sent_at": "2026-10-29T07:35:52.604232713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72911515-d183-4512-b5e3-fef8c610cc4d",
  "code": "412643",
  "device_ref": "sandbox-27840"
}
```

```json
{
  "session_id": "7dc02756-d4af-4dde-921a-63e74f4e2d0a",
  "subject": {
    "type": "CLIENT",
    "id": "626da9cd-23b6-4083-9bcc-e8e75ab80092"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjZkYTljZC0yM2I2LTQwODMtOWJjYy1lOGU3NWFiODAwOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjUyLCJpYXQiOjE3OTMyNTkzNTIsImp0aSI6IjY3OTMyNTViLTM3ZWItNDYxZi04Mjc5LTg0ZWZjNGI1NDlkOSIsInNpZCI6IjdkYzAyNzU2LWQ0YWYtNGRkZS05MjFhLTYzZTc0ZjRlMmQwYSJ9.bhjtRYjx2AvQqIi3N1PR2FqzZ3KTxv0PS21AmR7Sub8",
  "access_expires_at": "2026-10-29T07:50:52.897405813Z",
  "refresh_token": "iVmgq4l94h-u5SWvVX0Wz-L9o3UUnbbEFoQs5RFBYw4",
  "refresh_expires_at": "2026-11-28T07:35:52.896814339Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a3d1b7f1-3f43-4a96-849d-93f0c8a69ae6",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "68d52587-962b-40cb-8f2e-3f2687b01d7b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-68d52587-962b-40cb-8f2e-3f2687b01d7b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "dedf0582c8eddb4040797b2da97709ee",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=68d52587-962b-40cb-8f2e-3f2687b01d7b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738689291"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=68d52587-962b-40cb-8f2e-3f2687b01d7b",
  "expires_at": "2026-10-29T08:05:53.178833Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/68d52587-962b-40cb-8f2e-3f2687b01d7b` → **200**

```json
{
  "id": "68d52587-962b-40cb-8f2e-3f2687b01d7b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:05:53.178833Z",
  "card": {
    "id": "1d2bc346-180b-4d0b-9ad8-4e6d6b876f70",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5681",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:35:53.47363Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "1d2bc346-180b-4d0b-9ad8-4e6d6b876f70",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5681",
      "card_type": "Visa",
      "created_at": "2026-10-29T07:35:53.47363Z"
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
  "device_ref": "sandbox-6580"
}
```

```json
{
  "challenge_id": "1b4ddf3d-2a4a-4821-8ab9-cdf93f15bf0b",
  "expires_at": "2026-10-29T07:40:54.055495706Z",
  "resend_available_at": "2026-10-29T07:35:55.055495706Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "176860",
  "sent_at": "2026-10-29T07:35:54.059039032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b4ddf3d-2a4a-4821-8ab9-cdf93f15bf0b",
  "code": "176860",
  "device_ref": "sandbox-6580"
}
```

```json
{
  "session_id": "ead78b37-f30d-4cdf-9fc2-4d6c28a0c52e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI1NCwiaWF0IjoxNzkzMjU5MzU0LCJqdGkiOiJmZTc0NzY0ZC0zNDE5LTQ3YmUtYTY5NC0xYmFlZDlmMDUxZTciLCJzaWQiOiJlYWQ3OGIzNy1mMzBkLTRjZGYtOWZjMi00ZDZjMjhhMGM1MmUifQ.RMlbuj4CGJe1k1vjWi5zeaA0cZY1otWDCSSn_CNp9rQ",
  "access_expires_at": "2026-10-29T07:50:54.362161897Z",
  "refresh_token": "H7PpP0nD_dlIZQwcKtjwEiqsEDlPoCo81NqVkuJoTpc",
  "refresh_expires_at": "2026-11-28T07:35:54.361595313Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51282ad3-af07-4f92-b246-c211116056dd",
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
  "last_heartbeat_at": "2026-10-29T07:35:48.548789Z",
  "last_location_at": "2026-10-29T07:35:48.548789Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51282ad3-af07-4f92-b246-c211116056dd/handover` → **200**

```json
{
  "command_id": "fef1907f-0d2c-4a3c-87fb-2b2e84ea22e2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51282ad3-af07-4f92-b246-c211116056dd",
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
  "last_heartbeat_at": "2026-10-29T07:35:48.548789Z",
  "last_location_at": "2026-10-29T07:35:48.548789Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51282ad3-af07-4f92-b246-c211116056dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:55Z",
    "sequence": 1793259355230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51282ad3-af07-4f92-b246-c211116056dd",
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
  "last_heartbeat_at": "2026-10-29T07:35:55.249283Z",
  "last_location_at": "2026-10-29T07:35:55.249283Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5dd6ba00-1b98-412f-818c-8f4421cc8f3b",
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
  "id": "b10ee1ba-dce6-43cf-912e-bf0dc41f9111",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:55.539667Z",
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
  "command_id": "366314b0-44cb-4c72-a108-69912ec65756",
  "quote_id": "b10ee1ba-dce6-43cf-912e-bf0dc41f9111",
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
  "id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
  "created_at": "2026-10-29T07:35:55.846963Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dd03d7dc-378c-4268-b1ec-0a2e2462a231` → **200**

```json
{
  "id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
  "created_at": "2026-10-29T07:35:55.846963Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dd03d7dc-378c-4268-b1ec-0a2e2462a231` → **200**

```json
{
  "id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
  "created_at": "2026-10-29T07:35:55.846963Z",
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
    "id": "479f0b2f-d5c4-4818-ba7b-b656c9ffedbd",
    "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
    "expires_at": "2026-10-29T07:36:11.191894Z",
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

`POST /api/driver/v1/offers/479f0b2f-d5c4-4818-ba7b-b656c9ffedbd/accept` → **200**

```json
{
  "command_id": "913ece43-9f35-4cdb-b249-002109290255"
}
```

```json
{
  "id": "49e632e9-87d6-4013-8c27-c7036629bb5b",
  "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b",
  "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "assignment_id": "49e632e9-87d6-4013-8c27-c7036629bb5b",
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

`POST /api/driver/v1/work-sessions/51282ad3-af07-4f92-b246-c211116056dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:58Z",
    "sequence": 1793259358583
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51282ad3-af07-4f92-b246-c211116056dd",
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
  "last_heartbeat_at": "2026-10-29T07:35:58.604416Z",
  "last_location_at": "2026-10-29T07:35:58.604416Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b/arrive` → **200**

```json
{
  "command_id": "423dd480-0d04-469e-a32f-677c72da6e76",
  "expected_version": 0
}
```

```json
{
  "id": "ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b",
  "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "assignment_id": "49e632e9-87d6-4013-8c27-c7036629bb5b",
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
  "arrived_at": "2026-10-29T07:35:58.900596Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b/start` → **200**

```json
{
  "command_id": "3bd9601e-401e-4226-a8f7-c6515cebcd0e",
  "expected_version": 1
}
```

```json
{
  "id": "ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b",
  "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "assignment_id": "49e632e9-87d6-4013-8c27-c7036629bb5b",
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
  "arrived_at": "2026-10-29T07:35:58.900596Z",
  "started_at": "2026-10-29T07:35:59.188465Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b/complete` → **200**

```json
{
  "command_id": "258d107d-9dc8-4d08-aea9-7666363df87e",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:35:59Z",
  "cash_received": true
}
```

```json
{
  "id": "ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b",
  "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "assignment_id": "49e632e9-87d6-4013-8c27-c7036629bb5b",
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
  "arrived_at": "2026-10-29T07:35:58.900596Z",
  "started_at": "2026-10-29T07:35:59.188465Z",
  "completed_at": "2026-10-29T07:35:59.49135Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/dd03d7dc-378c-4268-b1ec-0a2e2462a231` → **200**

```json
{
  "id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
    "id": "49e632e9-87d6-4013-8c27-c7036629bb5b",
    "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:35:55.846963Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dd03d7dc-378c-4268-b1ec-0a2e2462a231` → **200**

```json
{
  "id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
    "id": "49e632e9-87d6-4013-8c27-c7036629bb5b",
    "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:35:55.846963Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dd03d7dc-378c-4268-b1ec-0a2e2462a231` → **200**

```json
{
  "id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
    "id": "49e632e9-87d6-4013-8c27-c7036629bb5b",
    "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ed8ce175-bc1b-4718-ac19-7bbe15c2cb0b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:35:55.846963Z",
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

`GET /api/rider/v1/orders/dd03d7dc-378c-4268-b1ec-0a2e2462a231/tip` → **200**

```json
{
  "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
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
  "available_until": "2026-10-30T07:35:59.49135Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/dd03d7dc-378c-4268-b1ec-0a2e2462a231/tip` → **201**

```json
{
  "command_id": "f538ccf1-387d-403c-baf8-0de0eea9567d",
  "amount_minor": 2500
}
```

```json
{
  "id": "7a082ac1-1bbf-4c7b-af22-fc723a94de72",
  "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:36:03.256709Z"
}
```

`GET /api/rider/v1/orders/dd03d7dc-378c-4268-b1ec-0a2e2462a231/tip` → **200**

```json
{
  "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
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
  "available_until": "2026-10-30T07:35:59.49135Z",
  "open": false,
  "tip": {
    "id": "7a082ac1-1bbf-4c7b-af22-fc723a94de72",
    "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:36:03.256709Z"
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
      "id": "357944d0-121a-4e80-bbea-c43b040c1a09",
      "at": "2026-10-29T07:36:00.257113Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
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
      "id": "88f26d9f-df2e-42f7-b1a6-b3c7a1bcaf14",
      "at": "2026-10-29T07:36:04.306024Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
      "counterpart_id": null
    },
    {
      "id": "357944d0-121a-4e80-bbea-c43b040c1a09",
      "at": "2026-10-29T07:36:00.257113Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a79fcd3b-f1cf-4cc1-addc-25a613a0a1c8",
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
  "id": "cfc63632-4fb4-43fa-8864-f66da75bdba2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:05.401221Z",
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
  "session_id": "5c7e01d9-ea08-4b0a-beb3-783d7992ff2c",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNjUsImlhdCI6MTc5MzI1OTM2NSwianRpIjoiOGM4ODljNTctNDU2Mi00MGJlLWFlMzgtMTgwNjhkN2ZiNmViIiwic2lkIjoiNWM3ZTAxZDktZWEwOC00YjBhLWJlYjMtNzgzZDc5OTJmZjJjIn0.Q6pF2KpYbangc1_CVNH4P3n6nGVEb1bPUwkgiX4ZYCg",
  "access_expires_at": "2026-10-29T07:51:05.995606834Z",
  "refresh_token": "xCd69zDWY1Z-TvmB4QQyIvH7UNa356y7fW8CId7mKtk",
  "refresh_expires_at": "2026-10-29T19:36:05.995007867Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738689291` → **200**

```json
{
  "client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092"
}
```

`POST /api/admin/v1/rider-wallets/626da9cd-23b6-4083-9bcc-e8e75ab80092/top-ups` → **201**

```json
{
  "command_id": "02c902d0-feb2-48ab-9b46-3fb429df7b52",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
      "id": "e564bd8c-afe5-41b8-8582-517e51c97598",
      "at": "2026-10-29T07:36:06.558001Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "635cfa0f-91d2-49f9-8dd0-33d6c1064ffb",
  "quote_id": "cfc63632-4fb4-43fa-8864-f66da75bdba2",
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
  "id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
  "created_at": "2026-10-29T07:36:06.852752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dabf14e9-e7fd-4aa2-98d5-6b91286fe498` → **200**

```json
{
  "id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
  "created_at": "2026-10-29T07:36:06.852752Z",
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
    "id": "58dc662f-efd4-4660-8eeb-a929338f16a5",
    "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
    "expires_at": "2026-10-29T07:36:21.858309Z",
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

`POST /api/driver/v1/offers/58dc662f-efd4-4660-8eeb-a929338f16a5/accept` → **200**

```json
{
  "command_id": "9642e7ff-595b-49d7-915d-438b7fc28b60"
}
```

```json
{
  "id": "5e2191bd-d0fc-4527-818e-8e4c30975299",
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e8ab0621-ca80-4717-ac73-9314dea687ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e8ab0621-ca80-4717-ac73-9314dea687ac",
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
  "assignment_id": "5e2191bd-d0fc-4527-818e-8e4c30975299",
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

`POST /api/driver/v1/work-sessions/51282ad3-af07-4f92-b246-c211116056dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:36:08Z",
    "sequence": 1793259368281
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51282ad3-af07-4f92-b246-c211116056dd",
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
  "last_heartbeat_at": "2026-10-29T07:36:08.300636Z",
  "last_location_at": "2026-10-29T07:36:08.300636Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e8ab0621-ca80-4717-ac73-9314dea687ac/arrive` → **200**

```json
{
  "command_id": "f692d7d5-ca91-4f38-a0ef-ed5a7914e222",
  "expected_version": 0
}
```

```json
{
  "id": "e8ab0621-ca80-4717-ac73-9314dea687ac",
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
  "assignment_id": "5e2191bd-d0fc-4527-818e-8e4c30975299",
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
  "arrived_at": "2026-10-29T07:36:08.582212Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e8ab0621-ca80-4717-ac73-9314dea687ac/start` → **200**

```json
{
  "command_id": "47a72a34-b131-4898-a376-4310e22495b6",
  "expected_version": 1
}
```

```json
{
  "id": "e8ab0621-ca80-4717-ac73-9314dea687ac",
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
  "assignment_id": "5e2191bd-d0fc-4527-818e-8e4c30975299",
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
  "arrived_at": "2026-10-29T07:36:08.582212Z",
  "started_at": "2026-10-29T07:36:08.904808Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e8ab0621-ca80-4717-ac73-9314dea687ac/complete` → **200**

```json
{
  "command_id": "8badb071-f8c7-4239-82c7-b21ae49737da",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:36:09Z",
  "cash_received": true
}
```

```json
{
  "id": "e8ab0621-ca80-4717-ac73-9314dea687ac",
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
  "assignment_id": "5e2191bd-d0fc-4527-818e-8e4c30975299",
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
  "arrived_at": "2026-10-29T07:36:08.582212Z",
  "started_at": "2026-10-29T07:36:08.904808Z",
  "completed_at": "2026-10-29T07:36:09.204773Z",
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
  "client_id": "626da9cd-23b6-4083-9bcc-e8e75ab80092",
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
      "id": "0b23006d-ed93-4ba6-9946-c3a195e585fc",
      "at": "2026-10-29T07:36:09.356859Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498"
    },
    {
      "id": "e564bd8c-afe5-41b8-8582-517e51c97598",
      "at": "2026-10-29T07:36:06.558001Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
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

`GET /api/rider/v1/orders/dabf14e9-e7fd-4aa2-98d5-6b91286fe498/tip` → **200**

```json
{
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
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
  "available_until": "2026-10-30T07:36:09.204773Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/dabf14e9-e7fd-4aa2-98d5-6b91286fe498/tip` → **201**

```json
{
  "command_id": "e3d672e4-38cb-48ba-9165-0a37ec36abac",
  "amount_minor": 2500
}
```

```json
{
  "id": "1b8874a4-b883-40e3-97e8-d87014d43f44",
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:36:10.367277Z"
}
```

`GET /api/rider/v1/orders/dabf14e9-e7fd-4aa2-98d5-6b91286fe498/tip` → **200**

```json
{
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
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
  "available_until": "2026-10-30T07:36:09.204773Z",
  "open": false,
  "tip": {
    "id": "1b8874a4-b883-40e3-97e8-d87014d43f44",
    "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T07:36:10.367277Z"
  }
}
```

`GET /api/rider/v1/orders/dabf14e9-e7fd-4aa2-98d5-6b91286fe498/tip` → **200**

```json
{
  "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
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
  "available_until": "2026-10-30T07:36:09.204773Z",
  "open": false,
  "tip": {
    "id": "1b8874a4-b883-40e3-97e8-d87014d43f44",
    "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:36:10.367277Z"
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
      "id": "855b5fc6-39dd-404c-a3cc-ecf4041947c1",
      "at": "2026-10-29T07:36:09.349638Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
      "counterpart_id": null
    },
    {
      "id": "88f26d9f-df2e-42f7-b1a6-b3c7a1bcaf14",
      "at": "2026-10-29T07:36:04.306024Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
      "counterpart_id": null
    },
    {
      "id": "357944d0-121a-4e80-bbea-c43b040c1a09",
      "at": "2026-10-29T07:36:00.257113Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
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
      "id": "05fcff4b-4d59-412c-b819-53f389207fee",
      "at": "2026-10-29T07:36:12.379542Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
      "counterpart_id": null
    },
    {
      "id": "855b5fc6-39dd-404c-a3cc-ecf4041947c1",
      "at": "2026-10-29T07:36:09.349638Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dabf14e9-e7fd-4aa2-98d5-6b91286fe498",
      "counterpart_id": null
    },
    {
      "id": "88f26d9f-df2e-42f7-b1a6-b3c7a1bcaf14",
      "at": "2026-10-29T07:36:04.306024Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
      "counterpart_id": null
    },
    {
      "id": "357944d0-121a-4e80-bbea-c43b040c1a09",
      "at": "2026-10-29T07:36:00.257113Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "dd03d7dc-378c-4268-b1ec-0a2e2462a231",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "51282ad3-af07-4f92-b246-c211116056dd",
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
  "last_heartbeat_at": "2026-10-29T07:36:08.300636Z",
  "last_location_at": "2026-10-29T07:36:08.300636Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51282ad3-af07-4f92-b246-c211116056dd/close` → **200**

```json
{
  "command_id": "1e99cfad-f0f3-4abe-8b28-54428aa9796f",
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

Done: card order dabf14e9-e7fd-4aa2-98d5-6b91286fe498.

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
  "phone": "+380737983050",
  "device_ref": "sandbox-5202"
}
```

```json
{
  "challenge_id": "c4f6ee72-d1fb-4d71-b475-a263ab13df9e",
  "expires_at": "2026-10-29T07:41:14.655275814Z",
  "resend_available_at": "2026-10-29T07:36:15.655275814Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737983050` → **200**

```json
{
  "phone": "+380737983050",
  "audience": "CLIENT",
  "code": "692203",
  "sent_at": "2026-10-29T07:36:14.65785363Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4f6ee72-d1fb-4d71-b475-a263ab13df9e",
  "code": "692203",
  "device_ref": "sandbox-5202"
}
```

```json
{
  "session_id": "bd70d233-1c3b-45e5-b617-ddd995abe597",
  "subject": {
    "type": "CLIENT",
    "id": "36b9b5bb-86a3-46fd-b8d0-465bf63ba304"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNmI5YjViYi04NmEzLTQ2ZmQtYjhkMC00NjViZjYzYmEzMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjc0LCJpYXQiOjE3OTMyNTkzNzQsImp0aSI6IjE2MjViNzMyLTNhZjQtNDEwYS1hMjcwLTRhYWZkMDMyNmU5NiIsInNpZCI6ImJkNzBkMjMzLTFjM2ItNDVlNS1iNjE3LWRkZDk5NWFiZTU5NyJ9.Ui9RBM5H5tWo_P_kIPU4Mr2Ihco0JU30mghu3tb7Qqc",
  "access_expires_at": "2026-10-29T07:51:14.967946114Z",
  "refresh_token": "oj_iCUm6GjIwd1qQrHwaa6euAdlLrYK_WjHMk2wcaXI",
  "refresh_expires_at": "2026-11-28T07:36:14.967384656Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "6419a7a4-9128-49d0-a1fc-f3a357907343",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "e86c1531-1506-4168-a2eb-9802278d4801",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e86c1531-1506-4168-a2eb-9802278d4801",
    "orderDate": "1793259375",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "03aab75fca2d8f97813563dce182ff5a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e86c1531-1506-4168-a2eb-9802278d4801",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737983050"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e86c1531-1506-4168-a2eb-9802278d4801",
  "created_at": "2026-10-29T07:36:15.256011Z",
  "expires_at": "2026-10-29T08:06:15.256011Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/e86c1531-1506-4168-a2eb-9802278d4801` → **200**

```json
{
  "id": "e86c1531-1506-4168-a2eb-9802278d4801",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:36:15.256011Z",
  "expires_at": "2026-10-29T08:06:15.256011Z",
  "completed_at": "2026-10-29T07:36:15.544939Z",
  "masked_pan": "41****1837",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "36b9b5bb-86a3-46fd-b8d0-465bf63ba304",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "36b9b5bb-86a3-46fd-b8d0-465bf63ba304",
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
      "id": "60e3b8ce-4172-4986-ab02-a004bba8714c",
      "at": "2026-10-29T07:36:16.396305Z",
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
  "client_id": "36b9b5bb-86a3-46fd-b8d0-465bf63ba304",
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
      "id": "60e3b8ce-4172-4986-ab02-a004bba8714c",
      "at": "2026-10-29T07:36:16.396305Z",
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
  "device_ref": "sandbox-28903"
}
```

```json
{
  "challenge_id": "a18a3d26-f375-4bc6-ae7f-a0a00d3a118f",
  "expires_at": "2026-10-29T07:41:17.713648743Z",
  "resend_available_at": "2026-10-29T07:36:18.713648743Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "626198",
  "sent_at": "2026-10-29T07:36:17.716550815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a18a3d26-f375-4bc6-ae7f-a0a00d3a118f",
  "code": "626198",
  "device_ref": "sandbox-28903"
}
```

```json
{
  "session_id": "1aa69c39-4163-44f5-abd7-221fc87f05eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI3OCwiaWF0IjoxNzkzMjU5Mzc4LCJqdGkiOiIyYTE2OWU2ZS0xM2Q4LTQ2YWQtODE4Ni02MTM2YzU2NzMxMzgiLCJzaWQiOiIxYWE2OWMzOS00MTYzLTQ0ZjUtYWJkNy0yMjFmYzg3ZjA1ZWIifQ.Jyqec4R9m0ewnlgUm_y-EQ6zu7dSbBV3Czl0qIJb8TA",
  "access_expires_at": "2026-10-29T07:51:18.022550296Z",
  "refresh_token": "wk6xmiRupE9qOFeTh0VkStlG5cBYdjjtFtSG3qe5Tew",
  "refresh_expires_at": "2026-11-28T07:36:18.021959002Z",
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
  "command_id": "5441ce82-fafa-483c-8b8f-e2d919a3dd1a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "34e18c6e-4692-4dc2-b1a0-53bc5b818bd3",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-34e18c6e-4692-4dc2-b1a0-53bc5b818bd3",
    "orderDate": "1793259378",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "0c1eb3dc46c9444788764ad0d631de8f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=34e18c6e-4692-4dc2-b1a0-53bc5b818bd3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=34e18c6e-4692-4dc2-b1a0-53bc5b818bd3",
  "created_at": "2026-10-29T07:36:18.580839Z",
  "expires_at": "2026-10-29T08:06:18.580839Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/34e18c6e-4692-4dc2-b1a0-53bc5b818bd3` → **200**

```json
{
  "id": "34e18c6e-4692-4dc2-b1a0-53bc5b818bd3",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:36:18.580839Z",
  "expires_at": "2026-10-29T08:06:18.580839Z",
  "completed_at": "2026-10-29T07:36:18.855881Z",
  "masked_pan": "41****5560",
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
      "id": "58140454-79b5-41ba-a025-0ab96169b354",
      "at": "2026-10-29T07:36:19.403758Z",
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
  "command_id": "012cb2d7-d28b-499e-af10-125c5f491f31",
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
  "correlation_id": "c3827093-98d2-4e49-b957-7958eabad18f"
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
  "device_ref": "sandbox-3248"
}
```

```json
{
  "challenge_id": "77a2e80f-fca4-4e7c-a3d2-c2596c5f49f0",
  "expires_at": "2026-10-29T07:41:21.018030118Z",
  "resend_available_at": "2026-10-29T07:36:22.018030118Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "907580",
  "sent_at": "2026-10-29T07:36:21.021614685Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77a2e80f-fca4-4e7c-a3d2-c2596c5f49f0",
  "code": "907580",
  "device_ref": "sandbox-3248"
}
```

```json
{
  "session_id": "21895691-375a-482e-97bd-881c7fb7bfbf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI4MSwiaWF0IjoxNzkzMjU5MzgxLCJqdGkiOiI5YmFiOTYzYi1mNDliLTRjZTUtOGJhNi1iNzY2NDg4MTlmNzIiLCJzaWQiOiIyMTg5NTY5MS0zNzVhLTQ4MmUtOTdiZC04ODFjN2ZiN2JmYmYifQ.KCODGknX4efRiSy_vCf8ZGa0yhzCM-__3lLV7TUuyew",
  "access_expires_at": "2026-10-29T07:51:21.322275785Z",
  "refresh_token": "_eNt7Xd4B2uPhnBRlUISVcKIkEQXHGeN1OzBnTY2kyM",
  "refresh_expires_at": "2026-11-28T07:36:21.321602898Z",
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
  "command_id": "ba53ba2c-887e-4dfb-8939-3dfb8a02c016",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:36:21Z",
    "sequence": 1793259381873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55e3d4a6-b6c0-4b00-af9a-8492aff0eb01",
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
  "last_heartbeat_at": "2026-10-29T07:36:21.892873Z",
  "last_location_at": "2026-10-29T07:36:21.892873Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634129810",
  "device_ref": "sandbox-4230"
}
```

```json
{
  "challenge_id": "5b5772a7-7346-4bbc-afb8-ee553ca63202",
  "expires_at": "2026-10-29T07:41:22.17902099Z",
  "resend_available_at": "2026-10-29T07:36:23.17902099Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634129810` → **200**

```json
{
  "phone": "+380634129810",
  "audience": "CLIENT",
  "code": "285140",
  "sent_at": "2026-10-29T07:36:22.181559434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b5772a7-7346-4bbc-afb8-ee553ca63202",
  "code": "285140",
  "device_ref": "sandbox-4230"
}
```

```json
{
  "session_id": "efa25213-a89a-463d-b562-0545d77225d6",
  "subject": {
    "type": "CLIENT",
    "id": "d97a69c2-c84f-4e03-a90f-d1d8abc9a47b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTdhNjljMi1jODRmLTRlMDMtYTkwZi1kMWQ4YWJjOWE0N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjgyLCJpYXQiOjE3OTMyNTkzODIsImp0aSI6IjgwYTM1MTc0LWU3YTEtNDU2MC1hNjQ2LThkZDFmMGRjN2VkNiIsInNpZCI6ImVmYTI1MjEzLWE4OWEtNDYzZC1iNTYyLTA1NDVkNzcyMjVkNiJ9.BODvF_b_7_ZrSl59sqDdyCV2EfKmX7THP8xkBuM9vh8",
  "access_expires_at": "2026-10-29T07:51:22.482338417Z",
  "refresh_token": "K3fckvZzLaLbECkM2i_k36NC5cAz9ocQZBTnIpRSgGU",
  "refresh_expires_at": "2026-11-28T07:36:22.481679944Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "79347d2c-201e-4fc9-885e-369983732227",
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
  "id": "c398d2b2-1371-4b89-88c5-3c6f082941cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:22.769162Z",
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
  "command_id": "6693f259-dbfa-4fc1-8747-3434b55b904a",
  "quote_id": "c398d2b2-1371-4b89-88c5-3c6f082941cc",
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
  "id": "a7fe2578-9017-4e44-8680-cb84693b890a",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d97a69c2-c84f-4e03-a90f-d1d8abc9a47b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:36:23.062553Z",
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
    "id": "639534da-ade2-498a-b55b-28afa0b3a350",
    "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
    "expires_at": "2026-10-29T07:36:38.065834Z",
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

`POST /api/driver/v1/offers/639534da-ade2-498a-b55b-28afa0b3a350/accept` → **200**

```json
{
  "command_id": "87dbd0b6-d2fd-423c-b410-915825ad1d61"
}
```

```json
{
  "id": "22f4b443-0419-4c75-90a6-7656e458dd1b",
  "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f0cd8ef9-8212-47fc-88e5-a37babcebb10",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f0cd8ef9-8212-47fc-88e5-a37babcebb10",
  "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
  "assignment_id": "22f4b443-0419-4c75-90a6-7656e458dd1b",
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

`POST /api/driver/v1/work-sessions/55e3d4a6-b6c0-4b00-af9a-8492aff0eb01/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:36:24Z",
    "sequence": 1793259384197
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55e3d4a6-b6c0-4b00-af9a-8492aff0eb01",
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
  "last_heartbeat_at": "2026-10-29T07:36:24.216455Z",
  "last_location_at": "2026-10-29T07:36:24.216455Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f0cd8ef9-8212-47fc-88e5-a37babcebb10/arrive` → **200**

```json
{
  "command_id": "98bba5da-4a1b-4ece-ac08-1107b33924a3",
  "expected_version": 0
}
```

```json
{
  "id": "f0cd8ef9-8212-47fc-88e5-a37babcebb10",
  "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
  "assignment_id": "22f4b443-0419-4c75-90a6-7656e458dd1b",
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
  "arrived_at": "2026-10-29T07:36:24.505461Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f0cd8ef9-8212-47fc-88e5-a37babcebb10/start` → **200**

```json
{
  "command_id": "7a636633-9497-4fe5-87fb-30f4551c6e7d",
  "expected_version": 1
}
```

```json
{
  "id": "f0cd8ef9-8212-47fc-88e5-a37babcebb10",
  "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
  "assignment_id": "22f4b443-0419-4c75-90a6-7656e458dd1b",
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
  "arrived_at": "2026-10-29T07:36:24.505461Z",
  "started_at": "2026-10-29T07:36:24.800009Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f0cd8ef9-8212-47fc-88e5-a37babcebb10/complete` → **200**

```json
{
  "command_id": "7063573e-c6e3-4804-b77c-85126e4ea2e2",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:36:25Z",
  "cash_received": false
}
```

```json
{
  "id": "f0cd8ef9-8212-47fc-88e5-a37babcebb10",
  "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
  "assignment_id": "22f4b443-0419-4c75-90a6-7656e458dd1b",
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
  "arrived_at": "2026-10-29T07:36:24.505461Z",
  "started_at": "2026-10-29T07:36:24.800009Z",
  "completed_at": "2026-10-29T07:36:25.102665Z",
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
  "session_id": "5b5ab74a-03f4-429a-a755-836d85229a6c",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyODUsImlhdCI6MTc5MzI1OTM4NSwianRpIjoiZTgzMDlkYzQtZDQ5Ni00ZGNiLWJiNmUtMDM0MTZhMjlkMjcyIiwic2lkIjoiNWI1YWI3NGEtMDNmNC00MjlhLWE3NTUtODM2ZDg1MjI5YTZjIn0.MzrEuXqQYB_USw2LDuqpANssPXaROet6hzg-YfYXjXE",
  "access_expires_at": "2026-10-29T07:51:25.698109633Z",
  "refresh_token": "0OKGu-ax2boCyqVBzH-wl8ewUMENXy3Kcen7ti1kn4c",
  "refresh_expires_at": "2026-10-29T19:36:25.697573708Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a7fe2578-9017-4e44-8680-cb84693b890a/cash-dispute` → **200**

```json
{
  "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "d97a69c2-c84f-4e03-a90f-d1d8abc9a47b",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:36:25.455661Z",
  "decide_by": "2026-11-12T07:36:25.455661Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T07:36:25.455661Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "d97a69c2-c84f-4e03-a90f-d1d8abc9a47b",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T07:36:25.455661Z",
      "decide_by": "2026-11-12T07:36:25.455661Z",
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

`POST /api/admin/v1/orders/a7fe2578-9017-4e44-8680-cb84693b890a/cash-dispute/decide` → **400**

```json
{
  "command_id": "f7036ea0-9549-457a-8825-f02d7fc2ea87",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/a7fe2578-9017-4e44-8680-cb84693b890a/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a1fc33de-e496-4848-9424-a0f4c4e37357",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/a7fe2578-9017-4e44-8680-cb84693b890a/cash-dispute/decide` → **200**

```json
{
  "command_id": "8c9ed11b-5c01-420b-84d0-bb0208f9daed",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "d97a69c2-c84f-4e03-a90f-d1d8abc9a47b",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:36:25.455661Z",
  "decide_by": "2026-11-12T07:36:25.455661Z",
  "decision": "PAY_DRIVER",
  "decided_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T07:36:26.994695Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/a7fe2578-9017-4e44-8680-cb84693b890a/cash-dispute/decide` → **409**

```json
{
  "command_id": "fa256602-6ffd-4ce0-a264-3ff3f6d374f6",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a7fe2578-9017-4e44-8680-cb84693b890a/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cb402500-1f9a-4a5e-a9bb-ec01b4db74e6"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "55e3d4a6-b6c0-4b00-af9a-8492aff0eb01",
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
  "last_heartbeat_at": "2026-10-29T07:36:24.216455Z",
  "last_location_at": "2026-10-29T07:36:24.216455Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/55e3d4a6-b6c0-4b00-af9a-8492aff0eb01/close` → **200**

```json
{
  "command_id": "8a0d32d1-f892-4160-9a53-f3cd636cbfcc",
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
  "session_id": "d13446ea-a039-42c7-a6c4-4829cf191bd2",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyODgsImlhdCI6MTc5MzI1OTM4OCwianRpIjoiMWU3MjE4MjctYmQ4MC00NGI3LTk2YjQtMzE5NDE4MTFhNDc1Iiwic2lkIjoiZDEzNDQ2ZWEtYTAzOS00MmM3LWE2YzQtNDgyOWNmMTkxYmQyIn0.XIOFZ3CVAClF4cM4GGSrzUToRybbciQxRetGTAPVYT4",
  "access_expires_at": "2026-10-29T07:51:28.488576564Z",
  "refresh_token": "V02RZhAMJ8OagR3veAwOP7ifcNeDZi6IkaENgEwrThY",
  "refresh_expires_at": "2026-10-29T19:36:28.48798526Z",
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
  "phone": "+48600422677",
  "device_ref": "sandbox-13460"
}
```

```json
{
  "challenge_id": "bee9ca7e-5b3d-461e-868f-38577fe6e73d",
  "expires_at": "2026-10-29T07:41:29.388844827Z",
  "resend_available_at": "2026-10-29T07:36:30.388844827Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600422677` → **200**

```json
{
  "phone": "+48600422677",
  "audience": "CLIENT",
  "code": "172965",
  "sent_at": "2026-10-29T07:36:29.39174551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bee9ca7e-5b3d-461e-868f-38577fe6e73d",
  "code": "172965",
  "device_ref": "sandbox-13460"
}
```

```json
{
  "session_id": "a0762f85-bfc1-4da1-aff1-0540207db21c",
  "subject": {
    "type": "CLIENT",
    "id": "aeb42acf-ab9a-4060-942a-2daecd734b42"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZWI0MmFjZi1hYjlhLTQwNjAtOTQyYS0yZGFlY2Q3MzRiNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjg5LCJpYXQiOjE3OTMyNTkzODksImp0aSI6Ijg1MzllNjc1LTllMGEtNDg3Yi1iZjdiLWU0YjE2ODVkNDgwOCIsInNpZCI6ImEwNzYyZjg1LWJmYzEtNGRhMS1hZmYxLTA1NDAyMDdkYjIxYyJ9.6edom_UaquBvT5BcmifOBI6W8aNDvdjTLaDTS4-0MvY",
  "access_expires_at": "2026-10-29T07:51:29.700969148Z",
  "refresh_token": "59BexnNd5D4GCV4dCyBHG7wdW4qSg6KnNrzvdqvzf04",
  "refresh_expires_at": "2026-11-28T07:36:29.700433689Z",
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
  "command_id": "8d683cd4-205c-4052-8ebe-99930c812d33",
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
  "correlation_id": "c925a225-74f3-40cd-bc54-529a2623938e",
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
  "command_id": "0175ef45-8da3-4621-9b71-dbde9a75d5f3",
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
  "paused_at": "2026-10-29T07:36:30.859104397Z",
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
  "command_id": "003db884-21f4-46d3-b6c8-95ba6a7f794e",
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
  "id": "acc23206-8e3b-4225-9e2b-92842cd19411",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:31.468427Z",
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
  "command_id": "c885b772-22fe-4d89-b916-7ee4b0eb0981",
  "quote_id": "acc23206-8e3b-4225-9e2b-92842cd19411",
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
  "correlation_id": "bc717f33-fa06-4f5c-a54d-152e77d82a72"
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
  "paused_at": "2026-10-29T07:36:30.859104Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "a4ae2af3-4bba-4124-a072-8887d124c8da",
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
  "command_id": "df366dcd-c99c-4969-863d-f9bbb90b44bc",
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
  "command_id": "5d410bf0-4e61-400e-919a-2b78d97573e6",
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
  "id": "babd90fb-047b-49ca-a126-6f0f4a486503",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:33.260153Z",
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
  "command_id": "e7fd3102-de53-43d1-9172-89a42170b98a",
  "quote_id": "babd90fb-047b-49ca-a126-6f0f4a486503",
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
  "correlation_id": "6a7689c1-d2e0-466e-bca2-7e5cd35c90b3"
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
  "command_id": "80956733-e131-40ea-bd7c-157abbb29cd3",
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
  "command_id": "14ea0eb1-934c-4d04-89a1-f380abd733d9",
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
  "id": "515e4740-f628-4ec3-96d4-f66babe90f41",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:34.430997Z",
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
  "command_id": "8963c266-95bb-4512-b865-844868b15a81",
  "quote_id": "515e4740-f628-4ec3-96d4-f66babe90f41",
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
  "correlation_id": "f157988a-bf7f-4652-981c-14379138483e"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "a4a7b12c-13b0-4ddf-9eb8-95e1c9b79a8f",
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
  "correlation_id": "224090e6-d380-45a6-bffb-e73411eaf2f4"
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
  "command_id": "bbcf9b82-b9d2-487f-a899-58c09fd3d901",
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
  "phone": "+380670519666",
  "device_ref": "sandbox-13380"
}
```

```json
{
  "challenge_id": "6d0cd6b7-1264-4637-b16d-aeb86075517d",
  "expires_at": "2026-10-29T07:41:35.876643462Z",
  "resend_available_at": "2026-10-29T07:36:36.876643462Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670519666` → **200**

```json
{
  "phone": "+380670519666",
  "audience": "CLIENT",
  "code": "259093",
  "sent_at": "2026-10-29T07:36:35.878693012Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d0cd6b7-1264-4637-b16d-aeb86075517d",
  "code": "259093",
  "device_ref": "sandbox-13380"
}
```

```json
{
  "session_id": "57a14605-c336-4680-8a4f-8e53136d6f8e",
  "subject": {
    "type": "CLIENT",
    "id": "71af54ee-19b0-4199-acca-9049aecc2083"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MWFmNTRlZS0xOWIwLTQxOTktYWNjYS05MDQ5YWVjYzIwODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjk2LCJpYXQiOjE3OTMyNTkzOTYsImp0aSI6IjdmY2I3MDg5LTZlNTctNDQ0My1hMTJhLWNhMTQ5NWNkZTBhNyIsInNpZCI6IjU3YTE0NjA1LWMzMzYtNDY4MC04YTRmLThlNTMxMzZkNmY4ZSJ9.2d7LaQ02FNuYWQYMu1TgcYTHQd1Bp1JbSF3IAEiJuT4",
  "access_expires_at": "2026-10-29T07:51:36.178692467Z",
  "refresh_token": "I3QgV_hAPB9Pyoeym20Fd444DkycaORk_RcJQ_ViTQE",
  "refresh_expires_at": "2026-11-28T07:36:36.178172918Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "71af54ee-19b0-4199-acca-9049aecc2083",
  "session_id": "57a14605-c336-4680-8a4f-8e53136d6f8e",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e67053b-f73e-4801-aa66-ad56d1cd05fb",
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
  "id": "859a5e4a-5e27-487f-ab1e-c24fac4ecfbf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:36.723079Z",
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
  "challenge_id": "fc56868f-a048-4315-836b-30af6393ddbe",
  "expires_at": "2026-10-29T07:41:39.010876323Z",
  "resend_available_at": "2026-10-29T07:36:40.010876323Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670519666` → **200**

```json
{
  "phone": "+380670519666",
  "audience": "CLIENT",
  "code": "612581",
  "sent_at": "2026-10-29T07:36:39.013155075Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "78a9583a-e045-4674-8c28-21e83a75bdf0",
  "challenge_id": "fc56868f-a048-4315-836b-30af6393ddbe",
  "otp_code": "612581"
}
```

```json
{
  "client_id": "71af54ee-19b0-4199-acca-9049aecc2083",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T07:36:39.337715976Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0c7bd2f5-ef28-4f75-bba1-c08c80ee68ba",
  "quote_id": "859a5e4a-5e27-487f-ab1e-c24fac4ecfbf",
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
  "correlation_id": "aa223850-7128-483a-b326-5676e3ef7e29"
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
  "session_id": "975c0242-ce77-41ff-9f28-b5cb7c7b1a65",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzMDAsImlhdCI6MTc5MzI1OTQwMCwianRpIjoiOTc2NWRmNzItMjViMi00MTRkLTk0NTctZjhiMjc2ZDc4ZmE3Iiwic2lkIjoiOTc1YzAyNDItY2U3Ny00MWZmLTlmMjgtYjVjYjdjN2IxYTY1In0.xYCKlaJPR2m1iH14-HhXLlNrOxLIvb7Yr9--sDludSQ",
  "access_expires_at": "2026-10-29T07:51:40.198430877Z",
  "refresh_token": "jgOVcU9aJh4n6ZCgc8mBlzOrig5wvM6VepoKNtkbWLw",
  "refresh_expires_at": "2026-10-29T19:36:40.19781654Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "71af54ee-19b0-4199-acca-9049aecc2083",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T07:36:39.337716Z",
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

`POST /api/admin/v1/client-deletions/71af54ee-19b0-4199-acca-9049aecc2083/complete` → **200**

```json
{
  "command_id": "507eb941-ff9c-4da8-b153-716836f3ae77",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "71af54ee-19b0-4199-acca-9049aecc2083",
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
  "correlation_id": "c906f1cd-ca57-4076-9585-d4475f5fa9da"
}
```

Done: client 71af54ee-19b0-4199-acca-9049aecc2083 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669443532",
  "device_ref": "sandbox-16079"
}
```

```json
{
  "challenge_id": "2a63da55-8ba9-4399-a856-eec75373c623",
  "expires_at": "2026-10-29T07:41:41.346916157Z",
  "resend_available_at": "2026-10-29T07:36:42.346916157Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669443532` → **200**

```json
{
  "phone": "+380669443532",
  "audience": "CLIENT",
  "code": "380476",
  "sent_at": "2026-10-29T07:36:41.349631201Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a63da55-8ba9-4399-a856-eec75373c623",
  "code": "380476",
  "device_ref": "sandbox-16079"
}
```

```json
{
  "session_id": "02d56b37-8d80-490f-8128-b94e579c739f",
  "subject": {
    "type": "CLIENT",
    "id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Mzk4NGJjOS00YzJiLTQ2ZTItYTViYy1iMDI1NjdjOGE4N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzAxLCJpYXQiOjE3OTMyNTk0MDEsImp0aSI6ImY3NzM1NWI2LWJiZjUtNDA3Mi1iYzk0LTFkNzQyODBjZThkYSIsInNpZCI6IjAyZDU2YjM3LThkODAtNDkwZi04MTI4LWI5NGU1NzljNzM5ZiJ9.wDbI-1AZLGkDZNKzsAKDD8jaIVP0j25Do5pmIoOlX8E",
  "access_expires_at": "2026-10-29T07:51:41.657284999Z",
  "refresh_token": "dGN8XdLEuzMopNN1eDBnaM8f7rPBCFNQWzUuLvIsG_s",
  "refresh_expires_at": "2026-11-28T07:36:41.656799064Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d",
  "session_id": "02d56b37-8d80-490f-8128-b94e579c739f",
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
  "session_id": "0548e44d-2301-48a7-817d-5a5b4c81101c",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzMDIsImlhdCI6MTc5MzI1OTQwMiwianRpIjoiMzQ1MzU4NmYtOTg5NC00MjdhLWFkZTctOWNhODI0Y2IzMDYzIiwic2lkIjoiMDU0OGU0NGQtMjMwMS00OGE3LTgxN2QtNWE1YjRjODExMDFjIn0.fyyWZvX1eYa1-T6SbgPO32rsgig4j9a4y8DctXiv4Vk",
  "access_expires_at": "2026-10-29T07:51:42.491887609Z",
  "refresh_token": "w4hcklvzVOoVyQhMc5S_8irDxTTy88sDKdyQw2xVa_Q",
  "refresh_expires_at": "2026-10-29T19:36:42.491338164Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=9443532&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d",
      "phone": "+380669443532",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T07:36:41.655064Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/93984bc9-4c2b-46e2-a5bc-b02567c8a87d` → **200**

```json
{
  "client": {
    "id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d",
    "phone": "+380669443532",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:36:41.655064Z",
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

`POST /api/admin/v1/clients/93984bc9-4c2b-46e2-a5bc-b02567c8a87d/block` → **400**

```json
{
  "command_id": "ac7b8554-158c-43ff-b4f8-e9e9a7fb9f29",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/93984bc9-4c2b-46e2-a5bc-b02567c8a87d/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a1f92e9e-0a7b-4ab8-9fbf-c5faebfc12f9",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/93984bc9-4c2b-46e2-a5bc-b02567c8a87d/block` → **200**

```json
{
  "command_id": "37fb1cab-1ad0-42a7-a690-ad9fec283bda",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d",
  "phone": "+380669443532",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T07:36:41.655064Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T07:36:43.688201Z",
    "by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
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
  "correlation_id": "63daa918-aeb9-4e8a-b031-7173f480e6a1"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669443532",
  "device_ref": "sandbox-4829"
}
```

```json
{
  "challenge_id": "570d187e-9382-4b32-b9c5-3a01165172ab",
  "expires_at": "2026-10-29T07:41:46.2679489Z",
  "resend_available_at": "2026-10-29T07:36:47.2679489Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669443532` → **200**

```json
{
  "phone": "+380669443532",
  "audience": "CLIENT",
  "code": "737407",
  "sent_at": "2026-10-29T07:36:46.270067588Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "570d187e-9382-4b32-b9c5-3a01165172ab",
  "code": "737407",
  "device_ref": "sandbox-4829"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "15b9d02f-8c18-4ae1-a3a3-03452e94bdd3"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/93984bc9-4c2b-46e2-a5bc-b02567c8a87d` → **200**

```json
{
  "client": {
    "id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d",
    "phone": "+380669443532",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T07:36:41.655064Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T07:36:43.688201Z",
      "by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
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

`POST /api/admin/v1/clients/93984bc9-4c2b-46e2-a5bc-b02567c8a87d/unblock` → **200**

```json
{
  "command_id": "4f085b0c-c9a5-4824-8b61-5c4ff77aac14",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d",
  "phone": "+380669443532",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T07:36:41.655064Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669443532",
  "device_ref": "sandbox-14345"
}
```

```json
{
  "challenge_id": "5e8ca90f-295a-4189-96cf-c605c86ca6a8",
  "expires_at": "2026-10-29T07:41:49.49026924Z",
  "resend_available_at": "2026-10-29T07:36:50.49026924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669443532` → **200**

```json
{
  "phone": "+380669443532",
  "audience": "CLIENT",
  "code": "473936",
  "sent_at": "2026-10-29T07:36:49.493056259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e8ca90f-295a-4189-96cf-c605c86ca6a8",
  "code": "473936",
  "device_ref": "sandbox-14345"
}
```

```json
{
  "session_id": "a16ac1b8-d14c-48d7-b27d-28b3ae3a4826",
  "subject": {
    "type": "CLIENT",
    "id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Mzk4NGJjOS00YzJiLTQ2ZTItYTViYy1iMDI1NjdjOGE4N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzA5LCJpYXQiOjE3OTMyNTk0MDksImp0aSI6IjEyYzkyYWVmLTZhM2YtNGI4ZC05ZjU4LTYzNjFiM2JhMTFiYiIsInNpZCI6ImExNmFjMWI4LWQxNGMtNDhkNy1iMjdkLTI4YjNhZTNhNDgyNiJ9.FXOWLQ8Fw0h7CTd7sJXXlZjnpoOZpEXwdMeKkTAXefE",
  "access_expires_at": "2026-10-29T07:51:49.806859209Z",
  "refresh_token": "semahZ-kugTfn85Ja6IZyS9H8wwVCwYQ4f9P8en0h0M",
  "refresh_expires_at": "2026-11-28T07:36:49.806358546Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "93984bc9-4c2b-46e2-a5bc-b02567c8a87d",
  "session_id": "a16ac1b8-d14c-48d7-b27d-28b3ae3a4826",
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
  "phone": "+380669063275",
  "device_ref": "sandbox-5301"
}
```

```json
{
  "challenge_id": "f0585a2b-5288-4aa5-87a4-5959de93f808",
  "expires_at": "2026-10-29T07:41:50.379793205Z",
  "resend_available_at": "2026-10-29T07:36:51.379793205Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669063275` → **200**

```json
{
  "phone": "+380669063275",
  "audience": "CLIENT",
  "code": "796094",
  "sent_at": "2026-10-29T07:36:50.382238106Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0585a2b-5288-4aa5-87a4-5959de93f808",
  "code": "796094",
  "device_ref": "sandbox-5301"
}
```

```json
{
  "session_id": "e0160610-5068-44e1-8056-8b87f60b5f81",
  "subject": {
    "type": "CLIENT",
    "id": "d4d265bf-0f0c-4062-a81e-adc5286dbddc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGQyNjViZi0wZjBjLTQwNjItYTgxZS1hZGM1Mjg2ZGJkZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzEwLCJpYXQiOjE3OTMyNTk0MTAsImp0aSI6IjAwNjg5MjM3LWVhOGYtNDk3YS04NzQyLWUyOWFkODI3YTQ5NyIsInNpZCI6ImUwMTYwNjEwLTUwNjgtNDRlMS04MDU2LThiODdmNjBiNWY4MSJ9.NfVxSoDQyJWlWxXv98HWOhJBf70zPVPlonZifDrt6tU",
  "access_expires_at": "2026-10-29T07:51:50.690421317Z",
  "refresh_token": "AHQavPVb-rh0WMaCjTkSJReqjhTDW0KtyK5egGSOIKM",
  "refresh_expires_at": "2026-11-28T07:36:50.689815055Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "97932a88-812c-416c-a75e-9b7e431e6a10",
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
  "id": "cddcf9f2-a2ab-4433-adc7-55d7bf5860c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:50.971567Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 22e8e0fe-7220-409d-9aaf-06d7d075a7ae) → **201**

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
  "session_id": "37f2a5c5-81bb-4572-87f1-8b107abcca9d",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzMTEsImlhdCI6MTc5MzI1OTQxMSwianRpIjoiN2FkNzA3YmMtOGEwYi00Y2M2LTgzYWItYzY0MTA1YjgzMDY3Iiwic2lkIjoiMzdmMmE1YzUtODFiYi00NTcyLTg3ZjEtOGIxMDdhYmNjYTlkIn0.NfIw5I3YGs9Gx19m0KHOJGLg9YaRViaS1RC8TAb3AjY",
  "access_expires_at": "2026-10-29T07:51:51.60191885Z",
  "refresh_token": "bgii32bx1WfhleeD7Ozx35ARKjK_1Oe8MeazapJPguA",
  "refresh_expires_at": "2026-10-29T19:36:51.60121811Z",
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
  "session_id": "c66d0ff9-54dd-47d5-8de5-78d7f1e5d7f3",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzMTIsImlhdCI6MTc5MzI1OTQxMiwianRpIjoiNjUxN2JlMjYtMjE2Yi00MjAxLThhNjItYTQ5YjFmNmJiMGUwIiwic2lkIjoiYzY2ZDBmZjktNTRkZC00N2Q1LThkZTUtNzhkN2YxZTVkN2YzIn0.o4Viy2yhNDnbm3VhZsYMUZCd3sZS1AlVR5qElQnhzwo",
  "access_expires_at": "2026-10-29T07:51:52.175036586Z",
  "refresh_token": "QX0I6lpEXW5RgFV-8xPhT5eBQNonDJJC7CwjsbLypFg",
  "refresh_expires_at": "2026-10-29T19:36:52.174478745Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/06b1e6e1-569f-4a72-bdbc-93e24158036f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:36:51.271237Z",
      "actor": {
        "type": "CLIENT",
        "id": "d4d265bf-0f0c-4062-a81e-adc5286dbddc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "06b1e6e1-569f-4a72-bdbc-93e24158036f",
        "quote_id": "cddcf9f2-a2ab-4433-adc7-55d7bf5860c2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "22e8e0fe-7220-409d-9aaf-06d7d075a7ae"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:36:51.273181Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "06b1e6e1-569f-4a72-bdbc-93e24158036f",
        "attempt_id": "7d4eec79-4dcc-41ed-b8b9-f9865591a595",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "22e8e0fe-7220-409d-9aaf-06d7d075a7ae"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T07:36:51.279651Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "06b1e6e1-569f-4a72-bdbc-93e24158036f",
        "attempt_id": "7d4eec79-4dcc-41ed-b8b9-f9865591a595"
      },
      "correlation_id": "22e8e0fe-7220-409d-9aaf-06d7d075a7ae"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "7d4eec79-4dcc-41ed-b8b9-f9865591a595",
        "generation": 1,
        "started_at": "2026-10-29T07:36:51.272271Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T07:36:51.279651Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T07:36:51.273996Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/22e8e0fe-7220-409d-9aaf-06d7d075a7ae` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "06b1e6e1-569f-4a72-bdbc-93e24158036f:0",
      "order_id": "06b1e6e1-569f-4a72-bdbc-93e24158036f",
      "at": "2026-10-29T07:36:51.271237Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "06b1e6e1-569f-4a72-bdbc-93e24158036f:1",
      "order_id": "06b1e6e1-569f-4a72-bdbc-93e24158036f",
      "at": "2026-10-29T07:36:51.273181Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "06b1e6e1-569f-4a72-bdbc-93e24158036f:2",
      "order_id": "06b1e6e1-569f-4a72-bdbc-93e24158036f",
      "at": "2026-10-29T07:36:51.279651Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/46d295e0-801e-4d15-820b-503ae0fb7362` → **200**

```json
{
  "found": []
}
```

Done: request 22e8e0fe-7220-409d-9aaf-06d7d075a7ae — order 06b1e6e1-569f-4a72-bdbc-93e24158036f found by its id.

`GET /api/rider/v1/orders/06b1e6e1-569f-4a72-bdbc-93e24158036f` → **200**

```json
{
  "id": "06b1e6e1-569f-4a72-bdbc-93e24158036f",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4d265bf-0f0c-4062-a81e-adc5286dbddc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:51.27056Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/06b1e6e1-569f-4a72-bdbc-93e24158036f/cancel` → **200**

```json
{
  "command_id": "b7f4e6aa-0c3c-4117-9824-9c64036a3e14",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "06b1e6e1-569f-4a72-bdbc-93e24158036f",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d4d265bf-0f0c-4062-a81e-adc5286dbddc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:36:51.27056Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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
  "phone": "+380633139031",
  "device_ref": "sandbox-19045"
}
```

```json
{
  "challenge_id": "cfd2f57e-d217-4191-9cfd-3787841d45a2",
  "expires_at": "2026-10-29T07:41:53.941561198Z",
  "resend_available_at": "2026-10-29T07:36:54.941561198Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633139031` → **200**

```json
{
  "phone": "+380633139031",
  "audience": "CLIENT",
  "code": "887755",
  "sent_at": "2026-10-29T07:36:53.943725195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfd2f57e-d217-4191-9cfd-3787841d45a2",
  "code": "887755",
  "device_ref": "sandbox-19045"
}
```

```json
{
  "session_id": "c7aa8b25-0e3a-4a0c-9277-f55e8385388d",
  "subject": {
    "type": "CLIENT",
    "id": "7a9aa6d0-363c-4045-bb5a-9b812312ad66"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTlhYTZkMC0zNjNjLTQwNDUtYmI1YS05YjgxMjMxMmFkNjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzE0LCJpYXQiOjE3OTMyNTk0MTQsImp0aSI6IjczZjJiOGQ1LTg3ZjUtNDhmYy1hNDI3LWZkNDJiNmZlZWU1MyIsInNpZCI6ImM3YWE4YjI1LTBlM2EtNGEwYy05Mjc3LWY1NWU4Mzg1Mzg4ZCJ9.BZ3c-hTkzMR3VFn4UdADcairLchiXALvj5wSfC0EW9A",
  "access_expires_at": "2026-10-29T07:51:54.245281857Z",
  "refresh_token": "Z6JhTN6VzwGZlkWf67W9wi4roy4HDoXkG8mulXjBGEY",
  "refresh_expires_at": "2026-11-28T07:36:54.244676079Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "c5decacc-5ced-4f61-83bf-2ffb32d14bb1",
  "expires_at": "2026-10-29T07:41:56.546778879Z",
  "resend_available_at": "2026-10-29T07:36:57.546778879Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633139031` → **200**

```json
{
  "phone": "+380633139031",
  "audience": "CLIENT",
  "code": "016761",
  "sent_at": "2026-10-29T07:36:56.549056764Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "e0145f5a-34b3-4b72-8ac6-cb3d2bf646d6",
  "challenge_id": "c5decacc-5ced-4f61-83bf-2ffb32d14bb1",
  "otp_code": "016761"
}
```

```json
{
  "id": "f69520ae-f08c-4076-a8f7-88217f283cb4",
  "state": "PENDING",
  "created_at": "2026-10-29T07:36:56.859993Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/f69520ae-f08c-4076-a8f7-88217f283cb4` → **200**

```json
{
  "id": "f69520ae-f08c-4076-a8f7-88217f283cb4",
  "state": "PENDING",
  "created_at": "2026-10-29T07:36:56.859993Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f69520ae-f08c-4076-a8f7-88217f283cb4` → **200**

```json
{
  "id": "f69520ae-f08c-4076-a8f7-88217f283cb4",
  "state": "PENDING",
  "created_at": "2026-10-29T07:36:56.859993Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f69520ae-f08c-4076-a8f7-88217f283cb4` → **200**

```json
{
  "id": "f69520ae-f08c-4076-a8f7-88217f283cb4",
  "state": "PENDING",
  "created_at": "2026-10-29T07:36:56.859993Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f69520ae-f08c-4076-a8f7-88217f283cb4` → **200**

```json
{
  "id": "f69520ae-f08c-4076-a8f7-88217f283cb4",
  "state": "PENDING",
  "created_at": "2026-10-29T07:36:56.859993Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f69520ae-f08c-4076-a8f7-88217f283cb4` → **200**

```json
{
  "id": "f69520ae-f08c-4076-a8f7-88217f283cb4",
  "state": "READY",
  "created_at": "2026-10-29T07:36:56.859993Z",
  "ready_at": "2026-10-29T07:37:01.642228Z",
  "expires_at": "2026-11-05T07:37:01.642228Z",
  "size_bytes": 1028
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/f69520ae-f08c-4076-a8f7-88217f283cb4/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634786073",
  "device_ref": "sandbox-24064"
}
```

```json
{
  "challenge_id": "41903a4d-7da9-476d-b56d-b6f0f7381e0e",
  "expires_at": "2026-10-29T07:42:02.544040688Z",
  "resend_available_at": "2026-10-29T07:37:03.544040688Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634786073` → **200**

```json
{
  "phone": "+380634786073",
  "audience": "CLIENT",
  "code": "738241",
  "sent_at": "2026-10-29T07:37:02.5470139Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41903a4d-7da9-476d-b56d-b6f0f7381e0e",
  "code": "738241",
  "device_ref": "sandbox-24064"
}
```

```json
{
  "session_id": "d2aefd58-b4a9-454e-81a6-e89e5fa24439",
  "subject": {
    "type": "CLIENT",
    "id": "827f8ef7-fa14-4028-8470-28525c5fba64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MjdmOGVmNy1mYTE0LTQwMjgtODQ3MC0yODUyNWM1ZmJhNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzIyLCJpYXQiOjE3OTMyNTk0MjIsImp0aSI6ImU0YmVhOTE4LTEyMTgtNGNkNC04ZTQyLTRjNDJlYTQzNjA3YyIsInNpZCI6ImQyYWVmZDU4LWI0YTktNDU0ZS04MWE2LWU4OWU1ZmEyNDQzOSJ9.N8fJ58gsBCYryeKJG2LenQxHFBNOI-ttvNYo5mqSXpY",
  "access_expires_at": "2026-10-29T07:52:02.852272639Z",
  "refresh_token": "sIx4gHNXRb2SxjXWJigeg8H2OufxF-Ur7z8lLcCEf50",
  "refresh_expires_at": "2026-11-28T07:37:02.851767872Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/f69520ae-f08c-4076-a8f7-88217f283cb4/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/f69520ae-f08c-4076-a8f7-88217f283cb4/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "043612e3-148a-4b23-8aa0-8e6bb7389ad1"
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
  "session_id": "8351a04e-450c-4334-9473-4363296fab3b",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzMjMsImlhdCI6MTc5MzI1OTQyMywianRpIjoiYWUzZDJhOTUtOWFmYS00OTYwLTgyOWItNzk3OGM2ZGQxOWZjIiwic2lkIjoiODM1MWEwNGUtNDUwYy00MzM0LTk0NzMtNDM2MzI5NmZhYjNiIn0.LrMJYeY-OvkHBurjTSTNebYVZ2bOCxvxuJ3HRSifsTw",
  "access_expires_at": "2026-10-29T07:52:03.714251991Z",
  "refresh_token": "T-8UZnZFkS_CEMGv5Pm7rmcATsvwR7MAAijt7LlFpzs",
  "refresh_expires_at": "2026-10-29T19:37:03.713569825Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7a9aa6d0-363c-4045-bb5a-9b812312ad66",
  "session_id": "c7aa8b25-0e3a-4a0c-9277-f55e8385388d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/7a9aa6d0-363c-4045-bb5a-9b812312ad66/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "f69520ae-f08c-4076-a8f7-88217f283cb4",
      "state": "READY",
      "created_at": "2026-10-29T07:36:56.859993Z",
      "ready_at": "2026-10-29T07:37:01.642228Z",
      "expires_at": "2026-11-05T07:37:01.642228Z",
      "size_bytes": 1028
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
  "device_ref": "sandbox-29780"
}
```

```json
{
  "challenge_id": "bcb9339d-a8d9-41f7-aa93-f6016a0ad269",
  "expires_at": "2026-10-29T07:42:04.546043005Z",
  "resend_available_at": "2026-10-29T07:37:05.546043005Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "797967",
  "sent_at": "2026-10-29T07:37:04.548305168Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcb9339d-a8d9-41f7-aa93-f6016a0ad269",
  "code": "797967",
  "device_ref": "sandbox-29780"
}
```

```json
{
  "session_id": "92dd2404-8122-41f2-8e66-6d2119d5cda7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDMyNCwiaWF0IjoxNzkzMjU5NDI0LCJqdGkiOiJiMjMyM2UwNC1hMGUyLTQ4ZWItYmY5ZS0xZmU4MDg2YjU5NDkiLCJzaWQiOiI5MmRkMjQwNC04MTIyLTQxZjItOGU2Ni02ZDIxMTlkNWNkYTcifQ.NPYfJbmfEVzUWvM3sB7a29AFDsnKMpBc9vBaQ7VZvkQ",
  "access_expires_at": "2026-10-29T07:52:04.869964244Z",
  "refresh_token": "KiDdhdy7CEzri7XNuKTlbbwZJPav9L4E08aNX6VtmDc",
  "refresh_expires_at": "2026-11-28T07:37:04.869408738Z",
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
  "device_ref": "sandbox-20245"
}
```

```json
{
  "challenge_id": "304d7a23-c25b-4b51-8329-ef86e2b20fd5",
  "expires_at": "2026-10-29T07:42:05.420732234Z",
  "resend_available_at": "2026-10-29T07:37:06.420732234Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "436044",
  "sent_at": "2026-10-29T07:37:05.423560175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "304d7a23-c25b-4b51-8329-ef86e2b20fd5",
  "code": "436044",
  "device_ref": "sandbox-20245"
}
```

```json
{
  "session_id": "ebedd456-2903-4314-9167-6aca66f82c0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDMyNSwiaWF0IjoxNzkzMjU5NDI1LCJqdGkiOiJkMjBkNGU1YS0xMjNkLTQ0NDUtYTcyYS1jNWE0YTg0NzU2OWEiLCJzaWQiOiJlYmVkZDQ1Ni0yOTAzLTQzMTQtOTE2Ny02YWNhNjZmODJjMGQifQ.iYnkwyCpk81YgS7OOS3PO16sgKzqPocYyC_x9cfMMGY",
  "access_expires_at": "2026-10-29T07:52:05.737192725Z",
  "refresh_token": "TZ5EgRRM-m8mLSd-qq2fmM-JMn6S4HevtA68tm24W-c",
  "refresh_expires_at": "2026-11-28T07:37:05.736689498Z",
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
  "command_id": "56c6f5a9-f36b-44a0-90e9-6d60edf28ac1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:06Z",
    "sequence": 1793259426306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "58f32018-8c5d-4399-aca9-dc595e4ce2a6",
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
  "last_heartbeat_at": "2026-10-29T07:37:06.326373Z",
  "last_location_at": "2026-10-29T07:37:06.326373Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-25164"
}
```

```json
{
  "challenge_id": "8c3aa31f-ff93-47c0-9bdb-877fb9d8f8c8",
  "expires_at": "2026-10-29T07:42:06.610049544Z",
  "resend_available_at": "2026-10-29T07:37:07.610049544Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "142569",
  "sent_at": "2026-10-29T07:37:06.612469721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c3aa31f-ff93-47c0-9bdb-877fb9d8f8c8",
  "code": "142569",
  "device_ref": "sandbox-25164"
}
```

```json
{
  "session_id": "d1f78f8d-4f26-45eb-9b5e-c74a8a8546da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDMyNiwiaWF0IjoxNzkzMjU5NDI2LCJqdGkiOiI4MjI2NDc4OC0yODZkLTQzYzEtOWViZi1hNWRmOGMwZjg0ZmEiLCJzaWQiOiJkMWY3OGY4ZC00ZjI2LTQ1ZWItOWI1ZS1jNzRhOGE4NTQ2ZGEifQ.hVZSV3EP6BwpPbVVCBDshultX0xGZSZBl2OZD2nfrbY",
  "access_expires_at": "2026-10-29T07:52:06.929164445Z",
  "refresh_token": "lC-TksHoVk-kPQ6p9lMXbl1HqGeagOVxrbhoAbIL2YU",
  "refresh_expires_at": "2026-11-28T07:37:06.928626231Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6cc009ab-e103-42fd-ad32-cf3ff0343487",
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
  "last_heartbeat_at": "2026-10-29T07:35:47.383593Z",
  "last_location_at": "2026-10-29T07:35:47.383593Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6cc009ab-e103-42fd-ad32-cf3ff0343487/handover` → **200**

```json
{
  "command_id": "6e27539f-cd6f-4ea7-96cb-2e965ec8b56e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6cc009ab-e103-42fd-ad32-cf3ff0343487",
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
  "last_heartbeat_at": "2026-10-29T07:35:47.383593Z",
  "last_location_at": "2026-10-29T07:35:47.383593Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6cc009ab-e103-42fd-ad32-cf3ff0343487/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:07Z",
    "sequence": 1793259427781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6cc009ab-e103-42fd-ad32-cf3ff0343487",
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
  "last_heartbeat_at": "2026-10-29T07:37:07.800992Z",
  "last_location_at": "2026-10-29T07:37:07.800992Z",
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
  "session_id": "c768762d-138a-4f42-b820-de3314d5858d",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzMjgsImlhdCI6MTc5MzI1OTQyOCwianRpIjoiMzgzMTY3NjctYzI1ZC00NDVkLWFmY2ItYmMxZmIzYjdjMmMxIiwic2lkIjoiYzc2ODc2MmQtMTM4YS00ZjQyLWI4MjAtZGUzMzE0ZDU4NThkIn0.CKki-FHPbvRq3jG6gHeRi2kKMCNN5K42h0UZTvlnT7I",
  "access_expires_at": "2026-10-29T07:52:08.375055647Z",
  "refresh_token": "_T_-acTiZNvEQd_y7Xi7kc0bsEMh_KCeuqpfxax_8_s",
  "refresh_expires_at": "2026-10-29T19:37:08.374503748Z",
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
  "session_id": "f3961d26-6fc8-489f-a958-fd9bad355659",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzMjgsImlhdCI6MTc5MzI1OTQyOCwianRpIjoiYjFkOGI2NDktMWE4Ni00YTU2LThkMzItYTAwN2Q1ZGVjODdiIiwic2lkIjoiZjM5NjFkMjYtNmZjOC00ODlmLWE5NTgtZmQ5YmFkMzU1NjU5In0.WeIkanBM3ATfG4M5wWdvvfntWwjxYpllSybBAbpUK2k",
  "access_expires_at": "2026-10-29T07:52:08.943725706Z",
  "refresh_token": "pN9LChkDQTUTm0NmPr3UglqmD2eWPVrWFLJKLrtsbWM",
  "refresh_expires_at": "2026-10-29T19:37:08.943148979Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380688022305",
  "device_ref": "sandbox-8663"
}
```

```json
{
  "challenge_id": "a3d96566-cfa9-436e-880d-abb8281468b5",
  "expires_at": "2026-10-29T07:42:09.221501322Z",
  "resend_available_at": "2026-10-29T07:37:10.221501322Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380688022305` → **200**

```json
{
  "phone": "+380688022305",
  "audience": "CLIENT",
  "code": "186529",
  "sent_at": "2026-10-29T07:37:09.224010546Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3d96566-cfa9-436e-880d-abb8281468b5",
  "code": "186529",
  "device_ref": "sandbox-8663"
}
```

```json
{
  "session_id": "e992ab7a-90bb-46f9-81e9-b867d8c10e0d",
  "subject": {
    "type": "CLIENT",
    "id": "6c584f75-d2ae-40fe-a327-ecbc8cb760d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzU4NGY3NS1kMmFlLTQwZmUtYTMyNy1lY2JjOGNiNzYwZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzI5LCJpYXQiOjE3OTMyNTk0MjksImp0aSI6IjFiMjVjNTAyLWU0OGEtNDJhZS04YTQ4LTZmMDJkMzNlYWE4YiIsInNpZCI6ImU5OTJhYjdhLTkwYmItNDZmOS04MWU5LWI4NjdkOGMxMGUwZCJ9.el9Ihr4nOwF7N8Zvjz8rR8fGvPYachur95uChQQIOxU",
  "access_expires_at": "2026-10-29T07:52:09.529610308Z",
  "refresh_token": "8dBLXG_cfyeJwFXiuGGWvWFt1-sNIr9o5PtRv9X73MU",
  "refresh_expires_at": "2026-11-28T07:37:09.529093034Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "30b05979-94eb-47b5-a286-d3ef0d229748",
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
  "id": "1c06a6c2-8d8d-415a-955a-ee862a263f2d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:42:09.825447Z",
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
  "command_id": "15ae1847-99eb-4042-a6f0-fc082b665b67",
  "quote_id": "1c06a6c2-8d8d-415a-955a-ee862a263f2d",
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
  "id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c584f75-d2ae-40fe-a327-ecbc8cb760d6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:37:10.121491Z",
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
    "id": "8c21879b-18ae-4bf7-8187-62a873f091be",
    "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
    "expires_at": "2026-10-29T07:37:25.125242Z",
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

`POST /api/driver/v1/offers/8c21879b-18ae-4bf7-8187-62a873f091be/reject` → **204**

```json
{
  "command_id": "0064d54d-cf25-487f-a4e3-ee5f003a5c43"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "70a47e84-a67a-4f5a-9407-c6049ca81c5b",
    "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
    "expires_at": "2026-10-29T07:37:25.709268Z",
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

`POST /api/driver/v1/offers/70a47e84-a67a-4f5a-9407-c6049ca81c5b/accept` → **200**

```json
{
  "command_id": "084b56f5-4d28-4715-b3ff-d12be547a8ec"
}
```

```json
{
  "id": "5ec71992-35bc-4ec4-afff-6decc6c90995",
  "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "51560aae-547b-4026-b0da-2b9f551ae01f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/8e5bddff-a40b-4701-afe2-87aa24bb9a2d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:37:10.122005Z",
      "actor": {
        "type": "CLIENT",
        "id": "6c584f75-d2ae-40fe-a327-ecbc8cb760d6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
        "quote_id": "1c06a6c2-8d8d-415a-955a-ee862a263f2d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "001adfab-00e0-4b42-976d-5c825755f0d8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:37:10.124417Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
        "attempt_id": "00c21f4b-50dc-4ab8-bbea-d8be12bfc2dc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "001adfab-00e0-4b42-976d-5c825755f0d8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:37:10.131056Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8c21879b-18ae-4bf7-8187-62a873f091be",
        "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "001adfab-00e0-4b42-976d-5c825755f0d8"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T07:37:10.708252Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8c21879b-18ae-4bf7-8187-62a873f091be",
        "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d"
      },
      "correlation_id": "607e4cdd-8140-4a6c-92a5-da587dea4f47"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 8e5bddff-a40b-4701-afe2-87aa24bb9a2d — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/8e5bddff-a40b-4701-afe2-87aa24bb9a2d` → **200**

```json
{
  "id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6c584f75-d2ae-40fe-a327-ecbc8cb760d6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5ec71992-35bc-4ec4-afff-6decc6c90995",
    "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "51560aae-547b-4026-b0da-2b9f551ae01f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:37:10.121491Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8e5bddff-a40b-4701-afe2-87aa24bb9a2d/cancel` → **200**

```json
{
  "command_id": "06675091-651e-4289-a01c-a1ad68f8b654",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6c584f75-d2ae-40fe-a327-ecbc8cb760d6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5ec71992-35bc-4ec4-afff-6decc6c90995",
    "order_id": "8e5bddff-a40b-4701-afe2-87aa24bb9a2d",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "51560aae-547b-4026-b0da-2b9f551ae01f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:37:10.121491Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
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
  "session_id": "58f32018-8c5d-4399-aca9-dc595e4ce2a6",
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
  "last_heartbeat_at": "2026-10-29T07:37:06.326373Z",
  "last_location_at": "2026-10-29T07:37:06.326373Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/58f32018-8c5d-4399-aca9-dc595e4ce2a6/close` → **200**

```json
{
  "command_id": "a71e5cbf-3be6-4e54-9587-62e4ab26d352",
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
  "session_id": "6cc009ab-e103-42fd-ad32-cf3ff0343487",
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
  "last_heartbeat_at": "2026-10-29T07:37:07.800992Z",
  "last_location_at": "2026-10-29T07:37:07.800992Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6cc009ab-e103-42fd-ad32-cf3ff0343487/close` → **200**

```json
{
  "command_id": "a870fa82-532c-4b17-a396-5c3698a1d27a",
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
  "session_id": "c6ea04ed-4215-4894-8ccb-8c183d52d4fc",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzMzMsImlhdCI6MTc5MzI1OTQzMywianRpIjoiYzM5M2NmZjctNzFhNC00MWExLWEzOTktZDNlODg4OTk5M2JjIiwic2lkIjoiYzZlYTA0ZWQtNDIxNS00ODk0LThjY2ItOGMxODNkNTJkNGZjIn0.Qp3GthoRfH4Y_eeXtYcNNpxjWIbl8nE4jo4t628GQv4",
  "access_expires_at": "2026-10-29T07:52:13.677669883Z",
  "refresh_token": "Yoo1EK9YifLN2wdtcbMJkGV1hwHDOlCXxAwTDZ72ijQ",
  "refresh_expires_at": "2026-10-29T19:37:13.677103757Z",
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
  "command_id": "58ec193f-6f7a-4a66-8700-9ff8e77450c8",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T07:37:14.231755Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "f001c10b-45e5-4803-b8cc-758bc57582f9",
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
  "correlation_id": "3e7b37f6-9e8a-4e6b-95f1-d98aa50c6e42"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "04b5dec3-033b-4302-be7f-b708587e7877",
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
  "correlation_id": "d89e3a2d-43a0-4409-a8dd-17098be433a2"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637834440",
  "device_ref": "sandbox-28602"
}
```

```json
{
  "challenge_id": "8734e8f6-5bd1-4bd8-a8ed-af751149cf78",
  "expires_at": "2026-10-29T07:42:15.07782186Z",
  "resend_available_at": "2026-10-29T07:37:16.07782186Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637834440` → **200**

```json
{
  "phone": "+380637834440",
  "audience": "CLIENT",
  "code": "691928",
  "sent_at": "2026-10-29T07:37:15.080262589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8734e8f6-5bd1-4bd8-a8ed-af751149cf78",
  "code": "691928",
  "device_ref": "sandbox-28602"
}
```

```json
{
  "session_id": "9e8b2e86-edcb-442e-a081-db56a2cefd5c",
  "subject": {
    "type": "CLIENT",
    "id": "c7211f6f-c942-479c-a84a-b37ae6ce76ca"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzIxMWY2Zi1jOTQyLTQ3OWMtYTg0YS1iMzdhZTZjZTc2Y2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzM1LCJpYXQiOjE3OTMyNTk0MzUsImp0aSI6ImU5MTg1NmZmLTY2ZjItNGQxOC1hMGM4LTQyM2IzMGIxYjZiZSIsInNpZCI6IjllOGIyZTg2LWVkY2ItNDQyZS1hMDgxLWRiNTZhMmNlZmQ1YyJ9.q5KI67NWD2Ex4muCWO3HWefBayoxIvxnmHX9SM0IRIM",
  "access_expires_at": "2026-10-29T07:52:15.377735375Z",
  "refresh_token": "J8Q3jpqoAMZza89t53WVjcpZWDuAt8LkZD6Ts9Unn4E",
  "refresh_expires_at": "2026-11-28T07:37:15.37722594Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2909e227-88d1-46b5-ab18-3d0f5f12b6ac",
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
  "id": "bee1528a-4fd1-4395-834d-ee8adc230709",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:42:15.647693Z",
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
  "command_id": "0f977340-558d-4b67-a0f7-90010227075e",
  "quote_id": "bee1528a-4fd1-4395-834d-ee8adc230709",
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
  "correlation_id": "91943584-7c1f-46d2-8101-8a5a8c5adf85"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "52024445-8916-495d-bfb6-cdc0a8038d3a",
  "quote_id": "bee1528a-4fd1-4395-834d-ee8adc230709",
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
  "id": "32fde297-166a-4600-8940-c048621e3431",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7211f6f-c942-479c-a84a-b37ae6ce76ca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:37:16.227034Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/32fde297-166a-4600-8940-c048621e3431/cancel` → **200**

```json
{
  "command_id": "5a269a06-61b5-4654-9e20-bb2f25b62dfc",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "32fde297-166a-4600-8940-c048621e3431",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c7211f6f-c942-479c-a84a-b37ae6ce76ca",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:37:16.227034Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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
  "command_id": "4d82d923-5dbd-4ef5-9009-bd840ec439f4",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T07:37:16.842143Z"
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
      "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T07:37:16.842143Z"
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
  "device_ref": "sandbox-19855"
}
```

```json
{
  "challenge_id": "7b3ad67b-d35a-4c72-a66b-a4a533091ce4",
  "expires_at": "2026-10-29T07:42:17.683415702Z",
  "resend_available_at": "2026-10-29T07:37:18.683415702Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "210802",
  "sent_at": "2026-10-29T07:37:17.685931592Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b3ad67b-d35a-4c72-a66b-a4a533091ce4",
  "code": "210802",
  "device_ref": "sandbox-19855"
}
```

```json
{
  "session_id": "4ffdb68f-7223-4096-9708-00207dde2213",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDMzNywiaWF0IjoxNzkzMjU5NDM3LCJqdGkiOiJjOTg4ZjIwNy0xYzk5LTRhN2MtYWQwMy1iY2VkMWFhYzA0NTUiLCJzaWQiOiI0ZmZkYjY4Zi03MjIzLTQwOTYtOTcwOC0wMDIwN2RkZTIyMTMifQ.Q_eHsl0SbOdE19NMMPAmU9fIpgpyf0zOI8gx8R-a0rw",
  "access_expires_at": "2026-10-29T07:52:17.975713437Z",
  "refresh_token": "HykhA-LAsNBPwafARPvb4Zl5ovwiUZ1rtmGIOg3ybX8",
  "refresh_expires_at": "2026-11-28T07:37:17.975072332Z",
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
  "command_id": "817feb9e-e47f-41cd-b2dc-b66ece3dec63",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:18Z",
    "sequence": 1793259438513
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:18.532265Z",
  "last_location_at": "2026-10-29T07:37:18.532265Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671747927",
  "device_ref": "sandbox-28821"
}
```

```json
{
  "challenge_id": "f1e27ef8-7f70-4826-aa10-56bf05ba3551",
  "expires_at": "2026-10-29T07:42:18.806908739Z",
  "resend_available_at": "2026-10-29T07:37:19.806908739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671747927` → **200**

```json
{
  "phone": "+380671747927",
  "audience": "CLIENT",
  "code": "190340",
  "sent_at": "2026-10-29T07:37:18.809442906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1e27ef8-7f70-4826-aa10-56bf05ba3551",
  "code": "190340",
  "device_ref": "sandbox-28821"
}
```

```json
{
  "session_id": "744a68ae-704f-46d2-a66d-f1f410efcc91",
  "subject": {
    "type": "CLIENT",
    "id": "3bcb6f1a-e74e-48d1-bb51-af8d53c5c75b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYmNiNmYxYS1lNzRlLTQ4ZDEtYmI1MS1hZjhkNTNjNWM3NWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzM5LCJpYXQiOjE3OTMyNTk0MzksImp0aSI6ImY4ZjlhYmE3LTY3ZDUtNGU1Yi1hOGU3LWIxZGViZDc5YmE0ZSIsInNpZCI6Ijc0NGE2OGFlLTcwNGYtNDZkMi1hNjZkLWYxZjQxMGVmY2M5MSJ9.LoTt536xZ7h7KOMhOnD6C4Fvxa3MdqGjTru0mHF8tBU",
  "access_expires_at": "2026-10-29T07:52:19.108020785Z",
  "refresh_token": "FDzLDDeqTh3S4pZgqs7BrCif75Yimk3rkv07_FxR8vk",
  "refresh_expires_at": "2026-11-28T07:37:19.107466696Z",
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
  "command_id": "80d4c433-4046-47ff-8011-ac07e392318a",
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
  "id": "1ad971e4-2315-4b2e-a600-17310d43b6db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:42:19.653006Z",
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
  "command_id": "4c309cfb-67c8-4811-bcbc-23a97e8cbfae",
  "platform": "ANDROID",
  "token": "sandbox-driver-e85117ed-e613-42f5-ae3d-50e6e0060e69"
}
```

```json
{
  "id": "1ef9d9fd-e242-4424-8c0c-276d60c97bc3",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:37:19.979993Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "75ca4e0e-ac29-4317-a9a8-8f1ab5e214d3",
  "platform": "ANDROID",
  "token": "sandbox-rider-6fadc4cf-43fe-4375-b03f-000c077c99be"
}
```

```json
{
  "id": "bd2f8119-573f-4a46-b65d-859a0261cd1d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:37:20.261153Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d44b80f0-6130-40fa-902f-892ee100480e",
  "quote_id": "1ad971e4-2315-4b2e-a600-17310d43b6db",
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
  "id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3bcb6f1a-e74e-48d1-bb51-af8d53c5c75b",
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
  "created_at": "2026-10-29T07:37:20.552301Z",
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
    "id": "c4e48f21-57c8-4bb9-b6ee-f1407bd4b752",
    "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
    "expires_at": "2026-10-29T07:37:35.555429Z",
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

`POST /api/driver/v1/offers/c4e48f21-57c8-4bb9-b6ee-f1407bd4b752/accept` → **200**

```json
{
  "command_id": "a14b7063-b904-4056-aed7-ed2640bfd76b"
}
```

```json
{
  "id": "91087196-81e7-403b-9841-a13f557f5168",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7e967581-3333-4955-bf5e-64477b4aec86",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T07:37:20.527Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:37:21.073069223Z",
    "token_suffix": "060e69",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
      "order_version": "2",
      "event_id": "39b4a95f-d4a2-4011-a101-d7ec10d04533"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380671747927&after=2026-10-29T07:37:20.527Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380671747927&after=2026-10-29T07:37:20.527Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:37:22.078858152Z",
    "token_suffix": "7c99be",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
      "order_version": "3",
      "event_id": "dc6f86de-92d3-4d74-a28a-702c0258c1dc"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6ed51f6c-1394-46ba-9690-7ba62f5e3f37/messages` → **201**

```json
{
  "command_id": "41ba4565-e262-467b-a2d7-a5d94c90edb9",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "bbd864ac-3fec-4a5c-ac52-9971fce4e5f1",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T07:37:22.502729505Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7e967581-3333-4955-bf5e-64477b4aec86",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "assignment_id": "91087196-81e7-403b-9841-a13f557f5168",
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

`POST /api/driver/v1/trips/7e967581-3333-4955-bf5e-64477b4aec86/messages` → **201**

```json
{
  "command_id": "842e06fc-d442-47e0-a246-0f859efe4db7",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "eeb69ad5-556d-4b03-9f20-b0a1307d423a",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T07:37:23.066696836Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6ed51f6c-1394-46ba-9690-7ba62f5e3f37/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/7e967581-3333-4955-bf5e-64477b4aec86/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380671747927"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/88ea46d3-8b6b-49d1-892d-be884bd7856f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:23Z",
    "sequence": 1793259443879
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:23.898051Z",
  "last_location_at": "2026-10-29T07:37:23.898051Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7e967581-3333-4955-bf5e-64477b4aec86",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "assignment_id": "91087196-81e7-403b-9841-a13f557f5168",
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

`POST /api/driver/v1/trips/7e967581-3333-4955-bf5e-64477b4aec86/arrive` → **200**

```json
{
  "command_id": "c950f957-e834-4c74-9a74-542bf370a129",
  "expected_version": 0
}
```

```json
{
  "id": "7e967581-3333-4955-bf5e-64477b4aec86",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "assignment_id": "91087196-81e7-403b-9841-a13f557f5168",
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
  "arrived_at": "2026-10-29T07:37:24.456295Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7e967581-3333-4955-bf5e-64477b4aec86/start` → **200**

```json
{
  "command_id": "97f5cd73-c6ec-41b4-a68d-fc3e357a3ef1",
  "expected_version": 1
}
```

```json
{
  "id": "7e967581-3333-4955-bf5e-64477b4aec86",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "assignment_id": "91087196-81e7-403b-9841-a13f557f5168",
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
  "arrived_at": "2026-10-29T07:37:24.456295Z",
  "started_at": "2026-10-29T07:37:24.744539Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/88ea46d3-8b6b-49d1-892d-be884bd7856f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:25Z",
    "sequence": 1793259445340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:25.053253Z",
  "last_location_at": "2026-10-29T07:37:25.053253Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/7e967581-3333-4955-bf5e-64477b4aec86/complete` → **200**

```json
{
  "command_id": "851bba5e-92e3-4955-9447-d82311c300f0",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:37:25Z",
  "cash_received": true
}
```

```json
{
  "id": "7e967581-3333-4955-bf5e-64477b4aec86",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "assignment_id": "91087196-81e7-403b-9841-a13f557f5168",
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
  "arrived_at": "2026-10-29T07:37:24.456295Z",
  "started_at": "2026-10-29T07:37:24.744539Z",
  "completed_at": "2026-10-29T07:37:25.339835Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6ed51f6c-1394-46ba-9690-7ba62f5e3f37` → **200**

```json
{
  "id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3bcb6f1a-e74e-48d1-bb51-af8d53c5c75b",
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
    "id": "91087196-81e7-403b-9841-a13f557f5168",
    "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7e967581-3333-4955-bf5e-64477b4aec86",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:37:20.552301Z",
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
    "id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:37:20.552301Z",
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
    "id": "7e967581-3333-4955-bf5e-64477b4aec86",
    "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
    "order_short_number": 12,
    "created_at": "2026-10-29T07:37:21.128305Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f0cd8ef9-8212-47fc-88e5-a37babcebb10",
    "order_id": "a7fe2578-9017-4e44-8680-cb84693b890a",
    "order_short_number": 8,
    "created_at": "2026-10-29T07:36:23.649498Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7245b2a0-1954-4184-8033-2bf85a7d78c6",
    "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
    "order_short_number": 3,
    "created_at": "2026-10-29T07:35:36.169398Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "727ac1a1-0e97-431b-9f86-7d48946c6f5d",
    "order_id": "06996fbb-1958-44a2-a874-9ea7aa2ca61f",
    "order_short_number": 2,
    "created_at": "2026-10-29T07:35:14.707533Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "17138492-8516-49b9-8134-20535a1ad9da",
    "order_id": "5c558cdf-d725-4d9d-a214-4e4258e7bc0f",
    "order_short_number": 1,
    "created_at": "2026-10-29T07:35:05.09329Z",
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

`GET /api/rider/v1/orders/6ed51f6c-1394-46ba-9690-7ba62f5e3f37/tip` → **200**

```json
{
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
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
  "available_until": "2026-10-30T07:37:25.339835Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6ed51f6c-1394-46ba-9690-7ba62f5e3f37/tip` → **201**

```json
{
  "command_id": "8c174de3-863a-468b-a87e-12635ea49509",
  "amount_minor": 1100
}
```

```json
{
  "id": "962e46b4-fbe2-4822-9d79-99eebc5be157",
  "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T07:37:30.420012Z"
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
  "session_id": "aebdf413-564c-48b5-94c5-4a6631aa3b90",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzNTAsImlhdCI6MTc5MzI1OTQ1MCwianRpIjoiNzdmZGYzOTAtOTkwNC00Zjg3LTgwYjQtZGRjNWUwNDRkMjM3Iiwic2lkIjoiYWViZGY0MTMtNTY0Yy00OGI1LTk0YzUtNGE2NjMxYWEzYjkwIn0.xua5XSW_WOlTF5KpVR4BhtUKEpPT-2GgVJNBHE9Cy1A",
  "access_expires_at": "2026-10-29T07:52:30.997376025Z",
  "refresh_token": "5g9odrJiuOprRQe3lPJdROmtjdBWg_SWZUtWwicREIo",
  "refresh_expires_at": "2026-10-29T19:37:30.996825337Z",
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
          "APP": 11,
          "PHONE": 1
        },
        "by_payment": {
          "CASH": 11,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "STAFF": 1,
          "RIDER": 3
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
      "APP": 11,
      "PHONE": 1
    },
    "by_payment": {
      "CASH": 11,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "STAFF": 1,
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
  "generated_at": "2026-10-29T07:37:31.2817643Z"
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
  "generated_at": "2026-10-29T07:37:31.567355341Z"
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
  "session_id": "e22046b5-2833-4f63-94d1-08a47bea9f99",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzNTIsImlhdCI6MTc5MzI1OTQ1MiwianRpIjoiODkyOTczYjEtMjdmNy00MDY3LWI1YzgtOGEzODVkMThhMWVjIiwic2lkIjoiZTIyMDQ2YjUtMjgzMy00ZjYzLTk0ZDEtMDhhNDdiZWE5Zjk5In0.-dhw5qc_KtxkXS_NrAjG4WUsBp7IjtIYd49ljFGAxqw",
  "access_expires_at": "2026-10-29T07:52:32.144967756Z",
  "refresh_token": "0jtDJJ1lB4fqfhRotkxkdRVNvkhe0K0PA0mgc061X9Q",
  "refresh_expires_at": "2026-10-29T19:37:32.144451163Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6ed51f6c-1394-46ba-9690-7ba62f5e3f37/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:37:20.552789Z",
      "actor": {
        "type": "CLIENT",
        "id": "3bcb6f1a-e74e-48d1-bb51-af8d53c5c75b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
        "quote_id": "1ad971e4-2315-4b2e-a600-17310d43b6db",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e1e79610-1b2d-4fb5-a037-811c835b1d50"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:37:20.554695Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
        "attempt_id": "9758b1de-3f0b-488c-a8ce-ac8d74cb750c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e1e79610-1b2d-4fb5-a037-811c835b1d50"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:37:20.557467Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c4e48f21-57c8-4bb9-b6ee-f1407bd4b752",
        "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "e1e79610-1b2d-4fb5-a037-811c835b1d50"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:37:21.129865Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c4e48f21-57c8-4bb9-b6ee-f1407bd4b752",
        "order_id": "6ed51f6c-1394-46ba-9690-7ba62f5e3f37",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "91087196-81e7-403b-9841-a13f557f5168"
      },
      "correlation_id": "fe0040f4-5751-4e40-8b90-90154c082c6e"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T07:37:32.702913637Z",
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
      "last_location_at": "2026-10-29T07:37:25.053253Z",
      "order_id": null
    }
  ]
}
```

Done: order 6ed51f6c-1394-46ba-9690-7ba62f5e3f37.

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
  "session_id": "7b682f1a-fd84-4b2b-a82c-d0ec3d2f2e8b",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzNTMsImlhdCI6MTc5MzI1OTQ1MywianRpIjoiNDhhNmNjYzQtM2Q5Yy00YWVmLWI5MjgtYjFkMWZmNjgxM2NiIiwic2lkIjoiN2I2ODJmMWEtZmQ4NC00YjJiLWE4MmMtZDBlYzNkMmYyZThiIn0._TjO9jdC871394fi-OeTVSICQlj8tdmiykc-QvnE1Wg",
  "access_expires_at": "2026-10-29T07:52:33.295196284Z",
  "refresh_token": "-HFhf1U1naPurzOyNT5_uqW7Zr8IZXgBK9AKjsqrE4Q",
  "refresh_expires_at": "2026-10-29T19:37:33.294631019Z",
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
  "command_id": "ff6265dc-7a91-405e-b53f-f206fc0f99af",
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
  "timestamp": "2026-10-29T07:37:34.000+0000",
  "channel": {
    "id": "1730052000.1495224308",
    "linkedid": "1730052000.1495224308",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675563242"
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
  "timestamp": "2026-10-29T07:37:34.000+0000",
  "channel": {
    "id": "1730052000.1495224308",
    "linkedid": "1730052000.1495224308",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675563242"
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
  "session_id": "b8829502-1333-44e0-beed-764ebb199949",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzNTQsImlhdCI6MTc5MzI1OTQ1NCwianRpIjoiMGI0OTg4MTYtMTZmZC00ODVhLTlmZDktY2E1Yzk5MTk1N2ZmIiwic2lkIjoiYjg4Mjk1MDItMTMzMy00NGUwLWJlZWQtNzY0ZWJiMTk5OTQ5In0.RHqMHvct5D1puFilpWWbYaRJvILULOJIUMuUh0YEQK8",
  "access_expires_at": "2026-10-29T07:52:34.462044026Z",
  "refresh_token": "GAtcoTpAHmbIDeS29wAv_iEmFPrk3BcdtM2DISmaO90",
  "refresh_expires_at": "2026-10-29T19:37:34.461511213Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "553b547a-35a7-4925-9f1c-1e3e5d4cc9dc",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675563242",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:37:34Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/553b547a-35a7-4925-9f1c-1e3e5d4cc9dc/answer` → **200**

```json
{
  "command_id": "76f3670a-ff88-4ae8-9d20-870bbe93ba61"
}
```

```json
{
  "id": "553b547a-35a7-4925-9f1c-1e3e5d4cc9dc",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675563242",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "order_ids": [],
  "started_at": "2026-10-29T07:37:34Z",
  "answered_at": "2026-10-29T07:37:35.034513Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1495224308",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "aaf2fd43-eabb-418c-8774-3297cfa38c7e",
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
  "id": "30f322f4-f869-4a27-ba9b-1c453bfadcd8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:42:35.362234Z",
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
  "command_id": "86a959e4-9764-466d-a6cd-646410d94ab0",
  "quote_id": "30f322f4-f869-4a27-ba9b-1c453bfadcd8",
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
    "phone": "+380675563242"
  },
  "call_id": "553b547a-35a7-4925-9f1c-1e3e5d4cc9dc"
}
```

```json
{
  "id": "b3d96747-5993-488e-90d2-502bf1b463fa",
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
  "created_at": "2026-10-29T07:37:35.65603Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675563242"
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
    "id": "1730052000.1495224308",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "553b547a-35a7-4925-9f1c-1e3e5d4cc9dc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675563242",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [
        "b3d96747-5993-488e-90d2-502bf1b463fa"
      ],
      "started_at": "2026-10-29T07:37:34Z",
      "answered_at": "2026-10-29T07:37:35.034513Z",
      "ended_at": "2026-10-29T07:37:35.96452Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "78d325c3-693f-4850-96fb-6ceaf34baa2c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673811236",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [],
      "started_at": "2026-10-29T07:35:22.719966Z",
      "answered_at": "2026-10-29T07:35:23.039911Z",
      "ended_at": "2026-10-29T07:35:23.363815Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:35:31.623915Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/b3d96747-5993-488e-90d2-502bf1b463fa` → **200**

```json
{
  "id": "b3d96747-5993-488e-90d2-502bf1b463fa",
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
  "created_at": "2026-10-29T07:37:35.65603Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675563242"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/b3d96747-5993-488e-90d2-502bf1b463fa` → **200**

```json
{
  "id": "b3d96747-5993-488e-90d2-502bf1b463fa",
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
  "created_at": "2026-10-29T07:37:35.65603Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675563242"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b3d96747-5993-488e-90d2-502bf1b463fa/cancel` → **200**

```json
{
  "command_id": "33ff35d3-d243-4cd3-b599-346e53a55d62",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b3d96747-5993-488e-90d2-502bf1b463fa",
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
  "created_at": "2026-10-29T07:37:35.65603Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675563242"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 553b547a-35a7-4925-9f1c-1e3e5d4cc9dc with order b3d96747-5993-488e-90d2-502bf1b463fa.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31898"
}
```

```json
{
  "challenge_id": "6016611c-fd57-4e8c-8f5f-c26075484361",
  "expires_at": "2026-10-29T07:42:37.174748642Z",
  "resend_available_at": "2026-10-29T07:37:38.174748642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "487920",
  "sent_at": "2026-10-29T07:37:37.177059715Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6016611c-fd57-4e8c-8f5f-c26075484361",
  "code": "487920",
  "device_ref": "sandbox-31898"
}
```

```json
{
  "session_id": "73996422-cb4a-41e7-876b-492e19fd90fe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDM1NywiaWF0IjoxNzkzMjU5NDU3LCJqdGkiOiJkYjdmMThjMS1jYTRkLTRjZjUtOThkMC0xNTQyZWY1MTIwYzQiLCJzaWQiOiI3Mzk5NjQyMi1jYjRhLTQxZTctODc2Yi00OTJlMTlmZDkwZmUifQ.V_8aYPeybl_e2tGYQhTXh5BspRDQV-fsJCE5Rd2dPe4",
  "access_expires_at": "2026-10-29T07:52:37.47595759Z",
  "refresh_token": "RHVXEHathbS4HvetftFsos480uNhM2q1gA9h72_EPB4",
  "refresh_expires_at": "2026-11-28T07:37:37.475400901Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:25.053253Z",
  "last_location_at": "2026-10-29T07:37:25.053253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88ea46d3-8b6b-49d1-892d-be884bd7856f/handover` → **200**

```json
{
  "command_id": "0bc52cc1-2f4b-4ded-a354-2fdee494c829",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:25.053253Z",
  "last_location_at": "2026-10-29T07:37:25.053253Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88ea46d3-8b6b-49d1-892d-be884bd7856f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:38Z",
    "sequence": 1793259458305
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:38.324195Z",
  "last_location_at": "2026-10-29T07:37:38.324195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666937546",
  "device_ref": "sandbox-2298"
}
```

```json
{
  "challenge_id": "f6e5a0a4-9388-4d3b-bb83-27194421da3c",
  "expires_at": "2026-10-29T07:42:38.591571872Z",
  "resend_available_at": "2026-10-29T07:37:39.591571872Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666937546` → **200**

```json
{
  "phone": "+380666937546",
  "audience": "CLIENT",
  "code": "003774",
  "sent_at": "2026-10-29T07:37:38.593856996Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6e5a0a4-9388-4d3b-bb83-27194421da3c",
  "code": "003774",
  "device_ref": "sandbox-2298"
}
```

```json
{
  "session_id": "ee0770b5-82f8-4cb8-a284-8316728507b2",
  "subject": {
    "type": "CLIENT",
    "id": "d5024a1c-30a2-4209-a4d7-0cfcc3353de9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNTAyNGExYy0zMGEyLTQyMDktYTRkNy0wY2ZjYzMzNTNkZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzU4LCJpYXQiOjE3OTMyNTk0NTgsImp0aSI6IjU0ODc4ZDA5LTZhZDktNDA4NS1hOGQ2LTg0N2VhMjk2MGM1YyIsInNpZCI6ImVlMDc3MGI1LTgyZjgtNGNiOC1hMjg0LTgzMTY3Mjg1MDdiMiJ9.7CmpvLbtwcjXIL0MMrPjN2yo5NqLcDkN2JxZXa-zNEY",
  "access_expires_at": "2026-10-29T07:52:38.9005543Z",
  "refresh_token": "EWm4aJ1XvVyeR3xjU1UYfK7scXVbr3ckNF1YEVxoXww",
  "refresh_expires_at": "2026-11-28T07:37:38.899985534Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f4962d41-736e-4759-ba0d-02ff727211f7",
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
  "id": "86044d93-884c-4698-ba36-002a587302cd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:42:39.185565Z",
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
  "command_id": "463f0466-f1f9-4f7b-8e53-7045bf59d56e",
  "quote_id": "86044d93-884c-4698-ba36-002a587302cd",
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
  "id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d5024a1c-30a2-4209-a4d7-0cfcc3353de9",
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
  "created_at": "2026-10-29T07:37:39.472704Z",
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
    "id": "e80840a9-4e5a-4b87-b517-fc39696396b6",
    "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
    "expires_at": "2026-10-29T07:37:54.475613Z",
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

`POST /api/driver/v1/offers/e80840a9-4e5a-4b87-b517-fc39696396b6/accept` → **200**

```json
{
  "command_id": "f7879473-7da8-4043-bc2b-0bef6ef9dd3a"
}
```

```json
{
  "id": "f7f510de-6093-4c9d-b764-9868761efea3",
  "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d326bcc-b6db-4b57-b7b6-1f3e51126594",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d326bcc-b6db-4b57-b7b6-1f3e51126594",
  "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
  "assignment_id": "f7f510de-6093-4c9d-b764-9868761efea3",
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

`POST /api/driver/v1/work-sessions/88ea46d3-8b6b-49d1-892d-be884bd7856f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:40Z",
    "sequence": 1793259460596
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:40.613847Z",
  "last_location_at": "2026-10-29T07:37:40.613847Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9d326bcc-b6db-4b57-b7b6-1f3e51126594/arrive` → **200**

```json
{
  "command_id": "62922918-cc21-4dab-8eeb-e242a3d527e7",
  "expected_version": 0
}
```

```json
{
  "id": "9d326bcc-b6db-4b57-b7b6-1f3e51126594",
  "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
  "assignment_id": "f7f510de-6093-4c9d-b764-9868761efea3",
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
  "arrived_at": "2026-10-29T07:37:40.888464Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d326bcc-b6db-4b57-b7b6-1f3e51126594/start` → **200**

```json
{
  "command_id": "7b704d19-e295-4db9-97aa-6eec70c9bd97",
  "expected_version": 1
}
```

```json
{
  "id": "9d326bcc-b6db-4b57-b7b6-1f3e51126594",
  "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
  "assignment_id": "f7f510de-6093-4c9d-b764-9868761efea3",
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
  "arrived_at": "2026-10-29T07:37:40.888464Z",
  "started_at": "2026-10-29T07:37:41.170338Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/88ea46d3-8b6b-49d1-892d-be884bd7856f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:41Z",
    "sequence": 1793259461440
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:41.458961Z",
  "last_location_at": "2026-10-29T07:37:41.458961Z",
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
  "device_ref": "sandbox-21943"
}
```

```json
{
  "challenge_id": "7c08283a-1f29-4e98-b114-f1e4e9a1dffa",
  "expires_at": "2026-10-29T07:42:41.732362964Z",
  "resend_available_at": "2026-10-29T07:37:42.732362964Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "349625",
  "sent_at": "2026-10-29T07:37:41.73475554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c08283a-1f29-4e98-b114-f1e4e9a1dffa",
  "code": "349625",
  "device_ref": "sandbox-21943"
}
```

```json
{
  "session_id": "26dd59fc-4019-4787-9b2f-4156d5449758",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDM2MiwiaWF0IjoxNzkzMjU5NDYyLCJqdGkiOiI5ZTVmMzczNS0xNjMxLTQ3NzktOTUyOS0zNDVhYTBlNWVlZTMiLCJzaWQiOiIyNmRkNTlmYy00MDE5LTQ3ODctOWIyZi00MTU2ZDU0NDk3NTgifQ.wcC3lPoGFE2RerA8WiTyL7jl9KR8yifBAO0MSd2NAGQ",
  "access_expires_at": "2026-10-29T07:52:42.031334438Z",
  "refresh_token": "TdbUkzrY6QcdlYWGWrbIbw9Pqiz7Nyw7WnnUXV39dKE",
  "refresh_expires_at": "2026-11-28T07:37:42.030819769Z",
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
  "command_id": "ffc5b998-c5ae-4a2d-a8e2-8706588a8945",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:42Z",
    "sequence": 1793259462568
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "39e8590c-1a34-4ec5-b3d0-25012d3ab8f2",
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
  "last_heartbeat_at": "2026-10-29T07:37:42.586855Z",
  "last_location_at": "2026-10-29T07:37:42.586855Z",
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
  "session_id": "1c940308-c854-4f86-9b86-c5922ac22522",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzNjMsImlhdCI6MTc5MzI1OTQ2MywianRpIjoiM2I4ZTQ3YjktMDE3My00NTA2LWE0YmYtMWI0N2FiMjBhMjk5Iiwic2lkIjoiMWM5NDAzMDgtYzg1NC00Zjg2LTliODYtYzU5MjJhYzIyNTIyIn0.lPoI5D2dv007xqF_ObFRbdlT_vxNR0Sd1lxe-2UsMpQ",
  "access_expires_at": "2026-10-29T07:52:43.152346912Z",
  "refresh_token": "0V33Cg3ORN75KV344sJPqymv2kOACdmahnXzsUDBr7I",
  "refresh_expires_at": "2026-10-29T19:37:43.151855256Z",
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
  "session_id": "6f602dc0-6a23-4555-9bcb-9aabd8c17af0",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzNjMsImlhdCI6MTc5MzI1OTQ2MywianRpIjoiNjlhYzg2ZTAtNzE5NC00MzYwLThhYTItZGRjNmNjYjM3N2QwIiwic2lkIjoiNmY2MDJkYzAtNmEyMy00NTU1LTliY2ItOWFhYmQ4YzE3YWYwIn0.v-LZP0Yxm4ZMMHoxhlfUXQwDlj-usvflbmbHmXE7Xg4",
  "access_expires_at": "2026-10-29T07:52:43.722246438Z",
  "refresh_token": "5JXgL1_pZpfrknWwsJAJPBOEMfOljXegoFgj6efK6fY",
  "refresh_expires_at": "2026-10-29T19:37:43.721759982Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4bf8cbf7-d719-4689-852e-6e4030f1d222` → **200**

```json
{
  "id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d5024a1c-30a2-4209-a4d7-0cfcc3353de9",
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
    "id": "f7f510de-6093-4c9d-b764-9868761efea3",
    "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9d326bcc-b6db-4b57-b7b6-1f3e51126594",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T07:37:39.472704Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4bf8cbf7-d719-4689-852e-6e4030f1d222/interrupt` → **200**

```json
{
  "command_id": "bf77246b-8c01-4964-97b6-3aec4991a363",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "d5024a1c-30a2-4209-a4d7-0cfcc3353de9",
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
      "id": "f7f510de-6093-4c9d-b764-9868761efea3",
      "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9d326bcc-b6db-4b57-b7b6-1f3e51126594",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T07:37:39.472704Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "d5024a1c-30a2-4209-a4d7-0cfcc3353de9",
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
    "id": "e989d21d-1404-4610-b7a6-f784bfefbea6",
    "order_id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
    "expires_at": "2026-10-29T07:37:59.312814Z",
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

`POST /api/driver/v1/offers/e989d21d-1404-4610-b7a6-f784bfefbea6/accept` → **200**

```json
{
  "command_id": "54fec048-341e-4b12-9fda-fe904e92a6ba"
}
```

```json
{
  "id": "80eae039-9621-40c0-aa38-0eb327cf23a8",
  "order_id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b7360064-9536-4c0e-b3c4-d721326d59f7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b7360064-9536-4c0e-b3c4-d721326d59f7",
  "order_id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
  "assignment_id": "80eae039-9621-40c0-aa38-0eb327cf23a8",
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
  "session_id": "39e8590c-1a34-4ec5-b3d0-25012d3ab8f2",
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
  "last_heartbeat_at": "2026-10-29T07:37:42.586855Z",
  "last_location_at": "2026-10-29T07:37:42.586855Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/39e8590c-1a34-4ec5-b3d0-25012d3ab8f2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:45Z",
    "sequence": 1793259465734
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "39e8590c-1a34-4ec5-b3d0-25012d3ab8f2",
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
  "last_heartbeat_at": "2026-10-29T07:37:45.752364Z",
  "last_location_at": "2026-10-29T07:37:45.752364Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b7360064-9536-4c0e-b3c4-d721326d59f7/arrive` → **200**

```json
{
  "command_id": "22753b0f-0179-4681-aa31-ae14524e00d3",
  "expected_version": 0
}
```

```json
{
  "id": "b7360064-9536-4c0e-b3c4-d721326d59f7",
  "order_id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
  "assignment_id": "80eae039-9621-40c0-aa38-0eb327cf23a8",
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
  "arrived_at": "2026-10-29T07:37:46.031695Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b7360064-9536-4c0e-b3c4-d721326d59f7/start` → **200**

```json
{
  "command_id": "6d40414d-e8e3-4dba-8ac7-fb87bf5f9973",
  "expected_version": 1
}
```

```json
{
  "id": "b7360064-9536-4c0e-b3c4-d721326d59f7",
  "order_id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
  "assignment_id": "80eae039-9621-40c0-aa38-0eb327cf23a8",
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
  "arrived_at": "2026-10-29T07:37:46.031695Z",
  "started_at": "2026-10-29T07:37:46.316811Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b7360064-9536-4c0e-b3c4-d721326d59f7/complete` → **200**

```json
{
  "command_id": "6dd0d265-3e45-4b12-8b83-4ef7b18b5c00",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:37:46Z"
}
```

```json
{
  "id": "b7360064-9536-4c0e-b3c4-d721326d59f7",
  "order_id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
  "assignment_id": "80eae039-9621-40c0-aa38-0eb327cf23a8",
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
  "arrived_at": "2026-10-29T07:37:46.031695Z",
  "started_at": "2026-10-29T07:37:46.316811Z",
  "completed_at": "2026-10-29T07:37:46.607864Z",
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
    "id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:37:44.303034Z",
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
    "id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:37:39.472704Z",
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
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
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

`GET /api/operator/v1/orders/4bf8cbf7-d719-4689-852e-6e4030f1d222/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:37:39.473171Z",
      "actor": {
        "type": "CLIENT",
        "id": "d5024a1c-30a2-4209-a4d7-0cfcc3353de9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
        "quote_id": "86044d93-884c-4698-ba36-002a587302cd",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "ccffd49e-80e9-4c0c-84ad-08a2d8cccb0a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:37:39.474916Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
        "attempt_id": "396eedfd-7060-47b2-be47-0b294135b037",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ccffd49e-80e9-4c0c-84ad-08a2d8cccb0a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:37:39.477516Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e80840a9-4e5a-4b87-b517-fc39696396b6",
        "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "ccffd49e-80e9-4c0c-84ad-08a2d8cccb0a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:37:40.056808Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e80840a9-4e5a-4b87-b517-fc39696396b6",
        "order_id": "4bf8cbf7-d719-4689-852e-6e4030f1d222",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f7f510de-6093-4c9d-b764-9868761efea3"
      },
      "correlation_id": "16825f3a-8f7d-42e7-b877-8261b5a547c4"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/bca62646-3c9b-4acd-802c-ded5a10ed2a1/tip` → **200**

```json
{
  "order_id": "bca62646-3c9b-4acd-802c-ded5a10ed2a1",
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
  "available_until": "2026-10-30T07:37:46.607864Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/bca62646-3c9b-4acd-802c-ded5a10ed2a1/tip` → **409**

```json
{
  "command_id": "2c0d6821-dd8c-4140-a0c7-ed3f49a59e3a",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/bca62646-3c9b-4acd-802c-ded5a10ed2a1/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "81c76dfd-226d-40bd-b763-3d926e65e4ba"
}
```

Done: interrupted 4bf8cbf7-d719-4689-852e-6e4030f1d222, follow-up bca62646-3c9b-4acd-802c-ded5a10ed2a1.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88ea46d3-8b6b-49d1-892d-be884bd7856f",
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
  "last_heartbeat_at": "2026-10-29T07:37:41.458961Z",
  "last_location_at": "2026-10-29T07:37:41.458961Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88ea46d3-8b6b-49d1-892d-be884bd7856f/close` → **200**

```json
{
  "command_id": "73c7b6b5-9d8a-4a04-99ce-2d4355db875b",
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
  "session_id": "39e8590c-1a34-4ec5-b3d0-25012d3ab8f2",
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
  "last_heartbeat_at": "2026-10-29T07:37:45.752364Z",
  "last_location_at": "2026-10-29T07:37:45.752364Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/39e8590c-1a34-4ec5-b3d0-25012d3ab8f2/close` → **200**

```json
{
  "command_id": "0e14e430-0df2-47af-a04a-575f5a8d0715",
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
  "session_id": "bfd267d5-02cc-4e99-a719-59bd6d60eab3",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzNzIsImlhdCI6MTc5MzI1OTQ3MiwianRpIjoiNGM1ZWVlNGMtOTIxYi00NGQ1LWEzZGQtMTJjMTAwZTg0YzAyIiwic2lkIjoiYmZkMjY3ZDUtMDJjYy00ZTk5LWE3MTktNTliZDZkNjBlYWIzIn0.0IiGUn8jdf3Pq8DFb_jnkJTn2Qx4NhrvB-WRPuD6qpk",
  "access_expires_at": "2026-10-29T07:52:52.726260459Z",
  "refresh_token": "gE6niIj-v1mRsCJ1g95FEVTkl4hDVE1S3rO-4af2xLU",
  "refresh_expires_at": "2026-10-29T19:37:52.725763693Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "65c15f5b-448d-4871-a837-4709c641c8cc",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:37:52Z"
}
```

```json
{
  "id": "a17ae8bf-9092-4f97-9463-82636e0b3729",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:37:52Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/a17ae8bf-9092-4f97-9463-82636e0b3729/publish` → **200**

```json
{
  "command_id": "b6412a3a-724a-4559-a7e2-ffd1dd67ef06",
  "expected_version": 0
}
```

```json
{
  "id": "a17ae8bf-9092-4f97-9463-82636e0b3729",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:37:53.309275Z",
  "published_at": "2026-10-29T07:37:53.309275Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "a17ae8bf-9092-4f97-9463-82636e0b3729",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T07:37:53.309275Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637215262",
  "device_ref": "sandbox-4656"
}
```

```json
{
  "challenge_id": "5a1fd52e-ce13-4e5b-8a62-f4d9523b575a",
  "expires_at": "2026-10-29T07:42:53.847829793Z",
  "resend_available_at": "2026-10-29T07:37:54.847829793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637215262` → **200**

```json
{
  "phone": "+380637215262",
  "audience": "CLIENT",
  "code": "920434",
  "sent_at": "2026-10-29T07:37:53.850563004Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a1fd52e-ce13-4e5b-8a62-f4d9523b575a",
  "code": "920434",
  "device_ref": "sandbox-4656"
}
```

```json
{
  "session_id": "c42ab63c-7f8d-409b-85c6-b2aca687f22c",
  "subject": {
    "type": "CLIENT",
    "id": "ed8c400b-23ed-49fa-82b1-7b4a9bd8459b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZDhjNDAwYi0yM2VkLTQ5ZmEtODJiMS03YjRhOWJkODQ1OWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzc0LCJpYXQiOjE3OTMyNTk0NzQsImp0aSI6IjU0YjljMWM0LWYzM2UtNGU4OS05M2VlLWIwOGRlMTBhOTJkNCIsInNpZCI6ImM0MmFiNjNjLTdmOGQtNDA5Yi04NWM2LWIyYWNhNjg3ZjIyYyJ9.pE5PD5KS1POoipM2mQR9ifA2RJb9fCmmLfuKCE5JNEE",
  "access_expires_at": "2026-10-29T07:52:54.14468937Z",
  "refresh_token": "m0TIkbFGRkmT3v40wlSyFT8n7tjaGVBDHuCGXetvPIo",
  "refresh_expires_at": "2026-11-28T07:37:54.144151335Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "a17ae8bf-9092-4f97-9463-82636e0b3729",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T07:37:53.309275Z",
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
  "command_id": "2e1cebb4-76ff-4577-85fb-7e80b932447e",
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
  "id": "26d96f2c-15a9-41ee-a835-f05ea37e37c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:42:54.689151Z",
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
  "command_id": "d41c33dd-b37c-462e-ad08-82f56b8f8951",
  "quote_id": "26d96f2c-15a9-41ee-a835-f05ea37e37c2",
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
  "correlation_id": "728cd5ca-c0f3-43bc-916d-7e83e517b37e"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "a8239370-2ad0-425b-a3dd-d25b9bf2c359",
  "version_id": "a17ae8bf-9092-4f97-9463-82636e0b3729",
  "language": "uk"
}
```

```json
{
  "version_id": "a17ae8bf-9092-4f97-9463-82636e0b3729",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T07:37:55.259976Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "63600aaf-68b1-4a8c-8f52-98222dee1d72",
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
  "id": "7255a6cc-3517-4fcf-abd9-7f802866c0a9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:42:55.547532Z",
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
  "command_id": "e70ed5a9-7175-4bfd-8a43-4eed7a7b6b0e",
  "quote_id": "7255a6cc-3517-4fcf-abd9-7f802866c0a9",
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
  "id": "f22dc0ff-b040-42f1-8092-b4e66fe31c64",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ed8c400b-23ed-49fa-82b1-7b4a9bd8459b",
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
  "created_at": "2026-10-29T07:37:55.8565Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f22dc0ff-b040-42f1-8092-b4e66fe31c64` → **200**

```json
{
  "id": "f22dc0ff-b040-42f1-8092-b4e66fe31c64",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ed8c400b-23ed-49fa-82b1-7b4a9bd8459b",
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
  "created_at": "2026-10-29T07:37:55.8565Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f22dc0ff-b040-42f1-8092-b4e66fe31c64/cancel` → **200**

```json
{
  "command_id": "c5a60050-f176-4fe4-96db-8e23adccbcb8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f22dc0ff-b040-42f1-8092-b4e66fe31c64",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ed8c400b-23ed-49fa-82b1-7b4a9bd8459b",
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
  "created_at": "2026-10-29T07:37:55.8565Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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

`POST /api/admin/v1/legal-documents/a17ae8bf-9092-4f97-9463-82636e0b3729` → **409**

```json
{
  "command_id": "9c44d9d1-d23f-4433-9777-f25ea5c31583",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:37:56Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/a17ae8bf-9092-4f97-9463-82636e0b3729",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1a921b98-2dec-4cb2-bc24-05a164b03122"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "177a4f0e-b6bb-4640-abb9-4b8ed32ebae5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:37:57Z"
}
```

```json
{
  "id": "ddca9939-cedc-41d9-948f-3019257874e6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:37:57Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/ddca9939-cedc-41d9-948f-3019257874e6/publish` → **200**

```json
{
  "command_id": "6e24fba4-6acb-4eea-9b8d-f8e97879734d",
  "expected_version": 0
}
```

```json
{
  "id": "ddca9939-cedc-41d9-948f-3019257874e6",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:37:57.329836Z",
  "published_at": "2026-10-29T07:37:57.329836Z",
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
  "device_ref": "sandbox-3701"
}
```

```json
{
  "challenge_id": "4fa841ba-c348-4dbd-a222-6f05fc16e88f",
  "expires_at": "2026-10-29T07:42:57.607719544Z",
  "resend_available_at": "2026-10-29T07:37:58.607719544Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "139917",
  "sent_at": "2026-10-29T07:37:57.610549714Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fa841ba-c348-4dbd-a222-6f05fc16e88f",
  "code": "139917",
  "device_ref": "sandbox-3701"
}
```

```json
{
  "session_id": "95f15308-65b0-4dec-811e-84b5304581dc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDM3NywiaWF0IjoxNzkzMjU5NDc3LCJqdGkiOiIwNjYyNDk1NS1hOGFmLTRhNzUtOWQ1MS03NzVkZWZmZjdmNTkiLCJzaWQiOiI5NWYxNTMwOC02NWIwLTRkZWMtODExZS04NGI1MzA0NTgxZGMifQ.zVDOCBxiGq1V-K7P_lagIuFMjTwrl5AcnaXds2Cr2ng",
  "access_expires_at": "2026-10-29T07:52:57.905154011Z",
  "refresh_token": "s7bPFJdyjkj7wls6eq67bryg6qhR1UuWXvNwUgGMZKg",
  "refresh_expires_at": "2026-11-28T07:37:57.904309841Z",
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
  "command_id": "4a38dfc5-6c96-4fe7-b573-435faf7bc143",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:37:58Z",
    "sequence": 1793259478473
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6636836d-73af-4d33-8ac0-3ab98d155ce3",
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
  "last_heartbeat_at": "2026-10-29T07:37:58.49441Z",
  "last_location_at": "2026-10-29T07:37:58.49441Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674637605",
  "device_ref": "sandbox-27300"
}
```

```json
{
  "challenge_id": "d28b4688-e919-4e7c-ade4-9bf0dff8d869",
  "expires_at": "2026-10-29T07:42:58.788152557Z",
  "resend_available_at": "2026-10-29T07:37:59.788152557Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674637605` → **200**

```json
{
  "phone": "+380674637605",
  "audience": "CLIENT",
  "code": "081393",
  "sent_at": "2026-10-29T07:37:58.79026339Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d28b4688-e919-4e7c-ade4-9bf0dff8d869",
  "code": "081393",
  "device_ref": "sandbox-27300"
}
```

```json
{
  "session_id": "603da6ff-95b4-4198-9b05-c6cffb0e890a",
  "subject": {
    "type": "CLIENT",
    "id": "869e30d4-704e-4104-8dd3-e0e771aa5016"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjllMzBkNC03MDRlLTQxMDQtOGRkMy1lMGU3NzFhYTUwMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMzc5LCJpYXQiOjE3OTMyNTk0NzksImp0aSI6IjEwNDRmODQwLTI1YjItNDIwZC05ZGIxLTBiNjI5MTU4N2FjYSIsInNpZCI6IjYwM2RhNmZmLTk1YjQtNDE5OC05YjA1LWM2Y2ZmYjBlODkwYSJ9.cAbS8_nnxWG4q0P1BlGoUdmJTbqmNFPL1xBZoX6wq18",
  "access_expires_at": "2026-10-29T07:52:59.095397498Z",
  "refresh_token": "fX2G1Hpickw7khWSIfDhv8iX_hsAbExkrTA2CRGp_Fg",
  "refresh_expires_at": "2026-11-28T07:37:59.094694604Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "171e5547-194f-413c-bebb-dc0d80829408",
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
  "id": "4cc41d9d-e900-46aa-81e4-c7aa86aae04f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:42:59.374183Z",
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
  "command_id": "54bafdde-3722-4e3e-bff7-3d0db02dc13a",
  "quote_id": "4cc41d9d-e900-46aa-81e4-c7aa86aae04f",
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
    "phone": "+380674109448"
  }
}
```

```json
{
  "id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:37:59.661013Z",
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
    "id": "c7235086-9ede-4181-95d7-dbc4cc47756d",
    "order_id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
    "expires_at": "2026-10-29T07:38:14.665093Z",
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

`POST /api/driver/v1/offers/c7235086-9ede-4181-95d7-dbc4cc47756d/accept` → **200**

```json
{
  "command_id": "cce566a8-c0e4-4f88-8d7d-145983df56e6"
}
```

```json
{
  "id": "fbe0080d-9de6-4317-a242-2a9cdac80e1e",
  "order_id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7bd27f5b-7a08-4077-a4fd-16962518faa0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7bd27f5b-7a08-4077-a4fd-16962518faa0",
  "order_id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
  "assignment_id": "fbe0080d-9de6-4317-a242-2a9cdac80e1e",
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
    "phone": "+380674109448"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d1b0c8b3-4d7c-4bf9-9cdf-0665db4d826f",
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
  "id": "291bfc8b-c4a0-47b6-bac9-54fd904e947d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:43:00.854309Z",
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
  "command_id": "6ea4bb52-405e-4a8c-a502-e535e814e681",
  "quote_id": "291bfc8b-c4a0-47b6-bac9-54fd904e947d",
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
  "id": "f97a7e5f-b302-435b-a739-64a88c5cb642",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:38:01.146359Z",
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
  "command_id": "3182becf-8559-4261-bd93-055813c3b7c7",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T10:38:01Z"
}
```

```json
{
  "id": "c70864f5-1106-4dea-aec9-235b89304cd1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:43:01.453842Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:38:01Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c1a7225a-f69b-45e7-b3e6-4e0624002f8c",
  "quote_id": "c70864f5-1106-4dea-aec9-235b89304cd1",
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
  "pickup_at": "2026-10-29T10:38:01Z"
}
```

```json
{
  "id": "88e70993-e34c-4b04-ba10-8524b76610d4",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:38:01.760278Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:38:01Z",
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
  "command_id": "401801b6-0b2a-4edd-9cb4-304acd95344b",
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
  "id": "3c0878d1-0b93-418e-8116-2a47b07dd999",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:43:02.067602Z",
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
  "command_id": "2788df78-9932-49bb-9416-fd7f8ebb8d3f",
  "quote_id": "3c0878d1-0b93-418e-8116-2a47b07dd999",
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
  "correlation_id": "2cb394fc-84f7-483a-879b-38670a32b5d3"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "88e70993-e34c-4b04-ba10-8524b76610d4",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T07:38:01.760278Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T10:38:01Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f97a7e5f-b302-435b-a739-64a88c5cb642",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T07:38:01.146359Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "f97a7e5f-b302-435b-a739-64a88c5cb642",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:38:01.146359Z",
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

`GET /api/rider/v1/orders/1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b` → **200**

```json
{
  "id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "fbe0080d-9de6-4317-a242-2a9cdac80e1e",
    "order_id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7bd27f5b-7a08-4077-a4fd-16962518faa0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:37:59.661013Z",
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
    "location_at": "2026-10-29T07:37:58.49441Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b/cancel` → **200**

```json
{
  "command_id": "bd6a6b7c-5c54-498d-9df5-28ae435e15f5",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "fbe0080d-9de6-4317-a242-2a9cdac80e1e",
    "order_id": "1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7bd27f5b-7a08-4077-a4fd-16962518faa0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:37:59.661013Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/f97a7e5f-b302-435b-a739-64a88c5cb642` → **200**

```json
{
  "id": "f97a7e5f-b302-435b-a739-64a88c5cb642",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:38:01.146359Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f97a7e5f-b302-435b-a739-64a88c5cb642/cancel` → **200**

```json
{
  "command_id": "c86448f8-8c6c-4d66-baa4-11138e0b2f53",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f97a7e5f-b302-435b-a739-64a88c5cb642",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:38:01.146359Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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

`GET /api/rider/v1/orders/88e70993-e34c-4b04-ba10-8524b76610d4` → **200**

```json
{
  "id": "88e70993-e34c-4b04-ba10-8524b76610d4",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:38:01.760278Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:38:01Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/88e70993-e34c-4b04-ba10-8524b76610d4/cancel` → **200**

```json
{
  "command_id": "a975b870-f6cb-45ec-b5e1-e68899f53764",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "88e70993-e34c-4b04-ba10-8524b76610d4",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "869e30d4-704e-4104-8dd3-e0e771aa5016",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:38:01.760278Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-29T10:38:01Z",
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
  "session_id": "6636836d-73af-4d33-8ac0-3ab98d155ce3",
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
  "last_heartbeat_at": "2026-10-29T07:37:58.49441Z",
  "last_location_at": "2026-10-29T07:37:58.49441Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6636836d-73af-4d33-8ac0-3ab98d155ce3/close` → **200**

```json
{
  "command_id": "9af5c38c-c36b-4647-9ee7-e162ae8086be",
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

Done: orders 1d8a1d5d-79c4-4c52-b7c5-a7683f1ce18b, f97a7e5f-b302-435b-a739-64a88c5cb642, 88e70993-e34c-4b04-ba10-8524b76610d4.

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
  "session_id": "3570d94c-c677-48fd-8cbc-b7734d5b474c",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzODUsImlhdCI6MTc5MzI1OTQ4NSwianRpIjoiMDUyMDFhYmYtZjNjYy00MDBkLWIxNjktZjc0ODgyZmViMTQ1Iiwic2lkIjoiMzU3MGQ5NGMtYzY3Ny00OGZkLThjYmMtYjc3MzRkNWI0NzRjIn0.XcNtR56yRaix6e3yfNWuuDB_uV4b822gBb2AxZVaIww",
  "access_expires_at": "2026-10-29T07:53:05.833480212Z",
  "refresh_token": "minu6HUMk502Sng7m9hkfiD-XoP4QzTl-WeTquq6hAM",
  "refresh_expires_at": "2026-10-29T19:38:05.83291587Z",
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
  "session_id": "bc00f624-e691-42f8-9280-15c3c6cb2c9c",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzODYsImlhdCI6MTc5MzI1OTQ4NiwianRpIjoiMWJhZWNhMDctNzkxNC00ZmM5LWEyY2EtMjgxZmUxZDM0N2NhIiwic2lkIjoiYmMwMGY2MjQtZTY5MS00MmY4LTkyODAtMTVjM2M2Y2IyYzljIn0.qBR30L2-1vhlTRmTTwERala8QHV0m8PwGuceJHj9QD0",
  "access_expires_at": "2026-10-29T07:53:06.40520101Z",
  "refresh_token": "fhEn4Msy3TRXA8mIJuPSsMmZZJTGLeuMxCdupCJp5wQ",
  "refresh_expires_at": "2026-10-29T19:38:06.404625656Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31821"
}
```

```json
{
  "challenge_id": "971f8310-ceda-488d-8528-e773e32acde2",
  "expires_at": "2026-10-29T07:43:06.670250843Z",
  "resend_available_at": "2026-10-29T07:38:07.670250843Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "216973",
  "sent_at": "2026-10-29T07:38:06.67263252Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "971f8310-ceda-488d-8528-e773e32acde2",
  "code": "216973",
  "device_ref": "sandbox-31821"
}
```

```json
{
  "session_id": "140a5850-3ef8-40d4-9277-e208edfa6f74",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDM4NiwiaWF0IjoxNzkzMjU5NDg2LCJqdGkiOiI3NGIxYzAwZi0wMzg5LTRmNjYtODdmMS0wNmZhOTU3Y2I0ZDQiLCJzaWQiOiIxNDBhNTg1MC0zZWY4LTQwZDQtOTI3Ny1lMjA4ZWRmYTZmNzQifQ.feDTjXYevoj5_R3h6B6eeeXYEZHra5qJHhvqKX9IIvE",
  "access_expires_at": "2026-10-29T07:53:06.979228769Z",
  "refresh_token": "rPuRzgl2r4YCKdEhSqv8qr5YHlLDopEa17m44HzPiHA",
  "refresh_expires_at": "2026-11-28T07:38:06.978670018Z",
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
  "command_id": "aab6ce02-9df3-4083-a847-ba8b3dbb1560",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:38:07Z",
    "sequence": 1793259487519
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc9d509f-8931-4f8e-bb73-28c4d043f95e",
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
  "last_heartbeat_at": "2026-10-29T07:38:07.539239Z",
  "last_location_at": "2026-10-29T07:38:07.539239Z",
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
  "command_id": "9a9f9917-dd6b-4eef-a8ff-e9d0730c8080",
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
  "effective_at": "2026-10-29T07:38:08.130306Z",
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T07:35:41.875621Z",
  "last_entries": [
    {
      "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:35:41.875621Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b8b32b2d-b7dc-4320-a368-81d312d9db21",
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
  "id": "22f7a204-d2b4-45ac-be2e-7b22542566aa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:43:08.722587Z",
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
  "command_id": "f7bc8a09-e5ab-4d8c-a30b-b0b460657036",
  "quote_id": "22f7a204-d2b4-45ac-be2e-7b22542566aa",
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
    "phone": "+3806711125472"
  }
}
```

```json
{
  "id": "467a2727-fcd5-40cb-9884-0268d33b2762",
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
  "created_at": "2026-10-29T07:38:09.028718Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125472"
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
    "id": "3e6f3c0a-2d2e-4fa4-9518-46519e8c3276",
    "order_id": "467a2727-fcd5-40cb-9884-0268d33b2762",
    "expires_at": "2026-10-29T07:38:24.032561Z",
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

`POST /api/driver/v1/offers/3e6f3c0a-2d2e-4fa4-9518-46519e8c3276/accept` → **200**

```json
{
  "command_id": "f0021ba3-eb85-4820-b0a6-238843223434"
}
```

```json
{
  "id": "541fd955-2edb-427f-842f-b0aad682ef4e",
  "order_id": "467a2727-fcd5-40cb-9884-0268d33b2762",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "09e0758a-1233-4726-88e0-f3cda5c5d184",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "09e0758a-1233-4726-88e0-f3cda5c5d184",
  "order_id": "467a2727-fcd5-40cb-9884-0268d33b2762",
  "assignment_id": "541fd955-2edb-427f-842f-b0aad682ef4e",
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
    "phone": "+3806711125472"
  }
}
```

`POST /api/driver/v1/work-sessions/dc9d509f-8931-4f8e-bb73-28c4d043f95e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:38:10Z",
    "sequence": 1793259490182
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc9d509f-8931-4f8e-bb73-28c4d043f95e",
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
  "last_heartbeat_at": "2026-10-29T07:38:10.20282Z",
  "last_location_at": "2026-10-29T07:38:10.20282Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/09e0758a-1233-4726-88e0-f3cda5c5d184/arrive` → **200**

```json
{
  "command_id": "525dbe82-9491-419f-b5c9-ee0c682c6ef3",
  "expected_version": 0
}
```

```json
{
  "id": "09e0758a-1233-4726-88e0-f3cda5c5d184",
  "order_id": "467a2727-fcd5-40cb-9884-0268d33b2762",
  "assignment_id": "541fd955-2edb-427f-842f-b0aad682ef4e",
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
  "arrived_at": "2026-10-29T07:38:10.499497Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125472"
  }
}
```

`POST /api/driver/v1/trips/09e0758a-1233-4726-88e0-f3cda5c5d184/start` → **200**

```json
{
  "command_id": "d22c8473-cf7e-44ee-a886-d6c3530000ac",
  "expected_version": 1
}
```

```json
{
  "id": "09e0758a-1233-4726-88e0-f3cda5c5d184",
  "order_id": "467a2727-fcd5-40cb-9884-0268d33b2762",
  "assignment_id": "541fd955-2edb-427f-842f-b0aad682ef4e",
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
  "arrived_at": "2026-10-29T07:38:10.499497Z",
  "started_at": "2026-10-29T07:38:10.809894Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125472"
  }
}
```

`POST /api/driver/v1/trips/09e0758a-1233-4726-88e0-f3cda5c5d184/complete` → **200**

```json
{
  "command_id": "9dabd715-8ab4-4d0a-9304-49c6abab1028",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:38:11Z",
  "cash_received": true
}
```

```json
{
  "id": "09e0758a-1233-4726-88e0-f3cda5c5d184",
  "order_id": "467a2727-fcd5-40cb-9884-0268d33b2762",
  "assignment_id": "541fd955-2edb-427f-842f-b0aad682ef4e",
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
  "arrived_at": "2026-10-29T07:38:10.499497Z",
  "started_at": "2026-10-29T07:38:10.809894Z",
  "completed_at": "2026-10-29T07:38:11.126724Z",
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
  "command_id": "bcf1cdb9-079b-40ff-81c1-e7d193c89813",
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
  "id": "6f9c77c0-34d8-44a8-85f0-bef6c20b8eb0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:43:11.434648Z",
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
  "command_id": "e6d93e24-3513-4b82-a63d-510231596d6b",
  "quote_id": "6f9c77c0-34d8-44a8-85f0-bef6c20b8eb0",
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
    "phone": "+3806711130722"
  }
}
```

```json
{
  "id": "0c1b8737-55b2-4d7d-880d-51e6ecdc3ff3",
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
  "created_at": "2026-10-29T07:38:11.737264Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130722"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0c1b8737-55b2-4d7d-880d-51e6ecdc3ff3` → **200**

```json
{
  "id": "0c1b8737-55b2-4d7d-880d-51e6ecdc3ff3",
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
  "created_at": "2026-10-29T07:38:11.737264Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130722"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0c1b8737-55b2-4d7d-880d-51e6ecdc3ff3/cancel` → **200**

```json
{
  "command_id": "cb39a62e-f769-4027-be34-b6b0d76a10db",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "0c1b8737-55b2-4d7d-880d-51e6ecdc3ff3",
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
  "created_at": "2026-10-29T07:38:11.737264Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711130722"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора",
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
  "staff_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T07:35:41.875621Z",
  "last_entries": [
    {
      "order_id": "0c1b8737-55b2-4d7d-880d-51e6ecdc3ff3",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T07:38:12.360311Z"
    },
    {
      "order_id": "467a2727-fcd5-40cb-9884-0268d33b2762",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T07:38:11.13171Z"
    },
    {
      "order_id": "32c0fa41-1d5e-48f9-90c2-41eb1ba2a52c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:35:41.875621Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dc9d509f-8931-4f8e-bb73-28c4d043f95e",
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
  "last_heartbeat_at": "2026-10-29T07:38:10.20282Z",
  "last_location_at": "2026-10-29T07:38:10.20282Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dc9d509f-8931-4f8e-bb73-28c4d043f95e/close` → **200**

```json
{
  "command_id": "f33238cc-a8f7-4969-b394-891f5f461e33",
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

Done: operator bonus for fulfilled 467a2727-fcd5-40cb-9884-0268d33b2762 and operator-fault cancellation 0c1b8737-55b2-4d7d-880d-51e6ecdc3ff3.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678656231",
  "device_ref": "sandbox-4583"
}
```

```json
{
  "challenge_id": "530d9f2b-c6d1-4701-93aa-4865c16dab45",
  "expires_at": "2026-10-29T07:43:15.556173079Z",
  "resend_available_at": "2026-10-29T07:38:16.556173079Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678656231` → **200**

```json
{
  "phone": "+380678656231",
  "audience": "CLIENT",
  "code": "321230",
  "sent_at": "2026-10-29T07:38:15.558628694Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675661524",
  "device_ref": "sandbox-6206",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "cf81dccd-a368-4f84-ab0b-8d1394307c91",
  "expires_at": "2026-10-29T07:43:15.878877673Z",
  "resend_available_at": "2026-10-29T07:38:16.878877673Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675661524` → **200**

```json
{
  "phone": "+380675661524",
  "audience": "CLIENT",
  "code": "114238",
  "sent_at": "2026-10-29T07:38:15.881005821Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677650000",
  "device_ref": "sandbox-26465"
}
```

```json
{
  "challenge_id": "4cc42572-6b02-4dfa-b992-ac049c3d1ecb",
  "expires_at": "2026-10-29T07:43:16.18365981Z",
  "resend_available_at": "2026-10-29T07:38:17.18365981Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677650000` → **200**

```json
{
  "phone": "+380677650000",
  "audience": "CLIENT",
  "code": "595012",
  "sent_at": "2026-10-29T07:38:16.186817771Z",
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
  "session_id": "2cbe02d2-e100-4b9e-a215-76b3069f8619",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzOTYsImlhdCI6MTc5MzI1OTQ5NiwianRpIjoiYWFiNjhiYjctNjY0Ny00ZjM4LTlmZmYtMGFhNzg0ZmVmNTljIiwic2lkIjoiMmNiZTAyZDItZTEwMC00YjllLWEyMTUtNzZiMzA2OWY4NjE5In0.XlKCUUw4_V_BlIz7GKctxFTIgpyCnbLF1QIE6Y4Kajs",
  "access_expires_at": "2026-10-29T07:53:16.787447862Z",
  "refresh_token": "c0oknQnHyC3NC1dBhufvJ1L5Fy2D8JOPJb8g5BfH0XY",
  "refresh_expires_at": "2026-10-29T19:38:16.786854535Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677650000` → **200**

```json
{
  "deliveries": [
    {
      "id": "f1b45f9d-8f03-4241-b9ef-1e3bd6eb9522",
      "challenge_id": "4cc42572-6b02-4dfa-b992-ac049c3d1ecb",
      "phone": "+380677650000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bfaf3c33-c546-4d08-b292-90dac4867eba",
      "error": null,
      "attempted_at": "2026-10-29T07:38:16.187064Z"
    },
    {
      "id": "c8564929-9de9-4123-a337-79313acb5868",
      "challenge_id": "4cc42572-6b02-4dfa-b992-ac049c3d1ecb",
      "phone": "+380677650000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T07:38:16.185857Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677650000` → **200**

```json
{
  "phone": "+380677650000",
  "audience": "CLIENT",
  "code": "595012",
  "sent_at": "2026-10-29T07:38:16.186817771Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675661524` → **200**

```json
{
  "deliveries": [
    {
      "id": "4f4adbc0-62e0-4200-9071-64a748d16924",
      "challenge_id": "cf81dccd-a368-4f84-ab0b-8d1394307c91",
      "phone": "+380675661524",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d55454ee-08fb-45c7-ba2e-a280b0b6302c",
      "error": null,
      "attempted_at": "2026-10-29T07:38:15.881278Z"
    }
  ]
}
```

Done: SMS to +380678656231, a call to +380675661524, SMS then a call to +380677650000.

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
  "session_id": "baa3e045-778c-42d5-a2dc-9107a71dd508",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzOTcsImlhdCI6MTc5MzI1OTQ5NywianRpIjoiNzNjMDQ5NjktNzM0Ni00M2NhLThmNjctYWI3N2NmYmY5YzkwIiwic2lkIjoiYmFhM2UwNDUtNzc4Yy00MmQ1LWEyZGMtOTEwN2E3MWRkNTA4In0.-Odnz7VYlf3KmCCVJJfsMmvq5nfHKm-VJPtl6mrwVL4",
  "access_expires_at": "2026-10-29T07:53:17.959159148Z",
  "refresh_token": "Vr8UGGJNslUaRP5MM79wv0t5U1IWSPWuV6n3nZuWSl8",
  "refresh_expires_at": "2026-10-29T19:38:17.958623801Z",
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
  "session_id": "ca57af1c-8634-44c2-8775-842ad6c2e6d1",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAzOTgsImlhdCI6MTc5MzI1OTQ5OCwianRpIjoiMDdiM2RiMjYtNjQ5MC00OTc3LTgwYzMtNTlkNDg2NDk2NDA2Iiwic2lkIjoiY2E1N2FmMWMtODYzNC00NGMyLTg3NzUtODQyYWQ2YzJlNmQxIn0.ZgfJ_ILrcLbj1yRer0siuW5_96djxdlCQaeO58GDCFE",
  "access_expires_at": "2026-10-29T07:53:18.535776394Z",
  "refresh_token": "mpd5p2kYqZDlGZSD8jbWTWhtp1Wvhy3o3Z1e9fynLe8",
  "refresh_expires_at": "2026-10-29T19:38:18.535219906Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
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

`POST /api/admin/v1/staff-extensions/14eba4c7-08b7-4877-b1ab-dd99dfae1d44` → **200**

```json
{
  "command_id": "aedaed8a-780e-4749-b320-3b277569ed4f",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "3bfe3b18-74ef-4338-a774-854af4b6feba",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:38:19.682133Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:38:19.682133Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7eaec516-ecd3-4525-9864-aed20261e490",
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
  "id": "4806323e-cf1e-4977-a16a-a5f091e54a03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:43:20.230015Z",
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
  "command_id": "354e0aad-9f75-4372-8242-510a78e94c0d",
  "quote_id": "4806323e-cf1e-4977-a16a-a5f091e54a03",
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
    "phone": "+380673717946"
  }
}
```

```json
{
  "id": "1071645f-0cd2-4942-bc44-0db9fe2024ef",
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
  "created_at": "2026-10-29T07:38:20.524647Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673717946"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/1071645f-0cd2-4942-bc44-0db9fe2024ef/calls` → **201**

```json
{
  "command_id": "f75bcc94-886e-4eb3-b998-e4e0d9b550d9",
  "to": "CALLER"
}
```

```json
{
  "id": "535640f5-508a-4bb0-af28-9a9efc3eca2f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "order_ids": [
    "1071645f-0cd2-4942-bc44-0db9fe2024ef"
  ],
  "started_at": "2026-10-29T07:38:20.897696Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/1071645f-0cd2-4942-bc44-0db9fe2024ef/calls` → **201**

```json
{
  "command_id": "f75bcc94-886e-4eb3-b998-e4e0d9b550d9",
  "to": "CALLER"
}
```

```json
{
  "id": "535640f5-508a-4bb0-af28-9a9efc3eca2f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "order_ids": [
    "1071645f-0cd2-4942-bc44-0db9fe2024ef"
  ],
  "started_at": "2026-10-29T07:38:20.897696Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "535640f5-508a-4bb0-af28-9a9efc3eca2f",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673717946",
    "at": "2026-10-29T07:38:20.900035994Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "535640f5-508a-4bb0-af28-9a9efc3eca2f",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.25029",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "535640f5-508a-4bb0-af28-9a9efc3eca2f"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "535640f5-508a-4bb0-af28-9a9efc3eca2f",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=1071645f-0cd2-4942-bc44-0db9fe2024ef` → **200**

```json
{
  "calls": [
    {
      "id": "535640f5-508a-4bb0-af28-9a9efc3eca2f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [
        "1071645f-0cd2-4942-bc44-0db9fe2024ef"
      ],
      "started_at": "2026-10-29T07:38:20.897696Z",
      "answered_at": "2026-10-29T07:38:21.553568Z",
      "ended_at": "2026-10-29T07:38:21.575533Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=1071645f-0cd2-4942-bc44-0db9fe2024ef` → **200**

```json
{
  "calls": [
    {
      "id": "535640f5-508a-4bb0-af28-9a9efc3eca2f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "order_ids": [
        "1071645f-0cd2-4942-bc44-0db9fe2024ef"
      ],
      "started_at": "2026-10-29T07:38:20.897696Z",
      "answered_at": "2026-10-29T07:38:21.553568Z",
      "ended_at": "2026-10-29T07:38:21.575533Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:38:21.679824Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/1071645f-0cd2-4942-bc44-0db9fe2024ef` → **200**

```json
{
  "id": "1071645f-0cd2-4942-bc44-0db9fe2024ef",
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
  "created_at": "2026-10-29T07:38:20.524647Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673717946"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1071645f-0cd2-4942-bc44-0db9fe2024ef/cancel` → **200**

```json
{
  "command_id": "f7698da4-f521-42cd-bb9c-a2a028edc02b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1071645f-0cd2-4942-bc44-0db9fe2024ef",
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
  "created_at": "2026-10-29T07:38:20.524647Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673717946"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
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
  "command_id": "9c42e670-5a77-4800-8158-2f0e393a7e22",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T07:38:24.766446Z",
  "extension": "101"
}
```

Done: outgoing call 535640f5-508a-4bb0-af28-9a9efc3eca2f from order 1071645f-0cd2-4942-bc44-0db9fe2024ef, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632301798",
  "device_ref": "sandbox-22048"
}
```

```json
{
  "challenge_id": "d7cff34b-f89d-4a9d-b99a-c0a5e0215aec",
  "expires_at": "2026-10-29T07:43:25.055281192Z",
  "resend_available_at": "2026-10-29T07:38:26.055281192Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632301798` → **200**

```json
{
  "phone": "+380632301798",
  "audience": "CLIENT",
  "code": "418791",
  "sent_at": "2026-10-29T07:38:25.05770686Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7cff34b-f89d-4a9d-b99a-c0a5e0215aec",
  "code": "418791",
  "device_ref": "sandbox-22048"
}
```

```json
{
  "session_id": "f45d73f6-ae53-4ae1-aafe-df75223cfe55",
  "subject": {
    "type": "CLIENT",
    "id": "9642d19d-f941-482a-a961-65b6dbcd8ba0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjQyZDE5ZC1mOTQxLTQ4MmEtYTk2MS02NWI2ZGJjZDhiYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDA1LCJpYXQiOjE3OTMyNTk1MDUsImp0aSI6Ijc2ODM2OWM3LTlmNTUtNDEyMC1iYjU0LTliYTUwYzNiZDlhYiIsInNpZCI6ImY0NWQ3M2Y2LWFlNTMtNGFlMS1hYWZlLWRmNzUyMjNjZmU1NSJ9.YNyVLnNeZVZYcd78gJxa4vuVKD9mGOFjaFNIjPemj7Y",
  "access_expires_at": "2026-10-29T07:53:25.355613487Z",
  "refresh_token": "ez34cQioeva3PRCXZqyGB2XOHgGuYLqCczzoTeWtHvU",
  "refresh_expires_at": "2026-11-28T07:38:25.355099519Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9642d19d-f941-482a-a961-65b6dbcd8ba0",
  "session_id": "f45d73f6-ae53-4ae1-aafe-df75223cfe55",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632301798",
  "device_ref": "sandbox-14697"
}
```

```json
{
  "challenge_id": "a1201893-be46-44c7-9440-319c286574fb",
  "expires_at": "2026-10-29T07:43:27.902938626Z",
  "resend_available_at": "2026-10-29T07:38:28.902938626Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632301798` → **200**

```json
{
  "phone": "+380632301798",
  "audience": "CLIENT",
  "code": "491039",
  "sent_at": "2026-10-29T07:38:27.905030604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1201893-be46-44c7-9440-319c286574fb",
  "code": "491039",
  "device_ref": "sandbox-14697"
}
```

```json
{
  "session_id": "3e946a0e-2e67-43d4-9b96-fcd11d03e58e",
  "subject": {
    "type": "CLIENT",
    "id": "9642d19d-f941-482a-a961-65b6dbcd8ba0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjQyZDE5ZC1mOTQxLTQ4MmEtYTk2MS02NWI2ZGJjZDhiYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDA4LCJpYXQiOjE3OTMyNTk1MDgsImp0aSI6IjkwNGI3NzA5LWU3N2EtNDVlNy1iNDdlLTc2YzUxNTMzYzU3YiIsInNpZCI6IjNlOTQ2YTBlLTJlNjctNDNkNC05Yjk2LWZjZDExZDAzZTU4ZSJ9.5wWkkMl94_JhX1Gx-KTQcsvamHhIqLE4opSWrNqLIJE",
  "access_expires_at": "2026-10-29T07:53:28.205120717Z",
  "refresh_token": "PVnOw6NK694xOrxpk0JvN_r8x3WpJBAc2GNfNCaQ_LI",
  "refresh_expires_at": "2026-11-28T07:38:28.204418975Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "07815297-59c8-4d0a-aa1a-03f36719e39e",
  "expires_at": "2026-10-29T07:43:30.484968718Z",
  "resend_available_at": "2026-10-29T07:38:31.484968718Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632301798` → **200**

```json
{
  "phone": "+380632301798",
  "audience": "CLIENT",
  "code": "647066",
  "sent_at": "2026-10-29T07:38:30.48749736Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637552698"
}
```

```json
{
  "challenge_id": "7a3dc4c8-cf95-49e1-beee-90a09130bb1e",
  "expires_at": "2026-10-29T07:43:30.77942696Z",
  "resend_available_at": "2026-10-29T07:38:31.77942696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637552698` → **200**

```json
{
  "phone": "+380637552698",
  "audience": "CLIENT",
  "code": "144580",
  "sent_at": "2026-10-29T07:38:30.781686178Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "65668d01-3839-4dfd-a8f0-1c4d51ad26d9",
  "current_challenge_id": "07815297-59c8-4d0a-aa1a-03f36719e39e",
  "current_code": "000000",
  "new_challenge_id": "7a3dc4c8-cf95-49e1-beee-90a09130bb1e",
  "new_code": "144580"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "881dafe4-83e1-4f6a-84e2-86bb32fcb1f9"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "345919be-8c3b-4f52-9999-b16b849faa03",
  "current_challenge_id": "07815297-59c8-4d0a-aa1a-03f36719e39e",
  "current_code": "647066",
  "new_challenge_id": "7a3dc4c8-cf95-49e1-beee-90a09130bb1e",
  "new_code": "144580"
}
```

```json
{
  "subject_id": "9642d19d-f941-482a-a961-65b6dbcd8ba0",
  "phone": "+380637552698",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9642d19d-f941-482a-a961-65b6dbcd8ba0",
  "session_id": "f45d73f6-ae53-4ae1-aafe-df75223cfe55",
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
  "correlation_id": "6d3d3840-b508-4fb6-bd08-d2fb5838991c"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637552698",
  "device_ref": "sandbox-20185"
}
```

```json
{
  "challenge_id": "fd7bfc50-6857-4b1f-9b75-2b0d73da428f",
  "expires_at": "2026-10-29T07:43:34.207756631Z",
  "resend_available_at": "2026-10-29T07:38:35.207756631Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637552698` → **200**

```json
{
  "phone": "+380637552698",
  "audience": "CLIENT",
  "code": "909855",
  "sent_at": "2026-10-29T07:38:34.210025818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd7bfc50-6857-4b1f-9b75-2b0d73da428f",
  "code": "909855",
  "device_ref": "sandbox-20185"
}
```

```json
{
  "session_id": "9e05a960-7160-4d39-95ff-4c2769814f21",
  "subject": {
    "type": "CLIENT",
    "id": "9642d19d-f941-482a-a961-65b6dbcd8ba0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjQyZDE5ZC1mOTQxLTQ4MmEtYTk2MS02NWI2ZGJjZDhiYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDE0LCJpYXQiOjE3OTMyNTk1MTQsImp0aSI6ImQ0OTliZWIwLTQyOGYtNGIwYS1iYzUwLWY5NjZhYzczOGY1MiIsInNpZCI6IjllMDVhOTYwLTcxNjAtNGQzOS05NWZmLTRjMjc2OTgxNGYyMSJ9.M0iPiey7R3SCWj95HzrthtAeufqQTu8D6rFVSsKEs4E",
  "access_expires_at": "2026-10-29T07:53:34.509025803Z",
  "refresh_token": "CUuY7Tq114F-0M_7DWSZsAr3Iu361G_QXnrVWYuqiBk",
  "refresh_expires_at": "2026-11-28T07:38:34.508501511Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9642d19d-f941-482a-a961-65b6dbcd8ba0",
  "session_id": "9e05a960-7160-4d39-95ff-4c2769814f21",
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
  "session_id": "efbd24f8-0dcd-43ac-aeb6-afedbbb59c8a",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0MTUsImlhdCI6MTc5MzI1OTUxNSwianRpIjoiOGZlYmRiMjUtNmFiZS00YWNkLWFkNDUtNzY3NzgxZWExOGI1Iiwic2lkIjoiZWZiZDI0ZjgtMGRjZC00M2FjLWFlYjYtYWZlZGJiYjU5YzhhIn0.b0MMGePe3ohovPtcS1Kp2NPz8cozyHYRAJLue9pBZhA",
  "access_expires_at": "2026-10-29T07:53:35.349365892Z",
  "refresh_token": "gJgVTiNryWHhsKRuOTzDIh5sCF2gdUWud2KSLpTCGzk",
  "refresh_expires_at": "2026-10-29T19:38:35.348872423Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/9642d19d-f941-482a-a961-65b6dbcd8ba0` → **200**

```json
{
  "client": {
    "id": "9642d19d-f941-482a-a961-65b6dbcd8ba0",
    "phone": "+380637552698",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:38:25.353621Z",
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

`POST /api/admin/v1/clients/9642d19d-f941-482a-a961-65b6dbcd8ba0/phone/new-code` → **201**

```json
{
  "phone": "+380637993652"
}
```

```json
{
  "challenge_id": "abacfb50-9da3-401d-97f3-93db6433d559",
  "expires_at": "2026-10-29T07:43:35.920146332Z",
  "resend_available_at": "2026-10-29T07:38:36.920146332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637993652` → **200**

```json
{
  "phone": "+380637993652",
  "audience": "CLIENT",
  "code": "465356",
  "sent_at": "2026-10-29T07:38:35.922409605Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/9642d19d-f941-482a-a961-65b6dbcd8ba0/phone` → **422**

```json
{
  "command_id": "44c80527-eb76-4d0c-9aa9-ced14845a3df",
  "expected_version": 3,
  "new_challenge_id": "abacfb50-9da3-401d-97f3-93db6433d559",
  "new_code": "465357",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/9642d19d-f941-482a-a961-65b6dbcd8ba0/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "6b82e2be-f868-4b45-85b4-22aefb4533d0"
}
```

`POST /api/admin/v1/clients/9642d19d-f941-482a-a961-65b6dbcd8ba0/phone` → **400**

```json
{
  "command_id": "dd2f3952-22ce-41e4-88b7-1529eb732b9c",
  "expected_version": 3,
  "new_challenge_id": "abacfb50-9da3-401d-97f3-93db6433d559",
  "new_code": "465356",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9642d19d-f941-482a-a961-65b6dbcd8ba0/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4790e464-a094-4c42-904c-ebf571370462",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/9642d19d-f941-482a-a961-65b6dbcd8ba0/phone` → **200**

```json
{
  "command_id": "732eed38-c2ac-4d57-9a69-7ca1a29f9728",
  "expected_version": 3,
  "new_challenge_id": "abacfb50-9da3-401d-97f3-93db6433d559",
  "new_code": "465356",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "9642d19d-f941-482a-a961-65b6dbcd8ba0",
  "phone": "+380637993652",
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
  "correlation_id": "6d70ad23-d83f-4a6e-95f5-8ec781bfb08f"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637993652",
  "device_ref": "sandbox-13335"
}
```

```json
{
  "challenge_id": "5ffa21cc-7493-41cf-ac7d-c42c6240ca54",
  "expires_at": "2026-10-29T07:43:37.364621272Z",
  "resend_available_at": "2026-10-29T07:38:38.364621272Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637993652` → **200**

```json
{
  "phone": "+380637993652",
  "audience": "CLIENT",
  "code": "120652",
  "sent_at": "2026-10-29T07:38:37.366832446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5ffa21cc-7493-41cf-ac7d-c42c6240ca54",
  "code": "120652",
  "device_ref": "sandbox-13335"
}
```

```json
{
  "session_id": "23cba34d-064f-408e-bd86-bd3c78583707",
  "subject": {
    "type": "CLIENT",
    "id": "9642d19d-f941-482a-a961-65b6dbcd8ba0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjQyZDE5ZC1mOTQxLTQ4MmEtYTk2MS02NWI2ZGJjZDhiYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDE3LCJpYXQiOjE3OTMyNTk1MTcsImp0aSI6IjFkOTIxNTNhLTc0NTItNGE3NS04NzM1LWMwM2M2NzRmMjIzNCIsInNpZCI6IjIzY2JhMzRkLTA2NGYtNDA4ZS1iZDg2LWJkM2M3ODU4MzcwNyJ9.2KiBaaz7qXlk9nPC0cnNoqkxYn7CrUd2OPcfscQVMZY",
  "access_expires_at": "2026-10-29T07:53:37.666754313Z",
  "refresh_token": "pD3y64dknIdCwtRI5ffIaNRYZknT9hkL4a_mbij9ho0",
  "refresh_expires_at": "2026-11-28T07:38:37.666207394Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9642d19d-f941-482a-a961-65b6dbcd8ba0",
  "session_id": "23cba34d-064f-408e-bd86-bd3c78583707",
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
  "phone": "+380632572577",
  "device_ref": "sandbox-18989"
}
```

```json
{
  "challenge_id": "6846e282-9086-4d19-bf66-c2a3160c13c5",
  "expires_at": "2026-10-29T07:43:38.22462452Z",
  "resend_available_at": "2026-10-29T07:38:39.22462452Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632572577` → **200**

```json
{
  "phone": "+380632572577",
  "audience": "CLIENT",
  "code": "350192",
  "sent_at": "2026-10-29T07:38:38.22680339Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6846e282-9086-4d19-bf66-c2a3160c13c5",
  "code": "350192",
  "device_ref": "sandbox-18989"
}
```

```json
{
  "session_id": "1bdc29d6-0824-411c-806f-1b007100ac9e",
  "subject": {
    "type": "CLIENT",
    "id": "9313655c-5acf-40c2-b167-8bbb81142f12"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MzEzNjU1Yy01YWNmLTQwYzItYjE2Ny04YmJiODExNDJmMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDE4LCJpYXQiOjE3OTMyNTk1MTgsImp0aSI6ImUyMGI0OGYzLTBhOTAtNGYxOC1hYTEyLTNhMDRkMjcxZGE2OSIsInNpZCI6IjFiZGMyOWQ2LTA4MjQtNDExYy04MDZmLTFiMDA3MTAwYWM5ZSJ9.54QJ5mhH4VcS8zYFyP9glldhlrQXgY3NIa8zy8-VWFY",
  "access_expires_at": "2026-10-29T07:53:38.532879687Z",
  "refresh_token": "gTL1XRk7oaNy9pF1jmHzkl2ar8_lw16zOCiOmSbGJpw",
  "refresh_expires_at": "2026-11-28T07:38:38.532376509Z",
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
  "session_id": "5724a52c-a9ea-470b-b0b3-b9aceadb7349",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0MTksImlhdCI6MTc5MzI1OTUxOSwianRpIjoiOWMyMzBiNjAtZDM2YS00M2IxLWIyY2ItNmRiZTgzYzg3NjM3Iiwic2lkIjoiNTcyNGE1MmMtYTllYS00NzBiLWIwYjMtYjlhY2VhZGI3MzQ5In0.ze1NmlcQkBfuK6IAO7L7t40uVymF6e4ZQlcfzFEUJ8E",
  "access_expires_at": "2026-10-29T07:53:39.700948801Z",
  "refresh_token": "1VnWSbEb8IQtuAA5WkchvfdfrnRKDat_Mzg45YJ8_fU",
  "refresh_expires_at": "2026-10-29T19:38:39.700440243Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632572577` → **200**

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
  "correlation_id": "055a2fe6-85d8-4e4d-af5f-70bb53ebd0b5"
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
  "session_id": "21ecebda-fadc-4ef8-85dc-8026bb27ee88",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0MjAsImlhdCI6MTc5MzI1OTUyMCwianRpIjoiNzE2ZWE0OWUtNTA1YS00YTRmLWE1MGMtYzQ5ZTZiNjk0ZWVmIiwic2lkIjoiMjFlY2ViZGEtZmFkYy00ZWY4LTg1ZGMtODAyNmJiMjdlZTg4In0.dUodVALOXwOUnKaeoGgZ44l7ORqg5TeDk42RrK3P0Tk",
  "access_expires_at": "2026-10-29T07:53:40.863830519Z",
  "refresh_token": "qvW3TUsRjk70mVTexsXIUXEB4MwLOeNk5bA6NVGYsqk",
  "refresh_expires_at": "2026-10-29T19:38:40.86327404Z",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:35:09.29502Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "57d8ccfb-8dd7-4d5d-82cd-acd385e017ee",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T07:38:41.455699039Z"
}
```

## The rider books the airport for 2026-10-29T10:38:40Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600261082",
  "device_ref": "sandbox-19237"
}
```

```json
{
  "challenge_id": "953e8b48-35d6-476c-be53-c47c5004e8ba",
  "expires_at": "2026-10-29T07:43:41.754707148Z",
  "resend_available_at": "2026-10-29T07:38:42.754707148Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600261082` → **200**

```json
{
  "phone": "+48600261082",
  "audience": "CLIENT",
  "code": "510181",
  "sent_at": "2026-10-29T07:38:41.75722709Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "953e8b48-35d6-476c-be53-c47c5004e8ba",
  "code": "510181",
  "device_ref": "sandbox-19237"
}
```

```json
{
  "session_id": "2c19ab01-0ffc-4546-8f74-52d6548f4747",
  "subject": {
    "type": "CLIENT",
    "id": "87bc1d60-f1bd-415b-8b38-898c6b4b5d88"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4N2JjMWQ2MC1mMWJkLTQxNWItOGIzOC04OThjNmI0YjVkODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDIyLCJpYXQiOjE3OTMyNTk1MjIsImp0aSI6IjZmNjBlNDIzLWJmYjUtNDRlZi05ZjVmLWQxNDY2MjI4ODY4MCIsInNpZCI6IjJjMTlhYjAxLTBmZmMtNDU0Ni04Zjc0LTUyZDY1NDhmNDc0NyJ9.xiBTlsXonyJ92IJOicJwpa-IKlgr9quF0M6GHKCdCdI",
  "access_expires_at": "2026-10-29T07:53:42.072665133Z",
  "refresh_token": "-IwI7MrGDx8BJPJhO7mWhVqB0c7D9gOcu5FzBc23syw",
  "refresh_expires_at": "2026-11-28T07:38:42.072157507Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e58f75a1-61a8-44f3-abe9-eb678be71523",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T10:38:40Z"
}
```

```json
{
  "id": "31982332-32e0-4de5-8615-534278c8facc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:43:42.354359Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:38:40Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "83a7ebd6-a125-4af9-99c6-785263bb7e00",
  "quote_id": "31982332-32e0-4de5-8615-534278c8facc",
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
  "pickup_at": "2026-10-29T10:38:40Z"
}
```

```json
{
  "id": "9b99e2a1-aeed-477b-8c45-550b61189a8f",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "87bc1d60-f1bd-415b-8b38-898c6b4b5d88",
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
  "created_at": "2026-10-29T07:38:42.657639Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:38:40Z",
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
  "device_ref": "sandbox-8066"
}
```

```json
{
  "challenge_id": "67d7e733-cb2d-433f-a04e-16b5049e21e1",
  "expires_at": "2026-10-29T07:43:42.945512894Z",
  "resend_available_at": "2026-10-29T07:38:43.945512894Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "820101",
  "sent_at": "2026-10-29T07:38:42.947694637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67d7e733-cb2d-433f-a04e-16b5049e21e1",
  "code": "820101",
  "device_ref": "sandbox-8066"
}
```

```json
{
  "session_id": "536b73ff-2785-4eb5-a59f-fa9f548d7301",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQyMywiaWF0IjoxNzkzMjU5NTIzLCJqdGkiOiJiYjRlOGFiNS02NzRhLTQ3YWUtOThhNy00OTkzODQzODY3ODkiLCJzaWQiOiI1MzZiNzNmZi0yNzg1LTRlYjUtYTU5Zi1mYTlmNTQ4ZDczMDEifQ.XUxzNOmdkz7TXkPWEzTaaJUMXp-Uh0mbFwTRTmdkPGc",
  "access_expires_at": "2026-10-29T07:53:43.259423347Z",
  "refresh_token": "6Eax9WOQWgAdkpKenhFe1xSJsMIi9SPe_sNdm58zSCE",
  "refresh_expires_at": "2026-11-28T07:38:43.258915411Z",
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
  "command_id": "7e62f58e-4221-4430-9cf0-36edb6287570",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:38:43Z",
    "sequence": 1793259523796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4ad3a66-8da2-49d2-bdde-4c1fbf4290d2",
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
  "last_heartbeat_at": "2026-10-29T07:38:43.815262Z",
  "last_location_at": "2026-10-29T07:38:43.815262Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "9b99e2a1-aeed-477b-8c45-550b61189a8f",
      "short_number": 23,
      "pickup_at": "2026-10-29T10:38:40Z",
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

`POST /api/driver/v1/preorders/9b99e2a1-aeed-477b-8c45-550b61189a8f/reserve` → **200**

```json
{
  "command_id": "691ef694-6368-4426-91a1-daa8af29b64c"
}
```

```json
{
  "id": "2f479f91-e90a-49f5-98f5-4225b46936be",
  "state": "RESERVED",
  "order": {
    "order_id": "9b99e2a1-aeed-477b-8c45-550b61189a8f",
    "short_number": 23,
    "pickup_at": "2026-10-29T10:38:40Z",
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
  "reserved_at": "2026-10-29T07:38:44.389624Z",
  "confirm_from": "2026-10-29T10:08:40Z",
  "confirm_until": "2026-10-29T10:18:40Z",
  "drop_until": "2026-10-29T09:38:40Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "2f479f91-e90a-49f5-98f5-4225b46936be",
      "state": "RESERVED",
      "order": {
        "order_id": "9b99e2a1-aeed-477b-8c45-550b61189a8f",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:38:40Z",
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
      "reserved_at": "2026-10-29T07:38:44.389624Z",
      "confirm_from": "2026-10-29T10:08:40Z",
      "confirm_until": "2026-10-29T10:18:40Z",
      "drop_until": "2026-10-29T09:38:40Z"
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
      "id": "2f479f91-e90a-49f5-98f5-4225b46936be",
      "state": "RESERVED",
      "order": {
        "order_id": "9b99e2a1-aeed-477b-8c45-550b61189a8f",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:38:40Z",
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
      "reserved_at": "2026-10-29T07:38:44.389624Z",
      "confirm_from": "2026-10-29T10:08:40Z",
      "confirm_until": "2026-10-29T10:18:40Z",
      "drop_until": "2026-10-29T09:38:40Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/2f479f91-e90a-49f5-98f5-4225b46936be/confirm` → **409**

```json
{
  "command_id": "7d88775b-cb73-4fb5-9e0a-608cb3a861ab"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/2f479f91-e90a-49f5-98f5-4225b46936be/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6145dcbe-810d-42f5-bceb-2745d818b26e"
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
  "session_id": "9084aa47-9cda-4e37-bf0a-ecd29f2d0aa1",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0MjUsImlhdCI6MTc5MzI1OTUyNSwianRpIjoiMDU3NjcxNzEtMDBiNC00ODA4LWE4NTktYTFjYTY4MTcxZTg0Iiwic2lkIjoiOTA4NGFhNDctOWNkYS00ZTM3LWJmMGEtZWNkMjlmMmQwYWExIn0.d9cweDQ_wCDPVnXLDdM2D8S307_4c5Oq8GPGEUIsN3A",
  "access_expires_at": "2026-10-29T07:53:45.808946044Z",
  "refresh_token": "8gjXTZDaiv_wO7CwUMvQFsi4sZXI9sO3jG-FiwFP5HM",
  "refresh_expires_at": "2026-10-29T19:38:45.808408431Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9b99e2a1-aeed-477b-8c45-550b61189a8f` → **200**

```json
{
  "id": "9b99e2a1-aeed-477b-8c45-550b61189a8f",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "87bc1d60-f1bd-415b-8b38-898c6b4b5d88",
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
  "created_at": "2026-10-29T07:38:42.657639Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T10:38:40Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "2f479f91-e90a-49f5-98f5-4225b46936be",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T07:38:44.389624Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9b99e2a1-aeed-477b-8c45-550b61189a8f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T07:38:42.658772Z",
      "actor": {
        "type": "CLIENT",
        "id": "87bc1d60-f1bd-415b-8b38-898c6b4b5d88",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "9b99e2a1-aeed-477b-8c45-550b61189a8f",
        "preorder": true,
        "quote_id": "31982332-32e0-4de5-8615-534278c8facc",
        "pickup_at": "2026-10-29T10:38:40Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "1e872cbd-c6e4-466b-99cf-344f3f15fdf8"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T07:38:44.390825Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9b99e2a1-aeed-477b-8c45-550b61189a8f",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "2f479f91-e90a-49f5-98f5-4225b46936be"
      },
      "correlation_id": "0c0020b7-ac33-4d62-974a-fcfb262206b9"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 9b99e2a1-aeed-477b-8c45-550b61189a8f, reservation 2f479f91-e90a-49f5-98f5-4225b46936be.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5085"
}
```

```json
{
  "challenge_id": "d40bc00a-ced7-44b8-9506-558547d49608",
  "expires_at": "2026-10-29T07:43:46.713654751Z",
  "resend_available_at": "2026-10-29T07:38:47.713654751Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "167018",
  "sent_at": "2026-10-29T07:38:46.716087913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d40bc00a-ced7-44b8-9506-558547d49608",
  "code": "167018",
  "device_ref": "sandbox-5085"
}
```

```json
{
  "session_id": "3d9f49a4-a9b6-472d-8a26-348adf1b57e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQyNywiaWF0IjoxNzkzMjU5NTI3LCJqdGkiOiI1MDM4YmQyMC1jMzUxLTQyZGUtOTBlZi0xMDU0YWQxY2M0Y2UiLCJzaWQiOiIzZDlmNDlhNC1hOWI2LTQ3MmQtOGEyNi0zNDhhZGYxYjU3ZTgifQ.3-zpbxqEtFCFMwpYtkbHu43_kff9ZK_ghBw8H-5SBc8",
  "access_expires_at": "2026-10-29T07:53:47.01896144Z",
  "refresh_token": "rwCzcu5Nri1b3AVuu_ZoYgasBB_shIUInDgAVSIYs1g",
  "refresh_expires_at": "2026-11-28T07:38:47.018367122Z",
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
  "command_id": "63815cb1-9af4-444d-a2a7-e03f07ee48f5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:38:47Z",
    "sequence": 1793259527571
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8bea717d-3715-4a46-8738-ce8862834618",
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
  "last_heartbeat_at": "2026-10-29T07:38:47.590529Z",
  "last_location_at": "2026-10-29T07:38:47.590529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671307803",
  "device_ref": "sandbox-13804"
}
```

```json
{
  "challenge_id": "9c7759ed-96b0-414a-bc5a-ded7ae324008",
  "expires_at": "2026-10-29T07:43:47.868412636Z",
  "resend_available_at": "2026-10-29T07:38:48.868412636Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671307803` → **200**

```json
{
  "phone": "+380671307803",
  "audience": "CLIENT",
  "code": "656882",
  "sent_at": "2026-10-29T07:38:47.871275257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c7759ed-96b0-414a-bc5a-ded7ae324008",
  "code": "656882",
  "device_ref": "sandbox-13804"
}
```

```json
{
  "session_id": "9c9c5791-085e-4e64-8906-d93923c92747",
  "subject": {
    "type": "CLIENT",
    "id": "13da29fd-623e-43e6-8bea-d5cab80f2ddb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxM2RhMjlmZC02MjNlLTQzZTYtOGJlYS1kNWNhYjgwZjJkZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDI4LCJpYXQiOjE3OTMyNTk1MjgsImp0aSI6IjI5ZGVlZWEzLTU2YTItNDY1Yi05MDc3LWE1MjdiNzU1MzkyMiIsInNpZCI6IjljOWM1NzkxLTA4NWUtNGU2NC04OTA2LWQ5MzkyM2M5Mjc0NyJ9.Z84EIa4IsdQmmRd_TWRrvHOfbT-c3Uv7r68qdypSo10",
  "access_expires_at": "2026-10-29T07:53:48.181923603Z",
  "refresh_token": "WR17cGxPeaR1G3rDo4hn6F9QgJKYW66E-Tgz4OU9bhI",
  "refresh_expires_at": "2026-11-28T07:38:48.18141213Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "453f3466-97f7-4c59-b3b9-96b949bf5bec",
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
  "id": "74bf9af9-f434-46a1-b210-87335a926715",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:43:48.472912Z",
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
  "command_id": "7d344ee0-6e4f-4144-b852-81129726d6b1",
  "quote_id": "74bf9af9-f434-46a1-b210-87335a926715",
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
  "id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "13da29fd-623e-43e6-8bea-d5cab80f2ddb",
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
  "created_at": "2026-10-29T07:38:48.761244Z",
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
    "id": "1e3d285e-1c41-4d2d-9d98-8b41c202b968",
    "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
    "expires_at": "2026-10-29T07:39:03.764066Z",
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

`POST /api/driver/v1/offers/1e3d285e-1c41-4d2d-9d98-8b41c202b968/accept` → **200**

```json
{
  "command_id": "b663fd91-1c76-4249-a92e-ce1c3fd0d698"
}
```

```json
{
  "id": "ce03e1c7-6741-405e-aa22-b4f9967323b7",
  "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d65b22cb-14af-424b-9425-608046d28b98",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d65b22cb-14af-424b-9425-608046d28b98",
  "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "assignment_id": "ce03e1c7-6741-405e-aa22-b4f9967323b7",
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

`POST /api/driver/v1/work-sessions/8bea717d-3715-4a46-8738-ce8862834618/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:38:49Z",
    "sequence": 1793259529886
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8bea717d-3715-4a46-8738-ce8862834618",
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
  "last_heartbeat_at": "2026-10-29T07:38:49.904126Z",
  "last_location_at": "2026-10-29T07:38:49.904126Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d65b22cb-14af-424b-9425-608046d28b98",
  "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "assignment_id": "ce03e1c7-6741-405e-aa22-b4f9967323b7",
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

`POST /api/driver/v1/trips/d65b22cb-14af-424b-9425-608046d28b98/arrive` → **200**

```json
{
  "command_id": "364084c4-e1f2-40a2-8dbe-4c4012869489",
  "expected_version": 0
}
```

```json
{
  "id": "d65b22cb-14af-424b-9425-608046d28b98",
  "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "assignment_id": "ce03e1c7-6741-405e-aa22-b4f9967323b7",
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
  "arrived_at": "2026-10-29T07:38:50.445977Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d65b22cb-14af-424b-9425-608046d28b98/start` → **200**

```json
{
  "command_id": "90ed135a-4d02-4c0f-abca-78d5c5d84959",
  "expected_version": 1
}
```

```json
{
  "id": "d65b22cb-14af-424b-9425-608046d28b98",
  "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "assignment_id": "ce03e1c7-6741-405e-aa22-b4f9967323b7",
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
  "arrived_at": "2026-10-29T07:38:50.445977Z",
  "started_at": "2026-10-29T07:38:50.726037Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8bea717d-3715-4a46-8738-ce8862834618/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:38:50Z",
    "sequence": 1793259531166
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8bea717d-3715-4a46-8738-ce8862834618",
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
  "last_heartbeat_at": "2026-10-29T07:38:51.019221Z",
  "last_location_at": "2026-10-29T07:38:51.019221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d65b22cb-14af-424b-9425-608046d28b98/complete` → **200**

```json
{
  "command_id": "e4ef8043-9fb2-4e70-b3c1-e1e3906576c3",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:38:51Z",
  "cash_received": true
}
```

```json
{
  "id": "d65b22cb-14af-424b-9425-608046d28b98",
  "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "assignment_id": "ce03e1c7-6741-405e-aa22-b4f9967323b7",
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
  "arrived_at": "2026-10-29T07:38:50.445977Z",
  "started_at": "2026-10-29T07:38:50.726037Z",
  "completed_at": "2026-10-29T07:38:51.305381Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/6c89895e-39b8-4275-919f-8bba93edcac4/rating` → **200**

```json
{
  "command_id": "4af68260-3389-4ea2-a945-248150388974",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "score": 5,
  "created_at": "2026-10-29T07:38:51.596439492Z"
}
```

`POST /api/driver/v1/orders/6c89895e-39b8-4275-919f-8bba93edcac4/rating` → **200**

```json
{
  "command_id": "261e6828-82cc-4525-8ea4-21f66df80e5c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
  "score": 4,
  "created_at": "2026-10-29T07:38:51.887310573Z"
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
  "session_id": "5f1c0fed-cdd7-41f9-a2d0-a3c87086e8c0",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0MzIsImlhdCI6MTc5MzI1OTUzMiwianRpIjoiNGVjMjMyOTItZmEyNC00YjUzLTg2NDEtZWNmODgxOGZjNTlkIiwic2lkIjoiNWYxYzBmZWQtY2RkNy00MWY5LWEyZDAtYTNjODcwODZlOGMwIn0.Uqb4_fx5iWi9GogGuJCKmkFAVam29uKmvqlzi1l_hg8",
  "access_expires_at": "2026-10-29T07:53:52.736615746Z",
  "refresh_token": "fz7VW35OgzfzSJi3XENmLAVqbJUcNB7AbQmK-gEI3xA",
  "refresh_expires_at": "2026-10-29T19:38:52.73608726Z",
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
  "session_id": "25397881-c97f-4b11-853a-66ae6a205771",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0MzMsImlhdCI6MTc5MzI1OTUzMywianRpIjoiMzMzMDFmOGItNGIyNi00NGI5LTllZjItN2M0YjkzZGM4MDQ0Iiwic2lkIjoiMjUzOTc4ODEtYzk3Zi00YjExLTg1M2EtNjZhZTZhMjA1NzcxIn0.X7t_AJCvAuxUJbqVUuvaWS6KE8yRyEGg8SjCiVvLxD4",
  "access_expires_at": "2026-10-29T07:53:53.299726704Z",
  "refresh_token": "vCm3jzTEgLwAkfvBaWtpGJkzPvc187phzQXDc4lqyBY",
  "refresh_expires_at": "2026-10-29T19:38:53.299078773Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6c89895e-39b8-4275-919f-8bba93edcac4/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
      "author_type": "RIDER",
      "author_id": "13da29fd-623e-43e6-8bea-d5cab80f2ddb",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T07:38:51.596439Z"
    },
    {
      "order_id": "6c89895e-39b8-4275-919f-8bba93edcac4",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "13da29fd-623e-43e6-8bea-d5cab80f2ddb",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T07:38:51.887311Z"
    }
  ]
}
```

Done: ratings for order 6c89895e-39b8-4275-919f-8bba93edcac4.

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
  "session_id": "c6e47255-fa1e-4e7a-85b0-7535c3f3b742",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0MzQsImlhdCI6MTc5MzI1OTUzNCwianRpIjoiOWIyMzZkYjAtMjRlZC00MDdlLTkyMTItNzdkMDFlNjgwMDdjIiwic2lkIjoiYzZlNDcyNTUtZmExZS00ZTdhLTg1YjAtNzUzNWMzZjNiNzQyIn0.OAzOjD2MtqvLldRIAp_rIbrscVKOdRmm_ftI4jpFd0o",
  "access_expires_at": "2026-10-29T07:53:54.154843401Z",
  "refresh_token": "lfc0fxxWouzDoL-xvmWyC-RxGVouRCQDiSVmG_4Cpd4",
  "refresh_expires_at": "2026-10-29T19:38:54.154101464Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "402b3cce-1765-43a5-b681-401b5689437d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "1b28a538-76c7-4a09-b40b-8324dd16c269",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:38:54.437624Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1b28a538-76c7-4a09-b40b-8324dd16c269` → **200**

```json
{
  "id": "1b28a538-76c7-4a09-b40b-8324dd16c269",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:38:54.437624Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1b28a538-76c7-4a09-b40b-8324dd16c269` → **200**

```json
{
  "id": "1b28a538-76c7-4a09-b40b-8324dd16c269",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:38:54.437624Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1b28a538-76c7-4a09-b40b-8324dd16c269` → **200**

```json
{
  "id": "1b28a538-76c7-4a09-b40b-8324dd16c269",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:38:54.437624Z",
  "ready_at": "2026-10-29T07:38:56.70869Z",
  "expires_at": "2026-10-30T07:38:56.70869Z"
}
```

`GET /api/admin/v1/reports/exports/1b28a538-76c7-4a09-b40b-8324dd16c269/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "0b516592-d4c6-40ae-a075-78b8f598bdbe",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "483e5b21-d9de-4fa1-86a1-726472779051",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:38:57.583993Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/483e5b21-d9de-4fa1-86a1-726472779051` → **200**

```json
{
  "id": "483e5b21-d9de-4fa1-86a1-726472779051",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:38:57.583993Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/483e5b21-d9de-4fa1-86a1-726472779051` → **200**

```json
{
  "id": "483e5b21-d9de-4fa1-86a1-726472779051",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:38:57.583993Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/483e5b21-d9de-4fa1-86a1-726472779051` → **200**

```json
{
  "id": "483e5b21-d9de-4fa1-86a1-726472779051",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:38:57.583993Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/483e5b21-d9de-4fa1-86a1-726472779051` → **200**

```json
{
  "id": "483e5b21-d9de-4fa1-86a1-726472779051",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:38:57.583993Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/483e5b21-d9de-4fa1-86a1-726472779051` → **200**

```json
{
  "id": "483e5b21-d9de-4fa1-86a1-726472779051",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:38:57.583993Z",
  "ready_at": "2026-10-29T07:39:01.71657Z",
  "expires_at": "2026-10-30T07:39:01.71657Z"
}
```

`GET /api/admin/v1/reports/exports/483e5b21-d9de-4fa1-86a1-726472779051/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/8bf68608-ffcf-4ccf-bd11-670c47d85f6c` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/8bf68608-ffcf-4ccf-bd11-670c47d85f6c",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "118dcdcf-5a05-4c17-894c-4cf9af6c39b1"
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
  "device_ref": "sandbox-32557"
}
```

```json
{
  "challenge_id": "f56afc3a-60b1-49d3-9754-fb6883e67a38",
  "expires_at": "2026-10-29T07:44:03.58986702Z",
  "resend_available_at": "2026-10-29T07:39:04.58986702Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "996704",
  "sent_at": "2026-10-29T07:39:03.592228051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f56afc3a-60b1-49d3-9754-fb6883e67a38",
  "code": "996704",
  "device_ref": "sandbox-32557"
}
```

```json
{
  "session_id": "58ade33c-1d98-485c-b3e0-9b6f2da5d501",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQ0MywiaWF0IjoxNzkzMjU5NTQzLCJqdGkiOiI5MGU2MzU0NC1lMWMxLTRjMWItODU5Ni0zMTczOWI2MDU3ZGYiLCJzaWQiOiI1OGFkZTMzYy0xZDk4LTQ4NWMtYjNlMC05YjZmMmRhNWQ1MDEifQ.z2kfO5PrrCiN_BvUv8bjG757urxsQp1vaRkGkUd-lm4",
  "access_expires_at": "2026-10-29T07:54:03.895679713Z",
  "refresh_token": "UKGF4csso1jRSwfR4I50v12QDup5dpeRU6eBu7u-gM4",
  "refresh_expires_at": "2026-11-28T07:39:03.895018677Z",
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
  "command_id": "bad289bb-1357-4f54-90ba-0d54a155d163",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:39:04Z",
    "sequence": 1793259544702
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "82ce8b35-5ee7-4ddc-a82e-349ef000fe12",
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
  "last_heartbeat_at": "2026-10-29T07:39:04.721541Z",
  "last_location_at": "2026-10-29T07:39:04.721541Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "a4bca8c2-d0df-43e6-84b5-95e98c5d566c",
  "points": [
    {
      "sequence": 1793259547499,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:38:06Z"
    },
    {
      "sequence": 1793259547500,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:39:07Z"
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
  "session_id": "974230c9-3c97-4490-ab0a-1a3dcebb3842",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0NDcsImlhdCI6MTc5MzI1OTU0NywianRpIjoiOWUwZGI2MjAtNWM3Yy00YTliLWJmNjQtNGY5ZjNiZjgxMDM2Iiwic2lkIjoiOTc0MjMwYzktM2M5Ny00NDkwLWFiMGEtMWEzZGNlYmIzODQyIn0.qaehhDvIoCHJ8kek585uuB2ZRxEfuTB2eF4iXlZZlmc",
  "access_expires_at": "2026-10-29T07:54:07.630414837Z",
  "refresh_token": "6l_LsMwpA7fgKGstnC0NmQ1wRiCvoDRg2eG4DZjMyFc",
  "refresh_expires_at": "2026-10-29T19:39:07.629875662Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "f7764154-bce5-4c66-b0c3-67a85a640ad6",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 61.0,
        "speed_kph": 2362,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T07:39:07Z",
        "track_point_id": "64188453-8c68-46b3-809d-52e1966cc561",
        "work_session_id": "82ce8b35-5ee7-4ddc-a82e-349ef000fe12"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T07:39:07Z",
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

`POST /api/admin/v1/driver-risk-flags/f7764154-bce5-4c66-b0c3-67a85a640ad6/confirm` → **200**

```json
{
  "command_id": "6b539ab5-a027-48b5-922f-750832c08d95",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "f7764154-bce5-4c66-b0c3-67a85a640ad6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 61.0,
    "speed_kph": 2362,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T07:39:07Z",
    "track_point_id": "64188453-8c68-46b3-809d-52e1966cc561",
    "work_session_id": "82ce8b35-5ee7-4ddc-a82e-349ef000fe12"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T07:39:07Z",
  "reason": null,
  "reviewed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reviewed_at": "2026-10-29T07:39:08.522355Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/f7764154-bce5-4c66-b0c3-67a85a640ad6/dismiss` → **409**

```json
{
  "command_id": "1836ab3e-6ce3-49bc-8f7b-52a67b8ef6bf",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/f7764154-bce5-4c66-b0c3-67a85a640ad6/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cb13212b-4268-427a-8854-d2aa66846727"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "918a7778-5e56-4910-aaa2-7f7fe84bf81e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "0abcb845-2853-4e28-b558-880018bfa5ee",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "raised_at": "2026-10-29T07:39:09.085384Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/0abcb845-2853-4e28-b558-880018bfa5ee/dismiss` → **200**

```json
{
  "command_id": "8d3adde3-87d5-47b5-abb5-2e99ddfdd2d0",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "0abcb845-2853-4e28-b558-880018bfa5ee",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "raised_at": "2026-10-29T07:39:09.085384Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reviewed_at": "2026-10-29T07:39:09.378775Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "2fcff979-692f-42f1-a645-a0c3e63dc29d",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "f7764154-bce5-4c66-b0c3-67a85a640ad6"
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
      "actor_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:39:09.671726Z"
    }
  ]
}
```

Done: flag f7764154-bce5-4c66-b0c3-67a85a640ad6 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "9f411d5b-d7e1-4914-bfa4-118998c1c3eb",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0NTAsImlhdCI6MTc5MzI1OTU1MCwianRpIjoiNjBkMDQ2NjctYTg2ZS00NGM4LTlkMzItNjNkYWMwY2E2ZTUxIiwic2lkIjoiOWY0MTFkNWItZDdlMS00OTE0LWJmYTQtMTE4OTk4YzFjM2ViIn0.vX-3I4mCkisZFUnks04Z1DyElDhK2xz23uk4kVVG36s",
  "access_expires_at": "2026-10-29T07:54:10.517837648Z",
  "refresh_token": "CyXYcHXTQmvyHnkJuuisrFpifTwk7kE3FygFumy6KlQ",
  "refresh_expires_at": "2026-10-29T19:39:10.517283354Z",
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
      "actor_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:39:09.671726Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "993d1c75-ebab-4d2f-82bf-5abd0c940f7d",
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
  "session_id": "82ce8b35-5ee7-4ddc-a82e-349ef000fe12",
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
  "last_heartbeat_at": "2026-10-29T07:39:04.721541Z",
  "last_location_at": "2026-10-29T07:39:04.721541Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/82ce8b35-5ee7-4ddc-a82e-349ef000fe12/close` → **200**

```json
{
  "command_id": "730256e6-4a24-482a-a034-923d6b830ae6",
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
  "session_id": "8143c3ae-2f83-44b8-9222-acc9c7be942e",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0NTIsImlhdCI6MTc5MzI1OTU1MiwianRpIjoiNjY4ZDBjOGYtY2FjNC00MTcxLTg5MDktMzQ3ZjNjMmU3ODI3Iiwic2lkIjoiODE0M2MzYWUtMmY4My00NGI4LTkyMjItYWNjOWM3YmU5NDJlIn0.5O-kxvQOj_IkPvW27VPGdByP0BzkeZY5WjKNkaICQp8",
  "access_expires_at": "2026-10-29T07:54:12.241794265Z",
  "refresh_token": "HG-Fahvh5MIQ3VXOuIlRFItFHB5J8LSP_L2PCaK3vKw",
  "refresh_expires_at": "2026-10-29T19:39:12.241235492Z",
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
  "command_id": "19ae4076-48b6-45a5-afb1-bc089e5010eb",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:39:12.808253Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "19ae4076-48b6-45a5-afb1-bc089e5010eb",
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
  "changed_by": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:39:12.808253Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48090470450",
  "device_ref": "sandbox-14769"
}
```

```json
{
  "challenge_id": "e4247a7f-44df-416a-a612-750262478d09",
  "expires_at": "2026-10-29T07:44:13.389226276Z",
  "resend_available_at": "2026-10-29T07:39:14.389226276Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48090470450` → **200**

```json
{
  "phone": "+48090470450",
  "audience": "CLIENT",
  "code": "100508",
  "sent_at": "2026-10-29T07:39:13.391974092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4247a7f-44df-416a-a612-750262478d09",
  "code": "100508",
  "device_ref": "sandbox-14769"
}
```

```json
{
  "session_id": "2138d451-7d1e-4508-8019-e64a8e38b56f",
  "subject": {
    "type": "CLIENT",
    "id": "7231666d-70c5-472c-a967-965ac1a8fc27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjMxNjY2ZC03MGM1LTQ3MmMtYTk2Ny05NjVhYzFhOGZjMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDUzLCJpYXQiOjE3OTMyNTk1NTMsImp0aSI6IjY1NmUyMzJmLTc3OGUtNDYxMi1hNWRlLTg2ZmE1NDBlMjQ5NCIsInNpZCI6IjIxMzhkNDUxLTdkMWUtNDUwOC04MDE5LWU2NGE4ZTM4YjU2ZiJ9.clDxoXIj4ygskEMz4zhhBzaw56-2Pl8bQpXptigFPfE",
  "access_expires_at": "2026-10-29T07:54:13.706016862Z",
  "refresh_token": "dFtEr4nWpfMW7lrqminytzmARqmGXA06HM2PRrHqkhY",
  "refresh_expires_at": "2026-11-28T07:39:13.705542899Z",
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
  "correlation_id": "0200928a-0636-4e4f-98ad-178c487e6134"
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
  "device_ref": "sandbox-20745"
}
```

```json
{
  "challenge_id": "b3e213a9-b061-4427-9f3d-5e4e86989b16",
  "expires_at": "2026-10-29T07:44:14.535224149Z",
  "resend_available_at": "2026-10-29T07:39:15.535224149Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "323073",
  "sent_at": "2026-10-29T07:39:14.537432964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3e213a9-b061-4427-9f3d-5e4e86989b16",
  "code": "323073",
  "device_ref": "sandbox-20745"
}
```

```json
{
  "session_id": "81a281e0-dc95-4373-8b8f-c2edc0f72012",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQ1NCwiaWF0IjoxNzkzMjU5NTU0LCJqdGkiOiJhMzFiNDhjOC0xYTVhLTQwZDktOWQ0My0xYTFjZDRkMWU4YWMiLCJzaWQiOiI4MWEyODFlMC1kYzk1LTQzNzMtOGI4Zi1jMmVkYzBmNzIwMTIifQ.FFCG8yikN7cNCL_ySZ1KGR6nwEq_S1eUKV0aApI8XSk",
  "access_expires_at": "2026-10-29T07:54:14.834223302Z",
  "refresh_token": "nXjTSqZQaRWDT9fss_1jEMAEK5N1xUJpOaj_HqEKDlw",
  "refresh_expires_at": "2026-11-28T07:39:14.833679167Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4ad3a66-8da2-49d2-bdde-4c1fbf4290d2",
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
  "last_heartbeat_at": "2026-10-29T07:38:43.815262Z",
  "last_location_at": "2026-10-29T07:38:43.815262Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f4ad3a66-8da2-49d2-bdde-4c1fbf4290d2/handover` → **200**

```json
{
  "command_id": "5bce63b4-610f-400e-8568-7c32d454ae66",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4ad3a66-8da2-49d2-bdde-4c1fbf4290d2",
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
  "last_heartbeat_at": "2026-10-29T07:38:43.815262Z",
  "last_location_at": "2026-10-29T07:38:43.815262Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f4ad3a66-8da2-49d2-bdde-4c1fbf4290d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:39:15Z",
    "sequence": 1793259555655
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4ad3a66-8da2-49d2-bdde-4c1fbf4290d2",
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
  "last_heartbeat_at": "2026-10-29T07:39:15.673745Z",
  "last_location_at": "2026-10-29T07:39:15.673745Z",
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
  "session_id": "f4ad3a66-8da2-49d2-bdde-4c1fbf4290d2",
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
  "last_heartbeat_at": "2026-10-29T07:39:15.673745Z",
  "last_location_at": "2026-10-29T07:39:15.673745Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f4ad3a66-8da2-49d2-bdde-4c1fbf4290d2/close` → **200**

```json
{
  "command_id": "059e37c7-906a-41ef-b6a7-2f797509377c",
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
  "correlation_id": "d7a504bd-e975-4ec5-83ce-80daaa4514d4"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673776824",
  "device_ref": "sandbox-21008"
}
```

```json
{
  "challenge_id": "454ee362-0207-4028-b6ae-70eac4dad153",
  "expires_at": "2026-10-29T07:44:17.095959696Z",
  "resend_available_at": "2026-10-29T07:39:18.095959696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673776824` → **200**

```json
{
  "phone": "+380673776824",
  "audience": "CLIENT",
  "code": "056857",
  "sent_at": "2026-10-29T07:39:17.0982446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "454ee362-0207-4028-b6ae-70eac4dad153",
  "code": "056857",
  "device_ref": "sandbox-21008"
}
```

```json
{
  "session_id": "4f4271f6-9a7b-4ed4-b607-547785719576",
  "subject": {
    "type": "CLIENT",
    "id": "6a7dac70-17bf-49d6-8437-c64e0399eb60"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTdkYWM3MC0xN2JmLTQ5ZDYtODQzNy1jNjRlMDM5OWViNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDU3LCJpYXQiOjE3OTMyNTk1NTcsImp0aSI6ImMxYTRiYWJjLTgzMjctNDUzOC1iYmFiLTdlMjg0MDk3MzA2MyIsInNpZCI6IjRmNDI3MWY2LTlhN2ItNGVkNC1iNjA3LTU0Nzc4NTcxOTU3NiJ9.7KTreJH6RTGde1A5h3zrIlp1PfPB4xJXjAli0TIH98Q",
  "access_expires_at": "2026-10-29T07:54:17.403024594Z",
  "refresh_token": "7PKps2AeOBSpWRnVmjU9dhFeE2DtkDfb75ic0KP9KR0",
  "refresh_expires_at": "2026-11-28T07:39:17.402553827Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "5b5b480a-2c52-42da-8a05-ac07d6034d57",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "315c541b-e673-4b43-935f-820782b7a8a7",
  "upload_path": "/api/rider/v1/uploads/315c541b-e673-4b43-935f-820782b7a8a7",
  "expires_at": "2026-10-29T07:54:17.692959879Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/315c541b-e673-4b43-935f-820782b7a8a7` → **200**

```json
{
  "file_id": "315c541b-e673-4b43-935f-820782b7a8a7",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "003379d7-082f-4a44-9459-f7a22dbfae6a",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "315c541b-e673-4b43-935f-820782b7a8a7"
  ]
}
```

```json
{
  "id": "f27690f9-83ac-4426-b5b2-68269fbfefe4",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6a7dac70-17bf-49d6-8437-c64e0399eb60",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:39:18.007456Z",
  "updated_at": "2026-10-29T07:39:18.007456Z",
  "respond_by": "2026-10-29T11:39:18.007456Z",
  "messages": [
    {
      "id": "9d74b8d8-64b1-416a-8434-c2fcdfcb8e6c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6a7dac70-17bf-49d6-8437-c64e0399eb60",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:39:18.008631Z",
      "attachments": [
        {
          "file_id": "315c541b-e673-4b43-935f-820782b7a8a7",
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
  "session_id": "52ce239f-5eb9-4dab-9160-a4782533a3ad",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0NTgsImlhdCI6MTc5MzI1OTU1OCwianRpIjoiYmI3YjE2OGQtNjk0Mi00MTM4LWIwY2YtNjA3YzBjNzA2MWJjIiwic2lkIjoiNTJjZTIzOWYtNWViOS00ZGFiLTkxNjAtYTQ3ODI1MzNhM2FkIn0.WsYHeN53lWv5TME-Mjq22gHlgwkbpA-ccrYLkAJEI3U",
  "access_expires_at": "2026-10-29T07:54:18.604607238Z",
  "refresh_token": "m4tQc5uTQ0DC1tNoZVZKuebcLBaPYfj1YCWEsW4S3DA",
  "refresh_expires_at": "2026-10-29T19:39:18.604018349Z",
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
  "session_id": "6f32da48-7c23-4adb-9eae-3ce0a6d00ca7",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0NTksImlhdCI6MTc5MzI1OTU1OSwianRpIjoiMTFlY2ZiNmItNGM2YS00YzgzLWEwMjYtYTg3OTMyODM4MWE5Iiwic2lkIjoiNmYzMmRhNDgtN2MyMy00YWRiLTllYWUtM2NlMGE2ZDAwY2E3In0.JH-NveN3NCKQIVgMXcUeMb4GO9nCJIK6qWDERBoxulk",
  "access_expires_at": "2026-10-29T07:54:19.174440386Z",
  "refresh_token": "B0wUb0Yn0MMyKZGOHD926MgA-TBQZXIkxOeCakzia78",
  "refresh_expires_at": "2026-10-29T19:39:19.173866525Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f27690f9-83ac-4426-b5b2-68269fbfefe4/attachments/315c541b-e673-4b43-935f-820782b7a8a7` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c5aae536-cdd0-4a64-be93-c8b0ae66083e",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "79881dfb-6596-491b-9794-7b5067c86181",
  "upload_path": "/api/operator/v1/uploads/79881dfb-6596-491b-9794-7b5067c86181",
  "expires_at": "2026-10-29T07:54:19.479758077Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/79881dfb-6596-491b-9794-7b5067c86181` → **200**

```json
{
  "file_id": "79881dfb-6596-491b-9794-7b5067c86181",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f27690f9-83ac-4426-b5b2-68269fbfefe4` → **200**

```json
{
  "id": "f27690f9-83ac-4426-b5b2-68269fbfefe4",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6a7dac70-17bf-49d6-8437-c64e0399eb60",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:39:18.007456Z",
  "updated_at": "2026-10-29T07:39:18.007456Z",
  "respond_by": "2026-10-29T11:39:18.007456Z",
  "messages": [
    {
      "id": "9d74b8d8-64b1-416a-8434-c2fcdfcb8e6c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6a7dac70-17bf-49d6-8437-c64e0399eb60",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:39:18.008631Z",
      "attachments": [
        {
          "file_id": "315c541b-e673-4b43-935f-820782b7a8a7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f27690f9-83ac-4426-b5b2-68269fbfefe4/comments` → **200**

```json
{
  "command_id": "d5563d5c-292f-4d44-acb7-db35dbee88cc",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "79881dfb-6596-491b-9794-7b5067c86181"
  ]
}
```

```json
{
  "id": "f27690f9-83ac-4426-b5b2-68269fbfefe4",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6a7dac70-17bf-49d6-8437-c64e0399eb60",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:39:18.007456Z",
  "updated_at": "2026-10-29T07:39:20.094667Z",
  "respond_by": "2026-10-29T11:39:18.007456Z",
  "messages": [
    {
      "id": "9d74b8d8-64b1-416a-8434-c2fcdfcb8e6c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6a7dac70-17bf-49d6-8437-c64e0399eb60",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:39:18.008631Z",
      "attachments": [
        {
          "file_id": "315c541b-e673-4b43-935f-820782b7a8a7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2e238768-1faa-4398-99e3-cb4dbcee86a2",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:39:20.094158Z",
      "attachments": [
        {
          "file_id": "79881dfb-6596-491b-9794-7b5067c86181",
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

`GET /api/rider/v1/support/cases/f27690f9-83ac-4426-b5b2-68269fbfefe4` → **200**

```json
{
  "id": "f27690f9-83ac-4426-b5b2-68269fbfefe4",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "6a7dac70-17bf-49d6-8437-c64e0399eb60",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:39:18.007456Z",
  "updated_at": "2026-10-29T07:39:20.094667Z",
  "respond_by": "2026-10-29T11:39:18.007456Z",
  "messages": [
    {
      "id": "9d74b8d8-64b1-416a-8434-c2fcdfcb8e6c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "6a7dac70-17bf-49d6-8437-c64e0399eb60",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:39:18.008631Z",
      "attachments": [
        {
          "file_id": "315c541b-e673-4b43-935f-820782b7a8a7",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2e238768-1faa-4398-99e3-cb4dbcee86a2",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:39:20.094158Z",
      "attachments": [
        {
          "file_id": "79881dfb-6596-491b-9794-7b5067c86181",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f27690f9-83ac-4426-b5b2-68269fbfefe4/attachments/79881dfb-6596-491b-9794-7b5067c86181` → **200**

Done: support case f27690f9-83ac-4426-b5b2-68269fbfefe4, rider attachment 315c541b-e673-4b43-935f-820782b7a8a7, operator attachment 79881dfb-6596-491b-9794-7b5067c86181.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734788480",
  "device_ref": "sandbox-17840"
}
```

```json
{
  "challenge_id": "cbeba767-ec94-485f-bfa8-ec1681fd9ae8",
  "expires_at": "2026-10-29T07:44:20.70115637Z",
  "resend_available_at": "2026-10-29T07:39:21.70115637Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734788480` → **200**

```json
{
  "phone": "+380734788480",
  "audience": "CLIENT",
  "code": "113264",
  "sent_at": "2026-10-29T07:39:20.703780187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbeba767-ec94-485f-bfa8-ec1681fd9ae8",
  "code": "113264",
  "device_ref": "sandbox-17840"
}
```

```json
{
  "session_id": "4ffa52e9-f9bc-4f6c-8c9c-8689604e9a87",
  "subject": {
    "type": "CLIENT",
    "id": "4395e777-af65-4d03-b57b-3bc67a854e87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Mzk1ZTc3Ny1hZjY1LTRkMDMtYjU3Yi0zYmM2N2E4NTRlODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDYxLCJpYXQiOjE3OTMyNTk1NjEsImp0aSI6ImZlYzQ0ODc2LWY4M2MtNGZmMy1iZTE4LWI3YmY3YWQ0MDU0YyIsInNpZCI6IjRmZmE1MmU5LWY5YmMtNGY2Yy04YzljLTg2ODk2MDRlOWE4NyJ9.qbrPJmgODJK_LSA20oNknFQf7ssRxnvU_za4MKfZlwo",
  "access_expires_at": "2026-10-29T07:54:21.010805869Z",
  "refresh_token": "qoGfi-xX_Y18cxT_dGAgmoaELn2qN0OtgAPkWtvjirQ",
  "refresh_expires_at": "2026-11-28T07:39:21.010101262Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "907badf2-916f-487e-87de-d1d3c5bfd74c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c315a4f6-6014-495e-b781-71aa586edb6c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c315a4f6-6014-495e-b781-71aa586edb6c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "feb98e23842c7fb5ab3c1d670d5dfb83",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c315a4f6-6014-495e-b781-71aa586edb6c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734788480"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c315a4f6-6014-495e-b781-71aa586edb6c",
  "expires_at": "2026-10-29T08:09:21.289907Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/c315a4f6-6014-495e-b781-71aa586edb6c` → **200**

```json
{
  "id": "c315a4f6-6014-495e-b781-71aa586edb6c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:09:21.289907Z",
  "card": {
    "id": "d3edb98b-5a07-4de1-81c4-77bb5229ce95",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5653",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:39:21.574041Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11f7498f-a3c2-441b-8899-70960550cffe",
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
  "id": "ea09a6ee-307f-49ee-b650-d9d7873ea156",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:44:21.900905Z",
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
  "command_id": "8e872551-8c5d-4714-8b98-033702e31fca",
  "quote_id": "ea09a6ee-307f-49ee-b650-d9d7873ea156",
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
  "id": "3493a165-57c0-4a44-83cf-20ada9cdd85b",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4395e777-af65-4d03-b57b-3bc67a854e87",
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
  "created_at": "2026-10-29T07:39:22.206698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3493a165-57c0-4a44-83cf-20ada9cdd85b` → **200**

```json
{
  "id": "3493a165-57c0-4a44-83cf-20ada9cdd85b",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4395e777-af65-4d03-b57b-3bc67a854e87",
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
  "created_at": "2026-10-29T07:39:22.206698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3493a165-57c0-4a44-83cf-20ada9cdd85b` → **200**

```json
{
  "id": "3493a165-57c0-4a44-83cf-20ada9cdd85b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4395e777-af65-4d03-b57b-3bc67a854e87",
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
  "created_at": "2026-10-29T07:39:22.206698Z",
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

`GET /api/rider/v1/orders/3493a165-57c0-4a44-83cf-20ada9cdd85b` → **200**

```json
{
  "id": "3493a165-57c0-4a44-83cf-20ada9cdd85b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4395e777-af65-4d03-b57b-3bc67a854e87",
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
  "created_at": "2026-10-29T07:39:22.206698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3493a165-57c0-4a44-83cf-20ada9cdd85b/switch-to-cash` → **200**

```json
{
  "command_id": "fd80dd61-b6de-416f-9cc3-49bffe4783d7",
  "expected_version": 3
}
```

```json
{
  "id": "3493a165-57c0-4a44-83cf-20ada9cdd85b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4395e777-af65-4d03-b57b-3bc67a854e87",
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
  "created_at": "2026-10-29T07:39:22.206698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3493a165-57c0-4a44-83cf-20ada9cdd85b/switch-to-cash` → **409**

```json
{
  "command_id": "a7a25c32-873f-4958-b6cb-f7d0e5640c24",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/3493a165-57c0-4a44-83cf-20ada9cdd85b/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "33064d40-d91f-4cde-a087-6495ae4d6411"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/3493a165-57c0-4a44-83cf-20ada9cdd85b` → **200**

```json
{
  "id": "3493a165-57c0-4a44-83cf-20ada9cdd85b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "4395e777-af65-4d03-b57b-3bc67a854e87",
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
  "created_at": "2026-10-29T07:39:22.206698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3493a165-57c0-4a44-83cf-20ada9cdd85b/cancel` → **200**

```json
{
  "command_id": "2c754781-79b6-4f68-9148-6abe9b78511f",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3493a165-57c0-4a44-83cf-20ada9cdd85b",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4395e777-af65-4d03-b57b-3bc67a854e87",
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
  "created_at": "2026-10-29T07:39:22.206698Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
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
  "session_id": "5e613d9d-35ab-46a5-9b09-620a785a7bda",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0NjUsImlhdCI6MTc5MzI1OTU2NSwianRpIjoiZWFmMWY3N2UtNTkwMC00ZDkwLWIzZmQtNmRkZTQxNDY2YWYxIiwic2lkIjoiNWU2MTNkOWQtMzVhYi00NmE1LTliMDktNjIwYTc4NWE3YmRhIn0.3ZyhDGLyLvsWx3-OeI9lz1xi3wVbeLnyxL6Ci-NapWc",
  "access_expires_at": "2026-10-29T07:54:25.851642172Z",
  "refresh_token": "WOnEbSVXDTCaeK0RjDhRM55cs8j4z45YPYn1f4L0xW0",
  "refresh_expires_at": "2026-10-29T19:39:25.851066348Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-22645"
}
```

```json
{
  "challenge_id": "7c1b6ab7-7b44-4dec-836e-1250ef72e298",
  "expires_at": "2026-10-29T07:44:26.146746846Z",
  "resend_available_at": "2026-10-29T07:39:27.146746846Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "393577",
  "sent_at": "2026-10-29T07:39:26.14913988Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c1b6ab7-7b44-4dec-836e-1250ef72e298",
  "code": "393577",
  "device_ref": "sandbox-22645"
}
```

```json
{
  "session_id": "676a875a-3966-491c-9477-b9ba2fb54cad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQ2NiwiaWF0IjoxNzkzMjU5NTY2LCJqdGkiOiJjZDRjMDZiOS1mMGEyLTQ1MTEtYTUwMy00MTc4OTlmZDlmYWUiLCJzaWQiOiI2NzZhODc1YS0zOTY2LTQ5MWMtOTQ3Ny1iOWJhMmZiNTRjYWQifQ.SPIEbgFu1OvEjh2iLagQoHz6uYewFzGUFWYz3XqGgPw",
  "access_expires_at": "2026-10-29T07:54:26.477494871Z",
  "refresh_token": "TfQlylgGKNr8RnC2c36-_NV1Jl4hOd_6znNK9pFagb4",
  "refresh_expires_at": "2026-11-28T07:39:26.476850607Z",
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
      "actor_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:39:09.671726Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T07:39:11.079518Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "c7975b81-8ba9-4d7e-8189-49f16ccd48c3",
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
  "device_ref": "sandbox-24667"
}
```

```json
{
  "challenge_id": "67becebd-7640-4114-835a-4a58033aae09",
  "expires_at": "2026-10-29T07:44:27.715557125Z",
  "resend_available_at": "2026-10-29T07:39:28.715557125Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "056110",
  "sent_at": "2026-10-29T07:39:27.717766312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67becebd-7640-4114-835a-4a58033aae09",
  "code": "056110",
  "device_ref": "sandbox-24667"
}
```

```json
{
  "session_id": "d7a06cba-9c5e-4c63-8597-1027287adb9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQ2OCwiaWF0IjoxNzkzMjU5NTY4LCJqdGkiOiI0MmM0ZDUzYS05ZmQwLTQxZWQtOThmZC1hODg5ZjQxMTMzOGIiLCJzaWQiOiJkN2EwNmNiYS05YzVlLTRjNjMtODU5Ny0xMDI3Mjg3YWRiOWEifQ.55dp0RTK8us_Nr6lTj-BIc72cQtp_zz0ehnNCy2A4HA",
  "access_expires_at": "2026-10-29T07:54:28.034676292Z",
  "refresh_token": "d-Dc7w4IbILQc0kcOOPCcTFDmnbTQTvAj43wOF7ri5s",
  "refresh_expires_at": "2026-11-28T07:39:28.034129422Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8bea717d-3715-4a46-8738-ce8862834618",
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
  "last_heartbeat_at": "2026-10-29T07:38:51.019221Z",
  "last_location_at": "2026-10-29T07:38:51.019221Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8bea717d-3715-4a46-8738-ce8862834618/handover` → **200**

```json
{
  "command_id": "af9387a0-e7a2-4de6-a5a3-30a797b09bcf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8bea717d-3715-4a46-8738-ce8862834618",
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
  "last_heartbeat_at": "2026-10-29T07:38:51.019221Z",
  "last_location_at": "2026-10-29T07:38:51.019221Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8bea717d-3715-4a46-8738-ce8862834618/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:39:28Z",
    "sequence": 1793259568879
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8bea717d-3715-4a46-8738-ce8862834618",
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
  "last_heartbeat_at": "2026-10-29T07:39:28.898107Z",
  "last_location_at": "2026-10-29T07:39:28.898107Z",
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
  "command_id": "ac5d9131-2192-4ed0-acf1-e33618be52f0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:39:29Z",
    "sequence": 1793259569446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3cbab210-8525-4e5d-b119-ef0fe6c2af28",
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
  "last_heartbeat_at": "2026-10-29T07:39:29.465934Z",
  "last_location_at": "2026-10-29T07:39:29.465934Z",
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
  "session_id": "19495c81-91ca-41b1-b8d5-5c6bec816f97",
  "subject": {
    "type": "STAFF",
    "id": "14eba4c7-08b7-4877-b1ab-dd99dfae1d44"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGViYTRjNy0wOGI3LTQ4NzctYjFhYi1kZDk5ZGZhZTFkNDQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjA0NzAsImlhdCI6MTc5MzI1OTU3MCwianRpIjoiMGMwNDFkMWEtYmZhNC00ZjJmLWEzNTgtZmVkOGQ0NTQ1MWI3Iiwic2lkIjoiMTk0OTVjODEtOTFjYS00MWIxLWI4ZDUtNWM2YmVjODE2Zjk3In0.DJGyKich2Lr63gLVzkcgRIusav1aWKWnlMZSTNMD53U",
  "access_expires_at": "2026-10-29T07:54:30.039643076Z",
  "refresh_token": "KI_Ab2pY4yximclC3v5xZkYH_9xI42KzlJViyy2Mfwg",
  "refresh_expires_at": "2026-10-29T19:39:30.039071551Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3d02fa5a-ac0a-4f59-8510-5804586d7a91",
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
  "id": "35c7905c-bb70-49d5-80c4-b1223732d16e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:44:30.317684Z",
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
  "command_id": "3b1c989d-863e-4c5a-979b-783ac3543a19",
  "quote_id": "35c7905c-bb70-49d5-80c4-b1223732d16e",
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
  "id": "d9d63556-a893-421e-9707-c9ff3e010076",
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
  "created_at": "2026-10-29T07:39:30.603739Z",
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
    "id": "61b7b17a-d6f7-43e5-9bff-4ded3a7d65a6",
    "order_id": "d9d63556-a893-421e-9707-c9ff3e010076",
    "expires_at": "2026-10-29T07:39:45.607745Z",
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

`POST /api/driver/v1/offers/61b7b17a-d6f7-43e5-9bff-4ded3a7d65a6/accept` → **200**

```json
{
  "command_id": "b87efcbe-8b36-4853-b2f5-103316b72e88"
}
```

```json
{
  "id": "c9b7aa4d-0b78-4562-ad9e-c5df7c9392e8",
  "order_id": "d9d63556-a893-421e-9707-c9ff3e010076",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dcc034a6-1299-49cd-9971-24cbbbfeca9f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dcc034a6-1299-49cd-9971-24cbbbfeca9f",
  "order_id": "d9d63556-a893-421e-9707-c9ff3e010076",
  "assignment_id": "c9b7aa4d-0b78-4562-ad9e-c5df7c9392e8",
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

`POST /api/driver/v1/work-sessions/3cbab210-8525-4e5d-b119-ef0fe6c2af28/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:39:32Z",
    "sequence": 1793259572190
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3cbab210-8525-4e5d-b119-ef0fe6c2af28",
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
  "last_heartbeat_at": "2026-10-29T07:39:32.037475Z",
  "last_location_at": "2026-10-29T07:39:32.037475Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dcc034a6-1299-49cd-9971-24cbbbfeca9f/arrive` → **200**

```json
{
  "command_id": "6033c3a4-00af-4355-9774-95af5b68fe7a",
  "expected_version": 0
}
```

```json
{
  "id": "dcc034a6-1299-49cd-9971-24cbbbfeca9f",
  "order_id": "d9d63556-a893-421e-9707-c9ff3e010076",
  "assignment_id": "c9b7aa4d-0b78-4562-ad9e-c5df7c9392e8",
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
  "arrived_at": "2026-10-29T07:39:32.327181Z",
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

`POST /api/driver/v1/trips/dcc034a6-1299-49cd-9971-24cbbbfeca9f/start` → **200**

```json
{
  "command_id": "3d0fbea4-93c1-43d1-b3b3-9a8d5a73f821",
  "expected_version": 1
}
```

```json
{
  "id": "dcc034a6-1299-49cd-9971-24cbbbfeca9f",
  "order_id": "d9d63556-a893-421e-9707-c9ff3e010076",
  "assignment_id": "c9b7aa4d-0b78-4562-ad9e-c5df7c9392e8",
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
  "arrived_at": "2026-10-29T07:39:32.327181Z",
  "started_at": "2026-10-29T07:39:32.610527Z",
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

`POST /api/driver/v1/trips/dcc034a6-1299-49cd-9971-24cbbbfeca9f/complete` → **200**

```json
{
  "command_id": "06973aaa-a903-4b6d-8180-7dd60c87c2e9",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:39:32Z",
  "cash_received": true
}
```

```json
{
  "id": "dcc034a6-1299-49cd-9971-24cbbbfeca9f",
  "order_id": "d9d63556-a893-421e-9707-c9ff3e010076",
  "assignment_id": "c9b7aa4d-0b78-4562-ad9e-c5df7c9392e8",
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
  "arrived_at": "2026-10-29T07:39:32.327181Z",
  "started_at": "2026-10-29T07:39:32.610527Z",
  "completed_at": "2026-10-29T07:39:32.901266Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d9d63556-a893-421e-9707-c9ff3e010076` → **200**

```json
{
  "id": "d9d63556-a893-421e-9707-c9ff3e010076",
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
    "id": "c9b7aa4d-0b78-4562-ad9e-c5df7c9392e8",
    "order_id": "d9d63556-a893-421e-9707-c9ff3e010076",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dcc034a6-1299-49cd-9971-24cbbbfeca9f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:39:30.603739Z",
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
  "session_id": "8bea717d-3715-4a46-8738-ce8862834618",
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
  "last_heartbeat_at": "2026-10-29T07:39:28.898107Z",
  "last_location_at": "2026-10-29T07:39:28.898107Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8bea717d-3715-4a46-8738-ce8862834618/close` → **200**

```json
{
  "command_id": "078b8138-8dd5-43aa-9871-ddbe5a3636ab",
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
  "session_id": "3cbab210-8525-4e5d-b119-ef0fe6c2af28",
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
  "last_heartbeat_at": "2026-10-29T07:39:32.037475Z",
  "last_location_at": "2026-10-29T07:39:32.037475Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3cbab210-8525-4e5d-b119-ef0fe6c2af28/close` → **200**

```json
{
  "command_id": "f8254a37-9c63-4fe5-84b1-c56601c4b560",
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

Done: terminal order d9d63556-a893-421e-9707-c9ff3e010076 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10292"
}
```

```json
{
  "challenge_id": "482cfd04-13b3-4fbd-8ea1-86827cdc2664",
  "expires_at": "2026-10-29T07:44:37.888570748Z",
  "resend_available_at": "2026-10-29T07:39:38.888570748Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "089646",
  "sent_at": "2026-10-29T07:39:37.89115274Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "482cfd04-13b3-4fbd-8ea1-86827cdc2664",
  "code": "089646",
  "device_ref": "sandbox-10292"
}
```

```json
{
  "session_id": "f5831fa1-9271-4c28-ab1e-8e7aec62f734",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQ3OCwiaWF0IjoxNzkzMjU5NTc4LCJqdGkiOiI2NjY1NGQ0MS00ZTRkLTRkOWQtYjc5My05NjgyNzI3ZTFmZDgiLCJzaWQiOiJmNTgzMWZhMS05MjcxLTRjMjgtYWIxZS04ZTdhZWM2MmY3MzQifQ.U_MAsRIkNla5YvNWS6w_3Q4-UMSpt1pCOH3IxJMyQRY",
  "access_expires_at": "2026-10-29T07:54:38.194658675Z",
  "refresh_token": "srMrYzge0oowPrVODtlSkpAagjdlFsIk4UMGx3Y4FUg",
  "refresh_expires_at": "2026-11-28T07:39:38.19414098Z",
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
  "device_ref": "sandbox-28493"
}
```

```json
{
  "challenge_id": "b6df34ed-6e44-4aec-8c13-2fc2a6d9cde9",
  "expires_at": "2026-10-29T07:44:38.732619274Z",
  "resend_available_at": "2026-10-29T07:39:39.732619274Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "550774",
  "sent_at": "2026-10-29T07:39:38.734861217Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6df34ed-6e44-4aec-8c13-2fc2a6d9cde9",
  "code": "550774",
  "device_ref": "sandbox-28493"
}
```

```json
{
  "session_id": "20407709-6334-4ebd-bf10-c4fa28cf7af3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQ3OSwiaWF0IjoxNzkzMjU5NTc5LCJqdGkiOiI0YmJlNzE1My03ZWE3LTQ3M2QtOTdhNC1kNjYyMjEzMGMxZDAiLCJzaWQiOiIyMDQwNzcwOS02MzM0LTRlYmQtYmYxMC1jNGZhMjhjZjdhZjMifQ.WezJMTOLAi0iS_gVnL58rKXOlZDGD4Fq-ngHWlyw-mQ",
  "access_expires_at": "2026-10-29T07:54:39.034721205Z",
  "refresh_token": "mexP8GH43mAJHNeFphZ1kq7hkKsP7gFXinzPQ0tL94Q",
  "refresh_expires_at": "2026-11-28T07:39:39.034041184Z",
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
  "device_ref": "sandbox-29489"
}
```

```json
{
  "challenge_id": "9efbe980-58d0-4ab5-8480-8a0b963a48ae",
  "expires_at": "2026-10-29T07:44:39.576955618Z",
  "resend_available_at": "2026-10-29T07:39:40.576955618Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "464638",
  "sent_at": "2026-10-29T07:39:39.578980602Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9efbe980-58d0-4ab5-8480-8a0b963a48ae",
  "code": "464638",
  "device_ref": "sandbox-29489"
}
```

```json
{
  "session_id": "47415f9b-d95d-4cb4-9b77-30872cc7b0a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDQ3OSwiaWF0IjoxNzkzMjU5NTc5LCJqdGkiOiI0MmY2ZDU0MC1lMWE4LTQ3YTItODIzZC0zMjkzNjYwZjgxZDEiLCJzaWQiOiI0NzQxNWY5Yi1kOTVkLTRjYjQtOWI3Ny0zMDg3MmNjN2IwYTUifQ.XQhX4aqYXebhkI8j_YkaBN2x4eu3E3aPtVdnerqKyiA",
  "access_expires_at": "2026-10-29T07:54:39.885475713Z",
  "refresh_token": "rE6OEfAurf-xO01UAb7ww-6A4OeS0JAhwZyFHqYRS7U",
  "refresh_expires_at": "2026-11-28T07:39:39.884929395Z",
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
  "phone": "+380698497841",
  "device_ref": "sandbox-12352"
}
```

```json
{
  "challenge_id": "5607e502-ef22-4541-92ef-06b92484eb9d",
  "expires_at": "2026-10-29T07:44:40.421534625Z",
  "resend_available_at": "2026-10-29T07:39:41.421534625Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380698497841` → **200**

```json
{
  "phone": "+380698497841",
  "audience": "CLIENT",
  "code": "051638",
  "sent_at": "2026-10-29T07:39:40.423763975Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5607e502-ef22-4541-92ef-06b92484eb9d",
  "code": "051638",
  "device_ref": "sandbox-12352"
}
```

```json
{
  "session_id": "b60ed961-785e-4410-ba72-889e6aa515ee",
  "subject": {
    "type": "CLIENT",
    "id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzIzYjgxNi0yOGUxLTQwNjUtYmEyYi03Y2U3ZjRkMDVlMjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwNDgwLCJpYXQiOjE3OTMyNTk1ODAsImp0aSI6IjY5YWM2OGE1LWNhZjctNDAzNy1hNWExLTFmODY2ZDJkNTY1ZSIsInNpZCI6ImI2MGVkOTYxLTc4NWUtNDQxMC1iYTcyLTg4OWU2YWE1MTVlZSJ9.QFxWn4wZGpCXFnc5dd2hznWwtzaW2cySuXsND4ge31g",
  "access_expires_at": "2026-10-29T07:54:40.724020319Z",
  "refresh_token": "yPl5PxHeitdC6FZUgTe6VG--AWLMRrL2PczXubrdwoA",
  "refresh_expires_at": "2026-11-28T07:39:40.723508543Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "480cd272-5dc7-46b2-93b0-92d4c6fef305",
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
  "id": "a8dd07a7-1370-49d3-beb1-0387fd187e09",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:44:41.007096Z",
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
  "command_id": "829814b1-bff6-4a1c-a41a-76c8d56ef91a",
  "quote_id": "a8dd07a7-1370-49d3-beb1-0387fd187e09",
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
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:39:41.294692Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.299631075
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.154180432
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

`GET /api/rider/v1/orders/f05a458d-d0d9-4e3d-9480-50dd0b6b67c6` → **200**

```json
{
  "id": "f05a458d-d0d9-4e3d-9480-50dd0b6b67c6",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bc23b816-28e1-4065-ba2b-7ce7f4d05e29",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:39:41.294692Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
