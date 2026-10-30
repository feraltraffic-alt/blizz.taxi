# Sandbox transcript (2026-10-30T13:20:04Z, 014b4d1)

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
  "correlation_id": "f6c00c3a-a7a0-48f8-9a92-fe872896382b"
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
  "session_id": "3ed5cfac-a258-4b73-b53d-5c9d7e56560b",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMTMsImlhdCI6MTc5MzM2NjQxMywianRpIjoiMGZhZjFlMzctMWUxYS00NmMyLTk5MDAtNTY5NTVhN2M5OGZmIiwic2lkIjoiM2VkNWNmYWMtYTI1OC00YjczLWI1M2QtNWM5ZDdlNTY1NjBiIn0.LdKbFY6-bnj5XSLoWDbKJ4WNM03-UqlRAmo0G86Sxf4",
  "access_expires_at": "2026-10-30T13:35:13.472379207Z",
  "refresh_token": "QKB0hpVO3pf4uP2mVocerNlkRMHp8dmrpTzMxFDHVBw",
  "refresh_expires_at": "2026-10-31T01:20:13.47023363Z",
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
  "session_id": "9907716e-9afe-4731-a75e-b9825e9f457d",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMTUsImlhdCI6MTc5MzM2NjQxNSwianRpIjoiOTlkMTdmYmYtN2U5YS00ZDU3LThmMjUtYjMwYjc5N2Y2ODJhIiwic2lkIjoiOTkwNzcxNmUtOWFmZS00NzMxLWE3NWUtYjk4MjVlOWY0NTdkIn0.q3RhPLwLFRIticc3xPkOWiqPpsTaDtfvfH0Clp4xmeg",
  "access_expires_at": "2026-10-30T13:35:15.260218396Z",
  "refresh_token": "tSO8-ZiObIW6NNSoFZselSv6qf9w9o-gqeRPEbaXxG8",
  "refresh_expires_at": "2026-10-31T01:20:15.259141087Z",
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
  "device_ref": "sandbox-23016"
}
```

```json
{
  "challenge_id": "b404e978-2967-4e13-b653-feeaa4fe92fe",
  "expires_at": "2026-10-30T13:25:15.840853153Z",
  "resend_available_at": "2026-10-30T13:20:16.840853153Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "329877",
  "sent_at": "2026-10-30T13:20:15.8554235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b404e978-2967-4e13-b653-feeaa4fe92fe",
  "code": "329877",
  "device_ref": "sandbox-23016"
}
```

```json
{
  "session_id": "1fac9eb6-dcc4-4766-b3e3-be63a40c6673",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMxNiwiaWF0IjoxNzkzMzY2NDE2LCJqdGkiOiJiMTc0MjFmNy1hZjhiLTQxMTEtOGQ0My1jMDMyYzk0N2MxZGQiLCJzaWQiOiIxZmFjOWViNi1kY2M0LTQ3NjYtYjNlMy1iZTYzYTQwYzY2NzMifQ.MQkC9bozudzrUvMKgByt4HLHBQpcU1JbNy_KOHYsTgk",
  "access_expires_at": "2026-10-30T13:35:16.173207317Z",
  "refresh_token": "9yDMpHHflpNTCYVuZ0Yq_1WYhcp__4breIBiVjMaS5E",
  "refresh_expires_at": "2026-11-29T13:20:16.171964867Z",
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
  "command_id": "b34a0b0c-7c53-4e74-a2b9-b1bac3d75c90",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:16Z",
    "sequence": 1793366416735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02585a2d-3a5a-4a23-841b-589c32860837",
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
  "last_heartbeat_at": "2026-10-30T13:20:16.800711Z",
  "last_location_at": "2026-10-30T13:20:16.800711Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637130571",
  "device_ref": "sandbox-9404"
}
```

```json
{
  "challenge_id": "f8f94158-fc06-4223-888a-cd67b067f1ee",
  "expires_at": "2026-10-30T13:25:17.099887508Z",
  "resend_available_at": "2026-10-30T13:20:18.099887508Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637130571` → **200**

```json
{
  "phone": "+380637130571",
  "audience": "CLIENT",
  "code": "339723",
  "sent_at": "2026-10-30T13:20:17.105439413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8f94158-fc06-4223-888a-cd67b067f1ee",
  "code": "339723",
  "device_ref": "sandbox-9404"
}
```

```json
{
  "session_id": "8bf1a86b-6ad6-4ba3-a65b-ffa06e77065f",
  "subject": {
    "type": "CLIENT",
    "id": "34f588a7-01b6-4871-ad85-89f62d87e558"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNGY1ODhhNy0wMWI2LTQ4NzEtYWQ4NS04OWY2MmQ4N2U1NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzE3LCJpYXQiOjE3OTMzNjY0MTcsImp0aSI6ImNhMjQ1NTZiLTUwOTItNGI0OS1hMzhiLTRkYWZmMzUwN2NkYiIsInNpZCI6IjhiZjFhODZiLTZhZDYtNGJhMy1hNjViLWZmYTA2ZTc3MDY1ZiJ9.KAUCH8KR5DOGTBdPQEyvcEf25yJjjcegDuEEHmsq8Jo",
  "access_expires_at": "2026-10-30T13:35:17.418434644Z",
  "refresh_token": "uKUqtJDoOwdKgGRAOdiK1cxrL1eeSL9kSkXITcS2n3Q",
  "refresh_expires_at": "2026-11-29T13:20:17.417346415Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "779428e3-391d-4a19-a347-b3dd138d7c97",
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
  "id": "82b1b046-d467-4cd6-9a6c-ed23544c2a3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:17.727618Z",
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
  "command_id": "ad57cdf4-33e2-4755-b73e-06cab19b0781",
  "quote_id": "82b1b046-d467-4cd6-9a6c-ed23544c2a3d",
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
  "id": "04c6a1a4-57e7-4fb3-9274-d506db05ea49",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "34f588a7-01b6-4871-ad85-89f62d87e558",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:20:18.133564Z",
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
    "id": "64ce6f13-c78e-4a30-ab89-e75e1b06e266",
    "order_id": "04c6a1a4-57e7-4fb3-9274-d506db05ea49",
    "expires_at": "2026-10-30T13:20:33.146216Z",
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

`POST /api/driver/v1/offers/64ce6f13-c78e-4a30-ab89-e75e1b06e266/accept` → **200**

```json
{
  "command_id": "f14db379-1463-4b52-a6aa-8c0bbb7de481"
}
```

```json
{
  "id": "a77603b0-6827-49e2-be03-538aa28a78e5",
  "order_id": "04c6a1a4-57e7-4fb3-9274-d506db05ea49",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7a55e49d-4616-41ff-bf23-53a4f7e313cd",
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
  "command_id": "fdaaa9ae-cd5b-4b6a-babe-aeb6ca5b9268",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:20:19.372839934Z"
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
  "id": "7a55e49d-4616-41ff-bf23-53a4f7e313cd",
  "order_id": "04c6a1a4-57e7-4fb3-9274-d506db05ea49",
  "assignment_id": "a77603b0-6827-49e2-be03-538aa28a78e5",
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

`POST /api/driver/v1/work-sessions/02585a2d-3a5a-4a23-841b-589c32860837/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:20Z",
    "sequence": 1793366420249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02585a2d-3a5a-4a23-841b-589c32860837",
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
  "last_heartbeat_at": "2026-10-30T13:20:20.272492Z",
  "last_location_at": "2026-10-30T13:20:20.272492Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/7a55e49d-4616-41ff-bf23-53a4f7e313cd/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f7d802f2-cd9a-4208-8f11-534186eb942e",
  "expected_version": 0
}
```

```json
{
  "id": "7a55e49d-4616-41ff-bf23-53a4f7e313cd",
  "order_id": "04c6a1a4-57e7-4fb3-9274-d506db05ea49",
  "assignment_id": "a77603b0-6827-49e2-be03-538aa28a78e5",
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
  "arrived_at": "2026-10-30T13:20:20.563819Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7a55e49d-4616-41ff-bf23-53a4f7e313cd/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "092521ad-9535-43bc-9d01-7b148f5e0bf1",
  "expected_version": 1
}
```

```json
{
  "id": "7a55e49d-4616-41ff-bf23-53a4f7e313cd",
  "order_id": "04c6a1a4-57e7-4fb3-9274-d506db05ea49",
  "assignment_id": "a77603b0-6827-49e2-be03-538aa28a78e5",
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
  "arrived_at": "2026-10-30T13:20:20.563819Z",
  "started_at": "2026-10-30T13:20:20.885646Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7a55e49d-4616-41ff-bf23-53a4f7e313cd/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "19ebb888-dd3a-4e81-84ae-0489ee90a92c",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:20:21Z",
  "cash_received": true
}
```

```json
{
  "id": "7a55e49d-4616-41ff-bf23-53a4f7e313cd",
  "order_id": "04c6a1a4-57e7-4fb3-9274-d506db05ea49",
  "assignment_id": "a77603b0-6827-49e2-be03-538aa28a78e5",
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
  "arrived_at": "2026-10-30T13:20:20.563819Z",
  "started_at": "2026-10-30T13:20:20.885646Z",
  "completed_at": "2026-10-30T13:20:21.192401Z",
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
  "session_id": "02585a2d-3a5a-4a23-841b-589c32860837",
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
  "last_heartbeat_at": "2026-10-30T13:20:20.272492Z",
  "last_location_at": "2026-10-30T13:20:20.272492Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/02585a2d-3a5a-4a23-841b-589c32860837/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "471f8d04-ed6b-4fb4-983e-2eea15c09aab",
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
  "command_id": "d45f47fc-e2d8-406b-805d-f4dc08346536",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:22Z",
    "sequence": 1793366422480
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
  "correlation_id": "0d028e40-e9db-4b7e-a84d-ad6c9b6f67a1",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "2711fd50-bf3c-4679-b9cd-1936323587d4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:22Z",
    "sequence": 1793366422481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6006f058-928a-4c28-be3b-d49d0e52f33b",
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
  "last_heartbeat_at": "2026-10-30T13:20:22.348375Z",
  "last_location_at": "2026-10-30T13:20:22.348375Z",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T13:20:19.37284Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6c93f841-abae-4b40-a241-e413d9c7f83e",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:20:22.915964254Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6006f058-928a-4c28-be3b-d49d0e52f33b",
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
  "last_heartbeat_at": "2026-10-30T13:20:22.348375Z",
  "last_location_at": "2026-10-30T13:20:22.348375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6006f058-928a-4c28-be3b-d49d0e52f33b/close` → **200**

```json
{
  "command_id": "cb770c96-7d4f-4a98-8c30-bfd355e97c1b",
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
  "session_id": "b5803643-284a-42c0-bc29-f152ca6cf35c",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczMjQsImlhdCI6MTc5MzM2NjQyNCwianRpIjoiZDkwZDYyNTctY2FmNC00ZDU1LWI0ZmMtYzMyYmNmMTk0OWQxIiwic2lkIjoiYjU4MDM2NDMtMjg0YS00MmMwLWJjMjktZjE1MmNhNmNmMzVjIn0.9k2kjVvybxuLfHv5tLUZY0kM3FcOL-xUuhCZPH4yS7M",
  "access_expires_at": "2026-10-30T13:35:24.070636277Z",
  "refresh_token": "MKHrX5qWv8CZim7FykO1xFqXb-q3Pdx90s6wmOWzbsk",
  "refresh_expires_at": "2026-10-31T01:20:24.069772237Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "b364495f-0bde-4fe8-8fdc-784336398a48",
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
  "id": "c95d63b7-c2f7-44e5-926b-f099a95132b4",
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
  "created_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "created_at": "2026-10-30T13:20:24.377214Z",
  "updated_at": "2026-10-30T13:20:24.377214Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637216683",
  "device_ref": "sandbox-8780"
}
```

```json
{
  "challenge_id": "de68f456-20da-4418-bf38-351a43598953",
  "expires_at": "2026-10-30T13:25:24.65323254Z",
  "resend_available_at": "2026-10-30T13:20:25.65323254Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637216683` → **200**

```json
{
  "phone": "+380637216683",
  "audience": "CLIENT",
  "code": "506895",
  "sent_at": "2026-10-30T13:20:24.657486744Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de68f456-20da-4418-bf38-351a43598953",
  "code": "506895",
  "device_ref": "sandbox-8780"
}
```

```json
{
  "session_id": "d057106c-08db-4a8b-872d-67d627b68bdd",
  "subject": {
    "type": "CLIENT",
    "id": "906f61a4-1793-4a33-90e3-dfac79c8ea64"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MDZmNjFhNC0xNzkzLTRhMzMtOTBlMy1kZmFjNzljOGVhNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3MzI0LCJpYXQiOjE3OTMzNjY0MjQsImp0aSI6IjQ4NjAxOGM4LTNmZTAtNGRmZC05YTUyLTQ5YTkzNmFhMmEzMiIsInNpZCI6ImQwNTcxMDZjLTA4ZGItNGE4Yi04NzJkLTY3ZDYyN2I2OGJkZCJ9.JFNaCCIBNleeFQoVNV-c98uOeueHlQZ9xUyZQxJXxss",
  "access_expires_at": "2026-10-30T13:35:24.952976471Z",
  "refresh_token": "UnYUtvHlvF8C7zQiwwsjcUTkx6pEmp3hBVbsecfBGg0",
  "refresh_expires_at": "2026-11-29T13:20:24.952051534Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637216683` → **200**

```json
{
  "client_id": "906f61a4-1793-4a33-90e3-dfac79c8ea64"
}
```

`POST /api/admin/v1/rider-wallets/906f61a4-1793-4a33-90e3-dfac79c8ea64/top-ups` → **201**

```json
{
  "command_id": "4987f230-e424-4603-a36b-a4f13407af0b",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "906f61a4-1793-4a33-90e3-dfac79c8ea64",
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
      "id": "36241e67-127f-404b-a29a-6c2abc508523",
      "at": "2026-10-30T13:20:25.511024Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3c3b6765-f8dd-4aa1-840f-d8a481ffa783",
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
  "id": "58cd15ba-c2a2-4df7-bd27-746cb59ec12d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:25:25.810054Z",
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
      "id": "c95d63b7-c2f7-44e5-926b-f099a95132b4",
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
  "device_ref": "sandbox-29635"
}
```

```json
{
  "challenge_id": "811047d5-e440-4c1c-bd69-88ad7ddc6d9e",
  "expires_at": "2026-10-30T13:25:26.100079896Z",
  "resend_available_at": "2026-10-30T13:20:27.100079896Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "160293",
  "sent_at": "2026-10-30T13:20:26.104450084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "811047d5-e440-4c1c-bd69-88ad7ddc6d9e",
  "code": "160293",
  "device_ref": "sandbox-29635"
}
```

```json
{
  "session_id": "8a4d6be7-c808-4d30-b95b-aa803ca815cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMyNiwiaWF0IjoxNzkzMzY2NDI2LCJqdGkiOiI2Y2M0NDVhMi0zMmMxLTQ2N2ItYjhkYy04MDBjNDI2MjM0ZTgiLCJzaWQiOiI4YTRkNmJlNy1jODA4LTRkMzAtYjk1Yi1hYTgwM2NhODE1Y2MifQ.EW4CIRF8EweRCJqZcw12Nqt30x52_imm0_oMt2yAPOM",
  "access_expires_at": "2026-10-30T13:35:26.404090378Z",
  "refresh_token": "NiEmlM8fJCe1oQNIyLQ-THWColKXLi5Rya6XBvSMxPs",
  "refresh_expires_at": "2026-11-29T13:20:26.40323084Z",
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
  "command_id": "0c7485b9-c9f4-43dd-9f2f-7dce4158beb6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:26Z",
    "sequence": 1793366426968
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f8963fe-5455-4f6b-ad3b-8d2763cb47f3",
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
  "last_heartbeat_at": "2026-10-30T13:20:26.987504Z",
  "last_location_at": "2026-10-30T13:20:26.987504Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "bde8fec7-b06b-4d4e-bcf5-4035c882657c",
  "quote_id": "58cd15ba-c2a2-4df7-bd27-746cb59ec12d",
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
  "id": "75f837f2-d4d7-467d-badc-9377594df16a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "906f61a4-1793-4a33-90e3-dfac79c8ea64",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:20:27.301679Z",
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
  "client_id": "906f61a4-1793-4a33-90e3-dfac79c8ea64",
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
      "id": "36241e67-127f-404b-a29a-6c2abc508523",
      "at": "2026-10-30T13:20:25.511024Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
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
    "id": "e834a78b-6589-4f0f-b5db-3f75e25c0f45",
    "order_id": "75f837f2-d4d7-467d-badc-9377594df16a",
    "expires_at": "2026-10-30T13:20:42.310112Z",
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

`POST /api/driver/v1/offers/e834a78b-6589-4f0f-b5db-3f75e25c0f45/accept` → **200**

```json
{
  "command_id": "64c85ca3-3259-497b-b15a-fed581807de2"
}
```

```json
{
  "id": "012d88fa-1c7f-44cf-8bf6-d7622ad88a88",
  "order_id": "75f837f2-d4d7-467d-badc-9377594df16a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "46b6dcf1-d18d-4182-8930-baa8f94dd6e8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "46b6dcf1-d18d-4182-8930-baa8f94dd6e8",
  "order_id": "75f837f2-d4d7-467d-badc-9377594df16a",
  "assignment_id": "012d88fa-1c7f-44cf-8bf6-d7622ad88a88",
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

`POST /api/driver/v1/work-sessions/0f8963fe-5455-4f6b-ad3b-8d2763cb47f3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:30Z",
    "sequence": 1793366430761
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f8963fe-5455-4f6b-ad3b-8d2763cb47f3",
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
  "last_heartbeat_at": "2026-10-30T13:20:30.77951Z",
  "last_location_at": "2026-10-30T13:20:30.77951Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/46b6dcf1-d18d-4182-8930-baa8f94dd6e8/arrive` → **200**

```json
{
  "command_id": "ef9dd961-68b0-437b-954a-cd7dedb3664f",
  "expected_version": 0
}
```

```json
{
  "id": "46b6dcf1-d18d-4182-8930-baa8f94dd6e8",
  "order_id": "75f837f2-d4d7-467d-badc-9377594df16a",
  "assignment_id": "012d88fa-1c7f-44cf-8bf6-d7622ad88a88",
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
  "arrived_at": "2026-10-30T13:20:31.066369Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/46b6dcf1-d18d-4182-8930-baa8f94dd6e8/start` → **200**

```json
{
  "command_id": "617abd02-27de-44d2-a2d7-77c907b7b0aa",
  "expected_version": 1
}
```

```json
{
  "id": "46b6dcf1-d18d-4182-8930-baa8f94dd6e8",
  "order_id": "75f837f2-d4d7-467d-badc-9377594df16a",
  "assignment_id": "012d88fa-1c7f-44cf-8bf6-d7622ad88a88",
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
  "arrived_at": "2026-10-30T13:20:31.066369Z",
  "started_at": "2026-10-30T13:20:31.359084Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/46b6dcf1-d18d-4182-8930-baa8f94dd6e8/complete` → **200**

```json
{
  "command_id": "aa2c142d-27d1-4a14-b14b-6aa53c032532",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:20:31Z",
  "cash_received": true
}
```

```json
{
  "id": "46b6dcf1-d18d-4182-8930-baa8f94dd6e8",
  "order_id": "75f837f2-d4d7-467d-badc-9377594df16a",
  "assignment_id": "012d88fa-1c7f-44cf-8bf6-d7622ad88a88",
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
  "arrived_at": "2026-10-30T13:20:31.066369Z",
  "started_at": "2026-10-30T13:20:31.359084Z",
  "completed_at": "2026-10-30T13:20:31.646227Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "906f61a4-1793-4a33-90e3-dfac79c8ea64",
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
      "id": "f6bb0c82-ccc6-4453-a168-61c96ac46e0b",
      "at": "2026-10-30T13:20:32.034144Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "75f837f2-d4d7-467d-badc-9377594df16a"
    },
    {
      "id": "36241e67-127f-404b-a29a-6c2abc508523",
      "at": "2026-10-30T13:20:25.511024Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c95d63b7-c2f7-44e5-926b-f099a95132b4/archive` → **200**

```json
{
  "command_id": "fa97b79b-0c53-46a7-91c4-aec6a63e133e",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c95d63b7-c2f7-44e5-926b-f099a95132b4",
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
  "created_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "created_at": "2026-10-30T13:20:24.377214Z",
  "updated_at": "2026-10-30T13:20:35.22535Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0f8963fe-5455-4f6b-ad3b-8d2763cb47f3",
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
  "last_heartbeat_at": "2026-10-30T13:20:30.77951Z",
  "last_location_at": "2026-10-30T13:20:30.77951Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0f8963fe-5455-4f6b-ad3b-8d2763cb47f3/close` → **200**

```json
{
  "command_id": "4e8d74d4-0963-40c7-a3ff-46dd7c431824",
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

Done: order 75f837f2-d4d7-467d-badc-9377594df16a.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-3665"
}
```

```json
{
  "challenge_id": "8def74d2-b751-40ff-99c9-fd38d54aca00",
  "expires_at": "2026-10-30T13:25:36.093418537Z",
  "resend_available_at": "2026-10-30T13:20:37.093418537Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "912432",
  "sent_at": "2026-10-30T13:20:36.097660697Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8def74d2-b751-40ff-99c9-fd38d54aca00",
  "code": "912432",
  "device_ref": "sandbox-3665"
}
```

```json
{
  "session_id": "07f177f4-7ae4-484f-8c8c-6042e60faf20",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzMzNiwiaWF0IjoxNzkzMzY2NDM2LCJqdGkiOiI3MzliOTIyNC1kMjI3LTRkYTEtOWVkYi03M2I4YTcxZjgxZWIiLCJzaWQiOiIwN2YxNzdmNC03YWU0LTQ4NGYtOGM4Yy02MDQyZTYwZmFmMjAifQ.NWY-U9ubmAChvG5Yxvk9uwkG_clk4R6pafhFzNS943g",
  "access_expires_at": "2026-10-30T13:35:36.399191853Z",
  "refresh_token": "VY1npHXBjzKXOfmMt5F0joIvkklc1o3ceTIu6AEiIkA",
  "refresh_expires_at": "2026-11-29T13:20:36.398491471Z",
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
  "command_id": "efbb4391-49d8-4299-a165-6e26ef131d85",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:37Z",
    "sequence": 1793366437223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "8fbd4494-b327-4fa6-907f-832ff917ce66",
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
  "last_heartbeat_at": "2026-10-30T13:20:37.244799Z",
  "last_location_at": "2026-10-30T13:20:37.244799Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/8fbd4494-b327-4fa6-907f-832ff917ce66/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:42Z",
    "sequence": 1793366442528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "8fbd4494-b327-4fa6-907f-832ff917ce66",
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
  "last_heartbeat_at": "2026-10-30T13:20:42.547144Z",
  "last_location_at": "2026-10-30T13:20:37.244799Z",
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
  "session_id": "782939e5-efcd-4870-b20f-b022fc61fab4",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjczNDMsImlhdCI6MTc5MzM2NjQ0MywianRpIjoiMjNhZDMyNDUtYTY3NS00Y2I3LWJhOTctN2UwMjhjNmJmZTJkIiwic2lkIjoiNzgyOTM5ZTUtZWZjZC00ODcwLWIyMGYtYjAyMmZjNjFmYWI0In0.-OjVwuwc3ZuExDkGs0QmMZjl-JHaDB-fq4MuSy-3xM8",
  "access_expires_at": "2026-10-30T13:35:43.127515174Z",
  "refresh_token": "fh2eu8Gswro6iznLGeOc2XQa856Iofm4RAzdXmLa3nQ",
  "refresh_expires_at": "2026-10-31T01:20:43.126859345Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T13:20:43.401373984Z",
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
      "last_location_at": "2026-10-30T13:20:37.244799Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/8fbd4494-b327-4fa6-907f-832ff917ce66/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:20:43Z",
    "sequence": 1793366443688
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "8fbd4494-b327-4fa6-907f-832ff917ce66",
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
  "last_heartbeat_at": "2026-10-30T13:20:43.706596Z",
  "last_location_at": "2026-10-30T13:20:43.706596Z",
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
  "session_id": "8fbd4494-b327-4fa6-907f-832ff917ce66",
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
  "last_heartbeat_at": "2026-10-30T13:20:43.706596Z",
  "last_location_at": "2026-10-30T13:20:43.706596Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8fbd4494-b327-4fa6-907f-832ff917ce66/close` → **200**

```json
{
  "command_id": "4eb9bc6d-4d1b-4942-9176-0ab5386ca3b6",
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
  "device_ref": "sandbox-27098"
}
```

```json
{
  "challenge_id": "353f773f-799a-4cb8-b5f8-d640a8c31dae",
  "expires_at": "2026-10-30T13:25:44.563531151Z",
  "resend_available_at": "2026-10-30T13:20:45.563531151Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "499136",
  "sent_at": "2026-10-30T13:20:44.567785269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "353f773f-799a-4cb8-b5f8-d640a8c31dae",
  "code": "499136",
  "device_ref": "sandbox-27098"
}
```

```json
{
  "session_id": "b33bb3a8-363b-43fa-9ebd-7201689dd7d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM0NCwiaWF0IjoxNzkzMzY2NDQ0LCJqdGkiOiI4OTg3N2I0Mi0yMDYyLTQ2MWItOTEwOS04ZWE2YmUyYTlhN2UiLCJzaWQiOiJiMzNiYjNhOC0zNjNiLTQzZmEtOWViZC03MjAxNjg5ZGQ3ZDAifQ.3x3FEHUzQUx5HU7XrJn6eYvsDfBJuUN5OH-lkMatVgs",
  "access_expires_at": "2026-10-30T13:35:44.859510004Z",
  "refresh_token": "n5NbiDTMVGYPuBFaSQjRc4QcFNJCLXEXTKGhWNtfY0U",
  "refresh_expires_at": "2026-11-29T13:20:44.858654839Z",
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
  "device_ref": "sandbox-13694"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "769ccd64-a5b6-4d35-aebe-1fcede4af8f8",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-13694"
}
```

```json
{
  "challenge_id": "843fd223-c0d6-406e-9d00-5dcc9e72e750",
  "expires_at": "2026-10-30T13:25:46.678506903Z",
  "resend_available_at": "2026-10-30T13:20:47.678506903Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "393029",
  "sent_at": "2026-10-30T13:20:46.682437405Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "843fd223-c0d6-406e-9d00-5dcc9e72e750",
  "code": "393029",
  "device_ref": "sandbox-13694"
}
```

```json
{
  "session_id": "e2e2a27f-561b-4014-b054-1713a23e80b6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM0NiwiaWF0IjoxNzkzMzY2NDQ2LCJqdGkiOiJkM2NkZDhkMC1mZTNmLTQ4M2ItYjQ5YS01ODM0ZDA2MTk4Y2EiLCJzaWQiOiJlMmUyYTI3Zi01NjFiLTQwMTQtYjA1NC0xNzEzYTIzZTgwYjYifQ.OV_DIQljdoSUIdpSkSN_49_B_8e9dHPDGY4HXnhAU-o",
  "access_expires_at": "2026-10-30T13:35:46.973177194Z",
  "refresh_token": "cnPOcphW0PgtphXVitc1fsloe0rYk4K0EoOoohnprmE",
  "refresh_expires_at": "2026-11-29T13:20:46.972499169Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-15944"
}
```

```json
{
  "challenge_id": "b8e8d752-7c9c-402e-b231-9171c9cd9b2a",
  "expires_at": "2026-10-30T13:25:47.24600725Z",
  "resend_available_at": "2026-10-30T13:20:48.24600725Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "399247",
  "sent_at": "2026-10-30T13:20:47.249377857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8e8d752-7c9c-402e-b231-9171c9cd9b2a",
  "code": "399247",
  "device_ref": "sandbox-15944"
}
```

```json
{
  "session_id": "524bb372-6d2c-4f39-9d73-35e786091a63",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzM0NywiaWF0IjoxNzkzMzY2NDQ3LCJqdGkiOiI4MDNjNDM4Ny1hMWEyLTQwNzEtOGY4MS0xNGYxMzJjOGU5MzMiLCJzaWQiOiI1MjRiYjM3Mi02ZDJjLTRmMzktOWQ3My0zNWU3ODYwOTFhNjMifQ.N37ow5khpNtptlnrH8XpesRGIBhaode9cmhEiIRItR4",
  "access_expires_at": "2026-10-30T13:35:47.552970579Z",
  "refresh_token": "r2UOUlsSVOVupHicR6BlfZ9saalIk2Fyp0ETAQo-ZL8",
  "refresh_expires_at": "2026-11-29T13:20:47.552268267Z",
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
  "command_id": "bba14860-f4e7-494d-9c60-a2f6a71e6b51",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:23:51Z",
    "sequence": 1793366631372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f7c513f2-77cc-4623-890c-e1995a96bdf8",
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
  "last_heartbeat_at": "2026-10-30T13:23:51.390965Z",
  "last_location_at": "2026-10-30T13:23:51.390965Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600390351",
  "device_ref": "sandbox-17299"
}
```

```json
{
  "challenge_id": "f2933a16-ff11-4249-a606-c8fb6bee7f27",
  "expires_at": "2026-10-30T13:28:51.66543459Z",
  "resend_available_at": "2026-10-30T13:23:52.66543459Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600390351` → **200**

```json
{
  "phone": "+48600390351",
  "audience": "CLIENT",
  "code": "966375",
  "sent_at": "2026-10-30T13:23:51.668992247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f2933a16-ff11-4249-a606-c8fb6bee7f27",
  "code": "966375",
  "device_ref": "sandbox-17299"
}
```

```json
{
  "session_id": "a14fd8ee-8a4f-4ea9-acf6-14ff5cc80914",
  "subject": {
    "type": "CLIENT",
    "id": "109365ed-cc1b-46c5-8b5b-e137ff36a104"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDkzNjVlZC1jYzFiLTQ2YzUtOGI1Yi1lMTM3ZmYzNmExMDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTMxLCJpYXQiOjE3OTMzNjY2MzEsImp0aSI6ImMzMDEwZjE5LTUxODQtNDhmYy04OTkxLTBiZWU4ZGY4YTNiMiIsInNpZCI6ImExNGZkOGVlLThhNGYtNGVhOS1hY2Y2LTE0ZmY1Y2M4MDkxNCJ9.5koYbzw3QYZIZ-9oVJuLAiPXliMOFqrBkKBfzKs5_GA",
  "access_expires_at": "2026-10-30T13:38:51.962323034Z",
  "refresh_token": "5_6umWwb4X6W-3b57TCjtqMlKi1ZavkJ223njjcSO9c",
  "refresh_expires_at": "2026-11-29T13:23:51.961733949Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f457aced-0267-4632-96c5-115997a45059",
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
  "id": "1e70de34-9e38-4a08-8bd6-4680d498da5a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:28:52.239781Z",
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
  "command_id": "a1900dde-5d4a-44fa-81e6-d404eddb0897",
  "quote_id": "1e70de34-9e38-4a08-8bd6-4680d498da5a",
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
  "id": "2e02928a-5072-45cc-9332-6a8ceb561623",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "109365ed-cc1b-46c5-8b5b-e137ff36a104",
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
  "created_at": "2026-10-30T13:23:52.534206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2e02928a-5072-45cc-9332-6a8ceb561623` → **200**

```json
{
  "id": "2e02928a-5072-45cc-9332-6a8ceb561623",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "109365ed-cc1b-46c5-8b5b-e137ff36a104",
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
  "created_at": "2026-10-30T13:23:52.534206Z",
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

`POST /api/driver/v1/orders/2e02928a-5072-45cc-9332-6a8ceb561623/claim` → **422**

```json
{
  "command_id": "049d83c6-2a54-493a-a608-d57419f42d04"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2e02928a-5072-45cc-9332-6a8ceb561623/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "3f46245c-cf18-4dda-a004-0b328f893762"
}
```

`GET /api/rider/v1/orders/2e02928a-5072-45cc-9332-6a8ceb561623` → **200**

```json
{
  "id": "2e02928a-5072-45cc-9332-6a8ceb561623",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "109365ed-cc1b-46c5-8b5b-e137ff36a104",
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
  "created_at": "2026-10-30T13:23:52.534206Z",
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

`POST /api/driver/v1/orders/e646a48a-eb73-4a41-868f-958c5ba14574/claim` → **404**

```json
{
  "command_id": "1eab020b-629a-46ca-8537-803f44aca830"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e646a48a-eb73-4a41-868f-958c5ba14574/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5c5c98c2-d578-4df8-a4bc-915293a1cd08"
}
```

`POST /api/driver/v1/orders/e99023b8-ad1f-450f-a1fd-d5f00cc9da8b/claim` → **404**

```json
{
  "command_id": "d0015161-c35c-4d52-8aec-56548671a31a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e99023b8-ad1f-450f-a1fd-d5f00cc9da8b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "129c185c-ab32-413f-b1a3-7fc963a8aa39"
}
```

`POST /api/driver/v1/orders/e58697d5-609e-4ed0-8e08-8bb22b92c1f3/claim` → **404**

```json
{
  "command_id": "9ec2fae8-a668-416d-90bf-99b9c0dd8868"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e58697d5-609e-4ed0-8e08-8bb22b92c1f3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d6ecb675-2c0e-41f0-b284-92fe7d1fc581"
}
```

`POST /api/driver/v1/orders/87f29fc8-ae08-4988-9fe4-37ff66d37170/claim` → **404**

```json
{
  "command_id": "b039183b-b982-4af6-ab2f-31df895a09bc"
}
```

```json
{
  "instance": "/api/driver/v1/orders/87f29fc8-ae08-4988-9fe4-37ff66d37170/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e496166c-bccb-4abb-8a38-e15ad93151ac"
}
```

`POST /api/driver/v1/orders/c5ada272-882c-4800-b1ac-2d7ead050c7a/claim` → **404**

```json
{
  "command_id": "645c9600-9970-4cc7-a857-cec2c2c738ae"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c5ada272-882c-4800-b1ac-2d7ead050c7a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "de54979b-1c15-4041-8114-11d3cde534bc"
}
```

`POST /api/driver/v1/orders/be1a6517-b6ea-4e12-b881-2aff6f939e53/claim` → **404**

```json
{
  "command_id": "5e60d4d2-6618-4da2-966a-aa5ae87138e9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/be1a6517-b6ea-4e12-b881-2aff6f939e53/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "305aa221-1002-4e5d-a0d8-2aab60b21746"
}
```

`POST /api/driver/v1/orders/1f4e3a74-a0aa-4c8e-9636-40d0b7ac36af/claim` → **404**

```json
{
  "command_id": "db2f28d6-8f42-4389-8b44-7db2d9e7f75e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1f4e3a74-a0aa-4c8e-9636-40d0b7ac36af/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a8753e2f-8390-46c4-a868-a9c44002ca4f"
}
```

`POST /api/driver/v1/orders/98844670-7321-471b-a65c-0c29781018e0/claim` → **404**

```json
{
  "command_id": "cd4b0f59-bd9b-47e6-bac6-2498ae626934"
}
```

```json
{
  "instance": "/api/driver/v1/orders/98844670-7321-471b-a65c-0c29781018e0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b07dbbb1-4b77-4ca8-8b49-78aa80a63470"
}
```

`POST /api/driver/v1/orders/6cc01f81-ff4e-4ca6-9ff2-2b193da8823c/claim` → **404**

```json
{
  "command_id": "8f5d68fe-3742-42ba-9636-beb3c50adb1a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6cc01f81-ff4e-4ca6-9ff2-2b193da8823c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "19c2844e-d50e-4e75-89fd-93c6da8732ca"
}
```

`POST /api/driver/v1/orders/f3edf5c7-47b1-463e-a249-259441aad4b4/claim` → **404**

```json
{
  "command_id": "aa8c5881-618b-48ff-a27a-66b2f0542e85"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f3edf5c7-47b1-463e-a249-259441aad4b4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f206e2ab-cad0-48c1-83d8-e3cbcaca4181"
}
```

`POST /api/driver/v1/orders/22be6db5-8544-4fa9-a3aa-fa67cf9699d3/claim` → **404**

```json
{
  "command_id": "fd3d0cf0-8cee-4680-b1f3-d471e903e647"
}
```

```json
{
  "instance": "/api/driver/v1/orders/22be6db5-8544-4fa9-a3aa-fa67cf9699d3/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "60b80c76-538a-4641-95e0-4b0718ca429c"
}
```

`POST /api/driver/v1/orders/b6d20f94-2e47-4968-8dfd-974877fc7f3a/claim` → **404**

```json
{
  "command_id": "13834a24-4507-4336-8394-644477eb4023"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b6d20f94-2e47-4968-8dfd-974877fc7f3a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f39d68c2-94c1-4168-964a-fbfaab05192c"
}
```

`POST /api/driver/v1/orders/e1a26042-80ff-46e0-b2ea-4f67e0c2c525/claim` → **404**

```json
{
  "command_id": "e3b8f213-ef43-4fc9-a186-f7c547f0b024"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e1a26042-80ff-46e0-b2ea-4f67e0c2c525/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2696ec29-9e70-4c4b-b514-b2dc5d3cda65"
}
```

`POST /api/driver/v1/orders/de0e08ec-4b30-4fe5-8769-be87d7a8c606/claim` → **404**

```json
{
  "command_id": "2d6f8d43-14b3-4be3-a177-ae7587161fc9"
}
```

```json
{
  "instance": "/api/driver/v1/orders/de0e08ec-4b30-4fe5-8769-be87d7a8c606/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "05a02ae3-fc68-4255-9b10-e3472e410e48"
}
```

`POST /api/driver/v1/orders/95bbb929-fee9-4a0e-8319-97e01febfbbb/claim` → **404**

```json
{
  "command_id": "d1c68ed9-b183-4aa4-b8d0-cfbc1c416ce1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/95bbb929-fee9-4a0e-8319-97e01febfbbb/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "85a168d7-c4b5-46ed-b131-2f1563247738"
}
```

`POST /api/driver/v1/orders/cebbb84c-0844-486c-a3bd-e09317044d45/claim` → **404**

```json
{
  "command_id": "3e763528-9839-46c3-b5fc-0e4cfb8f3e49"
}
```

```json
{
  "instance": "/api/driver/v1/orders/cebbb84c-0844-486c-a3bd-e09317044d45/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "bd29c83d-19a6-40e3-93b5-b6520d9bf55a"
}
```

`POST /api/driver/v1/orders/8c3511fd-4d3c-4a36-a35d-342c37563e42/claim` → **404**

```json
{
  "command_id": "f1203608-62f8-4127-b188-427981ec62ef"
}
```

```json
{
  "instance": "/api/driver/v1/orders/8c3511fd-4d3c-4a36-a35d-342c37563e42/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2258603f-d42d-4dc8-be66-8aaf0835ad13"
}
```

`POST /api/driver/v1/orders/3b8c193c-c13c-4c76-8afa-708a842b62c6/claim` → **404**

```json
{
  "command_id": "4002e453-6fc1-4f75-a32c-b63b96f19983"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3b8c193c-c13c-4c76-8afa-708a842b62c6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a395df55-ba20-46c0-b08b-513d06fa0062"
}
```

`POST /api/driver/v1/orders/7ee1c01e-72d6-4612-a3a1-9487bb469fc6/claim` → **404**

```json
{
  "command_id": "5ea5b232-9f58-4c76-b848-b321dcff51d0"
}
```

```json
{
  "instance": "/api/driver/v1/orders/7ee1c01e-72d6-4612-a3a1-9487bb469fc6/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "55d60767-9eae-425b-b7fe-cb36900d54b9"
}
```

`POST /api/driver/v1/orders/a2a3f5f4-4add-4b17-933d-5daa9e75a98f/claim` → **404**

```json
{
  "command_id": "6b0b3684-48a6-4556-bdee-8623437c1bb4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a2a3f5f4-4add-4b17-933d-5daa9e75a98f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cdf19bf3-c2cf-46c6-9222-7bf44b01e6b6"
}
```

`POST /api/driver/v1/orders/171c34f3-364f-4007-b1cd-704b7daa0df4/claim` → **404**

```json
{
  "command_id": "fe5abb44-283c-45eb-b0a4-d656ba11021c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/171c34f3-364f-4007-b1cd-704b7daa0df4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "328e3b64-de42-4db1-9eb4-7670672bbfb9"
}
```

`POST /api/driver/v1/orders/6bdcc33d-ad23-47b6-80df-f5c5df0bd025/claim` → **404**

```json
{
  "command_id": "eccb75d0-daea-4924-bebd-6262eb7e2606"
}
```

```json
{
  "instance": "/api/driver/v1/orders/6bdcc33d-ad23-47b6-80df-f5c5df0bd025/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "0dda4f50-fdfe-4aeb-b740-aad28193fda5"
}
```

`POST /api/driver/v1/orders/567efb66-c810-4344-8a1a-864a3f415ebe/claim` → **404**

```json
{
  "command_id": "81f3e5ae-25ee-4c20-99e7-33049f7b2785"
}
```

```json
{
  "instance": "/api/driver/v1/orders/567efb66-c810-4344-8a1a-864a3f415ebe/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1a2c2914-6a73-4b19-b441-8603d426eb9d"
}
```

`POST /api/driver/v1/orders/c62a976e-0275-4aa6-ac13-1efd3ee6cc2f/claim` → **404**

```json
{
  "command_id": "5c1283bb-b59f-4e39-a206-d672a872ceb5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c62a976e-0275-4aa6-ac13-1efd3ee6cc2f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "af91172f-43c1-4141-9b24-8ddf4bf29aec"
}
```

`POST /api/driver/v1/orders/456e65c6-4e10-4107-ab76-d51618205491/claim` → **404**

```json
{
  "command_id": "3b90a781-ca90-4449-91de-9bdcd787679e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/456e65c6-4e10-4107-ab76-d51618205491/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e0caf55e-7492-4800-9da8-cbd3e6a4a719"
}
```

`POST /api/driver/v1/orders/9b33ab96-205f-47a8-892c-64556b4a48a0/claim` → **404**

```json
{
  "command_id": "474ead4c-68ee-42d9-85fd-1645a71ec665"
}
```

```json
{
  "instance": "/api/driver/v1/orders/9b33ab96-205f-47a8-892c-64556b4a48a0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c0641f48-eae2-4250-95e6-5821039d27b2"
}
```

`POST /api/driver/v1/orders/5a2ea479-eb24-4140-8427-db35f581b700/claim` → **404**

```json
{
  "command_id": "14a3829b-b922-49f5-8b2d-daf69cbf9a35"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5a2ea479-eb24-4140-8427-db35f581b700/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e7321dd3-f8da-48b3-8259-6b7b242a85b3"
}
```

`POST /api/driver/v1/orders/64f9c59f-694e-418c-9c5e-d077cc6cefa0/claim` → **404**

```json
{
  "command_id": "9bb5f6a5-ba96-43c4-b2be-96efde2c0058"
}
```

```json
{
  "instance": "/api/driver/v1/orders/64f9c59f-694e-418c-9c5e-d077cc6cefa0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ed9add64-8d0d-428d-94ef-f619a97c36a3"
}
```

`POST /api/driver/v1/orders/f580fe35-8c5f-4e3c-b745-b7eb5ca7868b/claim` → **404**

```json
{
  "command_id": "8e11ade3-752b-4bf2-8f8c-5aed40f050aa"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f580fe35-8c5f-4e3c-b745-b7eb5ca7868b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6f52a7c3-1b30-4d89-a606-a72fad9ec0b4"
}
```

`POST /api/driver/v1/orders/79c3d2a5-fa86-4df5-971e-f49bff5d8c98/claim` → **429**

```json
{
  "command_id": "9b6646d9-7f8d-4e5f-bada-a466592cbf38"
}
```

```json
{
  "instance": "/api/driver/v1/orders/79c3d2a5-fa86-4df5-971e-f49bff5d8c98/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "a5b7f9ed-edcb-4fe3-a097-cd10749951fb",
  "retryable": true,
  "retry_after_seconds": 592
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
  "command_id": "b75caad7-7a96-454a-a64c-1379da453bd4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:02Z",
    "sequence": 1793366642645
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "086f9232-a5c8-4faa-8660-8c6087d3934c",
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
  "last_heartbeat_at": "2026-10-30T13:24:02.663176Z",
  "last_location_at": "2026-10-30T13:24:02.663176Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "2e02928a-5072-45cc-9332-6a8ceb561623",
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

`POST /api/driver/v1/orders/2e02928a-5072-45cc-9332-6a8ceb561623/claim` → **409**

```json
{
  "command_id": "73171318-d7f4-4677-8210-9f2da6601854"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2e02928a-5072-45cc-9332-6a8ceb561623/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "41e590e2-beb5-47a6-b93a-49d560fc8b9d"
}
```

`POST /api/driver/v1/orders/2e02928a-5072-45cc-9332-6a8ceb561623/claim` → **200**

```json
{
  "command_id": "f252ad41-6a25-4f39-8f24-bb8aa1ccdae4"
}
```

```json
{
  "id": "fa5e728b-011c-4d68-a434-efebe7757ed5",
  "order_id": "2e02928a-5072-45cc-9332-6a8ceb561623",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "5e03ea25-5933-4865-b367-a50e3dcda950",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5e03ea25-5933-4865-b367-a50e3dcda950",
  "order_id": "2e02928a-5072-45cc-9332-6a8ceb561623",
  "assignment_id": "fa5e728b-011c-4d68-a434-efebe7757ed5",
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

`POST /api/driver/v1/trips/5e03ea25-5933-4865-b367-a50e3dcda950/cancel` → **200**

```json
{
  "command_id": "58d2edc0-9c54-462e-b87c-051ce12619c4",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "5e03ea25-5933-4865-b367-a50e3dcda950",
  "order_id": "2e02928a-5072-45cc-9332-6a8ceb561623",
  "assignment_id": "fa5e728b-011c-4d68-a434-efebe7757ed5",
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

`GET /api/rider/v1/orders/2e02928a-5072-45cc-9332-6a8ceb561623` → **200**

```json
{
  "id": "2e02928a-5072-45cc-9332-6a8ceb561623",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "109365ed-cc1b-46c5-8b5b-e137ff36a104",
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
    "id": "fa5e728b-011c-4d68-a434-efebe7757ed5",
    "order_id": "2e02928a-5072-45cc-9332-6a8ceb561623",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "5e03ea25-5933-4865-b367-a50e3dcda950",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:23:52.534206Z",
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
  "session_id": "f7c513f2-77cc-4623-890c-e1995a96bdf8",
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
  "last_heartbeat_at": "2026-10-30T13:23:51.390965Z",
  "last_location_at": "2026-10-30T13:23:51.390965Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f7c513f2-77cc-4623-890c-e1995a96bdf8/close` → **200**

```json
{
  "command_id": "47504d20-169f-4a57-81c3-0f5b4acb080d",
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
  "session_id": "086f9232-a5c8-4faa-8660-8c6087d3934c",
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
  "last_heartbeat_at": "2026-10-30T13:24:02.663176Z",
  "last_location_at": "2026-10-30T13:24:02.663176Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/086f9232-a5c8-4faa-8660-8c6087d3934c/close` → **200**

```json
{
  "command_id": "fb52adb6-450f-4b04-a1fd-03c930c37fad",
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
  "session_id": "625bddc6-1058-492d-bacc-9a489fd98f97",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NDYsImlhdCI6MTc5MzM2NjY0NiwianRpIjoiMWU2MWNmMDYtN2I2My00OTE0LTk2YzctMzcyN2E5OWY0OGI3Iiwic2lkIjoiNjI1YmRkYzYtMTA1OC00OTJkLWJhY2MtOWE0ODlmZDk4Zjk3In0.ePpv328YPE0fyUl0IPksZSZzPkbBy2gTqq05egQ6zpM",
  "access_expires_at": "2026-10-30T13:39:06.071756182Z",
  "refresh_token": "pgvWEI7GcGDM8mSayPKdzsQmwPIShFHgGNlh0un5bII",
  "refresh_expires_at": "2026-10-31T01:24:06.071098725Z",
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
  "command_id": "7bf6a9cf-87e9-4cf4-b6b1-f33fe5237d6f",
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
  "session_id": "2868a937-d70d-4516-9504-d35cd7f4d4e8",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NDcsImlhdCI6MTc5MzM2NjY0NywianRpIjoiNTAzZDdkMjItMjA5My00MzlhLWJjYzEtMTJmZGRlZWYzOTk0Iiwic2lkIjoiMjg2OGE5MzctZDcwZC00NTE2LTk1MDQtZDM1Y2Q3ZjRkNGU4In0.dGh1_3cPNn2UcBSbNcV3zdp4tbTdw98N9R0axz3lms8",
  "access_expires_at": "2026-10-30T13:39:07.164034853Z",
  "refresh_token": "9tIAR6IqiMEY6xE242ZZsdBYKBwbUkHjWwUupVKZncc",
  "refresh_expires_at": "2026-10-31T01:24:07.163444434Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2590119380",
    "linkedid": "1730052700.2590119380",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673242193"
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
    "id": "1730052700.2590119380",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "f2d30725-bbc2-40ce-993e-fdcbef59fb96",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673242193",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:24:07.436499Z",
      "answered_at": null,
      "ended_at": "2026-10-30T13:24:07.457865Z",
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
    "id": "1730052600.321668406",
    "linkedid": "1730052600.321668406",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673242193"
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
      "id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673242193",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:24:07.772967Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/811248aa-c4b8-4598-b473-9d3a1f33c779/answer` → **200**

```json
{
  "command_id": "a88462a5-4dcd-46ea-8ecc-653b616e52f5"
}
```

```json
{
  "id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673242193",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "order_ids": [],
  "started_at": "2026-10-30T13:24:07.772967Z",
  "answered_at": "2026-10-30T13:24:08.073569Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.321668406",
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
    "id": "1730052600.321668406",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673242193",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:07.772967Z",
      "answered_at": "2026-10-30T13:24:08.073569Z",
      "ended_at": "2026-10-30T13:24:08.377514Z",
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
      "id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673242193",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:07.772967Z",
      "answered_at": "2026-10-30T13:24:08.073569Z",
      "ended_at": "2026-10-30T13:24:08.377514Z",
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
      "id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673242193",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:07.772967Z",
      "answered_at": "2026-10-30T13:24:08.073569Z",
      "ended_at": "2026-10-30T13:24:08.377514Z",
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
      "id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673242193",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:07.772967Z",
      "answered_at": "2026-10-30T13:24:08.073569Z",
      "ended_at": "2026-10-30T13:24:08.377514Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:24:13.742155Z"
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
      "id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673242193",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:07.772967Z",
      "answered_at": "2026-10-30T13:24:08.073569Z",
      "ended_at": "2026-10-30T13:24:08.377514Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:24:13.742155Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/811248aa-c4b8-4598-b473-9d3a1f33c779/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/811248aa-c4b8-4598-b473-9d3a1f33c779/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=811248aa-c4b8-4598-b473-9d3a1f33c779` → **200**

```json
{
  "changes": [
    {
      "id": "2b037eb5-d50f-4bec-ae6f-778d28439b31",
      "occurred_at": "2026-10-30T13:24:15.830883Z",
      "actor_type": "STAFF",
      "actor_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"127afa93-6c2f-4183-9230-565fa99e6f0a\", \"order_ids\": []}",
      "correlation_id": "6dbe96fa-1aa4-4bc7-aa22-951b8cb76949"
    },
    {
      "id": "f95e5a07-76e6-43c6-bf61-06856697e315",
      "occurred_at": "2026-10-30T13:24:15.803711Z",
      "actor_type": "STAFF",
      "actor_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"127afa93-6c2f-4183-9230-565fa99e6f0a\", \"order_ids\": []}",
      "correlation_id": "be5723ce-bcdf-473b-b31c-fd02fb9e1b1d"
    }
  ]
}
```

Done: call 811248aa-c4b8-4598-b473-9d3a1f33c779 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2752"
}
```

```json
{
  "challenge_id": "043f8eec-46ff-4544-904a-9f2389fc4abf",
  "expires_at": "2026-10-30T13:29:16.144499406Z",
  "resend_available_at": "2026-10-30T13:24:17.144499406Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "113851",
  "sent_at": "2026-10-30T13:24:16.147482736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "043f8eec-46ff-4544-904a-9f2389fc4abf",
  "code": "113851",
  "device_ref": "sandbox-2752"
}
```

```json
{
  "session_id": "28904d7b-14a4-4861-9ecd-4ed3b7cdd179",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzU1NiwiaWF0IjoxNzkzMzY2NjU2LCJqdGkiOiJhMTU2YTJlNi1lNTc5LTQ2NTUtODVlNy04M2M2OTY0OTVmZWMiLCJzaWQiOiIyODkwNGQ3Yi0xNGE0LTQ4NjEtOWVjZC00ZWQzYjdjZGQxNzkifQ.l-7lTDI34x8-J7uc0hzAzgnOcMZgY-odzAVeSDFW1w0",
  "access_expires_at": "2026-10-30T13:39:16.431404698Z",
  "refresh_token": "-N00T95CCy4UHb0ICqu2yyM04inyimoYJqRUM5Qijyg",
  "refresh_expires_at": "2026-11-29T13:24:16.430832245Z",
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
  "command_id": "5cdc7c7b-f942-416d-bcc8-d3c96d86c0db",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:16Z",
    "sequence": 1793366656980
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "945e55ec-023c-4c3e-97ec-b84b0043dded",
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
  "last_heartbeat_at": "2026-10-30T13:24:16.997653Z",
  "last_location_at": "2026-10-30T13:24:16.997653Z",
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
  "session_id": "586f93b9-b222-4bfc-9a26-7ea7adc5cf5e",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NTcsImlhdCI6MTc5MzM2NjY1NywianRpIjoiMDViZWM2ZWQtNjNiOC00ZWVjLWFhY2MtMWNjNjMxMjk5YmVhIiwic2lkIjoiNTg2ZjkzYjktYjIyMi00YmZjLTlhMjYtN2VhN2FkYzVjZjVlIn0.THWZxSW0z6KzYXvogPOG6b71ItnhvgLakKVGwYfAJVw",
  "access_expires_at": "2026-10-30T13:39:17.562888436Z",
  "refresh_token": "7J3YNse0KTXClxwolMA0N2qT3C1pM8wkNSMp7-q9RfA",
  "refresh_expires_at": "2026-10-31T01:24:17.562324211Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f5babc53-ada9-44d1-b5b7-a67a2d48878f",
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
  "id": "3bf2efc6-f262-4743-bfb4-13cd081ae1c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:29:17.843750Z",
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
  "command_id": "acebf618-251e-4f2a-a225-0676c01a647a",
  "quote_id": "3bf2efc6-f262-4743-bfb4-13cd081ae1c9",
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
    "phone": "+380675136679"
  }
}
```

```json
{
  "id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
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
  "created_at": "2026-10-30T13:24:18.153983Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675136679"
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
    "id": "b64db19b-4fbf-472a-bbca-7a9829dc851d",
    "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
    "expires_at": "2026-10-30T13:24:33.158577Z",
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

`POST /api/driver/v1/offers/b64db19b-4fbf-472a-bbca-7a9829dc851d/accept` → **200**

```json
{
  "command_id": "5e597205-aeec-4f7c-8bfb-7897c5091894"
}
```

```json
{
  "id": "acda94ba-c9eb-4c33-83c0-0e902c7ecd81",
  "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e1b8fcd3-163d-4430-8af1-10914c9b80cb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[
  {
    "phone": "+380675136679",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:20.351824385Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[
  {
    "phone": "+380675136679",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:20.351824385Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[
  {
    "phone": "+380675136679",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:20.351824385Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e1b8fcd3-163d-4430-8af1-10914c9b80cb",
  "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
  "assignment_id": "acda94ba-c9eb-4c33-83c0-0e902c7ecd81",
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
    "phone": "+380675136679"
  }
}
```

`POST /api/driver/v1/work-sessions/945e55ec-023c-4c3e-97ec-b84b0043dded/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:21Z",
    "sequence": 1793366661405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "945e55ec-023c-4c3e-97ec-b84b0043dded",
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
  "last_heartbeat_at": "2026-10-30T13:24:21.42181Z",
  "last_location_at": "2026-10-30T13:24:21.42181Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/e1b8fcd3-163d-4430-8af1-10914c9b80cb/arrive` → **200**

```json
{
  "command_id": "6a8225f3-bf03-489e-a541-bcbcf6f12902",
  "expected_version": 0
}
```

```json
{
  "id": "e1b8fcd3-163d-4430-8af1-10914c9b80cb",
  "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
  "assignment_id": "acda94ba-c9eb-4c33-83c0-0e902c7ecd81",
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
  "arrived_at": "2026-10-30T13:24:21.705084Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675136679"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[
  {
    "phone": "+380675136679",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:20.351824385Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[
  {
    "phone": "+380675136679",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:20.351824385Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[
  {
    "phone": "+380675136679",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:20.351824385Z"
  },
  {
    "phone": "+380675136679",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:23.361300553Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[
  {
    "phone": "+380675136679",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:20.351824385Z"
  },
  {
    "phone": "+380675136679",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:23.361300553Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675136679` → **200**

```json
[
  {
    "phone": "+380675136679",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:20.351824385Z"
  },
  {
    "phone": "+380675136679",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T13:24:23.361300553Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/e1b8fcd3-163d-4430-8af1-10914c9b80cb/start` → **200**

```json
{
  "command_id": "22a40849-f1ff-490a-905d-c9aef37a11e1",
  "expected_version": 1
}
```

```json
{
  "id": "e1b8fcd3-163d-4430-8af1-10914c9b80cb",
  "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
  "assignment_id": "acda94ba-c9eb-4c33-83c0-0e902c7ecd81",
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
  "arrived_at": "2026-10-30T13:24:21.705084Z",
  "started_at": "2026-10-30T13:24:24.090826Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675136679"
  }
}
```

`POST /api/driver/v1/trips/e1b8fcd3-163d-4430-8af1-10914c9b80cb/complete` → **200**

```json
{
  "command_id": "82b93fbc-6028-4c2e-a1a3-a56a1287d9ee",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:24:24Z",
  "cash_received": true
}
```

```json
{
  "id": "e1b8fcd3-163d-4430-8af1-10914c9b80cb",
  "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
  "assignment_id": "acda94ba-c9eb-4c33-83c0-0e902c7ecd81",
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
  "arrived_at": "2026-10-30T13:24:21.705084Z",
  "started_at": "2026-10-30T13:24:24.090826Z",
  "completed_at": "2026-10-30T13:24:24.384507Z",
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
  "session_id": "945e55ec-023c-4c3e-97ec-b84b0043dded",
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
  "last_heartbeat_at": "2026-10-30T13:24:21.42181Z",
  "last_location_at": "2026-10-30T13:24:21.42181Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/945e55ec-023c-4c3e-97ec-b84b0043dded/close` → **200**

```json
{
  "command_id": "4d978b19-7b71-40ed-9059-0ebd0f988e02",
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
  "phone": "+380638122840",
  "device_ref": "sandbox-10130"
}
```

```json
{
  "challenge_id": "98b5f087-f074-4587-ba0b-08b4ca0fa5fe",
  "expires_at": "2026-10-30T13:29:25.222451307Z",
  "resend_available_at": "2026-10-30T13:24:26.222451307Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638122840` → **200**

```json
{
  "phone": "+380638122840",
  "audience": "CLIENT",
  "code": "482222",
  "sent_at": "2026-10-30T13:24:25.22498428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98b5f087-f074-4587-ba0b-08b4ca0fa5fe",
  "code": "482222",
  "device_ref": "sandbox-10130"
}
```

```json
{
  "session_id": "638eff12-7d1b-4592-b1bd-a16a4980988d",
  "subject": {
    "type": "CLIENT",
    "id": "f1e55d01-db25-4d3e-977d-e59e82036f32"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMWU1NWQwMS1kYjI1LTRkM2UtOTc3ZC1lNTllODIwMzZmMzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTY1LCJpYXQiOjE3OTMzNjY2NjUsImp0aSI6IjA3MzliNDJmLWU5NzEtNGFjMS1iZTZmLTkzYjRhZWY1NGJlNCIsInNpZCI6IjYzOGVmZjEyLTdkMWItNDU5Mi1iMWJkLWExNmE0OTgwOTg4ZCJ9.IADyXe7DGrvKUJ6mMQNnnwGTUIJ9oj-wKygY41CB4PU",
  "access_expires_at": "2026-10-30T13:39:25.522759636Z",
  "refresh_token": "fMuZQaLjc1mkkUcYdncWP8Uu7G0pS95AzZ4-r_jEh1E",
  "refresh_expires_at": "2026-11-29T13:24:25.522259375Z",
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
  "device_ref": "sandbox-17902"
}
```

```json
{
  "challenge_id": "62e0a810-1bc9-471b-b176-7adf073b84c7",
  "expires_at": "2026-10-30T13:29:26.045962331Z",
  "resend_available_at": "2026-10-30T13:24:27.045962331Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "275697",
  "sent_at": "2026-10-30T13:24:26.049153678Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62e0a810-1bc9-471b-b176-7adf073b84c7",
  "code": "275697",
  "device_ref": "sandbox-17902"
}
```

```json
{
  "session_id": "0ca50860-0a2a-4582-a43a-5c7e80864af7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzU2NiwiaWF0IjoxNzkzMzY2NjY2LCJqdGkiOiJhMzYwODIxZC0yNzcxLTRjODgtODM3OS0yYzk5N2QxZTY1MjUiLCJzaWQiOiIwY2E1MDg2MC0wYTJhLTQ1ODItYTQzYS01YzdlODA4NjRhZjcifQ.vmcYEmP96Uhw5nQSYFJzX0Bcyc7Boci-FxSxARVI5kA",
  "access_expires_at": "2026-10-30T13:39:26.352918569Z",
  "refresh_token": "TYCLGgcLCpNkxr2XZFcUt2yDUzmG28TYENZlNkA1AYk",
  "refresh_expires_at": "2026-11-29T13:24:26.352400088Z",
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
  "session_id": "f4a4b0fc-b9bf-47d8-8a7f-c491167442cb",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NjcsImlhdCI6MTc5MzM2NjY2NywianRpIjoiZDYwZmM5MzAtZDU4Zi00MTUzLTg0ZjMtYmZmNWViNDhlYjBhIiwic2lkIjoiZjRhNGIwZmMtYjliZi00N2Q4LThhN2YtYzQ5MTE2NzQ0MmNiIn0.XTR4-jfPDV_9beaWA0treXmFcim8JHvave_7swRgBNQ",
  "access_expires_at": "2026-10-30T13:39:27.17368041Z",
  "refresh_token": "FmZk9bmEn9xGB9ZatyjqJBJCe-aOghywIpPHY3T7RfA",
  "refresh_expires_at": "2026-10-31T01:24:27.173106089Z",
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
  "session_id": "d654637c-c08a-454b-abc5-a0c4971ceb85",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc1NjcsImlhdCI6MTc5MzM2NjY2NywianRpIjoiZTczMjYxZmYtMGM0ZS00MGZhLTk5NmUtMzYxZGU4MDc2NTU0Iiwic2lkIjoiZDY1NDYzN2MtYzA4YS00NTRiLWFiYzUtYTBjNDk3MWNlYjg1In0.l9-knJP42_jg-2yQTIZ2-Oj-fzyz6FUBgd6hk8n1KqA",
  "access_expires_at": "2026-10-30T13:39:27.73056907Z",
  "refresh_token": "vc4Xs5EwpoRYgGzhLUsl2NzU_jS-lCEzjEFyLHzax6s",
  "refresh_expires_at": "2026-10-31T01:24:27.730035782Z",
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
  "command_id": "1e0d8b71-0ddd-4d80-a603-a68a645e3df2",
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
  "id": "2b509106-980c-45e6-b07e-21369aaaf589",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:29:28.276675Z",
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
  "command_id": "75a55ba5-c1a3-4b84-a211-355d7ea8cd33",
  "quote_id": "2b509106-980c-45e6-b07e-21369aaaf589",
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
  "id": "3e3ef083-50cf-4165-b0c2-800aac8dc28f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f1e55d01-db25-4d3e-977d-e59e82036f32",
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
  "created_at": "2026-10-30T13:24:28.568974Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3e3ef083-50cf-4165-b0c2-800aac8dc28f` → **200**

```json
{
  "id": "3e3ef083-50cf-4165-b0c2-800aac8dc28f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f1e55d01-db25-4d3e-977d-e59e82036f32",
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
  "created_at": "2026-10-30T13:24:28.568974Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3e3ef083-50cf-4165-b0c2-800aac8dc28f/cancel` → **200**

```json
{
  "command_id": "645625d2-8f68-4513-b17f-07c23f978f9f",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "3e3ef083-50cf-4165-b0c2-800aac8dc28f",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f1e55d01-db25-4d3e-977d-e59e82036f32",
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
  "created_at": "2026-10-30T13:24:28.568974Z",
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
  "command_id": "cc0d0fd5-b00f-4cc8-a856-7481ab246396",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:29Z",
    "sequence": 1793366669713
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4fb98646-1efe-446c-a917-41c88214e67f",
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
  "last_heartbeat_at": "2026-10-30T13:24:29.730309Z",
  "last_location_at": "2026-10-30T13:24:29.730309Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8092"
}
```

```json
{
  "challenge_id": "9d516340-643b-48da-99dd-4192b3b9ff36",
  "expires_at": "2026-10-30T13:29:30.026432791Z",
  "resend_available_at": "2026-10-30T13:24:31.026432791Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "928261",
  "sent_at": "2026-10-30T13:24:30.029281619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d516340-643b-48da-99dd-4192b3b9ff36",
  "code": "928261",
  "device_ref": "sandbox-8092"
}
```

```json
{
  "session_id": "2af84bb8-8c62-45c8-b142-0ceb9e6b37b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzU3MCwiaWF0IjoxNzkzMzY2NjcwLCJqdGkiOiJmOWNhMzljZi0yOGYyLTQzYzEtOTMzMy02YzM2OGU1MGJmYTMiLCJzaWQiOiIyYWY4NGJiOC04YzYyLTQ1YzgtYjE0Mi0wY2ViOWU2YjM3YjkifQ.lh0HXNQpGjSeRbOLHz-n_OEeKPRSZE0ryp4FK6859Tc",
  "access_expires_at": "2026-10-30T13:39:30.324143813Z",
  "refresh_token": "NeUbV-gPEGBAHwVdFWjr6uXLXyVWVJIRzKLrfd_xzzo",
  "refresh_expires_at": "2026-11-29T13:24:30.323633226Z",
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
  "command_id": "676be437-b656-4f53-a073-846d358cb4b2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:24:30Z",
    "sequence": 1793366670865
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0a5d9b8-5677-496e-8695-9387b4a40178",
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
  "last_heartbeat_at": "2026-10-30T13:24:30.88193Z",
  "last_location_at": "2026-10-30T13:24:30.88193Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "442f9fc8-0d36-4e65-818c-9c31c1a8b020",
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
  "id": "9c7125e5-e8ac-4385-9f34-24a2530dff94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:29:31.167Z",
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
  "command_id": "dadd6e94-4958-4126-867e-29e7bd3b8f1e",
  "quote_id": "9c7125e5-e8ac-4385-9f34-24a2530dff94",
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
  "id": "1ece176b-9744-4850-8172-717193a5ed30",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f1e55d01-db25-4d3e-977d-e59e82036f32",
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
  "created_at": "2026-10-30T13:24:31.452822Z",
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
    "id": "4ae1a319-e204-42ae-95a2-bc818721a06b",
    "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
    "expires_at": "2026-10-30T13:24:46.456505Z",
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

`POST /api/driver/v1/offers/4ae1a319-e204-42ae-95a2-bc818721a06b/accept` → **200**

```json
{
  "command_id": "d358b587-b6cc-4289-bb2b-5ee114c77f18"
}
```

```json
{
  "id": "f015af3b-518d-4475-ac76-dc3b77f8cf35",
  "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7da7df76-4006-46df-ae5f-e2ef28531985",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7da7df76-4006-46df-ae5f-e2ef28531985",
  "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
  "assignment_id": "f015af3b-518d-4475-ac76-dc3b77f8cf35",
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

`POST /api/driver/v1/trips/7da7df76-4006-46df-ae5f-e2ef28531985/cancel` → **200**

```json
{
  "command_id": "2cc04d1e-e425-484f-850a-83ae715f8661",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "7da7df76-4006-46df-ae5f-e2ef28531985",
  "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
  "assignment_id": "f015af3b-518d-4475-ac76-dc3b77f8cf35",
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

`GET /api/rider/v1/orders/1ece176b-9744-4850-8172-717193a5ed30` → **200**

```json
{
  "id": "1ece176b-9744-4850-8172-717193a5ed30",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f1e55d01-db25-4d3e-977d-e59e82036f32",
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
    "id": "f015af3b-518d-4475-ac76-dc3b77f8cf35",
    "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7da7df76-4006-46df-ae5f-e2ef28531985",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:24:31.452822Z",
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
    "id": "28ccabe9-9249-4119-9883-6c0aada1c99d",
    "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
    "expires_at": "2026-10-30T13:24:47.599697Z",
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

`POST /api/driver/v1/offers/28ccabe9-9249-4119-9883-6c0aada1c99d/accept` → **200**

```json
{
  "command_id": "7962e64b-3f2c-462a-8d81-0351721082e4"
}
```

```json
{
  "id": "0011abb0-3ae2-4c5a-876a-aa5c32124dfb",
  "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b9185095-3543-4d99-a18f-4d89a5f41f07",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b9185095-3543-4d99-a18f-4d89a5f41f07",
  "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
  "assignment_id": "0011abb0-3ae2-4c5a-876a-aa5c32124dfb",
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

`POST /api/driver/v1/trips/b9185095-3543-4d99-a18f-4d89a5f41f07/cancel` → **200**

```json
{
  "command_id": "c97499ce-dbbc-4ca4-9634-bfec52655550",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "b9185095-3543-4d99-a18f-4d89a5f41f07",
  "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
  "assignment_id": "0011abb0-3ae2-4c5a-876a-aa5c32124dfb",
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
    "id": "1ece176b-9744-4850-8172-717193a5ed30",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:24:31.452822Z",
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
    "id": "3e3ef083-50cf-4165-b0c2-800aac8dc28f",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:24:28.568974Z",
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

`GET /api/operator/v1/orders/1ece176b-9744-4850-8172-717193a5ed30/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:24:31.453528Z",
      "actor": {
        "type": "CLIENT",
        "id": "f1e55d01-db25-4d3e-977d-e59e82036f32",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
        "quote_id": "9c7125e5-e8ac-4385-9f34-24a2530dff94",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "96706c78-e3f3-4620-b2ef-55f553047c51"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:24:31.455654Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
        "attempt_id": "cb99cf8f-9bb2-4c7b-afb1-5864b9e6f45d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "96706c78-e3f3-4620-b2ef-55f553047c51"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:24:31.462663Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4ae1a319-e204-42ae-95a2-bc818721a06b",
        "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "96706c78-e3f3-4620-b2ef-55f553047c51"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:24:32.031482Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4ae1a319-e204-42ae-95a2-bc818721a06b",
        "order_id": "1ece176b-9744-4850-8172-717193a5ed30",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f015af3b-518d-4475-ac76-dc3b77f8cf35"
      },
      "correlation_id": "e0de3a21-56fa-422d-bf06-820ed5955ddf"
```

Done: orders 3e3ef083-50cf-4165-b0c2-800aac8dc28f, 1ece176b-9744-4850-8172-717193a5ed30.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739826890",
  "device_ref": "sandbox-18513"
}
```

```json
{
  "challenge_id": "8c626cbe-cc9b-4477-8741-920d2566bf33",
  "expires_at": "2026-10-30T13:29:34.866212462Z",
  "resend_available_at": "2026-10-30T13:24:35.866212462Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739826890` → **200**

```json
{
  "phone": "+380739826890",
  "audience": "CLIENT",
  "code": "990280",
  "sent_at": "2026-10-30T13:24:34.868958948Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c626cbe-cc9b-4477-8741-920d2566bf33",
  "code": "990280",
  "device_ref": "sandbox-18513"
}
```

```json
{
  "session_id": "9666be78-25ae-4ebf-9d47-45d60946ad1f",
  "subject": {
    "type": "CLIENT",
    "id": "94d89f71-6316-4036-9265-ccb3429bdd39"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NGQ4OWY3MS02MzE2LTQwMzYtOTI2NS1jY2IzNDI5YmRkMzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NTc1LCJpYXQiOjE3OTMzNjY2NzUsImp0aSI6IjgzMmYxZDc1LTNlNTEtNDM4My04MzM2LTQ4ODM1YmZhZDUwNyIsInNpZCI6Ijk2NjZiZTc4LTI1YWUtNGViZi05ZDQ3LTQ1ZDYwOTQ2YWQxZiJ9.Hgxi3cTpUKRISjCILp-vWlbo_9UcW3GJocXc2YGWR8I",
  "access_expires_at": "2026-10-30T13:39:35.173777036Z",
  "refresh_token": "TzCvQZSY_ltvlWDp3BpsBD7r_capwKg5aPB9bX7kaS8",
  "refresh_expires_at": "2026-11-29T13:24:35.1732617Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "5ac8160a-6a30-49ce-8a0d-fde0ccda1388",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f58604d6-63da-49d9-951f-addbb534bf43",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f58604d6-63da-49d9-951f-addbb534bf43",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "70f60ec6c201035cd57d54dbfb4cac3b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f58604d6-63da-49d9-951f-addbb534bf43",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739826890"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f58604d6-63da-49d9-951f-addbb534bf43",
  "expires_at": "2026-10-30T13:54:35.448529Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/f58604d6-63da-49d9-951f-addbb534bf43` → **200**

```json
{
  "id": "f58604d6-63da-49d9-951f-addbb534bf43",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:54:35.448529Z",
  "card": {
    "id": "e2f75c15-8fcd-4452-84a6-23f2ef2b9883",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1751",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:24:35.73779Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "e2f75c15-8fcd-4452-84a6-23f2ef2b9883",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1751",
      "card_type": "Visa",
      "created_at": "2026-10-30T13:24:35.73779Z"
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
  "device_ref": "sandbox-3306"
}
```

```json
{
  "challenge_id": "d0c9a1db-7dde-4502-8991-971d80def563",
  "expires_at": "2026-10-30T13:29:36.304572172Z",
  "resend_available_at": "2026-10-30T13:24:37.304572172Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "384615",
  "sent_at": "2026-10-30T13:24:36.307415798Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0c9a1db-7dde-4502-8991-971d80def563",
  "code": "384615",
  "device_ref": "sandbox-3306"
}
```

```json
{
  "session_id": "4c15b7b9-4424-45c6-a815-17263736a381",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzU3NiwiaWF0IjoxNzkzMzY2Njc2LCJqdGkiOiI2M2M3ZmRiNS1kY2I3LTQ4YjMtOTFkZS04NmMzMTJhZmVjNWYiLCJzaWQiOiI0YzE1YjdiOS00NDI0LTQ1YzYtYTgxNS0xNzI2MzczNmEzODEifQ.GbSrDUUflRwLdwvf8sVJvng1m_COPvw0C1STfBk7Z4E",
  "access_expires_at": "2026-10-30T13:39:36.602530793Z",
  "refresh_token": "Spcy-mOhcBMWeVXjPjHGd7ui--ZhTjo07za9ksDZxao",
  "refresh_expires_at": "2026-11-29T13:24:36.601871492Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0a5d9b8-5677-496e-8695-9387b4a40178",
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
  "last_heartbeat_at": "2026-10-30T13:24:30.88193Z",
  "last_location_at": "2026-10-30T13:24:30.88193Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0a5d9b8-5677-496e-8695-9387b4a40178/handover` → **200**

```json
{
  "command_id": "fff7b5d5-faa9-47b7-a7ab-68897616e91e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0a5d9b8-5677-496e-8695-9387b4a40178",
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
  "last_heartbeat_at": "2026-10-30T13:24:30.88193Z",
  "last_location_at": "2026-10-30T13:24:30.88193Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/b0a5d9b8-5677-496e-8695-9387b4a40178/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:19Z",
    "sequence": 1793366719475
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0a5d9b8-5677-496e-8695-9387b4a40178",
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
  "last_heartbeat_at": "2026-10-30T13:25:19.492117Z",
  "last_location_at": "2026-10-30T13:25:19.492117Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d5dc375-b5da-42c9-82b4-61b1d2cd3976",
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
  "id": "0a568880-4296-4c0f-8e19-b8a388240d15",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:30:19.774723Z",
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
  "command_id": "d7524061-f1a4-471c-95d7-05580283d3a5",
  "quote_id": "0a568880-4296-4c0f-8e19-b8a388240d15",
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
  "id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
  "created_at": "2026-10-30T13:25:20.060386Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e525d87d-67c6-4317-acb2-ab6911a41e81` → **200**

```json
{
  "id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
  "created_at": "2026-10-30T13:25:20.060386Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e525d87d-67c6-4317-acb2-ab6911a41e81` → **200**

```json
{
  "id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
  "created_at": "2026-10-30T13:25:20.060386Z",
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
    "id": "d3338fb8-54d3-4612-ad1b-6b95fdd78667",
    "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
    "expires_at": "2026-10-30T13:25:35.646706Z",
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

`POST /api/driver/v1/offers/d3338fb8-54d3-4612-ad1b-6b95fdd78667/accept` → **200**

```json
{
  "command_id": "e5587b81-290e-4c59-950f-e25b3d629b99"
}
```

```json
{
  "id": "0b11a8df-f234-4718-a463-ddbe36d4b6c0",
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "96567f93-68dd-4b9b-9c6b-fd98ae1d0852",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "96567f93-68dd-4b9b-9c6b-fd98ae1d0852",
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "assignment_id": "0b11a8df-f234-4718-a463-ddbe36d4b6c0",
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

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/b0a5d9b8-5677-496e-8695-9387b4a40178/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:28Z",
    "sequence": 1793366728772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0a5d9b8-5677-496e-8695-9387b4a40178",
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
  "last_heartbeat_at": "2026-10-30T13:25:28.788552Z",
  "last_location_at": "2026-10-30T13:25:28.788552Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/96567f93-68dd-4b9b-9c6b-fd98ae1d0852/arrive` → **200**

```json
{
  "command_id": "7673aaa3-349e-4334-aa4c-ab60d909c0d2",
  "expected_version": 0
}
```

```json
{
  "id": "96567f93-68dd-4b9b-9c6b-fd98ae1d0852",
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "assignment_id": "0b11a8df-f234-4718-a463-ddbe36d4b6c0",
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
  "arrived_at": "2026-10-30T13:25:29.072995Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/96567f93-68dd-4b9b-9c6b-fd98ae1d0852/start` → **200**

```json
{
  "command_id": "8e8ae9bb-83ff-4953-a648-ac49b59974ef",
  "expected_version": 1
}
```

```json
{
  "id": "96567f93-68dd-4b9b-9c6b-fd98ae1d0852",
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "assignment_id": "0b11a8df-f234-4718-a463-ddbe36d4b6c0",
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
  "arrived_at": "2026-10-30T13:25:29.072995Z",
  "started_at": "2026-10-30T13:25:29.351818Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/96567f93-68dd-4b9b-9c6b-fd98ae1d0852/complete` → **200**

```json
{
  "command_id": "25df1150-2600-4f42-8d9b-60cdf1007d8b",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:25:29Z",
  "cash_received": true
}
```

```json
{
  "id": "96567f93-68dd-4b9b-9c6b-fd98ae1d0852",
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "assignment_id": "0b11a8df-f234-4718-a463-ddbe36d4b6c0",
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
  "arrived_at": "2026-10-30T13:25:29.072995Z",
  "started_at": "2026-10-30T13:25:29.351818Z",
  "completed_at": "2026-10-30T13:25:29.644158Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e525d87d-67c6-4317-acb2-ab6911a41e81` → **200**

```json
{
  "id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
    "id": "0b11a8df-f234-4718-a463-ddbe36d4b6c0",
    "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "96567f93-68dd-4b9b-9c6b-fd98ae1d0852",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:25:20.060386Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e525d87d-67c6-4317-acb2-ab6911a41e81` → **200**

```json
{
  "id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
    "id": "0b11a8df-f234-4718-a463-ddbe36d4b6c0",
    "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "96567f93-68dd-4b9b-9c6b-fd98ae1d0852",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:25:20.060386Z",
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

`GET /api/rider/v1/orders/e525d87d-67c6-4317-acb2-ab6911a41e81/tip` → **200**

```json
{
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
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
  "available_until": "2026-10-31T13:25:29.644158Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e525d87d-67c6-4317-acb2-ab6911a41e81/tip` → **201**

```json
{
  "command_id": "9a56b13d-0247-4792-9adf-b6979c28fa5e",
  "amount_minor": 2500
}
```

```json
{
  "id": "5bc15afc-0b61-4467-a6ed-a6a81698c09a",
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:25:32.065661Z"
}
```

`GET /api/rider/v1/orders/e525d87d-67c6-4317-acb2-ab6911a41e81/tip` → **200**

```json
{
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
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
  "available_until": "2026-10-31T13:25:29.644158Z",
  "open": false,
  "tip": {
    "id": "5bc15afc-0b61-4467-a6ed-a6a81698c09a",
    "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:25:32.065661Z"
  }
}
```

`GET /api/rider/v1/orders/e525d87d-67c6-4317-acb2-ab6911a41e81/tip` → **200**

```json
{
  "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
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
  "available_until": "2026-10-31T13:25:29.644158Z",
  "open": false,
  "tip": {
    "id": "5bc15afc-0b61-4467-a6ed-a6a81698c09a",
    "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:25:32.065661Z"
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
      "id": "b36aff5a-76c3-41f8-9525-8a7b7d4945f7",
      "at": "2026-10-30T13:25:33.785826Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
      "counterpart_id": null
    },
    {
      "id": "2f065975-3416-4d19-af06-885863f7bec6",
      "at": "2026-10-30T13:25:29.728848Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6546f21c-f5bd-47f9-9800-82384a34ff3f",
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
  "id": "f190aea0-5302-4e7d-8683-815064ac9632",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:30:34.224390Z",
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
  "session_id": "3a9f2e5f-d660-40f4-bbfb-71bd7d255694",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc2MzQsImlhdCI6MTc5MzM2NjczNCwianRpIjoiOTUwNzViNzItYTM4Yi00NDcxLTg1YTUtNjQxYjlmNTM3ZTU3Iiwic2lkIjoiM2E5ZjJlNWYtZDY2MC00MGY0LWJiZmItNzFiZDdkMjU1Njk0In0.I5LePQ5gT6jPAiGBoRduqFnyswzY5zt1L7iBI3-WatU",
  "access_expires_at": "2026-10-30T13:40:34.79586859Z",
  "refresh_token": "9kecW1ar-0yBX3dXOW0uECcokD5dQltdpYhpeyJWW80",
  "refresh_expires_at": "2026-10-31T01:25:34.79530462Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380739826890` → **200**

```json
{
  "client_id": "94d89f71-6316-4036-9265-ccb3429bdd39"
}
```

`POST /api/admin/v1/rider-wallets/94d89f71-6316-4036-9265-ccb3429bdd39/top-ups` → **201**

```json
{
  "command_id": "f4efce7c-d9cf-4876-99bc-d9a2c940f347",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
      "id": "e3aafaad-5bd7-433d-af3a-9c81731291cd",
      "at": "2026-10-30T13:25:35.347527Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "20582c0f-5583-4843-80f0-278d67666494",
  "quote_id": "f190aea0-5302-4e7d-8683-815064ac9632",
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
  "id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
  "created_at": "2026-10-30T13:25:35.635582Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/25854874-bc7b-4ef0-bd40-860c86cb6b5d` → **200**

```json
{
  "id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
  "created_at": "2026-10-30T13:25:35.635582Z",
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
    "id": "a734d713-e8bf-48bc-a14f-8165c8a960d1",
    "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
    "expires_at": "2026-10-30T13:25:50.641111Z",
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

`POST /api/driver/v1/offers/a734d713-e8bf-48bc-a14f-8165c8a960d1/accept` → **200**

```json
{
  "command_id": "1f85cc6c-fb65-4660-8280-efccc0f21a90"
}
```

```json
{
  "id": "5fefad0d-cf66-4865-9409-16e0a48128bb",
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5a9810b1-5e0f-4721-a122-b266ff7680a2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5a9810b1-5e0f-4721-a122-b266ff7680a2",
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
  "assignment_id": "5fefad0d-cf66-4865-9409-16e0a48128bb",
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

`POST /api/driver/v1/work-sessions/b0a5d9b8-5677-496e-8695-9387b4a40178/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:37Z",
    "sequence": 1793366737781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0a5d9b8-5677-496e-8695-9387b4a40178",
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
  "last_heartbeat_at": "2026-10-30T13:25:37.09499Z",
  "last_location_at": "2026-10-30T13:25:37.09499Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/5a9810b1-5e0f-4721-a122-b266ff7680a2/arrive` → **200**

```json
{
  "command_id": "2641ca93-b690-48d3-b756-b99cdddf1b02",
  "expected_version": 0
}
```

```json
{
  "id": "5a9810b1-5e0f-4721-a122-b266ff7680a2",
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
  "assignment_id": "5fefad0d-cf66-4865-9409-16e0a48128bb",
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
  "arrived_at": "2026-10-30T13:25:37.384527Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5a9810b1-5e0f-4721-a122-b266ff7680a2/start` → **200**

```json
{
  "command_id": "55177276-03b9-4f25-b69e-cedd84d5ffc9",
  "expected_version": 1
}
```

```json
{
  "id": "5a9810b1-5e0f-4721-a122-b266ff7680a2",
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
  "assignment_id": "5fefad0d-cf66-4865-9409-16e0a48128bb",
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
  "arrived_at": "2026-10-30T13:25:37.384527Z",
  "started_at": "2026-10-30T13:25:37.670767Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5a9810b1-5e0f-4721-a122-b266ff7680a2/complete` → **200**

```json
{
  "command_id": "655b6b90-a6a8-456a-9f29-05cfe9fb15b5",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:25:37Z",
  "cash_received": true
}
```

```json
{
  "id": "5a9810b1-5e0f-4721-a122-b266ff7680a2",
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
  "assignment_id": "5fefad0d-cf66-4865-9409-16e0a48128bb",
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
  "arrived_at": "2026-10-30T13:25:37.384527Z",
  "started_at": "2026-10-30T13:25:37.670767Z",
  "completed_at": "2026-10-30T13:25:37.962028Z",
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
  "client_id": "94d89f71-6316-4036-9265-ccb3429bdd39",
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
      "id": "e3aafaad-5bd7-433d-af3a-9c81731291cd",
      "at": "2026-10-30T13:25:35.347527Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
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

`GET /api/rider/v1/orders/25854874-bc7b-4ef0-bd40-860c86cb6b5d/tip` → **200**

```json
{
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
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
  "available_until": "2026-10-31T13:25:37.962028Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/25854874-bc7b-4ef0-bd40-860c86cb6b5d/tip` → **201**

```json
{
  "command_id": "ae0c9adc-e58a-4fd1-a901-bcdf89494dfd",
  "amount_minor": 2500
}
```

```json
{
  "id": "727ffc58-cf1a-470e-96b3-527ae6c90e90",
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T13:25:39.065355Z"
}
```

`GET /api/rider/v1/orders/25854874-bc7b-4ef0-bd40-860c86cb6b5d/tip` → **200**

```json
{
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
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
  "available_until": "2026-10-31T13:25:37.962028Z",
  "open": false,
  "tip": {
    "id": "727ffc58-cf1a-470e-96b3-527ae6c90e90",
    "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T13:25:39.065355Z"
  }
}
```

`GET /api/rider/v1/orders/25854874-bc7b-4ef0-bd40-860c86cb6b5d/tip` → **200**

```json
{
  "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
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
  "available_until": "2026-10-31T13:25:37.962028Z",
  "open": false,
  "tip": {
    "id": "727ffc58-cf1a-470e-96b3-527ae6c90e90",
    "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T13:25:39.065355Z"
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
      "id": "9a6d3b45-3438-4b60-a3aa-b57820965e49",
      "at": "2026-10-30T13:25:40.863151Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
      "counterpart_id": null
    },
    {
      "id": "1d42cd7c-60d8-4f58-b742-fb798e81b76f",
      "at": "2026-10-30T13:25:38.82986Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "25854874-bc7b-4ef0-bd40-860c86cb6b5d",
      "counterpart_id": null
    },
    {
      "id": "b36aff5a-76c3-41f8-9525-8a7b7d4945f7",
      "at": "2026-10-30T13:25:33.785826Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
      "counterpart_id": null
    },
    {
      "id": "2f065975-3416-4d19-af06-885863f7bec6",
      "at": "2026-10-30T13:25:29.728848Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e525d87d-67c6-4317-acb2-ab6911a41e81",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b0a5d9b8-5677-496e-8695-9387b4a40178",
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
  "last_heartbeat_at": "2026-10-30T13:25:37.09499Z",
  "last_location_at": "2026-10-30T13:25:37.09499Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b0a5d9b8-5677-496e-8695-9387b4a40178/close` → **200**

```json
{
  "command_id": "867d8f17-4d53-4abc-8a6b-446ae4db4c00",
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

Done: card order 25854874-bc7b-4ef0-bd40-860c86cb6b5d.

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
  "phone": "+380738698819",
  "device_ref": "sandbox-11223"
}
```

```json
{
  "challenge_id": "c2d0f8d5-7878-42a2-af25-5bee601e7541",
  "expires_at": "2026-10-30T13:30:42.018747181Z",
  "resend_available_at": "2026-10-30T13:25:43.018747181Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738698819` → **200**

```json
{
  "phone": "+380738698819",
  "audience": "CLIENT",
  "code": "401599",
  "sent_at": "2026-10-30T13:25:42.021511368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2d0f8d5-7878-42a2-af25-5bee601e7541",
  "code": "401599",
  "device_ref": "sandbox-11223"
}
```

```json
{
  "session_id": "3383e874-9cb5-41c9-bd25-f97894390132",
  "subject": {
    "type": "CLIENT",
    "id": "20c6a846-b011-484b-9578-a32aaec048cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMGM2YTg0Ni1iMDExLTQ4NGItOTU3OC1hMzJhYWVjMDQ4Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NjQyLCJpYXQiOjE3OTMzNjY3NDIsImp0aSI6IjcxZjdkYjgxLWQ5M2YtNDQ5NC1hNGY1LWNlMjkyMzRjZDc3NiIsInNpZCI6IjMzODNlODc0LTljYjUtNDFjOS1iZDI1LWY5Nzg5NDM5MDEzMiJ9.DC4DguV2k12c_-aXXUGDRjK36bBH2iacEYKKHS9fh5w",
  "access_expires_at": "2026-10-30T13:40:42.324899263Z",
  "refresh_token": "r97Maz78GvGwCBfqhAAa7RCfUk7WTkEHI5o_-eiVPXI",
  "refresh_expires_at": "2026-11-29T13:25:42.323503463Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "dc79df31-9844-4615-a759-8ebab0263edd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "f7bee6da-295e-4216-9f29-9fc27829b218",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f7bee6da-295e-4216-9f29-9fc27829b218",
    "orderDate": "1793366742",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8faa2955a32a16080e0ffe8bf1e6432e",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f7bee6da-295e-4216-9f29-9fc27829b218",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738698819"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f7bee6da-295e-4216-9f29-9fc27829b218",
  "created_at": "2026-10-30T13:25:42.605746Z",
  "expires_at": "2026-10-30T13:55:42.605746Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/f7bee6da-295e-4216-9f29-9fc27829b218` → **200**

```json
{
  "id": "f7bee6da-295e-4216-9f29-9fc27829b218",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:25:42.605746Z",
  "expires_at": "2026-10-30T13:55:42.605746Z",
  "completed_at": "2026-10-30T13:25:42.875904Z",
  "masked_pan": "41****8578",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "20c6a846-b011-484b-9578-a32aaec048cd",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "20c6a846-b011-484b-9578-a32aaec048cd",
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
      "id": "5be022d1-4576-4904-a6f7-a96fac9f4cdc",
      "at": "2026-10-30T13:25:43.882751Z",
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
  "client_id": "20c6a846-b011-484b-9578-a32aaec048cd",
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
      "id": "5be022d1-4576-4904-a6f7-a96fac9f4cdc",
      "at": "2026-10-30T13:25:43.882751Z",
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
  "device_ref": "sandbox-22255"
}
```

```json
{
  "challenge_id": "2ffd204e-7d93-47f3-9f18-16151d5049c8",
  "expires_at": "2026-10-30T13:30:44.969503931Z",
  "resend_available_at": "2026-10-30T13:25:45.969503931Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "710604",
  "sent_at": "2026-10-30T13:25:44.971914514Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ffd204e-7d93-47f3-9f18-16151d5049c8",
  "code": "710604",
  "device_ref": "sandbox-22255"
}
```

```json
{
  "session_id": "9c191660-75a6-49ca-9c07-43054eab6991",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzY0NSwiaWF0IjoxNzkzMzY2NzQ1LCJqdGkiOiJkZTExMzRhMi01NTgwLTQzMjgtYjFmMi0zYTAyNjYwMWFjNjIiLCJzaWQiOiI5YzE5MTY2MC03NWE2LTQ5Y2EtOWMwNy00MzA1NGVhYjY5OTEifQ.KzO1NRuLQeKk-GZ6uXf6E6JxplL7YggPkrFR6MjXfEQ",
  "access_expires_at": "2026-10-30T13:40:45.266307293Z",
  "refresh_token": "-uZ8YiF-NPuhjtcQY5MNf3zTuOECCuuu6Wy6pJ5XwGA",
  "refresh_expires_at": "2026-11-29T13:25:45.265588178Z",
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
  "command_id": "780d5c36-691f-431b-9a73-c617b2091136",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "c51a7a27-950a-49d0-b9df-02fad85f63d6",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c51a7a27-950a-49d0-b9df-02fad85f63d6",
    "orderDate": "1793366745",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "f7674954a76ee8eda90a1d565a7d9c2f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c51a7a27-950a-49d0-b9df-02fad85f63d6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c51a7a27-950a-49d0-b9df-02fad85f63d6",
  "created_at": "2026-10-30T13:25:45.826069Z",
  "expires_at": "2026-10-30T13:55:45.826069Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/c51a7a27-950a-49d0-b9df-02fad85f63d6` → **200**

```json
{
  "id": "c51a7a27-950a-49d0-b9df-02fad85f63d6",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T13:25:45.826069Z",
  "expires_at": "2026-10-30T13:55:45.826069Z",
  "completed_at": "2026-10-30T13:25:46.109491Z",
  "masked_pan": "41****7514",
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
      "id": "79bb43b5-9a06-4374-b310-99439708b9c7",
      "at": "2026-10-30T13:25:46.897812Z",
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
  "command_id": "ca7a897b-df15-4c0b-bf68-d3f5941b7702",
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
  "correlation_id": "9c420704-e37c-4de6-af64-593b48752173"
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
  "device_ref": "sandbox-18593"
}
```

```json
{
  "challenge_id": "83447212-5669-4897-837b-45f2b421d1ca",
  "expires_at": "2026-10-30T13:30:48.243428228Z",
  "resend_available_at": "2026-10-30T13:25:49.243428228Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "640677",
  "sent_at": "2026-10-30T13:25:48.245976439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83447212-5669-4897-837b-45f2b421d1ca",
  "code": "640677",
  "device_ref": "sandbox-18593"
}
```

```json
{
  "session_id": "5c0d8027-bb56-4ed3-a454-e267fdca29d5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzY0OCwiaWF0IjoxNzkzMzY2NzQ4LCJqdGkiOiJlMDVmMGNhZi02MzVmLTQzYWYtODU1Yi1iMjAwYjQ0MjdiNDMiLCJzaWQiOiI1YzBkODAyNy1iYjU2LTRlZDMtYTQ1NC1lMjY3ZmRjYTI5ZDUifQ.6Zx-7DzoF63aaqM6xCVOZP2DUs5pHdeAhGmnkBCxkVM",
  "access_expires_at": "2026-10-30T13:40:48.540354655Z",
  "refresh_token": "n6YqFg4WvQRwvpQ9ZCBRxPD1TveHoSBu8nqOVxQVp5Q",
  "refresh_expires_at": "2026-11-29T13:25:48.539521351Z",
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
  "command_id": "0ca150b0-af8b-4e7a-ac5e-4a163898dc20",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:49Z",
    "sequence": 1793366749933
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b218f6b0-e84c-4854-821b-088909a66ca1",
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
  "last_heartbeat_at": "2026-10-30T13:25:49.110395Z",
  "last_location_at": "2026-10-30T13:25:49.110395Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638159260",
  "device_ref": "sandbox-7125"
}
```

```json
{
  "challenge_id": "7b2fbfaf-b42c-4612-8004-1dab95536447",
  "expires_at": "2026-10-30T13:30:49.379858814Z",
  "resend_available_at": "2026-10-30T13:25:50.379858814Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638159260` → **200**

```json
{
  "phone": "+380638159260",
  "audience": "CLIENT",
  "code": "681482",
  "sent_at": "2026-10-30T13:25:49.382344061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b2fbfaf-b42c-4612-8004-1dab95536447",
  "code": "681482",
  "device_ref": "sandbox-7125"
}
```

```json
{
  "session_id": "5552a1b3-2390-4c8f-b6bf-a8f620925bf6",
  "subject": {
    "type": "CLIENT",
    "id": "d6961b77-8871-4cec-91fa-ca21bcd4e66e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNjk2MWI3Ny04ODcxLTRjZWMtOTFmYS1jYTIxYmNkNGU2NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NjQ5LCJpYXQiOjE3OTMzNjY3NDksImp0aSI6ImVkOTg2YmZmLWU1ZGEtNDZmOS1hZWU3LTEwN2Q0ZTEzNGZhZiIsInNpZCI6IjU1NTJhMWIzLTIzOTAtNGM4Zi1iNmJmLWE4ZjYyMDkyNWJmNiJ9.rjy21nZZPmWjlna0Zt8fGrtiFVFWW8KeNA-VwmSQT6w",
  "access_expires_at": "2026-10-30T13:40:49.672288398Z",
  "refresh_token": "0vwldzzngEPlf__lQjmPgYmdfK2QAUcRi7BbTPZTojk",
  "refresh_expires_at": "2026-11-29T13:25:49.671664301Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c3bb8629-f326-409f-a97b-0d12d3027b00",
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
  "id": "ab88e3d3-fdc2-42c0-8599-fc6279d5bb11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:30:49.947062Z",
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
  "command_id": "fbaf41ca-459e-4c4c-895d-49c6c0f1995a",
  "quote_id": "ab88e3d3-fdc2-42c0-8599-fc6279d5bb11",
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
  "id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d6961b77-8871-4cec-91fa-ca21bcd4e66e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:25:50.238535Z",
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
    "id": "787bee27-e767-475e-9da0-f27d45fd8689",
    "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
    "expires_at": "2026-10-30T13:26:05.241387Z",
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

`POST /api/driver/v1/offers/787bee27-e767-475e-9da0-f27d45fd8689/accept` → **200**

```json
{
  "command_id": "b342347b-8cee-45cb-8351-9fe3afcc4206"
}
```

```json
{
  "id": "8d5b13e5-4f32-45fe-804f-7f1ef6a6258d",
  "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a108448a-4b60-4075-9025-209c0ce3fba3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a108448a-4b60-4075-9025-209c0ce3fba3",
  "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
  "assignment_id": "8d5b13e5-4f32-45fe-804f-7f1ef6a6258d",
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

`POST /api/driver/v1/work-sessions/b218f6b0-e84c-4854-821b-088909a66ca1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:51Z",
    "sequence": 1793366751365
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b218f6b0-e84c-4854-821b-088909a66ca1",
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
  "last_heartbeat_at": "2026-10-30T13:25:51.383104Z",
  "last_location_at": "2026-10-30T13:25:51.383104Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/a108448a-4b60-4075-9025-209c0ce3fba3/arrive` → **200**

```json
{
  "command_id": "6e74fb31-9b98-49bb-988a-f2bf5be96a93",
  "expected_version": 0
}
```

```json
{
  "id": "a108448a-4b60-4075-9025-209c0ce3fba3",
  "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
  "assignment_id": "8d5b13e5-4f32-45fe-804f-7f1ef6a6258d",
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
  "arrived_at": "2026-10-30T13:25:51.659233Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a108448a-4b60-4075-9025-209c0ce3fba3/start` → **200**

```json
{
  "command_id": "6008c1db-d559-4526-af73-3c1581964c08",
  "expected_version": 1
}
```

```json
{
  "id": "a108448a-4b60-4075-9025-209c0ce3fba3",
  "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
  "assignment_id": "8d5b13e5-4f32-45fe-804f-7f1ef6a6258d",
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
  "arrived_at": "2026-10-30T13:25:51.659233Z",
  "started_at": "2026-10-30T13:25:51.946198Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a108448a-4b60-4075-9025-209c0ce3fba3/complete` → **200**

```json
{
  "command_id": "dde8d408-70b4-4500-b79a-a660dd16f0a5",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:25:52Z",
  "cash_received": false
}
```

```json
{
  "id": "a108448a-4b60-4075-9025-209c0ce3fba3",
  "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
  "assignment_id": "8d5b13e5-4f32-45fe-804f-7f1ef6a6258d",
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
  "arrived_at": "2026-10-30T13:25:51.659233Z",
  "started_at": "2026-10-30T13:25:51.946198Z",
  "completed_at": "2026-10-30T13:25:52.23083Z",
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
  "session_id": "33f0fe96-bbd3-4b24-ab4e-51eefa687f75",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc2NTIsImlhdCI6MTc5MzM2Njc1MiwianRpIjoiMGRjYTg3OGYtZTdmMy00NGQ0LWE5NzMtZjYzMmIxMDUwNTlhIiwic2lkIjoiMzNmMGZlOTYtYmJkMy00YjI0LWFiNGUtNTFlZWZhNjg3Zjc1In0.9-196YvsghDkogPWD0e4N9CRfSEBsUNzEkYsd7iMw_A",
  "access_expires_at": "2026-10-30T13:40:52.79973225Z",
  "refresh_token": "3nIW2VeSxOjPLFPm_YasdM4yJ8KNgict6ZwTY6siE_U",
  "refresh_expires_at": "2026-10-31T01:25:52.79902508Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/1ed8a469-b08d-475b-a64c-9803fef140c1/cash-dispute` → **200**

```json
{
  "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "d6961b77-8871-4cec-91fa-ca21bcd4e66e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:25:52.949054Z",
  "decide_by": "2026-11-13T13:25:52.949054Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T13:25:52.949054Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "d6961b77-8871-4cec-91fa-ca21bcd4e66e",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T13:25:52.949054Z",
      "decide_by": "2026-11-13T13:25:52.949054Z",
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

`POST /api/admin/v1/orders/1ed8a469-b08d-475b-a64c-9803fef140c1/cash-dispute/decide` → **400**

```json
{
  "command_id": "f2cfba70-6ea9-4def-81df-cbe8df2b2b19",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/1ed8a469-b08d-475b-a64c-9803fef140c1/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "bb5e107a-9483-465d-bcc0-5a573e60f774",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/1ed8a469-b08d-475b-a64c-9803fef140c1/cash-dispute/decide` → **200**

```json
{
  "command_id": "a89ae498-ff86-4228-bd10-7f70813f16d0",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "d6961b77-8871-4cec-91fa-ca21bcd4e66e",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T13:25:52.949054Z",
  "decide_by": "2026-11-13T13:25:52.949054Z",
  "decision": "PAY_DRIVER",
  "decided_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T13:25:53.96412Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/1ed8a469-b08d-475b-a64c-9803fef140c1/cash-dispute/decide` → **409**

```json
{
  "command_id": "8aaf7385-8d3e-422a-9e9d-c5713235c3d0",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/1ed8a469-b08d-475b-a64c-9803fef140c1/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "19ec9aa5-5596-4e8a-a7f6-be5bcfd4a748"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b218f6b0-e84c-4854-821b-088909a66ca1",
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
  "last_heartbeat_at": "2026-10-30T13:25:51.383104Z",
  "last_location_at": "2026-10-30T13:25:51.383104Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b218f6b0-e84c-4854-821b-088909a66ca1/close` → **200**

```json
{
  "command_id": "c5a0cb41-ce72-442f-9bf3-19130bb2792b",
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
  "phone": "+380735885923",
  "device_ref": "sandbox-26027"
}
```

```json
{
  "challenge_id": "ec66c719-be74-45f4-8972-a8368d45efb3",
  "expires_at": "2026-10-30T13:30:55.086104339Z",
  "resend_available_at": "2026-10-30T13:25:56.086104339Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735885923` → **200**

```json
{
  "phone": "+380735885923",
  "audience": "CLIENT",
  "code": "328618",
  "sent_at": "2026-10-30T13:25:55.088575073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec66c719-be74-45f4-8972-a8368d45efb3",
  "code": "328618",
  "device_ref": "sandbox-26027"
}
```

```json
{
  "session_id": "46bace37-02b9-4715-b18c-d931c854a5ca",
  "subject": {
    "type": "CLIENT",
    "id": "3832fe45-e2d0-48da-948b-0829427a9625"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODMyZmU0NS1lMmQwLTQ4ZGEtOTQ4Yi0wODI5NDI3YTk2MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NjU1LCJpYXQiOjE3OTMzNjY3NTUsImp0aSI6IjNkYTQ5OWExLWRmOTAtNDdkYi1iZGNjLTY4ODk2Y2NiZGU3MCIsInNpZCI6IjQ2YmFjZTM3LTAyYjktNDcxNS1iMThjLWQ5MzFjODU0YTVjYSJ9.48N5eFJ7wkWDGg1wN1E7JrDvP6W_XGGiQSO9rKPc5sE",
  "access_expires_at": "2026-10-30T13:40:55.380659388Z",
  "refresh_token": "chZknf3qYbwuh9xCQM4hgbm-Qc6t7nH3QqnuF_8EC68",
  "refresh_expires_at": "2026-11-29T13:25:55.380138875Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "290b1f74-4a42-4747-8705-7de73e85af99",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "65ef1565-37ad-46c6-89bb-0ba449378afb",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-65ef1565-37ad-46c6-89bb-0ba449378afb",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f0435411f73b3a63d3ea85a57e761d9e",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=65ef1565-37ad-46c6-89bb-0ba449378afb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735885923"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=65ef1565-37ad-46c6-89bb-0ba449378afb",
  "expires_at": "2026-10-30T13:55:55.645344Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/65ef1565-37ad-46c6-89bb-0ba449378afb` → **200**

```json
{
  "id": "65ef1565-37ad-46c6-89bb-0ba449378afb",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T13:55:55.645344Z",
  "card": {
    "id": "e0b207e3-541a-4e43-99fe-e836944d78e6",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3088",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:25:55.920357Z"
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
  "device_ref": "sandbox-9756"
}
```

```json
{
  "challenge_id": "b414cb53-06fc-4c8c-83a9-8cfe51881fab",
  "expires_at": "2026-10-30T13:30:56.226195847Z",
  "resend_available_at": "2026-10-30T13:25:57.226195847Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "870063",
  "sent_at": "2026-10-30T13:25:56.228633061Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b414cb53-06fc-4c8c-83a9-8cfe51881fab",
  "code": "870063",
  "device_ref": "sandbox-9756"
}
```

```json
{
  "session_id": "316ab8d3-faf3-4f82-9be1-f6608d50eec9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzY1NiwiaWF0IjoxNzkzMzY2NzU2LCJqdGkiOiI4NzQyYzQ0Ny05OTM2LTQ1YTEtYjhkNy1iZGE1MTI5ZmU0NDQiLCJzaWQiOiIzMTZhYjhkMy1mYWYzLTRmODItOWJlMS1mNjYwOGQ1MGVlYzkifQ.sJPPPknZxsIWGJ_0HUUgXhp3ow793TlyzmY6OKxzEsw",
  "access_expires_at": "2026-10-30T13:40:56.526245042Z",
  "refresh_token": "XBDItZ2iN3FaT4cSc3VrlGcykt-8Fpo6MsL2pn7eLMs",
  "refresh_expires_at": "2026-11-29T13:25:56.525409414Z",
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
  "command_id": "3d810198-f091-46a1-8240-aeca90249db2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:25:57Z",
    "sequence": 1793366757684
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5e13c3ec-b592-45b1-9508-25e0ee115d19",
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
  "last_heartbeat_at": "2026-10-30T13:25:57.085042Z",
  "last_location_at": "2026-10-30T13:25:57.085042Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1c8ab41a-8616-4bd3-99d9-298c9ab0cbdc",
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
  "id": "2e36e962-b644-448e-beef-4e30729d439a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:30:57.369569Z",
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
  "command_id": "cd7ebb3f-9472-429f-888d-6848bfc31a86",
  "quote_id": "2e36e962-b644-448e-beef-4e30729d439a",
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
  "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3832fe45-e2d0-48da-948b-0829427a9625",
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
  "created_at": "2026-10-30T13:25:57.653461Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc` → **200**

```json
{
  "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3832fe45-e2d0-48da-948b-0829427a9625",
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
  "created_at": "2026-10-30T13:25:57.653461Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc` → **200**

```json
{
  "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3832fe45-e2d0-48da-948b-0829427a9625",
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
  "created_at": "2026-10-30T13:25:57.653461Z",
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
    "id": "a2a501c0-1233-473e-a1ef-7fb51b149f86",
    "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
    "expires_at": "2026-10-30T13:26:12.986859Z",
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

`POST /api/driver/v1/offers/a2a501c0-1233-473e-a1ef-7fb51b149f86/accept` → **200**

```json
{
  "command_id": "9c4068d0-99f1-4bca-88f6-052d61a2b991"
}
```

```json
{
  "id": "f489adc4-5e66-478b-8473-fde400196cc9",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "assignment_id": "f489adc4-5e66-478b-8473-fde400196cc9",
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

`POST /api/rider/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/messages` → **201**

```json
{
  "command_id": "b0ef0502-33e7-4548-887b-498c08b070a2",
  "body": "Я біля входу, мій номер +380735885923, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "07538bc8-7b9e-4d62-8cbf-ac4161fce25b",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735885923, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T13:26:00.343805795Z"
}
```

`POST /api/driver/v1/trips/55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb/messages` → **201**

```json
{
  "command_id": "4831a9c1-3ec6-4df8-9908-058d64710140",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "b519595d-c5a1-42cc-aaa2-37b83e83cd32",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T13:26:00.618861084Z"
}
```

(the car drives 6 s to the next point)

`POST /api/driver/v1/work-sessions/5e13c3ec-b592-45b1-9508-25e0ee115d19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:26:06Z",
    "sequence": 1793366766901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5e13c3ec-b592-45b1-9508-25e0ee115d19",
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
  "last_heartbeat_at": "2026-10-30T13:26:06.91874Z",
  "last_location_at": "2026-10-30T13:26:06.91874Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb/arrive` → **200**

```json
{
  "command_id": "6cd465f7-ba88-40c1-a109-4026062aa6ae",
  "expected_version": 0
}
```

```json
{
  "id": "55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "assignment_id": "f489adc4-5e66-478b-8473-fde400196cc9",
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
  "arrived_at": "2026-10-30T13:26:07.205291Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb/start` → **200**

```json
{
  "command_id": "0a773628-05ed-48bd-a16a-516f8b71f600",
  "expected_version": 1
}
```

```json
{
  "id": "55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "assignment_id": "f489adc4-5e66-478b-8473-fde400196cc9",
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
  "arrived_at": "2026-10-30T13:26:07.205291Z",
  "started_at": "2026-10-30T13:26:07.499258Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/5e13c3ec-b592-45b1-9508-25e0ee115d19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:27:37Z",
    "sequence": 1793366857802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5e13c3ec-b592-45b1-9508-25e0ee115d19",
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
  "last_heartbeat_at": "2026-10-30T13:27:37.818016Z",
  "last_location_at": "2026-10-30T13:27:37.818016Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb/complete` → **200**

```json
{
  "command_id": "126c936a-8304-4c2c-b10e-ec4a2fbe56ff",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:27:38Z",
  "cash_received": false
}
```

```json
{
  "id": "55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "assignment_id": "f489adc4-5e66-478b-8473-fde400196cc9",
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
  "arrived_at": "2026-10-30T13:26:07.205291Z",
  "started_at": "2026-10-30T13:26:07.499258Z",
  "completed_at": "2026-10-30T13:27:38.108645Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc` → **200**

```json
{
  "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "3832fe45-e2d0-48da-948b-0829427a9625",
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
    "id": "f489adc4-5e66-478b-8473-fde400196cc9",
    "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:25:57.653461Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc` → **200**

```json
{
  "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "3832fe45-e2d0-48da-948b-0829427a9625",
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
    "id": "f489adc4-5e66-478b-8473-fde400196cc9",
    "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "55b4a8fd-2ca2-4090-8cb2-0f9dbe6b03bb",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:25:57.653461Z",
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
  "session_id": "5e13c3ec-b592-45b1-9508-25e0ee115d19",
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
  "last_heartbeat_at": "2026-10-30T13:27:37.818016Z",
  "last_location_at": "2026-10-30T13:27:37.818016Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5e13c3ec-b592-45b1-9508-25e0ee115d19/close` → **200**

```json
{
  "command_id": "269cc01c-fe99-4b5c-b861-0a9dda416fe6",
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
  "session_id": "70f52c90-2c65-41bb-ad7b-8e5271bfac5a",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NjAsImlhdCI6MTc5MzM2Njg2MCwianRpIjoiZjJlNDc5YWQtZTg5NS00NWI3LTk1YTgtNDY1YTliNzRmMDFkIiwic2lkIjoiNzBmNTJjOTAtMmM2NS00MWJiLWFkN2ItOGU1MjcxYmZhYzVhIn0.SFtqrRMNLey2YRhmghXEnRNAxgMm2zfJeaENX97GHK0",
  "access_expires_at": "2026-10-30T13:42:40.80436156Z",
  "refresh_token": "vGd3OJ3YTo0aHyx37poDhqReakzA3H7mroJfMTe006w",
  "refresh_expires_at": "2026-10-31T01:27:40.803685075Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "30ba04d8-92b5-4f08-900a-86ee2411515b"
}
```

`GET /api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T13:27:41.346348546Z",
  "order": {
    "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
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
    "created_at": "2026-10-30T13:25:57.653461Z",
    "assigned_at": "2026-10-30T13:25:59.791939Z",
    "arrived_at": "2026-10-30T13:26:07.205291Z",
    "started_at": "2026-10-30T13:26:07.499258Z",
    "completed_at": "2026-10-30T13:27:38.108645Z"
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
    "id": "3832fe45-e2d0-48da-948b-0829427a9625",
    "registered_at": "2026-10-30T13:25:55.378604Z",
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
      "created_at": "2026-10-30T13:25:57.655566Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T13:27:38.171147Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/chargebacks` → **422**

```json
{
  "command_id": "4dcdb320-7a7f-4cba-80a9-077c19797919",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "ab430866-d4d3-4125-92e8-e6091e1bddb8"
}
```

`POST /api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/chargebacks` → **201**

```json
{
  "command_id": "d7b8aa9d-3cc9-43ad-bad8-da2628722496",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "ec4e2d52-0c0b-4713-8e14-2d4f33d4d939",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:27:41.975368Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/chargebacks` → **201**

```json
{
  "command_id": "d7b8aa9d-3cc9-43ad-bad8-da2628722496",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "ec4e2d52-0c0b-4713-8e14-2d4f33d4d939",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T13:27:41.975368Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/3832fe45-e2d0-48da-948b-0829427a9625` → **200**

```json
{
  "client": {
    "id": "3832fe45-e2d0-48da-948b-0829427a9625",
    "phone": "+380735885923",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:25:55.378604Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:25:57.653461Z",
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

`POST /api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/chargebacks/ec4e2d52-0c0b-4713-8e14-2d4f33d4d939/resolve` → **200**

```json
{
  "command_id": "e7705cdd-e00a-4641-89cd-f0057a73e4f7",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "ec4e2d52-0c0b-4713-8e14-2d4f33d4d939",
  "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T13:27:41.975368Z",
  "resolved_at": "2026-10-30T13:27:42.87163Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/3832fe45-e2d0-48da-948b-0829427a9625` → **200**

```json
{
  "client": {
    "id": "3832fe45-e2d0-48da-948b-0829427a9625",
    "phone": "+380735885923",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:25:55.378604Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:25:57.653461Z",
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

`GET /api/admin/v1/clients/3832fe45-e2d0-48da-948b-0829427a9625` → **200**

```json
{
  "client": {
    "id": "3832fe45-e2d0-48da-948b-0829427a9625",
    "phone": "+380735885923",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:25:55.378604Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T13:25:57.653461Z",
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

`POST /api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/chargebacks/ec4e2d52-0c0b-4713-8e14-2d4f33d4d939/resolve` → **409**

```json
{
  "command_id": "9f814db1-1743-4a8f-8855-23dab725f9ce",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/chargebacks/ec4e2d52-0c0b-4713-8e14-2d4f33d4d939/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b496e787-8e64-4061-91ee-3c6f579d07df"
}
```

`GET /api/admin/v1/orders/3b2a4a99-f791-46ce-b6e7-2ff66b4676bc/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "ec4e2d52-0c0b-4713-8e14-2d4f33d4d939",
      "order_id": "3b2a4a99-f791-46ce-b6e7-2ff66b4676bc",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T13:27:41.975368Z",
      "resolved_at": "2026-10-30T13:27:42.87163Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 3b2a4a99-f791-46ce-b6e7-2ff66b4676bc without phone or card digits; chargeback ec4e2d52-0c0b-4713-8e14-2d4f33d4d939 recorded and won.

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
  "session_id": "17d8962b-6afe-4070-9fef-54cac8856294",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NjUsImlhdCI6MTc5MzM2Njg2NSwianRpIjoiMDA4Yzc5NGMtZGZmNS00Zjc3LWJiNmYtM2MwODQ5MGQ0MDhkIiwic2lkIjoiMTdkODk2MmItNmFmZS00MDcwLTlmZWYtNTRjYWM4ODU2Mjk0In0.BrnNvcLVPVAFfQ0MA6bor7iz1s7wekNmMoTkaw4kpKs",
  "access_expires_at": "2026-10-30T13:42:45.862878593Z",
  "refresh_token": "z767jrWtbG4awE46BQmKbRlVFawym2hi6-4ZHRizIME",
  "refresh_expires_at": "2026-10-31T01:27:45.862349164Z",
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
  "phone": "+48600121210",
  "device_ref": "sandbox-17183"
}
```

```json
{
  "challenge_id": "ad167abc-754a-41c4-bc16-31cebb322f67",
  "expires_at": "2026-10-30T13:32:46.688693614Z",
  "resend_available_at": "2026-10-30T13:27:47.688693614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600121210` → **200**

```json
{
  "phone": "+48600121210",
  "audience": "CLIENT",
  "code": "002167",
  "sent_at": "2026-10-30T13:27:46.691222652Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad167abc-754a-41c4-bc16-31cebb322f67",
  "code": "002167",
  "device_ref": "sandbox-17183"
}
```

```json
{
  "session_id": "e2a7519f-0cc0-45df-bd07-14a04a77c1a0",
  "subject": {
    "type": "CLIENT",
    "id": "45b31851-4cb5-43f5-996c-ca81c9047d9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NWIzMTg1MS00Y2I1LTQzZjUtOTk2Yy1jYTgxYzkwNDdkOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NzY2LCJpYXQiOjE3OTMzNjY4NjYsImp0aSI6ImM2ZDk2MDM1LWI1M2EtNDg1MS04YWYzLTU0ZTBkYTBmMDBlOSIsInNpZCI6ImUyYTc1MTlmLTBjYzAtNDVkZi1iZDA3LTE0YTA0YTc3YzFhMCJ9.ZlU94BA0J0Myl2YZziKX15Mov1gylclLyHLvsGQYQQo",
  "access_expires_at": "2026-10-30T13:42:46.986663746Z",
  "refresh_token": "qVOlCXLP6mScVXVsov1KixsuXRwcp0EhnPMWVYwS0MU",
  "refresh_expires_at": "2026-11-29T13:27:46.986047054Z",
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
  "command_id": "75259dc9-a199-4c5a-87e3-6fc14f5fe93a",
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
  "correlation_id": "609ea9f4-0b36-4367-9aa7-00aca2f45692",
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
  "command_id": "474a7312-fc3e-45c9-af3f-b7d00a109f0e",
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
  "paused_at": "2026-10-30T13:27:48.080143655Z",
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
  "command_id": "447cdb4c-2570-486a-a96f-571a81773a97",
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
  "id": "229fb11f-45ba-4c68-b0c0-235ff3201b87",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:32:48.646914Z",
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
  "command_id": "936e92a0-a7af-4002-a43c-fa85b522a32e",
  "quote_id": "229fb11f-45ba-4c68-b0c0-235ff3201b87",
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
  "correlation_id": "c8e3a5dc-a660-4486-a6f3-7faece057cfb"
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
  "paused_at": "2026-10-30T13:27:48.080144Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "a5fe89e7-e002-4835-a51f-7b7b519bfac6",
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
  "command_id": "355c6eae-6715-4d19-887c-a0c5ec8fbdbb",
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
  "command_id": "17f06eca-f9e0-4fa3-916a-09f4cf0afaea",
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
  "id": "b3f4a961-1c06-47ae-9a77-1532095af595",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:32:50.319645Z",
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
  "command_id": "450e3b8d-7f16-4c39-a4f2-2ce1f8c501b8",
  "quote_id": "b3f4a961-1c06-47ae-9a77-1532095af595",
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
  "correlation_id": "b72c0ee7-51de-4628-9a96-1ca823a9c565"
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
  "command_id": "715c374b-858e-4823-856a-e9e652f0304a",
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
  "command_id": "9a6b0ac9-8618-4433-96ac-ca1ca44596ad",
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
  "id": "e94ed414-7a67-4fb1-b9e0-3a1f0df1d643",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:32:51.445079Z",
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
  "command_id": "3fd573d9-c4a2-482c-917e-dfb3b81d7e3e",
  "quote_id": "e94ed414-7a67-4fb1-b9e0-3a1f0df1d643",
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
  "correlation_id": "d8559f3f-f287-4f8b-89e1-7f7c14705d7f"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "1f569d79-2951-47f7-8682-d3ebf8cab4e1",
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
  "correlation_id": "9e2ccaf6-3997-43a2-9c50-e6ac90158d76",
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
  "command_id": "0db61f20-81be-4348-a7b8-ad35588d13ff",
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
  "phone": "+380671793386",
  "device_ref": "sandbox-11552"
}
```

```json
{
  "challenge_id": "b79b4450-34a7-4e90-a3c9-95cf595ae20b",
  "expires_at": "2026-10-30T13:32:52.881430147Z",
  "resend_available_at": "2026-10-30T13:27:53.881430147Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671793386` → **200**

```json
{
  "phone": "+380671793386",
  "audience": "CLIENT",
  "code": "988525",
  "sent_at": "2026-10-30T13:27:52.883755658Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b79b4450-34a7-4e90-a3c9-95cf595ae20b",
  "code": "988525",
  "device_ref": "sandbox-11552"
}
```

```json
{
  "session_id": "552248bb-51f9-4703-94ca-d907ce5a14a8",
  "subject": {
    "type": "CLIENT",
    "id": "2bdb0184-c848-4ece-9fe5-1fcc56e7ba0f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYmRiMDE4NC1jODQ4LTRlY2UtOWZlNS0xZmNjNTZlN2JhMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NzczLCJpYXQiOjE3OTMzNjY4NzMsImp0aSI6IjEyOGU2MjU2LTcwNTgtNDJmMi1hNTIwLTRkNGQ2ZDY0ZDc3NSIsInNpZCI6IjU1MjI0OGJiLTUxZjktNDcwMy05NGNhLWQ5MDdjZTVhMTRhOCJ9.miEIlDkiDaCTiVIcscgDP9UtVsHOpv014j_XMx4GKmk",
  "access_expires_at": "2026-10-30T13:42:53.193934427Z",
  "refresh_token": "D7WH7Szt1GoiJqD3MI2kI-NsPux_ndYWWMcKP6MQpIQ",
  "refresh_expires_at": "2026-11-29T13:27:53.193394806Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2bdb0184-c848-4ece-9fe5-1fcc56e7ba0f",
  "session_id": "552248bb-51f9-4703-94ca-d907ce5a14a8",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dcdd272d-ed18-4059-b4a6-d8d8b98ebf56",
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
  "id": "a06bb7ad-5454-410d-820e-61fdc555cae9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:32:53.733192Z",
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
  "challenge_id": "c1e2525b-9dc3-4d6d-ae19-a4cb1d134186",
  "expires_at": "2026-10-30T13:32:56.021826037Z",
  "resend_available_at": "2026-10-30T13:27:57.021826037Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671793386` → **200**

```json
{
  "phone": "+380671793386",
  "audience": "CLIENT",
  "code": "929757",
  "sent_at": "2026-10-30T13:27:56.024099983Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "b6ad4522-4876-4bdd-9199-5234498aabab",
  "challenge_id": "c1e2525b-9dc3-4d6d-ae19-a4cb1d134186",
  "otp_code": "929757"
}
```

```json
{
  "client_id": "2bdb0184-c848-4ece-9fe5-1fcc56e7ba0f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T13:27:56.32658815Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "d95de99f-8a37-42f6-aac1-417f388e4bea",
  "quote_id": "a06bb7ad-5454-410d-820e-61fdc555cae9",
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
  "correlation_id": "37e4154c-969d-488f-91e0-f6cdce98ef24"
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
  "session_id": "f00ed8d4-1eac-417d-b5ce-3a7dff4a908d",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NzcsImlhdCI6MTc5MzM2Njg3NywianRpIjoiY2RhZWI2ZjQtZjEwMC00ODQ2LWE1YzMtYWIzYTBjNDNlNjliIiwic2lkIjoiZjAwZWQ4ZDQtMWVhYy00MTdkLWI1Y2UtM2E3ZGZmNGE5MDhkIn0.KeOIxGmIKwDU6mMJyIn2wRnSEnLMIdFN4tFRlANYvYU",
  "access_expires_at": "2026-10-30T13:42:57.151944088Z",
  "refresh_token": "QrOa4obSy2UEoOSzckVUA5SVFIhuG4b1uBdMCjEGuj0",
  "refresh_expires_at": "2026-10-31T01:27:57.151379716Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "2bdb0184-c848-4ece-9fe5-1fcc56e7ba0f",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T13:27:56.326588Z",
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

`POST /api/admin/v1/client-deletions/2bdb0184-c848-4ece-9fe5-1fcc56e7ba0f/complete` → **200**

```json
{
  "command_id": "f79502a0-eb2d-446b-b8f2-209d466f8125",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "2bdb0184-c848-4ece-9fe5-1fcc56e7ba0f",
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
  "correlation_id": "6dfa1d1e-71c4-4648-9316-78bfac92c025"
}
```

Done: client 2bdb0184-c848-4ece-9fe5-1fcc56e7ba0f anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664614416",
  "device_ref": "sandbox-32626"
}
```

```json
{
  "challenge_id": "279092ab-d988-4a2f-a2f7-c5af71ab1bf3",
  "expires_at": "2026-10-30T13:32:58.26186614Z",
  "resend_available_at": "2026-10-30T13:27:59.26186614Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664614416` → **200**

```json
{
  "phone": "+380664614416",
  "audience": "CLIENT",
  "code": "614335",
  "sent_at": "2026-10-30T13:27:58.264453051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "279092ab-d988-4a2f-a2f7-c5af71ab1bf3",
  "code": "614335",
  "device_ref": "sandbox-32626"
}
```

```json
{
  "session_id": "39bf74de-31b4-4bab-8eb8-127f61b314f2",
  "subject": {
    "type": "CLIENT",
    "id": "660e6fe7-b151-406f-919d-a0c91efd22f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjBlNmZlNy1iMTUxLTQwNmYtOTE5ZC1hMGM5MWVmZDIyZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Nzc4LCJpYXQiOjE3OTMzNjY4NzgsImp0aSI6ImFkNGNjNzFmLTU4YmMtNGViYi04NzNiLWE5NGJlNzFkMGY4ZCIsInNpZCI6IjM5YmY3NGRlLTMxYjQtNGJhYi04ZWI4LTEyN2Y2MWIzMTRmMiJ9.iugNIpxVAsr_bc3xxrWvnLB7VH5wb2SJVvSmg7tYzS0",
  "access_expires_at": "2026-10-30T13:42:58.55197895Z",
  "refresh_token": "GgFEhWNNWdApLDm0D4G7v7Ct-M-9KlA6RP_uqRLkpkY",
  "refresh_expires_at": "2026-11-29T13:27:58.551443356Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "660e6fe7-b151-406f-919d-a0c91efd22f4",
  "session_id": "39bf74de-31b4-4bab-8eb8-127f61b314f2",
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
  "session_id": "c2a04b1d-b073-407a-8361-fc7b67d2527e",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3NzksImlhdCI6MTc5MzM2Njg3OSwianRpIjoiNTllNTA4ODctNDM0ZC00YzRiLWFjYTItZGM5OTk1NDg2ZDM4Iiwic2lkIjoiYzJhMDRiMWQtYjA3My00MDdhLTgzNjEtZmM3YjY3ZDI1MjdlIn0.PQb7vcBFwqRPgR6QMTFzuIww6PdxsgCAgvQvPhuq46Q",
  "access_expires_at": "2026-10-30T13:42:59.370328647Z",
  "refresh_token": "RLh68_RAS6MYKy_AvwLbGS2VeA5eEQelZknGVKABZIg",
  "refresh_expires_at": "2026-10-31T01:27:59.369795095Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4614416&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "660e6fe7-b151-406f-919d-a0c91efd22f4",
      "phone": "+380664614416",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T13:27:58.549443Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/660e6fe7-b151-406f-919d-a0c91efd22f4` → **200**

```json
{
  "client": {
    "id": "660e6fe7-b151-406f-919d-a0c91efd22f4",
    "phone": "+380664614416",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:27:58.549443Z",
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

`POST /api/admin/v1/clients/660e6fe7-b151-406f-919d-a0c91efd22f4/block` → **400**

```json
{
  "command_id": "da240ce4-7d08-445b-b89c-1d8de5cb1bfa",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/660e6fe7-b151-406f-919d-a0c91efd22f4/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "7a62ee4e-050c-4c0f-86bf-954bdf283ab1",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/660e6fe7-b151-406f-919d-a0c91efd22f4/block` → **200**

```json
{
  "command_id": "dd253abe-dd8a-41e7-b75c-4ee6f0f9e5f0",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "660e6fe7-b151-406f-919d-a0c91efd22f4",
  "phone": "+380664614416",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T13:27:58.549443Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T13:28:00.517398Z",
    "by": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
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
  "correlation_id": "75b3b8cb-3f01-46ca-ae09-74fed59661be"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664614416",
  "device_ref": "sandbox-19605"
}
```

```json
{
  "challenge_id": "496cf899-f17b-4461-a9e6-c3cfec2a87cf",
  "expires_at": "2026-10-30T13:33:03.0613558Z",
  "resend_available_at": "2026-10-30T13:28:04.0613558Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664614416` → **200**

```json
{
  "phone": "+380664614416",
  "audience": "CLIENT",
  "code": "808515",
  "sent_at": "2026-10-30T13:28:03.063716449Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "496cf899-f17b-4461-a9e6-c3cfec2a87cf",
  "code": "808515",
  "device_ref": "sandbox-19605"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d61344b8-d7fc-4a8f-b01e-ccef1d7b3cf7"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/660e6fe7-b151-406f-919d-a0c91efd22f4` → **200**

```json
{
  "client": {
    "id": "660e6fe7-b151-406f-919d-a0c91efd22f4",
    "phone": "+380664614416",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T13:27:58.549443Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T13:28:00.517398Z",
      "by": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
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

`POST /api/admin/v1/clients/660e6fe7-b151-406f-919d-a0c91efd22f4/unblock` → **200**

```json
{
  "command_id": "5b3ca6be-140d-47ad-9a50-6091eaa3da24",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "660e6fe7-b151-406f-919d-a0c91efd22f4",
  "phone": "+380664614416",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T13:27:58.549443Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664614416",
  "device_ref": "sandbox-18390"
}
```

```json
{
  "challenge_id": "bf91fb72-258e-4cd9-89f9-f5b14092d470",
  "expires_at": "2026-10-30T13:33:06.217590605Z",
  "resend_available_at": "2026-10-30T13:28:07.217590605Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664614416` → **200**

```json
{
  "phone": "+380664614416",
  "audience": "CLIENT",
  "code": "520864",
  "sent_at": "2026-10-30T13:28:06.220243256Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf91fb72-258e-4cd9-89f9-f5b14092d470",
  "code": "520864",
  "device_ref": "sandbox-18390"
}
```

```json
{
  "session_id": "df4974bd-d870-48fe-9076-19295ec26853",
  "subject": {
    "type": "CLIENT",
    "id": "660e6fe7-b151-406f-919d-a0c91efd22f4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjBlNmZlNy1iMTUxLTQwNmYtOTE5ZC1hMGM5MWVmZDIyZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Nzg2LCJpYXQiOjE3OTMzNjY4ODYsImp0aSI6IjJjOTljZmE2LWFhODEtNGQ3NS04MWNiLTM4ODdhZDJjMGE0ZiIsInNpZCI6ImRmNDk3NGJkLWQ4NzAtNDhmZS05MDc2LTE5Mjk1ZWMyNjg1MyJ9.UmuFAXxS-7Htb-fr7-VmI4lwlxHyMF9rc5wrqkQioEE",
  "access_expires_at": "2026-10-30T13:43:06.522829769Z",
  "refresh_token": "lEKUHJYRR5yC1JQS79NlakKEQ1HBtyJ88Y6GLt2YdEA",
  "refresh_expires_at": "2026-11-29T13:28:06.522294278Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "660e6fe7-b151-406f-919d-a0c91efd22f4",
  "session_id": "df4974bd-d870-48fe-9076-19295ec26853",
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
  "phone": "+380665702121",
  "device_ref": "sandbox-2071"
}
```

```json
{
  "challenge_id": "fd79afdc-8319-4b58-9dd5-9d6bb8b2bcd8",
  "expires_at": "2026-10-30T13:33:07.063303972Z",
  "resend_available_at": "2026-10-30T13:28:08.063303972Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665702121` → **200**

```json
{
  "phone": "+380665702121",
  "audience": "CLIENT",
  "code": "484738",
  "sent_at": "2026-10-30T13:28:07.066004615Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd79afdc-8319-4b58-9dd5-9d6bb8b2bcd8",
  "code": "484738",
  "device_ref": "sandbox-2071"
}
```

```json
{
  "session_id": "407e3c2f-7844-4dfa-a359-cee5798f4ed5",
  "subject": {
    "type": "CLIENT",
    "id": "b83edce0-6c41-4651-b22e-1dd898fb204c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODNlZGNlMC02YzQxLTQ2NTEtYjIyZS0xZGQ4OThmYjIwNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Nzg3LCJpYXQiOjE3OTMzNjY4ODcsImp0aSI6IjI0MTE1ZGE2LWIwOTctNGNjMi1hY2FiLWMyN2UzMGEyYTkyMyIsInNpZCI6IjQwN2UzYzJmLTc4NDQtNGRmYS1hMzU5LWNlZTU3OThmNGVkNSJ9.htznLiLtvEGnvvmqNnzdGSpymfcAwxw6BFGUa7_1DTU",
  "access_expires_at": "2026-10-30T13:43:07.363147996Z",
  "refresh_token": "_3WkviXFN1XMUbgyeOmiC5U43VDKyBSrwvpQPmHsnJo",
  "refresh_expires_at": "2026-11-29T13:28:07.362674294Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "68f98c36-737f-4789-8128-6b815c5888de",
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
  "id": "511defa0-d15e-4d58-845b-69169b91ef05",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:07.644185Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 1b1047ee-1f02-4d32-a32c-edc1b05709fd) → **201**

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
  "session_id": "d938dff6-003e-4c41-9eed-82e301ddd45e",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3ODgsImlhdCI6MTc5MzM2Njg4OCwianRpIjoiZmI0NWY2MjQtYThmYy00MWNiLTk1YjQtYjYzN2Y1NGZiZDQ3Iiwic2lkIjoiZDkzOGRmZjYtMDAzZS00YzQxLTllZWQtODJlMzAxZGRkNDVlIn0.3vR0VrPjYo6PrJ2_NWLR-s08QdUF8jgZa16hIo8gmkA",
  "access_expires_at": "2026-10-30T13:43:08.241018433Z",
  "refresh_token": "zSFcCvAIFWvM4YgLCha-QyRv7FgZ5oLA_iEA0rdTqeE",
  "refresh_expires_at": "2026-10-31T01:28:08.240291535Z",
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
  "session_id": "4e7fb363-01bf-4afd-8520-58e0df836ed7",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3ODgsImlhdCI6MTc5MzM2Njg4OCwianRpIjoiMjQxMjEzYTctOTVhNC00MWMzLWI4YjctMjM2MTg3YjMyMDMwIiwic2lkIjoiNGU3ZmIzNjMtMDFiZi00YWZkLTg1MjAtNThlMGRmODM2ZWQ3In0.FwQJf4YbwZ98y_Kt5qQMVh8YprqMepCgZ6IDVSSqbZc",
  "access_expires_at": "2026-10-30T13:43:08.795664671Z",
  "refresh_token": "E__qcA53kw9CfueMi9P3JhZAzGUvX_bmsOBRdnNHIBg",
  "refresh_expires_at": "2026-10-31T01:28:08.795099053Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/afcd5b2a-da99-4db5-92d4-8d60460ab628/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:28:07.928138Z",
      "actor": {
        "type": "CLIENT",
        "id": "b83edce0-6c41-4651-b22e-1dd898fb204c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "afcd5b2a-da99-4db5-92d4-8d60460ab628",
        "quote_id": "511defa0-d15e-4d58-845b-69169b91ef05",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1b1047ee-1f02-4d32-a32c-edc1b05709fd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:28:07.929782Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "afcd5b2a-da99-4db5-92d4-8d60460ab628",
        "attempt_id": "41188b0b-43ae-4083-843d-33f945586a87",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1b1047ee-1f02-4d32-a32c-edc1b05709fd"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T13:28:07.93633Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "afcd5b2a-da99-4db5-92d4-8d60460ab628",
        "attempt_id": "41188b0b-43ae-4083-843d-33f945586a87"
      },
      "correlation_id": "1b1047ee-1f02-4d32-a32c-edc1b05709fd"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "41188b0b-43ae-4083-843d-33f945586a87",
        "generation": 1,
        "started_at": "2026-10-30T13:28:07.928978Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T13:28:07.93633Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T13:28:07.930375Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/1b1047ee-1f02-4d32-a32c-edc1b05709fd` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "afcd5b2a-da99-4db5-92d4-8d60460ab628:0",
      "order_id": "afcd5b2a-da99-4db5-92d4-8d60460ab628",
      "at": "2026-10-30T13:28:07.928138Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "afcd5b2a-da99-4db5-92d4-8d60460ab628:1",
      "order_id": "afcd5b2a-da99-4db5-92d4-8d60460ab628",
      "at": "2026-10-30T13:28:07.929782Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "afcd5b2a-da99-4db5-92d4-8d60460ab628:2",
      "order_id": "afcd5b2a-da99-4db5-92d4-8d60460ab628",
      "at": "2026-10-30T13:28:07.93633Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/03215e24-6e08-4751-8929-d6c3cc3ec66e` → **200**

```json
{
  "found": []
}
```

Done: request 1b1047ee-1f02-4d32-a32c-edc1b05709fd — order afcd5b2a-da99-4db5-92d4-8d60460ab628 found by its id.

`GET /api/rider/v1/orders/afcd5b2a-da99-4db5-92d4-8d60460ab628` → **200**

```json
{
  "id": "afcd5b2a-da99-4db5-92d4-8d60460ab628",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b83edce0-6c41-4651-b22e-1dd898fb204c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:28:07.927621Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/afcd5b2a-da99-4db5-92d4-8d60460ab628/cancel` → **200**

```json
{
  "command_id": "0ca61e4d-0b77-47f7-89bc-45105b6a085b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "afcd5b2a-da99-4db5-92d4-8d60460ab628",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b83edce0-6c41-4651-b22e-1dd898fb204c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:28:07.927621Z",
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
  "phone": "+380632220269",
  "device_ref": "sandbox-10659"
}
```

```json
{
  "challenge_id": "29b113e9-f1fe-4d6c-8374-621829ec05f9",
  "expires_at": "2026-10-30T13:33:10.4787623Z",
  "resend_available_at": "2026-10-30T13:28:11.4787623Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632220269` → **200**

```json
{
  "phone": "+380632220269",
  "audience": "CLIENT",
  "code": "111167",
  "sent_at": "2026-10-30T13:28:10.481286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29b113e9-f1fe-4d6c-8374-621829ec05f9",
  "code": "111167",
  "device_ref": "sandbox-10659"
}
```

```json
{
  "session_id": "acb8c46f-2d8c-4731-ad3e-16727ed292c2",
  "subject": {
    "type": "CLIENT",
    "id": "24d916eb-a9dd-4e6b-bd6b-4c2e9a506506"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNGQ5MTZlYi1hOWRkLTRlNmItYmQ2Yi00YzJlOWE1MDY1MDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3NzkwLCJpYXQiOjE3OTMzNjY4OTAsImp0aSI6Ijg3M2U1ZjAwLTRlNTQtNDM0OC04YjI5LTIzZmMwOGQ5ZjYzMiIsInNpZCI6ImFjYjhjNDZmLTJkOGMtNDczMS1hZDNlLTE2NzI3ZWQyOTJjMiJ9.mXA0kNFLNKjqIIxyHREc1Xd69LmrAIr9UAlFcooCPg8",
  "access_expires_at": "2026-10-30T13:43:10.777428819Z",
  "refresh_token": "FwgHvbhtA7JNww-HXqWMFkoe4MR43C_D1-cB8buNuKY",
  "refresh_expires_at": "2026-11-29T13:28:10.776875008Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "7a8c5d25-3d06-4915-b5dd-037997b66f32",
  "expires_at": "2026-10-30T13:33:13.050396216Z",
  "resend_available_at": "2026-10-30T13:28:14.050396216Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632220269` → **200**

```json
{
  "phone": "+380632220269",
  "audience": "CLIENT",
  "code": "648510",
  "sent_at": "2026-10-30T13:28:13.052749667Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "2f48a35b-6519-4ab8-bd1b-4cc0f0988b38",
  "challenge_id": "7a8c5d25-3d06-4915-b5dd-037997b66f32",
  "otp_code": "648510"
}
```

```json
{
  "id": "1e65deec-2556-4507-afb7-413c78056247",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:13.341532Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/1e65deec-2556-4507-afb7-413c78056247` → **200**

```json
{
  "id": "1e65deec-2556-4507-afb7-413c78056247",
  "state": "PENDING",
  "created_at": "2026-10-30T13:28:13.341532Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1e65deec-2556-4507-afb7-413c78056247` → **200**

```json
{
  "id": "1e65deec-2556-4507-afb7-413c78056247",
  "state": "READY",
  "created_at": "2026-10-30T13:28:13.341532Z",
  "ready_at": "2026-10-30T13:28:13.786191Z",
  "expires_at": "2026-11-06T13:28:13.786191Z",
  "size_bytes": 1030
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/1e65deec-2556-4507-afb7-413c78056247/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634287454",
  "device_ref": "sandbox-28483"
}
```

```json
{
  "challenge_id": "c4d2b70f-77d2-4335-be28-d07348c8da47",
  "expires_at": "2026-10-30T13:33:15.171459845Z",
  "resend_available_at": "2026-10-30T13:28:16.171459845Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634287454` → **200**

```json
{
  "phone": "+380634287454",
  "audience": "CLIENT",
  "code": "266839",
  "sent_at": "2026-10-30T13:28:15.175109565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c4d2b70f-77d2-4335-be28-d07348c8da47",
  "code": "266839",
  "device_ref": "sandbox-28483"
}
```

```json
{
  "session_id": "3060bfd2-1806-43c0-84d1-9f889ad78043",
  "subject": {
    "type": "CLIENT",
    "id": "9aa03d2b-e5f5-4d3e-aa4f-d71de470429f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YWEwM2QyYi1lNWY1LTRkM2UtYWE0Zi1kNzFkZTQ3MDQyOWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3Nzk1LCJpYXQiOjE3OTMzNjY4OTUsImp0aSI6ImFiNzQ2Y2MzLTQxMjYtNDhkNi1hZjgyLTY3MzMwYmY1ODQwNyIsInNpZCI6IjMwNjBiZmQyLTE4MDYtNDNjMC04NGQxLTlmODg5YWQ3ODA0MyJ9.KdFVr09jDtwNbJxOkSVTwwRxq2K5EYhbvr-RhOEVOQs",
  "access_expires_at": "2026-10-30T13:43:15.472640115Z",
  "refresh_token": "IhuVbR51A2Q1bbiI7Zi_CfhyyPrlXxaFARclxQHU1nQ",
  "refresh_expires_at": "2026-11-29T13:28:15.472113295Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/1e65deec-2556-4507-afb7-413c78056247/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/1e65deec-2556-4507-afb7-413c78056247/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "fa64fbf2-57e2-4860-87cd-71e20713d71b"
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
  "session_id": "fffd9dbb-d010-4ec8-8da3-effa38231c4c",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc3OTYsImlhdCI6MTc5MzM2Njg5NiwianRpIjoiNTY5Njg0NjUtMDAyNC00NjhmLTljOWItZTliNWExMDliYTYxIiwic2lkIjoiZmZmZDlkYmItZDAxMC00ZWM4LThkYTMtZWZmYTM4MjMxYzRjIn0.94E1WuTnP-qXNuFfleZW0lF8SUHPfNWM08xQoPcgpi8",
  "access_expires_at": "2026-10-30T13:43:16.280955419Z",
  "refresh_token": "EY9SicJgMvjvogvPArtvotTgx3fQJM8Z3HK4fKnt7c0",
  "refresh_expires_at": "2026-10-31T01:28:16.280395185Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "24d916eb-a9dd-4e6b-bd6b-4c2e9a506506",
  "session_id": "acb8c46f-2d8c-4731-ad3e-16727ed292c2",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/24d916eb-a9dd-4e6b-bd6b-4c2e9a506506/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "1e65deec-2556-4507-afb7-413c78056247",
      "state": "READY",
      "created_at": "2026-10-30T13:28:13.341532Z",
      "ready_at": "2026-10-30T13:28:13.786191Z",
      "expires_at": "2026-11-06T13:28:13.786191Z",
      "size_bytes": 1030
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
  "device_ref": "sandbox-17729"
}
```

```json
{
  "challenge_id": "40ff0edd-e53e-4355-a0ad-05d02dd6ad73",
  "expires_at": "2026-10-30T13:33:17.08235106Z",
  "resend_available_at": "2026-10-30T13:28:18.08235106Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "663318",
  "sent_at": "2026-10-30T13:28:17.085378913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40ff0edd-e53e-4355-a0ad-05d02dd6ad73",
  "code": "663318",
  "device_ref": "sandbox-17729"
}
```

```json
{
  "session_id": "e4f1055a-2eaf-4ecb-8ea1-509eabfaeacb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzc5NywiaWF0IjoxNzkzMzY2ODk3LCJqdGkiOiI5NDBjODZkZC1lODg0LTQxYzAtODQ2NC1jNmUxZWU2NjAxZjMiLCJzaWQiOiJlNGYxMDU1YS0yZWFmLTRlY2ItOGVhMS01MDllYWJmYWVhY2IifQ.SKT2qLHhZOFmJNdw4Q1MfR92vEURu7oONktGGCqISPU",
  "access_expires_at": "2026-10-30T13:43:17.380035334Z",
  "refresh_token": "_BuEJUQSliq6Asb2r8ZW9jLTv5HfZSd1zGlSP_4gdW8",
  "refresh_expires_at": "2026-11-29T13:28:17.379493625Z",
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
  "device_ref": "sandbox-1405"
}
```

```json
{
  "challenge_id": "86d2c07c-8bb1-4f4d-bd13-6a169282e417",
  "expires_at": "2026-10-30T13:33:17.935502943Z",
  "resend_available_at": "2026-10-30T13:28:18.935502943Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "170084",
  "sent_at": "2026-10-30T13:28:17.93786605Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86d2c07c-8bb1-4f4d-bd13-6a169282e417",
  "code": "170084",
  "device_ref": "sandbox-1405"
}
```

```json
{
  "session_id": "e91f8890-ee84-4601-963f-706f3da97fa9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzc5OCwiaWF0IjoxNzkzMzY2ODk4LCJqdGkiOiJhYjMxOGEwMi0yZmI4LTQ4MzMtODE2NS1lYzNmMmU2Y2FlMTQiLCJzaWQiOiJlOTFmODg5MC1lZTg0LTQ2MDEtOTYzZi03MDZmM2RhOTdmYTkifQ.ezGFURHa2PRdpL9cKJbbzXKD9EkH_3INoFfFk0SVcIw",
  "access_expires_at": "2026-10-30T13:43:18.232551612Z",
  "refresh_token": "xhAPcY3SZSSRAGAo3lyl08IN82PXASbZQZsneUjwXtA",
  "refresh_expires_at": "2026-11-29T13:28:18.231976057Z",
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
  "command_id": "551792c2-d725-488a-a6f8-e9421f0dbf85",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:28:18Z",
    "sequence": 1793366898803
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8cb6a7bd-2fa6-454e-ade3-4df476fb7b7b",
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
  "last_heartbeat_at": "2026-10-30T13:28:18.820892Z",
  "last_location_at": "2026-10-30T13:28:18.820892Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-22926"
}
```

```json
{
  "challenge_id": "b6e87498-dd46-4ffc-9401-b1a8e748165e",
  "expires_at": "2026-10-30T13:33:19.104151407Z",
  "resend_available_at": "2026-10-30T13:28:20.104151407Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "345895",
  "sent_at": "2026-10-30T13:28:19.107152306Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b6e87498-dd46-4ffc-9401-b1a8e748165e",
  "code": "345895",
  "device_ref": "sandbox-22926"
}
```

```json
{
  "session_id": "2c125671-7e0b-417b-8b97-8294f1377490",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzc5OSwiaWF0IjoxNzkzMzY2ODk5LCJqdGkiOiJkMzkwNzA0Zi0xMzRiLTQ0ZWEtOWJiZC05YzU3ZmFhYjVjNDMiLCJzaWQiOiIyYzEyNTY3MS03ZTBiLTQxN2ItOGI5Ny04Mjk0ZjEzNzc0OTAifQ.XHx0MlhPfIuBLDzl3FV01GRFUv2cyUiqlPwW7q8Kaec",
  "access_expires_at": "2026-10-30T13:43:19.404620137Z",
  "refresh_token": "i6VpMHiSXXeT41DZAZNOmMuOimJA4CKHenszzzodobU",
  "refresh_expires_at": "2026-11-29T13:28:19.404086727Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4fb98646-1efe-446c-a917-41c88214e67f",
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
  "last_heartbeat_at": "2026-10-30T13:24:29.730309Z",
  "last_location_at": "2026-10-30T13:24:29.730309Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb98646-1efe-446c-a917-41c88214e67f/handover` → **200**

```json
{
  "command_id": "fcd0321f-9102-40cb-97e2-fe1abde446f6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4fb98646-1efe-446c-a917-41c88214e67f",
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
  "last_heartbeat_at": "2026-10-30T13:24:29.730309Z",
  "last_location_at": "2026-10-30T13:24:29.730309Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4fb98646-1efe-446c-a917-41c88214e67f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:28:20Z",
    "sequence": 1793366900228
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4fb98646-1efe-446c-a917-41c88214e67f",
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
  "last_heartbeat_at": "2026-10-30T13:28:20.244761Z",
  "last_location_at": "2026-10-30T13:28:20.244761Z",
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
  "session_id": "9e97556d-b8eb-4188-b487-e5624846f53c",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MDAsImlhdCI6MTc5MzM2NjkwMCwianRpIjoiOWY4ZGQ5OWYtNmY3Yy00MDRkLWE5MzgtZmE3ODEyM2ExYjAyIiwic2lkIjoiOWU5NzU1NmQtYjhlYi00MTg4LWI0ODctZTU2MjQ4NDZmNTNjIn0.SNWZr5NXLBVpAi9pDEoMbqcKXIGCQMa2U6Ub3HNFINk",
  "access_expires_at": "2026-10-30T13:43:20.799307317Z",
  "refresh_token": "0CqSudNUNOPmPT4GJ6K8QXuIUS9Uv4GM-6aMPAaDmjA",
  "refresh_expires_at": "2026-10-31T01:28:20.798770866Z",
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
  "session_id": "22a0fca3-510f-45a7-8176-b6e27bc905fe",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MDEsImlhdCI6MTc5MzM2NjkwMSwianRpIjoiNGY2ZTg2NzQtZWM3YS00NWU0LWJlMzUtZjRiMjZmYjRkOTlmIiwic2lkIjoiMjJhMGZjYTMtNTEwZi00NWE3LTgxNzYtYjZlMjdiYzkwNWZlIn0._qVW6UNJrSfLAOKtNGYBZuQt-5Ebxs741hFCSKYq8Cs",
  "access_expires_at": "2026-10-30T13:43:21.357197947Z",
  "refresh_token": "NK7UNaEyTVZhPKpluDyfdrHd5tqJ2CTOCpAtOBZNabs",
  "refresh_expires_at": "2026-10-31T01:28:21.356658805Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689512301",
  "device_ref": "sandbox-19205"
}
```

```json
{
  "challenge_id": "f3f4bb7c-b1bd-4149-b2ff-cfc144c26e1f",
  "expires_at": "2026-10-30T13:33:21.62294884Z",
  "resend_available_at": "2026-10-30T13:28:22.62294884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689512301` → **200**

```json
{
  "phone": "+380689512301",
  "audience": "CLIENT",
  "code": "143228",
  "sent_at": "2026-10-30T13:28:21.626245831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3f4bb7c-b1bd-4149-b2ff-cfc144c26e1f",
  "code": "143228",
  "device_ref": "sandbox-19205"
}
```

```json
{
  "session_id": "671ac96d-0e03-4c43-9b09-e99339ee0697",
  "subject": {
    "type": "CLIENT",
    "id": "76c20aa1-f85c-4c9d-82c3-360717bc7fee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmMyMGFhMS1mODVjLTRjOWQtODJjMy0zNjA3MTdiYzdmZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODAxLCJpYXQiOjE3OTMzNjY5MDEsImp0aSI6ImQ0ZDFhZDZkLTYxMGYtNGZmMy1iZWZhLWFjODZlOGNmNzZlYiIsInNpZCI6IjY3MWFjOTZkLTBlMDMtNGM0My05YjA5LWU5OTMzOWVlMDY5NyJ9.FVrpB1N9l7e7zRG6DbOOO9vJldpCFLxy6FQgYuAy33M",
  "access_expires_at": "2026-10-30T13:43:21.913985018Z",
  "refresh_token": "X7EBOv9VnBgIA2-yxcwNGIavhaECvj1vg_RjxeDEBkc",
  "refresh_expires_at": "2026-11-29T13:28:21.913486871Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c197141e-063c-41c3-9b1f-cec3c04153d1",
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
  "id": "a9035b95-44ef-4629-a5f6-a19066667bda",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:22.191923Z",
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
  "command_id": "d191ffe8-f46d-439d-9bbc-51c2edf3c26a",
  "quote_id": "a9035b95-44ef-4629-a5f6-a19066667bda",
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
  "id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "76c20aa1-f85c-4c9d-82c3-360717bc7fee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:28:22.470745Z",
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
    "id": "b5d65698-ac5b-4d2b-abe5-77cc9d0d0b89",
    "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
    "expires_at": "2026-10-30T13:28:37.473739Z",
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

`POST /api/driver/v1/offers/b5d65698-ac5b-4d2b-abe5-77cc9d0d0b89/reject` → **204**

```json
{
  "command_id": "d43358b0-20b5-4023-824e-582d44137156"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7d261fc2-05ca-421d-b38c-787f92d2ca35",
    "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
    "expires_at": "2026-10-30T13:28:38.045611Z",
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

`POST /api/driver/v1/offers/7d261fc2-05ca-421d-b38c-787f92d2ca35/accept` → **200**

```json
{
  "command_id": "b534599b-20ec-486b-b617-d0defdbb9f8b"
}
```

```json
{
  "id": "f9cd6b4f-9578-42a7-979f-2f17ce28f5d3",
  "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0f27e509-c3f0-482f-8574-93c9ea293d11",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/bc11a55e-d13f-4a49-a76b-def604525d0e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:28:22.471244Z",
      "actor": {
        "type": "CLIENT",
        "id": "76c20aa1-f85c-4c9d-82c3-360717bc7fee",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
        "quote_id": "a9035b95-44ef-4629-a5f6-a19066667bda",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c2e6d034-ee53-4246-a24d-43bdbdda2f42"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:28:22.473028Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
        "attempt_id": "cce68f25-472a-4f3b-a7b2-45343ba276c4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c2e6d034-ee53-4246-a24d-43bdbdda2f42"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:28:22.475799Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b5d65698-ac5b-4d2b-abe5-77cc9d0d0b89",
        "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c2e6d034-ee53-4246-a24d-43bdbdda2f42"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T13:28:23.044414Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b5d65698-ac5b-4d2b-abe5-77cc9d0d0b89",
        "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e"
      },
      "correlation_id": "611f08ef-fb7a-485b-9b0b-01cbcbd08be8"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order bc11a55e-d13f-4a49-a76b-def604525d0e — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/bc11a55e-d13f-4a49-a76b-def604525d0e` → **200**

```json
{
  "id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "76c20aa1-f85c-4c9d-82c3-360717bc7fee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "f9cd6b4f-9578-42a7-979f-2f17ce28f5d3",
    "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0f27e509-c3f0-482f-8574-93c9ea293d11",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:28:22.470745Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bc11a55e-d13f-4a49-a76b-def604525d0e/cancel` → **200**

```json
{
  "command_id": "a083471a-174d-4856-922f-be2be479af8a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "76c20aa1-f85c-4c9d-82c3-360717bc7fee",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "f9cd6b4f-9578-42a7-979f-2f17ce28f5d3",
    "order_id": "bc11a55e-d13f-4a49-a76b-def604525d0e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0f27e509-c3f0-482f-8574-93c9ea293d11",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:28:22.470745Z",
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
  "session_id": "8cb6a7bd-2fa6-454e-ade3-4df476fb7b7b",
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
  "last_heartbeat_at": "2026-10-30T13:28:18.820892Z",
  "last_location_at": "2026-10-30T13:28:18.820892Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8cb6a7bd-2fa6-454e-ade3-4df476fb7b7b/close` → **200**

```json
{
  "command_id": "dec30682-bf7d-44c2-821f-5e822388338c",
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
  "session_id": "4fb98646-1efe-446c-a917-41c88214e67f",
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
  "last_heartbeat_at": "2026-10-30T13:28:20.244761Z",
  "last_location_at": "2026-10-30T13:28:20.244761Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4fb98646-1efe-446c-a917-41c88214e67f/close` → **200**

```json
{
  "command_id": "73bffaee-c460-4b10-94da-2493125e3924",
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
  "session_id": "ae2d0b96-caa8-4a04-bfe7-6c2270916f9a",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4MDUsImlhdCI6MTc5MzM2NjkwNSwianRpIjoiZmIyOTM4YTItNzcwMC00MmY2LTk0ZmQtYWY4NDYyZWJmZmM4Iiwic2lkIjoiYWUyZDBiOTYtY2FhOC00YTA0LWJmZTctNmMyMjcwOTE2ZjlhIn0.QxYoqjMsVmMiRn4ybZuTu2PusLjA65sEkYUu5d7T-28",
  "access_expires_at": "2026-10-30T13:43:25.948188652Z",
  "refresh_token": "CUEi4RwkAa3_fADn5x-4MOtfDQa5NY7LQSn8THJZoj8",
  "refresh_expires_at": "2026-10-31T01:28:25.947642478Z",
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
  "command_id": "e1ca3cd3-4858-400f-9d76-07124c3906eb",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T13:28:26.516592Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "7bc4d9ce-d3c1-4247-ad59-523b8bc610fe",
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
  "correlation_id": "7e63f3a8-715a-49e6-8a47-4ea28b627152",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "7a0cd4c9-5788-4650-8d60-c3429f4b1b3f",
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
  "correlation_id": "036b5663-4efd-4fff-8e7f-2281a127d858"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638635773",
  "device_ref": "sandbox-15010"
}
```

```json
{
  "challenge_id": "9378af65-6afc-4a15-9fc8-5ef472b06494",
  "expires_at": "2026-10-30T13:33:27.352089078Z",
  "resend_available_at": "2026-10-30T13:28:28.352089078Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638635773` → **200**

```json
{
  "phone": "+380638635773",
  "audience": "CLIENT",
  "code": "587617",
  "sent_at": "2026-10-30T13:28:27.355425166Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9378af65-6afc-4a15-9fc8-5ef472b06494",
  "code": "587617",
  "device_ref": "sandbox-15010"
}
```

```json
{
  "session_id": "1ea9d8ae-09e8-4ce6-88cf-2080cfe0f6fe",
  "subject": {
    "type": "CLIENT",
    "id": "ca1429ba-c3b7-4587-a777-6fc6d3c65ce7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTE0MjliYS1jM2I3LTQ1ODctYTc3Ny02ZmM2ZDNjNjVjZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODA3LCJpYXQiOjE3OTMzNjY5MDcsImp0aSI6IjBmNWRmNmI1LWI4YmYtNDRlMy05OWMwLTUxNmM1NWZmMjQ3OSIsInNpZCI6IjFlYTlkOGFlLTA5ZTgtNGNlNi04OGNmLTIwODBjZmUwZjZmZSJ9.hXK-26Tu6nQbiZ4UWBsbhMBh689hxP41hYB_hdLWjcg",
  "access_expires_at": "2026-10-30T13:43:27.641048993Z",
  "refresh_token": "TPyYdljkECTI6ulLR12Dg0NxrBYCI3KRBJRQmlxs1Y4",
  "refresh_expires_at": "2026-11-29T13:28:27.640573009Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4d9b8ece-09ab-4ef5-983d-3d805f05aa3f",
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
  "id": "ed46433e-ea7f-4b02-bf2a-5947df8b64c1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:27.917794Z",
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
  "command_id": "acf2129f-329a-4c28-b68a-98e0df99a774",
  "quote_id": "ed46433e-ea7f-4b02-bf2a-5947df8b64c1",
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
  "correlation_id": "ea551dc5-1015-4aaf-a0a0-a287b5e33128"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "87011ca1-18dc-4979-9ce1-30d889fb3b7a",
  "quote_id": "ed46433e-ea7f-4b02-bf2a-5947df8b64c1",
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
  "id": "c7ee809a-1bb1-4908-b4bf-8e370feb0240",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ca1429ba-c3b7-4587-a777-6fc6d3c65ce7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:28:28.498802Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c7ee809a-1bb1-4908-b4bf-8e370feb0240/cancel` → **200**

```json
{
  "command_id": "568dca1a-0480-466c-b758-43247116a99c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c7ee809a-1bb1-4908-b4bf-8e370feb0240",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ca1429ba-c3b7-4587-a777-6fc6d3c65ce7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:28:28.498802Z",
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
  "command_id": "d4e42932-0163-467e-9053-8c2f43449293",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T13:28:29.09903Z"
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
      "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T13:28:29.09903Z"
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
  "device_ref": "sandbox-5427"
}
```

```json
{
  "challenge_id": "a1478b6f-a3c8-4447-9fe2-21b633dc4a4a",
  "expires_at": "2026-10-30T13:33:29.959857177Z",
  "resend_available_at": "2026-10-30T13:28:30.959857177Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "604916",
  "sent_at": "2026-10-30T13:28:29.963522446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1478b6f-a3c8-4447-9fe2-21b633dc4a4a",
  "code": "604916",
  "device_ref": "sandbox-5427"
}
```

```json
{
  "session_id": "be79caa0-cb62-4ed9-b8dd-d293e9648459",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2NzgxMCwiaWF0IjoxNzkzMzY2OTEwLCJqdGkiOiIzNmY0MjIxMy0wMTFiLTQyMGEtOWFiMS03OTQ4M2I3OTI4Y2UiLCJzaWQiOiJiZTc5Y2FhMC1jYjYyLTRlZDktYjhkZC1kMjkzZTk2NDg0NTkifQ.7JAJz3LT6T8GiL7TUzBbrPtUGISmyxOqpgkSdZnPF9M",
  "access_expires_at": "2026-10-30T13:43:30.260115721Z",
  "refresh_token": "YXmbrgPPdW2HwFHy05A_4UhWfRgOsbargUp8ElayZ9Q",
  "refresh_expires_at": "2026-11-29T13:28:30.259583075Z",
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
  "command_id": "2f0c7a81-a045-4681-9ffd-b9f6be8468a3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:28:30Z",
    "sequence": 1793366910804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:28:30.820184Z",
  "last_location_at": "2026-10-30T13:28:30.820184Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676372935",
  "device_ref": "sandbox-12943"
}
```

```json
{
  "challenge_id": "ebd96f53-7530-49b6-ad46-e8960ee150d6",
  "expires_at": "2026-10-30T13:33:31.098414626Z",
  "resend_available_at": "2026-10-30T13:28:32.098414626Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676372935` → **200**

```json
{
  "phone": "+380676372935",
  "audience": "CLIENT",
  "code": "761357",
  "sent_at": "2026-10-30T13:28:31.101958413Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ebd96f53-7530-49b6-ad46-e8960ee150d6",
  "code": "761357",
  "device_ref": "sandbox-12943"
}
```

```json
{
  "session_id": "73ae5e21-cee1-4110-bb4f-9fa017306e3f",
  "subject": {
    "type": "CLIENT",
    "id": "c75be159-50bb-4d51-a126-d725d6c427a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzViZTE1OS01MGJiLTRkNTEtYTEyNi1kNzI1ZDZjNDI3YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3ODExLCJpYXQiOjE3OTMzNjY5MTEsImp0aSI6IjljNzkxM2JiLTQ2OWMtNGI5YS05MWEzLTVjMWJmYWQyZTIzZCIsInNpZCI6IjczYWU1ZTIxLWNlZTEtNDExMC1iYjRmLTlmYTAxNzMwNmUzZiJ9.77SeNPyfyRLWKrUE4skiKoMyg40-gBpC9t_Nd_2acXc",
  "access_expires_at": "2026-10-30T13:43:31.396378227Z",
  "refresh_token": "FjgBO7RrgGehby50Ur7p4ADNXXd4XD6BywjBxUaeoAU",
  "refresh_expires_at": "2026-11-29T13:28:31.395867751Z",
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
  "command_id": "776b8070-f8ae-4d3c-87f1-1b61fefa4162",
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
  "id": "cc1049d7-0339-43bf-a2ce-06948fa8b2a1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:33:31.935909Z",
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
  "command_id": "6cf71295-8245-483b-b943-5131990f5c67",
  "platform": "ANDROID",
  "token": "sandbox-driver-7289a242-c3d7-4ab8-83dc-a5683855f421"
}
```

```json
{
  "id": "508d26ba-ea88-4be8-a779-2cc7a5bd7881",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:28:32.221022Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "959fef51-414d-46c4-9f04-fc77425f1b6c",
  "platform": "ANDROID",
  "token": "sandbox-rider-49aa7f5f-d840-4155-9f0a-4cd6bdde29d8"
}
```

```json
{
  "id": "58012f88-3e42-4d2e-a930-f453d8a6f2ad",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T13:28:32.501756Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c3f44e6f-67ad-4671-b409-d0e3cda4faa5",
  "quote_id": "cc1049d7-0339-43bf-a2ce-06948fa8b2a1",
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
  "id": "4713149c-3690-491a-b43d-6582845b439c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c75be159-50bb-4d51-a126-d725d6c427a7",
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
  "created_at": "2026-10-30T13:28:32.780433Z",
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
    "id": "3196ad00-fa34-4503-b8d1-150e4ea6dcea",
    "order_id": "4713149c-3690-491a-b43d-6582845b439c",
    "expires_at": "2026-10-30T13:28:47.78346Z",
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

`POST /api/driver/v1/offers/3196ad00-fa34-4503-b8d1-150e4ea6dcea/accept` → **200**

```json
{
  "command_id": "2bac276c-18e7-4d97-8170-a4411910b4cf"
}
```

```json
{
  "id": "bdd04428-f1bd-4e36-88e5-bcd29c2f906c",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e396d4bf-8245-438e-a7db-3a7ef61e46de",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:28:32.758Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T13:28:32.758Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:28:33.854802717Z",
    "token_suffix": "55f421",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "3418c418-6ca1-4cb9-abed-fc1943f1414f",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "4713149c-3690-491a-b43d-6582845b439c",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676372935&after=2026-10-30T13:28:32.758Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380676372935&after=2026-10-30T13:28:32.758Z` → **200**

```json
[
  {
    "at": "2026-10-30T13:28:34.859883746Z",
    "token_suffix": "de29d8",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "de387e18-a8e1-430a-ba6c-30434a3b7981",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "4713149c-3690-491a-b43d-6582845b439c",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4713149c-3690-491a-b43d-6582845b439c/messages` → **201**

```json
{
  "command_id": "906fbfe4-2bbb-4d95-af26-da1ce037d090",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "8d7a13c2-6a6c-4fbd-b6bd-56e838e97036",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T13:28:35.758202238Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e396d4bf-8245-438e-a7db-3a7ef61e46de",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "assignment_id": "bdd04428-f1bd-4e36-88e5-bcd29c2f906c",
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

`POST /api/driver/v1/trips/e396d4bf-8245-438e-a7db-3a7ef61e46de/messages` → **201**

```json
{
  "command_id": "215d2cb5-ba75-40ea-ab1f-7cb382117213",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "4a5e1e46-a79b-4156-a005-c1f11eee95c3",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T13:28:36.296904448Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4713149c-3690-491a-b43d-6582845b439c/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/e396d4bf-8245-438e-a7db-3a7ef61e46de/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676372935"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/3f55ce04-c212-4223-a021-02bb6db92211/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:28:37Z",
    "sequence": 1793366917128
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:28:37.144824Z",
  "last_location_at": "2026-10-30T13:28:37.144824Z",
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
  "id": "e396d4bf-8245-438e-a7db-3a7ef61e46de",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "assignment_id": "bdd04428-f1bd-4e36-88e5-bcd29c2f906c",
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

`POST /api/driver/v1/trips/e396d4bf-8245-438e-a7db-3a7ef61e46de/arrive` → **200**

```json
{
  "command_id": "a563fbb9-29f7-464c-addb-26587ff90446",
  "expected_version": 0
}
```

```json
{
  "id": "e396d4bf-8245-438e-a7db-3a7ef61e46de",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "assignment_id": "bdd04428-f1bd-4e36-88e5-bcd29c2f906c",
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
  "arrived_at": "2026-10-30T13:28:37.692826Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e396d4bf-8245-438e-a7db-3a7ef61e46de/start` → **200**

```json
{
  "command_id": "8dd3c0e8-1468-493a-87a3-c915d91a8fa3",
  "expected_version": 1
}
```

```json
{
  "id": "e396d4bf-8245-438e-a7db-3a7ef61e46de",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "assignment_id": "bdd04428-f1bd-4e36-88e5-bcd29c2f906c",
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
  "arrived_at": "2026-10-30T13:28:37.692826Z",
  "started_at": "2026-10-30T13:28:37.975535Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/3f55ce04-c212-4223-a021-02bb6db92211/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:29:26Z",
    "sequence": 1793366966280
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:29:26.297783Z",
  "last_location_at": "2026-10-30T13:29:26.297783Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/e396d4bf-8245-438e-a7db-3a7ef61e46de/complete` → **200**

```json
{
  "command_id": "abfe98ab-064d-4d08-ac4f-f7e62d174966",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:29:26Z",
  "cash_received": true
}
```

```json
{
  "id": "e396d4bf-8245-438e-a7db-3a7ef61e46de",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "assignment_id": "bdd04428-f1bd-4e36-88e5-bcd29c2f906c",
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
  "arrived_at": "2026-10-30T13:28:37.692826Z",
  "started_at": "2026-10-30T13:28:37.975535Z",
  "completed_at": "2026-10-30T13:29:26.583076Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4713149c-3690-491a-b43d-6582845b439c` → **200**

```json
{
  "id": "4713149c-3690-491a-b43d-6582845b439c",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c75be159-50bb-4d51-a126-d725d6c427a7",
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
    "id": "bdd04428-f1bd-4e36-88e5-bcd29c2f906c",
    "order_id": "4713149c-3690-491a-b43d-6582845b439c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e396d4bf-8245-438e-a7db-3a7ef61e46de",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:28:32.780433Z",
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
    "id": "4713149c-3690-491a-b43d-6582845b439c",
    "short_number": 14,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:28:32.780433Z",
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
    "id": "e396d4bf-8245-438e-a7db-3a7ef61e46de",
    "order_id": "4713149c-3690-491a-b43d-6582845b439c",
    "order_short_number": 14,
    "created_at": "2026-10-30T13:28:33.369655Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "a108448a-4b60-4075-9025-209c0ce3fba3",
    "order_id": "1ed8a469-b08d-475b-a64c-9803fef140c1",
    "order_short_number": 9,
    "created_at": "2026-10-30T13:25:50.809095Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "e1b8fcd3-163d-4430-8af1-10914c9b80cb",
    "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
    "order_short_number": 4,
    "created_at": "2026-10-30T13:24:18.735117Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "46b6dcf1-d18d-4182-8930-baa8f94dd6e8",
    "order_id": "75f837f2-d4d7-467d-badc-9377594df16a",
    "order_short_number": 2,
    "created_at": "2026-10-30T13:20:28.177061Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7a55e49d-4616-41ff-bf23-53a4f7e313cd",
    "order_id": "04c6a1a4-57e7-4fb3-9274-d506db05ea49",
    "order_short_number": 1,
    "created_at": "2026-10-30T13:20:18.781253Z",
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

`GET /api/rider/v1/orders/4713149c-3690-491a-b43d-6582845b439c/tip` → **200**

```json
{
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
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
  "available_until": "2026-10-31T13:29:26.583076Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/4713149c-3690-491a-b43d-6582845b439c/tip` → **201**

```json
{
  "command_id": "453792d8-3680-4e1d-b637-6db9f2f46c16",
  "amount_minor": 1100
}
```

```json
{
  "id": "7d32ab04-4fa3-4ba6-9387-aa0d54e6738e",
  "order_id": "4713149c-3690-491a-b43d-6582845b439c",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T13:29:31.55595Z"
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
  "session_id": "8305ee69-b1c4-4d87-ae20-32993c3999cf",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NzIsImlhdCI6MTc5MzM2Njk3MiwianRpIjoiZjBlYzZmODMtNmQwZi00MmFkLWJkYzMtZmI4YmJkMzE1NTdlIiwic2lkIjoiODMwNWVlNjktYjFjNC00ZDg3LWFlMjAtMzI5OTNjMzk5OWNmIn0.49ZAzcs3nVP6NNEOCEwo4-YvkG3KgzNok1t_BpImTMY",
  "access_expires_at": "2026-10-30T13:44:32.112149575Z",
  "refresh_token": "Mm7D7CZKtBZkHSsIEcAySttDokFQWE2VSa2197jP0B4",
  "refresh_expires_at": "2026-10-31T01:29:32.11090396Z",
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
          "PHONE": 1,
          "APP": 12
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
      "PHONE": 1,
      "APP": 12
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
  "generated_at": "2026-10-30T13:29:32.385821938Z"
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
  "generated_at": "2026-10-30T13:29:32.666566899Z"
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
  "session_id": "487b4a8b-5f81-41d0-813c-84473e88e5c0",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NzMsImlhdCI6MTc5MzM2Njk3MywianRpIjoiYTIwYTk2YzItOWMzNy00NzZjLWJlMTYtNTI3Yzc0YjFjNmNlIiwic2lkIjoiNDg3YjRhOGItNWY4MS00MWQwLTgxM2MtODQ0NzNlODhlNWMwIn0.yfV7aVyZsx8JiCVBPbWIza2EU0TOppommCYevdIkUA8",
  "access_expires_at": "2026-10-30T13:44:33.230082046Z",
  "refresh_token": "mt0IPwu3CkaDZGnKsqo9dys6YvusIyRLZ4VPWa9dKlY",
  "refresh_expires_at": "2026-10-31T01:29:33.229223145Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4713149c-3690-491a-b43d-6582845b439c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:28:32.780896Z",
      "actor": {
        "type": "CLIENT",
        "id": "c75be159-50bb-4d51-a126-d725d6c427a7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4713149c-3690-491a-b43d-6582845b439c",
        "quote_id": "cc1049d7-0339-43bf-a2ce-06948fa8b2a1",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c6ccacd2-4313-42b6-9efd-99196e692eb7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:28:32.782692Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4713149c-3690-491a-b43d-6582845b439c",
        "attempt_id": "268811fd-3f4a-4270-830e-6c9979283185",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c6ccacd2-4313-42b6-9efd-99196e692eb7"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:28:32.785491Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3196ad00-fa34-4503-b8d1-150e4ea6dcea",
        "order_id": "4713149c-3690-491a-b43d-6582845b439c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c6ccacd2-4313-42b6-9efd-99196e692eb7"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:28:33.37182Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3196ad00-fa34-4503-b8d1-150e4ea6dcea",
        "order_id": "4713149c-3690-491a-b43d-6582845b439c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "bdd04428-f1bd-4e36-88e5-bcd29c2f906c"
      },
      "correlation_id": "dbdb8e5b-f34b-4a7b-8dd0-377ec4d3e8ac"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T13:29:33.790432995Z",
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
      "last_location_at": "2026-10-30T13:29:26.297783Z",
      "order_id": null
    }
  ]
}
```

Done: order 4713149c-3690-491a-b43d-6582845b439c.

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
  "session_id": "fc6bc73e-bee2-462f-bab5-368d5ef2e8f0",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NzQsImlhdCI6MTc5MzM2Njk3NCwianRpIjoiN2MwMjI2NzYtZjkwMS00ZDk3LTliNDQtMDNkMmEyYThlM2EwIiwic2lkIjoiZmM2YmM3M2UtYmVlMi00NjJmLWJhYjUtMzY4ZDVlZjJlOGYwIn0.8ZcoVKaUrKts7AtvYzK1qOaKgjlFkEP8JdC6DHjTICw",
  "access_expires_at": "2026-10-30T13:44:34.367351671Z",
  "refresh_token": "asCckbi7QGZhdS_WujeTYSOULBDSlJxXxUaEPNRtB1Q",
  "refresh_expires_at": "2026-10-31T01:29:34.366738412Z",
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
  "command_id": "c8db0544-99c6-4810-b698-0c0b2fd82e69",
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
  "timestamp": "2026-10-30T13:29:35.000+0000",
  "channel": {
    "id": "1730052000.1253513236",
    "linkedid": "1730052000.1253513236",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672668586"
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
  "timestamp": "2026-10-30T13:29:35.000+0000",
  "channel": {
    "id": "1730052000.1253513236",
    "linkedid": "1730052000.1253513236",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672668586"
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
  "session_id": "4a730818-6a6f-4f90-b8c9-4917edc6085d",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjc4NzUsImlhdCI6MTc5MzM2Njk3NSwianRpIjoiZDljNjFhYjEtZDkxOC00MGUwLWJkZjktZTlmOWRlZTUzZDMzIiwic2lkIjoiNGE3MzA4MTgtNmE2Zi00ZjkwLWI4YzktNDkxN2VkYzYwODVkIn0.V4awZTj7-kzFoGXuMhJVtwt-9fh-ouT5RzEboB3bzWk",
  "access_expires_at": "2026-10-30T13:44:35.492354062Z",
  "refresh_token": "eeITPK9Hz0fuV0gtc2hB5m2Qhl0yzO7mQUSnC3SG_rs",
  "refresh_expires_at": "2026-10-31T01:29:35.491667881Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "ec6b853d-1c1e-4728-a74d-f6be49855ff7",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672668586",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T13:29:35Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/ec6b853d-1c1e-4728-a74d-f6be49855ff7/answer` → **200**

```json
{
  "command_id": "9a09a7ef-37bf-4a07-9efd-65ca711bdea0"
}
```

```json
{
  "id": "ec6b853d-1c1e-4728-a74d-f6be49855ff7",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672668586",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "order_ids": [],
  "started_at": "2026-10-30T13:29:35Z",
  "answered_at": "2026-10-30T13:29:36.050618Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1253513236",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "102a4496-724a-45d1-a74e-8069eec7479d",
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
  "id": "a4b3b745-8615-4fd5-a90c-421fa2fe953d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:34:36.349147Z",
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
  "command_id": "7cc4afb0-652f-453b-9d68-ca8d8e7b520f",
  "quote_id": "a4b3b745-8615-4fd5-a90c-421fa2fe953d",
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
    "phone": "+380672668586"
  },
  "call_id": "ec6b853d-1c1e-4728-a74d-f6be49855ff7"
}
```

```json
{
  "id": "d58d5ef5-bf39-46da-b744-05495ca716f8",
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
  "created_at": "2026-10-30T13:29:36.629487Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672668586"
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
    "id": "1730052000.1253513236",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ec6b853d-1c1e-4728-a74d-f6be49855ff7",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672668586",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [
        "d58d5ef5-bf39-46da-b744-05495ca716f8"
      ],
      "started_at": "2026-10-30T13:29:35Z",
      "answered_at": "2026-10-30T13:29:36.050618Z",
      "ended_at": "2026-10-30T13:29:36.934518Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "811248aa-c4b8-4598-b473-9d3a1f33c779",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673242193",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [],
      "started_at": "2026-10-30T13:24:07.772967Z",
      "answered_at": "2026-10-30T13:24:08.073569Z",
      "ended_at": "2026-10-30T13:24:08.377514Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:24:13.742155Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/d58d5ef5-bf39-46da-b744-05495ca716f8` → **200**

```json
{
  "id": "d58d5ef5-bf39-46da-b744-05495ca716f8",
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
  "created_at": "2026-10-30T13:29:36.629487Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672668586"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/d58d5ef5-bf39-46da-b744-05495ca716f8` → **200**

```json
{
  "id": "d58d5ef5-bf39-46da-b744-05495ca716f8",
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
  "created_at": "2026-10-30T13:29:36.629487Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672668586"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d58d5ef5-bf39-46da-b744-05495ca716f8/cancel` → **200**

```json
{
  "command_id": "faab1493-f358-421d-a815-868334537192",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d58d5ef5-bf39-46da-b744-05495ca716f8",
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
  "created_at": "2026-10-30T13:29:36.629487Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672668586"
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

Done: call ec6b853d-1c1e-4728-a74d-f6be49855ff7 with order d58d5ef5-bf39-46da-b744-05495ca716f8.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-24999"
}
```

```json
{
  "challenge_id": "f130cc97-4f90-4557-8d35-5694f2eee762",
  "expires_at": "2026-10-30T13:34:38.097189354Z",
  "resend_available_at": "2026-10-30T13:29:39.097189354Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "102851",
  "sent_at": "2026-10-30T13:29:38.100635253Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f130cc97-4f90-4557-8d35-5694f2eee762",
  "code": "102851",
  "device_ref": "sandbox-24999"
}
```

```json
{
  "session_id": "2c319f63-18ab-4bfb-854e-2811d8e694a3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2Nzg3OCwiaWF0IjoxNzkzMzY2OTc4LCJqdGkiOiI4Zjg2YTMwMi01ODE1LTQ0MzEtYTQ0ZS00YmM3YWZlM2RiZTQiLCJzaWQiOiIyYzMxOWY2My0xOGFiLTRiZmItODU0ZS0yODExZDhlNjk0YTMifQ.nYduoF0Q77nc1kN4PA1gBRchMp0eqPJXuAuxtpA5bRU",
  "access_expires_at": "2026-10-30T13:44:38.397244949Z",
  "refresh_token": "LfFBf_mU07PYWvrkCqepgx8mcWHq2UfNihZ7H7-_iPE",
  "refresh_expires_at": "2026-11-29T13:29:38.396559428Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:29:26.297783Z",
  "last_location_at": "2026-10-30T13:29:26.297783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3f55ce04-c212-4223-a021-02bb6db92211/handover` → **200**

```json
{
  "command_id": "8eb97548-8540-43ac-acfb-9a4cdead3cc1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:29:26.297783Z",
  "last_location_at": "2026-10-30T13:29:26.297783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 86 s to the next point)

`POST /api/driver/v1/work-sessions/3f55ce04-c212-4223-a021-02bb6db92211/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:05Z",
    "sequence": 1793367065269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:31:05.286916Z",
  "last_location_at": "2026-10-30T13:31:05.286916Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667636217",
  "device_ref": "sandbox-2296"
}
```

```json
{
  "challenge_id": "d89ea316-ccf6-4f72-b466-8635313a8d1f",
  "expires_at": "2026-10-30T13:36:05.56161766Z",
  "resend_available_at": "2026-10-30T13:31:06.56161766Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667636217` → **200**

```json
{
  "phone": "+380667636217",
  "audience": "CLIENT",
  "code": "088969",
  "sent_at": "2026-10-30T13:31:05.565340291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d89ea316-ccf6-4f72-b466-8635313a8d1f",
  "code": "088969",
  "device_ref": "sandbox-2296"
}
```

```json
{
  "session_id": "018e2ebf-5c86-402d-8b88-252005f3ba09",
  "subject": {
    "type": "CLIENT",
    "id": "2fda9eb8-3404-4bc0-ae39-eea1bb162453"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZmRhOWViOC0zNDA0LTRiYzAtYWUzOS1lZWExYmIxNjI0NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY3OTY1LCJpYXQiOjE3OTMzNjcwNjUsImp0aSI6IjNmNjc0NjgwLTA0ODctNGIzNC1iYzdhLTdjMjFhZmI5ZjNkZiIsInNpZCI6IjAxOGUyZWJmLTVjODYtNDAyZC04Yjg4LTI1MjAwNWYzYmEwOSJ9.qEe85H-3dlor7R8fNg8Se3fUZpdWUYevjllUMu3TKIQ",
  "access_expires_at": "2026-10-30T13:46:05.852427322Z",
  "refresh_token": "0A49R37SIrYsEFgIFJHG5fc7SkC3_yRA0pMK2wt4h6o",
  "refresh_expires_at": "2026-11-29T13:31:05.851861999Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3a37b689-ddec-4338-b684-cb0aa36b7263",
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
  "id": "69ef2ce9-cfbf-4af7-b485-28f3c44c7caf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:36:06.129774Z",
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
  "command_id": "680f0b70-d3b5-4003-a95e-aff52cb47fa8",
  "quote_id": "69ef2ce9-cfbf-4af7-b485-28f3c44c7caf",
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
  "id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2fda9eb8-3404-4bc0-ae39-eea1bb162453",
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
  "created_at": "2026-10-30T13:31:06.417006Z",
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
    "id": "b6f31c54-d9c1-492b-b49a-eb101d9c9d83",
    "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
    "expires_at": "2026-10-30T13:31:21.420736Z",
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

`POST /api/driver/v1/offers/b6f31c54-d9c1-492b-b49a-eb101d9c9d83/accept` → **200**

```json
{
  "command_id": "d431b0a2-f6c8-42ba-a097-a06d21a96f89"
}
```

```json
{
  "id": "6e73dca3-b7b4-469b-ae7e-ec857dc3903a",
  "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb3e42d0-5a99-47bc-b64c-aed6b62278cf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb3e42d0-5a99-47bc-b64c-aed6b62278cf",
  "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
  "assignment_id": "6e73dca3-b7b4-469b-ae7e-ec857dc3903a",
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

`POST /api/driver/v1/work-sessions/3f55ce04-c212-4223-a021-02bb6db92211/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:31:07Z",
    "sequence": 1793367067550
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:31:07.569216Z",
  "last_location_at": "2026-10-30T13:31:07.569216Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/fb3e42d0-5a99-47bc-b64c-aed6b62278cf/arrive` → **200**

```json
{
  "command_id": "3870e832-9ceb-4743-ae6a-78c136d318f0",
  "expected_version": 0
}
```

```json
{
  "id": "fb3e42d0-5a99-47bc-b64c-aed6b62278cf",
  "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
  "assignment_id": "6e73dca3-b7b4-469b-ae7e-ec857dc3903a",
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
  "arrived_at": "2026-10-30T13:31:07.849122Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fb3e42d0-5a99-47bc-b64c-aed6b62278cf/start` → **200**

```json
{
  "command_id": "e7d8c90c-8fbc-4b55-a75c-fb8607280d87",
  "expected_version": 1
}
```

```json
{
  "id": "fb3e42d0-5a99-47bc-b64c-aed6b62278cf",
  "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
  "assignment_id": "6e73dca3-b7b4-469b-ae7e-ec857dc3903a",
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
  "arrived_at": "2026-10-30T13:31:07.849122Z",
  "started_at": "2026-10-30T13:31:08.127538Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/3f55ce04-c212-4223-a021-02bb6db92211/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:32:07Z",
    "sequence": 1793367127425
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:32:07.441201Z",
  "last_location_at": "2026-10-30T13:32:07.441201Z",
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
  "device_ref": "sandbox-17741"
}
```

```json
{
  "challenge_id": "3ac547a2-3553-41e5-8863-503ed0be4133",
  "expires_at": "2026-10-30T13:37:07.712255836Z",
  "resend_available_at": "2026-10-30T13:32:08.712255836Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "372957",
  "sent_at": "2026-10-30T13:32:07.715001646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ac547a2-3553-41e5-8863-503ed0be4133",
  "code": "372957",
  "device_ref": "sandbox-17741"
}
```

```json
{
  "session_id": "6fe0c578-5179-44f2-94eb-94a45017409e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODAyOCwiaWF0IjoxNzkzMzY3MTI4LCJqdGkiOiJjOTlhNTg5Zi1hYjI5LTRkMzItYjc5Yi1kMjg3NzlhMjc1ODgiLCJzaWQiOiI2ZmUwYzU3OC01MTc5LTQ0ZjItOTRlYi05NGE0NTAxNzQwOWUifQ.Fw_sykSnNV90H25hpjDpz0mRAr0x0dhmkJsqa3wuciI",
  "access_expires_at": "2026-10-30T13:47:08.006459524Z",
  "refresh_token": "4raPgJ5HiI96r_bENrou0_eBRspEq0Hgdt24IFcz-bg",
  "refresh_expires_at": "2026-11-29T13:32:08.005822674Z",
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
  "command_id": "0a8a1e44-89c3-43f5-b4fa-e211bbc67c3c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:32:08Z",
    "sequence": 1793367128566
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "50c7f4a2-9dba-4eef-b986-293961002f7d",
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
  "last_heartbeat_at": "2026-10-30T13:32:08.581974Z",
  "last_location_at": "2026-10-30T13:32:08.581974Z",
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
  "session_id": "f794ac81-1010-42cc-b7d7-baa5b423d31b",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgwMjksImlhdCI6MTc5MzM2NzEyOSwianRpIjoiY2ZkNTVkZWYtOTNhOC00ODkzLTliMjYtZWI1NzNhNjExNTlmIiwic2lkIjoiZjc5NGFjODEtMTAxMC00MmNjLWI3ZDctYmFhNWI0MjNkMzFiIn0.4JCvZUIuMq60r-GA2oYMKLNxaIsrCZl05M7uQehQAow",
  "access_expires_at": "2026-10-30T13:47:09.142091027Z",
  "refresh_token": "osDM7A7qmP_6LGw3TfeOA16EM0ZAfV4uAOnajc_x2f0",
  "refresh_expires_at": "2026-10-31T01:32:09.141565598Z",
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
  "session_id": "2db865ab-29f0-4484-9044-65ebd68cb4b6",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgwMjksImlhdCI6MTc5MzM2NzEyOSwianRpIjoiNWMxNWJjMzctN2RmMi00MDZmLWJlMzYtNzliMjllZjliODdkIiwic2lkIjoiMmRiODY1YWItMjlmMC00NDg0LTkwNDQtNjVlYmQ2OGNiNGI2In0.WPPNyX5q2pet5MwOGyHhqnJt83Cv3cVwV_EwkXL2xHI",
  "access_expires_at": "2026-10-30T13:47:09.702424907Z",
  "refresh_token": "4NXMEERnJpMC4cm_RDSDwglJQnyf6QBy33yC52PQlGc",
  "refresh_expires_at": "2026-10-31T01:32:09.701831944Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/5210615c-dcf0-47d4-87fc-7a45c6ab117a` → **200**

```json
{
  "id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2fda9eb8-3404-4bc0-ae39-eea1bb162453",
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
    "id": "6e73dca3-b7b4-469b-ae7e-ec857dc3903a",
    "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "fb3e42d0-5a99-47bc-b64c-aed6b62278cf",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T13:31:06.417006Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5210615c-dcf0-47d4-87fc-7a45c6ab117a/interrupt` → **200**

```json
{
  "command_id": "35366e6f-5d98-4198-a4eb-9fdd63a13190",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "2fda9eb8-3404-4bc0-ae39-eea1bb162453",
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
      "id": "6e73dca3-b7b4-469b-ae7e-ec857dc3903a",
      "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "fb3e42d0-5a99-47bc-b64c-aed6b62278cf",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T13:31:06.417006Z",
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
    "id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "2fda9eb8-3404-4bc0-ae39-eea1bb162453",
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
    "id": "bd6fefd0-03f3-4175-af01-0deda841fb56",
    "order_id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
    "expires_at": "2026-10-30T13:32:25.285644Z",
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

`POST /api/driver/v1/offers/bd6fefd0-03f3-4175-af01-0deda841fb56/accept` → **200**

```json
{
  "command_id": "6cb274a3-0c22-4bf1-acd5-d7700a38ba08"
}
```

```json
{
  "id": "6235833b-cd25-47f7-9d49-e5c5973c9e8a",
  "order_id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "92f6f1cc-e393-4e4c-a9fa-02cb83af17ec",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "92f6f1cc-e393-4e4c-a9fa-02cb83af17ec",
  "order_id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
  "assignment_id": "6235833b-cd25-47f7-9d49-e5c5973c9e8a",
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
  "session_id": "50c7f4a2-9dba-4eef-b986-293961002f7d",
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
  "last_heartbeat_at": "2026-10-30T13:32:08.581974Z",
  "last_location_at": "2026-10-30T13:32:08.581974Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/50c7f4a2-9dba-4eef-b986-293961002f7d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:32:11Z",
    "sequence": 1793367131716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "50c7f4a2-9dba-4eef-b986-293961002f7d",
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
  "last_heartbeat_at": "2026-10-30T13:32:11.733025Z",
  "last_location_at": "2026-10-30T13:32:11.733025Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/92f6f1cc-e393-4e4c-a9fa-02cb83af17ec/arrive` → **200**

```json
{
  "command_id": "7a0b26ea-6d45-4a77-91f1-b338b9b32c34",
  "expected_version": 0
}
```

```json
{
  "id": "92f6f1cc-e393-4e4c-a9fa-02cb83af17ec",
  "order_id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
  "assignment_id": "6235833b-cd25-47f7-9d49-e5c5973c9e8a",
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
  "arrived_at": "2026-10-30T13:32:12.00978Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/92f6f1cc-e393-4e4c-a9fa-02cb83af17ec/start` → **200**

```json
{
  "command_id": "f67f792e-1d97-4332-9d04-2b181486b305",
  "expected_version": 1
}
```

```json
{
  "id": "92f6f1cc-e393-4e4c-a9fa-02cb83af17ec",
  "order_id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
  "assignment_id": "6235833b-cd25-47f7-9d49-e5c5973c9e8a",
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
  "arrived_at": "2026-10-30T13:32:12.00978Z",
  "started_at": "2026-10-30T13:32:12.30142Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/92f6f1cc-e393-4e4c-a9fa-02cb83af17ec/complete` → **200**

```json
{
  "command_id": "8cde903f-1788-413f-b3ab-29f1dc20559b",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:32:12Z"
}
```

```json
{
  "id": "92f6f1cc-e393-4e4c-a9fa-02cb83af17ec",
  "order_id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
  "assignment_id": "6235833b-cd25-47f7-9d49-e5c5973c9e8a",
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
  "arrived_at": "2026-10-30T13:32:12.00978Z",
  "started_at": "2026-10-30T13:32:12.30142Z",
  "completed_at": "2026-10-30T13:32:12.583369Z",
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
    "id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
    "short_number": 17,
    "status": "FULFILLED",
    "created_at": "2026-10-30T13:32:10.274025Z",
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
    "id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
    "short_number": 16,
    "status": "CANCELLED",
    "created_at": "2026-10-30T13:31:06.417006Z",
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

`GET /api/operator/v1/orders/5210615c-dcf0-47d4-87fc-7a45c6ab117a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T13:31:06.417693Z",
      "actor": {
        "type": "CLIENT",
        "id": "2fda9eb8-3404-4bc0-ae39-eea1bb162453",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
        "quote_id": "69ef2ce9-cfbf-4af7-b485-28f3c44c7caf",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "00c636e8-15d5-458e-a76d-919859a3d3bc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T13:31:06.419922Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
        "attempt_id": "936376b6-53d6-4e5b-b3fd-b35d95979dbf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "00c636e8-15d5-458e-a76d-919859a3d3bc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T13:31:06.423019Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b6f31c54-d9c1-492b-b49a-eb101d9c9d83",
        "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "00c636e8-15d5-458e-a76d-919859a3d3bc"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T13:31:06.986939Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b6f31c54-d9c1-492b-b49a-eb101d9c9d83",
        "order_id": "5210615c-dcf0-47d4-87fc-7a45c6ab117a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6e73dca3-b7b4-469b-ae7e-ec857dc3903a"
      },
      "correlation_id": "922f02e2-9829-4232-9a96-0b5edfb28c55"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/6c4d64ce-585a-4a25-882f-b78c7184913d/tip` → **200**

```json
{
  "order_id": "6c4d64ce-585a-4a25-882f-b78c7184913d",
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
  "available_until": "2026-10-31T13:32:12.583369Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/6c4d64ce-585a-4a25-882f-b78c7184913d/tip` → **409**

```json
{
  "command_id": "2ee515ce-0756-4113-9fcc-bd3a1eff0721",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/6c4d64ce-585a-4a25-882f-b78c7184913d/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e94eea2c-87ec-4fd6-9f7f-ceab366a1cb7"
}
```

Done: interrupted 5210615c-dcf0-47d4-87fc-7a45c6ab117a, follow-up 6c4d64ce-585a-4a25-882f-b78c7184913d.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3f55ce04-c212-4223-a021-02bb6db92211",
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
  "last_heartbeat_at": "2026-10-30T13:32:07.441201Z",
  "last_location_at": "2026-10-30T13:32:07.441201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3f55ce04-c212-4223-a021-02bb6db92211/close` → **200**

```json
{
  "command_id": "00fd393c-c72e-46cb-8456-4d4cac932270",
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
  "session_id": "50c7f4a2-9dba-4eef-b986-293961002f7d",
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
  "last_heartbeat_at": "2026-10-30T13:32:11.733025Z",
  "last_location_at": "2026-10-30T13:32:11.733025Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/50c7f4a2-9dba-4eef-b986-293961002f7d/close` → **200**

```json
{
  "command_id": "859a8541-7952-420f-9f39-71a2d44eb345",
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
  "session_id": "d7883a91-1f74-4b73-b4ae-0a3d502a91c2",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgwMzgsImlhdCI6MTc5MzM2NzEzOCwianRpIjoiYTRmMjcwNzQtNDdjZi00M2RjLWEzYTgtZjEwNDYxMzUyNTk3Iiwic2lkIjoiZDc4ODNhOTEtMWY3NC00YjczLWI0YWUtMGEzZDUwMmE5MWMyIn0.dLGc-KW7-61HVsnHtdBfw3jfl3LD9yX0oyzofRYlCyM",
  "access_expires_at": "2026-10-30T13:47:18.651087815Z",
  "refresh_token": "QQFaabWPfHwGKS3bJOxDFfXDB4_Vz7l8RsCvKYeLI9o",
  "refresh_expires_at": "2026-10-31T01:32:18.650608859Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "92d0d95d-0e8a-43a0-904a-013606ea63d9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:32:18Z"
}
```

```json
{
  "id": "4c7b9b47-f4d6-4cb3-b4be-5fecff625a52",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:32:18Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4c7b9b47-f4d6-4cb3-b4be-5fecff625a52/publish` → **200**

```json
{
  "command_id": "6a5f38cf-1824-4195-9737-d9721613458d",
  "expected_version": 0
}
```

```json
{
  "id": "4c7b9b47-f4d6-4cb3-b4be-5fecff625a52",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:32:19.207919Z",
  "published_at": "2026-10-30T13:32:19.207919Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "4c7b9b47-f4d6-4cb3-b4be-5fecff625a52",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T13:32:19.207919Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633969900",
  "device_ref": "sandbox-12482"
}
```

```json
{
  "challenge_id": "128f294f-4f47-43db-998f-6876ef70d5a0",
  "expires_at": "2026-10-30T13:37:19.75917919Z",
  "resend_available_at": "2026-10-30T13:32:20.75917919Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633969900` → **200**

```json
{
  "phone": "+380633969900",
  "audience": "CLIENT",
  "code": "070401",
  "sent_at": "2026-10-30T13:32:19.762331786Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "128f294f-4f47-43db-998f-6876ef70d5a0",
  "code": "070401",
  "device_ref": "sandbox-12482"
}
```

```json
{
  "session_id": "0c16ab94-3bae-4982-afb9-9b5d6285e6e3",
  "subject": {
    "type": "CLIENT",
    "id": "2c934194-753f-49b9-809c-41ff33ae6c0a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYzkzNDE5NC03NTNmLTQ5YjktODA5Yy00MWZmMzNhZTZjMGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MDQwLCJpYXQiOjE3OTMzNjcxNDAsImp0aSI6Ijc0YzAwOGE2LTYwYjktNGFlNi04ZTYyLTY3MWVjZjBjYmE0YiIsInNpZCI6IjBjMTZhYjk0LTNiYWUtNDk4Mi1hZmI5LTliNWQ2Mjg1ZTZlMyJ9.J85bKUnQug3bePFfFC8EV0hD-40SIUSx6FGwVuaqqJU",
  "access_expires_at": "2026-10-30T13:47:20.04424938Z",
  "refresh_token": "WpOX0z4whnykVhmp0cpPDcpJDWEaRCLSQvs-bLEegsI",
  "refresh_expires_at": "2026-11-29T13:32:20.043719588Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "4c7b9b47-f4d6-4cb3-b4be-5fecff625a52",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T13:32:19.207919Z",
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
  "command_id": "e874aab6-396b-4680-a155-05fdf62f7db9",
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
  "id": "e5dbe77c-2cce-493d-8edb-6f3690683df7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:37:20.590032Z",
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
  "command_id": "f56a9ced-e037-48a9-8032-b61832a05e72",
  "quote_id": "e5dbe77c-2cce-493d-8edb-6f3690683df7",
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
  "correlation_id": "3f1e0aae-b71b-4b2d-b0a3-b768b23835f5"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "576a28fc-b5e5-4353-8151-dd7b1e8938dc",
  "version_id": "4c7b9b47-f4d6-4cb3-b4be-5fecff625a52",
  "language": "uk"
}
```

```json
{
  "version_id": "4c7b9b47-f4d6-4cb3-b4be-5fecff625a52",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T13:32:21.169551Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b525c21-595a-4ac8-8183-8a874b8873ff",
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
  "id": "3bd1ad6b-afb8-4061-b8ac-d5293f2038e2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:37:21.443534Z",
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
  "command_id": "50d14403-672d-402b-87aa-f1afe4ab0c44",
  "quote_id": "3bd1ad6b-afb8-4061-b8ac-d5293f2038e2",
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
  "id": "04245966-aaae-4879-abd1-eb5bd54e538d",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c934194-753f-49b9-809c-41ff33ae6c0a",
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
  "created_at": "2026-10-30T13:32:21.728343Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/04245966-aaae-4879-abd1-eb5bd54e538d` → **200**

```json
{
  "id": "04245966-aaae-4879-abd1-eb5bd54e538d",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2c934194-753f-49b9-809c-41ff33ae6c0a",
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
  "created_at": "2026-10-30T13:32:21.728343Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/04245966-aaae-4879-abd1-eb5bd54e538d/cancel` → **200**

```json
{
  "command_id": "4492ac48-625e-4f9a-9c3c-cf8104d9311a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "04245966-aaae-4879-abd1-eb5bd54e538d",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2c934194-753f-49b9-809c-41ff33ae6c0a",
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
  "created_at": "2026-10-30T13:32:21.728343Z",
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

`POST /api/admin/v1/legal-documents/4c7b9b47-f4d6-4cb3-b4be-5fecff625a52` → **409**

```json
{
  "command_id": "3d8ab560-167d-493d-921a-5e86c0870837",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T13:32:22Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/4c7b9b47-f4d6-4cb3-b4be-5fecff625a52",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "169bcfff-ca5a-454e-8fa9-592017242fbe"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "be758383-c258-4320-8a4a-3fc636db4e53",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:32:22Z"
}
```

```json
{
  "id": "7e11fa9a-371f-4754-b715-c4ccd1d97b09",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:32:22Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/7e11fa9a-371f-4754-b715-c4ccd1d97b09/publish` → **200**

```json
{
  "command_id": "aad484f0-fea0-4be5-8e36-ddd762b8f0b8",
  "expected_version": 0
}
```

```json
{
  "id": "7e11fa9a-371f-4754-b715-c4ccd1d97b09",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T13:32:23.185996Z",
  "published_at": "2026-10-30T13:32:23.185996Z",
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
  "device_ref": "sandbox-16769"
}
```

```json
{
  "challenge_id": "1c559a08-4f15-4b21-b2a2-32b134f873cf",
  "expires_at": "2026-10-30T13:37:23.461692766Z",
  "resend_available_at": "2026-10-30T13:32:24.461692766Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "445401",
  "sent_at": "2026-10-30T13:32:23.463856435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c559a08-4f15-4b21-b2a2-32b134f873cf",
  "code": "445401",
  "device_ref": "sandbox-16769"
}
```

```json
{
  "session_id": "0af1c429-a3e8-493b-8352-5c4fc86f7116",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODA0MywiaWF0IjoxNzkzMzY3MTQzLCJqdGkiOiIzMTUyOWRjYi01NjQ3LTRhZDgtOGQyNS02ZDdjYTcyNzQ4ZDIiLCJzaWQiOiIwYWYxYzQyOS1hM2U4LTQ5M2ItODM1Mi01YzRmYzg2ZjcxMTYifQ.cSNk4wjQdGJK1-N09_dq7ZV9j0OwhLa6Krc3gQoMe8w",
  "access_expires_at": "2026-10-30T13:47:23.753781988Z",
  "refresh_token": "RwQLQh9DglAk68vkWBXrbpPecjG6yiqXlGFBzkDPQ4U",
  "refresh_expires_at": "2026-11-29T13:32:23.75311747Z",
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
  "command_id": "50aa6499-a5d0-4485-b8f0-05407ff41b61",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:33:35Z",
    "sequence": 1793367215314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d2969ec9-9bf3-491d-ae06-99e3b0e5af87",
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
  "last_heartbeat_at": "2026-10-30T13:33:35.331019Z",
  "last_location_at": "2026-10-30T13:33:35.331019Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674364292",
  "device_ref": "sandbox-1495"
}
```

```json
{
  "challenge_id": "ea1a9c47-3aa6-4955-bfdd-852fefb5c70c",
  "expires_at": "2026-10-30T13:38:35.609888158Z",
  "resend_available_at": "2026-10-30T13:33:36.609888158Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674364292` → **200**

```json
{
  "phone": "+380674364292",
  "audience": "CLIENT",
  "code": "263099",
  "sent_at": "2026-10-30T13:33:35.612315648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea1a9c47-3aa6-4955-bfdd-852fefb5c70c",
  "code": "263099",
  "device_ref": "sandbox-1495"
}
```

```json
{
  "session_id": "27b8ac5c-3786-4f3d-8569-11560bf2a76d",
  "subject": {
    "type": "CLIENT",
    "id": "21d8646f-e5f5-484e-acd0-ab37af47f270"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMWQ4NjQ2Zi1lNWY1LTQ4NGUtYWNkMC1hYjM3YWY0N2YyNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTE1LCJpYXQiOjE3OTMzNjcyMTUsImp0aSI6IjQzZDZmMGRjLWIzODMtNGZhYi05MDYyLWJjNGEyNzhlZGFmMyIsInNpZCI6IjI3YjhhYzVjLTM3ODYtNGYzZC04NTY5LTExNTYwYmYyYTc2ZCJ9.JMh_1laD-G-g3vx05AtJ4M5Vb25c5i6NW8jw1QtLIuw",
  "access_expires_at": "2026-10-30T13:48:35.895318341Z",
  "refresh_token": "yTZaqFt-pDr7I_BkfGUpNK7zhvOQxfG-6CMo8I5T9-A",
  "refresh_expires_at": "2026-11-29T13:33:35.894775817Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f15267f5-5332-4a06-87ce-0d81760711db",
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
  "id": "cdcd931e-cff6-4986-bb52-e809a5cc95ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:38:36.175902Z",
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
  "command_id": "bd52594c-d8db-4f11-a1f5-1503fd05135c",
  "quote_id": "cdcd931e-cff6-4986-bb52-e809a5cc95ff",
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
    "phone": "+380677310022"
  }
}
```

```json
{
  "id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:33:36.464347Z",
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
    "id": "f9944ac7-dd70-45e9-afcb-bda391e0d558",
    "order_id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
    "expires_at": "2026-10-30T13:33:51.468408Z",
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

`POST /api/driver/v1/offers/f9944ac7-dd70-45e9-afcb-bda391e0d558/accept` → **200**

```json
{
  "command_id": "ff9eab43-93ce-4974-99d0-120d36c1eb37"
}
```

```json
{
  "id": "e2e01fc4-b804-4b51-8317-1354e6bb35a9",
  "order_id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "913c8d1a-12eb-4b7d-9dda-56bf70718e1e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "913c8d1a-12eb-4b7d-9dda-56bf70718e1e",
  "order_id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
  "assignment_id": "e2e01fc4-b804-4b51-8317-1354e6bb35a9",
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
    "phone": "+380677310022"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "642e2c77-c8cd-4d9a-8a43-daa33d3ffac4",
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
  "id": "94a4d63e-a154-4cfc-a417-05b70fd46c1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:38:37.605090Z",
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
  "command_id": "0e9c5093-0d96-4844-a7df-b6dd2d29a622",
  "quote_id": "94a4d63e-a154-4cfc-a417-05b70fd46c1a",
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
  "id": "ef81bc6e-2908-4427-aef0-63b5c25cee23",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:33:37.881667Z",
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
  "command_id": "869d0b9b-c20c-4895-88a9-c797d281619c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T16:33:38Z"
}
```

```json
{
  "id": "7fc78e72-c0cc-4213-8bce-656b03a5baad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:38:38.193660Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:33:38Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b9ceb890-588d-434a-9c89-38f4928eec72",
  "quote_id": "7fc78e72-c0cc-4213-8bce-656b03a5baad",
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
  "pickup_at": "2026-10-30T16:33:38Z"
}
```

```json
{
  "id": "9e0b66ba-f46a-489c-aa6c-8583885a94bc",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:33:38.481434Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:33:38Z",
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
  "command_id": "6727730c-5282-4d95-a3a4-33083772726e",
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
  "id": "d144f621-40cd-40f1-aa37-118d6c2c82ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:38:38.780861Z",
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
  "command_id": "8051a054-112b-4a89-8341-c9cd51cb49ef",
  "quote_id": "d144f621-40cd-40f1-aa37-118d6c2c82ad",
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
  "correlation_id": "19a2a732-5f1c-4773-b46b-f3a30324b8f0"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9e0b66ba-f46a-489c-aa6c-8583885a94bc",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T13:33:38.481434Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T16:33:38Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "ef81bc6e-2908-4427-aef0-63b5c25cee23",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T13:33:37.881667Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "ef81bc6e-2908-4427-aef0-63b5c25cee23",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:33:37.881667Z",
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

`GET /api/rider/v1/orders/43911c34-8aaa-4146-8dbd-4fb7d8a629d8` → **200**

```json
{
  "id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e2e01fc4-b804-4b51-8317-1354e6bb35a9",
    "order_id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "913c8d1a-12eb-4b7d-9dda-56bf70718e1e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T13:33:36.464347Z",
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
    "location_at": "2026-10-30T13:33:35.331019Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/43911c34-8aaa-4146-8dbd-4fb7d8a629d8/cancel` → **200**

```json
{
  "command_id": "fd00c349-01d4-4385-9f68-db0b10ce10bc",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e2e01fc4-b804-4b51-8317-1354e6bb35a9",
    "order_id": "43911c34-8aaa-4146-8dbd-4fb7d8a629d8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "913c8d1a-12eb-4b7d-9dda-56bf70718e1e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T13:33:36.464347Z",
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

`GET /api/rider/v1/orders/ef81bc6e-2908-4427-aef0-63b5c25cee23` → **200**

```json
{
  "id": "ef81bc6e-2908-4427-aef0-63b5c25cee23",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:33:37.881667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ef81bc6e-2908-4427-aef0-63b5c25cee23/cancel` → **200**

```json
{
  "command_id": "d507332b-099d-4b6f-923d-ef84def9aba5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ef81bc6e-2908-4427-aef0-63b5c25cee23",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:33:37.881667Z",
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

`GET /api/rider/v1/orders/9e0b66ba-f46a-489c-aa6c-8583885a94bc` → **200**

```json
{
  "id": "9e0b66ba-f46a-489c-aa6c-8583885a94bc",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:33:38.481434Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:33:38Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9e0b66ba-f46a-489c-aa6c-8583885a94bc/cancel` → **200**

```json
{
  "command_id": "674601b1-97ec-4ef5-9269-ae17b9fd3a63",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9e0b66ba-f46a-489c-aa6c-8583885a94bc",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "21d8646f-e5f5-484e-acd0-ab37af47f270",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T13:33:38.481434Z",
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
  "pickup_at": "2026-10-30T16:33:38Z",
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
  "session_id": "d2969ec9-9bf3-491d-ae06-99e3b0e5af87",
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
  "last_heartbeat_at": "2026-10-30T13:33:35.331019Z",
  "last_location_at": "2026-10-30T13:33:35.331019Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d2969ec9-9bf3-491d-ae06-99e3b0e5af87/close` → **200**

```json
{
  "command_id": "8d128437-88e1-403e-91c3-4d5f122e7738",
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

Done: orders 43911c34-8aaa-4146-8dbd-4fb7d8a629d8, ef81bc6e-2908-4427-aef0-63b5c25cee23, 9e0b66ba-f46a-489c-aa6c-8583885a94bc.

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
  "session_id": "49092460-2d1b-4716-99be-072531fd9bf9",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxMjIsImlhdCI6MTc5MzM2NzIyMiwianRpIjoiMTYwNWU2M2ItZTVlNy00Nzg0LTllOWMtNzJiYWY1MzBjMzRlIiwic2lkIjoiNDkwOTI0NjAtMmQxYi00NzE2LTk5YmUtMDcyNTMxZmQ5YmY5In0.PQJaZm48V2kl2-B7V8y34aIUysi-HCMj877Zwf0d8vI",
  "access_expires_at": "2026-10-30T13:48:42.475391098Z",
  "refresh_token": "q0QpPELVanTKRmjmtnmLoYPwZKRvUV1SMlwLtGj5mYM",
  "refresh_expires_at": "2026-10-31T01:33:42.474802408Z",
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
  "session_id": "1c4b17da-6284-4006-a45c-76f8f2424bc7",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxMjMsImlhdCI6MTc5MzM2NzIyMywianRpIjoiZDc5ODFjNzEtOGE5YS00ZTVjLWI3ODctMTA0MjU0Njk0OWM4Iiwic2lkIjoiMWM0YjE3ZGEtNjI4NC00MDA2LWE0NWMtNzZmOGYyNDI0YmM3In0.8pEcNsRUSDlqrY1A2dfLzdvK2ksCZBVVWYxn4liBJW0",
  "access_expires_at": "2026-10-30T13:48:43.033546408Z",
  "refresh_token": "RiqrfSn67OkFMaw0aXH3nvweFOcA14syXkwVZ9zdyS8",
  "refresh_expires_at": "2026-10-31T01:33:43.033021329Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26163"
}
```

```json
{
  "challenge_id": "d3c0de0d-eb05-4258-beca-c7c83724bc7b",
  "expires_at": "2026-10-30T13:38:43.304576889Z",
  "resend_available_at": "2026-10-30T13:33:44.304576889Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "856117",
  "sent_at": "2026-10-30T13:33:43.307195792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3c0de0d-eb05-4258-beca-c7c83724bc7b",
  "code": "856117",
  "device_ref": "sandbox-26163"
}
```

```json
{
  "session_id": "f28b7fde-06f4-49a4-a28d-86b0bb3673c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODEyMywiaWF0IjoxNzkzMzY3MjIzLCJqdGkiOiI5M2ZmYjE2Mi02NTE3LTRhOGEtYTQyYi03MmZlZjUyZTRjNTMiLCJzaWQiOiJmMjhiN2ZkZS0wNmY0LTQ5YTQtYTI4ZC04NmIwYmIzNjczYzUifQ.HeQv2sbDC8U7ueuqM6WpDx1KhOJxTN5c6XMoeE_N0WA",
  "access_expires_at": "2026-10-30T13:48:43.596373787Z",
  "refresh_token": "-wRqn-QBj8C3hF157QLMSU1YnRg8NCwcvyZqBzCzvyc",
  "refresh_expires_at": "2026-11-29T13:33:43.595879646Z",
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
  "command_id": "fe15a336-8328-41af-b777-8173b4633966",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:33:44Z",
    "sequence": 1793367224150
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559a8215-1763-4fda-b235-bcb65b98d175",
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
  "last_heartbeat_at": "2026-10-30T13:33:44.166757Z",
  "last_location_at": "2026-10-30T13:33:44.166757Z",
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
  "command_id": "83f08a7e-9755-4ac6-ac2f-5e17467c2173",
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
  "effective_at": "2026-10-30T13:33:44.720656Z",
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T13:24:24.389747Z",
  "last_entries": [
    {
      "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:24:24.389747Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4b876fd5-e8ab-49a6-b3d7-e896b4d3311a",
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
  "id": "7f89a8ef-d63c-4484-bbfa-01bf2b28907b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:38:45.274786Z",
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
  "command_id": "a8cf9576-9406-488e-b223-043fd9273192",
  "quote_id": "7f89a8ef-d63c-4484-bbfa-01bf2b28907b",
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
    "phone": "+380671110183"
  }
}
```

```json
{
  "id": "50811902-ac78-45b1-ab60-2ba751349733",
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
  "created_at": "2026-10-30T13:33:45.555245Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110183"
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
    "id": "5405c45b-cdd3-42ea-af4f-853bbf3abdaf",
    "order_id": "50811902-ac78-45b1-ab60-2ba751349733",
    "expires_at": "2026-10-30T13:34:00.559105Z",
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

`POST /api/driver/v1/offers/5405c45b-cdd3-42ea-af4f-853bbf3abdaf/accept` → **200**

```json
{
  "command_id": "3d1c759f-8eaf-49a9-8739-60f360eb628d"
}
```

```json
{
  "id": "4eb5f979-82f6-414b-b30c-ca9ccb6ed7d9",
  "order_id": "50811902-ac78-45b1-ab60-2ba751349733",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9a7dc8e7-c7f0-4883-8bd6-de48deb98684",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9a7dc8e7-c7f0-4883-8bd6-de48deb98684",
  "order_id": "50811902-ac78-45b1-ab60-2ba751349733",
  "assignment_id": "4eb5f979-82f6-414b-b30c-ca9ccb6ed7d9",
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
    "phone": "+380671110183"
  }
}
```

`POST /api/driver/v1/work-sessions/559a8215-1763-4fda-b235-bcb65b98d175/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:33:46Z",
    "sequence": 1793367226677
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559a8215-1763-4fda-b235-bcb65b98d175",
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
  "last_heartbeat_at": "2026-10-30T13:33:46.69527Z",
  "last_location_at": "2026-10-30T13:33:46.69527Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9a7dc8e7-c7f0-4883-8bd6-de48deb98684/arrive` → **200**

```json
{
  "command_id": "25972e9a-246a-48ce-acfe-6765cc181a71",
  "expected_version": 0
}
```

```json
{
  "id": "9a7dc8e7-c7f0-4883-8bd6-de48deb98684",
  "order_id": "50811902-ac78-45b1-ab60-2ba751349733",
  "assignment_id": "4eb5f979-82f6-414b-b30c-ca9ccb6ed7d9",
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
  "arrived_at": "2026-10-30T13:33:46.968442Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110183"
  }
}
```

`POST /api/driver/v1/trips/9a7dc8e7-c7f0-4883-8bd6-de48deb98684/start` → **200**

```json
{
  "command_id": "4e919d74-9aec-4e66-8425-e0c98f44399b",
  "expected_version": 1
}
```

```json
{
  "id": "9a7dc8e7-c7f0-4883-8bd6-de48deb98684",
  "order_id": "50811902-ac78-45b1-ab60-2ba751349733",
  "assignment_id": "4eb5f979-82f6-414b-b30c-ca9ccb6ed7d9",
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
  "arrived_at": "2026-10-30T13:33:46.968442Z",
  "started_at": "2026-10-30T13:33:47.261902Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110183"
  }
}
```

`POST /api/driver/v1/trips/9a7dc8e7-c7f0-4883-8bd6-de48deb98684/complete` → **200**

```json
{
  "command_id": "baf2a483-cbbb-48c2-9f69-42561660b4aa",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:33:47Z",
  "cash_received": true
}
```

```json
{
  "id": "9a7dc8e7-c7f0-4883-8bd6-de48deb98684",
  "order_id": "50811902-ac78-45b1-ab60-2ba751349733",
  "assignment_id": "4eb5f979-82f6-414b-b30c-ca9ccb6ed7d9",
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
  "arrived_at": "2026-10-30T13:33:46.968442Z",
  "started_at": "2026-10-30T13:33:47.261902Z",
  "completed_at": "2026-10-30T13:33:47.548528Z",
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
  "command_id": "d2e659b8-32a7-48ba-a556-84e5001442e8",
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
  "id": "9feffd4b-5983-41c1-91e2-f899b837d7a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:38:47.831290Z",
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
  "command_id": "e64c2b04-d05b-4826-83fb-142e775790ae",
  "quote_id": "9feffd4b-5983-41c1-91e2-f899b837d7a2",
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
    "phone": "+3806711128645"
  }
}
```

```json
{
  "id": "400f9465-6c2b-483b-9579-d1f37e37c121",
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
  "created_at": "2026-10-30T13:33:48.117578Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128645"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/400f9465-6c2b-483b-9579-d1f37e37c121` → **200**

```json
{
  "id": "400f9465-6c2b-483b-9579-d1f37e37c121",
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
  "created_at": "2026-10-30T13:33:48.117578Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128645"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/400f9465-6c2b-483b-9579-d1f37e37c121/cancel` → **200**

```json
{
  "command_id": "fd5104d9-a33d-42ee-bc27-4595ee43c4dd",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "400f9465-6c2b-483b-9579-d1f37e37c121",
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
  "created_at": "2026-10-30T13:33:48.117578Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128645"
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
  "staff_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T13:24:24.389747Z",
  "last_entries": [
    {
      "order_id": "400f9465-6c2b-483b-9579-d1f37e37c121",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T13:33:48.716495Z"
    },
    {
      "order_id": "50811902-ac78-45b1-ab60-2ba751349733",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T13:33:47.553145Z"
    },
    {
      "order_id": "7dc0ec9e-5dc6-4a72-add8-412460a52904",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T13:24:24.389747Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "559a8215-1763-4fda-b235-bcb65b98d175",
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
  "last_heartbeat_at": "2026-10-30T13:33:46.69527Z",
  "last_location_at": "2026-10-30T13:33:46.69527Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/559a8215-1763-4fda-b235-bcb65b98d175/close` → **200**

```json
{
  "command_id": "0b5b167a-a051-4825-8c5a-487e48a0c6a6",
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

Done: operator bonus for fulfilled 50811902-ac78-45b1-ab60-2ba751349733 and operator-fault cancellation 400f9465-6c2b-483b-9579-d1f37e37c121.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678554434",
  "device_ref": "sandbox-16318"
}
```

```json
{
  "challenge_id": "b43e1afd-c51e-4b72-9ac0-331b8aaadd3e",
  "expires_at": "2026-10-30T13:38:53.082000463Z",
  "resend_available_at": "2026-10-30T13:33:54.082000463Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678554434` → **200**

```json
{
  "phone": "+380678554434",
  "audience": "CLIENT",
  "code": "333547",
  "sent_at": "2026-10-30T13:33:53.084351813Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678785468",
  "device_ref": "sandbox-9052",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "3831f25e-4b9f-46c8-8fa1-7a6da9496260",
  "expires_at": "2026-10-30T13:38:54.578607633Z",
  "resend_available_at": "2026-10-30T13:33:55.578607633Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678785468` → **200**

```json
{
  "phone": "+380678785468",
  "audience": "CLIENT",
  "code": "813889",
  "sent_at": "2026-10-30T13:33:54.580714187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678785468",
  "device_ref": "sandbox-19048",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "ce80159c-02ab-4b2e-a8c8-f070572fda31",
  "expires_at": "2026-10-30T13:38:56.067049385Z",
  "resend_available_at": "2026-10-30T13:33:57.067049385Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678785468` → **200**

```json
{
  "phone": "+380678785468",
  "audience": "CLIENT",
  "code": "772655",
  "sent_at": "2026-10-30T13:33:56.070543247Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675720000",
  "device_ref": "sandbox-12504"
}
```

```json
{
  "challenge_id": "eee9665b-ef8f-4eb4-a02e-07f554790244",
  "expires_at": "2026-10-30T13:38:57.570467375Z",
  "resend_available_at": "2026-10-30T13:33:58.570467375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675720000",
  "device_ref": "sandbox-6704"
}
```

```json
{
  "challenge_id": "4533d9bc-e267-41cf-8cc9-5b8dc96d8db7",
  "expires_at": "2026-10-30T13:38:59.046275914Z",
  "resend_available_at": "2026-10-30T13:34:00.046275914Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675720000` → **200**

```json
{
  "phone": "+380675720000",
  "audience": "CLIENT",
  "code": "882106",
  "sent_at": "2026-10-30T13:33:59.048982839Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675720000",
  "device_ref": "sandbox-25695",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "60a391aa-7152-4309-89e9-7deb0d182fc7",
  "expires_at": "2026-10-30T13:39:00.549040385Z",
  "resend_available_at": "2026-10-30T13:34:01.549040385Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675720000` → **200**

```json
{
  "phone": "+380675720000",
  "audience": "CLIENT",
  "code": "758910",
  "sent_at": "2026-10-30T13:34:00.551323928Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380675720000",
  "device_ref": "sandbox-15144",
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
  "correlation_id": "7df8c77a-9e27-4c79-afd5-a9ddc1da2edf",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000015003"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "792a5091-46aa-4e59-b158-a48fab330178"
}
```

`GET /sandbox/v1/otp?phone=%2B442000015003` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120010457"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "adb89e47-7dd8-41c5-b693-e457b9d47a35"
}
```

`GET /sandbox/v1/otp?phone=%2B37120010457` → **404**

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
  "session_id": "b1efef55-0f63-44c7-9d78-ee7911aaaa7e",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNDMsImlhdCI6MTc5MzM2NzI0MywianRpIjoiZGFkZDA2ZWItYWUzNi00NjUzLTg4YzQtMmNjM2UxNzkzYzc2Iiwic2lkIjoiYjFlZmVmNTUtMGY2My00NGM3LTlkNzgtZWU3OTExYWFhYTdlIn0.Lii3mOtmG19KCUGUiYH3NSFqgIqRdsibB1gw0Z16VH0",
  "access_expires_at": "2026-10-30T13:49:03.173853551Z",
  "refresh_token": "5xGMRdFi1KsqSvh0msupEhVShAR3bq36VzKI36yxpgM",
  "refresh_expires_at": "2026-10-31T01:34:03.173330119Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675720000` → **200**

```json
{
  "deliveries": [
    {
      "id": "ee07ee01-c7a6-4bda-8242-aec6609ae187",
      "challenge_id": "60a391aa-7152-4309-89e9-7deb0d182fc7",
      "phone": "+380675720000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a5591df9-6e8a-4d48-850c-5e7922f584fb",
      "error": null,
      "attempted_at": "2026-10-30T13:34:00.551701Z"
    },
    {
      "id": "09d2a17e-7981-4d0a-a6c2-08d874cdbb32",
      "challenge_id": "4533d9bc-e267-41cf-8cc9-5b8dc96d8db7",
      "phone": "+380675720000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9f5cd295-17a4-477f-ae5f-624489ab3cc4",
      "error": null,
      "attempted_at": "2026-10-30T13:33:59.049246Z"
    },
    {
      "id": "27d8bdf1-dfeb-4a0b-89c0-71bfeca292da",
      "challenge_id": "eee9665b-ef8f-4eb4-a02e-07f554790244",
      "phone": "+380675720000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T13:33:57.572726Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675720000` → **200**

```json
{
  "phone": "+380675720000",
  "audience": "CLIENT",
  "code": "758910",
  "sent_at": "2026-10-30T13:34:00.551323928Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678785468` → **200**

```json
{
  "deliveries": [
    {
      "id": "2b2e4f9c-29e2-44cd-bf3e-4e1b7b5dd238",
      "challenge_id": "ce80159c-02ab-4b2e-a8c8-f070572fda31",
      "phone": "+380678785468",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7d213994-92a5-4e2f-8d5d-0dde7040eb28",
      "error": null,
      "attempted_at": "2026-10-30T13:33:56.070981Z"
    },
    {
      "id": "e5fc8c6c-15ef-4d8a-8f9e-9e5f1ddb9c71",
      "challenge_id": "3831f25e-4b9f-46c8-8fa1-7a6da9496260",
      "phone": "+380678785468",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-cac9845b-f807-4234-8309-6d5ea17d2351",
      "error": null,
      "attempted_at": "2026-10-30T13:33:54.581124Z"
    }
  ]
}
```

Done: SMS to +380678554434; SMS then a call to +380678785468; a failed SMS, two calls and a refused third to +380675720000; +44 and +371 refused.

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
  "session_id": "197cd92d-782f-416e-bb6c-ce9eda058598",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNDQsImlhdCI6MTc5MzM2NzI0NCwianRpIjoiYmQ5N2RkNTMtMzRlMy00ZmVjLThjNjgtYjk1YTM2NjBmODZiIiwic2lkIjoiMTk3Y2Q5MmQtNzgyZi00MTZlLWJiNmMtY2U5ZWRhMDU4NTk4In0.3Aezs2ZcQTC21uDwG6TIkb1agHyHvJzofgPYsf0pOBQ",
  "access_expires_at": "2026-10-30T13:49:04.32162037Z",
  "refresh_token": "-2rwEk-39c6uCHWL-SjW3JLs-5Dko-GS3om-ctcYW98",
  "refresh_expires_at": "2026-10-31T01:34:04.320780934Z",
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
  "session_id": "661d6a6e-2965-4579-873d-f776ad004d09",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNDQsImlhdCI6MTc5MzM2NzI0NCwianRpIjoiYjE2YzE0MzQtODlkMC00NThhLTkyZWMtODZhODE4ZGUwZGI0Iiwic2lkIjoiNjYxZDZhNmUtMjk2NS00NTc5LTg3M2QtZjc3NmFkMDA0ZDA5In0.04EnS_hK1YA0LDuELQSVmz9EpeH_a0AuHMvlfH2epnk",
  "access_expires_at": "2026-10-30T13:49:04.878967462Z",
  "refresh_token": "nUsYrY2fT_RCiAAKQFLdcPlYJFACnE-nQVO1Yjd936E",
  "refresh_expires_at": "2026-10-31T01:34:04.878268641Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
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

`POST /api/admin/v1/staff-extensions/86673a8e-1701-4030-8b09-a16c7ea03ccf` → **200**

```json
{
  "command_id": "b301fa8d-6e09-46d0-81a6-0af78c06de65",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "6de1dc5c-de76-41c8-8f4e-d207dbff3eb7",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:34:06.016184Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T13:34:06.016184Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "98420b53-88fa-4ab4-a6f4-d4289e9f72ea",
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
  "id": "068005ec-4481-40ed-b51c-8acad0eb64b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:06.571513Z",
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
  "command_id": "d6d2c34b-b59b-4d0c-90b6-2474535b19cf",
  "quote_id": "068005ec-4481-40ed-b51c-8acad0eb64b9",
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
    "phone": "+380676866587"
  }
}
```

```json
{
  "id": "d7cbf085-6b2a-4f45-a231-7e99487c30f3",
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
  "created_at": "2026-10-30T13:34:06.855679Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676866587"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/d7cbf085-6b2a-4f45-a231-7e99487c30f3/calls` → **201**

```json
{
  "command_id": "c83ae13d-a2b3-47cc-810c-e9e98e0064c6",
  "to": "CALLER"
}
```

```json
{
  "id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "order_ids": [
    "d7cbf085-6b2a-4f45-a231-7e99487c30f3"
  ],
  "started_at": "2026-10-30T13:34:07.201011Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/d7cbf085-6b2a-4f45-a231-7e99487c30f3/calls` → **201**

```json
{
  "command_id": "c83ae13d-a2b3-47cc-810c-e9e98e0064c6",
  "to": "CALLER"
}
```

```json
{
  "id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "order_ids": [
    "d7cbf085-6b2a-4f45-a231-7e99487c30f3"
  ],
  "started_at": "2026-10-30T13:34:07.201011Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380676866587",
    "at": "2026-10-30T13:34:07.204079313Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.6710",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "4c89e5e3-29f6-4019-b5fd-97302283509f"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=d7cbf085-6b2a-4f45-a231-7e99487c30f3` → **200**

```json
{
  "calls": [
    {
      "id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [
        "d7cbf085-6b2a-4f45-a231-7e99487c30f3"
      ],
      "started_at": "2026-10-30T13:34:07.201011Z",
      "answered_at": "2026-10-30T13:34:07.826996Z",
      "ended_at": "2026-10-30T13:34:07.845337Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d7cbf085-6b2a-4f45-a231-7e99487c30f3` → **200**

```json
{
  "calls": [
    {
      "id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [
        "d7cbf085-6b2a-4f45-a231-7e99487c30f3"
      ],
      "started_at": "2026-10-30T13:34:07.201011Z",
      "answered_at": "2026-10-30T13:34:07.826996Z",
      "ended_at": "2026-10-30T13:34:07.845337Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d7cbf085-6b2a-4f45-a231-7e99487c30f3` → **200**

```json
{
  "calls": [
    {
      "id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [
        "d7cbf085-6b2a-4f45-a231-7e99487c30f3"
      ],
      "started_at": "2026-10-30T13:34:07.201011Z",
      "answered_at": "2026-10-30T13:34:07.826996Z",
      "ended_at": "2026-10-30T13:34:07.845337Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d7cbf085-6b2a-4f45-a231-7e99487c30f3` → **200**

```json
{
  "calls": [
    {
      "id": "4c89e5e3-29f6-4019-b5fd-97302283509f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "order_ids": [
        "d7cbf085-6b2a-4f45-a231-7e99487c30f3"
      ],
      "started_at": "2026-10-30T13:34:07.201011Z",
      "answered_at": "2026-10-30T13:34:07.826996Z",
      "ended_at": "2026-10-30T13:34:07.845337Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T13:34:13.835413Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/d7cbf085-6b2a-4f45-a231-7e99487c30f3` → **200**

```json
{
  "id": "d7cbf085-6b2a-4f45-a231-7e99487c30f3",
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
  "created_at": "2026-10-30T13:34:06.855679Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676866587"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d7cbf085-6b2a-4f45-a231-7e99487c30f3/cancel` → **200**

```json
{
  "command_id": "5cc9a69b-e229-4646-83cc-95d5ff07cbbd",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d7cbf085-6b2a-4f45-a231-7e99487c30f3",
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
  "created_at": "2026-10-30T13:34:06.855679Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676866587"
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
  "command_id": "75ea4e19-58c8-4da5-b361-5871f8f432f4",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T13:34:15.567933Z",
  "extension": "101"
}
```

Done: outgoing call 4c89e5e3-29f6-4019-b5fd-97302283509f from order d7cbf085-6b2a-4f45-a231-7e99487c30f3, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632036339",
  "device_ref": "sandbox-28388"
}
```

```json
{
  "challenge_id": "8a1ec83d-81bf-48a6-84aa-dc358bd22183",
  "expires_at": "2026-10-30T13:39:15.843536485Z",
  "resend_available_at": "2026-10-30T13:34:16.843536485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632036339` → **200**

```json
{
  "phone": "+380632036339",
  "audience": "CLIENT",
  "code": "312528",
  "sent_at": "2026-10-30T13:34:15.845916657Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a1ec83d-81bf-48a6-84aa-dc358bd22183",
  "code": "312528",
  "device_ref": "sandbox-28388"
}
```

```json
{
  "session_id": "dd5a492a-4058-4695-a7ce-4591a436be9d",
  "subject": {
    "type": "CLIENT",
    "id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZmUzNTBkOS0zNDIzLTRiZGQtYjJkMS03NmZhZmMxYTA0ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTU2LCJpYXQiOjE3OTMzNjcyNTYsImp0aSI6IjYzMTk3MThjLWRhMDMtNGIzMi1iZDNkLWFmNTBiYzg5NjMzMyIsInNpZCI6ImRkNWE0OTJhLTQwNTgtNDY5NS1hN2NlLTQ1OTFhNDM2YmU5ZCJ9.3Xzklg-s2aE7egf9kA5DCqay5Y7hyBqDdn0bo8n-2iM",
  "access_expires_at": "2026-10-30T13:49:16.133492278Z",
  "refresh_token": "epDwMBpOmzIv_k5YTls-QWKQDIAqrDSeUbWcBuDr_pg",
  "refresh_expires_at": "2026-11-29T13:34:16.132984263Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9",
  "session_id": "dd5a492a-4058-4695-a7ce-4591a436be9d",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632036339",
  "device_ref": "sandbox-7067"
}
```

```json
{
  "challenge_id": "aa858def-89fa-40ff-946d-eed6b114610b",
  "expires_at": "2026-10-30T13:39:18.658570553Z",
  "resend_available_at": "2026-10-30T13:34:19.658570553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632036339` → **200**

```json
{
  "phone": "+380632036339",
  "audience": "CLIENT",
  "code": "324548",
  "sent_at": "2026-10-30T13:34:18.66075677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa858def-89fa-40ff-946d-eed6b114610b",
  "code": "324548",
  "device_ref": "sandbox-7067"
}
```

```json
{
  "session_id": "b95bcb37-30af-4fe4-8ffd-e89835f31cb2",
  "subject": {
    "type": "CLIENT",
    "id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZmUzNTBkOS0zNDIzLTRiZGQtYjJkMS03NmZhZmMxYTA0ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTU4LCJpYXQiOjE3OTMzNjcyNTgsImp0aSI6ImEyNmRkNTljLTI1YzQtNDA4Yi05NThkLTk4NWNjYmM5Y2I1NyIsInNpZCI6ImI5NWJjYjM3LTMwYWYtNGZlNC04ZmZkLWU4OTgzNWYzMWNiMiJ9.iza12LThpQm0VGASeynVd3TFhEKO31QbcdMvBAEsnio",
  "access_expires_at": "2026-10-30T13:49:18.949084818Z",
  "refresh_token": "7FdLO9f4GdZGCvLSBi9lmAbZF4G0atH1kpF3K8Z2H14",
  "refresh_expires_at": "2026-11-29T13:34:18.948646695Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "bd71f31d-c4be-4c01-a72d-39654fc4dbf1",
  "expires_at": "2026-10-30T13:39:21.22613501Z",
  "resend_available_at": "2026-10-30T13:34:22.22613501Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632036339` → **200**

```json
{
  "phone": "+380632036339",
  "audience": "CLIENT",
  "code": "948331",
  "sent_at": "2026-10-30T13:34:21.228308107Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380635946273"
}
```

```json
{
  "challenge_id": "7483c77c-f0e4-4808-ae64-e6e8618664b8",
  "expires_at": "2026-10-30T13:39:21.509714696Z",
  "resend_available_at": "2026-10-30T13:34:22.509714696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635946273` → **200**

```json
{
  "phone": "+380635946273",
  "audience": "CLIENT",
  "code": "676025",
  "sent_at": "2026-10-30T13:34:21.511745722Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "69caa582-810f-427b-a7ab-3b2e0888f15f",
  "current_challenge_id": "bd71f31d-c4be-4c01-a72d-39654fc4dbf1",
  "current_code": "000000",
  "new_challenge_id": "7483c77c-f0e4-4808-ae64-e6e8618664b8",
  "new_code": "676025"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "60fa162e-2ddd-4467-8e04-e9d7acfe5f37"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "bb5fb504-e817-45f8-9b16-43de691b3850",
  "current_challenge_id": "bd71f31d-c4be-4c01-a72d-39654fc4dbf1",
  "current_code": "948331",
  "new_challenge_id": "7483c77c-f0e4-4808-ae64-e6e8618664b8",
  "new_code": "676025"
}
```

```json
{
  "subject_id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9",
  "phone": "+380635946273",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9",
  "session_id": "dd5a492a-4058-4695-a7ce-4591a436be9d",
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
  "correlation_id": "479f5010-903a-4d05-b0eb-cb867cd954d5"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635946273",
  "device_ref": "sandbox-25694"
}
```

```json
{
  "challenge_id": "e4851873-f06e-4db1-bb26-0728726c9a8c",
  "expires_at": "2026-10-30T13:39:24.916829816Z",
  "resend_available_at": "2026-10-30T13:34:25.916829816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635946273` → **200**

```json
{
  "phone": "+380635946273",
  "audience": "CLIENT",
  "code": "289785",
  "sent_at": "2026-10-30T13:34:24.919157829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4851873-f06e-4db1-bb26-0728726c9a8c",
  "code": "289785",
  "device_ref": "sandbox-25694"
}
```

```json
{
  "session_id": "7c40e189-6945-484b-835d-e9d21fd05b62",
  "subject": {
    "type": "CLIENT",
    "id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZmUzNTBkOS0zNDIzLTRiZGQtYjJkMS03NmZhZmMxYTA0ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTY1LCJpYXQiOjE3OTMzNjcyNjUsImp0aSI6IjYzMGYwMWEwLTY3NzQtNGJlNi05MTQzLWVhY2EyZmVlNDJlMSIsInNpZCI6IjdjNDBlMTg5LTY5NDUtNDg0Yi04MzVkLWU5ZDIxZmQwNWI2MiJ9.XwVqFpSXOv8J3khyG7DJI58AD1sIVDHpiXZhn7xuQlk",
  "access_expires_at": "2026-10-30T13:49:25.208464221Z",
  "refresh_token": "OoBc4Zn-h5T1qubHtOCvJEmA_c2qyFoD16ge-wpLVfY",
  "refresh_expires_at": "2026-11-29T13:34:25.207935528Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9",
  "session_id": "7c40e189-6945-484b-835d-e9d21fd05b62",
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
  "session_id": "42657c1d-a327-45d2-9ec4-ce99c2a8a884",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNjYsImlhdCI6MTc5MzM2NzI2NiwianRpIjoiY2Q1ZGYyOTEtOTI3My00NjJjLTliNzQtMmJkMmJkNWZiZTY5Iiwic2lkIjoiNDI2NTdjMWQtYTMyNy00NWQyLTllYzQtY2U5OWMyYThhODg0In0.YuGIq91iJhPryi-fLo8rpv-4JF94vUflnRjA_I5bHKA",
  "access_expires_at": "2026-10-30T13:49:26.021248269Z",
  "refresh_token": "3AmRPSW-QrkScWatBtCr61bZpgMAJB_h4g2T-8n8P3s",
  "refresh_expires_at": "2026-10-31T01:34:26.020694788Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/bfe350d9-3423-4bdd-b2d1-76fafc1a04f9` → **200**

```json
{
  "client": {
    "id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9",
    "phone": "+380635946273",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T13:34:16.131477Z",
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

`POST /api/admin/v1/clients/bfe350d9-3423-4bdd-b2d1-76fafc1a04f9/phone/new-code` → **201**

```json
{
  "phone": "+380633604644"
}
```

```json
{
  "challenge_id": "203bbfbb-b65b-43f6-a2bb-b0e64b495076",
  "expires_at": "2026-10-30T13:39:26.594856699Z",
  "resend_available_at": "2026-10-30T13:34:27.594856699Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633604644` → **200**

```json
{
  "phone": "+380633604644",
  "audience": "CLIENT",
  "code": "497023",
  "sent_at": "2026-10-30T13:34:26.597007191Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/bfe350d9-3423-4bdd-b2d1-76fafc1a04f9/phone` → **422**

```json
{
  "command_id": "c2501742-d5d4-41be-ada6-ad9506b5ad06",
  "expected_version": 3,
  "new_challenge_id": "203bbfbb-b65b-43f6-a2bb-b0e64b495076",
  "new_code": "497024",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/bfe350d9-3423-4bdd-b2d1-76fafc1a04f9/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "fc87dcc7-ac52-49bd-91ad-b51705a85dbe"
}
```

`POST /api/admin/v1/clients/bfe350d9-3423-4bdd-b2d1-76fafc1a04f9/phone` → **400**

```json
{
  "command_id": "92f02867-e0db-49e7-9c82-c1f305d008f5",
  "expected_version": 3,
  "new_challenge_id": "203bbfbb-b65b-43f6-a2bb-b0e64b495076",
  "new_code": "497023",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/bfe350d9-3423-4bdd-b2d1-76fafc1a04f9/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1efd08a1-a03a-4207-b19f-a626c0da6981",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/bfe350d9-3423-4bdd-b2d1-76fafc1a04f9/phone` → **200**

```json
{
  "command_id": "3a5501ce-76fa-4330-859e-29513ad4fd43",
  "expected_version": 3,
  "new_challenge_id": "203bbfbb-b65b-43f6-a2bb-b0e64b495076",
  "new_code": "497023",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9",
  "phone": "+380633604644",
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
  "correlation_id": "4fc775c8-da2f-4c76-af35-193049eb6bb9"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633604644",
  "device_ref": "sandbox-11637"
}
```

```json
{
  "challenge_id": "2082492b-dde8-4646-b714-bd1723a15b61",
  "expires_at": "2026-10-30T13:39:27.998527873Z",
  "resend_available_at": "2026-10-30T13:34:28.998527873Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633604644` → **200**

```json
{
  "phone": "+380633604644",
  "audience": "CLIENT",
  "code": "658127",
  "sent_at": "2026-10-30T13:34:28.000981761Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2082492b-dde8-4646-b714-bd1723a15b61",
  "code": "658127",
  "device_ref": "sandbox-11637"
}
```

```json
{
  "session_id": "7111f2df-9da2-47a0-a8d0-8b13602054f0",
  "subject": {
    "type": "CLIENT",
    "id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZmUzNTBkOS0zNDIzLTRiZGQtYjJkMS03NmZhZmMxYTA0ZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTY4LCJpYXQiOjE3OTMzNjcyNjgsImp0aSI6IjBjMjg5ZjRmLTUwY2MtNDZlMS05Nzk4LTE2N2YxNzE1MjU0OSIsInNpZCI6IjcxMTFmMmRmLTlkYTItNDdhMC1hOGQwLThiMTM2MDIwNTRmMCJ9.4dWyft1SBp7jjeZzfysD1dRJLkiOsqcU1TOUchGOnGY",
  "access_expires_at": "2026-10-30T13:49:28.29665099Z",
  "refresh_token": "YZZVzYvJI4UAZphxsUHr_odJvNYoMowvHuUzOp-RjOs",
  "refresh_expires_at": "2026-11-29T13:34:28.296147248Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bfe350d9-3423-4bdd-b2d1-76fafc1a04f9",
  "session_id": "7111f2df-9da2-47a0-a8d0-8b13602054f0",
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
  "phone": "+380633027763",
  "device_ref": "sandbox-8634"
}
```

```json
{
  "challenge_id": "b2da6d2a-1148-420e-97d2-9eb0dacbb91e",
  "expires_at": "2026-10-30T13:39:28.842783789Z",
  "resend_available_at": "2026-10-30T13:34:29.842783789Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633027763` → **200**

```json
{
  "phone": "+380633027763",
  "audience": "CLIENT",
  "code": "314903",
  "sent_at": "2026-10-30T13:34:28.845075813Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2da6d2a-1148-420e-97d2-9eb0dacbb91e",
  "code": "314903",
  "device_ref": "sandbox-8634"
}
```

```json
{
  "session_id": "f38225e5-a3ff-4d2d-98cc-6eff64416f90",
  "subject": {
    "type": "CLIENT",
    "id": "a04fec86-a6e2-4e2b-841d-8042bbedcaa3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMDRmZWM4Ni1hNmUyLTRlMmItODQxZC04MDQyYmJlZGNhYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTY5LCJpYXQiOjE3OTMzNjcyNjksImp0aSI6IjM2N2JlMzJlLWYwNDAtNGU3OS1hN2QxLTUzNTVkNzYwNzMzNiIsInNpZCI6ImYzODIyNWU1LWEzZmYtNGQyZC05OGNjLTZlZmY2NDQxNmY5MCJ9.uTLIp2cwG9fqo1IItS-Ul0Pq3t26x0xiRmiQ7H51C_o",
  "access_expires_at": "2026-10-30T13:49:29.13373554Z",
  "refresh_token": "5xJ5Sx6UtnKzQM8rjb1gk-fw5aWeIA1L6qi9z7Eb6dw",
  "refresh_expires_at": "2026-11-29T13:34:29.133118467Z",
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
  "session_id": "8270ccf5-bee5-43f9-89d4-ae6d1a31339b",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNzAsImlhdCI6MTc5MzM2NzI3MCwianRpIjoiNGUyYWVkYjgtMzk4Ny00NThhLTllN2YtMDc5ZTc0MzRiYWVlIiwic2lkIjoiODI3MGNjZjUtYmVlNS00M2Y5LTg5ZDQtYWU2ZDFhMzEzMzliIn0.ki3qxCiZilM5_De3QS5W82ix9zIc1_Pvjqj8MQXvAhY",
  "access_expires_at": "2026-10-30T13:49:30.252867096Z",
  "refresh_token": "LsLCPdroaJeob-QFdr-_sO0GzmbGN6rnXQVGj0IpKBs",
  "refresh_expires_at": "2026-10-31T01:34:30.252320275Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633027763` → **200**

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
  "correlation_id": "4fe42d20-8da2-4a17-a165-7dc281038f0a"
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
  "session_id": "1e14db50-f8cf-419f-bc27-aac0ac1b93e6",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNzEsImlhdCI6MTc5MzM2NzI3MSwianRpIjoiYWFjZjU3ZjAtNzlmMS00YmY5LThiMGEtMmMyZDhjYTE4OGU2Iiwic2lkIjoiMWUxNGRiNTAtZjhjZi00MTlmLWJjMjctYWFjMGFjMWI5M2U2In0.2WlVjpCSd_1z45UvWlBz7eiwcEmiO6WnS8pq3ze6Hsc",
  "access_expires_at": "2026-10-30T13:49:31.346794749Z",
  "refresh_token": "VBkmYLUFCSZbkTKCCEHU5l6P2wBy_I43NQV7sJ1FdGg",
  "refresh_expires_at": "2026-10-31T01:34:31.346199234Z",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T13:20:22.915964Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "64e119a5-0ed5-4297-8482-6d77927608bb",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T13:34:31.900390033Z"
}
```

## The rider books the airport for 2026-10-30T16:34:31Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600966732",
  "device_ref": "sandbox-18720"
}
```

```json
{
  "challenge_id": "3f7cc8a8-8752-4fb1-93d4-56f9de1e170c",
  "expires_at": "2026-10-30T13:39:32.187959896Z",
  "resend_available_at": "2026-10-30T13:34:33.187959896Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600966732` → **200**

```json
{
  "phone": "+48600966732",
  "audience": "CLIENT",
  "code": "614542",
  "sent_at": "2026-10-30T13:34:32.190544684Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f7cc8a8-8752-4fb1-93d4-56f9de1e170c",
  "code": "614542",
  "device_ref": "sandbox-18720"
}
```

```json
{
  "session_id": "961d1b50-539f-499e-b0d2-0aff81c364e0",
  "subject": {
    "type": "CLIENT",
    "id": "8dd2eb33-8cf8-43b7-9c1e-13bc54c7ee43"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGQyZWIzMy04Y2Y4LTQzYjctOWMxZS0xM2JjNTRjN2VlNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTcyLCJpYXQiOjE3OTMzNjcyNzIsImp0aSI6IjkyZWE5MmY0LTEzMDUtNGU1ZS1iNTI5LTM1ZmZhOTNiYmM2ZCIsInNpZCI6Ijk2MWQxYjUwLTUzOWYtNDk5ZS1iMGQyLTBhZmY4MWMzNjRlMCJ9.Lbw5ctLnnLEAhaV_KePLTRtKYxdLW9Cb6jrruus8hsc",
  "access_expires_at": "2026-10-30T13:49:32.485131135Z",
  "refresh_token": "lTBGEv0qb9pIILxY4YzcWU1KyIXnnfMJhOILLBKpUB0",
  "refresh_expires_at": "2026-11-29T13:34:32.484662638Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2493369f-9dec-43c2-a5a4-75cc3559ff60",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T16:34:31Z"
}
```

```json
{
  "id": "ef350935-47a3-4343-b214-8ea6f69bdf2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:32.748832Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T16:34:31Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e147234a-0539-4aa5-b2ad-734414f20150",
  "quote_id": "ef350935-47a3-4343-b214-8ea6f69bdf2e",
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
  "pickup_at": "2026-10-30T16:34:31Z"
}
```

```json
{
  "id": "2d292a30-c716-4d67-90e0-f3760a6d68f6",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "8dd2eb33-8cf8-43b7-9c1e-13bc54c7ee43",
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
  "created_at": "2026-10-30T13:34:33.030521Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T16:34:31Z",
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
  "device_ref": "sandbox-17528"
}
```

```json
{
  "challenge_id": "47a53ba3-036f-46e0-a817-1b3dec0b705e",
  "expires_at": "2026-10-30T13:39:33.325358754Z",
  "resend_available_at": "2026-10-30T13:34:34.325358754Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "866752",
  "sent_at": "2026-10-30T13:34:33.327662848Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47a53ba3-036f-46e0-a817-1b3dec0b705e",
  "code": "866752",
  "device_ref": "sandbox-17528"
}
```

```json
{
  "session_id": "fc9962e0-5b02-4ac2-b998-33b94610bff0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODE3MywiaWF0IjoxNzkzMzY3MjczLCJqdGkiOiIxMzYwYmJjNC1mZTMxLTQ5YTctOGE4Ni0xZGQ0ZDE2NjUwNDQiLCJzaWQiOiJmYzk5NjJlMC01YjAyLTRhYzItYjk5OC0zM2I5NDYxMGJmZjAifQ.PEKG99XOzilyTHsEZYN5saMIrcj0QXucum3oTeEJXsY",
  "access_expires_at": "2026-10-30T13:49:33.620770574Z",
  "refresh_token": "M2OT-ui_zcp4S8nfeBcEXlWVbliHFyS0BduPpPu0IIo",
  "refresh_expires_at": "2026-11-29T13:34:33.620316141Z",
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
  "command_id": "8161526c-915a-4a84-a753-57f40b005ab0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:34:34Z",
    "sequence": 1793367274173
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d39986b-405b-4cfa-8b9e-ebb1a7f8e969",
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
  "last_heartbeat_at": "2026-10-30T13:34:34.189493Z",
  "last_location_at": "2026-10-30T13:34:34.189493Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "2d292a30-c716-4d67-90e0-f3760a6d68f6",
      "short_number": 25,
      "pickup_at": "2026-10-30T16:34:31Z",
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

`POST /api/driver/v1/preorders/2d292a30-c716-4d67-90e0-f3760a6d68f6/reserve` → **200**

```json
{
  "command_id": "ddb105d3-37f0-43cd-99e8-5e8447a82a21"
}
```

```json
{
  "id": "a73d0bdc-3c4c-4e87-9aed-deb872471202",
  "state": "RESERVED",
  "order": {
    "order_id": "2d292a30-c716-4d67-90e0-f3760a6d68f6",
    "short_number": 25,
    "pickup_at": "2026-10-30T16:34:31Z",
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
  "reserved_at": "2026-10-30T13:34:34.734662Z",
  "confirm_from": "2026-10-30T16:04:31Z",
  "confirm_until": "2026-10-30T16:14:31Z",
  "drop_until": "2026-10-30T15:34:31Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "a73d0bdc-3c4c-4e87-9aed-deb872471202",
      "state": "RESERVED",
      "order": {
        "order_id": "2d292a30-c716-4d67-90e0-f3760a6d68f6",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:34:31Z",
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
      "reserved_at": "2026-10-30T13:34:34.734662Z",
      "confirm_from": "2026-10-30T16:04:31Z",
      "confirm_until": "2026-10-30T16:14:31Z",
      "drop_until": "2026-10-30T15:34:31Z"
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
      "id": "a73d0bdc-3c4c-4e87-9aed-deb872471202",
      "state": "RESERVED",
      "order": {
        "order_id": "2d292a30-c716-4d67-90e0-f3760a6d68f6",
        "short_number": 25,
        "pickup_at": "2026-10-30T16:34:31Z",
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
      "reserved_at": "2026-10-30T13:34:34.734662Z",
      "confirm_from": "2026-10-30T16:04:31Z",
      "confirm_until": "2026-10-30T16:14:31Z",
      "drop_until": "2026-10-30T15:34:31Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/a73d0bdc-3c4c-4e87-9aed-deb872471202/confirm` → **409**

```json
{
  "command_id": "88baaddf-5a84-4925-90ea-bdf1c32f6c0f"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/a73d0bdc-3c4c-4e87-9aed-deb872471202/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d906f618-bce7-4003-893f-1aa4cf17b112"
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
  "session_id": "44492536-c70d-41bd-aca3-5335cf86c19d",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgxNzYsImlhdCI6MTc5MzM2NzI3NiwianRpIjoiODhkMjI4ZmYtM2E1YS00Nzg3LWEzMDQtMTFkMGEzZGUzZTg2Iiwic2lkIjoiNDQ0OTI1MzYtYzcwZC00MWJkLWFjYTMtNTMzNWNmODZjMTlkIn0.Phzdar3MBiBjp4CGEaANIjOibApfm0NoGQ8enaCdPYU",
  "access_expires_at": "2026-10-30T13:49:36.128644297Z",
  "refresh_token": "OY1TC0NmhTUA8YNTh6gQfHhayqoL3Kf38U2frH9G1Sc",
  "refresh_expires_at": "2026-10-31T01:34:36.128113597Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2d292a30-c716-4d67-90e0-f3760a6d68f6` → **200**

```json
{
  "id": "2d292a30-c716-4d67-90e0-f3760a6d68f6",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "8dd2eb33-8cf8-43b7-9c1e-13bc54c7ee43",
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
  "created_at": "2026-10-30T13:34:33.030521Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T16:34:31Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "a73d0bdc-3c4c-4e87-9aed-deb872471202",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T13:34:34.734662Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/2d292a30-c716-4d67-90e0-f3760a6d68f6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T13:34:33.031634Z",
      "actor": {
        "type": "CLIENT",
        "id": "8dd2eb33-8cf8-43b7-9c1e-13bc54c7ee43",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "2d292a30-c716-4d67-90e0-f3760a6d68f6",
        "preorder": true,
        "quote_id": "ef350935-47a3-4343-b214-8ea6f69bdf2e",
        "pickup_at": "2026-10-30T16:34:31Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "7a56397c-5575-43b7-9221-9a669f2ae065"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T13:34:34.735747Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2d292a30-c716-4d67-90e0-f3760a6d68f6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "a73d0bdc-3c4c-4e87-9aed-deb872471202"
      },
      "correlation_id": "19708f8e-d171-4ea3-97c3-4e745f498503"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 2d292a30-c716-4d67-90e0-f3760a6d68f6, reservation a73d0bdc-3c4c-4e87-9aed-deb872471202.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16620"
}
```

```json
{
  "challenge_id": "8e46484b-d29d-4ae2-822a-3ac610322d24",
  "expires_at": "2026-10-30T13:39:36.971880223Z",
  "resend_available_at": "2026-10-30T13:34:37.971880223Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "219166",
  "sent_at": "2026-10-30T13:34:36.974376228Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e46484b-d29d-4ae2-822a-3ac610322d24",
  "code": "219166",
  "device_ref": "sandbox-16620"
}
```

```json
{
  "session_id": "c1ef87a9-f873-4c75-8531-f016e006c94d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODE3NywiaWF0IjoxNzkzMzY3Mjc3LCJqdGkiOiI1NWRlY2I2MS1kM2VlLTQwMGMtOWExZC1mMDdhOTcxN2U5MGUiLCJzaWQiOiJjMWVmODdhOS1mODczLTRjNzUtODUzMS1mMDE2ZTAwNmM5NGQifQ.43GkpnhXeAfyPL4dnzq9Ikodgjskry9X5xZjYMqa_3Y",
  "access_expires_at": "2026-10-30T13:49:37.277070257Z",
  "refresh_token": "ryJAznKUWMoB_WkjiY7P3cTNA4GbLqfqdMzSyC9o0xQ",
  "refresh_expires_at": "2026-11-29T13:34:37.2765659Z",
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
  "command_id": "a8a43762-e20c-463e-a32d-caec5936918b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:34:37Z",
    "sequence": 1793367277844
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "95b5772c-43e5-42ec-87b1-70cf144b2773",
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
  "last_heartbeat_at": "2026-10-30T13:34:37.859924Z",
  "last_location_at": "2026-10-30T13:34:37.859924Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671631828",
  "device_ref": "sandbox-32187"
}
```

```json
{
  "challenge_id": "c5c6dece-9bc0-4322-9ddb-b6ba57c44ea2",
  "expires_at": "2026-10-30T13:39:38.136529312Z",
  "resend_available_at": "2026-10-30T13:34:39.136529312Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671631828` → **200**

```json
{
  "phone": "+380671631828",
  "audience": "CLIENT",
  "code": "108801",
  "sent_at": "2026-10-30T13:34:38.138830351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5c6dece-9bc0-4322-9ddb-b6ba57c44ea2",
  "code": "108801",
  "device_ref": "sandbox-32187"
}
```

```json
{
  "session_id": "de5a34eb-68aa-4882-aac3-661c794c75de",
  "subject": {
    "type": "CLIENT",
    "id": "9dc59f7a-1019-4b67-8ca4-a3349375e979"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGM1OWY3YS0xMDE5LTRiNjctOGNhNC1hMzM0OTM3NWU5NzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MTc4LCJpYXQiOjE3OTMzNjcyNzgsImp0aSI6ImEzZDkyZDFkLTk1MmUtNGFmZi04ZWNkLWMyZmYxZWRkZGU0NSIsInNpZCI6ImRlNWEzNGViLTY4YWEtNDg4Mi1hYWMzLTY2MWM3OTRjNzVkZSJ9.nN9U5jxbO_oZPTglnAhGRtxALAS7FFFq9hqEjIclH80",
  "access_expires_at": "2026-10-30T13:49:38.431781207Z",
  "refresh_token": "2XnViqhoL0Tjqav4EYyxza-FrbQAjpF7nlnAx4RXQSA",
  "refresh_expires_at": "2026-11-29T13:34:38.431311787Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "daafe17a-2306-4661-8eaf-c0837956b8b1",
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
  "id": "b2a16e12-0800-4b59-8ccf-022630a6fe07",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:39:38.703543Z",
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
  "command_id": "6b4cbb67-e40a-478e-9211-de221e47183f",
  "quote_id": "b2a16e12-0800-4b59-8ccf-022630a6fe07",
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
  "id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9dc59f7a-1019-4b67-8ca4-a3349375e979",
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
  "created_at": "2026-10-30T13:34:38.984221Z",
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
    "id": "6fe0a786-4a67-498a-bba2-e33e0c0ecd67",
    "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
    "expires_at": "2026-10-30T13:34:53.987347Z",
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

`POST /api/driver/v1/offers/6fe0a786-4a67-498a-bba2-e33e0c0ecd67/accept` → **200**

```json
{
  "command_id": "f3a0cabd-19a4-4863-8936-dc7016b83f40"
}
```

```json
{
  "id": "8a68db3e-b690-4d05-98e9-8f25d067dd16",
  "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9d24eec9-9d49-49d7-877e-6f3288fac850",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9d24eec9-9d49-49d7-877e-6f3288fac850",
  "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "assignment_id": "8a68db3e-b690-4d05-98e9-8f25d067dd16",
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

`POST /api/driver/v1/work-sessions/95b5772c-43e5-42ec-87b1-70cf144b2773/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:34:40Z",
    "sequence": 1793367280956
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "95b5772c-43e5-42ec-87b1-70cf144b2773",
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
  "last_heartbeat_at": "2026-10-30T13:34:40.111519Z",
  "last_location_at": "2026-10-30T13:34:40.111519Z",
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
  "id": "9d24eec9-9d49-49d7-877e-6f3288fac850",
  "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "assignment_id": "8a68db3e-b690-4d05-98e9-8f25d067dd16",
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

`POST /api/driver/v1/trips/9d24eec9-9d49-49d7-877e-6f3288fac850/arrive` → **200**

```json
{
  "command_id": "b7292f9a-61f7-4fe4-bdcb-8621913bfc59",
  "expected_version": 0
}
```

```json
{
  "id": "9d24eec9-9d49-49d7-877e-6f3288fac850",
  "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "assignment_id": "8a68db3e-b690-4d05-98e9-8f25d067dd16",
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
  "arrived_at": "2026-10-30T13:34:40.651552Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9d24eec9-9d49-49d7-877e-6f3288fac850/start` → **200**

```json
{
  "command_id": "88be98a6-e6e3-4970-800b-e06528a9fe22",
  "expected_version": 1
}
```

```json
{
  "id": "9d24eec9-9d49-49d7-877e-6f3288fac850",
  "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "assignment_id": "8a68db3e-b690-4d05-98e9-8f25d067dd16",
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
  "arrived_at": "2026-10-30T13:34:40.651552Z",
  "started_at": "2026-10-30T13:34:40.93841Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/95b5772c-43e5-42ec-87b1-70cf144b2773/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:35:29Z",
    "sequence": 1793367329238
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "95b5772c-43e5-42ec-87b1-70cf144b2773",
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
  "last_heartbeat_at": "2026-10-30T13:35:29.25656Z",
  "last_location_at": "2026-10-30T13:35:29.25656Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9d24eec9-9d49-49d7-877e-6f3288fac850/complete` → **200**

```json
{
  "command_id": "d1929c84-230d-44c9-b2ad-b659b83fb102",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:35:29Z",
  "cash_received": true
}
```

```json
{
  "id": "9d24eec9-9d49-49d7-877e-6f3288fac850",
  "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "assignment_id": "8a68db3e-b690-4d05-98e9-8f25d067dd16",
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
  "arrived_at": "2026-10-30T13:34:40.651552Z",
  "started_at": "2026-10-30T13:34:40.93841Z",
  "completed_at": "2026-10-30T13:35:29.547957Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/283e4caf-3f0e-4045-a108-e82b4ff1e6f5/rating` → **200**

```json
{
  "command_id": "1c45c122-8b68-4282-9a76-338ee4f859f6",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "score": 5,
  "created_at": "2026-10-30T13:35:29.851067471Z"
}
```

`POST /api/driver/v1/orders/283e4caf-3f0e-4045-a108-e82b4ff1e6f5/rating` → **200**

```json
{
  "command_id": "20a47371-8050-46a4-a462-8fb0dcdfeea8",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
  "score": 4,
  "created_at": "2026-10-30T13:35:30.142790402Z"
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
  "session_id": "6797df23-e736-4d1d-8ac0-78658ecf2f82",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyMzAsImlhdCI6MTc5MzM2NzMzMCwianRpIjoiMDA3NTA4YTAtYzI3My00ZTIxLTg5ZGEtNGE0NjliYzllNzg0Iiwic2lkIjoiNjc5N2RmMjMtZTczNi00ZDFkLThhYzAtNzg2NThlY2YyZjgyIn0.idKWVffeJ1F3UJAWeUXG9pXAm7nD-ZIzv7K97S6Xu_g",
  "access_expires_at": "2026-10-30T13:50:30.980178313Z",
  "refresh_token": "hshjn5YkZeasaeBA_IfVF2XtsVXGq3cdppGCX3UEoWE",
  "refresh_expires_at": "2026-10-31T01:35:30.979649337Z",
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
  "session_id": "cb10ca5e-e983-4402-bf0a-d45600e98825",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyMzEsImlhdCI6MTc5MzM2NzMzMSwianRpIjoiZGVhZmIxMDgtZTcyNC00ODk0LTk1NjYtODQ3M2ZhOTY2OTI3Iiwic2lkIjoiY2IxMGNhNWUtZTk4My00NDAyLWJmMGEtZDQ1NjAwZTk4ODI1In0.JwJlERZ56M1ICkn307wz-vD5NOLQCYLKke-Z8F13LkI",
  "access_expires_at": "2026-10-30T13:50:31.530891246Z",
  "refresh_token": "l8qM4wMQkPSJMK6oHqaTRPCJKTJ959AsI8k4igQvX2E",
  "refresh_expires_at": "2026-10-31T01:35:31.530336248Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/283e4caf-3f0e-4045-a108-e82b4ff1e6f5/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
      "author_type": "RIDER",
      "author_id": "9dc59f7a-1019-4b67-8ca4-a3349375e979",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T13:35:29.851067Z"
    },
    {
      "order_id": "283e4caf-3f0e-4045-a108-e82b4ff1e6f5",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "9dc59f7a-1019-4b67-8ca4-a3349375e979",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T13:35:30.14279Z"
    }
  ]
}
```

Done: ratings for order 283e4caf-3f0e-4045-a108-e82b4ff1e6f5.

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
  "session_id": "152191a6-787c-448b-8731-b7282560a883",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyMzIsImlhdCI6MTc5MzM2NzMzMiwianRpIjoiOTYzZDY0MTEtYjk1NS00NTljLTljYzMtNmVkZjZkNWNlNzhmIiwic2lkIjoiMTUyMTkxYTYtNzg3Yy00NDhiLTg3MzEtYjcyODI1NjBhODgzIn0.Y-3Cz3gMGZ438naUWSdpZGppa0yncASX2_mBTRi9Ia8",
  "access_expires_at": "2026-10-30T13:50:32.379388847Z",
  "refresh_token": "Y50dj1C1aXU9Nt1VcnWGDRek6H9EpVxal3MTh5Y549M",
  "refresh_expires_at": "2026-10-31T01:35:32.37881617Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "f456f22f-e8f3-4dc2-9e65-54deeebac4e0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "7b291091-b6e4-45c5-923e-92568df362d1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:32.654018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7b291091-b6e4-45c5-923e-92568df362d1` → **200**

```json
{
  "id": "7b291091-b6e4-45c5-923e-92568df362d1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:32.654018Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7b291091-b6e4-45c5-923e-92568df362d1` → **200**

```json
{
  "id": "7b291091-b6e4-45c5-923e-92568df362d1",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:35:32.654018Z",
  "ready_at": "2026-10-30T13:35:33.969985Z",
  "expires_at": "2026-10-31T13:35:33.969985Z"
}
```

`GET /api/admin/v1/reports/exports/7b291091-b6e4-45c5-923e-92568df362d1/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "00ca7700-b2f4-46d7-a76d-094fc2aa5bff",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "29828646-7db4-4d78-95fa-8d012c0b38c8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:34.51301Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29828646-7db4-4d78-95fa-8d012c0b38c8` → **200**

```json
{
  "id": "29828646-7db4-4d78-95fa-8d012c0b38c8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:34.51301Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29828646-7db4-4d78-95fa-8d012c0b38c8` → **200**

```json
{
  "id": "29828646-7db4-4d78-95fa-8d012c0b38c8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:34.51301Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29828646-7db4-4d78-95fa-8d012c0b38c8` → **200**

```json
{
  "id": "29828646-7db4-4d78-95fa-8d012c0b38c8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:34.51301Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29828646-7db4-4d78-95fa-8d012c0b38c8` → **200**

```json
{
  "id": "29828646-7db4-4d78-95fa-8d012c0b38c8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T13:35:34.51301Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29828646-7db4-4d78-95fa-8d012c0b38c8` → **200**

```json
{
  "id": "29828646-7db4-4d78-95fa-8d012c0b38c8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T13:35:34.51301Z",
  "ready_at": "2026-10-30T13:35:38.978443Z",
  "expires_at": "2026-10-31T13:35:38.978443Z"
}
```

`GET /api/admin/v1/reports/exports/29828646-7db4-4d78-95fa-8d012c0b38c8/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/468fee60-c23f-4ec3-a95f-423caf7154a2` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/468fee60-c23f-4ec3-a95f-423caf7154a2",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a9a87de7-ea25-43f2-a022-9241e9363e51"
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
  "session_id": "dfd49f03-3c41-4c74-9df6-3a053f8abe5a",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNDAsImlhdCI6MTc5MzM2NzM0MCwianRpIjoiNjdiNTBlZjUtYzdiZS00ZjQwLThlMGQtN2FhMTc0NzZiMDI0Iiwic2lkIjoiZGZkNDlmMDMtM2M0MS00Yzc0LTlkZjYtM2EwNTNmOGFiZTVhIn0.8CdyKz784TKUm6q_sYk-fHXWUHQsjYQvgtnWSd7z2sM",
  "access_expires_at": "2026-10-30T13:50:40.746076379Z",
  "refresh_token": "CYO55ALbX5yOlbhX1_BLS3WBopT60rPKUediMTOq2uA",
  "refresh_expires_at": "2026-10-31T01:35:40.745565201Z",
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
  "command_id": "381b2121-1ed0-4b3e-aff0-d6cc319d82c6",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:35:41.312454405Z"
}
```

`POST /sandbox/v1/retention/fixtures/83eacf58-26ef-441d-abf6-cffbcb45229b` → **200**

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

`GET /sandbox/v1/retention/fixtures/83eacf58-26ef-441d-abf6-cffbcb45229b` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/83eacf58-26ef-441d-abf6-cffbcb45229b` → **204**

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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T13:35:41.312454Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "2eeb3652-6f19-48cd-859a-92eb1d7b8ee3",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T13:35:41.977517404Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25599"
}
```

```json
{
  "challenge_id": "6d20eb38-933c-41c8-8e16-68ec35a92a2c",
  "expires_at": "2026-10-30T13:40:42.275147696Z",
  "resend_available_at": "2026-10-30T13:35:43.275147696Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "651346",
  "sent_at": "2026-10-30T13:35:42.278705603Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6d20eb38-933c-41c8-8e16-68ec35a92a2c",
  "code": "651346",
  "device_ref": "sandbox-25599"
}
```

```json
{
  "session_id": "e78459aa-3c7c-4f1b-9430-e072c7fb89ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI0MiwiaWF0IjoxNzkzMzY3MzQyLCJqdGkiOiIxNjQ0MzFiYS05NDgxLTQ4YjgtODE2MC1iMDk3OGRjNTkzOTkiLCJzaWQiOiJlNzg0NTlhYS0zYzdjLTRmMWItOTQzMC1lMDcyYzdmYjg5ZWUifQ.97CTwvfi5TTcfaICIoYp9JGTvkWiNztKRnkpHYguJgU",
  "access_expires_at": "2026-10-30T13:50:42.584051783Z",
  "refresh_token": "0peVxlamsjc8FzTiE4JlBklM_bmTVq64q6VrBBTt4-Y",
  "refresh_expires_at": "2026-11-29T13:35:42.583494422Z",
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
  "command_id": "49ca970d-64f8-447e-acfc-611df99e0acb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:35:43Z",
    "sequence": 1793367343436
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fbfbee1e-8cdf-49aa-959b-b2fa673139fe",
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
  "last_heartbeat_at": "2026-10-30T13:35:43.451209Z",
  "last_location_at": "2026-10-30T13:35:43.451209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "7735f4cc-9576-46ea-8e26-759bdbe43495",
  "points": [
    {
      "sequence": 1793367345730,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:34:45Z"
    },
    {
      "sequence": 1793367345736,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T13:35:45Z"
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
  "session_id": "71b474bf-21c0-4c92-b5cd-082dddfe2cc1",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNDYsImlhdCI6MTc5MzM2NzM0NiwianRpIjoiZDhhNmRkOGYtYTlkMi00ZGIyLWI1MjctYjY2ZmFmZjRjY2ZhIiwic2lkIjoiNzFiNDc0YmYtMjFjMC00YzkyLWI1Y2QtMDgyZGRkZmUyY2MxIn0.06nLUdn2h_j4PFue9NB-629gf1Pd633RAN3CuHgqxsk",
  "access_expires_at": "2026-10-30T13:50:46.322051845Z",
  "refresh_token": "cvVv1TLo7gpoeaSxjQHnEg7MXc9PxxpMcEmWLo0wGEQ",
  "refresh_expires_at": "2026-10-31T01:35:46.321465291Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "8ae1355c-24f6-400a-812e-c6afb317bb35",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T13:35:45Z",
        "track_point_id": "37a8eec0-c2c4-427e-a302-5491a991344e",
        "work_session_id": "fbfbee1e-8cdf-49aa-959b-b2fa673139fe"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T13:35:45Z",
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
  "history": [],
  "duplicates": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/8ae1355c-24f6-400a-812e-c6afb317bb35/confirm` → **200**

```json
{
  "command_id": "7af5557a-9606-4536-9e6d-0193a35e8052",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "8ae1355c-24f6-400a-812e-c6afb317bb35",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T13:35:45Z",
    "track_point_id": "37a8eec0-c2c4-427e-a302-5491a991344e",
    "work_session_id": "fbfbee1e-8cdf-49aa-959b-b2fa673139fe"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T13:35:45Z",
  "reason": null,
  "reviewed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reviewed_at": "2026-10-30T13:35:47.17642Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/8ae1355c-24f6-400a-812e-c6afb317bb35/dismiss` → **409**

```json
{
  "command_id": "53f80354-8f84-43fb-8f08-a1248cd92900",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/8ae1355c-24f6-400a-812e-c6afb317bb35/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1b859057-9e25-41ef-9016-d72b19ea1084"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "c066bc31-1b4f-484f-8070-efdd9c770d01",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "33f84607-706d-4786-9f31-d8c4e7889865",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "raised_at": "2026-10-30T13:35:47.731857Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/33f84607-706d-4786-9f31-d8c4e7889865/dismiss` → **200**

```json
{
  "command_id": "93c3f7fa-02c0-43da-aceb-d7e76f7b1485",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "33f84607-706d-4786-9f31-d8c4e7889865",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "raised_at": "2026-10-30T13:35:47.731857Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reviewed_at": "2026-10-30T13:35:48.004968Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "fbd86d3d-8289-4f43-880d-eea92a69cf32",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "8ae1355c-24f6-400a-812e-c6afb317bb35"
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
      "actor_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:35:48.301276Z"
    }
  ],
  "duplicates": []
}
```

Done: flag 8ae1355c-24f6-400a-812e-c6afb317bb35 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "43efa38a-23da-42c8-b012-0230105acd56",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNDksImlhdCI6MTc5MzM2NzM0OSwianRpIjoiZTg4MWZjNTgtZDQ2ZS00YWQ5LWFkZjYtYjc4MWZmYWQ1MGIzIiwic2lkIjoiNDNlZmEzOGEtMjNkYS00MmM4LWIwMTItMDIzMDEwNWFjZDU2In0.zVUcRgfx18jgbIgnPMFxwPCPyWNyzS66wNYTpLHUkfc",
  "access_expires_at": "2026-10-30T13:50:49.155108985Z",
  "refresh_token": "9kV05RoxpAeXUbaxiI5jTis7StcQFdhM1tvOgfOy1XM",
  "refresh_expires_at": "2026-10-31T01:35:49.154576108Z",
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
      "actor_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:35:48.301276Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "2752514a-963e-468d-8cfe-6cfdddf16f13",
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
  "session_id": "fbfbee1e-8cdf-49aa-959b-b2fa673139fe",
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
  "last_heartbeat_at": "2026-10-30T13:35:43.451209Z",
  "last_location_at": "2026-10-30T13:35:43.451209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fbfbee1e-8cdf-49aa-959b-b2fa673139fe/close` → **200**

```json
{
  "command_id": "fe70076a-0737-47d9-88bd-a0257354d8c2",
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
  "session_id": "891177e0-1367-49f7-ac6f-93c50423a7df",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNTAsImlhdCI6MTc5MzM2NzM1MCwianRpIjoiMGZjOTA4MzctY2I3OC00YWU4LWFkOWUtZGMwYjFlYjliMTY4Iiwic2lkIjoiODkxMTc3ZTAtMTM2Ny00OWY3LWFjNmYtOTNjNTA0MjNhN2RmIn0.NrYi8pcrgXlR14WIQlmHo4vdthvuOq6zHelA_1xMFq8",
  "access_expires_at": "2026-10-30T13:50:50.858849527Z",
  "refresh_token": "HcTawSsGIXdlwzr9IS_hdhlBJpuXg8CRp3SUYzCcF3Q",
  "refresh_expires_at": "2026-10-31T01:35:50.858309039Z",
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
  "command_id": "6eb8ee4c-a319-4b70-9c60-f01826f56a12",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:35:51.433093Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "6eb8ee4c-a319-4b70-9c60-f01826f56a12",
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
  "changed_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T13:35:51.433093Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48114854840",
  "device_ref": "sandbox-14423"
}
```

```json
{
  "challenge_id": "dc3b3bcf-294a-4cc2-9947-a0e09378f3df",
  "expires_at": "2026-10-30T13:40:52.002893801Z",
  "resend_available_at": "2026-10-30T13:35:53.002893801Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48114854840` → **200**

```json
{
  "phone": "+48114854840",
  "audience": "CLIENT",
  "code": "212001",
  "sent_at": "2026-10-30T13:35:52.006223299Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc3b3bcf-294a-4cc2-9947-a0e09378f3df",
  "code": "212001",
  "device_ref": "sandbox-14423"
}
```

```json
{
  "session_id": "5903fefa-070d-4e44-bc5b-1e26ed028c60",
  "subject": {
    "type": "CLIENT",
    "id": "41e264e7-d679-4ef6-a87d-9225b98dc853"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MWUyNjRlNy1kNjc5LTRlZjYtYTg3ZC05MjI1Yjk4ZGM4NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MjUyLCJpYXQiOjE3OTMzNjczNTIsImp0aSI6ImM1NzU2YzVkLTdkYTktNDM2My1hMTI3LWQ2NGVjNjRjNGFkMSIsInNpZCI6IjU5MDNmZWZhLTA3MGQtNGU0NC1iYzViLTFlMjZlZDAyOGM2MCJ9.vNfOpP_AQ5MLqcC_rsByU81uuwAG2zaH8shl7P2_xZY",
  "access_expires_at": "2026-10-30T13:50:52.303805079Z",
  "refresh_token": "0MG0E9DnjBr_bvw32B06__qLosD49KNd7V0RqIXgyQ0",
  "refresh_expires_at": "2026-11-29T13:35:52.303244858Z",
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
  "correlation_id": "36d7e373-6bd6-42df-aecd-9751ce39a63e"
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
  "device_ref": "sandbox-20417"
}
```

```json
{
  "challenge_id": "d568df6c-7c4c-46d2-b0ac-501bba8a80cc",
  "expires_at": "2026-10-30T13:40:53.131794332Z",
  "resend_available_at": "2026-10-30T13:35:54.131794332Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "010124",
  "sent_at": "2026-10-30T13:35:53.134513977Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d568df6c-7c4c-46d2-b0ac-501bba8a80cc",
  "code": "010124",
  "device_ref": "sandbox-20417"
}
```

```json
{
  "session_id": "6efae658-bb4a-4167-b47b-df85534dc5ac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI1MywiaWF0IjoxNzkzMzY3MzUzLCJqdGkiOiJmNzRjZDgwMS04YzFhLTRmYzEtYTg1Ny1hZDFhOTQ3ZWNmMDYiLCJzaWQiOiI2ZWZhZTY1OC1iYjRhLTQxNjctYjQ3Yi1kZjg1NTM0ZGM1YWMifQ.xttpi3ikOO1kcIr7FArI-wQ79VcTaYyUSohfZ-y7Lfg",
  "access_expires_at": "2026-10-30T13:50:53.446272526Z",
  "refresh_token": "-wfZbleCP0qgh9SNYY6ZOWkWLwz4VFk6ldVTmRZYOrk",
  "refresh_expires_at": "2026-11-29T13:35:53.445772943Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d39986b-405b-4cfa-8b9e-ebb1a7f8e969",
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
  "last_heartbeat_at": "2026-10-30T13:34:34.189493Z",
  "last_location_at": "2026-10-30T13:34:34.189493Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4d39986b-405b-4cfa-8b9e-ebb1a7f8e969/handover` → **200**

```json
{
  "command_id": "01558ef3-2a08-4a0e-bf7a-1a0566de97f1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d39986b-405b-4cfa-8b9e-ebb1a7f8e969",
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
  "last_heartbeat_at": "2026-10-30T13:34:34.189493Z",
  "last_location_at": "2026-10-30T13:34:34.189493Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4d39986b-405b-4cfa-8b9e-ebb1a7f8e969/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:35:54Z",
    "sequence": 1793367354308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d39986b-405b-4cfa-8b9e-ebb1a7f8e969",
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
  "last_heartbeat_at": "2026-10-30T13:35:54.325832Z",
  "last_location_at": "2026-10-30T13:35:54.325832Z",
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
  "session_id": "4d39986b-405b-4cfa-8b9e-ebb1a7f8e969",
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
  "last_heartbeat_at": "2026-10-30T13:35:54.325832Z",
  "last_location_at": "2026-10-30T13:35:54.325832Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4d39986b-405b-4cfa-8b9e-ebb1a7f8e969/close` → **200**

```json
{
  "command_id": "b0cc7287-1470-43d4-aeea-c2c18632e2ed",
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
  "correlation_id": "f0882e57-1e9f-4b8c-a6b0-fc3a2ab167c5"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676638434",
  "device_ref": "sandbox-4299"
}
```

```json
{
  "challenge_id": "40e76707-4996-4994-a7ff-12be08914d61",
  "expires_at": "2026-10-30T13:40:55.725711945Z",
  "resend_available_at": "2026-10-30T13:35:56.725711945Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676638434` → **200**

```json
{
  "phone": "+380676638434",
  "audience": "CLIENT",
  "code": "409109",
  "sent_at": "2026-10-30T13:35:55.728311352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40e76707-4996-4994-a7ff-12be08914d61",
  "code": "409109",
  "device_ref": "sandbox-4299"
}
```

```json
{
  "session_id": "d364583c-243c-43be-9788-66b6cd09c528",
  "subject": {
    "type": "CLIENT",
    "id": "536c8597-d375-4407-b0b3-fb6e9fb086a7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzZjODU5Ny1kMzc1LTQ0MDctYjBiMy1mYjZlOWZiMDg2YTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MjU2LCJpYXQiOjE3OTMzNjczNTYsImp0aSI6IjIwNGNkMzU3LThkZmQtNGUwMi1hYzRjLTZmN2EyODkzZjM4NyIsInNpZCI6ImQzNjQ1ODNjLTI0M2MtNDNiZS05Nzg4LTY2YjZjZDA5YzUyOCJ9.FH2w_OcsBgojyao3FSv5Mh2kJxXUYUwT-5COKpUgQBk",
  "access_expires_at": "2026-10-30T13:50:56.018925973Z",
  "refresh_token": "78lLyiVaO5IeNMN0vpJLRuZIdSSdC22hc3pG2EMlAAI",
  "refresh_expires_at": "2026-11-29T13:35:56.018471688Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "040ede87-3083-4117-ba44-20e25ba4c5b0",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "c8b5ec82-ca9d-489d-8f8b-8ceeb9c6c194",
  "upload_path": "/api/rider/v1/uploads/c8b5ec82-ca9d-489d-8f8b-8ceeb9c6c194",
  "expires_at": "2026-10-30T13:50:56.314842777Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/c8b5ec82-ca9d-489d-8f8b-8ceeb9c6c194` → **200**

```json
{
  "file_id": "c8b5ec82-ca9d-489d-8f8b-8ceeb9c6c194",
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
  "command_id": "24d07829-6a6f-4773-b9d3-f3e9a96bc6a9",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "ef7f3375-cfb6-4247-ade8-42d1a49d0201",
  "upload_path": "/api/rider/v1/uploads/ef7f3375-cfb6-4247-ade8-42d1a49d0201",
  "expires_at": "2026-10-30T13:50:56.619244409Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/ef7f3375-cfb6-4247-ade8-42d1a49d0201` → **200**

```json
{
  "file_id": "ef7f3375-cfb6-4247-ade8-42d1a49d0201",
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
  "command_id": "aa661ee9-7eed-454c-8f30-3b60b6d97f3d",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b82df18e-7486-4b96-b4ad-30fe6c8a2c6b",
  "upload_path": "/api/rider/v1/uploads/b82df18e-7486-4b96-b4ad-30fe6c8a2c6b",
  "expires_at": "2026-10-30T13:50:56.924965288Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/b82df18e-7486-4b96-b4ad-30fe6c8a2c6b` → **200**

```json
{
  "file_id": "b82df18e-7486-4b96-b4ad-30fe6c8a2c6b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "ed5b77d4-cc27-4d0c-bce0-d56a6b1b2b5f",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "b82df18e-7486-4b96-b4ad-30fe6c8a2c6b"
  ]
}
```

```json
{
  "id": "60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "536c8597-d375-4407-b0b3-fb6e9fb086a7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:35:57.23246Z",
  "updated_at": "2026-10-30T13:35:57.23246Z",
  "respond_by": "2026-10-30T17:35:57.23246Z",
  "messages": [
    {
      "id": "42a796fa-0a11-4b8a-ba79-7edabcd010b9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "536c8597-d375-4407-b0b3-fb6e9fb086a7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:35:57.233613Z",
      "attachments": [
        {
          "file_id": "b82df18e-7486-4b96-b4ad-30fe6c8a2c6b",
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
  "session_id": "aad3f3ee-527d-44d9-b2ee-79183043f073",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNTcsImlhdCI6MTc5MzM2NzM1NywianRpIjoiZGNlOWZmMzYtY2Y2MC00ZTQzLTk0NWQtMjRmZTBmZGZmZDc5Iiwic2lkIjoiYWFkM2YzZWUtNTI3ZC00NGQ5LWIyZWUtNzkxODMwNDNmMDczIn0.am4h5fUqBWAufTmEruhCRtFrmDfkuAchqs6JeGLIg-g",
  "access_expires_at": "2026-10-30T13:50:57.821872383Z",
  "refresh_token": "k3yqQoUDoINqfR3s2amZyzP33VSCb-eqqm7_rFky2G4",
  "refresh_expires_at": "2026-10-31T01:35:57.82134687Z",
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
  "session_id": "f4831a1a-4eeb-4f46-8ef9-f1ab9f7deaad",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNTgsImlhdCI6MTc5MzM2NzM1OCwianRpIjoiNzYyMjNjYzQtMTY3OS00NDhjLThjMjEtMDY1OTJhNzMwOTYzIiwic2lkIjoiZjQ4MzFhMWEtNGVlYi00ZjQ2LThlZjktZjFhYjlmN2RlYWFkIn0.Iw5jTxj88lGAsG8CazoILLtGPP1UdikcqoEAXq9Fn48",
  "access_expires_at": "2026-10-30T13:50:58.386527446Z",
  "refresh_token": "oMxAgc3JfKzVvVoyD9qEthocZwKDzEjjY_9rdvAW1nA",
  "refresh_expires_at": "2026-10-31T01:35:58.385988988Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5/attachments/b82df18e-7486-4b96-b4ad-30fe6c8a2c6b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "f6c17f9a-b1ca-45c7-9ac7-c8099c3df96b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b717d633-9a5b-4c77-bb73-68d59025faab",
  "upload_path": "/api/operator/v1/uploads/b717d633-9a5b-4c77-bb73-68d59025faab",
  "expires_at": "2026-10-30T13:50:58.66959245Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b717d633-9a5b-4c77-bb73-68d59025faab` → **200**

```json
{
  "file_id": "b717d633-9a5b-4c77-bb73-68d59025faab",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5` → **200**

```json
{
  "id": "60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "536c8597-d375-4407-b0b3-fb6e9fb086a7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T13:35:57.23246Z",
  "updated_at": "2026-10-30T13:35:57.23246Z",
  "respond_by": "2026-10-30T17:35:57.23246Z",
  "messages": [
    {
      "id": "42a796fa-0a11-4b8a-ba79-7edabcd010b9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "536c8597-d375-4407-b0b3-fb6e9fb086a7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:35:57.233613Z",
      "attachments": [
        {
          "file_id": "b82df18e-7486-4b96-b4ad-30fe6c8a2c6b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5/comments` → **200**

```json
{
  "command_id": "9ae48446-b352-4751-a568-67ed1cb2d04c",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b717d633-9a5b-4c77-bb73-68d59025faab"
  ]
}
```

```json
{
  "id": "60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "536c8597-d375-4407-b0b3-fb6e9fb086a7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:35:57.23246Z",
  "updated_at": "2026-10-30T13:35:59.271901Z",
  "respond_by": "2026-10-30T17:35:57.23246Z",
  "messages": [
    {
      "id": "42a796fa-0a11-4b8a-ba79-7edabcd010b9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "536c8597-d375-4407-b0b3-fb6e9fb086a7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:35:57.233613Z",
      "attachments": [
        {
          "file_id": "b82df18e-7486-4b96-b4ad-30fe6c8a2c6b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "26ccda2a-26fb-447d-acd6-c4b8e9111346",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:35:59.271293Z",
      "attachments": [
        {
          "file_id": "b717d633-9a5b-4c77-bb73-68d59025faab",
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

`GET /api/rider/v1/support/cases/60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5` → **200**

```json
{
  "id": "60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "536c8597-d375-4407-b0b3-fb6e9fb086a7",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T13:35:57.23246Z",
  "updated_at": "2026-10-30T13:35:59.271901Z",
  "respond_by": "2026-10-30T17:35:57.23246Z",
  "messages": [
    {
      "id": "42a796fa-0a11-4b8a-ba79-7edabcd010b9",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "536c8597-d375-4407-b0b3-fb6e9fb086a7",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T13:35:57.233613Z",
      "attachments": [
        {
          "file_id": "b82df18e-7486-4b96-b4ad-30fe6c8a2c6b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "26ccda2a-26fb-447d-acd6-c4b8e9111346",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T13:35:59.271293Z",
      "attachments": [
        {
          "file_id": "b717d633-9a5b-4c77-bb73-68d59025faab",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5/attachments/b717d633-9a5b-4c77-bb73-68d59025faab` → **200**

Done: support case 60fa7bb6-8f63-4bc9-97cb-a7f14fc71be5, rider attachment b82df18e-7486-4b96-b4ad-30fe6c8a2c6b, operator attachment b717d633-9a5b-4c77-bb73-68d59025faab.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738395072",
  "device_ref": "sandbox-31953"
}
```

```json
{
  "challenge_id": "975cbfea-1f36-4a31-9a82-899af5cbb166",
  "expires_at": "2026-10-30T13:40:59.873409176Z",
  "resend_available_at": "2026-10-30T13:36:00.873409176Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738395072` → **200**

```json
{
  "phone": "+380738395072",
  "audience": "CLIENT",
  "code": "401752",
  "sent_at": "2026-10-30T13:35:59.877223192Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "975cbfea-1f36-4a31-9a82-899af5cbb166",
  "code": "401752",
  "device_ref": "sandbox-31953"
}
```

```json
{
  "session_id": "71404c1e-48be-4cea-ab9d-26759a82517e",
  "subject": {
    "type": "CLIENT",
    "id": "941d4501-afc0-4f56-9d82-e6e231c81768"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDFkNDUwMS1hZmMwLTRmNTYtOWQ4Mi1lNmUyMzFjODE3NjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MjYwLCJpYXQiOjE3OTMzNjczNjAsImp0aSI6IjY1NTA3NTliLTRjYjAtNGU5NC1iZDFhLTc2ZTYzMWVkM2QzOCIsInNpZCI6IjcxNDA0YzFlLTQ4YmUtNGNlYS1hYjlkLTI2NzU5YTgyNTE3ZSJ9.IPBiTvOuMWuYCOrwfbVZ7sWzpnxVJ2XCZjAsSAaXodE",
  "access_expires_at": "2026-10-30T13:51:00.173266279Z",
  "refresh_token": "_X5dMxLHRlOKNCyYWlYwpPCKGZ-tzmQK50tf74Zv7lc",
  "refresh_expires_at": "2026-11-29T13:36:00.172714867Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "068eab50-2f30-4cff-907c-6dd6716da17e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "a6780981-32c0-4d36-86fd-3be00f4ee843",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-a6780981-32c0-4d36-86fd-3be00f4ee843",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "17a30e96ad53fac4c0212787b8bf26fa",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=a6780981-32c0-4d36-86fd-3be00f4ee843",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738395072"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=a6780981-32c0-4d36-86fd-3be00f4ee843",
  "expires_at": "2026-10-30T14:06:00.444286Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/a6780981-32c0-4d36-86fd-3be00f4ee843` → **200**

```json
{
  "id": "a6780981-32c0-4d36-86fd-3be00f4ee843",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T14:06:00.444286Z",
  "card": {
    "id": "d165745d-fe03-47b1-9a1b-a3ce0eb24577",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3651",
    "card_type": "Visa",
    "created_at": "2026-10-30T13:36:00.723382Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "064ab071-cc2e-400c-9302-a39dcc081e30",
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
  "id": "8da6ce8e-c403-4562-ae89-bcb1403f1d3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:41:01.019154Z",
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
  "command_id": "88268e76-5452-4e63-8f77-f8093eef2ddd",
  "quote_id": "8da6ce8e-c403-4562-ae89-bcb1403f1d3a",
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
  "id": "a1d9733c-2706-4828-b878-3b3de8b06f5f",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "941d4501-afc0-4f56-9d82-e6e231c81768",
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
  "created_at": "2026-10-30T13:36:01.301476Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1d9733c-2706-4828-b878-3b3de8b06f5f` → **200**

```json
{
  "id": "a1d9733c-2706-4828-b878-3b3de8b06f5f",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "941d4501-afc0-4f56-9d82-e6e231c81768",
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
  "created_at": "2026-10-30T13:36:01.301476Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a1d9733c-2706-4828-b878-3b3de8b06f5f` → **200**

```json
{
  "id": "a1d9733c-2706-4828-b878-3b3de8b06f5f",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "941d4501-afc0-4f56-9d82-e6e231c81768",
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
  "created_at": "2026-10-30T13:36:01.301476Z",
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

`GET /api/rider/v1/orders/a1d9733c-2706-4828-b878-3b3de8b06f5f` → **200**

```json
{
  "id": "a1d9733c-2706-4828-b878-3b3de8b06f5f",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "941d4501-afc0-4f56-9d82-e6e231c81768",
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
  "created_at": "2026-10-30T13:36:01.301476Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a1d9733c-2706-4828-b878-3b3de8b06f5f/switch-to-cash` → **200**

```json
{
  "command_id": "4660dd99-4d0a-4b86-a359-8b41d6a9f04a",
  "expected_version": 3
}
```

```json
{
  "id": "a1d9733c-2706-4828-b878-3b3de8b06f5f",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "941d4501-afc0-4f56-9d82-e6e231c81768",
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
  "created_at": "2026-10-30T13:36:01.301476Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a1d9733c-2706-4828-b878-3b3de8b06f5f/switch-to-cash` → **409**

```json
{
  "command_id": "9990a863-544f-4340-8887-be6ba771b384",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/a1d9733c-2706-4828-b878-3b3de8b06f5f/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e8908cae-bd5d-4082-9640-31b51c72175c"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/a1d9733c-2706-4828-b878-3b3de8b06f5f` → **200**

```json
{
  "id": "a1d9733c-2706-4828-b878-3b3de8b06f5f",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "941d4501-afc0-4f56-9d82-e6e231c81768",
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
  "created_at": "2026-10-30T13:36:01.301476Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a1d9733c-2706-4828-b878-3b3de8b06f5f/cancel` → **200**

```json
{
  "command_id": "78622559-f2c1-4742-b235-50dc615248be",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a1d9733c-2706-4828-b878-3b3de8b06f5f",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "941d4501-afc0-4f56-9d82-e6e231c81768",
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
  "created_at": "2026-10-30T13:36:01.301476Z",
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
  "session_id": "4e367de8-9916-46b0-a10f-5460ce358903",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyNjQsImlhdCI6MTc5MzM2NzM2NCwianRpIjoiMWRhZWY2MmItNDc5Mi00MjhlLTg3ZDEtMGU1ZWJiM2NhNTEyIiwic2lkIjoiNGUzNjdkZTgtOTkxNi00NmIwLWExMGYtNTQ2MGNlMzU4OTAzIn0.C2jEAfDi03ybLykLJz62Jq-_O3UsbcKdTvrJqZbBrgY",
  "access_expires_at": "2026-10-30T13:51:04.999293534Z",
  "refresh_token": "aS-77sFh2EIX0vs7KNL-ihV_ZHukoX4xh1t6hqJTaaI",
  "refresh_expires_at": "2026-10-31T01:36:04.998696516Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30848"
}
```

```json
{
  "challenge_id": "87b0735d-d79b-49a3-bd0e-cd785b5cd7ed",
  "expires_at": "2026-10-30T13:41:05.270281459Z",
  "resend_available_at": "2026-10-30T13:36:06.270281459Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "206914",
  "sent_at": "2026-10-30T13:36:05.273066305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "87b0735d-d79b-49a3-bd0e-cd785b5cd7ed",
  "code": "206914",
  "device_ref": "sandbox-30848"
}
```

```json
{
  "session_id": "04921b65-82de-4380-9f30-860de1d6deb2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI2NSwiaWF0IjoxNzkzMzY3MzY1LCJqdGkiOiJhZjhmOWE3Ni1jZWZjLTQxYWMtYjAzMS04YWVmNTg0MmNjMDkiLCJzaWQiOiIwNDkyMWI2NS04MmRlLTQzODAtOWYzMC04NjBkZTFkNmRlYjIifQ._i_Dl-ebVlycOB2UcGSChNaFnaNuj96RN_XSZ2TcS_o",
  "access_expires_at": "2026-10-30T13:51:05.57343767Z",
  "refresh_token": "9J65q7zcQxCvCYrqt_wwInhHOXszpD_eeOONZ0QeC5Q",
  "refresh_expires_at": "2026-11-29T13:36:05.572904463Z",
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
      "actor_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T13:35:48.301276Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T13:35:49.721422Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "9883378b-3a96-49f3-8c5d-a9d35295a86c",
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
  "device_ref": "sandbox-29308"
}
```

```json
{
  "challenge_id": "47e42ab8-058d-46a8-8d43-08d8beb4a681",
  "expires_at": "2026-10-30T13:41:06.720306186Z",
  "resend_available_at": "2026-10-30T13:36:07.720306186Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "070487",
  "sent_at": "2026-10-30T13:36:06.722647275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47e42ab8-058d-46a8-8d43-08d8beb4a681",
  "code": "070487",
  "device_ref": "sandbox-29308"
}
```

```json
{
  "session_id": "33cc1dab-b240-43c4-923d-35ef5c7243aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI2NywiaWF0IjoxNzkzMzY3MzY3LCJqdGkiOiJiY2NjOWQ3OS02NzAxLTQwYjAtOWYxNS03ZWI1ZmQzNjg3MWQiLCJzaWQiOiIzM2NjMWRhYi1iMjQwLTQzYzQtOTIzZC0zNWVmNWM3MjQzYWEifQ.3qSCclC4aC40Bc5X-no5EX-S6lgjg50--QNX3U46IYY",
  "access_expires_at": "2026-10-30T13:51:07.024819331Z",
  "refresh_token": "mZyqaHUL87WpF5SfOek90JmjwhWccbIS_NuuE5xNs80",
  "refresh_expires_at": "2026-11-29T13:36:07.024294824Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "95b5772c-43e5-42ec-87b1-70cf144b2773",
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
  "last_heartbeat_at": "2026-10-30T13:35:29.25656Z",
  "last_location_at": "2026-10-30T13:35:29.25656Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/95b5772c-43e5-42ec-87b1-70cf144b2773/handover` → **200**

```json
{
  "command_id": "d93abe5f-909f-4bb6-b675-c64e35d0d0db",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "95b5772c-43e5-42ec-87b1-70cf144b2773",
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
  "last_heartbeat_at": "2026-10-30T13:35:29.25656Z",
  "last_location_at": "2026-10-30T13:35:29.25656Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 11 s to the next point)

`POST /api/driver/v1/work-sessions/95b5772c-43e5-42ec-87b1-70cf144b2773/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:36:18Z",
    "sequence": 1793367378894
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "95b5772c-43e5-42ec-87b1-70cf144b2773",
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
  "last_heartbeat_at": "2026-10-30T13:36:18.910058Z",
  "last_location_at": "2026-10-30T13:36:18.910058Z",
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
  "command_id": "412d6d11-1dd1-4065-b3f8-e6310248bbbd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:36:19Z",
    "sequence": 1793367379468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a7df3cf2-814f-4a46-bc4a-0e7a0445af58",
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
  "last_heartbeat_at": "2026-10-30T13:36:19.483877Z",
  "last_location_at": "2026-10-30T13:36:19.483877Z",
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
  "session_id": "4ce943fb-5bca-4c36-97eb-f55de5be2a40",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjgyODAsImlhdCI6MTc5MzM2NzM4MCwianRpIjoiNjcyYWQ2MDUtYjZlMi00ZGVmLWI5ZWEtYTg0YWM4M2E3YjgzIiwic2lkIjoiNGNlOTQzZmItNWJjYS00YzM2LTk3ZWItZjU1ZGU1YmUyYTQwIn0.8_7Tje_fp9Qfaq8r9P38JU-_AYefTN0Znx5J-aIaXTA",
  "access_expires_at": "2026-10-30T13:51:20.042042788Z",
  "refresh_token": "BCVP1NJcZdd0eOY4p4TYU0HmpEb76p4nT9Pm7bbKths",
  "refresh_expires_at": "2026-10-31T01:36:20.041484779Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9aff7544-5053-409a-b5f1-4149464f0c42",
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
  "id": "26521cad-407d-4a88-adf8-0f0f0a720036",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:41:20.318379Z",
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
  "command_id": "9911d96a-44f8-437a-a30a-df72e15f2527",
  "quote_id": "26521cad-407d-4a88-adf8-0f0f0a720036",
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
  "id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
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
  "created_at": "2026-10-30T13:36:20.596818Z",
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
    "id": "23a64696-8cf4-4c18-bfce-206f799b3b50",
    "order_id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
    "expires_at": "2026-10-30T13:36:35.600867Z",
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

`POST /api/driver/v1/offers/23a64696-8cf4-4c18-bfce-206f799b3b50/accept` → **200**

```json
{
  "command_id": "d5b8bbc3-abae-4299-8497-ff539933133d"
}
```

```json
{
  "id": "eebd683f-80ae-44e9-8539-48754b279ee0",
  "order_id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "76f5de6a-5f8e-4111-8d19-efb1ae69ac0d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "76f5de6a-5f8e-4111-8d19-efb1ae69ac0d",
  "order_id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
  "assignment_id": "eebd683f-80ae-44e9-8539-48754b279ee0",
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

(the car drives 10 s to the next point)

`POST /api/driver/v1/work-sessions/a7df3cf2-814f-4a46-bc4a-0e7a0445af58/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T13:36:31Z",
    "sequence": 1793367391991
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a7df3cf2-814f-4a46-bc4a-0e7a0445af58",
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
  "last_heartbeat_at": "2026-10-30T13:36:32.007557Z",
  "last_location_at": "2026-10-30T13:36:32.007557Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/76f5de6a-5f8e-4111-8d19-efb1ae69ac0d/arrive` → **200**

```json
{
  "command_id": "6504a02b-787b-4a2a-a65e-338799dd57b2",
  "expected_version": 0
}
```

```json
{
  "id": "76f5de6a-5f8e-4111-8d19-efb1ae69ac0d",
  "order_id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
  "assignment_id": "eebd683f-80ae-44e9-8539-48754b279ee0",
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
  "arrived_at": "2026-10-30T13:36:32.303609Z",
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

`POST /api/driver/v1/trips/76f5de6a-5f8e-4111-8d19-efb1ae69ac0d/start` → **200**

```json
{
  "command_id": "79825bdc-ffc8-481b-9f2c-9b9ea81b91e1",
  "expected_version": 1
}
```

```json
{
  "id": "76f5de6a-5f8e-4111-8d19-efb1ae69ac0d",
  "order_id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
  "assignment_id": "eebd683f-80ae-44e9-8539-48754b279ee0",
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
  "arrived_at": "2026-10-30T13:36:32.303609Z",
  "started_at": "2026-10-30T13:36:32.594016Z",
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

`POST /api/driver/v1/trips/76f5de6a-5f8e-4111-8d19-efb1ae69ac0d/complete` → **200**

```json
{
  "command_id": "ed787712-485e-4d41-9d2f-4d763258edd8",
  "expected_version": 2,
  "reported_at": "2026-10-30T13:36:32Z",
  "cash_received": true
}
```

```json
{
  "id": "76f5de6a-5f8e-4111-8d19-efb1ae69ac0d",
  "order_id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
  "assignment_id": "eebd683f-80ae-44e9-8539-48754b279ee0",
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
  "arrived_at": "2026-10-30T13:36:32.303609Z",
  "started_at": "2026-10-30T13:36:32.594016Z",
  "completed_at": "2026-10-30T13:36:32.899693Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/fff586c9-0d0e-4f21-b22f-3ad88ee616d2` → **200**

```json
{
  "id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
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
    "id": "eebd683f-80ae-44e9-8539-48754b279ee0",
    "order_id": "fff586c9-0d0e-4f21-b22f-3ad88ee616d2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "76f5de6a-5f8e-4111-8d19-efb1ae69ac0d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T13:36:20.596818Z",
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
  "session_id": "95b5772c-43e5-42ec-87b1-70cf144b2773",
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
  "last_heartbeat_at": "2026-10-30T13:36:18.910058Z",
  "last_location_at": "2026-10-30T13:36:18.910058Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/95b5772c-43e5-42ec-87b1-70cf144b2773/close` → **200**

```json
{
  "command_id": "a121c930-2e8d-4fcd-a470-814fc35e2775",
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
  "session_id": "a7df3cf2-814f-4a46-bc4a-0e7a0445af58",
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
  "last_heartbeat_at": "2026-10-30T13:36:32.007557Z",
  "last_location_at": "2026-10-30T13:36:32.007557Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a7df3cf2-814f-4a46-bc4a-0e7a0445af58/close` → **200**

```json
{
  "command_id": "013d7840-eca5-4ff1-952e-7057c0e7fa00",
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

Done: terminal order fff586c9-0d0e-4f21-b22f-3ad88ee616d2 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9988"
}
```

```json
{
  "challenge_id": "d96c1a00-4df1-446f-b451-644ab431fc29",
  "expires_at": "2026-10-30T13:41:37.917848394Z",
  "resend_available_at": "2026-10-30T13:36:38.917848394Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "862643",
  "sent_at": "2026-10-30T13:36:37.920496428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d96c1a00-4df1-446f-b451-644ab431fc29",
  "code": "862643",
  "device_ref": "sandbox-9988"
}
```

```json
{
  "session_id": "5beca3ca-ec32-4d6a-9d40-d0909d3b35aa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI5OCwiaWF0IjoxNzkzMzY3Mzk4LCJqdGkiOiJiM2I4YzA3Ni1mYjk2LTQ4YmUtYjcyNS1lMDllZTVmZDBlMTIiLCJzaWQiOiI1YmVjYTNjYS1lYzMyLTRkNmEtOWQ0MC1kMDkwOWQzYjM1YWEifQ.5swQ2ev-wSFJzAT2tPpzLp9gDIm3FBqmHEvjOBECffY",
  "access_expires_at": "2026-10-30T13:51:38.220581306Z",
  "refresh_token": "oIg6qt5EaEh4xbSCCx1z4I8H-uV-AZG-yZRiSu6Ft68",
  "refresh_expires_at": "2026-11-29T13:36:38.219915339Z",
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
  "device_ref": "sandbox-8079"
}
```

```json
{
  "challenge_id": "4276426b-c62e-488e-b0b0-2a7dfe9450cb",
  "expires_at": "2026-10-30T13:41:38.756781745Z",
  "resend_available_at": "2026-10-30T13:36:39.756781745Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "137426",
  "sent_at": "2026-10-30T13:36:38.759230696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4276426b-c62e-488e-b0b0-2a7dfe9450cb",
  "code": "137426",
  "device_ref": "sandbox-8079"
}
```

```json
{
  "session_id": "e9d90773-b1d1-4abd-8ea8-03f5ecb0cb5b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI5OSwiaWF0IjoxNzkzMzY3Mzk5LCJqdGkiOiJkZGQ3OWNlYi05ZmNkLTRkOGItOTYxYi1mMTA2ZjFlMjg0ODgiLCJzaWQiOiJlOWQ5MDc3My1iMWQxLTRhYmQtOGVhOC0wM2Y1ZWNiMGNiNWIifQ.bU0KKt2FnJqgB-vrauBFh8vi_n9L2dPQzPq9BLHvWpA",
  "access_expires_at": "2026-10-30T13:51:39.060424007Z",
  "refresh_token": "v0VbP6mEbVW3Y9aV0mN4WEByLZBnHB2WI7ex5EiHJ0I",
  "refresh_expires_at": "2026-11-29T13:36:39.059882343Z",
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
  "device_ref": "sandbox-18754"
}
```

```json
{
  "challenge_id": "677ec0c3-ade1-488d-8739-69f7d6c3433e",
  "expires_at": "2026-10-30T13:41:39.606851899Z",
  "resend_available_at": "2026-10-30T13:36:40.606851899Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "037725",
  "sent_at": "2026-10-30T13:36:39.609485195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "677ec0c3-ade1-488d-8739-69f7d6c3433e",
  "code": "037725",
  "device_ref": "sandbox-18754"
}
```

```json
{
  "session_id": "a768191b-5666-4271-87ab-510913e9645d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM2ODI5OSwiaWF0IjoxNzkzMzY3Mzk5LCJqdGkiOiI4OTVmZmRiZC1kZGE0LTQwOTQtYTcwZS1iNDI0N2JiMjJjODYiLCJzaWQiOiJhNzY4MTkxYi01NjY2LTQyNzEtODdhYi01MTA5MTNlOTY0NWQifQ.wXo1ONF3Q5KxK9shT3w7tfi_f-IWVatfsqBZwp4hGR0",
  "access_expires_at": "2026-10-30T13:51:39.91284828Z",
  "refresh_token": "XrRN4Lbgg8TlqiKoYc70ArEE2Vy6rWmAF35kBPZ9a6o",
  "refresh_expires_at": "2026-11-29T13:36:39.91236079Z",
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
  "phone": "+380693299243",
  "device_ref": "sandbox-11824"
}
```

```json
{
  "challenge_id": "e14a0170-1f9f-47a5-9c8d-2c089b549a4a",
  "expires_at": "2026-10-30T13:41:40.448331801Z",
  "resend_available_at": "2026-10-30T13:36:41.448331801Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380693299243` → **200**

```json
{
  "phone": "+380693299243",
  "audience": "CLIENT",
  "code": "460812",
  "sent_at": "2026-10-30T13:36:40.450708763Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e14a0170-1f9f-47a5-9c8d-2c089b549a4a",
  "code": "460812",
  "device_ref": "sandbox-11824"
}
```

```json
{
  "session_id": "10971755-c8eb-41fe-8e74-9de08d114c6d",
  "subject": {
    "type": "CLIENT",
    "id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNzcyNTIwNC04MmZlLTQ5ZDAtYjZjMS05M2Y0N2RlZTlkNGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4MzAwLCJpYXQiOjE3OTMzNjc0MDAsImp0aSI6ImVkNmFhNzcxLTNhOTAtNGNiZS04NDFlLTcyY2JlNDkxZjhiYiIsInNpZCI6IjEwOTcxNzU1LWM4ZWItNDFmZS04ZTc0LTlkZTA4ZDExNGM2ZCJ9.PspjjIg1uYL06i0tcSAc5Td-JI__2uk2ZTMl8A1_eZM",
  "access_expires_at": "2026-10-30T13:51:40.743845816Z",
  "refresh_token": "btfV4uVQptlKVHYwXXNPGIVgfALKIEgLeiiO9lQCklk",
  "refresh_expires_at": "2026-11-29T13:36:40.743368054Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3c290760-8c35-4f08-9218-772d0bf67f12",
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
  "id": "8255b6e0-9b26-4163-8dbf-787c26728c15",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T13:41:41.034126Z",
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
  "command_id": "b0005a7b-1d12-4069-ae9b-78a023309c72",
  "quote_id": "8255b6e0-9b26-4163-8dbf-787c26728c15",
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
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T13:36:41.331537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:36:41.331537Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 10.964991429
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.715693835
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.179874149
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

`GET /api/rider/v1/orders/aff878d1-35bd-4fd1-a548-702cf5617fe9` → **200**

```json
{
  "id": "aff878d1-35bd-4fd1-a548-702cf5617fe9",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e7725204-82fe-49d0-b6c1-93f47dee9d4b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T13:36:41.331537Z",
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
  "session_id": "34717c1b-dc91-4add-b532-35a9c4ffa197",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjg0ODgsImlhdCI6MTc5MzM2NzU4OCwianRpIjoiZWM2NTcxODYtMDU5OC00N2VmLWFkMGMtY2NkMWQ2YWQ3ZmIwIiwic2lkIjoiMzQ3MTdjMWItZGM5MS00YWRkLWI1MzItMzVhOWM0ZmZhMTk3In0.otandlKjFftiFVDwBwbQzy-UNEavM5Lw1MbL65X6TPs",
  "access_expires_at": "2026-10-30T13:54:48.00365868Z",
  "refresh_token": "1KpN8A4RYGiSxu3DEZEtpHEjdayw3OsZQOwDvs_yTDU",
  "refresh_expires_at": "2026-10-31T01:39:48.002722167Z",
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
  "id": "0f2b461b-d872-4b40-b5dd-b3544258195e",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:39:48.300006Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:39:48.300045Z",
  "updated_at": "2026-10-30T13:39:48.317192Z",
  "finished_at": "2026-10-30T13:39:48.317192Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/0f2b461b-d872-4b40-b5dd-b3544258195e` → **200**

```json
{
  "run": {
    "id": "0f2b461b-d872-4b40-b5dd-b3544258195e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:39:48.300006Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:39:48.300045Z",
    "updated_at": "2026-10-30T13:39:48.317192Z",
    "finished_at": "2026-10-30T13:39:48.317192Z",
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
  "id": "0f2b461b-d872-4b40-b5dd-b3544258195e",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:39:48.300006Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:39:48.300045Z",
  "updated_at": "2026-10-30T13:39:48.317192Z",
  "finished_at": "2026-10-30T13:39:48.317192Z",
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
  "id": "0f2b461b-d872-4b40-b5dd-b3544258195e",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:39:48.300006Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:39:48.300045Z",
  "updated_at": "2026-10-30T13:39:48.317192Z",
  "finished_at": "2026-10-30T13:39:48.317192Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3a672005-994d-4739-9c9c-8ee8c3495d06` → **204**

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
  "id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:39:48.72531Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:39:48.725351Z",
  "updated_at": "2026-10-30T13:39:48.732061Z",
  "finished_at": "2026-10-30T13:39:48.732061Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/749ab11e-0b44-46a7-9c71-9794feee19bc` → **200**

```json
{
  "run": {
    "id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:39:48.72531Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:39:48.725351Z",
    "updated_at": "2026-10-30T13:39:48.732061Z",
    "finished_at": "2026-10-30T13:39:48.732061Z",
    "version": 1
  },
  "items": [
    {
      "id": "edd08d45-8ab8-4d15-93f0-66179eef5b01",
      "run_id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "20da2e53a04bf3e17f3509490fce1883fc602b1cf9c0563e3268788cb953f5e9",
      "reference_display": "sandbox-reconciliation-3a#####-994d-4739-9c9c-8ee8c3495d06",
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
      "provider_at": "2026-10-30T13:39:48Z",
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
  "id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:39:48.72531Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:39:48.725351Z",
  "updated_at": "2026-10-30T13:39:48.732061Z",
  "finished_at": "2026-10-30T13:39:48.732061Z",
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
  "id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:39:48.72531Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:39:48.725351Z",
  "updated_at": "2026-10-30T13:39:48.732061Z",
  "finished_at": "2026-10-30T13:39:48.732061Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/edd08d45-8ab8-4d15-93f0-66179eef5b01/resolve` → **200**

```json
{
  "command_id": "9955bad7-bbff-4674-a894-8ec08fcb7b30",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "edd08d45-8ab8-4d15-93f0-66179eef5b01",
  "run_id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "20da2e53a04bf3e17f3509490fce1883fc602b1cf9c0563e3268788cb953f5e9",
  "reference_display": "sandbox-reconciliation-3a#####-994d-4739-9c9c-8ee8c3495d06",
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
  "provider_at": "2026-10-30T13:39:48Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "resolved_at": "2026-10-30T13:39:49.135911Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/edd08d45-8ab8-4d15-93f0-66179eef5b01/resolve` → **200**

```json
{
  "command_id": "9955bad7-bbff-4674-a894-8ec08fcb7b30",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "edd08d45-8ab8-4d15-93f0-66179eef5b01",
  "run_id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "20da2e53a04bf3e17f3509490fce1883fc602b1cf9c0563e3268788cb953f5e9",
  "reference_display": "sandbox-reconciliation-3a#####-994d-4739-9c9c-8ee8c3495d06",
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
  "provider_at": "2026-10-30T13:39:48Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
  "resolved_at": "2026-10-30T13:39:49.135911Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/edd08d45-8ab8-4d15-93f0-66179eef5b01/resolve` → **409**

```json
{
  "command_id": "b8cedb6a-a22d-4b6c-99d7-aa53186ab2b0",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/edd08d45-8ab8-4d15-93f0-66179eef5b01/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "55670d94-acc5-4719-b9f0-86d46486aac7"
}
```

`GET /api/admin/v1/payment-reconciliations/749ab11e-0b44-46a7-9c71-9794feee19bc` → **200**

```json
{
  "run": {
    "id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T13:39:48.72531Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T13:39:48.725351Z",
    "updated_at": "2026-10-30T13:39:49.135911Z",
    "finished_at": "2026-10-30T13:39:48.732061Z",
    "version": 2
  },
  "items": [
    {
      "id": "edd08d45-8ab8-4d15-93f0-66179eef5b01",
      "run_id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "20da2e53a04bf3e17f3509490fce1883fc602b1cf9c0563e3268788cb953f5e9",
      "reference_display": "sandbox-reconciliation-3a#####-994d-4739-9c9c-8ee8c3495d06",
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
      "provider_at": "2026-10-30T13:39:48Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "86673a8e-1701-4030-8b09-a16c7ea03ccf",
      "resolved_at": "2026-10-30T13:39:49.135911Z",
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
      "id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T13:39:48.72531Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:39:48.725351Z",
      "updated_at": "2026-10-30T13:39:49.135911Z",
      "finished_at": "2026-10-30T13:39:48.732061Z",
      "version": 2
    },
    {
      "id": "e8225688-c59b-40c9-8777-7ded312adc00",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T13:20:33.698667Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T13:20:33.698781Z",
      "updated_at": "2026-10-30T13:20:33.704931Z",
      "finished_at": "2026-10-30T13:20:33.704931Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/3a672005-994d-4739-9c9c-8ee8c3495d06` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "749ab11e-0b44-46a7-9c71-9794feee19bc",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T13:39:48.72531Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T13:39:48.725351Z",
  "updated_at": "2026-10-30T13:39:49.135911Z",
  "finished_at": "2026-10-30T13:39:48.732061Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793367714063E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793367714478E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793367714479E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.79336771409E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793367714479E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.

# Scenario: backup-restore

## A rider exists when the backup is taken

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380685411804",
  "device_ref": "sandbox-25314"
}
```

```json
{
  "challenge_id": "cf659ebf-1eff-4cf1-9541-51a62235c49c",
  "expires_at": "2026-10-30T13:46:57.624300384Z",
  "resend_available_at": "2026-10-30T13:41:58.624300384Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380685411804` → **200**

```json
{
  "phone": "+380685411804",
  "audience": "CLIENT",
  "code": "490056",
  "sent_at": "2026-10-30T13:41:57.627128928Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf659ebf-1eff-4cf1-9541-51a62235c49c",
  "code": "490056",
  "device_ref": "sandbox-25314"
}
```

```json
{
  "session_id": "88a9da78-987f-4a81-93e1-cd45beebf029",
  "subject": {
    "type": "CLIENT",
    "id": "5c143c89-8ef7-4a7d-b42f-3d1e2ee07d6c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzE0M2M4OS04ZWY3LTRhN2QtYjQyZi0zZDFlMmVlMDdkNmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzY4NjE3LCJpYXQiOjE3OTMzNjc3MTcsImp0aSI6IjQxMTdlNDE3LWY3OGItNDczZS1iMTdhLTY0MDQ5YmU4NTUzMiIsInNpZCI6Ijg4YTlkYTc4LTk4N2YtNGE4MS05M2UxLWNkNDViZWViZjAyOSJ9.W4uj5cslIMzbEVSWGgECxogWHQmGdWsLO0bULGI8-RE",
  "access_expires_at": "2026-10-30T13:56:57.930014159Z",
  "refresh_token": "MytpLMhaJAUj1JVfgEAhyE6FwEGQ74Ib97RWA3GRyHs",
  "refresh_expires_at": "2026-11-29T13:41:57.929339295Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "5c143c89-8ef7-4a7d-b42f-3d1e2ee07d6c",
  "session_id": "88a9da78-987f-4a81-93e1-cd45beebf029",
  "account_state": "ACTIVE"
}
```

## Back up the database (deploy/backup.sh)
Backed up blizz to blizz.dump (520K)

## After the backup the rider deletes the account and staff complete it

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "1fbe02ee-6777-4cbf-8060-09152613ab6b",
  "expires_at": "2026-10-30T13:47:00.986879308Z",
  "resend_available_at": "2026-10-30T13:42:01.986879308Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380685411804` → **200**

```json
{
  "phone": "+380685411804",
  "audience": "CLIENT",
  "code": "530790",
  "sent_at": "2026-10-30T13:42:00.989283132Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "d758e476-68b3-43ba-a4e7-fa3f76ddcae3",
  "challenge_id": "1fbe02ee-6777-4cbf-8060-09152613ab6b",
  "otp_code": "530790"
}
```

```json
{
  "client_id": "5c143c89-8ef7-4a7d-b42f-3d1e2ee07d6c",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T13:42:01.285524577Z"
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
  "session_id": "5e61f8f3-69dd-49f9-8f79-2c45f8e76442",
  "subject": {
    "type": "STAFF",
    "id": "86673a8e-1701-4030-8b09-a16c7ea03ccf"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjY3M2E4ZS0xNzAxLTQwMzAtOGIwOS1hMTZjN2VhMDNjY2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNjg2MjEsImlhdCI6MTc5MzM2NzcyMSwianRpIjoiOTk0MDYzZjgtZmI3OC00OTQyLWJmMDgtN2QwMzBmNjJlOTdmIiwic2lkIjoiNWU2MWY4ZjMtNjlkZC00OWY5LThmNzktMmM0NWY4ZTc2NDQyIn0.CzOQKRGV8k_VACExNwNMn8d50spMY5RJoubO88qtHw8",
  "access_expires_at": "2026-10-30T13:57:01.835928606Z",
  "refresh_token": "iXWcJetYgI9AwNLwaVzZcft_SYNYXoRKTDY9B0Herbc",
  "refresh_expires_at": "2026-10-31T01:42:01.835338352Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/client-deletions/5c143c89-8ef7-4a7d-b42f-3d1e2ee07d6c/complete` → **200**

```json
{
  "command_id": "8cabe499-5a5d-4099-aefd-09c5b616de8a",
  "reason": "Sandbox: backup and restore check"
}
```

```json
{
  "client_id": "5c143c89-8ef7-4a7d-b42f-3d1e2ee07d6c",
  "account_state": "ANONYMIZED"
}
```

## Restore into an empty database (deploy/restore.sh); over data it refuses
