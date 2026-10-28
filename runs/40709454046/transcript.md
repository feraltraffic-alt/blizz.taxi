# Sandbox transcript (2026-10-28T14:48:45Z, 88191b0)

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
  "correlation_id": "0eef4503-ab1f-42a6-837b-a9b87b859609"
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
  "session_id": "896c7ce7-bf1a-494d-9869-e08232e84c4b",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4MzIsImlhdCI6MTc5MzE5ODkzMiwianRpIjoiYmU0Y2M2MmEtMzhlNi00ZDExLWI0ODYtYTIwMTNjNzhkODAyIiwic2lkIjoiODk2YzdjZTctYmYxYS00OTRkLTk4NjktZTA4MjMyZTg0YzRiIn0.6sAcqXlpwM7PGwsD_x1G1n4AP83FGpDxMa0Ss-Ca81s",
  "access_expires_at": "2026-10-28T15:03:52.342063113Z",
  "refresh_token": "Lm61h9hyrS_PG0vTK66UdrJhXYws4TLCN_o2q-17PeU",
  "refresh_expires_at": "2026-10-29T02:48:52.339789394Z",
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
  "session_id": "e9acd49f-132a-46af-a544-a25efed90733",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4MzMsImlhdCI6MTc5MzE5ODkzMywianRpIjoiODdiYjkwNmItM2IyOS00YzBlLThiY2EtODM0ZDUzMDRlY2ZjIiwic2lkIjoiZTlhY2Q0OWYtMTMyYS00NmFmLWE1NDQtYTI1ZWZlZDkwNzMzIn0.TueCGanDr5CrsAtBgRL6EnMKiehGGaqLuRAwIeA0IF0",
  "access_expires_at": "2026-10-28T15:03:53.872861592Z",
  "refresh_token": "usF8JOv8CZg2DOFgaPBCqkbRwzqRnDMHxRlhjCszKok",
  "refresh_expires_at": "2026-10-29T02:48:53.871822545Z",
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
  "command_id": "4e49702d-b112-4dd3-b55b-48b64752a5ba",
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
  "correlation_id": "b56ab3b4-f16e-4ecd-929e-d3f81f490796"
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
  "command_id": "cb34886d-d202-4c42-bf7f-fe10711bbbec",
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
  "changed_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T14:48:55.076638027Z"
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
  "session_id": "a5fa7431-bd02-4257-857a-18db9b971b6a",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4MzUsImlhdCI6MTc5MzE5ODkzNSwianRpIjoiZTg4MTFhN2MtMjM2Yy00YTgyLTlhMTgtOGQ3MWFiNDFlZTFkIiwic2lkIjoiYTVmYTc0MzEtYmQwMi00MjU3LTg1N2EtMThkYjliOTcxYjZhIn0.Myx2FbxMJ2EtLTgkOn8g2UO0IxdDhxX4mrvm8ZWuyfg",
  "access_expires_at": "2026-10-28T15:03:55.670515487Z",
  "refresh_token": "KRCTqXumxEMAwmkBSLapwoyDpfzC2I19f6BINZl4zZY",
  "refresh_expires_at": "2026-10-29T02:48:55.669533167Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "2ec25ec3-7096-43a9-a60e-14cce2082735",
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
  "id": "c342121a-3128-409d-95cf-3bf03fe98eab",
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
  "created_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "created_at": "2026-10-28T14:48:55.970689Z",
  "updated_at": "2026-10-28T14:48:55.970689Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635452893",
  "device_ref": "sandbox-19026"
}
```

```json
{
  "challenge_id": "6e7bcb30-a2fc-47c7-956c-a9f344580aec",
  "expires_at": "2026-10-28T14:53:56.272535867Z",
  "resend_available_at": "2026-10-28T14:48:57.272535867Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635452893` → **200**

```json
{
  "phone": "+380635452893",
  "audience": "CLIENT",
  "code": "071988",
  "sent_at": "2026-10-28T14:48:56.280196909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e7bcb30-a2fc-47c7-956c-a9f344580aec",
  "code": "071988",
  "device_ref": "sandbox-19026"
}
```

```json
{
  "session_id": "4e015f68-a68e-48a7-8da2-92d9985fadee",
  "subject": {
    "type": "CLIENT",
    "id": "c63451b8-97ae-4fdf-96fc-da24e219759e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjM0NTFiOC05N2FlLTRmZGYtOTZmYy1kYTI0ZTIxOTc1OWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5ODM2LCJpYXQiOjE3OTMxOTg5MzYsImp0aSI6ImU0NTIwOGYxLTFjMzctNGFmZC1hNGJjLTY1OGEyZTZhNzA1ZSIsInNpZCI6IjRlMDE1ZjY4LWE2OGUtNDhhNy04ZGEyLTkyZDk5ODVmYWRlZSJ9.WtBSu9oggfcxXy7gq2Ytrte_6YSRegMxxUPxcH0OhA0",
  "access_expires_at": "2026-10-28T15:03:56.608187064Z",
  "refresh_token": "yUPznYe0iKmXqniiJhulw3jQBU2svByVM8Mc9eFwuqs",
  "refresh_expires_at": "2026-11-27T14:48:56.607209338Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635452893` → **200**

```json
{
  "client_id": "c63451b8-97ae-4fdf-96fc-da24e219759e"
}
```

`POST /api/admin/v1/rider-wallets/c63451b8-97ae-4fdf-96fc-da24e219759e/top-ups` → **201**

```json
{
  "command_id": "859cab15-184c-4836-891b-4fb505683e0c",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "c63451b8-97ae-4fdf-96fc-da24e219759e",
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
      "id": "ffa9d96a-64e3-4f8d-9e93-dedfc5c2dc1d",
      "at": "2026-10-28T14:48:57.167246Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0a448b4c-1ddc-43ba-968e-e25602898541",
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
  "id": "02f493ca-3b95-4874-8901-18196f754af0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:53:57.614445Z",
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
      "id": "c342121a-3128-409d-95cf-3bf03fe98eab",
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
  "device_ref": "sandbox-18198"
}
```

```json
{
  "challenge_id": "a111f110-57d3-4d8d-adae-92437f084ba0",
  "expires_at": "2026-10-28T14:53:57.923427943Z",
  "resend_available_at": "2026-10-28T14:48:58.923427943Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "037472",
  "sent_at": "2026-10-28T14:48:57.927839523Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a111f110-57d3-4d8d-adae-92437f084ba0",
  "code": "037472",
  "device_ref": "sandbox-18198"
}
```

```json
{
  "session_id": "58bcce2c-be5b-4fb7-9ea7-11da8e93cd72",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTgzOCwiaWF0IjoxNzkzMTk4OTM4LCJqdGkiOiJlMGUzYWVlZi01NmQ3LTQ0ZDAtYmMyNi05MGM2NzI1NDU3NGMiLCJzaWQiOiI1OGJjY2UyYy1iZTViLTRmYjctOWVhNy0xMWRhOGU5M2NkNzIifQ.OE1q8NryHRvRBZVRHrlIOqiM7tqqlt0YZSQFq7j0TMc",
  "access_expires_at": "2026-10-28T15:03:58.239748483Z",
  "refresh_token": "KvuGC5DY5aK-Wj8QVqnF4GK0d8iwGhzEygsPGt8QFUk",
  "refresh_expires_at": "2026-11-27T14:48:58.238729288Z",
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
  "command_id": "aaa0fb4e-fe29-43e3-bb2d-9c5118a9f330",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:48:58Z",
    "sequence": 1793198938796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c96cd27c-0b5a-4c27-a6ed-f9b9032297eb",
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
  "last_heartbeat_at": "2026-10-28T14:48:58.848135Z",
  "last_location_at": "2026-10-28T14:48:58.848135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "32d58d14-9780-4cd5-94f1-6ef8f013b1c3",
  "quote_id": "02f493ca-3b95-4874-8901-18196f754af0",
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
  "id": "40328040-f650-40a8-a625-4e09cf2f9eaf",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c63451b8-97ae-4fdf-96fc-da24e219759e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:48:59.198318Z",
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
  "client_id": "c63451b8-97ae-4fdf-96fc-da24e219759e",
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
      "id": "ffa9d96a-64e3-4f8d-9e93-dedfc5c2dc1d",
      "at": "2026-10-28T14:48:57.167246Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
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
    "id": "b75e2e9e-91ee-4094-89e2-d6532e64a983",
    "order_id": "40328040-f650-40a8-a625-4e09cf2f9eaf",
    "expires_at": "2026-10-28T14:49:14.212194Z",
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

`POST /api/driver/v1/offers/b75e2e9e-91ee-4094-89e2-d6532e64a983/accept` → **200**

```json
{
  "command_id": "58527318-3af7-4d60-aa39-6003bcfa2d06"
}
```

```json
{
  "id": "0a605849-f2cb-4a9c-bb9f-a2b471fa92e1",
  "order_id": "40328040-f650-40a8-a625-4e09cf2f9eaf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2",
  "order_id": "40328040-f650-40a8-a625-4e09cf2f9eaf",
  "assignment_id": "0a605849-f2cb-4a9c-bb9f-a2b471fa92e1",
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

`POST /api/driver/v1/work-sessions/c96cd27c-0b5a-4c27-a6ed-f9b9032297eb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:49:00Z",
    "sequence": 1793198940696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c96cd27c-0b5a-4c27-a6ed-f9b9032297eb",
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
  "last_heartbeat_at": "2026-10-28T14:49:00.726909Z",
  "last_location_at": "2026-10-28T14:49:00.726909Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2/arrive` → **200**

```json
{
  "command_id": "8d1942fb-071b-4625-942a-a92c97bab5ed",
  "expected_version": 0
}
```

```json
{
  "id": "74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2",
  "order_id": "40328040-f650-40a8-a625-4e09cf2f9eaf",
  "assignment_id": "0a605849-f2cb-4a9c-bb9f-a2b471fa92e1",
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
  "arrived_at": "2026-10-28T14:49:01.041565Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2/start` → **200**

```json
{
  "command_id": "1c26c373-6df7-4e7d-9fb1-9cb50a5db48b",
  "expected_version": 1
}
```

```json
{
  "id": "74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2",
  "order_id": "40328040-f650-40a8-a625-4e09cf2f9eaf",
  "assignment_id": "0a605849-f2cb-4a9c-bb9f-a2b471fa92e1",
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
  "arrived_at": "2026-10-28T14:49:01.041565Z",
  "started_at": "2026-10-28T14:49:01.369368Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2/complete` → **200**

```json
{
  "command_id": "6cf37f08-f1c2-474e-a178-0ee357b7603a",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:49:01Z",
  "cash_received": true
}
```

```json
{
  "id": "74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2",
  "order_id": "40328040-f650-40a8-a625-4e09cf2f9eaf",
  "assignment_id": "0a605849-f2cb-4a9c-bb9f-a2b471fa92e1",
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
  "arrived_at": "2026-10-28T14:49:01.041565Z",
  "started_at": "2026-10-28T14:49:01.369368Z",
  "completed_at": "2026-10-28T14:49:01.701976Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c63451b8-97ae-4fdf-96fc-da24e219759e",
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
      "id": "fb571016-b3d0-4556-93b6-32d605915e49",
      "at": "2026-10-28T14:49:02.430712Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "40328040-f650-40a8-a625-4e09cf2f9eaf"
    },
    {
      "id": "ffa9d96a-64e3-4f8d-9e93-dedfc5c2dc1d",
      "at": "2026-10-28T14:48:57.167246Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c342121a-3128-409d-95cf-3bf03fe98eab/archive` → **200**

```json
{
  "command_id": "e4723837-b1aa-4386-adbb-96eb51d42ccb",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c342121a-3128-409d-95cf-3bf03fe98eab",
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
  "created_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "created_at": "2026-10-28T14:48:55.970689Z",
  "updated_at": "2026-10-28T14:49:05.308102Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c96cd27c-0b5a-4c27-a6ed-f9b9032297eb",
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
  "last_heartbeat_at": "2026-10-28T14:49:00.726909Z",
  "last_location_at": "2026-10-28T14:49:00.726909Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c96cd27c-0b5a-4c27-a6ed-f9b9032297eb/close` → **200**

```json
{
  "command_id": "b6f010bb-e2b9-45db-ac94-f8dd1cf9e01e",
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

Done: order 40328040-f650-40a8-a625-4e09cf2f9eaf.

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
  "session_id": "c7de1142-1548-4e54-8ec7-946e3bed3673",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4NDYsImlhdCI6MTc5MzE5ODk0NiwianRpIjoiNTFiMGIxOWItOWZjYy00MDkxLTkzZjktYzE0MmZjZmVmMDA4Iiwic2lkIjoiYzdkZTExNDItMTU0OC00ZTU0LThlYzctOTQ2ZTNiZWQzNjczIn0.luMrRZjjpmDZEFa9LszppebGGK1Xq__Dz4M7IaiRFBM",
  "access_expires_at": "2026-10-28T15:04:06.513032916Z",
  "refresh_token": "RZg5PUfrE9WeQ_5hkVItsJzhzuAMaaP3nSuabZdRArc",
  "refresh_expires_at": "2026-10-29T02:49:06.512231499Z",
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
  "command_id": "fb1671cf-3f69-418e-be25-762ff7495ee4",
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
  "session_id": "4481b592-5be5-461d-b6a1-d835036aaa84",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4NDcsImlhdCI6MTc5MzE5ODk0NywianRpIjoiMWZlZTIxMWYtMDc2YS00MWVhLWE5YTEtMDk1ZmJkMzEzN2JmIiwic2lkIjoiNDQ4MWI1OTItNWJlNS00NjFkLWI2YTEtZDgzNTAzNmFhYTg0In0.IqVJDYEntShifugTcQeOSoWuJMNcPmRh2pi0uUvwrwU",
  "access_expires_at": "2026-10-28T15:04:07.636955876Z",
  "refresh_token": "UXcKjwc2WyR7blpHQfhHVrRaaGcG_mVa-zPzMauIo0o",
  "refresh_expires_at": "2026-10-29T02:49:07.636183162Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.818032632",
    "linkedid": "1730052700.818032632",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678857541"
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
    "id": "1730052700.818032632",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "2f9681ed-2ea6-4b51-857b-f46de9046c49",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678857541",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:49:07.911316Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:49:07.941636Z",
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
    "id": "1730052600.1088513502",
    "linkedid": "1730052600.1088513502",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678857541"
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
      "id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678857541",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:49:08.260512Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/32e17538-8cd7-4661-93a3-53189ac18eb1/answer` → **200**

```json
{
  "command_id": "242f8802-2f24-478e-9a0d-bb3676b8ec82"
}
```

```json
{
  "id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678857541",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "order_ids": [],
  "started_at": "2026-10-28T14:49:08.260512Z",
  "answered_at": "2026-10-28T14:49:08.586509Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1088513502",
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
    "id": "1730052600.1088513502",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678857541",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [],
      "started_at": "2026-10-28T14:49:08.260512Z",
      "answered_at": "2026-10-28T14:49:08.586509Z",
      "ended_at": "2026-10-28T14:49:08.880937Z",
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
      "id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678857541",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [],
      "started_at": "2026-10-28T14:49:08.260512Z",
      "answered_at": "2026-10-28T14:49:08.586509Z",
      "ended_at": "2026-10-28T14:49:08.880937Z",
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
      "id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678857541",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [],
      "started_at": "2026-10-28T14:49:08.260512Z",
      "answered_at": "2026-10-28T14:49:08.586509Z",
      "ended_at": "2026-10-28T14:49:08.880937Z",
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
      "id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678857541",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [],
      "started_at": "2026-10-28T14:49:08.260512Z",
      "answered_at": "2026-10-28T14:49:08.586509Z",
      "ended_at": "2026-10-28T14:49:08.880937Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:49:14.240175Z"
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
      "id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678857541",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [],
      "started_at": "2026-10-28T14:49:08.260512Z",
      "answered_at": "2026-10-28T14:49:08.586509Z",
      "ended_at": "2026-10-28T14:49:08.880937Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:49:14.240175Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/32e17538-8cd7-4661-93a3-53189ac18eb1/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/32e17538-8cd7-4661-93a3-53189ac18eb1/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=32e17538-8cd7-4661-93a3-53189ac18eb1` → **200**

```json
{
  "changes": [
    {
      "id": "d1729203-2b9a-402e-b252-d740b4f73232",
      "occurred_at": "2026-10-28T14:49:16.357284Z",
      "actor_type": "STAFF",
      "actor_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8e3e3a9c-69db-4bac-9394-3d93ea81a9ec\", \"order_ids\": []}",
      "correlation_id": "1c8f0ef2-1659-43bd-a65d-864b41f2293f"
    },
    {
      "id": "40fc8988-d86a-4f35-9f9c-ec625096369c",
      "occurred_at": "2026-10-28T14:49:16.324697Z",
      "actor_type": "STAFF",
      "actor_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8e3e3a9c-69db-4bac-9394-3d93ea81a9ec\", \"order_ids\": []}",
      "correlation_id": "c91b96e8-35ee-4bf2-aac1-999f7fa254d6"
    }
  ]
}
```

Done: call 32e17538-8cd7-4661-93a3-53189ac18eb1 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630623080",
  "device_ref": "sandbox-25589"
}
```

```json
{
  "challenge_id": "7bfb6ee9-7468-44e9-823e-ea91426838b5",
  "expires_at": "2026-10-28T14:54:16.678607677Z",
  "resend_available_at": "2026-10-28T14:49:17.678607677Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630623080` → **200**

```json
{
  "phone": "+380630623080",
  "audience": "CLIENT",
  "code": "303420",
  "sent_at": "2026-10-28T14:49:16.682294324Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bfb6ee9-7468-44e9-823e-ea91426838b5",
  "code": "303420",
  "device_ref": "sandbox-25589"
}
```

```json
{
  "session_id": "9ac373fc-b4b4-4458-be2f-43e7dcb41511",
  "subject": {
    "type": "CLIENT",
    "id": "d38ad3bd-0316-4803-b802-c3345a012e80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzhhZDNiZC0wMzE2LTQ4MDMtYjgwMi1jMzM0NWEwMTJlODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5ODU2LCJpYXQiOjE3OTMxOTg5NTYsImp0aSI6IjcyNTcxOTgzLTFhODAtNDkxOS04ZjQ0LWYzMDQzMmY1Yjg5MCIsInNpZCI6IjlhYzM3M2ZjLWI0YjQtNDQ1OC1iZTJmLTQzZTdkY2I0MTUxMSJ9.3tbTCU2gg6wToIqxwIelf9EhUEGfQyOzEpEvVrE_Sc0",
  "access_expires_at": "2026-10-28T15:04:16.977739845Z",
  "refresh_token": "Tpb2zGvp3Ao18T9wDIjjKraZhJyV89Xgp0II2CSMytU",
  "refresh_expires_at": "2026-11-27T14:49:16.977010906Z",
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
  "device_ref": "sandbox-19657"
}
```

```json
{
  "challenge_id": "caa2dc2c-704f-4117-afbc-4cc68b52f86f",
  "expires_at": "2026-10-28T14:54:17.523353353Z",
  "resend_available_at": "2026-10-28T14:49:18.523353353Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "970027",
  "sent_at": "2026-10-28T14:49:17.526389499Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "caa2dc2c-704f-4117-afbc-4cc68b52f86f",
  "code": "970027",
  "device_ref": "sandbox-19657"
}
```

```json
{
  "session_id": "85f958dc-df31-4c5a-ac12-dfb9aff4c2c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTg1NywiaWF0IjoxNzkzMTk4OTU3LCJqdGkiOiIxN2Y0MTZiOC0yMGZlLTRiMDQtYTAzYi00MWFhYjljODgwYjQiLCJzaWQiOiI4NWY5NThkYy1kZjMxLTRjNWEtYWMxMi1kZmI5YWZmNGMyYzUifQ.EujyvG_uwLKEL6ZH-GQbTydjSAmW6XXTTgZIgjXSH64",
  "access_expires_at": "2026-10-28T15:04:17.827873129Z",
  "refresh_token": "GVE1is8vHZDzJFKHBh5-ccE03wsZR8a0mLwD8iIFLzs",
  "refresh_expires_at": "2026-11-27T14:49:17.827034763Z",
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
  "session_id": "6040ed93-4b70-45c3-af9a-41bd604a5b31",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4NTgsImlhdCI6MTc5MzE5ODk1OCwianRpIjoiNDQzZjg0ZmQtYzBjNy00OTBlLWE5ZTMtMmU4MThlNjc2Y2I2Iiwic2lkIjoiNjA0MGVkOTMtNGI3MC00NWMzLWFmOWEtNDFiZDYwNGE1YjMxIn0.sI8011StTrrPcdcCxdyckejGWLXJipqBXYPVg40P3sE",
  "access_expires_at": "2026-10-28T15:04:18.655763937Z",
  "refresh_token": "y_SWRWHmP0TXuFs5fOkfs0586gfvWBOya0GIevjrkpY",
  "refresh_expires_at": "2026-10-29T02:49:18.655029994Z",
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
  "session_id": "2e51e0d1-c2d1-4958-b152-45bcf0e6f6c9",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4NTksImlhdCI6MTc5MzE5ODk1OSwianRpIjoiZGJlZmI5OTctZDg4Yi00OTVhLWFkNzItMjE3ZDk4MzgzOTZkIiwic2lkIjoiMmU1MWUwZDEtYzJkMS00OTU4LWIxNTItNDViY2YwZTZmNmM5In0.b15ZvPMDkrmjme66fEPeMI24q9kit6_iNfDR3oUpXq8",
  "access_expires_at": "2026-10-28T15:04:19.217630418Z",
  "refresh_token": "EiiUDfdpHnSGQo_uPvufrJIGPL9Bd7NfK0OFEH9mjCg",
  "refresh_expires_at": "2026-10-29T02:49:19.216838073Z",
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
  "command_id": "bbaac966-d5cc-416c-8910-678f9c48ceb0",
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
  "id": "84717b42-ec93-41f4-917e-78cef39dfca3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:54:19.768106Z",
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
  "command_id": "6caad10b-23c4-4b51-8dc5-3f79640cc9b4",
  "quote_id": "84717b42-ec93-41f4-917e-78cef39dfca3",
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
  "id": "20f7f3b7-daaa-4ec1-a4b4-e8534c4dbe1b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d38ad3bd-0316-4803-b802-c3345a012e80",
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
  "created_at": "2026-10-28T14:49:20.063079Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/20f7f3b7-daaa-4ec1-a4b4-e8534c4dbe1b` → **200**

```json
{
  "id": "20f7f3b7-daaa-4ec1-a4b4-e8534c4dbe1b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d38ad3bd-0316-4803-b802-c3345a012e80",
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
  "created_at": "2026-10-28T14:49:20.063079Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/20f7f3b7-daaa-4ec1-a4b4-e8534c4dbe1b/cancel` → **200**

```json
{
  "command_id": "2230071a-0325-489d-a5d2-b6251885c896",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "20f7f3b7-daaa-4ec1-a4b4-e8534c4dbe1b",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d38ad3bd-0316-4803-b802-c3345a012e80",
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
  "created_at": "2026-10-28T14:49:20.063079Z",
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
  "command_id": "0fc5445b-3117-4bc0-9f96-9a202c320d93",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:49:21Z",
    "sequence": 1793198961225
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9a9f6235-a0d2-43ff-8cb7-7a6fee56c569",
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
  "last_heartbeat_at": "2026-10-28T14:49:21.246861Z",
  "last_location_at": "2026-10-28T14:49:21.246861Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24146"
}
```

```json
{
  "challenge_id": "a2ef5591-86b4-43b8-9121-d5abbac30fa8",
  "expires_at": "2026-10-28T14:54:21.531586712Z",
  "resend_available_at": "2026-10-28T14:49:22.531586712Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "798518",
  "sent_at": "2026-10-28T14:49:21.534517009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2ef5591-86b4-43b8-9121-d5abbac30fa8",
  "code": "798518",
  "device_ref": "sandbox-24146"
}
```

```json
{
  "session_id": "befb33f7-821e-4819-b831-cebb92584fc8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTg2MSwiaWF0IjoxNzkzMTk4OTYxLCJqdGkiOiI1YTY5MWI0YS00NzYzLTQ1NGMtYmJkNS02Mjk2ZTMxNjY5ODYiLCJzaWQiOiJiZWZiMzNmNy04MjFlLTQ4MTktYjgzMS1jZWJiOTI1ODRmYzgifQ.TnnKAo4V89oHa71DnjBb72laTZxB57pzxS8w657oOhY",
  "access_expires_at": "2026-10-28T15:04:21.830331294Z",
  "refresh_token": "YnlBqf1XWsYAlf1z3oMMflw59X3nEgDmxMx14BSDg-o",
  "refresh_expires_at": "2026-11-27T14:49:21.829563901Z",
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
  "command_id": "2602fc6c-537a-47d5-8f40-28b2f930055d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:49:22Z",
    "sequence": 1793198962356
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6e23ab17-866b-476c-be48-6756d82af5d2",
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
  "last_heartbeat_at": "2026-10-28T14:49:22.379091Z",
  "last_location_at": "2026-10-28T14:49:22.379091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4426feef-c34c-4e56-a6cd-18dbd7700e05",
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
  "id": "24cec463-4b70-4999-9e6a-4e8c2ac529fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:54:22.677223Z",
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
  "command_id": "8394a78a-79fb-4e5d-bb96-bfa2f36d72af",
  "quote_id": "24cec463-4b70-4999-9e6a-4e8c2ac529fc",
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
  "id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d38ad3bd-0316-4803-b802-c3345a012e80",
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
  "created_at": "2026-10-28T14:49:22.97231Z",
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
    "id": "74edd70a-1b07-4851-b969-2d15b7767841",
    "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
    "expires_at": "2026-10-28T14:49:37.97613Z",
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

`POST /api/driver/v1/offers/74edd70a-1b07-4851-b969-2d15b7767841/accept` → **200**

```json
{
  "command_id": "cec127ad-dbfd-43e5-aaf8-a237d5c450d3"
}
```

```json
{
  "id": "58cc2098-6e9e-4ed8-a1d9-d9c0924f39db",
  "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cb1e835b-6a4d-4b4f-b369-48c12d735a3a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cb1e835b-6a4d-4b4f-b369-48c12d735a3a",
  "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
  "assignment_id": "58cc2098-6e9e-4ed8-a1d9-d9c0924f39db",
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

`POST /api/driver/v1/trips/cb1e835b-6a4d-4b4f-b369-48c12d735a3a/cancel` → **200**

```json
{
  "command_id": "ca387740-a9d7-41bc-b4b7-97557b5d2e82",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "cb1e835b-6a4d-4b4f-b369-48c12d735a3a",
  "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
  "assignment_id": "58cc2098-6e9e-4ed8-a1d9-d9c0924f39db",
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

`GET /api/rider/v1/orders/391d7954-4e2e-48b3-9b84-8a63152a8216` → **200**

```json
{
  "id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d38ad3bd-0316-4803-b802-c3345a012e80",
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
    "id": "58cc2098-6e9e-4ed8-a1d9-d9c0924f39db",
    "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cb1e835b-6a4d-4b4f-b369-48c12d735a3a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:49:22.97231Z",
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
    "id": "cdf72666-4bfb-49f8-b63d-5abe19e5c967",
    "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
    "expires_at": "2026-10-28T14:49:39.11159Z",
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

`POST /api/driver/v1/offers/cdf72666-4bfb-49f8-b63d-5abe19e5c967/accept` → **200**

```json
{
  "command_id": "da27a92f-b758-4767-a5b5-b543800b8691"
}
```

```json
{
  "id": "fdbc064d-8b93-4657-bf46-4b90cf54783a",
  "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e2d91c16-df53-4973-b092-3aad70968b1d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e2d91c16-df53-4973-b092-3aad70968b1d",
  "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
  "assignment_id": "fdbc064d-8b93-4657-bf46-4b90cf54783a",
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

`POST /api/driver/v1/trips/e2d91c16-df53-4973-b092-3aad70968b1d/cancel` → **200**

```json
{
  "command_id": "4f93a86b-af89-4a25-9f6e-118612d8610b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "e2d91c16-df53-4973-b092-3aad70968b1d",
  "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
  "assignment_id": "fdbc064d-8b93-4657-bf46-4b90cf54783a",
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
    "id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:49:22.97231Z",
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
    "id": "20f7f3b7-daaa-4ec1-a4b4-e8534c4dbe1b",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:49:20.063079Z",
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

`GET /api/operator/v1/orders/391d7954-4e2e-48b3-9b84-8a63152a8216/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:49:22.972943Z",
      "actor": {
        "type": "CLIENT",
        "id": "d38ad3bd-0316-4803-b802-c3345a012e80",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
        "quote_id": "24cec463-4b70-4999-9e6a-4e8c2ac529fc",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "ac40cb7c-9ed7-4018-a25b-47757c145a49"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:49:22.975139Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
        "attempt_id": "5ff1a42b-be91-423a-8025-3b6b1064320d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ac40cb7c-9ed7-4018-a25b-47757c145a49"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:49:22.982957Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "74edd70a-1b07-4851-b969-2d15b7767841",
        "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "ac40cb7c-9ed7-4018-a25b-47757c145a49"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:49:23.549264Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "74edd70a-1b07-4851-b969-2d15b7767841",
        "order_id": "391d7954-4e2e-48b3-9b84-8a63152a8216",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "58cc2098-6e9e-4ed8-a1d9-d9c0924f39db"
      },
      "correlation_id": "651f4712-d53d-4d29-a616-cb10458873b5"
```

Done: orders 20f7f3b7-daaa-4ec1-a4b4-e8534c4dbe1b, 391d7954-4e2e-48b3-9b84-8a63152a8216.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735195930",
  "device_ref": "sandbox-24241"
}
```

```json
{
  "challenge_id": "158d7c26-84a3-4a6c-894d-af6d43b216f6",
  "expires_at": "2026-10-28T14:54:26.421566872Z",
  "resend_available_at": "2026-10-28T14:49:27.421566872Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735195930` → **200**

```json
{
  "phone": "+380735195930",
  "audience": "CLIENT",
  "code": "159331",
  "sent_at": "2026-10-28T14:49:26.424742852Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "158d7c26-84a3-4a6c-894d-af6d43b216f6",
  "code": "159331",
  "device_ref": "sandbox-24241"
}
```

```json
{
  "session_id": "cc4dcc83-2da2-48ff-b304-72c25997875c",
  "subject": {
    "type": "CLIENT",
    "id": "5f6f62c8-7d7f-4208-bbb3-8655d63b501e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjZmNjJjOC03ZDdmLTQyMDgtYmJiMy04NjU1ZDYzYjUwMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5ODY2LCJpYXQiOjE3OTMxOTg5NjYsImp0aSI6ImMyNDlhY2MzLTU1YjQtNGEyNi05MDEyLWYyZWRhZjQ0MTE3MCIsInNpZCI6ImNjNGRjYzgzLTJkYTItNDhmZi1iMzA0LTcyYzI1OTk3ODc1YyJ9.31NYK2aSlsGOCmiGCfYiJaC_I5VL8P4OaucKBQJUtzI",
  "access_expires_at": "2026-10-28T15:04:26.713075593Z",
  "refresh_token": "goR4PHZBLdwrk_tLveas62hRb1Yg7MdPSaBSujqaJsU",
  "refresh_expires_at": "2026-11-27T14:49:26.712449723Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e800c6d3-db2b-4ac5-8c71-c68f800d6b74",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "3511b78d-5b2c-49ab-90fb-ab9c12ec2163",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-3511b78d-5b2c-49ab-90fb-ab9c12ec2163",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6865bbc97562131454588ff023bcccbd",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=3511b78d-5b2c-49ab-90fb-ab9c12ec2163",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735195930"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=3511b78d-5b2c-49ab-90fb-ab9c12ec2163",
  "expires_at": "2026-10-28T15:19:26.992326Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/3511b78d-5b2c-49ab-90fb-ab9c12ec2163` → **200**

```json
{
  "id": "3511b78d-5b2c-49ab-90fb-ab9c12ec2163",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:19:26.992326Z",
  "card": {
    "id": "104c9f2d-6833-4469-94c0-3ecab8ad98fd",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3035",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:49:27.287931Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "104c9f2d-6833-4469-94c0-3ecab8ad98fd",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3035",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:49:27.287931Z"
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
  "device_ref": "sandbox-24108"
}
```

```json
{
  "challenge_id": "8da5942e-478b-41ff-9b2b-1f8a54eb0ce6",
  "expires_at": "2026-10-28T14:54:27.861135063Z",
  "resend_available_at": "2026-10-28T14:49:28.861135063Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "648683",
  "sent_at": "2026-10-28T14:49:27.864832854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8da5942e-478b-41ff-9b2b-1f8a54eb0ce6",
  "code": "648683",
  "device_ref": "sandbox-24108"
}
```

```json
{
  "session_id": "aa1ad3f4-0c09-4c6c-b2f6-d36947265f00",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTg2OCwiaWF0IjoxNzkzMTk4OTY4LCJqdGkiOiIzMzZhN2U4Mi0zMzk3LTQ4MWMtYmRiNy02ZTUxMmMzYTA1NjIiLCJzaWQiOiJhYTFhZDNmNC0wYzA5LTRjNmMtYjJmNi1kMzY5NDcyNjVmMDAifQ.mApLS5984rRsb9R8wnKXP8e5TF4VrawYJ_J8c7lWozw",
  "access_expires_at": "2026-10-28T15:04:28.169187502Z",
  "refresh_token": "xSq1ruH24xV-IgIlF5RR0dw0B9vppsD168GmjrJ-iU8",
  "refresh_expires_at": "2026-11-27T14:49:28.168598762Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6e23ab17-866b-476c-be48-6756d82af5d2",
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
  "last_heartbeat_at": "2026-10-28T14:49:22.379091Z",
  "last_location_at": "2026-10-28T14:49:22.379091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e23ab17-866b-476c-be48-6756d82af5d2/handover` → **200**

```json
{
  "command_id": "f01bd60a-674d-4148-9bef-d20573f5a8cc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6e23ab17-866b-476c-be48-6756d82af5d2",
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
  "last_heartbeat_at": "2026-10-28T14:49:22.379091Z",
  "last_location_at": "2026-10-28T14:49:22.379091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e23ab17-866b-476c-be48-6756d82af5d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:49:28Z",
    "sequence": 1793198968996
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6e23ab17-866b-476c-be48-6756d82af5d2",
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
  "last_heartbeat_at": "2026-10-28T14:49:29.019823Z",
  "last_location_at": "2026-10-28T14:49:29.019823Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dc9a27aa-0868-4839-9e18-49a6c41cf5a5",
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
  "id": "5c1a0973-56d9-447f-bfbb-c282ea7df207",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:54:29.309713Z",
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
  "command_id": "78ecece1-198e-42d3-84ad-28ed2b332ae5",
  "quote_id": "5c1a0973-56d9-447f-bfbb-c282ea7df207",
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
  "id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5f6f62c8-7d7f-4208-bbb3-8655d63b501e",
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
  "created_at": "2026-10-28T14:49:29.60983Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/07546b3e-84b9-4ebb-8b7f-17a537adc06d` → **200**

```json
{
  "id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5f6f62c8-7d7f-4208-bbb3-8655d63b501e",
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
  "created_at": "2026-10-28T14:49:29.60983Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/07546b3e-84b9-4ebb-8b7f-17a537adc06d` → **200**

```json
{
  "id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5f6f62c8-7d7f-4208-bbb3-8655d63b501e",
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
  "created_at": "2026-10-28T14:49:29.60983Z",
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
    "id": "f7f14214-0216-49cc-b7fe-331fe15bd825",
    "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
    "expires_at": "2026-10-28T14:49:45.601874Z",
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

`POST /api/driver/v1/offers/f7f14214-0216-49cc-b7fe-331fe15bd825/accept` → **200**

```json
{
  "command_id": "5de15cf3-1910-4b04-8154-47d03d1870bd"
}
```

```json
{
  "id": "0b74b6e4-5af8-4238-a01e-da29d4cf4806",
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "668891c7-c15f-451b-ac05-03f334d5c2a5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "668891c7-c15f-451b-ac05-03f334d5c2a5",
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "assignment_id": "0b74b6e4-5af8-4238-a01e-da29d4cf4806",
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

`POST /api/driver/v1/work-sessions/6e23ab17-866b-476c-be48-6756d82af5d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:49:32Z",
    "sequence": 1793198972318
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6e23ab17-866b-476c-be48-6756d82af5d2",
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
  "last_heartbeat_at": "2026-10-28T14:49:32.34063Z",
  "last_location_at": "2026-10-28T14:49:32.34063Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/668891c7-c15f-451b-ac05-03f334d5c2a5/arrive` → **200**

```json
{
  "command_id": "6c1934b8-c004-4b52-858a-a65283c65bb9",
  "expected_version": 0
}
```

```json
{
  "id": "668891c7-c15f-451b-ac05-03f334d5c2a5",
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "assignment_id": "0b74b6e4-5af8-4238-a01e-da29d4cf4806",
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
  "arrived_at": "2026-10-28T14:49:32.63441Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/668891c7-c15f-451b-ac05-03f334d5c2a5/start` → **200**

```json
{
  "command_id": "91ed98dc-1579-425e-bc69-a3130f858b7d",
  "expected_version": 1
}
```

```json
{
  "id": "668891c7-c15f-451b-ac05-03f334d5c2a5",
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "assignment_id": "0b74b6e4-5af8-4238-a01e-da29d4cf4806",
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
  "arrived_at": "2026-10-28T14:49:32.63441Z",
  "started_at": "2026-10-28T14:49:32.922695Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/668891c7-c15f-451b-ac05-03f334d5c2a5/complete` → **200**

```json
{
  "command_id": "c8163728-f676-4cfe-bab4-d33cc13eb463",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:49:33Z"
}
```

```json
{
  "id": "668891c7-c15f-451b-ac05-03f334d5c2a5",
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "assignment_id": "0b74b6e4-5af8-4238-a01e-da29d4cf4806",
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
  "arrived_at": "2026-10-28T14:49:32.63441Z",
  "started_at": "2026-10-28T14:49:32.922695Z",
  "completed_at": "2026-10-28T14:49:33.21766Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/07546b3e-84b9-4ebb-8b7f-17a537adc06d` → **200**

```json
{
  "id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5f6f62c8-7d7f-4208-bbb3-8655d63b501e",
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
    "id": "0b74b6e4-5af8-4238-a01e-da29d4cf4806",
    "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "668891c7-c15f-451b-ac05-03f334d5c2a5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:49:29.60983Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/07546b3e-84b9-4ebb-8b7f-17a537adc06d` → **200**

```json
{
  "id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5f6f62c8-7d7f-4208-bbb3-8655d63b501e",
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
    "id": "0b74b6e4-5af8-4238-a01e-da29d4cf4806",
    "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "668891c7-c15f-451b-ac05-03f334d5c2a5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:49:29.60983Z",
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
      "id": "9a5c8c99-2dd7-4743-84cf-cfa5ab8c8dd8",
      "at": "2026-10-28T14:49:33.655952Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/07546b3e-84b9-4ebb-8b7f-17a537adc06d/tip` → **200**

```json
{
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
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
  "available_until": "2026-10-29T14:49:33.21766Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/07546b3e-84b9-4ebb-8b7f-17a537adc06d/tip` → **201**

```json
{
  "command_id": "68cc49d6-20a7-415c-bb86-046b9365cdc9",
  "amount_minor": 2500
}
```

```json
{
  "id": "9bef5096-c194-4585-a859-06a24c0ee5b2",
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:49:35.914Z"
}
```

`GET /api/rider/v1/orders/07546b3e-84b9-4ebb-8b7f-17a537adc06d/tip` → **200**

```json
{
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
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
  "available_until": "2026-10-29T14:49:33.21766Z",
  "open": false,
  "tip": {
    "id": "9bef5096-c194-4585-a859-06a24c0ee5b2",
    "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:49:35.914Z"
  }
}
```

`GET /api/rider/v1/orders/07546b3e-84b9-4ebb-8b7f-17a537adc06d/tip` → **200**

```json
{
  "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
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
  "available_until": "2026-10-29T14:49:33.21766Z",
  "open": false,
  "tip": {
    "id": "9bef5096-c194-4585-a859-06a24c0ee5b2",
    "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:49:35.914Z"
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
      "id": "5a104cb2-732a-406b-a528-cbc9503c1048",
      "at": "2026-10-28T14:49:37.73535Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
      "counterpart_id": null
    },
    {
      "id": "9a5c8c99-2dd7-4743-84cf-cfa5ab8c8dd8",
      "at": "2026-10-28T14:49:33.655952Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "07546b3e-84b9-4ebb-8b7f-17a537adc06d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6e23ab17-866b-476c-be48-6756d82af5d2",
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
  "last_heartbeat_at": "2026-10-28T14:49:32.34063Z",
  "last_location_at": "2026-10-28T14:49:32.34063Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e23ab17-866b-476c-be48-6756d82af5d2/close` → **200**

```json
{
  "command_id": "877f7880-8cb0-4dc9-9336-4f778c09274d",
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

Done: card order 07546b3e-84b9-4ebb-8b7f-17a537adc06d.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737997723",
  "device_ref": "sandbox-27357"
}
```

```json
{
  "challenge_id": "303bb128-aa7f-4724-873f-39c0f5af8bb2",
  "expires_at": "2026-10-28T14:54:38.594038061Z",
  "resend_available_at": "2026-10-28T14:49:39.594038061Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737997723` → **200**

```json
{
  "phone": "+380737997723",
  "audience": "CLIENT",
  "code": "972790",
  "sent_at": "2026-10-28T14:49:38.596783771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "303bb128-aa7f-4724-873f-39c0f5af8bb2",
  "code": "972790",
  "device_ref": "sandbox-27357"
}
```

```json
{
  "session_id": "c70938d5-fccf-4129-bf58-4bdac1b50283",
  "subject": {
    "type": "CLIENT",
    "id": "c9426238-23ff-4ff3-a406-f7af696dffc5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOTQyNjIzOC0yM2ZmLTRmZjMtYTQwNi1mN2FmNjk2ZGZmYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5ODc4LCJpYXQiOjE3OTMxOTg5NzgsImp0aSI6ImFkYjJiNjBmLTUzNGMtNGNhYi04ZDUwLWM5MjY1ZjVhZDhjYyIsInNpZCI6ImM3MDkzOGQ1LWZjY2YtNDEyOS1iZjU4LTRiZGFjMWI1MDI4MyJ9.izJZjs03FqfsEktDV6C_PThZiH0Uu7TRTznWP-1FijM",
  "access_expires_at": "2026-10-28T15:04:38.892202034Z",
  "refresh_token": "ky6d10D8-HnMlwUA_ixpp-aSGN-N3QZlOgTNCXgPjEA",
  "refresh_expires_at": "2026-11-27T14:49:38.891503981Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "06ff88f4-9152-40d8-9819-f7cf485c0f70",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "2e827d80-6338-4e0d-9d3f-ca967a2dc27c",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2e827d80-6338-4e0d-9d3f-ca967a2dc27c",
    "orderDate": "1793198979",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "2cf25c5ab8a66bdb969dc10902502e23",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2e827d80-6338-4e0d-9d3f-ca967a2dc27c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737997723"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2e827d80-6338-4e0d-9d3f-ca967a2dc27c",
  "created_at": "2026-10-28T14:49:39.176505Z",
  "expires_at": "2026-10-28T15:19:39.176505Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/2e827d80-6338-4e0d-9d3f-ca967a2dc27c` → **200**

```json
{
  "id": "2e827d80-6338-4e0d-9d3f-ca967a2dc27c",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:49:39.176505Z",
  "expires_at": "2026-10-28T15:19:39.176505Z",
  "completed_at": "2026-10-28T14:49:39.473256Z",
  "masked_pan": "41****0022",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "c9426238-23ff-4ff3-a406-f7af696dffc5",
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
      "id": "590fefc6-2b2a-4bf9-aa4a-79ae988fa33c",
      "at": "2026-10-28T14:49:39.769395Z",
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
  "client_id": "c9426238-23ff-4ff3-a406-f7af696dffc5",
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
      "id": "590fefc6-2b2a-4bf9-aa4a-79ae988fa33c",
      "at": "2026-10-28T14:49:39.769395Z",
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
  "device_ref": "sandbox-7306"
}
```

```json
{
  "challenge_id": "27173665-88f3-4de4-bbeb-2df31bf924d9",
  "expires_at": "2026-10-28T14:54:40.338989304Z",
  "resend_available_at": "2026-10-28T14:49:41.338989304Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "117699",
  "sent_at": "2026-10-28T14:49:40.341796248Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27173665-88f3-4de4-bbeb-2df31bf924d9",
  "code": "117699",
  "device_ref": "sandbox-7306"
}
```

```json
{
  "session_id": "82dd4576-ccdf-4d51-b71f-f1b87e3a1c68",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTg4MCwiaWF0IjoxNzkzMTk4OTgwLCJqdGkiOiJhNWIyZDg0ZC0wNTY2LTQxNjktYjdmMS0wMTRlZmQxMjg4YzIiLCJzaWQiOiI4MmRkNDU3Ni1jY2RmLTRkNTEtYjcxZi1mMWI4N2UzYTFjNjgifQ.6QD3qFOhYFbaLdcrSyKwJH3RQI2w8ek2XKFmYZVe-jU",
  "access_expires_at": "2026-10-28T15:04:40.633509072Z",
  "refresh_token": "cP9q3d5aCjVjktIOogkibBJFHnDB_uq3zXlMVzsuyDg",
  "refresh_expires_at": "2026-11-27T14:49:40.632780581Z",
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
  "command_id": "bf2149da-91a8-47ea-8392-27b571d7f34c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "f2757636-8929-40dd-b508-e5129eeaf532",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f2757636-8929-40dd-b508-e5129eeaf532",
    "orderDate": "1793198981",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "a130dab25719a69ecd0b049155cc9d55",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f2757636-8929-40dd-b508-e5129eeaf532",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f2757636-8929-40dd-b508-e5129eeaf532",
  "created_at": "2026-10-28T14:49:41.176476Z",
  "expires_at": "2026-10-28T15:19:41.176476Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/f2757636-8929-40dd-b508-e5129eeaf532` → **200**

```json
{
  "id": "f2757636-8929-40dd-b508-e5129eeaf532",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:49:41.176476Z",
  "expires_at": "2026-10-28T15:19:41.176476Z",
  "completed_at": "2026-10-28T14:49:41.466533Z",
  "masked_pan": "41****1289",
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
      "id": "ddd6d2ae-4724-4c5c-9196-9c17fb55e63d",
      "at": "2026-10-28T14:49:41.77819Z",
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
  "command_id": "daad90f9-86f9-4507-9d14-c53c82fcc662",
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
  "correlation_id": "294c8c2e-a3a4-4c7e-85a0-a2fcf5dcf67e"
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
  "session_id": "a2a4626f-59fe-4cab-a8b6-e35ba97442aa",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4ODMsImlhdCI6MTc5MzE5ODk4MywianRpIjoiNmQzNjU0ZTItNGEwYy00YWEyLTkwOGMtODg1YzkxZmJhYzE2Iiwic2lkIjoiYTJhNDYyNmYtNTlmZS00Y2FiLWE4YjYtZTM1YmE5NzQ0MmFhIn0.icnHUpV5iKAPAVL0UV4KFTU4znnjTTw6zCnnKlerXq8",
  "access_expires_at": "2026-10-28T15:04:43.881428892Z",
  "refresh_token": "uelDOy1h-CkVbw8ARqvaWq84qbxhLOrqkmvR5AIynbM",
  "refresh_expires_at": "2026-10-29T02:49:43.880635936Z",
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
  "phone": "+48600141443",
  "device_ref": "sandbox-23341"
}
```

```json
{
  "challenge_id": "146c4550-6f3d-42e5-bb16-e11ff475b48b",
  "expires_at": "2026-10-28T14:54:44.70670542Z",
  "resend_available_at": "2026-10-28T14:49:45.70670542Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600141443` → **200**

```json
{
  "phone": "+48600141443",
  "audience": "CLIENT",
  "code": "885899",
  "sent_at": "2026-10-28T14:49:44.709747809Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "146c4550-6f3d-42e5-bb16-e11ff475b48b",
  "code": "885899",
  "device_ref": "sandbox-23341"
}
```

```json
{
  "session_id": "1e3f760c-f73a-4600-b83c-d681529332ca",
  "subject": {
    "type": "CLIENT",
    "id": "0e68d4b3-6470-4d8f-bdf0-50d305e67e50"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTY4ZDRiMy02NDcwLTRkOGYtYmRmMC01MGQzMDVlNjdlNTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5ODg1LCJpYXQiOjE3OTMxOTg5ODUsImp0aSI6ImQ0Zjk3MWU2LTk4YWQtNDdlZi1hZjU5LTMxZDI3Yjg0YmMyZiIsInNpZCI6IjFlM2Y3NjBjLWY3M2EtNDYwMC1iODNjLWQ2ODE1MjkzMzJjYSJ9.fr8IQGPS8RDZT7duMnLUn_jt4oiVyQRWxgGDdNRPCTM",
  "access_expires_at": "2026-10-28T15:04:45.006356114Z",
  "refresh_token": "yRdA9nKOacdYtcOMLCm1jLnbR8NNRLdtSIFZGrtF8KY",
  "refresh_expires_at": "2026-11-27T14:49:45.005648212Z",
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
  "command_id": "3676b9a5-890c-4795-b56a-08d60c6d1b26",
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
  "correlation_id": "61406831-65b7-4bb1-9f72-ac6f25465819",
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
  "command_id": "1176dd9a-06c4-44e9-909e-d1584ac370ae",
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
  "paused_at": "2026-10-28T14:49:46.134555173Z",
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
  "command_id": "b4a7db7e-e351-4361-bd98-edef9c070f58",
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
  "id": "99c8c68e-4d34-4898-b801-10a5d8cab2a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:54:46.708924Z",
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
  "command_id": "d7f51f20-d18f-4f4a-9c9b-2effdfbe391c",
  "quote_id": "99c8c68e-4d34-4898-b801-10a5d8cab2a8",
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
  "correlation_id": "6a91134f-fb36-4ccb-8172-5646e787aecc"
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
  "paused_at": "2026-10-28T14:49:46.134555Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "af05dd44-789f-44e2-a893-4ab31f48c501",
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
  "command_id": "c96a2a94-81f9-4fd9-b7d7-95765466f3a4",
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
  "command_id": "97d0d167-bd3b-44c4-b461-d026f45a2ffc",
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
  "id": "6fef600f-1dae-439e-8b6b-9f2b179e80c5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:54:48.383942Z",
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
  "command_id": "714082a4-43ed-47d3-94f6-fa41017397c1",
  "quote_id": "6fef600f-1dae-439e-8b6b-9f2b179e80c5",
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
  "correlation_id": "8d0aa12c-19ae-4ed4-a3ac-c3b656d876ea"
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
  "command_id": "a4b3e18e-204c-4e28-bb31-d44dfc35db70",
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
  "command_id": "54937663-c5ab-4f0e-9d98-83cd8df1eaf5",
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
  "id": "1d5a7436-c565-46d1-aea5-1857274afc30",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:54:49.521181Z",
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
  "command_id": "6ec52286-7bba-43e0-b344-468e5904d1da",
  "quote_id": "1d5a7436-c565-46d1-aea5-1857274afc30",
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
  "correlation_id": "7fb6d6f9-0761-4b25-9937-915522efa568"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "6a9ffd3c-e7fe-473c-9589-a738048f185d",
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
  "correlation_id": "f217887c-c879-4736-83be-46baa015d6a0"
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
  "command_id": "362e76c7-a047-473d-a9ac-41c9f4925e24",
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
  "phone": "+380679233728",
  "device_ref": "sandbox-20689"
}
```

```json
{
  "challenge_id": "b11b4bd8-2d4d-4be9-b6a9-5adf6a27ec27",
  "expires_at": "2026-10-28T14:54:50.928335379Z",
  "resend_available_at": "2026-10-28T14:49:51.928335379Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679233728` → **200**

```json
{
  "phone": "+380679233728",
  "audience": "CLIENT",
  "code": "586343",
  "sent_at": "2026-10-28T14:49:50.930929634Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b11b4bd8-2d4d-4be9-b6a9-5adf6a27ec27",
  "code": "586343",
  "device_ref": "sandbox-20689"
}
```

```json
{
  "session_id": "5b0aa495-4995-4d73-ac57-c7abacd7a255",
  "subject": {
    "type": "CLIENT",
    "id": "7132f9a3-547b-4536-8aca-ba859d28ecd7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MTMyZjlhMy01NDdiLTQ1MzYtOGFjYS1iYTg1OWQyOGVjZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5ODkxLCJpYXQiOjE3OTMxOTg5OTEsImp0aSI6IjUwMjk2ZDAwLTk4MWMtNDc5YS1iYzNlLWI0YzQ4Yjc1ZDdhYSIsInNpZCI6IjViMGFhNDk1LTQ5OTUtNGQ3My1hYzU3LWM3YWJhY2Q3YTI1NSJ9.ELA0JEho6xHvx5xIgEhemKAFb7faJyOLO0SEZLygY0o",
  "access_expires_at": "2026-10-28T15:04:51.227581867Z",
  "refresh_token": "kIC5c_4fFje85Lsyo9f2A90qKHbO2XLQbFs9JwJTeHs",
  "refresh_expires_at": "2026-11-27T14:49:51.226976076Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "7132f9a3-547b-4536-8aca-ba859d28ecd7",
  "session_id": "5b0aa495-4995-4d73-ac57-c7abacd7a255",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b3747424-8b28-4ef4-97b9-f9ea56a3b94e",
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
  "id": "8c051184-6d32-4d4c-a095-3c32d49ce34f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:54:51.788483Z",
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
  "challenge_id": "8f4f53fb-dcf0-4416-ac27-df5d7f115545",
  "expires_at": "2026-10-28T14:54:54.075174758Z",
  "resend_available_at": "2026-10-28T14:49:55.075174758Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679233728` → **200**

```json
{
  "phone": "+380679233728",
  "audience": "CLIENT",
  "code": "116333",
  "sent_at": "2026-10-28T14:49:54.077393663Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "1c86e351-d4f0-4ade-920a-e451bc1075bb",
  "challenge_id": "8f4f53fb-dcf0-4416-ac27-df5d7f115545",
  "otp_code": "116333"
}
```

```json
{
  "client_id": "7132f9a3-547b-4536-8aca-ba859d28ecd7",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:49:54.405163934Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "3cc95c32-6dd5-42d6-9fb2-41d72e3efba2",
  "quote_id": "8c051184-6d32-4d4c-a095-3c32d49ce34f",
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
  "correlation_id": "92be8a09-9a88-478b-8e78-2b2bae933d00"
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
  "session_id": "593215e0-7d1d-4421-92cc-48fbbdc7c5ca",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4OTUsImlhdCI6MTc5MzE5ODk5NSwianRpIjoiY2QwZmJlZTQtNGNlZi00ZWZlLTk4MmItMGE3Mjg2ZTAxMGJlIiwic2lkIjoiNTkzMjE1ZTAtN2QxZC00NDIxLTkyY2MtNDhmYmJkYzdjNWNhIn0.7bYMnykylXdJiT9BMD-t62WXKz1DM_BA_KnZb0B7_GI",
  "access_expires_at": "2026-10-28T15:04:55.259937091Z",
  "refresh_token": "404bFDVjSjzqOnO-7YP6Z_TjNSJlxp7Xp-5B7gmj9NA",
  "refresh_expires_at": "2026-10-29T02:49:55.259340868Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "7132f9a3-547b-4536-8aca-ba859d28ecd7",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:49:54.405164Z",
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

`POST /api/admin/v1/client-deletions/7132f9a3-547b-4536-8aca-ba859d28ecd7/complete` → **200**

```json
{
  "command_id": "86dc4bd4-6589-4fbb-8068-c456895e8605",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "7132f9a3-547b-4536-8aca-ba859d28ecd7",
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
  "correlation_id": "e6ea79ac-e96b-477a-b01e-0a6ce75a8b05"
}
```

Done: client 7132f9a3-547b-4536-8aca-ba859d28ecd7 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663958639",
  "device_ref": "sandbox-10121"
}
```

```json
{
  "challenge_id": "73adbaa2-6804-4f63-9cc1-2a955fd85f5d",
  "expires_at": "2026-10-28T14:54:56.373439411Z",
  "resend_available_at": "2026-10-28T14:49:57.373439411Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663958639` → **200**

```json
{
  "phone": "+380663958639",
  "audience": "CLIENT",
  "code": "004272",
  "sent_at": "2026-10-28T14:49:56.376162027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73adbaa2-6804-4f63-9cc1-2a955fd85f5d",
  "code": "004272",
  "device_ref": "sandbox-10121"
}
```

```json
{
  "session_id": "e2ce0bf6-c711-4213-a723-7c461cd1d8ee",
  "subject": {
    "type": "CLIENT",
    "id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzUxMzA1ZC01NzZjLTQ0MzAtOGNlMy0xZGJkNGE3MzUwYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5ODk2LCJpYXQiOjE3OTMxOTg5OTYsImp0aSI6IjBlMjEyMzc1LTllNjYtNDZjMi04NTNmLTgyMWU1MTUzYTE5NCIsInNpZCI6ImUyY2UwYmY2LWM3MTEtNDIxMy1hNzIzLTdjNDYxY2QxZDhlZSJ9.1qlxOeDqOvYnKYEHBiaBo1JmORbfBMzZHb8EHXmLfhc",
  "access_expires_at": "2026-10-28T15:04:56.695090781Z",
  "refresh_token": "nrF7cFMX_3CSA-MDTozy4h5qPRz4RMak0KjZopYVDT0",
  "refresh_expires_at": "2026-11-27T14:49:56.694543709Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8",
  "session_id": "e2ce0bf6-c711-4213-a723-7c461cd1d8ee",
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
  "session_id": "dcc786dd-feb0-4c88-8113-73e9bee7f62c",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk4OTcsImlhdCI6MTc5MzE5ODk5NywianRpIjoiYjU3YjIzYTctY2NjYi00ZDQ3LTlmZWYtODI3ZDgwYTk5MGUyIiwic2lkIjoiZGNjNzg2ZGQtZmViMC00Yzg4LTgxMTMtNzNlOWJlZTdmNjJjIn0._OMRXCiVyR4opQJoJp6T62U9DZEYX49mQNP97LQeC_Y",
  "access_expires_at": "2026-10-28T15:04:57.52479575Z",
  "refresh_token": "VtaL9_Rg3NrWbmniNk27S72tjxR_J2eQLBWvohxfRMU",
  "refresh_expires_at": "2026-10-29T02:49:57.524208834Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=3958639&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8",
      "phone": "+380663958639",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:49:56.692501Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/9c51305d-576c-4430-8ce3-1dbd4a7350b8` → **200**

```json
{
  "client": {
    "id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8",
    "phone": "+380663958639",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:49:56.692501Z",
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

`POST /api/admin/v1/clients/9c51305d-576c-4430-8ce3-1dbd4a7350b8/block` → **400**

```json
{
  "command_id": "451cd70d-562f-4ba0-9036-9a13044fbc85",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9c51305d-576c-4430-8ce3-1dbd4a7350b8/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "4899047f-0a20-4def-9e1a-15c0609fac26",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/9c51305d-576c-4430-8ce3-1dbd4a7350b8/block` → **200**

```json
{
  "command_id": "8343b08d-9263-4a89-8032-4f8338e90fac",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8",
  "phone": "+380663958639",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:49:56.692501Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:49:58.69809Z",
    "by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
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
  "correlation_id": "2a7c9b76-c708-4b11-b961-f859f4b6c0ca"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663958639",
  "device_ref": "sandbox-15755"
}
```

```json
{
  "challenge_id": "d6969a00-3beb-4514-9ee3-52cf5a4be13d",
  "expires_at": "2026-10-28T14:55:01.273356172Z",
  "resend_available_at": "2026-10-28T14:50:02.273356172Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663958639` → **200**

```json
{
  "phone": "+380663958639",
  "audience": "CLIENT",
  "code": "158725",
  "sent_at": "2026-10-28T14:50:01.276756644Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "d6969a00-3beb-4514-9ee3-52cf5a4be13d",
  "code": "158725",
  "device_ref": "sandbox-15755"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e142ce28-d645-4010-a51d-d26fa7e1e2b4"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/9c51305d-576c-4430-8ce3-1dbd4a7350b8` → **200**

```json
{
  "client": {
    "id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8",
    "phone": "+380663958639",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:49:56.692501Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:49:58.69809Z",
      "by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
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

`POST /api/admin/v1/clients/9c51305d-576c-4430-8ce3-1dbd4a7350b8/unblock` → **200**

```json
{
  "command_id": "62c23344-8adb-4c33-b31f-faac2bdcfddd",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8",
  "phone": "+380663958639",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:49:56.692501Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663958639",
  "device_ref": "sandbox-16952"
}
```

```json
{
  "challenge_id": "9cfc9f08-7c14-41b1-9218-4e7fa4ab79ed",
  "expires_at": "2026-10-28T14:55:04.453043297Z",
  "resend_available_at": "2026-10-28T14:50:05.453043297Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663958639` → **200**

```json
{
  "phone": "+380663958639",
  "audience": "CLIENT",
  "code": "933167",
  "sent_at": "2026-10-28T14:50:04.455681999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9cfc9f08-7c14-41b1-9218-4e7fa4ab79ed",
  "code": "933167",
  "device_ref": "sandbox-16952"
}
```

```json
{
  "session_id": "f27d54ad-4dad-4c9f-a060-5ec2af54be7e",
  "subject": {
    "type": "CLIENT",
    "id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzUxMzA1ZC01NzZjLTQ0MzAtOGNlMy0xZGJkNGE3MzUwYjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTA0LCJpYXQiOjE3OTMxOTkwMDQsImp0aSI6IjZiZWY5MmY4LTM0YjQtNDE5Mi04MzVkLTNkMDI1MTM1ODA1MiIsInNpZCI6ImYyN2Q1NGFkLTRkYWQtNGM5Zi1hMDYwLTVlYzJhZjU0YmU3ZSJ9.yd5yDOxZs_bp8fOUk3DxK0DZnud8Ggc5UyFek9cpjpM",
  "access_expires_at": "2026-10-28T15:05:04.74578896Z",
  "refresh_token": "-HX0ev89rHyU4wqBvbO7sMNC7HDWLhLIlRWHdzN0e6g",
  "refresh_expires_at": "2026-11-27T14:50:04.745164333Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9c51305d-576c-4430-8ce3-1dbd4a7350b8",
  "session_id": "f27d54ad-4dad-4c9f-a060-5ec2af54be7e",
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
  "phone": "+380662568323",
  "device_ref": "sandbox-29960"
}
```

```json
{
  "challenge_id": "4438da3f-05ef-4bbf-95c9-a3e36657dccb",
  "expires_at": "2026-10-28T14:55:05.294351255Z",
  "resend_available_at": "2026-10-28T14:50:06.294351255Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662568323` → **200**

```json
{
  "phone": "+380662568323",
  "audience": "CLIENT",
  "code": "825492",
  "sent_at": "2026-10-28T14:50:05.297156993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4438da3f-05ef-4bbf-95c9-a3e36657dccb",
  "code": "825492",
  "device_ref": "sandbox-29960"
}
```

```json
{
  "session_id": "e1eabdde-0766-46e4-860c-b7f41a96e925",
  "subject": {
    "type": "CLIENT",
    "id": "fd6cfa49-175d-4072-a5ee-f6c87f6517e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDZjZmE0OS0xNzVkLTQwNzItYTVlZS1mNmM4N2Y2NTE3ZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTA1LCJpYXQiOjE3OTMxOTkwMDUsImp0aSI6IjA3M2I3Mjk2LWRjMmMtNGI3OS04NjIyLTQwODZiYzZhZjQ2OCIsInNpZCI6ImUxZWFiZGRlLTA3NjYtNDZlNC04NjBjLWI3ZjQxYTk2ZTkyNSJ9.WufXLG32s38Arm_7N5KZd_ogDZOu1ohYo6DhsNrhhlc",
  "access_expires_at": "2026-10-28T15:05:05.588697607Z",
  "refresh_token": "nA8L86Anr-FX9ADh8DW4tpF8CtnNa8bOKF-jbaI4N4I",
  "refresh_expires_at": "2026-11-27T14:50:05.588108157Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ac89557a-26d2-494e-ab63-dd2082eedfc8",
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
  "id": "6c629d99-a863-43ef-a87d-f24df31ef380",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:55:05.864425Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 73937bb8-14f8-4999-81db-449b99e6828d) → **201**

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
  "session_id": "9eb822ac-c68f-466b-8fd4-c912bd098515",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5MDYsImlhdCI6MTc5MzE5OTAwNiwianRpIjoiOThmODg4ZGQtNWI5Ny00MmNiLWIxM2UtOTMzYjdhNTc3MjNiIiwic2lkIjoiOWViODIyYWMtYzY4Zi00NjZiLThmZDQtYzkxMmJkMDk4NTE1In0.cYGUmoFCfqrT0gggjND81CD3S4yq1KBE5aCXMC6jo2M",
  "access_expires_at": "2026-10-28T15:05:06.471509011Z",
  "refresh_token": "FmceNK6MNnQg5iGfAzpQuAC5TG4D2dwuyQyyINjzPp4",
  "refresh_expires_at": "2026-10-29T02:50:06.470913429Z",
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
  "session_id": "05ae893c-b81e-4c1f-9db7-5c8aad782cd3",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5MDcsImlhdCI6MTc5MzE5OTAwNywianRpIjoiOTBkYzliMWMtN2IwMy00MDdjLTk5YzctNTMwMDg2ZTM2NWUxIiwic2lkIjoiMDVhZTg5M2MtYjgxZS00YzFmLTlkYjctNWM4YWFkNzgyY2QzIn0.hc1L5NYd335uhXci2auBRf0vpc9sRwBG95kkkhxpQMw",
  "access_expires_at": "2026-10-28T15:05:07.055019288Z",
  "refresh_token": "ni1L7FdjSMyRkQPwD7UpoGrJNWhgybdB6B0aHbVqEhU",
  "refresh_expires_at": "2026-10-29T02:50:07.054392538Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d868c3a8-3239-404e-8c99-8fd829cae72f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:50:06.14242Z",
      "actor": {
        "type": "CLIENT",
        "id": "fd6cfa49-175d-4072-a5ee-f6c87f6517e6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d868c3a8-3239-404e-8c99-8fd829cae72f",
        "quote_id": "6c629d99-a863-43ef-a87d-f24df31ef380",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "73937bb8-14f8-4999-81db-449b99e6828d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:50:06.144549Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d868c3a8-3239-404e-8c99-8fd829cae72f",
        "attempt_id": "0a9cd032-8594-48f6-9557-5c2e8dc6bd7d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "73937bb8-14f8-4999-81db-449b99e6828d"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:50:06.154616Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d868c3a8-3239-404e-8c99-8fd829cae72f",
        "attempt_id": "0a9cd032-8594-48f6-9557-5c2e8dc6bd7d"
      },
      "correlation_id": "73937bb8-14f8-4999-81db-449b99e6828d"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "0a9cd032-8594-48f6-9557-5c2e8dc6bd7d",
        "generation": 1,
        "started_at": "2026-10-28T14:50:06.143267Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:50:06.154616Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:50:06.145574Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/73937bb8-14f8-4999-81db-449b99e6828d` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "d868c3a8-3239-404e-8c99-8fd829cae72f:0",
      "order_id": "d868c3a8-3239-404e-8c99-8fd829cae72f",
      "at": "2026-10-28T14:50:06.14242Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d868c3a8-3239-404e-8c99-8fd829cae72f:1",
      "order_id": "d868c3a8-3239-404e-8c99-8fd829cae72f",
      "at": "2026-10-28T14:50:06.144549Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d868c3a8-3239-404e-8c99-8fd829cae72f:2",
      "order_id": "d868c3a8-3239-404e-8c99-8fd829cae72f",
      "at": "2026-10-28T14:50:06.154616Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/c73d0832-2e56-4f95-8aa6-7166722defeb` → **200**

```json
{
  "found": []
}
```

Done: request 73937bb8-14f8-4999-81db-449b99e6828d — order d868c3a8-3239-404e-8c99-8fd829cae72f found by its id.

`GET /api/rider/v1/orders/d868c3a8-3239-404e-8c99-8fd829cae72f` → **200**

```json
{
  "id": "d868c3a8-3239-404e-8c99-8fd829cae72f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fd6cfa49-175d-4072-a5ee-f6c87f6517e6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:50:06.141754Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d868c3a8-3239-404e-8c99-8fd829cae72f/cancel` → **200**

```json
{
  "command_id": "32fa1c52-45cf-4a4d-9b05-1f7f7a8b3a99",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d868c3a8-3239-404e-8c99-8fd829cae72f",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fd6cfa49-175d-4072-a5ee-f6c87f6517e6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:50:06.141754Z",
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
  "discount_minor": 0
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633426032",
  "device_ref": "sandbox-13233"
}
```

```json
{
  "challenge_id": "3c6078e5-2683-43ef-a28e-54d4696976b7",
  "expires_at": "2026-10-28T14:55:08.774871924Z",
  "resend_available_at": "2026-10-28T14:50:09.774871924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633426032` → **200**

```json
{
  "phone": "+380633426032",
  "audience": "CLIENT",
  "code": "554682",
  "sent_at": "2026-10-28T14:50:08.777431082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c6078e5-2683-43ef-a28e-54d4696976b7",
  "code": "554682",
  "device_ref": "sandbox-13233"
}
```

```json
{
  "session_id": "03f0f107-32d1-4b59-81fa-9a038a1d06ac",
  "subject": {
    "type": "CLIENT",
    "id": "c581d781-dcb7-4294-bbcb-95f36295bfd5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTgxZDc4MS1kY2I3LTQyOTQtYmJjYi05NWYzNjI5NWJmZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTA5LCJpYXQiOjE3OTMxOTkwMDksImp0aSI6IjE1OTFjMmVmLTcyMDYtNDAwNi04ZDQ4LTU3NWQ0MjE4ZjAxNCIsInNpZCI6IjAzZjBmMTA3LTMyZDEtNGI1OS04MWZhLTlhMDM4YTFkMDZhYyJ9.I5IWlfv7MhbOQnNSiHqngK2c37Lwq8uaqkdsSBAV2Lk",
  "access_expires_at": "2026-10-28T15:05:09.077488393Z",
  "refresh_token": "En_E_S97T1CgGbNnLjHskmCdVP2ZxP9E0HvkdeFlv1k",
  "refresh_expires_at": "2026-11-27T14:50:09.076866842Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "446d4558-f444-4da3-8d83-213e1763820d",
  "expires_at": "2026-10-28T14:55:11.358398989Z",
  "resend_available_at": "2026-10-28T14:50:12.358398989Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633426032` → **200**

```json
{
  "phone": "+380633426032",
  "audience": "CLIENT",
  "code": "897968",
  "sent_at": "2026-10-28T14:50:11.360549805Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "af4d6e2d-a26b-41ec-97a5-428822d305f9",
  "challenge_id": "446d4558-f444-4da3-8d83-213e1763820d",
  "otp_code": "897968"
}
```

```json
{
  "id": "3a470e5c-4ffc-403d-8796-5f6b7b074b26",
  "state": "PENDING",
  "created_at": "2026-10-28T14:50:11.669848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/3a470e5c-4ffc-403d-8796-5f6b7b074b26` → **200**

```json
{
  "id": "3a470e5c-4ffc-403d-8796-5f6b7b074b26",
  "state": "PENDING",
  "created_at": "2026-10-28T14:50:11.669848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3a470e5c-4ffc-403d-8796-5f6b7b074b26` → **200**

```json
{
  "id": "3a470e5c-4ffc-403d-8796-5f6b7b074b26",
  "state": "PENDING",
  "created_at": "2026-10-28T14:50:11.669848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/3a470e5c-4ffc-403d-8796-5f6b7b074b26` → **200**

```json
{
  "id": "3a470e5c-4ffc-403d-8796-5f6b7b074b26",
  "state": "READY",
  "created_at": "2026-10-28T14:50:11.669848Z",
  "ready_at": "2026-10-28T14:50:14.257877Z",
  "expires_at": "2026-11-04T14:50:14.257877Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/3a470e5c-4ffc-403d-8796-5f6b7b074b26/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630583734",
  "device_ref": "sandbox-28931"
}
```

```json
{
  "challenge_id": "a1131eb0-0d40-490f-80f2-a1064b18362a",
  "expires_at": "2026-10-28T14:55:14.80141172Z",
  "resend_available_at": "2026-10-28T14:50:15.80141172Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630583734` → **200**

```json
{
  "phone": "+380630583734",
  "audience": "CLIENT",
  "code": "270689",
  "sent_at": "2026-10-28T14:50:14.804409122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1131eb0-0d40-490f-80f2-a1064b18362a",
  "code": "270689",
  "device_ref": "sandbox-28931"
}
```

```json
{
  "session_id": "ab5b93d7-7534-4162-92b7-4c9f4945f872",
  "subject": {
    "type": "CLIENT",
    "id": "9991f3b1-4147-44e8-9221-2a24d06e8f91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTkxZjNiMS00MTQ3LTQ0ZTgtOTIyMS0yYTI0ZDA2ZThmOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTE1LCJpYXQiOjE3OTMxOTkwMTUsImp0aSI6Ijk1Zjg3ZDVlLWMxZmYtNGJlMC1iNzcyLWYwZDJiYjI5M2U2NSIsInNpZCI6ImFiNWI5M2Q3LTc1MzQtNDE2Mi05MmI3LTRjOWY0OTQ1Zjg3MiJ9.XgUXefefvZVeuGYoxg4nuu4N3zruP-dDG4S5ltGiBpI",
  "access_expires_at": "2026-10-28T15:05:15.102023551Z",
  "refresh_token": "OfUJihoF3zE6DM73YOZn2PG9S2JtlcF-_zB9ZDPX0Rk",
  "refresh_expires_at": "2026-11-27T14:50:15.101456682Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/3a470e5c-4ffc-403d-8796-5f6b7b074b26/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/3a470e5c-4ffc-403d-8796-5f6b7b074b26/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2d59d924-0cb3-472e-b377-6e85fcfc97d0"
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
  "session_id": "ae8a17cd-e2e1-4069-8a36-a90043ea273e",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5MTUsImlhdCI6MTc5MzE5OTAxNSwianRpIjoiOGNiOGYwYmEtZGFhNC00N2JlLTkwOWUtY2JlZjUxMmIwODY5Iiwic2lkIjoiYWU4YTE3Y2QtZTJlMS00MDY5LThhMzYtYTkwMDQzZWEyNzNlIn0.NGJAIhh7nv5Hf9ECRa9a3uWdLaDO1u7QJy80021FZU8",
  "access_expires_at": "2026-10-28T15:05:15.930858082Z",
  "refresh_token": "vw6Y3qk_lWueA0Mt71skF0DQlOeZmcbw0fSBkX0Md5o",
  "refresh_expires_at": "2026-10-29T02:50:15.930258261Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c581d781-dcb7-4294-bbcb-95f36295bfd5",
  "session_id": "03f0f107-32d1-4b59-81fa-9a038a1d06ac",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/c581d781-dcb7-4294-bbcb-95f36295bfd5/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "3a470e5c-4ffc-403d-8796-5f6b7b074b26",
      "state": "READY",
      "created_at": "2026-10-28T14:50:11.669848Z",
      "ready_at": "2026-10-28T14:50:14.257877Z",
      "expires_at": "2026-11-04T14:50:14.257877Z",
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
  "device_ref": "sandbox-2187"
}
```

```json
{
  "challenge_id": "e6461733-f765-4f03-99f8-e428143bac22",
  "expires_at": "2026-10-28T14:55:16.730549471Z",
  "resend_available_at": "2026-10-28T14:50:17.730549471Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "996742",
  "sent_at": "2026-10-28T14:50:16.733394706Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6461733-f765-4f03-99f8-e428143bac22",
  "code": "996742",
  "device_ref": "sandbox-2187"
}
```

```json
{
  "session_id": "e3ca955f-fa64-4ac9-9280-51766d0a6a65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTkxNywiaWF0IjoxNzkzMTk5MDE3LCJqdGkiOiJjZWI3NGIyYy04ZWRmLTQyOWQtYTk5My1iYWY0ZWQwMDRiZDciLCJzaWQiOiJlM2NhOTU1Zi1mYTY0LTRhYzktOTI4MC01MTc2NmQwYTZhNjUifQ.vmev8snOQNzciTEEp5HXq1RymKx6dlALfr0JdL3_tzQ",
  "access_expires_at": "2026-10-28T15:05:17.043207526Z",
  "refresh_token": "6rCMxaIdi_GXKAbJ2Yyv1-0j4_7n9SnQzpLo_jVqfhs",
  "refresh_expires_at": "2026-11-27T14:50:17.042596252Z",
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
  "device_ref": "sandbox-4770"
}
```

```json
{
  "challenge_id": "5c3a3711-724d-4070-b721-3a9ac773ff06",
  "expires_at": "2026-10-28T14:55:17.578594349Z",
  "resend_available_at": "2026-10-28T14:50:18.578594349Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "260961",
  "sent_at": "2026-10-28T14:50:17.58093439Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5c3a3711-724d-4070-b721-3a9ac773ff06",
  "code": "260961",
  "device_ref": "sandbox-4770"
}
```

```json
{
  "session_id": "fe642f78-9b70-4052-8486-6778aaeba423",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTkxNywiaWF0IjoxNzkzMTk5MDE3LCJqdGkiOiIxMzcyNmZmOC02M2IwLTQxMGItYTNjMi1jOGM4OWVhNzVkNWQiLCJzaWQiOiJmZTY0MmY3OC05YjcwLTQwNTItODQ4Ni02Nzc4YWFlYmE0MjMifQ.Q-R_AvYk_fcK1xiAizNX9fXs1xPcrOyATma_-6m8euw",
  "access_expires_at": "2026-10-28T15:05:17.880507176Z",
  "refresh_token": "EQ3M8SAQOI6nipw3YEZJ6ovVQHqWPNr9CSBS2R20xoY",
  "refresh_expires_at": "2026-11-27T14:50:17.879919138Z",
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
  "command_id": "81f26395-b495-47e1-98d4-c3798e94491f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:18Z",
    "sequence": 1793199018415
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2e43fee5-dc68-4ef7-a9f0-d4f44edc198e",
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
  "last_heartbeat_at": "2026-10-28T14:50:18.436456Z",
  "last_location_at": "2026-10-28T14:50:18.436456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-15429"
}
```

```json
{
  "challenge_id": "3b5d437e-c0b5-43cf-8e32-4e904a473070",
  "expires_at": "2026-10-28T14:55:18.704873163Z",
  "resend_available_at": "2026-10-28T14:50:19.704873163Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "503938",
  "sent_at": "2026-10-28T14:50:18.707489396Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b5d437e-c0b5-43cf-8e32-4e904a473070",
  "code": "503938",
  "device_ref": "sandbox-15429"
}
```

```json
{
  "session_id": "34aec6e3-f5a8-4393-86f6-e40b67125265",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTkxOSwiaWF0IjoxNzkzMTk5MDE5LCJqdGkiOiIzNjllOWY4MS1kN2Y2LTQzMDItODBmZS0xYzFjODZkNzM2ZDEiLCJzaWQiOiIzNGFlYzZlMy1mNWE4LTQzOTMtODZmNi1lNDBiNjcxMjUyNjUifQ.WIBTUM5ibfPYysXjw7seXZpBVPZFIxhDypJVFJ0tbGM",
  "access_expires_at": "2026-10-28T15:05:19.011647079Z",
  "refresh_token": "w2dB7KwMdk188RQCRC9HIqCarz4ZEevtymC6V1gFKGU",
  "refresh_expires_at": "2026-11-27T14:50:19.010989671Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9a9f6235-a0d2-43ff-8cb7-7a6fee56c569",
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
  "last_heartbeat_at": "2026-10-28T14:49:21.246861Z",
  "last_location_at": "2026-10-28T14:49:21.246861Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9a9f6235-a0d2-43ff-8cb7-7a6fee56c569/handover` → **200**

```json
{
  "command_id": "1287fc34-322e-411f-8f35-edfa4e922074",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9a9f6235-a0d2-43ff-8cb7-7a6fee56c569",
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
  "last_heartbeat_at": "2026-10-28T14:49:21.246861Z",
  "last_location_at": "2026-10-28T14:49:21.246861Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/9a9f6235-a0d2-43ff-8cb7-7a6fee56c569/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:19Z",
    "sequence": 1793199019815
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "9a9f6235-a0d2-43ff-8cb7-7a6fee56c569",
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
  "last_heartbeat_at": "2026-10-28T14:50:19.838372Z",
  "last_location_at": "2026-10-28T14:50:19.838372Z",
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
  "session_id": "cf78f33f-344d-4dca-963d-1a7da63ea20e",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5MjAsImlhdCI6MTc5MzE5OTAyMCwianRpIjoiMjlmOTJhNmMtN2E5MS00MWNiLWFhNDYtOTkyNzY3ZWRhN2I5Iiwic2lkIjoiY2Y3OGYzM2YtMzQ0ZC00ZGNhLTk2M2QtMWE3ZGE2M2VhMjBlIn0.WEkC4p1kFeQbBTAJfEIhMOdFU1yVz9jmVOHb6FvIE_U",
  "access_expires_at": "2026-10-28T15:05:20.39409436Z",
  "refresh_token": "G-TlsUaHRS57y6yus2_4EylF1FCVExyW4BFY0IfipjU",
  "refresh_expires_at": "2026-10-29T02:50:20.39351652Z",
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
  "session_id": "3227fe00-deda-4ceb-a3dd-c2cddb4b536c",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5MjAsImlhdCI6MTc5MzE5OTAyMCwianRpIjoiYTcxZmNmMDUtYjVlMS00NWJiLWE4YmMtMDkxZTMwNjJlYTgxIiwic2lkIjoiMzIyN2ZlMDAtZGVkYS00Y2ViLWEzZGQtYzJjZGRiNGI1MzZjIn0.Zn4K_sEbkMyl5ZfaVvMVA6VdqYae6cv3uHajhXsmiaU",
  "access_expires_at": "2026-10-28T15:05:20.96664101Z",
  "refresh_token": "25mT8ChHYfSJ6xflj8yaPA6k5c9p5pClxtWanbbn7s4",
  "refresh_expires_at": "2026-10-29T02:50:20.966014732Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686188320",
  "device_ref": "sandbox-27542"
}
```

```json
{
  "challenge_id": "4f5ba7c5-29c2-4ce5-bb17-88dfc50871b5",
  "expires_at": "2026-10-28T14:55:21.235192147Z",
  "resend_available_at": "2026-10-28T14:50:22.235192147Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380686188320` → **200**

```json
{
  "phone": "+380686188320",
  "audience": "CLIENT",
  "code": "952271",
  "sent_at": "2026-10-28T14:50:21.237744685Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f5ba7c5-29c2-4ce5-bb17-88dfc50871b5",
  "code": "952271",
  "device_ref": "sandbox-27542"
}
```

```json
{
  "session_id": "8c2775d7-ba6f-4df1-9132-d01ca69a739f",
  "subject": {
    "type": "CLIENT",
    "id": "8407c0a0-93ac-4586-8820-09848b227cd7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NDA3YzBhMC05M2FjLTQ1ODYtODgyMC0wOTg0OGIyMjdjZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTIxLCJpYXQiOjE3OTMxOTkwMjEsImp0aSI6ImU3YmE0Zjc1LWFjY2ItNGUwZC04NjIyLTJjOTEyZmMyMGNjMSIsInNpZCI6IjhjMjc3NWQ3LWJhNmYtNGRmMS05MTMyLWQwMWNhNjlhNzM5ZiJ9.hX62YUtQ-9oI33Jba6TN9WVGonCyvKYew9gwBqInehc",
  "access_expires_at": "2026-10-28T15:05:21.534848767Z",
  "refresh_token": "nW0rk7PkDtmiLz_EDYryTuUk7i2h5xV2hUulAzBiKBo",
  "refresh_expires_at": "2026-11-27T14:50:21.534177992Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "da11a5bb-abb9-4d4e-8805-910642c3ee09",
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
  "id": "a69e39ed-0f4a-4dd7-a9fa-77114ee7497f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:55:21.830092Z",
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
  "command_id": "a9b5f140-6fa8-4852-9aef-ba90b44d40bc",
  "quote_id": "a69e39ed-0f4a-4dd7-a9fa-77114ee7497f",
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
  "id": "f2d3442a-02ba-4583-9f0b-c00291863048",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8407c0a0-93ac-4586-8820-09848b227cd7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:50:22.150915Z",
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
    "id": "ad5f8314-ebe5-4a7c-b5c1-40429dada9a4",
    "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048",
    "expires_at": "2026-10-28T14:50:37.154136Z",
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

`POST /api/driver/v1/offers/ad5f8314-ebe5-4a7c-b5c1-40429dada9a4/reject` → **204**

```json
{
  "command_id": "e8856ffd-8a71-41fb-b35a-c6df4afd2c80"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "505724c0-3b26-4ca0-b12b-6ca1d877819a",
    "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048",
    "expires_at": "2026-10-28T14:50:37.732396Z",
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

`POST /api/driver/v1/offers/505724c0-3b26-4ca0-b12b-6ca1d877819a/accept` → **200**

```json
{
  "command_id": "e7e5e507-9433-41c0-aa30-43fbb203ca3c"
}
```

```json
{
  "id": "80894ac0-9147-4030-a32b-87e4e75bd372",
  "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eaef3ccc-c512-473a-8e89-1451331cfc30",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/f2d3442a-02ba-4583-9f0b-c00291863048/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:50:22.151442Z",
      "actor": {
        "type": "CLIENT",
        "id": "8407c0a0-93ac-4586-8820-09848b227cd7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048",
        "quote_id": "a69e39ed-0f4a-4dd7-a9fa-77114ee7497f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f9bd9a6b-5792-49e7-86d4-717bf6945b10"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:50:22.153324Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048",
        "attempt_id": "ece3b31d-2029-42d6-aba1-b32d76ab47a0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f9bd9a6b-5792-49e7-86d4-717bf6945b10"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:50:22.160171Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ad5f8314-ebe5-4a7c-b5c1-40429dada9a4",
        "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "f9bd9a6b-5792-49e7-86d4-717bf6945b10"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:50:22.731318Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ad5f8314-ebe5-4a7c-b5c1-40429dada9a4",
        "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048"
      },
      "correlation_id": "0a8be4ed-4e4d-4b46-8ffa-5364ec149d3f"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order f2d3442a-02ba-4583-9f0b-c00291863048 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/f2d3442a-02ba-4583-9f0b-c00291863048` → **200**

```json
{
  "id": "f2d3442a-02ba-4583-9f0b-c00291863048",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8407c0a0-93ac-4586-8820-09848b227cd7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "80894ac0-9147-4030-a32b-87e4e75bd372",
    "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "eaef3ccc-c512-473a-8e89-1451331cfc30",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:50:22.150915Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f2d3442a-02ba-4583-9f0b-c00291863048/cancel` → **200**

```json
{
  "command_id": "351c3ed0-32a5-4431-8386-8a3b9ad0c8db",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "f2d3442a-02ba-4583-9f0b-c00291863048",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8407c0a0-93ac-4586-8820-09848b227cd7",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "80894ac0-9147-4030-a32b-87e4e75bd372",
    "order_id": "f2d3442a-02ba-4583-9f0b-c00291863048",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "eaef3ccc-c512-473a-8e89-1451331cfc30",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:50:22.150915Z",
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
  "session_id": "2e43fee5-dc68-4ef7-a9f0-d4f44edc198e",
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
  "last_heartbeat_at": "2026-10-28T14:50:18.436456Z",
  "last_location_at": "2026-10-28T14:50:18.436456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e43fee5-dc68-4ef7-a9f0-d4f44edc198e/close` → **200**

```json
{
  "command_id": "1ec20b26-0097-48f2-be35-792ee151aa5d",
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
  "session_id": "9a9f6235-a0d2-43ff-8cb7-7a6fee56c569",
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
  "last_heartbeat_at": "2026-10-28T14:50:19.838372Z",
  "last_location_at": "2026-10-28T14:50:19.838372Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9a9f6235-a0d2-43ff-8cb7-7a6fee56c569/close` → **200**

```json
{
  "command_id": "316199d6-2884-4ede-bb94-73566c2e5be2",
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
  "device_ref": "sandbox-13801"
}
```

```json
{
  "challenge_id": "83326fd8-e899-4163-bab5-f10ddb464d17",
  "expires_at": "2026-10-28T14:55:25.608922266Z",
  "resend_available_at": "2026-10-28T14:50:26.608922266Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "347576",
  "sent_at": "2026-10-28T14:50:25.611159466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83326fd8-e899-4163-bab5-f10ddb464d17",
  "code": "347576",
  "device_ref": "sandbox-13801"
}
```

```json
{
  "session_id": "982a6a0e-bd5f-43fa-921f-f68dd630fdf3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTkyNSwiaWF0IjoxNzkzMTk5MDI1LCJqdGkiOiI4MjVhMTFlNS02NTdlLTQ2NDMtYWU1YS0xODIyYTIxZjQ2ZjciLCJzaWQiOiI5ODJhNmEwZS1iZDVmLTQzZmEtOTIxZi1mNjhkZDYzMGZkZjMifQ.ietMWxiSSglZJHxusgaPL9UKP3zazQSOKHHXtBSVawE",
  "access_expires_at": "2026-10-28T15:05:25.912014002Z",
  "refresh_token": "3bgUfeMAMJW-_uoynVkqfozcoRr7_9X_KQvZy5LH5F8",
  "refresh_expires_at": "2026-11-27T14:50:25.911479363Z",
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
  "command_id": "a8d17bb5-39b6-4290-83b9-9421f7e1a621",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:26Z",
    "sequence": 1793199026442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:26.463122Z",
  "last_location_at": "2026-10-28T14:50:26.463122Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679952501",
  "device_ref": "sandbox-21534"
}
```

```json
{
  "challenge_id": "4ad54164-ec9d-4192-95ab-5f69d94c502c",
  "expires_at": "2026-10-28T14:55:26.738180217Z",
  "resend_available_at": "2026-10-28T14:50:27.738180217Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679952501` → **200**

```json
{
  "phone": "+380679952501",
  "audience": "CLIENT",
  "code": "649445",
  "sent_at": "2026-10-28T14:50:26.740708117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ad54164-ec9d-4192-95ab-5f69d94c502c",
  "code": "649445",
  "device_ref": "sandbox-21534"
}
```

```json
{
  "session_id": "259170e7-123a-4c53-8d98-18f9d4de1473",
  "subject": {
    "type": "CLIENT",
    "id": "54b49354-81ae-4d87-a4de-74b2cbac186a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NGI0OTM1NC04MWFlLTRkODctYTRkZS03NGIyY2JhYzE4NmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTI3LCJpYXQiOjE3OTMxOTkwMjcsImp0aSI6IjQ4MDkzZWQyLWFiMGUtNGQ3OC04ZmExLWUxMjZiYWQ3ZjcwNCIsInNpZCI6IjI1OTE3MGU3LTEyM2EtNGM1My04ZDk4LTE4ZjlkNGRlMTQ3MyJ9.aoUbWEnrxwtD9UVH76LKUZWqhdGAakXU0zZ_na8-PxM",
  "access_expires_at": "2026-10-28T15:05:27.052828942Z",
  "refresh_token": "pGyMZvpEr5kbMgyWFXqnJfdEygXWVPuvoRZsMM3f8uY",
  "refresh_expires_at": "2026-11-27T14:50:27.052252816Z",
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
  "command_id": "8b2a93ba-5dd0-4cea-a054-4171ea7bfbf6",
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
  "id": "e368fb22-d662-43e9-8895-6c9138c84540",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:55:27.611832Z",
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
  "command_id": "3378de40-664c-445c-a655-3218d4065299",
  "platform": "ANDROID",
  "token": "sandbox-driver-7be82aa0-52fa-423e-9ae8-1faadeccb725"
}
```

```json
{
  "id": "88eac51f-0063-4956-baa1-f9a8e5dc27f3",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:50:27.904096Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "db18eed0-b5e7-4ece-8505-b3e01da80419",
  "platform": "ANDROID",
  "token": "sandbox-rider-76aa4dbb-cbd4-46b5-9333-253821c0485d"
}
```

```json
{
  "id": "31ca3cc8-5b9b-45bc-a738-7049bdaa104e",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:50:28.18076Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "81f36883-ce35-4460-9556-972f6e5c3720",
  "quote_id": "e368fb22-d662-43e9-8895-6c9138c84540",
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
  "id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "54b49354-81ae-4d87-a4de-74b2cbac186a",
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
  "created_at": "2026-10-28T14:50:28.462124Z",
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
    "id": "e4364e3d-3be2-4d82-aa76-ca6757f28d15",
    "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
    "expires_at": "2026-10-28T14:50:43.465333Z",
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

`POST /api/driver/v1/offers/e4364e3d-3be2-4d82-aa76-ca6757f28d15/accept` → **200**

```json
{
  "command_id": "bc7349ee-b933-4d89-a77f-df9ac758f187"
}
```

```json
{
  "id": "15830d88-0acc-4971-9c9a-649ceeec5cce",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c5bc600e-2f08-47bf-80ba-286ca13b3bf2",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:50:28.436Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:50:28.436Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:50:29.507119744Z",
    "token_suffix": "ccb725",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_version": "2",
      "event_id": "e700fbd0-a3d1-4bb1-9404-8b182b1cacbd",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679952501&after=2026-10-28T14:50:28.436Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380679952501&after=2026-10-28T14:50:28.436Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:50:30.51139974Z",
    "token_suffix": "c0485d",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_version": "3",
      "event_id": "ea4aaa7e-fc5e-4a33-8e81-9c2668015fc8",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/ed9b5944-b8d2-4d42-9bec-be77702b90b4/messages` → **201**

```json
{
  "command_id": "04dea42a-17d4-4b36-8a53-7a2803637e38",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "00140549-c5d0-4497-b425-3a147fb0a4a1",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:50:31.42841367Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c5bc600e-2f08-47bf-80ba-286ca13b3bf2",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "assignment_id": "15830d88-0acc-4971-9c9a-649ceeec5cce",
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

`POST /api/driver/v1/trips/c5bc600e-2f08-47bf-80ba-286ca13b3bf2/messages` → **201**

```json
{
  "command_id": "a1eb935b-cff8-495a-bdc7-67b0244455fb",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "b2e952f9-6e65-41f3-8e61-06c9da486ea7",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:50:31.963888061Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/ed9b5944-b8d2-4d42-9bec-be77702b90b4/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c5bc600e-2f08-47bf-80ba-286ca13b3bf2/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679952501"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:32Z",
    "sequence": 1793199032796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:32.816338Z",
  "last_location_at": "2026-10-28T14:50:32.816338Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c5bc600e-2f08-47bf-80ba-286ca13b3bf2",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "assignment_id": "15830d88-0acc-4971-9c9a-649ceeec5cce",
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

`POST /api/driver/v1/trips/c5bc600e-2f08-47bf-80ba-286ca13b3bf2/arrive` → **200**

```json
{
  "command_id": "6a0d436c-9d6a-40ba-a0a4-5ac53a0b830e",
  "expected_version": 0
}
```

```json
{
  "id": "c5bc600e-2f08-47bf-80ba-286ca13b3bf2",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "assignment_id": "15830d88-0acc-4971-9c9a-649ceeec5cce",
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
  "arrived_at": "2026-10-28T14:50:33.347871Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c5bc600e-2f08-47bf-80ba-286ca13b3bf2/start` → **200**

```json
{
  "command_id": "6fb7433b-69bc-4bb4-b675-3f4f8680b984",
  "expected_version": 1
}
```

```json
{
  "id": "c5bc600e-2f08-47bf-80ba-286ca13b3bf2",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "assignment_id": "15830d88-0acc-4971-9c9a-649ceeec5cce",
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
  "arrived_at": "2026-10-28T14:50:33.347871Z",
  "started_at": "2026-10-28T14:50:33.628181Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:33Z",
    "sequence": 1793199033903
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:33.923411Z",
  "last_location_at": "2026-10-28T14:50:33.923411Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c5bc600e-2f08-47bf-80ba-286ca13b3bf2/complete` → **200**

```json
{
  "command_id": "408c659f-4787-49c2-8e00-13e0174e3772",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:50:34Z",
  "cash_received": true
}
```

```json
{
  "id": "c5bc600e-2f08-47bf-80ba-286ca13b3bf2",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "assignment_id": "15830d88-0acc-4971-9c9a-649ceeec5cce",
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
  "arrived_at": "2026-10-28T14:50:33.347871Z",
  "started_at": "2026-10-28T14:50:33.628181Z",
  "completed_at": "2026-10-28T14:50:34.207683Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/ed9b5944-b8d2-4d42-9bec-be77702b90b4` → **200**

```json
{
  "id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "54b49354-81ae-4d87-a4de-74b2cbac186a",
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
    "id": "15830d88-0acc-4971-9c9a-649ceeec5cce",
    "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c5bc600e-2f08-47bf-80ba-286ca13b3bf2",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:50:28.462124Z",
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
    "id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:50:28.462124Z",
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
    "id": "c5bc600e-2f08-47bf-80ba-286ca13b3bf2",
    "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
    "order_short_number": 7,
    "created_at": "2026-10-28T14:50:29.037685Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "74ebd80c-8dce-4ff3-bee0-50fa4ebf50b2",
    "order_id": "40328040-f650-40a8-a625-4e09cf2f9eaf",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:49:00.086777Z",
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

`GET /api/rider/v1/orders/ed9b5944-b8d2-4d42-9bec-be77702b90b4/tip` → **200**

```json
{
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
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
  "available_until": "2026-10-29T14:50:34.207683Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ed9b5944-b8d2-4d42-9bec-be77702b90b4/tip` → **201**

```json
{
  "command_id": "ec47425b-1d2b-4763-a9be-f4131e8b657e",
  "amount_minor": 1100
}
```

```json
{
  "id": "6802ef1e-39a4-475d-a323-26d9db262f76",
  "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:50:39.178952Z"
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
  "session_id": "3a16b209-681f-43c4-9962-a7261be3dd1b",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5MzksImlhdCI6MTc5MzE5OTAzOSwianRpIjoiMjgyNmU2NWQtMTc5YS00MGY3LTg2MmItNDUxNzk0MDU4MzBiIiwic2lkIjoiM2ExNmIyMDktNjgxZi00M2M0LTk5NjItYTcyNjFiZTNkZDFiIn0.eYpMy7ySH7sxA0d_FwOhZAQTlpxoNtm6B07lyq4-xtw",
  "access_expires_at": "2026-10-28T15:05:39.751799585Z",
  "refresh_token": "5HgDl-EKnDClIHjLl7OoEYTBxyJ-_iyH0U6EB21SiAU",
  "refresh_expires_at": "2026-10-29T02:50:39.751183887Z",
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
          "CASH": 6,
          "CARD": 1
        },
        "cancelled_by": {
          "RIDER": 2,
          "DRIVER": 1,
          "STAFF": 1
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
      "CASH": 6,
      "CARD": 1
    },
    "cancelled_by": {
      "RIDER": 2,
      "DRIVER": 1,
      "STAFF": 1
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
  "generated_at": "2026-10-28T14:50:40.025854848Z"
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
  "generated_at": "2026-10-28T14:50:40.304918761Z"
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
  "session_id": "3f0037c9-54a2-4859-9893-a9da8b4cbb16",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5NDAsImlhdCI6MTc5MzE5OTA0MCwianRpIjoiZDg5ZDQ2NTItNDJkMy00NDZjLTk2MmItNDlmZDAyMGRjYTJlIiwic2lkIjoiM2YwMDM3YzktNTRhMi00ODU5LTk4OTMtYTlkYThiNGNiYjE2In0.SpkUT1yjgZg57xJ15Q-g12zNNrVNcd2hBWucJFPva4A",
  "access_expires_at": "2026-10-28T15:05:40.881881572Z",
  "refresh_token": "nB7xauqdHW55ht7Cm2sqdN639hlH-5-lQJOWT8gUNk8",
  "refresh_expires_at": "2026-10-29T02:50:40.881166036Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ed9b5944-b8d2-4d42-9bec-be77702b90b4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:50:28.462635Z",
      "actor": {
        "type": "CLIENT",
        "id": "54b49354-81ae-4d87-a4de-74b2cbac186a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
        "quote_id": "e368fb22-d662-43e9-8895-6c9138c84540",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "380bbcab-0c1d-43c0-a9d4-ed854f80f51f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:50:28.464484Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
        "attempt_id": "fb6e370b-44c8-4b21-9f5c-86cc2196b7c5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "380bbcab-0c1d-43c0-a9d4-ed854f80f51f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:50:28.471101Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e4364e3d-3be2-4d82-aa76-ca6757f28d15",
        "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "380bbcab-0c1d-43c0-a9d4-ed854f80f51f"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:50:29.039614Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e4364e3d-3be2-4d82-aa76-ca6757f28d15",
        "order_id": "ed9b5944-b8d2-4d42-9bec-be77702b90b4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "15830d88-0acc-4971-9c9a-649ceeec5cce"
      },
      "correlation_id": "f58dd07c-2505-412a-b604-3d22573e3789"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:50:41.445939441Z",
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
      "last_location_at": "2026-10-28T14:50:33.923411Z",
      "order_id": null
    }
  ]
}
```

Done: order ed9b5944-b8d2-4d42-9bec-be77702b90b4.

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
  "session_id": "90ca2ebd-07da-482a-9430-0ddb50d2d2fa",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5NDIsImlhdCI6MTc5MzE5OTA0MiwianRpIjoiODU3MDNkMDEtODE5Zi00MTI2LThiYzMtMTIxMmNlNDRlY2VhIiwic2lkIjoiOTBjYTJlYmQtMDdkYS00ODJhLTk0MzAtMGRkYjUwZDJkMmZhIn0.opynxaxH8dtz3NANCGo-NcPXNGRPyf39G70Uu7ATmQ0",
  "access_expires_at": "2026-10-28T15:05:42.032889303Z",
  "refresh_token": "Gi9XkY7YW2UEr765Pou0665oK7MyqVBkn6aUwLiw3cY",
  "refresh_expires_at": "2026-10-29T02:50:42.032296916Z",
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
  "command_id": "58a818ac-0ae5-4984-b429-1c97b14a7b9e",
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
  "timestamp": "2026-10-28T14:50:42.000+0000",
  "channel": {
    "id": "1730052000.290457025",
    "linkedid": "1730052000.290457025",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675778908"
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
  "timestamp": "2026-10-28T14:50:42.000+0000",
  "channel": {
    "id": "1730052000.290457025",
    "linkedid": "1730052000.290457025",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675778908"
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
  "session_id": "33286760-9c23-4c9f-a505-360c7b07c112",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5NDMsImlhdCI6MTc5MzE5OTA0MywianRpIjoiYTU2ZjYzNDUtMDU3Mi00YTZiLThjOGItODYyNTkzNWRiYWM1Iiwic2lkIjoiMzMyODY3NjAtOWMyMy00YzlmLWE1MDUtMzYwYzdiMDdjMTEyIn0.3IT1JsQkpCC81OdeVRpnFMqlojvvFFqF6_ZWLsbnSEs",
  "access_expires_at": "2026-10-28T15:05:43.226100802Z",
  "refresh_token": "tVdVaFVNVd7FhzP3UPAkbKYnuzCtNGKBhStypPeIMzA",
  "refresh_expires_at": "2026-10-29T02:50:43.225497626Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a790f58f-d6e9-4b59-aede-075fc394d58e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675778908",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:50:42Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a790f58f-d6e9-4b59-aede-075fc394d58e/answer` → **200**

```json
{
  "command_id": "93f04b1b-00d7-435c-aa19-88980ec71f97"
}
```

```json
{
  "id": "a790f58f-d6e9-4b59-aede-075fc394d58e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675778908",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "order_ids": [],
  "started_at": "2026-10-28T14:50:42Z",
  "answered_at": "2026-10-28T14:50:43.805008Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.290457025",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c06ed4d5-356b-4ddd-a131-7fe2b07ba144",
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
  "id": "c5acdeed-02be-4a14-8fe3-cffbd8de995c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:55:44.130096Z",
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
  "command_id": "2390c511-8cfb-4ac5-8f78-1bef9d276ad1",
  "quote_id": "c5acdeed-02be-4a14-8fe3-cffbd8de995c",
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
    "phone": "+380675778908"
  },
  "call_id": "a790f58f-d6e9-4b59-aede-075fc394d58e"
}
```

```json
{
  "id": "8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8",
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
  "created_at": "2026-10-28T14:50:44.433343Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675778908"
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
    "id": "1730052000.290457025",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a790f58f-d6e9-4b59-aede-075fc394d58e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675778908",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [
        "8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8"
      ],
      "started_at": "2026-10-28T14:50:42Z",
      "answered_at": "2026-10-28T14:50:43.805008Z",
      "ended_at": "2026-10-28T14:50:44.738121Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "32e17538-8cd7-4661-93a3-53189ac18eb1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678857541",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [],
      "started_at": "2026-10-28T14:49:08.260512Z",
      "answered_at": "2026-10-28T14:49:08.586509Z",
      "ended_at": "2026-10-28T14:49:08.880937Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:49:14.240175Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8` → **200**

```json
{
  "id": "8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8",
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
  "created_at": "2026-10-28T14:50:44.433343Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675778908"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8` → **200**

```json
{
  "id": "8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8",
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
  "created_at": "2026-10-28T14:50:44.433343Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675778908"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8/cancel` → **200**

```json
{
  "command_id": "5461bc85-989c-4d2f-8ff4-b1e19d48228e",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8",
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
  "created_at": "2026-10-28T14:50:44.433343Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675778908"
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

Done: call a790f58f-d6e9-4b59-aede-075fc394d58e with order 8c33bd8f-4e43-4074-a0a6-d8ed1c1862b8.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27497"
}
```

```json
{
  "challenge_id": "91482275-c016-441e-9991-4836c5c69076",
  "expires_at": "2026-10-28T14:55:45.949476406Z",
  "resend_available_at": "2026-10-28T14:50:46.949476406Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "299971",
  "sent_at": "2026-10-28T14:50:45.951789369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91482275-c016-441e-9991-4836c5c69076",
  "code": "299971",
  "device_ref": "sandbox-27497"
}
```

```json
{
  "session_id": "4fb13cc0-634e-4c5e-8568-7cccc7070c84",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTk0NiwiaWF0IjoxNzkzMTk5MDQ2LCJqdGkiOiIzNmJjNDVhYi0xNjY3LTQ0YzQtYTMzMi1hODhiMTQyNDMyZDAiLCJzaWQiOiI0ZmIxM2NjMC02MzRlLTRjNWUtODU2OC03Y2NjYzcwNzBjODQifQ.xO3hsQ6oSgCZ1mEIpdopRt82vFLX7AQXoDuCTBNdL_o",
  "access_expires_at": "2026-10-28T15:05:46.261389982Z",
  "refresh_token": "DnRMz1Y2l9RK-6hrmFYiligeZbSafmk4gALC9oxvap8",
  "refresh_expires_at": "2026-11-27T14:50:46.260710663Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:33.923411Z",
  "last_location_at": "2026-10-28T14:50:33.923411Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/handover` → **200**

```json
{
  "command_id": "f5153a15-3ba0-45f0-8cef-9c239ee4c38c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:33.923411Z",
  "last_location_at": "2026-10-28T14:50:33.923411Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:47Z",
    "sequence": 1793199047873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:47.107694Z",
  "last_location_at": "2026-10-28T14:50:47.107694Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660978839",
  "device_ref": "sandbox-5836"
}
```

```json
{
  "challenge_id": "3c63ef20-ce20-4d40-b22f-54fb54d01b97",
  "expires_at": "2026-10-28T14:55:47.385733752Z",
  "resend_available_at": "2026-10-28T14:50:48.385733752Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660978839` → **200**

```json
{
  "phone": "+380660978839",
  "audience": "CLIENT",
  "code": "621210",
  "sent_at": "2026-10-28T14:50:47.388515267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c63ef20-ce20-4d40-b22f-54fb54d01b97",
  "code": "621210",
  "device_ref": "sandbox-5836"
}
```

```json
{
  "session_id": "35916709-68f8-4958-abde-eb7758987a05",
  "subject": {
    "type": "CLIENT",
    "id": "8ea49f61-cef4-411e-9132-8cb3b97d9dc1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWE0OWY2MS1jZWY0LTQxMWUtOTEzMi04Y2IzYjk3ZDlkYzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTQ3LCJpYXQiOjE3OTMxOTkwNDcsImp0aSI6IjRmMGQ3MWE2LWRlYzUtNGQ0Zi1iZmFiLTBmZWNmMTE3NzY4YiIsInNpZCI6IjM1OTE2NzA5LTY4ZjgtNDk1OC1hYmRlLWViNzc1ODk4N2EwNSJ9.ZMWkknW4WLESiSHu8xgFmCAevDDuHseGvr4IvSpVDpo",
  "access_expires_at": "2026-10-28T15:05:47.686873585Z",
  "refresh_token": "gc2vkkhE9TG4JM5xQIHeArTq8VznKZikg2V18Kf3mLk",
  "refresh_expires_at": "2026-11-27T14:50:47.686341318Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "53bc5a8f-ab39-4f45-8040-65da0c91e5aa",
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
  "id": "e633eaa5-1b24-45d3-b7e5-38308ed3f9b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:55:47.963532Z",
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
  "command_id": "b5e43087-e7d4-499d-8f04-416375e7fe32",
  "quote_id": "e633eaa5-1b24-45d3-b7e5-38308ed3f9b0",
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
  "id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8ea49f61-cef4-411e-9132-8cb3b97d9dc1",
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
  "created_at": "2026-10-28T14:50:48.248183Z",
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
    "id": "01a0ffbd-d0ca-4e3f-8dec-eca964cd7f49",
    "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
    "expires_at": "2026-10-28T14:51:03.252316Z",
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

`POST /api/driver/v1/offers/01a0ffbd-d0ca-4e3f-8dec-eca964cd7f49/accept` → **200**

```json
{
  "command_id": "6466aea2-6918-4a30-bf6a-973763d4af26"
}
```

```json
{
  "id": "a8ed11e4-d31c-4079-914e-7851d4f7f160",
  "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c9e691de-6b9d-49a3-8329-98d431aac607",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c9e691de-6b9d-49a3-8329-98d431aac607",
  "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
  "assignment_id": "a8ed11e4-d31c-4079-914e-7851d4f7f160",
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

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:49Z",
    "sequence": 1793199049358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:49.384345Z",
  "last_location_at": "2026-10-28T14:50:49.384345Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c9e691de-6b9d-49a3-8329-98d431aac607/arrive` → **200**

```json
{
  "command_id": "7bc32b0d-f359-4be9-8e93-bc5cf6dda0ac",
  "expected_version": 0
}
```

```json
{
  "id": "c9e691de-6b9d-49a3-8329-98d431aac607",
  "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
  "assignment_id": "a8ed11e4-d31c-4079-914e-7851d4f7f160",
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
  "arrived_at": "2026-10-28T14:50:49.664413Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c9e691de-6b9d-49a3-8329-98d431aac607/start` → **200**

```json
{
  "command_id": "0f67e905-c55a-474a-84d0-5200bfbb5a6a",
  "expected_version": 1
}
```

```json
{
  "id": "c9e691de-6b9d-49a3-8329-98d431aac607",
  "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
  "assignment_id": "a8ed11e4-d31c-4079-914e-7851d4f7f160",
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
  "arrived_at": "2026-10-28T14:50:49.664413Z",
  "started_at": "2026-10-28T14:50:49.937113Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:50Z",
    "sequence": 1793199050211
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:50.231097Z",
  "last_location_at": "2026-10-28T14:50:50.231097Z",
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
  "device_ref": "sandbox-3045"
}
```

```json
{
  "challenge_id": "452fbcc5-4a33-4b1b-85eb-f22a63375f5d",
  "expires_at": "2026-10-28T14:55:50.508537902Z",
  "resend_available_at": "2026-10-28T14:50:51.508537902Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "209353",
  "sent_at": "2026-10-28T14:50:50.51114656Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "452fbcc5-4a33-4b1b-85eb-f22a63375f5d",
  "code": "209353",
  "device_ref": "sandbox-3045"
}
```

```json
{
  "session_id": "df1f2401-f7c9-4767-a864-c4efceab4d17",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTk1MCwiaWF0IjoxNzkzMTk5MDUwLCJqdGkiOiJlMzA3OTUxZS05ZWM2LTQyN2MtOWMxYS1lYzhiY2YwZjg2ZjIiLCJzaWQiOiJkZjFmMjQwMS1mN2M5LTQ3NjctYTg2NC1jNGVmY2VhYjRkMTcifQ.iURb7nOTNnWLJ-A8Eghhs7JojoXsngmTG1TQFISW-04",
  "access_expires_at": "2026-10-28T15:05:50.813064401Z",
  "refresh_token": "nvpCrzShm2ZkUrBFiQXRoY7s0bU8zpxAblScssojrvA",
  "refresh_expires_at": "2026-11-27T14:50:50.812384974Z",
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
  "command_id": "d5f4c65f-df70-4ea8-81cf-47f98a76bcac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:51Z",
    "sequence": 1793199051354
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275",
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
  "last_heartbeat_at": "2026-10-28T14:50:51.373056Z",
  "last_location_at": "2026-10-28T14:50:51.373056Z",
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
  "session_id": "dad53cce-5682-4e66-bd10-2568c85a647a",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5NTEsImlhdCI6MTc5MzE5OTA1MSwianRpIjoiOTM4NzhmY2QtNjU4Yy00MmQyLWE0MTItY2M4Y2Q4NWE1MDljIiwic2lkIjoiZGFkNTNjY2UtNTY4Mi00ZTY2LWJkMTAtMjU2OGM4NWE2NDdhIn0.rfjr7zzQZHt3-v-v_C26Ht4LkZof8rgeKw7QwOXS46g",
  "access_expires_at": "2026-10-28T15:05:51.941087711Z",
  "refresh_token": "3oa4QAxAUF1AP6eOx2Vcgdqyz705NCJwzutlHxEgvZ8",
  "refresh_expires_at": "2026-10-29T02:50:51.940523077Z",
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
  "session_id": "048cf8c6-f3e2-4aed-ba9d-745ae1d08501",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5NTIsImlhdCI6MTc5MzE5OTA1MiwianRpIjoiZDE2ZmY4OTQtNDVkOS00YjA3LWE5NDEtNGIyM2NkMGJmN2Q1Iiwic2lkIjoiMDQ4Y2Y4YzYtZjNlMi00YWVkLWJhOWQtNzQ1YWUxZDA4NTAxIn0.GzQtzO-HfWjtoZM5_uX5vUj5Fq8iZoZ-QtEgy4C5mSQ",
  "access_expires_at": "2026-10-28T15:05:52.515064835Z",
  "refresh_token": "bEnKgyijNxLyNPu2-ncYmdmysLfvGeflLK8EUqVO5_g",
  "refresh_expires_at": "2026-10-29T02:50:52.514367019Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/343385e5-631e-4c62-8fb5-04413e4fbc6e` → **200**

```json
{
  "id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8ea49f61-cef4-411e-9132-8cb3b97d9dc1",
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
    "id": "a8ed11e4-d31c-4079-914e-7851d4f7f160",
    "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c9e691de-6b9d-49a3-8329-98d431aac607",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:50:48.248183Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/343385e5-631e-4c62-8fb5-04413e4fbc6e/interrupt` → **200**

```json
{
  "command_id": "58afe31e-f4f9-4778-a7dc-91a1dc073ee0",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "8ea49f61-cef4-411e-9132-8cb3b97d9dc1",
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
      "id": "a8ed11e4-d31c-4079-914e-7851d4f7f160",
      "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "c9e691de-6b9d-49a3-8329-98d431aac607",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:50:48.248183Z",
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
    "id": "2e1dd418-f5ba-40ce-ac7e-98c90aa3486d",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "8ea49f61-cef4-411e-9132-8cb3b97d9dc1",
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
    "id": "aef8659a-406a-467b-b24c-40d72ab72697",
    "order_id": "2e1dd418-f5ba-40ce-ac7e-98c90aa3486d",
    "expires_at": "2026-10-28T14:51:08.099155Z",
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

`POST /api/driver/v1/offers/aef8659a-406a-467b-b24c-40d72ab72697/accept` → **200**

```json
{
  "command_id": "bb9a7271-b050-4d78-b231-6b2e87cbad3c"
}
```

```json
{
  "id": "c31244a2-a9fe-4474-936f-554f5af99ffe",
  "order_id": "2e1dd418-f5ba-40ce-ac7e-98c90aa3486d",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d8c7e6fb-271c-4c2d-a335-0bc2d19ebe4c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d8c7e6fb-271c-4c2d-a335-0bc2d19ebe4c",
  "order_id": "2e1dd418-f5ba-40ce-ac7e-98c90aa3486d",
  "assignment_id": "c31244a2-a9fe-4474-936f-554f5af99ffe",
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
  "session_id": "ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275",
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
  "last_heartbeat_at": "2026-10-28T14:50:51.373056Z",
  "last_location_at": "2026-10-28T14:50:51.373056Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:50:54Z",
    "sequence": 1793199054496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275",
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
  "last_heartbeat_at": "2026-10-28T14:50:54.515841Z",
  "last_location_at": "2026-10-28T14:50:54.515841Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d8c7e6fb-271c-4c2d-a335-0bc2d19ebe4c/arrive` → **200**

```json
{
  "command_id": "65332485-1536-4652-8f46-aef6ebc7c763",
  "expected_version": 0
}
```

```json
{
  "id": "d8c7e6fb-271c-4c2d-a335-0bc2d19ebe4c",
  "order_id": "2e1dd418-f5ba-40ce-ac7e-98c90aa3486d",
  "assignment_id": "c31244a2-a9fe-4474-936f-554f5af99ffe",
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
  "arrived_at": "2026-10-28T14:50:54.795172Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d8c7e6fb-271c-4c2d-a335-0bc2d19ebe4c/start` → **200**

```json
{
  "command_id": "dd6880e8-0f14-4f93-a1db-7eab6baf2a88",
  "expected_version": 1
}
```

```json
{
  "id": "d8c7e6fb-271c-4c2d-a335-0bc2d19ebe4c",
  "order_id": "2e1dd418-f5ba-40ce-ac7e-98c90aa3486d",
  "assignment_id": "c31244a2-a9fe-4474-936f-554f5af99ffe",
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
  "arrived_at": "2026-10-28T14:50:54.795172Z",
  "started_at": "2026-10-28T14:50:55.079872Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d8c7e6fb-271c-4c2d-a335-0bc2d19ebe4c/complete` → **200**

```json
{
  "command_id": "7ecb3e71-9358-4b94-ae49-5a206aa5fa99",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:50:55Z"
}
```

```json
{
  "id": "d8c7e6fb-271c-4c2d-a335-0bc2d19ebe4c",
  "order_id": "2e1dd418-f5ba-40ce-ac7e-98c90aa3486d",
  "assignment_id": "c31244a2-a9fe-4474-936f-554f5af99ffe",
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
  "arrived_at": "2026-10-28T14:50:54.795172Z",
  "started_at": "2026-10-28T14:50:55.079872Z",
  "completed_at": "2026-10-28T14:50:55.37092Z",
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
    "id": "2e1dd418-f5ba-40ce-ac7e-98c90aa3486d",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:50:53.089852Z",
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
    "id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:50:48.248183Z",
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

`GET /api/operator/v1/orders/343385e5-631e-4c62-8fb5-04413e4fbc6e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:50:48.248735Z",
      "actor": {
        "type": "CLIENT",
        "id": "8ea49f61-cef4-411e-9132-8cb3b97d9dc1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
        "quote_id": "e633eaa5-1b24-45d3-b7e5-38308ed3f9b0",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "3a198837-117f-40fe-aa51-6338ed28b2b2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:50:48.251222Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
        "attempt_id": "dfa79e2a-d381-462c-8952-b9a9944ddaf2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3a198837-117f-40fe-aa51-6338ed28b2b2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:50:48.255412Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "01a0ffbd-d0ca-4e3f-8dec-eca964cd7f49",
        "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "3a198837-117f-40fe-aa51-6338ed28b2b2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:50:48.826265Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "01a0ffbd-d0ca-4e3f-8dec-eca964cd7f49",
        "order_id": "343385e5-631e-4c62-8fb5-04413e4fbc6e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a8ed11e4-d31c-4079-914e-7851d4f7f160"
      },
      "correlation_id": "a6417db4-2509-46f4-a2a9-ae8ab0af993a"
```

Done: interrupted 343385e5-631e-4c62-8fb5-04413e4fbc6e, follow-up 2e1dd418-f5ba-40ce-ac7e-98c90aa3486d.

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
  "session_id": "7545424b-2f31-40ec-9038-d6bc8efd2905",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5NTksImlhdCI6MTc5MzE5OTA1OSwianRpIjoiNTkyMDNkMzMtZWZkMi00NGE3LTg4MTAtNmVmNzk1MmJmYzFmIiwic2lkIjoiNzU0NTQyNGItMmYzMS00MGVjLTkwMzgtZDZiYzhlZmQyOTA1In0.Bh4pyHBftbwUTxnbsmsj6uxRO2uwxW3pugcx96sm3-M",
  "access_expires_at": "2026-10-28T15:05:59.770087087Z",
  "refresh_token": "oO__ewWX2BZCRRqPtxUVRlkQJS3W9aE2--0BJUPPfy0",
  "refresh_expires_at": "2026-10-29T02:50:59.769470535Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "af21aabe-bb7c-4800-a9bb-f0593aae1545",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:51:00Z"
}
```

```json
{
  "id": "84841313-d345-4bbc-adc8-15ddbd4664a2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:51:00Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/84841313-d345-4bbc-adc8-15ddbd4664a2/publish` → **200**

```json
{
  "command_id": "20d862fa-7c40-4373-ab8b-35ebe5959cd9",
  "expected_version": 0
}
```

```json
{
  "id": "84841313-d345-4bbc-adc8-15ddbd4664a2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:51:00.368988Z",
  "published_at": "2026-10-28T14:51:00.368988Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "84841313-d345-4bbc-adc8-15ddbd4664a2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:51:00.368988Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631554943",
  "device_ref": "sandbox-26526"
}
```

```json
{
  "challenge_id": "5df858d2-a341-4f72-a987-f2da09756075",
  "expires_at": "2026-10-28T14:56:00.998300621Z",
  "resend_available_at": "2026-10-28T14:51:01.998300621Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631554943` → **200**

```json
{
  "phone": "+380631554943",
  "audience": "CLIENT",
  "code": "428263",
  "sent_at": "2026-10-28T14:51:01.001577532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5df858d2-a341-4f72-a987-f2da09756075",
  "code": "428263",
  "device_ref": "sandbox-26526"
}
```

```json
{
  "session_id": "f4295f7a-be62-45b5-9c0a-fd8335031696",
  "subject": {
    "type": "CLIENT",
    "id": "6c1b7d61-1bcf-42d1-8780-2da8f2293a43"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzFiN2Q2MS0xYmNmLTQyZDEtODc4MC0yZGE4ZjIyOTNhNDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTYxLCJpYXQiOjE3OTMxOTkwNjEsImp0aSI6IjkxOGNjNTgyLTY5MTgtNDA3MC1iMjI2LTViYWRhNDEzYjY5MiIsInNpZCI6ImY0Mjk1ZjdhLWJlNjItNDViNS05YzBhLWZkODMzNTAzMTY5NiJ9.pXCFfCHf8w6nHsP1ayK2RK5UbBW7zN1fOBM1lFbW64M",
  "access_expires_at": "2026-10-28T15:06:01.3180492Z",
  "refresh_token": "KEx--sE03uZqcg-zW63K7Icvi_0tMpqPfYPr3QgzvgE",
  "refresh_expires_at": "2026-11-27T14:51:01.317421427Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "84841313-d345-4bbc-adc8-15ddbd4664a2",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:51:00.368988Z",
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
  "command_id": "830bb12e-f342-4ace-ac1c-41624532c4f1",
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
  "id": "ba4e99df-0d03-4bf2-84b0-948d69130f8c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:01.884451Z",
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
  "command_id": "5e6f5865-3076-438b-9157-ba84d40fab7d",
  "quote_id": "ba4e99df-0d03-4bf2-84b0-948d69130f8c",
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
  "correlation_id": "585f5433-286f-4e6a-bd36-7e5de2102c73"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "4ad06c56-1a89-4b74-832a-0eac77d2b701",
  "version_id": "84841313-d345-4bbc-adc8-15ddbd4664a2",
  "language": "uk"
}
```

```json
{
  "version_id": "84841313-d345-4bbc-adc8-15ddbd4664a2",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:51:02.450354Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "572fb74b-c87c-46cc-84bd-1b8b8e0e52f6",
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
  "id": "a85f6c6c-0409-4a24-bb56-c08228b3f313",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:02.733961Z",
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
  "command_id": "fede90ed-ad87-4f16-bc26-563353353b92",
  "quote_id": "a85f6c6c-0409-4a24-bb56-c08228b3f313",
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
  "id": "914d6ec7-018a-49bf-acc3-8ac00b03b875",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c1b7d61-1bcf-42d1-8780-2da8f2293a43",
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
  "created_at": "2026-10-28T14:51:03.01386Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/914d6ec7-018a-49bf-acc3-8ac00b03b875` → **200**

```json
{
  "id": "914d6ec7-018a-49bf-acc3-8ac00b03b875",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c1b7d61-1bcf-42d1-8780-2da8f2293a43",
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
  "created_at": "2026-10-28T14:51:03.01386Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/914d6ec7-018a-49bf-acc3-8ac00b03b875/cancel` → **200**

```json
{
  "command_id": "471b1c6e-14ad-4fb2-9da6-9c7dd33fca8f",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "914d6ec7-018a-49bf-acc3-8ac00b03b875",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6c1b7d61-1bcf-42d1-8780-2da8f2293a43",
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
  "created_at": "2026-10-28T14:51:03.01386Z",
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
  "discount_minor": 0
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/84841313-d345-4bbc-adc8-15ddbd4664a2` → **409**

```json
{
  "command_id": "b642561a-ddb9-4918-bac0-b01d639e5ff7",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:51:03Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/84841313-d345-4bbc-adc8-15ddbd4664a2",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "91e87938-911c-45c6-af1c-768c02e4f655"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "04119af1-1a3c-44f5-ae8c-573c2ad003ff",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:51:04Z"
}
```

```json
{
  "id": "61cc89fc-7442-421d-95b0-5f731fe43285",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:51:04Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/61cc89fc-7442-421d-95b0-5f731fe43285/publish` → **200**

```json
{
  "command_id": "0d9dd934-6d09-4561-9442-0d2f4cf5540b",
  "expected_version": 0
}
```

```json
{
  "id": "61cc89fc-7442-421d-95b0-5f731fe43285",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:51:04.466626Z",
  "published_at": "2026-10-28T14:51:04.466626Z",
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
  "device_ref": "sandbox-29263"
}
```

```json
{
  "challenge_id": "f9d4bae6-d68a-4f6a-98c1-2306d0744935",
  "expires_at": "2026-10-28T14:56:04.749580068Z",
  "resend_available_at": "2026-10-28T14:51:05.749580068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "172205",
  "sent_at": "2026-10-28T14:51:04.751820173Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9d4bae6-d68a-4f6a-98c1-2306d0744935",
  "code": "172205",
  "device_ref": "sandbox-29263"
}
```

```json
{
  "session_id": "8b15a42d-6e3c-4fc7-8e15-0f874f110365",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTk2NSwiaWF0IjoxNzkzMTk5MDY1LCJqdGkiOiIwOTE4MTY5ZS1iZDcwLTRjODMtYThiYS1jY2VkYmJlMGMwNjgiLCJzaWQiOiI4YjE1YTQyZC02ZTNjLTRmYzctOGUxNS0wZjg3NGYxMTAzNjUifQ.ne6FPBwb37JcxUYNZq4Ne9noucn5GDXvOOm1e9d0EQ0",
  "access_expires_at": "2026-10-28T15:06:05.051756698Z",
  "refresh_token": "vmnIBKXIG_hFv2s2BKZQJSEj2qgUpkwoVIAH9Qe8EDU",
  "refresh_expires_at": "2026-11-27T14:51:05.051149554Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275",
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
  "last_heartbeat_at": "2026-10-28T14:50:54.515841Z",
  "last_location_at": "2026-10-28T14:50:54.515841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275/handover` → **200**

```json
{
  "command_id": "0d8a75ab-3452-4895-a05d-ddd471f69f4b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275",
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
  "last_heartbeat_at": "2026-10-28T14:50:54.515841Z",
  "last_location_at": "2026-10-28T14:50:54.515841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:51:05Z",
    "sequence": 1793199065862
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275",
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
  "last_heartbeat_at": "2026-10-28T14:51:05.883049Z",
  "last_location_at": "2026-10-28T14:51:05.883049Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673548450",
  "device_ref": "sandbox-24599"
}
```

```json
{
  "challenge_id": "c6336643-71d7-442e-8930-6baac186004b",
  "expires_at": "2026-10-28T14:56:06.159163544Z",
  "resend_available_at": "2026-10-28T14:51:07.159163544Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673548450` → **200**

```json
{
  "phone": "+380673548450",
  "audience": "CLIENT",
  "code": "446839",
  "sent_at": "2026-10-28T14:51:06.16160795Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6336643-71d7-442e-8930-6baac186004b",
  "code": "446839",
  "device_ref": "sandbox-24599"
}
```

```json
{
  "session_id": "6d3f8e8c-758a-4f43-8946-4d72fd8e5638",
  "subject": {
    "type": "CLIENT",
    "id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGY4ZWI5My0xZjhiLTQ3YWUtOWZkYy01NzM4MmJiY2RmMDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTY2LCJpYXQiOjE3OTMxOTkwNjYsImp0aSI6IjU0MjMzMmYzLTk2MWEtNDU5MC04ODk1LWZmNzYwZDQyOGY4OSIsInNpZCI6IjZkM2Y4ZThjLTc1OGEtNGY0My04OTQ2LTRkNzJmZDhlNTYzOCJ9.KmI4Uz8T8OXHjphNEJxDMi2yfJ2inQ51PXNjCiQtmEU",
  "access_expires_at": "2026-10-28T15:06:06.449110605Z",
  "refresh_token": "lZHcWK_ItmhotjJjz0q_4AHYwKso1UA7KUve5AH0L0E",
  "refresh_expires_at": "2026-11-27T14:51:06.448563993Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6368f2bc-402d-4b16-8657-3baf2ae336c8",
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
  "id": "04622ee0-e06e-4f3d-be75-5b1227d60525",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:06.731677Z",
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
  "command_id": "6aded39f-25eb-4e32-b157-20934072de1d",
  "quote_id": "04622ee0-e06e-4f3d-be75-5b1227d60525",
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
    "phone": "+380672372154"
  }
}
```

```json
{
  "id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:51:07.013342Z",
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
    "id": "476ed41b-7687-4582-9fba-56b7934abaf1",
    "order_id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
    "expires_at": "2026-10-28T14:51:22.016693Z",
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

`POST /api/driver/v1/offers/476ed41b-7687-4582-9fba-56b7934abaf1/accept` → **200**

```json
{
  "command_id": "f2bc76ea-fb0a-4fb5-a3af-134278361ef2"
}
```

```json
{
  "id": "b6f81ff3-d175-469d-b124-0d57f286380b",
  "order_id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "486ee386-f99a-4223-9d3f-ecde09cc5372",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "486ee386-f99a-4223-9d3f-ecde09cc5372",
  "order_id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
  "assignment_id": "b6f81ff3-d175-469d-b124-0d57f286380b",
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
    "phone": "+380672372154"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e6d25d8-5a43-4e4c-a591-f641cd8e6f01",
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
  "id": "4df9071c-61a0-4ab9-9be5-6badb9d3e287",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:08.202736Z",
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
  "command_id": "84b1aeff-b9e3-4bd4-ad86-be4f719fba37",
  "quote_id": "4df9071c-61a0-4ab9-9be5-6badb9d3e287",
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
  "id": "b5ce3d62-e2e8-49cd-83c2-8cc1417c62ea",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:51:08.488752Z",
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
  "command_id": "530a538d-858c-41cb-a48e-78ae3665cc15",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:51:08Z"
}
```

```json
{
  "id": "86fccfc8-d4bf-4f63-91f0-a32639c31d98",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:08.781574Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:51:08Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e9a3f4c6-853e-4129-83d2-7ed4a171a4e3",
  "quote_id": "86fccfc8-d4bf-4f63-91f0-a32639c31d98",
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
  "pickup_at": "2026-10-28T17:51:08Z"
}
```

```json
{
  "id": "d3dd5f16-3d62-4d29-a894-96f07e56c02b",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:51:09.072348Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:51:08Z",
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
  "command_id": "62ec95d0-56e4-48f6-8cc9-1b0c897455eb",
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
  "id": "e3550bba-529f-44c4-93b4-dbf617156c59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:09.383453Z",
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
  "command_id": "11a24a8b-f8af-4ab8-bbf2-4bbcae301789",
  "quote_id": "e3550bba-529f-44c4-93b4-dbf617156c59",
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
  "correlation_id": "62ad3249-054a-4b3f-b6dd-ba1c5461b075"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "d3dd5f16-3d62-4d29-a894-96f07e56c02b",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T14:51:09.072348Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:51:08Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "b5ce3d62-e2e8-49cd-83c2-8cc1417c62ea",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T14:51:08.488752Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "b5ce3d62-e2e8-49cd-83c2-8cc1417c62ea",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:51:08.488752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/fc89ed35-20cc-4b55-ab0a-d7f2ac305a02` → **200**

```json
{
  "id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b6f81ff3-d175-469d-b124-0d57f286380b",
    "order_id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "486ee386-f99a-4223-9d3f-ecde09cc5372",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:51:07.013342Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/fc89ed35-20cc-4b55-ab0a-d7f2ac305a02/cancel` → **200**

```json
{
  "command_id": "fd196506-8fef-4c65-82ac-31623f6547d5",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "b6f81ff3-d175-469d-b124-0d57f286380b",
    "order_id": "fc89ed35-20cc-4b55-ab0a-d7f2ac305a02",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "486ee386-f99a-4223-9d3f-ecde09cc5372",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:51:07.013342Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b5ce3d62-e2e8-49cd-83c2-8cc1417c62ea` → **200**

```json
{
  "id": "b5ce3d62-e2e8-49cd-83c2-8cc1417c62ea",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:51:08.488752Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b5ce3d62-e2e8-49cd-83c2-8cc1417c62ea/cancel` → **200**

```json
{
  "command_id": "b4239c80-86f6-4f2c-a927-0fa0d05ac4f5",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b5ce3d62-e2e8-49cd-83c2-8cc1417c62ea",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T14:51:08.488752Z",
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
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d3dd5f16-3d62-4d29-a894-96f07e56c02b` → **200**

```json
{
  "id": "d3dd5f16-3d62-4d29-a894-96f07e56c02b",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:51:09.072348Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:51:08Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d3dd5f16-3d62-4d29-a894-96f07e56c02b/cancel` → **200**

```json
{
  "command_id": "6d1f56f1-3547-4f48-bcbe-df4d5b801999",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d3dd5f16-3d62-4d29-a894-96f07e56c02b",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "14f8eb93-1f8b-47ae-9fdc-57382bbcdf09",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T14:51:09.072348Z",
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
  "pickup_at": "2026-10-28T17:51:08Z",
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
  "session_id": "ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275",
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
  "last_heartbeat_at": "2026-10-28T14:51:05.883049Z",
  "last_location_at": "2026-10-28T14:51:05.883049Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ec8bafb2-3dc8-4a3d-92f3-18d07d5f6275/close` → **200**

```json
{
  "command_id": "277d72ee-b4ac-4623-828c-750817fdccd6",
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

Done: orders fc89ed35-20cc-4b55-ab0a-d7f2ac305a02, b5ce3d62-e2e8-49cd-83c2-8cc1417c62ea, d3dd5f16-3d62-4d29-a894-96f07e56c02b.

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
  "session_id": "c7500abf-ed93-4a80-83e3-c44c61b387b5",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5NzMsImlhdCI6MTc5MzE5OTA3MywianRpIjoiMDBmYWQwYTktNTdkNC00Nzk3LThkODYtZGYzMDViODhkZjAxIiwic2lkIjoiYzc1MDBhYmYtZWQ5My00YTgwLTgzZTMtYzQ0YzYxYjM4N2I1In0.3XFt-iQYiL_cY86CXzT8drI1yDHotNPFUE7AaRfWqNk",
  "access_expires_at": "2026-10-28T15:06:13.043822846Z",
  "refresh_token": "rfiQjOTU1HHtinfysarK8pDqu6SsyCMLgKGDck03A00",
  "refresh_expires_at": "2026-10-29T02:51:13.043250547Z",
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
  "session_id": "701ae9f5-dc57-4886-a302-f91dc492185a",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5NzMsImlhdCI6MTc5MzE5OTA3MywianRpIjoiZjY0NDQ1MjgtYTUyMi00M2U0LWIxZGEtNThmYWRhNzZlNTA3Iiwic2lkIjoiNzAxYWU5ZjUtZGM1Ny00ODg2LWEzMDItZjkxZGM0OTIxODVhIn0.uDyx_7uuamAD1C5O6ldPMVJ7nbsEOwZE7HFjkXFvdng",
  "access_expires_at": "2026-10-28T15:06:13.601029304Z",
  "refresh_token": "C5EKkrRxy4klt4UE2VyUlWKkE3hFh4BGY-_SUVQqdWs",
  "refresh_expires_at": "2026-10-29T02:51:13.600520183Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30218"
}
```

```json
{
  "challenge_id": "c73ed343-dea2-4527-a2d9-e1cb165e6362",
  "expires_at": "2026-10-28T14:56:13.857923548Z",
  "resend_available_at": "2026-10-28T14:51:14.857923548Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "751808",
  "sent_at": "2026-10-28T14:51:13.860378426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c73ed343-dea2-4527-a2d9-e1cb165e6362",
  "code": "751808",
  "device_ref": "sandbox-30218"
}
```

```json
{
  "session_id": "1e3f673c-a38d-4bb6-ad24-54425dcdba8a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5OTk3NCwiaWF0IjoxNzkzMTk5MDc0LCJqdGkiOiIyZDgxODhlMS0xZjFlLTRhYjEtODYwZi03MDdmMjM2ODRlNTQiLCJzaWQiOiIxZTNmNjczYy1hMzhkLTRiYjYtYWQyNC01NDQyNWRjZGJhOGEifQ.WEkMTkX7lQ2SDW7Y2s2ka818CKmM-_46acX7vnFHjf0",
  "access_expires_at": "2026-10-28T15:06:14.164503627Z",
  "refresh_token": "inByjqZAF112ZKyaRpTvRFkrH6a_OHwXu1Ir4VLU4iY",
  "refresh_expires_at": "2026-11-27T14:51:14.163932761Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:50.231097Z",
  "last_location_at": "2026-10-28T14:50:50.231097Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/handover` → **200**

```json
{
  "command_id": "649106d0-f31b-409d-9485-4eef0e55e72c",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:50:50.231097Z",
  "last_location_at": "2026-10-28T14:50:50.231097Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:51:14Z",
    "sequence": 1793199074980
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:51:14.999943Z",
  "last_location_at": "2026-10-28T14:51:14.999943Z",
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
  "command_id": "27a72168-1849-4927-a5b6-adf989a0bfd1",
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
  "effective_at": "2026-10-28T14:51:15.580154Z",
  "changed_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:51:15.858587737Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e530bfca-d866-44b5-a379-647a7832adf3",
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
  "id": "14d03977-16bd-4217-a5b0-9c07097150eb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:16.132239Z",
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
  "command_id": "8b1f579f-5e52-4ce8-91fe-207fb0b38125",
  "quote_id": "14d03977-16bd-4217-a5b0-9c07097150eb",
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
    "phone": "+380671115215"
  }
}
```

```json
{
  "id": "51b3a758-961e-4853-aa3f-70d8ddc8f0ef",
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
  "created_at": "2026-10-28T14:51:16.420465Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115215"
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
    "id": "8ef0ea15-9fdf-43c2-90d8-409f970f3410",
    "order_id": "51b3a758-961e-4853-aa3f-70d8ddc8f0ef",
    "expires_at": "2026-10-28T14:51:31.423801Z",
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

`POST /api/driver/v1/offers/8ef0ea15-9fdf-43c2-90d8-409f970f3410/accept` → **200**

```json
{
  "command_id": "aab49959-ced6-43a4-9995-76ffb326c107"
}
```

```json
{
  "id": "b60c02fb-3f5f-4894-a577-c1353f1e681a",
  "order_id": "51b3a758-961e-4853-aa3f-70d8ddc8f0ef",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "429b2526-34d5-4f68-9af3-57ad3682bc96",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "429b2526-34d5-4f68-9af3-57ad3682bc96",
  "order_id": "51b3a758-961e-4853-aa3f-70d8ddc8f0ef",
  "assignment_id": "b60c02fb-3f5f-4894-a577-c1353f1e681a",
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
    "phone": "+380671115215"
  }
}
```

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:51:17Z",
    "sequence": 1793199077518
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:51:17.538433Z",
  "last_location_at": "2026-10-28T14:51:17.538433Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/429b2526-34d5-4f68-9af3-57ad3682bc96/arrive` → **200**

```json
{
  "command_id": "a6710b07-bf28-42fe-a16d-a83f16daef21",
  "expected_version": 0
}
```

```json
{
  "id": "429b2526-34d5-4f68-9af3-57ad3682bc96",
  "order_id": "51b3a758-961e-4853-aa3f-70d8ddc8f0ef",
  "assignment_id": "b60c02fb-3f5f-4894-a577-c1353f1e681a",
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
  "arrived_at": "2026-10-28T14:51:17.8331Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115215"
  }
}
```

`POST /api/driver/v1/trips/429b2526-34d5-4f68-9af3-57ad3682bc96/start` → **200**

```json
{
  "command_id": "89208648-7b73-4a89-8b9d-72387f31620a",
  "expected_version": 1
}
```

```json
{
  "id": "429b2526-34d5-4f68-9af3-57ad3682bc96",
  "order_id": "51b3a758-961e-4853-aa3f-70d8ddc8f0ef",
  "assignment_id": "b60c02fb-3f5f-4894-a577-c1353f1e681a",
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
  "arrived_at": "2026-10-28T14:51:17.8331Z",
  "started_at": "2026-10-28T14:51:18.1219Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115215"
  }
}
```

`POST /api/driver/v1/trips/429b2526-34d5-4f68-9af3-57ad3682bc96/complete` → **200**

```json
{
  "command_id": "999b92ca-3494-42d2-a6e8-bd8353e13c41",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:51:18Z",
  "cash_received": true
}
```

```json
{
  "id": "429b2526-34d5-4f68-9af3-57ad3682bc96",
  "order_id": "51b3a758-961e-4853-aa3f-70d8ddc8f0ef",
  "assignment_id": "b60c02fb-3f5f-4894-a577-c1353f1e681a",
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
  "arrived_at": "2026-10-28T14:51:17.8331Z",
  "started_at": "2026-10-28T14:51:18.1219Z",
  "completed_at": "2026-10-28T14:51:18.40843Z",
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
  "command_id": "ca3671dc-968b-4cf1-83b4-676e5edf9ab6",
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
  "id": "d1c9a324-9bdb-4028-b389-6a2f2e4e0f6e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:18.697361Z",
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
  "command_id": "6ee89d01-2acd-4a84-b1e6-3d933dd3b214",
  "quote_id": "d1c9a324-9bdb-4028-b389-6a2f2e4e0f6e",
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
    "phone": "+380671116922"
  }
}
```

```json
{
  "id": "1173a21d-0923-464b-81b6-b08a52aa0cb7",
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
  "created_at": "2026-10-28T14:51:18.97823Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116922"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/1173a21d-0923-464b-81b6-b08a52aa0cb7` → **200**

```json
{
  "id": "1173a21d-0923-464b-81b6-b08a52aa0cb7",
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
  "created_at": "2026-10-28T14:51:18.97823Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116922"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1173a21d-0923-464b-81b6-b08a52aa0cb7/cancel` → **200**

```json
{
  "command_id": "085a9cd1-9882-4591-9175-1b48bd67ac21",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "1173a21d-0923-464b-81b6-b08a52aa0cb7",
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
  "created_at": "2026-10-28T14:51:18.97823Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671116922"
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
  "staff_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:51:18.414086Z",
  "last_entries": [
    {
      "order_id": "1173a21d-0923-464b-81b6-b08a52aa0cb7",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:51:19.572334Z"
    },
    {
      "order_id": "51b3a758-961e-4853-aa3f-70d8ddc8f0ef",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:51:18.414086Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "350a3912-5b2b-4a55-a5b0-34065c5eb872",
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
  "last_heartbeat_at": "2026-10-28T14:51:17.538433Z",
  "last_location_at": "2026-10-28T14:51:17.538433Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/350a3912-5b2b-4a55-a5b0-34065c5eb872/close` → **200**

```json
{
  "command_id": "9ff0e788-2e32-4785-87ba-b2387f36bf09",
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

Done: operator bonus for fulfilled 51b3a758-961e-4853-aa3f-70d8ddc8f0ef and operator-fault cancellation 1173a21d-0923-464b-81b6-b08a52aa0cb7.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672272283",
  "device_ref": "sandbox-22495"
}
```

```json
{
  "challenge_id": "bad6b255-48d9-4ff8-a555-14c2cc7563e0",
  "expires_at": "2026-10-28T14:56:22.731334282Z",
  "resend_available_at": "2026-10-28T14:51:23.731334282Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672272283` → **200**

```json
{
  "phone": "+380672272283",
  "audience": "CLIENT",
  "code": "894233",
  "sent_at": "2026-10-28T14:51:22.733574246Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670669334",
  "device_ref": "sandbox-32740",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "73775d3a-1d82-48e2-aa66-cc816e095ea0",
  "expires_at": "2026-10-28T14:56:23.045171422Z",
  "resend_available_at": "2026-10-28T14:51:24.045171422Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670669334` → **200**

```json
{
  "phone": "+380670669334",
  "audience": "CLIENT",
  "code": "189693",
  "sent_at": "2026-10-28T14:51:23.047503217Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674810000",
  "device_ref": "sandbox-5309"
}
```

```json
{
  "challenge_id": "4b1dd011-76e4-4335-85b6-66b05a428715",
  "expires_at": "2026-10-28T14:56:23.36973627Z",
  "resend_available_at": "2026-10-28T14:51:24.36973627Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674810000` → **200**

```json
{
  "phone": "+380674810000",
  "audience": "CLIENT",
  "code": "019549",
  "sent_at": "2026-10-28T14:51:23.37241315Z",
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
  "session_id": "cc8bcd0c-cd15-4e78-b4d1-6fa6b19962c6",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5ODMsImlhdCI6MTc5MzE5OTA4MywianRpIjoiZmQ4ZTM3YjEtMjNmNS00ZjQ3LTgyM2UtMmMwYThhZTUwNGE3Iiwic2lkIjoiY2M4YmNkMGMtY2QxNS00ZTc4LWI0ZDEtNmZhNmIxOTk2MmM2In0.yNBNtBdUBkBI8xAqYWT5JcMc1pTqDvQz-bGGtzyt8nk",
  "access_expires_at": "2026-10-28T15:06:23.952021019Z",
  "refresh_token": "JGCOm0szHce9jQfsAzFwFqu34cuSov2eY_Ia7EqzK6s",
  "refresh_expires_at": "2026-10-29T02:51:23.951510426Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674810000` → **200**

```json
{
  "deliveries": [
    {
      "id": "f49c1cc2-3d84-496d-b537-c975615dbf0c",
      "challenge_id": "4b1dd011-76e4-4335-85b6-66b05a428715",
      "phone": "+380674810000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c9da156a-31bd-41ce-933f-f847cc8acc59",
      "error": null,
      "attempted_at": "2026-10-28T14:51:23.372657Z"
    },
    {
      "id": "bcd5e364-873f-49d7-8c32-37ea9c799459",
      "challenge_id": "4b1dd011-76e4-4335-85b6-66b05a428715",
      "phone": "+380674810000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:51:23.371912Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674810000` → **200**

```json
{
  "phone": "+380674810000",
  "audience": "CLIENT",
  "code": "019549",
  "sent_at": "2026-10-28T14:51:23.37241315Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670669334` → **200**

```json
{
  "deliveries": [
    {
      "id": "af58dc0b-f0e1-497b-810f-f41055769344",
      "challenge_id": "73775d3a-1d82-48e2-aa66-cc816e095ea0",
      "phone": "+380670669334",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-99a7bf29-c6ef-4818-a024-1f701473a595",
      "error": null,
      "attempted_at": "2026-10-28T14:51:23.047773Z"
    }
  ]
}
```

Done: SMS to +380672272283, a call to +380670669334, SMS then a call to +380674810000.

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
  "session_id": "dad87246-6a95-4342-aa85-f1c8bb824bc2",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5ODUsImlhdCI6MTc5MzE5OTA4NSwianRpIjoiM2M0MjZhNTQtZDFkYS00YjcyLWJmOGQtMWJiYTJkY2M5Nzk1Iiwic2lkIjoiZGFkODcyNDYtNmE5NS00MzQyLWFhODUtZjFjOGJiODI0YmMyIn0.6mbGVedEk-rHzbWyUXXM0UI4ulCi-fwCl-rWOHseTD4",
  "access_expires_at": "2026-10-28T15:06:25.108641166Z",
  "refresh_token": "m2qEMOpEk4gcimpPwJ5Y2xXPIEFnaZsMeCV1aFLRK5Q",
  "refresh_expires_at": "2026-10-29T02:51:25.108059279Z",
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
  "session_id": "df0170fb-4d6a-45e7-acc0-dea2a70b8321",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTk5ODUsImlhdCI6MTc5MzE5OTA4NSwianRpIjoiOTE2OWJmMjItZmI3NS00NzJkLWEzODAtZmNmMTE0MDVhYTRhIiwic2lkIjoiZGYwMTcwZmItNGQ2YS00NWU3LWFjYzAtZGVhMmE3MGI4MzIxIn0.zA8RQd_GxUWiItenb212J9zVPLKEGVplOvSTMBaPv54",
  "access_expires_at": "2026-10-28T15:06:25.67350584Z",
  "refresh_token": "xdNVEialMpmGq-vlMYGvTnL1dU4IVBIImZX3uXTPSzY",
  "refresh_expires_at": "2026-10-29T02:51:25.67284904Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
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

`POST /api/admin/v1/staff-extensions/d1292ae1-fa51-44ba-9131-a1cc8a246d3b` → **200**

```json
{
  "command_id": "e2f442c9-aebc-4cda-8814-871e589649c9",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "6e065eeb-e143-49eb-80e4-af255d851cf3",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:51:26.76706Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:51:26.76706Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a5d0beb1-b9c7-41a5-a1ca-aff346d259c8",
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
  "id": "6a1bb94e-147d-4fb9-9f73-6feba9bfd74b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:27.301694Z",
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
  "command_id": "18e2fb06-be22-48e0-b0a6-715e66c6722b",
  "quote_id": "6a1bb94e-147d-4fb9-9f73-6feba9bfd74b",
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
    "phone": "+380671193650"
  }
}
```

```json
{
  "id": "887063b5-dd35-4357-8f84-6a28f057535e",
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
  "created_at": "2026-10-28T14:51:27.586351Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671193650"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/887063b5-dd35-4357-8f84-6a28f057535e/calls` → **201**

```json
{
  "command_id": "0daad2ba-ad41-492f-9168-6c15cfc1200a",
  "to": "CALLER"
}
```

```json
{
  "id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "order_ids": [
    "887063b5-dd35-4357-8f84-6a28f057535e"
  ],
  "started_at": "2026-10-28T14:51:27.891578Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/887063b5-dd35-4357-8f84-6a28f057535e/calls` → **201**

```json
{
  "command_id": "0daad2ba-ad41-492f-9168-6c15cfc1200a",
  "to": "CALLER"
}
```

```json
{
  "id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "order_ids": [
    "887063b5-dd35-4357-8f84-6a28f057535e"
  ],
  "started_at": "2026-10-28T14:51:27.891578Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671193650",
    "at": "2026-10-28T14:51:27.894530483Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.25008",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=887063b5-dd35-4357-8f84-6a28f057535e` → **200**

```json
{
  "calls": [
    {
      "id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [
        "887063b5-dd35-4357-8f84-6a28f057535e"
      ],
      "started_at": "2026-10-28T14:51:27.891578Z",
      "answered_at": "2026-10-28T14:51:28.566875Z",
      "ended_at": "2026-10-28T14:51:28.589091Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=887063b5-dd35-4357-8f84-6a28f057535e` → **200**

```json
{
  "calls": [
    {
      "id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [
        "887063b5-dd35-4357-8f84-6a28f057535e"
      ],
      "started_at": "2026-10-28T14:51:27.891578Z",
      "answered_at": "2026-10-28T14:51:28.566875Z",
      "ended_at": "2026-10-28T14:51:28.589091Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=887063b5-dd35-4357-8f84-6a28f057535e` → **200**

```json
{
  "calls": [
    {
      "id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [
        "887063b5-dd35-4357-8f84-6a28f057535e"
      ],
      "started_at": "2026-10-28T14:51:27.891578Z",
      "answered_at": "2026-10-28T14:51:28.566875Z",
      "ended_at": "2026-10-28T14:51:28.589091Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=887063b5-dd35-4357-8f84-6a28f057535e` → **200**

```json
{
  "calls": [
    {
      "id": "f97141d3-7be6-4baf-bec0-dd33b1c1fd41",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "order_ids": [
        "887063b5-dd35-4357-8f84-6a28f057535e"
      ],
      "started_at": "2026-10-28T14:51:27.891578Z",
      "answered_at": "2026-10-28T14:51:28.566875Z",
      "ended_at": "2026-10-28T14:51:28.589091Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:51:34.281076Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/887063b5-dd35-4357-8f84-6a28f057535e` → **200**

```json
{
  "id": "887063b5-dd35-4357-8f84-6a28f057535e",
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
  "created_at": "2026-10-28T14:51:27.586351Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671193650"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/887063b5-dd35-4357-8f84-6a28f057535e/cancel` → **200**

```json
{
  "command_id": "996ed8d2-d01a-431c-b8cb-1181ed025e56",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "887063b5-dd35-4357-8f84-6a28f057535e",
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
  "created_at": "2026-10-28T14:51:27.586351Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671193650"
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
  "command_id": "a73fbd1d-ac53-4e28-969c-f3eae06c2c9a",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:51:36.346845Z",
  "extension": "101"
}
```

Done: outgoing call f97141d3-7be6-4baf-bec0-dd33b1c1fd41 from order 887063b5-dd35-4357-8f84-6a28f057535e, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636503435",
  "device_ref": "sandbox-814"
}
```

```json
{
  "challenge_id": "51553f7c-dd9b-41a9-9609-a67abad102d3",
  "expires_at": "2026-10-28T14:56:36.630867447Z",
  "resend_available_at": "2026-10-28T14:51:37.630867447Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636503435` → **200**

```json
{
  "phone": "+380636503435",
  "audience": "CLIENT",
  "code": "317094",
  "sent_at": "2026-10-28T14:51:36.633146584Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51553f7c-dd9b-41a9-9609-a67abad102d3",
  "code": "317094",
  "device_ref": "sandbox-814"
}
```

```json
{
  "session_id": "2f253632-017c-4246-80a9-0e258809f326",
  "subject": {
    "type": "CLIENT",
    "id": "cbae003c-4abb-4d07-83d4-c12dd554156e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYmFlMDAzYy00YWJiLTRkMDctODNkNC1jMTJkZDU1NDE1NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTk2LCJpYXQiOjE3OTMxOTkwOTYsImp0aSI6IjI1Nzc2Nzc2LTMxMWEtNDI1OC1hNDlmLTRlYzM5ZTQ5OWFjOSIsInNpZCI6IjJmMjUzNjMyLTAxN2MtNDI0Ni04MGE5LTBlMjU4ODA5ZjMyNiJ9.POICGOUe73VSeWIzjqE5B8hsPTxChLxcMx9aFKccSVo",
  "access_expires_at": "2026-10-28T15:06:36.929096993Z",
  "refresh_token": "PrdRR7UgGIVoaFsP74V4rp2WJ-9kLODqstVRpJdo4ZE",
  "refresh_expires_at": "2026-11-27T14:51:36.928531677Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cbae003c-4abb-4d07-83d4-c12dd554156e",
  "session_id": "2f253632-017c-4246-80a9-0e258809f326",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636503435",
  "device_ref": "sandbox-22224"
}
```

```json
{
  "challenge_id": "ae4b803b-d243-4b20-8d37-6f1879174524",
  "expires_at": "2026-10-28T14:56:39.466412366Z",
  "resend_available_at": "2026-10-28T14:51:40.466412366Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636503435` → **200**

```json
{
  "phone": "+380636503435",
  "audience": "CLIENT",
  "code": "287221",
  "sent_at": "2026-10-28T14:51:39.468437354Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae4b803b-d243-4b20-8d37-6f1879174524",
  "code": "287221",
  "device_ref": "sandbox-22224"
}
```

```json
{
  "session_id": "e3849319-032e-4831-bdee-ac97da8c7814",
  "subject": {
    "type": "CLIENT",
    "id": "cbae003c-4abb-4d07-83d4-c12dd554156e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYmFlMDAzYy00YWJiLTRkMDctODNkNC1jMTJkZDU1NDE1NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk5OTk5LCJpYXQiOjE3OTMxOTkwOTksImp0aSI6ImUxNzk3OTJjLTRjNTYtNGQxYy1hODFlLTZlMTI5MzMzOTc5NSIsInNpZCI6ImUzODQ5MzE5LTAzMmUtNDgzMS1iZGVlLWFjOTdkYThjNzgxNCJ9.3_EsrdYg8vhLrQP2MsgsP8UxTOvGwyPVG_DO6AGI6Ac",
  "access_expires_at": "2026-10-28T15:06:39.761909019Z",
  "refresh_token": "NhxT6R8pZhsIuSPbOSlOFTXPfs42bDTkG5aSswMPPOM",
  "refresh_expires_at": "2026-11-27T14:51:39.761264213Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "0d36224a-7862-4189-8b0c-2854e13cc7a1",
  "expires_at": "2026-10-28T14:56:42.03936458Z",
  "resend_available_at": "2026-10-28T14:51:43.03936458Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636503435` → **200**

```json
{
  "phone": "+380636503435",
  "audience": "CLIENT",
  "code": "852533",
  "sent_at": "2026-10-28T14:51:42.04146742Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639544374"
}
```

```json
{
  "challenge_id": "afa2b347-6058-4258-acc0-2ace6376abcf",
  "expires_at": "2026-10-28T14:56:42.331945602Z",
  "resend_available_at": "2026-10-28T14:51:43.331945602Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639544374` → **200**

```json
{
  "phone": "+380639544374",
  "audience": "CLIENT",
  "code": "706967",
  "sent_at": "2026-10-28T14:51:42.334269122Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "79b9da6a-71d7-4e23-883c-e1dd45e73245",
  "current_challenge_id": "0d36224a-7862-4189-8b0c-2854e13cc7a1",
  "current_code": "000000",
  "new_challenge_id": "afa2b347-6058-4258-acc0-2ace6376abcf",
  "new_code": "706967"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "70aec6b8-a86e-4b06-9f2d-2b0454f17e97"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "099d5874-18d3-4080-bf23-fe8ad9438556",
  "current_challenge_id": "0d36224a-7862-4189-8b0c-2854e13cc7a1",
  "current_code": "852533",
  "new_challenge_id": "afa2b347-6058-4258-acc0-2ace6376abcf",
  "new_code": "706967"
}
```

```json
{
  "subject_id": "cbae003c-4abb-4d07-83d4-c12dd554156e",
  "phone": "+380639544374",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cbae003c-4abb-4d07-83d4-c12dd554156e",
  "session_id": "2f253632-017c-4246-80a9-0e258809f326",
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
  "correlation_id": "e27837fa-5e4c-40b8-b2d9-999055552df6"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639544374",
  "device_ref": "sandbox-7956"
}
```

```json
{
  "challenge_id": "6bb33f37-ed2c-443e-a804-d4c97d4cad87",
  "expires_at": "2026-10-28T14:56:45.747827462Z",
  "resend_available_at": "2026-10-28T14:51:46.747827462Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639544374` → **200**

```json
{
  "phone": "+380639544374",
  "audience": "CLIENT",
  "code": "282902",
  "sent_at": "2026-10-28T14:51:45.750079217Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bb33f37-ed2c-443e-a804-d4c97d4cad87",
  "code": "282902",
  "device_ref": "sandbox-7956"
}
```

```json
{
  "session_id": "9ba93185-998d-41c6-a69c-3794096ef826",
  "subject": {
    "type": "CLIENT",
    "id": "cbae003c-4abb-4d07-83d4-c12dd554156e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYmFlMDAzYy00YWJiLTRkMDctODNkNC1jMTJkZDU1NDE1NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMDA2LCJpYXQiOjE3OTMxOTkxMDYsImp0aSI6IjkwNzkxNTg4LTgxNmMtNGM2ZS1iNWI3LWZhMjQxMWQ0NTExMiIsInNpZCI6IjliYTkzMTg1LTk5OGQtNDFjNi1hNjljLTM3OTQwOTZlZjgyNiJ9.GrhO0LOLbEnA_FsHdUC2V6l_loiJQ10yAR48rsVFkQ4",
  "access_expires_at": "2026-10-28T15:06:46.051603711Z",
  "refresh_token": "BTLg-9TQiesKD40Bb8YaMCM7J_CeGTEVa4_NixO4Dew",
  "refresh_expires_at": "2026-11-27T14:51:46.050621486Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cbae003c-4abb-4d07-83d4-c12dd554156e",
  "session_id": "9ba93185-998d-41c6-a69c-3794096ef826",
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
  "session_id": "31e5216a-da54-4804-adc8-e3d1a600441d",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwMDYsImlhdCI6MTc5MzE5OTEwNiwianRpIjoiZTc2N2NiOTItMjk2Mi00MmZiLTk2ZTItNzRlY2EzNzkwYzA1Iiwic2lkIjoiMzFlNTIxNmEtZGE1NC00ODA0LWFkYzgtZTNkMWE2MDA0NDFkIn0.pOEAoA8uB4zO-23jh4ebuJqS2Q59rQwROnnEBCvqzYY",
  "access_expires_at": "2026-10-28T15:06:46.877600257Z",
  "refresh_token": "Yv3_dxPfSMEsQcum_5ZKz0AvWPBcJmVjE9ERwPP4MmI",
  "refresh_expires_at": "2026-10-29T02:51:46.876995187Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/cbae003c-4abb-4d07-83d4-c12dd554156e` → **200**

```json
{
  "client": {
    "id": "cbae003c-4abb-4d07-83d4-c12dd554156e",
    "phone": "+380639544374",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:51:36.926777Z",
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

`POST /api/admin/v1/clients/cbae003c-4abb-4d07-83d4-c12dd554156e/phone` → **400**

```json
{
  "command_id": "6b0674b7-35f1-4510-995b-4473c0ff217f",
  "expected_version": 3,
  "phone": "+380636759646",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/cbae003c-4abb-4d07-83d4-c12dd554156e/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6af95f22-aa90-49f6-a687-58716697b5ca",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/cbae003c-4abb-4d07-83d4-c12dd554156e/phone` → **200**

```json
{
  "command_id": "aaae9579-5f84-46c5-bebe-3e901cc495df",
  "expected_version": 3,
  "phone": "+380636759646",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "cbae003c-4abb-4d07-83d4-c12dd554156e",
  "phone": "+380636759646",
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
  "correlation_id": "55de3109-5412-4bfa-9d95-7c68db33e13f"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636759646",
  "device_ref": "sandbox-2941"
}
```

```json
{
  "challenge_id": "7f750eba-2259-4509-9e44-4d5d1014c5e3",
  "expires_at": "2026-10-28T14:56:48.301418642Z",
  "resend_available_at": "2026-10-28T14:51:49.301418642Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636759646` → **200**

```json
{
  "phone": "+380636759646",
  "audience": "CLIENT",
  "code": "166032",
  "sent_at": "2026-10-28T14:51:48.303627057Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f750eba-2259-4509-9e44-4d5d1014c5e3",
  "code": "166032",
  "device_ref": "sandbox-2941"
}
```

```json
{
  "session_id": "f3b38e81-2b64-4ae3-9b9c-15375e68898b",
  "subject": {
    "type": "CLIENT",
    "id": "cbae003c-4abb-4d07-83d4-c12dd554156e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYmFlMDAzYy00YWJiLTRkMDctODNkNC1jMTJkZDU1NDE1NmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMDA4LCJpYXQiOjE3OTMxOTkxMDgsImp0aSI6ImU2NmM5NWY1LWU0OGEtNGE2ZS1iOWVjLWNkMTdmMzMxZDYyNCIsInNpZCI6ImYzYjM4ZTgxLTJiNjQtNGFlMy05YjljLTE1Mzc1ZTY4ODk4YiJ9.XpLDNVmd0orxFRlV6VcPx3X2QOr_Z3nw06ma90j-DLo",
  "access_expires_at": "2026-10-28T15:06:48.593072889Z",
  "refresh_token": "VKgtJw_FEEDIS4FdlGO6p23Z9GMejmOFsTtMIrAU36U",
  "refresh_expires_at": "2026-11-27T14:51:48.592513714Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "cbae003c-4abb-4d07-83d4-c12dd554156e",
  "session_id": "f3b38e81-2b64-4ae3-9b9c-15375e68898b",
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
  "phone": "+380636577328",
  "device_ref": "sandbox-3933"
}
```

```json
{
  "challenge_id": "fd36bb10-ac1e-4105-97a5-bd68c4d840b1",
  "expires_at": "2026-10-28T14:56:49.150018134Z",
  "resend_available_at": "2026-10-28T14:51:50.150018134Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636577328` → **200**

```json
{
  "phone": "+380636577328",
  "audience": "CLIENT",
  "code": "525617",
  "sent_at": "2026-10-28T14:51:49.152180873Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd36bb10-ac1e-4105-97a5-bd68c4d840b1",
  "code": "525617",
  "device_ref": "sandbox-3933"
}
```

```json
{
  "session_id": "e06ff1d5-8b21-45ff-853f-d78e165c9f21",
  "subject": {
    "type": "CLIENT",
    "id": "eb9c0e5f-6291-4a58-8347-a7cc88452f81"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlYjljMGU1Zi02MjkxLTRhNTgtODM0Ny1hN2NjODg0NTJmODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMDA5LCJpYXQiOjE3OTMxOTkxMDksImp0aSI6IjcyZDdiY2EwLTQyMDgtNGQ4ZS1hMTJjLTI1ZDBhMDE0NjRjMiIsInNpZCI6ImUwNmZmMWQ1LThiMjEtNDVmZi04NTNmLWQ3OGUxNjVjOWYyMSJ9.z18VgZe_ZVzWiBVIaCfQc8q0LSKiKsAGsFnO6uYYn_Y",
  "access_expires_at": "2026-10-28T15:06:49.443921502Z",
  "refresh_token": "lg4ymDtVkUp84zjF5E6xSSFa0wccuk_reF4_sqO2nBc",
  "refresh_expires_at": "2026-11-27T14:51:49.443319558Z",
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
  "session_id": "587ebf54-2ed8-4917-8f3f-e21111c219ee",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwMTAsImlhdCI6MTc5MzE5OTExMCwianRpIjoiN2Q1OTY2YzItMzFkYS00OTViLTgxZTItMDcwMWZlYTViYzZmIiwic2lkIjoiNTg3ZWJmNTQtMmVkOC00OTE3LThmM2YtZTIxMTExYzIxOWVlIn0.gWKSm6Oe-23uCRUIp5DQA-uVMKNsrHYVNd_DxlMP6QM",
  "access_expires_at": "2026-10-28T15:06:50.561034002Z",
  "refresh_token": "wwMVR6Wbi5_pB7lbgHC5osHAMBIMIcJf6afCw0ssEPk",
  "refresh_expires_at": "2026-10-29T02:51:50.56042254Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380636577328` → **200**

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
  "correlation_id": "c9eae76f-a309-4674-87e8-23f0c8450028"
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
  "session_id": "121dfb90-4a83-439d-8c1d-59183356ed2c",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwMTEsImlhdCI6MTc5MzE5OTExMSwianRpIjoiZmE3YzI3YzQtZTJkYi00MjViLWIwNDQtZmUyOTZkNjIxNDhjIiwic2lkIjoiMTIxZGZiOTAtNGE4My00MzlkLThjMWQtNTkxODMzNTZlZDJjIn0.FgqboVbCgl-LdVmiJiSRMeEjDfBRbsni6piE7kjStRo",
  "access_expires_at": "2026-10-28T15:06:51.694064949Z",
  "refresh_token": "XG62c-iJiRiI5zwDuHEETl4Z3P8nQwDQYxyV74lHOjc",
  "refresh_expires_at": "2026-10-29T02:51:51.693509982Z",
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
  "changed_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T14:48:55.076638Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "32c2b900-8c19-4017-bf4d-fe3d33dc5b15",
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
  "changed_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T14:51:52.238792706Z"
}
```

## The rider books the airport for 2026-10-28T17:51:51Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600803866",
  "device_ref": "sandbox-11733"
}
```

```json
{
  "challenge_id": "1c6774ee-89f4-4f55-aa0a-80c9998836aa",
  "expires_at": "2026-10-28T14:56:52.521600811Z",
  "resend_available_at": "2026-10-28T14:51:53.521600811Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600803866` → **200**

```json
{
  "phone": "+48600803866",
  "audience": "CLIENT",
  "code": "855366",
  "sent_at": "2026-10-28T14:51:52.523999491Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c6774ee-89f4-4f55-aa0a-80c9998836aa",
  "code": "855366",
  "device_ref": "sandbox-11733"
}
```

```json
{
  "session_id": "b2c92783-fcb7-46a1-8dc0-8308830102c7",
  "subject": {
    "type": "CLIENT",
    "id": "c33c28f2-f037-4a8d-b373-3b482927b4cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzNjMjhmMi1mMDM3LTRhOGQtYjM3My0zYjQ4MjkyN2I0Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMDEyLCJpYXQiOjE3OTMxOTkxMTIsImp0aSI6Ijg5ZjIwZTZhLTFiZjEtNDg1OC1hZmJmLWI5MWY0MTJkNDM5ZCIsInNpZCI6ImIyYzkyNzgzLWZjYjctNDZhMS04ZGMwLTgzMDg4MzAxMDJjNyJ9.8jnbNgehzkEAbcidLlrssHDgGIXgAraIpMAZ7wIIy4g",
  "access_expires_at": "2026-10-28T15:06:52.822681721Z",
  "refresh_token": "ZxMaC3JYojhrE1rFMOamUQmsrwmwFPjljs3OMfxHSPo",
  "refresh_expires_at": "2026-11-27T14:51:52.822141267Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "74137b9c-8b30-4636-a019-4a7f453d36ec",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T17:51:51Z"
}
```

```json
{
  "id": "4560e5e2-313c-4f02-accd-43167d966a24",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:53.105776Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:51:51Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3b0a8f2c-61dc-4774-84a9-4a4c97019e21",
  "quote_id": "4560e5e2-313c-4f02-accd-43167d966a24",
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
  "pickup_at": "2026-10-28T17:51:51Z"
}
```

```json
{
  "id": "ad6ad2b2-83d4-448b-93ef-156a24336fce",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c33c28f2-f037-4a8d-b373-3b482927b4cb",
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
  "created_at": "2026-10-28T14:51:53.413144Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:51:51Z",
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
  "device_ref": "sandbox-23703"
}
```

```json
{
  "challenge_id": "062f22df-a164-460f-b306-16530fe93808",
  "expires_at": "2026-10-28T14:56:53.702188293Z",
  "resend_available_at": "2026-10-28T14:51:54.702188293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "840206",
  "sent_at": "2026-10-28T14:51:53.70467646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "062f22df-a164-460f-b306-16530fe93808",
  "code": "840206",
  "device_ref": "sandbox-23703"
}
```

```json
{
  "session_id": "cab04db7-35aa-4650-a69c-f2a973763fe4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDAxNCwiaWF0IjoxNzkzMTk5MTE0LCJqdGkiOiJkMThkZDJkMC1kZDUyLTRkMDUtODFiMS0yNTk1ZmU1YzY2NDYiLCJzaWQiOiJjYWIwNGRiNy0zNWFhLTQ2NTAtYTY5Yy1mMmE5NzM3NjNmZTQifQ.BytE3y5y19IG7cDPnRtQHr9MIB7w1Kb-67rNrmLwznc",
  "access_expires_at": "2026-10-28T15:06:54.012894148Z",
  "refresh_token": "igSTcKUQa3K5eT5sBBPC3Zci2H5hAEpYd8lqkueYvB4",
  "refresh_expires_at": "2026-11-27T14:51:54.012337069Z",
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
  "command_id": "56dd8468-aa1c-4a1c-9439-a4e0472713d7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:51:54Z",
    "sequence": 1793199114581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d634fd7-df3a-4a6e-a1c0-1d6ccc98b51f",
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
  "last_heartbeat_at": "2026-10-28T14:51:54.602403Z",
  "last_location_at": "2026-10-28T14:51:54.602403Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "ad6ad2b2-83d4-448b-93ef-156a24336fce",
      "short_number": 18,
      "pickup_at": "2026-10-28T17:51:51Z",
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

`POST /api/driver/v1/preorders/ad6ad2b2-83d4-448b-93ef-156a24336fce/reserve` → **200**

```json
{
  "command_id": "434b3ea5-ac62-4007-a8ea-3b1adf8aba3f"
}
```

```json
{
  "id": "f28aa7c0-6e4f-4aef-8e74-413bc16819ce",
  "state": "RESERVED",
  "order": {
    "order_id": "ad6ad2b2-83d4-448b-93ef-156a24336fce",
    "short_number": 18,
    "pickup_at": "2026-10-28T17:51:51Z",
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
  "reserved_at": "2026-10-28T14:51:55.166205Z",
  "confirm_from": "2026-10-28T17:21:51Z",
  "confirm_until": "2026-10-28T17:31:51Z",
  "drop_until": "2026-10-28T16:51:51Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "f28aa7c0-6e4f-4aef-8e74-413bc16819ce",
      "state": "RESERVED",
      "order": {
        "order_id": "ad6ad2b2-83d4-448b-93ef-156a24336fce",
        "short_number": 18,
        "pickup_at": "2026-10-28T17:51:51Z",
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
      "reserved_at": "2026-10-28T14:51:55.166205Z",
      "confirm_from": "2026-10-28T17:21:51Z",
      "confirm_until": "2026-10-28T17:31:51Z",
      "drop_until": "2026-10-28T16:51:51Z"
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
      "id": "f28aa7c0-6e4f-4aef-8e74-413bc16819ce",
      "state": "RESERVED",
      "order": {
        "order_id": "ad6ad2b2-83d4-448b-93ef-156a24336fce",
        "short_number": 18,
        "pickup_at": "2026-10-28T17:51:51Z",
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
      "reserved_at": "2026-10-28T14:51:55.166205Z",
      "confirm_from": "2026-10-28T17:21:51Z",
      "confirm_until": "2026-10-28T17:31:51Z",
      "drop_until": "2026-10-28T16:51:51Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/f28aa7c0-6e4f-4aef-8e74-413bc16819ce/confirm` → **409**

```json
{
  "command_id": "22ed1ede-42df-48bc-8319-e5fe442ddd5d"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/f28aa7c0-6e4f-4aef-8e74-413bc16819ce/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5fb4be96-4a78-4060-8aa7-da0479a9131e"
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
  "session_id": "d724d8a7-38c4-4997-8483-5f29f0f3e04e",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwMTYsImlhdCI6MTc5MzE5OTExNiwianRpIjoiNjgwODk2NzgtN2M3Zi00NDJhLTkyZTgtNzkwMmNhY2IxMWUxIiwic2lkIjoiZDcyNGQ4YTctMzhjNC00OTk3LTg0ODMtNWYyOWYwZjNlMDRlIn0.ex3NmLGobPX_NJjEMTyDuetFPMiF735svlT5w7R_K48",
  "access_expires_at": "2026-10-28T15:06:56.569388328Z",
  "refresh_token": "9KzCcMGmyu6E_ox0tegN8KSgqa3MYd92cqfiTMX2ttE",
  "refresh_expires_at": "2026-10-29T02:51:56.568470346Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ad6ad2b2-83d4-448b-93ef-156a24336fce` → **200**

```json
{
  "id": "ad6ad2b2-83d4-448b-93ef-156a24336fce",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c33c28f2-f037-4a8d-b373-3b482927b4cb",
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
  "created_at": "2026-10-28T14:51:53.413144Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T17:51:51Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "f28aa7c0-6e4f-4aef-8e74-413bc16819ce",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T14:51:55.166205Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ad6ad2b2-83d4-448b-93ef-156a24336fce/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T14:51:53.414393Z",
      "actor": {
        "type": "CLIENT",
        "id": "c33c28f2-f037-4a8d-b373-3b482927b4cb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "ad6ad2b2-83d4-448b-93ef-156a24336fce",
        "preorder": true,
        "quote_id": "4560e5e2-313c-4f02-accd-43167d966a24",
        "pickup_at": "2026-10-28T17:51:51Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "4c3af45f-e1a7-4807-b388-b7e188e36d6a"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T14:51:55.167344Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ad6ad2b2-83d4-448b-93ef-156a24336fce",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "f28aa7c0-6e4f-4aef-8e74-413bc16819ce"
      },
      "correlation_id": "9690da94-8c3e-45c2-815c-09248f659007"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order ad6ad2b2-83d4-448b-93ef-156a24336fce, reservation f28aa7c0-6e4f-4aef-8e74-413bc16819ce.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15634"
}
```

```json
{
  "challenge_id": "9e4e58cd-a5df-45a1-9fa8-d6687f97be69",
  "expires_at": "2026-10-28T14:56:57.39701239Z",
  "resend_available_at": "2026-10-28T14:51:58.39701239Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "845273",
  "sent_at": "2026-10-28T14:51:57.399337916Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e4e58cd-a5df-45a1-9fa8-d6687f97be69",
  "code": "845273",
  "device_ref": "sandbox-15634"
}
```

```json
{
  "session_id": "91de8f8e-851c-47ca-8bbb-db20c66632f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDAxNywiaWF0IjoxNzkzMTk5MTE3LCJqdGkiOiI3MGE4Y2MzNC05NmI4LTRkMmMtYTFlMC00ZTc4M2U3YWQ3OTIiLCJzaWQiOiI5MWRlOGY4ZS04NTFjLTQ3Y2EtOGJiYi1kYjIwYzY2NjMyZjMifQ.-7DbLc469_AbiViuJ-llrv7RcK4h4-Dgl-9jefk3NZY",
  "access_expires_at": "2026-10-28T15:06:57.690421661Z",
  "refresh_token": "myhwb6gwRs1TYw5ZYUMI2nSEAHJ5iwhZJ9J9v0KpJ9g",
  "refresh_expires_at": "2026-11-27T14:51:57.689677885Z",
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
  "command_id": "d0256d6e-0187-446a-b9ae-e8126166ea2f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:51:58Z",
    "sequence": 1793199118218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0603322e-1ebc-4f07-9af7-7900b4f6bd19",
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
  "last_heartbeat_at": "2026-10-28T14:51:58.236828Z",
  "last_location_at": "2026-10-28T14:51:58.236828Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671646789",
  "device_ref": "sandbox-21422"
}
```

```json
{
  "challenge_id": "76e286ad-c45c-4bbf-9e07-5354ec27edd4",
  "expires_at": "2026-10-28T14:56:58.526516286Z",
  "resend_available_at": "2026-10-28T14:51:59.526516286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671646789` → **200**

```json
{
  "phone": "+380671646789",
  "audience": "CLIENT",
  "code": "167056",
  "sent_at": "2026-10-28T14:51:58.528770686Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76e286ad-c45c-4bbf-9e07-5354ec27edd4",
  "code": "167056",
  "device_ref": "sandbox-21422"
}
```

```json
{
  "session_id": "f65328de-8dfe-4441-a4c0-0a187958cad6",
  "subject": {
    "type": "CLIENT",
    "id": "349868f2-8523-4b8c-9412-7f2eac4615d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNDk4NjhmMi04NTIzLTRiOGMtOTQxMi03ZjJlYWM0NjE1ZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMDE4LCJpYXQiOjE3OTMxOTkxMTgsImp0aSI6IjFjZjcyOGY4LWFhODQtNGYzNC05ZDkxLTVjMDcxYzQzMzUzYiIsInNpZCI6ImY2NTMyOGRlLThkZmUtNDQ0MS1hNGMwLTBhMTg3OTU4Y2FkNiJ9.duOSQHlwocEETH-sJq7g_ozWI8Kir17cK6qbuOkdVIM",
  "access_expires_at": "2026-10-28T15:06:58.823800614Z",
  "refresh_token": "BKCU581CaK_x6LNgtzm-0Nyx8YjsZW2IjLd-Ypm8x6k",
  "refresh_expires_at": "2026-11-27T14:51:58.823241901Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3bca66c1-7419-4900-8f75-bd22d1832d2e",
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
  "id": "2fe42d38-7a0f-4855-87bc-b8c28ee1f287",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:56:59.106595Z",
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
  "command_id": "c4c49cae-de07-4ba3-9083-0ff54550baa2",
  "quote_id": "2fe42d38-7a0f-4855-87bc-b8c28ee1f287",
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
  "id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "349868f2-8523-4b8c-9412-7f2eac4615d9",
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
  "created_at": "2026-10-28T14:51:59.39289Z",
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
    "id": "8349094e-fce8-454a-8d57-d79f9d141bde",
    "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
    "expires_at": "2026-10-28T14:52:14.396003Z",
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

`POST /api/driver/v1/offers/8349094e-fce8-454a-8d57-d79f9d141bde/accept` → **200**

```json
{
  "command_id": "e7514481-1f92-47f5-be70-ec41fe41cb58"
}
```

```json
{
  "id": "88ddcd75-ff86-4e8b-9fde-217fab73ebe0",
  "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4ccdde11-fbf2-4300-91b6-16580814ae1c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ccdde11-fbf2-4300-91b6-16580814ae1c",
  "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "assignment_id": "88ddcd75-ff86-4e8b-9fde-217fab73ebe0",
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

`POST /api/driver/v1/work-sessions/0603322e-1ebc-4f07-9af7-7900b4f6bd19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:52:00Z",
    "sequence": 1793199120500
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0603322e-1ebc-4f07-9af7-7900b4f6bd19",
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
  "last_heartbeat_at": "2026-10-28T14:52:00.520683Z",
  "last_location_at": "2026-10-28T14:52:00.520683Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4ccdde11-fbf2-4300-91b6-16580814ae1c",
  "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "assignment_id": "88ddcd75-ff86-4e8b-9fde-217fab73ebe0",
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

`POST /api/driver/v1/trips/4ccdde11-fbf2-4300-91b6-16580814ae1c/arrive` → **200**

```json
{
  "command_id": "5cc6de5f-6884-455b-9ec7-f0938887dd14",
  "expected_version": 0
}
```

```json
{
  "id": "4ccdde11-fbf2-4300-91b6-16580814ae1c",
  "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "assignment_id": "88ddcd75-ff86-4e8b-9fde-217fab73ebe0",
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
  "arrived_at": "2026-10-28T14:52:01.134691Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4ccdde11-fbf2-4300-91b6-16580814ae1c/start` → **200**

```json
{
  "command_id": "370eac9f-18dd-49ba-b593-d06e2d62c4ea",
  "expected_version": 1
}
```

```json
{
  "id": "4ccdde11-fbf2-4300-91b6-16580814ae1c",
  "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "assignment_id": "88ddcd75-ff86-4e8b-9fde-217fab73ebe0",
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
  "arrived_at": "2026-10-28T14:52:01.134691Z",
  "started_at": "2026-10-28T14:52:01.42586Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/0603322e-1ebc-4f07-9af7-7900b4f6bd19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:52:01Z",
    "sequence": 1793199121722
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0603322e-1ebc-4f07-9af7-7900b4f6bd19",
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
  "last_heartbeat_at": "2026-10-28T14:52:01.74365Z",
  "last_location_at": "2026-10-28T14:52:01.74365Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/4ccdde11-fbf2-4300-91b6-16580814ae1c/complete` → **200**

```json
{
  "command_id": "bcd627da-fc3c-42ca-9459-e28d7bb15c1e",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:52:02Z",
  "cash_received": true
}
```

```json
{
  "id": "4ccdde11-fbf2-4300-91b6-16580814ae1c",
  "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "assignment_id": "88ddcd75-ff86-4e8b-9fde-217fab73ebe0",
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
  "arrived_at": "2026-10-28T14:52:01.134691Z",
  "started_at": "2026-10-28T14:52:01.42586Z",
  "completed_at": "2026-10-28T14:52:02.03819Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/d5bf3c08-54f8-43d7-b95b-e3f950a9f078/rating` → **200**

```json
{
  "command_id": "d2186379-da06-4742-859e-cbd7f936945e",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "score": 5,
  "created_at": "2026-10-28T14:52:02.332144721Z"
}
```

`POST /api/driver/v1/orders/d5bf3c08-54f8-43d7-b95b-e3f950a9f078/rating` → **200**

```json
{
  "command_id": "ae0407a8-faf2-448a-823f-4d16611eded7",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
  "score": 4,
  "created_at": "2026-10-28T14:52:02.630419237Z"
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
  "session_id": "5e27be12-9930-4650-a9d2-f76330d4a759",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwMjMsImlhdCI6MTc5MzE5OTEyMywianRpIjoiZWE4MWU3NWEtZDdkOS00NzY4LWE5YjYtNTZkMWU4MDg4NWNiIiwic2lkIjoiNWUyN2JlMTItOTkzMC00NjUwLWE5ZDItZjc2MzMwZDRhNzU5In0.1_upzEOFaRmGPpkMDs-7EoWUdb-AI5moeap4OIqB-v0",
  "access_expires_at": "2026-10-28T15:07:03.474537601Z",
  "refresh_token": "KvDlmfP0zKoEWAtxwn3IC14bbRdG3GG9uGHnGawLo-o",
  "refresh_expires_at": "2026-10-29T02:52:03.47382472Z",
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
  "session_id": "41051499-4554-4752-8d25-3aa07c03da6e",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwMjQsImlhdCI6MTc5MzE5OTEyNCwianRpIjoiMDgyZTg1YzktZjY5Zi00NjZlLWFmNDgtMzg2ZmY3NDY3N2YzIiwic2lkIjoiNDEwNTE0OTktNDU1NC00NzUyLThkMjUtM2FhMDdjMDNkYTZlIn0.wAHnN7-jXvvp_SKj4jQd3bameuXQY9p5O1WWW9viFQQ",
  "access_expires_at": "2026-10-28T15:07:04.043314066Z",
  "refresh_token": "AnaNIVf3uaMvO55tl4Vs4vVl7OXJqOZ3Vw6erTZsGis",
  "refresh_expires_at": "2026-10-29T02:52:04.042691854Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d5bf3c08-54f8-43d7-b95b-e3f950a9f078/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
      "author_type": "RIDER",
      "author_id": "349868f2-8523-4b8c-9412-7f2eac4615d9",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:52:02.332145Z"
    },
    {
      "order_id": "d5bf3c08-54f8-43d7-b95b-e3f950a9f078",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "349868f2-8523-4b8c-9412-7f2eac4615d9",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:52:02.630419Z"
    }
  ]
}
```

Done: ratings for order d5bf3c08-54f8-43d7-b95b-e3f950a9f078.

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
  "session_id": "74de52c0-f098-406a-a9e9-3f8a59e22f2a",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwMjQsImlhdCI6MTc5MzE5OTEyNCwianRpIjoiMTg5NzFhZmUtYzQ1Ni00OTllLTg3NTUtYjYwMWExN2Q5OTgzIiwic2lkIjoiNzRkZTUyYzAtZjA5OC00MDZhLWE5ZTktM2Y4YTU5ZTIyZjJhIn0.e2y3zLsHsdqiC388rJYVwDEisxedbZ4cJU-L2S2LctI",
  "access_expires_at": "2026-10-28T15:07:04.917378106Z",
  "refresh_token": "nt3QSYBwDk8Nk0-hm2aRWyiXVYDzbSne_xQqTo2VYk0",
  "refresh_expires_at": "2026-10-29T02:52:04.916758589Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "c79a240c-af3b-4844-9378-00a35b1bbe87",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "f6417ee3-7557-41e4-a97a-0016528bd440",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:05.20081Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f6417ee3-7557-41e4-a97a-0016528bd440` → **200**

```json
{
  "id": "f6417ee3-7557-41e4-a97a-0016528bd440",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:05.20081Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f6417ee3-7557-41e4-a97a-0016528bd440` → **200**

```json
{
  "id": "f6417ee3-7557-41e4-a97a-0016528bd440",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:05.20081Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f6417ee3-7557-41e4-a97a-0016528bd440` → **200**

```json
{
  "id": "f6417ee3-7557-41e4-a97a-0016528bd440",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:05.20081Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f6417ee3-7557-41e4-a97a-0016528bd440` → **200**

```json
{
  "id": "f6417ee3-7557-41e4-a97a-0016528bd440",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:05.20081Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f6417ee3-7557-41e4-a97a-0016528bd440` → **200**

```json
{
  "id": "f6417ee3-7557-41e4-a97a-0016528bd440",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:52:05.20081Z",
  "ready_at": "2026-10-28T14:52:09.306229Z",
  "expires_at": "2026-10-29T14:52:09.306229Z"
}
```

`GET /api/admin/v1/reports/exports/f6417ee3-7557-41e4-a97a-0016528bd440/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "2e0aae89-32aa-4281-a269-21b1c73a4ce8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "57f8f4a1-ea53-4b80-bb44-fe05d37f549c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:10.882087Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/57f8f4a1-ea53-4b80-bb44-fe05d37f549c` → **200**

```json
{
  "id": "57f8f4a1-ea53-4b80-bb44-fe05d37f549c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:10.882087Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/57f8f4a1-ea53-4b80-bb44-fe05d37f549c` → **200**

```json
{
  "id": "57f8f4a1-ea53-4b80-bb44-fe05d37f549c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:10.882087Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/57f8f4a1-ea53-4b80-bb44-fe05d37f549c` → **200**

```json
{
  "id": "57f8f4a1-ea53-4b80-bb44-fe05d37f549c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:52:10.882087Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/57f8f4a1-ea53-4b80-bb44-fe05d37f549c` → **200**

```json
{
  "id": "57f8f4a1-ea53-4b80-bb44-fe05d37f549c",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:52:10.882087Z",
  "ready_at": "2026-10-28T14:52:14.314626Z",
  "expires_at": "2026-10-29T14:52:14.314626Z"
}
```

`GET /api/admin/v1/reports/exports/57f8f4a1-ea53-4b80-bb44-fe05d37f549c/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/199402d8-fe48-4c31-ba01-630ca4cad967` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/199402d8-fe48-4c31-ba01-630ca4cad967",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3156ce0b-1574-426b-990b-d097fdd735d3"
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
  "device_ref": "sandbox-8169"
}
```

```json
{
  "challenge_id": "8c8a7061-5d06-440e-b667-1d39af6878db",
  "expires_at": "2026-10-28T14:57:15.569036028Z",
  "resend_available_at": "2026-10-28T14:52:16.569036028Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "186061",
  "sent_at": "2026-10-28T14:52:15.571468441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c8a7061-5d06-440e-b667-1d39af6878db",
  "code": "186061",
  "device_ref": "sandbox-8169"
}
```

```json
{
  "session_id": "ba98b7d5-4d0c-4008-9777-84ad942b966a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDAzNSwiaWF0IjoxNzkzMTk5MTM1LCJqdGkiOiIzMmE2NDMxOC04OTgxLTQ4MGEtYjBlNC03NGZkYjEwZTZlNGEiLCJzaWQiOiJiYTk4YjdkNS00ZDBjLTQwMDgtOTc3Ny04NGFkOTQyYjk2NmEifQ.21s-cZZvjY1yyIzVNH9ndsNj5MhNGolhM9jGmcUcWXo",
  "access_expires_at": "2026-10-28T15:07:15.87624191Z",
  "refresh_token": "_Pm6P2ES-ckaGbgWdzPbQBiRdNwvrNz9LowfblA7SlM",
  "refresh_expires_at": "2026-11-27T14:52:15.875712601Z",
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
  "command_id": "5d8e7e2e-94af-4754-bea9-59129817d6e7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:52:16Z",
    "sequence": 1793199136711
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3348f6a9-616a-4678-b774-ee6c20e6c5d0",
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
  "last_heartbeat_at": "2026-10-28T14:52:16.730424Z",
  "last_location_at": "2026-10-28T14:52:16.730424Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "5099c491-5ba3-4d28-a4fe-d184bb3d8080",
  "points": [
    {
      "sequence": 1793199139200,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:51:19Z"
    },
    {
      "sequence": 1793199139275,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:52:19Z"
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
  "session_id": "5695f0cf-09ea-4a6e-8873-647e7f4a62b7",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwMzksImlhdCI6MTc5MzE5OTEzOSwianRpIjoiMTRjOTQyNWYtZmQ5Zi00NjI0LWE1NGEtNDJmZDhmN2Q3MDE4Iiwic2lkIjoiNTY5NWYwY2YtMDllYS00YTZlLTg4NzMtNjQ3ZTdmNGE2MmI3In0.Jf55kmG6JCLeQ9G0IjEBxdMlbysjWuYo4v5TbIIrjtY",
  "access_expires_at": "2026-10-28T15:07:19.645724882Z",
  "refresh_token": "phES76g_RvK_nXaYNr600M5UUeTjjnJcasIXvt0iZ-k",
  "refresh_expires_at": "2026-10-29T02:52:19.645162131Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "0d7024a7-afe6-450d-a391-ae8c79f71fa5",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:52:19Z",
        "track_point_id": "d8ff7b23-ce19-4399-85da-49a5dbdd989b",
        "work_session_id": "3348f6a9-616a-4678-b774-ee6c20e6c5d0"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:52:19Z",
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

`POST /api/admin/v1/driver-risk-flags/0d7024a7-afe6-450d-a391-ae8c79f71fa5/confirm` → **200**

```json
{
  "command_id": "e1fc94e0-6a75-446a-bfdf-2ff8fd3076f1",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "0d7024a7-afe6-450d-a391-ae8c79f71fa5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:52:19Z",
    "track_point_id": "d8ff7b23-ce19-4399-85da-49a5dbdd989b",
    "work_session_id": "3348f6a9-616a-4678-b774-ee6c20e6c5d0"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:52:19Z",
  "reason": null,
  "reviewed_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "reviewed_at": "2026-10-28T14:52:20.523019Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/0d7024a7-afe6-450d-a391-ae8c79f71fa5/dismiss` → **409**

```json
{
  "command_id": "9e466e94-3a88-486a-90e6-03ed106569b8",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/0d7024a7-afe6-450d-a391-ae8c79f71fa5/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "15031123-f032-4710-a7e7-87b1d05f1e26"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "4ca78dcd-b9e9-4bf6-bd31-328e991fb442",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "ac7bcdcc-01ad-4ef8-81fe-fdbe8e344d5e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "raised_at": "2026-10-28T14:52:21.083018Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/ac7bcdcc-01ad-4ef8-81fe-fdbe8e344d5e/dismiss` → **200**

```json
{
  "command_id": "b79dfb77-c9be-4d1c-8fb7-eb6fe7f2c92d",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "ac7bcdcc-01ad-4ef8-81fe-fdbe8e344d5e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "raised_at": "2026-10-28T14:52:21.083018Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "reviewed_at": "2026-10-28T14:52:21.366799Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "0f0cbc58-1762-4002-968f-c2703c4387d3",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "0d7024a7-afe6-450d-a391-ae8c79f71fa5"
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
      "actor_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:52:21.656334Z"
    }
  ]
}
```

Done: flag 0d7024a7-afe6-450d-a391-ae8c79f71fa5 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "b646879f-856d-46f4-9ae9-fabd62dd82a5",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwNDIsImlhdCI6MTc5MzE5OTE0MiwianRpIjoiNTEzYzk1YjMtNWJjYi00ODY5LTg4MDYtODYyZmQ2YjJmNTFkIiwic2lkIjoiYjY0Njg3OWYtODU2ZC00NmY0LTlhZTktZmFiZDYyZGQ4MmE1In0.Sl1UBuOupoQh13Lfbe95sz3l4Na-AO-IK_kU5-6Idw4",
  "access_expires_at": "2026-10-28T15:07:22.504108032Z",
  "refresh_token": "btW9yWSAzPRN2K3bb61ZWY4fGjG9A8HS8OfeYufkqAg",
  "refresh_expires_at": "2026-10-29T02:52:22.503594162Z",
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
      "actor_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:52:21.656334Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "f63ea370-27d4-409d-aa01-20d398bfeb44",
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
  "session_id": "3348f6a9-616a-4678-b774-ee6c20e6c5d0",
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
  "last_heartbeat_at": "2026-10-28T14:52:16.730424Z",
  "last_location_at": "2026-10-28T14:52:16.730424Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3348f6a9-616a-4678-b774-ee6c20e6c5d0/close` → **200**

```json
{
  "command_id": "d194d805-a4c7-4160-8a89-fc4d2706f421",
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
  "session_id": "6b8972ee-8faf-4c25-88af-333e22520542",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwNDQsImlhdCI6MTc5MzE5OTE0NCwianRpIjoiOTM1ZmU1NjEtZmIwZi00ZmQyLWI2ODYtMTAwNGJiYmExMjc1Iiwic2lkIjoiNmI4OTcyZWUtOGZhZi00YzI1LTg4YWYtMzMzZTIyNTIwNTQyIn0.LplyQi98HwiHxgefYOXzvfsplXM0QJ1tsInR-jJCo1M",
  "access_expires_at": "2026-10-28T15:07:24.213032114Z",
  "refresh_token": "y1RuD_Of9whrrG_09v0CUE4gFadKRnTaxFUR18gTe8I",
  "refresh_expires_at": "2026-10-29T02:52:24.212502736Z",
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
  "command_id": "b980ec2a-963b-4f74-9752-1401863395c1",
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
  "changed_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:52:24.772727Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "b980ec2a-963b-4f74-9752-1401863395c1",
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
  "changed_by": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:52:24.772727Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48923779690",
  "device_ref": "sandbox-18837"
}
```

```json
{
  "challenge_id": "cd41112c-a146-44c9-b8c4-7f2f6b749089",
  "expires_at": "2026-10-28T14:57:25.335877093Z",
  "resend_available_at": "2026-10-28T14:52:26.335877093Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48923779690` → **200**

```json
{
  "phone": "+48923779690",
  "audience": "CLIENT",
  "code": "628709",
  "sent_at": "2026-10-28T14:52:25.338251667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd41112c-a146-44c9-b8c4-7f2f6b749089",
  "code": "628709",
  "device_ref": "sandbox-18837"
}
```

```json
{
  "session_id": "f4a5c69e-ee7f-46dd-b7d5-cfba1bad973c",
  "subject": {
    "type": "CLIENT",
    "id": "976de3dc-2a56-4d82-bc1d-87e410b90c1c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5NzZkZTNkYy0yYTU2LTRkODItYmMxZC04N2U0MTBiOTBjMWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMDQ1LCJpYXQiOjE3OTMxOTkxNDUsImp0aSI6IjQ2MDZhMTNhLTFjYWQtNGI1OS1hNDMzLTkzMDA5YzEwYjk5OCIsInNpZCI6ImY0YTVjNjllLWVlN2YtNDZkZC1iN2Q1LWNmYmExYmFkOTczYyJ9.tszkvJxskYFmXQZI-uWanHDvhMCj6hw2DTDvxnPkgDw",
  "access_expires_at": "2026-10-28T15:07:25.634762403Z",
  "refresh_token": "5wMO7GTVW8RwA4PnVOa1wDU5vdqrg-9ukYinzxr7Ay4",
  "refresh_expires_at": "2026-11-27T14:52:25.634186627Z",
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
  "correlation_id": "c60bc049-626b-4ddb-8168-00845d40c739"
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
  "device_ref": "sandbox-23373"
}
```

```json
{
  "challenge_id": "efd33ea8-66f8-4a34-b0ee-106257c71a04",
  "expires_at": "2026-10-28T14:57:26.452091573Z",
  "resend_available_at": "2026-10-28T14:52:27.452091573Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "321647",
  "sent_at": "2026-10-28T14:52:26.454305213Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efd33ea8-66f8-4a34-b0ee-106257c71a04",
  "code": "321647",
  "device_ref": "sandbox-23373"
}
```

```json
{
  "session_id": "c78d3bf3-f389-44a5-b0e5-f6759239428e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDA0NiwiaWF0IjoxNzkzMTk5MTQ2LCJqdGkiOiJkNDU0YzcyYS1kNGUyLTRkYWItODE5NC1mMTVkNDQwYWVmMGMiLCJzaWQiOiJjNzhkM2JmMy1mMzg5LTQ0YTUtYjBlNS1mNjc1OTIzOTQyOGUifQ.yxncHTVCu9geYQo7j7juqTC-Al86TKABEaIGrtrNYLE",
  "access_expires_at": "2026-10-28T15:07:26.746334429Z",
  "refresh_token": "rMeDI5CyB4m_c1CLvj1b1IAZDYKYbBI9XR_0C9RCeO4",
  "refresh_expires_at": "2026-11-27T14:52:26.745771006Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d634fd7-df3a-4a6e-a1c0-1d6ccc98b51f",
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
  "last_heartbeat_at": "2026-10-28T14:51:54.602403Z",
  "last_location_at": "2026-10-28T14:51:54.602403Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4d634fd7-df3a-4a6e-a1c0-1d6ccc98b51f/handover` → **200**

```json
{
  "command_id": "79d539b9-2669-4fd5-bd32-f4b6830fc45c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d634fd7-df3a-4a6e-a1c0-1d6ccc98b51f",
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
  "last_heartbeat_at": "2026-10-28T14:51:54.602403Z",
  "last_location_at": "2026-10-28T14:51:54.602403Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4d634fd7-df3a-4a6e-a1c0-1d6ccc98b51f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:52:27Z",
    "sequence": 1793199147571
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "4d634fd7-df3a-4a6e-a1c0-1d6ccc98b51f",
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
  "last_heartbeat_at": "2026-10-28T14:52:27.591891Z",
  "last_location_at": "2026-10-28T14:52:27.591891Z",
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
  "session_id": "4d634fd7-df3a-4a6e-a1c0-1d6ccc98b51f",
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
  "last_heartbeat_at": "2026-10-28T14:52:27.591891Z",
  "last_location_at": "2026-10-28T14:52:27.591891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4d634fd7-df3a-4a6e-a1c0-1d6ccc98b51f/close` → **200**

```json
{
  "command_id": "c65c3728-18f4-4828-a96a-d6a83c6308d2",
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
  "correlation_id": "265a7cdc-df1d-439a-9cb7-9351133e9591"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676199955",
  "device_ref": "sandbox-7285"
}
```

```json
{
  "challenge_id": "f5dc569b-1212-4fe4-88e5-20b90bf24df1",
  "expires_at": "2026-10-28T14:57:28.991016708Z",
  "resend_available_at": "2026-10-28T14:52:29.991016708Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676199955` → **200**

```json
{
  "phone": "+380676199955",
  "audience": "CLIENT",
  "code": "953632",
  "sent_at": "2026-10-28T14:52:28.993113844Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5dc569b-1212-4fe4-88e5-20b90bf24df1",
  "code": "953632",
  "device_ref": "sandbox-7285"
}
```

```json
{
  "session_id": "bddbed01-5752-4d01-a9ef-feb24eef05bf",
  "subject": {
    "type": "CLIENT",
    "id": "70deead3-27b3-4ace-b402-ff1b9ec26daf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MGRlZWFkMy0yN2IzLTRhY2UtYjQwMi1mZjFiOWVjMjZkYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMDQ5LCJpYXQiOjE3OTMxOTkxNDksImp0aSI6IjdmMmYzN2E0LTdlOWMtNGRjZi1hZGQ1LTc2Y2E4OTIzYjA2YiIsInNpZCI6ImJkZGJlZDAxLTU3NTItNGQwMS1hOWVmLWZlYjI0ZWVmMDViZiJ9.lxBfwf2SHrggA4-8RbB3No8rzs34GfICjWRc9q5rD00",
  "access_expires_at": "2026-10-28T15:07:29.291795752Z",
  "refresh_token": "Lgej9KzHAwYAQHErIu2bTBZfg3Qsi6bmPyw-umncciA",
  "refresh_expires_at": "2026-11-27T14:52:29.291258899Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "eb348f7f-4322-499f-b468-869d95ce4a02",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f",
  "upload_path": "/api/rider/v1/uploads/7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f",
  "expires_at": "2026-10-28T15:07:29.582068608Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f` → **200**

```json
{
  "file_id": "7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "079ca2b0-7b5a-488c-99d8-f1d32325d541",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f"
  ]
}
```

```json
{
  "id": "7807911b-2f54-4bf1-8481-12be13152367",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "70deead3-27b3-4ace-b402-ff1b9ec26daf",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:52:29.892607Z",
  "updated_at": "2026-10-28T14:52:29.892607Z",
  "messages": [
    {
      "id": "2906627a-d64d-4a57-99a5-ceeae436ebd8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "70deead3-27b3-4ace-b402-ff1b9ec26daf",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:52:29.894426Z",
      "attachments": [
        {
          "file_id": "7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f",
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
  "session_id": "e53561b6-8d18-451b-85a7-d06139a0bbcf",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwNTAsImlhdCI6MTc5MzE5OTE1MCwianRpIjoiZTE4ZTk3NjItNWYwYS00NDhlLTk5YmQtYzJkM2VkOTMwZjJkIiwic2lkIjoiZTUzNTYxYjYtOGQxOC00NTFiLTg1YTctZDA2MTM5YTBiYmNmIn0.xh90foSuDPFjBwzgdk3OXjggTRtJSuIgm4c61PB7dxo",
  "access_expires_at": "2026-10-28T15:07:30.477050122Z",
  "refresh_token": "zeA86D4f9bx7ct0lh4_LbzEsDlv6XnSqkAN4cRuPqQ4",
  "refresh_expires_at": "2026-10-29T02:52:30.476385533Z",
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
  "session_id": "e8a48a50-fb79-4cb5-a088-4495715bb03d",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwNTEsImlhdCI6MTc5MzE5OTE1MSwianRpIjoiZjdlYmQ2MzQtY2VkYi00NDMzLTg1ZDItMWRkYTA2YTc1OWViIiwic2lkIjoiZThhNDhhNTAtZmI3OS00Y2I1LWEwODgtNDQ5NTcxNWJiMDNkIn0.HgfODjSwdm93zaruOaqgG92-IMqpE2nZRM6_ZRbjH6E",
  "access_expires_at": "2026-10-28T15:07:31.035076465Z",
  "refresh_token": "gKvS7xLVJVv_A0UT0yq5acHH2CwBwHIpACfFOKyIDgU",
  "refresh_expires_at": "2026-10-29T02:52:31.034497714Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/7807911b-2f54-4bf1-8481-12be13152367/attachments/7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d05d7ab8-f382-4f34-a72d-9d91d37219e4",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "3747476c-bffc-4d15-b969-85b2217870d9",
  "upload_path": "/api/operator/v1/uploads/3747476c-bffc-4d15-b969-85b2217870d9",
  "expires_at": "2026-10-28T15:07:31.326620046Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/3747476c-bffc-4d15-b969-85b2217870d9` → **200**

```json
{
  "file_id": "3747476c-bffc-4d15-b969-85b2217870d9",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/7807911b-2f54-4bf1-8481-12be13152367` → **200**

```json
{
  "id": "7807911b-2f54-4bf1-8481-12be13152367",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "70deead3-27b3-4ace-b402-ff1b9ec26daf",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:52:29.892607Z",
  "updated_at": "2026-10-28T14:52:29.892607Z",
  "messages": [
    {
      "id": "2906627a-d64d-4a57-99a5-ceeae436ebd8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "70deead3-27b3-4ace-b402-ff1b9ec26daf",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:52:29.894426Z",
      "attachments": [
        {
          "file_id": "7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/7807911b-2f54-4bf1-8481-12be13152367/comments` → **200**

```json
{
  "command_id": "8564a013-2316-4d76-960d-e8e73f0428a8",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "3747476c-bffc-4d15-b969-85b2217870d9"
  ]
}
```

```json
{
  "id": "7807911b-2f54-4bf1-8481-12be13152367",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "70deead3-27b3-4ace-b402-ff1b9ec26daf",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:52:29.892607Z",
  "updated_at": "2026-10-28T14:52:31.91626Z",
  "messages": [
    {
      "id": "2906627a-d64d-4a57-99a5-ceeae436ebd8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "70deead3-27b3-4ace-b402-ff1b9ec26daf",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:52:29.894426Z",
      "attachments": [
        {
          "file_id": "7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2952652f-5186-42d4-a7bf-a1875527d7f9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:52:31.915903Z",
      "attachments": [
        {
          "file_id": "3747476c-bffc-4d15-b969-85b2217870d9",
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

`GET /api/rider/v1/support/cases/7807911b-2f54-4bf1-8481-12be13152367` → **200**

```json
{
  "id": "7807911b-2f54-4bf1-8481-12be13152367",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "70deead3-27b3-4ace-b402-ff1b9ec26daf",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:52:29.892607Z",
  "updated_at": "2026-10-28T14:52:31.91626Z",
  "messages": [
    {
      "id": "2906627a-d64d-4a57-99a5-ceeae436ebd8",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "70deead3-27b3-4ace-b402-ff1b9ec26daf",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:52:29.894426Z",
      "attachments": [
        {
          "file_id": "7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2952652f-5186-42d4-a7bf-a1875527d7f9",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:52:31.915903Z",
      "attachments": [
        {
          "file_id": "3747476c-bffc-4d15-b969-85b2217870d9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/7807911b-2f54-4bf1-8481-12be13152367/attachments/3747476c-bffc-4d15-b969-85b2217870d9` → **200**

Done: support case 7807911b-2f54-4bf1-8481-12be13152367, rider attachment 7e9da04d-d4c6-4af5-94b8-ec8a54a9ba3f, operator attachment 3747476c-bffc-4d15-b969-85b2217870d9.

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
  "session_id": "2a92b541-1d03-49ec-9f58-d5ba1d8a6a49",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwNTIsImlhdCI6MTc5MzE5OTE1MiwianRpIjoiYmJjMjcwYTItNmE3MC00ZjYyLTlkNzgtYzQxODk4NWNlNWQ1Iiwic2lkIjoiMmE5MmI1NDEtMWQwMy00OWVjLTlmNTgtZDViYTFkOGE2YTQ5In0.K43WGRG6X34YNHEihHGButb69TAvMR5Raik0J6fC3fc",
  "access_expires_at": "2026-10-28T15:07:32.794832177Z",
  "refresh_token": "J2-3iu0IKkg2hk2r-Aqzd2h2xkMPconTL8pyOtqVR94",
  "refresh_expires_at": "2026-10-29T02:52:32.794012038Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28480"
}
```

```json
{
  "challenge_id": "314d3806-e1b2-4a38-85fb-12eadcafaee6",
  "expires_at": "2026-10-28T14:57:33.050829566Z",
  "resend_available_at": "2026-10-28T14:52:34.050829566Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "305716",
  "sent_at": "2026-10-28T14:52:33.053234217Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "314d3806-e1b2-4a38-85fb-12eadcafaee6",
  "code": "305716",
  "device_ref": "sandbox-28480"
}
```

```json
{
  "session_id": "62deac61-97c4-4c23-b5bd-3392ea40227b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDA1MywiaWF0IjoxNzkzMTk5MTUzLCJqdGkiOiI3NjNlZDI3ZS03M2NiLTRmNTgtYWRlYi04OTQwY2Q4NzVlYjciLCJzaWQiOiI2MmRlYWM2MS05N2M0LTRjMjMtYjViZC0zMzkyZWE0MDIyN2IifQ.0f_JJSFbMvRFmhfvZrju4_LHqZGexvZZd1gVwmof_mI",
  "access_expires_at": "2026-10-28T15:07:33.345832146Z",
  "refresh_token": "4ylxCxA5m534z8CjOyWjxfOc_OCEldrYmlWhyZAwDy0",
  "refresh_expires_at": "2026-11-27T14:52:33.345260989Z",
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
      "actor_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:52:21.656334Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:52:23.064569Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "4e31628d-74a2-41df-a6bc-b631119b711f",
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
  "device_ref": "sandbox-11821"
}
```

```json
{
  "challenge_id": "bf38f45a-d81d-4ba3-80a8-fe0d92e49bde",
  "expires_at": "2026-10-28T14:57:34.461490871Z",
  "resend_available_at": "2026-10-28T14:52:35.461490871Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "394537",
  "sent_at": "2026-10-28T14:52:34.463518938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf38f45a-d81d-4ba3-80a8-fe0d92e49bde",
  "code": "394537",
  "device_ref": "sandbox-11821"
}
```

```json
{
  "session_id": "483777fd-6d40-4a30-843f-7399ea7f668f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDA1NCwiaWF0IjoxNzkzMTk5MTU0LCJqdGkiOiJhMTA3OWZmYS00YTAyLTQyN2ItYTYzZi1kZGRiNTk0ZjNkZGUiLCJzaWQiOiI0ODM3NzdmZC02ZDQwLTRhMzAtODQzZi03Mzk5ZWE3ZjY2OGYifQ.KKe7_MS3h8Ax8dSptrGo2NxqhK46RptugxZ6qzbQ-KA",
  "access_expires_at": "2026-10-28T15:07:34.758087573Z",
  "refresh_token": "dpMyaYHBWYtH_YmOKTXKbc3m73CDHh8LjC3OmAxqp4k",
  "refresh_expires_at": "2026-11-27T14:52:34.757503232Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0603322e-1ebc-4f07-9af7-7900b4f6bd19",
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
  "last_heartbeat_at": "2026-10-28T14:52:01.74365Z",
  "last_location_at": "2026-10-28T14:52:01.74365Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0603322e-1ebc-4f07-9af7-7900b4f6bd19/handover` → **200**

```json
{
  "command_id": "48ac440f-7012-4ebe-9838-59c5d5e096a8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0603322e-1ebc-4f07-9af7-7900b4f6bd19",
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
  "last_heartbeat_at": "2026-10-28T14:52:01.74365Z",
  "last_location_at": "2026-10-28T14:52:01.74365Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0603322e-1ebc-4f07-9af7-7900b4f6bd19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:52:35Z",
    "sequence": 1793199155591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0603322e-1ebc-4f07-9af7-7900b4f6bd19",
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
  "last_heartbeat_at": "2026-10-28T14:52:35.611311Z",
  "last_location_at": "2026-10-28T14:52:35.611311Z",
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
  "command_id": "437a04cd-c326-4dec-af1d-d8fd815e0e91",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:52:36Z",
    "sequence": 1793199156156
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c3340fe5-3c55-45a2-85c1-92cceb5434cb",
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
  "last_heartbeat_at": "2026-10-28T14:52:36.175099Z",
  "last_location_at": "2026-10-28T14:52:36.175099Z",
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
  "session_id": "93af8e90-f718-4111-9620-05551c369fb7",
  "subject": {
    "type": "STAFF",
    "id": "d1292ae1-fa51-44ba-9131-a1cc8a246d3b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMTI5MmFlMS1mYTUxLTQ0YmEtOTEzMS1hMWNjOGEyNDZkM2IiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAwNTYsImlhdCI6MTc5MzE5OTE1NiwianRpIjoiYTFmYjUxZDMtZjIyYy00M2Q4LWEwNzgtNTNkMDNkYjRhYzI5Iiwic2lkIjoiOTNhZjhlOTAtZjcxOC00MTExLTk2MjAtMDU1NTFjMzY5ZmI3In0.DYtjwLnQV_OvNAJYGw03sN5OHa6Dr_7nh7DZzDA2jrI",
  "access_expires_at": "2026-10-28T15:07:36.74247537Z",
  "refresh_token": "0OwXgh_QN2cF3IWDBzSMibbVuLGGB2HR-639-xZpWdM",
  "refresh_expires_at": "2026-10-29T02:52:36.741874468Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "03f6b646-cebf-4ec2-b700-1bdc9db51207",
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
  "id": "d545fa32-8d24-4292-a3b4-b1d307b92e18",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:57:37.019619Z",
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
  "command_id": "b91c8d8e-fc15-49ac-ab8d-ed4c29f6516f",
  "quote_id": "d545fa32-8d24-4292-a3b4-b1d307b92e18",
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
  "id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
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
  "created_at": "2026-10-28T14:52:37.320242Z",
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
    "id": "4fba1d58-3f59-4731-86f4-8965e41d8292",
    "order_id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
    "expires_at": "2026-10-28T14:52:52.323737Z",
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

`POST /api/driver/v1/offers/4fba1d58-3f59-4731-86f4-8965e41d8292/accept` → **200**

```json
{
  "command_id": "bc8dd817-d764-4ac8-b3cf-133c94773c75"
}
```

```json
{
  "id": "f9c4656d-f52a-47ac-80f9-fbe14d65095c",
  "order_id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3b3db290-6d5d-4ac7-aac7-2025fde70920",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3b3db290-6d5d-4ac7-aac7-2025fde70920",
  "order_id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
  "assignment_id": "f9c4656d-f52a-47ac-80f9-fbe14d65095c",
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

`POST /api/driver/v1/work-sessions/c3340fe5-3c55-45a2-85c1-92cceb5434cb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:52:38Z",
    "sequence": 1793199158772
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c3340fe5-3c55-45a2-85c1-92cceb5434cb",
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
  "last_heartbeat_at": "2026-10-28T14:52:38.792341Z",
  "last_location_at": "2026-10-28T14:52:38.792341Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3b3db290-6d5d-4ac7-aac7-2025fde70920/arrive` → **200**

```json
{
  "command_id": "8a7fa318-dde1-4753-acb0-5cababf6f4eb",
  "expected_version": 0
}
```

```json
{
  "id": "3b3db290-6d5d-4ac7-aac7-2025fde70920",
  "order_id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
  "assignment_id": "f9c4656d-f52a-47ac-80f9-fbe14d65095c",
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
  "arrived_at": "2026-10-28T14:52:39.095508Z",
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

`POST /api/driver/v1/trips/3b3db290-6d5d-4ac7-aac7-2025fde70920/start` → **200**

```json
{
  "command_id": "58feace6-f168-4fac-a9b8-18db80d540e4",
  "expected_version": 1
}
```

```json
{
  "id": "3b3db290-6d5d-4ac7-aac7-2025fde70920",
  "order_id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
  "assignment_id": "f9c4656d-f52a-47ac-80f9-fbe14d65095c",
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
  "arrived_at": "2026-10-28T14:52:39.095508Z",
  "started_at": "2026-10-28T14:52:39.381002Z",
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

`POST /api/driver/v1/trips/3b3db290-6d5d-4ac7-aac7-2025fde70920/complete` → **200**

```json
{
  "command_id": "3acf9b3d-9ec1-4df6-8c52-261a872e119e",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:52:39Z",
  "cash_received": true
}
```

```json
{
  "id": "3b3db290-6d5d-4ac7-aac7-2025fde70920",
  "order_id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
  "assignment_id": "f9c4656d-f52a-47ac-80f9-fbe14d65095c",
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
  "arrived_at": "2026-10-28T14:52:39.095508Z",
  "started_at": "2026-10-28T14:52:39.381002Z",
  "completed_at": "2026-10-28T14:52:39.669337Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/eade8585-5bf5-46cb-b567-29948ffe9dc2` → **200**

```json
{
  "id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
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
    "id": "f9c4656d-f52a-47ac-80f9-fbe14d65095c",
    "order_id": "eade8585-5bf5-46cb-b567-29948ffe9dc2",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3b3db290-6d5d-4ac7-aac7-2025fde70920",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:52:37.320242Z",
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
  "session_id": "0603322e-1ebc-4f07-9af7-7900b4f6bd19",
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
  "last_heartbeat_at": "2026-10-28T14:52:35.611311Z",
  "last_location_at": "2026-10-28T14:52:35.611311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0603322e-1ebc-4f07-9af7-7900b4f6bd19/close` → **200**

```json
{
  "command_id": "20c7c0f9-ab82-4778-91b1-dfc48853fa38",
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
  "session_id": "c3340fe5-3c55-45a2-85c1-92cceb5434cb",
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
  "last_heartbeat_at": "2026-10-28T14:52:38.792341Z",
  "last_location_at": "2026-10-28T14:52:38.792341Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c3340fe5-3c55-45a2-85c1-92cceb5434cb/close` → **200**

```json
{
  "command_id": "e4359398-c8e9-4311-a778-2d701aaa4196",
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

Done: terminal order eade8585-5bf5-46cb-b567-29948ffe9dc2 by Andrii (5a000000-0000-4000-8000-000000000403).
