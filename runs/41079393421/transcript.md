# Sandbox transcript (2026-10-30T15:19:26Z, 1a4414a)

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
  "correlation_id": "6a42ac3b-77fc-4ef9-bcb1-949c754a2445"
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
  "session_id": "8430002f-8ac5-46bb-9c00-c62f0c5cae08",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ0NzQsImlhdCI6MTc5MzM3MzU3NCwianRpIjoiNTY4M2Q5NmUtMTk5ZC00MzU0LWEyMTMtNzZkYWQ5OGU3ZjA5Iiwic2lkIjoiODQzMDAwMmYtOGFjNS00NmJiLTljMDAtYzYyZjBjNWNhZTA4In0.yL6glEOG5JJg832aqdE2iZph8UG6FYF2NYisNDF_Wkg",
  "access_expires_at": "2026-10-30T15:34:34.645177844Z",
  "refresh_token": "cX_mFvywkSlkekYnmPN9pbuRRQ3VgBKCBmqWJmEQPvw",
  "refresh_expires_at": "2026-10-31T03:19:34.642136428Z",
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
  "session_id": "fb46da9d-8d3a-492a-bcf6-c0621c5ffae0",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ0NzYsImlhdCI6MTc5MzM3MzU3NiwianRpIjoiNDU2YjVlYjQtZWY3NS00MzliLWJkZDctMzkzOTE1NTU1NjUwIiwic2lkIjoiZmI0NmRhOWQtOGQzYS00OTJhLWJjZjYtYzA2MjFjNWZmYWUwIn0.Td-ArTdM28ZlMonHcCQNGXG06N8LTy9JvMguWv-YIuA",
  "access_expires_at": "2026-10-30T15:34:36.627408986Z",
  "refresh_token": "gNINLVbGOgAjdz_IvE2pOAChteSfTIoxXeDYxMCyZjc",
  "refresh_expires_at": "2026-10-31T03:19:36.62628427Z",
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
  "device_ref": "sandbox-13321"
}
```

```json
{
  "challenge_id": "350c87d9-7fe5-439a-b462-c17bd1051a38",
  "expires_at": "2026-10-30T15:24:37.250663478Z",
  "resend_available_at": "2026-10-30T15:19:38.250663478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "740302",
  "sent_at": "2026-10-30T15:19:37.264502531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "350c87d9-7fe5-439a-b462-c17bd1051a38",
  "code": "740302",
  "device_ref": "sandbox-13321"
}
```

```json
{
  "session_id": "dfa03575-c211-423c-b651-63f8e80ebf5c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQ3NywiaWF0IjoxNzkzMzczNTc3LCJqdGkiOiI3OTQwZTJhZS0wODJiLTQ3OTEtOGMzYy1jZGZkMzRkNDgzZWUiLCJzaWQiOiJkZmEwMzU3NS1jMjExLTQyM2MtYjY1MS02M2Y4ZTgwZWJmNWMifQ.-Cf-9KMJx52XfZYxAnU-asofCLry-vr7v0Jp-raifaY",
  "access_expires_at": "2026-10-30T15:34:37.608504399Z",
  "refresh_token": "d5n02yK_M7OO8fjTr1uzEWpEGauYQQ7U2a55lzI6Rwk",
  "refresh_expires_at": "2026-11-29T15:19:37.607359332Z",
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
  "command_id": "ef0f0dac-d4f7-46d7-b237-30e2699e0865",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:38Z",
    "sequence": 1793373578192
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a2de8f3-5672-4246-b643-749fc9a83824",
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
  "last_heartbeat_at": "2026-10-30T15:19:38.518982Z",
  "last_location_at": "2026-10-30T15:19:38.518982Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635080506",
  "device_ref": "sandbox-24711"
}
```

```json
{
  "challenge_id": "c0ec9a8d-c810-4d47-9d26-ed1e40b87182",
  "expires_at": "2026-10-30T15:24:38.812504688Z",
  "resend_available_at": "2026-10-30T15:19:39.812504688Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635080506` → **200**

```json
{
  "phone": "+380635080506",
  "audience": "CLIENT",
  "code": "297766",
  "sent_at": "2026-10-30T15:19:38.818356864Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0ec9a8d-c810-4d47-9d26-ed1e40b87182",
  "code": "297766",
  "device_ref": "sandbox-24711"
}
```

```json
{
  "session_id": "7eac8b23-2b53-4560-9bd7-7574ae13559c",
  "subject": {
    "type": "CLIENT",
    "id": "916f8bfb-ef22-4173-b19f-fd17e2e02df9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTZmOGJmYi1lZjIyLTQxNzMtYjE5Zi1mZDE3ZTJlMDJkZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NDc5LCJpYXQiOjE3OTMzNzM1NzksImp0aSI6ImI2MzUwYjZhLTQ1NTMtNDhiOC1iNTI3LTBjYWJmMTFmNDJiMyIsInNpZCI6IjdlYWM4YjIzLTJiNTMtNDU2MC05YmQ3LTc1NzRhZTEzNTU5YyJ9.GqcFNrrdq7H-5Ce1aM99iPtgx5MdomFltuYILZ8LQqY",
  "access_expires_at": "2026-10-30T15:34:39.138272703Z",
  "refresh_token": "Azw4nbYhKadMY-RDF4Vukvf_Ck2fIIz4JXPUJh1GJ58",
  "refresh_expires_at": "2026-11-29T15:19:39.137286238Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "65cff11a-3a39-4073-acad-b1f32cad9648",
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
  "id": "4628dd9c-1d7e-4dcf-a5ae-345e707a8118",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:24:39.462867Z",
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
  "command_id": "15b5d400-0d8c-4253-ab40-ac243ec918d9",
  "quote_id": "4628dd9c-1d7e-4dcf-a5ae-345e707a8118",
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
  "id": "5b4a8e82-3d29-441e-bac7-4fa6d0a893de",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "916f8bfb-ef22-4173-b19f-fd17e2e02df9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:19:39.832374Z",
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
    "id": "22e4812a-db5d-4e24-9da1-9ca19387a102",
    "order_id": "5b4a8e82-3d29-441e-bac7-4fa6d0a893de",
    "expires_at": "2026-10-30T15:19:54.84464Z",
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

`POST /api/driver/v1/offers/22e4812a-db5d-4e24-9da1-9ca19387a102/accept` → **200**

```json
{
  "command_id": "e8ceda74-e002-4b19-95aa-18eeebd1087f"
}
```

```json
{
  "id": "542b3229-fe9f-4aeb-bf49-b37f637bee59",
  "order_id": "5b4a8e82-3d29-441e-bac7-4fa6d0a893de",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2e365582-8f40-4fa7-adf6-6eb694bf8799",
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
  "command_id": "93eaae4b-3aff-488e-84b4-224a0e770c1b",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T15:19:41.120513789Z"
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
  "id": "2e365582-8f40-4fa7-adf6-6eb694bf8799",
  "order_id": "5b4a8e82-3d29-441e-bac7-4fa6d0a893de",
  "assignment_id": "542b3229-fe9f-4aeb-bf49-b37f637bee59",
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

`POST /api/driver/v1/work-sessions/2a2de8f3-5672-4246-b643-749fc9a83824/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:42Z",
    "sequence": 1793373582419
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2a2de8f3-5672-4246-b643-749fc9a83824",
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
  "last_heartbeat_at": "2026-10-30T15:19:42.066221Z",
  "last_location_at": "2026-10-30T15:19:42.066221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/2e365582-8f40-4fa7-adf6-6eb694bf8799/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e8648859-c731-4d9c-8906-f647d716de44",
  "expected_version": 0
}
```

```json
{
  "id": "2e365582-8f40-4fa7-adf6-6eb694bf8799",
  "order_id": "5b4a8e82-3d29-441e-bac7-4fa6d0a893de",
  "assignment_id": "542b3229-fe9f-4aeb-bf49-b37f637bee59",
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
  "arrived_at": "2026-10-30T15:19:42.374143Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2e365582-8f40-4fa7-adf6-6eb694bf8799/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0950d281-08ab-49a9-9052-07bd34f1df67",
  "expected_version": 1
}
```

```json
{
  "id": "2e365582-8f40-4fa7-adf6-6eb694bf8799",
  "order_id": "5b4a8e82-3d29-441e-bac7-4fa6d0a893de",
  "assignment_id": "542b3229-fe9f-4aeb-bf49-b37f637bee59",
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
  "arrived_at": "2026-10-30T15:19:42.374143Z",
  "started_at": "2026-10-30T15:19:42.678505Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2e365582-8f40-4fa7-adf6-6eb694bf8799/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a51d99a5-5adb-4e07-99c0-a664768b4a43",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:19:42Z",
  "cash_received": true
}
```

```json
{
  "id": "2e365582-8f40-4fa7-adf6-6eb694bf8799",
  "order_id": "5b4a8e82-3d29-441e-bac7-4fa6d0a893de",
  "assignment_id": "542b3229-fe9f-4aeb-bf49-b37f637bee59",
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
  "arrived_at": "2026-10-30T15:19:42.374143Z",
  "started_at": "2026-10-30T15:19:42.678505Z",
  "completed_at": "2026-10-30T15:19:42.99008Z",
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
  "session_id": "2a2de8f3-5672-4246-b643-749fc9a83824",
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
  "last_heartbeat_at": "2026-10-30T15:19:42.066221Z",
  "last_location_at": "2026-10-30T15:19:42.066221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a2de8f3-5672-4246-b643-749fc9a83824/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "06aa4073-0806-45ab-a4f1-46f96e59f8e5",
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
  "command_id": "d0511c2a-7837-4711-9066-9f99ad914280",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:43Z",
    "sequence": 1793373583940
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
  "correlation_id": "59b58dd3-864d-402d-9232-06c376de6f5b",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "359c43a8-59e7-4fa6-96e3-d9d41ef5424d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:44Z",
    "sequence": 1793373584250
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cfc3d615-fcd4-4717-85a6-acfcc06da5b8",
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
  "last_heartbeat_at": "2026-10-30T15:19:44.272095Z",
  "last_location_at": "2026-10-30T15:19:44.272095Z",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T15:19:41.120514Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "23ac36ba-5d5b-4f00-a78e-6c0724ef2a03",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T15:19:44.867523373Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cfc3d615-fcd4-4717-85a6-acfcc06da5b8",
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
  "last_heartbeat_at": "2026-10-30T15:19:44.272095Z",
  "last_location_at": "2026-10-30T15:19:44.272095Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cfc3d615-fcd4-4717-85a6-acfcc06da5b8/close` → **200**

```json
{
  "command_id": "c3409954-3bac-41ec-a307-5d81c918e0b8",
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
  "session_id": "637f5987-e8e3-41c9-95de-14ea20c999f1",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ0ODYsImlhdCI6MTc5MzM3MzU4NiwianRpIjoiY2I4MjlmMWItZDhiYy00NjE2LWE1NWEtZWY4MGZiMzI0NTE2Iiwic2lkIjoiNjM3ZjU5ODctZThlMy00MWM5LTk1ZGUtMTRlYTIwYzk5OWYxIn0.sJJ53WVvubuTZm4tKb3lJjS2vq5J4f3rJddWn4gTC5w",
  "access_expires_at": "2026-10-30T15:34:46.078104664Z",
  "refresh_token": "lx9eMc8_ZM1nvHzLQ8lxlNvRsub3Ns4aS9wH_pU52Ok",
  "refresh_expires_at": "2026-10-31T03:19:46.076884889Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "9901ff60-1055-42b0-9726-392ae804aec5",
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
  "id": "f69681dd-94b0-4a7f-8e8f-cf4c06f0c63e",
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
  "created_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "created_at": "2026-10-30T15:19:46.39123Z",
  "updated_at": "2026-10-30T15:19:46.39123Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638243859",
  "device_ref": "sandbox-15937"
}
```

```json
{
  "challenge_id": "e188f1a2-8226-4833-8faf-9fa4b39132b1",
  "expires_at": "2026-10-30T15:24:46.951306884Z",
  "resend_available_at": "2026-10-30T15:19:47.951306884Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638243859` → **200**

```json
{
  "phone": "+380638243859",
  "audience": "CLIENT",
  "code": "589916",
  "sent_at": "2026-10-30T15:19:46.957434334Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e188f1a2-8226-4833-8faf-9fa4b39132b1",
  "code": "589916",
  "device_ref": "sandbox-15937"
}
```

```json
{
  "session_id": "92484d8e-096e-4cc4-90d3-a95312fd4f92",
  "subject": {
    "type": "CLIENT",
    "id": "3b0918ef-0bff-4246-94f2-e1d5ee6be78e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYjA5MThlZi0wYmZmLTQyNDYtOTRmMi1lMWQ1ZWU2YmU3OGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NDg3LCJpYXQiOjE3OTMzNzM1ODcsImp0aSI6ImM4YzQ2NTE3LTRkMzAtNGJkZi1hMGRhLTIzZmI0ZWI4MzY4YyIsInNpZCI6IjkyNDg0ZDhlLTA5NmUtNGNjNC05MGQzLWE5NTMxMmZkNGY5MiJ9.PKgwxf-prXw6dDeLHpLlwVm0TaN8i_Mf_qFPFrdekTw",
  "access_expires_at": "2026-10-30T15:34:47.260872437Z",
  "refresh_token": "eip04K2baDJvmJ-0YYXCWRViUpTK4zQNKtTrQXZIG8A",
  "refresh_expires_at": "2026-11-29T15:19:47.260033146Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638243859` → **200**

```json
{
  "client_id": "3b0918ef-0bff-4246-94f2-e1d5ee6be78e"
}
```

`POST /api/admin/v1/rider-wallets/3b0918ef-0bff-4246-94f2-e1d5ee6be78e/top-ups` → **201**

```json
{
  "command_id": "14822953-64a0-46cc-9820-b8c5518ac70f",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "3b0918ef-0bff-4246-94f2-e1d5ee6be78e",
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
      "id": "d3e4112e-dc18-4ea9-a982-30a2939275f2",
      "at": "2026-10-30T15:19:47.840008Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d9017b55-fe54-4f32-be50-226b808d2401",
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
  "id": "f28bca27-647f-4ba0-af53-4d5f16e40023",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:24:48.164507Z",
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
      "id": "f69681dd-94b0-4a7f-8e8f-cf4c06f0c63e",
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
  "device_ref": "sandbox-2905"
}
```

```json
{
  "challenge_id": "8a6741c7-5758-427f-93ee-69017b3f9107",
  "expires_at": "2026-10-30T15:24:48.463743938Z",
  "resend_available_at": "2026-10-30T15:19:49.463743938Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "347055",
  "sent_at": "2026-10-30T15:19:48.467998111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a6741c7-5758-427f-93ee-69017b3f9107",
  "code": "347055",
  "device_ref": "sandbox-2905"
}
```

```json
{
  "session_id": "e97e9953-6e65-4763-93aa-18c8c01d790b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQ4OCwiaWF0IjoxNzkzMzczNTg4LCJqdGkiOiI2ZmU2NDQ1Yy1mY2RkLTQ1OWYtYTA5YS00NzczNzNkMTI5N2IiLCJzaWQiOiJlOTdlOTk1My02ZTY1LTQ3NjMtOTNhYS0xOGM4YzAxZDc5MGIifQ._-1gjDCT8_S-WN6l5ZTw8bTYnprKscIokjqem1rYD9I",
  "access_expires_at": "2026-10-30T15:34:48.779370847Z",
  "refresh_token": "8Z_MXCHqfCZbO1dLRy9Y9qZmUA_ZjcdjZzQm9dhAgrk",
  "refresh_expires_at": "2026-11-29T15:19:48.778661263Z",
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
  "command_id": "892a8b92-0ea8-41cb-81fb-62cb4baf787b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:49Z",
    "sequence": 1793373589350
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "594bdb6f-1286-43c2-9bf9-57c1072fa56a",
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
  "last_heartbeat_at": "2026-10-30T15:19:49.374082Z",
  "last_location_at": "2026-10-30T15:19:49.374082Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "33f0b470-1ca7-4d75-ae23-0b194a3b6738",
  "quote_id": "f28bca27-647f-4ba0-af53-4d5f16e40023",
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
  "id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3b0918ef-0bff-4246-94f2-e1d5ee6be78e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:19:49.675937Z",
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
  "client_id": "3b0918ef-0bff-4246-94f2-e1d5ee6be78e",
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
      "id": "d3e4112e-dc18-4ea9-a982-30a2939275f2",
      "at": "2026-10-30T15:19:47.840008Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Ivan drives; he collects the price minus the discount and the bonuses

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7a322cec-3fc1-4a34-b720-6c91380d5957",
    "order_id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81",
    "expires_at": "2026-10-30T15:20:04.686627Z",
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

`POST /api/driver/v1/offers/7a322cec-3fc1-4a34-b720-6c91380d5957/accept` → **200**

```json
{
  "command_id": "3827dc83-1f79-4727-a109-f063e3020b71"
}
```

```json
{
  "id": "e996e113-bd37-4c6c-a9c5-61c45b82d3ce",
  "order_id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3898c0f-1abc-400a-8c82-76ce10a774da",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b3898c0f-1abc-400a-8c82-76ce10a774da",
  "order_id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81",
  "assignment_id": "e996e113-bd37-4c6c-a9c5-61c45b82d3ce",
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

`POST /api/driver/v1/work-sessions/594bdb6f-1286-43c2-9bf9-57c1072fa56a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:53Z",
    "sequence": 1793373593189
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "594bdb6f-1286-43c2-9bf9-57c1072fa56a",
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
  "last_heartbeat_at": "2026-10-30T15:19:53.20943Z",
  "last_location_at": "2026-10-30T15:19:53.20943Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/b3898c0f-1abc-400a-8c82-76ce10a774da/arrive` → **200**

```json
{
  "command_id": "8247c54f-5590-40db-bdfd-fdcf91a9adab",
  "expected_version": 0
}
```

```json
{
  "id": "b3898c0f-1abc-400a-8c82-76ce10a774da",
  "order_id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81",
  "assignment_id": "e996e113-bd37-4c6c-a9c5-61c45b82d3ce",
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
  "arrived_at": "2026-10-30T15:19:53.498846Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b3898c0f-1abc-400a-8c82-76ce10a774da/start` → **200**

```json
{
  "command_id": "3899f9b6-de10-4f44-be75-5a2bcc6c15af",
  "expected_version": 1
}
```

```json
{
  "id": "b3898c0f-1abc-400a-8c82-76ce10a774da",
  "order_id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81",
  "assignment_id": "e996e113-bd37-4c6c-a9c5-61c45b82d3ce",
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
  "arrived_at": "2026-10-30T15:19:53.498846Z",
  "started_at": "2026-10-30T15:19:53.794623Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/b3898c0f-1abc-400a-8c82-76ce10a774da/complete` → **200**

```json
{
  "command_id": "23d59d4a-ff3a-4424-9ebc-1f6257c3342f",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:19:54Z",
  "cash_received": true
}
```

```json
{
  "id": "b3898c0f-1abc-400a-8c82-76ce10a774da",
  "order_id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81",
  "assignment_id": "e996e113-bd37-4c6c-a9c5-61c45b82d3ce",
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
  "arrived_at": "2026-10-30T15:19:53.498846Z",
  "started_at": "2026-10-30T15:19:53.794623Z",
  "completed_at": "2026-10-30T15:19:54.115948Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3b0918ef-0bff-4246-94f2-e1d5ee6be78e",
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
      "id": "668feaed-2c9e-4ef1-8800-8b689d396a88",
      "at": "2026-10-30T15:19:54.663292Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81"
    },
    {
      "id": "d3e4112e-dc18-4ea9-a982-30a2939275f2",
      "at": "2026-10-30T15:19:47.840008Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/f69681dd-94b0-4a7f-8e8f-cf4c06f0c63e/archive` → **200**

```json
{
  "command_id": "b3e39b54-08c6-437d-b787-427c041f3095",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "f69681dd-94b0-4a7f-8e8f-cf4c06f0c63e",
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
  "created_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "created_at": "2026-10-30T15:19:46.39123Z",
  "updated_at": "2026-10-30T15:19:57.737063Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "594bdb6f-1286-43c2-9bf9-57c1072fa56a",
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
  "last_heartbeat_at": "2026-10-30T15:19:53.20943Z",
  "last_location_at": "2026-10-30T15:19:53.20943Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/594bdb6f-1286-43c2-9bf9-57c1072fa56a/close` → **200**

```json
{
  "command_id": "6e70caf2-92f1-44bd-a199-f6801c4f87dd",
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

Done: order e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81.

# Scenario: broadcast-abuse

## Anna goes online in Warsaw

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-2490"
}
```

```json
{
  "challenge_id": "a7d627f5-9269-4663-a144-2b5f569d2051",
  "expires_at": "2026-10-30T15:24:58.647751667Z",
  "resend_available_at": "2026-10-30T15:19:59.647751667Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "060801",
  "sent_at": "2026-10-30T15:19:58.652282512Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7d627f5-9269-4663-a144-2b5f569d2051",
  "code": "060801",
  "device_ref": "sandbox-2490"
}
```

```json
{
  "session_id": "389576fe-7c53-47c3-9ed8-9dc6fb7ca8e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDQ5OCwiaWF0IjoxNzkzMzczNTk4LCJqdGkiOiJlN2ZiMTU0NS1hYTlmLTRiMTktODFjNi1hMTIzNDg4NTMyNjIiLCJzaWQiOiIzODk1NzZmZS03YzUzLTQ3YzMtOWVkOC05ZGM2ZmI3Y2E4ZTkifQ.hv6ZJUYpW6o9XyYy6V7YBczD515Qlsoah9FilFzonzM",
  "access_expires_at": "2026-10-30T15:34:58.959702984Z",
  "refresh_token": "GB0F_ytlLJSTJPntaRc0iQ-MLJHxIiPlEV9LFAP9C8w",
  "refresh_expires_at": "2026-11-29T15:19:58.958763508Z",
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
  "command_id": "0d5a97a6-59a3-4486-9fc8-86e167ebc893",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:19:59Z",
    "sequence": 1793373599812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "47adf791-c44b-4e9b-832f-05e8f50b7c28",
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
  "last_heartbeat_at": "2026-10-30T15:19:59.832624Z",
  "last_location_at": "2026-10-30T15:19:59.832624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## 5 seconds later her phone reports Lviv: not taken as her position

`POST /api/driver/v1/work-sessions/47adf791-c44b-4e9b-832f-05e8f50b7c28/heartbeat` → **200**

```json
{
  "location": {
    "lat": 49.8397,
    "lon": 24.0297,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:20:05Z",
    "sequence": 1793373605115
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "47adf791-c44b-4e9b-832f-05e8f50b7c28",
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
  "last_heartbeat_at": "2026-10-30T15:20:05.137282Z",
  "last_location_at": "2026-10-30T15:19:59.832624Z",
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
  "session_id": "8cfb87e1-297e-4e69-83fc-c3f5db5cbc87",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ1MDUsImlhdCI6MTc5MzM3MzYwNSwianRpIjoiMzc2NDdhNWQtNjMyMy00YWEzLTgyNDEtZjY4YWUxMTg3NjNlIiwic2lkIjoiOGNmYjg3ZTEtMjk3ZS00ZTY5LTgzZmMtYzNmNWRiNWNiYzg3In0.0vrvLLl_1-sgE8QbjddkXFM6ej6sXiGx4_bNdwKRCno",
  "access_expires_at": "2026-10-30T15:35:05.776608504Z",
  "refresh_token": "Sd4h8SqGIfvB3gFz7Y5VfLgumiB7Am69Dlb1T2pZTmc",
  "refresh_expires_at": "2026-10-31T03:20:05.775930506Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "at": "2026-10-30T15:20:06.055890962Z",
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
      "last_location_at": "2026-10-30T15:19:59.832624Z",
      "order_id": null
    }
  ]
}
```

## A fix next to the last accepted one is taken again

`POST /api/driver/v1/work-sessions/47adf791-c44b-4e9b-832f-05e8f50b7c28/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2299,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:20:06Z",
    "sequence": 1793373606356
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "47adf791-c44b-4e9b-832f-05e8f50b7c28",
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
  "last_heartbeat_at": "2026-10-30T15:20:06.376616Z",
  "last_location_at": "2026-10-30T15:20:06.376616Z",
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
  "session_id": "47adf791-c44b-4e9b-832f-05e8f50b7c28",
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
  "last_heartbeat_at": "2026-10-30T15:20:06.376616Z",
  "last_location_at": "2026-10-30T15:20:06.376616Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/47adf791-c44b-4e9b-832f-05e8f50b7c28/close` → **200**

```json
{
  "command_id": "96578867-9e87-4a28-8ff7-869f2bd1e339",
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
  "device_ref": "sandbox-25735"
}
```

```json
{
  "challenge_id": "1e3653af-e996-4ced-85a3-55a197a32114",
  "expires_at": "2026-10-30T15:25:07.286910402Z",
  "resend_available_at": "2026-10-30T15:20:08.286910402Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "997451",
  "sent_at": "2026-10-30T15:20:07.29110448Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e3653af-e996-4ced-85a3-55a197a32114",
  "code": "997451",
  "device_ref": "sandbox-25735"
}
```

```json
{
  "session_id": "49b66ddc-b3de-462c-8636-a3bccd1e1af0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDUwNywiaWF0IjoxNzkzMzczNjA3LCJqdGkiOiJmOGM5OWMzNi1kNjI4LTRmMjQtYjc5NS04MDlkOWY2ZGM1NTIiLCJzaWQiOiI0OWI2NmRkYy1iM2RlLTQ2MmMtODYzNi1hM2JjY2QxZTFhZjAifQ.wNeUqt6zURkBhsw7GRFd-6tG2sGbvy-Av8_PhG0WYb0",
  "access_expires_at": "2026-10-30T15:35:07.59877067Z",
  "refresh_token": "ZZUMaXbuMH4j44rHKc3QTtMffDbbJI8C9-chBH9dQ1s",
  "refresh_expires_at": "2026-11-29T15:20:07.597991661Z",
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
  "device_ref": "sandbox-28165"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "30c244e6-2f43-469f-8d85-5b70f5f2a58d",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-28165"
}
```

```json
{
  "challenge_id": "3ff1aa1d-7c0e-4e88-a72c-635028bee96f",
  "expires_at": "2026-10-30T15:25:09.469456939Z",
  "resend_available_at": "2026-10-30T15:20:10.469456939Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "424872",
  "sent_at": "2026-10-30T15:20:09.473390121Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ff1aa1d-7c0e-4e88-a72c-635028bee96f",
  "code": "424872",
  "device_ref": "sandbox-28165"
}
```

```json
{
  "session_id": "bf421b5d-45e1-4aa8-8df8-707d122fa29d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDUwOSwiaWF0IjoxNzkzMzczNjA5LCJqdGkiOiJhMjc1ODFhMi1jNDU3LTQ0M2YtOTA3Zi1lZWNhMjE1MGIwNTEiLCJzaWQiOiJiZjQyMWI1ZC00NWUxLTRhYTgtOGRmOC03MDdkMTIyZmEyOWQifQ.FvA7izMRoz8kzKK1KRnZ6jauk61taGSqKITqKAGyh_g",
  "access_expires_at": "2026-10-30T15:35:09.782064081Z",
  "refresh_token": "X3G_mXf_i-ZgNwVSNf0QbnEvHzkEGo-6SZzU7a9sJR0",
  "refresh_expires_at": "2026-11-29T15:20:09.781201827Z",
  "account_created": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000002",
  "device_ref": "sandbox-29349"
}
```

```json
{
  "challenge_id": "a17af7fb-cce1-4020-b7a7-95727cd45cf3",
  "expires_at": "2026-10-30T15:25:10.05865391Z",
  "resend_available_at": "2026-10-30T15:20:11.05865391Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000002` → **200**

```json
{
  "phone": "+48500000002",
  "audience": "DRIVER",
  "code": "694427",
  "sent_at": "2026-10-30T15:20:10.062802821Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a17af7fb-cce1-4020-b7a7-95727cd45cf3",
  "code": "694427",
  "device_ref": "sandbox-29349"
}
```

```json
{
  "session_id": "9c1bdf8f-598a-4fb0-92d6-9ad0ecf596ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000405"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDUiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDUxMCwiaWF0IjoxNzkzMzczNjEwLCJqdGkiOiIzYjRlZDc3MS1lNTNkLTQ5NDEtYjUzNC00OTQ5NTE3MDlhNjEiLCJzaWQiOiI5YzFiZGY4Zi01OThhLTRmYjAtOTJkNi05YWQwZWNmNTk2YmEifQ.vGFpm8pl9-uRGeIZE0FqcNXkz3a1a5Z1qQTYQHU4TMg",
  "access_expires_at": "2026-10-30T15:35:10.370072028Z",
  "refresh_token": "2xr_oaw_sw_JM9YdMWuc43DgPcTM3F9gX384Rb4kfcc",
  "refresh_expires_at": "2026-11-29T15:20:10.369483592Z",
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

(the car drives 182 s to the next point)

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "5e7b52bc-1d1d-4c8f-a520-2b4e1a7cf6da",
  "vehicle_id": "5a000000-0000-4000-8000-000000000505",
  "location": {
    "lat": 52.2297,
    "lon": 21.1700,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:23:13Z",
    "sequence": 1793373793248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000405",
  "session_id": "f3cfadd1-2853-4032-96b3-eae5f7a86229",
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
  "last_heartbeat_at": "2026-10-30T15:23:13.267437Z",
  "last_location_at": "2026-10-30T15:23:13.267437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders: nobody is near, the order goes to the ALL tab

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600293551",
  "device_ref": "sandbox-13170"
}
```

```json
{
  "challenge_id": "4eef0d3c-0527-440b-a8c4-302722f2d704",
  "expires_at": "2026-10-30T15:28:13.554851565Z",
  "resend_available_at": "2026-10-30T15:23:14.554851565Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600293551` → **200**

```json
{
  "phone": "+48600293551",
  "audience": "CLIENT",
  "code": "580657",
  "sent_at": "2026-10-30T15:23:13.55905859Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4eef0d3c-0527-440b-a8c4-302722f2d704",
  "code": "580657",
  "device_ref": "sandbox-13170"
}
```

```json
{
  "session_id": "94ed6a6f-e274-4abd-9416-b00c86da0e95",
  "subject": {
    "type": "CLIENT",
    "id": "c7606ac5-c089-4ee6-b499-c5cc69a3826d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNzYwNmFjNS1jMDg5LTRlZTYtYjQ5OS1jNWNjNjlhMzgyNmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NjkzLCJpYXQiOjE3OTMzNzM3OTMsImp0aSI6ImViYzMzNWU5LTJiOWEtNDFkNS1iYzdhLTI1MTlmZDdiYzZhYyIsInNpZCI6Ijk0ZWQ2YTZmLWUyNzQtNGFiZC05NDE2LWIwMGM4NmRhMGU5NSJ9.tD3-pPrwTPhC7ApetLSccC_eqQnhbFs0RE4QCDrTd8E",
  "access_expires_at": "2026-10-30T15:38:13.867159454Z",
  "refresh_token": "vJL5NhLrTHuFy0OFlvJH25iCuZU9FcszrvcrXCAm_gA",
  "refresh_expires_at": "2026-11-29T15:23:13.866521983Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa9d8d7c-3a96-4a8d-8858-7c64a07e3e93",
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
  "id": "d7bcf0e5-3ea4-4403-b0f0-c852fa266a3e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 4942,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:28:14.159804Z",
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
  "command_id": "6405d366-31d7-4bc0-8f3d-8337b763c46a",
  "quote_id": "d7bcf0e5-3ea4-4403-b0f0-c852fa266a3e",
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
  "id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7606ac5-c089-4ee6-b499-c5cc69a3826d",
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
  "created_at": "2026-10-30T15:23:14.456467Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d17cf6bf-61f7-41ab-891f-9832ca9875c0` → **200**

```json
{
  "id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7606ac5-c089-4ee6-b499-c5cc69a3826d",
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
  "created_at": "2026-10-30T15:23:14.456467Z",
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

`POST /api/driver/v1/orders/d17cf6bf-61f7-41ab-891f-9832ca9875c0/claim` → **422**

```json
{
  "command_id": "5cf020ef-604b-4d4c-89ae-3190161c6ccd"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d17cf6bf-61f7-41ab-891f-9832ca9875c0/claim",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "9d3e667d-7c55-4f3a-9af5-9fe9818d95de"
}
```

`GET /api/rider/v1/orders/d17cf6bf-61f7-41ab-891f-9832ca9875c0` → **200**

```json
{
  "id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7606ac5-c089-4ee6-b499-c5cc69a3826d",
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
  "created_at": "2026-10-30T15:23:14.456467Z",
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

`POST /api/driver/v1/orders/24aa511e-9d76-428f-b5a3-38f46bf8c4d4/claim` → **404**

```json
{
  "command_id": "ffff1078-7749-4a34-8db6-406046aab7f6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/24aa511e-9d76-428f-b5a3-38f46bf8c4d4/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "48137f76-61e1-42a0-90e7-43693ca48b24"
}
```

`POST /api/driver/v1/orders/d2aebf2e-0853-4a35-80bb-e12f4d504da5/claim` → **404**

```json
{
  "command_id": "bc8419b3-0b4a-4688-a278-7b50adc9b6c1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d2aebf2e-0853-4a35-80bb-e12f4d504da5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "55bbd926-bba8-427b-a853-e5a996ee342b"
}
```

`POST /api/driver/v1/orders/a9e3412b-6d33-4c6f-95e6-65da223b9c0f/claim` → **404**

```json
{
  "command_id": "e976f4d6-29eb-4c7d-992b-37642d57135c"
}
```

```json
{
  "instance": "/api/driver/v1/orders/a9e3412b-6d33-4c6f-95e6-65da223b9c0f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5b402ced-435a-4a69-9358-3dc34690cae1"
}
```

`POST /api/driver/v1/orders/e77003ca-4061-4439-96ab-e3147937b73a/claim` → **404**

```json
{
  "command_id": "f69c3ace-ead7-4707-a785-29b9e99fcc87"
}
```

```json
{
  "instance": "/api/driver/v1/orders/e77003ca-4061-4439-96ab-e3147937b73a/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "907befc4-59a2-43a2-b275-bc5e6ab4973d"
}
```

`POST /api/driver/v1/orders/2c3f435f-c0df-451f-b8f6-6e572b891011/claim` → **404**

```json
{
  "command_id": "f9abb090-d8b0-46d9-9d5c-036524367cb8"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2c3f435f-c0df-451f-b8f6-6e572b891011/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b0e50820-279c-43cf-b3db-d999816ac857"
}
```

`POST /api/driver/v1/orders/453fcebf-417a-439d-a14c-b81a14d292ec/claim` → **404**

```json
{
  "command_id": "9bf792b0-bb5c-446d-9b99-3613bb51cb48"
}
```

```json
{
  "instance": "/api/driver/v1/orders/453fcebf-417a-439d-a14c-b81a14d292ec/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d7cfa057-a5c2-46d8-aed3-f27026f47dca"
}
```

`POST /api/driver/v1/orders/f78f945b-4b08-4779-a298-dff81ab604ac/claim` → **404**

```json
{
  "command_id": "d37e554a-e818-4f1a-8635-0e0ffb123008"
}
```

```json
{
  "instance": "/api/driver/v1/orders/f78f945b-4b08-4779-a298-dff81ab604ac/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "20ac0a0e-a46b-4d8e-a0f1-a841214b46d6"
}
```

`POST /api/driver/v1/orders/045ff190-26d9-4f18-bba5-66ac9642bc8c/claim` → **404**

```json
{
  "command_id": "c7232b95-6491-4395-b9b9-1237a31f5bc3"
}
```

```json
{
  "instance": "/api/driver/v1/orders/045ff190-26d9-4f18-bba5-66ac9642bc8c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7cbc4666-83c1-40f4-9b64-b64b076415d8"
}
```

`POST /api/driver/v1/orders/086878e7-3963-4a00-83cc-c01a9f77ac95/claim` → **404**

```json
{
  "command_id": "baeb03f6-97e0-4c4f-b00e-47b61ca06dac"
}
```

```json
{
  "instance": "/api/driver/v1/orders/086878e7-3963-4a00-83cc-c01a9f77ac95/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ca686921-b58f-4f3e-8980-db6cbdd270e2"
}
```

`POST /api/driver/v1/orders/75e857a5-8a74-44cc-80db-8e6d55cd4134/claim` → **404**

```json
{
  "command_id": "3fd15cd9-a576-415b-823b-f8f50b8f9802"
}
```

```json
{
  "instance": "/api/driver/v1/orders/75e857a5-8a74-44cc-80db-8e6d55cd4134/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "99695d6f-5907-41d4-87d0-fbd22308e878"
}
```

`POST /api/driver/v1/orders/bae47283-fac0-44b4-b23f-8fd21affaf9b/claim` → **404**

```json
{
  "command_id": "73ac3a1f-03cf-46df-8549-51a6afc9de93"
}
```

```json
{
  "instance": "/api/driver/v1/orders/bae47283-fac0-44b4-b23f-8fd21affaf9b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ed1e0915-0ebb-4c6b-b5f3-89ff9a028d6c"
}
```

`POST /api/driver/v1/orders/efefb8e3-2828-40d2-8425-cb8f46f75f2c/claim` → **404**

```json
{
  "command_id": "662f861a-4c33-4585-9fed-d2891d01ef59"
}
```

```json
{
  "instance": "/api/driver/v1/orders/efefb8e3-2828-40d2-8425-cb8f46f75f2c/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6ba1454f-8b9b-464b-a334-11d42a3a8cd4"
}
```

`POST /api/driver/v1/orders/3c935e4f-cbff-4073-9077-23647b57de4e/claim` → **404**

```json
{
  "command_id": "a6adf59f-ca9e-4d65-8f54-8a16773645be"
}
```

```json
{
  "instance": "/api/driver/v1/orders/3c935e4f-cbff-4073-9077-23647b57de4e/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "b8f7fc0b-50d0-42ae-a624-ebb06d12aa4c"
}
```

`POST /api/driver/v1/orders/2e311ff2-37f4-4359-be47-e80bd0aa9ad1/claim` → **404**

```json
{
  "command_id": "1e9a142b-33ac-4a26-9081-ee7d26b444d5"
}
```

```json
{
  "instance": "/api/driver/v1/orders/2e311ff2-37f4-4359-be47-e80bd0aa9ad1/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e1dc3034-cc78-40eb-af00-7cd2a7e71000"
}
```

`POST /api/driver/v1/orders/1b745b69-a65e-4ac4-b7bc-18e3e149a646/claim` → **404**

```json
{
  "command_id": "9ef575b1-6a0b-4d2a-85a0-18e71e4fa7b1"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1b745b69-a65e-4ac4-b7bc-18e3e149a646/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "77023b8c-baad-47ff-8080-4559f6f085ea"
}
```

`POST /api/driver/v1/orders/15b0433e-faef-4271-9936-ecb69fefff83/claim` → **404**

```json
{
  "command_id": "61f1ffe8-0c1f-474d-8e4a-1c56fc8a2e36"
}
```

```json
{
  "instance": "/api/driver/v1/orders/15b0433e-faef-4271-9936-ecb69fefff83/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "039e5dfd-cd44-444b-870b-7733f8d99784"
}
```

`POST /api/driver/v1/orders/4aceab1f-966b-4fd3-be4d-26083a39d2cd/claim` → **404**

```json
{
  "command_id": "7f0796e5-6566-40ef-b8ec-3115c73b8f35"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4aceab1f-966b-4fd3-be4d-26083a39d2cd/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d3fb58e3-52a5-4d00-be50-240562fbd615"
}
```

`POST /api/driver/v1/orders/54a99195-98b7-4bf6-940a-c3b698cb0705/claim` → **404**

```json
{
  "command_id": "7a749b60-bece-4cce-b933-f7f1a0a23cab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/54a99195-98b7-4bf6-940a-c3b698cb0705/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3bbf39ef-3a36-4642-be84-43b5398d64aa"
}
```

`POST /api/driver/v1/orders/ad84b42c-5ed0-43df-8f75-ea3dd0ed142f/claim` → **404**

```json
{
  "command_id": "90eb97e6-cb85-4cdb-b244-e7b288bffd4e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/ad84b42c-5ed0-43df-8f75-ea3dd0ed142f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "e788e2f0-c38f-4c2e-9072-160cc83b0da2"
}
```

`POST /api/driver/v1/orders/0470d9de-c82c-4158-816a-ad1ceb5c8b7b/claim` → **404**

```json
{
  "command_id": "b9674363-df19-442d-9b0d-c25b37d99bb7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/0470d9de-c82c-4158-816a-ad1ceb5c8b7b/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "acc4766e-bd8e-487e-abbd-ea9d62455f2e"
}
```

`POST /api/driver/v1/orders/95a5268c-255c-42d7-9963-d339a6553172/claim` → **404**

```json
{
  "command_id": "42317277-2bd7-406e-ab02-bb2d457562b6"
}
```

```json
{
  "instance": "/api/driver/v1/orders/95a5268c-255c-42d7-9963-d339a6553172/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9a937a9d-432d-49b3-8c23-d47dce742551"
}
```

`POST /api/driver/v1/orders/94514581-99d4-4b94-9b2c-7651e247f5b5/claim` → **404**

```json
{
  "command_id": "8e01c0f4-a7fd-4433-833f-dd119ad6513a"
}
```

```json
{
  "instance": "/api/driver/v1/orders/94514581-99d4-4b94-9b2c-7651e247f5b5/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "7ce76750-7e52-4050-aaa4-261c146729fe"
}
```

`POST /api/driver/v1/orders/5e7f9527-912a-4e8a-bc10-b31856f95058/claim` → **404**

```json
{
  "command_id": "8704e77c-212e-4240-a58a-1c42d3c66774"
}
```

```json
{
  "instance": "/api/driver/v1/orders/5e7f9527-912a-4e8a-bc10-b31856f95058/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "781c98f0-e44d-48fa-a39b-c08260b7910f"
}
```

`POST /api/driver/v1/orders/1e70b715-1f96-4e36-818f-61cbfc4e42a0/claim` → **404**

```json
{
  "command_id": "3afa5e26-7e41-4101-8b82-aa6c3c8b9f4f"
}
```

```json
{
  "instance": "/api/driver/v1/orders/1e70b715-1f96-4e36-818f-61cbfc4e42a0/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4c1fc2bb-d7cb-4696-8d83-aee1524a3689"
}
```

`POST /api/driver/v1/orders/4f49ca86-c50b-484b-807f-966593db3031/claim` → **404**

```json
{
  "command_id": "aed1d068-4800-4c6d-a8ec-55b383e6818b"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4f49ca86-c50b-484b-807f-966593db3031/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1515217e-e821-4268-8594-683bfae81273"
}
```

`POST /api/driver/v1/orders/c4cdcb5c-c5f2-4bd7-866f-50358c724379/claim` → **404**

```json
{
  "command_id": "a8734197-2b16-454e-8ffc-7cae4d7fa3a7"
}
```

```json
{
  "instance": "/api/driver/v1/orders/c4cdcb5c-c5f2-4bd7-866f-50358c724379/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "63935bf2-7fe0-42d3-808b-ce620be08ba2"
}
```

`POST /api/driver/v1/orders/b1a24088-d9f6-4e13-90dd-245a1fce9a4f/claim` → **404**

```json
{
  "command_id": "f03d1fc5-b39a-428e-b6ac-a5af1f52b6c4"
}
```

```json
{
  "instance": "/api/driver/v1/orders/b1a24088-d9f6-4e13-90dd-245a1fce9a4f/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "8ac7c025-f7bd-40e8-b5f4-29c1d94b66c3"
}
```

`POST /api/driver/v1/orders/4f03e2be-db00-4989-8250-8caa1e822335/claim` → **404**

```json
{
  "command_id": "c6302ac7-9bf4-4598-85bf-d547d8ece9be"
}
```

```json
{
  "instance": "/api/driver/v1/orders/4f03e2be-db00-4989-8250-8caa1e822335/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "d3d19f3f-e6a6-4cce-88f3-8a9385e8e994"
}
```

`POST /api/driver/v1/orders/448d4b28-1f94-40c7-9fd1-216dc65ae775/claim` → **404**

```json
{
  "command_id": "eb60a881-3f56-4bdb-a836-a0ff8eb04272"
}
```

```json
{
  "instance": "/api/driver/v1/orders/448d4b28-1f94-40c7-9fd1-216dc65ae775/claim",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "4254e3d6-a260-4fde-bdb3-3120b0754a1a"
}
```

`POST /api/driver/v1/orders/997ecc62-1c5d-405b-9ec1-a4f6ae526fb4/claim` → **429**

```json
{
  "command_id": "2c7636eb-0194-4606-a45f-52ee77a4546e"
}
```

```json
{
  "instance": "/api/driver/v1/orders/997ecc62-1c5d-405b-9ec1-a4f6ae526fb4/claim",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "65645eb9-81f0-4908-ae61-36f6a6b27074",
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
  "command_id": "28c69f38-e770-4ad0-b915-fdbbd5c6bb73",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:23:24Z",
    "sequence": 1793373804961
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "52cbfc0e-b6cb-4b16-8cc6-e6de9c675f4b",
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
  "last_heartbeat_at": "2026-10-30T15:23:24.981611Z",
  "last_location_at": "2026-10-30T15:23:24.981611Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/broadcast-orders` → **200**

```json
[
  {
    "order_id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
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

`POST /api/driver/v1/orders/d17cf6bf-61f7-41ab-891f-9832ca9875c0/claim` → **409**

```json
{
  "command_id": "30793751-098e-4c16-ae5f-771baa4294ab"
}
```

```json
{
  "instance": "/api/driver/v1/orders/d17cf6bf-61f7-41ab-891f-9832ca9875c0/claim",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "27b75d28-4605-45bf-be40-2735b111a9cd"
}
```

`POST /api/driver/v1/orders/d17cf6bf-61f7-41ab-891f-9832ca9875c0/claim` → **200**

```json
{
  "command_id": "af72b321-1f30-43ed-baa2-0772e68d88c9"
}
```

```json
{
  "id": "9065e7b6-f0e6-42d9-83de-d22cd91e5064",
  "order_id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "source": "BROADCAST",
  "state": "COMMITTED",
  "trip_id": "f1ad54f4-df2c-4d10-8cb3-3429c3edc377",
  "trip_phase": "TO_PICKUP"
}
```

## Piotr cancels at the rider's request (sandbox clean-up)

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f1ad54f4-df2c-4d10-8cb3-3429c3edc377",
  "order_id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
  "assignment_id": "9065e7b6-f0e6-42d9-83de-d22cd91e5064",
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

`POST /api/driver/v1/trips/f1ad54f4-df2c-4d10-8cb3-3429c3edc377/cancel` → **200**

```json
{
  "command_id": "45f8e45f-ff21-41ea-9755-270d09a74170",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f1ad54f4-df2c-4d10-8cb3-3429c3edc377",
  "order_id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
  "assignment_id": "9065e7b6-f0e6-42d9-83de-d22cd91e5064",
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

`GET /api/rider/v1/orders/d17cf6bf-61f7-41ab-891f-9832ca9875c0` → **200**

```json
{
  "id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "PASSENGER_ASKED",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c7606ac5-c089-4ee6-b499-c5cc69a3826d",
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
    "id": "9065e7b6-f0e6-42d9-83de-d22cd91e5064",
    "order_id": "d17cf6bf-61f7-41ab-891f-9832ca9875c0",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "vehicle_id": "5a000000-0000-4000-8000-000000000504",
    "source": "BROADCAST",
    "state": "RELEASED",
    "trip_id": "f1ad54f4-df2c-4d10-8cb3-3429c3edc377",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:23:14.456467Z",
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
  "session_id": "f3cfadd1-2853-4032-96b3-eae5f7a86229",
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
  "last_heartbeat_at": "2026-10-30T15:23:13.267437Z",
  "last_location_at": "2026-10-30T15:23:13.267437Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3cfadd1-2853-4032-96b3-eae5f7a86229/close` → **200**

```json
{
  "command_id": "ede9aeed-62e5-4648-80a8-38b9452fae36",
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
  "session_id": "52cbfc0e-b6cb-4b16-8cc6-e6de9c675f4b",
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
  "last_heartbeat_at": "2026-10-30T15:23:24.981611Z",
  "last_location_at": "2026-10-30T15:23:24.981611Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/52cbfc0e-b6cb-4b16-8cc6-e6de9c675f4b/close` → **200**

```json
{
  "command_id": "b28117e4-ba72-4bdf-aeaf-0fbef9b4b13c",
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
  "session_id": "f7c9fa66-e532-45ad-a1a7-2ce6406a155e",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MDgsImlhdCI6MTc5MzM3MzgwOCwianRpIjoiZjJhZGMxY2YtMTQ3OS00NTZiLWIzMjAtNmY2MzczMTUwNmI0Iiwic2lkIjoiZjdjOWZhNjYtZTUzMi00NWFkLWExYTctMmNlNjQwNmExNTVlIn0.gjzJedyDoO20uVMFxMSNxcUOMpk6kWHF6u2jR-N2Uwk",
  "access_expires_at": "2026-10-30T15:38:28.51023132Z",
  "refresh_token": "yv5NjgyAHkIM3xH9E1QPub4coghSn2hl-QMUR_qX5B0",
  "refresh_expires_at": "2026-10-31T03:23:28.509635171Z",
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
  "command_id": "6009232d-c040-4cef-953f-aae58b218ba4",
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
  "session_id": "2e7fca58-a7b7-415d-ac24-31ba8f47832d",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MDksImlhdCI6MTc5MzM3MzgwOSwianRpIjoiMTNlYTU5ZmMtODZkMS00MDAwLTllODUtNTk4N2UxOTgxM2UxIiwic2lkIjoiMmU3ZmNhNTgtYTdiNy00MTVkLWFjMjQtMzFiYThmNDc4MzJkIn0.0hw6jSae76UAoljSjVwmC7AQkx6EfUSLVmPHc9quCys",
  "access_expires_at": "2026-10-30T15:38:29.705240222Z",
  "refresh_token": "BY4_pldbhysNYrovEjT0r6AwusKiN4RPP6bAtogQcKs",
  "refresh_expires_at": "2026-10-31T03:23:29.704719131Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.235019284",
    "linkedid": "1730052700.235019284",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675843939"
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
    "id": "1730052700.235019284",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "faa6678e-c479-4d0c-993e-f73b45812ada",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675843939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:23:29.981103Z",
      "answered_at": null,
      "ended_at": "2026-10-30T15:23:30.00515Z",
      "recording": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## A call is taken and ends: its recording is fetched from Asterisk

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052600.281231732",
    "linkedid": "1730052600.281231732",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675843939"
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
      "id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675843939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:23:30.330381Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`POST /api/operator/v1/calls/9af6fa65-434e-4204-83f7-cbed9e1f1dd0/answer` → **200**

```json
{
  "command_id": "31085551-b5ac-4bea-83db-902375a209dd"
}
```

```json
{
  "id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675843939",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "order_ids": [],
  "started_at": "2026-10-30T15:23:30.330381Z",
  "answered_at": "2026-10-30T15:23:30.649918Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.281231732",
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
    "id": "1730052600.281231732",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675843939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [],
      "started_at": "2026-10-30T15:23:30.330381Z",
      "answered_at": "2026-10-30T15:23:30.649918Z",
      "ended_at": "2026-10-30T15:23:30.956054Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675843939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [],
      "started_at": "2026-10-30T15:23:30.330381Z",
      "answered_at": "2026-10-30T15:23:30.649918Z",
      "ended_at": "2026-10-30T15:23:30.956054Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675843939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [],
      "started_at": "2026-10-30T15:23:30.330381Z",
      "answered_at": "2026-10-30T15:23:30.649918Z",
      "ended_at": "2026-10-30T15:23:30.956054Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:23:35.002321Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Recording: STORED

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675843939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [],
      "started_at": "2026-10-30T15:23:30.330381Z",
      "answered_at": "2026-10-30T15:23:30.649918Z",
      "ended_at": "2026-10-30T15:23:30.956054Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:23:35.002321Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/9af6fa65-434e-4204-83f7-cbed9e1f1dd0/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/9af6fa65-434e-4204-83f7-cbed9e1f1dd0/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=9af6fa65-434e-4204-83f7-cbed9e1f1dd0` → **200**

```json
{
  "changes": [
    {
      "id": "54eeaa1d-a486-491e-ad8e-1a15139032d0",
      "occurred_at": "2026-10-30T15:23:36.176059Z",
      "actor_type": "STAFF",
      "actor_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"167cf9a9-ff38-45f9-9cae-2eae866bff18\", \"order_ids\": []}",
      "correlation_id": "9f0840ae-4183-42dd-b999-1c1b7d7193fe"
    },
    {
      "id": "df81d28f-2693-4a3e-b379-ea3322ae190c",
      "occurred_at": "2026-10-30T15:23:36.146579Z",
      "actor_type": "STAFF",
      "actor_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"167cf9a9-ff38-45f9-9cae-2eae866bff18\", \"order_ids\": []}",
      "correlation_id": "d44fffa7-376d-42b1-80a2-2ec3af066db9"
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

Done: call 9af6fa65-434e-4204-83f7-cbed9e1f1dd0 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7688"
}
```

```json
{
  "challenge_id": "c86fe112-be25-4d1e-a319-bffa83776401",
  "expires_at": "2026-10-30T15:28:36.500370585Z",
  "resend_available_at": "2026-10-30T15:23:37.500370585Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "320700",
  "sent_at": "2026-10-30T15:23:36.503913204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c86fe112-be25-4d1e-a319-bffa83776401",
  "code": "320700",
  "device_ref": "sandbox-7688"
}
```

```json
{
  "session_id": "5a7b4885-1c9a-49eb-9861-29ba64805230",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDcxNiwiaWF0IjoxNzkzMzczODE2LCJqdGkiOiJhZGU3MmY3MS0zM2YzLTRkOTMtODk1Ni01ZDk3MDM2ZGUwZmQiLCJzaWQiOiI1YTdiNDg4NS0xYzlhLTQ5ZWItOTg2MS0yOWJhNjQ4MDUyMzAifQ.Bkc44yp3A3nyhsXre-wpAfQk09VFFhHJqHYo44wrZS0",
  "access_expires_at": "2026-10-30T15:38:36.813885538Z",
  "refresh_token": "RMlYDzm3JD9PpyJR8-xJ7XMBUoR6qzVcHHxPM5cDYT8",
  "refresh_expires_at": "2026-11-29T15:23:36.813217057Z",
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
  "command_id": "bf6e1aca-7e3c-41bf-a048-ec927969373a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:23:37Z",
    "sequence": 1793373817380
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "567897a2-944a-4cfb-a91e-3417d77d4d1e",
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
  "last_heartbeat_at": "2026-10-30T15:23:37.399579Z",
  "last_location_at": "2026-10-30T15:23:37.399579Z",
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
  "session_id": "d3500dbd-9847-4056-ba62-29c831590ed8",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MTgsImlhdCI6MTc5MzM3MzgxOCwianRpIjoiYzhlOGQ0MjMtNDVlNC00NDVhLTk3YWQtNzg1ZThiZTBlYmJlIiwic2lkIjoiZDM1MDBkYmQtOTg0Ny00MDU2LWJhNjItMjljODMxNTkwZWQ4In0.ohz7oPl2tpWuVbHeNsOZpfZ1sLqVANZeBVYb8GDyOGg",
  "access_expires_at": "2026-10-30T15:38:38.011331138Z",
  "refresh_token": "U_Jz2WlFU727I5RxhiER2_mhl-LIBvS5fKAAn6uL-xo",
  "refresh_expires_at": "2026-10-31T03:23:38.010829039Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cc730190-3d42-4380-8e1f-fadad2d72a66",
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
  "id": "686fec24-f306-41d7-bb98-965d90c73313",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:28:38.293999Z",
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
  "command_id": "1a2895f0-7102-4985-9e40-54a676c2bca7",
  "quote_id": "686fec24-f306-41d7-bb98-965d90c73313",
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
    "phone": "+380676685245"
  }
}
```

```json
{
  "id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
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
  "created_at": "2026-10-30T15:23:38.60069Z",
  "caller": {
    "name": "Олена",
    "phone": "+380676685245"
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
    "id": "11fe5c89-36e0-422b-9177-6013c4f907f0",
    "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
    "expires_at": "2026-10-30T15:23:53.605904Z",
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

`POST /api/driver/v1/offers/11fe5c89-36e0-422b-9177-6013c4f907f0/accept` → **200**

```json
{
  "command_id": "e489a5de-7237-4db9-a5fa-604ae2b2ccf4"
}
```

```json
{
  "id": "8eb2e48c-8d1b-4eb7-85af-9cf5597e458f",
  "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "871927e2-e9b5-4859-8e66-1468f1b67710",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[
  {
    "phone": "+380676685245",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:40.632211117Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[
  {
    "phone": "+380676685245",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:40.632211117Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[
  {
    "phone": "+380676685245",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:40.632211117Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "871927e2-e9b5-4859-8e66-1468f1b67710",
  "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
  "assignment_id": "8eb2e48c-8d1b-4eb7-85af-9cf5597e458f",
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
    "phone": "+380676685245"
  }
}
```

`POST /api/driver/v1/work-sessions/567897a2-944a-4cfb-a91e-3417d77d4d1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:23:41Z",
    "sequence": 1793373821893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "567897a2-944a-4cfb-a91e-3417d77d4d1e",
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
  "last_heartbeat_at": "2026-10-30T15:23:41.912235Z",
  "last_location_at": "2026-10-30T15:23:41.912235Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/871927e2-e9b5-4859-8e66-1468f1b67710/arrive` → **200**

```json
{
  "command_id": "262ecca2-9fc9-40e4-a85c-07f7502451bd",
  "expected_version": 0
}
```

```json
{
  "id": "871927e2-e9b5-4859-8e66-1468f1b67710",
  "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
  "assignment_id": "8eb2e48c-8d1b-4eb7-85af-9cf5597e458f",
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
  "arrived_at": "2026-10-30T15:23:42.204861Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676685245"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[
  {
    "phone": "+380676685245",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:40.632211117Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[
  {
    "phone": "+380676685245",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:40.632211117Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[
  {
    "phone": "+380676685245",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:40.632211117Z"
  },
  {
    "phone": "+380676685245",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:43.642296013Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[
  {
    "phone": "+380676685245",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:40.632211117Z"
  },
  {
    "phone": "+380676685245",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:43.642296013Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380676685245` → **200**

```json
[
  {
    "phone": "+380676685245",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:40.632211117Z"
  },
  {
    "phone": "+380676685245",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T15:23:43.642296013Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/871927e2-e9b5-4859-8e66-1468f1b67710/start` → **200**

```json
{
  "command_id": "1e6204b1-3b1c-4fb9-a55f-be6c59515fb0",
  "expected_version": 1
}
```

```json
{
  "id": "871927e2-e9b5-4859-8e66-1468f1b67710",
  "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
  "assignment_id": "8eb2e48c-8d1b-4eb7-85af-9cf5597e458f",
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
  "arrived_at": "2026-10-30T15:23:42.204861Z",
  "started_at": "2026-10-30T15:23:44.620767Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380676685245"
  }
}
```

`POST /api/driver/v1/trips/871927e2-e9b5-4859-8e66-1468f1b67710/complete` → **200**

```json
{
  "command_id": "7b34899c-a879-4bb4-8371-7c0699ab57ff",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:23:44Z",
  "cash_received": true
}
```

```json
{
  "id": "871927e2-e9b5-4859-8e66-1468f1b67710",
  "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
  "assignment_id": "8eb2e48c-8d1b-4eb7-85af-9cf5597e458f",
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
  "arrived_at": "2026-10-30T15:23:42.204861Z",
  "started_at": "2026-10-30T15:23:44.620767Z",
  "completed_at": "2026-10-30T15:23:44.917956Z",
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
  "session_id": "567897a2-944a-4cfb-a91e-3417d77d4d1e",
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
  "last_heartbeat_at": "2026-10-30T15:23:41.912235Z",
  "last_location_at": "2026-10-30T15:23:41.912235Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/567897a2-944a-4cfb-a91e-3417d77d4d1e/close` → **200**

```json
{
  "command_id": "0116856f-69ec-4a73-ac62-1a56342f5922",
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
  "phone": "+380633109267",
  "device_ref": "sandbox-31778"
}
```

```json
{
  "challenge_id": "f5680889-8d57-4e6b-86ad-ec95f691b160",
  "expires_at": "2026-10-30T15:28:45.808474065Z",
  "resend_available_at": "2026-10-30T15:23:46.808474065Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633109267` → **200**

```json
{
  "phone": "+380633109267",
  "audience": "CLIENT",
  "code": "500224",
  "sent_at": "2026-10-30T15:23:45.812148211Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5680889-8d57-4e6b-86ad-ec95f691b160",
  "code": "500224",
  "device_ref": "sandbox-31778"
}
```

```json
{
  "session_id": "d7bbe7f7-f87b-4a4f-89fa-d3f35721551a",
  "subject": {
    "type": "CLIENT",
    "id": "d3f25f6a-38c3-49f3-9c56-9bebee9d4d18"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2YyNWY2YS0zOGMzLTQ5ZjMtOWM1Ni05YmViZWU5ZDRkMTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NzI2LCJpYXQiOjE3OTMzNzM4MjYsImp0aSI6ImY5MDg1YmI2LTgwMjctNDE4YS1hMmRhLWMwYmNmZDI3YWMzNyIsInNpZCI6ImQ3YmJlN2Y3LWY4N2ItNGE0Zi04OWZhLWQzZjM1NzIxNTUxYSJ9.YoffJdN8HhuxSeEvsX9eF6Nki-yuxhRzBwBNAwomx2g",
  "access_expires_at": "2026-10-30T15:38:46.113265024Z",
  "refresh_token": "uYnEK-4OokHUUCWAPd4-pbLQnuLRwEUeXo7DGHohJq0",
  "refresh_expires_at": "2026-11-29T15:23:46.112801174Z",
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
  "device_ref": "sandbox-24465"
}
```

```json
{
  "challenge_id": "d83d6bfb-ac13-4d76-9d74-6c96cc7301b2",
  "expires_at": "2026-10-30T15:28:46.673199905Z",
  "resend_available_at": "2026-10-30T15:23:47.673199905Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "324317",
  "sent_at": "2026-10-30T15:23:46.675810827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d83d6bfb-ac13-4d76-9d74-6c96cc7301b2",
  "code": "324317",
  "device_ref": "sandbox-24465"
}
```

```json
{
  "session_id": "91868fb8-c430-4e80-8251-baff8d939af1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDcyNiwiaWF0IjoxNzkzMzczODI2LCJqdGkiOiIwZmJiZWVlYS1kZTJmLTQ2NTMtOGRkNC1lYTY3MTQzNTlhZGYiLCJzaWQiOiI5MTg2OGZiOC1jNDMwLTRlODAtODI1MS1iYWZmOGQ5MzlhZjEifQ.Yqy0rcTzSldfRiWxyflr_08GJv6W46QFEscV07-IwfI",
  "access_expires_at": "2026-10-30T15:38:46.984603976Z",
  "refresh_token": "NeeP2WM3tKlsJeFUIpcUSgVtZnzcpmS89xkadsa_YaE",
  "refresh_expires_at": "2026-11-29T15:23:46.984049259Z",
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
  "session_id": "ad594f9c-accb-4430-9d3a-8ead76f0fab0",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MjcsImlhdCI6MTc5MzM3MzgyNywianRpIjoiN2UxZjgyODAtMmQ3Mi00MjA5LTljOTAtZDBiZGY2NGMxOGU1Iiwic2lkIjoiYWQ1OTRmOWMtYWNjYi00NDMwLTlkM2EtOGVhZDc2ZjBmYWIwIn0.xylODTdvpGoata8Gg47G4is9PNnSK9KAxmShlC4Y5mg",
  "access_expires_at": "2026-10-30T15:38:47.850099161Z",
  "refresh_token": "rNTY4myWrjeDYXxaShmFv4cg3FKowvyQYsiUJpAdNP4",
  "refresh_expires_at": "2026-10-31T03:23:47.849488601Z",
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
  "session_id": "199744ce-116d-4dfc-891f-f6a665ea5bd2",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3MjgsImlhdCI6MTc5MzM3MzgyOCwianRpIjoiYTk0OWE4ZjUtMWZjYi00ZDRlLWI2Y2ItYzBhOGUyNGY5NWI3Iiwic2lkIjoiMTk5NzQ0Y2UtMTE2ZC00ZGZjLTg5MWYtZjZhNjY1ZWE1YmQyIn0.k4PMHd-Ew6nUOhDlHF7SOMJgPdd6rrZt-UYy5NMNFCQ",
  "access_expires_at": "2026-10-30T15:38:48.490235506Z",
  "refresh_token": "nyrO93MNM0rFZnHJRELIMpdUu-7vrF6bbONmnobuITo",
  "refresh_expires_at": "2026-10-31T03:23:48.489715049Z",
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
  "command_id": "ce6d7e0a-2737-46cc-97d1-162db09eb389",
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
  "id": "99b2222b-e63e-4211-a61b-333cb2974dfd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:28:49.050487Z",
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
  "command_id": "2908188f-02f7-4736-ad07-e8677e550f1f",
  "quote_id": "99b2222b-e63e-4211-a61b-333cb2974dfd",
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
  "id": "a36c7729-0e9d-4917-91cd-4f02a1f4a55c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d3f25f6a-38c3-49f3-9c56-9bebee9d4d18",
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
  "created_at": "2026-10-30T15:23:49.343813Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a36c7729-0e9d-4917-91cd-4f02a1f4a55c` → **200**

```json
{
  "id": "a36c7729-0e9d-4917-91cd-4f02a1f4a55c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d3f25f6a-38c3-49f3-9c56-9bebee9d4d18",
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
  "created_at": "2026-10-30T15:23:49.343813Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a36c7729-0e9d-4917-91cd-4f02a1f4a55c/cancel` → **200**

```json
{
  "command_id": "7234e597-1a90-417c-80c7-d1a682969460",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "a36c7729-0e9d-4917-91cd-4f02a1f4a55c",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d3f25f6a-38c3-49f3-9c56-9bebee9d4d18",
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
  "created_at": "2026-10-30T15:23:49.343813Z",
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
  "command_id": "2868949f-cdc4-4d2b-9e92-0d8c9886a764",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:23:50Z",
    "sequence": 1793373830548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eadfff03-c5b8-45f4-95fd-f0665636b02b",
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
  "last_heartbeat_at": "2026-10-30T15:23:50.566284Z",
  "last_location_at": "2026-10-30T15:23:50.566284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-18694"
}
```

```json
{
  "challenge_id": "62fa7a34-4b4f-4094-92c6-c0acb5b7277a",
  "expires_at": "2026-10-30T15:28:50.848020174Z",
  "resend_available_at": "2026-10-30T15:23:51.848020174Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "798313",
  "sent_at": "2026-10-30T15:23:50.850876327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62fa7a34-4b4f-4094-92c6-c0acb5b7277a",
  "code": "798313",
  "device_ref": "sandbox-18694"
}
```

```json
{
  "session_id": "83593d30-6fc7-4dd5-b88c-f7b40aea1227",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDczMSwiaWF0IjoxNzkzMzczODMxLCJqdGkiOiIwYjA5NTdiZS00ZWI3LTRmNmYtODg4YS01OTVlZWMwYmQ0NjkiLCJzaWQiOiI4MzU5M2QzMC02ZmM3LTRkZDUtYjg4Yy1mN2I0MGFlYTEyMjcifQ.wzAdY6yDlX3jTLtj8Jk-2dvmylrHEASJZD_JMVPA_nE",
  "access_expires_at": "2026-10-30T15:38:51.162048392Z",
  "refresh_token": "7wNcx6Qsd0ND1J93xpdKo1bxkHr2kzSwD4soNHZrVoY",
  "refresh_expires_at": "2026-11-29T15:23:51.16150492Z",
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
  "command_id": "e7d899a0-6817-4848-939e-a4c91db47dca",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:23:51Z",
    "sequence": 1793373831720
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9c7450bc-0df9-4553-862c-5ea0e1a86ad8",
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
  "last_heartbeat_at": "2026-10-30T15:23:51.739122Z",
  "last_location_at": "2026-10-30T15:23:51.739122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5300e6a9-e640-40d0-918d-12f3db5b822d",
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
  "id": "28b039a4-a4ad-406c-8d19-e97df87e907c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:28:52.028072Z",
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
  "command_id": "c55437af-9d80-488d-ac6a-72671bc225a5",
  "quote_id": "28b039a4-a4ad-406c-8d19-e97df87e907c",
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
  "id": "fefa84bf-b113-4776-a771-581830ff61a8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d3f25f6a-38c3-49f3-9c56-9bebee9d4d18",
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
  "created_at": "2026-10-30T15:23:52.323099Z",
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
    "id": "e9732a87-af3c-41b8-aa8f-7df196b89c65",
    "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
    "expires_at": "2026-10-30T15:24:07.327301Z",
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

`POST /api/driver/v1/offers/e9732a87-af3c-41b8-aa8f-7df196b89c65/accept` → **200**

```json
{
  "command_id": "0f505f8c-375f-4ef2-9a4c-eea40dc7ae4c"
}
```

```json
{
  "id": "c0ffa493-1839-4f1a-aa0b-c1f8c6137fa9",
  "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cd479fac-7d48-4775-9555-84ef2a8a69fc",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cd479fac-7d48-4775-9555-84ef2a8a69fc",
  "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
  "assignment_id": "c0ffa493-1839-4f1a-aa0b-c1f8c6137fa9",
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

`POST /api/driver/v1/trips/cd479fac-7d48-4775-9555-84ef2a8a69fc/cancel` → **200**

```json
{
  "command_id": "d07963db-643e-4bde-96d4-d0dd4e69417d",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "cd479fac-7d48-4775-9555-84ef2a8a69fc",
  "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
  "assignment_id": "c0ffa493-1839-4f1a-aa0b-c1f8c6137fa9",
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

`GET /api/rider/v1/orders/fefa84bf-b113-4776-a771-581830ff61a8` → **200**

```json
{
  "id": "fefa84bf-b113-4776-a771-581830ff61a8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d3f25f6a-38c3-49f3-9c56-9bebee9d4d18",
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
    "id": "c0ffa493-1839-4f1a-aa0b-c1f8c6137fa9",
    "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cd479fac-7d48-4775-9555-84ef2a8a69fc",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:23:52.323099Z",
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
    "id": "174c436f-d3be-4b8b-b902-b21cfcec83e1",
    "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
    "expires_at": "2026-10-30T15:24:08.539889Z",
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

`POST /api/driver/v1/offers/174c436f-d3be-4b8b-b902-b21cfcec83e1/accept` → **200**

```json
{
  "command_id": "0c101cf0-c69c-4eab-b3a5-2e1b654c9fd3"
}
```

```json
{
  "id": "021a7ce3-2f92-4c90-a1b3-56163f660947",
  "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bb063124-3e38-4a71-b799-93b52c4e3654",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bb063124-3e38-4a71-b799-93b52c4e3654",
  "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
  "assignment_id": "021a7ce3-2f92-4c90-a1b3-56163f660947",
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

`POST /api/driver/v1/trips/bb063124-3e38-4a71-b799-93b52c4e3654/cancel` → **200**

```json
{
  "command_id": "8500e301-51c1-411c-8bea-4353d7346cc3",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "bb063124-3e38-4a71-b799-93b52c4e3654",
  "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
  "assignment_id": "021a7ce3-2f92-4c90-a1b3-56163f660947",
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
      "id": "fefa84bf-b113-4776-a771-581830ff61a8",
      "short_number": 6,
      "status": "CANCELLED",
      "created_at": "2026-10-30T15:23:52.323099Z",
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
      "id": "a36c7729-0e9d-4917-91cd-4f02a1f4a55c",
      "short_number": 5,
      "status": "CANCELLED",
      "created_at": "2026-10-30T15:23:49.343813Z",
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
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/fefa84bf-b113-4776-a771-581830ff61a8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:23:52.323837Z",
      "actor": {
        "type": "CLIENT",
        "id": "d3f25f6a-38c3-49f3-9c56-9bebee9d4d18",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
        "quote_id": "28b039a4-a4ad-406c-8d19-e97df87e907c",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "71bd69a7-7c2b-41e1-8144-836217a07e7a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:23:52.326399Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
        "attempt_id": "fe3c9215-15ef-43d5-8312-e946d7cb7de1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "71bd69a7-7c2b-41e1-8144-836217a07e7a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:23:52.333431Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e9732a87-af3c-41b8-aa8f-7df196b89c65",
        "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "71bd69a7-7c2b-41e1-8144-836217a07e7a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:23:52.963533Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e9732a87-af3c-41b8-aa8f-7df196b89c65",
        "order_id": "fefa84bf-b113-4776-a771-581830ff61a8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c0ffa493-1839-4f1a-aa0b-c1f8c6137fa9"
      },
      "correlation_id": "8df482a0-df7d-4340-9393-e64375ecbaaf"
```

Done: orders a36c7729-0e9d-4917-91cd-4f02a1f4a55c, fefa84bf-b113-4776-a771-581830ff61a8.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738838743",
  "device_ref": "sandbox-2580"
}
```

```json
{
  "challenge_id": "69994039-901d-4e01-bd33-0361422a1261",
  "expires_at": "2026-10-30T15:28:55.850460007Z",
  "resend_available_at": "2026-10-30T15:23:56.850460007Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738838743` → **200**

```json
{
  "phone": "+380738838743",
  "audience": "CLIENT",
  "code": "611058",
  "sent_at": "2026-10-30T15:23:55.853289557Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69994039-901d-4e01-bd33-0361422a1261",
  "code": "611058",
  "device_ref": "sandbox-2580"
}
```

```json
{
  "session_id": "0beab594-403f-4d63-aa83-3adcf0a00ad9",
  "subject": {
    "type": "CLIENT",
    "id": "0c997040-6c3f-4d63-bdc3-15311dd054e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzk5NzA0MC02YzNmLTRkNjMtYmRjMy0xNTMxMWRkMDU0ZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0NzM2LCJpYXQiOjE3OTMzNzM4MzYsImp0aSI6IjRlZDllMzg0LTc2NmMtNGFmZS1iMWMzLWRkOGE5Y2NhZTEyZiIsInNpZCI6IjBiZWFiNTk0LTQwM2YtNGQ2My1hYTgzLTNhZGNmMGEwMGFkOSJ9.ezesFBOmYBbVHSqxsyDFqlAC-qMO3aVaBCEas37DmM8",
  "access_expires_at": "2026-10-30T15:38:56.153679561Z",
  "refresh_token": "0IJRshgyaoyapG4iF_7WBxt1RmZF2jArx-wjnlCGvtk",
  "refresh_expires_at": "2026-11-29T15:23:56.1531289Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b0b6c6c9-edfa-4236-8235-204f6782c943",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c5b2bf29-8eea-4a79-a401-ffdb98b0b5a0",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c5b2bf29-8eea-4a79-a401-ffdb98b0b5a0",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "85c145c2ecb2e2ede82021a6602dfc07",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c5b2bf29-8eea-4a79-a401-ffdb98b0b5a0",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738838743"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c5b2bf29-8eea-4a79-a401-ffdb98b0b5a0",
  "expires_at": "2026-10-30T15:53:56.430375Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/c5b2bf29-8eea-4a79-a401-ffdb98b0b5a0` → **200**

```json
{
  "id": "c5b2bf29-8eea-4a79-a401-ffdb98b0b5a0",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T15:53:56.430375Z",
  "card": {
    "id": "d5b862b1-469c-4ca2-ad9b-cb30589bc3ca",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7753",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:23:56.723183Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "d5b862b1-469c-4ca2-ad9b-cb30589bc3ca",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7753",
      "card_type": "Visa",
      "created_at": "2026-10-30T15:23:56.723183Z"
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
  "device_ref": "sandbox-15187"
}
```

```json
{
  "challenge_id": "2462cb2f-5034-477c-a7c6-2b5a2f48081a",
  "expires_at": "2026-10-30T15:28:57.296404326Z",
  "resend_available_at": "2026-10-30T15:23:58.296404326Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "569132",
  "sent_at": "2026-10-30T15:23:57.299040257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2462cb2f-5034-477c-a7c6-2b5a2f48081a",
  "code": "569132",
  "device_ref": "sandbox-15187"
}
```

```json
{
  "session_id": "97cda4c1-a04d-4007-86c7-60d02918a617",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDczNywiaWF0IjoxNzkzMzczODM3LCJqdGkiOiJjNmUxYjA5ZC1lYWRmLTRkNGMtYmUyYi1kYTQyZjA4ODEzOTMiLCJzaWQiOiI5N2NkYTRjMS1hMDRkLTQwMDctODZjNy02MGQwMjkxOGE2MTcifQ.S7AnaD6yIlKkSQNgFdMtWgfCPw3bCr-KRq4xpQSM1_o",
  "access_expires_at": "2026-10-30T15:38:57.598050348Z",
  "refresh_token": "A9R43aQq3NBw9t9-OqEWi9vXaH8hQldCRhVssLWMqcU",
  "refresh_expires_at": "2026-11-29T15:23:57.597404924Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9c7450bc-0df9-4553-862c-5ea0e1a86ad8",
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
  "last_heartbeat_at": "2026-10-30T15:23:51.739122Z",
  "last_location_at": "2026-10-30T15:23:51.739122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c7450bc-0df9-4553-862c-5ea0e1a86ad8/handover` → **200**

```json
{
  "command_id": "7cdf393c-146f-4d3c-8c00-30c5e1def3c6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9c7450bc-0df9-4553-862c-5ea0e1a86ad8",
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
  "last_heartbeat_at": "2026-10-30T15:23:51.739122Z",
  "last_location_at": "2026-10-30T15:23:51.739122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 42 s to the next point)

`POST /api/driver/v1/work-sessions/9c7450bc-0df9-4553-862c-5ea0e1a86ad8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:24:40Z",
    "sequence": 1793373880464
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9c7450bc-0df9-4553-862c-5ea0e1a86ad8",
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
  "last_heartbeat_at": "2026-10-30T15:24:40.48287Z",
  "last_location_at": "2026-10-30T15:24:40.48287Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6021b299-6734-43ec-9ab8-e0fd5d425414",
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
  "id": "286c9ae6-4c2e-4420-98a0-cda5ec29ed40",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:29:40.772469Z",
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
  "command_id": "02c41f09-7712-4fe3-abcc-520437de96f5",
  "quote_id": "286c9ae6-4c2e-4420-98a0-cda5ec29ed40",
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
  "id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "short_number": 7,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
  "created_at": "2026-10-30T15:24:41.062419Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/41c83f24-fce4-4ee8-97d0-858af4ed0385` → **200**

```json
{
  "id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
  "created_at": "2026-10-30T15:24:41.062419Z",
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
    "id": "168ad83c-e477-4ef4-afef-dd130475748f",
    "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
    "expires_at": "2026-10-30T15:24:56.354457Z",
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

`POST /api/driver/v1/offers/168ad83c-e477-4ef4-afef-dd130475748f/accept` → **200**

```json
{
  "command_id": "65fedb24-9382-422c-a328-4d50125153f2"
}
```

```json
{
  "id": "db86eedc-d521-4a96-abb3-f17ee89dc79b",
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f09db794-ad43-404b-8298-0dd9ec068784",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f09db794-ad43-404b-8298-0dd9ec068784",
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "assignment_id": "db86eedc-d521-4a96-abb3-f17ee89dc79b",
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

`POST /api/driver/v1/work-sessions/9c7450bc-0df9-4553-862c-5ea0e1a86ad8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:24:49Z",
    "sequence": 1793373889517
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9c7450bc-0df9-4553-862c-5ea0e1a86ad8",
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
  "last_heartbeat_at": "2026-10-30T15:24:49.53546Z",
  "last_location_at": "2026-10-30T15:24:49.53546Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/f09db794-ad43-404b-8298-0dd9ec068784/arrive` → **200**

```json
{
  "command_id": "f7d5e06d-fd36-45b5-a5de-efa9bb594e14",
  "expected_version": 0
}
```

```json
{
  "id": "f09db794-ad43-404b-8298-0dd9ec068784",
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "assignment_id": "db86eedc-d521-4a96-abb3-f17ee89dc79b",
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
  "arrived_at": "2026-10-30T15:24:49.826974Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f09db794-ad43-404b-8298-0dd9ec068784/start` → **200**

```json
{
  "command_id": "23662e9c-33b9-4f01-8a87-be63a04e57e4",
  "expected_version": 1
}
```

```json
{
  "id": "f09db794-ad43-404b-8298-0dd9ec068784",
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "assignment_id": "db86eedc-d521-4a96-abb3-f17ee89dc79b",
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
  "arrived_at": "2026-10-30T15:24:49.826974Z",
  "started_at": "2026-10-30T15:24:50.127168Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f09db794-ad43-404b-8298-0dd9ec068784/complete` → **200**

```json
{
  "command_id": "872ab6e8-b7fc-472c-869b-75cbd576d741",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:24:50Z",
  "cash_received": true
}
```

```json
{
  "id": "f09db794-ad43-404b-8298-0dd9ec068784",
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "assignment_id": "db86eedc-d521-4a96-abb3-f17ee89dc79b",
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
  "arrived_at": "2026-10-30T15:24:49.826974Z",
  "started_at": "2026-10-30T15:24:50.127168Z",
  "completed_at": "2026-10-30T15:24:50.427958Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/41c83f24-fce4-4ee8-97d0-858af4ed0385` → **200**

```json
{
  "id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
    "id": "db86eedc-d521-4a96-abb3-f17ee89dc79b",
    "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f09db794-ad43-404b-8298-0dd9ec068784",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:24:41.062419Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/41c83f24-fce4-4ee8-97d0-858af4ed0385` → **200**

```json
{
  "id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
    "id": "db86eedc-d521-4a96-abb3-f17ee89dc79b",
    "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f09db794-ad43-404b-8298-0dd9ec068784",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:24:41.062419Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/41c83f24-fce4-4ee8-97d0-858af4ed0385` → **200**

```json
{
  "id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
    "id": "db86eedc-d521-4a96-abb3-f17ee89dc79b",
    "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f09db794-ad43-404b-8298-0dd9ec068784",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:24:41.062419Z",
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

`GET /api/rider/v1/orders/41c83f24-fce4-4ee8-97d0-858af4ed0385/tip` → **200**

```json
{
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
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
  "available_until": "2026-10-31T15:24:50.427958Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/41c83f24-fce4-4ee8-97d0-858af4ed0385/tip` → **201**

```json
{
  "command_id": "34cb10ed-aa2e-4d1d-a3a6-dc6e8a290fbf",
  "amount_minor": 2500
}
```

```json
{
  "id": "c0c4f0ea-5272-4b09-81ac-e57c9de9a13a",
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T15:24:54.171626Z"
}
```

`GET /api/rider/v1/orders/41c83f24-fce4-4ee8-97d0-858af4ed0385/tip` → **200**

```json
{
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
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
  "available_until": "2026-10-31T15:24:50.427958Z",
  "open": false,
  "tip": {
    "id": "c0c4f0ea-5272-4b09-81ac-e57c9de9a13a",
    "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T15:24:54.171626Z"
  }
}
```

`GET /api/rider/v1/orders/41c83f24-fce4-4ee8-97d0-858af4ed0385/tip` → **200**

```json
{
  "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
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
  "available_until": "2026-10-31T15:24:50.427958Z",
  "open": false,
  "tip": {
    "id": "c0c4f0ea-5272-4b09-81ac-e57c9de9a13a",
    "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T15:24:54.171626Z"
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
      "id": "4bf62619-b603-4246-b484-cb55f06262c0",
      "at": "2026-10-30T15:24:55.47621Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
      "counterpart_id": null
    },
    {
      "id": "a490490d-1d56-4826-8313-65a4ab896396",
      "at": "2026-10-30T15:24:51.419211Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "728faab3-d051-4518-a2ba-5e9bb8d57ec7",
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
  "id": "7bbec1bc-f593-4f5f-8a84-098426b04800",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:29:56.333962Z",
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
  "session_id": "d7a2d53a-392f-424c-9901-8236398172d9",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ3OTYsImlhdCI6MTc5MzM3Mzg5NiwianRpIjoiMDc2ZWZlM2EtNjFiZS00Y2VjLTg2Y2UtZTEwODJlNjAyNTkwIiwic2lkIjoiZDdhMmQ1M2EtMzkyZi00MjRjLTk5MDEtODIzNjM5ODE3MmQ5In0.CvazDTmI_gxKDUM5CTFgPSYG5OaVHpYIV_P-sL4Djm0",
  "access_expires_at": "2026-10-30T15:39:56.946097263Z",
  "refresh_token": "TZW2Rz9Gk2U-xUtnphbwvsXwfz4sr0OHJgq98r6A8GE",
  "refresh_expires_at": "2026-10-31T03:24:56.945598244Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738838743` → **200**

```json
{
  "client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0"
}
```

`POST /api/admin/v1/rider-wallets/0c997040-6c3f-4d63-bdc3-15311dd054e0/top-ups` → **201**

```json
{
  "command_id": "38318581-643d-4419-8c45-57be10343e58",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
      "id": "1ed302ce-dfcb-487d-8a13-ff117e145656",
      "at": "2026-10-30T15:24:57.48531Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "960ed108-e80e-4e8e-baac-8d0c46a78bd7",
  "quote_id": "7bbec1bc-f593-4f5f-8a84-098426b04800",
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
  "id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
  "created_at": "2026-10-30T15:24:57.784872Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1fbea4fa-9439-4cb5-8059-a08611268fd6` → **200**

```json
{
  "id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
  "created_at": "2026-10-30T15:24:57.784872Z",
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
    "id": "f14fd537-649e-4000-9a17-796b6176e6ac",
    "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
    "expires_at": "2026-10-30T15:25:12.789536Z",
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

`POST /api/driver/v1/offers/f14fd537-649e-4000-9a17-796b6176e6ac/accept` → **200**

```json
{
  "command_id": "dd3f1361-4e85-4459-a9e3-14839437d922"
}
```

```json
{
  "id": "fad95cdc-7715-41aa-bc5d-eeca2f253ade",
  "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ecb0d952-e1fb-4352-976e-e714111a088a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ecb0d952-e1fb-4352-976e-e714111a088a",
  "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
  "assignment_id": "fad95cdc-7715-41aa-bc5d-eeca2f253ade",
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

`POST /api/driver/v1/work-sessions/9c7450bc-0df9-4553-862c-5ea0e1a86ad8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:24:59Z",
    "sequence": 1793373899217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9c7450bc-0df9-4553-862c-5ea0e1a86ad8",
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
  "last_heartbeat_at": "2026-10-30T15:24:59.234692Z",
  "last_location_at": "2026-10-30T15:24:59.234692Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/ecb0d952-e1fb-4352-976e-e714111a088a/arrive` → **200**

```json
{
  "command_id": "2ffeeaba-6d39-4c5d-ab07-c080bf88fe95",
  "expected_version": 0
}
```

```json
{
  "id": "ecb0d952-e1fb-4352-976e-e714111a088a",
  "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
  "assignment_id": "fad95cdc-7715-41aa-bc5d-eeca2f253ade",
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
  "arrived_at": "2026-10-30T15:24:59.523846Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ecb0d952-e1fb-4352-976e-e714111a088a/start` → **200**

```json
{
  "command_id": "66fc9cf7-6162-4839-8175-618711d49758",
  "expected_version": 1
}
```

```json
{
  "id": "ecb0d952-e1fb-4352-976e-e714111a088a",
  "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
  "assignment_id": "fad95cdc-7715-41aa-bc5d-eeca2f253ade",
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
  "arrived_at": "2026-10-30T15:24:59.523846Z",
  "started_at": "2026-10-30T15:24:59.83354Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ecb0d952-e1fb-4352-976e-e714111a088a/complete` → **200**

```json
{
  "command_id": "b2025fe4-5bcb-41eb-99d9-180d17039138",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:25:00Z",
  "cash_received": true
}
```

```json
{
  "id": "ecb0d952-e1fb-4352-976e-e714111a088a",
  "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
  "assignment_id": "fad95cdc-7715-41aa-bc5d-eeca2f253ade",
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
  "arrived_at": "2026-10-30T15:24:59.523846Z",
  "started_at": "2026-10-30T15:24:59.83354Z",
  "completed_at": "2026-10-30T15:25:00.136485Z",
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
  "client_id": "0c997040-6c3f-4d63-bdc3-15311dd054e0",
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
      "id": "1ed302ce-dfcb-487d-8a13-ff117e145656",
      "at": "2026-10-30T15:24:57.48531Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_id": null
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
      "balance_minor": 30204,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/1fbea4fa-9439-4cb5-8059-a08611268fd6/tip` → **200**

```json
{
  "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
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
  "available_until": "2026-10-31T15:25:00.136485Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1fbea4fa-9439-4cb5-8059-a08611268fd6/tip` → **201**

```json
{
  "command_id": "27d0acb6-8cfc-4991-9b12-3b7b77a28abb",
  "amount_minor": 2500
}
```

```json
{
  "id": "c6e63925-e8bb-48b7-a80a-2006425854f1",
  "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T15:25:01.27173Z"
}
```

`GET /api/rider/v1/orders/1fbea4fa-9439-4cb5-8059-a08611268fd6/tip` → **200**

```json
{
  "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
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
  "available_until": "2026-10-31T15:25:00.136485Z",
  "open": false,
  "tip": {
    "id": "c6e63925-e8bb-48b7-a80a-2006425854f1",
    "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T15:25:01.27173Z"
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
      "id": "4273bd05-d54a-478b-bab3-25b82267b092",
      "at": "2026-10-30T15:25:00.517364Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
      "counterpart_id": null
    },
    {
      "id": "4bf62619-b603-4246-b484-cb55f06262c0",
      "at": "2026-10-30T15:24:55.47621Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
      "counterpart_id": null
    },
    {
      "id": "a490490d-1d56-4826-8313-65a4ab896396",
      "at": "2026-10-30T15:24:51.419211Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
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
      "id": "8c96b847-16dd-4282-9603-ca5d168e6547",
      "at": "2026-10-30T15:25:02.541816Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
      "counterpart_id": null
    },
    {
      "id": "4273bd05-d54a-478b-bab3-25b82267b092",
      "at": "2026-10-30T15:25:00.517364Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1fbea4fa-9439-4cb5-8059-a08611268fd6",
      "counterpart_id": null
    },
    {
      "id": "4bf62619-b603-4246-b484-cb55f06262c0",
      "at": "2026-10-30T15:24:55.47621Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
      "counterpart_id": null
    },
    {
      "id": "a490490d-1d56-4826-8313-65a4ab896396",
      "at": "2026-10-30T15:24:51.419211Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "41c83f24-fce4-4ee8-97d0-858af4ed0385",
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9c7450bc-0df9-4553-862c-5ea0e1a86ad8",
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
  "last_heartbeat_at": "2026-10-30T15:24:59.234692Z",
  "last_location_at": "2026-10-30T15:24:59.234692Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c7450bc-0df9-4553-862c-5ea0e1a86ad8/close` → **200**

```json
{
  "command_id": "10bb13d1-bea5-4abe-a6e3-29f9fb5611a3",
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

Done: card order 1fbea4fa-9439-4cb5-8059-a08611268fd6.

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
  "phone": "+380732255480",
  "device_ref": "sandbox-3363"
}
```

```json
{
  "challenge_id": "0d4cf487-e168-40dc-ad81-f84abcb934c1",
  "expires_at": "2026-10-30T15:30:04.247079189Z",
  "resend_available_at": "2026-10-30T15:25:05.247079189Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732255480` → **200**

```json
{
  "phone": "+380732255480",
  "audience": "CLIENT",
  "code": "135277",
  "sent_at": "2026-10-30T15:25:04.249725285Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d4cf487-e168-40dc-ad81-f84abcb934c1",
  "code": "135277",
  "device_ref": "sandbox-3363"
}
```

```json
{
  "session_id": "0ca64f4b-63c6-4826-8101-68091a3c771c",
  "subject": {
    "type": "CLIENT",
    "id": "ddb3b958-c4c7-40d4-86b9-6b9bf2b4bb83"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGIzYjk1OC1jNGM3LTQwZDQtODZiOS02YjliZjJiNGJiODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0ODA0LCJpYXQiOjE3OTMzNzM5MDQsImp0aSI6IjQ5ZDkzNzBmLTg3ZGEtNGEwOS1iMzVmLWU1ZDNiNGNmMDZiNSIsInNpZCI6IjBjYTY0ZjRiLTYzYzYtNDgyNi04MTAxLTY4MDkxYTNjNzcxYyJ9.1eW-59m6O9mlTmrEY5pbA-sE-7Ppy79o6YaCKgC_DdI",
  "access_expires_at": "2026-10-30T15:40:04.548988964Z",
  "refresh_token": "5beYz8zzcaS92yrrCAWUgpBY1UtcVf-WzPNpN29MzJw",
  "refresh_expires_at": "2026-11-29T15:25:04.548362612Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e6f81f0f-5fac-43c7-9795-74c53e9932e8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "5c46875d-3aa7-4660-97cc-8d371faf0d27",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5c46875d-3aa7-4660-97cc-8d371faf0d27",
    "orderDate": "1793373904",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "598f589ce80b82adae1f468a0f7b82d2",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5c46875d-3aa7-4660-97cc-8d371faf0d27",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732255480"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5c46875d-3aa7-4660-97cc-8d371faf0d27",
  "created_at": "2026-10-30T15:25:04.836885Z",
  "expires_at": "2026-10-30T15:55:04.836885Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/5c46875d-3aa7-4660-97cc-8d371faf0d27` → **200**

```json
{
  "id": "5c46875d-3aa7-4660-97cc-8d371faf0d27",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T15:25:04.836885Z",
  "expires_at": "2026-10-30T15:55:04.836885Z",
  "completed_at": "2026-10-30T15:25:05.128553Z",
  "masked_pan": "41****1736",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ddb3b958-c4c7-40d4-86b9-6b9bf2b4bb83",
  "balances": [],
  "entries": [],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ddb3b958-c4c7-40d4-86b9-6b9bf2b4bb83",
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
      "id": "540e4019-f283-4ce9-8e4c-467529508d06",
      "at": "2026-10-30T15:25:05.557197Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "ddb3b958-c4c7-40d4-86b9-6b9bf2b4bb83",
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
      "id": "540e4019-f283-4ce9-8e4c-467529508d06",
      "at": "2026-10-30T15:25:05.557197Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The driver tops up the balance by 500.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-11569"
}
```

```json
{
  "challenge_id": "5df70afe-d7fa-46ff-917f-7c9365e43fb0",
  "expires_at": "2026-10-30T15:30:07.277938847Z",
  "resend_available_at": "2026-10-30T15:25:08.277938847Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "856753",
  "sent_at": "2026-10-30T15:25:07.281149094Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5df70afe-d7fa-46ff-917f-7c9365e43fb0",
  "code": "856753",
  "device_ref": "sandbox-11569"
}
```

```json
{
  "session_id": "a0c8d394-6fe8-49aa-9861-da83315c6447",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDgwNywiaWF0IjoxNzkzMzczOTA3LCJqdGkiOiI5MzFhYzI1ZS0xZmUzLTQ1ODQtYjAzOS1iZDUxMTVlNmNiYmEiLCJzaWQiOiJhMGM4ZDM5NC02ZmU4LTQ5YWEtOTg2MS1kYTgzMzE1YzY0NDcifQ.YXTYAYd4LopmBBoTxHydwIHKwPVfAWmlmxNNzid44jg",
  "access_expires_at": "2026-10-30T15:40:07.584845222Z",
  "refresh_token": "8TIL1rx_L27M2ZSi_GYEAPWtbZyXjCW5SkR-NtjWLr8",
  "refresh_expires_at": "2026-11-29T15:25:07.58424081Z",
  "account_created": false
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": [],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`POST /api/driver/v1/balance/card-top-ups` → **201**

```json
{
  "command_id": "e10f6109-6941-4df3-9bd9-52eb07d1ae03",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "2455dea3-9edf-4f2b-a5e2-7d1d6eb5edbd",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2455dea3-9edf-4f2b-a5e2-7d1d6eb5edbd",
    "orderDate": "1793373908",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "6ba1e7773b32fa7b18d9e0cc524b0134",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2455dea3-9edf-4f2b-a5e2-7d1d6eb5edbd",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2455dea3-9edf-4f2b-a5e2-7d1d6eb5edbd",
  "created_at": "2026-10-30T15:25:08.148576Z",
  "expires_at": "2026-10-30T15:55:08.148576Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/2455dea3-9edf-4f2b-a5e2-7d1d6eb5edbd` → **200**

```json
{
  "id": "2455dea3-9edf-4f2b-a5e2-7d1d6eb5edbd",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T15:25:08.148576Z",
  "expires_at": "2026-10-30T15:55:08.148576Z",
  "completed_at": "2026-10-30T15:25:08.432849Z",
  "masked_pan": "41****3160",
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
      "id": "177d03eb-cb63-43cf-b663-25a96dd6448f",
      "at": "2026-10-30T15:25:08.571887Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 50000,
      "reason": "Top-up by card",
      "order_id": null,
      "counterpart_id": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## A rider's token does not open the driver's path

`POST /api/driver/v1/balance/card-top-ups` → **401**

```json
{
  "command_id": "881f1950-87cd-41eb-a415-07e26b33b70c",
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
  "correlation_id": "4264240b-cae5-4fa2-81f5-bd13b7d4a17e"
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
  "device_ref": "sandbox-7355"
}
```

```json
{
  "challenge_id": "afeb3a1d-e5e0-454f-8003-0ff0a1873cb2",
  "expires_at": "2026-10-30T15:30:09.316758795Z",
  "resend_available_at": "2026-10-30T15:25:10.316758795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "928325",
  "sent_at": "2026-10-30T15:25:09.319383234Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "afeb3a1d-e5e0-454f-8003-0ff0a1873cb2",
  "code": "928325",
  "device_ref": "sandbox-7355"
}
```

```json
{
  "session_id": "4c063910-5d7d-4ec5-995e-f9a9c8925845",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDgwOSwiaWF0IjoxNzkzMzczOTA5LCJqdGkiOiIzMTBhODFkYi0wYjhlLTRiMDUtOTBkYi01MTVhZTJhMWM1MTQiLCJzaWQiOiI0YzA2MzkxMC01ZDdkLTRlYzUtOTk1ZS1mOWE5Yzg5MjU4NDUifQ.yf4UJsvTOREal_MYi6uEn4jj4mTX6M3cqeW7x3Fm0O0",
  "access_expires_at": "2026-10-30T15:40:09.626408986Z",
  "refresh_token": "H8UHt11NBWnoyTjvI4xPuQhIaGzTOwsYGzip1guM6mY",
  "refresh_expires_at": "2026-11-29T15:25:09.625962662Z",
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
  "command_id": "b983ddbc-ebbc-487d-8469-cfd4a62caf89",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:25:10Z",
    "sequence": 1793373910190
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6026b7f9-c06b-4d09-aa7a-5104136bdd4a",
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
  "last_heartbeat_at": "2026-10-30T15:25:10.207674Z",
  "last_location_at": "2026-10-30T15:25:10.207674Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635767013",
  "device_ref": "sandbox-11223"
}
```

```json
{
  "challenge_id": "67692f20-33d1-4357-b606-19deedd1d163",
  "expires_at": "2026-10-30T15:30:10.489484073Z",
  "resend_available_at": "2026-10-30T15:25:11.489484073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635767013` → **200**

```json
{
  "phone": "+380635767013",
  "audience": "CLIENT",
  "code": "643897",
  "sent_at": "2026-10-30T15:25:10.492151069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67692f20-33d1-4357-b606-19deedd1d163",
  "code": "643897",
  "device_ref": "sandbox-11223"
}
```

```json
{
  "session_id": "c632d0ae-1536-43d7-a856-23aaacc9de92",
  "subject": {
    "type": "CLIENT",
    "id": "b0eef010-0774-41b9-b0b7-968d9e71f8db"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGVlZjAxMC0wNzc0LTQxYjktYjBiNy05NjhkOWU3MWY4ZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0ODEwLCJpYXQiOjE3OTMzNzM5MTAsImp0aSI6IjUxNGQzNjc0LTYwNjctNGRkZi05MzgxLTcwOTVkODVlZjIyYSIsInNpZCI6ImM2MzJkMGFlLTE1MzYtNDNkNy1hODU2LTIzYWFhY2M5ZGU5MiJ9.HQfptRuCiLwCmD0O7Xy65t-9s_7ou2NKt068saeVAJg",
  "access_expires_at": "2026-10-30T15:40:10.795520268Z",
  "refresh_token": "eb-1Zfc3Rx0EkHr91ZnhrT0IdzVK1WYMNhfVeGC3b3Q",
  "refresh_expires_at": "2026-11-29T15:25:10.794908968Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b8b5a47b-5ec2-41f6-8091-04c0eaaae10c",
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
  "id": "392a0dd4-4a02-4d85-8894-de42c9efc0b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:30:11.079106Z",
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
  "command_id": "f34c764a-0742-436e-bdfd-0935ec8c5a41",
  "quote_id": "392a0dd4-4a02-4d85-8894-de42c9efc0b7",
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
  "id": "6c49a48d-3104-492f-88c5-db0707f05d74",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b0eef010-0774-41b9-b0b7-968d9e71f8db",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:25:11.376883Z",
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
    "id": "9803208b-e874-4dd3-9282-f69850e44f09",
    "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
    "expires_at": "2026-10-30T15:25:26.380363Z",
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

`POST /api/driver/v1/offers/9803208b-e874-4dd3-9282-f69850e44f09/accept` → **200**

```json
{
  "command_id": "0bf3fef9-d3be-4e60-8378-695cbc8032f9"
}
```

```json
{
  "id": "2a2dad9c-e748-4a54-985c-038635ad902c",
  "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "abb79233-2ad4-416d-987a-eba71819c909",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "abb79233-2ad4-416d-987a-eba71819c909",
  "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
  "assignment_id": "2a2dad9c-e748-4a54-985c-038635ad902c",
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

`POST /api/driver/v1/work-sessions/6026b7f9-c06b-4d09-aa7a-5104136bdd4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:25:12Z",
    "sequence": 1793373912543
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6026b7f9-c06b-4d09-aa7a-5104136bdd4a",
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
  "last_heartbeat_at": "2026-10-30T15:25:12.561263Z",
  "last_location_at": "2026-10-30T15:25:12.561263Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/abb79233-2ad4-416d-987a-eba71819c909/arrive` → **200**

```json
{
  "command_id": "69a29855-b235-4377-9911-6ee5804ecd24",
  "expected_version": 0
}
```

```json
{
  "id": "abb79233-2ad4-416d-987a-eba71819c909",
  "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
  "assignment_id": "2a2dad9c-e748-4a54-985c-038635ad902c",
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
  "arrived_at": "2026-10-30T15:25:12.861488Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/abb79233-2ad4-416d-987a-eba71819c909/start` → **200**

```json
{
  "command_id": "d0502617-de87-48f0-b322-ce0c423ad1d1",
  "expected_version": 1
}
```

```json
{
  "id": "abb79233-2ad4-416d-987a-eba71819c909",
  "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
  "assignment_id": "2a2dad9c-e748-4a54-985c-038635ad902c",
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
  "arrived_at": "2026-10-30T15:25:12.861488Z",
  "started_at": "2026-10-30T15:25:13.149893Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/abb79233-2ad4-416d-987a-eba71819c909/complete` → **200**

```json
{
  "command_id": "17eff99e-9511-4c5c-a3d9-1803436c36ca",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:25:13Z",
  "cash_received": false
}
```

```json
{
  "id": "abb79233-2ad4-416d-987a-eba71819c909",
  "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
  "assignment_id": "2a2dad9c-e748-4a54-985c-038635ad902c",
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
  "arrived_at": "2026-10-30T15:25:12.861488Z",
  "started_at": "2026-10-30T15:25:13.149893Z",
  "completed_at": "2026-10-30T15:25:13.457574Z",
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
  "session_id": "8674b9b5-e2b2-4294-bd66-52cf3ba4d510",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ4MTQsImlhdCI6MTc5MzM3MzkxNCwianRpIjoiZjRlNjM4YmYtN2FiOC00MTNiLTk1ZTYtZDYyYTEzYmQ0ZDBlIiwic2lkIjoiODY3NGI5YjUtZTJiMi00Mjk0LWJkNjYtNTJjZjNiYTRkNTEwIn0.Y95l0tGbYLeU4YQ2zScej02igOV2ToFioPmr1qAkzaU",
  "access_expires_at": "2026-10-30T15:40:14.069036043Z",
  "refresh_token": "1oSTvTHDen58hfoNk7hw-36U-95LhkgLCz_Or3SqrU0",
  "refresh_expires_at": "2026-10-31T03:25:14.068553056Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/6c49a48d-3104-492f-88c5-db0707f05d74/cash-dispute` → **200**

```json
{
  "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "b0eef010-0774-41b9-b0b7-968d9e71f8db",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T15:25:13.629875Z",
  "decide_by": "2026-11-13T15:25:13.629875Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T15:25:13.629875Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "b0eef010-0774-41b9-b0b7-968d9e71f8db",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T15:25:13.629875Z",
      "decide_by": "2026-11-13T15:25:13.629875Z",
      "decision": null,
      "decided_by": null,
      "reason": null,
      "decided_at": null,
      "version": 1
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Finance decides: the rider did not pay, the service pays the driver

`POST /api/admin/v1/orders/6c49a48d-3104-492f-88c5-db0707f05d74/cash-dispute/decide` → **400**

```json
{
  "command_id": "679c9ab2-ba49-4c94-b237-02867fd60cb7",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/6c49a48d-3104-492f-88c5-db0707f05d74/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "fb40e9b9-7940-483b-9f40-7fb2e7187db5",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/6c49a48d-3104-492f-88c5-db0707f05d74/cash-dispute/decide` → **200**

```json
{
  "command_id": "de809391-aabe-4f42-9ee3-0f30494ebffb",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "b0eef010-0774-41b9-b0b7-968d9e71f8db",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T15:25:13.629875Z",
  "decide_by": "2026-11-13T15:25:13.629875Z",
  "decision": "PAY_DRIVER",
  "decided_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T15:25:15.225992Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/6c49a48d-3104-492f-88c5-db0707f05d74/cash-dispute/decide` → **409**

```json
{
  "command_id": "0f954b3b-011a-4e2d-b4bc-7505ecf82421",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/6c49a48d-3104-492f-88c5-db0707f05d74/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "000899ba-06c8-4f97-8aae-b75867beef60"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6026b7f9-c06b-4d09-aa7a-5104136bdd4a",
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
  "last_heartbeat_at": "2026-10-30T15:25:12.561263Z",
  "last_location_at": "2026-10-30T15:25:12.561263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6026b7f9-c06b-4d09-aa7a-5104136bdd4a/close` → **200**

```json
{
  "command_id": "21765dd2-0820-4c2c-a34c-5d2370fb708f",
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
  "phone": "+380734670180",
  "device_ref": "sandbox-23450"
}
```

```json
{
  "challenge_id": "0e5dc5b5-f578-47e7-a9f5-5c77dbb2528a",
  "expires_at": "2026-10-30T15:30:16.37004118Z",
  "resend_available_at": "2026-10-30T15:25:17.37004118Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734670180` → **200**

```json
{
  "phone": "+380734670180",
  "audience": "CLIENT",
  "code": "789702",
  "sent_at": "2026-10-30T15:25:16.37262095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e5dc5b5-f578-47e7-a9f5-5c77dbb2528a",
  "code": "789702",
  "device_ref": "sandbox-23450"
}
```

```json
{
  "session_id": "cb0b81ff-1b82-4245-8e1c-7149e5f89fb8",
  "subject": {
    "type": "CLIENT",
    "id": "1b266884-596d-4105-bccd-30129d3c8fb7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjI2Njg4NC01OTZkLTQxMDUtYmNjZC0zMDEyOWQzYzhmYjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0ODE2LCJpYXQiOjE3OTMzNzM5MTYsImp0aSI6IjQyNGY2ZDcwLTRmOTctNDM4ZS04NmZjLTNlYjY5YjAwMWJkOCIsInNpZCI6ImNiMGI4MWZmLTFiODItNDI0NS04ZTFjLTcxNDllNWY4OWZiOCJ9.rw7do1Tn5Cw9hEDynWitSka04Fc8U8Co7jXSBzpmKNM",
  "access_expires_at": "2026-10-30T15:40:16.669239087Z",
  "refresh_token": "cdVUo_fkkTFv8gVVBe0gYXEeqsNFo2vs2sZziuri6nM",
  "refresh_expires_at": "2026-11-29T15:25:16.667893903Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c7250cc2-3bcd-41ab-b8d5-31f145f8ffbe",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "b7ed3011-9165-4d94-a857-12021b6db05d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-b7ed3011-9165-4d94-a857-12021b6db05d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b054602ceb610f391f747f124bc938db",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=b7ed3011-9165-4d94-a857-12021b6db05d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734670180"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=b7ed3011-9165-4d94-a857-12021b6db05d",
  "expires_at": "2026-10-30T15:55:16.952923Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/b7ed3011-9165-4d94-a857-12021b6db05d` → **200**

```json
{
  "id": "b7ed3011-9165-4d94-a857-12021b6db05d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T15:55:16.952923Z",
  "card": {
    "id": "01da5105-3724-4a1a-aa89-bb1b97b2392c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2760",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:25:17.236402Z"
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
  "device_ref": "sandbox-15206"
}
```

```json
{
  "challenge_id": "468bee41-2fe7-41d5-bcbb-c7b01f6fece4",
  "expires_at": "2026-10-30T15:30:17.538626681Z",
  "resend_available_at": "2026-10-30T15:25:18.538626681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "629295",
  "sent_at": "2026-10-30T15:25:17.541972162Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "468bee41-2fe7-41d5-bcbb-c7b01f6fece4",
  "code": "629295",
  "device_ref": "sandbox-15206"
}
```

```json
{
  "session_id": "9bd050eb-86bb-41a8-bbde-fe874e758052",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDgxNywiaWF0IjoxNzkzMzczOTE3LCJqdGkiOiJiNjY0M2RkZS04ZmE1LTRkN2UtOWNjNS01OGY4NTlkNjM5ZDYiLCJzaWQiOiI5YmQwNTBlYi04NmJiLTQxYTgtYmJkZS1mZTg3NGU3NTgwNTIifQ.uKgguyfkiJRZV2iMBpmkh2HZxsOrKIhQKkuedMcuMao",
  "access_expires_at": "2026-10-30T15:40:17.842672318Z",
  "refresh_token": "3vcLQ1C78BdJqaYh_4bbPoTvA9POd3dUsV73vI6eWjk",
  "refresh_expires_at": "2026-11-29T15:25:17.842192555Z",
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
  "command_id": "e03c83df-48a1-45ab-887d-33b0223db920",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:25:18Z",
    "sequence": 1793373918406
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ec0beadd-2915-4c33-b76b-bfdc1d83be9a",
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
  "last_heartbeat_at": "2026-10-30T15:25:18.423592Z",
  "last_location_at": "2026-10-30T15:25:18.423592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "935dde3e-f5f1-4b01-861a-aad929dc4e72",
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
  "id": "bfec8dcd-86ef-4d53-9372-3b1b30adc89d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:30:18.715031Z",
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
  "command_id": "a2eef0bb-29d2-447d-b038-918bd86d3b09",
  "quote_id": "bfec8dcd-86ef-4d53-9372-3b1b30adc89d",
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
  "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1b266884-596d-4105-bccd-30129d3c8fb7",
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
  "created_at": "2026-10-30T15:25:19.012422Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a` → **200**

```json
{
  "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "short_number": 10,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1b266884-596d-4105-bccd-30129d3c8fb7",
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
  "created_at": "2026-10-30T15:25:19.012422Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a` → **200**

```json
{
  "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1b266884-596d-4105-bccd-30129d3c8fb7",
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
  "created_at": "2026-10-30T15:25:19.012422Z",
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
    "id": "43f5890f-1966-454a-8149-4cb490969ccd",
    "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
    "expires_at": "2026-10-30T15:25:34.671503Z",
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

`POST /api/driver/v1/offers/43f5890f-1966-454a-8149-4cb490969ccd/accept` → **200**

```json
{
  "command_id": "181add16-ce4b-483e-99a1-a19503f16c8f"
}
```

```json
{
  "id": "5fdfe029-5ed8-4dee-aed1-26ddbb570b06",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "20170138-b9b3-4523-b170-bcb2a810c5ba",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "20170138-b9b3-4523-b170-bcb2a810c5ba",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "assignment_id": "5fdfe029-5ed8-4dee-aed1-26ddbb570b06",
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

`POST /api/rider/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/messages` → **201**

```json
{
  "command_id": "8ac32573-bab5-4a7b-8b88-fd9f6ab1e0a8",
  "body": "Я біля входу, мій номер +380734670180, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "b88312f7-38b3-4aca-bc8c-b3a41dc9b729",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380734670180, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T15:25:21.716628739Z"
}
```

`POST /api/driver/v1/trips/20170138-b9b3-4523-b170-bcb2a810c5ba/messages` → **201**

```json
{
  "command_id": "aa99642e-6b49-468e-94c7-881196566d07",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "07e8e49b-8b6b-4f87-abc7-a40c31199c0d",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T15:25:21.99828493Z"
}
```

(the car drives 5 s to the next point)

`POST /api/driver/v1/work-sessions/ec0beadd-2915-4c33-b76b-bfdc1d83be9a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:25:27Z",
    "sequence": 1793373927288
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ec0beadd-2915-4c33-b76b-bfdc1d83be9a",
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
  "last_heartbeat_at": "2026-10-30T15:25:27.306637Z",
  "last_location_at": "2026-10-30T15:25:27.306637Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/20170138-b9b3-4523-b170-bcb2a810c5ba/arrive` → **200**

```json
{
  "command_id": "348045ba-4416-4e63-9d87-b82ac576aded",
  "expected_version": 0
}
```

```json
{
  "id": "20170138-b9b3-4523-b170-bcb2a810c5ba",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "assignment_id": "5fdfe029-5ed8-4dee-aed1-26ddbb570b06",
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
  "arrived_at": "2026-10-30T15:25:27.605332Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/20170138-b9b3-4523-b170-bcb2a810c5ba/start` → **200**

```json
{
  "command_id": "360e83f9-1335-4fe1-9214-8060628508a4",
  "expected_version": 1
}
```

```json
{
  "id": "20170138-b9b3-4523-b170-bcb2a810c5ba",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "assignment_id": "5fdfe029-5ed8-4dee-aed1-26ddbb570b06",
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
  "arrived_at": "2026-10-30T15:25:27.605332Z",
  "started_at": "2026-10-30T15:25:27.911181Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 90 s to the next point)

`POST /api/driver/v1/work-sessions/ec0beadd-2915-4c33-b76b-bfdc1d83be9a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:26:58Z",
    "sequence": 1793374018212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ec0beadd-2915-4c33-b76b-bfdc1d83be9a",
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
  "last_heartbeat_at": "2026-10-30T15:26:58.230699Z",
  "last_location_at": "2026-10-30T15:26:58.230699Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/20170138-b9b3-4523-b170-bcb2a810c5ba/complete` → **200**

```json
{
  "command_id": "e099cbce-ffc3-48ae-9317-f7c1686ade38",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:26:58Z",
  "cash_received": false
}
```

```json
{
  "id": "20170138-b9b3-4523-b170-bcb2a810c5ba",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "assignment_id": "5fdfe029-5ed8-4dee-aed1-26ddbb570b06",
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
  "arrived_at": "2026-10-30T15:25:27.605332Z",
  "started_at": "2026-10-30T15:25:27.911181Z",
  "completed_at": "2026-10-30T15:26:58.528377Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a` → **200**

```json
{
  "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1b266884-596d-4105-bccd-30129d3c8fb7",
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
    "id": "5fdfe029-5ed8-4dee-aed1-26ddbb570b06",
    "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "20170138-b9b3-4523-b170-bcb2a810c5ba",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:25:19.012422Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a` → **200**

```json
{
  "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1b266884-596d-4105-bccd-30129d3c8fb7",
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
    "id": "5fdfe029-5ed8-4dee-aed1-26ddbb570b06",
    "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "20170138-b9b3-4523-b170-bcb2a810c5ba",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:25:19.012422Z",
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
  "session_id": "ec0beadd-2915-4c33-b76b-bfdc1d83be9a",
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
  "last_heartbeat_at": "2026-10-30T15:26:58.230699Z",
  "last_location_at": "2026-10-30T15:26:58.230699Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec0beadd-2915-4c33-b76b-bfdc1d83be9a/close` → **200**

```json
{
  "command_id": "a4201ce6-260b-40ce-aeb6-ee8d372e98b0",
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
  "session_id": "95844b42-09bf-4b6e-a14c-f58ee5d5a7d6",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5MjEsImlhdCI6MTc5MzM3NDAyMSwianRpIjoiNWVmNzA2ZjYtYzRkNS00OGVjLThiMzctMTAyOGNhM2FhNWI2Iiwic2lkIjoiOTU4NDRiNDItMDliZi00YjZlLWExNGMtZjU4ZWU1ZDVhN2Q2In0.WC4QZWvQAa-OVArrj3bJCbTzf-MTaYBtvK9rPOe3J3M",
  "access_expires_at": "2026-10-30T15:42:01.310921653Z",
  "refresh_token": "Jevio6ZeRxhdFwIvwWHSBdu-MxJqWolmz8kQWwqgasI",
  "refresh_expires_at": "2026-10-31T03:27:01.310303642Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e556bd41-dbb0-4ef0-b0cb-8d61864fd3ab"
}
```

`GET /api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T15:27:01.896684895Z",
  "order": {
    "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
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
    "created_at": "2026-10-30T15:25:19.012422Z",
    "assigned_at": "2026-10-30T15:25:21.161747Z",
    "arrived_at": "2026-10-30T15:25:27.605332Z",
    "started_at": "2026-10-30T15:25:27.911181Z",
    "completed_at": "2026-10-30T15:26:58.528377Z"
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
    "id": "1b266884-596d-4105-bccd-30129d3c8fb7",
    "registered_at": "2026-10-30T15:25:16.665814Z",
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
      "created_at": "2026-10-30T15:25:19.015926Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T15:26:58.858338Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/chargebacks` → **422**

```json
{
  "command_id": "4a921770-f147-44b3-bbcf-d947435d333f",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "24661850-a5d7-4f92-9e12-e12837b3438e"
}
```

`POST /api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/chargebacks` → **201**

```json
{
  "command_id": "6eb626cc-62d8-4e38-961a-863ebcae238a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "a45765f0-12e5-4f66-99f7-0d33f3d81395",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T15:27:02.540821Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/chargebacks` → **201**

```json
{
  "command_id": "6eb626cc-62d8-4e38-961a-863ebcae238a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "a45765f0-12e5-4f66-99f7-0d33f3d81395",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T15:27:02.540821Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/1b266884-596d-4105-bccd-30129d3c8fb7` → **200**

```json
{
  "client": {
    "id": "1b266884-596d-4105-bccd-30129d3c8fb7",
    "phone": "+380734670180",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:25:16.665814Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:25:19.012422Z",
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

`POST /api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/chargebacks/a45765f0-12e5-4f66-99f7-0d33f3d81395/resolve` → **200**

```json
{
  "command_id": "b9aa736f-38ff-435a-a65c-880420f6c629",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "a45765f0-12e5-4f66-99f7-0d33f3d81395",
  "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T15:27:02.540821Z",
  "resolved_at": "2026-10-30T15:27:03.459027Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/1b266884-596d-4105-bccd-30129d3c8fb7` → **200**

```json
{
  "client": {
    "id": "1b266884-596d-4105-bccd-30129d3c8fb7",
    "phone": "+380734670180",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:25:16.665814Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:25:19.012422Z",
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

`GET /api/admin/v1/clients/1b266884-596d-4105-bccd-30129d3c8fb7` → **200**

```json
{
  "client": {
    "id": "1b266884-596d-4105-bccd-30129d3c8fb7",
    "phone": "+380734670180",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:25:16.665814Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
      "short_number": 10,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:25:19.012422Z",
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

`POST /api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/chargebacks/a45765f0-12e5-4f66-99f7-0d33f3d81395/resolve` → **409**

```json
{
  "command_id": "d8c94802-a38f-45fb-8f7c-0284adf4cb22",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/chargebacks/a45765f0-12e5-4f66-99f7-0d33f3d81395/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c1ebb8fb-b08f-436c-b123-2117dacf1ee3"
}
```

`GET /api/admin/v1/orders/38a37a1e-17ae-44b4-8f5e-42ff5f44820a/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "a45765f0-12e5-4f66-99f7-0d33f3d81395",
      "order_id": "38a37a1e-17ae-44b4-8f5e-42ff5f44820a",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T15:27:02.540821Z",
      "resolved_at": "2026-10-30T15:27:03.459027Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 38a37a1e-17ae-44b4-8f5e-42ff5f44820a without phone or card digits; chargeback a45765f0-12e5-4f66-99f7-0d33f3d81395 recorded and won.

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
  "session_id": "3f55be1d-e31c-46e9-b848-fbfcfb8b9661",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5MjYsImlhdCI6MTc5MzM3NDAyNiwianRpIjoiZWY1MWE2OGMtY2U5MS00Y2M0LWFiMzUtZWFmNmYzMjYxYmIxIiwic2lkIjoiM2Y1NWJlMWQtZTMxYy00NmU5LWI4NDgtZmJmY2ZiOGI5NjYxIn0.8cDIfd87E_ZiZnlPWDAOHnlMIEhzCQxipU8Q4Hx8RIE",
  "access_expires_at": "2026-10-30T15:42:06.584037362Z",
  "refresh_token": "9GgGSyb8KzEknOUgEeEne-tWWSV1tsFOG9Ce7uiiG18",
  "refresh_expires_at": "2026-10-31T03:27:06.583476181Z",
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
  "phone": "+48600656861",
  "device_ref": "sandbox-16277"
}
```

```json
{
  "challenge_id": "bcd83ca5-cfe4-4fa7-bfb4-fb885ec388b6",
  "expires_at": "2026-10-30T15:32:07.443701016Z",
  "resend_available_at": "2026-10-30T15:27:08.443701016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600656861` → **200**

```json
{
  "phone": "+48600656861",
  "audience": "CLIENT",
  "code": "791618",
  "sent_at": "2026-10-30T15:27:07.446475698Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bcd83ca5-cfe4-4fa7-bfb4-fb885ec388b6",
  "code": "791618",
  "device_ref": "sandbox-16277"
}
```

```json
{
  "session_id": "a892f55f-5ae8-4f90-b1df-483b887754b9",
  "subject": {
    "type": "CLIENT",
    "id": "a1cf4481-6429-46ee-a516-6d7a748bddfd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWNmNDQ4MS02NDI5LTQ2ZWUtYTUxNi02ZDdhNzQ4YmRkZmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTI3LCJpYXQiOjE3OTMzNzQwMjcsImp0aSI6ImU0YTViOTU2LWNmZjktNDAzNS1iOTU4LWM3MDI2YTg0ODNkYiIsInNpZCI6ImE4OTJmNTVmLTVhZTgtNGY5MC1iMWRmLTQ4M2I4ODc3NTRiOSJ9.APJj7yJYmwp1yNik9wE3e1yJm3mZ_6553dgExwRSe7g",
  "access_expires_at": "2026-10-30T15:42:07.752167092Z",
  "refresh_token": "jZ5FmwVDjwqCkisKWG-JHJve0Quj5FLlz_gcXZRc97o",
  "refresh_expires_at": "2026-11-29T15:27:07.751666944Z",
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
  "command_id": "4b7f5aab-0f81-458d-b3b8-cc0e4302da2e",
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
  "correlation_id": "bbadda2d-14ee-4139-8a37-642c3df0fbde",
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
  "command_id": "f1b36cd1-d5ee-4239-9892-37d0015cfef1",
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
  "paused_at": "2026-10-30T15:27:08.884375679Z",
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
  "command_id": "ae54972e-ca78-4111-923c-dcc4bec40bad",
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
  "id": "daa152f4-63d2-400e-813f-93b3513c78d2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:09.475085Z",
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
  "command_id": "6bdd2eb2-e0c3-4a78-96a4-89d12b3ba3ad",
  "quote_id": "daa152f4-63d2-400e-813f-93b3513c78d2",
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
  "correlation_id": "a542ca56-ddff-4e8e-94a1-276879635616"
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
  "paused_at": "2026-10-30T15:27:08.884376Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "952ec3cc-b428-4b3b-9bf5-faf5f9114761",
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
  "command_id": "893207df-8bd0-4191-ac8a-740980a98b02",
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
  "command_id": "0d42c031-71ef-4b90-97f3-f5433d519e6f",
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
  "id": "f370b922-3b66-4e9e-9e13-91a18c1f0781",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:11.199626Z",
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
  "command_id": "8bf37b38-439c-4f6d-9bb6-cc2e43f151aa",
  "quote_id": "f370b922-3b66-4e9e-9e13-91a18c1f0781",
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
  "correlation_id": "7462eed2-dbf8-43d4-89c4-f436bc8dcd34"
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
  "command_id": "519b3898-1663-457d-8bc7-b136e205e2f3",
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
      "from": "18:00",
      "to": "19:00"
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "29a43b13-b72a-4474-be02-46b9bdbe841e",
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
  "id": "ce2a4540-9f7e-4233-85ab-03941e2872f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:12.372465Z",
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
  "command_id": "9f7e145b-d67e-49ca-9956-d5d67a335956",
  "quote_id": "ce2a4540-9f7e-4233-85ab-03941e2872f0",
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
  "correlation_id": "376ea36b-cbd7-478c-a3f7-3160a0d65e7f"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "99dd76af-44c9-4745-bce6-1c94fa47c7b4",
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
  "correlation_id": "bf285c34-7c55-4b98-900d-074f0bf5d0cc",
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "ba95678a-401b-47d5-8307-75ca79e26206",
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
  "phone": "+380675372370",
  "device_ref": "sandbox-2808"
}
```

```json
{
  "challenge_id": "a46032aa-7100-44f3-8d95-f291149105b9",
  "expires_at": "2026-10-30T15:32:13.827372136Z",
  "resend_available_at": "2026-10-30T15:27:14.827372136Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675372370` → **200**

```json
{
  "phone": "+380675372370",
  "audience": "CLIENT",
  "code": "496371",
  "sent_at": "2026-10-30T15:27:13.83071885Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a46032aa-7100-44f3-8d95-f291149105b9",
  "code": "496371",
  "device_ref": "sandbox-2808"
}
```

```json
{
  "session_id": "022b1529-9fcd-4181-9fbf-1b77db773102",
  "subject": {
    "type": "CLIENT",
    "id": "6e189552-2d22-40af-8ce9-588af198f7be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTE4OTU1Mi0yZDIyLTQwYWYtOGNlOS01ODhhZjE5OGY3YmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTM0LCJpYXQiOjE3OTMzNzQwMzQsImp0aSI6ImY1NDM0Njc0LTkyNWYtNDQ3OS05ODk1LTU0ZTMxM2FlYWQxZSIsInNpZCI6IjAyMmIxNTI5LTlmY2QtNDE4MS05ZmJmLTFiNzdkYjc3MzEwMiJ9.eJAw7YMtuh8UtcnYVCHMBx5RdgqwFNU-TrMpdxQYv_w",
  "access_expires_at": "2026-10-30T15:42:14.137464401Z",
  "refresh_token": "PL_o1y-0H1vRwhwcKg6frr9eyx7Zep6OI4XtNO_FLg0",
  "refresh_expires_at": "2026-11-29T15:27:14.136829532Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6e189552-2d22-40af-8ce9-588af198f7be",
  "session_id": "022b1529-9fcd-4181-9fbf-1b77db773102",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "56e3b6bc-9f90-47cf-97c0-6b14da763c57",
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
  "id": "0652ef18-1bdc-41a8-aa25-fd9391b21b96",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:14.693868Z",
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
  "challenge_id": "af6df6d8-9a87-4626-a64d-10cbb6f495d0",
  "expires_at": "2026-10-30T15:32:16.984215957Z",
  "resend_available_at": "2026-10-30T15:27:17.984215957Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675372370` → **200**

```json
{
  "phone": "+380675372370",
  "audience": "CLIENT",
  "code": "927881",
  "sent_at": "2026-10-30T15:27:16.987505957Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "58354fd0-3956-4714-b4f9-da479e793448",
  "challenge_id": "af6df6d8-9a87-4626-a64d-10cbb6f495d0",
  "otp_code": "927881"
}
```

```json
{
  "client_id": "6e189552-2d22-40af-8ce9-588af198f7be",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T15:27:17.309896746Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "a327b83e-58e0-405c-8558-3991847f1d37",
  "quote_id": "0652ef18-1bdc-41a8-aa25-fd9391b21b96",
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
  "correlation_id": "87f6ac50-b9ee-469a-a991-b375dace497b"
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
  "session_id": "9478c9fa-4a6a-4e89-999e-58736c7de6ed",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5MzgsImlhdCI6MTc5MzM3NDAzOCwianRpIjoiMGRmNzk1MjEtNDRkZi00NmNkLTk1YjMtYWJhOGQ4ZTdhMWQ1Iiwic2lkIjoiOTQ3OGM5ZmEtNGE2YS00ZTg5LTk5OWUtNTg3MzZjN2RlNmVkIn0.HSpfKY9AM2D72t184R1Q1_sv2jd7zKDdUDLycmksg7Y",
  "access_expires_at": "2026-10-30T15:42:18.204646218Z",
  "refresh_token": "7dMOJ4HoVGBA0Xqp9CYtiJB-Hh7cIf4uGHXrsv45bQ4",
  "refresh_expires_at": "2026-10-31T03:27:18.203934155Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "6e189552-2d22-40af-8ce9-588af198f7be",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T15:27:17.309897Z",
      "blockers": {
        "active_order_id": null,
        "debt": [],
        "open_support_cases": 0,
        "bonuses_to_burn": [],
        "blocked": false
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`POST /api/admin/v1/client-deletions/6e189552-2d22-40af-8ce9-588af198f7be/complete` → **200**

```json
{
  "command_id": "8f15c45d-0481-4dca-b95c-f07de8e01f32",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "6e189552-2d22-40af-8ce9-588af198f7be",
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
  "correlation_id": "a8a254ca-7843-42b0-bcd1-85d2f10a6e30"
}
```

Done: client 6e189552-2d22-40af-8ce9-588af198f7be anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664735272",
  "device_ref": "sandbox-16907"
}
```

```json
{
  "challenge_id": "1f89175f-d354-4aa9-9cba-1820313ac91e",
  "expires_at": "2026-10-30T15:32:19.368069129Z",
  "resend_available_at": "2026-10-30T15:27:20.368069129Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664735272` → **200**

```json
{
  "phone": "+380664735272",
  "audience": "CLIENT",
  "code": "734662",
  "sent_at": "2026-10-30T15:27:19.370857191Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1f89175f-d354-4aa9-9cba-1820313ac91e",
  "code": "734662",
  "device_ref": "sandbox-16907"
}
```

```json
{
  "session_id": "3c27ddf2-8efb-4a9b-aba2-c945fdb9d17a",
  "subject": {
    "type": "CLIENT",
    "id": "880a8d3d-6c93-4e6e-9483-a915aba3b400"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODBhOGQzZC02YzkzLTRlNmUtOTQ4My1hOTE1YWJhM2I0MDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTM5LCJpYXQiOjE3OTMzNzQwMzksImp0aSI6IjU2MDRmNGIxLTVhMDYtNDhjYi1iN2Y5LWJhNjhiNjlhNzViMyIsInNpZCI6IjNjMjdkZGYyLThlZmItNGE5Yi1hYmEyLWM5NDVmZGI5ZDE3YSJ9.7Sg5lNfSxkhagjx2u-CpTCSKszHBdrczBy5B5408o3s",
  "access_expires_at": "2026-10-30T15:42:19.663122463Z",
  "refresh_token": "7N41eByYCQLfxmBiWKEXai87-_Sf2meKwhtGNsAVtdk",
  "refresh_expires_at": "2026-11-29T15:27:19.662387745Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "880a8d3d-6c93-4e6e-9483-a915aba3b400",
  "session_id": "3c27ddf2-8efb-4a9b-aba2-c945fdb9d17a",
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
  "session_id": "ec7cbf4a-22ba-45f0-94c8-7cb5434d8f69",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5NDAsImlhdCI6MTc5MzM3NDA0MCwianRpIjoiNjY1MTI4OGQtNzcxZS00NzcwLWI2ZjAtNWQ3YmIyMDY3ZGM1Iiwic2lkIjoiZWM3Y2JmNGEtMjJiYS00NWYwLTk0YzgtN2NiNTQzNGQ4ZjY5In0.obic3piGqC0gswyH394X5NLxjImhp4NEBGs1uyBWvlg",
  "access_expires_at": "2026-10-30T15:42:20.519656315Z",
  "refresh_token": "IUaBaBOtQk3e4xGlkp-k0FmRtF_gnH9XxTaimOAb__8",
  "refresh_expires_at": "2026-10-31T03:27:20.519179514Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4735272&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "880a8d3d-6c93-4e6e-9483-a915aba3b400",
      "phone": "+380664735272",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T15:27:19.659955Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/880a8d3d-6c93-4e6e-9483-a915aba3b400` → **200**

```json
{
  "client": {
    "id": "880a8d3d-6c93-4e6e-9483-a915aba3b400",
    "phone": "+380664735272",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:27:19.659955Z",
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

`POST /api/admin/v1/clients/880a8d3d-6c93-4e6e-9483-a915aba3b400/block` → **400**

```json
{
  "command_id": "95883269-c0a8-4803-a13e-710ffdb074ec",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/880a8d3d-6c93-4e6e-9483-a915aba3b400/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "660afc44-5ca5-4fde-882c-5ac4771ec50c",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/880a8d3d-6c93-4e6e-9483-a915aba3b400/block` → **200**

```json
{
  "command_id": "c6240e62-4428-430e-994b-9abd759eea2f",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "880a8d3d-6c93-4e6e-9483-a915aba3b400",
  "phone": "+380664735272",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T15:27:19.659955Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T15:27:21.700468Z",
    "by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
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
  "correlation_id": "b821c45e-0d79-4464-a44c-659beca4f0de"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664735272",
  "device_ref": "sandbox-25564"
}
```

```json
{
  "challenge_id": "91a76484-845c-45df-b249-3c512e751fa3",
  "expires_at": "2026-10-30T15:32:24.27246641Z",
  "resend_available_at": "2026-10-30T15:27:25.27246641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664735272` → **200**

```json
{
  "phone": "+380664735272",
  "audience": "CLIENT",
  "code": "881057",
  "sent_at": "2026-10-30T15:27:24.274746718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "91a76484-845c-45df-b249-3c512e751fa3",
  "code": "881057",
  "device_ref": "sandbox-25564"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "13a30855-2086-4a49-93d6-ea559f645fd0"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/880a8d3d-6c93-4e6e-9483-a915aba3b400` → **200**

```json
{
  "client": {
    "id": "880a8d3d-6c93-4e6e-9483-a915aba3b400",
    "phone": "+380664735272",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T15:27:19.659955Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T15:27:21.700468Z",
      "by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
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

`POST /api/admin/v1/clients/880a8d3d-6c93-4e6e-9483-a915aba3b400/unblock` → **200**

```json
{
  "command_id": "f5e5caa5-1127-4ec5-9a63-59e277514676",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "880a8d3d-6c93-4e6e-9483-a915aba3b400",
  "phone": "+380664735272",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T15:27:19.659955Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664735272",
  "device_ref": "sandbox-26299"
}
```

```json
{
  "challenge_id": "9590e6e5-0249-46b2-b2fb-5c2545741f64",
  "expires_at": "2026-10-30T15:32:27.469579759Z",
  "resend_available_at": "2026-10-30T15:27:28.469579759Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664735272` → **200**

```json
{
  "phone": "+380664735272",
  "audience": "CLIENT",
  "code": "144334",
  "sent_at": "2026-10-30T15:27:27.472133598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9590e6e5-0249-46b2-b2fb-5c2545741f64",
  "code": "144334",
  "device_ref": "sandbox-26299"
}
```

```json
{
  "session_id": "3734e15d-888c-4fb2-ae77-ecabcc9985b3",
  "subject": {
    "type": "CLIENT",
    "id": "880a8d3d-6c93-4e6e-9483-a915aba3b400"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODBhOGQzZC02YzkzLTRlNmUtOTQ4My1hOTE1YWJhM2I0MDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTQ3LCJpYXQiOjE3OTMzNzQwNDcsImp0aSI6IjMyODI2YWE3LTMwN2MtNDkzYi1iOTg3LWVkOWMzMTI1NzdlOSIsInNpZCI6IjM3MzRlMTVkLTg4OGMtNGZiMi1hZTc3LWVjYWJjYzk5ODViMyJ9.4vc8tNwLgzBBNGxJoxz4N6QYJQkKsJhGb8KZrxVnZt4",
  "access_expires_at": "2026-10-30T15:42:27.771953382Z",
  "refresh_token": "S2xOVSvWcZYjPyKHC9OerlAgH3newbs6xAbYNqgFBFE",
  "refresh_expires_at": "2026-11-29T15:27:27.77138392Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "880a8d3d-6c93-4e6e-9483-a915aba3b400",
  "session_id": "3734e15d-888c-4fb2-ae77-ecabcc9985b3",
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
  "phone": "+380669268586",
  "device_ref": "sandbox-9637"
}
```

```json
{
  "challenge_id": "f630296f-e498-4120-8658-5c15119ada29",
  "expires_at": "2026-10-30T15:32:28.335880747Z",
  "resend_available_at": "2026-10-30T15:27:29.335880747Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669268586` → **200**

```json
{
  "phone": "+380669268586",
  "audience": "CLIENT",
  "code": "746674",
  "sent_at": "2026-10-30T15:27:28.338444231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f630296f-e498-4120-8658-5c15119ada29",
  "code": "746674",
  "device_ref": "sandbox-9637"
}
```

```json
{
  "session_id": "3b9084e7-0500-4e4f-b959-ed8dca8eb8d6",
  "subject": {
    "type": "CLIENT",
    "id": "acbf5a67-692b-414e-be8f-3a43ae757a88"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhY2JmNWE2Ny02OTJiLTQxNGUtYmU4Zi0zYTQzYWU3NTdhODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTQ4LCJpYXQiOjE3OTMzNzQwNDgsImp0aSI6IjU0MDZmMGY3LWJmYTEtNDRjMC04MTc1LTY4ZDg3NWEwYmMzNyIsInNpZCI6IjNiOTA4NGU3LTA1MDAtNGU0Zi1iOTU5LWVkOGRjYThlYjhkNiJ9.wrXaTBZuLi-C2zHQ1Ce8A7GIlDIrRH-jWLCwV7EB5wc",
  "access_expires_at": "2026-10-30T15:42:28.64053823Z",
  "refresh_token": "svYoMF8rVf3O9tBoND-Mnk-PfzQGD-sp-WJues4bv58",
  "refresh_expires_at": "2026-11-29T15:27:28.640024136Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1ff6de11-d40a-4610-8f6a-a43cb93aff4d",
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
  "id": "aee2fdb2-715c-415e-a26d-4b9ebd385ba4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:28.924930Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 0f82056d-c65b-4d16-88c6-11e22966ade5) → **201**

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
  "session_id": "9c229089-f076-4215-9483-8c591e79d9bc",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5NDksImlhdCI6MTc5MzM3NDA0OSwianRpIjoiOWVmNDQxODQtYzQwMi00YWViLWFiNWItMTU5MjI5M2VhZjdmIiwic2lkIjoiOWMyMjkwODktZjA3Ni00MjE1LTk0ODMtOGM1OTFlNzlkOWJjIn0.-MJ7ejLx2PsK-mpQ6nhN7-nHBzpmbWobhtvmxvD_oIM",
  "access_expires_at": "2026-10-30T15:42:29.56871449Z",
  "refresh_token": "xiqJhabibfZ4wWkaWoYZ37dCYWm2TQ4TpAlRVlS55xo",
  "refresh_expires_at": "2026-10-31T03:27:29.568081069Z",
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
  "session_id": "c9b1bf1f-ea45-4b26-b61b-7ae994172d26",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5NTAsImlhdCI6MTc5MzM3NDA1MCwianRpIjoiYWUwZTViNGMtOWUzNC00NjUxLTkxNGUtN2U5NDNhM2JiMjZmIiwic2lkIjoiYzliMWJmMWYtZWE0NS00YjI2LWI2MWItN2FlOTk0MTcyZDI2In0._7r8C5n12oN6tpekIckWi04uHMrBJX9KECwaFLlxW7k",
  "access_expires_at": "2026-10-30T15:42:30.168995201Z",
  "refresh_token": "2zpDlRgDD23LJPUpst25zxM-oqN7yINgw5yl1g6yh3c",
  "refresh_expires_at": "2026-10-31T03:27:30.168475561Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/05e75400-b09f-4e04-9472-e67afdb40f54/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:27:29.215495Z",
      "actor": {
        "type": "CLIENT",
        "id": "acbf5a67-692b-414e-be8f-3a43ae757a88",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "05e75400-b09f-4e04-9472-e67afdb40f54",
        "quote_id": "aee2fdb2-715c-415e-a26d-4b9ebd385ba4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0f82056d-c65b-4d16-88c6-11e22966ade5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:27:29.217Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "05e75400-b09f-4e04-9472-e67afdb40f54",
        "attempt_id": "5580fd93-7994-4dd3-b6d4-ae5962076ccd",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0f82056d-c65b-4d16-88c6-11e22966ade5"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T15:27:29.226147Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "05e75400-b09f-4e04-9472-e67afdb40f54",
        "attempt_id": "5580fd93-7994-4dd3-b6d4-ae5962076ccd"
      },
      "correlation_id": "0f82056d-c65b-4d16-88c6-11e22966ade5"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "5580fd93-7994-4dd3-b6d4-ae5962076ccd",
        "generation": 1,
        "started_at": "2026-10-30T15:27:29.216197Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T15:27:29.226147Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T15:27:29.217574Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/0f82056d-c65b-4d16-88c6-11e22966ade5` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "05e75400-b09f-4e04-9472-e67afdb40f54:0",
      "order_id": "05e75400-b09f-4e04-9472-e67afdb40f54",
      "at": "2026-10-30T15:27:29.215495Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "05e75400-b09f-4e04-9472-e67afdb40f54:1",
      "order_id": "05e75400-b09f-4e04-9472-e67afdb40f54",
      "at": "2026-10-30T15:27:29.217Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "05e75400-b09f-4e04-9472-e67afdb40f54:2",
      "order_id": "05e75400-b09f-4e04-9472-e67afdb40f54",
      "at": "2026-10-30T15:27:29.226147Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/18e2c839-850d-497b-b0ff-4e630c6ea436` → **200**

```json
{
  "found": []
}
```

Done: request 0f82056d-c65b-4d16-88c6-11e22966ade5 — order 05e75400-b09f-4e04-9472-e67afdb40f54 found by its id.

`GET /api/rider/v1/orders/05e75400-b09f-4e04-9472-e67afdb40f54` → **200**

```json
{
  "id": "05e75400-b09f-4e04-9472-e67afdb40f54",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "acbf5a67-692b-414e-be8f-3a43ae757a88",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:27:29.214922Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/05e75400-b09f-4e04-9472-e67afdb40f54/cancel` → **200**

```json
{
  "command_id": "968e2241-3257-48ee-a734-bead5bb4dae0",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "05e75400-b09f-4e04-9472-e67afdb40f54",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "acbf5a67-692b-414e-be8f-3a43ae757a88",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:27:29.214922Z",
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
  "phone": "+380638541879",
  "device_ref": "sandbox-21991"
}
```

```json
{
  "challenge_id": "3bcb14fc-a30a-4b3c-a6bb-a8f5a44eb0e7",
  "expires_at": "2026-10-30T15:32:31.907770984Z",
  "resend_available_at": "2026-10-30T15:27:32.907770984Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638541879` → **200**

```json
{
  "phone": "+380638541879",
  "audience": "CLIENT",
  "code": "703911",
  "sent_at": "2026-10-30T15:27:31.910271174Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bcb14fc-a30a-4b3c-a6bb-a8f5a44eb0e7",
  "code": "703911",
  "device_ref": "sandbox-21991"
}
```

```json
{
  "session_id": "c53e813c-f60c-4490-bb86-98c4673a315d",
  "subject": {
    "type": "CLIENT",
    "id": "d70be9f7-ca81-481a-b67d-2ea3f111f3d1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzBiZTlmNy1jYTgxLTQ4MWEtYjY3ZC0yZWEzZjExMWYzZDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTUyLCJpYXQiOjE3OTMzNzQwNTIsImp0aSI6IjcxYjY5ZDA2LTY4ZWUtNGU4Ni1hOGVhLTI1NDQzZDVkYzJlZiIsInNpZCI6ImM1M2U4MTNjLWY2MGMtNDQ5MC1iYjg2LTk4YzQ2NzNhMzE1ZCJ9.-V9uxSVU56mmrBPfLCYGWKqaPh1TcP_Wtse45HD0vvY",
  "access_expires_at": "2026-10-30T15:42:32.213654618Z",
  "refresh_token": "dxsYDCLaZygzKuJBIv3_3hRBlvmVOnRBS6-JdqZbIeg",
  "refresh_expires_at": "2026-11-29T15:27:32.212841156Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "73aec8ec-0d10-4270-bcba-f89451b56063",
  "expires_at": "2026-10-30T15:32:34.491150964Z",
  "resend_available_at": "2026-10-30T15:27:35.491150964Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638541879` → **200**

```json
{
  "phone": "+380638541879",
  "audience": "CLIENT",
  "code": "013752",
  "sent_at": "2026-10-30T15:27:34.493614152Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "b8705500-99d5-481e-92c7-5f46b6dc1d53",
  "challenge_id": "73aec8ec-0d10-4270-bcba-f89451b56063",
  "otp_code": "013752"
}
```

```json
{
  "id": "ef3a2c9a-4916-4f70-9933-9ca8b59953fb",
  "state": "PENDING",
  "created_at": "2026-10-30T15:27:34.805978Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/ef3a2c9a-4916-4f70-9933-9ca8b59953fb` → **200**

```json
{
  "id": "ef3a2c9a-4916-4f70-9933-9ca8b59953fb",
  "state": "READY",
  "created_at": "2026-10-30T15:27:34.805978Z",
  "ready_at": "2026-10-30T15:27:35.046376Z",
  "expires_at": "2026-11-06T15:27:35.046376Z",
  "size_bytes": 1028
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/ef3a2c9a-4916-4f70-9933-9ca8b59953fb/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636479791",
  "device_ref": "sandbox-30368"
}
```

```json
{
  "challenge_id": "b799cc36-b182-4451-8238-f32161e8c1e6",
  "expires_at": "2026-10-30T15:32:35.392908176Z",
  "resend_available_at": "2026-10-30T15:27:36.392908176Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636479791` → **200**

```json
{
  "phone": "+380636479791",
  "audience": "CLIENT",
  "code": "020815",
  "sent_at": "2026-10-30T15:27:35.396391072Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b799cc36-b182-4451-8238-f32161e8c1e6",
  "code": "020815",
  "device_ref": "sandbox-30368"
}
```

```json
{
  "session_id": "f0639254-3155-4450-847d-726f668bf7e5",
  "subject": {
    "type": "CLIENT",
    "id": "4a388cb6-a536-4928-bf2a-b1d39e46a958"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YTM4OGNiNi1hNTM2LTQ5MjgtYmYyYS1iMWQzOWU0NmE5NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTU1LCJpYXQiOjE3OTMzNzQwNTUsImp0aSI6IjdjMWM0ZGIyLTgwZWItNGVlNi1iNGU0LWMwMzMxNzQ5ZjAxZiIsInNpZCI6ImYwNjM5MjU0LTMxNTUtNDQ1MC04NDdkLTcyNmY2NjhiZjdlNSJ9.COmyZUz7vD35U1ZsdU1opMfp4U2QkF5qIUstSdW7CV4",
  "access_expires_at": "2026-10-30T15:42:35.70574465Z",
  "refresh_token": "igor8dTHmuAJ3HNBHQ9ynxG3U3W6SXhC0VRJqaqymc0",
  "refresh_expires_at": "2026-11-29T15:27:35.7052863Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/ef3a2c9a-4916-4f70-9933-9ca8b59953fb/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/ef3a2c9a-4916-4f70-9933-9ca8b59953fb/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5ee5ff8b-1af1-4f1a-98e0-feb00605ae64"
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
  "session_id": "5d93245d-5f14-4fca-8730-3e3132b9c1ff",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5NTYsImlhdCI6MTc5MzM3NDA1NiwianRpIjoiZWIzMDg0NjUtNzBlOC00Mjc3LWFhYmMtZmMxMDI5NGZlNTg5Iiwic2lkIjoiNWQ5MzI0NWQtNWYxNC00ZmNhLTg3MzAtM2UzMTMyYjljMWZmIn0.eFTjp-ZKwTaxSFZiwk-8m2477rcSzM8UODwREwDLOAg",
  "access_expires_at": "2026-10-30T15:42:36.586814367Z",
  "refresh_token": "2Xu3at7J_P7db5TMUVerlcEpdgd1G7sSfEGtbBG2QF0",
  "refresh_expires_at": "2026-10-31T03:27:36.58624025Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d70be9f7-ca81-481a-b67d-2ea3f111f3d1",
  "session_id": "c53e813c-f60c-4490-bb86-98c4673a315d",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/d70be9f7-ca81-481a-b67d-2ea3f111f3d1/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "ef3a2c9a-4916-4f70-9933-9ca8b59953fb",
      "state": "READY",
      "created_at": "2026-10-30T15:27:34.805978Z",
      "ready_at": "2026-10-30T15:27:35.046376Z",
      "expires_at": "2026-11-06T15:27:35.046376Z",
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
  "device_ref": "sandbox-1934"
}
```

```json
{
  "challenge_id": "3a6da992-eecd-4f1a-a70d-07cf62b3a649",
  "expires_at": "2026-10-30T15:32:37.436736668Z",
  "resend_available_at": "2026-10-30T15:27:38.436736668Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "681235",
  "sent_at": "2026-10-30T15:27:37.439371708Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a6da992-eecd-4f1a-a70d-07cf62b3a649",
  "code": "681235",
  "device_ref": "sandbox-1934"
}
```

```json
{
  "session_id": "dd5e5ac5-9df0-44df-a2fb-0b0329fa5c18",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDk1NywiaWF0IjoxNzkzMzc0MDU3LCJqdGkiOiIzNjliM2UyNS0wY2JmLTRhYjEtYjA2Yi02YWRmMWI4N2MwZGYiLCJzaWQiOiJkZDVlNWFjNS05ZGYwLTQ0ZGYtYTJmYi0wYjAzMjlmYTVjMTgifQ.F4u4DIfCqE2Hnddw5vFJHFR1o0NVCzh9nSeC2vAf7Rc",
  "access_expires_at": "2026-10-30T15:42:37.746967969Z",
  "refresh_token": "E5nQYvFA7fKalyzzhwQWiyO4jMHsh0czHDcHezqrNrg",
  "refresh_expires_at": "2026-11-29T15:27:37.746011856Z",
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
  "device_ref": "sandbox-26553"
}
```

```json
{
  "challenge_id": "0696c4a7-28d3-41b8-846a-d98962645280",
  "expires_at": "2026-10-30T15:32:38.293277464Z",
  "resend_available_at": "2026-10-30T15:27:39.293277464Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "790377",
  "sent_at": "2026-10-30T15:27:38.296646595Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0696c4a7-28d3-41b8-846a-d98962645280",
  "code": "790377",
  "device_ref": "sandbox-26553"
}
```

```json
{
  "session_id": "16deddb5-7d92-4f0f-bee8-b279c6eb105c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDk1OCwiaWF0IjoxNzkzMzc0MDU4LCJqdGkiOiIxNjNlYmU2NC0wZWZjLTQwNWUtODUzZi00MzAwNjdmNmMzNjIiLCJzaWQiOiIxNmRlZGRiNS03ZDkyLTRmMGYtYmVlOC1iMjc5YzZlYjEwNWMifQ.aoOcCdzXCff9VF5C9FuuM4G8z1IedHgBDgByMw6k8Is",
  "access_expires_at": "2026-10-30T15:42:38.595178039Z",
  "refresh_token": "Uz-nFfXnAJj1zBvnzhttmr9jnZn9khQvBe0zgdu2Aeg",
  "refresh_expires_at": "2026-11-29T15:27:38.594446893Z",
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
  "command_id": "2e4fb11a-b622-415c-8cb9-d3de04e0cb59",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:27:39Z",
    "sequence": 1793374059161
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2970085d-225c-45a8-bed4-e7e19e9513f6",
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
  "last_heartbeat_at": "2026-10-30T15:27:39.178741Z",
  "last_location_at": "2026-10-30T15:27:39.178741Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-25075"
}
```

```json
{
  "challenge_id": "7f4de24c-f113-4664-98a5-ca28fc40f7d7",
  "expires_at": "2026-10-30T15:32:39.451245486Z",
  "resend_available_at": "2026-10-30T15:27:40.451245486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "143057",
  "sent_at": "2026-10-30T15:27:39.453976995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f4de24c-f113-4664-98a5-ca28fc40f7d7",
  "code": "143057",
  "device_ref": "sandbox-25075"
}
```

```json
{
  "session_id": "56a492b6-23c3-41f8-ac20-8be2e1d4ba58",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDk1OSwiaWF0IjoxNzkzMzc0MDU5LCJqdGkiOiI4ODgyNzJlYS0wYjk1LTRmMzktODc1Zi0xZmU2MzFkZmM3ZWQiLCJzaWQiOiI1NmE0OTJiNi0yM2MzLTQxZjgtYWMyMC04YmUyZTFkNGJhNTgifQ.EmlEdKv2diVSW6Rr_sC7IMxUImsLlHkETRJ3uisu6X8",
  "access_expires_at": "2026-10-30T15:42:39.757889673Z",
  "refresh_token": "iGCw4cpnsJDHSJusyPWTG-fS7fSk5I4XwHqX-MWMfbU",
  "refresh_expires_at": "2026-11-29T15:27:39.757329868Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eadfff03-c5b8-45f4-95fd-f0665636b02b",
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
  "last_heartbeat_at": "2026-10-30T15:23:50.566284Z",
  "last_location_at": "2026-10-30T15:23:50.566284Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/eadfff03-c5b8-45f4-95fd-f0665636b02b/handover` → **200**

```json
{
  "command_id": "3df544aa-b005-4bec-a561-220df07fb613",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eadfff03-c5b8-45f4-95fd-f0665636b02b",
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
  "last_heartbeat_at": "2026-10-30T15:23:50.566284Z",
  "last_location_at": "2026-10-30T15:23:50.566284Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/eadfff03-c5b8-45f4-95fd-f0665636b02b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:27:40Z",
    "sequence": 1793374060606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "eadfff03-c5b8-45f4-95fd-f0665636b02b",
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
  "last_heartbeat_at": "2026-10-30T15:27:40.623963Z",
  "last_location_at": "2026-10-30T15:27:40.623963Z",
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
  "session_id": "7ec1662b-85dc-4aea-aebb-a51e4722b755",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5NjEsImlhdCI6MTc5MzM3NDA2MSwianRpIjoiNjdmM2VkODgtNmExZC00ZjQ1LWEyOTUtYTE5NWVhMzM0MmRmIiwic2lkIjoiN2VjMTY2MmItODVkYy00YWVhLWFlYmItYTUxZTQ3MjJiNzU1In0.qt79coHV_mZpTTHMBquXNLEoxVT5Y6k0gDakWXwNkQY",
  "access_expires_at": "2026-10-30T15:42:41.216668053Z",
  "refresh_token": "kvkH7KAe5zpXej8bq-en81NQTGkQsieCuQyhxWMHJYs",
  "refresh_expires_at": "2026-10-31T03:27:41.216202123Z",
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
  "session_id": "dcd696e3-20b2-4cdd-9035-b08364a2a250",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5NjEsImlhdCI6MTc5MzM3NDA2MSwianRpIjoiNmVlMzk0OTktMmIwNy00MDBkLThjOWMtYWRlODI0MmY2ZWEyIiwic2lkIjoiZGNkNjk2ZTMtMjBiMi00Y2RkLTkwMzUtYjA4MzY0YTJhMjUwIn0.xK9uCl0gvJHSMVKnzYlwncDyJcLmHPNVKUJ9qu1HQN8",
  "access_expires_at": "2026-10-30T15:42:41.814696904Z",
  "refresh_token": "zjFuocSywjB2QMliBVlxp7BvAyRTBbX_oSSKeIktkOQ",
  "refresh_expires_at": "2026-10-31T03:27:41.813998296Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689117747",
  "device_ref": "sandbox-9639"
}
```

```json
{
  "challenge_id": "f1626742-23f5-4a5b-8a3d-3ddc701720b6",
  "expires_at": "2026-10-30T15:32:42.120058815Z",
  "resend_available_at": "2026-10-30T15:27:43.120058815Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380689117747` → **200**

```json
{
  "phone": "+380689117747",
  "audience": "CLIENT",
  "code": "175776",
  "sent_at": "2026-10-30T15:27:42.12319831Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1626742-23f5-4a5b-8a3d-3ddc701720b6",
  "code": "175776",
  "device_ref": "sandbox-9639"
}
```

```json
{
  "session_id": "9bccfcae-8f8f-4b3b-85ee-044cbbefec2e",
  "subject": {
    "type": "CLIENT",
    "id": "0017b343-e6b4-4051-8ac7-fac7ddfed364"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMDE3YjM0My1lNmI0LTQwNTEtOGFjNy1mYWM3ZGRmZWQzNjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTYyLCJpYXQiOjE3OTMzNzQwNjIsImp0aSI6ImM1Mzc3NjI2LTg3NWQtNDgyMS1iZjU3LTdlNjYwNDJkMzJjMSIsInNpZCI6IjliY2NmY2FlLThmOGYtNGIzYi04NWVlLTA0NGNiYmVmZWMyZSJ9.DKfA15EO9u-9yCrxXCWeGC-6iwDZIaQVoKdgywu3Bug",
  "access_expires_at": "2026-10-30T15:42:42.42010799Z",
  "refresh_token": "VYQ92NPJRhlMSHMLiCerI-bA-Yij6DIK9tEl23p75Uk",
  "refresh_expires_at": "2026-11-29T15:27:42.419416679Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a7388b14-4810-4e78-b06f-fa3c18cad355",
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
  "id": "6d7db537-ea54-4dc7-9720-0b76d521cfdd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:42.706804Z",
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
  "command_id": "35a5163a-c79f-4d43-b702-c1c460a78d91",
  "quote_id": "6d7db537-ea54-4dc7-9720-0b76d521cfdd",
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
  "id": "668619b9-c460-4149-beda-c7139ec4ef19",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0017b343-e6b4-4051-8ac7-fac7ddfed364",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:27:43.001218Z",
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
    "id": "ae5f93fb-90cd-4def-8b00-0fabeef57b09",
    "order_id": "668619b9-c460-4149-beda-c7139ec4ef19",
    "expires_at": "2026-10-30T15:27:58.004706Z",
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

`POST /api/driver/v1/offers/ae5f93fb-90cd-4def-8b00-0fabeef57b09/reject` → **204**

```json
{
  "command_id": "ba71fa10-a1b3-4262-81a6-3c72beb27679"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "3d949935-c80e-4aba-b52c-55279d159901",
    "order_id": "668619b9-c460-4149-beda-c7139ec4ef19",
    "expires_at": "2026-10-30T15:27:58.588962Z",
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

`POST /api/driver/v1/offers/3d949935-c80e-4aba-b52c-55279d159901/accept` → **200**

```json
{
  "command_id": "97120d33-9736-486f-b8cc-4633037d087a"
}
```

```json
{
  "id": "c2e9f2ad-801e-4e2f-a2c8-641dabc2fba2",
  "order_id": "668619b9-c460-4149-beda-c7139ec4ef19",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e8125a30-d7d0-475d-bdf1-cf7f50d7814a",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/668619b9-c460-4149-beda-c7139ec4ef19/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:27:43.00187Z",
      "actor": {
        "type": "CLIENT",
        "id": "0017b343-e6b4-4051-8ac7-fac7ddfed364",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "668619b9-c460-4149-beda-c7139ec4ef19",
        "quote_id": "6d7db537-ea54-4dc7-9720-0b76d521cfdd",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8962e2fb-68ca-4e3c-9fcd-c67d54ca6070"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:27:43.003827Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "668619b9-c460-4149-beda-c7139ec4ef19",
        "attempt_id": "1d71fa3c-0e5d-4156-8fad-620bce5d3ed4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8962e2fb-68ca-4e3c-9fcd-c67d54ca6070"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:27:43.011653Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ae5f93fb-90cd-4def-8b00-0fabeef57b09",
        "order_id": "668619b9-c460-4149-beda-c7139ec4ef19",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "8962e2fb-68ca-4e3c-9fcd-c67d54ca6070"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T15:27:43.588059Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ae5f93fb-90cd-4def-8b00-0fabeef57b09",
        "order_id": "668619b9-c460-4149-beda-c7139ec4ef19"
      },
      "correlation_id": "4f622a96-876f-4a34-a546-7772156de2c8"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 668619b9-c460-4149-beda-c7139ec4ef19 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/668619b9-c460-4149-beda-c7139ec4ef19` → **200**

```json
{
  "id": "668619b9-c460-4149-beda-c7139ec4ef19",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0017b343-e6b4-4051-8ac7-fac7ddfed364",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c2e9f2ad-801e-4e2f-a2c8-641dabc2fba2",
    "order_id": "668619b9-c460-4149-beda-c7139ec4ef19",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e8125a30-d7d0-475d-bdf1-cf7f50d7814a",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T15:27:43.001218Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/668619b9-c460-4149-beda-c7139ec4ef19/cancel` → **200**

```json
{
  "command_id": "5081d4f8-335f-4659-aee2-a6ee67a0a8b9",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "668619b9-c460-4149-beda-c7139ec4ef19",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0017b343-e6b4-4051-8ac7-fac7ddfed364",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "c2e9f2ad-801e-4e2f-a2c8-641dabc2fba2",
    "order_id": "668619b9-c460-4149-beda-c7139ec4ef19",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e8125a30-d7d0-475d-bdf1-cf7f50d7814a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:27:43.001218Z",
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
  "session_id": "2970085d-225c-45a8-bed4-e7e19e9513f6",
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
  "last_heartbeat_at": "2026-10-30T15:27:39.178741Z",
  "last_location_at": "2026-10-30T15:27:39.178741Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2970085d-225c-45a8-bed4-e7e19e9513f6/close` → **200**

```json
{
  "command_id": "38e2d6c9-b1af-4715-bd1a-0552a0aee0a7",
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
  "session_id": "eadfff03-c5b8-45f4-95fd-f0665636b02b",
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
  "last_heartbeat_at": "2026-10-30T15:27:40.623963Z",
  "last_location_at": "2026-10-30T15:27:40.623963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eadfff03-c5b8-45f4-95fd-f0665636b02b/close` → **200**

```json
{
  "command_id": "fc433f44-26b9-43cf-9f11-f0398da30d52",
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
  "device_ref": "sandbox-3946"
}
```

```json
{
  "challenge_id": "f346d4b2-1cc9-4369-af75-e936404c9ef2",
  "expires_at": "2026-10-30T15:32:46.251569985Z",
  "resend_available_at": "2026-10-30T15:27:47.251569985Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "365828",
  "sent_at": "2026-10-30T15:27:46.254401548Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f346d4b2-1cc9-4369-af75-e936404c9ef2",
  "code": "365828",
  "device_ref": "sandbox-3946"
}
```

```json
{
  "session_id": "42870f9e-e547-40a2-baf1-c5839b18d59d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDk2NiwiaWF0IjoxNzkzMzc0MDY2LCJqdGkiOiI3NzE3NDVkYS1kMmM0LTRlYTItYTZjOC1mNjMxNjAyMjIxMTYiLCJzaWQiOiI0Mjg3MGY5ZS1lNTQ3LTQwYTItYmFmMS1jNTgzOWIxOGQ1OWQifQ.CV9P11NDpWja_oSLk70_IX3s5OESGE_Aron3H7tllKc",
  "access_expires_at": "2026-10-30T15:42:46.559813891Z",
  "refresh_token": "iF21NG-MoGIekvFqiEh6exjlikp7xogiQP3aV3tEc1o",
  "refresh_expires_at": "2026-11-29T15:27:46.559267332Z",
  "account_created": false
}
```

`POST /api/driver/v1/documents/upload-sessions` → **201**

```json
{
  "command_id": "3a57d39e-9e65-43a4-b44f-002261bf1297",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "a80276e0-e7bf-48df-b11a-29ae019829b5",
  "upload_path": "/api/driver/v1/uploads/a80276e0-e7bf-48df-b11a-29ae019829b5",
  "expires_at": "2026-10-30T15:42:46.853354271Z",
  "max_bytes": 86
}
```

`PUT /api/driver/v1/uploads/a80276e0-e7bf-48df-b11a-29ae019829b5` → **200**

```json
{
  "file_id": "a80276e0-e7bf-48df-b11a-29ae019829b5",
  "state": "SAFE",
  "content_type": "application/pdf",
  "size_bytes": 86,
  "reject_reason": null
}
```

## On the server's disk the file is not the PDF

Stored at `driver_document/2026-10/a80276e0-e7bf-48df-b11a-29ae019829b5`, first bytes `425a4631f953ec92` (plain: `255044462d312e37` = %PDF-1.7).

## His download is exactly what he uploaded

`GET /api/driver/v1/files/a80276e0-e7bf-48df-b11a-29ae019829b5` → **200**

SHA-256 uploaded `f4cdd7a3b39ea7afd98994c75436da498b6e2cdc476377890c9038f56d37ca05`, downloaded `f4cdd7a3b39ea7afd98994c75436da498b6e2cdc476377890c9038f56d37ca05`.

Done: document a80276e0-e7bf-48df-b11a-29ae019829b5 is encrypted on disk and downloads unchanged.

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
  "session_id": "a148bd20-67a6-45be-97f4-70237ff6a9bf",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzQ5NjcsImlhdCI6MTc5MzM3NDA2NywianRpIjoiMjRjNjhjNWMtNzBiNi00NGQwLTgwNGUtMTdlMjlkMTExOGJjIiwic2lkIjoiYTE0OGJkMjAtNjdhNi00NWJlLTk3ZjQtNzAyMzdmZjZhOWJmIn0.UwFQkvdLuXg5s2S5EBj9WmuStaWaK8drc7Ey8t9RqpY",
  "access_expires_at": "2026-10-30T15:42:47.570797903Z",
  "refresh_token": "Q_UfhCCso3AY1GtBluIMjcLUXoSfPPFCaJDe0ZpgCmw",
  "refresh_expires_at": "2026-10-31T03:27:47.570266619Z",
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
  "command_id": "5a362463-423c-4cd0-b277-2a4137a3edb1",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T15:27:48.138161Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "9f296e4a-d75b-4232-9e8f-801fed784850",
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
  "correlation_id": "d52b91f3-a583-4a7f-bc11-d814700867a0",
  "current_version": 1
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "dc532439-a368-4622-8d9b-de9e79961f57",
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
  "correlation_id": "f90cd96a-08ae-4995-974d-9427e87183e0"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632874628",
  "device_ref": "sandbox-867"
}
```

```json
{
  "challenge_id": "84c05fc1-0928-438c-89c3-55a7ae6071f3",
  "expires_at": "2026-10-30T15:32:48.976320954Z",
  "resend_available_at": "2026-10-30T15:27:49.976320954Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632874628` → **200**

```json
{
  "phone": "+380632874628",
  "audience": "CLIENT",
  "code": "843725",
  "sent_at": "2026-10-30T15:27:48.979253214Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "84c05fc1-0928-438c-89c3-55a7ae6071f3",
  "code": "843725",
  "device_ref": "sandbox-867"
}
```

```json
{
  "session_id": "5b510bc2-c1cc-48b3-9692-fdb07ff9f3c5",
  "subject": {
    "type": "CLIENT",
    "id": "c52f3ea5-2300-4a42-9c3d-38cbc5b12770"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTJmM2VhNS0yMzAwLTRhNDItOWMzZC0zOGNiYzViMTI3NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTY5LCJpYXQiOjE3OTMzNzQwNjksImp0aSI6IjRlZTM3ZTY4LTE2ZWEtNDlmYS05MTI2LTUyZDIwYTA3NGNjOCIsInNpZCI6IjViNTEwYmMyLWMxY2MtNDhiMy05NjkyLWZkYjA3ZmY5ZjNjNSJ9.tL9Sus8xOjgwtDiHJ1Bv80FjYmeRRjNzcUWKqvJm4Cw",
  "access_expires_at": "2026-10-30T15:42:49.284191518Z",
  "refresh_token": "pJWUG4MRPqFXshAPSDutXxk3dMOIitgnk-IB4s31CVs",
  "refresh_expires_at": "2026-11-29T15:27:49.283467972Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5063ab6e-d002-445a-a30c-91dad7c31a7f",
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
  "id": "0d904c1f-4c12-47aa-9b14-033ac60e77c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:49.582549Z",
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
  "command_id": "78c61413-cb59-403a-9885-d7a66b42200b",
  "quote_id": "0d904c1f-4c12-47aa-9b14-033ac60e77c4",
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
  "correlation_id": "767aed57-7f91-4b71-b695-8e1e99bdab46"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9d26fdc0-07d6-4d93-afa3-cd4ab940218a",
  "quote_id": "0d904c1f-4c12-47aa-9b14-033ac60e77c4",
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
  "id": "4c6c5a0b-bae7-483a-a7f9-cbbc8e809e28",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c52f3ea5-2300-4a42-9c3d-38cbc5b12770",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:27:50.168566Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4c6c5a0b-bae7-483a-a7f9-cbbc8e809e28/cancel` → **200**

```json
{
  "command_id": "d4383589-e926-411c-ad0f-f87821c7d08d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4c6c5a0b-bae7-483a-a7f9-cbbc8e809e28",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c52f3ea5-2300-4a42-9c3d-38cbc5b12770",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:27:50.168566Z",
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
  "command_id": "efd9a271-8880-412d-968c-d1edbf0b2e3d",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T15:27:50.77393Z"
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
      "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T15:27:50.77393Z"
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
  "device_ref": "sandbox-12916"
}
```

```json
{
  "challenge_id": "95137154-97b2-4f65-9226-d167f6408d74",
  "expires_at": "2026-10-30T15:32:51.627499779Z",
  "resend_available_at": "2026-10-30T15:27:52.627499779Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "743307",
  "sent_at": "2026-10-30T15:27:51.629876565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95137154-97b2-4f65-9226-d167f6408d74",
  "code": "743307",
  "device_ref": "sandbox-12916"
}
```

```json
{
  "session_id": "a5f89349-d23b-491e-8e28-ebc5c0a8c4d8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NDk3MSwiaWF0IjoxNzkzMzc0MDcxLCJqdGkiOiI1OWZjNmVjOC1mOWM1LTQ0YTAtOGZiYy02ZGJjNThhMDZjMWYiLCJzaWQiOiJhNWY4OTM0OS1kMjNiLTQ5MWUtOGUyOC1lYmM1YzBhOGM0ZDgifQ.paN3T6uwoH5xQXESWgEi0WBMY06ULuCqtYhAZaroA_0",
  "access_expires_at": "2026-10-30T15:42:51.928330893Z",
  "refresh_token": "N44bcI5AxFvvjhzYucPxqtsG85h1w5dPwgV7dNiT7j4",
  "refresh_expires_at": "2026-11-29T15:27:51.927830933Z",
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
  "command_id": "bac05552-55da-4cc9-898a-96bddef1704b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:27:52Z",
    "sequence": 1793374072503
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:27:52.520905Z",
  "last_location_at": "2026-10-30T15:27:52.520905Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676826333",
  "device_ref": "sandbox-23502"
}
```

```json
{
  "challenge_id": "7f4d042e-13da-46f9-ae8f-33c281a2bf05",
  "expires_at": "2026-10-30T15:32:52.813041099Z",
  "resend_available_at": "2026-10-30T15:27:53.813041099Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676826333` → **200**

```json
{
  "phone": "+380676826333",
  "audience": "CLIENT",
  "code": "384611",
  "sent_at": "2026-10-30T15:27:52.817316527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f4d042e-13da-46f9-ae8f-33c281a2bf05",
  "code": "384611",
  "device_ref": "sandbox-23502"
}
```

```json
{
  "session_id": "ff6f8864-8192-4a87-8bf5-127879d39cc4",
  "subject": {
    "type": "CLIENT",
    "id": "8e972d0e-837e-451e-968e-0eefbee05184"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTk3MmQwZS04MzdlLTQ1MWUtOTY4ZS0wZWVmYmVlMDUxODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc0OTczLCJpYXQiOjE3OTMzNzQwNzMsImp0aSI6ImYwNzY5MGNhLWEwOTEtNDU5My1iMmNjLTJiOGMyNjk0NmZjYiIsInNpZCI6ImZmNmY4ODY0LTgxOTItNGE4Ny04YmY1LTEyNzg3OWQzOWNjNCJ9.mFV7HCBUjUjLJsuWJYSM3BQOM6Zx6ramjuwOeI4gHHs",
  "access_expires_at": "2026-10-30T15:42:53.118820705Z",
  "refresh_token": "n8Slgb8FHl05CwDuSIyT7ItmJHDtlQDUBkn_7X0fTKk",
  "refresh_expires_at": "2026-11-29T15:27:53.118360892Z",
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
  "command_id": "4964ce29-5e5d-48cb-9468-007569f343c6",
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
  "id": "7c0fa60a-5dbd-4c45-ac85-cab80f8cc3e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:32:53.671593Z",
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
  "command_id": "74fc10b8-79b0-4e46-84f2-76393e6c8c60",
  "platform": "ANDROID",
  "token": "sandbox-driver-93c02bef-4aa9-449d-b579-4c7637fd1806"
}
```

```json
{
  "id": "c841c0d9-ca32-4345-b33e-b4d16a1ca72f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T15:27:53.960877Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "d0d87902-c143-42f2-9408-d0ee390182d8",
  "platform": "ANDROID",
  "token": "sandbox-rider-45879e24-d6ea-4bd1-86a7-8b7217f17f90"
}
```

```json
{
  "id": "a86d1103-bd26-4183-ab0a-5c064aa599e6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T15:27:54.238653Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "204db08d-a499-4678-87ba-08f115b422ab",
  "quote_id": "7c0fa60a-5dbd-4c45-ac85-cab80f8cc3e5",
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
  "id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8e972d0e-837e-451e-968e-0eefbee05184",
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
  "created_at": "2026-10-30T15:27:54.536403Z",
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
    "id": "ad028302-de10-4832-bcd8-fe1a93a41a26",
    "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
    "expires_at": "2026-10-30T15:28:09.539907Z",
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

`POST /api/driver/v1/offers/ad028302-de10-4832-bcd8-fe1a93a41a26/accept` → **200**

```json
{
  "command_id": "d882e103-bc26-431c-8693-191e42cfb343"
}
```

```json
{
  "id": "7a92df48-670a-44c9-8fe0-874cd3106e42",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "06e72abe-5bb9-4377-a4af-a6c2859aba1e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T15:27:54.512Z` → **200**

```json
[
  {
    "at": "2026-10-30T15:27:55.154207951Z",
    "token_suffix": "fd1806",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "03f6774b-78fa-4258-84c0-057be234be75",
      "order_version": "2",
      "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676826333&after=2026-10-30T15:27:54.512Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380676826333&after=2026-10-30T15:27:54.512Z` → **200**

```json
[
  {
    "at": "2026-10-30T15:27:56.16108671Z",
    "token_suffix": "f17f90",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "c344bf5c-2c68-4ff8-95fa-88e9b8211f3c",
      "order_version": "3",
      "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b5f08acb-8933-491b-805d-d4acca1516ac/messages` → **201**

```json
{
  "command_id": "17cb9890-c6c3-4d4c-8957-c97b46832d57",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "2c3dff81-bbe6-4dec-9d67-4fc5493ac8c4",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T15:27:56.502463038Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "06e72abe-5bb9-4377-a4af-a6c2859aba1e",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "assignment_id": "7a92df48-670a-44c9-8fe0-874cd3106e42",
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

`POST /api/driver/v1/trips/06e72abe-5bb9-4377-a4af-a6c2859aba1e/messages` → **201**

```json
{
  "command_id": "77178d6c-e935-4791-b7c1-4c75c15f157f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1f1f5a98-4f7a-4f17-ab39-02d6b8ecc745",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T15:27:57.069351821Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b5f08acb-8933-491b-805d-d4acca1516ac/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/06e72abe-5bb9-4377-a4af-a6c2859aba1e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676826333"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/f3f71022-aa9a-487e-bffd-eca061d5c9b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:27:57Z",
    "sequence": 1793374077901
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:27:57.919021Z",
  "last_location_at": "2026-10-30T15:27:57.919021Z",
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
  "id": "06e72abe-5bb9-4377-a4af-a6c2859aba1e",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "assignment_id": "7a92df48-670a-44c9-8fe0-874cd3106e42",
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

`POST /api/driver/v1/trips/06e72abe-5bb9-4377-a4af-a6c2859aba1e/arrive` → **200**

```json
{
  "command_id": "523a8b0a-e5d9-4f3a-8bf6-a2023d9a8fae",
  "expected_version": 0
}
```

```json
{
  "id": "06e72abe-5bb9-4377-a4af-a6c2859aba1e",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "assignment_id": "7a92df48-670a-44c9-8fe0-874cd3106e42",
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
  "arrived_at": "2026-10-30T15:27:58.474463Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/06e72abe-5bb9-4377-a4af-a6c2859aba1e/start` → **200**

```json
{
  "command_id": "a86074f7-4ece-40ca-a40a-505002de0b9d",
  "expected_version": 1
}
```

```json
{
  "id": "06e72abe-5bb9-4377-a4af-a6c2859aba1e",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "assignment_id": "7a92df48-670a-44c9-8fe0-874cd3106e42",
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
  "arrived_at": "2026-10-30T15:27:58.474463Z",
  "started_at": "2026-10-30T15:27:58.762188Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 47 s to the next point)

`POST /api/driver/v1/work-sessions/f3f71022-aa9a-487e-bffd-eca061d5c9b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:28:46Z",
    "sequence": 1793374126691
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:28:46.088212Z",
  "last_location_at": "2026-10-30T15:28:46.088212Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/06e72abe-5bb9-4377-a4af-a6c2859aba1e/complete` → **200**

```json
{
  "command_id": "4af967bc-9e95-4096-8192-e52cb4a6f9eb",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:28:46Z",
  "cash_received": true
}
```

```json
{
  "id": "06e72abe-5bb9-4377-a4af-a6c2859aba1e",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "assignment_id": "7a92df48-670a-44c9-8fe0-874cd3106e42",
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
  "arrived_at": "2026-10-30T15:27:58.474463Z",
  "started_at": "2026-10-30T15:27:58.762188Z",
  "completed_at": "2026-10-30T15:28:46.382289Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b5f08acb-8933-491b-805d-d4acca1516ac` → **200**

```json
{
  "id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "short_number": 14,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8e972d0e-837e-451e-968e-0eefbee05184",
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
    "id": "7a92df48-670a-44c9-8fe0-874cd3106e42",
    "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "06e72abe-5bb9-4377-a4af-a6c2859aba1e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:27:54.536403Z",
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
      "id": "b5f08acb-8933-491b-805d-d4acca1516ac",
      "short_number": 14,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:27:54.536403Z",
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
      "id": "06e72abe-5bb9-4377-a4af-a6c2859aba1e",
      "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
      "order_short_number": 14,
      "created_at": "2026-10-30T15:27:55.12696Z",
      "pickup_label": "Майдан Незалежності",
      "dropoff_label": "Залізничний вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "abb79233-2ad4-416d-987a-eba71819c909",
      "order_id": "6c49a48d-3104-492f-88c5-db0707f05d74",
      "order_short_number": 9,
      "created_at": "2026-10-30T15:25:11.975323Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "871927e2-e9b5-4859-8e66-1468f1b67710",
      "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
      "order_short_number": 4,
      "created_at": "2026-10-30T15:23:39.207851Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "b3898c0f-1abc-400a-8c82-76ce10a774da",
      "order_id": "e063ef8c-5c61-46f3-9f26-ca7e7f4d0e81",
      "order_short_number": 2,
      "created_at": "2026-10-30T15:19:50.605997Z",
      "pickup_label": "Майдан",
      "dropoff_label": "Вокзал",
      "final_price_minor": 10517,
      "currency": "UAH",
      "payment_method": "CASH",
      "phase": "COMPLETED"
    },
    {
      "id": "2e365582-8f40-4fa7-adf6-6eb694bf8799",
      "order_id": "5b4a8e82-3d29-441e-bac7-4fa6d0a893de",
      "order_short_number": 1,
      "created_at": "2026-10-30T15:19:40.483892Z",
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

`GET /api/rider/v1/orders/b5f08acb-8933-491b-805d-d4acca1516ac/tip` → **200**

```json
{
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
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
  "available_until": "2026-10-31T15:28:46.382289Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b5f08acb-8933-491b-805d-d4acca1516ac/tip` → **201**

```json
{
  "command_id": "ca6fc61c-7fe1-4196-84ef-c62fb0a203d3",
  "amount_minor": 1100
}
```

```json
{
  "id": "5e2fdc35-7bab-4b24-b715-ef1adedfa52a",
  "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T15:28:51.42276Z"
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
  "session_id": "57e9bf74-afd0-4394-a8c9-319fca96bdcd",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMzIsImlhdCI6MTc5MzM3NDEzMiwianRpIjoiZDI4YTEyYTAtYzcxZi00YmYxLTgwODctNDQ1MjRmZjFjYzBkIiwic2lkIjoiNTdlOWJmNzQtYWZkMC00Mzk0LWE4YzktMzE5ZmNhOTZiZGNkIn0.ZUHcH1nX1N33Ms5fSsMVc-wvAx90VNoSGCgFP1_axsg",
  "access_expires_at": "2026-10-30T15:43:52.02697295Z",
  "refresh_token": "RB92P9y_FZZdYvibPvSYRodFH15nARYrVlwEBS7Y5mQ",
  "refresh_expires_at": "2026-10-31T03:28:52.025626799Z",
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
  "generated_at": "2026-10-30T15:28:52.317428316Z"
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
  "generated_at": "2026-10-30T15:28:52.612167338Z"
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
  "session_id": "d12a6407-af73-4706-85e0-db86acead4aa",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMzMsImlhdCI6MTc5MzM3NDEzMywianRpIjoiMGUyNDE3ZTYtMTkwZi00MGE5LWI2YmItOGQwODFhMGNhNDc5Iiwic2lkIjoiZDEyYTY0MDctYWY3My00NzA2LTg1ZTAtZGI4NmFjZWFkNGFhIn0.D5htyQgZfSOQ0O5Yyr2aWKQnIgVIIl-wNEKheMQ0g6A",
  "access_expires_at": "2026-10-30T15:43:53.235423317Z",
  "refresh_token": "qecGBPtTN8gXTSNa35rPtqEezXK8npNNpJHoXVxI1s8",
  "refresh_expires_at": "2026-10-31T03:28:53.234818916Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b5f08acb-8933-491b-805d-d4acca1516ac/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:27:54.536995Z",
      "actor": {
        "type": "CLIENT",
        "id": "8e972d0e-837e-451e-968e-0eefbee05184",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
        "quote_id": "7c0fa60a-5dbd-4c45-ac85-cab80f8cc3e5",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1b01fd41-523e-4a91-8f2e-3a5078c453d0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:27:54.539164Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
        "attempt_id": "af2b4747-79cf-4961-b396-69d468ec9829",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1b01fd41-523e-4a91-8f2e-3a5078c453d0"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:27:54.545466Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ad028302-de10-4832-bcd8-fe1a93a41a26",
        "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "1b01fd41-523e-4a91-8f2e-3a5078c453d0"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:27:55.128549Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ad028302-de10-4832-bcd8-fe1a93a41a26",
        "order_id": "b5f08acb-8933-491b-805d-d4acca1516ac",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7a92df48-670a-44c9-8fe0-874cd3106e42"
      },
      "correlation_id": "3e181dbc-e96f-4a98-abff-d6b042e77389"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T15:28:53.814982201Z",
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
      "last_location_at": "2026-10-30T15:28:46.088212Z",
      "order_id": null
    }
  ]
}
```

Done: order b5f08acb-8933-491b-805d-d4acca1516ac.

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
  "session_id": "8b988f4f-9315-4cff-a62b-fabcce68397f",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMzQsImlhdCI6MTc5MzM3NDEzNCwianRpIjoiM2Y0N2UxMjEtODg5ZS00MTUxLThhNTYtODYzOGI2ZTUzZWMwIiwic2lkIjoiOGI5ODhmNGYtOTMxNS00Y2ZmLWE2MmItZmFiY2NlNjgzOTdmIn0.HrWNIdCurjGpBCCGR61mKVwKo9lZl9G2Bz4QyIfSbV4",
  "access_expires_at": "2026-10-30T15:43:54.42573774Z",
  "refresh_token": "i7G1qsjQH48AcVp9ob_5gjW0J0pZLzJPXkSOpTMXa8Q",
  "refresh_expires_at": "2026-10-31T03:28:54.425093901Z",
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
  "command_id": "620b280a-0c57-40ab-8365-89265138c46e",
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
  "timestamp": "2026-10-30T15:28:55.000+0000",
  "channel": {
    "id": "1730052000.3230430991",
    "linkedid": "1730052000.3230430991",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677182009"
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
  "timestamp": "2026-10-30T15:28:55.000+0000",
  "channel": {
    "id": "1730052000.3230430991",
    "linkedid": "1730052000.3230430991",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677182009"
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
  "session_id": "ae466494-6721-45b5-acc6-d4ebad4459e4",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUwMzUsImlhdCI6MTc5MzM3NDEzNSwianRpIjoiM2U2MDA1ZTYtMTZlZC00ZmViLWE5NWUtZGJiNDJkMTMyZDcxIiwic2lkIjoiYWU0NjY0OTQtNjcyMS00NWI1LWFjYzYtZDRlYmFkNDQ1OWU0In0.3ndA-K4eXbSJVuBIT2nBRdJxbS9gaLB2Holfd5rMoNQ",
  "access_expires_at": "2026-10-30T15:43:55.649764114Z",
  "refresh_token": "ZY-xPjWHKg3zl1DrYfcAQ21ruZcEyxAWkBKJRbXuCVk",
  "refresh_expires_at": "2026-10-31T03:28:55.649170163Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "05af3192-9f7a-4295-9531-2a2d23e8e6f1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677182009",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T15:28:55Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## The operator takes the call

`POST /api/operator/v1/calls/05af3192-9f7a-4295-9531-2a2d23e8e6f1/answer` → **200**

```json
{
  "command_id": "84ca44ca-7fa6-4eba-bdd6-68bd028e18b2"
}
```

```json
{
  "id": "05af3192-9f7a-4295-9531-2a2d23e8e6f1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677182009",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "order_ids": [],
  "started_at": "2026-10-30T15:28:55Z",
  "answered_at": "2026-10-30T15:28:56.230218Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.3230430991",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d7427226-730e-4547-b964-5f380d825d20",
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
  "id": "4e3a800a-e93b-477c-a089-2f090beea939",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:33:56.548228Z",
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
  "command_id": "6134724e-640b-4f03-add1-08a43c9d3b33",
  "quote_id": "4e3a800a-e93b-477c-a089-2f090beea939",
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
    "phone": "+380677182009"
  },
  "call_id": "05af3192-9f7a-4295-9531-2a2d23e8e6f1"
}
```

```json
{
  "id": "ad29bd93-330f-4753-b562-c07f3562f072",
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
  "created_at": "2026-10-30T15:28:56.845897Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677182009"
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
    "id": "1730052000.3230430991",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "05af3192-9f7a-4295-9531-2a2d23e8e6f1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677182009",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [
        "ad29bd93-330f-4753-b562-c07f3562f072"
      ],
      "started_at": "2026-10-30T15:28:55Z",
      "answered_at": "2026-10-30T15:28:56.230218Z",
      "ended_at": "2026-10-30T15:28:57.164673Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "9af6fa65-434e-4204-83f7-cbed9e1f1dd0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675843939",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [],
      "started_at": "2026-10-30T15:23:30.330381Z",
      "answered_at": "2026-10-30T15:23:30.649918Z",
      "ended_at": "2026-10-30T15:23:30.956054Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:23:35.002321Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/orders/ad29bd93-330f-4753-b562-c07f3562f072` → **200**

```json
{
  "id": "ad29bd93-330f-4753-b562-c07f3562f072",
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
  "created_at": "2026-10-30T15:28:56.845897Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677182009"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/ad29bd93-330f-4753-b562-c07f3562f072` → **200**

```json
{
  "id": "ad29bd93-330f-4753-b562-c07f3562f072",
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
  "created_at": "2026-10-30T15:28:56.845897Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677182009"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ad29bd93-330f-4753-b562-c07f3562f072/cancel` → **200**

```json
{
  "command_id": "e135a980-48fc-4c59-9e5c-2f43c1ff1c31",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ad29bd93-330f-4753-b562-c07f3562f072",
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
  "created_at": "2026-10-30T15:28:56.845897Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677182009"
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

Done: call 05af3192-9f7a-4295-9531-2a2d23e8e6f1 with order ad29bd93-330f-4753-b562-c07f3562f072.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2427"
}
```

```json
{
  "challenge_id": "c743ce30-c6e2-41c6-8e98-0b66feb57454",
  "expires_at": "2026-10-30T15:33:58.409691523Z",
  "resend_available_at": "2026-10-30T15:28:59.409691523Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "311763",
  "sent_at": "2026-10-30T15:28:58.413323408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c743ce30-c6e2-41c6-8e98-0b66feb57454",
  "code": "311763",
  "device_ref": "sandbox-2427"
}
```

```json
{
  "session_id": "3c8debd4-2519-4d7a-9f75-a422f21aa980",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTAzOCwiaWF0IjoxNzkzMzc0MTM4LCJqdGkiOiIyZmJiMjIyYS0zODA4LTQxYzUtOWQxNC1jNjI0ODE0NTkzZGUiLCJzaWQiOiIzYzhkZWJkNC0yNTE5LTRkN2EtOWY3NS1hNDIyZjIxYWE5ODAifQ.F9uTMcOkjsO7sDU4I4cQ8fFbRV111MYH2WWDWZYx2yY",
  "access_expires_at": "2026-10-30T15:43:58.718100897Z",
  "refresh_token": "krAxZrZbIHVIKZHOufCSVLHSfUnDLM13PlGViYk-vm4",
  "refresh_expires_at": "2026-11-29T15:28:58.71756839Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:28:46.088212Z",
  "last_location_at": "2026-10-30T15:28:46.088212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3f71022-aa9a-487e-bffd-eca061d5c9b4/handover` → **200**

```json
{
  "command_id": "357ababc-fa72-4ade-9674-7d1c84648330",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:28:46.088212Z",
  "last_location_at": "2026-10-30T15:28:46.088212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

(the car drives 86 s to the next point)

`POST /api/driver/v1/work-sessions/f3f71022-aa9a-487e-bffd-eca061d5c9b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:30:25Z",
    "sequence": 1793374225577
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:30:25.5953Z",
  "last_location_at": "2026-10-30T15:30:25.5953Z",
  "eligible": true,
  "ineligible_reasons": [],
  "accepted": true
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662141889",
  "device_ref": "sandbox-24858"
}
```

```json
{
  "challenge_id": "e67951fe-ad68-4601-93a1-570293df856b",
  "expires_at": "2026-10-30T15:35:25.872394024Z",
  "resend_available_at": "2026-10-30T15:30:26.872394024Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662141889` → **200**

```json
{
  "phone": "+380662141889",
  "audience": "CLIENT",
  "code": "495332",
  "sent_at": "2026-10-30T15:30:25.875670742Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e67951fe-ad68-4601-93a1-570293df856b",
  "code": "495332",
  "device_ref": "sandbox-24858"
}
```

```json
{
  "session_id": "2c7a5397-ba42-4034-96ba-e928408fa09a",
  "subject": {
    "type": "CLIENT",
    "id": "7c57c174-61ac-42e9-bd51-3f9c9c181b97"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YzU3YzE3NC02MWFjLTQyZTktYmQ1MS0zZjljOWMxODFiOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MTI2LCJpYXQiOjE3OTMzNzQyMjYsImp0aSI6ImJhMzE1ZmI0LTYyYjAtNDczYi05YTgzLWYzNzU5OGUzNDIyMSIsInNpZCI6IjJjN2E1Mzk3LWJhNDItNDAzNC05NmJhLWU5Mjg0MDhmYTA5YSJ9.xDVGxTLxQXxnpZSZrFHJNVEwfbShQgEJ66UR5AT082s",
  "access_expires_at": "2026-10-30T15:45:26.178770537Z",
  "refresh_token": "Lt2U_SzhsXlw95nokQ6tqCRNithDP-bkt1XDhMPYXYk",
  "refresh_expires_at": "2026-11-29T15:30:26.178195481Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b67371e1-b65a-4223-beba-537a23b2a430",
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
  "id": "212c965c-2865-4543-98e1-82c1b7b58c59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:35:26.461263Z",
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
  "command_id": "4a7cbcc7-8c16-4238-8c9c-49aec2c75957",
  "quote_id": "212c965c-2865-4543-98e1-82c1b7b58c59",
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
  "id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7c57c174-61ac-42e9-bd51-3f9c9c181b97",
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
  "created_at": "2026-10-30T15:30:26.759332Z",
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
    "id": "22fadf98-16ec-4860-b02e-c1a41bce6b6f",
    "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
    "expires_at": "2026-10-30T15:30:41.764017Z",
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

`POST /api/driver/v1/offers/22fadf98-16ec-4860-b02e-c1a41bce6b6f/accept` → **200**

```json
{
  "command_id": "8af51aee-c559-498e-b396-f72110bd7916"
}
```

```json
{
  "id": "d5ed8bd6-44ad-4f97-9606-8a0bfa0c6e4d",
  "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0ee58d13-399e-4bb7-93cb-8fc7a372994b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0ee58d13-399e-4bb7-93cb-8fc7a372994b",
  "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
  "assignment_id": "d5ed8bd6-44ad-4f97-9606-8a0bfa0c6e4d",
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

`POST /api/driver/v1/work-sessions/f3f71022-aa9a-487e-bffd-eca061d5c9b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:30:27Z",
    "sequence": 1793374227917
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:30:27.933065Z",
  "last_location_at": "2026-10-30T15:30:27.933065Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/0ee58d13-399e-4bb7-93cb-8fc7a372994b/arrive` → **200**

```json
{
  "command_id": "278abb40-6d06-4ea9-b8a1-f1415d182ad2",
  "expected_version": 0
}
```

```json
{
  "id": "0ee58d13-399e-4bb7-93cb-8fc7a372994b",
  "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
  "assignment_id": "d5ed8bd6-44ad-4f97-9606-8a0bfa0c6e4d",
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
  "arrived_at": "2026-10-30T15:30:28.222864Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0ee58d13-399e-4bb7-93cb-8fc7a372994b/start` → **200**

```json
{
  "command_id": "547166c6-9d49-4ede-a1cb-bc440b2005ac",
  "expected_version": 1
}
```

```json
{
  "id": "0ee58d13-399e-4bb7-93cb-8fc7a372994b",
  "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
  "assignment_id": "d5ed8bd6-44ad-4f97-9606-8a0bfa0c6e4d",
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
  "arrived_at": "2026-10-30T15:30:28.222864Z",
  "started_at": "2026-10-30T15:30:28.522024Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

(the car drives 59 s to the next point)

`POST /api/driver/v1/work-sessions/f3f71022-aa9a-487e-bffd-eca061d5c9b4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:31:27Z",
    "sequence": 1793374287826
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:31:27.847009Z",
  "last_location_at": "2026-10-30T15:31:27.847009Z",
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
  "device_ref": "sandbox-12556"
}
```

```json
{
  "challenge_id": "29be20c2-1870-4370-9aa1-6814c4f9c671",
  "expires_at": "2026-10-30T15:36:28.124412763Z",
  "resend_available_at": "2026-10-30T15:31:29.124412763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "503995",
  "sent_at": "2026-10-30T15:31:28.12704001Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "29be20c2-1870-4370-9aa1-6814c4f9c671",
  "code": "503995",
  "device_ref": "sandbox-12556"
}
```

```json
{
  "session_id": "51a0ffe1-3c0b-43a1-a9a9-bd0fd2b30e6b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTE4OCwiaWF0IjoxNzkzMzc0Mjg4LCJqdGkiOiJjM2M5NzhiZi0yMzZjLTQwYzktYjkyYy05YTAyYzk0NDc0NzYiLCJzaWQiOiI1MWEwZmZlMS0zYzBiLTQzYTEtYTlhOS1iZDBmZDJiMzBlNmIifQ.F-f6bQBoYNMIAajiRjA1JAO870OHNYNS8zmcv50cASY",
  "access_expires_at": "2026-10-30T15:46:28.430265888Z",
  "refresh_token": "K_nIfOs8QFwK3dC3XelamqxZ62m4I3b30e-MxU2mrhE",
  "refresh_expires_at": "2026-11-29T15:31:28.429322757Z",
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
  "command_id": "c3137a16-d6d0-4a7d-b6e8-393cbb0193f3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:31:29Z",
    "sequence": 1793374289538
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d49e98c8-855f-49e5-9d96-2a61c1f76593",
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
  "last_heartbeat_at": "2026-10-30T15:31:29.023114Z",
  "last_location_at": "2026-10-30T15:31:29.023114Z",
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
  "session_id": "658adcc1-4ed9-4a5e-8eb7-a22ed10e66f4",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxODksImlhdCI6MTc5MzM3NDI4OSwianRpIjoiYTUwMWEyNjYtZmM5OC00YzQxLWExM2YtNjUzY2Y4ODhmM2EyIiwic2lkIjoiNjU4YWRjYzEtNGVkOS00YTVlLThlYjctYTIyZWQxMGU2NmY0In0.8EDEGGsETgZzB5p1BoQKhVv6Z3qASKEPPaJwE-j0GKM",
  "access_expires_at": "2026-10-30T15:46:29.63003378Z",
  "refresh_token": "eVrvoeOdmrUPc7gfu1dmpJeCLAJW_zvuzDC8K7sgkBc",
  "refresh_expires_at": "2026-10-31T03:31:29.629479796Z",
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
  "session_id": "50d77bca-b877-4ec2-a78f-1849a1bb3ec2",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxOTAsImlhdCI6MTc5MzM3NDI5MCwianRpIjoiZGQ3YzEwOTktNDdiNS00ZjhiLTk2MTQtZTkxZDU2NTA0NjU0Iiwic2lkIjoiNTBkNzdiY2EtYjg3Ny00ZWMyLWE3OGYtMTg0OWExYmIzZWMyIn0.wlgStdf4Yg35qJM-BTpvgBnKQAfRpHoShy8ElRhbji4",
  "access_expires_at": "2026-10-30T15:46:30.230746487Z",
  "refresh_token": "eFtFSBsOtpwTDZLNdXrRGOqrEy9fi-nIGu2WfPKX52E",
  "refresh_expires_at": "2026-10-31T03:31:30.230277421Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/01a81c0d-1dba-4247-8201-ef8784eb99d8` → **200**

```json
{
  "id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
  "short_number": 16,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7c57c174-61ac-42e9-bd51-3f9c9c181b97",
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
    "id": "d5ed8bd6-44ad-4f97-9606-8a0bfa0c6e4d",
    "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "0ee58d13-399e-4bb7-93cb-8fc7a372994b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T15:30:26.759332Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/01a81c0d-1dba-4247-8201-ef8784eb99d8/interrupt` → **200**

```json
{
  "command_id": "ad78e6a0-dddb-4849-ab4b-70cb9cc6a25b",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
    "short_number": 16,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "7c57c174-61ac-42e9-bd51-3f9c9c181b97",
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
      "id": "d5ed8bd6-44ad-4f97-9606-8a0bfa0c6e4d",
      "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "0ee58d13-399e-4bb7-93cb-8fc7a372994b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T15:30:26.759332Z",
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
    "id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
    "short_number": 17,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "7c57c174-61ac-42e9-bd51-3f9c9c181b97",
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
    "id": "27f63812-70da-40a0-b2e2-00d73e47ab06",
    "order_id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
    "expires_at": "2026-10-30T15:31:45.835867Z",
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

`POST /api/driver/v1/offers/27f63812-70da-40a0-b2e2-00d73e47ab06/accept` → **200**

```json
{
  "command_id": "2588e0d3-d63a-4a66-8929-fefa115b0452"
}
```

```json
{
  "id": "5cda65df-fc1e-4dd5-9913-964b3e1ee5cd",
  "order_id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3c7ade8e-95a0-4f95-a955-c2b34d5256c1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3c7ade8e-95a0-4f95-a955-c2b34d5256c1",
  "order_id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
  "assignment_id": "5cda65df-fc1e-4dd5-9913-964b3e1ee5cd",
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
  "session_id": "d49e98c8-855f-49e5-9d96-2a61c1f76593",
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
  "last_heartbeat_at": "2026-10-30T15:31:29.023114Z",
  "last_location_at": "2026-10-30T15:31:29.023114Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/d49e98c8-855f-49e5-9d96-2a61c1f76593/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:31:32Z",
    "sequence": 1793374292301
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d49e98c8-855f-49e5-9d96-2a61c1f76593",
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
  "last_heartbeat_at": "2026-10-30T15:31:32.318314Z",
  "last_location_at": "2026-10-30T15:31:32.318314Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/3c7ade8e-95a0-4f95-a955-c2b34d5256c1/arrive` → **200**

```json
{
  "command_id": "6c367c52-a592-4758-a1ea-f32a62d2f46d",
  "expected_version": 0
}
```

```json
{
  "id": "3c7ade8e-95a0-4f95-a955-c2b34d5256c1",
  "order_id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
  "assignment_id": "5cda65df-fc1e-4dd5-9913-964b3e1ee5cd",
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
  "arrived_at": "2026-10-30T15:31:32.602231Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3c7ade8e-95a0-4f95-a955-c2b34d5256c1/start` → **200**

```json
{
  "command_id": "c5ab30ce-4a43-40ed-a993-c4e3c8327873",
  "expected_version": 1
}
```

```json
{
  "id": "3c7ade8e-95a0-4f95-a955-c2b34d5256c1",
  "order_id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
  "assignment_id": "5cda65df-fc1e-4dd5-9913-964b3e1ee5cd",
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
  "arrived_at": "2026-10-30T15:31:32.602231Z",
  "started_at": "2026-10-30T15:31:32.892813Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3c7ade8e-95a0-4f95-a955-c2b34d5256c1/complete` → **200**

```json
{
  "command_id": "9e7efcd5-3e0e-40f7-91ce-b1cbda26d02a",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:31:33Z"
}
```

```json
{
  "id": "3c7ade8e-95a0-4f95-a955-c2b34d5256c1",
  "order_id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
  "assignment_id": "5cda65df-fc1e-4dd5-9913-964b3e1ee5cd",
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
  "arrived_at": "2026-10-30T15:31:32.602231Z",
  "started_at": "2026-10-30T15:31:32.892813Z",
  "completed_at": "2026-10-30T15:31:33.190228Z",
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
      "id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
      "short_number": 17,
      "status": "FULFILLED",
      "created_at": "2026-10-30T15:31:30.826059Z",
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
      "id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
      "short_number": 16,
      "status": "CANCELLED",
      "created_at": "2026-10-30T15:30:26.759332Z",
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

`GET /api/operator/v1/orders/01a81c0d-1dba-4247-8201-ef8784eb99d8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T15:30:26.759979Z",
      "actor": {
        "type": "CLIENT",
        "id": "7c57c174-61ac-42e9-bd51-3f9c9c181b97",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
        "quote_id": "212c965c-2865-4543-98e1-82c1b7b58c59",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "f0949f18-fccb-4336-902c-a864ce20c01f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T15:30:26.762804Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
        "attempt_id": "4a756a33-94ae-4477-a4f7-10b5ae91272e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f0949f18-fccb-4336-902c-a864ce20c01f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T15:30:26.772496Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "22fadf98-16ec-4860-b02e-c1a41bce6b6f",
        "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "f0949f18-fccb-4336-902c-a864ce20c01f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T15:30:27.357072Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "22fadf98-16ec-4860-b02e-c1a41bce6b6f",
        "order_id": "01a81c0d-1dba-4247-8201-ef8784eb99d8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d5ed8bd6-44ad-4f97-9606-8a0bfa0c6e4d"
      },
      "correlation_id": "80829868-7fe0-422d-82ba-9935526aad24"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/58ca82a5-8662-4569-a78d-2fa8131ac353/tip` → **200**

```json
{
  "order_id": "58ca82a5-8662-4569-a78d-2fa8131ac353",
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
  "available_until": "2026-10-31T15:31:33.190228Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/58ca82a5-8662-4569-a78d-2fa8131ac353/tip` → **409**

```json
{
  "command_id": "c1755791-5dda-486a-897e-119b3b8de928",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/58ca82a5-8662-4569-a78d-2fa8131ac353/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e32553af-fde4-4c99-822c-fa8764d219a8"
}
```

Done: interrupted 01a81c0d-1dba-4247-8201-ef8784eb99d8, follow-up 58ca82a5-8662-4569-a78d-2fa8131ac353.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f3f71022-aa9a-487e-bffd-eca061d5c9b4",
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
  "last_heartbeat_at": "2026-10-30T15:31:27.847009Z",
  "last_location_at": "2026-10-30T15:31:27.847009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3f71022-aa9a-487e-bffd-eca061d5c9b4/close` → **200**

```json
{
  "command_id": "90c82032-8994-46ba-aef2-173d718549d4",
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
  "session_id": "d49e98c8-855f-49e5-9d96-2a61c1f76593",
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
  "last_heartbeat_at": "2026-10-30T15:31:32.318314Z",
  "last_location_at": "2026-10-30T15:31:32.318314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d49e98c8-855f-49e5-9d96-2a61c1f76593/close` → **200**

```json
{
  "command_id": "a4f20389-47d7-48f0-ab67-fbf84f02f051",
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
  "session_id": "2e38b055-527a-4eb8-824e-0814f2bfc528",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUxOTksImlhdCI6MTc5MzM3NDI5OSwianRpIjoiOTY2ZmRlMmUtMTEyNS00YTEzLTlmNWItNGQ4N2FjNDRkYjRhIiwic2lkIjoiMmUzOGIwNTUtNTI3YS00ZWI4LTgyNGUtMDgxNGYyYmZjNTI4In0.-UeMUsybV-F2_8cR64BTFhMiqXYklFmBGby4K5fnLtA",
  "access_expires_at": "2026-10-30T15:46:39.403070109Z",
  "refresh_token": "FD4q8gdqPItXuk7EyMnZi9piqtM1jMmlXrixhG-zdEM",
  "refresh_expires_at": "2026-10-31T03:31:39.402596634Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "5762d1e8-d883-4e9d-a3a3-53870f1e53db",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:31:39Z"
}
```

```json
{
  "id": "b87db0d2-f95e-4025-95a0-4ae54eda509f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:31:39Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b87db0d2-f95e-4025-95a0-4ae54eda509f/publish` → **200**

```json
{
  "command_id": "4bd1fe4e-8d82-4f09-a7e4-b6459794ca2e",
  "expected_version": 0
}
```

```json
{
  "id": "b87db0d2-f95e-4025-95a0-4ae54eda509f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:31:40.005714Z",
  "published_at": "2026-10-30T15:31:40.005714Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "b87db0d2-f95e-4025-95a0-4ae54eda509f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T15:31:40.005714Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633902354",
  "device_ref": "sandbox-27554"
}
```

```json
{
  "challenge_id": "4ab6838d-7a91-48dc-b295-c3dd787e6af2",
  "expires_at": "2026-10-30T15:36:40.567482313Z",
  "resend_available_at": "2026-10-30T15:31:41.567482313Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633902354` → **200**

```json
{
  "phone": "+380633902354",
  "audience": "CLIENT",
  "code": "438338",
  "sent_at": "2026-10-30T15:31:40.570200093Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ab6838d-7a91-48dc-b295-c3dd787e6af2",
  "code": "438338",
  "device_ref": "sandbox-27554"
}
```

```json
{
  "session_id": "7b174a25-11d7-4826-864e-5666e42396dd",
  "subject": {
    "type": "CLIENT",
    "id": "1ff82bae-f950-4a39-849f-217f5915db2c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZmY4MmJhZS1mOTUwLTRhMzktODQ5Zi0yMTdmNTkxNWRiMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MjAwLCJpYXQiOjE3OTMzNzQzMDAsImp0aSI6Ijg0ZWIwNzIxLTYwYjItNDNkYi1hNmVmLWUzYzcwODJmNGY3NyIsInNpZCI6IjdiMTc0YTI1LTExZDctNDgyNi04NjRlLTU2NjZlNDIzOTZkZCJ9.QbNr2vo-qO2w1UNs9xqY-HRYuTMutdV8ccKncOCL8sA",
  "access_expires_at": "2026-10-30T15:46:40.879573056Z",
  "refresh_token": "KFzG8chq2IgAGnewdzNilFgQ202EyZTRWsDtG3MjrRg",
  "refresh_expires_at": "2026-11-29T15:31:40.878743312Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "b87db0d2-f95e-4025-95a0-4ae54eda509f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T15:31:40.005714Z",
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
  "command_id": "b698f823-f9fa-4c73-b700-66d4b1c4c4a3",
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
  "id": "123d765a-166e-4e28-912a-58aacc2c5b15",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:36:41.454466Z",
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
  "command_id": "0632c31c-5955-49ec-8116-abbaca5dd9fd",
  "quote_id": "123d765a-166e-4e28-912a-58aacc2c5b15",
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
  "correlation_id": "e05ed3cb-2f12-4292-9b45-4d2fb9ae4cee"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "d17856a7-6c90-4d9c-86d3-9b4aea418ecc",
  "version_id": "b87db0d2-f95e-4025-95a0-4ae54eda509f",
  "language": "uk"
}
```

```json
{
  "version_id": "b87db0d2-f95e-4025-95a0-4ae54eda509f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T15:31:42.041993Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d569cfad-d7e7-46fd-9843-47f709477e6f",
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
  "id": "0f33fa0d-e1de-45ca-9fa6-3f5bd91deb22",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:36:42.327312Z",
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
  "command_id": "7a98537a-d1b2-4ea0-a07d-617239403006",
  "quote_id": "0f33fa0d-e1de-45ca-9fa6-3f5bd91deb22",
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
  "id": "d3e75edf-5b02-45f9-a7cd-1dadb4190bce",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ff82bae-f950-4a39-849f-217f5915db2c",
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
  "created_at": "2026-10-30T15:31:42.626211Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/d3e75edf-5b02-45f9-a7cd-1dadb4190bce` → **200**

```json
{
  "id": "d3e75edf-5b02-45f9-a7cd-1dadb4190bce",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1ff82bae-f950-4a39-849f-217f5915db2c",
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
  "created_at": "2026-10-30T15:31:42.626211Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d3e75edf-5b02-45f9-a7cd-1dadb4190bce/cancel` → **200**

```json
{
  "command_id": "24fadfbe-6a97-4ac5-897e-ad048ceab05e",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d3e75edf-5b02-45f9-a7cd-1dadb4190bce",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1ff82bae-f950-4a39-849f-217f5915db2c",
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
  "created_at": "2026-10-30T15:31:42.626211Z",
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

`POST /api/admin/v1/legal-documents/b87db0d2-f95e-4025-95a0-4ae54eda509f` → **409**

```json
{
  "command_id": "65eee76e-0645-4fda-b8fc-3b76dfd55600",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T15:31:43Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/b87db0d2-f95e-4025-95a0-4ae54eda509f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "45db7e96-0045-4277-b471-87b9519a8c8c"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2dbceba6-af41-496e-b4c2-ba79d644fde9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:31:43Z"
}
```

```json
{
  "id": "09640236-3083-479d-8877-c615d3a02cd9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:31:43Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/09640236-3083-479d-8877-c615d3a02cd9/publish` → **200**

```json
{
  "command_id": "5aa01f39-3984-4bc7-8d1a-5c9c66e06627",
  "expected_version": 0
}
```

```json
{
  "id": "09640236-3083-479d-8877-c615d3a02cd9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T15:31:44.111379Z",
  "published_at": "2026-10-30T15:31:44.111379Z",
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
  "device_ref": "sandbox-12092"
}
```

```json
{
  "challenge_id": "9a3e3081-0df6-44e0-a9e3-a67183b9b4bf",
  "expires_at": "2026-10-30T15:36:44.398911202Z",
  "resend_available_at": "2026-10-30T15:31:45.398911202Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "055023",
  "sent_at": "2026-10-30T15:31:44.401269775Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a3e3081-0df6-44e0-a9e3-a67183b9b4bf",
  "code": "055023",
  "device_ref": "sandbox-12092"
}
```

```json
{
  "session_id": "84a1f852-e889-45c3-97e0-e4b428095e27",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTIwNCwiaWF0IjoxNzkzMzc0MzA0LCJqdGkiOiJkZDBhMTI3NS05Mzk2LTQxYmYtOTUwNS1kNmQ5MDYyZDIwNWUiLCJzaWQiOiI4NGExZjg1Mi1lODg5LTQ1YzMtOTdlMC1lNGI0MjgwOTVlMjcifQ.f12wD5UazrF6JAx1AidG3bHk5kGKpok-l4cUpJQ-wWQ",
  "access_expires_at": "2026-10-30T15:46:44.715029996Z",
  "refresh_token": "tnm7F23v9ZMLZa5gDkDIphddYrJhIn9MJYNS2X7pDqM",
  "refresh_expires_at": "2026-11-29T15:31:44.71452131Z",
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
  "command_id": "61e4348e-61ff-43b9-80c9-a2184b0b68e8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:32:56Z",
    "sequence": 1793374376329
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8b206989-7e04-438d-be9d-8cad4c8648bd",
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
  "last_heartbeat_at": "2026-10-30T15:32:56.346274Z",
  "last_location_at": "2026-10-30T15:32:56.346274Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675050161",
  "device_ref": "sandbox-23015"
}
```

```json
{
  "challenge_id": "665c2f45-ad63-4ecf-81b8-afc67fd095e4",
  "expires_at": "2026-10-30T15:37:56.634453009Z",
  "resend_available_at": "2026-10-30T15:32:57.634453009Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675050161` → **200**

```json
{
  "phone": "+380675050161",
  "audience": "CLIENT",
  "code": "496049",
  "sent_at": "2026-10-30T15:32:56.636984337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "665c2f45-ad63-4ecf-81b8-afc67fd095e4",
  "code": "496049",
  "device_ref": "sandbox-23015"
}
```

```json
{
  "session_id": "6c341a8f-67b7-4287-8514-5062f34d6a4e",
  "subject": {
    "type": "CLIENT",
    "id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlY2NhOTdmMy1mZGUxLTRhYTMtYTJhYi05YTFlYTE1MDU0NDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1Mjc2LCJpYXQiOjE3OTMzNzQzNzYsImp0aSI6ImQ1NmExM2VmLWMzZTEtNDFlZi1hMDllLTFlOTc2NTE0M2U5YyIsInNpZCI6IjZjMzQxYThmLTY3YjctNDI4Ny04NTE0LTUwNjJmMzRkNmE0ZSJ9.tvHrIp1N5s2n875U8nVVi_BVExsds1i6YD0RaTinGgg",
  "access_expires_at": "2026-10-30T15:47:56.941503594Z",
  "refresh_token": "J7JGoc7EbJsuqVyCbrLCvnxc9Ya6ZPoca7kT_KnKDFs",
  "refresh_expires_at": "2026-11-29T15:32:56.940654549Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4089903-3e17-43d3-90f1-e94ace67acce",
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
  "id": "d1a9d206-e0cb-40b2-af71-2629b936f8aa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:37:57.216545Z",
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
  "command_id": "1731ed75-806b-4314-89c4-65fee524d908",
  "quote_id": "d1a9d206-e0cb-40b2-af71-2629b936f8aa",
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
    "phone": "+380674940245"
  }
}
```

```json
{
  "id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:32:57.516118Z",
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
    "id": "880b71f3-b9ff-4484-9e20-77ca14997d2d",
    "order_id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
    "expires_at": "2026-10-30T15:33:12.519466Z",
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

`POST /api/driver/v1/offers/880b71f3-b9ff-4484-9e20-77ca14997d2d/accept` → **200**

```json
{
  "command_id": "0f0a26f0-1ef5-413b-9db1-832bc0a694c0"
}
```

```json
{
  "id": "afd61d0c-6a0c-4c42-9d75-2644303a9df1",
  "order_id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e091405e-e501-4f15-a6f8-7bbdc0493621",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e091405e-e501-4f15-a6f8-7bbdc0493621",
  "order_id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
  "assignment_id": "afd61d0c-6a0c-4c42-9d75-2644303a9df1",
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
    "phone": "+380674940245"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e0786124-5f0c-4cb2-bc30-5bfb7d33f3ea",
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
  "id": "e9ecf3e5-ef86-4c9c-9174-eeb64d82615b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:37:58.648330Z",
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
  "command_id": "3560fc00-7581-4b6c-b054-398cdf77d19c",
  "quote_id": "e9ecf3e5-ef86-4c9c-9174-eeb64d82615b",
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
  "id": "281345dc-5da3-4c24-89fc-5b9416bef16f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:32:58.938396Z",
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
  "command_id": "b0212645-b0b1-4b5b-afdd-054782bac663",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T18:32:59Z"
}
```

```json
{
  "id": "df6ccfce-ea8b-4a6f-92ea-2446781c3696",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:37:59.244076Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T18:32:59Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d4f2f3ee-d0b7-45c8-acf2-45841ad8034f",
  "quote_id": "df6ccfce-ea8b-4a6f-92ea-2446781c3696",
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
  "pickup_at": "2026-10-30T18:32:59Z"
}
```

```json
{
  "id": "dcf9c937-5a1b-4764-bd3d-912b6e3e7e78",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:32:59.540859Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:32:59Z",
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
  "command_id": "d569d70a-639c-4570-a956-d38ce6880965",
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
  "id": "2b478309-da8b-4bae-ba5d-67c75f76a942",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:37:59.837442Z",
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
  "command_id": "b328f229-e45d-4556-98fa-8515b7f71b32",
  "quote_id": "2b478309-da8b-4bae-ba5d-67c75f76a942",
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
  "correlation_id": "bbdc5759-1525-46a8-82d8-cf7056130222"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "dcf9c937-5a1b-4764-bd3d-912b6e3e7e78",
      "short_number": 21,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T15:32:59.540859Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T18:32:59Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "281345dc-5da3-4c24-89fc-5b9416bef16f",
      "short_number": 20,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-30T15:32:58.938396Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
      "short_number": 19,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "281345dc-5da3-4c24-89fc-5b9416bef16f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:32:58.938396Z",
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

`GET /api/rider/v1/orders/2fb56bde-cf2f-4b37-a43e-1599a92202fe` → **200**

```json
{
  "id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
  "short_number": 19,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "afd61d0c-6a0c-4c42-9d75-2644303a9df1",
    "order_id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e091405e-e501-4f15-a6f8-7bbdc0493621",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T15:32:57.516118Z",
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
    "location_at": "2026-10-30T15:32:56.346274Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/2fb56bde-cf2f-4b37-a43e-1599a92202fe/cancel` → **200**

```json
{
  "command_id": "88857ec1-9a36-4871-9653-d4797df72951",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "afd61d0c-6a0c-4c42-9d75-2644303a9df1",
    "order_id": "2fb56bde-cf2f-4b37-a43e-1599a92202fe",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e091405e-e501-4f15-a6f8-7bbdc0493621",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T15:32:57.516118Z",
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

`GET /api/rider/v1/orders/281345dc-5da3-4c24-89fc-5b9416bef16f` → **200**

```json
{
  "id": "281345dc-5da3-4c24-89fc-5b9416bef16f",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:32:58.938396Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/281345dc-5da3-4c24-89fc-5b9416bef16f/cancel` → **200**

```json
{
  "command_id": "06d048d3-de17-4fd1-8151-37b60991a867",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "281345dc-5da3-4c24-89fc-5b9416bef16f",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:32:58.938396Z",
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

`GET /api/rider/v1/orders/dcf9c937-5a1b-4764-bd3d-912b6e3e7e78` → **200**

```json
{
  "id": "dcf9c937-5a1b-4764-bd3d-912b6e3e7e78",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:32:59.540859Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:32:59Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dcf9c937-5a1b-4764-bd3d-912b6e3e7e78/cancel` → **200**

```json
{
  "command_id": "eb704d5c-c4aa-4aa5-acb0-202f0ff67e24",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dcf9c937-5a1b-4764-bd3d-912b6e3e7e78",
  "short_number": 21,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ecca97f3-fde1-4aa3-a2ab-9a1ea1505440",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T15:32:59.540859Z",
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
  "pickup_at": "2026-10-30T18:32:59Z",
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
  "session_id": "8b206989-7e04-438d-be9d-8cad4c8648bd",
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
  "last_heartbeat_at": "2026-10-30T15:32:56.346274Z",
  "last_location_at": "2026-10-30T15:32:56.346274Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8b206989-7e04-438d-be9d-8cad4c8648bd/close` → **200**

```json
{
  "command_id": "4f9d000c-e1bd-447c-be69-b10dc70a6e91",
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

Done: orders 2fb56bde-cf2f-4b37-a43e-1599a92202fe, 281345dc-5da3-4c24-89fc-5b9416bef16f, dcf9c937-5a1b-4764-bd3d-912b6e3e7e78.

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
  "session_id": "bd526a77-4887-49af-b5c1-17ef40d8203e",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUyODMsImlhdCI6MTc5MzM3NDM4MywianRpIjoiZGQ2NGY4NDYtZDU0Yi00ZmI5LTk2OGYtZTcwZWVlMzJhMDdjIiwic2lkIjoiYmQ1MjZhNzctNDg4Ny00OWFmLWI1YzEtMTdlZjQwZDgyMDNlIn0.xsrw79qnaEcT23ASNrkXVykYwxJddOetYwCy0Ew0oDI",
  "access_expires_at": "2026-10-30T15:48:03.656144615Z",
  "refresh_token": "LqDMExv1lZCNHeQtNHgMU69pG7okTCdb2bT0z7dLJJI",
  "refresh_expires_at": "2026-10-31T03:33:03.65568738Z",
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
  "session_id": "bb92987f-ee1c-4893-b84b-fcd45a66c929",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUyODQsImlhdCI6MTc5MzM3NDM4NCwianRpIjoiZTRlY2RlMjktNjU2Ni00YzFhLTkxYTctYjg2MDQ2MWVkNDk0Iiwic2lkIjoiYmI5Mjk4N2YtZWUxYy00ODkzLWI4NGItZmNkNDVhNjZjOTI5In0.xoH3FKJb9fzaD_clHphWfgqUzyGheZsiH7TTSOUoj1M",
  "access_expires_at": "2026-10-30T15:48:04.251182716Z",
  "refresh_token": "rrTD0FdfRHdsAaxc6nS7Zuq8TL2QCTqu92vHnUVmfMA",
  "refresh_expires_at": "2026-10-31T03:33:04.250680434Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14114"
}
```

```json
{
  "challenge_id": "913d8a89-55b7-4560-81b0-ce2e56248968",
  "expires_at": "2026-10-30T15:38:04.519744245Z",
  "resend_available_at": "2026-10-30T15:33:05.519744245Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "270025",
  "sent_at": "2026-10-30T15:33:04.522288867Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "913d8a89-55b7-4560-81b0-ce2e56248968",
  "code": "270025",
  "device_ref": "sandbox-14114"
}
```

```json
{
  "session_id": "f659623a-d534-4549-b7bc-c1c56130a425",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTI4NCwiaWF0IjoxNzkzMzc0Mzg0LCJqdGkiOiJmNTM0OTczNi1mNzgwLTRlOTYtYWYxMy0wMjRmOGE1N2JjNWMiLCJzaWQiOiJmNjU5NjIzYS1kNTM0LTQ1NDktYjdiYy1jMWM1NjEzMGE0MjUifQ.aXUBgavhCsWi9dmSaO-4gasCGLvMEeqHL1eATYkCPVM",
  "access_expires_at": "2026-10-30T15:48:04.823584037Z",
  "refresh_token": "3_PqL8arf3jWiOsb_hh14TjnNO5vW30Vb1bR3H33_Eo",
  "refresh_expires_at": "2026-11-29T15:33:04.823031005Z",
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
  "command_id": "a7a70f72-4b73-44ab-972b-24435c3b1e90",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:33:05Z",
    "sequence": 1793374385384
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0be02065-e5b6-4541-9205-6322c0c9b010",
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
  "last_heartbeat_at": "2026-10-30T15:33:05.402181Z",
  "last_location_at": "2026-10-30T15:33:05.402181Z",
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
  "command_id": "9b31e54a-a2a4-4da1-8081-5b10d96b26a9",
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
  "effective_at": "2026-10-30T15:33:05.988506Z",
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T15:23:44.923489Z",
  "last_entries": [
    {
      "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T15:23:44.923489Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2f1638d1-0eb0-4e08-a4e3-a769ac033585",
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
  "id": "6fb84364-150e-448a-8292-c47f882c007e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:38:06.564445Z",
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
  "command_id": "55aca96f-2582-43bf-aa52-f41e4f26a721",
  "quote_id": "6fb84364-150e-448a-8292-c47f882c007e",
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
    "phone": "+3806711118687"
  }
}
```

```json
{
  "id": "7f0e760c-f367-46a7-bcdb-1b84438fd8cf",
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
  "created_at": "2026-10-30T15:33:06.852515Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711118687"
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
    "id": "f01d6846-9061-4a1f-ae28-d9d9e71c9f22",
    "order_id": "7f0e760c-f367-46a7-bcdb-1b84438fd8cf",
    "expires_at": "2026-10-30T15:33:21.85608Z",
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

`POST /api/driver/v1/offers/f01d6846-9061-4a1f-ae28-d9d9e71c9f22/accept` → **200**

```json
{
  "command_id": "0cbaf41e-935c-429f-9c81-c6d34d647881"
}
```

```json
{
  "id": "a4e57af0-f7f2-4912-9571-a924102a6214",
  "order_id": "7f0e760c-f367-46a7-bcdb-1b84438fd8cf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "29f934ab-cd9e-412d-8a92-c45e7098c34a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "29f934ab-cd9e-412d-8a92-c45e7098c34a",
  "order_id": "7f0e760c-f367-46a7-bcdb-1b84438fd8cf",
  "assignment_id": "a4e57af0-f7f2-4912-9571-a924102a6214",
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
    "phone": "+3806711118687"
  }
}
```

`POST /api/driver/v1/work-sessions/0be02065-e5b6-4541-9205-6322c0c9b010/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:33:07Z",
    "sequence": 1793374387999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0be02065-e5b6-4541-9205-6322c0c9b010",
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
  "last_heartbeat_at": "2026-10-30T15:33:08.016148Z",
  "last_location_at": "2026-10-30T15:33:08.016148Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/29f934ab-cd9e-412d-8a92-c45e7098c34a/arrive` → **200**

```json
{
  "command_id": "382468f4-ae21-4082-b90a-8d1711ce8d61",
  "expected_version": 0
}
```

```json
{
  "id": "29f934ab-cd9e-412d-8a92-c45e7098c34a",
  "order_id": "7f0e760c-f367-46a7-bcdb-1b84438fd8cf",
  "assignment_id": "a4e57af0-f7f2-4912-9571-a924102a6214",
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
  "arrived_at": "2026-10-30T15:33:08.306018Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118687"
  }
}
```

`POST /api/driver/v1/trips/29f934ab-cd9e-412d-8a92-c45e7098c34a/start` → **200**

```json
{
  "command_id": "dd9184c5-9eaa-4c2e-afba-bf8d679acd79",
  "expected_version": 1
}
```

```json
{
  "id": "29f934ab-cd9e-412d-8a92-c45e7098c34a",
  "order_id": "7f0e760c-f367-46a7-bcdb-1b84438fd8cf",
  "assignment_id": "a4e57af0-f7f2-4912-9571-a924102a6214",
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
  "arrived_at": "2026-10-30T15:33:08.306018Z",
  "started_at": "2026-10-30T15:33:08.591881Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711118687"
  }
}
```

`POST /api/driver/v1/trips/29f934ab-cd9e-412d-8a92-c45e7098c34a/complete` → **200**

```json
{
  "command_id": "6f801136-137b-47a8-8cc0-5cc6eff0e526",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:33:08Z",
  "cash_received": true
}
```

```json
{
  "id": "29f934ab-cd9e-412d-8a92-c45e7098c34a",
  "order_id": "7f0e760c-f367-46a7-bcdb-1b84438fd8cf",
  "assignment_id": "a4e57af0-f7f2-4912-9571-a924102a6214",
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
  "arrived_at": "2026-10-30T15:33:08.306018Z",
  "started_at": "2026-10-30T15:33:08.591881Z",
  "completed_at": "2026-10-30T15:33:08.885243Z",
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
  "command_id": "fb7632ef-c2b0-4300-882e-bff7637b1bf1",
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
  "id": "db4a8a8c-552c-4b16-9ee8-a8fcb8798f42",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:38:09.179705Z",
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
  "command_id": "3706f6f2-e396-4fcf-b54c-a0b9b02b88f7",
  "quote_id": "db4a8a8c-552c-4b16-9ee8-a8fcb8798f42",
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
    "phone": "+380671118041"
  }
}
```

```json
{
  "id": "d9b9eeaa-02ee-4306-a47d-095987ecd5e5",
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
  "created_at": "2026-10-30T15:33:09.463673Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118041"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d9b9eeaa-02ee-4306-a47d-095987ecd5e5` → **200**

```json
{
  "id": "d9b9eeaa-02ee-4306-a47d-095987ecd5e5",
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
  "created_at": "2026-10-30T15:33:09.463673Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118041"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d9b9eeaa-02ee-4306-a47d-095987ecd5e5/cancel` → **200**

```json
{
  "command_id": "38e7b216-6460-46c9-abb2-c0e2b35bba04",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d9b9eeaa-02ee-4306-a47d-095987ecd5e5",
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
  "created_at": "2026-10-30T15:33:09.463673Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671118041"
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
  "staff_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T15:23:44.923489Z",
  "last_entries": [
    {
      "order_id": "d9b9eeaa-02ee-4306-a47d-095987ecd5e5",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T15:33:10.084496Z"
    },
    {
      "order_id": "7f0e760c-f367-46a7-bcdb-1b84438fd8cf",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T15:33:08.889985Z"
    },
    {
      "order_id": "e4f8d1dd-a456-4ece-b470-99a5fcaea927",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T15:23:44.923489Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0be02065-e5b6-4541-9205-6322c0c9b010",
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
  "last_heartbeat_at": "2026-10-30T15:33:08.016148Z",
  "last_location_at": "2026-10-30T15:33:08.016148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0be02065-e5b6-4541-9205-6322c0c9b010/close` → **200**

```json
{
  "command_id": "57a5ac50-93e9-4e50-ab6e-989a23cbe3ce",
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

Done: operator bonus for fulfilled 7f0e760c-f367-46a7-bcdb-1b84438fd8cf and operator-fault cancellation d9b9eeaa-02ee-4306-a47d-095987ecd5e5.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678376920",
  "device_ref": "sandbox-32206"
}
```

```json
{
  "challenge_id": "fecba290-7795-456c-8476-4a7a64a541f8",
  "expires_at": "2026-10-30T15:38:14.454757075Z",
  "resend_available_at": "2026-10-30T15:33:15.454757075Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678376920` → **200**

```json
{
  "phone": "+380678376920",
  "audience": "CLIENT",
  "code": "402190",
  "sent_at": "2026-10-30T15:33:14.457366713Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679720822",
  "device_ref": "sandbox-28978",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "df95e29d-7378-447f-bc19-b4345782d0f6",
  "expires_at": "2026-10-30T15:38:15.961256913Z",
  "resend_available_at": "2026-10-30T15:33:16.961256913Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679720822` → **200**

```json
{
  "phone": "+380679720822",
  "audience": "CLIENT",
  "code": "016001",
  "sent_at": "2026-10-30T15:33:15.963485882Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679720822",
  "device_ref": "sandbox-27310",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "078f3ba7-fa3d-4fcd-977e-fdd77f561d31",
  "expires_at": "2026-10-30T15:38:17.476752047Z",
  "resend_available_at": "2026-10-30T15:33:18.476752047Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679720822` → **200**

```json
{
  "phone": "+380679720822",
  "audience": "CLIENT",
  "code": "881552",
  "sent_at": "2026-10-30T15:33:17.479430513Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679650000",
  "device_ref": "sandbox-12337"
}
```

```json
{
  "challenge_id": "c2131ff5-58ca-4297-abf9-8163df8065f1",
  "expires_at": "2026-10-30T15:38:18.986476887Z",
  "resend_available_at": "2026-10-30T15:33:19.986476887Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679650000",
  "device_ref": "sandbox-20266"
}
```

```json
{
  "challenge_id": "13b90d3e-12e1-4aff-942c-33b0060660da",
  "expires_at": "2026-10-30T15:38:20.465518242Z",
  "resend_available_at": "2026-10-30T15:33:21.465518242Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679650000` → **200**

```json
{
  "phone": "+380679650000",
  "audience": "CLIENT",
  "code": "871079",
  "sent_at": "2026-10-30T15:33:20.468704492Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679650000",
  "device_ref": "sandbox-7168",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "6e543d66-2bb8-4052-86ef-21dd30f82512",
  "expires_at": "2026-10-30T15:38:21.969037504Z",
  "resend_available_at": "2026-10-30T15:33:22.969037504Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380679650000` → **200**

```json
{
  "phone": "+380679650000",
  "audience": "CLIENT",
  "code": "859586",
  "sent_at": "2026-10-30T15:33:21.971539732Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380679650000",
  "device_ref": "sandbox-21813",
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
  "correlation_id": "4dc23849-4688-4ff0-af9d-159fafddf31d",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000024096"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "bc627084-8c17-417e-8aa2-941fcc224ff1"
}
```

`GET /sandbox/v1/otp?phone=%2B442000024096` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120026573"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "12ee8d4d-8803-4c64-801c-0557f1e4df0d"
}
```

`GET /sandbox/v1/otp?phone=%2B37120026573` → **404**

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
  "session_id": "ee7c4587-59cd-4b2b-901f-c031ac0a173d",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzMDQsImlhdCI6MTc5MzM3NDQwNCwianRpIjoiMGU3NGQ5ZTAtMDkzZS00NWY4LWIyYmMtYjQzODI4MjVmNmM5Iiwic2lkIjoiZWU3YzQ1ODctNTljZC00YjJiLTkwMWYtYzAzMWFjMGExNzNkIn0.Wj2jTPsbVFikOFGDOjocJ9S6XKfJmgNApjUcWI9OYBM",
  "access_expires_at": "2026-10-30T15:48:24.68314Z",
  "refresh_token": "lagh_9G7WJhfhckUHxTIGMsDxFre1Dw8OXFbVUAPG_8",
  "refresh_expires_at": "2026-10-31T03:33:24.68227828Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679650000` → **200**

```json
{
  "deliveries": [
    {
      "id": "45c9770d-1fe2-4989-98ae-5d385b27da43",
      "challenge_id": "6e543d66-2bb8-4052-86ef-21dd30f82512",
      "phone": "+380679650000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6abd0aa9-f66e-4fde-aedb-37062f0633ea",
      "error": null,
      "attempted_at": "2026-10-30T15:33:21.972066Z"
    },
    {
      "id": "2bc2bbae-1a2a-44a3-8da4-75165f999f97",
      "challenge_id": "13b90d3e-12e1-4aff-942c-33b0060660da",
      "phone": "+380679650000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-06266de6-f5d2-4ec4-8531-36394c38d016",
      "error": null,
      "attempted_at": "2026-10-30T15:33:20.469105Z"
    },
    {
      "id": "52d9aad1-07f1-4423-b888-8590c4f67254",
      "challenge_id": "c2131ff5-58ca-4297-abf9-8163df8065f1",
      "phone": "+380679650000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T15:33:18.989137Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679650000` → **200**

```json
{
  "phone": "+380679650000",
  "audience": "CLIENT",
  "code": "859586",
  "sent_at": "2026-10-30T15:33:21.971539732Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679720822` → **200**

```json
{
  "deliveries": [
    {
      "id": "4f96f507-8e8a-4235-8254-1b8c01af3648",
      "challenge_id": "078f3ba7-fa3d-4fcd-977e-fdd77f561d31",
      "phone": "+380679720822",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2507c606-cee6-4b86-8343-eec00b7d1737",
      "error": null,
      "attempted_at": "2026-10-30T15:33:17.479884Z"
    },
    {
      "id": "18db6e39-3b70-42c0-9d84-781ba1791158",
      "challenge_id": "df95e29d-7378-447f-bc19-b4345782d0f6",
      "phone": "+380679720822",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-bab63116-6898-4e3d-a76c-2df6428fe475",
      "error": null,
      "attempted_at": "2026-10-30T15:33:15.963745Z"
    }
  ]
}
```

Done: SMS to +380678376920; SMS then a call to +380679720822; a failed SMS, two calls and a refused third to +380679650000; +44 and +371 refused.

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
  "session_id": "4e4cc955-22b7-4a47-bde5-0bf80a396f02",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzMDUsImlhdCI6MTc5MzM3NDQwNSwianRpIjoiMTllNTI4Y2YtMTMxNC00ZTZmLWE2MTUtMGZjMWM5ODIyNTM1Iiwic2lkIjoiNGU0Y2M5NTUtMjJiNy00YTQ3LWJkZTUtMGJmODBhMzk2ZjAyIn0.BG1Igxm3tb2e24bMi-vKangUthl1SuXBD5gF4pt6uL8",
  "access_expires_at": "2026-10-30T15:48:25.919940015Z",
  "refresh_token": "eX89tkE463a1-hCOYuq0QiMpv7glPwzFbz5vgniynMU",
  "refresh_expires_at": "2026-10-31T03:33:25.91944266Z",
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
  "session_id": "58529c79-4a31-449b-a929-4c126997d179",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzMDYsImlhdCI6MTc5MzM3NDQwNiwianRpIjoiZGM3MDQ5YjgtZWJhZC00ZDhiLWEzZWQtMDljMTFjZTZmOGJkIiwic2lkIjoiNTg1MjljNzktNGEzMS00NDliLWE5MjktNGMxMjY5OTdkMTc5In0.Or_sA6HKDpPT4F6xpWkX3S4NFygWYIrHjnEJjSq17Aw",
  "access_expires_at": "2026-10-30T15:48:26.527887908Z",
  "refresh_token": "ZaYytvCYDixTyLWLhwcVFKQolpGxr5N_jbIKfhZwo1w",
  "refresh_expires_at": "2026-10-31T03:33:26.527434952Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
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

`POST /api/admin/v1/staff-extensions/94116a77-b360-4b9c-b76e-5fc16ca14bcb` → **200**

```json
{
  "command_id": "d7ef7a5f-649e-4ba4-bceb-24c92f084250",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "17725c9c-db49-4729-a45d-7792167aa4e1",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T15:33:27.669276Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T15:33:27.669276Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2a2e2316-a890-4404-87e1-0095c8ad5cf6",
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
  "id": "8ba792cc-eda5-43b3-89e7-a1f739c43888",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:38:28.250717Z",
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
  "command_id": "cc0d4599-98aa-4975-bbfa-d5fcf17fd90d",
  "quote_id": "8ba792cc-eda5-43b3-89e7-a1f739c43888",
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
    "phone": "+380670933303"
  }
}
```

```json
{
  "id": "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5",
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
  "created_at": "2026-10-30T15:33:28.545297Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670933303"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5/calls` → **201**

```json
{
  "command_id": "3bb1d31a-944d-4f34-a5ac-6488876f49b4",
  "to": "CALLER"
}
```

```json
{
  "id": "844c1a42-3ea7-4108-9661-7a190c170712",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "order_ids": [
    "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5"
  ],
  "started_at": "2026-10-30T15:33:28.874548Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5/calls` → **201**

```json
{
  "command_id": "3bb1d31a-944d-4f34-a5ac-6488876f49b4",
  "to": "CALLER"
}
```

```json
{
  "id": "844c1a42-3ea7-4108-9661-7a190c170712",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "order_ids": [
    "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5"
  ],
  "started_at": "2026-10-30T15:33:28.874548Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "844c1a42-3ea7-4108-9661-7a190c170712",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380670933303",
    "at": "2026-10-30T15:33:28.877233361Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "844c1a42-3ea7-4108-9661-7a190c170712",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.22525",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "844c1a42-3ea7-4108-9661-7a190c170712"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "844c1a42-3ea7-4108-9661-7a190c170712",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5` → **200**

```json
{
  "calls": [
    {
      "id": "844c1a42-3ea7-4108-9661-7a190c170712",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [
        "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5"
      ],
      "started_at": "2026-10-30T15:33:28.874548Z",
      "answered_at": "2026-10-30T15:33:29.527356Z",
      "ended_at": "2026-10-30T15:33:29.547807Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?order_id=7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5` → **200**

```json
{
  "calls": [
    {
      "id": "844c1a42-3ea7-4108-9661-7a190c170712",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [
        "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5"
      ],
      "started_at": "2026-10-30T15:33:28.874548Z",
      "answered_at": "2026-10-30T15:33:29.527356Z",
      "ended_at": "2026-10-30T15:33:29.547807Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?order_id=7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5` → **200**

```json
{
  "calls": [
    {
      "id": "844c1a42-3ea7-4108-9661-7a190c170712",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [
        "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5"
      ],
      "started_at": "2026-10-30T15:33:28.874548Z",
      "answered_at": "2026-10-30T15:33:29.527356Z",
      "ended_at": "2026-10-30T15:33:29.547807Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

`GET /api/operator/v1/calls?order_id=7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5` → **200**

```json
{
  "calls": [
    {
      "id": "844c1a42-3ea7-4108-9661-7a190c170712",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "order_ids": [
        "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5"
      ],
      "started_at": "2026-10-30T15:33:28.874548Z",
      "answered_at": "2026-10-30T15:33:29.527356Z",
      "ended_at": "2026-10-30T15:33:29.547807Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T15:33:35.094303Z"
      }
    }
  ],
  "page": {
    "next_cursor": null,
    "has_more": false
  }
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5` → **200**

```json
{
  "id": "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5",
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
  "created_at": "2026-10-30T15:33:28.545297Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670933303"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5/cancel` → **200**

```json
{
  "command_id": "9811f072-8113-4f6e-a327-3aa5cfef1e0f",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5",
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
  "created_at": "2026-10-30T15:33:28.545297Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670933303"
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
  "command_id": "54f146e7-452d-4bf6-9d90-866fe46682d8",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T15:33:37.36118Z",
  "extension": "101"
}
```

Done: outgoing call 844c1a42-3ea7-4108-9661-7a190c170712 from order 7e1e1674-31e1-4ca2-95c7-3461ebb2f0d5, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638767590",
  "device_ref": "sandbox-9126"
}
```

```json
{
  "challenge_id": "43b0f276-796a-4705-8156-dc1dc8127f0f",
  "expires_at": "2026-10-30T15:38:37.654474238Z",
  "resend_available_at": "2026-10-30T15:33:38.654474238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638767590` → **200**

```json
{
  "phone": "+380638767590",
  "audience": "CLIENT",
  "code": "290174",
  "sent_at": "2026-10-30T15:33:37.657048476Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43b0f276-796a-4705-8156-dc1dc8127f0f",
  "code": "290174",
  "device_ref": "sandbox-9126"
}
```

```json
{
  "session_id": "d9b8bb96-1680-4133-a0ff-145256162afe",
  "subject": {
    "type": "CLIENT",
    "id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTcwYjJhOC0xMTZjLTRkMGMtYmNiOS0wZjVjODAyNTBmZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MzE3LCJpYXQiOjE3OTMzNzQ0MTcsImp0aSI6IjVmZDI1NDcwLWUxY2QtNDdmZi1hNzMyLTEzZmYwMzRhNjhkNiIsInNpZCI6ImQ5YjhiYjk2LTE2ODAtNDEzMy1hMGZmLTE0NTI1NjE2MmFmZSJ9.-PpF5AQODbJopoCgDLSLlCjN3oJpRKMJtB8QfkIGj9M",
  "access_expires_at": "2026-10-30T15:48:37.962207824Z",
  "refresh_token": "p1HNDXlz1VE_qzkYoPCr-QxM-oj7KedgcuzUBmYwuoo",
  "refresh_expires_at": "2026-11-29T15:33:37.961744734Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9",
  "session_id": "d9b8bb96-1680-4133-a0ff-145256162afe",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638767590",
  "device_ref": "sandbox-7020"
}
```

```json
{
  "challenge_id": "7c3a225b-f018-4bb9-bfb6-ddf541be03ca",
  "expires_at": "2026-10-30T15:38:40.51608083Z",
  "resend_available_at": "2026-10-30T15:33:41.51608083Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638767590` → **200**

```json
{
  "phone": "+380638767590",
  "audience": "CLIENT",
  "code": "014102",
  "sent_at": "2026-10-30T15:33:40.518654121Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c3a225b-f018-4bb9-bfb6-ddf541be03ca",
  "code": "014102",
  "device_ref": "sandbox-7020"
}
```

```json
{
  "session_id": "c1df96fe-831c-4b43-966e-5cb6603b9454",
  "subject": {
    "type": "CLIENT",
    "id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTcwYjJhOC0xMTZjLTRkMGMtYmNiOS0wZjVjODAyNTBmZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MzIwLCJpYXQiOjE3OTMzNzQ0MjAsImp0aSI6ImM4MmZkZDdlLTI5ZDMtNDliNS1hM2MwLTc5NzYwNjhkYWMxZiIsInNpZCI6ImMxZGY5NmZlLTgzMWMtNGI0My05NjZlLTVjYjY2MDNiOTQ1NCJ9.l5QCd1yxfncdlc06O_ZvAsjzaUaSbUTmStyL3g6jR8Y",
  "access_expires_at": "2026-10-30T15:48:40.825275017Z",
  "refresh_token": "XeNLOZ-w_W_-qXTlC4tL3EsbKDM2IXjk5cQxuvnQ4zY",
  "refresh_expires_at": "2026-11-29T15:33:40.824630531Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "a65697cf-37c2-46f7-865e-30ae8665ca47",
  "expires_at": "2026-10-30T15:38:43.111145433Z",
  "resend_available_at": "2026-10-30T15:33:44.111145433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638767590` → **200**

```json
{
  "phone": "+380638767590",
  "audience": "CLIENT",
  "code": "892567",
  "sent_at": "2026-10-30T15:33:43.113390691Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630831588"
}
```

```json
{
  "challenge_id": "8be98161-09d0-4d24-b70d-1164f6673035",
  "expires_at": "2026-10-30T15:38:43.409302596Z",
  "resend_available_at": "2026-10-30T15:33:44.409302596Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630831588` → **200**

```json
{
  "phone": "+380630831588",
  "audience": "CLIENT",
  "code": "239533",
  "sent_at": "2026-10-30T15:33:43.411451717Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "f88bc886-b007-4c69-ad7a-9e9956a8082a",
  "current_challenge_id": "a65697cf-37c2-46f7-865e-30ae8665ca47",
  "current_code": "000000",
  "new_challenge_id": "8be98161-09d0-4d24-b70d-1164f6673035",
  "new_code": "239533"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "1fd54215-a9d2-4be7-8bb9-c51bae8dc31b"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "f08bf31c-8e26-4ce1-ba7b-fdd2e1ebe4b4",
  "current_challenge_id": "a65697cf-37c2-46f7-865e-30ae8665ca47",
  "current_code": "892567",
  "new_challenge_id": "8be98161-09d0-4d24-b70d-1164f6673035",
  "new_code": "239533"
}
```

```json
{
  "subject_id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9",
  "phone": "+380630831588",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9",
  "session_id": "d9b8bb96-1680-4133-a0ff-145256162afe",
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
  "correlation_id": "158ad075-0489-4412-9987-c82c7f2a2ff4"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630831588",
  "device_ref": "sandbox-21238"
}
```

```json
{
  "challenge_id": "08ad4997-85a8-4b73-9d6d-0042fc32406c",
  "expires_at": "2026-10-30T15:38:46.839474359Z",
  "resend_available_at": "2026-10-30T15:33:47.839474359Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630831588` → **200**

```json
{
  "phone": "+380630831588",
  "audience": "CLIENT",
  "code": "500829",
  "sent_at": "2026-10-30T15:33:46.841760863Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "08ad4997-85a8-4b73-9d6d-0042fc32406c",
  "code": "500829",
  "device_ref": "sandbox-21238"
}
```

```json
{
  "session_id": "a6bb3f10-56cb-4f79-8f1e-aeb60885da3c",
  "subject": {
    "type": "CLIENT",
    "id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTcwYjJhOC0xMTZjLTRkMGMtYmNiOS0wZjVjODAyNTBmZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MzI3LCJpYXQiOjE3OTMzNzQ0MjcsImp0aSI6IjYxMjdhY2EwLThhNzctNDYwMi1iYjUzLWQwOGNjMTFiNmI0OCIsInNpZCI6ImE2YmIzZjEwLTU2Y2ItNGY3OS04ZjFlLWFlYjYwODg1ZGEzYyJ9.alNoGDplTZn6f4hsQzrMhr7IKzOpMhHZRSPOvpJW_zo",
  "access_expires_at": "2026-10-30T15:48:47.137281456Z",
  "refresh_token": "DnZCK-mp6lGlqQojHKZWLnd_ltSlN2JkGb3NYEstyzo",
  "refresh_expires_at": "2026-11-29T15:33:47.136591007Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9",
  "session_id": "a6bb3f10-56cb-4f79-8f1e-aeb60885da3c",
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
  "session_id": "97bf23f6-e5a3-4c69-90e1-9e3580436830",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzMjgsImlhdCI6MTc5MzM3NDQyOCwianRpIjoiZTBjYzA2OWUtNDMyZC00MTg0LWIzYmEtMGQ1NWIxZTFlZDA3Iiwic2lkIjoiOTdiZjIzZjYtZTVhMy00YzY5LTkwZTEtOWUzNTgwNDM2ODMwIn0.cmQWoNritXlie1L4cvsNeC8DpaR65kEv0FxbuJRHlas",
  "access_expires_at": "2026-10-30T15:48:48.019647483Z",
  "refresh_token": "Bqx6RiJG1GaUogxi_E4qrfaYnsGep7sKUnerDqtgEa4",
  "refresh_expires_at": "2026-10-31T03:33:48.019220753Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/9570b2a8-116c-4d0c-bcb9-0f5c80250fe9` → **200**

```json
{
  "client": {
    "id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9",
    "phone": "+380630831588",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T15:33:37.960124Z",
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

`POST /api/admin/v1/clients/9570b2a8-116c-4d0c-bcb9-0f5c80250fe9/phone/new-code` → **201**

```json
{
  "phone": "+380635444080"
}
```

```json
{
  "challenge_id": "5a148052-7879-437b-a149-cdd70cc67c89",
  "expires_at": "2026-10-30T15:38:48.643452778Z",
  "resend_available_at": "2026-10-30T15:33:49.643452778Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635444080` → **200**

```json
{
  "phone": "+380635444080",
  "audience": "CLIENT",
  "code": "068740",
  "sent_at": "2026-10-30T15:33:48.645875297Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/9570b2a8-116c-4d0c-bcb9-0f5c80250fe9/phone` → **422**

```json
{
  "command_id": "0b9e252f-9742-4623-8d66-3d3809a59262",
  "expected_version": 3,
  "new_challenge_id": "5a148052-7879-437b-a149-cdd70cc67c89",
  "new_code": "068741",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/9570b2a8-116c-4d0c-bcb9-0f5c80250fe9/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "9979105e-e61e-4e54-9642-466eb2030942"
}
```

`POST /api/admin/v1/clients/9570b2a8-116c-4d0c-bcb9-0f5c80250fe9/phone` → **400**

```json
{
  "command_id": "7806748e-0c78-4159-97d9-afca9f9942e5",
  "expected_version": 3,
  "new_challenge_id": "5a148052-7879-437b-a149-cdd70cc67c89",
  "new_code": "068740",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9570b2a8-116c-4d0c-bcb9-0f5c80250fe9/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5dcbde71-a2bf-4950-8959-870f2dabc885",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/9570b2a8-116c-4d0c-bcb9-0f5c80250fe9/phone` → **200**

```json
{
  "command_id": "9fcfa68f-b9b3-492c-a767-a6cb397d1e5c",
  "expected_version": 3,
  "new_challenge_id": "5a148052-7879-437b-a149-cdd70cc67c89",
  "new_code": "068740",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9",
  "phone": "+380635444080",
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
  "correlation_id": "9858ee7c-0a07-4968-93ff-74b741cbe876"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635444080",
  "device_ref": "sandbox-22440"
}
```

```json
{
  "challenge_id": "6b8a71ad-9d1b-4efc-b9db-447f8a7f7d53",
  "expires_at": "2026-10-30T15:38:50.084153646Z",
  "resend_available_at": "2026-10-30T15:33:51.084153646Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635444080` → **200**

```json
{
  "phone": "+380635444080",
  "audience": "CLIENT",
  "code": "892948",
  "sent_at": "2026-10-30T15:33:50.087090922Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b8a71ad-9d1b-4efc-b9db-447f8a7f7d53",
  "code": "892948",
  "device_ref": "sandbox-22440"
}
```

```json
{
  "session_id": "b28e4e09-7816-4ba8-ac4e-d133f93d7764",
  "subject": {
    "type": "CLIENT",
    "id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTcwYjJhOC0xMTZjLTRkMGMtYmNiOS0wZjVjODAyNTBmZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MzMwLCJpYXQiOjE3OTMzNzQ0MzAsImp0aSI6ImEzNWQ2ZWE3LTA1MmItNDQ3OC04OGZjLTMwZGYxODBmNDUxZCIsInNpZCI6ImIyOGU0ZTA5LTc4MTYtNGJhOC1hYzRlLWQxMzNmOTNkNzc2NCJ9.TNMwGOx7LQmDZzeJiVPO851HHOasFKVBQA7rbwkfxxc",
  "access_expires_at": "2026-10-30T15:48:50.392743886Z",
  "refresh_token": "H4NYjmOeqZrWDYf1rpFFKK5IvjZAJqeOD_MTtNiz3to",
  "refresh_expires_at": "2026-11-29T15:33:50.39210367Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9570b2a8-116c-4d0c-bcb9-0f5c80250fe9",
  "session_id": "b28e4e09-7816-4ba8-ac4e-d133f93d7764",
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
  "phone": "+380635806348",
  "device_ref": "sandbox-20955"
}
```

```json
{
  "challenge_id": "fdb7cb0b-8807-40bb-bf5c-a455c19ad874",
  "expires_at": "2026-10-30T15:38:50.956902889Z",
  "resend_available_at": "2026-10-30T15:33:51.956902889Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635806348` → **200**

```json
{
  "phone": "+380635806348",
  "audience": "CLIENT",
  "code": "701110",
  "sent_at": "2026-10-30T15:33:50.959534587Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdb7cb0b-8807-40bb-bf5c-a455c19ad874",
  "code": "701110",
  "device_ref": "sandbox-20955"
}
```

```json
{
  "session_id": "e02d0971-6209-45bf-b6b9-ee3f9524be3c",
  "subject": {
    "type": "CLIENT",
    "id": "99a049f8-855a-44aa-a175-352e51cf77b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OWEwNDlmOC04NTVhLTQ0YWEtYTE3NS0zNTJlNTFjZjc3YjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MzMxLCJpYXQiOjE3OTMzNzQ0MzEsImp0aSI6IjllYjNiMWY0LThiZTEtNDA1MC04ZTk0LTg5MzdjNzE0OTkxMSIsInNpZCI6ImUwMmQwOTcxLTYyMDktNDViZi1iNmI5LWVlM2Y5NTI0YmUzYyJ9.GaZG5nEgUauuwvz3gi1ScXaykMsiBAVlV2af_i-z_bE",
  "access_expires_at": "2026-10-30T15:48:51.26362985Z",
  "refresh_token": "blfZfV9iQkax6y8bOGVaqpX94K6NNUdnp6XGIyUAIlo",
  "refresh_expires_at": "2026-11-29T15:33:51.262856382Z",
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
  "session_id": "c65f0605-aa4b-452e-9a7d-98e3d0ad622a",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzMzIsImlhdCI6MTc5MzM3NDQzMiwianRpIjoiOWM0YzIxZGUtNTI5My00NmVlLTljY2EtZTc2NGM2NDYzNzQ2Iiwic2lkIjoiYzY1ZjA2MDUtYWE0Yi00NTJlLTlhN2QtOThlM2QwYWQ2MjJhIn0.gdFeCfNwwKI3Lkdjg1wSVQjKuXn3tHrjFQWt9nPxlvM",
  "access_expires_at": "2026-10-30T15:48:52.458765519Z",
  "refresh_token": "WOWa1JJgG8Ny1c8lrr2Xwmu1VjQkzTWXiCdSETvu2Ao",
  "refresh_expires_at": "2026-10-31T03:33:52.458269965Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635806348` → **200**

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
  "correlation_id": "4aa1d203-39b3-4bae-b272-d5dedd89b14b"
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
  "session_id": "27f642f7-705e-43f9-861b-a3dccbb57a45",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzMzMsImlhdCI6MTc5MzM3NDQzMywianRpIjoiNWE0MWIyODUtZDYyYi00M2RmLTkzNzgtNmI3ODk0OWQzMDRiIiwic2lkIjoiMjdmNjQyZjctNzA1ZS00M2Y5LTg2MWItYTNkY2NiYjU3YTQ1In0.BZSplinBsvhRJgDCiO8lSKAuXIU2AIlX7uU0fIAS-ms",
  "access_expires_at": "2026-10-30T15:48:53.663102378Z",
  "refresh_token": "AwTaJu5Poo4p5ZsIBMnmKazz-y31OUWeb9JmZVCjZsU",
  "refresh_expires_at": "2026-10-31T03:33:53.662580597Z",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T15:19:44.867523Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "d891c452-77cc-4e26-afc8-a85dd60fcfab",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T15:33:54.234417397Z"
}
```

## The rider books the airport for 2026-10-30T18:33:53Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600799733",
  "device_ref": "sandbox-22099"
}
```

```json
{
  "challenge_id": "05314acf-e42c-430f-b0c2-a0a74f30f94b",
  "expires_at": "2026-10-30T15:38:54.536443351Z",
  "resend_available_at": "2026-10-30T15:33:55.536443351Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600799733` → **200**

```json
{
  "phone": "+48600799733",
  "audience": "CLIENT",
  "code": "109937",
  "sent_at": "2026-10-30T15:33:54.539191095Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05314acf-e42c-430f-b0c2-a0a74f30f94b",
  "code": "109937",
  "device_ref": "sandbox-22099"
}
```

```json
{
  "session_id": "c64db73f-386b-4c33-aa51-4084cea0c572",
  "subject": {
    "type": "CLIENT",
    "id": "b3659bf5-79af-48bc-90dd-56f8ca771742"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzY1OWJmNS03OWFmLTQ4YmMtOTBkZC01NmY4Y2E3NzE3NDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MzM0LCJpYXQiOjE3OTMzNzQ0MzQsImp0aSI6IjE2ZjM4ZDgxLWJhYzEtNGFlYy1hZDg1LTNlNTRlOGUxMjQxOSIsInNpZCI6ImM2NGRiNzNmLTM4NmItNGMzMy1hYTUxLTQwODRjZWEwYzU3MiJ9.UI7De7lYRoduc_b59lq7zsodMG6Cwqp9neFAjFx2-L0",
  "access_expires_at": "2026-10-30T15:48:54.84232894Z",
  "refresh_token": "jBRKIY0n4VDQePJ0dxxW7j6RuuvsVTF2zdibQyDpcwA",
  "refresh_expires_at": "2026-11-29T15:33:54.841816729Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cf22b29c-51c6-435f-ab27-56dbe342720e",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T18:33:53Z"
}
```

```json
{
  "id": "2831bebf-5ab5-4f31-9212-859f8248d09d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:38:55.138898Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T18:33:53Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f7f560ba-19f6-4dcd-b423-c884edfbd251",
  "quote_id": "2831bebf-5ab5-4f31-9212-859f8248d09d",
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
  "pickup_at": "2026-10-30T18:33:53Z"
}
```

```json
{
  "id": "d69113d2-2dde-4f19-ba5a-dac187d2117e",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b3659bf5-79af-48bc-90dd-56f8ca771742",
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
  "created_at": "2026-10-30T15:33:55.433618Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T18:33:53Z",
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
  "device_ref": "sandbox-7160"
}
```

```json
{
  "challenge_id": "4c62cb62-314f-4b6f-bd71-47d58e509a37",
  "expires_at": "2026-10-30T15:38:55.72939123Z",
  "resend_available_at": "2026-10-30T15:33:56.72939123Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "851137",
  "sent_at": "2026-10-30T15:33:55.731838288Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c62cb62-314f-4b6f-bd71-47d58e509a37",
  "code": "851137",
  "device_ref": "sandbox-7160"
}
```

```json
{
  "session_id": "9471bf4c-ef78-4fa2-8edd-71c390699115",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTMzNiwiaWF0IjoxNzkzMzc0NDM2LCJqdGkiOiJmMzZhNmYwZS0zZDczLTRmNGYtOTc1Mi0wM2VmM2ZiZjA1NDIiLCJzaWQiOiI5NDcxYmY0Yy1lZjc4LTRmYTItOGVkZC03MWMzOTA2OTkxMTUifQ.XJRdVVznhwW2MiyivNgX1QfsVfPxRP_ELXMquBbU2Ek",
  "access_expires_at": "2026-10-30T15:48:56.037095196Z",
  "refresh_token": "2HAP6szIFmSX71LDeq7smM9lmxteuJjA8CmBbRqlFIg",
  "refresh_expires_at": "2026-11-29T15:33:56.036550959Z",
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
  "command_id": "31f0442a-f94e-4ece-94c2-9da3b5c536eb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:33:56Z",
    "sequence": 1793374436613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6676c1ec-4d0b-4597-9330-272d8c6c18ed",
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
  "last_heartbeat_at": "2026-10-30T15:33:56.630209Z",
  "last_location_at": "2026-10-30T15:33:56.630209Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d69113d2-2dde-4f19-ba5a-dac187d2117e",
      "short_number": 25,
      "pickup_at": "2026-10-30T18:33:53Z",
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

`POST /api/driver/v1/preorders/d69113d2-2dde-4f19-ba5a-dac187d2117e/reserve` → **200**

```json
{
  "command_id": "41736450-75a5-4ae8-81f3-b5c52ba67100"
}
```

```json
{
  "id": "45941f8b-4fe9-4626-989a-26c06e55f9ef",
  "state": "RESERVED",
  "order": {
    "order_id": "d69113d2-2dde-4f19-ba5a-dac187d2117e",
    "short_number": 25,
    "pickup_at": "2026-10-30T18:33:53Z",
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
  "reserved_at": "2026-10-30T15:33:57.195374Z",
  "confirm_from": "2026-10-30T18:03:53Z",
  "confirm_until": "2026-10-30T18:13:53Z",
  "drop_until": "2026-10-30T17:33:53Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "45941f8b-4fe9-4626-989a-26c06e55f9ef",
      "state": "RESERVED",
      "order": {
        "order_id": "d69113d2-2dde-4f19-ba5a-dac187d2117e",
        "short_number": 25,
        "pickup_at": "2026-10-30T18:33:53Z",
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
      "reserved_at": "2026-10-30T15:33:57.195374Z",
      "confirm_from": "2026-10-30T18:03:53Z",
      "confirm_until": "2026-10-30T18:13:53Z",
      "drop_until": "2026-10-30T17:33:53Z"
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
      "id": "45941f8b-4fe9-4626-989a-26c06e55f9ef",
      "state": "RESERVED",
      "order": {
        "order_id": "d69113d2-2dde-4f19-ba5a-dac187d2117e",
        "short_number": 25,
        "pickup_at": "2026-10-30T18:33:53Z",
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
      "reserved_at": "2026-10-30T15:33:57.195374Z",
      "confirm_from": "2026-10-30T18:03:53Z",
      "confirm_until": "2026-10-30T18:13:53Z",
      "drop_until": "2026-10-30T17:33:53Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/45941f8b-4fe9-4626-989a-26c06e55f9ef/confirm` → **409**

```json
{
  "command_id": "fd29084d-7fba-49c3-9be9-7e506f271df3"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/45941f8b-4fe9-4626-989a-26c06e55f9ef/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "89b2518d-0596-4a73-8e3b-f694c7aa7cb8"
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
  "session_id": "b0d2b24b-e0db-4cd9-9b66-8514a22c364f",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzMzgsImlhdCI6MTc5MzM3NDQzOCwianRpIjoiY2Q5OTI2OTItYzk4ZC00Y2QzLWIyNTctZjg5OWQwYmYxNDI2Iiwic2lkIjoiYjBkMmIyNGItZTBkYi00Y2Q5LTliNjYtODUxNGEyMmMzNjRmIn0.TaxnNV5maGUFKPXpbemxXa-hYGUPzNfEMTZoGO5cx6c",
  "access_expires_at": "2026-10-30T15:48:58.629894223Z",
  "refresh_token": "KIbhBzUdIKx4-7wsZ9a_oiRvZemeBfVKhd7jssGbVyY",
  "refresh_expires_at": "2026-10-31T03:33:58.629446696Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d69113d2-2dde-4f19-ba5a-dac187d2117e` → **200**

```json
{
  "id": "d69113d2-2dde-4f19-ba5a-dac187d2117e",
  "short_number": 25,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b3659bf5-79af-48bc-90dd-56f8ca771742",
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
  "created_at": "2026-10-30T15:33:55.433618Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T18:33:53Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "45941f8b-4fe9-4626-989a-26c06e55f9ef",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T15:33:57.195374Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d69113d2-2dde-4f19-ba5a-dac187d2117e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T15:33:55.434765Z",
      "actor": {
        "type": "CLIENT",
        "id": "b3659bf5-79af-48bc-90dd-56f8ca771742",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d69113d2-2dde-4f19-ba5a-dac187d2117e",
        "preorder": true,
        "quote_id": "2831bebf-5ab5-4f31-9212-859f8248d09d",
        "pickup_at": "2026-10-30T18:33:53Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "fde71b6b-1d82-41c2-b75c-56f4aea93ee6"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T15:33:57.196879Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d69113d2-2dde-4f19-ba5a-dac187d2117e",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "45941f8b-4fe9-4626-989a-26c06e55f9ef"
      },
      "correlation_id": "5dc301a3-3fb7-4d98-bf6c-65d94c01d203"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order d69113d2-2dde-4f19-ba5a-dac187d2117e, reservation 45941f8b-4fe9-4626-989a-26c06e55f9ef.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10000"
}
```

```json
{
  "challenge_id": "aee4819c-13ab-45be-9945-ccda611154d6",
  "expires_at": "2026-10-30T15:38:59.505357667Z",
  "resend_available_at": "2026-10-30T15:34:00.505357667Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "888820",
  "sent_at": "2026-10-30T15:33:59.508246641Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aee4819c-13ab-45be-9945-ccda611154d6",
  "code": "888820",
  "device_ref": "sandbox-10000"
}
```

```json
{
  "session_id": "fa1e36ab-bad6-403b-8754-7f838160ab12",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTMzOSwiaWF0IjoxNzkzMzc0NDM5LCJqdGkiOiJkODIzNWJkMS05ZjdkLTQ0ZmYtOGZjOC1lZGI3Nzc4NzEzMmIiLCJzaWQiOiJmYTFlMzZhYi1iYWQ2LTQwM2ItODc1NC03ZjgzODE2MGFiMTIifQ.lqvrpmbuVG_4L4OVlxawX4lCtb1LSZWGV7GFbTb7sWg",
  "access_expires_at": "2026-10-30T15:48:59.807101557Z",
  "refresh_token": "pq97o4g9Ko2aOWJkoGHnCjDk1nIUOR6XacIxpRGNhiY",
  "refresh_expires_at": "2026-11-29T15:33:59.806578214Z",
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
  "command_id": "bc3459a1-6cc5-4c5a-8cc0-01a2009dfd50",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:34:00Z",
    "sequence": 1793374440378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77331cba-8549-4019-989f-97d47ba6a208",
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
  "last_heartbeat_at": "2026-10-30T15:34:00.395724Z",
  "last_location_at": "2026-10-30T15:34:00.395724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678488892",
  "device_ref": "sandbox-18739"
}
```

```json
{
  "challenge_id": "2b7b07ab-6a1a-473d-b7e2-c5cec9635060",
  "expires_at": "2026-10-30T15:39:00.69108893Z",
  "resend_available_at": "2026-10-30T15:34:01.69108893Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678488892` → **200**

```json
{
  "phone": "+380678488892",
  "audience": "CLIENT",
  "code": "845290",
  "sent_at": "2026-10-30T15:34:00.693656919Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b7b07ab-6a1a-473d-b7e2-c5cec9635060",
  "code": "845290",
  "device_ref": "sandbox-18739"
}
```

```json
{
  "session_id": "74ef5b46-10ff-4bd8-93c1-fa72535cb180",
  "subject": {
    "type": "CLIENT",
    "id": "89497839-3cc9-4f8d-9763-8b90526e5cb0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTQ5NzgzOS0zY2M5LTRmOGQtOTc2My04YjkwNTI2ZTVjYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1MzQwLCJpYXQiOjE3OTMzNzQ0NDAsImp0aSI6IjhkODNhMmI0LWJhMGQtNDJjMS1iZWYxLTM5YTNkODBkY2Y4MSIsInNpZCI6Ijc0ZWY1YjQ2LTEwZmYtNGJkOC05M2MxLWZhNzI1MzVjYjE4MCJ9.9w_Rg80HIP-wRb6_esc2JNBfOnmx9Uh32a1xZBS0t9g",
  "access_expires_at": "2026-10-30T15:49:00.995882914Z",
  "refresh_token": "J_IV_l-RZtrWrz354eqWD-cuDhMcbU6X3BiMx1tPNw4",
  "refresh_expires_at": "2026-11-29T15:34:00.995335471Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "330d24f1-22f2-4528-b9bb-3716d661478c",
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
  "id": "edbd2771-f368-4dde-85c6-d6cd85ef5515",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:39:01.278815Z",
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
  "command_id": "0b50109f-505e-4377-b359-1ef4582935fc",
  "quote_id": "edbd2771-f368-4dde-85c6-d6cd85ef5515",
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
  "id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "89497839-3cc9-4f8d-9763-8b90526e5cb0",
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
  "created_at": "2026-10-30T15:34:01.577375Z",
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
    "id": "8275c828-5111-4214-94f7-ee2c16f5f0d4",
    "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
    "expires_at": "2026-10-30T15:34:16.5877Z",
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

`POST /api/driver/v1/offers/8275c828-5111-4214-94f7-ee2c16f5f0d4/accept` → **200**

```json
{
  "command_id": "2ea77160-2944-4db8-b4ab-c67e8cf73854"
}
```

```json
{
  "id": "4214125b-e662-4cda-b512-6bf733a15c7b",
  "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6",
  "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "assignment_id": "4214125b-e662-4cda-b512-6bf733a15c7b",
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

`POST /api/driver/v1/work-sessions/77331cba-8549-4019-989f-97d47ba6a208/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:34:02Z",
    "sequence": 1793374442760
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77331cba-8549-4019-989f-97d47ba6a208",
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
  "last_heartbeat_at": "2026-10-30T15:34:02.77721Z",
  "last_location_at": "2026-10-30T15:34:02.77721Z",
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
  "id": "9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6",
  "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "assignment_id": "4214125b-e662-4cda-b512-6bf733a15c7b",
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

`POST /api/driver/v1/trips/9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6/arrive` → **200**

```json
{
  "command_id": "e1fa6770-8cb6-4e7f-a2fb-d593316cd9f2",
  "expected_version": 0
}
```

```json
{
  "id": "9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6",
  "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "assignment_id": "4214125b-e662-4cda-b512-6bf733a15c7b",
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
  "arrived_at": "2026-10-30T15:34:03.330169Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6/start` → **200**

```json
{
  "command_id": "24a1e03a-49b3-465b-805e-ca610ba3c29d",
  "expected_version": 1
}
```

```json
{
  "id": "9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6",
  "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "assignment_id": "4214125b-e662-4cda-b512-6bf733a15c7b",
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
  "arrived_at": "2026-10-30T15:34:03.330169Z",
  "started_at": "2026-10-30T15:34:03.619128Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

(the car drives 48 s to the next point)

`POST /api/driver/v1/work-sessions/77331cba-8549-4019-989f-97d47ba6a208/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:34:51Z",
    "sequence": 1793374491927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77331cba-8549-4019-989f-97d47ba6a208",
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
  "last_heartbeat_at": "2026-10-30T15:34:51.946533Z",
  "last_location_at": "2026-10-30T15:34:51.946533Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6/complete` → **200**

```json
{
  "command_id": "8de59e83-647b-4bf4-97e8-2ae8ea7b5fc4",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:34:52Z",
  "cash_received": true
}
```

```json
{
  "id": "9f7bd4a5-eb83-40d2-9464-02a4f3eba6e6",
  "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "assignment_id": "4214125b-e662-4cda-b512-6bf733a15c7b",
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
  "arrived_at": "2026-10-30T15:34:03.330169Z",
  "started_at": "2026-10-30T15:34:03.619128Z",
  "completed_at": "2026-10-30T15:34:52.242963Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/19a630fb-af19-4685-9e82-6b3d409d708a/rating` → **200**

```json
{
  "command_id": "50390e06-bb29-46c4-8b7c-d2615cdb77c1",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "score": 5,
  "created_at": "2026-10-30T15:34:52.554980331Z"
}
```

`POST /api/driver/v1/orders/19a630fb-af19-4685-9e82-6b3d409d708a/rating` → **200**

```json
{
  "command_id": "9a04e095-0b6d-4386-92b9-af5abe8dbf83",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
  "score": 4,
  "created_at": "2026-10-30T15:34:52.865679525Z"
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
  "session_id": "19da964b-b47c-4ed2-a2d3-bbf040b3ea0c",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzOTMsImlhdCI6MTc5MzM3NDQ5MywianRpIjoiZjZmZmRjOGYtMGM0NC00MTU3LWI0ODAtYmRiYmI1MTQ0NzU4Iiwic2lkIjoiMTlkYTk2NGItYjQ3Yy00ZWQyLWEyZDMtYmJmMDQwYjNlYTBjIn0.Tw5JNEaeQOpvdxCks9jW6hnRWmXP78gXSbamo0En1vk",
  "access_expires_at": "2026-10-30T15:49:53.753546988Z",
  "refresh_token": "hqlkTx_mJVOcZV4KSoFGlR-vLAayvt0ONd7A4Qap1Zo",
  "refresh_expires_at": "2026-10-31T03:34:53.753002258Z",
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
  "session_id": "7e4d600d-4608-40f7-9146-6473324a184e",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzOTQsImlhdCI6MTc5MzM3NDQ5NCwianRpIjoiNTdjZTE2NzQtMmU4NC00NDdhLTk2NGEtMTM4N2QyYzQ5NGE3Iiwic2lkIjoiN2U0ZDYwMGQtNDYwOC00MGY3LTkxNDYtNjQ3MzMyNGExODRlIn0.0hngHJs7Iyxb8JWRQfOEJ_cNUCFiqAk2L21YXo-Q3Ao",
  "access_expires_at": "2026-10-30T15:49:54.355690393Z",
  "refresh_token": "5y_uxdeOTUTjc1GzDI17fjWkYy2tafomIxJ23B8XWFk",
  "refresh_expires_at": "2026-10-31T03:34:54.355184993Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/19a630fb-af19-4685-9e82-6b3d409d708a/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
      "author_type": "RIDER",
      "author_id": "89497839-3cc9-4f8d-9763-8b90526e5cb0",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T15:34:52.55498Z"
    },
    {
      "order_id": "19a630fb-af19-4685-9e82-6b3d409d708a",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "89497839-3cc9-4f8d-9763-8b90526e5cb0",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T15:34:52.86568Z"
    }
  ]
}
```

Done: ratings for order 19a630fb-af19-4685-9e82-6b3d409d708a.

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
  "session_id": "3f09589f-54ac-4b03-ae68-398dc8e00545",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzUzOTUsImlhdCI6MTc5MzM3NDQ5NSwianRpIjoiZDgzNzUxNTYtOWM3Yi00NTI2LTk3Y2MtZTgxYWMzMWZlN2M5Iiwic2lkIjoiM2YwOTU4OWYtNTRhYy00YjAzLWFlNjgtMzk4ZGM4ZTAwNTQ1In0.hUvrxKobSTx3KgOTfwTQqz5sfLRyhGGBoJrCFVbEHTs",
  "access_expires_at": "2026-10-30T15:49:55.252257029Z",
  "refresh_token": "ntSFo01tUl78wBaG2dO0vZnfaJV4wAve85GdQUlZoGs",
  "refresh_expires_at": "2026-10-31T03:34:55.251732238Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "e82d4f70-f1a5-46ba-a76e-34956d6457b0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "b6335743-f405-43ae-a6dd-d623373be62c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:34:55.53794Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b6335743-f405-43ae-a6dd-d623373be62c` → **200**

```json
{
  "id": "b6335743-f405-43ae-a6dd-d623373be62c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:34:55.53794Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b6335743-f405-43ae-a6dd-d623373be62c` → **200**

```json
{
  "id": "b6335743-f405-43ae-a6dd-d623373be62c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:34:55.53794Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b6335743-f405-43ae-a6dd-d623373be62c` → **200**

```json
{
  "id": "b6335743-f405-43ae-a6dd-d623373be62c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:34:55.53794Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b6335743-f405-43ae-a6dd-d623373be62c` → **200**

```json
{
  "id": "b6335743-f405-43ae-a6dd-d623373be62c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:34:55.53794Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b6335743-f405-43ae-a6dd-d623373be62c` → **200**

```json
{
  "id": "b6335743-f405-43ae-a6dd-d623373be62c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T15:34:55.53794Z",
  "ready_at": "2026-10-30T15:35:00.248869Z",
  "expires_at": "2026-10-31T15:35:00.248869Z"
}
```

`GET /api/admin/v1/reports/exports/b6335743-f405-43ae-a6dd-d623373be62c/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "cc9aae21-8b27-475e-a118-6a1e11e77990",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "5d50d3f9-90c9-4832-83c3-1681fc846ab6",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:35:01.278485Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5d50d3f9-90c9-4832-83c3-1681fc846ab6` → **200**

```json
{
  "id": "5d50d3f9-90c9-4832-83c3-1681fc846ab6",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:35:01.278485Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5d50d3f9-90c9-4832-83c3-1681fc846ab6` → **200**

```json
{
  "id": "5d50d3f9-90c9-4832-83c3-1681fc846ab6",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:35:01.278485Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5d50d3f9-90c9-4832-83c3-1681fc846ab6` → **200**

```json
{
  "id": "5d50d3f9-90c9-4832-83c3-1681fc846ab6",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T15:35:01.278485Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5d50d3f9-90c9-4832-83c3-1681fc846ab6` → **200**

```json
{
  "id": "5d50d3f9-90c9-4832-83c3-1681fc846ab6",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T15:35:01.278485Z",
  "ready_at": "2026-10-30T15:35:05.255989Z",
  "expires_at": "2026-10-31T15:35:05.255989Z"
}
```

`GET /api/admin/v1/reports/exports/5d50d3f9-90c9-4832-83c3-1681fc846ab6/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4eb75d4a-5460-475a-b3c5-08396fdb81dd` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4eb75d4a-5460-475a-b3c5-08396fdb81dd",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f3e0e2f1-ec29-456c-9b37-cd6cb5e653c4"
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
  "session_id": "e750e48d-a6f7-4914-a09c-5043d41c77cc",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU0MDYsImlhdCI6MTc5MzM3NDUwNiwianRpIjoiNzdhMjg2NDktY2UxNy00ZmE5LWE1NDQtOWNmZjI2YmRmYzdjIiwic2lkIjoiZTc1MGU0OGQtYTZmNy00OTE0LWEwOWMtNTA0M2Q0MWM3N2NjIn0.guz-KeQIQQJioimOklOFruztP1Nzq-xSRWobqmayWM4",
  "access_expires_at": "2026-10-30T15:50:06.329082378Z",
  "refresh_token": "qXTq7z9ufse1akD5OdONHyt-EAFvLyr9cBeJRajHDvg",
  "refresh_expires_at": "2026-10-31T03:35:06.328544583Z",
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
  "command_id": "9e9df0d0-23cd-4c40-a919-da6b193b4fcd",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T15:35:06.907396785Z"
}
```

`POST /sandbox/v1/retention/fixtures/e6714261-7990-4513-a47c-ef639b3906cc` → **200**

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

`GET /sandbox/v1/retention/fixtures/e6714261-7990-4513-a47c-ef639b3906cc` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/e6714261-7990-4513-a47c-ef639b3906cc` → **204**

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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T15:35:06.907397Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "33cd1315-6659-4f2c-ba12-509aaeae7796",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T15:35:07.607308571Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-493"
}
```

```json
{
  "challenge_id": "3e3c2b0e-f1f8-4c44-96d8-77377a6909d5",
  "expires_at": "2026-10-30T15:40:07.903243976Z",
  "resend_available_at": "2026-10-30T15:35:08.903243976Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "168736",
  "sent_at": "2026-10-30T15:35:07.906051014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e3c2b0e-f1f8-4c44-96d8-77377a6909d5",
  "code": "168736",
  "device_ref": "sandbox-493"
}
```

```json
{
  "session_id": "71cc5079-5b67-48ab-ad78-c24bfc11cf1f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTQwOCwiaWF0IjoxNzkzMzc0NTA4LCJqdGkiOiJmOTU5NWQ3ZC0yNzI3LTQ2NjgtOTY5NC1jODc2OWY2YzJhNDgiLCJzaWQiOiI3MWNjNTA3OS01YjY3LTQ4YWItYWQ3OC1jMjRiZmMxMWNmMWYifQ.jDPln038yuCbKemdY3GFcQPi50NBlBo1ldpEsySzl8o",
  "access_expires_at": "2026-10-30T15:50:08.203850453Z",
  "refresh_token": "26yeeWH506jxwUxeQGRsG2cUOYnYiUyKsjytdQ8N2R0",
  "refresh_expires_at": "2026-11-29T15:35:08.203356434Z",
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
  "command_id": "bc5723c3-7a49-4d99-b0ef-85cd969d0f1e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:35:09Z",
    "sequence": 1793374509301
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "48657bba-8468-42d6-aff5-f8f278c8b179",
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
  "last_heartbeat_at": "2026-10-30T15:35:09.046173Z",
  "last_location_at": "2026-10-30T15:35:09.046173Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "6f7ddffb-c4e5-44a2-bb37-70c1e4a82331",
  "points": [
    {
      "sequence": 1793374511324,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T15:34:11Z"
    },
    {
      "sequence": 1793374511331,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T15:35:11Z"
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
  "session_id": "7c53dbc1-b357-48fb-9bee-5a86a875c205",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU0MTEsImlhdCI6MTc5MzM3NDUxMSwianRpIjoiZTc5ZDEzOGYtZTQzYi00NWUwLTlhMDAtNTkyYThkYjZiYWY4Iiwic2lkIjoiN2M1M2RiYzEtYjM1Ny00OGZiLTliZWUtNWE4NmE4NzVjMjA1In0.4xCyh44HUVFX6aTnwCW05aRfWOSn2imwBCX2bWhZxKk",
  "access_expires_at": "2026-10-30T15:50:11.966966905Z",
  "refresh_token": "7GdXgMyy30EuQqRuOHNlzkG3i8EqAuP_YYjXQRXGr7A",
  "refresh_expires_at": "2026-10-31T03:35:11.966383672Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "d11c707f-6264-4c49-9edc-36d0f2662fc3",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T15:35:11Z",
        "track_point_id": "070b2b59-f144-4e37-88e0-7e18eeb23e19",
        "work_session_id": "48657bba-8468-42d6-aff5-f8f278c8b179"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T15:35:11Z",
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

`POST /api/admin/v1/driver-risk-flags/d11c707f-6264-4c49-9edc-36d0f2662fc3/confirm` → **200**

```json
{
  "command_id": "7d670a14-7abe-4de6-a3e5-51fa2a0a4696",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "d11c707f-6264-4c49-9edc-36d0f2662fc3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T15:35:11Z",
    "track_point_id": "070b2b59-f144-4e37-88e0-7e18eeb23e19",
    "work_session_id": "48657bba-8468-42d6-aff5-f8f278c8b179"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T15:35:11Z",
  "reason": null,
  "reviewed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reviewed_at": "2026-10-30T15:35:12.85821Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/d11c707f-6264-4c49-9edc-36d0f2662fc3/dismiss` → **409**

```json
{
  "command_id": "fc92e8da-b332-4b3d-bc4f-f27fefff89be",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/d11c707f-6264-4c49-9edc-36d0f2662fc3/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1e5aa1f6-b6c5-4358-9b10-6fd11d5a3d40"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "244b8f52-15b4-4f78-915e-8c7d5b08a9a1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "04f8c476-197d-417e-9dd2-e754307dc101",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "raised_at": "2026-10-30T15:35:13.438839Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/04f8c476-197d-417e-9dd2-e754307dc101/dismiss` → **200**

```json
{
  "command_id": "ebfdd5eb-be8f-4016-a235-ccfd42d3a5b6",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "04f8c476-197d-417e-9dd2-e754307dc101",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "raised_at": "2026-10-30T15:35:13.438839Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reviewed_at": "2026-10-30T15:35:13.72082Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "42ccb2c6-b25d-4d8b-83e2-69862fddd51e",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "d11c707f-6264-4c49-9edc-36d0f2662fc3"
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
      "actor_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:35:14.015949Z"
    }
  ],
  "duplicates": []
}
```

Done: flag d11c707f-6264-4c49-9edc-36d0f2662fc3 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "80535ee3-3605-440c-8fed-bc8b16d4a564",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU0MTQsImlhdCI6MTc5MzM3NDUxNCwianRpIjoiNDcxYjczOWMtYTg1Zi00OTkyLTllZDktNzg1NmVjMGNlZGY3Iiwic2lkIjoiODA1MzVlZTMtMzYwNS00NDBjLThmZWQtYmM4YjE2ZDRhNTY0In0.AcWObpt8wdv06IfFV-5RKFYJnysKYAoJLFVvI-1wYLU",
  "access_expires_at": "2026-10-30T15:50:14.894531253Z",
  "refresh_token": "gAREcCQTu4ChOPhFsIc8V8nW5YG0ihhwnOwG1yFS12A",
  "refresh_expires_at": "2026-10-31T03:35:14.89406234Z",
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
      "actor_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:35:14.015949Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "4be8b2b6-9714-4105-8e9b-757781a2c2eb",
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
  "session_id": "48657bba-8468-42d6-aff5-f8f278c8b179",
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
  "last_heartbeat_at": "2026-10-30T15:35:09.046173Z",
  "last_location_at": "2026-10-30T15:35:09.046173Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/48657bba-8468-42d6-aff5-f8f278c8b179/close` → **200**

```json
{
  "command_id": "6254bed8-799b-4d4d-8726-f98ed04e0219",
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
  "session_id": "4eaeeda3-c13d-4ef7-bd4b-e1fd2ce6a5a0",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU0MTYsImlhdCI6MTc5MzM3NDUxNiwianRpIjoiYzk4YmQ4NTQtMDQ3Yy00ZDAzLWFkNWMtODZjNGE5ODVhZmM5Iiwic2lkIjoiNGVhZWVkYTMtYzEzZC00ZWY3LWJkNGItZTFmZDJjZTZhNWEwIn0.-jPfB6dDiDqN4TQpz257txQZuOiWB2KScfAgmmk4IPc",
  "access_expires_at": "2026-10-30T15:50:16.651830009Z",
  "refresh_token": "CRe1YV1pWmOjDtFlTw_RTGkLIHMZp1JjNfk3BDUV_lk",
  "refresh_expires_at": "2026-10-31T03:35:16.651282298Z",
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
  "command_id": "699bd4cb-ccfc-4475-9221-2e3612b97d5b",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T15:35:17.2316Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "699bd4cb-ccfc-4475-9221-2e3612b97d5b",
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
  "changed_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T15:35:17.2316Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48724829063",
  "device_ref": "sandbox-31857"
}
```

```json
{
  "challenge_id": "7328744e-596d-4abc-ad97-820a3a8e2ea9",
  "expires_at": "2026-10-30T15:40:17.829569681Z",
  "resend_available_at": "2026-10-30T15:35:18.829569681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48724829063` → **200**

```json
{
  "phone": "+48724829063",
  "audience": "CLIENT",
  "code": "839070",
  "sent_at": "2026-10-30T15:35:17.832056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7328744e-596d-4abc-ad97-820a3a8e2ea9",
  "code": "839070",
  "device_ref": "sandbox-31857"
}
```

```json
{
  "session_id": "0af2ca21-7a3c-4d75-9ada-6740bb98697c",
  "subject": {
    "type": "CLIENT",
    "id": "b5e55f69-0fee-4b8b-b1c7-aa202714b0bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNWU1NWY2OS0wZmVlLTRiOGItYjFjNy1hYTIwMjcxNGIwYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1NDE4LCJpYXQiOjE3OTMzNzQ1MTgsImp0aSI6ImE0YzVkNjBhLTU0NGEtNGVhNS1hZTVkLTI4ZTFhNTFiNmQ4OCIsInNpZCI6IjBhZjJjYTIxLTdhM2MtNGQ3NS05YWRhLTY3NDBiYjk4Njk3YyJ9.dhCsgldOmm43L7ijx-tzGbQ3kbGjtgdI-obJUYAQXds",
  "access_expires_at": "2026-10-30T15:50:18.13729758Z",
  "refresh_token": "HHi_vgJt_eZD8YMGS_qGQ6sNbjXY3VmFLV3Y2U2Uvms",
  "refresh_expires_at": "2026-11-29T15:35:18.136770992Z",
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
  "correlation_id": "f4151977-1573-4852-8722-d3cbfe04acd6"
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
  "device_ref": "sandbox-25431"
}
```

```json
{
  "challenge_id": "6f46d0e4-976b-4d83-9356-884f8ec82d6e",
  "expires_at": "2026-10-30T15:40:18.960890946Z",
  "resend_available_at": "2026-10-30T15:35:19.960890946Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "989247",
  "sent_at": "2026-10-30T15:35:18.96385169Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f46d0e4-976b-4d83-9356-884f8ec82d6e",
  "code": "989247",
  "device_ref": "sandbox-25431"
}
```

```json
{
  "session_id": "83d6351a-d0b5-423a-9641-a1dbde28b813",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTQxOSwiaWF0IjoxNzkzMzc0NTE5LCJqdGkiOiJlNGYzNjYzMy1kZmE3LTQ0MTMtOGY1ZS1jNjdkOGVjMTRhZjciLCJzaWQiOiI4M2Q2MzUxYS1kMGI1LTQyM2EtOTY0MS1hMWRiZGUyOGI4MTMifQ.qGb-FdDbp74BWpDlm9HHHnSfs3Em9I6eOMbTQbRK6jE",
  "access_expires_at": "2026-10-30T15:50:19.261946837Z",
  "refresh_token": "Bg7jL-TFQ2_Xi1OGfQ1ulXSV5C28t-U_LfHyc4T8ilc",
  "refresh_expires_at": "2026-11-29T15:35:19.261423754Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6676c1ec-4d0b-4597-9330-272d8c6c18ed",
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
  "last_heartbeat_at": "2026-10-30T15:33:56.630209Z",
  "last_location_at": "2026-10-30T15:33:56.630209Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6676c1ec-4d0b-4597-9330-272d8c6c18ed/handover` → **200**

```json
{
  "command_id": "55ac8bfe-b67e-4259-939b-6eebe8e3675f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6676c1ec-4d0b-4597-9330-272d8c6c18ed",
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
  "last_heartbeat_at": "2026-10-30T15:33:56.630209Z",
  "last_location_at": "2026-10-30T15:33:56.630209Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6676c1ec-4d0b-4597-9330-272d8c6c18ed/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:35:20Z",
    "sequence": 1793374520960
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6676c1ec-4d0b-4597-9330-272d8c6c18ed",
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
  "last_heartbeat_at": "2026-10-30T15:35:20.112073Z",
  "last_location_at": "2026-10-30T15:35:20.112073Z",
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
  "session_id": "6676c1ec-4d0b-4597-9330-272d8c6c18ed",
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
  "last_heartbeat_at": "2026-10-30T15:35:20.112073Z",
  "last_location_at": "2026-10-30T15:35:20.112073Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6676c1ec-4d0b-4597-9330-272d8c6c18ed/close` → **200**

```json
{
  "command_id": "2e1fb39a-7d70-4111-9378-0a7f1aaf49b2",
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
  "correlation_id": "1cbad2a6-a085-4a45-b080-2d666f15b616"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670593004",
  "device_ref": "sandbox-6529"
}
```

```json
{
  "challenge_id": "aa04b90c-05e7-4848-a50a-e672ceb72288",
  "expires_at": "2026-10-30T15:40:21.520559879Z",
  "resend_available_at": "2026-10-30T15:35:22.520559879Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670593004` → **200**

```json
{
  "phone": "+380670593004",
  "audience": "CLIENT",
  "code": "996294",
  "sent_at": "2026-10-30T15:35:21.522997731Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa04b90c-05e7-4848-a50a-e672ceb72288",
  "code": "996294",
  "device_ref": "sandbox-6529"
}
```

```json
{
  "session_id": "4ebe26ee-796d-4dca-a778-4ad4a7ee1ccf",
  "subject": {
    "type": "CLIENT",
    "id": "5d027f52-3ff8-41f4-b0f8-6d991517a042"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZDAyN2Y1Mi0zZmY4LTQxZjQtYjBmOC02ZDk5MTUxN2EwNDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1NDIxLCJpYXQiOjE3OTMzNzQ1MjEsImp0aSI6IjY5OWI0M2Q5LTY2MGMtNGNhNS1hOGQwLWY5N2QxNjA1YTY5YyIsInNpZCI6IjRlYmUyNmVlLTc5NmQtNGRjYS1hNzc4LTRhZDRhN2VlMWNjZiJ9.u_xFBQy-jwLv-lPOEmVgku3fqT9umDsYtR951YQbZa0",
  "access_expires_at": "2026-10-30T15:50:21.823747074Z",
  "refresh_token": "p5ObOdcdOObU-IUzfebCl8FN_hsvRONiCFog2vNwUdM",
  "refresh_expires_at": "2026-11-29T15:35:21.823230689Z",
  "account_created": true
}
```

## The EICAR antivirus test file is refused by the antivirus

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "b4ebaadc-26bd-40c3-9e42-3575bbd65975",
  "content_type": "application/pdf",
  "size_bytes": 86
}
```

```json
{
  "file_id": "c625161d-3902-4d7c-adb6-5d69e99cffb7",
  "upload_path": "/api/rider/v1/uploads/c625161d-3902-4d7c-adb6-5d69e99cffb7",
  "expires_at": "2026-10-30T15:50:22.118379804Z",
  "max_bytes": 86
}
```

`PUT /api/rider/v1/uploads/c625161d-3902-4d7c-adb6-5d69e99cffb7` → **200**

```json
{
  "file_id": "c625161d-3902-4d7c-adb6-5d69e99cffb7",
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
  "command_id": "b2acbc76-d1d4-4c34-b37f-a25c5ec58107",
  "content_type": "application/pdf",
  "size_bytes": 92
}
```

```json
{
  "file_id": "5a5416aa-15a2-4d8a-a678-0a65b0e47de2",
  "upload_path": "/api/rider/v1/uploads/5a5416aa-15a2-4d8a-a678-0a65b0e47de2",
  "expires_at": "2026-10-30T15:50:22.429334682Z",
  "max_bytes": 92
}
```

`PUT /api/rider/v1/uploads/5a5416aa-15a2-4d8a-a678-0a65b0e47de2` → **200**

```json
{
  "file_id": "5a5416aa-15a2-4d8a-a678-0a65b0e47de2",
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
  "command_id": "0584e0ce-97d2-41f9-94ae-994767324c37",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "59c5a46e-fa7e-4aec-b169-7747522c498b",
  "upload_path": "/api/rider/v1/uploads/59c5a46e-fa7e-4aec-b169-7747522c498b",
  "expires_at": "2026-10-30T15:50:22.747568593Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/59c5a46e-fa7e-4aec-b169-7747522c498b` → **200**

```json
{
  "file_id": "59c5a46e-fa7e-4aec-b169-7747522c498b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "1c0e067d-5cdf-4438-87cc-84c749d89326",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "59c5a46e-fa7e-4aec-b169-7747522c498b"
  ]
}
```

```json
{
  "id": "04103b82-e356-4145-b9e8-9d44133922ea",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5d027f52-3ff8-41f4-b0f8-6d991517a042",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T15:35:23.064728Z",
  "updated_at": "2026-10-30T15:35:23.064728Z",
  "respond_by": "2026-10-30T19:35:23.064728Z",
  "messages": [
    {
      "id": "f50e39f0-9c12-4a55-ab9c-a85fe65f071f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5d027f52-3ff8-41f4-b0f8-6d991517a042",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:35:23.065741Z",
      "attachments": [
        {
          "file_id": "59c5a46e-fa7e-4aec-b169-7747522c498b",
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
  "session_id": "6ad4fe2f-ea38-49aa-a01b-b87b23f069b1",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU0MjMsImlhdCI6MTc5MzM3NDUyMywianRpIjoiZTRjZjg5MDctYzQxNS00ODc4LWE2YTEtODQyMTc2YzA5YTA1Iiwic2lkIjoiNmFkNGZlMmYtZWEzOC00OWFhLWEwMWItYjg3YjIzZjA2OWIxIn0.Y1FwyrIXuuTp7bYOI7FczdjPZZOZR3liVMI9p-9wF-c",
  "access_expires_at": "2026-10-30T15:50:23.688960882Z",
  "refresh_token": "5nEODOzqdVetJVuEmpeRZHiIUKIbvMJG6E2zYB_tCys",
  "refresh_expires_at": "2026-10-31T03:35:23.688361818Z",
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
  "session_id": "79644442-511b-4d91-a3e3-c11220d80a69",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU0MjQsImlhdCI6MTc5MzM3NDUyNCwianRpIjoiYTA3YmUxZDYtNTQ5Ni00MjIzLWJkMTgtODYyMDdkYmQ1Y2RjIiwic2lkIjoiNzk2NDQ0NDItNTExYi00ZDkxLWEzZTMtYzExMjIwZDgwYTY5In0.GlYvkktqX2VtzObg56GUnYaiZPdXepCurtPOOy5yAMg",
  "access_expires_at": "2026-10-30T15:50:24.282743294Z",
  "refresh_token": "0W5H8VLfive-TRl6k0f7GbGeoZTx7iV5pRga7xd87qA",
  "refresh_expires_at": "2026-10-31T03:35:24.282282441Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/04103b82-e356-4145-b9e8-9d44133922ea/attachments/59c5a46e-fa7e-4aec-b169-7747522c498b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "f5aa2843-fce3-45a7-8c77-9262a25f9b14",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5da25b67-f436-4e1a-9e8e-5266ed88e5ca",
  "upload_path": "/api/operator/v1/uploads/5da25b67-f436-4e1a-9e8e-5266ed88e5ca",
  "expires_at": "2026-10-30T15:50:24.576882216Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5da25b67-f436-4e1a-9e8e-5266ed88e5ca` → **200**

```json
{
  "file_id": "5da25b67-f436-4e1a-9e8e-5266ed88e5ca",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/04103b82-e356-4145-b9e8-9d44133922ea` → **200**

```json
{
  "id": "04103b82-e356-4145-b9e8-9d44133922ea",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5d027f52-3ff8-41f4-b0f8-6d991517a042",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T15:35:23.064728Z",
  "updated_at": "2026-10-30T15:35:23.064728Z",
  "respond_by": "2026-10-30T19:35:23.064728Z",
  "messages": [
    {
      "id": "f50e39f0-9c12-4a55-ab9c-a85fe65f071f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5d027f52-3ff8-41f4-b0f8-6d991517a042",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:35:23.065741Z",
      "attachments": [
        {
          "file_id": "59c5a46e-fa7e-4aec-b169-7747522c498b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/04103b82-e356-4145-b9e8-9d44133922ea/comments` → **200**

```json
{
  "command_id": "11dc492d-d45b-4b95-b673-d2e9a881d257",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5da25b67-f436-4e1a-9e8e-5266ed88e5ca"
  ]
}
```

```json
{
  "id": "04103b82-e356-4145-b9e8-9d44133922ea",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5d027f52-3ff8-41f4-b0f8-6d991517a042",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T15:35:23.064728Z",
  "updated_at": "2026-10-30T15:35:25.187298Z",
  "respond_by": "2026-10-30T19:35:23.064728Z",
  "messages": [
    {
      "id": "f50e39f0-9c12-4a55-ab9c-a85fe65f071f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5d027f52-3ff8-41f4-b0f8-6d991517a042",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:35:23.065741Z",
      "attachments": [
        {
          "file_id": "59c5a46e-fa7e-4aec-b169-7747522c498b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b3d3681b-c06b-435e-8add-4c0bdcebc75d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T15:35:25.186722Z",
      "attachments": [
        {
          "file_id": "5da25b67-f436-4e1a-9e8e-5266ed88e5ca",
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

`GET /api/rider/v1/support/cases/04103b82-e356-4145-b9e8-9d44133922ea` → **200**

```json
{
  "id": "04103b82-e356-4145-b9e8-9d44133922ea",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5d027f52-3ff8-41f4-b0f8-6d991517a042",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T15:35:23.064728Z",
  "updated_at": "2026-10-30T15:35:25.187298Z",
  "respond_by": "2026-10-30T19:35:23.064728Z",
  "messages": [
    {
      "id": "f50e39f0-9c12-4a55-ab9c-a85fe65f071f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5d027f52-3ff8-41f4-b0f8-6d991517a042",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T15:35:23.065741Z",
      "attachments": [
        {
          "file_id": "59c5a46e-fa7e-4aec-b169-7747522c498b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "b3d3681b-c06b-435e-8add-4c0bdcebc75d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T15:35:25.186722Z",
      "attachments": [
        {
          "file_id": "5da25b67-f436-4e1a-9e8e-5266ed88e5ca",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/04103b82-e356-4145-b9e8-9d44133922ea/attachments/5da25b67-f436-4e1a-9e8e-5266ed88e5ca` → **200**

Done: support case 04103b82-e356-4145-b9e8-9d44133922ea, rider attachment 59c5a46e-fa7e-4aec-b169-7747522c498b, operator attachment 5da25b67-f436-4e1a-9e8e-5266ed88e5ca.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739285511",
  "device_ref": "sandbox-20874"
}
```

```json
{
  "challenge_id": "ce7e0f66-5152-49cf-840d-81ad8078a7ee",
  "expires_at": "2026-10-30T15:40:25.792864481Z",
  "resend_available_at": "2026-10-30T15:35:26.792864481Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739285511` → **200**

```json
{
  "phone": "+380739285511",
  "audience": "CLIENT",
  "code": "324107",
  "sent_at": "2026-10-30T15:35:25.796916671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce7e0f66-5152-49cf-840d-81ad8078a7ee",
  "code": "324107",
  "device_ref": "sandbox-20874"
}
```

```json
{
  "session_id": "aa0bbfe8-c9f5-4d28-bf89-5d84f8aed0bc",
  "subject": {
    "type": "CLIENT",
    "id": "7d309317-c88c-4850-a9bc-254a7520a1f5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDMwOTMxNy1jODhjLTQ4NTAtYTliYy0yNTRhNzUyMGExZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1NDI2LCJpYXQiOjE3OTMzNzQ1MjYsImp0aSI6IjUxNGQ5MzFmLTA1NzQtNDRiYi04NmIxLTM0N2M4MzgzNmM2YyIsInNpZCI6ImFhMGJiZmU4LWM5ZjUtNGQyOC1iZjg5LTVkODRmOGFlZDBiYyJ9.j-8qcgnGKxTCgvqsf8gTsfXCgiZqR9PuinkcIePv7Uo",
  "access_expires_at": "2026-10-30T15:50:26.101217504Z",
  "refresh_token": "sYhNJ5IlTUSbYMQqCsKdy_Do3gFOFo4KBdZMP3aqYhY",
  "refresh_expires_at": "2026-11-29T15:35:26.100686087Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "82c5627e-fda2-4455-a3f3-472ee4b0dc0a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "4a6209a4-b002-4e5e-8143-46ecd6f3dfec",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-4a6209a4-b002-4e5e-8143-46ecd6f3dfec",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e4ad2d17ae173f2dcf6ff615078f2813",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=4a6209a4-b002-4e5e-8143-46ecd6f3dfec",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739285511"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=4a6209a4-b002-4e5e-8143-46ecd6f3dfec",
  "expires_at": "2026-10-30T16:05:26.380967Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/4a6209a4-b002-4e5e-8143-46ecd6f3dfec` → **200**

```json
{
  "id": "4a6209a4-b002-4e5e-8143-46ecd6f3dfec",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T16:05:26.380967Z",
  "card": {
    "id": "6b767b9f-6bb4-4aba-a9c4-8c871c35fc3b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1674",
    "card_type": "Visa",
    "created_at": "2026-10-30T15:35:26.660921Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b5d9a916-2428-4960-880f-d7bb9bd30a47",
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
  "id": "b79ab4c3-26e8-45df-ac98-636b0c957f32",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:40:26.960156Z",
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
  "command_id": "440a7a61-dc8e-4701-9250-9b58c71b65c7",
  "quote_id": "b79ab4c3-26e8-45df-ac98-636b0c957f32",
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
  "id": "9f419849-7f9e-4f95-9e72-24c7834e3350",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7d309317-c88c-4850-a9bc-254a7520a1f5",
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
  "created_at": "2026-10-30T15:35:27.258698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9f419849-7f9e-4f95-9e72-24c7834e3350` → **200**

```json
{
  "id": "9f419849-7f9e-4f95-9e72-24c7834e3350",
  "short_number": 27,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7d309317-c88c-4850-a9bc-254a7520a1f5",
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
  "created_at": "2026-10-30T15:35:27.258698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9f419849-7f9e-4f95-9e72-24c7834e3350` → **200**

```json
{
  "id": "9f419849-7f9e-4f95-9e72-24c7834e3350",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7d309317-c88c-4850-a9bc-254a7520a1f5",
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
  "created_at": "2026-10-30T15:35:27.258698Z",
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

`GET /api/rider/v1/orders/9f419849-7f9e-4f95-9e72-24c7834e3350` → **200**

```json
{
  "id": "9f419849-7f9e-4f95-9e72-24c7834e3350",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7d309317-c88c-4850-a9bc-254a7520a1f5",
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
  "created_at": "2026-10-30T15:35:27.258698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9f419849-7f9e-4f95-9e72-24c7834e3350/switch-to-cash` → **200**

```json
{
  "command_id": "a32b32af-67f9-4a39-83f2-940081c95320",
  "expected_version": 3
}
```

```json
{
  "id": "9f419849-7f9e-4f95-9e72-24c7834e3350",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7d309317-c88c-4850-a9bc-254a7520a1f5",
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
  "created_at": "2026-10-30T15:35:27.258698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9f419849-7f9e-4f95-9e72-24c7834e3350/switch-to-cash` → **409**

```json
{
  "command_id": "c7925ac0-df28-4166-95ab-f7e820a02b50",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/9f419849-7f9e-4f95-9e72-24c7834e3350/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "10b75388-0415-4188-b6f2-f70b2f6d8261"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/9f419849-7f9e-4f95-9e72-24c7834e3350` → **200**

```json
{
  "id": "9f419849-7f9e-4f95-9e72-24c7834e3350",
  "short_number": 27,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "7d309317-c88c-4850-a9bc-254a7520a1f5",
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
  "created_at": "2026-10-30T15:35:27.258698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9f419849-7f9e-4f95-9e72-24c7834e3350/cancel` → **200**

```json
{
  "command_id": "a433f14a-d88f-4a5c-beed-ced93fe1c199",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9f419849-7f9e-4f95-9e72-24c7834e3350",
  "short_number": 27,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7d309317-c88c-4850-a9bc-254a7520a1f5",
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
  "created_at": "2026-10-30T15:35:27.258698Z",
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
  "session_id": "18ea31a9-9ee5-4b50-bd0f-cabd038a377a",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU0MzAsImlhdCI6MTc5MzM3NDUzMCwianRpIjoiYTFiYTI3NDgtOTdlYy00NDE4LTk3OWEtZmJiZDMwNDdjZTUzIiwic2lkIjoiMThlYTMxYTktOWVlNS00YjUwLWJkMGYtY2FiZDAzOGEzNzdhIn0.Qd1O76h1fg-YJLTjBIIZDSooSVbVg7j8PT8pmZ53Q6I",
  "access_expires_at": "2026-10-30T15:50:30.924843974Z",
  "refresh_token": "twRUKq9x3jluLS5LiLkU4Oq_9TUmUb6Gl3hU8elq-ms",
  "refresh_expires_at": "2026-10-31T03:35:30.923940829Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9795"
}
```

```json
{
  "challenge_id": "cabe396f-ce3c-4033-80d8-687654e8f21a",
  "expires_at": "2026-10-30T15:40:31.193027064Z",
  "resend_available_at": "2026-10-30T15:35:32.193027064Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "550541",
  "sent_at": "2026-10-30T15:35:31.19554777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cabe396f-ce3c-4033-80d8-687654e8f21a",
  "code": "550541",
  "device_ref": "sandbox-9795"
}
```

```json
{
  "session_id": "160ff64b-3f94-4cb5-be7a-b0ff527b9df6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTQzMSwiaWF0IjoxNzkzMzc0NTMxLCJqdGkiOiI0NTNkYWU3NS0yY2Y4LTQ3ZWUtOGUyNi02YTRiMjVkMGRiZDkiLCJzaWQiOiIxNjBmZjY0Yi0zZjk0LTRjYjUtYmU3YS1iMGZmNTI3YjlkZjYifQ.0HPdx7MLXhtWRbsIgWrH1S4EzG1qBYrWvs33ykxdhCo",
  "access_expires_at": "2026-10-30T15:50:31.490697164Z",
  "refresh_token": "MtGKOpZXff1sYtbY5s9HCZp5LwklOodjoZw_VjIpbOw",
  "refresh_expires_at": "2026-11-29T15:35:31.490253545Z",
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
      "actor_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T15:35:14.015949Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T15:35:15.468787Z"
    }
  ],
  "duplicates": []
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "83a1a403-d1ef-48fc-bb9b-a6ea8d184b04",
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
  "device_ref": "sandbox-8507"
}
```

```json
{
  "challenge_id": "613512ef-cd30-4766-b711-0235f332aa98",
  "expires_at": "2026-10-30T15:40:32.606749272Z",
  "resend_available_at": "2026-10-30T15:35:33.606749272Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "957193",
  "sent_at": "2026-10-30T15:35:32.609228481Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "613512ef-cd30-4766-b711-0235f332aa98",
  "code": "957193",
  "device_ref": "sandbox-8507"
}
```

```json
{
  "session_id": "4babdb74-17eb-4997-b3b4-23f1c8255ef9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTQzMiwiaWF0IjoxNzkzMzc0NTMyLCJqdGkiOiI4ODY0Zjg4Mi0yMjA4LTQyNjgtOWMyNC00M2UzZDRmMWQ4MTQiLCJzaWQiOiI0YmFiZGI3NC0xN2ViLTQ5OTctYjNiNC0yM2YxYzgyNTVlZjkifQ.YJ8lhtF5YXPj1n4iuFiFwIlLLrYyCn2Qg1iBa9bhN2o",
  "access_expires_at": "2026-10-30T15:50:32.926536095Z",
  "refresh_token": "5IkRUchqcZBiDwcAJGJYGdlrYIQsK7phaBhOLp1nimU",
  "refresh_expires_at": "2026-11-29T15:35:32.926091502Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77331cba-8549-4019-989f-97d47ba6a208",
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
  "last_heartbeat_at": "2026-10-30T15:34:51.946533Z",
  "last_location_at": "2026-10-30T15:34:51.946533Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/77331cba-8549-4019-989f-97d47ba6a208/handover` → **200**

```json
{
  "command_id": "5e123f83-4a5a-45bd-8d0b-a157d1898300",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77331cba-8549-4019-989f-97d47ba6a208",
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
  "last_heartbeat_at": "2026-10-30T15:34:51.946533Z",
  "last_location_at": "2026-10-30T15:34:51.946533Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

(the car drives 7 s to the next point)

`POST /api/driver/v1/work-sessions/77331cba-8549-4019-989f-97d47ba6a208/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:35:40Z",
    "sequence": 1793374540785
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "77331cba-8549-4019-989f-97d47ba6a208",
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
  "last_heartbeat_at": "2026-10-30T15:35:40.802268Z",
  "last_location_at": "2026-10-30T15:35:40.802268Z",
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
  "command_id": "94dd3eb6-73f2-4953-ab7c-ed40c50eb275",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:35:41Z",
    "sequence": 1793374541368
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3e8ab3c1-3734-4fe2-aa79-c4d3b8197770",
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
  "last_heartbeat_at": "2026-10-30T15:35:41.385009Z",
  "last_location_at": "2026-10-30T15:35:41.385009Z",
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
  "session_id": "ddaef2b4-295c-4c6a-ba51-c0daa8096d2c",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU0NDEsImlhdCI6MTc5MzM3NDU0MSwianRpIjoiZmU3NzRlNjUtZGUzNC00YmZmLTljM2QtZjc5ZjM2OTQ4YjIzIiwic2lkIjoiZGRhZWYyYjQtMjk1Yy00YzZhLWJhNTEtYzBkYWE4MDk2ZDJjIn0.N7xwRRN-KeCTLGz_4XL3sa3Yyjm93fIsnmS9nnZgR-E",
  "access_expires_at": "2026-10-30T15:50:41.986201705Z",
  "refresh_token": "zlTUatNnVMjBMB3eqKMm5j9-vSpyDBjA1MmoaK3vLLI",
  "refresh_expires_at": "2026-10-31T03:35:41.985575124Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7339a591-a51b-42d6-b1d0-afbd9cb8f33b",
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
  "id": "0f0542d0-124d-474a-88ae-9833fb17c139",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:40:42.263984Z",
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
  "command_id": "394bcd88-73ca-4a3e-8bf2-72df01b4360f",
  "quote_id": "0f0542d0-124d-474a-88ae-9833fb17c139",
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
  "id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
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
  "created_at": "2026-10-30T15:35:42.553564Z",
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
    "id": "c0c477c5-2264-444e-a05c-f64aefd7f6ce",
    "order_id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
    "expires_at": "2026-10-30T15:35:57.557522Z",
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

`POST /api/driver/v1/offers/c0c477c5-2264-444e-a05c-f64aefd7f6ce/accept` → **200**

```json
{
  "command_id": "0bc2cf71-4f8e-41cc-8872-c54b34ccde72"
}
```

```json
{
  "id": "2af510bb-c2eb-4cd3-a171-29f63219f301",
  "order_id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "72d67773-eba5-49c2-8db3-e9b8025d942d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "72d67773-eba5-49c2-8db3-e9b8025d942d",
  "order_id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
  "assignment_id": "2af510bb-c2eb-4cd3-a171-29f63219f301",
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

`POST /api/driver/v1/work-sessions/3e8ab3c1-3734-4fe2-aa79-c4d3b8197770/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T15:35:53Z",
    "sequence": 1793374553989
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3e8ab3c1-3734-4fe2-aa79-c4d3b8197770",
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
  "last_heartbeat_at": "2026-10-30T15:35:54.00649Z",
  "last_location_at": "2026-10-30T15:35:54.00649Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ],
  "accepted": true
}
```

`POST /api/driver/v1/trips/72d67773-eba5-49c2-8db3-e9b8025d942d/arrive` → **200**

```json
{
  "command_id": "26b6266c-82b8-40d4-b6dc-c46a671e8385",
  "expected_version": 0
}
```

```json
{
  "id": "72d67773-eba5-49c2-8db3-e9b8025d942d",
  "order_id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
  "assignment_id": "2af510bb-c2eb-4cd3-a171-29f63219f301",
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
  "arrived_at": "2026-10-30T15:35:54.302448Z",
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

`POST /api/driver/v1/trips/72d67773-eba5-49c2-8db3-e9b8025d942d/start` → **200**

```json
{
  "command_id": "d48efd05-251a-4c2c-8872-8194e52d8062",
  "expected_version": 1
}
```

```json
{
  "id": "72d67773-eba5-49c2-8db3-e9b8025d942d",
  "order_id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
  "assignment_id": "2af510bb-c2eb-4cd3-a171-29f63219f301",
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
  "arrived_at": "2026-10-30T15:35:54.302448Z",
  "started_at": "2026-10-30T15:35:54.594285Z",
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

`POST /api/driver/v1/trips/72d67773-eba5-49c2-8db3-e9b8025d942d/complete` → **200**

```json
{
  "command_id": "b35cfa70-0610-4709-8f9b-e0e8289e00d6",
  "expected_version": 2,
  "reported_at": "2026-10-30T15:35:54Z",
  "cash_received": true
}
```

```json
{
  "id": "72d67773-eba5-49c2-8db3-e9b8025d942d",
  "order_id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
  "assignment_id": "2af510bb-c2eb-4cd3-a171-29f63219f301",
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
  "arrived_at": "2026-10-30T15:35:54.302448Z",
  "started_at": "2026-10-30T15:35:54.594285Z",
  "completed_at": "2026-10-30T15:35:54.883695Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/f9f13c6e-acc8-4dc2-8c10-52bc6807530e` → **200**

```json
{
  "id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
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
    "id": "2af510bb-c2eb-4cd3-a171-29f63219f301",
    "order_id": "f9f13c6e-acc8-4dc2-8c10-52bc6807530e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "72d67773-eba5-49c2-8db3-e9b8025d942d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T15:35:42.553564Z",
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
  "session_id": "77331cba-8549-4019-989f-97d47ba6a208",
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
  "last_heartbeat_at": "2026-10-30T15:35:40.802268Z",
  "last_location_at": "2026-10-30T15:35:40.802268Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/77331cba-8549-4019-989f-97d47ba6a208/close` → **200**

```json
{
  "command_id": "2d8ec62d-3369-41a6-855c-a2ae10951eb0",
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
  "session_id": "3e8ab3c1-3734-4fe2-aa79-c4d3b8197770",
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
  "last_heartbeat_at": "2026-10-30T15:35:54.00649Z",
  "last_location_at": "2026-10-30T15:35:54.00649Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3e8ab3c1-3734-4fe2-aa79-c4d3b8197770/close` → **200**

```json
{
  "command_id": "33e8f72d-1c36-4ff2-9407-685c0ed08160",
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

Done: terminal order f9f13c6e-acc8-4dc2-8c10-52bc6807530e by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12902"
}
```

```json
{
  "challenge_id": "2ebdc6f0-a06f-4c78-b489-6cb0f822e8a9",
  "expires_at": "2026-10-30T15:40:59.870864526Z",
  "resend_available_at": "2026-10-30T15:36:00.870864526Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "949286",
  "sent_at": "2026-10-30T15:35:59.873242902Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ebdc6f0-a06f-4c78-b489-6cb0f822e8a9",
  "code": "949286",
  "device_ref": "sandbox-12902"
}
```

```json
{
  "session_id": "20a07847-04c7-4331-921e-65d094a466ad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTQ2MCwiaWF0IjoxNzkzMzc0NTYwLCJqdGkiOiJkMGNkZWQzZi0yNzllLTRkNDgtYmRhMC03ODQyMjlmOGYzM2QiLCJzaWQiOiIyMGEwNzg0Ny0wNGM3LTQzMzEtOTIxZS02NWQwOTRhNDY2YWQifQ.RS8kaqAnBekCyahPrd73nHq8P_jUkOLB0VZ6weUE18A",
  "access_expires_at": "2026-10-30T15:51:00.175480139Z",
  "refresh_token": "0SurHd8QfyL0tdkvCuqSfzMkojWLnnOPh6FvEKhLQQ8",
  "refresh_expires_at": "2026-11-29T15:36:00.174975447Z",
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
  "device_ref": "sandbox-30293"
}
```

```json
{
  "challenge_id": "edba9aff-297b-4a1f-a1ec-13a4aa6425a8",
  "expires_at": "2026-10-30T15:41:00.727433282Z",
  "resend_available_at": "2026-10-30T15:36:01.727433282Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "565295",
  "sent_at": "2026-10-30T15:36:00.72955791Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "edba9aff-297b-4a1f-a1ec-13a4aa6425a8",
  "code": "565295",
  "device_ref": "sandbox-30293"
}
```

```json
{
  "session_id": "88e2e18e-5f9a-4ded-8121-f59e55138dd2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTQ2MSwiaWF0IjoxNzkzMzc0NTYxLCJqdGkiOiI3M2VlNDQ1OC01OTM3LTQwYzYtOGNhOC00MjVjZmU0ODVmMTAiLCJzaWQiOiI4OGUyZTE4ZS01ZjlhLTRkZWQtODEyMS1mNTllNTUxMzhkZDIifQ.NPszzGfojQtG8wXvigZzMUUu4lbCh5qzVUSkP6hNalk",
  "access_expires_at": "2026-10-30T15:51:01.026351962Z",
  "refresh_token": "g4ZiJCC6_JAKYL91GxzwzmxuNGN607-N1fUrmldbxdM",
  "refresh_expires_at": "2026-11-29T15:36:01.025745758Z",
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
  "device_ref": "sandbox-26866"
}
```

```json
{
  "challenge_id": "3f8e7e3d-3ff9-44b3-a841-dffad7b40f1d",
  "expires_at": "2026-10-30T15:41:01.578583152Z",
  "resend_available_at": "2026-10-30T15:36:02.578583152Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "826237",
  "sent_at": "2026-10-30T15:36:01.581727621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3f8e7e3d-3ff9-44b3-a841-dffad7b40f1d",
  "code": "826237",
  "device_ref": "sandbox-26866"
}
```

```json
{
  "session_id": "5c882d75-302b-4127-8bd1-783f96d52cf9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM3NTQ2MSwiaWF0IjoxNzkzMzc0NTYxLCJqdGkiOiI5YTQ4ZmE0My0wZDA4LTRmMzgtOWI3Zi05OWExZGJlMjM3NTYiLCJzaWQiOiI1Yzg4MmQ3NS0zMDJiLTQxMjctOGJkMS03ODNmOTZkNTJjZjkifQ.E7Cyg9tTWdl6FpAlUPGeoKON9JPfs2WVbF50Vhv0VTg",
  "access_expires_at": "2026-10-30T15:51:01.880794135Z",
  "refresh_token": "38lxLlQfQ9xkniHvWprkDdLvRBmXdBNre2qUerGZNaQ",
  "refresh_expires_at": "2026-11-29T15:36:01.880262099Z",
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
  "phone": "+380690969771",
  "device_ref": "sandbox-14998"
}
```

```json
{
  "challenge_id": "dea1efc6-6662-4548-9db3-383cb7261838",
  "expires_at": "2026-10-30T15:41:02.42975711Z",
  "resend_available_at": "2026-10-30T15:36:03.42975711Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380690969771` → **200**

```json
{
  "phone": "+380690969771",
  "audience": "CLIENT",
  "code": "825933",
  "sent_at": "2026-10-30T15:36:02.432114897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dea1efc6-6662-4548-9db3-383cb7261838",
  "code": "825933",
  "device_ref": "sandbox-14998"
}
```

```json
{
  "session_id": "52171041-f879-4609-a9bd-eaf802520d3a",
  "subject": {
    "type": "CLIENT",
    "id": "8d913317-7283-4294-8318-addbd83333cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZDkxMzMxNy03MjgzLTQyOTQtODMxOC1hZGRiZDgzMzMzY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzc1NDYyLCJpYXQiOjE3OTMzNzQ1NjIsImp0aSI6ImFhNTRjOWNlLWQxMmEtNGIwMS05ZDgzLTNhYWM2NTg5M2QxMiIsInNpZCI6IjUyMTcxMDQxLWY4NzktNDYwOS1hOWJkLWVhZjgwMjUyMGQzYSJ9.w6PH87mMzhljp4Z-DAB8SCsLggjEgqTrhc5EP7EcvGs",
  "access_expires_at": "2026-10-30T15:51:02.73056676Z",
  "refresh_token": "RUSkxOXH65vYb5W2rbT9429SK1J82dgOpYkNG6OQB5A",
  "refresh_expires_at": "2026-11-29T15:36:02.730036796Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bb4cfdae-984a-42ed-b074-b85fe139fd37",
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
  "id": "2d1f9d22-7b82-4ce8-8d2e-7c801ec36256",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T15:41:03.011468Z",
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
  "command_id": "32586cb5-8bc5-41bd-be52-0e7b64e2aa6c",
  "quote_id": "2d1f9d22-7b82-4ce8-8d2e-7c801ec36256",
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
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-30T15:36:03.308923Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:36:03.308923Z",
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
  "blizz_sms_sent_total": 78
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="BROADCAST"} 1
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="BROADCAST"} 11.386355271
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.826227653
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="BROADCAST"} 0.0
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 6.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="TOO_FAR"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.193577668
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 71.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/904bac69-a476-4743-9f04-ff612b84f292` → **200**

```json
{
  "id": "904bac69-a476-4743-9f04-ff612b84f292",
  "short_number": 29,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8d913317-7283-4294-8318-addbd83333cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T15:36:03.308923Z",
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
  "session_id": "c8bcc43e-0754-4bc6-89bb-4c69a9ef94e5",
  "subject": {
    "type": "STAFF",
    "id": "94116a77-b360-4b9c-b76e-5fc16ca14bcb"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NDExNmE3Ny1iMzYwLTRiOWMtYjc2ZS01ZmMxNmNhMTRiY2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNzU2NDQsImlhdCI6MTc5MzM3NDc0NCwianRpIjoiMzRjODNkY2ItMGM5OS00N2RlLTk1YWUtNWUxNzIwNWRhNjY0Iiwic2lkIjoiYzhiY2M0M2UtMDc1NC00YmM2LTg5YmItNGM2OWE5ZWY5NGU1In0.KkFfZJrl_apAncgTB-py_C4kJetxir_sUclI_rEPcPs",
  "access_expires_at": "2026-10-30T15:54:04.819176988Z",
  "refresh_token": "xUrDw0di0pdI2a080H_O1C6BqoU6S7Le4OBSS28EQdo",
  "refresh_expires_at": "2026-10-31T03:39:04.818326433Z",
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
  "id": "d4213057-820f-46e1-a6f4-d0450ec26f8b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:39:05.114894Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:39:05.114951Z",
  "updated_at": "2026-10-30T15:39:05.132207Z",
  "finished_at": "2026-10-30T15:39:05.132207Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/d4213057-820f-46e1-a6f4-d0450ec26f8b` → **200**

```json
{
  "run": {
    "id": "d4213057-820f-46e1-a6f4-d0450ec26f8b",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:39:05.114894Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:39:05.114951Z",
    "updated_at": "2026-10-30T15:39:05.132207Z",
    "finished_at": "2026-10-30T15:39:05.132207Z",
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
  "id": "d4213057-820f-46e1-a6f4-d0450ec26f8b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:39:05.114894Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:39:05.114951Z",
  "updated_at": "2026-10-30T15:39:05.132207Z",
  "finished_at": "2026-10-30T15:39:05.132207Z",
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
  "id": "d4213057-820f-46e1-a6f4-d0450ec26f8b",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:39:05.114894Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:39:05.114951Z",
  "updated_at": "2026-10-30T15:39:05.132207Z",
  "finished_at": "2026-10-30T15:39:05.132207Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/4e0f8add-8b67-4cac-9a8b-ce9c6c9c6c88` → **204**

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
  "id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:39:05.56682Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:39:05.566861Z",
  "updated_at": "2026-10-30T15:39:05.575805Z",
  "finished_at": "2026-10-30T15:39:05.575805Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/e680a6a5-cfbd-45fd-944b-3eb82348b3f9` → **200**

```json
{
  "run": {
    "id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:39:05.56682Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:39:05.566861Z",
    "updated_at": "2026-10-30T15:39:05.575805Z",
    "finished_at": "2026-10-30T15:39:05.575805Z",
    "version": 1
  },
  "items": [
    {
      "id": "fa439bc7-ab3d-4711-b2d4-ce9b7c428ec0",
      "run_id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "b35dc7b8cf9b8689216261c071b2e32be2697e6e837b91d1221777efca7e778a",
      "reference_display": "sandbox-reconciliation-4e0f8add-8b67-4cac-9a8b-ce9c6c9c6c88",
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
      "provider_at": "2026-10-30T15:39:05Z",
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
  "id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:39:05.56682Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:39:05.566861Z",
  "updated_at": "2026-10-30T15:39:05.575805Z",
  "finished_at": "2026-10-30T15:39:05.575805Z",
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
  "id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:39:05.56682Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:39:05.566861Z",
  "updated_at": "2026-10-30T15:39:05.575805Z",
  "finished_at": "2026-10-30T15:39:05.575805Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/fa439bc7-ab3d-4711-b2d4-ce9b7c428ec0/resolve` → **200**

```json
{
  "command_id": "412f903f-91f4-40d3-956f-073dd5e71a6f",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "fa439bc7-ab3d-4711-b2d4-ce9b7c428ec0",
  "run_id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "b35dc7b8cf9b8689216261c071b2e32be2697e6e837b91d1221777efca7e778a",
  "reference_display": "sandbox-reconciliation-4e0f8add-8b67-4cac-9a8b-ce9c6c9c6c88",
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
  "provider_at": "2026-10-30T15:39:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "resolved_at": "2026-10-30T15:39:06.006409Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/fa439bc7-ab3d-4711-b2d4-ce9b7c428ec0/resolve` → **200**

```json
{
  "command_id": "412f903f-91f4-40d3-956f-073dd5e71a6f",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "fa439bc7-ab3d-4711-b2d4-ce9b7c428ec0",
  "run_id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "b35dc7b8cf9b8689216261c071b2e32be2697e6e837b91d1221777efca7e778a",
  "reference_display": "sandbox-reconciliation-4e0f8add-8b67-4cac-9a8b-ce9c6c9c6c88",
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
  "provider_at": "2026-10-30T15:39:05Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
  "resolved_at": "2026-10-30T15:39:06.006409Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/fa439bc7-ab3d-4711-b2d4-ce9b7c428ec0/resolve` → **409**

```json
{
  "command_id": "31297dfc-98f2-4956-8ce5-fd4704ee1e81",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/fa439bc7-ab3d-4711-b2d4-ce9b7c428ec0/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d75da23d-c01a-4121-be52-6c6130d2afa3"
}
```

`GET /api/admin/v1/payment-reconciliations/e680a6a5-cfbd-45fd-944b-3eb82348b3f9` → **200**

```json
{
  "run": {
    "id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T15:39:05.56682Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T15:39:05.566861Z",
    "updated_at": "2026-10-30T15:39:06.006409Z",
    "finished_at": "2026-10-30T15:39:05.575805Z",
    "version": 2
  },
  "items": [
    {
      "id": "fa439bc7-ab3d-4711-b2d4-ce9b7c428ec0",
      "run_id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "b35dc7b8cf9b8689216261c071b2e32be2697e6e837b91d1221777efca7e778a",
      "reference_display": "sandbox-reconciliation-4e0f8add-8b67-4cac-9a8b-ce9c6c9c6c88",
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
      "provider_at": "2026-10-30T15:39:05Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "94116a77-b360-4b9c-b76e-5fc16ca14bcb",
      "resolved_at": "2026-10-30T15:39:06.006409Z",
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
      "id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T15:39:05.56682Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T15:39:05.566861Z",
      "updated_at": "2026-10-30T15:39:06.006409Z",
      "finished_at": "2026-10-30T15:39:05.575805Z",
      "version": 2
    },
    {
      "id": "2497f425-06c0-461e-8450-a764a9e0102d",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T15:19:54.958017Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T15:19:54.958169Z",
      "updated_at": "2026-10-30T15:19:54.964109Z",
      "finished_at": "2026-10-30T15:19:54.964109Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/4e0f8add-8b67-4cac-9a8b-ce9c6c9c6c88` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "e680a6a5-cfbd-45fd-944b-3eb82348b3f9",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T15:39:05.56682Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T15:39:05.566861Z",
  "updated_at": "2026-10-30T15:39:06.006409Z",
  "finished_at": "2026-10-30T15:39:05.575805Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793374870342E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793374870692E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793374870693E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793374870342E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793374870693E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
