# Sandbox transcript (2026-10-28T15:30:49Z, 52e75db)

# Scenario: app-version

## Staff set a high driver minimum

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
  "correlation_id": "40722a3a-6faa-4d5d-bcaa-0364a1aa511b"
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
  "session_id": "fd0640dc-f01f-401a-b5d2-7ddb84cf0065",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNTYsImlhdCI6MTc5MzIwMTQ1NiwianRpIjoiYjBkYjJmZjgtZWI2ZC00MjEwLTljYzYtNzc5MDgwYWFhOTg2Iiwic2lkIjoiZmQwNjQwZGMtZjAxZi00MDFhLWI1ZDItN2RkYjg0Y2YwMDY1In0.433eneoJWH888QfiyaKQBDXm6ciRhgw6hoN-eietPVQ",
  "access_expires_at": "2026-10-28T15:45:56.591856583Z",
  "refresh_token": "8QITfj3DDkLK5YZXoRd01JW8N_PHabF21KIHCFBrX7c",
  "refresh_expires_at": "2026-10-29T03:30:56.589705521Z",
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
  "session_id": "4fbec538-d7dd-41f8-aa3d-1d11d4400123",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNTgsImlhdCI6MTc5MzIwMTQ1OCwianRpIjoiNGMyZmJiZDctMjQxOS00ZjRlLWFkOWMtNmVjMjNmNjBkNGE5Iiwic2lkIjoiNGZiZWM1MzgtZDdkZC00MWY4LWFhM2QtMWQxMWQ0NDAwMTIzIn0.HrezkFmx36uWnfbbp726Z0o_V7obPhT2EekNFntCjpI",
  "access_expires_at": "2026-10-28T15:45:58.136561453Z",
  "refresh_token": "ncbehJ9kBHkw4hodFz0VBGkxxdRRI-Qz_arSzBlfpEI",
  "refresh_expires_at": "2026-10-29T03:30:58.13546375Z",
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
    "app_versions": null
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "a4110481-0f59-4ec5-8400-427a157fc7f5",
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
    "app_versions": {
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    }
  },
  "reason": "Sandbox: force update"
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
    "app_versions": {
      "rider_android": null,
      "rider_ios": null,
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": null,
      "require_version_header": false
    }
  },
  "changed_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T15:30:58.746394112Z"
}
```

**Contract validation failed — scenario stopped.**

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
    "app_versions": {
      "rider_android": null,
      "rider_ios": null,
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": null,
      "require_version_header": false
    }
  },
  "changed_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T15:30:58.746394Z"
}
```

**Contract validation failed — scenario stopped.**

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
  "session_id": "fcc9c891-fb25-44ab-8001-63ec7af383dc",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNTksImlhdCI6MTc5MzIwMTQ1OSwianRpIjoiZGJkZTNkNzgtZjMxMy00NWQ0LTliOTMtYWIzNTIzY2VmOWI1Iiwic2lkIjoiZmNjOWM4OTEtZmIyNS00NGFiLTgwMDEtNjNlYzdhZjM4M2RjIn0.38WR2TTTcyxjnPXWiWbxl0KDJFOSk62lCFXMQBQOSyA",
  "access_expires_at": "2026-10-28T15:45:59.610097911Z",
  "refresh_token": "AGm0DHJnv0R3koHKdL4HgGtVGevdIKWYHmvaPqSbSp8",
  "refresh_expires_at": "2026-10-29T03:30:59.608984699Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "95aec377-2b5f-4a1b-93a5-75e5eaba0c9b",
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
  "id": "6e8e3194-1c4c-485a-af40-4df2b2c572d5",
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
  "created_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "created_at": "2026-10-28T15:30:59.911629Z",
  "updated_at": "2026-10-28T15:30:59.911629Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637638004",
  "device_ref": "sandbox-7638"
}
```

```json
{
  "challenge_id": "0bfe362f-9601-4059-9d0e-8966f512cf6a",
  "expires_at": "2026-10-28T15:36:00.208021297Z",
  "resend_available_at": "2026-10-28T15:31:01.208021297Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637638004` → **200**

```json
{
  "phone": "+380637638004",
  "audience": "CLIENT",
  "code": "395604",
  "sent_at": "2026-10-28T15:31:00.21693364Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bfe362f-9601-4059-9d0e-8966f512cf6a",
  "code": "395604",
  "device_ref": "sandbox-7638"
}
```

```json
{
  "session_id": "38f89a61-2709-4d0f-8aae-c58c71d69358",
  "subject": {
    "type": "CLIENT",
    "id": "11d38a41-f7f4-4d5a-8cd5-bb6e79317861"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMWQzOGE0MS1mN2Y0LTRkNWEtOGNkNS1iYjZlNzkzMTc4NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzYwLCJpYXQiOjE3OTMyMDE0NjAsImp0aSI6IjEzMzdkMDY1LTk5NWEtNDMwMC1iNTJkLTZlYmZkZDlkOTJiMCIsInNpZCI6IjM4Zjg5YTYxLTI3MDktNGQwZi04YWFlLWM1OGM3MWQ2OTM1OCJ9.xezpbGfKWdSAQEi_S7fuwq3ex8vAOe11cr8LbVKltMs",
  "access_expires_at": "2026-10-28T15:46:00.540929589Z",
  "refresh_token": "ig9v3o2BHpvdjXhm9qtjjMiBiFlWKjtTw4KIPCSB834",
  "refresh_expires_at": "2026-11-27T15:31:00.539874826Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637638004` → **200**

```json
{
  "client_id": "11d38a41-f7f4-4d5a-8cd5-bb6e79317861"
}
```

`POST /api/admin/v1/rider-wallets/11d38a41-f7f4-4d5a-8cd5-bb6e79317861/top-ups` → **201**

```json
{
  "command_id": "510b89e8-9e7d-4db5-acb1-db1ddfebe214",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "11d38a41-f7f4-4d5a-8cd5-bb6e79317861",
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
      "id": "e7cd09b1-3c3b-4971-8a66-dc00aeafe09c",
      "at": "2026-10-28T15:31:01.10224Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9b7a50f6-6485-4402-a05c-6d7195e1a250",
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
  "id": "9cc28802-db89-44b4-8393-3aa6925500b3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:01.486945Z",
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
      "id": "6e8e3194-1c4c-485a-af40-4df2b2c572d5",
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
  "device_ref": "sandbox-7879"
}
```

```json
{
  "challenge_id": "6eb9c165-12ec-48fd-979f-4585c6fd4ec9",
  "expires_at": "2026-10-28T15:36:01.787823667Z",
  "resend_available_at": "2026-10-28T15:31:02.787823667Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "528266",
  "sent_at": "2026-10-28T15:31:01.791806772Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6eb9c165-12ec-48fd-979f-4585c6fd4ec9",
  "code": "528266",
  "device_ref": "sandbox-7879"
}
```

```json
{
  "session_id": "6e716aab-b0b1-42d2-8a3c-f217388c9875",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM2MiwiaWF0IjoxNzkzMjAxNDYyLCJqdGkiOiIzYzIwYWIxYy1jMzk0LTRiZjQtYjA0OS1mYzhkNDQ0OThlZDkiLCJzaWQiOiI2ZTcxNmFhYi1iMGIxLTQyZDItOGEzYy1mMjE3Mzg4Yzk4NzUifQ.HodBgoruPE6XJPvIZYGopi7BH6EOOqUFLZsBng3MOOk",
  "access_expires_at": "2026-10-28T15:46:02.081469677Z",
  "refresh_token": "01Eo-wTYAsB2fwyebX8LPRCpGdiMfrtO7u1P-Crfb5w",
  "refresh_expires_at": "2026-11-27T15:31:02.080409838Z",
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
  "command_id": "2e0f3f9d-3f29-4c9a-8491-80bbe79eba3a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:02Z",
    "sequence": 1793201462621
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "775ac18a-977f-4e28-ab91-1e24d86d4d8e",
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
  "last_heartbeat_at": "2026-10-28T15:31:02.669993Z",
  "last_location_at": "2026-10-28T15:31:02.669993Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "253c5bde-1106-43b3-bd95-24b66173165f",
  "quote_id": "9cc28802-db89-44b4-8393-3aa6925500b3",
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
  "id": "22030b57-b119-452a-a420-2c45b2c6e3d0",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "11d38a41-f7f4-4d5a-8cd5-bb6e79317861",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:02.999273Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "11d38a41-f7f4-4d5a-8cd5-bb6e79317861",
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
      "id": "e7cd09b1-3c3b-4971-8a66-dc00aeafe09c",
      "at": "2026-10-28T15:31:01.10224Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2155bcaf-5441-456a-8334-5423de150ccd",
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
    "id": "1f537c22-a3b8-463c-ae04-27e0ee09676e",
    "order_id": "22030b57-b119-452a-a420-2c45b2c6e3d0",
    "expires_at": "2026-10-28T15:31:18.014321Z",
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

`POST /api/driver/v1/offers/1f537c22-a3b8-463c-ae04-27e0ee09676e/accept` → **200**

```json
{
  "command_id": "af30614a-32a9-430d-925a-0c86048f5e8d"
}
```

```json
{
  "id": "8e93b17c-a292-467a-b7ee-a696bb05151f",
  "order_id": "22030b57-b119-452a-a420-2c45b2c6e3d0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5e609561-ae16-458e-afef-4fda11bbed45",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5e609561-ae16-458e-afef-4fda11bbed45",
  "order_id": "22030b57-b119-452a-a420-2c45b2c6e3d0",
  "assignment_id": "8e93b17c-a292-467a-b7ee-a696bb05151f",
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

`POST /api/driver/v1/work-sessions/775ac18a-977f-4e28-ab91-1e24d86d4d8e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:04Z",
    "sequence": 1793201464405
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "775ac18a-977f-4e28-ab91-1e24d86d4d8e",
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
  "last_heartbeat_at": "2026-10-28T15:31:04.432482Z",
  "last_location_at": "2026-10-28T15:31:04.432482Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5e609561-ae16-458e-afef-4fda11bbed45/arrive` → **200**

```json
{
  "command_id": "074eeb29-e907-49bf-b0f2-8a02f34a279d",
  "expected_version": 0
}
```

```json
{
  "id": "5e609561-ae16-458e-afef-4fda11bbed45",
  "order_id": "22030b57-b119-452a-a420-2c45b2c6e3d0",
  "assignment_id": "8e93b17c-a292-467a-b7ee-a696bb05151f",
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
  "arrived_at": "2026-10-28T15:31:04.723774Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5e609561-ae16-458e-afef-4fda11bbed45/start` → **200**

```json
{
  "command_id": "c4a1326b-f674-4f5e-8830-11a5a0a26793",
  "expected_version": 1
}
```

```json
{
  "id": "5e609561-ae16-458e-afef-4fda11bbed45",
  "order_id": "22030b57-b119-452a-a420-2c45b2c6e3d0",
  "assignment_id": "8e93b17c-a292-467a-b7ee-a696bb05151f",
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
  "arrived_at": "2026-10-28T15:31:04.723774Z",
  "started_at": "2026-10-28T15:31:05.024967Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/5e609561-ae16-458e-afef-4fda11bbed45/complete` → **200**

```json
{
  "command_id": "cd2faf82-9d5d-426c-9e1d-66fa7b5d564c",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:31:05Z",
  "cash_received": true
}
```

```json
{
  "id": "5e609561-ae16-458e-afef-4fda11bbed45",
  "order_id": "22030b57-b119-452a-a420-2c45b2c6e3d0",
  "assignment_id": "8e93b17c-a292-467a-b7ee-a696bb05151f",
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
  "arrived_at": "2026-10-28T15:31:04.723774Z",
  "started_at": "2026-10-28T15:31:05.024967Z",
  "completed_at": "2026-10-28T15:31:05.334875Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "11d38a41-f7f4-4d5a-8cd5-bb6e79317861",
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
      "id": "51ee7055-4b5a-493f-b83e-d870650dda39",
      "at": "2026-10-28T15:31:05.437761Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "22030b57-b119-452a-a420-2c45b2c6e3d0"
    },
    {
      "id": "e7cd09b1-3c3b-4971-8a66-dc00aeafe09c",
      "at": "2026-10-28T15:31:01.10224Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/6e8e3194-1c4c-485a-af40-4df2b2c572d5/archive` → **200**

```json
{
  "command_id": "0238a308-92b3-46b0-af95-4875a66211f4",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "6e8e3194-1c4c-485a-af40-4df2b2c572d5",
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
  "created_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "created_at": "2026-10-28T15:30:59.911629Z",
  "updated_at": "2026-10-28T15:31:08.972907Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "775ac18a-977f-4e28-ab91-1e24d86d4d8e",
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
  "last_heartbeat_at": "2026-10-28T15:31:04.432482Z",
  "last_location_at": "2026-10-28T15:31:04.432482Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/775ac18a-977f-4e28-ab91-1e24d86d4d8e/close` → **200**

```json
{
  "command_id": "906beadb-e614-4221-8288-0a0189519400",
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

Done: order 22030b57-b119-452a-a420-2c45b2c6e3d0.

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
  "session_id": "f1b11364-5e5f-4e5d-a690-7cf4ba5f579c",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNzAsImlhdCI6MTc5MzIwMTQ3MCwianRpIjoiNDYwNWJiMjMtZmQ3OC00NTQxLWE5YjAtYzJkNjdjOGNkYTY3Iiwic2lkIjoiZjFiMTEzNjQtNWU1Zi00ZTVkLWE2OTAtN2NmNGJhNWY1NzljIn0._BbiXRqH3Xm-UWAtKtzp3IKkSg1nRgoIcJv4MaggRlI",
  "access_expires_at": "2026-10-28T15:46:10.230343636Z",
  "refresh_token": "AyGpfiK1XkI8EEJluvJHPPoEslqABKq9RZsJL8mW4H4",
  "refresh_expires_at": "2026-10-29T03:31:10.229553642Z",
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
  "command_id": "222f1c76-30a7-4823-9396-dee04ad2b235",
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
  "session_id": "0364377a-db9a-495e-b72f-f481859d6c76",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNzEsImlhdCI6MTc5MzIwMTQ3MSwianRpIjoiMjA2YWUyZmQtZDI5NC00MDZmLWE1ZmItNjYyMzk5MmQ5YjY0Iiwic2lkIjoiMDM2NDM3N2EtZGI5YS00OTVlLWI3MmYtZjQ4MTg1OWQ2Yzc2In0.SdX8Xu9kLQjdW4TcE8ou0AAbwqIAZ_BrxK4k1Yurkmg",
  "access_expires_at": "2026-10-28T15:46:11.349417084Z",
  "refresh_token": "EMZ84F-aC4q9cqp0XE55FeYaQRoO0vxRQfI_F6-rB4s",
  "refresh_expires_at": "2026-10-29T03:31:11.348689009Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1207918536",
    "linkedid": "1730052700.1207918536",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677974511"
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
    "id": "1730052700.1207918536",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "936187b3-747e-4c6d-97e9-eb11f9d428ed",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380677974511",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:31:11.608332Z",
      "answered_at": null,
      "ended_at": "2026-10-28T15:31:11.632519Z",
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
    "id": "1730052600.395020276",
    "linkedid": "1730052600.395020276",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380677974511"
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
      "id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380677974511",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:31:11.942629Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/c29786a9-5023-4493-bc79-394c52ee64fc/answer` → **200**

```json
{
  "command_id": "9dab4ce4-de89-4323-bff6-1caebe05069f"
}
```

```json
{
  "id": "c29786a9-5023-4493-bc79-394c52ee64fc",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380677974511",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "order_ids": [],
  "started_at": "2026-10-28T15:31:11.942629Z",
  "answered_at": "2026-10-28T15:31:12.243712Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.395020276",
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
    "id": "1730052600.395020276",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677974511",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [],
      "started_at": "2026-10-28T15:31:11.942629Z",
      "answered_at": "2026-10-28T15:31:12.243712Z",
      "ended_at": "2026-10-28T15:31:12.543883Z",
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
      "id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677974511",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [],
      "started_at": "2026-10-28T15:31:11.942629Z",
      "answered_at": "2026-10-28T15:31:12.243712Z",
      "ended_at": "2026-10-28T15:31:12.543883Z",
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
      "id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677974511",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [],
      "started_at": "2026-10-28T15:31:11.942629Z",
      "answered_at": "2026-10-28T15:31:12.243712Z",
      "ended_at": "2026-10-28T15:31:12.543883Z",
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
      "id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677974511",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [],
      "started_at": "2026-10-28T15:31:11.942629Z",
      "answered_at": "2026-10-28T15:31:12.243712Z",
      "ended_at": "2026-10-28T15:31:12.543883Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:31:18.26587Z"
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
      "id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677974511",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [],
      "started_at": "2026-10-28T15:31:11.942629Z",
      "answered_at": "2026-10-28T15:31:12.243712Z",
      "ended_at": "2026-10-28T15:31:12.543883Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:31:18.26587Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/c29786a9-5023-4493-bc79-394c52ee64fc/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/c29786a9-5023-4493-bc79-394c52ee64fc/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=c29786a9-5023-4493-bc79-394c52ee64fc` → **200**

```json
{
  "changes": [
    {
      "id": "120f3f14-9c54-4934-b2fd-ab053f0722dd",
      "occurred_at": "2026-10-28T15:31:19.974795Z",
      "actor_type": "STAFF",
      "actor_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"51437b8e-252f-42ea-a2df-6a68b8a6ff35\", \"order_ids\": []}",
      "correlation_id": "4612988c-b775-4130-96a7-1e1fcd999542"
    },
    {
      "id": "fec65793-714b-477c-bb12-c9dff3b30208",
      "occurred_at": "2026-10-28T15:31:19.941753Z",
      "actor_type": "STAFF",
      "actor_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"51437b8e-252f-42ea-a2df-6a68b8a6ff35\", \"order_ids\": []}",
      "correlation_id": "f1877420-aee7-44ee-8cfd-13a52c50f872"
    }
  ]
}
```

Done: call c29786a9-5023-4493-bc79-394c52ee64fc recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638574369",
  "device_ref": "sandbox-21608"
}
```

```json
{
  "challenge_id": "8941f8d6-a1c0-4aa7-810f-c2d93be357a4",
  "expires_at": "2026-10-28T15:36:20.29951324Z",
  "resend_available_at": "2026-10-28T15:31:21.29951324Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638574369` → **200**

```json
{
  "phone": "+380638574369",
  "audience": "CLIENT",
  "code": "184074",
  "sent_at": "2026-10-28T15:31:20.303248707Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8941f8d6-a1c0-4aa7-810f-c2d93be357a4",
  "code": "184074",
  "device_ref": "sandbox-21608"
}
```

```json
{
  "session_id": "dca32618-8a99-4b38-b52c-0357674854ae",
  "subject": {
    "type": "CLIENT",
    "id": "f584ca3a-e7ef-4e5d-9659-cc64c83086df"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTg0Y2EzYS1lN2VmLTRlNWQtOTY1OS1jYzY0YzgzMDg2ZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzgwLCJpYXQiOjE3OTMyMDE0ODAsImp0aSI6IjAyODI3M2JiLTAyYTAtNGRiZS05ZmQ0LWQxMmMzNTMzMWNhYSIsInNpZCI6ImRjYTMyNjE4LThhOTktNGIzOC1iNTJjLTAzNTc2NzQ4NTRhZSJ9.oRVixMdBKsbmVg_0QGWoUMY9-ioELS7o3VFZfy4wBuE",
  "access_expires_at": "2026-10-28T15:46:20.59358438Z",
  "refresh_token": "hpdFxq89vHB_34ji7B6jsPSkV3bGLKvwAkrJxwjSiqo",
  "refresh_expires_at": "2026-11-27T15:31:20.592801459Z",
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
  "device_ref": "sandbox-23625"
}
```

```json
{
  "challenge_id": "a4a7a6cb-f4fb-4401-a573-0f88ea193c12",
  "expires_at": "2026-10-28T15:36:21.120517835Z",
  "resend_available_at": "2026-10-28T15:31:22.120517835Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "841743",
  "sent_at": "2026-10-28T15:31:21.124065719Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4a7a6cb-f4fb-4401-a573-0f88ea193c12",
  "code": "841743",
  "device_ref": "sandbox-23625"
}
```

```json
{
  "session_id": "d186ae00-ae61-4921-9c14-73fea3cf6394",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM4MSwiaWF0IjoxNzkzMjAxNDgxLCJqdGkiOiI3Zjg3ZDIwYy1jODc1LTRmYzQtYTY4NC1iMjU4YjUyNTIzODciLCJzaWQiOiJkMTg2YWUwMC1hZTYxLTQ5MjEtOWMxNC03M2ZlYTNjZjYzOTQifQ.xW3PegjxxW3oLmFqGf1y-vAZZR-Rcq7-88mHaJ-4LW8",
  "access_expires_at": "2026-10-28T15:46:21.415676377Z",
  "refresh_token": "Cmpp7wGtW8-dclep0OACcolPU6n0gxMCow0Gz9NNvyA",
  "refresh_expires_at": "2026-11-27T15:31:21.414949988Z",
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
  "session_id": "9134d7a5-d30e-4708-906d-56a85f71f108",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzODIsImlhdCI6MTc5MzIwMTQ4MiwianRpIjoiZmY1NWFjNWUtNDI4Yi00Nzg4LTkxODItMmE5NGE3ZDM3MTI5Iiwic2lkIjoiOTEzNGQ3YTUtZDMwZS00NzA4LTkwNmQtNTZhODVmNzFmMTA4In0.ZM67_YxnO9wMZwK-CCjJnjJqKTem9dZ0wOw0Is_tqnI",
  "access_expires_at": "2026-10-28T15:46:22.237078712Z",
  "refresh_token": "Am2xvzjI2UVuVjr1nfal7uLz61ele5MlxyQZRCweSdw",
  "refresh_expires_at": "2026-10-29T03:31:22.236383686Z",
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
  "session_id": "f538a88b-9fc3-41c1-a97d-cd79d5eda1ed",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzODIsImlhdCI6MTc5MzIwMTQ4MiwianRpIjoiMjZmOTJjNWItMzQ3Yy00NTFlLTgxOGItZmE5NmE3ZWVlOGFmIiwic2lkIjoiZjUzOGE4OGItOWZjMy00MWMxLWE5N2QtY2Q3OWQ1ZWRhMWVkIn0.tGdXwQmBdWJZS0HZmGGhXEkz136Nbvryeguk6H-J-d0",
  "access_expires_at": "2026-10-28T15:46:22.795892562Z",
  "refresh_token": "mdi7eQf0j5zy8cenNYGGhoyJN5xhVXsIWA4MR3EQgB8",
  "refresh_expires_at": "2026-10-29T03:31:22.795307974Z",
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
  "command_id": "712743b5-79ba-4989-abfe-a347bae93d0c",
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
  "id": "9ef470bb-50a2-4017-bbc6-b2f0aaccf15d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:23.335012Z",
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
  "command_id": "aeb3ae7e-62bc-4004-831a-c6fc382d94f2",
  "quote_id": "9ef470bb-50a2-4017-bbc6-b2f0aaccf15d",
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
  "id": "9d8166be-94cf-464b-aea2-c33b288c5807",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f584ca3a-e7ef-4e5d-9659-cc64c83086df",
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
  "created_at": "2026-10-28T15:31:23.621673Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/9d8166be-94cf-464b-aea2-c33b288c5807` → **200**

```json
{
  "id": "9d8166be-94cf-464b-aea2-c33b288c5807",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f584ca3a-e7ef-4e5d-9659-cc64c83086df",
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
  "created_at": "2026-10-28T15:31:23.621673Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9d8166be-94cf-464b-aea2-c33b288c5807/cancel` → **200**

```json
{
  "command_id": "d558639c-7cfb-4989-9410-3cdbbc22fb60",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "9d8166be-94cf-464b-aea2-c33b288c5807",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f584ca3a-e7ef-4e5d-9659-cc64c83086df",
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
  "created_at": "2026-10-28T15:31:23.621673Z",
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
  "discount_minor": 0
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
  "command_id": "a9f26ba6-cbf0-4a36-99bb-270815dac930",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:24Z",
    "sequence": 1793201484751
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f3cb715c-1f67-40c9-b0b3-73020baefe01",
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
  "last_heartbeat_at": "2026-10-28T15:31:24.77284Z",
  "last_location_at": "2026-10-28T15:31:24.77284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10356"
}
```

```json
{
  "challenge_id": "d9a58c50-bd7b-42c9-bdc9-d7a251c3d133",
  "expires_at": "2026-10-28T15:36:25.038431722Z",
  "resend_available_at": "2026-10-28T15:31:26.038431722Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "018711",
  "sent_at": "2026-10-28T15:31:25.041767699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9a58c50-bd7b-42c9-bdc9-d7a251c3d133",
  "code": "018711",
  "device_ref": "sandbox-10356"
}
```

```json
{
  "session_id": "99c2a98f-7b08-4a7f-afcd-7811952e42a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM4NSwiaWF0IjoxNzkzMjAxNDg1LCJqdGkiOiI0ZjI2MjUzNy1iZjE0LTQ4NTYtODY3My0yNzg0YWFiNzQwYjgiLCJzaWQiOiI5OWMyYTk4Zi03YjA4LTRhN2YtYWZjZC03ODExOTUyZTQyYTcifQ.kLtSMo0z2Bpqz_EAgoZkAnvPst9juLrmI-HShSovlNU",
  "access_expires_at": "2026-10-28T15:46:25.35316729Z",
  "refresh_token": "MKF35se_BaD8bIQoepKdvvRrOrsB19e5Dli8utdPh1E",
  "refresh_expires_at": "2026-11-27T15:31:25.352490859Z",
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
  "command_id": "35e24493-14a4-4d02-8940-e31748ca61c7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:25Z",
    "sequence": 1793201485874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cb14988e-f505-441b-8557-0aebc6dce02f",
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
  "last_heartbeat_at": "2026-10-28T15:31:25.896352Z",
  "last_location_at": "2026-10-28T15:31:25.896352Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4771261-0b6f-4b63-b204-f1b2e71ec54f",
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
  "id": "5e02a76a-1e3b-4e71-8081-ebe2e1fe583f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:26.175136Z",
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
  "command_id": "ad788e74-93f9-4e37-990a-ff2ffb8b5ce6",
  "quote_id": "5e02a76a-1e3b-4e71-8081-ebe2e1fe583f",
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
  "id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f584ca3a-e7ef-4e5d-9659-cc64c83086df",
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
  "created_at": "2026-10-28T15:31:26.459314Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e502dc21-8644-4a94-b26a-af62aa7190cd",
    "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
    "expires_at": "2026-10-28T15:31:41.463115Z",
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

`POST /api/driver/v1/offers/e502dc21-8644-4a94-b26a-af62aa7190cd/accept` → **200**

```json
{
  "command_id": "35385712-ecb7-41a1-a8b2-57ef15f82315"
}
```

```json
{
  "id": "afcbb0c1-9206-445b-97f6-6c64c1266b5d",
  "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8ad9410a-2af6-471a-91e8-89e77fb86556",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8ad9410a-2af6-471a-91e8-89e77fb86556",
  "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
  "assignment_id": "afcbb0c1-9206-445b-97f6-6c64c1266b5d",
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

`POST /api/driver/v1/trips/8ad9410a-2af6-471a-91e8-89e77fb86556/cancel` → **200**

```json
{
  "command_id": "45340dcd-5d40-4c5b-b9d5-a58af5eb964c",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "8ad9410a-2af6-471a-91e8-89e77fb86556",
  "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
  "assignment_id": "afcbb0c1-9206-445b-97f6-6c64c1266b5d",
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

`GET /api/rider/v1/orders/43f99725-9b36-45d8-a79e-bbdaad4701a6` → **200**

```json
{
  "id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f584ca3a-e7ef-4e5d-9659-cc64c83086df",
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
    "id": "afcbb0c1-9206-445b-97f6-6c64c1266b5d",
    "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8ad9410a-2af6-471a-91e8-89e77fb86556",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:31:26.459314Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "3015748b-9ed4-49d7-a87d-5fd3cc3f10ea",
    "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
    "expires_at": "2026-10-28T15:31:42.593775Z",
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

`POST /api/driver/v1/offers/3015748b-9ed4-49d7-a87d-5fd3cc3f10ea/accept` → **200**

```json
{
  "command_id": "7684c6e6-7161-4314-a21b-e218252b3259"
}
```

```json
{
  "id": "77828429-75da-4f1e-a551-3138954172a1",
  "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "376ed657-8a84-4aeb-8648-028d58fb42fd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "376ed657-8a84-4aeb-8648-028d58fb42fd",
  "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
  "assignment_id": "77828429-75da-4f1e-a551-3138954172a1",
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

`POST /api/driver/v1/trips/376ed657-8a84-4aeb-8648-028d58fb42fd/cancel` → **200**

```json
{
  "command_id": "cb7b9eae-e06a-40f9-9d31-556ea125da0a",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "376ed657-8a84-4aeb-8648-028d58fb42fd",
  "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
  "assignment_id": "77828429-75da-4f1e-a551-3138954172a1",
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
    "id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:31:26.459314Z",
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
    "id": "9d8166be-94cf-464b-aea2-c33b288c5807",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:31:23.621673Z",
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

`GET /api/operator/v1/orders/43f99725-9b36-45d8-a79e-bbdaad4701a6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:31:26.459958Z",
      "actor": {
        "type": "CLIENT",
        "id": "f584ca3a-e7ef-4e5d-9659-cc64c83086df",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
        "quote_id": "5e02a76a-1e3b-4e71-8081-ebe2e1fe583f",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "e408132d-01ff-4f81-b88b-241c90ab0df1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:31:26.46214Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
        "attempt_id": "818d9e71-c2c3-4a8e-adb4-2a811a99485f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e408132d-01ff-4f81-b88b-241c90ab0df1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:31:26.469742Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e502dc21-8644-4a94-b26a-af62aa7190cd",
        "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "e408132d-01ff-4f81-b88b-241c90ab0df1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:31:27.039023Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e502dc21-8644-4a94-b26a-af62aa7190cd",
        "order_id": "43f99725-9b36-45d8-a79e-bbdaad4701a6",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "afcbb0c1-9206-445b-97f6-6c64c1266b5d"
      },
      "correlation_id": "714e1bdd-8c57-4950-a9a5-fa510f457785"
```

Done: orders 9d8166be-94cf-464b-aea2-c33b288c5807, 43f99725-9b36-45d8-a79e-bbdaad4701a6.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732172248",
  "device_ref": "sandbox-3769"
}
```

```json
{
  "challenge_id": "d4996dc0-ec1a-4539-adf7-71a27017d43c",
  "expires_at": "2026-10-28T15:36:29.854191449Z",
  "resend_available_at": "2026-10-28T15:31:30.854191449Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732172248` → **200**

```json
{
  "phone": "+380732172248",
  "audience": "CLIENT",
  "code": "028579",
  "sent_at": "2026-10-28T15:31:29.857166198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d4996dc0-ec1a-4539-adf7-71a27017d43c",
  "code": "028579",
  "device_ref": "sandbox-3769"
}
```

```json
{
  "session_id": "8b1b9d9a-8d30-44f6-b243-d709acdda630",
  "subject": {
    "type": "CLIENT",
    "id": "85fe2720-33e6-4c10-bd00-dda18443678d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NWZlMjcyMC0zM2U2LTRjMTAtYmQwMC1kZGExODQ0MzY3OGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzkwLCJpYXQiOjE3OTMyMDE0OTAsImp0aSI6IjljZTc3YTk3LWQxNmItNGQ4YS1iYTNjLWI5NzNiODkxZjQ3MyIsInNpZCI6IjhiMWI5ZDlhLThkMzAtNDRmNi1iMjQzLWQ3MDlhY2RkYTYzMCJ9.7rrllQjlS3WKI0DLvyNRrcOKqN5FjDVYlaDz41rVknE",
  "access_expires_at": "2026-10-28T15:46:30.143353215Z",
  "refresh_token": "ShkhpKLwV3w8AzLseck7SBWVHVXr0MzprJkPTJMT4iE",
  "refresh_expires_at": "2026-11-27T15:31:30.142727443Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d76b1daf-3fad-4e5a-8698-f12680c8172f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "299063a7-3473-4f53-ac78-1746f27d3970",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-299063a7-3473-4f53-ac78-1746f27d3970",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "fc61b1399a1dc2ffe62314a6a7da02d4",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=299063a7-3473-4f53-ac78-1746f27d3970",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732172248"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=299063a7-3473-4f53-ac78-1746f27d3970",
  "expires_at": "2026-10-28T16:01:30.431417Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/299063a7-3473-4f53-ac78-1746f27d3970` → **200**

```json
{
  "id": "299063a7-3473-4f53-ac78-1746f27d3970",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T16:01:30.431417Z",
  "card": {
    "id": "660f1127-1a63-4eeb-a2ed-c4663de61db8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4510",
    "card_type": "Visa",
    "created_at": "2026-10-28T15:31:30.725265Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "660f1127-1a63-4eeb-a2ed-c4663de61db8",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4510",
      "card_type": "Visa",
      "created_at": "2026-10-28T15:31:30.725265Z"
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
  "device_ref": "sandbox-3242"
}
```

```json
{
  "challenge_id": "8cf4a1f1-e4fb-42ef-a1e9-929d3db360c0",
  "expires_at": "2026-10-28T15:36:31.297710986Z",
  "resend_available_at": "2026-10-28T15:31:32.297710986Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "661283",
  "sent_at": "2026-10-28T15:31:31.301096368Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cf4a1f1-e4fb-42ef-a1e9-929d3db360c0",
  "code": "661283",
  "device_ref": "sandbox-3242"
}
```

```json
{
  "session_id": "9dd81e53-6a5d-4145-94d1-131bcfdeacda",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM5MSwiaWF0IjoxNzkzMjAxNDkxLCJqdGkiOiJjMWFkNTA0My1jMGI2LTRhNGMtYjQ0NC1kNDAzZjI0MjA2MjgiLCJzaWQiOiI5ZGQ4MWU1My02YTVkLTQxNDUtOTRkMS0xMzFiY2ZkZWFjZGEifQ.WRvkGoiBSVEoK82bCK91b4va4hM5aVxn1J1MdAXHIVA",
  "access_expires_at": "2026-10-28T15:46:31.595987312Z",
  "refresh_token": "SMzK6fy4kXKDTS6piaaxNmkmYeJI2ySboTDxMTouxtU",
  "refresh_expires_at": "2026-11-27T15:31:31.595344588Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cb14988e-f505-441b-8557-0aebc6dce02f",
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
  "last_heartbeat_at": "2026-10-28T15:31:25.896352Z",
  "last_location_at": "2026-10-28T15:31:25.896352Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb14988e-f505-441b-8557-0aebc6dce02f/handover` → **200**

```json
{
  "command_id": "45b84dfa-eb7e-4f72-aae0-c5a0038bed46",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cb14988e-f505-441b-8557-0aebc6dce02f",
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
  "last_heartbeat_at": "2026-10-28T15:31:25.896352Z",
  "last_location_at": "2026-10-28T15:31:25.896352Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb14988e-f505-441b-8557-0aebc6dce02f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:32Z",
    "sequence": 1793201492393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cb14988e-f505-441b-8557-0aebc6dce02f",
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
  "last_heartbeat_at": "2026-10-28T15:31:32.414719Z",
  "last_location_at": "2026-10-28T15:31:32.414719Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "68dde1c2-cf58-43b6-b8a0-8f46cbeb4fe9",
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
  "id": "d43fa03f-9479-43df-a29a-de1ed3c5b64b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:32.694862Z",
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
  "command_id": "1657fbd7-3d72-4fae-964d-fa8520be12dd",
  "quote_id": "d43fa03f-9479-43df-a29a-de1ed3c5b64b",
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
  "id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "85fe2720-33e6-4c10-bd00-dda18443678d",
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
  "created_at": "2026-10-28T15:31:32.971411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fcd1a40a-fe3e-4878-8d65-20296cbf7186` → **200**

```json
{
  "id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "85fe2720-33e6-4c10-bd00-dda18443678d",
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
  "created_at": "2026-10-28T15:31:32.971411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fcd1a40a-fe3e-4878-8d65-20296cbf7186` → **200**

```json
{
  "id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "85fe2720-33e6-4c10-bd00-dda18443678d",
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
  "created_at": "2026-10-28T15:31:32.971411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "21b3361a-9a9e-4ee9-b91d-e4d19045679a",
    "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
    "expires_at": "2026-10-28T15:31:48.60581Z",
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

`POST /api/driver/v1/offers/21b3361a-9a9e-4ee9-b91d-e4d19045679a/accept` → **200**

```json
{
  "command_id": "0d2ebaaf-7425-4a21-8e17-3478797383f7"
}
```

```json
{
  "id": "1455316f-e6d1-44c5-807f-5d352a6af730",
  "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "adb456b2-d22b-451d-a22f-76a45db6a50d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "adb456b2-d22b-451d-a22f-76a45db6a50d",
  "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "assignment_id": "1455316f-e6d1-44c5-807f-5d352a6af730",
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

`POST /api/driver/v1/work-sessions/cb14988e-f505-441b-8557-0aebc6dce02f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:35Z",
    "sequence": 1793201495634
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cb14988e-f505-441b-8557-0aebc6dce02f",
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
  "last_heartbeat_at": "2026-10-28T15:31:35.655827Z",
  "last_location_at": "2026-10-28T15:31:35.655827Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/adb456b2-d22b-451d-a22f-76a45db6a50d/arrive` → **200**

```json
{
  "command_id": "f017f6e5-336f-4b2a-b68a-8265670d927e",
  "expected_version": 0
}
```

```json
{
  "id": "adb456b2-d22b-451d-a22f-76a45db6a50d",
  "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "assignment_id": "1455316f-e6d1-44c5-807f-5d352a6af730",
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
  "arrived_at": "2026-10-28T15:31:35.930089Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/adb456b2-d22b-451d-a22f-76a45db6a50d/start` → **200**

```json
{
  "command_id": "25a04366-b0f4-47d8-90d6-3fc545c09f09",
  "expected_version": 1
}
```

```json
{
  "id": "adb456b2-d22b-451d-a22f-76a45db6a50d",
  "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "assignment_id": "1455316f-e6d1-44c5-807f-5d352a6af730",
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
  "arrived_at": "2026-10-28T15:31:35.930089Z",
  "started_at": "2026-10-28T15:31:36.209489Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/adb456b2-d22b-451d-a22f-76a45db6a50d/complete` → **200**

```json
{
  "command_id": "0414d65d-5c4d-4e58-91de-257a82688681",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:31:36Z"
}
```

```json
{
  "id": "adb456b2-d22b-451d-a22f-76a45db6a50d",
  "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "assignment_id": "1455316f-e6d1-44c5-807f-5d352a6af730",
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
  "arrived_at": "2026-10-28T15:31:35.930089Z",
  "started_at": "2026-10-28T15:31:36.209489Z",
  "completed_at": "2026-10-28T15:31:36.494372Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/fcd1a40a-fe3e-4878-8d65-20296cbf7186` → **200**

```json
{
  "id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "85fe2720-33e6-4c10-bd00-dda18443678d",
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
    "id": "1455316f-e6d1-44c5-807f-5d352a6af730",
    "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "adb456b2-d22b-451d-a22f-76a45db6a50d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:31:32.971411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fcd1a40a-fe3e-4878-8d65-20296cbf7186` → **200**

```json
{
  "id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "85fe2720-33e6-4c10-bd00-dda18443678d",
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
    "id": "1455316f-e6d1-44c5-807f-5d352a6af730",
    "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "adb456b2-d22b-451d-a22f-76a45db6a50d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:31:32.971411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fcd1a40a-fe3e-4878-8d65-20296cbf7186` → **200**

```json
{
  "id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "85fe2720-33e6-4c10-bd00-dda18443678d",
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
    "id": "1455316f-e6d1-44c5-807f-5d352a6af730",
    "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "adb456b2-d22b-451d-a22f-76a45db6a50d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:31:32.971411Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
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
      "id": "cfdf426a-a1eb-4dd0-a80f-2ee25bca9593",
      "at": "2026-10-28T15:31:36.662324Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/fcd1a40a-fe3e-4878-8d65-20296cbf7186/tip` → **200**

```json
{
  "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
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
  "available_until": "2026-10-29T15:31:36.494372Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fcd1a40a-fe3e-4878-8d65-20296cbf7186/tip` → **201**

```json
{
  "command_id": "cfae6fe6-b0c2-4f6f-9a4e-8d1379ebeeb2",
  "amount_minor": 2500
}
```

```json
{
  "id": "e54973e3-1e5e-4d87-89f5-c022ef1cc070",
  "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:31:40.458216Z"
}
```

`GET /api/rider/v1/orders/fcd1a40a-fe3e-4878-8d65-20296cbf7186/tip` → **200**

```json
{
  "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
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
  "available_until": "2026-10-29T15:31:36.494372Z",
  "open": false,
  "tip": {
    "id": "e54973e3-1e5e-4d87-89f5-c022ef1cc070",
    "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:31:40.458216Z"
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
      "id": "cfdf426a-a1eb-4dd0-a80f-2ee25bca9593",
      "at": "2026-10-28T15:31:36.662324Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
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
      "id": "2b268ea7-7e48-4b5a-b067-19955a54c380",
      "at": "2026-10-28T15:31:41.732371Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
      "counterpart_id": null
    },
    {
      "id": "cfdf426a-a1eb-4dd0-a80f-2ee25bca9593",
      "at": "2026-10-28T15:31:36.662324Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fcd1a40a-fe3e-4878-8d65-20296cbf7186",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cb14988e-f505-441b-8557-0aebc6dce02f",
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
  "last_heartbeat_at": "2026-10-28T15:31:35.655827Z",
  "last_location_at": "2026-10-28T15:31:35.655827Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cb14988e-f505-441b-8557-0aebc6dce02f/close` → **200**

```json
{
  "command_id": "0753d11c-ff3a-4f18-a0a4-04678fe489ba",
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

Done: card order fcd1a40a-fe3e-4878-8d65-20296cbf7186.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738527441",
  "device_ref": "sandbox-23823"
}
```

```json
{
  "challenge_id": "bc1335cf-71e3-4106-92e5-f5310353db7e",
  "expires_at": "2026-10-28T15:36:43.082822357Z",
  "resend_available_at": "2026-10-28T15:31:44.082822357Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738527441` → **200**

```json
{
  "phone": "+380738527441",
  "audience": "CLIENT",
  "code": "067515",
  "sent_at": "2026-10-28T15:31:43.08555756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bc1335cf-71e3-4106-92e5-f5310353db7e",
  "code": "067515",
  "device_ref": "sandbox-23823"
}
```

```json
{
  "session_id": "5a54a16d-9e78-4973-b744-0ded0facc934",
  "subject": {
    "type": "CLIENT",
    "id": "db6bb9f1-43f9-4f80-81b8-ede2c8618d84"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYjZiYjlmMS00M2Y5LTRmODAtODFiOC1lZGUyYzg2MThkODQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDAzLCJpYXQiOjE3OTMyMDE1MDMsImp0aSI6IjZlNzMyNmE4LWMyOTctNDE3NS1hMjgyLWM2MjZjNTlkNzA1NyIsInNpZCI6IjVhNTRhMTZkLTllNzgtNDk3My1iNzQ0LTBkZWQwZmFjYzkzNCJ9.tOHhuMoIo2sS4lJw2-xgXRFl91wkoXQltfCbzWLSzRg",
  "access_expires_at": "2026-10-28T15:46:43.378526858Z",
  "refresh_token": "2T5-jvJ613_4XRJ9DXjFc566XP242UQIzSMzjDFlPoY",
  "refresh_expires_at": "2026-11-27T15:31:43.37787658Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "fe974f9c-790f-4a63-b3ce-27cbd5b8e01e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "b67527b0-8801-4ba8-ac2a-4931277b5f20",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-b67527b0-8801-4ba8-ac2a-4931277b5f20",
    "orderDate": "1793201503",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "6a9a13b72c960b755a66b26779b8bf2d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=b67527b0-8801-4ba8-ac2a-4931277b5f20",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738527441"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=b67527b0-8801-4ba8-ac2a-4931277b5f20",
  "created_at": "2026-10-28T15:31:43.653772Z",
  "expires_at": "2026-10-28T16:01:43.653772Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/b67527b0-8801-4ba8-ac2a-4931277b5f20` → **200**

```json
{
  "id": "b67527b0-8801-4ba8-ac2a-4931277b5f20",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:31:43.653772Z",
  "expires_at": "2026-10-28T16:01:43.653772Z",
  "completed_at": "2026-10-28T15:31:43.927231Z",
  "masked_pan": "41****7031",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "db6bb9f1-43f9-4f80-81b8-ede2c8618d84",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "db6bb9f1-43f9-4f80-81b8-ede2c8618d84",
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
      "id": "061ed4f0-37d8-4fb1-80d1-c5c919c19794",
      "at": "2026-10-28T15:31:44.752118Z",
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
  "client_id": "db6bb9f1-43f9-4f80-81b8-ede2c8618d84",
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
      "id": "061ed4f0-37d8-4fb1-80d1-c5c919c19794",
      "at": "2026-10-28T15:31:44.752118Z",
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
  "device_ref": "sandbox-18322"
}
```

```json
{
  "challenge_id": "6ce20011-635b-4c32-975c-8901bbf58958",
  "expires_at": "2026-10-28T15:36:46.054839231Z",
  "resend_available_at": "2026-10-28T15:31:47.054839231Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "122979",
  "sent_at": "2026-10-28T15:31:46.057810913Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6ce20011-635b-4c32-975c-8901bbf58958",
  "code": "122979",
  "device_ref": "sandbox-18322"
}
```

```json
{
  "session_id": "1381ffb3-8380-4117-9aa0-c2682cfac625",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQwNiwiaWF0IjoxNzkzMjAxNTA2LCJqdGkiOiI5ODQwNWY2OS1iN2ExLTQyMzItOWE0OS1kZjQ1ZjRlNWNmNmEiLCJzaWQiOiIxMzgxZmZiMy04MzgwLTQxMTctOWFhMC1jMjY4MmNmYWM2MjUifQ.EXj6wVHOmAGzPDcRJ5dVthZxFCSjpiPuFSYXF9PNP3c",
  "access_expires_at": "2026-10-28T15:46:46.352555914Z",
  "refresh_token": "djWNliEPE4Jzd7HzrLeE2Nsp0bycV8AstGoGZH1l9b4",
  "refresh_expires_at": "2026-11-27T15:31:46.35178739Z",
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
  "command_id": "9d39e0c1-cd11-4da8-aa39-be41d6f3f30e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "6c7ec3c5-720a-4d13-97e4-c00df7654019",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-6c7ec3c5-720a-4d13-97e4-c00df7654019",
    "orderDate": "1793201506",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "ee69f0e8e222e35fbf90ae90a8d2c349",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=6c7ec3c5-720a-4d13-97e4-c00df7654019",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=6c7ec3c5-720a-4d13-97e4-c00df7654019",
  "created_at": "2026-10-28T15:31:46.90166Z",
  "expires_at": "2026-10-28T16:01:46.90166Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/6c7ec3c5-720a-4d13-97e4-c00df7654019` → **200**

```json
{
  "id": "6c7ec3c5-720a-4d13-97e4-c00df7654019",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:31:46.90166Z",
  "expires_at": "2026-10-28T16:01:46.90166Z",
  "completed_at": "2026-10-28T15:31:47.174499Z",
  "masked_pan": "41****2456",
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
      "id": "325edbe0-6d3a-4e4a-9c04-82f255e10e4a",
      "at": "2026-10-28T15:31:47.766552Z",
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
  "command_id": "fcbcb6ac-9b8a-4a5f-9888-c12cd7163348",
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
  "correlation_id": "aea5e30f-70f9-43a1-9d4f-0c9232bc04a6"
}
```

Done: the rider's account and the driver's balance were topped up by card.

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
  "session_id": "6dd5f7c3-a40a-4dff-b1b4-8635469ce562",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MDksImlhdCI6MTc5MzIwMTUwOSwianRpIjoiZTUyNTY3OGItNGIyZS00YjUwLWJjNGYtNDVkZjlhYjZkNjU3Iiwic2lkIjoiNmRkNWY3YzMtYTQwYS00ZGZmLWIxYjQtODYzNTQ2OWNlNTYyIn0.FdFhUJQWQ65gSmeFBI2Xx6oZxJyJLNvHsu0Mye47MzU",
  "access_expires_at": "2026-10-28T15:46:49.56492265Z",
  "refresh_token": "lpFwEl1ukhjBahsVR8UMW9rLPZaYbYsEqnojyyDpzi4",
  "refresh_expires_at": "2026-10-29T03:31:49.564276597Z",
  "password_change_required": false
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
    "rider_android": null,
    "rider_ios": null,
    "driver_android": {
      "minimum_version": "9.0.0",
      "latest_version": "9.0.0"
    },
    "driver_ios": null,
    "require_version_header": false
  }
}
```

**Contract validation failed — scenario stopped.**

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671180731",
  "device_ref": "sandbox-1157"
}
```

```json
{
  "challenge_id": "0846f860-d351-4a92-9011-6efda381e367",
  "expires_at": "2026-10-28T15:36:50.134917624Z",
  "resend_available_at": "2026-10-28T15:31:51.134917624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671180731` → **200**

```json
{
  "phone": "+380671180731",
  "audience": "CLIENT",
  "code": "776912",
  "sent_at": "2026-10-28T15:31:50.137638801Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0846f860-d351-4a92-9011-6efda381e367",
  "code": "776912",
  "device_ref": "sandbox-1157"
}
```

```json
{
  "session_id": "f923eb9e-2ab2-4df5-96f0-7beebbf62f09",
  "subject": {
    "type": "CLIENT",
    "id": "1f47467c-f44d-4b57-bc76-509d5b1018ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZjQ3NDY3Yy1mNDRkLTRiNTctYmM3Ni01MDlkNWIxMDE4YWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDEwLCJpYXQiOjE3OTMyMDE1MTAsImp0aSI6Ijg5NjUwNDA0LTYwODQtNDQ4Ny1iZDQ3LTNkYzQ4MjRkOTE4NSIsInNpZCI6ImY5MjNlYjllLTJhYjItNGRmNS05NmYwLTdiZWViYmY2MmYwOSJ9.-YdlmDZFlziRo0R1VXbv1H92bwGzArHZDoi0d9gOSJE",
  "access_expires_at": "2026-10-28T15:46:50.426828917Z",
  "refresh_token": "VMl5YADolDXLvghWu5L_Y864_tXjAPu9BO1pwQuqQ8M",
  "refresh_expires_at": "2026-11-27T15:31:50.426305324Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1f47467c-f44d-4b57-bc76-509d5b1018ac",
  "session_id": "f923eb9e-2ab2-4df5-96f0-7beebbf62f09",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f64fa3fb-7b02-45f0-994d-1bfdcefddf8a",
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
  "id": "a7d17909-ac82-48ca-bd74-0e913e4513a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:50.976785Z",
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
  "challenge_id": "58e3a0de-c8e4-4d44-aee5-217799ef3a8c",
  "expires_at": "2026-10-28T15:36:53.257751604Z",
  "resend_available_at": "2026-10-28T15:31:54.257751604Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671180731` → **200**

```json
{
  "phone": "+380671180731",
  "audience": "CLIENT",
  "code": "602477",
  "sent_at": "2026-10-28T15:31:53.259858788Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "f7959feb-a13f-4e99-942b-64fe04cab770",
  "challenge_id": "58e3a0de-c8e4-4d44-aee5-217799ef3a8c",
  "otp_code": "602477"
}
```

```json
{
  "client_id": "1f47467c-f44d-4b57-bc76-509d5b1018ac",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T15:31:53.56343694Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "8af7a402-87ce-406c-a13a-c43de9488c3b",
  "quote_id": "a7d17909-ac82-48ca-bd74-0e913e4513a3",
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
  "correlation_id": "c74ed26b-ce83-485c-ac89-504497b5e21c"
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
  "session_id": "6ff829e8-7bc4-40db-b566-84da2a8a28fc",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MTQsImlhdCI6MTc5MzIwMTUxNCwianRpIjoiZWQ5MWJiZTAtYTZjYi00Y2I4LWEzODctZGE4NmE2MjNlZGQzIiwic2lkIjoiNmZmODI5ZTgtN2JjNC00MGRiLWI1NjYtODRkYTJhOGEyOGZjIn0.qNn5GYQBPIiWay3eW1z6Ju4-Yd3VPiN38TEr5lLdOaA",
  "access_expires_at": "2026-10-28T15:46:54.391166237Z",
  "refresh_token": "bbURNCyXykRU0pi_P7RnC318vMfTauBPck2TNF3AKmg",
  "refresh_expires_at": "2026-10-29T03:31:54.390577702Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1f47467c-f44d-4b57-bc76-509d5b1018ac",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T15:31:53.563437Z",
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

`POST /api/admin/v1/client-deletions/1f47467c-f44d-4b57-bc76-509d5b1018ac/complete` → **200**

```json
{
  "command_id": "66849a3f-7b73-45af-851a-3f31f4d49c5e",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1f47467c-f44d-4b57-bc76-509d5b1018ac",
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
  "correlation_id": "ee654d49-f410-4744-9301-b831a2fef605"
}
```

Done: client 1f47467c-f44d-4b57-bc76-509d5b1018ac anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665932621",
  "device_ref": "sandbox-22313"
}
```

```json
{
  "challenge_id": "24dc56b1-b905-4f91-82dd-a53069448785",
  "expires_at": "2026-10-28T15:36:55.483578915Z",
  "resend_available_at": "2026-10-28T15:31:56.483578915Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665932621` → **200**

```json
{
  "phone": "+380665932621",
  "audience": "CLIENT",
  "code": "993013",
  "sent_at": "2026-10-28T15:31:55.486397921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24dc56b1-b905-4f91-82dd-a53069448785",
  "code": "993013",
  "device_ref": "sandbox-22313"
}
```

```json
{
  "session_id": "72210012-4e1a-48a5-a8c2-2036ff155e9f",
  "subject": {
    "type": "CLIENT",
    "id": "e4bbceba-a0f7-411a-9605-721fc59ad70c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGJiY2ViYS1hMGY3LTQxMWEtOTYwNS03MjFmYzU5YWQ3MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDE1LCJpYXQiOjE3OTMyMDE1MTUsImp0aSI6IjAzNzM2NGI0LTdmM2YtNDBjYy05Yjg3LTU1NWQ0MDE0ZTBlYiIsInNpZCI6IjcyMjEwMDEyLTRlMWEtNDhhNS1hOGMyLTIwMzZmZjE1NWU5ZiJ9.CYfOZKfdEekr6RplXaCOaC7eGttmZSjuMq8iJtj2D5Q",
  "access_expires_at": "2026-10-28T15:46:55.791874605Z",
  "refresh_token": "TvvUQd1NGLWHRj1G_sphMCQl5oTNTHP2R43uDa571Vk",
  "refresh_expires_at": "2026-11-27T15:31:55.791086184Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e4bbceba-a0f7-411a-9605-721fc59ad70c",
  "session_id": "72210012-4e1a-48a5-a8c2-2036ff155e9f",
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
  "session_id": "ec0c35e3-24e8-4951-aaa7-ca4bd9e30211",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MTYsImlhdCI6MTc5MzIwMTUxNiwianRpIjoiMmE2NTk3MjktMGJkMS00YTgyLTg3MWMtNWE5NjZiOGYyOGQ2Iiwic2lkIjoiZWMwYzM1ZTMtMjRlOC00OTUxLWFhYTctY2E0YmQ5ZTMwMjExIn0.D65BAb36276i2j_2CJ-l979vGdKlSUiqhxcBnkWqVho",
  "access_expires_at": "2026-10-28T15:46:56.620488232Z",
  "refresh_token": "ySEHRVdRpxf7vSbgVQVYir3G91SvCQw-0JoGG6WbQeU",
  "refresh_expires_at": "2026-10-29T03:31:56.619869493Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=5932621&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "e4bbceba-a0f7-411a-9605-721fc59ad70c",
      "phone": "+380665932621",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T15:31:55.789094Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/e4bbceba-a0f7-411a-9605-721fc59ad70c` → **200**

```json
{
  "client": {
    "id": "e4bbceba-a0f7-411a-9605-721fc59ad70c",
    "phone": "+380665932621",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:31:55.789094Z",
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

`POST /api/admin/v1/clients/e4bbceba-a0f7-411a-9605-721fc59ad70c/block` → **400**

```json
{
  "command_id": "0cd956ed-3fb4-443e-8fda-591eb0c85508",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/e4bbceba-a0f7-411a-9605-721fc59ad70c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d2525655-169f-4daf-b972-c0ce4fcaa315",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/e4bbceba-a0f7-411a-9605-721fc59ad70c/block` → **200**

```json
{
  "command_id": "f774f772-baf2-4df0-a9aa-1862df1dbe36",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "e4bbceba-a0f7-411a-9605-721fc59ad70c",
  "phone": "+380665932621",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T15:31:55.789094Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T15:31:57.778314Z",
    "by": "2155bcaf-5441-456a-8334-5423de150ccd"
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
  "correlation_id": "26a85279-f9f5-4e3c-b32b-f06a9ff212f1"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665932621",
  "device_ref": "sandbox-15664"
}
```

```json
{
  "challenge_id": "3692a4ce-621d-42e2-8877-5cfafd9d7230",
  "expires_at": "2026-10-28T15:37:00.333256216Z",
  "resend_available_at": "2026-10-28T15:32:01.333256216Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665932621` → **200**

```json
{
  "phone": "+380665932621",
  "audience": "CLIENT",
  "code": "002333",
  "sent_at": "2026-10-28T15:32:00.335842335Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "3692a4ce-621d-42e2-8877-5cfafd9d7230",
  "code": "002333",
  "device_ref": "sandbox-15664"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "fa0f9972-0eab-4011-bd9a-61cdf7d7c10a"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/e4bbceba-a0f7-411a-9605-721fc59ad70c` → **200**

```json
{
  "client": {
    "id": "e4bbceba-a0f7-411a-9605-721fc59ad70c",
    "phone": "+380665932621",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T15:31:55.789094Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T15:31:57.778314Z",
      "by": "2155bcaf-5441-456a-8334-5423de150ccd"
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

`POST /api/admin/v1/clients/e4bbceba-a0f7-411a-9605-721fc59ad70c/unblock` → **200**

```json
{
  "command_id": "e3210f89-9d66-47c9-858a-f07928959264",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "e4bbceba-a0f7-411a-9605-721fc59ad70c",
  "phone": "+380665932621",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T15:31:55.789094Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665932621",
  "device_ref": "sandbox-27508"
}
```

```json
{
  "challenge_id": "43ac1059-89c2-4326-9d0b-c5b88ead8dc1",
  "expires_at": "2026-10-28T15:37:03.482017533Z",
  "resend_available_at": "2026-10-28T15:32:04.482017533Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665932621` → **200**

```json
{
  "phone": "+380665932621",
  "audience": "CLIENT",
  "code": "906428",
  "sent_at": "2026-10-28T15:32:03.484557009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43ac1059-89c2-4326-9d0b-c5b88ead8dc1",
  "code": "906428",
  "device_ref": "sandbox-27508"
}
```

```json
{
  "session_id": "73711653-1e47-442a-951d-e6170d419438",
  "subject": {
    "type": "CLIENT",
    "id": "e4bbceba-a0f7-411a-9605-721fc59ad70c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGJiY2ViYS1hMGY3LTQxMWEtOTYwNS03MjFmYzU5YWQ3MGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDIzLCJpYXQiOjE3OTMyMDE1MjMsImp0aSI6IjE1YjA4MDZhLTUwNjAtNDI3Yi04MGFiLWIyNDM2Y2ZmYWM5NyIsInNpZCI6IjczNzExNjUzLTFlNDctNDQyYS05NTFkLWU2MTcwZDQxOTQzOCJ9.F7IEHladCUI5RDTZ-88H2M_6jGXGYaIwpVfIgeuFvmA",
  "access_expires_at": "2026-10-28T15:47:03.776988361Z",
  "refresh_token": "kyJsBMaueHHkDaeVEN_D2F2OBBcWxpXzyHZvnSMUoHc",
  "refresh_expires_at": "2026-11-27T15:32:03.776421159Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e4bbceba-a0f7-411a-9605-721fc59ad70c",
  "session_id": "73711653-1e47-442a-951d-e6170d419438",
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
  "phone": "+380667377449",
  "device_ref": "sandbox-19641"
}
```

```json
{
  "challenge_id": "a4ffae3b-62d9-4195-a0d4-22aa4d22fd7e",
  "expires_at": "2026-10-28T15:37:04.313335696Z",
  "resend_available_at": "2026-10-28T15:32:05.313335696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667377449` → **200**

```json
{
  "phone": "+380667377449",
  "audience": "CLIENT",
  "code": "099105",
  "sent_at": "2026-10-28T15:32:04.315839497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4ffae3b-62d9-4195-a0d4-22aa4d22fd7e",
  "code": "099105",
  "device_ref": "sandbox-19641"
}
```

```json
{
  "session_id": "aceb13b3-fb4a-4d68-bbb0-fb6f958743e5",
  "subject": {
    "type": "CLIENT",
    "id": "9dba700a-a5c4-4f5a-8300-3081fefa60e5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGJhNzAwYS1hNWM0LTRmNWEtODMwMC0zMDgxZmVmYTYwZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDI0LCJpYXQiOjE3OTMyMDE1MjQsImp0aSI6IjBmYTIzZjA0LTc3ZjMtNGQ4OS05YTNlLTRlNGQ3NDU2MzRiNyIsInNpZCI6ImFjZWIxM2IzLWZiNGEtNGQ2OC1iYmIwLWZiNmY5NTg3NDNlNSJ9.o-IrEctP3Df7jmpxGO34T89-q66Kv4fKFtbdf0s0QVU",
  "access_expires_at": "2026-10-28T15:47:04.614816563Z",
  "refresh_token": "nSR4LiYRL6rgQmuH_GTJgxOoM2oS8iFe8K4UA4ormSo",
  "refresh_expires_at": "2026-11-27T15:32:04.614114199Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "65b0ee9a-74c3-4708-833c-445f6745e900",
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
  "id": "ed397220-8668-49df-a265-4d37bd96d22c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:04.886343Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 9edb6da3-b69a-41b2-b18b-cd24718d0c95) → **201**

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
  "session_id": "af4516a6-7e84-4a81-b0f8-0c00b898b424",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MjUsImlhdCI6MTc5MzIwMTUyNSwianRpIjoiMDcxM2M1NGMtNDMzNy00Y2Y1LWFiODgtYzQ5NjRkMWY0MzE5Iiwic2lkIjoiYWY0NTE2YTYtN2U4NC00YTgxLWIwZjgtMGMwMGI4OThiNDI0In0.YzbnhEKCmVOP96ovCHPjpMnJxNchZKgiZ9AcALK5tl0",
  "access_expires_at": "2026-10-28T15:47:05.49037101Z",
  "refresh_token": "9l_pR0ORQS8d7hVAdzJ1YgkQIoul-Mj7oGh9dnCLZ5c",
  "refresh_expires_at": "2026-10-29T03:32:05.489770926Z",
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
  "session_id": "9ca4d62f-3d10-4ff3-9404-09e8490246a0",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MjYsImlhdCI6MTc5MzIwMTUyNiwianRpIjoiZmI3OTllYmItMzQ5Ni00MWM1LTljNjEtMDM0ZjAwZWRiMDlhIiwic2lkIjoiOWNhNGQ2MmYtM2QxMC00ZmYzLTk0MDQtMDllODQ5MDI0NmEwIn0.6xqxbpe-XuISyXEAkVwdhNRz6xh6UkkyawPmZxStaAQ",
  "access_expires_at": "2026-10-28T15:47:06.073158747Z",
  "refresh_token": "ekQHDyiyPciPjcdR60-xFBZXCnX8wO2DETiHb6kT7k8",
  "refresh_expires_at": "2026-10-29T03:32:06.072540255Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3d2c7859-4c65-4c52-8e0a-b1582fe78689/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:32:05.161387Z",
      "actor": {
        "type": "CLIENT",
        "id": "9dba700a-a5c4-4f5a-8300-3081fefa60e5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689",
        "quote_id": "ed397220-8668-49df-a265-4d37bd96d22c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "9edb6da3-b69a-41b2-b18b-cd24718d0c95"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:32:05.163425Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689",
        "attempt_id": "182485bd-30e9-4b9d-9d1b-e60db374a0d9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "9edb6da3-b69a-41b2-b18b-cd24718d0c95"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T15:32:05.173274Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689",
        "attempt_id": "182485bd-30e9-4b9d-9d1b-e60db374a0d9"
      },
      "correlation_id": "9edb6da3-b69a-41b2-b18b-cd24718d0c95"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "182485bd-30e9-4b9d-9d1b-e60db374a0d9",
        "generation": 1,
        "started_at": "2026-10-28T15:32:05.162333Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T15:32:05.173274Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T15:32:05.164425Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/9edb6da3-b69a-41b2-b18b-cd24718d0c95` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689:0",
      "order_id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689",
      "at": "2026-10-28T15:32:05.161387Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689:1",
      "order_id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689",
      "at": "2026-10-28T15:32:05.163425Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689:2",
      "order_id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689",
      "at": "2026-10-28T15:32:05.173274Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/fc818df3-f490-437e-8cc7-03b85d451a9e` → **200**

```json
{
  "found": []
}
```

Done: request 9edb6da3-b69a-41b2-b18b-cd24718d0c95 — order 3d2c7859-4c65-4c52-8e0a-b1582fe78689 found by its id.

`GET /api/rider/v1/orders/3d2c7859-4c65-4c52-8e0a-b1582fe78689` → **200**

```json
{
  "id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9dba700a-a5c4-4f5a-8300-3081fefa60e5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T15:32:05.160546Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/3d2c7859-4c65-4c52-8e0a-b1582fe78689/cancel` → **200**

```json
{
  "command_id": "1599893a-725c-4e90-8880-c04d8d39014f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3d2c7859-4c65-4c52-8e0a-b1582fe78689",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9dba700a-a5c4-4f5a-8300-3081fefa60e5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:32:05.160546Z",
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
  "discount_minor": 0
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637593271",
  "device_ref": "sandbox-27729"
}
```

```json
{
  "challenge_id": "7cfafbe1-0b21-4e91-a135-df5203f2fcd1",
  "expires_at": "2026-10-28T15:37:07.726923962Z",
  "resend_available_at": "2026-10-28T15:32:08.726923962Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637593271` → **200**

```json
{
  "phone": "+380637593271",
  "audience": "CLIENT",
  "code": "987297",
  "sent_at": "2026-10-28T15:32:07.729648144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cfafbe1-0b21-4e91-a135-df5203f2fcd1",
  "code": "987297",
  "device_ref": "sandbox-27729"
}
```

```json
{
  "session_id": "d14e5d21-522d-44f6-80c4-09c82114585b",
  "subject": {
    "type": "CLIENT",
    "id": "6b1c82ca-3b93-464d-98c1-b53f97fe13eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjFjODJjYS0zYjkzLTQ2NGQtOThjMS1iNTNmOTdmZTEzZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDI4LCJpYXQiOjE3OTMyMDE1MjgsImp0aSI6Ijg1OGNiOTczLTYxZTAtNDEyNi05ZjIwLWIzYmNlNTAzMmM5ZSIsInNpZCI6ImQxNGU1ZDIxLTUyMmQtNDRmNi04MGM0LTA5YzgyMTE0NTg1YiJ9.YpG9ceM3ps8qxox_MElkEM9dHR7rPxdUF9YPF6NKhrc",
  "access_expires_at": "2026-10-28T15:47:08.023144933Z",
  "refresh_token": "JtpNBWFKqdjir1Cf2m3m-HMlTmMa95a5JcVqDgd-zvw",
  "refresh_expires_at": "2026-11-27T15:32:08.02251811Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "4ab3252f-44e3-458d-ad4a-d1b7448cb5ef",
  "expires_at": "2026-10-28T15:37:10.294660367Z",
  "resend_available_at": "2026-10-28T15:32:11.294660367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637593271` → **200**

```json
{
  "phone": "+380637593271",
  "audience": "CLIENT",
  "code": "008786",
  "sent_at": "2026-10-28T15:32:10.296722261Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "9f7b6170-730b-49a4-9a31-40e9891e4dc8",
  "challenge_id": "4ab3252f-44e3-458d-ad4a-d1b7448cb5ef",
  "otp_code": "008786"
}
```

```json
{
  "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
  "state": "PENDING",
  "created_at": "2026-10-28T15:32:10.595897Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846` → **200**

```json
{
  "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
  "state": "PENDING",
  "created_at": "2026-10-28T15:32:10.595897Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846` → **200**

```json
{
  "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
  "state": "PENDING",
  "created_at": "2026-10-28T15:32:10.595897Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846` → **200**

```json
{
  "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
  "state": "PENDING",
  "created_at": "2026-10-28T15:32:10.595897Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846` → **200**

```json
{
  "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
  "state": "PENDING",
  "created_at": "2026-10-28T15:32:10.595897Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846` → **200**

```json
{
  "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
  "state": "PENDING",
  "created_at": "2026-10-28T15:32:10.595897Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846` → **200**

```json
{
  "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
  "state": "PENDING",
  "created_at": "2026-10-28T15:32:10.595897Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846` → **200**

```json
{
  "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
  "state": "READY",
  "created_at": "2026-10-28T15:32:10.595897Z",
  "ready_at": "2026-10-28T15:32:18.269725Z",
  "expires_at": "2026-11-04T15:32:18.269725Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637719457",
  "device_ref": "sandbox-19320"
}
```

```json
{
  "challenge_id": "ef90ae89-46d2-4b5a-a5f1-0bbfedafd25d",
  "expires_at": "2026-10-28T15:37:18.754754767Z",
  "resend_available_at": "2026-10-28T15:32:19.754754767Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637719457` → **200**

```json
{
  "phone": "+380637719457",
  "audience": "CLIENT",
  "code": "134027",
  "sent_at": "2026-10-28T15:32:18.757398048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef90ae89-46d2-4b5a-a5f1-0bbfedafd25d",
  "code": "134027",
  "device_ref": "sandbox-19320"
}
```

```json
{
  "session_id": "19c07f6c-18ff-489d-8b6e-4792b68273c6",
  "subject": {
    "type": "CLIENT",
    "id": "8953b72c-f775-4a80-bda2-25de4b99e94d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTUzYjcyYy1mNzc1LTRhODAtYmRhMi0yNWRlNGI5OWU5NGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDM5LCJpYXQiOjE3OTMyMDE1MzksImp0aSI6IjgzNDIwZjE5LTFiMjctNDNkMi05MzdlLWQyYzFmYmQxZTdlNCIsInNpZCI6IjE5YzA3ZjZjLTE4ZmYtNDg5ZC04YjZlLTQ3OTJiNjgyNzNjNiJ9.pGI3kvGYJqzSreDO9GHajd3kQnPdti99uA0ISqWk8U0",
  "access_expires_at": "2026-10-28T15:47:19.047660041Z",
  "refresh_token": "gw7DQ_Mv8IgptFIOBpb0i_ilNI_gylTvcqBAVN55HZ4",
  "refresh_expires_at": "2026-11-27T15:32:19.04701768Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/1760cdc9-6f93-41ef-9de4-f07ce0c35846/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3d9d7578-784b-47aa-a50a-4c5e688b8d8d"
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
  "session_id": "b72472a2-294f-441d-9ad0-f43101220f5a",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MzksImlhdCI6MTc5MzIwMTUzOSwianRpIjoiZTk1ZTRhMDEtMThjZi00NDA0LThmZmMtYjgyOTA1YzhjMDBlIiwic2lkIjoiYjcyNDcyYTItMjk0Zi00NDFkLTlhZDAtZjQzMTAxMjIwZjVhIn0.LljNgeLOZ3fbQSZPzWoDP15XQdmBXSTQekucL3qiw1Q",
  "access_expires_at": "2026-10-28T15:47:19.873178995Z",
  "refresh_token": "IDyIjASIvBKl4Bcf1fkxFx5dSMPY2kRcjBItzVq1Ht0",
  "refresh_expires_at": "2026-10-29T03:32:19.872603284Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b1c82ca-3b93-464d-98c1-b53f97fe13eb",
  "session_id": "d14e5d21-522d-44f6-80c4-09c82114585b",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/6b1c82ca-3b93-464d-98c1-b53f97fe13eb/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "1760cdc9-6f93-41ef-9de4-f07ce0c35846",
      "state": "READY",
      "created_at": "2026-10-28T15:32:10.595897Z",
      "ready_at": "2026-10-28T15:32:18.269725Z",
      "expires_at": "2026-11-04T15:32:18.269725Z",
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
  "device_ref": "sandbox-17693"
}
```

```json
{
  "challenge_id": "51f544a2-cf74-4d2c-b601-293d1d45542b",
  "expires_at": "2026-10-28T15:37:20.680378772Z",
  "resend_available_at": "2026-10-28T15:32:21.680378772Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "032899",
  "sent_at": "2026-10-28T15:32:20.682834534Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51f544a2-cf74-4d2c-b601-293d1d45542b",
  "code": "032899",
  "device_ref": "sandbox-17693"
}
```

```json
{
  "session_id": "333b0674-3c9d-4280-8f2c-9484a588c908",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQ0MCwiaWF0IjoxNzkzMjAxNTQwLCJqdGkiOiI3ZjgwNjI2MC05OWNjLTQyNmItODk1Zi0wNWFlMTQ0NTY5MjEiLCJzaWQiOiIzMzNiMDY3NC0zYzlkLTQyODAtOGYyYy05NDg0YTU4OGM5MDgifQ.n41jonpM-ycyJHSTe2A8p0d-2R0IGK0m7dY3qaf3YVs",
  "access_expires_at": "2026-10-28T15:47:20.972246809Z",
  "refresh_token": "uXHw9XU2D-FA3-fDmtPQAdNUrYpWrapvL2epaOsVly0",
  "refresh_expires_at": "2026-11-27T15:32:20.971572934Z",
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
  "device_ref": "sandbox-25782"
}
```

```json
{
  "challenge_id": "bd71c240-b08e-4fde-a70d-28b67d96132d",
  "expires_at": "2026-10-28T15:37:21.50249988Z",
  "resend_available_at": "2026-10-28T15:32:22.50249988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "255130",
  "sent_at": "2026-10-28T15:32:21.50512338Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd71c240-b08e-4fde-a70d-28b67d96132d",
  "code": "255130",
  "device_ref": "sandbox-25782"
}
```

```json
{
  "session_id": "411db930-4574-4087-87cb-1eac7f9d2a0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQ0MSwiaWF0IjoxNzkzMjAxNTQxLCJqdGkiOiJmZTdjMTM1Ni1hMTcyLTQ1ZjMtYjk1Ni01N2I2ODQyNWQwODQiLCJzaWQiOiI0MTFkYjkzMC00NTc0LTQwODctODdjYi0xZWFjN2Y5ZDJhMGQifQ.bhlh-bDoLhjz8CvzXxqrxfjf9pQqDspgeSMHTwy69D4",
  "access_expires_at": "2026-10-28T15:47:21.799567789Z",
  "refresh_token": "g7mcO3CYeHppwSlFALT6ZTaXQF5MT7OO4iOh8r7vCX0",
  "refresh_expires_at": "2026-11-27T15:32:21.798983672Z",
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
  "command_id": "901324d7-7223-4f8c-8e22-95bc5ece0127",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:32:22Z",
    "sequence": 1793201542348
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "15d0bf6e-21d5-46f0-bdb5-7bcb356ae39c",
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
  "last_heartbeat_at": "2026-10-28T15:32:22.367611Z",
  "last_location_at": "2026-10-28T15:32:22.367611Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-9908"
}
```

```json
{
  "challenge_id": "ca5049c4-697b-42e1-ae5f-bd7f672ec5f4",
  "expires_at": "2026-10-28T15:37:22.63723184Z",
  "resend_available_at": "2026-10-28T15:32:23.63723184Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "748190",
  "sent_at": "2026-10-28T15:32:22.639653042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca5049c4-697b-42e1-ae5f-bd7f672ec5f4",
  "code": "748190",
  "device_ref": "sandbox-9908"
}
```

```json
{
  "session_id": "ebce2c4e-b757-41ad-a558-59888197512c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQ0MiwiaWF0IjoxNzkzMjAxNTQyLCJqdGkiOiJmYTQzY2NmNi01YmY0LTQ5NmMtOTg0Ni1kOTFmZGE1ZjNhYTUiLCJzaWQiOiJlYmNlMmM0ZS1iNzU3LTQxYWQtYTU1OC01OTg4ODE5NzUxMmMifQ.gLDKDLX_EGHlBx0BqPSwzAfM1vP76LhQsLWTJ8HWFzA",
  "access_expires_at": "2026-10-28T15:47:22.934082578Z",
  "refresh_token": "mnwR3htHUOGHCZ1LDJB0PBeTqrWtQy8IfXZbqA6X5xw",
  "refresh_expires_at": "2026-11-27T15:32:22.933502488Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f3cb715c-1f67-40c9-b0b3-73020baefe01",
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
  "last_heartbeat_at": "2026-10-28T15:31:24.77284Z",
  "last_location_at": "2026-10-28T15:31:24.77284Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f3cb715c-1f67-40c9-b0b3-73020baefe01/handover` → **200**

```json
{
  "command_id": "eb31b046-62a0-4bbc-8a9d-98585b9e6829",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f3cb715c-1f67-40c9-b0b3-73020baefe01",
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
  "last_heartbeat_at": "2026-10-28T15:31:24.77284Z",
  "last_location_at": "2026-10-28T15:31:24.77284Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f3cb715c-1f67-40c9-b0b3-73020baefe01/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:32:23Z",
    "sequence": 1793201543747
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f3cb715c-1f67-40c9-b0b3-73020baefe01",
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
  "last_heartbeat_at": "2026-10-28T15:32:23.766833Z",
  "last_location_at": "2026-10-28T15:32:23.766833Z",
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
  "session_id": "bd73896d-2d21-4102-8fcf-ba91f60bb6d1",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0NDQsImlhdCI6MTc5MzIwMTU0NCwianRpIjoiOTdmZTE0MWMtNzcwYS00NTg3LWIwNDUtOTJkYWE4YjhkZGVlIiwic2lkIjoiYmQ3Mzg5NmQtMmQyMS00MTAyLThmY2YtYmE5MWY2MGJiNmQxIn0.IRb8w64sLb7YZ6FEjY0ndYCpDv6_vcEDU7xH1_48z2E",
  "access_expires_at": "2026-10-28T15:47:24.320193459Z",
  "refresh_token": "yG1xN9_dh3wr10YHCM2LEN0XnZaKg9xPjRJGVoWtJPA",
  "refresh_expires_at": "2026-10-29T03:32:24.319593693Z",
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
  "session_id": "eeefdb41-a3de-4f97-8435-71526e04bc8d",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0NDQsImlhdCI6MTc5MzIwMTU0NCwianRpIjoiZGY5YTljOWEtODNiZi00ZjFmLWE2ZTMtMGZjYTdhYjM0ZTU4Iiwic2lkIjoiZWVlZmRiNDEtYTNkZS00Zjk3LTg0MzUtNzE1MjZlMDRiYzhkIn0.AvqeT7aY9srEbNcxwWO8RslUnLLyFm1e5n2Qw3PCZDQ",
  "access_expires_at": "2026-10-28T15:47:24.874058681Z",
  "refresh_token": "3cp55ouLgQeRwSiXCy1V62H_VwwbwtojXg1HT6GNuGw",
  "refresh_expires_at": "2026-10-29T03:32:24.873497467Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686469967",
  "device_ref": "sandbox-28010"
}
```

```json
{
  "challenge_id": "294de714-3bdf-4358-bc61-65ee5e7a387e",
  "expires_at": "2026-10-28T15:37:25.131875865Z",
  "resend_available_at": "2026-10-28T15:32:26.131875865Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380686469967` → **200**

```json
{
  "phone": "+380686469967",
  "audience": "CLIENT",
  "code": "200658",
  "sent_at": "2026-10-28T15:32:25.13427437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "294de714-3bdf-4358-bc61-65ee5e7a387e",
  "code": "200658",
  "device_ref": "sandbox-28010"
}
```

```json
{
  "session_id": "5a2de2e3-f99b-465d-94ab-4b2f47ecfc51",
  "subject": {
    "type": "CLIENT",
    "id": "d3d939b1-9132-4006-9c09-2b8c7df8f4fa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2Q5MzliMS05MTMyLTQwMDYtOWMwOS0yYjhjN2RmOGY0ZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDQ1LCJpYXQiOjE3OTMyMDE1NDUsImp0aSI6IjY1NzBhNGRhLWZlOTQtNGIxYy1hN2RkLWI5ZmM3YmUxN2FhMyIsInNpZCI6IjVhMmRlMmUzLWY5OWItNDY1ZC05NGFiLTRiMmY0N2VjZmM1MSJ9.Xlrdeekj-tSez5uAtR_vyIaTnz29Cc0QpkyMZ86dP_w",
  "access_expires_at": "2026-10-28T15:47:25.419966572Z",
  "refresh_token": "X6r45JHh5LR_zgqjpa52GVB4pSiOkzy5s3UKNiIMZP4",
  "refresh_expires_at": "2026-11-27T15:32:25.419406721Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e177fe1b-8601-45b6-a3f3-21192354cdc1",
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
  "id": "3850c2d5-6afd-4f4d-9bc2-b11532d2673d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:25.685874Z",
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
  "command_id": "482b3f65-b349-48d9-8ca8-fd159db7cec6",
  "quote_id": "3850c2d5-6afd-4f4d-9bc2-b11532d2673d",
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
  "id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d3d939b1-9132-4006-9c09-2b8c7df8f4fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:32:25.970667Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6563a52f-9101-46af-a7be-895131800535",
    "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
    "expires_at": "2026-10-28T15:32:40.973953Z",
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

`POST /api/driver/v1/offers/6563a52f-9101-46af-a7be-895131800535/reject` → **204**

```json
{
  "command_id": "b9def513-bbd4-49a5-9626-1aa99957bdf8"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4cc047a3-db19-4979-8a9e-fb37cdf5d06d",
    "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
    "expires_at": "2026-10-28T15:32:41.540753Z",
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

`POST /api/driver/v1/offers/4cc047a3-db19-4979-8a9e-fb37cdf5d06d/accept` → **200**

```json
{
  "command_id": "83cbff81-f169-4d11-98f1-87b1f858299d"
}
```

```json
{
  "id": "f790dbcb-f9ef-4616-8d7a-187290ad5cb4",
  "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6bc2a2ca-a4ba-420c-8bd2-3ff5da850338",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/11cd92b7-1ad9-4eeb-8a98-3ad5c646e695/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:32:25.971228Z",
      "actor": {
        "type": "CLIENT",
        "id": "d3d939b1-9132-4006-9c09-2b8c7df8f4fa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
        "quote_id": "3850c2d5-6afd-4f4d-9bc2-b11532d2673d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6c941936-907b-4d6e-95ed-92ae416c2a17"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:32:25.973075Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
        "attempt_id": "e1ecfd7f-da37-454e-ba9f-e565f252605b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6c941936-907b-4d6e-95ed-92ae416c2a17"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:32:25.97988Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6563a52f-9101-46af-a7be-895131800535",
        "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "6c941936-907b-4d6e-95ed-92ae416c2a17"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T15:32:26.539717Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6563a52f-9101-46af-a7be-895131800535",
        "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695"
      },
      "correlation_id": "7f472c4c-10b7-44f6-ae8d-6a69c6f549b1"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 11cd92b7-1ad9-4eeb-8a98-3ad5c646e695 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/11cd92b7-1ad9-4eeb-8a98-3ad5c646e695` → **200**

```json
{
  "id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "d3d939b1-9132-4006-9c09-2b8c7df8f4fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "f790dbcb-f9ef-4616-8d7a-187290ad5cb4",
    "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6bc2a2ca-a4ba-420c-8bd2-3ff5da850338",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:32:25.970667Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/11cd92b7-1ad9-4eeb-8a98-3ad5c646e695/cancel` → **200**

```json
{
  "command_id": "5b5906ee-e4a3-4946-ac75-2b214a697fe1",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d3d939b1-9132-4006-9c09-2b8c7df8f4fa",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "f790dbcb-f9ef-4616-8d7a-187290ad5cb4",
    "order_id": "11cd92b7-1ad9-4eeb-8a98-3ad5c646e695",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6bc2a2ca-a4ba-420c-8bd2-3ff5da850338",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:32:25.970667Z",
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
  "session_id": "15d0bf6e-21d5-46f0-bdb5-7bcb356ae39c",
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
  "last_heartbeat_at": "2026-10-28T15:32:22.367611Z",
  "last_location_at": "2026-10-28T15:32:22.367611Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/15d0bf6e-21d5-46f0-bdb5-7bcb356ae39c/close` → **200**

```json
{
  "command_id": "cbafb2b2-4e08-4898-b80a-d1068d46c3ec",
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
  "session_id": "f3cb715c-1f67-40c9-b0b3-73020baefe01",
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
  "last_heartbeat_at": "2026-10-28T15:32:23.766833Z",
  "last_location_at": "2026-10-28T15:32:23.766833Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3cb715c-1f67-40c9-b0b3-73020baefe01/close` → **200**

```json
{
  "command_id": "f2cd5539-fb27-4a27-91d1-06e4f7b2e84e",
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

# Scenario: full-ride

## Start-up data for the apps

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
    "rider_android": null,
    "rider_ios": null,
    "driver_android": {
      "minimum_version": "9.0.0",
      "latest_version": "9.0.0"
    },
    "driver_ios": null,
    "require_version_header": false
  }
}
```

**Contract validation failed — scenario stopped.**

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
  "session_id": "decbdda0-1c62-4519-8283-569280b628b2",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0NDksImlhdCI6MTc5MzIwMTU0OSwianRpIjoiMTBmOTVlYzAtYTA3Mi00OWM1LTk2ODgtMGIxOGFiMWE2ZTk2Iiwic2lkIjoiZGVjYmRkYTAtMWM2Mi00NTE5LTgyODMtNTY5MjgwYjYyOGIyIn0.LEV-4x8lSoZLW_8YlsxpLgBdUIGWFRxSxQeYqwHPtqY",
  "access_expires_at": "2026-10-28T15:47:29.692653355Z",
  "refresh_token": "JHgX8Rb7PrOq2FBe1IKBvS04AhTgS8qqCoM3O7YaY44",
  "refresh_expires_at": "2026-10-29T03:32:29.692004072Z",
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
  "command_id": "368d38bd-931a-41d4-be56-c0fe73b532b6",
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
  "timestamp": "2026-10-28T15:32:30.000+0000",
  "channel": {
    "id": "1730052000.1353432313",
    "linkedid": "1730052000.1353432313",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671554906"
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
  "timestamp": "2026-10-28T15:32:30.000+0000",
  "channel": {
    "id": "1730052000.1353432313",
    "linkedid": "1730052000.1353432313",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671554906"
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
  "session_id": "191b3005-c497-46b2-b136-19b0fcd0372e",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0NTAsImlhdCI6MTc5MzIwMTU1MCwianRpIjoiNjcxYzY2N2QtYzY5Yy00MmE2LTk3ZDEtOGZhNGIwNDgzNWI3Iiwic2lkIjoiMTkxYjMwMDUtYzQ5Ny00NmIyLWIxMzYtMTliMGZjZDAzNzJlIn0.X7FskEwavWgKY4WaPt_dchY_CWodAcpQXWTfgTmkBUE",
  "access_expires_at": "2026-10-28T15:47:30.825894471Z",
  "refresh_token": "abrvtAeUcrYdQd9uLcSrCxztTbgr_EbSG4t6Nfvlfos",
  "refresh_expires_at": "2026-10-29T03:32:30.825351531Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "c29acabf-d0bf-4e89-8f4a-b7f80c441541",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671554906",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:32:30Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/c29acabf-d0bf-4e89-8f4a-b7f80c441541/answer` → **200**

```json
{
  "command_id": "c86f841f-4952-4ab0-bc90-51afa7f3c1bc"
}
```

```json
{
  "id": "c29acabf-d0bf-4e89-8f4a-b7f80c441541",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671554906",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "order_ids": [],
  "started_at": "2026-10-28T15:32:30Z",
  "answered_at": "2026-10-28T15:32:31.384634Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1353432313",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "600f8ef5-1256-402d-998f-63176ea05066",
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
  "id": "b1c3b363-2224-4663-b124-9da5b22a70c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:31.691150Z",
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
  "command_id": "a2792657-8929-4875-9ad8-7ebc324ef9a7",
  "quote_id": "b1c3b363-2224-4663-b124-9da5b22a70c3",
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
    "phone": "+380671554906"
  },
  "call_id": "c29acabf-d0bf-4e89-8f4a-b7f80c441541"
}
```

```json
{
  "id": "19534dfe-967a-4fa0-958d-e38d82c0b959",
  "short_number": 7,
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
  "created_at": "2026-10-28T15:32:31.985862Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671554906"
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
    "id": "1730052000.1353432313",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "c29acabf-d0bf-4e89-8f4a-b7f80c441541",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671554906",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [
        "19534dfe-967a-4fa0-958d-e38d82c0b959"
      ],
      "started_at": "2026-10-28T15:32:30Z",
      "answered_at": "2026-10-28T15:32:31.384634Z",
      "ended_at": "2026-10-28T15:32:32.280512Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "c29786a9-5023-4493-bc79-394c52ee64fc",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380677974511",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [],
      "started_at": "2026-10-28T15:31:11.942629Z",
      "answered_at": "2026-10-28T15:31:12.243712Z",
      "ended_at": "2026-10-28T15:31:12.543883Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:31:18.26587Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/19534dfe-967a-4fa0-958d-e38d82c0b959` → **200**

```json
{
  "id": "19534dfe-967a-4fa0-958d-e38d82c0b959",
  "short_number": 7,
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
  "created_at": "2026-10-28T15:32:31.985862Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671554906"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/19534dfe-967a-4fa0-958d-e38d82c0b959` → **200**

```json
{
  "id": "19534dfe-967a-4fa0-958d-e38d82c0b959",
  "short_number": 7,
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
  "created_at": "2026-10-28T15:32:31.985862Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671554906"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/19534dfe-967a-4fa0-958d-e38d82c0b959/cancel` → **200**

```json
{
  "command_id": "62d1abb3-e1cd-48d7-aaac-e28fbadb8c73",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "19534dfe-967a-4fa0-958d-e38d82c0b959",
  "short_number": 7,
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
  "created_at": "2026-10-28T15:32:31.985862Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671554906"
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

Done: call c29acabf-d0bf-4e89-8f4a-b7f80c441541 with order 19534dfe-967a-4fa0-958d-e38d82c0b959.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31619"
}
```

```json
{
  "challenge_id": "97befe37-67aa-48bf-ad9b-13d73f58f6c8",
  "expires_at": "2026-10-28T15:37:33.443748239Z",
  "resend_available_at": "2026-10-28T15:32:34.443748239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "493556",
  "sent_at": "2026-10-28T15:32:33.445971795Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97befe37-67aa-48bf-ad9b-13d73f58f6c8",
  "code": "493556",
  "device_ref": "sandbox-31619"
}
```

```json
{
  "session_id": "9f9c6050-f57f-4d46-8018-6c5abdfcb657",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQ1MywiaWF0IjoxNzkzMjAxNTUzLCJqdGkiOiI0YzJkZjhmMy0wYmI4LTQ3ZWYtOGI3NS05ZDkwYzM0MDFkNzIiLCJzaWQiOiI5ZjljNjA1MC1mNTdmLTRkNDYtODAxOC02YzVhYmRmY2I2NTcifQ.oUKQbNcRoL7V4b7bwYTMSwY8_GZ9wta1vUJqDH5Fo7o",
  "access_expires_at": "2026-10-28T15:47:33.739522379Z",
  "refresh_token": "xLs6mD59Y4kWpd_OOROI3fKF1hVFobcdsFWwZjn2QfI",
  "refresh_expires_at": "2026-11-27T15:32:33.738929917Z",
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
  "command_id": "b4ba6cc9-6dc6-4b06-846f-ecf973639147",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:32:34Z",
    "sequence": 1793201554270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1b8f24e-9f5a-48b6-afef-ed0b451a1744",
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
  "last_heartbeat_at": "2026-10-28T15:32:34.289794Z",
  "last_location_at": "2026-10-28T15:32:34.289794Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667785312",
  "device_ref": "sandbox-21293"
}
```

```json
{
  "challenge_id": "90f80908-a056-43ef-b2c1-b7096468fce5",
  "expires_at": "2026-10-28T15:37:34.557074251Z",
  "resend_available_at": "2026-10-28T15:32:35.557074251Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667785312` → **200**

```json
{
  "phone": "+380667785312",
  "audience": "CLIENT",
  "code": "506331",
  "sent_at": "2026-10-28T15:32:34.559211195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90f80908-a056-43ef-b2c1-b7096468fce5",
  "code": "506331",
  "device_ref": "sandbox-21293"
}
```

```json
{
  "session_id": "05aea88a-d480-422c-a261-e051eab1d6d6",
  "subject": {
    "type": "CLIENT",
    "id": "f994aa9f-beca-4bc9-aac3-67ff1515b8b6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOTk0YWE5Zi1iZWNhLTRiYzktYWFjMy02N2ZmMTUxNWI4YjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDU0LCJpYXQiOjE3OTMyMDE1NTQsImp0aSI6IjJkYTM2YmYxLTA3NjQtNGYwOS1iYWQ3LWI5M2UxODhjYjgyMSIsInNpZCI6IjA1YWVhODhhLWQ0ODAtNDIyYy1hMjYxLWUwNTFlYWIxZDZkNiJ9.oNwTtwVEZIAz7IcHygaC9cnLrEBtODJTCaThZlXvbsQ",
  "access_expires_at": "2026-10-28T15:47:34.844831858Z",
  "refresh_token": "e08pDcskAmJFgbC2ThNdy8JcPmpQcqZs9pXcr-RZvXQ",
  "refresh_expires_at": "2026-11-27T15:32:34.844244516Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "87c8d2ed-4ab3-44f8-92e9-cbe96e552c41",
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
  "id": "6cf7517d-e5ef-464a-8522-6e06d9d749f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:35.115943Z",
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
  "command_id": "c6236780-8f90-4836-ba15-c1edc2d7f487",
  "quote_id": "6cf7517d-e5ef-464a-8522-6e06d9d749f3",
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
  "id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f994aa9f-beca-4bc9-aac3-67ff1515b8b6",
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
  "created_at": "2026-10-28T15:32:35.391546Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4fb36932-f7c3-433b-9feb-9b8b1174eec2",
    "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
    "expires_at": "2026-10-28T15:32:50.394825Z",
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

`POST /api/driver/v1/offers/4fb36932-f7c3-433b-9feb-9b8b1174eec2/accept` → **200**

```json
{
  "command_id": "38743675-ba22-4630-abef-12d22af03e86"
}
```

```json
{
  "id": "56c3f097-dc1d-4c64-9507-a2a700f1f33a",
  "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b548f05f-72a3-4a5b-acde-21daeb6ec550",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b548f05f-72a3-4a5b-acde-21daeb6ec550",
  "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
  "assignment_id": "56c3f097-dc1d-4c64-9507-a2a700f1f33a",
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

`POST /api/driver/v1/work-sessions/f1b8f24e-9f5a-48b6-afef-ed0b451a1744/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:32:36Z",
    "sequence": 1793201556476
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1b8f24e-9f5a-48b6-afef-ed0b451a1744",
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
  "last_heartbeat_at": "2026-10-28T15:32:36.496077Z",
  "last_location_at": "2026-10-28T15:32:36.496077Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b548f05f-72a3-4a5b-acde-21daeb6ec550/arrive` → **200**

```json
{
  "command_id": "2b820678-5b42-4729-b500-0c83da89d08a",
  "expected_version": 0
}
```

```json
{
  "id": "b548f05f-72a3-4a5b-acde-21daeb6ec550",
  "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
  "assignment_id": "56c3f097-dc1d-4c64-9507-a2a700f1f33a",
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
  "arrived_at": "2026-10-28T15:32:36.76846Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b548f05f-72a3-4a5b-acde-21daeb6ec550/start` → **200**

```json
{
  "command_id": "36aaf574-469e-4505-8488-31b700e3a88d",
  "expected_version": 1
}
```

```json
{
  "id": "b548f05f-72a3-4a5b-acde-21daeb6ec550",
  "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
  "assignment_id": "56c3f097-dc1d-4c64-9507-a2a700f1f33a",
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
  "arrived_at": "2026-10-28T15:32:36.76846Z",
  "started_at": "2026-10-28T15:32:37.049796Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/f1b8f24e-9f5a-48b6-afef-ed0b451a1744/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:32:37Z",
    "sequence": 1793201557314
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1b8f24e-9f5a-48b6-afef-ed0b451a1744",
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
  "last_heartbeat_at": "2026-10-28T15:32:37.334494Z",
  "last_location_at": "2026-10-28T15:32:37.334494Z",
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
  "device_ref": "sandbox-4652"
}
```

```json
{
  "challenge_id": "7e41dc5f-9268-49bf-b070-9fa3528bebcc",
  "expires_at": "2026-10-28T15:37:37.596557521Z",
  "resend_available_at": "2026-10-28T15:32:38.596557521Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "362442",
  "sent_at": "2026-10-28T15:32:37.599153833Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e41dc5f-9268-49bf-b070-9fa3528bebcc",
  "code": "362442",
  "device_ref": "sandbox-4652"
}
```

```json
{
  "session_id": "decb36dd-c687-4926-809c-df7c87ed2850",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQ1NywiaWF0IjoxNzkzMjAxNTU3LCJqdGkiOiJmZjMxY2JmMi00ZWVmLTQ2ZjAtYTFkNi0zZmFjZDRjOTVkODgiLCJzaWQiOiJkZWNiMzZkZC1jNjg3LTQ5MjYtODA5Yy1kZjdjODdlZDI4NTAifQ.U66dwoanNCn1AiUeuMaCT--9JJPqx94D5un8TDlPKcg",
  "access_expires_at": "2026-10-28T15:47:37.886670207Z",
  "refresh_token": "2ygvZk-1cnyLG2PBtmq5TYp2B7QPrVcD5wLnx3Ty4zo",
  "refresh_expires_at": "2026-11-27T15:32:37.88613997Z",
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
  "command_id": "12daf933-50f3-405e-9292-a7afc3e120eb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:32:38Z",
    "sequence": 1793201558423
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b",
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
  "last_heartbeat_at": "2026-10-28T15:32:38.441632Z",
  "last_location_at": "2026-10-28T15:32:38.441632Z",
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
  "session_id": "fce1d769-174f-4e22-953e-7ea1c4818ae0",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0NTgsImlhdCI6MTc5MzIwMTU1OCwianRpIjoiNzUwOGYyYWItNmNkZC00Njc0LWExNzktNmNmYjFjZTdlYWI0Iiwic2lkIjoiZmNlMWQ3NjktMTc0Zi00ZTIyLTk1M2UtN2VhMWM0ODE4YWUwIn0.yvGHjDGtDYgelgk0VZa8CVEBzKxBP1O80hyVzsBa_F4",
  "access_expires_at": "2026-10-28T15:47:38.996614605Z",
  "refresh_token": "0U9RFCVBENHsOjyDwX_I5hChZXX5A7mdnBcfV-0N3xs",
  "refresh_expires_at": "2026-10-29T03:32:38.99596316Z",
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
  "session_id": "a59eb7be-da57-425b-ad03-5f0aac890bee",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0NTksImlhdCI6MTc5MzIwMTU1OSwianRpIjoiNjJhOGQ2ODItNzdlMS00MThmLWIwODItMDNmMWE1ZmEzZDQ2Iiwic2lkIjoiYTU5ZWI3YmUtZGE1Ny00MjViLWFkMDMtNWYwYWFjODkwYmVlIn0.yYgDfdrSG8rHKktc4do1jWirC1hLasfsXhkAmZbGdX8",
  "access_expires_at": "2026-10-28T15:47:39.554493688Z",
  "refresh_token": "kSbtSurskQccBKWjn11mTz23MyXeZp9ykTgJuBLg-BY",
  "refresh_expires_at": "2026-10-29T03:32:39.553828322Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b5363332-3c87-4b4e-ba0a-6786ca48867f` → **200**

```json
{
  "id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f994aa9f-beca-4bc9-aac3-67ff1515b8b6",
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
    "id": "56c3f097-dc1d-4c64-9507-a2a700f1f33a",
    "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b548f05f-72a3-4a5b-acde-21daeb6ec550",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T15:32:35.391546Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b5363332-3c87-4b4e-ba0a-6786ca48867f/interrupt` → **200**

```json
{
  "command_id": "c3efc30d-0d7e-44b6-85db-12134f40b393",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "f994aa9f-beca-4bc9-aac3-67ff1515b8b6",
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
      "id": "56c3f097-dc1d-4c64-9507-a2a700f1f33a",
      "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b548f05f-72a3-4a5b-acde-21daeb6ec550",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T15:32:35.391546Z",
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
    "id": "d68db7de-14b5-4cc1-a5ab-10a80bbf7227",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "f994aa9f-beca-4bc9-aac3-67ff1515b8b6",
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
    "id": "3424eba8-9d61-446d-9fe2-699878f7da74",
    "order_id": "d68db7de-14b5-4cc1-a5ab-10a80bbf7227",
    "expires_at": "2026-10-28T15:32:55.118628Z",
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

`POST /api/driver/v1/offers/3424eba8-9d61-446d-9fe2-699878f7da74/accept` → **200**

```json
{
  "command_id": "e227ccc5-da5b-48af-a5d1-9c41e0ec82a1"
}
```

```json
{
  "id": "ec6bc6e7-61cb-4a30-8616-1a39ab41bf08",
  "order_id": "d68db7de-14b5-4cc1-a5ab-10a80bbf7227",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b8c5cec4-15ba-40d5-899b-efe9df63e733",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b8c5cec4-15ba-40d5-899b-efe9df63e733",
  "order_id": "d68db7de-14b5-4cc1-a5ab-10a80bbf7227",
  "assignment_id": "ec6bc6e7-61cb-4a30-8616-1a39ab41bf08",
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
  "session_id": "a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b",
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
  "last_heartbeat_at": "2026-10-28T15:32:38.441632Z",
  "last_location_at": "2026-10-28T15:32:38.441632Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:32:41Z",
    "sequence": 1793201561489
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b",
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
  "last_heartbeat_at": "2026-10-28T15:32:41.5114Z",
  "last_location_at": "2026-10-28T15:32:41.5114Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b8c5cec4-15ba-40d5-899b-efe9df63e733/arrive` → **200**

```json
{
  "command_id": "c4b1724f-e0d0-40f9-8e1c-e4d04fac21f3",
  "expected_version": 0
}
```

```json
{
  "id": "b8c5cec4-15ba-40d5-899b-efe9df63e733",
  "order_id": "d68db7de-14b5-4cc1-a5ab-10a80bbf7227",
  "assignment_id": "ec6bc6e7-61cb-4a30-8616-1a39ab41bf08",
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
  "arrived_at": "2026-10-28T15:32:41.782876Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b8c5cec4-15ba-40d5-899b-efe9df63e733/start` → **200**

```json
{
  "command_id": "3485b24d-7de2-47a4-981b-ac99dccdba6c",
  "expected_version": 1
}
```

```json
{
  "id": "b8c5cec4-15ba-40d5-899b-efe9df63e733",
  "order_id": "d68db7de-14b5-4cc1-a5ab-10a80bbf7227",
  "assignment_id": "ec6bc6e7-61cb-4a30-8616-1a39ab41bf08",
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
  "arrived_at": "2026-10-28T15:32:41.782876Z",
  "started_at": "2026-10-28T15:32:42.069249Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b8c5cec4-15ba-40d5-899b-efe9df63e733/complete` → **200**

```json
{
  "command_id": "c9dd5440-4fd6-4614-848e-834895c5295a",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:32:42Z"
}
```

```json
{
  "id": "b8c5cec4-15ba-40d5-899b-efe9df63e733",
  "order_id": "d68db7de-14b5-4cc1-a5ab-10a80bbf7227",
  "assignment_id": "ec6bc6e7-61cb-4a30-8616-1a39ab41bf08",
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
  "arrived_at": "2026-10-28T15:32:41.782876Z",
  "started_at": "2026-10-28T15:32:42.069249Z",
  "completed_at": "2026-10-28T15:32:42.353711Z",
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
    "id": "d68db7de-14b5-4cc1-a5ab-10a80bbf7227",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:32:40.107207Z",
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
    "id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
    "short_number": 8,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:32:35.391546Z",
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

`GET /api/operator/v1/orders/b5363332-3c87-4b4e-ba0a-6786ca48867f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:32:35.392065Z",
      "actor": {
        "type": "CLIENT",
        "id": "f994aa9f-beca-4bc9-aac3-67ff1515b8b6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
        "quote_id": "6cf7517d-e5ef-464a-8522-6e06d9d749f3",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "89231884-ef4c-4b37-a0c7-cceb5cc84875"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:32:35.393968Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
        "attempt_id": "eb1868f9-fe2f-4f5d-96b1-6e11843f6357",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "89231884-ef4c-4b37-a0c7-cceb5cc84875"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:32:35.39786Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4fb36932-f7c3-433b-9feb-9b8b1174eec2",
        "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "89231884-ef4c-4b37-a0c7-cceb5cc84875"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:32:35.945715Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4fb36932-f7c3-433b-9feb-9b8b1174eec2",
        "order_id": "b5363332-3c87-4b4e-ba0a-6786ca48867f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "56c3f097-dc1d-4c64-9507-a2a700f1f33a"
      },
      "correlation_id": "9a03661f-0a6b-476f-a6c5-38ecfef16aa0"
```

Done: interrupted b5363332-3c87-4b4e-ba0a-6786ca48867f, follow-up d68db7de-14b5-4cc1-a5ab-10a80bbf7227.

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
  "session_id": "fd617967-094b-442f-88cc-14a3491b0f61",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0NjYsImlhdCI6MTc5MzIwMTU2NiwianRpIjoiN2ZhZjIwZTQtOWQ0Yy00OTUyLTk3OGItZGZjN2E0YjQ0YTQyIiwic2lkIjoiZmQ2MTc5NjctMDk0Yi00NDJmLTg4Y2MtMTRhMzQ5MWIwZjYxIn0.u_LvIAEHEUc4E8kvi-lDIUahVosNsDHGBcapDLpiLu4",
  "access_expires_at": "2026-10-28T15:47:46.763992748Z",
  "refresh_token": "3mUGM3MH9GTLPH9OqfqmhdhVJLRmy7Y5179l6dp1ftw",
  "refresh_expires_at": "2026-10-29T03:32:46.76336876Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a8d047c5-e01a-417e-a5c6-a0de54bcf119",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:32:47Z"
}
```

```json
{
  "id": "11dae227-cdcd-4bd0-a606-8f0f42c5f1b9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:32:47Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/11dae227-cdcd-4bd0-a606-8f0f42c5f1b9/publish` → **200**

```json
{
  "command_id": "7d6a2d47-b62d-4408-9aa9-b4d2e7805678",
  "expected_version": 0
}
```

```json
{
  "id": "11dae227-cdcd-4bd0-a606-8f0f42c5f1b9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:32:47.320489Z",
  "published_at": "2026-10-28T15:32:47.320489Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "11dae227-cdcd-4bd0-a606-8f0f42c5f1b9",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T15:32:47.320489Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635413858",
  "device_ref": "sandbox-18339"
}
```

```json
{
  "challenge_id": "46e9455a-0636-48a4-8202-d14b4051a00c",
  "expires_at": "2026-10-28T15:37:47.857413814Z",
  "resend_available_at": "2026-10-28T15:32:48.857413814Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635413858` → **200**

```json
{
  "phone": "+380635413858",
  "audience": "CLIENT",
  "code": "563641",
  "sent_at": "2026-10-28T15:32:47.859755593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46e9455a-0636-48a4-8202-d14b4051a00c",
  "code": "563641",
  "device_ref": "sandbox-18339"
}
```

```json
{
  "session_id": "ac30613a-809d-42bc-906e-b1b08c33dc90",
  "subject": {
    "type": "CLIENT",
    "id": "e0dbd673-8aee-4056-ab84-1027e17905b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMGRiZDY3My04YWVlLTQwNTYtYWI4NC0xMDI3ZTE3OTA1YjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDY4LCJpYXQiOjE3OTMyMDE1NjgsImp0aSI6IjY1NzNhNWFmLWFlYTctNDgwMi1iYmZiLWVmZTI2YTIzZDkzZSIsInNpZCI6ImFjMzA2MTNhLTgwOWQtNDJiYy05MDZlLWIxYjA4YzMzZGM5MCJ9.DCOtEXDnQqOkW3FupWzmoHQhuy9atWYaxuqeMf2DDuM",
  "access_expires_at": "2026-10-28T15:47:48.143337751Z",
  "refresh_token": "dEigVzbodULpdZ_Z9iG5pKakTsyJdYuFh8paC5A9Rko",
  "refresh_expires_at": "2026-11-27T15:32:48.142785674Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "11dae227-cdcd-4bd0-a606-8f0f42c5f1b9",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T15:32:47.320489Z",
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
  "command_id": "3f44b6f3-dbb6-4c11-a008-b9437f0a6fcb",
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
  "id": "aed54afe-a2d8-4521-b8d6-ce9f52e82629",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:48.687486Z",
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
  "command_id": "f19c5dcd-2549-4a62-baa3-78b6016dba74",
  "quote_id": "aed54afe-a2d8-4521-b8d6-ce9f52e82629",
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
  "correlation_id": "e81d955d-2365-4182-9a11-4c47f87ac069"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "a3d9fe05-47b2-4f84-b1e1-6829699b82e5",
  "version_id": "11dae227-cdcd-4bd0-a606-8f0f42c5f1b9",
  "language": "uk"
}
```

```json
{
  "version_id": "11dae227-cdcd-4bd0-a606-8f0f42c5f1b9",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T15:32:49.24914Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa34194d-4480-4a67-8536-028c61258b04",
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
  "id": "1499952f-af55-4e16-96e6-7e7a04b72c4f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:49.524906Z",
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
  "command_id": "c4d80cb5-5485-4653-bd01-242fa3082283",
  "quote_id": "1499952f-af55-4e16-96e6-7e7a04b72c4f",
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
  "id": "00cced79-2ed7-45a2-99fe-9240e78fafdc",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0dbd673-8aee-4056-ab84-1027e17905b8",
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
  "created_at": "2026-10-28T15:32:49.798477Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/00cced79-2ed7-45a2-99fe-9240e78fafdc` → **200**

```json
{
  "id": "00cced79-2ed7-45a2-99fe-9240e78fafdc",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e0dbd673-8aee-4056-ab84-1027e17905b8",
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
  "created_at": "2026-10-28T15:32:49.798477Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/00cced79-2ed7-45a2-99fe-9240e78fafdc/cancel` → **200**

```json
{
  "command_id": "73e07f76-e437-4bb8-a1fc-6ddcbdf54c74",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "00cced79-2ed7-45a2-99fe-9240e78fafdc",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e0dbd673-8aee-4056-ab84-1027e17905b8",
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
  "created_at": "2026-10-28T15:32:49.798477Z",
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
  "discount_minor": 0
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/11dae227-cdcd-4bd0-a606-8f0f42c5f1b9` → **409**

```json
{
  "command_id": "103b92b9-7032-4460-9dc0-45dcf950cad2",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:32:50Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/11dae227-cdcd-4bd0-a606-8f0f42c5f1b9",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "79a61da0-c48f-475a-91a0-265b09a028cd"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a36ecd34-e3d6-4206-b202-7a12c3126fc8",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:32:50Z"
}
```

```json
{
  "id": "66a838fe-a9f6-4b0d-90ab-04066a77d9ae",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:32:50Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/66a838fe-a9f6-4b0d-90ab-04066a77d9ae/publish` → **200**

```json
{
  "command_id": "af51de44-1f59-4e43-b855-8b2c81c03088",
  "expected_version": 0
}
```

```json
{
  "id": "66a838fe-a9f6-4b0d-90ab-04066a77d9ae",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:32:51.216128Z",
  "published_at": "2026-10-28T15:32:51.216128Z",
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
  "device_ref": "sandbox-473"
}
```

```json
{
  "challenge_id": "fa9e4f3f-ba89-4f60-a959-d80e5f74a8e8",
  "expires_at": "2026-10-28T15:37:51.487862301Z",
  "resend_available_at": "2026-10-28T15:32:52.487862301Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "514332",
  "sent_at": "2026-10-28T15:32:51.489978108Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa9e4f3f-ba89-4f60-a959-d80e5f74a8e8",
  "code": "514332",
  "device_ref": "sandbox-473"
}
```

```json
{
  "session_id": "2146c055-614d-4898-aa36-0748b480842f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQ3MSwiaWF0IjoxNzkzMjAxNTcxLCJqdGkiOiJjZGQ3YjJiYS0wNzQ0LTQyZTUtOTk3MC03MTgzM2ViOTRmNTAiLCJzaWQiOiIyMTQ2YzA1NS02MTRkLTQ4OTgtYWEzNi0wNzQ4YjQ4MDg0MmYifQ.fg0z_04Bwqjxl_KHx6LzkRYtRosaM6Ot_4a8DwtbcRc",
  "access_expires_at": "2026-10-28T15:47:51.799693299Z",
  "refresh_token": "QTj5L2thyo4vTSDCbFOoGPuPou78tScgyIWKvZZ0-WY",
  "refresh_expires_at": "2026-11-27T15:32:51.799162653Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b",
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
  "last_heartbeat_at": "2026-10-28T15:32:41.5114Z",
  "last_location_at": "2026-10-28T15:32:41.5114Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b/handover` → **200**

```json
{
  "command_id": "0a9ce97d-3cfe-4d3d-bf0f-7704d7d67cc0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b",
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
  "last_heartbeat_at": "2026-10-28T15:32:41.5114Z",
  "last_location_at": "2026-10-28T15:32:41.5114Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:32:52Z",
    "sequence": 1793201572601
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b",
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
  "last_heartbeat_at": "2026-10-28T15:32:52.621469Z",
  "last_location_at": "2026-10-28T15:32:52.621469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670028011",
  "device_ref": "sandbox-14700"
}
```

```json
{
  "challenge_id": "06f82ae3-517f-49d5-9f18-60b5de622353",
  "expires_at": "2026-10-28T15:37:52.890874977Z",
  "resend_available_at": "2026-10-28T15:32:53.890874977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670028011` → **200**

```json
{
  "phone": "+380670028011",
  "audience": "CLIENT",
  "code": "531905",
  "sent_at": "2026-10-28T15:32:52.89364251Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "06f82ae3-517f-49d5-9f18-60b5de622353",
  "code": "531905",
  "device_ref": "sandbox-14700"
}
```

```json
{
  "session_id": "0dc223c0-729e-45a2-b3eb-0e8f75a16894",
  "subject": {
    "type": "CLIENT",
    "id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYTkzOGY0NS0zZmE4LTRlZWYtODlmMS04M2JhNDVhZDM0ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDczLCJpYXQiOjE3OTMyMDE1NzMsImp0aSI6ImY1ZjlkOWZjLTM5MzMtNDQ2Ny05Zjg2LWRmYjEwNzQzMWM3YSIsInNpZCI6IjBkYzIyM2MwLTcyOWUtNDVhMi1iM2ViLTBlOGY3NWExNjg5NCJ9.1ey6k7tYcuqdbFLpMuIz_C7iAknC5VrxxaBSPQLkTMY",
  "access_expires_at": "2026-10-28T15:47:53.18764456Z",
  "refresh_token": "3yWPSSfmVxyQ1hqZu8EMZ8W317SnIXKLRbcgsHkOeW4",
  "refresh_expires_at": "2026-11-27T15:32:53.186991989Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "626afe4a-f3c2-4fc3-8860-1feffe76a155",
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
  "id": "4d242b25-d9bb-4571-b0bb-d7dc1d012e68",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:53.459427Z",
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
  "command_id": "9218cdc4-951f-4eb8-8d90-ee934263fc03",
  "quote_id": "4d242b25-d9bb-4571-b0bb-d7dc1d012e68",
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
    "phone": "+380674204817"
  }
}
```

```json
{
  "id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:32:53.734718Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ef5f8e2d-8041-43eb-bc37-d0e62d7777c0",
    "order_id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
    "expires_at": "2026-10-28T15:33:08.73879Z",
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

`POST /api/driver/v1/offers/ef5f8e2d-8041-43eb-bc37-d0e62d7777c0/accept` → **200**

```json
{
  "command_id": "2780fa31-bd06-4d6c-8767-22b66144fbb1"
}
```

```json
{
  "id": "d4c2507d-c631-4b16-b45e-9d783e54672b",
  "order_id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e430a86f-1689-48d8-a3be-e962e9c49921",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e430a86f-1689-48d8-a3be-e962e9c49921",
  "order_id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
  "assignment_id": "d4c2507d-c631-4b16-b45e-9d783e54672b",
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
    "phone": "+380674204817"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f8f0410a-877d-4551-b17b-cda51125cecf",
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
  "id": "61cca24f-d20f-4544-9575-3359ae00b37a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:54.849133Z",
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
  "command_id": "ed133b01-9fad-4a77-999a-4274fe226b97",
  "quote_id": "61cca24f-d20f-4544-9575-3359ae00b37a",
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
  "id": "5306caa9-1a61-4af5-954a-978a9e74ab61",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T15:32:55.126737Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ed4e3816-6649-464c-8690-936dfd571333",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T18:32:55Z"
}
```

```json
{
  "id": "71bb795b-3357-4e30-b006-eaf5085eb3d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:55.424776Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:32:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "89f9a254-e856-4afc-a0d4-53cfc04f0f49",
  "quote_id": "71bb795b-3357-4e30-b006-eaf5085eb3d6",
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
  "pickup_at": "2026-10-28T18:32:55Z"
}
```

```json
{
  "id": "ed146107-6382-4253-869e-0f087f865bca",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:32:55.709562Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:32:55Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e5b7e4f-a41a-4ad7-a834-d3c1145c40ee",
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
  "id": "ef1984cf-6d84-4918-ae35-4840d2bcbb56",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:37:56.000818Z",
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
  "command_id": "93944a12-59d7-4e58-826c-9a03cdb4b47e",
  "quote_id": "ef1984cf-6d84-4918-ae35-4840d2bcbb56",
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
  "correlation_id": "06acaee7-565b-40a6-9828-622f37959c53"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "ed146107-6382-4253-869e-0f087f865bca",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T15:32:55.709562Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T18:32:55Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "5306caa9-1a61-4af5-954a-978a9e74ab61",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T15:32:55.126737Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "5306caa9-1a61-4af5-954a-978a9e74ab61",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T15:32:55.126737Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/5c56af70-f927-49a0-92b4-41c82f7d2cd4` → **200**

```json
{
  "id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d4c2507d-c631-4b16-b45e-9d783e54672b",
    "order_id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e430a86f-1689-48d8-a3be-e962e9c49921",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:32:53.734718Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5c56af70-f927-49a0-92b4-41c82f7d2cd4/cancel` → **200**

```json
{
  "command_id": "a7c18ea7-b450-4385-8a2a-2ac5d0e988ba",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d4c2507d-c631-4b16-b45e-9d783e54672b",
    "order_id": "5c56af70-f927-49a0-92b4-41c82f7d2cd4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e430a86f-1689-48d8-a3be-e962e9c49921",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:32:53.734718Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/5306caa9-1a61-4af5-954a-978a9e74ab61` → **200**

```json
{
  "id": "5306caa9-1a61-4af5-954a-978a9e74ab61",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T15:32:55.126737Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/5306caa9-1a61-4af5-954a-978a9e74ab61/cancel` → **200**

```json
{
  "command_id": "cffa37f0-7367-495b-a3df-8ec5f19acaea",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5306caa9-1a61-4af5-954a-978a9e74ab61",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:32:55.126737Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/ed146107-6382-4253-869e-0f087f865bca` → **200**

```json
{
  "id": "ed146107-6382-4253-869e-0f087f865bca",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:32:55.709562Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:32:55Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ed146107-6382-4253-869e-0f087f865bca/cancel` → **200**

```json
{
  "command_id": "1b4b2949-c385-4356-8b65-c8e8f01c4b3b",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ed146107-6382-4253-869e-0f087f865bca",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0a938f45-3fa8-4eef-89f1-83ba45ad34e2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:32:55.709562Z",
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
  "pickup_at": "2026-10-28T18:32:55Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b",
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
  "last_heartbeat_at": "2026-10-28T15:32:52.621469Z",
  "last_location_at": "2026-10-28T15:32:52.621469Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a8f2fdd7-5eea-49a0-9cc6-e4dfe18b200b/close` → **200**

```json
{
  "command_id": "d97a13c0-8b9a-4e43-8024-c0281e567da4",
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

Done: orders 5c56af70-f927-49a0-92b4-41c82f7d2cd4, 5306caa9-1a61-4af5-954a-978a9e74ab61, ed146107-6382-4253-869e-0f087f865bca.

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
  "session_id": "dcc5e35f-cc37-4008-b67f-125e0daa0520",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0NzksImlhdCI6MTc5MzIwMTU3OSwianRpIjoiZmQ4MzcxMTItMDhlMS00ZTU3LWE3MTUtOWEwMWQ3ZGM3NWMxIiwic2lkIjoiZGNjNWUzNWYtY2MzNy00MDA4LWI2N2YtMTI1ZTBkYWEwNTIwIn0.canCV4MnN4O0tVGTFVWWUmMLY-RxuspC1U1SNFqfoEg",
  "access_expires_at": "2026-10-28T15:47:59.608558576Z",
  "refresh_token": "i40TCaVmBPbuygRcNmlzZO3eeew_Mzdi29kfles45uM",
  "refresh_expires_at": "2026-10-29T03:32:59.607995608Z",
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
  "session_id": "29907751-3991-40e5-805d-2a6222490c1f",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0ODAsImlhdCI6MTc5MzIwMTU4MCwianRpIjoiNmQ2MjgyYWUtZjZlNy00ZTE4LWJlN2MtODI0ZTMyZTAxNWU3Iiwic2lkIjoiMjk5MDc3NTEtMzk5MS00MGU1LTgwNWQtMmE2MjIyNDkwYzFmIn0.HsnLsoXHU3S9NLN0_xHYK5ypCcYpXq_JxlXaHkU42L0",
  "access_expires_at": "2026-10-28T15:48:00.162487081Z",
  "refresh_token": "m2pW8M4gSEVmKYkVvCSR4oh0pgE0Zyt-bcN8Km28Xoc",
  "refresh_expires_at": "2026-10-29T03:33:00.161911273Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16702"
}
```

```json
{
  "challenge_id": "e2071fc6-3d9a-4693-ace0-767202466926",
  "expires_at": "2026-10-28T15:38:00.418812586Z",
  "resend_available_at": "2026-10-28T15:33:01.418812586Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "963464",
  "sent_at": "2026-10-28T15:33:00.421324575Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2071fc6-3d9a-4693-ace0-767202466926",
  "code": "963464",
  "device_ref": "sandbox-16702"
}
```

```json
{
  "session_id": "978f210a-76cb-4bc4-9a31-275d92526cbc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQ4MCwiaWF0IjoxNzkzMjAxNTgwLCJqdGkiOiJjZTNiZWE3MS03MWYzLTRhZDYtOTU5Yy1lM2YwMjJkODc0NGUiLCJzaWQiOiI5NzhmMjEwYS03NmNiLTRiYzQtOWEzMS0yNzVkOTI1MjZjYmMifQ.MiD8R0Gvgvq4CHx876qHJQJVFOYs_vj50Y78l61pyzA",
  "access_expires_at": "2026-10-28T15:48:00.708840894Z",
  "refresh_token": "gMRgu_hdtAFATJHiXqZvqM_AJKDAWVu57Wnz-FQRpQ4",
  "refresh_expires_at": "2026-11-27T15:33:00.708294888Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1b8f24e-9f5a-48b6-afef-ed0b451a1744",
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
  "last_heartbeat_at": "2026-10-28T15:32:37.334494Z",
  "last_location_at": "2026-10-28T15:32:37.334494Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1b8f24e-9f5a-48b6-afef-ed0b451a1744/handover` → **200**

```json
{
  "command_id": "8342bba9-1c96-42e0-87b5-a4079f1884cb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1b8f24e-9f5a-48b6-afef-ed0b451a1744",
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
  "last_heartbeat_at": "2026-10-28T15:32:37.334494Z",
  "last_location_at": "2026-10-28T15:32:37.334494Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1b8f24e-9f5a-48b6-afef-ed0b451a1744/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:33:01Z",
    "sequence": 1793201581496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1b8f24e-9f5a-48b6-afef-ed0b451a1744",
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
  "last_heartbeat_at": "2026-10-28T15:33:01.516068Z",
  "last_location_at": "2026-10-28T15:33:01.516068Z",
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
  "command_id": "bd556e1d-517c-407c-aa7e-27b575e78886",
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
  "effective_at": "2026-10-28T15:33:02.068917Z",
  "changed_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "2155bcaf-5441-456a-8334-5423de150ccd",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T15:33:02.338164772Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6c43d16d-e786-48aa-9cc2-afaeb63d6af3",
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
  "id": "1acec878-f50c-4bc7-943e-00a1b0116d13",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:38:02.609908Z",
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
  "command_id": "c7d766cd-f630-43c4-a3dd-2e0946775341",
  "quote_id": "1acec878-f50c-4bc7-943e-00a1b0116d13",
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
    "phone": "+3806711127106"
  }
}
```

```json
{
  "id": "8b096983-79da-4058-913c-7d6d62c4d57a",
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
  "created_at": "2026-10-28T15:33:02.88424Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711127106"
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
    "id": "a2f43e15-c480-4c86-b416-6ec9a80a9e8c",
    "order_id": "8b096983-79da-4058-913c-7d6d62c4d57a",
    "expires_at": "2026-10-28T15:33:17.887857Z",
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

`POST /api/driver/v1/offers/a2f43e15-c480-4c86-b416-6ec9a80a9e8c/accept` → **200**

```json
{
  "command_id": "677bdd2a-7fc2-4f0f-b657-02a1e8f28483"
}
```

```json
{
  "id": "ca279aa2-7cf9-4fdd-bec3-5bea36f9cce4",
  "order_id": "8b096983-79da-4058-913c-7d6d62c4d57a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b614068e-ce25-4ba9-adc7-d1c1b0b7072b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b614068e-ce25-4ba9-adc7-d1c1b0b7072b",
  "order_id": "8b096983-79da-4058-913c-7d6d62c4d57a",
  "assignment_id": "ca279aa2-7cf9-4fdd-bec3-5bea36f9cce4",
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
    "phone": "+3806711127106"
  }
}
```

`POST /api/driver/v1/work-sessions/f1b8f24e-9f5a-48b6-afef-ed0b451a1744/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:33:03Z",
    "sequence": 1793201583949
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1b8f24e-9f5a-48b6-afef-ed0b451a1744",
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
  "last_heartbeat_at": "2026-10-28T15:33:03.96999Z",
  "last_location_at": "2026-10-28T15:33:03.96999Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b614068e-ce25-4ba9-adc7-d1c1b0b7072b/arrive` → **200**

```json
{
  "command_id": "2a364b73-84ca-4d59-a92d-96a66c55179b",
  "expected_version": 0
}
```

```json
{
  "id": "b614068e-ce25-4ba9-adc7-d1c1b0b7072b",
  "order_id": "8b096983-79da-4058-913c-7d6d62c4d57a",
  "assignment_id": "ca279aa2-7cf9-4fdd-bec3-5bea36f9cce4",
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
  "arrived_at": "2026-10-28T15:33:04.248616Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127106"
  }
}
```

`POST /api/driver/v1/trips/b614068e-ce25-4ba9-adc7-d1c1b0b7072b/start` → **200**

```json
{
  "command_id": "590b8653-c113-41a3-8c58-7d21c756bb91",
  "expected_version": 1
}
```

```json
{
  "id": "b614068e-ce25-4ba9-adc7-d1c1b0b7072b",
  "order_id": "8b096983-79da-4058-913c-7d6d62c4d57a",
  "assignment_id": "ca279aa2-7cf9-4fdd-bec3-5bea36f9cce4",
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
  "arrived_at": "2026-10-28T15:33:04.248616Z",
  "started_at": "2026-10-28T15:33:04.524752Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711127106"
  }
}
```

`POST /api/driver/v1/trips/b614068e-ce25-4ba9-adc7-d1c1b0b7072b/complete` → **200**

```json
{
  "command_id": "621db8e1-d727-4499-b65b-cac3f6f958ad",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:33:04Z",
  "cash_received": true
}
```

```json
{
  "id": "b614068e-ce25-4ba9-adc7-d1c1b0b7072b",
  "order_id": "8b096983-79da-4058-913c-7d6d62c4d57a",
  "assignment_id": "ca279aa2-7cf9-4fdd-bec3-5bea36f9cce4",
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
  "arrived_at": "2026-10-28T15:33:04.248616Z",
  "started_at": "2026-10-28T15:33:04.524752Z",
  "completed_at": "2026-10-28T15:33:04.81519Z",
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
  "command_id": "d99e68c4-c36b-4de3-b841-49b32afba081",
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
  "id": "50e3b223-9de7-4d81-9365-e495ef66ab74",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:38:05.092686Z",
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
  "command_id": "d1710475-2428-4923-aebd-436b843343de",
  "quote_id": "50e3b223-9de7-4d81-9365-e495ef66ab74",
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
    "phone": "+3806711111257"
  }
}
```

```json
{
  "id": "cb1d918c-75e1-4971-bf30-d98df3c79326",
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
  "created_at": "2026-10-28T15:33:05.376873Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111257"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/cb1d918c-75e1-4971-bf30-d98df3c79326` → **200**

```json
{
  "id": "cb1d918c-75e1-4971-bf30-d98df3c79326",
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
  "created_at": "2026-10-28T15:33:05.376873Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111257"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cb1d918c-75e1-4971-bf30-d98df3c79326/cancel` → **200**

```json
{
  "command_id": "9044f911-ac74-45d7-b4dd-906d4b1e85a8",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "cb1d918c-75e1-4971-bf30-d98df3c79326",
  "short_number": 15,
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
  "created_at": "2026-10-28T15:33:05.376873Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111257"
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
  "staff_id": "2155bcaf-5441-456a-8334-5423de150ccd",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T15:33:04.820266Z",
  "last_entries": [
    {
      "order_id": "cb1d918c-75e1-4971-bf30-d98df3c79326",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T15:33:05.971858Z"
    },
    {
      "order_id": "8b096983-79da-4058-913c-7d6d62c4d57a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T15:33:04.820266Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f1b8f24e-9f5a-48b6-afef-ed0b451a1744",
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
  "last_heartbeat_at": "2026-10-28T15:33:03.96999Z",
  "last_location_at": "2026-10-28T15:33:03.96999Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1b8f24e-9f5a-48b6-afef-ed0b451a1744/close` → **200**

```json
{
  "command_id": "8c4942c5-8aa7-4f2c-879d-b8e0633b432e",
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

Done: operator bonus for fulfilled 8b096983-79da-4058-913c-7d6d62c4d57a and operator-fault cancellation cb1d918c-75e1-4971-bf30-d98df3c79326.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672789854",
  "device_ref": "sandbox-9443"
}
```

```json
{
  "challenge_id": "0ac7e703-ef5a-4aed-8454-e5ecabbd0c13",
  "expires_at": "2026-10-28T15:38:09.120255008Z",
  "resend_available_at": "2026-10-28T15:33:10.120255008Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672789854` → **200**

```json
{
  "phone": "+380672789854",
  "audience": "CLIENT",
  "code": "518088",
  "sent_at": "2026-10-28T15:33:09.1227319Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672445616",
  "device_ref": "sandbox-2213",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "24a1810f-419a-4b60-85f4-ba81b85de9c1",
  "expires_at": "2026-10-28T15:38:09.437103864Z",
  "resend_available_at": "2026-10-28T15:33:10.437103864Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672445616` → **200**

```json
{
  "phone": "+380672445616",
  "audience": "CLIENT",
  "code": "550087",
  "sent_at": "2026-10-28T15:33:09.439606365Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676390000",
  "device_ref": "sandbox-25047"
}
```

```json
{
  "challenge_id": "aeaf49ee-cec0-46db-982e-67b057ee8077",
  "expires_at": "2026-10-28T15:38:09.73795511Z",
  "resend_available_at": "2026-10-28T15:33:10.73795511Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676390000` → **200**

```json
{
  "phone": "+380676390000",
  "audience": "CLIENT",
  "code": "937197",
  "sent_at": "2026-10-28T15:33:09.740816284Z",
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
  "session_id": "f5ff6044-4126-4ab2-8fc3-323216e912ca",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0OTAsImlhdCI6MTc5MzIwMTU5MCwianRpIjoiMDQ4ZTgwNmYtMDJmNi00YTQ4LTk1ZTAtODE5MGQxYWRiYzIzIiwic2lkIjoiZjVmZjYwNDQtNDEyNi00YWIyLThmYzMtMzIzMjE2ZTkxMmNhIn0.6QwVw_cgi3t0lThxocYLt55srkLOXHrX_SzeWKaMcrI",
  "access_expires_at": "2026-10-28T15:48:10.32693657Z",
  "refresh_token": "6-9PrOAwG5xjbMEFQTosmtl5_XEQ2qD3wx6UUT308xQ",
  "refresh_expires_at": "2026-10-29T03:33:10.326350388Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676390000` → **200**

```json
{
  "deliveries": [
    {
      "id": "ae73ef36-fe68-4942-b330-b036a5759a42",
      "challenge_id": "aeaf49ee-cec0-46db-982e-67b057ee8077",
      "phone": "+380676390000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-dab18dfe-41ce-4584-bc8c-da9eee178971",
      "error": null,
      "attempted_at": "2026-10-28T15:33:09.741107Z"
    },
    {
      "id": "e4870969-194e-4ff9-8c70-abc58a237838",
      "challenge_id": "aeaf49ee-cec0-46db-982e-67b057ee8077",
      "phone": "+380676390000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T15:33:09.740319Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676390000` → **200**

```json
{
  "phone": "+380676390000",
  "audience": "CLIENT",
  "code": "937197",
  "sent_at": "2026-10-28T15:33:09.740816284Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672445616` → **200**

```json
{
  "deliveries": [
    {
      "id": "fd17d44d-c3ab-4055-bc00-756fa91c70b3",
      "challenge_id": "24a1810f-419a-4b60-85f4-ba81b85de9c1",
      "phone": "+380672445616",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b6997a1a-568d-467f-84fd-db7d8d2b3d2e",
      "error": null,
      "attempted_at": "2026-10-28T15:33:09.439888Z"
    }
  ]
}
```

Done: SMS to +380672789854, a call to +380672445616, SMS then a call to +380676390000.

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
  "session_id": "246d43a7-e137-4eb9-9b63-48b95223d2a6",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0OTEsImlhdCI6MTc5MzIwMTU5MSwianRpIjoiNTYwM2ViMDEtOWUzZS00ODg3LTliNzktNmQ1ZmJjYWJhODQzIiwic2lkIjoiMjQ2ZDQzYTctZTEzNy00ZWI5LTliNjMtNDhiOTUyMjNkMmE2In0.WF6O_FM9ESDlSKZ3_kl3nu9QmLLiD8CbJbZfxrR8RrI",
  "access_expires_at": "2026-10-28T15:48:11.462082056Z",
  "refresh_token": "VYBQXG3Q7U0vlCCZmLsSqOjNlEI6BsLNWZXKqwqyqp4",
  "refresh_expires_at": "2026-10-29T03:33:11.461561628Z",
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
  "session_id": "6d8e5ad3-1de0-4a22-a22f-0c90acd61c9a",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0OTIsImlhdCI6MTc5MzIwMTU5MiwianRpIjoiYWZhMmMwMTEtNjI0YS00OWJjLThmYTYtNTc1MDQ1NTVlM2Q1Iiwic2lkIjoiNmQ4ZTVhZDMtMWRlMC00YTIyLWEyMmYtMGM5MGFjZDYxYzlhIn0.6irF4me6wrFxu99T7yZG3KLsVfb32BoxOUvWiDCCV9M",
  "access_expires_at": "2026-10-28T15:48:12.013045545Z",
  "refresh_token": "MHlFFA5deqqPEB1yyim5SfJGXfI1H7D-0TpdX0DdYUo",
  "refresh_expires_at": "2026-10-29T03:33:12.012505991Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "2155bcaf-5441-456a-8334-5423de150ccd",
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
    "promotions.manage",
    "support.manage",
    "clients.manage",
    "clients.delete",
    "operator-bonuses.manage",
    "settings.manage",
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

`POST /api/admin/v1/staff-extensions/2155bcaf-5441-456a-8334-5423de150ccd` → **200**

```json
{
  "command_id": "1c4dfff2-49eb-4fbc-a28e-c932ff7d42e3",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "2155bcaf-5441-456a-8334-5423de150ccd",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "c90f2244-0090-40c4-b668-46351b81ca6e",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:33:13.081908Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:33:13.081908Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7524e4f2-803a-4cb5-8b2b-1bac35c74f0e",
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
  "id": "7fb30926-b6c0-4895-b141-8e39f8bf31e3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:38:13.613773Z",
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
  "command_id": "9a6fefae-7e01-4e48-8050-a77c065ed805",
  "quote_id": "7fb30926-b6c0-4895-b141-8e39f8bf31e3",
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
    "phone": "+380673229952"
  }
}
```

```json
{
  "id": "284f6fdc-1f98-4298-8e32-7aa7b0f66298",
  "short_number": 16,
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
  "created_at": "2026-10-28T15:33:13.896148Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673229952"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/284f6fdc-1f98-4298-8e32-7aa7b0f66298/calls` → **201**

```json
{
  "command_id": "092b18a5-7aed-4dfd-8d2d-c39a150db932",
  "to": "CALLER"
}
```

```json
{
  "id": "20358af7-ce2e-43da-b86e-897c2dc2b296",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "order_ids": [
    "284f6fdc-1f98-4298-8e32-7aa7b0f66298"
  ],
  "started_at": "2026-10-28T15:33:14.193434Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/284f6fdc-1f98-4298-8e32-7aa7b0f66298/calls` → **201**

```json
{
  "command_id": "092b18a5-7aed-4dfd-8d2d-c39a150db932",
  "to": "CALLER"
}
```

```json
{
  "id": "20358af7-ce2e-43da-b86e-897c2dc2b296",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "order_ids": [
    "284f6fdc-1f98-4298-8e32-7aa7b0f66298"
  ],
  "started_at": "2026-10-28T15:33:14.193434Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "20358af7-ce2e-43da-b86e-897c2dc2b296",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673229952",
    "at": "2026-10-28T15:33:14.195452711Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "20358af7-ce2e-43da-b86e-897c2dc2b296",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.8881",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "20358af7-ce2e-43da-b86e-897c2dc2b296"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "20358af7-ce2e-43da-b86e-897c2dc2b296",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=284f6fdc-1f98-4298-8e32-7aa7b0f66298` → **200**

```json
{
  "calls": [
    {
      "id": "20358af7-ce2e-43da-b86e-897c2dc2b296",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [
        "284f6fdc-1f98-4298-8e32-7aa7b0f66298"
      ],
      "started_at": "2026-10-28T15:33:14.193434Z",
      "answered_at": "2026-10-28T15:33:14.834178Z",
      "ended_at": "2026-10-28T15:33:14.855081Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=284f6fdc-1f98-4298-8e32-7aa7b0f66298` → **200**

```json
{
  "calls": [
    {
      "id": "20358af7-ce2e-43da-b86e-897c2dc2b296",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [
        "284f6fdc-1f98-4298-8e32-7aa7b0f66298"
      ],
      "started_at": "2026-10-28T15:33:14.193434Z",
      "answered_at": "2026-10-28T15:33:14.834178Z",
      "ended_at": "2026-10-28T15:33:14.855081Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=284f6fdc-1f98-4298-8e32-7aa7b0f66298` → **200**

```json
{
  "calls": [
    {
      "id": "20358af7-ce2e-43da-b86e-897c2dc2b296",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "2155bcaf-5441-456a-8334-5423de150ccd",
      "order_ids": [
        "284f6fdc-1f98-4298-8e32-7aa7b0f66298"
      ],
      "started_at": "2026-10-28T15:33:14.193434Z",
      "answered_at": "2026-10-28T15:33:14.834178Z",
      "ended_at": "2026-10-28T15:33:14.855081Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:33:18.290848Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/284f6fdc-1f98-4298-8e32-7aa7b0f66298` → **200**

```json
{
  "id": "284f6fdc-1f98-4298-8e32-7aa7b0f66298",
  "short_number": 16,
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
  "created_at": "2026-10-28T15:33:13.896148Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673229952"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/284f6fdc-1f98-4298-8e32-7aa7b0f66298/cancel` → **200**

```json
{
  "command_id": "0ff42c08-2ff7-4211-af26-bbac1fcd1e5a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "284f6fdc-1f98-4298-8e32-7aa7b0f66298",
  "short_number": 16,
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
  "created_at": "2026-10-28T15:33:13.896148Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673229952"
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
  "command_id": "778bc087-49fb-4ca3-8bc2-8a9d3883a673",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T15:33:20.27995Z",
  "extension": "101"
}
```

Done: outgoing call 20358af7-ce2e-43da-b86e-897c2dc2b296 from order 284f6fdc-1f98-4298-8e32-7aa7b0f66298, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634378246",
  "device_ref": "sandbox-2947"
}
```

```json
{
  "challenge_id": "eef7f4cc-1a34-4e5b-91e8-7a2866019733",
  "expires_at": "2026-10-28T15:38:20.559130705Z",
  "resend_available_at": "2026-10-28T15:33:21.559130705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634378246` → **200**

```json
{
  "phone": "+380634378246",
  "audience": "CLIENT",
  "code": "847647",
  "sent_at": "2026-10-28T15:33:20.561396218Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eef7f4cc-1a34-4e5b-91e8-7a2866019733",
  "code": "847647",
  "device_ref": "sandbox-2947"
}
```

```json
{
  "session_id": "7670403a-a5d6-4e21-bf80-171c8a0062a5",
  "subject": {
    "type": "CLIENT",
    "id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjNhNjA2YS0xYWFmLTRlZWYtOGZiMC0zYTM4ZWZmN2QxNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNTAwLCJpYXQiOjE3OTMyMDE2MDAsImp0aSI6IjU5MzIzYzU4LTQ1OTMtNDRhMS1hNTU3LTZiMDUzNTA4ODg4NiIsInNpZCI6Ijc2NzA0MDNhLWE1ZDYtNGUyMS1iZjgwLTE3MWM4YTAwNjJhNSJ9.BeMxM4fwKaf_9aCL6_V639BgnUGMXD46CQsC7mVXMUc",
  "access_expires_at": "2026-10-28T15:48:20.849747709Z",
  "refresh_token": "EO8otlTlDAv9k9-_mOX-YJQIP03XOG9uQt_5251gIQM",
  "refresh_expires_at": "2026-11-27T15:33:20.849235347Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160",
  "session_id": "7670403a-a5d6-4e21-bf80-171c8a0062a5",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634378246",
  "device_ref": "sandbox-18714"
}
```

```json
{
  "challenge_id": "9f513452-7e61-494b-a8f6-fd4e2b1d4789",
  "expires_at": "2026-10-28T15:38:23.382357289Z",
  "resend_available_at": "2026-10-28T15:33:24.382357289Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634378246` → **200**

```json
{
  "phone": "+380634378246",
  "audience": "CLIENT",
  "code": "316534",
  "sent_at": "2026-10-28T15:33:23.384294282Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f513452-7e61-494b-a8f6-fd4e2b1d4789",
  "code": "316534",
  "device_ref": "sandbox-18714"
}
```

```json
{
  "session_id": "0682fd40-e8fb-462f-a9f1-9a8d07f16162",
  "subject": {
    "type": "CLIENT",
    "id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjNhNjA2YS0xYWFmLTRlZWYtOGZiMC0zYTM4ZWZmN2QxNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNTAzLCJpYXQiOjE3OTMyMDE2MDMsImp0aSI6IjIyNzUwYjZmLTdjZDctNDVmYy1hZjc5LThmNGYyOGZiZTgzOCIsInNpZCI6IjA2ODJmZDQwLWU4ZmItNDYyZi1hOWYxLTlhOGQwN2YxNjE2MiJ9.Xg5kGhj62tVvK6JTRY50WZfG9HCO4wh4Betz863eEYU",
  "access_expires_at": "2026-10-28T15:48:23.674396514Z",
  "refresh_token": "B6LtK2EsTPNGPswzdv553Syw_X3yNRPl-n-6l5Ukj4w",
  "refresh_expires_at": "2026-11-27T15:33:23.673855191Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "d6cf17cc-474b-41b7-84ae-ebd5cfd53653",
  "expires_at": "2026-10-28T15:38:25.943106005Z",
  "resend_available_at": "2026-10-28T15:33:26.943106005Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634378246` → **200**

```json
{
  "phone": "+380634378246",
  "audience": "CLIENT",
  "code": "242907",
  "sent_at": "2026-10-28T15:33:25.945060346Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639703713"
}
```

```json
{
  "challenge_id": "1346bbf9-214a-49c4-8f3f-9973364cc994",
  "expires_at": "2026-10-28T15:38:26.22560009Z",
  "resend_available_at": "2026-10-28T15:33:27.22560009Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639703713` → **200**

```json
{
  "phone": "+380639703713",
  "audience": "CLIENT",
  "code": "339207",
  "sent_at": "2026-10-28T15:33:26.227365428Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "2bbbdaba-a67d-47e1-8fbd-af30b0b97f65",
  "current_challenge_id": "d6cf17cc-474b-41b7-84ae-ebd5cfd53653",
  "current_code": "000000",
  "new_challenge_id": "1346bbf9-214a-49c4-8f3f-9973364cc994",
  "new_code": "339207"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "d3d5f4d7-9def-4dff-8fe8-02035640a68e"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "9439a8d4-2fa8-4f46-b21a-6c9dc57c55cc",
  "current_challenge_id": "d6cf17cc-474b-41b7-84ae-ebd5cfd53653",
  "current_code": "242907",
  "new_challenge_id": "1346bbf9-214a-49c4-8f3f-9973364cc994",
  "new_code": "339207"
}
```

```json
{
  "subject_id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160",
  "phone": "+380639703713",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160",
  "session_id": "7670403a-a5d6-4e21-bf80-171c8a0062a5",
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
  "correlation_id": "944e32a5-acca-4848-b69c-98a779d46ce0"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639703713",
  "device_ref": "sandbox-31058"
}
```

```json
{
  "challenge_id": "c87cc837-f3ac-49a7-a086-d03eaae79f4b",
  "expires_at": "2026-10-28T15:38:29.592166797Z",
  "resend_available_at": "2026-10-28T15:33:30.592166797Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639703713` → **200**

```json
{
  "phone": "+380639703713",
  "audience": "CLIENT",
  "code": "568476",
  "sent_at": "2026-10-28T15:33:29.5943194Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c87cc837-f3ac-49a7-a086-d03eaae79f4b",
  "code": "568476",
  "device_ref": "sandbox-31058"
}
```

```json
{
  "session_id": "c62f39ad-6735-4902-a718-9e629bd93048",
  "subject": {
    "type": "CLIENT",
    "id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjNhNjA2YS0xYWFmLTRlZWYtOGZiMC0zYTM4ZWZmN2QxNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNTA5LCJpYXQiOjE3OTMyMDE2MDksImp0aSI6IjU2M2ExODg2LWE5MjMtNGJkZS1hMjZhLWY3MTg1NmRhZWE2NCIsInNpZCI6ImM2MmYzOWFkLTY3MzUtNDkwMi1hNzE4LTllNjI5YmQ5MzA0OCJ9.CApY7GZqDpvRzR_NkxTtHSzD_w9mEU1Fd8BXJlvNQoo",
  "access_expires_at": "2026-10-28T15:48:29.880553511Z",
  "refresh_token": "Sqene_6v1cnn9QhFlCktp4gfEqG2A80siBwiM72vqX0",
  "refresh_expires_at": "2026-11-27T15:33:29.879986281Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160",
  "session_id": "c62f39ad-6735-4902-a718-9e629bd93048",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support sets another after checking who it is

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "6b016716-3e4d-4ff4-ad9d-de514587398b",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1MTAsImlhdCI6MTc5MzIwMTYxMCwianRpIjoiZjhmN2EzM2YtOWU5Zi00ZjQ4LWFiZGMtYzQxNjJjNGIzMjEzIiwic2lkIjoiNmIwMTY3MTYtM2U0ZC00ZmY0LWFkOWQtZGU1MTQ1ODczOThiIn0.0qP4LtcmQjk4UV5nAL08EY2iVu6crT2y1EOunlTNr9k",
  "access_expires_at": "2026-10-28T15:48:30.698493339Z",
  "refresh_token": "jHrIUDk2gyLQFTPYrMT76EBdwCqTpVyb6HknQWpmAJA",
  "refresh_expires_at": "2026-10-29T03:33:30.697971189Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/bf3a606a-1aaf-4eef-8fb0-3a38eff7d160` → **200**

```json
{
  "client": {
    "id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160",
    "phone": "+380639703713",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:33:20.847612Z",
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

`POST /api/admin/v1/clients/bf3a606a-1aaf-4eef-8fb0-3a38eff7d160/phone` → **400**

```json
{
  "command_id": "f051adab-69b6-40a7-8dfc-20c307c28cd8",
  "expected_version": 3,
  "phone": "+380638418767",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/bf3a606a-1aaf-4eef-8fb0-3a38eff7d160/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1c1900ae-6183-4340-b832-5d4802671731",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/bf3a606a-1aaf-4eef-8fb0-3a38eff7d160/phone` → **200**

```json
{
  "command_id": "75ebb3a3-dde9-401f-bdce-363cfaf84a0f",
  "expected_version": 3,
  "phone": "+380638418767",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160",
  "phone": "+380638418767",
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
  "correlation_id": "c72bce56-fbe3-4cec-8f6f-0a286572d1ef"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638418767",
  "device_ref": "sandbox-14599"
}
```

```json
{
  "challenge_id": "591d3566-8f84-4985-ad0c-46309edd8a85",
  "expires_at": "2026-10-28T15:38:32.055085375Z",
  "resend_available_at": "2026-10-28T15:33:33.055085375Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638418767` → **200**

```json
{
  "phone": "+380638418767",
  "audience": "CLIENT",
  "code": "474499",
  "sent_at": "2026-10-28T15:33:32.057373793Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "591d3566-8f84-4985-ad0c-46309edd8a85",
  "code": "474499",
  "device_ref": "sandbox-14599"
}
```

```json
{
  "session_id": "b6f15abe-97db-40c6-aab8-8ade343153d6",
  "subject": {
    "type": "CLIENT",
    "id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjNhNjA2YS0xYWFmLTRlZWYtOGZiMC0zYTM4ZWZmN2QxNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNTEyLCJpYXQiOjE3OTMyMDE2MTIsImp0aSI6IjFhOWIwYzEzLTY3ZmEtNGRkNy1iMWZjLTNhYzBmMzFlYzVhZSIsInNpZCI6ImI2ZjE1YWJlLTk3ZGItNDBjNi1hYWI4LThhZGUzNDMxNTNkNiJ9.-TAHDS29oPh3AO5MnyEDWieja4jQqVC09h_CpycudLI",
  "access_expires_at": "2026-10-28T15:48:32.366557792Z",
  "refresh_token": "rsiyKF7l_t5fSkyAlbriOvjV3Aw_Ld0Ak_QeRr2ddEM",
  "refresh_expires_at": "2026-11-27T15:33:32.365926265Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bf3a606a-1aaf-4eef-8fb0-3a38eff7d160",
  "session_id": "b6f15abe-97db-40c6-aab8-8ade343153d6",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635860046",
  "device_ref": "sandbox-5160"
}
```

```json
{
  "challenge_id": "28ebf480-41ea-403c-9999-58f63da002b7",
  "expires_at": "2026-10-28T15:38:32.904282132Z",
  "resend_available_at": "2026-10-28T15:33:33.904282132Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635860046` → **200**

```json
{
  "phone": "+380635860046",
  "audience": "CLIENT",
  "code": "550380",
  "sent_at": "2026-10-28T15:33:32.906553844Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "28ebf480-41ea-403c-9999-58f63da002b7",
  "code": "550380",
  "device_ref": "sandbox-5160"
}
```

```json
{
  "session_id": "f10191bd-3773-4b5b-9b2a-c22007a222c2",
  "subject": {
    "type": "CLIENT",
    "id": "c36c5a72-26b1-407e-8be5-d235a1578419"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzZjNWE3Mi0yNmIxLTQwN2UtOGJlNS1kMjM1YTE1Nzg0MTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNTEzLCJpYXQiOjE3OTMyMDE2MTMsImp0aSI6Ijg4NDgwYmQ3LTQ1ZDgtNGIzYy05NDg3LWUzMWIwZjZjZjgzNSIsInNpZCI6ImYxMDE5MWJkLTM3NzMtNGI1Yi05YjJhLWMyMjAwN2EyMjJjMiJ9.GyuESBbYSTihPh3NdbyjgNIDNkK7Q4hCl4AKCoYGPDI",
  "access_expires_at": "2026-10-28T15:48:33.20167365Z",
  "refresh_token": "NKgq--5d1KG3msx3OIbvVIcq9Kxv6YJO9xSBV5PcrmA",
  "refresh_expires_at": "2026-11-27T15:33:33.201182378Z",
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
  "session_id": "e4bb1e18-5aef-41e5-a750-6d70c123dfc2",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1MTQsImlhdCI6MTc5MzIwMTYxNCwianRpIjoiYTVlYjRjYWItMTFlNi00YTA1LWExMDUtMWE3YmMxYTY3MWFhIiwic2lkIjoiZTRiYjFlMTgtNWFlZi00MWU1LWE3NTAtNmQ3MGMxMjNkZmMyIn0.U-Oh5_IUUDNzJPK1p1nvJKNhyJIAeDM6PDSS_3Tscw0",
  "access_expires_at": "2026-10-28T15:48:34.331778432Z",
  "refresh_token": "FASyngDI5x-IxyM4kCKRiIG5AE_o1KazVf6n9gN8YeU",
  "refresh_expires_at": "2026-10-29T03:33:34.331292048Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635860046` → **200**

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
  "correlation_id": "5f20b69d-4bb0-4d88-b6a7-3239189ce36c"
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
  "session_id": "2e4ca23b-225d-4138-8a10-971ed3e7d05b",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1MTUsImlhdCI6MTc5MzIwMTYxNSwianRpIjoiZGUxYWU1YjktNjAwNi00YmRhLWI0MzctODExYjY4N2FiNDQyIiwic2lkIjoiMmU0Y2EyM2ItMjI1ZC00MTM4LThhMTAtOTcxZWQzZTdkMDViIn0.sjzg2K9iiCrHA4-RzVTgB1nfEBCmfMis84bOF3whxZc",
  "access_expires_at": "2026-10-28T15:48:35.445605282Z",
  "refresh_token": "KS6EEBwmuPGyAmeG8S2oFZrYDt-LoIWgVsOVA2l0GKQ",
  "refresh_expires_at": "2026-10-29T03:33:35.445065027Z",
  "password_change_required": false
}
```

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
    "app_versions": {
      "rider_android": null,
      "rider_ios": null,
      "driver_android": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": null,
      "require_version_header": false
    }
  },
  "changed_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "reason": "Sandbox: force update",
  "changed_at": "2026-10-28T15:30:58.746394Z"
}
```

**Contract validation failed — scenario stopped.**

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17243"
}
```

```json
{
  "challenge_id": "978fe87a-fa49-4559-b6a0-1c201cd80c5c",
  "expires_at": "2026-10-28T15:38:35.994338653Z",
  "resend_available_at": "2026-10-28T15:33:36.994338653Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "718515",
  "sent_at": "2026-10-28T15:33:35.996465197Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "978fe87a-fa49-4559-b6a0-1c201cd80c5c",
  "code": "718515",
  "device_ref": "sandbox-17243"
}
```

```json
{
  "session_id": "0bf0a08d-9db2-4d99-9c36-7ee8ebfd8958",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjUxNiwiaWF0IjoxNzkzMjAxNjE2LCJqdGkiOiJhZjk2NGM3NC04OTIzLTQxZDUtYTYwMC0wNjJkMjYxODljNGYiLCJzaWQiOiIwYmYwYTA4ZC05ZGIyLTRkOTktOWMzNi03ZWU4ZWJmZDg5NTgifQ.sJt74sfYb4TBM4wGNR5acEhFrkPAYsgZF6-AQR2U5pQ",
  "access_expires_at": "2026-10-28T15:48:36.287133412Z",
  "refresh_token": "_75pY31A4Iph71oTZHG7ekubeBqXlJDok6SQswQZ-4Q",
  "refresh_expires_at": "2026-11-27T15:33:36.286564604Z",
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
  "command_id": "12bf66d8-b7bf-40bc-b91e-f2a52e6f85fd",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:33:36Z",
    "sequence": 1793201616823
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdce49ae-a554-49e7-b3e0-6a07512919c4",
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
  "last_heartbeat_at": "2026-10-28T15:33:36.841954Z",
  "last_location_at": "2026-10-28T15:33:36.841954Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675804007",
  "device_ref": "sandbox-1328"
}
```

```json
{
  "challenge_id": "409d99f5-aefb-4dd6-94e0-64db8496d6f2",
  "expires_at": "2026-10-28T15:38:37.113429686Z",
  "resend_available_at": "2026-10-28T15:33:38.113429686Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675804007` → **200**

```json
{
  "phone": "+380675804007",
  "audience": "CLIENT",
  "code": "870049",
  "sent_at": "2026-10-28T15:33:37.115980536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "409d99f5-aefb-4dd6-94e0-64db8496d6f2",
  "code": "870049",
  "device_ref": "sandbox-1328"
}
```

```json
{
  "session_id": "2b84cc22-b1be-433f-b9bc-274d52a641ba",
  "subject": {
    "type": "CLIENT",
    "id": "1069e861-1202-4794-9068-6b2b95130670"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDY5ZTg2MS0xMjAyLTQ3OTQtOTA2OC02YjJiOTUxMzA2NzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNTE3LCJpYXQiOjE3OTMyMDE2MTcsImp0aSI6IjQyMGMyMmNkLWY4NjYtNDkxMy1hZTA0LThjOGYwZDBkMzI5MSIsInNpZCI6IjJiODRjYzIyLWIxYmUtNDMzZi1iOWJjLTI3NGQ1MmE2NDFiYSJ9.B5l-dwr5Oe8Re91mL7lF0wGkjAJuWvTcZtdRYLgSUvs",
  "access_expires_at": "2026-10-28T15:48:37.429152258Z",
  "refresh_token": "PbHC9YXIPiWssMlcHgq9ZupKC86MMYx0BXjr4NbTFuQ",
  "refresh_expires_at": "2026-11-27T15:33:37.428531209Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9fefc7c4-3dc9-4389-a763-90a4621070d3",
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
  "id": "4e9f6b50-b03f-46e6-8c78-5eeba77c3abe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:38:37.710170Z",
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
  "command_id": "3cb44ecf-244f-4c93-ba65-59c2f85cbc6b",
  "quote_id": "4e9f6b50-b03f-46e6-8c78-5eeba77c3abe",
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
  "id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1069e861-1202-4794-9068-6b2b95130670",
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
  "created_at": "2026-10-28T15:33:37.993044Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1eb3e2db-dd93-4f4e-8ba2-f4afaca96fd2",
    "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
    "expires_at": "2026-10-28T15:33:52.995699Z",
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

`POST /api/driver/v1/offers/1eb3e2db-dd93-4f4e-8ba2-f4afaca96fd2/accept` → **200**

```json
{
  "command_id": "acb240c1-e479-49cb-920b-340bd7fbe96b"
}
```

```json
{
  "id": "b408b98d-e999-4afc-acf7-a182c553e4e7",
  "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a4d91dc9-516c-49f5-b7ec-618a635a92e7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a4d91dc9-516c-49f5-b7ec-618a635a92e7",
  "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "assignment_id": "b408b98d-e999-4afc-acf7-a182c553e4e7",
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

`POST /api/driver/v1/work-sessions/fdce49ae-a554-49e7-b3e0-6a07512919c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:33:39Z",
    "sequence": 1793201619577
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdce49ae-a554-49e7-b3e0-6a07512919c4",
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
  "last_heartbeat_at": "2026-10-28T15:33:39.076826Z",
  "last_location_at": "2026-10-28T15:33:39.076826Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a4d91dc9-516c-49f5-b7ec-618a635a92e7",
  "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "assignment_id": "b408b98d-e999-4afc-acf7-a182c553e4e7",
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

`POST /api/driver/v1/trips/a4d91dc9-516c-49f5-b7ec-618a635a92e7/arrive` → **200**

```json
{
  "command_id": "727f7692-135e-48f2-b138-4ac3ef6ca6c5",
  "expected_version": 0
}
```

```json
{
  "id": "a4d91dc9-516c-49f5-b7ec-618a635a92e7",
  "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "assignment_id": "b408b98d-e999-4afc-acf7-a182c553e4e7",
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
  "arrived_at": "2026-10-28T15:33:39.609072Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a4d91dc9-516c-49f5-b7ec-618a635a92e7/start` → **200**

```json
{
  "command_id": "44c8edc6-a429-4a78-88cf-f9d4a38ff013",
  "expected_version": 1
}
```

```json
{
  "id": "a4d91dc9-516c-49f5-b7ec-618a635a92e7",
  "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "assignment_id": "b408b98d-e999-4afc-acf7-a182c553e4e7",
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
  "arrived_at": "2026-10-28T15:33:39.609072Z",
  "started_at": "2026-10-28T15:33:39.885249Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fdce49ae-a554-49e7-b3e0-6a07512919c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:33:40Z",
    "sequence": 1793201620149
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdce49ae-a554-49e7-b3e0-6a07512919c4",
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
  "last_heartbeat_at": "2026-10-28T15:33:40.168441Z",
  "last_location_at": "2026-10-28T15:33:40.168441Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/a4d91dc9-516c-49f5-b7ec-618a635a92e7/complete` → **200**

```json
{
  "command_id": "67ed46ae-3278-4c5f-921e-f9a56fd966b9",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:33:40Z",
  "cash_received": true
}
```

```json
{
  "id": "a4d91dc9-516c-49f5-b7ec-618a635a92e7",
  "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "assignment_id": "b408b98d-e999-4afc-acf7-a182c553e4e7",
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
  "arrived_at": "2026-10-28T15:33:39.609072Z",
  "started_at": "2026-10-28T15:33:39.885249Z",
  "completed_at": "2026-10-28T15:33:40.441469Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/aead194b-40a7-485d-82c0-5ae909cb7976/rating` → **200**

```json
{
  "command_id": "5d74ef41-523f-4b1a-bc03-dfa38a83a2be",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "score": 5,
  "created_at": "2026-10-28T15:33:40.738599401Z"
}
```

`POST /api/driver/v1/orders/aead194b-40a7-485d-82c0-5ae909cb7976/rating` → **200**

```json
{
  "command_id": "263f133b-c95f-498f-a9ec-8470e33d6943",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
  "score": 4,
  "created_at": "2026-10-28T15:33:41.009925071Z"
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
  "session_id": "ee9f1ab4-f9f7-434e-bd7e-d58f2c55b5d9",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1MjEsImlhdCI6MTc5MzIwMTYyMSwianRpIjoiMmI3MTcwYmQtNzBjZS00YjJkLTkyM2EtZmIwMDY3YWEzZWYxIiwic2lkIjoiZWU5ZjFhYjQtZjlmNy00MzRlLWJkN2UtZDU4ZjJjNTViNWQ5In0.c3WwD_edzdh0VehWv9Kq8nXS6PA8tDthmjfDJVF-uiM",
  "access_expires_at": "2026-10-28T15:48:41.838897383Z",
  "refresh_token": "0-G2AXX1GgI2Ke83QfpXtOi9Fyh3LZb8rxeZBUuZ2Bw",
  "refresh_expires_at": "2026-10-29T03:33:41.838371275Z",
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
  "session_id": "8d29800b-6903-48d9-a3d0-bfc02c42c4c2",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1MjIsImlhdCI6MTc5MzIwMTYyMiwianRpIjoiZGM5ZDAyMTgtMjhmYS00NTEzLWFiZjgtZjhmMDFiMjY2ZGNiIiwic2lkIjoiOGQyOTgwMGItNjkwMy00OGQ5LWEzZDAtYmZjMDJjNDJjNGMyIn0.uyoaSk5sZs9zDGCAZdZhLJjgPr0bgYo_6Q0ZdawsBug",
  "access_expires_at": "2026-10-28T15:48:42.401599924Z",
  "refresh_token": "HBkgymwxfZ5kDyaIxgGx4_JsTUyt_-sofqOcRvZwX64",
  "refresh_expires_at": "2026-10-29T03:33:42.401069838Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/aead194b-40a7-485d-82c0-5ae909cb7976/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
      "author_type": "RIDER",
      "author_id": "1069e861-1202-4794-9068-6b2b95130670",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T15:33:40.738599Z"
    },
    {
      "order_id": "aead194b-40a7-485d-82c0-5ae909cb7976",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "1069e861-1202-4794-9068-6b2b95130670",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T15:33:41.009925Z"
    }
  ]
}
```

Done: ratings for order aead194b-40a7-485d-82c0-5ae909cb7976.

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
  "session_id": "0b72e66a-d242-40ef-8e82-5316ab8506af",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1MjMsImlhdCI6MTc5MzIwMTYyMywianRpIjoiMzljNzM3OTUtZWVmMS00MjgyLTk3NGYtYzc1N2IxODJiNmZlIiwic2lkIjoiMGI3MmU2NmEtZDI0Mi00MGVmLThlODItNTMxNmFiODUwNmFmIn0.2PwwYT9-wioCG_aWOODRtUsSx7TQbF_hSvdhGSA5S4U",
  "access_expires_at": "2026-10-28T15:48:43.238260558Z",
  "refresh_token": "6CVgaoNOxYSkgOutE5Q1jQX-SmCy5rL8dNWLa-A6yhw",
  "refresh_expires_at": "2026-10-29T03:33:43.23764992Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "bf037a87-6fc5-459a-bfb2-832bed192eec",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "d9eebf15-82f2-43e0-b41c-cc4729cde4c2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:43.516223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d9eebf15-82f2-43e0-b41c-cc4729cde4c2` → **200**

```json
{
  "id": "d9eebf15-82f2-43e0-b41c-cc4729cde4c2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:43.516223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d9eebf15-82f2-43e0-b41c-cc4729cde4c2` → **200**

```json
{
  "id": "d9eebf15-82f2-43e0-b41c-cc4729cde4c2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:43.516223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d9eebf15-82f2-43e0-b41c-cc4729cde4c2` → **200**

```json
{
  "id": "d9eebf15-82f2-43e0-b41c-cc4729cde4c2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:43.516223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d9eebf15-82f2-43e0-b41c-cc4729cde4c2` → **200**

```json
{
  "id": "d9eebf15-82f2-43e0-b41c-cc4729cde4c2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:43.516223Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d9eebf15-82f2-43e0-b41c-cc4729cde4c2` → **200**

```json
{
  "id": "d9eebf15-82f2-43e0-b41c-cc4729cde4c2",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:33:43.516223Z",
  "ready_at": "2026-10-28T15:33:48.325002Z",
  "expires_at": "2026-10-29T15:33:48.325002Z"
}
```

`GET /api/admin/v1/reports/exports/d9eebf15-82f2-43e0-b41c-cc4729cde4c2/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,17,5,12,0,0,13,4,0,15,1,0,1,6,1,5
total,17,5,12,0,0,13,4,0,15,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b2de6054-4958-4804-b6bc-8f11b466b7e2",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "e96c9075-4965-427c-87a4-1fee8115060f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:49.154674Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e96c9075-4965-427c-87a4-1fee8115060f` → **200**

```json
{
  "id": "e96c9075-4965-427c-87a4-1fee8115060f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:49.154674Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e96c9075-4965-427c-87a4-1fee8115060f` → **200**

```json
{
  "id": "e96c9075-4965-427c-87a4-1fee8115060f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:49.154674Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e96c9075-4965-427c-87a4-1fee8115060f` → **200**

```json
{
  "id": "e96c9075-4965-427c-87a4-1fee8115060f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:49.154674Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e96c9075-4965-427c-87a4-1fee8115060f` → **200**

```json
{
  "id": "e96c9075-4965-427c-87a4-1fee8115060f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:33:49.154674Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/e96c9075-4965-427c-87a4-1fee8115060f` → **200**

```json
{
  "id": "e96c9075-4965-427c-87a4-1fee8115060f",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:33:49.154674Z",
  "ready_at": "2026-10-28T15:33:53.335148Z",
  "expires_at": "2026-10-29T15:33:53.335148Z"
}
```

`GET /api/admin/v1/reports/exports/e96c9075-4965-427c-87a4-1fee8115060f/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,5,803.72,130.74,120.57,683.15,10.52,0.00,162.97,20.00,479.49,25.00,0.00
total,UAH,5,803.72,130.74,120.57,683.15,10.52,0.00,162.97,20.00,479.49,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/f3e83c0d-4160-4dc4-a560-e7768fb24181` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/f3e83c0d-4160-4dc4-a560-e7768fb24181",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "62e53141-0dd6-4989-94c5-c8344285c05b"
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
  "device_ref": "sandbox-20569"
}
```

```json
{
  "challenge_id": "bf30702a-7106-4d8e-b6bd-ace734415138",
  "expires_at": "2026-10-28T15:38:55.067093654Z",
  "resend_available_at": "2026-10-28T15:33:56.067093654Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "662642",
  "sent_at": "2026-10-28T15:33:55.069683119Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf30702a-7106-4d8e-b6bd-ace734415138",
  "code": "662642",
  "device_ref": "sandbox-20569"
}
```

```json
{
  "session_id": "9a05e90c-b2fa-4d66-959f-671f53e68454",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjUzNSwiaWF0IjoxNzkzMjAxNjM1LCJqdGkiOiIxNjg4Mzk1My04NzZlLTRlZGYtYWI2Ni1hODQyODBhMTRlODMiLCJzaWQiOiI5YTA1ZTkwYy1iMmZhLTRkNjYtOTU5Zi02NzFmNTNlNjg0NTQifQ.v1BeM-qIK_GPOGWYNzM8ZTnoqeSbi6-uPZY1WZil5tY",
  "access_expires_at": "2026-10-28T15:48:55.365669014Z",
  "refresh_token": "YPDPA4lb7QhjbGiLKcLh0AWVYSkooq9zgHCXqxgZhR8",
  "refresh_expires_at": "2026-11-27T15:33:55.364756463Z",
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
  "command_id": "39dffa74-9302-41fa-8181-0c376c362fdc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:33:56Z",
    "sequence": 1793201636146
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b5050979-b037-4778-b61a-35b434286800",
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
  "last_heartbeat_at": "2026-10-28T15:33:56.165212Z",
  "last_location_at": "2026-10-28T15:33:56.165212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "77d9db72-83c1-41ba-831e-0a0c48b4725a",
  "points": [
    {
      "sequence": 1793201638444,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:32:58Z"
    },
    {
      "sequence": 1793201638451,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:33:58Z"
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
  "session_id": "98893ee5-343e-436f-b911-32bd1fc87bfb",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1MzksImlhdCI6MTc5MzIwMTYzOSwianRpIjoiZjhhMjE3NDUtOWNjOC00YmIwLTllNmQtOTY0YTdmNzFkZmJjIiwic2lkIjoiOTg4OTNlZTUtMzQzZS00MzZmLWI5MTEtMzJiZDFmYzg3YmZiIn0.tfzYACdyUOD5Pno4pOob16N4gdGZjh1Ins5LmmFyWuU",
  "access_expires_at": "2026-10-28T15:48:59.050537139Z",
  "refresh_token": "4EG4rabr21VpHV0PtUar_IPHBQ_kpPGLb7cprK3tkl4",
  "refresh_expires_at": "2026-10-29T03:33:59.04976416Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "c5dc61c7-df78-4f61-8ec7-ff90d8f41811",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T15:33:58Z",
        "track_point_id": "e82c3143-0237-4efd-98cd-931157370dcd",
        "work_session_id": "b5050979-b037-4778-b61a-35b434286800"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T15:33:58Z",
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

`POST /api/admin/v1/driver-risk-flags/c5dc61c7-df78-4f61-8ec7-ff90d8f41811/confirm` → **200**

```json
{
  "command_id": "8de5e40e-ecbf-4d9a-9658-45b722e598e8",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "c5dc61c7-df78-4f61-8ec7-ff90d8f41811",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T15:33:58Z",
    "track_point_id": "e82c3143-0237-4efd-98cd-931157370dcd",
    "work_session_id": "b5050979-b037-4778-b61a-35b434286800"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T15:33:58Z",
  "reason": null,
  "reviewed_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "reviewed_at": "2026-10-28T15:33:59.902765Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/c5dc61c7-df78-4f61-8ec7-ff90d8f41811/dismiss` → **409**

```json
{
  "command_id": "250a9625-8679-4b6c-9e65-f05f4aa09ab1",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/c5dc61c7-df78-4f61-8ec7-ff90d8f41811/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c76a6848-4a83-40a1-ae53-f1ab174563d2"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "79320240-7d1a-429d-897d-7920d9182c11",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "36ae0ce0-59a5-42af-95b6-789a74d5e949",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "raised_at": "2026-10-28T15:34:00.470316Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/36ae0ce0-59a5-42af-95b6-789a74d5e949/dismiss` → **200**

```json
{
  "command_id": "f0a0dec5-3f3a-4da5-ac85-8305adc1ec9a",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "36ae0ce0-59a5-42af-95b6-789a74d5e949",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "raised_at": "2026-10-28T15:34:00.470316Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "reviewed_at": "2026-10-28T15:34:00.746972Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "b368624b-3e72-4f6f-b902-5e2dc1ae545d",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "c5dc61c7-df78-4f61-8ec7-ff90d8f41811"
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
      "actor_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:34:01.029729Z"
    }
  ]
}
```

Done: flag c5dc61c7-df78-4f61-8ec7-ff90d8f41811 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "779fed61-e73a-40f7-b046-0ef523093469",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1NDEsImlhdCI6MTc5MzIwMTY0MSwianRpIjoiYzQ3ZGJlNzAtYmYzMS00ODAzLThkZDktZTQyYzY2NjZiNTE3Iiwic2lkIjoiNzc5ZmVkNjEtZTczYS00MGY3LWIwNDYtMGVmNTIzMDkzNDY5In0.pWY0_MOIu5cDb3dkoe1Z6StGHda7nm1JmTx0rYpE-qg",
  "access_expires_at": "2026-10-28T15:49:01.862050104Z",
  "refresh_token": "eXWw5cu2yhkywwr_-rVc2svpRPGDM862D6hOXOQAtLM",
  "refresh_expires_at": "2026-10-29T03:34:01.861243739Z",
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
      "actor_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:34:01.029729Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "8b01d922-c907-4669-93ee-2dd1dc3952dd",
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
  "session_id": "b5050979-b037-4778-b61a-35b434286800",
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
  "last_heartbeat_at": "2026-10-28T15:33:56.165212Z",
  "last_location_at": "2026-10-28T15:33:56.165212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b5050979-b037-4778-b61a-35b434286800/close` → **200**

```json
{
  "command_id": "fbed84b2-65ec-4fb5-abd1-0ec605cfec51",
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
  "session_id": "8fdbc84b-de2e-40ca-92ee-0d4bc37ecbef",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1NDMsImlhdCI6MTc5MzIwMTY0MywianRpIjoiYjkyMGZkMzUtYjgyNS00MTFkLWExMDYtMjllMmUzZTZlMTFjIiwic2lkIjoiOGZkYmM4NGItZGUyZS00MGNhLTkyZWUtMGQ0YmMzN2VjYmVmIn0.zJSTQyJ_z2dg7Dat8ZYG1En87WsASyQMzVQzjPyAalA",
  "access_expires_at": "2026-10-28T15:49:03.536084884Z",
  "refresh_token": "8_M8QpiXOPxJXAzqJWzqDnBk8y_dfPvqEljZFxSCspQ",
  "refresh_expires_at": "2026-10-29T03:34:03.535381382Z",
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
  "command_id": "51ca55f5-9bab-4e64-a010-8271a77c865d",
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
  "changed_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:34:04.076547Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "51ca55f5-9bab-4e64-a010-8271a77c865d",
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
  "changed_by": "2155bcaf-5441-456a-8334-5423de150ccd",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:34:04.076547Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48168899105",
  "device_ref": "sandbox-21738"
}
```

```json
{
  "challenge_id": "3da5a29d-9d80-474e-9bb8-5f317eb93c5e",
  "expires_at": "2026-10-28T15:39:04.63242107Z",
  "resend_available_at": "2026-10-28T15:34:05.63242107Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48168899105` → **200**

```json
{
  "phone": "+48168899105",
  "audience": "CLIENT",
  "code": "219061",
  "sent_at": "2026-10-28T15:34:04.636918459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3da5a29d-9d80-474e-9bb8-5f317eb93c5e",
  "code": "219061",
  "device_ref": "sandbox-21738"
}
```

```json
{
  "session_id": "3b595ceb-11d2-4935-a37d-b68c66dc1558",
  "subject": {
    "type": "CLIENT",
    "id": "16e1b7ca-09c1-46b3-8fc1-4da02881f47f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNmUxYjdjYS0wOWMxLTQ2YjMtOGZjMS00ZGEwMjg4MWY0N2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNTQ0LCJpYXQiOjE3OTMyMDE2NDQsImp0aSI6Ijg0YTk4MTkyLTNhZWQtNDFhNy1iYTY3LTdmZTcxMTA4MTFkNSIsInNpZCI6IjNiNTk1Y2ViLTExZDItNDkzNS1hMzdkLWI2OGM2NmRjMTU1OCJ9.jXdbfKZAuBG-wRODt9uKCBeOeWNzEcEsbcZnZEN40_g",
  "access_expires_at": "2026-10-28T15:49:04.920461431Z",
  "refresh_token": "wPeL_OTvvRKWG0rhBa2WmOFlr_cxDb7lOg1vvmEQ-Og",
  "refresh_expires_at": "2026-11-27T15:34:04.9197418Z",
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
  "correlation_id": "dd932b01-8dc6-4fab-9852-276f7cd7476b"
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
  "device_ref": "sandbox-8976"
}
```

```json
{
  "challenge_id": "3d0dad0d-aa08-40bc-b612-79dbd023d835",
  "expires_at": "2026-10-28T15:39:05.716227255Z",
  "resend_available_at": "2026-10-28T15:34:06.716227255Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "972321",
  "sent_at": "2026-10-28T15:34:05.71848694Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d0dad0d-aa08-40bc-b612-79dbd023d835",
  "code": "972321",
  "device_ref": "sandbox-8976"
}
```

```json
{
  "session_id": "3d8b844f-5f42-4e41-893e-71053aba87eb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjU0NiwiaWF0IjoxNzkzMjAxNjQ2LCJqdGkiOiJkZDlhZjdiNy02OGM3LTQ1MjItOWNmNy00NDlkNWI3OThlNjkiLCJzaWQiOiIzZDhiODQ0Zi01ZjQyLTRlNDEtODkzZS03MTA1M2FiYTg3ZWIifQ.FEgacuwssQICGVvkWqz_0jIk4SXXYgNeaLP9sRoOX0A",
  "access_expires_at": "2026-10-28T15:49:06.007360918Z",
  "refresh_token": "SJPsni9W9R5Niht4ADnndqLG2EkCIY9kyfAFRi6gxzo",
  "refresh_expires_at": "2026-11-27T15:34:06.006665852Z",
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
  "command_id": "1a815daa-bc3f-4fb2-887a-169f54b2fd3c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:34:06Z",
    "sequence": 1793201646531
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "aad242bc-43c8-4a52-b641-211f8f7b81a9",
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
  "last_heartbeat_at": "2026-10-28T15:34:06.550447Z",
  "last_location_at": "2026-10-28T15:34:06.550447Z",
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
  "session_id": "aad242bc-43c8-4a52-b641-211f8f7b81a9",
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
  "last_heartbeat_at": "2026-10-28T15:34:06.550447Z",
  "last_location_at": "2026-10-28T15:34:06.550447Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aad242bc-43c8-4a52-b641-211f8f7b81a9/close` → **200**

```json
{
  "command_id": "d8a5dedd-1bfa-483b-a1b2-d27f9328117f",
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

`GET /api/driver/v1/safety-contacts` → **409**

```json
{
  "instance": "/api/driver/v1/safety-contacts",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dccaf3da-ed7e-4814-b057-425c0f04df00"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671515697",
  "device_ref": "sandbox-3991"
}
```

```json
{
  "challenge_id": "3a0562a0-291f-4b0d-a152-2db9e38eeeb9",
  "expires_at": "2026-10-28T15:39:07.911576286Z",
  "resend_available_at": "2026-10-28T15:34:08.911576286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671515697` → **200**

```json
{
  "phone": "+380671515697",
  "audience": "CLIENT",
  "code": "382771",
  "sent_at": "2026-10-28T15:34:07.913610198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a0562a0-291f-4b0d-a152-2db9e38eeeb9",
  "code": "382771",
  "device_ref": "sandbox-3991"
}
```

```json
{
  "session_id": "e6e9a5b4-e6b3-41eb-be77-c068547b41f4",
  "subject": {
    "type": "CLIENT",
    "id": "954f7278-740a-46f3-9b89-66ee986e8a8c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NTRmNzI3OC03NDBhLTQ2ZjMtOWI4OS02NmVlOTg2ZThhOGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNTQ4LCJpYXQiOjE3OTMyMDE2NDgsImp0aSI6IjNkNzYxZWFlLTlkNjUtNGNlYy04ZjJmLTQxMGU4MjYzOTRmMiIsInNpZCI6ImU2ZTlhNWI0LWU2YjMtNDFlYi1iZTc3LWMwNjg1NDdiNDFmNCJ9.GMFwR6CLeMgvzZtPxcwT292zZ_hMcnKXT8nuBWb0uEk",
  "access_expires_at": "2026-10-28T15:49:08.201519872Z",
  "refresh_token": "nvcrstR5bggzhzYQpgLhhyX0UbD6A9BGrOWcmzLe9cQ",
  "refresh_expires_at": "2026-11-27T15:34:08.200891461Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "efac577a-f56f-4c25-8be5-723888792060",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "83461356-af11-43f7-b6c6-4e18e008609e",
  "upload_path": "/api/rider/v1/uploads/83461356-af11-43f7-b6c6-4e18e008609e",
  "expires_at": "2026-10-28T15:49:08.471494048Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/83461356-af11-43f7-b6c6-4e18e008609e` → **200**

```json
{
  "file_id": "83461356-af11-43f7-b6c6-4e18e008609e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "13bd80af-8606-4e18-906f-cbb5e885a77e",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "83461356-af11-43f7-b6c6-4e18e008609e"
  ]
}
```

```json
{
  "id": "0aff2dce-744f-4f79-98c2-4bb4665f50a3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "954f7278-740a-46f3-9b89-66ee986e8a8c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:34:08.773938Z",
  "updated_at": "2026-10-28T15:34:08.773938Z",
  "messages": [
    {
      "id": "39863b4d-a572-4f91-836f-e89f230ec484",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "954f7278-740a-46f3-9b89-66ee986e8a8c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:34:08.775341Z",
      "attachments": [
        {
          "file_id": "83461356-af11-43f7-b6c6-4e18e008609e",
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
  "session_id": "dbdbddd6-5854-4a5b-b32b-000af3adad4f",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1NDksImlhdCI6MTc5MzIwMTY0OSwianRpIjoiYTU3NGQ2YTItNTU4MC00OWJlLWE5ZGMtMDY4MDU3Y2Q0OWUxIiwic2lkIjoiZGJkYmRkZDYtNTg1NC00YTViLWIzMmItMDAwYWYzYWRhZDRmIn0.eVcsRX3L0sS_4CVoGe5kb74euN_F-ODfJgCR4Xx73qI",
  "access_expires_at": "2026-10-28T15:49:09.403109435Z",
  "refresh_token": "Ovai4YTl0WvFxMkw99bXrA_FG2HO_UPAPoQ2Qzt4qG4",
  "refresh_expires_at": "2026-10-29T03:34:09.399108069Z",
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
  "session_id": "0b1f3c1d-5250-4065-bb5d-6d972d9a57c8",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1NTAsImlhdCI6MTc5MzIwMTY1MCwianRpIjoiZDhkZDcyZWUtYTI3Ny00Mjc1LWE3OGItN2ZhOTU1M2YwYzgwIiwic2lkIjoiMGIxZjNjMWQtNTI1MC00MDY1LWJiNWQtNmQ5NzJkOWE1N2M4In0.24QzF_9WWykiCnTdYpnLi8S73lP_V4Q7swC4AIVS41I",
  "access_expires_at": "2026-10-28T15:49:10.020659624Z",
  "refresh_token": "furRWeSf6JWI9hkyOnrJlaCUiGlxicd74D9I5wENzy0",
  "refresh_expires_at": "2026-10-29T03:34:10.019919343Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/0aff2dce-744f-4f79-98c2-4bb4665f50a3/attachments/83461356-af11-43f7-b6c6-4e18e008609e` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "0696cbcc-5fcf-47be-be43-3e6aa8a9c32b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "5c8e9062-0232-476a-8d3c-c5ac9aa637e8",
  "upload_path": "/api/operator/v1/uploads/5c8e9062-0232-476a-8d3c-c5ac9aa637e8",
  "expires_at": "2026-10-28T15:49:10.308819504Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/5c8e9062-0232-476a-8d3c-c5ac9aa637e8` → **200**

```json
{
  "file_id": "5c8e9062-0232-476a-8d3c-c5ac9aa637e8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/0aff2dce-744f-4f79-98c2-4bb4665f50a3` → **200**

```json
{
  "id": "0aff2dce-744f-4f79-98c2-4bb4665f50a3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "954f7278-740a-46f3-9b89-66ee986e8a8c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:34:08.773938Z",
  "updated_at": "2026-10-28T15:34:08.773938Z",
  "messages": [
    {
      "id": "39863b4d-a572-4f91-836f-e89f230ec484",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "954f7278-740a-46f3-9b89-66ee986e8a8c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:34:08.775341Z",
      "attachments": [
        {
          "file_id": "83461356-af11-43f7-b6c6-4e18e008609e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/0aff2dce-744f-4f79-98c2-4bb4665f50a3/comments` → **200**

```json
{
  "command_id": "70bdd929-a24c-472e-94ee-e57cc81be55b",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "5c8e9062-0232-476a-8d3c-c5ac9aa637e8"
  ]
}
```

```json
{
  "id": "0aff2dce-744f-4f79-98c2-4bb4665f50a3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "954f7278-740a-46f3-9b89-66ee986e8a8c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:34:08.773938Z",
  "updated_at": "2026-10-28T15:34:10.894357Z",
  "messages": [
    {
      "id": "39863b4d-a572-4f91-836f-e89f230ec484",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "954f7278-740a-46f3-9b89-66ee986e8a8c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:34:08.775341Z",
      "attachments": [
        {
          "file_id": "83461356-af11-43f7-b6c6-4e18e008609e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "812e5ec9-9b38-43bd-8b59-eeff0a9198a7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:34:10.893964Z",
      "attachments": [
        {
          "file_id": "5c8e9062-0232-476a-8d3c-c5ac9aa637e8",
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

`GET /api/rider/v1/support/cases/0aff2dce-744f-4f79-98c2-4bb4665f50a3` → **200**

```json
{
  "id": "0aff2dce-744f-4f79-98c2-4bb4665f50a3",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "954f7278-740a-46f3-9b89-66ee986e8a8c",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:34:08.773938Z",
  "updated_at": "2026-10-28T15:34:10.894357Z",
  "messages": [
    {
      "id": "39863b4d-a572-4f91-836f-e89f230ec484",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "954f7278-740a-46f3-9b89-66ee986e8a8c",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:34:08.775341Z",
      "attachments": [
        {
          "file_id": "83461356-af11-43f7-b6c6-4e18e008609e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "812e5ec9-9b38-43bd-8b59-eeff0a9198a7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:34:10.893964Z",
      "attachments": [
        {
          "file_id": "5c8e9062-0232-476a-8d3c-c5ac9aa637e8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/0aff2dce-744f-4f79-98c2-4bb4665f50a3/attachments/5c8e9062-0232-476a-8d3c-c5ac9aa637e8` → **200**

Done: support case 0aff2dce-744f-4f79-98c2-4bb4665f50a3, rider attachment 83461356-af11-43f7-b6c6-4e18e008609e, operator attachment 5c8e9062-0232-476a-8d3c-c5ac9aa637e8.

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
  "session_id": "a402ce1a-e606-4f48-bf77-846cc122e97b",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1NTEsImlhdCI6MTc5MzIwMTY1MSwianRpIjoiM2VhZGMwZjctOTg5NS00Nzk4LTlkMDMtNDUzMWE3YzgyMThjIiwic2lkIjoiYTQwMmNlMWEtZTYwNi00ZjQ4LWJmNzctODQ2Y2MxMjJlOTdiIn0.-pUYl_EUTLfTpCgYyve4pHCZTGzBjg-uEgF3YvFgIBY",
  "access_expires_at": "2026-10-28T15:49:11.771112078Z",
  "refresh_token": "sZOwm4xbIvyqUcU2uOkw1SGo8HbZIlvMImOgdGIpv9Q",
  "refresh_expires_at": "2026-10-29T03:34:11.77051234Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13554"
}
```

```json
{
  "challenge_id": "b0bd43a4-763f-472a-99e1-e31c62d1f6e6",
  "expires_at": "2026-10-28T15:39:12.034525003Z",
  "resend_available_at": "2026-10-28T15:34:13.034525003Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "420627",
  "sent_at": "2026-10-28T15:34:12.036905752Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0bd43a4-763f-472a-99e1-e31c62d1f6e6",
  "code": "420627",
  "device_ref": "sandbox-13554"
}
```

```json
{
  "session_id": "e10a0e37-0355-4b27-b6ec-642714637fae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjU1MiwiaWF0IjoxNzkzMjAxNjUyLCJqdGkiOiI4Mzc4ZjZmZC1hMGY1LTQzMzEtYWQ2MC1mNTVkYWQzOGZhZTQiLCJzaWQiOiJlMTBhMGUzNy0wMzU1LTRiMjctYjZlYy02NDI3MTQ2MzdmYWUifQ.i6gTENuvMQZ9c_-rwo3ZmMuv9QSorE-qmO582GPf3eM",
  "access_expires_at": "2026-10-28T15:49:12.332326908Z",
  "refresh_token": "oDCxdr7kGR11d5xkO3d_h_7aAGBr4tjboavnSWPn4yA",
  "refresh_expires_at": "2026-11-27T15:34:12.331746906Z",
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
      "actor_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:34:01.029729Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "2155bcaf-5441-456a-8334-5423de150ccd",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T15:34:02.412329Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "dee61ca5-2de1-40c9-b520-b8878090c6b6",
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
  "device_ref": "sandbox-22341"
}
```

```json
{
  "challenge_id": "630edf08-ca02-41f8-bb6d-f6a6b73961f1",
  "expires_at": "2026-10-28T15:39:13.427976474Z",
  "resend_available_at": "2026-10-28T15:34:14.427976474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "981733",
  "sent_at": "2026-10-28T15:34:13.430166839Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "630edf08-ca02-41f8-bb6d-f6a6b73961f1",
  "code": "981733",
  "device_ref": "sandbox-22341"
}
```

```json
{
  "session_id": "3f1624e0-df35-4a98-9196-d77ab9c5ad57",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjU1MywiaWF0IjoxNzkzMjAxNjUzLCJqdGkiOiIyNjJiZGM2YS0zYmU3LTRhY2QtYmYzNy00Yzc4ODNmZjQyMWEiLCJzaWQiOiIzZjE2MjRlMC1kZjM1LTRhOTgtOTE5Ni1kNzdhYjljNWFkNTcifQ.DMIUR5rlaGewTyTqG_PKB4LP3kJ-o9nVE8fwYUvcZ3I",
  "access_expires_at": "2026-10-28T15:49:13.718769558Z",
  "refresh_token": "fCWPp4mSJxh2dkvDwWc83TlDSuEnJ0aobc6Bfs_kOvY",
  "refresh_expires_at": "2026-11-27T15:34:13.718222248Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdce49ae-a554-49e7-b3e0-6a07512919c4",
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
  "last_heartbeat_at": "2026-10-28T15:33:40.168441Z",
  "last_location_at": "2026-10-28T15:33:40.168441Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fdce49ae-a554-49e7-b3e0-6a07512919c4/handover` → **200**

```json
{
  "command_id": "20732240-f646-4737-b922-3061f87a6d15",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdce49ae-a554-49e7-b3e0-6a07512919c4",
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
  "last_heartbeat_at": "2026-10-28T15:33:40.168441Z",
  "last_location_at": "2026-10-28T15:33:40.168441Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fdce49ae-a554-49e7-b3e0-6a07512919c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:34:14Z",
    "sequence": 1793201654510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdce49ae-a554-49e7-b3e0-6a07512919c4",
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
  "last_heartbeat_at": "2026-10-28T15:34:14.529259Z",
  "last_location_at": "2026-10-28T15:34:14.529259Z",
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
  "command_id": "a592910c-2db9-4079-ad54-56c3cd610ffe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:34:15Z",
    "sequence": 1793201655483
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "baef7295-4bfa-4689-a9d0-11fedebe6630",
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
  "last_heartbeat_at": "2026-10-28T15:34:15.066714Z",
  "last_location_at": "2026-10-28T15:34:15.066714Z",
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
  "session_id": "189bfd6a-3305-4a40-b1cf-ab71c1bb3198",
  "subject": {
    "type": "STAFF",
    "id": "2155bcaf-5441-456a-8334-5423de150ccd"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTU1YmNhZi01NDQxLTQ1NmEtODMzNC01NDIzZGUxNTBjY2QiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI1NTUsImlhdCI6MTc5MzIwMTY1NSwianRpIjoiYmU3MjQ2MTYtZWU3Ni00OWFiLWE4MmYtNjVjY2U5OTdiN2IzIiwic2lkIjoiMTg5YmZkNmEtMzMwNS00YTQwLWIxY2YtYWI3MWMxYmIzMTk4In0.qNIltTL9F7vDQjnzVpV1oynEWa6LWFOto3_epKsjSNc",
  "access_expires_at": "2026-10-28T15:49:15.624340576Z",
  "refresh_token": "EQ_EyqP1HLXS9b68O6oL_MFGVAsDMOSY5nAfp5dUwsU",
  "refresh_expires_at": "2026-10-29T03:34:15.623743052Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "200ae167-750b-4ca1-9474-0f29a04dd5ca",
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
  "id": "ed95e83b-2131-4fa0-9371-f0567afaaa7e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:39:15.893698Z",
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
  "command_id": "d63be878-bb81-4fba-88c6-07dad3e92701",
  "quote_id": "ed95e83b-2131-4fa0-9371-f0567afaaa7e",
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
  "id": "1d513104-f9d4-4e69-97a5-ce085a754673",
  "short_number": 18,
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
  "created_at": "2026-10-28T15:34:16.170977Z",
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
    "id": "ffe1b961-064e-47c7-9a5c-ca2db385a729",
    "order_id": "1d513104-f9d4-4e69-97a5-ce085a754673",
    "expires_at": "2026-10-28T15:34:31.175829Z",
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

`POST /api/driver/v1/offers/ffe1b961-064e-47c7-9a5c-ca2db385a729/accept` → **200**

```json
{
  "command_id": "a23ff731-ce0a-4d20-a525-c19cd5251659"
}
```

```json
{
  "id": "7f7d6c46-c8ce-4e71-8725-b4400319bc69",
  "order_id": "1d513104-f9d4-4e69-97a5-ce085a754673",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a92ec6c2-9a19-43bc-9e25-f775d153a21e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a92ec6c2-9a19-43bc-9e25-f775d153a21e",
  "order_id": "1d513104-f9d4-4e69-97a5-ce085a754673",
  "assignment_id": "7f7d6c46-c8ce-4e71-8725-b4400319bc69",
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

`POST /api/driver/v1/work-sessions/baef7295-4bfa-4689-a9d0-11fedebe6630/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:34:17Z",
    "sequence": 1793201657508
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "baef7295-4bfa-4689-a9d0-11fedebe6630",
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
  "last_heartbeat_at": "2026-10-28T15:34:17.527519Z",
  "last_location_at": "2026-10-28T15:34:17.527519Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a92ec6c2-9a19-43bc-9e25-f775d153a21e/arrive` → **200**

```json
{
  "command_id": "ade69914-c2c6-454e-bde3-c86faad7d0ed",
  "expected_version": 0
}
```

```json
{
  "id": "a92ec6c2-9a19-43bc-9e25-f775d153a21e",
  "order_id": "1d513104-f9d4-4e69-97a5-ce085a754673",
  "assignment_id": "7f7d6c46-c8ce-4e71-8725-b4400319bc69",
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
  "arrived_at": "2026-10-28T15:34:17.800167Z",
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

`POST /api/driver/v1/trips/a92ec6c2-9a19-43bc-9e25-f775d153a21e/start` → **200**

```json
{
  "command_id": "9b1eb785-f312-4c6d-abde-e46b87eb59e2",
  "expected_version": 1
}
```

```json
{
  "id": "a92ec6c2-9a19-43bc-9e25-f775d153a21e",
  "order_id": "1d513104-f9d4-4e69-97a5-ce085a754673",
  "assignment_id": "7f7d6c46-c8ce-4e71-8725-b4400319bc69",
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
  "arrived_at": "2026-10-28T15:34:17.800167Z",
  "started_at": "2026-10-28T15:34:18.090469Z",
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

`POST /api/driver/v1/trips/a92ec6c2-9a19-43bc-9e25-f775d153a21e/complete` → **200**

```json
{
  "command_id": "1c870c8a-636a-4e00-b335-a65db7429312",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:34:18Z",
  "cash_received": true
}
```

```json
{
  "id": "a92ec6c2-9a19-43bc-9e25-f775d153a21e",
  "order_id": "1d513104-f9d4-4e69-97a5-ce085a754673",
  "assignment_id": "7f7d6c46-c8ce-4e71-8725-b4400319bc69",
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
  "arrived_at": "2026-10-28T15:34:17.800167Z",
  "started_at": "2026-10-28T15:34:18.090469Z",
  "completed_at": "2026-10-28T15:34:18.382814Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/1d513104-f9d4-4e69-97a5-ce085a754673` → **200**

```json
{
  "id": "1d513104-f9d4-4e69-97a5-ce085a754673",
  "short_number": 18,
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
    "id": "7f7d6c46-c8ce-4e71-8725-b4400319bc69",
    "order_id": "1d513104-f9d4-4e69-97a5-ce085a754673",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a92ec6c2-9a19-43bc-9e25-f775d153a21e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:34:16.170977Z",
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
      "balance_minor": 11857,
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
  "session_id": "fdce49ae-a554-49e7-b3e0-6a07512919c4",
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
  "last_heartbeat_at": "2026-10-28T15:34:14.529259Z",
  "last_location_at": "2026-10-28T15:34:14.529259Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fdce49ae-a554-49e7-b3e0-6a07512919c4/close` → **200**

```json
{
  "command_id": "31f368f0-3c43-4b36-9575-99fc25fb01fd",
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
  "session_id": "baef7295-4bfa-4689-a9d0-11fedebe6630",
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
  "last_heartbeat_at": "2026-10-28T15:34:17.527519Z",
  "last_location_at": "2026-10-28T15:34:17.527519Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/baef7295-4bfa-4689-a9d0-11fedebe6630/close` → **200**

```json
{
  "command_id": "b89030c8-fe82-4920-865a-07a1d83efe08",
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

Done: terminal order 1d513104-f9d4-4e69-97a5-ce085a754673 by Andrii (5a000000-0000-4000-8000-000000000403).
