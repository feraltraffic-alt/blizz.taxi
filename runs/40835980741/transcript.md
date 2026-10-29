# Sandbox transcript (2026-10-29T07:32:33Z, 58fc770)

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
  "correlation_id": "d858bf80-26df-4eed-af47-4d560fc6521e"
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
  "session_id": "a789b1e0-5807-42c7-b70e-c613df6f8f7b",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAwNjEsImlhdCI6MTc5MzI1OTE2MSwianRpIjoiNTg4MTgwNjItZmQ2My00ZWU2LTk2ODUtZmJhNjA1YjU1YmFiIiwic2lkIjoiYTc4OWIxZTAtNTgwNy00MmM3LWI3MGUtYzYxM2RmNmY4ZjdiIn0.d75ReR1IKbdAeyyoU85sU3m7wbv50tGj2pjx_k5Vwls",
  "access_expires_at": "2026-10-29T07:47:41.494963245Z",
  "refresh_token": "6MVrUcQF33mZE-D64-o9PKy1HzuzKSmpqXDHl5Lzh08",
  "refresh_expires_at": "2026-10-29T19:32:41.493137363Z",
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
  "session_id": "cd0c6a54-f079-419a-a813-a72e246f14cd",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAwNjIsImlhdCI6MTc5MzI1OTE2MiwianRpIjoiN2I3ZjI3NDAtNzAzNi00MmIxLWEwMWEtMDczOTcyZmI5ODJiIiwic2lkIjoiY2QwYzZhNTQtZjA3OS00MTlhLWE4MTMtYTcyZTI0NmYxNGNkIn0.trTR8WZdhotGGLMMXWAYFbS9kt9kqSpinB8FbzLkE5o",
  "access_expires_at": "2026-10-29T07:47:42.818369731Z",
  "refresh_token": "1eFglB3DDIOtxhxa3lkIXO_O8EpvVrvl9mKXaqKJVvg",
  "refresh_expires_at": "2026-10-29T19:32:42.817558615Z",
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
  "device_ref": "sandbox-22410"
}
```

```json
{
  "challenge_id": "b49d040b-4969-4364-a341-43856a205255",
  "expires_at": "2026-10-29T07:37:43.285538283Z",
  "resend_available_at": "2026-10-29T07:32:44.285538283Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "899056",
  "sent_at": "2026-10-29T07:32:43.295095298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b49d040b-4969-4364-a341-43856a205255",
  "code": "899056",
  "device_ref": "sandbox-22410"
}
```

```json
{
  "session_id": "e186ae4f-e00b-44b5-83c0-cdca3e402eb1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDA2MywiaWF0IjoxNzkzMjU5MTYzLCJqdGkiOiI5OWJkMDk5MS0wN2YwLTQzNmItYTk0My01ZGVjMWIwYjE4ZTkiLCJzaWQiOiJlMTg2YWU0Zi1lMDBiLTQ0YjUtODNjMC1jZGNhM2U0MDJlYjEifQ.cnQtRy7C_P4ccePSVkBRdWOedOQc3GyK2-4CHnfkhaw",
  "access_expires_at": "2026-10-29T07:47:43.55698146Z",
  "refresh_token": "CWVpwdUvC5waN_0sYhXoCOY0wKEhmgTARrgCEJ29rt4",
  "refresh_expires_at": "2026-11-28T07:32:43.556133026Z",
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
  "command_id": "8be1de58-be5c-4a9c-9801-49dd06409027",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:32:44Z",
    "sequence": 1793259164920
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c1ec9e7-a101-4fe3-82d2-078e4b86b147",
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
  "last_heartbeat_at": "2026-10-29T07:32:44.138242Z",
  "last_location_at": "2026-10-29T07:32:44.138242Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633156650",
  "device_ref": "sandbox-21313"
}
```

```json
{
  "challenge_id": "80ca8c37-da5f-44fd-af56-1cab0f86b109",
  "expires_at": "2026-10-29T07:37:44.362196424Z",
  "resend_available_at": "2026-10-29T07:32:45.362196424Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633156650` → **200**

```json
{
  "phone": "+380633156650",
  "audience": "CLIENT",
  "code": "231779",
  "sent_at": "2026-10-29T07:32:44.365316445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80ca8c37-da5f-44fd-af56-1cab0f86b109",
  "code": "231779",
  "device_ref": "sandbox-21313"
}
```

```json
{
  "session_id": "712cec3a-ae41-4f3d-9a93-902e9c86f65a",
  "subject": {
    "type": "CLIENT",
    "id": "ec16bd18-16de-4564-86d2-b9504c2b1add"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYzE2YmQxOC0xNmRlLTQ1NjQtODZkMi1iOTUwNGMyYjFhZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMDY0LCJpYXQiOjE3OTMyNTkxNjQsImp0aSI6IjQ4MWZhZmM1LTQ4MDUtNGE4MS04NmFjLTYyN2M4MzhlMzVkYSIsInNpZCI6IjcxMmNlYzNhLWFlNDEtNGYzZC05YTkzLTkwMmU5Yzg2ZjY1YSJ9.j_OfU6y5O184J0JafPefd6CdcEpXzGtJ-D8ZmwNuY-Q",
  "access_expires_at": "2026-10-29T07:47:44.606592277Z",
  "refresh_token": "ZZsEt6N9c2GKUXD-P3BSYj1F63WR1QNjDw0-AEuIYZA",
  "refresh_expires_at": "2026-11-28T07:32:44.60579621Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8992a175-82d9-44a4-9849-8fbe1220b859",
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
  "id": "b315de56-e841-423e-8811-2042e35e5777",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:37:44.851355Z",
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
  "command_id": "ac9b0fe7-fc0b-4714-816d-a80caf6d7cd8",
  "quote_id": "b315de56-e841-423e-8811-2042e35e5777",
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
  "id": "eaae3ea9-d570-4c29-9d8c-615fcfccaf98",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ec16bd18-16de-4564-86d2-b9504c2b1add",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:32:45.148819Z",
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
    "id": "4cd2968c-0af4-48fc-afdc-a97118f629d2",
    "order_id": "eaae3ea9-d570-4c29-9d8c-615fcfccaf98",
    "expires_at": "2026-10-29T07:33:00.156662Z",
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

`POST /api/driver/v1/offers/4cd2968c-0af4-48fc-afdc-a97118f629d2/accept` → **200**

```json
{
  "command_id": "f7cddb5c-a158-4987-8039-68cb8c094069"
}
```

```json
{
  "id": "21ee8fa7-238f-485b-969a-81a143816ad7",
  "order_id": "eaae3ea9-d570-4c29-9d8c-615fcfccaf98",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dec2ad63-9537-4ee2-b24e-50e2868ce382",
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
  "command_id": "e0585e60-ff91-401b-97b4-1433bb49bf0a",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:32:46.135555999Z"
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
  "id": "dec2ad63-9537-4ee2-b24e-50e2868ce382",
  "order_id": "eaae3ea9-d570-4c29-9d8c-615fcfccaf98",
  "assignment_id": "21ee8fa7-238f-485b-969a-81a143816ad7",
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

`POST /api/driver/v1/work-sessions/4c1ec9e7-a101-4fe3-82d2-078e4b86b147/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:32:46Z",
    "sequence": 1793259166824
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4c1ec9e7-a101-4fe3-82d2-078e4b86b147",
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
  "last_heartbeat_at": "2026-10-29T07:32:46.847231Z",
  "last_location_at": "2026-10-29T07:32:46.847231Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dec2ad63-9537-4ee2-b24e-50e2868ce382/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "03a67510-bc59-402d-8b32-3eb9e3c50e57",
  "expected_version": 0
}
```

```json
{
  "id": "dec2ad63-9537-4ee2-b24e-50e2868ce382",
  "order_id": "eaae3ea9-d570-4c29-9d8c-615fcfccaf98",
  "assignment_id": "21ee8fa7-238f-485b-969a-81a143816ad7",
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
  "arrived_at": "2026-10-29T07:32:47.081102Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dec2ad63-9537-4ee2-b24e-50e2868ce382/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9eaf2216-6533-4150-88ce-6d8f12fddaec",
  "expected_version": 1
}
```

```json
{
  "id": "dec2ad63-9537-4ee2-b24e-50e2868ce382",
  "order_id": "eaae3ea9-d570-4c29-9d8c-615fcfccaf98",
  "assignment_id": "21ee8fa7-238f-485b-969a-81a143816ad7",
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
  "arrived_at": "2026-10-29T07:32:47.081102Z",
  "started_at": "2026-10-29T07:32:47.323879Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dec2ad63-9537-4ee2-b24e-50e2868ce382/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3c3531dd-1b75-424c-9032-a080fd7d2fcc",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:32:47Z",
  "cash_received": true
}
```

```json
{
  "id": "dec2ad63-9537-4ee2-b24e-50e2868ce382",
  "order_id": "eaae3ea9-d570-4c29-9d8c-615fcfccaf98",
  "assignment_id": "21ee8fa7-238f-485b-969a-81a143816ad7",
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
  "arrived_at": "2026-10-29T07:32:47.081102Z",
  "started_at": "2026-10-29T07:32:47.323879Z",
  "completed_at": "2026-10-29T07:32:47.567852Z",
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
  "session_id": "4c1ec9e7-a101-4fe3-82d2-078e4b86b147",
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
  "last_heartbeat_at": "2026-10-29T07:32:46.847231Z",
  "last_location_at": "2026-10-29T07:32:46.847231Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4c1ec9e7-a101-4fe3-82d2-078e4b86b147/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f36adabc-87cb-49ef-b559-5840e227b22b",
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
  "command_id": "5307766b-62a0-4727-b07d-4fef7841f416",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:32:48Z",
    "sequence": 1793259168243
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
  "correlation_id": "b608f3c9-1e0d-435e-9285-9a2abdd5d29e",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "f7bf1981-9c8a-4c07-a278-56e97d85273a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:32:48Z",
    "sequence": 1793259168496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "05bc4de3-b037-41ae-8f6c-e305ec6cea99",
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
  "last_heartbeat_at": "2026-10-29T07:32:48.5169Z",
  "last_location_at": "2026-10-29T07:32:48.5169Z",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T07:32:46.135556Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "4554ea9a-a759-47c3-b94d-ec42b2970dc5",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:32:48.964314208Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "05bc4de3-b037-41ae-8f6c-e305ec6cea99",
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
  "last_heartbeat_at": "2026-10-29T07:32:48.5169Z",
  "last_location_at": "2026-10-29T07:32:48.5169Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/05bc4de3-b037-41ae-8f6c-e305ec6cea99/close` → **200**

```json
{
  "command_id": "5afceb25-7a12-45d8-ba5f-90496262058a",
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
  "session_id": "19c49c1d-f715-4bbd-8f80-4bde03db6898",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAwNjksImlhdCI6MTc5MzI1OTE2OSwianRpIjoiYjYwN2YyMTItZmQzZS00YzM0LTk3NDYtYzY5OTliOTc4NWY1Iiwic2lkIjoiMTljNDljMWQtZjcxNS00YmJkLThmODAtNGJkZTAzZGI2ODk4In0.IwJcZSWcT8Bf2hc_hCz19KY8FCsY0lD3df9hZ6FQQx0",
  "access_expires_at": "2026-10-29T07:47:49.901832334Z",
  "refresh_token": "Zp4OmZJhGhgRxh17mN6qJ4wFY57rYNOAC0acSCS4wtU",
  "refresh_expires_at": "2026-10-29T19:32:49.901209514Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "2ef390da-00a4-4f02-a50c-e87af766318f",
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
  "id": "8bfa079c-7851-4911-8187-d3165e16c64d",
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
  "created_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "created_at": "2026-10-29T07:32:50.131032Z",
  "updated_at": "2026-10-29T07:32:50.131032Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636942659",
  "device_ref": "sandbox-25066"
}
```

```json
{
  "challenge_id": "6dcd4fa2-2006-4fc8-bd27-353441ce6ae9",
  "expires_at": "2026-10-29T07:37:50.361410017Z",
  "resend_available_at": "2026-10-29T07:32:51.361410017Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636942659` → **200**

```json
{
  "phone": "+380636942659",
  "audience": "CLIENT",
  "code": "978381",
  "sent_at": "2026-10-29T07:32:50.36438737Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6dcd4fa2-2006-4fc8-bd27-353441ce6ae9",
  "code": "978381",
  "device_ref": "sandbox-25066"
}
```

```json
{
  "session_id": "cf67d813-9132-4856-bd1a-a0a7d6c1685f",
  "subject": {
    "type": "CLIENT",
    "id": "f4a3a0ae-e409-4dd8-8399-40ca11642418"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNGEzYTBhZS1lNDA5LTRkZDgtODM5OS00MGNhMTE2NDI0MTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMDcwLCJpYXQiOjE3OTMyNTkxNzAsImp0aSI6IjJmNDZmZWM4LTFiOWQtNGUwMS1hYzE4LTc3MTFmNTBmZWRiMSIsInNpZCI6ImNmNjdkODEzLTkxMzItNDg1Ni1iZDFhLWEwYTdkNmMxNjg1ZiJ9.vwJJ7xGe_W7MEtMDgAbAzdscmnVe2FjNXuAaKlcWSfE",
  "access_expires_at": "2026-10-29T07:47:50.614523613Z",
  "refresh_token": "JRyqTnKRJFC9wQ8GFVuRy7lN3XCTLQXMorI8BbpS84Y",
  "refresh_expires_at": "2026-11-28T07:32:50.613917458Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636942659` → **200**

```json
{
  "client_id": "f4a3a0ae-e409-4dd8-8399-40ca11642418"
}
```

`POST /api/admin/v1/rider-wallets/f4a3a0ae-e409-4dd8-8399-40ca11642418/top-ups` → **201**

```json
{
  "command_id": "fdcee982-eece-4063-8f96-1e14b731afee",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "f4a3a0ae-e409-4dd8-8399-40ca11642418",
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
      "id": "29a2ffbb-b797-4c7e-8a2d-07aa2e1fb5d0",
      "at": "2026-10-29T07:32:51.060751Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73123eb9-b50d-4a50-b3db-9530d4e699d2",
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
  "id": "6970a68f-042d-4cf8-9de9-996e638e69ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:37:51.302750Z",
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
      "id": "8bfa079c-7851-4911-8187-d3165e16c64d",
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
  "device_ref": "sandbox-23672"
}
```

```json
{
  "challenge_id": "31e140e8-a351-40d9-92da-7b15ef2673a6",
  "expires_at": "2026-10-29T07:37:51.534536578Z",
  "resend_available_at": "2026-10-29T07:32:52.534536578Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "389630",
  "sent_at": "2026-10-29T07:32:51.537447027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31e140e8-a351-40d9-92da-7b15ef2673a6",
  "code": "389630",
  "device_ref": "sandbox-23672"
}
```

```json
{
  "session_id": "e96fb855-c2be-4e2e-9324-e0a333938a0f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDA3MSwiaWF0IjoxNzkzMjU5MTcxLCJqdGkiOiIwMzBjYTA1NC01OWI5LTRiMWQtYjc4Ni00ZjFjMTFiNzQ1NDUiLCJzaWQiOiJlOTZmYjg1NS1jMmJlLTRlMmUtOTMyNC1lMGEzMzM5MzhhMGYifQ.pjFIJ0h6RuI1RYfNXnGjSw17wOekOl9hB_VE185anLw",
  "access_expires_at": "2026-10-29T07:47:51.776535265Z",
  "refresh_token": "8eIyNR9Nes1XqbxF-MANiZxzfiLUm63yAluXKN82jlM",
  "refresh_expires_at": "2026-11-28T07:32:51.775892716Z",
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
  "command_id": "7a6be882-cb56-4d09-8635-b169767638f7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:32:52Z",
    "sequence": 1793259172198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba9fd781-f972-4237-8a24-506f4276b420",
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
  "last_heartbeat_at": "2026-10-29T07:32:52.216222Z",
  "last_location_at": "2026-10-29T07:32:52.216222Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b34e957e-e5cf-4dd6-a905-09502d707092",
  "quote_id": "6970a68f-042d-4cf8-9de9-996e638e69ce",
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
  "id": "ca95cd82-a6f0-4848-8f08-4eb126371e07",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f4a3a0ae-e409-4dd8-8399-40ca11642418",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:32:52.475418Z",
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
  "client_id": "f4a3a0ae-e409-4dd8-8399-40ca11642418",
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
      "id": "29a2ffbb-b797-4c7e-8a2d-07aa2e1fb5d0",
      "at": "2026-10-29T07:32:51.060751Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
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
    "id": "a07d4445-8350-4934-9027-36636992945f",
    "order_id": "ca95cd82-a6f0-4848-8f08-4eb126371e07",
    "expires_at": "2026-10-29T07:33:07.481919Z",
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

`POST /api/driver/v1/offers/a07d4445-8350-4934-9027-36636992945f/accept` → **200**

```json
{
  "command_id": "9dd95a55-eb57-463a-9122-5c0488dcc586"
}
```

```json
{
  "id": "5883e0d5-a618-4eb7-858e-c7759ec68e9c",
  "order_id": "ca95cd82-a6f0-4848-8f08-4eb126371e07",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "71a001aa-2c4d-4d56-afe4-9112d72a223f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "71a001aa-2c4d-4d56-afe4-9112d72a223f",
  "order_id": "ca95cd82-a6f0-4848-8f08-4eb126371e07",
  "assignment_id": "5883e0d5-a618-4eb7-858e-c7759ec68e9c",
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

`POST /api/driver/v1/work-sessions/ba9fd781-f972-4237-8a24-506f4276b420/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:32:53Z",
    "sequence": 1793259173777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba9fd781-f972-4237-8a24-506f4276b420",
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
  "last_heartbeat_at": "2026-10-29T07:32:53.796137Z",
  "last_location_at": "2026-10-29T07:32:53.796137Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/71a001aa-2c4d-4d56-afe4-9112d72a223f/arrive` → **200**

```json
{
  "command_id": "6d105e09-95a3-4e97-b8dd-d1ea611e0ba5",
  "expected_version": 0
}
```

```json
{
  "id": "71a001aa-2c4d-4d56-afe4-9112d72a223f",
  "order_id": "ca95cd82-a6f0-4848-8f08-4eb126371e07",
  "assignment_id": "5883e0d5-a618-4eb7-858e-c7759ec68e9c",
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
  "arrived_at": "2026-10-29T07:32:54.019421Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/71a001aa-2c4d-4d56-afe4-9112d72a223f/start` → **200**

```json
{
  "command_id": "01045580-13ea-4379-979f-b0fb417c36df",
  "expected_version": 1
}
```

```json
{
  "id": "71a001aa-2c4d-4d56-afe4-9112d72a223f",
  "order_id": "ca95cd82-a6f0-4848-8f08-4eb126371e07",
  "assignment_id": "5883e0d5-a618-4eb7-858e-c7759ec68e9c",
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
  "arrived_at": "2026-10-29T07:32:54.019421Z",
  "started_at": "2026-10-29T07:32:54.24926Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/71a001aa-2c4d-4d56-afe4-9112d72a223f/complete` → **200**

```json
{
  "command_id": "6e8dd0e5-7f81-42d7-9b12-bf751777bff3",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:32:54Z",
  "cash_received": true
}
```

```json
{
  "id": "71a001aa-2c4d-4d56-afe4-9112d72a223f",
  "order_id": "ca95cd82-a6f0-4848-8f08-4eb126371e07",
  "assignment_id": "5883e0d5-a618-4eb7-858e-c7759ec68e9c",
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
  "arrived_at": "2026-10-29T07:32:54.019421Z",
  "started_at": "2026-10-29T07:32:54.24926Z",
  "completed_at": "2026-10-29T07:32:54.514682Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f4a3a0ae-e409-4dd8-8399-40ca11642418",
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
      "id": "5ebf0216-6af1-4373-816e-394b884fe2fa",
      "at": "2026-10-29T07:32:54.613832Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "ca95cd82-a6f0-4848-8f08-4eb126371e07"
    },
    {
      "id": "29a2ffbb-b797-4c7e-8a2d-07aa2e1fb5d0",
      "at": "2026-10-29T07:32:51.060751Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/8bfa079c-7851-4911-8187-d3165e16c64d/archive` → **200**

```json
{
  "command_id": "e4cdca45-b95c-4138-ac4a-1bd8313ec97b",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "8bfa079c-7851-4911-8187-d3165e16c64d",
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
  "created_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "created_at": "2026-10-29T07:32:50.131032Z",
  "updated_at": "2026-10-29T07:32:57.983786Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ba9fd781-f972-4237-8a24-506f4276b420",
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
  "last_heartbeat_at": "2026-10-29T07:32:53.796137Z",
  "last_location_at": "2026-10-29T07:32:53.796137Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ba9fd781-f972-4237-8a24-506f4276b420/close` → **200**

```json
{
  "command_id": "6cfc014e-94e1-4e54-8c9e-fd0aad33ce0e",
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

Done: order ca95cd82-a6f0-4848-8f08-4eb126371e07.

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
  "session_id": "f228071a-bfe5-4096-9998-7701ef563677",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAwNzgsImlhdCI6MTc5MzI1OTE3OCwianRpIjoiN2VmZTdhMjAtZmNhNy00MjQ4LWExMTAtMzk0OGJiOTg3OWY2Iiwic2lkIjoiZjIyODA3MWEtYmZlNS00MDk2LTk5OTgtNzcwMWVmNTYzNjc3In0.awNrppMCym_byEhvr-NupiQvqlK8AhHud9KWQmDUjso",
  "access_expires_at": "2026-10-29T07:47:58.927734384Z",
  "refresh_token": "cZMidNl_bF8VtvwLsHun3BbYqwoafYpyKX5ZjSFJpEg",
  "refresh_expires_at": "2026-10-29T19:32:58.927187215Z",
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
  "command_id": "d4146838-f59f-4603-80f3-cfa0ae92ca1c",
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
  "session_id": "da48af75-e14b-405e-bcd5-60151934d3a9",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAwNzksImlhdCI6MTc5MzI1OTE3OSwianRpIjoiNzUyMTBhOTItOGQ1YS00MmIzLWFiZWQtYTg0MDQ2NDZkYTNlIiwic2lkIjoiZGE0OGFmNzUtZTE0Yi00MDVlLWJjZDUtNjAxNTE5MzRkM2E5In0.N0ySiidEA_-Vg3uTGL448WtD9FR797zqQTC0w2nkDJo",
  "access_expires_at": "2026-10-29T07:47:59.847220611Z",
  "refresh_token": "XFE4LQXJ0bbK4H-8ELnXNuRfROA3Il_amQWLBzGr_LY",
  "refresh_expires_at": "2026-10-29T19:32:59.846684017Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.185803186",
    "linkedid": "1730052700.185803186",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674781763"
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
    "id": "1730052700.185803186",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "47ab8712-fcb7-4654-9c8e-91c508d30b5e",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674781763",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:33:00.061242Z",
      "answered_at": null,
      "ended_at": "2026-10-29T07:33:00.084567Z",
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
    "id": "1730052600.301022175",
    "linkedid": "1730052600.301022175",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674781763"
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
      "id": "40c30f7e-25cf-492b-b68f-17c44dff1f6d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674781763",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:33:00.348739Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/40c30f7e-25cf-492b-b68f-17c44dff1f6d/answer` → **200**

```json
{
  "command_id": "e22bf37e-b1fc-417b-8e03-3d758033c022"
}
```

```json
{
  "id": "40c30f7e-25cf-492b-b68f-17c44dff1f6d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674781763",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "order_ids": [],
  "started_at": "2026-10-29T07:33:00.348739Z",
  "answered_at": "2026-10-29T07:33:00.599676Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.301022175",
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
    "id": "1730052600.301022175",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "40c30f7e-25cf-492b-b68f-17c44dff1f6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674781763",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_ids": [],
      "started_at": "2026-10-29T07:33:00.348739Z",
      "answered_at": "2026-10-29T07:33:00.599676Z",
      "ended_at": "2026-10-29T07:33:00.844772Z",
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
      "id": "40c30f7e-25cf-492b-b68f-17c44dff1f6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674781763",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_ids": [],
      "started_at": "2026-10-29T07:33:00.348739Z",
      "answered_at": "2026-10-29T07:33:00.599676Z",
      "ended_at": "2026-10-29T07:33:00.844772Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:33:02.239957Z"
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
      "id": "40c30f7e-25cf-492b-b68f-17c44dff1f6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674781763",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_ids": [],
      "started_at": "2026-10-29T07:33:00.348739Z",
      "answered_at": "2026-10-29T07:33:00.599676Z",
      "ended_at": "2026-10-29T07:33:00.844772Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:33:02.239957Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/40c30f7e-25cf-492b-b68f-17c44dff1f6d/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/40c30f7e-25cf-492b-b68f-17c44dff1f6d/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=40c30f7e-25cf-492b-b68f-17c44dff1f6d` → **200**

```json
{
  "changes": [
    {
      "id": "a7c35976-a980-4430-8ff1-0771436466fe",
      "occurred_at": "2026-10-29T07:33:03.56572Z",
      "actor_type": "STAFF",
      "actor_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "40c30f7e-25cf-492b-b68f-17c44dff1f6d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"557c3f5b-1584-4bb0-9b9a-8b04de56ece2\", \"order_ids\": []}",
      "correlation_id": "6d3d3447-6fc4-4558-a930-0bd4a8137282"
    },
    {
      "id": "55a1caf7-54c7-4914-bc1c-32073558eb81",
      "occurred_at": "2026-10-29T07:33:03.537695Z",
      "actor_type": "STAFF",
      "actor_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "40c30f7e-25cf-492b-b68f-17c44dff1f6d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"557c3f5b-1584-4bb0-9b9a-8b04de56ece2\", \"order_ids\": []}",
      "correlation_id": "3d995e67-d6e6-4eea-9858-007d13edf9fd"
    }
  ]
}
```

Done: call 40c30f7e-25cf-492b-b68f-17c44dff1f6d recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8524"
}
```

```json
{
  "challenge_id": "42d95282-da58-492e-9d73-eea570ea044f",
  "expires_at": "2026-10-29T07:38:03.82083081Z",
  "resend_available_at": "2026-10-29T07:33:04.82083081Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "795210",
  "sent_at": "2026-10-29T07:33:03.823712549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42d95282-da58-492e-9d73-eea570ea044f",
  "code": "795210",
  "device_ref": "sandbox-8524"
}
```

```json
{
  "session_id": "67b2f9a4-6f27-48ae-9fdc-5636abe26bce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDA4NCwiaWF0IjoxNzkzMjU5MTg0LCJqdGkiOiJhMTA5NWM1Mi1kM2Y1LTRmZTMtYWJhNy05YmQ0ODkyMWZiYTYiLCJzaWQiOiI2N2IyZjlhNC02ZjI3LTQ4YWUtOWZkYy01NjM2YWJlMjZiY2UifQ.EQ8preooufuzz1N351fCEDLl1jL2cglUCR6MMTWCMVg",
  "access_expires_at": "2026-10-29T07:48:04.103511103Z",
  "refresh_token": "-H8DXYAgV5p1soMacVdAQwrKLrCZBIroXwq7ZUl1k_Y",
  "refresh_expires_at": "2026-11-28T07:33:04.102990343Z",
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
  "command_id": "fe3c239d-7ab5-42bd-9442-5cb52f36dadd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:04Z",
    "sequence": 1793259184528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cff3d904-0c1f-4810-af27-a3a2637a3075",
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
  "last_heartbeat_at": "2026-10-29T07:33:04.546325Z",
  "last_location_at": "2026-10-29T07:33:04.546325Z",
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
  "session_id": "d56ae020-906d-4467-bd49-f7f8e9b2cb56",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAwODUsImlhdCI6MTc5MzI1OTE4NSwianRpIjoiMjVkMWY3ZTQtZmE2My00NjUyLWI0MGYtMmU1OGQyMWJkMmM4Iiwic2lkIjoiZDU2YWUwMjAtOTA2ZC00NDY3LWJkNDktZjdmOGU5YjJjYjU2In0.z0LZMEi45zPgg1puYAszwgQ-u5OoAA48dE02jdELU3w",
  "access_expires_at": "2026-10-29T07:48:05.028443691Z",
  "refresh_token": "RNf0SZymQrIMumfHA1NWcfX-btj-5xRHfAioXhta-xQ",
  "refresh_expires_at": "2026-10-29T19:33:05.027962118Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "51a883cd-7a8d-4a95-bd2a-2b1eb5e937c4",
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
  "id": "212ceef2-b817-4a3e-bc49-c71295024dfe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:05.252185Z",
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
  "command_id": "f24e7c65-1306-49b6-b95d-542865aa9f1b",
  "quote_id": "212ceef2-b817-4a3e-bc49-c71295024dfe",
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
    "phone": "+380677781315"
  }
}
```

```json
{
  "id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
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
  "created_at": "2026-10-29T07:33:05.494048Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677781315"
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
    "id": "10240620-ab95-406d-80ab-0feb3029f9e4",
    "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
    "expires_at": "2026-10-29T07:33:20.499429Z",
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

`POST /api/driver/v1/offers/10240620-ab95-406d-80ab-0feb3029f9e4/accept` → **200**

```json
{
  "command_id": "2d8db3ef-75f8-449f-8521-19fa50faf805"
}
```

```json
{
  "id": "e1bb0448-45c4-46e2-a886-72ad2af845e4",
  "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "86674de2-8237-494d-8821-7586cd8f9a5b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[
  {
    "phone": "+380677781315",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:07.371031231Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[
  {
    "phone": "+380677781315",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:07.371031231Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[
  {
    "phone": "+380677781315",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:07.371031231Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "86674de2-8237-494d-8821-7586cd8f9a5b",
  "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
  "assignment_id": "e1bb0448-45c4-46e2-a886-72ad2af845e4",
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
    "phone": "+380677781315"
  }
}
```

`POST /api/driver/v1/work-sessions/cff3d904-0c1f-4810-af27-a3a2637a3075/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:08Z",
    "sequence": 1793259188502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cff3d904-0c1f-4810-af27-a3a2637a3075",
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
  "last_heartbeat_at": "2026-10-29T07:33:08.519588Z",
  "last_location_at": "2026-10-29T07:33:08.519588Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/86674de2-8237-494d-8821-7586cd8f9a5b/arrive` → **200**

```json
{
  "command_id": "c22bcefe-9a7c-445a-af21-2acbee6333a1",
  "expected_version": 0
}
```

```json
{
  "id": "86674de2-8237-494d-8821-7586cd8f9a5b",
  "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
  "assignment_id": "e1bb0448-45c4-46e2-a886-72ad2af845e4",
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
  "arrived_at": "2026-10-29T07:33:08.744187Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677781315"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[
  {
    "phone": "+380677781315",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:07.371031231Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[
  {
    "phone": "+380677781315",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:07.371031231Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[
  {
    "phone": "+380677781315",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:07.371031231Z"
  },
  {
    "phone": "+380677781315",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:10.378289759Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[
  {
    "phone": "+380677781315",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:07.371031231Z"
  },
  {
    "phone": "+380677781315",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:10.378289759Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677781315` → **200**

```json
[
  {
    "phone": "+380677781315",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:07.371031231Z"
  },
  {
    "phone": "+380677781315",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T07:33:10.378289759Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/86674de2-8237-494d-8821-7586cd8f9a5b/start` → **200**

```json
{
  "command_id": "ff3a33f7-a309-4fed-98bb-270514e17b28",
  "expected_version": 1
}
```

```json
{
  "id": "86674de2-8237-494d-8821-7586cd8f9a5b",
  "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
  "assignment_id": "e1bb0448-45c4-46e2-a886-72ad2af845e4",
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
  "arrived_at": "2026-10-29T07:33:08.744187Z",
  "started_at": "2026-10-29T07:33:11.084262Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677781315"
  }
}
```

`POST /api/driver/v1/trips/86674de2-8237-494d-8821-7586cd8f9a5b/complete` → **200**

```json
{
  "command_id": "03662892-248c-495f-9084-02ce9a709459",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:33:11Z",
  "cash_received": true
}
```

```json
{
  "id": "86674de2-8237-494d-8821-7586cd8f9a5b",
  "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
  "assignment_id": "e1bb0448-45c4-46e2-a886-72ad2af845e4",
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
  "arrived_at": "2026-10-29T07:33:08.744187Z",
  "started_at": "2026-10-29T07:33:11.084262Z",
  "completed_at": "2026-10-29T07:33:11.316234Z",
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
  "session_id": "cff3d904-0c1f-4810-af27-a3a2637a3075",
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
  "last_heartbeat_at": "2026-10-29T07:33:08.519588Z",
  "last_location_at": "2026-10-29T07:33:08.519588Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cff3d904-0c1f-4810-af27-a3a2637a3075/close` → **200**

```json
{
  "command_id": "07ec598d-d6c9-456c-bfd5-3d83de79da63",
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
  "phone": "+380634689676",
  "device_ref": "sandbox-5268"
}
```

```json
{
  "challenge_id": "30bf3a92-0764-4326-bdd0-6ea2f178c466",
  "expires_at": "2026-10-29T07:38:12.02523019Z",
  "resend_available_at": "2026-10-29T07:33:13.02523019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634689676` → **200**

```json
{
  "phone": "+380634689676",
  "audience": "CLIENT",
  "code": "056378",
  "sent_at": "2026-10-29T07:33:12.028499724Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30bf3a92-0764-4326-bdd0-6ea2f178c466",
  "code": "056378",
  "device_ref": "sandbox-5268"
}
```

```json
{
  "session_id": "85a9abce-f5f6-4b1d-86b3-151052907075",
  "subject": {
    "type": "CLIENT",
    "id": "5898ed0e-3dc7-45c0-ae5e-8abefc49f3e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ODk4ZWQwZS0zZGM3LTQ1YzAtYWU1ZS04YWJlZmM0OWYzZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMDkyLCJpYXQiOjE3OTMyNTkxOTIsImp0aSI6ImVhODUyYzJhLWUyNzAtNGE4My1iODAxLTY1ODdhMmI4ZDg1MSIsInNpZCI6Ijg1YTlhYmNlLWY1ZjYtNGIxZC04NmIzLTE1MTA1MjkwNzA3NSJ9.xCengsd2DcCYYKNyG0nBuL563VBbNPbj4VOYLohay5M",
  "access_expires_at": "2026-10-29T07:48:12.265988208Z",
  "refresh_token": "kFOtBWhjDbOPu25N1Y6co4xoabQ-mEVBs7SpWdjcKds",
  "refresh_expires_at": "2026-11-28T07:33:12.265542051Z",
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
        "pl": "Zmiana planów",
        "uk": "Передумав їхати",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "ru": "Ошибся адресом",
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
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
  "device_ref": "sandbox-4112"
}
```

```json
{
  "challenge_id": "d20e302e-d020-415c-b18d-e0808d86bfd1",
  "expires_at": "2026-10-29T07:38:12.693148813Z",
  "resend_available_at": "2026-10-29T07:33:13.693148813Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "408277",
  "sent_at": "2026-10-29T07:33:12.695455229Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d20e302e-d020-415c-b18d-e0808d86bfd1",
  "code": "408277",
  "device_ref": "sandbox-4112"
}
```

```json
{
  "session_id": "da798282-4a1e-4c17-80b7-a23156ed17b6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDA5MiwiaWF0IjoxNzkzMjU5MTkyLCJqdGkiOiI1OGM0Nzg4ZC0yNGU0LTRiODgtYWI0Zi00OTg1OTE4MWU4OGQiLCJzaWQiOiJkYTc5ODI4Mi00YTFlLTRjMTctODBiNy1hMjMxNTZlZDE3YjYifQ.C1gLMLqkQAE5S8YSOABlzd_YnwZJbGnTu9EPW9TFWVk",
  "access_expires_at": "2026-10-29T07:48:12.930557492Z",
  "refresh_token": "DaHyBW0SRWWzR61KH6uNAcRFsMO4nYaKUrGZg9r8Mak",
  "refresh_expires_at": "2026-11-28T07:33:12.930027494Z",
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
        "pl": "Pasażer nie przyszedł",
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
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
  "session_id": "7e6ea504-3826-40eb-bc31-cd599d6b8388",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAwOTMsImlhdCI6MTc5MzI1OTE5MywianRpIjoiNWU5NjY5NTAtMzA5ZS00M2U1LWFlYjUtN2VlYWE5YWQ1MjY1Iiwic2lkIjoiN2U2ZWE1MDQtMzgyNi00MGViLWJjMzEtY2Q1OTlkNmI4Mzg4In0.0RvbUnW9X_kf6z_QZ5VPUdFXkPKejmsEoAFtociyGP4",
  "access_expires_at": "2026-10-29T07:48:13.613409502Z",
  "refresh_token": "GadrlI_6NbDEZjIKt4KQXtjeF5zSK6_bFHjkRVUZYBg",
  "refresh_expires_at": "2026-10-29T19:33:13.612894169Z",
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
  "session_id": "f49eb9fe-60b2-41cf-bfe3-a2984dac5627",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAwOTQsImlhdCI6MTc5MzI1OTE5NCwianRpIjoiYTI3ZWY5OTEtNDU1Yi00MGE2LWI1ZmEtYjM4NTdhOWIzN2VhIiwic2lkIjoiZjQ5ZWI5ZmUtNjBiMi00MWNmLWJmZTMtYTI5ODRkYWM1NjI3In0.WhGsD-M3b84v7l0-V6uZG6AE4uk98XJ9gBKbtl06Ems",
  "access_expires_at": "2026-10-29T07:48:14.090842874Z",
  "refresh_token": "OxbiRXcJ6esIOgbXvlb2Di97-x41shtm6JQlha6dQ7Q",
  "refresh_expires_at": "2026-10-29T19:33:14.09032948Z",
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
        "pl": "Na prośbę pasażera",
        "uk": "Пасажир попросив",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "ru": "ДТП",
        "pl": "Wypadek",
        "uk": "ДТП",
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
  "command_id": "29af29c5-ca92-44e8-af4d-b24be73442de",
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
  "id": "5396d66a-8395-477f-a709-48d0b7e8f82f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:14.538663Z",
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
  "command_id": "340a38d7-1c09-4246-b276-d723af696bfb",
  "quote_id": "5396d66a-8395-477f-a709-48d0b7e8f82f",
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
  "id": "dbd136f8-6fa0-47a0-9afd-0825a4efaf15",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5898ed0e-3dc7-45c0-ae5e-8abefc49f3e0",
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
  "created_at": "2026-10-29T07:33:14.769244Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/dbd136f8-6fa0-47a0-9afd-0825a4efaf15` → **200**

```json
{
  "id": "dbd136f8-6fa0-47a0-9afd-0825a4efaf15",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5898ed0e-3dc7-45c0-ae5e-8abefc49f3e0",
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
  "created_at": "2026-10-29T07:33:14.769244Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dbd136f8-6fa0-47a0-9afd-0825a4efaf15/cancel` → **200**

```json
{
  "command_id": "fd06e380-64a1-4676-8f3f-4b023e5a993b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "dbd136f8-6fa0-47a0-9afd-0825a4efaf15",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5898ed0e-3dc7-45c0-ae5e-8abefc49f3e0",
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
  "created_at": "2026-10-29T07:33:14.769244Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
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
  "command_id": "0b8c31d8-bdd2-45a3-b228-b4d2e3c210da",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:15Z",
    "sequence": 1793259195694
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a7f6cd70-6fd6-450c-89cd-fbf6a94f2b62",
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
  "last_heartbeat_at": "2026-10-29T07:33:15.712308Z",
  "last_location_at": "2026-10-29T07:33:15.712308Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31842"
}
```

```json
{
  "challenge_id": "e66a3ddb-3f96-48c5-a931-09f9ce7a9afa",
  "expires_at": "2026-10-29T07:38:15.93323867Z",
  "resend_available_at": "2026-10-29T07:33:16.93323867Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "773679",
  "sent_at": "2026-10-29T07:33:15.935820913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e66a3ddb-3f96-48c5-a931-09f9ce7a9afa",
  "code": "773679",
  "device_ref": "sandbox-31842"
}
```

```json
{
  "session_id": "ce68dc5d-cdb1-4f14-a823-98559c9eccf7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDA5NiwiaWF0IjoxNzkzMjU5MTk2LCJqdGkiOiJmNjExNzJlYi1kZmM0LTRkZDAtOGMwNy1jZWY3MTVhNGI1ZDciLCJzaWQiOiJjZTY4ZGM1ZC1jZGIxLTRmMTQtYTgyMy05ODU1OWM5ZWNjZjcifQ.3HcZEy1m0pTbt150Wxl5Y-0KSkSpaO9YxGz8u6HDs-g",
  "access_expires_at": "2026-10-29T07:48:16.179587563Z",
  "refresh_token": "jv_hXoN0fX4AxsPRMSyjNX-Vv3WHEhZ8sgTkY_mjsQ0",
  "refresh_expires_at": "2026-11-28T07:33:16.179140732Z",
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
  "command_id": "683637d4-fb0b-4d96-9879-b296e94f75bd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:16Z",
    "sequence": 1793259196603
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d71a98c-cc11-45ab-954d-76eff0eb1ce4",
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
  "last_heartbeat_at": "2026-10-29T07:33:16.621083Z",
  "last_location_at": "2026-10-29T07:33:16.621083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "118d8ba4-490c-44da-a3b6-7c3a10f00a39",
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
  "id": "52ed1cf9-b9a8-4e97-ad73-369738182a92",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:16.851204Z",
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
  "command_id": "552c6570-7b8f-4d64-ae70-f634d06a9cda",
  "quote_id": "52ed1cf9-b9a8-4e97-ad73-369738182a92",
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
  "id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5898ed0e-3dc7-45c0-ae5e-8abefc49f3e0",
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
  "created_at": "2026-10-29T07:33:17.084751Z",
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
    "id": "af9b1414-22a0-4433-aa68-96f3505c8291",
    "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
    "expires_at": "2026-10-29T07:33:32.088049Z",
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

`POST /api/driver/v1/offers/af9b1414-22a0-4433-aa68-96f3505c8291/accept` → **200**

```json
{
  "command_id": "858e74f3-4e16-4647-9aad-6f135975351f"
}
```

```json
{
  "id": "ac0ddea7-63bf-4fad-9a78-27011425ef10",
  "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b76230f8-7c46-43b6-81e6-b94c49b83bfa",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b76230f8-7c46-43b6-81e6-b94c49b83bfa",
  "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
  "assignment_id": "ac0ddea7-63bf-4fad-9a78-27011425ef10",
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

`POST /api/driver/v1/trips/b76230f8-7c46-43b6-81e6-b94c49b83bfa/cancel` → **200**

```json
{
  "command_id": "9aea2d3d-9258-4e70-9829-c9a3b77285e0",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "b76230f8-7c46-43b6-81e6-b94c49b83bfa",
  "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
  "assignment_id": "ac0ddea7-63bf-4fad-9a78-27011425ef10",
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

`GET /api/rider/v1/orders/11ed4236-24bf-44c3-9883-4a70ce1cb7c5` → **200**

```json
{
  "id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5898ed0e-3dc7-45c0-ae5e-8abefc49f3e0",
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
    "id": "ac0ddea7-63bf-4fad-9a78-27011425ef10",
    "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "b76230f8-7c46-43b6-81e6-b94c49b83bfa",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:33:17.084751Z",
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
    "id": "5541c006-eb73-4185-b89d-4b15136135a0",
    "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
    "expires_at": "2026-10-29T07:33:33.002787Z",
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

`POST /api/driver/v1/offers/5541c006-eb73-4185-b89d-4b15136135a0/accept` → **200**

```json
{
  "command_id": "e6f86713-fd39-4077-a35a-b3e8b7cb0a1d"
}
```

```json
{
  "id": "e1803670-c1a0-4823-af0b-ca3644b03826",
  "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7b0436b5-aee0-41e1-841a-484b5b256ea4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7b0436b5-aee0-41e1-841a-484b5b256ea4",
  "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
  "assignment_id": "e1803670-c1a0-4823-af0b-ca3644b03826",
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

`POST /api/driver/v1/trips/7b0436b5-aee0-41e1-841a-484b5b256ea4/cancel` → **200**

```json
{
  "command_id": "d68e4917-586b-4dab-bc8f-68b27f84b8c4",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "7b0436b5-aee0-41e1-841a-484b5b256ea4",
  "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
  "assignment_id": "e1803670-c1a0-4823-af0b-ca3644b03826",
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
    "id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:33:17.084751Z",
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
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "dbd136f8-6fa0-47a0-9afd-0825a4efaf15",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:33:14.769244Z",
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
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/11ed4236-24bf-44c3-9883-4a70ce1cb7c5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:33:17.085345Z",
      "actor": {
        "type": "CLIENT",
        "id": "5898ed0e-3dc7-45c0-ae5e-8abefc49f3e0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
        "quote_id": "52ed1cf9-b9a8-4e97-ad73-369738182a92",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "be48229d-1a21-4a49-b88a-5d603a2b04cf"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:33:17.087251Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
        "attempt_id": "7c9207ce-90e7-4af8-8534-ee335ed77cf8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "be48229d-1a21-4a49-b88a-5d603a2b04cf"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:33:17.093273Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "af9b1414-22a0-4433-aa68-96f3505c8291",
        "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "be48229d-1a21-4a49-b88a-5d603a2b04cf"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:33:17.550722Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "af9b1414-22a0-4433-aa68-96f3505c8291",
        "order_id": "11ed4236-24bf-44c3-9883-4a70ce1cb7c5",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "ac0ddea7-63bf-4fad-9a78-27011425ef10"
      },
      "correlation_id": "e3318747-0a62-4c58-af17-72269e351248"
```

Done: orders dbd136f8-6fa0-47a0-9afd-0825a4efaf15, 11ed4236-24bf-44c3-9883-4a70ce1cb7c5.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731105752",
  "device_ref": "sandbox-23431"
}
```

```json
{
  "challenge_id": "0f73db54-1680-4758-a17d-79bbd809b76d",
  "expires_at": "2026-10-29T07:38:19.826424545Z",
  "resend_available_at": "2026-10-29T07:33:20.826424545Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731105752` → **200**

```json
{
  "phone": "+380731105752",
  "audience": "CLIENT",
  "code": "419999",
  "sent_at": "2026-10-29T07:33:19.829229607Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f73db54-1680-4758-a17d-79bbd809b76d",
  "code": "419999",
  "device_ref": "sandbox-23431"
}
```

```json
{
  "session_id": "0b241d9e-dd64-4eac-b9ca-d5ff0969c010",
  "subject": {
    "type": "CLIENT",
    "id": "55716e9c-d901-4947-a95e-d422b559e05d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTcxNmU5Yy1kOTAxLTQ5NDctYTk1ZS1kNDIyYjU1OWUwNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTAwLCJpYXQiOjE3OTMyNTkyMDAsImp0aSI6IjM0MjE0MGNlLTFkZWYtNDBmYy1hMTJhLTViNmFkNmY0MWYwMCIsInNpZCI6IjBiMjQxZDllLWRkNjQtNGVhYy1iOWNhLWQ1ZmYwOTY5YzAxMCJ9.VQ_9Xdvk8tiBHnHzAcAwV2CHfzBUjf1SvCKbHsgHfys",
  "access_expires_at": "2026-10-29T07:48:20.065638154Z",
  "refresh_token": "gFx-fZT7beeNQ0cPkpVAZK4lQpXYeogIMeZ2yYokhlI",
  "refresh_expires_at": "2026-11-28T07:33:20.065163131Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ff17acf1-5bf3-4a08-8382-3da68480be47",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8d742e5a-5e35-4b51-b63a-08c7c955837a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8d742e5a-5e35-4b51-b63a-08c7c955837a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4c157131190339745d9481f95cdd4fd9",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8d742e5a-5e35-4b51-b63a-08c7c955837a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731105752"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8d742e5a-5e35-4b51-b63a-08c7c955837a",
  "expires_at": "2026-10-29T08:03:20.289722Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/8d742e5a-5e35-4b51-b63a-08c7c955837a` → **200**

```json
{
  "id": "8d742e5a-5e35-4b51-b63a-08c7c955837a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:03:20.289722Z",
  "card": {
    "id": "42f74f64-a1be-44cf-80fa-753d556aaf65",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5490",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:33:20.528659Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "42f74f64-a1be-44cf-80fa-753d556aaf65",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5490",
      "card_type": "Visa",
      "created_at": "2026-10-29T07:33:20.528659Z"
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
  "device_ref": "sandbox-26573"
}
```

```json
{
  "challenge_id": "828cfdb3-d8d6-452d-9d7a-bcdd35fc4ffe",
  "expires_at": "2026-10-29T07:38:20.967295618Z",
  "resend_available_at": "2026-10-29T07:33:21.967295618Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "419895",
  "sent_at": "2026-10-29T07:33:20.969759932Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "828cfdb3-d8d6-452d-9d7a-bcdd35fc4ffe",
  "code": "419895",
  "device_ref": "sandbox-26573"
}
```

```json
{
  "session_id": "361af0a2-57e7-47b3-a41b-bbb363fd8e1f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDEwMSwiaWF0IjoxNzkzMjU5MjAxLCJqdGkiOiI1MDIzNTRiZC0yOWE0LTQwMzYtYmUxZC1kMDU1Yzg3Y2NjN2QiLCJzaWQiOiIzNjFhZjBhMi01N2U3LTQ3YjMtYTQxYi1iYmIzNjNmZDhlMWYifQ.KUhXQUiuX-dxqe2xn9gXTdgxEFgzLzTkwlOtIGyWdqM",
  "access_expires_at": "2026-10-29T07:48:21.207175822Z",
  "refresh_token": "ZhJAquB6kt5RiR0bzgcQ7HECrLkyaNdfVytMYhUqy1k",
  "refresh_expires_at": "2026-11-28T07:33:21.206666505Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d71a98c-cc11-45ab-954d-76eff0eb1ce4",
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
  "last_heartbeat_at": "2026-10-29T07:33:16.621083Z",
  "last_location_at": "2026-10-29T07:33:16.621083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d71a98c-cc11-45ab-954d-76eff0eb1ce4/handover` → **200**

```json
{
  "command_id": "97a35182-0753-4ece-bbfd-de8c0db8a7f1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d71a98c-cc11-45ab-954d-76eff0eb1ce4",
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
  "last_heartbeat_at": "2026-10-29T07:33:16.621083Z",
  "last_location_at": "2026-10-29T07:33:16.621083Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d71a98c-cc11-45ab-954d-76eff0eb1ce4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:21Z",
    "sequence": 1793259201857
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d71a98c-cc11-45ab-954d-76eff0eb1ce4",
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
  "last_heartbeat_at": "2026-10-29T07:33:21.874684Z",
  "last_location_at": "2026-10-29T07:33:21.874684Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d5cd1c2-bbbb-4aff-948d-dac4cce2c872",
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
  "id": "bc9534ac-e091-424f-b135-10e3aaa3368a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:22.098923Z",
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
  "command_id": "311e08e3-9b4b-4f89-986f-c8bdb9fa32ef",
  "quote_id": "bc9534ac-e091-424f-b135-10e3aaa3368a",
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
  "id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
  "created_at": "2026-10-29T07:33:22.334588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/357a1338-7009-4d37-8fbd-5bb2f8c10c5d` → **200**

```json
{
  "id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
  "created_at": "2026-10-29T07:33:22.334588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/357a1338-7009-4d37-8fbd-5bb2f8c10c5d` → **200**

```json
{
  "id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
  "created_at": "2026-10-29T07:33:22.334588Z",
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
    "id": "dc87b117-1f24-480a-bbc7-45b6bfd49eb5",
    "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
    "expires_at": "2026-10-29T07:33:37.796678Z",
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

`POST /api/driver/v1/offers/dc87b117-1f24-480a-bbc7-45b6bfd49eb5/accept` → **200**

```json
{
  "command_id": "deac1f44-2a04-4050-bd9c-4e52466c2499"
}
```

```json
{
  "id": "468140ba-b5d9-4521-bcb6-7bf63909fee3",
  "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6282f3e0-7def-4772-a789-98a28b0ecd62",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6282f3e0-7def-4772-a789-98a28b0ecd62",
  "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "assignment_id": "468140ba-b5d9-4521-bcb6-7bf63909fee3",
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

`POST /api/driver/v1/work-sessions/3d71a98c-cc11-45ab-954d-76eff0eb1ce4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:24Z",
    "sequence": 1793259204682
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d71a98c-cc11-45ab-954d-76eff0eb1ce4",
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
  "last_heartbeat_at": "2026-10-29T07:33:24.699939Z",
  "last_location_at": "2026-10-29T07:33:24.699939Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6282f3e0-7def-4772-a789-98a28b0ecd62/arrive` → **200**

```json
{
  "command_id": "71941252-00ae-462f-9a28-62828d08f85a",
  "expected_version": 0
}
```

```json
{
  "id": "6282f3e0-7def-4772-a789-98a28b0ecd62",
  "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "assignment_id": "468140ba-b5d9-4521-bcb6-7bf63909fee3",
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
  "arrived_at": "2026-10-29T07:33:24.926832Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6282f3e0-7def-4772-a789-98a28b0ecd62/start` → **200**

```json
{
  "command_id": "b58b946e-2302-4ac6-ad49-33b30d25bba4",
  "expected_version": 1
}
```

```json
{
  "id": "6282f3e0-7def-4772-a789-98a28b0ecd62",
  "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "assignment_id": "468140ba-b5d9-4521-bcb6-7bf63909fee3",
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
  "arrived_at": "2026-10-29T07:33:24.926832Z",
  "started_at": "2026-10-29T07:33:25.153505Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6282f3e0-7def-4772-a789-98a28b0ecd62/complete` → **200**

```json
{
  "command_id": "15a84d74-7a7d-4b62-9b13-e924267125eb",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:33:25Z",
  "cash_received": true
}
```

```json
{
  "id": "6282f3e0-7def-4772-a789-98a28b0ecd62",
  "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "assignment_id": "468140ba-b5d9-4521-bcb6-7bf63909fee3",
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
  "arrived_at": "2026-10-29T07:33:24.926832Z",
  "started_at": "2026-10-29T07:33:25.153505Z",
  "completed_at": "2026-10-29T07:33:25.383469Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/357a1338-7009-4d37-8fbd-5bb2f8c10c5d` → **200**

```json
{
  "id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
    "id": "468140ba-b5d9-4521-bcb6-7bf63909fee3",
    "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6282f3e0-7def-4772-a789-98a28b0ecd62",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:33:22.334588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/357a1338-7009-4d37-8fbd-5bb2f8c10c5d` → **200**

```json
{
  "id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
    "id": "468140ba-b5d9-4521-bcb6-7bf63909fee3",
    "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6282f3e0-7def-4772-a789-98a28b0ecd62",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:33:22.334588Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/357a1338-7009-4d37-8fbd-5bb2f8c10c5d` → **200**

```json
{
  "id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
    "id": "468140ba-b5d9-4521-bcb6-7bf63909fee3",
    "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6282f3e0-7def-4772-a789-98a28b0ecd62",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:33:22.334588Z",
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

`GET /api/rider/v1/orders/357a1338-7009-4d37-8fbd-5bb2f8c10c5d/tip` → **200**

```json
{
  "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
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
  "available_until": "2026-10-30T07:33:25.383469Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/357a1338-7009-4d37-8fbd-5bb2f8c10c5d/tip` → **201**

```json
{
  "command_id": "b1a4e14b-f168-41ac-b329-7d9d7f793643",
  "amount_minor": 2500
}
```

```json
{
  "id": "be4ad1b0-01d2-403d-ab7f-def2287eb462",
  "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:33:28.741887Z"
}
```

`GET /api/rider/v1/orders/357a1338-7009-4d37-8fbd-5bb2f8c10c5d/tip` → **200**

```json
{
  "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
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
  "available_until": "2026-10-30T07:33:25.383469Z",
  "open": false,
  "tip": {
    "id": "be4ad1b0-01d2-403d-ab7f-def2287eb462",
    "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:33:28.741887Z"
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
      "id": "16d15e2e-87b7-419f-9c54-630dd2398b6c",
      "at": "2026-10-29T07:33:25.840842Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
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
      "id": "c2445ac9-4646-498b-80f7-313d7ad448d1",
      "at": "2026-10-29T07:33:29.887257Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
      "counterpart_id": null
    },
    {
      "id": "16d15e2e-87b7-419f-9c54-630dd2398b6c",
      "at": "2026-10-29T07:33:25.840842Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "abcf5925-b615-4e5b-be78-9b1efce33687",
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
  "id": "dd114294-08d3-4bf8-8b55-4baeecd6bf07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:30.621057Z",
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
  "session_id": "4eb542c1-8ae7-4553-bf89-b4c6feaf75a3",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxMTEsImlhdCI6MTc5MzI1OTIxMSwianRpIjoiMjc1ZjVkNjEtNDY5OS00MDE4LThmOGUtYzJjNmU4MjdiNTg3Iiwic2lkIjoiNGViNTQyYzEtOGFlNy00NTUzLWJmODktYjRjNmZlYWY3NWEzIn0.8AREgi8z-SF2AyoD0UN01gxIZy5CWoivORSx3PNI_2Q",
  "access_expires_at": "2026-10-29T07:48:31.104034919Z",
  "refresh_token": "9HY-k4PaPwBd7HSHbNTie-BNPxJDUmw9ypAcsMyobuE",
  "refresh_expires_at": "2026-10-29T19:33:31.103632933Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380731105752` → **200**

```json
{
  "client_id": "55716e9c-d901-4947-a95e-d422b559e05d"
}
```

`POST /api/admin/v1/rider-wallets/55716e9c-d901-4947-a95e-d422b559e05d/top-ups` → **201**

```json
{
  "command_id": "0c4d6797-a58c-47d6-bb0f-36f993e32093",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
      "id": "bdd74e18-aff9-4218-a5ca-ecba29c8430a",
      "at": "2026-10-29T07:33:31.535525Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9c964ffb-0cca-4255-900d-a54d3141c3e1",
  "quote_id": "dd114294-08d3-4bf8-8b55-4baeecd6bf07",
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
  "id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
  "created_at": "2026-10-29T07:33:31.780012Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/78fe46a5-e5b7-44a9-bb0f-372ae0f01304` → **200**

```json
{
  "id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
  "created_at": "2026-10-29T07:33:31.780012Z",
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
    "id": "4e962f50-51d2-4aff-b224-0af7e8f74b96",
    "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
    "expires_at": "2026-10-29T07:33:46.783938Z",
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

`POST /api/driver/v1/offers/4e962f50-51d2-4aff-b224-0af7e8f74b96/accept` → **200**

```json
{
  "command_id": "94de2cab-ae50-44c9-a801-09753cc26787"
}
```

```json
{
  "id": "14c0fc5a-0b9e-4315-af1f-bf1664c46628",
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bcd29068-09b2-493a-8ba9-632534d0a4aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bcd29068-09b2-493a-8ba9-632534d0a4aa",
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
  "assignment_id": "14c0fc5a-0b9e-4315-af1f-bf1664c46628",
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

`POST /api/driver/v1/work-sessions/3d71a98c-cc11-45ab-954d-76eff0eb1ce4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:32Z",
    "sequence": 1793259212891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d71a98c-cc11-45ab-954d-76eff0eb1ce4",
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
  "last_heartbeat_at": "2026-10-29T07:33:32.908607Z",
  "last_location_at": "2026-10-29T07:33:32.908607Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bcd29068-09b2-493a-8ba9-632534d0a4aa/arrive` → **200**

```json
{
  "command_id": "0881b88c-e0d3-4ce3-ae0d-2234ae7937db",
  "expected_version": 0
}
```

```json
{
  "id": "bcd29068-09b2-493a-8ba9-632534d0a4aa",
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
  "assignment_id": "14c0fc5a-0b9e-4315-af1f-bf1664c46628",
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
  "arrived_at": "2026-10-29T07:33:33.135324Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bcd29068-09b2-493a-8ba9-632534d0a4aa/start` → **200**

```json
{
  "command_id": "e3d7f5fb-2220-4a80-886c-7d111599103e",
  "expected_version": 1
}
```

```json
{
  "id": "bcd29068-09b2-493a-8ba9-632534d0a4aa",
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
  "assignment_id": "14c0fc5a-0b9e-4315-af1f-bf1664c46628",
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
  "arrived_at": "2026-10-29T07:33:33.135324Z",
  "started_at": "2026-10-29T07:33:33.369165Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bcd29068-09b2-493a-8ba9-632534d0a4aa/complete` → **200**

```json
{
  "command_id": "c754a58a-94d0-4da9-a05c-d78ace28e93b",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:33:33Z",
  "cash_received": true
}
```

```json
{
  "id": "bcd29068-09b2-493a-8ba9-632534d0a4aa",
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
  "assignment_id": "14c0fc5a-0b9e-4315-af1f-bf1664c46628",
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
  "arrived_at": "2026-10-29T07:33:33.135324Z",
  "started_at": "2026-10-29T07:33:33.369165Z",
  "completed_at": "2026-10-29T07:33:33.604042Z",
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
  "client_id": "55716e9c-d901-4947-a95e-d422b559e05d",
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
      "id": "bdd74e18-aff9-4218-a5ca-ecba29c8430a",
      "at": "2026-10-29T07:33:31.535525Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
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

`GET /api/rider/v1/orders/78fe46a5-e5b7-44a9-bb0f-372ae0f01304/tip` → **200**

```json
{
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
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
  "available_until": "2026-10-30T07:33:33.604042Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/78fe46a5-e5b7-44a9-bb0f-372ae0f01304/tip` → **201**

```json
{
  "command_id": "2049c183-3643-4186-8341-322aca1bc67c",
  "amount_minor": 2500
}
```

```json
{
  "id": "a334d194-bf9a-41b9-a264-574abcecf1b7",
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T07:33:34.508923Z"
}
```

`GET /api/rider/v1/orders/78fe46a5-e5b7-44a9-bb0f-372ae0f01304/tip` → **200**

```json
{
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
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
  "available_until": "2026-10-30T07:33:33.604042Z",
  "open": false,
  "tip": {
    "id": "a334d194-bf9a-41b9-a264-574abcecf1b7",
    "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T07:33:34.508923Z"
  }
}
```

`GET /api/rider/v1/orders/78fe46a5-e5b7-44a9-bb0f-372ae0f01304/tip` → **200**

```json
{
  "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
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
  "available_until": "2026-10-30T07:33:33.604042Z",
  "open": false,
  "tip": {
    "id": "a334d194-bf9a-41b9-a264-574abcecf1b7",
    "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T07:33:34.508923Z"
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
      "id": "fdc8af9e-9de4-4761-88e3-a121e606dde8",
      "at": "2026-10-29T07:33:35.940371Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
      "counterpart_id": null
    },
    {
      "id": "ea4c2334-19c4-4eaa-8c39-6674d48298f8",
      "at": "2026-10-29T07:33:33.91988Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "78fe46a5-e5b7-44a9-bb0f-372ae0f01304",
      "counterpart_id": null
    },
    {
      "id": "c2445ac9-4646-498b-80f7-313d7ad448d1",
      "at": "2026-10-29T07:33:29.887257Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
      "counterpart_id": null
    },
    {
      "id": "16d15e2e-87b7-419f-9c54-630dd2398b6c",
      "at": "2026-10-29T07:33:25.840842Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "357a1338-7009-4d37-8fbd-5bb2f8c10c5d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d71a98c-cc11-45ab-954d-76eff0eb1ce4",
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
  "last_heartbeat_at": "2026-10-29T07:33:32.908607Z",
  "last_location_at": "2026-10-29T07:33:32.908607Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d71a98c-cc11-45ab-954d-76eff0eb1ce4/close` → **200**

```json
{
  "command_id": "1ef01576-c799-4936-8d43-d9e0cff8a6d0",
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

Done: card order 78fe46a5-e5b7-44a9-bb0f-372ae0f01304.

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
  "phone": "+380735404076",
  "device_ref": "sandbox-25070"
}
```

```json
{
  "challenge_id": "4f6d5b89-b75d-43d3-9761-01b43d4c2775",
  "expires_at": "2026-10-29T07:38:37.056914822Z",
  "resend_available_at": "2026-10-29T07:33:38.056914822Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735404076` → **200**

```json
{
  "phone": "+380735404076",
  "audience": "CLIENT",
  "code": "070660",
  "sent_at": "2026-10-29T07:33:37.059059535Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f6d5b89-b75d-43d3-9761-01b43d4c2775",
  "code": "070660",
  "device_ref": "sandbox-25070"
}
```

```json
{
  "session_id": "c91d3379-6620-48b9-8c10-b6253bb08e1d",
  "subject": {
    "type": "CLIENT",
    "id": "1450e4da-a0e2-4419-b9d6-a61c46199b2f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDUwZTRkYS1hMGUyLTQ0MTktYjlkNi1hNjFjNDYxOTliMmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTE3LCJpYXQiOjE3OTMyNTkyMTcsImp0aSI6Ijg4ODczOTI5LTFhY2QtNGM2NS1hNDM1LTNiYTJkYzhhZGI1NyIsInNpZCI6ImM5MWQzMzc5LTY2MjAtNDhiOS04YzEwLWI2MjUzYmIwOGUxZCJ9.ef1lM3G5_JGUm3r7ShnK_MN5-RbyoJ-ejDY_hfABJpw",
  "access_expires_at": "2026-10-29T07:48:37.299508837Z",
  "refresh_token": "NAn8CrrjKqhvlOfN6FUHs99oBqi7tN3pF1uvqjJiX0I",
  "refresh_expires_at": "2026-11-28T07:33:37.299020659Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "6cb6f87e-4174-4d90-adba-149f92ad456c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "61072377-0203-4b65-8663-b79614aedae1",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-61072377-0203-4b65-8663-b79614aedae1",
    "orderDate": "1793259217",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "72f185bb886c2f5fe9d81a3be7557cbe",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=61072377-0203-4b65-8663-b79614aedae1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735404076"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=61072377-0203-4b65-8663-b79614aedae1",
  "created_at": "2026-10-29T07:33:37.524832Z",
  "expires_at": "2026-10-29T08:03:37.524832Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/61072377-0203-4b65-8663-b79614aedae1` → **200**

```json
{
  "id": "61072377-0203-4b65-8663-b79614aedae1",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:33:37.524832Z",
  "expires_at": "2026-10-29T08:03:37.524832Z",
  "completed_at": "2026-10-29T07:33:37.745602Z",
  "masked_pan": "41****2063",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1450e4da-a0e2-4419-b9d6-a61c46199b2f",
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
      "id": "6c2e8459-a7e4-46dc-b7f2-c6d0ebccb680",
      "at": "2026-10-29T07:33:37.951693Z",
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
  "client_id": "1450e4da-a0e2-4419-b9d6-a61c46199b2f",
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
      "id": "6c2e8459-a7e4-46dc-b7f2-c6d0ebccb680",
      "at": "2026-10-29T07:33:37.951693Z",
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
  "device_ref": "sandbox-20433"
}
```

```json
{
  "challenge_id": "389af4a6-a9e9-4105-897c-4d1fd94a27c1",
  "expires_at": "2026-10-29T07:38:38.41853299Z",
  "resend_available_at": "2026-10-29T07:33:39.41853299Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "715965",
  "sent_at": "2026-10-29T07:33:38.42045702Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "389af4a6-a9e9-4105-897c-4d1fd94a27c1",
  "code": "715965",
  "device_ref": "sandbox-20433"
}
```

```json
{
  "session_id": "5e7831a2-a097-40bf-9315-ed63e2f004ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDExOCwiaWF0IjoxNzkzMjU5MjE4LCJqdGkiOiJjM2E2MWU0Ni0wNzA1LTQ2OWItODk5Mi1hYmQxYTkyY2U0ODciLCJzaWQiOiI1ZTc4MzFhMi1hMDk3LTQwYmYtOTMxNS1lZDYzZTJmMDA0YWUifQ.uAedtQd0gMnnj1qGkwEy8dkV-Cm6qcQaSWcNdFTO0y8",
  "access_expires_at": "2026-10-29T07:48:38.659903942Z",
  "refresh_token": "FsBiQoHqI_49y4qciG87dj290qRVod5MtP0H9ArM7Jw",
  "refresh_expires_at": "2026-11-28T07:33:38.659459563Z",
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
  "command_id": "872f75a6-736c-4a69-820a-96a7995367b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "30b7b4dd-16fa-41e6-a8e5-fd1b067363d7",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-30b7b4dd-16fa-41e6-a8e5-fd1b067363d7",
    "orderDate": "1793259219",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5a5cca0bd95298c844b5b9e077ea2bb5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=30b7b4dd-16fa-41e6-a8e5-fd1b067363d7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=30b7b4dd-16fa-41e6-a8e5-fd1b067363d7",
  "created_at": "2026-10-29T07:33:39.084635Z",
  "expires_at": "2026-10-29T08:03:39.084635Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/30b7b4dd-16fa-41e6-a8e5-fd1b067363d7` → **200**

```json
{
  "id": "30b7b4dd-16fa-41e6-a8e5-fd1b067363d7",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T07:33:39.084635Z",
  "expires_at": "2026-10-29T08:03:39.084635Z",
  "completed_at": "2026-10-29T07:33:39.306019Z",
  "masked_pan": "41****6921",
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
      "id": "d84d3575-aa5d-436d-b0e8-2a3a9839e904",
      "at": "2026-10-29T07:33:39.959123Z",
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
  "command_id": "5a681bd8-14fc-48bc-8d76-b13115b0e614",
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
  "correlation_id": "4aade2d2-65c0-4d41-9eee-843618d3cfb8"
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
  "device_ref": "sandbox-29862"
}
```

```json
{
  "challenge_id": "ba90f223-33fa-4c16-a9f6-aacffd896a6c",
  "expires_at": "2026-10-29T07:38:41.204350725Z",
  "resend_available_at": "2026-10-29T07:33:42.204350725Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "068887",
  "sent_at": "2026-10-29T07:33:41.206237601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba90f223-33fa-4c16-a9f6-aacffd896a6c",
  "code": "068887",
  "device_ref": "sandbox-29862"
}
```

```json
{
  "session_id": "581c96f9-93e4-4c5b-85c4-7c851dc7b3c6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDEyMSwiaWF0IjoxNzkzMjU5MjIxLCJqdGkiOiI0YjZmMTQ5MS1mNzdjLTQ1ZTMtYWM5NS1iOGQyZDlhZTA1YzUiLCJzaWQiOiI1ODFjOTZmOS05M2U0LTRjNWItODVjNC03Yzg1MWRjN2IzYzYifQ.ztchyhhmiERhd4ptUpEYd2BSy846RuNYKjf63t5gT7E",
  "access_expires_at": "2026-10-29T07:48:41.443168398Z",
  "refresh_token": "4UMxDIGlJ9J7mqUe6uH24VMdzckTfDpX695Fm_JtQPE",
  "refresh_expires_at": "2026-11-28T07:33:41.442748345Z",
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
  "command_id": "2d0ecc80-61aa-4131-92de-be6313087a16",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:41Z",
    "sequence": 1793259221873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "159c9c8e-068e-4e86-93af-41ef39f44e36",
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
  "last_heartbeat_at": "2026-10-29T07:33:41.890184Z",
  "last_location_at": "2026-10-29T07:33:41.890184Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634495762",
  "device_ref": "sandbox-763"
}
```

```json
{
  "challenge_id": "1eee940d-892d-44d8-ba54-28ffdbc3e0fe",
  "expires_at": "2026-10-29T07:38:42.107198556Z",
  "resend_available_at": "2026-10-29T07:33:43.107198556Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634495762` → **200**

```json
{
  "phone": "+380634495762",
  "audience": "CLIENT",
  "code": "504164",
  "sent_at": "2026-10-29T07:33:42.109484976Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1eee940d-892d-44d8-ba54-28ffdbc3e0fe",
  "code": "504164",
  "device_ref": "sandbox-763"
}
```

```json
{
  "session_id": "f984baff-3b61-444e-9281-510991c51b23",
  "subject": {
    "type": "CLIENT",
    "id": "1ff5e732-9927-4587-b597-560f6b474877"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmY1ZTczMi05OTI3LTQ1ODctYjU5Ny01NjBmNmI0NzQ4NzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTIyLCJpYXQiOjE3OTMyNTkyMjIsImp0aSI6Ijc0MGM5OGI3LTBiMDgtNDhiMy04MDBlLTFiMDMzZWEyMDUyMCIsInNpZCI6ImY5ODRiYWZmLTNiNjEtNDQ0ZS05MjgxLTUxMDk5MWM1MWIyMyJ9.dIPBucbDlLM2KAV7HAYNLjD3T4X-w9t2cOk8CFvGWz0",
  "access_expires_at": "2026-10-29T07:48:42.349700987Z",
  "refresh_token": "NgUtBj9v2HKqU-ED46igoHnj_dFDEofe6snfaL8rDxA",
  "refresh_expires_at": "2026-11-28T07:33:42.349234395Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3e1212ab-d0a7-4b58-ab3a-0d0753650e8e",
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
  "id": "41807c44-917b-4e22-9cd9-b77b96f40e97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:42.570612Z",
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
  "command_id": "3d03a5c5-454b-4843-b4d4-967b65e2d07e",
  "quote_id": "41807c44-917b-4e22-9cd9-b77b96f40e97",
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
  "id": "badda135-326c-4948-ad04-f4db4f5d2db6",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ff5e732-9927-4587-b597-560f6b474877",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:33:42.794714Z",
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
    "id": "eefc05cf-cce7-4997-80aa-36a9e77db557",
    "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
    "expires_at": "2026-10-29T07:33:57.797543Z",
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

`POST /api/driver/v1/offers/eefc05cf-cce7-4997-80aa-36a9e77db557/accept` → **200**

```json
{
  "command_id": "505ae049-445d-407c-9619-7352e775c2cd"
}
```

```json
{
  "id": "8509b611-fc95-4eb5-a53c-adecb2bf1a8e",
  "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6e3164b1-95af-4ecd-a605-cdd949124319",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6e3164b1-95af-4ecd-a605-cdd949124319",
  "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
  "assignment_id": "8509b611-fc95-4eb5-a53c-adecb2bf1a8e",
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

`POST /api/driver/v1/work-sessions/159c9c8e-068e-4e86-93af-41ef39f44e36/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:33:43Z",
    "sequence": 1793259223670
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "159c9c8e-068e-4e86-93af-41ef39f44e36",
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
  "last_heartbeat_at": "2026-10-29T07:33:43.686654Z",
  "last_location_at": "2026-10-29T07:33:43.686654Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6e3164b1-95af-4ecd-a605-cdd949124319/arrive` → **200**

```json
{
  "command_id": "26ef8835-776b-4ea8-8f96-0f683602e990",
  "expected_version": 0
}
```

```json
{
  "id": "6e3164b1-95af-4ecd-a605-cdd949124319",
  "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
  "assignment_id": "8509b611-fc95-4eb5-a53c-adecb2bf1a8e",
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
  "arrived_at": "2026-10-29T07:33:43.907304Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6e3164b1-95af-4ecd-a605-cdd949124319/start` → **200**

```json
{
  "command_id": "db8e529c-4bc4-491e-b7b0-bb538b356808",
  "expected_version": 1
}
```

```json
{
  "id": "6e3164b1-95af-4ecd-a605-cdd949124319",
  "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
  "assignment_id": "8509b611-fc95-4eb5-a53c-adecb2bf1a8e",
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
  "arrived_at": "2026-10-29T07:33:43.907304Z",
  "started_at": "2026-10-29T07:33:44.1349Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6e3164b1-95af-4ecd-a605-cdd949124319/complete` → **200**

```json
{
  "command_id": "571bde8f-2c66-484c-99f5-03bbe14c72cc",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:33:44Z",
  "cash_received": false
}
```

```json
{
  "id": "6e3164b1-95af-4ecd-a605-cdd949124319",
  "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
  "assignment_id": "8509b611-fc95-4eb5-a53c-adecb2bf1a8e",
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
  "arrived_at": "2026-10-29T07:33:43.907304Z",
  "started_at": "2026-10-29T07:33:44.1349Z",
  "completed_at": "2026-10-29T07:33:44.365122Z",
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
  "session_id": "deac327d-e1b4-4f8b-bfe1-b4a5de444f26",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxMjQsImlhdCI6MTc5MzI1OTIyNCwianRpIjoiMjNjNWZkNTgtYjcxNi00MDQzLTk0YTMtZGYzY2NiM2Q3ODdmIiwic2lkIjoiZGVhYzMyN2QtZTFiNC00ZjhiLWJmZTEtYjRhNWRlNDQ0ZjI2In0.q8oNXxRnQq6tm_U9hCP8Zzt3rKE1zn6S3iCJLH80pkY",
  "access_expires_at": "2026-10-29T07:48:44.848599201Z",
  "refresh_token": "du9_00S8R56MBwWZvrNYjQ7Kp_hXTRxVvqDz9Z8maBI",
  "refresh_expires_at": "2026-10-29T19:33:44.848171951Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/badda135-326c-4948-ad04-f4db4f5d2db6/cash-dispute` → **200**

```json
{
  "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "1ff5e732-9927-4587-b597-560f6b474877",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:33:45.001535Z",
  "decide_by": "2026-11-12T07:33:45.001535Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T07:33:45.001535Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "1ff5e732-9927-4587-b597-560f6b474877",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T07:33:45.001535Z",
      "decide_by": "2026-11-12T07:33:45.001535Z",
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

`POST /api/admin/v1/orders/badda135-326c-4948-ad04-f4db4f5d2db6/cash-dispute/decide` → **400**

```json
{
  "command_id": "05842209-f912-4e67-befa-247b2c83024d",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/badda135-326c-4948-ad04-f4db4f5d2db6/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b7c38db2-8c20-4984-b372-2aa32f98791b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/badda135-326c-4948-ad04-f4db4f5d2db6/cash-dispute/decide` → **200**

```json
{
  "command_id": "ea506259-aa63-40c8-be3d-263364b8b273",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "1ff5e732-9927-4587-b597-560f6b474877",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T07:33:45.001535Z",
  "decide_by": "2026-11-12T07:33:45.001535Z",
  "decision": "PAY_DRIVER",
  "decided_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T07:33:45.754526Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/badda135-326c-4948-ad04-f4db4f5d2db6/cash-dispute/decide` → **409**

```json
{
  "command_id": "336312b2-9ddb-49e1-a64f-d52a80cb26ae",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/badda135-326c-4948-ad04-f4db4f5d2db6/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a790b80f-2f83-4cb7-82b4-974b373a307b"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "159c9c8e-068e-4e86-93af-41ef39f44e36",
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
  "last_heartbeat_at": "2026-10-29T07:33:43.686654Z",
  "last_location_at": "2026-10-29T07:33:43.686654Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/159c9c8e-068e-4e86-93af-41ef39f44e36/close` → **200**

```json
{
  "command_id": "ca61ac32-ac13-4202-ae6e-aafa88c242da",
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
  "session_id": "2ad0560a-f3cd-4ae0-89bc-c43fefae2a89",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxMjYsImlhdCI6MTc5MzI1OTIyNiwianRpIjoiNGZiMDhkNGUtN2UyOC00Y2E0LWE3NWMtOTEyMDRmMzUzMzk2Iiwic2lkIjoiMmFkMDU2MGEtZjNjZC00YWUwLTg5YmMtYzQzZmVmYWUyYTg5In0.Qn92m90bJt885gVoJmIoAN0lRdtYGHQZfPA5KuNknvA",
  "access_expires_at": "2026-10-29T07:48:46.923539862Z",
  "refresh_token": "IfPV3AfLJKUBZmmOvKaqH7LA30i8NbxbSldm5YFigTk",
  "refresh_expires_at": "2026-10-29T19:33:46.923101562Z",
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
  "phone": "+48600594260",
  "device_ref": "sandbox-14761"
}
```

```json
{
  "challenge_id": "3c511f0d-4909-4a92-be0f-94d5ae4d7355",
  "expires_at": "2026-10-29T07:38:47.578317299Z",
  "resend_available_at": "2026-10-29T07:33:48.578317299Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600594260` → **200**

```json
{
  "phone": "+48600594260",
  "audience": "CLIENT",
  "code": "299242",
  "sent_at": "2026-10-29T07:33:47.580414266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c511f0d-4909-4a92-be0f-94d5ae4d7355",
  "code": "299242",
  "device_ref": "sandbox-14761"
}
```

```json
{
  "session_id": "41d5af81-ad78-4de7-b976-3b770402033d",
  "subject": {
    "type": "CLIENT",
    "id": "c5b07512-f065-4621-a322-73dbcf578eef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWIwNzUxMi1mMDY1LTQ2MjEtYTMyMi03M2RiY2Y1NzhlZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTI3LCJpYXQiOjE3OTMyNTkyMjcsImp0aSI6ImZjYzM1Zjk5LWZiM2QtNGFhYy04MDg5LTYxODExZTlhNzA2ZCIsInNpZCI6IjQxZDVhZjgxLWFkNzgtNGRlNy1iOTc2LTNiNzcwNDAyMDMzZCJ9.s4qjyy_EE_hMx3Jb_ypdJeloBQ8_Ae0RIXhLfK0A1tA",
  "access_expires_at": "2026-10-29T07:48:47.822022232Z",
  "refresh_token": "6ZCMNbK3k7UBHPb4jDpweUBImjU5dYHFlHunxRZTq90",
  "refresh_expires_at": "2026-11-28T07:33:47.8215963Z",
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
  "command_id": "38cafb64-0036-4324-9689-85196bdbe65c",
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
  "correlation_id": "a99792b7-d2b4-4842-a157-03d271ceda1d",
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
  "command_id": "c4a11439-2776-4764-8be8-1f84de3c051f",
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
  "paused_at": "2026-10-29T07:33:48.690578019Z",
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
  "command_id": "579a724f-68c6-4476-b934-a3f7b869004e",
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
  "id": "052d4706-3a46-498c-97ab-ed26cf2dff8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:49.162659Z",
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
  "command_id": "60466e25-4907-4532-99b1-0b621c4acf0c",
  "quote_id": "052d4706-3a46-498c-97ab-ed26cf2dff8e",
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
  "correlation_id": "5adbc2b6-75c1-4e8c-b4da-b2d361ee0212"
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
  "paused_at": "2026-10-29T07:33:48.690578Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "13c09e3c-6460-4e78-be68-df08a403ab5d",
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
  "command_id": "8a0b8e6c-cdb1-47f2-aeb8-94ec17db1c03",
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
  "command_id": "9feec34d-da71-4d17-bdd2-d371264e6f27",
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
  "id": "c04657a1-64ea-4c40-893f-d214ba0f346f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:50.503079Z",
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
  "command_id": "ed559fd0-419c-498c-b8e9-57369786207f",
  "quote_id": "c04657a1-64ea-4c40-893f-d214ba0f346f",
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
  "correlation_id": "df7c9172-312b-4c30-9259-099ae6e05029"
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
  "command_id": "dadd0d12-44c8-46c2-b800-4d71653c819d",
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
  "command_id": "bd5085de-eeb2-4f0b-9e92-5963b92c0126",
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
  "id": "3a6eb2e3-cbd4-4093-a7ce-2d5b4fd219a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:51.404383Z",
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
  "command_id": "58973867-cc54-48e4-bf10-a07554acc3ee",
  "quote_id": "3a6eb2e3-cbd4-4093-a7ce-2d5b4fd219a8",
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
  "correlation_id": "d32a1706-61f6-40b1-a12f-428c0a4768f5"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "36cc92e1-5b56-4de8-9cd6-b5ad46027d83",
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
  "correlation_id": "d6eb1df3-a606-4d76-a9bf-150724c7496d"
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
  "command_id": "049b36bb-4034-44b3-8ed2-e3a15ac1fee2",
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
  "phone": "+380672496457",
  "device_ref": "sandbox-12356"
}
```

```json
{
  "challenge_id": "2d917f4f-9d2d-4bc6-890b-e9f9dfb48111",
  "expires_at": "2026-10-29T07:38:52.534276258Z",
  "resend_available_at": "2026-10-29T07:33:53.534276258Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672496457` → **200**

```json
{
  "phone": "+380672496457",
  "audience": "CLIENT",
  "code": "788458",
  "sent_at": "2026-10-29T07:33:52.536244383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d917f4f-9d2d-4bc6-890b-e9f9dfb48111",
  "code": "788458",
  "device_ref": "sandbox-12356"
}
```

```json
{
  "session_id": "0bdc5dda-80d5-4f0d-aaea-9e5b4b7bfaf8",
  "subject": {
    "type": "CLIENT",
    "id": "0e5bae71-a8d0-443d-b706-bf34facdf88a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTViYWU3MS1hOGQwLTQ0M2QtYjcwNi1iZjM0ZmFjZGY4OGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTMyLCJpYXQiOjE3OTMyNTkyMzIsImp0aSI6IjI4Y2ExY2NiLTdhMmQtNGJiYi1hMTEwLTQ5NjJlNjE0M2QzNyIsInNpZCI6IjBiZGM1ZGRhLTgwZDUtNGYwZC1hYWVhLTllNWI0YjdiZmFmOCJ9.70DEg1cMw-owXjnYHe4JFr4oRtrGdrGiRihKPT3Bcao",
  "access_expires_at": "2026-10-29T07:48:52.774905432Z",
  "refresh_token": "fEqvZCTWtF7M6VoVK-pIc5Viur6hNEXkZIz8R5nK6-Y",
  "refresh_expires_at": "2026-11-28T07:33:52.774501362Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0e5bae71-a8d0-443d-b706-bf34facdf88a",
  "session_id": "0bdc5dda-80d5-4f0d-aaea-9e5b4b7bfaf8",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f6ad376d-274c-4a87-a088-028850a35fea",
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
  "id": "333a1b3a-fec3-445a-8c46-57c3dc9f82e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:38:53.205824Z",
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
  "challenge_id": "78b577ff-b3cc-4ac5-b824-d51b2488f9e7",
  "expires_at": "2026-10-29T07:38:55.43872819Z",
  "resend_available_at": "2026-10-29T07:33:56.43872819Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672496457` → **200**

```json
{
  "phone": "+380672496457",
  "audience": "CLIENT",
  "code": "006793",
  "sent_at": "2026-10-29T07:33:55.440359497Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "5af69f66-f7f1-4ab1-aae1-efda52e8809c",
  "challenge_id": "78b577ff-b3cc-4ac5-b824-d51b2488f9e7",
  "otp_code": "006793"
}
```

```json
{
  "client_id": "0e5bae71-a8d0-443d-b706-bf34facdf88a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T07:33:55.685343126Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "584390cf-adbf-4107-ba88-85b45d7c0311",
  "quote_id": "333a1b3a-fec3-445a-8c46-57c3dc9f82e1",
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
  "correlation_id": "d624944c-a5c7-4782-bb88-dd7249f65249"
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
  "session_id": "81302da7-0595-46fd-8c86-1f859cccd482",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxMzYsImlhdCI6MTc5MzI1OTIzNiwianRpIjoiOTdiMDU0ZmYtMmZiZi00Y2YyLWE5OWItZTFmYjI5NmE1MjE4Iiwic2lkIjoiODEzMDJkYTctMDU5NS00NmZkLThjODYtMWY4NTljY2NkNDgyIn0.ECPQkfdRWiBj6s77h9_kjQQt7gSMArMhLHiInTirFFM",
  "access_expires_at": "2026-10-29T07:48:56.390180046Z",
  "refresh_token": "VWwHGKpwPk0ei1v4FPK4fIqp5JD5ae0yWPBtErDs5TE",
  "refresh_expires_at": "2026-10-29T19:33:56.389732728Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "0e5bae71-a8d0-443d-b706-bf34facdf88a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T07:33:55.685343Z",
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

`POST /api/admin/v1/client-deletions/0e5bae71-a8d0-443d-b706-bf34facdf88a/complete` → **200**

```json
{
  "command_id": "1f381ca8-7e67-48f5-ab1d-c4050854a101",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "0e5bae71-a8d0-443d-b706-bf34facdf88a",
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
  "correlation_id": "7e045655-494a-419f-a338-8cea74e0972c"
}
```

Done: client 0e5bae71-a8d0-443d-b706-bf34facdf88a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661692428",
  "device_ref": "sandbox-17841"
}
```

```json
{
  "challenge_id": "7ecc9357-b283-40c2-852c-2f5890036b93",
  "expires_at": "2026-10-29T07:38:57.284569112Z",
  "resend_available_at": "2026-10-29T07:33:58.284569112Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661692428` → **200**

```json
{
  "phone": "+380661692428",
  "audience": "CLIENT",
  "code": "123809",
  "sent_at": "2026-10-29T07:33:57.286287561Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ecc9357-b283-40c2-852c-2f5890036b93",
  "code": "123809",
  "device_ref": "sandbox-17841"
}
```

```json
{
  "session_id": "9942f365-15fc-41f6-b161-50edae06cb12",
  "subject": {
    "type": "CLIENT",
    "id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOWFkZTdlNS01ZDQwLTQyYzctODFkMi0yNGYwYjA2ODU5ZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTM3LCJpYXQiOjE3OTMyNTkyMzcsImp0aSI6Ijk4Mzg2NzhjLWE5OGItNDFlZi1iZDY2LWEyNmE2YjYyNTRiNiIsInNpZCI6Ijk5NDJmMzY1LTE1ZmMtNDFmNi1iMTYxLTUwZWRhZTA2Y2IxMiJ9.Jd0YgzD7UtuLLgPheC9wWbe8-TScnc_-LfMU3Z9pKzY",
  "access_expires_at": "2026-10-29T07:48:57.528970065Z",
  "refresh_token": "Y5jfM0K-GlBJ4t3KANRugwplkWy8h8pG4fyeZU2Ysj8",
  "refresh_expires_at": "2026-11-28T07:33:57.528592714Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef",
  "session_id": "9942f365-15fc-41f6-b161-50edae06cb12",
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
  "session_id": "c3122874-2480-4673-802a-fe1b6a31a98b",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxMzgsImlhdCI6MTc5MzI1OTIzOCwianRpIjoiNDhlNjM1YWItZGQ4Yi00MDZkLTkxY2EtNjQ0ZjE0MWVhNDE0Iiwic2lkIjoiYzMxMjI4NzQtMjQ4MC00NjczLTgwMmEtZmUxYjZhMzFhOThiIn0.r0WpQ3Tr84jfy1zpA6KTpJT2uoGd77DmK_ovP1XJmiM",
  "access_expires_at": "2026-10-29T07:48:58.216325583Z",
  "refresh_token": "2FaPGRRU_H1BwuLAB7aK-MgprUEweEd9zzKxSXsO96k",
  "refresh_expires_at": "2026-10-29T19:33:58.215903917Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1692428&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef",
      "phone": "+380661692428",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T07:33:57.527126Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/b9ade7e5-5d40-42c7-81d2-24f0b06859ef` → **200**

```json
{
  "client": {
    "id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef",
    "phone": "+380661692428",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:33:57.527126Z",
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

`POST /api/admin/v1/clients/b9ade7e5-5d40-42c7-81d2-24f0b06859ef/block` → **400**

```json
{
  "command_id": "f98f8ab9-c5b4-47a5-82a8-98bb7fa8e813",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b9ade7e5-5d40-42c7-81d2-24f0b06859ef/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f443f9d0-232f-4965-b8e8-07e0295546ae",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/b9ade7e5-5d40-42c7-81d2-24f0b06859ef/block` → **200**

```json
{
  "command_id": "9b06f1b2-ff50-470f-a03b-343c963017ff",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef",
  "phone": "+380661692428",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T07:33:57.527126Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T07:33:59.146678Z",
    "by": "ca349082-99eb-4d76-baa2-a610d81cb572"
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
  "correlation_id": "6d3d160e-613f-4d9c-9586-3875f21ff500"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661692428",
  "device_ref": "sandbox-10435"
}
```

```json
{
  "challenge_id": "f9d69fb4-aa63-4aac-be7e-c6418e8df324",
  "expires_at": "2026-10-29T07:39:01.583139508Z",
  "resend_available_at": "2026-10-29T07:34:02.583139508Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661692428` → **200**

```json
{
  "phone": "+380661692428",
  "audience": "CLIENT",
  "code": "285445",
  "sent_at": "2026-10-29T07:34:01.585055777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "f9d69fb4-aa63-4aac-be7e-c6418e8df324",
  "code": "285445",
  "device_ref": "sandbox-10435"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "39d9dc5b-0b22-468e-bf29-bbbc8e880931"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/b9ade7e5-5d40-42c7-81d2-24f0b06859ef` → **200**

```json
{
  "client": {
    "id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef",
    "phone": "+380661692428",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T07:33:57.527126Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T07:33:59.146678Z",
      "by": "ca349082-99eb-4d76-baa2-a610d81cb572"
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

`POST /api/admin/v1/clients/b9ade7e5-5d40-42c7-81d2-24f0b06859ef/unblock` → **200**

```json
{
  "command_id": "40d46af1-1c49-4d30-93e2-19c320b5f61b",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef",
  "phone": "+380661692428",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T07:33:57.527126Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661692428",
  "device_ref": "sandbox-9600"
}
```

```json
{
  "challenge_id": "046b6eb0-82d6-47d2-a151-42b5929abbbf",
  "expires_at": "2026-10-29T07:39:04.540580107Z",
  "resend_available_at": "2026-10-29T07:34:05.540580107Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661692428` → **200**

```json
{
  "phone": "+380661692428",
  "audience": "CLIENT",
  "code": "221298",
  "sent_at": "2026-10-29T07:34:04.542400997Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "046b6eb0-82d6-47d2-a151-42b5929abbbf",
  "code": "221298",
  "device_ref": "sandbox-9600"
}
```

```json
{
  "session_id": "dab35771-1d96-498f-85a5-2f92607d681c",
  "subject": {
    "type": "CLIENT",
    "id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOWFkZTdlNS01ZDQwLTQyYzctODFkMi0yNGYwYjA2ODU5ZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTQ0LCJpYXQiOjE3OTMyNTkyNDQsImp0aSI6IjY3MzBkN2VjLTcyMjMtNGEyMS1hM2Q4LTg3NTQ2MjdhMDM3YiIsInNpZCI6ImRhYjM1NzcxLTFkOTYtNDk4Zi04NWE1LTJmOTI2MDdkNjgxYyJ9.fOXpCf6apLb_KFlv2fmMM1x5usp2HfYJEuqYqljH5ec",
  "access_expires_at": "2026-10-29T07:49:04.781534945Z",
  "refresh_token": "XmGR4XMNLlPoQMoYAyxr3eOPqtTNM5Tcy164tGvIj6o",
  "refresh_expires_at": "2026-11-28T07:34:04.781050647Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b9ade7e5-5d40-42c7-81d2-24f0b06859ef",
  "session_id": "dab35771-1d96-498f-85a5-2f92607d681c",
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
  "phone": "+380668662132",
  "device_ref": "sandbox-6556"
}
```

```json
{
  "challenge_id": "a48e1a1d-0c86-42d4-a356-3fb7164ffa2d",
  "expires_at": "2026-10-29T07:39:05.229206298Z",
  "resend_available_at": "2026-10-29T07:34:06.229206298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668662132` → **200**

```json
{
  "phone": "+380668662132",
  "audience": "CLIENT",
  "code": "649699",
  "sent_at": "2026-10-29T07:34:05.231434643Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a48e1a1d-0c86-42d4-a356-3fb7164ffa2d",
  "code": "649699",
  "device_ref": "sandbox-6556"
}
```

```json
{
  "session_id": "bb7b7cd6-12f5-4a22-9c93-f2ad268086af",
  "subject": {
    "type": "CLIENT",
    "id": "5257a62a-1cdf-4517-a7f7-ca7f438309e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MjU3YTYyYS0xY2RmLTQ1MTctYTdmNy1jYTdmNDM4MzA5ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTQ1LCJpYXQiOjE3OTMyNTkyNDUsImp0aSI6Ijg5OGY5YWFiLTZiYmEtNGE3OC04Y2JlLWNjMTZjZmQ1OGVjZiIsInNpZCI6ImJiN2I3Y2Q2LTEyZjUtNGEyMi05YzkzLWYyYWQyNjgwODZhZiJ9.pp-uYNRvlpBzuv9EpWwdw-Bv_jUBW-8Y7wxkKAbG7LM",
  "access_expires_at": "2026-10-29T07:49:05.470459939Z",
  "refresh_token": "o02YQ-HVqNmFo2blBt_q5lqwrnqppAnmp1gyXrgivac",
  "refresh_expires_at": "2026-11-28T07:34:05.470035689Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08415907-809e-4250-b808-9adbbce9a8e5",
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
  "id": "50ce07ed-172c-48b7-8fdc-d15c9d3c6394",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:39:05.702874Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: d95981d0-7649-4156-a2b6-4f8e24bc6bf9) → **201**

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
  "session_id": "8e53eafb-eb2f-4b85-a487-1e837bfd8e9b",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNDYsImlhdCI6MTc5MzI1OTI0NiwianRpIjoiYjZhZTExNzYtMjIyOC00ZGEyLTk1N2MtM2MzNWNlOGE3NmIzIiwic2lkIjoiOGU1M2VhZmItZWIyZi00Yjg1LWE0ODctMWU4MzdiZmQ4ZTliIn0.lAste11QNCuEB_DahwcKDONV444JYH22-oyQQKPsvK4",
  "access_expires_at": "2026-10-29T07:49:06.217304666Z",
  "refresh_token": "bLBbW1_BZbRPh029sfsqa2dPSFGosqdteI_s1eqvv7k",
  "refresh_expires_at": "2026-10-29T19:34:06.216878663Z",
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
  "session_id": "e5352158-2b51-4b83-9d69-6c6a79330c5f",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNDYsImlhdCI6MTc5MzI1OTI0NiwianRpIjoiMjA1ZjhmOWMtYTdmNi00MTY5LTg3MjUtZjQwMWNkZjg3M2Q2Iiwic2lkIjoiZTUzNTIxNTgtMmI1MS00YjgzLTlkNjktNmM2YTc5MzMwYzVmIn0.uTqAOnePOl6ii6lTwfJpxYWNxG3aheMvxJtGNvoaaA0",
  "access_expires_at": "2026-10-29T07:49:06.689863725Z",
  "refresh_token": "rAQoifzY-QrN5Hbb8XX4mgz40lQ5czKd11STaE6JRNc",
  "refresh_expires_at": "2026-10-29T19:34:06.689441928Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6512f62a-e1f0-405c-89e0-58fd3232a704/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:34:05.93139Z",
      "actor": {
        "type": "CLIENT",
        "id": "5257a62a-1cdf-4517-a7f7-ca7f438309e2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6512f62a-e1f0-405c-89e0-58fd3232a704",
        "quote_id": "50ce07ed-172c-48b7-8fdc-d15c9d3c6394",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d95981d0-7649-4156-a2b6-4f8e24bc6bf9"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:34:05.932675Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6512f62a-e1f0-405c-89e0-58fd3232a704",
        "attempt_id": "88144cbd-fd44-44ac-b6ff-18adeeebf7c5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d95981d0-7649-4156-a2b6-4f8e24bc6bf9"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T07:34:05.937429Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6512f62a-e1f0-405c-89e0-58fd3232a704",
        "attempt_id": "88144cbd-fd44-44ac-b6ff-18adeeebf7c5"
      },
      "correlation_id": "d95981d0-7649-4156-a2b6-4f8e24bc6bf9"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "88144cbd-fd44-44ac-b6ff-18adeeebf7c5",
        "generation": 1,
        "started_at": "2026-10-29T07:34:05.93202Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T07:34:05.937429Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T07:34:05.933171Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/d95981d0-7649-4156-a2b6-4f8e24bc6bf9` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "6512f62a-e1f0-405c-89e0-58fd3232a704:0",
      "order_id": "6512f62a-e1f0-405c-89e0-58fd3232a704",
      "at": "2026-10-29T07:34:05.93139Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "6512f62a-e1f0-405c-89e0-58fd3232a704:1",
      "order_id": "6512f62a-e1f0-405c-89e0-58fd3232a704",
      "at": "2026-10-29T07:34:05.932675Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "6512f62a-e1f0-405c-89e0-58fd3232a704:2",
      "order_id": "6512f62a-e1f0-405c-89e0-58fd3232a704",
      "at": "2026-10-29T07:34:05.937429Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/6d887772-c61d-4f26-8262-bdd20bcc60d3` → **200**

```json
{
  "found": []
}
```

Done: request d95981d0-7649-4156-a2b6-4f8e24bc6bf9 — order 6512f62a-e1f0-405c-89e0-58fd3232a704 found by its id.

`GET /api/rider/v1/orders/6512f62a-e1f0-405c-89e0-58fd3232a704` → **200**

```json
{
  "id": "6512f62a-e1f0-405c-89e0-58fd3232a704",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5257a62a-1cdf-4517-a7f7-ca7f438309e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:34:05.930996Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/6512f62a-e1f0-405c-89e0-58fd3232a704/cancel` → **200**

```json
{
  "command_id": "731d4706-dd11-43fb-9563-9c954765c73b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6512f62a-e1f0-405c-89e0-58fd3232a704",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5257a62a-1cdf-4517-a7f7-ca7f438309e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:34:05.930996Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "phone": "+380631842989",
  "device_ref": "sandbox-7435"
}
```

```json
{
  "challenge_id": "0ba041a5-8207-40e0-9310-b6b8d23b2ab8",
  "expires_at": "2026-10-29T07:39:08.055214132Z",
  "resend_available_at": "2026-10-29T07:34:09.055214132Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631842989` → **200**

```json
{
  "phone": "+380631842989",
  "audience": "CLIENT",
  "code": "269379",
  "sent_at": "2026-10-29T07:34:08.057390595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ba041a5-8207-40e0-9310-b6b8d23b2ab8",
  "code": "269379",
  "device_ref": "sandbox-7435"
}
```

```json
{
  "session_id": "9fc59a73-1a6f-4c5b-95f8-8c8242baa054",
  "subject": {
    "type": "CLIENT",
    "id": "e2d2b9fa-c506-4476-83a5-a108a84897e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMmQyYjlmYS1jNTA2LTQ0NzYtODNhNS1hMTA4YTg0ODk3ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTQ4LCJpYXQiOjE3OTMyNTkyNDgsImp0aSI6ImEwMmEwNWI4LWNkMzctNDQwNC04MGUyLTgzNGY2YThhMjFkNCIsInNpZCI6IjlmYzU5YTczLTFhNmYtNGM1Yi05NWY4LThjODI0MmJhYTA1NCJ9.syX2PcihavVmxK30OSNmFuKaw4Gy1CSegYlLXuow66g",
  "access_expires_at": "2026-10-29T07:49:08.294223876Z",
  "refresh_token": "m9j9qHIi2mH-UHuPP9zSmSzD-ePlxhGrX8aPTY-y7kY",
  "refresh_expires_at": "2026-11-28T07:34:08.293814315Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "34f37847-ea78-4e02-bfa8-fdf6e49d6658",
  "expires_at": "2026-10-29T07:39:10.510511217Z",
  "resend_available_at": "2026-10-29T07:34:11.510511217Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631842989` → **200**

```json
{
  "phone": "+380631842989",
  "audience": "CLIENT",
  "code": "548157",
  "sent_at": "2026-10-29T07:34:10.512103683Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1cd509d2-1bfe-44a0-b14c-4ece64aefe2e",
  "challenge_id": "34f37847-ea78-4e02-bfa8-fdf6e49d6658",
  "otp_code": "548157"
}
```

```json
{
  "id": "db6f453b-d081-4830-8b4e-c44c21ac90ac",
  "state": "PENDING",
  "created_at": "2026-10-29T07:34:10.758401Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/db6f453b-d081-4830-8b4e-c44c21ac90ac` → **200**

```json
{
  "id": "db6f453b-d081-4830-8b4e-c44c21ac90ac",
  "state": "PENDING",
  "created_at": "2026-10-29T07:34:10.758401Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/db6f453b-d081-4830-8b4e-c44c21ac90ac` → **200**

```json
{
  "id": "db6f453b-d081-4830-8b4e-c44c21ac90ac",
  "state": "PENDING",
  "created_at": "2026-10-29T07:34:10.758401Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/db6f453b-d081-4830-8b4e-c44c21ac90ac` → **200**

```json
{
  "id": "db6f453b-d081-4830-8b4e-c44c21ac90ac",
  "state": "READY",
  "created_at": "2026-10-29T07:34:10.758401Z",
  "ready_at": "2026-10-29T07:34:12.253808Z",
  "expires_at": "2026-11-05T07:34:12.253808Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/db6f453b-d081-4830-8b4e-c44c21ac90ac/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633308429",
  "device_ref": "sandbox-1992"
}
```

```json
{
  "challenge_id": "3d6accb1-7145-437e-95a6-d26646dc899b",
  "expires_at": "2026-10-29T07:39:13.654466537Z",
  "resend_available_at": "2026-10-29T07:34:14.654466537Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633308429` → **200**

```json
{
  "phone": "+380633308429",
  "audience": "CLIENT",
  "code": "648802",
  "sent_at": "2026-10-29T07:34:13.656637549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d6accb1-7145-437e-95a6-d26646dc899b",
  "code": "648802",
  "device_ref": "sandbox-1992"
}
```

```json
{
  "session_id": "1c358767-1951-4e41-b476-059eb312841d",
  "subject": {
    "type": "CLIENT",
    "id": "3452e8fd-31da-41b1-8ebd-a476a9781ab9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDUyZThmZC0zMWRhLTQxYjEtOGViZC1hNDc2YTk3ODFhYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTUzLCJpYXQiOjE3OTMyNTkyNTMsImp0aSI6IjVlNDdjYzRiLTc3ZGMtNDAyMy05YWQ2LTAyOGMxNTZiZTEzOCIsInNpZCI6IjFjMzU4NzY3LTE5NTEtNGU0MS1iNDc2LTA1OWViMzEyODQxZCJ9.OtsuXn5_JP9wl5XJjO67H_X1BIZViv9cfAdB3JYLzZo",
  "access_expires_at": "2026-10-29T07:49:13.8990283Z",
  "refresh_token": "uiFUHSLyC7BeCVsRJtvyvtDMPGFo_pzi6d7m86SS-p8",
  "refresh_expires_at": "2026-11-28T07:34:13.898606338Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/db6f453b-d081-4830-8b4e-c44c21ac90ac/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/db6f453b-d081-4830-8b4e-c44c21ac90ac/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "480604a9-3c92-49c3-843d-94b843abcdee"
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
  "session_id": "427952e7-e43e-475d-b7a0-5469b6addc17",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNTQsImlhdCI6MTc5MzI1OTI1NCwianRpIjoiNTdiMDM5ZDYtMjNlMC00NWMwLWIzZDItNzg2YWMxZjUzNmQ2Iiwic2lkIjoiNDI3OTUyZTctZTQzZS00NzVkLWI3YTAtNTQ2OWI2YWRkYzE3In0.v60hbE5-lt8MURObJtvEA48qcNfzHyK2Y2VC4YtyCh8",
  "access_expires_at": "2026-10-29T07:49:14.597836974Z",
  "refresh_token": "N-3KzPtX_rpB2Jjk7mVnB1gK14jGL8OIjYJLjE32Sp8",
  "refresh_expires_at": "2026-10-29T19:34:14.597428588Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e2d2b9fa-c506-4476-83a5-a108a84897e4",
  "session_id": "9fc59a73-1a6f-4c5b-95f8-8c8242baa054",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/e2d2b9fa-c506-4476-83a5-a108a84897e4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "db6f453b-d081-4830-8b4e-c44c21ac90ac",
      "state": "READY",
      "created_at": "2026-10-29T07:34:10.758401Z",
      "ready_at": "2026-10-29T07:34:12.253808Z",
      "expires_at": "2026-11-05T07:34:12.253808Z",
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
  "device_ref": "sandbox-6254"
}
```

```json
{
  "challenge_id": "32041f35-8e75-48c5-8e6a-9eddace05b08",
  "expires_at": "2026-10-29T07:39:15.256264651Z",
  "resend_available_at": "2026-10-29T07:34:16.256264651Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "592790",
  "sent_at": "2026-10-29T07:34:15.258445357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32041f35-8e75-48c5-8e6a-9eddace05b08",
  "code": "592790",
  "device_ref": "sandbox-6254"
}
```

```json
{
  "session_id": "b01b91c5-d9f4-4578-a8e3-7b7ec537fd0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDE1NSwiaWF0IjoxNzkzMjU5MjU1LCJqdGkiOiI2NTViMzAyYy1hY2EzLTRkZTItOTE4ZS0wZDM0OTM0MzM3YjgiLCJzaWQiOiJiMDFiOTFjNS1kOWY0LTQ1NzgtYThlMy03YjdlYzUzN2ZkMGQifQ.jNgIQj5kYi8FFleaVGpOmP2GKpqV_5XkGTLV0QsrWNY",
  "access_expires_at": "2026-10-29T07:49:15.505532654Z",
  "refresh_token": "VQ96cCbWFVxj5qRdPtJ-Dt4raxfAfrWLy4uIAtYcf1A",
  "refresh_expires_at": "2026-11-28T07:34:15.505139165Z",
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
  "device_ref": "sandbox-25821"
}
```

```json
{
  "challenge_id": "9cb861c3-fead-41fd-bd89-2c751604e1da",
  "expires_at": "2026-10-29T07:39:15.929532476Z",
  "resend_available_at": "2026-10-29T07:34:16.929532476Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "505040",
  "sent_at": "2026-10-29T07:34:15.931480162Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cb861c3-fead-41fd-bd89-2c751604e1da",
  "code": "505040",
  "device_ref": "sandbox-25821"
}
```

```json
{
  "session_id": "f4b31fad-1d4d-4fc1-9060-50d59590e6da",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDE1NiwiaWF0IjoxNzkzMjU5MjU2LCJqdGkiOiI5YWM2NjlkYy1hZWJmLTQwY2QtYWY4ZS0zMWE1NDcxODJhNzYiLCJzaWQiOiJmNGIzMWZhZC0xZDRkLTRmYzEtOTA2MC01MGQ1OTU5MGU2ZGEifQ.GDd4wBdC8GafLq5zdQDFCsNkl6dCMt-8UIkohy4Ow6g",
  "access_expires_at": "2026-10-29T07:49:16.176086901Z",
  "refresh_token": "Nhq5sqbhp2m53sl2EHHbi4pUvuF1oyKAW1rcGqSHmPI",
  "refresh_expires_at": "2026-11-28T07:34:16.175680283Z",
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
  "command_id": "9ab3d9e8-2402-42ba-bdf3-73fbfcce18bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:16Z",
    "sequence": 1793259256613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4adfba6e-6076-4387-82d8-8b572106a288",
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
  "last_heartbeat_at": "2026-10-29T07:34:16.62993Z",
  "last_location_at": "2026-10-29T07:34:16.62993Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-6148"
}
```

```json
{
  "challenge_id": "eddf1949-cade-42db-b463-494efd063f0b",
  "expires_at": "2026-10-29T07:39:16.850435916Z",
  "resend_available_at": "2026-10-29T07:34:17.850435916Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "972656",
  "sent_at": "2026-10-29T07:34:16.852403591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eddf1949-cade-42db-b463-494efd063f0b",
  "code": "972656",
  "device_ref": "sandbox-6148"
}
```

```json
{
  "session_id": "9b25e8db-e071-4e40-957e-1ad1f5789405",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDE1NywiaWF0IjoxNzkzMjU5MjU3LCJqdGkiOiJlMjQ2OGEwOC00NGIwLTQ0MTktYjlmMi05NGRjZGRlMDA0MjQiLCJzaWQiOiI5YjI1ZThkYi1lMDcxLTRlNDAtOTU3ZS0xYWQxZjU3ODk0MDUifQ.pKkAfp0QizCOfdiQo0UHNzCRefa0PQRrAf6uSbsmimw",
  "access_expires_at": "2026-10-29T07:49:17.098115957Z",
  "refresh_token": "TZpkE_ssiZ3ua3BjbT--ynw6uPhoDcK5aE2Cc0uJZhM",
  "refresh_expires_at": "2026-11-28T07:34:17.097556123Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a7f6cd70-6fd6-450c-89cd-fbf6a94f2b62",
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
  "last_heartbeat_at": "2026-10-29T07:33:15.712308Z",
  "last_location_at": "2026-10-29T07:33:15.712308Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a7f6cd70-6fd6-450c-89cd-fbf6a94f2b62/handover` → **200**

```json
{
  "command_id": "c4e3bbdd-bea3-4fc8-a801-175041778453",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a7f6cd70-6fd6-450c-89cd-fbf6a94f2b62",
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
  "last_heartbeat_at": "2026-10-29T07:33:15.712308Z",
  "last_location_at": "2026-10-29T07:33:15.712308Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a7f6cd70-6fd6-450c-89cd-fbf6a94f2b62/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:17Z",
    "sequence": 1793259257760
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a7f6cd70-6fd6-450c-89cd-fbf6a94f2b62",
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
  "last_heartbeat_at": "2026-10-29T07:34:17.77639Z",
  "last_location_at": "2026-10-29T07:34:17.77639Z",
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
  "session_id": "8e8f9fea-9e7b-4f39-9482-b26ede6ae537",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNTgsImlhdCI6MTc5MzI1OTI1OCwianRpIjoiN2ExMjUxNTQtNjUyMS00OWY1LWE3YjMtNDAxZWYyODBkMzhkIiwic2lkIjoiOGU4ZjlmZWEtOWU3Yi00ZjM5LTk0ODItYjI2ZWRlNmFlNTM3In0.8U4Xq7wxZtc8p0Pa3Ks3I2-OW1ME9rUVHDTGJay_NcQ",
  "access_expires_at": "2026-10-29T07:49:18.243870824Z",
  "refresh_token": "ZIc-BEeACs1RtYalIAggQ3ogJAJRsDQC_iK3OrT1nmY",
  "refresh_expires_at": "2026-10-29T19:34:18.243458638Z",
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
  "session_id": "519f91e4-67ce-40b2-b530-f767941ad3c8",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNTgsImlhdCI6MTc5MzI1OTI1OCwianRpIjoiZTVmNmRiYzQtMTFmNy00MmExLWI5MTMtYTBiMTNkMWMyYzQxIiwic2lkIjoiNTE5ZjkxZTQtNjdjZS00MGIyLWI1MzAtZjc2Nzk0MWFkM2M4In0.LVXQNDiTURN6L5g7DjR4zXF5mkilX1ju8e7ngiCRNIY",
  "access_expires_at": "2026-10-29T07:49:18.724083672Z",
  "refresh_token": "9QeEZcDlrHebeK0OTUaD8a4U3alh282sWcxnkrTyK8k",
  "refresh_expires_at": "2026-10-29T19:34:18.723609238Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680855544",
  "device_ref": "sandbox-12924"
}
```

```json
{
  "challenge_id": "b9d1471d-7b49-4028-8e59-4317173b1486",
  "expires_at": "2026-10-29T07:39:18.940364596Z",
  "resend_available_at": "2026-10-29T07:34:19.940364596Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380680855544` → **200**

```json
{
  "phone": "+380680855544",
  "audience": "CLIENT",
  "code": "174100",
  "sent_at": "2026-10-29T07:34:18.942438387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9d1471d-7b49-4028-8e59-4317173b1486",
  "code": "174100",
  "device_ref": "sandbox-12924"
}
```

```json
{
  "session_id": "05124716-137d-4760-8a21-037b284764c5",
  "subject": {
    "type": "CLIENT",
    "id": "43b106db-6ebc-4c47-92e2-29e75641414f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0M2IxMDZkYi02ZWJjLTRjNDctOTJlMi0yOWU3NTY0MTQxNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTU5LCJpYXQiOjE3OTMyNTkyNTksImp0aSI6ImRmMmMwMWI0LTA3M2MtNDg3NC04YzI3LTRkNzhhNDU2ZDRmMCIsInNpZCI6IjA1MTI0NzE2LTEzN2QtNDc2MC04YTIxLTAzN2IyODQ3NjRjNSJ9.rEdmRA4a6fMetdEn2efDFdxH4FmtcayQuQ5cjtAQJR4",
  "access_expires_at": "2026-10-29T07:49:19.178317362Z",
  "refresh_token": "VjNX2b3kfHZupmqFwum_8sx0T4Sbxtgyx5Rp5cy1ih0",
  "refresh_expires_at": "2026-11-28T07:34:19.177931625Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "40cd6af1-0d0c-46c3-9a96-4d1947404018",
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
  "id": "3295d046-7d2f-4f05-a05a-d231822beee4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:39:19.403186Z",
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
  "command_id": "4bd6b09c-4f16-4cd9-9aa7-883c906d1691",
  "quote_id": "3295d046-7d2f-4f05-a05a-d231822beee4",
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
  "id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "43b106db-6ebc-4c47-92e2-29e75641414f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:34:19.637125Z",
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
    "id": "c43824aa-59ad-4a55-82a1-9f616d182ce8",
    "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
    "expires_at": "2026-10-29T07:34:34.640296Z",
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

`POST /api/driver/v1/offers/c43824aa-59ad-4a55-82a1-9f616d182ce8/reject` → **204**

```json
{
  "command_id": "2e82c115-3774-4758-b764-315b37b93e8f"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2ac86d6b-28f0-4bb4-866f-5e86e157689d",
    "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
    "expires_at": "2026-10-29T07:34:35.103652Z",
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

`POST /api/driver/v1/offers/2ac86d6b-28f0-4bb4-866f-5e86e157689d/accept` → **200**

```json
{
  "command_id": "6e0d11e9-038a-4a11-b194-106ae6d94c70"
}
```

```json
{
  "id": "3731dd98-a6c9-4dbd-a1f7-dd1c8e608616",
  "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f79d3fd9-925a-4c62-883b-608c4eea4dae",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/89e26a6e-98bf-43d3-8679-75bfc27ca9aa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:34:19.63766Z",
      "actor": {
        "type": "CLIENT",
        "id": "43b106db-6ebc-4c47-92e2-29e75641414f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
        "quote_id": "3295d046-7d2f-4f05-a05a-d231822beee4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9c1df0e8-de90-4c6c-9a49-891cb5c0afce"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:34:19.639574Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
        "attempt_id": "d047734a-f38e-4176-a45d-c932225b857e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9c1df0e8-de90-4c6c-9a49-891cb5c0afce"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:34:19.643204Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c43824aa-59ad-4a55-82a1-9f616d182ce8",
        "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "9c1df0e8-de90-4c6c-9a49-891cb5c0afce"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T07:34:20.102831Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c43824aa-59ad-4a55-82a1-9f616d182ce8",
        "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa"
      },
      "correlation_id": "8f9534a1-43ae-443f-ae86-fb9b8f6e71d0"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 89e26a6e-98bf-43d3-8679-75bfc27ca9aa — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/89e26a6e-98bf-43d3-8679-75bfc27ca9aa` → **200**

```json
{
  "id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "43b106db-6ebc-4c47-92e2-29e75641414f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3731dd98-a6c9-4dbd-a1f7-dd1c8e608616",
    "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f79d3fd9-925a-4c62-883b-608c4eea4dae",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:34:19.637125Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/89e26a6e-98bf-43d3-8679-75bfc27ca9aa/cancel` → **200**

```json
{
  "command_id": "a5536d35-63d9-4e67-a491-be2395623a24",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "43b106db-6ebc-4c47-92e2-29e75641414f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "3731dd98-a6c9-4dbd-a1f7-dd1c8e608616",
    "order_id": "89e26a6e-98bf-43d3-8679-75bfc27ca9aa",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f79d3fd9-925a-4c62-883b-608c4eea4dae",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:34:19.637125Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "session_id": "4adfba6e-6076-4387-82d8-8b572106a288",
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
  "last_heartbeat_at": "2026-10-29T07:34:16.62993Z",
  "last_location_at": "2026-10-29T07:34:16.62993Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4adfba6e-6076-4387-82d8-8b572106a288/close` → **200**

```json
{
  "command_id": "3e916580-ae66-4905-97d1-942a19948ae2",
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
  "session_id": "a7f6cd70-6fd6-450c-89cd-fbf6a94f2b62",
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
  "last_heartbeat_at": "2026-10-29T07:34:17.77639Z",
  "last_location_at": "2026-10-29T07:34:17.77639Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a7f6cd70-6fd6-450c-89cd-fbf6a94f2b62/close` → **200**

```json
{
  "command_id": "29981090-0545-4128-91a0-e6190e2bffdc",
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
  "session_id": "5a9ee7c4-9993-4b12-8ac7-96f4f14f257e",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNjIsImlhdCI6MTc5MzI1OTI2MiwianRpIjoiNTgxMzg3MjEtN2Y0Yy00ZjljLTgyNmUtNGY4OGI2M2RkZDdiIiwic2lkIjoiNWE5ZWU3YzQtOTk5My00YjEyLThhYzctOTZmNGYxNGYyNTdlIn0.CXGmUuFtT7J6sYxZjjl6ACwIfs6QP3BRvofSXVxMX7o",
  "access_expires_at": "2026-10-29T07:49:22.460820895Z",
  "refresh_token": "6Crr3-ZSknw6QiUl8egsGCmwc5KfjFc_zqhZXhjFpv0",
  "refresh_expires_at": "2026-10-29T19:34:22.460423744Z",
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
  "command_id": "13586508-95e0-49a4-ad52-370aa80f11bb",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T07:34:22.917972Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "3ae6a8f3-b124-4019-9eb8-d1916c99dc9f",
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
  "correlation_id": "1677c9f9-c00b-4d7c-9e8f-fa419b626cce"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "a42a2ba5-5aa0-4ac3-a0f3-f754b115ad5b",
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
  "correlation_id": "f3bdb14e-7bc6-47f3-852f-0587567bdf92"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638309226",
  "device_ref": "sandbox-2462"
}
```

```json
{
  "challenge_id": "5dccc76f-4baf-4ad4-9662-b918b3c475ed",
  "expires_at": "2026-10-29T07:39:23.593863526Z",
  "resend_available_at": "2026-10-29T07:34:24.593863526Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638309226` → **200**

```json
{
  "phone": "+380638309226",
  "audience": "CLIENT",
  "code": "626275",
  "sent_at": "2026-10-29T07:34:23.595675759Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5dccc76f-4baf-4ad4-9662-b918b3c475ed",
  "code": "626275",
  "device_ref": "sandbox-2462"
}
```

```json
{
  "session_id": "94d537dc-e684-4ed2-b50e-4ae9c58a132d",
  "subject": {
    "type": "CLIENT",
    "id": "b8fb4b90-60ff-436d-af94-c51c5c444c5b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOGZiNGI5MC02MGZmLTQzNmQtYWY5NC1jNTFjNWM0NDRjNWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTYzLCJpYXQiOjE3OTMyNTkyNjMsImp0aSI6IjhhNDQ5YmJjLTNhNTktNDllYS05YWQyLWJjNjYzZmFmZTIwNyIsInNpZCI6Ijk0ZDUzN2RjLWU2ODQtNGVkMi1iNTBlLTRhZTljNThhMTMyZCJ9.bAMLxuYU9Z24jKzfhJqq7wzAoKEmOX11KQLFQhHhe9U",
  "access_expires_at": "2026-10-29T07:49:23.837020781Z",
  "refresh_token": "zO3_fVPdtGja-yH-nz8T7B6XpRqaYKud-xyl3EQhUDs",
  "refresh_expires_at": "2026-11-28T07:34:23.836660568Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bc8e250a-1fcd-4f05-9095-dd7b333beea9",
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
  "id": "2beef812-2c79-47f4-b95c-5330333a7d68",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:39:24.066757Z",
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
  "command_id": "43072b7a-0ace-4967-9e2b-735d2b637855",
  "quote_id": "2beef812-2c79-47f4-b95c-5330333a7d68",
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
  "correlation_id": "3d21aae0-2be3-4563-b433-d0890e96ac51"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b8072b97-77dc-4ef8-8bde-8e409a8f3630",
  "quote_id": "2beef812-2c79-47f4-b95c-5330333a7d68",
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
  "id": "068343c4-9341-4ff6-bac3-0cb5e98ec385",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b8fb4b90-60ff-436d-af94-c51c5c444c5b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:34:24.533453Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/068343c4-9341-4ff6-bac3-0cb5e98ec385/cancel` → **200**

```json
{
  "command_id": "89afb6cc-0f68-47f7-8684-400c4db7a854",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "068343c4-9341-4ff6-bac3-0cb5e98ec385",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b8fb4b90-60ff-436d-af94-c51c5c444c5b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:34:24.533453Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "command_id": "75805c18-6e85-40d2-9ad1-388a232aa29f",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T07:34:25.015488Z"
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
      "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T07:34:25.015488Z"
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
  "device_ref": "sandbox-25981"
}
```

```json
{
  "challenge_id": "677d39a7-fd64-4196-b6c0-f6e6d0310e78",
  "expires_at": "2026-10-29T07:39:25.691948354Z",
  "resend_available_at": "2026-10-29T07:34:26.691948354Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "695959",
  "sent_at": "2026-10-29T07:34:25.693802727Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "677d39a7-fd64-4196-b6c0-f6e6d0310e78",
  "code": "695959",
  "device_ref": "sandbox-25981"
}
```

```json
{
  "session_id": "9a1b6346-ffa4-4002-af93-e851fd4ad16d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDE2NSwiaWF0IjoxNzkzMjU5MjY1LCJqdGkiOiI1MWMwNDhhZC1jYzk0LTQxZGEtYTQ1Yi04NThlYjk4MjgyNDAiLCJzaWQiOiI5YTFiNjM0Ni1mZmE0LTQwMDItYWY5My1lODUxZmQ0YWQxNmQifQ.xTZMRi9HCI2ZEXXLKETIPoGG1SzKYpFMlwvideM-sOk",
  "access_expires_at": "2026-10-29T07:49:25.931119334Z",
  "refresh_token": "-RPWn3MIElbRs68JSdCweR9eX_OI5ckXUkWkXkg5FZg",
  "refresh_expires_at": "2026-11-28T07:34:25.930576119Z",
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
  "command_id": "939b9e24-8000-4d83-8ae3-68a00b4a1ff1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:26Z",
    "sequence": 1793259266363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:26.379938Z",
  "last_location_at": "2026-10-29T07:34:26.379938Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677779303",
  "device_ref": "sandbox-31027"
}
```

```json
{
  "challenge_id": "5001f349-3ee2-45c3-af28-73829e73d138",
  "expires_at": "2026-10-29T07:39:26.606019061Z",
  "resend_available_at": "2026-10-29T07:34:27.606019061Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677779303` → **200**

```json
{
  "phone": "+380677779303",
  "audience": "CLIENT",
  "code": "003068",
  "sent_at": "2026-10-29T07:34:26.607859609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5001f349-3ee2-45c3-af28-73829e73d138",
  "code": "003068",
  "device_ref": "sandbox-31027"
}
```

```json
{
  "session_id": "83c4740a-9b8f-4e43-b840-a46f97e682a9",
  "subject": {
    "type": "CLIENT",
    "id": "296c3bbc-f273-4aa5-9ac2-41c949c39070"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTZjM2JiYy1mMjczLTRhYTUtOWFjMi00MWM5NDljMzkwNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTY2LCJpYXQiOjE3OTMyNTkyNjYsImp0aSI6ImM4ZDFlZDljLTEzMzAtNDUyZS1hN2IzLTkwZjA0YzdiYjE5NSIsInNpZCI6IjgzYzQ3NDBhLTliOGYtNGU0My1iODQwLWE0NmY5N2U2ODJhOSJ9.4zPTVbfugDt4vnvu_sxxqTrp_PX_vaItbI5A-Ra5Xo4",
  "access_expires_at": "2026-10-29T07:49:26.843978808Z",
  "refresh_token": "-kmTYgLM1F5zlxWJKITRbf7tT8wsJ1c_fBitui0V0Ac",
  "refresh_expires_at": "2026-11-28T07:34:26.843609128Z",
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
  "command_id": "1672742f-d294-4f46-9854-c0fc222ef6a8",
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
  "id": "f6ea4ef4-c8be-4491-81b9-24cf690b0d93",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:39:27.278049Z",
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
  "command_id": "d1bfc09d-0554-4acd-8676-362ca3381a00",
  "platform": "ANDROID",
  "token": "sandbox-driver-6e6a4298-0e48-4e36-8290-fa1cfa55df92"
}
```

```json
{
  "id": "3d0654b7-f8cb-4289-9f6b-b6fa73be9e8b",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:34:27.51294Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "dc9b34f2-c7b3-42f7-aa5f-9c12f22fcde1",
  "platform": "ANDROID",
  "token": "sandbox-rider-47599355-33a7-4980-8a11-794da406bb45"
}
```

```json
{
  "id": "3e287362-b0fb-499c-b3f7-8cc052ab2dd5",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T07:34:27.734214Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f83b6cdc-36b2-4d79-8a52-e0f5038869d3",
  "quote_id": "f6ea4ef4-c8be-4491-81b9-24cf690b0d93",
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
  "id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "296c3bbc-f273-4aa5-9ac2-41c949c39070",
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
  "created_at": "2026-10-29T07:34:27.96218Z",
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
    "id": "9a33d6fa-fd31-4d38-88c5-7340e7dbb7c0",
    "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
    "expires_at": "2026-10-29T07:34:42.964597Z",
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

`POST /api/driver/v1/offers/9a33d6fa-fd31-4d38-88c5-7340e7dbb7c0/accept` → **200**

```json
{
  "command_id": "419d3fb2-5215-474a-a16f-b7ea4866b6f3"
}
```

```json
{
  "id": "aecbf44e-4d7a-4b10-9802-f5194b562271",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "248e2f26-41eb-4c8e-8ea1-049a72c6597a",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T07:34:27.939Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:34:28.53350212Z",
    "token_suffix": "55df92",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "604719dc-b217-442b-b010-8898251d0490",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677779303&after=2026-10-29T07:34:27.939Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380677779303&after=2026-10-29T07:34:27.939Z` → **200**

```json
[
  {
    "at": "2026-10-29T07:34:29.539408514Z",
    "token_suffix": "06bb45",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "15d2bf76-15ad-4783-8505-7927133282c6",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/19f76ec0-0b28-4b15-81a4-086d34ee2c46/messages` → **201**

```json
{
  "command_id": "f4ce530e-f32e-475a-b606-f6ba2a0196e0",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "d73e2d5c-79dd-40b9-b703-246cbf97d8de",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T07:34:29.728367504Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "248e2f26-41eb-4c8e-8ea1-049a72c6597a",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "assignment_id": "aecbf44e-4d7a-4b10-9802-f5194b562271",
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

`POST /api/driver/v1/trips/248e2f26-41eb-4c8e-8ea1-049a72c6597a/messages` → **201**

```json
{
  "command_id": "5081e9eb-2d8f-46d9-abe2-a977b43411a5",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "c4bf9ab5-0fea-43ee-8d9e-af6878211c7b",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T07:34:30.155699582Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/19f76ec0-0b28-4b15-81a4-086d34ee2c46/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/248e2f26-41eb-4c8e-8ea1-049a72c6597a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677779303"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/62f78b99-ff82-493c-ad5a-fc2837cbe273/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:30Z",
    "sequence": 1793259270900
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:30.916203Z",
  "last_location_at": "2026-10-29T07:34:30.916203Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "248e2f26-41eb-4c8e-8ea1-049a72c6597a",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "assignment_id": "aecbf44e-4d7a-4b10-9802-f5194b562271",
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

`POST /api/driver/v1/trips/248e2f26-41eb-4c8e-8ea1-049a72c6597a/arrive` → **200**

```json
{
  "command_id": "a4434418-8c87-457b-af8d-e1a0567367a4",
  "expected_version": 0
}
```

```json
{
  "id": "248e2f26-41eb-4c8e-8ea1-049a72c6597a",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "assignment_id": "aecbf44e-4d7a-4b10-9802-f5194b562271",
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
  "arrived_at": "2026-10-29T07:34:31.34819Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/248e2f26-41eb-4c8e-8ea1-049a72c6597a/start` → **200**

```json
{
  "command_id": "ac7b7b09-f196-4574-9710-b2613b6f09ae",
  "expected_version": 1
}
```

```json
{
  "id": "248e2f26-41eb-4c8e-8ea1-049a72c6597a",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "assignment_id": "aecbf44e-4d7a-4b10-9802-f5194b562271",
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
  "arrived_at": "2026-10-29T07:34:31.34819Z",
  "started_at": "2026-10-29T07:34:31.570486Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/62f78b99-ff82-493c-ad5a-fc2837cbe273/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:31Z",
    "sequence": 1793259271791
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:31.80741Z",
  "last_location_at": "2026-10-29T07:34:31.80741Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/248e2f26-41eb-4c8e-8ea1-049a72c6597a/complete` → **200**

```json
{
  "command_id": "b5fc3903-8816-4a02-85eb-b7bfb439580a",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:34:32Z",
  "cash_received": true
}
```

```json
{
  "id": "248e2f26-41eb-4c8e-8ea1-049a72c6597a",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "assignment_id": "aecbf44e-4d7a-4b10-9802-f5194b562271",
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
  "arrived_at": "2026-10-29T07:34:31.34819Z",
  "started_at": "2026-10-29T07:34:31.570486Z",
  "completed_at": "2026-10-29T07:34:32.027343Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/19f76ec0-0b28-4b15-81a4-086d34ee2c46` → **200**

```json
{
  "id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "296c3bbc-f273-4aa5-9ac2-41c949c39070",
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
    "id": "aecbf44e-4d7a-4b10-9802-f5194b562271",
    "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "248e2f26-41eb-4c8e-8ea1-049a72c6597a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:34:27.96218Z",
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
    "id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:34:27.96218Z",
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
    "id": "248e2f26-41eb-4c8e-8ea1-049a72c6597a",
    "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
    "order_short_number": 12,
    "created_at": "2026-10-29T07:34:28.42688Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6e3164b1-95af-4ecd-a605-cdd949124319",
    "order_id": "badda135-326c-4948-ad04-f4db4f5d2db6",
    "order_short_number": 8,
    "created_at": "2026-10-29T07:33:43.246692Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "86674de2-8237-494d-8821-7586cd8f9a5b",
    "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
    "order_short_number": 3,
    "created_at": "2026-10-29T07:33:05.958327Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "71a001aa-2c4d-4d56-afe4-9112d72a223f",
    "order_id": "ca95cd82-a6f0-4848-8f08-4eb126371e07",
    "order_short_number": 2,
    "created_at": "2026-10-29T07:32:53.357425Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "dec2ad63-9537-4ee2-b24e-50e2868ce382",
    "order_id": "eaae3ea9-d570-4c29-9d8c-615fcfccaf98",
    "order_short_number": 1,
    "created_at": "2026-10-29T07:32:45.649559Z",
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

`GET /api/rider/v1/orders/19f76ec0-0b28-4b15-81a4-086d34ee2c46/tip` → **200**

```json
{
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
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
  "available_until": "2026-10-30T07:34:32.027343Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/19f76ec0-0b28-4b15-81a4-086d34ee2c46/tip` → **201**

```json
{
  "command_id": "bccb244d-462f-41d1-ae27-4369e19865e8",
  "amount_minor": 1100
}
```

```json
{
  "id": "c6ca34f6-4f76-4f4a-ae2d-81e5ab3dfdc5",
  "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T07:34:36.667818Z"
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
  "session_id": "835e347e-44b4-453f-bb66-278afab93412",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNzcsImlhdCI6MTc5MzI1OTI3NywianRpIjoiNWI4ODU3OTctYTEzYS00NmYzLTlkMWMtMjZhMzFkNDA4ZTI2Iiwic2lkIjoiODM1ZTM0N2UtNDRiNC00NTNmLWJiNjYtMjc4YWZhYjkzNDEyIn0.HlQc-b1iZJdSO-3YBL2zp37QTWlc3ZFa1ZBdISpDdnQ",
  "access_expires_at": "2026-10-29T07:49:37.150270403Z",
  "refresh_token": "qEQzNVV9j19ekJFxuUqNMTof72OkUo5wBffdXr2fkfE",
  "refresh_expires_at": "2026-10-29T19:34:37.149855445Z",
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
      "PHONE": 1,
      "APP": 11
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
  "generated_at": "2026-10-29T07:34:37.382304004Z"
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
  "generated_at": "2026-10-29T07:34:37.606837204Z"
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
  "session_id": "13d93275-b968-44b1-a728-01d42426c87d",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNzgsImlhdCI6MTc5MzI1OTI3OCwianRpIjoiNjE2YjU3NmMtMDVhOC00NzJhLWE0ODQtYTkzNGU1NDE1MjY0Iiwic2lkIjoiMTNkOTMyNzUtYjk2OC00NGIxLWE3MjgtMDFkNDI0MjZjODdkIn0.gxr30AVACHhjoqwFyNvDWUa1X-r1sSFFUpZmkBv3aLg",
  "access_expires_at": "2026-10-29T07:49:38.090489827Z",
  "refresh_token": "JLCkk0I_jgZKgg49RmSkbiiZGoXSXBgf60zQgAP_GtM",
  "refresh_expires_at": "2026-10-29T19:34:38.08999377Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/19f76ec0-0b28-4b15-81a4-086d34ee2c46/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:34:27.96256Z",
      "actor": {
        "type": "CLIENT",
        "id": "296c3bbc-f273-4aa5-9ac2-41c949c39070",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
        "quote_id": "f6ea4ef4-c8be-4491-81b9-24cf690b0d93",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "93ffd320-6472-4dfd-8c7c-05d19a10576c"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:34:27.964031Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
        "attempt_id": "4f5cb99c-d24c-40a7-8174-84af0d5a9e36",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "93ffd320-6472-4dfd-8c7c-05d19a10576c"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:34:27.966229Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9a33d6fa-fd31-4d38-88c5-7340e7dbb7c0",
        "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "93ffd320-6472-4dfd-8c7c-05d19a10576c"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:34:28.428064Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9a33d6fa-fd31-4d38-88c5-7340e7dbb7c0",
        "order_id": "19f76ec0-0b28-4b15-81a4-086d34ee2c46",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "aecbf44e-4d7a-4b10-9802-f5194b562271"
      },
      "correlation_id": "ea4dfd2f-18c2-4ae7-870a-0c9b0a46abb2"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T07:34:38.548451637Z",
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
      "last_location_at": "2026-10-29T07:34:31.80741Z",
      "order_id": null
    }
  ]
}
```

Done: order 19f76ec0-0b28-4b15-81a4-086d34ee2c46.

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
  "session_id": "5d537c21-c9fc-4ba4-9067-1e0b931178b0",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNzksImlhdCI6MTc5MzI1OTI3OSwianRpIjoiNWIwMDExNmYtNDQ2MC00MjAzLTkxMjAtNGY2YzNiNGQ2MjU3Iiwic2lkIjoiNWQ1MzdjMjEtYzlmYy00YmE0LTkwNjctMWUwYjkzMTE3OGIwIn0.qn5hqiQOQUNkpJywYsvi69f_GFC2FLgNzibj9iqlKlg",
  "access_expires_at": "2026-10-29T07:49:39.044501166Z",
  "refresh_token": "CW8o0iNHkzGqAuAOp-VU5zTMdNK_Kp_cTAi7Yi9ijzY",
  "refresh_expires_at": "2026-10-29T19:34:39.043851064Z",
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
  "command_id": "7225a7fe-314c-4544-ae3c-21c2af9f361c",
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
  "timestamp": "2026-10-29T07:34:39.000+0000",
  "channel": {
    "id": "1730052000.851322033",
    "linkedid": "1730052000.851322033",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672956390"
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
  "timestamp": "2026-10-29T07:34:39.000+0000",
  "channel": {
    "id": "1730052000.851322033",
    "linkedid": "1730052000.851322033",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672956390"
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
  "session_id": "df3527a9-965f-4a76-9f78-08d5123e23c4",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxNzksImlhdCI6MTc5MzI1OTI3OSwianRpIjoiMDNmYWYzODYtZmQ5Mi00M2Q3LWE2NzktNjhhMDFjZDU3YjE3Iiwic2lkIjoiZGYzNTI3YTktOTY1Zi00YTc2LTlmNzgtMDhkNTEyM2UyM2M0In0.-8T2vjwATAkGYGqbIBqnjmUJU9gXVGj7UtrFkP6GM3Y",
  "access_expires_at": "2026-10-29T07:49:39.995282235Z",
  "refresh_token": "rm7UiCAniVHzbPQ3zdpLfaISKTzjOkeW2udZzQPDliQ",
  "refresh_expires_at": "2026-10-29T19:34:39.994786692Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "5eb93d27-9569-4572-8934-3c25f55d03ff",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672956390",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T07:34:39Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/5eb93d27-9569-4572-8934-3c25f55d03ff/answer` → **200**

```json
{
  "command_id": "6cabc1b9-07f2-41dd-8ee4-3c341aeba44a"
}
```

```json
{
  "id": "5eb93d27-9569-4572-8934-3c25f55d03ff",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672956390",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "order_ids": [],
  "started_at": "2026-10-29T07:34:39Z",
  "answered_at": "2026-10-29T07:34:40.440823Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.851322033",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "de3672a3-0df9-45b0-a0d8-ca608b89c62a",
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
  "id": "f6cbcd22-9ab7-486b-bce6-572d0864ef69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:39:40.688296Z",
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
  "command_id": "99d6e05a-e183-41bf-b9aa-dd7662edd880",
  "quote_id": "f6cbcd22-9ab7-486b-bce6-572d0864ef69",
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
    "phone": "+380672956390"
  },
  "call_id": "5eb93d27-9569-4572-8934-3c25f55d03ff"
}
```

```json
{
  "id": "7819e136-744c-4b8d-affb-43a27ec811db",
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
  "created_at": "2026-10-29T07:34:40.922318Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672956390"
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
    "id": "1730052000.851322033",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5eb93d27-9569-4572-8934-3c25f55d03ff",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672956390",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_ids": [
        "7819e136-744c-4b8d-affb-43a27ec811db"
      ],
      "started_at": "2026-10-29T07:34:39Z",
      "answered_at": "2026-10-29T07:34:40.440823Z",
      "ended_at": "2026-10-29T07:34:41.166199Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "40c30f7e-25cf-492b-b68f-17c44dff1f6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674781763",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_ids": [],
      "started_at": "2026-10-29T07:33:00.348739Z",
      "answered_at": "2026-10-29T07:33:00.599676Z",
      "ended_at": "2026-10-29T07:33:00.844772Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:33:02.239957Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/7819e136-744c-4b8d-affb-43a27ec811db` → **200**

```json
{
  "id": "7819e136-744c-4b8d-affb-43a27ec811db",
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
  "created_at": "2026-10-29T07:34:40.922318Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672956390"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/7819e136-744c-4b8d-affb-43a27ec811db` → **200**

```json
{
  "id": "7819e136-744c-4b8d-affb-43a27ec811db",
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
  "created_at": "2026-10-29T07:34:40.922318Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672956390"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7819e136-744c-4b8d-affb-43a27ec811db/cancel` → **200**

```json
{
  "command_id": "33091d49-0e49-47bc-857b-557b1bb4996d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7819e136-744c-4b8d-affb-43a27ec811db",
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
  "created_at": "2026-10-29T07:34:40.922318Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672956390"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 5eb93d27-9569-4572-8934-3c25f55d03ff with order 7819e136-744c-4b8d-affb-43a27ec811db.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11361"
}
```

```json
{
  "challenge_id": "dd8e99f3-6936-4f7c-af66-7365c5b2ee0f",
  "expires_at": "2026-10-29T07:39:42.117297166Z",
  "resend_available_at": "2026-10-29T07:34:43.117297166Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "231857",
  "sent_at": "2026-10-29T07:34:42.119736478Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd8e99f3-6936-4f7c-af66-7365c5b2ee0f",
  "code": "231857",
  "device_ref": "sandbox-11361"
}
```

```json
{
  "session_id": "a6560b08-89c0-4208-bff2-2aa85ce20285",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDE4MiwiaWF0IjoxNzkzMjU5MjgyLCJqdGkiOiJmYzZjNzllYS0xNWJlLTQxNzgtYmJjOS0xMDVlM2JiMTc3NTEiLCJzaWQiOiJhNjU2MGIwOC04OWMwLTQyMDgtYmZmMi0yYWE4NWNlMjAyODUifQ.YxZAMFyTFR38LUTkFJYTM1xFnLzvQjn_9P4Ij_4E6uM",
  "access_expires_at": "2026-10-29T07:49:42.35970932Z",
  "refresh_token": "Lx_Bmu0XzYz9CtSRWDwOS4BBQxw8gLoR81tNKXCK3fc",
  "refresh_expires_at": "2026-11-28T07:34:42.35917291Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:31.80741Z",
  "last_location_at": "2026-10-29T07:34:31.80741Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62f78b99-ff82-493c-ad5a-fc2837cbe273/handover` → **200**

```json
{
  "command_id": "29e703fd-9f53-42ec-a553-b57139496591",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:31.80741Z",
  "last_location_at": "2026-10-29T07:34:31.80741Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62f78b99-ff82-493c-ad5a-fc2837cbe273/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:43Z",
    "sequence": 1793259283205
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:43.036594Z",
  "last_location_at": "2026-10-29T07:34:43.036594Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667137473",
  "device_ref": "sandbox-18214"
}
```

```json
{
  "challenge_id": "1d78a0e7-6a34-41f8-9fcb-f547b8d79288",
  "expires_at": "2026-10-29T07:39:43.251013271Z",
  "resend_available_at": "2026-10-29T07:34:44.251013271Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667137473` → **200**

```json
{
  "phone": "+380667137473",
  "audience": "CLIENT",
  "code": "250021",
  "sent_at": "2026-10-29T07:34:43.252737967Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d78a0e7-6a34-41f8-9fcb-f547b8d79288",
  "code": "250021",
  "device_ref": "sandbox-18214"
}
```

```json
{
  "session_id": "0b18a29e-2615-40aa-9236-e2c03b4aa5f1",
  "subject": {
    "type": "CLIENT",
    "id": "1b52ea69-57dd-45ff-af47-1b8a5740c7fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjUyZWE2OS01N2RkLTQ1ZmYtYWY0Ny0xYjhhNTc0MGM3ZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTgzLCJpYXQiOjE3OTMyNTkyODMsImp0aSI6IjA1MmI1NjMwLWNkMGUtNDcxMS1iMjM4LTExYjk3MWU1ZDBmZSIsInNpZCI6IjBiMThhMjllLTI2MTUtNDBhYS05MjM2LWUyYzAzYjRhYTVmMSJ9.QphlH0i36U5jDTLb3UN2Yo4iXJpFwCCHjqdWnKRIEGw",
  "access_expires_at": "2026-10-29T07:49:43.493490215Z",
  "refresh_token": "_7oyyBWFsubq68f0Xn2oN0aMO5ePSNJx6TAaZfpnYs0",
  "refresh_expires_at": "2026-11-28T07:34:43.493017082Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d85a0c20-2869-4bae-8441-8f9846d86d05",
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
  "id": "15897f04-7654-482a-a17e-9c0bda3cc5d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:39:43.709995Z",
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
  "command_id": "6ef3178c-69c8-4643-8a2a-7c65fe2c1bcc",
  "quote_id": "15897f04-7654-482a-a17e-9c0bda3cc5d8",
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
  "id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b52ea69-57dd-45ff-af47-1b8a5740c7fc",
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
  "created_at": "2026-10-29T07:34:43.958152Z",
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
    "id": "ca5d3938-0cc6-4ab8-b7a3-de05306a0d13",
    "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
    "expires_at": "2026-10-29T07:34:58.9606Z",
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

`POST /api/driver/v1/offers/ca5d3938-0cc6-4ab8-b7a3-de05306a0d13/accept` → **200**

```json
{
  "command_id": "96db3ac8-9555-4246-b72b-e703d92aa3d4"
}
```

```json
{
  "id": "55603b6b-2519-4184-9601-d571f5cc7905",
  "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4aa74a10-b86c-4923-af13-182cca16e5f6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4aa74a10-b86c-4923-af13-182cca16e5f6",
  "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
  "assignment_id": "55603b6b-2519-4184-9601-d571f5cc7905",
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

`POST /api/driver/v1/work-sessions/62f78b99-ff82-493c-ad5a-fc2837cbe273/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:44Z",
    "sequence": 1793259284836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:44.85219Z",
  "last_location_at": "2026-10-29T07:34:44.85219Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4aa74a10-b86c-4923-af13-182cca16e5f6/arrive` → **200**

```json
{
  "command_id": "8a3af2bb-e413-4efd-938b-f10495f4514c",
  "expected_version": 0
}
```

```json
{
  "id": "4aa74a10-b86c-4923-af13-182cca16e5f6",
  "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
  "assignment_id": "55603b6b-2519-4184-9601-d571f5cc7905",
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
  "arrived_at": "2026-10-29T07:34:45.082596Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4aa74a10-b86c-4923-af13-182cca16e5f6/start` → **200**

```json
{
  "command_id": "cdab4034-856f-4e99-8583-17d9a43d7409",
  "expected_version": 1
}
```

```json
{
  "id": "4aa74a10-b86c-4923-af13-182cca16e5f6",
  "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
  "assignment_id": "55603b6b-2519-4184-9601-d571f5cc7905",
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
  "arrived_at": "2026-10-29T07:34:45.082596Z",
  "started_at": "2026-10-29T07:34:45.309603Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/62f78b99-ff82-493c-ad5a-fc2837cbe273/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:45Z",
    "sequence": 1793259285533
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:45.549839Z",
  "last_location_at": "2026-10-29T07:34:45.549839Z",
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
  "device_ref": "sandbox-13585"
}
```

```json
{
  "challenge_id": "c7073f89-35f9-4c2e-9abd-4fdd409c7f26",
  "expires_at": "2026-10-29T07:39:45.766156235Z",
  "resend_available_at": "2026-10-29T07:34:46.766156235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "527011",
  "sent_at": "2026-10-29T07:34:45.768013555Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7073f89-35f9-4c2e-9abd-4fdd409c7f26",
  "code": "527011",
  "device_ref": "sandbox-13585"
}
```

```json
{
  "session_id": "0352206b-8c42-4f95-b005-9b0631e9fc2a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDE4NiwiaWF0IjoxNzkzMjU5Mjg2LCJqdGkiOiI0OWRlZmU3Ny1hNWQ3LTRhMDgtOGNiMi01OGNlOTQwMjg4ZTkiLCJzaWQiOiIwMzUyMjA2Yi04YzQyLTRmOTUtYjAwNS05YjA2MzFlOWZjMmEifQ.Dr9DZuUT_U5hSwyRK1_8gnwqqXXea31Wy2CCMp_PacQ",
  "access_expires_at": "2026-10-29T07:49:46.010640019Z",
  "refresh_token": "lIo0ewD3_ZQyT80OQgZHkxOLygQukRmBTSfWUvdxHJk",
  "refresh_expires_at": "2026-11-28T07:34:46.010187697Z",
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
  "command_id": "c0f82a77-8eaf-44bf-93d6-6032d63b0c3f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:46Z",
    "sequence": 1793259286433
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4484f2eb-d550-4140-a95e-71edc40399f2",
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
  "last_heartbeat_at": "2026-10-29T07:34:46.44898Z",
  "last_location_at": "2026-10-29T07:34:46.44898Z",
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
  "session_id": "b0d1d94f-13ce-43d2-8734-7ed97d1b6fa2",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxODYsImlhdCI6MTc5MzI1OTI4NiwianRpIjoiYTYyMjNlMGEtNTYxZC00ODM0LTg5YTEtMzQ0MjM3YWUwM2NkIiwic2lkIjoiYjBkMWQ5NGYtMTNjZS00M2QyLTg3MzQtN2VkOTdkMWI2ZmEyIn0.7eAN2wbUljKrLLseWthZCy7bYX36ys6HhWzMteJpWiM",
  "access_expires_at": "2026-10-29T07:49:46.928955725Z",
  "refresh_token": "Co6KBysgXAZ5OYRKhrsRaeuIcegPZu6GPYfNDEoDoqk",
  "refresh_expires_at": "2026-10-29T19:34:46.928523592Z",
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
  "session_id": "81730a70-cd20-48ff-9c0c-9dfc8ed948d8",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxODcsImlhdCI6MTc5MzI1OTI4NywianRpIjoiMmYyZTVjNGItMDIxZC00NWZiLTlhMGQtMGUyY2NjNGMwNWNhIiwic2lkIjoiODE3MzBhNzAtY2QyMC00OGZmLTljMGMtOWRmYzhlZDk0OGQ4In0.zZObKnsKjqpl0FpgUrbFVbVeAzBNpXULLmWDZn21GyE",
  "access_expires_at": "2026-10-29T07:49:47.399371734Z",
  "refresh_token": "Uhbc1Gp1gdc1DdWixYovblo-3UiIgiZX98wJTuXh7qo",
  "refresh_expires_at": "2026-10-29T19:34:47.398976185Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/00d55545-bd20-4ea5-825b-959cac1e65bb` → **200**

```json
{
  "id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1b52ea69-57dd-45ff-af47-1b8a5740c7fc",
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
    "id": "55603b6b-2519-4184-9601-d571f5cc7905",
    "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4aa74a10-b86c-4923-af13-182cca16e5f6",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T07:34:43.958152Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/00d55545-bd20-4ea5-825b-959cac1e65bb/interrupt` → **200**

```json
{
  "command_id": "cf6acd29-090b-4636-b8f1-dd67dd893c56",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1b52ea69-57dd-45ff-af47-1b8a5740c7fc",
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
      "id": "55603b6b-2519-4184-9601-d571f5cc7905",
      "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "4aa74a10-b86c-4923-af13-182cca16e5f6",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T07:34:43.958152Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1b52ea69-57dd-45ff-af47-1b8a5740c7fc",
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
    "id": "d62baa71-9811-456a-a9a9-03a688a30324",
    "order_id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
    "expires_at": "2026-10-29T07:35:02.882975Z",
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

`POST /api/driver/v1/offers/d62baa71-9811-456a-a9a9-03a688a30324/accept` → **200**

```json
{
  "command_id": "dcdba022-de06-4fcf-a676-7f8549f074b0"
}
```

```json
{
  "id": "af5d916b-c0bd-464b-aa3e-8154ae8bafb6",
  "order_id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dade8d3d-3689-42a6-a021-5bb321eba758",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dade8d3d-3689-42a6-a021-5bb321eba758",
  "order_id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
  "assignment_id": "af5d916b-c0bd-464b-aa3e-8154ae8bafb6",
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
  "session_id": "4484f2eb-d550-4140-a95e-71edc40399f2",
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
  "last_heartbeat_at": "2026-10-29T07:34:46.44898Z",
  "last_location_at": "2026-10-29T07:34:46.44898Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/4484f2eb-d550-4140-a95e-71edc40399f2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:49Z",
    "sequence": 1793259289217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4484f2eb-d550-4140-a95e-71edc40399f2",
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
  "last_heartbeat_at": "2026-10-29T07:34:49.03746Z",
  "last_location_at": "2026-10-29T07:34:49.03746Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dade8d3d-3689-42a6-a021-5bb321eba758/arrive` → **200**

```json
{
  "command_id": "7fe032f9-04da-479d-944f-82ccc4ca67ee",
  "expected_version": 0
}
```

```json
{
  "id": "dade8d3d-3689-42a6-a021-5bb321eba758",
  "order_id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
  "assignment_id": "af5d916b-c0bd-464b-aa3e-8154ae8bafb6",
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
  "arrived_at": "2026-10-29T07:34:49.259969Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dade8d3d-3689-42a6-a021-5bb321eba758/start` → **200**

```json
{
  "command_id": "55b3bfee-5038-48cd-85f3-11305a6b253c",
  "expected_version": 1
}
```

```json
{
  "id": "dade8d3d-3689-42a6-a021-5bb321eba758",
  "order_id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
  "assignment_id": "af5d916b-c0bd-464b-aa3e-8154ae8bafb6",
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
  "arrived_at": "2026-10-29T07:34:49.259969Z",
  "started_at": "2026-10-29T07:34:49.490787Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dade8d3d-3689-42a6-a021-5bb321eba758/complete` → **200**

```json
{
  "command_id": "3bee2744-6d75-4ff3-be20-112e7b68a3da",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:34:49Z"
}
```

```json
{
  "id": "dade8d3d-3689-42a6-a021-5bb321eba758",
  "order_id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
  "assignment_id": "af5d916b-c0bd-464b-aa3e-8154ae8bafb6",
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
  "arrived_at": "2026-10-29T07:34:49.259969Z",
  "started_at": "2026-10-29T07:34:49.490787Z",
  "completed_at": "2026-10-29T07:34:49.729735Z",
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
    "id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-29T07:34:47.875157Z",
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
    "id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-29T07:34:43.958152Z",
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
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
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

`GET /api/operator/v1/orders/00d55545-bd20-4ea5-825b-959cac1e65bb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T07:34:43.958554Z",
      "actor": {
        "type": "CLIENT",
        "id": "1b52ea69-57dd-45ff-af47-1b8a5740c7fc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
        "quote_id": "15897f04-7654-482a-a17e-9c0bda3cc5d8",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "58d8662c-fbab-42de-9a26-f129ec58c102"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T07:34:43.960029Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
        "attempt_id": "05c8df4f-07bb-4862-8264-c53c1ed834ba",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "58d8662c-fbab-42de-9a26-f129ec58c102"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T07:34:43.962185Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ca5d3938-0cc6-4ab8-b7a3-de05306a0d13",
        "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "58d8662c-fbab-42de-9a26-f129ec58c102"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T07:34:44.411929Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ca5d3938-0cc6-4ab8-b7a3-de05306a0d13",
        "order_id": "00d55545-bd20-4ea5-825b-959cac1e65bb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "55603b6b-2519-4184-9601-d571f5cc7905"
      },
      "correlation_id": "94e2f296-c49a-4a54-a233-a55cbddf11da"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a/tip` → **200**

```json
{
  "order_id": "ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a",
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
  "available_until": "2026-10-30T07:34:49.729735Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a/tip` → **409**

```json
{
  "command_id": "c866f84f-8dd5-4836-8a0a-770db93735cc",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4311f7b7-0a0f-4cb1-a24e-ed6e0de7f08f"
}
```

Done: interrupted 00d55545-bd20-4ea5-825b-959cac1e65bb, follow-up ca839a51-d0ce-457a-ad5e-a1b53c5c1a4a.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "62f78b99-ff82-493c-ad5a-fc2837cbe273",
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
  "last_heartbeat_at": "2026-10-29T07:34:45.549839Z",
  "last_location_at": "2026-10-29T07:34:45.549839Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/62f78b99-ff82-493c-ad5a-fc2837cbe273/close` → **200**

```json
{
  "command_id": "4ab515e2-7021-4519-b739-962d3109c869",
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
  "session_id": "4484f2eb-d550-4140-a95e-71edc40399f2",
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
  "last_heartbeat_at": "2026-10-29T07:34:49.03746Z",
  "last_location_at": "2026-10-29T07:34:49.03746Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4484f2eb-d550-4140-a95e-71edc40399f2/close` → **200**

```json
{
  "command_id": "7a712af6-b30e-428a-8154-824b952ecb52",
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
  "session_id": "f4c156d3-3aaa-4dd7-a75b-62515b52b619",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAxOTUsImlhdCI6MTc5MzI1OTI5NSwianRpIjoiNTczYjBiMDYtOTQ1NS00ODBiLWFhZjQtZGZmZWJhYmQyYTZiIiwic2lkIjoiZjRjMTU2ZDMtM2FhYS00ZGQ3LWE3NWItNjI1MTViNTJiNjE5In0.j5k7Gu7xXj7MTzy6vQDmJHHW5oChdIuPX9U8wO-Ak_Y",
  "access_expires_at": "2026-10-29T07:49:55.197867158Z",
  "refresh_token": "X9ACwwptt00eTZzhoT6Jqxk-jbtdtRT8bSBFuPJpivA",
  "refresh_expires_at": "2026-10-29T19:34:55.197477757Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "f2a51bf9-9c0c-41a2-9fa3-9a8eac9bcaa4",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:34:55Z"
}
```

```json
{
  "id": "c3f06c14-bc95-4abd-b6b6-fda271af277f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:34:55Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/c3f06c14-bc95-4abd-b6b6-fda271af277f/publish` → **200**

```json
{
  "command_id": "7a2b197f-73e9-4b69-a19b-eacf40f4daaa",
  "expected_version": 0
}
```

```json
{
  "id": "c3f06c14-bc95-4abd-b6b6-fda271af277f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:34:55.664294Z",
  "published_at": "2026-10-29T07:34:55.664294Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "c3f06c14-bc95-4abd-b6b6-fda271af277f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T07:34:55.664294Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639251433",
  "device_ref": "sandbox-30088"
}
```

```json
{
  "challenge_id": "a97d934f-91a3-4b06-aaad-283b13ceb5b7",
  "expires_at": "2026-10-29T07:39:56.097839992Z",
  "resend_available_at": "2026-10-29T07:34:57.097839992Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639251433` → **200**

```json
{
  "phone": "+380639251433",
  "audience": "CLIENT",
  "code": "470208",
  "sent_at": "2026-10-29T07:34:56.099891913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a97d934f-91a3-4b06-aaad-283b13ceb5b7",
  "code": "470208",
  "device_ref": "sandbox-30088"
}
```

```json
{
  "session_id": "409c7612-91dc-45bf-946b-dcba8198fee8",
  "subject": {
    "type": "CLIENT",
    "id": "4ffd1b53-c94a-4207-bcad-8bd14bac517b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZmZkMWI1My1jOTRhLTQyMDctYmNhZC04YmQxNGJhYzUxN2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMTk2LCJpYXQiOjE3OTMyNTkyOTYsImp0aSI6ImYwOGJhOGY1LTA5MjYtNDFhZS04Yzc3LTY5ZmFiNGFjOWYxMSIsInNpZCI6IjQwOWM3NjEyLTkxZGMtNDViZi05NDZiLWRjYmE4MTk4ZmVlOCJ9.jPGevW9Xk7zXzVlOsKgJwF3iTZnZ5StCJFOU7PvWbE0",
  "access_expires_at": "2026-10-29T07:49:56.342182906Z",
  "refresh_token": "pelx6HA2H6yB05p2NKIEUs3lBhxp1ix2YtYptYseRss",
  "refresh_expires_at": "2026-11-28T07:34:56.34176448Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "c3f06c14-bc95-4abd-b6b6-fda271af277f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T07:34:55.664294Z",
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
  "command_id": "4d38b743-b244-44da-8705-5713124bba3f",
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
  "id": "67949a62-7ea3-4045-9f27-5bb6e7eb1db4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:39:56.788373Z",
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
  "command_id": "3c8a4433-5930-44fa-bec3-f97a64d9e130",
  "quote_id": "67949a62-7ea3-4045-9f27-5bb6e7eb1db4",
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
  "correlation_id": "00c582e3-fe69-43dc-b233-0b0f4affd8b7"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "613ce5cf-7cb8-4569-990b-f1d747f63fa3",
  "version_id": "c3f06c14-bc95-4abd-b6b6-fda271af277f",
  "language": "uk"
}
```

```json
{
  "version_id": "c3f06c14-bc95-4abd-b6b6-fda271af277f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T07:34:57.24365Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "259bf7ec-5e4f-4642-a61d-6e081a4499a1",
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
  "id": "fa25e410-fdce-4a63-ad81-e9ee4c08c82a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:39:57.465166Z",
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
  "command_id": "4be26090-5c7f-489e-9381-5342b50953bb",
  "quote_id": "fa25e410-fdce-4a63-ad81-e9ee4c08c82a",
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
  "id": "a1c40d25-a81a-4f4f-a75a-1e0926f98415",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ffd1b53-c94a-4207-bcad-8bd14bac517b",
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
  "created_at": "2026-10-29T07:34:57.699271Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1c40d25-a81a-4f4f-a75a-1e0926f98415` → **200**

```json
{
  "id": "a1c40d25-a81a-4f4f-a75a-1e0926f98415",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ffd1b53-c94a-4207-bcad-8bd14bac517b",
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
  "created_at": "2026-10-29T07:34:57.699271Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a1c40d25-a81a-4f4f-a75a-1e0926f98415/cancel` → **200**

```json
{
  "command_id": "14b51a13-10e1-4077-b968-f2d2065bec58",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a1c40d25-a81a-4f4f-a75a-1e0926f98415",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4ffd1b53-c94a-4207-bcad-8bd14bac517b",
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
  "created_at": "2026-10-29T07:34:57.699271Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`POST /api/admin/v1/legal-documents/c3f06c14-bc95-4abd-b6b6-fda271af277f` → **409**

```json
{
  "command_id": "a6dd645b-57d2-4cfd-84c9-dcb9990c6ef1",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T07:34:58Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/c3f06c14-bc95-4abd-b6b6-fda271af277f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cf788fc0-2aba-4f7a-a9cc-78f895007688"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ab5ad27e-988d-4fce-a28c-a447b29ba82c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:34:58Z"
}
```

```json
{
  "id": "d01bd2dd-6a32-49b2-965f-f44dac9d5f79",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:34:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d01bd2dd-6a32-49b2-965f-f44dac9d5f79/publish` → **200**

```json
{
  "command_id": "26d9685c-9009-4edd-a6bc-8e17e70d0bf4",
  "expected_version": 0
}
```

```json
{
  "id": "d01bd2dd-6a32-49b2-965f-f44dac9d5f79",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T07:34:58.848394Z",
  "published_at": "2026-10-29T07:34:58.848394Z",
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
  "device_ref": "sandbox-14215"
}
```

```json
{
  "challenge_id": "150cb3b7-d6e8-4f83-a7b0-46fdb2ec15fb",
  "expires_at": "2026-10-29T07:39:59.069142471Z",
  "resend_available_at": "2026-10-29T07:35:00.069142471Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "062864",
  "sent_at": "2026-10-29T07:34:59.070978646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "150cb3b7-d6e8-4f83-a7b0-46fdb2ec15fb",
  "code": "062864",
  "device_ref": "sandbox-14215"
}
```

```json
{
  "session_id": "99343e1a-88f3-4628-8bc3-100c2773e9fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDE5OSwiaWF0IjoxNzkzMjU5Mjk5LCJqdGkiOiJjYmQ2ZDdmYi1kNjhhLTQxZTctODE2MC1jMTJhY2EyZjI4ODQiLCJzaWQiOiI5OTM0M2UxYS04OGYzLTQ2MjgtOGJjMy0xMDBjMjc3M2U5ZmQifQ.PojzFSdnqn2nVBs2vL9slBYBOO47t4v0M2HusjZl3Ok",
  "access_expires_at": "2026-10-29T07:49:59.305021863Z",
  "refresh_token": "sbKJh_TPJcw5t44NJaWSGpfizNn0LUVs7IrNX0dXa3o",
  "refresh_expires_at": "2026-11-28T07:34:59.30461693Z",
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
  "command_id": "f183b805-57c4-4a87-87c3-2b2304dccf37",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:34:59Z",
    "sequence": 1793259299737
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2da569a8-f77e-4972-b032-aec4432cac5f",
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
  "last_heartbeat_at": "2026-10-29T07:34:59.752791Z",
  "last_location_at": "2026-10-29T07:34:59.752791Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677958860",
  "device_ref": "sandbox-2893"
}
```

```json
{
  "challenge_id": "edf6e256-d5ca-4fdb-848e-c0706728e782",
  "expires_at": "2026-10-29T07:39:59.976107835Z",
  "resend_available_at": "2026-10-29T07:35:00.976107835Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677958860` → **200**

```json
{
  "phone": "+380677958860",
  "audience": "CLIENT",
  "code": "802870",
  "sent_at": "2026-10-29T07:34:59.977976924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edf6e256-d5ca-4fdb-848e-c0706728e782",
  "code": "802870",
  "device_ref": "sandbox-2893"
}
```

```json
{
  "session_id": "72e9f2c7-3bc5-48e4-b17f-5a4bf7d1afd8",
  "subject": {
    "type": "CLIENT",
    "id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MjU1OGU5ZS1jM2E3LTQyYzItOWE5Yy1jN2UwODNmMTkyYTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjAwLCJpYXQiOjE3OTMyNTkzMDAsImp0aSI6ImUyOGUzNTg5LTYxOWYtNDE5OC1iZGE1LTAzODcyNTI4MDJhNSIsInNpZCI6IjcyZTlmMmM3LTNiYzUtNDhlNC1iMTdmLTVhNGJmN2QxYWZkOCJ9.9fbOd2Sv6JFH5ZeTqx_elClP-8rFii1W_rVDWSwak7s",
  "access_expires_at": "2026-10-29T07:50:00.210812406Z",
  "refresh_token": "uA0mPzIW9cuNos_Tx6WlgSnDT8mi0IrHlkSgwcbY6fQ",
  "refresh_expires_at": "2026-11-28T07:35:00.210336559Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a64e8caf-fe29-4c0c-be6a-9693c3db2d41",
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
  "id": "40bbedf0-e124-4fdc-9c6a-8c9ff36e00aa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:00.430986Z",
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
  "command_id": "ba339487-caf5-4555-9a3b-e2f21852df57",
  "quote_id": "40bbedf0-e124-4fdc-9c6a-8c9ff36e00aa",
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
    "phone": "+380670372002"
  }
}
```

```json
{
  "id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:35:00.661487Z",
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
    "id": "b5bcd32f-1f0a-4f37-a2bf-ad14dd4de399",
    "order_id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
    "expires_at": "2026-10-29T07:35:15.664023Z",
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

`POST /api/driver/v1/offers/b5bcd32f-1f0a-4f37-a2bf-ad14dd4de399/accept` → **200**

```json
{
  "command_id": "a1f792bd-9e2f-4941-a9db-8c7261ef747f"
}
```

```json
{
  "id": "e046c341-7a64-4d4d-bdd3-0430e1ed5441",
  "order_id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0a9ca35b-3e4e-4e86-a71c-049492247373",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0a9ca35b-3e4e-4e86-a71c-049492247373",
  "order_id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
  "assignment_id": "e046c341-7a64-4d4d-bdd3-0430e1ed5441",
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
    "phone": "+380670372002"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f091c19-b2ba-4f08-8b08-f97c0a4dd2dc",
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
  "id": "41cd774d-ab90-4829-9f21-307186d7a757",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:01.561103Z",
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
  "command_id": "23698b61-d06f-4429-b0fd-37bd46f95889",
  "quote_id": "41cd774d-ab90-4829-9f21-307186d7a757",
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
  "id": "d76c322d-92af-42e6-a001-38a45f51392e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:35:01.791375Z",
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
  "command_id": "92de88bb-5af3-47e6-a4a6-ecfe4634b15a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T10:35:02Z"
}
```

```json
{
  "id": "7ed7046d-2dc4-4105-abcf-46a723dd784d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:02.031700Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:35:02Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9929b6bf-8d13-432f-ba88-98f17fb005d2",
  "quote_id": "7ed7046d-2dc4-4105-abcf-46a723dd784d",
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
  "pickup_at": "2026-10-29T10:35:02Z"
}
```

```json
{
  "id": "e2f4753c-7f94-4542-86a6-360b29b3be29",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:35:02.263397Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:35:02Z",
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
  "command_id": "354e0f3d-2df0-434f-b431-450235e96503",
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
  "id": "c9daf22b-3c2e-4556-a502-3a8b6fa3947e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:02.506513Z",
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
  "command_id": "cf1b100d-6af8-45e5-b3cc-a0b8565c0672",
  "quote_id": "c9daf22b-3c2e-4556-a502-3a8b6fa3947e",
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
  "correlation_id": "c0d5d3e4-c1af-43b7-8ec8-17926e5c2662"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "e2f4753c-7f94-4542-86a6-360b29b3be29",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T07:35:02.263397Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T10:35:02Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d76c322d-92af-42e6-a001-38a45f51392e",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-29T07:35:01.791375Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "d76c322d-92af-42e6-a001-38a45f51392e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:35:01.791375Z",
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

`GET /api/rider/v1/orders/7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b` → **200**

```json
{
  "id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e046c341-7a64-4d4d-bdd3-0430e1ed5441",
    "order_id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0a9ca35b-3e4e-4e86-a71c-049492247373",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T07:35:00.661487Z",
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
    "location_at": "2026-10-29T07:34:59.752791Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b/cancel` → **200**

```json
{
  "command_id": "bc0aca0b-62af-45b9-8235-fa976b72da01",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e046c341-7a64-4d4d-bdd3-0430e1ed5441",
    "order_id": "7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0a9ca35b-3e4e-4e86-a71c-049492247373",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T07:35:00.661487Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`GET /api/rider/v1/orders/d76c322d-92af-42e6-a001-38a45f51392e` → **200**

```json
{
  "id": "d76c322d-92af-42e6-a001-38a45f51392e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:35:01.791375Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d76c322d-92af-42e6-a001-38a45f51392e/cancel` → **200**

```json
{
  "command_id": "38b98fdb-4efb-4537-9b1a-621bb77dc11d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d76c322d-92af-42e6-a001-38a45f51392e",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:35:01.791375Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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

`GET /api/rider/v1/orders/e2f4753c-7f94-4542-86a6-360b29b3be29` → **200**

```json
{
  "id": "e2f4753c-7f94-4542-86a6-360b29b3be29",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:35:02.263397Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:35:02Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e2f4753c-7f94-4542-86a6-360b29b3be29/cancel` → **200**

```json
{
  "command_id": "40a7f079-8595-4b03-8b72-8c8329b66aab",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e2f4753c-7f94-4542-86a6-360b29b3be29",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "52558e9e-c3a7-42c2-9a9c-c7e083f192a5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T07:35:02.263397Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-29T10:35:02Z",
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
  "session_id": "2da569a8-f77e-4972-b032-aec4432cac5f",
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
  "last_heartbeat_at": "2026-10-29T07:34:59.752791Z",
  "last_location_at": "2026-10-29T07:34:59.752791Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2da569a8-f77e-4972-b032-aec4432cac5f/close` → **200**

```json
{
  "command_id": "b43c3cdd-2f0e-44e0-95eb-57dda0b594b4",
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

Done: orders 7cdaabdd-6d6d-4d5b-88a0-6b29110d3c7b, d76c322d-92af-42e6-a001-38a45f51392e, e2f4753c-7f94-4542-86a6-360b29b3be29.

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
  "session_id": "44952ac0-7981-416b-bc76-a95097401c79",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMDUsImlhdCI6MTc5MzI1OTMwNSwianRpIjoiM2E5MzM2MDktMDgwNy00OGM5LTgwY2UtY2QzMTQ1MDcyNjM5Iiwic2lkIjoiNDQ5NTJhYzAtNzk4MS00MTZiLWJjNzYtYTk1MDk3NDAxYzc5In0.tjG_6wlJY9SrGxTwSlWu90CKhpM9eC4DnuB-gJEhOGE",
  "access_expires_at": "2026-10-29T07:50:05.514714268Z",
  "refresh_token": "DoOKVzsage4yp5ahMCtuAbH-V8MMwt5sVcBeZvMEaN4",
  "refresh_expires_at": "2026-10-29T19:35:05.514272374Z",
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
  "session_id": "9dbfa532-17d2-4e7c-b834-93ca9eac27c9",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMDUsImlhdCI6MTc5MzI1OTMwNSwianRpIjoiZWQwMmRlYmEtYjUzYi00NzlmLWE4ZjMtMDIwZjg1Y2MxMDRkIiwic2lkIjoiOWRiZmE1MzItMTdkMi00ZTdjLWI4MzQtOTNjYTllYWMyN2M5In0.ZcrA5bXN73B94E1w6N642X3wVbTZd_0rOXyIuJ1ob5o",
  "access_expires_at": "2026-10-29T07:50:05.986968634Z",
  "refresh_token": "TeI2IzdFOldM5764Cuj1_u2Hjo_iwVWstB1IYLXh9P4",
  "refresh_expires_at": "2026-10-29T19:35:05.986485221Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31965"
}
```

```json
{
  "challenge_id": "ad29a826-6fcc-416c-84fa-c470122622b3",
  "expires_at": "2026-10-29T07:40:06.20457658Z",
  "resend_available_at": "2026-10-29T07:35:07.20457658Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "310158",
  "sent_at": "2026-10-29T07:35:06.206338626Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad29a826-6fcc-416c-84fa-c470122622b3",
  "code": "310158",
  "device_ref": "sandbox-31965"
}
```

```json
{
  "session_id": "b701880c-f76b-46b5-989a-5f9f9556d619",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDIwNiwiaWF0IjoxNzkzMjU5MzA2LCJqdGkiOiI1YWE2NjlmZS0zZWRmLTQwMmItYmZiOS0zZjBmZTIwZjYwMzEiLCJzaWQiOiJiNzAxODgwYy1mNzZiLTQ2YjUtOTg5YS01ZjlmOTU1NmQ2MTkifQ.rFbHtmhYAIveRFwNRBsjNCI8oBxFoTzyIM7HhDPvHX4",
  "access_expires_at": "2026-10-29T07:50:06.450134868Z",
  "refresh_token": "aAj5f6Ms7K_X4EBKlKCx5xLAksGRy7SEyeDR73tZxvY",
  "refresh_expires_at": "2026-11-28T07:35:06.449662505Z",
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
  "command_id": "9e805d95-b000-4d97-8c0e-852c12a26109",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:06Z",
    "sequence": 1793259306876
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4ff27594-c9af-4d32-912f-365a164cf882",
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
  "last_heartbeat_at": "2026-10-29T07:35:06.891817Z",
  "last_location_at": "2026-10-29T07:35:06.891817Z",
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
  "command_id": "3c834245-dfc8-4b6d-bd02-4e8fd6ec8430",
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
  "effective_at": "2026-10-29T07:35:07.341827Z",
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T07:33:11.321292Z",
  "last_entries": [
    {
      "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:33:11.321292Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "68a2f499-41ba-485d-8dbf-6af78c277ac3",
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
  "id": "5d24d3c1-d3f1-46ac-a195-bb8860866a28",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:07.793896Z",
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
  "command_id": "5f0bc6bc-389a-414a-b619-d68846671767",
  "quote_id": "5d24d3c1-d3f1-46ac-a195-bb8860866a28",
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
    "phone": "+3806711132466"
  }
}
```

```json
{
  "id": "3ebd8616-35a0-41c8-b8f2-01bad8eaef85",
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
  "created_at": "2026-10-29T07:35:08.014529Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711132466"
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
    "id": "e995c242-fb19-480e-9c02-a731ac66cd6e",
    "order_id": "3ebd8616-35a0-41c8-b8f2-01bad8eaef85",
    "expires_at": "2026-10-29T07:35:23.017463Z",
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

`POST /api/driver/v1/offers/e995c242-fb19-480e-9c02-a731ac66cd6e/accept` → **200**

```json
{
  "command_id": "be392146-a693-4da1-9182-815ecdfddfdb"
}
```

```json
{
  "id": "587ac66b-05d0-417a-8a64-f47cb9cb4dfa",
  "order_id": "3ebd8616-35a0-41c8-b8f2-01bad8eaef85",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3328ce4f-bfdd-4fdc-a8d9-9c74b9927424",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3328ce4f-bfdd-4fdc-a8d9-9c74b9927424",
  "order_id": "3ebd8616-35a0-41c8-b8f2-01bad8eaef85",
  "assignment_id": "587ac66b-05d0-417a-8a64-f47cb9cb4dfa",
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
    "phone": "+3806711132466"
  }
}
```

`POST /api/driver/v1/work-sessions/4ff27594-c9af-4d32-912f-365a164cf882/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:08Z",
    "sequence": 1793259308879
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4ff27594-c9af-4d32-912f-365a164cf882",
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
  "last_heartbeat_at": "2026-10-29T07:35:08.896034Z",
  "last_location_at": "2026-10-29T07:35:08.896034Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3328ce4f-bfdd-4fdc-a8d9-9c74b9927424/arrive` → **200**

```json
{
  "command_id": "1ef00638-2a73-4e9e-85e9-3d61a3d824c3",
  "expected_version": 0
}
```

```json
{
  "id": "3328ce4f-bfdd-4fdc-a8d9-9c74b9927424",
  "order_id": "3ebd8616-35a0-41c8-b8f2-01bad8eaef85",
  "assignment_id": "587ac66b-05d0-417a-8a64-f47cb9cb4dfa",
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
  "arrived_at": "2026-10-29T07:35:09.116652Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711132466"
  }
}
```

`POST /api/driver/v1/trips/3328ce4f-bfdd-4fdc-a8d9-9c74b9927424/start` → **200**

```json
{
  "command_id": "3d90a1a7-6c7d-47dc-b110-9193c0462b9b",
  "expected_version": 1
}
```

```json
{
  "id": "3328ce4f-bfdd-4fdc-a8d9-9c74b9927424",
  "order_id": "3ebd8616-35a0-41c8-b8f2-01bad8eaef85",
  "assignment_id": "587ac66b-05d0-417a-8a64-f47cb9cb4dfa",
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
  "arrived_at": "2026-10-29T07:35:09.116652Z",
  "started_at": "2026-10-29T07:35:09.340304Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711132466"
  }
}
```

`POST /api/driver/v1/trips/3328ce4f-bfdd-4fdc-a8d9-9c74b9927424/complete` → **200**

```json
{
  "command_id": "28d4c6d4-8fce-4cd7-b184-e134b2b105d6",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:35:09Z",
  "cash_received": true
}
```

```json
{
  "id": "3328ce4f-bfdd-4fdc-a8d9-9c74b9927424",
  "order_id": "3ebd8616-35a0-41c8-b8f2-01bad8eaef85",
  "assignment_id": "587ac66b-05d0-417a-8a64-f47cb9cb4dfa",
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
  "arrived_at": "2026-10-29T07:35:09.116652Z",
  "started_at": "2026-10-29T07:35:09.340304Z",
  "completed_at": "2026-10-29T07:35:09.578986Z",
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
  "command_id": "e5c0d454-e27b-416b-b3b0-49278086ca87",
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
  "id": "6e08329e-90fe-4007-93db-847c6e52d370",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:09.806168Z",
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
  "command_id": "8896cc40-8a9b-4195-827e-48acbaaeafa1",
  "quote_id": "6e08329e-90fe-4007-93db-847c6e52d370",
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
    "phone": "+3806711131108"
  }
}
```

```json
{
  "id": "827693cc-a60c-40a0-9581-d04c8ba05a93",
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
  "created_at": "2026-10-29T07:35:10.030919Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131108"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/827693cc-a60c-40a0-9581-d04c8ba05a93` → **200**

```json
{
  "id": "827693cc-a60c-40a0-9581-d04c8ba05a93",
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
  "created_at": "2026-10-29T07:35:10.030919Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131108"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/827693cc-a60c-40a0-9581-d04c8ba05a93/cancel` → **200**

```json
{
  "command_id": "cdcca7da-80c4-4f34-b4ba-93507fb468cf",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "827693cc-a60c-40a0-9581-d04c8ba05a93",
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
  "created_at": "2026-10-29T07:35:10.030919Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131108"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
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
  "staff_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T07:33:11.321292Z",
  "last_entries": [
    {
      "order_id": "827693cc-a60c-40a0-9581-d04c8ba05a93",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T07:35:10.498967Z"
    },
    {
      "order_id": "3ebd8616-35a0-41c8-b8f2-01bad8eaef85",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T07:35:09.582418Z"
    },
    {
      "order_id": "9a6000d5-eeb6-47b8-81bf-fcb2b487c746",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T07:33:11.321292Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4ff27594-c9af-4d32-912f-365a164cf882",
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
  "last_heartbeat_at": "2026-10-29T07:35:08.896034Z",
  "last_location_at": "2026-10-29T07:35:08.896034Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4ff27594-c9af-4d32-912f-365a164cf882/close` → **200**

```json
{
  "command_id": "5802305d-a99d-4892-99d8-fcae7e9c223e",
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

Done: operator bonus for fulfilled 3ebd8616-35a0-41c8-b8f2-01bad8eaef85 and operator-fault cancellation 827693cc-a60c-40a0-9581-d04c8ba05a93.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679000919",
  "device_ref": "sandbox-11522"
}
```

```json
{
  "challenge_id": "a768ee52-96d3-4b0b-a3d4-5437050adfcf",
  "expires_at": "2026-10-29T07:40:13.510256235Z",
  "resend_available_at": "2026-10-29T07:35:14.510256235Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679000919` → **200**

```json
{
  "phone": "+380679000919",
  "audience": "CLIENT",
  "code": "760324",
  "sent_at": "2026-10-29T07:35:13.512032651Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676766883",
  "device_ref": "sandbox-11152",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2871067f-2fd4-4da7-8d73-d187097e1659",
  "expires_at": "2026-10-29T07:40:13.751322372Z",
  "resend_available_at": "2026-10-29T07:35:14.751322372Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676766883` → **200**

```json
{
  "phone": "+380676766883",
  "audience": "CLIENT",
  "code": "029220",
  "sent_at": "2026-10-29T07:35:13.753284731Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676120000",
  "device_ref": "sandbox-3660"
}
```

```json
{
  "challenge_id": "f7eca34c-6e0f-41b7-aab9-ce893f17e088",
  "expires_at": "2026-10-29T07:40:13.988585707Z",
  "resend_available_at": "2026-10-29T07:35:14.988585707Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676120000` → **200**

```json
{
  "phone": "+380676120000",
  "audience": "CLIENT",
  "code": "830865",
  "sent_at": "2026-10-29T07:35:13.991159122Z",
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
  "session_id": "888bcbc4-dab5-4e25-bcd1-03865f8471dc",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMTQsImlhdCI6MTc5MzI1OTMxNCwianRpIjoiYTgxYWU3NzQtMzE4NC00N2ZhLThlOTQtMzg1MDk4NTljYTNhIiwic2lkIjoiODg4YmNiYzQtZGFiNS00ZTI1LWJjZDEtMDM4NjVmODQ3MWRjIn0.pLvudarrm8ZzYumWJYvLV_ahFKbcGn9aujnjWBURJTU",
  "access_expires_at": "2026-10-29T07:50:14.477331702Z",
  "refresh_token": "VeUBx0FEIxBqsIF0tdjv_Xmj48yOMw0cCmKXfaF0BjI",
  "refresh_expires_at": "2026-10-29T19:35:14.476923564Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676120000` → **200**

```json
{
  "deliveries": [
    {
      "id": "39556823-9b65-4db7-949d-995cc37653a3",
      "challenge_id": "f7eca34c-6e0f-41b7-aab9-ce893f17e088",
      "phone": "+380676120000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-710c6a34-d6d6-415e-8b46-2f70df862461",
      "error": null,
      "attempted_at": "2026-10-29T07:35:13.991381Z"
    },
    {
      "id": "59ca6bf5-3b96-4eb8-a0e7-de2bccaa1f45",
      "challenge_id": "f7eca34c-6e0f-41b7-aab9-ce893f17e088",
      "phone": "+380676120000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T07:35:13.990385Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676120000` → **200**

```json
{
  "phone": "+380676120000",
  "audience": "CLIENT",
  "code": "830865",
  "sent_at": "2026-10-29T07:35:13.991159122Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676766883` → **200**

```json
{
  "deliveries": [
    {
      "id": "bd1403a3-a77f-4b84-843d-f96936996b80",
      "challenge_id": "2871067f-2fd4-4da7-8d73-d187097e1659",
      "phone": "+380676766883",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-64b75d6a-0bb5-4bfe-9270-54a42806ccef",
      "error": null,
      "attempted_at": "2026-10-29T07:35:13.753521Z"
    }
  ]
}
```

Done: SMS to +380679000919, a call to +380676766883, SMS then a call to +380676120000.

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
  "session_id": "ebcdd2e7-f89d-4389-a197-493d51b6e26c",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMTUsImlhdCI6MTc5MzI1OTMxNSwianRpIjoiY2JlNWVjYzktOWQ2NS00NjllLTkzMWEtMTMyZWMxYWQ3MjhlIiwic2lkIjoiZWJjZGQyZTctZjg5ZC00Mzg5LWExOTctNDkzZDUxYjZlMjZjIn0.DzFs8hFO8IpqqjhZ-ahn2AK4fSea75zT21E5--rQ60c",
  "access_expires_at": "2026-10-29T07:50:15.408961722Z",
  "refresh_token": "VdRXHiexmyX4nP-CES0FYwI8u4QN1qWvrRv3yzldpAI",
  "refresh_expires_at": "2026-10-29T19:35:15.408574323Z",
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
  "session_id": "62b2bb51-1e33-454a-8cf6-209c6fb9881a",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMTUsImlhdCI6MTc5MzI1OTMxNSwianRpIjoiNTBiYTNlMzgtZmFlMi00ZTgyLTk4MjYtMWQxMGM0MzE3MDFmIiwic2lkIjoiNjJiMmJiNTEtMWUzMy00NTRhLThjZjYtMjA5YzZmYjk4ODFhIn0.G-2jkDs7mZ0MXFQe2jgAZlYesS9euN57GDx1yTfvwFc",
  "access_expires_at": "2026-10-29T07:50:15.8723267Z",
  "refresh_token": "a7XWXwvZA4GZ-t0tn8xHu6ZeuJrYzx_KgoFmYd_dNdo",
  "refresh_expires_at": "2026-10-29T19:35:15.871907104Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572",
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

`POST /api/admin/v1/staff-extensions/ca349082-99eb-4d76-baa2-a610d81cb572` → **200**

```json
{
  "command_id": "4eeaea2f-9cab-4384-a003-3e885c1af4a5",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "2af91ff6-cee0-4878-a329-7b79c5dc072e",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:35:16.738145Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T07:35:16.738145Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c881eb5f-6f77-440c-a3d4-0ca749e97654",
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
  "id": "e42b8cef-ded5-40b3-b493-f233f7530017",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:17.175968Z",
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
  "command_id": "eb2be26f-08cc-40a2-8331-e86bd235516b",
  "quote_id": "e42b8cef-ded5-40b3-b493-f233f7530017",
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
    "phone": "+380670121259"
  }
}
```

```json
{
  "id": "a7b70e16-660e-4cdd-b766-4bf120d97744",
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
  "created_at": "2026-10-29T07:35:17.402871Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670121259"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/a7b70e16-660e-4cdd-b766-4bf120d97744/calls` → **201**

```json
{
  "command_id": "ec26288a-b84b-4b5a-b3b9-1fc3ffdb90bb",
  "to": "CALLER"
}
```

```json
{
  "id": "b945743d-ef23-49bf-ab88-42b19d2e6a45",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "order_ids": [
    "a7b70e16-660e-4cdd-b766-4bf120d97744"
  ],
  "started_at": "2026-10-29T07:35:17.646962Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/a7b70e16-660e-4cdd-b766-4bf120d97744/calls` → **201**

```json
{
  "command_id": "ec26288a-b84b-4b5a-b3b9-1fc3ffdb90bb",
  "to": "CALLER"
}
```

```json
{
  "id": "b945743d-ef23-49bf-ab88-42b19d2e6a45",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "order_ids": [
    "a7b70e16-660e-4cdd-b766-4bf120d97744"
  ],
  "started_at": "2026-10-29T07:35:17.646962Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "b945743d-ef23-49bf-ab88-42b19d2e6a45",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380670121259",
    "at": "2026-10-29T07:35:17.648864603Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "b945743d-ef23-49bf-ab88-42b19d2e6a45",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.22176",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "b945743d-ef23-49bf-ab88-42b19d2e6a45"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "b945743d-ef23-49bf-ab88-42b19d2e6a45",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=a7b70e16-660e-4cdd-b766-4bf120d97744` → **200**

```json
{
  "calls": [
    {
      "id": "b945743d-ef23-49bf-ab88-42b19d2e6a45",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_ids": [
        "a7b70e16-660e-4cdd-b766-4bf120d97744"
      ],
      "started_at": "2026-10-29T07:35:17.646962Z",
      "answered_at": "2026-10-29T07:35:18.186285Z",
      "ended_at": "2026-10-29T07:35:18.204896Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a7b70e16-660e-4cdd-b766-4bf120d97744` → **200**

```json
{
  "calls": [
    {
      "id": "b945743d-ef23-49bf-ab88-42b19d2e6a45",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_ids": [
        "a7b70e16-660e-4cdd-b766-4bf120d97744"
      ],
      "started_at": "2026-10-29T07:35:17.646962Z",
      "answered_at": "2026-10-29T07:35:18.186285Z",
      "ended_at": "2026-10-29T07:35:18.204896Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=a7b70e16-660e-4cdd-b766-4bf120d97744` → **200**

```json
{
  "calls": [
    {
      "id": "b945743d-ef23-49bf-ab88-42b19d2e6a45",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "order_ids": [
        "a7b70e16-660e-4cdd-b766-4bf120d97744"
      ],
      "started_at": "2026-10-29T07:35:17.646962Z",
      "answered_at": "2026-10-29T07:35:18.186285Z",
      "ended_at": "2026-10-29T07:35:18.204896Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T07:35:22.273574Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/a7b70e16-660e-4cdd-b766-4bf120d97744` → **200**

```json
{
  "id": "a7b70e16-660e-4cdd-b766-4bf120d97744",
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
  "created_at": "2026-10-29T07:35:17.402871Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670121259"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a7b70e16-660e-4cdd-b766-4bf120d97744/cancel` → **200**

```json
{
  "command_id": "fcbc4166-d2cf-4c42-873c-4ea7afffc399",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a7b70e16-660e-4cdd-b766-4bf120d97744",
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
  "created_at": "2026-10-29T07:35:17.402871Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670121259"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
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
  "command_id": "68c23364-e62a-4811-a841-12e135f29a44",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T07:35:23.393891Z",
  "extension": "101"
}
```

Done: outgoing call b945743d-ef23-49bf-ab88-42b19d2e6a45 from order a7b70e16-660e-4cdd-b766-4bf120d97744, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639817970",
  "device_ref": "sandbox-4911"
}
```

```json
{
  "challenge_id": "a3b20127-6461-463c-b694-df4967273cf2",
  "expires_at": "2026-10-29T07:40:23.62036829Z",
  "resend_available_at": "2026-10-29T07:35:24.62036829Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639817970` → **200**

```json
{
  "phone": "+380639817970",
  "audience": "CLIENT",
  "code": "252232",
  "sent_at": "2026-10-29T07:35:23.62229119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3b20127-6461-463c-b694-df4967273cf2",
  "code": "252232",
  "device_ref": "sandbox-4911"
}
```

```json
{
  "session_id": "ae5fed53-3b01-4957-9ad6-002967381e76",
  "subject": {
    "type": "CLIENT",
    "id": "1f71dbd2-72da-4bde-82a9-1bcc451be012"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjcxZGJkMi03MmRhLTRiZGUtODJhOS0xYmNjNDUxYmUwMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjIzLCJpYXQiOjE3OTMyNTkzMjMsImp0aSI6IjY4ZWFiODFhLWVlYTAtNGI1Yi1iNjQ3LTg5ZWY0M2IwMjU3NyIsInNpZCI6ImFlNWZlZDUzLTNiMDEtNDk1Ny05YWQ2LTAwMjk2NzM4MWU3NiJ9.UQk7_IghrMIwgsDu8HUN3_xcoHp16xsblY96I5KqAvw",
  "access_expires_at": "2026-10-29T07:50:23.854009727Z",
  "refresh_token": "eqJzQCFsT8OtHYHjMYmkAOXc_Nx_CjUh0sh6NmIhDlk",
  "refresh_expires_at": "2026-11-28T07:35:23.853647255Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1f71dbd2-72da-4bde-82a9-1bcc451be012",
  "session_id": "ae5fed53-3b01-4957-9ad6-002967381e76",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639817970",
  "device_ref": "sandbox-11681"
}
```

```json
{
  "challenge_id": "04ac7804-6ed3-4107-962d-9ddcc56570cb",
  "expires_at": "2026-10-29T07:40:26.271560717Z",
  "resend_available_at": "2026-10-29T07:35:27.271560717Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639817970` → **200**

```json
{
  "phone": "+380639817970",
  "audience": "CLIENT",
  "code": "491812",
  "sent_at": "2026-10-29T07:35:26.27311036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04ac7804-6ed3-4107-962d-9ddcc56570cb",
  "code": "491812",
  "device_ref": "sandbox-11681"
}
```

```json
{
  "session_id": "9e76a855-e7d6-4bf5-b5a2-1baa6df11c11",
  "subject": {
    "type": "CLIENT",
    "id": "1f71dbd2-72da-4bde-82a9-1bcc451be012"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjcxZGJkMi03MmRhLTRiZGUtODJhOS0xYmNjNDUxYmUwMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjI2LCJpYXQiOjE3OTMyNTkzMjYsImp0aSI6ImJjMjU4MzEzLWI3ZTEtNDhjZi1iMGMzLWNmMjM1Yzk5MGE3YSIsInNpZCI6IjllNzZhODU1LWU3ZDYtNGJmNS1iNWEyLTFiYWE2ZGYxMWMxMSJ9.61kmGdi7tZ7_E9IWPoBtyQEopzf5xJSKqaGhs72Gw2c",
  "access_expires_at": "2026-10-29T07:50:26.513266871Z",
  "refresh_token": "o6jjAI0t-yGXQ-wNbYrNlOcmhIQ5fWGNfQBYhFhxAyo",
  "refresh_expires_at": "2026-11-28T07:35:26.512672544Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "86c9206a-3931-4adc-a635-6b3d9b58d308",
  "expires_at": "2026-10-29T07:40:28.736295313Z",
  "resend_available_at": "2026-10-29T07:35:29.736295313Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639817970` → **200**

```json
{
  "phone": "+380639817970",
  "audience": "CLIENT",
  "code": "870121",
  "sent_at": "2026-10-29T07:35:28.737983861Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636924841"
}
```

```json
{
  "challenge_id": "514a9c6d-ea22-4297-88a0-a61bac43225a",
  "expires_at": "2026-10-29T07:40:28.96973001Z",
  "resend_available_at": "2026-10-29T07:35:29.96973001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636924841` → **200**

```json
{
  "phone": "+380636924841",
  "audience": "CLIENT",
  "code": "596420",
  "sent_at": "2026-10-29T07:35:28.97152204Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "56a47c49-7d8a-4bdb-8ca1-70fda70a66a1",
  "current_challenge_id": "86c9206a-3931-4adc-a635-6b3d9b58d308",
  "current_code": "000000",
  "new_challenge_id": "514a9c6d-ea22-4297-88a0-a61bac43225a",
  "new_code": "596420"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "0955b524-e7e1-4244-ab8b-0f2b78a1d230"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "910c590d-0878-4add-a143-98decd513d38",
  "current_challenge_id": "86c9206a-3931-4adc-a635-6b3d9b58d308",
  "current_code": "870121",
  "new_challenge_id": "514a9c6d-ea22-4297-88a0-a61bac43225a",
  "new_code": "596420"
}
```

```json
{
  "subject_id": "1f71dbd2-72da-4bde-82a9-1bcc451be012",
  "phone": "+380636924841",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1f71dbd2-72da-4bde-82a9-1bcc451be012",
  "session_id": "ae5fed53-3b01-4957-9ad6-002967381e76",
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
  "correlation_id": "bff20b18-9848-4e5b-bff7-7c79f87bd352"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636924841",
  "device_ref": "sandbox-272"
}
```

```json
{
  "challenge_id": "93e77d3c-0610-4aec-99d6-a862073a0170",
  "expires_at": "2026-10-29T07:40:32.081319714Z",
  "resend_available_at": "2026-10-29T07:35:33.081319714Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636924841` → **200**

```json
{
  "phone": "+380636924841",
  "audience": "CLIENT",
  "code": "073083",
  "sent_at": "2026-10-29T07:35:32.08299253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93e77d3c-0610-4aec-99d6-a862073a0170",
  "code": "073083",
  "device_ref": "sandbox-272"
}
```

```json
{
  "session_id": "a229e3bd-e8a8-473e-b5b7-53277bc8e31e",
  "subject": {
    "type": "CLIENT",
    "id": "1f71dbd2-72da-4bde-82a9-1bcc451be012"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjcxZGJkMi03MmRhLTRiZGUtODJhOS0xYmNjNDUxYmUwMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjMyLCJpYXQiOjE3OTMyNTkzMzIsImp0aSI6ImY3MzY3YzJmLTE1ZTQtNDM4YS1hMDE0LTZlN2Y0ZmMwYmRmZiIsInNpZCI6ImEyMjllM2JkLWU4YTgtNDczZS1iNWI3LTUzMjc3YmM4ZTMxZSJ9.kSVNlngdqLv08Ew5I3esE7oBLy6lD_pIRvY7dK_oG9s",
  "access_expires_at": "2026-10-29T07:50:32.325953615Z",
  "refresh_token": "X9mWJot5EJPYf5vdr-PStAav_6MZv_7WpwKmB8PkMcA",
  "refresh_expires_at": "2026-11-28T07:35:32.325537489Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1f71dbd2-72da-4bde-82a9-1bcc451be012",
  "session_id": "a229e3bd-e8a8-473e-b5b7-53277bc8e31e",
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
  "session_id": "dd52ab96-9f34-493d-bcdd-164dbb3935f7",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMzIsImlhdCI6MTc5MzI1OTMzMiwianRpIjoiOTUxNjkwNTctMTBhYS00YjE0LTlhMWUtMzliNzliODgzYzJhIiwic2lkIjoiZGQ1MmFiOTYtOWYzNC00OTNkLWJjZGQtMTY0ZGJiMzkzNWY3In0.-ynhgsW9hMg23PPpkuvtLjakVaX_jvHLW03fBOriGLo",
  "access_expires_at": "2026-10-29T07:50:32.996295059Z",
  "refresh_token": "Sh-4-LZEdUeQTAxxJlIzz2sNUscKcPQq4yHFMvXQCIc",
  "refresh_expires_at": "2026-10-29T19:35:32.995860771Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/1f71dbd2-72da-4bde-82a9-1bcc451be012` → **200**

```json
{
  "client": {
    "id": "1f71dbd2-72da-4bde-82a9-1bcc451be012",
    "phone": "+380636924841",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T07:35:23.852429Z",
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

`POST /api/admin/v1/clients/1f71dbd2-72da-4bde-82a9-1bcc451be012/phone/new-code` → **201**

```json
{
  "phone": "+380638435019"
}
```

```json
{
  "challenge_id": "f596e0ff-b517-4601-accd-e142de0e674a",
  "expires_at": "2026-10-29T07:40:33.452329077Z",
  "resend_available_at": "2026-10-29T07:35:34.452329077Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638435019` → **200**

```json
{
  "phone": "+380638435019",
  "audience": "CLIENT",
  "code": "563611",
  "sent_at": "2026-10-29T07:35:33.453653151Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/1f71dbd2-72da-4bde-82a9-1bcc451be012/phone` → **422**

```json
{
  "command_id": "dac64a45-7f85-48c3-8ce1-d7ca8937d438",
  "expected_version": 3,
  "new_challenge_id": "f596e0ff-b517-4601-accd-e142de0e674a",
  "new_code": "563612",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/1f71dbd2-72da-4bde-82a9-1bcc451be012/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "2b693605-dd81-42f0-89c1-a6f9491ff188"
}
```

`POST /api/admin/v1/clients/1f71dbd2-72da-4bde-82a9-1bcc451be012/phone` → **400**

```json
{
  "command_id": "57f94ac0-8381-4da0-997a-940c3b60ad99",
  "expected_version": 3,
  "new_challenge_id": "f596e0ff-b517-4601-accd-e142de0e674a",
  "new_code": "563611",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/1f71dbd2-72da-4bde-82a9-1bcc451be012/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "3a7393a3-55c5-4f27-a5c8-78e8680f8b26",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/1f71dbd2-72da-4bde-82a9-1bcc451be012/phone` → **200**

```json
{
  "command_id": "57344409-5de8-460a-b5cb-1afbb124ed6d",
  "expected_version": 3,
  "new_challenge_id": "f596e0ff-b517-4601-accd-e142de0e674a",
  "new_code": "563611",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "1f71dbd2-72da-4bde-82a9-1bcc451be012",
  "phone": "+380638435019",
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
  "correlation_id": "e1fb5ed9-b3f7-4b8e-8e24-6e24d92d77d7"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638435019",
  "device_ref": "sandbox-16453"
}
```

```json
{
  "challenge_id": "fc714afe-8521-4fba-9784-77c93d8615e0",
  "expires_at": "2026-10-29T07:40:34.566423259Z",
  "resend_available_at": "2026-10-29T07:35:35.566423259Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638435019` → **200**

```json
{
  "phone": "+380638435019",
  "audience": "CLIENT",
  "code": "076311",
  "sent_at": "2026-10-29T07:35:34.568369916Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc714afe-8521-4fba-9784-77c93d8615e0",
  "code": "076311",
  "device_ref": "sandbox-16453"
}
```

```json
{
  "session_id": "271c82b6-95a4-4f11-ba2e-04bb266bae43",
  "subject": {
    "type": "CLIENT",
    "id": "1f71dbd2-72da-4bde-82a9-1bcc451be012"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjcxZGJkMi03MmRhLTRiZGUtODJhOS0xYmNjNDUxYmUwMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjM0LCJpYXQiOjE3OTMyNTkzMzQsImp0aSI6IjI3MTYwNGUxLTU1MTAtNGUxNC1hOTdmLWE2NjgxZjM2NDFiMSIsInNpZCI6IjI3MWM4MmI2LTk1YTQtNGYxMS1iYTJlLTA0YmIyNjZiYWU0MyJ9.f1CQjPivBNd9NTXDlWmH8XcKWGPCv-rRMCilovSTeFE",
  "access_expires_at": "2026-10-29T07:50:34.797882997Z",
  "refresh_token": "sh_6h6DvL6nMlyzi9iO24eSJ3GAZbdgQI7EztI4VyvY",
  "refresh_expires_at": "2026-11-28T07:35:34.797468048Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1f71dbd2-72da-4bde-82a9-1bcc451be012",
  "session_id": "271c82b6-95a4-4f11-ba2e-04bb266bae43",
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
  "phone": "+380639111919",
  "device_ref": "sandbox-21655"
}
```

```json
{
  "challenge_id": "8891a7eb-c217-4aa8-8fc4-e010b24e1b9f",
  "expires_at": "2026-10-29T07:40:35.229199144Z",
  "resend_available_at": "2026-10-29T07:35:36.229199144Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639111919` → **200**

```json
{
  "phone": "+380639111919",
  "audience": "CLIENT",
  "code": "444969",
  "sent_at": "2026-10-29T07:35:35.230939704Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8891a7eb-c217-4aa8-8fc4-e010b24e1b9f",
  "code": "444969",
  "device_ref": "sandbox-21655"
}
```

```json
{
  "session_id": "dde435b8-4f05-475b-becc-0d189e017ffb",
  "subject": {
    "type": "CLIENT",
    "id": "f801e7a9-fc08-4816-8291-ab09f29181f2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODAxZTdhOS1mYzA4LTQ4MTYtODI5MS1hYjA5ZjI5MTgxZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjM1LCJpYXQiOjE3OTMyNTkzMzUsImp0aSI6ImY0ZmEzZWMzLTIyNjMtNDRjNy04NDlhLTNjYWQxZmJkOGU4MyIsInNpZCI6ImRkZTQzNWI4LTRmMDUtNDc1Yi1iZWNjLTBkMTg5ZTAxN2ZmYiJ9.Jitt5a7nFKcghvEY1RzWI5o713uwulO7n8RPFQwtNXE",
  "access_expires_at": "2026-10-29T07:50:35.468049516Z",
  "refresh_token": "vGP-SqPVwz3oXEC3HyutjclcU4Lq69mKas-JXjY4984",
  "refresh_expires_at": "2026-11-28T07:35:35.467676318Z",
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
  "session_id": "14eaa1c1-f7c5-4edd-8bfe-a859f99932b9",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMzYsImlhdCI6MTc5MzI1OTMzNiwianRpIjoiMDZjZmExMzEtYTZmNC00ZjYxLWFjODctZTQwZDlmNDQ1YTNkIiwic2lkIjoiMTRlYWExYzEtZjdjNS00ZWRkLThiZmUtYTg1OWY5OTkzMmI5In0.Y2NpBchJvjRcPGUe7c0TZk2_2ueHg_AFh8KvBrUSxVk",
  "access_expires_at": "2026-10-29T07:50:36.38690648Z",
  "refresh_token": "GiWnKr_UWdV32LtH9eGpUR48Ch2DBpSEiM5gj3ThURo",
  "refresh_expires_at": "2026-10-29T19:35:36.386522736Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380639111919` → **200**

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
  "correlation_id": "a4fd77fd-f4ef-4baf-9f97-9d4e3065427e"
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
  "session_id": "a2674599-c331-4a5d-9d91-cc90eb3431f8",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyMzcsImlhdCI6MTc5MzI1OTMzNywianRpIjoiYjk2MTljZDItZGIzYi00Mzk0LTgxMzMtNzQ2MGNkMGI0ZjQ5Iiwic2lkIjoiYTI2NzQ1OTktYzMzMS00YTVkLTlkOTEtY2M5MGViMzQzMWY4In0.EMZuChmwcmyyrdwO5nXdZmz1LL8lkO_tp6YodtA7_yY",
  "access_expires_at": "2026-10-29T07:50:37.307175232Z",
  "refresh_token": "z_cxtL97geUXaccBhpeADu5qRzr0QP1tyKgTrcHjB7Q",
  "refresh_expires_at": "2026-10-29T19:35:37.306785609Z",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T07:32:48.964314Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "c774cb37-7a6e-4086-b6a1-62f5bdc49f2e",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T07:35:37.742709613Z"
}
```

## The rider books the airport for 2026-10-29T10:35:37Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600541320",
  "device_ref": "sandbox-10643"
}
```

```json
{
  "challenge_id": "5a28979c-4698-49d7-a59d-6904af2b493b",
  "expires_at": "2026-10-29T07:40:37.967222934Z",
  "resend_available_at": "2026-10-29T07:35:38.967222934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600541320` → **200**

```json
{
  "phone": "+48600541320",
  "audience": "CLIENT",
  "code": "591964",
  "sent_at": "2026-10-29T07:35:37.969046205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a28979c-4698-49d7-a59d-6904af2b493b",
  "code": "591964",
  "device_ref": "sandbox-10643"
}
```

```json
{
  "session_id": "f29e1b38-56bb-479a-8134-9c90ae7ddb24",
  "subject": {
    "type": "CLIENT",
    "id": "3f9ba561-c1f6-495d-aa6b-703ad6882861"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjliYTU2MS1jMWY2LTQ5NWQtYWE2Yi03MDNhZDY4ODI4NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjM4LCJpYXQiOjE3OTMyNTkzMzgsImp0aSI6IjM5MTY4NzQyLWQ3ZTEtNGJhZi1hZDUxLTY5ZjBkOGY0NzQ0MSIsInNpZCI6ImYyOWUxYjM4LTU2YmItNDc5YS04MTM0LTljOTBhZTdkZGIyNCJ9.DBPJUGMxsihGUtBSYwGZ0FGHtPJKUoXzATDhk-9ttn4",
  "access_expires_at": "2026-10-29T07:50:38.225693851Z",
  "refresh_token": "eTrNerzMHMAho8UwkjxoVOedqJjwqTqspw6TlUy_REo",
  "refresh_expires_at": "2026-11-28T07:35:38.225284605Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2d783634-d97a-4bdd-ac4b-bd8d0e68280a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T10:35:37Z"
}
```

```json
{
  "id": "b953c7f3-3ca7-4a68-ae58-bc09955466ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:38.443112Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T10:35:37Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d95ddd85-561f-42a2-9fa5-c8ae35042c35",
  "quote_id": "b953c7f3-3ca7-4a68-ae58-bc09955466ca",
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
  "pickup_at": "2026-10-29T10:35:37Z"
}
```

```json
{
  "id": "dbd3f1c7-26da-405a-8d4b-2632397cdffb",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3f9ba561-c1f6-495d-aa6b-703ad6882861",
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
  "created_at": "2026-10-29T07:35:38.674962Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T10:35:37Z",
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
  "device_ref": "sandbox-513"
}
```

```json
{
  "challenge_id": "0693659a-e2d6-47db-a1d3-d10fda68f027",
  "expires_at": "2026-10-29T07:40:38.903105298Z",
  "resend_available_at": "2026-10-29T07:35:39.903105298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "046878",
  "sent_at": "2026-10-29T07:35:38.904893607Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0693659a-e2d6-47db-a1d3-d10fda68f027",
  "code": "046878",
  "device_ref": "sandbox-513"
}
```

```json
{
  "session_id": "8e387be2-91eb-4dfe-9ec0-c8a8a1b45174",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDIzOSwiaWF0IjoxNzkzMjU5MzM5LCJqdGkiOiI2ZTQ5ZDMwNi0yNmJmLTRhZTctYjBkMC0yZjFkMzdhN2ZhZGMiLCJzaWQiOiI4ZTM4N2JlMi05MWViLTRkZmUtOWVjMC1jOGE4YTFiNDUxNzQifQ.vVrfCLJ4cbxtrUYxR0Xau4Y3iFKafWrGiXyalsgsUG4",
  "access_expires_at": "2026-10-29T07:50:39.135959748Z",
  "refresh_token": "-8pL49KD_xZdsL_Qlj1Z8VIJQ1VYUQXFLqrphG6WeYg",
  "refresh_expires_at": "2026-11-28T07:35:39.135453543Z",
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
  "command_id": "2896e5b2-f898-4419-84fb-d9f36f6020ac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:39Z",
    "sequence": 1793259339563
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e538ad36-fa08-4b65-b872-e6fb54f25868",
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
  "last_heartbeat_at": "2026-10-29T07:35:39.579407Z",
  "last_location_at": "2026-10-29T07:35:39.579407Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "dbd3f1c7-26da-405a-8d4b-2632397cdffb",
      "short_number": 23,
      "pickup_at": "2026-10-29T10:35:37Z",
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

`POST /api/driver/v1/preorders/dbd3f1c7-26da-405a-8d4b-2632397cdffb/reserve` → **200**

```json
{
  "command_id": "13300216-7520-434e-81ad-1c5b281ec01f"
}
```

```json
{
  "id": "c11798e5-565e-4c49-b86e-3407fc914767",
  "state": "RESERVED",
  "order": {
    "order_id": "dbd3f1c7-26da-405a-8d4b-2632397cdffb",
    "short_number": 23,
    "pickup_at": "2026-10-29T10:35:37Z",
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
  "reserved_at": "2026-10-29T07:35:40.015434Z",
  "confirm_from": "2026-10-29T10:05:37Z",
  "confirm_until": "2026-10-29T10:15:37Z",
  "drop_until": "2026-10-29T09:35:37Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "c11798e5-565e-4c49-b86e-3407fc914767",
      "state": "RESERVED",
      "order": {
        "order_id": "dbd3f1c7-26da-405a-8d4b-2632397cdffb",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:35:37Z",
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
      "reserved_at": "2026-10-29T07:35:40.015434Z",
      "confirm_from": "2026-10-29T10:05:37Z",
      "confirm_until": "2026-10-29T10:15:37Z",
      "drop_until": "2026-10-29T09:35:37Z"
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
      "id": "c11798e5-565e-4c49-b86e-3407fc914767",
      "state": "RESERVED",
      "order": {
        "order_id": "dbd3f1c7-26da-405a-8d4b-2632397cdffb",
        "short_number": 23,
        "pickup_at": "2026-10-29T10:35:37Z",
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
      "reserved_at": "2026-10-29T07:35:40.015434Z",
      "confirm_from": "2026-10-29T10:05:37Z",
      "confirm_until": "2026-10-29T10:15:37Z",
      "drop_until": "2026-10-29T09:35:37Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/c11798e5-565e-4c49-b86e-3407fc914767/confirm` → **409**

```json
{
  "command_id": "3e08472c-af8b-478f-9066-39b8813137f9"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/c11798e5-565e-4c49-b86e-3407fc914767/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9938ca07-d8ae-4a0b-9abb-c8bc32144c24"
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
  "session_id": "4cd6ec1a-96ca-4c3b-aab0-045d9b5e4d16",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNDEsImlhdCI6MTc5MzI1OTM0MSwianRpIjoiMmMwNzMxMTUtZTVjYS00N2E0LTkxNjktMDZlYjhiZDI4MWZjIiwic2lkIjoiNGNkNmVjMWEtOTZjYS00YzNiLWFhYjAtMDQ1ZDliNWU0ZDE2In0.5pCQdbY1Vuq3LXxe2Ji1dVKIHKp_3fqE-SB5zn9W3nY",
  "access_expires_at": "2026-10-29T07:50:41.126570892Z",
  "refresh_token": "8d9NT0ffCb81pnhavdU13IP4HFBoqQYWDm2O1MSOWOQ",
  "refresh_expires_at": "2026-10-29T19:35:41.126114622Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dbd3f1c7-26da-405a-8d4b-2632397cdffb` → **200**

```json
{
  "id": "dbd3f1c7-26da-405a-8d4b-2632397cdffb",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "3f9ba561-c1f6-495d-aa6b-703ad6882861",
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
  "created_at": "2026-10-29T07:35:38.674962Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T10:35:37Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "c11798e5-565e-4c49-b86e-3407fc914767",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T07:35:40.015434Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/dbd3f1c7-26da-405a-8d4b-2632397cdffb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T07:35:38.675849Z",
      "actor": {
        "type": "CLIENT",
        "id": "3f9ba561-c1f6-495d-aa6b-703ad6882861",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "dbd3f1c7-26da-405a-8d4b-2632397cdffb",
        "preorder": true,
        "quote_id": "b953c7f3-3ca7-4a68-ae58-bc09955466ca",
        "pickup_at": "2026-10-29T10:35:37Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "2466f6bd-6ec5-4a67-a680-686699c9a94b"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T07:35:40.016412Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dbd3f1c7-26da-405a-8d4b-2632397cdffb",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "c11798e5-565e-4c49-b86e-3407fc914767"
      },
      "correlation_id": "0e3392f2-79c4-4f89-a71c-2e41e1125b1b"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order dbd3f1c7-26da-405a-8d4b-2632397cdffb, reservation c11798e5-565e-4c49-b86e-3407fc914767.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13067"
}
```

```json
{
  "challenge_id": "d37e8176-b8e1-4cd2-901b-c6fc64731a4d",
  "expires_at": "2026-10-29T07:40:41.791275082Z",
  "resend_available_at": "2026-10-29T07:35:42.791275082Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "109886",
  "sent_at": "2026-10-29T07:35:41.793173648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d37e8176-b8e1-4cd2-901b-c6fc64731a4d",
  "code": "109886",
  "device_ref": "sandbox-13067"
}
```

```json
{
  "session_id": "d5d70878-7964-4c1f-9232-e6a3ee3ebf87",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI0MiwiaWF0IjoxNzkzMjU5MzQyLCJqdGkiOiIwOTRlNjJjMS0zZDQ0LTQwZDMtODQyZi03ODg4YTk5OWQ2YTMiLCJzaWQiOiJkNWQ3MDg3OC03OTY0LTRjMWYtOTIzMi1lNmEzZWUzZWJmODcifQ.NqMpXQGDAbelWxPbKP7aSa6jLKSiZwx5lnkA6tfABL4",
  "access_expires_at": "2026-10-29T07:50:42.024788734Z",
  "refresh_token": "fxHc0voWdD312iInkNG7XuCqsJPyDkVlPcv5suYfLD0",
  "refresh_expires_at": "2026-11-28T07:35:42.024338894Z",
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
  "command_id": "5c7deaa7-ca55-4544-9af9-9a149ba1e0e0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:42Z",
    "sequence": 1793259342445
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5426fd19-b682-4737-a77d-4a46e2aa1a37",
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
  "last_heartbeat_at": "2026-10-29T07:35:42.46122Z",
  "last_location_at": "2026-10-29T07:35:42.46122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670256157",
  "device_ref": "sandbox-27257"
}
```

```json
{
  "challenge_id": "5cacbe2e-2592-4a9d-8573-2a12fd9d1884",
  "expires_at": "2026-10-29T07:40:42.673465136Z",
  "resend_available_at": "2026-10-29T07:35:43.673465136Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670256157` → **200**

```json
{
  "phone": "+380670256157",
  "audience": "CLIENT",
  "code": "614952",
  "sent_at": "2026-10-29T07:35:42.675390011Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cacbe2e-2592-4a9d-8573-2a12fd9d1884",
  "code": "614952",
  "device_ref": "sandbox-27257"
}
```

```json
{
  "session_id": "950fa080-6d9e-42ce-90bb-42502ceb569c",
  "subject": {
    "type": "CLIENT",
    "id": "665c54c8-fac0-4899-bc7b-0d60b38d9b8f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjVjNTRjOC1mYWMwLTQ4OTktYmM3Yi0wZDYwYjM4ZDliOGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjQyLCJpYXQiOjE3OTMyNTkzNDIsImp0aSI6Ijc3NTI2M2I1LTRiNGMtNGJmNy05Mjk3LWU3YWE5MGIwMDJkMiIsInNpZCI6Ijk1MGZhMDgwLTZkOWUtNDJjZS05MGJiLTQyNTAyY2ViNTY5YyJ9.1i7uldCVTKTpRMD8Znj5thgX1jZEtgzjRg5mRcWf8AI",
  "access_expires_at": "2026-10-29T07:50:42.909853852Z",
  "refresh_token": "IJ2XzJ256q3OypbPvbaFRliR_l9jFnYYiw2HK_V-4DY",
  "refresh_expires_at": "2026-11-28T07:35:42.909435302Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c6a78198-8d50-46cb-b45b-95d2adfa27ee",
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
  "id": "9ea23e71-260e-4a47-a410-8c71b466fa30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:40:43.123050Z",
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
  "command_id": "0ad37486-ef29-4612-b71e-bc7d75e4e873",
  "quote_id": "9ea23e71-260e-4a47-a410-8c71b466fa30",
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
  "id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "665c54c8-fac0-4899-bc7b-0d60b38d9b8f",
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
  "created_at": "2026-10-29T07:35:43.350501Z",
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
    "id": "e305c127-42eb-430d-9ed6-3dc6f572ecbb",
    "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
    "expires_at": "2026-10-29T07:35:58.353088Z",
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

`POST /api/driver/v1/offers/e305c127-42eb-430d-9ed6-3dc6f572ecbb/accept` → **200**

```json
{
  "command_id": "efe4dc59-d053-4108-a8f5-f075f3a45450"
}
```

```json
{
  "id": "a9f36721-b09d-42e6-8ff1-4a5cc0ae6b89",
  "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "73ce3033-a0af-4a8e-9028-e8b150a936cd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "73ce3033-a0af-4a8e-9028-e8b150a936cd",
  "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "assignment_id": "a9f36721-b09d-42e6-8ff1-4a5cc0ae6b89",
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

`POST /api/driver/v1/work-sessions/5426fd19-b682-4737-a77d-4a46e2aa1a37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:44Z",
    "sequence": 1793259344225
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5426fd19-b682-4737-a77d-4a46e2aa1a37",
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
  "last_heartbeat_at": "2026-10-29T07:35:44.241274Z",
  "last_location_at": "2026-10-29T07:35:44.241274Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "73ce3033-a0af-4a8e-9028-e8b150a936cd",
  "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "assignment_id": "a9f36721-b09d-42e6-8ff1-4a5cc0ae6b89",
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

`POST /api/driver/v1/trips/73ce3033-a0af-4a8e-9028-e8b150a936cd/arrive` → **200**

```json
{
  "command_id": "1351a3f7-bcf8-4528-8be5-ccf0890670ec",
  "expected_version": 0
}
```

```json
{
  "id": "73ce3033-a0af-4a8e-9028-e8b150a936cd",
  "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "assignment_id": "a9f36721-b09d-42e6-8ff1-4a5cc0ae6b89",
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
  "arrived_at": "2026-10-29T07:35:44.665568Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/73ce3033-a0af-4a8e-9028-e8b150a936cd/start` → **200**

```json
{
  "command_id": "6c5a084f-d862-497d-8125-1ffd87227895",
  "expected_version": 1
}
```

```json
{
  "id": "73ce3033-a0af-4a8e-9028-e8b150a936cd",
  "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "assignment_id": "a9f36721-b09d-42e6-8ff1-4a5cc0ae6b89",
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
  "arrived_at": "2026-10-29T07:35:44.665568Z",
  "started_at": "2026-10-29T07:35:44.880996Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5426fd19-b682-4737-a77d-4a46e2aa1a37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:45Z",
    "sequence": 1793259345978
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5426fd19-b682-4737-a77d-4a46e2aa1a37",
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
  "last_heartbeat_at": "2026-10-29T07:35:45.113047Z",
  "last_location_at": "2026-10-29T07:35:45.113047Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/73ce3033-a0af-4a8e-9028-e8b150a936cd/complete` → **200**

```json
{
  "command_id": "58f2a68a-7070-46f9-b74b-c9918b12fda5",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:35:45Z",
  "cash_received": true
}
```

```json
{
  "id": "73ce3033-a0af-4a8e-9028-e8b150a936cd",
  "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "assignment_id": "a9f36721-b09d-42e6-8ff1-4a5cc0ae6b89",
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
  "arrived_at": "2026-10-29T07:35:44.665568Z",
  "started_at": "2026-10-29T07:35:44.880996Z",
  "completed_at": "2026-10-29T07:35:45.329975Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/7047fbb6-7b95-4429-bb54-eafc1e870fd7/rating` → **200**

```json
{
  "command_id": "fee49622-2aa8-4a46-afd8-ae82cbee2e60",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "score": 5,
  "created_at": "2026-10-29T07:35:45.562972459Z"
}
```

`POST /api/driver/v1/orders/7047fbb6-7b95-4429-bb54-eafc1e870fd7/rating` → **200**

```json
{
  "command_id": "50d956e3-9669-45de-9586-1ed95aae173c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
  "score": 4,
  "created_at": "2026-10-29T07:35:45.775419923Z"
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
  "session_id": "c6dd4f6c-42d4-4447-b7f0-e6f50d05aa23",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNDYsImlhdCI6MTc5MzI1OTM0NiwianRpIjoiYTYyNWU4ZDItYjY0ZS00MzcyLTg2OGEtMWI4NjU0NTdmN2U4Iiwic2lkIjoiYzZkZDRmNmMtNDJkNC00NDQ3LWI3ZjAtZTZmNTBkMDVhYTIzIn0.PHO-jbCYC6LwrUspOmnwo3pxLfPHi3r8z_FVxqp2bZo",
  "access_expires_at": "2026-10-29T07:50:46.458374465Z",
  "refresh_token": "v1qLzzgpCUuYz6UzZAc-JPtQiJAvaFwkxLUv0hVNyF8",
  "refresh_expires_at": "2026-10-29T19:35:46.45793608Z",
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
  "session_id": "b592ec93-7332-489c-a3d8-3ac1ab16e167",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNDYsImlhdCI6MTc5MzI1OTM0NiwianRpIjoiNzQwNDQ5ZjktNGZlOC00MTdmLTk3MjYtM2M0YjljNjI4NjBhIiwic2lkIjoiYjU5MmVjOTMtNzMzMi00ODljLWEzZDgtM2FjMWFiMTZlMTY3In0.nFHwvmfYVpUizRlP4PkfGMbDW2j3iRabz_Qi6Ohp-z0",
  "access_expires_at": "2026-10-29T07:50:46.931875294Z",
  "refresh_token": "AxhiPGQlgK2efaw3nE1EcWRqUGFgkXJhlY1oxM3cFmM",
  "refresh_expires_at": "2026-10-29T19:35:46.931467754Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7047fbb6-7b95-4429-bb54-eafc1e870fd7/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
      "author_type": "RIDER",
      "author_id": "665c54c8-fac0-4899-bc7b-0d60b38d9b8f",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T07:35:45.562972Z"
    },
    {
      "order_id": "7047fbb6-7b95-4429-bb54-eafc1e870fd7",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "665c54c8-fac0-4899-bc7b-0d60b38d9b8f",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T07:35:45.77542Z"
    }
  ]
}
```

Done: ratings for order 7047fbb6-7b95-4429-bb54-eafc1e870fd7.

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
  "session_id": "1cd87342-cac2-4509-bf50-05af216e01fb",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNDcsImlhdCI6MTc5MzI1OTM0NywianRpIjoiM2U0OGZmY2MtNTM2OC00ODBkLWI5ODMtNTJmZmNjY2JjNTkyIiwic2lkIjoiMWNkODczNDItY2FjMi00NTA5LWJmNTAtMDVhZjIxNmUwMWZiIn0.1KsUd163ZLTrRb2Dq1A6QSOwg-_guI-m7NR1za5BJ2o",
  "access_expires_at": "2026-10-29T07:50:47.636809277Z",
  "refresh_token": "E9vTSRKqrv2vBPkWGXHFEd4kdQhmWLzmmCXLr_MWnMU",
  "refresh_expires_at": "2026-10-29T19:35:47.636236506Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1d9422b5-ab45-4eda-a01c-354b62ddac39",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "5431f8e5-70f2-4333-9ba3-f703e7359aed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:47.860356Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5431f8e5-70f2-4333-9ba3-f703e7359aed` → **200**

```json
{
  "id": "5431f8e5-70f2-4333-9ba3-f703e7359aed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:47.860356Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5431f8e5-70f2-4333-9ba3-f703e7359aed` → **200**

```json
{
  "id": "5431f8e5-70f2-4333-9ba3-f703e7359aed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:47.860356Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5431f8e5-70f2-4333-9ba3-f703e7359aed` → **200**

```json
{
  "id": "5431f8e5-70f2-4333-9ba3-f703e7359aed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:47.860356Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5431f8e5-70f2-4333-9ba3-f703e7359aed` → **200**

```json
{
  "id": "5431f8e5-70f2-4333-9ba3-f703e7359aed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:47.860356Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5431f8e5-70f2-4333-9ba3-f703e7359aed` → **200**

```json
{
  "id": "5431f8e5-70f2-4333-9ba3-f703e7359aed",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:35:47.860356Z",
  "ready_at": "2026-10-29T07:35:52.293621Z",
  "expires_at": "2026-10-30T07:35:52.293621Z"
}
```

`GET /api/admin/v1/reports/exports/5431f8e5-70f2-4333-9ba3-f703e7359aed/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c46f6a2f-3dd1-44c9-b59e-9aab9474ca2c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "6212efe3-2881-45cd-853e-88bfc40a74bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:53.190536Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6212efe3-2881-45cd-853e-88bfc40a74bf` → **200**

```json
{
  "id": "6212efe3-2881-45cd-853e-88bfc40a74bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:53.190536Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6212efe3-2881-45cd-853e-88bfc40a74bf` → **200**

```json
{
  "id": "6212efe3-2881-45cd-853e-88bfc40a74bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:53.190536Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6212efe3-2881-45cd-853e-88bfc40a74bf` → **200**

```json
{
  "id": "6212efe3-2881-45cd-853e-88bfc40a74bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:53.190536Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6212efe3-2881-45cd-853e-88bfc40a74bf` → **200**

```json
{
  "id": "6212efe3-2881-45cd-853e-88bfc40a74bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T07:35:53.190536Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/6212efe3-2881-45cd-853e-88bfc40a74bf` → **200**

```json
{
  "id": "6212efe3-2881-45cd-853e-88bfc40a74bf",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T07:35:53.190536Z",
  "ready_at": "2026-10-29T07:35:57.300581Z",
  "expires_at": "2026-10-30T07:35:57.300581Z"
}
```

`GET /api/admin/v1/reports/exports/6212efe3-2881-45cd-853e-88bfc40a74bf/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4a0bd91f-7056-4f9d-9c7e-390f994a3fe0` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4a0bd91f-7056-4f9d-9c7e-390f994a3fe0",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a5a0375e-e941-4d47-90c6-4fea4ffe7f23"
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
  "device_ref": "sandbox-29186"
}
```

```json
{
  "challenge_id": "842ac3bc-9608-4fc9-9f2b-dfc961a4658c",
  "expires_at": "2026-10-29T07:40:58.756368962Z",
  "resend_available_at": "2026-10-29T07:35:59.756368962Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "753633",
  "sent_at": "2026-10-29T07:35:58.758271723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "842ac3bc-9608-4fc9-9f2b-dfc961a4658c",
  "code": "753633",
  "device_ref": "sandbox-29186"
}
```

```json
{
  "session_id": "94c6fb10-6885-4a78-be97-ee8a6182d54f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI1OCwiaWF0IjoxNzkzMjU5MzU4LCJqdGkiOiI3OGUyZjM2Mi1jMDVmLTRhZGUtYjk0Ny05MjA5ZTJkNGFhOTgiLCJzaWQiOiI5NGM2ZmIxMC02ODg1LTRhNzgtYmU5Ny1lZThhNjE4MmQ1NGYifQ.gL5nD8BzOMkaxvHRJ0QrseUTRMCTV0V1Pa-HxAZ8g7c",
  "access_expires_at": "2026-10-29T07:50:58.994413512Z",
  "refresh_token": "-aYSXhiFYXEskeNXYXy3HQwwRcc0dPFDpjNJXEmPilM",
  "refresh_expires_at": "2026-11-28T07:35:58.993913311Z",
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
  "command_id": "165f82f4-de98-4be7-bf46-7e61e044c99d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:35:59Z",
    "sequence": 1793259359623
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6d1bc6a0-f48c-4fc9-a82c-354e5079e665",
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
  "last_heartbeat_at": "2026-10-29T07:35:59.639278Z",
  "last_location_at": "2026-10-29T07:35:59.639278Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "8170f7ff-fb0e-4226-91d8-9e627ff2c991",
  "points": [
    {
      "sequence": 1793259361860,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:35:01Z"
    },
    {
      "sequence": 1793259361867,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T07:36:01Z"
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
  "session_id": "344f168f-97e1-4c75-a92a-fa4ebde4213e",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNjIsImlhdCI6MTc5MzI1OTM2MiwianRpIjoiYzExMWZkYzMtMDAxMi00MzJiLTk0MGEtMzIxYmVhNDA5MmE5Iiwic2lkIjoiMzQ0ZjE2OGYtOTdlMS00Yzc1LWE5MmEtZmE0ZWJkZTQyMTNlIn0.MBjJQSAEGQEiKuGFrh9iMI8ytPPUEqEb8GcKZxfdHYA",
  "access_expires_at": "2026-10-29T07:51:02.374684701Z",
  "refresh_token": "Glah51hUII1EesB3541LdyTYW3GhAGLst2702nYCtMM",
  "refresh_expires_at": "2026-10-29T19:36:02.374291311Z",
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
      "id": "b6979b27-a4cc-42b0-a7b3-053ecbfe7541",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T07:36:01Z",
        "track_point_id": "a4c1371f-9c01-4265-8a74-bc5b5dfa8298",
        "work_session_id": "6d1bc6a0-f48c-4fc9-a82c-354e5079e665"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T07:36:01Z",
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

`POST /api/admin/v1/driver-risk-flags/b6979b27-a4cc-42b0-a7b3-053ecbfe7541/confirm` → **200**

```json
{
  "command_id": "81cf65b5-1c4a-4776-8ddd-5015709dbf32",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "b6979b27-a4cc-42b0-a7b3-053ecbfe7541",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T07:36:01Z",
    "track_point_id": "a4c1371f-9c01-4265-8a74-bc5b5dfa8298",
    "work_session_id": "6d1bc6a0-f48c-4fc9-a82c-354e5079e665"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T07:36:01Z",
  "reason": null,
  "reviewed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reviewed_at": "2026-10-29T07:36:04.30351Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/b6979b27-a4cc-42b0-a7b3-053ecbfe7541/dismiss` → **409**

```json
{
  "command_id": "8ef5f336-de64-459e-9d83-2154286fc414",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/b6979b27-a4cc-42b0-a7b3-053ecbfe7541/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ad5c9f97-4b26-4e03-a60e-5f90d237ee35"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c62b760f-c9c5-4b40-88b5-b2754b6fb2c5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "7396ce67-2cb6-4b11-b9b3-1ba972536333",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "raised_at": "2026-10-29T07:36:04.766475Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/7396ce67-2cb6-4b11-b9b3-1ba972536333/dismiss` → **200**

```json
{
  "command_id": "674febb0-652b-4acc-866e-f440b3d1713e",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "7396ce67-2cb6-4b11-b9b3-1ba972536333",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "raised_at": "2026-10-29T07:36:04.766475Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reviewed_at": "2026-10-29T07:36:04.989683Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "137ca40d-e3b2-44a4-b7ff-43d31773b437",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "b6979b27-a4cc-42b0-a7b3-053ecbfe7541"
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
      "actor_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:36:05.216838Z"
    }
  ]
}
```

Done: flag b6979b27-a4cc-42b0-a7b3-053ecbfe7541 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "122ae34d-0e13-44de-b6de-506c9ae8ca9c",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNjUsImlhdCI6MTc5MzI1OTM2NSwianRpIjoiZDNmYmNkMGUtZWQ5OS00ZDZlLWEzNzQtNjUxMjBhN2ZkMTViIiwic2lkIjoiMTIyYWUzNGQtMGUxMy00NGRlLWI2ZGUtNTA2YzlhZThjYTljIn0.SfgARuXQ3GoggXUjoUGnrHbpAEvpE6phx84vNSSGU3w",
  "access_expires_at": "2026-10-29T07:51:05.903414599Z",
  "refresh_token": "H1h-z7dz2nR7yKRY1ARsqlgHvrAlgX_zA2x2wHM6GSc",
  "refresh_expires_at": "2026-10-29T19:36:05.903004577Z",
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
      "actor_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:36:05.216838Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "3395a5b3-d627-4a1f-84df-f69692f23e1c",
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
  "session_id": "6d1bc6a0-f48c-4fc9-a82c-354e5079e665",
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
  "last_heartbeat_at": "2026-10-29T07:35:59.639278Z",
  "last_location_at": "2026-10-29T07:35:59.639278Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6d1bc6a0-f48c-4fc9-a82c-354e5079e665/close` → **200**

```json
{
  "command_id": "96fb281b-991e-4e22-854c-a4c8acb43e78",
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
  "session_id": "6ed58ebc-2023-47fd-91c3-e7f45f2924e0",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNjcsImlhdCI6MTc5MzI1OTM2NywianRpIjoiYjY2ODFhMzItMjNlYy00YWE2LTg0YTgtZTgwMTE1ZTlhMTM1Iiwic2lkIjoiNmVkNThlYmMtMjAyMy00N2ZkLTkxYzMtZTdmNDVmMjkyNGUwIn0.4Zpp3aVzjiQkPvs_frDJCH8n2oIwTC7ZYKeRKyC-4MI",
  "access_expires_at": "2026-10-29T07:51:07.258928735Z",
  "refresh_token": "pfH-TcyTYStHKc_Mm7TXArMM8omK502-gTzfH5OCIZc",
  "refresh_expires_at": "2026-10-29T19:36:07.258487747Z",
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
  "command_id": "9ab9f6ce-e1d8-492c-b650-288a3f0cf588",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:36:07.695786Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "9ab9f6ce-e1d8-492c-b650-288a3f0cf588",
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
  "changed_by": "ca349082-99eb-4d76-baa2-a610d81cb572",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T07:36:07.695786Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48957277247",
  "device_ref": "sandbox-7400"
}
```

```json
{
  "challenge_id": "fe833504-d48c-428e-8373-34124990e525",
  "expires_at": "2026-10-29T07:41:08.139425868Z",
  "resend_available_at": "2026-10-29T07:36:09.139425868Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48957277247` → **200**

```json
{
  "phone": "+48957277247",
  "audience": "CLIENT",
  "code": "292040",
  "sent_at": "2026-10-29T07:36:08.141734519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe833504-d48c-428e-8373-34124990e525",
  "code": "292040",
  "device_ref": "sandbox-7400"
}
```

```json
{
  "session_id": "55e634fc-9ad1-44d7-b5b1-e25468124f8c",
  "subject": {
    "type": "CLIENT",
    "id": "2a97c207-ca03-4683-b48a-c4ff39fa887a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTk3YzIwNy1jYTAzLTQ2ODMtYjQ4YS1jNGZmMzlmYTg4N2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjY4LCJpYXQiOjE3OTMyNTkzNjgsImp0aSI6IjcyNzQzNTFiLTExMTMtNGZiYy1iNzE0LWNkYTcxMzZlMjhjMiIsInNpZCI6IjU1ZTYzNGZjLTlhZDEtNDRkNy1iNWIxLWUyNTQ2ODEyNGY4YyJ9.KFYK0VgD4QtJnwnj1Znm7NH1cXduTHhaP9D9ASPCJd4",
  "access_expires_at": "2026-10-29T07:51:08.373448512Z",
  "refresh_token": "yRKf5ej53nSug6GBD4pWPN3iw90mBBXzsKa3CpzIFsc",
  "refresh_expires_at": "2026-11-28T07:36:08.372898612Z",
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
  "correlation_id": "b0d305a2-c98e-4c10-9481-59112d8bd989"
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
  "device_ref": "sandbox-23292"
}
```

```json
{
  "challenge_id": "e6f2f43d-9b7a-42e1-bbf8-7c9c4fcda1ab",
  "expires_at": "2026-10-29T07:41:09.039542517Z",
  "resend_available_at": "2026-10-29T07:36:10.039542517Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "933495",
  "sent_at": "2026-10-29T07:36:09.041316124Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6f2f43d-9b7a-42e1-bbf8-7c9c4fcda1ab",
  "code": "933495",
  "device_ref": "sandbox-23292"
}
```

```json
{
  "session_id": "4a1fb18a-dfd9-453f-aba4-f5addbd5d35b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI2OSwiaWF0IjoxNzkzMjU5MzY5LCJqdGkiOiI2ODFjM2MyZC1iNmFhLTQ1NDQtOTEzMi01NDA4ODAxMDM2ODQiLCJzaWQiOiI0YTFmYjE4YS1kZmQ5LTQ1M2YtYWJhNC1mNWFkZGJkNWQzNWIifQ.kAUYxLA2PE-DElhkGfjFv-l9lNnKZh8RBRbM7e68DXY",
  "access_expires_at": "2026-10-29T07:51:09.273149321Z",
  "refresh_token": "UEi6R_-JGtP92y05KQGNqAvpqgORfb-G3n7IpHdgWc4",
  "refresh_expires_at": "2026-11-28T07:36:09.272705764Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e538ad36-fa08-4b65-b872-e6fb54f25868",
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
  "last_heartbeat_at": "2026-10-29T07:35:39.579407Z",
  "last_location_at": "2026-10-29T07:35:39.579407Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e538ad36-fa08-4b65-b872-e6fb54f25868/handover` → **200**

```json
{
  "command_id": "1c1a6944-a1fd-4c0d-ae33-ea88ff854be0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e538ad36-fa08-4b65-b872-e6fb54f25868",
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
  "last_heartbeat_at": "2026-10-29T07:35:39.579407Z",
  "last_location_at": "2026-10-29T07:35:39.579407Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e538ad36-fa08-4b65-b872-e6fb54f25868/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:36:09Z",
    "sequence": 1793259369911
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e538ad36-fa08-4b65-b872-e6fb54f25868",
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
  "last_heartbeat_at": "2026-10-29T07:36:09.92663Z",
  "last_location_at": "2026-10-29T07:36:09.92663Z",
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
  "session_id": "e538ad36-fa08-4b65-b872-e6fb54f25868",
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
  "last_heartbeat_at": "2026-10-29T07:36:09.92663Z",
  "last_location_at": "2026-10-29T07:36:09.92663Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e538ad36-fa08-4b65-b872-e6fb54f25868/close` → **200**

```json
{
  "command_id": "cfc8112e-65c9-4e4d-ae9e-985024298a6d",
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
  "correlation_id": "eddb1971-8642-4878-9479-bf49a01e1667"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673883415",
  "device_ref": "sandbox-14929"
}
```

```json
{
  "challenge_id": "3e874552-35b4-48a6-b26b-0900fb0ccee3",
  "expires_at": "2026-10-29T07:41:11.020731135Z",
  "resend_available_at": "2026-10-29T07:36:12.020731135Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673883415` → **200**

```json
{
  "phone": "+380673883415",
  "audience": "CLIENT",
  "code": "613926",
  "sent_at": "2026-10-29T07:36:11.022461021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e874552-35b4-48a6-b26b-0900fb0ccee3",
  "code": "613926",
  "device_ref": "sandbox-14929"
}
```

```json
{
  "session_id": "7bd6b282-3b01-429c-ac31-c6bb78af0024",
  "subject": {
    "type": "CLIENT",
    "id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjUxMDViMy1mYTk4LTQ1NmUtYjFmMi04NWU3OGFiOWI2ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjcxLCJpYXQiOjE3OTMyNTkzNzEsImp0aSI6IjAwYjhiOGNjLTVmNzItNDZjNS05OTEwLTJkYTZkODkzZDRlYyIsInNpZCI6IjdiZDZiMjgyLTNiMDEtNDI5Yy1hYzMxLWM2YmI3OGFmMDAyNCJ9.h0VfVE5LhZVF5OZAEwl4vmDyNTOcOqRIsem1xshiB2M",
  "access_expires_at": "2026-10-29T07:51:11.253631815Z",
  "refresh_token": "XcoQbxNNT04C5CPFiKKQjUXnttnxRjck-hteygjumVo",
  "refresh_expires_at": "2026-11-28T07:36:11.253194023Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "6d6f83eb-81d2-40a8-b1df-ceb31f18f519",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "8b509807-9c76-433e-aa8e-152dfd0c8ca2",
  "upload_path": "/api/rider/v1/uploads/8b509807-9c76-433e-aa8e-152dfd0c8ca2",
  "expires_at": "2026-10-29T07:51:11.474371697Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/8b509807-9c76-433e-aa8e-152dfd0c8ca2` → **200**

```json
{
  "file_id": "8b509807-9c76-433e-aa8e-152dfd0c8ca2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "e8cf588c-f9f5-4a2d-84ee-db70a7c3d622",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "8b509807-9c76-433e-aa8e-152dfd0c8ca2"
  ]
}
```

```json
{
  "id": "abe7cd10-261e-490f-bdad-eac7264ca479",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:36:11.724788Z",
  "updated_at": "2026-10-29T07:36:11.724788Z",
  "respond_by": "2026-10-29T11:36:11.724788Z",
  "messages": [
    {
      "id": "fde07579-444c-48bd-ae4d-49b3afd281a4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:36:11.725705Z",
      "attachments": [
        {
          "file_id": "8b509807-9c76-433e-aa8e-152dfd0c8ca2",
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
  "session_id": "019b5605-cb2a-4a48-87b1-9501b5e94643",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNzIsImlhdCI6MTc5MzI1OTM3MiwianRpIjoiMDc1MTNiZDUtODhjZS00MDI0LTlmOTMtYmYzMGE5OTM4MWI4Iiwic2lkIjoiMDE5YjU2MDUtY2IyYS00YTQ4LTg3YjEtOTUwMWI1ZTk0NjQzIn0.CPnlYNeMpCOB86iRMRcBENenRhL3Z002WGgawBVTpv0",
  "access_expires_at": "2026-10-29T07:51:12.216417468Z",
  "refresh_token": "99SXnadr7mVH2ABOsCAGqLuBGYx0wNuMkl9buflTlW8",
  "refresh_expires_at": "2026-10-29T19:36:12.215980266Z",
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
  "session_id": "38a5c6a8-d2a9-409f-9ec0-6653101f7a8c",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNzIsImlhdCI6MTc5MzI1OTM3MiwianRpIjoiYzg0ZjRjNWYtNzkxMy00OTU1LThiYjYtMDc1ZjExMmM3MThmIiwic2lkIjoiMzhhNWM2YTgtZDJhOS00MDlmLTllYzAtNjY1MzEwMWY3YThjIn0.Cyb2DdyrrJL4HGNa5XWKgA7dL5mEpoeq9seRS7zX5Mk",
  "access_expires_at": "2026-10-29T07:51:12.685268388Z",
  "refresh_token": "8Wk_3kzq3OlCGrsm3Ymd_gsJYUVwmY-EPzm-PwqbixA",
  "refresh_expires_at": "2026-10-29T19:36:12.684818857Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/abe7cd10-261e-490f-bdad-eac7264ca479/attachments/8b509807-9c76-433e-aa8e-152dfd0c8ca2` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "5015dc75-22db-4e7b-ab03-43cad103afc9",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5c50a826-c07e-423c-a537-58926c267f74",
  "upload_path": "/api/operator/v1/uploads/5c50a826-c07e-423c-a537-58926c267f74",
  "expires_at": "2026-10-29T07:51:12.916336456Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5c50a826-c07e-423c-a537-58926c267f74` → **200**

```json
{
  "file_id": "5c50a826-c07e-423c-a537-58926c267f74",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/abe7cd10-261e-490f-bdad-eac7264ca479` → **200**

```json
{
  "id": "abe7cd10-261e-490f-bdad-eac7264ca479",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T07:36:11.724788Z",
  "updated_at": "2026-10-29T07:36:11.724788Z",
  "respond_by": "2026-10-29T11:36:11.724788Z",
  "messages": [
    {
      "id": "fde07579-444c-48bd-ae4d-49b3afd281a4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:36:11.725705Z",
      "attachments": [
        {
          "file_id": "8b509807-9c76-433e-aa8e-152dfd0c8ca2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/abe7cd10-261e-490f-bdad-eac7264ca479/comments` → **200**

```json
{
  "command_id": "4614a6c0-4971-46f8-923d-4346764b02f4",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5c50a826-c07e-423c-a537-58926c267f74"
  ]
}
```

```json
{
  "id": "abe7cd10-261e-490f-bdad-eac7264ca479",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:36:11.724788Z",
  "updated_at": "2026-10-29T07:36:13.378454Z",
  "respond_by": "2026-10-29T11:36:11.724788Z",
  "messages": [
    {
      "id": "fde07579-444c-48bd-ae4d-49b3afd281a4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:36:11.725705Z",
      "attachments": [
        {
          "file_id": "8b509807-9c76-433e-aa8e-152dfd0c8ca2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ee0090e1-a694-42cd-9e10-3ce9785fc834",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:36:13.378007Z",
      "attachments": [
        {
          "file_id": "5c50a826-c07e-423c-a537-58926c267f74",
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

`GET /api/rider/v1/support/cases/abe7cd10-261e-490f-bdad-eac7264ca479` → **200**

```json
{
  "id": "abe7cd10-261e-490f-bdad-eac7264ca479",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T07:36:11.724788Z",
  "updated_at": "2026-10-29T07:36:13.378454Z",
  "respond_by": "2026-10-29T11:36:11.724788Z",
  "messages": [
    {
      "id": "fde07579-444c-48bd-ae4d-49b3afd281a4",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3f5105b3-fa98-456e-b1f2-85e78ab9b6d6",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T07:36:11.725705Z",
      "attachments": [
        {
          "file_id": "8b509807-9c76-433e-aa8e-152dfd0c8ca2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "ee0090e1-a694-42cd-9e10-3ce9785fc834",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T07:36:13.378007Z",
      "attachments": [
        {
          "file_id": "5c50a826-c07e-423c-a537-58926c267f74",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/abe7cd10-261e-490f-bdad-eac7264ca479/attachments/5c50a826-c07e-423c-a537-58926c267f74` → **200**

Done: support case abe7cd10-261e-490f-bdad-eac7264ca479, rider attachment 8b509807-9c76-433e-aa8e-152dfd0c8ca2, operator attachment 5c50a826-c07e-423c-a537-58926c267f74.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732718166",
  "device_ref": "sandbox-29817"
}
```

```json
{
  "challenge_id": "e3d25fb7-3236-447d-8cb7-55431de0b55e",
  "expires_at": "2026-10-29T07:41:13.863234746Z",
  "resend_available_at": "2026-10-29T07:36:14.863234746Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732718166` → **200**

```json
{
  "phone": "+380732718166",
  "audience": "CLIENT",
  "code": "016921",
  "sent_at": "2026-10-29T07:36:13.865118896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3d25fb7-3236-447d-8cb7-55431de0b55e",
  "code": "016921",
  "device_ref": "sandbox-29817"
}
```

```json
{
  "session_id": "eba79a5a-a3e8-406e-bde1-1941412c0ce0",
  "subject": {
    "type": "CLIENT",
    "id": "f0df2365-fb6f-45bf-bfd8-ffef5938bc0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGRmMjM2NS1mYjZmLTQ1YmYtYmZkOC1mZmVmNTkzOGJjMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjc0LCJpYXQiOjE3OTMyNTkzNzQsImp0aSI6IjA5ZDZmOWFiLTc4NWEtNDQ1MC1hMGEyLTRlOWI1NzEzNjAyMyIsInNpZCI6ImViYTc5YTVhLWEzZTgtNDA2ZS1iZGUxLTE5NDE0MTJjMGNlMCJ9._y-dm8eos02Zj_B_UW8p1VFVHZ1OUPDqwH4GqSMe08k",
  "access_expires_at": "2026-10-29T07:51:14.103329109Z",
  "refresh_token": "QY6xDykiMscSqVhjaLL48l1V0KFKTbcbpzge607wv34",
  "refresh_expires_at": "2026-11-28T07:36:14.102943793Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "957d2fdb-ede6-4173-9215-1500ac84e0ab",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "01ae67a1-6b59-4a1e-9f3c-52c0e624a667",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-01ae67a1-6b59-4a1e-9f3c-52c0e624a667",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "5ac7148ff186d7ae3f2f216339044a79",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=01ae67a1-6b59-4a1e-9f3c-52c0e624a667",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732718166"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=01ae67a1-6b59-4a1e-9f3c-52c0e624a667",
  "expires_at": "2026-10-29T08:06:14.317953Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/01ae67a1-6b59-4a1e-9f3c-52c0e624a667` → **200**

```json
{
  "id": "01ae67a1-6b59-4a1e-9f3c-52c0e624a667",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T08:06:14.317953Z",
  "card": {
    "id": "b93ca83c-46b2-4cb6-ba55-8fa7e0ef4a42",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0554",
    "card_type": "Visa",
    "created_at": "2026-10-29T07:36:14.537104Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "65d17e4b-12b6-454d-b7e0-42f2f75abda7",
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
  "id": "37d4d832-01a8-435c-b230-c61e20e8c2ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:14.771403Z",
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
  "command_id": "df3db84b-82af-4a6d-9aa4-2abbc042a359",
  "quote_id": "37d4d832-01a8-435c-b230-c61e20e8c2ff",
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
  "id": "b4a2b360-db4c-4de3-a4f9-aeddeefe50cf",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f0df2365-fb6f-45bf-bfd8-ffef5938bc0e",
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
  "created_at": "2026-10-29T07:36:14.993751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b4a2b360-db4c-4de3-a4f9-aeddeefe50cf` → **200**

```json
{
  "id": "b4a2b360-db4c-4de3-a4f9-aeddeefe50cf",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f0df2365-fb6f-45bf-bfd8-ffef5938bc0e",
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
  "created_at": "2026-10-29T07:36:14.993751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b4a2b360-db4c-4de3-a4f9-aeddeefe50cf` → **200**

```json
{
  "id": "b4a2b360-db4c-4de3-a4f9-aeddeefe50cf",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f0df2365-fb6f-45bf-bfd8-ffef5938bc0e",
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
  "created_at": "2026-10-29T07:36:14.993751Z",
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

`GET /api/rider/v1/orders/b4a2b360-db4c-4de3-a4f9-aeddeefe50cf` → **200**

```json
{
  "id": "b4a2b360-db4c-4de3-a4f9-aeddeefe50cf",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f0df2365-fb6f-45bf-bfd8-ffef5938bc0e",
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
  "created_at": "2026-10-29T07:36:14.993751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b4a2b360-db4c-4de3-a4f9-aeddeefe50cf/switch-to-cash` → **200**

```json
{
  "command_id": "c025e912-1a96-43ae-a865-1c68b0cd8cda",
  "expected_version": 3
}
```

```json
{
  "id": "b4a2b360-db4c-4de3-a4f9-aeddeefe50cf",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "f0df2365-fb6f-45bf-bfd8-ffef5938bc0e",
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
  "created_at": "2026-10-29T07:36:14.993751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b4a2b360-db4c-4de3-a4f9-aeddeefe50cf/switch-to-cash` → **409**

```json
{
  "command_id": "99c58193-eeb3-4da6-9483-60a6fa766221",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/b4a2b360-db4c-4de3-a4f9-aeddeefe50cf/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "53ce578b-4a34-4597-8c2b-8b34287abab0"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/b4a2b360-db4c-4de3-a4f9-aeddeefe50cf` → **200**

```json
{
  "id": "b4a2b360-db4c-4de3-a4f9-aeddeefe50cf",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "f0df2365-fb6f-45bf-bfd8-ffef5938bc0e",
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
  "created_at": "2026-10-29T07:36:14.993751Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b4a2b360-db4c-4de3-a4f9-aeddeefe50cf/cancel` → **200**

```json
{
  "command_id": "41fe0ec3-9303-4eb3-9829-b4e2305358f2",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b4a2b360-db4c-4de3-a4f9-aeddeefe50cf",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f0df2365-fb6f-45bf-bfd8-ffef5938bc0e",
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
  "created_at": "2026-10-29T07:36:14.993751Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
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
  "session_id": "0fcf93b0-835d-4a41-b0eb-46c5f06249e6",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyNzgsImlhdCI6MTc5MzI1OTM3OCwianRpIjoiMzAyMzZkNWItMmQyNC00MDM4LWE0ZGEtZjMxMWVhMzQ5OTQ0Iiwic2lkIjoiMGZjZjkzYjAtODM1ZC00YTQxLWIwZWItNDZjNWYwNjI0OWU2In0.B2yMcfR3Oo7VBumOKKYMbntyjZIdlaHeGe9mefhvL14",
  "access_expires_at": "2026-10-29T07:51:18.082059776Z",
  "refresh_token": "HaP0RFE_0LBudBIxnZR_wRpRHwHGXSogTsN2NJT37UA",
  "refresh_expires_at": "2026-10-29T19:36:18.081651744Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-20255"
}
```

```json
{
  "challenge_id": "cd4cc0d6-f233-4d32-a5f7-eb24cfd29823",
  "expires_at": "2026-10-29T07:41:18.294044019Z",
  "resend_available_at": "2026-10-29T07:36:19.294044019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "752898",
  "sent_at": "2026-10-29T07:36:18.295837283Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd4cc0d6-f233-4d32-a5f7-eb24cfd29823",
  "code": "752898",
  "device_ref": "sandbox-20255"
}
```

```json
{
  "session_id": "f8793f7f-ea22-48ae-a594-78b1c3d592b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI3OCwiaWF0IjoxNzkzMjU5Mzc4LCJqdGkiOiI5MTRjZWMzZS03MDQ3LTQ4ODYtYjQ4NC1lNDZjZmNiOTNkNTYiLCJzaWQiOiJmODc5M2Y3Zi1lYTIyLTQ4YWUtYTU5NC03OGIxYzNkNTkyYjMifQ.w9gZHevii8FZ32IDPb-3CQlwRMvuzW34EOJw_yZkSJY",
  "access_expires_at": "2026-10-29T07:51:18.531814903Z",
  "refresh_token": "5o_Q5y4hvhuPcG294qfUCoZvftwWrU1g9svxBIA8wEc",
  "refresh_expires_at": "2026-11-28T07:36:18.531441012Z",
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
      "actor_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T07:36:05.216838Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "ca349082-99eb-4d76-baa2-a610d81cb572",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T07:36:06.342825Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "71f4cc40-af7d-408a-8c62-3095796d28bd",
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
  "device_ref": "sandbox-25997"
}
```

```json
{
  "challenge_id": "76a499fc-04a5-4193-b630-64281875e31e",
  "expires_at": "2026-10-29T07:41:19.405722749Z",
  "resend_available_at": "2026-10-29T07:36:20.405722749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "405216",
  "sent_at": "2026-10-29T07:36:19.407880891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76a499fc-04a5-4193-b630-64281875e31e",
  "code": "405216",
  "device_ref": "sandbox-25997"
}
```

```json
{
  "session_id": "d7e10988-3369-463e-a23c-5b87109066ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI3OSwiaWF0IjoxNzkzMjU5Mzc5LCJqdGkiOiJlMTk0ZWMzNC04YjUzLTRmNjUtOGQ4Yi1mYmQxNjVkNDRhOWUiLCJzaWQiOiJkN2UxMDk4OC0zMzY5LTQ2M2UtYTIzYy01Yjg3MTA5MDY2Y2EifQ.v0JEL2nxsWuqRpqtf6VDNO8YWoXiXzkvRSOUaocN55U",
  "access_expires_at": "2026-10-29T07:51:19.643796826Z",
  "refresh_token": "1pidFHAWLrKnVyJEHRj8myUENYaSyvxsVt9RxmPMmbY",
  "refresh_expires_at": "2026-11-28T07:36:19.643414875Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5426fd19-b682-4737-a77d-4a46e2aa1a37",
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
  "last_heartbeat_at": "2026-10-29T07:35:45.113047Z",
  "last_location_at": "2026-10-29T07:35:45.113047Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5426fd19-b682-4737-a77d-4a46e2aa1a37/handover` → **200**

```json
{
  "command_id": "4203427a-d974-4169-9723-152371bc227d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5426fd19-b682-4737-a77d-4a46e2aa1a37",
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
  "last_heartbeat_at": "2026-10-29T07:35:45.113047Z",
  "last_location_at": "2026-10-29T07:35:45.113047Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5426fd19-b682-4737-a77d-4a46e2aa1a37/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:36:20Z",
    "sequence": 1793259380293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5426fd19-b682-4737-a77d-4a46e2aa1a37",
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
  "last_heartbeat_at": "2026-10-29T07:36:20.308705Z",
  "last_location_at": "2026-10-29T07:36:20.308705Z",
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
  "command_id": "416be1fd-14a2-491e-8a1e-40f633e7a1ee",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:36:20Z",
    "sequence": 1793259380722
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a8b64b2f-d260-4a77-aa82-8ad5aacd0522",
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
  "last_heartbeat_at": "2026-10-29T07:36:20.738738Z",
  "last_location_at": "2026-10-29T07:36:20.738738Z",
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
  "session_id": "f72acce1-178c-4ba6-990d-28a950b3b82f",
  "subject": {
    "type": "STAFF",
    "id": "ca349082-99eb-4d76-baa2-a610d81cb572"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTM0OTA4Mi05OWViLTRkNzYtYmFhMi1hNjEwZDgxY2I1NzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjAyODEsImlhdCI6MTc5MzI1OTM4MSwianRpIjoiMzViZmQyNGQtZTFhYy00YmY2LTgwOGItZWUzNGU2NDdkMjUwIiwic2lkIjoiZjcyYWNjZTEtMTc4Yy00YmE2LTk5MGQtMjhhOTUwYjNiODJmIn0.9AoXSaKx6z6x5ETwaamsab7dwhI4Mrr0ZuiW_xd4ESg",
  "access_expires_at": "2026-10-29T07:51:21.215426946Z",
  "refresh_token": "KH2r_9Qkm2vm-u7wj02RGHWKXTRGayLhWUM-DkHGh68",
  "refresh_expires_at": "2026-10-29T19:36:21.215005577Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c8278768-7c20-42db-a03d-eb03ff8af4b2",
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
  "id": "7f5ecad0-d8fe-4b96-84a5-11fe14528ccf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:21.426832Z",
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
  "command_id": "f0435279-0dea-436f-957e-a4d91c83913a",
  "quote_id": "7f5ecad0-d8fe-4b96-84a5-11fe14528ccf",
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
  "id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
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
  "created_at": "2026-10-29T07:36:21.643522Z",
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
    "id": "a2c9851c-753a-41c5-9857-7f66efeef487",
    "order_id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
    "expires_at": "2026-10-29T07:36:36.646362Z",
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

`POST /api/driver/v1/offers/a2c9851c-753a-41c5-9857-7f66efeef487/accept` → **200**

```json
{
  "command_id": "79700783-85f7-452f-b94e-8e334623f3c5"
}
```

```json
{
  "id": "b21faeba-ccea-4510-b4f8-193641ad7573",
  "order_id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "56859992-0c8d-445a-a792-1f417da708db",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56859992-0c8d-445a-a792-1f417da708db",
  "order_id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
  "assignment_id": "b21faeba-ccea-4510-b4f8-193641ad7573",
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

`POST /api/driver/v1/work-sessions/a8b64b2f-d260-4a77-aa82-8ad5aacd0522/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T07:36:22Z",
    "sequence": 1793259382713
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a8b64b2f-d260-4a77-aa82-8ad5aacd0522",
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
  "last_heartbeat_at": "2026-10-29T07:36:22.728569Z",
  "last_location_at": "2026-10-29T07:36:22.728569Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/56859992-0c8d-445a-a792-1f417da708db/arrive` → **200**

```json
{
  "command_id": "2c349291-bb30-4ea4-9c25-65fdc9263d9f",
  "expected_version": 0
}
```

```json
{
  "id": "56859992-0c8d-445a-a792-1f417da708db",
  "order_id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
  "assignment_id": "b21faeba-ccea-4510-b4f8-193641ad7573",
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
  "arrived_at": "2026-10-29T07:36:22.94887Z",
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

`POST /api/driver/v1/trips/56859992-0c8d-445a-a792-1f417da708db/start` → **200**

```json
{
  "command_id": "cbcca3b1-2bec-4aaa-ab84-d22d4789ab56",
  "expected_version": 1
}
```

```json
{
  "id": "56859992-0c8d-445a-a792-1f417da708db",
  "order_id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
  "assignment_id": "b21faeba-ccea-4510-b4f8-193641ad7573",
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
  "arrived_at": "2026-10-29T07:36:22.94887Z",
  "started_at": "2026-10-29T07:36:23.171964Z",
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

`POST /api/driver/v1/trips/56859992-0c8d-445a-a792-1f417da708db/complete` → **200**

```json
{
  "command_id": "10aacec8-5bea-46b0-964f-77a95c7d5195",
  "expected_version": 2,
  "reported_at": "2026-10-29T07:36:23Z",
  "cash_received": true
}
```

```json
{
  "id": "56859992-0c8d-445a-a792-1f417da708db",
  "order_id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
  "assignment_id": "b21faeba-ccea-4510-b4f8-193641ad7573",
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
  "arrived_at": "2026-10-29T07:36:22.94887Z",
  "started_at": "2026-10-29T07:36:23.171964Z",
  "completed_at": "2026-10-29T07:36:23.396033Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/226ba6db-dfac-4554-becc-0a5aabc5e172` → **200**

```json
{
  "id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
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
    "id": "b21faeba-ccea-4510-b4f8-193641ad7573",
    "order_id": "226ba6db-dfac-4554-becc-0a5aabc5e172",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "56859992-0c8d-445a-a792-1f417da708db",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T07:36:21.643522Z",
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
  "session_id": "5426fd19-b682-4737-a77d-4a46e2aa1a37",
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
  "last_heartbeat_at": "2026-10-29T07:36:20.308705Z",
  "last_location_at": "2026-10-29T07:36:20.308705Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5426fd19-b682-4737-a77d-4a46e2aa1a37/close` → **200**

```json
{
  "command_id": "b958c021-8aa6-404a-90d0-6e7dabfbf791",
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
  "session_id": "a8b64b2f-d260-4a77-aa82-8ad5aacd0522",
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
  "last_heartbeat_at": "2026-10-29T07:36:22.728569Z",
  "last_location_at": "2026-10-29T07:36:22.728569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8b64b2f-d260-4a77-aa82-8ad5aacd0522/close` → **200**

```json
{
  "command_id": "bd637a08-b469-4c0b-88b6-2b6937814b54",
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

Done: terminal order 226ba6db-dfac-4554-becc-0a5aabc5e172 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29221"
}
```

```json
{
  "challenge_id": "750406a1-12ac-4ba3-b003-638e2e85b3dc",
  "expires_at": "2026-10-29T07:41:27.946591891Z",
  "resend_available_at": "2026-10-29T07:36:28.946591891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "170665",
  "sent_at": "2026-10-29T07:36:27.948724858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "750406a1-12ac-4ba3-b003-638e2e85b3dc",
  "code": "170665",
  "device_ref": "sandbox-29221"
}
```

```json
{
  "session_id": "3fbcb84b-1b16-41c0-b033-1c4d066e0d21",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI4OCwiaWF0IjoxNzkzMjU5Mzg4LCJqdGkiOiI1M2Q4ZTNkNi05YjFjLTQ2ZWUtYWNmZC1jOTI3OTUxMmI2ZGUiLCJzaWQiOiIzZmJjYjg0Yi0xYjE2LTQxYzAtYjAzMy0xYzRkMDY2ZTBkMjEifQ.DOwtCPZajnxc-sYIqcpSs_UqUANDigh-tT5V6728Ixg",
  "access_expires_at": "2026-10-29T07:51:28.187773513Z",
  "refresh_token": "-wbnDp_Rq5Kw9NAXcYENyGURpKTppIxAWUs53jNiAHM",
  "refresh_expires_at": "2026-11-28T07:36:28.187308939Z",
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
  "device_ref": "sandbox-10198"
}
```

```json
{
  "challenge_id": "87b42350-cfb8-4280-8c67-2a33b25a3541",
  "expires_at": "2026-10-29T07:41:28.616626919Z",
  "resend_available_at": "2026-10-29T07:36:29.616626919Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "550840",
  "sent_at": "2026-10-29T07:36:28.618412389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87b42350-cfb8-4280-8c67-2a33b25a3541",
  "code": "550840",
  "device_ref": "sandbox-10198"
}
```

```json
{
  "session_id": "5964153e-1831-41bc-8003-66f757c4d1a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI4OCwiaWF0IjoxNzkzMjU5Mzg4LCJqdGkiOiJiZTkyNjkxMC1hNjFlLTQzMzItOTY0Yy1jMGI0OGEwYzFkNDgiLCJzaWQiOiI1OTY0MTUzZS0xODMxLTQxYmMtODAwMy02NmY3NTdjNGQxYTIifQ.wHMc4fKthrKSIy_1xYrzEBsIZE8B4rgsh3pBvBkdrQo",
  "access_expires_at": "2026-10-29T07:51:28.86275153Z",
  "refresh_token": "bqcOrWfS7xN_HY01-SkOoo9-JgaiRrJClQJ7N_oqBgo",
  "refresh_expires_at": "2026-11-28T07:36:28.862251369Z",
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
  "device_ref": "sandbox-13628"
}
```

```json
{
  "challenge_id": "afc7c481-d595-46d6-abc5-bc23ef0bc831",
  "expires_at": "2026-10-29T07:41:29.280102077Z",
  "resend_available_at": "2026-10-29T07:36:30.280102077Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "926140",
  "sent_at": "2026-10-29T07:36:29.282016778Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "afc7c481-d595-46d6-abc5-bc23ef0bc831",
  "code": "926140",
  "device_ref": "sandbox-13628"
}
```

```json
{
  "session_id": "32c0d717-29dd-4a13-9bdf-3476c3038a90",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2MDI4OSwiaWF0IjoxNzkzMjU5Mzg5LCJqdGkiOiI0Mjk2NTFjMy02YzAzLTRmNTgtOTgxYS04YjUxYWZlZmFjZWYiLCJzaWQiOiIzMmMwZDcxNy0yOWRkLTRhMTMtOWJkZi0zNDc2YzMwMzhhOTAifQ.8IZtPrCxSP-9S1dzKGbZmaIuezvBxN4B-Xq_Xo4ignQ",
  "access_expires_at": "2026-10-29T07:51:29.51703558Z",
  "refresh_token": "HIenGpUR73uJe6A11hMaDt34Yb422MCSZsEQhhlGAM4",
  "refresh_expires_at": "2026-11-28T07:36:29.516597325Z",
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
  "phone": "+380699246313",
  "device_ref": "sandbox-11697"
}
```

```json
{
  "challenge_id": "771527bb-73ec-42e2-b882-8668753772a6",
  "expires_at": "2026-10-29T07:41:29.943281344Z",
  "resend_available_at": "2026-10-29T07:36:30.943281344Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380699246313` → **200**

```json
{
  "phone": "+380699246313",
  "audience": "CLIENT",
  "code": "218685",
  "sent_at": "2026-10-29T07:36:29.94505591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "771527bb-73ec-42e2-b882-8668753772a6",
  "code": "218685",
  "device_ref": "sandbox-11697"
}
```

```json
{
  "session_id": "4120ca25-b681-4bb1-9abc-bb8fb39dd097",
  "subject": {
    "type": "CLIENT",
    "id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTAzMWRmOS1kZmY1LTRlYjctODgxMS0wYTRmOTMwZDZlMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjYwMjkwLCJpYXQiOjE3OTMyNTkzOTAsImp0aSI6Ijc2NmZmYjM4LTNmYWEtNDEzOC05OWIyLTJmMjEwYmM0YzQzNyIsInNpZCI6IjQxMjBjYTI1LWI2ODEtNGJiMS05YWJjLWJiOGZiMzlkZDA5NyJ9.EJ87eNCiieKXq3a1RB2q5UQAb4qEcbsJJLUIc5KifEg",
  "access_expires_at": "2026-10-29T07:51:30.178133035Z",
  "refresh_token": "uQlaT2-cwQYBE1tVoAPKqP3XNGbBzcQmVB0wowd15uE",
  "refresh_expires_at": "2026-11-28T07:36:30.177719937Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77210d5b-70c3-4837-8832-91c48ef628d9",
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
  "id": "5c878710-996f-4975-9f15-44b497597e53",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T07:41:30.393641Z",
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
  "command_id": "3dfa123e-5709-48cd-886b-f2fb36d752b4",
  "quote_id": "5c878710-996f-4975-9f15-44b497597e53",
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
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:36:30.621044Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 10.605386036
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.113441215
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

`GET /api/rider/v1/orders/cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c` → **200**

```json
{
  "id": "cbdf3ae7-8ad5-47a3-a879-f4731ec0ad7c",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7a031df9-dff5-4eb7-8811-0a4f930d6e34",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T07:36:30.621044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793259697371E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79325969745E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793259697451E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793259697451E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793259697451E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
