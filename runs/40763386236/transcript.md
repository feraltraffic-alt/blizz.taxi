# Sandbox transcript (2026-10-28T20:27:55Z, e9fa993)

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
  "correlation_id": "b043b89d-be3a-4adf-aa1e-c8248853a4f7"
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
  "session_id": "27d63bed-312a-46e9-af0a-1a3e0fba4a74",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAxODIsImlhdCI6MTc5MzIxOTI4MiwianRpIjoiNTkxMzQzNmYtYTVhNS00ODRkLTg5YjItNjU1M2E0NjI2ZWFkIiwic2lkIjoiMjdkNjNiZWQtMzEyYS00NmU5LWFmMGEtMWEzZTBmYmE0YTc0In0.d-TTCpY1DrNq34ds5BRQEI2m9K-4YbbUk1LpxFMWsI4",
  "access_expires_at": "2026-10-28T20:43:02.049420166Z",
  "refresh_token": "5PtRzQF82laAlgQBFLxbeVRHZtmCLjhzVAus0AXAAzY",
  "refresh_expires_at": "2026-10-29T08:28:02.047250869Z",
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
  "session_id": "f474967d-d457-422d-b014-27ff1924d0cd",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAxODMsImlhdCI6MTc5MzIxOTI4MywianRpIjoiOGJjMDMxMmQtMTM5ZS00N2Y2LWI1NDktZGI5M2FjYmU5NDFjIiwic2lkIjoiZjQ3NDk2N2QtZDQ1Ny00MjJkLWIwMTQtMjdmZjE5MjRkMGNkIn0.oRxkhwtN-NDaBqog6tEJX6eL5FGb-ghUXTBJLEFA5DI",
  "access_expires_at": "2026-10-28T20:43:03.601195921Z",
  "refresh_token": "ve5LqbGkHGdOjQPBDGOS_cRdxWTKDzskimusJjpr-ZE",
  "refresh_expires_at": "2026-10-29T08:28:03.600267347Z",
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
  "device_ref": "sandbox-32419"
}
```

```json
{
  "challenge_id": "f0c7f80c-832b-4c5b-a1d4-4bd716468c20",
  "expires_at": "2026-10-28T20:33:04.190893323Z",
  "resend_available_at": "2026-10-28T20:28:05.190893323Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "232261",
  "sent_at": "2026-10-28T20:28:04.20007857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0c7f80c-832b-4c5b-a1d4-4bd716468c20",
  "code": "232261",
  "device_ref": "sandbox-32419"
}
```

```json
{
  "session_id": "db76fa81-6182-4cff-bbc9-ce518daf634b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDE4NCwiaWF0IjoxNzkzMjE5Mjg0LCJqdGkiOiJhOTcxMzVjZC0zZmEwLTQ5NTQtOTU5Yi0wMmIzODRhZjQyNzIiLCJzaWQiOiJkYjc2ZmE4MS02MTgyLTRjZmYtYmJjOS1jZTUxOGRhZjYzNGIifQ.uBBlQ4FxDc4tIAhZhuHPUprUdIw99QKBBa1mmmBNiVM",
  "access_expires_at": "2026-10-28T20:43:04.52594344Z",
  "refresh_token": "yzrn7QwA2p-BmcxbvuJKtuKDMReR04YaYGliLwW-xig",
  "refresh_expires_at": "2026-11-27T20:28:04.524976395Z",
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
  "command_id": "78fc810d-5a48-47f8-9bae-356f234a79d6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:05Z",
    "sequence": 1793219285825
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d972ecfa-9598-45f3-8d3d-d62d0d0716dd",
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
  "last_heartbeat_at": "2026-10-28T20:28:05.201279Z",
  "last_location_at": "2026-10-28T20:28:05.201279Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638628750",
  "device_ref": "sandbox-13824"
}
```

```json
{
  "challenge_id": "b4c2ce6e-940e-4baa-b3b9-45252ff8d9e8",
  "expires_at": "2026-10-28T20:33:05.49207157Z",
  "resend_available_at": "2026-10-28T20:28:06.49207157Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638628750` → **200**

```json
{
  "phone": "+380638628750",
  "audience": "CLIENT",
  "code": "625820",
  "sent_at": "2026-10-28T20:28:05.496428727Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4c2ce6e-940e-4baa-b3b9-45252ff8d9e8",
  "code": "625820",
  "device_ref": "sandbox-13824"
}
```

```json
{
  "session_id": "88878434-5497-4ea3-bbff-814635e90e8d",
  "subject": {
    "type": "CLIENT",
    "id": "992b04b2-a72c-47d8-bd43-9d62d3fe3901"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTJiMDRiMi1hNzJjLTQ3ZDgtYmQ0My05ZDYyZDNmZTM5MDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMTg1LCJpYXQiOjE3OTMyMTkyODUsImp0aSI6IjhmOGZkZWEyLWYzZmItNDdlZS05ZmRjLWI3ZTliZDQwNDE2MyIsInNpZCI6Ijg4ODc4NDM0LTU0OTctNGVhMy1iYmZmLTgxNDYzNWU5MGU4ZCJ9.tnxv1OvP8vE5ZJ0ZkE_N_2f8zvDoecUQYJWWvx7Nciw",
  "access_expires_at": "2026-10-28T20:43:05.804876586Z",
  "refresh_token": "2vFswdox_-r3F3mt0F7QZCJ6Tk8daDZfpdkGOiLZQCo",
  "refresh_expires_at": "2026-11-27T20:28:05.803925439Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "93efa709-26b3-43f2-86bd-7eed42d34098",
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
  "id": "4f9f42e9-0c03-498a-ae27-60f5556b5114",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:33:06.113512Z",
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
  "command_id": "ffa7b107-631d-45b7-b916-8421b5f39de7",
  "quote_id": "4f9f42e9-0c03-498a-ae27-60f5556b5114",
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
  "id": "63a1a643-7873-45a2-9ad6-fcb116a4c207",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "992b04b2-a72c-47d8-bd43-9d62d3fe3901",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:28:06.487323Z",
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
    "id": "1e3de24a-9a0e-44eb-b3df-83109617877b",
    "order_id": "63a1a643-7873-45a2-9ad6-fcb116a4c207",
    "expires_at": "2026-10-28T20:28:21.498062Z",
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

`POST /api/driver/v1/offers/1e3de24a-9a0e-44eb-b3df-83109617877b/accept` → **200**

```json
{
  "command_id": "707b2fdc-a8a9-4b61-9822-bdb3b0b1271b"
}
```

```json
{
  "id": "d8490f5c-fc4c-4880-9cb2-eaeb0231ffb6",
  "order_id": "63a1a643-7873-45a2-9ad6-fcb116a4c207",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "55c02220-d04c-4250-b525-4adc51370852",
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
  "command_id": "72a94243-c7cd-4bca-8510-b3a159c3cca4",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-28T20:28:07.689170611Z"
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
  "id": "55c02220-d04c-4250-b525-4adc51370852",
  "order_id": "63a1a643-7873-45a2-9ad6-fcb116a4c207",
  "assignment_id": "d8490f5c-fc4c-4880-9cb2-eaeb0231ffb6",
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

`POST /api/driver/v1/work-sessions/d972ecfa-9598-45f3-8d3d-d62d0d0716dd/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:08Z",
    "sequence": 1793219288557
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d972ecfa-9598-45f3-8d3d-d62d0d0716dd",
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
  "last_heartbeat_at": "2026-10-28T20:28:08.58321Z",
  "last_location_at": "2026-10-28T20:28:08.58321Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/55c02220-d04c-4250-b525-4adc51370852/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "8cf183d1-8342-4244-8d58-c0e41e09b506",
  "expected_version": 0
}
```

```json
{
  "id": "55c02220-d04c-4250-b525-4adc51370852",
  "order_id": "63a1a643-7873-45a2-9ad6-fcb116a4c207",
  "assignment_id": "d8490f5c-fc4c-4880-9cb2-eaeb0231ffb6",
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
  "arrived_at": "2026-10-28T20:28:08.881147Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/55c02220-d04c-4250-b525-4adc51370852/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a0cd078e-5935-4108-aabb-9a75df0f4239",
  "expected_version": 1
}
```

```json
{
  "id": "55c02220-d04c-4250-b525-4adc51370852",
  "order_id": "63a1a643-7873-45a2-9ad6-fcb116a4c207",
  "assignment_id": "d8490f5c-fc4c-4880-9cb2-eaeb0231ffb6",
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
  "arrived_at": "2026-10-28T20:28:08.881147Z",
  "started_at": "2026-10-28T20:28:09.171119Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/55c02220-d04c-4250-b525-4adc51370852/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "b93bb252-3371-4121-871b-6bf5b2293dc2",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:28:09Z",
  "cash_received": true
}
```

```json
{
  "id": "55c02220-d04c-4250-b525-4adc51370852",
  "order_id": "63a1a643-7873-45a2-9ad6-fcb116a4c207",
  "assignment_id": "d8490f5c-fc4c-4880-9cb2-eaeb0231ffb6",
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
  "arrived_at": "2026-10-28T20:28:08.881147Z",
  "started_at": "2026-10-28T20:28:09.171119Z",
  "completed_at": "2026-10-28T20:28:09.476961Z",
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
  "session_id": "d972ecfa-9598-45f3-8d3d-d62d0d0716dd",
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
  "last_heartbeat_at": "2026-10-28T20:28:08.58321Z",
  "last_location_at": "2026-10-28T20:28:08.58321Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d972ecfa-9598-45f3-8d3d-d62d0d0716dd/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f9bebd89-e895-4bf6-a7e4-c6eb16326671",
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
  "command_id": "1c2c6186-cff8-48a8-8a98-812f47eb2cbb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:10Z",
    "sequence": 1793219290396
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
  "correlation_id": "ad7c59fb-2acd-49ad-87f9-831d690e8aa2",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "1a392257-4fe6-4a67-a6d5-582196205870",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:10Z",
    "sequence": 1793219290733
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "73c9622f-0df7-4c55-b2bb-3eca8640e872",
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
  "last_heartbeat_at": "2026-10-28T20:28:10.757634Z",
  "last_location_at": "2026-10-28T20:28:10.757634Z",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-28T20:28:07.689171Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6dfa6ba6-2cdf-43d5-becf-0981dc75e6f2",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-28T20:28:11.369106645Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "73c9622f-0df7-4c55-b2bb-3eca8640e872",
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
  "last_heartbeat_at": "2026-10-28T20:28:10.757634Z",
  "last_location_at": "2026-10-28T20:28:10.757634Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/73c9622f-0df7-4c55-b2bb-3eca8640e872/close` → **200**

```json
{
  "command_id": "6dbdc268-c540-451d-be67-20a5bc8dd850",
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
  "session_id": "f74d1714-d7ed-40c9-9e60-4e9e588d3822",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAxOTIsImlhdCI6MTc5MzIxOTI5MiwianRpIjoiNTk5NTcyMWUtY2MyMi00ZDNjLTkxZWUtNzYzYWEzYzBkYjRhIiwic2lkIjoiZjc0ZDE3MTQtZDdlZC00MGM5LTllNjAtNGU5ZTU4OGQzODIyIn0.JxBSUDNog8JdoDwqn9YGdMR8kjEh-mUd1yTPz4zW0qs",
  "access_expires_at": "2026-10-28T20:43:12.524174032Z",
  "refresh_token": "GEMny07O1Vb-HgwSyIypCGrjAmabdSMTE3-JxDmPvxE",
  "refresh_expires_at": "2026-10-29T08:28:12.523341285Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "7201dbc9-0eab-42a1-b375-67b08929d93b",
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
  "id": "83279512-9e93-4d66-881d-d57bc1a20509",
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
  "created_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "created_at": "2026-10-28T20:28:12.808771Z",
  "updated_at": "2026-10-28T20:28:12.808771Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637938240",
  "device_ref": "sandbox-28753"
}
```

```json
{
  "challenge_id": "6b6a1868-429c-4ba9-b89f-e8a16f30062f",
  "expires_at": "2026-10-28T20:33:13.092268923Z",
  "resend_available_at": "2026-10-28T20:28:14.092268923Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637938240` → **200**

```json
{
  "phone": "+380637938240",
  "audience": "CLIENT",
  "code": "181732",
  "sent_at": "2026-10-28T20:28:13.096247071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b6a1868-429c-4ba9-b89f-e8a16f30062f",
  "code": "181732",
  "device_ref": "sandbox-28753"
}
```

```json
{
  "session_id": "17c80e80-4124-4ad9-a6e6-4cf5db003cbc",
  "subject": {
    "type": "CLIENT",
    "id": "fe588d56-9dbf-44be-8784-268d880815ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZTU4OGQ1Ni05ZGJmLTQ0YmUtODc4NC0yNjhkODgwODE1YWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMTkzLCJpYXQiOjE3OTMyMTkyOTMsImp0aSI6IjE1OTc2NzljLTFiYjctNGUxNC1hOTM1LTZlYmRlMjhiMmEwNyIsInNpZCI6IjE3YzgwZTgwLTQxMjQtNGFkOS1hNmU2LTRjZjVkYjAwM2NiYyJ9.ye_40NjD55l-tpPSp_iQS25bAnInj0FIge25F6HiT8k",
  "access_expires_at": "2026-10-28T20:43:13.395177914Z",
  "refresh_token": "2HVIE0uqXL9d0I8frssP_PBHrWQiVgR8qlhc7W5aCJk",
  "refresh_expires_at": "2026-11-27T20:28:13.394406151Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637938240` → **200**

```json
{
  "client_id": "fe588d56-9dbf-44be-8784-268d880815ae"
}
```

`POST /api/admin/v1/rider-wallets/fe588d56-9dbf-44be-8784-268d880815ae/top-ups` → **201**

```json
{
  "command_id": "350f469a-b792-4a7c-8ff3-413c811fbcac",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "fe588d56-9dbf-44be-8784-268d880815ae",
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
      "id": "624fd60c-a840-4457-94b4-5635c27d68c6",
      "at": "2026-10-28T20:28:13.949489Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "21a82de1-b242-4df9-8a1b-febd865ad825",
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
  "id": "25577b1e-922d-473e-888f-fa9c90aa7fff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:33:14.242325Z",
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
      "id": "83279512-9e93-4d66-881d-d57bc1a20509",
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
  "device_ref": "sandbox-31411"
}
```

```json
{
  "challenge_id": "968d35cf-cef9-4da1-b3cb-430bf60412b0",
  "expires_at": "2026-10-28T20:33:14.53316695Z",
  "resend_available_at": "2026-10-28T20:28:15.53316695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "475819",
  "sent_at": "2026-10-28T20:28:14.536201847Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "968d35cf-cef9-4da1-b3cb-430bf60412b0",
  "code": "475819",
  "device_ref": "sandbox-31411"
}
```

```json
{
  "session_id": "55591e02-3ac2-4a97-a04c-4789cd56b032",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDE5NCwiaWF0IjoxNzkzMjE5Mjk0LCJqdGkiOiJjM2ZhNDQ4Ni1iYWQyLTRlYjYtYjQyZi1mODk0MTNmNWZhNjciLCJzaWQiOiI1NTU5MWUwMi0zYWMyLTRhOTctYTA0Yy00Nzg5Y2Q1NmIwMzIifQ.6r7mN0jE4KkrMvXvm504mg6wIUOoJ_nw3opymcuQv4w",
  "access_expires_at": "2026-10-28T20:43:14.833446016Z",
  "refresh_token": "-0vG9NLE8KeZEYgvvdXoiHozNEHtDbWxpUHN6ho_nLo",
  "refresh_expires_at": "2026-11-27T20:28:14.83274796Z",
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
  "command_id": "fc401ff2-8adf-486a-a842-e8964329398f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:15Z",
    "sequence": 1793219295370
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34da7c45-8a02-465b-a96b-9a9945b42a00",
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
  "last_heartbeat_at": "2026-10-28T20:28:15.391498Z",
  "last_location_at": "2026-10-28T20:28:15.391498Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dae88bab-c855-4b7c-993b-0d809f3d0f7c",
  "quote_id": "25577b1e-922d-473e-888f-fa9c90aa7fff",
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
  "id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe588d56-9dbf-44be-8784-268d880815ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:28:15.680185Z",
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
  "client_id": "fe588d56-9dbf-44be-8784-268d880815ae",
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
      "id": "624fd60c-a840-4457-94b4-5635c27d68c6",
      "at": "2026-10-28T20:28:13.949489Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
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
    "id": "2b39c9e9-498f-4c29-9058-ddceabcd2ced",
    "order_id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c",
    "expires_at": "2026-10-28T20:28:30.688889Z",
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

`POST /api/driver/v1/offers/2b39c9e9-498f-4c29-9058-ddceabcd2ced/accept` → **200**

```json
{
  "command_id": "35547879-933b-4ed3-8fb8-c1bdd4481f59"
}
```

```json
{
  "id": "8617ca4d-dd0e-4094-b9b9-62c7b033d383",
  "order_id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d0e4ab68-5216-4f22-9492-e890411d08aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d0e4ab68-5216-4f22-9492-e890411d08aa",
  "order_id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c",
  "assignment_id": "8617ca4d-dd0e-4094-b9b9-62c7b033d383",
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

`POST /api/driver/v1/work-sessions/34da7c45-8a02-465b-a96b-9a9945b42a00/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:17Z",
    "sequence": 1793219297116
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34da7c45-8a02-465b-a96b-9a9945b42a00",
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
  "last_heartbeat_at": "2026-10-28T20:28:17.137042Z",
  "last_location_at": "2026-10-28T20:28:17.137042Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d0e4ab68-5216-4f22-9492-e890411d08aa/arrive` → **200**

```json
{
  "command_id": "33624880-77cc-4e57-ae13-3bf173b0256f",
  "expected_version": 0
}
```

```json
{
  "id": "d0e4ab68-5216-4f22-9492-e890411d08aa",
  "order_id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c",
  "assignment_id": "8617ca4d-dd0e-4094-b9b9-62c7b033d383",
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
  "arrived_at": "2026-10-28T20:28:17.41526Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d0e4ab68-5216-4f22-9492-e890411d08aa/start` → **200**

```json
{
  "command_id": "87abfbae-dba5-4726-afee-ac4bb73d785e",
  "expected_version": 1
}
```

```json
{
  "id": "d0e4ab68-5216-4f22-9492-e890411d08aa",
  "order_id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c",
  "assignment_id": "8617ca4d-dd0e-4094-b9b9-62c7b033d383",
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
  "arrived_at": "2026-10-28T20:28:17.41526Z",
  "started_at": "2026-10-28T20:28:17.713658Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d0e4ab68-5216-4f22-9492-e890411d08aa/complete` → **200**

```json
{
  "command_id": "53fcbeb1-6c59-497d-9f91-9ce19b766ae3",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:28:18Z",
  "cash_received": true
}
```

```json
{
  "id": "d0e4ab68-5216-4f22-9492-e890411d08aa",
  "order_id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c",
  "assignment_id": "8617ca4d-dd0e-4094-b9b9-62c7b033d383",
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
  "arrived_at": "2026-10-28T20:28:17.41526Z",
  "started_at": "2026-10-28T20:28:17.713658Z",
  "completed_at": "2026-10-28T20:28:18.02509Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fe588d56-9dbf-44be-8784-268d880815ae",
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
      "id": "98cb5e34-ec03-4337-b74d-e05ce97d461e",
      "at": "2026-10-28T20:28:18.756307Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c"
    },
    {
      "id": "624fd60c-a840-4457-94b4-5635c27d68c6",
      "at": "2026-10-28T20:28:13.949489Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/83279512-9e93-4d66-881d-d57bc1a20509/archive` → **200**

```json
{
  "command_id": "6a84f7b2-93bb-4e4a-9591-c8a7e85ce5b0",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "83279512-9e93-4d66-881d-d57bc1a20509",
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
  "created_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "created_at": "2026-10-28T20:28:12.808771Z",
  "updated_at": "2026-10-28T20:28:21.636855Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34da7c45-8a02-465b-a96b-9a9945b42a00",
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
  "last_heartbeat_at": "2026-10-28T20:28:17.137042Z",
  "last_location_at": "2026-10-28T20:28:17.137042Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34da7c45-8a02-465b-a96b-9a9945b42a00/close` → **200**

```json
{
  "command_id": "91ce7a64-a317-47cb-9256-6bec79513c6b",
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

Done: order 3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c.

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
  "session_id": "08aea830-d93f-40d1-9d72-b38547decf76",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyMDIsImlhdCI6MTc5MzIxOTMwMiwianRpIjoiNDI3YTA5ZGItYWE4My00ZmQ0LTlkN2EtODE4NzQwNThmN2U1Iiwic2lkIjoiMDhhZWE4MzAtZDkzZi00MGQxLTlkNzItYjM4NTQ3ZGVjZjc2In0.bhRoyQiX62lMM12egawFMFFp6M0xD_g-J9EVSGU5Pnc",
  "access_expires_at": "2026-10-28T20:43:22.798077718Z",
  "refresh_token": "d08yCbNn0kIaYYjEppbEJUwAbABkDmLfqnfnE8yFnxU",
  "refresh_expires_at": "2026-10-29T08:28:22.797364344Z",
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
  "command_id": "2ca02204-68ce-48a7-b4b2-69e066889152",
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
  "session_id": "f9ab5d11-fc0c-4a7c-aa6e-ee0df13c0dee",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyMDMsImlhdCI6MTc5MzIxOTMwMywianRpIjoiMjM1NTZiYWEtY2JlOS00NjhjLTllNDYtNzI0OTA3MmZkYzRhIiwic2lkIjoiZjlhYjVkMTEtZmMwYy00YTdjLWFhNmUtZWUwZGYxM2MwZGVlIn0.U5RP80vQF1_3__OPUD1jWW7An3kL-t0Qugvim6W_Hic",
  "access_expires_at": "2026-10-28T20:43:23.941037792Z",
  "refresh_token": "DmPR9848jbqBlUQ1FEeA5DSkpEBKT6yv8AWn6-epwig",
  "refresh_expires_at": "2026-10-29T08:28:23.939806682Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1233924661",
    "linkedid": "1730052700.1233924661",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671003131"
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
    "id": "1730052700.1233924661",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "23812d81-9493-4ab9-8c92-871ae2744931",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.215558Z",
      "answered_at": null,
      "ended_at": "2026-10-28T20:28:24.241643Z",
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
    "id": "1730052600.888020223",
    "linkedid": "1730052600.888020223",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671003131"
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
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/e249d6ea-c917-449d-9de6-d754b8df9c25/answer` → **200**

```json
{
  "command_id": "8235fa14-66a4-412b-b13f-2bce7dda9fb0"
}
```

```json
{
  "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671003131",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "order_ids": [],
  "started_at": "2026-10-28T20:28:24.572761Z",
  "answered_at": "2026-10-28T20:28:24.894484Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.888020223",
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
    "id": "1730052600.888020223",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": "2026-10-28T20:28:24.894484Z",
      "ended_at": "2026-10-28T20:28:25.188539Z",
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
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": "2026-10-28T20:28:24.894484Z",
      "ended_at": "2026-10-28T20:28:25.188539Z",
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
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": "2026-10-28T20:28:24.894484Z",
      "ended_at": "2026-10-28T20:28:25.188539Z",
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
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": "2026-10-28T20:28:24.894484Z",
      "ended_at": "2026-10-28T20:28:25.188539Z",
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
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": "2026-10-28T20:28:24.894484Z",
      "ended_at": "2026-10-28T20:28:25.188539Z",
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
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": "2026-10-28T20:28:24.894484Z",
      "ended_at": "2026-10-28T20:28:25.188539Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:28:34.476068Z"
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
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": "2026-10-28T20:28:24.894484Z",
      "ended_at": "2026-10-28T20:28:25.188539Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:28:34.476068Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/e249d6ea-c917-449d-9de6-d754b8df9c25/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/e249d6ea-c917-449d-9de6-d754b8df9c25/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=e249d6ea-c917-449d-9de6-d754b8df9c25` → **200**

```json
{
  "changes": [
    {
      "id": "d66d9a4c-9375-462b-a6e5-7148e96d73d9",
      "occurred_at": "2026-10-28T20:28:37.239116Z",
      "actor_type": "STAFF",
      "actor_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9f411933-de6d-4bcd-9128-2ccb25c31f67\", \"order_ids\": []}",
      "correlation_id": "bca3536d-29b9-46ea-b584-e5872f513596"
    },
    {
      "id": "948037eb-a3c6-47a6-8cf5-14b54b0ff17a",
      "occurred_at": "2026-10-28T20:28:37.207165Z",
      "actor_type": "STAFF",
      "actor_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"9f411933-de6d-4bcd-9128-2ccb25c31f67\", \"order_ids\": []}",
      "correlation_id": "a38928af-1f53-472f-afec-cc088f4c4aa8"
    }
  ]
}
```

Done: call e249d6ea-c917-449d-9de6-d754b8df9c25 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32278"
}
```

```json
{
  "challenge_id": "1dad38f7-0642-4de6-bf66-72b588c3c15d",
  "expires_at": "2026-10-28T20:33:37.549422068Z",
  "resend_available_at": "2026-10-28T20:28:38.549422068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "024707",
  "sent_at": "2026-10-28T20:28:37.553341906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1dad38f7-0642-4de6-bf66-72b588c3c15d",
  "code": "024707",
  "device_ref": "sandbox-32278"
}
```

```json
{
  "session_id": "8ee0b678-c8fe-41a7-af04-8c8e97afab6c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDIxNywiaWF0IjoxNzkzMjE5MzE3LCJqdGkiOiJlMmRkOWFhMC00ZGMyLTQ4ZDktOGIzZS1lYTJmNzc3MmVkMzUiLCJzaWQiOiI4ZWUwYjY3OC1jOGZlLTQxYTctYWYwNC04YzhlOTdhZmFiNmMifQ.IcIpFJTE87DIyWXl5flOBI4C_xxnKbDY2ZCjXdVGwpQ",
  "access_expires_at": "2026-10-28T20:43:37.844451934Z",
  "refresh_token": "ktbSsaPYTs4Ri30-Vk5N8Z-rElRi3KrJvmIh7OkcbZA",
  "refresh_expires_at": "2026-11-27T20:28:37.843757067Z",
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
  "command_id": "211ce8d7-5f33-4485-b4e2-f6a7305f4677",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:38Z",
    "sequence": 1793219318387
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e4ff9e3-286d-49f8-a45b-546782e2bde9",
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
  "last_heartbeat_at": "2026-10-28T20:28:38.407989Z",
  "last_location_at": "2026-10-28T20:28:38.407989Z",
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
  "session_id": "42d3fbff-1d54-4c8a-987f-324698c91a65",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyMTgsImlhdCI6MTc5MzIxOTMxOCwianRpIjoiMTBkMmI2ZGQtNTU3Mi00ZWVlLThmY2QtYjgxYTMzNTQ3MGI3Iiwic2lkIjoiNDJkM2ZiZmYtMWQ1NC00YzhhLTk4N2YtMzI0Njk4YzkxYTY1In0.xBlIZGHdnzGF9UBGFKpSeTpBuSCDU8sZRSHf4NpLoDU",
  "access_expires_at": "2026-10-28T20:43:38.985044235Z",
  "refresh_token": "77NG7fyf7qkwpa5Yt9oZgnviK8ZtSvXdfXSnQJsdZng",
  "refresh_expires_at": "2026-10-29T08:28:38.984331623Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3455458c-40bb-4038-94cb-fd81b91bed5b",
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
  "id": "a1746b63-d6c3-4c59-a11d-475d8456bcca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:33:39.271846Z",
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
  "command_id": "9f626a59-a6c1-49af-b151-67c6d7280a37",
  "quote_id": "a1746b63-d6c3-4c59-a11d-475d8456bcca",
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
    "phone": "+380671164742"
  }
}
```

```json
{
  "id": "f496837c-70b8-4c69-937b-0b508a202dc2",
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
  "created_at": "2026-10-28T20:28:39.581407Z",
  "caller": {
    "name": "Олена",
    "phone": "+380671164742"
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
    "id": "385e2283-425f-46bc-ae6a-30bba66b4742",
    "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
    "expires_at": "2026-10-28T20:28:54.586606Z",
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

`POST /api/driver/v1/offers/385e2283-425f-46bc-ae6a-30bba66b4742/accept` → **200**

```json
{
  "command_id": "32088585-2826-47c4-ab79-590a9021dd88"
}
```

```json
{
  "id": "36440333-a603-4366-8a97-6bc7e5e2ea5f",
  "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "03c8544d-df91-4013-becd-6183509b6836",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[
  {
    "phone": "+380671164742",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:41.65473229Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[
  {
    "phone": "+380671164742",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:41.65473229Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[
  {
    "phone": "+380671164742",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:41.65473229Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "03c8544d-df91-4013-becd-6183509b6836",
  "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
  "assignment_id": "36440333-a603-4366-8a97-6bc7e5e2ea5f",
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
    "phone": "+380671164742"
  }
}
```

`POST /api/driver/v1/work-sessions/7e4ff9e3-286d-49f8-a45b-546782e2bde9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:42Z",
    "sequence": 1793219322836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7e4ff9e3-286d-49f8-a45b-546782e2bde9",
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
  "last_heartbeat_at": "2026-10-28T20:28:42.85687Z",
  "last_location_at": "2026-10-28T20:28:42.85687Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/03c8544d-df91-4013-becd-6183509b6836/arrive` → **200**

```json
{
  "command_id": "6e1445dc-a53e-4fa0-b2bb-338ddf39d903",
  "expected_version": 0
}
```

```json
{
  "id": "03c8544d-df91-4013-becd-6183509b6836",
  "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
  "assignment_id": "36440333-a603-4366-8a97-6bc7e5e2ea5f",
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
  "arrived_at": "2026-10-28T20:28:43.141339Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671164742"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[
  {
    "phone": "+380671164742",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:41.65473229Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[
  {
    "phone": "+380671164742",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:41.65473229Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[
  {
    "phone": "+380671164742",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:41.65473229Z"
  },
  {
    "phone": "+380671164742",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:44.663926682Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[
  {
    "phone": "+380671164742",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:41.65473229Z"
  },
  {
    "phone": "+380671164742",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:44.663926682Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380671164742` → **200**

```json
[
  {
    "phone": "+380671164742",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:41.65473229Z"
  },
  {
    "phone": "+380671164742",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T20:28:44.663926682Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/03c8544d-df91-4013-becd-6183509b6836/start` → **200**

```json
{
  "command_id": "d53851eb-c4b0-449f-b193-76b6b92aba51",
  "expected_version": 1
}
```

```json
{
  "id": "03c8544d-df91-4013-becd-6183509b6836",
  "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
  "assignment_id": "36440333-a603-4366-8a97-6bc7e5e2ea5f",
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
  "arrived_at": "2026-10-28T20:28:43.141339Z",
  "started_at": "2026-10-28T20:28:45.565556Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671164742"
  }
}
```

`POST /api/driver/v1/trips/03c8544d-df91-4013-becd-6183509b6836/complete` → **200**

```json
{
  "command_id": "34d02fda-201f-428d-932f-9cc7ecebdd47",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:28:45Z",
  "cash_received": true
}
```

```json
{
  "id": "03c8544d-df91-4013-becd-6183509b6836",
  "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
  "assignment_id": "36440333-a603-4366-8a97-6bc7e5e2ea5f",
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
  "arrived_at": "2026-10-28T20:28:43.141339Z",
  "started_at": "2026-10-28T20:28:45.565556Z",
  "completed_at": "2026-10-28T20:28:45.87194Z",
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
  "session_id": "7e4ff9e3-286d-49f8-a45b-546782e2bde9",
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
  "last_heartbeat_at": "2026-10-28T20:28:42.85687Z",
  "last_location_at": "2026-10-28T20:28:42.85687Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e4ff9e3-286d-49f8-a45b-546782e2bde9/close` → **200**

```json
{
  "command_id": "a24fd0ab-a0b4-4879-9bcc-63998bcbac67",
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
  "phone": "+380630685160",
  "device_ref": "sandbox-15486"
}
```

```json
{
  "challenge_id": "c5598c77-6c15-4930-ad50-5238638594e7",
  "expires_at": "2026-10-28T20:33:46.709439173Z",
  "resend_available_at": "2026-10-28T20:28:47.709439173Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630685160` → **200**

```json
{
  "phone": "+380630685160",
  "audience": "CLIENT",
  "code": "294487",
  "sent_at": "2026-10-28T20:28:46.712788166Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5598c77-6c15-4930-ad50-5238638594e7",
  "code": "294487",
  "device_ref": "sandbox-15486"
}
```

```json
{
  "session_id": "eb839851-1e85-4b50-808c-864a6bb39667",
  "subject": {
    "type": "CLIENT",
    "id": "ebd4758c-a7e0-42da-b55a-7723598b906a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYmQ0NzU4Yy1hN2UwLTQyZGEtYjU1YS03NzIzNTk4YjkwNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjI3LCJpYXQiOjE3OTMyMTkzMjcsImp0aSI6IjY1ZTQ2YjcyLWEzYjUtNDJlMC04YzlkLTdkNTU2OTVlNDUyYiIsInNpZCI6ImViODM5ODUxLTFlODUtNGI1MC04MDhjLTg2NGE2YmIzOTY2NyJ9.sNUiZ2P-toq6fAMx6yRUCl2yKB-OtIzoOPoOpwU23fU",
  "access_expires_at": "2026-10-28T20:43:47.032574253Z",
  "refresh_token": "qdl6tr1CZq6aWasmZv29zOOkQetA_MelDmKRn2lCRh8",
  "refresh_expires_at": "2026-11-27T20:28:47.031949966Z",
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
  "device_ref": "sandbox-14080"
}
```

```json
{
  "challenge_id": "e52f93de-d699-4102-a7c8-a57a4fa39ca2",
  "expires_at": "2026-10-28T20:33:47.575671384Z",
  "resend_available_at": "2026-10-28T20:28:48.575671384Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "508225",
  "sent_at": "2026-10-28T20:28:47.578440821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e52f93de-d699-4102-a7c8-a57a4fa39ca2",
  "code": "508225",
  "device_ref": "sandbox-14080"
}
```

```json
{
  "session_id": "319c499f-ab6e-4d97-b546-011e0d7694b4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDIyNywiaWF0IjoxNzkzMjE5MzI3LCJqdGkiOiI4NGEwZjNjOS05OTQ4LTQ1NWUtODU3NC1lYWEyNzc2ZTc5ODUiLCJzaWQiOiIzMTljNDk5Zi1hYjZlLTRkOTctYjU0Ni0wMTFlMGQ3Njk0YjQifQ.A3eTvOMg-y5idqHCuZu3VBgZcqjnbWaW83sBb_dzNuU",
  "access_expires_at": "2026-10-28T20:43:47.877571824Z",
  "refresh_token": "jjDIwn4v48c65iTsBr87YzSm9zLRMDh5o737ljtNWoU",
  "refresh_expires_at": "2026-11-27T20:28:47.876899127Z",
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
  "session_id": "4bb91a1a-433f-4367-8449-7acdfe779eb8",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyMjgsImlhdCI6MTc5MzIxOTMyOCwianRpIjoiNTdkZjUxMjktODk3YS00NWNlLWFhYTEtNTI3NzI5MzAwZDRiIiwic2lkIjoiNGJiOTFhMWEtNDMzZi00MzY3LTg0NDktN2FjZGZlNzc5ZWI4In0.j3FzBq7IwPzBh1qWO6i_WEF1zV7TFYXMFQzTh1TTFtI",
  "access_expires_at": "2026-10-28T20:43:48.703038827Z",
  "refresh_token": "2crUKMitBOb3n_g9zQ9iVpUQriCudJnFVhAcTXlMbFU",
  "refresh_expires_at": "2026-10-29T08:28:48.702464333Z",
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
  "session_id": "e621fa95-7600-472f-8514-4413b984ae62",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyMjksImlhdCI6MTc5MzIxOTMyOSwianRpIjoiMTRiMjY5ZjctOTFjOC00YmUyLWJhYjYtMmRlODI4ZDk3MDg2Iiwic2lkIjoiZTYyMWZhOTUtNzYwMC00NzJmLTg1MTQtNDQxM2I5ODRhZTYyIn0.sQ1QB90F_QxQU3U8NU09tIXsZaZ6HaoJJx59Sy0vZnQ",
  "access_expires_at": "2026-10-28T20:43:49.265169194Z",
  "refresh_token": "DfsbqF7rtMk7lpMetkGt472D-VvN2OxkRRlLG6_p-3w",
  "refresh_expires_at": "2026-10-29T08:28:49.264480075Z",
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
  "command_id": "77223571-b339-46c2-8fc2-a080eee777ac",
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
  "id": "cca4e9e2-5732-455d-8a8f-a48f3f3f4cea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:33:49.816498Z",
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
  "command_id": "eeb286b1-0d82-49df-b1a9-321cb3e8ccc5",
  "quote_id": "cca4e9e2-5732-455d-8a8f-a48f3f3f4cea",
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
  "id": "0273c3d3-28e3-428b-819e-2f4aa090cbde",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ebd4758c-a7e0-42da-b55a-7723598b906a",
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
  "created_at": "2026-10-28T20:28:50.107095Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0273c3d3-28e3-428b-819e-2f4aa090cbde` → **200**

```json
{
  "id": "0273c3d3-28e3-428b-819e-2f4aa090cbde",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ebd4758c-a7e0-42da-b55a-7723598b906a",
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
  "created_at": "2026-10-28T20:28:50.107095Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0273c3d3-28e3-428b-819e-2f4aa090cbde/cancel` → **200**

```json
{
  "command_id": "0532ce4d-980f-4bce-b20f-5c8788f846db",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "0273c3d3-28e3-428b-819e-2f4aa090cbde",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ebd4758c-a7e0-42da-b55a-7723598b906a",
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
  "created_at": "2026-10-28T20:28:50.107095Z",
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
  "command_id": "9a28f845-6e83-4649-b265-54954c8e2148",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:51Z",
    "sequence": 1793219331263
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f503bf-3797-47f7-89a0-315fae64df45",
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
  "last_heartbeat_at": "2026-10-28T20:28:51.283792Z",
  "last_location_at": "2026-10-28T20:28:51.283792Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9883"
}
```

```json
{
  "challenge_id": "cdbcd623-eebf-4254-a8d3-7430b2dd6c0e",
  "expires_at": "2026-10-28T20:33:51.558453841Z",
  "resend_available_at": "2026-10-28T20:28:52.558453841Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "460544",
  "sent_at": "2026-10-28T20:28:51.561618858Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdbcd623-eebf-4254-a8d3-7430b2dd6c0e",
  "code": "460544",
  "device_ref": "sandbox-9883"
}
```

```json
{
  "session_id": "2c7f6fcd-608c-42d4-81b2-994e663800a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDIzMSwiaWF0IjoxNzkzMjE5MzMxLCJqdGkiOiIzOGY5MGNmNy01ZmFlLTQzNzUtYWY0YS00YzQ5YjliNjFhOTYiLCJzaWQiOiIyYzdmNmZjZC02MDhjLTQyZDQtODFiMi05OTRlNjYzODAwYTEifQ.KQ9ezhR3qtyZb0v1lys5CGXp9YK3UxoHgjzbok45-8M",
  "access_expires_at": "2026-10-28T20:43:51.862965257Z",
  "refresh_token": "QrWP9VEVuoDZvnwAEX97UYoB8W5qFP1ha6nlMwCaMAM",
  "refresh_expires_at": "2026-11-27T20:28:51.86230866Z",
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
  "command_id": "f86f68e9-c875-4399-bcb1-9a8a6e83c840",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:52Z",
    "sequence": 1793219332418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6386a60d-3767-4918-ac0a-9baa98dec4a2",
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
  "last_heartbeat_at": "2026-10-28T20:28:52.437666Z",
  "last_location_at": "2026-10-28T20:28:52.437666Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8bbb2bc9-247e-4224-b3d8-aeb89b53f125",
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
  "id": "ee7c25a7-88ca-411b-9e4a-42fc4dae0275",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:33:52.721514Z",
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
  "command_id": "661fe7a9-a4a4-47e3-aa1c-ed377a8e87ff",
  "quote_id": "ee7c25a7-88ca-411b-9e4a-42fc4dae0275",
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
  "id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ebd4758c-a7e0-42da-b55a-7723598b906a",
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
  "created_at": "2026-10-28T20:28:53.005969Z",
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
    "id": "cd8c676c-bbf9-4cdf-8563-46707c0613c5",
    "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
    "expires_at": "2026-10-28T20:29:08.009818Z",
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

`POST /api/driver/v1/offers/cd8c676c-bbf9-4cdf-8563-46707c0613c5/accept` → **200**

```json
{
  "command_id": "390db0a7-f950-4232-a675-705ca6b769d2"
}
```

```json
{
  "id": "7b5c66c2-21bc-438f-8838-0f8e92a26dfc",
  "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9fcb56f4-7236-442d-84d9-878f9f9938a6",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9fcb56f4-7236-442d-84d9-878f9f9938a6",
  "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
  "assignment_id": "7b5c66c2-21bc-438f-8838-0f8e92a26dfc",
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

`POST /api/driver/v1/trips/9fcb56f4-7236-442d-84d9-878f9f9938a6/cancel` → **200**

```json
{
  "command_id": "c5aba249-3da0-4b84-a1bf-1db4dece1382",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "9fcb56f4-7236-442d-84d9-878f9f9938a6",
  "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
  "assignment_id": "7b5c66c2-21bc-438f-8838-0f8e92a26dfc",
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

`GET /api/rider/v1/orders/cb53c4ef-c9e3-4f2e-95c1-345c169812bc` → **200**

```json
{
  "id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ebd4758c-a7e0-42da-b55a-7723598b906a",
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
    "id": "7b5c66c2-21bc-438f-8838-0f8e92a26dfc",
    "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9fcb56f4-7236-442d-84d9-878f9f9938a6",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T20:28:53.005969Z",
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
    "id": "27fa1023-0878-432f-851d-829b19fa66e1",
    "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
    "expires_at": "2026-10-28T20:29:09.135733Z",
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

`POST /api/driver/v1/offers/27fa1023-0878-432f-851d-829b19fa66e1/accept` → **200**

```json
{
  "command_id": "d89d5e80-425c-4426-b8bc-31e9986c0a12"
}
```

```json
{
  "id": "e18450a0-df44-4302-af92-d8df05774cc3",
  "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "272205a5-04e8-4d66-a7cc-d41aa0490f97",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "272205a5-04e8-4d66-a7cc-d41aa0490f97",
  "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
  "assignment_id": "e18450a0-df44-4302-af92-d8df05774cc3",
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

`POST /api/driver/v1/trips/272205a5-04e8-4d66-a7cc-d41aa0490f97/cancel` → **200**

```json
{
  "command_id": "1620a9bf-9be5-4369-bed7-0315306a538f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "272205a5-04e8-4d66-a7cc-d41aa0490f97",
  "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
  "assignment_id": "e18450a0-df44-4302-af92-d8df05774cc3",
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
    "id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-28T20:28:53.005969Z",
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
    "id": "0273c3d3-28e3-428b-819e-2f4aa090cbde",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T20:28:50.107095Z",
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

`GET /api/operator/v1/orders/cb53c4ef-c9e3-4f2e-95c1-345c169812bc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:28:53.006649Z",
      "actor": {
        "type": "CLIENT",
        "id": "ebd4758c-a7e0-42da-b55a-7723598b906a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
        "quote_id": "ee7c25a7-88ca-411b-9e4a-42fc4dae0275",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "0f1ec0cd-0626-446f-991f-2074d7489222"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:28:53.008883Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
        "attempt_id": "da50dda4-ad0c-4c12-acda-0520e42a81a8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0f1ec0cd-0626-446f-991f-2074d7489222"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:28:53.016026Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cd8c676c-bbf9-4cdf-8563-46707c0613c5",
        "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "0f1ec0cd-0626-446f-991f-2074d7489222"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T20:28:53.57714Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cd8c676c-bbf9-4cdf-8563-46707c0613c5",
        "order_id": "cb53c4ef-c9e3-4f2e-95c1-345c169812bc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "7b5c66c2-21bc-438f-8838-0f8e92a26dfc"
      },
      "correlation_id": "86874048-385c-4ef3-8621-6ad234db80c8"
```

Done: orders 0273c3d3-28e3-428b-819e-2f4aa090cbde, cb53c4ef-c9e3-4f2e-95c1-345c169812bc.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735729283",
  "device_ref": "sandbox-21717"
}
```

```json
{
  "challenge_id": "a5c7b83e-1718-4531-a221-92d328ba15c2",
  "expires_at": "2026-10-28T20:33:56.424893306Z",
  "resend_available_at": "2026-10-28T20:28:57.424893306Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735729283` → **200**

```json
{
  "phone": "+380735729283",
  "audience": "CLIENT",
  "code": "781582",
  "sent_at": "2026-10-28T20:28:56.427916681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a5c7b83e-1718-4531-a221-92d328ba15c2",
  "code": "781582",
  "device_ref": "sandbox-21717"
}
```

```json
{
  "session_id": "9fd47d47-39bf-40a5-8d3f-bb5b58218b10",
  "subject": {
    "type": "CLIENT",
    "id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZThiYWRkYi1jMDZkLTQyMzctOWQxOC01ZjVkMzJkYWFlMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjM2LCJpYXQiOjE3OTMyMTkzMzYsImp0aSI6IjMzZTE5ZTUzLWNlODUtNDYzMy1iYTEwLTJiMzU2N2Y4ZTViYyIsInNpZCI6IjlmZDQ3ZDQ3LTM5YmYtNDBhNS04ZDNmLWJiNWI1ODIxOGIxMCJ9.qMbFZ8_3Vp5NvhIurB1MEK1fCGXivYQC1Hnwq4uKhvY",
  "access_expires_at": "2026-10-28T20:43:56.728079386Z",
  "refresh_token": "s_BqX3NBCGTYkaXOcNxQcoGL-dtDWHBPyKchMTDvxkA",
  "refresh_expires_at": "2026-11-27T20:28:56.727509239Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "23bd83e8-a949-40a1-aca1-3f8f156f2317",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d1d5e01f-0daf-4ab4-a458-66bbd609837b",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d1d5e01f-0daf-4ab4-a458-66bbd609837b",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e1bb1d9ff9e08955ff1a131b534d265b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d1d5e01f-0daf-4ab4-a458-66bbd609837b",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735729283"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d1d5e01f-0daf-4ab4-a458-66bbd609837b",
  "expires_at": "2026-10-28T20:58:57.01392Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d1d5e01f-0daf-4ab4-a458-66bbd609837b` → **200**

```json
{
  "id": "d1d5e01f-0daf-4ab4-a458-66bbd609837b",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T20:58:57.01392Z",
  "card": {
    "id": "b94e35ea-36a4-4131-a3c1-a25b8c44d430",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5516",
    "card_type": "Visa",
    "created_at": "2026-10-28T20:28:57.313245Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "b94e35ea-36a4-4131-a3c1-a25b8c44d430",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5516",
      "card_type": "Visa",
      "created_at": "2026-10-28T20:28:57.313245Z"
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
  "device_ref": "sandbox-14449"
}
```

```json
{
  "challenge_id": "c28926cc-f1a5-46cf-a520-ea67950efdf9",
  "expires_at": "2026-10-28T20:33:57.875230527Z",
  "resend_available_at": "2026-10-28T20:28:58.875230527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "920274",
  "sent_at": "2026-10-28T20:28:57.878548441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c28926cc-f1a5-46cf-a520-ea67950efdf9",
  "code": "920274",
  "device_ref": "sandbox-14449"
}
```

```json
{
  "session_id": "6ea3ce5f-6d51-49d1-8135-4778d4a0493a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDIzOCwiaWF0IjoxNzkzMjE5MzM4LCJqdGkiOiI5OGE0MTA0YS05MGY1LTRiYzMtODA4NS02ODBkZWM4YmE4YzUiLCJzaWQiOiI2ZWEzY2U1Zi02ZDUxLTQ5ZDEtODEzNS00Nzc4ZDRhMDQ5M2EifQ.qTePBsNiR6sNvAa_J8aaoclRBFaL_YMM2OJ6TEbYml4",
  "access_expires_at": "2026-10-28T20:43:58.179777152Z",
  "refresh_token": "IwFRrWmerJWbxpqdG1xwXBXL34-1id20FKnYry8NQsE",
  "refresh_expires_at": "2026-11-27T20:28:58.179217092Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6386a60d-3767-4918-ac0a-9baa98dec4a2",
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
  "last_heartbeat_at": "2026-10-28T20:28:52.437666Z",
  "last_location_at": "2026-10-28T20:28:52.437666Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6386a60d-3767-4918-ac0a-9baa98dec4a2/handover` → **200**

```json
{
  "command_id": "0c50ef38-05ed-474c-a216-645d28e28ec8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6386a60d-3767-4918-ac0a-9baa98dec4a2",
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
  "last_heartbeat_at": "2026-10-28T20:28:52.437666Z",
  "last_location_at": "2026-10-28T20:28:52.437666Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6386a60d-3767-4918-ac0a-9baa98dec4a2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:28:59Z",
    "sequence": 1793219339448
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6386a60d-3767-4918-ac0a-9baa98dec4a2",
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
  "last_heartbeat_at": "2026-10-28T20:28:59.023433Z",
  "last_location_at": "2026-10-28T20:28:59.023433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d9448d6e-6d49-4116-9e7d-e14ba6af65db",
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
  "id": "a00411cd-f833-466d-abbf-d2c9f732f0ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:33:59.304874Z",
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
  "command_id": "5bef6563-ae82-4afc-937a-eebc1a568321",
  "quote_id": "a00411cd-f833-466d-abbf-d2c9f732f0ba",
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
  "id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
  "created_at": "2026-10-28T20:28:59.610605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7` → **200**

```json
{
  "id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
  "created_at": "2026-10-28T20:28:59.610605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7` → **200**

```json
{
  "id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
  "created_at": "2026-10-28T20:28:59.610605Z",
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
    "id": "a69bfb79-cf57-42fa-9baa-eaaf43b235fb",
    "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
    "expires_at": "2026-10-28T20:29:15.014891Z",
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

`POST /api/driver/v1/offers/a69bfb79-cf57-42fa-9baa-eaaf43b235fb/accept` → **200**

```json
{
  "command_id": "27ceece1-25d6-4185-8ffb-81efb44eea04"
}
```

```json
{
  "id": "444480c2-7b20-4149-8b77-649b7280d510",
  "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "706d8f1a-525d-4ee4-9739-c2b978c6d8f1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "706d8f1a-525d-4ee4-9739-c2b978c6d8f1",
  "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "assignment_id": "444480c2-7b20-4149-8b77-649b7280d510",
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

`POST /api/driver/v1/work-sessions/6386a60d-3767-4918-ac0a-9baa98dec4a2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:29:02Z",
    "sequence": 1793219342330
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6386a60d-3767-4918-ac0a-9baa98dec4a2",
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
  "last_heartbeat_at": "2026-10-28T20:29:02.351746Z",
  "last_location_at": "2026-10-28T20:29:02.351746Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/706d8f1a-525d-4ee4-9739-c2b978c6d8f1/arrive` → **200**

```json
{
  "command_id": "ae10f4d6-71b8-47b4-9a85-7e9c428029d3",
  "expected_version": 0
}
```

```json
{
  "id": "706d8f1a-525d-4ee4-9739-c2b978c6d8f1",
  "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "assignment_id": "444480c2-7b20-4149-8b77-649b7280d510",
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
  "arrived_at": "2026-10-28T20:29:02.630252Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/706d8f1a-525d-4ee4-9739-c2b978c6d8f1/start` → **200**

```json
{
  "command_id": "2c1128b8-1d37-4aa3-b8a0-ead4d19b4c27",
  "expected_version": 1
}
```

```json
{
  "id": "706d8f1a-525d-4ee4-9739-c2b978c6d8f1",
  "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "assignment_id": "444480c2-7b20-4149-8b77-649b7280d510",
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
  "arrived_at": "2026-10-28T20:29:02.630252Z",
  "started_at": "2026-10-28T20:29:02.928425Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/706d8f1a-525d-4ee4-9739-c2b978c6d8f1/complete` → **200**

```json
{
  "command_id": "cb55f1c1-8d64-409b-97ac-285d8c868cf6",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:29:03Z",
  "cash_received": true
}
```

```json
{
  "id": "706d8f1a-525d-4ee4-9739-c2b978c6d8f1",
  "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "assignment_id": "444480c2-7b20-4149-8b77-649b7280d510",
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
  "arrived_at": "2026-10-28T20:29:02.630252Z",
  "started_at": "2026-10-28T20:29:02.928425Z",
  "completed_at": "2026-10-28T20:29:03.222388Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7` → **200**

```json
{
  "id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
    "id": "444480c2-7b20-4149-8b77-649b7280d510",
    "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "706d8f1a-525d-4ee4-9739-c2b978c6d8f1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:28:59.610605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7` → **200**

```json
{
  "id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
    "id": "444480c2-7b20-4149-8b77-649b7280d510",
    "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "706d8f1a-525d-4ee4-9739-c2b978c6d8f1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:28:59.610605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7` → **200**

```json
{
  "id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
    "id": "444480c2-7b20-4149-8b77-649b7280d510",
    "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "706d8f1a-525d-4ee4-9739-c2b978c6d8f1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:28:59.610605Z",
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

`GET /api/rider/v1/orders/a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7/tip` → **200**

```json
{
  "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
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
  "available_until": "2026-10-29T20:29:03.222388Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7/tip` → **201**

```json
{
  "command_id": "f486461c-d8f7-4e5e-9089-f96120523240",
  "amount_minor": 2500
}
```

```json
{
  "id": "2db26c53-dd8a-4fcc-a21f-d46df951de87",
  "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T20:29:06.916706Z"
}
```

`GET /api/rider/v1/orders/a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7/tip` → **200**

```json
{
  "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
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
  "available_until": "2026-10-29T20:29:03.222388Z",
  "open": false,
  "tip": {
    "id": "2db26c53-dd8a-4fcc-a21f-d46df951de87",
    "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T20:29:06.916706Z"
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
      "id": "9f70544f-f336-462a-b1b5-d8f2624d47c3",
      "at": "2026-10-28T20:29:04.079948Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
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
      "id": "465dcf4f-8430-4efe-a60e-2727a7229288",
      "at": "2026-10-28T20:29:08.141659Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
      "counterpart_id": null
    },
    {
      "id": "9f70544f-f336-462a-b1b5-d8f2624d47c3",
      "at": "2026-10-28T20:29:04.079948Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6946fd13-fecb-440f-a2d9-e4e693ddb35b",
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
  "id": "636db1f3-cb77-4c0b-a892-085ea0310477",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:34:09.080302Z",
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
  "session_id": "100dc977-319f-4ede-a249-4196c448a56b",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyNDksImlhdCI6MTc5MzIxOTM0OSwianRpIjoiNDA2ZmUyMGMtOTZjOS00YTA5LWE0MTYtYzVjNjliNWE3YzdmIiwic2lkIjoiMTAwZGM5NzctMzE5Zi00ZWRlLWEyNDktNDE5NmM0NDhhNTZiIn0.s44Zs71g9sob9NdJs9wSgSRuCTxtLcznUU3W2URFrkI",
  "access_expires_at": "2026-10-28T20:44:09.661417361Z",
  "refresh_token": "R1majDIjTmdtvUudz3NftxrAAkMw2JaGcEQRZQOK1Hk",
  "refresh_expires_at": "2026-10-29T08:29:09.660813492Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380735729283` → **200**

```json
{
  "client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d"
}
```

`POST /api/admin/v1/rider-wallets/fe8baddb-c06d-4237-9d18-5f5d32daae2d/top-ups` → **201**

```json
{
  "command_id": "46fad14c-b6a8-47e9-9867-0f5b31652a89",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
      "id": "953f424a-4b67-43b9-8dc4-9086ac106fab",
      "at": "2026-10-28T20:29:10.211547Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "82cccf8d-4ccc-4e60-a4b6-65a14e417bc4",
  "quote_id": "636db1f3-cb77-4c0b-a892-085ea0310477",
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
  "id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
  "created_at": "2026-10-28T20:29:10.521218Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f28e4c0b-9dab-4fea-9891-cf763eba96c7` → **200**

```json
{
  "id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
  "created_at": "2026-10-28T20:29:10.521218Z",
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
    "id": "c786e343-2b62-4043-a9dc-9865cd850484",
    "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
    "expires_at": "2026-10-28T20:29:25.527011Z",
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

`POST /api/driver/v1/offers/c786e343-2b62-4043-a9dc-9865cd850484/accept` → **200**

```json
{
  "command_id": "f884a7a1-f145-4524-bc52-888671c5c382"
}
```

```json
{
  "id": "ab805b94-6ac9-43c8-a799-d1b5140bc097",
  "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "37b897bc-7239-4a11-be69-505ec220859e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "37b897bc-7239-4a11-be69-505ec220859e",
  "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
  "assignment_id": "ab805b94-6ac9-43c8-a799-d1b5140bc097",
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

`POST /api/driver/v1/work-sessions/6386a60d-3767-4918-ac0a-9baa98dec4a2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:29:11Z",
    "sequence": 1793219351984
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6386a60d-3767-4918-ac0a-9baa98dec4a2",
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
  "last_heartbeat_at": "2026-10-28T20:29:12.003608Z",
  "last_location_at": "2026-10-28T20:29:12.003608Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/37b897bc-7239-4a11-be69-505ec220859e/arrive` → **200**

```json
{
  "command_id": "37730449-e001-46cb-b5c8-78315bfe92d0",
  "expected_version": 0
}
```

```json
{
  "id": "37b897bc-7239-4a11-be69-505ec220859e",
  "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
  "assignment_id": "ab805b94-6ac9-43c8-a799-d1b5140bc097",
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
  "arrived_at": "2026-10-28T20:29:12.299241Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/37b897bc-7239-4a11-be69-505ec220859e/start` → **200**

```json
{
  "command_id": "13fde3b6-2b9d-4d75-b835-2c1952bcd642",
  "expected_version": 1
}
```

```json
{
  "id": "37b897bc-7239-4a11-be69-505ec220859e",
  "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
  "assignment_id": "ab805b94-6ac9-43c8-a799-d1b5140bc097",
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
  "arrived_at": "2026-10-28T20:29:12.299241Z",
  "started_at": "2026-10-28T20:29:12.590666Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/37b897bc-7239-4a11-be69-505ec220859e/complete` → **200**

```json
{
  "command_id": "8f51b1ee-157b-49a1-ad8b-a90edcfb635d",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:29:12Z",
  "cash_received": true
}
```

```json
{
  "id": "37b897bc-7239-4a11-be69-505ec220859e",
  "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
  "assignment_id": "ab805b94-6ac9-43c8-a799-d1b5140bc097",
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
  "arrived_at": "2026-10-28T20:29:12.299241Z",
  "started_at": "2026-10-28T20:29:12.590666Z",
  "completed_at": "2026-10-28T20:29:12.886132Z",
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
  "client_id": "fe8baddb-c06d-4237-9d18-5f5d32daae2d",
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
      "id": "953f424a-4b67-43b9-8dc4-9086ac106fab",
      "at": "2026-10-28T20:29:10.211547Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
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

`GET /api/rider/v1/orders/f28e4c0b-9dab-4fea-9891-cf763eba96c7/tip` → **200**

```json
{
  "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
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
  "available_until": "2026-10-29T20:29:12.886132Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f28e4c0b-9dab-4fea-9891-cf763eba96c7/tip` → **201**

```json
{
  "command_id": "c0243225-bd86-4da5-a8ae-8a854c7bee3c",
  "amount_minor": 2500
}
```

```json
{
  "id": "af2819c2-a27c-4803-9139-a28d47cfdefd",
  "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T20:29:14.028058Z"
}
```

`GET /api/rider/v1/orders/f28e4c0b-9dab-4fea-9891-cf763eba96c7/tip` → **200**

```json
{
  "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
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
  "available_until": "2026-10-29T20:29:12.886132Z",
  "open": false,
  "tip": {
    "id": "af2819c2-a27c-4803-9139-a28d47cfdefd",
    "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T20:29:14.028058Z"
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
      "id": "44de470f-93bd-4587-b1a7-14da534002fe",
      "at": "2026-10-28T20:29:13.193642Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
      "counterpart_id": null
    },
    {
      "id": "465dcf4f-8430-4efe-a60e-2727a7229288",
      "at": "2026-10-28T20:29:08.141659Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
      "counterpart_id": null
    },
    {
      "id": "9f70544f-f336-462a-b1b5-d8f2624d47c3",
      "at": "2026-10-28T20:29:04.079948Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
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
      "id": "f40d0b40-5403-45da-92fb-78fdebd72ff9",
      "at": "2026-10-28T20:29:15.221261Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
      "counterpart_id": null
    },
    {
      "id": "44de470f-93bd-4587-b1a7-14da534002fe",
      "at": "2026-10-28T20:29:13.193642Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f28e4c0b-9dab-4fea-9891-cf763eba96c7",
      "counterpart_id": null
    },
    {
      "id": "465dcf4f-8430-4efe-a60e-2727a7229288",
      "at": "2026-10-28T20:29:08.141659Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
      "counterpart_id": null
    },
    {
      "id": "9f70544f-f336-462a-b1b5-d8f2624d47c3",
      "at": "2026-10-28T20:29:04.079948Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a6e08caf-fa3f-4571-a4e3-53ef8cb7fdd7",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6386a60d-3767-4918-ac0a-9baa98dec4a2",
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
  "last_heartbeat_at": "2026-10-28T20:29:12.003608Z",
  "last_location_at": "2026-10-28T20:29:12.003608Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6386a60d-3767-4918-ac0a-9baa98dec4a2/close` → **200**

```json
{
  "command_id": "acb20e97-9086-4a67-9b89-ea146bbefc6a",
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

Done: card order f28e4c0b-9dab-4fea-9891-cf763eba96c7.

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
  "phone": "+380734975177",
  "device_ref": "sandbox-1909"
}
```

```json
{
  "challenge_id": "9d458620-eca1-4773-9f78-56e0ae3fc244",
  "expires_at": "2026-10-28T20:34:16.976203155Z",
  "resend_available_at": "2026-10-28T20:29:17.976203155Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734975177` → **200**

```json
{
  "phone": "+380734975177",
  "audience": "CLIENT",
  "code": "505003",
  "sent_at": "2026-10-28T20:29:16.978766669Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d458620-eca1-4773-9f78-56e0ae3fc244",
  "code": "505003",
  "device_ref": "sandbox-1909"
}
```

```json
{
  "session_id": "b530f697-e4c1-431e-8c52-112af4896260",
  "subject": {
    "type": "CLIENT",
    "id": "dbe2b677-b353-427b-9b20-e744c283c6a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYmUyYjY3Ny1iMzUzLTQyN2ItOWIyMC1lNzQ0YzI4M2M2YTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjU3LCJpYXQiOjE3OTMyMTkzNTcsImp0aSI6ImZmZjkxM2M3LTBmNDUtNDFjYS1hMDI3LTNmNmEwNjg0YTllNSIsInNpZCI6ImI1MzBmNjk3LWU0YzEtNDMxZS04YzUyLTExMmFmNDg5NjI2MCJ9.7RfVYVuTU6TLlu0gNiXvt6uQwgffUsgyDE66RXlodaE",
  "access_expires_at": "2026-10-28T20:44:17.273820385Z",
  "refresh_token": "0yshoVl2XcnUqHzY7d0joUfB8P9Vy9r4AIy0AtzSwDs",
  "refresh_expires_at": "2026-11-27T20:29:17.273124354Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "04300127-0743-4602-acd9-ea53ab132185",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "886e20da-130a-48ff-a9aa-74be884e8125",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-886e20da-130a-48ff-a9aa-74be884e8125",
    "orderDate": "1793219357",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "a756274f1977401f9113824681ada711",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=886e20da-130a-48ff-a9aa-74be884e8125",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734975177"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=886e20da-130a-48ff-a9aa-74be884e8125",
  "created_at": "2026-10-28T20:29:17.566782Z",
  "expires_at": "2026-10-28T20:59:17.566782Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/886e20da-130a-48ff-a9aa-74be884e8125` → **200**

```json
{
  "id": "886e20da-130a-48ff-a9aa-74be884e8125",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T20:29:17.566782Z",
  "expires_at": "2026-10-28T20:59:17.566782Z",
  "completed_at": "2026-10-28T20:29:17.837925Z",
  "masked_pan": "41****1389",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "dbe2b677-b353-427b-9b20-e744c283c6a4",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "dbe2b677-b353-427b-9b20-e744c283c6a4",
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
      "id": "4ff4f08b-1d96-4504-9937-95a0c0bace63",
      "at": "2026-10-28T20:29:18.234948Z",
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
  "client_id": "dbe2b677-b353-427b-9b20-e744c283c6a4",
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
      "id": "4ff4f08b-1d96-4504-9937-95a0c0bace63",
      "at": "2026-10-28T20:29:18.234948Z",
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
  "device_ref": "sandbox-24823"
}
```

```json
{
  "challenge_id": "5fc1ab63-4d63-4233-bcd1-9278bc8f54ad",
  "expires_at": "2026-10-28T20:34:19.944980465Z",
  "resend_available_at": "2026-10-28T20:29:20.944980465Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "557833",
  "sent_at": "2026-10-28T20:29:19.94731484Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fc1ab63-4d63-4233-bcd1-9278bc8f54ad",
  "code": "557833",
  "device_ref": "sandbox-24823"
}
```

```json
{
  "session_id": "18c651da-563a-4b0a-b2a2-f79087a731de",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDI2MCwiaWF0IjoxNzkzMjE5MzYwLCJqdGkiOiJmOTYxZWUwOS1kZDZlLTRmYzEtOWRmOS1hZjFkNDUxZTg0MjYiLCJzaWQiOiIxOGM2NTFkYS01NjNhLTRiMGEtYjJhMi1mNzkwODdhNzMxZGUifQ.-Za2PhALcXqRYMBERtfCfmHjZOALfXFxp4eSm1AvMkM",
  "access_expires_at": "2026-10-28T20:44:20.242342075Z",
  "refresh_token": "cwNCKnDoxhgsn2IszzTxjH9rMRYY8WSRQPiSxV5C5bI",
  "refresh_expires_at": "2026-11-27T20:29:20.241647816Z",
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
  "command_id": "45c2ee98-6eab-4e47-a389-0b8a5ea242ad",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "0af7c25f-967d-44e6-9831-be84adc6dacd",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-0af7c25f-967d-44e6-9831-be84adc6dacd",
    "orderDate": "1793219360",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "ec4e036dd0c143754296543bdd152b5f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=0af7c25f-967d-44e6-9831-be84adc6dacd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=0af7c25f-967d-44e6-9831-be84adc6dacd",
  "created_at": "2026-10-28T20:29:20.789949Z",
  "expires_at": "2026-10-28T20:59:20.789949Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/0af7c25f-967d-44e6-9831-be84adc6dacd` → **200**

```json
{
  "id": "0af7c25f-967d-44e6-9831-be84adc6dacd",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T20:29:20.789949Z",
  "expires_at": "2026-10-28T20:59:20.789949Z",
  "completed_at": "2026-10-28T20:29:21.066395Z",
  "masked_pan": "41****9452",
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
      "id": "012cb8f4-a1ab-4ad5-9851-97e9658af842",
      "at": "2026-10-28T20:29:21.244266Z",
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
  "command_id": "b082fc4d-e9d8-4267-a4c4-74e7dd4f8b88",
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
  "correlation_id": "c9691d5c-513c-4b5b-bf70-f5d0122c8d36"
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
  "device_ref": "sandbox-21965"
}
```

```json
{
  "challenge_id": "f89a2f8e-1dde-47fb-92d5-87e3703d9ca5",
  "expires_at": "2026-10-28T20:34:21.928903931Z",
  "resend_available_at": "2026-10-28T20:29:22.928903931Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "622509",
  "sent_at": "2026-10-28T20:29:21.931198314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f89a2f8e-1dde-47fb-92d5-87e3703d9ca5",
  "code": "622509",
  "device_ref": "sandbox-21965"
}
```

```json
{
  "session_id": "1e644363-40bd-4aa8-97db-2684ad46a403",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDI2MiwiaWF0IjoxNzkzMjE5MzYyLCJqdGkiOiIyYWE5ODhkMy05ODUyLTQ4NTAtOTZmMC1hOTEzNmQxNmI0YzQiLCJzaWQiOiIxZTY0NDM2My00MGJkLTRhYTgtOTdkYi0yNjg0YWQ0NmE0MDMifQ.2PdLMFj00GOmdSp_bfLVUXAsfnXMA7g1B5346FKw3qg",
  "access_expires_at": "2026-10-28T20:44:22.233437346Z",
  "refresh_token": "XgiXLO7N1EORPZcqxJrtDotZjFScanlKnMmJqwrD1qQ",
  "refresh_expires_at": "2026-11-27T20:29:22.232773625Z",
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
  "command_id": "3fd4b9af-f91f-437b-8905-7e2552c73a00",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:29:22Z",
    "sequence": 1793219362785
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cab2b1a5-3168-4d4d-bcb1-ad37dbc187da",
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
  "last_heartbeat_at": "2026-10-28T20:29:22.804989Z",
  "last_location_at": "2026-10-28T20:29:22.804989Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630537099",
  "device_ref": "sandbox-16563"
}
```

```json
{
  "challenge_id": "d8b46e1f-1469-473d-93f0-a1ff095baca3",
  "expires_at": "2026-10-28T20:34:23.090300367Z",
  "resend_available_at": "2026-10-28T20:29:24.090300367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630537099` → **200**

```json
{
  "phone": "+380630537099",
  "audience": "CLIENT",
  "code": "815025",
  "sent_at": "2026-10-28T20:29:23.092894343Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d8b46e1f-1469-473d-93f0-a1ff095baca3",
  "code": "815025",
  "device_ref": "sandbox-16563"
}
```

```json
{
  "session_id": "a8a606f1-aa98-4a22-ad63-d3332d0e4b10",
  "subject": {
    "type": "CLIENT",
    "id": "4e369f18-350d-455a-b99c-4ddadca1c3fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZTM2OWYxOC0zNTBkLTQ1NWEtYjk5Yy00ZGRhZGNhMWMzZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjYzLCJpYXQiOjE3OTMyMTkzNjMsImp0aSI6ImM3ZTYwYmM5LWZkNmEtNGFkYi1hNjM3LTYwZjg3OGI4OTVlMyIsInNpZCI6ImE4YTYwNmYxLWFhOTgtNGEyMi1hZDYzLWQzMzMyZDBlNGIxMCJ9.bO3GkrnaJ3sDNEl47ZfPm1leBv02eTAcdX7TAG2EPGw",
  "access_expires_at": "2026-10-28T20:44:23.388667338Z",
  "refresh_token": "TIY2jnP-rk6pol4wQ-8vBHNmLVhc8YnLOCfXVwNw-48",
  "refresh_expires_at": "2026-11-27T20:29:23.388106389Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48946eee-fe7a-45f8-adf4-25d9fd8c7f9e",
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
  "id": "ec2bc244-b052-478d-920f-f6262aa4a032",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:34:23.674179Z",
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
  "command_id": "140c077d-3810-43b1-b4d3-1ec89627c50c",
  "quote_id": "ec2bc244-b052-478d-920f-f6262aa4a032",
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
  "id": "c016e946-dfd8-44ff-894f-850768746e80",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4e369f18-350d-455a-b99c-4ddadca1c3fc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:29:23.969183Z",
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
    "id": "4d252f12-4cd6-497d-9577-48ec941fe399",
    "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
    "expires_at": "2026-10-28T20:29:38.972685Z",
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

`POST /api/driver/v1/offers/4d252f12-4cd6-497d-9577-48ec941fe399/accept` → **200**

```json
{
  "command_id": "00c3c3f5-d920-4175-8eb5-8741cdeabd04"
}
```

```json
{
  "id": "89891eba-8f7d-4f39-ac98-7ce66dad1252",
  "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7eefeb4d-e4a5-480b-8cb4-2f15367a1611",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7eefeb4d-e4a5-480b-8cb4-2f15367a1611",
  "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
  "assignment_id": "89891eba-8f7d-4f39-ac98-7ce66dad1252",
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

`POST /api/driver/v1/work-sessions/cab2b1a5-3168-4d4d-bcb1-ad37dbc187da/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:29:25Z",
    "sequence": 1793219365878
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cab2b1a5-3168-4d4d-bcb1-ad37dbc187da",
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
  "last_heartbeat_at": "2026-10-28T20:29:25.106489Z",
  "last_location_at": "2026-10-28T20:29:25.106489Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7eefeb4d-e4a5-480b-8cb4-2f15367a1611/arrive` → **200**

```json
{
  "command_id": "c0e8dcac-ace6-4ce2-8082-433ae4264471",
  "expected_version": 0
}
```

```json
{
  "id": "7eefeb4d-e4a5-480b-8cb4-2f15367a1611",
  "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
  "assignment_id": "89891eba-8f7d-4f39-ac98-7ce66dad1252",
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
  "arrived_at": "2026-10-28T20:29:25.392899Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7eefeb4d-e4a5-480b-8cb4-2f15367a1611/start` → **200**

```json
{
  "command_id": "97e061e4-2c3b-4357-955e-26a308defc31",
  "expected_version": 1
}
```

```json
{
  "id": "7eefeb4d-e4a5-480b-8cb4-2f15367a1611",
  "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
  "assignment_id": "89891eba-8f7d-4f39-ac98-7ce66dad1252",
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
  "arrived_at": "2026-10-28T20:29:25.392899Z",
  "started_at": "2026-10-28T20:29:25.681562Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7eefeb4d-e4a5-480b-8cb4-2f15367a1611/complete` → **200**

```json
{
  "command_id": "1a20104b-9e5c-4927-9f9c-a56c7dc233a6",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:29:25Z",
  "cash_received": false
}
```

```json
{
  "id": "7eefeb4d-e4a5-480b-8cb4-2f15367a1611",
  "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
  "assignment_id": "89891eba-8f7d-4f39-ac98-7ce66dad1252",
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
  "arrived_at": "2026-10-28T20:29:25.392899Z",
  "started_at": "2026-10-28T20:29:25.681562Z",
  "completed_at": "2026-10-28T20:29:25.965744Z",
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
  "session_id": "58944192-20a1-4898-8b9e-e5b55028bf17",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyNjYsImlhdCI6MTc5MzIxOTM2NiwianRpIjoiMmEzYzQ2NDktYTQyZi00NTg4LTg0MzktYWMyZTYyZDU1Zjg2Iiwic2lkIjoiNTg5NDQxOTItMjBhMS00ODk4LThiOWUtZTViNTUwMjhiZjE3In0.Drcs759Jz9FzKZ3Vn_Zk5Y7AOUhISSqT9cFO2P0xsio",
  "access_expires_at": "2026-10-28T20:44:26.540172484Z",
  "refresh_token": "Td2y6PV1oj03Zq7qGXV5J6pXFFUpS4C0RJEXg7Yvq2U",
  "refresh_expires_at": "2026-10-29T08:29:26.539658213Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/c016e946-dfd8-44ff-894f-850768746e80/cash-dispute` → **200**

```json
{
  "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "4e369f18-350d-455a-b99c-4ddadca1c3fc",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T20:29:26.29411Z",
  "decide_by": "2026-11-11T20:29:26.29411Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-11T20:29:26.29411Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "4e369f18-350d-455a-b99c-4ddadca1c3fc",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-28T20:29:26.29411Z",
      "decide_by": "2026-11-11T20:29:26.29411Z",
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

`POST /api/admin/v1/orders/c016e946-dfd8-44ff-894f-850768746e80/cash-dispute/decide` → **400**

```json
{
  "command_id": "5a000df7-c688-45dd-bd35-862c201a852e",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/c016e946-dfd8-44ff-894f-850768746e80/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9967e644-7495-4703-8649-f43b55ab63f0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/c016e946-dfd8-44ff-894f-850768746e80/cash-dispute/decide` → **200**

```json
{
  "command_id": "29927953-a64a-4957-bcb1-4d3ddbe7c889",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "4e369f18-350d-455a-b99c-4ddadca1c3fc",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-28T20:29:26.29411Z",
  "decide_by": "2026-11-11T20:29:26.29411Z",
  "decision": "PAY_DRIVER",
  "decided_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-28T20:29:27.702255Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/c016e946-dfd8-44ff-894f-850768746e80/cash-dispute/decide` → **409**

```json
{
  "command_id": "a9331f94-2253-4450-a587-4db3f5015479",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/c016e946-dfd8-44ff-894f-850768746e80/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "afa66a79-1f0c-4b19-b9fc-2482fec09874"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cab2b1a5-3168-4d4d-bcb1-ad37dbc187da",
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
  "last_heartbeat_at": "2026-10-28T20:29:25.106489Z",
  "last_location_at": "2026-10-28T20:29:25.106489Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cab2b1a5-3168-4d4d-bcb1-ad37dbc187da/close` → **200**

```json
{
  "command_id": "38c884a8-44d7-4399-81f4-fe09b250bb0a",
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
  "session_id": "66e4163f-4ce1-4da9-a968-9a511b7b39f6",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyNjksImlhdCI6MTc5MzIxOTM2OSwianRpIjoiMGY5MWFlZDAtMDk1ZS00NDk5LWFiMmUtOWRhNmNiMWU3M2M4Iiwic2lkIjoiNjZlNDE2M2YtNGNlMS00ZGE5LWE5NjgtOWE1MTFiN2IzOWY2In0.ZIZycCC-mEOiPp5NcKR-7xAKprj1GFLBMz9vehrIR0M",
  "access_expires_at": "2026-10-28T20:44:29.112967669Z",
  "refresh_token": "G07XFVHO_Ula0YVJFjTUDUHaZrW-vsr3cTxucqKZJ1I",
  "refresh_expires_at": "2026-10-29T08:29:29.11241702Z",
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
  "phone": "+48600523438",
  "device_ref": "sandbox-16066"
}
```

```json
{
  "challenge_id": "dc1f18bb-a645-4aac-98f1-0080fa504686",
  "expires_at": "2026-10-28T20:34:29.938801178Z",
  "resend_available_at": "2026-10-28T20:29:30.938801178Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600523438` → **200**

```json
{
  "phone": "+48600523438",
  "audience": "CLIENT",
  "code": "524848",
  "sent_at": "2026-10-28T20:29:29.942061706Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc1f18bb-a645-4aac-98f1-0080fa504686",
  "code": "524848",
  "device_ref": "sandbox-16066"
}
```

```json
{
  "session_id": "f4980a13-f578-47ff-9949-79b2b0a46208",
  "subject": {
    "type": "CLIENT",
    "id": "d4f639e1-6802-4107-95bf-196975bdc13b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGY2MzllMS02ODAyLTQxMDctOTViZi0xOTY5NzViZGMxM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjcwLCJpYXQiOjE3OTMyMTkzNzAsImp0aSI6IjBlMGUxMTVhLTIxNmQtNGRlZi05MDRmLThiNjA0NTkwOThhNyIsInNpZCI6ImY0OTgwYTEzLWY1NzgtNDdmZi05OTQ5LTc5YjJiMGE0NjIwOCJ9.tNFQ2n7lCRLe2aMFDq4qpCvdFMXoiO9dYq1Rk0AkAuw",
  "access_expires_at": "2026-10-28T20:44:30.240571029Z",
  "refresh_token": "JA8k1W1A-iHIKbfRr1DJplyoVzXa4k8uULbqeNKJZek",
  "refresh_expires_at": "2026-11-27T20:29:30.240011062Z",
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
  "command_id": "d0302885-e928-4d85-a26e-d8ee3489781c",
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
  "correlation_id": "de72f7cd-ba2e-445b-b0bf-e8b8580877c3",
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
  "command_id": "680a9624-4ac3-45ca-a69d-038258c422c1",
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
  "paused_at": "2026-10-28T20:29:31.335560844Z",
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
  "command_id": "db27554c-5ae9-49db-8ba5-9fd204e33edb",
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
  "id": "38ef0dcb-8fd5-479b-97f2-5d2880cb0bcb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:34:31.905573Z",
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
  "command_id": "0338fbdf-efa4-4868-aa54-1da8bb4fb456",
  "quote_id": "38ef0dcb-8fd5-479b-97f2-5d2880cb0bcb",
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
  "correlation_id": "f8b973c7-6eb9-4497-a0dd-6133f6bd61c2"
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
  "paused_at": "2026-10-28T20:29:31.335561Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "732211c9-cf0d-4e4d-99eb-7db655cd8088",
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
  "command_id": "faccfdbe-0652-4b99-8f56-88c0bfaece04",
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
  "command_id": "a0a082fa-9ac7-4ea4-adea-ab2626b9d131",
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
  "id": "40f66432-0297-4793-ac09-8ead24b7f4c6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:34:33.610973Z",
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
  "command_id": "82a259ac-9806-4ef6-a32d-acc715a21f17",
  "quote_id": "40f66432-0297-4793-ac09-8ead24b7f4c6",
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
  "correlation_id": "128b70f0-75ed-4a53-84e8-68aa2664443c"
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
  "command_id": "1951fe15-40ec-4650-9cfb-d045c5c853a7",
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
      "from": "23:00",
      "to": "00:00"
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
      "from": "23:00",
      "to": "00:00"
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
  "command_id": "e93aecde-c3b9-4fe8-835a-5d2e154b7ddc",
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
  "id": "31e5232d-45fe-48cf-8e1a-82cf566b4321",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:34:34.757487Z",
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
  "command_id": "d831fdf6-ee0b-48ec-a19d-dd22a818fb8f",
  "quote_id": "31e5232d-45fe-48cf-8e1a-82cf566b4321",
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
  "correlation_id": "d23298b5-6177-4b6f-a122-de8af5e30ac1"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "d9e04e62-67fc-42e8-8b28-8dc6b946b668",
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
  "correlation_id": "afbb0f8a-bdaf-4e07-ae82-dae056531c69"
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
      "from": "23:00",
      "to": "00:00"
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
  "command_id": "5c70f755-d8d7-4cc4-acaf-59f897203730",
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
  "phone": "+380677796770",
  "device_ref": "sandbox-18780"
}
```

```json
{
  "challenge_id": "b1c9ddc9-74e6-4365-89f5-0e00dd1d3887",
  "expires_at": "2026-10-28T20:34:36.174854693Z",
  "resend_available_at": "2026-10-28T20:29:37.174854693Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677796770` → **200**

```json
{
  "phone": "+380677796770",
  "audience": "CLIENT",
  "code": "416380",
  "sent_at": "2026-10-28T20:29:36.177068973Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b1c9ddc9-74e6-4365-89f5-0e00dd1d3887",
  "code": "416380",
  "device_ref": "sandbox-18780"
}
```

```json
{
  "session_id": "60f0d4bb-1b0b-48fe-ae82-b18fd5a4e163",
  "subject": {
    "type": "CLIENT",
    "id": "749366e4-029d-4119-89c3-8585d0443201"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDkzNjZlNC0wMjlkLTQxMTktODljMy04NTg1ZDA0NDMyMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjc2LCJpYXQiOjE3OTMyMTkzNzYsImp0aSI6IjZlM2U5YmQ4LTE5MmEtNDQ5OC04MmM4LTMyZTQzNGZiMmZlYSIsInNpZCI6IjYwZjBkNGJiLTFiMGItNDhmZS1hZTgyLWIxOGZkNWE0ZTE2MyJ9.RM9uXnwF2S_wOJN4XvdDYmxJdcVOHtWaLOvKbVIEqMU",
  "access_expires_at": "2026-10-28T20:44:36.469293658Z",
  "refresh_token": "s3nVBuvHGoX3z4ak8vPnrGmhshOgQKP0rZ291xdU9Wk",
  "refresh_expires_at": "2026-11-27T20:29:36.468769567Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "749366e4-029d-4119-89c3-8585d0443201",
  "session_id": "60f0d4bb-1b0b-48fe-ae82-b18fd5a4e163",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c9ad3339-d0ca-4002-8547-215901adc71e",
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
  "id": "14d8316e-0eb7-448a-acae-47309957ef0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:34:37.016579Z",
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
  "challenge_id": "4cac5b5b-737d-469b-97e6-d0aa5353a341",
  "expires_at": "2026-10-28T20:34:39.301244381Z",
  "resend_available_at": "2026-10-28T20:29:40.301244381Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677796770` → **200**

```json
{
  "phone": "+380677796770",
  "audience": "CLIENT",
  "code": "633793",
  "sent_at": "2026-10-28T20:29:39.303523764Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "027311fc-a878-4f0f-914b-ff77721f6948",
  "challenge_id": "4cac5b5b-737d-469b-97e6-d0aa5353a341",
  "otp_code": "633793"
}
```

```json
{
  "client_id": "749366e4-029d-4119-89c3-8585d0443201",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T20:29:39.613830065Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "68551b51-4957-4f5b-87a4-738b6b556f97",
  "quote_id": "14d8316e-0eb7-448a-acae-47309957ef0c",
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
  "correlation_id": "814ef481-baac-4018-bd5a-2fcdea41cc82"
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
  "session_id": "f52e2255-7ff4-4320-9c39-856b4f82dc5e",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyODAsImlhdCI6MTc5MzIxOTM4MCwianRpIjoiZTQxZjczYTMtODRhYy00NDhiLWI1ZDMtZGE5Y2MzMGVlMDU0Iiwic2lkIjoiZjUyZTIyNTUtN2ZmNC00MzIwLTljMzktODU2YjRmODJkYzVlIn0.j-P9ITqLcTbi96LlTwYbR73pmO1XiQ0eyPmlbm52IW0",
  "access_expires_at": "2026-10-28T20:44:40.465981769Z",
  "refresh_token": "6nsDGzjvhHoWF_iSOfojtCfHgmDpqmBtPEhp2Sav8Cg",
  "refresh_expires_at": "2026-10-29T08:29:40.465405541Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "749366e4-029d-4119-89c3-8585d0443201",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T20:29:39.61383Z",
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

`POST /api/admin/v1/client-deletions/749366e4-029d-4119-89c3-8585d0443201/complete` → **200**

```json
{
  "command_id": "ba9adb3b-cf38-4c48-98ff-924586331b0d",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "749366e4-029d-4119-89c3-8585d0443201",
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
  "correlation_id": "0c9e9670-4db0-4742-96ab-2eac8c284a9b"
}
```

Done: client 749366e4-029d-4119-89c3-8585d0443201 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664419298",
  "device_ref": "sandbox-3135"
}
```

```json
{
  "challenge_id": "8a81d2da-d25e-4298-93a0-7a6b1df61b64",
  "expires_at": "2026-10-28T20:34:41.588340472Z",
  "resend_available_at": "2026-10-28T20:29:42.588340472Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664419298` → **200**

```json
{
  "phone": "+380664419298",
  "audience": "CLIENT",
  "code": "492677",
  "sent_at": "2026-10-28T20:29:41.591081963Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a81d2da-d25e-4298-93a0-7a6b1df61b64",
  "code": "492677",
  "device_ref": "sandbox-3135"
}
```

```json
{
  "session_id": "d57f0486-c501-4af1-b98d-8eed8058fd49",
  "subject": {
    "type": "CLIENT",
    "id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjY5NzViMy05ZDI5LTQ5ZDAtOTJlNy02M2E2ZDRiYjA1NjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjgxLCJpYXQiOjE3OTMyMTkzODEsImp0aSI6ImIxODdmZGRiLTM4NWItNDk0Ni1hODg1LTU2ZDg3NDRlYjNlZiIsInNpZCI6ImQ1N2YwNDg2LWM1MDEtNGFmMS1iOThkLThlZWQ4MDU4ZmQ0OSJ9.N9hBWJ5zeAjIFEPX6IHhKt0GOdwKXr-i2CrxJZ7nlWA",
  "access_expires_at": "2026-10-28T20:44:41.888339324Z",
  "refresh_token": "FOH-IWdge8zN7c9rbParIxWEVSr3_2oFtX9_VzGT6No",
  "refresh_expires_at": "2026-11-27T20:29:41.887762578Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568",
  "session_id": "d57f0486-c501-4af1-b98d-8eed8058fd49",
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
  "session_id": "62714096-3b20-48b6-949d-dee0a8f7dc91",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyODIsImlhdCI6MTc5MzIxOTM4MiwianRpIjoiNjZiNjEzNzQtYmY3Ny00MjU1LWI1ZmYtYmEzYzJjYWRjZjhhIiwic2lkIjoiNjI3MTQwOTYtM2IyMC00OGI2LTk0OWQtZGVlMGE4ZjdkYzkxIn0.DIxjEWGVA9VC8vjvuWS3y1nF0EbKgDrcqLo9DvDyrho",
  "access_expires_at": "2026-10-28T20:44:42.73593304Z",
  "refresh_token": "TwXz02v95Wz9Rydv2ek64blXXusAzis1t3Jvzxi0F1A",
  "refresh_expires_at": "2026-10-29T08:29:42.735208826Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4419298&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568",
      "phone": "+380664419298",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T20:29:41.884925Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/bf6975b3-9d29-49d0-92e7-63a6d4bb0568` → **200**

```json
{
  "client": {
    "id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568",
    "phone": "+380664419298",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T20:29:41.884925Z",
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

`POST /api/admin/v1/clients/bf6975b3-9d29-49d0-92e7-63a6d4bb0568/block` → **400**

```json
{
  "command_id": "2b92e855-8595-4a69-b657-61581b72a2f3",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/bf6975b3-9d29-49d0-92e7-63a6d4bb0568/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9fb0e608-7c80-4552-9697-d055bcad94ea",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/bf6975b3-9d29-49d0-92e7-63a6d4bb0568/block` → **200**

```json
{
  "command_id": "d27b7c91-0431-424a-87d3-4c3e55a777e5",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568",
  "phone": "+380664419298",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T20:29:41.884925Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T20:29:43.895246Z",
    "by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
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
  "correlation_id": "05527d25-7048-411b-8b36-d769eed2b07b"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664419298",
  "device_ref": "sandbox-30060"
}
```

```json
{
  "challenge_id": "f0019f33-a9c2-49b7-bfff-0cc53d342e1f",
  "expires_at": "2026-10-28T20:34:46.472129733Z",
  "resend_available_at": "2026-10-28T20:29:47.472129733Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664419298` → **200**

```json
{
  "phone": "+380664419298",
  "audience": "CLIENT",
  "code": "761620",
  "sent_at": "2026-10-28T20:29:46.474446435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "f0019f33-a9c2-49b7-bfff-0cc53d342e1f",
  "code": "761620",
  "device_ref": "sandbox-30060"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "7a3e4381-1f14-4ee3-865c-531a918e0368"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/bf6975b3-9d29-49d0-92e7-63a6d4bb0568` → **200**

```json
{
  "client": {
    "id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568",
    "phone": "+380664419298",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T20:29:41.884925Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T20:29:43.895246Z",
      "by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
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

`POST /api/admin/v1/clients/bf6975b3-9d29-49d0-92e7-63a6d4bb0568/unblock` → **200**

```json
{
  "command_id": "f40492f4-b570-4c45-bb31-175b85ecfaea",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568",
  "phone": "+380664419298",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T20:29:41.884925Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664419298",
  "device_ref": "sandbox-23096"
}
```

```json
{
  "challenge_id": "6ad15620-47a0-4407-81d2-9c1dcea5c039",
  "expires_at": "2026-10-28T20:34:49.635586289Z",
  "resend_available_at": "2026-10-28T20:29:50.635586289Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664419298` → **200**

```json
{
  "phone": "+380664419298",
  "audience": "CLIENT",
  "code": "767772",
  "sent_at": "2026-10-28T20:29:49.638022906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ad15620-47a0-4407-81d2-9c1dcea5c039",
  "code": "767772",
  "device_ref": "sandbox-23096"
}
```

```json
{
  "session_id": "f4de7fd3-526e-4f2b-a825-6006606de4ab",
  "subject": {
    "type": "CLIENT",
    "id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjY5NzViMy05ZDI5LTQ5ZDAtOTJlNy02M2E2ZDRiYjA1NjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjg5LCJpYXQiOjE3OTMyMTkzODksImp0aSI6IjcxYTlmNjBjLWM5ZjgtNDhhNC1hODUyLWUxOGM3MjM1NmEyMSIsInNpZCI6ImY0ZGU3ZmQzLTUyNmUtNGYyYi1hODI1LTYwMDY2MDZkZTRhYiJ9.FaMvcel2KaDW2jnxMX6LE1clN6e9NpjhWfdxbvIUH8E",
  "access_expires_at": "2026-10-28T20:44:49.94338412Z",
  "refresh_token": "o4s36gpxcpK_TjVRVy2fFcuVu3iSpRTZcKZabFXH_7U",
  "refresh_expires_at": "2026-11-27T20:29:49.942817826Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bf6975b3-9d29-49d0-92e7-63a6d4bb0568",
  "session_id": "f4de7fd3-526e-4f2b-a825-6006606de4ab",
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
  "phone": "+380668659649",
  "device_ref": "sandbox-29783"
}
```

```json
{
  "challenge_id": "91f7b35b-2398-47e3-a435-3194db6e0cb3",
  "expires_at": "2026-10-28T20:34:50.491326778Z",
  "resend_available_at": "2026-10-28T20:29:51.491326778Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668659649` → **200**

```json
{
  "phone": "+380668659649",
  "audience": "CLIENT",
  "code": "499620",
  "sent_at": "2026-10-28T20:29:50.493641807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91f7b35b-2398-47e3-a435-3194db6e0cb3",
  "code": "499620",
  "device_ref": "sandbox-29783"
}
```

```json
{
  "session_id": "cb0ea346-05f9-4230-9826-e419774e1031",
  "subject": {
    "type": "CLIENT",
    "id": "09c98683-6231-4ca8-b6d2-f4be39ff43fc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWM5ODY4My02MjMxLTRjYTgtYjZkMi1mNGJlMzlmZjQzZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjkwLCJpYXQiOjE3OTMyMTkzOTAsImp0aSI6ImRkZjgwZjg4LTMzZTYtNDk4YS1iM2ZmLWRkNTYyZGQ4MjQzNSIsInNpZCI6ImNiMGVhMzQ2LTA1ZjktNDIzMC05ODI2LWU0MTk3NzRlMTAzMSJ9.3NlWpWVQz_i58C2W4fbCz_TVxWrRvO5qK109-Z2HZOI",
  "access_expires_at": "2026-10-28T20:44:50.785486257Z",
  "refresh_token": "6XmXr4VAYVkIQep4dstHunoU7JSlhf37IRlxTlopbUQ",
  "refresh_expires_at": "2026-11-27T20:29:50.784941709Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "27f7f2af-35df-41a2-a0ab-7e468a536068",
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
  "id": "d99d780d-9b42-431c-ba2e-8348a1a2c969",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:34:51.064151Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 92455fcb-09f9-4ee0-b3aa-d64c9aee96a1) → **201**

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
  "session_id": "bec13075-5511-4259-bb07-414bd56d8477",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyOTEsImlhdCI6MTc5MzIxOTM5MSwianRpIjoiMDhmNTY2N2QtMGYzNi00ZDE2LWE4YzgtZDQ5ZDBjOWU2MGZiIiwic2lkIjoiYmVjMTMwNzUtNTUxMS00MjU5LWJiMDctNDE0YmQ1NmQ4NDc3In0.PmE-LKfHa_CTvLOQZgwIFgm6x-jcMLgHtPYV7WezGKg",
  "access_expires_at": "2026-10-28T20:44:51.676647151Z",
  "refresh_token": "__vJWA4qJPdV7hA350bsqca1ZYI4-RHwQYzXWLKdRUU",
  "refresh_expires_at": "2026-10-29T08:29:51.676066105Z",
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
  "session_id": "b4a4e816-8707-4abb-8709-cbd053919439",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAyOTIsImlhdCI6MTc5MzIxOTM5MiwianRpIjoiMjc1OGIxZjEtY2VmMi00YzVkLWJjYmItNWQyOWM4ZDAyNjhlIiwic2lkIjoiYjRhNGU4MTYtODcwNy00YWJiLTg3MDktY2JkMDUzOTE5NDM5In0.8_lrBcQpl4VKA1-MlWgKSr-HXoKdG-K00NlgqIRTLYw",
  "access_expires_at": "2026-10-28T20:44:52.245517633Z",
  "refresh_token": "kjRZEI_SXJnTY_kax7rjYaT-wKV7FvkQDpYWyXX6Vww",
  "refresh_expires_at": "2026-10-29T08:29:52.244915397Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f582fad0-bfab-4d10-b9d9-5179e47080be/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:29:51.34634Z",
      "actor": {
        "type": "CLIENT",
        "id": "09c98683-6231-4ca8-b6d2-f4be39ff43fc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f582fad0-bfab-4d10-b9d9-5179e47080be",
        "quote_id": "d99d780d-9b42-431c-ba2e-8348a1a2c969",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "92455fcb-09f9-4ee0-b3aa-d64c9aee96a1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:29:51.34852Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f582fad0-bfab-4d10-b9d9-5179e47080be",
        "attempt_id": "38ea01c3-9383-4e20-9296-87ba2cfcd12b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "92455fcb-09f9-4ee0-b3aa-d64c9aee96a1"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T20:29:51.355024Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f582fad0-bfab-4d10-b9d9-5179e47080be",
        "attempt_id": "38ea01c3-9383-4e20-9296-87ba2cfcd12b"
      },
      "correlation_id": "92455fcb-09f9-4ee0-b3aa-d64c9aee96a1"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "38ea01c3-9383-4e20-9296-87ba2cfcd12b",
        "generation": 1,
        "started_at": "2026-10-28T20:29:51.347501Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T20:29:51.355024Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T20:29:51.349282Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/92455fcb-09f9-4ee0-b3aa-d64c9aee96a1` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "f582fad0-bfab-4d10-b9d9-5179e47080be:0",
      "order_id": "f582fad0-bfab-4d10-b9d9-5179e47080be",
      "at": "2026-10-28T20:29:51.34634Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f582fad0-bfab-4d10-b9d9-5179e47080be:1",
      "order_id": "f582fad0-bfab-4d10-b9d9-5179e47080be",
      "at": "2026-10-28T20:29:51.34852Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "f582fad0-bfab-4d10-b9d9-5179e47080be:2",
      "order_id": "f582fad0-bfab-4d10-b9d9-5179e47080be",
      "at": "2026-10-28T20:29:51.355024Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/9ca2ab84-ff82-4131-8fa9-9f1175a1b016` → **200**

```json
{
  "found": []
}
```

Done: request 92455fcb-09f9-4ee0-b3aa-d64c9aee96a1 — order f582fad0-bfab-4d10-b9d9-5179e47080be found by its id.

`GET /api/rider/v1/orders/f582fad0-bfab-4d10-b9d9-5179e47080be` → **200**

```json
{
  "id": "f582fad0-bfab-4d10-b9d9-5179e47080be",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "09c98683-6231-4ca8-b6d2-f4be39ff43fc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:29:51.345833Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f582fad0-bfab-4d10-b9d9-5179e47080be/cancel` → **200**

```json
{
  "command_id": "19d7d157-9258-402c-b52d-a089c8d0fc6f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f582fad0-bfab-4d10-b9d9-5179e47080be",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "09c98683-6231-4ca8-b6d2-f4be39ff43fc",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:29:51.345833Z",
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
  "phone": "+380639918350",
  "device_ref": "sandbox-12552"
}
```

```json
{
  "challenge_id": "4a4b489d-a5a6-414e-91c5-2cb92f66a8d5",
  "expires_at": "2026-10-28T20:34:53.98653997Z",
  "resend_available_at": "2026-10-28T20:29:54.98653997Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639918350` → **200**

```json
{
  "phone": "+380639918350",
  "audience": "CLIENT",
  "code": "080804",
  "sent_at": "2026-10-28T20:29:53.988736127Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4a4b489d-a5a6-414e-91c5-2cb92f66a8d5",
  "code": "080804",
  "device_ref": "sandbox-12552"
}
```

```json
{
  "session_id": "683948d7-24e0-40b6-abf5-d810364c3b4d",
  "subject": {
    "type": "CLIENT",
    "id": "83c329da-2410-4b8e-b5e7-fe3bef094bc9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2MzMjlkYS0yNDEwLTRiOGUtYjVlNy1mZTNiZWYwOTRiYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMjk0LCJpYXQiOjE3OTMyMTkzOTQsImp0aSI6IjYxZjhkNWIzLWJjZjctNDQ5Mi05MjE0LTNkZDlmZjQzYzYwNCIsInNpZCI6IjY4Mzk0OGQ3LTI0ZTAtNDBiNi1hYmY1LWQ4MTAzNjRjM2I0ZCJ9.lSX6Q9kmQ_4qF-pGnWc1CpBW0zfUHrcj7ZnGuILBt_I",
  "access_expires_at": "2026-10-28T20:44:54.276853926Z",
  "refresh_token": "2IsvkGMj49QBSeQlCLnxgIb2BgYWwO0Pe9_PK2JyB80",
  "refresh_expires_at": "2026-11-27T20:29:54.276209661Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b9399d55-0453-4c38-9380-11eedf462271",
  "expires_at": "2026-10-28T20:34:56.557498301Z",
  "resend_available_at": "2026-10-28T20:29:57.557498301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639918350` → **200**

```json
{
  "phone": "+380639918350",
  "audience": "CLIENT",
  "code": "593200",
  "sent_at": "2026-10-28T20:29:56.559987425Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "7a8eaa2a-c02e-47e3-ad11-1452252bacb9",
  "challenge_id": "b9399d55-0453-4c38-9380-11eedf462271",
  "otp_code": "593200"
}
```

```json
{
  "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
  "state": "PENDING",
  "created_at": "2026-10-28T20:29:56.859677Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64` → **200**

```json
{
  "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
  "state": "PENDING",
  "created_at": "2026-10-28T20:29:56.859677Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64` → **200**

```json
{
  "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
  "state": "PENDING",
  "created_at": "2026-10-28T20:29:56.859677Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64` → **200**

```json
{
  "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
  "state": "PENDING",
  "created_at": "2026-10-28T20:29:56.859677Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64` → **200**

```json
{
  "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
  "state": "PENDING",
  "created_at": "2026-10-28T20:29:56.859677Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64` → **200**

```json
{
  "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
  "state": "PENDING",
  "created_at": "2026-10-28T20:29:56.859677Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64` → **200**

```json
{
  "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
  "state": "PENDING",
  "created_at": "2026-10-28T20:29:56.859677Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64` → **200**

```json
{
  "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
  "state": "READY",
  "created_at": "2026-10-28T20:29:56.859677Z",
  "ready_at": "2026-10-28T20:30:04.481334Z",
  "expires_at": "2026-11-04T20:30:04.481334Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633077924",
  "device_ref": "sandbox-31553"
}
```

```json
{
  "challenge_id": "43264fa9-b5b0-4ed3-9295-06558023c650",
  "expires_at": "2026-10-28T20:35:05.042331977Z",
  "resend_available_at": "2026-10-28T20:30:06.042331977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633077924` → **200**

```json
{
  "phone": "+380633077924",
  "audience": "CLIENT",
  "code": "242594",
  "sent_at": "2026-10-28T20:30:05.044999195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43264fa9-b5b0-4ed3-9295-06558023c650",
  "code": "242594",
  "device_ref": "sandbox-31553"
}
```

```json
{
  "session_id": "3c09fccc-3708-4602-a422-905f283f0044",
  "subject": {
    "type": "CLIENT",
    "id": "4871968c-be25-4e0d-9f42-664981fb209a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ODcxOTY4Yy1iZTI1LTRlMGQtOWY0Mi02NjQ5ODFmYjIwOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzA1LCJpYXQiOjE3OTMyMTk0MDUsImp0aSI6IjNjODIwOGNiLWZiMzYtNGE1ZS05NWU2LWIzMmI5OWMzMjUyZiIsInNpZCI6IjNjMDlmY2NjLTM3MDgtNDYwMi1hNDIyLTkwNWYyODNmMDA0NCJ9.R_gkMgffDHvqo7qYcbs48x2EU6qYz6Mvydjn8iDEMOQ",
  "access_expires_at": "2026-10-28T20:45:05.338378285Z",
  "refresh_token": "Tnszfci2TEyUiKSV5hKRTYfgphVaAsRLQ1FLlddQg70",
  "refresh_expires_at": "2026-11-27T20:30:05.337836684Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/8835fe9e-421d-49ea-91ff-53154f2c9d64/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bd47b56e-ab1a-4366-9c04-2b8dbe770a3e"
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
  "session_id": "c5cd1e40-96c6-4be6-9eed-5459d02a9371",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzMDYsImlhdCI6MTc5MzIxOTQwNiwianRpIjoiODdlYTBlZTEtNDc1NS00ZDU3LWE4NDktY2Q1OGIzYTYzMTZmIiwic2lkIjoiYzVjZDFlNDAtOTZjNi00YmU2LTllZWQtNTQ1OWQwMmE5MzcxIn0.RkZi-YaPV1S9SOK1X9GrafKu-xzQQ8Ls4Fiy9QENj7U",
  "access_expires_at": "2026-10-28T20:45:06.164552996Z",
  "refresh_token": "fBvdEeKc1h20CyFdaPkxNpCveAjA6y5ql1CfhoT6fV8",
  "refresh_expires_at": "2026-10-29T08:30:06.163874567Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "83c329da-2410-4b8e-b5e7-fe3bef094bc9",
  "session_id": "683948d7-24e0-40b6-abf5-d810364c3b4d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/83c329da-2410-4b8e-b5e7-fe3bef094bc9/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "8835fe9e-421d-49ea-91ff-53154f2c9d64",
      "state": "READY",
      "created_at": "2026-10-28T20:29:56.859677Z",
      "ready_at": "2026-10-28T20:30:04.481334Z",
      "expires_at": "2026-11-04T20:30:04.481334Z",
      "size_bytes": 1029
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
  "device_ref": "sandbox-16525"
}
```

```json
{
  "challenge_id": "54f72d65-f15b-451e-9bca-b228920996fa",
  "expires_at": "2026-10-28T20:35:07.006135888Z",
  "resend_available_at": "2026-10-28T20:30:08.006135888Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "742400",
  "sent_at": "2026-10-28T20:30:07.008512042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "54f72d65-f15b-451e-9bca-b228920996fa",
  "code": "742400",
  "device_ref": "sandbox-16525"
}
```

```json
{
  "session_id": "1b00454b-dcff-4ec1-91d8-7fb3838fad29",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDMwNywiaWF0IjoxNzkzMjE5NDA3LCJqdGkiOiI3MWM4MDg3ZS1lZDRiLTRjODEtYTlhNS05NDI5Y2Y0ZmMyMGYiLCJzaWQiOiIxYjAwNDU0Yi1kY2ZmLTRlYzEtOTFkOC03ZmIzODM4ZmFkMjkifQ.PNUJpqnATWmFQo1XZR002DFv_BBHcY_9la3hR7J22II",
  "access_expires_at": "2026-10-28T20:45:07.310478502Z",
  "refresh_token": "QPxwoila2RbbvI5n87Jz11T4I3zHqBr3xrDB30xP3X4",
  "refresh_expires_at": "2026-11-27T20:30:07.309913366Z",
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
  "device_ref": "sandbox-5963"
}
```

```json
{
  "challenge_id": "98ab2744-d7a3-47f3-95a6-8d23f1f93a9d",
  "expires_at": "2026-10-28T20:35:07.839892302Z",
  "resend_available_at": "2026-10-28T20:30:08.839892302Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "609868",
  "sent_at": "2026-10-28T20:30:07.842247516Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98ab2744-d7a3-47f3-95a6-8d23f1f93a9d",
  "code": "609868",
  "device_ref": "sandbox-5963"
}
```

```json
{
  "session_id": "fbff8130-2be3-4e83-a1cd-398cc1fde248",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDMwOCwiaWF0IjoxNzkzMjE5NDA4LCJqdGkiOiIwMDViYTgzMC03MDY1LTQwYmItYjI5Yi0xMWE2NjdjNDkzNGMiLCJzaWQiOiJmYmZmODEzMC0yYmUzLTRlODMtYTFjZC0zOThjYzFmZGUyNDgifQ.YPjegSHHc8aqVJqYauDdBW8NIksW0sCJtdkSXvMAd9Y",
  "access_expires_at": "2026-10-28T20:45:08.142525754Z",
  "refresh_token": "GtwfbDZ6oXuhbdOr5ODoZ5e8V0KLpZEHcWu1GEqa1Os",
  "refresh_expires_at": "2026-11-27T20:30:08.141880005Z",
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
  "command_id": "e5d742cc-29b1-4735-96b9-2e09ac0fab5b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:08Z",
    "sequence": 1793219408673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8306b405-139c-43da-b127-b053f91f5c7c",
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
  "last_heartbeat_at": "2026-10-28T20:30:08.692239Z",
  "last_location_at": "2026-10-28T20:30:08.692239Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-1406"
}
```

```json
{
  "challenge_id": "630119b4-ed3b-4c22-a14f-183c659a69b5",
  "expires_at": "2026-10-28T20:35:08.967115105Z",
  "resend_available_at": "2026-10-28T20:30:09.967115105Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "372298",
  "sent_at": "2026-10-28T20:30:08.969794816Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "630119b4-ed3b-4c22-a14f-183c659a69b5",
  "code": "372298",
  "device_ref": "sandbox-1406"
}
```

```json
{
  "session_id": "86ce9b62-e219-418e-ae63-8e7e1dcd7fdc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDMwOSwiaWF0IjoxNzkzMjE5NDA5LCJqdGkiOiI5YWY2NjcxOS02MGVmLTRhNzYtYjg5Yy1hODJlYjc4NDAyMGYiLCJzaWQiOiI4NmNlOWI2Mi1lMjE5LTQxOGUtYWU2My04ZTdlMWRjZDdmZGMifQ.qGVibf_mZMZTaXUdS2g2oWFHuHpw0pyY4HjDvt3M6aQ",
  "access_expires_at": "2026-10-28T20:45:09.256289468Z",
  "refresh_token": "2erh4iTwqDO9imBypK6eTlcEXubaX3j8aD5wvWNcKCs",
  "refresh_expires_at": "2026-11-27T20:30:09.255786027Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f503bf-3797-47f7-89a0-315fae64df45",
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
  "last_heartbeat_at": "2026-10-28T20:28:51.283792Z",
  "last_location_at": "2026-10-28T20:28:51.283792Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a8f503bf-3797-47f7-89a0-315fae64df45/handover` → **200**

```json
{
  "command_id": "1cd3f575-77b0-4c53-9960-8ebcbbea8018",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f503bf-3797-47f7-89a0-315fae64df45",
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
  "last_heartbeat_at": "2026-10-28T20:28:51.283792Z",
  "last_location_at": "2026-10-28T20:28:51.283792Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a8f503bf-3797-47f7-89a0-315fae64df45/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:10Z",
    "sequence": 1793219410718
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f503bf-3797-47f7-89a0-315fae64df45",
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
  "last_heartbeat_at": "2026-10-28T20:30:10.090207Z",
  "last_location_at": "2026-10-28T20:30:10.090207Z",
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
  "session_id": "fc0b15cf-6959-4d6e-bb11-1fefb1449d92",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzMTAsImlhdCI6MTc5MzIxOTQxMCwianRpIjoiNzkwM2UyMDctZTI1YS00YWU2LTlhN2YtNzMxM2NjNTAzMjU1Iiwic2lkIjoiZmMwYjE1Y2YtNjk1OS00ZDZlLWJiMTEtMWZlZmIxNDQ5ZDkyIn0.syHwklUDiBTBafQTrT6GtZjoCTTEsRwXH5P1QsHfJWM",
  "access_expires_at": "2026-10-28T20:45:10.684346102Z",
  "refresh_token": "C18ZLTkPrQZTyvJuLpgAq6HsF-Vtg8YyR2Lw1J6FT6w",
  "refresh_expires_at": "2026-10-29T08:30:10.683735203Z",
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
  "session_id": "1efc4d1e-1e2a-4cff-9859-f47aebdc006d",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzMTEsImlhdCI6MTc5MzIxOTQxMSwianRpIjoiOTQ0NTU0MjAtZDBkNS00ZDE5LTliZTktZmQ5YjAyOTY2MTZlIiwic2lkIjoiMWVmYzRkMWUtMWUyYS00Y2ZmLTk4NTktZjQ3YWViZGMwMDZkIn0.W83EEW2zfNZdBYEqUrGq6QBhA8hRN8lFHiS3lkxMLjk",
  "access_expires_at": "2026-10-28T20:45:11.277453674Z",
  "refresh_token": "HtqBQ42AOXrmfGqiobCJRG0aQ4irTCnBO5zjYnzqOdc",
  "refresh_expires_at": "2026-10-29T08:30:11.276785661Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689961240",
  "device_ref": "sandbox-28731"
}
```

```json
{
  "challenge_id": "cd036397-6d3b-438a-b9b2-a1d0d9b4fdf1",
  "expires_at": "2026-10-28T20:35:11.546825233Z",
  "resend_available_at": "2026-10-28T20:30:12.546825233Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689961240` → **200**

```json
{
  "phone": "+380689961240",
  "audience": "CLIENT",
  "code": "226227",
  "sent_at": "2026-10-28T20:30:11.549296573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd036397-6d3b-438a-b9b2-a1d0d9b4fdf1",
  "code": "226227",
  "device_ref": "sandbox-28731"
}
```

```json
{
  "session_id": "bce38a5c-45db-4b77-889a-03b12f521030",
  "subject": {
    "type": "CLIENT",
    "id": "5ffe9549-8dfd-4555-854a-75f35be92179"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZmZlOTU0OS04ZGZkLTQ1NTUtODU0YS03NWYzNWJlOTIxNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzExLCJpYXQiOjE3OTMyMTk0MTEsImp0aSI6ImM0ZGRmYmYxLWRlZjItNDc4My05ZTY0LTg2ZTZlYzRkN2I3ZSIsInNpZCI6ImJjZTM4YTVjLTQ1ZGItNGI3Ny04ODlhLTAzYjEyZjUyMTAzMCJ9.mLrB0Mri2tZXKRHQuaimLjINk7m6-7dkOsFPCB0pA1E",
  "access_expires_at": "2026-10-28T20:45:11.841933513Z",
  "refresh_token": "lgqNjGyzWCajkCqj6iH8VjSl-D2hW2EzFHI6-mQFwX0",
  "refresh_expires_at": "2026-11-27T20:30:11.84134834Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "af186dfa-20bf-41e2-8aff-fb9de163aac2",
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
  "id": "417c26b6-bb89-401c-8a2a-53c2f341c6ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:35:12.114156Z",
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
  "command_id": "fff54503-96aa-45d8-8852-537106b808be",
  "quote_id": "417c26b6-bb89-401c-8a2a-53c2f341c6ba",
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
  "id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5ffe9549-8dfd-4555-854a-75f35be92179",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:30:12.397909Z",
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
    "id": "03133436-0023-4c8c-99ff-54b21ef0b950",
    "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
    "expires_at": "2026-10-28T20:30:27.401587Z",
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

`POST /api/driver/v1/offers/03133436-0023-4c8c-99ff-54b21ef0b950/reject` → **204**

```json
{
  "command_id": "1f4dfc32-9bc3-4fd7-b6e8-351dde04c6fd"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "328ed8d0-d5f8-4248-9091-8816714f6d1f",
    "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
    "expires_at": "2026-10-28T20:30:27.96799Z",
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

`POST /api/driver/v1/offers/328ed8d0-d5f8-4248-9091-8816714f6d1f/accept` → **200**

```json
{
  "command_id": "97741797-916a-49c2-a400-8cbc5a067eb2"
}
```

```json
{
  "id": "88b2395b-377d-4573-a9c2-02197d4dc990",
  "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0f153f48-6964-4b13-85e6-e9ef230cf2ff",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/55197c32-f6f8-423a-bfd4-3f09f636b228/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:30:12.398452Z",
      "actor": {
        "type": "CLIENT",
        "id": "5ffe9549-8dfd-4555-854a-75f35be92179",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
        "quote_id": "417c26b6-bb89-401c-8a2a-53c2f341c6ba",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1bf4e7ea-26ca-4eba-8ada-a4017eb689ae"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:30:12.400771Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
        "attempt_id": "880db256-3abc-4cd1-8d22-a50cadfb42ed",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1bf4e7ea-26ca-4eba-8ada-a4017eb689ae"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:30:12.407001Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "03133436-0023-4c8c-99ff-54b21ef0b950",
        "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "1bf4e7ea-26ca-4eba-8ada-a4017eb689ae"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T20:30:12.967004Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "03133436-0023-4c8c-99ff-54b21ef0b950",
        "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228"
      },
      "correlation_id": "1ccc6242-b0cf-42e6-8aa7-3c65bd508b31"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 55197c32-f6f8-423a-bfd4-3f09f636b228 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/55197c32-f6f8-423a-bfd4-3f09f636b228` → **200**

```json
{
  "id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
  "short_number": 10,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5ffe9549-8dfd-4555-854a-75f35be92179",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "88b2395b-377d-4573-a9c2-02197d4dc990",
    "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0f153f48-6964-4b13-85e6-e9ef230cf2ff",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T20:30:12.397909Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/55197c32-f6f8-423a-bfd4-3f09f636b228/cancel` → **200**

```json
{
  "command_id": "9e52f27e-1976-456e-a7a6-da93a2ce6a7f",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5ffe9549-8dfd-4555-854a-75f35be92179",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "88b2395b-377d-4573-a9c2-02197d4dc990",
    "order_id": "55197c32-f6f8-423a-bfd4-3f09f636b228",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0f153f48-6964-4b13-85e6-e9ef230cf2ff",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T20:30:12.397909Z",
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
  "session_id": "8306b405-139c-43da-b127-b053f91f5c7c",
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
  "last_heartbeat_at": "2026-10-28T20:30:08.692239Z",
  "last_location_at": "2026-10-28T20:30:08.692239Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8306b405-139c-43da-b127-b053f91f5c7c/close` → **200**

```json
{
  "command_id": "7175395e-1bfd-4296-a89e-4186d0e2cabe",
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
  "session_id": "a8f503bf-3797-47f7-89a0-315fae64df45",
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
  "last_heartbeat_at": "2026-10-28T20:30:10.090207Z",
  "last_location_at": "2026-10-28T20:30:10.090207Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8f503bf-3797-47f7-89a0-315fae64df45/close` → **200**

```json
{
  "command_id": "3590a53a-3815-487c-87df-c64ecb1f57ea",
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
  "session_id": "25be7da4-cc6d-46c6-8aa3-6f3b09b27a09",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzMTUsImlhdCI6MTc5MzIxOTQxNSwianRpIjoiY2VmZDMxMzEtNjdlNS00OWZiLTljOTYtNGQ3NWU0ZjdlODliIiwic2lkIjoiMjViZTdkYTQtY2M2ZC00NmM2LThhYTMtNmYzYjA5YjI3YTA5In0.SAICdUUWY_fH93K7-kqGIu3GjhV1fHkvvZIbLxh345I",
  "access_expires_at": "2026-10-28T20:45:15.939908332Z",
  "refresh_token": "YWe7RZ36CKtsR_9KzwBMIeK9RIk6Hv5aP2FP-8_QI7o",
  "refresh_expires_at": "2026-10-29T08:30:15.939347183Z",
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
  "command_id": "80c9ffe4-76ca-43c6-8c1d-90ba87805e64",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T20:30:16.491253Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "26cbba00-cece-497e-a0b3-1d876f44b238",
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
  "correlation_id": "8eb1575c-660e-457c-9e46-e6897615c558"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "f3784259-cf0b-4d1f-90ab-94918e8a3ff4",
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
  "correlation_id": "f9807d92-f911-4309-8d6a-c0f4d3365bcb"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636770422",
  "device_ref": "sandbox-5407"
}
```

```json
{
  "challenge_id": "34356ee3-95f2-4531-b8ea-8f9eea926a26",
  "expires_at": "2026-10-28T20:35:17.314455908Z",
  "resend_available_at": "2026-10-28T20:30:18.314455908Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636770422` → **200**

```json
{
  "phone": "+380636770422",
  "audience": "CLIENT",
  "code": "149476",
  "sent_at": "2026-10-28T20:30:17.316832428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34356ee3-95f2-4531-b8ea-8f9eea926a26",
  "code": "149476",
  "device_ref": "sandbox-5407"
}
```

```json
{
  "session_id": "bd27be22-e339-463a-aea7-b970b89ef7b9",
  "subject": {
    "type": "CLIENT",
    "id": "baec08bd-6245-49db-bceb-81f30f982f35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWVjMDhiZC02MjQ1LTQ5ZGItYmNlYi04MWYzMGY5ODJmMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzE3LCJpYXQiOjE3OTMyMTk0MTcsImp0aSI6ImQ1MWUyODg4LTk1OWYtNDhiZC1hMWFjLTE1YWFlOWViODNjYiIsInNpZCI6ImJkMjdiZTIyLWUzMzktNDYzYS1hZWE3LWI5NzBiODllZjdiOSJ9.gHmjgscbS2eKq-_RRAhHrBx0xEht3qTFjFzAhX6V3iw",
  "access_expires_at": "2026-10-28T20:45:17.611704883Z",
  "refresh_token": "CmQPNGHzCEQ0MzODN0QAk1W5cU6z7BO2dDOChi3ZZ4c",
  "refresh_expires_at": "2026-11-27T20:30:17.611212452Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "52d36001-f843-4354-af6c-5574bd34aeef",
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
  "id": "ca6eae49-e57c-4284-bd60-c52ce038dfd5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:35:17.883095Z",
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
  "command_id": "36d9629d-b3e9-493c-93ac-3338d6f3cad5",
  "quote_id": "ca6eae49-e57c-4284-bd60-c52ce038dfd5",
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
  "correlation_id": "e194aa71-0e1f-4e2b-a03d-7f860f11c0be"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2bfc1929-d51c-4ce6-bcfd-4ec8f321d349",
  "quote_id": "ca6eae49-e57c-4284-bd60-c52ce038dfd5",
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
  "id": "4b10648a-b030-4f9c-bd8d-25c0f28db2c1",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "baec08bd-6245-49db-bceb-81f30f982f35",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:30:18.463369Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4b10648a-b030-4f9c-bd8d-25c0f28db2c1/cancel` → **200**

```json
{
  "command_id": "4dab9915-1005-4689-bebf-5fe721e892d5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4b10648a-b030-4f9c-bd8d-25c0f28db2c1",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "baec08bd-6245-49db-bceb-81f30f982f35",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:30:18.463369Z",
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
  "command_id": "e3d6e282-a90c-4540-b057-35ecf2328315",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T20:30:19.066804Z"
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
      "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T20:30:19.066804Z"
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
  "device_ref": "sandbox-3174"
}
```

```json
{
  "challenge_id": "e2088938-5d2b-460c-a65c-014391af937a",
  "expires_at": "2026-10-28T20:35:19.933573278Z",
  "resend_available_at": "2026-10-28T20:30:20.933573278Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "651690",
  "sent_at": "2026-10-28T20:30:19.935868681Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2088938-5d2b-460c-a65c-014391af937a",
  "code": "651690",
  "device_ref": "sandbox-3174"
}
```

```json
{
  "session_id": "acff1f81-4367-44f8-88d4-3e420a809408",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDMyMCwiaWF0IjoxNzkzMjE5NDIwLCJqdGkiOiIxYWIwMzlmYS04ZDBjLTQ4ZjUtYmZiMy01NWU4OGU4OGQ0Y2EiLCJzaWQiOiJhY2ZmMWY4MS00MzY3LTQ0ZjgtODhkNC0zZTQyMGE4MDk0MDgifQ.4RCk8QVXeAPj0S1B1B5W99kiwjMGqIwpwDD_O1789Ek",
  "access_expires_at": "2026-10-28T20:45:20.231988273Z",
  "refresh_token": "oVen3O4tfpfC5RNcsjtGI-X4HGdqec8H6-yc1GiF_kA",
  "refresh_expires_at": "2026-11-27T20:30:20.231477978Z",
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
  "command_id": "bd9e699d-473c-438b-9eb7-47c881204711",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:20Z",
    "sequence": 1793219420760
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:20.778966Z",
  "last_location_at": "2026-10-28T20:30:20.778966Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677779134",
  "device_ref": "sandbox-28243"
}
```

```json
{
  "challenge_id": "29207e62-8ca1-44df-a5a6-cd6799e31363",
  "expires_at": "2026-10-28T20:35:21.047771757Z",
  "resend_available_at": "2026-10-28T20:30:22.047771757Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677779134` → **200**

```json
{
  "phone": "+380677779134",
  "audience": "CLIENT",
  "code": "522501",
  "sent_at": "2026-10-28T20:30:21.049925384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29207e62-8ca1-44df-a5a6-cd6799e31363",
  "code": "522501",
  "device_ref": "sandbox-28243"
}
```

```json
{
  "session_id": "448959e7-dead-4e26-a29a-09a6e4d778ca",
  "subject": {
    "type": "CLIENT",
    "id": "bf7d27e3-9730-4cd0-990a-7df1188062c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjdkMjdlMy05NzMwLTRjZDAtOTkwYS03ZGYxMTg4MDYyYzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzIxLCJpYXQiOjE3OTMyMTk0MjEsImp0aSI6IjcxZGJkODRmLWFlOGMtNDUzNC04Y2IzLTJmNDlhMmU3ZmJhYyIsInNpZCI6IjQ0ODk1OWU3LWRlYWQtNGUyNi1hMjlhLTA5YTZlNGQ3NzhjYSJ9.7CGBjFKY01jDA69vdYL1NwFum3U9Zw23aumRBDAXsIY",
  "access_expires_at": "2026-10-28T20:45:21.351942416Z",
  "refresh_token": "R2HBdk9XYmSpoV3C541vD1qlEr5-oP2O7gszuiDe5PA",
  "refresh_expires_at": "2026-11-27T20:30:21.351401105Z",
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
  "command_id": "67999733-b23c-4881-93f6-6c2d481152fa",
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
  "id": "97b69ceb-f36b-45f4-8a3b-4f0ae57d2618",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:35:21.895026Z",
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
  "command_id": "327124d9-6942-48ba-a908-777b453f785d",
  "platform": "ANDROID",
  "token": "sandbox-driver-c85b68ea-dbaa-4853-a831-fd438319310c"
}
```

```json
{
  "id": "3b6375d9-6b60-4688-823c-c063cab8bf38",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T20:30:22.188658Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "abdd0e86-9aa5-4487-9483-42e58a48e60f",
  "platform": "ANDROID",
  "token": "sandbox-rider-6f9e9c53-0855-4023-a8d3-08fa7191af13"
}
```

```json
{
  "id": "bcd7bba7-1126-41e2-a10a-56d1c72dd310",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T20:30:22.461262Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "99067b98-4e1d-43dd-8e33-dc6cd2236bf8",
  "quote_id": "97b69ceb-f36b-45f4-8a3b-4f0ae57d2618",
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
  "id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bf7d27e3-9730-4cd0-990a-7df1188062c8",
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
  "created_at": "2026-10-28T20:30:22.741659Z",
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
    "id": "32c6197e-29c3-4492-919a-78abcd9973aa",
    "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
    "expires_at": "2026-10-28T20:30:37.744986Z",
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

`POST /api/driver/v1/offers/32c6197e-29c3-4492-919a-78abcd9973aa/accept` → **200**

```json
{
  "command_id": "20595b37-f545-4e10-8aa3-f4a438a4c3ff"
}
```

```json
{
  "id": "c9a613fc-9082-483b-968c-ac9fd8cc0df9",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2e5a2a16-cb87-4c18-9054-58c304b9d28e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T20:30:22.717Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T20:30:22.717Z` → **200**

```json
[
  {
    "at": "2026-10-28T20:30:23.88675004Z",
    "token_suffix": "19310c",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "50a16099-7d21-4b5c-af0a-3929e8dfac51",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677779134&after=2026-10-28T20:30:22.717Z` → **200**

```json
[
  {
    "at": "2026-10-28T20:30:23.889041125Z",
    "token_suffix": "91af13",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "0ce0d184-f3a3-480b-8a27-4af129dfde86",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/9b1feab2-607d-4153-953a-9408f7c2f664/messages` → **201**

```json
{
  "command_id": "ffef2bba-7c48-4ab7-8c0d-10107704b96f",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "528f07f5-8f2d-4a32-8a60-d938bc3b0682",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T20:30:24.696016225Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2e5a2a16-cb87-4c18-9054-58c304b9d28e",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "assignment_id": "c9a613fc-9082-483b-968c-ac9fd8cc0df9",
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

`POST /api/driver/v1/trips/2e5a2a16-cb87-4c18-9054-58c304b9d28e/messages` → **201**

```json
{
  "command_id": "2e942328-5442-47d0-a993-5cf1621e2f1e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "7715bba0-60d8-4dc7-b166-c1d99277923a",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T20:30:25.232537328Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/9b1feab2-607d-4153-953a-9408f7c2f664/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/2e5a2a16-cb87-4c18-9054-58c304b9d28e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677779134"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/6cd4d3fb-fbc7-4a41-a3e3-223324a37f23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:26Z",
    "sequence": 1793219426417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:26.060654Z",
  "last_location_at": "2026-10-28T20:30:26.060654Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2e5a2a16-cb87-4c18-9054-58c304b9d28e",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "assignment_id": "c9a613fc-9082-483b-968c-ac9fd8cc0df9",
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

`POST /api/driver/v1/trips/2e5a2a16-cb87-4c18-9054-58c304b9d28e/arrive` → **200**

```json
{
  "command_id": "fed0368d-eb61-46b2-9dcd-6ae4c1e0cf24",
  "expected_version": 0
}
```

```json
{
  "id": "2e5a2a16-cb87-4c18-9054-58c304b9d28e",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "assignment_id": "c9a613fc-9082-483b-968c-ac9fd8cc0df9",
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
  "arrived_at": "2026-10-28T20:30:26.603277Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2e5a2a16-cb87-4c18-9054-58c304b9d28e/start` → **200**

```json
{
  "command_id": "08548a10-6aa3-403f-a244-2c813255e45c",
  "expected_version": 1
}
```

```json
{
  "id": "2e5a2a16-cb87-4c18-9054-58c304b9d28e",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "assignment_id": "c9a613fc-9082-483b-968c-ac9fd8cc0df9",
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
  "arrived_at": "2026-10-28T20:30:26.603277Z",
  "started_at": "2026-10-28T20:30:26.886465Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6cd4d3fb-fbc7-4a41-a3e3-223324a37f23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:27Z",
    "sequence": 1793219427168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:27.188012Z",
  "last_location_at": "2026-10-28T20:30:27.188012Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/2e5a2a16-cb87-4c18-9054-58c304b9d28e/complete` → **200**

```json
{
  "command_id": "e951b4d0-b21f-4a30-ab56-f05725c8b18d",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:30:27Z",
  "cash_received": true
}
```

```json
{
  "id": "2e5a2a16-cb87-4c18-9054-58c304b9d28e",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "assignment_id": "c9a613fc-9082-483b-968c-ac9fd8cc0df9",
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
  "arrived_at": "2026-10-28T20:30:26.603277Z",
  "started_at": "2026-10-28T20:30:26.886465Z",
  "completed_at": "2026-10-28T20:30:27.487726Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/9b1feab2-607d-4153-953a-9408f7c2f664` → **200**

```json
{
  "id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "short_number": 12,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "bf7d27e3-9730-4cd0-990a-7df1188062c8",
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
    "id": "c9a613fc-9082-483b-968c-ac9fd8cc0df9",
    "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2e5a2a16-cb87-4c18-9054-58c304b9d28e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:30:22.741659Z",
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
    "id": "9b1feab2-607d-4153-953a-9408f7c2f664",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T20:30:22.741659Z",
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
    "id": "2e5a2a16-cb87-4c18-9054-58c304b9d28e",
    "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
    "order_short_number": 12,
    "created_at": "2026-10-28T20:30:23.320259Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7eefeb4d-e4a5-480b-8cb4-2f15367a1611",
    "order_id": "c016e946-dfd8-44ff-894f-850768746e80",
    "order_short_number": 8,
    "created_at": "2026-10-28T20:29:24.557728Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "03c8544d-df91-4013-becd-6183509b6836",
    "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
    "order_short_number": 3,
    "created_at": "2026-10-28T20:28:40.173315Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d0e4ab68-5216-4f22-9492-e890411d08aa",
    "order_id": "3c5aa4fa-fdaa-4a92-96fb-b0025ab51a9c",
    "order_short_number": 2,
    "created_at": "2026-10-28T20:28:16.570203Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "55c02220-d04c-4250-b525-4adc51370852",
    "order_id": "63a1a643-7873-45a2-9ad6-fcb116a4c207",
    "order_short_number": 1,
    "created_at": "2026-10-28T20:28:07.097907Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
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

`GET /api/rider/v1/orders/9b1feab2-607d-4153-953a-9408f7c2f664/tip` → **200**

```json
{
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
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
  "available_until": "2026-10-29T20:30:27.487726Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9b1feab2-607d-4153-953a-9408f7c2f664/tip` → **201**

```json
{
  "command_id": "6dc098a3-7218-4478-8ff8-070ea5d6fe34",
  "amount_minor": 1100
}
```

```json
{
  "id": "e27cf569-4257-427c-84de-19a26146e52a",
  "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T20:30:32.502001Z"
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
  "session_id": "cf5d6a56-799d-4843-bef3-e4faefa18490",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzMzMsImlhdCI6MTc5MzIxOTQzMywianRpIjoiN2UzMDJlMzctNzBlOS00YzMzLWFhN2MtYTg1NWFkMmIzYjNiIiwic2lkIjoiY2Y1ZDZhNTYtNzk5ZC00ODQzLWJlZjMtZTRmYWVmYTE4NDkwIn0.Y6C2n7US43INRsUEcWHDJOkY30CS5GV9eXcxHK_wjrg",
  "access_expires_at": "2026-10-28T20:45:33.079476083Z",
  "refresh_token": "G7D9i33kPGhc5pZ12-bx2Y9zzsGNwpONOkB_1vDmNfs",
  "refresh_expires_at": "2026-10-29T08:30:33.078897311Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
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
          "RIDER": 3,
          "DRIVER": 1,
          "STAFF": 1
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
  "generated_at": "2026-10-28T20:30:33.361068904Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
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
  "generated_at": "2026-10-28T20:30:33.657336547Z"
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
  "session_id": "915209f4-0b40-49de-a8f2-5f3bb3fa2388",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzMzQsImlhdCI6MTc5MzIxOTQzNCwianRpIjoiMTFlZGQyMWQtNmI5NS00MjdhLTgwOWMtMGZhZDNlODQ5Yjc4Iiwic2lkIjoiOTE1MjA5ZjQtMGI0MC00OWRlLWE4ZjItNWYzYmIzZmEyMzg4In0.SFRKbPU6w_PS3ewVQNSNgTTASlWBXO50a-pLuvKaEqE",
  "access_expires_at": "2026-10-28T20:45:34.23494749Z",
  "refresh_token": "7gT6G_9g9Gd-VrrjGR5qkChGD5cM0P5zUO_SktZh4dQ",
  "refresh_expires_at": "2026-10-29T08:30:34.234391861Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9b1feab2-607d-4153-953a-9408f7c2f664/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:30:22.742176Z",
      "actor": {
        "type": "CLIENT",
        "id": "bf7d27e3-9730-4cd0-990a-7df1188062c8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
        "quote_id": "97b69ceb-f36b-45f4-8a3b-4f0ae57d2618",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e43d15e7-a44e-41e1-a50c-6cc1ad515bd7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:30:22.744175Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
        "attempt_id": "4c5be226-73c9-4cff-bd8b-a42143cdebcf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e43d15e7-a44e-41e1-a50c-6cc1ad515bd7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:30:22.747099Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "32c6197e-29c3-4492-919a-78abcd9973aa",
        "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "e43d15e7-a44e-41e1-a50c-6cc1ad515bd7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T20:30:23.32206Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "32c6197e-29c3-4492-919a-78abcd9973aa",
        "order_id": "9b1feab2-607d-4153-953a-9408f7c2f664",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c9a613fc-9082-483b-968c-ac9fd8cc0df9"
      },
      "correlation_id": "31a44515-16ca-4152-8446-1ba2c1457356"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T20:30:34.779299838Z",
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
      "last_location_at": "2026-10-28T20:30:27.188012Z",
      "order_id": null
    }
  ]
}
```

Done: order 9b1feab2-607d-4153-953a-9408f7c2f664.

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
  "session_id": "7293f9dc-b17f-4561-86c1-48c457c7e2c8",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzMzUsImlhdCI6MTc5MzIxOTQzNSwianRpIjoiZTU1NzY4MDYtNGQ0Mi00NDM0LWJhNDMtOTMyNzFmNjQ3MzJmIiwic2lkIjoiNzI5M2Y5ZGMtYjE3Zi00NTYxLTg2YzEtNDhjNDU3YzdlMmM4In0.zGTQ-U5QY59FKpMUkIcvs51RWX8_ZCYoxAr5y_79xhw",
  "access_expires_at": "2026-10-28T20:45:35.364845375Z",
  "refresh_token": "IsD5hmVuz-M6UREEMvRyk-MFPvwNm2Q9zgrwSUjyuL4",
  "refresh_expires_at": "2026-10-29T08:30:35.364274147Z",
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
  "command_id": "3cf2a079-3b94-48f1-8fa1-6b500d09b3e6",
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
  "timestamp": "2026-10-28T20:30:36.000+0000",
  "channel": {
    "id": "1730052000.2004215813",
    "linkedid": "1730052000.2004215813",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671323543"
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
  "timestamp": "2026-10-28T20:30:36.000+0000",
  "channel": {
    "id": "1730052000.2004215813",
    "linkedid": "1730052000.2004215813",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671323543"
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
  "session_id": "161c4081-40f7-42c1-9f76-05fb7198bccc",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzMzYsImlhdCI6MTc5MzIxOTQzNiwianRpIjoiNzhhNzk4YjktZjBlZC00YTc3LTlmNjktYzVkODhmYzlkNzBiIiwic2lkIjoiMTYxYzQwODEtNDBmNy00MmMxLTlmNzYtMDVmYjcxOThiY2NjIn0.Q2OH9B3XJuD68GZ57kDmJ-IuMZFpUmMu2YHHkyVaVb4",
  "access_expires_at": "2026-10-28T20:45:36.540082692Z",
  "refresh_token": "pcD6baKk1WmIHUCsQWigwiV7ldc3aMR4VW5JMk_Y88U",
  "refresh_expires_at": "2026-10-29T08:30:36.539538815Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "d51c3455-4e2a-4b31-b4b3-f357b00839af",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671323543",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T20:30:36Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/d51c3455-4e2a-4b31-b4b3-f357b00839af/answer` → **200**

```json
{
  "command_id": "74d1de58-e013-4e15-bc87-f8f2f34e474f"
}
```

```json
{
  "id": "d51c3455-4e2a-4b31-b4b3-f357b00839af",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671323543",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "order_ids": [],
  "started_at": "2026-10-28T20:30:36Z",
  "answered_at": "2026-10-28T20:30:37.109188Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2004215813",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4865f70d-c14e-4498-9f3c-245cce00532d",
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
  "id": "93515e2f-de52-40f7-bad8-7962f5dfcd47",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:35:37.422336Z",
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
  "command_id": "246adf7b-b1bb-4281-9c1f-11d700abf53b",
  "quote_id": "93515e2f-de52-40f7-bad8-7962f5dfcd47",
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
    "phone": "+380671323543"
  },
  "call_id": "d51c3455-4e2a-4b31-b4b3-f357b00839af"
}
```

```json
{
  "id": "78922f9f-414a-4e40-97f0-c4e71a307b40",
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
  "created_at": "2026-10-28T20:30:37.712209Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671323543"
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
    "id": "1730052000.2004215813",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "d51c3455-4e2a-4b31-b4b3-f357b00839af",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671323543",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [
        "78922f9f-414a-4e40-97f0-c4e71a307b40"
      ],
      "started_at": "2026-10-28T20:30:36Z",
      "answered_at": "2026-10-28T20:30:37.109188Z",
      "ended_at": "2026-10-28T20:30:38.025926Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "e249d6ea-c917-449d-9de6-d754b8df9c25",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671003131",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [],
      "started_at": "2026-10-28T20:28:24.572761Z",
      "answered_at": "2026-10-28T20:28:24.894484Z",
      "ended_at": "2026-10-28T20:28:25.188539Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:28:34.476068Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/78922f9f-414a-4e40-97f0-c4e71a307b40` → **200**

```json
{
  "id": "78922f9f-414a-4e40-97f0-c4e71a307b40",
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
  "created_at": "2026-10-28T20:30:37.712209Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671323543"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/78922f9f-414a-4e40-97f0-c4e71a307b40` → **200**

```json
{
  "id": "78922f9f-414a-4e40-97f0-c4e71a307b40",
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
  "created_at": "2026-10-28T20:30:37.712209Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671323543"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/78922f9f-414a-4e40-97f0-c4e71a307b40/cancel` → **200**

```json
{
  "command_id": "0aefce06-57f3-4cd0-aac2-5c048f11a94f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "78922f9f-414a-4e40-97f0-c4e71a307b40",
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
  "created_at": "2026-10-28T20:30:37.712209Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671323543"
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

Done: call d51c3455-4e2a-4b31-b4b3-f357b00839af with order 78922f9f-414a-4e40-97f0-c4e71a307b40.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2985"
}
```

```json
{
  "challenge_id": "9192b3e9-3782-4e26-8dc5-dc3a1bc34a95",
  "expires_at": "2026-10-28T20:35:39.223700754Z",
  "resend_available_at": "2026-10-28T20:30:40.223700754Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "031477",
  "sent_at": "2026-10-28T20:30:39.22612712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9192b3e9-3782-4e26-8dc5-dc3a1bc34a95",
  "code": "031477",
  "device_ref": "sandbox-2985"
}
```

```json
{
  "session_id": "5bc50d6f-0529-4318-97a7-7720d4bccb32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDMzOSwiaWF0IjoxNzkzMjE5NDM5LCJqdGkiOiI1OTU3NTk4Yi01ODY0LTRjN2YtOWFjZS00ZjkyNjY0MDYzMTIiLCJzaWQiOiI1YmM1MGQ2Zi0wNTI5LTQzMTgtOTdhNy03NzIwZDRiY2NiMzIifQ.YsvAUkh7Biqc6fc9d2CtK27WXrNeH8HSYG2lI1YsryE",
  "access_expires_at": "2026-10-28T20:45:39.528338096Z",
  "refresh_token": "fjAUwmpbDfaNPkAKInLDCqBhim-VmpPDdeKhFzkHqKI",
  "refresh_expires_at": "2026-11-27T20:30:39.527814567Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:27.188012Z",
  "last_location_at": "2026-10-28T20:30:27.188012Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6cd4d3fb-fbc7-4a41-a3e3-223324a37f23/handover` → **200**

```json
{
  "command_id": "87076f8d-d12d-4280-a2a6-eb6511d9feab",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:27.188012Z",
  "last_location_at": "2026-10-28T20:30:27.188012Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6cd4d3fb-fbc7-4a41-a3e3-223324a37f23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:40Z",
    "sequence": 1793219440363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:40.381143Z",
  "last_location_at": "2026-10-28T20:30:40.381143Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668286583",
  "device_ref": "sandbox-2017"
}
```

```json
{
  "challenge_id": "b2ad3ebb-84b7-415a-b0e7-9953a76dc519",
  "expires_at": "2026-10-28T20:35:40.656790802Z",
  "resend_available_at": "2026-10-28T20:30:41.656790802Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668286583` → **200**

```json
{
  "phone": "+380668286583",
  "audience": "CLIENT",
  "code": "429157",
  "sent_at": "2026-10-28T20:30:40.659006982Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2ad3ebb-84b7-415a-b0e7-9953a76dc519",
  "code": "429157",
  "device_ref": "sandbox-2017"
}
```

```json
{
  "session_id": "a172836f-afdf-4cf6-a5fb-ec173e18b698",
  "subject": {
    "type": "CLIENT",
    "id": "af3f7b98-f545-4a05-b892-c683e7533f73"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZjNmN2I5OC1mNTQ1LTRhMDUtYjg5Mi1jNjgzZTc1MzNmNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzQwLCJpYXQiOjE3OTMyMTk0NDAsImp0aSI6IjMwN2FkZWMxLWJkYzEtNDhjZS04Nzk2LTE3YzRhMGNjN2UzMiIsInNpZCI6ImExNzI4MzZmLWFmZGYtNGNmNi1hNWZiLWVjMTczZTE4YjY5OCJ9.Re-OcsS2prF92ay_2HRE_0Rte449Lo66BL7NTsfGhUE",
  "access_expires_at": "2026-10-28T20:45:40.974296878Z",
  "refresh_token": "ban8WujtOpHBvr5v4aBIggt4gDpzHHvz7g1RZTnilwI",
  "refresh_expires_at": "2026-11-27T20:30:40.973769883Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab760793-268a-40a3-a73d-57396966c068",
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
  "id": "bf44deed-35f3-44d4-a1af-7b30bb76eb97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:35:41.260336Z",
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
  "command_id": "28021486-3669-48a3-ae6c-d66cde0e49a3",
  "quote_id": "bf44deed-35f3-44d4-a1af-7b30bb76eb97",
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
  "id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "af3f7b98-f545-4a05-b892-c683e7533f73",
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
  "created_at": "2026-10-28T20:30:41.552425Z",
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
    "id": "fed36f75-2601-44fc-98fe-99e1f1bc97b0",
    "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
    "expires_at": "2026-10-28T20:30:56.555706Z",
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

`POST /api/driver/v1/offers/fed36f75-2601-44fc-98fe-99e1f1bc97b0/accept` → **200**

```json
{
  "command_id": "baa1c685-1251-43a2-a48f-a499d6dc56e1"
}
```

```json
{
  "id": "0336db31-fa2c-4eac-89cc-7521aa3fee3d",
  "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9d62cb2-1806-4b10-8239-a62d1f7f28b5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9d62cb2-1806-4b10-8239-a62d1f7f28b5",
  "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
  "assignment_id": "0336db31-fa2c-4eac-89cc-7521aa3fee3d",
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

`POST /api/driver/v1/work-sessions/6cd4d3fb-fbc7-4a41-a3e3-223324a37f23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:42Z",
    "sequence": 1793219442673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:42.691821Z",
  "last_location_at": "2026-10-28T20:30:42.691821Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a9d62cb2-1806-4b10-8239-a62d1f7f28b5/arrive` → **200**

```json
{
  "command_id": "b87eea1d-e4ec-4633-ac4f-5e46ce996146",
  "expected_version": 0
}
```

```json
{
  "id": "a9d62cb2-1806-4b10-8239-a62d1f7f28b5",
  "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
  "assignment_id": "0336db31-fa2c-4eac-89cc-7521aa3fee3d",
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
  "arrived_at": "2026-10-28T20:30:42.980139Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a9d62cb2-1806-4b10-8239-a62d1f7f28b5/start` → **200**

```json
{
  "command_id": "da25a74f-fe0f-4439-b404-2e2991903906",
  "expected_version": 1
}
```

```json
{
  "id": "a9d62cb2-1806-4b10-8239-a62d1f7f28b5",
  "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
  "assignment_id": "0336db31-fa2c-4eac-89cc-7521aa3fee3d",
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
  "arrived_at": "2026-10-28T20:30:42.980139Z",
  "started_at": "2026-10-28T20:30:43.27209Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/6cd4d3fb-fbc7-4a41-a3e3-223324a37f23/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:43Z",
    "sequence": 1793219443550
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:43.569285Z",
  "last_location_at": "2026-10-28T20:30:43.569285Z",
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
  "device_ref": "sandbox-22793"
}
```

```json
{
  "challenge_id": "b3a04ff3-3c38-406c-8eb0-e39e12214e06",
  "expires_at": "2026-10-28T20:35:43.872561073Z",
  "resend_available_at": "2026-10-28T20:30:44.872561073Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "271277",
  "sent_at": "2026-10-28T20:30:43.875005424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3a04ff3-3c38-406c-8eb0-e39e12214e06",
  "code": "271277",
  "device_ref": "sandbox-22793"
}
```

```json
{
  "session_id": "6c3f401f-2439-4bcf-b823-e1d258ee8f04",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDM0NCwiaWF0IjoxNzkzMjE5NDQ0LCJqdGkiOiIxY2VmODdkZi1hNTExLTQ5ODEtODNhNi1kMTdlNDBhY2UxZWQiLCJzaWQiOiI2YzNmNDAxZi0yNDM5LTRiY2YtYjgyMy1lMWQyNThlZThmMDQifQ.CKBzwlXETSwZ1pORHwz5Ityp7lmun0blIAYwdKGj6ZU",
  "access_expires_at": "2026-10-28T20:45:44.182134993Z",
  "refresh_token": "K3IiaBQqgjhSfrTQZcFfXo4dJkvkjxASGsnSC2HM49s",
  "refresh_expires_at": "2026-11-27T20:30:44.181580176Z",
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
  "command_id": "48a27268-543c-4462-96d6-ce3cb92c2060",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:44Z",
    "sequence": 1793219444735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "815a91c5-5df5-4d76-a814-bbaddc520643",
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
  "last_heartbeat_at": "2026-10-28T20:30:44.754598Z",
  "last_location_at": "2026-10-28T20:30:44.754598Z",
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
  "session_id": "d09470a6-3af8-4671-99f9-aec2913ee802",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzNDUsImlhdCI6MTc5MzIxOTQ0NSwianRpIjoiZDNhZDYxYTQtN2NkYy00OWYyLTg5MzgtYTdlOWQ1N2UyZTE1Iiwic2lkIjoiZDA5NDcwYTYtM2FmOC00NjcxLTk5ZjktYWVjMjkxM2VlODAyIn0.Jxrhbn25KojSI5XMqJKxWEh7yaBEdOFN0YcsdqhYsfs",
  "access_expires_at": "2026-10-28T20:45:45.329662131Z",
  "refresh_token": "6j1RxFs60foBSCglK6_JN7i7zstZqAI7zOlVWaUhs1U",
  "refresh_expires_at": "2026-10-29T08:30:45.329047862Z",
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
  "session_id": "f66a1fba-4fd0-4c3e-ac36-0a39dfb197ec",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzNDUsImlhdCI6MTc5MzIxOTQ0NSwianRpIjoiZDhlMzZmMTQtNDYxZi00YTczLTg5N2QtODI2MjgxMmRkNDI5Iiwic2lkIjoiZjY2YTFmYmEtNGZkMC00YzNlLWFjMzYtMGEzOWRmYjE5N2VjIn0.iVWbiK8R-YluCMwcLkzobnhqIWhyyXaQTw1YxNgzCCc",
  "access_expires_at": "2026-10-28T20:45:45.892671495Z",
  "refresh_token": "LdKj_ZkEwB_Kjy94dG4R-h6m0piopT1Mi_o6GlVQbjE",
  "refresh_expires_at": "2026-10-29T08:30:45.892049702Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5d5fba14-7c7b-43e8-8613-7acc9dfb16d2` → **200**

```json
{
  "id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
  "short_number": 14,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "af3f7b98-f545-4a05-b892-c683e7533f73",
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
    "id": "0336db31-fa2c-4eac-89cc-7521aa3fee3d",
    "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "a9d62cb2-1806-4b10-8239-a62d1f7f28b5",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T20:30:41.552425Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5d5fba14-7c7b-43e8-8613-7acc9dfb16d2/interrupt` → **200**

```json
{
  "command_id": "bc17e18a-9da9-4f19-a4b3-5323cec38031",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
    "short_number": 14,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "af3f7b98-f545-4a05-b892-c683e7533f73",
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
      "id": "0336db31-fa2c-4eac-89cc-7521aa3fee3d",
      "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "a9d62cb2-1806-4b10-8239-a62d1f7f28b5",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T20:30:41.552425Z",
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
    "id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
    "short_number": 15,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "af3f7b98-f545-4a05-b892-c683e7533f73",
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
    "id": "39be4b5d-d81a-402a-a4c9-70594d5a3b29",
    "order_id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
    "expires_at": "2026-10-28T20:31:01.495652Z",
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

`POST /api/driver/v1/offers/39be4b5d-d81a-402a-a4c9-70594d5a3b29/accept` → **200**

```json
{
  "command_id": "0ed9bcdf-f4b8-49ed-ae9b-32dec04fde6d"
}
```

```json
{
  "id": "6784c879-543b-49a6-ad59-0f74ae069670",
  "order_id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "962ceb82-5c23-4640-8a20-0e1661d12595",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "962ceb82-5c23-4640-8a20-0e1661d12595",
  "order_id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
  "assignment_id": "6784c879-543b-49a6-ad59-0f74ae069670",
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
  "session_id": "815a91c5-5df5-4d76-a814-bbaddc520643",
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
  "last_heartbeat_at": "2026-10-28T20:30:44.754598Z",
  "last_location_at": "2026-10-28T20:30:44.754598Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/815a91c5-5df5-4d76-a814-bbaddc520643/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:30:47Z",
    "sequence": 1793219447924
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "815a91c5-5df5-4d76-a814-bbaddc520643",
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
  "last_heartbeat_at": "2026-10-28T20:30:47.943272Z",
  "last_location_at": "2026-10-28T20:30:47.943272Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/962ceb82-5c23-4640-8a20-0e1661d12595/arrive` → **200**

```json
{
  "command_id": "91b2cc5c-569c-4a8e-b527-ded26f894f80",
  "expected_version": 0
}
```

```json
{
  "id": "962ceb82-5c23-4640-8a20-0e1661d12595",
  "order_id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
  "assignment_id": "6784c879-543b-49a6-ad59-0f74ae069670",
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
  "arrived_at": "2026-10-28T20:30:48.226253Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/962ceb82-5c23-4640-8a20-0e1661d12595/start` → **200**

```json
{
  "command_id": "c99319e7-7353-4130-b081-7265db679c44",
  "expected_version": 1
}
```

```json
{
  "id": "962ceb82-5c23-4640-8a20-0e1661d12595",
  "order_id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
  "assignment_id": "6784c879-543b-49a6-ad59-0f74ae069670",
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
  "arrived_at": "2026-10-28T20:30:48.226253Z",
  "started_at": "2026-10-28T20:30:48.511185Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/962ceb82-5c23-4640-8a20-0e1661d12595/complete` → **200**

```json
{
  "command_id": "50a062b6-52d2-42f8-a92e-4099f6702ad7",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:30:48Z"
}
```

```json
{
  "id": "962ceb82-5c23-4640-8a20-0e1661d12595",
  "order_id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
  "assignment_id": "6784c879-543b-49a6-ad59-0f74ae069670",
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
  "arrived_at": "2026-10-28T20:30:48.226253Z",
  "started_at": "2026-10-28T20:30:48.511185Z",
  "completed_at": "2026-10-28T20:30:48.819405Z",
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
    "id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
    "short_number": 15,
    "status": "FULFILLED",
    "created_at": "2026-10-28T20:30:46.484047Z",
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
    "id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
    "short_number": 14,
    "status": "CANCELLED",
    "created_at": "2026-10-28T20:30:41.552425Z",
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

`GET /api/operator/v1/orders/5d5fba14-7c7b-43e8-8613-7acc9dfb16d2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T20:30:41.552986Z",
      "actor": {
        "type": "CLIENT",
        "id": "af3f7b98-f545-4a05-b892-c683e7533f73",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
        "quote_id": "bf44deed-35f3-44d4-a1af-7b30bb76eb97",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f25871ad-9925-46f6-b40f-12f14b8be9d1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T20:30:41.55499Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
        "attempt_id": "ff729802-30fd-4211-a30f-01081136b5f8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f25871ad-9925-46f6-b40f-12f14b8be9d1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T20:30:41.557772Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "fed36f75-2601-44fc-98fe-99e1f1bc97b0",
        "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f25871ad-9925-46f6-b40f-12f14b8be9d1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T20:30:42.136832Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "fed36f75-2601-44fc-98fe-99e1f1bc97b0",
        "order_id": "5d5fba14-7c7b-43e8-8613-7acc9dfb16d2",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "0336db31-fa2c-4eac-89cc-7521aa3fee3d"
      },
      "correlation_id": "5b471f9b-5a46-4d89-800a-dad03940cf50"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/b218e90e-e773-457a-a227-c6bb6ca2b18c/tip` → **200**

```json
{
  "order_id": "b218e90e-e773-457a-a227-c6bb6ca2b18c",
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
  "available_until": "2026-10-29T20:30:48.819405Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/b218e90e-e773-457a-a227-c6bb6ca2b18c/tip` → **409**

```json
{
  "command_id": "09e73a23-9a36-4312-9e71-dfd3711502ca",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/b218e90e-e773-457a-a227-c6bb6ca2b18c/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "700973c6-e788-4eb3-953d-1230cd8bfe0f"
}
```

Done: interrupted 5d5fba14-7c7b-43e8-8613-7acc9dfb16d2, follow-up b218e90e-e773-457a-a227-c6bb6ca2b18c.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6cd4d3fb-fbc7-4a41-a3e3-223324a37f23",
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
  "last_heartbeat_at": "2026-10-28T20:30:43.569285Z",
  "last_location_at": "2026-10-28T20:30:43.569285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6cd4d3fb-fbc7-4a41-a3e3-223324a37f23/close` → **200**

```json
{
  "command_id": "0996ba3c-c32e-4f9a-a502-340fdefa847f",
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
  "session_id": "815a91c5-5df5-4d76-a814-bbaddc520643",
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
  "last_heartbeat_at": "2026-10-28T20:30:47.943272Z",
  "last_location_at": "2026-10-28T20:30:47.943272Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/815a91c5-5df5-4d76-a814-bbaddc520643/close` → **200**

```json
{
  "command_id": "d9db9b7e-e3d0-4875-9995-3c4335888444",
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
  "session_id": "61acd65c-9137-412c-a9e6-97afc250287c",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzNTQsImlhdCI6MTc5MzIxOTQ1NCwianRpIjoiNWYzMDQzNzUtOGE1Ni00YjhhLWI2MWYtZjc1ZDg4ODYxYzRhIiwic2lkIjoiNjFhY2Q2NWMtOTEzNy00MTJjLWE5ZTYtOTdhZmMyNTAyODdjIn0.IsoEvGZDWe-joSbhRPxmLhIxcxvElHlMrbUMOnVMkv8",
  "access_expires_at": "2026-10-28T20:45:54.973575486Z",
  "refresh_token": "9C7hcMjPz7XqsbBUggQJmRcMXA0MLIqKvarNSA_jpWo",
  "refresh_expires_at": "2026-10-29T08:30:54.97278552Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c90674e6-c93e-4bd4-bca1-1377bb938fa3",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T20:30:55Z"
}
```

```json
{
  "id": "7d44c2d7-73ba-4a09-8153-515b1566d7b1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T20:30:55Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7d44c2d7-73ba-4a09-8153-515b1566d7b1/publish` → **200**

```json
{
  "command_id": "93bff158-6cea-4d5b-b6a9-7a5fdf5dfb17",
  "expected_version": 0
}
```

```json
{
  "id": "7d44c2d7-73ba-4a09-8153-515b1566d7b1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T20:30:55.564357Z",
  "published_at": "2026-10-28T20:30:55.564357Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "7d44c2d7-73ba-4a09-8153-515b1566d7b1",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T20:30:55.564357Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637957560",
  "device_ref": "sandbox-30408"
}
```

```json
{
  "challenge_id": "8c728977-902d-4643-ba00-8a249a780835",
  "expires_at": "2026-10-28T20:35:56.1206956Z",
  "resend_available_at": "2026-10-28T20:30:57.1206956Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637957560` → **200**

```json
{
  "phone": "+380637957560",
  "audience": "CLIENT",
  "code": "412990",
  "sent_at": "2026-10-28T20:30:56.123450059Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c728977-902d-4643-ba00-8a249a780835",
  "code": "412990",
  "device_ref": "sandbox-30408"
}
```

```json
{
  "session_id": "a8dc1b54-c7d1-487e-9809-ad05823b1c8b",
  "subject": {
    "type": "CLIENT",
    "id": "7a9d4cf6-c842-46e3-ac61-7a38efd15f51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YTlkNGNmNi1jODQyLTQ2ZTMtYWM2MS03YTM4ZWZkMTVmNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzU2LCJpYXQiOjE3OTMyMTk0NTYsImp0aSI6ImEzNGQ1NTk4LTIzMGUtNDI0Yi1iMTBhLWU1OTBhNmRhYzUyYyIsInNpZCI6ImE4ZGMxYjU0LWM3ZDEtNDg3ZS05ODA5LWFkMDU4MjNiMWM4YiJ9.PAUoVB2UeEUzvefYY5BqifYpbr6y_xkJ8s10ZqPXQD0",
  "access_expires_at": "2026-10-28T20:45:56.435820876Z",
  "refresh_token": "iSnuWCoANn2Ggnt4iwAZH9n6sE92YX61ltQ7i9IrbJA",
  "refresh_expires_at": "2026-11-27T20:30:56.43525828Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "7d44c2d7-73ba-4a09-8153-515b1566d7b1",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T20:30:55.564357Z",
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
  "command_id": "98dc14d2-e518-4b7c-956d-05fc576b7f2a",
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
  "id": "3906c665-bbb1-40ad-ae93-4139ccd1466d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:35:56.995293Z",
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
  "command_id": "e847730f-a0f7-4343-9bb5-304f5fb5fbd2",
  "quote_id": "3906c665-bbb1-40ad-ae93-4139ccd1466d",
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
  "correlation_id": "a278e2ef-9167-448e-8150-234550c98280"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "e1e82d1e-95ff-4ebc-97cf-b39c34d41831",
  "version_id": "7d44c2d7-73ba-4a09-8153-515b1566d7b1",
  "language": "uk"
}
```

```json
{
  "version_id": "7d44c2d7-73ba-4a09-8153-515b1566d7b1",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T20:30:57.579978Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55e6400e-e4fc-4116-b25f-eb2ea3980584",
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
  "id": "9f539104-cdae-430d-a88e-5fd6eec1dab3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:35:57.867173Z",
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
  "command_id": "823da5d8-dffe-450e-895f-5a253563860c",
  "quote_id": "9f539104-cdae-430d-a88e-5fd6eec1dab3",
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
  "id": "cc440dd4-f913-4e2e-9695-ef8a4e71bb08",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a9d4cf6-c842-46e3-ac61-7a38efd15f51",
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
  "created_at": "2026-10-28T20:30:58.167188Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cc440dd4-f913-4e2e-9695-ef8a4e71bb08` → **200**

```json
{
  "id": "cc440dd4-f913-4e2e-9695-ef8a4e71bb08",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7a9d4cf6-c842-46e3-ac61-7a38efd15f51",
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
  "created_at": "2026-10-28T20:30:58.167188Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cc440dd4-f913-4e2e-9695-ef8a4e71bb08/cancel` → **200**

```json
{
  "command_id": "45c373e3-42b0-4f7d-a1d9-f30e9cd0e5c2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cc440dd4-f913-4e2e-9695-ef8a4e71bb08",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7a9d4cf6-c842-46e3-ac61-7a38efd15f51",
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
  "created_at": "2026-10-28T20:30:58.167188Z",
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

`POST /api/admin/v1/legal-documents/7d44c2d7-73ba-4a09-8153-515b1566d7b1` → **409**

```json
{
  "command_id": "fd450d83-35d2-4fea-95dd-1479ca9a6750",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T20:30:59Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/7d44c2d7-73ba-4a09-8153-515b1566d7b1",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "58fa09d1-731f-417c-b209-e2310ccec825"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "d3a665d4-0bd5-48f5-9077-9c38c73b0055",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T20:30:59Z"
}
```

```json
{
  "id": "6ebd36c1-0ef9-41b5-b345-c224e665e382",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T20:30:59Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/6ebd36c1-0ef9-41b5-b345-c224e665e382/publish` → **200**

```json
{
  "command_id": "09af8bca-c9bb-4edb-8c41-e933c1105de3",
  "expected_version": 0
}
```

```json
{
  "id": "6ebd36c1-0ef9-41b5-b345-c224e665e382",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T20:30:59.669665Z",
  "published_at": "2026-10-28T20:30:59.669665Z",
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
  "device_ref": "sandbox-15304"
}
```

```json
{
  "challenge_id": "02594e01-f03a-4a2c-aeb4-e48e30b0e3c1",
  "expires_at": "2026-10-28T20:35:59.968962066Z",
  "resend_available_at": "2026-10-28T20:31:00.968962066Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "560681",
  "sent_at": "2026-10-28T20:30:59.971294397Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02594e01-f03a-4a2c-aeb4-e48e30b0e3c1",
  "code": "560681",
  "device_ref": "sandbox-15304"
}
```

```json
{
  "session_id": "d6227cd5-d066-45ee-be33-c16d56cf7053",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDM2MCwiaWF0IjoxNzkzMjE5NDYwLCJqdGkiOiJlZDRiZDMyMS0xOThkLTQ4MDEtYmZhMy04ZDgzZTVmNzU1NjkiLCJzaWQiOiJkNjIyN2NkNS1kMDY2LTQ1ZWUtYmUzMy1jMTZkNTZjZjcwNTMifQ.GgW0x9FBQy4cM3O-YhpL05-3RoqMAJ7yKGze9DUW2bk",
  "access_expires_at": "2026-10-28T20:46:00.280726337Z",
  "refresh_token": "_QYOkHRv68Q-nTsXHeQOQ0WF9d9GoEZjbo74MNFaj6o",
  "refresh_expires_at": "2026-11-27T20:31:00.280180046Z",
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
  "command_id": "b7cda1e9-4282-49e9-a1a4-024e45f59aa5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:31:00Z",
    "sequence": 1793219460832
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9739dcd8-d95c-4335-bc17-aac3caebe8cd",
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
  "last_heartbeat_at": "2026-10-28T20:31:00.851853Z",
  "last_location_at": "2026-10-28T20:31:00.851853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674552740",
  "device_ref": "sandbox-14715"
}
```

```json
{
  "challenge_id": "3b0e95de-e64f-4e8a-886e-bd665f8f6877",
  "expires_at": "2026-10-28T20:36:01.137121774Z",
  "resend_available_at": "2026-10-28T20:31:02.137121774Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674552740` → **200**

```json
{
  "phone": "+380674552740",
  "audience": "CLIENT",
  "code": "101975",
  "sent_at": "2026-10-28T20:31:01.139676238Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b0e95de-e64f-4e8a-886e-bd665f8f6877",
  "code": "101975",
  "device_ref": "sandbox-14715"
}
```

```json
{
  "session_id": "9030948e-babc-4288-8674-d8013880d969",
  "subject": {
    "type": "CLIENT",
    "id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZjkyOTFkNS01NmVlLTRiZGItYTBjMC05YzdhZDJmYTJmM2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzYxLCJpYXQiOjE3OTMyMTk0NjEsImp0aSI6IjhlOGE5YmZmLWJiM2YtNDhmOS1hMzcxLWFlOWRmMGViZGI4NyIsInNpZCI6IjkwMzA5NDhlLWJhYmMtNDI4OC04Njc0LWQ4MDEzODgwZDk2OSJ9.c31V9bp1F9tPDVcXC5PdFieHR2rmv1sq3mw8_ZiKgZo",
  "access_expires_at": "2026-10-28T20:46:01.436561285Z",
  "refresh_token": "3KUf1dDQ-ESl6PbskIS4X-CXJK0UmhhqZnsqZe5TWaI",
  "refresh_expires_at": "2026-11-27T20:31:01.435997531Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f456b28b-ae45-45e4-940e-c06564ef2a83",
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
  "id": "b3c03bd9-48f4-43d3-b7ba-74fd9c2b2726",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:01.744Z",
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
  "command_id": "f958d35a-ac4c-4122-8f67-36999ad974b8",
  "quote_id": "b3c03bd9-48f4-43d3-b7ba-74fd9c2b2726",
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
    "phone": "+380673956222"
  }
}
```

```json
{
  "id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:31:02.084313Z",
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
    "id": "3d7ee84d-3fa7-4948-be37-4f91d8e384e2",
    "order_id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
    "expires_at": "2026-10-28T20:31:17.088311Z",
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

`POST /api/driver/v1/offers/3d7ee84d-3fa7-4948-be37-4f91d8e384e2/accept` → **200**

```json
{
  "command_id": "eb4e4c95-5265-4b31-b777-61945803e5fd"
}
```

```json
{
  "id": "baec90a2-1285-4c08-8872-ce3a1e372650",
  "order_id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "296d9d74-e861-4a97-8b35-4db49a2e675a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "296d9d74-e861-4a97-8b35-4db49a2e675a",
  "order_id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
  "assignment_id": "baec90a2-1285-4c08-8872-ce3a1e372650",
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
    "phone": "+380673956222"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5865a378-ff2c-48cb-b24e-24936e02c724",
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
  "id": "409918ce-7373-41e9-8bc3-f458acf9d74e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:03.235316Z",
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
  "command_id": "6038250e-355a-476b-b1fb-4f3771700756",
  "quote_id": "409918ce-7373-41e9-8bc3-f458acf9d74e",
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
  "id": "7968eb8e-c956-4e2c-ae2a-9b551ecf500e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:31:03.532649Z",
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
  "command_id": "39ac6e4a-1c49-446b-9a8e-54f041356aef",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T23:31:03Z"
}
```

```json
{
  "id": "2c2f3de7-39e6-4291-b2aa-b2c7e5b9fab6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:03.850911Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T23:31:03Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "82e2b942-1af2-4787-8e87-8c5faf69c70a",
  "quote_id": "2c2f3de7-39e6-4291-b2aa-b2c7e5b9fab6",
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
  "pickup_at": "2026-10-28T23:31:03Z"
}
```

```json
{
  "id": "0ce80ad7-cf0e-4a23-b016-18937ad613f7",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T20:31:04.166475Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T23:31:03Z",
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
  "command_id": "2792a167-7b11-4fa2-87a8-3c96a10d7f2e",
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
  "id": "7de20450-0126-4413-b749-f7298d2b85ee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:04.478295Z",
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
  "command_id": "1ab8ef98-d428-4375-ae3b-f90feb9878a4",
  "quote_id": "7de20450-0126-4413-b749-f7298d2b85ee",
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
  "correlation_id": "d4aae454-187b-4efa-ad4a-113bdd086f77"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "0ce80ad7-cf0e-4a23-b016-18937ad613f7",
      "short_number": 19,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T20:31:04.166475Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T23:31:03Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "7968eb8e-c956-4e2c-ae2a-9b551ecf500e",
      "short_number": 18,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T20:31:03.532649Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
      "short_number": 17,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "7968eb8e-c956-4e2c-ae2a-9b551ecf500e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:31:03.532649Z",
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

`GET /api/rider/v1/orders/d7f8457b-8510-4f07-a9aa-eac9e902ea0a` → **200**

```json
{
  "id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
  "short_number": 17,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "baec90a2-1285-4c08-8872-ce3a1e372650",
    "order_id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "296d9d74-e861-4a97-8b35-4db49a2e675a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T20:31:02.084313Z",
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
    "location_at": "2026-10-28T20:31:00.851853Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/d7f8457b-8510-4f07-a9aa-eac9e902ea0a/cancel` → **200**

```json
{
  "command_id": "e7f25b93-9200-401c-895e-289f20e1eaa4",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "baec90a2-1285-4c08-8872-ce3a1e372650",
    "order_id": "d7f8457b-8510-4f07-a9aa-eac9e902ea0a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "296d9d74-e861-4a97-8b35-4db49a2e675a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T20:31:02.084313Z",
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

`GET /api/rider/v1/orders/7968eb8e-c956-4e2c-ae2a-9b551ecf500e` → **200**

```json
{
  "id": "7968eb8e-c956-4e2c-ae2a-9b551ecf500e",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:31:03.532649Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/7968eb8e-c956-4e2c-ae2a-9b551ecf500e/cancel` → **200**

```json
{
  "command_id": "9b0b31b4-e3a4-4026-b7f0-89f41a0dcd6d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7968eb8e-c956-4e2c-ae2a-9b551ecf500e",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:31:03.532649Z",
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

`GET /api/rider/v1/orders/0ce80ad7-cf0e-4a23-b016-18937ad613f7` → **200**

```json
{
  "id": "0ce80ad7-cf0e-4a23-b016-18937ad613f7",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T20:31:04.166475Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T23:31:03Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0ce80ad7-cf0e-4a23-b016-18937ad613f7/cancel` → **200**

```json
{
  "command_id": "5ce02379-8ed9-46ce-be9d-6c7588c3d993",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0ce80ad7-cf0e-4a23-b016-18937ad613f7",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ef9291d5-56ee-4bdb-a0c0-9c7ad2fa2f3f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T20:31:04.166475Z",
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
  "pickup_at": "2026-10-28T23:31:03Z",
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
  "session_id": "9739dcd8-d95c-4335-bc17-aac3caebe8cd",
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
  "last_heartbeat_at": "2026-10-28T20:31:00.851853Z",
  "last_location_at": "2026-10-28T20:31:00.851853Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9739dcd8-d95c-4335-bc17-aac3caebe8cd/close` → **200**

```json
{
  "command_id": "4ea755e5-1273-4830-8319-a2bec7080ce1",
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

Done: orders d7f8457b-8510-4f07-a9aa-eac9e902ea0a, 7968eb8e-c956-4e2c-ae2a-9b551ecf500e, 0ce80ad7-cf0e-4a23-b016-18937ad613f7.

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
  "session_id": "e8d4e0d4-9f2e-4c0c-a026-29124eee4721",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzNjgsImlhdCI6MTc5MzIxOTQ2OCwianRpIjoiODc5M2NmOTUtOGI4MC00NzBiLTk5YmItNjJhNWQ3ZTViOGNkIiwic2lkIjoiZThkNGUwZDQtOWYyZS00YzBjLWEwMjYtMjkxMjRlZWU0NzIxIn0.8ZU9B28xkK4FyDNKOFkOWlGjsZCJPhuRMrgYSi_KrJQ",
  "access_expires_at": "2026-10-28T20:46:08.323520346Z",
  "refresh_token": "aL_XJ3dXc0mWEI65kt-aQgnyY-W7Gzy7rt_ZySNWMTc",
  "refresh_expires_at": "2026-10-29T08:31:08.322674244Z",
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
  "session_id": "addcc665-f0b8-4c43-9d86-5781245068b9",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzNjgsImlhdCI6MTc5MzIxOTQ2OCwianRpIjoiODQ4OWRjM2EtZjI1YS00NmMzLWI4NTAtMTIzODVmNzE0OTQyIiwic2lkIjoiYWRkY2M2NjUtZjBiOC00YzQzLTlkODYtNTc4MTI0NTA2OGI5In0.X-3kdOaAWOtiV_pEGVzCyRSVOa0JRxcYoZmvnVtMMZU",
  "access_expires_at": "2026-10-28T20:46:08.890514636Z",
  "refresh_token": "AtPYBYTD4CRasVzGawCDq8S0bHPNX-zVfdmlXRHtTAA",
  "refresh_expires_at": "2026-10-29T08:31:08.889880922Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18681"
}
```

```json
{
  "challenge_id": "b6c32f5b-9e92-46b5-940a-1b487fed1062",
  "expires_at": "2026-10-28T20:36:09.177661943Z",
  "resend_available_at": "2026-10-28T20:31:10.177661943Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "552410",
  "sent_at": "2026-10-28T20:31:09.181085071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6c32f5b-9e92-46b5-940a-1b487fed1062",
  "code": "552410",
  "device_ref": "sandbox-18681"
}
```

```json
{
  "session_id": "081d4a69-ec29-4628-812b-9e65d70023b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDM2OSwiaWF0IjoxNzkzMjE5NDY5LCJqdGkiOiI0NWZiODQ5My1lZjNjLTQ0ODgtODY2Ni1mYjZjOGEzMzYzNGEiLCJzaWQiOiIwODFkNGE2OS1lYzI5LTQ2MjgtODEyYi05ZTY1ZDcwMDIzYjEifQ.sdElIAoVXFd-78WI-qz8s7pUGir-fZbfGCxMl6wZlD0",
  "access_expires_at": "2026-10-28T20:46:09.491937627Z",
  "refresh_token": "0oyFqrsezDmiCTn4Z4vtu4JF6FPs_S2Zv1OZj6chXPU",
  "refresh_expires_at": "2026-11-27T20:31:09.491347614Z",
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
  "command_id": "442cc1a9-0f67-4516-8a48-e24726733521",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:31:10Z",
    "sequence": 1793219470473
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "461b41ff-45f6-46bb-b15d-a6ae07358a9c",
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
  "last_heartbeat_at": "2026-10-28T20:31:10.066393Z",
  "last_location_at": "2026-10-28T20:31:10.066393Z",
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
  "command_id": "fe98a9f6-dba0-4407-b7c1-7e4bd1f8cc68",
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
  "effective_at": "2026-10-28T20:31:10.698206Z",
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T20:28:45.878078Z",
  "last_entries": [
    {
      "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T20:28:45.878078Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6ffdd98e-3cfd-49a3-9021-a412a1d6e7de",
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
  "id": "f28f2bfc-5722-40b2-a3cf-c0e8a84cbe73",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:11.329947Z",
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
  "command_id": "2f82c2ea-4846-4a9d-bcb2-ecfb36392050",
  "quote_id": "f28f2bfc-5722-40b2-a3cf-c0e8a84cbe73",
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
    "phone": "+3806711127507"
  }
}
```

```json
{
  "id": "d4b3aac8-c843-4e7b-ad8f-f905510d77b3",
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
  "created_at": "2026-10-28T20:31:11.629334Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127507"
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
    "id": "095d1b0e-47a0-44b3-8b22-f55bce8ec5e7",
    "order_id": "d4b3aac8-c843-4e7b-ad8f-f905510d77b3",
    "expires_at": "2026-10-28T20:31:26.633054Z",
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

`POST /api/driver/v1/offers/095d1b0e-47a0-44b3-8b22-f55bce8ec5e7/accept` → **200**

```json
{
  "command_id": "859a63e5-22e9-4780-b013-4645233786d3"
}
```

```json
{
  "id": "3a6aee5e-dfd1-45a5-8d81-411e04a83c81",
  "order_id": "d4b3aac8-c843-4e7b-ad8f-f905510d77b3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e4ba9ea0-b7be-4024-ab34-5bbfaf6906da",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e4ba9ea0-b7be-4024-ab34-5bbfaf6906da",
  "order_id": "d4b3aac8-c843-4e7b-ad8f-f905510d77b3",
  "assignment_id": "3a6aee5e-dfd1-45a5-8d81-411e04a83c81",
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
    "phone": "+3806711127507"
  }
}
```

`POST /api/driver/v1/work-sessions/461b41ff-45f6-46bb-b15d-a6ae07358a9c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:31:12Z",
    "sequence": 1793219472768
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "461b41ff-45f6-46bb-b15d-a6ae07358a9c",
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
  "last_heartbeat_at": "2026-10-28T20:31:12.788013Z",
  "last_location_at": "2026-10-28T20:31:12.788013Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e4ba9ea0-b7be-4024-ab34-5bbfaf6906da/arrive` → **200**

```json
{
  "command_id": "7fbf08cf-bca5-4ce4-b5cd-c5835c5d1dfb",
  "expected_version": 0
}
```

```json
{
  "id": "e4ba9ea0-b7be-4024-ab34-5bbfaf6906da",
  "order_id": "d4b3aac8-c843-4e7b-ad8f-f905510d77b3",
  "assignment_id": "3a6aee5e-dfd1-45a5-8d81-411e04a83c81",
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
  "arrived_at": "2026-10-28T20:31:13.073603Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127507"
  }
}
```

`POST /api/driver/v1/trips/e4ba9ea0-b7be-4024-ab34-5bbfaf6906da/start` → **200**

```json
{
  "command_id": "cd03e605-f192-43ee-a116-583679fdd86a",
  "expected_version": 1
}
```

```json
{
  "id": "e4ba9ea0-b7be-4024-ab34-5bbfaf6906da",
  "order_id": "d4b3aac8-c843-4e7b-ad8f-f905510d77b3",
  "assignment_id": "3a6aee5e-dfd1-45a5-8d81-411e04a83c81",
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
  "arrived_at": "2026-10-28T20:31:13.073603Z",
  "started_at": "2026-10-28T20:31:13.36966Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127507"
  }
}
```

`POST /api/driver/v1/trips/e4ba9ea0-b7be-4024-ab34-5bbfaf6906da/complete` → **200**

```json
{
  "command_id": "e2ea3cdf-632b-4947-b50a-662d175ceb4c",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:31:13Z",
  "cash_received": true
}
```

```json
{
  "id": "e4ba9ea0-b7be-4024-ab34-5bbfaf6906da",
  "order_id": "d4b3aac8-c843-4e7b-ad8f-f905510d77b3",
  "assignment_id": "3a6aee5e-dfd1-45a5-8d81-411e04a83c81",
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
  "arrived_at": "2026-10-28T20:31:13.073603Z",
  "started_at": "2026-10-28T20:31:13.36966Z",
  "completed_at": "2026-10-28T20:31:13.677179Z",
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
  "command_id": "fa2d86cb-4e8e-4d30-b2c6-7fdba936e45a",
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
  "id": "db903d3f-95f4-4b00-bf0f-e48ae051429b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:13.987766Z",
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
  "command_id": "322e4d2f-4a07-40cd-b6e3-cd39630151d8",
  "quote_id": "db903d3f-95f4-4b00-bf0f-e48ae051429b",
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
    "phone": "+3806711120892"
  }
}
```

```json
{
  "id": "3b9c4205-f6f4-478f-bed2-c2f46b5216bc",
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
  "created_at": "2026-10-28T20:31:14.291966Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120892"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3b9c4205-f6f4-478f-bed2-c2f46b5216bc` → **200**

```json
{
  "id": "3b9c4205-f6f4-478f-bed2-c2f46b5216bc",
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
  "created_at": "2026-10-28T20:31:14.291966Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120892"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/3b9c4205-f6f4-478f-bed2-c2f46b5216bc/cancel` → **200**

```json
{
  "command_id": "5c2395da-4aec-4bf5-98ee-70657d8ac7cd",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "3b9c4205-f6f4-478f-bed2-c2f46b5216bc",
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
  "created_at": "2026-10-28T20:31:14.291966Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120892"
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
  "staff_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T20:28:45.878078Z",
  "last_entries": [
    {
      "order_id": "3b9c4205-f6f4-478f-bed2-c2f46b5216bc",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T20:31:14.904923Z"
    },
    {
      "order_id": "d4b3aac8-c843-4e7b-ad8f-f905510d77b3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T20:31:13.681826Z"
    },
    {
      "order_id": "f496837c-70b8-4c69-937b-0b508a202dc2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T20:28:45.878078Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "461b41ff-45f6-46bb-b15d-a6ae07358a9c",
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
  "last_heartbeat_at": "2026-10-28T20:31:12.788013Z",
  "last_location_at": "2026-10-28T20:31:12.788013Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/461b41ff-45f6-46bb-b15d-a6ae07358a9c/close` → **200**

```json
{
  "command_id": "a19b8c11-496f-4916-a7e7-bcb0ccccfa4e",
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

Done: operator bonus for fulfilled d4b3aac8-c843-4e7b-ad8f-f905510d77b3 and operator-fault cancellation 3b9c4205-f6f4-478f-bed2-c2f46b5216bc.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674823287",
  "device_ref": "sandbox-4000"
}
```

```json
{
  "challenge_id": "5f43b8b0-a615-4c7d-ad67-3179b9eeb593",
  "expires_at": "2026-10-28T20:36:18.095402513Z",
  "resend_available_at": "2026-10-28T20:31:19.095402513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674823287` → **200**

```json
{
  "phone": "+380674823287",
  "audience": "CLIENT",
  "code": "580526",
  "sent_at": "2026-10-28T20:31:18.097801814Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675758596",
  "device_ref": "sandbox-24833",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ece88750-b558-4693-8c0b-5ad2918d7970",
  "expires_at": "2026-10-28T20:36:18.398527841Z",
  "resend_available_at": "2026-10-28T20:31:19.398527841Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675758596` → **200**

```json
{
  "phone": "+380675758596",
  "audience": "CLIENT",
  "code": "252275",
  "sent_at": "2026-10-28T20:31:18.400602988Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672970000",
  "device_ref": "sandbox-30528"
}
```

```json
{
  "challenge_id": "07154f5c-8bd0-4bfe-bee0-3b75f2ea8dad",
  "expires_at": "2026-10-28T20:36:18.697659172Z",
  "resend_available_at": "2026-10-28T20:31:19.697659172Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672970000` → **200**

```json
{
  "phone": "+380672970000",
  "audience": "CLIENT",
  "code": "345424",
  "sent_at": "2026-10-28T20:31:18.700818951Z",
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
  "session_id": "e7973c5f-e769-4f45-9708-23cc23efdf55",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzNzksImlhdCI6MTc5MzIxOTQ3OSwianRpIjoiMjVjNmMxYjQtNWEzZi00NWM1LWIyYmUtODU0ZjhmNDg1OWEzIiwic2lkIjoiZTc5NzNjNWYtZTc2OS00ZjQ1LTk3MDgtMjNjYzIzZWZkZjU1In0.McCQ4152lG1YOhuAtpya-WC3T_kOM4DlmuJ9W727kmM",
  "access_expires_at": "2026-10-28T20:46:19.287771014Z",
  "refresh_token": "rE-E2QLvwemn39tXqM-TdmINyRv8a05KNd2q-XcpfEc",
  "refresh_expires_at": "2026-10-29T08:31:19.287165873Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672970000` → **200**

```json
{
  "deliveries": [
    {
      "id": "be40a24f-0b38-4a0e-8deb-47c7d92c71c7",
      "challenge_id": "07154f5c-8bd0-4bfe-bee0-3b75f2ea8dad",
      "phone": "+380672970000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-4cc8c6a0-1994-40b4-8feb-895887a55f7c",
      "error": null,
      "attempted_at": "2026-10-28T20:31:18.701068Z"
    },
    {
      "id": "e01e9bc3-dbe3-478a-b1d1-21367de4dccb",
      "challenge_id": "07154f5c-8bd0-4bfe-bee0-3b75f2ea8dad",
      "phone": "+380672970000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T20:31:18.699899Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672970000` → **200**

```json
{
  "phone": "+380672970000",
  "audience": "CLIENT",
  "code": "345424",
  "sent_at": "2026-10-28T20:31:18.700818951Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675758596` → **200**

```json
{
  "deliveries": [
    {
      "id": "461ac300-a79d-40fe-a46d-622c301ca44b",
      "challenge_id": "ece88750-b558-4693-8c0b-5ad2918d7970",
      "phone": "+380675758596",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f952c31c-3750-4557-95eb-112dd7a6ad75",
      "error": null,
      "attempted_at": "2026-10-28T20:31:18.400855Z"
    }
  ]
}
```

Done: SMS to +380674823287, a call to +380675758596, SMS then a call to +380672970000.

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
  "session_id": "88ffbc09-55b9-4471-8880-0a3d76a31cbe",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzODAsImlhdCI6MTc5MzIxOTQ4MCwianRpIjoiNGEwY2RkODItODIwZS00ZTI1LWJkNWEtYThjOTRhNzY0YTk4Iiwic2lkIjoiODhmZmJjMDktNTViOS00NDcxLTg4ODAtMGEzZDc2YTMxY2JlIn0.1Rj5PX3T9kw24uZrB5ZjaBlXekpr7EXjDPaSCMlV75M",
  "access_expires_at": "2026-10-28T20:46:20.429203308Z",
  "refresh_token": "Zrz9tbV335Z61Y1vO9HN0PABPi7jZo9DM1RzFD4AyEU",
  "refresh_expires_at": "2026-10-29T08:31:20.428627572Z",
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
  "session_id": "98190240-5acf-4f28-8c5a-5a2d8d94d24f",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzODAsImlhdCI6MTc5MzIxOTQ4MCwianRpIjoiNjE2MTg5YWItYjNiNC00NDJmLTliMTMtOGI2OWM4NThkMmI3Iiwic2lkIjoiOTgxOTAyNDAtNWFjZi00ZjI4LThjNWEtNWEyZDhkOTRkMjRmIn0.ZSm9BUbuATx7DqIiQQDRVkL-bGOvTe8_C4dxWK6NTW4",
  "access_expires_at": "2026-10-28T20:46:20.991317651Z",
  "refresh_token": "WUhYPQKCxIakXTUC3B_8plcwL2rwPPyZ64Xhu1K0iOo",
  "refresh_expires_at": "2026-10-29T08:31:20.990753025Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
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

`POST /api/admin/v1/staff-extensions/fcd127b7-431c-4e3e-bc7f-19deba39bfd9` → **200**

```json
{
  "command_id": "b3faf442-6c44-44a2-b385-0928c682ff42",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "8115c59d-41d0-4073-975c-af2b9e630585",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T20:31:22.088112Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T20:31:22.088112Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "55b6640b-7060-4556-abe3-e7138d85b728",
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
  "id": "7ff1aa1d-f8c3-4bb1-b891-91204c00969e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:22.626501Z",
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
  "command_id": "1ad7b859-458f-45b7-81c1-8accbb65f127",
  "quote_id": "7ff1aa1d-f8c3-4bb1-b891-91204c00969e",
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
    "phone": "+380672808535"
  }
}
```

```json
{
  "id": "e712a162-f25b-47a0-b7b0-53e5ac3bb26a",
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
  "created_at": "2026-10-28T20:31:22.912975Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672808535"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/e712a162-f25b-47a0-b7b0-53e5ac3bb26a/calls` → **201**

```json
{
  "command_id": "9cea6439-6680-4486-ad1e-1fc548508324",
  "to": "CALLER"
}
```

```json
{
  "id": "d3e6c171-5ad5-4448-8a36-3a0313877fef",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "order_ids": [
    "e712a162-f25b-47a0-b7b0-53e5ac3bb26a"
  ],
  "started_at": "2026-10-28T20:31:23.224137Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/e712a162-f25b-47a0-b7b0-53e5ac3bb26a/calls` → **201**

```json
{
  "command_id": "9cea6439-6680-4486-ad1e-1fc548508324",
  "to": "CALLER"
}
```

```json
{
  "id": "d3e6c171-5ad5-4448-8a36-3a0313877fef",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "order_ids": [
    "e712a162-f25b-47a0-b7b0-53e5ac3bb26a"
  ],
  "started_at": "2026-10-28T20:31:23.224137Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "d3e6c171-5ad5-4448-8a36-3a0313877fef",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672808535",
    "at": "2026-10-28T20:31:23.226504764Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "d3e6c171-5ad5-4448-8a36-3a0313877fef",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.24484",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "d3e6c171-5ad5-4448-8a36-3a0313877fef"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "d3e6c171-5ad5-4448-8a36-3a0313877fef",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=e712a162-f25b-47a0-b7b0-53e5ac3bb26a` → **200**

```json
{
  "calls": [
    {
      "id": "d3e6c171-5ad5-4448-8a36-3a0313877fef",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [
        "e712a162-f25b-47a0-b7b0-53e5ac3bb26a"
      ],
      "started_at": "2026-10-28T20:31:23.224137Z",
      "answered_at": "2026-10-28T20:31:23.863266Z",
      "ended_at": "2026-10-28T20:31:23.885009Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=e712a162-f25b-47a0-b7b0-53e5ac3bb26a` → **200**

```json
{
  "calls": [
    {
      "id": "d3e6c171-5ad5-4448-8a36-3a0313877fef",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "order_ids": [
        "e712a162-f25b-47a0-b7b0-53e5ac3bb26a"
      ],
      "started_at": "2026-10-28T20:31:23.224137Z",
      "answered_at": "2026-10-28T20:31:23.863266Z",
      "ended_at": "2026-10-28T20:31:23.885009Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T20:31:24.505417Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/e712a162-f25b-47a0-b7b0-53e5ac3bb26a` → **200**

```json
{
  "id": "e712a162-f25b-47a0-b7b0-53e5ac3bb26a",
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
  "created_at": "2026-10-28T20:31:22.912975Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672808535"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e712a162-f25b-47a0-b7b0-53e5ac3bb26a/cancel` → **200**

```json
{
  "command_id": "e4b51d58-1cb8-4f65-935f-4b61d3e3428b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e712a162-f25b-47a0-b7b0-53e5ac3bb26a",
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
  "created_at": "2026-10-28T20:31:22.912975Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672808535"
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
  "command_id": "097598e2-4cd6-448b-b72a-7b4190ff1806",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T20:31:27.09622Z",
  "extension": "101"
}
```

Done: outgoing call d3e6c171-5ad5-4448-8a36-3a0313877fef from order e712a162-f25b-47a0-b7b0-53e5ac3bb26a, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638500945",
  "device_ref": "sandbox-6566"
}
```

```json
{
  "challenge_id": "26c72055-f935-47ee-ba3f-69d1f72dfdb3",
  "expires_at": "2026-10-28T20:36:27.379058329Z",
  "resend_available_at": "2026-10-28T20:31:28.379058329Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638500945` → **200**

```json
{
  "phone": "+380638500945",
  "audience": "CLIENT",
  "code": "861478",
  "sent_at": "2026-10-28T20:31:27.38158022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "26c72055-f935-47ee-ba3f-69d1f72dfdb3",
  "code": "861478",
  "device_ref": "sandbox-6566"
}
```

```json
{
  "session_id": "8f064c46-b80f-4531-99c1-19c3c7329832",
  "subject": {
    "type": "CLIENT",
    "id": "c2140058-b134-4be8-bc5a-1bd4465012ce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjE0MDA1OC1iMTM0LTRiZTgtYmM1YS0xYmQ0NDY1MDEyY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzg3LCJpYXQiOjE3OTMyMTk0ODcsImp0aSI6ImIzNzUwZWM3LTlmZGItNDYwYi05OGRkLWMxMDY2MjBhOTY2NiIsInNpZCI6IjhmMDY0YzQ2LWI4MGYtNDUzMS05OWMxLTE5YzNjNzMyOTgzMiJ9.9MSXwvF0tbiL_Y1GHbK4c-JfXf4e_Df0pq8_N8Vdn7o",
  "access_expires_at": "2026-10-28T20:46:27.679118852Z",
  "refresh_token": "Dt8_oRO5qgfEGcjKtgILTRbrHaUwsER4MQKS35drAO0",
  "refresh_expires_at": "2026-11-27T20:31:27.678608589Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c2140058-b134-4be8-bc5a-1bd4465012ce",
  "session_id": "8f064c46-b80f-4531-99c1-19c3c7329832",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638500945",
  "device_ref": "sandbox-21318"
}
```

```json
{
  "challenge_id": "fc764187-9eb5-4f97-964e-f954e7f33dfd",
  "expires_at": "2026-10-28T20:36:30.214655976Z",
  "resend_available_at": "2026-10-28T20:31:31.214655976Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638500945` → **200**

```json
{
  "phone": "+380638500945",
  "audience": "CLIENT",
  "code": "103134",
  "sent_at": "2026-10-28T20:31:30.216610478Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc764187-9eb5-4f97-964e-f954e7f33dfd",
  "code": "103134",
  "device_ref": "sandbox-21318"
}
```

```json
{
  "session_id": "ee50389c-8363-46b8-a322-37fa8939f57c",
  "subject": {
    "type": "CLIENT",
    "id": "c2140058-b134-4be8-bc5a-1bd4465012ce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjE0MDA1OC1iMTM0LTRiZTgtYmM1YS0xYmQ0NDY1MDEyY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzkwLCJpYXQiOjE3OTMyMTk0OTAsImp0aSI6IjAwNTg3ODVmLWRjZTItNDFkNy1hNzUxLTYyYjA2M2FlMjRmYiIsInNpZCI6ImVlNTAzODljLTgzNjMtNDZiOC1hMzIyLTM3ZmE4OTM5ZjU3YyJ9.7CURVDJceQsB_Lq-7ldM3G4ZAyrcpLS-ibTmZYU5trE",
  "access_expires_at": "2026-10-28T20:46:30.503813043Z",
  "refresh_token": "m-03qazfLfS1PYO-zZIH7epDYg540FlN4ReXUWuAMWs",
  "refresh_expires_at": "2026-11-27T20:31:30.503016804Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "1aade982-a1a8-4707-ba03-7704386d7424",
  "expires_at": "2026-10-28T20:36:32.77610557Z",
  "resend_available_at": "2026-10-28T20:31:33.77610557Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638500945` → **200**

```json
{
  "phone": "+380638500945",
  "audience": "CLIENT",
  "code": "627947",
  "sent_at": "2026-10-28T20:31:32.778569056Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639613725"
}
```

```json
{
  "challenge_id": "74327ab4-34c3-4f00-9ff8-193eb1936058",
  "expires_at": "2026-10-28T20:36:33.058966428Z",
  "resend_available_at": "2026-10-28T20:31:34.058966428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639613725` → **200**

```json
{
  "phone": "+380639613725",
  "audience": "CLIENT",
  "code": "265364",
  "sent_at": "2026-10-28T20:31:33.061261981Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "e22e895f-7796-4d2a-92d7-ba6c36ab6df8",
  "current_challenge_id": "1aade982-a1a8-4707-ba03-7704386d7424",
  "current_code": "000000",
  "new_challenge_id": "74327ab4-34c3-4f00-9ff8-193eb1936058",
  "new_code": "265364"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "78b09be8-eed6-49a9-907a-65fcda3a5b5f"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "2f6b9973-c97a-4fdf-9b0f-2742c5674559",
  "current_challenge_id": "1aade982-a1a8-4707-ba03-7704386d7424",
  "current_code": "627947",
  "new_challenge_id": "74327ab4-34c3-4f00-9ff8-193eb1936058",
  "new_code": "265364"
}
```

```json
{
  "subject_id": "c2140058-b134-4be8-bc5a-1bd4465012ce",
  "phone": "+380639613725",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c2140058-b134-4be8-bc5a-1bd4465012ce",
  "session_id": "8f064c46-b80f-4531-99c1-19c3c7329832",
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
  "correlation_id": "242aa01f-36ee-4289-87f1-5aba3f2e91ed"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639613725",
  "device_ref": "sandbox-32650"
}
```

```json
{
  "challenge_id": "93bf8a60-6f5a-4571-9f34-1c359ea594e3",
  "expires_at": "2026-10-28T20:36:36.438500212Z",
  "resend_available_at": "2026-10-28T20:31:37.438500212Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639613725` → **200**

```json
{
  "phone": "+380639613725",
  "audience": "CLIENT",
  "code": "119089",
  "sent_at": "2026-10-28T20:31:36.440565604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93bf8a60-6f5a-4571-9f34-1c359ea594e3",
  "code": "119089",
  "device_ref": "sandbox-32650"
}
```

```json
{
  "session_id": "0dbdd3b1-4dc1-40fd-8fe1-8387af902224",
  "subject": {
    "type": "CLIENT",
    "id": "c2140058-b134-4be8-bc5a-1bd4465012ce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjE0MDA1OC1iMTM0LTRiZTgtYmM1YS0xYmQ0NDY1MDEyY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzk2LCJpYXQiOjE3OTMyMTk0OTYsImp0aSI6IjI4OTJjMzE3LTVhMjktNDdiNy05ZmY0LWIzNmEzMDRiYzcxMCIsInNpZCI6IjBkYmRkM2IxLTRkYzEtNDBmZC04ZmUxLTgzODdhZjkwMjIyNCJ9.QMHvR2yPMB7lmVzG7uk-ULeCQUlaqiG-8v5eXWVcCAo",
  "access_expires_at": "2026-10-28T20:46:36.738725965Z",
  "refresh_token": "KUVFxAZG77P4XGVtJVD_u4zARoNuvJRl05VftRh7DjU",
  "refresh_expires_at": "2026-11-27T20:31:36.738122Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c2140058-b134-4be8-bc5a-1bd4465012ce",
  "session_id": "0dbdd3b1-4dc1-40fd-8fe1-8387af902224",
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
  "session_id": "122a222a-6425-4196-9b7a-0e091fcf05b2",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjAzOTcsImlhdCI6MTc5MzIxOTQ5NywianRpIjoiMzg1ZTg4YWQtYmM0Yy00ZmQ5LWFjZTEtMWU3NDgxZDQ2ZmY1Iiwic2lkIjoiMTIyYTIyMmEtNjQyNS00MTk2LTliN2EtMGUwOTFmY2YwNWIyIn0.N54vJb5qvc6-jvoYu_GH8FT-3g8PXiDDP7ShyxW9tc8",
  "access_expires_at": "2026-10-28T20:46:37.557260746Z",
  "refresh_token": "EFbXfHxBbrX4PfhmKU08lWByGAyiZf78tWp3cJEy3GY",
  "refresh_expires_at": "2026-10-29T08:31:37.556698375Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/c2140058-b134-4be8-bc5a-1bd4465012ce` → **200**

```json
{
  "client": {
    "id": "c2140058-b134-4be8-bc5a-1bd4465012ce",
    "phone": "+380639613725",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T20:31:27.677049Z",
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

`POST /api/admin/v1/clients/c2140058-b134-4be8-bc5a-1bd4465012ce/phone/new-code` → **201**

```json
{
  "phone": "+380631400784"
}
```

```json
{
  "challenge_id": "7710abbc-1cf7-4dd8-aabd-5a417f7ff298",
  "expires_at": "2026-10-28T20:36:38.140768735Z",
  "resend_available_at": "2026-10-28T20:31:39.140768735Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631400784` → **200**

```json
{
  "phone": "+380631400784",
  "audience": "CLIENT",
  "code": "802737",
  "sent_at": "2026-10-28T20:31:38.142869945Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/c2140058-b134-4be8-bc5a-1bd4465012ce/phone` → **422**

```json
{
  "command_id": "10902356-1ea4-4ce4-ab0b-b97a7e785acd",
  "expected_version": 3,
  "new_challenge_id": "7710abbc-1cf7-4dd8-aabd-5a417f7ff298",
  "new_code": "802738",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/c2140058-b134-4be8-bc5a-1bd4465012ce/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "8d6525ea-d40d-4754-9d44-d9f701f85af3"
}
```

`POST /api/admin/v1/clients/c2140058-b134-4be8-bc5a-1bd4465012ce/phone` → **400**

```json
{
  "command_id": "42c43a53-c64f-49ef-b1bd-f59796152409",
  "expected_version": 3,
  "new_challenge_id": "7710abbc-1cf7-4dd8-aabd-5a417f7ff298",
  "new_code": "802737",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/c2140058-b134-4be8-bc5a-1bd4465012ce/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e86644af-7410-4960-a80c-9b8a054d260d",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/c2140058-b134-4be8-bc5a-1bd4465012ce/phone` → **200**

```json
{
  "command_id": "01a32114-320a-4862-9cc7-da6d3bcf5950",
  "expected_version": 3,
  "new_challenge_id": "7710abbc-1cf7-4dd8-aabd-5a417f7ff298",
  "new_code": "802737",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "c2140058-b134-4be8-bc5a-1bd4465012ce",
  "phone": "+380631400784",
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
  "correlation_id": "99a12401-fead-4a5e-837b-92b1cf48707b"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631400784",
  "device_ref": "sandbox-23903"
}
```

```json
{
  "challenge_id": "c6467bf3-3fc2-4b95-84d3-0b37e043c083",
  "expires_at": "2026-10-28T20:36:39.567564184Z",
  "resend_available_at": "2026-10-28T20:31:40.567564184Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631400784` → **200**

```json
{
  "phone": "+380631400784",
  "audience": "CLIENT",
  "code": "721162",
  "sent_at": "2026-10-28T20:31:39.570177571Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6467bf3-3fc2-4b95-84d3-0b37e043c083",
  "code": "721162",
  "device_ref": "sandbox-23903"
}
```

```json
{
  "session_id": "94704884-0df9-40fa-bf4f-67b641a95c23",
  "subject": {
    "type": "CLIENT",
    "id": "c2140058-b134-4be8-bc5a-1bd4465012ce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMjE0MDA1OC1iMTM0LTRiZTgtYmM1YS0xYmQ0NDY1MDEyY2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwMzk5LCJpYXQiOjE3OTMyMTk0OTksImp0aSI6ImNlNjcyNzZhLWQyMmMtNDhmMi1iMzVjLWVhMjc1OWEwMmY2MyIsInNpZCI6Ijk0NzA0ODg0LTBkZjktNDBmYS1iZjRmLTY3YjY0MWE5NWMyMyJ9.kV1x8pZX2SDJ9ey5uhITtYnka_3-3r8IC_9HuV38lb4",
  "access_expires_at": "2026-10-28T20:46:39.870717834Z",
  "refresh_token": "i-PL8IR91xdWio6o5dSeT5DlGqM4ALZvRZEKGUf_jeM",
  "refresh_expires_at": "2026-11-27T20:31:39.87016499Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c2140058-b134-4be8-bc5a-1bd4465012ce",
  "session_id": "94704884-0df9-40fa-bf4f-67b641a95c23",
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
  "phone": "+380636284216",
  "device_ref": "sandbox-12977"
}
```

```json
{
  "challenge_id": "79f0e318-42ad-4b6b-a4cf-b997b6ce4825",
  "expires_at": "2026-10-28T20:36:40.409158815Z",
  "resend_available_at": "2026-10-28T20:31:41.409158815Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636284216` → **200**

```json
{
  "phone": "+380636284216",
  "audience": "CLIENT",
  "code": "217953",
  "sent_at": "2026-10-28T20:31:40.411330365Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79f0e318-42ad-4b6b-a4cf-b997b6ce4825",
  "code": "217953",
  "device_ref": "sandbox-12977"
}
```

```json
{
  "session_id": "008bbfa9-6b50-4db1-b3f9-11fc88c6c83a",
  "subject": {
    "type": "CLIENT",
    "id": "a4b63c94-5520-4e61-8301-249e35326390"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGI2M2M5NC01NTIwLTRlNjEtODMwMS0yNDllMzUzMjYzOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwNDAwLCJpYXQiOjE3OTMyMTk1MDAsImp0aSI6IjZiM2M3ZjM4LTAyYmYtNDAwYy04YjRhLWViMDJlNjhhMzE4YyIsInNpZCI6IjAwOGJiZmE5LTZiNTAtNGRiMS1iM2Y5LTExZmM4OGM2YzgzYSJ9.02JIESQBxGjVyZmOAzaDBG_qBShCH88CF42rOjk8D34",
  "access_expires_at": "2026-10-28T20:46:40.709384845Z",
  "refresh_token": "Q79Jz2GaUA9-bCO9WHH1uCHMErrKjI0lCX45OWcPEAc",
  "refresh_expires_at": "2026-11-27T20:31:40.708869992Z",
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
  "session_id": "62cfae22-08a0-4357-963a-3fd4664e1541",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MDEsImlhdCI6MTc5MzIxOTUwMSwianRpIjoiNTJmZGU4ZDktMTNhOC00MTlmLTlkOGYtY2ExYjljYTBjMjlkIiwic2lkIjoiNjJjZmFlMjItMDhhMC00MzU3LTk2M2EtM2ZkNDY2NGUxNTQxIn0.Ogl1z_mXgIHdtATr60e_PHmbLrz0HOfNHUGenioWXvM",
  "access_expires_at": "2026-10-28T20:46:41.844678568Z",
  "refresh_token": "ZfQL9LYx3gMl_s2vJNtaa220iTc8VxiTrGbcpogq8Is",
  "refresh_expires_at": "2026-10-29T08:31:41.844120555Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380636284216` → **200**

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
  "correlation_id": "c168e8b7-0bb1-47bf-8a1d-c16571fa0f72"
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
  "session_id": "de37daa5-0f5d-4940-be27-570b50adb9aa",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MDIsImlhdCI6MTc5MzIxOTUwMiwianRpIjoiNzQ0YWEzNDItNDMzNS00ZDY5LWIwMTMtZjFiNzY2N2JkMzYyIiwic2lkIjoiZGUzN2RhYTUtMGY1ZC00OTQwLWJlMjctNTcwYjUwYWRiOWFhIn0.CWUNzv1fwa3aTJd5qEI1v3m2BC67vLYikztUJpCuHJo",
  "access_expires_at": "2026-10-28T20:46:42.96580734Z",
  "refresh_token": "ukiwj3CyjC2xz-JzUg4at6frZ04NiNHqfP9o9bkT8dk",
  "refresh_expires_at": "2026-10-29T08:31:42.965243255Z",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-28T20:28:11.369107Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "7a957c16-2f2b-4888-b2e7-1b3008a3ff23",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T20:31:43.526873823Z"
}
```

## The rider books the airport for 2026-10-28T23:31:42Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600421488",
  "device_ref": "sandbox-28367"
}
```

```json
{
  "challenge_id": "5b924131-381e-4570-b1ac-385345d3adac",
  "expires_at": "2026-10-28T20:36:43.816301594Z",
  "resend_available_at": "2026-10-28T20:31:44.816301594Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600421488` → **200**

```json
{
  "phone": "+48600421488",
  "audience": "CLIENT",
  "code": "012453",
  "sent_at": "2026-10-28T20:31:43.818842376Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b924131-381e-4570-b1ac-385345d3adac",
  "code": "012453",
  "device_ref": "sandbox-28367"
}
```

```json
{
  "session_id": "8fb5243f-cc8c-46ce-9297-a59f04158260",
  "subject": {
    "type": "CLIENT",
    "id": "014843ab-bfae-4579-b7f9-d82ddd938c28"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTQ4NDNhYi1iZmFlLTQ1NzktYjdmOS1kODJkZGQ5MzhjMjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwNDA0LCJpYXQiOjE3OTMyMTk1MDQsImp0aSI6IjE0ODgzY2Q1LTQwOGItNDI5OS05MTFkLTk3YjIyMjRiM2JlYyIsInNpZCI6IjhmYjUyNDNmLWNjOGMtNDZjZS05Mjk3LWE1OWYwNDE1ODI2MCJ9.qixiN5jtIHpkw8pqxt25OrtwXxAvgHDHLauCJNu38AM",
  "access_expires_at": "2026-10-28T20:46:44.108217948Z",
  "refresh_token": "hkMCMHY9st76jtjDKU1JjPOil2VVPU86GAzKQ3Rvb3M",
  "refresh_expires_at": "2026-11-27T20:31:44.107717171Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fe0b76d6-5930-4593-b602-1726b120bc5a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T23:31:42Z"
}
```

```json
{
  "id": "054286d8-2f14-4e35-8232-95748b8a0ba8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:44.390790Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T23:31:42Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9bd2c001-ac61-448e-a792-6bc8084244f1",
  "quote_id": "054286d8-2f14-4e35-8232-95748b8a0ba8",
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
  "pickup_at": "2026-10-28T23:31:42Z"
}
```

```json
{
  "id": "b74f8cb9-96c1-469f-92f0-f36850b1336f",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "014843ab-bfae-4579-b7f9-d82ddd938c28",
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
  "created_at": "2026-10-28T20:31:44.691424Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T23:31:42Z",
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
  "device_ref": "sandbox-6912"
}
```

```json
{
  "challenge_id": "2e54e9bd-d355-4274-b638-5de59c0eafe8",
  "expires_at": "2026-10-28T20:36:44.986884456Z",
  "resend_available_at": "2026-10-28T20:31:45.986884456Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "238479",
  "sent_at": "2026-10-28T20:31:44.989120527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2e54e9bd-d355-4274-b638-5de59c0eafe8",
  "code": "238479",
  "device_ref": "sandbox-6912"
}
```

```json
{
  "session_id": "c670b34d-4303-407d-bcf1-a26e26012a93",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQwNSwiaWF0IjoxNzkzMjE5NTA1LCJqdGkiOiJhY2JjODcxNi1lZGU4LTQ3MDMtOGMxNS1hZGE0MDdkMWQ5NzAiLCJzaWQiOiJjNjcwYjM0ZC00MzAzLTQwN2QtYmNmMS1hMjZlMjYwMTJhOTMifQ.ESmR0hAu2oSInBTXf4DvhhMqIlqPxDnrjjgS18M0oLY",
  "access_expires_at": "2026-10-28T20:46:45.28262535Z",
  "refresh_token": "_bhll29-vPuuyzejdVc93JCTBr13Y9tyg6gH7fUmI9g",
  "refresh_expires_at": "2026-11-27T20:31:45.282045225Z",
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
  "command_id": "228d3382-578e-4f73-a3b6-b50b4224d550",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:31:45Z",
    "sequence": 1793219505804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "84afc6e9-6be3-4cc1-a822-3070963c48db",
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
  "last_heartbeat_at": "2026-10-28T20:31:45.823296Z",
  "last_location_at": "2026-10-28T20:31:45.823296Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "b74f8cb9-96c1-469f-92f0-f36850b1336f",
      "short_number": 23,
      "pickup_at": "2026-10-28T23:31:42Z",
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

`POST /api/driver/v1/preorders/b74f8cb9-96c1-469f-92f0-f36850b1336f/reserve` → **200**

```json
{
  "command_id": "0c53eb07-dc6d-41dc-9cbc-67f1312f4569"
}
```

```json
{
  "id": "af53ffb5-9166-440a-bb09-90c51221fab1",
  "state": "RESERVED",
  "order": {
    "order_id": "b74f8cb9-96c1-469f-92f0-f36850b1336f",
    "short_number": 23,
    "pickup_at": "2026-10-28T23:31:42Z",
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
  "reserved_at": "2026-10-28T20:31:46.380682Z",
  "confirm_from": "2026-10-28T23:01:42Z",
  "confirm_until": "2026-10-28T23:11:42Z",
  "drop_until": "2026-10-28T22:31:42Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "af53ffb5-9166-440a-bb09-90c51221fab1",
      "state": "RESERVED",
      "order": {
        "order_id": "b74f8cb9-96c1-469f-92f0-f36850b1336f",
        "short_number": 23,
        "pickup_at": "2026-10-28T23:31:42Z",
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
      "reserved_at": "2026-10-28T20:31:46.380682Z",
      "confirm_from": "2026-10-28T23:01:42Z",
      "confirm_until": "2026-10-28T23:11:42Z",
      "drop_until": "2026-10-28T22:31:42Z"
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
      "id": "af53ffb5-9166-440a-bb09-90c51221fab1",
      "state": "RESERVED",
      "order": {
        "order_id": "b74f8cb9-96c1-469f-92f0-f36850b1336f",
        "short_number": 23,
        "pickup_at": "2026-10-28T23:31:42Z",
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
      "reserved_at": "2026-10-28T20:31:46.380682Z",
      "confirm_from": "2026-10-28T23:01:42Z",
      "confirm_until": "2026-10-28T23:11:42Z",
      "drop_until": "2026-10-28T22:31:42Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/af53ffb5-9166-440a-bb09-90c51221fab1/confirm` → **409**

```json
{
  "command_id": "ba120e2b-b18a-4425-9f6d-459e4a3b9d66"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/af53ffb5-9166-440a-bb09-90c51221fab1/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "adc03c1a-2248-400d-87d0-24f58eff16f4"
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
  "session_id": "6f147370-09f1-48b1-95c1-0bda1a0b6c7e",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MDcsImlhdCI6MTc5MzIxOTUwNywianRpIjoiOGNmY2UyYjUtYjgyMS00ODU4LTljYzMtNmY0NTJjZmRiNjMzIiwic2lkIjoiNmYxNDczNzAtMDlmMS00OGIxLTk1YzEtMGJkYTFhMGI2YzdlIn0.mxhkH1mIrdksQZyjs2ENxHGa__-9lf4Cg91Y7BXM4j4",
  "access_expires_at": "2026-10-28T20:46:47.774227936Z",
  "refresh_token": "sBCfdCPk99wqc2w1metwtw55mVdYi5ckOdkaAyTR2NQ",
  "refresh_expires_at": "2026-10-29T08:31:47.773681815Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b74f8cb9-96c1-469f-92f0-f36850b1336f` → **200**

```json
{
  "id": "b74f8cb9-96c1-469f-92f0-f36850b1336f",
  "short_number": 23,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "014843ab-bfae-4579-b7f9-d82ddd938c28",
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
  "created_at": "2026-10-28T20:31:44.691424Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T23:31:42Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "af53ffb5-9166-440a-bb09-90c51221fab1",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T20:31:46.380682Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b74f8cb9-96c1-469f-92f0-f36850b1336f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T20:31:44.693156Z",
      "actor": {
        "type": "CLIENT",
        "id": "014843ab-bfae-4579-b7f9-d82ddd938c28",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "b74f8cb9-96c1-469f-92f0-f36850b1336f",
        "preorder": true,
        "quote_id": "054286d8-2f14-4e35-8232-95748b8a0ba8",
        "pickup_at": "2026-10-28T23:31:42Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "ef970a1d-7469-4d5f-a8f2-7fbcbbb07ecc"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T20:31:46.38179Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b74f8cb9-96c1-469f-92f0-f36850b1336f",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "af53ffb5-9166-440a-bb09-90c51221fab1"
      },
      "correlation_id": "a4ab0ca4-c53e-451d-a157-60a7debc51f3"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order b74f8cb9-96c1-469f-92f0-f36850b1336f, reservation af53ffb5-9166-440a-bb09-90c51221fab1.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15126"
}
```

```json
{
  "challenge_id": "f998d2a7-b534-42e3-89be-2d969bc29f3c",
  "expires_at": "2026-10-28T20:36:48.621416312Z",
  "resend_available_at": "2026-10-28T20:31:49.621416312Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "211079",
  "sent_at": "2026-10-28T20:31:48.623513311Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f998d2a7-b534-42e3-89be-2d969bc29f3c",
  "code": "211079",
  "device_ref": "sandbox-15126"
}
```

```json
{
  "session_id": "0d05abb5-d7db-405d-b546-0e40ab80de5f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQwOCwiaWF0IjoxNzkzMjE5NTA4LCJqdGkiOiJlMjQyY2ZhMi03MWQ1LTRhNDEtOWE1Ny0zYjgzNTUxZDRlZGYiLCJzaWQiOiIwZDA1YWJiNS1kN2RiLTQwNWQtYjU0Ni0wZTQwYWI4MGRlNWYifQ.CiMF984nJuqXwHiER25y99G6x43WJg31yqlllQ8-7tA",
  "access_expires_at": "2026-10-28T20:46:48.923601463Z",
  "refresh_token": "AWwUrvbN-7Ij-xr55T_q_ZFCmN5gm3_0jSenbOuzzY4",
  "refresh_expires_at": "2026-11-27T20:31:48.922903187Z",
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
  "command_id": "f9c04be1-a863-41b8-a1f9-86243267268f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:31:49Z",
    "sequence": 1793219509460
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9939d029-08b4-4e72-92de-27f8b4ed55a0",
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
  "last_heartbeat_at": "2026-10-28T20:31:49.47842Z",
  "last_location_at": "2026-10-28T20:31:49.47842Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671409830",
  "device_ref": "sandbox-31952"
}
```

```json
{
  "challenge_id": "fe6cbb41-539f-4329-aa14-b86fa64940e2",
  "expires_at": "2026-10-28T20:36:49.769240927Z",
  "resend_available_at": "2026-10-28T20:31:50.769240927Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671409830` → **200**

```json
{
  "phone": "+380671409830",
  "audience": "CLIENT",
  "code": "800196",
  "sent_at": "2026-10-28T20:31:49.771784102Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe6cbb41-539f-4329-aa14-b86fa64940e2",
  "code": "800196",
  "device_ref": "sandbox-31952"
}
```

```json
{
  "session_id": "9aeccc95-0d04-4d92-bcc3-1989b3c5acdf",
  "subject": {
    "type": "CLIENT",
    "id": "55f38a68-9325-4d8d-8f7a-e95bf335562d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NWYzOGE2OC05MzI1LTRkOGQtOGY3YS1lOTViZjMzNTU2MmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwNDEwLCJpYXQiOjE3OTMyMTk1MTAsImp0aSI6IjMxZGQ3YmQ2LTYzNDUtNDE4OC04YjMwLWQwYmFlYzcwNmViYiIsInNpZCI6IjlhZWNjYzk1LTBkMDQtNGQ5Mi1iY2MzLTE5ODliM2M1YWNkZiJ9.EZXHuqBX2WotYBJIg8eAMvFzPprHkvBHgFCnSS2vtnQ",
  "access_expires_at": "2026-10-28T20:46:50.067725207Z",
  "refresh_token": "XaPZRZ20RJqNRMac4vDy8C-ugDe61ltojoDxIYBfNN8",
  "refresh_expires_at": "2026-11-27T20:31:50.06712126Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a873658f-53ba-4dd1-8467-b7361d2372df",
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
  "id": "fceb6763-eabd-4acc-be1d-63a0636d558f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:36:50.345988Z",
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
  "command_id": "7d99c88d-6888-416f-ae3b-dc9a403194ec",
  "quote_id": "fceb6763-eabd-4acc-be1d-63a0636d558f",
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
  "id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "55f38a68-9325-4d8d-8f7a-e95bf335562d",
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
  "created_at": "2026-10-28T20:31:50.625998Z",
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
    "id": "37164e2b-3614-46c5-aa1f-7020f0bd5cf6",
    "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
    "expires_at": "2026-10-28T20:32:05.628998Z",
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

`POST /api/driver/v1/offers/37164e2b-3614-46c5-aa1f-7020f0bd5cf6/accept` → **200**

```json
{
  "command_id": "27e270d4-6bc7-4fc1-bd7f-c934e0317dd7"
}
```

```json
{
  "id": "a51ed508-8448-4ffe-8c53-7c2defc9eef6",
  "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "969f65f0-884d-4142-be1c-f30059981acc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "969f65f0-884d-4142-be1c-f30059981acc",
  "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "assignment_id": "a51ed508-8448-4ffe-8c53-7c2defc9eef6",
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

`POST /api/driver/v1/work-sessions/9939d029-08b4-4e72-92de-27f8b4ed55a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:31:51Z",
    "sequence": 1793219511750
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9939d029-08b4-4e72-92de-27f8b4ed55a0",
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
  "last_heartbeat_at": "2026-10-28T20:31:51.769294Z",
  "last_location_at": "2026-10-28T20:31:51.769294Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "969f65f0-884d-4142-be1c-f30059981acc",
  "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "assignment_id": "a51ed508-8448-4ffe-8c53-7c2defc9eef6",
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

`POST /api/driver/v1/trips/969f65f0-884d-4142-be1c-f30059981acc/arrive` → **200**

```json
{
  "command_id": "c729421e-1715-4b84-9706-16b058144295",
  "expected_version": 0
}
```

```json
{
  "id": "969f65f0-884d-4142-be1c-f30059981acc",
  "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "assignment_id": "a51ed508-8448-4ffe-8c53-7c2defc9eef6",
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
  "arrived_at": "2026-10-28T20:31:52.310002Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/969f65f0-884d-4142-be1c-f30059981acc/start` → **200**

```json
{
  "command_id": "1072069a-a938-409d-8912-adc04cc7dcbb",
  "expected_version": 1
}
```

```json
{
  "id": "969f65f0-884d-4142-be1c-f30059981acc",
  "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "assignment_id": "a51ed508-8448-4ffe-8c53-7c2defc9eef6",
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
  "arrived_at": "2026-10-28T20:31:52.310002Z",
  "started_at": "2026-10-28T20:31:52.593386Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/9939d029-08b4-4e72-92de-27f8b4ed55a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:31:52Z",
    "sequence": 1793219512869
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9939d029-08b4-4e72-92de-27f8b4ed55a0",
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
  "last_heartbeat_at": "2026-10-28T20:31:52.887892Z",
  "last_location_at": "2026-10-28T20:31:52.887892Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/969f65f0-884d-4142-be1c-f30059981acc/complete` → **200**

```json
{
  "command_id": "48a3d5a3-373c-4c8e-aff1-7640ce5cd5b6",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:31:53Z",
  "cash_received": true
}
```

```json
{
  "id": "969f65f0-884d-4142-be1c-f30059981acc",
  "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "assignment_id": "a51ed508-8448-4ffe-8c53-7c2defc9eef6",
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
  "arrived_at": "2026-10-28T20:31:52.310002Z",
  "started_at": "2026-10-28T20:31:52.593386Z",
  "completed_at": "2026-10-28T20:31:53.163494Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/cd92df64-4896-4d10-8e42-02cad2dd9de2/rating` → **200**

```json
{
  "command_id": "4c2d9b20-a154-4e5d-a99e-7f6cfacac68f",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "score": 5,
  "created_at": "2026-10-28T20:31:53.460820254Z"
}
```

`POST /api/driver/v1/orders/cd92df64-4896-4d10-8e42-02cad2dd9de2/rating` → **200**

```json
{
  "command_id": "322d75a3-5e7d-4bd2-a9ab-281082963ecd",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
  "score": 4,
  "created_at": "2026-10-28T20:31:53.733557312Z"
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
  "session_id": "3877df2b-f87e-4d23-8e0d-0a62007dc5df",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MTQsImlhdCI6MTc5MzIxOTUxNCwianRpIjoiOGY3YTJjMjUtYTEzMy00MDUwLTlmODQtMDFmNjk5NDU3MDFmIiwic2lkIjoiMzg3N2RmMmItZjg3ZS00ZDIzLThlMGQtMGE2MjAwN2RjNWRmIn0.l6upSM1VMIRhcpsvv6zBS7-rPk_HYVnT4gZ1dmbD4N8",
  "access_expires_at": "2026-10-28T20:46:54.588022325Z",
  "refresh_token": "cvM489TIEUSKdpeJtQQSpDoHAvXlRK98ZCa0ttCGrQ8",
  "refresh_expires_at": "2026-10-29T08:31:54.587440858Z",
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
  "session_id": "d9d7a490-b989-404d-8aa8-00e850447715",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MTUsImlhdCI6MTc5MzIxOTUxNSwianRpIjoiMDA2ZDk2MzMtNzBjMS00OTRhLWIxMjgtMWQ2N2Y4NTI2Y2RhIiwic2lkIjoiZDlkN2E0OTAtYjk4OS00MDRkLThhYTgtMDBlODUwNDQ3NzE1In0.0YSL7Bv-lppfgO-BsCuMkgiyMC35KLLB3wthZ4p5wBQ",
  "access_expires_at": "2026-10-28T20:46:55.179548983Z",
  "refresh_token": "kxiDyyiyNVJRnfFJnwbJEmgPtGGiaqSjLJ07cPe2xII",
  "refresh_expires_at": "2026-10-29T08:31:55.178974619Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/cd92df64-4896-4d10-8e42-02cad2dd9de2/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
      "author_type": "RIDER",
      "author_id": "55f38a68-9325-4d8d-8f7a-e95bf335562d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T20:31:53.46082Z"
    },
    {
      "order_id": "cd92df64-4896-4d10-8e42-02cad2dd9de2",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "55f38a68-9325-4d8d-8f7a-e95bf335562d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T20:31:53.733557Z"
    }
  ]
}
```

Done: ratings for order cd92df64-4896-4d10-8e42-02cad2dd9de2.

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
  "session_id": "6ca73501-aee0-4c7b-82cc-c95a1d63bf65",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MTYsImlhdCI6MTc5MzIxOTUxNiwianRpIjoiZWY5MDcwZWUtMTE2MS00OTVmLWJmNzMtMjhiZjA4NzZkOTA3Iiwic2lkIjoiNmNhNzM1MDEtYWVlMC00YzdiLTgyY2MtYzk1YTFkNjNiZjY1In0.Zy5KQvma1g5IjfCrGC8BgG-TN6HhOl0Ez8xTAdoq520",
  "access_expires_at": "2026-10-28T20:46:56.03055198Z",
  "refresh_token": "6h3tt0N0NbDl1dCLFgNbm7IP-7yNpXxqPXZ33YOcXHA",
  "refresh_expires_at": "2026-10-29T08:31:56.029785557Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "19da8ac3-3a28-400b-bebf-22f5d44b89de",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "9c391d63-2731-4e63-baaf-71111571ed5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:31:56.309996Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9c391d63-2731-4e63-baaf-71111571ed5c` → **200**

```json
{
  "id": "9c391d63-2731-4e63-baaf-71111571ed5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:31:56.309996Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9c391d63-2731-4e63-baaf-71111571ed5c` → **200**

```json
{
  "id": "9c391d63-2731-4e63-baaf-71111571ed5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:31:56.309996Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9c391d63-2731-4e63-baaf-71111571ed5c` → **200**

```json
{
  "id": "9c391d63-2731-4e63-baaf-71111571ed5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:31:56.309996Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/9c391d63-2731-4e63-baaf-71111571ed5c` → **200**

```json
{
  "id": "9c391d63-2731-4e63-baaf-71111571ed5c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T20:31:56.309996Z",
  "ready_at": "2026-10-28T20:31:59.547289Z",
  "expires_at": "2026-10-29T20:31:59.547289Z"
}
```

`GET /api/admin/v1/reports/exports/9c391d63-2731-4e63-baaf-71111571ed5c/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
total,23,10,13,0,0,18,5,0,21,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "bb30ce23-bea3-418a-bfa7-cfc390c8a524",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "05c2e73d-5388-4262-be83-0314a3843717",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:32:00.684498Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/05c2e73d-5388-4262-be83-0314a3843717` → **200**

```json
{
  "id": "05c2e73d-5388-4262-be83-0314a3843717",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:32:00.684498Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/05c2e73d-5388-4262-be83-0314a3843717` → **200**

```json
{
  "id": "05c2e73d-5388-4262-be83-0314a3843717",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:32:00.684498Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/05c2e73d-5388-4262-be83-0314a3843717` → **200**

```json
{
  "id": "05c2e73d-5388-4262-be83-0314a3843717",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T20:32:00.684498Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/05c2e73d-5388-4262-be83-0314a3843717` → **200**

```json
{
  "id": "05c2e73d-5388-4262-be83-0314a3843717",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T20:32:00.684498Z",
  "ready_at": "2026-10-28T20:32:04.555651Z",
  "expires_at": "2026-10-29T20:32:04.555651Z"
}
```

`GET /api/admin/v1/reports/exports/05c2e73d-5388-4262-be83-0314a3843717/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
total,UAH,10,1387.37,130.74,208.14,1179.23,10.52,0.00,162.97,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/1fc8ec4a-3c25-4806-ba95-d989eda7ced4` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/1fc8ec4a-3c25-4806-ba95-d989eda7ced4",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b8dd5b5f-23e3-42f1-8a64-72f66580b744"
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
  "device_ref": "sandbox-13821"
}
```

```json
{
  "challenge_id": "c8977f13-537e-4844-b690-35632e477a48",
  "expires_at": "2026-10-28T20:37:05.409325158Z",
  "resend_available_at": "2026-10-28T20:32:06.409325158Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "082768",
  "sent_at": "2026-10-28T20:32:05.411712684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8977f13-537e-4844-b690-35632e477a48",
  "code": "082768",
  "device_ref": "sandbox-13821"
}
```

```json
{
  "session_id": "396fac46-9225-4985-a531-c8a1ef625daf",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQyNSwiaWF0IjoxNzkzMjE5NTI1LCJqdGkiOiJlNWIyZjhiMS03NWJiLTRhNTgtYmZmNi05OGQ2ZDZhYjJhMjQiLCJzaWQiOiIzOTZmYWM0Ni05MjI1LTQ5ODUtYTUzMS1jOGExZWY2MjVkYWYifQ.YREk8P4A4WhgjLClCpsL7JPwVQwJnLF9zrf6xmEjHUM",
  "access_expires_at": "2026-10-28T20:47:05.713964269Z",
  "refresh_token": "6zu9BSUVJmWzHJ_L8yLOcC-dNqvdRHwxMEAlsedJ8fg",
  "refresh_expires_at": "2026-11-27T20:32:05.713334631Z",
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
  "command_id": "5264542e-01f7-4bf9-bc59-91f961d647fb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:32:06Z",
    "sequence": 1793219526524
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0c7cf304-eca3-4994-933b-e35b094fb460",
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
  "last_heartbeat_at": "2026-10-28T20:32:06.54335Z",
  "last_location_at": "2026-10-28T20:32:06.54335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "7d8aef71-607a-4178-8b3d-511f1c9896ac",
  "points": [
    {
      "sequence": 1793219528829,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T20:31:08Z"
    },
    {
      "sequence": 1793219528837,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T20:32:08Z"
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
  "session_id": "3d60c0a9-fed8-4360-b744-4b212569c318",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MjksImlhdCI6MTc5MzIxOTUyOSwianRpIjoiN2VlM2NiNTgtMGRmNy00NGY4LWFjOWEtNmNkYzljNTM0NjBiIiwic2lkIjoiM2Q2MGMwYTktZmVkOC00MzYwLWI3NDQtNGIyMTI1NjljMzE4In0.aMgCNMAriPyfGkX0b5lfiWDf50wB5-OHxyyJy1ZIYt0",
  "access_expires_at": "2026-10-28T20:47:09.438874119Z",
  "refresh_token": "-ItDpTUYyjOtGdo7GTZpBZdxS4pTTXXgL9v64oTuN4o",
  "refresh_expires_at": "2026-10-29T08:32:09.438293954Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "b35fd65e-faf8-48cb-9923-acf11e7e8df0",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T20:32:08Z",
        "track_point_id": "64d3d3f4-5db4-40d9-a3f3-79b9718e992c",
        "work_session_id": "0c7cf304-eca3-4994-933b-e35b094fb460"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T20:32:08Z",
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

`POST /api/admin/v1/driver-risk-flags/b35fd65e-faf8-48cb-9923-acf11e7e8df0/confirm` → **200**

```json
{
  "command_id": "5ac39ff1-5ffb-4d1e-b1fb-d9008e57df00",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "b35fd65e-faf8-48cb-9923-acf11e7e8df0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T20:32:08Z",
    "track_point_id": "64d3d3f4-5db4-40d9-a3f3-79b9718e992c",
    "work_session_id": "0c7cf304-eca3-4994-933b-e35b094fb460"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T20:32:08Z",
  "reason": null,
  "reviewed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reviewed_at": "2026-10-28T20:32:10.368624Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/b35fd65e-faf8-48cb-9923-acf11e7e8df0/dismiss` → **409**

```json
{
  "command_id": "68acecf9-bbba-4044-950e-9ec5c13963e6",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/b35fd65e-faf8-48cb-9923-acf11e7e8df0/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cfb5a1ba-33e5-46da-9c41-f64f0a521309"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "d7430f72-de74-4ade-a05a-6a9b6312f47d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "4faf85a4-4eea-42c9-b557-cc114b74f767",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "raised_at": "2026-10-28T20:32:11.009547Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/4faf85a4-4eea-42c9-b557-cc114b74f767/dismiss` → **200**

```json
{
  "command_id": "8e726c11-316e-47e2-840a-0ce17fc5930b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "4faf85a4-4eea-42c9-b557-cc114b74f767",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "raised_at": "2026-10-28T20:32:11.009547Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reviewed_at": "2026-10-28T20:32:11.316644Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "4abbcf5e-9429-4e1b-b9ee-ef1b0c2491e9",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "b35fd65e-faf8-48cb-9923-acf11e7e8df0"
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
      "actor_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T20:32:11.611541Z"
    }
  ]
}
```

Done: flag b35fd65e-faf8-48cb-9923-acf11e7e8df0 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "68253fb4-735c-4bd4-931d-343049f18453",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MzIsImlhdCI6MTc5MzIxOTUzMiwianRpIjoiNGQ0OWM3YjgtZTE4Yy00ZWNmLWJhZDYtMmEwMDEwMDU3N2U2Iiwic2lkIjoiNjgyNTNmYjQtNzM1Yy00YmQ0LTkzMWQtMzQzMDQ5ZjE4NDUzIn0.u7a22ELr4mXH2u_1KRyGgZOfwq27XBAmb6MehtGMSgE",
  "access_expires_at": "2026-10-28T20:47:12.45308404Z",
  "refresh_token": "fnlf3ubMYYsJ4ntKPtXEfMc-S0AnExSFb4L7fatJ_QY",
  "refresh_expires_at": "2026-10-29T08:32:12.452514134Z",
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
      "actor_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T20:32:11.611541Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "e0338ab4-25ec-4cd0-9657-be4b86b1cd73",
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
  "session_id": "0c7cf304-eca3-4994-933b-e35b094fb460",
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
  "last_heartbeat_at": "2026-10-28T20:32:06.54335Z",
  "last_location_at": "2026-10-28T20:32:06.54335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0c7cf304-eca3-4994-933b-e35b094fb460/close` → **200**

```json
{
  "command_id": "5fc4f2aa-a4a3-47e3-8ff7-c9eea8283a7a",
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
  "session_id": "221bb054-8ddc-48ca-869e-9ee6183ea53d",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0MzQsImlhdCI6MTc5MzIxOTUzNCwianRpIjoiMDJlMDE0YWYtOTZiYS00ZGYyLTkxMmQtOGUwNDlhYjU4YzE1Iiwic2lkIjoiMjIxYmIwNTQtOGRkYy00OGNhLTg2OWUtOWVlNjE4M2VhNTNkIn0.SzBrKo4R_gRQ8r0l8XLuwedMcmpeX9KRNBkmjRGArV4",
  "access_expires_at": "2026-10-28T20:47:14.145802283Z",
  "refresh_token": "GODTwZjofIn9__CaNTKs6tdUgCg5esCVIME-15FE9Gg",
  "refresh_expires_at": "2026-10-29T08:32:14.145124768Z",
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
  "command_id": "6aa8959b-205b-4822-a797-37cbc2860f2d",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T20:32:14.715008Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "6aa8959b-205b-4822-a797-37cbc2860f2d",
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
  "changed_by": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T20:32:14.715008Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48336417102",
  "device_ref": "sandbox-21904"
}
```

```json
{
  "challenge_id": "43a148e4-9782-4c0b-93e3-4f469d59abea",
  "expires_at": "2026-10-28T20:37:15.305654879Z",
  "resend_available_at": "2026-10-28T20:32:16.305654879Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48336417102` → **200**

```json
{
  "phone": "+48336417102",
  "audience": "CLIENT",
  "code": "572726",
  "sent_at": "2026-10-28T20:32:15.3081637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43a148e4-9782-4c0b-93e3-4f469d59abea",
  "code": "572726",
  "device_ref": "sandbox-21904"
}
```

```json
{
  "session_id": "8cf2d988-7cf4-42d9-881c-cdda91b66e4c",
  "subject": {
    "type": "CLIENT",
    "id": "3ed9ff4b-13c4-420c-b296-12a103a334dc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZWQ5ZmY0Yi0xM2M0LTQyMGMtYjI5Ni0xMmExMDNhMzM0ZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwNDM1LCJpYXQiOjE3OTMyMTk1MzUsImp0aSI6IjNmNWYxOTgwLTlmNDMtNDU3YS1hMDgyLTU4MmNlY2I3ZGY0OCIsInNpZCI6IjhjZjJkOTg4LTdjZjQtNDJkOS04ODFjLWNkZGE5MWI2NmU0YyJ9.IUKtPEpybuIE9Nr5Fl2B_i7AaSfTYX9o0BhPlUsoAGQ",
  "access_expires_at": "2026-10-28T20:47:15.610209263Z",
  "refresh_token": "YF-yp4y9JlxHOV_jho9AqzQx5t_KtCDF7Riji0yEXo0",
  "refresh_expires_at": "2026-11-27T20:32:15.609617988Z",
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
  "correlation_id": "e66b372b-b1ab-4ba5-bb24-9a5a2db33619"
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
  "device_ref": "sandbox-29764"
}
```

```json
{
  "challenge_id": "1cf7166c-0a7e-49f7-982a-e7adbf37c730",
  "expires_at": "2026-10-28T20:37:16.4245319Z",
  "resend_available_at": "2026-10-28T20:32:17.4245319Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "393763",
  "sent_at": "2026-10-28T20:32:16.426661855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cf7166c-0a7e-49f7-982a-e7adbf37c730",
  "code": "393763",
  "device_ref": "sandbox-29764"
}
```

```json
{
  "session_id": "33ca59b1-1d11-47f9-98c3-6b74293a7e58",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQzNiwiaWF0IjoxNzkzMjE5NTM2LCJqdGkiOiI1ODQxY2NkMS01OTQ2LTQ3YTItOWVkMS03NWZlNzZjZDYzN2YiLCJzaWQiOiIzM2NhNTliMS0xZDExLTQ3ZjktOThjMy02Yjc0MjkzYTdlNTgifQ.LZ-q12Ov7skfHvcFsvv5Vn7wrkEGxV5ZHxDkMSYnzjA",
  "access_expires_at": "2026-10-28T20:47:16.714360933Z",
  "refresh_token": "ivZJ4eJh3lSQdL8vQHRPxpsbF0Bt88qbr_yXfVPD924",
  "refresh_expires_at": "2026-11-27T20:32:16.713780907Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "84afc6e9-6be3-4cc1-a822-3070963c48db",
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
  "last_heartbeat_at": "2026-10-28T20:31:45.823296Z",
  "last_location_at": "2026-10-28T20:31:45.823296Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/84afc6e9-6be3-4cc1-a822-3070963c48db/handover` → **200**

```json
{
  "command_id": "86711a41-a717-434f-9eb5-23b593c68824",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "84afc6e9-6be3-4cc1-a822-3070963c48db",
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
  "last_heartbeat_at": "2026-10-28T20:31:45.823296Z",
  "last_location_at": "2026-10-28T20:31:45.823296Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/84afc6e9-6be3-4cc1-a822-3070963c48db/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:32:17Z",
    "sequence": 1793219537526
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "84afc6e9-6be3-4cc1-a822-3070963c48db",
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
  "last_heartbeat_at": "2026-10-28T20:32:17.544053Z",
  "last_location_at": "2026-10-28T20:32:17.544053Z",
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
  "session_id": "84afc6e9-6be3-4cc1-a822-3070963c48db",
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
  "last_heartbeat_at": "2026-10-28T20:32:17.544053Z",
  "last_location_at": "2026-10-28T20:32:17.544053Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/84afc6e9-6be3-4cc1-a822-3070963c48db/close` → **200**

```json
{
  "command_id": "1110e7af-70bb-4f5e-870d-f398a5e07c6c",
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
  "correlation_id": "fab09966-22ef-4f4e-8e0a-ed1a676315cb"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677699987",
  "device_ref": "sandbox-841"
}
```

```json
{
  "challenge_id": "69074209-bbd2-4393-bbc1-304ee4a6522d",
  "expires_at": "2026-10-28T20:37:18.920498552Z",
  "resend_available_at": "2026-10-28T20:32:19.920498552Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677699987` → **200**

```json
{
  "phone": "+380677699987",
  "audience": "CLIENT",
  "code": "904224",
  "sent_at": "2026-10-28T20:32:18.922745186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69074209-bbd2-4393-bbc1-304ee4a6522d",
  "code": "904224",
  "device_ref": "sandbox-841"
}
```

```json
{
  "session_id": "32efb6fd-a38c-4a42-b9b3-db8f2a974043",
  "subject": {
    "type": "CLIENT",
    "id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOWJmMGYwZi00Yjg2LTRjZDYtYThiNS1mNDM5OTI0ZGY2MGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwNDM5LCJpYXQiOjE3OTMyMTk1MzksImp0aSI6IjFmOGUyOTczLTYyNTktNDdhOC1iYTY4LTQ4YmM2OTI5Y2M1NyIsInNpZCI6IjMyZWZiNmZkLWEzOGMtNGE0Mi1iOWIzLWRiOGYyYTk3NDA0MyJ9.zyNW9iJQt6xZjCQYdjlDLoxgbv67f1hINDVKl3xhkos",
  "access_expires_at": "2026-10-28T20:47:19.217593231Z",
  "refresh_token": "-BzbzNRiVyUiUiolBvaIyuSeMLBdm5wgsSIwSKCVdfk",
  "refresh_expires_at": "2026-11-27T20:32:19.217046128Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "7d4cfee9-d161-4936-83ff-a6336ba5ddf2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b072ef85-63c4-47c3-a020-535b48fe8e69",
  "upload_path": "/api/rider/v1/uploads/b072ef85-63c4-47c3-a020-535b48fe8e69",
  "expires_at": "2026-10-28T20:47:19.48592375Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b072ef85-63c4-47c3-a020-535b48fe8e69` → **200**

```json
{
  "file_id": "b072ef85-63c4-47c3-a020-535b48fe8e69",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "c33f5056-030d-4893-9d8e-391a458b91c2",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b072ef85-63c4-47c3-a020-535b48fe8e69"
  ]
}
```

```json
{
  "id": "a66adab6-e578-4a3a-bfb5-498fd0d7b77c",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T20:32:19.79458Z",
  "updated_at": "2026-10-28T20:32:19.79458Z",
  "respond_by": "2026-10-29T00:32:19.79458Z",
  "messages": [
    {
      "id": "d247ca36-f1ce-453d-b84e-5d701dab7b3f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T20:32:19.795789Z",
      "attachments": [
        {
          "file_id": "b072ef85-63c4-47c3-a020-535b48fe8e69",
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
  "session_id": "12e372b4-425b-4ccb-92aa-3861b689a5bc",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0NDAsImlhdCI6MTc5MzIxOTU0MCwianRpIjoiOWY5YTg1NjEtZGZlNC00MzY5LWFjOWItNTc4NGFkNDhjZjM2Iiwic2lkIjoiMTJlMzcyYjQtNDI1Yi00Y2NiLTkyYWEtMzg2MWI2ODlhNWJjIn0.Q3oIqOmIZ_93-Yq21HZV9DFCx44eEkd1fMOgjGNjB4o",
  "access_expires_at": "2026-10-28T20:47:20.398827836Z",
  "refresh_token": "9jbYugmah7mCvtzyokmumGnIOKXNsOUinhFOa78YTn4",
  "refresh_expires_at": "2026-10-29T08:32:20.39824668Z",
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
  "session_id": "a617058a-19bc-49c1-ab93-e3c00a55eccf",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0NDAsImlhdCI6MTc5MzIxOTU0MCwianRpIjoiOTVhOThjNDktN2RmZS00Y2JjLTljZGItZWE1ZDMyNTVhNTdhIiwic2lkIjoiYTYxNzA1OGEtMTliYy00OWMxLWFiOTMtZTNjMDBhNTVlY2NmIn0.bOe44S0EgKsH8b4FIH6lPbLPpyQWexJLojnIEUzHKT0",
  "access_expires_at": "2026-10-28T20:47:20.95893099Z",
  "refresh_token": "nnIkvlXyBIxnZNbmgN-Mve6ueIznU99pYTLUtEvyzjg",
  "refresh_expires_at": "2026-10-29T08:32:20.958407491Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/a66adab6-e578-4a3a-bfb5-498fd0d7b77c/attachments/b072ef85-63c4-47c3-a020-535b48fe8e69` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "3f5ed510-74e8-4f56-bd05-2d61b4b4825d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "772dd871-8179-4129-8fe1-7132dc82ef9a",
  "upload_path": "/api/operator/v1/uploads/772dd871-8179-4129-8fe1-7132dc82ef9a",
  "expires_at": "2026-10-28T20:47:21.25239782Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/772dd871-8179-4129-8fe1-7132dc82ef9a` → **200**

```json
{
  "file_id": "772dd871-8179-4129-8fe1-7132dc82ef9a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/a66adab6-e578-4a3a-bfb5-498fd0d7b77c` → **200**

```json
{
  "id": "a66adab6-e578-4a3a-bfb5-498fd0d7b77c",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T20:32:19.79458Z",
  "updated_at": "2026-10-28T20:32:19.79458Z",
  "respond_by": "2026-10-29T00:32:19.79458Z",
  "messages": [
    {
      "id": "d247ca36-f1ce-453d-b84e-5d701dab7b3f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T20:32:19.795789Z",
      "attachments": [
        {
          "file_id": "b072ef85-63c4-47c3-a020-535b48fe8e69",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/a66adab6-e578-4a3a-bfb5-498fd0d7b77c/comments` → **200**

```json
{
  "command_id": "550cb32b-7f93-4126-8436-6fbb4002d257",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "772dd871-8179-4129-8fe1-7132dc82ef9a"
  ]
}
```

```json
{
  "id": "a66adab6-e578-4a3a-bfb5-498fd0d7b77c",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T20:32:19.79458Z",
  "updated_at": "2026-10-28T20:32:21.826411Z",
  "respond_by": "2026-10-29T00:32:19.79458Z",
  "messages": [
    {
      "id": "d247ca36-f1ce-453d-b84e-5d701dab7b3f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T20:32:19.795789Z",
      "attachments": [
        {
          "file_id": "b072ef85-63c4-47c3-a020-535b48fe8e69",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "7b631980-aa3f-4118-a11e-94175afd1fe3",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T20:32:21.825949Z",
      "attachments": [
        {
          "file_id": "772dd871-8179-4129-8fe1-7132dc82ef9a",
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

`GET /api/rider/v1/support/cases/a66adab6-e578-4a3a-bfb5-498fd0d7b77c` → **200**

```json
{
  "id": "a66adab6-e578-4a3a-bfb5-498fd0d7b77c",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T20:32:19.79458Z",
  "updated_at": "2026-10-28T20:32:21.826411Z",
  "respond_by": "2026-10-29T00:32:19.79458Z",
  "messages": [
    {
      "id": "d247ca36-f1ce-453d-b84e-5d701dab7b3f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "b9bf0f0f-4b86-4cd6-a8b5-f439924df60e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T20:32:19.795789Z",
      "attachments": [
        {
          "file_id": "b072ef85-63c4-47c3-a020-535b48fe8e69",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "7b631980-aa3f-4118-a11e-94175afd1fe3",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T20:32:21.825949Z",
      "attachments": [
        {
          "file_id": "772dd871-8179-4129-8fe1-7132dc82ef9a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/a66adab6-e578-4a3a-bfb5-498fd0d7b77c/attachments/772dd871-8179-4129-8fe1-7132dc82ef9a` → **200**

Done: support case a66adab6-e578-4a3a-bfb5-498fd0d7b77c, rider attachment b072ef85-63c4-47c3-a020-535b48fe8e69, operator attachment 772dd871-8179-4129-8fe1-7132dc82ef9a.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738802397",
  "device_ref": "sandbox-30711"
}
```

```json
{
  "challenge_id": "5d72e150-063c-41a2-ae91-7e1936304a56",
  "expires_at": "2026-10-28T20:37:22.409621797Z",
  "resend_available_at": "2026-10-28T20:32:23.409621797Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738802397` → **200**

```json
{
  "phone": "+380738802397",
  "audience": "CLIENT",
  "code": "614267",
  "sent_at": "2026-10-28T20:32:22.411895504Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d72e150-063c-41a2-ae91-7e1936304a56",
  "code": "614267",
  "device_ref": "sandbox-30711"
}
```

```json
{
  "session_id": "6d00da23-c073-4dee-9082-52faf4b37c4c",
  "subject": {
    "type": "CLIENT",
    "id": "cb0938c7-049f-4913-a4f6-96fb32c215b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYjA5MzhjNy0wNDlmLTQ5MTMtYTRmNi05NmZiMzJjMjE1YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwNDQyLCJpYXQiOjE3OTMyMTk1NDIsImp0aSI6IjdmYjVlNmJlLWI5NTItNDkwYi1iNWNkLWM0NDVlY2FmZTMwOCIsInNpZCI6IjZkMDBkYTIzLWMwNzMtNGRlZS05MDgyLTUyZmFmNGIzN2M0YyJ9.xemoiIdeK-J1UeDOCAabH2gIDQoQTY59O6eVjv9qps8",
  "access_expires_at": "2026-10-28T20:47:22.700727008Z",
  "refresh_token": "yf4q247gruD8TN909sxlSncNKw-iCGzyJwFkD-4kYns",
  "refresh_expires_at": "2026-11-27T20:32:22.70005158Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "671552c6-403a-4ecf-9a25-f79eb9175e05",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1731a690-eb66-4fb2-889f-4ad7e82d9df8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1731a690-eb66-4fb2-889f-4ad7e82d9df8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "22ba26998241899597b06095d5349b55",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1731a690-eb66-4fb2-889f-4ad7e82d9df8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738802397"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1731a690-eb66-4fb2-889f-4ad7e82d9df8",
  "expires_at": "2026-10-28T21:02:22.982609Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/1731a690-eb66-4fb2-889f-4ad7e82d9df8` → **200**

```json
{
  "id": "1731a690-eb66-4fb2-889f-4ad7e82d9df8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T21:02:22.982609Z",
  "card": {
    "id": "08f974c2-9f9b-4627-b577-948a709dfc38",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6343",
    "card_type": "Visa",
    "created_at": "2026-10-28T20:32:23.266176Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "af8af694-2a01-401f-9500-9bbd5c244499",
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
  "id": "f31a365b-7081-4882-ba27-6aea4ef597d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:37:23.553488Z",
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
  "command_id": "9791bce0-f8fb-422b-bcbc-9d30a0efe7d3",
  "quote_id": "f31a365b-7081-4882-ba27-6aea4ef597d1",
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
  "id": "bf939e85-a72d-4063-b49c-ade23ce552ad",
  "short_number": 25,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cb0938c7-049f-4913-a4f6-96fb32c215b8",
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
  "created_at": "2026-10-28T20:32:23.841887Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bf939e85-a72d-4063-b49c-ade23ce552ad` → **200**

```json
{
  "id": "bf939e85-a72d-4063-b49c-ade23ce552ad",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cb0938c7-049f-4913-a4f6-96fb32c215b8",
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
  "created_at": "2026-10-28T20:32:23.841887Z",
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

`GET /api/rider/v1/orders/bf939e85-a72d-4063-b49c-ade23ce552ad` → **200**

```json
{
  "id": "bf939e85-a72d-4063-b49c-ade23ce552ad",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "cb0938c7-049f-4913-a4f6-96fb32c215b8",
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
  "created_at": "2026-10-28T20:32:23.841887Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bf939e85-a72d-4063-b49c-ade23ce552ad/switch-to-cash` → **200**

```json
{
  "command_id": "e2b6fbc1-5965-44a2-8c84-9923f3c19009",
  "expected_version": 3
}
```

```json
{
  "id": "bf939e85-a72d-4063-b49c-ade23ce552ad",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "cb0938c7-049f-4913-a4f6-96fb32c215b8",
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
  "created_at": "2026-10-28T20:32:23.841887Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bf939e85-a72d-4063-b49c-ade23ce552ad/switch-to-cash` → **409**

```json
{
  "command_id": "fdc790dc-aac3-4e87-8f1c-d3c80150f983",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/bf939e85-a72d-4063-b49c-ade23ce552ad/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7e371899-5618-48fd-bd76-a5b7293c53e8"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/bf939e85-a72d-4063-b49c-ade23ce552ad` → **200**

```json
{
  "id": "bf939e85-a72d-4063-b49c-ade23ce552ad",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "cb0938c7-049f-4913-a4f6-96fb32c215b8",
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
  "created_at": "2026-10-28T20:32:23.841887Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bf939e85-a72d-4063-b49c-ade23ce552ad/cancel` → **200**

```json
{
  "command_id": "a4f6b881-4b6f-4e8d-a6a2-052f9889bb52",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bf939e85-a72d-4063-b49c-ade23ce552ad",
  "short_number": 25,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "cb0938c7-049f-4913-a4f6-96fb32c215b8",
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
  "created_at": "2026-10-28T20:32:23.841887Z",
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
  "session_id": "40166748-d224-4a67-936a-b7dffccb51fa",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0NDYsImlhdCI6MTc5MzIxOTU0NiwianRpIjoiMzg2NjdlMjEtMTFlYS00OWY5LTgwNGMtZDQ2YTZkZmRmZmRlIiwic2lkIjoiNDAxNjY3NDgtZDIyNC00YTY3LTkzNmEtYjdkZmZjY2I1MWZhIn0.4v1wIS6O7jZL4MXK-EyhwM6yAy_rAm0V79ipHNQ1vto",
  "access_expires_at": "2026-10-28T20:47:26.177769389Z",
  "refresh_token": "OwCQODIixsnp06JrhdWlY3yO4GzCP-nr56KhSzXh45U",
  "refresh_expires_at": "2026-10-29T08:32:26.177168456Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30015"
}
```

```json
{
  "challenge_id": "55acdc14-1d21-474a-a93c-dd293951c279",
  "expires_at": "2026-10-28T20:37:26.441251591Z",
  "resend_available_at": "2026-10-28T20:32:27.441251591Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "422573",
  "sent_at": "2026-10-28T20:32:26.443443791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55acdc14-1d21-474a-a93c-dd293951c279",
  "code": "422573",
  "device_ref": "sandbox-30015"
}
```

```json
{
  "session_id": "2fd61d50-ec86-41ed-b419-98e3ba9cc413",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQ0NiwiaWF0IjoxNzkzMjE5NTQ2LCJqdGkiOiJmZWZjMDlmOC03OTk5LTQ5NDQtYmExMC1jYjRlZjhlZGUxMTkiLCJzaWQiOiIyZmQ2MWQ1MC1lYzg2LTQxZWQtYjQxOS05OGUzYmE5Y2M0MTMifQ.mXmdkGwXNI6Fl9SDRJpmWiYdGdbFOBSbWPbhnn1QDkg",
  "access_expires_at": "2026-10-28T20:47:26.743455654Z",
  "refresh_token": "Aul6J_VgPMDTFXpuh6fwxyJiOtFMqXWW209XctDz0BI",
  "refresh_expires_at": "2026-11-27T20:32:26.742888905Z",
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
      "actor_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T20:32:11.611541Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T20:32:13.007042Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "8d82c6e6-1132-433a-a479-fc9e3debb24f",
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
  "device_ref": "sandbox-5952"
}
```

```json
{
  "challenge_id": "a08a2b9c-e260-4afd-97ee-97c1d33710d7",
  "expires_at": "2026-10-28T20:37:27.851755777Z",
  "resend_available_at": "2026-10-28T20:32:28.851755777Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "676807",
  "sent_at": "2026-10-28T20:32:27.85440496Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a08a2b9c-e260-4afd-97ee-97c1d33710d7",
  "code": "676807",
  "device_ref": "sandbox-5952"
}
```

```json
{
  "session_id": "c404b102-6041-4ef0-86aa-e7e2af43dbc6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQ0OCwiaWF0IjoxNzkzMjE5NTQ4LCJqdGkiOiI3ZTQ1ZTA4Yy0yNGFkLTQ1NTMtOWJmNi03ZjNmMDY4NDRlNWIiLCJzaWQiOiJjNDA0YjEwMi02MDQxLTRlZjAtODZhYS1lN2UyYWY0M2RiYzYifQ.Ynf1y2t14z2Sii9Zn3wPvNZ3P0tQepFUGrHZ8BqVfdg",
  "access_expires_at": "2026-10-28T20:47:28.156041862Z",
  "refresh_token": "tbLhO45Fd8fHAfP9eWYQAmPGYUZULSVplfp9lrkREo4",
  "refresh_expires_at": "2026-11-27T20:32:28.155535526Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9939d029-08b4-4e72-92de-27f8b4ed55a0",
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
  "last_heartbeat_at": "2026-10-28T20:31:52.887892Z",
  "last_location_at": "2026-10-28T20:31:52.887892Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9939d029-08b4-4e72-92de-27f8b4ed55a0/handover` → **200**

```json
{
  "command_id": "51adfd07-6a85-46f5-8cdf-9619aabbdff5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9939d029-08b4-4e72-92de-27f8b4ed55a0",
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
  "last_heartbeat_at": "2026-10-28T20:31:52.887892Z",
  "last_location_at": "2026-10-28T20:31:52.887892Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9939d029-08b4-4e72-92de-27f8b4ed55a0/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:32:28Z",
    "sequence": 1793219548964
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9939d029-08b4-4e72-92de-27f8b4ed55a0",
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
  "last_heartbeat_at": "2026-10-28T20:32:28.982866Z",
  "last_location_at": "2026-10-28T20:32:28.982866Z",
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
  "command_id": "230e3da9-d59d-4542-aecf-ebf19dd3ad00",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:32:29Z",
    "sequence": 1793219549533
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6f44861-8ac7-4329-8e87-8f9251d8b597",
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
  "last_heartbeat_at": "2026-10-28T20:32:29.551825Z",
  "last_location_at": "2026-10-28T20:32:29.551825Z",
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
  "session_id": "7efee010-48ab-40b8-85b3-5dbbccd36348",
  "subject": {
    "type": "STAFF",
    "id": "fcd127b7-431c-4e3e-bc7f-19deba39bfd9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2QxMjdiNy00MzFjLTRlM2UtYmM3Zi0xOWRlYmEzOWJmZDkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMjA0NTAsImlhdCI6MTc5MzIxOTU1MCwianRpIjoiZjBkMzUyM2UtYzJhZi00M2I5LWE3ODgtMTdmZTVlYjBhMWVmIiwic2lkIjoiN2VmZWUwMTAtNDhhYi00MGI4LTg1YjMtNWRiYmNjZDM2MzQ4In0._tiMEbOe9ihVAgvv4gQVaOiK6Y9Xhn5wlK5cWgDBLo4",
  "access_expires_at": "2026-10-28T20:47:30.13280797Z",
  "refresh_token": "0elpfmr3WSrlV628Ny_hX7w3L7z_2Singfss3u-RKfQ",
  "refresh_expires_at": "2026-10-29T08:32:30.132256268Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7d676fce-22d0-46eb-8482-5ae0af0e4209",
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
  "id": "bcd95741-eb93-4f30-a5b7-0c76f663cfc2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:37:30.431470Z",
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
  "command_id": "db796798-da7b-4c4b-8480-0e96994d8744",
  "quote_id": "bcd95741-eb93-4f30-a5b7-0c76f663cfc2",
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
  "id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
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
  "created_at": "2026-10-28T20:32:30.714543Z",
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
    "id": "07e23d1f-5a46-4fb5-a03a-5f32fb1e03f2",
    "order_id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
    "expires_at": "2026-10-28T20:32:45.718219Z",
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

`POST /api/driver/v1/offers/07e23d1f-5a46-4fb5-a03a-5f32fb1e03f2/accept` → **200**

```json
{
  "command_id": "1be5f951-4831-41bb-a08b-fa22b5e499a0"
}
```

```json
{
  "id": "c533bf4a-1196-4363-bddb-487b4c6b1c79",
  "order_id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757",
  "order_id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
  "assignment_id": "c533bf4a-1196-4363-bddb-487b4c6b1c79",
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

`POST /api/driver/v1/work-sessions/b6f44861-8ac7-4329-8e87-8f9251d8b597/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T20:32:32Z",
    "sequence": 1793219552111
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b6f44861-8ac7-4329-8e87-8f9251d8b597",
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
  "last_heartbeat_at": "2026-10-28T20:32:32.129877Z",
  "last_location_at": "2026-10-28T20:32:32.129877Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757/arrive` → **200**

```json
{
  "command_id": "3df39a59-5cf2-45dc-be37-80134fc66af5",
  "expected_version": 0
}
```

```json
{
  "id": "d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757",
  "order_id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
  "assignment_id": "c533bf4a-1196-4363-bddb-487b4c6b1c79",
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
  "arrived_at": "2026-10-28T20:32:32.414256Z",
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

`POST /api/driver/v1/trips/d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757/start` → **200**

```json
{
  "command_id": "1e49e673-63b1-45c0-a173-d2d67476ec5b",
  "expected_version": 1
}
```

```json
{
  "id": "d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757",
  "order_id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
  "assignment_id": "c533bf4a-1196-4363-bddb-487b4c6b1c79",
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
  "arrived_at": "2026-10-28T20:32:32.414256Z",
  "started_at": "2026-10-28T20:32:32.706196Z",
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

`POST /api/driver/v1/trips/d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757/complete` → **200**

```json
{
  "command_id": "ea37d8c0-abab-428c-9116-cddcb3244c1a",
  "expected_version": 2,
  "reported_at": "2026-10-28T20:32:32Z",
  "cash_received": true
}
```

```json
{
  "id": "d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757",
  "order_id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
  "assignment_id": "c533bf4a-1196-4363-bddb-487b4c6b1c79",
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
  "arrived_at": "2026-10-28T20:32:32.414256Z",
  "started_at": "2026-10-28T20:32:32.706196Z",
  "completed_at": "2026-10-28T20:32:32.996315Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/88ca76cb-5b6e-402e-b571-266dd812fe9d` → **200**

```json
{
  "id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
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
    "id": "c533bf4a-1196-4363-bddb-487b4c6b1c79",
    "order_id": "88ca76cb-5b6e-402e-b571-266dd812fe9d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d5b6f5f9-d7eb-4bdd-80c5-45a1d0bf1757",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T20:32:30.714543Z",
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
  "session_id": "9939d029-08b4-4e72-92de-27f8b4ed55a0",
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
  "last_heartbeat_at": "2026-10-28T20:32:28.982866Z",
  "last_location_at": "2026-10-28T20:32:28.982866Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9939d029-08b4-4e72-92de-27f8b4ed55a0/close` → **200**

```json
{
  "command_id": "5e440d25-14ea-4d42-9f75-32cea69e04c8",
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
  "session_id": "b6f44861-8ac7-4329-8e87-8f9251d8b597",
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
  "last_heartbeat_at": "2026-10-28T20:32:32.129877Z",
  "last_location_at": "2026-10-28T20:32:32.129877Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b6f44861-8ac7-4329-8e87-8f9251d8b597/close` → **200**

```json
{
  "command_id": "05abc53b-4703-45d9-a3d0-47fa93df550c",
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

Done: terminal order 88ca76cb-5b6e-402e-b571-266dd812fe9d by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25169"
}
```

```json
{
  "challenge_id": "a897ec1f-fce8-4131-89e5-908debcdf9f1",
  "expires_at": "2026-10-28T20:37:37.947249494Z",
  "resend_available_at": "2026-10-28T20:32:38.947249494Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "830605",
  "sent_at": "2026-10-28T20:32:37.949816464Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a897ec1f-fce8-4131-89e5-908debcdf9f1",
  "code": "830605",
  "device_ref": "sandbox-25169"
}
```

```json
{
  "session_id": "b761be55-abb3-4ddb-bf0b-2736dd1d600b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQ1OCwiaWF0IjoxNzkzMjE5NTU4LCJqdGkiOiIwZWM5ZDRlYy04OTViLTQ4NzUtYmNhNi0zMGZhOTA3MjA2YmUiLCJzaWQiOiJiNzYxYmU1NS1hYmIzLTRkZGItYmYwYi0yNzM2ZGQxZDYwMGIifQ.JGS0XqbUSksaJtWqa0G2evBnNTG3aSXu62xDoxlnfEs",
  "access_expires_at": "2026-10-28T20:47:38.245096508Z",
  "refresh_token": "RfvewC6ehi_Xmdi2N8c5OsfytBLIwRAlGs8lZHTxyrY",
  "refresh_expires_at": "2026-11-27T20:32:38.244519248Z",
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
  "device_ref": "sandbox-14151"
}
```

```json
{
  "challenge_id": "d6a793c8-725e-4905-94d4-432f26d4df95",
  "expires_at": "2026-10-28T20:37:38.773931996Z",
  "resend_available_at": "2026-10-28T20:32:39.773931996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "196238",
  "sent_at": "2026-10-28T20:32:38.776149573Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6a793c8-725e-4905-94d4-432f26d4df95",
  "code": "196238",
  "device_ref": "sandbox-14151"
}
```

```json
{
  "session_id": "b7f3f39d-7717-465e-b482-58c1752ace26",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQ1OSwiaWF0IjoxNzkzMjE5NTU5LCJqdGkiOiJiZDRjYmFjMi02MGFkLTQ0NTMtOGEyYS01NjExNjk2ZTlmMWUiLCJzaWQiOiJiN2YzZjM5ZC03NzE3LTQ2NWUtYjQ4Mi01OGMxNzUyYWNlMjYifQ.hEjXqw4sEdF_ssHroPmSM9eOOcKDuuxhb4YRjJFkA80",
  "access_expires_at": "2026-10-28T20:47:39.080329039Z",
  "refresh_token": "fVtYINPaYF7kZ2fcgrmg4qvghehDO9fAcbXmo_K5Eh4",
  "refresh_expires_at": "2026-11-27T20:32:39.079688948Z",
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
  "device_ref": "sandbox-27744"
}
```

```json
{
  "challenge_id": "3c2baf16-b0e1-4011-bdef-c43ab9e597ac",
  "expires_at": "2026-10-28T20:37:39.615028519Z",
  "resend_available_at": "2026-10-28T20:32:40.615028519Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "510973",
  "sent_at": "2026-10-28T20:32:39.617650318Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c2baf16-b0e1-4011-bdef-c43ab9e597ac",
  "code": "510973",
  "device_ref": "sandbox-27744"
}
```

```json
{
  "session_id": "cd41ba68-98b7-4376-82ad-703a8bc37984",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIyMDQ1OSwiaWF0IjoxNzkzMjE5NTU5LCJqdGkiOiJlYzg3MDk5NS01ZGQ4LTRjM2YtYTExMy1lOGRhMTIzNmMxMTMiLCJzaWQiOiJjZDQxYmE2OC05OGI3LTQzNzYtODJhZC03MDNhOGJjMzc5ODQifQ.jsCD5kxFGCImf_SAWupSQvY-cTy4Eg2-5P70piNckwU",
  "access_expires_at": "2026-10-28T20:47:39.928463759Z",
  "refresh_token": "oYiNmiS_YGZoPiOHh_k0U-sBOvc0q786ckbsYoAgYgE",
  "refresh_expires_at": "2026-11-27T20:32:39.927838331Z",
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
  "phone": "+380691234207",
  "device_ref": "sandbox-29155"
}
```

```json
{
  "challenge_id": "f9cac1ef-698d-4be2-917d-004eb07f3912",
  "expires_at": "2026-10-28T20:37:40.468840085Z",
  "resend_available_at": "2026-10-28T20:32:41.468840085Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380691234207` → **200**

```json
{
  "phone": "+380691234207",
  "audience": "CLIENT",
  "code": "116905",
  "sent_at": "2026-10-28T20:32:40.471036757Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9cac1ef-698d-4be2-917d-004eb07f3912",
  "code": "116905",
  "device_ref": "sandbox-29155"
}
```

```json
{
  "session_id": "0daa283f-0455-471f-9a8e-acd9f28bbe97",
  "subject": {
    "type": "CLIENT",
    "id": "e92dd303-9b99-45c6-bac8-3d3899580ecd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTJkZDMwMy05Yjk5LTQ1YzYtYmFjOC0zZDM4OTk1ODBlY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjIwNDYwLCJpYXQiOjE3OTMyMTk1NjAsImp0aSI6IjA2ZmU5ZTdhLTk4ZTgtNDEzNS1hODczLTVlYWEyMzUwZjg3MCIsInNpZCI6IjBkYWEyODNmLTA0NTUtNDcxZi05YThlLWFjZDlmMjhiYmU5NyJ9.IoHsj9fgyUtagKBS-ATlbNNHI2pMQzEiVCaBTdnfhCY",
  "access_expires_at": "2026-10-28T20:47:40.757824553Z",
  "refresh_token": "muMHQjkfKIV8-ePwXjPePuAE9Ls0uF00i5m3fb7lgOY",
  "refresh_expires_at": "2026-11-27T20:32:40.757276255Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eecb509a-87fa-45cf-8bda-a444598712af",
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
  "id": "d31aeda6-fc34-45f8-a25b-a4a033cc77c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T20:37:41.033837Z",
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
  "command_id": "41c840f6-7500-41b3-a2d5-7bce0910fce2",
  "quote_id": "d31aeda6-fc34-45f8-a25b-a4a033cc77c7",
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
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T20:32:41.317493Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:32:41.317493Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.171199583
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 4.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 17
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.150819952
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

`GET /api/rider/v1/orders/b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944` → **200**

```json
{
  "id": "b6a1f4f4-6deb-4207-bbdd-c1a04d5a1944",
  "short_number": 27,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e92dd303-9b99-45c6-bac8-3d3899580ecd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T20:32:41.317493Z",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793219869639E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793219869778E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793219869779E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.79321986978E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793219869779E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
