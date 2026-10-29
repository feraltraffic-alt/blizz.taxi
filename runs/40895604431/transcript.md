# Sandbox transcript (2026-10-29T14:52:00Z, 5ee6837)

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
  "correlation_id": "dffe5430-4d42-4b7a-bb72-490c1ae03837"
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
  "session_id": "015b14c6-a14b-4ffb-b425-2d195a1b0fbc",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0MjgsImlhdCI6MTc5MzI4NTUyOCwianRpIjoiY2VhY2E4NmItMzExNS00NDJiLWE1MTgtYjk5MjU3MDQzYjc0Iiwic2lkIjoiMDE1YjE0YzYtYTE0Yi00ZmZiLWI0MjUtMmQxOTVhMWIwZmJjIn0.IPmFLe0D-p-UDVBR-ZX09zLQTbGC0NjOzP3D1dIjLoI",
  "access_expires_at": "2026-10-29T15:07:08.207750847Z",
  "refresh_token": "Ks8lm9jwMEop3u0uBN43QpMzdO4raABd1g_DmAG8_gY",
  "refresh_expires_at": "2026-10-30T02:52:08.2055746Z",
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
  "session_id": "794adba5-9464-4d71-86b5-ebfd251a6de0",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0MzAsImlhdCI6MTc5MzI4NTUzMCwianRpIjoiZGM4OTdmOTItZGE1OC00OWU1LWJmNTAtNDM1NTRmZTgzMmZmIiwic2lkIjoiNzk0YWRiYTUtOTQ2NC00ZDcxLTg2YjUtZWJmZDI1MWE2ZGUwIn0.nN-9LdNNcJHLUv4xlBSXPuIXrH6mkckXM9V8YlSKCqM",
  "access_expires_at": "2026-10-29T15:07:10.074537596Z",
  "refresh_token": "5Sw7PDKyjQyXdd3iiO4PWWx1A0yogmMMtXO7TpFUbVQ",
  "refresh_expires_at": "2026-10-30T02:52:10.073457869Z",
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
  "device_ref": "sandbox-28580"
}
```

```json
{
  "challenge_id": "1f5f74b7-aaf5-4ebc-95c2-1245d3581b38",
  "expires_at": "2026-10-29T14:57:10.704482396Z",
  "resend_available_at": "2026-10-29T14:52:11.704482396Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "398324",
  "sent_at": "2026-10-29T14:52:10.717139119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f5f74b7-aaf5-4ebc-95c2-1245d3581b38",
  "code": "398324",
  "device_ref": "sandbox-28580"
}
```

```json
{
  "session_id": "73f87cb8-bc86-4e8c-94d0-14efc0487c9e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQzMSwiaWF0IjoxNzkzMjg1NTMxLCJqdGkiOiJlZTFhMGMzZi00ZDBmLTQ3MTktYjAwNS0wZTRmNTI4Zjk5NmEiLCJzaWQiOiI3M2Y4N2NiOC1iYzg2LTRlOGMtOTRkMC0xNGVmYzA0ODdjOWUifQ.VtnNipaDv82NDDG8DfaNXCe475s6rwtt0XVCs7bRwi8",
  "access_expires_at": "2026-10-29T15:07:11.074742322Z",
  "refresh_token": "NcmM6Y_wOylm982r_Dskim52SAYTYjdfdhFnN9Kc8hk",
  "refresh_expires_at": "2026-11-28T14:52:11.073584156Z",
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
  "command_id": "69fa19c8-5c7c-4a8e-afd4-e89988bd7d7f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:11Z",
    "sequence": 1793285531658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "27a1ffe4-4a84-4f92-8cad-d5705f0101df",
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
  "last_heartbeat_at": "2026-10-29T14:52:11.762455Z",
  "last_location_at": "2026-10-29T14:52:11.762455Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631089190",
  "device_ref": "sandbox-21218"
}
```

```json
{
  "challenge_id": "9b4b5250-be7f-4331-a753-e3289dfdd3ff",
  "expires_at": "2026-10-29T14:57:12.056665268Z",
  "resend_available_at": "2026-10-29T14:52:13.056665268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631089190` → **200**

```json
{
  "phone": "+380631089190",
  "audience": "CLIENT",
  "code": "506334",
  "sent_at": "2026-10-29T14:52:12.061704386Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b4b5250-be7f-4331-a753-e3289dfdd3ff",
  "code": "506334",
  "device_ref": "sandbox-21218"
}
```

```json
{
  "session_id": "1598a788-67d9-41f0-923f-781a57f19396",
  "subject": {
    "type": "CLIENT",
    "id": "d7c26c28-804c-46bd-9c1f-538264f185cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkN2MyNmMyOC04MDRjLTQ2YmQtOWMxZi01MzgyNjRmMTg1Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NDMyLCJpYXQiOjE3OTMyODU1MzIsImp0aSI6IjFjZDkzMmYzLTM4YzItNDY0MS04NTBhLTA0ZWU4MTVmNTMwYiIsInNpZCI6IjE1OThhNzg4LTY3ZDktNDFmMC05MjNmLTc4MWE1N2YxOTM5NiJ9.48_fTaMPX9qn38QOhdDfL3knSfBSfVWH_-wj2E3eCmY",
  "access_expires_at": "2026-10-29T15:07:12.383700319Z",
  "refresh_token": "IXojP8gQr-HVOTbZzMkDCDX9J980LvVBZ7VUdEgW08M",
  "refresh_expires_at": "2026-11-28T14:52:12.382662339Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c4b3ddc7-bdbc-42b6-832b-9c3e33233b58",
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
  "id": "8d0882dd-1f29-44e6-97db-fecc85a8d36b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:57:12.726994Z",
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
  "command_id": "1f26245a-7763-48e4-96c9-917507aa26fd",
  "quote_id": "8d0882dd-1f29-44e6-97db-fecc85a8d36b",
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
  "id": "9c75bcb6-55ab-482e-b21e-f84f788efb12",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d7c26c28-804c-46bd-9c1f-538264f185cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:52:13.121683Z",
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
    "id": "aa4ef41d-a252-4c1a-a137-b745e96e9592",
    "order_id": "9c75bcb6-55ab-482e-b21e-f84f788efb12",
    "expires_at": "2026-10-29T14:52:28.133214Z",
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

`POST /api/driver/v1/offers/aa4ef41d-a252-4c1a-a137-b745e96e9592/accept` → **200**

```json
{
  "command_id": "69762694-b854-4acd-9ace-a52a4253870d"
}
```

```json
{
  "id": "da007570-1e34-4c12-adb3-aec7f70125cc",
  "order_id": "9c75bcb6-55ab-482e-b21e-f84f788efb12",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f4a978c6-5f2d-47cd-9b54-6799aa533f50",
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
  "command_id": "97b13cad-0c55-4b51-84c6-fb04f2b197ce",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:52:14.405150022Z"
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
  "id": "f4a978c6-5f2d-47cd-9b54-6799aa533f50",
  "order_id": "9c75bcb6-55ab-482e-b21e-f84f788efb12",
  "assignment_id": "da007570-1e34-4c12-adb3-aec7f70125cc",
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

`POST /api/driver/v1/work-sessions/27a1ffe4-4a84-4f92-8cad-d5705f0101df/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:15Z",
    "sequence": 1793285535311
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "27a1ffe4-4a84-4f92-8cad-d5705f0101df",
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
  "last_heartbeat_at": "2026-10-29T14:52:15.338727Z",
  "last_location_at": "2026-10-29T14:52:15.338727Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f4a978c6-5f2d-47cd-9b54-6799aa533f50/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d4e09adf-47bf-41af-bcb5-69a3fcd49a3d",
  "expected_version": 0
}
```

```json
{
  "id": "f4a978c6-5f2d-47cd-9b54-6799aa533f50",
  "order_id": "9c75bcb6-55ab-482e-b21e-f84f788efb12",
  "assignment_id": "da007570-1e34-4c12-adb3-aec7f70125cc",
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
  "arrived_at": "2026-10-29T14:52:15.649312Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f4a978c6-5f2d-47cd-9b54-6799aa533f50/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9b53914c-4fcf-4c44-8289-7c7709ae5e7f",
  "expected_version": 1
}
```

```json
{
  "id": "f4a978c6-5f2d-47cd-9b54-6799aa533f50",
  "order_id": "9c75bcb6-55ab-482e-b21e-f84f788efb12",
  "assignment_id": "da007570-1e34-4c12-adb3-aec7f70125cc",
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
  "arrived_at": "2026-10-29T14:52:15.649312Z",
  "started_at": "2026-10-29T14:52:15.962991Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f4a978c6-5f2d-47cd-9b54-6799aa533f50/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f389da5a-0720-4a44-87e0-87deb00366d4",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:52:16Z",
  "cash_received": true
}
```

```json
{
  "id": "f4a978c6-5f2d-47cd-9b54-6799aa533f50",
  "order_id": "9c75bcb6-55ab-482e-b21e-f84f788efb12",
  "assignment_id": "da007570-1e34-4c12-adb3-aec7f70125cc",
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
  "arrived_at": "2026-10-29T14:52:15.649312Z",
  "started_at": "2026-10-29T14:52:15.962991Z",
  "completed_at": "2026-10-29T14:52:16.271226Z",
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
  "session_id": "27a1ffe4-4a84-4f92-8cad-d5705f0101df",
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
  "last_heartbeat_at": "2026-10-29T14:52:15.338727Z",
  "last_location_at": "2026-10-29T14:52:15.338727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/27a1ffe4-4a84-4f92-8cad-d5705f0101df/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5072566e-a9f6-4a15-9cde-605f091dc9bb",
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
  "command_id": "882f602f-5b4e-4e72-bd27-e5d01e8feadc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:17Z",
    "sequence": 1793285537219
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
  "correlation_id": "d1354199-fb73-48ae-a4fd-198f7589e5cf",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "40786d29-86ce-4e88-b57b-62187e9753c4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:17Z",
    "sequence": 1793285537537
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a8276c23-7c82-42a6-8638-ebf7da865a3a",
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
  "last_heartbeat_at": "2026-10-29T14:52:17.561064Z",
  "last_location_at": "2026-10-29T14:52:17.561064Z",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:52:14.40515Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "90f29bc7-faec-456e-9353-8ab0150c30db",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:52:18.201063796Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a8276c23-7c82-42a6-8638-ebf7da865a3a",
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
  "last_heartbeat_at": "2026-10-29T14:52:17.561064Z",
  "last_location_at": "2026-10-29T14:52:17.561064Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8276c23-7c82-42a6-8638-ebf7da865a3a/close` → **200**

```json
{
  "command_id": "dc7d5374-6a3d-49c1-8d5f-5756dd0f8e6d",
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
  "session_id": "20a3d438-cfda-40db-aa21-54f414dc27b6",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0MzksImlhdCI6MTc5MzI4NTUzOSwianRpIjoiZDU0N2JlZDktODViNC00YTAyLWFjNmUtMWNjOThhMjlhMjIzIiwic2lkIjoiMjBhM2Q0MzgtY2ZkYS00MGRiLWFhMjEtNTRmNDE0ZGMyN2I2In0.7gpH46wKbECNJ6sZ6-pYrN8brztZNQo-ZBgT2q0iDK8",
  "access_expires_at": "2026-10-29T15:07:19.436999693Z",
  "refresh_token": "nZMHBdQr_5IM98ALqsUCNnfZ2IWKOQaEL1gwEjYY8DY",
  "refresh_expires_at": "2026-10-30T02:52:19.436117424Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "1ac2f84b-654d-4632-a382-fa1117549fe2",
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
  "id": "08b00b43-3e9b-443b-914c-354f147e8343",
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
  "created_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "created_at": "2026-10-29T14:52:19.743372Z",
  "updated_at": "2026-10-29T14:52:19.743372Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637990105",
  "device_ref": "sandbox-26969"
}
```

```json
{
  "challenge_id": "2480c11a-3fad-472a-8b1e-57a490d38a2e",
  "expires_at": "2026-10-29T14:57:20.045531324Z",
  "resend_available_at": "2026-10-29T14:52:21.045531324Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637990105` → **200**

```json
{
  "phone": "+380637990105",
  "audience": "CLIENT",
  "code": "747896",
  "sent_at": "2026-10-29T14:52:20.050048777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2480c11a-3fad-472a-8b1e-57a490d38a2e",
  "code": "747896",
  "device_ref": "sandbox-26969"
}
```

```json
{
  "session_id": "bf2c1b8b-1b6e-4469-8aee-28e34e3e7ef4",
  "subject": {
    "type": "CLIENT",
    "id": "c2afbde8-d9b7-4fd3-ba80-daca6767f1ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMmFmYmRlOC1kOWI3LTRmZDMtYmE4MC1kYWNhNjc2N2YxZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NDQwLCJpYXQiOjE3OTMyODU1NDAsImp0aSI6IjNkOWM5MzJiLThjNmYtNGY2ZC05ZDAwLWZkYjk4MzUxMGE0MSIsInNpZCI6ImJmMmMxYjhiLTFiNmUtNDQ2OS04YWVlLTI4ZTM0ZTNlN2VmNCJ9.YOdquGhnpjAlVS-f8BdZcR89frbYzvapZV8ubosS7EA",
  "access_expires_at": "2026-10-29T15:07:20.365480709Z",
  "refresh_token": "eBAYcYEEV225ExLaP1axoTKNG-RhSPpOKFZ06V1kLjs",
  "refresh_expires_at": "2026-11-28T14:52:20.364727962Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637990105` → **200**

```json
{
  "client_id": "c2afbde8-d9b7-4fd3-ba80-daca6767f1ee"
}
```

`POST /api/admin/v1/rider-wallets/c2afbde8-d9b7-4fd3-ba80-daca6767f1ee/top-ups` → **201**

```json
{
  "command_id": "1931de65-5df9-49c9-a1fc-4e0f4b7ecc51",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "c2afbde8-d9b7-4fd3-ba80-daca6767f1ee",
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
      "id": "e34cc4db-308d-4df1-9bc1-05843c44d616",
      "at": "2026-10-29T14:52:20.933023Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d9ec76b9-ea0f-4fef-8faa-ecf652afb7e8",
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
  "id": "bfe25feb-a2a5-49df-8d93-f12140dad12a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:57:21.244502Z",
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
      "id": "08b00b43-3e9b-443b-914c-354f147e8343",
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
  "device_ref": "sandbox-23519"
}
```

```json
{
  "challenge_id": "5170937e-2e01-49b9-9d56-580391a70923",
  "expires_at": "2026-10-29T14:57:21.53066197Z",
  "resend_available_at": "2026-10-29T14:52:22.53066197Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "019650",
  "sent_at": "2026-10-29T14:52:21.534972596Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5170937e-2e01-49b9-9d56-580391a70923",
  "code": "019650",
  "device_ref": "sandbox-23519"
}
```

```json
{
  "session_id": "5a056ce5-231b-4dff-b1b2-1d95697af185",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ0MSwiaWF0IjoxNzkzMjg1NTQxLCJqdGkiOiI4ZWI0OTM0ZS01YTc4LTQyYTMtYWQwZS05ZjI3MzlmNTljZWUiLCJzaWQiOiI1YTA1NmNlNS0yMzFiLTRkZmYtYjFiMi0xZDk1Njk3YWYxODUifQ.lLUd9z3pI7IM1UKdKlJDXWzxL8PRGmsYIW4S7ubn38Y",
  "access_expires_at": "2026-10-29T15:07:21.851366756Z",
  "refresh_token": "g3E82hjMWH1jtA9FDqXelOSJwyIm-7fuRSz1V05rFWA",
  "refresh_expires_at": "2026-11-28T14:52:21.850692536Z",
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
  "command_id": "5383b672-448b-413c-a260-31ceb6f85e16",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:22Z",
    "sequence": 1793285542425
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "836d2841-0fb9-4979-be9a-8afbb760a09c",
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
  "last_heartbeat_at": "2026-10-29T14:52:22.449171Z",
  "last_location_at": "2026-10-29T14:52:22.449171Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b9da8ad3-dc46-49ae-99b7-248c87353429",
  "quote_id": "bfe25feb-a2a5-49df-8d93-f12140dad12a",
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
  "id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c2afbde8-d9b7-4fd3-ba80-daca6767f1ee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:52:22.774869Z",
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
  "client_id": "c2afbde8-d9b7-4fd3-ba80-daca6767f1ee",
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
      "id": "e34cc4db-308d-4df1-9bc1-05843c44d616",
      "at": "2026-10-29T14:52:20.933023Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
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
    "id": "8d0dfbec-eefb-4568-8d17-d4c15ace6a8c",
    "order_id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31",
    "expires_at": "2026-10-29T14:52:37.78357Z",
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

`POST /api/driver/v1/offers/8d0dfbec-eefb-4568-8d17-d4c15ace6a8c/accept` → **200**

```json
{
  "command_id": "ed83906f-a637-4cb8-938d-265742a443d0"
}
```

```json
{
  "id": "1152d8f9-6644-43c9-a5c8-ef13e2a5be26",
  "order_id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2e4b0025-8601-4a41-a05f-b1663464d81f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2e4b0025-8601-4a41-a05f-b1663464d81f",
  "order_id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31",
  "assignment_id": "1152d8f9-6644-43c9-a5c8-ef13e2a5be26",
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

`POST /api/driver/v1/work-sessions/836d2841-0fb9-4979-be9a-8afbb760a09c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:24Z",
    "sequence": 1793285544272
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "836d2841-0fb9-4979-be9a-8afbb760a09c",
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
  "last_heartbeat_at": "2026-10-29T14:52:24.294966Z",
  "last_location_at": "2026-10-29T14:52:24.294966Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2e4b0025-8601-4a41-a05f-b1663464d81f/arrive` → **200**

```json
{
  "command_id": "8dc2bd34-3aa1-4eeb-b67c-c45ee70fb937",
  "expected_version": 0
}
```

```json
{
  "id": "2e4b0025-8601-4a41-a05f-b1663464d81f",
  "order_id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31",
  "assignment_id": "1152d8f9-6644-43c9-a5c8-ef13e2a5be26",
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
  "arrived_at": "2026-10-29T14:52:24.60259Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2e4b0025-8601-4a41-a05f-b1663464d81f/start` → **200**

```json
{
  "command_id": "8a0d24ce-c234-48cf-b5e2-b0f6e0f653c3",
  "expected_version": 1
}
```

```json
{
  "id": "2e4b0025-8601-4a41-a05f-b1663464d81f",
  "order_id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31",
  "assignment_id": "1152d8f9-6644-43c9-a5c8-ef13e2a5be26",
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
  "arrived_at": "2026-10-29T14:52:24.60259Z",
  "started_at": "2026-10-29T14:52:24.924892Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/2e4b0025-8601-4a41-a05f-b1663464d81f/complete` → **200**

```json
{
  "command_id": "402caf1f-44df-4faa-9cff-e21602ba8a8e",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:52:25Z",
  "cash_received": true
}
```

```json
{
  "id": "2e4b0025-8601-4a41-a05f-b1663464d81f",
  "order_id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31",
  "assignment_id": "1152d8f9-6644-43c9-a5c8-ef13e2a5be26",
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
  "arrived_at": "2026-10-29T14:52:24.60259Z",
  "started_at": "2026-10-29T14:52:24.924892Z",
  "completed_at": "2026-10-29T14:52:25.252724Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c2afbde8-d9b7-4fd3-ba80-daca6767f1ee",
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
      "id": "6620a5e1-c21b-426a-aef8-f46500f962ab",
      "at": "2026-10-29T14:52:25.982994Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31"
    },
    {
      "id": "e34cc4db-308d-4df1-9bc1-05843c44d616",
      "at": "2026-10-29T14:52:20.933023Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/08b00b43-3e9b-443b-914c-354f147e8343/archive` → **200**

```json
{
  "command_id": "fc03d459-2325-4798-bf96-f2699a2c6edc",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "08b00b43-3e9b-443b-914c-354f147e8343",
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
  "created_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "created_at": "2026-10-29T14:52:19.743372Z",
  "updated_at": "2026-10-29T14:52:28.881776Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "836d2841-0fb9-4979-be9a-8afbb760a09c",
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
  "last_heartbeat_at": "2026-10-29T14:52:24.294966Z",
  "last_location_at": "2026-10-29T14:52:24.294966Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/836d2841-0fb9-4979-be9a-8afbb760a09c/close` → **200**

```json
{
  "command_id": "55ab873c-d363-4c71-9344-37c116629044",
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

Done: order 32dcdd8e-9f97-4b38-9869-264b9e62ab31.

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
  "session_id": "0424653f-91de-46f1-944e-df1f7ddb7132",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NTAsImlhdCI6MTc5MzI4NTU1MCwianRpIjoiNjUwYTE0NTAtYjY3MC00MGQ2LWExMTktNGM2NDNhZmRmMjEyIiwic2lkIjoiMDQyNDY1M2YtOTFkZS00NmYxLTk0NGUtZGYxZjdkZGI3MTMyIn0.30uWGxTDXYYAVijqFx0TWKqGGbuizGjRbvmXPT8RVsQ",
  "access_expires_at": "2026-10-29T15:07:30.144137135Z",
  "refresh_token": "Bng_BaBTL0trJt8WEthZn-irGE_hrSHLqqKMktGUGsE",
  "refresh_expires_at": "2026-10-30T02:52:30.143439208Z",
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
  "command_id": "3d0b7e14-2e66-40ac-a2a8-6427c085307c",
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
  "session_id": "87f35a75-e32b-4ec6-b948-075520d6d299",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NTEsImlhdCI6MTc5MzI4NTU1MSwianRpIjoiZTI3ZjkyMmQtZDE5Ni00YTg5LWJhMWEtOGYxNGMwN2YxMDQ0Iiwic2lkIjoiODdmMzVhNzUtZTMyYi00ZWM2LWI5NDgtMDc1NTIwZDZkMjk5In0.IqCtY4MzBsm1wkZ8ma0gT1glbMsWK7gMdYK5BT-nA7A",
  "access_expires_at": "2026-10-29T15:07:31.3432602Z",
  "refresh_token": "HYAMTx93imlekdzAbkylkVlbO1xJZtmCA7u3HFkcWlM",
  "refresh_expires_at": "2026-10-30T02:52:31.342562574Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3200926782",
    "linkedid": "1730052700.3200926782",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675295826"
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
    "id": "1730052700.3200926782",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "f931cc60-374c-4d9c-9082-40ab2915e3eb",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:52:31.629497Z",
      "answered_at": null,
      "ended_at": "2026-10-29T14:52:31.656771Z",
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
    "id": "1730052600.1404014634",
    "linkedid": "1730052600.1404014634",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675295826"
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
      "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:52:32.002073Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/306a7ca9-5c88-43e4-a8bc-6166a7256858/answer` → **200**

```json
{
  "command_id": "c07ed7ab-e7cf-447e-86b7-f31731cb1582"
}
```

```json
{
  "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675295826",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "order_ids": [],
  "started_at": "2026-10-29T14:52:32.002073Z",
  "answered_at": "2026-10-29T14:52:32.36643Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1404014634",
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
    "id": "1730052600.1404014634",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:32.002073Z",
      "answered_at": "2026-10-29T14:52:32.36643Z",
      "ended_at": "2026-10-29T14:52:32.694387Z",
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
      "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:32.002073Z",
      "answered_at": "2026-10-29T14:52:32.36643Z",
      "ended_at": "2026-10-29T14:52:32.694387Z",
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
      "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:32.002073Z",
      "answered_at": "2026-10-29T14:52:32.36643Z",
      "ended_at": "2026-10-29T14:52:32.694387Z",
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
      "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:32.002073Z",
      "answered_at": "2026-10-29T14:52:32.36643Z",
      "ended_at": "2026-10-29T14:52:32.694387Z",
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
      "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:32.002073Z",
      "answered_at": "2026-10-29T14:52:32.36643Z",
      "ended_at": "2026-10-29T14:52:32.694387Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:52:39.710318Z"
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
      "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:32.002073Z",
      "answered_at": "2026-10-29T14:52:32.36643Z",
      "ended_at": "2026-10-29T14:52:32.694387Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:52:39.710318Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/306a7ca9-5c88-43e4-a8bc-6166a7256858/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/306a7ca9-5c88-43e4-a8bc-6166a7256858/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=306a7ca9-5c88-43e4-a8bc-6166a7256858` → **200**

```json
{
  "changes": [
    {
      "id": "7f38c11d-681a-4455-8669-ec7f806f7f9a",
      "occurred_at": "2026-10-29T14:52:42.559343Z",
      "actor_type": "STAFF",
      "actor_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"5b003623-115a-4663-880c-8a1c2987c4f3\", \"order_ids\": []}",
      "correlation_id": "14c168df-e3e0-41f7-98fb-36c14f043e33"
    },
    {
      "id": "32e2ce63-2bc6-43dd-a50e-8641a7e73044",
      "occurred_at": "2026-10-29T14:52:42.525072Z",
      "actor_type": "STAFF",
      "actor_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"5b003623-115a-4663-880c-8a1c2987c4f3\", \"order_ids\": []}",
      "correlation_id": "51f0f868-b3fd-465a-b5ce-d35cb4664a5e"
    }
  ]
}
```

Done: call 306a7ca9-5c88-43e4-a8bc-6166a7256858 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25755"
}
```

```json
{
  "challenge_id": "bc618d95-0abb-44b1-89d7-cd0f9bb4cbaa",
  "expires_at": "2026-10-29T14:57:42.895948254Z",
  "resend_available_at": "2026-10-29T14:52:43.895948254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "266813",
  "sent_at": "2026-10-29T14:52:42.900198969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc618d95-0abb-44b1-89d7-cd0f9bb4cbaa",
  "code": "266813",
  "device_ref": "sandbox-25755"
}
```

```json
{
  "session_id": "665128b7-5f5d-424a-bbaf-a08ecd577bff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ2MywiaWF0IjoxNzkzMjg1NTYzLCJqdGkiOiJlYmVjZTczMi0zNTgwLTQxNjktOWQ0NS0zM2NiZDEzYzE5ZGEiLCJzaWQiOiI2NjUxMjhiNy01ZjVkLTQyNGEtYmJhZi1hMDhlY2Q1NzdiZmYifQ.eYog3cp3IfX-AIpw-cJHYkYffqzLrwTnma4eRPw1wgI",
  "access_expires_at": "2026-10-29T15:07:43.218343491Z",
  "refresh_token": "f5U3yMDgAnn6eHiRLJ8bDngK6xJ5qoaTO0yX1MEJIJk",
  "refresh_expires_at": "2026-11-28T14:52:43.217654443Z",
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
  "command_id": "75ac22db-331a-4a50-a88a-762d833ee51e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:43Z",
    "sequence": 1793285563803
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "987e71b8-2126-4584-bf61-5c2852ff922f",
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
  "last_heartbeat_at": "2026-10-29T14:52:43.825018Z",
  "last_location_at": "2026-10-29T14:52:43.825018Z",
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
  "session_id": "2c722eca-a119-40ba-94b1-4628c70eac70",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NjQsImlhdCI6MTc5MzI4NTU2NCwianRpIjoiYTUzOGJmZDUtMGU1NS00NTBlLTkyMzAtNTAwZTZlMjc1NzNlIiwic2lkIjoiMmM3MjJlY2EtYTExOS00MGJhLTk0YjEtNDYyOGM3MGVhYzcwIn0.ivF9vr_OWwAE_AQJeu5HNFWAFK_DC4IjGOFzaeBDA1M",
  "access_expires_at": "2026-10-29T15:07:44.424282152Z",
  "refresh_token": "5bnH3rHgly9nQUDCNpENU3pE85WTuK0DLXvOAWRD92A",
  "refresh_expires_at": "2026-10-30T02:52:44.42357491Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ae07de72-03a4-43d9-83d8-fefef5ae1dee",
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
  "id": "fa97f89e-ca91-4921-855f-802202986b7f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:57:44.725389Z",
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
  "command_id": "d4c644cc-0298-48d7-b531-105ec5142494",
  "quote_id": "fa97f89e-ca91-4921-855f-802202986b7f",
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
    "phone": "+380671769716"
  }
}
```

```json
{
  "id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
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
  "created_at": "2026-10-29T14:52:45.063413Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671769716"
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
    "id": "d2271a3d-886d-40cb-90bd-029bf4a30e5b",
    "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
    "expires_at": "2026-10-29T14:53:00.06936Z",
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

`POST /api/driver/v1/offers/d2271a3d-886d-40cb-90bd-029bf4a30e5b/accept` → **200**

```json
{
  "command_id": "86ab5c00-5a46-4ef2-bbff-f8dd9a5a20d3"
}
```

```json
{
  "id": "6aed211c-d671-41a9-bb93-e63d2c3d4f5e",
  "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "baf913f5-25c9-4985-b443-14e85f49d23c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671769716` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671769716` → **200**

```json
[
  {
    "phone": "+380671769716",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:46.881911933Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671769716` → **200**

```json
[
  {
    "phone": "+380671769716",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:46.881911933Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671769716` → **200**

```json
[
  {
    "phone": "+380671769716",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:46.881911933Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "baf913f5-25c9-4985-b443-14e85f49d23c",
  "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
  "assignment_id": "6aed211c-d671-41a9-bb93-e63d2c3d4f5e",
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
    "phone": "+380671769716"
  }
}
```

`POST /api/driver/v1/work-sessions/987e71b8-2126-4584-bf61-5c2852ff922f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:47Z",
    "sequence": 1793285567397
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "987e71b8-2126-4584-bf61-5c2852ff922f",
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
  "last_heartbeat_at": "2026-10-29T14:52:47.419394Z",
  "last_location_at": "2026-10-29T14:52:47.419394Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/baf913f5-25c9-4985-b443-14e85f49d23c/arrive` → **200**

```json
{
  "command_id": "35c96423-f311-4195-baa4-e861275d1777",
  "expected_version": 0
}
```

```json
{
  "id": "baf913f5-25c9-4985-b443-14e85f49d23c",
  "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
  "assignment_id": "6aed211c-d671-41a9-bb93-e63d2c3d4f5e",
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
  "arrived_at": "2026-10-29T14:52:47.715972Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671769716"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671769716` → **200**

```json
[
  {
    "phone": "+380671769716",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:46.881911933Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671769716` → **200**

```json
[
  {
    "phone": "+380671769716",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:46.881911933Z"
  },
  {
    "phone": "+380671769716",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:48.891428053Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671769716` → **200**

```json
[
  {
    "phone": "+380671769716",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:46.881911933Z"
  },
  {
    "phone": "+380671769716",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:48.891428053Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671769716` → **200**

```json
[
  {
    "phone": "+380671769716",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:46.881911933Z"
  },
  {
    "phone": "+380671769716",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:52:48.891428053Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/baf913f5-25c9-4985-b443-14e85f49d23c/start` → **200**

```json
{
  "command_id": "8e8a3efa-495b-4f46-8343-547070db8928",
  "expected_version": 1
}
```

```json
{
  "id": "baf913f5-25c9-4985-b443-14e85f49d23c",
  "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
  "assignment_id": "6aed211c-d671-41a9-bb93-e63d2c3d4f5e",
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
  "arrived_at": "2026-10-29T14:52:47.715972Z",
  "started_at": "2026-10-29T14:52:49.119387Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671769716"
  }
}
```

`POST /api/driver/v1/trips/baf913f5-25c9-4985-b443-14e85f49d23c/complete` → **200**

```json
{
  "command_id": "65e3bd70-36f9-41bd-9fe0-687a97c95cc4",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:52:49Z",
  "cash_received": true
}
```

```json
{
  "id": "baf913f5-25c9-4985-b443-14e85f49d23c",
  "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
  "assignment_id": "6aed211c-d671-41a9-bb93-e63d2c3d4f5e",
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
  "arrived_at": "2026-10-29T14:52:47.715972Z",
  "started_at": "2026-10-29T14:52:49.119387Z",
  "completed_at": "2026-10-29T14:52:49.425413Z",
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
  "session_id": "987e71b8-2126-4584-bf61-5c2852ff922f",
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
  "last_heartbeat_at": "2026-10-29T14:52:47.419394Z",
  "last_location_at": "2026-10-29T14:52:47.419394Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/987e71b8-2126-4584-bf61-5c2852ff922f/close` → **200**

```json
{
  "command_id": "ac229b04-e1e3-4263-ae37-ecdf3cafb506",
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
  "phone": "+380635835178",
  "device_ref": "sandbox-29189"
}
```

```json
{
  "challenge_id": "6e7c809a-6224-47d8-88cd-700f12d5f0ad",
  "expires_at": "2026-10-29T14:57:50.314132892Z",
  "resend_available_at": "2026-10-29T14:52:51.314132892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635835178` → **200**

```json
{
  "phone": "+380635835178",
  "audience": "CLIENT",
  "code": "457369",
  "sent_at": "2026-10-29T14:52:50.318218287Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e7c809a-6224-47d8-88cd-700f12d5f0ad",
  "code": "457369",
  "device_ref": "sandbox-29189"
}
```

```json
{
  "session_id": "de19222d-093f-4626-9fee-5522185bdf05",
  "subject": {
    "type": "CLIENT",
    "id": "657bef7d-9ed3-4c89-ac5f-a790bb18e23d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTdiZWY3ZC05ZWQzLTRjODktYWM1Zi1hNzkwYmIxOGUyM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NDcwLCJpYXQiOjE3OTMyODU1NzAsImp0aSI6ImNlZGY5NzgyLTgyZTAtNGQ2Zi1hYzRmLWVjZWEyZDQ4ZjRkNCIsInNpZCI6ImRlMTkyMjJkLTA5M2YtNDYyNi05ZmVlLTU1MjIxODViZGYwNSJ9.Rg0iP14ffZzdTMp6nEnzD1deAoD4Ijpy7QEbUc3rylI",
  "access_expires_at": "2026-10-29T15:07:50.626838777Z",
  "refresh_token": "mRNCbdGvByLD5h6ul85cTPSDrzqYll-mx_rupvr-78g",
  "refresh_expires_at": "2026-11-28T14:52:50.626259694Z",
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
  "device_ref": "sandbox-8282"
}
```

```json
{
  "challenge_id": "24c911f2-2cb3-4446-9700-d185e5e0d1ba",
  "expires_at": "2026-10-29T14:57:51.198864121Z",
  "resend_available_at": "2026-10-29T14:52:52.198864121Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "204353",
  "sent_at": "2026-10-29T14:52:51.202144756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24c911f2-2cb3-4446-9700-d185e5e0d1ba",
  "code": "204353",
  "device_ref": "sandbox-8282"
}
```

```json
{
  "session_id": "62752560-f930-4337-b795-03d0fc10e56c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ3MSwiaWF0IjoxNzkzMjg1NTcxLCJqdGkiOiIwZWVjMTYyNy05MDdkLTQwMzUtOGIxMC0wNmI4ZjFiM2E3OWEiLCJzaWQiOiI2Mjc1MjU2MC1mOTMwLTQzMzctYjc5NS0wM2QwZmMxMGU1NmMifQ.bStzmdqUDQaF8HbsBYk10JfyM2xC5Wmov113DagY3LU",
  "access_expires_at": "2026-10-29T15:07:51.518687461Z",
  "refresh_token": "h8RYCq4izDv0A8v7eAh5e-8sNh2xXw06oXYE3Be4WGM",
  "refresh_expires_at": "2026-11-28T14:52:51.518137573Z",
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
  "session_id": "f5654c9a-45c9-4fef-a00b-5e244dd85108",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NzIsImlhdCI6MTc5MzI4NTU3MiwianRpIjoiODE0MWY4ZWItZmQ2Zi00ODkyLWE1YzYtZGU1YjA5ZjEzNzQ5Iiwic2lkIjoiZjU2NTRjOWEtNDVjOS00ZmVmLWEwMGItNWUyNDRkZDg1MTA4In0.7uNMBkHmWcGdr8c7r2CnAJcNncZ5rPX6tcVFzGVosQg",
  "access_expires_at": "2026-10-29T15:07:52.367727619Z",
  "refresh_token": "xiHsi9EeeGrFu3KOPScLNMVbtfAETNsE_q1E-CiBn90",
  "refresh_expires_at": "2026-10-30T02:52:52.367056975Z",
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
  "session_id": "05b4ee2d-4b83-4565-bbba-1349269fee48",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0NzIsImlhdCI6MTc5MzI4NTU3MiwianRpIjoiYzY2YzlmMTMtOTVhYy00MmM2LTgyMTEtMzUxZjFmZWFkOGIxIiwic2lkIjoiMDViNGVlMmQtNGI4My00NTY1LWJiYmEtMTM0OTI2OWZlZTQ4In0.lsgI40rZuwpg1anJKApSpNhbpZcJmM8BnoBfkq8dBds",
  "access_expires_at": "2026-10-29T15:07:52.955111098Z",
  "refresh_token": "GhkDB66p6PED_dcSUJnCjNBxK68CpzBqrayKkG6QOr4",
  "refresh_expires_at": "2026-10-30T02:52:52.954445874Z",
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
  "command_id": "dc051840-15af-4a09-9617-60538a888d64",
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
  "id": "97d42823-b80e-4d4f-a716-00593c69dfc5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:57:53.532093Z",
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
  "command_id": "64cc72f2-81d9-410e-a708-e76649795de2",
  "quote_id": "97d42823-b80e-4d4f-a716-00593c69dfc5",
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
  "id": "b70fcab6-4589-4b16-a365-33eaa6fb3fc6",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "657bef7d-9ed3-4c89-ac5f-a790bb18e23d",
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
  "created_at": "2026-10-29T14:52:53.858588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b70fcab6-4589-4b16-a365-33eaa6fb3fc6` → **200**

```json
{
  "id": "b70fcab6-4589-4b16-a365-33eaa6fb3fc6",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "657bef7d-9ed3-4c89-ac5f-a790bb18e23d",
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
  "created_at": "2026-10-29T14:52:53.858588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b70fcab6-4589-4b16-a365-33eaa6fb3fc6/cancel` → **200**

```json
{
  "command_id": "c87539b8-f985-4c6f-b5be-7a40246a4daa",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "b70fcab6-4589-4b16-a365-33eaa6fb3fc6",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "657bef7d-9ed3-4c89-ac5f-a790bb18e23d",
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
  "created_at": "2026-10-29T14:52:53.858588Z",
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
  "command_id": "149211bd-6deb-4fda-bfcf-db9a01becb5a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:55Z",
    "sequence": 1793285575782
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f2b5fa9f-f737-4c4c-ac28-c0ddfc9701d8",
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
  "last_heartbeat_at": "2026-10-29T14:52:55.098586Z",
  "last_location_at": "2026-10-29T14:52:55.098586Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-26983"
}
```

```json
{
  "challenge_id": "3074fb96-41a9-4975-bfb4-5b799257c3b8",
  "expires_at": "2026-10-29T14:57:55.394425063Z",
  "resend_available_at": "2026-10-29T14:52:56.394425063Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "391682",
  "sent_at": "2026-10-29T14:52:55.398040382Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3074fb96-41a9-4975-bfb4-5b799257c3b8",
  "code": "391682",
  "device_ref": "sandbox-26983"
}
```

```json
{
  "session_id": "59ff6e96-05e8-4085-9c19-8794df61fb61",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ3NSwiaWF0IjoxNzkzMjg1NTc1LCJqdGkiOiI1MWViZmZmZC04ZDJkLTRjZWYtOTcyZC00ODdkZDE2OTM0NjIiLCJzaWQiOiI1OWZmNmU5Ni0wNWU4LTQwODUtOWMxOS04Nzk0ZGY2MWZiNjEifQ.f_4dqhYM-DxCbtkSOlnlIoGFdMdKeSFyJAc-UVl5BZg",
  "access_expires_at": "2026-10-29T15:07:55.714887635Z",
  "refresh_token": "szG-C_kFLCRPo4HGOKY3xUtMGr6Pdi2FEehnEBUAkQs",
  "refresh_expires_at": "2026-11-28T14:52:55.714239734Z",
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
  "command_id": "e8ccc9f7-b52f-44c0-ae5d-8cfc45293e9a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:52:56Z",
    "sequence": 1793285576274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a664f599-44a0-4a83-bdd8-471422a39041",
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
  "last_heartbeat_at": "2026-10-29T14:52:56.294974Z",
  "last_location_at": "2026-10-29T14:52:56.294974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ec820170-5bb7-4819-80e7-53f98e4de058",
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
  "id": "8e557c5d-ec32-44ab-8fa1-8a33654ceb56",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:57:56.599385Z",
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
  "command_id": "8bf8b03b-feac-4409-815c-adb1daffd2c5",
  "quote_id": "8e557c5d-ec32-44ab-8fa1-8a33654ceb56",
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
  "id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "657bef7d-9ed3-4c89-ac5f-a790bb18e23d",
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
  "created_at": "2026-10-29T14:52:56.904928Z",
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
    "id": "be2766ca-3100-4ca5-b6b9-cf6e0d8e419d",
    "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
    "expires_at": "2026-10-29T14:53:11.908831Z",
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

`POST /api/driver/v1/offers/be2766ca-3100-4ca5-b6b9-cf6e0d8e419d/accept` → **200**

```json
{
  "command_id": "5d340107-7ab8-44d2-9c00-24c0205a7b15"
}
```

```json
{
  "id": "3813cdf7-e97b-4d03-ae72-8a015457a9b0",
  "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "510ebb3c-6030-44ee-ada6-0e7adada1934",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "510ebb3c-6030-44ee-ada6-0e7adada1934",
  "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
  "assignment_id": "3813cdf7-e97b-4d03-ae72-8a015457a9b0",
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

`POST /api/driver/v1/trips/510ebb3c-6030-44ee-ada6-0e7adada1934/cancel` → **200**

```json
{
  "command_id": "a8f591f0-ec52-4caa-bacf-aac5c5e8608d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "510ebb3c-6030-44ee-ada6-0e7adada1934",
  "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
  "assignment_id": "3813cdf7-e97b-4d03-ae72-8a015457a9b0",
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

`GET /api/rider/v1/orders/8e52c936-4d10-4b52-9479-7889c54c3aa1` → **200**

```json
{
  "id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "657bef7d-9ed3-4c89-ac5f-a790bb18e23d",
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
    "id": "3813cdf7-e97b-4d03-ae72-8a015457a9b0",
    "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "510ebb3c-6030-44ee-ada6-0e7adada1934",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:52:56.904928Z",
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
    "id": "94f1fca7-4f85-42eb-a938-2cd9f37b58c9",
    "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
    "expires_at": "2026-10-29T14:53:13.109312Z",
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

`POST /api/driver/v1/offers/94f1fca7-4f85-42eb-a938-2cd9f37b58c9/accept` → **200**

```json
{
  "command_id": "c962cfee-028f-4c70-80fc-2c6b21365baa"
}
```

```json
{
  "id": "b9742e15-8ca9-4fc6-bfb7-4585e082caba",
  "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bc8ac9db-681d-4680-82ef-a9f95c94cac6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bc8ac9db-681d-4680-82ef-a9f95c94cac6",
  "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
  "assignment_id": "b9742e15-8ca9-4fc6-bfb7-4585e082caba",
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

`POST /api/driver/v1/trips/bc8ac9db-681d-4680-82ef-a9f95c94cac6/cancel` → **200**

```json
{
  "command_id": "fda6752c-6508-4062-b2ab-6d31ddc21646",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "bc8ac9db-681d-4680-82ef-a9f95c94cac6",
  "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
  "assignment_id": "b9742e15-8ca9-4fc6-bfb7-4585e082caba",
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
    "id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:52:56.904928Z",
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
    "id": "b70fcab6-4589-4b16-a365-33eaa6fb3fc6",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:52:53.858588Z",
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

`GET /api/operator/v1/orders/8e52c936-4d10-4b52-9479-7889c54c3aa1/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:52:56.905629Z",
      "actor": {
        "type": "CLIENT",
        "id": "657bef7d-9ed3-4c89-ac5f-a790bb18e23d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
        "quote_id": "8e557c5d-ec32-44ab-8fa1-8a33654ceb56",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "71e1de24-4bbc-46dc-bcda-11648ac8d327"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:52:56.907908Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
        "attempt_id": "730f5007-a9eb-4ad6-931e-1c639df59c17",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "71e1de24-4bbc-46dc-bcda-11648ac8d327"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:52:56.915731Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "be2766ca-3100-4ca5-b6b9-cf6e0d8e419d",
        "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "71e1de24-4bbc-46dc-bcda-11648ac8d327"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:52:57.523347Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "be2766ca-3100-4ca5-b6b9-cf6e0d8e419d",
        "order_id": "8e52c936-4d10-4b52-9479-7889c54c3aa1",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "3813cdf7-e97b-4d03-ae72-8a015457a9b0"
      },
      "correlation_id": "081f0ac3-0e22-470d-af74-54ff01af0b61"
```

Done: orders b70fcab6-4589-4b16-a365-33eaa6fb3fc6, 8e52c936-4d10-4b52-9479-7889c54c3aa1.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734887585",
  "device_ref": "sandbox-16338"
}
```

```json
{
  "challenge_id": "2c5028e5-ec80-4cde-b95c-f2f77abdc651",
  "expires_at": "2026-10-29T14:58:00.516994423Z",
  "resend_available_at": "2026-10-29T14:53:01.516994423Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734887585` → **200**

```json
{
  "phone": "+380734887585",
  "audience": "CLIENT",
  "code": "369983",
  "sent_at": "2026-10-29T14:53:00.52066294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c5028e5-ec80-4cde-b95c-f2f77abdc651",
  "code": "369983",
  "device_ref": "sandbox-16338"
}
```

```json
{
  "session_id": "dfc7347f-a881-40f4-a172-335a433e3bcc",
  "subject": {
    "type": "CLIENT",
    "id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWIzNGNhMS03ODUxLTRjZmYtOGM3Yy05ZjU4ZTIxODNhYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NDgwLCJpYXQiOjE3OTMyODU1ODAsImp0aSI6IjI3MDA0OGM5LTk0NTItNDBiOS1iM2Q3LWVhODhkMjYwNzVmMCIsInNpZCI6ImRmYzczNDdmLWE4ODEtNDBmNC1hMTcyLTMzNWE0MzNlM2JjYyJ9.F4inhBH57FRmpUo0In22tyE7jLt-5YXorGOF56M4rSI",
  "access_expires_at": "2026-10-29T15:08:00.829386826Z",
  "refresh_token": "ymWw7wpxKddEoALrNDFw8aaD6hEffm0deX2O7Dz6XjU",
  "refresh_expires_at": "2026-11-28T14:53:00.828735977Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4ebeba93-cf2d-4dac-a9a5-22b9a127e663",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3c989d01-7b0c-48d7-8a3a-9b71dc514c7f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3c989d01-7b0c-48d7-8a3a-9b71dc514c7f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5cb9d98fc22e67494682ee407b7999b6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3c989d01-7b0c-48d7-8a3a-9b71dc514c7f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734887585"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3c989d01-7b0c-48d7-8a3a-9b71dc514c7f",
  "expires_at": "2026-10-29T15:23:01.110028Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/3c989d01-7b0c-48d7-8a3a-9b71dc514c7f` → **200**

```json
{
  "id": "3c989d01-7b0c-48d7-8a3a-9b71dc514c7f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:23:01.110028Z",
  "card": {
    "id": "4db7f015-1848-4c43-b5f9-1db116bb0a81",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8902",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:53:01.408681Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "4db7f015-1848-4c43-b5f9-1db116bb0a81",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8902",
      "card_type": "Visa",
      "created_at": "2026-10-29T14:53:01.408681Z"
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
  "device_ref": "sandbox-31679"
}
```

```json
{
  "challenge_id": "53be01ef-d4ea-49f6-a143-45dfce538c91",
  "expires_at": "2026-10-29T14:58:01.981835686Z",
  "resend_available_at": "2026-10-29T14:53:02.981835686Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "490056",
  "sent_at": "2026-10-29T14:53:01.985301677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53be01ef-d4ea-49f6-a143-45dfce538c91",
  "code": "490056",
  "device_ref": "sandbox-31679"
}
```

```json
{
  "session_id": "b0ceb5e9-e4ec-4a10-9374-19be6bc5f323",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjQ4MiwiaWF0IjoxNzkzMjg1NTgyLCJqdGkiOiIwYzA2MGE4NC01YmZmLTRhYTItOTgxNC1kMTYxZTkxNWM2NWEiLCJzaWQiOiJiMGNlYjVlOS1lNGVjLTRhMTAtOTM3NC0xOWJlNmJjNWYzMjMifQ.rt6XXGr7rgtmgTJ_Ei_fFgiedgQDRyQwBJrDpqJ6PFA",
  "access_expires_at": "2026-10-29T15:08:02.284937647Z",
  "refresh_token": "A48rk1UoUGvzVSCVRX18yOPuLCRu5NRlX47p95O57Jc",
  "refresh_expires_at": "2026-11-28T14:53:02.284312206Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a664f599-44a0-4a83-bdd8-471422a39041",
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
  "last_heartbeat_at": "2026-10-29T14:52:56.294974Z",
  "last_location_at": "2026-10-29T14:52:56.294974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a664f599-44a0-4a83-bdd8-471422a39041/handover` → **200**

```json
{
  "command_id": "14355d3e-01cb-4738-b576-1153e9133c0e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a664f599-44a0-4a83-bdd8-471422a39041",
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
  "last_heartbeat_at": "2026-10-29T14:52:56.294974Z",
  "last_location_at": "2026-10-29T14:52:56.294974Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a664f599-44a0-4a83-bdd8-471422a39041/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:03Z",
    "sequence": 1793285583141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a664f599-44a0-4a83-bdd8-471422a39041",
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
  "last_heartbeat_at": "2026-10-29T14:53:03.160313Z",
  "last_location_at": "2026-10-29T14:53:03.160313Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e9331482-18e8-4673-8f35-e3fc8b5bdc02",
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
  "id": "cf56ed34-cb09-4c16-b6b9-a51c86f897c0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:03.458720Z",
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
  "command_id": "1608c760-fbf2-4581-8211-4a4306aad397",
  "quote_id": "cf56ed34-cb09-4c16-b6b9-a51c86f897c0",
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
  "id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
  "created_at": "2026-10-29T14:53:03.762954Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a9159bdc-62d8-499c-95f5-3d31fbc8397e` → **200**

```json
{
  "id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
  "created_at": "2026-10-29T14:53:03.762954Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a9159bdc-62d8-499c-95f5-3d31fbc8397e` → **200**

```json
{
  "id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
  "created_at": "2026-10-29T14:53:03.762954Z",
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
    "id": "5184cafc-5d24-4164-a968-1c5b0127ca9b",
    "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
    "expires_at": "2026-10-29T14:53:19.207444Z",
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

`POST /api/driver/v1/offers/5184cafc-5d24-4164-a968-1c5b0127ca9b/accept` → **200**

```json
{
  "command_id": "98a027b4-e62c-4ec4-a4cc-bc0bc51d4ec4"
}
```

```json
{
  "id": "3033e58d-08e9-43f6-b80e-872b82662852",
  "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "328d41f8-8f72-4e64-bde6-cfe603f65b73",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "328d41f8-8f72-4e64-bde6-cfe603f65b73",
  "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "assignment_id": "3033e58d-08e9-43f6-b80e-872b82662852",
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

`POST /api/driver/v1/work-sessions/a664f599-44a0-4a83-bdd8-471422a39041/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:06Z",
    "sequence": 1793285586581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a664f599-44a0-4a83-bdd8-471422a39041",
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
  "last_heartbeat_at": "2026-10-29T14:53:06.601946Z",
  "last_location_at": "2026-10-29T14:53:06.601946Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/328d41f8-8f72-4e64-bde6-cfe603f65b73/arrive` → **200**

```json
{
  "command_id": "8ef5b87d-6227-45f4-9bc6-325da7cac7e6",
  "expected_version": 0
}
```

```json
{
  "id": "328d41f8-8f72-4e64-bde6-cfe603f65b73",
  "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "assignment_id": "3033e58d-08e9-43f6-b80e-872b82662852",
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
  "arrived_at": "2026-10-29T14:53:06.897278Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/328d41f8-8f72-4e64-bde6-cfe603f65b73/start` → **200**

```json
{
  "command_id": "917bcde5-1c22-4d27-a267-0ffeae388d21",
  "expected_version": 1
}
```

```json
{
  "id": "328d41f8-8f72-4e64-bde6-cfe603f65b73",
  "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "assignment_id": "3033e58d-08e9-43f6-b80e-872b82662852",
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
  "arrived_at": "2026-10-29T14:53:06.897278Z",
  "started_at": "2026-10-29T14:53:07.200432Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/328d41f8-8f72-4e64-bde6-cfe603f65b73/complete` → **200**

```json
{
  "command_id": "f7d69a73-300b-41c4-861f-aa559d534104",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:53:07Z",
  "cash_received": true
}
```

```json
{
  "id": "328d41f8-8f72-4e64-bde6-cfe603f65b73",
  "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "assignment_id": "3033e58d-08e9-43f6-b80e-872b82662852",
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
  "arrived_at": "2026-10-29T14:53:06.897278Z",
  "started_at": "2026-10-29T14:53:07.200432Z",
  "completed_at": "2026-10-29T14:53:07.50639Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/a9159bdc-62d8-499c-95f5-3d31fbc8397e` → **200**

```json
{
  "id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
    "id": "3033e58d-08e9-43f6-b80e-872b82662852",
    "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "328d41f8-8f72-4e64-bde6-cfe603f65b73",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:03.762954Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a9159bdc-62d8-499c-95f5-3d31fbc8397e` → **200**

```json
{
  "id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
    "id": "3033e58d-08e9-43f6-b80e-872b82662852",
    "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "328d41f8-8f72-4e64-bde6-cfe603f65b73",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:03.762954Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a9159bdc-62d8-499c-95f5-3d31fbc8397e` → **200**

```json
{
  "id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
    "id": "3033e58d-08e9-43f6-b80e-872b82662852",
    "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "328d41f8-8f72-4e64-bde6-cfe603f65b73",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:03.762954Z",
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

`GET /api/rider/v1/orders/a9159bdc-62d8-499c-95f5-3d31fbc8397e/tip` → **200**

```json
{
  "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
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
  "available_until": "2026-10-30T14:53:07.50639Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a9159bdc-62d8-499c-95f5-3d31fbc8397e/tip` → **201**

```json
{
  "command_id": "7e0bf055-0d45-4b8d-bd03-9e5afa57532f",
  "amount_minor": 2500
}
```

```json
{
  "id": "4ac64208-bbdf-4530-94ce-8024c5f580d1",
  "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:53:11.281487Z"
}
```

`GET /api/rider/v1/orders/a9159bdc-62d8-499c-95f5-3d31fbc8397e/tip` → **200**

```json
{
  "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
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
  "available_until": "2026-10-30T14:53:07.50639Z",
  "open": false,
  "tip": {
    "id": "4ac64208-bbdf-4530-94ce-8024c5f580d1",
    "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:53:11.281487Z"
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
      "id": "c4bb43e9-26f2-4b34-a5c9-ac4717be0b46",
      "at": "2026-10-29T14:53:08.270412Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
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
      "id": "007af4a1-b632-48e7-9589-de97ed910f7b",
      "at": "2026-10-29T14:53:12.319371Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
      "counterpart_id": null
    },
    {
      "id": "c4bb43e9-26f2-4b34-a5c9-ac4717be0b46",
      "at": "2026-10-29T14:53:08.270412Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0fac9270-3ab0-4746-8928-f6f063dcbf48",
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
  "id": "cdf0750d-36e1-4912-af01-1c28f114a56b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:13.434623Z",
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
  "session_id": "4b9329e5-1400-401b-98aa-8fdf97e5f7fc",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY0OTQsImlhdCI6MTc5MzI4NTU5NCwianRpIjoiZGYyNThiYzAtZmRjMi00NDZhLThkNDYtYTFkMTYxYzNmMTYwIiwic2lkIjoiNGI5MzI5ZTUtMTQwMC00MDFiLTk4YWEtOGZkZjk3ZTVmN2ZjIn0.bKZRc2GpSyAAAhxbPNHh1DPrjIRyVLUYNZdEm7WMZiw",
  "access_expires_at": "2026-10-29T15:08:14.017278713Z",
  "refresh_token": "tGcwmN3SWrj4UTNv7iw2WSk_qJrV1mhl9xgfYOearl8",
  "refresh_expires_at": "2026-10-30T02:53:14.016652562Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380734887585` → **200**

```json
{
  "client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3"
}
```

`POST /api/admin/v1/rider-wallets/e1b34ca1-7851-4cff-8c7c-9f58e2183aa3/top-ups` → **201**

```json
{
  "command_id": "2179f3e4-700a-40e5-8890-2c5b1dde400b",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
      "id": "bb72d82d-bf5e-4603-896e-67204e794e15",
      "at": "2026-10-29T14:53:14.582975Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f2d4f114-b332-4edb-84fd-fc78aa54a8ff",
  "quote_id": "cdf0750d-36e1-4912-af01-1c28f114a56b",
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
  "id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
  "created_at": "2026-10-29T14:53:14.887837Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b0b83582-6302-4b44-a7c6-f7102a29aef8` → **200**

```json
{
  "id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
  "created_at": "2026-10-29T14:53:14.887837Z",
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
    "id": "8279bc9a-7d6c-420d-b215-93a9161a64b3",
    "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
    "expires_at": "2026-10-29T14:53:29.893687Z",
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

`POST /api/driver/v1/offers/8279bc9a-7d6c-420d-b215-93a9161a64b3/accept` → **200**

```json
{
  "command_id": "9fae2220-0715-442f-aa36-507285e55f4e"
}
```

```json
{
  "id": "158ad4cb-1594-4671-af6d-83efee064ada",
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "492df948-5382-49ad-a9ef-09a95fc4b555",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "492df948-5382-49ad-a9ef-09a95fc4b555",
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
  "assignment_id": "158ad4cb-1594-4671-af6d-83efee064ada",
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

`POST /api/driver/v1/work-sessions/a664f599-44a0-4a83-bdd8-471422a39041/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:16Z",
    "sequence": 1793285596344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a664f599-44a0-4a83-bdd8-471422a39041",
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
  "last_heartbeat_at": "2026-10-29T14:53:16.365572Z",
  "last_location_at": "2026-10-29T14:53:16.365572Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/492df948-5382-49ad-a9ef-09a95fc4b555/arrive` → **200**

```json
{
  "command_id": "945e2944-07a9-4390-a85d-9d3d6f88f52d",
  "expected_version": 0
}
```

```json
{
  "id": "492df948-5382-49ad-a9ef-09a95fc4b555",
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
  "assignment_id": "158ad4cb-1594-4671-af6d-83efee064ada",
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
  "arrived_at": "2026-10-29T14:53:16.665519Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/492df948-5382-49ad-a9ef-09a95fc4b555/start` → **200**

```json
{
  "command_id": "275a2c7f-d337-4e3c-adfb-c9264476c55b",
  "expected_version": 1
}
```

```json
{
  "id": "492df948-5382-49ad-a9ef-09a95fc4b555",
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
  "assignment_id": "158ad4cb-1594-4671-af6d-83efee064ada",
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
  "arrived_at": "2026-10-29T14:53:16.665519Z",
  "started_at": "2026-10-29T14:53:16.956671Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/492df948-5382-49ad-a9ef-09a95fc4b555/complete` → **200**

```json
{
  "command_id": "28ad5259-c319-4323-a524-d54696fe1468",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:53:17Z",
  "cash_received": true
}
```

```json
{
  "id": "492df948-5382-49ad-a9ef-09a95fc4b555",
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
  "assignment_id": "158ad4cb-1594-4671-af6d-83efee064ada",
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
  "arrived_at": "2026-10-29T14:53:16.665519Z",
  "started_at": "2026-10-29T14:53:16.956671Z",
  "completed_at": "2026-10-29T14:53:17.25935Z",
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
  "client_id": "e1b34ca1-7851-4cff-8c7c-9f58e2183aa3",
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
      "id": "16271941-7f52-432a-a4d6-ccf73f359b66",
      "at": "2026-10-29T14:53:17.363253Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -16297,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8"
    },
    {
      "id": "bb72d82d-bf5e-4603-896e-67204e794e15",
      "at": "2026-10-29T14:53:14.582975Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
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

`GET /api/rider/v1/orders/b0b83582-6302-4b44-a7c6-f7102a29aef8/tip` → **200**

```json
{
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
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
  "available_until": "2026-10-30T14:53:17.25935Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b0b83582-6302-4b44-a7c6-f7102a29aef8/tip` → **201**

```json
{
  "command_id": "0f4465da-23e6-409f-80d1-6273a1d0b0fa",
  "amount_minor": 2500
}
```

```json
{
  "id": "e04beb39-6dcd-4975-b023-dfeec855f791",
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:53:18.415203Z"
}
```

`GET /api/rider/v1/orders/b0b83582-6302-4b44-a7c6-f7102a29aef8/tip` → **200**

```json
{
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
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
  "available_until": "2026-10-30T14:53:17.25935Z",
  "open": false,
  "tip": {
    "id": "e04beb39-6dcd-4975-b023-dfeec855f791",
    "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T14:53:18.415203Z"
  }
}
```

`GET /api/rider/v1/orders/b0b83582-6302-4b44-a7c6-f7102a29aef8/tip` → **200**

```json
{
  "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
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
  "available_until": "2026-10-30T14:53:17.25935Z",
  "open": false,
  "tip": {
    "id": "e04beb39-6dcd-4975-b023-dfeec855f791",
    "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:53:18.415203Z"
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
      "id": "7f1b2415-a0d9-4693-8d35-e1268a27992b",
      "at": "2026-10-29T14:53:17.359327Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
      "counterpart_id": null
    },
    {
      "id": "007af4a1-b632-48e7-9589-de97ed910f7b",
      "at": "2026-10-29T14:53:12.319371Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
      "counterpart_id": null
    },
    {
      "id": "c4bb43e9-26f2-4b34-a5c9-ac4717be0b46",
      "at": "2026-10-29T14:53:08.270412Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
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
      "id": "8d3ce8b7-6fd9-4dfd-8533-782cc148e032",
      "at": "2026-10-29T14:53:20.3938Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
      "counterpart_id": null
    },
    {
      "id": "7f1b2415-a0d9-4693-8d35-e1268a27992b",
      "at": "2026-10-29T14:53:17.359327Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "b0b83582-6302-4b44-a7c6-f7102a29aef8",
      "counterpart_id": null
    },
    {
      "id": "007af4a1-b632-48e7-9589-de97ed910f7b",
      "at": "2026-10-29T14:53:12.319371Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
      "counterpart_id": null
    },
    {
      "id": "c4bb43e9-26f2-4b34-a5c9-ac4717be0b46",
      "at": "2026-10-29T14:53:08.270412Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a9159bdc-62d8-499c-95f5-3d31fbc8397e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a664f599-44a0-4a83-bdd8-471422a39041",
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
  "last_heartbeat_at": "2026-10-29T14:53:16.365572Z",
  "last_location_at": "2026-10-29T14:53:16.365572Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a664f599-44a0-4a83-bdd8-471422a39041/close` → **200**

```json
{
  "command_id": "5c219cc5-ecb8-487d-9e07-db6bda926c32",
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

Done: card order b0b83582-6302-4b44-a7c6-f7102a29aef8.

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
  "phone": "+380737646389",
  "device_ref": "sandbox-25154"
}
```

```json
{
  "challenge_id": "64f8e522-56c6-4746-81cb-112674353b74",
  "expires_at": "2026-10-29T14:58:22.725338247Z",
  "resend_available_at": "2026-10-29T14:53:23.725338247Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737646389` → **200**

```json
{
  "phone": "+380737646389",
  "audience": "CLIENT",
  "code": "508652",
  "sent_at": "2026-10-29T14:53:22.728109521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64f8e522-56c6-4746-81cb-112674353b74",
  "code": "508652",
  "device_ref": "sandbox-25154"
}
```

```json
{
  "session_id": "8dff464b-1700-41e8-abe2-d0be8569063a",
  "subject": {
    "type": "CLIENT",
    "id": "69adccab-a970-492f-9109-a93b294fb3ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OWFkY2NhYi1hOTcwLTQ5MmYtOTEwOS1hOTNiMjk0ZmIzZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTAzLCJpYXQiOjE3OTMyODU2MDMsImp0aSI6IjFiYzA2MjFlLTYyNGQtNGI1OC1hOTc3LWRmZDMxMzU5MjEzMyIsInNpZCI6IjhkZmY0NjRiLTE3MDAtNDFlOC1hYmUyLWQwYmU4NTY5MDYzYSJ9.1mKHZYiCJJPPVsEX_AiPgwmIklFpqiMuZECc3sPibdc",
  "access_expires_at": "2026-10-29T15:08:23.028229966Z",
  "refresh_token": "CxoM0CelGOiW72bqOp0jwJUk7B21-bAM0YIHR7-65Ks",
  "refresh_expires_at": "2026-11-28T14:53:23.027535708Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e0d2c3ca-70c6-4922-8039-f538ce58087c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "f70e6839-7079-4391-b482-6ffdda3e3667",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f70e6839-7079-4391-b482-6ffdda3e3667",
    "orderDate": "1793285603",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "df68a0de774024665ce0ca58354ed79f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f70e6839-7079-4391-b482-6ffdda3e3667",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737646389"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f70e6839-7079-4391-b482-6ffdda3e3667",
  "created_at": "2026-10-29T14:53:23.304767Z",
  "expires_at": "2026-10-29T15:23:23.304767Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/f70e6839-7079-4391-b482-6ffdda3e3667` → **200**

```json
{
  "id": "f70e6839-7079-4391-b482-6ffdda3e3667",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:53:23.304767Z",
  "expires_at": "2026-10-29T15:23:23.304767Z",
  "completed_at": "2026-10-29T14:53:23.59842Z",
  "masked_pan": "41****3916",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "69adccab-a970-492f-9109-a93b294fb3ff",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "69adccab-a970-492f-9109-a93b294fb3ff",
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
      "id": "3c4b6acf-0fb7-4bc7-ab28-f1d34ca948e7",
      "at": "2026-10-29T14:53:24.409254Z",
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
  "client_id": "69adccab-a970-492f-9109-a93b294fb3ff",
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
      "id": "3c4b6acf-0fb7-4bc7-ab28-f1d34ca948e7",
      "at": "2026-10-29T14:53:24.409254Z",
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
  "device_ref": "sandbox-10616"
}
```

```json
{
  "challenge_id": "b43c496b-041a-48b2-9047-fe710092521d",
  "expires_at": "2026-10-29T14:58:25.74970859Z",
  "resend_available_at": "2026-10-29T14:53:26.74970859Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "389152",
  "sent_at": "2026-10-29T14:53:25.753078193Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b43c496b-041a-48b2-9047-fe710092521d",
  "code": "389152",
  "device_ref": "sandbox-10616"
}
```

```json
{
  "session_id": "4fece9de-a291-4dff-b23c-bafe5a915984",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjUwNiwiaWF0IjoxNzkzMjg1NjA2LCJqdGkiOiIxMGE2YmI5MS02YWY1LTQ1NDgtYmUzZC01NTcyMTNlZGUyN2EiLCJzaWQiOiI0ZmVjZTlkZS1hMjkxLTRkZmYtYjIzYy1iYWZlNWE5MTU5ODQifQ.LVptOE0Kt-y35fLkxG0uO4d7HiYQWwmjVDjatxAv8ng",
  "access_expires_at": "2026-10-29T15:08:26.067221054Z",
  "refresh_token": "RXzNRUSAI88fBoeD8fEY249kieaFxNQDwxnpksEgxEE",
  "refresh_expires_at": "2026-11-28T14:53:26.06656142Z",
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
  "command_id": "d1d1a067-3cff-4c39-bc4d-84ed5f7ab3c2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "9428a353-f3b8-4901-aa5f-ae0b84627fc1",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9428a353-f3b8-4901-aa5f-ae0b84627fc1",
    "orderDate": "1793285606",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "2399bd24d639b2a3d3899c761ab302ab",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9428a353-f3b8-4901-aa5f-ae0b84627fc1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9428a353-f3b8-4901-aa5f-ae0b84627fc1",
  "created_at": "2026-10-29T14:53:26.640333Z",
  "expires_at": "2026-10-29T15:23:26.640333Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/9428a353-f3b8-4901-aa5f-ae0b84627fc1` → **200**

```json
{
  "id": "9428a353-f3b8-4901-aa5f-ae0b84627fc1",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:53:26.640333Z",
  "expires_at": "2026-10-29T15:23:26.640333Z",
  "completed_at": "2026-10-29T14:53:26.933045Z",
  "masked_pan": "41****5419",
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
      "id": "3d455285-748b-4719-94d6-374962f65097",
      "at": "2026-10-29T14:53:27.417217Z",
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
  "command_id": "ef42569c-d092-4907-8e0b-e4ffc820af70",
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
  "correlation_id": "03f13ef8-667b-41bf-ac07-08bcdf6f50e5"
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
  "device_ref": "sandbox-2241"
}
```

```json
{
  "challenge_id": "df0ce972-c76e-4fba-a458-1dfea4e1f092",
  "expires_at": "2026-10-29T14:58:29.149438869Z",
  "resend_available_at": "2026-10-29T14:53:30.149438869Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "277994",
  "sent_at": "2026-10-29T14:53:29.152208777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df0ce972-c76e-4fba-a458-1dfea4e1f092",
  "code": "277994",
  "device_ref": "sandbox-2241"
}
```

```json
{
  "session_id": "92742d2b-af30-41ce-83e8-cb0a58b88aaa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjUwOSwiaWF0IjoxNzkzMjg1NjA5LCJqdGkiOiJkYjE3NDE2NS1jMmFmLTQ5OTktOTNlZC02ZDhkMmQ2NTIzNjYiLCJzaWQiOiI5Mjc0MmQyYi1hZjMwLTQxY2UtODNlOC1jYjBhNThiODhhYWEifQ.oR_mAzZ9xW1aG6KnSNARYKY3a_6OYNoWspmZRLsXqAI",
  "access_expires_at": "2026-10-29T15:08:29.478446462Z",
  "refresh_token": "HBdLZME1LWxuEjIW-XYahqngpdW463glgaHNCXW3XOk",
  "refresh_expires_at": "2026-11-28T14:53:29.477742716Z",
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
  "command_id": "64fb3019-01ca-4bb0-94b5-b35e4b9d2b28",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:30Z",
    "sequence": 1793285610321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ca44b14-e587-4f2f-bec8-a9ae2c887999",
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
  "last_heartbeat_at": "2026-10-29T14:53:30.051189Z",
  "last_location_at": "2026-10-29T14:53:30.051189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639654916",
  "device_ref": "sandbox-23945"
}
```

```json
{
  "challenge_id": "e9421e96-8779-49f3-b469-911099dea4ae",
  "expires_at": "2026-10-29T14:58:30.336743172Z",
  "resend_available_at": "2026-10-29T14:53:31.336743172Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639654916` → **200**

```json
{
  "phone": "+380639654916",
  "audience": "CLIENT",
  "code": "817510",
  "sent_at": "2026-10-29T14:53:30.339536629Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9421e96-8779-49f3-b469-911099dea4ae",
  "code": "817510",
  "device_ref": "sandbox-23945"
}
```

```json
{
  "session_id": "6bd6ac5e-d016-4f57-adef-ebbf23b9fecf",
  "subject": {
    "type": "CLIENT",
    "id": "5a8d934c-9044-4f8e-b824-92a62b686c68"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YThkOTM0Yy05MDQ0LTRmOGUtYjgyNC05MmE2MmI2ODZjNjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTEwLCJpYXQiOjE3OTMyODU2MTAsImp0aSI6ImU4MTU3ZTI2LTIzNWYtNDEzZC04NjVhLTg0NjZjOTg0NWY0NSIsInNpZCI6IjZiZDZhYzVlLWQwMTYtNGY1Ny1hZGVmLWViYmYyM2I5ZmVjZiJ9.QZMFgfgDYLUDxhVnzV-xoR-tV2gcD2aVUabIYcM8UgY",
  "access_expires_at": "2026-10-29T15:08:30.647613293Z",
  "refresh_token": "LHO2gPeYFBzXVQ2gFWATUcCReB04iJ-1RBW9d_dOSsk",
  "refresh_expires_at": "2026-11-28T14:53:30.64697473Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb9f82eb-8ed6-41a5-9eae-fc79067a9d20",
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
  "id": "c37fed4f-0b4a-4311-8dd8-591ef81114cf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:30.944589Z",
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
  "command_id": "f7bf94f9-d4c7-41ef-82fe-4b70ad29746f",
  "quote_id": "c37fed4f-0b4a-4311-8dd8-591ef81114cf",
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
  "id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5a8d934c-9044-4f8e-b824-92a62b686c68",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:53:31.249586Z",
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
    "id": "12b4c5ae-5ad4-4e82-bb5e-8bc3bace06aa",
    "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
    "expires_at": "2026-10-29T14:53:46.252714Z",
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

`POST /api/driver/v1/offers/12b4c5ae-5ad4-4e82-bb5e-8bc3bace06aa/accept` → **200**

```json
{
  "command_id": "fc329c3a-a30e-43e1-800f-35bef618be3e"
}
```

```json
{
  "id": "fc570417-e75b-4599-8922-bc6328c7adac",
  "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "02df7bd4-03cf-402b-a5a8-54de948507d2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "02df7bd4-03cf-402b-a5a8-54de948507d2",
  "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
  "assignment_id": "fc570417-e75b-4599-8922-bc6328c7adac",
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

`POST /api/driver/v1/work-sessions/2ca44b14-e587-4f2f-bec8-a9ae2c887999/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:32Z",
    "sequence": 1793285612404
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ca44b14-e587-4f2f-bec8-a9ae2c887999",
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
  "last_heartbeat_at": "2026-10-29T14:53:32.422986Z",
  "last_location_at": "2026-10-29T14:53:32.422986Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/02df7bd4-03cf-402b-a5a8-54de948507d2/arrive` → **200**

```json
{
  "command_id": "aaee461b-3d7a-43e9-82cb-f0bbce6629c5",
  "expected_version": 0
}
```

```json
{
  "id": "02df7bd4-03cf-402b-a5a8-54de948507d2",
  "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
  "assignment_id": "fc570417-e75b-4599-8922-bc6328c7adac",
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
  "arrived_at": "2026-10-29T14:53:32.714932Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/02df7bd4-03cf-402b-a5a8-54de948507d2/start` → **200**

```json
{
  "command_id": "f36fc7d0-f6e9-4563-9e62-2289ff2db705",
  "expected_version": 1
}
```

```json
{
  "id": "02df7bd4-03cf-402b-a5a8-54de948507d2",
  "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
  "assignment_id": "fc570417-e75b-4599-8922-bc6328c7adac",
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
  "arrived_at": "2026-10-29T14:53:32.714932Z",
  "started_at": "2026-10-29T14:53:33.015715Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/02df7bd4-03cf-402b-a5a8-54de948507d2/complete` → **200**

```json
{
  "command_id": "808fb819-1dc2-4301-92a1-6d99260b3db8",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:53:33Z",
  "cash_received": false
}
```

```json
{
  "id": "02df7bd4-03cf-402b-a5a8-54de948507d2",
  "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
  "assignment_id": "fc570417-e75b-4599-8922-bc6328c7adac",
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
  "arrived_at": "2026-10-29T14:53:32.714932Z",
  "started_at": "2026-10-29T14:53:33.015715Z",
  "completed_at": "2026-10-29T14:53:33.312176Z",
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
  "session_id": "ae65e77a-2995-4b5c-a51b-ff7cd6b51537",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1MTMsImlhdCI6MTc5MzI4NTYxMywianRpIjoiYmYzZDkxNTgtMTgzOS00NmUyLWFmNmYtZWRiMGQ5NWYwNWZiIiwic2lkIjoiYWU2NWU3N2EtMjk5NS00YjVjLWE1MWItZmY3Y2Q2YjUxNTM3In0.0-MHm9HBMPM_hiiZSnaH5_tfwOrz7ujygXEbHYrL9EE",
  "access_expires_at": "2026-10-29T15:08:33.902108945Z",
  "refresh_token": "wPFgfQHVAjNKyOI-ivUt5caXonpxPKRgtoOJ_ewgED4",
  "refresh_expires_at": "2026-10-30T02:53:33.901532789Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/495f7d7b-6d2e-448c-914e-f395fe51dec2/cash-dispute` → **200**

```json
{
  "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5a8d934c-9044-4f8e-b824-92a62b686c68",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:53:33.468177Z",
  "decide_by": "2026-11-12T14:53:33.468177Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T14:53:33.468177Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "5a8d934c-9044-4f8e-b824-92a62b686c68",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T14:53:33.468177Z",
      "decide_by": "2026-11-12T14:53:33.468177Z",
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

`POST /api/admin/v1/orders/495f7d7b-6d2e-448c-914e-f395fe51dec2/cash-dispute/decide` → **400**

```json
{
  "command_id": "edccc1d0-9702-4092-8592-666fa37d2156",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/495f7d7b-6d2e-448c-914e-f395fe51dec2/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "fbc84b24-6f6a-4a19-a391-2f883c93b555",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/495f7d7b-6d2e-448c-914e-f395fe51dec2/cash-dispute/decide` → **200**

```json
{
  "command_id": "0b9f2be9-34db-4c85-b400-8c7a27ec8762",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "5a8d934c-9044-4f8e-b824-92a62b686c68",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:53:33.468177Z",
  "decide_by": "2026-11-12T14:53:33.468177Z",
  "decision": "PAY_DRIVER",
  "decided_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T14:53:35.091809Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/495f7d7b-6d2e-448c-914e-f395fe51dec2/cash-dispute/decide` → **409**

```json
{
  "command_id": "4ce95b2d-e754-44f5-a68b-83c2f42ef11c",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/495f7d7b-6d2e-448c-914e-f395fe51dec2/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "08c6122e-efa1-473f-92fe-54b91934b02d"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ca44b14-e587-4f2f-bec8-a9ae2c887999",
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
  "last_heartbeat_at": "2026-10-29T14:53:32.422986Z",
  "last_location_at": "2026-10-29T14:53:32.422986Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ca44b14-e587-4f2f-bec8-a9ae2c887999/close` → **200**

```json
{
  "command_id": "7cf315d2-c804-4539-a846-8eb968f1d69b",
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
  "phone": "+380737102008",
  "device_ref": "sandbox-20972"
}
```

```json
{
  "challenge_id": "027d227a-9f26-424a-b4cf-922400562de7",
  "expires_at": "2026-10-29T14:58:36.266515126Z",
  "resend_available_at": "2026-10-29T14:53:37.266515126Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737102008` → **200**

```json
{
  "phone": "+380737102008",
  "audience": "CLIENT",
  "code": "552891",
  "sent_at": "2026-10-29T14:53:36.269277661Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "027d227a-9f26-424a-b4cf-922400562de7",
  "code": "552891",
  "device_ref": "sandbox-20972"
}
```

```json
{
  "session_id": "4b095459-5776-46cd-811c-ddb1f4eb6e3c",
  "subject": {
    "type": "CLIENT",
    "id": "553d4ef4-5133-4831-8890-e75fa75bb704"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTNkNGVmNC01MTMzLTQ4MzEtODg5MC1lNzVmYTc1YmI3MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTE2LCJpYXQiOjE3OTMyODU2MTYsImp0aSI6IjlkM2UyN2NmLTgzNDMtNDAwZC04MDk1LWFhOTkzZTk4OGMzNiIsInNpZCI6IjRiMDk1NDU5LTU3NzYtNDZjZC04MTFjLWRkYjFmNGViNmUzYyJ9._3ReZj4khRMuvFP2JgUPoGbAYerHiqF2tVR8xKlNDPM",
  "access_expires_at": "2026-10-29T15:08:36.578960604Z",
  "refresh_token": "g_peI6eNUt7t65nR1-oSkTOvuEHdtelAaSw1A21OLUY",
  "refresh_expires_at": "2026-11-28T14:53:36.578361062Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "9a867ff6-a577-44ac-a01d-c23258031c2f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e96cd3bb-407d-4d9e-b1ac-c051e229bb32",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e96cd3bb-407d-4d9e-b1ac-c051e229bb32",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "76e3605e0e74e569e70335c8e0d62cb2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e96cd3bb-407d-4d9e-b1ac-c051e229bb32",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737102008"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e96cd3bb-407d-4d9e-b1ac-c051e229bb32",
  "expires_at": "2026-10-29T15:23:36.859598Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e96cd3bb-407d-4d9e-b1ac-c051e229bb32` → **200**

```json
{
  "id": "e96cd3bb-407d-4d9e-b1ac-c051e229bb32",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:23:36.859598Z",
  "card": {
    "id": "92574121-9c41-4a68-af98-cb2134ba7bc8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3227",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:53:37.151946Z"
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
  "device_ref": "sandbox-23522"
}
```

```json
{
  "challenge_id": "9d18a7c7-e39e-4966-93dc-117b7bb90daa",
  "expires_at": "2026-10-29T14:58:37.448232432Z",
  "resend_available_at": "2026-10-29T14:53:38.448232432Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "129540",
  "sent_at": "2026-10-29T14:53:37.450852341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d18a7c7-e39e-4966-93dc-117b7bb90daa",
  "code": "129540",
  "device_ref": "sandbox-23522"
}
```

```json
{
  "session_id": "06d9e553-f840-4ff0-97df-1d96f0170dc5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjUxNywiaWF0IjoxNzkzMjg1NjE3LCJqdGkiOiI5OTg0MGE1MS0wOGU4LTRmMzItYjg5MC05NDQzOGU3ZDUxNmQiLCJzaWQiOiIwNmQ5ZTU1My1mODQwLTRmZjAtOTdkZi0xZDk2ZjAxNzBkYzUifQ.d0E8LruVc6g7AIFbFWHUuFWiAWZAHxfwK7JB_lBT-_k",
  "access_expires_at": "2026-10-29T15:08:37.76266168Z",
  "refresh_token": "BQpAINBcNL8h2AAMHtT8NFMZDPmYXcksWh5j2mht1zE",
  "refresh_expires_at": "2026-11-28T14:53:37.762098997Z",
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
  "command_id": "55f709bb-df69-4620-a6a7-fd982b41ac85",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:38Z",
    "sequence": 1793285618326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5580ae63-e803-4a51-a52a-debf101bbe21",
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
  "last_heartbeat_at": "2026-10-29T14:53:38.346085Z",
  "last_location_at": "2026-10-29T14:53:38.346085Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6d751d0-3581-4ea0-9eb6-fc246ea0584a",
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
  "id": "e7a14c48-86b8-4014-8245-3bc7b84dd9e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:38.644477Z",
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
  "command_id": "1ac2240f-a2a1-412e-baef-345dd14824a0",
  "quote_id": "e7a14c48-86b8-4014-8245-3bc7b84dd9e1",
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
  "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "553d4ef4-5133-4831-8890-e75fa75bb704",
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
  "created_at": "2026-10-29T14:53:38.940972Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91` → **200**

```json
{
  "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "553d4ef4-5133-4831-8890-e75fa75bb704",
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
  "created_at": "2026-10-29T14:53:38.940972Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91` → **200**

```json
{
  "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "553d4ef4-5133-4831-8890-e75fa75bb704",
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
  "created_at": "2026-10-29T14:53:38.940972Z",
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
    "id": "d2955b2b-8e69-454a-bc9f-a46289cd53bd",
    "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
    "expires_at": "2026-10-29T14:53:54.511431Z",
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

`POST /api/driver/v1/offers/d2955b2b-8e69-454a-bc9f-a46289cd53bd/accept` → **200**

```json
{
  "command_id": "e97e3140-263e-496e-a67e-a592831d07d0"
}
```

```json
{
  "id": "6d8ea6cc-689a-42c8-b4f2-0a87c6be5559",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "48e15047-ff87-4ad5-a5b1-bc556cf12d53",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "48e15047-ff87-4ad5-a5b1-bc556cf12d53",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "assignment_id": "6d8ea6cc-689a-42c8-b4f2-0a87c6be5559",
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

`POST /api/rider/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/messages` → **201**

```json
{
  "command_id": "34307806-9650-4756-910a-972da20f0075",
  "body": "Я біля входу, мій номер +380737102008, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "78272373-abac-4c96-be42-fca897e7e2e4",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737102008, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T14:53:41.718636091Z"
}
```

`POST /api/driver/v1/trips/48e15047-ff87-4ad5-a5b1-bc556cf12d53/messages` → **201**

```json
{
  "command_id": "cad4bc2c-faeb-432a-9079-f2032c4f1066",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "ffcbf038-f5b7-4913-b6f4-c334b6732912",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T14:53:42.013254523Z"
}
```

`POST /api/driver/v1/work-sessions/5580ae63-e803-4a51-a52a-debf101bbe21/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:42Z",
    "sequence": 1793285622290
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5580ae63-e803-4a51-a52a-debf101bbe21",
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
  "last_heartbeat_at": "2026-10-29T14:53:42.308935Z",
  "last_location_at": "2026-10-29T14:53:42.308935Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/48e15047-ff87-4ad5-a5b1-bc556cf12d53/arrive` → **200**

```json
{
  "command_id": "0f90c2a6-f1b3-4c1e-84d3-34fe69c2ab97",
  "expected_version": 0
}
```

```json
{
  "id": "48e15047-ff87-4ad5-a5b1-bc556cf12d53",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "assignment_id": "6d8ea6cc-689a-42c8-b4f2-0a87c6be5559",
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
  "arrived_at": "2026-10-29T14:53:42.606543Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/48e15047-ff87-4ad5-a5b1-bc556cf12d53/start` → **200**

```json
{
  "command_id": "fa2047d7-f532-4ec1-9159-7c339b9e28b5",
  "expected_version": 1
}
```

```json
{
  "id": "48e15047-ff87-4ad5-a5b1-bc556cf12d53",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "assignment_id": "6d8ea6cc-689a-42c8-b4f2-0a87c6be5559",
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
  "arrived_at": "2026-10-29T14:53:42.606543Z",
  "started_at": "2026-10-29T14:53:42.906251Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5580ae63-e803-4a51-a52a-debf101bbe21/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:53:43Z",
    "sequence": 1793285623198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5580ae63-e803-4a51-a52a-debf101bbe21",
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
  "last_heartbeat_at": "2026-10-29T14:53:43.217278Z",
  "last_location_at": "2026-10-29T14:53:43.217278Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/48e15047-ff87-4ad5-a5b1-bc556cf12d53/complete` → **200**

```json
{
  "command_id": "0220904f-93f2-4f17-8114-9654a5fc27d1",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:53:43Z",
  "cash_received": false
}
```

```json
{
  "id": "48e15047-ff87-4ad5-a5b1-bc556cf12d53",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "assignment_id": "6d8ea6cc-689a-42c8-b4f2-0a87c6be5559",
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
  "arrived_at": "2026-10-29T14:53:42.606543Z",
  "started_at": "2026-10-29T14:53:42.906251Z",
  "completed_at": "2026-10-29T14:53:43.519762Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91` → **200**

```json
{
  "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "553d4ef4-5133-4831-8890-e75fa75bb704",
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
    "id": "6d8ea6cc-689a-42c8-b4f2-0a87c6be5559",
    "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "48e15047-ff87-4ad5-a5b1-bc556cf12d53",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:38.940972Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91` → **200**

```json
{
  "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "553d4ef4-5133-4831-8890-e75fa75bb704",
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
    "id": "6d8ea6cc-689a-42c8-b4f2-0a87c6be5559",
    "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "48e15047-ff87-4ad5-a5b1-bc556cf12d53",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:53:38.940972Z",
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
  "session_id": "5580ae63-e803-4a51-a52a-debf101bbe21",
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
  "last_heartbeat_at": "2026-10-29T14:53:43.217278Z",
  "last_location_at": "2026-10-29T14:53:43.217278Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5580ae63-e803-4a51-a52a-debf101bbe21/close` → **200**

```json
{
  "command_id": "06340861-190d-4ac3-82a8-ba785e750426",
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
  "session_id": "2fe3368c-8a8b-420c-83f3-8a621a4adbcf",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1MjYsImlhdCI6MTc5MzI4NTYyNiwianRpIjoiNzM1OGU2YTMtYmNhYy00ODZjLThlNzUtMmI3Y2ZlZTUyYjk1Iiwic2lkIjoiMmZlMzM2OGMtOGE4Yi00MjBjLTgzZjMtOGE2MjFhNGFkYmNmIn0.nw7bjOxiXcYYKgs_7K2BtEPukNthri0WNck1AtprViE",
  "access_expires_at": "2026-10-29T15:08:46.284960405Z",
  "refresh_token": "8GfY7KB7fsyv46N53XV3dj7fhB7n764QoOLrSn7M6i4",
  "refresh_expires_at": "2026-10-30T02:53:46.284399819Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e0e8bc6b-a872-4777-b2a9-149cad5290c7"
}
```

`GET /api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T14:53:46.916596215Z",
  "order": {
    "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
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
    "created_at": "2026-10-29T14:53:38.940972Z",
    "assigned_at": "2026-10-29T14:53:41.148294Z",
    "arrived_at": "2026-10-29T14:53:42.606543Z",
    "started_at": "2026-10-29T14:53:42.906251Z",
    "completed_at": "2026-10-29T14:53:43.519762Z"
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
    "id": "553d4ef4-5133-4831-8890-e75fa75bb704",
    "registered_at": "2026-10-29T14:53:36.576428Z",
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
      "created_at": "2026-10-29T14:53:38.943573Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T14:53:43.567383Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/chargebacks` → **422**

```json
{
  "command_id": "f687156a-a879-439c-a225-0fa0e8484e85",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "ba14822c-a0cc-4c84-bd6a-05001675bdb3"
}
```

`POST /api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/chargebacks` → **201**

```json
{
  "command_id": "9f05d817-a036-492f-bc78-7e705bc4ddd8",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "f5dd37db-077c-43d5-8f33-5f1f201c9d47",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:53:47.664865Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/chargebacks` → **201**

```json
{
  "command_id": "9f05d817-a036-492f-bc78-7e705bc4ddd8",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "f5dd37db-077c-43d5-8f33-5f1f201c9d47",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:53:47.664865Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/553d4ef4-5133-4831-8890-e75fa75bb704` → **200**

```json
{
  "client": {
    "id": "553d4ef4-5133-4831-8890-e75fa75bb704",
    "phone": "+380737102008",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:53:36.576428Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:53:38.940972Z",
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

`GET /api/admin/v1/clients/553d4ef4-5133-4831-8890-e75fa75bb704` → **200**

```json
{
  "client": {
    "id": "553d4ef4-5133-4831-8890-e75fa75bb704",
    "phone": "+380737102008",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:53:36.576428Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:53:38.940972Z",
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

`POST /api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/chargebacks/f5dd37db-077c-43d5-8f33-5f1f201c9d47/resolve` → **200**

```json
{
  "command_id": "f43cea7b-6b37-4bb2-9661-651ce89c8998",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "f5dd37db-077c-43d5-8f33-5f1f201c9d47",
  "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T14:53:47.664865Z",
  "resolved_at": "2026-10-29T14:53:49.936543Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/553d4ef4-5133-4831-8890-e75fa75bb704` → **200**

```json
{
  "client": {
    "id": "553d4ef4-5133-4831-8890-e75fa75bb704",
    "phone": "+380737102008",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:53:36.576428Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:53:38.940972Z",
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

`GET /api/admin/v1/clients/553d4ef4-5133-4831-8890-e75fa75bb704` → **200**

```json
{
  "client": {
    "id": "553d4ef4-5133-4831-8890-e75fa75bb704",
    "phone": "+380737102008",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:53:36.576428Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:53:38.940972Z",
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

`POST /api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/chargebacks/f5dd37db-077c-43d5-8f33-5f1f201c9d47/resolve` → **409**

```json
{
  "command_id": "6a2d913b-24dc-482c-afa7-a55ab01ec4cb",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/chargebacks/f5dd37db-077c-43d5-8f33-5f1f201c9d47/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "18b98f7e-bb38-4947-ae58-f56868a6d08e"
}
```

`GET /api/admin/v1/orders/f07a093f-2e33-47eb-a0d2-86c244ec0c91/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "f5dd37db-077c-43d5-8f33-5f1f201c9d47",
      "order_id": "f07a093f-2e33-47eb-a0d2-86c244ec0c91",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T14:53:47.664865Z",
      "resolved_at": "2026-10-29T14:53:49.936543Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order f07a093f-2e33-47eb-a0d2-86c244ec0c91 without phone or card digits; chargeback f5dd37db-077c-43d5-8f33-5f1f201c9d47 recorded and won.

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
  "session_id": "31742de5-a559-46fe-9688-380fa051924d",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1MzMsImlhdCI6MTc5MzI4NTYzMywianRpIjoiMzY2ZjkyYTUtNjdlMS00Y2MwLTkwNTAtMjA1NTg4ZjRkNmQ2Iiwic2lkIjoiMzE3NDJkZTUtYTU1OS00NmZlLTk2ODgtMzgwZmEwNTE5MjRkIn0.d05a0dH-Vlqr14mA5_XK-BO2s1hX9570QZiv9UhfZHM",
  "access_expires_at": "2026-10-29T15:08:53.016404993Z",
  "refresh_token": "T4evizCf0x50MGkK-CDLioOKKubmKnmoNvYMum1o2Wo",
  "refresh_expires_at": "2026-10-30T02:53:53.015767181Z",
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
  "phone": "+48600541798",
  "device_ref": "sandbox-10293"
}
```

```json
{
  "challenge_id": "da59e0fd-00e5-4433-af3f-b44646940ba1",
  "expires_at": "2026-10-29T14:58:53.868036748Z",
  "resend_available_at": "2026-10-29T14:53:54.868036748Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600541798` → **200**

```json
{
  "phone": "+48600541798",
  "audience": "CLIENT",
  "code": "425716",
  "sent_at": "2026-10-29T14:53:53.870728179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da59e0fd-00e5-4433-af3f-b44646940ba1",
  "code": "425716",
  "device_ref": "sandbox-10293"
}
```

```json
{
  "session_id": "38cd055f-6887-4a19-96c1-c330b7e390c1",
  "subject": {
    "type": "CLIENT",
    "id": "72de6562-893b-4cb0-a47c-27091708d1a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MmRlNjU2Mi04OTNiLTRjYjAtYTQ3Yy0yNzA5MTcwOGQxYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTM0LCJpYXQiOjE3OTMyODU2MzQsImp0aSI6IjhkODViYTczLWMzY2YtNDhmNi05NDhhLTQ4MWFlYzAwODI5OSIsInNpZCI6IjM4Y2QwNTVmLTY4ODctNGExOS05NmMxLWMzMzBiN2UzOTBjMSJ9.AEcKtYFgl_fw_maZs7-E1G0wb6p-H6A3YCyBUIN2TgE",
  "access_expires_at": "2026-10-29T15:08:54.18297153Z",
  "refresh_token": "YFhgXc31kPtzNBnm3_2ICfIZgaddb9MDzXvVWmDq1KM",
  "refresh_expires_at": "2026-11-28T14:53:54.18245838Z",
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
  "command_id": "dee2c15a-9463-4151-8f4b-1174e3f4b0d3",
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
  "correlation_id": "cb60cb77-f507-4e06-9a0a-2beb926c7c20",
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
  "command_id": "329a97b9-ffaf-4b58-8695-987d646e3164",
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
  "paused_at": "2026-10-29T14:53:55.333788189Z",
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
  "command_id": "e139108b-2f62-4aa9-98e0-a0ac8f8cb27e",
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
  "id": "d8ccf2b7-00c0-4b4c-9690-56ca427c6ce9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:55.920347Z",
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
  "command_id": "e915385e-8a5e-4ed7-85eb-0d589b73efd9",
  "quote_id": "d8ccf2b7-00c0-4b4c-9690-56ca427c6ce9",
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
  "correlation_id": "8e57bcf0-d585-4940-acd5-baf4c9347186"
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
  "paused_at": "2026-10-29T14:53:55.333788Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "5eb6c772-565f-4259-950c-b06e7b93e460",
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
  "command_id": "cbf8908b-613e-4145-bc06-a1f33e2d9f2b",
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
  "command_id": "75cb4fcb-6b86-4c05-a846-933f21725150",
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
  "id": "d593892e-ae23-4aca-81d0-8a8f29fce6a6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:57.657980Z",
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
  "command_id": "ae33f929-c6de-4453-a2cd-d027d4733428",
  "quote_id": "d593892e-ae23-4aca-81d0-8a8f29fce6a6",
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
  "correlation_id": "b1ba3abc-e752-44d4-a8b7-6e9122a2c1c9"
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
  "command_id": "55a54b2e-71a7-4575-898c-949aa8486c03",
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
  "command_id": "f180c652-e3df-43bc-b54b-426dc292ff0b",
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
  "id": "07dc5005-36db-45b8-847e-51bcebcc465c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:58:58.818394Z",
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
  "command_id": "7c9d0f30-049a-463e-ad4f-e1c85b7f9f2c",
  "quote_id": "07dc5005-36db-45b8-847e-51bcebcc465c",
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
  "correlation_id": "de502e84-fbc6-4dab-819b-42a4bfb248ae"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "111a346d-bd8c-4b7a-8276-6e3ce6f7a0cc",
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
  "correlation_id": "047c11a1-68f0-4570-b659-34bcd66e527b"
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
  "command_id": "19337b83-867c-49a0-9b7b-f9e4f12ee443",
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
  "phone": "+380674244615",
  "device_ref": "sandbox-27722"
}
```

```json
{
  "challenge_id": "9cc751a0-1948-4e4b-b828-d9980da7d5a6",
  "expires_at": "2026-10-29T14:59:00.286953652Z",
  "resend_available_at": "2026-10-29T14:54:01.286953652Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674244615` → **200**

```json
{
  "phone": "+380674244615",
  "audience": "CLIENT",
  "code": "447519",
  "sent_at": "2026-10-29T14:54:00.289543082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cc751a0-1948-4e4b-b828-d9980da7d5a6",
  "code": "447519",
  "device_ref": "sandbox-27722"
}
```

```json
{
  "session_id": "06a9c2b7-942b-4b25-a115-5c1170c3a36e",
  "subject": {
    "type": "CLIENT",
    "id": "1db4d356-4e2e-47d6-89a6-04e5ccbbb365"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZGI0ZDM1Ni00ZTJlLTQ3ZDYtODlhNi0wNGU1Y2NiYmIzNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTQwLCJpYXQiOjE3OTMyODU2NDAsImp0aSI6ImZhNjE0ZDI3LTQ3NWItNGMzMC05NDg4LWM1Yjc5ZjNmMjM5OCIsInNpZCI6IjA2YTljMmI3LTk0MmItNGIyNS1hMTE1LTVjMTE3MGMzYTM2ZSJ9.mjPjW5ZAbLmBXtYI5vitTeR70RqWevDxmG__SgAEy9s",
  "access_expires_at": "2026-10-29T15:09:00.593650642Z",
  "refresh_token": "HMhZMN8C7Z7COYPgb7Z7kA26G8PXqE80ka57T7ejbqs",
  "refresh_expires_at": "2026-11-28T14:54:00.593024089Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1db4d356-4e2e-47d6-89a6-04e5ccbbb365",
  "session_id": "06a9c2b7-942b-4b25-a115-5c1170c3a36e",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8d8f3648-903c-4c73-bbbc-d68466b61b92",
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
  "id": "9d95b3d4-c4ef-4612-8884-692947c44212",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:01.156712Z",
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
  "challenge_id": "4be890ef-d6ce-41ac-ae7e-af22516f7ad4",
  "expires_at": "2026-10-29T14:59:03.456503515Z",
  "resend_available_at": "2026-10-29T14:54:04.456503515Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674244615` → **200**

```json
{
  "phone": "+380674244615",
  "audience": "CLIENT",
  "code": "686343",
  "sent_at": "2026-10-29T14:54:03.459071385Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8d936c5b-abf0-4c4e-9b23-4416e1318570",
  "challenge_id": "4be890ef-d6ce-41ac-ae7e-af22516f7ad4",
  "otp_code": "686343"
}
```

```json
{
  "client_id": "1db4d356-4e2e-47d6-89a6-04e5ccbbb365",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T14:54:03.774182712Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "0d0cff59-e641-4e9b-8792-ba25759eba39",
  "quote_id": "9d95b3d4-c4ef-4612-8884-692947c44212",
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
  "correlation_id": "35345272-afde-4cc4-8272-cd31691c974d"
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
  "session_id": "4eacb7ea-3499-4564-a65f-4a739730d325",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NDQsImlhdCI6MTc5MzI4NTY0NCwianRpIjoiMGMzMmYxNTItYjY4OS00MGY3LWI4NmYtYmJjYzU0MjE0OGY2Iiwic2lkIjoiNGVhY2I3ZWEtMzQ5OS00NTY0LWE2NWYtNGE3Mzk3MzBkMzI1In0.UFRARxeALRJ7zKiLyRSutH8aekwa04iypnbb8aXf0iw",
  "access_expires_at": "2026-10-29T15:09:04.646539946Z",
  "refresh_token": "P5TvfR1k8uem1jOD8VQxhbKdeLeXx0DPhKc4z0kicBE",
  "refresh_expires_at": "2026-10-30T02:54:04.646040783Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1db4d356-4e2e-47d6-89a6-04e5ccbbb365",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T14:54:03.774183Z",
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

`POST /api/admin/v1/client-deletions/1db4d356-4e2e-47d6-89a6-04e5ccbbb365/complete` → **200**

```json
{
  "command_id": "ded8ee29-b321-4909-9a67-cc03daca9a7c",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1db4d356-4e2e-47d6-89a6-04e5ccbbb365",
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
  "correlation_id": "108cfe94-46a8-4bb8-89d3-87c5c0d56b2f"
}
```

Done: client 1db4d356-4e2e-47d6-89a6-04e5ccbbb365 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665239744",
  "device_ref": "sandbox-12679"
}
```

```json
{
  "challenge_id": "6a441d7a-09f4-4acc-a506-99d506f93355",
  "expires_at": "2026-10-29T14:59:05.818139998Z",
  "resend_available_at": "2026-10-29T14:54:06.818139998Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665239744` → **200**

```json
{
  "phone": "+380665239744",
  "audience": "CLIENT",
  "code": "836469",
  "sent_at": "2026-10-29T14:54:05.821423227Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6a441d7a-09f4-4acc-a506-99d506f93355",
  "code": "836469",
  "device_ref": "sandbox-12679"
}
```

```json
{
  "session_id": "ed78005d-9ec3-4e56-a81b-2c74ef5ad9ff",
  "subject": {
    "type": "CLIENT",
    "id": "117b7c46-af98-4792-8e61-2311c40790e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTdiN2M0Ni1hZjk4LTQ3OTItOGU2MS0yMzExYzQwNzkwZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTQ2LCJpYXQiOjE3OTMyODU2NDYsImp0aSI6ImFkZDM1YWYzLTQ0NzEtNDI3My05OGVkLTY2YzRkNjgwY2NkZCIsInNpZCI6ImVkNzgwMDVkLTllYzMtNGU1Ni1hODFiLTJjNzRlZjVhZDlmZiJ9.0eytE7r2X9OCPh2L149LcWX9u3bJrcX0Y0tKhIbsJus",
  "access_expires_at": "2026-10-29T15:09:06.133119226Z",
  "refresh_token": "IMTJQvUohhCAVu7TYauyUTOjTdQBh44JeCUWbjP_JCE",
  "refresh_expires_at": "2026-11-28T14:54:06.132567345Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "117b7c46-af98-4792-8e61-2311c40790e4",
  "session_id": "ed78005d-9ec3-4e56-a81b-2c74ef5ad9ff",
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
  "session_id": "aa44cda4-b7fc-49db-98fd-7b84d8a7d166",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NDYsImlhdCI6MTc5MzI4NTY0NiwianRpIjoiZDc3MTIyYTUtZjdjNS00OTNjLWI1MjUtZjFhMjIzYTNiYTY1Iiwic2lkIjoiYWE0NGNkYTQtYjdmYy00OWRiLTk4ZmQtN2I4NGQ4YTdkMTY2In0.iD3_YG0XP7N3BSlfzbiUDv76lz-LVyzucek9buY_ZF0",
  "access_expires_at": "2026-10-29T15:09:06.978875806Z",
  "refresh_token": "7_coAIxLNhY9oO19O4YTCvJYcJW9pjSk-fkth-6ffTY",
  "refresh_expires_at": "2026-10-30T02:54:06.97834338Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5239744&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "117b7c46-af98-4792-8e61-2311c40790e4",
      "phone": "+380665239744",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T14:54:06.130873Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/117b7c46-af98-4792-8e61-2311c40790e4` → **200**

```json
{
  "client": {
    "id": "117b7c46-af98-4792-8e61-2311c40790e4",
    "phone": "+380665239744",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:54:06.130873Z",
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

`POST /api/admin/v1/clients/117b7c46-af98-4792-8e61-2311c40790e4/block` → **400**

```json
{
  "command_id": "e1a4dfa8-c33b-4d49-9eef-418a36b4720f",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/117b7c46-af98-4792-8e61-2311c40790e4/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ae42d115-fec7-42d9-ab21-0f8c677086eb",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/117b7c46-af98-4792-8e61-2311c40790e4/block` → **200**

```json
{
  "command_id": "855dd932-8f8b-4d87-aec2-8922b9fda903",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "117b7c46-af98-4792-8e61-2311c40790e4",
  "phone": "+380665239744",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T14:54:06.130873Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T14:54:08.167937Z",
    "by": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
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
  "correlation_id": "eefbcfde-09e2-426e-a275-13c46f536572"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665239744",
  "device_ref": "sandbox-15471"
}
```

```json
{
  "challenge_id": "72d9a0b0-0f6e-4ebb-b549-d2118180f3ff",
  "expires_at": "2026-10-29T14:59:10.754401763Z",
  "resend_available_at": "2026-10-29T14:54:11.754401763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665239744` → **200**

```json
{
  "phone": "+380665239744",
  "audience": "CLIENT",
  "code": "986779",
  "sent_at": "2026-10-29T14:54:10.756907426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "72d9a0b0-0f6e-4ebb-b549-d2118180f3ff",
  "code": "986779",
  "device_ref": "sandbox-15471"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "cdc00149-64e5-4fae-8e66-ceb08b299bf2"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/117b7c46-af98-4792-8e61-2311c40790e4` → **200**

```json
{
  "client": {
    "id": "117b7c46-af98-4792-8e61-2311c40790e4",
    "phone": "+380665239744",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T14:54:06.130873Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T14:54:08.167937Z",
      "by": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
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

`POST /api/admin/v1/clients/117b7c46-af98-4792-8e61-2311c40790e4/unblock` → **200**

```json
{
  "command_id": "b23c12b9-f37d-46b8-aa26-514b250e5786",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "117b7c46-af98-4792-8e61-2311c40790e4",
  "phone": "+380665239744",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T14:54:06.130873Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665239744",
  "device_ref": "sandbox-14617"
}
```

```json
{
  "challenge_id": "e7cf5e1e-09b5-443e-8f71-cbdcfa2c216f",
  "expires_at": "2026-10-29T14:59:13.97030137Z",
  "resend_available_at": "2026-10-29T14:54:14.97030137Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665239744` → **200**

```json
{
  "phone": "+380665239744",
  "audience": "CLIENT",
  "code": "444271",
  "sent_at": "2026-10-29T14:54:13.972870321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7cf5e1e-09b5-443e-8f71-cbdcfa2c216f",
  "code": "444271",
  "device_ref": "sandbox-14617"
}
```

```json
{
  "session_id": "6968fdc6-7f6e-40d5-985c-bddcd7503e93",
  "subject": {
    "type": "CLIENT",
    "id": "117b7c46-af98-4792-8e61-2311c40790e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTdiN2M0Ni1hZjk4LTQ3OTItOGU2MS0yMzExYzQwNzkwZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTU0LCJpYXQiOjE3OTMyODU2NTQsImp0aSI6IjQ1ZmU1ZWVkLTdkNDktNDZhZC1iOWEyLWQ5YzEzOWM4YzBjMCIsInNpZCI6IjY5NjhmZGM2LTdmNmUtNDBkNS05ODVjLWJkZGNkNzUwM2U5MyJ9.X-VC669jWi6duaxLT1NYG38NV8d15f22ZZ6vxlp-oX4",
  "access_expires_at": "2026-10-29T15:09:14.277180208Z",
  "refresh_token": "Hhfqseb-aDutuW9mQkgfD0Nq3gcwJJR1YRtAuBYI8gg",
  "refresh_expires_at": "2026-11-28T14:54:14.276655978Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "117b7c46-af98-4792-8e61-2311c40790e4",
  "session_id": "6968fdc6-7f6e-40d5-985c-bddcd7503e93",
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
  "phone": "+380669826006",
  "device_ref": "sandbox-1407"
}
```

```json
{
  "challenge_id": "00e0ca2a-fb92-4260-a4c7-10ed61e3073e",
  "expires_at": "2026-10-29T14:59:14.846772027Z",
  "resend_available_at": "2026-10-29T14:54:15.846772027Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669826006` → **200**

```json
{
  "phone": "+380669826006",
  "audience": "CLIENT",
  "code": "533286",
  "sent_at": "2026-10-29T14:54:14.849675375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00e0ca2a-fb92-4260-a4c7-10ed61e3073e",
  "code": "533286",
  "device_ref": "sandbox-1407"
}
```

```json
{
  "session_id": "35b21ec3-3ea4-4dcc-b42f-a156e05eb684",
  "subject": {
    "type": "CLIENT",
    "id": "ba2be875-b5f1-46cf-bdb8-8f93bfcec135"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYTJiZTg3NS1iNWYxLTQ2Y2YtYmRiOC04ZjkzYmZjZWMxMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTU1LCJpYXQiOjE3OTMyODU2NTUsImp0aSI6IjY1OTI0Mzc4LTJmZTMtNDM1Zi05YjE5LTk3ZjM1YjI4NjBjMCIsInNpZCI6IjM1YjIxZWMzLTNlYTQtNGRjYy1iNDJmLWExNTZlMDVlYjY4NCJ9.kdrVyAyAt8vda8TqH1eiDQsCRTn4kgmftF4sLKpLNpc",
  "access_expires_at": "2026-10-29T15:09:15.153039924Z",
  "refresh_token": "qQoEOA_Rh43qFFgCeOqLBkIXMoW_Rrp_L-5KG8pr26M",
  "refresh_expires_at": "2026-11-28T14:54:15.152382846Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "be7ce7e6-2a0f-402f-972c-4615405bfa36",
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
  "id": "75e88301-883f-4584-ad4f-1138f6b0fd14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:15.435983Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 26f5be8c-1f86-4d22-9a79-9e2e7c9c821b) → **201**

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
  "session_id": "6ccc41b6-1018-4648-bd22-9db11081c97f",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NTYsImlhdCI6MTc5MzI4NTY1NiwianRpIjoiNDRhNTMyOWItMzIxMS00MmNmLWI4OWEtNjliNDZlMDFmMDNjIiwic2lkIjoiNmNjYzQxYjYtMTAxOC00NjQ4LWJkMjItOWRiMTEwODFjOTdmIn0.YOzt5LK2bsT9kv9_l6S2cG27cVRkAClrA1Z6Kypkd0Q",
  "access_expires_at": "2026-10-29T15:09:16.047367335Z",
  "refresh_token": "ZMMyDyIdjGdOxGqj4aFBEo6UAP9EhPuhjEi3rRq5ek4",
  "refresh_expires_at": "2026-10-30T02:54:16.046869174Z",
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
  "session_id": "db064036-9bfc-47f2-9bb3-9d75d9046ffa",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NTYsImlhdCI6MTc5MzI4NTY1NiwianRpIjoiNTJjYjYxMzktOTNiOC00YWQxLTljYjEtY2FjMmM1YWJkZWI3Iiwic2lkIjoiZGIwNjQwMzYtOWJmYy00N2YyLTliYjMtOWQ3NWQ5MDQ2ZmZhIn0._weFdwZrb2SFoEX_QlKCd5_JCGTgSxr_S25CM3QkXuE",
  "access_expires_at": "2026-10-29T15:09:16.621538362Z",
  "refresh_token": "2Aim1XYAtRZpLTtUX9tUJEavZuwOd4u4I_E1zXmOeI4",
  "refresh_expires_at": "2026-10-30T02:54:16.620993774Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/09342112-6264-4e95-8b77-8fcf4f586f28/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:54:15.721736Z",
      "actor": {
        "type": "CLIENT",
        "id": "ba2be875-b5f1-46cf-bdb8-8f93bfcec135",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "09342112-6264-4e95-8b77-8fcf4f586f28",
        "quote_id": "75e88301-883f-4584-ad4f-1138f6b0fd14",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "26f5be8c-1f86-4d22-9a79-9e2e7c9c821b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:54:15.724145Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "09342112-6264-4e95-8b77-8fcf4f586f28",
        "attempt_id": "b42a9eec-3657-4126-8df8-a95fccc5bf9f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "26f5be8c-1f86-4d22-9a79-9e2e7c9c821b"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T14:54:15.731149Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "09342112-6264-4e95-8b77-8fcf4f586f28",
        "attempt_id": "b42a9eec-3657-4126-8df8-a95fccc5bf9f"
      },
      "correlation_id": "26f5be8c-1f86-4d22-9a79-9e2e7c9c821b"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "b42a9eec-3657-4126-8df8-a95fccc5bf9f",
        "generation": 1,
        "started_at": "2026-10-29T14:54:15.723107Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T14:54:15.731149Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T14:54:15.724928Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/26f5be8c-1f86-4d22-9a79-9e2e7c9c821b` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "09342112-6264-4e95-8b77-8fcf4f586f28:0",
      "order_id": "09342112-6264-4e95-8b77-8fcf4f586f28",
      "at": "2026-10-29T14:54:15.721736Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "09342112-6264-4e95-8b77-8fcf4f586f28:1",
      "order_id": "09342112-6264-4e95-8b77-8fcf4f586f28",
      "at": "2026-10-29T14:54:15.724145Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "09342112-6264-4e95-8b77-8fcf4f586f28:2",
      "order_id": "09342112-6264-4e95-8b77-8fcf4f586f28",
      "at": "2026-10-29T14:54:15.731149Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/48e8021a-d693-4816-89ff-a44015dfc0a6` → **200**

```json
{
  "found": []
}
```

Done: request 26f5be8c-1f86-4d22-9a79-9e2e7c9c821b — order 09342112-6264-4e95-8b77-8fcf4f586f28 found by its id.

`GET /api/rider/v1/orders/09342112-6264-4e95-8b77-8fcf4f586f28` → **200**

```json
{
  "id": "09342112-6264-4e95-8b77-8fcf4f586f28",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ba2be875-b5f1-46cf-bdb8-8f93bfcec135",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:54:15.72115Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/09342112-6264-4e95-8b77-8fcf4f586f28/cancel` → **200**

```json
{
  "command_id": "dae079b6-f371-41b6-82de-d72b2a34c57e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "09342112-6264-4e95-8b77-8fcf4f586f28",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ba2be875-b5f1-46cf-bdb8-8f93bfcec135",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:54:15.72115Z",
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
  "phone": "+380637934225",
  "device_ref": "sandbox-18186"
}
```

```json
{
  "challenge_id": "8b49a422-ef78-4c57-8d3a-17093fe7a324",
  "expires_at": "2026-10-29T14:59:18.35434755Z",
  "resend_available_at": "2026-10-29T14:54:19.35434755Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637934225` → **200**

```json
{
  "phone": "+380637934225",
  "audience": "CLIENT",
  "code": "021675",
  "sent_at": "2026-10-29T14:54:18.356974401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b49a422-ef78-4c57-8d3a-17093fe7a324",
  "code": "021675",
  "device_ref": "sandbox-18186"
}
```

```json
{
  "session_id": "7b75bfa2-d77b-4d48-a92e-4d61e9897101",
  "subject": {
    "type": "CLIENT",
    "id": "9537987f-399a-4678-8192-8795e0d3b3f1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTM3OTg3Zi0zOTlhLTQ2NzgtODE5Mi04Nzk1ZTBkM2IzZjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTU4LCJpYXQiOjE3OTMyODU2NTgsImp0aSI6ImMzMWM2MTkzLTNiM2QtNGE1NS05YTZkLThmMGQ3MzVlOTMwYiIsInNpZCI6IjdiNzViZmEyLWQ3N2ItNGQ0OC1hOTJlLTRkNjFlOTg5NzEwMSJ9.nrNmJV3jDuHK0oDXAwpEGyPNs_iOYNAURoNu40GDkGU",
  "access_expires_at": "2026-10-29T15:09:18.676464568Z",
  "refresh_token": "c1JNvOQLguDO9sS8QbKoU0MvuworlKWaIFMGYb96bto",
  "refresh_expires_at": "2026-11-28T14:54:18.675883443Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "f98619d4-d2ba-4b13-8ed9-24bd972560b0",
  "expires_at": "2026-10-29T14:59:20.965491026Z",
  "resend_available_at": "2026-10-29T14:54:21.965491026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637934225` → **200**

```json
{
  "phone": "+380637934225",
  "audience": "CLIENT",
  "code": "694760",
  "sent_at": "2026-10-29T14:54:20.967985938Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "9d31bd05-d2b2-471a-a310-93cdc321f3fe",
  "challenge_id": "f98619d4-d2ba-4b13-8ed9-24bd972560b0",
  "otp_code": "694760"
}
```

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73` → **200**

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73` → **200**

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73` → **200**

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73` → **200**

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73` → **200**

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73` → **200**

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73` → **200**

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "PENDING",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73` → **200**

```json
{
  "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
  "state": "READY",
  "created_at": "2026-10-29T14:54:21.283439Z",
  "ready_at": "2026-10-29T14:54:29.722103Z",
  "expires_at": "2026-11-05T14:54:29.722103Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630969006",
  "device_ref": "sandbox-12559"
}
```

```json
{
  "challenge_id": "f54aadc7-e585-415f-8e90-ee4147e42e70",
  "expires_at": "2026-10-29T14:59:30.866972773Z",
  "resend_available_at": "2026-10-29T14:54:31.866972773Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630969006` → **200**

```json
{
  "phone": "+380630969006",
  "audience": "CLIENT",
  "code": "832152",
  "sent_at": "2026-10-29T14:54:30.869748019Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f54aadc7-e585-415f-8e90-ee4147e42e70",
  "code": "832152",
  "device_ref": "sandbox-12559"
}
```

```json
{
  "session_id": "dc642171-e730-4d1d-a526-6a9c360c5907",
  "subject": {
    "type": "CLIENT",
    "id": "2e3d5e2f-b589-48d3-b61f-4154f018362e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZTNkNWUyZi1iNTg5LTQ4ZDMtYjYxZi00MTU0ZjAxODM2MmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTcxLCJpYXQiOjE3OTMyODU2NzEsImp0aSI6Ijk5MjY0NDc4LTcxZGQtNGVhNS1iNDRlLTA1OWQwZjgxMDgwOCIsInNpZCI6ImRjNjQyMTcxLWU3MzAtNGQxZC1hNTI2LTZhOWMzNjBjNTkwNyJ9.D4gt2WwRZ7HKowtFlJvjWaHhXECAjBzwJV2T-bd-AFk",
  "access_expires_at": "2026-10-29T15:09:31.184522769Z",
  "refresh_token": "6tp1Dfrmg9maroGsT3lqaoF-slzFjgmrqKBenio5ITY",
  "refresh_expires_at": "2026-11-28T14:54:31.184018899Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/1f53d75d-3cbe-4ca9-a789-16a3269ebb73/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c705f3a8-ccd0-4461-a635-685881449af6"
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
  "session_id": "65798b2f-f625-4c69-a616-6b7536ffc3a0",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NzIsImlhdCI6MTc5MzI4NTY3MiwianRpIjoiOWJkMDRlYzItNDQ0Ni00NWVjLTg5NzEtZWVlZDc0YzM5ZjUyIiwic2lkIjoiNjU3OThiMmYtZjYyNS00YzY5LWE2MTYtNmI3NTM2ZmZjM2EwIn0.d7AGdt6KRx58V-xT_veNDyaGdN5U6cAot5tWRSl_Xx0",
  "access_expires_at": "2026-10-29T15:09:32.06516273Z",
  "refresh_token": "nyicgzN-rqbmi7Ca1kMMpYS2yxoGOsrfHVbX0W00hfs",
  "refresh_expires_at": "2026-10-30T02:54:32.064586814Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9537987f-399a-4678-8192-8795e0d3b3f1",
  "session_id": "7b75bfa2-d77b-4d48-a92e-4d61e9897101",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/9537987f-399a-4678-8192-8795e0d3b3f1/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "1f53d75d-3cbe-4ca9-a789-16a3269ebb73",
      "state": "READY",
      "created_at": "2026-10-29T14:54:21.283439Z",
      "ready_at": "2026-10-29T14:54:29.722103Z",
      "expires_at": "2026-11-05T14:54:29.722103Z",
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
  "device_ref": "sandbox-31620"
}
```

```json
{
  "challenge_id": "bbfb5c24-29fb-4e4a-bc66-a2ccbbd0ffe1",
  "expires_at": "2026-10-29T14:59:32.94904322Z",
  "resend_available_at": "2026-10-29T14:54:33.94904322Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "420990",
  "sent_at": "2026-10-29T14:54:32.951735965Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bbfb5c24-29fb-4e4a-bc66-a2ccbbd0ffe1",
  "code": "420990",
  "device_ref": "sandbox-31620"
}
```

```json
{
  "session_id": "41ad812e-eccf-489e-8c38-0332d06e4adb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjU3MywiaWF0IjoxNzkzMjg1NjczLCJqdGkiOiJmMTQzMTdjYy05NGM5LTRhZGItOGZhYS1mN2I1ZGU0ODM0ZWIiLCJzaWQiOiI0MWFkODEyZS1lY2NmLTQ4OWUtOGMzOC0wMzMyZDA2ZTRhZGIifQ.5D3Ob03v9POHCnsMT0WM11HtJ0bgq9GK-3CZHSC3VkA",
  "access_expires_at": "2026-10-29T15:09:33.272415954Z",
  "refresh_token": "v0iLlryiOVQVmKMwcPCznybHOFBvezRgxLGHhZZaFAM",
  "refresh_expires_at": "2026-11-28T14:54:33.271842171Z",
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
  "device_ref": "sandbox-21229"
}
```

```json
{
  "challenge_id": "156c2a5d-2cf5-4b9b-a927-79c5c32948a8",
  "expires_at": "2026-10-29T14:59:33.854066894Z",
  "resend_available_at": "2026-10-29T14:54:34.854066894Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "801634",
  "sent_at": "2026-10-29T14:54:33.85667606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "156c2a5d-2cf5-4b9b-a927-79c5c32948a8",
  "code": "801634",
  "device_ref": "sandbox-21229"
}
```

```json
{
  "session_id": "e647c9f9-4755-4770-b01e-b3e05f4704e2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjU3NCwiaWF0IjoxNzkzMjg1Njc0LCJqdGkiOiI1OTE3NGY5Mi00N2JmLTRhOWQtYTFjZS02NGVlZGNmZGI3MjkiLCJzaWQiOiJlNjQ3YzlmOS00NzU1LTQ3NzAtYjAxZS1iM2UwNWY0NzA0ZTIifQ.XYtH7vXyKXWj8rIjsNpx4-CXvAVnFM_0yGsasLMMG1Q",
  "access_expires_at": "2026-10-29T15:09:34.184262652Z",
  "refresh_token": "udp9O44kV4ulhWyKaxvkHajkagNqOyGilV5um4r5G4g",
  "refresh_expires_at": "2026-11-28T14:54:34.183722532Z",
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
  "command_id": "a78cb1a2-47d7-449e-b3ff-fe210eed5317",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:54:34Z",
    "sequence": 1793285674755
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6aa296d5-f639-4092-906b-2b00939c2a67",
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
  "last_heartbeat_at": "2026-10-29T14:54:34.77535Z",
  "last_location_at": "2026-10-29T14:54:34.77535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-6383"
}
```

```json
{
  "challenge_id": "00b03081-2ac3-40e6-a7d5-fa19f141e190",
  "expires_at": "2026-10-29T14:59:35.064027517Z",
  "resend_available_at": "2026-10-29T14:54:36.064027517Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "147420",
  "sent_at": "2026-10-29T14:54:35.06700956Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00b03081-2ac3-40e6-a7d5-fa19f141e190",
  "code": "147420",
  "device_ref": "sandbox-6383"
}
```

```json
{
  "session_id": "9848676d-860e-4f90-8d51-c348ec79c369",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjU3NSwiaWF0IjoxNzkzMjg1Njc1LCJqdGkiOiJlOGQyYzI3MC0wOTZlLTQ0NGQtOWIxYy1hOGIxYTY5MGE1Y2IiLCJzaWQiOiI5ODQ4Njc2ZC04NjBlLTRmOTAtOGQ1MS1jMzQ4ZWM3OWMzNjkifQ.zjzUq1eK9awg4h6leC3j4KZFTgjFuqRxwVWgKufWhOw",
  "access_expires_at": "2026-10-29T15:09:35.411415164Z",
  "refresh_token": "D1TbxhMzGFEp-icW2qh3eKYjNH90C3h8FSzo-xZexHU",
  "refresh_expires_at": "2026-11-28T14:54:35.410914208Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f2b5fa9f-f737-4c4c-ac28-c0ddfc9701d8",
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
  "last_heartbeat_at": "2026-10-29T14:52:55.098586Z",
  "last_location_at": "2026-10-29T14:52:55.098586Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f2b5fa9f-f737-4c4c-ac28-c0ddfc9701d8/handover` → **200**

```json
{
  "command_id": "d44b064a-088d-46e2-8917-06d16d9f26a4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f2b5fa9f-f737-4c4c-ac28-c0ddfc9701d8",
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
  "last_heartbeat_at": "2026-10-29T14:52:55.098586Z",
  "last_location_at": "2026-10-29T14:52:55.098586Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f2b5fa9f-f737-4c4c-ac28-c0ddfc9701d8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:54:36Z",
    "sequence": 1793285676283
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f2b5fa9f-f737-4c4c-ac28-c0ddfc9701d8",
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
  "last_heartbeat_at": "2026-10-29T14:54:36.302848Z",
  "last_location_at": "2026-10-29T14:54:36.302848Z",
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
  "session_id": "ca5a1187-652e-4644-a152-ae8a9692a53c",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NzYsImlhdCI6MTc5MzI4NTY3NiwianRpIjoiODQwNmUxZGUtNTgwOC00YWVlLWFkYTctZjVlZjA0NjUzMzYxIiwic2lkIjoiY2E1YTExODctNjUyZS00NjQ0LWExNTItYWU4YTk2OTJhNTNjIn0.ZfxP7XktjBW_0ChlSXjmEGot4EUL-vWucAquTdJuHzU",
  "access_expires_at": "2026-10-29T15:09:36.88243447Z",
  "refresh_token": "0pUMNEYxvQTRfYdO_UiLpPR2UNZkw4P-bP9ibh437Hw",
  "refresh_expires_at": "2026-10-30T02:54:36.881871759Z",
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
  "session_id": "a674a544-1140-44e6-a82b-74639e9a74ad",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1NzcsImlhdCI6MTc5MzI4NTY3NywianRpIjoiMDI4ZTc1MzAtYTIwNy00YTg0LWE2OWQtZWQ5OWM5ODUyOWYxIiwic2lkIjoiYTY3NGE1NDQtMTE0MC00NGU2LWE4MmItNzQ2MzllOWE3NGFkIn0.vR9PM8rYqBzbHTPLfuyfB5jdRIz8ZQgk_6dA7RX8CxQ",
  "access_expires_at": "2026-10-29T15:09:37.459910261Z",
  "refresh_token": "JQ0DrVXmNE18_ugd3ALCGdEwB-DUj7Fzla5wtDMeAGs",
  "refresh_expires_at": "2026-10-30T02:54:37.45932101Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684977633",
  "device_ref": "sandbox-11397"
}
```

```json
{
  "challenge_id": "f2964cc3-4966-48ea-a592-d9ee889140f0",
  "expires_at": "2026-10-29T14:59:37.750072612Z",
  "resend_available_at": "2026-10-29T14:54:38.750072612Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684977633` → **200**

```json
{
  "phone": "+380684977633",
  "audience": "CLIENT",
  "code": "858353",
  "sent_at": "2026-10-29T14:54:37.752889959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2964cc3-4966-48ea-a592-d9ee889140f0",
  "code": "858353",
  "device_ref": "sandbox-11397"
}
```

```json
{
  "session_id": "5cc7bd9e-2282-48cc-b6b2-5df390c80689",
  "subject": {
    "type": "CLIENT",
    "id": "e1c90514-61a2-4948-8570-f830fc7716a0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMWM5MDUxNC02MWEyLTQ5NDgtODU3MC1mODMwZmM3NzE2YTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTc4LCJpYXQiOjE3OTMyODU2NzgsImp0aSI6IjZjMTkwNGMzLTkxZTUtNDU3NS04YTY3LWU5NjQyMDUwMTk3YyIsInNpZCI6IjVjYzdiZDllLTIyODItNDhjYy1iNmIyLTVkZjM5MGM4MDY4OSJ9.L7qvJKNt73wGiwgvZUbf3C3Z3U0pCI5j5gMmeQEX-40",
  "access_expires_at": "2026-10-29T15:09:38.070725289Z",
  "refresh_token": "sE3xhx70fiy7VZltc8T3344lHa9IWWmEpclFWW4qIlc",
  "refresh_expires_at": "2026-11-28T14:54:38.070236376Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e85578c2-aa44-4758-afef-daacc23c78ce",
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
  "id": "94deaf6a-ed94-420f-8d67-c728e5e38ad4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:38.361229Z",
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
  "command_id": "2cf5fd2c-5e5c-4d23-9189-a8cc782ceb53",
  "quote_id": "94deaf6a-ed94-420f-8d67-c728e5e38ad4",
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
  "id": "05358a88-9df7-478e-ad64-3b1803323a54",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e1c90514-61a2-4948-8570-f830fc7716a0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:54:38.665045Z",
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
    "id": "84332e3a-e70e-493f-b2c8-ed5ff87ab53c",
    "order_id": "05358a88-9df7-478e-ad64-3b1803323a54",
    "expires_at": "2026-10-29T14:54:53.668161Z",
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

`POST /api/driver/v1/offers/84332e3a-e70e-493f-b2c8-ed5ff87ab53c/reject` → **204**

```json
{
  "command_id": "9388f5b6-fae9-4ac1-9fbb-966f276874ce"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2a06fcc9-6fb0-4b42-9b6c-af299f1dbec6",
    "order_id": "05358a88-9df7-478e-ad64-3b1803323a54",
    "expires_at": "2026-10-29T14:54:54.274395Z",
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

`POST /api/driver/v1/offers/2a06fcc9-6fb0-4b42-9b6c-af299f1dbec6/accept` → **200**

```json
{
  "command_id": "eb4e37b1-a056-4b4d-91dc-4d65daa32c6c"
}
```

```json
{
  "id": "1a13a4b1-75a9-4c15-8983-3b18dac1323e",
  "order_id": "05358a88-9df7-478e-ad64-3b1803323a54",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "041160a5-1194-4410-887a-2af2bbcb5d67",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/05358a88-9df7-478e-ad64-3b1803323a54/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:54:38.665451Z",
      "actor": {
        "type": "CLIENT",
        "id": "e1c90514-61a2-4948-8570-f830fc7716a0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "05358a88-9df7-478e-ad64-3b1803323a54",
        "quote_id": "94deaf6a-ed94-420f-8d67-c728e5e38ad4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "75f5ec50-92b7-4c26-8ce3-a07ad33a4dc5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:54:38.667379Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "05358a88-9df7-478e-ad64-3b1803323a54",
        "attempt_id": "98daefc9-6816-4cb9-9867-c75fffc372b4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "75f5ec50-92b7-4c26-8ce3-a07ad33a4dc5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:54:38.671024Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "84332e3a-e70e-493f-b2c8-ed5ff87ab53c",
        "order_id": "05358a88-9df7-478e-ad64-3b1803323a54",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "75f5ec50-92b7-4c26-8ce3-a07ad33a4dc5"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T14:54:39.273351Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "84332e3a-e70e-493f-b2c8-ed5ff87ab53c",
        "order_id": "05358a88-9df7-478e-ad64-3b1803323a54"
      },
      "correlation_id": "8432cf69-3a5d-4938-81fc-d503a5da45aa"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 05358a88-9df7-478e-ad64-3b1803323a54 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/05358a88-9df7-478e-ad64-3b1803323a54` → **200**

```json
{
  "id": "05358a88-9df7-478e-ad64-3b1803323a54",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e1c90514-61a2-4948-8570-f830fc7716a0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1a13a4b1-75a9-4c15-8983-3b18dac1323e",
    "order_id": "05358a88-9df7-478e-ad64-3b1803323a54",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "041160a5-1194-4410-887a-2af2bbcb5d67",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:54:38.665045Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/05358a88-9df7-478e-ad64-3b1803323a54/cancel` → **200**

```json
{
  "command_id": "8e014c87-ae58-4be1-a94f-b5c1c60b5f4c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "05358a88-9df7-478e-ad64-3b1803323a54",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e1c90514-61a2-4948-8570-f830fc7716a0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "1a13a4b1-75a9-4c15-8983-3b18dac1323e",
    "order_id": "05358a88-9df7-478e-ad64-3b1803323a54",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "041160a5-1194-4410-887a-2af2bbcb5d67",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:54:38.665045Z",
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
  "session_id": "6aa296d5-f639-4092-906b-2b00939c2a67",
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
  "last_heartbeat_at": "2026-10-29T14:54:34.77535Z",
  "last_location_at": "2026-10-29T14:54:34.77535Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6aa296d5-f639-4092-906b-2b00939c2a67/close` → **200**

```json
{
  "command_id": "5b3576e2-268e-43bb-a67a-8648fad9cb42",
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
  "session_id": "f2b5fa9f-f737-4c4c-ac28-c0ddfc9701d8",
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
  "last_heartbeat_at": "2026-10-29T14:54:36.302848Z",
  "last_location_at": "2026-10-29T14:54:36.302848Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2b5fa9f-f737-4c4c-ac28-c0ddfc9701d8/close` → **200**

```json
{
  "command_id": "f53457a4-45fd-4d4b-806e-db606f433e13",
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
  "session_id": "5e5ea0db-62bc-4481-8466-86661c00ab88",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY1ODIsImlhdCI6MTc5MzI4NTY4MiwianRpIjoiYzA1ODI0ZTctYWQzZS00M2U5LWI2NWUtNmE2MmVjMzVmYTk0Iiwic2lkIjoiNWU1ZWEwZGItNjJiYy00NDgxLTg0NjYtODY2NjFjMDBhYjg4In0.S8B_Dl-XHl1v9XUi6UyXtEPHDsfwT2IMI1VfNHIcPgw",
  "access_expires_at": "2026-10-29T15:09:42.347061574Z",
  "refresh_token": "Yby6eKSK4dYH-UbxkbySW5HYIyvp5EVMOdaBspV9hXw",
  "refresh_expires_at": "2026-10-30T02:54:42.346523839Z",
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
  "command_id": "c3766903-4485-4cd8-8d80-deb6ef7c878f",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T14:54:42.952765Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "bb996c37-de11-4c4f-b7b5-a95e0fb23195",
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
  "correlation_id": "d37c366b-2579-4ad9-ac0b-c4275be0a9c2"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "9f718266-36ec-46bf-8a18-848c9448aeb4",
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
  "correlation_id": "11acb15a-d574-457e-9a84-17e943ebd6d5"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634909911",
  "device_ref": "sandbox-23967"
}
```

```json
{
  "challenge_id": "43f4c750-8e96-4900-9eee-44854a1d9bb3",
  "expires_at": "2026-10-29T14:59:43.841989412Z",
  "resend_available_at": "2026-10-29T14:54:44.841989412Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634909911` → **200**

```json
{
  "phone": "+380634909911",
  "audience": "CLIENT",
  "code": "995142",
  "sent_at": "2026-10-29T14:54:43.844905526Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43f4c750-8e96-4900-9eee-44854a1d9bb3",
  "code": "995142",
  "device_ref": "sandbox-23967"
}
```

```json
{
  "session_id": "994b9c0d-25b6-4510-a36b-59150023fd8d",
  "subject": {
    "type": "CLIENT",
    "id": "a6285b71-0e2d-4b23-bf3c-4a2ecdd250af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjI4NWI3MS0wZTJkLTRiMjMtYmYzYy00YTJlY2RkMjUwYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTg0LCJpYXQiOjE3OTMyODU2ODQsImp0aSI6ImM3OWVhOGQzLTU2Y2EtNDcyNS04ZmQxLTE1ZGNkMmEyODA2OCIsInNpZCI6Ijk5NGI5YzBkLTI1YjYtNDUxMC1hMzZiLTU5MTUwMDIzZmQ4ZCJ9.lsAayQOcSDRFO5c9zlnw6HYEgDHY8fnnzrVEc9cNJJM",
  "access_expires_at": "2026-10-29T15:09:44.172156563Z",
  "refresh_token": "8TDv3wnx4fYEjjmGTplt6vWQlGvMr5HDd3zi4eu7Vg8",
  "refresh_expires_at": "2026-11-28T14:54:44.171525553Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ebb7c0ed-b412-4c0a-8291-9bedc2314876",
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
  "id": "91c0c15a-92ce-475d-ada4-ae2be3edca45",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:44.466541Z",
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
  "command_id": "0709868f-9141-4957-ae46-f02fb6f3bfce",
  "quote_id": "91c0c15a-92ce-475d-ada4-ae2be3edca45",
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
  "correlation_id": "5a4bd624-522a-41e6-b2a2-42edd9277176"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "319531d2-d3e6-4604-8823-5eb62a49bf82",
  "quote_id": "91c0c15a-92ce-475d-ada4-ae2be3edca45",
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
  "id": "c5d23f6a-a6f7-4d3b-a103-f596ec9f6e9f",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6285b71-0e2d-4b23-bf3c-4a2ecdd250af",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:54:45.073667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c5d23f6a-a6f7-4d3b-a103-f596ec9f6e9f/cancel` → **200**

```json
{
  "command_id": "cd6b717e-bb36-457f-858a-e6f84de8d169",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c5d23f6a-a6f7-4d3b-a103-f596ec9f6e9f",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a6285b71-0e2d-4b23-bf3c-4a2ecdd250af",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:54:45.073667Z",
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
  "command_id": "f30049d3-ea61-46d0-80ed-25c10231190f",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T14:54:45.711544Z"
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
      "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T14:54:45.711544Z"
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
  "device_ref": "sandbox-11470"
}
```

```json
{
  "challenge_id": "a20456c7-924c-435b-bac4-b1ec0152ad2e",
  "expires_at": "2026-10-29T14:59:46.607683804Z",
  "resend_available_at": "2026-10-29T14:54:47.607683804Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "001642",
  "sent_at": "2026-10-29T14:54:46.610813414Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a20456c7-924c-435b-bac4-b1ec0152ad2e",
  "code": "001642",
  "device_ref": "sandbox-11470"
}
```

```json
{
  "session_id": "00a869c1-8bee-49f0-b268-9f04c7e98c08",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjU4NiwiaWF0IjoxNzkzMjg1Njg2LCJqdGkiOiIwZjcxZDViNi00YmFkLTRkMDYtOTAyYy0yYTQ2NWJjMjU3NjYiLCJzaWQiOiIwMGE4NjljMS04YmVlLTQ5ZjAtYjI2OC05ZjA0YzdlOThjMDgifQ.04JetDTmFk-ErR1WknqsjSbOr-0Y2Xfl8PAFTCWO6mY",
  "access_expires_at": "2026-10-29T15:09:46.957196322Z",
  "refresh_token": "v9oBw4rrPZ387CSvOtW3MkuhshiGp8iXgdYOOa20RKY",
  "refresh_expires_at": "2026-11-28T14:54:46.956422824Z",
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
  "command_id": "f88df779-83a0-4d42-874e-93b766c6e84e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:54:47Z",
    "sequence": 1793285687584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:54:47.603408Z",
  "last_location_at": "2026-10-29T14:54:47.603408Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677959223",
  "device_ref": "sandbox-29943"
}
```

```json
{
  "challenge_id": "7b7f9607-79f0-4dcd-b757-e04ccc25bf77",
  "expires_at": "2026-10-29T14:59:47.891714849Z",
  "resend_available_at": "2026-10-29T14:54:48.891714849Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677959223` → **200**

```json
{
  "phone": "+380677959223",
  "audience": "CLIENT",
  "code": "865040",
  "sent_at": "2026-10-29T14:54:47.894233499Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b7f9607-79f0-4dcd-b757-e04ccc25bf77",
  "code": "865040",
  "device_ref": "sandbox-29943"
}
```

```json
{
  "session_id": "f0184700-9326-4f26-ab9d-97a988e81762",
  "subject": {
    "type": "CLIENT",
    "id": "8ec571bd-36d4-4081-bc8c-9c94fd1b8331"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWM1NzFiZC0zNmQ0LTQwODEtYmM4Yy05Yzk0ZmQxYjgzMzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NTg4LCJpYXQiOjE3OTMyODU2ODgsImp0aSI6ImM0ZjlmZThiLWE1NTAtNGI0Zi04ZmQ2LTAxMjU3NjI4NmRmNyIsInNpZCI6ImYwMTg0NzAwLTkzMjYtNGYyNi1hYjlkLTk3YTk4OGU4MTc2MiJ9.R6URXRzUSXruThLMzbUTypo5uElfkZii39W1k4tIPCE",
  "access_expires_at": "2026-10-29T15:09:48.215169829Z",
  "refresh_token": "qrmisbe0gMBY2VujjgOYXu83fqGBZyjTqHRhY1TZ4zM",
  "refresh_expires_at": "2026-11-28T14:54:48.214646961Z",
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
  "command_id": "5257246a-6e7f-4fec-9b00-c85b26248504",
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
  "id": "7cc11fda-dd2d-45ed-a9ef-5c5d87fc9968",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:59:48.800019Z",
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
  "command_id": "14997c60-4116-43dc-980e-3b62d896e7a2",
  "platform": "ANDROID",
  "token": "sandbox-driver-cace2d4d-4ab5-4c9c-bf84-7d81dc25fc0a"
}
```

```json
{
  "id": "ab473b33-86bf-4e79-9015-26079b5d559d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:54:49.108612Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "73e3365f-139d-4009-839f-d15d8128cd92",
  "platform": "ANDROID",
  "token": "sandbox-rider-c2c6a312-491a-4bd6-8f0b-3a185410fe13"
}
```

```json
{
  "id": "e95d02d8-ee1d-43d6-b7fa-6199d07ed7a3",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:54:49.403436Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "80127216-8649-4603-b6d2-a1e298a58ca7",
  "quote_id": "7cc11fda-dd2d-45ed-a9ef-5c5d87fc9968",
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
  "id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8ec571bd-36d4-4081-bc8c-9c94fd1b8331",
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
  "created_at": "2026-10-29T14:54:49.702755Z",
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
    "id": "db724613-9b59-4f74-86fd-1b07f7e8f332",
    "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
    "expires_at": "2026-10-29T14:55:04.706076Z",
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

`POST /api/driver/v1/offers/db724613-9b59-4f74-86fd-1b07f7e8f332/accept` → **200**

```json
{
  "command_id": "19f4f298-f1ac-49ca-b002-af375bee27ea"
}
```

```json
{
  "id": "ec7cafc6-d09e-4c83-89ea-cb51a18bcad0",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d949ba64-e7c9-4e84-953b-6e51b0d28640",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:54:49.677Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:54:50.166718433Z",
    "token_suffix": "25fc0a",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
      "order_version": "2",
      "event_id": "bc11081d-8774-424b-8e52-04f0ab221bf8",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677959223&after=2026-10-29T14:54:49.677Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380677959223&after=2026-10-29T14:54:49.677Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:54:51.171485461Z",
    "token_suffix": "10fe13",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
      "order_version": "3",
      "event_id": "0f3fc733-f0ef-4158-96c0-af52fa962df4",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6edcd149-8145-476f-8ed6-3199d415339b/messages` → **201**

```json
{
  "command_id": "cd3d15eb-c80e-4bf0-977b-e32232fabbfb",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "838ab1c2-75a6-463a-adb0-62d98bfc8f36",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T14:54:51.709638387Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d949ba64-e7c9-4e84-953b-6e51b0d28640",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "assignment_id": "ec7cafc6-d09e-4c83-89ea-cb51a18bcad0",
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

`POST /api/driver/v1/trips/d949ba64-e7c9-4e84-953b-6e51b0d28640/messages` → **201**

```json
{
  "command_id": "432ad17c-e21b-425e-bb91-74b9daa56448",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "bb29aff6-dba7-422a-8e2a-2fab3e1c2254",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T14:54:52.271920278Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6edcd149-8145-476f-8ed6-3199d415339b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d949ba64-e7c9-4e84-953b-6e51b0d28640/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677959223"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/54c2ccc8-372b-4d72-b372-09eb89956048/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:54:53Z",
    "sequence": 1793285693119
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:54:53.138193Z",
  "last_location_at": "2026-10-29T14:54:53.138193Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d949ba64-e7c9-4e84-953b-6e51b0d28640",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "assignment_id": "ec7cafc6-d09e-4c83-89ea-cb51a18bcad0",
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

`POST /api/driver/v1/trips/d949ba64-e7c9-4e84-953b-6e51b0d28640/arrive` → **200**

```json
{
  "command_id": "43d8d642-4056-4245-8439-959235d9d814",
  "expected_version": 0
}
```

```json
{
  "id": "d949ba64-e7c9-4e84-953b-6e51b0d28640",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "assignment_id": "ec7cafc6-d09e-4c83-89ea-cb51a18bcad0",
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
  "arrived_at": "2026-10-29T14:54:53.697326Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d949ba64-e7c9-4e84-953b-6e51b0d28640/start` → **200**

```json
{
  "command_id": "7726cb6a-8a28-41ed-905e-49556c3d5344",
  "expected_version": 1
}
```

```json
{
  "id": "d949ba64-e7c9-4e84-953b-6e51b0d28640",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "assignment_id": "ec7cafc6-d09e-4c83-89ea-cb51a18bcad0",
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
  "arrived_at": "2026-10-29T14:54:53.697326Z",
  "started_at": "2026-10-29T14:54:54.007947Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/54c2ccc8-372b-4d72-b372-09eb89956048/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:54:54Z",
    "sequence": 1793285694292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:54:54.311787Z",
  "last_location_at": "2026-10-29T14:54:54.311787Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d949ba64-e7c9-4e84-953b-6e51b0d28640/complete` → **200**

```json
{
  "command_id": "d1947ffe-8b59-4ac9-a3c3-91f5a50d9b28",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:54:54Z",
  "cash_received": true
}
```

```json
{
  "id": "d949ba64-e7c9-4e84-953b-6e51b0d28640",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "assignment_id": "ec7cafc6-d09e-4c83-89ea-cb51a18bcad0",
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
  "arrived_at": "2026-10-29T14:54:53.697326Z",
  "started_at": "2026-10-29T14:54:54.007947Z",
  "completed_at": "2026-10-29T14:54:54.618885Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6edcd149-8145-476f-8ed6-3199d415339b` → **200**

```json
{
  "id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8ec571bd-36d4-4081-bc8c-9c94fd1b8331",
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
    "id": "ec7cafc6-d09e-4c83-89ea-cb51a18bcad0",
    "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d949ba64-e7c9-4e84-953b-6e51b0d28640",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:54:49.702755Z",
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
    "id": "6edcd149-8145-476f-8ed6-3199d415339b",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:54:49.702755Z",
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
    "id": "d949ba64-e7c9-4e84-953b-6e51b0d28640",
    "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
    "order_short_number": 13,
    "created_at": "2026-10-29T14:54:50.311282Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "02df7bd4-03cf-402b-a5a8-54de948507d2",
    "order_id": "495f7d7b-6d2e-448c-914e-f395fe51dec2",
    "order_short_number": 8,
    "created_at": "2026-10-29T14:53:31.848293Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "baf913f5-25c9-4985-b443-14e85f49d23c",
    "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
    "order_short_number": 3,
    "created_at": "2026-10-29T14:52:45.691783Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2e4b0025-8601-4a41-a05f-b1663464d81f",
    "order_id": "32dcdd8e-9f97-4b38-9869-264b9e62ab31",
    "order_short_number": 2,
    "created_at": "2026-10-29T14:52:23.698949Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f4a978c6-5f2d-47cd-9b54-6799aa533f50",
    "order_id": "9c75bcb6-55ab-482e-b21e-f84f788efb12",
    "order_short_number": 1,
    "created_at": "2026-10-29T14:52:13.783981Z",
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

`GET /api/rider/v1/orders/6edcd149-8145-476f-8ed6-3199d415339b/tip` → **200**

```json
{
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
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
  "available_until": "2026-10-30T14:54:54.618885Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6edcd149-8145-476f-8ed6-3199d415339b/tip` → **201**

```json
{
  "command_id": "51cce5d0-e9fd-4450-ad68-f3b5f1e2c1ce",
  "amount_minor": 1100
}
```

```json
{
  "id": "896e901e-44fe-4f6e-a77a-c419e0ee9056",
  "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T14:54:59.687402Z"
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
  "session_id": "79b4f82d-1f64-44ef-b58b-a5307d995ef9",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MDAsImlhdCI6MTc5MzI4NTcwMCwianRpIjoiOWQxODFmNzctNmFlMC00NzNmLTllMDgtNDAxMGI3ZjgyNDIzIiwic2lkIjoiNzliNGY4MmQtMWY2NC00NGVmLWI1OGItYTUzMDdkOTk1ZWY5In0.Pn5CYJ_UJt3GAtApi5bfb7eLepx1z-ap-gr4dgQx6jQ",
  "access_expires_at": "2026-10-29T15:10:00.291870117Z",
  "refresh_token": "RKn41mxOuGtEDR2PFZVWVkBwzQPo0ux6qP5OvJrnMcE",
  "refresh_expires_at": "2026-10-30T02:55:00.291292397Z",
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
  "generated_at": "2026-10-29T14:55:00.594522781Z"
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
  "generated_at": "2026-10-29T14:55:00.911423308Z"
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
  "session_id": "ec4f08eb-ea94-413c-bba4-a2b9bc57d1af",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MDEsImlhdCI6MTc5MzI4NTcwMSwianRpIjoiN2RmZDA3MzAtM2VmMC00NzNjLTkzZjgtY2UwMzg2ZjM1OTU2Iiwic2lkIjoiZWM0ZjA4ZWItZWE5NC00MTNjLWJiYTQtYTJiOWJjNTdkMWFmIn0.M7k-DwSRROagwNIo1_n9DM3AtxjoLWDTyf1U5gRgkhs",
  "access_expires_at": "2026-10-29T15:10:01.485932948Z",
  "refresh_token": "94TyCmUadIYc7H7jaUNyMqAEh9kcHap0WfK3g9dtDFM",
  "refresh_expires_at": "2026-10-30T02:55:01.485341484Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6edcd149-8145-476f-8ed6-3199d415339b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:54:49.70334Z",
      "actor": {
        "type": "CLIENT",
        "id": "8ec571bd-36d4-4081-bc8c-9c94fd1b8331",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
        "quote_id": "7cc11fda-dd2d-45ed-a9ef-5c5d87fc9968",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "741ffe3d-0ee7-47b6-a21e-185c880ae61b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:54:49.705331Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
        "attempt_id": "d6b1e05c-431f-4e56-997f-70acc1515a97",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "741ffe3d-0ee7-47b6-a21e-185c880ae61b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:54:49.708183Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "db724613-9b59-4f74-86fd-1b07f7e8f332",
        "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "741ffe3d-0ee7-47b6-a21e-185c880ae61b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:54:50.31284Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "db724613-9b59-4f74-86fd-1b07f7e8f332",
        "order_id": "6edcd149-8145-476f-8ed6-3199d415339b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ec7cafc6-d09e-4c83-89ea-cb51a18bcad0"
      },
      "correlation_id": "37a72585-9fd2-41dd-8d17-7fd1564b7fc1"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T14:55:02.06977747Z",
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
      "last_location_at": "2026-10-29T14:54:54.311787Z",
      "order_id": null
    }
  ]
}
```

Done: order 6edcd149-8145-476f-8ed6-3199d415339b.

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
  "session_id": "65bc0940-fe6d-4100-b51c-85df4f7fdb10",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MDIsImlhdCI6MTc5MzI4NTcwMiwianRpIjoiYmQ4ODlkZWYtNTY4ZS00ZmJlLWFmNjctMDZmZDFhOThkNzIyIiwic2lkIjoiNjViYzA5NDAtZmU2ZC00MTAwLWI1MWMtODVkZjRmN2ZkYjEwIn0.s2q5jC-qBOVd9ykpOqGok_DJhKqWcaLxiws7KXBkMOw",
  "access_expires_at": "2026-10-29T15:10:02.680795658Z",
  "refresh_token": "z0W7djDWo__OHWmJIgvP75qvlczXsRD-IKwMT21-bGI",
  "refresh_expires_at": "2026-10-30T02:55:02.679508321Z",
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
  "command_id": "42e733de-bd41-44a8-928f-adfd5a737fcf",
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
  "timestamp": "2026-10-29T14:55:03.000+0000",
  "channel": {
    "id": "1730052000.434329271",
    "linkedid": "1730052000.434329271",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673470586"
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
  "timestamp": "2026-10-29T14:55:03.000+0000",
  "channel": {
    "id": "1730052000.434329271",
    "linkedid": "1730052000.434329271",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673470586"
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
  "session_id": "459d078a-a6ce-46e7-9b2f-8477d7db9f2a",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MDMsImlhdCI6MTc5MzI4NTcwMywianRpIjoiMGJjNjRiMmUtZGQzNi00YmRhLWJjZjMtY2NmNTQzNjg5NGJiIiwic2lkIjoiNDU5ZDA3OGEtYTZjZS00NmU3LTliMmYtODQ3N2Q3ZGI5ZjJhIn0.ZEAOm3Hb5j8R4ogzI3R90d0X9aWH-7slaBEyTSqgTgU",
  "access_expires_at": "2026-10-29T15:10:03.874188288Z",
  "refresh_token": "fJUDyBqzWzyzdyoxLMBF5pwREG3m-kqW1x9z-kShNbw",
  "refresh_expires_at": "2026-10-30T02:55:03.873496513Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "10d398da-7b98-4256-b695-462f6313238f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673470586",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:55:03Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/10d398da-7b98-4256-b695-462f6313238f/answer` → **200**

```json
{
  "command_id": "897ccb8f-6618-47de-ae83-5a75643cbae4"
}
```

```json
{
  "id": "10d398da-7b98-4256-b695-462f6313238f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673470586",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "order_ids": [],
  "started_at": "2026-10-29T14:55:03Z",
  "answered_at": "2026-10-29T14:55:04.482406Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.434329271",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "243bb043-955e-4bda-b4de-45ef7fd2f177",
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
  "id": "cf431b89-3f07-4cb2-949c-79416f30d05b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:04.810135Z",
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
  "command_id": "d556ddb1-5870-430f-a3fb-66010032b719",
  "quote_id": "cf431b89-3f07-4cb2-949c-79416f30d05b",
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
    "phone": "+380673470586"
  },
  "call_id": "10d398da-7b98-4256-b695-462f6313238f"
}
```

```json
{
  "id": "6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c",
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
  "created_at": "2026-10-29T14:55:05.117611Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673470586"
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
    "id": "1730052000.434329271",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "10d398da-7b98-4256-b695-462f6313238f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673470586",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [
        "6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c"
      ],
      "started_at": "2026-10-29T14:55:03Z",
      "answered_at": "2026-10-29T14:55:04.482406Z",
      "ended_at": "2026-10-29T14:55:05.441227Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "306a7ca9-5c88-43e4-a8bc-6166a7256858",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675295826",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [],
      "started_at": "2026-10-29T14:52:32.002073Z",
      "answered_at": "2026-10-29T14:52:32.36643Z",
      "ended_at": "2026-10-29T14:52:32.694387Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:52:39.710318Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c` → **200**

```json
{
  "id": "6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c",
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
  "created_at": "2026-10-29T14:55:05.117611Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673470586"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c` → **200**

```json
{
  "id": "6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c",
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
  "created_at": "2026-10-29T14:55:05.117611Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673470586"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c/cancel` → **200**

```json
{
  "command_id": "293e4299-c9bd-49be-a8ed-0a18b819ed08",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c",
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
  "created_at": "2026-10-29T14:55:05.117611Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673470586"
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

Done: call 10d398da-7b98-4256-b695-462f6313238f with order 6ea1fc02-9ca9-4acf-93ff-3ee9b8a47f0c.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14419"
}
```

```json
{
  "challenge_id": "cfcb0a48-7f77-425b-862c-00e12ca08ae7",
  "expires_at": "2026-10-29T15:00:06.73270473Z",
  "resend_available_at": "2026-10-29T14:55:07.73270473Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "161560",
  "sent_at": "2026-10-29T14:55:06.736061344Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cfcb0a48-7f77-425b-862c-00e12ca08ae7",
  "code": "161560",
  "device_ref": "sandbox-14419"
}
```

```json
{
  "session_id": "d2c9cc42-aab3-487b-8681-c01d4507bc9a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjYwNywiaWF0IjoxNzkzMjg1NzA3LCJqdGkiOiIxMDNjNDc2Ni1iMGNkLTQxNWUtODFkNi01ZDliZmFjNzcxYjYiLCJzaWQiOiJkMmM5Y2M0Mi1hYWIzLTQ4N2ItODY4MS1jMDFkNDUwN2JjOWEifQ.-JLUmN_04RdL7LY-ANsxJm7zjLqF_OOx_OQQSGFkhTo",
  "access_expires_at": "2026-10-29T15:10:07.057458629Z",
  "refresh_token": "LtjjKfJXqxJbB2FvbyblnLkrUhWrTmHY39aiJPzuu90",
  "refresh_expires_at": "2026-11-28T14:55:07.056554749Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:54:54.311787Z",
  "last_location_at": "2026-10-29T14:54:54.311787Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54c2ccc8-372b-4d72-b372-09eb89956048/handover` → **200**

```json
{
  "command_id": "9c015d81-3db7-41d0-a310-b29413c3252c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:54:54.311787Z",
  "last_location_at": "2026-10-29T14:54:54.311787Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54c2ccc8-372b-4d72-b372-09eb89956048/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:07Z",
    "sequence": 1793285707932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:55:07.951994Z",
  "last_location_at": "2026-10-29T14:55:07.951994Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662837676",
  "device_ref": "sandbox-10693"
}
```

```json
{
  "challenge_id": "89bbed43-4b55-436f-8281-badead88c582",
  "expires_at": "2026-10-29T15:00:08.235328003Z",
  "resend_available_at": "2026-10-29T14:55:09.235328003Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662837676` → **200**

```json
{
  "phone": "+380662837676",
  "audience": "CLIENT",
  "code": "817506",
  "sent_at": "2026-10-29T14:55:08.237859024Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89bbed43-4b55-436f-8281-badead88c582",
  "code": "817506",
  "device_ref": "sandbox-10693"
}
```

```json
{
  "session_id": "81aea31c-6936-4d42-a113-59f323cadcaf",
  "subject": {
    "type": "CLIENT",
    "id": "ada97377-5e91-4e5d-8572-02d724d8d135"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGE5NzM3Ny01ZTkxLTRlNWQtODU3Mi0wMmQ3MjRkOGQxMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjA4LCJpYXQiOjE3OTMyODU3MDgsImp0aSI6IjQ1OTY4NjEyLTg5MDAtNDExZi1iYWZiLTE4YWM1OTM5MTlmZiIsInNpZCI6IjgxYWVhMzFjLTY5MzYtNGQ0Mi1hMTEzLTU5ZjMyM2NhZGNhZiJ9.O2GnCGgARUHsv0NAGt8wTaclQQ5rlE4iVmo4GjrA3UQ",
  "access_expires_at": "2026-10-29T15:10:08.551406505Z",
  "refresh_token": "Pz8Gpvwbj2Yxs-ONAudTxb1OhMwpuvTk2UctHdCmZdw",
  "refresh_expires_at": "2026-11-28T14:55:08.550700776Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a8eb305f-1310-4bb6-bae5-4dfc73000b28",
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
  "id": "10e5d148-6b19-4e4d-961d-ce2adf30a751",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:08.841909Z",
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
  "command_id": "45c8d48c-daa8-43fc-8dfd-3b0cdbf59ab2",
  "quote_id": "10e5d148-6b19-4e4d-961d-ce2adf30a751",
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
  "id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ada97377-5e91-4e5d-8572-02d724d8d135",
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
  "created_at": "2026-10-29T14:55:09.150645Z",
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
    "id": "2bb7a5a0-107f-4cbf-b44e-61f12c11af77",
    "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
    "expires_at": "2026-10-29T14:55:24.154646Z",
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

`POST /api/driver/v1/offers/2bb7a5a0-107f-4cbf-b44e-61f12c11af77/accept` → **200**

```json
{
  "command_id": "b95f0689-1349-434c-8d65-3eb89c27633d"
}
```

```json
{
  "id": "d54eb309-a219-4500-a5c0-968ebf5adbdd",
  "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1e1f1927-622b-4dfc-88d9-7e48a134c95f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1e1f1927-622b-4dfc-88d9-7e48a134c95f",
  "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
  "assignment_id": "d54eb309-a219-4500-a5c0-968ebf5adbdd",
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

`POST /api/driver/v1/work-sessions/54c2ccc8-372b-4d72-b372-09eb89956048/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:10Z",
    "sequence": 1793285710318
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:55:10.33739Z",
  "last_location_at": "2026-10-29T14:55:10.33739Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1e1f1927-622b-4dfc-88d9-7e48a134c95f/arrive` → **200**

```json
{
  "command_id": "054a3e82-cc3b-41e4-8f89-82752c319362",
  "expected_version": 0
}
```

```json
{
  "id": "1e1f1927-622b-4dfc-88d9-7e48a134c95f",
  "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
  "assignment_id": "d54eb309-a219-4500-a5c0-968ebf5adbdd",
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
  "arrived_at": "2026-10-29T14:55:10.62992Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1e1f1927-622b-4dfc-88d9-7e48a134c95f/start` → **200**

```json
{
  "command_id": "93879565-2336-4d34-ac3d-134231cbc2f2",
  "expected_version": 1
}
```

```json
{
  "id": "1e1f1927-622b-4dfc-88d9-7e48a134c95f",
  "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
  "assignment_id": "d54eb309-a219-4500-a5c0-968ebf5adbdd",
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
  "arrived_at": "2026-10-29T14:55:10.62992Z",
  "started_at": "2026-10-29T14:55:10.947313Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/54c2ccc8-372b-4d72-b372-09eb89956048/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:11Z",
    "sequence": 1793285711236
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:55:11.255759Z",
  "last_location_at": "2026-10-29T14:55:11.255759Z",
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
  "device_ref": "sandbox-10132"
}
```

```json
{
  "challenge_id": "b45ad8ca-57db-412e-84f9-09f7ee09e825",
  "expires_at": "2026-10-29T15:00:11.544438307Z",
  "resend_available_at": "2026-10-29T14:55:12.544438307Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "506929",
  "sent_at": "2026-10-29T14:55:11.547102508Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b45ad8ca-57db-412e-84f9-09f7ee09e825",
  "code": "506929",
  "device_ref": "sandbox-10132"
}
```

```json
{
  "session_id": "24eebdb0-3ec7-4e0e-bd58-7ea795ff4442",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjYxMSwiaWF0IjoxNzkzMjg1NzExLCJqdGkiOiJiZmY5MDk5MS01OGQ1LTQ3ZjEtOTNiOC1mZDNmMmEzMTQ2OTQiLCJzaWQiOiIyNGVlYmRiMC0zZWM3LTRlMGUtYmQ1OC03ZWE3OTVmZjQ0NDIifQ.8MZqrBDi6f4BxUmhLLTe2LNyGBxPq-zQWvZsg95uMrM",
  "access_expires_at": "2026-10-29T15:10:11.862395201Z",
  "refresh_token": "dl9Eureo1i74dEkEaj79oBYnwFeo-lMTKKdd4ZkKiZ8",
  "refresh_expires_at": "2026-11-28T14:55:11.861689794Z",
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
  "command_id": "be1f3305-6017-4cf7-8ac1-57d9fe519465",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:12Z",
    "sequence": 1793285712423
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e94c451c-dd7d-4ddb-b613-b61469bb9dc3",
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
  "last_heartbeat_at": "2026-10-29T14:55:12.442362Z",
  "last_location_at": "2026-10-29T14:55:12.442362Z",
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
  "session_id": "309f840a-c5a3-496d-a2e5-f8f770a6447b",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MTMsImlhdCI6MTc5MzI4NTcxMywianRpIjoiYmIyMWE0NjYtZjU3OS00ZWJmLWI2NjAtMzYxY2ZjMGM3OGNjIiwic2lkIjoiMzA5Zjg0MGEtYzVhMy00OTZkLWEyZTUtZjhmNzcwYTY0NDdiIn0.0zVclWzdwKt20oBDNuB6dFbmyPA3Zavu4BzIJQgJnPI",
  "access_expires_at": "2026-10-29T15:10:13.020987385Z",
  "refresh_token": "RZBkywR8qUohEySytcqELBE8Y1olcguplryozVwcikM",
  "refresh_expires_at": "2026-10-30T02:55:13.020390679Z",
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
  "session_id": "d7d03f6f-7501-4ab6-a828-dbd6b8729cb4",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MTMsImlhdCI6MTc5MzI4NTcxMywianRpIjoiNGRmNGZjNjgtMDYyOS00MWJhLWE5MDYtZWQ1OTZjZDZhNGNlIiwic2lkIjoiZDdkMDNmNmYtNzUwMS00YWI2LWE4MjgtZGJkNmI4NzI5Y2I0In0.WNZz9gz4BJtqAxlNgx5BGrybuvgsKsTaVatdgH75UUU",
  "access_expires_at": "2026-10-29T15:10:13.608733615Z",
  "refresh_token": "A2Ib3GP5BurMcLENG3LK-cnpIQuQTh-XMTPBbBMz8tY",
  "refresh_expires_at": "2026-10-30T02:55:13.608144795Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d1da80dc-96a8-47d4-95b3-0c88112ce068` → **200**

```json
{
  "id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ada97377-5e91-4e5d-8572-02d724d8d135",
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
    "id": "d54eb309-a219-4500-a5c0-968ebf5adbdd",
    "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1e1f1927-622b-4dfc-88d9-7e48a134c95f",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T14:55:09.150645Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d1da80dc-96a8-47d4-95b3-0c88112ce068/interrupt` → **200**

```json
{
  "command_id": "b6edcea1-9c64-4ca2-9c39-856ebce503e7",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "ada97377-5e91-4e5d-8572-02d724d8d135",
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
      "id": "d54eb309-a219-4500-a5c0-968ebf5adbdd",
      "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "1e1f1927-622b-4dfc-88d9-7e48a134c95f",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T14:55:09.150645Z",
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
    "id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "ada97377-5e91-4e5d-8572-02d724d8d135",
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
    "id": "257589bd-d606-43ce-a388-9f2a7420d9bd",
    "order_id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
    "expires_at": "2026-10-29T14:55:29.208719Z",
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

`POST /api/driver/v1/offers/257589bd-d606-43ce-a388-9f2a7420d9bd/accept` → **200**

```json
{
  "command_id": "60be3ea8-80fc-413f-9e4d-5ec50e7e79c7"
}
```

```json
{
  "id": "47945fa9-90aa-48eb-b515-7f7e5d17f442",
  "order_id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ec453382-6ab1-4764-8ffb-bae836e8ec33",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ec453382-6ab1-4764-8ffb-bae836e8ec33",
  "order_id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
  "assignment_id": "47945fa9-90aa-48eb-b515-7f7e5d17f442",
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
  "session_id": "e94c451c-dd7d-4ddb-b613-b61469bb9dc3",
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
  "last_heartbeat_at": "2026-10-29T14:55:12.442362Z",
  "last_location_at": "2026-10-29T14:55:12.442362Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/e94c451c-dd7d-4ddb-b613-b61469bb9dc3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:15Z",
    "sequence": 1793285715689
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e94c451c-dd7d-4ddb-b613-b61469bb9dc3",
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
  "last_heartbeat_at": "2026-10-29T14:55:15.70864Z",
  "last_location_at": "2026-10-29T14:55:15.70864Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ec453382-6ab1-4764-8ffb-bae836e8ec33/arrive` → **200**

```json
{
  "command_id": "c7fd225c-93b3-4af5-90f0-a4b4c53d8e31",
  "expected_version": 0
}
```

```json
{
  "id": "ec453382-6ab1-4764-8ffb-bae836e8ec33",
  "order_id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
  "assignment_id": "47945fa9-90aa-48eb-b515-7f7e5d17f442",
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
  "arrived_at": "2026-10-29T14:55:16.03136Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ec453382-6ab1-4764-8ffb-bae836e8ec33/start` → **200**

```json
{
  "command_id": "fa09f6d0-8c45-42e4-9545-144d4685be93",
  "expected_version": 1
}
```

```json
{
  "id": "ec453382-6ab1-4764-8ffb-bae836e8ec33",
  "order_id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
  "assignment_id": "47945fa9-90aa-48eb-b515-7f7e5d17f442",
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
  "arrived_at": "2026-10-29T14:55:16.03136Z",
  "started_at": "2026-10-29T14:55:16.343352Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ec453382-6ab1-4764-8ffb-bae836e8ec33/complete` → **200**

```json
{
  "command_id": "1f33eb37-9e56-4ec3-b3c1-0717adb9fb58",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:55:16Z"
}
```

```json
{
  "id": "ec453382-6ab1-4764-8ffb-bae836e8ec33",
  "order_id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
  "assignment_id": "47945fa9-90aa-48eb-b515-7f7e5d17f442",
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
  "arrived_at": "2026-10-29T14:55:16.03136Z",
  "started_at": "2026-10-29T14:55:16.343352Z",
  "completed_at": "2026-10-29T14:55:16.657645Z",
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
    "id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:55:14.197794Z",
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
    "id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:55:09.150645Z",
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

`GET /api/operator/v1/orders/d1da80dc-96a8-47d4-95b3-0c88112ce068/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:55:09.151334Z",
      "actor": {
        "type": "CLIENT",
        "id": "ada97377-5e91-4e5d-8572-02d724d8d135",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
        "quote_id": "10e5d148-6b19-4e4d-961d-ce2adf30a751",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "045c5808-ada8-4745-9c66-f2d23bd542ec"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:55:09.153708Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
        "attempt_id": "308831d5-4700-4037-b8f0-83e5b745beaa",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "045c5808-ada8-4745-9c66-f2d23bd542ec"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:55:09.157247Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2bb7a5a0-107f-4cbf-b44e-61f12c11af77",
        "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "045c5808-ada8-4745-9c66-f2d23bd542ec"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:55:09.754312Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2bb7a5a0-107f-4cbf-b44e-61f12c11af77",
        "order_id": "d1da80dc-96a8-47d4-95b3-0c88112ce068",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d54eb309-a219-4500-a5c0-968ebf5adbdd"
      },
      "correlation_id": "9ddda0d5-1003-4d1f-9ccb-209c78b66d56"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/f4e1b292-6939-41ce-a02f-22bbefcbb0f6/tip` → **200**

```json
{
  "order_id": "f4e1b292-6939-41ce-a02f-22bbefcbb0f6",
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
  "available_until": "2026-10-30T14:55:16.657645Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/f4e1b292-6939-41ce-a02f-22bbefcbb0f6/tip` → **409**

```json
{
  "command_id": "d3ab362e-4723-4135-b23f-c66de1060255",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/f4e1b292-6939-41ce-a02f-22bbefcbb0f6/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bb7ed22e-f1ce-4857-94d5-aa57f983ea07"
}
```

Done: interrupted d1da80dc-96a8-47d4-95b3-0c88112ce068, follow-up f4e1b292-6939-41ce-a02f-22bbefcbb0f6.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "54c2ccc8-372b-4d72-b372-09eb89956048",
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
  "last_heartbeat_at": "2026-10-29T14:55:11.255759Z",
  "last_location_at": "2026-10-29T14:55:11.255759Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/54c2ccc8-372b-4d72-b372-09eb89956048/close` → **200**

```json
{
  "command_id": "f4592883-76f7-4541-a8bd-1303a700c22f",
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
  "session_id": "e94c451c-dd7d-4ddb-b613-b61469bb9dc3",
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
  "last_heartbeat_at": "2026-10-29T14:55:15.70864Z",
  "last_location_at": "2026-10-29T14:55:15.70864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e94c451c-dd7d-4ddb-b613-b61469bb9dc3/close` → **200**

```json
{
  "command_id": "0b2ec0e1-9715-4d43-83bf-70cce08dd0c9",
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
  "session_id": "44040bb6-f395-41d7-854a-82bdc8c131fc",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MjIsImlhdCI6MTc5MzI4NTcyMiwianRpIjoiMDgzZGYzMjMtMWVjOC00NjJiLTgxN2QtZTdlZTk4NjBmZDhjIiwic2lkIjoiNDQwNDBiYjYtZjM5NS00MWQ3LTg1NGEtODJiZGM4YzEzMWZjIn0.3pKVgRIy71mb0nAeWB7PnQrbAtXtEfHn4FgOjmXCxAY",
  "access_expires_at": "2026-10-29T15:10:22.949993709Z",
  "refresh_token": "m-5nQCsZydtAtsizkxpVvFN2lN2ne9fkeYoRJYg0jrg",
  "refresh_expires_at": "2026-10-30T02:55:22.949329496Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b2762535-2703-4f89-9b4f-ca10d2672f28",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:55:23Z"
}
```

```json
{
  "id": "f2b22046-5cf1-4b53-94ad-ac26326cfa05",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:55:23Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/f2b22046-5cf1-4b53-94ad-ac26326cfa05/publish` → **200**

```json
{
  "command_id": "9266f3c2-5c18-484f-b77e-8f7f28e4918d",
  "expected_version": 0
}
```

```json
{
  "id": "f2b22046-5cf1-4b53-94ad-ac26326cfa05",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:55:23.558443Z",
  "published_at": "2026-10-29T14:55:23.558443Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "f2b22046-5cf1-4b53-94ad-ac26326cfa05",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T14:55:23.558443Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639685203",
  "device_ref": "sandbox-25271"
}
```

```json
{
  "challenge_id": "fbf091dd-dc4c-48f7-a3da-4cf0b3031cb5",
  "expires_at": "2026-10-29T15:00:24.145082828Z",
  "resend_available_at": "2026-10-29T14:55:25.145082828Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639685203` → **200**

```json
{
  "phone": "+380639685203",
  "audience": "CLIENT",
  "code": "541479",
  "sent_at": "2026-10-29T14:55:24.147668451Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fbf091dd-dc4c-48f7-a3da-4cf0b3031cb5",
  "code": "541479",
  "device_ref": "sandbox-25271"
}
```

```json
{
  "session_id": "6e0c2da9-aed4-4901-8d31-16210acdefa7",
  "subject": {
    "type": "CLIENT",
    "id": "a40d1cef-98cd-475e-acc8-98d8e6836592"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDBkMWNlZi05OGNkLTQ3NWUtYWNjOC05OGQ4ZTY4MzY1OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjI0LCJpYXQiOjE3OTMyODU3MjQsImp0aSI6ImM5MTliYjc1LTczZmEtNGY5NC1hOTVlLTJmNmMzNjVjMWJmYSIsInNpZCI6IjZlMGMyZGE5LWFlZDQtNDkwMS04ZDMxLTE2MjEwYWNkZWZhNyJ9.mwY7iTDNUN8qlpylUhIcof4xmCaY_d5Z7LjmpMWyHsQ",
  "access_expires_at": "2026-10-29T15:10:24.461516997Z",
  "refresh_token": "D1wTX2-7DBT3NN9UwEJ761LA2Duj6Iq35KKrvhotW4I",
  "refresh_expires_at": "2026-11-28T14:55:24.460940218Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "f2b22046-5cf1-4b53-94ad-ac26326cfa05",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T14:55:23.558443Z",
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
  "command_id": "7edd3447-6b18-424d-afbb-8dff5f1c2ff2",
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
  "id": "94e51b46-e984-46d9-bda7-ed73c59aedc0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:25.050769Z",
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
  "command_id": "38887af7-aa04-4754-ba00-774616be0473",
  "quote_id": "94e51b46-e984-46d9-bda7-ed73c59aedc0",
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
  "correlation_id": "c735c4b9-0f29-4a20-9430-f50797656260"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "77871228-4376-43e3-a65e-155647adc902",
  "version_id": "f2b22046-5cf1-4b53-94ad-ac26326cfa05",
  "language": "uk"
}
```

```json
{
  "version_id": "f2b22046-5cf1-4b53-94ad-ac26326cfa05",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T14:55:25.639663Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d3d77f14-a45d-4162-b393-175a4142a72c",
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
  "id": "15432655-4004-4550-a44a-73ead7bf2dfa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:25.934498Z",
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
  "command_id": "5e80811f-5d2b-4000-9504-633f5310a5f7",
  "quote_id": "15432655-4004-4550-a44a-73ead7bf2dfa",
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
  "id": "b2801341-6f63-4e46-819e-037718ac4346",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a40d1cef-98cd-475e-acc8-98d8e6836592",
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
  "created_at": "2026-10-29T14:55:26.24326Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b2801341-6f63-4e46-819e-037718ac4346` → **200**

```json
{
  "id": "b2801341-6f63-4e46-819e-037718ac4346",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a40d1cef-98cd-475e-acc8-98d8e6836592",
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
  "created_at": "2026-10-29T14:55:26.24326Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b2801341-6f63-4e46-819e-037718ac4346/cancel` → **200**

```json
{
  "command_id": "4a717aa0-4a01-45de-beb8-a3c6bc3b8075",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b2801341-6f63-4e46-819e-037718ac4346",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a40d1cef-98cd-475e-acc8-98d8e6836592",
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
  "created_at": "2026-10-29T14:55:26.24326Z",
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

`POST /api/admin/v1/legal-documents/f2b22046-5cf1-4b53-94ad-ac26326cfa05` → **409**

```json
{
  "command_id": "6dddbaac-ce62-4a92-a10a-e33fe9395115",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:55:27Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/f2b22046-5cf1-4b53-94ad-ac26326cfa05",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6a7c78c5-42d0-4c5a-8f6d-fab8245c7d09"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9922434c-91dc-44e0-a0e3-8209b0fd4ea8",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:55:27Z"
}
```

```json
{
  "id": "54c1b2e5-f798-4331-ae64-8c24ba48a6a2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:55:27Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/54c1b2e5-f798-4331-ae64-8c24ba48a6a2/publish` → **200**

```json
{
  "command_id": "f1fda799-de88-4ce7-b4e4-dff3cb2e4226",
  "expected_version": 0
}
```

```json
{
  "id": "54c1b2e5-f798-4331-ae64-8c24ba48a6a2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:55:27.787889Z",
  "published_at": "2026-10-29T14:55:27.787889Z",
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
  "device_ref": "sandbox-24900"
}
```

```json
{
  "challenge_id": "2c935180-468e-4de9-a1cc-6eccd02c115e",
  "expires_at": "2026-10-29T15:00:28.09128703Z",
  "resend_available_at": "2026-10-29T14:55:29.09128703Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "015448",
  "sent_at": "2026-10-29T14:55:28.093958812Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c935180-468e-4de9-a1cc-6eccd02c115e",
  "code": "015448",
  "device_ref": "sandbox-24900"
}
```

```json
{
  "session_id": "69890bde-862e-4dc7-9b79-573da5c117fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjYyOCwiaWF0IjoxNzkzMjg1NzI4LCJqdGkiOiJmNTAxMThjZS0yNWI4LTQ4NjYtODhhNy02OWEyY2NjODM2ZTAiLCJzaWQiOiI2OTg5MGJkZS04NjJlLTRkYzctOWI3OS01NzNkYTVjMTE3ZmMifQ.X0p1vQRg3QVGnTqF04j1zJR6gkrI3xpAWTOnYkhGCZ8",
  "access_expires_at": "2026-10-29T15:10:28.406363391Z",
  "refresh_token": "brbGaa99DNFXq0mOW1YRdd5A4q_QR_R6VqzbxlgxyAY",
  "refresh_expires_at": "2026-11-28T14:55:28.405754013Z",
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
  "command_id": "67914e80-dcfd-46c1-97b4-ee5afc3d0db1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:28Z",
    "sequence": 1793285728995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "826b062f-1103-4e5f-a126-3fdaea07cddb",
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
  "last_heartbeat_at": "2026-10-29T14:55:29.0144Z",
  "last_location_at": "2026-10-29T14:55:29.0144Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670441525",
  "device_ref": "sandbox-13788"
}
```

```json
{
  "challenge_id": "23e41a89-6fcd-4e5c-83bc-b8fdbe9ba205",
  "expires_at": "2026-10-29T15:00:29.299994216Z",
  "resend_available_at": "2026-10-29T14:55:30.299994216Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670441525` → **200**

```json
{
  "phone": "+380670441525",
  "audience": "CLIENT",
  "code": "944580",
  "sent_at": "2026-10-29T14:55:29.303134978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23e41a89-6fcd-4e5c-83bc-b8fdbe9ba205",
  "code": "944580",
  "device_ref": "sandbox-13788"
}
```

```json
{
  "session_id": "4e471da4-a671-48a0-8bbd-09447f403001",
  "subject": {
    "type": "CLIENT",
    "id": "90ee665f-0604-4673-b6de-a997c65491e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MGVlNjY1Zi0wNjA0LTQ2NzMtYjZkZS1hOTk3YzY1NDkxZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjI5LCJpYXQiOjE3OTMyODU3MjksImp0aSI6ImI0ZDE4Mjc0LTdhYzctNDZmZi1iYmUxLTZlN2ZlMmU5NGQ0MCIsInNpZCI6IjRlNDcxZGE0LWE2NzEtNDhhMC04YmJkLTA5NDQ3ZjQwMzAwMSJ9.3S5sjaHrceWa2dEnqPvBabwylh2JidMX4i4ywJRp9Yo",
  "access_expires_at": "2026-10-29T15:10:29.615642589Z",
  "refresh_token": "22SnKaBsQdMEmDRT_ofOKvSCIjEY2W1GkCo-y4AYPAw",
  "refresh_expires_at": "2026-11-28T14:55:29.615093122Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6338670f-9feb-451b-ab88-6efa7a11bfa8",
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
  "id": "7123c0f2-7531-4377-9493-53bb63be9235",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:29.917342Z",
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
  "command_id": "2c587c79-b688-435b-9662-50cce6f91f37",
  "quote_id": "7123c0f2-7531-4377-9493-53bb63be9235",
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
    "phone": "+380672076191"
  }
}
```

```json
{
  "id": "cff5d873-31e8-479f-9890-0f8128d7837c",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:55:30.221238Z",
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
    "id": "e6dd8840-8840-49f1-b16b-4543a58da6db",
    "order_id": "cff5d873-31e8-479f-9890-0f8128d7837c",
    "expires_at": "2026-10-29T14:55:45.224486Z",
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

`POST /api/driver/v1/offers/e6dd8840-8840-49f1-b16b-4543a58da6db/accept` → **200**

```json
{
  "command_id": "8841a83c-97ed-4b85-967c-6bb32aecdbfe"
}
```

```json
{
  "id": "7adf8f98-c27e-4569-b90f-b023224ed0a5",
  "order_id": "cff5d873-31e8-479f-9890-0f8128d7837c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c29d84b5-885f-440a-99b2-db2a834c22d0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c29d84b5-885f-440a-99b2-db2a834c22d0",
  "order_id": "cff5d873-31e8-479f-9890-0f8128d7837c",
  "assignment_id": "7adf8f98-c27e-4569-b90f-b023224ed0a5",
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
    "phone": "+380672076191"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eee0958e-300b-4305-8458-1e5aa3a8e496",
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
  "id": "a0a974d7-edd7-433a-820c-7a296dc77a79",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:31.418539Z",
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
  "command_id": "6428f31d-05c1-410f-91dc-be6d4b52068e",
  "quote_id": "a0a974d7-edd7-433a-820c-7a296dc77a79",
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
  "id": "58da67d0-a543-4e75-9db4-1d9113586965",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:55:31.730796Z",
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
  "command_id": "a45e5f5f-198c-4060-9574-3c515a97e324",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T17:55:32Z"
}
```

```json
{
  "id": "5ec9035d-a63d-474a-903b-b069e2404b2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:32.058909Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:55:32Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f08772a9-c28c-4643-9836-9535f6747390",
  "quote_id": "5ec9035d-a63d-474a-903b-b069e2404b2e",
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
  "pickup_at": "2026-10-29T17:55:32Z"
}
```

```json
{
  "id": "29d59ef2-d4ed-43d4-a766-76fdb439d9f0",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:55:32.368472Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:55:32Z",
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
  "command_id": "2a43a300-74ec-4c2b-9a05-02294cdf1722",
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
  "id": "8d45e2f1-2d6c-4890-be90-3cb5e231f5c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:32.679765Z",
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
  "command_id": "bcb69367-b116-44a0-83a6-cddf726767c5",
  "quote_id": "8d45e2f1-2d6c-4890-be90-3cb5e231f5c9",
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
  "correlation_id": "4cf3f6c4-d3ce-4de4-8754-793bfdfd16ea"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "29d59ef2-d4ed-43d4-a766-76fdb439d9f0",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T14:55:32.368472Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T17:55:32Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "58da67d0-a543-4e75-9db4-1d9113586965",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T14:55:31.730796Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "cff5d873-31e8-479f-9890-0f8128d7837c",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "58da67d0-a543-4e75-9db4-1d9113586965",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:55:31.730796Z",
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

`GET /api/rider/v1/orders/cff5d873-31e8-479f-9890-0f8128d7837c` → **200**

```json
{
  "id": "cff5d873-31e8-479f-9890-0f8128d7837c",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7adf8f98-c27e-4569-b90f-b023224ed0a5",
    "order_id": "cff5d873-31e8-479f-9890-0f8128d7837c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c29d84b5-885f-440a-99b2-db2a834c22d0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:55:30.221238Z",
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
    "location_at": "2026-10-29T14:55:29.0144Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/cff5d873-31e8-479f-9890-0f8128d7837c/cancel` → **200**

```json
{
  "command_id": "0b817d03-55b9-4173-9b45-47409b348969",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cff5d873-31e8-479f-9890-0f8128d7837c",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7adf8f98-c27e-4569-b90f-b023224ed0a5",
    "order_id": "cff5d873-31e8-479f-9890-0f8128d7837c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c29d84b5-885f-440a-99b2-db2a834c22d0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:55:30.221238Z",
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

`GET /api/rider/v1/orders/58da67d0-a543-4e75-9db4-1d9113586965` → **200**

```json
{
  "id": "58da67d0-a543-4e75-9db4-1d9113586965",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:55:31.730796Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/58da67d0-a543-4e75-9db4-1d9113586965/cancel` → **200**

```json
{
  "command_id": "e1161d80-33b1-473e-8455-c7f2627623ef",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "58da67d0-a543-4e75-9db4-1d9113586965",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:55:31.730796Z",
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

`GET /api/rider/v1/orders/29d59ef2-d4ed-43d4-a766-76fdb439d9f0` → **200**

```json
{
  "id": "29d59ef2-d4ed-43d4-a766-76fdb439d9f0",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:55:32.368472Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:55:32Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/29d59ef2-d4ed-43d4-a766-76fdb439d9f0/cancel` → **200**

```json
{
  "command_id": "e4057304-2270-41e1-a8f6-28d2b59d759d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "29d59ef2-d4ed-43d4-a766-76fdb439d9f0",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "90ee665f-0604-4673-b6de-a997c65491e7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:55:32.368472Z",
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
  "pickup_at": "2026-10-29T17:55:32Z",
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
  "session_id": "826b062f-1103-4e5f-a126-3fdaea07cddb",
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
  "last_heartbeat_at": "2026-10-29T14:55:29.0144Z",
  "last_location_at": "2026-10-29T14:55:29.0144Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/826b062f-1103-4e5f-a126-3fdaea07cddb/close` → **200**

```json
{
  "command_id": "10b912d7-9629-44c2-9fad-8520d07f9b92",
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

Done: orders cff5d873-31e8-479f-9890-0f8128d7837c, 58da67d0-a543-4e75-9db4-1d9113586965, 29d59ef2-d4ed-43d4-a766-76fdb439d9f0.

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
  "session_id": "5df65f6d-3fbd-4374-9965-767b44c8bef6",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MzYsImlhdCI6MTc5MzI4NTczNiwianRpIjoiNTA1ZDJmYjgtOWJiNi00MjRiLTg1N2ItOTRlYjkwNzczNjFlIiwic2lkIjoiNWRmNjVmNmQtM2ZiZC00Mzc0LTk5NjUtNzY3YjQ0YzhiZWY2In0.WWBAlpINl-S89E6n1_2kLBE8Drb9x9sgTqAjFtseuG8",
  "access_expires_at": "2026-10-29T15:10:36.592262905Z",
  "refresh_token": "ycvZy2EOAIps6ixWo5LdMlE6u8N4lID6Pq1c2avSRtQ",
  "refresh_expires_at": "2026-10-30T02:55:36.591680406Z",
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
  "session_id": "7d547866-1941-4d4b-a19a-2d6d9c82bb5c",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2MzcsImlhdCI6MTc5MzI4NTczNywianRpIjoiNGYxMWFiMGQtMTBmOS00NjVjLWEyNmUtMjhmMDI5ZTQzZjBmIiwic2lkIjoiN2Q1NDc4NjYtMTk0MS00ZDRiLWExOWEtMmQ2ZDljODJiYjVjIn0.u6OvB05zSz_VsSgQ3JV4Xzk_B4bhLr3XEXGakbQfTTg",
  "access_expires_at": "2026-10-29T15:10:37.169982553Z",
  "refresh_token": "f9Hi9QKujm7bpnpmRluT2Hudbq3cXu-DGufVtuEEE2g",
  "refresh_expires_at": "2026-10-30T02:55:37.169379596Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30525"
}
```

```json
{
  "challenge_id": "044656fa-d0cb-4e72-84d4-9afd3587a207",
  "expires_at": "2026-10-29T15:00:37.452942659Z",
  "resend_available_at": "2026-10-29T14:55:38.452942659Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "930686",
  "sent_at": "2026-10-29T14:55:37.455545213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "044656fa-d0cb-4e72-84d4-9afd3587a207",
  "code": "930686",
  "device_ref": "sandbox-30525"
}
```

```json
{
  "session_id": "1c7e83d8-0761-4676-814c-b769235a2ba3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjYzNywiaWF0IjoxNzkzMjg1NzM3LCJqdGkiOiJhMDAxOGM4Ny1mMjNlLTQxY2EtYTYwMi1kOTdlMzY1YjZkOTMiLCJzaWQiOiIxYzdlODNkOC0wNzYxLTQ2NzYtODE0Yy1iNzY5MjM1YTJiYTMifQ.8iW5h7xkoJbKeK1ytsgQCry6Bh65m3PWQNPpTUospK0",
  "access_expires_at": "2026-10-29T15:10:37.762861388Z",
  "refresh_token": "7wUmZ9cCb1dkr4mKEMhqlTZnZ41uFlz6AkFFSio9AzQ",
  "refresh_expires_at": "2026-11-28T14:55:37.762212252Z",
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
  "command_id": "ff2d1d49-6cf7-49a4-bd57-17ffb5452775",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:38Z",
    "sequence": 1793285738324
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d313a31-e8d9-4672-ac1b-4fdb22cabe29",
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
  "last_heartbeat_at": "2026-10-29T14:55:38.342845Z",
  "last_location_at": "2026-10-29T14:55:38.342845Z",
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
  "command_id": "bb6f45dd-9725-4e73-b4d6-4391aad1182b",
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
  "effective_at": "2026-10-29T14:55:38.936169Z",
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T14:52:49.431168Z",
  "last_entries": [
    {
      "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:52:49.431168Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9ffd9009-43b6-4bff-9908-cc097912d374",
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
  "id": "790443ff-468c-49b9-8c6f-f98968362275",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:39.524275Z",
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
  "command_id": "d1af01b7-7c24-435b-a36d-134f4043876b",
  "quote_id": "790443ff-468c-49b9-8c6f-f98968362275",
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
    "phone": "+3806711132763"
  }
}
```

```json
{
  "id": "b173d822-ed3b-4ec0-a506-65dfe4bb6ceb",
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
  "created_at": "2026-10-29T14:55:39.829121Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132763"
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
    "id": "5faa14ea-df50-4050-a487-b8a3b9b726a4",
    "order_id": "b173d822-ed3b-4ec0-a506-65dfe4bb6ceb",
    "expires_at": "2026-10-29T14:55:54.832755Z",
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

`POST /api/driver/v1/offers/5faa14ea-df50-4050-a487-b8a3b9b726a4/accept` → **200**

```json
{
  "command_id": "752eb670-26d3-49ad-816c-843f7dfae694"
}
```

```json
{
  "id": "cba4fce2-2279-499e-9114-8246a8329d77",
  "order_id": "b173d822-ed3b-4ec0-a506-65dfe4bb6ceb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "986dfabd-0179-4560-a584-5ac8a4087512",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "986dfabd-0179-4560-a584-5ac8a4087512",
  "order_id": "b173d822-ed3b-4ec0-a506-65dfe4bb6ceb",
  "assignment_id": "cba4fce2-2279-499e-9114-8246a8329d77",
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
    "phone": "+3806711132763"
  }
}
```

`POST /api/driver/v1/work-sessions/9d313a31-e8d9-4672-ac1b-4fdb22cabe29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:55:40Z",
    "sequence": 1793285741400
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d313a31-e8d9-4672-ac1b-4fdb22cabe29",
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
  "last_heartbeat_at": "2026-10-29T14:55:41.018891Z",
  "last_location_at": "2026-10-29T14:55:41.018891Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/986dfabd-0179-4560-a584-5ac8a4087512/arrive` → **200**

```json
{
  "command_id": "c8b63301-cec3-4369-a697-c7c9edd5f92d",
  "expected_version": 0
}
```

```json
{
  "id": "986dfabd-0179-4560-a584-5ac8a4087512",
  "order_id": "b173d822-ed3b-4ec0-a506-65dfe4bb6ceb",
  "assignment_id": "cba4fce2-2279-499e-9114-8246a8329d77",
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
  "arrived_at": "2026-10-29T14:55:41.322653Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711132763"
  }
}
```

`POST /api/driver/v1/trips/986dfabd-0179-4560-a584-5ac8a4087512/start` → **200**

```json
{
  "command_id": "d84945fa-9957-4bcb-869c-ece4b4194bf6",
  "expected_version": 1
}
```

```json
{
  "id": "986dfabd-0179-4560-a584-5ac8a4087512",
  "order_id": "b173d822-ed3b-4ec0-a506-65dfe4bb6ceb",
  "assignment_id": "cba4fce2-2279-499e-9114-8246a8329d77",
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
  "arrived_at": "2026-10-29T14:55:41.322653Z",
  "started_at": "2026-10-29T14:55:41.62838Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711132763"
  }
}
```

`POST /api/driver/v1/trips/986dfabd-0179-4560-a584-5ac8a4087512/complete` → **200**

```json
{
  "command_id": "2d0460d3-382d-44ec-8409-38da8352c358",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:55:41Z",
  "cash_received": true
}
```

```json
{
  "id": "986dfabd-0179-4560-a584-5ac8a4087512",
  "order_id": "b173d822-ed3b-4ec0-a506-65dfe4bb6ceb",
  "assignment_id": "cba4fce2-2279-499e-9114-8246a8329d77",
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
  "arrived_at": "2026-10-29T14:55:41.322653Z",
  "started_at": "2026-10-29T14:55:41.62838Z",
  "completed_at": "2026-10-29T14:55:41.929509Z",
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
  "command_id": "2d2a17c6-d810-4f25-bce4-637e79059e32",
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
  "id": "66c61c6e-f68c-43d9-93ff-241775c6c7eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:00:42.262218Z",
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
  "command_id": "e6711420-9d59-48b0-b6e3-8ad63d47388b",
  "quote_id": "66c61c6e-f68c-43d9-93ff-241775c6c7eb",
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
    "phone": "+3806711123916"
  }
}
```

```json
{
  "id": "5a040fbc-9efe-4a2c-9153-3c77c7a07e69",
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
  "created_at": "2026-10-29T14:55:42.56745Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123916"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5a040fbc-9efe-4a2c-9153-3c77c7a07e69` → **200**

```json
{
  "id": "5a040fbc-9efe-4a2c-9153-3c77c7a07e69",
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
  "created_at": "2026-10-29T14:55:42.56745Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123916"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5a040fbc-9efe-4a2c-9153-3c77c7a07e69/cancel` → **200**

```json
{
  "command_id": "cbbae1e6-bd72-46b3-aa56-33d4a8a994bc",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5a040fbc-9efe-4a2c-9153-3c77c7a07e69",
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
  "created_at": "2026-10-29T14:55:42.56745Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123916"
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
  "staff_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T14:52:49.431168Z",
  "last_entries": [
    {
      "order_id": "5a040fbc-9efe-4a2c-9153-3c77c7a07e69",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T14:55:43.191048Z"
    },
    {
      "order_id": "b173d822-ed3b-4ec0-a506-65dfe4bb6ceb",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T14:55:41.934283Z"
    },
    {
      "order_id": "b45880ec-fc2b-4099-b0d6-e58c5f2c3b0e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:52:49.431168Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9d313a31-e8d9-4672-ac1b-4fdb22cabe29",
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
  "last_heartbeat_at": "2026-10-29T14:55:41.018891Z",
  "last_location_at": "2026-10-29T14:55:41.018891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9d313a31-e8d9-4672-ac1b-4fdb22cabe29/close` → **200**

```json
{
  "command_id": "b14a37a8-2dcb-48e3-842b-a9685537e479",
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

Done: operator bonus for fulfilled b173d822-ed3b-4ec0-a506-65dfe4bb6ceb and operator-fault cancellation 5a040fbc-9efe-4a2c-9153-3c77c7a07e69.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679314735",
  "device_ref": "sandbox-19402"
}
```

```json
{
  "challenge_id": "a8042e9d-c2bc-463a-8c81-a5263e0de104",
  "expires_at": "2026-10-29T15:00:47.616112316Z",
  "resend_available_at": "2026-10-29T14:55:48.616112316Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679314735` → **200**

```json
{
  "phone": "+380679314735",
  "audience": "CLIENT",
  "code": "012912",
  "sent_at": "2026-10-29T14:55:47.618814076Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670591485",
  "device_ref": "sandbox-32659",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "37d27091-e7aa-4c1e-9756-63a77751142f",
  "expires_at": "2026-10-29T15:00:49.134031453Z",
  "resend_available_at": "2026-10-29T14:55:50.134031453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670591485` → **200**

```json
{
  "phone": "+380670591485",
  "audience": "CLIENT",
  "code": "784031",
  "sent_at": "2026-10-29T14:55:49.136385605Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670591485",
  "device_ref": "sandbox-551",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "8ce2ee11-2177-4ea5-8cff-f070094b2c6e",
  "expires_at": "2026-10-29T15:00:50.64636409Z",
  "resend_available_at": "2026-10-29T14:55:51.64636409Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380670591485` → **200**

```json
{
  "phone": "+380670591485",
  "audience": "CLIENT",
  "code": "297069",
  "sent_at": "2026-10-29T14:55:50.649246589Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677640000",
  "device_ref": "sandbox-32356"
}
```

```json
{
  "challenge_id": "3854463c-9640-4642-ac49-6b184a07b59d",
  "expires_at": "2026-10-29T15:00:52.154554181Z",
  "resend_available_at": "2026-10-29T14:55:53.154554181Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677640000",
  "device_ref": "sandbox-17395"
}
```

```json
{
  "challenge_id": "0428d8e5-46d2-442f-822e-cd5b0c7c0ada",
  "expires_at": "2026-10-29T15:00:53.643969141Z",
  "resend_available_at": "2026-10-29T14:55:54.643969141Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677640000` → **200**

```json
{
  "phone": "+380677640000",
  "audience": "CLIENT",
  "code": "090501",
  "sent_at": "2026-10-29T14:55:53.646870805Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677640000",
  "device_ref": "sandbox-27315",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "fc4b3dae-81b8-48c9-8e6c-6df3d4e075b4",
  "expires_at": "2026-10-29T15:00:55.172104495Z",
  "resend_available_at": "2026-10-29T14:55:56.172104495Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380677640000` → **200**

```json
{
  "phone": "+380677640000",
  "audience": "CLIENT",
  "code": "526472",
  "sent_at": "2026-10-29T14:55:55.174603687Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380677640000",
  "device_ref": "sandbox-26182",
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
  "correlation_id": "b0e53e57-575c-4554-9171-f300e5818cd7",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000013716"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "76ad044d-ef7c-44ce-96f5-94ae36d8216f"
}
```

`GET /sandbox/v1/otp?phone=%2B442000013716` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120021853"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "7fa7cfe5-97e3-412a-a152-b57e67cf9755"
}
```

`GET /sandbox/v1/otp?phone=%2B37120021853` → **404**

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
  "session_id": "a4c400b6-b6a3-435a-a42d-9c9a500bd7cb",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NTcsImlhdCI6MTc5MzI4NTc1NywianRpIjoiNjE1NDMxYmYtMTdlYy00NTczLTlhYmUtODI2NGU5Y2MyZWQwIiwic2lkIjoiYTRjNDAwYjYtYjZhMy00MzVhLWE0MmQtOWM5YTUwMGJkN2NiIn0.YYpgZvuIRu9G-HZAgL872yiuFQOZ93ufawJ33D0q3Ds",
  "access_expires_at": "2026-10-29T15:10:57.91198559Z",
  "refresh_token": "iro3Ir28rlR9CtCKzA1guQsu5mAAtsFclKozNoGJeOc",
  "refresh_expires_at": "2026-10-30T02:55:57.911441583Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677640000` → **200**

```json
{
  "deliveries": [
    {
      "id": "46ea9d5f-7a6b-4f20-9eb4-6ed64d6742c9",
      "challenge_id": "fc4b3dae-81b8-48c9-8e6c-6df3d4e075b4",
      "phone": "+380677640000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-87063666-fda4-4f42-9240-26874cb457dc",
      "error": null,
      "attempted_at": "2026-10-29T14:55:55.174918Z"
    },
    {
      "id": "d426042f-3c84-4579-9df0-b69fdbc9e23f",
      "challenge_id": "0428d8e5-46d2-442f-822e-cd5b0c7c0ada",
      "phone": "+380677640000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a8edfb51-5c6d-4e26-b81d-54cc99a674da",
      "error": null,
      "attempted_at": "2026-10-29T14:55:53.647136Z"
    },
    {
      "id": "20b9005b-6bc9-4365-a3c1-db737d9db8dd",
      "challenge_id": "3854463c-9640-4642-ac49-6b184a07b59d",
      "phone": "+380677640000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T14:55:52.157212Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677640000` → **200**

```json
{
  "phone": "+380677640000",
  "audience": "CLIENT",
  "code": "526472",
  "sent_at": "2026-10-29T14:55:55.174603687Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670591485` → **200**

```json
{
  "deliveries": [
    {
      "id": "88829e85-9ea1-457b-9819-abb70d046587",
      "challenge_id": "8ce2ee11-2177-4ea5-8cff-f070094b2c6e",
      "phone": "+380670591485",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-250b73eb-6e77-4b33-b2bb-d0695597ed9e",
      "error": null,
      "attempted_at": "2026-10-29T14:55:50.649528Z"
    },
    {
      "id": "fcb25044-1f13-4cd9-92ae-779ed47861a9",
      "challenge_id": "37d27091-e7aa-4c1e-9756-63a77751142f",
      "phone": "+380670591485",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c0d91a73-b4b3-46bb-a839-853434578392",
      "error": null,
      "attempted_at": "2026-10-29T14:55:49.136674Z"
    }
  ]
}
```

Done: SMS to +380679314735; SMS then a call to +380670591485; a failed SMS, two calls and a refused third to +380677640000; +44 and +371 refused.

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
  "session_id": "fa46c8bc-f86c-49cc-b075-9988cf806935",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NTksImlhdCI6MTc5MzI4NTc1OSwianRpIjoiNjZlZDQxNGMtNTBhMi00ZWY1LTlmN2ItOGZkNzNiY2U3MGRmIiwic2lkIjoiZmE0NmM4YmMtZjg2Yy00OWNjLWIwNzUtOTk4OGNmODA2OTM1In0.2u3nqrVAIWjpy-SdnymBQ9AkkSW1sfDSAr9trGxsug0",
  "access_expires_at": "2026-10-29T15:10:59.138232895Z",
  "refresh_token": "b6Tu6fNZ6X2AqIDiZeZnj18Xdrp2jCrziXt6KB_RuhA",
  "refresh_expires_at": "2026-10-30T02:55:59.137414574Z",
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
  "session_id": "7c5f0df3-d9ab-4f90-b2ff-7d73806bdd2b",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2NTksImlhdCI6MTc5MzI4NTc1OSwianRpIjoiMzBlNDQwODItODhjMC00MDgyLThiZmQtMDk2MGY1MzEzNmRiIiwic2lkIjoiN2M1ZjBkZjMtZDlhYi00ZjkwLWIyZmYtN2Q3MzgwNmJkZDJiIn0.Vgi69xdUnx1G-2kNFCik2HwspALxR92OD1M94cbdils",
  "access_expires_at": "2026-10-29T15:10:59.72036716Z",
  "refresh_token": "eGO6k6fG7V-tbKMQUUjZXMtR-0YWrvPYcIniJ2Sqe14",
  "refresh_expires_at": "2026-10-30T02:55:59.71982232Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
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

`POST /api/admin/v1/staff-extensions/3c8dfdd5-4521-451c-afcf-e104776a6f21` → **200**

```json
{
  "command_id": "5a878a94-8847-4561-b300-a09d3efbafd7",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "551b0035-c7ed-402a-ba56-89f3a4871f3d",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:56:00.898951Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:56:00.898951Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d787dfe5-39a1-4b6d-9280-2d6e17cc41d7",
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
  "id": "ce831762-1af5-48b4-b667-9272ee6fa475",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:01:01.487870Z",
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
  "command_id": "6b2e4047-e222-4543-99b5-0315dbf30694",
  "quote_id": "ce831762-1af5-48b4-b667-9272ee6fa475",
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
    "phone": "+380678234564"
  }
}
```

```json
{
  "id": "ed2a237e-54c1-4859-9939-ba2807b1e3fb",
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
  "created_at": "2026-10-29T14:56:01.81651Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678234564"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/ed2a237e-54c1-4859-9939-ba2807b1e3fb/calls` → **201**

```json
{
  "command_id": "0b9d7fff-23c5-4248-89ad-66be24e38e07",
  "to": "CALLER"
}
```

```json
{
  "id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "order_ids": [
    "ed2a237e-54c1-4859-9939-ba2807b1e3fb"
  ],
  "started_at": "2026-10-29T14:56:02.146305Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/ed2a237e-54c1-4859-9939-ba2807b1e3fb/calls` → **201**

```json
{
  "command_id": "0b9d7fff-23c5-4248-89ad-66be24e38e07",
  "to": "CALLER"
}
```

```json
{
  "id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "order_ids": [
    "ed2a237e-54c1-4859-9939-ba2807b1e3fb"
  ],
  "started_at": "2026-10-29T14:56:02.146305Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380678234564",
    "at": "2026-10-29T14:56:02.148630609Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.4173",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "044ba5e3-2622-4599-b559-8ce1505a20bd"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=ed2a237e-54c1-4859-9939-ba2807b1e3fb` → **200**

```json
{
  "calls": [
    {
      "id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [
        "ed2a237e-54c1-4859-9939-ba2807b1e3fb"
      ],
      "started_at": "2026-10-29T14:56:02.146305Z",
      "answered_at": "2026-10-29T14:56:02.830678Z",
      "ended_at": "2026-10-29T14:56:02.854066Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ed2a237e-54c1-4859-9939-ba2807b1e3fb` → **200**

```json
{
  "calls": [
    {
      "id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [
        "ed2a237e-54c1-4859-9939-ba2807b1e3fb"
      ],
      "started_at": "2026-10-29T14:56:02.146305Z",
      "answered_at": "2026-10-29T14:56:02.830678Z",
      "ended_at": "2026-10-29T14:56:02.854066Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ed2a237e-54c1-4859-9939-ba2807b1e3fb` → **200**

```json
{
  "calls": [
    {
      "id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [
        "ed2a237e-54c1-4859-9939-ba2807b1e3fb"
      ],
      "started_at": "2026-10-29T14:56:02.146305Z",
      "answered_at": "2026-10-29T14:56:02.830678Z",
      "ended_at": "2026-10-29T14:56:02.854066Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ed2a237e-54c1-4859-9939-ba2807b1e3fb` → **200**

```json
{
  "calls": [
    {
      "id": "044ba5e3-2622-4599-b559-8ce1505a20bd",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "order_ids": [
        "ed2a237e-54c1-4859-9939-ba2807b1e3fb"
      ],
      "started_at": "2026-10-29T14:56:02.146305Z",
      "answered_at": "2026-10-29T14:56:02.830678Z",
      "ended_at": "2026-10-29T14:56:02.854066Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:56:09.749891Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/ed2a237e-54c1-4859-9939-ba2807b1e3fb` → **200**

```json
{
  "id": "ed2a237e-54c1-4859-9939-ba2807b1e3fb",
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
  "created_at": "2026-10-29T14:56:01.81651Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678234564"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ed2a237e-54c1-4859-9939-ba2807b1e3fb/cancel` → **200**

```json
{
  "command_id": "fdc8b6e4-1fa2-421e-93c8-1c41a54e2532",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ed2a237e-54c1-4859-9939-ba2807b1e3fb",
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
  "created_at": "2026-10-29T14:56:01.81651Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678234564"
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
  "command_id": "8633ac51-069a-4226-b4ef-aa65630181f6",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T14:56:10.795228Z",
  "extension": "101"
}
```

Done: outgoing call 044ba5e3-2622-4599-b559-8ce1505a20bd from order ed2a237e-54c1-4859-9939-ba2807b1e3fb, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634093705",
  "device_ref": "sandbox-9565"
}
```

```json
{
  "challenge_id": "a33974cd-7d87-46cb-86c6-36d03440cb92",
  "expires_at": "2026-10-29T15:01:11.105309524Z",
  "resend_available_at": "2026-10-29T14:56:12.105309524Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634093705` → **200**

```json
{
  "phone": "+380634093705",
  "audience": "CLIENT",
  "code": "490428",
  "sent_at": "2026-10-29T14:56:11.108414178Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a33974cd-7d87-46cb-86c6-36d03440cb92",
  "code": "490428",
  "device_ref": "sandbox-9565"
}
```

```json
{
  "session_id": "3f58acd2-b5eb-4eb7-9575-8f6cd6de24f0",
  "subject": {
    "type": "CLIENT",
    "id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmQ0YTA0Yi01N2I0LTQ3NjctOWIxMC03MzNlMDYwMWRkZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjcxLCJpYXQiOjE3OTMyODU3NzEsImp0aSI6IjMxOGYzOWUxLWFlZGEtNDZlZS05ZGEzLTNmOTJiM2VlYTQ4ZiIsInNpZCI6IjNmNThhY2QyLWI1ZWItNGViNy05NTc1LThmNmNkNmRlMjRmMCJ9.hEIENfRiV7QWdxEHVhWb6GNc7NEbJHOmBw5IuF-3qRc",
  "access_expires_at": "2026-10-29T15:11:11.425061621Z",
  "refresh_token": "ZNRbkpKPO-Us74baJfu2KiW5sYzwDzkQeUzyyhlKjj0",
  "refresh_expires_at": "2026-11-28T14:56:11.424499672Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8",
  "session_id": "3f58acd2-b5eb-4eb7-9575-8f6cd6de24f0",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634093705",
  "device_ref": "sandbox-19449"
}
```

```json
{
  "challenge_id": "df819fe8-62ef-433d-89e2-c56eabf8e953",
  "expires_at": "2026-10-29T15:01:13.997584932Z",
  "resend_available_at": "2026-10-29T14:56:14.997584932Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634093705` → **200**

```json
{
  "phone": "+380634093705",
  "audience": "CLIENT",
  "code": "105477",
  "sent_at": "2026-10-29T14:56:14.000190782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df819fe8-62ef-433d-89e2-c56eabf8e953",
  "code": "105477",
  "device_ref": "sandbox-19449"
}
```

```json
{
  "session_id": "2b6e208f-e0a9-46e6-bce4-2bb30c983d1f",
  "subject": {
    "type": "CLIENT",
    "id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmQ0YTA0Yi01N2I0LTQ3NjctOWIxMC03MzNlMDYwMWRkZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2Njc0LCJpYXQiOjE3OTMyODU3NzQsImp0aSI6ImE4MzBjOTZjLTMyYTItNGNiMS1hM2I5LWVlYTNlZjYzNGRlYSIsInNpZCI6IjJiNmUyMDhmLWUwYTktNDZlNi1iY2U0LTJiYjMwYzk4M2QxZiJ9.xm4sUyzq_BuP1tj2Soot4TXagegtdMgsYysFe-WI1XA",
  "access_expires_at": "2026-10-29T15:11:14.322586179Z",
  "refresh_token": "hUp_VyoMzZExwU9SmWKj0-sxMCH-q4npC1y7Ku3EbmU",
  "refresh_expires_at": "2026-11-28T14:56:14.3220568Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "88d0703f-c1af-4516-af84-386a10110988",
  "expires_at": "2026-10-29T15:01:16.619069885Z",
  "resend_available_at": "2026-10-29T14:56:17.619069885Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634093705` → **200**

```json
{
  "phone": "+380634093705",
  "audience": "CLIENT",
  "code": "586095",
  "sent_at": "2026-10-29T14:56:16.621530343Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380633667738"
}
```

```json
{
  "challenge_id": "b698ee9d-53f5-42e4-a2ff-5d6a74f330b0",
  "expires_at": "2026-10-29T15:01:16.945487126Z",
  "resend_available_at": "2026-10-29T14:56:17.945487126Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633667738` → **200**

```json
{
  "phone": "+380633667738",
  "audience": "CLIENT",
  "code": "552600",
  "sent_at": "2026-10-29T14:56:16.947596609Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "3774033e-8a6e-46e9-b466-b85302ba90cb",
  "current_challenge_id": "88d0703f-c1af-4516-af84-386a10110988",
  "current_code": "000000",
  "new_challenge_id": "b698ee9d-53f5-42e4-a2ff-5d6a74f330b0",
  "new_code": "552600"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "a49e254c-d352-425c-a81d-da9851183ab1"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "aa95ed80-1b55-42e3-a63f-f54dbbade939",
  "current_challenge_id": "88d0703f-c1af-4516-af84-386a10110988",
  "current_code": "586095",
  "new_challenge_id": "b698ee9d-53f5-42e4-a2ff-5d6a74f330b0",
  "new_code": "552600"
}
```

```json
{
  "subject_id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8",
  "phone": "+380633667738",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8",
  "session_id": "3f58acd2-b5eb-4eb7-9575-8f6cd6de24f0",
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
  "correlation_id": "0ff004a2-419e-4563-a5ca-518984bc7552"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633667738",
  "device_ref": "sandbox-23473"
}
```

```json
{
  "challenge_id": "d3629674-9d3a-4fd4-9ba1-c8be3be31191",
  "expires_at": "2026-10-29T15:01:20.417585119Z",
  "resend_available_at": "2026-10-29T14:56:21.417585119Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633667738` → **200**

```json
{
  "phone": "+380633667738",
  "audience": "CLIENT",
  "code": "361765",
  "sent_at": "2026-10-29T14:56:20.420384711Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3629674-9d3a-4fd4-9ba1-c8be3be31191",
  "code": "361765",
  "device_ref": "sandbox-23473"
}
```

```json
{
  "session_id": "cb921fb0-22e5-4a5a-8cd1-205b36907c39",
  "subject": {
    "type": "CLIENT",
    "id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmQ0YTA0Yi01N2I0LTQ3NjctOWIxMC03MzNlMDYwMWRkZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NjgwLCJpYXQiOjE3OTMyODU3ODAsImp0aSI6Ijc3NzI3YTJkLTA4NDktNGE5ZS1hYTM5LWMzYzRjYjJhZGJmYyIsInNpZCI6ImNiOTIxZmIwLTIyZTUtNGE1YS04Y2QxLTIwNWIzNjkwN2MzOSJ9.yhnwUm01IX6mxZwpmS4IjzYdHWeu8knb_QEATW8GCbY",
  "access_expires_at": "2026-10-29T15:11:20.728933666Z",
  "refresh_token": "MtU4uwUziiIyb2KmkDPAkYVqdiQP7EsUtoQJZ6VrylQ",
  "refresh_expires_at": "2026-11-28T14:56:20.7283903Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8",
  "session_id": "cb921fb0-22e5-4a5a-8cd1-205b36907c39",
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
  "session_id": "0c23cfe8-30f0-4c13-a7a0-a8e2da364b37",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2ODEsImlhdCI6MTc5MzI4NTc4MSwianRpIjoiNDA4N2UwY2EtNTJhNi00YTUyLThiOGYtNjY5ZjIyMWYyZDc3Iiwic2lkIjoiMGMyM2NmZTgtMzBmMC00YzEzLWE3YTAtYThlMmRhMzY0YjM3In0.MJcVKsQcVxJORukeE9fi0UhytjmeIDbqatL8oiO_bqQ",
  "access_expires_at": "2026-10-29T15:11:21.591113568Z",
  "refresh_token": "1ouS3tHQnjzzoItzw5ihtuMHJJXN6aJ20OwBNS1BKUo",
  "refresh_expires_at": "2026-10-30T02:56:21.590337538Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/d2d4a04b-57b4-4767-9b10-733e0601ddf8` → **200**

```json
{
  "client": {
    "id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8",
    "phone": "+380633667738",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:56:11.422909Z",
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

`POST /api/admin/v1/clients/d2d4a04b-57b4-4767-9b10-733e0601ddf8/phone/new-code` → **201**

```json
{
  "phone": "+380639031514"
}
```

```json
{
  "challenge_id": "f272d3eb-3d01-4eb9-b624-e10ef114f1b7",
  "expires_at": "2026-10-29T15:01:22.210936901Z",
  "resend_available_at": "2026-10-29T14:56:23.210936901Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639031514` → **200**

```json
{
  "phone": "+380639031514",
  "audience": "CLIENT",
  "code": "518769",
  "sent_at": "2026-10-29T14:56:22.213908817Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/d2d4a04b-57b4-4767-9b10-733e0601ddf8/phone` → **422**

```json
{
  "command_id": "1c640134-edbb-4a00-8229-6a23e8694ccf",
  "expected_version": 3,
  "new_challenge_id": "f272d3eb-3d01-4eb9-b624-e10ef114f1b7",
  "new_code": "518770",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/d2d4a04b-57b4-4767-9b10-733e0601ddf8/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "946f9cb7-3ad0-4015-a104-d459fbcad8e4"
}
```

`POST /api/admin/v1/clients/d2d4a04b-57b4-4767-9b10-733e0601ddf8/phone` → **400**

```json
{
  "command_id": "b2d9e0e1-e456-4038-a95a-633b5f1bd101",
  "expected_version": 3,
  "new_challenge_id": "f272d3eb-3d01-4eb9-b624-e10ef114f1b7",
  "new_code": "518769",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/d2d4a04b-57b4-4767-9b10-733e0601ddf8/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "06d20416-8695-499e-9225-c4c5fdff2740",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/d2d4a04b-57b4-4767-9b10-733e0601ddf8/phone` → **200**

```json
{
  "command_id": "a45fecb0-c9e4-4ecf-9a5d-405bbaa02b91",
  "expected_version": 3,
  "new_challenge_id": "f272d3eb-3d01-4eb9-b624-e10ef114f1b7",
  "new_code": "518769",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8",
  "phone": "+380639031514",
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
  "correlation_id": "2245dd48-ec26-4925-9385-4d5616fa78a5"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639031514",
  "device_ref": "sandbox-22681"
}
```

```json
{
  "challenge_id": "3e560cb3-b73c-4e4b-aa7a-46fbf559db3e",
  "expires_at": "2026-10-29T15:01:23.684456721Z",
  "resend_available_at": "2026-10-29T14:56:24.684456721Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639031514` → **200**

```json
{
  "phone": "+380639031514",
  "audience": "CLIENT",
  "code": "943010",
  "sent_at": "2026-10-29T14:56:23.687276379Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e560cb3-b73c-4e4b-aa7a-46fbf559db3e",
  "code": "943010",
  "device_ref": "sandbox-22681"
}
```

```json
{
  "session_id": "ff6fd5b3-076c-47dd-b3aa-06ce0d494390",
  "subject": {
    "type": "CLIENT",
    "id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMmQ0YTA0Yi01N2I0LTQ3NjctOWIxMC03MzNlMDYwMWRkZjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2Njg0LCJpYXQiOjE3OTMyODU3ODQsImp0aSI6IjM3ZGI1YWM3LTQ0MTAtNDYzZC1iMWNhLWEyNmI2Yzk2NTAwNiIsInNpZCI6ImZmNmZkNWIzLTA3NmMtNDdkZC1iM2FhLTA2Y2UwZDQ5NDM5MCJ9.XOAjiqRvCEI8SvJJGSVKcfhOtKopSPYia2BbdBu47QU",
  "access_expires_at": "2026-10-29T15:11:24.001614476Z",
  "refresh_token": "a7dY8r6Z89h3uSl7uAQoNTebW5MQvXEbFQ4FOgjWscc",
  "refresh_expires_at": "2026-11-28T14:56:24.001079314Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d2d4a04b-57b4-4767-9b10-733e0601ddf8",
  "session_id": "ff6fd5b3-076c-47dd-b3aa-06ce0d494390",
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
  "phone": "+380634562301",
  "device_ref": "sandbox-31864"
}
```

```json
{
  "challenge_id": "876cd290-eb35-4a08-9a5f-d2871176ca88",
  "expires_at": "2026-10-29T15:01:24.567699909Z",
  "resend_available_at": "2026-10-29T14:56:25.567699909Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634562301` → **200**

```json
{
  "phone": "+380634562301",
  "audience": "CLIENT",
  "code": "894905",
  "sent_at": "2026-10-29T14:56:24.570247462Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "876cd290-eb35-4a08-9a5f-d2871176ca88",
  "code": "894905",
  "device_ref": "sandbox-31864"
}
```

```json
{
  "session_id": "75cff65a-7889-4040-a44a-9f104b7f33c1",
  "subject": {
    "type": "CLIENT",
    "id": "4e4f21a1-fb95-477d-9a44-2114f7a8e625"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTRmMjFhMS1mYjk1LTQ3N2QtOWE0NC0yMTE0ZjdhOGU2MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2Njg0LCJpYXQiOjE3OTMyODU3ODQsImp0aSI6IjAyNDY2NThmLTIxNDYtNDljNS1iZTBjLWM5OGNmZWIzZGNlNyIsInNpZCI6Ijc1Y2ZmNjVhLTc4ODktNDA0MC1hNDRhLTlmMTA0YjdmMzNjMSJ9.OBZOyk7LUnd4z0gB3lezvjJMdmlrjrfZWXwHQri8bac",
  "access_expires_at": "2026-10-29T15:11:24.893640571Z",
  "refresh_token": "74Dwh79XvgVOWzvLVr1s6gNXmPBTEuBcuf24G9Rl8UI",
  "refresh_expires_at": "2026-11-28T14:56:24.893154813Z",
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
  "session_id": "03074082-3f58-4f84-96ed-1d8d8e08ff60",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2ODYsImlhdCI6MTc5MzI4NTc4NiwianRpIjoiZmQ5NGFjYWItNDcwMi00MjRmLWI0M2YtZWM0MTI1ZjNhOTMzIiwic2lkIjoiMDMwNzQwODItM2Y1OC00Zjg0LTk2ZWQtMWQ4ZDhlMDhmZjYwIn0._KZlJzipU7Pfovd7I_TQhQR694eOrV_E1oTX_wlu69k",
  "access_expires_at": "2026-10-29T15:11:26.088647294Z",
  "refresh_token": "tBME1ZDBMxBYfG1spli99jYf_W9BqS8nliut8uiJ5_g",
  "refresh_expires_at": "2026-10-30T02:56:26.088087868Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634562301` → **200**

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
  "correlation_id": "2b447f1a-2121-4595-b9f3-ef478c21ec80"
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
  "session_id": "79650370-ee6e-4b20-b9eb-90a6d8fdccf5",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2ODcsImlhdCI6MTc5MzI4NTc4NywianRpIjoiZjY3NzEwYzItN2EwNi00ZWZlLTk1ZTgtNjAzNDM2YjZjMjc2Iiwic2lkIjoiNzk2NTAzNzAtZWU2ZS00YjIwLWI5ZWItOTBhNmQ4ZmRjY2Y1In0.Dh8hCf4gMHkSnb3t0LbqOoSflyY8SFzinBIHpFhKTf4",
  "access_expires_at": "2026-10-29T15:11:27.277090889Z",
  "refresh_token": "elKovgqlWPQMM15eHNQp6BQwiNAh88Jo1ntg5Nf3Bdo",
  "refresh_expires_at": "2026-10-30T02:56:27.276505926Z",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:52:18.201064Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "52ba9954-46c2-4fcd-9ffb-3e15f01f7891",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T14:56:27.883242666Z"
}
```

## The rider books the airport for 2026-10-29T17:56:26Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600137089",
  "device_ref": "sandbox-11629"
}
```

```json
{
  "challenge_id": "028a457d-cd2d-467e-b04e-ccb5b55e3699",
  "expires_at": "2026-10-29T15:01:28.18979595Z",
  "resend_available_at": "2026-10-29T14:56:29.18979595Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600137089` → **200**

```json
{
  "phone": "+48600137089",
  "audience": "CLIENT",
  "code": "864699",
  "sent_at": "2026-10-29T14:56:28.192406375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "028a457d-cd2d-467e-b04e-ccb5b55e3699",
  "code": "864699",
  "device_ref": "sandbox-11629"
}
```

```json
{
  "session_id": "cc0e33ff-066a-4017-8287-df22c2acdf61",
  "subject": {
    "type": "CLIENT",
    "id": "fe99079b-826c-4abd-9259-862440b16536"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTk5MDc5Yi04MjZjLTRhYmQtOTI1OS04NjI0NDBiMTY1MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2Njg4LCJpYXQiOjE3OTMyODU3ODgsImp0aSI6IjY0YjVlN2FkLWM1NjAtNDc1OC1hYzkxLTkzNTc0ODU4NGY3YyIsInNpZCI6ImNjMGUzM2ZmLTA2NmEtNDAxNy04Mjg3LWRmMjJjMmFjZGY2MSJ9.KbU8wQzyDlTZKI4iouiDD6zjOH6jwoNeE-zR8GJcxDg",
  "access_expires_at": "2026-10-29T15:11:28.51236795Z",
  "refresh_token": "M_fXnm8MAQ9NPxx8VHgxDyqGsK1lsJtjSdrmFTkSO2w",
  "refresh_expires_at": "2026-11-28T14:56:28.511728426Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "610272b1-56f8-43fd-a1f4-33c0ad07a280",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T17:56:26Z"
}
```

```json
{
  "id": "1dacab4c-c6de-43fc-a84b-7474acd9eee7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:01:28.804498Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:56:26Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "947af834-8b66-4211-a4d0-2f3598ebc6a4",
  "quote_id": "1dacab4c-c6de-43fc-a84b-7474acd9eee7",
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
  "pickup_at": "2026-10-29T17:56:26Z"
}
```

```json
{
  "id": "fc514bbb-cc2c-4942-a667-a0ef75b2976c",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fe99079b-826c-4abd-9259-862440b16536",
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
  "created_at": "2026-10-29T14:56:29.109905Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:56:26Z",
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
  "device_ref": "sandbox-32134"
}
```

```json
{
  "challenge_id": "90296462-5430-477b-8ec4-eaeabfe45df8",
  "expires_at": "2026-10-29T15:01:29.412965144Z",
  "resend_available_at": "2026-10-29T14:56:30.412965144Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "189421",
  "sent_at": "2026-10-29T14:56:29.415615506Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90296462-5430-477b-8ec4-eaeabfe45df8",
  "code": "189421",
  "device_ref": "sandbox-32134"
}
```

```json
{
  "session_id": "d9cbe825-3c67-4d3b-a5c6-aa07236ba49e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjY4OSwiaWF0IjoxNzkzMjg1Nzg5LCJqdGkiOiJmZjlhMDUxYi00YTBkLTQwMjAtODE4NS0zNzYzYzY1YWUzZmIiLCJzaWQiOiJkOWNiZTgyNS0zYzY3LTRkM2ItYTVjNi1hYTA3MjM2YmE0OWUifQ.Zo1H19KwTqEXGlpHc4J9XgOovMl_4z8TGsWpRAeglfk",
  "access_expires_at": "2026-10-29T15:11:29.726801946Z",
  "refresh_token": "-CdFLSH1FMvMbwNbdwuDx6FZTBXsy-76h69LUvu6A3g",
  "refresh_expires_at": "2026-11-28T14:56:29.726243041Z",
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
  "command_id": "a27462a6-5201-4327-af08-9f7086551857",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:30Z",
    "sequence": 1793285790308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4568c5c0-0120-40c1-885a-5388f3797600",
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
  "last_heartbeat_at": "2026-10-29T14:56:30.328098Z",
  "last_location_at": "2026-10-29T14:56:30.328098Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "fc514bbb-cc2c-4942-a667-a0ef75b2976c",
      "short_number": 24,
      "pickup_at": "2026-10-29T17:56:26Z",
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

`POST /api/driver/v1/preorders/fc514bbb-cc2c-4942-a667-a0ef75b2976c/reserve` → **200**

```json
{
  "command_id": "a5efe9fc-a763-4105-be82-54ca05229ffa"
}
```

```json
{
  "id": "7fb953ba-04fc-494b-8e54-cf1cb91fc042",
  "state": "RESERVED",
  "order": {
    "order_id": "fc514bbb-cc2c-4942-a667-a0ef75b2976c",
    "short_number": 24,
    "pickup_at": "2026-10-29T17:56:26Z",
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
  "reserved_at": "2026-10-29T14:56:30.926861Z",
  "confirm_from": "2026-10-29T17:26:26Z",
  "confirm_until": "2026-10-29T17:36:26Z",
  "drop_until": "2026-10-29T16:56:26Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "7fb953ba-04fc-494b-8e54-cf1cb91fc042",
      "state": "RESERVED",
      "order": {
        "order_id": "fc514bbb-cc2c-4942-a667-a0ef75b2976c",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:56:26Z",
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
      "reserved_at": "2026-10-29T14:56:30.926861Z",
      "confirm_from": "2026-10-29T17:26:26Z",
      "confirm_until": "2026-10-29T17:36:26Z",
      "drop_until": "2026-10-29T16:56:26Z"
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
      "id": "7fb953ba-04fc-494b-8e54-cf1cb91fc042",
      "state": "RESERVED",
      "order": {
        "order_id": "fc514bbb-cc2c-4942-a667-a0ef75b2976c",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:56:26Z",
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
      "reserved_at": "2026-10-29T14:56:30.926861Z",
      "confirm_from": "2026-10-29T17:26:26Z",
      "confirm_until": "2026-10-29T17:36:26Z",
      "drop_until": "2026-10-29T16:56:26Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/7fb953ba-04fc-494b-8e54-cf1cb91fc042/confirm` → **409**

```json
{
  "command_id": "78384a91-bab8-4dd2-bb81-4180e2d4aa10"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/7fb953ba-04fc-494b-8e54-cf1cb91fc042/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b6936ee9-cc72-42d9-b556-ff32fa497d32"
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
  "session_id": "3952052b-3ccd-4f74-9567-cc93be4151e4",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2OTIsImlhdCI6MTc5MzI4NTc5MiwianRpIjoiNDUwY2U4YjItNWJjNi00MjRkLTk4YWItNGJmYzQzYjczMjliIiwic2lkIjoiMzk1MjA1MmItM2NjZC00Zjc0LTk1NjctY2M5M2JlNDE1MWU0In0.yn_I1KZbGwjONedZiyIi-YVGzpNiD-BOSMI2tdqbq0o",
  "access_expires_at": "2026-10-29T15:11:32.389999799Z",
  "refresh_token": "fjfKnfNYd_bzI1ysC34uQficVRv9qPsadUprd7W8914",
  "refresh_expires_at": "2026-10-30T02:56:32.389455582Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/fc514bbb-cc2c-4942-a667-a0ef75b2976c` → **200**

```json
{
  "id": "fc514bbb-cc2c-4942-a667-a0ef75b2976c",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "fe99079b-826c-4abd-9259-862440b16536",
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
  "created_at": "2026-10-29T14:56:29.109905Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T17:56:26Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "7fb953ba-04fc-494b-8e54-cf1cb91fc042",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T14:56:30.926861Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/fc514bbb-cc2c-4942-a667-a0ef75b2976c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T14:56:29.111121Z",
      "actor": {
        "type": "CLIENT",
        "id": "fe99079b-826c-4abd-9259-862440b16536",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "fc514bbb-cc2c-4942-a667-a0ef75b2976c",
        "preorder": true,
        "quote_id": "1dacab4c-c6de-43fc-a84b-7474acd9eee7",
        "pickup_at": "2026-10-29T17:56:26Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "a63af80f-136a-400d-88df-c2d60c31348f"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T14:56:30.928071Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fc514bbb-cc2c-4942-a667-a0ef75b2976c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "7fb953ba-04fc-494b-8e54-cf1cb91fc042"
      },
      "correlation_id": "0a5bc432-0e0d-41b3-8173-af1d1b3c2ef4"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order fc514bbb-cc2c-4942-a667-a0ef75b2976c, reservation 7fb953ba-04fc-494b-8e54-cf1cb91fc042.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10329"
}
```

```json
{
  "challenge_id": "b33b0647-7d1d-4ff8-82bb-b5e8185aa949",
  "expires_at": "2026-10-29T15:01:33.305003427Z",
  "resend_available_at": "2026-10-29T14:56:34.305003427Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "626084",
  "sent_at": "2026-10-29T14:56:33.307921742Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b33b0647-7d1d-4ff8-82bb-b5e8185aa949",
  "code": "626084",
  "device_ref": "sandbox-10329"
}
```

```json
{
  "session_id": "059c18c5-5ad4-446b-9a07-7ac5b408ffbc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjY5MywiaWF0IjoxNzkzMjg1NzkzLCJqdGkiOiJmZDliM2NmMy0zODU2LTRlNDItYTc4Ni03ZGNlYzBkOTA5YjMiLCJzaWQiOiIwNTljMThjNS01YWQ0LTQ0NmItOWEwNy03YWM1YjQwOGZmYmMifQ.ToacsPZ_9MxL6mBfn5-nfVwEiZlfbPDD7V3MQ9PuhDw",
  "access_expires_at": "2026-10-29T15:11:33.62647724Z",
  "refresh_token": "pWGbTgyBPjjppJmAVnZ8ysgnvv6uoSF6LTzhvWBJHUU",
  "refresh_expires_at": "2026-11-28T14:56:33.625987625Z",
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
  "command_id": "cd9fa69e-6f6b-471e-9674-e01cfb2e674c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:34Z",
    "sequence": 1793285794193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8405105f-b2b8-4b7a-9075-260763e40fa2",
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
  "last_heartbeat_at": "2026-10-29T14:56:34.212164Z",
  "last_location_at": "2026-10-29T14:56:34.212164Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674217409",
  "device_ref": "sandbox-1984"
}
```

```json
{
  "challenge_id": "f55cd3f3-2262-4cc6-81b0-2940ede5e125",
  "expires_at": "2026-10-29T15:01:34.498387645Z",
  "resend_available_at": "2026-10-29T14:56:35.498387645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674217409` → **200**

```json
{
  "phone": "+380674217409",
  "audience": "CLIENT",
  "code": "654840",
  "sent_at": "2026-10-29T14:56:34.501349768Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f55cd3f3-2262-4cc6-81b0-2940ede5e125",
  "code": "654840",
  "device_ref": "sandbox-1984"
}
```

```json
{
  "session_id": "65cd09e2-1a4d-40e2-908c-d15658c14683",
  "subject": {
    "type": "CLIENT",
    "id": "e5eebee3-e81d-4615-84d0-f6468bdab508"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNWVlYmVlMy1lODFkLTQ2MTUtODRkMC1mNjQ2OGJkYWI1MDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2Njk0LCJpYXQiOjE3OTMyODU3OTQsImp0aSI6ImEzYzc5ZTExLTZlOGEtNGUzMS04OGRjLWEzODlkNzVmM2VjZSIsInNpZCI6IjY1Y2QwOWUyLTFhNGQtNDBlMi05MDhjLWQxNTY1OGMxNDY4MyJ9.KMtWuyXztHexEXsygWrxmc8jP6W2xk7a4Ssja_rwd_g",
  "access_expires_at": "2026-10-29T15:11:34.819450969Z",
  "refresh_token": "aazsMv95KlB3wlKHVXuV5mcU1dqMieBGqJERqJYJM4Y",
  "refresh_expires_at": "2026-11-28T14:56:34.818713851Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ee52e739-7c66-4092-8fcf-8bc4c08c2eae",
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
  "id": "5c53728e-bd59-404c-860a-1e369a890a94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:01:35.124191Z",
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
  "command_id": "71d75240-037b-4512-b7b9-57ab0152cf38",
  "quote_id": "5c53728e-bd59-404c-860a-1e369a890a94",
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
  "id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e5eebee3-e81d-4615-84d0-f6468bdab508",
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
  "created_at": "2026-10-29T14:56:35.430953Z",
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
    "id": "135382ba-de9f-41cd-9bbe-c10befbc9188",
    "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
    "expires_at": "2026-10-29T14:56:50.434638Z",
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

`POST /api/driver/v1/offers/135382ba-de9f-41cd-9bbe-c10befbc9188/accept` → **200**

```json
{
  "command_id": "a8040f6c-f339-47f2-b973-1efdc5bd7535"
}
```

```json
{
  "id": "5a260aed-be42-4e44-a3e3-d48f3b6794b1",
  "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "953ab5a8-8055-47a4-825c-c3bf4bb58f7b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "953ab5a8-8055-47a4-825c-c3bf4bb58f7b",
  "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "assignment_id": "5a260aed-be42-4e44-a3e3-d48f3b6794b1",
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

`POST /api/driver/v1/work-sessions/8405105f-b2b8-4b7a-9075-260763e40fa2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:36Z",
    "sequence": 1793285796611
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8405105f-b2b8-4b7a-9075-260763e40fa2",
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
  "last_heartbeat_at": "2026-10-29T14:56:36.630748Z",
  "last_location_at": "2026-10-29T14:56:36.630748Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "953ab5a8-8055-47a4-825c-c3bf4bb58f7b",
  "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "assignment_id": "5a260aed-be42-4e44-a3e3-d48f3b6794b1",
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

`POST /api/driver/v1/trips/953ab5a8-8055-47a4-825c-c3bf4bb58f7b/arrive` → **200**

```json
{
  "command_id": "967e537e-c2f7-48a1-a29a-d27ac17353ff",
  "expected_version": 0
}
```

```json
{
  "id": "953ab5a8-8055-47a4-825c-c3bf4bb58f7b",
  "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "assignment_id": "5a260aed-be42-4e44-a3e3-d48f3b6794b1",
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
  "arrived_at": "2026-10-29T14:56:37.213362Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/953ab5a8-8055-47a4-825c-c3bf4bb58f7b/start` → **200**

```json
{
  "command_id": "71c66b45-0381-4e26-b4e7-86b075a73ec0",
  "expected_version": 1
}
```

```json
{
  "id": "953ab5a8-8055-47a4-825c-c3bf4bb58f7b",
  "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "assignment_id": "5a260aed-be42-4e44-a3e3-d48f3b6794b1",
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
  "arrived_at": "2026-10-29T14:56:37.213362Z",
  "started_at": "2026-10-29T14:56:37.515383Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8405105f-b2b8-4b7a-9075-260763e40fa2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:37Z",
    "sequence": 1793285797797
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8405105f-b2b8-4b7a-9075-260763e40fa2",
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
  "last_heartbeat_at": "2026-10-29T14:56:37.816711Z",
  "last_location_at": "2026-10-29T14:56:37.816711Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/953ab5a8-8055-47a4-825c-c3bf4bb58f7b/complete` → **200**

```json
{
  "command_id": "59366279-0b0d-4d77-9207-7261025c7615",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:56:38Z",
  "cash_received": true
}
```

```json
{
  "id": "953ab5a8-8055-47a4-825c-c3bf4bb58f7b",
  "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "assignment_id": "5a260aed-be42-4e44-a3e3-d48f3b6794b1",
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
  "arrived_at": "2026-10-29T14:56:37.213362Z",
  "started_at": "2026-10-29T14:56:37.515383Z",
  "completed_at": "2026-10-29T14:56:38.111966Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/d73702e5-1b56-4d3f-98ad-68af9eb16d9c/rating` → **200**

```json
{
  "command_id": "0d99a111-4cc8-47d2-aa7c-46afc20c4281",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "score": 5,
  "created_at": "2026-10-29T14:56:38.436542187Z"
}
```

`POST /api/driver/v1/orders/d73702e5-1b56-4d3f-98ad-68af9eb16d9c/rating` → **200**

```json
{
  "command_id": "f2b242a7-19b0-42ea-88b9-81c673409304",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
  "score": 4,
  "created_at": "2026-10-29T14:56:38.737667042Z"
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
  "session_id": "3224bbf5-b948-4ac5-b6c8-70fff69b7d32",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY2OTksImlhdCI6MTc5MzI4NTc5OSwianRpIjoiN2UyNTkyZGItODM0NS00ZDIyLTg3YjktMzIwYjExODQ2MzdjIiwic2lkIjoiMzIyNGJiZjUtYjk0OC00YWM1LWI2YzgtNzBmZmY2OWI3ZDMyIn0.Yxn2nc6EM9Kxcg3ou_jr9NqWU-LWAhyOBQuEHsLafx4",
  "access_expires_at": "2026-10-29T15:11:39.612750484Z",
  "refresh_token": "9pB3lKmTeJEpyh_-lLFNRdiJyuXVT2s3-3cufN_JfrM",
  "refresh_expires_at": "2026-10-30T02:56:39.612219183Z",
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
  "session_id": "6bfaf72c-72fd-4199-999c-c88bedec9907",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MDAsImlhdCI6MTc5MzI4NTgwMCwianRpIjoiYjlmOGRiOGQtNWI3MC00YjI5LWFlNzItZmRjM2Q1NWI1NGU5Iiwic2lkIjoiNmJmYWY3MmMtNzJmZC00MTk5LTk5OWMtYzg4YmVkZWM5OTA3In0.xjvKhZoH1WrPrfSMDOBCF_wA7FRHOrZ9aL5TSEk8bR0",
  "access_expires_at": "2026-10-29T15:11:40.192916828Z",
  "refresh_token": "cO3uzPz3z3dq9XrXIXyipJVT5wMSGqLqkZj_VkprkEk",
  "refresh_expires_at": "2026-10-30T02:56:40.192344449Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d73702e5-1b56-4d3f-98ad-68af9eb16d9c/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
      "author_type": "RIDER",
      "author_id": "e5eebee3-e81d-4615-84d0-f6468bdab508",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T14:56:38.436542Z"
    },
    {
      "order_id": "d73702e5-1b56-4d3f-98ad-68af9eb16d9c",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "e5eebee3-e81d-4615-84d0-f6468bdab508",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T14:56:38.737667Z"
    }
  ]
}
```

Done: ratings for order d73702e5-1b56-4d3f-98ad-68af9eb16d9c.

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
  "session_id": "8f591906-b1cd-479f-978e-2e9d5d2eda44",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MDEsImlhdCI6MTc5MzI4NTgwMSwianRpIjoiYzFjZjVhNDUtMmU0Zi00Mjc1LTg5MDctNDM1NzExODRiOTRlIiwic2lkIjoiOGY1OTE5MDYtYjFjZC00NzlmLTk3OGUtMmU5ZDVkMmVkYTQ0In0.9uJcjPpKKTFa9W0yWE-YRWxBzBoTKiy3TD_8g3SL5Ro",
  "access_expires_at": "2026-10-29T15:11:41.071707701Z",
  "refresh_token": "ogYtpM9SKNBAmVXrz32EQJ6bZjfiVsY_tJqw5ceC4yE",
  "refresh_expires_at": "2026-10-30T02:56:41.0711987Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "103d8e44-2919-47ed-9a3b-c78627dcf5f2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "81777ab2-4bd3-436b-9022-507d039439a6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:41.370991Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/81777ab2-4bd3-436b-9022-507d039439a6` → **200**

```json
{
  "id": "81777ab2-4bd3-436b-9022-507d039439a6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:41.370991Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/81777ab2-4bd3-436b-9022-507d039439a6` → **200**

```json
{
  "id": "81777ab2-4bd3-436b-9022-507d039439a6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:41.370991Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/81777ab2-4bd3-436b-9022-507d039439a6` → **200**

```json
{
  "id": "81777ab2-4bd3-436b-9022-507d039439a6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:41.370991Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/81777ab2-4bd3-436b-9022-507d039439a6` → **200**

```json
{
  "id": "81777ab2-4bd3-436b-9022-507d039439a6",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:56:41.370991Z",
  "ready_at": "2026-10-29T14:56:44.814193Z",
  "expires_at": "2026-10-30T14:56:44.814193Z"
}
```

`GET /api/admin/v1/reports/exports/81777ab2-4bd3-436b-9022-507d039439a6/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "16e7a997-a10a-45d3-851f-6b6380dbfe88",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "eb6e4daa-4d14-4a97-a294-0e37ab80810b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:45.83865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb6e4daa-4d14-4a97-a294-0e37ab80810b` → **200**

```json
{
  "id": "eb6e4daa-4d14-4a97-a294-0e37ab80810b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:45.83865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb6e4daa-4d14-4a97-a294-0e37ab80810b` → **200**

```json
{
  "id": "eb6e4daa-4d14-4a97-a294-0e37ab80810b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:45.83865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb6e4daa-4d14-4a97-a294-0e37ab80810b` → **200**

```json
{
  "id": "eb6e4daa-4d14-4a97-a294-0e37ab80810b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:56:45.83865Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb6e4daa-4d14-4a97-a294-0e37ab80810b` → **200**

```json
{
  "id": "eb6e4daa-4d14-4a97-a294-0e37ab80810b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:56:45.83865Z",
  "ready_at": "2026-10-29T14:56:49.822193Z",
  "expires_at": "2026-10-30T14:56:49.822193Z"
}
```

`GET /api/admin/v1/reports/exports/eb6e4daa-4d14-4a97-a294-0e37ab80810b/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/da6b3df4-11e0-45ba-950d-8b3a2744234f` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/da6b3df4-11e0-45ba-950d-8b3a2744234f",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6b87bf3c-9b0a-4f36-b55d-a8d492931b47"
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
  "device_ref": "sandbox-321"
}
```

```json
{
  "challenge_id": "d9d68600-dd9d-4a04-b047-3a10d9d16924",
  "expires_at": "2026-10-29T15:01:50.626741774Z",
  "resend_available_at": "2026-10-29T14:56:51.626741774Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "394211",
  "sent_at": "2026-10-29T14:56:50.629562917Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9d68600-dd9d-4a04-b047-3a10d9d16924",
  "code": "394211",
  "device_ref": "sandbox-321"
}
```

```json
{
  "session_id": "8feef99f-3c0b-479a-8451-d1594acf5c97",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjcxMCwiaWF0IjoxNzkzMjg1ODEwLCJqdGkiOiI5NmIyZTExNi05OWRkLTQwMjUtODA2MS0yNWU4Y2ZjMDNkNGYiLCJzaWQiOiI4ZmVlZjk5Zi0zYzBiLTQ3OWEtODQ1MS1kMTU5NGFjZjVjOTcifQ.d7EpH3R8AhfOMjXPjh7JQICRz7Lto-hdnCpYCzaYbuQ",
  "access_expires_at": "2026-10-29T15:11:50.950615682Z",
  "refresh_token": "mEMBMADIh3Ds5bbSPRistyvOJVuZNy3ZGimS1dHAocs",
  "refresh_expires_at": "2026-11-28T14:56:50.950089589Z",
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
  "command_id": "4ec42cbc-da73-4a40-9965-3f738886d5e6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:56:51Z",
    "sequence": 1793285811815
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d60032ef-ddbb-4f62-921d-ec5e5e567b05",
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
  "last_heartbeat_at": "2026-10-29T14:56:51.835003Z",
  "last_location_at": "2026-10-29T14:56:51.835003Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "b6c58385-8beb-48a5-b7f6-473ee3070bde",
  "points": [
    {
      "sequence": 1793285814134,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:55:54Z"
    },
    {
      "sequence": 1793285814142,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:56:54Z"
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
  "session_id": "fb8036b0-43ee-4a60-b737-7f214dd82f73",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MTQsImlhdCI6MTc5MzI4NTgxNCwianRpIjoiYmIzNGQ4NWUtOGVlMS00NDNiLWIzZTktMzlmOTU5ZGE1N2E2Iiwic2lkIjoiZmI4MDM2YjAtNDNlZS00YTYwLWI3MzctN2YyMTRkZDgyZjczIn0.lVyxcaBO1zju9F4FXNghdQYKrNuXPtmO1ev0Nrn7M5s",
  "access_expires_at": "2026-10-29T15:11:54.765614554Z",
  "refresh_token": "lXvhzr_lN9shfdiOALSCLxjUm-1NZxRyGWtgKL_CpUw",
  "refresh_expires_at": "2026-10-30T02:56:54.765041995Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "7fb7022c-7efc-4d6e-9449-5fe45bb97d6c",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T14:56:54Z",
        "track_point_id": "77b7d8fa-e713-4030-8259-d042252bdb10",
        "work_session_id": "d60032ef-ddbb-4f62-921d-ec5e5e567b05"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T14:56:54Z",
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

`POST /api/admin/v1/driver-risk-flags/7fb7022c-7efc-4d6e-9449-5fe45bb97d6c/confirm` → **200**

```json
{
  "command_id": "9ce3dc4c-fe4b-40b2-915b-4828799f9784",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "7fb7022c-7efc-4d6e-9449-5fe45bb97d6c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T14:56:54Z",
    "track_point_id": "77b7d8fa-e713-4030-8259-d042252bdb10",
    "work_session_id": "d60032ef-ddbb-4f62-921d-ec5e5e567b05"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T14:56:54Z",
  "reason": null,
  "reviewed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reviewed_at": "2026-10-29T14:56:55.685951Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/7fb7022c-7efc-4d6e-9449-5fe45bb97d6c/dismiss` → **409**

```json
{
  "command_id": "c61eb5a4-15aa-4da2-9f0f-d571ea12ef7a",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/7fb7022c-7efc-4d6e-9449-5fe45bb97d6c/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5ca0610b-f5a3-45b5-a619-cecbc4a11e5e"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "86582389-aa20-47f7-bc41-6e4f18c77cd1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "1e1ea583-9902-4fb2-8a06-b95fc4e21f1e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "raised_at": "2026-10-29T14:56:56.3014Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/1e1ea583-9902-4fb2-8a06-b95fc4e21f1e/dismiss` → **200**

```json
{
  "command_id": "1ff5888c-c5a1-4ebe-9594-02b1f0b44127",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "1e1ea583-9902-4fb2-8a06-b95fc4e21f1e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "raised_at": "2026-10-29T14:56:56.3014Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reviewed_at": "2026-10-29T14:56:56.603636Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "e5fb34cd-b635-40c3-a2c2-fc26de832696",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "7fb7022c-7efc-4d6e-9449-5fe45bb97d6c"
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
      "actor_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:56:56.922212Z"
    }
  ]
}
```

Done: flag 7fb7022c-7efc-4d6e-9449-5fe45bb97d6c confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "8caa68dc-d812-489f-8613-6bc0d1a375e0",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MTcsImlhdCI6MTc5MzI4NTgxNywianRpIjoiZGJlZDdkMjAtYTkxZC00NTA1LTgzOWItMjY2OTUyOTk2YzNjIiwic2lkIjoiOGNhYTY4ZGMtZDgxMi00ODlmLTg2MTMtNmJjMGQxYTM3NWUwIn0.7hq4q-uab8s14seLWC3y9LKzF5VnpPIvXjOrufkK2E0",
  "access_expires_at": "2026-10-29T15:11:57.842600513Z",
  "refresh_token": "GmN-sDLjQICjrV19UT3HglnTIg-riOBJFTQIJ_8AnYQ",
  "refresh_expires_at": "2026-10-30T02:56:57.84208571Z",
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
      "actor_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:56:56.922212Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "1c95e04e-57d8-4fe9-bf8a-9c0263ec8fe9",
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
  "session_id": "d60032ef-ddbb-4f62-921d-ec5e5e567b05",
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
  "last_heartbeat_at": "2026-10-29T14:56:51.835003Z",
  "last_location_at": "2026-10-29T14:56:51.835003Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d60032ef-ddbb-4f62-921d-ec5e5e567b05/close` → **200**

```json
{
  "command_id": "bc18b5b6-1eed-4562-81f8-f604848619ca",
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
  "session_id": "64d11533-ee76-4257-ac08-18e1018493d5",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MTksImlhdCI6MTc5MzI4NTgxOSwianRpIjoiM2EwYjY4ODMtNWFmOC00Mzc5LWFjOGMtOTNmYjhjODNkNTBhIiwic2lkIjoiNjRkMTE1MzMtZWU3Ni00MjU3LWFjMDgtMThlMTAxODQ5M2Q1In0.yu4IkdxYbH7dV4ImRkfdN4G7k7_zeku71qZKqQ4djDw",
  "access_expires_at": "2026-10-29T15:11:59.610209506Z",
  "refresh_token": "1MgIZ84vuBDICiCzyXCk1uNg5-kPew6pFBFI_zdbgH4",
  "refresh_expires_at": "2026-10-30T02:56:59.609607626Z",
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
  "command_id": "7698d31e-18fb-4e32-8fbb-c933f45eaf02",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:57:00.221409Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "7698d31e-18fb-4e32-8fbb-c933f45eaf02",
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
  "changed_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:57:00.221409Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48355068383",
  "device_ref": "sandbox-12541"
}
```

```json
{
  "challenge_id": "b8622822-0de4-452a-b49c-b2665d17ed22",
  "expires_at": "2026-10-29T15:02:00.832320719Z",
  "resend_available_at": "2026-10-29T14:57:01.832320719Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48355068383` → **200**

```json
{
  "phone": "+48355068383",
  "audience": "CLIENT",
  "code": "406415",
  "sent_at": "2026-10-29T14:57:00.835065038Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8622822-0de4-452a-b49c-b2665d17ed22",
  "code": "406415",
  "device_ref": "sandbox-12541"
}
```

```json
{
  "session_id": "1f524ce4-986b-4883-a12f-c000aef0fc20",
  "subject": {
    "type": "CLIENT",
    "id": "1f6e6c79-dc9b-4d90-a1a8-9ec356b7c261"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjZlNmM3OS1kYzliLTRkOTAtYTFhOC05ZWMzNTZiN2MyNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzIxLCJpYXQiOjE3OTMyODU4MjEsImp0aSI6ImI3MTNhOGUwLTFhOWMtNDNhOC1iYjIzLTIyYzFmNzBlZmI5ZSIsInNpZCI6IjFmNTI0Y2U0LTk4NmItNDg4My1hMTJmLWMwMDBhZWYwZmMyMCJ9.Z28jWY9RwCmd51xtgwfwAwRPv7b5Y13OBOtJMbjNakA",
  "access_expires_at": "2026-10-29T15:12:01.147613373Z",
  "refresh_token": "yKZxNLSvg6ScQTD8VWbqKhLN-ociLZcM92b8WQYsaNc",
  "refresh_expires_at": "2026-11-28T14:57:01.147090249Z",
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
  "correlation_id": "24b8947c-ce9a-4b02-b74d-be5c1da606f7"
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
  "device_ref": "sandbox-8770"
}
```

```json
{
  "challenge_id": "7e78a5f8-bbd4-4f6b-bf0d-92b878ec0038",
  "expires_at": "2026-10-29T15:02:02.000545506Z",
  "resend_available_at": "2026-10-29T14:57:03.000545506Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "613023",
  "sent_at": "2026-10-29T14:57:02.003003614Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e78a5f8-bbd4-4f6b-bf0d-92b878ec0038",
  "code": "613023",
  "device_ref": "sandbox-8770"
}
```

```json
{
  "session_id": "d6f122fd-9c0d-4380-9a33-3c6e721826f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjcyMiwiaWF0IjoxNzkzMjg1ODIyLCJqdGkiOiI3ZmFiY2Q1OS1iOTQzLTQ4YTMtYWRmOS0yOWNhOTVmYzYyMWUiLCJzaWQiOiJkNmYxMjJmZC05YzBkLTQzODAtOWEzMy0zYzZlNzIxODI2ZjMifQ.9J7iHyGwGpmkdNWEnb8SlTIvmY3MVAvad_bRCMlNMKw",
  "access_expires_at": "2026-10-29T15:12:02.310936249Z",
  "refresh_token": "KcWLyyJi7rIrGkOWqn-r_6KXdKSXjGqWwe1_RSVLRsk",
  "refresh_expires_at": "2026-11-28T14:57:02.310389715Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4568c5c0-0120-40c1-885a-5388f3797600",
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
  "last_heartbeat_at": "2026-10-29T14:56:30.328098Z",
  "last_location_at": "2026-10-29T14:56:30.328098Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4568c5c0-0120-40c1-885a-5388f3797600/handover` → **200**

```json
{
  "command_id": "48f88958-0738-4acf-9762-4e42197b7c06",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4568c5c0-0120-40c1-885a-5388f3797600",
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
  "last_heartbeat_at": "2026-10-29T14:56:30.328098Z",
  "last_location_at": "2026-10-29T14:56:30.328098Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4568c5c0-0120-40c1-885a-5388f3797600/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:03Z",
    "sequence": 1793285823204
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4568c5c0-0120-40c1-885a-5388f3797600",
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
  "last_heartbeat_at": "2026-10-29T14:57:03.223044Z",
  "last_location_at": "2026-10-29T14:57:03.223044Z",
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
  "session_id": "4568c5c0-0120-40c1-885a-5388f3797600",
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
  "last_heartbeat_at": "2026-10-29T14:57:03.223044Z",
  "last_location_at": "2026-10-29T14:57:03.223044Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4568c5c0-0120-40c1-885a-5388f3797600/close` → **200**

```json
{
  "command_id": "f2581dcf-f474-432f-a140-c9c279ba526e",
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
  "correlation_id": "c74336ea-084f-41cc-8d98-f406ea4c2c75"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671239329",
  "device_ref": "sandbox-28177"
}
```

```json
{
  "challenge_id": "a9cda265-ca4c-42d6-a143-c4fa80403ede",
  "expires_at": "2026-10-29T15:02:04.691277366Z",
  "resend_available_at": "2026-10-29T14:57:05.691277366Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671239329` → **200**

```json
{
  "phone": "+380671239329",
  "audience": "CLIENT",
  "code": "655973",
  "sent_at": "2026-10-29T14:57:04.694249143Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9cda265-ca4c-42d6-a143-c4fa80403ede",
  "code": "655973",
  "device_ref": "sandbox-28177"
}
```

```json
{
  "session_id": "1b3a3e64-1e48-4cb6-9dd7-59e0f9a0f5c2",
  "subject": {
    "type": "CLIENT",
    "id": "b275b569-0594-4dcc-9e23-2d76e231fe6d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjc1YjU2OS0wNTk0LTRkY2MtOWUyMy0yZDc2ZTIzMWZlNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzI1LCJpYXQiOjE3OTMyODU4MjUsImp0aSI6ImRkYzIyYjkyLTZlODctNDYxZi1hMjY1LTBmMzIwMWVjMzg2MCIsInNpZCI6IjFiM2EzZTY0LTFlNDgtNGNiNi05ZGQ3LTU5ZTBmOWEwZjVjMiJ9.qtrIkQmKSdomfZQQCZG1Sn5mYavGDYRUY5wfJK9jTlI",
  "access_expires_at": "2026-10-29T15:12:05.015750849Z",
  "refresh_token": "7OUFwSaN9EI_gU-wCNd0Jd4DqCFhngLJdwrPSyQeMVg",
  "refresh_expires_at": "2026-11-28T14:57:05.015282483Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "9802dc03-9c22-40a9-9720-5e4cc3028224",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7244cc74-60bb-4da1-b709-ee566185c245",
  "upload_path": "/api/rider/v1/uploads/7244cc74-60bb-4da1-b709-ee566185c245",
  "expires_at": "2026-10-29T15:12:05.303166207Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/7244cc74-60bb-4da1-b709-ee566185c245` → **200**

```json
{
  "file_id": "7244cc74-60bb-4da1-b709-ee566185c245",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b490a3a3-fd1f-4886-8b2a-f3c826e849c0",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "7244cc74-60bb-4da1-b709-ee566185c245"
  ]
}
```

```json
{
  "id": "6e220e04-f191-4345-803c-9425ffc3ce0d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b275b569-0594-4dcc-9e23-2d76e231fe6d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:57:05.633525Z",
  "updated_at": "2026-10-29T14:57:05.633525Z",
  "respond_by": "2026-10-29T18:57:05.633525Z",
  "messages": [
    {
      "id": "f15fb5ca-7869-4659-a2a4-06eaf98e8ed4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b275b569-0594-4dcc-9e23-2d76e231fe6d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:57:05.634587Z",
      "attachments": [
        {
          "file_id": "7244cc74-60bb-4da1-b709-ee566185c245",
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
  "session_id": "014adc12-0d49-4c45-b078-076d079b1dbf",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MjYsImlhdCI6MTc5MzI4NTgyNiwianRpIjoiMjYyYjVhZTMtMDdhMC00ZWNjLTgxODAtMjJmYjNmMTIxMTY4Iiwic2lkIjoiMDE0YWRjMTItMGQ0OS00YzQ1LWIwNzgtMDc2ZDA3OWIxZGJmIn0.y5hxxP9ksQbq60f6ZDnuLcjLk-6Af2UoWRZsu_h1SHY",
  "access_expires_at": "2026-10-29T15:12:06.238948197Z",
  "refresh_token": "NoCmkrhVmNViFW6fyndzOtEdkaiGNKbGTdjVKhzyYHY",
  "refresh_expires_at": "2026-10-30T02:57:06.238376278Z",
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
  "session_id": "a71fec52-88a3-4993-af02-62991d93dbb9",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MjYsImlhdCI6MTc5MzI4NTgyNiwianRpIjoiMDdmN2M0OTEtNTM4YS00NmRjLTgwNzMtYTQ0NzM1ZTc1Nzc1Iiwic2lkIjoiYTcxZmVjNTItODhhMy00OTkzLWFmMDItNjI5OTFkOTNkYmI5In0.7jUIcdw0wiKw2bQeyXmz_rZHN5jmZE3-BUVWtsXGiE4",
  "access_expires_at": "2026-10-29T15:12:06.817203285Z",
  "refresh_token": "irZ1QYJS3tQmKgsmT8E8kZu_Y1W1vZX42sCqwq29gTo",
  "refresh_expires_at": "2026-10-30T02:57:06.816652064Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/6e220e04-f191-4345-803c-9425ffc3ce0d/attachments/7244cc74-60bb-4da1-b709-ee566185c245` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "5afbcdec-635a-41af-8421-a6fa2f017ffe",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b19607b1-9487-4e68-83a8-3fdb276eb399",
  "upload_path": "/api/operator/v1/uploads/b19607b1-9487-4e68-83a8-3fdb276eb399",
  "expires_at": "2026-10-29T15:12:07.120169952Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b19607b1-9487-4e68-83a8-3fdb276eb399` → **200**

```json
{
  "file_id": "b19607b1-9487-4e68-83a8-3fdb276eb399",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/6e220e04-f191-4345-803c-9425ffc3ce0d` → **200**

```json
{
  "id": "6e220e04-f191-4345-803c-9425ffc3ce0d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b275b569-0594-4dcc-9e23-2d76e231fe6d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:57:05.633525Z",
  "updated_at": "2026-10-29T14:57:05.633525Z",
  "respond_by": "2026-10-29T18:57:05.633525Z",
  "messages": [
    {
      "id": "f15fb5ca-7869-4659-a2a4-06eaf98e8ed4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b275b569-0594-4dcc-9e23-2d76e231fe6d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:57:05.634587Z",
      "attachments": [
        {
          "file_id": "7244cc74-60bb-4da1-b709-ee566185c245",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/6e220e04-f191-4345-803c-9425ffc3ce0d/comments` → **200**

```json
{
  "command_id": "ce9cff52-9817-4b2d-b662-e9bb48c34f32",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b19607b1-9487-4e68-83a8-3fdb276eb399"
  ]
}
```

```json
{
  "id": "6e220e04-f191-4345-803c-9425ffc3ce0d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b275b569-0594-4dcc-9e23-2d76e231fe6d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:57:05.633525Z",
  "updated_at": "2026-10-29T14:57:07.787723Z",
  "respond_by": "2026-10-29T18:57:05.633525Z",
  "messages": [
    {
      "id": "f15fb5ca-7869-4659-a2a4-06eaf98e8ed4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b275b569-0594-4dcc-9e23-2d76e231fe6d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:57:05.634587Z",
      "attachments": [
        {
          "file_id": "7244cc74-60bb-4da1-b709-ee566185c245",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b13f0aa0-73d7-4b9d-86cd-19c4d94c74b8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:57:07.7873Z",
      "attachments": [
        {
          "file_id": "b19607b1-9487-4e68-83a8-3fdb276eb399",
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

`GET /api/rider/v1/support/cases/6e220e04-f191-4345-803c-9425ffc3ce0d` → **200**

```json
{
  "id": "6e220e04-f191-4345-803c-9425ffc3ce0d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b275b569-0594-4dcc-9e23-2d76e231fe6d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:57:05.633525Z",
  "updated_at": "2026-10-29T14:57:07.787723Z",
  "respond_by": "2026-10-29T18:57:05.633525Z",
  "messages": [
    {
      "id": "f15fb5ca-7869-4659-a2a4-06eaf98e8ed4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b275b569-0594-4dcc-9e23-2d76e231fe6d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:57:05.634587Z",
      "attachments": [
        {
          "file_id": "7244cc74-60bb-4da1-b709-ee566185c245",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b13f0aa0-73d7-4b9d-86cd-19c4d94c74b8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:57:07.7873Z",
      "attachments": [
        {
          "file_id": "b19607b1-9487-4e68-83a8-3fdb276eb399",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/6e220e04-f191-4345-803c-9425ffc3ce0d/attachments/b19607b1-9487-4e68-83a8-3fdb276eb399` → **200**

Done: support case 6e220e04-f191-4345-803c-9425ffc3ce0d, rider attachment 7244cc74-60bb-4da1-b709-ee566185c245, operator attachment b19607b1-9487-4e68-83a8-3fdb276eb399.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737682732",
  "device_ref": "sandbox-29721"
}
```

```json
{
  "challenge_id": "88b7a0c5-b345-493c-b059-84b1f630227e",
  "expires_at": "2026-10-29T15:02:08.424592251Z",
  "resend_available_at": "2026-10-29T14:57:09.424592251Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737682732` → **200**

```json
{
  "phone": "+380737682732",
  "audience": "CLIENT",
  "code": "680969",
  "sent_at": "2026-10-29T14:57:08.427588615Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88b7a0c5-b345-493c-b059-84b1f630227e",
  "code": "680969",
  "device_ref": "sandbox-29721"
}
```

```json
{
  "session_id": "1802d53a-c216-42da-8b5b-d2a0edf040af",
  "subject": {
    "type": "CLIENT",
    "id": "f405e667-7193-4e99-b2f7-a2a9fdc0472c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNDA1ZTY2Ny03MTkzLTRlOTktYjJmNy1hMmE5ZmRjMDQ3MmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzI4LCJpYXQiOjE3OTMyODU4MjgsImp0aSI6IjU4NTkxOTMzLTI0NTgtNDc4NC04NTY0LWZmN2M5NzI4YTFhNCIsInNpZCI6IjE4MDJkNTNhLWMyMTYtNDJkYS04YjViLWQyYTBlZGYwNDBhZiJ9.32kxxjV1HoVyGF_mo4Q4HCvXDhMEDzaHjVTDXCA1lI4",
  "access_expires_at": "2026-10-29T15:12:08.744158336Z",
  "refresh_token": "OFbBPkEaQszZ4cVDZlze1FRE4RodhquiNEP9hhY8I08",
  "refresh_expires_at": "2026-11-28T14:57:08.743646239Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "33bbb96c-1e7c-4b1d-aeb4-9ac149c6fb58",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c3818dcd-2232-4826-bd44-e29cf6da9253",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c3818dcd-2232-4826-bd44-e29cf6da9253",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "211c10d026410b86d44c03d5f300eb6b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c3818dcd-2232-4826-bd44-e29cf6da9253",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737682732"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c3818dcd-2232-4826-bd44-e29cf6da9253",
  "expires_at": "2026-10-29T15:27:09.036957Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/c3818dcd-2232-4826-bd44-e29cf6da9253` → **200**

```json
{
  "id": "c3818dcd-2232-4826-bd44-e29cf6da9253",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:27:09.036957Z",
  "card": {
    "id": "18f329f2-967a-473d-aac4-5631e1e0d4f4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6293",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:57:09.333102Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "05f5b4db-7840-439d-9f44-bf999c344b6c",
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
  "id": "93992f9c-8c45-4c40-bcac-ad96552bec06",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:02:09.643746Z",
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
  "command_id": "b428682c-802e-430c-8e77-55aebf602ce8",
  "quote_id": "93992f9c-8c45-4c40-bcac-ad96552bec06",
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
  "id": "03afe124-2464-4989-9a38-4471ac0a793b",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f405e667-7193-4e99-b2f7-a2a9fdc0472c",
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
  "created_at": "2026-10-29T14:57:09.94755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/03afe124-2464-4989-9a38-4471ac0a793b` → **200**

```json
{
  "id": "03afe124-2464-4989-9a38-4471ac0a793b",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f405e667-7193-4e99-b2f7-a2a9fdc0472c",
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
  "created_at": "2026-10-29T14:57:09.94755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/03afe124-2464-4989-9a38-4471ac0a793b` → **200**

```json
{
  "id": "03afe124-2464-4989-9a38-4471ac0a793b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f405e667-7193-4e99-b2f7-a2a9fdc0472c",
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
  "created_at": "2026-10-29T14:57:09.94755Z",
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

`GET /api/rider/v1/orders/03afe124-2464-4989-9a38-4471ac0a793b` → **200**

```json
{
  "id": "03afe124-2464-4989-9a38-4471ac0a793b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f405e667-7193-4e99-b2f7-a2a9fdc0472c",
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
  "created_at": "2026-10-29T14:57:09.94755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/03afe124-2464-4989-9a38-4471ac0a793b/switch-to-cash` → **200**

```json
{
  "command_id": "7c32a2e2-b437-42a9-b675-7dd72462af71",
  "expected_version": 3
}
```

```json
{
  "id": "03afe124-2464-4989-9a38-4471ac0a793b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "f405e667-7193-4e99-b2f7-a2a9fdc0472c",
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
  "created_at": "2026-10-29T14:57:09.94755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/03afe124-2464-4989-9a38-4471ac0a793b/switch-to-cash` → **409**

```json
{
  "command_id": "579fdafb-f4f9-4640-b532-9566292ed0b0",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/03afe124-2464-4989-9a38-4471ac0a793b/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "494e385d-4cd5-4dcf-b0e5-3ae8721a40c0"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/03afe124-2464-4989-9a38-4471ac0a793b` → **200**

```json
{
  "id": "03afe124-2464-4989-9a38-4471ac0a793b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "f405e667-7193-4e99-b2f7-a2a9fdc0472c",
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
  "created_at": "2026-10-29T14:57:09.94755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/03afe124-2464-4989-9a38-4471ac0a793b/cancel` → **200**

```json
{
  "command_id": "f6a72c2b-64df-4173-950f-4e6d16063101",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "03afe124-2464-4989-9a38-4471ac0a793b",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f405e667-7193-4e99-b2f7-a2a9fdc0472c",
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
  "created_at": "2026-10-29T14:57:09.94755Z",
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
  "session_id": "0719aa9d-f106-4540-b8b9-7c267e926516",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MzMsImlhdCI6MTc5MzI4NTgzMywianRpIjoiMjRiZmNmODctNTA2Ny00ZjUwLWFiODItMDgxZGFmZmQ0MDdmIiwic2lkIjoiMDcxOWFhOWQtZjEwNi00NTQwLWI4YjktN2MyNjdlOTI2NTE2In0.fmodl3Nb-9plwsmdbqYpL0KCfVHXUjKk6xqnxvVn0K4",
  "access_expires_at": "2026-10-29T15:12:13.720844745Z",
  "refresh_token": "6bIyBnEcghrAaqFPzF45fORSUtpcSehSDIfEPEhXBK4",
  "refresh_expires_at": "2026-10-30T02:57:13.720230265Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19466"
}
```

```json
{
  "challenge_id": "0cf2e13f-e20c-4fbc-88ca-d56c30961dc0",
  "expires_at": "2026-10-29T15:02:14.008782465Z",
  "resend_available_at": "2026-10-29T14:57:15.008782465Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "669970",
  "sent_at": "2026-10-29T14:57:14.011749156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0cf2e13f-e20c-4fbc-88ca-d56c30961dc0",
  "code": "669970",
  "device_ref": "sandbox-19466"
}
```

```json
{
  "session_id": "18ebdbb1-1f96-4ebb-a27d-1208a7df1baa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjczNCwiaWF0IjoxNzkzMjg1ODM0LCJqdGkiOiIwZTdmZTBiMy02ZjZmLTRmN2MtYTQ5YS0xODFiZTYwMDdhMjgiLCJzaWQiOiIxOGViZGJiMS0xZjk2LTRlYmItYTI3ZC0xMjA4YTdkZjFiYWEifQ.wJy-Ip550v0d9QPQbyL4EXibzu6G6L1V3qXqhUBU9ew",
  "access_expires_at": "2026-10-29T15:12:14.325166082Z",
  "refresh_token": "RQecwVLx1XI3D4_9xMo8dt1jBgd4GNqnfM7oFVnwarE",
  "refresh_expires_at": "2026-11-28T14:57:14.324599873Z",
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
      "actor_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:56:56.922212Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T14:56:58.442406Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "05dcc685-a724-4c35-882b-d738871475a9",
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
  "device_ref": "sandbox-5416"
}
```

```json
{
  "challenge_id": "a46aa82c-00c3-4aed-9a2b-083ce58f9a4e",
  "expires_at": "2026-10-29T15:02:15.487498809Z",
  "resend_available_at": "2026-10-29T14:57:16.487498809Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "218168",
  "sent_at": "2026-10-29T14:57:15.490179806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a46aa82c-00c3-4aed-9a2b-083ce58f9a4e",
  "code": "218168",
  "device_ref": "sandbox-5416"
}
```

```json
{
  "session_id": "e69f2d19-f5ce-4eb6-ae1d-31311b8ff847",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NjczNSwiaWF0IjoxNzkzMjg1ODM1LCJqdGkiOiIwNTM2OWVmYy01NDQ5LTQxNDMtYjdkYi00ZTRkNTNiZjkwZTEiLCJzaWQiOiJlNjlmMmQxOS1mNWNlLTRlYjYtYWUxZC0zMTMxMWI4ZmY4NDcifQ.cYUsUkSOgyaJeuTe6h0YTor6zpoE6v3UtaV5nTFgHsU",
  "access_expires_at": "2026-10-29T15:12:15.807673427Z",
  "refresh_token": "00xBLt3cv14EqBzWImFzmu9D77ppX2D-teRhliqWsN8",
  "refresh_expires_at": "2026-11-28T14:57:15.807184352Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8405105f-b2b8-4b7a-9075-260763e40fa2",
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
  "last_heartbeat_at": "2026-10-29T14:56:37.816711Z",
  "last_location_at": "2026-10-29T14:56:37.816711Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8405105f-b2b8-4b7a-9075-260763e40fa2/handover` → **200**

```json
{
  "command_id": "ae11d376-a10d-4121-9e2c-6c210d3eff96",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8405105f-b2b8-4b7a-9075-260763e40fa2",
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
  "last_heartbeat_at": "2026-10-29T14:56:37.816711Z",
  "last_location_at": "2026-10-29T14:56:37.816711Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8405105f-b2b8-4b7a-9075-260763e40fa2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:16Z",
    "sequence": 1793285836698
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8405105f-b2b8-4b7a-9075-260763e40fa2",
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
  "last_heartbeat_at": "2026-10-29T14:57:16.716614Z",
  "last_location_at": "2026-10-29T14:57:16.716614Z",
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
  "command_id": "4596f08e-1e60-426f-b7d5-fb5f6631d1c8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:17Z",
    "sequence": 1793285837293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7a8961f6-17ce-4b42-b2d6-579cbc4fb981",
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
  "last_heartbeat_at": "2026-10-29T14:57:17.312466Z",
  "last_location_at": "2026-10-29T14:57:17.312466Z",
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
  "session_id": "179c73f7-b758-4629-9256-5e4df61cf3a9",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY3MzcsImlhdCI6MTc5MzI4NTgzNywianRpIjoiOTFhMzA4MGUtZjQzNi00YjFmLWEyZDItODZiM2FjN2VlMzJkIiwic2lkIjoiMTc5YzczZjctYjc1OC00NjI5LTkyNTYtNWU0ZGY2MWNmM2E5In0.OGWIdQb_hRf5Qtz7nN4LodloSRgAaEcQOR0cAAYTdnI",
  "access_expires_at": "2026-10-29T15:12:17.90890879Z",
  "refresh_token": "99J6itxgcJZjOAcBKtPKuctERQ4PXvlr4My3GAipkWA",
  "refresh_expires_at": "2026-10-30T02:57:17.908345015Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "430514e8-f994-4eb0-9221-148db7169788",
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
  "id": "223631ea-ac77-4391-a67b-9a377ccca40f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:02:18.202919Z",
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
  "command_id": "2e72cb4d-c5f1-4372-a039-4ede41882bca",
  "quote_id": "223631ea-ac77-4391-a67b-9a377ccca40f",
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
  "id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
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
  "created_at": "2026-10-29T14:57:18.508698Z",
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
    "id": "6a8c38c5-f653-4463-8ba6-407255588244",
    "order_id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
    "expires_at": "2026-10-29T14:57:33.512374Z",
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

`POST /api/driver/v1/offers/6a8c38c5-f653-4463-8ba6-407255588244/accept` → **200**

```json
{
  "command_id": "25993d94-6b14-48fe-a57c-bf76bc4464f8"
}
```

```json
{
  "id": "a2d80fc8-9d94-4fd9-b1d8-149afb1115a5",
  "order_id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb36ee0e-d315-4d27-b276-be3b1bcdedb6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb36ee0e-d315-4d27-b276-be3b1bcdedb6",
  "order_id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
  "assignment_id": "a2d80fc8-9d94-4fd9-b1d8-149afb1115a5",
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

`POST /api/driver/v1/work-sessions/7a8961f6-17ce-4b42-b2d6-579cbc4fb981/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:57:19Z",
    "sequence": 1793285839979
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7a8961f6-17ce-4b42-b2d6-579cbc4fb981",
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
  "last_heartbeat_at": "2026-10-29T14:57:19.998271Z",
  "last_location_at": "2026-10-29T14:57:19.998271Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fb36ee0e-d315-4d27-b276-be3b1bcdedb6/arrive` → **200**

```json
{
  "command_id": "ce53bb13-9c7e-401e-b540-aa6bc80a4b95",
  "expected_version": 0
}
```

```json
{
  "id": "fb36ee0e-d315-4d27-b276-be3b1bcdedb6",
  "order_id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
  "assignment_id": "a2d80fc8-9d94-4fd9-b1d8-149afb1115a5",
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
  "arrived_at": "2026-10-29T14:57:20.301615Z",
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

`POST /api/driver/v1/trips/fb36ee0e-d315-4d27-b276-be3b1bcdedb6/start` → **200**

```json
{
  "command_id": "db007d4a-5e7a-4646-8067-0fb473b66152",
  "expected_version": 1
}
```

```json
{
  "id": "fb36ee0e-d315-4d27-b276-be3b1bcdedb6",
  "order_id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
  "assignment_id": "a2d80fc8-9d94-4fd9-b1d8-149afb1115a5",
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
  "arrived_at": "2026-10-29T14:57:20.301615Z",
  "started_at": "2026-10-29T14:57:20.614111Z",
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

`POST /api/driver/v1/trips/fb36ee0e-d315-4d27-b276-be3b1bcdedb6/complete` → **200**

```json
{
  "command_id": "0aec24f7-137a-49fd-8ede-44b7c249b4f9",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:57:20Z",
  "cash_received": true
}
```

```json
{
  "id": "fb36ee0e-d315-4d27-b276-be3b1bcdedb6",
  "order_id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
  "assignment_id": "a2d80fc8-9d94-4fd9-b1d8-149afb1115a5",
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
  "arrived_at": "2026-10-29T14:57:20.301615Z",
  "started_at": "2026-10-29T14:57:20.614111Z",
  "completed_at": "2026-10-29T14:57:20.921733Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/1a9d3711-b77f-4f16-a401-94a98cfadf9d` → **200**

```json
{
  "id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
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
    "id": "a2d80fc8-9d94-4fd9-b1d8-149afb1115a5",
    "order_id": "1a9d3711-b77f-4f16-a401-94a98cfadf9d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fb36ee0e-d315-4d27-b276-be3b1bcdedb6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:57:18.508698Z",
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
  "session_id": "8405105f-b2b8-4b7a-9075-260763e40fa2",
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
  "last_heartbeat_at": "2026-10-29T14:57:16.716614Z",
  "last_location_at": "2026-10-29T14:57:16.716614Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8405105f-b2b8-4b7a-9075-260763e40fa2/close` → **200**

```json
{
  "command_id": "a9896ff8-92a1-4d2f-ba07-1d2ba3d3cd3c",
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
  "session_id": "7a8961f6-17ce-4b42-b2d6-579cbc4fb981",
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
  "last_heartbeat_at": "2026-10-29T14:57:19.998271Z",
  "last_location_at": "2026-10-29T14:57:19.998271Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a8961f6-17ce-4b42-b2d6-579cbc4fb981/close` → **200**

```json
{
  "command_id": "60624050-e233-465f-a1af-1df65b2cdc89",
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

Done: terminal order 1a9d3711-b77f-4f16-a401-94a98cfadf9d by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18620"
}
```

```json
{
  "challenge_id": "939df0fb-45d3-46ed-94fe-d832cd9163ec",
  "expires_at": "2026-10-29T15:02:26.028392948Z",
  "resend_available_at": "2026-10-29T14:57:27.028392948Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "810043",
  "sent_at": "2026-10-29T14:57:26.031089674Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "939df0fb-45d3-46ed-94fe-d832cd9163ec",
  "code": "810043",
  "device_ref": "sandbox-18620"
}
```

```json
{
  "session_id": "1fe08f18-c288-45cf-b5dd-45815c48bbf7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4Njc0NiwiaWF0IjoxNzkzMjg1ODQ2LCJqdGkiOiI5NDU4MjU5MS0yZjhlLTQ2YjAtYTQ5NS01ZjA0N2UxN2U5MzIiLCJzaWQiOiIxZmUwOGYxOC1jMjg4LTQ1Y2YtYjVkZC00NTgxNWM0OGJiZjcifQ.9R9U2lG7myP7dInsMh0jpCIDW4E4rZ2YfLj9OBIEfrA",
  "access_expires_at": "2026-10-29T15:12:26.34872638Z",
  "refresh_token": "abOWYg0sGKP8YrQqAedRytmGCLocm3LinB0Sex9lOic",
  "refresh_expires_at": "2026-11-28T14:57:26.348187953Z",
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
  "device_ref": "sandbox-28526"
}
```

```json
{
  "challenge_id": "85be6a41-9c88-40df-adcb-d04cc909a782",
  "expires_at": "2026-10-29T15:02:26.92619667Z",
  "resend_available_at": "2026-10-29T14:57:27.92619667Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "754665",
  "sent_at": "2026-10-29T14:57:26.928830611Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85be6a41-9c88-40df-adcb-d04cc909a782",
  "code": "754665",
  "device_ref": "sandbox-28526"
}
```

```json
{
  "session_id": "b6635eb9-f6cc-4009-829e-ea1c9ad2c56b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4Njc0NywiaWF0IjoxNzkzMjg1ODQ3LCJqdGkiOiJjMGQyNGYwMS1iMzEwLTQ2YjMtODJkMC0zMjNlNTA0MTBhMjciLCJzaWQiOiJiNjYzNWViOS1mNmNjLTQwMDktODI5ZS1lYTFjOWFkMmM1NmIifQ.wzubh4QJYxPDoHdKpVGex6I2nOMPLXbetZTHbJkz8f0",
  "access_expires_at": "2026-10-29T15:12:27.243977076Z",
  "refresh_token": "LGD_rZeYe0RPPKcerFAI60ANGffhEAWIHCjmdd6nEpI",
  "refresh_expires_at": "2026-11-28T14:57:27.243434452Z",
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
  "device_ref": "sandbox-6606"
}
```

```json
{
  "challenge_id": "ce6cf91d-a1b5-45d6-80a2-5efadc4200c2",
  "expires_at": "2026-10-29T15:02:27.828525773Z",
  "resend_available_at": "2026-10-29T14:57:28.828525773Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "922055",
  "sent_at": "2026-10-29T14:57:27.831368713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce6cf91d-a1b5-45d6-80a2-5efadc4200c2",
  "code": "922055",
  "device_ref": "sandbox-6606"
}
```

```json
{
  "session_id": "ed420516-fdb0-45e4-9567-3df374ed9130",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4Njc0OCwiaWF0IjoxNzkzMjg1ODQ4LCJqdGkiOiJlYWU2MDBmZi0wNGYwLTQ5MDItOTg5Ny1kOGYzNzdjNGM1MzQiLCJzaWQiOiJlZDQyMDUxNi1mZGIwLTQ1ZTQtOTU2Ny0zZGYzNzRlZDkxMzAifQ.c1CSyorT3LvobE5YGmyj5LleTc2D1csdAhGv5aXAWNg",
  "access_expires_at": "2026-10-29T15:12:28.157882248Z",
  "refresh_token": "7bS2pNWDGZuMqWu2Vv6V9_E0THNTzAxPXqVgITNTBnI",
  "refresh_expires_at": "2026-11-28T14:57:28.157344834Z",
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
  "phone": "+380693417191",
  "device_ref": "sandbox-22668"
}
```

```json
{
  "challenge_id": "046f4803-e6dd-4467-b3bc-5dd4a2f2c636",
  "expires_at": "2026-10-29T15:02:28.720663865Z",
  "resend_available_at": "2026-10-29T14:57:29.720663865Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380693417191` → **200**

```json
{
  "phone": "+380693417191",
  "audience": "CLIENT",
  "code": "835178",
  "sent_at": "2026-10-29T14:57:28.723145166Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "046f4803-e6dd-4467-b3bc-5dd4a2f2c636",
  "code": "835178",
  "device_ref": "sandbox-22668"
}
```

```json
{
  "session_id": "e3cebadb-80c8-443d-95dc-b14cc3dac5f6",
  "subject": {
    "type": "CLIENT",
    "id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjA1YTI1Zi04YzJjLTQ5NmYtYWFmNS00OGYzNTBjMWE3NDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg2NzQ5LCJpYXQiOjE3OTMyODU4NDksImp0aSI6ImM1NWI0MjdlLTQ1NDctNDdlOS04OGU5LWMwYjRhYjNkOWJlZiIsInNpZCI6ImUzY2ViYWRiLTgwYzgtNDQzZC05NWRjLWIxNGNjM2RhYzVmNiJ9.8ABRI2Q-jKFVmwON953IYdL0mF3YB3zfKBU0X3XHkdk",
  "access_expires_at": "2026-10-29T15:12:29.03827854Z",
  "refresh_token": "w2JbFcbDkC4naP1V7aO27_KwSCDTYI7FJLdNNNW22nc",
  "refresh_expires_at": "2026-11-28T14:57:29.037732176Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9a19ba1-76ca-4755-b000-8322805b35e7",
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
  "id": "383387c7-fcd7-43e9-b1ea-6e879a537253",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:02:29.338164Z",
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
  "command_id": "47aae8a9-536f-4f9f-befe-c0c082e23f5c",
  "quote_id": "383387c7-fcd7-43e9-b1ea-6e879a537253",
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
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T14:57:29.646882Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:57:29.646882Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 15.383971579
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.164575627
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

`GET /api/rider/v1/orders/1bb593b7-7f88-4400-83c3-a04467f7156b` → **200**

```json
{
  "id": "1bb593b7-7f88-4400-83c3-a04467f7156b",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8b05a25f-8c2c-496f-aaf5-48f350c1a745",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:57:29.646882Z",
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
  "session_id": "1b0c4684-40f5-4b59-84f1-cf98a4c9309e",
  "subject": {
    "type": "STAFF",
    "id": "3c8dfdd5-4521-451c-afcf-e104776a6f21"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYzhkZmRkNS00NTIxLTQ1MWMtYWZjZi1lMTA0Nzc2YTZmMjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODY5MzEsImlhdCI6MTc5MzI4NjAzMSwianRpIjoiMmE3NTdhMjYtNGZiOS00OTdmLTg3YTAtYjUyZDA4MTMyNGZlIiwic2lkIjoiMWIwYzQ2ODQtNDBmNS00YjU5LTg0ZjEtY2Y5OGE0YzkzMDllIn0.wYQp9zsNC8OxTjkh0R4JIDWuJTvlh-1VQgc8lCnYyg4",
  "access_expires_at": "2026-10-29T15:15:31.729790027Z",
  "refresh_token": "aZr7ciKip2OcSM5BeAOFjxRR59y8tQqQ1lkdFF1tcGw",
  "refresh_expires_at": "2026-10-30T03:00:31.729243004Z",
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
  "id": "961cbd60-c047-4e16-8f3b-6389f4b861bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:32.039721Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:32.03977Z",
  "updated_at": "2026-10-29T15:00:32.056829Z",
  "finished_at": "2026-10-29T15:00:32.056829Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/961cbd60-c047-4e16-8f3b-6389f4b861bc` → **200**

```json
{
  "run": {
    "id": "961cbd60-c047-4e16-8f3b-6389f4b861bc",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:00:32.039721Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:00:32.03977Z",
    "updated_at": "2026-10-29T15:00:32.056829Z",
    "finished_at": "2026-10-29T15:00:32.056829Z",
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
  "id": "961cbd60-c047-4e16-8f3b-6389f4b861bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:32.039721Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:32.03977Z",
  "updated_at": "2026-10-29T15:00:32.056829Z",
  "finished_at": "2026-10-29T15:00:32.056829Z",
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
  "id": "961cbd60-c047-4e16-8f3b-6389f4b861bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:32.039721Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:32.03977Z",
  "updated_at": "2026-10-29T15:00:32.056829Z",
  "finished_at": "2026-10-29T15:00:32.056829Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/56771dfd-0dd9-4107-b8fb-71c6df1a83a0` → **204**

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
  "id": "02179659-8c73-4c41-a989-8c1c964a1368",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:32.50817Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:32.508219Z",
  "updated_at": "2026-10-29T15:00:32.515327Z",
  "finished_at": "2026-10-29T15:00:32.515327Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/02179659-8c73-4c41-a989-8c1c964a1368` → **200**

```json
{
  "run": {
    "id": "02179659-8c73-4c41-a989-8c1c964a1368",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:00:32.50817Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:00:32.508219Z",
    "updated_at": "2026-10-29T15:00:32.515327Z",
    "finished_at": "2026-10-29T15:00:32.515327Z",
    "version": 1
  },
  "items": [
    {
      "id": "7109129f-9c30-4c1b-a3cb-9bfd23cfb345",
      "run_id": "02179659-8c73-4c41-a989-8c1c964a1368",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "57f187089d4e606a4df228923e07df519723b928defce203d6a63a0402a0357c",
      "reference_display": "sandbox-reconciliation-#####dfd-0dd9-4107-b8fb-71c6df1a83a0",
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
      "provider_at": "2026-10-29T15:00:32Z",
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
  "id": "02179659-8c73-4c41-a989-8c1c964a1368",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:32.50817Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:32.508219Z",
  "updated_at": "2026-10-29T15:00:32.515327Z",
  "finished_at": "2026-10-29T15:00:32.515327Z",
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
  "id": "02179659-8c73-4c41-a989-8c1c964a1368",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:32.50817Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:32.508219Z",
  "updated_at": "2026-10-29T15:00:32.515327Z",
  "finished_at": "2026-10-29T15:00:32.515327Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/7109129f-9c30-4c1b-a3cb-9bfd23cfb345/resolve` → **200**

```json
{
  "command_id": "12108798-8b88-4281-a095-5badbfc52a0a",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "7109129f-9c30-4c1b-a3cb-9bfd23cfb345",
  "run_id": "02179659-8c73-4c41-a989-8c1c964a1368",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "57f187089d4e606a4df228923e07df519723b928defce203d6a63a0402a0357c",
  "reference_display": "sandbox-reconciliation-#####dfd-0dd9-4107-b8fb-71c6df1a83a0",
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
  "provider_at": "2026-10-29T15:00:32Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "resolved_at": "2026-10-29T15:00:32.945727Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/7109129f-9c30-4c1b-a3cb-9bfd23cfb345/resolve` → **200**

```json
{
  "command_id": "12108798-8b88-4281-a095-5badbfc52a0a",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "7109129f-9c30-4c1b-a3cb-9bfd23cfb345",
  "run_id": "02179659-8c73-4c41-a989-8c1c964a1368",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "57f187089d4e606a4df228923e07df519723b928defce203d6a63a0402a0357c",
  "reference_display": "sandbox-reconciliation-#####dfd-0dd9-4107-b8fb-71c6df1a83a0",
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
  "provider_at": "2026-10-29T15:00:32Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
  "resolved_at": "2026-10-29T15:00:32.945727Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/7109129f-9c30-4c1b-a3cb-9bfd23cfb345/resolve` → **409**

```json
{
  "command_id": "b01de268-c02a-46d8-bcde-7fad60ed200c",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/7109129f-9c30-4c1b-a3cb-9bfd23cfb345/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "40382173-034e-4f45-b27b-d08d5dca4269"
}
```

`GET /api/admin/v1/payment-reconciliations/02179659-8c73-4c41-a989-8c1c964a1368` → **200**

```json
{
  "run": {
    "id": "02179659-8c73-4c41-a989-8c1c964a1368",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:00:32.50817Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:00:32.508219Z",
    "updated_at": "2026-10-29T15:00:32.945727Z",
    "finished_at": "2026-10-29T15:00:32.515327Z",
    "version": 2
  },
  "items": [
    {
      "id": "7109129f-9c30-4c1b-a3cb-9bfd23cfb345",
      "run_id": "02179659-8c73-4c41-a989-8c1c964a1368",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "57f187089d4e606a4df228923e07df519723b928defce203d6a63a0402a0357c",
      "reference_display": "sandbox-reconciliation-#####dfd-0dd9-4107-b8fb-71c6df1a83a0",
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
      "provider_at": "2026-10-29T15:00:32Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "3c8dfdd5-4521-451c-afcf-e104776a6f21",
      "resolved_at": "2026-10-29T15:00:32.945727Z",
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
      "id": "02179659-8c73-4c41-a989-8c1c964a1368",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T15:00:32.50817Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:00:32.508219Z",
      "updated_at": "2026-10-29T15:00:32.945727Z",
      "finished_at": "2026-10-29T15:00:32.515327Z",
      "version": 2
    },
    {
      "id": "688b344c-8e95-4749-a3d7-a49d289f771f",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T14:52:29.666912Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:52:29.667118Z",
      "updated_at": "2026-10-29T14:52:29.674918Z",
      "finished_at": "2026-10-29T14:52:29.674918Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/56771dfd-0dd9-4107-b8fb-71c6df1a83a0` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "02179659-8c73-4c41-a989-8c1c964a1368",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:00:32.50817Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:00:32.508219Z",
  "updated_at": "2026-10-29T15:00:32.945727Z",
  "finished_at": "2026-10-29T15:00:32.515327Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793286159927E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793286160093E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793286160093E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793286160095E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793286160094E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
