# Sandbox transcript (2026-10-28T14:24:59Z, f1df0c9)

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
  "correlation_id": "48bcee49-4056-48ba-86a9-ba74b8c0de90"
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
  "session_id": "f452430c-f5ea-4416-9ce5-9f4ede3df42f",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0MDUsImlhdCI6MTc5MzE5NzUwNSwianRpIjoiYmFiMDU5YzAtY2MwYy00YTk5LWE0NjMtZmEwNzYzODRhNmE3Iiwic2lkIjoiZjQ1MjQzMGMtZjVlYS00NDE2LTljZTUtOWY0ZWRlM2RmNDJmIn0.x5dgh20NSScz-_fR6lQXA6gZoKO2L5eafOjhJyBaIpE",
  "access_expires_at": "2026-10-28T14:40:05.574831565Z",
  "refresh_token": "3wojezb3TFBQFTB3RSssqzY-4VZe0lqK5yR28CO-EKk",
  "refresh_expires_at": "2026-10-29T02:25:05.573015581Z",
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
  "session_id": "7196770c-73f8-4371-8e50-8db19d42e7f0",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0MDYsImlhdCI6MTc5MzE5NzUwNiwianRpIjoiYmE4ZGE5MmUtZGZiYi00NWY3LThiMTEtZTFlODg3N2RkYjEzIiwic2lkIjoiNzE5Njc3MGMtNzNmOC00MzcxLThlNTAtOGRiMTlkNDJlN2YwIn0.WISWaKOKotvzqpWZGuc2MY6iI3W7zo5Zu3MheEVHaBY",
  "access_expires_at": "2026-10-28T14:40:06.951296443Z",
  "refresh_token": "1Ie8rTA7vl0OiEcfuA8iKlyiK0rYGetTagbBHxsuDOQ",
  "refresh_expires_at": "2026-10-29T02:25:06.950155995Z",
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

`POST /api/admin/v1/settings` → **400**

```json
{
  "command_id": "ba28dd04-5f1e-4974-a3eb-6fb12ff8190c",
  "expected_version": 0,
  "settings": {
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
      "app_versions": {
        "driver_android": {
          "minimum_version": "9.0.0"
        }
      }
    },
    "changed_by": null,
    "reason": null,
    "changed_at": null
  },
  "reason": "Sandbox: force update"
}
```

```json
{
  "instance": "/api/admin/v1/settings",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f4e0c770-7b92-4174-96ea-af944fd8627d"
}
```

**Expected 200, got 400 — scenario stopped.**

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
  "command_id": "8b60ba72-2887-48e0-b546-f346c41ba82c",
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
    "app_versions": null
  },
  "reason": "Sandbox clean-up"
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
    "app_versions": null
  },
  "changed_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T14:25:07.899572805Z"
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
  "session_id": "7cd041c7-1293-498a-b610-0e4bf88797ae",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0MDgsImlhdCI6MTc5MzE5NzUwOCwianRpIjoiNDRmY2JhYjktY2RlYi00NjdlLThiY2EtODA1MzIyYjlkMzUxIiwic2lkIjoiN2NkMDQxYzctMTI5My00OThhLWI2MTAtMGU0YmY4ODc5N2FlIn0.SyX0sCShFRZM_-igqf3bCFq_0Lh5qonRutgQJmGDZ6o",
  "access_expires_at": "2026-10-28T14:40:08.399691531Z",
  "refresh_token": "kHsd--KL-m_0wnrxH6j0a67PayVBoAOGPhTmx2v0hZI",
  "refresh_expires_at": "2026-10-29T02:25:08.399000535Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "b7dfd9be-3059-4401-b025-b2684594b19d",
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
  "id": "331908dd-a648-4277-8f21-e390b640f3d9",
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
  "created_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "created_at": "2026-10-28T14:25:08.629894Z",
  "updated_at": "2026-10-28T14:25:08.629894Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638540430",
  "device_ref": "sandbox-5085"
}
```

```json
{
  "challenge_id": "851dff6b-1e57-4eb7-b462-1c1384b5eb80",
  "expires_at": "2026-10-28T14:30:08.866557214Z",
  "resend_available_at": "2026-10-28T14:25:09.866557214Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638540430` → **200**

```json
{
  "phone": "+380638540430",
  "audience": "CLIENT",
  "code": "949234",
  "sent_at": "2026-10-28T14:25:08.872760111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "851dff6b-1e57-4eb7-b462-1c1384b5eb80",
  "code": "949234",
  "device_ref": "sandbox-5085"
}
```

```json
{
  "session_id": "35af2822-e1de-46f7-b021-96d1e624778b",
  "subject": {
    "type": "CLIENT",
    "id": "cdd9bf63-3b24-47be-bef7-e976fac2e64d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZGQ5YmY2My0zYjI0LTQ3YmUtYmVmNy1lOTc2ZmFjMmU2NGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDA5LCJpYXQiOjE3OTMxOTc1MDksImp0aSI6IjBlMTM5YTg5LWVlYWMtNGZlZS1iNDIxLTUzZmMwMWMzMjY5MyIsInNpZCI6IjM1YWYyODIyLWUxZGUtNDZmNy1iMDIxLTk2ZDFlNjI0Nzc4YiJ9.CZF5MzSUMvjk1rDTUClBxZ_VWDhvxOhGcGAszDJgHtE",
  "access_expires_at": "2026-10-28T14:40:09.119222648Z",
  "refresh_token": "IOnF4q1uZ8Cjlyr-sOhKxnz1enEFxXPBekVhROldH1w",
  "refresh_expires_at": "2026-11-27T14:25:09.118453919Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380638540430` → **200**

```json
{
  "client_id": "cdd9bf63-3b24-47be-bef7-e976fac2e64d"
}
```

`POST /api/admin/v1/rider-wallets/cdd9bf63-3b24-47be-bef7-e976fac2e64d/top-ups` → **201**

```json
{
  "command_id": "32a6891c-61af-4451-aba7-38d245cd3588",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "cdd9bf63-3b24-47be-bef7-e976fac2e64d",
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
      "id": "93241582-daf4-46b5-a90d-7fda47cdc0a2",
      "at": "2026-10-28T14:25:09.560114Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "87c6bbed-7eeb-4b3f-875c-9a181ae837ae",
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
  "id": "55c451e1-df4c-439f-ae01-f5da02da4976",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:30:09.882816Z",
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
      "id": "331908dd-a648-4277-8f21-e390b640f3d9",
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
  "device_ref": "sandbox-10435"
}
```

```json
{
  "challenge_id": "7b298f14-c7a9-4611-9a9f-c8fcf70b452f",
  "expires_at": "2026-10-28T14:30:10.130842671Z",
  "resend_available_at": "2026-10-28T14:25:11.130842671Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "359599",
  "sent_at": "2026-10-28T14:25:10.134078495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b298f14-c7a9-4611-9a9f-c8fcf70b452f",
  "code": "359599",
  "device_ref": "sandbox-10435"
}
```

```json
{
  "session_id": "2bc8279b-09f8-48ef-bb77-1492b652330b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQxMCwiaWF0IjoxNzkzMTk3NTEwLCJqdGkiOiJkMGY1MjY1MC1mZWZhLTQ1NDgtOGNhNC05MTg1YWI5MDQ3MzkiLCJzaWQiOiIyYmM4Mjc5Yi0wOWY4LTQ4ZWYtYmI3Ny0xNDkyYjY1MjMzMGIifQ.gXU4JQq3hrJ0EZ4Vi16Mqgy8FyAzMUPqEYxn_z5jKgk",
  "access_expires_at": "2026-10-28T14:40:10.382529008Z",
  "refresh_token": "kZTBmkKa2WrzVRxCEWRXPiFfHvxzHdk--FqMcPcggT0",
  "refresh_expires_at": "2026-11-27T14:25:10.38165208Z",
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
  "command_id": "e99203a2-8fe2-4d3d-884c-9f394d1b0dbf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:25:10Z",
    "sequence": 1793197510817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "255ac6a4-7db2-4dd4-9de0-a81b52358ab5",
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
  "last_heartbeat_at": "2026-10-28T14:25:10.859668Z",
  "last_location_at": "2026-10-28T14:25:10.859668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "23e065cc-ebfa-487a-b26f-59e8df11622f",
  "quote_id": "55c451e1-df4c-439f-ae01-f5da02da4976",
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
  "id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cdd9bf63-3b24-47be-bef7-e976fac2e64d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:25:11.130782Z",
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
  "client_id": "cdd9bf63-3b24-47be-bef7-e976fac2e64d",
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
      "id": "93241582-daf4-46b5-a90d-7fda47cdc0a2",
      "at": "2026-10-28T14:25:09.560114Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
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
    "id": "575a4a41-308e-4c68-b610-839cb3eea555",
    "order_id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701",
    "expires_at": "2026-10-28T14:25:26.141446Z",
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

`POST /api/driver/v1/offers/575a4a41-308e-4c68-b610-839cb3eea555/accept` → **200**

```json
{
  "command_id": "393c282f-55cc-4bb8-8af6-83ca0e7c7911"
}
```

```json
{
  "id": "ff918494-8c0b-4f55-ba42-a2b976541064",
  "order_id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa396b63-f584-41a2-a5e6-83a9748684cd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa396b63-f584-41a2-a5e6-83a9748684cd",
  "order_id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701",
  "assignment_id": "ff918494-8c0b-4f55-ba42-a2b976541064",
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

`POST /api/driver/v1/work-sessions/255ac6a4-7db2-4dd4-9de0-a81b52358ab5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:25:12Z",
    "sequence": 1793197512273
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "255ac6a4-7db2-4dd4-9de0-a81b52358ab5",
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
  "last_heartbeat_at": "2026-10-28T14:25:12.297257Z",
  "last_location_at": "2026-10-28T14:25:12.297257Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/aa396b63-f584-41a2-a5e6-83a9748684cd/arrive` → **200**

```json
{
  "command_id": "9b21ae3a-9895-4dda-b905-7198456ff5e8",
  "expected_version": 0
}
```

```json
{
  "id": "aa396b63-f584-41a2-a5e6-83a9748684cd",
  "order_id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701",
  "assignment_id": "ff918494-8c0b-4f55-ba42-a2b976541064",
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
  "arrived_at": "2026-10-28T14:25:12.54217Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/aa396b63-f584-41a2-a5e6-83a9748684cd/start` → **200**

```json
{
  "command_id": "9c1f9760-28f1-41ba-b50a-d9d5a4bab0ef",
  "expected_version": 1
}
```

```json
{
  "id": "aa396b63-f584-41a2-a5e6-83a9748684cd",
  "order_id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701",
  "assignment_id": "ff918494-8c0b-4f55-ba42-a2b976541064",
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
  "arrived_at": "2026-10-28T14:25:12.54217Z",
  "started_at": "2026-10-28T14:25:12.772753Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/aa396b63-f584-41a2-a5e6-83a9748684cd/complete` → **200**

```json
{
  "command_id": "4f634412-b34d-4bce-8469-96d8493ece7f",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:25:13Z",
  "cash_received": true
}
```

```json
{
  "id": "aa396b63-f584-41a2-a5e6-83a9748684cd",
  "order_id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701",
  "assignment_id": "ff918494-8c0b-4f55-ba42-a2b976541064",
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
  "arrived_at": "2026-10-28T14:25:12.54217Z",
  "started_at": "2026-10-28T14:25:12.772753Z",
  "completed_at": "2026-10-28T14:25:13.028696Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "cdd9bf63-3b24-47be-bef7-e976fac2e64d",
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
      "id": "7d9bcb60-bbad-469c-8c82-c0f240cf36ed",
      "at": "2026-10-28T14:25:13.881599Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701"
    },
    {
      "id": "93241582-daf4-46b5-a90d-7fda47cdc0a2",
      "at": "2026-10-28T14:25:09.560114Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/331908dd-a648-4277-8f21-e390b640f3d9/archive` → **200**

```json
{
  "command_id": "11ea5e45-1377-41a5-8acd-5166dcfb42ad",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "331908dd-a648-4277-8f21-e390b640f3d9",
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
  "created_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "created_at": "2026-10-28T14:25:08.629894Z",
  "updated_at": "2026-10-28T14:25:16.508261Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "255ac6a4-7db2-4dd4-9de0-a81b52358ab5",
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
  "last_heartbeat_at": "2026-10-28T14:25:12.297257Z",
  "last_location_at": "2026-10-28T14:25:12.297257Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/255ac6a4-7db2-4dd4-9de0-a81b52358ab5/close` → **200**

```json
{
  "command_id": "d995f822-72e6-4285-a1f5-2ed70367caf1",
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

Done: order 744cc4ee-2a4c-4a3e-bf46-9bb91f7da701.

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
  "session_id": "5c871bea-c1c0-4d4d-9477-6802f3779e15",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0MTcsImlhdCI6MTc5MzE5NzUxNywianRpIjoiYzkzMTdhYTQtMDA5Yy00ZmM4LWI5YjEtOWVmZTVlODNjZGUxIiwic2lkIjoiNWM4NzFiZWEtYzFjMC00ZDRkLTk0NzctNjgwMmYzNzc5ZTE1In0.zb49nLhmG6IwquU4JtQwUoBBtk9WHrsZKXJGQF35880",
  "access_expires_at": "2026-10-28T14:40:17.463816891Z",
  "refresh_token": "fROSvcWFoiC8RQ_kPGiB71vd8gyiXJh74RWI6njc5MU",
  "refresh_expires_at": "2026-10-29T02:25:17.463159945Z",
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
  "command_id": "2bbd6d19-6872-498b-9217-118795963b85",
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
  "session_id": "5509f258-d882-4129-af2f-c8f6570495eb",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0MTgsImlhdCI6MTc5MzE5NzUxOCwianRpIjoiYmVmYzM5ODMtYTVkMS00NTliLTlmMzctMGNlOWQ3Y2ViYzA1Iiwic2lkIjoiNTUwOWYyNTgtZDg4Mi00MTI5LWFmMmYtYzhmNjU3MDQ5NWViIn0.-qQQPS19xbEjMHiz_qBxSw7q3xlGGPklV3DX768Qtho",
  "access_expires_at": "2026-10-28T14:40:18.459648321Z",
  "refresh_token": "W3hMRkWTE-pPZ6Y1giTMhLrc2k_05w7PpJqT5e_azD0",
  "refresh_expires_at": "2026-10-29T02:25:18.459090361Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2799129880",
    "linkedid": "1730052700.2799129880",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673092723"
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
    "id": "1730052700.2799129880",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "5a1807cf-e142-49e3-a956-1481679b279c",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.672636Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:25:18.695506Z",
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
    "id": "1730052600.2005921967",
    "linkedid": "1730052600.2005921967",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673092723"
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
      "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.961037Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/5a04e863-4a29-4fa0-8fd4-45f87f5e114d/answer` → **200**

```json
{
  "command_id": "5dc6da2e-670c-4306-8e06-8c15f977a8f8"
}
```

```json
{
  "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673092723",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "order_ids": [],
  "started_at": "2026-10-28T14:25:18.961037Z",
  "answered_at": "2026-10-28T14:25:19.222737Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2005921967",
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
    "id": "1730052600.2005921967",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.961037Z",
      "answered_at": "2026-10-28T14:25:19.222737Z",
      "ended_at": "2026-10-28T14:25:19.467552Z",
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
      "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.961037Z",
      "answered_at": "2026-10-28T14:25:19.222737Z",
      "ended_at": "2026-10-28T14:25:19.467552Z",
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
      "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.961037Z",
      "answered_at": "2026-10-28T14:25:19.222737Z",
      "ended_at": "2026-10-28T14:25:19.467552Z",
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
      "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.961037Z",
      "answered_at": "2026-10-28T14:25:19.222737Z",
      "ended_at": "2026-10-28T14:25:19.467552Z",
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
      "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.961037Z",
      "answered_at": "2026-10-28T14:25:19.222737Z",
      "ended_at": "2026-10-28T14:25:19.467552Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:25:27.752289Z"
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
      "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.961037Z",
      "answered_at": "2026-10-28T14:25:19.222737Z",
      "ended_at": "2026-10-28T14:25:19.467552Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:25:27.752289Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/5a04e863-4a29-4fa0-8fd4-45f87f5e114d/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/5a04e863-4a29-4fa0-8fd4-45f87f5e114d/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=5a04e863-4a29-4fa0-8fd4-45f87f5e114d` → **200**

```json
{
  "changes": [
    {
      "id": "18900973-0f58-4e8b-8e18-4aceced1dfde",
      "occurred_at": "2026-10-28T14:25:28.894797Z",
      "actor_type": "STAFF",
      "actor_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"25521885-4767-4949-98f0-3271d8ca4371\", \"order_ids\": []}",
      "correlation_id": "c1272a4d-af41-4db7-985d-11c283d103d5"
    },
    {
      "id": "509893b2-0e48-4106-a788-fd6a2156a819",
      "occurred_at": "2026-10-28T14:25:28.862493Z",
      "actor_type": "STAFF",
      "actor_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"25521885-4767-4949-98f0-3271d8ca4371\", \"order_ids\": []}",
      "correlation_id": "7e56bf42-3214-403b-92e2-144167d7470d"
    }
  ]
}
```

Done: call 5a04e863-4a29-4fa0-8fd4-45f87f5e114d recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633823311",
  "device_ref": "sandbox-22893"
}
```

```json
{
  "challenge_id": "6b882574-9316-4d85-91f6-384135a70d21",
  "expires_at": "2026-10-28T14:30:29.197210087Z",
  "resend_available_at": "2026-10-28T14:25:30.197210087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633823311` → **200**

```json
{
  "phone": "+380633823311",
  "audience": "CLIENT",
  "code": "914088",
  "sent_at": "2026-10-28T14:25:29.200166959Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b882574-9316-4d85-91f6-384135a70d21",
  "code": "914088",
  "device_ref": "sandbox-22893"
}
```

```json
{
  "session_id": "a8a07497-d837-4c82-aa64-6018257ccac5",
  "subject": {
    "type": "CLIENT",
    "id": "870511bb-0026-4562-a274-f05d090a1af6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NzA1MTFiYi0wMDI2LTQ1NjItYTI3NC1mMDVkMDkwYTFhZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDI5LCJpYXQiOjE3OTMxOTc1MjksImp0aSI6Ijg4MzBjYWZjLTkwNTgtNDVkNi04YTMwLTZkMzVlMTQ1NTJjOSIsInNpZCI6ImE4YTA3NDk3LWQ4MzctNGM4Mi1hYTY0LTYwMTgyNTdjY2FjNSJ9.Z_fHMxgc0kZkFigVqAZgAa7L1nX-ZNd1xljt0J6qB5o",
  "access_expires_at": "2026-10-28T14:40:29.439899632Z",
  "refresh_token": "TFH-xMjpUQj8PGv--g0wQGSLb0HL33sfVwxDDw6ySdM",
  "refresh_expires_at": "2026-11-27T14:25:29.439381346Z",
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
  "device_ref": "sandbox-1212"
}
```

```json
{
  "challenge_id": "01039f42-a3d6-46f3-8b5e-81d7a4567271",
  "expires_at": "2026-10-28T14:30:29.878797135Z",
  "resend_available_at": "2026-10-28T14:25:30.878797135Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "686755",
  "sent_at": "2026-10-28T14:25:29.882712781Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01039f42-a3d6-46f3-8b5e-81d7a4567271",
  "code": "686755",
  "device_ref": "sandbox-1212"
}
```

```json
{
  "session_id": "0cc5a143-3e25-45b8-b4bd-cd8841fffa3c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQzMCwiaWF0IjoxNzkzMTk3NTMwLCJqdGkiOiJjNzc4OTBhNS1kZDc4LTRmZDQtOTRjMS0xNmE0YWUwODE2YWEiLCJzaWQiOiIwY2M1YTE0My0zZTI1LTQ1YjgtYjRiZC1jZDg4NDFmZmZhM2MifQ.-x1H_L4W8ilVWk8izwQTF2IJaI_OmvngX3ulwjqDWaY",
  "access_expires_at": "2026-10-28T14:40:30.138453446Z",
  "refresh_token": "VxE84X6rlXi5w3pwRekPs8OIwSIMxB2XHUReuoawJbQ",
  "refresh_expires_at": "2026-11-27T14:25:30.13782544Z",
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
  "session_id": "d1cf8bc0-f15a-4df4-b084-7b465d91f5bc",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0MzAsImlhdCI6MTc5MzE5NzUzMCwianRpIjoiZDdhYjE3NTItNjYyNS00OWFlLThhZWEtYjRhMDcyMjNkOGU1Iiwic2lkIjoiZDFjZjhiYzAtZjE1YS00ZGY0LWIwODQtN2I0NjVkOTFmNWJjIn0.Zao-C0O_KSygg9lWB5diM8rA_UbbSLdG9oKzlL2Qe30",
  "access_expires_at": "2026-10-28T14:40:30.828931297Z",
  "refresh_token": "oTpjWy7akguaDqt3nNXknhSZJxC8Kx2ccWqj6iZtV0A",
  "refresh_expires_at": "2026-10-29T02:25:30.828404281Z",
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
  "session_id": "e96a02d9-78bd-4782-90b4-f20bb93a39d4",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0MzEsImlhdCI6MTc5MzE5NzUzMSwianRpIjoiNmVlNDg4MDctOTU3Zi00NDkwLWJiM2QtMjNkNmIxOTU2ZDY0Iiwic2lkIjoiZTk2YTAyZDktNzhiZC00NzgyLTkwYjQtZjIwYmI5M2EzOWQ0In0.6JC68fQJ7aURB4Y7MEgj953W9rEHvcKiae_TVxin4vA",
  "access_expires_at": "2026-10-28T14:40:31.306563538Z",
  "refresh_token": "pTbVEscZg2nCU8D95sF0_JQ1Y3SWgypYEg30lCzIfV4",
  "refresh_expires_at": "2026-10-29T02:25:31.305884466Z",
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
  "command_id": "52d9c2df-ba83-4a85-bb0a-6d005666b122",
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
  "id": "5af4c518-b363-412a-a34f-7f2eb6d0d77d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:30:31.745204Z",
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
  "command_id": "f6403dab-ce8f-4a40-adfb-555f04612154",
  "quote_id": "5af4c518-b363-412a-a34f-7f2eb6d0d77d",
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
  "id": "8c794d64-2db6-4c7b-91be-0f040db42bb8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "870511bb-0026-4562-a274-f05d090a1af6",
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
  "created_at": "2026-10-28T14:25:31.980557Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/8c794d64-2db6-4c7b-91be-0f040db42bb8` → **200**

```json
{
  "id": "8c794d64-2db6-4c7b-91be-0f040db42bb8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "870511bb-0026-4562-a274-f05d090a1af6",
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
  "created_at": "2026-10-28T14:25:31.980557Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/8c794d64-2db6-4c7b-91be-0f040db42bb8/cancel` → **200**

```json
{
  "command_id": "a7ea86dc-59c9-492c-b1ae-bc7f082b9062",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "8c794d64-2db6-4c7b-91be-0f040db42bb8",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "870511bb-0026-4562-a274-f05d090a1af6",
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
  "created_at": "2026-10-28T14:25:31.980557Z",
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
  "command_id": "ad0ce5b1-03a3-4530-a9ac-637665edbd9a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:25:32Z",
    "sequence": 1793197532899
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "64c48564-7d80-41ae-a7a3-23d66eab7a83",
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
  "last_heartbeat_at": "2026-10-28T14:25:32.917463Z",
  "last_location_at": "2026-10-28T14:25:32.917463Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25612"
}
```

```json
{
  "challenge_id": "9c3ac9df-63e3-4baf-b182-2444dfb03784",
  "expires_at": "2026-10-28T14:30:33.137693902Z",
  "resend_available_at": "2026-10-28T14:25:34.137693902Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "901275",
  "sent_at": "2026-10-28T14:25:33.140816608Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c3ac9df-63e3-4baf-b182-2444dfb03784",
  "code": "901275",
  "device_ref": "sandbox-25612"
}
```

```json
{
  "session_id": "d6344d3e-e33f-4540-876b-4682ccc82ca8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQzMywiaWF0IjoxNzkzMTk3NTMzLCJqdGkiOiIwNzhjM2VmYS1kZGQ3LTQ3YjYtYWVkYy0xZmFlMDMzYzc5YmYiLCJzaWQiOiJkNjM0NGQzZS1lMzNmLTQ1NDAtODc2Yi00NjgyY2NjODJjYTgifQ.rML4ayP2rReeKwKvsU-iuvskvJKoWX7VOB6x-SO0y7U",
  "access_expires_at": "2026-10-28T14:40:33.387267379Z",
  "refresh_token": "qPsGyuLEpZHioxk2ohrpqvmIVb6JIKBI7nR4y7wMlU4",
  "refresh_expires_at": "2026-11-27T14:25:33.38679253Z",
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
  "command_id": "9f880c97-4b56-4ec0-8977-8e86a4444f88",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:25:33Z",
    "sequence": 1793197533808
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fad5d276-28b8-47f1-8eb9-a76f9bc52dd6",
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
  "last_heartbeat_at": "2026-10-28T14:25:33.8265Z",
  "last_location_at": "2026-10-28T14:25:33.8265Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a5067a7e-2af4-498d-ab09-1076a6122b68",
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
  "id": "2601d279-5d5b-490b-b82f-cdbea594414c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:30:34.056890Z",
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
  "command_id": "f8c13677-d072-4c34-b112-7e941407d702",
  "quote_id": "2601d279-5d5b-490b-b82f-cdbea594414c",
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
  "id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "870511bb-0026-4562-a274-f05d090a1af6",
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
  "created_at": "2026-10-28T14:25:34.286825Z",
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
    "id": "3ae05c3e-1292-4777-82a8-fc6fadf1526b",
    "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
    "expires_at": "2026-10-28T14:25:49.290667Z",
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

`POST /api/driver/v1/offers/3ae05c3e-1292-4777-82a8-fc6fadf1526b/accept` → **200**

```json
{
  "command_id": "7d011e11-3e6c-424c-ba38-e02d6b915450"
}
```

```json
{
  "id": "18f5784e-0db1-4624-b680-579bad29f84e",
  "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7b3e7f27-753b-49b6-9d6d-e234403839d0",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7b3e7f27-753b-49b6-9d6d-e234403839d0",
  "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
  "assignment_id": "18f5784e-0db1-4624-b680-579bad29f84e",
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

`POST /api/driver/v1/trips/7b3e7f27-753b-49b6-9d6d-e234403839d0/cancel` → **200**

```json
{
  "command_id": "abbb74a0-e783-435c-9d68-750c0df0b709",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "7b3e7f27-753b-49b6-9d6d-e234403839d0",
  "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
  "assignment_id": "18f5784e-0db1-4624-b680-579bad29f84e",
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

`GET /api/rider/v1/orders/b9146b00-5f1b-4787-93f1-2744812eac9a` → **200**

```json
{
  "id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "870511bb-0026-4562-a274-f05d090a1af6",
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
    "id": "18f5784e-0db1-4624-b680-579bad29f84e",
    "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "7b3e7f27-753b-49b6-9d6d-e234403839d0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:25:34.286825Z",
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
    "id": "93bafce2-bdd5-49a8-9371-1da4c9bf5763",
    "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
    "expires_at": "2026-10-28T14:25:50.236227Z",
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

`POST /api/driver/v1/offers/93bafce2-bdd5-49a8-9371-1da4c9bf5763/accept` → **200**

```json
{
  "command_id": "d722f5f2-3305-4203-96ef-681a3e9bba65"
}
```

```json
{
  "id": "c4de7c27-ab91-403e-9ad8-f565536a9599",
  "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "534f5e9e-5175-43de-8216-95174709b6d5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "534f5e9e-5175-43de-8216-95174709b6d5",
  "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
  "assignment_id": "c4de7c27-ab91-403e-9ad8-f565536a9599",
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

`POST /api/driver/v1/trips/534f5e9e-5175-43de-8216-95174709b6d5/cancel` → **200**

```json
{
  "command_id": "f71371e9-40a0-4059-887f-c3e1611b244c",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "534f5e9e-5175-43de-8216-95174709b6d5",
  "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
  "assignment_id": "c4de7c27-ab91-403e-9ad8-f565536a9599",
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
    "id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:25:34.286825Z",
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
    "id": "8c794d64-2db6-4c7b-91be-0f040db42bb8",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:25:31.980557Z",
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

`GET /api/operator/v1/orders/b9146b00-5f1b-4787-93f1-2744812eac9a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:25:34.287402Z",
      "actor": {
        "type": "CLIENT",
        "id": "870511bb-0026-4562-a274-f05d090a1af6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
        "quote_id": "2601d279-5d5b-490b-b82f-cdbea594414c",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "7d229646-2973-4ae2-94fb-b833f735b2a5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:25:34.289642Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
        "attempt_id": "af7922aa-8457-42f4-8c15-ae98f8c35803",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7d229646-2973-4ae2-94fb-b833f735b2a5"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:25:34.298152Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3ae05c3e-1292-4777-82a8-fc6fadf1526b",
        "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "7d229646-2973-4ae2-94fb-b833f735b2a5"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:25:34.749601Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3ae05c3e-1292-4777-82a8-fc6fadf1526b",
        "order_id": "b9146b00-5f1b-4787-93f1-2744812eac9a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "18f5784e-0db1-4624-b680-579bad29f84e"
      },
      "correlation_id": "b672e3fb-7c66-487f-b8ef-b3f257bdc00c"
```

Done: orders 8c794d64-2db6-4c7b-91be-0f040db42bb8, b9146b00-5f1b-4787-93f1-2744812eac9a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737696520",
  "device_ref": "sandbox-27243"
}
```

```json
{
  "challenge_id": "9840323f-9f67-47a9-bfd9-86482bbc8459",
  "expires_at": "2026-10-28T14:30:37.127885018Z",
  "resend_available_at": "2026-10-28T14:25:38.127885018Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737696520` → **200**

```json
{
  "phone": "+380737696520",
  "audience": "CLIENT",
  "code": "480282",
  "sent_at": "2026-10-28T14:25:37.174875336Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9840323f-9f67-47a9-bfd9-86482bbc8459",
  "code": "480282",
  "device_ref": "sandbox-27243"
}
```

```json
{
  "session_id": "f1b3b268-4550-44a3-9091-1cff8aeb1e02",
  "subject": {
    "type": "CLIENT",
    "id": "324c0014-73e4-49b9-8c01-ee1f383c871c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMjRjMDAxNC03M2U0LTQ5YjktOGMwMS1lZTFmMzgzYzg3MWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDM3LCJpYXQiOjE3OTMxOTc1MzcsImp0aSI6ImFlMDJiY2E1LWEzZTctNDFmMy04ODkyLThjNDllZWEwOWNhMCIsInNpZCI6ImYxYjNiMjY4LTQ1NTAtNDRhMy05MDkxLTFjZmY4YWViMWUwMiJ9.G-Lh_BFvha2kIw6L2jJgq3F5zAX1F4c4syT7FRUfq6o",
  "access_expires_at": "2026-10-28T14:40:37.418331675Z",
  "refresh_token": "udpyeFXm8mWniCZxdjQ27IszjlVy2k6AGKe-5E0MJQE",
  "refresh_expires_at": "2026-11-27T14:25:37.417887873Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "8c187bdd-b3b8-4131-9aaa-d2ce5fc39926",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "1177ac05-c8b7-42c9-b43c-e1cc1ea9f3e6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-1177ac05-c8b7-42c9-b43c-e1cc1ea9f3e6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ea48b279776d54841d60bfde563244b2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=1177ac05-c8b7-42c9-b43c-e1cc1ea9f3e6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737696520"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=1177ac05-c8b7-42c9-b43c-e1cc1ea9f3e6",
  "expires_at": "2026-10-28T14:55:37.644753Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/1177ac05-c8b7-42c9-b43c-e1cc1ea9f3e6` → **200**

```json
{
  "id": "1177ac05-c8b7-42c9-b43c-e1cc1ea9f3e6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:55:37.644753Z",
  "card": {
    "id": "dabc261b-83fe-4d46-8c1e-32fdb849440d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0834",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:25:37.885489Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "dabc261b-83fe-4d46-8c1e-32fdb849440d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0834",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:25:37.885489Z"
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
  "device_ref": "sandbox-24507"
}
```

```json
{
  "challenge_id": "f3b1f66f-2c41-484e-8ebc-f3a57ab3881f",
  "expires_at": "2026-10-28T14:30:38.350838051Z",
  "resend_available_at": "2026-10-28T14:25:39.350838051Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "613670",
  "sent_at": "2026-10-28T14:25:38.353246232Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3b1f66f-2c41-484e-8ebc-f3a57ab3881f",
  "code": "613670",
  "device_ref": "sandbox-24507"
}
```

```json
{
  "session_id": "5eff8435-3031-4738-bc74-70083274dcc7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQzOCwiaWF0IjoxNzkzMTk3NTM4LCJqdGkiOiIwYzQ4M2ZmZS1lNjc1LTQ3YTYtODZkYS01NGE4NmI4MWRlMWUiLCJzaWQiOiI1ZWZmODQzNS0zMDMxLTQ3MzgtYmM3NC03MDA4MzI3NGRjYzcifQ.iKzctbRRjFSk9TOzMaDuo_0Yx8rCvgBl_U5yGWwOYWE",
  "access_expires_at": "2026-10-28T14:40:38.598888966Z",
  "refresh_token": "x6BrfS8v-QkgO-Wkqv_LgBJC5Cg53lyHoxi-YWzMf3c",
  "refresh_expires_at": "2026-11-27T14:25:38.598323912Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fad5d276-28b8-47f1-8eb9-a76f9bc52dd6",
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
  "last_heartbeat_at": "2026-10-28T14:25:33.8265Z",
  "last_location_at": "2026-10-28T14:25:33.8265Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fad5d276-28b8-47f1-8eb9-a76f9bc52dd6/handover` → **200**

```json
{
  "command_id": "7538c790-0e6c-44bc-b940-256df9a5a56e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fad5d276-28b8-47f1-8eb9-a76f9bc52dd6",
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
  "last_heartbeat_at": "2026-10-28T14:25:33.8265Z",
  "last_location_at": "2026-10-28T14:25:33.8265Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fad5d276-28b8-47f1-8eb9-a76f9bc52dd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:25:39Z",
    "sequence": 1793197539275
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fad5d276-28b8-47f1-8eb9-a76f9bc52dd6",
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
  "last_heartbeat_at": "2026-10-28T14:25:39.295319Z",
  "last_location_at": "2026-10-28T14:25:39.295319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4775092f-a3ed-4d05-ab88-2f14b77fd50a",
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
  "id": "1942ebf8-9428-4d41-867d-cef33e819371",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:30:39.522462Z",
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
  "command_id": "c4490117-4406-4f54-9f55-9814e506eba4",
  "quote_id": "1942ebf8-9428-4d41-867d-cef33e819371",
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
  "id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "324c0014-73e4-49b9-8c01-ee1f383c871c",
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
  "created_at": "2026-10-28T14:25:39.75738Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/092fb0e3-f08f-4344-b2a8-56b645117a3e` → **200**

```json
{
  "id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "324c0014-73e4-49b9-8c01-ee1f383c871c",
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
  "created_at": "2026-10-28T14:25:39.75738Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/092fb0e3-f08f-4344-b2a8-56b645117a3e` → **200**

```json
{
  "id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "324c0014-73e4-49b9-8c01-ee1f383c871c",
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
  "created_at": "2026-10-28T14:25:39.75738Z",
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
    "id": "8cd00ae3-f122-44b6-9cc2-d5f06e13ca4f",
    "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
    "expires_at": "2026-10-28T14:25:55.19347Z",
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

`POST /api/driver/v1/offers/8cd00ae3-f122-44b6-9cc2-d5f06e13ca4f/accept` → **200**

```json
{
  "command_id": "771f10f4-ce89-4bc5-b493-f8f6628babf1"
}
```

```json
{
  "id": "5ab94307-ad83-4f86-ab2b-0258c1c81b52",
  "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "40f9847a-c627-4808-b0d3-fddb1557d715",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "40f9847a-c627-4808-b0d3-fddb1557d715",
  "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "assignment_id": "5ab94307-ad83-4f86-ab2b-0258c1c81b52",
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

`POST /api/driver/v1/work-sessions/fad5d276-28b8-47f1-8eb9-a76f9bc52dd6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:25:42Z",
    "sequence": 1793197542144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fad5d276-28b8-47f1-8eb9-a76f9bc52dd6",
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
  "last_heartbeat_at": "2026-10-28T14:25:42.162959Z",
  "last_location_at": "2026-10-28T14:25:42.162959Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/40f9847a-c627-4808-b0d3-fddb1557d715/arrive` → **200**

```json
{
  "command_id": "7e74e947-5d90-4edb-8c8e-58abb0cc1b69",
  "expected_version": 0
}
```

```json
{
  "id": "40f9847a-c627-4808-b0d3-fddb1557d715",
  "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "assignment_id": "5ab94307-ad83-4f86-ab2b-0258c1c81b52",
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
  "arrived_at": "2026-10-28T14:25:42.389721Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/40f9847a-c627-4808-b0d3-fddb1557d715/start` → **200**

```json
{
  "command_id": "ae182a7b-f512-4fe1-b7c1-4b0c5d142eba",
  "expected_version": 1
}
```

```json
{
  "id": "40f9847a-c627-4808-b0d3-fddb1557d715",
  "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "assignment_id": "5ab94307-ad83-4f86-ab2b-0258c1c81b52",
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
  "arrived_at": "2026-10-28T14:25:42.389721Z",
  "started_at": "2026-10-28T14:25:42.622922Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/40f9847a-c627-4808-b0d3-fddb1557d715/complete` → **200**

```json
{
  "command_id": "8f517ea4-b0a7-49bc-b5df-bcf0b74579f0",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:25:42Z"
}
```

```json
{
  "id": "40f9847a-c627-4808-b0d3-fddb1557d715",
  "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "assignment_id": "5ab94307-ad83-4f86-ab2b-0258c1c81b52",
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
  "arrived_at": "2026-10-28T14:25:42.389721Z",
  "started_at": "2026-10-28T14:25:42.622922Z",
  "completed_at": "2026-10-28T14:25:42.87642Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/092fb0e3-f08f-4344-b2a8-56b645117a3e` → **200**

```json
{
  "id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "324c0014-73e4-49b9-8c01-ee1f383c871c",
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
    "id": "5ab94307-ad83-4f86-ab2b-0258c1c81b52",
    "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "40f9847a-c627-4808-b0d3-fddb1557d715",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:25:39.75738Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/092fb0e3-f08f-4344-b2a8-56b645117a3e` → **200**

```json
{
  "id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "324c0014-73e4-49b9-8c01-ee1f383c871c",
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
    "id": "5ab94307-ad83-4f86-ab2b-0258c1c81b52",
    "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "40f9847a-c627-4808-b0d3-fddb1557d715",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:25:39.75738Z",
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
      "id": "69c8360b-f0e6-49b1-9be7-86daf9ce65f3",
      "at": "2026-10-28T14:25:43.238456Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/092fb0e3-f08f-4344-b2a8-56b645117a3e/tip` → **200**

```json
{
  "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
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
  "available_until": "2026-10-29T14:25:42.87642Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/092fb0e3-f08f-4344-b2a8-56b645117a3e/tip` → **201**

```json
{
  "command_id": "253146c9-bd95-4a71-b511-fb160f0d2d8a",
  "amount_minor": 2500
}
```

```json
{
  "id": "c3636f9c-5528-4a8f-b2cf-da3d71a42db7",
  "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:25:45.256276Z"
}
```

`GET /api/rider/v1/orders/092fb0e3-f08f-4344-b2a8-56b645117a3e/tip` → **200**

```json
{
  "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
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
  "available_until": "2026-10-29T14:25:42.87642Z",
  "open": false,
  "tip": {
    "id": "c3636f9c-5528-4a8f-b2cf-da3d71a42db7",
    "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:25:45.256276Z"
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
      "id": "69c8360b-f0e6-49b1-9be7-86daf9ce65f3",
      "at": "2026-10-28T14:25:43.238456Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
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
      "id": "24d94f18-64b2-49c6-805c-d15ef6059e19",
      "at": "2026-10-28T14:25:46.294287Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
      "counterpart_id": null
    },
    {
      "id": "69c8360b-f0e6-49b1-9be7-86daf9ce65f3",
      "at": "2026-10-28T14:25:43.238456Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "092fb0e3-f08f-4344-b2a8-56b645117a3e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "fad5d276-28b8-47f1-8eb9-a76f9bc52dd6",
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
  "last_heartbeat_at": "2026-10-28T14:25:42.162959Z",
  "last_location_at": "2026-10-28T14:25:42.162959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fad5d276-28b8-47f1-8eb9-a76f9bc52dd6/close` → **200**

```json
{
  "command_id": "96a875e7-f488-41c8-b0ad-5068486bb210",
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

Done: card order 092fb0e3-f08f-4344-b2a8-56b645117a3e.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737109876",
  "device_ref": "sandbox-10908"
}
```

```json
{
  "challenge_id": "dfb5709a-c226-4493-9aae-33420cf80b2c",
  "expires_at": "2026-10-28T14:30:47.605194338Z",
  "resend_available_at": "2026-10-28T14:25:48.605194338Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737109876` → **200**

```json
{
  "phone": "+380737109876",
  "audience": "CLIENT",
  "code": "139223",
  "sent_at": "2026-10-28T14:25:47.607598411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dfb5709a-c226-4493-9aae-33420cf80b2c",
  "code": "139223",
  "device_ref": "sandbox-10908"
}
```

```json
{
  "session_id": "a42e8cdf-9cc2-4fea-b64d-67193e6ce666",
  "subject": {
    "type": "CLIENT",
    "id": "2a18d6c8-f198-4e97-8999-5862799d2c97"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYTE4ZDZjOC1mMTk4LTRlOTctODk5OS01ODYyNzk5ZDJjOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDQ3LCJpYXQiOjE3OTMxOTc1NDcsImp0aSI6ImEwZGM5YzlhLWI2NGItNGYzNS1hZmM1LTdmNjlkZTJhYWYxNyIsInNpZCI6ImE0MmU4Y2RmLTljYzItNGZlYS1iNjRkLTY3MTkzZTZjZTY2NiJ9.ix5UD5So0xhj4X0vSgk4DQS6G38nOBhuqPgFVbWdMRY",
  "access_expires_at": "2026-10-28T14:40:47.865187806Z",
  "refresh_token": "k_3ynZrsh1ADZydLM5QImGVkU_bhe7m5vXLW3DW52-M",
  "refresh_expires_at": "2026-11-27T14:25:47.864728132Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "3fedfb5f-0702-47a3-996e-6eb2234769f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "16f2129f-c19b-4519-8621-ef75b470ea17",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-16f2129f-c19b-4519-8621-ef75b470ea17",
    "orderDate": "1793197548",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "f1944c3617f275926fdbf75966fd8515",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=16f2129f-c19b-4519-8621-ef75b470ea17",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737109876"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=16f2129f-c19b-4519-8621-ef75b470ea17",
  "created_at": "2026-10-28T14:25:48.097835Z",
  "expires_at": "2026-10-28T14:55:48.097835Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/16f2129f-c19b-4519-8621-ef75b470ea17` → **200**

```json
{
  "id": "16f2129f-c19b-4519-8621-ef75b470ea17",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:25:48.097835Z",
  "expires_at": "2026-10-28T14:55:48.097835Z",
  "completed_at": "2026-10-28T14:25:48.329269Z",
  "masked_pan": "41****2333",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2a18d6c8-f198-4e97-8999-5862799d2c97",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "2a18d6c8-f198-4e97-8999-5862799d2c97",
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
      "id": "b4b60b6b-6ee5-427d-ba2c-156a9b5ebdde",
      "at": "2026-10-28T14:25:49.309712Z",
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
  "client_id": "2a18d6c8-f198-4e97-8999-5862799d2c97",
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
      "id": "b4b60b6b-6ee5-427d-ba2c-156a9b5ebdde",
      "at": "2026-10-28T14:25:49.309712Z",
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
  "device_ref": "sandbox-18105"
}
```

```json
{
  "challenge_id": "3ae1455c-cc97-424c-ad8e-21d2da7a5300",
  "expires_at": "2026-10-28T14:30:50.235913298Z",
  "resend_available_at": "2026-10-28T14:25:51.235913298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "469151",
  "sent_at": "2026-10-28T14:25:50.238598286Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ae1455c-cc97-424c-ad8e-21d2da7a5300",
  "code": "469151",
  "device_ref": "sandbox-18105"
}
```

```json
{
  "session_id": "3c081b0d-81cf-48b6-b2df-842f1b7cd402",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQ1MCwiaWF0IjoxNzkzMTk3NTUwLCJqdGkiOiJmYjg5Mjk5Yy1jNjBmLTRiZDctOGZiZi04NjFjNDMyNzcwYjciLCJzaWQiOiIzYzA4MWIwZC04MWNmLTQ4YjYtYjJkZi04NDJmMWI3Y2Q0MDIifQ.I9p9iwgoSIoQc8k3uYH_6E_E0Rr3hyiwbjr6CQZW-hA",
  "access_expires_at": "2026-10-28T14:40:50.485505996Z",
  "refresh_token": "IeVV-zxWjyF1eJCH0MOEootMFW7-BF4QD5dXk0gS1vY",
  "refresh_expires_at": "2026-11-27T14:25:50.484940387Z",
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
  "command_id": "7563f25d-3e33-4d97-9fe0-c3754580f389",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "5e7d55aa-1925-4ef9-a658-23a0f9fd81c5",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5e7d55aa-1925-4ef9-a658-23a0f9fd81c5",
    "orderDate": "1793197550",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "58032b0b59bf7fe25b9686cdbe5d3e7c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5e7d55aa-1925-4ef9-a658-23a0f9fd81c5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5e7d55aa-1925-4ef9-a658-23a0f9fd81c5",
  "created_at": "2026-10-28T14:25:50.924168Z",
  "expires_at": "2026-10-28T14:55:50.924168Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/5e7d55aa-1925-4ef9-a658-23a0f9fd81c5` → **200**

```json
{
  "id": "5e7d55aa-1925-4ef9-a658-23a0f9fd81c5",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:25:50.924168Z",
  "expires_at": "2026-10-28T14:55:50.924168Z",
  "completed_at": "2026-10-28T14:25:51.145304Z",
  "masked_pan": "41****0807",
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
      "id": "bb183a1e-b037-47f8-b3f4-855a0fd2de96",
      "at": "2026-10-28T14:25:51.315768Z",
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
  "command_id": "9511f95f-965e-4ee3-9e7e-a4f2712c27e8",
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
  "correlation_id": "272d985d-0567-425f-b5a8-1913fcac7e39"
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
  "session_id": "0e26c827-77ea-4327-a03c-df1fbbc059b0",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0NTIsImlhdCI6MTc5MzE5NzU1MiwianRpIjoiMDFhMzYyMjYtYjVjZS00ZDYxLTgyNDUtYjUwNmRlNDk1ZjVlIiwic2lkIjoiMGUyNmM4MjctNzdlYS00MzI3LWEwM2MtZGYxZmJiYzA1OWIwIn0.LQhBDUBrSRmKUaxNmoqb4zNNxHqgyqRzzTGm9C1sZQk",
  "access_expires_at": "2026-10-28T14:40:52.088732546Z",
  "refresh_token": "TN1s7Rbhmq1IyIW05Nqr9rv0jrXijbT9mVEvgJjiOjc",
  "refresh_expires_at": "2026-10-29T02:25:52.088259962Z",
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
  "phone": "+48600295412",
  "device_ref": "sandbox-2387"
}
```

```json
{
  "challenge_id": "8486a794-ca9f-4e74-878c-5a9ad462c3ca",
  "expires_at": "2026-10-28T14:30:52.763660865Z",
  "resend_available_at": "2026-10-28T14:25:53.763660865Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600295412` → **200**

```json
{
  "phone": "+48600295412",
  "audience": "CLIENT",
  "code": "605449",
  "sent_at": "2026-10-28T14:25:52.766001322Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8486a794-ca9f-4e74-878c-5a9ad462c3ca",
  "code": "605449",
  "device_ref": "sandbox-2387"
}
```

```json
{
  "session_id": "516d3cda-dfb1-4df2-b1c2-94cfd5e93060",
  "subject": {
    "type": "CLIENT",
    "id": "ab6eb84b-9248-4eb5-96e7-4eb784f9e546"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYjZlYjg0Yi05MjQ4LTRlYjUtOTZlNy00ZWI3ODRmOWU1NDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDUzLCJpYXQiOjE3OTMxOTc1NTMsImp0aSI6ImMzZDVlZTg4LTA2ZDktNDA3Ni04MDU2LWU3ZDJhNjU3Y2Y3OSIsInNpZCI6IjUxNmQzY2RhLWRmYjEtNGRmMi1iMWMyLTk0Y2ZkNWU5MzA2MCJ9.TWm40GSH81cmBEViNwIApjLfYidj1qfyXcv2AbgCB9c",
  "access_expires_at": "2026-10-28T14:40:53.02504821Z",
  "refresh_token": "y4kdv5rz3OzR3pt7hvpTgrixkVBYS_RztU7KEuqksG0",
  "refresh_expires_at": "2026-11-27T14:25:53.024554284Z",
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
  "command_id": "e584d2fe-c0d6-422e-b246-c2f1264b0215",
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
  "correlation_id": "7910cb69-9129-4ca7-9163-a062f4f67508",
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
  "command_id": "cb87d0f7-1762-4a7f-9ff0-6582f3b0d5c3",
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
  "paused_at": "2026-10-28T14:25:53.923800515Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

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
  "command_id": "7be3ce0d-a9fc-4ab9-8669-2ea5331ab94d",
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
  "id": "16c97c6a-f0b7-470a-88d9-cd910083d035",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:30:54.388078Z",
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
  "command_id": "b17c444e-9a5b-484d-bb5e-96c6b4a7a3fb",
  "quote_id": "16c97c6a-f0b7-470a-88d9-cd910083d035",
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
  "correlation_id": "e235bafe-2acf-4ae8-aed0-c5888331065e"
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
  "paused_at": "2026-10-28T14:25:53.923801Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "9f4eac0d-5efb-494d-bdea-53bad9a8422a",
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
  "command_id": "4e2f2385-8dae-4db4-b8c5-2a6a07ddfe20",
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
  "command_id": "b5d2709f-43a6-4503-b6f1-cb016d35b912",
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
  "id": "4e53a324-807a-4b41-902b-701eea2b36fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:30:55.722871Z",
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
  "command_id": "75b8e61a-8e66-4c10-93b9-b48cb1531f65",
  "quote_id": "4e53a324-807a-4b41-902b-701eea2b36fb",
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
  "correlation_id": "0aab5ec9-7d79-472f-b16c-ca37a505bf9f"
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
  "command_id": "bb6cb9ee-af2b-4043-8e10-45e973008757",
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
  "command_id": "5773787e-bd9b-4b6e-a719-91ad89296c6e",
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
  "id": "6bbb94e1-180e-4abc-8c5f-41622cc86222",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:30:56.627069Z",
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
  "command_id": "b60a53b0-5a83-4beb-be9e-c9e56d51ee29",
  "quote_id": "6bbb94e1-180e-4abc-8c5f-41622cc86222",
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
  "correlation_id": "34849754-5e00-4d8c-ae7e-962ed226459c"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "88a718f6-808f-4602-b435-d76e92f58bc1",
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
  "correlation_id": "33d92ccb-5156-4dea-8832-faac25475280"
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
  "command_id": "90da0613-f672-476a-81f9-51d4cf7ffe01",
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
  "phone": "+380677160714",
  "device_ref": "sandbox-13118"
}
```

```json
{
  "challenge_id": "2388b5eb-ecc1-4e63-bd1a-780b48ce9529",
  "expires_at": "2026-10-28T14:30:57.780384668Z",
  "resend_available_at": "2026-10-28T14:25:58.780384668Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677160714` → **200**

```json
{
  "phone": "+380677160714",
  "audience": "CLIENT",
  "code": "520443",
  "sent_at": "2026-10-28T14:25:57.782718389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2388b5eb-ecc1-4e63-bd1a-780b48ce9529",
  "code": "520443",
  "device_ref": "sandbox-13118"
}
```

```json
{
  "session_id": "a3decb41-dc98-4680-9820-237a54a165cd",
  "subject": {
    "type": "CLIENT",
    "id": "6e73eb98-1173-49ca-9497-18791165e5eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTczZWI5OC0xMTczLTQ5Y2EtOTQ5Ny0xODc5MTE2NWU1ZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDU4LCJpYXQiOjE3OTMxOTc1NTgsImp0aSI6IjE5ZjcxOGRiLTkzZWMtNDNkNi05MjVlLWJjNTQ3NTQ0OTA4MyIsInNpZCI6ImEzZGVjYjQxLWRjOTgtNDY4MC05ODIwLTIzN2E1NGExNjVjZCJ9.FlzX7Ei8_dySnKL-AL6ajPKtVZeV_vrMD8cuIbn5K4w",
  "access_expires_at": "2026-10-28T14:40:58.037215882Z",
  "refresh_token": "L_Fv3I5x7liTKnMrtoKPo4cPMinqkKCZwQAAZIlZSFQ",
  "refresh_expires_at": "2026-11-27T14:25:58.036778522Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6e73eb98-1173-49ca-9497-18791165e5eb",
  "session_id": "a3decb41-dc98-4680-9820-237a54a165cd",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "554a2fb3-b619-4aa3-aad8-ca6856e836e9",
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
  "id": "24cca922-7a72-4db6-9a6f-2f06b31a9dd5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:30:58.480204Z",
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
  "challenge_id": "ebeeadd0-1a88-4e31-be82-b521f309b632",
  "expires_at": "2026-10-28T14:31:00.715441836Z",
  "resend_available_at": "2026-10-28T14:26:01.715441836Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677160714` → **200**

```json
{
  "phone": "+380677160714",
  "audience": "CLIENT",
  "code": "792875",
  "sent_at": "2026-10-28T14:26:00.717329742Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "072a0d6d-828c-4e72-a619-fda56ede5bf6",
  "challenge_id": "ebeeadd0-1a88-4e31-be82-b521f309b632",
  "otp_code": "792875"
}
```

```json
{
  "client_id": "6e73eb98-1173-49ca-9497-18791165e5eb",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:26:00.981208356Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "65f3bb10-4144-4b90-84de-0b6e0af1a6a1",
  "quote_id": "24cca922-7a72-4db6-9a6f-2f06b31a9dd5",
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
  "correlation_id": "b9fd3df2-56e4-4987-b6c9-0335021d8576"
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
  "session_id": "cf708679-fd20-4a5c-9e8b-facfdd658a6d",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0NjEsImlhdCI6MTc5MzE5NzU2MSwianRpIjoiYWE5N2IzMzctOWJjZi00YjU1LTgyZjUtOTM4YmIyNmVmMWZhIiwic2lkIjoiY2Y3MDg2NzktZmQyMC00YTVjLTllOGItZmFjZmRkNjU4YTZkIn0.UGcKUhMFHuVc1butpIhzcNpseZZDCoLH4RJkNEJc4DA",
  "access_expires_at": "2026-10-28T14:41:01.684674351Z",
  "refresh_token": "8r8w0NDOwxuqMhhQ2g1zfFVN25s3yo5otyIXgg7Sr0o",
  "refresh_expires_at": "2026-10-29T02:26:01.684189412Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "6e73eb98-1173-49ca-9497-18791165e5eb",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:26:00.981208Z",
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

`POST /api/admin/v1/client-deletions/6e73eb98-1173-49ca-9497-18791165e5eb/complete` → **200**

```json
{
  "command_id": "c7434d3d-9c17-44fb-8e7f-e5c9c0a140cc",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "6e73eb98-1173-49ca-9497-18791165e5eb",
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
  "correlation_id": "f6ec1085-167c-4c6f-9067-e4d5d5db41da"
}
```

Done: client 6e73eb98-1173-49ca-9497-18791165e5eb anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663581624",
  "device_ref": "sandbox-30341"
}
```

```json
{
  "challenge_id": "d3844fb5-ad8f-402f-ac89-0393fda5a123",
  "expires_at": "2026-10-28T14:31:02.591510341Z",
  "resend_available_at": "2026-10-28T14:26:03.591510341Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663581624` → **200**

```json
{
  "phone": "+380663581624",
  "audience": "CLIENT",
  "code": "912158",
  "sent_at": "2026-10-28T14:26:02.593644742Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d3844fb5-ad8f-402f-ac89-0393fda5a123",
  "code": "912158",
  "device_ref": "sandbox-30341"
}
```

```json
{
  "session_id": "7d7b109b-aaea-4999-a40c-1f56122da445",
  "subject": {
    "type": "CLIENT",
    "id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDQ2NDc4ZS0xMTE1LTRmZGQtOWI4Ny1hMmZkNWUzZjJiYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDYyLCJpYXQiOjE3OTMxOTc1NjIsImp0aSI6ImZkYTI1YWM2LTMyNWQtNDM4MS05MTU0LTQ1ZTY1M2NiMjQ2MiIsInNpZCI6IjdkN2IxMDliLWFhZWEtNDk5OS1hNDBjLTFmNTYxMjJkYTQ0NSJ9.-KfwP3t0bdMVpAP4uk-SC0TNblRUTxOhJcSm8Dqwq5M",
  "access_expires_at": "2026-10-28T14:41:02.833934132Z",
  "refresh_token": "J6IpK3ZorGioUwGehzYpqM91hqMFqqwhhn1uzUgTGRM",
  "refresh_expires_at": "2026-11-27T14:26:02.833514769Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf",
  "session_id": "7d7b109b-aaea-4999-a40c-1f56122da445",
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
  "session_id": "7ca2630c-9b6d-4dcd-a4f1-09b73a443a00",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0NjMsImlhdCI6MTc5MzE5NzU2MywianRpIjoiOGI0MGQ5N2ItNTljNS00ZmUzLThkMGEtZjk2NzI5OTA4MTM4Iiwic2lkIjoiN2NhMjYzMGMtOWI2ZC00ZGNkLWE0ZjEtMDliNzNhNDQzYTAwIn0.NVXvE1CifrCCOMivOqwuCSO94wo4UrAx1fRGtzu_XiQ",
  "access_expires_at": "2026-10-28T14:41:03.577661526Z",
  "refresh_token": "wF2lQC9oXjq3b_oSPQ5QcwRjOnMxjF-EPOo0dzKjlFU",
  "refresh_expires_at": "2026-10-29T02:26:03.577208823Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3581624&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf",
      "phone": "+380663581624",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:26:02.832177Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/4446478e-1115-4fdd-9b87-a2fd5e3f2bbf` → **200**

```json
{
  "client": {
    "id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf",
    "phone": "+380663581624",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:26:02.832177Z",
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

`POST /api/admin/v1/clients/4446478e-1115-4fdd-9b87-a2fd5e3f2bbf/block` → **400**

```json
{
  "command_id": "0ae6cdc6-398c-4751-9c63-aa211629e25e",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/4446478e-1115-4fdd-9b87-a2fd5e3f2bbf/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b8d737a2-eb49-42a6-b823-43348a820f03",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/4446478e-1115-4fdd-9b87-a2fd5e3f2bbf/block` → **200**

```json
{
  "command_id": "1ea31ab1-80d2-4e4c-9cf7-a48e9e44b251",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf",
  "phone": "+380663581624",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:26:02.832177Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:26:04.515641Z",
    "by": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
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
  "correlation_id": "06718508-f64f-46b3-8531-1913dfb16e5d"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663581624",
  "device_ref": "sandbox-22249"
}
```

```json
{
  "challenge_id": "09a38449-db64-4a8d-8dab-7e90f25c1d65",
  "expires_at": "2026-10-28T14:31:06.965519327Z",
  "resend_available_at": "2026-10-28T14:26:07.965519327Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663581624` → **200**

```json
{
  "phone": "+380663581624",
  "audience": "CLIENT",
  "code": "668962",
  "sent_at": "2026-10-28T14:26:06.972855459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "09a38449-db64-4a8d-8dab-7e90f25c1d65",
  "code": "668962",
  "device_ref": "sandbox-22249"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "3264dd62-bf47-4429-89b2-5a14ead0ba12"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/4446478e-1115-4fdd-9b87-a2fd5e3f2bbf` → **200**

```json
{
  "client": {
    "id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf",
    "phone": "+380663581624",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:26:02.832177Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:26:04.515641Z",
      "by": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
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

`POST /api/admin/v1/clients/4446478e-1115-4fdd-9b87-a2fd5e3f2bbf/unblock` → **200**

```json
{
  "command_id": "3aef330d-302b-44d5-868c-ea653099f9af",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf",
  "phone": "+380663581624",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:26:02.832177Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663581624",
  "device_ref": "sandbox-626"
}
```

```json
{
  "challenge_id": "1e40b968-1b01-45dc-a44b-e7f25ecf896f",
  "expires_at": "2026-10-28T14:31:09.979639222Z",
  "resend_available_at": "2026-10-28T14:26:10.979639222Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663581624` → **200**

```json
{
  "phone": "+380663581624",
  "audience": "CLIENT",
  "code": "021346",
  "sent_at": "2026-10-28T14:26:09.981695277Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e40b968-1b01-45dc-a44b-e7f25ecf896f",
  "code": "021346",
  "device_ref": "sandbox-626"
}
```

```json
{
  "session_id": "ac27f497-8597-4857-9eb9-a199e00c8694",
  "subject": {
    "type": "CLIENT",
    "id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NDQ2NDc4ZS0xMTE1LTRmZGQtOWI4Ny1hMmZkNWUzZjJiYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDcwLCJpYXQiOjE3OTMxOTc1NzAsImp0aSI6IjMwYWI2ZmU5LTVlMjAtNGZiOC1iMGMyLWRiNzBjOTc4MDI3NSIsInNpZCI6ImFjMjdmNDk3LTg1OTctNDg1Ny05ZWI5LWExOTllMDBjODY5NCJ9.CFaSfMn0LUKuUzkdXCCWouoz0LFDszJ_Rz4ZkLaO3-4",
  "access_expires_at": "2026-10-28T14:41:10.228051483Z",
  "refresh_token": "rTT29Q0rJYXkDiFs56TiFg5mmMi5cY9asIoylAU8_qE",
  "refresh_expires_at": "2026-11-27T14:26:10.227500479Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4446478e-1115-4fdd-9b87-a2fd5e3f2bbf",
  "session_id": "ac27f497-8597-4857-9eb9-a199e00c8694",
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
  "phone": "+380664074380",
  "device_ref": "sandbox-25769"
}
```

```json
{
  "challenge_id": "a854fe0a-a0e8-4190-b088-a330ce809826",
  "expires_at": "2026-10-28T14:31:10.676385508Z",
  "resend_available_at": "2026-10-28T14:26:11.676385508Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664074380` → **200**

```json
{
  "phone": "+380664074380",
  "audience": "CLIENT",
  "code": "075153",
  "sent_at": "2026-10-28T14:26:10.678188933Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a854fe0a-a0e8-4190-b088-a330ce809826",
  "code": "075153",
  "device_ref": "sandbox-25769"
}
```

```json
{
  "session_id": "70f1df4f-ff69-42fc-8635-8128efd82796",
  "subject": {
    "type": "CLIENT",
    "id": "4eba3d68-0fd9-407b-9837-50f977dfc4d2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWJhM2Q2OC0wZmQ5LTQwN2ItOTgzNy01MGY5NzdkZmM0ZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDcwLCJpYXQiOjE3OTMxOTc1NzAsImp0aSI6ImYyYzYzNmUzLTQ3ZjYtNDA5YS04ZTY5LTc1NmFkZjA4MWJhZiIsInNpZCI6IjcwZjFkZjRmLWZmNjktNDJmYy04NjM1LTgxMjhlZmQ4Mjc5NiJ9.DJgl249OYu6P-bD9PA46KBNW-tsYB7jGi0xDPULNU5o",
  "access_expires_at": "2026-10-28T14:41:10.922459108Z",
  "refresh_token": "awIgcwemOfxNxraiZsFHcipt0-ax9_aAcIInbFUoIRw",
  "refresh_expires_at": "2026-11-27T14:26:10.922012646Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e7415dab-1470-4555-922d-54836d7bfb57",
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
  "id": "f763402f-6d9f-4e45-8545-ea9948d131a4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:31:11.147646Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 3d22e1fc-c7d4-4044-9aef-f74c1ffc15b4) → **201**

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
  "session_id": "82bf2332-e246-4759-8eb3-3afe76384d70",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0NzEsImlhdCI6MTc5MzE5NzU3MSwianRpIjoiYzkwZTRhODEtOTU3OS00NzMwLThmZGYtNDNkOTBmYTJiNTBiIiwic2lkIjoiODJiZjIzMzItZTI0Ni00NzU5LThlYjMtM2FmZTc2Mzg0ZDcwIn0.LKU0RaThZiJmZYNrg0vtDDKipXW9Q0s461cmU_debjw",
  "access_expires_at": "2026-10-28T14:41:11.6714363Z",
  "refresh_token": "FASk42eppymB7hDWi-9xkdjOHczNb9Q_TS6nn2kjEyA",
  "refresh_expires_at": "2026-10-29T02:26:11.670932701Z",
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
  "session_id": "b1190afc-b1cb-4d3b-9401-6646c55e76f6",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0NzIsImlhdCI6MTc5MzE5NzU3MiwianRpIjoiMmUxOGQ2NmUtZDZkNy00YmYwLWFkODAtM2RjODFiZjUwMzI4Iiwic2lkIjoiYjExOTBhZmMtYjFjYi00ZDNiLTk0MDEtNjY0NmM1NWU3NmY2In0.9HiaIFYjcktgAM0Frhnjbu3pQKw_qM4SpO--TrS7SvM",
  "access_expires_at": "2026-10-28T14:41:12.146187618Z",
  "refresh_token": "bZc3-R4pUFfhOfa89_-5GMS1LojhrrqE81AwVswfdFA",
  "refresh_expires_at": "2026-10-29T02:26:12.145701295Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c4f97804-7f48-4536-8f9b-6a1bf9034a3e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:26:11.37833Z",
      "actor": {
        "type": "CLIENT",
        "id": "4eba3d68-0fd9-407b-9837-50f977dfc4d2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e",
        "quote_id": "f763402f-6d9f-4e45-8545-ea9948d131a4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "3d22e1fc-c7d4-4044-9aef-f74c1ffc15b4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:26:11.380096Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e",
        "attempt_id": "33353514-b7f4-4798-a91d-a47752729cf1",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3d22e1fc-c7d4-4044-9aef-f74c1ffc15b4"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:26:11.388437Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e",
        "attempt_id": "33353514-b7f4-4798-a91d-a47752729cf1"
      },
      "correlation_id": "3d22e1fc-c7d4-4044-9aef-f74c1ffc15b4"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "33353514-b7f4-4798-a91d-a47752729cf1",
        "generation": 1,
        "started_at": "2026-10-28T14:26:11.379193Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:26:11.388437Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:26:11.38099Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/3d22e1fc-c7d4-4044-9aef-f74c1ffc15b4` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e:0",
      "order_id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e",
      "at": "2026-10-28T14:26:11.37833Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e:1",
      "order_id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e",
      "at": "2026-10-28T14:26:11.380096Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e:2",
      "order_id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e",
      "at": "2026-10-28T14:26:11.388437Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/1fc4778a-a251-4a9e-afa1-061d774c84c6` → **200**

```json
{
  "found": []
}
```

Done: request 3d22e1fc-c7d4-4044-9aef-f74c1ffc15b4 — order c4f97804-7f48-4536-8f9b-6a1bf9034a3e found by its id.

`GET /api/rider/v1/orders/c4f97804-7f48-4536-8f9b-6a1bf9034a3e` → **200**

```json
{
  "id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4eba3d68-0fd9-407b-9837-50f977dfc4d2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:26:11.377799Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/c4f97804-7f48-4536-8f9b-6a1bf9034a3e/cancel` → **200**

```json
{
  "command_id": "fcc8ac5d-ff2e-4b7f-ae5c-d653cf71d251",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c4f97804-7f48-4536-8f9b-6a1bf9034a3e",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4eba3d68-0fd9-407b-9837-50f977dfc4d2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:26:11.377799Z",
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
  "phone": "+380637336588",
  "device_ref": "sandbox-17765"
}
```

```json
{
  "challenge_id": "b7a92d5c-8818-48c5-b676-0600bf9e5d00",
  "expires_at": "2026-10-28T14:31:13.525323541Z",
  "resend_available_at": "2026-10-28T14:26:14.525323541Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637336588` → **200**

```json
{
  "phone": "+380637336588",
  "audience": "CLIENT",
  "code": "004887",
  "sent_at": "2026-10-28T14:26:13.527284233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b7a92d5c-8818-48c5-b676-0600bf9e5d00",
  "code": "004887",
  "device_ref": "sandbox-17765"
}
```

```json
{
  "session_id": "2f9b3898-be3f-4df5-85e4-d5099f108d3f",
  "subject": {
    "type": "CLIENT",
    "id": "61fb6590-f8e2-4236-be3e-4e200aa537d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWZiNjU5MC1mOGUyLTQyMzYtYmUzZS00ZTIwMGFhNTM3ZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDczLCJpYXQiOjE3OTMxOTc1NzMsImp0aSI6IjNlMmExYmNmLTg4NDItNDg0NC1hY2FmLTRmOWU3YmQ0ZmYzNiIsInNpZCI6IjJmOWIzODk4LWJlM2YtNGRmNS04NWU0LWQ1MDk5ZjEwOGQzZiJ9.GtFbFuCmLWCbNNu2J1qNXns_ZQUglEkbwxdckdI_1IE",
  "access_expires_at": "2026-10-28T14:41:13.768074695Z",
  "refresh_token": "sanl7ZOSs0OieZucvTxvC60d1W6f39e--xn-RuO7LXo",
  "refresh_expires_at": "2026-11-27T14:26:13.767525142Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "99ad3e14-dde9-4c1f-9e35-b4e7c16ece58",
  "expires_at": "2026-10-28T14:31:15.989584814Z",
  "resend_available_at": "2026-10-28T14:26:16.989584814Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637336588` → **200**

```json
{
  "phone": "+380637336588",
  "audience": "CLIENT",
  "code": "951203",
  "sent_at": "2026-10-28T14:26:15.991411996Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "1347bdd0-f023-40a1-bf66-4d3b175ad1a9",
  "challenge_id": "99ad3e14-dde9-4c1f-9e35-b4e7c16ece58",
  "otp_code": "951203"
}
```

```json
{
  "id": "9786b423-ff27-4237-ab8e-bb093df9ebe2",
  "state": "PENDING",
  "created_at": "2026-10-28T14:26:16.232368Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/9786b423-ff27-4237-ab8e-bb093df9ebe2` → **200**

```json
{
  "id": "9786b423-ff27-4237-ab8e-bb093df9ebe2",
  "state": "PENDING",
  "created_at": "2026-10-28T14:26:16.232368Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9786b423-ff27-4237-ab8e-bb093df9ebe2` → **200**

```json
{
  "id": "9786b423-ff27-4237-ab8e-bb093df9ebe2",
  "state": "PENDING",
  "created_at": "2026-10-28T14:26:16.232368Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/9786b423-ff27-4237-ab8e-bb093df9ebe2` → **200**

```json
{
  "id": "9786b423-ff27-4237-ab8e-bb093df9ebe2",
  "state": "READY",
  "created_at": "2026-10-28T14:26:16.232368Z",
  "ready_at": "2026-10-28T14:26:17.751983Z",
  "expires_at": "2026-11-04T14:26:17.751983Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/9786b423-ff27-4237-ab8e-bb093df9ebe2/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638627123",
  "device_ref": "sandbox-1516"
}
```

```json
{
  "challenge_id": "e5475bbe-4973-4f7d-9d60-e96886d4cae7",
  "expires_at": "2026-10-28T14:31:19.121986618Z",
  "resend_available_at": "2026-10-28T14:26:20.121986618Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638627123` → **200**

```json
{
  "phone": "+380638627123",
  "audience": "CLIENT",
  "code": "139467",
  "sent_at": "2026-10-28T14:26:19.123821231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e5475bbe-4973-4f7d-9d60-e96886d4cae7",
  "code": "139467",
  "device_ref": "sandbox-1516"
}
```

```json
{
  "session_id": "4955cbf2-2c01-4902-991e-1402d3a19eb1",
  "subject": {
    "type": "CLIENT",
    "id": "e5247bec-d762-4f97-ad43-2e012dc661a9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTI0N2JlYy1kNzYyLTRmOTctYWQ0My0yZTAxMmRjNjYxYTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDc5LCJpYXQiOjE3OTMxOTc1NzksImp0aSI6IjFlMTBhNDljLWZiZTQtNGQxYS04NThkLWY3NjI3NDZjMmUyMyIsInNpZCI6IjQ5NTVjYmYyLTJjMDEtNDkwMi05OTFlLTE0MDJkM2ExOWViMSJ9.mOQil7S4eeHdfi9o2JjMaH5zpDgy6eSotX-xF8lFoXU",
  "access_expires_at": "2026-10-28T14:41:19.443445048Z",
  "refresh_token": "NN-4jeWfZCWdF2tC0Mimv2mlAAk4mXNqHICF6_U0bao",
  "refresh_expires_at": "2026-11-27T14:26:19.442826112Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/9786b423-ff27-4237-ab8e-bb093df9ebe2/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/9786b423-ff27-4237-ab8e-bb093df9ebe2/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6d8dff13-a938-4ed9-92b4-f7d0c15352c0"
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
  "session_id": "47325f23-1383-41f5-a603-5de47b1f6a4a",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0ODAsImlhdCI6MTc5MzE5NzU4MCwianRpIjoiMTk0ZWM1OTQtNzA0Zi00ZTMyLTgwMzUtNzU1M2RiZjUxYzUwIiwic2lkIjoiNDczMjVmMjMtMTM4My00MWY1LWE2MDMtNWRlNDdiMWY2YTRhIn0.I1aaZn95qY5Ci3A19sf93CT8MBb9snwanEZGqXhTx60",
  "access_expires_at": "2026-10-28T14:41:20.119271762Z",
  "refresh_token": "pfijTGCCl2yus4VJ-45qTYgCixZzR4zDISr-WEFQGoQ",
  "refresh_expires_at": "2026-10-29T02:26:20.118861465Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "61fb6590-f8e2-4236-be3e-4e200aa537d4",
  "session_id": "2f9b3898-be3f-4df5-85e4-d5099f108d3f",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/61fb6590-f8e2-4236-be3e-4e200aa537d4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "9786b423-ff27-4237-ab8e-bb093df9ebe2",
      "state": "READY",
      "created_at": "2026-10-28T14:26:16.232368Z",
      "ready_at": "2026-10-28T14:26:17.751983Z",
      "expires_at": "2026-11-04T14:26:17.751983Z",
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
  "device_ref": "sandbox-24081"
}
```

```json
{
  "challenge_id": "aac9b600-bc3e-445d-a732-50778f20bf14",
  "expires_at": "2026-10-28T14:31:20.776477972Z",
  "resend_available_at": "2026-10-28T14:26:21.776477972Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "750297",
  "sent_at": "2026-10-28T14:26:20.778465244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aac9b600-bc3e-445d-a732-50778f20bf14",
  "code": "750297",
  "device_ref": "sandbox-24081"
}
```

```json
{
  "session_id": "ae6464ac-1b3e-4066-88d9-c635615a80b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQ4MSwiaWF0IjoxNzkzMTk3NTgxLCJqdGkiOiI2ZWUzZTM1My04MWU2LTQwODQtYjhmZC00MTI1YTVmM2E3MGUiLCJzaWQiOiJhZTY0NjRhYy0xYjNlLTQwNjYtODhkOS1jNjM1NjE1YTgwYjEifQ.j1M_ytOi0JItJPSuhYfYE2CwzLflmRBrCqliSYwS_kY",
  "access_expires_at": "2026-10-28T14:41:21.016990617Z",
  "refresh_token": "3cg3g-rRNrJ-38VE5ZgmsB92JVNj1hK6XDAc6aLhSzQ",
  "refresh_expires_at": "2026-11-27T14:26:21.016571474Z",
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
  "device_ref": "sandbox-4162"
}
```

```json
{
  "challenge_id": "c7632106-e8ae-420d-bb4f-b1b5172f480e",
  "expires_at": "2026-10-28T14:31:21.450864165Z",
  "resend_available_at": "2026-10-28T14:26:22.450864165Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "280322",
  "sent_at": "2026-10-28T14:26:21.452906399Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7632106-e8ae-420d-bb4f-b1b5172f480e",
  "code": "280322",
  "device_ref": "sandbox-4162"
}
```

```json
{
  "session_id": "cc6fd3dd-8561-4152-9e6b-1a734293de7c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQ4MSwiaWF0IjoxNzkzMTk3NTgxLCJqdGkiOiJmODgxOTE0MC0wOGI0LTQzOWEtYWFjMi0yZWM2ZmYyNDQ1YTkiLCJzaWQiOiJjYzZmZDNkZC04NTYxLTQxNTItOWU2Yi0xYTczNDI5M2RlN2MifQ.neFKRjAIqop5506CXQZ554-eS5uLPdIgi099qqz83Wc",
  "access_expires_at": "2026-10-28T14:41:21.689678039Z",
  "refresh_token": "Qx87wJYaAk3ta1dKMnTDyrrFf7ke_91JKtn3lRn9Whw",
  "refresh_expires_at": "2026-11-27T14:26:21.689245656Z",
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
  "command_id": "e3d1082e-960b-496c-89b7-db8b09348360",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:22Z",
    "sequence": 1793197582118
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d885ee41-5bf7-430a-a353-a68aadced38b",
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
  "last_heartbeat_at": "2026-10-28T14:26:22.13538Z",
  "last_location_at": "2026-10-28T14:26:22.13538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-24432"
}
```

```json
{
  "challenge_id": "292eb035-aa55-44e8-9ef8-cee07e7f522e",
  "expires_at": "2026-10-28T14:31:22.356337538Z",
  "resend_available_at": "2026-10-28T14:26:23.356337538Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "585147",
  "sent_at": "2026-10-28T14:26:22.358357423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "292eb035-aa55-44e8-9ef8-cee07e7f522e",
  "code": "585147",
  "device_ref": "sandbox-24432"
}
```

```json
{
  "session_id": "0e9a8888-f25d-4d22-8637-467d0cd7966c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQ4MiwiaWF0IjoxNzkzMTk3NTgyLCJqdGkiOiIzM2Y3OWM0Ny03NzQ2LTRhNGYtOWI5NC02MjIzMzU2ZWYzNWUiLCJzaWQiOiIwZTlhODg4OC1mMjVkLTRkMjItODYzNy00NjdkMGNkNzk2NmMifQ.zL7QL0ghJFjcS4DzIqAevnUA3Ct2MdzEKSmKQVEBRVU",
  "access_expires_at": "2026-10-28T14:41:22.597123375Z",
  "refresh_token": "iKIrFro64GzaIdFBRDETuK_PlPsQKZBeFiP-PhFhG8Y",
  "refresh_expires_at": "2026-11-27T14:26:22.596711413Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "64c48564-7d80-41ae-a7a3-23d66eab7a83",
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
  "last_heartbeat_at": "2026-10-28T14:25:32.917463Z",
  "last_location_at": "2026-10-28T14:25:32.917463Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/64c48564-7d80-41ae-a7a3-23d66eab7a83/handover` → **200**

```json
{
  "command_id": "43ea0550-1b03-4e5b-8748-f8ecdd746515",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "64c48564-7d80-41ae-a7a3-23d66eab7a83",
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
  "last_heartbeat_at": "2026-10-28T14:25:32.917463Z",
  "last_location_at": "2026-10-28T14:25:32.917463Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/64c48564-7d80-41ae-a7a3-23d66eab7a83/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:23Z",
    "sequence": 1793197583293
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "64c48564-7d80-41ae-a7a3-23d66eab7a83",
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
  "last_heartbeat_at": "2026-10-28T14:26:23.310007Z",
  "last_location_at": "2026-10-28T14:26:23.310007Z",
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
  "session_id": "6663df06-8388-49e9-bd4a-2132e964b3c1",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0ODMsImlhdCI6MTc5MzE5NzU4MywianRpIjoiZGU4ZWI5NWMtMWMzNy00NWRmLTg3MmItZjNkNzNmOTUxNDFiIiwic2lkIjoiNjY2M2RmMDYtODM4OC00OWU5LWJkNGEtMjEzMmU5NjRiM2MxIn0.6yx_zkNWrm5NhmmOwjOMyfNMTOaJJU4GUKHIzjtqI9w",
  "access_expires_at": "2026-10-28T14:41:23.779585547Z",
  "refresh_token": "FLQ5763ErKGorS1Z2Y4hKJlVZyYVOUOGueLLpoezG1A",
  "refresh_expires_at": "2026-10-29T02:26:23.779152734Z",
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
  "session_id": "cf941d94-eae0-490d-83bd-22410e7fac3e",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0ODQsImlhdCI6MTc5MzE5NzU4NCwianRpIjoiOTY0NTY3MzctOTVhYi00NmE5LWFlMTgtN2U1ZGM1ZjEwNjgxIiwic2lkIjoiY2Y5NDFkOTQtZWFlMC00OTBkLTgzYmQtMjI0MTBlN2ZhYzNlIn0.MtQBhNq5Kc2ux985bhr29x_2FmN1EFNRogXZ-e2Adm8",
  "access_expires_at": "2026-10-28T14:41:24.253188258Z",
  "refresh_token": "-nGFTH5IkpPTZkRe7Ov8vBRMJsTCE99slj6sR7ziC-Q",
  "refresh_expires_at": "2026-10-29T02:26:24.252769766Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380689572337",
  "device_ref": "sandbox-32408"
}
```

```json
{
  "challenge_id": "00aa978c-61d2-45e2-8a4f-f683e63730a8",
  "expires_at": "2026-10-28T14:31:24.469152378Z",
  "resend_available_at": "2026-10-28T14:26:25.469152378Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380689572337` → **200**

```json
{
  "phone": "+380689572337",
  "audience": "CLIENT",
  "code": "961143",
  "sent_at": "2026-10-28T14:26:24.471112418Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "00aa978c-61d2-45e2-8a4f-f683e63730a8",
  "code": "961143",
  "device_ref": "sandbox-32408"
}
```

```json
{
  "session_id": "e9086247-0fa5-49be-9c95-448ddb5c0a51",
  "subject": {
    "type": "CLIENT",
    "id": "cbcdc0db-8ce1-4385-b98a-668e01e04936"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYmNkYzBkYi04Y2UxLTQzODUtYjk4YS02NjhlMDFlMDQ5MzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDg0LCJpYXQiOjE3OTMxOTc1ODQsImp0aSI6IjMxZjZiNDg2LTg0M2MtNDdiOC1iZDBiLTU4YWIxMTM0ZmNkMyIsInNpZCI6ImU5MDg2MjQ3LTBmYTUtNDliZS05Yzk1LTQ0OGRkYjVjMGE1MSJ9.MS0PWj4txKn8R8FtiKAYjW7Pu3zYHuRf3PdtMsJwKvg",
  "access_expires_at": "2026-10-28T14:41:24.710883318Z",
  "refresh_token": "PUNJluimK3BetmQqnRqRcv3zN_XALgH6yleNOAOp8P4",
  "refresh_expires_at": "2026-11-27T14:26:24.710446368Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6d563dfa-329f-41ea-b92b-e2399a903e0b",
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
  "id": "f1706558-d5a7-436c-b1c8-349fda55f245",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:31:24.935346Z",
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
  "command_id": "5f5b7297-aa39-4d92-90b9-8f88da258ffe",
  "quote_id": "f1706558-d5a7-436c-b1c8-349fda55f245",
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
  "id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cbcdc0db-8ce1-4385-b98a-668e01e04936",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:26:25.165704Z",
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
    "id": "b9a959d3-0555-4a08-8668-8162133f10c5",
    "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
    "expires_at": "2026-10-28T14:26:40.168196Z",
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

`POST /api/driver/v1/offers/b9a959d3-0555-4a08-8668-8162133f10c5/reject` → **204**

```json
{
  "command_id": "28248d33-2f2d-492c-903a-b88bcbf1e92e"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7ebe6b18-3940-4e92-b307-167254e5120c",
    "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
    "expires_at": "2026-10-28T14:26:40.631375Z",
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

`POST /api/driver/v1/offers/7ebe6b18-3940-4e92-b307-167254e5120c/accept` → **200**

```json
{
  "command_id": "d595ebb6-cb2e-40c5-91fe-73aa284bd2e1"
}
```

```json
{
  "id": "9f016b7a-dc30-4025-8d93-525d306ebbf0",
  "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f550bc7d-478d-4847-aff9-62e2cea39eff",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/040dc47e-e20a-48fb-a1e8-3e6f54d9021b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:26:25.166134Z",
      "actor": {
        "type": "CLIENT",
        "id": "cbcdc0db-8ce1-4385-b98a-668e01e04936",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
        "quote_id": "f1706558-d5a7-436c-b1c8-349fda55f245",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "102f625f-4730-456d-9b72-8a245eba08dc"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:26:25.167582Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
        "attempt_id": "44bec745-21ec-4e33-874d-b7beb53a0f47",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "102f625f-4730-456d-9b72-8a245eba08dc"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:26:25.172968Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b9a959d3-0555-4a08-8668-8162133f10c5",
        "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "102f625f-4730-456d-9b72-8a245eba08dc"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:26:25.630577Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b9a959d3-0555-4a08-8668-8162133f10c5",
        "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b"
      },
      "correlation_id": "e936f51f-7f36-46ed-839a-02e01395717c"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 040dc47e-e20a-48fb-a1e8-3e6f54d9021b — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/040dc47e-e20a-48fb-a1e8-3e6f54d9021b` → **200**

```json
{
  "id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "cbcdc0db-8ce1-4385-b98a-668e01e04936",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9f016b7a-dc30-4025-8d93-525d306ebbf0",
    "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f550bc7d-478d-4847-aff9-62e2cea39eff",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:26:25.165704Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/040dc47e-e20a-48fb-a1e8-3e6f54d9021b/cancel` → **200**

```json
{
  "command_id": "a96a7fc1-10c5-4799-b7ce-77b21155b57c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cbcdc0db-8ce1-4385-b98a-668e01e04936",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "9f016b7a-dc30-4025-8d93-525d306ebbf0",
    "order_id": "040dc47e-e20a-48fb-a1e8-3e6f54d9021b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f550bc7d-478d-4847-aff9-62e2cea39eff",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:26:25.165704Z",
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
  "session_id": "d885ee41-5bf7-430a-a353-a68aadced38b",
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
  "last_heartbeat_at": "2026-10-28T14:26:22.13538Z",
  "last_location_at": "2026-10-28T14:26:22.13538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d885ee41-5bf7-430a-a353-a68aadced38b/close` → **200**

```json
{
  "command_id": "8b9907e2-00ee-4d5d-86d1-f7d581a8945c",
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
  "session_id": "64c48564-7d80-41ae-a7a3-23d66eab7a83",
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
  "last_heartbeat_at": "2026-10-28T14:26:23.310007Z",
  "last_location_at": "2026-10-28T14:26:23.310007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/64c48564-7d80-41ae-a7a3-23d66eab7a83/close` → **200**

```json
{
  "command_id": "67339e89-9fd9-4adc-ad4d-674f369a4054",
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
  "device_ref": "sandbox-25214"
}
```

```json
{
  "challenge_id": "d657e01c-1f07-488b-b878-02734e5d2367",
  "expires_at": "2026-10-28T14:31:27.97709633Z",
  "resend_available_at": "2026-10-28T14:26:28.97709633Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "075123",
  "sent_at": "2026-10-28T14:26:27.979127734Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d657e01c-1f07-488b-b878-02734e5d2367",
  "code": "075123",
  "device_ref": "sandbox-25214"
}
```

```json
{
  "session_id": "922ade5b-c435-4ce0-bc8a-cce87de6f911",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODQ4OCwiaWF0IjoxNzkzMTk3NTg4LCJqdGkiOiI4YmNiNGI0ZC05N2I1LTQyMTUtYThlMS03NWM0M2Y0NDM4ZDIiLCJzaWQiOiI5MjJhZGU1Yi1jNDM1LTRjZTAtYmM4YS1jY2U4N2RlNmY5MTEifQ.KOtlNbRFYFzwA1Vzcyy3g4lUz1QlRYvdci8--ei20Hg",
  "access_expires_at": "2026-10-28T14:41:28.218298304Z",
  "refresh_token": "DpEbt7-JQ9UvA4Tzczr6o3Q1hGSLrNxRm2epE7OE7YY",
  "refresh_expires_at": "2026-11-27T14:26:28.217887103Z",
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
  "command_id": "a2fb4304-d609-4a6d-9403-69381ea56297",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:28Z",
    "sequence": 1793197588665
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:28.682348Z",
  "last_location_at": "2026-10-28T14:26:28.682348Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673959110",
  "device_ref": "sandbox-11449"
}
```

```json
{
  "challenge_id": "faf4cde6-4624-4c72-b513-8b11625a7af7",
  "expires_at": "2026-10-28T14:31:28.904958803Z",
  "resend_available_at": "2026-10-28T14:26:29.904958803Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673959110` → **200**

```json
{
  "phone": "+380673959110",
  "audience": "CLIENT",
  "code": "754030",
  "sent_at": "2026-10-28T14:26:28.906837788Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "faf4cde6-4624-4c72-b513-8b11625a7af7",
  "code": "754030",
  "device_ref": "sandbox-11449"
}
```

```json
{
  "session_id": "44f64980-8e5e-49bc-85e4-f27ea63b5dbc",
  "subject": {
    "type": "CLIENT",
    "id": "3379ca2d-a7e3-4adb-b641-338ad82909dd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzc5Y2EyZC1hN2UzLTRhZGItYjY0MS0zMzhhZDgyOTA5ZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NDg5LCJpYXQiOjE3OTMxOTc1ODksImp0aSI6ImRmYmQ1YjcyLTg5MDctNDdjYi04YWI4LTJhZDlkMWEzMDA0OCIsInNpZCI6IjQ0ZjY0OTgwLThlNWUtNDliYy04NWU0LWYyN2VhNjNiNWRiYyJ9.WQa7bXyllr39b43jZ9up7eDVppomh3zL8xDcRYpaRTk",
  "access_expires_at": "2026-10-28T14:41:29.142149351Z",
  "refresh_token": "hl8rAb3dre881FSvVPMOBw0dc90LSgdgeqY_6yPOyu8",
  "refresh_expires_at": "2026-11-27T14:26:29.141751951Z",
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
  "command_id": "c94d54aa-ca92-459e-9b4d-55d73cf42605",
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
  "id": "00a81036-50a7-4dfb-8a6b-5b4a40437f1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:31:29.590915Z",
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
  "command_id": "d5f891bf-001b-45ac-b922-2608adee0197",
  "platform": "ANDROID",
  "token": "sandbox-driver-89e6d854-72c0-410f-8a66-644f6aa51122"
}
```

```json
{
  "id": "ff40cb6f-4ec0-4325-ba95-f55fbd0b1ef2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:26:29.827729Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1648533b-e5e0-4463-a639-d4cd585a6d23",
  "platform": "ANDROID",
  "token": "sandbox-rider-2bd892e8-70a7-4cb7-81b6-fb1bd0970b80"
}
```

```json
{
  "id": "df0d0897-d20d-48b0-80ca-9cff344cc1d1",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:26:30.047918Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dc221b01-7ce5-4eb9-9a4d-f616c3910910",
  "quote_id": "00a81036-50a7-4dfb-8a6b-5b4a40437f1c",
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
  "id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3379ca2d-a7e3-4adb-b641-338ad82909dd",
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
  "created_at": "2026-10-28T14:26:30.273116Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "509de7ed-606b-4ea0-9a58-a711af576b93",
    "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
    "expires_at": "2026-10-28T14:26:45.275454Z",
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

`POST /api/driver/v1/offers/509de7ed-606b-4ea0-9a58-a711af576b93/accept` → **200**

```json
{
  "command_id": "a1f50b48-4d78-461b-b7f6-e7d488fdb23c"
}
```

```json
{
  "id": "6bbe826b-dd0d-4c95-8a99-a4159a35a163",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f0e69968-3dd8-42b9-8cab-f44309afeb49",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:26:30.252Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:26:31.05164401Z",
    "token_suffix": "a51122",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
      "order_version": "2",
      "event_id": "820d28e5-72fc-4ed3-b34e-47ab6effb2df",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673959110&after=2026-10-28T14:26:30.252Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380673959110&after=2026-10-28T14:26:30.252Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:26:32.05663687Z",
    "token_suffix": "970b80",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
      "order_version": "3",
      "event_id": "1f3d714e-648e-4ead-bc9b-e68fef617a92",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/029cbf93-65b5-4ec3-ae9e-e0f5c5a42916/messages` → **201**

```json
{
  "command_id": "2a8c18ad-65b2-43f7-8655-c2bf484cd9b4",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "3194c6f4-d296-4c0d-9b69-2145184c5217",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:26:32.181657281Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f0e69968-3dd8-42b9-8cab-f44309afeb49",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "assignment_id": "6bbe826b-dd0d-4c95-8a99-a4159a35a163",
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

`POST /api/driver/v1/trips/f0e69968-3dd8-42b9-8cab-f44309afeb49/messages` → **201**

```json
{
  "command_id": "09b14b87-5800-4888-bcc7-14823cce8839",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "dfa2e72c-40f8-4019-8bc5-a6fe36b24cba",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:26:32.613585401Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/029cbf93-65b5-4ec3-ae9e-e0f5c5a42916/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/f0e69968-3dd8-42b9-8cab-f44309afeb49/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673959110"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:33Z",
    "sequence": 1793197593247
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:33.265644Z",
  "last_location_at": "2026-10-28T14:26:33.265644Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f0e69968-3dd8-42b9-8cab-f44309afeb49",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "assignment_id": "6bbe826b-dd0d-4c95-8a99-a4159a35a163",
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

`POST /api/driver/v1/trips/f0e69968-3dd8-42b9-8cab-f44309afeb49/arrive` → **200**

```json
{
  "command_id": "08b8f5cc-1e9e-4c04-8585-b73e9e85db07",
  "expected_version": 0
}
```

```json
{
  "id": "f0e69968-3dd8-42b9-8cab-f44309afeb49",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "assignment_id": "6bbe826b-dd0d-4c95-8a99-a4159a35a163",
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
  "arrived_at": "2026-10-28T14:26:33.710056Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f0e69968-3dd8-42b9-8cab-f44309afeb49/start` → **200**

```json
{
  "command_id": "1e509986-7ea1-4fb6-8d15-e58d155ca8e9",
  "expected_version": 1
}
```

```json
{
  "id": "f0e69968-3dd8-42b9-8cab-f44309afeb49",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "assignment_id": "6bbe826b-dd0d-4c95-8a99-a4159a35a163",
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
  "arrived_at": "2026-10-28T14:26:33.710056Z",
  "started_at": "2026-10-28T14:26:33.970235Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:34Z",
    "sequence": 1793197594189
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:34.207375Z",
  "last_location_at": "2026-10-28T14:26:34.207375Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/f0e69968-3dd8-42b9-8cab-f44309afeb49/complete` → **200**

```json
{
  "command_id": "6cccfe6c-b47d-47ff-9264-e85e004cf0a2",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:26:34Z",
  "cash_received": true
}
```

```json
{
  "id": "f0e69968-3dd8-42b9-8cab-f44309afeb49",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "assignment_id": "6bbe826b-dd0d-4c95-8a99-a4159a35a163",
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
  "arrived_at": "2026-10-28T14:26:33.710056Z",
  "started_at": "2026-10-28T14:26:33.970235Z",
  "completed_at": "2026-10-28T14:26:34.427734Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/029cbf93-65b5-4ec3-ae9e-e0f5c5a42916` → **200**

```json
{
  "id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "3379ca2d-a7e3-4adb-b641-338ad82909dd",
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
    "id": "6bbe826b-dd0d-4c95-8a99-a4159a35a163",
    "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f0e69968-3dd8-42b9-8cab-f44309afeb49",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:26:30.273116Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:26:30.273116Z",
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
    "id": "f0e69968-3dd8-42b9-8cab-f44309afeb49",
    "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
    "order_short_number": 7,
    "created_at": "2026-10-28T14:26:30.872273Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "aa396b63-f584-41a2-a5e6-83a9748684cd",
    "order_id": "744cc4ee-2a4c-4a3e-bf46-9bb91f7da701",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:25:11.826072Z",
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
      "balance_minor": -104,
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
        "trips": 2,
        "fare_minor": 21034,
        "commission_minor": 3156,
        "driver_share_minor": 17878,
        "cash_minor": 17982,
        "cashless_minor": 3052,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -104
      }
    }
  ],
  "total": {
    "trips": 2,
    "fare_minor": 21034,
    "commission_minor": 3156,
    "driver_share_minor": 17878,
    "cash_minor": 17982,
    "cashless_minor": 3052,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -104
  },
  "balance_minor": -104
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/029cbf93-65b5-4ec3-ae9e-e0f5c5a42916/tip` → **200**

```json
{
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
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
  "available_until": "2026-10-29T14:26:34.427734Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/029cbf93-65b5-4ec3-ae9e-e0f5c5a42916/tip` → **201**

```json
{
  "command_id": "0a63b424-280e-41d0-971b-b87ac9b3fda1",
  "amount_minor": 1100
}
```

```json
{
  "id": "65f812e3-5e7c-404f-86d9-810008eba086",
  "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:26:38.987439Z"
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
  "session_id": "e8509970-d925-4e72-9f2d-e57437a3a8f1",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg0OTksImlhdCI6MTc5MzE5NzU5OSwianRpIjoiY2MxYTFhMjItZmY2YS00NjRmLWI4ZjItNzMwMjhhOGY2MGNhIiwic2lkIjoiZTg1MDk5NzAtZDkyNS00ZTcyLTlmMmQtZTU3NDM3YTNhOGYxIn0.710nVHCqxHNkKBJCQSNDy601NDVSxFcMtq2QPavQ_80",
  "access_expires_at": "2026-10-28T14:41:39.469449554Z",
  "refresh_token": "24zJ-uS_6rh5HtTXfktrw4-iEOLp4_wRDV0oOU_WUXQ",
  "refresh_expires_at": "2026-10-29T02:26:39.468992684Z",
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
        "created": 7,
        "fulfilled": 3,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 7
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 6
        },
        "cancelled_by": {
          "STAFF": 1,
          "RIDER": 2,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 7,
    "fulfilled": 3,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 7
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 6
    },
    "cancelled_by": {
      "STAFF": 1,
      "RIDER": 2,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 1
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
  "generated_at": "2026-10-28T14:26:39.690595522Z"
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
        "trips": 3,
        "fares_minor": 37331,
        "service_rides_minor": 0,
        "commission_minor": 5601,
        "driver_share_minor": 31730,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 2000,
        "collected_by_drivers_minor": 17982,
        "tips_minor": 2500,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 3,
    "fares_minor": 37331,
    "service_rides_minor": 0,
    "commission_minor": 5601,
    "driver_share_minor": 31730,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 2000,
    "collected_by_drivers_minor": 17982,
    "tips_minor": 2500,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-10-28T14:26:39.912330415Z"
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
  "session_id": "fe42cf01-2a37-405f-981f-2e5cb47333c8",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MDAsImlhdCI6MTc5MzE5NzYwMCwianRpIjoiNTI3M2U5NzUtZTc4ZC00ZWEyLWI1YTctOTI2MGU3OTBmZGM0Iiwic2lkIjoiZmU0MmNmMDEtMmEzNy00MDVmLTk4MWYtMmU1Y2I0NzMzM2M4In0.Wgod0pRZoBa-0a7RHTpx30I1q_KuWfNvAliKxkwsmf4",
  "access_expires_at": "2026-10-28T14:41:40.393406635Z",
  "refresh_token": "lSBEt4bY32EitgXQwDWbpx7U-0kfILXnVyH2glXsWA8",
  "refresh_expires_at": "2026-10-29T02:26:40.392923415Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/029cbf93-65b5-4ec3-ae9e-e0f5c5a42916/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:26:30.273497Z",
      "actor": {
        "type": "CLIENT",
        "id": "3379ca2d-a7e3-4adb-b641-338ad82909dd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
        "quote_id": "00a81036-50a7-4dfb-8a6b-5b4a40437f1c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "022c94f4-4a06-448b-9ce1-659cc6e85ee3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:26:30.274886Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
        "attempt_id": "0558cf67-7bad-48a5-9f00-743f2a9133e7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "022c94f4-4a06-448b-9ce1-659cc6e85ee3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:26:30.280317Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "509de7ed-606b-4ea0-9a58-a711af576b93",
        "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "022c94f4-4a06-448b-9ce1-659cc6e85ee3"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:26:30.873935Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "509de7ed-606b-4ea0-9a58-a711af576b93",
        "order_id": "029cbf93-65b5-4ec3-ae9e-e0f5c5a42916",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6bbe826b-dd0d-4c95-8a99-a4159a35a163"
      },
      "correlation_id": "1387e7d0-a14f-4066-9d8f-74b869c84a0f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:26:40.850739753Z",
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
      "last_location_at": "2026-10-28T14:26:34.207375Z",
      "order_id": null
    }
  ]
}
```

Done: order 029cbf93-65b5-4ec3-ae9e-e0f5c5a42916.

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
  "session_id": "959b06cb-683b-4f18-bba1-6047a8441adc",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MDEsImlhdCI6MTc5MzE5NzYwMSwianRpIjoiOTMxNTUwODUtNDhiMC00MTcxLWJiN2ItMTZmNWMyYzljMWM2Iiwic2lkIjoiOTU5YjA2Y2ItNjgzYi00ZjE4LWJiYTEtNjA0N2E4NDQxYWRjIn0.EN_ONmqJUuphUv1qf8gAGdm02FVcrzK4quEE3eu9KnA",
  "access_expires_at": "2026-10-28T14:41:41.35179653Z",
  "refresh_token": "M9uP7b3vFlalsrTQVUhDmH-BAx572G9ULMs3UKKVUgc",
  "refresh_expires_at": "2026-10-29T02:26:41.351349495Z",
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
  "command_id": "ef7a37c3-613d-4332-b72b-3c35bd856702",
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
  "timestamp": "2026-10-28T14:26:42.000+0000",
  "channel": {
    "id": "1730052000.97498458",
    "linkedid": "1730052000.97498458",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676641033"
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
  "timestamp": "2026-10-28T14:26:42.000+0000",
  "channel": {
    "id": "1730052000.97498458",
    "linkedid": "1730052000.97498458",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676641033"
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
  "session_id": "b9378104-3e58-4ad4-a767-9e17bafcf70d",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MDIsImlhdCI6MTc5MzE5NzYwMiwianRpIjoiMjVlMGVjYTktZWNmNy00ZWQ3LTg3YjgtNTE4ZDhlMjJiOWE5Iiwic2lkIjoiYjkzNzgxMDQtM2U1OC00YWQ0LWE3NjctOWUxN2JhZmNmNzBkIn0.BgL0_TDHa1TI8JfJPn-IhQdF7EaF4IlfSRMiHZQtguo",
  "access_expires_at": "2026-10-28T14:41:42.349975005Z",
  "refresh_token": "9FVhUDSJ6NSOfR7AmLkAhT1fRmud37oH7Ppf16CwOhM",
  "refresh_expires_at": "2026-10-29T02:26:42.34950781Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "25f92f61-35b7-465f-835a-b566c35eec10",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676641033",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:26:42Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/25f92f61-35b7-465f-835a-b566c35eec10/answer` → **200**

```json
{
  "command_id": "ffdb5fb8-a0bf-4a47-a7e6-0638dcefb669"
}
```

```json
{
  "id": "25f92f61-35b7-465f-835a-b566c35eec10",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676641033",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "order_ids": [],
  "started_at": "2026-10-28T14:26:42Z",
  "answered_at": "2026-10-28T14:26:42.836082Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.97498458",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "17af7bdd-bfd1-4975-93ca-aa954dcfcaba",
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
  "id": "0c72751c-7d78-4196-bdd7-ceba3ebd5d12",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:31:43.094036Z",
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
  "command_id": "2ab12e4e-7589-4cde-a9d7-49d229ab07cb",
  "quote_id": "0c72751c-7d78-4196-bdd7-ceba3ebd5d12",
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
    "phone": "+380676641033"
  },
  "call_id": "25f92f61-35b7-465f-835a-b566c35eec10"
}
```

```json
{
  "id": "2f589111-b8cd-4f3b-a313-0e8ad3f4da9b",
  "short_number": 8,
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
  "created_at": "2026-10-28T14:26:43.341451Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676641033"
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
    "id": "1730052000.97498458",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "25f92f61-35b7-465f-835a-b566c35eec10",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676641033",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [
        "2f589111-b8cd-4f3b-a313-0e8ad3f4da9b"
      ],
      "started_at": "2026-10-28T14:26:42Z",
      "answered_at": "2026-10-28T14:26:42.836082Z",
      "ended_at": "2026-10-28T14:26:43.588275Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "5a04e863-4a29-4fa0-8fd4-45f87f5e114d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673092723",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [],
      "started_at": "2026-10-28T14:25:18.961037Z",
      "answered_at": "2026-10-28T14:25:19.222737Z",
      "ended_at": "2026-10-28T14:25:19.467552Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:25:27.752289Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/2f589111-b8cd-4f3b-a313-0e8ad3f4da9b` → **200**

```json
{
  "id": "2f589111-b8cd-4f3b-a313-0e8ad3f4da9b",
  "short_number": 8,
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
  "created_at": "2026-10-28T14:26:43.341451Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676641033"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/2f589111-b8cd-4f3b-a313-0e8ad3f4da9b` → **200**

```json
{
  "id": "2f589111-b8cd-4f3b-a313-0e8ad3f4da9b",
  "short_number": 8,
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
  "created_at": "2026-10-28T14:26:43.341451Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676641033"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/2f589111-b8cd-4f3b-a313-0e8ad3f4da9b/cancel` → **200**

```json
{
  "command_id": "900762da-f8da-4453-8ea9-06852f93cbbc",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "2f589111-b8cd-4f3b-a313-0e8ad3f4da9b",
  "short_number": 8,
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
  "created_at": "2026-10-28T14:26:43.341451Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676641033"
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

Done: call 25f92f61-35b7-465f-835a-b566c35eec10 with order 2f589111-b8cd-4f3b-a313-0e8ad3f4da9b.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2185"
}
```

```json
{
  "challenge_id": "5efdd719-0fb4-40f8-9d30-d6154ab71a97",
  "expires_at": "2026-10-28T14:31:44.592739849Z",
  "resend_available_at": "2026-10-28T14:26:45.592739849Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "501467",
  "sent_at": "2026-10-28T14:26:44.595005777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5efdd719-0fb4-40f8-9d30-d6154ab71a97",
  "code": "501467",
  "device_ref": "sandbox-2185"
}
```

```json
{
  "session_id": "6b8c19f7-35be-4950-9622-9c682d117275",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODUwNCwiaWF0IjoxNzkzMTk3NjA0LCJqdGkiOiJkN2IwN2Q3YS1mYTdkLTQ5ZDQtYWY3Ny05YThkMmE5ZDdjZjUiLCJzaWQiOiI2YjhjMTlmNy0zNWJlLTQ5NTAtOTYyMi05YzY4MmQxMTcyNzUifQ.D9rWema0QWH4MNhW26DNso1qZHVl6STPd1VDaX9VdbQ",
  "access_expires_at": "2026-10-28T14:41:44.840966304Z",
  "refresh_token": "ibNBVOIAF_agQb6xApbDfjp_xIbKwPVTRC3QDvfiYnM",
  "refresh_expires_at": "2026-11-27T14:26:44.840378327Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:34.207375Z",
  "last_location_at": "2026-10-28T14:26:34.207375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/handover` → **200**

```json
{
  "command_id": "d7e01057-3019-40c0-86e9-92f95c95a707",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:34.207375Z",
  "last_location_at": "2026-10-28T14:26:34.207375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:45Z",
    "sequence": 1793197605502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:45.520263Z",
  "last_location_at": "2026-10-28T14:26:45.520263Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665323695",
  "device_ref": "sandbox-2577"
}
```

```json
{
  "challenge_id": "5fcbd1ee-d8d7-4820-aac9-458c72c4f800",
  "expires_at": "2026-10-28T14:31:45.740934604Z",
  "resend_available_at": "2026-10-28T14:26:46.740934604Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665323695` → **200**

```json
{
  "phone": "+380665323695",
  "audience": "CLIENT",
  "code": "980410",
  "sent_at": "2026-10-28T14:26:45.743001822Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fcbd1ee-d8d7-4820-aac9-458c72c4f800",
  "code": "980410",
  "device_ref": "sandbox-2577"
}
```

```json
{
  "session_id": "cdfb54e3-7042-4a49-84e9-2bd1eda438e6",
  "subject": {
    "type": "CLIENT",
    "id": "56f8edcd-7360-41fb-ba89-e416008ad753"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NmY4ZWRjZC03MzYwLTQxZmItYmE4OS1lNDE2MDA4YWQ3NTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTA1LCJpYXQiOjE3OTMxOTc2MDUsImp0aSI6ImMwNmM1YzIwLWU1MjEtNDYwOS1iNzk4LWRmM2IxY2M1ODcxNiIsInNpZCI6ImNkZmI1NGUzLTcwNDItNGE0OS04NGU5LTJiZDFlZGE0MzhlNiJ9.i-tDYvDeDCqoBle_JJZ-W_up0M5VLQUTmijaauE2WBs",
  "access_expires_at": "2026-10-28T14:41:45.982099241Z",
  "refresh_token": "USodvsva844O_eBFOLUkgc4iER-5HptPgBTgZVYxcPg",
  "refresh_expires_at": "2026-11-27T14:26:45.981705367Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aaa0e29a-298a-4b65-8619-619865ff0c82",
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
  "id": "51372804-28d0-4dff-9383-47c3445d226a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:31:46.204205Z",
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
  "command_id": "1c3964f1-829b-443a-a64f-5287b011d7b2",
  "quote_id": "51372804-28d0-4dff-9383-47c3445d226a",
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
  "id": "057721a1-19dd-47cf-b0f4-5949985785a0",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "56f8edcd-7360-41fb-ba89-e416008ad753",
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
  "created_at": "2026-10-28T14:26:46.437288Z",
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
    "id": "27f4d302-1c29-4e62-b658-4b01e4d1377d",
    "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
    "expires_at": "2026-10-28T14:27:01.440031Z",
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

`POST /api/driver/v1/offers/27f4d302-1c29-4e62-b658-4b01e4d1377d/accept` → **200**

```json
{
  "command_id": "fdcb543c-ba47-4f3b-82e6-bb198842100b"
}
```

```json
{
  "id": "8ebd611f-ab85-4882-acef-600db7e7126b",
  "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "caa9794b-5590-409e-b589-1af33c47c0e5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "caa9794b-5590-409e-b589-1af33c47c0e5",
  "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
  "assignment_id": "8ebd611f-ab85-4882-acef-600db7e7126b",
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

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:47Z",
    "sequence": 1793197607305
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:47.322267Z",
  "last_location_at": "2026-10-28T14:26:47.322267Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/caa9794b-5590-409e-b589-1af33c47c0e5/arrive` → **200**

```json
{
  "command_id": "53f05d86-3c32-4ddf-8011-7412c5e3d160",
  "expected_version": 0
}
```

```json
{
  "id": "caa9794b-5590-409e-b589-1af33c47c0e5",
  "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
  "assignment_id": "8ebd611f-ab85-4882-acef-600db7e7126b",
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
  "arrived_at": "2026-10-28T14:26:47.542599Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/caa9794b-5590-409e-b589-1af33c47c0e5/start` → **200**

```json
{
  "command_id": "ffc0815e-df98-42c6-866f-93f1a8ee06a9",
  "expected_version": 1
}
```

```json
{
  "id": "caa9794b-5590-409e-b589-1af33c47c0e5",
  "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
  "assignment_id": "8ebd611f-ab85-4882-acef-600db7e7126b",
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
  "arrived_at": "2026-10-28T14:26:47.542599Z",
  "started_at": "2026-10-28T14:26:47.769939Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:47Z",
    "sequence": 1793197607983
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:48.000348Z",
  "last_location_at": "2026-10-28T14:26:48.000348Z",
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
  "device_ref": "sandbox-23469"
}
```

```json
{
  "challenge_id": "74c5500c-03f1-4bf5-8581-00bb8c79d6c0",
  "expires_at": "2026-10-28T14:31:48.210443856Z",
  "resend_available_at": "2026-10-28T14:26:49.210443856Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "778834",
  "sent_at": "2026-10-28T14:26:48.21238497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74c5500c-03f1-4bf5-8581-00bb8c79d6c0",
  "code": "778834",
  "device_ref": "sandbox-23469"
}
```

```json
{
  "session_id": "588e0629-5bb1-4516-829c-3d8d4a5ded0f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODUwOCwiaWF0IjoxNzkzMTk3NjA4LCJqdGkiOiJiZGI5M2E2Yy0xOWMzLTRhOTgtODJjNS04YzRlNjIwNzc1YjEiLCJzaWQiOiI1ODhlMDYyOS01YmIxLTQ1MTYtODI5Yy0zZDhkNGE1ZGVkMGYifQ.MK1jW4nMVW7-hqcj8LVW4GqDRE0ABHFhCOne44fX7Hg",
  "access_expires_at": "2026-10-28T14:41:48.447868296Z",
  "refresh_token": "jr5WDvcENY5gN79ma-wtp0QDXlkNTnawaOtsSMNoQfM",
  "refresh_expires_at": "2026-11-27T14:26:48.447441532Z",
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
  "command_id": "1830c9d5-97c9-4a08-9399-60045571e04c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:48Z",
    "sequence": 1793197608891
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9bfb0a04-7378-4863-b881-933f7fe1bf18",
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
  "last_heartbeat_at": "2026-10-28T14:26:48.907164Z",
  "last_location_at": "2026-10-28T14:26:48.907164Z",
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
  "session_id": "f6b70456-1bf2-4d8b-a75e-808adbf51117",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MDksImlhdCI6MTc5MzE5NzYwOSwianRpIjoiOTU3MjJkODktNzA1Yi00YWRhLWI1NDQtZTE0MjYxZGIwYTEzIiwic2lkIjoiZjZiNzA0NTYtMWJmMi00ZDhiLWE3NWUtODA4YWRiZjUxMTE3In0.NQQ9INwvQVFndefRACVpqaL9yo4Ma8-1y__uIGCdIkQ",
  "access_expires_at": "2026-10-28T14:41:49.380299272Z",
  "refresh_token": "2dM6vw95wOGs_WiYb090fu_S1EiXbKMA0bL-ZdqQyYw",
  "refresh_expires_at": "2026-10-29T02:26:49.379857154Z",
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
  "session_id": "8749d60b-1617-4b92-8152-afd71ab2ef14",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MDksImlhdCI6MTc5MzE5NzYwOSwianRpIjoiYmQ2OTIwODItNDVlNy00MDU5LWE0MTMtOWQzNzc5ZTE2NTIyIiwic2lkIjoiODc0OWQ2MGItMTYxNy00YjkyLTgxNTItYWZkNzFhYjJlZjE0In0.Y9uMj7F-avDWU4WtNZEw0IhcgwnZgMZti8nfShwEaas",
  "access_expires_at": "2026-10-28T14:41:49.850961083Z",
  "refresh_token": "Ubpll3I68cZz9hEen7fCCTbEPzP3TC5wGDoBa0ae9zM",
  "refresh_expires_at": "2026-10-29T02:26:49.850512298Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/057721a1-19dd-47cf-b0f4-5949985785a0` → **200**

```json
{
  "id": "057721a1-19dd-47cf-b0f4-5949985785a0",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "56f8edcd-7360-41fb-ba89-e416008ad753",
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
    "id": "8ebd611f-ab85-4882-acef-600db7e7126b",
    "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "caa9794b-5590-409e-b589-1af33c47c0e5",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:26:46.437288Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/057721a1-19dd-47cf-b0f4-5949985785a0/interrupt` → **200**

```json
{
  "command_id": "41c8071c-6ac3-45be-96f0-12353f4f524e",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "057721a1-19dd-47cf-b0f4-5949985785a0",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "56f8edcd-7360-41fb-ba89-e416008ad753",
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
      "id": "8ebd611f-ab85-4882-acef-600db7e7126b",
      "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "caa9794b-5590-409e-b589-1af33c47c0e5",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:26:46.437288Z",
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
    "id": "651d8b53-dce6-4634-8d4a-dbcc755cf26a",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "56f8edcd-7360-41fb-ba89-e416008ad753",
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
    "id": "4a0dc436-247b-49d1-bc57-249cecf38f96",
    "order_id": "651d8b53-dce6-4634-8d4a-dbcc755cf26a",
    "expires_at": "2026-10-28T14:27:05.307825Z",
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

`POST /api/driver/v1/offers/4a0dc436-247b-49d1-bc57-249cecf38f96/accept` → **200**

```json
{
  "command_id": "f21b0ec4-8e9e-4002-b9ea-1bbd6d3ad04a"
}
```

```json
{
  "id": "bc468566-1de7-4469-8904-ad278ff20dfe",
  "order_id": "651d8b53-dce6-4634-8d4a-dbcc755cf26a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2662ca8a-430b-4b9b-a767-332c4e5a19e3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2662ca8a-430b-4b9b-a767-332c4e5a19e3",
  "order_id": "651d8b53-dce6-4634-8d4a-dbcc755cf26a",
  "assignment_id": "bc468566-1de7-4469-8904-ad278ff20dfe",
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
  "session_id": "9bfb0a04-7378-4863-b881-933f7fe1bf18",
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
  "last_heartbeat_at": "2026-10-28T14:26:48.907164Z",
  "last_location_at": "2026-10-28T14:26:48.907164Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/9bfb0a04-7378-4863-b881-933f7fe1bf18/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:26:51Z",
    "sequence": 1793197611560
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9bfb0a04-7378-4863-b881-933f7fe1bf18",
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
  "last_heartbeat_at": "2026-10-28T14:26:51.57831Z",
  "last_location_at": "2026-10-28T14:26:51.57831Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2662ca8a-430b-4b9b-a767-332c4e5a19e3/arrive` → **200**

```json
{
  "command_id": "dee0fcaa-f5af-466e-a8e3-8ead9382b002",
  "expected_version": 0
}
```

```json
{
  "id": "2662ca8a-430b-4b9b-a767-332c4e5a19e3",
  "order_id": "651d8b53-dce6-4634-8d4a-dbcc755cf26a",
  "assignment_id": "bc468566-1de7-4469-8904-ad278ff20dfe",
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
  "arrived_at": "2026-10-28T14:26:51.809444Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2662ca8a-430b-4b9b-a767-332c4e5a19e3/start` → **200**

```json
{
  "command_id": "e8090e7d-8b38-410b-afbf-3051a25d434a",
  "expected_version": 1
}
```

```json
{
  "id": "2662ca8a-430b-4b9b-a767-332c4e5a19e3",
  "order_id": "651d8b53-dce6-4634-8d4a-dbcc755cf26a",
  "assignment_id": "bc468566-1de7-4469-8904-ad278ff20dfe",
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
  "arrived_at": "2026-10-28T14:26:51.809444Z",
  "started_at": "2026-10-28T14:26:52.043637Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2662ca8a-430b-4b9b-a767-332c4e5a19e3/complete` → **200**

```json
{
  "command_id": "4de9fd73-c582-49d4-840c-5f943cbd65d0",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:26:52Z"
}
```

```json
{
  "id": "2662ca8a-430b-4b9b-a767-332c4e5a19e3",
  "order_id": "651d8b53-dce6-4634-8d4a-dbcc755cf26a",
  "assignment_id": "bc468566-1de7-4469-8904-ad278ff20dfe",
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
  "arrived_at": "2026-10-28T14:26:51.809444Z",
  "started_at": "2026-10-28T14:26:52.043637Z",
  "completed_at": "2026-10-28T14:26:52.277437Z",
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
    "id": "651d8b53-dce6-4634-8d4a-dbcc755cf26a",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:26:50.300661Z",
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
    "id": "057721a1-19dd-47cf-b0f4-5949985785a0",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:26:46.437288Z",
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

`GET /api/operator/v1/orders/057721a1-19dd-47cf-b0f4-5949985785a0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:26:46.437758Z",
      "actor": {
        "type": "CLIENT",
        "id": "56f8edcd-7360-41fb-ba89-e416008ad753",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
        "quote_id": "51372804-28d0-4dff-9383-47c3445d226a",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "b670fb02-aaaa-4235-92e2-616b70e15b1a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:26:46.439315Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
        "attempt_id": "6de9cc40-25b0-427e-b6f6-fbe3110f32de",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b670fb02-aaaa-4235-92e2-616b70e15b1a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:26:46.442381Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "27f4d302-1c29-4e62-b658-4b01e4d1377d",
        "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "b670fb02-aaaa-4235-92e2-616b70e15b1a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:26:46.887103Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "27f4d302-1c29-4e62-b658-4b01e4d1377d",
        "order_id": "057721a1-19dd-47cf-b0f4-5949985785a0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8ebd611f-ab85-4882-acef-600db7e7126b"
      },
      "correlation_id": "5a6608c9-f692-44eb-b957-9875f4299b13"
```

Done: interrupted 057721a1-19dd-47cf-b0f4-5949985785a0, follow-up 651d8b53-dce6-4634-8d4a-dbcc755cf26a.

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
  "session_id": "f5962fb1-86e9-4bb1-9c4b-2fb26c3ec4ec",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MTYsImlhdCI6MTc5MzE5NzYxNiwianRpIjoiZGNhOWE0NTQtNmRhOC00ZjAzLWI1MWYtZjA2NmJlZmVmMTExIiwic2lkIjoiZjU5NjJmYjEtODZlOS00YmIxLTljNGItMmZiMjZjM2VjNGVjIn0.Y2sUhMiQYFRYlyt94ENqHRlTlrUyqyCh1FQ-021eYGM",
  "access_expires_at": "2026-10-28T14:41:56.433698858Z",
  "refresh_token": "jndXx7rU0_dJgnwR646ODqWvbZli606VamV4I1v70-I",
  "refresh_expires_at": "2026-10-29T02:26:56.433177121Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "81098bdf-c499-4b1a-a515-d684bac47342",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:26:56Z"
}
```

```json
{
  "id": "68e58b57-925e-4e5c-9949-e006b4053cfa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:26:56Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/68e58b57-925e-4e5c-9949-e006b4053cfa/publish` → **200**

```json
{
  "command_id": "9e4aef96-5fec-477b-8c38-295fbb454eab",
  "expected_version": 0
}
```

```json
{
  "id": "68e58b57-925e-4e5c-9949-e006b4053cfa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:26:56.89641Z",
  "published_at": "2026-10-28T14:26:56.89641Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "68e58b57-925e-4e5c-9949-e006b4053cfa",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:26:56.89641Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630049376",
  "device_ref": "sandbox-10731"
}
```

```json
{
  "challenge_id": "5fd61fc7-cec1-4c88-8fec-46ff2185a632",
  "expires_at": "2026-10-28T14:31:57.326041595Z",
  "resend_available_at": "2026-10-28T14:26:58.326041595Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630049376` → **200**

```json
{
  "phone": "+380630049376",
  "audience": "CLIENT",
  "code": "141931",
  "sent_at": "2026-10-28T14:26:57.327904907Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5fd61fc7-cec1-4c88-8fec-46ff2185a632",
  "code": "141931",
  "device_ref": "sandbox-10731"
}
```

```json
{
  "session_id": "ec2d7981-2870-4d5e-aa51-c4f9293287ad",
  "subject": {
    "type": "CLIENT",
    "id": "ca0ecab9-8241-4aae-afc6-dfbfcc3e9361"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTBlY2FiOS04MjQxLTRhYWUtYWZjNi1kZmJmY2MzZTkzNjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTE3LCJpYXQiOjE3OTMxOTc2MTcsImp0aSI6Ijc3NTMzOWFmLWI4NjEtNDdhZC05ZmEzLWY2Y2MzOGQ4OGI2ZSIsInNpZCI6ImVjMmQ3OTgxLTI4NzAtNGQ1ZS1hYTUxLWM0ZjkyOTMyODdhZCJ9.PV_Bz858m4h2eouHGpapTJGCT3nL01JjUsQqsMa2guE",
  "access_expires_at": "2026-10-28T14:41:57.56840261Z",
  "refresh_token": "wyf32Ru-H4R3ZHmp5OzbvlMDjBwZGVySq6JFOMtdSSQ",
  "refresh_expires_at": "2026-11-27T14:26:57.568008981Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "68e58b57-925e-4e5c-9949-e006b4053cfa",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:26:56.89641Z",
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
  "command_id": "3b76ffbe-d44e-4793-bf94-68af0adaa604",
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
  "id": "da83690f-4537-4b25-9224-b91bf010578a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:31:57.999897Z",
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
  "command_id": "e7b4ac63-9016-4cf8-97be-989c608767fb",
  "quote_id": "da83690f-4537-4b25-9224-b91bf010578a",
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
  "correlation_id": "f58ab322-6ab2-4ec1-9d57-0c60b12392c6"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f8356d88-a1b9-4466-a6a6-943d866ca9fd",
  "version_id": "68e58b57-925e-4e5c-9949-e006b4053cfa",
  "language": "uk"
}
```

```json
{
  "version_id": "68e58b57-925e-4e5c-9949-e006b4053cfa",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:26:58.46116Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "565d1cfa-795b-4320-b798-b20f63a47a9f",
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
  "id": "19b2dc6b-4c8c-44a7-9303-9261bc0819b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:31:58.684889Z",
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
  "command_id": "8f265e56-cf2b-4329-a91a-5096d954a884",
  "quote_id": "19b2dc6b-4c8c-44a7-9303-9261bc0819b0",
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
  "id": "e97d6d24-e046-40dc-bdc0-b075cb98afc9",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ca0ecab9-8241-4aae-afc6-dfbfcc3e9361",
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
  "created_at": "2026-10-28T14:26:58.912982Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e97d6d24-e046-40dc-bdc0-b075cb98afc9` → **200**

```json
{
  "id": "e97d6d24-e046-40dc-bdc0-b075cb98afc9",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ca0ecab9-8241-4aae-afc6-dfbfcc3e9361",
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
  "created_at": "2026-10-28T14:26:58.912982Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/e97d6d24-e046-40dc-bdc0-b075cb98afc9/cancel` → **200**

```json
{
  "command_id": "35d9e02e-e6bc-4d4e-a14c-5630dcb07c83",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e97d6d24-e046-40dc-bdc0-b075cb98afc9",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ca0ecab9-8241-4aae-afc6-dfbfcc3e9361",
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
  "created_at": "2026-10-28T14:26:58.912982Z",
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

`POST /api/admin/v1/legal-documents/68e58b57-925e-4e5c-9949-e006b4053cfa` → **409**

```json
{
  "command_id": "ca50d658-e31a-476c-af54-f2717acc63cf",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:26:59Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/68e58b57-925e-4e5c-9949-e006b4053cfa",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f9ba6fbf-5bf8-4c72-87ef-fac277b7bc44"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "74c57a20-2a72-4d18-9015-e86e48b7bfd5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:26:59Z"
}
```

```json
{
  "id": "50547cd7-026e-4183-8b03-29768f23939d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:26:59Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/50547cd7-026e-4183-8b03-29768f23939d/publish` → **200**

```json
{
  "command_id": "21afeb8e-ec50-4b0d-b8ad-7913ebafbc06",
  "expected_version": 0
}
```

```json
{
  "id": "50547cd7-026e-4183-8b03-29768f23939d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:27:00.076347Z",
  "published_at": "2026-10-28T14:27:00.076347Z",
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
  "device_ref": "sandbox-26139"
}
```

```json
{
  "challenge_id": "2a095adf-6e86-49b3-ac5f-5d553d6d5e7e",
  "expires_at": "2026-10-28T14:32:00.315418421Z",
  "resend_available_at": "2026-10-28T14:27:01.315418421Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "636787",
  "sent_at": "2026-10-28T14:27:00.317457894Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a095adf-6e86-49b3-ac5f-5d553d6d5e7e",
  "code": "636787",
  "device_ref": "sandbox-26139"
}
```

```json
{
  "session_id": "d4f3ab0d-142e-44d2-9c11-f18758bb6d38",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODUyMCwiaWF0IjoxNzkzMTk3NjIwLCJqdGkiOiJlMzQ1MThiNy1hMDc4LTRkODktODU2YS01M2QyZjM2MjcyNjAiLCJzaWQiOiJkNGYzYWIwZC0xNDJlLTQ0ZDItOWMxMS1mMTg3NThiYjZkMzgifQ.jrGlyfh1hX3c6pYe9XgRs2042rsJ3kaG95VzejgtX6s",
  "access_expires_at": "2026-10-28T14:42:00.603289885Z",
  "refresh_token": "TRne6qWxZcVlxI3_WZ23WuYgCTSeaO6Nydyh6ssfIzY",
  "refresh_expires_at": "2026-11-27T14:27:00.602794254Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9bfb0a04-7378-4863-b881-933f7fe1bf18",
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
  "last_heartbeat_at": "2026-10-28T14:26:51.57831Z",
  "last_location_at": "2026-10-28T14:26:51.57831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9bfb0a04-7378-4863-b881-933f7fe1bf18/handover` → **200**

```json
{
  "command_id": "be8af654-cfb7-4c75-a184-8b5c251e7ef8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9bfb0a04-7378-4863-b881-933f7fe1bf18",
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
  "last_heartbeat_at": "2026-10-28T14:26:51.57831Z",
  "last_location_at": "2026-10-28T14:26:51.57831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9bfb0a04-7378-4863-b881-933f7fe1bf18/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:27:01Z",
    "sequence": 1793197621257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9bfb0a04-7378-4863-b881-933f7fe1bf18",
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
  "last_heartbeat_at": "2026-10-28T14:27:01.275056Z",
  "last_location_at": "2026-10-28T14:27:01.275056Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678591141",
  "device_ref": "sandbox-15684"
}
```

```json
{
  "challenge_id": "0581e92e-4836-4ec8-8a0c-6e2851a00525",
  "expires_at": "2026-10-28T14:32:01.487724522Z",
  "resend_available_at": "2026-10-28T14:27:02.487724522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678591141` → **200**

```json
{
  "phone": "+380678591141",
  "audience": "CLIENT",
  "code": "967056",
  "sent_at": "2026-10-28T14:27:01.48961258Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0581e92e-4836-4ec8-8a0c-6e2851a00525",
  "code": "967056",
  "device_ref": "sandbox-15684"
}
```

```json
{
  "session_id": "f44dd5e6-475b-47b1-9474-a7a3b400aa6f",
  "subject": {
    "type": "CLIENT",
    "id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NjlhZTZkNy1jODY1LTQxMjctYjBiNS05YWEyZDVjMWI3NzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTIxLCJpYXQiOjE3OTMxOTc2MjEsImp0aSI6IjJmMDEzM2RjLTQ2MjktNDM3OS04YjdhLTE4OTI0ZDFjNzQxOSIsInNpZCI6ImY0NGRkNWU2LTQ3NWItNDdiMS05NDc0LWE3YTNiNDAwYWE2ZiJ9.9Z3WX3WGcdY8Bbh9Nh2ir_Yg64F6YJjV75soYiSeg0Y",
  "access_expires_at": "2026-10-28T14:42:01.732976225Z",
  "refresh_token": "PECxLlfyGKstoOF4-gz6iC7uwTlZRkTbJz4Hiu6B3W8",
  "refresh_expires_at": "2026-11-27T14:27:01.732565281Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3f8b2e4d-74f2-4fc0-940e-0dd0682edb91",
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
  "id": "b6a83037-521e-42cf-a8b1-61490a7a35e1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:01.953957Z",
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
  "command_id": "0c8a78b1-229f-4ed8-a375-95e5914bb0fd",
  "quote_id": "b6a83037-521e-42cf-a8b1-61490a7a35e1",
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
    "phone": "+380677285696"
  }
}
```

```json
{
  "id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:27:02.189707Z",
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
    "id": "be4a318a-2aa1-4569-98ae-1ad4dbf61db7",
    "order_id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
    "expires_at": "2026-10-28T14:27:17.192321Z",
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

`POST /api/driver/v1/offers/be4a318a-2aa1-4569-98ae-1ad4dbf61db7/accept` → **200**

```json
{
  "command_id": "750759ea-723a-40dd-bb42-9184fd6080a0"
}
```

```json
{
  "id": "cae33df6-c89a-4d6f-b7ab-1fe1368254d8",
  "order_id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ad1b03ac-b827-44db-97f4-77330c5265f3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ad1b03ac-b827-44db-97f4-77330c5265f3",
  "order_id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
  "assignment_id": "cae33df6-c89a-4d6f-b7ab-1fe1368254d8",
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
    "phone": "+380677285696"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aabeccde-ecdb-44a6-8d06-c69a40fbece0",
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
  "id": "50138d47-c3bd-46a6-a799-a18553a20c9b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:03.094249Z",
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
  "command_id": "f672d290-6dd6-48c0-9c28-7eb01c35ddaf",
  "quote_id": "50138d47-c3bd-46a6-a799-a18553a20c9b",
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
  "id": "2b1b78f0-cf0d-4409-82ad-e79768bc2968",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:27:03.323387Z",
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
  "command_id": "7f40444b-5994-4778-830e-4f81b4a83403",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:27:03Z"
}
```

```json
{
  "id": "50a27a20-c974-45a2-8192-5529f959e3d3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:03.573227Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:27:03Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a3444c85-3696-4810-a7bb-55473ef7b42b",
  "quote_id": "50a27a20-c974-45a2-8192-5529f959e3d3",
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
  "pickup_at": "2026-10-28T17:27:03Z"
}
```

```json
{
  "id": "6efac6f1-a7fc-46e9-82ed-25304c78cf4a",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:27:03.812811Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:27:03Z",
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
  "command_id": "6c1302c2-2925-4680-a392-a7090bde83f0",
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
  "id": "4a5eb13f-135f-469e-be26-da0381f5a8ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:04.055006Z",
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
  "command_id": "a8bdd681-9c7f-4e3f-8a8f-4a808c9202d8",
  "quote_id": "4a5eb13f-135f-469e-be26-da0381f5a8ff",
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
  "correlation_id": "2f23342c-256b-4fe9-a88a-c37777bcb483"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "6efac6f1-a7fc-46e9-82ed-25304c78cf4a",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T14:27:03.812811Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:27:03Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "2b1b78f0-cf0d-4409-82ad-e79768bc2968",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T14:27:03.323387Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "2b1b78f0-cf0d-4409-82ad-e79768bc2968",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:27:03.323387Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/e8b64473-0c44-41ce-9ee3-527a74888d40` → **200**

```json
{
  "id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cae33df6-c89a-4d6f-b7ab-1fe1368254d8",
    "order_id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ad1b03ac-b827-44db-97f4-77330c5265f3",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:27:02.189707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/e8b64473-0c44-41ce-9ee3-527a74888d40/cancel` → **200**

```json
{
  "command_id": "65c9e452-c3e3-42b3-a618-8593982efc1d",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "cae33df6-c89a-4d6f-b7ab-1fe1368254d8",
    "order_id": "e8b64473-0c44-41ce-9ee3-527a74888d40",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ad1b03ac-b827-44db-97f4-77330c5265f3",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:27:02.189707Z",
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

`GET /api/rider/v1/orders/2b1b78f0-cf0d-4409-82ad-e79768bc2968` → **200**

```json
{
  "id": "2b1b78f0-cf0d-4409-82ad-e79768bc2968",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:27:03.323387Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/2b1b78f0-cf0d-4409-82ad-e79768bc2968/cancel` → **200**

```json
{
  "command_id": "29d50f3a-c577-4b7b-ae1f-26c3e4e3a743",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2b1b78f0-cf0d-4409-82ad-e79768bc2968",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:27:03.323387Z",
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

`GET /api/rider/v1/orders/6efac6f1-a7fc-46e9-82ed-25304c78cf4a` → **200**

```json
{
  "id": "6efac6f1-a7fc-46e9-82ed-25304c78cf4a",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:27:03.812811Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:27:03Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/6efac6f1-a7fc-46e9-82ed-25304c78cf4a/cancel` → **200**

```json
{
  "command_id": "b5b424ed-c08b-4285-a135-6c890836beee",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6efac6f1-a7fc-46e9-82ed-25304c78cf4a",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "969ae6d7-c865-4127-b0b5-9aa2d5c1b771",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:27:03.812811Z",
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
  "pickup_at": "2026-10-28T17:27:03Z",
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
  "session_id": "9bfb0a04-7378-4863-b881-933f7fe1bf18",
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
  "last_heartbeat_at": "2026-10-28T14:27:01.275056Z",
  "last_location_at": "2026-10-28T14:27:01.275056Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9bfb0a04-7378-4863-b881-933f7fe1bf18/close` → **200**

```json
{
  "command_id": "b5ae4d75-0cd3-4a38-8aa2-a252f80dba60",
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

Done: orders e8b64473-0c44-41ce-9ee3-527a74888d40, 2b1b78f0-cf0d-4409-82ad-e79768bc2968, 6efac6f1-a7fc-46e9-82ed-25304c78cf4a.

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
  "session_id": "7e89b5bd-e4e0-4cc6-a749-881ae764c2db",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MjcsImlhdCI6MTc5MzE5NzYyNywianRpIjoiOTY4NzQxZjAtZjI2OC00MTg4LTk0MDItZDE0ODFhNDMwOWVmIiwic2lkIjoiN2U4OWI1YmQtZTRlMC00Y2M2LWE3NDktODgxYWU3NjRjMmRiIn0.Ud0jqHeKwvPP3bonUovhQ4fHOij8Ju0PX4fGPKkdYEs",
  "access_expires_at": "2026-10-28T14:42:07.091481588Z",
  "refresh_token": "2inxQmjdo-DxVCuNR7gcr3hV2xcc9KVs9n-mrXDoQB0",
  "refresh_expires_at": "2026-10-29T02:27:07.090933021Z",
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
  "session_id": "25a43443-88db-4010-98af-79f0a99edc78",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MjcsImlhdCI6MTc5MzE5NzYyNywianRpIjoiMGIxYjgxNjAtYmY5OC00NWVhLTgyN2EtOGQyMjhhOTZkY2Q1Iiwic2lkIjoiMjVhNDM0NDMtODhkYi00MDEwLTk4YWYtNzlmMGE5OWVkYzc4In0.G1mHoA-gWpUiGwlIyySGLVVnSLSCN0sG00YksMngj6s",
  "access_expires_at": "2026-10-28T14:42:07.564065107Z",
  "refresh_token": "TBsRQmfoJZrN0dHHfyTaFeRkVCcopVb9MR7ljGr4HdM",
  "refresh_expires_at": "2026-10-29T02:27:07.563611964Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11389"
}
```

```json
{
  "challenge_id": "d0096e76-e9fc-4546-b7a0-052bfb52b586",
  "expires_at": "2026-10-28T14:32:07.778682041Z",
  "resend_available_at": "2026-10-28T14:27:08.778682041Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "377687",
  "sent_at": "2026-10-28T14:27:07.780874206Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0096e76-e9fc-4546-b7a0-052bfb52b586",
  "code": "377687",
  "device_ref": "sandbox-11389"
}
```

```json
{
  "session_id": "5ab76247-bf8d-4085-a5ae-99bd2abd0e6e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODUyOCwiaWF0IjoxNzkzMTk3NjI4LCJqdGkiOiJiMTEwYmFkOC1mYWM2LTQ5NWUtYjc5Zi0zZTljZWY4YWRmYjAiLCJzaWQiOiI1YWI3NjI0Ny1iZjhkLTQwODUtYTVhZS05OWJkMmFiZDBlNmUifQ.zQok15asaChM2CvDq35dVgO42UGaYfnbl1unSp8_hD4",
  "access_expires_at": "2026-10-28T14:42:08.025182726Z",
  "refresh_token": "F56Lwrbo6cAz97cUFkJ7igqeHN-mniO93qH_hlkZrE8",
  "refresh_expires_at": "2026-11-27T14:27:08.024708421Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:26:48.000348Z",
  "last_location_at": "2026-10-28T14:26:48.000348Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/handover` → **200**

```json
{
  "command_id": "dcadbe3c-9872-42de-99be-9cf83886d88f",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T14:26:48.000348Z",
  "last_location_at": "2026-10-28T14:26:48.000348Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:27:08Z",
    "sequence": 1793197628705
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:27:08.723273Z",
  "last_location_at": "2026-10-28T14:27:08.723273Z",
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
  "command_id": "c6a6cf75-ffc1-427b-a2dd-5495b1e4f5cc",
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
  "effective_at": "2026-10-28T14:27:09.193186Z",
  "changed_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:27:09.422739327Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c5a3e2f0-99eb-4134-b896-ce1832e4c8d4",
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
  "id": "ad47c9e1-cb2e-4f05-8299-c7a862406ca9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:09.677148Z",
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
  "command_id": "8ec4a2a1-6991-4a23-ad5b-a831ef5a153a",
  "quote_id": "ad47c9e1-cb2e-4f05-8299-c7a862406ca9",
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
    "phone": "+3806711121983"
  }
}
```

```json
{
  "id": "6e87dd0e-665e-4c29-922f-4bbf624d7cdd",
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
  "created_at": "2026-10-28T14:27:09.930015Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711121983"
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
    "id": "659721eb-3ad0-46dd-950a-7ab39990074b",
    "order_id": "6e87dd0e-665e-4c29-922f-4bbf624d7cdd",
    "expires_at": "2026-10-28T14:27:24.93402Z",
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

`POST /api/driver/v1/offers/659721eb-3ad0-46dd-950a-7ab39990074b/accept` → **200**

```json
{
  "command_id": "955e76d3-fd92-4422-803d-46e87a624975"
}
```

```json
{
  "id": "631363c5-649d-4c93-8ed3-06cd69fecc16",
  "order_id": "6e87dd0e-665e-4c29-922f-4bbf624d7cdd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ac31a87a-a9c4-4c95-bd5c-3462e6be212a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ac31a87a-a9c4-4c95-bd5c-3462e6be212a",
  "order_id": "6e87dd0e-665e-4c29-922f-4bbf624d7cdd",
  "assignment_id": "631363c5-649d-4c93-8ed3-06cd69fecc16",
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
    "phone": "+3806711121983"
  }
}
```

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:27:10Z",
    "sequence": 1793197630843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T14:27:10.860874Z",
  "last_location_at": "2026-10-28T14:27:10.860874Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ac31a87a-a9c4-4c95-bd5c-3462e6be212a/arrive` → **200**

```json
{
  "command_id": "35027c70-b2e8-451d-8387-46e0cf89be23",
  "expected_version": 0
}
```

```json
{
  "id": "ac31a87a-a9c4-4c95-bd5c-3462e6be212a",
  "order_id": "6e87dd0e-665e-4c29-922f-4bbf624d7cdd",
  "assignment_id": "631363c5-649d-4c93-8ed3-06cd69fecc16",
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
  "arrived_at": "2026-10-28T14:27:11.091789Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121983"
  }
}
```

`POST /api/driver/v1/trips/ac31a87a-a9c4-4c95-bd5c-3462e6be212a/start` → **200**

```json
{
  "command_id": "62336a54-7d0c-4886-a6c2-c0e825247655",
  "expected_version": 1
}
```

```json
{
  "id": "ac31a87a-a9c4-4c95-bd5c-3462e6be212a",
  "order_id": "6e87dd0e-665e-4c29-922f-4bbf624d7cdd",
  "assignment_id": "631363c5-649d-4c93-8ed3-06cd69fecc16",
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
  "arrived_at": "2026-10-28T14:27:11.091789Z",
  "started_at": "2026-10-28T14:27:11.319678Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711121983"
  }
}
```

`POST /api/driver/v1/trips/ac31a87a-a9c4-4c95-bd5c-3462e6be212a/complete` → **200**

```json
{
  "command_id": "d1262836-0604-429c-a43a-da9bf2fe56a1",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:27:11Z",
  "cash_received": true
}
```

```json
{
  "id": "ac31a87a-a9c4-4c95-bd5c-3462e6be212a",
  "order_id": "6e87dd0e-665e-4c29-922f-4bbf624d7cdd",
  "assignment_id": "631363c5-649d-4c93-8ed3-06cd69fecc16",
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
  "arrived_at": "2026-10-28T14:27:11.091789Z",
  "started_at": "2026-10-28T14:27:11.319678Z",
  "completed_at": "2026-10-28T14:27:11.548957Z",
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
  "command_id": "84feee27-224d-422e-98cf-ceb9135a1ddf",
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
  "id": "5adbf832-4c50-4ada-8ad8-3bbf702facd9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:11.783293Z",
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
  "command_id": "38ab0a4f-09d2-4bc9-a011-1bb45d98cf7e",
  "quote_id": "5adbf832-4c50-4ada-8ad8-3bbf702facd9",
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
    "phone": "+380671115521"
  }
}
```

```json
{
  "id": "57f29542-9458-4ef4-9cfc-ff29dd8ca7b6",
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
  "created_at": "2026-10-28T14:27:12.018639Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115521"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/57f29542-9458-4ef4-9cfc-ff29dd8ca7b6` → **200**

```json
{
  "id": "57f29542-9458-4ef4-9cfc-ff29dd8ca7b6",
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
  "created_at": "2026-10-28T14:27:12.018639Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115521"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/57f29542-9458-4ef4-9cfc-ff29dd8ca7b6/cancel` → **200**

```json
{
  "command_id": "f285e590-ecfd-4af9-ab2f-a13b218c476b",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "57f29542-9458-4ef4-9cfc-ff29dd8ca7b6",
  "short_number": 16,
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
  "created_at": "2026-10-28T14:27:12.018639Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115521"
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
  "staff_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:27:11.552796Z",
  "last_entries": [
    {
      "order_id": "57f29542-9458-4ef4-9cfc-ff29dd8ca7b6",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:27:12.501016Z"
    },
    {
      "order_id": "6e87dd0e-665e-4c29-922f-4bbf624d7cdd",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:27:11.552796Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5521b0b0-d55a-425c-81bb-2eb824dcf102",
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
  "last_heartbeat_at": "2026-10-28T14:27:10.860874Z",
  "last_location_at": "2026-10-28T14:27:10.860874Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5521b0b0-d55a-425c-81bb-2eb824dcf102/close` → **200**

```json
{
  "command_id": "bdc7f5bc-f97b-4e87-b51a-dfafed4244cf",
  "expected_version": 2
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

Done: operator bonus for fulfilled 6e87dd0e-665e-4c29-922f-4bbf624d7cdd and operator-fault cancellation 57f29542-9458-4ef4-9cfc-ff29dd8ca7b6.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679609185",
  "device_ref": "sandbox-30296"
}
```

```json
{
  "challenge_id": "2863a4d5-f3d9-455a-a1e7-73c8da1df760",
  "expires_at": "2026-10-28T14:32:15.436437014Z",
  "resend_available_at": "2026-10-28T14:27:16.436437014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679609185` → **200**

```json
{
  "phone": "+380679609185",
  "audience": "CLIENT",
  "code": "615910",
  "sent_at": "2026-10-28T14:27:15.438204472Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675174679",
  "device_ref": "sandbox-19295",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "518e84e9-3cd6-47b3-a90a-14ec934b1cf8",
  "expires_at": "2026-10-28T14:32:15.685013389Z",
  "resend_available_at": "2026-10-28T14:27:16.685013389Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675174679` → **200**

```json
{
  "phone": "+380675174679",
  "audience": "CLIENT",
  "code": "063495",
  "sent_at": "2026-10-28T14:27:15.686936651Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674970000",
  "device_ref": "sandbox-1640"
}
```

```json
{
  "challenge_id": "d31a5b56-2847-445c-a735-019c2290c80a",
  "expires_at": "2026-10-28T14:32:15.927301118Z",
  "resend_available_at": "2026-10-28T14:27:16.927301118Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674970000` → **200**

```json
{
  "phone": "+380674970000",
  "audience": "CLIENT",
  "code": "312484",
  "sent_at": "2026-10-28T14:27:15.929560605Z",
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
  "session_id": "a83a218b-c944-4ad5-a587-c57d7ecd11d9",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MzYsImlhdCI6MTc5MzE5NzYzNiwianRpIjoiNjllZmEwMTQtNDljNS00ODMxLTk0ZTgtMDczYjA2MzZmYWE3Iiwic2lkIjoiYTgzYTIxOGItYzk0NC00YWQ1LWE1ODctYzU3ZDdlY2QxMWQ5In0.sePcEVUFMYV8yE8yNdNpXDaTSnO7XvXUL2WVV7Ai-Po",
  "access_expires_at": "2026-10-28T14:42:16.432737897Z",
  "refresh_token": "rhhmGqzle4gdQqnPLaRxw0oGygbqPefDKdt_fOk2t7w",
  "refresh_expires_at": "2026-10-29T02:27:16.4321884Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674970000` → **200**

```json
{
  "deliveries": [
    {
      "id": "5b1cafd8-4752-40be-8556-882e47140da2",
      "challenge_id": "d31a5b56-2847-445c-a735-019c2290c80a",
      "phone": "+380674970000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-8dd505e3-019c-49d6-b912-1ddaa8407647",
      "error": null,
      "attempted_at": "2026-10-28T14:27:15.929853Z"
    },
    {
      "id": "cd6b3c08-ba93-42ae-b5d6-34d0ebc27d92",
      "challenge_id": "d31a5b56-2847-445c-a735-019c2290c80a",
      "phone": "+380674970000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:27:15.929145Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674970000` → **200**

```json
{
  "phone": "+380674970000",
  "audience": "CLIENT",
  "code": "312484",
  "sent_at": "2026-10-28T14:27:15.929560605Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675174679` → **200**

```json
{
  "deliveries": [
    {
      "id": "bbb3f10c-fb14-4b9d-9230-03c30e8be00b",
      "challenge_id": "518e84e9-3cd6-47b3-a90a-14ec934b1cf8",
      "phone": "+380675174679",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-793265de-3fa5-4471-993d-181fb27f55ab",
      "error": null,
      "attempted_at": "2026-10-28T14:27:15.687181Z"
    }
  ]
}
```

Done: SMS to +380679609185, a call to +380675174679, SMS then a call to +380674970000.

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
  "session_id": "98b33ab7-1409-41fc-a696-892fc8b0d213",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MzcsImlhdCI6MTc5MzE5NzYzNywianRpIjoiYjkxNDI5MzItOGFhYi00YzA0LWI4NjItN2U2YjkzMDgwNjJhIiwic2lkIjoiOThiMzNhYjctMTQwOS00MWZjLWE2OTYtODkyZmM4YjBkMjEzIn0.N2dHF-pbQSHH5C6plFt0TaTT6ZuWxkG3_DiJLks6p5E",
  "access_expires_at": "2026-10-28T14:42:17.401505272Z",
  "refresh_token": "93IvUmeC9Rb-GcpkSv0KRY12_Pv4LJ2a_i5XcCyIDJA",
  "refresh_expires_at": "2026-10-29T02:27:17.401026741Z",
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
  "session_id": "a8d36467-bb7d-421d-94d3-194c7aaa6766",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1MzcsImlhdCI6MTc5MzE5NzYzNywianRpIjoiOTZhYmM3MTMtNDBjZi00MjdmLWIxODYtMjU1NDgyMWI2MzMxIiwic2lkIjoiYThkMzY0NjctYmI3ZC00MjFkLTk0ZDMtMTk0YzdhYWE2NzY2In0.wnU9pIeqiHgeZ_tXvr2KRCIPP8uhtfoa36Tr7x8T5Hc",
  "access_expires_at": "2026-10-28T14:42:17.881605815Z",
  "refresh_token": "iVczViP1vwaeTM6MRdxbkGTP0_DOt9eiP7_aIienzmg",
  "refresh_expires_at": "2026-10-29T02:27:17.881153243Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
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

`POST /api/admin/v1/staff-extensions/693c4fe4-c089-4555-bf36-8bbbae505cc9` → **200**

```json
{
  "command_id": "2a33f858-f073-4341-a34d-606677e07cc7",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "37b3a299-e188-48b0-a354-3de095ceca62",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:27:18.913512Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:27:18.913512Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "02e334fe-dd7e-476d-ab1f-e7d38b819ad6",
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
  "id": "5f53a99c-cd97-4c52-b286-a33f7e1eab6f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:19.366895Z",
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
  "command_id": "42033fb5-8e0b-4b5e-9f08-6daced2205de",
  "quote_id": "5f53a99c-cd97-4c52-b286-a33f7e1eab6f",
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
    "phone": "+380679891426"
  }
}
```

```json
{
  "id": "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d",
  "short_number": 17,
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
  "created_at": "2026-10-28T14:27:19.60257Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679891426"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/cd9a8454-41c2-4ec1-bfb3-9ed293fa266d/calls` → **201**

```json
{
  "command_id": "75702e80-fdbe-457f-855f-3410416d541f",
  "to": "CALLER"
}
```

```json
{
  "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "order_ids": [
    "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d"
  ],
  "started_at": "2026-10-28T14:27:19.858394Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/cd9a8454-41c2-4ec1-bfb3-9ed293fa266d/calls` → **201**

```json
{
  "command_id": "75702e80-fdbe-457f-855f-3410416d541f",
  "to": "CALLER"
}
```

```json
{
  "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "order_ids": [
    "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d"
  ],
  "started_at": "2026-10-28T14:27:19.858394Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "180d7357-6853-4460-98b1-1b4a01514a9d",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679891426",
    "at": "2026-10-28T14:27:19.86023246Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.26741",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "180d7357-6853-4460-98b1-1b4a01514a9d"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=cd9a8454-41c2-4ec1-bfb3-9ed293fa266d` → **200**

```json
{
  "calls": [
    {
      "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [
        "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d"
      ],
      "started_at": "2026-10-28T14:27:19.858394Z",
      "answered_at": "2026-10-28T14:27:20.388178Z",
      "ended_at": "2026-10-28T14:27:20.409405Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=cd9a8454-41c2-4ec1-bfb3-9ed293fa266d` → **200**

```json
{
  "calls": [
    {
      "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [
        "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d"
      ],
      "started_at": "2026-10-28T14:27:19.858394Z",
      "answered_at": "2026-10-28T14:27:20.388178Z",
      "ended_at": "2026-10-28T14:27:20.409405Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=cd9a8454-41c2-4ec1-bfb3-9ed293fa266d` → **200**

```json
{
  "calls": [
    {
      "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [
        "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d"
      ],
      "started_at": "2026-10-28T14:27:19.858394Z",
      "answered_at": "2026-10-28T14:27:20.388178Z",
      "ended_at": "2026-10-28T14:27:20.409405Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=cd9a8454-41c2-4ec1-bfb3-9ed293fa266d` → **200**

```json
{
  "calls": [
    {
      "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [
        "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d"
      ],
      "started_at": "2026-10-28T14:27:19.858394Z",
      "answered_at": "2026-10-28T14:27:20.388178Z",
      "ended_at": "2026-10-28T14:27:20.409405Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=cd9a8454-41c2-4ec1-bfb3-9ed293fa266d` → **200**

```json
{
  "calls": [
    {
      "id": "180d7357-6853-4460-98b1-1b4a01514a9d",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "order_ids": [
        "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d"
      ],
      "started_at": "2026-10-28T14:27:19.858394Z",
      "answered_at": "2026-10-28T14:27:20.388178Z",
      "ended_at": "2026-10-28T14:27:20.409405Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:27:27.783737Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/cd9a8454-41c2-4ec1-bfb3-9ed293fa266d` → **200**

```json
{
  "id": "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d",
  "short_number": 17,
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
  "created_at": "2026-10-28T14:27:19.60257Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679891426"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cd9a8454-41c2-4ec1-bfb3-9ed293fa266d/cancel` → **200**

```json
{
  "command_id": "3edafd4c-e1fe-4e50-b43a-bd2218d491fa",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "cd9a8454-41c2-4ec1-bfb3-9ed293fa266d",
  "short_number": 17,
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
  "created_at": "2026-10-28T14:27:19.60257Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679891426"
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
  "command_id": "c6cdcbac-e793-4a6a-bff9-633103d1f2d0",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:27:30.085486Z",
  "extension": "101"
}
```

Done: outgoing call 180d7357-6853-4460-98b1-1b4a01514a9d from order cd9a8454-41c2-4ec1-bfb3-9ed293fa266d, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631671042",
  "device_ref": "sandbox-2325"
}
```

```json
{
  "challenge_id": "05889222-1273-4f8a-ba52-c508aeea3880",
  "expires_at": "2026-10-28T14:32:30.324658109Z",
  "resend_available_at": "2026-10-28T14:27:31.324658109Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631671042` → **200**

```json
{
  "phone": "+380631671042",
  "audience": "CLIENT",
  "code": "311032",
  "sent_at": "2026-10-28T14:27:30.326427762Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05889222-1273-4f8a-ba52-c508aeea3880",
  "code": "311032",
  "device_ref": "sandbox-2325"
}
```

```json
{
  "session_id": "02fbc3e0-2c48-41d2-9130-c52650cf4a95",
  "subject": {
    "type": "CLIENT",
    "id": "6b473bdb-5b48-4386-90c2-982f89638cfc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjQ3M2JkYi01YjQ4LTQzODYtOTBjMi05ODJmODk2MzhjZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTUwLCJpYXQiOjE3OTMxOTc2NTAsImp0aSI6Ijk4NGE0ZWRkLTkyY2UtNDA4YS05YTllLWYwMDQzYWMyZGQxMiIsInNpZCI6IjAyZmJjM2UwLTJjNDgtNDFkMi05MTMwLWM1MjY1MGNmNGE5NSJ9.T4vXFkwhJbtCjQWnZ2sy0RKGBH8phCzj1AEx2QAEnZU",
  "access_expires_at": "2026-10-28T14:42:30.573189013Z",
  "refresh_token": "G7ct6vXpBKSzRXi3x23L9bpzYx4IQft9DsLH5R83xH8",
  "refresh_expires_at": "2026-11-27T14:27:30.572714622Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b473bdb-5b48-4386-90c2-982f89638cfc",
  "session_id": "02fbc3e0-2c48-41d2-9130-c52650cf4a95",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631671042",
  "device_ref": "sandbox-6738"
}
```

```json
{
  "challenge_id": "b519089a-0233-4f8c-a7eb-302aaf52c6c1",
  "expires_at": "2026-10-28T14:32:33.013708653Z",
  "resend_available_at": "2026-10-28T14:27:34.013708653Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631671042` → **200**

```json
{
  "phone": "+380631671042",
  "audience": "CLIENT",
  "code": "698856",
  "sent_at": "2026-10-28T14:27:33.015253899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b519089a-0233-4f8c-a7eb-302aaf52c6c1",
  "code": "698856",
  "device_ref": "sandbox-6738"
}
```

```json
{
  "session_id": "690de8a2-a5b1-445f-8a00-078a31abeedb",
  "subject": {
    "type": "CLIENT",
    "id": "6b473bdb-5b48-4386-90c2-982f89638cfc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjQ3M2JkYi01YjQ4LTQzODYtOTBjMi05ODJmODk2MzhjZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTUzLCJpYXQiOjE3OTMxOTc2NTMsImp0aSI6IjIzMGVmOTk4LThhYWUtNDE0MS1hZGRhLTdiNzE3M2I0OWI2NCIsInNpZCI6IjY5MGRlOGEyLWE1YjEtNDQ1Zi04YTAwLTA3OGEzMWFiZWVkYiJ9.nxRi1tygG4ey1WRPtdba_jWGMM_9zUQPqSOWohdUaOg",
  "access_expires_at": "2026-10-28T14:42:33.259371396Z",
  "refresh_token": "qamN8adrWtaqmWOHYpfhDlegWrBizUV9Ma_PRzKWlJY",
  "refresh_expires_at": "2026-11-27T14:27:33.258899044Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "aaa3df03-4d99-4e34-9d65-0cb59e65d701",
  "expires_at": "2026-10-28T14:32:35.48433268Z",
  "resend_available_at": "2026-10-28T14:27:36.48433268Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631671042` → **200**

```json
{
  "phone": "+380631671042",
  "audience": "CLIENT",
  "code": "540435",
  "sent_at": "2026-10-28T14:27:35.485902025Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639302543"
}
```

```json
{
  "challenge_id": "3828d23a-7777-4f80-8fe7-795892a8c1f0",
  "expires_at": "2026-10-28T14:32:35.721584734Z",
  "resend_available_at": "2026-10-28T14:27:36.721584734Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639302543` → **200**

```json
{
  "phone": "+380639302543",
  "audience": "CLIENT",
  "code": "815809",
  "sent_at": "2026-10-28T14:27:35.723049346Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "882614ba-203d-45f7-8c4a-ebcacfde08d4",
  "current_challenge_id": "aaa3df03-4d99-4e34-9d65-0cb59e65d701",
  "current_code": "000000",
  "new_challenge_id": "3828d23a-7777-4f80-8fe7-795892a8c1f0",
  "new_code": "815809"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "57b99195-5a43-4700-a72a-f747f8124e74"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "9bbff1fc-1f68-4d33-9ff5-09122abad861",
  "current_challenge_id": "aaa3df03-4d99-4e34-9d65-0cb59e65d701",
  "current_code": "540435",
  "new_challenge_id": "3828d23a-7777-4f80-8fe7-795892a8c1f0",
  "new_code": "815809"
}
```

```json
{
  "subject_id": "6b473bdb-5b48-4386-90c2-982f89638cfc",
  "phone": "+380639302543",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b473bdb-5b48-4386-90c2-982f89638cfc",
  "session_id": "02fbc3e0-2c48-41d2-9130-c52650cf4a95",
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
  "correlation_id": "08e2cba5-ecda-4944-9c0b-d9eddd1a50e9"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639302543",
  "device_ref": "sandbox-23931"
}
```

```json
{
  "challenge_id": "780ac679-c152-4ea9-9101-9639016fbd9e",
  "expires_at": "2026-10-28T14:32:38.85029187Z",
  "resend_available_at": "2026-10-28T14:27:39.85029187Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639302543` → **200**

```json
{
  "phone": "+380639302543",
  "audience": "CLIENT",
  "code": "568270",
  "sent_at": "2026-10-28T14:27:38.852037897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "780ac679-c152-4ea9-9101-9639016fbd9e",
  "code": "568270",
  "device_ref": "sandbox-23931"
}
```

```json
{
  "session_id": "2b995b10-50d3-45a5-b787-585032eb838d",
  "subject": {
    "type": "CLIENT",
    "id": "6b473bdb-5b48-4386-90c2-982f89638cfc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjQ3M2JkYi01YjQ4LTQzODYtOTBjMi05ODJmODk2MzhjZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTU5LCJpYXQiOjE3OTMxOTc2NTksImp0aSI6IjNiODQ3NzA5LWY3MTYtNDhhNi1iYzY1LWNhNDQ2MjhjMmJjMSIsInNpZCI6IjJiOTk1YjEwLTUwZDMtNDVhNS1iNzg3LTU4NTAzMmViODM4ZCJ9.FUWj-uDDD953QP0Bjmhdm-SZy-p-Tiy_OhPbQp0i_ng",
  "access_expires_at": "2026-10-28T14:42:39.09070213Z",
  "refresh_token": "a2iQZRPDAN_-HMim1QVy28nkFaDl3YdNhxDGRBOZOIc",
  "refresh_expires_at": "2026-11-27T14:27:39.090288408Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b473bdb-5b48-4386-90c2-982f89638cfc",
  "session_id": "2b995b10-50d3-45a5-b787-585032eb838d",
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
  "session_id": "3cc0565c-ddf2-4d37-aed5-de0d8349e66f",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1NTksImlhdCI6MTc5MzE5NzY1OSwianRpIjoiMTI3NzUxMDAtZGVhYi00N2RmLThhMTQtYzcyMTJiZGQyMzhlIiwic2lkIjoiM2NjMDU2NWMtZGRmMi00ZDM3LWFlZDUtZGUwZDgzNDllNjZmIn0.j-uzZ2GIMfzm6A0rYnxG86eSugknnPK6Swk3_EICvsg",
  "access_expires_at": "2026-10-28T14:42:39.79896568Z",
  "refresh_token": "dMDK-0TmkZw44zjiUTqEZTT2o1pTKoeqfloxmIQdwCg",
  "refresh_expires_at": "2026-10-29T02:27:39.798563795Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/6b473bdb-5b48-4386-90c2-982f89638cfc` → **200**

```json
{
  "client": {
    "id": "6b473bdb-5b48-4386-90c2-982f89638cfc",
    "phone": "+380639302543",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:27:30.571096Z",
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

`POST /api/admin/v1/clients/6b473bdb-5b48-4386-90c2-982f89638cfc/phone` → **400**

```json
{
  "command_id": "42ade6bd-a7fd-4bd1-8ea2-5f68e5ea83cd",
  "expected_version": 3,
  "phone": "+380630212843",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/6b473bdb-5b48-4386-90c2-982f89638cfc/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "af57d64d-3bdb-4834-bda4-e682d79ef929",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/6b473bdb-5b48-4386-90c2-982f89638cfc/phone` → **200**

```json
{
  "command_id": "1ac4414b-71ea-4c66-af8d-db071c241a65",
  "expected_version": 3,
  "phone": "+380630212843",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "6b473bdb-5b48-4386-90c2-982f89638cfc",
  "phone": "+380630212843",
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
  "correlation_id": "916935c2-43a7-4137-8e3d-3f263a306e2d"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630212843",
  "device_ref": "sandbox-30704"
}
```

```json
{
  "challenge_id": "f67261e3-63a2-4835-9ce1-aecf0b392e93",
  "expires_at": "2026-10-28T14:32:40.924715545Z",
  "resend_available_at": "2026-10-28T14:27:41.924715545Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630212843` → **200**

```json
{
  "phone": "+380630212843",
  "audience": "CLIENT",
  "code": "797309",
  "sent_at": "2026-10-28T14:27:40.926564667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f67261e3-63a2-4835-9ce1-aecf0b392e93",
  "code": "797309",
  "device_ref": "sandbox-30704"
}
```

```json
{
  "session_id": "fe1cbf35-b1eb-4648-a350-2bb0fcacd090",
  "subject": {
    "type": "CLIENT",
    "id": "6b473bdb-5b48-4386-90c2-982f89638cfc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjQ3M2JkYi01YjQ4LTQzODYtOTBjMi05ODJmODk2MzhjZmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTYxLCJpYXQiOjE3OTMxOTc2NjEsImp0aSI6IjdiMDAxZmEzLTM2YWQtNGQxOC04MDY2LThmOGVhMzA2ODkxOSIsInNpZCI6ImZlMWNiZjM1LWIxZWItNDY0OC1hMzUwLTJiYjBmY2FjZDA5MCJ9.GNAC98JZPH3bjNkcxstyZQ912A3XV6vyL7S8XGeSvjk",
  "access_expires_at": "2026-10-28T14:42:41.171021926Z",
  "refresh_token": "gqWUWjy4FiZxTlSb4HgOROzuN8DNHquKBOH8TP3SEzo",
  "refresh_expires_at": "2026-11-27T14:27:41.170521007Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6b473bdb-5b48-4386-90c2-982f89638cfc",
  "session_id": "fe1cbf35-b1eb-4648-a350-2bb0fcacd090",
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
  "phone": "+380632265734",
  "device_ref": "sandbox-21879"
}
```

```json
{
  "challenge_id": "20f66d0a-430d-4db1-a10d-3a47ac4aed29",
  "expires_at": "2026-10-28T14:32:41.614789183Z",
  "resend_available_at": "2026-10-28T14:27:42.614789183Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632265734` → **200**

```json
{
  "phone": "+380632265734",
  "audience": "CLIENT",
  "code": "986764",
  "sent_at": "2026-10-28T14:27:41.616725646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20f66d0a-430d-4db1-a10d-3a47ac4aed29",
  "code": "986764",
  "device_ref": "sandbox-21879"
}
```

```json
{
  "session_id": "261a8225-c686-4088-be04-2bd128d2f7c2",
  "subject": {
    "type": "CLIENT",
    "id": "a42446c6-597c-473a-b6ef-f158bd270978"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDI0NDZjNi01OTdjLTQ3M2EtYjZlZi1mMTU4YmQyNzA5NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTYxLCJpYXQiOjE3OTMxOTc2NjEsImp0aSI6ImY5NjA4YmU0LTU2NDMtNDNjNS1hMzZlLWJiMGUzYzZkNzZhZSIsInNpZCI6IjI2MWE4MjI1LWM2ODYtNDA4OC1iZTA0LTJiZDEyOGQyZjdjMiJ9.SwNhqJ6xoQaJdgT_JSxpyYg5sX1cq6UeEe3JzM6aglM",
  "access_expires_at": "2026-10-28T14:42:41.881094007Z",
  "refresh_token": "uhoensWQVhNBqqx5PGqiM_KGiwELYpbpZ8qQhBAL1OI",
  "refresh_expires_at": "2026-11-27T14:27:41.880623424Z",
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
  "session_id": "9bdba29d-f775-4c4f-b396-e4e6abc62ccb",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1NjIsImlhdCI6MTc5MzE5NzY2MiwianRpIjoiNWUwYTEyNGMtYzU0ZS00NGE5LTgwOTEtNGU1ZDM4MDg1MzFmIiwic2lkIjoiOWJkYmEyOWQtZjc3NS00YzRmLWIzOTYtZTRlNmFiYzYyY2NiIn0.As-PironuoLmZKm4XZiZ_5wEkrsYcew-njP2ICiRnU8",
  "access_expires_at": "2026-10-28T14:42:42.805556749Z",
  "refresh_token": "48d01WEiN1Oe7_0LKf30UTKp0GYniIUFG7aD6E-CxXk",
  "refresh_expires_at": "2026-10-29T02:27:42.805121094Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632265734` → **200**

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
  "correlation_id": "616ef3df-653e-4bc2-a754-3dc3cc82a4fb"
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
  "session_id": "ba56bef2-e231-4c52-80aa-bd5b26b0668a",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1NjMsImlhdCI6MTc5MzE5NzY2MywianRpIjoiYzdjNzYyMTItN2EzMi00Y2JlLTkyOWEtNmJjNThhYTYxOTcwIiwic2lkIjoiYmE1NmJlZjItZTIzMS00YzUyLTgwYWEtYmQ1YjI2YjA2NjhhIn0.K0VBIgyUMiQ1uF42tJRgHIab4S2YEqkzHBM_Vj3mFmw",
  "access_expires_at": "2026-10-28T14:42:43.723272913Z",
  "refresh_token": "fPgolFsnUA-nzopR-xZWhZVZI5tl2GbBBici7TAHbzw",
  "refresh_expires_at": "2026-10-29T02:27:43.722866291Z",
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
  "changed_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T14:25:07.899573Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e6bedd39-85b4-483d-8eba-8c23f0aad5a6",
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
  "changed_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T14:27:44.194842593Z"
}
```

## The rider books the airport for 2026-10-28T17:27:43Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600825046",
  "device_ref": "sandbox-27845"
}
```

```json
{
  "challenge_id": "c6ce4bdb-9537-41ad-b893-a568d025edb7",
  "expires_at": "2026-10-28T14:32:44.434746103Z",
  "resend_available_at": "2026-10-28T14:27:45.434746103Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600825046` → **200**

```json
{
  "phone": "+48600825046",
  "audience": "CLIENT",
  "code": "605731",
  "sent_at": "2026-10-28T14:27:44.436402839Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6ce4bdb-9537-41ad-b893-a568d025edb7",
  "code": "605731",
  "device_ref": "sandbox-27845"
}
```

```json
{
  "session_id": "595e0d55-81f5-4a58-a34a-8d78e78ce075",
  "subject": {
    "type": "CLIENT",
    "id": "9afc82a9-0baf-486b-94b9-5578fa3613f2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YWZjODJhOS0wYmFmLTQ4NmItOTRiOS01NTc4ZmEzNjEzZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTY0LCJpYXQiOjE3OTMxOTc2NjQsImp0aSI6ImU1NDFjODFlLWJjMzUtNDYzNy1iMWM2LTg1NzIxYzg4ZWVjYSIsInNpZCI6IjU5NWUwZDU1LTgxZjUtNGE1OC1hMzRhLThkNzhlNzhjZTA3NSJ9.QEaff5j2qV9Tfhun_Jr76TzwvHlKDmXnOWLUmBaEtd0",
  "access_expires_at": "2026-10-28T14:42:44.680442325Z",
  "refresh_token": "CLKvMLeorbyjJWRH-pFvX6u2VJW5DmI-xhrL3XSQdYY",
  "refresh_expires_at": "2026-11-27T14:27:44.679978606Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "40e95648-c52b-4a84-a7ec-a5e2c80be1e4",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T17:27:43Z"
}
```

```json
{
  "id": "eec29af2-12db-4ff7-b59c-650c630ad87c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:44.899919Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:27:43Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "acbf27ba-d199-42d7-9671-6f4675a2e23a",
  "quote_id": "eec29af2-12db-4ff7-b59c-650c630ad87c",
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
  "pickup_at": "2026-10-28T17:27:43Z"
}
```

```json
{
  "id": "1ea776e5-f15d-4683-8951-e17eb8749db2",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9afc82a9-0baf-486b-94b9-5578fa3613f2",
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
  "created_at": "2026-10-28T14:27:45.12305Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:27:43Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-28556"
}
```

```json
{
  "challenge_id": "c2b25dd3-8471-4dcb-a5a7-b4319da8efc4",
  "expires_at": "2026-10-28T14:32:45.353351464Z",
  "resend_available_at": "2026-10-28T14:27:46.353351464Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "107620",
  "sent_at": "2026-10-28T14:27:45.355468013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2b25dd3-8471-4dcb-a5a7-b4319da8efc4",
  "code": "107620",
  "device_ref": "sandbox-28556"
}
```

```json
{
  "session_id": "85d1332b-2462-457b-ab26-9900c8e2d7a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODU2NSwiaWF0IjoxNzkzMTk3NjY1LCJqdGkiOiI4M2E1ZTc1MS00NGViLTQzZTQtOGE3NS03YjBiM2VjNDMzNzEiLCJzaWQiOiI4NWQxMzMyYi0yNDYyLTQ1N2ItYWIyNi05OTAwYzhlMmQ3YTkifQ.XcrDVE2gKt_PNw1d1xqibhdAhvYbQ6hubP9IuxGOTyM",
  "access_expires_at": "2026-10-28T14:42:45.594139266Z",
  "refresh_token": "FrGAoZ2RJrPN9zxjZFDZvVpS1kKiV-3W-7tEsoSbp8w",
  "refresh_expires_at": "2026-11-27T14:27:45.593689879Z",
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
  "command_id": "c29644e6-fee7-4504-b2cd-1c111002cae3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:27:46Z",
    "sequence": 1793197666184
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "12141fc6-1c47-4d93-abd5-189ffee9a828",
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
  "last_heartbeat_at": "2026-10-28T14:27:46.034774Z",
  "last_location_at": "2026-10-28T14:27:46.034774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "1ea776e5-f15d-4683-8951-e17eb8749db2",
      "short_number": 18,
      "pickup_at": "2026-10-28T17:27:43Z",
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

`POST /api/driver/v1/preorders/1ea776e5-f15d-4683-8951-e17eb8749db2/reserve` → **200**

```json
{
  "command_id": "7abbc5db-6037-4999-96ec-fdd673bd6c61"
}
```

```json
{
  "id": "1b9e835e-97d1-44e7-b11e-117ce7dcd090",
  "state": "RESERVED",
  "order": {
    "order_id": "1ea776e5-f15d-4683-8951-e17eb8749db2",
    "short_number": 18,
    "pickup_at": "2026-10-28T17:27:43Z",
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
  "reserved_at": "2026-10-28T14:27:46.467806Z",
  "confirm_from": "2026-10-28T16:57:43Z",
  "confirm_until": "2026-10-28T17:07:43Z",
  "drop_until": "2026-10-28T16:27:43Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "1b9e835e-97d1-44e7-b11e-117ce7dcd090",
      "state": "RESERVED",
      "order": {
        "order_id": "1ea776e5-f15d-4683-8951-e17eb8749db2",
        "short_number": 18,
        "pickup_at": "2026-10-28T17:27:43Z",
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
      "reserved_at": "2026-10-28T14:27:46.467806Z",
      "confirm_from": "2026-10-28T16:57:43Z",
      "confirm_until": "2026-10-28T17:07:43Z",
      "drop_until": "2026-10-28T16:27:43Z"
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
      "id": "1b9e835e-97d1-44e7-b11e-117ce7dcd090",
      "state": "RESERVED",
      "order": {
        "order_id": "1ea776e5-f15d-4683-8951-e17eb8749db2",
        "short_number": 18,
        "pickup_at": "2026-10-28T17:27:43Z",
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
      "reserved_at": "2026-10-28T14:27:46.467806Z",
      "confirm_from": "2026-10-28T16:57:43Z",
      "confirm_until": "2026-10-28T17:07:43Z",
      "drop_until": "2026-10-28T16:27:43Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/1b9e835e-97d1-44e7-b11e-117ce7dcd090/confirm` → **409**

```json
{
  "command_id": "6140b27c-d73a-43a9-ac62-16ecce3938f4"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/1b9e835e-97d1-44e7-b11e-117ce7dcd090/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dfb95369-087b-4a7f-96e3-ad96bc20eaa1"
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
  "session_id": "5ba0f2e1-671e-4456-a567-593e4b9ae31d",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1NjcsImlhdCI6MTc5MzE5NzY2NywianRpIjoiZDQ2MzVhNjEtMjlkNS00OWQwLWIzYzMtYmJjNTAyN2NmMjE3Iiwic2lkIjoiNWJhMGYyZTEtNjcxZS00NDU2LWE1NjctNTkzZTRiOWFlMzFkIn0.27sij3z1sT-kKyRhDT9Uw55fLQEEj-I0G81nNNXWbKA",
  "access_expires_at": "2026-10-28T14:42:47.603292806Z",
  "refresh_token": "wiV3iXNNarOXeVeWHKTAbkRwn8250iNLgQSteH-BHm4",
  "refresh_expires_at": "2026-10-29T02:27:47.602648586Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1ea776e5-f15d-4683-8951-e17eb8749db2` → **200**

```json
{
  "id": "1ea776e5-f15d-4683-8951-e17eb8749db2",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9afc82a9-0baf-486b-94b9-5578fa3613f2",
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
  "created_at": "2026-10-28T14:27:45.12305Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T17:27:43Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "1b9e835e-97d1-44e7-b11e-117ce7dcd090",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T14:27:46.467806Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/1ea776e5-f15d-4683-8951-e17eb8749db2/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T14:27:45.123861Z",
      "actor": {
        "type": "CLIENT",
        "id": "9afc82a9-0baf-486b-94b9-5578fa3613f2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "1ea776e5-f15d-4683-8951-e17eb8749db2",
        "preorder": true,
        "quote_id": "eec29af2-12db-4ff7-b59c-650c630ad87c",
        "pickup_at": "2026-10-28T17:27:43Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "98bde4d4-d036-44f3-ac88-5fe5bcff6cb4"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T14:27:46.468742Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1ea776e5-f15d-4683-8951-e17eb8749db2",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "1b9e835e-97d1-44e7-b11e-117ce7dcd090"
      },
      "correlation_id": "f8ed405d-08bc-4663-9c34-ab0534aa2959"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 1ea776e5-f15d-4683-8951-e17eb8749db2, reservation 1b9e835e-97d1-44e7-b11e-117ce7dcd090.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25215"
}
```

```json
{
  "challenge_id": "8e14d61c-6e0e-485f-b717-2329eaa116f8",
  "expires_at": "2026-10-28T14:32:48.271283627Z",
  "resend_available_at": "2026-10-28T14:27:49.271283627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "642288",
  "sent_at": "2026-10-28T14:27:48.273210022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e14d61c-6e0e-485f-b717-2329eaa116f8",
  "code": "642288",
  "device_ref": "sandbox-25215"
}
```

```json
{
  "session_id": "d6540fac-d082-4502-a8d7-d52752963c15",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODU2OCwiaWF0IjoxNzkzMTk3NjY4LCJqdGkiOiJmNzc5MGNiOS0wMmZiLTQxMmQtODZlMi1mNTQwYzgxNWY5NTEiLCJzaWQiOiJkNjU0MGZhYy1kMDgyLTQ1MDItYThkNy1kNTI3NTI5NjNjMTUifQ.teQTFymENoDoxUPI2gxSdt1pYZrK94dT9O2v8uPMS4o",
  "access_expires_at": "2026-10-28T14:42:48.505271357Z",
  "refresh_token": "_on-fFuhD4BITtREsDjB9WlQtAOj4GxAa62__PieGN8",
  "refresh_expires_at": "2026-11-27T14:27:48.504773527Z",
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
  "command_id": "777ea073-8eb3-47a9-b734-d4252a94816a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:27:48Z",
    "sequence": 1793197668930
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee7a870b-e259-4902-9531-4845422d4e1f",
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
  "last_heartbeat_at": "2026-10-28T14:27:48.946964Z",
  "last_location_at": "2026-10-28T14:27:48.946964Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676723463",
  "device_ref": "sandbox-16493"
}
```

```json
{
  "challenge_id": "7c3eea57-8688-473c-bb6b-7c1971c9b0df",
  "expires_at": "2026-10-28T14:32:49.164182382Z",
  "resend_available_at": "2026-10-28T14:27:50.164182382Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676723463` → **200**

```json
{
  "phone": "+380676723463",
  "audience": "CLIENT",
  "code": "779777",
  "sent_at": "2026-10-28T14:27:49.165852506Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c3eea57-8688-473c-bb6b-7c1971c9b0df",
  "code": "779777",
  "device_ref": "sandbox-16493"
}
```

```json
{
  "session_id": "8806d1a4-9864-4376-9990-ec3750303058",
  "subject": {
    "type": "CLIENT",
    "id": "c677d234-f9f4-44d1-8595-e12d460961f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjc3ZDIzNC1mOWY0LTQ0ZDEtODU5NS1lMTJkNDYwOTYxZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTY5LCJpYXQiOjE3OTMxOTc2NjksImp0aSI6Ijg5NGJkNjgyLTQ4YmEtNGQzMS1hZWQwLTkwOTIwYjhkODY2NiIsInNpZCI6Ijg4MDZkMWE0LTk4NjQtNDM3Ni05OTkwLWVjMzc1MDMwMzA1OCJ9.fqK7So0LP68WTf6n1fyYEuognoXYHG52lP4wqAzEcjM",
  "access_expires_at": "2026-10-28T14:42:49.413967337Z",
  "refresh_token": "EZSymyE9RhCFgWFHCv0IFpeJNmUrdHtskHMMsz34tME",
  "refresh_expires_at": "2026-11-27T14:27:49.413548201Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "491f92c8-0d19-4fa9-adb4-b7e582195b7f",
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
  "id": "441d6dd1-0e14-4a6a-8d68-02f3dc0d318d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:32:49.636254Z",
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
  "command_id": "51ff50b8-a646-48cd-8737-cfe006288e13",
  "quote_id": "441d6dd1-0e14-4a6a-8d68-02f3dc0d318d",
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
  "id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c677d234-f9f4-44d1-8595-e12d460961f6",
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
  "created_at": "2026-10-28T14:27:49.857298Z",
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
    "id": "b567bbde-622d-4889-b6ca-ac04e62d6dcc",
    "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
    "expires_at": "2026-10-28T14:28:04.859391Z",
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

`POST /api/driver/v1/offers/b567bbde-622d-4889-b6ca-ac04e62d6dcc/accept` → **200**

```json
{
  "command_id": "cee1fa8a-d340-45d0-b2fa-179b7f08cf94"
}
```

```json
{
  "id": "de200d0f-ca67-4407-a59e-a31872fe5eb0",
  "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb",
  "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "assignment_id": "de200d0f-ca67-4407-a59e-a31872fe5eb0",
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

`POST /api/driver/v1/work-sessions/ee7a870b-e259-4902-9531-4845422d4e1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:27:50Z",
    "sequence": 1793197670851
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee7a870b-e259-4902-9531-4845422d4e1f",
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
  "last_heartbeat_at": "2026-10-28T14:27:50.867499Z",
  "last_location_at": "2026-10-28T14:27:50.867499Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb",
  "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "assignment_id": "de200d0f-ca67-4407-a59e-a31872fe5eb0",
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

`POST /api/driver/v1/trips/a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb/arrive` → **200**

```json
{
  "command_id": "6840d96b-7413-404c-b9ed-e1eeab434f70",
  "expected_version": 0
}
```

```json
{
  "id": "a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb",
  "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "assignment_id": "de200d0f-ca67-4407-a59e-a31872fe5eb0",
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
  "arrived_at": "2026-10-28T14:27:51.292564Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb/start` → **200**

```json
{
  "command_id": "3c753fd9-5879-4671-9bd2-794529ab6937",
  "expected_version": 1
}
```

```json
{
  "id": "a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb",
  "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "assignment_id": "de200d0f-ca67-4407-a59e-a31872fe5eb0",
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
  "arrived_at": "2026-10-28T14:27:51.292564Z",
  "started_at": "2026-10-28T14:27:51.545704Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/ee7a870b-e259-4902-9531-4845422d4e1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:27:51Z",
    "sequence": 1793197671902
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee7a870b-e259-4902-9531-4845422d4e1f",
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
  "last_heartbeat_at": "2026-10-28T14:27:51.918116Z",
  "last_location_at": "2026-10-28T14:27:51.918116Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb/complete` → **200**

```json
{
  "command_id": "93f9ead0-8c9c-46b7-98e0-3ac185ee30b5",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:27:52Z",
  "cash_received": true
}
```

```json
{
  "id": "a1cf8c7c-85c4-47e6-aaac-14dc6b6e1adb",
  "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "assignment_id": "de200d0f-ca67-4407-a59e-a31872fe5eb0",
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
  "arrived_at": "2026-10-28T14:27:51.292564Z",
  "started_at": "2026-10-28T14:27:51.545704Z",
  "completed_at": "2026-10-28T14:27:52.130549Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f2d1e04d-d785-47fb-b151-9c92d2099329/rating` → **200**

```json
{
  "command_id": "4f29999c-34d8-4fab-8c15-d70c376193a8",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "score": 5,
  "created_at": "2026-10-28T14:27:52.363873525Z"
}
```

`POST /api/driver/v1/orders/f2d1e04d-d785-47fb-b151-9c92d2099329/rating` → **200**

```json
{
  "command_id": "1d2a7581-b9b8-4a8e-bb8a-8cad5effbeef",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
  "score": 4,
  "created_at": "2026-10-28T14:27:52.583779188Z"
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
  "session_id": "3cdc7b43-8464-4978-94c6-57d4d6e8cf98",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1NzMsImlhdCI6MTc5MzE5NzY3MywianRpIjoiNTI0ZWMwNTUtNWRhMi00MTk1LWJmYzYtOWI1N2Q4MjAyNTIzIiwic2lkIjoiM2NkYzdiNDMtODQ2NC00OTc4LTk0YzYtNTdkNGQ2ZThjZjk4In0.P9UM_I6_mVyI6dIewgYQ32ZobGkDL2ZDCvauV4Hvryw",
  "access_expires_at": "2026-10-28T14:42:53.292586939Z",
  "refresh_token": "tAejUajw2yN4LDUx2Fv5XHCU2wXHFj5AXsAhLtqgwEc",
  "refresh_expires_at": "2026-10-29T02:27:53.292093847Z",
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
  "session_id": "0d077026-e9f4-4bc4-990f-86e832cb6063",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1NzMsImlhdCI6MTc5MzE5NzY3MywianRpIjoiY2E1YmVkOTUtMGY1My00ZGU5LWIyNGUtNGYxMjljNjc1MWNjIiwic2lkIjoiMGQwNzcwMjYtZTlmNC00YmM0LTk5MGYtODZlODMyY2I2MDYzIn0.UwJF3RUnuD_mb85CFzEq8Y6hogj8cpBB-6kNQ_zLo1U",
  "access_expires_at": "2026-10-28T14:42:53.769092689Z",
  "refresh_token": "CFDLRQoHwDLOLLeAg4DAkNDBSZoq6YEdXdc3RIv4K4I",
  "refresh_expires_at": "2026-10-29T02:27:53.76868839Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f2d1e04d-d785-47fb-b151-9c92d2099329/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
      "author_type": "RIDER",
      "author_id": "c677d234-f9f4-44d1-8595-e12d460961f6",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:27:52.363874Z"
    },
    {
      "order_id": "f2d1e04d-d785-47fb-b151-9c92d2099329",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "c677d234-f9f4-44d1-8595-e12d460961f6",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:27:52.583779Z"
    }
  ]
}
```

Done: ratings for order f2d1e04d-d785-47fb-b151-9c92d2099329.

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
  "session_id": "c60a5d11-b755-4228-a1f5-d6ab6cc5cc3c",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1NzQsImlhdCI6MTc5MzE5NzY3NCwianRpIjoiMzE4ZGY5ZTktZTc2Mi00YzJkLTlhNjQtY2I0ZDhjMTBjNzcxIiwic2lkIjoiYzYwYTVkMTEtYjc1NS00MjI4LWExZjUtZDZhYjZjYzVjYzNjIn0.NWht4yDm--GRiy4_gw6oK5FNQxaFBlSGUO5JgrSt450",
  "access_expires_at": "2026-10-28T14:42:54.483117852Z",
  "refresh_token": "x_X3mnMXWhi309KunDiUERGpCHYNQEHPz9DEtPnllxA",
  "refresh_expires_at": "2026-10-29T02:27:54.482711159Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "63cb61dd-5ffd-4b38-89db-72435ed0f1c8",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "20ef91d8-869d-463b-8a22-d6077e951688",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:54.710158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/20ef91d8-869d-463b-8a22-d6077e951688` → **200**

```json
{
  "id": "20ef91d8-869d-463b-8a22-d6077e951688",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:54.710158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/20ef91d8-869d-463b-8a22-d6077e951688` → **200**

```json
{
  "id": "20ef91d8-869d-463b-8a22-d6077e951688",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:54.710158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/20ef91d8-869d-463b-8a22-d6077e951688` → **200**

```json
{
  "id": "20ef91d8-869d-463b-8a22-d6077e951688",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:54.710158Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/20ef91d8-869d-463b-8a22-d6077e951688` → **200**

```json
{
  "id": "20ef91d8-869d-463b-8a22-d6077e951688",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:27:54.710158Z",
  "ready_at": "2026-10-28T14:27:57.805311Z",
  "expires_at": "2026-10-29T14:27:57.805311Z"
}
```

`GET /api/admin/v1/reports/exports/20ef91d8-869d-463b-8a22-d6077e951688/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "aff1fc04-84ac-46bc-ab13-79a54a82ea6e",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "37bbb1cd-d376-4d30-b746-d40c66da1763",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:58.842453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37bbb1cd-d376-4d30-b746-d40c66da1763` → **200**

```json
{
  "id": "37bbb1cd-d376-4d30-b746-d40c66da1763",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:58.842453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37bbb1cd-d376-4d30-b746-d40c66da1763` → **200**

```json
{
  "id": "37bbb1cd-d376-4d30-b746-d40c66da1763",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:58.842453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37bbb1cd-d376-4d30-b746-d40c66da1763` → **200**

```json
{
  "id": "37bbb1cd-d376-4d30-b746-d40c66da1763",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:58.842453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37bbb1cd-d376-4d30-b746-d40c66da1763` → **200**

```json
{
  "id": "37bbb1cd-d376-4d30-b746-d40c66da1763",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:27:58.842453Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/37bbb1cd-d376-4d30-b746-d40c66da1763` → **200**

```json
{
  "id": "37bbb1cd-d376-4d30-b746-d40c66da1763",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:27:58.842453Z",
  "ready_at": "2026-10-28T14:28:02.812726Z",
  "expires_at": "2026-10-29T14:28:02.812726Z"
}
```

`GET /api/admin/v1/reports/exports/37bbb1cd-d376-4d30-b746-d40c66da1763/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/e063284c-1158-4201-bd52-e9fae71a586b` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/e063284c-1158-4201-bd52-e9fae71a586b",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2a10ce24-eb33-4174-adaf-798b7b286165"
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
  "device_ref": "sandbox-26867"
}
```

```json
{
  "challenge_id": "c44c69bd-31c5-49c8-89f5-617905b9c9e4",
  "expires_at": "2026-10-28T14:33:04.379799812Z",
  "resend_available_at": "2026-10-28T14:28:05.379799812Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "206495",
  "sent_at": "2026-10-28T14:28:04.381675018Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c44c69bd-31c5-49c8-89f5-617905b9c9e4",
  "code": "206495",
  "device_ref": "sandbox-26867"
}
```

```json
{
  "session_id": "8db5426a-8448-4148-8464-24c9d507acd7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODU4NCwiaWF0IjoxNzkzMTk3Njg0LCJqdGkiOiJlMjFkOGYwNy1jZDRmLTQ3ZDYtYjViYy1kODU4Zjk1NWE0MGYiLCJzaWQiOiI4ZGI1NDI2YS04NDQ4LTQxNDgtODQ2NC0yNGM5ZDUwN2FjZDcifQ.TcrqKxSUt9CQV2y9RDRJdfzN8fmXabVz8PNezW7awJE",
  "access_expires_at": "2026-10-28T14:43:04.631652971Z",
  "refresh_token": "BR1Smy1gumrPXCViAn-j6zFaMbDMJWpCOz7uOYeXtzg",
  "refresh_expires_at": "2026-11-27T14:28:04.631198133Z",
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
  "command_id": "8ad88437-7816-453b-98ff-6cf6ee4e08d6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:28:05Z",
    "sequence": 1793197685267
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bc7382a7-3a85-4f36-8dac-93c1d1afd329",
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
  "last_heartbeat_at": "2026-10-28T14:28:05.283854Z",
  "last_location_at": "2026-10-28T14:28:05.283854Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "cdfaf3ae-fdd4-4a7f-bab2-a472e42c9018",
  "points": [
    {
      "sequence": 1793197687508,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:27:07Z"
    },
    {
      "sequence": 1793197687514,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:28:07Z"
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
  "session_id": "1ddf0767-d3cb-47e0-8301-b83ef46dcdf5",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1ODgsImlhdCI6MTc5MzE5NzY4OCwianRpIjoiZmJiM2JjY2ItOWEzYy00NGY2LWI3MDItN2UwNmZmYmRiMDEzIiwic2lkIjoiMWRkZjA3NjctZDNjYi00N2UwLTgzMDEtYjgzZWY0NmRjZGY1In0.QfZmOcdPQSiDhrnpTtzDE4EzHMqMOywlYDGHt7gDc6o",
  "access_expires_at": "2026-10-28T14:43:08.093056919Z",
  "refresh_token": "IP64DDHp9tk9z6c1PwqwUOhk-i9Acx538XHw4a-HxW4",
  "refresh_expires_at": "2026-10-29T02:28:08.092508534Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "97486011-d8ff-4c13-860a-eb79cc0a38bc",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:28:07Z",
        "track_point_id": "c729ea9e-8de1-4206-ab5c-5dea6679a24f",
        "work_session_id": "bc7382a7-3a85-4f36-8dac-93c1d1afd329"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:28:07Z",
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

`POST /api/admin/v1/driver-risk-flags/97486011-d8ff-4c13-860a-eb79cc0a38bc/confirm` → **200**

```json
{
  "command_id": "61313ec1-f273-4c73-a60c-6acd3e025485",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "97486011-d8ff-4c13-860a-eb79cc0a38bc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:28:07Z",
    "track_point_id": "c729ea9e-8de1-4206-ab5c-5dea6679a24f",
    "work_session_id": "bc7382a7-3a85-4f36-8dac-93c1d1afd329"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:28:07Z",
  "reason": null,
  "reviewed_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "reviewed_at": "2026-10-28T14:28:08.808579Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/97486011-d8ff-4c13-860a-eb79cc0a38bc/dismiss` → **409**

```json
{
  "command_id": "1e168104-51d1-4a63-a3fd-5c6f2f00643b",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/97486011-d8ff-4c13-860a-eb79cc0a38bc/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bd5cc3d6-f7fc-4554-b818-c8d6dabded69"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "64bcc0b9-d5fa-43e9-bd64-6beeddd2babe",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "a044382a-57fa-4483-90df-3792f972d703",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "raised_at": "2026-10-28T14:28:09.258161Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/a044382a-57fa-4483-90df-3792f972d703/dismiss` → **200**

```json
{
  "command_id": "553b076c-51bd-467b-9b45-5e36e0e7c183",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "a044382a-57fa-4483-90df-3792f972d703",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "raised_at": "2026-10-28T14:28:09.258161Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "reviewed_at": "2026-10-28T14:28:09.484434Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "3b1a518f-0379-427e-a60a-251bc9f17323",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "97486011-d8ff-4c13-860a-eb79cc0a38bc"
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
      "actor_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:28:09.80941Z"
    }
  ]
}
```

Done: flag 97486011-d8ff-4c13-860a-eb79cc0a38bc confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "7f94e44e-66e0-4d45-a8b3-075e826841e3",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1OTAsImlhdCI6MTc5MzE5NzY5MCwianRpIjoiMTdjNzhiNGYtM2I2Zi00M2QzLTg1NjAtNzRiZmM3ZDRkOGMxIiwic2lkIjoiN2Y5NGU0NGUtNjZlMC00ZDQ1LWE4YjMtMDc1ZTgyNjg0MWUzIn0.-NVtqMfT31qP3QbfZN8B_yu0_GqNf5iMSUOoboRn4AY",
  "access_expires_at": "2026-10-28T14:43:10.51595455Z",
  "refresh_token": "xLbp0o8rTyAU7-To7jZHrLN4i4HYUo-nSaZzN_3ZrQI",
  "refresh_expires_at": "2026-10-29T02:28:10.515495111Z",
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
      "actor_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:28:09.80941Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "625dbb2d-1e0c-4a96-a46e-f0049440d146",
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
  "session_id": "bc7382a7-3a85-4f36-8dac-93c1d1afd329",
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
  "last_heartbeat_at": "2026-10-28T14:28:05.283854Z",
  "last_location_at": "2026-10-28T14:28:05.283854Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc7382a7-3a85-4f36-8dac-93c1d1afd329/close` → **200**

```json
{
  "command_id": "bc36c4de-2a95-454b-81f4-71ddce3035b1",
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
  "session_id": "e645e0c5-5893-4ac1-b97b-0519f1e8e312",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1OTEsImlhdCI6MTc5MzE5NzY5MSwianRpIjoiY2E0ZDhjOTEtNTE4NS00MGNlLTkyMmYtZjBkMGVkOWYyZTJhIiwic2lkIjoiZTY0NWUwYzUtNTg5My00YWMxLWI5N2ItMDUxOWYxZThlMzEyIn0.N2ZDd2z0sQYeJ3nm0RbI0nakIz4rvkm5yVq9Pn6MYwQ",
  "access_expires_at": "2026-10-28T14:43:11.908225101Z",
  "refresh_token": "Jr_ZkJB7aeBytvzrO9e1kvUCc4A7Fj2rAjHjG2CsLKk",
  "refresh_expires_at": "2026-10-29T02:28:11.90781156Z",
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
  "command_id": "e9fda2d9-8330-4cd1-8a9b-2324e954103a",
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
  "changed_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:28:12.352998Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "e9fda2d9-8330-4cd1-8a9b-2324e954103a",
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
  "changed_by": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:28:12.352998Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48299032957",
  "device_ref": "sandbox-18606"
}
```

```json
{
  "challenge_id": "2f20a732-a16d-4675-8565-bb8ac5820fc2",
  "expires_at": "2026-10-28T14:33:12.804947856Z",
  "resend_available_at": "2026-10-28T14:28:13.804947856Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48299032957` → **200**

```json
{
  "phone": "+48299032957",
  "audience": "CLIENT",
  "code": "021344",
  "sent_at": "2026-10-28T14:28:12.806782458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f20a732-a16d-4675-8565-bb8ac5820fc2",
  "code": "021344",
  "device_ref": "sandbox-18606"
}
```

```json
{
  "session_id": "c75726ce-3cf3-4deb-8e22-6098eb06088e",
  "subject": {
    "type": "CLIENT",
    "id": "e3ebb853-0b8a-4fac-868b-84a30bfddd27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlM2ViYjg1My0wYjhhLTRmYWMtODY4Yi04NGEzMGJmZGRkMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTkzLCJpYXQiOjE3OTMxOTc2OTMsImp0aSI6IjczY2RkODIxLTAzMzAtNDdmNi1iMTIwLTc4NzEwZTg2MjgxMCIsInNpZCI6ImM3NTcyNmNlLTNjZjMtNGRlYi04ZTIyLTYwOThlYjA2MDg4ZSJ9.qERRotEBGBlLkYr1LfNScaUdA1Quq3-DFGDaL5R6ZWU",
  "access_expires_at": "2026-10-28T14:43:13.045570886Z",
  "refresh_token": "DyJimAGNRnW8xVkiI_zo4dWRaW1sqC8BQIKHCbjQzkQ",
  "refresh_expires_at": "2026-11-27T14:28:13.045055729Z",
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
  "correlation_id": "2472bc8f-c78a-47cb-8ffa-0e9d6aabbbfc"
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
  "device_ref": "sandbox-30007"
}
```

```json
{
  "challenge_id": "9f892750-f5bc-4b7a-8a32-3deaef85bd95",
  "expires_at": "2026-10-28T14:33:13.692991912Z",
  "resend_available_at": "2026-10-28T14:28:14.692991912Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "053808",
  "sent_at": "2026-10-28T14:28:13.694702208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f892750-f5bc-4b7a-8a32-3deaef85bd95",
  "code": "053808",
  "device_ref": "sandbox-30007"
}
```

```json
{
  "session_id": "09fbb0b8-f9a1-464e-a5cb-013caa2bdd41",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODU5MywiaWF0IjoxNzkzMTk3NjkzLCJqdGkiOiJmNTZmNjc5MC03NjFmLTQ3ZDUtOGJlNC1jMmY2NGE0NTE0YTYiLCJzaWQiOiIwOWZiYjBiOC1mOWExLTQ2NGUtYTVjYi0wMTNjYWEyYmRkNDEifQ.mGgqNjMdYCQkuf6NMTSWdE7PN4l9Su9rWXSB7gO5wVM",
  "access_expires_at": "2026-10-28T14:43:13.925619733Z",
  "refresh_token": "zpS3WCFoj1AGt2PW7YdjIyQ_5NbKWGh53m3_mGOkI8U",
  "refresh_expires_at": "2026-11-27T14:28:13.925145952Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "12141fc6-1c47-4d93-abd5-189ffee9a828",
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
  "last_heartbeat_at": "2026-10-28T14:27:46.034774Z",
  "last_location_at": "2026-10-28T14:27:46.034774Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/12141fc6-1c47-4d93-abd5-189ffee9a828/handover` → **200**

```json
{
  "command_id": "aff1f3ff-948d-4d92-807e-6f259c0c88d6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "12141fc6-1c47-4d93-abd5-189ffee9a828",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T14:27:46.034774Z",
  "last_location_at": "2026-10-28T14:27:46.034774Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/12141fc6-1c47-4d93-abd5-189ffee9a828/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:28:14Z",
    "sequence": 1793197694576
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "12141fc6-1c47-4d93-abd5-189ffee9a828",
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
  "last_heartbeat_at": "2026-10-28T14:28:14.593587Z",
  "last_location_at": "2026-10-28T14:28:14.593587Z",
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
  "session_id": "12141fc6-1c47-4d93-abd5-189ffee9a828",
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
  "last_heartbeat_at": "2026-10-28T14:28:14.593587Z",
  "last_location_at": "2026-10-28T14:28:14.593587Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12141fc6-1c47-4d93-abd5-189ffee9a828/close` → **200**

```json
{
  "command_id": "0c9cb3de-127c-4948-98ad-8fa6053e66c6",
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
  "correlation_id": "22af308d-a39e-4bcc-beaa-99f0bb705adc"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676201483",
  "device_ref": "sandbox-16136"
}
```

```json
{
  "challenge_id": "855c67b1-d27d-400c-8546-41ec6c0ce546",
  "expires_at": "2026-10-28T14:33:15.740329684Z",
  "resend_available_at": "2026-10-28T14:28:16.740329684Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676201483` → **200**

```json
{
  "phone": "+380676201483",
  "audience": "CLIENT",
  "code": "561105",
  "sent_at": "2026-10-28T14:28:15.742252308Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "855c67b1-d27d-400c-8546-41ec6c0ce546",
  "code": "561105",
  "device_ref": "sandbox-16136"
}
```

```json
{
  "session_id": "a09c7fc8-c846-45fe-bd2f-5fc30be9571a",
  "subject": {
    "type": "CLIENT",
    "id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYjg2ZjUwMi1iNWE3LTRjYzktYTViYi1iMjUyMWJlMDJjMDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4NTk1LCJpYXQiOjE3OTMxOTc2OTUsImp0aSI6IjMxZWU5ZDM4LTAyM2QtNDE2YS1iMDM3LWJjMzI2NGQ4MmY4MCIsInNpZCI6ImEwOWM3ZmM4LWM4NDYtNDVmZS1iZDJmLTVmYzMwYmU5NTcxYSJ9.vnBvarx4i998LnWBA3FQ9Ot76xy_WvfVrsaWx391jm0",
  "access_expires_at": "2026-10-28T14:43:15.979443665Z",
  "refresh_token": "YRC86Vm0YsA7Wm2gXclDumLAQ634POg-lfh_7SxGx-c",
  "refresh_expires_at": "2026-11-27T14:28:15.979043573Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "128a70d0-fe3f-4956-8886-316e46c45476",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0617865f-d2a5-4df7-911c-66d1b0fd37ad",
  "upload_path": "/api/rider/v1/uploads/0617865f-d2a5-4df7-911c-66d1b0fd37ad",
  "expires_at": "2026-10-28T14:43:16.201582334Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/0617865f-d2a5-4df7-911c-66d1b0fd37ad` → **200**

```json
{
  "file_id": "0617865f-d2a5-4df7-911c-66d1b0fd37ad",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "7b150c3c-618a-4b50-b7bb-d39fd8d1fa8c",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "0617865f-d2a5-4df7-911c-66d1b0fd37ad"
  ]
}
```

```json
{
  "id": "9631a323-8cf3-4c16-86a8-e58696027789",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:28:16.451439Z",
  "updated_at": "2026-10-28T14:28:16.451439Z",
  "messages": [
    {
      "id": "0678b2e8-4cd1-4b0f-9bd8-396a0533a92a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:28:16.452827Z",
      "attachments": [
        {
          "file_id": "0617865f-d2a5-4df7-911c-66d1b0fd37ad",
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
  "session_id": "d6d2064a-a0d6-43e6-a892-25cd3c887603",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1OTYsImlhdCI6MTc5MzE5NzY5NiwianRpIjoiNGI4MzVlZGMtNzViYi00YzcxLTlmNzItNzkyMmNjNjY4NTRhIiwic2lkIjoiZDZkMjA2NGEtYTBkNi00M2U2LWE4OTItMjVjZDNjODg3NjAzIn0.OaU56Y4NqbWaE3UPBqzCXMpLPq8O9bGFAIbwC9d4CzI",
  "access_expires_at": "2026-10-28T14:43:16.94879326Z",
  "refresh_token": "8NCAKUTqOZJ1VmYxQlukyXkzAYK7bdIeEkwWC6w97Fg",
  "refresh_expires_at": "2026-10-29T02:28:16.948330809Z",
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
  "session_id": "aea9d960-3a48-44e2-b7d5-eb7741614c80",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1OTcsImlhdCI6MTc5MzE5NzY5NywianRpIjoiZTc2MjFlZWItYmZkZi00NmYyLWFjNzgtMWMzYzBlMzU5MzM5Iiwic2lkIjoiYWVhOWQ5NjAtM2E0OC00NGUyLWI3ZDUtZWI3NzQxNjE0YzgwIn0.ztBIgizoPC1Ny_DV7vEaTNd0YhJFTMqQEcVRCLKltXk",
  "access_expires_at": "2026-10-28T14:43:17.421512742Z",
  "refresh_token": "85cgyGtyFHJpZGqEgx4VMPWO57n1_EijJkcq99uF-8A",
  "refresh_expires_at": "2026-10-29T02:28:17.421085459Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/9631a323-8cf3-4c16-86a8-e58696027789/attachments/0617865f-d2a5-4df7-911c-66d1b0fd37ad` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c7485399-c93e-419b-86a1-b41d821c02f8",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "497edfb0-6ee5-4337-97ee-0ab4c29c1293",
  "upload_path": "/api/operator/v1/uploads/497edfb0-6ee5-4337-97ee-0ab4c29c1293",
  "expires_at": "2026-10-28T14:43:17.656524123Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/497edfb0-6ee5-4337-97ee-0ab4c29c1293` → **200**

```json
{
  "file_id": "497edfb0-6ee5-4337-97ee-0ab4c29c1293",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/9631a323-8cf3-4c16-86a8-e58696027789` → **200**

```json
{
  "id": "9631a323-8cf3-4c16-86a8-e58696027789",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:28:16.451439Z",
  "updated_at": "2026-10-28T14:28:16.451439Z",
  "messages": [
    {
      "id": "0678b2e8-4cd1-4b0f-9bd8-396a0533a92a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:28:16.452827Z",
      "attachments": [
        {
          "file_id": "0617865f-d2a5-4df7-911c-66d1b0fd37ad",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/9631a323-8cf3-4c16-86a8-e58696027789/comments` → **200**

```json
{
  "command_id": "fe0f8770-c324-4cca-9650-cdbfe32a56dd",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "497edfb0-6ee5-4337-97ee-0ab4c29c1293"
  ]
}
```

```json
{
  "id": "9631a323-8cf3-4c16-86a8-e58696027789",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:28:16.451439Z",
  "updated_at": "2026-10-28T14:28:18.134928Z",
  "messages": [
    {
      "id": "0678b2e8-4cd1-4b0f-9bd8-396a0533a92a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:28:16.452827Z",
      "attachments": [
        {
          "file_id": "0617865f-d2a5-4df7-911c-66d1b0fd37ad",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c3416598-d8f0-4e80-992f-feb08e340a59",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:28:18.13461Z",
      "attachments": [
        {
          "file_id": "497edfb0-6ee5-4337-97ee-0ab4c29c1293",
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

`GET /api/rider/v1/support/cases/9631a323-8cf3-4c16-86a8-e58696027789` → **200**

```json
{
  "id": "9631a323-8cf3-4c16-86a8-e58696027789",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:28:16.451439Z",
  "updated_at": "2026-10-28T14:28:18.134928Z",
  "messages": [
    {
      "id": "0678b2e8-4cd1-4b0f-9bd8-396a0533a92a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "3b86f502-b5a7-4cc9-a5bb-b2521be02c07",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:28:16.452827Z",
      "attachments": [
        {
          "file_id": "0617865f-d2a5-4df7-911c-66d1b0fd37ad",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "c3416598-d8f0-4e80-992f-feb08e340a59",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:28:18.13461Z",
      "attachments": [
        {
          "file_id": "497edfb0-6ee5-4337-97ee-0ab4c29c1293",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/9631a323-8cf3-4c16-86a8-e58696027789/attachments/497edfb0-6ee5-4337-97ee-0ab4c29c1293` → **200**

Done: support case 9631a323-8cf3-4c16-86a8-e58696027789, rider attachment 0617865f-d2a5-4df7-911c-66d1b0fd37ad, operator attachment 497edfb0-6ee5-4337-97ee-0ab4c29c1293.

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
  "session_id": "938d9c4f-042a-4349-9a65-8ee4bd0eb54c",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg1OTgsImlhdCI6MTc5MzE5NzY5OCwianRpIjoiOGM4NzRiZGMtYjhjOC00Y2I4LWExNTktYzRiMjIxNGEzNTg0Iiwic2lkIjoiOTM4ZDljNGYtMDQyYS00MzQ5LTlhNjUtOGVlNGJkMGViNTRjIn0.OXhbwHywMPetYl8dQJkUy0IBcUbDseENsPNZqXb3EQo",
  "access_expires_at": "2026-10-28T14:43:18.87221401Z",
  "refresh_token": "N2UCHTlvAXgMGgoZNwfViTuL8OJU-sQplnWmPJHVufg",
  "refresh_expires_at": "2026-10-29T02:28:18.871591955Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24661"
}
```

```json
{
  "challenge_id": "25c77488-225a-47a4-be08-d9f508d2cfb7",
  "expires_at": "2026-10-28T14:33:19.086944116Z",
  "resend_available_at": "2026-10-28T14:28:20.086944116Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "244847",
  "sent_at": "2026-10-28T14:28:19.08882231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25c77488-225a-47a4-be08-d9f508d2cfb7",
  "code": "244847",
  "device_ref": "sandbox-24661"
}
```

```json
{
  "session_id": "64618896-14e2-4b6e-8a77-1774e46bddd1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODU5OSwiaWF0IjoxNzkzMTk3Njk5LCJqdGkiOiI2YzdjMmRhMy04NmE1LTQ2OWItYTdmNi1kZTA2Y2UzYjg4NGUiLCJzaWQiOiI2NDYxODg5Ni0xNGUyLTRiNmUtOGE3Ny0xNzc0ZTQ2YmRkZDEifQ.yX2sxflwPgX-QH1ylh4AIfYN2PItXQx18C2l-fCa-s4",
  "access_expires_at": "2026-10-28T14:43:19.347363371Z",
  "refresh_token": "X_Pqn4_Y2nzuXMjAqscynaHC4OgUo3-nl_skpap55RQ",
  "refresh_expires_at": "2026-11-27T14:28:19.346262726Z",
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
      "actor_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:28:09.80941Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "693c4fe4-c089-4555-bf36-8bbbae505cc9",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:28:10.971687Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "6b061a3d-c812-4fed-bcaa-b0d9167e13d5",
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
  "device_ref": "sandbox-5776"
}
```

```json
{
  "challenge_id": "c14617ca-a930-4702-9c81-2655ef5f5f19",
  "expires_at": "2026-10-28T14:33:20.229116065Z",
  "resend_available_at": "2026-10-28T14:28:21.229116065Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "091009",
  "sent_at": "2026-10-28T14:28:20.231006117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c14617ca-a930-4702-9c81-2655ef5f5f19",
  "code": "091009",
  "device_ref": "sandbox-5776"
}
```

```json
{
  "session_id": "3ed1802f-a979-4636-9597-27fdffb336c0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODYwMCwiaWF0IjoxNzkzMTk3NzAwLCJqdGkiOiI1MjQ4MWNkYS04NTdjLTQ2N2UtYmQyOS1kYTY2NDhkNTA1YmIiLCJzaWQiOiIzZWQxODAyZi1hOTc5LTQ2MzYtOTU5Ny0yN2ZkZmZiMzM2YzAifQ.zq2Y4987lr6MK5FSzsW5bXqgjchNwuO9LAWxKcSBL9s",
  "access_expires_at": "2026-10-28T14:43:20.47313448Z",
  "refresh_token": "gBx3UXBkKSJewg89XIfVvviKMLueKwCiZAm5uma4FDQ",
  "refresh_expires_at": "2026-11-27T14:28:20.472597958Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee7a870b-e259-4902-9531-4845422d4e1f",
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
  "last_heartbeat_at": "2026-10-28T14:27:51.918116Z",
  "last_location_at": "2026-10-28T14:27:51.918116Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ee7a870b-e259-4902-9531-4845422d4e1f/handover` → **200**

```json
{
  "command_id": "cddb291e-3308-4663-b6f2-303512e7146c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee7a870b-e259-4902-9531-4845422d4e1f",
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
  "last_heartbeat_at": "2026-10-28T14:27:51.918116Z",
  "last_location_at": "2026-10-28T14:27:51.918116Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ee7a870b-e259-4902-9531-4845422d4e1f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:28:21Z",
    "sequence": 1793197701129
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ee7a870b-e259-4902-9531-4845422d4e1f",
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
  "last_heartbeat_at": "2026-10-28T14:28:21.14544Z",
  "last_location_at": "2026-10-28T14:28:21.14544Z",
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
  "command_id": "1fab3faf-1630-4f3f-8ed8-c3cd188e413c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:28:21Z",
    "sequence": 1793197701565
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed0dddd1-e9a4-478b-ac44-c837584eb3b9",
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
  "last_heartbeat_at": "2026-10-28T14:28:21.581014Z",
  "last_location_at": "2026-10-28T14:28:21.581014Z",
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
  "session_id": "95aef2f0-6245-453d-a907-38e91cdadd89",
  "subject": {
    "type": "STAFF",
    "id": "693c4fe4-c089-4555-bf36-8bbbae505cc9"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OTNjNGZlNC1jMDg5LTQ1NTUtYmYzNi04YmJiYWU1MDVjYzkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTg2MDIsImlhdCI6MTc5MzE5NzcwMiwianRpIjoiODM0ZjY4M2ItYTYzZC00Nzk3LTg1NjgtNjI5ZmZiY2IyNTZhIiwic2lkIjoiOTVhZWYyZjAtNjI0NS00NTNkLWE5MDctMzhlOTFjZGFkZDg5In0.5XDLwKNdCMFCW7GFZ6xPh4i9xuPGXUz8GXqF6SXq-tc",
  "access_expires_at": "2026-10-28T14:43:22.062903031Z",
  "refresh_token": "1E9YzceZcZV4lRvrYUzaAGQI9LFAgyc2qmsrK0ADHXw",
  "refresh_expires_at": "2026-10-29T02:28:22.062468878Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e0e650a0-e129-4e05-943e-2cc39ff620c2",
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
  "id": "ad8263b4-01ba-426a-9408-da65d38fe600",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:33:22.282989Z",
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
  "command_id": "da318ebb-99af-4712-bbe8-8656a8ff18a7",
  "quote_id": "ad8263b4-01ba-426a-9408-da65d38fe600",
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
  "id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
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
  "created_at": "2026-10-28T14:28:22.508906Z",
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
    "id": "53e46aba-8784-4228-957d-da5ef493cc8f",
    "order_id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
    "expires_at": "2026-10-28T14:28:37.512354Z",
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

`POST /api/driver/v1/offers/53e46aba-8784-4228-957d-da5ef493cc8f/accept` → **200**

```json
{
  "command_id": "0eb9fc71-0d39-4f03-ab81-97469e318824"
}
```

```json
{
  "id": "27e22184-5632-46f2-95c4-0161e18183d5",
  "order_id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "518db5bc-dc07-4ca8-9bd7-c40b863335a5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "518db5bc-dc07-4ca8-9bd7-c40b863335a5",
  "order_id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
  "assignment_id": "27e22184-5632-46f2-95c4-0161e18183d5",
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

`POST /api/driver/v1/work-sessions/ed0dddd1-e9a4-478b-ac44-c837584eb3b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:28:23Z",
    "sequence": 1793197703597
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "ed0dddd1-e9a4-478b-ac44-c837584eb3b9",
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
  "last_heartbeat_at": "2026-10-28T14:28:23.613895Z",
  "last_location_at": "2026-10-28T14:28:23.613895Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/518db5bc-dc07-4ca8-9bd7-c40b863335a5/arrive` → **200**

```json
{
  "command_id": "962af6a4-fb06-42af-bdaf-313fddc1bb00",
  "expected_version": 0
}
```

```json
{
  "id": "518db5bc-dc07-4ca8-9bd7-c40b863335a5",
  "order_id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
  "assignment_id": "27e22184-5632-46f2-95c4-0161e18183d5",
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
  "arrived_at": "2026-10-28T14:28:23.835165Z",
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

`POST /api/driver/v1/trips/518db5bc-dc07-4ca8-9bd7-c40b863335a5/start` → **200**

```json
{
  "command_id": "36604545-377b-44b4-9a2f-0579a29c8042",
  "expected_version": 1
}
```

```json
{
  "id": "518db5bc-dc07-4ca8-9bd7-c40b863335a5",
  "order_id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
  "assignment_id": "27e22184-5632-46f2-95c4-0161e18183d5",
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
  "arrived_at": "2026-10-28T14:28:23.835165Z",
  "started_at": "2026-10-28T14:28:24.061826Z",
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

`POST /api/driver/v1/trips/518db5bc-dc07-4ca8-9bd7-c40b863335a5/complete` → **200**

```json
{
  "command_id": "b641bd1e-588d-4d0f-b150-a490a66c5749",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:28:24Z",
  "cash_received": true
}
```

```json
{
  "id": "518db5bc-dc07-4ca8-9bd7-c40b863335a5",
  "order_id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
  "assignment_id": "27e22184-5632-46f2-95c4-0161e18183d5",
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
  "arrived_at": "2026-10-28T14:28:23.835165Z",
  "started_at": "2026-10-28T14:28:24.061826Z",
  "completed_at": "2026-10-28T14:28:24.289043Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/59dc7b36-960c-44a4-8c70-1b2ca1babbd8` → **200**

```json
{
  "id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
  "short_number": 20,
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
    "id": "27e22184-5632-46f2-95c4-0161e18183d5",
    "order_id": "59dc7b36-960c-44a4-8c70-1b2ca1babbd8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "518db5bc-dc07-4ca8-9bd7-c40b863335a5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:28:22.508906Z",
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
  "session_id": "ee7a870b-e259-4902-9531-4845422d4e1f",
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
  "last_heartbeat_at": "2026-10-28T14:28:21.14544Z",
  "last_location_at": "2026-10-28T14:28:21.14544Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ee7a870b-e259-4902-9531-4845422d4e1f/close` → **200**

```json
{
  "command_id": "06c280aa-ac8a-442c-8e44-ff054381f2c4",
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
  "session_id": "ed0dddd1-e9a4-478b-ac44-c837584eb3b9",
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
  "last_heartbeat_at": "2026-10-28T14:28:23.613895Z",
  "last_location_at": "2026-10-28T14:28:23.613895Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ed0dddd1-e9a4-478b-ac44-c837584eb3b9/close` → **200**

```json
{
  "command_id": "9d098725-7b56-49a2-be9e-992feafdef4d",
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

Done: terminal order 59dc7b36-960c-44a4-8c70-1b2ca1babbd8 by Andrii (5a000000-0000-4000-8000-000000000403).
